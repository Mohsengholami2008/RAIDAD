/**
 */
package mLmodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Thing#getProtocolbinding <em>Protocolbinding</em>}</li>
 *   <li>{@link mLmodel.Thing#getProperty <em>Property</em>}</li>
 *   <li>{@link mLmodel.Thing#getAction <em>Action</em>}</li>
 *   <li>{@link mLmodel.Thing#getEvent <em>Event</em>}</li>
 *   <li>{@link mLmodel.Thing#getId <em>Id</em>}</li>
 *   <li>{@link mLmodel.Thing#getTitle <em>Title</em>}</li>
 *   <li>{@link mLmodel.Thing#getDescription <em>Description</em>}</li>
 *   <li>{@link mLmodel.Thing#getBaseURI <em>Base URI</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getThing()
 * @model
 * @generated
 */
public interface Thing extends EObject {

	/**
	 * Returns the value of the '<em><b>Protocolbinding</b></em>' containment reference list.
	 * The list contents are of type {@link mLmodel.ProtocolBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocolbinding</em>' containment reference list.
	 * @see mLmodel.MLmodelPackage#getThing_Protocolbinding()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProtocolBinding> getProtocolbinding();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link mLmodel.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see mLmodel.MLmodelPackage#getThing_Property()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperty();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link mLmodel.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see mLmodel.MLmodelPackage#getThing_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link mLmodel.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see mLmodel.MLmodelPackage#getThing_Event()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvent();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see mLmodel.MLmodelPackage#getThing_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link mLmodel.Thing#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see mLmodel.MLmodelPackage#getThing_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link mLmodel.Thing#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mLmodel.MLmodelPackage#getThing_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mLmodel.Thing#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Base URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base URI</em>' attribute.
	 * @see #setBaseURI(String)
	 * @see mLmodel.MLmodelPackage#getThing_BaseURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getBaseURI();

	/**
	 * Sets the value of the '{@link mLmodel.Thing#getBaseURI <em>Base URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base URI</em>' attribute.
	 * @see #getBaseURI()
	 * @generated
	 */
	void setBaseURI(String value);
} // Thing
