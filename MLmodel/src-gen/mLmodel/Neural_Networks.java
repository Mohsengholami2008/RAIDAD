/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neural Networks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Neural_Networks#getLibrary <em>Library</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getNeural_Networks()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Neural_Networks extends Classification {
	/**
	 * Returns the value of the '<em><b>Library</b></em>' attribute.
	 * The literals are from the enumeration {@link mLmodel.Neural_Libraries}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' attribute.
	 * @see mLmodel.Neural_Libraries
	 * @see #setLibrary(Neural_Libraries)
	 * @see mLmodel.MLmodelPackage#getNeural_Networks_Library()
	 * @model
	 * @generated
	 */
	Neural_Libraries getLibrary();

	/**
	 * Sets the value of the '{@link mLmodel.Neural_Networks#getLibrary <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' attribute.
	 * @see mLmodel.Neural_Libraries
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(Neural_Libraries value);

} // Neural_Networks
