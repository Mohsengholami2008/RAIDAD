/**
 */
package mLmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voting Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Voting_Classifier#getVoting <em>Voting</em>}</li>
 *   <li>{@link mLmodel.Voting_Classifier#getClassification <em>Classification</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getVoting_Classifier()
 * @model
 * @generated
 */
public interface Voting_Classifier extends Ensembles {
	/**
	 * Returns the value of the '<em><b>Voting</b></em>' attribute.
	 * The literals are from the enumeration {@link mLmodel.voting_pred}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voting</em>' attribute.
	 * @see mLmodel.voting_pred
	 * @see #setVoting(voting_pred)
	 * @see mLmodel.MLmodelPackage#getVoting_Classifier_Voting()
	 * @model
	 * @generated
	 */
	voting_pred getVoting();

	/**
	 * Sets the value of the '{@link mLmodel.Voting_Classifier#getVoting <em>Voting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voting</em>' attribute.
	 * @see mLmodel.voting_pred
	 * @see #getVoting()
	 * @generated
	 */
	void setVoting(voting_pred value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' reference list.
	 * The list contents are of type {@link mLmodel.Classification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' reference list.
	 * @see mLmodel.MLmodelPackage#getVoting_Classifier_Classification()
	 * @model
	 * @generated
	 */
	EList<Classification> getClassification();

} // Voting_Classifier
