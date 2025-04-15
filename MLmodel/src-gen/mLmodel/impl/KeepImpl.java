/**
 */
package mLmodel.impl;

import mLmodel.Dup_Arg_Keep;
import mLmodel.Keep;
import mLmodel.MLmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Keep</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.KeepImpl#getDup_keep <em>Dup keep</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeepImpl extends MinimalEObjectImpl.Container implements Keep {
	/**
	 * The default value of the '{@link #getDup_keep() <em>Dup keep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDup_keep()
	 * @generated
	 * @ordered
	 */
	protected static final Dup_Arg_Keep DUP_KEEP_EDEFAULT = Dup_Arg_Keep.FIRST;

	/**
	 * The cached value of the '{@link #getDup_keep() <em>Dup keep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDup_keep()
	 * @generated
	 * @ordered
	 */
	protected Dup_Arg_Keep dup_keep = DUP_KEEP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.KEEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dup_Arg_Keep getDup_keep() {
		return dup_keep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDup_keep(Dup_Arg_Keep newDup_keep) {
		Dup_Arg_Keep oldDup_keep = dup_keep;
		dup_keep = newDup_keep == null ? DUP_KEEP_EDEFAULT : newDup_keep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.KEEP__DUP_KEEP, oldDup_keep,
					dup_keep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.KEEP__DUP_KEEP:
			return getDup_keep();
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
		case MLmodelPackage.KEEP__DUP_KEEP:
			setDup_keep((Dup_Arg_Keep) newValue);
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
		case MLmodelPackage.KEEP__DUP_KEEP:
			setDup_keep(DUP_KEEP_EDEFAULT);
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
		case MLmodelPackage.KEEP__DUP_KEEP:
			return dup_keep != DUP_KEEP_EDEFAULT;
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
		result.append(" (dup_keep: ");
		result.append(dup_keep);
		result.append(')');
		return result.toString();
	}

} //KeepImpl
