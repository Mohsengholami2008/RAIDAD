/**
 */
package mLmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cycle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Cycle#getAfter <em>After</em>}</li>
 *   <li>{@link mLmodel.Cycle#getBefore <em>Before</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getCycle()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Cycle extends EObject {
	/**
	 * Returns the value of the '<em><b>After</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mLmodel.Cycle#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After</em>' reference.
	 * @see #setAfter(Cycle)
	 * @see mLmodel.MLmodelPackage#getCycle_After()
	 * @see mLmodel.Cycle#getBefore
	 * @model opposite="before"
	 * @generated
	 */
	Cycle getAfter();

	/**
	 * Sets the value of the '{@link mLmodel.Cycle#getAfter <em>After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After</em>' reference.
	 * @see #getAfter()
	 * @generated
	 */
	void setAfter(Cycle value);

	/**
	 * Returns the value of the '<em><b>Before</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mLmodel.Cycle#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before</em>' reference.
	 * @see #setBefore(Cycle)
	 * @see mLmodel.MLmodelPackage#getCycle_Before()
	 * @see mLmodel.Cycle#getAfter
	 * @model opposite="after"
	 * @generated
	 */
	Cycle getBefore();

	/**
	 * Sets the value of the '{@link mLmodel.Cycle#getBefore <em>Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before</em>' reference.
	 * @see #getBefore()
	 * @generated
	 */
	void setBefore(Cycle value);

} // Cycle
