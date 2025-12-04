/**
 */
package mLmodel.impl;

import mLmodel.MLmodelPackage;
import mLmodel.Topic;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.TopicImpl#getMQTT_CONTROL_TOPIC <em>MQTT CONTROL TOPIC</em>}</li>
 *   <li>{@link mLmodel.impl.TopicImpl#getMQTT_SENSOR_TOPIC <em>MQTT SENSOR TOPIC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopicImpl extends MinimalEObjectImpl.Container implements Topic {
	/**
	 * The default value of the '{@link #getMQTT_CONTROL_TOPIC() <em>MQTT CONTROL TOPIC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMQTT_CONTROL_TOPIC()
	 * @generated
	 * @ordered
	 */
	protected static final String MQTT_CONTROL_TOPIC_EDEFAULT = "control/mode";

	/**
	 * The cached value of the '{@link #getMQTT_CONTROL_TOPIC() <em>MQTT CONTROL TOPIC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMQTT_CONTROL_TOPIC()
	 * @generated
	 * @ordered
	 */
	protected String mqtT_CONTROL_TOPIC = MQTT_CONTROL_TOPIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getMQTT_SENSOR_TOPIC() <em>MQTT SENSOR TOPIC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMQTT_SENSOR_TOPIC()
	 * @generated
	 * @ordered
	 */
	protected static final String MQTT_SENSOR_TOPIC_EDEFAULT = "sensors/+/value";

	/**
	 * The cached value of the '{@link #getMQTT_SENSOR_TOPIC() <em>MQTT SENSOR TOPIC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMQTT_SENSOR_TOPIC()
	 * @generated
	 * @ordered
	 */
	protected String mqtT_SENSOR_TOPIC = MQTT_SENSOR_TOPIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.TOPIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMQTT_CONTROL_TOPIC() {
		return mqtT_CONTROL_TOPIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMQTT_CONTROL_TOPIC(String newMQTT_CONTROL_TOPIC) {
		String oldMQTT_CONTROL_TOPIC = mqtT_CONTROL_TOPIC;
		mqtT_CONTROL_TOPIC = newMQTT_CONTROL_TOPIC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.TOPIC__MQTT_CONTROL_TOPIC,
					oldMQTT_CONTROL_TOPIC, mqtT_CONTROL_TOPIC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMQTT_SENSOR_TOPIC() {
		return mqtT_SENSOR_TOPIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMQTT_SENSOR_TOPIC(String newMQTT_SENSOR_TOPIC) {
		String oldMQTT_SENSOR_TOPIC = mqtT_SENSOR_TOPIC;
		mqtT_SENSOR_TOPIC = newMQTT_SENSOR_TOPIC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.TOPIC__MQTT_SENSOR_TOPIC,
					oldMQTT_SENSOR_TOPIC, mqtT_SENSOR_TOPIC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.TOPIC__MQTT_CONTROL_TOPIC:
			return getMQTT_CONTROL_TOPIC();
		case MLmodelPackage.TOPIC__MQTT_SENSOR_TOPIC:
			return getMQTT_SENSOR_TOPIC();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MLmodelPackage.TOPIC__MQTT_CONTROL_TOPIC:
			setMQTT_CONTROL_TOPIC((String) newValue);
			return;
		case MLmodelPackage.TOPIC__MQTT_SENSOR_TOPIC:
			setMQTT_SENSOR_TOPIC((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MLmodelPackage.TOPIC__MQTT_CONTROL_TOPIC:
			setMQTT_CONTROL_TOPIC(MQTT_CONTROL_TOPIC_EDEFAULT);
			return;
		case MLmodelPackage.TOPIC__MQTT_SENSOR_TOPIC:
			setMQTT_SENSOR_TOPIC(MQTT_SENSOR_TOPIC_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MLmodelPackage.TOPIC__MQTT_CONTROL_TOPIC:
			return MQTT_CONTROL_TOPIC_EDEFAULT == null ? mqtT_CONTROL_TOPIC != null
					: !MQTT_CONTROL_TOPIC_EDEFAULT.equals(mqtT_CONTROL_TOPIC);
		case MLmodelPackage.TOPIC__MQTT_SENSOR_TOPIC:
			return MQTT_SENSOR_TOPIC_EDEFAULT == null ? mqtT_SENSOR_TOPIC != null
					: !MQTT_SENSOR_TOPIC_EDEFAULT.equals(mqtT_SENSOR_TOPIC);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (MQTT_CONTROL_TOPIC: ");
		result.append(mqtT_CONTROL_TOPIC);
		result.append(", MQTT_SENSOR_TOPIC: ");
		result.append(mqtT_SENSOR_TOPIC);
		result.append(')');
		return result.toString();
	}

} //TopicImpl
