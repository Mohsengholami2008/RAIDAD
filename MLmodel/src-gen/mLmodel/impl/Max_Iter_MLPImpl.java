/**
 */
package mLmodel.impl;

import mLmodel.MLmodelPackage;
import mLmodel.Max_Iter_MLP;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Max Iter MLP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.Max_Iter_MLPImpl#getMax_iter <em>Max iter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Max_Iter_MLPImpl extends MinimalEObjectImpl.Container implements Max_Iter_MLP {
	/**
	 * The default value of the '{@link #getMax_iter() <em>Max iter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_iter()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ITER_EDEFAULT = 200;

	/**
	 * The cached value of the '{@link #getMax_iter() <em>Max iter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_iter()
	 * @generated
	 * @ordered
	 */
	protected int max_iter = MAX_ITER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Max_Iter_MLPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.MAX_ITER_MLP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMax_iter() {
		return max_iter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_iter(int newMax_iter) {
		int oldMax_iter = max_iter;
		max_iter = newMax_iter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.MAX_ITER_MLP__MAX_ITER, oldMax_iter,
					max_iter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.MAX_ITER_MLP__MAX_ITER:
			return getMax_iter();
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
		case MLmodelPackage.MAX_ITER_MLP__MAX_ITER:
			setMax_iter((Integer) newValue);
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
		case MLmodelPackage.MAX_ITER_MLP__MAX_ITER:
			setMax_iter(MAX_ITER_EDEFAULT);
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
		case MLmodelPackage.MAX_ITER_MLP__MAX_ITER:
			return max_iter != MAX_ITER_EDEFAULT;
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
		result.append(" (max_iter: ");
		result.append(max_iter);
		result.append(')');
		return result.toString();
	}

} //Max_Iter_MLPImpl
