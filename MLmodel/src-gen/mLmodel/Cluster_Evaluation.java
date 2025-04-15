/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cluster Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Cluster_Evaluation#getScatter <em>Scatter</em>}</li>
 *   <li>{@link mLmodel.Cluster_Evaluation#isCluster_sizes <em>Cluster sizes</em>}</li>
 *   <li>{@link mLmodel.Cluster_Evaluation#isCluster_centers_features <em>Cluster centers features</em>}</li>
 *   <li>{@link mLmodel.Cluster_Evaluation#isCluster_centers_standard_deviation <em>Cluster centers standard deviation</em>}</li>
 *   <li>{@link mLmodel.Cluster_Evaluation#isCluster_centers <em>Cluster centers</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getCluster_Evaluation()
 * @model
 * @generated
 */
public interface Cluster_Evaluation extends Cycle {
	/**
	 * Returns the value of the '<em><b>Scatter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scatter</em>' containment reference.
	 * @see #setScatter(Scatter)
	 * @see mLmodel.MLmodelPackage#getCluster_Evaluation_Scatter()
	 * @model containment="true"
	 * @generated
	 */
	Scatter getScatter();

	/**
	 * Sets the value of the '{@link mLmodel.Cluster_Evaluation#getScatter <em>Scatter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scatter</em>' containment reference.
	 * @see #getScatter()
	 * @generated
	 */
	void setScatter(Scatter value);

	/**
	 * Returns the value of the '<em><b>Cluster sizes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster sizes</em>' attribute.
	 * @see #setCluster_sizes(boolean)
	 * @see mLmodel.MLmodelPackage#getCluster_Evaluation_Cluster_sizes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isCluster_sizes();

	/**
	 * Sets the value of the '{@link mLmodel.Cluster_Evaluation#isCluster_sizes <em>Cluster sizes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster sizes</em>' attribute.
	 * @see #isCluster_sizes()
	 * @generated
	 */
	void setCluster_sizes(boolean value);

	/**
	 * Returns the value of the '<em><b>Cluster centers features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster centers features</em>' attribute.
	 * @see #setCluster_centers_features(boolean)
	 * @see mLmodel.MLmodelPackage#getCluster_Evaluation_Cluster_centers_features()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isCluster_centers_features();

	/**
	 * Sets the value of the '{@link mLmodel.Cluster_Evaluation#isCluster_centers_features <em>Cluster centers features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster centers features</em>' attribute.
	 * @see #isCluster_centers_features()
	 * @generated
	 */
	void setCluster_centers_features(boolean value);

	/**
	 * Returns the value of the '<em><b>Cluster centers standard deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster centers standard deviation</em>' attribute.
	 * @see #setCluster_centers_standard_deviation(boolean)
	 * @see mLmodel.MLmodelPackage#getCluster_Evaluation_Cluster_centers_standard_deviation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isCluster_centers_standard_deviation();

	/**
	 * Sets the value of the '{@link mLmodel.Cluster_Evaluation#isCluster_centers_standard_deviation <em>Cluster centers standard deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster centers standard deviation</em>' attribute.
	 * @see #isCluster_centers_standard_deviation()
	 * @generated
	 */
	void setCluster_centers_standard_deviation(boolean value);

	/**
	 * Returns the value of the '<em><b>Cluster centers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster centers</em>' attribute.
	 * @see #setCluster_centers(boolean)
	 * @see mLmodel.MLmodelPackage#getCluster_Evaluation_Cluster_centers()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isCluster_centers();

	/**
	 * Sets the value of the '{@link mLmodel.Cluster_Evaluation#isCluster_centers <em>Cluster centers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster centers</em>' attribute.
	 * @see #isCluster_centers()
	 * @generated
	 */
	void setCluster_centers(boolean value);

} // Cluster_Evaluation
