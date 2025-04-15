/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Drop#getDefault_value_drop <em>Default value drop</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getDrop()
 * @model
 * @generated
 */
public interface Drop extends OneHot_Argumans {
	/**
	 * Returns the value of the '<em><b>Default value drop</b></em>' attribute.
	 * The literals are from the enumeration {@link mLmodel.OneHot_Drop_Arg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default value drop</em>' attribute.
	 * @see mLmodel.OneHot_Drop_Arg
	 * @see #setDefault_value_drop(OneHot_Drop_Arg)
	 * @see mLmodel.MLmodelPackage#getDrop_Default_value_drop()
	 * @model
	 * @generated
	 */
	OneHot_Drop_Arg getDefault_value_drop();

	/**
	 * Sets the value of the '{@link mLmodel.Drop#getDefault_value_drop <em>Default value drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default value drop</em>' attribute.
	 * @see mLmodel.OneHot_Drop_Arg
	 * @see #getDefault_value_drop()
	 * @generated
	 */
	void setDefault_value_drop(OneHot_Drop_Arg value);

} // Drop
