/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SVM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.SVM#getC <em>C</em>}</li>
 *   <li>{@link mLmodel.SVM#getKernel <em>Kernel</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getSVM()
 * @model
 * @generated
 */
public interface SVM extends Classification {
	/**
	 * Returns the value of the '<em><b>C</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C</em>' attribute.
	 * @see #setC(float)
	 * @see mLmodel.MLmodelPackage#getSVM_C()
	 * @model default="1.0" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 * @generated
	 */
	float getC();

	/**
	 * Sets the value of the '{@link mLmodel.SVM#getC <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C</em>' attribute.
	 * @see #getC()
	 * @generated
	 */
	void setC(float value);

	/**
	 * Returns the value of the '<em><b>Kernel</b></em>' attribute.
	 * The literals are from the enumeration {@link mLmodel.SVM_Kernel_Enum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kernel</em>' attribute.
	 * @see mLmodel.SVM_Kernel_Enum
	 * @see #setKernel(SVM_Kernel_Enum)
	 * @see mLmodel.MLmodelPackage#getSVM_Kernel()
	 * @model
	 * @generated
	 */
	SVM_Kernel_Enum getKernel();

	/**
	 * Sets the value of the '{@link mLmodel.SVM#getKernel <em>Kernel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kernel</em>' attribute.
	 * @see mLmodel.SVM_Kernel_Enum
	 * @see #getKernel()
	 * @generated
	 */
	void setKernel(SVM_Kernel_Enum value);

} // SVM
