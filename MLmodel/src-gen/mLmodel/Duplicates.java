/**
 */
package mLmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duplicates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Duplicates#getDuplicates_argumans <em>Duplicates argumans</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getDuplicates()
 * @model
 * @generated
 */
public interface Duplicates extends Preprocess {

	/**
	 * Returns the value of the '<em><b>Duplicates argumans</b></em>' containment reference list.
	 * The list contents are of type {@link mLmodel.Duplicates_Argumans}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duplicates argumans</em>' containment reference list.
	 * @see mLmodel.MLmodelPackage#getDuplicates_Duplicates_argumans()
	 * @model containment="true"
	 * @generated
	 */
	EList<Duplicates_Argumans> getDuplicates_argumans();

} // Duplicates
