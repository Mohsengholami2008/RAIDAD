/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Online Model Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.OnlineModelManager#getRandom_state <em>Random state</em>}</li>
 *   <li>{@link mLmodel.OnlineModelManager#getN_LAGS <em>NLAGS</em>}</li>
 *   <li>{@link mLmodel.OnlineModelManager#isHisory <em>Hisory</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getOnlineModelManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface OnlineModelManager extends Cycle {

	/**
	 * Returns the value of the '<em><b>Random state</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Random state</em>' attribute.
	 * @see #setRandom_state(int)
	 * @see mLmodel.MLmodelPackage#getOnlineModelManager_Random_state()
	 * @model default="0" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getRandom_state();

	/**
	 * Sets the value of the '{@link mLmodel.OnlineModelManager#getRandom_state <em>Random state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Random state</em>' attribute.
	 * @see #getRandom_state()
	 * @generated
	 */
	void setRandom_state(int value);

	/**
	 * Returns the value of the '<em><b>NLAGS</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NLAGS</em>' attribute.
	 * @see #setN_LAGS(int)
	 * @see mLmodel.MLmodelPackage#getOnlineModelManager_N_LAGS()
	 * @model default="5" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getN_LAGS();

	/**
	 * Sets the value of the '{@link mLmodel.OnlineModelManager#getN_LAGS <em>NLAGS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NLAGS</em>' attribute.
	 * @see #getN_LAGS()
	 * @generated
	 */
	void setN_LAGS(int value);

	/**
	 * Returns the value of the '<em><b>Hisory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hisory</em>' attribute.
	 * @see #setHisory(boolean)
	 * @see mLmodel.MLmodelPackage#getOnlineModelManager_Hisory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isHisory();

	/**
	 * Sets the value of the '{@link mLmodel.OnlineModelManager#isHisory <em>Hisory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hisory</em>' attribute.
	 * @see #isHisory()
	 * @generated
	 */
	void setHisory(boolean value);
} // OnlineModelManager
