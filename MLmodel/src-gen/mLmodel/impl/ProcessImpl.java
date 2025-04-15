/**
 */
package mLmodel.impl;

import java.util.Collection;

import mLmodel.Cycle;
import mLmodel.Data_Understanding;
import mLmodel.MLmodelPackage;

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
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.ProcessImpl#getFile_path <em>File path</em>}</li>
 *   <li>{@link mLmodel.impl.ProcessImpl#getCycle <em>Cycle</em>}</li>
 *   <li>{@link mLmodel.impl.ProcessImpl#getData_understanding <em>Data understanding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends MinimalEObjectImpl.Container implements mLmodel.Process {
	/**
	 * The default value of the '{@link #getFile_path() <em>File path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile_path()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile_path() <em>File path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile_path()
	 * @generated
	 * @ordered
	 */
	protected String file_path = FILE_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCycle() <em>Cycle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycle()
	 * @generated
	 * @ordered
	 */
	protected EList<Cycle> cycle;

	/**
	 * The cached value of the '{@link #getData_understanding() <em>Data understanding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_understanding()
	 * @generated
	 * @ordered
	 */
	protected EList<Data_Understanding> data_understanding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFile_path() {
		return file_path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile_path(String newFile_path) {
		String oldFile_path = file_path;
		file_path = newFile_path;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.PROCESS__FILE_PATH, oldFile_path,
					file_path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cycle> getCycle() {
		if (cycle == null) {
			cycle = new EObjectContainmentEList<Cycle>(Cycle.class, this, MLmodelPackage.PROCESS__CYCLE);
		}
		return cycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data_Understanding> getData_understanding() {
		if (data_understanding == null) {
			data_understanding = new EObjectContainmentEList<Data_Understanding>(Data_Understanding.class, this,
					MLmodelPackage.PROCESS__DATA_UNDERSTANDING);
		}
		return data_understanding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MLmodelPackage.PROCESS__CYCLE:
			return ((InternalEList<?>) getCycle()).basicRemove(otherEnd, msgs);
		case MLmodelPackage.PROCESS__DATA_UNDERSTANDING:
			return ((InternalEList<?>) getData_understanding()).basicRemove(otherEnd, msgs);
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
		case MLmodelPackage.PROCESS__FILE_PATH:
			return getFile_path();
		case MLmodelPackage.PROCESS__CYCLE:
			return getCycle();
		case MLmodelPackage.PROCESS__DATA_UNDERSTANDING:
			return getData_understanding();
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
		case MLmodelPackage.PROCESS__FILE_PATH:
			setFile_path((String) newValue);
			return;
		case MLmodelPackage.PROCESS__CYCLE:
			getCycle().clear();
			getCycle().addAll((Collection<? extends Cycle>) newValue);
			return;
		case MLmodelPackage.PROCESS__DATA_UNDERSTANDING:
			getData_understanding().clear();
			getData_understanding().addAll((Collection<? extends Data_Understanding>) newValue);
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
		case MLmodelPackage.PROCESS__FILE_PATH:
			setFile_path(FILE_PATH_EDEFAULT);
			return;
		case MLmodelPackage.PROCESS__CYCLE:
			getCycle().clear();
			return;
		case MLmodelPackage.PROCESS__DATA_UNDERSTANDING:
			getData_understanding().clear();
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
		case MLmodelPackage.PROCESS__FILE_PATH:
			return FILE_PATH_EDEFAULT == null ? file_path != null : !FILE_PATH_EDEFAULT.equals(file_path);
		case MLmodelPackage.PROCESS__CYCLE:
			return cycle != null && !cycle.isEmpty();
		case MLmodelPackage.PROCESS__DATA_UNDERSTANDING:
			return data_understanding != null && !data_understanding.isEmpty();
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
		result.append(" (file_path: ");
		result.append(file_path);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
