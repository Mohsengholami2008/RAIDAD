/**
 */
package mLmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KNN Imputer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.KNN_Imputer#getKnn_argumans <em>Knn argumans</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getKNN_Imputer()
 * @model
 * @generated
 */
public interface KNN_Imputer extends Preprocess {
	/**
	 * Returns the value of the '<em><b>Knn argumans</b></em>' containment reference list.
	 * The list contents are of type {@link mLmodel.KNN_Argumans}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knn argumans</em>' containment reference list.
	 * @see mLmodel.MLmodelPackage#getKNN_Imputer_Knn_argumans()
	 * @model containment="true"
	 * @generated
	 */
	EList<KNN_Argumans> getKnn_argumans();

} // KNN_Imputer
