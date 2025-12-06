/**
 */
package mLmodel.impl;

import java.util.Collection;

import mLmodel.MLmodelPackage;
import mLmodel.MQTT;
import mLmodel.Topic;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MQTT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.MQTTImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link mLmodel.impl.MQTTImpl#getMQTT_BROKER <em>MQTT BROKER</em>}</li>
 *   <li>{@link mLmodel.impl.MQTTImpl#getMQTT_PORT <em>MQTT PORT</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MQTTImpl extends MinimalEObjectImpl.Container implements MQTT {
	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected EList<Topic> topic;

	/**
	 * The default value of the '{@link #getMQTT_BROKER() <em>MQTT BROKER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMQTT_BROKER()
	 * @generated
	 * @ordered
	 */
	protected static final String MQTT_BROKER_EDEFAULT = "localhost";

	/**
	 * The cached value of the '{@link #getMQTT_BROKER() <em>MQTT BROKER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMQTT_BROKER()
	 * @generated
	 * @ordered
	 */
	protected String mqtT_BROKER = MQTT_BROKER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMQTT_PORT() <em>MQTT PORT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMQTT_PORT()
	 * @generated
	 * @ordered
	 */
	protected static final int MQTT_PORT_EDEFAULT = 1883;

	/**
	 * The cached value of the '{@link #getMQTT_PORT() <em>MQTT PORT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMQTT_PORT()
	 * @generated
	 * @ordered
	 */
	protected int mqtT_PORT = MQTT_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MQTTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.MQTT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Topic> getTopic() {
		if (topic == null) {
			topic = new EObjectContainmentEList<Topic>(Topic.class, this, MLmodelPackage.MQTT__TOPIC);
		}
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMQTT_BROKER() {
		return mqtT_BROKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMQTT_BROKER(String newMQTT_BROKER) {
		String oldMQTT_BROKER = mqtT_BROKER;
		mqtT_BROKER = newMQTT_BROKER;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.MQTT__MQTT_BROKER, oldMQTT_BROKER,
					mqtT_BROKER));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMQTT_PORT() {
		return mqtT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMQTT_PORT(int newMQTT_PORT) {
		int oldMQTT_PORT = mqtT_PORT;
		mqtT_PORT = newMQTT_PORT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.MQTT__MQTT_PORT, oldMQTT_PORT,
					mqtT_PORT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MLmodelPackage.MQTT__TOPIC:
			return ((InternalEList<?>) getTopic()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.MQTT__TOPIC:
			return getTopic();
		case MLmodelPackage.MQTT__MQTT_BROKER:
			return getMQTT_BROKER();
		case MLmodelPackage.MQTT__MQTT_PORT:
			return getMQTT_PORT();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MLmodelPackage.MQTT__TOPIC:
			getTopic().clear();
			getTopic().addAll((Collection<? extends Topic>) newValue);
			return;
		case MLmodelPackage.MQTT__MQTT_BROKER:
			setMQTT_BROKER((String) newValue);
			return;
		case MLmodelPackage.MQTT__MQTT_PORT:
			setMQTT_PORT((Integer) newValue);
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
		case MLmodelPackage.MQTT__TOPIC:
			getTopic().clear();
			return;
		case MLmodelPackage.MQTT__MQTT_BROKER:
			setMQTT_BROKER(MQTT_BROKER_EDEFAULT);
			return;
		case MLmodelPackage.MQTT__MQTT_PORT:
			setMQTT_PORT(MQTT_PORT_EDEFAULT);
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
		case MLmodelPackage.MQTT__TOPIC:
			return topic != null && !topic.isEmpty();
		case MLmodelPackage.MQTT__MQTT_BROKER:
			return MQTT_BROKER_EDEFAULT == null ? mqtT_BROKER != null : !MQTT_BROKER_EDEFAULT.equals(mqtT_BROKER);
		case MLmodelPackage.MQTT__MQTT_PORT:
			return mqtT_PORT != MQTT_PORT_EDEFAULT;
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
		result.append(" (MQTT_BROKER: ");
		result.append(mqtT_BROKER);
		result.append(", MQTT_PORT: ");
		result.append(mqtT_PORT);
		result.append(')');
		return result.toString();
	}

} //MQTTImpl
