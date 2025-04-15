/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameters DBOP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Parameters_DBOP#getEps <em>Eps</em>}</li>
 *   <li>{@link mLmodel.Parameters_DBOP#getMin_samples <em>Min samples</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getParameters_DBOP()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Parameters_DBOP extends Clustering {
	/**
	 * Returns the value of the '<em><b>Eps</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eps</em>' attribute.
	 * @see #setEps(float)
	 * @see mLmodel.MLmodelPackage#getParameters_DBOP_Eps()
	 * @model default="0.5" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 * @generated
	 */
	float getEps();

	/**
	 * Sets the value of the '{@link mLmodel.Parameters_DBOP#getEps <em>Eps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eps</em>' attribute.
	 * @see #getEps()
	 * @generated
	 */
	void setEps(float value);

	/**
	 * Returns the value of the '<em><b>Min samples</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min samples</em>' attribute.
	 * @see #setMin_samples(int)
	 * @see mLmodel.MLmodelPackage#getParameters_DBOP_Min_samples()
	 * @model default="5" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getMin_samples();

	/**
	 * Sets the value of the '{@link mLmodel.Parameters_DBOP#getMin_samples <em>Min samples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min samples</em>' attribute.
	 * @see #getMin_samples()
	 * @generated
	 */
	void setMin_samples(int value);

} // Parameters_DBOP
