/**
 */
package mLmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One Hot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.OneHot#getOnehot_argumans <em>Onehot argumans</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getOneHot()
 * @model
 * @generated
 */
public interface OneHot extends Encoding {
	/**
	 * Returns the value of the '<em><b>Onehot argumans</b></em>' containment reference list.
	 * The list contents are of type {@link mLmodel.OneHot_Argumans}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onehot argumans</em>' containment reference list.
	 * @see mLmodel.MLmodelPackage#getOneHot_Onehot_argumans()
	 * @model containment="true"
	 * @generated
	 */
	EList<OneHot_Argumans> getOnehot_argumans();

} // OneHot
