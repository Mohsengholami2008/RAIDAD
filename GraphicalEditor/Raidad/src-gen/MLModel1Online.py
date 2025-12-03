

import json
import time
import csv
from pathlib import Path

from typing import Dict
from typing import Tuple
from typing import Optional

import numpy as np

import paho.mqtt.client as mqtt

from sklearn.preprocessing import StandardScaler, PolynomialFeatures
from sklearn.linear_model import SGDClassifier, PassiveAggressiveClassifier, Perceptron


from sklearn.linear_model import PassiveAggressiveClassifier


import logging




MQTT_BROKER = "localhost"
MQTT_PORT = "1883"



MQTT_SENSOR_TOPIC = "control/mode"   
MQTT_CONTROL_TOPIC = "sensors/+/value"  



REQUIRED_DEVICES = ["Dev1", "Dev2", "Dev3"]

SLOT_SIZE_SECONDS = 5

TRAIN_ROW_LIMIT = 100

CLASSES = np.array([0, 1])

METRICS_CSV_PATH = Path("metrics_log.csv")

METRICS_LOG_EVERY = 1  

SENSOR_VALUE_MIN = -1e3
SENSOR_VALUE_MAX = 1e6

ROBUST_BUFFER_MAX_ROWS = 500












MODEL_CONFIG = {

	"preprocess_steps": ["normalize"],
    "model_type": "PassiveAggressiveClassifier",
}


