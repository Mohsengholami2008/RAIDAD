/**
 */
package mLmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hidden Layer Sizes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Hidden_Layer_Sizes#getNeurons <em>Neurons</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getHidden_Layer_Sizes()
 * @model
 * @generated
 */
public interface Hidden_Layer_Sizes extends EObject {
	/**
	 * Returns the value of the '<em><b>Neurons</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neurons</em>' attribute.
	 * @see #setNeurons(int)
	 * @see mLmodel.MLmodelPackage#getHidden_Layer_Sizes_Neurons()
	 * @model default="100" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getNeurons();

	/**
	 * Sets the value of the '{@link mLmodel.Hidden_Layer_Sizes#getNeurons <em>Neurons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neurons</em>' attribute.
	 * @see #getNeurons()
	 * @generated
	 */
	void setNeurons(int value);

} // Hidden_Layer_Sizes
