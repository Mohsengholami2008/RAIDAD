/**
 */
package mLmodel.impl;

import java.util.Collection;

import mLmodel.Cycle;
import mLmodel.KNN_Argumans;
import mLmodel.KNN_Imputer;
import mLmodel.MLmodelPackage;
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
 * An implementation of the model object '<em><b>KNN Imputer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.KNN_ImputerImpl#getAfter <em>After</em>}</li>
 *   <li>{@link mLmodel.impl.KNN_ImputerImpl#getBefore <em>Before</em>}</li>
 *   <li>{@link mLmodel.impl.KNN_ImputerImpl#getRegular <em>Regular</em>}</li>
 *   <li>{@link mLmodel.impl.KNN_ImputerImpl#isSave_file <em>Save file</em>}</li>
 *   <li>{@link mLmodel.impl.KNN_ImputerImpl#isPrint_data <em>Print data</em>}</li>
 *   <li>{@link mLmodel.impl.KNN_ImputerImpl#getKnn_argumans <em>Knn argumans</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KNN_ImputerImpl extends MinimalEObjectImpl.Container implements KNN_Imputer {
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
	 * The cached value of the '{@link #getKnn_argumans() <em>Knn argumans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnn_argumans()
	 * @generated
	 * @ordered
	 */
	protected EList<KNN_Argumans> knn_argumans;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KNN_ImputerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.KNN_IMPUTER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MLmodelPackage.KNN_IMPUTER__AFTER,
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
					MLmodelPackage.KNN_IMPUTER__AFTER, oldAfter, newAfter);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.KNN_IMPUTER__AFTER, newAfter,
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MLmodelPackage.KNN_IMPUTER__BEFORE,
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
					MLmodelPackage.KNN_IMPUTER__BEFORE, oldBefore, newBefore);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.KNN_IMPUTER__BEFORE, newBefore,
					newBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Regular> getRegular() {
		if (regular == null) {
			regular = new EObjectResolvingEList<Regular>(Regular.class, this, MLmodelPackage.KNN_IMPUTER__REGULAR);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.KNN_IMPUTER__SAVE_FILE, oldSave_file,
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
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.KNN_IMPUTER__PRINT_DATA, oldPrint_data,
					print_data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KNN_Argumans> getKnn_argumans() {
		if (knn_argumans == null) {
			knn_argumans = new EObjectContainmentEList<KNN_Argumans>(KNN_Argumans.class, this,
					MLmodelPackage.KNN_IMPUTER__KNN_ARGUMANS);
		}
		return knn_argumans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MLmodelPackage.KNN_IMPUTER__AFTER:
			if (after != null)
				msgs = ((InternalEObject) after).eInverseRemove(this, MLmodelPackage.CYCLE__BEFORE, Cycle.class, msgs);
			return basicSetAfter((Cycle) otherEnd, msgs);
		case MLmodelPackage.KNN_IMPUTER__BEFORE:
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
		case MLmodelPackage.KNN_IMPUTER__AFTER:
			return basicSetAfter(null, msgs);
		case MLmodelPackage.KNN_IMPUTER__BEFORE:
			return basicSetBefore(null, msgs);
		case MLmodelPackage.KNN_IMPUTER__KNN_ARGUMANS:
			return ((InternalEList<?>) getKnn_argumans()).basicRemove(otherEnd, msgs);
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
		case MLmodelPackage.KNN_IMPUTER__AFTER:
			if (resolve)
				return getAfter();
			return basicGetAfter();
		case MLmodelPackage.KNN_IMPUTER__BEFORE:
			if (resolve)
				return getBefore();
			return basicGetBefore();
		case MLmodelPackage.KNN_IMPUTER__REGULAR:
			return getRegular();
		case MLmodelPackage.KNN_IMPUTER__SAVE_FILE:
			return isSave_file();
		case MLmodelPackage.KNN_IMPUTER__PRINT_DATA:
			return isPrint_data();
		case MLmodelPackage.KNN_IMPUTER__KNN_ARGUMANS:
			return getKnn_argumans();
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
		case MLmodelPackage.KNN_IMPUTER__AFTER:
			setAfter((Cycle) newValue);
			return;
		case MLmodelPackage.KNN_IMPUTER__BEFORE:
			setBefore((Cycle) newValue);
			return;
		case MLmodelPackage.KNN_IMPUTER__REGULAR:
			getRegular().clear();
			getRegular().addAll((Collection<? extends Regular>) newValue);
			return;
		case MLmodelPackage.KNN_IMPUTER__SAVE_FILE:
			setSave_file((Boolean) newValue);
			return;
		case MLmodelPackage.KNN_IMPUTER__PRINT_DATA:
			setPrint_data((Boolean) newValue);
			return;
		case MLmodelPackage.KNN_IMPUTER__KNN_ARGUMANS:
			getKnn_argumans().clear();
			getKnn_argumans().addAll((Collection<? extends KNN_Argumans>) newValue);
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
		case MLmodelPackage.KNN_IMPUTER__AFTER:
			setAfter((Cycle) null);
			return;
		case MLmodelPackage.KNN_IMPUTER__BEFORE:
			setBefore((Cycle) null);
			return;
		case MLmodelPackage.KNN_IMPUTER__REGULAR:
			getRegular().clear();
			return;
		case MLmodelPackage.KNN_IMPUTER__SAVE_FILE:
			setSave_file(SAVE_FILE_EDEFAULT);
			return;
		case MLmodelPackage.KNN_IMPUTER__PRINT_DATA:
			setPrint_data(PRINT_DATA_EDEFAULT);
			return;
		case MLmodelPackage.KNN_IMPUTER__KNN_ARGUMANS:
			getKnn_argumans().clear();
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
		case MLmodelPackage.KNN_IMPUTER__AFTER:
			return after != null;
		case MLmodelPackage.KNN_IMPUTER__BEFORE:
			return before != null;
		case MLmodelPackage.KNN_IMPUTER__REGULAR:
			return regular != null && !regular.isEmpty();
		case MLmodelPackage.KNN_IMPUTER__SAVE_FILE:
			return save_file != SAVE_FILE_EDEFAULT;
		case MLmodelPackage.KNN_IMPUTER__PRINT_DATA:
			return print_data != PRINT_DATA_EDEFAULT;
		case MLmodelPackage.KNN_IMPUTER__KNN_ARGUMANS:
			return knn_argumans != null && !knn_argumans.isEmpty();
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

} //KNN_ImputerImpl
