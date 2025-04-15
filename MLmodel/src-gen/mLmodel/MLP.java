/**
 */
package mLmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MLP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.MLP#getHidden_layer_sizes <em>Hidden layer sizes</em>}</li>
 *   <li>{@link mLmodel.MLP#getMlp_argumans <em>Mlp argumans</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getMLP()
 * @model
 * @generated
 */
public interface MLP extends Neural_Networks {
	/**
	 * Returns the value of the '<em><b>Hidden layer sizes</b></em>' containment reference list.
	 * The list contents are of type {@link mLmodel.Hidden_Layer_Sizes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden layer sizes</em>' containment reference list.
	 * @see mLmodel.MLmodelPackage#getMLP_Hidden_layer_sizes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Hidden_Layer_Sizes> getHidden_layer_sizes();

	/**
	 * Returns the value of the '<em><b>Mlp argumans</b></em>' containment reference list.
	 * The list contents are of type {@link mLmodel.MLP_Argumans}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mlp argumans</em>' containment reference list.
	 * @see mLmodel.MLmodelPackage#getMLP_Mlp_argumans()
	 * @model containment="true"
	 * @generated
	 */
	EList<MLP_Argumans> getMlp_argumans();

} // MLP
