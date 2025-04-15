/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alpha MLP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Alpha_MLP#getAlpha <em>Alpha</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getAlpha_MLP()
 * @model
 * @generated
 */
public interface Alpha_MLP extends MLP_Argumans {
	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' attribute.
	 * The default value is <code>"0.0001"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' attribute.
	 * @see #setAlpha(float)
	 * @see mLmodel.MLmodelPackage#getAlpha_MLP_Alpha()
	 * @model default="0.0001" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 * @generated
	 */
	float getAlpha();

	/**
	 * Sets the value of the '{@link mLmodel.Alpha_MLP#getAlpha <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' attribute.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(float value);

} // Alpha_MLP
