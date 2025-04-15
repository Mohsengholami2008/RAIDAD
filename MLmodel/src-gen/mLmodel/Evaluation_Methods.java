/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Methods</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Evaluation_Methods#isPrecision <em>Precision</em>}</li>
 *   <li>{@link mLmodel.Evaluation_Methods#isAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link mLmodel.Evaluation_Methods#isRecall <em>Recall</em>}</li>
 *   <li>{@link mLmodel.Evaluation_Methods#isF1_score <em>F1 score</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getEvaluation_Methods()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Evaluation_Methods extends Cycle {
	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(boolean)
	 * @see mLmodel.MLmodelPackage#getEvaluation_Methods_Precision()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isPrecision();

	/**
	 * Sets the value of the '{@link mLmodel.Evaluation_Methods#isPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #isPrecision()
	 * @generated
	 */
	void setPrecision(boolean value);

	/**
	 * Returns the value of the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accuracy</em>' attribute.
	 * @see #setAccuracy(boolean)
	 * @see mLmodel.MLmodelPackage#getEvaluation_Methods_Accuracy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isAccuracy();

	/**
	 * Sets the value of the '{@link mLmodel.Evaluation_Methods#isAccuracy <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy</em>' attribute.
	 * @see #isAccuracy()
	 * @generated
	 */
	void setAccuracy(boolean value);

	/**
	 * Returns the value of the '<em><b>Recall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recall</em>' attribute.
	 * @see #setRecall(boolean)
	 * @see mLmodel.MLmodelPackage#getEvaluation_Methods_Recall()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isRecall();

	/**
	 * Sets the value of the '{@link mLmodel.Evaluation_Methods#isRecall <em>Recall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recall</em>' attribute.
	 * @see #isRecall()
	 * @generated
	 */
	void setRecall(boolean value);

	/**
	 * Returns the value of the '<em><b>F1 score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>F1 score</em>' attribute.
	 * @see #setF1_score(boolean)
	 * @see mLmodel.MLmodelPackage#getEvaluation_Methods_F1_score()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isF1_score();

	/**
	 * Sets the value of the '{@link mLmodel.Evaluation_Methods#isF1_score <em>F1 score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>F1 score</em>' attribute.
	 * @see #isF1_score()
	 * @generated
	 */
	void setF1_score(boolean value);

} // Evaluation_Methods
