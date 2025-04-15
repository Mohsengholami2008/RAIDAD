/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max Iter MLP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Max_Iter_MLP#getMax_iter <em>Max iter</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getMax_Iter_MLP()
 * @model
 * @generated
 */
public interface Max_Iter_MLP extends MLP_Argumans {
	/**
	 * Returns the value of the '<em><b>Max iter</b></em>' attribute.
	 * The default value is <code>"200"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max iter</em>' attribute.
	 * @see #setMax_iter(int)
	 * @see mLmodel.MLmodelPackage#getMax_Iter_MLP_Max_iter()
	 * @model default="200" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getMax_iter();

	/**
	 * Sets the value of the '{@link mLmodel.Max_Iter_MLP#getMax_iter <em>Max iter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max iter</em>' attribute.
	 * @see #getMax_iter()
	 * @generated
	 */
	void setMax_iter(int value);

} // Max_Iter_MLP
