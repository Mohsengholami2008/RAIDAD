/**
 */
package mLmodel.impl;

import mLmodel.Enum_CSV_Sep;
import mLmodel.MLmodelPackage;
import mLmodel.Sep;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sep</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.SepImpl#getDefault_value_sep <em>Default value sep</em>}</li>
 *   <li>{@link mLmodel.impl.SepImpl#isManual_sep <em>Manual sep</em>}</li>
 *   <li>{@link mLmodel.impl.SepImpl#getDefine <em>Define</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SepImpl extends MinimalEObjectImpl.Container implements Sep {
	/**
	 * The default value of the '{@link #getDefault_value_sep() <em>Default value sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_value_sep()
	 * @generated
	 * @ordered
	 */
	protected static final Enum_CSV_Sep DEFAULT_VALUE_SEP_EDEFAULT = Enum_CSV_Sep.COLON;

	/**
	 * The cached value of the '{@link #getDefault_value_sep() <em>Default value sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_value_sep()
	 * @generated
	 * @ordered
	 */
	protected Enum_CSV_Sep default_value_sep = DEFAULT_VALUE_SEP_EDEFAULT;

	/**
	 * The default value of the '{@link #isManual_sep() <em>Manual sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManual_sep()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANUAL_SEP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isManual_sep() <em>Manual sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isManual_sep()
	 * @generated
	 * @ordered
	 */
	protected boolean manual_sep = MANUAL_SEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefine() <em>Define</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefine()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefine() <em>Define</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefine()
	 * @generated
	 * @ordered
	 */
	protected String define = DEFINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.SEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enum_CSV_Sep getDefault_value_sep() {
		return default_value_sep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault_value_sep(Enum_CSV_Sep newDefault_value_sep) {
		Enum_CSV_Sep oldDefault_value_sep = default_value_sep;
		default_value_sep = newDefault_value_sep == null ? DEFAULT_VALUE_SEP_EDEFAULT : newDefault_value_sep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.SEP__DEFAULT_VALUE_SEP,
					oldDefault_value_sep, default_value_sep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isManual_sep() {
		return manual_sep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManual_sep(boolean newManual_sep) {
		boolean oldManual_sep = manual_sep;
		manual_sep = newManual_sep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.SEP__MANUAL_SEP, oldManual_sep,
					manual_sep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefine() {
		return define;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefine(String newDefine) {
		String oldDefine = define;
		define = newDefine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.SEP__DEFINE, oldDefine, define));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.SEP__DEFAULT_VALUE_SEP:
			return getDefault_value_sep();
		case MLmodelPackage.SEP__MANUAL_SEP:
			return isManual_sep();
		case MLmodelPackage.SEP__DEFINE:
			return getDefine();
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
		case MLmodelPackage.SEP__DEFAULT_VALUE_SEP:
			setDefault_value_sep((Enum_CSV_Sep) newValue);
			return;
		case MLmodelPackage.SEP__MANUAL_SEP:
			setManual_sep((Boolean) newValue);
			return;
		case MLmodelPackage.SEP__DEFINE:
			setDefine((String) newValue);
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
		case MLmodelPackage.SEP__DEFAULT_VALUE_SEP:
			setDefault_value_sep(DEFAULT_VALUE_SEP_EDEFAULT);
			return;
		case MLmodelPackage.SEP__MANUAL_SEP:
			setManual_sep(MANUAL_SEP_EDEFAULT);
			return;
		case MLmodelPackage.SEP__DEFINE:
			setDefine(DEFINE_EDEFAULT);
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
		case MLmodelPackage.SEP__DEFAULT_VALUE_SEP:
			return default_value_sep != DEFAULT_VALUE_SEP_EDEFAULT;
		case MLmodelPackage.SEP__MANUAL_SEP:
			return manual_sep != MANUAL_SEP_EDEFAULT;
		case MLmodelPackage.SEP__DEFINE:
			return DEFINE_EDEFAULT == null ? define != null : !DEFINE_EDEFAULT.equals(define);
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
		result.append(" (default_value_sep: ");
		result.append(default_value_sep);
		result.append(", manual_sep: ");
		result.append(manual_sep);
		result.append(", define: ");
		result.append(define);
		result.append(')');
		return result.toString();
	}

} //SepImpl
