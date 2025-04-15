/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Component#getComponent_value <em>Component value</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends PCA_Argumans {
	/**
	 * Returns the value of the '<em><b>Component value</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component value</em>' attribute.
	 * @see #setComponent_value(int)
	 * @see mLmodel.MLmodelPackage#getComponent_Component_value()
	 * @model default="2" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getComponent_value();

	/**
	 * Sets the value of the '{@link mLmodel.Component#getComponent_value <em>Component value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component value</em>' attribute.
	 * @see #getComponent_value()
	 * @generated
	 */
	void setComponent_value(int value);

} // Component
