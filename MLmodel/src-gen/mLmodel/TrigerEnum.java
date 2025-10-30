/**
 */
package mLmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Triger Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mLmodel.MLmodelPackage#getTrigerEnum()
 * @model
 * @generated
 */
public enum TrigerEnum implements Enumerator {
	/**
	 * The '<em><b>Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	EVENT(0, "Event", "Event"),

	/**
	 * The '<em><b>Timer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMER_VALUE
	 * @generated
	 * @ordered
	 */
	TIMER(1, "Timer", "Timer"),

	/**
	 * The '<em><b>Data Update</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_UPDATE(2, "DataUpdate", "DataUpdate");

	/**
	 * The '<em><b>Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT
	 * @model name="Event"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_VALUE = 0;

	/**
	 * The '<em><b>Timer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMER
	 * @model name="Timer"
	 * @generated
	 * @ordered
	 */
	public static final int TIMER_VALUE = 1;

	/**
	 * The '<em><b>Data Update</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_UPDATE
	 * @model name="DataUpdate"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_UPDATE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Triger Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TrigerEnum[] VALUES_ARRAY = new TrigerEnum[] { EVENT, TIMER, DATA_UPDATE, };

	/**
	 * A public read-only list of all the '<em><b>Triger Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TrigerEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Triger Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TrigerEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TrigerEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Triger Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TrigerEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TrigerEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Triger Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TrigerEnum get(int value) {
		switch (value) {
		case EVENT_VALUE:
			return EVENT;
		case TIMER_VALUE:
			return TIMER;
		case DATA_UPDATE_VALUE:
			return DATA_UPDATE;
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
	private TrigerEnum(int value, String name, String literal) {
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

} //TrigerEnum
