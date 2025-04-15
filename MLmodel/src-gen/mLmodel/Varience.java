/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Varience</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Varience#getVarience_value <em>Varience value</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getVarience()
 * @model
 * @generated
 */
public interface Varience extends PCA_Argumans {
	/**
	 * Returns the value of the '<em><b>Varience value</b></em>' attribute.
	 * The default value is <code>"0.8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varience value</em>' attribute.
	 * @see #setVarience_value(float)
	 * @see mLmodel.MLmodelPackage#getVarience_Varience_value()
	 * @model default="0.8" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 * @generated
	 */
	float getVarience_value();

	/**
	 * Sets the value of the '{@link mLmodel.Varience#getVarience_value <em>Varience value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Varience value</em>' attribute.
	 * @see #getVarience_value()
	 * @generated
	 */
	void setVarience_value(float value);

} // Varience
