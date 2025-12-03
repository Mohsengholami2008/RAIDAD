/**
 */
package mLmodel.impl;

import java.util.Collection;
import mLmodel.Cycle;
import mLmodel.Hidden_Layer_Sizes;
import mLmodel.MLP;
import mLmodel.MLP_Argumans;
import mLmodel.MLmodelPackage;
import mLmodel.Neural_Libraries;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MLP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.MLPImpl#getAfter <em>After</em>}</li>
 *   <li>{@link mLmodel.impl.MLPImpl#getBefore <em>Before</em>}</li>
 *   <li>{@link mLmodel.impl.MLPImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link mLmodel.impl.MLPImpl#getHidden_layer_sizes <em>Hidden layer sizes</em>}</li>
 *   <li>{@link mLmodel.impl.MLPImpl#getMlp_argumans <em>Mlp argumans</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MLPImpl extends MinimalEObjectImpl.Container implements MLP {
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
	 * The default value of the '{@link #getLibrary() <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected static final Neural_Libraries LIBRARY_EDEFAULT = Neural_Libraries.KERAS;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected Neural_Libraries library = LIBRARY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHidden_layer_sizes() <em>Hidden layer sizes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHidden_layer_sizes()
	 * @generated
	 * @ordered
	 */
	protected EList<Hidden_Layer_Sizes> hidden_layer_sizes;

	/**
	 * The cached value of the '{@link #getMlp_argumans() <em>Mlp argumans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMlp_argumans()
	 * @generated
	 * @ordered
	 */
	protected EList<MLP_Argumans> mlp_argumans;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MLPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.MLP;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MLmodelPackage.MLP__AFTER, oldAfter,
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MLmodelPackage.MLP__AFTER,
					oldAfter, newAfter);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.MLP__AFTER, newAfter, newAfter));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MLmodelPackage.MLP__BEFORE, oldBefore,
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MLmodelPackage.MLP__BEFORE,
					oldBefore, newBefore);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.MLP__BEFORE, newBefore, newBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Neural_Libraries getLibrary() {
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibrary(Neural_Libraries newLibrary) {
		Neural_Libraries oldLibrary = library;
		library = newLibrary == null ? LIBRARY_EDEFAULT : newLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.MLP__LIBRARY, oldLibrary, library));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hidden_Layer_Sizes> getHidden_layer_sizes() {
		if (hidden_layer_sizes == null) {
			hidden_layer_sizes = new EObjectContainmentEList<Hidden_Layer_Sizes>(Hidden_Layer_Sizes.class, this,
					MLmodelPackage.MLP__HIDDEN_LAYER_SIZES);
		}
		return hidden_layer_sizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MLP_Argumans> getMlp_argumans() {
		if (mlp_argumans == null) {
			mlp_argumans = new EObjectContainmentEList<MLP_Argumans>(MLP_Argumans.class, this,
					MLmodelPackage.MLP__MLP_ARGUMANS);
		}
		return mlp_argumans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MLmodelPackage.MLP__AFTER:
			if (after != null)
				msgs = ((InternalEObject) after).eInverseRemove(this, MLmodelPackage.CYCLE__BEFORE, Cycle.class, msgs);
			return basicSetAfter((Cycle) otherEnd, msgs);
		case MLmodelPackage.MLP__BEFORE:
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
		case MLmodelPackage.MLP__AFTER:
			return basicSetAfter(null, msgs);
		case MLmodelPackage.MLP__BEFORE:
			return basicSetBefore(null, msgs);
		case MLmodelPackage.MLP__HIDDEN_LAYER_SIZES:
			return ((InternalEList<?>) getHidden_layer_sizes()).basicRemove(otherEnd, msgs);
		case MLmodelPackage.MLP__MLP_ARGUMANS:
			return ((InternalEList<?>) getMlp_argumans()).basicRemove(otherEnd, msgs);
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
		case MLmodelPackage.MLP__AFTER:
			if (resolve)
				return getAfter();
			return basicGetAfter();
		case MLmodelPackage.MLP__BEFORE:
			if (resolve)
				return getBefore();
			return basicGetBefore();
		case MLmodelPackage.MLP__LIBRARY:
			return getLibrary();
		case MLmodelPackage.MLP__HIDDEN_LAYER_SIZES:
			return getHidden_layer_sizes();
		case MLmodelPackage.MLP__MLP_ARGUMANS:
			return getMlp_argumans();
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
		case MLmodelPackage.MLP__AFTER:
			setAfter((Cycle) newValue);
			return;
		case MLmodelPackage.MLP__BEFORE:
			setBefore((Cycle) newValue);
			return;
		case MLmodelPackage.MLP__LIBRARY:
			setLibrary((Neural_Libraries) newValue);
			return;
		case MLmodelPackage.MLP__HIDDEN_LAYER_SIZES:
			getHidden_layer_sizes().clear();
			getHidden_layer_sizes().addAll((Collection<? extends Hidden_Layer_Sizes>) newValue);
			return;
		case MLmodelPackage.MLP__MLP_ARGUMANS:
			getMlp_argumans().clear();
			getMlp_argumans().addAll((Collection<? extends MLP_Argumans>) newValue);
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
		case MLmodelPackage.MLP__AFTER:
			setAfter((Cycle) null);
			return;
		case MLmodelPackage.MLP__BEFORE:
			setBefore((Cycle) null);
			return;
		case MLmodelPackage.MLP__LIBRARY:
			setLibrary(LIBRARY_EDEFAULT);
			return;
		case MLmodelPackage.MLP__HIDDEN_LAYER_SIZES:
			getHidden_layer_sizes().clear();
			return;
		case MLmodelPackage.MLP__MLP_ARGUMANS:
			getMlp_argumans().clear();
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
		case MLmodelPackage.MLP__AFTER:
			return after != null;
		case MLmodelPackage.MLP__BEFORE:
			return before != null;
		case MLmodelPackage.MLP__LIBRARY:
			return library != LIBRARY_EDEFAULT;
		case MLmodelPackage.MLP__HIDDEN_LAYER_SIZES:
			return hidden_layer_sizes != null && !hidden_layer_sizes.isEmpty();
		case MLmodelPackage.MLP__MLP_ARGUMANS:
			return mlp_argumans != null && !mlp_argumans.isEmpty();
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
		result.append(" (library: ");
		result.append(library);
		result.append(')');
		return result.toString();
	}

} //MLPImpl
