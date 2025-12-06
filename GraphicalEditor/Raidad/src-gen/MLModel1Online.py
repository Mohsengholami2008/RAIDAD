import json
import time
import csv
from pathlib import Path
from typing import Dict, Tuple, Optional, List, Union

import numpy as np
import paho.mqtt.client as mqtt

from sklearn.linear_model import SGDClassifier, PassiveAggressiveClassifier
import logging

# =============================
# General Settings
# =============================

MQTT_BROKER = "localhost"
MQTT_PORT = 1883

# Sensor data topic (devices send values here)
MQTT_SENSOR_TOPIC = "sensors/+/value"   # sensors/dev1/value, sensors/dev2/value, ...
# Mode control topic (TRAIN / TEST)
MQTT_CONTROL_TOPIC = "control/mode"

# Required devices in each row (in this order)
REQUIRED_DEVICES = ["dev1", "dev2"]

# Slot size in seconds for building one row
SLOT_SIZE_SECONDS = 5

# Number of initial rows for TRAIN phase (automatic switch)
TRAIN_ROW_LIMIT = 100

# Classes of the problem (e.g., binary: 0,1)
CLASSES = np.array([0, 1])

# CSV path for logging metrics
METRICS_CSV_PATH = Path("metrics_log.csv")

# Log metrics every N rows
METRICS_LOG_EVERY = 1

# Valid range for sensor values (for clipping)
SENSOR_VALUE_MIN = -1e3
SENSOR_VALUE_MAX = 1e6

# -----------------------------
# Model configuration using Pipeline
# -----------------------------
MODEL_CONFIG = {
    "preprocess_steps": ["diffs"],  # یا مثلاً ["clean", "diffs"]
    "model_type": "pa",
}

# =============================
# Logging
# =============================

logging.basicConfig(
    level=logging.INFO,
    format="%(asctime)s [%(levelname)s] %(message)s",
)

# =============================
# RowBuffer: collect messages inside each time slot
# =============================

class RowBuffer:
    """
    Holder for all device messages within a time slot.
    In each slot, exactly one message from each device must arrive → when complete, one row is formed.
    """

    def __init__(self, slot_id: int):
        self.slot_id = slot_id
        self.messages: Dict[str, dict] = {}  # device_id -> data dict

    def add_message(self, device_id: str, data: dict) -> None:
        self.messages[device_id] = data

    def is_complete(self) -> bool:
        return all(d in self.messages for d in REQUIRED_DEVICES)

    def build_row(self) -> Tuple[np.ndarray, Optional[int]]:
        """
        Output:
          X_row: numpy array of feature values in REQUIRED_DEVICES order
          label: class label (if available), otherwise None
        """
        values = []
        label = None

        for dev in REQUIRED_DEVICES:
            msg = self.messages.get(dev)
            if msg is None:
                values.append(np.nan)
                continue

            val = msg.get("value")
            if val is None:
                values.append(np.nan)
            else:
                values.append(float(val))

            if label is None and "label" in msg and msg["label"] is not None:
                try:
                    label = int(msg["label"])
                except (TypeError, ValueError):
                    pass

        X_row = np.array(values, dtype=float)
        return X_row, label

# =============================
# Preprocessor: pipeline of preprocessing stages
# =============================

class Preprocessor:
    """
    Preprocessing pipeline:
      Supported steps:
        - "clean"  : basic cleaning (NaN, clip, etc.)
        - "diffs"  : add pairwise feature differences
    """

    def __init__(self, steps: Union[str, List[str]]):
        if isinstance(steps, str):
            steps = [steps]
        self.steps: List[str] = [s.lower() for s in steps]

    def _clean_basic(self, X_row: np.ndarray) -> np.ndarray:
        X = X_row.astype(float).copy()

        # اگر همه NaN باشند، صفر کن
        if np.all(np.isnan(X)):
            X[:] = 0.0
            return X

        # اگر بعضی NaN باشند، با میانگین بقیه پر کن
        nan_mask = np.isnan(X)
        if np.any(nan_mask):
            mean_val = np.nanmean(X)
            X[nan_mask] = mean_val

        # کلیپ کردن روی بازه معقول سنسور
        X = np.clip(X, SENSOR_VALUE_MIN, SENSOR_VALUE_MAX)
        return X

    def _add_diffs(self, X: np.ndarray) -> np.ndarray:
        """
        اضافه کردن اختلاف همه جفت ویژگی‌ها.
        اگر دو دستگاه داریم: [dev1, dev2] → ویژگی جدید: dev1 - dev2
        """
        n = X.shape[0]
        if n < 2:
            return X

        diffs = []
        for i in range(n):
            for j in range(i + 1, n):
                diffs.append(X[i] - X[j])

        diffs = np.array(diffs, dtype=float)
        return np.concatenate([X, diffs])

    def transform(self, X_row: np.ndarray) -> np.ndarray:
        X = X_row.astype(float).copy()

        for step in self.steps:
            s = step.lower()

            if s == "clean":
                X = self._clean_basic(X)
                continue

            if s == "diffs":
                X = self._add_diffs(X)
                continue

            logging.warning(f"Unknown preprocessing step: {step}")

        return X

