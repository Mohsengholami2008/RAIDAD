/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categories</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Categories#getDefault_value_cat <em>Default value cat</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getCategories()
 * @model
 * @generated
 */
public interface Categories extends OneHot_Argumans {
	/**
	 * Returns the value of the '<em><b>Default value cat</b></em>' attribute.
	 * The literals are from the enumeration {@link mLmodel.OneHot_Cat_Arg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default value cat</em>' attribute.
	 * @see mLmodel.OneHot_Cat_Arg
	 * @see #setDefault_value_cat(OneHot_Cat_Arg)
	 * @see mLmodel.MLmodelPackage#getCategories_Default_value_cat()
	 * @model
	 * @generated
	 */
	OneHot_Cat_Arg getDefault_value_cat();

	/**
	 * Sets the value of the '{@link mLmodel.Categories#getDefault_value_cat <em>Default value cat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default value cat</em>' attribute.
	 * @see mLmodel.OneHot_Cat_Arg
	 * @see #getDefault_value_cat()
	 * @generated
	 */
	void setDefault_value_cat(OneHot_Cat_Arg value);

} // Categories
