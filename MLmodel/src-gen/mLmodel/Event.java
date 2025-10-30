/**
 */
package mLmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Event#getAnalysystriger <em>Analysystriger</em>}</li>
 *   <li>{@link mLmodel.Event#getName <em>Name</em>}</li>
 *   <li>{@link mLmodel.Event#getData <em>Data</em>}</li>
 *   <li>{@link mLmodel.Event#isSubscription <em>Subscription</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject {

	/**
	 * Returns the value of the '<em><b>Analysystriger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysystriger</em>' reference.
	 * @see #setAnalysystriger(AnalysysTriger)
	 * @see mLmodel.MLmodelPackage#getEvent_Analysystriger()
	 * @model
	 * @generated
	 */
	AnalysysTriger getAnalysystriger();

	/**
	 * Sets the value of the '{@link mLmodel.Event#getAnalysystriger <em>Analysystriger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysystriger</em>' reference.
	 * @see #getAnalysystriger()
	 * @generated
	 */
	void setAnalysystriger(AnalysysTriger value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mLmodel.MLmodelPackage#getEvent_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mLmodel.Event#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see mLmodel.MLmodelPackage#getEvent_Data()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link mLmodel.Event#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

	/**
	 * Returns the value of the '<em><b>Subscription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription</em>' attribute.
	 * @see #setSubscription(boolean)
	 * @see mLmodel.MLmodelPackage#getEvent_Subscription()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isSubscription();

	/**
	 * Sets the value of the '{@link mLmodel.Event#isSubscription <em>Subscription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription</em>' attribute.
	 * @see #isSubscription()
	 * @generated
	 */
	void setSubscription(boolean value);
} // Event
