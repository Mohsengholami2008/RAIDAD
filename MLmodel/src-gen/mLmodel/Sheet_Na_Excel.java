/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sheet Na Excel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Sheet_Na_Excel#getDefault_val_sheet <em>Default val sheet</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getSheet_Na_Excel()
 * @model
 * @generated
 */
public interface Sheet_Na_Excel extends Excel_Argumans {
	/**
	 * Returns the value of the '<em><b>Default val sheet</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default val sheet</em>' attribute.
	 * @see #setDefault_val_sheet(int)
	 * @see mLmodel.MLmodelPackage#getSheet_Na_Excel_Default_val_sheet()
	 * @model default="0" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getDefault_val_sheet();

	/**
	 * Sets the value of the '{@link mLmodel.Sheet_Na_Excel#getDefault_val_sheet <em>Default val sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default val sheet</em>' attribute.
	 * @see #getDefault_val_sheet()
	 * @generated
	 */
	void setDefault_val_sheet(int value);

} // Sheet_Na_Excel
