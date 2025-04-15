/**
 */
package mLmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preprocess</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Preprocess#getRegular <em>Regular</em>}</li>
 *   <li>{@link mLmodel.Preprocess#isSave_file <em>Save file</em>}</li>
 *   <li>{@link mLmodel.Preprocess#isPrint_data <em>Print data</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getPreprocess()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Preprocess extends Cycle {
	/**
	 * Returns the value of the '<em><b>Regular</b></em>' reference list.
	 * The list contents are of type {@link mLmodel.Regular}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regular</em>' reference list.
	 * @see mLmodel.MLmodelPackage#getPreprocess_Regular()
	 * @model
	 * @generated
	 */
	EList<Regular> getRegular();

	/**
	 * Returns the value of the '<em><b>Save file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Save file</em>' attribute.
	 * @see #setSave_file(boolean)
	 * @see mLmodel.MLmodelPackage#getPreprocess_Save_file()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isSave_file();

	/**
	 * Sets the value of the '{@link mLmodel.Preprocess#isSave_file <em>Save file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Save file</em>' attribute.
	 * @see #isSave_file()
	 * @generated
	 */
	void setSave_file(boolean value);

	/**
	 * Returns the value of the '<em><b>Print data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Print data</em>' attribute.
	 * @see #setPrint_data(boolean)
	 * @see mLmodel.MLmodelPackage#getPreprocess_Print_data()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isPrint_data();

	/**
	 * Sets the value of the '{@link mLmodel.Preprocess#isPrint_data <em>Print data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Print data</em>' attribute.
	 * @see #isPrint_data()
	 * @generated
	 */
	void setPrint_data(boolean value);

} // Preprocess
