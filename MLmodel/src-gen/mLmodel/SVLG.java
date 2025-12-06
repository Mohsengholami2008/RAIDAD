/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SVLG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.SVLG#getLearning_rate <em>Learning rate</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getSVLG()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SVLG extends OnlineModelManager {

	/**
	 * Returns the value of the '<em><b>Learning rate</b></em>' attribute.
	 * The literals are from the enumeration {@link mLmodel.LEARNING_RATE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learning rate</em>' attribute.
	 * @see mLmodel.LEARNING_RATE
	 * @see #setLearning_rate(LEARNING_RATE)
	 * @see mLmodel.MLmodelPackage#getSVLG_Learning_rate()
	 * @model
	 * @generated
	 */
	LEARNING_RATE getLearning_rate();

	/**
	 * Sets the value of the '{@link mLmodel.SVLG#getLearning_rate <em>Learning rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Learning rate</em>' attribute.
	 * @see mLmodel.LEARNING_RATE
	 * @see #getLearning_rate()
	 * @generated
	 */
	void setLearning_rate(LEARNING_RATE value);
} // SVLG
