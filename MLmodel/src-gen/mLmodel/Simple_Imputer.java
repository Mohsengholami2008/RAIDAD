/**
 */
package mLmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Imputer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Simple_Imputer#getSimple_imputer_arguments <em>Simple imputer arguments</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getSimple_Imputer()
 * @model
 * @generated
 */
public interface Simple_Imputer extends Preprocess {
	/**
	 * Returns the value of the '<em><b>Simple imputer arguments</b></em>' containment reference list.
	 * The list contents are of type {@link mLmodel.Simple_Imputer_Arguments}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple imputer arguments</em>' containment reference list.
	 * @see mLmodel.MLmodelPackage#getSimple_Imputer_Simple_imputer_arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Simple_Imputer_Arguments> getSimple_imputer_arguments();

} // Simple_Imputer
