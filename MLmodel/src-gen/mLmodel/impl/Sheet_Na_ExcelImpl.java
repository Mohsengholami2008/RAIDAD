/**
 */
package mLmodel.impl;

import mLmodel.MLmodelPackage;
import mLmodel.Sheet_Na_Excel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sheet Na Excel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.Sheet_Na_ExcelImpl#getDefault_val_sheet <em>Default val sheet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Sheet_Na_ExcelImpl extends MinimalEObjectImpl.Container implements Sheet_Na_Excel {
	/**
	 * The default value of the '{@link #getDefault_val_sheet() <em>Default val sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_val_sheet()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_VAL_SHEET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefault_val_sheet() <em>Default val sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_val_sheet()
	 * @generated
	 * @ordered
	 */
	protected int default_val_sheet = DEFAULT_VAL_SHEET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sheet_Na_ExcelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.SHEET_NA_EXCEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefault_val_sheet() {
		return default_val_sheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault_val_sheet(int newDefault_val_sheet) {
		int oldDefault_val_sheet = default_val_sheet;
		default_val_sheet = newDefault_val_sheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.SHEET_NA_EXCEL__DEFAULT_VAL_SHEET,
					oldDefault_val_sheet, default_val_sheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.SHEET_NA_EXCEL__DEFAULT_VAL_SHEET:
			return getDefault_val_sheet();
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
		case MLmodelPackage.SHEET_NA_EXCEL__DEFAULT_VAL_SHEET:
			setDefault_val_sheet((Integer) newValue);
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
		case MLmodelPackage.SHEET_NA_EXCEL__DEFAULT_VAL_SHEET:
			setDefault_val_sheet(DEFAULT_VAL_SHEET_EDEFAULT);
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
		case MLmodelPackage.SHEET_NA_EXCEL__DEFAULT_VAL_SHEET:
			return default_val_sheet != DEFAULT_VAL_SHEET_EDEFAULT;
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
		result.append(" (default_val_sheet: ");
		result.append(default_val_sheet);
		result.append(')');
		return result.toString();
	}

} //Sheet_Na_ExcelImpl
