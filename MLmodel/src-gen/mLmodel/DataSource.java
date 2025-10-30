/**
 */
package mLmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.DataSource#getName <em>Name</em>}</li>
 *   <li>{@link mLmodel.DataSource#getType <em>Type</em>}</li>
 *   <li>{@link mLmodel.DataSource#getSourceURI <em>Source URI</em>}</li>
 *   <li>{@link mLmodel.DataSource#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see mLmodel.MLmodelPackage#getDataSource()
 * @model
 * @generated
 */
public interface DataSource extends Import_Data {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mLmodel.MLmodelPackage#getDataSource_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mLmodel.DataSource#getName <em>Name</em>}' attribute.
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
	 * @see mLmodel.MLmodelPackage#getDataSource_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link mLmodel.DataSource#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Source URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source URI</em>' attribute.
	 * @see #setSourceURI(String)
	 * @see mLmodel.MLmodelPackage#getDataSource_SourceURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getSourceURI();

	/**
	 * Sets the value of the '{@link mLmodel.DataSource#getSourceURI <em>Source URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source URI</em>' attribute.
	 * @see #getSourceURI()
	 * @generated
	 */
	void setSourceURI(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see mLmodel.MLmodelPackage#getDataSource_Format()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link mLmodel.DataSource#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

} // DataSource
