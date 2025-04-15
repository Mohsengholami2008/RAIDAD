/**
 */
package mymohsenmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sep</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mymohsenmodel.Sep#getDefault_value <em>Default value</em>}</li>
 *   <li>{@link mymohsenmodel.Sep#isManual_sep <em>Manual sep</em>}</li>
 *   <li>{@link mymohsenmodel.Sep#getDefine <em>Define</em>}</li>
 * </ul>
 *
 * @see mymohsenmodel.MLmodelPackage#getSep()
 * @model
 * @generated
 */
public interface Sep extends CSV_Argumans {
	/**
	 * Returns the value of the '<em><b>Default value</b></em>' attribute.
	 * The literals are from the enumeration {@link mymohsenmodel.Enum_CSV_Sep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default value</em>' attribute.
	 * @see mymohsenmodel.Enum_CSV_Sep
	 * @see #setDefault_value(Enum_CSV_Sep)
	 * @see mymohsenmodel.MLmodelPackage#getSep_Default_value()
	 * @model
	 * @generated
	 */
	Enum_CSV_Sep getDefault_value();

	/**
	 * Sets the value of the '{@link mymohsenmodel.Sep#getDefault_value <em>Default value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default value</em>' attribute.
	 * @see mymohsenmodel.Enum_CSV_Sep
	 * @see #getDefault_value()
	 * @generated
	 */
	void setDefault_value(Enum_CSV_Sep value);

	/**
	 * Returns the value of the '<em><b>Manual sep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manual sep</em>' attribute.
	 * @see #setManual_sep(boolean)
	 * @see mymohsenmodel.MLmodelPackage#getSep_Manual_sep()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isManual_sep();

	/**
	 * Sets the value of the '{@link mymohsenmodel.Sep#isManual_sep <em>Manual sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manual sep</em>' attribute.
	 * @see #isManual_sep()
	 * @generated
	 */
	void setManual_sep(boolean value);

	/**
	 * Returns the value of the '<em><b>Define</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Define</em>' attribute.
	 * @see #setDefine(String)
	 * @see mymohsenmodel.MLmodelPackage#getSep_Define()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDefine();

	/**
	 * Sets the value of the '{@link mymohsenmodel.Sep#getDefine <em>Define</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Define</em>' attribute.
	 * @see #getDefine()
	 * @generated
	 */
	void setDefine(String value);

} // Sep
