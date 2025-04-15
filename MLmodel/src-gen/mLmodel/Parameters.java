/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Parameters#getK <em>K</em>}</li>
 *   <li>{@link mLmodel.Parameters#getMax_iter <em>Max iter</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getParameters()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Parameters extends Clustering {
	/**
	 * Returns the value of the '<em><b>K</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>K</em>' attribute.
	 * @see #setK(int)
	 * @see mLmodel.MLmodelPackage#getParameters_K()
	 * @model default="5" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getK();

	/**
	 * Sets the value of the '{@link mLmodel.Parameters#getK <em>K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>K</em>' attribute.
	 * @see #getK()
	 * @generated
	 */
	void setK(int value);

	/**
	 * Returns the value of the '<em><b>Max iter</b></em>' attribute.
	 * The default value is <code>"300"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max iter</em>' attribute.
	 * @see #setMax_iter(int)
	 * @see mLmodel.MLmodelPackage#getParameters_Max_iter()
	 * @model default="300" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getMax_iter();

	/**
	 * Sets the value of the '{@link mLmodel.Parameters#getMax_iter <em>Max iter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max iter</em>' attribute.
	 * @see #getMax_iter()
	 * @generated
	 */
	void setMax_iter(int value);

} // Parameters
