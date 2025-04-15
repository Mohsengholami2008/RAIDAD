/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Missing Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Missing_Values#getDefault_value_si_miss <em>Default value si miss</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getMissing_Values()
 * @model
 * @generated
 */
public interface Missing_Values extends Simple_Imputer_Arguments {
	/**
	 * Returns the value of the '<em><b>Default value si miss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default value si miss</em>' attribute.
	 * @see #setDefault_value_si_miss(String)
	 * @see mLmodel.MLmodelPackage#getMissing_Values_Default_value_si_miss()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDefault_value_si_miss();

	/**
	 * Sets the value of the '{@link mLmodel.Missing_Values#getDefault_value_si_miss <em>Default value si miss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default value si miss</em>' attribute.
	 * @see #getDefault_value_si_miss()
	 * @generated
	 */
	void setDefault_value_si_miss(String value);

} // Missing_Values
