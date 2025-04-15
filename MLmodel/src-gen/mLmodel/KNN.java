/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KNN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.KNN#getK <em>K</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getKNN()
 * @model
 * @generated
 */
public interface KNN extends Classification {
	/**
	 * Returns the value of the '<em><b>K</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>K</em>' attribute.
	 * @see #setK(int)
	 * @see mLmodel.MLmodelPackage#getKNN_K()
	 * @model default="5" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getK();

	/**
	 * Sets the value of the '{@link mLmodel.KNN#getK <em>K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>K</em>' attribute.
	 * @see #getK()
	 * @generated
	 */
	void setK(int value);

} // KNN
