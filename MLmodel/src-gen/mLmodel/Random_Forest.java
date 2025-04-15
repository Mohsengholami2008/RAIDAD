/**
 */
package mLmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Random Forest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Random_Forest#getRf_argumans <em>Rf argumans</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getRandom_Forest()
 * @model
 * @generated
 */
public interface Random_Forest extends Ensembles {
	/**
	 * Returns the value of the '<em><b>Rf argumans</b></em>' containment reference list.
	 * The list contents are of type {@link mLmodel.RF_Argumans}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rf argumans</em>' containment reference list.
	 * @see mLmodel.MLmodelPackage#getRandom_Forest_Rf_argumans()
	 * @model containment="true"
	 * @generated
	 */
	EList<RF_Argumans> getRf_argumans();

} // Random_Forest
