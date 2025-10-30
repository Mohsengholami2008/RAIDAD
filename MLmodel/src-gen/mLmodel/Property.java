/**
 */
package mLmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.Property#getDatasource <em>Datasource</em>}</li>
 *   <li>{@link mLmodel.Property#getName <em>Name</em>}</li>
 *   <li>{@link mLmodel.Property#getType <em>Type</em>}</li>
 *   <li>{@link mLmodel.Property#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link mLmodel.Property#isWriteOnly <em>Write Only</em>}</li>
 *   <li>{@link mLmodel.Property#isObservable <em>Observable</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject {

	/**
	 * Returns the value of the '<em><b>Datasource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datasource</em>' reference.
	 * @see #setDatasource(DataSource)
	 * @see mLmodel.MLmodelPackage#getProperty_Datasource()
	 * @model
	 * @generated
	 */
	DataSource getDatasource();

	/**
	 * Sets the value of the '{@link mLmodel.Property#getDatasource <em>Datasource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datasource</em>' reference.
	 * @see #getDatasource()
	 * @generated
	 */
	void setDatasource(DataSource value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mLmodel.MLmodelPackage#getProperty_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mLmodel.Property#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see mLmodel.MLmodelPackage#getProperty_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link mLmodel.Property#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see mLmodel.MLmodelPackage#getProperty_ReadOnly()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link mLmodel.Property#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Only</em>' attribute.
	 * @see #setWriteOnly(boolean)
	 * @see mLmodel.MLmodelPackage#getProperty_WriteOnly()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isWriteOnly();

	/**
	 * Sets the value of the '{@link mLmodel.Property#isWriteOnly <em>Write Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Only</em>' attribute.
	 * @see #isWriteOnly()
	 * @generated
	 */
	void setWriteOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Observable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observable</em>' attribute.
	 * @see #setObservable(boolean)
	 * @see mLmodel.MLmodelPackage#getProperty_Observable()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isObservable();

	/**
	 * Sets the value of the '{@link mLmodel.Property#isObservable <em>Observable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observable</em>' attribute.
	 * @see #isObservable()
	 * @generated
	 */
	void setObservable(boolean value);
} // Property
