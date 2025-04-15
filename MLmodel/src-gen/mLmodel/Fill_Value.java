/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fill Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Fill_Value#getDefault_value_sim_fill <em>Default value sim fill</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getFill_Value()
 * @model
 * @generated
 */
public interface Fill_Value extends Simple_Imputer_Arguments {
	/**
	 * Returns the value of the '<em><b>Default value sim fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default value sim fill</em>' attribute.
	 * @see #setDefault_value_sim_fill(String)
	 * @see mLmodel.MLmodelPackage#getFill_Value_Default_value_sim_fill()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDefault_value_sim_fill();

	/**
	 * Sets the value of the '{@link mLmodel.Fill_Value#getDefault_value_sim_fill <em>Default value sim fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default value sim fill</em>' attribute.
	 * @see #getDefault_value_sim_fill()
	 * @generated
	 */
	void setDefault_value_sim_fill(String value);

} // Fill_Value
