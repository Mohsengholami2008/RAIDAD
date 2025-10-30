/**
 */
package mLmodel.impl;

import mLmodel.MLmodelPackage;
import mLmodel.ProtocolBinding;

import mLmodel.ProtocolBindingEnum;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.ProtocolBindingImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link mLmodel.impl.ProtocolBindingImpl#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtocolBindingImpl extends MinimalEObjectImpl.Container implements ProtocolBinding {
	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final ProtocolBindingEnum PROTOCOL_EDEFAULT = ProtocolBindingEnum.HTTP;
	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected ProtocolBindingEnum protocol = PROTOCOL_EDEFAULT;
	/**
	 * The default value of the '{@link #getEndpoint() <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected String endpoint = ENDPOINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.PROTOCOL_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolBindingEnum getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(ProtocolBindingEnum newProtocol) {
		ProtocolBindingEnum oldProtocol = protocol;
		protocol = newProtocol == null ? PROTOCOL_EDEFAULT : newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.PROTOCOL_BINDING__PROTOCOL,
					oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndpoint() {
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint(String newEndpoint) {
		String oldEndpoint = endpoint;
		endpoint = newEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.PROTOCOL_BINDING__ENDPOINT,
					oldEndpoint, endpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.PROTOCOL_BINDING__PROTOCOL:
			return getProtocol();
		case MLmodelPackage.PROTOCOL_BINDING__ENDPOINT:
			return getEndpoint();
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
		case MLmodelPackage.PROTOCOL_BINDING__PROTOCOL:
			setProtocol((ProtocolBindingEnum) newValue);
			return;
		case MLmodelPackage.PROTOCOL_BINDING__ENDPOINT:
			setEndpoint((String) newValue);
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
		case MLmodelPackage.PROTOCOL_BINDING__PROTOCOL:
			setProtocol(PROTOCOL_EDEFAULT);
			return;
		case MLmodelPackage.PROTOCOL_BINDING__ENDPOINT:
			setEndpoint(ENDPOINT_EDEFAULT);
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
		case MLmodelPackage.PROTOCOL_BINDING__PROTOCOL:
			return protocol != PROTOCOL_EDEFAULT;
		case MLmodelPackage.PROTOCOL_BINDING__ENDPOINT:
			return ENDPOINT_EDEFAULT == null ? endpoint != null : !ENDPOINT_EDEFAULT.equals(endpoint);
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
		result.append(" (protocol: ");
		result.append(protocol);
		result.append(", endpoint: ");
		result.append(endpoint);
		result.append(')');
		return result.toString();
	}

} //ProtocolBindingImpl
