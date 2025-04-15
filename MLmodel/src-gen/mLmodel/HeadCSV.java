/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Head CSV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.HeadCSV#getDefault_header <em>Default header</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getHeadCSV()
 * @model
 * @generated
 */
public interface HeadCSV extends CSV_Argumans {
	/**
	 * Returns the value of the '<em><b>Default header</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default header</em>' attribute.
	 * @see #setDefault_header(int)
	 * @see mLmodel.MLmodelPackage#getHeadCSV_Default_header()
	 * @model default="0" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getDefault_header();

	/**
	 * Sets the value of the '{@link mLmodel.HeadCSV#getDefault_header <em>Default header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default header</em>' attribute.
	 * @see #getDefault_header()
	 * @generated
	 */
	void setDefault_header(int value);

} // HeadCSV
