/**
 */
package mLmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Neural Network Activation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mLmodel.MLmodelPackage#getNeural_Network_Activation()
 * @model
 * @generated
 */
public enum Neural_Network_Activation implements Enumerator {
	/**
	 * The '<em><b>Identity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	IDENTITY(0, "identity", "identity"),

	/**
	 * The '<em><b>Logistic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGISTIC_VALUE
	 * @generated
	 * @ordered
	 */
	LOGISTIC(1, "logistic", "logistic"),

	/**
	 * The '<em><b>Tanh</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TANH_VALUE
	 * @generated
	 * @ordered
	 */
	TANH(2, "tanh", "tanh"),

	/**
	 * The '<em><b>Relu</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELU_VALUE
	 * @generated
	 * @ordered
	 */
	RELU(3, "relu", "relu");

	/**
	 * The '<em><b>Identity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTITY
	 * @model name="identity"
	 * @generated
	 * @ordered
	 */
	public static final int IDENTITY_VALUE = 0;

	/**
	 * The '<em><b>Logistic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGISTIC
	 * @model name="logistic"
	 * @generated
	 * @ordered
	 */
	public static final int LOGISTIC_VALUE = 1;

	/**
	 * The '<em><b>Tanh</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TANH
	 * @model name="tanh"
	 * @generated
	 * @ordered
	 */
	public static final int TANH_VALUE = 2;

	/**
	 * The '<em><b>Relu</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELU
	 * @model name="relu"
	 * @generated
	 * @ordered
	 */
	public static final int RELU_VALUE = 3;

	/**
	 * An array of all the '<em><b>Neural Network Activation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Neural_Network_Activation[] VALUES_ARRAY = new Neural_Network_Activation[] { IDENTITY,
			LOGISTIC, TANH, RELU, };

	/**
	 * A public read-only list of all the '<em><b>Neural Network Activation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Neural_Network_Activation> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Neural Network Activation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Neural_Network_Activation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Neural_Network_Activation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Neural Network Activation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Neural_Network_Activation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Neural_Network_Activation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Neural Network Activation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Neural_Network_Activation get(int value) {
		switch (value) {
		case IDENTITY_VALUE:
			return IDENTITY;
		case LOGISTIC_VALUE:
			return LOGISTIC;
		case TANH_VALUE:
			return TANH;
		case RELU_VALUE:
			return RELU;
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
	private Neural_Network_Activation(int value, String name, String literal) {
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

} //Neural_Network_Activation
