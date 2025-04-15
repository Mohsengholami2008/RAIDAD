/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DBSCAN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.DBSCAN#getP <em>P</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getDBSCAN()
 * @model
 * @generated
 */
public interface DBSCAN extends Parameters_DBOP {
	/**
	 * Returns the value of the '<em><b>P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' attribute.
	 * @see #setP(float)
	 * @see mLmodel.MLmodelPackage#getDBSCAN_P()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Float"
	 * @generated
	 */
	float getP();

	/**
	 * Sets the value of the '{@link mLmodel.DBSCAN#getP <em>P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P</em>' attribute.
	 * @see #getP()
	 * @generated
	 */
	void setP(float value);

} // DBSCAN
