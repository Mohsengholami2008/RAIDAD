/**
 */
package mLmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Devices</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Devices#getREQUIRED_DEVICES <em>REQUIRED DEVICES</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getDevices()
 * @model
 * @generated
 */
public interface Devices extends EObject {

	/**
	 * Returns the value of the '<em><b>REQUIRED DEVICES</b></em>' attribute.
	 * The default value is <code>"dev"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>REQUIRED DEVICES</em>' attribute.
	 * @see #setREQUIRED_DEVICES(String)
	 * @see mLmodel.MLmodelPackage#getDevices_REQUIRED_DEVICES()
	 * @model default="dev" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getREQUIRED_DEVICES();

	/**
	 * Sets the value of the '{@link mLmodel.Devices#getREQUIRED_DEVICES <em>REQUIRED DEVICES</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>REQUIRED DEVICES</em>' attribute.
	 * @see #getREQUIRED_DEVICES()
	 * @generated
	 */
	void setREQUIRED_DEVICES(String value);
} // Devices
