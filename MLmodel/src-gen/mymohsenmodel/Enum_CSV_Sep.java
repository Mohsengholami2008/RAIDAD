/**
 */
package mymohsenmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum CSV Sep</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mymohsenmodel.MLmodelPackage#getEnum_CSV_Sep()
 * @model
 * @generated
 */
public enum Enum_CSV_Sep implements Enumerator {
	/**
	 * The '<em><b>Colon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLON_VALUE
	 * @generated
	 * @ordered
	 */
	COLON(0, "colon", ","),

	/**
	 * The '<em><b>Tab</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAB_VALUE
	 * @generated
	 * @ordered
	 */
	TAB(1, "Tab", "\\t"),

	/**
	 * The '<em><b>Semicolon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMICOLON_VALUE
	 * @generated
	 * @ordered
	 */
	SEMICOLON(2, "Semicolon", ";"),

	/**
	 * The '<em><b>Dot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOT_VALUE
	 * @generated
	 * @ordered
	 */
	DOT(3, "dot", "."),

	/**
	 * The '<em><b>LITERAL4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITERAL4_VALUE
	 * @generated
	 * @ordered
	 */
	LITERAL4(4, "LITERAL4", "LITERAL4");

	/**
	 * The '<em><b>Colon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLON
	 * @model name="colon" literal=","
	 * @generated
	 * @ordered
	 */
	public static final int COLON_VALUE = 0;

	/**
	 * The '<em><b>Tab</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAB
	 * @model name="Tab" literal="\\t"
	 * @generated
	 * @ordered
	 */
	public static final int TAB_VALUE = 1;

	/**
	 * The '<em><b>Semicolon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEMICOLON
	 * @model name="Semicolon" literal=";"
	 * @generated
	 * @ordered
	 */
	public static final int SEMICOLON_VALUE = 2;

	/**
	 * The '<em><b>Dot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOT
	 * @model name="dot" literal="."
	 * @generated
	 * @ordered
	 */
	public static final int DOT_VALUE = 3;

	/**
	 * The '<em><b>LITERAL4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITERAL4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LITERAL4_VALUE = 4;

	/**
	 * An array of all the '<em><b>Enum CSV Sep</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Enum_CSV_Sep[] VALUES_ARRAY = new Enum_CSV_Sep[] { COLON, TAB, SEMICOLON, DOT, LITERAL4, };

	/**
	 * A public read-only list of all the '<em><b>Enum CSV Sep</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Enum_CSV_Sep> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum CSV Sep</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Enum_CSV_Sep get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Enum_CSV_Sep result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum CSV Sep</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Enum_CSV_Sep getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Enum_CSV_Sep result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum CSV Sep</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Enum_CSV_Sep get(int value) {
		switch (value) {
		case COLON_VALUE:
			return COLON;
		case TAB_VALUE:
			return TAB;
		case SEMICOLON_VALUE:
			return SEMICOLON;
		case DOT_VALUE:
			return DOT;
		case LITERAL4_VALUE:
			return LITERAL4;
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
	private Enum_CSV_Sep(int value, String name, String literal) {
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

} //Enum_CSV_Sep
