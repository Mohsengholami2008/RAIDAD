/**
 */
package mLmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auto Prep</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Auto_Prep#isSimple_Imputer <em>Simple Imputer</em>}</li>
 *   <li>{@link mLmodel.Auto_Prep#isKNN_Imputer <em>KNN Imputer</em>}</li>
 *   <li>{@link mLmodel.Auto_Prep#isScaling <em>Scaling</em>}</li>
 *   <li>{@link mLmodel.Auto_Prep#isEncoding <em>Encoding</em>}</li>
 *   <li>{@link mLmodel.Auto_Prep#isDuplicates <em>Duplicates</em>}</li>
 *   <li>{@link mLmodel.Auto_Prep#isTrasformation <em>Trasformation</em>}</li>
 *   <li>{@link mLmodel.Auto_Prep#isDime_Reduct <em>Dime Reduct</em>}</li>
 *   <li>{@link mLmodel.Auto_Prep#isDate_to_Int <em>Date to Int</em>}</li>
 *   <li>{@link mLmodel.Auto_Prep#isDrop <em>Drop</em>}</li>
 *   <li>{@link mLmodel.Auto_Prep#getMiss_id <em>Miss id</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getAuto_Prep()
 * @model
 * @generated
 */
public interface Auto_Prep extends Preprocess {
	/**
	 * Returns the value of the '<em><b>Simple Imputer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Imputer</em>' attribute.
	 * @see #setSimple_Imputer(boolean)
	 * @see mLmodel.MLmodelPackage#getAuto_Prep_Simple_Imputer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isSimple_Imputer();

	/**
	 * Sets the value of the '{@link mLmodel.Auto_Prep#isSimple_Imputer <em>Simple Imputer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Imputer</em>' attribute.
	 * @see #isSimple_Imputer()
	 * @generated
	 */
	void setSimple_Imputer(boolean value);

	/**
	 * Returns the value of the '<em><b>KNN Imputer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KNN Imputer</em>' attribute.
	 * @see #setKNN_Imputer(boolean)
	 * @see mLmodel.MLmodelPackage#getAuto_Prep_KNN_Imputer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isKNN_Imputer();

	/**
	 * Sets the value of the '{@link mLmodel.Auto_Prep#isKNN_Imputer <em>KNN Imputer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KNN Imputer</em>' attribute.
	 * @see #isKNN_Imputer()
	 * @generated
	 */
	void setKNN_Imputer(boolean value);

	/**
	 * Returns the value of the '<em><b>Scaling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaling</em>' attribute.
	 * @see #setScaling(boolean)
	 * @see mLmodel.MLmodelPackage#getAuto_Prep_Scaling()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isScaling();

	/**
	 * Sets the value of the '{@link mLmodel.Auto_Prep#isScaling <em>Scaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaling</em>' attribute.
	 * @see #isScaling()
	 * @generated
	 */
	void setScaling(boolean value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(boolean)
	 * @see mLmodel.MLmodelPackage#getAuto_Prep_Encoding()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isEncoding();

	/**
	 * Sets the value of the '{@link mLmodel.Auto_Prep#isEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #isEncoding()
	 * @generated
	 */
	void setEncoding(boolean value);

	/**
	 * Returns the value of the '<em><b>Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duplicates</em>' attribute.
	 * @see #setDuplicates(boolean)
	 * @see mLmodel.MLmodelPackage#getAuto_Prep_Duplicates()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isDuplicates();

	/**
	 * Sets the value of the '{@link mLmodel.Auto_Prep#isDuplicates <em>Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duplicates</em>' attribute.
	 * @see #isDuplicates()
	 * @generated
	 */
	void setDuplicates(boolean value);

	/**
	 * Returns the value of the '<em><b>Trasformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trasformation</em>' attribute.
	 * @see #setTrasformation(boolean)
	 * @see mLmodel.MLmodelPackage#getAuto_Prep_Trasformation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isTrasformation();

	/**
	 * Sets the value of the '{@link mLmodel.Auto_Prep#isTrasformation <em>Trasformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trasformation</em>' attribute.
	 * @see #isTrasformation()
	 * @generated
	 */
	void setTrasformation(boolean value);

	/**
	 * Returns the value of the '<em><b>Dime Reduct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dime Reduct</em>' attribute.
	 * @see #setDime_Reduct(boolean)
	 * @see mLmodel.MLmodelPackage#getAuto_Prep_Dime_Reduct()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isDime_Reduct();

	/**
	 * Sets the value of the '{@link mLmodel.Auto_Prep#isDime_Reduct <em>Dime Reduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dime Reduct</em>' attribute.
	 * @see #isDime_Reduct()
	 * @generated
	 */
	void setDime_Reduct(boolean value);

	/**
	 * Returns the value of the '<em><b>Date to Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date to Int</em>' attribute.
	 * @see #setDate_to_Int(boolean)
	 * @see mLmodel.MLmodelPackage#getAuto_Prep_Date_to_Int()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isDate_to_Int();

	/**
	 * Sets the value of the '{@link mLmodel.Auto_Prep#isDate_to_Int <em>Date to Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date to Int</em>' attribute.
	 * @see #isDate_to_Int()
	 * @generated
	 */
	void setDate_to_Int(boolean value);

	/**
	 * Returns the value of the '<em><b>Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drop</em>' attribute.
	 * @see #setDrop(boolean)
	 * @see mLmodel.MLmodelPackage#getAuto_Prep_Drop()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isDrop();

	/**
	 * Sets the value of the '{@link mLmodel.Auto_Prep#isDrop <em>Drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drop</em>' attribute.
	 * @see #isDrop()
	 * @generated
	 */
	void setDrop(boolean value);

	/**
	 * Returns the value of the '<em><b>Miss id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Miss id</em>' attribute list.
	 * @see mLmodel.MLmodelPackage#getAuto_Prep_Miss_id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	EList<String> getMiss_id();

} // Auto_Prep
