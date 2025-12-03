/**
 */
package mLmodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MQTT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.MQTT#getMQTT_BROKER <em>MQTT BROKER</em>}</li>
 *   <li>{@link mLmodel.MQTT#getMQTT_PORT <em>MQTT PORT</em>}</li>
 *   <li>{@link mLmodel.MQTT#getTopic <em>Topic</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getMQTT()
 * @model
 * @generated
 */
public interface MQTT extends EObject {

	/**
	 * Returns the value of the '<em><b>MQTT BROKER</b></em>' attribute.
	 * The default value is <code>"localhost"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MQTT BROKER</em>' attribute.
	 * @see #setMQTT_BROKER(String)
	 * @see mLmodel.MLmodelPackage#getMQTT_MQTT_BROKER()
	 * @model default="localhost" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getMQTT_BROKER();

	/**
	 * Sets the value of the '{@link mLmodel.MQTT#getMQTT_BROKER <em>MQTT BROKER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MQTT BROKER</em>' attribute.
	 * @see #getMQTT_BROKER()
	 * @generated
	 */
	void setMQTT_BROKER(String value);

	/**
	 * Returns the value of the '<em><b>MQTT PORT</b></em>' attribute.
	 * The default value is <code>"1883"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MQTT PORT</em>' attribute.
	 * @see #setMQTT_PORT(int)
	 * @see mLmodel.MLmodelPackage#getMQTT_MQTT_PORT()
	 * @model default="1883" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getMQTT_PORT();

	/**
	 * Sets the value of the '{@link mLmodel.MQTT#getMQTT_PORT <em>MQTT PORT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MQTT PORT</em>' attribute.
	 * @see #getMQTT_PORT()
	 * @generated
	 */
	void setMQTT_PORT(int value);

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' containment reference list.
	 * The list contents are of type {@link mLmodel.Topic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' containment reference list.
	 * @see mLmodel.MLmodelPackage#getMQTT_Topic()
	 * @model containment="true"
	 * @generated
	 */
	EList<Topic> getTopic();
} // MQTT
