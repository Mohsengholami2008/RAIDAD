/**
 */
package mLmodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Root#getName <em>Name</em>}</li>
 *   <li>{@link mLmodel.Root#getProcess <em>Process</em>}</li>
 *   <li>{@link mLmodel.Root#getThing <em>Thing</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"MLModel"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mLmodel.MLmodelPackage#getRoot_Name()
	 * @model default="MLModel" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mLmodel.Root#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference.
	 * @see #setProcess(mLmodel.Process)
	 * @see mLmodel.MLmodelPackage#getRoot_Process()
	 * @model containment="true"
	 * @generated
	 */
	mLmodel.Process getProcess();

	/**
	 * Sets the value of the '{@link mLmodel.Root#getProcess <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' containment reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(mLmodel.Process value);

	/**
	 * Returns the value of the '<em><b>Thing</b></em>' containment reference list.
	 * The list contents are of type {@link mLmodel.Thing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thing</em>' containment reference list.
	 * @see mLmodel.MLmodelPackage#getRoot_Thing()
	 * @model containment="true"
	 * @generated
	 */
	EList<Thing> getThing();

} // Root
