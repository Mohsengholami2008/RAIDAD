/**
 */
package mLmodel.impl;

import mLmodel.MLmodelPackage;
import mLmodel.Strategy;
import mLmodel.Strategy_Simple_Imputer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.StrategyImpl#getDefault_value_sim_str <em>Default value sim str</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrategyImpl extends MinimalEObjectImpl.Container implements Strategy {
	/**
	 * The default value of the '{@link #getDefault_value_sim_str() <em>Default value sim str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_value_sim_str()
	 * @generated
	 * @ordered
	 */
	protected static final Strategy_Simple_Imputer DEFAULT_VALUE_SIM_STR_EDEFAULT = Strategy_Simple_Imputer.MEAN;

	/**
	 * The cached value of the '{@link #getDefault_value_sim_str() <em>Default value sim str</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_value_sim_str()
	 * @generated
	 * @ordered
	 */
	protected Strategy_Simple_Imputer default_value_sim_str = DEFAULT_VALUE_SIM_STR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strategy_Simple_Imputer getDefault_value_sim_str() {
		return default_value_sim_str;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault_value_sim_str(Strategy_Simple_Imputer newDefault_value_sim_str) {
		Strategy_Simple_Imputer oldDefault_value_sim_str = default_value_sim_str;
		default_value_sim_str = newDefault_value_sim_str == null ? DEFAULT_VALUE_SIM_STR_EDEFAULT
				: newDefault_value_sim_str;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.STRATEGY__DEFAULT_VALUE_SIM_STR,
					oldDefault_value_sim_str, default_value_sim_str));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.STRATEGY__DEFAULT_VALUE_SIM_STR:
			return getDefault_value_sim_str();
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
		case MLmodelPackage.STRATEGY__DEFAULT_VALUE_SIM_STR:
			setDefault_value_sim_str((Strategy_Simple_Imputer) newValue);
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
		case MLmodelPackage.STRATEGY__DEFAULT_VALUE_SIM_STR:
			setDefault_value_sim_str(DEFAULT_VALUE_SIM_STR_EDEFAULT);
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
		case MLmodelPackage.STRATEGY__DEFAULT_VALUE_SIM_STR:
			return default_value_sim_str != DEFAULT_VALUE_SIM_STR_EDEFAULT;
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
		result.append(" (default_value_sim_str: ");
		result.append(default_value_sim_str);
		result.append(')');
		return result.toString();
	}

} //StrategyImpl
