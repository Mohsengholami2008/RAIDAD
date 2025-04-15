/**
 */
package mLmodel.impl;

import mLmodel.MLmodelPackage;
import mLmodel.Sparse;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sparse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.SparseImpl#isDefault_value_sparse <em>Default value sparse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SparseImpl extends MinimalEObjectImpl.Container implements Sparse {
	/**
	 * The default value of the '{@link #isDefault_value_sparse() <em>Default value sparse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault_value_sparse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_VALUE_SPARSE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDefault_value_sparse() <em>Default value sparse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault_value_sparse()
	 * @generated
	 * @ordered
	 */
	protected boolean default_value_sparse = DEFAULT_VALUE_SPARSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SparseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.SPARSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefault_value_sparse() {
		return default_value_sparse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault_value_sparse(boolean newDefault_value_sparse) {
		boolean oldDefault_value_sparse = default_value_sparse;
		default_value_sparse = newDefault_value_sparse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.SPARSE__DEFAULT_VALUE_SPARSE,
					oldDefault_value_sparse, default_value_sparse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.SPARSE__DEFAULT_VALUE_SPARSE:
			return isDefault_value_sparse();
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
		case MLmodelPackage.SPARSE__DEFAULT_VALUE_SPARSE:
			setDefault_value_sparse((Boolean) newValue);
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
		case MLmodelPackage.SPARSE__DEFAULT_VALUE_SPARSE:
			setDefault_value_sparse(DEFAULT_VALUE_SPARSE_EDEFAULT);
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
		case MLmodelPackage.SPARSE__DEFAULT_VALUE_SPARSE:
			return default_value_sparse != DEFAULT_VALUE_SPARSE_EDEFAULT;
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
		result.append(" (default_value_sparse: ");
		result.append(default_value_sparse);
		result.append(')');
		return result.toString();
	}

} //SparseImpl
