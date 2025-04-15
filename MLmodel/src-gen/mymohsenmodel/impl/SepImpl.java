/**
 */
package mymohsenmodel.impl;

import mymohsenmodel.Enum_CSV_Sep;
import mymohsenmodel.MLmodelPackage;
import mymohsenmodel.Sep;

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
 *   <li>{@link mymohsenmodel.impl.SepImpl#getDefault_value <em>Default value</em>}</li>
 *   <li>{@link mymohsenmodel.impl.SepImpl#isManual_sep <em>Manual sep</em>}</li>
 *   <li>{@link mymohsenmodel.impl.SepImpl#getDefine <em>Define</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SepImpl extends MinimalEObjectImpl.Container implements Sep {
	/**
	 * The default value of the '{@link #getDefault_value() <em>Default value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_value()
	 * @generated
	 * @ordered
	 */
	protected static final Enum_CSV_Sep DEFAULT_VALUE_EDEFAULT = Enum_CSV_Sep.COLON;

	/**
	 * The cached value of the '{@link #getDefault_value() <em>Default value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_value()
	 * @generated
	 * @ordered
	 */
	protected Enum_CSV_Sep default_value = DEFAULT_VALUE_EDEFAULT;

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
	public Enum_CSV_Sep getDefault_value() {
		return default_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault_value(Enum_CSV_Sep newDefault_value) {
		Enum_CSV_Sep oldDefault_value = default_value;
		default_value = newDefault_value == null ? DEFAULT_VALUE_EDEFAULT : newDefault_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.SEP__DEFAULT_VALUE, oldDefault_value,
					default_value));
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
		case MLmodelPackage.SEP__DEFAULT_VALUE:
			return getDefault_value();
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
		case MLmodelPackage.SEP__DEFAULT_VALUE:
			setDefault_value((Enum_CSV_Sep) newValue);
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
		case MLmodelPackage.SEP__DEFAULT_VALUE:
			setDefault_value(DEFAULT_VALUE_EDEFAULT);
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
		case MLmodelPackage.SEP__DEFAULT_VALUE:
			return default_value != DEFAULT_VALUE_EDEFAULT;
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
		result.append(" (default_value: ");
		result.append(default_value);
		result.append(", manual_sep: ");
		result.append(manual_sep);
		result.append(", define: ");
		result.append(define);
		result.append(')');
		return result.toString();
	}

} //SepImpl
