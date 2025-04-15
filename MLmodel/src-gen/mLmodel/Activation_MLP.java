/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activation MLP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Activation_MLP#getActivation <em>Activation</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getActivation_MLP()
 * @model
 * @generated
 */
public interface Activation_MLP extends MLP_Argumans {
	/**
	 * Returns the value of the '<em><b>Activation</b></em>' attribute.
	 * The literals are from the enumeration {@link mLmodel.Neural_Network_Activation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation</em>' attribute.
	 * @see mLmodel.Neural_Network_Activation
	 * @see #setActivation(Neural_Network_Activation)
	 * @see mLmodel.MLmodelPackage#getActivation_MLP_Activation()
	 * @model
	 * @generated
	 */
	Neural_Network_Activation getActivation();

	/**
	 * Sets the value of the '{@link mLmodel.Activation_MLP#getActivation <em>Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation</em>' attribute.
	 * @see mLmodel.Neural_Network_Activation
	 * @see #getActivation()
	 * @generated
	 */
	void setActivation(Neural_Network_Activation value);

} // Activation_MLP
