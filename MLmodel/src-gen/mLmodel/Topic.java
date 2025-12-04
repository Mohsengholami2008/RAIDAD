/**
 */
package mLmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Topic#getMQTT_CONTROL_TOPIC <em>MQTT CONTROL TOPIC</em>}</li>
 *   <li>{@link mLmodel.Topic#getMQTT_SENSOR_TOPIC <em>MQTT SENSOR TOPIC</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getTopic()
 * @model
 * @generated
 */
public interface Topic extends EObject {
	/**
	 * Returns the value of the '<em><b>MQTT CONTROL TOPIC</b></em>' attribute.
	 * The default value is <code>"control/mode"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MQTT CONTROL TOPIC</em>' attribute.
	 * @see #setMQTT_CONTROL_TOPIC(String)
	 * @see mLmodel.MLmodelPackage#getTopic_MQTT_CONTROL_TOPIC()
	 * @model default="control/mode" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getMQTT_CONTROL_TOPIC();

	/**
	 * Sets the value of the '{@link mLmodel.Topic#getMQTT_CONTROL_TOPIC <em>MQTT CONTROL TOPIC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MQTT CONTROL TOPIC</em>' attribute.
	 * @see #getMQTT_CONTROL_TOPIC()
	 * @generated
	 */
	void setMQTT_CONTROL_TOPIC(String value);

	/**
	 * Returns the value of the '<em><b>MQTT SENSOR TOPIC</b></em>' attribute.
	 * The default value is <code>"sensors/+/value"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MQTT SENSOR TOPIC</em>' attribute.
	 * @see #setMQTT_SENSOR_TOPIC(String)
	 * @see mLmodel.MLmodelPackage#getTopic_MQTT_SENSOR_TOPIC()
	 * @model default="sensors/+/value" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getMQTT_SENSOR_TOPIC();

	/**
	 * Sets the value of the '{@link mLmodel.Topic#getMQTT_SENSOR_TOPIC <em>MQTT SENSOR TOPIC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MQTT SENSOR TOPIC</em>' attribute.
	 * @see #getMQTT_SENSOR_TOPIC()
	 * @generated
	 */
	void setMQTT_SENSOR_TOPIC(String value);

} // Topic
