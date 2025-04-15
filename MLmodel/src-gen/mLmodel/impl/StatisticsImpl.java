/**
 */
package mLmodel.impl;

import mLmodel.MLmodelPackage;
import mLmodel.Statistics;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.StatisticsImpl#isType <em>Type</em>}</li>
 *   <li>{@link mLmodel.impl.StatisticsImpl#isMissing <em>Missing</em>}</li>
 *   <li>{@link mLmodel.impl.StatisticsImpl#isMin <em>Min</em>}</li>
 *   <li>{@link mLmodel.impl.StatisticsImpl#isMax <em>Max</em>}</li>
 *   <li>{@link mLmodel.impl.StatisticsImpl#isAverage <em>Average</em>}</li>
 *   <li>{@link mLmodel.impl.StatisticsImpl#isStandard_devision <em>Standard devision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatisticsImpl extends MinimalEObjectImpl.Container implements Statistics {
	/**
	 * The default value of the '{@link #isType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TYPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isType()
	 * @generated
	 * @ordered
	 */
	protected boolean type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMissing() <em>Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMissing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MISSING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMissing() <em>Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMissing()
	 * @generated
	 * @ordered
	 */
	protected boolean missing = MISSING_EDEFAULT;

	/**
	 * The default value of the '{@link #isMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMin()
	 * @generated
	 * @ordered
	 */
	protected boolean min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #isMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMax()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMax()
	 * @generated
	 * @ordered
	 */
	protected boolean max = MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #isAverage() <em>Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAverage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AVERAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAverage() <em>Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAverage()
	 * @generated
	 * @ordered
	 */
	protected boolean average = AVERAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isStandard_devision() <em>Standard devision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStandard_devision()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STANDARD_DEVISION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStandard_devision() <em>Standard devision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStandard_devision()
	 * @generated
	 * @ordered
	 */
	protected boolean standard_devision = STANDARD_DEVISION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.STATISTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(boolean newType) {
		boolean oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.STATISTICS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMissing() {
		return missing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissing(boolean newMissing) {
		boolean oldMissing = missing;
		missing = newMissing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.STATISTICS__MISSING, oldMissing,
					missing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(boolean newMin) {
		boolean oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.STATISTICS__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(boolean newMax) {
		boolean oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.STATISTICS__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAverage() {
		return average;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAverage(boolean newAverage) {
		boolean oldAverage = average;
		average = newAverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.STATISTICS__AVERAGE, oldAverage,
					average));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStandard_devision() {
		return standard_devision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandard_devision(boolean newStandard_devision) {
		boolean oldStandard_devision = standard_devision;
		standard_devision = newStandard_devision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.STATISTICS__STANDARD_DEVISION,
					oldStandard_devision, standard_devision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.STATISTICS__TYPE:
			return isType();
		case MLmodelPackage.STATISTICS__MISSING:
			return isMissing();
		case MLmodelPackage.STATISTICS__MIN:
			return isMin();
		case MLmodelPackage.STATISTICS__MAX:
			return isMax();
		case MLmodelPackage.STATISTICS__AVERAGE:
			return isAverage();
		case MLmodelPackage.STATISTICS__STANDARD_DEVISION:
			return isStandard_devision();
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
		case MLmodelPackage.STATISTICS__TYPE:
			setType((Boolean) newValue);
			return;
		case MLmodelPackage.STATISTICS__MISSING:
			setMissing((Boolean) newValue);
			return;
		case MLmodelPackage.STATISTICS__MIN:
			setMin((Boolean) newValue);
			return;
		case MLmodelPackage.STATISTICS__MAX:
			setMax((Boolean) newValue);
			return;
		case MLmodelPackage.STATISTICS__AVERAGE:
			setAverage((Boolean) newValue);
			return;
		case MLmodelPackage.STATISTICS__STANDARD_DEVISION:
			setStandard_devision((Boolean) newValue);
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
		case MLmodelPackage.STATISTICS__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case MLmodelPackage.STATISTICS__MISSING:
			setMissing(MISSING_EDEFAULT);
			return;
		case MLmodelPackage.STATISTICS__MIN:
			setMin(MIN_EDEFAULT);
			return;
		case MLmodelPackage.STATISTICS__MAX:
			setMax(MAX_EDEFAULT);
			return;
		case MLmodelPackage.STATISTICS__AVERAGE:
			setAverage(AVERAGE_EDEFAULT);
			return;
		case MLmodelPackage.STATISTICS__STANDARD_DEVISION:
			setStandard_devision(STANDARD_DEVISION_EDEFAULT);
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
		case MLmodelPackage.STATISTICS__TYPE:
			return type != TYPE_EDEFAULT;
		case MLmodelPackage.STATISTICS__MISSING:
			return missing != MISSING_EDEFAULT;
		case MLmodelPackage.STATISTICS__MIN:
			return min != MIN_EDEFAULT;
		case MLmodelPackage.STATISTICS__MAX:
			return max != MAX_EDEFAULT;
		case MLmodelPackage.STATISTICS__AVERAGE:
			return average != AVERAGE_EDEFAULT;
		case MLmodelPackage.STATISTICS__STANDARD_DEVISION:
			return standard_devision != STANDARD_DEVISION_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", missing: ");
		result.append(missing);
		result.append(", min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", average: ");
		result.append(average);
		result.append(", standard_devision: ");
		result.append(standard_devision);
		result.append(')');
		return result.toString();
	}

} //StatisticsImpl
