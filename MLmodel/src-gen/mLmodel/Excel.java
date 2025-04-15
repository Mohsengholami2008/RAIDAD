/**
 */
package mLmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Excel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Excel#getExcel_arguments <em>Excel arguments</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getExcel()
 * @model
 * @generated
 */
public interface Excel extends Import_Data {
	/**
	 * Returns the value of the '<em><b>Excel arguments</b></em>' containment reference list.
	 * The list contents are of type {@link mLmodel.Excel_Argumans}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excel arguments</em>' containment reference list.
	 * @see mLmodel.MLmodelPackage#getExcel_Excel_arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Excel_Argumans> getExcel_arguments();

} // Excel
