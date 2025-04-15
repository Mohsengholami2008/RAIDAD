/**
 */
package mLmodel.impl;

import mLmodel.Drop;
import mLmodel.MLmodelPackage;
import mLmodel.OneHot_Drop_Arg;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.DropImpl#getDefault_value_drop <em>Default value drop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DropImpl extends MinimalEObjectImpl.Container implements Drop {
	/**
	 * The default value of the '{@link #getDefault_value_drop() <em>Default value drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_value_drop()
	 * @generated
	 * @ordered
	 */
	protected static final OneHot_Drop_Arg DEFAULT_VALUE_DROP_EDEFAULT = OneHot_Drop_Arg.FIRST;

	/**
	 * The cached value of the '{@link #getDefault_value_drop() <em>Default value drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_value_drop()
	 * @generated
	 * @ordered
	 */
	protected OneHot_Drop_Arg default_value_drop = DEFAULT_VALUE_DROP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.DROP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneHot_Drop_Arg getDefault_value_drop() {
		return default_value_drop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault_value_drop(OneHot_Drop_Arg newDefault_value_drop) {
		OneHot_Drop_Arg oldDefault_value_drop = default_value_drop;
		default_value_drop = newDefault_value_drop == null ? DEFAULT_VALUE_DROP_EDEFAULT : newDefault_value_drop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.DROP__DEFAULT_VALUE_DROP,
					oldDefault_value_drop, default_value_drop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.DROP__DEFAULT_VALUE_DROP:
			return getDefault_value_drop();
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
		case MLmodelPackage.DROP__DEFAULT_VALUE_DROP:
			setDefault_value_drop((OneHot_Drop_Arg) newValue);
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
		case MLmodelPackage.DROP__DEFAULT_VALUE_DROP:
			setDefault_value_drop(DEFAULT_VALUE_DROP_EDEFAULT);
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
		case MLmodelPackage.DROP__DEFAULT_VALUE_DROP:
			return default_value_drop != DEFAULT_VALUE_DROP_EDEFAULT;
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
		result.append(" (default_value_drop: ");
		result.append(default_value_drop);
		result.append(')');
		return result.toString();
	}

} //DropImpl
