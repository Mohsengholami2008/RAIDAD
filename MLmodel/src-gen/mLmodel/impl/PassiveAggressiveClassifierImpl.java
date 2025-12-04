/**
 */
package mLmodel.impl;

import mLmodel.Cycle;
import mLmodel.MLmodelPackage;
import mLmodel.PassiveAggressiveClassifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Passive Aggressive Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.PassiveAggressiveClassifierImpl#getAfter <em>After</em>}</li>
 *   <li>{@link mLmodel.impl.PassiveAggressiveClassifierImpl#getBefore <em>Before</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PassiveAggressiveClassifierImpl extends MinimalEObjectImpl.Container
		implements PassiveAggressiveClassifier {
	/**
	 * The cached value of the '{@link #getAfter() <em>After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfter()
	 * @generated
	 * @ordered
	 */
	protected Cycle after;

	/**
	 * The cached value of the '{@link #getBefore() <em>Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBefore()
	 * @generated
	 * @ordered
	 */
	protected Cycle before;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassiveAggressiveClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.PASSIVE_AGGRESSIVE_CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cycle getAfter() {
		if (after != null && after.eIsProxy()) {
			InternalEObject oldAfter = (InternalEObject) after;
			after = (Cycle) eResolveProxy(oldAfter);
			if (after != oldAfter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MLmodelPackage.PASSIVE_AGGRESSIVE_CLASSIFIER__AFTER, oldAfter, after));
			}
		}
		return after;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cycle basicGetAfter() {
		return after;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAfter(Cycle newAfter, NotificationChain msgs) {
		Cycle oldAfter = after;
		after = newAfter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MLmodelPackage.PASSIVE_AGGRESSIVE_CLASSIFIER__AFTER, oldAfter, newAfter);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfter(Cycle newAfter) {
		if (newAfter != after) {
			NotificationChain msgs = null;
			if (after != null)
				msgs = ((InternalEObject) after).eInverseRemove(this, MLmodelPackage.CYCLE__BEFORE, Cycle.class, msgs);
			if (newAfter != null)
				msgs = ((InternalEObject) newAfter).eInverseAdd(this, MLmodelPackage.CYCLE__BEFORE, Cycle.class, msgs);
			msgs = basicSetAfter(newAfter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.PASSIVE_AGGRESSIVE_CLASSIFIER__AFTER,
					newAfter, newAfter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cycle getBefore() {
		if (before != null && before.eIsProxy()) {
			InternalEObject oldBefore = (InternalEObject) before;
			before = (Cycle) eResolveProxy(oldBefore);
			if (before != oldBefore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MLmodelPackage.PASSIVE_AGGRESSIVE_CLASSIFIER__BEFORE, oldBefore, before));
			}
		}
		return before;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cycle basicGetBefore() {
		return before;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBefore(Cycle newBefore, NotificationChain msgs) {
		Cycle oldBefore = before;
		before = newBefore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MLmodelPackage.PASSIVE_AGGRESSIVE_CLASSIFIER__BEFORE, oldBefore, newBefore);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBefore(Cycle newBefore) {
		if (newBefore != before) {
			NotificationChain msgs = null;
			if (before != null)
				msgs = ((InternalEObject) before).eInverseRemove(this, MLmodelPackage.CYCLE__AFTER, Cycle.class, msgs);
			if (newBefore != null)
				msgs = ((InternalEObject) newBefore).eInverseAdd(this, MLmodelPackage.CYCLE__AFTER, Cycle.class, msgs);
			msgs = basicSetBefore(newBefore, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.PASSIVE_AGGRESSIVE_CLASSIFIER__BEFORE,
					newBefore, newBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MLmodelPackage.PASSIVE_AGGRESSIVE_CLASSIFIER__AFTER:
			if (after != null)
				msgs = ((InternalEObject) after).eInverseRemove(this, MLmodelPackage.CYCLE__BEFORE, Cycle.class, msgs);
			return basicSetAfter((Cycle) otherEnd, msgs);
		case MLmodelPackage.PASSIVE_AGGRESSIVE_CLASSIFIER__BEFORE:
			if (before != null)
				msgs = ((InternalEObject) before).eInverseRemove(this, MLmodelPackage.CYCLE__AFTER, Cycle.class, msgs);
			return basicSetBefore((Cycle) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MLmodelPackage.PASSIVE_AGGRESSIVE_CLASSIFIER__AFTER:
			return basicSetAfter(null, msgs);
		case MLmodelPackage.PASSIVE_AGGRESSIVE_CLASSIFIER__BEFORE:
			return basicSetBefore(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.PASSIVE_AGGRESSIVE_CLASSIFIER__AFTER:
			if (resolve)
				return getAfter();
			return basicGetAfter();
		case MLmodelPackage.PASSIVE_AGGRESSIVE_CLASSIFIER__BEFORE:
			if (resolve)
				return getBefore();
			return basicGetBefore();
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
		case MLmodelPackage.PASSIVE_AGGRESSIVE_CLASSIFIER__AFTER:
			setAfter((Cycle) newValue);
			return;
		case MLmodelPackage.PASSIVE_AGGRESSIVE_CLASSIFIER__BEFORE:
			setBefore((Cycle) newValue);
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
		case MLmodelPackage.PASSIVE_AGGRESSIVE_CLASSIFIER__AFTER:
			setAfter((Cycle) null);
			return;
		case MLmodelPackage.PASSIVE_AGGRESSIVE_CLASSIFIER__BEFORE:
			setBefore((Cycle) null);
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
		case MLmodelPackage.PASSIVE_AGGRESSIVE_CLASSIFIER__AFTER:
			return after != null;
		case MLmodelPackage.PASSIVE_AGGRESSIVE_CLASSIFIER__BEFORE:
			return before != null;
		}
		return super.eIsSet(featureID);
	}

} //PassiveAggressiveClassifierImpl
