/**
 */
package mLmodel.impl;

import mLmodel.MLmodelPackage;
import mLmodel.Nrows;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nrows</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.NrowsImpl#getDefault_value_nrows <em>Default value nrows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NrowsImpl extends MinimalEObjectImpl.Container implements Nrows {
	/**
	 * The default value of the '{@link #getDefault_value_nrows() <em>Default value nrows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_value_nrows()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_VALUE_NROWS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefault_value_nrows() <em>Default value nrows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_value_nrows()
	 * @generated
	 * @ordered
	 */
	protected int default_value_nrows = DEFAULT_VALUE_NROWS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NrowsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.NROWS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefault_value_nrows() {
		return default_value_nrows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault_value_nrows(int newDefault_value_nrows) {
		int oldDefault_value_nrows = default_value_nrows;
		default_value_nrows = newDefault_value_nrows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.NROWS__DEFAULT_VALUE_NROWS,
					oldDefault_value_nrows, default_value_nrows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.NROWS__DEFAULT_VALUE_NROWS:
			return getDefault_value_nrows();
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
		case MLmodelPackage.NROWS__DEFAULT_VALUE_NROWS:
			setDefault_value_nrows((Integer) newValue);
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
		case MLmodelPackage.NROWS__DEFAULT_VALUE_NROWS:
			setDefault_value_nrows(DEFAULT_VALUE_NROWS_EDEFAULT);
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
		case MLmodelPackage.NROWS__DEFAULT_VALUE_NROWS:
			return default_value_nrows != DEFAULT_VALUE_NROWS_EDEFAULT;
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
		result.append(" (default_value_nrows: ");
		result.append(default_value_nrows);
		result.append(')');
		return result.toString();
	}

} //NrowsImpl
