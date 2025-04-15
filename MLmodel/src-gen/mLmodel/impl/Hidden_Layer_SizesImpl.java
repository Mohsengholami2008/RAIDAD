/**
 */
package mLmodel.impl;

import mLmodel.Hidden_Layer_Sizes;
import mLmodel.MLmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hidden Layer Sizes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.Hidden_Layer_SizesImpl#getNeurons <em>Neurons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Hidden_Layer_SizesImpl extends MinimalEObjectImpl.Container implements Hidden_Layer_Sizes {
	/**
	 * The default value of the '{@link #getNeurons() <em>Neurons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeurons()
	 * @generated
	 * @ordered
	 */
	protected static final int NEURONS_EDEFAULT = 100;

	/**
	 * The cached value of the '{@link #getNeurons() <em>Neurons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeurons()
	 * @generated
	 * @ordered
	 */
	protected int neurons = NEURONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hidden_Layer_SizesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.HIDDEN_LAYER_SIZES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNeurons() {
		return neurons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeurons(int newNeurons) {
		int oldNeurons = neurons;
		neurons = newNeurons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.HIDDEN_LAYER_SIZES__NEURONS,
					oldNeurons, neurons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.HIDDEN_LAYER_SIZES__NEURONS:
			return getNeurons();
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
		case MLmodelPackage.HIDDEN_LAYER_SIZES__NEURONS:
			setNeurons((Integer) newValue);
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
		case MLmodelPackage.HIDDEN_LAYER_SIZES__NEURONS:
			setNeurons(NEURONS_EDEFAULT);
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
		case MLmodelPackage.HIDDEN_LAYER_SIZES__NEURONS:
			return neurons != NEURONS_EDEFAULT;
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
		result.append(" (neurons: ");
		result.append(neurons);
		result.append(')');
		return result.toString();
	}

} //Hidden_Layer_SizesImpl
