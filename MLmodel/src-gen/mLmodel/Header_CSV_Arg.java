/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header CSV Arg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Header_CSV_Arg#getDefault_value_head_csv_val <em>Default value head csv val</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getHeader_CSV_Arg()
 * @model
 * @generated
 */
public interface Header_CSV_Arg extends CSV_Argumans {
	/**
	 * Returns the value of the '<em><b>Default value head csv val</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default value head csv val</em>' attribute.
	 * @see #setDefault_value_head_csv_val(int)
	 * @see mLmodel.MLmodelPackage#getHeader_CSV_Arg_Default_value_head_csv_val()
	 * @model default="0" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getDefault_value_head_csv_val();

	/**
	 * Sets the value of the '{@link mLmodel.Header_CSV_Arg#getDefault_value_head_csv_val <em>Default value head csv val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default value head csv val</em>' attribute.
	 * @see #getDefault_value_head_csv_val()
	 * @generated
	 */
	void setDefault_value_head_csv_val(int value);

} // Header_CSV_Arg
