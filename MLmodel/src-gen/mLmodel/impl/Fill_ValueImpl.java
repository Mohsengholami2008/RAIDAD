/**
 */
package mLmodel.impl;

import mLmodel.Fill_Value;
import mLmodel.MLmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fill Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.Fill_ValueImpl#getDefault_value_sim_fill <em>Default value sim fill</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fill_ValueImpl extends MinimalEObjectImpl.Container implements Fill_Value {
	/**
	 * The default value of the '{@link #getDefault_value_sim_fill() <em>Default value sim fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_value_sim_fill()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_SIM_FILL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault_value_sim_fill() <em>Default value sim fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_value_sim_fill()
	 * @generated
	 * @ordered
	 */
	protected String default_value_sim_fill = DEFAULT_VALUE_SIM_FILL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fill_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.FILL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault_value_sim_fill() {
		return default_value_sim_fill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault_value_sim_fill(String newDefault_value_sim_fill) {
		String oldDefault_value_sim_fill = default_value_sim_fill;
		default_value_sim_fill = newDefault_value_sim_fill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.FILL_VALUE__DEFAULT_VALUE_SIM_FILL,
					oldDefault_value_sim_fill, default_value_sim_fill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.FILL_VALUE__DEFAULT_VALUE_SIM_FILL:
			return getDefault_value_sim_fill();
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
		case MLmodelPackage.FILL_VALUE__DEFAULT_VALUE_SIM_FILL:
			setDefault_value_sim_fill((String) newValue);
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
		case MLmodelPackage.FILL_VALUE__DEFAULT_VALUE_SIM_FILL:
			setDefault_value_sim_fill(DEFAULT_VALUE_SIM_FILL_EDEFAULT);
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
		case MLmodelPackage.FILL_VALUE__DEFAULT_VALUE_SIM_FILL:
			return DEFAULT_VALUE_SIM_FILL_EDEFAULT == null ? default_value_sim_fill != null
					: !DEFAULT_VALUE_SIM_FILL_EDEFAULT.equals(default_value_sim_fill);
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
		result.append(" (default_value_sim_fill: ");
		result.append(default_value_sim_fill);
		result.append(')');
		return result.toString();
	}

} //Fill_ValueImpl
