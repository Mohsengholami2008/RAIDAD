/**
 */
package mLmodel.impl;

import mLmodel.Handle_Unk;
import mLmodel.MLmodelPackage;
import mLmodel.OneHot_HandleUn_Arg;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Handle Unk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.Handle_UnkImpl#getDefault_value_handle <em>Default value handle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Handle_UnkImpl extends MinimalEObjectImpl.Container implements Handle_Unk {
	/**
	 * The default value of the '{@link #getDefault_value_handle() <em>Default value handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_value_handle()
	 * @generated
	 * @ordered
	 */
	protected static final OneHot_HandleUn_Arg DEFAULT_VALUE_HANDLE_EDEFAULT = OneHot_HandleUn_Arg.ERROR;

	/**
	 * The cached value of the '{@link #getDefault_value_handle() <em>Default value handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_value_handle()
	 * @generated
	 * @ordered
	 */
	protected OneHot_HandleUn_Arg default_value_handle = DEFAULT_VALUE_HANDLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Handle_UnkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.HANDLE_UNK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneHot_HandleUn_Arg getDefault_value_handle() {
		return default_value_handle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault_value_handle(OneHot_HandleUn_Arg newDefault_value_handle) {
		OneHot_HandleUn_Arg oldDefault_value_handle = default_value_handle;
		default_value_handle = newDefault_value_handle == null ? DEFAULT_VALUE_HANDLE_EDEFAULT
				: newDefault_value_handle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.HANDLE_UNK__DEFAULT_VALUE_HANDLE,
					oldDefault_value_handle, default_value_handle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.HANDLE_UNK__DEFAULT_VALUE_HANDLE:
			return getDefault_value_handle();
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
		case MLmodelPackage.HANDLE_UNK__DEFAULT_VALUE_HANDLE:
			setDefault_value_handle((OneHot_HandleUn_Arg) newValue);
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
		case MLmodelPackage.HANDLE_UNK__DEFAULT_VALUE_HANDLE:
			setDefault_value_handle(DEFAULT_VALUE_HANDLE_EDEFAULT);
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
		case MLmodelPackage.HANDLE_UNK__DEFAULT_VALUE_HANDLE:
			return default_value_handle != DEFAULT_VALUE_HANDLE_EDEFAULT;
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
		result.append(" (default_value_handle: ");
		result.append(default_value_handle);
		result.append(')');
		return result.toString();
	}

} //Handle_UnkImpl
