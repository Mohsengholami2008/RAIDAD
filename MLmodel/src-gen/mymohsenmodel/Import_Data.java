/**
 */
package mymohsenmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mymohsenmodel.Import_Data#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see mymohsenmodel.MLmodelPackage#getImport_Data()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Import_Data extends Cycle {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link mymohsenmodel.Set_Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see mymohsenmodel.MLmodelPackage#getImport_Data_Role()
	 * @model containment="true"
	 * @generated
	 */
	EList<Set_Role> getRole();

} // Import_Data
