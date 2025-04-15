/**
 */
package mLmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.PCA#getPca_argumans <em>Pca argumans</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getPCA()
 * @model
 * @generated
 */
public interface PCA extends Dime_Reduct {
	/**
	 * Returns the value of the '<em><b>Pca argumans</b></em>' containment reference list.
	 * The list contents are of type {@link mLmodel.PCA_Argumans}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pca argumans</em>' containment reference list.
	 * @see mLmodel.MLmodelPackage#getPCA_Pca_argumans()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCA_Argumans> getPca_argumans();

} // PCA
