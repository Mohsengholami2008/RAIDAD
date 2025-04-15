/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sep</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Sep#getDefault_value_sep <em>Default value sep</em>}</li>
 *   <li>{@link mLmodel.Sep#isManual_sep <em>Manual sep</em>}</li>
 *   <li>{@link mLmodel.Sep#getDefine <em>Define</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getSep()
 * @model
 * @generated
 */
public interface Sep extends CSV_Argumans {
	/**
	 * Returns the value of the '<em><b>Default value sep</b></em>' attribute.
	 * The literals are from the enumeration {@link mLmodel.Enum_CSV_Sep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default value sep</em>' attribute.
	 * @see mLmodel.Enum_CSV_Sep
	 * @see #setDefault_value_sep(Enum_CSV_Sep)
	 * @see mLmodel.MLmodelPackage#getSep_Default_value_sep()
	 * @model
	 * @generated
	 */
	Enum_CSV_Sep getDefault_value_sep();

	/**
	 * Sets the value of the '{@link mLmodel.Sep#getDefault_value_sep <em>Default value sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default value sep</em>' attribute.
	 * @see mLmodel.Enum_CSV_Sep
	 * @see #getDefault_value_sep()
	 * @generated
	 */
	void setDefault_value_sep(Enum_CSV_Sep value);

	/**
	 * Returns the value of the '<em><b>Manual sep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manual sep</em>' attribute.
	 * @see #setManual_sep(boolean)
	 * @see mLmodel.MLmodelPackage#getSep_Manual_sep()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isManual_sep();

	/**
	 * Sets the value of the '{@link mLmodel.Sep#isManual_sep <em>Manual sep</em>}' attribute.
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
	 * @see mLmodel.MLmodelPackage#getSep_Define()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDefine();

	/**
	 * Sets the value of the '{@link mLmodel.Sep#getDefine <em>Define</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Define</em>' attribute.
	 * @see #getDefine()
	 * @generated
	 */
	void setDefine(String value);

} // Sep
