/**
 */
package mLmodel.impl;

import mLmodel.MLmodelPackage;
import mLmodel.Random_State_MLP;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Random State MLP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.Random_State_MLPImpl#getRandom_state <em>Random state</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Random_State_MLPImpl extends MinimalEObjectImpl.Container implements Random_State_MLP {
	/**
	 * The default value of the '{@link #getRandom_state() <em>Random state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandom_state()
	 * @generated
	 * @ordered
	 */
	protected static final int RANDOM_STATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRandom_state() <em>Random state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandom_state()
	 * @generated
	 * @ordered
	 */
	protected int random_state = RANDOM_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Random_State_MLPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.RANDOM_STATE_MLP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRandom_state() {
		return random_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRandom_state(int newRandom_state) {
		int oldRandom_state = random_state;
		random_state = newRandom_state;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.RANDOM_STATE_MLP__RANDOM_STATE,
					oldRandom_state, random_state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.RANDOM_STATE_MLP__RANDOM_STATE:
			return getRandom_state();
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
		case MLmodelPackage.RANDOM_STATE_MLP__RANDOM_STATE:
			setRandom_state((Integer) newValue);
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
		case MLmodelPackage.RANDOM_STATE_MLP__RANDOM_STATE:
			setRandom_state(RANDOM_STATE_EDEFAULT);
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
		case MLmodelPackage.RANDOM_STATE_MLP__RANDOM_STATE:
			return random_state != RANDOM_STATE_EDEFAULT;
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
		result.append(" (random_state: ");
		result.append(random_state);
		result.append(')');
		return result.toString();
	}

} //Random_State_MLPImpl
