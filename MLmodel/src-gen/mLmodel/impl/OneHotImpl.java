/**
 */
package mLmodel.impl;

import java.util.Collection;

import mLmodel.Cycle;
import mLmodel.MLmodelPackage;
import mLmodel.OneHot;
import mLmodel.OneHot_Argumans;
import mLmodel.Regular;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One Hot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.OneHotImpl#getAfter <em>After</em>}</li>
 *   <li>{@link mLmodel.impl.OneHotImpl#getBefore <em>Before</em>}</li>
 *   <li>{@link mLmodel.impl.OneHotImpl#getRegular <em>Regular</em>}</li>
 *   <li>{@link mLmodel.impl.OneHotImpl#isSave_file <em>Save file</em>}</li>
 *   <li>{@link mLmodel.impl.OneHotImpl#isPrint_data <em>Print data</em>}</li>
 *   <li>{@link mLmodel.impl.OneHotImpl#getOnehot_argumans <em>Onehot argumans</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OneHotImpl extends MinimalEObjectImpl.Container implements OneHot {
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
	 * The cached value of the '{@link #getRegular() <em>Regular</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegular()
	 * @generated
	 * @ordered
	 */
	protected EList<Regular> regular;

	/**
	 * The default value of the '{@link #isSave_file() <em>Save file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSave_file()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAVE_FILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSave_file() <em>Save file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSave_file()
	 * @generated
	 * @ordered
	 */
	protected boolean save_file = SAVE_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrint_data() <em>Print data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrint_data()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRINT_DATA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrint_data() <em>Print data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrint_data()
	 * @generated
	 * @ordered
	 */
	protected boolean print_data = PRINT_DATA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOnehot_argumans() <em>Onehot argumans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnehot_argumans()
	 * @generated
	 * @ordered
	 */
	protected EList<OneHot_Argumans> onehot_argumans;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OneHotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.ONE_HOT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MLmodelPackage.ONE_HOT__AFTER, oldAfter,
							after));
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
					MLmodelPackage.ONE_HOT__AFTER, oldAfter, newAfter);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.ONE_HOT__AFTER, newAfter, newAfter));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MLmodelPackage.ONE_HOT__BEFORE, oldBefore,
							before));
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
					MLmodelPackage.ONE_HOT__BEFORE, oldBefore, newBefore);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.ONE_HOT__BEFORE, newBefore,
					newBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Regular> getRegular() {
		if (regular == null) {
			regular = new EObjectResolvingEList<Regular>(Regular.class, this, MLmodelPackage.ONE_HOT__REGULAR);
		}
		return regular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSave_file() {
		return save_file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSave_file(boolean newSave_file) {
		boolean oldSave_file = save_file;
		save_file = newSave_file;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.ONE_HOT__SAVE_FILE, oldSave_file,
					save_file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrint_data() {
		return print_data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrint_data(boolean newPrint_data) {
		boolean oldPrint_data = print_data;
		print_data = newPrint_data;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.ONE_HOT__PRINT_DATA, oldPrint_data,
					print_data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OneHot_Argumans> getOnehot_argumans() {
		if (onehot_argumans == null) {
			onehot_argumans = new EObjectContainmentEList<OneHot_Argumans>(OneHot_Argumans.class, this,
					MLmodelPackage.ONE_HOT__ONEHOT_ARGUMANS);
		}
		return onehot_argumans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MLmodelPackage.ONE_HOT__AFTER:
			if (after != null)
				msgs = ((InternalEObject) after).eInverseRemove(this, MLmodelPackage.CYCLE__BEFORE, Cycle.class, msgs);
			return basicSetAfter((Cycle) otherEnd, msgs);
		case MLmodelPackage.ONE_HOT__BEFORE:
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
		case MLmodelPackage.ONE_HOT__AFTER:
			return basicSetAfter(null, msgs);
		case MLmodelPackage.ONE_HOT__BEFORE:
			return basicSetBefore(null, msgs);
		case MLmodelPackage.ONE_HOT__ONEHOT_ARGUMANS:
			return ((InternalEList<?>) getOnehot_argumans()).basicRemove(otherEnd, msgs);
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
		case MLmodelPackage.ONE_HOT__AFTER:
			if (resolve)
				return getAfter();
			return basicGetAfter();
		case MLmodelPackage.ONE_HOT__BEFORE:
			if (resolve)
				return getBefore();
			return basicGetBefore();
		case MLmodelPackage.ONE_HOT__REGULAR:
			return getRegular();
		case MLmodelPackage.ONE_HOT__SAVE_FILE:
			return isSave_file();
		case MLmodelPackage.ONE_HOT__PRINT_DATA:
			return isPrint_data();
		case MLmodelPackage.ONE_HOT__ONEHOT_ARGUMANS:
			return getOnehot_argumans();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MLmodelPackage.ONE_HOT__AFTER:
			setAfter((Cycle) newValue);
			return;
		case MLmodelPackage.ONE_HOT__BEFORE:
			setBefore((Cycle) newValue);
			return;
		case MLmodelPackage.ONE_HOT__REGULAR:
			getRegular().clear();
			getRegular().addAll((Collection<? extends Regular>) newValue);
			return;
		case MLmodelPackage.ONE_HOT__SAVE_FILE:
			setSave_file((Boolean) newValue);
			return;
		case MLmodelPackage.ONE_HOT__PRINT_DATA:
			setPrint_data((Boolean) newValue);
			return;
		case MLmodelPackage.ONE_HOT__ONEHOT_ARGUMANS:
			getOnehot_argumans().clear();
			getOnehot_argumans().addAll((Collection<? extends OneHot_Argumans>) newValue);
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
		case MLmodelPackage.ONE_HOT__AFTER:
			setAfter((Cycle) null);
			return;
		case MLmodelPackage.ONE_HOT__BEFORE:
			setBefore((Cycle) null);
			return;
		case MLmodelPackage.ONE_HOT__REGULAR:
			getRegular().clear();
			return;
		case MLmodelPackage.ONE_HOT__SAVE_FILE:
			setSave_file(SAVE_FILE_EDEFAULT);
			return;
		case MLmodelPackage.ONE_HOT__PRINT_DATA:
			setPrint_data(PRINT_DATA_EDEFAULT);
			return;
		case MLmodelPackage.ONE_HOT__ONEHOT_ARGUMANS:
			getOnehot_argumans().clear();
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
		case MLmodelPackage.ONE_HOT__AFTER:
			return after != null;
		case MLmodelPackage.ONE_HOT__BEFORE:
			return before != null;
		case MLmodelPackage.ONE_HOT__REGULAR:
			return regular != null && !regular.isEmpty();
		case MLmodelPackage.ONE_HOT__SAVE_FILE:
			return save_file != SAVE_FILE_EDEFAULT;
		case MLmodelPackage.ONE_HOT__PRINT_DATA:
			return print_data != PRINT_DATA_EDEFAULT;
		case MLmodelPackage.ONE_HOT__ONEHOT_ARGUMANS:
			return onehot_argumans != null && !onehot_argumans.isEmpty();
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
		result.append(" (save_file: ");
		result.append(save_file);
		result.append(", print_data: ");
		result.append(print_data);
		result.append(')');
		return result.toString();
	}

} //OneHotImpl
