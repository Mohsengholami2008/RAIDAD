/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Criterion RF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Criterion_RF#getCriterion <em>Criterion</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getCriterion_RF()
 * @model
 * @generated
 */
public interface Criterion_RF extends RF_Argumans {
	/**
	 * Returns the value of the '<em><b>Criterion</b></em>' attribute.
	 * The literals are from the enumeration {@link mLmodel.Random_Forest_Criterion_Enum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criterion</em>' attribute.
	 * @see mLmodel.Random_Forest_Criterion_Enum
	 * @see #setCriterion(Random_Forest_Criterion_Enum)
	 * @see mLmodel.MLmodelPackage#getCriterion_RF_Criterion()
	 * @model
	 * @generated
	 */
	Random_Forest_Criterion_Enum getCriterion();

	/**
	 * Sets the value of the '{@link mLmodel.Criterion_RF#getCriterion <em>Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criterion</em>' attribute.
	 * @see mLmodel.Random_Forest_Criterion_Enum
	 * @see #getCriterion()
	 * @generated
	 */
	void setCriterion(Random_Forest_Criterion_Enum value);

} // Criterion_RF
