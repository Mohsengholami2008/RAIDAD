/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correlation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Correlation#getWidth <em>Width</em>}</li>
 *   <li>{@link mLmodel.Correlation#getHeight <em>Height</em>}</li>
 *   <li>{@link mLmodel.Correlation#isTable <em>Table</em>}</li>
 *   <li>{@link mLmodel.Correlation#isMatrix <em>Matrix</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getCorrelation()
 * @model
 * @generated
 */
public interface Correlation extends Data_Understanding {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"800"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see mLmodel.MLmodelPackage#getCorrelation_Width()
	 * @model default="800" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link mLmodel.Correlation#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"800"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see mLmodel.MLmodelPackage#getCorrelation_Height()
	 * @model default="800" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link mLmodel.Correlation#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' attribute.
	 * @see #setTable(boolean)
	 * @see mLmodel.MLmodelPackage#getCorrelation_Table()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isTable();

	/**
	 * Sets the value of the '{@link mLmodel.Correlation#isTable <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' attribute.
	 * @see #isTable()
	 * @generated
	 */
	void setTable(boolean value);

	/**
	 * Returns the value of the '<em><b>Matrix</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix</em>' attribute.
	 * @see #setMatrix(boolean)
	 * @see mLmodel.MLmodelPackage#getCorrelation_Matrix()
	 * @model default="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isMatrix();

	/**
	 * Sets the value of the '{@link mLmodel.Correlation#isMatrix <em>Matrix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matrix</em>' attribute.
	 * @see #isMatrix()
	 * @generated
	 */
	void setMatrix(boolean value);

} // Correlation
