/**
 */
package mLmodel.impl;

import mLmodel.Categories;
import mLmodel.MLmodelPackage;
import mLmodel.OneHot_Cat_Arg;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Categories</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.CategoriesImpl#getDefault_value_cat <em>Default value cat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoriesImpl extends MinimalEObjectImpl.Container implements Categories {
	/**
	 * The default value of the '{@link #getDefault_value_cat() <em>Default value cat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_value_cat()
	 * @generated
	 * @ordered
	 */
	protected static final OneHot_Cat_Arg DEFAULT_VALUE_CAT_EDEFAULT = OneHot_Cat_Arg.AUTO;

	/**
	 * The cached value of the '{@link #getDefault_value_cat() <em>Default value cat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_value_cat()
	 * @generated
	 * @ordered
	 */
	protected OneHot_Cat_Arg default_value_cat = DEFAULT_VALUE_CAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.CATEGORIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneHot_Cat_Arg getDefault_value_cat() {
		return default_value_cat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault_value_cat(OneHot_Cat_Arg newDefault_value_cat) {
		OneHot_Cat_Arg oldDefault_value_cat = default_value_cat;
		default_value_cat = newDefault_value_cat == null ? DEFAULT_VALUE_CAT_EDEFAULT : newDefault_value_cat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.CATEGORIES__DEFAULT_VALUE_CAT,
					oldDefault_value_cat, default_value_cat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.CATEGORIES__DEFAULT_VALUE_CAT:
			return getDefault_value_cat();
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
		case MLmodelPackage.CATEGORIES__DEFAULT_VALUE_CAT:
			setDefault_value_cat((OneHot_Cat_Arg) newValue);
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
		case MLmodelPackage.CATEGORIES__DEFAULT_VALUE_CAT:
			setDefault_value_cat(DEFAULT_VALUE_CAT_EDEFAULT);
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
		case MLmodelPackage.CATEGORIES__DEFAULT_VALUE_CAT:
			return default_value_cat != DEFAULT_VALUE_CAT_EDEFAULT;
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
		result.append(" (default_value_cat: ");
		result.append(default_value_cat);
		result.append(')');
		return result.toString();
	}

} //CategoriesImpl
