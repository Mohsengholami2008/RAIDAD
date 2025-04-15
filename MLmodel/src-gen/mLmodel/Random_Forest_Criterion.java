/**
 */
package mLmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Random Forest Criterion</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mLmodel.MLmodelPackage#getRandom_Forest_Criterion()
 * @model
 * @generated
 */
public enum Random_Forest_Criterion implements Enumerator {
	/**
	 * The '<em><b>Gini</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GINI_VALUE
	 * @generated
	 * @ordered
	 */
	GINI(0, "gini", "gini"),
	/**
	* The '<em><b>Entropy</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #ENTROPY_VALUE
	* @generated
	* @ordered
	*/
	ENTROPY(1, "entropy", "entropy"),
	/**
	* The '<em><b>Log los</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #LOG_LOS_VALUE
	* @generated
	* @ordered
	*/
	LOG_LOS(2, "log_los", "log_los");

	/**
	 * The '<em><b>Gini</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GINI
	 * @model name="gini"
	 * @generated
	 * @ordered
	 */
	public static final int GINI_VALUE = 0;

	/**
	 * The '<em><b>Entropy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTROPY
	 * @model name="entropy"
	 * @generated
	 * @ordered
	 */
	public static final int ENTROPY_VALUE = 1;

	/**
	 * The '<em><b>Log los</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOG_LOS
	 * @model name="log_los"
	 * @generated
	 * @ordered
	 */
	public static final int LOG_LOS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Random Forest Criterion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Random_Forest_Criterion[] VALUES_ARRAY = new Random_Forest_Criterion[] { GINI, ENTROPY,
			LOG_LOS, };

	/**
	 * A public read-only list of all the '<em><b>Random Forest Criterion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Random_Forest_Criterion> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Random Forest Criterion</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Random_Forest_Criterion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Random_Forest_Criterion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Random Forest Criterion</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Random_Forest_Criterion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Random_Forest_Criterion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Random Forest Criterion</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Random_Forest_Criterion get(int value) {
		switch (value) {
		case GINI_VALUE:
			return GINI;
		case ENTROPY_VALUE:
			return ENTROPY;
		case LOG_LOS_VALUE:
			return LOG_LOS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Random_Forest_Criterion(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Random_Forest_Criterion
