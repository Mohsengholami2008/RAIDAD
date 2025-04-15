/**
 */
package mLmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Strategy Simple Imputer</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mLmodel.MLmodelPackage#getStrategy_Simple_Imputer()
 * @model
 * @generated
 */
public enum Strategy_Simple_Imputer implements Enumerator {
	/**
	 * The '<em><b>Mean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEAN_VALUE
	 * @generated
	 * @ordered
	 */
	MEAN(0, "mean", "mean"),
	/**
	 * The '<em><b>Median</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #MEDIAN_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIAN(1, "median", "median"),
	/**
	 * The '<em><b>Most frequent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #MOST_FREQUENT_VALUE
	 * @generated
	 * @ordered
	 */
	MOST_FREQUENT(2, "most_frequent", "most_frequent"),
	/**
	 * The '<em><b>Constant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #CONSTANT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTANT(3, "constant", "constant");

	/**
	 * The '<em><b>Mean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEAN
	 * @model name="mean"
	 * @generated
	 * @ordered
	 */
	public static final int MEAN_VALUE = 0;

	/**
	 * The '<em><b>Median</b></em>' literal value.
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @see #MEDIAN
	 * @model name="median"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIAN_VALUE = 1;

	/**
	 * The '<em><b>Most frequent</b></em>' literal value.
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @see #MOST_FREQUENT
	 * @model name="most_frequent"
	 * @generated
	 * @ordered
	 */
	public static final int MOST_FREQUENT_VALUE = 2;

	/**
	 * The '<em><b>Constant</b></em>' literal value.
	 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
	 * @see #CONSTANT
	 * @model name="constant"
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Strategy Simple Imputer</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Strategy_Simple_Imputer[] VALUES_ARRAY = new Strategy_Simple_Imputer[] { MEAN, MEDIAN,
			MOST_FREQUENT, CONSTANT, };

	/**
	 * A public read-only list of all the '<em><b>Strategy Simple Imputer</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Strategy_Simple_Imputer> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Strategy Simple Imputer</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Strategy_Simple_Imputer get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Strategy_Simple_Imputer result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Strategy Simple Imputer</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Strategy_Simple_Imputer getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Strategy_Simple_Imputer result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Strategy Simple Imputer</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Strategy_Simple_Imputer get(int value) {
		switch (value) {
		case MEAN_VALUE:
			return MEAN;
		case MEDIAN_VALUE:
			return MEDIAN;
		case MOST_FREQUENT_VALUE:
			return MOST_FREQUENT;
		case CONSTANT_VALUE:
			return CONSTANT;
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
	private Strategy_Simple_Imputer(int value, String name, String literal) {
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

} //Strategy_Simple_Imputer
