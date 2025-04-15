/**
 */
package mLmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.CSV#getCsv_argumans <em>Csv argumans</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getCSV()
 * @model
 * @generated
 */
public interface CSV extends Import_Data {
	/**
	 * Returns the value of the '<em><b>Csv argumans</b></em>' containment reference list.
	 * The list contents are of type {@link mLmodel.CSV_Argumans}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csv argumans</em>' containment reference list.
	 * @see mLmodel.MLmodelPackage#getCSV_Csv_argumans()
	 * @model containment="true"
	 * @generated
	 */
	EList<CSV_Argumans> getCsv_argumans();

} // CSV
