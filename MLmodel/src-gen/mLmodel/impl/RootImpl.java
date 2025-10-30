/**
 */
package mLmodel.impl;

import java.util.Collection;
import mLmodel.MLmodelPackage;
import mLmodel.Root;

import mLmodel.Thing;
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
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.RootImpl#getName <em>Name</em>}</li>
 *   <li>{@link mLmodel.impl.RootImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link mLmodel.impl.RootImpl#getThing <em>Thing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "MLModel";

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
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected mLmodel.Process process;

	/**
	 * The cached value of the '{@link #getThing() <em>Thing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThing()
	 * @generated
	 * @ordered
	 */
	protected EList<Thing> thing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.ROOT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.ROOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mLmodel.Process getProcess() {
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcess(mLmodel.Process newProcess, NotificationChain msgs) {
		mLmodel.Process oldProcess = process;
		process = newProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MLmodelPackage.ROOT__PROCESS,
					oldProcess, newProcess);
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
	public void setProcess(mLmodel.Process newProcess) {
		if (newProcess != process) {
			NotificationChain msgs = null;
			if (process != null)
				msgs = ((InternalEObject) process).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MLmodelPackage.ROOT__PROCESS, null, msgs);
			if (newProcess != null)
				msgs = ((InternalEObject) newProcess).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MLmodelPackage.ROOT__PROCESS, null, msgs);
			msgs = basicSetProcess(newProcess, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.ROOT__PROCESS, newProcess,
					newProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Thing> getThing() {
		if (thing == null) {
			thing = new EObjectContainmentEList<Thing>(Thing.class, this, MLmodelPackage.ROOT__THING);
		}
		return thing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MLmodelPackage.ROOT__PROCESS:
			return basicSetProcess(null, msgs);
		case MLmodelPackage.ROOT__THING:
			return ((InternalEList<?>) getThing()).basicRemove(otherEnd, msgs);
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
		case MLmodelPackage.ROOT__NAME:
			return getName();
		case MLmodelPackage.ROOT__PROCESS:
			return getProcess();
		case MLmodelPackage.ROOT__THING:
			return getThing();
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
		case MLmodelPackage.ROOT__NAME:
			setName((String) newValue);
			return;
		case MLmodelPackage.ROOT__PROCESS:
			setProcess((mLmodel.Process) newValue);
			return;
		case MLmodelPackage.ROOT__THING:
			getThing().clear();
			getThing().addAll((Collection<? extends Thing>) newValue);
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
		case MLmodelPackage.ROOT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MLmodelPackage.ROOT__PROCESS:
			setProcess((mLmodel.Process) null);
			return;
		case MLmodelPackage.ROOT__THING:
			getThing().clear();
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
		case MLmodelPackage.ROOT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MLmodelPackage.ROOT__PROCESS:
			return process != null;
		case MLmodelPackage.ROOT__THING:
			return thing != null && !thing.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //RootImpl