# =============================
# Build classifier from model type
# =============================

def build_classifier(model_type: str):
    mt = model_type.lower()

    if mt == "pa":
        return PassiveAggressiveClassifier(random_state=0)

    else:
        logging.warning(f"Unknown MODEL_TYPE: {model_type}, using logistic_sgd.")
        return SGDClassifier(
            loss="log_loss",
            learning_rate="optimal",
            random_state=0
        )

# =============================
# OnlineModelManager
# =============================

class OnlineModelManager:
    """
    Online model manager (Preprocessor + Classifier) using partial_fit,
    manages TRAIN/TEST state and logs metrics.
    """

    def __init__(self, model_config: dict):
        preprocess_steps_cfg = model_config.get("preprocess_steps", ["clean"])
        model_type = model_config.get("model_type", "logistic_sgd")

        if isinstance(preprocess_steps_cfg, str):
            preprocess_steps_cfg = [preprocess_steps_cfg]

        steps_lower = [s.lower() for s in preprocess_steps_cfg]

        self.preproc = Preprocessor(steps_lower)
        self.clf = build_classifier(model_type)
        self.model_initialized = False

        self.mode = "TRAIN"
        self.train_rows_seen = 0

        self.test_total = 0
        self.test_correct = 0

        self._init_metrics_csv()

        logging.info(
            f"Initialized OnlineModelManager with MODEL_TYPE={model_type}, "
            f"PREPROCESS_STEPS={steps_lower}"
        )

    def _init_metrics_csv(self) -> None:
        if not METRICS_CSV_PATH.exists():
            with METRICS_CSV_PATH.open("w", newline="", encoding="utf-8") as f:
                writer = csv.writer(f)
                writer.writerow([
                    "timestamp",
                    "phase",
                    "slot_id",
                    "row_index",
                    "label",
                    "prediction",
                    "correct",
                    "cumulative_accuracy"
                ])

    def _append_metrics(
        self,
        phase: str,
        slot_id: int,
        row_index: int,
        label: Optional[int],
        prediction: Optional[int]
    ) -> None:
        correct_flag = None
        if label is not None and prediction is not None:
            self.test_total += 1
            if prediction == label:
                self.test_correct += 1
            correct_flag = int(prediction == label)
            acc = self.test_correct / self.test_total
        else:
            acc = self.test_correct / self.test_total if self.test_total > 0 else 0.0

        with METRICS_CSV_PATH.open("a", newline="", encoding="utf-8") as f:
            writer = csv.writer(f)
            writer.writerow([
                time.time(),
                phase,
                slot_id,
                row_index,
                label,
                prediction,
                correct_flag,
                acc
            ])

    def process_row(self, slot_id: int, X_row: np.ndarray, label: Optional[int]) -> None:
        X_pre = self.preproc.transform(X_row)
        X_2d = X_pre.reshape(1, -1)

        if self.mode == "TRAIN":
            self._train_step(slot_id, X_2d, label)
        else:
            self._test_step(slot_id, X_2d, label)

    def _train_step(self, slot_id: int, X_2d: np.ndarray, label: Optional[int]) -> None:
        if label is None:
            logging.warning("In TRAIN mode but no label provided; skipping training step.")
            X_in = X_2d
            if self.model_initialized:
                y_pred = self.clf.predict(X_in)[0]
                logging.info(f"[TRAIN/no-label] Slot={slot_id} Pred={y_pred}")
            return

        X_in = X_2d

        y_arr = np.array([label])
        if not self.model_initialized:
            self.clf.partial_fit(X_in, y_arr, classes=CLASSES)
            self.model_initialized = True
            logging.info("Model initialized with first partial_fit.")
        else:
            self.clf.partial_fit(X_in, y_arr)

        y_pred = self.clf.predict(X_in)[0]
        self.train_rows_seen += 1
        logging.info(
            f"[TRAIN] row #{self.train_rows_seen} | Slot={slot_id} "
            f"true={label}, pred={y_pred}"
        )

        if self.train_rows_seen % METRICS_LOG_EVERY == 0:
            self._append_metrics(
                phase="TRAIN",
                slot_id=slot_id,
                row_index=self.train_rows_seen,
                label=label,
                prediction=y_pred,
            )

        if self.train_rows_seen >= TRAIN_ROW_LIMIT:
            self.mode = "TEST"
            logging.info(
                f"TRAIN phase finished after {self.train_rows_seen} rows. "
                f"Switched to TEST mode (auto)."
            )

    def _test_step(self, slot_id: int, X_2d: np.ndarray, label: Optional[int]) -> None:
        if not self.model_initialized:
            logging.warning("Model not initialized; cannot predict.")
            return

        X_in = X_2d
        y_pred = self.clf.predict(X_in)[0]

        logging.info(f"[TEST] Slot={slot_id} pred={y_pred}, true_label={label}")

        self._append_metrics(
            phase="TEST",
            slot_id=slot_id,
            row_index=self.train_rows_seen + self.test_total + 1,
            label=label,
            prediction=y_pred,
        )

    def set_mode(self, new_mode: str, reason: str = "") -> None:
        new_mode = new_mode.upper()
        if new_mode not in ("TRAIN", "TEST"):
            logging.warning(f"Invalid mode request: {new_mode}")
            return
        self.mode = new_mode
        logging.info(f"Mode changed to {self.mode} ({reason})")

