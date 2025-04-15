/**
 */
package mLmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visualization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Visualization#getData_und_plots <em>Data und plots</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getVisualization()
 * @model
 * @generated
 */
public interface Visualization extends Data_Understanding {
	/**
	 * Returns the value of the '<em><b>Data und plots</b></em>' containment reference list.
	 * The list contents are of type {@link mLmodel.Plots}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data und plots</em>' containment reference list.
	 * @see mLmodel.MLmodelPackage#getVisualization_Data_und_plots()
	 * @model containment="true"
	 * @generated
	 */
	EList<Plots> getData_und_plots();

} // Visualization
