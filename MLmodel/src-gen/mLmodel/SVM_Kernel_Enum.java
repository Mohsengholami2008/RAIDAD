/**
 */
package mLmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SVM Kernel Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mLmodel.MLmodelPackage#getSVM_Kernel_Enum()
 * @model
 * @generated
 */
public enum SVM_Kernel_Enum implements Enumerator {
	/**
	 * The '<em><b>Linear</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINEAR_VALUE
	 * @generated
	 * @ordered
	 */
	LINEAR(0, "linear", "linear"),

	/**
	 * The '<em><b>Poly</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLY_VALUE
	 * @generated
	 * @ordered
	 */
	POLY(1, "poly", "poly"),

	/**
	 * The '<em><b>Rbf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RBF_VALUE
	 * @generated
	 * @ordered
	 */
	RBF(2, "rbf", "rbf"),

	/**
	 * The '<em><b>Sigmoid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGMOID_VALUE
	 * @generated
	 * @ordered
	 */
	SIGMOID(3, "sigmoid", "sigmoid"),

	/**
	 * The '<em><b>Precomputed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRECOMPUTED_VALUE
	 * @generated
	 * @ordered
	 */
	PRECOMPUTED(4, "precomputed", "precomputed");

	/**
	 * The '<em><b>Linear</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINEAR
	 * @model name="linear"
	 * @generated
	 * @ordered
	 */
	public static final int LINEAR_VALUE = 0;

	/**
	 * The '<em><b>Poly</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLY
	 * @model name="poly"
	 * @generated
	 * @ordered
	 */
	public static final int POLY_VALUE = 1;

	/**
	 * The '<em><b>Rbf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RBF
	 * @model name="rbf"
	 * @generated
	 * @ordered
	 */
	public static final int RBF_VALUE = 2;

	/**
	 * The '<em><b>Sigmoid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGMOID
	 * @model name="sigmoid"
	 * @generated
	 * @ordered
	 */
	public static final int SIGMOID_VALUE = 3;

	/**
	 * The '<em><b>Precomputed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRECOMPUTED
	 * @model name="precomputed"
	 * @generated
	 * @ordered
	 */
	public static final int PRECOMPUTED_VALUE = 4;

	/**
	 * An array of all the '<em><b>SVM Kernel Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SVM_Kernel_Enum[] VALUES_ARRAY = new SVM_Kernel_Enum[] { LINEAR, POLY, RBF, SIGMOID,
			PRECOMPUTED, };

	/**
	 * A public read-only list of all the '<em><b>SVM Kernel Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SVM_Kernel_Enum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SVM Kernel Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SVM_Kernel_Enum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SVM_Kernel_Enum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SVM Kernel Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SVM_Kernel_Enum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SVM_Kernel_Enum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SVM Kernel Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SVM_Kernel_Enum get(int value) {
		switch (value) {
		case LINEAR_VALUE:
			return LINEAR;
		case POLY_VALUE:
			return POLY;
		case RBF_VALUE:
			return RBF;
		case SIGMOID_VALUE:
			return SIGMOID;
		case PRECOMPUTED_VALUE:
			return PRECOMPUTED;
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
	private SVM_Kernel_Enum(int value, String name, String literal) {
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

} //SVM_Kernel_Enum
