/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clustering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Clustering#getLibrary <em>Library</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getClustering()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Clustering extends Cycle {
	/**
	 * Returns the value of the '<em><b>Library</b></em>' attribute.
	 * The literals are from the enumeration {@link mLmodel.Library_Clustering}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' attribute.
	 * @see mLmodel.Library_Clustering
	 * @see #setLibrary(Library_Clustering)
	 * @see mLmodel.MLmodelPackage#getClustering_Library()
	 * @model
	 * @generated
	 */
	Library_Clustering getLibrary();

	/**
	 * Sets the value of the '{@link mLmodel.Clustering#getLibrary <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' attribute.
	 * @see mLmodel.Library_Clustering
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(Library_Clustering value);

} // Clustering
