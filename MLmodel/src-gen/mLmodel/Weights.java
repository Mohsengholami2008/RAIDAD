/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weights</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Weights#getWeights <em>Weights</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getWeights()
 * @model
 * @generated
 */
public interface Weights extends KNN_Argumans {

	/**
	 * Returns the value of the '<em><b>Weights</b></em>' attribute.
	 * The literals are from the enumeration {@link mLmodel.KNN_Imputer_Weights}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weights</em>' attribute.
	 * @see mLmodel.KNN_Imputer_Weights
	 * @see #setWeights(KNN_Imputer_Weights)
	 * @see mLmodel.MLmodelPackage#getWeights_Weights()
	 * @model
	 * @generated
	 */
	KNN_Imputer_Weights getWeights();

	/**
	 * Sets the value of the '{@link mLmodel.Weights#getWeights <em>Weights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weights</em>' attribute.
	 * @see mLmodel.KNN_Imputer_Weights
	 * @see #getWeights()
	 * @generated
	 */
	void setWeights(KNN_Imputer_Weights value);
} // Weights
