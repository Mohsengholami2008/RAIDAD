/**
 */
package mLmodel.impl;

import java.util.Collection;
import mLmodel.Action;
import mLmodel.Event;
import mLmodel.MLmodelPackage;
import mLmodel.Property;
import mLmodel.ProtocolBinding;
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
 * An implementation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.ThingImpl#getProtocolbinding <em>Protocolbinding</em>}</li>
 *   <li>{@link mLmodel.impl.ThingImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link mLmodel.impl.ThingImpl#getAction <em>Action</em>}</li>
 *   <li>{@link mLmodel.impl.ThingImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link mLmodel.impl.ThingImpl#getId <em>Id</em>}</li>
 *   <li>{@link mLmodel.impl.ThingImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link mLmodel.impl.ThingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mLmodel.impl.ThingImpl#getBaseURI <em>Base URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThingImpl extends MinimalEObjectImpl.Container implements Thing {
	/**
	 * The cached value of the '{@link #getProtocolbinding() <em>Protocolbinding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolbinding()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtocolBinding> protocolbinding;
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> property;
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;
	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> event;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getBaseURI() <em>Base URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseURI()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_URI_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBaseURI() <em>Base URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseURI()
	 * @generated
	 * @ordered
	 */
	protected String baseURI = BASE_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.THING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtocolBinding> getProtocolbinding() {
		if (protocolbinding == null) {
			protocolbinding = new EObjectContainmentEList<ProtocolBinding>(ProtocolBinding.class, this,
					MLmodelPackage.THING__PROTOCOLBINDING);
		}
		return protocolbinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<Property>(Property.class, this, MLmodelPackage.THING__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this, MLmodelPackage.THING__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvent() {
		if (event == null) {
			event = new EObjectContainmentEList<Event>(Event.class, this, MLmodelPackage.THING__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.THING__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.THING__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.THING__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseURI() {
		return baseURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseURI(String newBaseURI) {
		String oldBaseURI = baseURI;
		baseURI = newBaseURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.THING__BASE_URI, oldBaseURI, baseURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MLmodelPackage.THING__PROTOCOLBINDING:
			return ((InternalEList<?>) getProtocolbinding()).basicRemove(otherEnd, msgs);
		case MLmodelPackage.THING__PROPERTY:
			return ((InternalEList<?>) getProperty()).basicRemove(otherEnd, msgs);
		case MLmodelPackage.THING__ACTION:
			return ((InternalEList<?>) getAction()).basicRemove(otherEnd, msgs);
		case MLmodelPackage.THING__EVENT:
			return ((InternalEList<?>) getEvent()).basicRemove(otherEnd, msgs);
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
		case MLmodelPackage.THING__PROTOCOLBINDING:
			return getProtocolbinding();
		case MLmodelPackage.THING__PROPERTY:
			return getProperty();
		case MLmodelPackage.THING__ACTION:
			return getAction();
		case MLmodelPackage.THING__EVENT:
			return getEvent();
		case MLmodelPackage.THING__ID:
			return getId();
		case MLmodelPackage.THING__TITLE:
			return getTitle();
		case MLmodelPackage.THING__DESCRIPTION:
			return getDescription();
		case MLmodelPackage.THING__BASE_URI:
			return getBaseURI();
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
		case MLmodelPackage.THING__PROTOCOLBINDING:
			getProtocolbinding().clear();
			getProtocolbinding().addAll((Collection<? extends ProtocolBinding>) newValue);
			return;
		case MLmodelPackage.THING__PROPERTY:
			getProperty().clear();
			getProperty().addAll((Collection<? extends Property>) newValue);
			return;
		case MLmodelPackage.THING__ACTION:
			getAction().clear();
			getAction().addAll((Collection<? extends Action>) newValue);
			return;
		case MLmodelPackage.THING__EVENT:
			getEvent().clear();
			getEvent().addAll((Collection<? extends Event>) newValue);
			return;
		case MLmodelPackage.THING__ID:
			setId((String) newValue);
			return;
		case MLmodelPackage.THING__TITLE:
			setTitle((String) newValue);
			return;
		case MLmodelPackage.THING__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case MLmodelPackage.THING__BASE_URI:
			setBaseURI((String) newValue);
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
		case MLmodelPackage.THING__PROTOCOLBINDING:
			getProtocolbinding().clear();
			return;
		case MLmodelPackage.THING__PROPERTY:
			getProperty().clear();
			return;
		case MLmodelPackage.THING__ACTION:
			getAction().clear();
			return;
		case MLmodelPackage.THING__EVENT:
			getEvent().clear();
			return;
		case MLmodelPackage.THING__ID:
			setId(ID_EDEFAULT);
			return;
		case MLmodelPackage.THING__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case MLmodelPackage.THING__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case MLmodelPackage.THING__BASE_URI:
			setBaseURI(BASE_URI_EDEFAULT);
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
		case MLmodelPackage.THING__PROTOCOLBINDING:
			return protocolbinding != null && !protocolbinding.isEmpty();
		case MLmodelPackage.THING__PROPERTY:
			return property != null && !property.isEmpty();
		case MLmodelPackage.THING__ACTION:
			return action != null && !action.isEmpty();
		case MLmodelPackage.THING__EVENT:
			return event != null && !event.isEmpty();
		case MLmodelPackage.THING__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case MLmodelPackage.THING__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case MLmodelPackage.THING__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case MLmodelPackage.THING__BASE_URI:
			return BASE_URI_EDEFAULT == null ? baseURI != null : !BASE_URI_EDEFAULT.equals(baseURI);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", baseURI: ");
		result.append(baseURI);
		result.append(')');
		return result.toString();
	}

} //ThingImpl
