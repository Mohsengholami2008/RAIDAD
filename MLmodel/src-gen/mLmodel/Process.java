/**
 */
package mLmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Process#getFile_path <em>File path</em>}</li>
 *   <li>{@link mLmodel.Process#getCycle <em>Cycle</em>}</li>
 *   <li>{@link mLmodel.Process#getData_understanding <em>Data understanding</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject {
	/**
	 * Returns the value of the '<em><b>File path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File path</em>' attribute.
	 * @see #setFile_path(String)
	 * @see mLmodel.MLmodelPackage#getProcess_File_path()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getFile_path();

	/**
	 * Sets the value of the '{@link mLmodel.Process#getFile_path <em>File path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File path</em>' attribute.
	 * @see #getFile_path()
	 * @generated
	 */
	void setFile_path(String value);

	/**
	 * Returns the value of the '<em><b>Cycle</b></em>' containment reference list.
	 * The list contents are of type {@link mLmodel.Cycle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycle</em>' containment reference list.
	 * @see mLmodel.MLmodelPackage#getProcess_Cycle()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cycle> getCycle();

	/**
	 * Returns the value of the '<em><b>Data understanding</b></em>' containment reference list.
	 * The list contents are of type {@link mLmodel.Data_Understanding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data understanding</em>' containment reference list.
	 * @see mLmodel.MLmodelPackage#getProcess_Data_understanding()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data_Understanding> getData_understanding();

} // Process
