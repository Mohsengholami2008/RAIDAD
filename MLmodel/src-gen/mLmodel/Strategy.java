/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Strategy#getDefault_value_sim_str <em>Default value sim str</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getStrategy()
 * @model
 * @generated
 */
public interface Strategy extends Simple_Imputer_Arguments {
	/**
	 * Returns the value of the '<em><b>Default value sim str</b></em>' attribute.
	 * The literals are from the enumeration {@link mLmodel.Strategy_Simple_Imputer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default value sim str</em>' attribute.
	 * @see mLmodel.Strategy_Simple_Imputer
	 * @see #setDefault_value_sim_str(Strategy_Simple_Imputer)
	 * @see mLmodel.MLmodelPackage#getStrategy_Default_value_sim_str()
	 * @model
	 * @generated
	 */
	Strategy_Simple_Imputer getDefault_value_sim_str();

	/**
	 * Sets the value of the '{@link mLmodel.Strategy#getDefault_value_sim_str <em>Default value sim str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default value sim str</em>' attribute.
	 * @see mLmodel.Strategy_Simple_Imputer
	 * @see #getDefault_value_sim_str()
	 * @generated
	 */
	void setDefault_value_sim_str(Strategy_Simple_Imputer value);

} // Strategy
