/**
 */
package mLmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.ProtocolBinding#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link mLmodel.ProtocolBinding#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getProtocolBinding()
 * @model
 * @generated
 */
public interface ProtocolBinding extends EObject {

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link mLmodel.ProtocolBindingEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see mLmodel.ProtocolBindingEnum
	 * @see #setProtocol(ProtocolBindingEnum)
	 * @see mLmodel.MLmodelPackage#getProtocolBinding_Protocol()
	 * @model
	 * @generated
	 */
	ProtocolBindingEnum getProtocol();

	/**
	 * Sets the value of the '{@link mLmodel.ProtocolBinding#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see mLmodel.ProtocolBindingEnum
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(ProtocolBindingEnum value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' attribute.
	 * @see #setEndpoint(String)
	 * @see mLmodel.MLmodelPackage#getProtocolBinding_Endpoint()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getEndpoint();

	/**
	 * Sets the value of the '{@link mLmodel.ProtocolBinding#getEndpoint <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' attribute.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(String value);
} // ProtocolBinding
