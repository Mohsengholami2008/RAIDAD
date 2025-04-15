/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sparse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Sparse#isDefault_value_sparse <em>Default value sparse</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getSparse()
 * @model
 * @generated
 */
public interface Sparse extends OneHot_Argumans {
	/**
	 * Returns the value of the '<em><b>Default value sparse</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default value sparse</em>' attribute.
	 * @see #setDefault_value_sparse(boolean)
	 * @see mLmodel.MLmodelPackage#getSparse_Default_value_sparse()
	 * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isDefault_value_sparse();

	/**
	 * Sets the value of the '{@link mLmodel.Sparse#isDefault_value_sparse <em>Default value sparse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default value sparse</em>' attribute.
	 * @see #isDefault_value_sparse()
	 * @generated
	 */
	void setDefault_value_sparse(boolean value);

} // Sparse
