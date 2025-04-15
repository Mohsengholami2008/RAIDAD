/**
 */
package mymohsenmodel;

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
 *   <li>{@link mymohsenmodel.Process#getFile_path <em>File path</em>}</li>
 *   <li>{@link mymohsenmodel.Process#getCycle <em>Cycle</em>}</li>
 * </ul>
 *
 * @see mymohsenmodel.MLmodelPackage#getProcess()
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
	 * @see mymohsenmodel.MLmodelPackage#getProcess_File_path()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getFile_path();

	/**
	 * Sets the value of the '{@link mymohsenmodel.Process#getFile_path <em>File path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File path</em>' attribute.
	 * @see #getFile_path()
	 * @generated
	 */
	void setFile_path(String value);

	/**
	 * Returns the value of the '<em><b>Cycle</b></em>' containment reference list.
	 * The list contents are of type {@link mymohsenmodel.Cycle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycle</em>' containment reference list.
	 * @see mymohsenmodel.MLmodelPackage#getProcess_Cycle()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cycle> getCycle();

} // Process
