/**
 */
package mLmodel.impl;

import mLmodel.AnalysysTriger;
import mLmodel.Event;
import mLmodel.MLmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.EventImpl#getAnalysystriger <em>Analysystriger</em>}</li>
 *   <li>{@link mLmodel.impl.EventImpl#getName <em>Name</em>}</li>
 *   <li>{@link mLmodel.impl.EventImpl#getData <em>Data</em>}</li>
 *   <li>{@link mLmodel.impl.EventImpl#isSubscription <em>Subscription</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event {
	/**
	 * The cached value of the '{@link #getAnalysystriger() <em>Analysystriger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysystriger()
	 * @generated
	 * @ordered
	 */
	protected AnalysysTriger analysystriger;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected String data = DATA_EDEFAULT;
	/**
	 * The default value of the '{@link #isSubscription() <em>Subscription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubscription()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUBSCRIPTION_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isSubscription() <em>Subscription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubscription()
	 * @generated
	 * @ordered
	 */
	protected boolean subscription = SUBSCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysysTriger getAnalysystriger() {
		if (analysystriger != null && analysystriger.eIsProxy()) {
			InternalEObject oldAnalysystriger = (InternalEObject) analysystriger;
			analysystriger = (AnalysysTriger) eResolveProxy(oldAnalysystriger);
			if (analysystriger != oldAnalysystriger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MLmodelPackage.EVENT__ANALYSYSTRIGER,
							oldAnalysystriger, analysystriger));
			}
		}
		return analysystriger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysysTriger basicGetAnalysystriger() {
		return analysystriger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalysystriger(AnalysysTriger newAnalysystriger) {
		AnalysysTriger oldAnalysystriger = analysystriger;
		analysystriger = newAnalysystriger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.EVENT__ANALYSYSTRIGER,
					oldAnalysystriger, analysystriger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.EVENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(String newData) {
		String oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.EVENT__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSubscription() {
		return subscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscription(boolean newSubscription) {
		boolean oldSubscription = subscription;
		subscription = newSubscription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.EVENT__SUBSCRIPTION, oldSubscription,
					subscription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.EVENT__ANALYSYSTRIGER:
			if (resolve)
				return getAnalysystriger();
			return basicGetAnalysystriger();
		case MLmodelPackage.EVENT__NAME:
			return getName();
		case MLmodelPackage.EVENT__DATA:
			return getData();
		case MLmodelPackage.EVENT__SUBSCRIPTION:
			return isSubscription();
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
		case MLmodelPackage.EVENT__ANALYSYSTRIGER:
			setAnalysystriger((AnalysysTriger) newValue);
			return;
		case MLmodelPackage.EVENT__NAME:
			setName((String) newValue);
			return;
		case MLmodelPackage.EVENT__DATA:
			setData((String) newValue);
			return;
		case MLmodelPackage.EVENT__SUBSCRIPTION:
			setSubscription((Boolean) newValue);
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
		case MLmodelPackage.EVENT__ANALYSYSTRIGER:
			setAnalysystriger((AnalysysTriger) null);
			return;
		case MLmodelPackage.EVENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MLmodelPackage.EVENT__DATA:
			setData(DATA_EDEFAULT);
			return;
		case MLmodelPackage.EVENT__SUBSCRIPTION:
			setSubscription(SUBSCRIPTION_EDEFAULT);
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
		case MLmodelPackage.EVENT__ANALYSYSTRIGER:
			return analysystriger != null;
		case MLmodelPackage.EVENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MLmodelPackage.EVENT__DATA:
			return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
		case MLmodelPackage.EVENT__SUBSCRIPTION:
			return subscription != SUBSCRIPTION_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", data: ");
		result.append(data);
		result.append(", subscription: ");
		result.append(subscription);
		result.append(')');
		return result.toString();
	}

} //EventImpl
