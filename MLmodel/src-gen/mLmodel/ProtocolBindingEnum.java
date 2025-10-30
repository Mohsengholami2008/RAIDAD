/**
 */
package mLmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Protocol Binding Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mLmodel.MLmodelPackage#getProtocolBindingEnum()
 * @model
 * @generated
 */
public enum ProtocolBindingEnum implements Enumerator {
	/**
	 * The '<em><b>HTTP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP(0, "HTTP", "HTTP"),

	/**
	 * The '<em><b>MQTT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MQTT_VALUE
	 * @generated
	 * @ordered
	 */
	MQTT(1, "MQTT", "MQTT"),

	/**
	 * The '<em><b>Co AP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO_AP_VALUE
	 * @generated
	 * @ordered
	 */
	CO_AP(2, "CoAP", "CoAP");

	/**
	 * The '<em><b>HTTP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_VALUE = 0;

	/**
	 * The '<em><b>MQTT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MQTT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MQTT_VALUE = 1;

	/**
	 * The '<em><b>Co AP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO_AP
	 * @model name="CoAP"
	 * @generated
	 * @ordered
	 */
	public static final int CO_AP_VALUE = 2;

	/**
	 * An array of all the '<em><b>Protocol Binding Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProtocolBindingEnum[] VALUES_ARRAY = new ProtocolBindingEnum[] { HTTP, MQTT, CO_AP, };

	/**
	 * A public read-only list of all the '<em><b>Protocol Binding Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProtocolBindingEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Protocol Binding Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtocolBindingEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtocolBindingEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protocol Binding Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtocolBindingEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtocolBindingEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protocol Binding Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtocolBindingEnum get(int value) {
		switch (value) {
		case HTTP_VALUE:
			return HTTP;
		case MQTT_VALUE:
			return MQTT;
		case CO_AP_VALUE:
			return CO_AP;
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
	private ProtocolBindingEnum(int value, String name, String literal) {
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

} //ProtocolBindingEnum
