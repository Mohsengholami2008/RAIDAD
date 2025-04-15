/**
 */
package mLmodel.impl;

import mLmodel.MLmodelPackage;
import mLmodel.N_Estimators_RF;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NEstimators RF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.N_Estimators_RFImpl#getN_estimators <em>Nestimators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class N_Estimators_RFImpl extends MinimalEObjectImpl.Container implements N_Estimators_RF {
	/**
	 * The default value of the '{@link #getN_estimators() <em>Nestimators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN_estimators()
	 * @generated
	 * @ordered
	 */
	protected static final int NESTIMATORS_EDEFAULT = 100;

	/**
	 * The cached value of the '{@link #getN_estimators() <em>Nestimators</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN_estimators()
	 * @generated
	 * @ordered
	 */
	protected int n_estimators = NESTIMATORS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected N_Estimators_RFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.NESTIMATORS_RF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getN_estimators() {
		return n_estimators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setN_estimators(int newN_estimators) {
		int oldN_estimators = n_estimators;
		n_estimators = newN_estimators;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.NESTIMATORS_RF__NESTIMATORS,
					oldN_estimators, n_estimators));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.NESTIMATORS_RF__NESTIMATORS:
			return getN_estimators();
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
		case MLmodelPackage.NESTIMATORS_RF__NESTIMATORS:
			setN_estimators((Integer) newValue);
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
		case MLmodelPackage.NESTIMATORS_RF__NESTIMATORS:
			setN_estimators(NESTIMATORS_EDEFAULT);
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
		case MLmodelPackage.NESTIMATORS_RF__NESTIMATORS:
			return n_estimators != NESTIMATORS_EDEFAULT;
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
		result.append(" (n_estimators: ");
		result.append(n_estimators);
		result.append(')');
		return result.toString();
	}

} //N_Estimators_RFImpl