# =============================
# Slot management
# =============================

slots: Dict[int, RowBuffer] = {}

def compute_slot_id(timestamp: float) -> int:
    return int(timestamp // SLOT_SIZE_SECONDS)

def get_or_create_row_buffer(slot_id: int) -> RowBuffer:
    if slot_id not in slots:
        slots[slot_id] = RowBuffer(slot_id)
    return slots[slot_id]

def remove_old_slots(current_slot_id: int, max_age_slots: int = 10) -> None:
    to_delete = [sid for sid in slots if sid < current_slot_id - max_age_slots]
    for sid in to_delete:
        del slots[sid]

# =============================
# MQTT callbacks
# =============================

model_manager = OnlineModelManager(MODEL_CONFIG)

def on_connect(client, userdata, flags, rc):
    if rc == 0:
        logging.info("Connected to MQTT broker.")
    else:
        logging.error(f"Failed to connect to MQTT broker. rc={rc}")

    client.subscribe(MQTT_SENSOR_TOPIC)
    logging.info(f"Subscribed to sensors topic: {MQTT_SENSOR_TOPIC}")

    client.subscribe(MQTT_CONTROL_TOPIC)
    logging.info(f"Subscribed to control topic: {MQTT_CONTROL_TOPIC}")

def on_message(client, userdata, msg):
    try:
        payload = msg.payload.decode("utf-8")

        # کنترل مود TRAIN/TEST
        if msg.topic == MQTT_CONTROL_TOPIC:
            mode_cmd = payload.strip().upper()
            if mode_cmd in ("TRAIN", "TEST"):
                model_manager.set_mode(mode_cmd, reason="by MQTT control/mode")
            else:
                logging.warning(f"Unknown control command on {MQTT_CONTROL_TOPIC}: {payload}")
            return

        # پیام سنسورها
        data = json.loads(payload)

        device_id = data.get("device_id")
        if device_id is None:
            logging.warning("Received message without device_id; ignoring.")
            return

        ts = float(data.get("timestamp", time.time()))
        slot_id = compute_slot_id(ts)

        row_buffer = get_or_create_row_buffer(slot_id)
        row_buffer.add_message(device_id, data)

        remove_old_slots(slot_id)

        if row_buffer.is_complete():
            X_row, label = row_buffer.build_row()
            logging.info(
                f"[Slot {slot_id}] NEW ROW | mode={model_manager.mode} | "
                f"X={X_row}, label={label}"
            )

            model_manager.process_row(slot_id, X_row, label)

            if slot_id in slots:
                del slots[slot_id]

    except Exception as e:
        logging.exception(f"Error in on_message: {e}")

# =============================
# main
# =============================

def main():
    client = mqtt.Client()
    client.on_connect = on_connect
    client.on_message = on_message

    logging.info("Connecting to MQTT broker...")
    client.connect(MQTT_BROKER, MQTT_PORT, keepalive=60)

    logging.info("MQTT client started. Waiting for messages...")
    client.loop_forever()

if __name__ == "__main__":
    main()
