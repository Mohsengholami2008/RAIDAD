/**
 */
package mLmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date to Int</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Date_to_Int#getDate_comp <em>Date comp</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getDate_to_Int()
 * @model
 * @generated
 */
public interface Date_to_Int extends Trasformation {
	/**
	 * Returns the value of the '<em><b>Date comp</b></em>' containment reference list.
	 * The list contents are of type {@link mLmodel.Date_Comp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date comp</em>' containment reference list.
	 * @see mLmodel.MLmodelPackage#getDate_to_Int_Date_comp()
	 * @model containment="true"
	 * @generated
	 */
	EList<Date_Comp> getDate_comp();

} // Date_to_Int
