/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Random State RF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Random_State_RF#getRandom_state <em>Random state</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getRandom_State_RF()
 * @model
 * @generated
 */
public interface Random_State_RF extends RF_Argumans {
	/**
	 * Returns the value of the '<em><b>Random state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Random state</em>' attribute.
	 * @see #setRandom_state(int)
	 * @see mLmodel.MLmodelPackage#getRandom_State_RF_Random_state()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getRandom_state();

	/**
	 * Sets the value of the '{@link mLmodel.Random_State_RF#getRandom_state <em>Random state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Random state</em>' attribute.
	 * @see #getRandom_state()
	 * @generated
	 */
	void setRandom_state(int value);

} // Random_State_RF
