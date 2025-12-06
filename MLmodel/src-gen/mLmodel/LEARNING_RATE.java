/**
 */
package mLmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>LEARNING RATE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mLmodel.MLmodelPackage#getLEARNING_RATE()
 * @model
 * @generated
 */
public enum LEARNING_RATE implements Enumerator {
	/**
	 * The '<em><b>Optimal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	OPTIMAL(0, "optimal", "optimal"),

	/**
	 * The '<em><b>Constant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTANT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTANT(1, "constant", "constant"),

	/**
	 * The '<em><b>Invscaling</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVSCALING_VALUE
	 * @generated
	 * @ordered
	 */
	INVSCALING(2, "invscaling", "invscaling"),

	/**
	 * The '<em><b>Adaptive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADAPTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ADAPTIVE(3, "adaptive", "adaptive");

	/**
	 * The '<em><b>Optimal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIMAL
	 * @model name="optimal"
	 * @generated
	 * @ordered
	 */
	public static final int OPTIMAL_VALUE = 0;

	/**
	 * The '<em><b>Constant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTANT
	 * @model name="constant"
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANT_VALUE = 1;

	/**
	 * The '<em><b>Invscaling</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVSCALING
	 * @model name="invscaling"
	 * @generated
	 * @ordered
	 */
	public static final int INVSCALING_VALUE = 2;

	/**
	 * The '<em><b>Adaptive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADAPTIVE
	 * @model name="adaptive"
	 * @generated
	 * @ordered
	 */
	public static final int ADAPTIVE_VALUE = 3;

	/**
	 * An array of all the '<em><b>LEARNING RATE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LEARNING_RATE[] VALUES_ARRAY = new LEARNING_RATE[] { OPTIMAL, CONSTANT, INVSCALING,
			ADAPTIVE, };

	/**
	 * A public read-only list of all the '<em><b>LEARNING RATE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LEARNING_RATE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>LEARNING RATE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LEARNING_RATE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LEARNING_RATE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>LEARNING RATE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LEARNING_RATE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LEARNING_RATE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>LEARNING RATE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LEARNING_RATE get(int value) {
		switch (value) {
		case OPTIMAL_VALUE:
			return OPTIMAL;
		case CONSTANT_VALUE:
			return CONSTANT;
		case INVSCALING_VALUE:
			return INVSCALING;
		case ADAPTIVE_VALUE:
			return ADAPTIVE;
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
	private LEARNING_RATE(int value, String name, String literal) {
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

} //LEARNING_RATE
