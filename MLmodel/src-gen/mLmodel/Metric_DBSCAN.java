/**
 */
package mLmodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Metric DBSCAN</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mLmodel.MLmodelPackage#getMetric_DBSCAN()
 * @model
 * @generated
 */
public enum Metric_DBSCAN implements Enumerator {
	/**
	 * The '<em><b>Euclidean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EUCLIDEAN_VALUE
	 * @generated
	 * @ordered
	 */
	EUCLIDEAN(0, "euclidean", "euclidean"),

	/**
	 * The '<em><b>Cosine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COSINE_VALUE
	 * @generated
	 * @ordered
	 */
	COSINE(1, "cosine", "cosine"),

	/**
	 * The '<em><b>Manhattan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANHATTAN_VALUE
	 * @generated
	 * @ordered
	 */
	MANHATTAN(2, "manhattan", "manhattan");

	/**
	 * The '<em><b>Euclidean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EUCLIDEAN
	 * @model name="euclidean"
	 * @generated
	 * @ordered
	 */
	public static final int EUCLIDEAN_VALUE = 0;

	/**
	 * The '<em><b>Cosine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COSINE
	 * @model name="cosine"
	 * @generated
	 * @ordered
	 */
	public static final int COSINE_VALUE = 1;

	/**
	 * The '<em><b>Manhattan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANHATTAN
	 * @model name="manhattan"
	 * @generated
	 * @ordered
	 */
	public static final int MANHATTAN_VALUE = 2;

	/**
	 * An array of all the '<em><b>Metric DBSCAN</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Metric_DBSCAN[] VALUES_ARRAY = new Metric_DBSCAN[] { EUCLIDEAN, COSINE, MANHATTAN, };

	/**
	 * A public read-only list of all the '<em><b>Metric DBSCAN</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Metric_DBSCAN> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Metric DBSCAN</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Metric_DBSCAN get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Metric_DBSCAN result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Metric DBSCAN</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Metric_DBSCAN getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Metric_DBSCAN result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Metric DBSCAN</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Metric_DBSCAN get(int value) {
		switch (value) {
		case EUCLIDEAN_VALUE:
			return EUCLIDEAN;
		case COSINE_VALUE:
			return COSINE;
		case MANHATTAN_VALUE:
			return MANHATTAN;
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
	private Metric_DBSCAN(int value, String name, String literal) {
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

} //Metric_DBSCAN
