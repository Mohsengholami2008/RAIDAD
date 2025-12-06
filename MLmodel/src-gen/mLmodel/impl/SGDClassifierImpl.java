/**
 */
package mLmodel.impl;

import mLmodel.Cycle;
import mLmodel.LEARNING_RATE;
import mLmodel.MLmodelPackage;
import mLmodel.SGDClassifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGD Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.SGDClassifierImpl#getAfter <em>After</em>}</li>
 *   <li>{@link mLmodel.impl.SGDClassifierImpl#getBefore <em>Before</em>}</li>
 *   <li>{@link mLmodel.impl.SGDClassifierImpl#getRandom_state <em>Random state</em>}</li>
 *   <li>{@link mLmodel.impl.SGDClassifierImpl#getLearning_rate <em>Learning rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGDClassifierImpl extends MinimalEObjectImpl.Container implements SGDClassifier {
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
	 * The default value of the '{@link #getRandom_state() <em>Random state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandom_state()
	 * @generated
	 * @ordered
	 */
	protected static final int RANDOM_STATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRandom_state() <em>Random state</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandom_state()
	 * @generated
	 * @ordered
	 */
	protected int random_state = RANDOM_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLearning_rate() <em>Learning rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearning_rate()
	 * @generated
	 * @ordered
	 */
	protected static final LEARNING_RATE LEARNING_RATE_EDEFAULT = LEARNING_RATE.OPTIMAL;

	/**
	 * The cached value of the '{@link #getLearning_rate() <em>Learning rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearning_rate()
	 * @generated
	 * @ordered
	 */
	protected LEARNING_RATE learning_rate = LEARNING_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGDClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.SGD_CLASSIFIER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MLmodelPackage.SGD_CLASSIFIER__AFTER,
							oldAfter, after));
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
					MLmodelPackage.SGD_CLASSIFIER__AFTER, oldAfter, newAfter);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.SGD_CLASSIFIER__AFTER, newAfter,
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MLmodelPackage.SGD_CLASSIFIER__BEFORE,
							oldBefore, before));
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
					MLmodelPackage.SGD_CLASSIFIER__BEFORE, oldBefore, newBefore);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.SGD_CLASSIFIER__BEFORE, newBefore,
					newBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRandom_state() {
		return random_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRandom_state(int newRandom_state) {
		int oldRandom_state = random_state;
		random_state = newRandom_state;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.SGD_CLASSIFIER__RANDOM_STATE,
					oldRandom_state, random_state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEARNING_RATE getLearning_rate() {
		return learning_rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLearning_rate(LEARNING_RATE newLearning_rate) {
		LEARNING_RATE oldLearning_rate = learning_rate;
		learning_rate = newLearning_rate == null ? LEARNING_RATE_EDEFAULT : newLearning_rate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.SGD_CLASSIFIER__LEARNING_RATE,
					oldLearning_rate, learning_rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MLmodelPackage.SGD_CLASSIFIER__AFTER:
			if (after != null)
				msgs = ((InternalEObject) after).eInverseRemove(this, MLmodelPackage.CYCLE__BEFORE, Cycle.class, msgs);
			return basicSetAfter((Cycle) otherEnd, msgs);
		case MLmodelPackage.SGD_CLASSIFIER__BEFORE:
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
		case MLmodelPackage.SGD_CLASSIFIER__AFTER:
			return basicSetAfter(null, msgs);
		case MLmodelPackage.SGD_CLASSIFIER__BEFORE:
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
		case MLmodelPackage.SGD_CLASSIFIER__AFTER:
			if (resolve)
				return getAfter();
			return basicGetAfter();
		case MLmodelPackage.SGD_CLASSIFIER__BEFORE:
			if (resolve)
				return getBefore();
			return basicGetBefore();
		case MLmodelPackage.SGD_CLASSIFIER__RANDOM_STATE:
			return getRandom_state();
		case MLmodelPackage.SGD_CLASSIFIER__LEARNING_RATE:
			return getLearning_rate();
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
		case MLmodelPackage.SGD_CLASSIFIER__AFTER:
			setAfter((Cycle) newValue);
			return;
		case MLmodelPackage.SGD_CLASSIFIER__BEFORE:
			setBefore((Cycle) newValue);
			return;
		case MLmodelPackage.SGD_CLASSIFIER__RANDOM_STATE:
			setRandom_state((Integer) newValue);
			return;
		case MLmodelPackage.SGD_CLASSIFIER__LEARNING_RATE:
			setLearning_rate((LEARNING_RATE) newValue);
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
		case MLmodelPackage.SGD_CLASSIFIER__AFTER:
			setAfter((Cycle) null);
			return;
		case MLmodelPackage.SGD_CLASSIFIER__BEFORE:
			setBefore((Cycle) null);
			return;
		case MLmodelPackage.SGD_CLASSIFIER__RANDOM_STATE:
			setRandom_state(RANDOM_STATE_EDEFAULT);
			return;
		case MLmodelPackage.SGD_CLASSIFIER__LEARNING_RATE:
			setLearning_rate(LEARNING_RATE_EDEFAULT);
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
		case MLmodelPackage.SGD_CLASSIFIER__AFTER:
			return after != null;
		case MLmodelPackage.SGD_CLASSIFIER__BEFORE:
			return before != null;
		case MLmodelPackage.SGD_CLASSIFIER__RANDOM_STATE:
			return random_state != RANDOM_STATE_EDEFAULT;
		case MLmodelPackage.SGD_CLASSIFIER__LEARNING_RATE:
			return learning_rate != LEARNING_RATE_EDEFAULT;
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
		result.append(" (random_state: ");
		result.append(random_state);
		result.append(", learning_rate: ");
		result.append(learning_rate);
		result.append(')');
		return result.toString();
	}

} //SGDClassifierImpl
