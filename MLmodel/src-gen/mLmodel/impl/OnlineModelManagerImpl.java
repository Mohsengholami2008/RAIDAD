/**
 */
package mLmodel.impl;

import mLmodel.Cycle;
import mLmodel.MLmodelPackage;
import mLmodel.OnlineModelManager;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Online Model Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.OnlineModelManagerImpl#getAfter <em>After</em>}</li>
 *   <li>{@link mLmodel.impl.OnlineModelManagerImpl#getBefore <em>Before</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OnlineModelManagerImpl extends MinimalEObjectImpl.Container implements OnlineModelManager {
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
	protected OnlineModelManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.ONLINE_MODEL_MANAGER;
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
							MLmodelPackage.ONLINE_MODEL_MANAGER__AFTER, oldAfter, after));
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
					MLmodelPackage.ONLINE_MODEL_MANAGER__AFTER, oldAfter, newAfter);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.ONLINE_MODEL_MANAGER__AFTER, newAfter,
					newAfter));
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
							MLmodelPackage.ONLINE_MODEL_MANAGER__BEFORE, oldBefore, before));
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
					MLmodelPackage.ONLINE_MODEL_MANAGER__BEFORE, oldBefore, newBefore);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.ONLINE_MODEL_MANAGER__BEFORE,
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
		case MLmodelPackage.ONLINE_MODEL_MANAGER__AFTER:
			if (after != null)
				msgs = ((InternalEObject) after).eInverseRemove(this, MLmodelPackage.CYCLE__BEFORE, Cycle.class, msgs);
			return basicSetAfter((Cycle) otherEnd, msgs);
		case MLmodelPackage.ONLINE_MODEL_MANAGER__BEFORE:
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
		case MLmodelPackage.ONLINE_MODEL_MANAGER__AFTER:
			return basicSetAfter(null, msgs);
		case MLmodelPackage.ONLINE_MODEL_MANAGER__BEFORE:
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
		case MLmodelPackage.ONLINE_MODEL_MANAGER__AFTER:
			if (resolve)
				return getAfter();
			return basicGetAfter();
		case MLmodelPackage.ONLINE_MODEL_MANAGER__BEFORE:
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
		case MLmodelPackage.ONLINE_MODEL_MANAGER__AFTER:
			setAfter((Cycle) newValue);
			return;
		case MLmodelPackage.ONLINE_MODEL_MANAGER__BEFORE:
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
		case MLmodelPackage.ONLINE_MODEL_MANAGER__AFTER:
			setAfter((Cycle) null);
			return;
		case MLmodelPackage.ONLINE_MODEL_MANAGER__BEFORE:
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
		case MLmodelPackage.ONLINE_MODEL_MANAGER__AFTER:
			return after != null;
		case MLmodelPackage.ONLINE_MODEL_MANAGER__BEFORE:
			return before != null;
		}
		return super.eIsSet(featureID);
	}

} //OnlineModelManagerImpl
