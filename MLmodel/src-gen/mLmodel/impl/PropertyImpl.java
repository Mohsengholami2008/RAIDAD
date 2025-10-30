/**
 */
package mLmodel.impl;

import mLmodel.DataSource;
import mLmodel.MLmodelPackage;
import mLmodel.Property;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.PropertyImpl#getDatasource <em>Datasource</em>}</li>
 *   <li>{@link mLmodel.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link mLmodel.impl.PropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link mLmodel.impl.PropertyImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link mLmodel.impl.PropertyImpl#isWriteOnly <em>Write Only</em>}</li>
 *   <li>{@link mLmodel.impl.PropertyImpl#isObservable <em>Observable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property {
	/**
	 * The cached value of the '{@link #getDatasource() <em>Datasource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasource()
	 * @generated
	 * @ordered
	 */
	protected DataSource datasource;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;
	/**
	 * The default value of the '{@link #isWriteOnly() <em>Write Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WRITE_ONLY_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isWriteOnly() <em>Write Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean writeOnly = WRITE_ONLY_EDEFAULT;
	/**
	 * The default value of the '{@link #isObservable() <em>Observable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObservable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBSERVABLE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isObservable() <em>Observable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObservable()
	 * @generated
	 * @ordered
	 */
	protected boolean observable = OBSERVABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource getDatasource() {
		if (datasource != null && datasource.eIsProxy()) {
			InternalEObject oldDatasource = (InternalEObject) datasource;
			datasource = (DataSource) eResolveProxy(oldDatasource);
			if (datasource != oldDatasource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MLmodelPackage.PROPERTY__DATASOURCE,
							oldDatasource, datasource));
			}
		}
		return datasource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource basicGetDatasource() {
		return datasource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatasource(DataSource newDatasource) {
		DataSource oldDatasource = datasource;
		datasource = newDatasource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.PROPERTY__DATASOURCE, oldDatasource,
					datasource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.PROPERTY__READ_ONLY, oldReadOnly,
					readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWriteOnly() {
		return writeOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteOnly(boolean newWriteOnly) {
		boolean oldWriteOnly = writeOnly;
		writeOnly = newWriteOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.PROPERTY__WRITE_ONLY, oldWriteOnly,
					writeOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isObservable() {
		return observable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservable(boolean newObservable) {
		boolean oldObservable = observable;
		observable = newObservable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.PROPERTY__OBSERVABLE, oldObservable,
					observable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.PROPERTY__DATASOURCE:
			if (resolve)
				return getDatasource();
			return basicGetDatasource();
		case MLmodelPackage.PROPERTY__NAME:
			return getName();
		case MLmodelPackage.PROPERTY__TYPE:
			return getType();
		case MLmodelPackage.PROPERTY__READ_ONLY:
			return isReadOnly();
		case MLmodelPackage.PROPERTY__WRITE_ONLY:
			return isWriteOnly();
		case MLmodelPackage.PROPERTY__OBSERVABLE:
			return isObservable();
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
		case MLmodelPackage.PROPERTY__DATASOURCE:
			setDatasource((DataSource) newValue);
			return;
		case MLmodelPackage.PROPERTY__NAME:
			setName((String) newValue);
			return;
		case MLmodelPackage.PROPERTY__TYPE:
			setType((String) newValue);
			return;
		case MLmodelPackage.PROPERTY__READ_ONLY:
			setReadOnly((Boolean) newValue);
			return;
		case MLmodelPackage.PROPERTY__WRITE_ONLY:
			setWriteOnly((Boolean) newValue);
			return;
		case MLmodelPackage.PROPERTY__OBSERVABLE:
			setObservable((Boolean) newValue);
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
		case MLmodelPackage.PROPERTY__DATASOURCE:
			setDatasource((DataSource) null);
			return;
		case MLmodelPackage.PROPERTY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MLmodelPackage.PROPERTY__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case MLmodelPackage.PROPERTY__READ_ONLY:
			setReadOnly(READ_ONLY_EDEFAULT);
			return;
		case MLmodelPackage.PROPERTY__WRITE_ONLY:
			setWriteOnly(WRITE_ONLY_EDEFAULT);
			return;
		case MLmodelPackage.PROPERTY__OBSERVABLE:
			setObservable(OBSERVABLE_EDEFAULT);
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
		case MLmodelPackage.PROPERTY__DATASOURCE:
			return datasource != null;
		case MLmodelPackage.PROPERTY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MLmodelPackage.PROPERTY__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case MLmodelPackage.PROPERTY__READ_ONLY:
			return readOnly != READ_ONLY_EDEFAULT;
		case MLmodelPackage.PROPERTY__WRITE_ONLY:
			return writeOnly != WRITE_ONLY_EDEFAULT;
		case MLmodelPackage.PROPERTY__OBSERVABLE:
			return observable != OBSERVABLE_EDEFAULT;
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
		result.append(", type: ");
		result.append(type);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(", writeOnly: ");
		result.append(writeOnly);
		result.append(", observable: ");
		result.append(observable);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
