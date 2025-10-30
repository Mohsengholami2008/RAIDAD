/**
 */
package mLmodel.impl;

import mLmodel.AnalysysTriger;
import mLmodel.MLmodelPackage;

import mLmodel.TrigerEnum;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysys Triger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.AnalysysTrigerImpl#getTriggerType <em>Trigger Type</em>}</li>
 *   <li>{@link mLmodel.impl.AnalysysTrigerImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link mLmodel.impl.AnalysysTrigerImpl#getSchedule <em>Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysysTrigerImpl extends MinimalEObjectImpl.Container implements AnalysysTriger {
	/**
	 * The default value of the '{@link #getTriggerType() <em>Trigger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerType()
	 * @generated
	 * @ordered
	 */
	protected static final TrigerEnum TRIGGER_TYPE_EDEFAULT = TrigerEnum.EVENT;
	/**
	 * The cached value of the '{@link #getTriggerType() <em>Trigger Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerType()
	 * @generated
	 * @ordered
	 */
	protected TrigerEnum triggerType = TRIGGER_TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;
	/**
	 * The default value of the '{@link #getSchedule() <em>Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEDULE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected String schedule = SCHEDULE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysysTrigerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.ANALYSYS_TRIGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrigerEnum getTriggerType() {
		return triggerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerType(TrigerEnum newTriggerType) {
		TrigerEnum oldTriggerType = triggerType;
		triggerType = newTriggerType == null ? TRIGGER_TYPE_EDEFAULT : newTriggerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.ANALYSYS_TRIGER__TRIGGER_TYPE,
					oldTriggerType, triggerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.ANALYSYS_TRIGER__CONDITION,
					oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchedule() {
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedule(String newSchedule) {
		String oldSchedule = schedule;
		schedule = newSchedule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.ANALYSYS_TRIGER__SCHEDULE, oldSchedule,
					schedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.ANALYSYS_TRIGER__TRIGGER_TYPE:
			return getTriggerType();
		case MLmodelPackage.ANALYSYS_TRIGER__CONDITION:
			return getCondition();
		case MLmodelPackage.ANALYSYS_TRIGER__SCHEDULE:
			return getSchedule();
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
		case MLmodelPackage.ANALYSYS_TRIGER__TRIGGER_TYPE:
			setTriggerType((TrigerEnum) newValue);
			return;
		case MLmodelPackage.ANALYSYS_TRIGER__CONDITION:
			setCondition((String) newValue);
			return;
		case MLmodelPackage.ANALYSYS_TRIGER__SCHEDULE:
			setSchedule((String) newValue);
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
		case MLmodelPackage.ANALYSYS_TRIGER__TRIGGER_TYPE:
			setTriggerType(TRIGGER_TYPE_EDEFAULT);
			return;
		case MLmodelPackage.ANALYSYS_TRIGER__CONDITION:
			setCondition(CONDITION_EDEFAULT);
			return;
		case MLmodelPackage.ANALYSYS_TRIGER__SCHEDULE:
			setSchedule(SCHEDULE_EDEFAULT);
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
		case MLmodelPackage.ANALYSYS_TRIGER__TRIGGER_TYPE:
			return triggerType != TRIGGER_TYPE_EDEFAULT;
		case MLmodelPackage.ANALYSYS_TRIGER__CONDITION:
			return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
		case MLmodelPackage.ANALYSYS_TRIGER__SCHEDULE:
			return SCHEDULE_EDEFAULT == null ? schedule != null : !SCHEDULE_EDEFAULT.equals(schedule);
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
		result.append(" (triggerType: ");
		result.append(triggerType);
		result.append(", condition: ");
		result.append(condition);
		result.append(", schedule: ");
		result.append(schedule);
		result.append(')');
		return result.toString();
	}

} //AnalysysTrigerImpl
