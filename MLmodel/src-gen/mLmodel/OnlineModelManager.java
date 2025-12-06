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
} // OnlineModelManager
