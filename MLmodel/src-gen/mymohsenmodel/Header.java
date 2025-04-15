/**
 */
package mymohsenmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mymohsenmodel.Header#getDefault_value <em>Default value</em>}</li>
 * </ul>
 *
 * @see mymohsenmodel.MLmodelPackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends CSV_Argumans {
	/**
	 * Returns the value of the '<em><b>Default value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default value</em>' attribute.
	 * @see #setDefault_value(int)
	 * @see mymohsenmodel.MLmodelPackage#getHeader_Default_value()
	 * @model default="0" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getDefault_value();

	/**
	 * Sets the value of the '{@link mymohsenmodel.Header#getDefault_value <em>Default value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default value</em>' attribute.
	 * @see #getDefault_value()
	 * @generated
	 */
	void setDefault_value(int value);

} // Header
