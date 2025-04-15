/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NNeighbors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.N_Neighbors#getN_neighbors <em>Nneighbors</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getN_Neighbors()
 * @model
 * @generated
 */
public interface N_Neighbors extends KNN_Argumans {

	/**
	 * Returns the value of the '<em><b>Nneighbors</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nneighbors</em>' attribute.
	 * @see #setN_neighbors(int)
	 * @see mLmodel.MLmodelPackage#getN_Neighbors_N_neighbors()
	 * @model default="5" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getN_neighbors();

	/**
	 * Sets the value of the '{@link mLmodel.N_Neighbors#getN_neighbors <em>Nneighbors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nneighbors</em>' attribute.
	 * @see #getN_neighbors()
	 * @generated
	 */
	void setN_neighbors(int value);
} // N_Neighbors
