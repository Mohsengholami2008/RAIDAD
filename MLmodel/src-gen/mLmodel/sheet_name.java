/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sheet name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.sheet_name#getDefault_value_sheet <em>Default value sheet</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getsheet_name()
 * @model
 * @generated
 */
public interface sheet_name extends Excel_Argumans {
	/**
	 * Returns the value of the '<em><b>Default value sheet</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default value sheet</em>' attribute.
	 * @see #setDefault_value_sheet(String)
	 * @see mLmodel.MLmodelPackage#getsheet_name_Default_value_sheet()
	 * @model default="None" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDefault_value_sheet();

	/**
	 * Sets the value of the '{@link mLmodel.sheet_name#getDefault_value_sheet <em>Default value sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default value sheet</em>' attribute.
	 * @see #getDefault_value_sheet()
	 * @generated
	 */
	void setDefault_value_sheet(String value);

} // sheet_name
