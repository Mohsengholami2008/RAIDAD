/**
 */
package mLmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Set_Role#getName <em>Name</em>}</li>
 *   <li>{@link mLmodel.Set_Role#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getSet_Role()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Set_Role extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Variable"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mLmodel.MLmodelPackage#getSet_Role_Name()
	 * @model default="Variable" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mLmodel.Set_Role#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mLmodel.Attribiutes_Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mLmodel.Attribiutes_Type
	 * @see #setType(Attribiutes_Type)
	 * @see mLmodel.MLmodelPackage#getSet_Role_Type()
	 * @model
	 * @generated
	 */
	Attribiutes_Type getType();

	/**
	 * Sets the value of the '{@link mLmodel.Set_Role#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mLmodel.Attribiutes_Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Attribiutes_Type value);

} // Set_Role
