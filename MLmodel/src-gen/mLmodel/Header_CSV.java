/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header CSV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Header_CSV#getDefault_value_head_CSV <em>Default value head CSV</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getHeader_CSV()
 * @model
 * @generated
 */
public interface Header_CSV extends CSV_Argumans {
	/**
	 * Returns the value of the '<em><b>Default value head CSV</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default value head CSV</em>' attribute.
	 * @see #setDefault_value_head_CSV(int)
	 * @see mLmodel.MLmodelPackage#getHeader_CSV_Default_value_head_CSV()
	 * @model default="0" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getDefault_value_head_CSV();

	/**
	 * Sets the value of the '{@link mLmodel.Header_CSV#getDefault_value_head_CSV <em>Default value head CSV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default value head CSV</em>' attribute.
	 * @see #getDefault_value_head_CSV()
	 * @generated
	 */
	void setDefault_value_head_CSV(int value);

} // Header_CSV
