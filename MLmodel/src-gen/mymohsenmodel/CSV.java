/**
 */
package mymohsenmodel;

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
 *   <li>{@link mymohsenmodel.CSV#getCsv_argumans <em>Csv argumans</em>}</li>
 * </ul>
 *
 * @see mymohsenmodel.MLmodelPackage#getCSV()
 * @model
 * @generated
 */
public interface CSV extends Import_Data {
	/**
	 * Returns the value of the '<em><b>Csv argumans</b></em>' containment reference list.
	 * The list contents are of type {@link mymohsenmodel.CSV_Argumans}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csv argumans</em>' containment reference list.
	 * @see mymohsenmodel.MLmodelPackage#getCSV_Csv_argumans()
	 * @model containment="true"
	 * @generated
	 */
	EList<CSV_Argumans> getCsv_argumans();

} // CSV
