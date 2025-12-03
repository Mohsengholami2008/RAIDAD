/**
 */
package mLmodel.impl;

import mLmodel.Devices;
import mLmodel.MLmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Devices</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.DevicesImpl#getREQUIRED_DEVICES <em>REQUIRED DEVICES</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DevicesImpl extends MinimalEObjectImpl.Container implements Devices {
	/**
	 * The default value of the '{@link #getREQUIRED_DEVICES() <em>REQUIRED DEVICES</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getREQUIRED_DEVICES()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRED_DEVICES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getREQUIRED_DEVICES() <em>REQUIRED DEVICES</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getREQUIRED_DEVICES()
	 * @generated
	 * @ordered
	 */
	protected String requireD_DEVICES = REQUIRED_DEVICES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevicesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.DEVICES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getREQUIRED_DEVICES() {
		return requireD_DEVICES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setREQUIRED_DEVICES(String newREQUIRED_DEVICES) {
		String oldREQUIRED_DEVICES = requireD_DEVICES;
		requireD_DEVICES = newREQUIRED_DEVICES;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.DEVICES__REQUIRED_DEVICES,
					oldREQUIRED_DEVICES, requireD_DEVICES));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.DEVICES__REQUIRED_DEVICES:
			return getREQUIRED_DEVICES();
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
		case MLmodelPackage.DEVICES__REQUIRED_DEVICES:
			setREQUIRED_DEVICES((String) newValue);
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
		case MLmodelPackage.DEVICES__REQUIRED_DEVICES:
			setREQUIRED_DEVICES(REQUIRED_DEVICES_EDEFAULT);
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
		case MLmodelPackage.DEVICES__REQUIRED_DEVICES:
			return REQUIRED_DEVICES_EDEFAULT == null ? requireD_DEVICES != null
					: !REQUIRED_DEVICES_EDEFAULT.equals(requireD_DEVICES);
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
		result.append(" (REQUIRED_DEVICES: ");
		result.append(requireD_DEVICES);
		result.append(')');
		return result.toString();
	}

} //DevicesImpl
