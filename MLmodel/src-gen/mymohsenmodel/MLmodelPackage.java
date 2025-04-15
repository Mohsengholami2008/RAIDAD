/**
 */
package mymohsenmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mymohsenmodel.MLmodelFactory
 * @model kind="package"
 * @generated
 */
public interface MLmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mymohsenmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mymohsenmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mymohsenmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MLmodelPackage eINSTANCE = mymohsenmodel.impl.MLmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link mymohsenmodel.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymohsenmodel.impl.RootImpl
	 * @see mymohsenmodel.impl.MLmodelPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__PROCESS = 1;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mymohsenmodel.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymohsenmodel.impl.ProcessImpl
	 * @see mymohsenmodel.impl.MLmodelPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 1;

	/**
	 * The feature id for the '<em><b>File path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__FILE_PATH = 0;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CYCLE = 1;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mymohsenmodel.Cycle <em>Cycle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymohsenmodel.Cycle
	 * @see mymohsenmodel.impl.MLmodelPackageImpl#getCycle()
	 * @generated
	 */
	int CYCLE = 2;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE__AFTER = 0;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE__BEFORE = 1;

	/**
	 * The feature id for the '<em><b>Regular</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE__REGULAR = 2;

	/**
	 * The number of structural features of the '<em>Cycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mymohsenmodel.Import_Data <em>Import Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymohsenmodel.Import_Data
	 * @see mymohsenmodel.impl.MLmodelPackageImpl#getImport_Data()
	 * @generated
	 */
	int IMPORT_DATA = 3;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DATA__AFTER = CYCLE__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DATA__BEFORE = CYCLE__BEFORE;

	/**
	 * The feature id for the '<em><b>Regular</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DATA__REGULAR = CYCLE__REGULAR;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DATA__ROLE = CYCLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Import Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DATA_FEATURE_COUNT = CYCLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Import Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DATA_OPERATION_COUNT = CYCLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mymohsenmodel.impl.CSVImpl <em>CSV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymohsenmodel.impl.CSVImpl
	 * @see mymohsenmodel.impl.MLmodelPackageImpl#getCSV()
	 * @generated
	 */
	int CSV = 4;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV__AFTER = IMPORT_DATA__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV__BEFORE = IMPORT_DATA__BEFORE;

	/**
	 * The feature id for the '<em><b>Regular</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV__REGULAR = IMPORT_DATA__REGULAR;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV__ROLE = IMPORT_DATA__ROLE;

	/**
	 * The feature id for the '<em><b>Csv argumans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV__CSV_ARGUMANS = IMPORT_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CSV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_FEATURE_COUNT = IMPORT_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CSV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_OPERATION_COUNT = IMPORT_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mymohsenmodel.CSV_Argumans <em>CSV Argumans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymohsenmodel.CSV_Argumans
	 * @see mymohsenmodel.impl.MLmodelPackageImpl#getCSV_Argumans()
	 * @generated
	 */
	int CSV_ARGUMANS = 5;

	/**
	 * The number of structural features of the '<em>CSV Argumans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_ARGUMANS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>CSV Argumans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV_ARGUMANS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mymohsenmodel.impl.SepImpl <em>Sep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymohsenmodel.impl.SepImpl
	 * @see mymohsenmodel.impl.MLmodelPackageImpl#getSep()
	 * @generated
	 */
	int SEP = 6;

	/**
	 * The feature id for the '<em><b>Default value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEP__DEFAULT_VALUE = CSV_ARGUMANS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Manual sep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEP__MANUAL_SEP = CSV_ARGUMANS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Define</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEP__DEFINE = CSV_ARGUMANS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEP_FEATURE_COUNT = CSV_ARGUMANS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEP_OPERATION_COUNT = CSV_ARGUMANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mymohsenmodel.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymohsenmodel.impl.HeaderImpl
	 * @see mymohsenmodel.impl.MLmodelPackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 7;

	/**
	 * The feature id for the '<em><b>Default value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__DEFAULT_VALUE = CSV_ARGUMANS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = CSV_ARGUMANS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_OPERATION_COUNT = CSV_ARGUMANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mymohsenmodel.impl.NrowsImpl <em>Nrows</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymohsenmodel.impl.NrowsImpl
	 * @see mymohsenmodel.impl.MLmodelPackageImpl#getNrows()
	 * @generated
	 */
	int NROWS = 8;

	/**
	 * The feature id for the '<em><b>Default value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NROWS__DEFAULT_VALUE = CSV_ARGUMANS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nrows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NROWS_FEATURE_COUNT = CSV_ARGUMANS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Nrows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NROWS_OPERATION_COUNT = CSV_ARGUMANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mymohsenmodel.Set_Role <em>Set Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymohsenmodel.Set_Role
	 * @see mymohsenmodel.impl.MLmodelPackageImpl#getSet_Role()
	 * @generated
	 */
	int SET_ROLE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ROLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ROLE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Set Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ROLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Set Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mymohsenmodel.impl.IDImpl <em>ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymohsenmodel.impl.IDImpl
	 * @see mymohsenmodel.impl.MLmodelPackageImpl#getID()
	 * @generated
	 */
	int ID = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__NAME = SET_ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID__TYPE = SET_ROLE__TYPE;

	/**
	 * The number of structural features of the '<em>ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_FEATURE_COUNT = SET_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_OPERATION_COUNT = SET_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mymohsenmodel.impl.TargetImpl <em>Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymohsenmodel.impl.TargetImpl
	 * @see mymohsenmodel.impl.MLmodelPackageImpl#getTarget()
	 * @generated
	 */
	int TARGET = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__NAME = SET_ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__TYPE = SET_ROLE__TYPE;

	/**
	 * The number of structural features of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FEATURE_COUNT = SET_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_OPERATION_COUNT = SET_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mymohsenmodel.impl.RegularImpl <em>Regular</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymohsenmodel.impl.RegularImpl
	 * @see mymohsenmodel.impl.MLmodelPackageImpl#getRegular()
	 * @generated
	 */
	int REGULAR = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR__NAME = SET_ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR__TYPE = SET_ROLE__TYPE;

	/**
	 * The number of structural features of the '<em>Regular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_FEATURE_COUNT = SET_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Regular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULAR_OPERATION_COUNT = SET_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mymohsenmodel.Enum_CSV_Sep <em>Enum CSV Sep</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mymohsenmodel.Enum_CSV_Sep
	 * @see mymohsenmodel.impl.MLmodelPackageImpl#getEnum_CSV_Sep()
	 * @generated
	 */
	int ENUM_CSV_SEP = 13;

	/**
	 * Returns the meta object for class '{@link mymohsenmodel.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see mymohsenmodel.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the attribute '{@link mymohsenmodel.Root#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mymohsenmodel.Root#getName()
	 * @see #getRoot()
	 * @generated
	 */
	EAttribute getRoot_Name();

	/**
	 * Returns the meta object for the containment reference '{@link mymohsenmodel.Root#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process</em>'.
	 * @see mymohsenmodel.Root#getProcess()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Process();

	/**
	 * Returns the meta object for class '{@link mymohsenmodel.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see mymohsenmodel.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the attribute '{@link mymohsenmodel.Process#getFile_path <em>File path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File path</em>'.
	 * @see mymohsenmodel.Process#getFile_path()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_File_path();

	/**
	 * Returns the meta object for the containment reference list '{@link mymohsenmodel.Process#getCycle <em>Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cycle</em>'.
	 * @see mymohsenmodel.Process#getCycle()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Cycle();

	/**
	 * Returns the meta object for class '{@link mymohsenmodel.Cycle <em>Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cycle</em>'.
	 * @see mymohsenmodel.Cycle
	 * @generated
	 */
	EClass getCycle();

	/**
	 * Returns the meta object for the reference '{@link mymohsenmodel.Cycle#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>After</em>'.
	 * @see mymohsenmodel.Cycle#getAfter()
	 * @see #getCycle()
	 * @generated
	 */
	EReference getCycle_After();

	/**
	 * Returns the meta object for the reference '{@link mymohsenmodel.Cycle#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Before</em>'.
	 * @see mymohsenmodel.Cycle#getBefore()
	 * @see #getCycle()
	 * @generated
	 */
	EReference getCycle_Before();

	/**
	 * Returns the meta object for the reference list '{@link mymohsenmodel.Cycle#getRegular <em>Regular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Regular</em>'.
	 * @see mymohsenmodel.Cycle#getRegular()
	 * @see #getCycle()
	 * @generated
	 */
	EReference getCycle_Regular();

	/**
	 * Returns the meta object for class '{@link mymohsenmodel.Import_Data <em>Import Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Data</em>'.
	 * @see mymohsenmodel.Import_Data
	 * @generated
	 */
	EClass getImport_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link mymohsenmodel.Import_Data#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see mymohsenmodel.Import_Data#getRole()
	 * @see #getImport_Data()
	 * @generated
	 */
	EReference getImport_Data_Role();

	/**
	 * Returns the meta object for class '{@link mymohsenmodel.CSV <em>CSV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSV</em>'.
	 * @see mymohsenmodel.CSV
	 * @generated
	 */
	EClass getCSV();

	/**
	 * Returns the meta object for the containment reference list '{@link mymohsenmodel.CSV#getCsv_argumans <em>Csv argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Csv argumans</em>'.
	 * @see mymohsenmodel.CSV#getCsv_argumans()
	 * @see #getCSV()
	 * @generated
	 */
	EReference getCSV_Csv_argumans();

	/**
	 * Returns the meta object for class '{@link mymohsenmodel.CSV_Argumans <em>CSV Argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSV Argumans</em>'.
	 * @see mymohsenmodel.CSV_Argumans
	 * @generated
	 */
	EClass getCSV_Argumans();

	/**
	 * Returns the meta object for class '{@link mymohsenmodel.Sep <em>Sep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sep</em>'.
	 * @see mymohsenmodel.Sep
	 * @generated
	 */
	EClass getSep();

	/**
	 * Returns the meta object for the attribute '{@link mymohsenmodel.Sep#getDefault_value <em>Default value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default value</em>'.
	 * @see mymohsenmodel.Sep#getDefault_value()
	 * @see #getSep()
	 * @generated
	 */
	EAttribute getSep_Default_value();

	/**
	 * Returns the meta object for the attribute '{@link mymohsenmodel.Sep#isManual_sep <em>Manual sep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manual sep</em>'.
	 * @see mymohsenmodel.Sep#isManual_sep()
	 * @see #getSep()
	 * @generated
	 */
	EAttribute getSep_Manual_sep();

	/**
	 * Returns the meta object for the attribute '{@link mymohsenmodel.Sep#getDefine <em>Define</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Define</em>'.
	 * @see mymohsenmodel.Sep#getDefine()
	 * @see #getSep()
	 * @generated
	 */
	EAttribute getSep_Define();

	/**
	 * Returns the meta object for class '{@link mymohsenmodel.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see mymohsenmodel.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the attribute '{@link mymohsenmodel.Header#getDefault_value <em>Default value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default value</em>'.
	 * @see mymohsenmodel.Header#getDefault_value()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Default_value();

	/**
	 * Returns the meta object for class '{@link mymohsenmodel.Nrows <em>Nrows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nrows</em>'.
	 * @see mymohsenmodel.Nrows
	 * @generated
	 */
	EClass getNrows();

	/**
	 * Returns the meta object for the attribute '{@link mymohsenmodel.Nrows#getDefault_value <em>Default value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default value</em>'.
	 * @see mymohsenmodel.Nrows#getDefault_value()
	 * @see #getNrows()
	 * @generated
	 */
	EAttribute getNrows_Default_value();

	/**
	 * Returns the meta object for class '{@link mymohsenmodel.Set_Role <em>Set Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Role</em>'.
	 * @see mymohsenmodel.Set_Role
	 * @generated
	 */
	EClass getSet_Role();

	/**
	 * Returns the meta object for the attribute '{@link mymohsenmodel.Set_Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mymohsenmodel.Set_Role#getName()
	 * @see #getSet_Role()
	 * @generated
	 */
	EAttribute getSet_Role_Name();

	/**
	 * Returns the meta object for the attribute '{@link mymohsenmodel.Set_Role#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mymohsenmodel.Set_Role#getType()
	 * @see #getSet_Role()
	 * @generated
	 */
	EAttribute getSet_Role_Type();

	/**
	 * Returns the meta object for class '{@link mymohsenmodel.ID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID</em>'.
	 * @see mymohsenmodel.ID
	 * @generated
	 */
	EClass getID();

	/**
	 * Returns the meta object for class '{@link mymohsenmodel.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target</em>'.
	 * @see mymohsenmodel.Target
	 * @generated
	 */
	EClass getTarget();

	/**
	 * Returns the meta object for class '{@link mymohsenmodel.Regular <em>Regular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular</em>'.
	 * @see mymohsenmodel.Regular
	 * @generated
	 */
	EClass getRegular();

	/**
	 * Returns the meta object for enum '{@link mymohsenmodel.Enum_CSV_Sep <em>Enum CSV Sep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum CSV Sep</em>'.
	 * @see mymohsenmodel.Enum_CSV_Sep
	 * @generated
	 */
	EEnum getEnum_CSV_Sep();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MLmodelFactory getMLmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mymohsenmodel.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymohsenmodel.impl.RootImpl
		 * @see mymohsenmodel.impl.MLmodelPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT__NAME = eINSTANCE.getRoot_Name();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__PROCESS = eINSTANCE.getRoot_Process();

		/**
		 * The meta object literal for the '{@link mymohsenmodel.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymohsenmodel.impl.ProcessImpl
		 * @see mymohsenmodel.impl.MLmodelPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>File path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__FILE_PATH = eINSTANCE.getProcess_File_path();

		/**
		 * The meta object literal for the '<em><b>Cycle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__CYCLE = eINSTANCE.getProcess_Cycle();

		/**
		 * The meta object literal for the '{@link mymohsenmodel.Cycle <em>Cycle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymohsenmodel.Cycle
		 * @see mymohsenmodel.impl.MLmodelPackageImpl#getCycle()
		 * @generated
		 */
		EClass CYCLE = eINSTANCE.getCycle();

		/**
		 * The meta object literal for the '<em><b>After</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYCLE__AFTER = eINSTANCE.getCycle_After();

		/**
		 * The meta object literal for the '<em><b>Before</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYCLE__BEFORE = eINSTANCE.getCycle_Before();

		/**
		 * The meta object literal for the '<em><b>Regular</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CYCLE__REGULAR = eINSTANCE.getCycle_Regular();

		/**
		 * The meta object literal for the '{@link mymohsenmodel.Import_Data <em>Import Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymohsenmodel.Import_Data
		 * @see mymohsenmodel.impl.MLmodelPackageImpl#getImport_Data()
		 * @generated
		 */
		EClass IMPORT_DATA = eINSTANCE.getImport_Data();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_DATA__ROLE = eINSTANCE.getImport_Data_Role();

		/**
		 * The meta object literal for the '{@link mymohsenmodel.impl.CSVImpl <em>CSV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymohsenmodel.impl.CSVImpl
		 * @see mymohsenmodel.impl.MLmodelPackageImpl#getCSV()
		 * @generated
		 */
		EClass CSV = eINSTANCE.getCSV();

		/**
		 * The meta object literal for the '<em><b>Csv argumans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSV__CSV_ARGUMANS = eINSTANCE.getCSV_Csv_argumans();

		/**
		 * The meta object literal for the '{@link mymohsenmodel.CSV_Argumans <em>CSV Argumans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymohsenmodel.CSV_Argumans
		 * @see mymohsenmodel.impl.MLmodelPackageImpl#getCSV_Argumans()
		 * @generated
		 */
		EClass CSV_ARGUMANS = eINSTANCE.getCSV_Argumans();

		/**
		 * The meta object literal for the '{@link mymohsenmodel.impl.SepImpl <em>Sep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymohsenmodel.impl.SepImpl
		 * @see mymohsenmodel.impl.MLmodelPackageImpl#getSep()
		 * @generated
		 */
		EClass SEP = eINSTANCE.getSep();

		/**
		 * The meta object literal for the '<em><b>Default value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEP__DEFAULT_VALUE = eINSTANCE.getSep_Default_value();

		/**
		 * The meta object literal for the '<em><b>Manual sep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEP__MANUAL_SEP = eINSTANCE.getSep_Manual_sep();

		/**
		 * The meta object literal for the '<em><b>Define</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEP__DEFINE = eINSTANCE.getSep_Define();

		/**
		 * The meta object literal for the '{@link mymohsenmodel.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymohsenmodel.impl.HeaderImpl
		 * @see mymohsenmodel.impl.MLmodelPackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '<em><b>Default value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__DEFAULT_VALUE = eINSTANCE.getHeader_Default_value();

		/**
		 * The meta object literal for the '{@link mymohsenmodel.impl.NrowsImpl <em>Nrows</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymohsenmodel.impl.NrowsImpl
		 * @see mymohsenmodel.impl.MLmodelPackageImpl#getNrows()
		 * @generated
		 */
		EClass NROWS = eINSTANCE.getNrows();

		/**
		 * The meta object literal for the '<em><b>Default value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NROWS__DEFAULT_VALUE = eINSTANCE.getNrows_Default_value();

		/**
		 * The meta object literal for the '{@link mymohsenmodel.Set_Role <em>Set Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymohsenmodel.Set_Role
		 * @see mymohsenmodel.impl.MLmodelPackageImpl#getSet_Role()
		 * @generated
		 */
		EClass SET_ROLE = eINSTANCE.getSet_Role();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_ROLE__NAME = eINSTANCE.getSet_Role_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_ROLE__TYPE = eINSTANCE.getSet_Role_Type();

		/**
		 * The meta object literal for the '{@link mymohsenmodel.impl.IDImpl <em>ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymohsenmodel.impl.IDImpl
		 * @see mymohsenmodel.impl.MLmodelPackageImpl#getID()
		 * @generated
		 */
		EClass ID = eINSTANCE.getID();

		/**
		 * The meta object literal for the '{@link mymohsenmodel.impl.TargetImpl <em>Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymohsenmodel.impl.TargetImpl
		 * @see mymohsenmodel.impl.MLmodelPackageImpl#getTarget()
		 * @generated
		 */
		EClass TARGET = eINSTANCE.getTarget();

		/**
		 * The meta object literal for the '{@link mymohsenmodel.impl.RegularImpl <em>Regular</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymohsenmodel.impl.RegularImpl
		 * @see mymohsenmodel.impl.MLmodelPackageImpl#getRegular()
		 * @generated
		 */
		EClass REGULAR = eINSTANCE.getRegular();

		/**
		 * The meta object literal for the '{@link mymohsenmodel.Enum_CSV_Sep <em>Enum CSV Sep</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mymohsenmodel.Enum_CSV_Sep
		 * @see mymohsenmodel.impl.MLmodelPackageImpl#getEnum_CSV_Sep()
		 * @generated
		 */
		EEnum ENUM_CSV_SEP = eINSTANCE.getEnum_CSV_Sep();

	}

} //MLmodelPackage
