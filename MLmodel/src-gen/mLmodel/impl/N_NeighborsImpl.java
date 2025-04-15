/**
 */
package mLmodel.impl;

import mLmodel.MLmodelPackage;
import mLmodel.N_Neighbors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NNeighbors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.N_NeighborsImpl#getN_neighbors <em>Nneighbors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class N_NeighborsImpl extends MinimalEObjectImpl.Container implements N_Neighbors {
	/**
	 * The default value of the '{@link #getN_neighbors() <em>Nneighbors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN_neighbors()
	 * @generated
	 * @ordered
	 */
	protected static final int NNEIGHBORS_EDEFAULT = 5;
	/**
	 * The cached value of the '{@link #getN_neighbors() <em>Nneighbors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN_neighbors()
	 * @generated
	 * @ordered
	 */
	protected int n_neighbors = NNEIGHBORS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected N_NeighborsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.NNEIGHBORS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getN_neighbors() {
		return n_neighbors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setN_neighbors(int newN_neighbors) {
		int oldN_neighbors = n_neighbors;
		n_neighbors = newN_neighbors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.NNEIGHBORS__NNEIGHBORS, oldN_neighbors,
					n_neighbors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.NNEIGHBORS__NNEIGHBORS:
			return getN_neighbors();
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
		case MLmodelPackage.NNEIGHBORS__NNEIGHBORS:
			setN_neighbors((Integer) newValue);
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
		case MLmodelPackage.NNEIGHBORS__NNEIGHBORS:
			setN_neighbors(NNEIGHBORS_EDEFAULT);
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
		case MLmodelPackage.NNEIGHBORS__NNEIGHBORS:
			return n_neighbors != NNEIGHBORS_EDEFAULT;
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
		result.append(" (n_neighbors: ");
		result.append(n_neighbors);
		result.append(')');
		return result.toString();
	}

} //N_NeighborsImpl
