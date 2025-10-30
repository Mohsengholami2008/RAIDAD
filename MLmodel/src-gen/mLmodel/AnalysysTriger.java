/**
 */
package mLmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysys Triger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.AnalysysTriger#getTriggerType <em>Trigger Type</em>}</li>
 *   <li>{@link mLmodel.AnalysysTriger#getCondition <em>Condition</em>}</li>
 *   <li>{@link mLmodel.AnalysysTriger#getSchedule <em>Schedule</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getAnalysysTriger()
 * @model
 * @generated
 */
public interface AnalysysTriger extends EObject {

	/**
	 * Returns the value of the '<em><b>Trigger Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mLmodel.TrigerEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Type</em>' attribute.
	 * @see mLmodel.TrigerEnum
	 * @see #setTriggerType(TrigerEnum)
	 * @see mLmodel.MLmodelPackage#getAnalysysTriger_TriggerType()
	 * @model
	 * @generated
	 */
	TrigerEnum getTriggerType();

	/**
	 * Sets the value of the '{@link mLmodel.AnalysysTriger#getTriggerType <em>Trigger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Type</em>' attribute.
	 * @see mLmodel.TrigerEnum
	 * @see #getTriggerType()
	 * @generated
	 */
	void setTriggerType(TrigerEnum value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see mLmodel.MLmodelPackage#getAnalysysTriger_Condition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link mLmodel.AnalysysTriger#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' attribute.
	 * @see #setSchedule(String)
	 * @see mLmodel.MLmodelPackage#getAnalysysTriger_Schedule()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getSchedule();

	/**
	 * Sets the value of the '{@link mLmodel.AnalysysTriger#getSchedule <em>Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' attribute.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(String value);
} // AnalysysTriger
