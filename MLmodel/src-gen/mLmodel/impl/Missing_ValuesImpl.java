/**
 */
package mLmodel.impl;

import mLmodel.MLmodelPackage;
import mLmodel.Missing_Values;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Missing Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.Missing_ValuesImpl#getDefault_value_si_miss <em>Default value si miss</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Missing_ValuesImpl extends MinimalEObjectImpl.Container implements Missing_Values {
	/**
	 * The default value of the '{@link #getDefault_value_si_miss() <em>Default value si miss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_value_si_miss()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_SI_MISS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault_value_si_miss() <em>Default value si miss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_value_si_miss()
	 * @generated
	 * @ordered
	 */
	protected String default_value_si_miss = DEFAULT_VALUE_SI_MISS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Missing_ValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.MISSING_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault_value_si_miss() {
		return default_value_si_miss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault_value_si_miss(String newDefault_value_si_miss) {
		String oldDefault_value_si_miss = default_value_si_miss;
		default_value_si_miss = newDefault_value_si_miss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.MISSING_VALUES__DEFAULT_VALUE_SI_MISS,
					oldDefault_value_si_miss, default_value_si_miss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.MISSING_VALUES__DEFAULT_VALUE_SI_MISS:
			return getDefault_value_si_miss();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MLmodelPackage.MISSING_VALUES__DEFAULT_VALUE_SI_MISS:
			setDefault_value_si_miss((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MLmodelPackage.MISSING_VALUES__DEFAULT_VALUE_SI_MISS:
			setDefault_value_si_miss(DEFAULT_VALUE_SI_MISS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MLmodelPackage.MISSING_VALUES__DEFAULT_VALUE_SI_MISS:
			return DEFAULT_VALUE_SI_MISS_EDEFAULT == null ? default_value_si_miss != null
					: !DEFAULT_VALUE_SI_MISS_EDEFAULT.equals(default_value_si_miss);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (default_value_si_miss: ");
		result.append(default_value_si_miss);
		result.append(')');
		return result.toString();
	}

} //Missing_ValuesImpl
