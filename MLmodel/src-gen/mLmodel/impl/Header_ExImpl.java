/**
 */
package mLmodel.impl;

import mLmodel.Header_Ex;
import mLmodel.MLmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header Ex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.Header_ExImpl#getDefauld_value_head_ex <em>Defauld value head ex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Header_ExImpl extends MinimalEObjectImpl.Container implements Header_Ex {
	/**
	 * The default value of the '{@link #getDefauld_value_head_ex() <em>Defauld value head ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefauld_value_head_ex()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULD_VALUE_HEAD_EX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefauld_value_head_ex() <em>Defauld value head ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefauld_value_head_ex()
	 * @generated
	 * @ordered
	 */
	protected int defauld_value_head_ex = DEFAULD_VALUE_HEAD_EX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Header_ExImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.HEADER_EX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefauld_value_head_ex() {
		return defauld_value_head_ex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefauld_value_head_ex(int newDefauld_value_head_ex) {
		int oldDefauld_value_head_ex = defauld_value_head_ex;
		defauld_value_head_ex = newDefauld_value_head_ex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.HEADER_EX__DEFAULD_VALUE_HEAD_EX,
					oldDefauld_value_head_ex, defauld_value_head_ex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.HEADER_EX__DEFAULD_VALUE_HEAD_EX:
			return getDefauld_value_head_ex();
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
		case MLmodelPackage.HEADER_EX__DEFAULD_VALUE_HEAD_EX:
			setDefauld_value_head_ex((Integer) newValue);
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
		case MLmodelPackage.HEADER_EX__DEFAULD_VALUE_HEAD_EX:
			setDefauld_value_head_ex(DEFAULD_VALUE_HEAD_EX_EDEFAULT);
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
		case MLmodelPackage.HEADER_EX__DEFAULD_VALUE_HEAD_EX:
			return defauld_value_head_ex != DEFAULD_VALUE_HEAD_EX_EDEFAULT;
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
		result.append(" (defauld_value_head_ex: ");
		result.append(defauld_value_head_ex);
		result.append(')');
		return result.toString();
	}

} //Header_ExImpl
