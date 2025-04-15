/**
 */
package mLmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cross Validation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Cross_Validation#getNumber_of_folds <em>Number of folds</em>}</li>
 *   <li>{@link mLmodel.Cross_Validation#getPlots <em>Plots</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getCross_Validation()
 * @model
 * @generated
 */
public interface Cross_Validation extends Evaluation_Methods {
	/**
	 * Returns the value of the '<em><b>Number of folds</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number of folds</em>' attribute.
	 * @see #setNumber_of_folds(int)
	 * @see mLmodel.MLmodelPackage#getCross_Validation_Number_of_folds()
	 * @model default="5" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getNumber_of_folds();

	/**
	 * Sets the value of the '{@link mLmodel.Cross_Validation#getNumber_of_folds <em>Number of folds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number of folds</em>' attribute.
	 * @see #getNumber_of_folds()
	 * @generated
	 */
	void setNumber_of_folds(int value);

	/**
	 * Returns the value of the '<em><b>Plots</b></em>' containment reference list.
	 * The list contents are of type {@link mLmodel.Plots}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plots</em>' containment reference list.
	 * @see mLmodel.MLmodelPackage#getCross_Validation_Plots()
	 * @model containment="true"
	 * @generated
	 */
	EList<Plots> getPlots();

} // Cross_Validation
