/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NEstimators RF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.N_Estimators_RF#getN_estimators <em>Nestimators</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getN_Estimators_RF()
 * @model
 * @generated
 */
public interface N_Estimators_RF extends RF_Argumans {
	/**
	 * Returns the value of the '<em><b>Nestimators</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nestimators</em>' attribute.
	 * @see #setN_estimators(int)
	 * @see mLmodel.MLmodelPackage#getN_Estimators_RF_N_estimators()
	 * @model default="100" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getN_estimators();

	/**
	 * Sets the value of the '{@link mLmodel.N_Estimators_RF#getN_estimators <em>Nestimators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nestimators</em>' attribute.
	 * @see #getN_estimators()
	 * @generated
	 */
	void setN_estimators(int value);

} // N_Estimators_RF
