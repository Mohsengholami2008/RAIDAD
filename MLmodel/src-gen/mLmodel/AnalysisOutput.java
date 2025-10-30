/**
 */
package mLmodel;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.AnalysisOutput#getAction <em>Action</em>}</li>
 *   <li>{@link mLmodel.AnalysisOutput#getResultValue <em>Result Value</em>}</li>
 *   <li>{@link mLmodel.AnalysisOutput#getResultType <em>Result Type</em>}</li>
 *   <li>{@link mLmodel.AnalysisOutput#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getAnalysisOutput()
 * @model
 * @generated
 */
public interface AnalysisOutput extends Evaluation_Methods {

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Action)
	 * @see mLmodel.MLmodelPackage#getAnalysisOutput_Action()
	 * @model
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link mLmodel.AnalysisOutput#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Result Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Value</em>' attribute.
	 * @see #setResultValue(String)
	 * @see mLmodel.MLmodelPackage#getAnalysisOutput_ResultValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getResultValue();

	/**
	 * Sets the value of the '{@link mLmodel.AnalysisOutput#getResultValue <em>Result Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Value</em>' attribute.
	 * @see #getResultValue()
	 * @generated
	 */
	void setResultValue(String value);

	/**
	 * Returns the value of the '<em><b>Result Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Type</em>' attribute.
	 * @see #setResultType(String)
	 * @see mLmodel.MLmodelPackage#getAnalysisOutput_ResultType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getResultType();

	/**
	 * Sets the value of the '{@link mLmodel.AnalysisOutput#getResultType <em>Result Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Type</em>' attribute.
	 * @see #getResultType()
	 * @generated
	 */
	void setResultType(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(XMLGregorianCalendar)
	 * @see mLmodel.MLmodelPackage#getAnalysisOutput_Timestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 * @generated
	 */
	XMLGregorianCalendar getTimestamp();

	/**
	 * Sets the value of the '{@link mLmodel.AnalysisOutput#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(XMLGregorianCalendar value);
} // AnalysisOutput
