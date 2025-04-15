/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Statistics#isType <em>Type</em>}</li>
 *   <li>{@link mLmodel.Statistics#isMissing <em>Missing</em>}</li>
 *   <li>{@link mLmodel.Statistics#isMin <em>Min</em>}</li>
 *   <li>{@link mLmodel.Statistics#isMax <em>Max</em>}</li>
 *   <li>{@link mLmodel.Statistics#isAverage <em>Average</em>}</li>
 *   <li>{@link mLmodel.Statistics#isStandard_devision <em>Standard devision</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getStatistics()
 * @model
 * @generated
 */
public interface Statistics extends Data_Understanding {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(boolean)
	 * @see mLmodel.MLmodelPackage#getStatistics_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isType();

	/**
	 * Sets the value of the '{@link mLmodel.Statistics#isType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #isType()
	 * @generated
	 */
	void setType(boolean value);

	/**
	 * Returns the value of the '<em><b>Missing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing</em>' attribute.
	 * @see #setMissing(boolean)
	 * @see mLmodel.MLmodelPackage#getStatistics_Missing()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isMissing();

	/**
	 * Sets the value of the '{@link mLmodel.Statistics#isMissing <em>Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing</em>' attribute.
	 * @see #isMissing()
	 * @generated
	 */
	void setMissing(boolean value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(boolean)
	 * @see mLmodel.MLmodelPackage#getStatistics_Min()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isMin();

	/**
	 * Sets the value of the '{@link mLmodel.Statistics#isMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #isMin()
	 * @generated
	 */
	void setMin(boolean value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(boolean)
	 * @see mLmodel.MLmodelPackage#getStatistics_Max()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isMax();

	/**
	 * Sets the value of the '{@link mLmodel.Statistics#isMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #isMax()
	 * @generated
	 */
	void setMax(boolean value);

	/**
	 * Returns the value of the '<em><b>Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average</em>' attribute.
	 * @see #setAverage(boolean)
	 * @see mLmodel.MLmodelPackage#getStatistics_Average()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isAverage();

	/**
	 * Sets the value of the '{@link mLmodel.Statistics#isAverage <em>Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average</em>' attribute.
	 * @see #isAverage()
	 * @generated
	 */
	void setAverage(boolean value);

	/**
	 * Returns the value of the '<em><b>Standard devision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard devision</em>' attribute.
	 * @see #setStandard_devision(boolean)
	 * @see mLmodel.MLmodelPackage#getStatistics_Standard_devision()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isStandard_devision();

	/**
	 * Sets the value of the '{@link mLmodel.Statistics#isStandard_devision <em>Standard devision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard devision</em>' attribute.
	 * @see #isStandard_devision()
	 * @generated
	 */
	void setStandard_devision(boolean value);

} // Statistics
