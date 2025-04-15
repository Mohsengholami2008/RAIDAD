/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keep</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Keep#getDup_keep <em>Dup keep</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getKeep()
 * @model
 * @generated
 */
public interface Keep extends Duplicates_Argumans {
	/**
	 * Returns the value of the '<em><b>Dup keep</b></em>' attribute.
	 * The literals are from the enumeration {@link mLmodel.Dup_Arg_Keep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dup keep</em>' attribute.
	 * @see mLmodel.Dup_Arg_Keep
	 * @see #setDup_keep(Dup_Arg_Keep)
	 * @see mLmodel.MLmodelPackage#getKeep_Dup_keep()
	 * @model
	 * @generated
	 */
	Dup_Arg_Keep getDup_keep();

	/**
	 * Sets the value of the '{@link mLmodel.Keep#getDup_keep <em>Dup keep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dup keep</em>' attribute.
	 * @see mLmodel.Dup_Arg_Keep
	 * @see #getDup_keep()
	 * @generated
	 */
	void setDup_keep(Dup_Arg_Keep value);

} // Keep
