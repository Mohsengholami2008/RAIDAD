/**
 */
package mLmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.CommunicationProtocol#getBuffer <em>Buffer</em>}</li>
 *   <li>{@link mLmodel.CommunicationProtocol#getMqtt <em>Mqtt</em>}</li>
 *   <li>{@link mLmodel.CommunicationProtocol#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getCommunicationProtocol()
 * @model
 * @generated
 */
public interface CommunicationProtocol extends Import_Data {
	/**
	 * Returns the value of the '<em><b>Buffer</b></em>' containment reference list.
	 * The list contents are of type {@link mLmodel.Buffer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer</em>' containment reference list.
	 * @see mLmodel.MLmodelPackage#getCommunicationProtocol_Buffer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Buffer> getBuffer();

	/**
	 * Returns the value of the '<em><b>Mqtt</b></em>' containment reference list.
	 * The list contents are of type {@link mLmodel.MQTT}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mqtt</em>' containment reference list.
	 * @see mLmodel.MLmodelPackage#getCommunicationProtocol_Mqtt()
	 * @model containment="true"
	 * @generated
	 */
	EList<MQTT> getMqtt();

	/**
	 * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
	 * The list contents are of type {@link mLmodel.Devices}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' containment reference list.
	 * @see mLmodel.MLmodelPackage#getCommunicationProtocol_Devices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Devices> getDevices();

} // CommunicationProtocol
