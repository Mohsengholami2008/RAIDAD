package mLmodel;

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
 * @see mLmodel.MLmodelFactory
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
	String eNAME = "mLmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mLmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mLmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MLmodelPackage eINSTANCE = mLmodel.impl.MLmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link mLmodel.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.RootImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getRoot()
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
	 * The feature id for the '<em><b>Thing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__THING = 2;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.ProcessImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getProcess()
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
	 * The feature id for the '<em><b>Data understanding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DATA_UNDERSTANDING = 2;

	/**
	 * The feature id for the '<em><b>Analysystriger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ANALYSYSTRIGER = 3;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLmodel.Cycle <em>Cycle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Cycle
	 * @see mLmodel.impl.MLmodelPackageImpl#getCycle()
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
	 * The number of structural features of the '<em>Cycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cycle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYCLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLmodel.Preprocess <em>Preprocess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Preprocess
	 * @see mLmodel.impl.MLmodelPackageImpl#getPreprocess()
	 * @generated
	 */
	int PREPROCESS = 84;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESS__AFTER = CYCLE__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESS__BEFORE = CYCLE__BEFORE;

	/**
	 * The feature id for the '<em><b>Regular</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESS__REGULAR = CYCLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Save file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESS__SAVE_FILE = CYCLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Print data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESS__PRINT_DATA = CYCLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Preprocess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESS_FEATURE_COUNT = CYCLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Preprocess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPROCESS_OPERATION_COUNT = CYCLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.Import_Data <em>Import Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Import_Data
	 * @see mLmodel.impl.MLmodelPackageImpl#getImport_Data()
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
	int IMPORT_DATA__AFTER = PREPROCESS__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DATA__BEFORE = PREPROCESS__BEFORE;

	/**
	 * The feature id for the '<em><b>Regular</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DATA__REGULAR = PREPROCESS__REGULAR;

	/**
	 * The feature id for the '<em><b>Save file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DATA__SAVE_FILE = PREPROCESS__SAVE_FILE;

	/**
	 * The feature id for the '<em><b>Print data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DATA__PRINT_DATA = PREPROCESS__PRINT_DATA;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DATA__ROLE = PREPROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Import Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DATA_FEATURE_COUNT = PREPROCESS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Import Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DATA_OPERATION_COUNT = PREPROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.CSVImpl <em>CSV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.CSVImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getCSV()
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
	 * The feature id for the '<em><b>Save file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV__SAVE_FILE = IMPORT_DATA__SAVE_FILE;

	/**
	 * The feature id for the '<em><b>Print data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSV__PRINT_DATA = IMPORT_DATA__PRINT_DATA;

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
	 * The meta object id for the '{@link mLmodel.CSV_Argumans <em>CSV Argumans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.CSV_Argumans
	 * @see mLmodel.impl.MLmodelPackageImpl#getCSV_Argumans()
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
	 * The meta object id for the '{@link mLmodel.impl.SepImpl <em>Sep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.SepImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getSep()
	 * @generated
	 */
	int SEP = 6;

	/**
	 * The feature id for the '<em><b>Default value sep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEP__DEFAULT_VALUE_SEP = CSV_ARGUMANS_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link mLmodel.impl.NrowsImpl <em>Nrows</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.NrowsImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getNrows()
	 * @generated
	 */
	int NROWS = 7;

	/**
	 * The feature id for the '<em><b>Default value nrows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NROWS__DEFAULT_VALUE_NROWS = CSV_ARGUMANS_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link mLmodel.Set_Role <em>Set Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Set_Role
	 * @see mLmodel.impl.MLmodelPackageImpl#getSet_Role()
	 * @generated
	 */
	int SET_ROLE = 8;

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
	 * The meta object id for the '{@link mLmodel.impl.IDImpl <em>ID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.IDImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getID()
	 * @generated
	 */
	int ID = 9;

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
	 * The meta object id for the '{@link mLmodel.impl.TargetImpl <em>Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.TargetImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getTarget()
	 * @generated
	 */
	int TARGET = 10;

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
	 * The meta object id for the '{@link mLmodel.impl.RegularImpl <em>Regular</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.RegularImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getRegular()
	 * @generated
	 */
	int REGULAR = 11;

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
	 * The meta object id for the '{@link mLmodel.impl.ExcelImpl <em>Excel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.ExcelImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getExcel()
	 * @generated
	 */
	int EXCEL = 12;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL__AFTER = IMPORT_DATA__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL__BEFORE = IMPORT_DATA__BEFORE;

	/**
	 * The feature id for the '<em><b>Regular</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL__REGULAR = IMPORT_DATA__REGULAR;

	/**
	 * The feature id for the '<em><b>Save file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL__SAVE_FILE = IMPORT_DATA__SAVE_FILE;

	/**
	 * The feature id for the '<em><b>Print data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL__PRINT_DATA = IMPORT_DATA__PRINT_DATA;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL__ROLE = IMPORT_DATA__ROLE;

	/**
	 * The feature id for the '<em><b>Excel arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL__EXCEL_ARGUMENTS = IMPORT_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Excel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_FEATURE_COUNT = IMPORT_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Excel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_OPERATION_COUNT = IMPORT_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.Excel_Argumans <em>Excel Argumans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Excel_Argumans
	 * @see mLmodel.impl.MLmodelPackageImpl#getExcel_Argumans()
	 * @generated
	 */
	int EXCEL_ARGUMANS = 13;

	/**
	 * The number of structural features of the '<em>Excel Argumans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_ARGUMANS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Excel Argumans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_ARGUMANS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.Header_ExImpl <em>Header Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.Header_ExImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getHeader_Ex()
	 * @generated
	 */
	int HEADER_EX = 14;

	/**
	 * The feature id for the '<em><b>Defauld value head ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_EX__DEFAULD_VALUE_HEAD_EX = EXCEL_ARGUMANS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Header Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_EX_FEATURE_COUNT = EXCEL_ARGUMANS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Header Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_EX_OPERATION_COUNT = EXCEL_ARGUMANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.Simple_ImputerImpl <em>Simple Imputer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.Simple_ImputerImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getSimple_Imputer()
	 * @generated
	 */
	int SIMPLE_IMPUTER = 15;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IMPUTER__AFTER = PREPROCESS__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IMPUTER__BEFORE = PREPROCESS__BEFORE;

	/**
	 * The feature id for the '<em><b>Regular</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IMPUTER__REGULAR = PREPROCESS__REGULAR;

	/**
	 * The feature id for the '<em><b>Save file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IMPUTER__SAVE_FILE = PREPROCESS__SAVE_FILE;

	/**
	 * The feature id for the '<em><b>Print data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IMPUTER__PRINT_DATA = PREPROCESS__PRINT_DATA;

	/**
	 * The feature id for the '<em><b>Simple imputer arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IMPUTER__SIMPLE_IMPUTER_ARGUMENTS = PREPROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Imputer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IMPUTER_FEATURE_COUNT = PREPROCESS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Imputer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IMPUTER_OPERATION_COUNT = PREPROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.Simple_Imputer_Arguments <em>Simple Imputer Arguments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Simple_Imputer_Arguments
	 * @see mLmodel.impl.MLmodelPackageImpl#getSimple_Imputer_Arguments()
	 * @generated
	 */
	int SIMPLE_IMPUTER_ARGUMENTS = 16;

	/**
	 * The number of structural features of the '<em>Simple Imputer Arguments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IMPUTER_ARGUMENTS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Simple Imputer Arguments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_IMPUTER_ARGUMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.Missing_ValuesImpl <em>Missing Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.Missing_ValuesImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getMissing_Values()
	 * @generated
	 */
	int MISSING_VALUES = 17;

	/**
	 * The feature id for the '<em><b>Default value si miss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_VALUES__DEFAULT_VALUE_SI_MISS = SIMPLE_IMPUTER_ARGUMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Missing Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_VALUES_FEATURE_COUNT = SIMPLE_IMPUTER_ARGUMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Missing Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSING_VALUES_OPERATION_COUNT = SIMPLE_IMPUTER_ARGUMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.StrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.StrategyImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getStrategy()
	 * @generated
	 */
	int STRATEGY = 18;

	/**
	 * The feature id for the '<em><b>Default value sim str</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__DEFAULT_VALUE_SIM_STR = SIMPLE_IMPUTER_ARGUMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = SIMPLE_IMPUTER_ARGUMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_OPERATION_COUNT = SIMPLE_IMPUTER_ARGUMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.Fill_ValueImpl <em>Fill Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.Fill_ValueImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getFill_Value()
	 * @generated
	 */
	int FILL_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Default value sim fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL_VALUE__DEFAULT_VALUE_SIM_FILL = SIMPLE_IMPUTER_ARGUMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fill Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL_VALUE_FEATURE_COUNT = SIMPLE_IMPUTER_ARGUMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fill Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL_VALUE_OPERATION_COUNT = SIMPLE_IMPUTER_ARGUMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.KNN_ImputerImpl <em>KNN Imputer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.KNN_ImputerImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getKNN_Imputer()
	 * @generated
	 */
	int KNN_IMPUTER = 20;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNN_IMPUTER__AFTER = PREPROCESS__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNN_IMPUTER__BEFORE = PREPROCESS__BEFORE;

	/**
	 * The feature id for the '<em><b>Regular</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNN_IMPUTER__REGULAR = PREPROCESS__REGULAR;

	/**
	 * The feature id for the '<em><b>Save file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNN_IMPUTER__SAVE_FILE = PREPROCESS__SAVE_FILE;

	/**
	 * The feature id for the '<em><b>Print data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNN_IMPUTER__PRINT_DATA = PREPROCESS__PRINT_DATA;

	/**
	 * The feature id for the '<em><b>Knn argumans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNN_IMPUTER__KNN_ARGUMANS = PREPROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>KNN Imputer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNN_IMPUTER_FEATURE_COUNT = PREPROCESS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>KNN Imputer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNN_IMPUTER_OPERATION_COUNT = PREPROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.KNN_Argumans <em>KNN Argumans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.KNN_Argumans
	 * @see mLmodel.impl.MLmodelPackageImpl#getKNN_Argumans()
	 * @generated
	 */
	int KNN_ARGUMANS = 21;

	/**
	 * The number of structural features of the '<em>KNN Argumans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNN_ARGUMANS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>KNN Argumans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNN_ARGUMANS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.N_NeighborsImpl <em>NNeighbors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.N_NeighborsImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getN_Neighbors()
	 * @generated
	 */
	int NNEIGHBORS = 22;

	/**
	 * The feature id for the '<em><b>Nneighbors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NNEIGHBORS__NNEIGHBORS = KNN_ARGUMANS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NNeighbors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NNEIGHBORS_FEATURE_COUNT = KNN_ARGUMANS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>NNeighbors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NNEIGHBORS_OPERATION_COUNT = KNN_ARGUMANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.MetricImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 23;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = KNN_ARGUMANS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OPERATION_COUNT = KNN_ARGUMANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.WeightsImpl <em>Weights</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.WeightsImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getWeights()
	 * @generated
	 */
	int WEIGHTS = 24;

	/**
	 * The feature id for the '<em><b>Weights</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTS__WEIGHTS = KNN_ARGUMANS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Weights</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTS_FEATURE_COUNT = KNN_ARGUMANS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Weights</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTS_OPERATION_COUNT = KNN_ARGUMANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.Classification <em>Classification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Classification
	 * @see mLmodel.impl.MLmodelPackageImpl#getClassification()
	 * @generated
	 */
	int CLASSIFICATION = 25;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__AFTER = CYCLE__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__BEFORE = CYCLE__BEFORE;

	/**
	 * The number of structural features of the '<em>Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FEATURE_COUNT = CYCLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_OPERATION_COUNT = CYCLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.KNNImpl <em>KNN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.KNNImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getKNN()
	 * @generated
	 */
	int KNN = 26;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNN__AFTER = CLASSIFICATION__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNN__BEFORE = CLASSIFICATION__BEFORE;

	/**
	 * The feature id for the '<em><b>K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNN__K = CLASSIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>KNN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNN_FEATURE_COUNT = CLASSIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>KNN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNN_OPERATION_COUNT = CLASSIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.Evaluation_Methods <em>Evaluation Methods</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Evaluation_Methods
	 * @see mLmodel.impl.MLmodelPackageImpl#getEvaluation_Methods()
	 * @generated
	 */
	int EVALUATION_METHODS = 27;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_METHODS__AFTER = CYCLE__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_METHODS__BEFORE = CYCLE__BEFORE;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_METHODS__PRECISION = CYCLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_METHODS__ACCURACY = CYCLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Recall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_METHODS__RECALL = CYCLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>F1 score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_METHODS__F1_SCORE = CYCLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Evaluation Methods</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_METHODS_FEATURE_COUNT = CYCLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Evaluation Methods</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_METHODS_OPERATION_COUNT = CYCLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.Cross_ValidationImpl <em>Cross Validation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.Cross_ValidationImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getCross_Validation()
	 * @generated
	 */
	int CROSS_VALIDATION = 28;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_VALIDATION__AFTER = EVALUATION_METHODS__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_VALIDATION__BEFORE = EVALUATION_METHODS__BEFORE;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_VALIDATION__PRECISION = EVALUATION_METHODS__PRECISION;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_VALIDATION__ACCURACY = EVALUATION_METHODS__ACCURACY;

	/**
	 * The feature id for the '<em><b>Recall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_VALIDATION__RECALL = EVALUATION_METHODS__RECALL;

	/**
	 * The feature id for the '<em><b>F1 score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_VALIDATION__F1_SCORE = EVALUATION_METHODS__F1_SCORE;

	/**
	 * The feature id for the '<em><b>Number of folds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_VALIDATION__NUMBER_OF_FOLDS = EVALUATION_METHODS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Plots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_VALIDATION__PLOTS = EVALUATION_METHODS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cross Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_VALIDATION_FEATURE_COUNT = EVALUATION_METHODS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cross Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSS_VALIDATION_OPERATION_COUNT = EVALUATION_METHODS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.HeadCSVImpl <em>Head CSV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.HeadCSVImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getHeadCSV()
	 * @generated
	 */
	int HEAD_CSV = 29;

	/**
	 * The feature id for the '<em><b>Default header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_CSV__DEFAULT_HEADER = CSV_ARGUMANS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Head CSV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_CSV_FEATURE_COUNT = CSV_ARGUMANS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Head CSV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_CSV_OPERATION_COUNT = CSV_ARGUMANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.Sheet_Na_ExcelImpl <em>Sheet Na Excel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.Sheet_Na_ExcelImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getSheet_Na_Excel()
	 * @generated
	 */
	int SHEET_NA_EXCEL = 30;

	/**
	 * The feature id for the '<em><b>Default val sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_NA_EXCEL__DEFAULT_VAL_SHEET = EXCEL_ARGUMANS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sheet Na Excel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_NA_EXCEL_FEATURE_COUNT = EXCEL_ARGUMANS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sheet Na Excel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_NA_EXCEL_OPERATION_COUNT = EXCEL_ARGUMANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.Scaling <em>Scaling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Scaling
	 * @see mLmodel.impl.MLmodelPackageImpl#getScaling()
	 * @generated
	 */
	int SCALING = 31;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING__AFTER = PREPROCESS__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING__BEFORE = PREPROCESS__BEFORE;

	/**
	 * The feature id for the '<em><b>Regular</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING__REGULAR = PREPROCESS__REGULAR;

	/**
	 * The feature id for the '<em><b>Save file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING__SAVE_FILE = PREPROCESS__SAVE_FILE;

	/**
	 * The feature id for the '<em><b>Print data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING__PRINT_DATA = PREPROCESS__PRINT_DATA;

	/**
	 * The number of structural features of the '<em>Scaling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_FEATURE_COUNT = PREPROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scaling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_OPERATION_COUNT = PREPROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.Robust_ScalingImpl <em>Robust Scaling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.Robust_ScalingImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getRobust_Scaling()
	 * @generated
	 */
	int ROBUST_SCALING = 32;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBUST_SCALING__AFTER = SCALING__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBUST_SCALING__BEFORE = SCALING__BEFORE;

	/**
	 * The feature id for the '<em><b>Regular</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBUST_SCALING__REGULAR = SCALING__REGULAR;

	/**
	 * The feature id for the '<em><b>Save file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBUST_SCALING__SAVE_FILE = SCALING__SAVE_FILE;

	/**
	 * The feature id for the '<em><b>Print data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBUST_SCALING__PRINT_DATA = SCALING__PRINT_DATA;

	/**
	 * The number of structural features of the '<em>Robust Scaling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBUST_SCALING_FEATURE_COUNT = SCALING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Robust Scaling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBUST_SCALING_OPERATION_COUNT = SCALING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.StandardizationImpl <em>Standardization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.StandardizationImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getStandardization()
	 * @generated
	 */
	int STANDARDIZATION = 33;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARDIZATION__AFTER = SCALING__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARDIZATION__BEFORE = SCALING__BEFORE;

	/**
	 * The feature id for the '<em><b>Regular</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARDIZATION__REGULAR = SCALING__REGULAR;

	/**
	 * The feature id for the '<em><b>Save file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARDIZATION__SAVE_FILE = SCALING__SAVE_FILE;

	/**
	 * The feature id for the '<em><b>Print data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARDIZATION__PRINT_DATA = SCALING__PRINT_DATA;

	/**
	 * The number of structural features of the '<em>Standardization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARDIZATION_FEATURE_COUNT = SCALING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Standardization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARDIZATION_OPERATION_COUNT = SCALING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.NormalizationImpl <em>Normalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.NormalizationImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getNormalization()
	 * @generated
	 */
	int NORMALIZATION = 34;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMALIZATION__AFTER = SCALING__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMALIZATION__BEFORE = SCALING__BEFORE;

	/**
	 * The feature id for the '<em><b>Regular</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMALIZATION__REGULAR = SCALING__REGULAR;

	/**
	 * The feature id for the '<em><b>Save file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMALIZATION__SAVE_FILE = SCALING__SAVE_FILE;

	/**
	 * The feature id for the '<em><b>Print data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMALIZATION__PRINT_DATA = SCALING__PRINT_DATA;

	/**
	 * The number of structural features of the '<em>Normalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMALIZATION_FEATURE_COUNT = SCALING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Normalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMALIZATION_OPERATION_COUNT = SCALING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.Encoding <em>Encoding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Encoding
	 * @see mLmodel.impl.MLmodelPackageImpl#getEncoding()
	 * @generated
	 */
	int ENCODING = 35;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING__AFTER = PREPROCESS__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING__BEFORE = PREPROCESS__BEFORE;

	/**
	 * The feature id for the '<em><b>Regular</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING__REGULAR = PREPROCESS__REGULAR;

	/**
	 * The feature id for the '<em><b>Save file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING__SAVE_FILE = PREPROCESS__SAVE_FILE;

	/**
	 * The feature id for the '<em><b>Print data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING__PRINT_DATA = PREPROCESS__PRINT_DATA;

	/**
	 * The number of structural features of the '<em>Encoding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_FEATURE_COUNT = PREPROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Encoding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_OPERATION_COUNT = PREPROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.OneHotImpl <em>One Hot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.OneHotImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getOneHot()
	 * @generated
	 */
	int ONE_HOT = 36;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_HOT__AFTER = ENCODING__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_HOT__BEFORE = ENCODING__BEFORE;

	/**
	 * The feature id for the '<em><b>Regular</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_HOT__REGULAR = ENCODING__REGULAR;

	/**
	 * The feature id for the '<em><b>Save file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_HOT__SAVE_FILE = ENCODING__SAVE_FILE;

	/**
	 * The feature id for the '<em><b>Print data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_HOT__PRINT_DATA = ENCODING__PRINT_DATA;

	/**
	 * The feature id for the '<em><b>Onehot argumans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_HOT__ONEHOT_ARGUMANS = ENCODING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>One Hot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_HOT_FEATURE_COUNT = ENCODING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>One Hot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_HOT_OPERATION_COUNT = ENCODING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.OneHot_Argumans <em>One Hot Argumans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.OneHot_Argumans
	 * @see mLmodel.impl.MLmodelPackageImpl#getOneHot_Argumans()
	 * @generated
	 */
	int ONE_HOT_ARGUMANS = 37;

	/**
	 * The number of structural features of the '<em>One Hot Argumans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_HOT_ARGUMANS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>One Hot Argumans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_HOT_ARGUMANS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.DropImpl <em>Drop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.DropImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getDrop()
	 * @generated
	 */
	int DROP = 38;

	/**
	 * The feature id for the '<em><b>Default value drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP__DEFAULT_VALUE_DROP = ONE_HOT_ARGUMANS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Drop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_FEATURE_COUNT = ONE_HOT_ARGUMANS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Drop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_OPERATION_COUNT = ONE_HOT_ARGUMANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.CategoriesImpl <em>Categories</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.CategoriesImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getCategories()
	 * @generated
	 */
	int CATEGORIES = 39;

	/**
	 * The feature id for the '<em><b>Default value cat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES__DEFAULT_VALUE_CAT = ONE_HOT_ARGUMANS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Categories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES_FEATURE_COUNT = ONE_HOT_ARGUMANS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Categories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIES_OPERATION_COUNT = ONE_HOT_ARGUMANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.SparseImpl <em>Sparse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.SparseImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getSparse()
	 * @generated
	 */
	int SPARSE = 40;

	/**
	 * The feature id for the '<em><b>Default value sparse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARSE__DEFAULT_VALUE_SPARSE = ONE_HOT_ARGUMANS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sparse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARSE_FEATURE_COUNT = ONE_HOT_ARGUMANS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sparse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPARSE_OPERATION_COUNT = ONE_HOT_ARGUMANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.Handle_UnkImpl <em>Handle Unk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.Handle_UnkImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getHandle_Unk()
	 * @generated
	 */
	int HANDLE_UNK = 41;

	/**
	 * The feature id for the '<em><b>Default value handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_UNK__DEFAULT_VALUE_HANDLE = ONE_HOT_ARGUMANS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Handle Unk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_UNK_FEATURE_COUNT = ONE_HOT_ARGUMANS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Handle Unk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_UNK_OPERATION_COUNT = ONE_HOT_ARGUMANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.DuplicatesImpl <em>Duplicates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.DuplicatesImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getDuplicates()
	 * @generated
	 */
	int DUPLICATES = 42;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUPLICATES__AFTER = PREPROCESS__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUPLICATES__BEFORE = PREPROCESS__BEFORE;

	/**
	 * The feature id for the '<em><b>Regular</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUPLICATES__REGULAR = PREPROCESS__REGULAR;

	/**
	 * The feature id for the '<em><b>Save file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUPLICATES__SAVE_FILE = PREPROCESS__SAVE_FILE;

	/**
	 * The feature id for the '<em><b>Print data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUPLICATES__PRINT_DATA = PREPROCESS__PRINT_DATA;

	/**
	 * The feature id for the '<em><b>Duplicates argumans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUPLICATES__DUPLICATES_ARGUMANS = PREPROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Duplicates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUPLICATES_FEATURE_COUNT = PREPROCESS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Duplicates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUPLICATES_OPERATION_COUNT = PREPROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.Duplicates_Argumans <em>Duplicates Argumans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Duplicates_Argumans
	 * @see mLmodel.impl.MLmodelPackageImpl#getDuplicates_Argumans()
	 * @generated
	 */
	int DUPLICATES_ARGUMANS = 44;

	/**
	 * The number of structural features of the '<em>Duplicates Argumans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUPLICATES_ARGUMANS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Duplicates Argumans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUPLICATES_ARGUMANS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.KeepImpl <em>Keep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.KeepImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getKeep()
	 * @generated
	 */
	int KEEP = 43;

	/**
	 * The feature id for the '<em><b>Dup keep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEEP__DUP_KEEP = DUPLICATES_ARGUMANS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Keep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEEP_FEATURE_COUNT = DUPLICATES_ARGUMANS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Keep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEEP_OPERATION_COUNT = DUPLICATES_ARGUMANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.Trasformation <em>Trasformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Trasformation
	 * @see mLmodel.impl.MLmodelPackageImpl#getTrasformation()
	 * @generated
	 */
	int TRASFORMATION = 45;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASFORMATION__AFTER = PREPROCESS__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASFORMATION__BEFORE = PREPROCESS__BEFORE;

	/**
	 * The feature id for the '<em><b>Regular</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASFORMATION__REGULAR = PREPROCESS__REGULAR;

	/**
	 * The feature id for the '<em><b>Save file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASFORMATION__SAVE_FILE = PREPROCESS__SAVE_FILE;

	/**
	 * The feature id for the '<em><b>Print data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASFORMATION__PRINT_DATA = PREPROCESS__PRINT_DATA;

	/**
	 * The number of structural features of the '<em>Trasformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASFORMATION_FEATURE_COUNT = PREPROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trasformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASFORMATION_OPERATION_COUNT = PREPROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.Date_to_IntImpl <em>Date to Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.Date_to_IntImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getDate_to_Int()
	 * @generated
	 */
	int DATE_TO_INT = 46;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TO_INT__AFTER = TRASFORMATION__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TO_INT__BEFORE = TRASFORMATION__BEFORE;

	/**
	 * The feature id for the '<em><b>Regular</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TO_INT__REGULAR = TRASFORMATION__REGULAR;

	/**
	 * The feature id for the '<em><b>Save file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TO_INT__SAVE_FILE = TRASFORMATION__SAVE_FILE;

	/**
	 * The feature id for the '<em><b>Print data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TO_INT__PRINT_DATA = TRASFORMATION__PRINT_DATA;

	/**
	 * The feature id for the '<em><b>Date comp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TO_INT__DATE_COMP = TRASFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date to Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TO_INT_FEATURE_COUNT = TRASFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date to Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TO_INT_OPERATION_COUNT = TRASFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.Date_Comp <em>Date Comp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Date_Comp
	 * @see mLmodel.impl.MLmodelPackageImpl#getDate_Comp()
	 * @generated
	 */
	int DATE_COMP = 47;

	/**
	 * The number of structural features of the '<em>Date Comp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_COMP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Date Comp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_COMP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.YearImpl <em>Year</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.YearImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getYear()
	 * @generated
	 */
	int YEAR = 48;

	/**
	 * The number of structural features of the '<em>Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_FEATURE_COUNT = DATE_COMP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_OPERATION_COUNT = DATE_COMP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.MonthImpl <em>Month</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.MonthImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getMonth()
	 * @generated
	 */
	int MONTH = 49;

	/**
	 * The number of structural features of the '<em>Month</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_FEATURE_COUNT = DATE_COMP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Month</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTH_OPERATION_COUNT = DATE_COMP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.DayImpl <em>Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.DayImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getDay()
	 * @generated
	 */
	int DAY = 50;

	/**
	 * The number of structural features of the '<em>Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_FEATURE_COUNT = DATE_COMP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OPERATION_COUNT = DATE_COMP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.Dime_Reduct <em>Dime Reduct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Dime_Reduct
	 * @see mLmodel.impl.MLmodelPackageImpl#getDime_Reduct()
	 * @generated
	 */
	int DIME_REDUCT = 51;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIME_REDUCT__AFTER = PREPROCESS__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIME_REDUCT__BEFORE = PREPROCESS__BEFORE;

	/**
	 * The feature id for the '<em><b>Regular</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIME_REDUCT__REGULAR = PREPROCESS__REGULAR;

	/**
	 * The feature id for the '<em><b>Save file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIME_REDUCT__SAVE_FILE = PREPROCESS__SAVE_FILE;

	/**
	 * The feature id for the '<em><b>Print data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIME_REDUCT__PRINT_DATA = PREPROCESS__PRINT_DATA;

	/**
	 * The number of structural features of the '<em>Dime Reduct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIME_REDUCT_FEATURE_COUNT = PREPROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dime Reduct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIME_REDUCT_OPERATION_COUNT = PREPROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.PCAImpl <em>PCA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.PCAImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getPCA()
	 * @generated
	 */
	int PCA = 52;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCA__AFTER = DIME_REDUCT__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCA__BEFORE = DIME_REDUCT__BEFORE;

	/**
	 * The feature id for the '<em><b>Regular</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCA__REGULAR = DIME_REDUCT__REGULAR;

	/**
	 * The feature id for the '<em><b>Save file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCA__SAVE_FILE = DIME_REDUCT__SAVE_FILE;

	/**
	 * The feature id for the '<em><b>Print data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCA__PRINT_DATA = DIME_REDUCT__PRINT_DATA;

	/**
	 * The feature id for the '<em><b>Pca argumans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCA__PCA_ARGUMANS = DIME_REDUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PCA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCA_FEATURE_COUNT = DIME_REDUCT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>PCA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCA_OPERATION_COUNT = DIME_REDUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.PCA_Argumans <em>PCA Argumans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.PCA_Argumans
	 * @see mLmodel.impl.MLmodelPackageImpl#getPCA_Argumans()
	 * @generated
	 */
	int PCA_ARGUMANS = 53;

	/**
	 * The number of structural features of the '<em>PCA Argumans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCA_ARGUMANS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>PCA Argumans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCA_ARGUMANS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.ComponentImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 54;

	/**
	 * The feature id for the '<em><b>Component value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_VALUE = PCA_ARGUMANS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = PCA_ARGUMANS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = PCA_ARGUMANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.VarienceImpl <em>Varience</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.VarienceImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getVarience()
	 * @generated
	 */
	int VARIENCE = 55;

	/**
	 * The feature id for the '<em><b>Varience value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIENCE__VARIENCE_VALUE = PCA_ARGUMANS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Varience</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIENCE_FEATURE_COUNT = PCA_ARGUMANS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Varience</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIENCE_OPERATION_COUNT = PCA_ARGUMANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.SVMImpl <em>SVM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.SVMImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getSVM()
	 * @generated
	 */
	int SVM = 56;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM__AFTER = CLASSIFICATION__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM__BEFORE = CLASSIFICATION__BEFORE;

	/**
	 * The feature id for the '<em><b>C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM__C = CLASSIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kernel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM__KERNEL = CLASSIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SVM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM_FEATURE_COUNT = CLASSIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SVM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVM_OPERATION_COUNT = CLASSIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.Neural_Networks <em>Neural Networks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Neural_Networks
	 * @see mLmodel.impl.MLmodelPackageImpl#getNeural_Networks()
	 * @generated
	 */
	int NEURAL_NETWORKS = 57;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEURAL_NETWORKS__AFTER = CLASSIFICATION__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEURAL_NETWORKS__BEFORE = CLASSIFICATION__BEFORE;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEURAL_NETWORKS__LIBRARY = CLASSIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Neural Networks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEURAL_NETWORKS_FEATURE_COUNT = CLASSIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Neural Networks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEURAL_NETWORKS_OPERATION_COUNT = CLASSIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.MLPImpl <em>MLP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.MLPImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getMLP()
	 * @generated
	 */
	int MLP = 58;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLP__AFTER = NEURAL_NETWORKS__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLP__BEFORE = NEURAL_NETWORKS__BEFORE;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLP__LIBRARY = NEURAL_NETWORKS__LIBRARY;

	/**
	 * The feature id for the '<em><b>Hidden layer sizes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLP__HIDDEN_LAYER_SIZES = NEURAL_NETWORKS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mlp argumans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLP__MLP_ARGUMANS = NEURAL_NETWORKS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MLP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLP_FEATURE_COUNT = NEURAL_NETWORKS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MLP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLP_OPERATION_COUNT = NEURAL_NETWORKS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.Hidden_Layer_SizesImpl <em>Hidden Layer Sizes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.Hidden_Layer_SizesImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getHidden_Layer_Sizes()
	 * @generated
	 */
	int HIDDEN_LAYER_SIZES = 59;

	/**
	 * The feature id for the '<em><b>Neurons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_LAYER_SIZES__NEURONS = 0;

	/**
	 * The number of structural features of the '<em>Hidden Layer Sizes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_LAYER_SIZES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Hidden Layer Sizes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDDEN_LAYER_SIZES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLmodel.Ensembles <em>Ensembles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Ensembles
	 * @see mLmodel.impl.MLmodelPackageImpl#getEnsembles()
	 * @generated
	 */
	int ENSEMBLES = 61;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEMBLES__AFTER = CLASSIFICATION__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEMBLES__BEFORE = CLASSIFICATION__BEFORE;

	/**
	 * The number of structural features of the '<em>Ensembles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEMBLES_FEATURE_COUNT = CLASSIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ensembles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENSEMBLES_OPERATION_COUNT = CLASSIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.Voting_ClassifierImpl <em>Voting Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.Voting_ClassifierImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getVoting_Classifier()
	 * @generated
	 */
	int VOTING_CLASSIFIER = 60;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTING_CLASSIFIER__AFTER = ENSEMBLES__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTING_CLASSIFIER__BEFORE = ENSEMBLES__BEFORE;

	/**
	 * The feature id for the '<em><b>Voting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTING_CLASSIFIER__VOTING = ENSEMBLES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTING_CLASSIFIER__CLASSIFICATION = ENSEMBLES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Voting Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTING_CLASSIFIER_FEATURE_COUNT = ENSEMBLES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Voting Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTING_CLASSIFIER_OPERATION_COUNT = ENSEMBLES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.Random_ForestImpl <em>Random Forest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.Random_ForestImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getRandom_Forest()
	 * @generated
	 */
	int RANDOM_FOREST = 62;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST__AFTER = ENSEMBLES__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST__BEFORE = ENSEMBLES__BEFORE;

	/**
	 * The feature id for the '<em><b>Rf argumans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST__RF_ARGUMANS = ENSEMBLES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Random Forest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST_FEATURE_COUNT = ENSEMBLES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Random Forest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FOREST_OPERATION_COUNT = ENSEMBLES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.Clustering <em>Clustering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Clustering
	 * @see mLmodel.impl.MLmodelPackageImpl#getClustering()
	 * @generated
	 */
	int CLUSTERING = 63;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING__AFTER = CYCLE__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING__BEFORE = CYCLE__BEFORE;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING__LIBRARY = CYCLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clustering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_FEATURE_COUNT = CYCLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Clustering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTERING_OPERATION_COUNT = CYCLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.Parameters <em>Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Parameters
	 * @see mLmodel.impl.MLmodelPackageImpl#getParameters()
	 * @generated
	 */
	int PARAMETERS = 66;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__AFTER = CLUSTERING__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__BEFORE = CLUSTERING__BEFORE;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__LIBRARY = CLUSTERING__LIBRARY;

	/**
	 * The feature id for the '<em><b>K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__K = CLUSTERING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max iter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__MAX_ITER = CLUSTERING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_FEATURE_COUNT = CLUSTERING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_OPERATION_COUNT = CLUSTERING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.K_MediansImpl <em>KMedians</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.K_MediansImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getK_Medians()
	 * @generated
	 */
	int KMEDIANS = 64;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEDIANS__AFTER = PARAMETERS__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEDIANS__BEFORE = PARAMETERS__BEFORE;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEDIANS__LIBRARY = PARAMETERS__LIBRARY;

	/**
	 * The feature id for the '<em><b>K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEDIANS__K = PARAMETERS__K;

	/**
	 * The feature id for the '<em><b>Max iter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEDIANS__MAX_ITER = PARAMETERS__MAX_ITER;

	/**
	 * The number of structural features of the '<em>KMedians</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEDIANS_FEATURE_COUNT = PARAMETERS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>KMedians</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEDIANS_OPERATION_COUNT = PARAMETERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.K_MeansImpl <em>KMeans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.K_MeansImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getK_Means()
	 * @generated
	 */
	int KMEANS = 65;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEANS__AFTER = PARAMETERS__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEANS__BEFORE = PARAMETERS__BEFORE;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEANS__LIBRARY = PARAMETERS__LIBRARY;

	/**
	 * The feature id for the '<em><b>K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEANS__K = PARAMETERS__K;

	/**
	 * The feature id for the '<em><b>Max iter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEANS__MAX_ITER = PARAMETERS__MAX_ITER;

	/**
	 * The number of structural features of the '<em>KMeans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEANS_FEATURE_COUNT = PARAMETERS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>KMeans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KMEANS_OPERATION_COUNT = PARAMETERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.Regression <em>Regression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Regression
	 * @see mLmodel.impl.MLmodelPackageImpl#getRegression()
	 * @generated
	 */
	int REGRESSION = 67;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGRESSION__AFTER = CYCLE__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGRESSION__BEFORE = CYCLE__BEFORE;

	/**
	 * The number of structural features of the '<em>Regression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGRESSION_FEATURE_COUNT = CYCLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Regression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGRESSION_OPERATION_COUNT = CYCLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.Logistic_RegressionImpl <em>Logistic Regression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.Logistic_RegressionImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getLogistic_Regression()
	 * @generated
	 */
	int LOGISTIC_REGRESSION = 68;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION__AFTER = REGRESSION__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION__BEFORE = REGRESSION__BEFORE;

	/**
	 * The number of structural features of the '<em>Logistic Regression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION_FEATURE_COUNT = REGRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Logistic Regression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGISTIC_REGRESSION_OPERATION_COUNT = REGRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.RF_Argumans <em>RF Argumans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.RF_Argumans
	 * @see mLmodel.impl.MLmodelPackageImpl#getRF_Argumans()
	 * @generated
	 */
	int RF_ARGUMANS = 69;

	/**
	 * The number of structural features of the '<em>RF Argumans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RF_ARGUMANS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>RF Argumans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RF_ARGUMANS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.N_Estimators_RFImpl <em>NEstimators RF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.N_Estimators_RFImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getN_Estimators_RF()
	 * @generated
	 */
	int NESTIMATORS_RF = 70;

	/**
	 * The feature id for the '<em><b>Nestimators</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTIMATORS_RF__NESTIMATORS = RF_ARGUMANS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NEstimators RF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTIMATORS_RF_FEATURE_COUNT = RF_ARGUMANS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>NEstimators RF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTIMATORS_RF_OPERATION_COUNT = RF_ARGUMANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.Criterion_RFImpl <em>Criterion RF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.Criterion_RFImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getCriterion_RF()
	 * @generated
	 */
	int CRITERION_RF = 71;

	/**
	 * The feature id for the '<em><b>Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_RF__CRITERION = RF_ARGUMANS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Criterion RF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_RF_FEATURE_COUNT = RF_ARGUMANS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Criterion RF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERION_RF_OPERATION_COUNT = RF_ARGUMANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.Random_State_RFImpl <em>Random State RF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.Random_State_RFImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getRandom_State_RF()
	 * @generated
	 */
	int RANDOM_STATE_RF = 72;

	/**
	 * The feature id for the '<em><b>Random state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_STATE_RF__RANDOM_STATE = RF_ARGUMANS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Random State RF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_STATE_RF_FEATURE_COUNT = RF_ARGUMANS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Random State RF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_STATE_RF_OPERATION_COUNT = RF_ARGUMANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.Parameters_DBOP <em>Parameters DBOP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Parameters_DBOP
	 * @see mLmodel.impl.MLmodelPackageImpl#getParameters_DBOP()
	 * @generated
	 */
	int PARAMETERS_DBOP = 73;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_DBOP__AFTER = CLUSTERING__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_DBOP__BEFORE = CLUSTERING__BEFORE;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_DBOP__LIBRARY = CLUSTERING__LIBRARY;

	/**
	 * The feature id for the '<em><b>Eps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_DBOP__EPS = CLUSTERING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min samples</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_DBOP__MIN_SAMPLES = CLUSTERING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameters DBOP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_DBOP_FEATURE_COUNT = CLUSTERING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameters DBOP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_DBOP_OPERATION_COUNT = CLUSTERING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.DBSCANImpl <em>DBSCAN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.DBSCANImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getDBSCAN()
	 * @generated
	 */
	int DBSCAN = 74;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBSCAN__AFTER = PARAMETERS_DBOP__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBSCAN__BEFORE = PARAMETERS_DBOP__BEFORE;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBSCAN__LIBRARY = PARAMETERS_DBOP__LIBRARY;

	/**
	 * The feature id for the '<em><b>Eps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBSCAN__EPS = PARAMETERS_DBOP__EPS;

	/**
	 * The feature id for the '<em><b>Min samples</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBSCAN__MIN_SAMPLES = PARAMETERS_DBOP__MIN_SAMPLES;

	/**
	 * The feature id for the '<em><b>P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBSCAN__P = PARAMETERS_DBOP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DBSCAN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBSCAN_FEATURE_COUNT = PARAMETERS_DBOP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DBSCAN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBSCAN_OPERATION_COUNT = PARAMETERS_DBOP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.MLP_Argumans <em>MLP Argumans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.MLP_Argumans
	 * @see mLmodel.impl.MLmodelPackageImpl#getMLP_Argumans()
	 * @generated
	 */
	int MLP_ARGUMANS = 75;

	/**
	 * The number of structural features of the '<em>MLP Argumans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLP_ARGUMANS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>MLP Argumans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLP_ARGUMANS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.Max_Iter_MLPImpl <em>Max Iter MLP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.Max_Iter_MLPImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getMax_Iter_MLP()
	 * @generated
	 */
	int MAX_ITER_MLP = 76;

	/**
	 * The feature id for the '<em><b>Max iter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_ITER_MLP__MAX_ITER = MLP_ARGUMANS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Max Iter MLP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_ITER_MLP_FEATURE_COUNT = MLP_ARGUMANS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Max Iter MLP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_ITER_MLP_OPERATION_COUNT = MLP_ARGUMANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.Random_State_MLPImpl <em>Random State MLP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.Random_State_MLPImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getRandom_State_MLP()
	 * @generated
	 */
	int RANDOM_STATE_MLP = 77;

	/**
	 * The feature id for the '<em><b>Random state</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_STATE_MLP__RANDOM_STATE = MLP_ARGUMANS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Random State MLP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_STATE_MLP_FEATURE_COUNT = MLP_ARGUMANS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Random State MLP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_STATE_MLP_OPERATION_COUNT = MLP_ARGUMANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.Activation_MLPImpl <em>Activation MLP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.Activation_MLPImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getActivation_MLP()
	 * @generated
	 */
	int ACTIVATION_MLP = 78;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_MLP__ACTIVATION = MLP_ARGUMANS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activation MLP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_MLP_FEATURE_COUNT = MLP_ARGUMANS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activation MLP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_MLP_OPERATION_COUNT = MLP_ARGUMANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.Alpha_MLPImpl <em>Alpha MLP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.Alpha_MLPImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getAlpha_MLP()
	 * @generated
	 */
	int ALPHA_MLP = 79;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_MLP__ALPHA = MLP_ARGUMANS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alpha MLP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_MLP_FEATURE_COUNT = MLP_ARGUMANS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Alpha MLP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHA_MLP_OPERATION_COUNT = MLP_ARGUMANS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.Plots <em>Plots</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Plots
	 * @see mLmodel.impl.MLmodelPackageImpl#getPlots()
	 * @generated
	 */
	int PLOTS = 80;

	/**
	 * The number of structural features of the '<em>Plots</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOTS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Plots</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.ScatterImpl <em>Scatter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.ScatterImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getScatter()
	 * @generated
	 */
	int SCATTER = 81;

	/**
	 * The number of structural features of the '<em>Scatter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_FEATURE_COUNT = PLOTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scatter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCATTER_OPERATION_COUNT = PLOTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.Cluster_EvaluationImpl <em>Cluster Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.Cluster_EvaluationImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getCluster_Evaluation()
	 * @generated
	 */
	int CLUSTER_EVALUATION = 82;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_EVALUATION__AFTER = CYCLE__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_EVALUATION__BEFORE = CYCLE__BEFORE;

	/**
	 * The feature id for the '<em><b>Scatter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_EVALUATION__SCATTER = CYCLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cluster sizes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_EVALUATION__CLUSTER_SIZES = CYCLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cluster centers features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_EVALUATION__CLUSTER_CENTERS_FEATURES = CYCLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cluster centers standard deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_EVALUATION__CLUSTER_CENTERS_STANDARD_DEVIATION = CYCLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cluster centers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_EVALUATION__CLUSTER_CENTERS = CYCLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Cluster Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_EVALUATION_FEATURE_COUNT = CYCLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Cluster Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_EVALUATION_OPERATION_COUNT = CYCLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.OPticsImpl <em>OPtics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.OPticsImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getOPtics()
	 * @generated
	 */
	int OPTICS = 83;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICS__AFTER = PARAMETERS_DBOP__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICS__BEFORE = PARAMETERS_DBOP__BEFORE;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICS__LIBRARY = PARAMETERS_DBOP__LIBRARY;

	/**
	 * The feature id for the '<em><b>Eps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICS__EPS = PARAMETERS_DBOP__EPS;

	/**
	 * The feature id for the '<em><b>Min samples</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICS__MIN_SAMPLES = PARAMETERS_DBOP__MIN_SAMPLES;

	/**
	 * The number of structural features of the '<em>OPtics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICS_FEATURE_COUNT = PARAMETERS_DBOP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OPtics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTICS_OPERATION_COUNT = PARAMETERS_DBOP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.Auto_PrepImpl <em>Auto Prep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.Auto_PrepImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getAuto_Prep()
	 * @generated
	 */
	int AUTO_PREP = 85;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_PREP__AFTER = PREPROCESS__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_PREP__BEFORE = PREPROCESS__BEFORE;

	/**
	 * The feature id for the '<em><b>Regular</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_PREP__REGULAR = PREPROCESS__REGULAR;

	/**
	 * The feature id for the '<em><b>Save file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_PREP__SAVE_FILE = PREPROCESS__SAVE_FILE;

	/**
	 * The feature id for the '<em><b>Print data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_PREP__PRINT_DATA = PREPROCESS__PRINT_DATA;

	/**
	 * The feature id for the '<em><b>Simple Imputer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_PREP__SIMPLE_IMPUTER = PREPROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>KNN Imputer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_PREP__KNN_IMPUTER = PREPROCESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scaling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_PREP__SCALING = PREPROCESS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_PREP__ENCODING = PREPROCESS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Duplicates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_PREP__DUPLICATES = PREPROCESS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Trasformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_PREP__TRASFORMATION = PREPROCESS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Dime Reduct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_PREP__DIME_REDUCT = PREPROCESS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Date to Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_PREP__DATE_TO_INT = PREPROCESS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Drop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_PREP__DROP = PREPROCESS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Miss id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_PREP__MISS_ID = PREPROCESS_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Auto Prep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_PREP_FEATURE_COUNT = PREPROCESS_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Auto Prep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_PREP_OPERATION_COUNT = PREPROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.Data_Understanding <em>Data Understanding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Data_Understanding
	 * @see mLmodel.impl.MLmodelPackageImpl#getData_Understanding()
	 * @generated
	 */
	int DATA_UNDERSTANDING = 86;

	/**
	 * The number of structural features of the '<em>Data Understanding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNDERSTANDING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data Understanding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_UNDERSTANDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.StatisticsImpl <em>Statistics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.StatisticsImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getStatistics()
	 * @generated
	 */
	int STATISTICS = 87;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__TYPE = DATA_UNDERSTANDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Missing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__MISSING = DATA_UNDERSTANDING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__MIN = DATA_UNDERSTANDING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__MAX = DATA_UNDERSTANDING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__AVERAGE = DATA_UNDERSTANDING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Standard devision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS__STANDARD_DEVISION = DATA_UNDERSTANDING_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_FEATURE_COUNT = DATA_UNDERSTANDING_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_OPERATION_COUNT = DATA_UNDERSTANDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.VisualizationImpl <em>Visualization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.VisualizationImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getVisualization()
	 * @generated
	 */
	int VISUALIZATION = 88;

	/**
	 * The feature id for the '<em><b>Data und plots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__DATA_UND_PLOTS = DATA_UNDERSTANDING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_FEATURE_COUNT = DATA_UNDERSTANDING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_OPERATION_COUNT = DATA_UNDERSTANDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.CorrelationImpl <em>Correlation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.CorrelationImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getCorrelation()
	 * @generated
	 */
	int CORRELATION = 89;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__WIDTH = DATA_UNDERSTANDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__HEIGHT = DATA_UNDERSTANDING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__TABLE = DATA_UNDERSTANDING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Matrix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__MATRIX = DATA_UNDERSTANDING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Correlation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_FEATURE_COUNT = DATA_UNDERSTANDING_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Correlation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_OPERATION_COUNT = DATA_UNDERSTANDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.Standard_DeviationImpl <em>Standard Deviation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.Standard_DeviationImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getStandard_Deviation()
	 * @generated
	 */
	int STANDARD_DEVIATION = 90;

	/**
	 * The number of structural features of the '<em>Standard Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DEVIATION_FEATURE_COUNT = DATA_UNDERSTANDING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Standard Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DEVIATION_OPERATION_COUNT = DATA_UNDERSTANDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.BarImpl <em>Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.BarImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getBar()
	 * @generated
	 */
	int BAR = 91;

	/**
	 * The number of structural features of the '<em>Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_FEATURE_COUNT = PLOTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAR_OPERATION_COUNT = PLOTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.Linear_RegressionImpl <em>Linear Regression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.Linear_RegressionImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getLinear_Regression()
	 * @generated
	 */
	int LINEAR_REGRESSION = 92;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_REGRESSION__AFTER = REGRESSION__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_REGRESSION__BEFORE = REGRESSION__BEFORE;

	/**
	 * The number of structural features of the '<em>Linear Regression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_REGRESSION_FEATURE_COUNT = REGRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Linear Regression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_REGRESSION_OPERATION_COUNT = REGRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.ThingImpl <em>Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.ThingImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getThing()
	 * @generated
	 */
	int THING = 93;

	/**
	 * The feature id for the '<em><b>Protocolbinding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__PROTOCOLBINDING = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__ACTION = 2;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__EVENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__ID = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__TITLE = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Base URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__BASE_URI = 7;

	/**
	 * The number of structural features of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.ProtocolBindingImpl <em>Protocol Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.ProtocolBindingImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getProtocolBinding()
	 * @generated
	 */
	int PROTOCOL_BINDING = 94;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_BINDING__PROTOCOL = 0;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_BINDING__ENDPOINT = 1;

	/**
	 * The number of structural features of the '<em>Protocol Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Protocol Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.PropertyImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 95;

	/**
	 * The feature id for the '<em><b>Datasource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DATASOURCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__READ_ONLY = 3;

	/**
	 * The feature id for the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__WRITE_ONLY = 4;

	/**
	 * The feature id for the '<em><b>Observable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OBSERVABLE = 5;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.ActionImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 96;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INPUT = 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.EventImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 97;

	/**
	 * The feature id for the '<em><b>Analysystriger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ANALYSYSTRIGER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DATA = 2;

	/**
	 * The feature id for the '<em><b>Subscription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SUBSCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.DataSourceImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 98;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__AFTER = IMPORT_DATA__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__BEFORE = IMPORT_DATA__BEFORE;

	/**
	 * The feature id for the '<em><b>Regular</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__REGULAR = IMPORT_DATA__REGULAR;

	/**
	 * The feature id for the '<em><b>Save file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__SAVE_FILE = IMPORT_DATA__SAVE_FILE;

	/**
	 * The feature id for the '<em><b>Print data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__PRINT_DATA = IMPORT_DATA__PRINT_DATA;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__ROLE = IMPORT_DATA__ROLE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__NAME = IMPORT_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__TYPE = IMPORT_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__SOURCE_URI = IMPORT_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__FORMAT = IMPORT_DATA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = IMPORT_DATA_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_OPERATION_COUNT = IMPORT_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.AnalysisOutputImpl <em>Analysis Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.AnalysisOutputImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getAnalysisOutput()
	 * @generated
	 */
	int ANALYSIS_OUTPUT = 99;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OUTPUT__AFTER = EVALUATION_METHODS__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OUTPUT__BEFORE = EVALUATION_METHODS__BEFORE;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OUTPUT__PRECISION = EVALUATION_METHODS__PRECISION;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OUTPUT__ACCURACY = EVALUATION_METHODS__ACCURACY;

	/**
	 * The feature id for the '<em><b>Recall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OUTPUT__RECALL = EVALUATION_METHODS__RECALL;

	/**
	 * The feature id for the '<em><b>F1 score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OUTPUT__F1_SCORE = EVALUATION_METHODS__F1_SCORE;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OUTPUT__ACTION = EVALUATION_METHODS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OUTPUT__RESULT_VALUE = EVALUATION_METHODS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OUTPUT__RESULT_TYPE = EVALUATION_METHODS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OUTPUT__TIMESTAMP = EVALUATION_METHODS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Analysis Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OUTPUT_FEATURE_COUNT = EVALUATION_METHODS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Analysis Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OUTPUT_OPERATION_COUNT = EVALUATION_METHODS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.AnalysysTrigerImpl <em>Analysys Triger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.AnalysysTrigerImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getAnalysysTriger()
	 * @generated
	 */
	int ANALYSYS_TRIGER = 100;

	/**
	 * The feature id for the '<em><b>Trigger Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSYS_TRIGER__TRIGGER_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSYS_TRIGER__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSYS_TRIGER__SCHEDULE = 2;

	/**
	 * The number of structural features of the '<em>Analysys Triger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSYS_TRIGER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Analysys Triger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSYS_TRIGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.CommunicationProtocolImpl <em>Communication Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.CommunicationProtocolImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getCommunicationProtocol()
	 * @generated
	 */
	int COMMUNICATION_PROTOCOL = 101;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL__AFTER = IMPORT_DATA__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL__BEFORE = IMPORT_DATA__BEFORE;

	/**
	 * The feature id for the '<em><b>Regular</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL__REGULAR = IMPORT_DATA__REGULAR;

	/**
	 * The feature id for the '<em><b>Save file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL__SAVE_FILE = IMPORT_DATA__SAVE_FILE;

	/**
	 * The feature id for the '<em><b>Print data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL__PRINT_DATA = IMPORT_DATA__PRINT_DATA;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL__ROLE = IMPORT_DATA__ROLE;

	/**
	 * The feature id for the '<em><b>Mqtt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL__MQTT = IMPORT_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Buffer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL__BUFFER = IMPORT_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Communication Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL_FEATURE_COUNT = IMPORT_DATA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Communication Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PROTOCOL_OPERATION_COUNT = IMPORT_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.BufferImpl <em>Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.BufferImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getBuffer()
	 * @generated
	 */
	int BUFFER = 102;

	/**
	 * The number of structural features of the '<em>Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.MQTTImpl <em>MQTT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.MQTTImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getMQTT()
	 * @generated
	 */
	int MQTT = 103;

	/**
	 * The feature id for the '<em><b>MQTT BROKER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT__MQTT_BROKER = 0;

	/**
	 * The feature id for the '<em><b>MQTT PORT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT__MQTT_PORT = 1;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT__TOPIC = 2;

	/**
	 * The number of structural features of the '<em>MQTT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>MQTT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLmodel.OnlineModelManager <em>Online Model Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.OnlineModelManager
	 * @see mLmodel.impl.MLmodelPackageImpl#getOnlineModelManager()
	 * @generated
	 */
	int ONLINE_MODEL_MANAGER = 104;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_MODEL_MANAGER__AFTER = CYCLE__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_MODEL_MANAGER__BEFORE = CYCLE__BEFORE;

	/**
	 * The number of structural features of the '<em>Online Model Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_MODEL_MANAGER_FEATURE_COUNT = CYCLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Online Model Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_MODEL_MANAGER_OPERATION_COUNT = CYCLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.TopicImpl <em>Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.TopicImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getTopic()
	 * @generated
	 */
	int TOPIC = 105;

	/**
	 * The feature id for the '<em><b>MQTT CONTROL TOPIC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__MQTT_CONTROL_TOPIC = 0;

	/**
	 * The feature id for the '<em><b>MQTT SENSOR TOPIC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__MQTT_SENSOR_TOPIC = 1;

	/**
	 * The number of structural features of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.SGDClassifierImpl <em>SGD Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.SGDClassifierImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getSGDClassifier()
	 * @generated
	 */
	int SGD_CLASSIFIER = 106;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGD_CLASSIFIER__AFTER = ONLINE_MODEL_MANAGER__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGD_CLASSIFIER__BEFORE = ONLINE_MODEL_MANAGER__BEFORE;

	/**
	 * The number of structural features of the '<em>SGD Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGD_CLASSIFIER_FEATURE_COUNT = ONLINE_MODEL_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SGD Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGD_CLASSIFIER_OPERATION_COUNT = ONLINE_MODEL_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.PassiveAggressiveClassifierImpl <em>Passive Aggressive Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.PassiveAggressiveClassifierImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getPassiveAggressiveClassifier()
	 * @generated
	 */
	int PASSIVE_AGGRESSIVE_CLASSIFIER = 107;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_AGGRESSIVE_CLASSIFIER__AFTER = ONLINE_MODEL_MANAGER__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_AGGRESSIVE_CLASSIFIER__BEFORE = ONLINE_MODEL_MANAGER__BEFORE;

	/**
	 * The number of structural features of the '<em>Passive Aggressive Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_AGGRESSIVE_CLASSIFIER_FEATURE_COUNT = ONLINE_MODEL_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Passive Aggressive Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_AGGRESSIVE_CLASSIFIER_OPERATION_COUNT = ONLINE_MODEL_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.impl.PerceptronImpl <em>Perceptron</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.impl.PerceptronImpl
	 * @see mLmodel.impl.MLmodelPackageImpl#getPerceptron()
	 * @generated
	 */
	int PERCEPTRON = 108;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPTRON__AFTER = ONLINE_MODEL_MANAGER__AFTER;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPTRON__BEFORE = ONLINE_MODEL_MANAGER__BEFORE;

	/**
	 * The number of structural features of the '<em>Perceptron</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPTRON_FEATURE_COUNT = ONLINE_MODEL_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Perceptron</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPTRON_OPERATION_COUNT = ONLINE_MODEL_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mLmodel.Enum_CSV_Sep <em>Enum CSV Sep</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Enum_CSV_Sep
	 * @see mLmodel.impl.MLmodelPackageImpl#getEnum_CSV_Sep()
	 * @generated
	 */
	int ENUM_CSV_SEP = 109;

	/**
	 * The meta object id for the '{@link mLmodel.Strategy_Simple_Imputer <em>Strategy Simple Imputer</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Strategy_Simple_Imputer
	 * @see mLmodel.impl.MLmodelPackageImpl#getStrategy_Simple_Imputer()
	 * @generated
	 */
	int STRATEGY_SIMPLE_IMPUTER = 110;

	/**
	 * The meta object id for the '{@link mLmodel.OneHot_Cat_Arg <em>One Hot Cat Arg</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.OneHot_Cat_Arg
	 * @see mLmodel.impl.MLmodelPackageImpl#getOneHot_Cat_Arg()
	 * @generated
	 */
	int ONE_HOT_CAT_ARG = 111;

	/**
	 * The meta object id for the '{@link mLmodel.OneHot_Drop_Arg <em>One Hot Drop Arg</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.OneHot_Drop_Arg
	 * @see mLmodel.impl.MLmodelPackageImpl#getOneHot_Drop_Arg()
	 * @generated
	 */
	int ONE_HOT_DROP_ARG = 112;

	/**
	 * The meta object id for the '{@link mLmodel.OneHot_HandleUn_Arg <em>One Hot Handle Un Arg</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.OneHot_HandleUn_Arg
	 * @see mLmodel.impl.MLmodelPackageImpl#getOneHot_HandleUn_Arg()
	 * @generated
	 */
	int ONE_HOT_HANDLE_UN_ARG = 113;

	/**
	 * The meta object id for the '{@link mLmodel.Dup_Arg_Keep <em>Dup Arg Keep</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Dup_Arg_Keep
	 * @see mLmodel.impl.MLmodelPackageImpl#getDup_Arg_Keep()
	 * @generated
	 */
	int DUP_ARG_KEEP = 114;

	/**
	 * The meta object id for the '{@link mLmodel.SVM_Kernel_Enum <em>SVM Kernel Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.SVM_Kernel_Enum
	 * @see mLmodel.impl.MLmodelPackageImpl#getSVM_Kernel_Enum()
	 * @generated
	 */
	int SVM_KERNEL_ENUM = 115;

	/**
	 * The meta object id for the '{@link mLmodel.Neural_Libraries <em>Neural Libraries</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Neural_Libraries
	 * @see mLmodel.impl.MLmodelPackageImpl#getNeural_Libraries()
	 * @generated
	 */
	int NEURAL_LIBRARIES = 116;

	/**
	 * The meta object id for the '{@link mLmodel.Neural_Network_Activation <em>Neural Network Activation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Neural_Network_Activation
	 * @see mLmodel.impl.MLmodelPackageImpl#getNeural_Network_Activation()
	 * @generated
	 */
	int NEURAL_NETWORK_ACTIVATION = 117;

	/**
	 * The meta object id for the '{@link mLmodel.voting_pred <em>voting pred</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.voting_pred
	 * @see mLmodel.impl.MLmodelPackageImpl#getvoting_pred()
	 * @generated
	 */
	int VOTING_PRED = 118;

	/**
	 * The meta object id for the '{@link mLmodel.Random_Forest_Criterion_Enum <em>Random Forest Criterion Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Random_Forest_Criterion_Enum
	 * @see mLmodel.impl.MLmodelPackageImpl#getRandom_Forest_Criterion_Enum()
	 * @generated
	 */
	int RANDOM_FOREST_CRITERION_ENUM = 119;

	/**
	 * The meta object id for the '{@link mLmodel.Library_Clustering <em>Library Clustering</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Library_Clustering
	 * @see mLmodel.impl.MLmodelPackageImpl#getLibrary_Clustering()
	 * @generated
	 */
	int LIBRARY_CLUSTERING = 120;

	/**
	 * The meta object id for the '{@link mLmodel.Metric_DBSCAN <em>Metric DBSCAN</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Metric_DBSCAN
	 * @see mLmodel.impl.MLmodelPackageImpl#getMetric_DBSCAN()
	 * @generated
	 */
	int METRIC_DBSCAN = 121;

	/**
	 * The meta object id for the '{@link mLmodel.Attribiutes_Type <em>Attribiutes Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.Attribiutes_Type
	 * @see mLmodel.impl.MLmodelPackageImpl#getAttribiutes_Type()
	 * @generated
	 */
	int ATTRIBIUTES_TYPE = 122;

	/**
	 * The meta object id for the '{@link mLmodel.KNN_Imputer_Weights <em>KNN Imputer Weights</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.KNN_Imputer_Weights
	 * @see mLmodel.impl.MLmodelPackageImpl#getKNN_Imputer_Weights()
	 * @generated
	 */
	int KNN_IMPUTER_WEIGHTS = 123;

	/**
	 * The meta object id for the '{@link mLmodel.TrigerEnum <em>Triger Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.TrigerEnum
	 * @see mLmodel.impl.MLmodelPackageImpl#getTrigerEnum()
	 * @generated
	 */
	int TRIGER_ENUM = 124;

	/**
	 * The meta object id for the '{@link mLmodel.ProtocolBindingEnum <em>Protocol Binding Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mLmodel.ProtocolBindingEnum
	 * @see mLmodel.impl.MLmodelPackageImpl#getProtocolBindingEnum()
	 * @generated
	 */
	int PROTOCOL_BINDING_ENUM = 125;

	/**
	 * Returns the meta object for class '{@link mLmodel.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see mLmodel.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Root#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mLmodel.Root#getName()
	 * @see #getRoot()
	 * @generated
	 */
	EAttribute getRoot_Name();

	/**
	 * Returns the meta object for the containment reference '{@link mLmodel.Root#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process</em>'.
	 * @see mLmodel.Root#getProcess()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Process();

	/**
	 * Returns the meta object for the containment reference list '{@link mLmodel.Root#getThing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thing</em>'.
	 * @see mLmodel.Root#getThing()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Thing();

	/**
	 * Returns the meta object for class '{@link mLmodel.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see mLmodel.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Process#getFile_path <em>File path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File path</em>'.
	 * @see mLmodel.Process#getFile_path()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_File_path();

	/**
	 * Returns the meta object for the containment reference list '{@link mLmodel.Process#getCycle <em>Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cycle</em>'.
	 * @see mLmodel.Process#getCycle()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Cycle();

	/**
	 * Returns the meta object for the containment reference list '{@link mLmodel.Process#getData_understanding <em>Data understanding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data understanding</em>'.
	 * @see mLmodel.Process#getData_understanding()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Data_understanding();

	/**
	 * Returns the meta object for the containment reference list '{@link mLmodel.Process#getAnalysystriger <em>Analysystriger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Analysystriger</em>'.
	 * @see mLmodel.Process#getAnalysystriger()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Analysystriger();

	/**
	 * Returns the meta object for class '{@link mLmodel.Cycle <em>Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cycle</em>'.
	 * @see mLmodel.Cycle
	 * @generated
	 */
	EClass getCycle();

	/**
	 * Returns the meta object for the reference '{@link mLmodel.Cycle#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>After</em>'.
	 * @see mLmodel.Cycle#getAfter()
	 * @see #getCycle()
	 * @generated
	 */
	EReference getCycle_After();

	/**
	 * Returns the meta object for the reference '{@link mLmodel.Cycle#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Before</em>'.
	 * @see mLmodel.Cycle#getBefore()
	 * @see #getCycle()
	 * @generated
	 */
	EReference getCycle_Before();

	/**
	 * Returns the meta object for class '{@link mLmodel.Import_Data <em>Import Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Data</em>'.
	 * @see mLmodel.Import_Data
	 * @generated
	 */
	EClass getImport_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link mLmodel.Import_Data#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see mLmodel.Import_Data#getRole()
	 * @see #getImport_Data()
	 * @generated
	 */
	EReference getImport_Data_Role();

	/**
	 * Returns the meta object for class '{@link mLmodel.CSV <em>CSV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSV</em>'.
	 * @see mLmodel.CSV
	 * @generated
	 */
	EClass getCSV();

	/**
	 * Returns the meta object for the containment reference list '{@link mLmodel.CSV#getCsv_argumans <em>Csv argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Csv argumans</em>'.
	 * @see mLmodel.CSV#getCsv_argumans()
	 * @see #getCSV()
	 * @generated
	 */
	EReference getCSV_Csv_argumans();

	/**
	 * Returns the meta object for class '{@link mLmodel.CSV_Argumans <em>CSV Argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSV Argumans</em>'.
	 * @see mLmodel.CSV_Argumans
	 * @generated
	 */
	EClass getCSV_Argumans();

	/**
	 * Returns the meta object for class '{@link mLmodel.Sep <em>Sep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sep</em>'.
	 * @see mLmodel.Sep
	 * @generated
	 */
	EClass getSep();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Sep#getDefault_value_sep <em>Default value sep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default value sep</em>'.
	 * @see mLmodel.Sep#getDefault_value_sep()
	 * @see #getSep()
	 * @generated
	 */
	EAttribute getSep_Default_value_sep();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Sep#isManual_sep <em>Manual sep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manual sep</em>'.
	 * @see mLmodel.Sep#isManual_sep()
	 * @see #getSep()
	 * @generated
	 */
	EAttribute getSep_Manual_sep();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Sep#getDefine <em>Define</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Define</em>'.
	 * @see mLmodel.Sep#getDefine()
	 * @see #getSep()
	 * @generated
	 */
	EAttribute getSep_Define();

	/**
	 * Returns the meta object for class '{@link mLmodel.Nrows <em>Nrows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nrows</em>'.
	 * @see mLmodel.Nrows
	 * @generated
	 */
	EClass getNrows();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Nrows#getDefault_value_nrows <em>Default value nrows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default value nrows</em>'.
	 * @see mLmodel.Nrows#getDefault_value_nrows()
	 * @see #getNrows()
	 * @generated
	 */
	EAttribute getNrows_Default_value_nrows();

	/**
	 * Returns the meta object for class '{@link mLmodel.Set_Role <em>Set Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Role</em>'.
	 * @see mLmodel.Set_Role
	 * @generated
	 */
	EClass getSet_Role();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Set_Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mLmodel.Set_Role#getName()
	 * @see #getSet_Role()
	 * @generated
	 */
	EAttribute getSet_Role_Name();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Set_Role#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mLmodel.Set_Role#getType()
	 * @see #getSet_Role()
	 * @generated
	 */
	EAttribute getSet_Role_Type();

	/**
	 * Returns the meta object for class '{@link mLmodel.ID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ID</em>'.
	 * @see mLmodel.ID
	 * @generated
	 */
	EClass getID();

	/**
	 * Returns the meta object for class '{@link mLmodel.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target</em>'.
	 * @see mLmodel.Target
	 * @generated
	 */
	EClass getTarget();

	/**
	 * Returns the meta object for class '{@link mLmodel.Regular <em>Regular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regular</em>'.
	 * @see mLmodel.Regular
	 * @generated
	 */
	EClass getRegular();

	/**
	 * Returns the meta object for class '{@link mLmodel.Excel <em>Excel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excel</em>'.
	 * @see mLmodel.Excel
	 * @generated
	 */
	EClass getExcel();

	/**
	 * Returns the meta object for the containment reference list '{@link mLmodel.Excel#getExcel_arguments <em>Excel arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Excel arguments</em>'.
	 * @see mLmodel.Excel#getExcel_arguments()
	 * @see #getExcel()
	 * @generated
	 */
	EReference getExcel_Excel_arguments();

	/**
	 * Returns the meta object for class '{@link mLmodel.Excel_Argumans <em>Excel Argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excel Argumans</em>'.
	 * @see mLmodel.Excel_Argumans
	 * @generated
	 */
	EClass getExcel_Argumans();

	/**
	 * Returns the meta object for class '{@link mLmodel.Header_Ex <em>Header Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Ex</em>'.
	 * @see mLmodel.Header_Ex
	 * @generated
	 */
	EClass getHeader_Ex();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Header_Ex#getDefauld_value_head_ex <em>Defauld value head ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defauld value head ex</em>'.
	 * @see mLmodel.Header_Ex#getDefauld_value_head_ex()
	 * @see #getHeader_Ex()
	 * @generated
	 */
	EAttribute getHeader_Ex_Defauld_value_head_ex();

	/**
	 * Returns the meta object for class '{@link mLmodel.Simple_Imputer <em>Simple Imputer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Imputer</em>'.
	 * @see mLmodel.Simple_Imputer
	 * @generated
	 */
	EClass getSimple_Imputer();

	/**
	 * Returns the meta object for the containment reference list '{@link mLmodel.Simple_Imputer#getSimple_imputer_arguments <em>Simple imputer arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple imputer arguments</em>'.
	 * @see mLmodel.Simple_Imputer#getSimple_imputer_arguments()
	 * @see #getSimple_Imputer()
	 * @generated
	 */
	EReference getSimple_Imputer_Simple_imputer_arguments();

	/**
	 * Returns the meta object for class '{@link mLmodel.Simple_Imputer_Arguments <em>Simple Imputer Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Imputer Arguments</em>'.
	 * @see mLmodel.Simple_Imputer_Arguments
	 * @generated
	 */
	EClass getSimple_Imputer_Arguments();

	/**
	 * Returns the meta object for class '{@link mLmodel.Missing_Values <em>Missing Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Missing Values</em>'.
	 * @see mLmodel.Missing_Values
	 * @generated
	 */
	EClass getMissing_Values();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Missing_Values#getDefault_value_si_miss <em>Default value si miss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default value si miss</em>'.
	 * @see mLmodel.Missing_Values#getDefault_value_si_miss()
	 * @see #getMissing_Values()
	 * @generated
	 */
	EAttribute getMissing_Values_Default_value_si_miss();

	/**
	 * Returns the meta object for class '{@link mLmodel.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see mLmodel.Strategy
	 * @generated
	 */
	EClass getStrategy();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Strategy#getDefault_value_sim_str <em>Default value sim str</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default value sim str</em>'.
	 * @see mLmodel.Strategy#getDefault_value_sim_str()
	 * @see #getStrategy()
	 * @generated
	 */
	EAttribute getStrategy_Default_value_sim_str();

	/**
	 * Returns the meta object for class '{@link mLmodel.Fill_Value <em>Fill Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fill Value</em>'.
	 * @see mLmodel.Fill_Value
	 * @generated
	 */
	EClass getFill_Value();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Fill_Value#getDefault_value_sim_fill <em>Default value sim fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default value sim fill</em>'.
	 * @see mLmodel.Fill_Value#getDefault_value_sim_fill()
	 * @see #getFill_Value()
	 * @generated
	 */
	EAttribute getFill_Value_Default_value_sim_fill();

	/**
	 * Returns the meta object for class '{@link mLmodel.KNN_Imputer <em>KNN Imputer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KNN Imputer</em>'.
	 * @see mLmodel.KNN_Imputer
	 * @generated
	 */
	EClass getKNN_Imputer();

	/**
	 * Returns the meta object for the containment reference list '{@link mLmodel.KNN_Imputer#getKnn_argumans <em>Knn argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Knn argumans</em>'.
	 * @see mLmodel.KNN_Imputer#getKnn_argumans()
	 * @see #getKNN_Imputer()
	 * @generated
	 */
	EReference getKNN_Imputer_Knn_argumans();

	/**
	 * Returns the meta object for class '{@link mLmodel.KNN_Argumans <em>KNN Argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KNN Argumans</em>'.
	 * @see mLmodel.KNN_Argumans
	 * @generated
	 */
	EClass getKNN_Argumans();

	/**
	 * Returns the meta object for class '{@link mLmodel.N_Neighbors <em>NNeighbors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NNeighbors</em>'.
	 * @see mLmodel.N_Neighbors
	 * @generated
	 */
	EClass getN_Neighbors();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.N_Neighbors#getN_neighbors <em>Nneighbors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nneighbors</em>'.
	 * @see mLmodel.N_Neighbors#getN_neighbors()
	 * @see #getN_Neighbors()
	 * @generated
	 */
	EAttribute getN_Neighbors_N_neighbors();

	/**
	 * Returns the meta object for class '{@link mLmodel.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see mLmodel.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for class '{@link mLmodel.Weights <em>Weights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weights</em>'.
	 * @see mLmodel.Weights
	 * @generated
	 */
	EClass getWeights();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Weights#getWeights <em>Weights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weights</em>'.
	 * @see mLmodel.Weights#getWeights()
	 * @see #getWeights()
	 * @generated
	 */
	EAttribute getWeights_Weights();

	/**
	 * Returns the meta object for class '{@link mLmodel.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification</em>'.
	 * @see mLmodel.Classification
	 * @generated
	 */
	EClass getClassification();

	/**
	 * Returns the meta object for class '{@link mLmodel.KNN <em>KNN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KNN</em>'.
	 * @see mLmodel.KNN
	 * @generated
	 */
	EClass getKNN();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.KNN#getK <em>K</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>K</em>'.
	 * @see mLmodel.KNN#getK()
	 * @see #getKNN()
	 * @generated
	 */
	EAttribute getKNN_K();

	/**
	 * Returns the meta object for class '{@link mLmodel.Evaluation_Methods <em>Evaluation Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Methods</em>'.
	 * @see mLmodel.Evaluation_Methods
	 * @generated
	 */
	EClass getEvaluation_Methods();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Evaluation_Methods#isPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see mLmodel.Evaluation_Methods#isPrecision()
	 * @see #getEvaluation_Methods()
	 * @generated
	 */
	EAttribute getEvaluation_Methods_Precision();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Evaluation_Methods#isAccuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy</em>'.
	 * @see mLmodel.Evaluation_Methods#isAccuracy()
	 * @see #getEvaluation_Methods()
	 * @generated
	 */
	EAttribute getEvaluation_Methods_Accuracy();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Evaluation_Methods#isRecall <em>Recall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recall</em>'.
	 * @see mLmodel.Evaluation_Methods#isRecall()
	 * @see #getEvaluation_Methods()
	 * @generated
	 */
	EAttribute getEvaluation_Methods_Recall();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Evaluation_Methods#isF1_score <em>F1 score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>F1 score</em>'.
	 * @see mLmodel.Evaluation_Methods#isF1_score()
	 * @see #getEvaluation_Methods()
	 * @generated
	 */
	EAttribute getEvaluation_Methods_F1_score();

	/**
	 * Returns the meta object for class '{@link mLmodel.Cross_Validation <em>Cross Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cross Validation</em>'.
	 * @see mLmodel.Cross_Validation
	 * @generated
	 */
	EClass getCross_Validation();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Cross_Validation#getNumber_of_folds <em>Number of folds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number of folds</em>'.
	 * @see mLmodel.Cross_Validation#getNumber_of_folds()
	 * @see #getCross_Validation()
	 * @generated
	 */
	EAttribute getCross_Validation_Number_of_folds();

	/**
	 * Returns the meta object for the containment reference list '{@link mLmodel.Cross_Validation#getPlots <em>Plots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plots</em>'.
	 * @see mLmodel.Cross_Validation#getPlots()
	 * @see #getCross_Validation()
	 * @generated
	 */
	EReference getCross_Validation_Plots();

	/**
	 * Returns the meta object for class '{@link mLmodel.HeadCSV <em>Head CSV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Head CSV</em>'.
	 * @see mLmodel.HeadCSV
	 * @generated
	 */
	EClass getHeadCSV();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.HeadCSV#getDefault_header <em>Default header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default header</em>'.
	 * @see mLmodel.HeadCSV#getDefault_header()
	 * @see #getHeadCSV()
	 * @generated
	 */
	EAttribute getHeadCSV_Default_header();

	/**
	 * Returns the meta object for class '{@link mLmodel.Sheet_Na_Excel <em>Sheet Na Excel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sheet Na Excel</em>'.
	 * @see mLmodel.Sheet_Na_Excel
	 * @generated
	 */
	EClass getSheet_Na_Excel();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Sheet_Na_Excel#getDefault_val_sheet <em>Default val sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default val sheet</em>'.
	 * @see mLmodel.Sheet_Na_Excel#getDefault_val_sheet()
	 * @see #getSheet_Na_Excel()
	 * @generated
	 */
	EAttribute getSheet_Na_Excel_Default_val_sheet();

	/**
	 * Returns the meta object for class '{@link mLmodel.Scaling <em>Scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scaling</em>'.
	 * @see mLmodel.Scaling
	 * @generated
	 */
	EClass getScaling();

	/**
	 * Returns the meta object for class '{@link mLmodel.Robust_Scaling <em>Robust Scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robust Scaling</em>'.
	 * @see mLmodel.Robust_Scaling
	 * @generated
	 */
	EClass getRobust_Scaling();

	/**
	 * Returns the meta object for class '{@link mLmodel.Standardization <em>Standardization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standardization</em>'.
	 * @see mLmodel.Standardization
	 * @generated
	 */
	EClass getStandardization();

	/**
	 * Returns the meta object for class '{@link mLmodel.Normalization <em>Normalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normalization</em>'.
	 * @see mLmodel.Normalization
	 * @generated
	 */
	EClass getNormalization();

	/**
	 * Returns the meta object for class '{@link mLmodel.Encoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encoding</em>'.
	 * @see mLmodel.Encoding
	 * @generated
	 */
	EClass getEncoding();

	/**
	 * Returns the meta object for class '{@link mLmodel.OneHot <em>One Hot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Hot</em>'.
	 * @see mLmodel.OneHot
	 * @generated
	 */
	EClass getOneHot();

	/**
	 * Returns the meta object for the containment reference list '{@link mLmodel.OneHot#getOnehot_argumans <em>Onehot argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Onehot argumans</em>'.
	 * @see mLmodel.OneHot#getOnehot_argumans()
	 * @see #getOneHot()
	 * @generated
	 */
	EReference getOneHot_Onehot_argumans();

	/**
	 * Returns the meta object for class '{@link mLmodel.OneHot_Argumans <em>One Hot Argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Hot Argumans</em>'.
	 * @see mLmodel.OneHot_Argumans
	 * @generated
	 */
	EClass getOneHot_Argumans();

	/**
	 * Returns the meta object for class '{@link mLmodel.Drop <em>Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop</em>'.
	 * @see mLmodel.Drop
	 * @generated
	 */
	EClass getDrop();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Drop#getDefault_value_drop <em>Default value drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default value drop</em>'.
	 * @see mLmodel.Drop#getDefault_value_drop()
	 * @see #getDrop()
	 * @generated
	 */
	EAttribute getDrop_Default_value_drop();

	/**
	 * Returns the meta object for class '{@link mLmodel.Categories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categories</em>'.
	 * @see mLmodel.Categories
	 * @generated
	 */
	EClass getCategories();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Categories#getDefault_value_cat <em>Default value cat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default value cat</em>'.
	 * @see mLmodel.Categories#getDefault_value_cat()
	 * @see #getCategories()
	 * @generated
	 */
	EAttribute getCategories_Default_value_cat();

	/**
	 * Returns the meta object for class '{@link mLmodel.Sparse <em>Sparse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sparse</em>'.
	 * @see mLmodel.Sparse
	 * @generated
	 */
	EClass getSparse();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Sparse#isDefault_value_sparse <em>Default value sparse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default value sparse</em>'.
	 * @see mLmodel.Sparse#isDefault_value_sparse()
	 * @see #getSparse()
	 * @generated
	 */
	EAttribute getSparse_Default_value_sparse();

	/**
	 * Returns the meta object for class '{@link mLmodel.Handle_Unk <em>Handle Unk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handle Unk</em>'.
	 * @see mLmodel.Handle_Unk
	 * @generated
	 */
	EClass getHandle_Unk();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Handle_Unk#getDefault_value_handle <em>Default value handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default value handle</em>'.
	 * @see mLmodel.Handle_Unk#getDefault_value_handle()
	 * @see #getHandle_Unk()
	 * @generated
	 */
	EAttribute getHandle_Unk_Default_value_handle();

	/**
	 * Returns the meta object for class '{@link mLmodel.Duplicates <em>Duplicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duplicates</em>'.
	 * @see mLmodel.Duplicates
	 * @generated
	 */
	EClass getDuplicates();

	/**
	 * Returns the meta object for the containment reference list '{@link mLmodel.Duplicates#getDuplicates_argumans <em>Duplicates argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Duplicates argumans</em>'.
	 * @see mLmodel.Duplicates#getDuplicates_argumans()
	 * @see #getDuplicates()
	 * @generated
	 */
	EReference getDuplicates_Duplicates_argumans();

	/**
	 * Returns the meta object for class '{@link mLmodel.Keep <em>Keep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keep</em>'.
	 * @see mLmodel.Keep
	 * @generated
	 */
	EClass getKeep();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Keep#getDup_keep <em>Dup keep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dup keep</em>'.
	 * @see mLmodel.Keep#getDup_keep()
	 * @see #getKeep()
	 * @generated
	 */
	EAttribute getKeep_Dup_keep();

	/**
	 * Returns the meta object for class '{@link mLmodel.Duplicates_Argumans <em>Duplicates Argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duplicates Argumans</em>'.
	 * @see mLmodel.Duplicates_Argumans
	 * @generated
	 */
	EClass getDuplicates_Argumans();

	/**
	 * Returns the meta object for class '{@link mLmodel.Trasformation <em>Trasformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trasformation</em>'.
	 * @see mLmodel.Trasformation
	 * @generated
	 */
	EClass getTrasformation();

	/**
	 * Returns the meta object for class '{@link mLmodel.Date_to_Int <em>Date to Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date to Int</em>'.
	 * @see mLmodel.Date_to_Int
	 * @generated
	 */
	EClass getDate_to_Int();

	/**
	 * Returns the meta object for the containment reference list '{@link mLmodel.Date_to_Int#getDate_comp <em>Date comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date comp</em>'.
	 * @see mLmodel.Date_to_Int#getDate_comp()
	 * @see #getDate_to_Int()
	 * @generated
	 */
	EReference getDate_to_Int_Date_comp();

	/**
	 * Returns the meta object for class '{@link mLmodel.Date_Comp <em>Date Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Comp</em>'.
	 * @see mLmodel.Date_Comp
	 * @generated
	 */
	EClass getDate_Comp();

	/**
	 * Returns the meta object for class '{@link mLmodel.Year <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Year</em>'.
	 * @see mLmodel.Year
	 * @generated
	 */
	EClass getYear();

	/**
	 * Returns the meta object for class '{@link mLmodel.Month <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Month</em>'.
	 * @see mLmodel.Month
	 * @generated
	 */
	EClass getMonth();

	/**
	 * Returns the meta object for class '{@link mLmodel.Day <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day</em>'.
	 * @see mLmodel.Day
	 * @generated
	 */
	EClass getDay();

	/**
	 * Returns the meta object for class '{@link mLmodel.Dime_Reduct <em>Dime Reduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dime Reduct</em>'.
	 * @see mLmodel.Dime_Reduct
	 * @generated
	 */
	EClass getDime_Reduct();

	/**
	 * Returns the meta object for class '{@link mLmodel.PCA <em>PCA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCA</em>'.
	 * @see mLmodel.PCA
	 * @generated
	 */
	EClass getPCA();

	/**
	 * Returns the meta object for the containment reference list '{@link mLmodel.PCA#getPca_argumans <em>Pca argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pca argumans</em>'.
	 * @see mLmodel.PCA#getPca_argumans()
	 * @see #getPCA()
	 * @generated
	 */
	EReference getPCA_Pca_argumans();

	/**
	 * Returns the meta object for class '{@link mLmodel.PCA_Argumans <em>PCA Argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCA Argumans</em>'.
	 * @see mLmodel.PCA_Argumans
	 * @generated
	 */
	EClass getPCA_Argumans();

	/**
	 * Returns the meta object for class '{@link mLmodel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see mLmodel.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Component#getComponent_value <em>Component value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component value</em>'.
	 * @see mLmodel.Component#getComponent_value()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Component_value();

	/**
	 * Returns the meta object for class '{@link mLmodel.Varience <em>Varience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Varience</em>'.
	 * @see mLmodel.Varience
	 * @generated
	 */
	EClass getVarience();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Varience#getVarience_value <em>Varience value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Varience value</em>'.
	 * @see mLmodel.Varience#getVarience_value()
	 * @see #getVarience()
	 * @generated
	 */
	EAttribute getVarience_Varience_value();

	/**
	 * Returns the meta object for class '{@link mLmodel.SVM <em>SVM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SVM</em>'.
	 * @see mLmodel.SVM
	 * @generated
	 */
	EClass getSVM();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.SVM#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C</em>'.
	 * @see mLmodel.SVM#getC()
	 * @see #getSVM()
	 * @generated
	 */
	EAttribute getSVM_C();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.SVM#getKernel <em>Kernel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kernel</em>'.
	 * @see mLmodel.SVM#getKernel()
	 * @see #getSVM()
	 * @generated
	 */
	EAttribute getSVM_Kernel();

	/**
	 * Returns the meta object for class '{@link mLmodel.Neural_Networks <em>Neural Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neural Networks</em>'.
	 * @see mLmodel.Neural_Networks
	 * @generated
	 */
	EClass getNeural_Networks();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Neural_Networks#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see mLmodel.Neural_Networks#getLibrary()
	 * @see #getNeural_Networks()
	 * @generated
	 */
	EAttribute getNeural_Networks_Library();

	/**
	 * Returns the meta object for class '{@link mLmodel.MLP <em>MLP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MLP</em>'.
	 * @see mLmodel.MLP
	 * @generated
	 */
	EClass getMLP();

	/**
	 * Returns the meta object for the containment reference list '{@link mLmodel.MLP#getHidden_layer_sizes <em>Hidden layer sizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hidden layer sizes</em>'.
	 * @see mLmodel.MLP#getHidden_layer_sizes()
	 * @see #getMLP()
	 * @generated
	 */
	EReference getMLP_Hidden_layer_sizes();

	/**
	 * Returns the meta object for the containment reference list '{@link mLmodel.MLP#getMlp_argumans <em>Mlp argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mlp argumans</em>'.
	 * @see mLmodel.MLP#getMlp_argumans()
	 * @see #getMLP()
	 * @generated
	 */
	EReference getMLP_Mlp_argumans();

	/**
	 * Returns the meta object for class '{@link mLmodel.Hidden_Layer_Sizes <em>Hidden Layer Sizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hidden Layer Sizes</em>'.
	 * @see mLmodel.Hidden_Layer_Sizes
	 * @generated
	 */
	EClass getHidden_Layer_Sizes();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Hidden_Layer_Sizes#getNeurons <em>Neurons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neurons</em>'.
	 * @see mLmodel.Hidden_Layer_Sizes#getNeurons()
	 * @see #getHidden_Layer_Sizes()
	 * @generated
	 */
	EAttribute getHidden_Layer_Sizes_Neurons();

	/**
	 * Returns the meta object for class '{@link mLmodel.Voting_Classifier <em>Voting Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voting Classifier</em>'.
	 * @see mLmodel.Voting_Classifier
	 * @generated
	 */
	EClass getVoting_Classifier();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Voting_Classifier#getVoting <em>Voting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voting</em>'.
	 * @see mLmodel.Voting_Classifier#getVoting()
	 * @see #getVoting_Classifier()
	 * @generated
	 */
	EAttribute getVoting_Classifier_Voting();

	/**
	 * Returns the meta object for the reference list '{@link mLmodel.Voting_Classifier#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classification</em>'.
	 * @see mLmodel.Voting_Classifier#getClassification()
	 * @see #getVoting_Classifier()
	 * @generated
	 */
	EReference getVoting_Classifier_Classification();

	/**
	 * Returns the meta object for class '{@link mLmodel.Ensembles <em>Ensembles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ensembles</em>'.
	 * @see mLmodel.Ensembles
	 * @generated
	 */
	EClass getEnsembles();

	/**
	 * Returns the meta object for class '{@link mLmodel.Random_Forest <em>Random Forest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random Forest</em>'.
	 * @see mLmodel.Random_Forest
	 * @generated
	 */
	EClass getRandom_Forest();

	/**
	 * Returns the meta object for the containment reference list '{@link mLmodel.Random_Forest#getRf_argumans <em>Rf argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rf argumans</em>'.
	 * @see mLmodel.Random_Forest#getRf_argumans()
	 * @see #getRandom_Forest()
	 * @generated
	 */
	EReference getRandom_Forest_Rf_argumans();

	/**
	 * Returns the meta object for class '{@link mLmodel.Clustering <em>Clustering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clustering</em>'.
	 * @see mLmodel.Clustering
	 * @generated
	 */
	EClass getClustering();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Clustering#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see mLmodel.Clustering#getLibrary()
	 * @see #getClustering()
	 * @generated
	 */
	EAttribute getClustering_Library();

	/**
	 * Returns the meta object for class '{@link mLmodel.K_Medians <em>KMedians</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KMedians</em>'.
	 * @see mLmodel.K_Medians
	 * @generated
	 */
	EClass getK_Medians();

	/**
	 * Returns the meta object for class '{@link mLmodel.K_Means <em>KMeans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KMeans</em>'.
	 * @see mLmodel.K_Means
	 * @generated
	 */
	EClass getK_Means();

	/**
	 * Returns the meta object for class '{@link mLmodel.Parameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameters</em>'.
	 * @see mLmodel.Parameters
	 * @generated
	 */
	EClass getParameters();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Parameters#getK <em>K</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>K</em>'.
	 * @see mLmodel.Parameters#getK()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_K();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Parameters#getMax_iter <em>Max iter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max iter</em>'.
	 * @see mLmodel.Parameters#getMax_iter()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_Max_iter();

	/**
	 * Returns the meta object for class '{@link mLmodel.Regression <em>Regression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regression</em>'.
	 * @see mLmodel.Regression
	 * @generated
	 */
	EClass getRegression();

	/**
	 * Returns the meta object for class '{@link mLmodel.Logistic_Regression <em>Logistic Regression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logistic Regression</em>'.
	 * @see mLmodel.Logistic_Regression
	 * @generated
	 */
	EClass getLogistic_Regression();

	/**
	 * Returns the meta object for class '{@link mLmodel.RF_Argumans <em>RF Argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RF Argumans</em>'.
	 * @see mLmodel.RF_Argumans
	 * @generated
	 */
	EClass getRF_Argumans();

	/**
	 * Returns the meta object for class '{@link mLmodel.N_Estimators_RF <em>NEstimators RF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NEstimators RF</em>'.
	 * @see mLmodel.N_Estimators_RF
	 * @generated
	 */
	EClass getN_Estimators_RF();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.N_Estimators_RF#getN_estimators <em>Nestimators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nestimators</em>'.
	 * @see mLmodel.N_Estimators_RF#getN_estimators()
	 * @see #getN_Estimators_RF()
	 * @generated
	 */
	EAttribute getN_Estimators_RF_N_estimators();

	/**
	 * Returns the meta object for class '{@link mLmodel.Criterion_RF <em>Criterion RF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Criterion RF</em>'.
	 * @see mLmodel.Criterion_RF
	 * @generated
	 */
	EClass getCriterion_RF();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Criterion_RF#getCriterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criterion</em>'.
	 * @see mLmodel.Criterion_RF#getCriterion()
	 * @see #getCriterion_RF()
	 * @generated
	 */
	EAttribute getCriterion_RF_Criterion();

	/**
	 * Returns the meta object for class '{@link mLmodel.Random_State_RF <em>Random State RF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random State RF</em>'.
	 * @see mLmodel.Random_State_RF
	 * @generated
	 */
	EClass getRandom_State_RF();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Random_State_RF#getRandom_state <em>Random state</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Random state</em>'.
	 * @see mLmodel.Random_State_RF#getRandom_state()
	 * @see #getRandom_State_RF()
	 * @generated
	 */
	EAttribute getRandom_State_RF_Random_state();

	/**
	 * Returns the meta object for class '{@link mLmodel.Parameters_DBOP <em>Parameters DBOP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameters DBOP</em>'.
	 * @see mLmodel.Parameters_DBOP
	 * @generated
	 */
	EClass getParameters_DBOP();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Parameters_DBOP#getEps <em>Eps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eps</em>'.
	 * @see mLmodel.Parameters_DBOP#getEps()
	 * @see #getParameters_DBOP()
	 * @generated
	 */
	EAttribute getParameters_DBOP_Eps();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Parameters_DBOP#getMin_samples <em>Min samples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min samples</em>'.
	 * @see mLmodel.Parameters_DBOP#getMin_samples()
	 * @see #getParameters_DBOP()
	 * @generated
	 */
	EAttribute getParameters_DBOP_Min_samples();

	/**
	 * Returns the meta object for class '{@link mLmodel.DBSCAN <em>DBSCAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DBSCAN</em>'.
	 * @see mLmodel.DBSCAN
	 * @generated
	 */
	EClass getDBSCAN();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.DBSCAN#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>P</em>'.
	 * @see mLmodel.DBSCAN#getP()
	 * @see #getDBSCAN()
	 * @generated
	 */
	EAttribute getDBSCAN_P();

	/**
	 * Returns the meta object for class '{@link mLmodel.MLP_Argumans <em>MLP Argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MLP Argumans</em>'.
	 * @see mLmodel.MLP_Argumans
	 * @generated
	 */
	EClass getMLP_Argumans();

	/**
	 * Returns the meta object for class '{@link mLmodel.Max_Iter_MLP <em>Max Iter MLP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Iter MLP</em>'.
	 * @see mLmodel.Max_Iter_MLP
	 * @generated
	 */
	EClass getMax_Iter_MLP();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Max_Iter_MLP#getMax_iter <em>Max iter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max iter</em>'.
	 * @see mLmodel.Max_Iter_MLP#getMax_iter()
	 * @see #getMax_Iter_MLP()
	 * @generated
	 */
	EAttribute getMax_Iter_MLP_Max_iter();

	/**
	 * Returns the meta object for class '{@link mLmodel.Random_State_MLP <em>Random State MLP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random State MLP</em>'.
	 * @see mLmodel.Random_State_MLP
	 * @generated
	 */
	EClass getRandom_State_MLP();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Random_State_MLP#getRandom_state <em>Random state</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Random state</em>'.
	 * @see mLmodel.Random_State_MLP#getRandom_state()
	 * @see #getRandom_State_MLP()
	 * @generated
	 */
	EAttribute getRandom_State_MLP_Random_state();

	/**
	 * Returns the meta object for class '{@link mLmodel.Activation_MLP <em>Activation MLP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation MLP</em>'.
	 * @see mLmodel.Activation_MLP
	 * @generated
	 */
	EClass getActivation_MLP();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Activation_MLP#getActivation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation</em>'.
	 * @see mLmodel.Activation_MLP#getActivation()
	 * @see #getActivation_MLP()
	 * @generated
	 */
	EAttribute getActivation_MLP_Activation();

	/**
	 * Returns the meta object for class '{@link mLmodel.Alpha_MLP <em>Alpha MLP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alpha MLP</em>'.
	 * @see mLmodel.Alpha_MLP
	 * @generated
	 */
	EClass getAlpha_MLP();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Alpha_MLP#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see mLmodel.Alpha_MLP#getAlpha()
	 * @see #getAlpha_MLP()
	 * @generated
	 */
	EAttribute getAlpha_MLP_Alpha();

	/**
	 * Returns the meta object for class '{@link mLmodel.Plots <em>Plots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plots</em>'.
	 * @see mLmodel.Plots
	 * @generated
	 */
	EClass getPlots();

	/**
	 * Returns the meta object for class '{@link mLmodel.Scatter <em>Scatter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scatter</em>'.
	 * @see mLmodel.Scatter
	 * @generated
	 */
	EClass getScatter();

	/**
	 * Returns the meta object for class '{@link mLmodel.Cluster_Evaluation <em>Cluster Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster Evaluation</em>'.
	 * @see mLmodel.Cluster_Evaluation
	 * @generated
	 */
	EClass getCluster_Evaluation();

	/**
	 * Returns the meta object for the containment reference '{@link mLmodel.Cluster_Evaluation#getScatter <em>Scatter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scatter</em>'.
	 * @see mLmodel.Cluster_Evaluation#getScatter()
	 * @see #getCluster_Evaluation()
	 * @generated
	 */
	EReference getCluster_Evaluation_Scatter();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Cluster_Evaluation#isCluster_sizes <em>Cluster sizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cluster sizes</em>'.
	 * @see mLmodel.Cluster_Evaluation#isCluster_sizes()
	 * @see #getCluster_Evaluation()
	 * @generated
	 */
	EAttribute getCluster_Evaluation_Cluster_sizes();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Cluster_Evaluation#isCluster_centers_features <em>Cluster centers features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cluster centers features</em>'.
	 * @see mLmodel.Cluster_Evaluation#isCluster_centers_features()
	 * @see #getCluster_Evaluation()
	 * @generated
	 */
	EAttribute getCluster_Evaluation_Cluster_centers_features();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Cluster_Evaluation#isCluster_centers_standard_deviation <em>Cluster centers standard deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cluster centers standard deviation</em>'.
	 * @see mLmodel.Cluster_Evaluation#isCluster_centers_standard_deviation()
	 * @see #getCluster_Evaluation()
	 * @generated
	 */
	EAttribute getCluster_Evaluation_Cluster_centers_standard_deviation();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Cluster_Evaluation#isCluster_centers <em>Cluster centers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cluster centers</em>'.
	 * @see mLmodel.Cluster_Evaluation#isCluster_centers()
	 * @see #getCluster_Evaluation()
	 * @generated
	 */
	EAttribute getCluster_Evaluation_Cluster_centers();

	/**
	 * Returns the meta object for class '{@link mLmodel.OPtics <em>OPtics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OPtics</em>'.
	 * @see mLmodel.OPtics
	 * @generated
	 */
	EClass getOPtics();

	/**
	 * Returns the meta object for class '{@link mLmodel.Preprocess <em>Preprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preprocess</em>'.
	 * @see mLmodel.Preprocess
	 * @generated
	 */
	EClass getPreprocess();

	/**
	 * Returns the meta object for the reference list '{@link mLmodel.Preprocess#getRegular <em>Regular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Regular</em>'.
	 * @see mLmodel.Preprocess#getRegular()
	 * @see #getPreprocess()
	 * @generated
	 */
	EReference getPreprocess_Regular();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Preprocess#isSave_file <em>Save file</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Save file</em>'.
	 * @see mLmodel.Preprocess#isSave_file()
	 * @see #getPreprocess()
	 * @generated
	 */
	EAttribute getPreprocess_Save_file();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Preprocess#isPrint_data <em>Print data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Print data</em>'.
	 * @see mLmodel.Preprocess#isPrint_data()
	 * @see #getPreprocess()
	 * @generated
	 */
	EAttribute getPreprocess_Print_data();

	/**
	 * Returns the meta object for class '{@link mLmodel.Auto_Prep <em>Auto Prep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto Prep</em>'.
	 * @see mLmodel.Auto_Prep
	 * @generated
	 */
	EClass getAuto_Prep();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Auto_Prep#isSimple_Imputer <em>Simple Imputer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simple Imputer</em>'.
	 * @see mLmodel.Auto_Prep#isSimple_Imputer()
	 * @see #getAuto_Prep()
	 * @generated
	 */
	EAttribute getAuto_Prep_Simple_Imputer();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Auto_Prep#isKNN_Imputer <em>KNN Imputer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>KNN Imputer</em>'.
	 * @see mLmodel.Auto_Prep#isKNN_Imputer()
	 * @see #getAuto_Prep()
	 * @generated
	 */
	EAttribute getAuto_Prep_KNN_Imputer();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Auto_Prep#isScaling <em>Scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scaling</em>'.
	 * @see mLmodel.Auto_Prep#isScaling()
	 * @see #getAuto_Prep()
	 * @generated
	 */
	EAttribute getAuto_Prep_Scaling();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Auto_Prep#isEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see mLmodel.Auto_Prep#isEncoding()
	 * @see #getAuto_Prep()
	 * @generated
	 */
	EAttribute getAuto_Prep_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Auto_Prep#isDuplicates <em>Duplicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duplicates</em>'.
	 * @see mLmodel.Auto_Prep#isDuplicates()
	 * @see #getAuto_Prep()
	 * @generated
	 */
	EAttribute getAuto_Prep_Duplicates();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Auto_Prep#isTrasformation <em>Trasformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trasformation</em>'.
	 * @see mLmodel.Auto_Prep#isTrasformation()
	 * @see #getAuto_Prep()
	 * @generated
	 */
	EAttribute getAuto_Prep_Trasformation();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Auto_Prep#isDime_Reduct <em>Dime Reduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dime Reduct</em>'.
	 * @see mLmodel.Auto_Prep#isDime_Reduct()
	 * @see #getAuto_Prep()
	 * @generated
	 */
	EAttribute getAuto_Prep_Dime_Reduct();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Auto_Prep#isDate_to_Int <em>Date to Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date to Int</em>'.
	 * @see mLmodel.Auto_Prep#isDate_to_Int()
	 * @see #getAuto_Prep()
	 * @generated
	 */
	EAttribute getAuto_Prep_Date_to_Int();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Auto_Prep#isDrop <em>Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drop</em>'.
	 * @see mLmodel.Auto_Prep#isDrop()
	 * @see #getAuto_Prep()
	 * @generated
	 */
	EAttribute getAuto_Prep_Drop();

	/**
	 * Returns the meta object for the attribute list '{@link mLmodel.Auto_Prep#getMiss_id <em>Miss id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Miss id</em>'.
	 * @see mLmodel.Auto_Prep#getMiss_id()
	 * @see #getAuto_Prep()
	 * @generated
	 */
	EAttribute getAuto_Prep_Miss_id();

	/**
	 * Returns the meta object for class '{@link mLmodel.Data_Understanding <em>Data Understanding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Understanding</em>'.
	 * @see mLmodel.Data_Understanding
	 * @generated
	 */
	EClass getData_Understanding();

	/**
	 * Returns the meta object for class '{@link mLmodel.Statistics <em>Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistics</em>'.
	 * @see mLmodel.Statistics
	 * @generated
	 */
	EClass getStatistics();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Statistics#isType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mLmodel.Statistics#isType()
	 * @see #getStatistics()
	 * @generated
	 */
	EAttribute getStatistics_Type();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Statistics#isMissing <em>Missing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Missing</em>'.
	 * @see mLmodel.Statistics#isMissing()
	 * @see #getStatistics()
	 * @generated
	 */
	EAttribute getStatistics_Missing();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Statistics#isMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see mLmodel.Statistics#isMin()
	 * @see #getStatistics()
	 * @generated
	 */
	EAttribute getStatistics_Min();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Statistics#isMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see mLmodel.Statistics#isMax()
	 * @see #getStatistics()
	 * @generated
	 */
	EAttribute getStatistics_Max();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Statistics#isAverage <em>Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average</em>'.
	 * @see mLmodel.Statistics#isAverage()
	 * @see #getStatistics()
	 * @generated
	 */
	EAttribute getStatistics_Average();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Statistics#isStandard_devision <em>Standard devision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard devision</em>'.
	 * @see mLmodel.Statistics#isStandard_devision()
	 * @see #getStatistics()
	 * @generated
	 */
	EAttribute getStatistics_Standard_devision();

	/**
	 * Returns the meta object for class '{@link mLmodel.Visualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualization</em>'.
	 * @see mLmodel.Visualization
	 * @generated
	 */
	EClass getVisualization();

	/**
	 * Returns the meta object for the containment reference list '{@link mLmodel.Visualization#getData_und_plots <em>Data und plots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data und plots</em>'.
	 * @see mLmodel.Visualization#getData_und_plots()
	 * @see #getVisualization()
	 * @generated
	 */
	EReference getVisualization_Data_und_plots();

	/**
	 * Returns the meta object for class '{@link mLmodel.Correlation <em>Correlation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation</em>'.
	 * @see mLmodel.Correlation
	 * @generated
	 */
	EClass getCorrelation();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Correlation#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see mLmodel.Correlation#getWidth()
	 * @see #getCorrelation()
	 * @generated
	 */
	EAttribute getCorrelation_Width();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Correlation#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see mLmodel.Correlation#getHeight()
	 * @see #getCorrelation()
	 * @generated
	 */
	EAttribute getCorrelation_Height();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Correlation#isTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table</em>'.
	 * @see mLmodel.Correlation#isTable()
	 * @see #getCorrelation()
	 * @generated
	 */
	EAttribute getCorrelation_Table();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Correlation#isMatrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matrix</em>'.
	 * @see mLmodel.Correlation#isMatrix()
	 * @see #getCorrelation()
	 * @generated
	 */
	EAttribute getCorrelation_Matrix();

	/**
	 * Returns the meta object for class '{@link mLmodel.Standard_Deviation <em>Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Deviation</em>'.
	 * @see mLmodel.Standard_Deviation
	 * @generated
	 */
	EClass getStandard_Deviation();

	/**
	 * Returns the meta object for class '{@link mLmodel.Bar <em>Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bar</em>'.
	 * @see mLmodel.Bar
	 * @generated
	 */
	EClass getBar();

	/**
	 * Returns the meta object for class '{@link mLmodel.Linear_Regression <em>Linear Regression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Regression</em>'.
	 * @see mLmodel.Linear_Regression
	 * @generated
	 */
	EClass getLinear_Regression();

	/**
	 * Returns the meta object for class '{@link mLmodel.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing</em>'.
	 * @see mLmodel.Thing
	 * @generated
	 */
	EClass getThing();

	/**
	 * Returns the meta object for the containment reference list '{@link mLmodel.Thing#getProtocolbinding <em>Protocolbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocolbinding</em>'.
	 * @see mLmodel.Thing#getProtocolbinding()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Protocolbinding();

	/**
	 * Returns the meta object for the containment reference list '{@link mLmodel.Thing#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see mLmodel.Thing#getProperty()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link mLmodel.Thing#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see mLmodel.Thing#getAction()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link mLmodel.Thing#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see mLmodel.Thing#getEvent()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Event();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Thing#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mLmodel.Thing#getId()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Id();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Thing#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see mLmodel.Thing#getTitle()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Title();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Thing#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mLmodel.Thing#getDescription()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Description();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Thing#getBaseURI <em>Base URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base URI</em>'.
	 * @see mLmodel.Thing#getBaseURI()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_BaseURI();

	/**
	 * Returns the meta object for class '{@link mLmodel.ProtocolBinding <em>Protocol Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Binding</em>'.
	 * @see mLmodel.ProtocolBinding
	 * @generated
	 */
	EClass getProtocolBinding();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.ProtocolBinding#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see mLmodel.ProtocolBinding#getProtocol()
	 * @see #getProtocolBinding()
	 * @generated
	 */
	EAttribute getProtocolBinding_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.ProtocolBinding#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint</em>'.
	 * @see mLmodel.ProtocolBinding#getEndpoint()
	 * @see #getProtocolBinding()
	 * @generated
	 */
	EAttribute getProtocolBinding_Endpoint();

	/**
	 * Returns the meta object for class '{@link mLmodel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see mLmodel.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the reference '{@link mLmodel.Property#getDatasource <em>Datasource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datasource</em>'.
	 * @see mLmodel.Property#getDatasource()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Datasource();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mLmodel.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mLmodel.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Property#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see mLmodel.Property#isReadOnly()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Property#isWriteOnly <em>Write Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Only</em>'.
	 * @see mLmodel.Property#isWriteOnly()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_WriteOnly();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Property#isObservable <em>Observable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observable</em>'.
	 * @see mLmodel.Property#isObservable()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Observable();

	/**
	 * Returns the meta object for class '{@link mLmodel.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see mLmodel.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mLmodel.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Action#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see mLmodel.Action#getInput()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Input();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Action#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see mLmodel.Action#getOutput()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Output();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Action#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mLmodel.Action#getDescription()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Description();

	/**
	 * Returns the meta object for class '{@link mLmodel.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see mLmodel.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the reference '{@link mLmodel.Event#getAnalysystriger <em>Analysystriger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analysystriger</em>'.
	 * @see mLmodel.Event#getAnalysystriger()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Analysystriger();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mLmodel.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Event#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see mLmodel.Event#getData()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Data();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Event#isSubscription <em>Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscription</em>'.
	 * @see mLmodel.Event#isSubscription()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Subscription();

	/**
	 * Returns the meta object for class '{@link mLmodel.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see mLmodel.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.DataSource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mLmodel.DataSource#getName()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Name();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.DataSource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mLmodel.DataSource#getType()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Type();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.DataSource#getSourceURI <em>Source URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source URI</em>'.
	 * @see mLmodel.DataSource#getSourceURI()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_SourceURI();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.DataSource#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see mLmodel.DataSource#getFormat()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Format();

	/**
	 * Returns the meta object for class '{@link mLmodel.AnalysisOutput <em>Analysis Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Output</em>'.
	 * @see mLmodel.AnalysisOutput
	 * @generated
	 */
	EClass getAnalysisOutput();

	/**
	 * Returns the meta object for the reference '{@link mLmodel.AnalysisOutput#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see mLmodel.AnalysisOutput#getAction()
	 * @see #getAnalysisOutput()
	 * @generated
	 */
	EReference getAnalysisOutput_Action();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.AnalysisOutput#getResultValue <em>Result Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Value</em>'.
	 * @see mLmodel.AnalysisOutput#getResultValue()
	 * @see #getAnalysisOutput()
	 * @generated
	 */
	EAttribute getAnalysisOutput_ResultValue();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.AnalysisOutput#getResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Type</em>'.
	 * @see mLmodel.AnalysisOutput#getResultType()
	 * @see #getAnalysisOutput()
	 * @generated
	 */
	EAttribute getAnalysisOutput_ResultType();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.AnalysisOutput#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see mLmodel.AnalysisOutput#getTimestamp()
	 * @see #getAnalysisOutput()
	 * @generated
	 */
	EAttribute getAnalysisOutput_Timestamp();

	/**
	 * Returns the meta object for class '{@link mLmodel.AnalysysTriger <em>Analysys Triger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysys Triger</em>'.
	 * @see mLmodel.AnalysysTriger
	 * @generated
	 */
	EClass getAnalysysTriger();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.AnalysysTriger#getTriggerType <em>Trigger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Type</em>'.
	 * @see mLmodel.AnalysysTriger#getTriggerType()
	 * @see #getAnalysysTriger()
	 * @generated
	 */
	EAttribute getAnalysysTriger_TriggerType();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.AnalysysTriger#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see mLmodel.AnalysysTriger#getCondition()
	 * @see #getAnalysysTriger()
	 * @generated
	 */
	EAttribute getAnalysysTriger_Condition();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.AnalysysTriger#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule</em>'.
	 * @see mLmodel.AnalysysTriger#getSchedule()
	 * @see #getAnalysysTriger()
	 * @generated
	 */
	EAttribute getAnalysysTriger_Schedule();

	/**
	 * Returns the meta object for class '{@link mLmodel.CommunicationProtocol <em>Communication Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Protocol</em>'.
	 * @see mLmodel.CommunicationProtocol
	 * @generated
	 */
	EClass getCommunicationProtocol();

	/**
	 * Returns the meta object for the containment reference list '{@link mLmodel.CommunicationProtocol#getMqtt <em>Mqtt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mqtt</em>'.
	 * @see mLmodel.CommunicationProtocol#getMqtt()
	 * @see #getCommunicationProtocol()
	 * @generated
	 */
	EReference getCommunicationProtocol_Mqtt();

	/**
	 * Returns the meta object for the containment reference list '{@link mLmodel.CommunicationProtocol#getBuffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buffer</em>'.
	 * @see mLmodel.CommunicationProtocol#getBuffer()
	 * @see #getCommunicationProtocol()
	 * @generated
	 */
	EReference getCommunicationProtocol_Buffer();

	/**
	 * Returns the meta object for class '{@link mLmodel.Buffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffer</em>'.
	 * @see mLmodel.Buffer
	 * @generated
	 */
	EClass getBuffer();

	/**
	 * Returns the meta object for class '{@link mLmodel.MQTT <em>MQTT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MQTT</em>'.
	 * @see mLmodel.MQTT
	 * @generated
	 */
	EClass getMQTT();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.MQTT#getMQTT_BROKER <em>MQTT BROKER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MQTT BROKER</em>'.
	 * @see mLmodel.MQTT#getMQTT_BROKER()
	 * @see #getMQTT()
	 * @generated
	 */
	EAttribute getMQTT_MQTT_BROKER();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.MQTT#getMQTT_PORT <em>MQTT PORT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MQTT PORT</em>'.
	 * @see mLmodel.MQTT#getMQTT_PORT()
	 * @see #getMQTT()
	 * @generated
	 */
	EAttribute getMQTT_MQTT_PORT();

	/**
	 * Returns the meta object for the containment reference list '{@link mLmodel.MQTT#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Topic</em>'.
	 * @see mLmodel.MQTT#getTopic()
	 * @see #getMQTT()
	 * @generated
	 */
	EReference getMQTT_Topic();

	/**
	 * Returns the meta object for class '{@link mLmodel.OnlineModelManager <em>Online Model Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Online Model Manager</em>'.
	 * @see mLmodel.OnlineModelManager
	 * @generated
	 */
	EClass getOnlineModelManager();

	/**
	 * Returns the meta object for class '{@link mLmodel.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic</em>'.
	 * @see mLmodel.Topic
	 * @generated
	 */
	EClass getTopic();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Topic#getMQTT_CONTROL_TOPIC <em>MQTT CONTROL TOPIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MQTT CONTROL TOPIC</em>'.
	 * @see mLmodel.Topic#getMQTT_CONTROL_TOPIC()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_MQTT_CONTROL_TOPIC();

	/**
	 * Returns the meta object for the attribute '{@link mLmodel.Topic#getMQTT_SENSOR_TOPIC <em>MQTT SENSOR TOPIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MQTT SENSOR TOPIC</em>'.
	 * @see mLmodel.Topic#getMQTT_SENSOR_TOPIC()
	 * @see #getTopic()
	 * @generated
	 */
	EAttribute getTopic_MQTT_SENSOR_TOPIC();

	/**
	 * Returns the meta object for class '{@link mLmodel.SGDClassifier <em>SGD Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGD Classifier</em>'.
	 * @see mLmodel.SGDClassifier
	 * @generated
	 */
	EClass getSGDClassifier();

	/**
	 * Returns the meta object for class '{@link mLmodel.PassiveAggressiveClassifier <em>Passive Aggressive Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passive Aggressive Classifier</em>'.
	 * @see mLmodel.PassiveAggressiveClassifier
	 * @generated
	 */
	EClass getPassiveAggressiveClassifier();

	/**
	 * Returns the meta object for class '{@link mLmodel.Perceptron <em>Perceptron</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perceptron</em>'.
	 * @see mLmodel.Perceptron
	 * @generated
	 */
	EClass getPerceptron();

	/**
	 * Returns the meta object for enum '{@link mLmodel.Enum_CSV_Sep <em>Enum CSV Sep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum CSV Sep</em>'.
	 * @see mLmodel.Enum_CSV_Sep
	 * @generated
	 */
	EEnum getEnum_CSV_Sep();

	/**
	 * Returns the meta object for enum '{@link mLmodel.Strategy_Simple_Imputer <em>Strategy Simple Imputer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Strategy Simple Imputer</em>'.
	 * @see mLmodel.Strategy_Simple_Imputer
	 * @generated
	 */
	EEnum getStrategy_Simple_Imputer();

	/**
	 * Returns the meta object for enum '{@link mLmodel.OneHot_Cat_Arg <em>One Hot Cat Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>One Hot Cat Arg</em>'.
	 * @see mLmodel.OneHot_Cat_Arg
	 * @generated
	 */
	EEnum getOneHot_Cat_Arg();

	/**
	 * Returns the meta object for enum '{@link mLmodel.OneHot_Drop_Arg <em>One Hot Drop Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>One Hot Drop Arg</em>'.
	 * @see mLmodel.OneHot_Drop_Arg
	 * @generated
	 */
	EEnum getOneHot_Drop_Arg();

	/**
	 * Returns the meta object for enum '{@link mLmodel.OneHot_HandleUn_Arg <em>One Hot Handle Un Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>One Hot Handle Un Arg</em>'.
	 * @see mLmodel.OneHot_HandleUn_Arg
	 * @generated
	 */
	EEnum getOneHot_HandleUn_Arg();

	/**
	 * Returns the meta object for enum '{@link mLmodel.Dup_Arg_Keep <em>Dup Arg Keep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dup Arg Keep</em>'.
	 * @see mLmodel.Dup_Arg_Keep
	 * @generated
	 */
	EEnum getDup_Arg_Keep();

	/**
	 * Returns the meta object for enum '{@link mLmodel.SVM_Kernel_Enum <em>SVM Kernel Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SVM Kernel Enum</em>'.
	 * @see mLmodel.SVM_Kernel_Enum
	 * @generated
	 */
	EEnum getSVM_Kernel_Enum();

	/**
	 * Returns the meta object for enum '{@link mLmodel.Neural_Libraries <em>Neural Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Neural Libraries</em>'.
	 * @see mLmodel.Neural_Libraries
	 * @generated
	 */
	EEnum getNeural_Libraries();

	/**
	 * Returns the meta object for enum '{@link mLmodel.Neural_Network_Activation <em>Neural Network Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Neural Network Activation</em>'.
	 * @see mLmodel.Neural_Network_Activation
	 * @generated
	 */
	EEnum getNeural_Network_Activation();

	/**
	 * Returns the meta object for enum '{@link mLmodel.voting_pred <em>voting pred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>voting pred</em>'.
	 * @see mLmodel.voting_pred
	 * @generated
	 */
	EEnum getvoting_pred();

	/**
	 * Returns the meta object for enum '{@link mLmodel.Random_Forest_Criterion_Enum <em>Random Forest Criterion Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Random Forest Criterion Enum</em>'.
	 * @see mLmodel.Random_Forest_Criterion_Enum
	 * @generated
	 */
	EEnum getRandom_Forest_Criterion_Enum();

	/**
	 * Returns the meta object for enum '{@link mLmodel.Library_Clustering <em>Library Clustering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Library Clustering</em>'.
	 * @see mLmodel.Library_Clustering
	 * @generated
	 */
	EEnum getLibrary_Clustering();

	/**
	 * Returns the meta object for enum '{@link mLmodel.Metric_DBSCAN <em>Metric DBSCAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Metric DBSCAN</em>'.
	 * @see mLmodel.Metric_DBSCAN
	 * @generated
	 */
	EEnum getMetric_DBSCAN();

	/**
	 * Returns the meta object for enum '{@link mLmodel.Attribiutes_Type <em>Attribiutes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribiutes Type</em>'.
	 * @see mLmodel.Attribiutes_Type
	 * @generated
	 */
	EEnum getAttribiutes_Type();

	/**
	 * Returns the meta object for enum '{@link mLmodel.KNN_Imputer_Weights <em>KNN Imputer Weights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>KNN Imputer Weights</em>'.
	 * @see mLmodel.KNN_Imputer_Weights
	 * @generated
	 */
	EEnum getKNN_Imputer_Weights();

	/**
	 * Returns the meta object for enum '{@link mLmodel.TrigerEnum <em>Triger Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Triger Enum</em>'.
	 * @see mLmodel.TrigerEnum
	 * @generated
	 */
	EEnum getTrigerEnum();

	/**
	 * Returns the meta object for enum '{@link mLmodel.ProtocolBindingEnum <em>Protocol Binding Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol Binding Enum</em>'.
	 * @see mLmodel.ProtocolBindingEnum
	 * @generated
	 */
	EEnum getProtocolBindingEnum();

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
		 * The meta object literal for the '{@link mLmodel.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.RootImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getRoot()
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
		 * The meta object literal for the '<em><b>Thing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__THING = eINSTANCE.getRoot_Thing();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.ProcessImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getProcess()
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
		 * The meta object literal for the '<em><b>Data understanding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__DATA_UNDERSTANDING = eINSTANCE.getProcess_Data_understanding();

		/**
		 * The meta object literal for the '<em><b>Analysystriger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__ANALYSYSTRIGER = eINSTANCE.getProcess_Analysystriger();

		/**
		 * The meta object literal for the '{@link mLmodel.Cycle <em>Cycle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Cycle
		 * @see mLmodel.impl.MLmodelPackageImpl#getCycle()
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
		 * The meta object literal for the '{@link mLmodel.Import_Data <em>Import Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Import_Data
		 * @see mLmodel.impl.MLmodelPackageImpl#getImport_Data()
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
		 * The meta object literal for the '{@link mLmodel.impl.CSVImpl <em>CSV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.CSVImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getCSV()
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
		 * The meta object literal for the '{@link mLmodel.CSV_Argumans <em>CSV Argumans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.CSV_Argumans
		 * @see mLmodel.impl.MLmodelPackageImpl#getCSV_Argumans()
		 * @generated
		 */
		EClass CSV_ARGUMANS = eINSTANCE.getCSV_Argumans();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.SepImpl <em>Sep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.SepImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getSep()
		 * @generated
		 */
		EClass SEP = eINSTANCE.getSep();

		/**
		 * The meta object literal for the '<em><b>Default value sep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEP__DEFAULT_VALUE_SEP = eINSTANCE.getSep_Default_value_sep();

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
		 * The meta object literal for the '{@link mLmodel.impl.NrowsImpl <em>Nrows</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.NrowsImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getNrows()
		 * @generated
		 */
		EClass NROWS = eINSTANCE.getNrows();

		/**
		 * The meta object literal for the '<em><b>Default value nrows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NROWS__DEFAULT_VALUE_NROWS = eINSTANCE.getNrows_Default_value_nrows();

		/**
		 * The meta object literal for the '{@link mLmodel.Set_Role <em>Set Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Set_Role
		 * @see mLmodel.impl.MLmodelPackageImpl#getSet_Role()
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
		 * The meta object literal for the '{@link mLmodel.impl.IDImpl <em>ID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.IDImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getID()
		 * @generated
		 */
		EClass ID = eINSTANCE.getID();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.TargetImpl <em>Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.TargetImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getTarget()
		 * @generated
		 */
		EClass TARGET = eINSTANCE.getTarget();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.RegularImpl <em>Regular</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.RegularImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getRegular()
		 * @generated
		 */
		EClass REGULAR = eINSTANCE.getRegular();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.ExcelImpl <em>Excel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.ExcelImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getExcel()
		 * @generated
		 */
		EClass EXCEL = eINSTANCE.getExcel();

		/**
		 * The meta object literal for the '<em><b>Excel arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEL__EXCEL_ARGUMENTS = eINSTANCE.getExcel_Excel_arguments();

		/**
		 * The meta object literal for the '{@link mLmodel.Excel_Argumans <em>Excel Argumans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Excel_Argumans
		 * @see mLmodel.impl.MLmodelPackageImpl#getExcel_Argumans()
		 * @generated
		 */
		EClass EXCEL_ARGUMANS = eINSTANCE.getExcel_Argumans();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.Header_ExImpl <em>Header Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.Header_ExImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getHeader_Ex()
		 * @generated
		 */
		EClass HEADER_EX = eINSTANCE.getHeader_Ex();

		/**
		 * The meta object literal for the '<em><b>Defauld value head ex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER_EX__DEFAULD_VALUE_HEAD_EX = eINSTANCE.getHeader_Ex_Defauld_value_head_ex();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.Simple_ImputerImpl <em>Simple Imputer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.Simple_ImputerImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getSimple_Imputer()
		 * @generated
		 */
		EClass SIMPLE_IMPUTER = eINSTANCE.getSimple_Imputer();

		/**
		 * The meta object literal for the '<em><b>Simple imputer arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_IMPUTER__SIMPLE_IMPUTER_ARGUMENTS = eINSTANCE.getSimple_Imputer_Simple_imputer_arguments();

		/**
		 * The meta object literal for the '{@link mLmodel.Simple_Imputer_Arguments <em>Simple Imputer Arguments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Simple_Imputer_Arguments
		 * @see mLmodel.impl.MLmodelPackageImpl#getSimple_Imputer_Arguments()
		 * @generated
		 */
		EClass SIMPLE_IMPUTER_ARGUMENTS = eINSTANCE.getSimple_Imputer_Arguments();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.Missing_ValuesImpl <em>Missing Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.Missing_ValuesImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getMissing_Values()
		 * @generated
		 */
		EClass MISSING_VALUES = eINSTANCE.getMissing_Values();

		/**
		 * The meta object literal for the '<em><b>Default value si miss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISSING_VALUES__DEFAULT_VALUE_SI_MISS = eINSTANCE.getMissing_Values_Default_value_si_miss();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.StrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.StrategyImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getStrategy()
		 * @generated
		 */
		EClass STRATEGY = eINSTANCE.getStrategy();

		/**
		 * The meta object literal for the '<em><b>Default value sim str</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__DEFAULT_VALUE_SIM_STR = eINSTANCE.getStrategy_Default_value_sim_str();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.Fill_ValueImpl <em>Fill Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.Fill_ValueImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getFill_Value()
		 * @generated
		 */
		EClass FILL_VALUE = eINSTANCE.getFill_Value();

		/**
		 * The meta object literal for the '<em><b>Default value sim fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILL_VALUE__DEFAULT_VALUE_SIM_FILL = eINSTANCE.getFill_Value_Default_value_sim_fill();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.KNN_ImputerImpl <em>KNN Imputer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.KNN_ImputerImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getKNN_Imputer()
		 * @generated
		 */
		EClass KNN_IMPUTER = eINSTANCE.getKNN_Imputer();

		/**
		 * The meta object literal for the '<em><b>Knn argumans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNN_IMPUTER__KNN_ARGUMANS = eINSTANCE.getKNN_Imputer_Knn_argumans();

		/**
		 * The meta object literal for the '{@link mLmodel.KNN_Argumans <em>KNN Argumans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.KNN_Argumans
		 * @see mLmodel.impl.MLmodelPackageImpl#getKNN_Argumans()
		 * @generated
		 */
		EClass KNN_ARGUMANS = eINSTANCE.getKNN_Argumans();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.N_NeighborsImpl <em>NNeighbors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.N_NeighborsImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getN_Neighbors()
		 * @generated
		 */
		EClass NNEIGHBORS = eINSTANCE.getN_Neighbors();

		/**
		 * The meta object literal for the '<em><b>Nneighbors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NNEIGHBORS__NNEIGHBORS = eINSTANCE.getN_Neighbors_N_neighbors();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.MetricImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.WeightsImpl <em>Weights</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.WeightsImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getWeights()
		 * @generated
		 */
		EClass WEIGHTS = eINSTANCE.getWeights();

		/**
		 * The meta object literal for the '<em><b>Weights</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEIGHTS__WEIGHTS = eINSTANCE.getWeights_Weights();

		/**
		 * The meta object literal for the '{@link mLmodel.Classification <em>Classification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Classification
		 * @see mLmodel.impl.MLmodelPackageImpl#getClassification()
		 * @generated
		 */
		EClass CLASSIFICATION = eINSTANCE.getClassification();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.KNNImpl <em>KNN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.KNNImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getKNN()
		 * @generated
		 */
		EClass KNN = eINSTANCE.getKNN();

		/**
		 * The meta object literal for the '<em><b>K</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KNN__K = eINSTANCE.getKNN_K();

		/**
		 * The meta object literal for the '{@link mLmodel.Evaluation_Methods <em>Evaluation Methods</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Evaluation_Methods
		 * @see mLmodel.impl.MLmodelPackageImpl#getEvaluation_Methods()
		 * @generated
		 */
		EClass EVALUATION_METHODS = eINSTANCE.getEvaluation_Methods();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_METHODS__PRECISION = eINSTANCE.getEvaluation_Methods_Precision();

		/**
		 * The meta object literal for the '<em><b>Accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_METHODS__ACCURACY = eINSTANCE.getEvaluation_Methods_Accuracy();

		/**
		 * The meta object literal for the '<em><b>Recall</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_METHODS__RECALL = eINSTANCE.getEvaluation_Methods_Recall();

		/**
		 * The meta object literal for the '<em><b>F1 score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVALUATION_METHODS__F1_SCORE = eINSTANCE.getEvaluation_Methods_F1_score();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.Cross_ValidationImpl <em>Cross Validation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.Cross_ValidationImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getCross_Validation()
		 * @generated
		 */
		EClass CROSS_VALIDATION = eINSTANCE.getCross_Validation();

		/**
		 * The meta object literal for the '<em><b>Number of folds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSS_VALIDATION__NUMBER_OF_FOLDS = eINSTANCE.getCross_Validation_Number_of_folds();

		/**
		 * The meta object literal for the '<em><b>Plots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSS_VALIDATION__PLOTS = eINSTANCE.getCross_Validation_Plots();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.HeadCSVImpl <em>Head CSV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.HeadCSVImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getHeadCSV()
		 * @generated
		 */
		EClass HEAD_CSV = eINSTANCE.getHeadCSV();

		/**
		 * The meta object literal for the '<em><b>Default header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAD_CSV__DEFAULT_HEADER = eINSTANCE.getHeadCSV_Default_header();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.Sheet_Na_ExcelImpl <em>Sheet Na Excel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.Sheet_Na_ExcelImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getSheet_Na_Excel()
		 * @generated
		 */
		EClass SHEET_NA_EXCEL = eINSTANCE.getSheet_Na_Excel();

		/**
		 * The meta object literal for the '<em><b>Default val sheet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHEET_NA_EXCEL__DEFAULT_VAL_SHEET = eINSTANCE.getSheet_Na_Excel_Default_val_sheet();

		/**
		 * The meta object literal for the '{@link mLmodel.Scaling <em>Scaling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Scaling
		 * @see mLmodel.impl.MLmodelPackageImpl#getScaling()
		 * @generated
		 */
		EClass SCALING = eINSTANCE.getScaling();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.Robust_ScalingImpl <em>Robust Scaling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.Robust_ScalingImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getRobust_Scaling()
		 * @generated
		 */
		EClass ROBUST_SCALING = eINSTANCE.getRobust_Scaling();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.StandardizationImpl <em>Standardization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.StandardizationImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getStandardization()
		 * @generated
		 */
		EClass STANDARDIZATION = eINSTANCE.getStandardization();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.NormalizationImpl <em>Normalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.NormalizationImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getNormalization()
		 * @generated
		 */
		EClass NORMALIZATION = eINSTANCE.getNormalization();

		/**
		 * The meta object literal for the '{@link mLmodel.Encoding <em>Encoding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Encoding
		 * @see mLmodel.impl.MLmodelPackageImpl#getEncoding()
		 * @generated
		 */
		EClass ENCODING = eINSTANCE.getEncoding();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.OneHotImpl <em>One Hot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.OneHotImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getOneHot()
		 * @generated
		 */
		EClass ONE_HOT = eINSTANCE.getOneHot();

		/**
		 * The meta object literal for the '<em><b>Onehot argumans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_HOT__ONEHOT_ARGUMANS = eINSTANCE.getOneHot_Onehot_argumans();

		/**
		 * The meta object literal for the '{@link mLmodel.OneHot_Argumans <em>One Hot Argumans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.OneHot_Argumans
		 * @see mLmodel.impl.MLmodelPackageImpl#getOneHot_Argumans()
		 * @generated
		 */
		EClass ONE_HOT_ARGUMANS = eINSTANCE.getOneHot_Argumans();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.DropImpl <em>Drop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.DropImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getDrop()
		 * @generated
		 */
		EClass DROP = eINSTANCE.getDrop();

		/**
		 * The meta object literal for the '<em><b>Default value drop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP__DEFAULT_VALUE_DROP = eINSTANCE.getDrop_Default_value_drop();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.CategoriesImpl <em>Categories</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.CategoriesImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getCategories()
		 * @generated
		 */
		EClass CATEGORIES = eINSTANCE.getCategories();

		/**
		 * The meta object literal for the '<em><b>Default value cat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORIES__DEFAULT_VALUE_CAT = eINSTANCE.getCategories_Default_value_cat();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.SparseImpl <em>Sparse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.SparseImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getSparse()
		 * @generated
		 */
		EClass SPARSE = eINSTANCE.getSparse();

		/**
		 * The meta object literal for the '<em><b>Default value sparse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPARSE__DEFAULT_VALUE_SPARSE = eINSTANCE.getSparse_Default_value_sparse();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.Handle_UnkImpl <em>Handle Unk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.Handle_UnkImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getHandle_Unk()
		 * @generated
		 */
		EClass HANDLE_UNK = eINSTANCE.getHandle_Unk();

		/**
		 * The meta object literal for the '<em><b>Default value handle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HANDLE_UNK__DEFAULT_VALUE_HANDLE = eINSTANCE.getHandle_Unk_Default_value_handle();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.DuplicatesImpl <em>Duplicates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.DuplicatesImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getDuplicates()
		 * @generated
		 */
		EClass DUPLICATES = eINSTANCE.getDuplicates();

		/**
		 * The meta object literal for the '<em><b>Duplicates argumans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUPLICATES__DUPLICATES_ARGUMANS = eINSTANCE.getDuplicates_Duplicates_argumans();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.KeepImpl <em>Keep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.KeepImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getKeep()
		 * @generated
		 */
		EClass KEEP = eINSTANCE.getKeep();

		/**
		 * The meta object literal for the '<em><b>Dup keep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEEP__DUP_KEEP = eINSTANCE.getKeep_Dup_keep();

		/**
		 * The meta object literal for the '{@link mLmodel.Duplicates_Argumans <em>Duplicates Argumans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Duplicates_Argumans
		 * @see mLmodel.impl.MLmodelPackageImpl#getDuplicates_Argumans()
		 * @generated
		 */
		EClass DUPLICATES_ARGUMANS = eINSTANCE.getDuplicates_Argumans();

		/**
		 * The meta object literal for the '{@link mLmodel.Trasformation <em>Trasformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Trasformation
		 * @see mLmodel.impl.MLmodelPackageImpl#getTrasformation()
		 * @generated
		 */
		EClass TRASFORMATION = eINSTANCE.getTrasformation();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.Date_to_IntImpl <em>Date to Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.Date_to_IntImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getDate_to_Int()
		 * @generated
		 */
		EClass DATE_TO_INT = eINSTANCE.getDate_to_Int();

		/**
		 * The meta object literal for the '<em><b>Date comp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATE_TO_INT__DATE_COMP = eINSTANCE.getDate_to_Int_Date_comp();

		/**
		 * The meta object literal for the '{@link mLmodel.Date_Comp <em>Date Comp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Date_Comp
		 * @see mLmodel.impl.MLmodelPackageImpl#getDate_Comp()
		 * @generated
		 */
		EClass DATE_COMP = eINSTANCE.getDate_Comp();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.YearImpl <em>Year</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.YearImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getYear()
		 * @generated
		 */
		EClass YEAR = eINSTANCE.getYear();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.MonthImpl <em>Month</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.MonthImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getMonth()
		 * @generated
		 */
		EClass MONTH = eINSTANCE.getMonth();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.DayImpl <em>Day</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.DayImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getDay()
		 * @generated
		 */
		EClass DAY = eINSTANCE.getDay();

		/**
		 * The meta object literal for the '{@link mLmodel.Dime_Reduct <em>Dime Reduct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Dime_Reduct
		 * @see mLmodel.impl.MLmodelPackageImpl#getDime_Reduct()
		 * @generated
		 */
		EClass DIME_REDUCT = eINSTANCE.getDime_Reduct();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.PCAImpl <em>PCA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.PCAImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getPCA()
		 * @generated
		 */
		EClass PCA = eINSTANCE.getPCA();

		/**
		 * The meta object literal for the '<em><b>Pca argumans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCA__PCA_ARGUMANS = eINSTANCE.getPCA_Pca_argumans();

		/**
		 * The meta object literal for the '{@link mLmodel.PCA_Argumans <em>PCA Argumans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.PCA_Argumans
		 * @see mLmodel.impl.MLmodelPackageImpl#getPCA_Argumans()
		 * @generated
		 */
		EClass PCA_ARGUMANS = eINSTANCE.getPCA_Argumans();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.ComponentImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Component value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__COMPONENT_VALUE = eINSTANCE.getComponent_Component_value();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.VarienceImpl <em>Varience</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.VarienceImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getVarience()
		 * @generated
		 */
		EClass VARIENCE = eINSTANCE.getVarience();

		/**
		 * The meta object literal for the '<em><b>Varience value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIENCE__VARIENCE_VALUE = eINSTANCE.getVarience_Varience_value();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.SVMImpl <em>SVM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.SVMImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getSVM()
		 * @generated
		 */
		EClass SVM = eINSTANCE.getSVM();

		/**
		 * The meta object literal for the '<em><b>C</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SVM__C = eINSTANCE.getSVM_C();

		/**
		 * The meta object literal for the '<em><b>Kernel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SVM__KERNEL = eINSTANCE.getSVM_Kernel();

		/**
		 * The meta object literal for the '{@link mLmodel.Neural_Networks <em>Neural Networks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Neural_Networks
		 * @see mLmodel.impl.MLmodelPackageImpl#getNeural_Networks()
		 * @generated
		 */
		EClass NEURAL_NETWORKS = eINSTANCE.getNeural_Networks();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEURAL_NETWORKS__LIBRARY = eINSTANCE.getNeural_Networks_Library();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.MLPImpl <em>MLP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.MLPImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getMLP()
		 * @generated
		 */
		EClass MLP = eINSTANCE.getMLP();

		/**
		 * The meta object literal for the '<em><b>Hidden layer sizes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MLP__HIDDEN_LAYER_SIZES = eINSTANCE.getMLP_Hidden_layer_sizes();

		/**
		 * The meta object literal for the '<em><b>Mlp argumans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MLP__MLP_ARGUMANS = eINSTANCE.getMLP_Mlp_argumans();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.Hidden_Layer_SizesImpl <em>Hidden Layer Sizes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.Hidden_Layer_SizesImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getHidden_Layer_Sizes()
		 * @generated
		 */
		EClass HIDDEN_LAYER_SIZES = eINSTANCE.getHidden_Layer_Sizes();

		/**
		 * The meta object literal for the '<em><b>Neurons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIDDEN_LAYER_SIZES__NEURONS = eINSTANCE.getHidden_Layer_Sizes_Neurons();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.Voting_ClassifierImpl <em>Voting Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.Voting_ClassifierImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getVoting_Classifier()
		 * @generated
		 */
		EClass VOTING_CLASSIFIER = eINSTANCE.getVoting_Classifier();

		/**
		 * The meta object literal for the '<em><b>Voting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOTING_CLASSIFIER__VOTING = eINSTANCE.getVoting_Classifier_Voting();

		/**
		 * The meta object literal for the '<em><b>Classification</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOTING_CLASSIFIER__CLASSIFICATION = eINSTANCE.getVoting_Classifier_Classification();

		/**
		 * The meta object literal for the '{@link mLmodel.Ensembles <em>Ensembles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Ensembles
		 * @see mLmodel.impl.MLmodelPackageImpl#getEnsembles()
		 * @generated
		 */
		EClass ENSEMBLES = eINSTANCE.getEnsembles();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.Random_ForestImpl <em>Random Forest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.Random_ForestImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getRandom_Forest()
		 * @generated
		 */
		EClass RANDOM_FOREST = eINSTANCE.getRandom_Forest();

		/**
		 * The meta object literal for the '<em><b>Rf argumans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANDOM_FOREST__RF_ARGUMANS = eINSTANCE.getRandom_Forest_Rf_argumans();

		/**
		 * The meta object literal for the '{@link mLmodel.Clustering <em>Clustering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Clustering
		 * @see mLmodel.impl.MLmodelPackageImpl#getClustering()
		 * @generated
		 */
		EClass CLUSTERING = eINSTANCE.getClustering();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTERING__LIBRARY = eINSTANCE.getClustering_Library();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.K_MediansImpl <em>KMedians</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.K_MediansImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getK_Medians()
		 * @generated
		 */
		EClass KMEDIANS = eINSTANCE.getK_Medians();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.K_MeansImpl <em>KMeans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.K_MeansImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getK_Means()
		 * @generated
		 */
		EClass KMEANS = eINSTANCE.getK_Means();

		/**
		 * The meta object literal for the '{@link mLmodel.Parameters <em>Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Parameters
		 * @see mLmodel.impl.MLmodelPackageImpl#getParameters()
		 * @generated
		 */
		EClass PARAMETERS = eINSTANCE.getParameters();

		/**
		 * The meta object literal for the '<em><b>K</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__K = eINSTANCE.getParameters_K();

		/**
		 * The meta object literal for the '<em><b>Max iter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__MAX_ITER = eINSTANCE.getParameters_Max_iter();

		/**
		 * The meta object literal for the '{@link mLmodel.Regression <em>Regression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Regression
		 * @see mLmodel.impl.MLmodelPackageImpl#getRegression()
		 * @generated
		 */
		EClass REGRESSION = eINSTANCE.getRegression();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.Logistic_RegressionImpl <em>Logistic Regression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.Logistic_RegressionImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getLogistic_Regression()
		 * @generated
		 */
		EClass LOGISTIC_REGRESSION = eINSTANCE.getLogistic_Regression();

		/**
		 * The meta object literal for the '{@link mLmodel.RF_Argumans <em>RF Argumans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.RF_Argumans
		 * @see mLmodel.impl.MLmodelPackageImpl#getRF_Argumans()
		 * @generated
		 */
		EClass RF_ARGUMANS = eINSTANCE.getRF_Argumans();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.N_Estimators_RFImpl <em>NEstimators RF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.N_Estimators_RFImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getN_Estimators_RF()
		 * @generated
		 */
		EClass NESTIMATORS_RF = eINSTANCE.getN_Estimators_RF();

		/**
		 * The meta object literal for the '<em><b>Nestimators</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NESTIMATORS_RF__NESTIMATORS = eINSTANCE.getN_Estimators_RF_N_estimators();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.Criterion_RFImpl <em>Criterion RF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.Criterion_RFImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getCriterion_RF()
		 * @generated
		 */
		EClass CRITERION_RF = eINSTANCE.getCriterion_RF();

		/**
		 * The meta object literal for the '<em><b>Criterion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRITERION_RF__CRITERION = eINSTANCE.getCriterion_RF_Criterion();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.Random_State_RFImpl <em>Random State RF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.Random_State_RFImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getRandom_State_RF()
		 * @generated
		 */
		EClass RANDOM_STATE_RF = eINSTANCE.getRandom_State_RF();

		/**
		 * The meta object literal for the '<em><b>Random state</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANDOM_STATE_RF__RANDOM_STATE = eINSTANCE.getRandom_State_RF_Random_state();

		/**
		 * The meta object literal for the '{@link mLmodel.Parameters_DBOP <em>Parameters DBOP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Parameters_DBOP
		 * @see mLmodel.impl.MLmodelPackageImpl#getParameters_DBOP()
		 * @generated
		 */
		EClass PARAMETERS_DBOP = eINSTANCE.getParameters_DBOP();

		/**
		 * The meta object literal for the '<em><b>Eps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS_DBOP__EPS = eINSTANCE.getParameters_DBOP_Eps();

		/**
		 * The meta object literal for the '<em><b>Min samples</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS_DBOP__MIN_SAMPLES = eINSTANCE.getParameters_DBOP_Min_samples();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.DBSCANImpl <em>DBSCAN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.DBSCANImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getDBSCAN()
		 * @generated
		 */
		EClass DBSCAN = eINSTANCE.getDBSCAN();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DBSCAN__P = eINSTANCE.getDBSCAN_P();

		/**
		 * The meta object literal for the '{@link mLmodel.MLP_Argumans <em>MLP Argumans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.MLP_Argumans
		 * @see mLmodel.impl.MLmodelPackageImpl#getMLP_Argumans()
		 * @generated
		 */
		EClass MLP_ARGUMANS = eINSTANCE.getMLP_Argumans();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.Max_Iter_MLPImpl <em>Max Iter MLP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.Max_Iter_MLPImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getMax_Iter_MLP()
		 * @generated
		 */
		EClass MAX_ITER_MLP = eINSTANCE.getMax_Iter_MLP();

		/**
		 * The meta object literal for the '<em><b>Max iter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAX_ITER_MLP__MAX_ITER = eINSTANCE.getMax_Iter_MLP_Max_iter();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.Random_State_MLPImpl <em>Random State MLP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.Random_State_MLPImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getRandom_State_MLP()
		 * @generated
		 */
		EClass RANDOM_STATE_MLP = eINSTANCE.getRandom_State_MLP();

		/**
		 * The meta object literal for the '<em><b>Random state</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANDOM_STATE_MLP__RANDOM_STATE = eINSTANCE.getRandom_State_MLP_Random_state();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.Activation_MLPImpl <em>Activation MLP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.Activation_MLPImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getActivation_MLP()
		 * @generated
		 */
		EClass ACTIVATION_MLP = eINSTANCE.getActivation_MLP();

		/**
		 * The meta object literal for the '<em><b>Activation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVATION_MLP__ACTIVATION = eINSTANCE.getActivation_MLP_Activation();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.Alpha_MLPImpl <em>Alpha MLP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.Alpha_MLPImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getAlpha_MLP()
		 * @generated
		 */
		EClass ALPHA_MLP = eINSTANCE.getAlpha_MLP();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALPHA_MLP__ALPHA = eINSTANCE.getAlpha_MLP_Alpha();

		/**
		 * The meta object literal for the '{@link mLmodel.Plots <em>Plots</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Plots
		 * @see mLmodel.impl.MLmodelPackageImpl#getPlots()
		 * @generated
		 */
		EClass PLOTS = eINSTANCE.getPlots();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.ScatterImpl <em>Scatter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.ScatterImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getScatter()
		 * @generated
		 */
		EClass SCATTER = eINSTANCE.getScatter();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.Cluster_EvaluationImpl <em>Cluster Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.Cluster_EvaluationImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getCluster_Evaluation()
		 * @generated
		 */
		EClass CLUSTER_EVALUATION = eINSTANCE.getCluster_Evaluation();

		/**
		 * The meta object literal for the '<em><b>Scatter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER_EVALUATION__SCATTER = eINSTANCE.getCluster_Evaluation_Scatter();

		/**
		 * The meta object literal for the '<em><b>Cluster sizes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTER_EVALUATION__CLUSTER_SIZES = eINSTANCE.getCluster_Evaluation_Cluster_sizes();

		/**
		 * The meta object literal for the '<em><b>Cluster centers features</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTER_EVALUATION__CLUSTER_CENTERS_FEATURES = eINSTANCE
				.getCluster_Evaluation_Cluster_centers_features();

		/**
		 * The meta object literal for the '<em><b>Cluster centers standard deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTER_EVALUATION__CLUSTER_CENTERS_STANDARD_DEVIATION = eINSTANCE
				.getCluster_Evaluation_Cluster_centers_standard_deviation();

		/**
		 * The meta object literal for the '<em><b>Cluster centers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTER_EVALUATION__CLUSTER_CENTERS = eINSTANCE.getCluster_Evaluation_Cluster_centers();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.OPticsImpl <em>OPtics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.OPticsImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getOPtics()
		 * @generated
		 */
		EClass OPTICS = eINSTANCE.getOPtics();

		/**
		 * The meta object literal for the '{@link mLmodel.Preprocess <em>Preprocess</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Preprocess
		 * @see mLmodel.impl.MLmodelPackageImpl#getPreprocess()
		 * @generated
		 */
		EClass PREPROCESS = eINSTANCE.getPreprocess();

		/**
		 * The meta object literal for the '<em><b>Regular</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREPROCESS__REGULAR = eINSTANCE.getPreprocess_Regular();

		/**
		 * The meta object literal for the '<em><b>Save file</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREPROCESS__SAVE_FILE = eINSTANCE.getPreprocess_Save_file();

		/**
		 * The meta object literal for the '<em><b>Print data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREPROCESS__PRINT_DATA = eINSTANCE.getPreprocess_Print_data();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.Auto_PrepImpl <em>Auto Prep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.Auto_PrepImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getAuto_Prep()
		 * @generated
		 */
		EClass AUTO_PREP = eINSTANCE.getAuto_Prep();

		/**
		 * The meta object literal for the '<em><b>Simple Imputer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_PREP__SIMPLE_IMPUTER = eINSTANCE.getAuto_Prep_Simple_Imputer();

		/**
		 * The meta object literal for the '<em><b>KNN Imputer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_PREP__KNN_IMPUTER = eINSTANCE.getAuto_Prep_KNN_Imputer();

		/**
		 * The meta object literal for the '<em><b>Scaling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_PREP__SCALING = eINSTANCE.getAuto_Prep_Scaling();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_PREP__ENCODING = eINSTANCE.getAuto_Prep_Encoding();

		/**
		 * The meta object literal for the '<em><b>Duplicates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_PREP__DUPLICATES = eINSTANCE.getAuto_Prep_Duplicates();

		/**
		 * The meta object literal for the '<em><b>Trasformation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_PREP__TRASFORMATION = eINSTANCE.getAuto_Prep_Trasformation();

		/**
		 * The meta object literal for the '<em><b>Dime Reduct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_PREP__DIME_REDUCT = eINSTANCE.getAuto_Prep_Dime_Reduct();

		/**
		 * The meta object literal for the '<em><b>Date to Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_PREP__DATE_TO_INT = eINSTANCE.getAuto_Prep_Date_to_Int();

		/**
		 * The meta object literal for the '<em><b>Drop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_PREP__DROP = eINSTANCE.getAuto_Prep_Drop();

		/**
		 * The meta object literal for the '<em><b>Miss id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_PREP__MISS_ID = eINSTANCE.getAuto_Prep_Miss_id();

		/**
		 * The meta object literal for the '{@link mLmodel.Data_Understanding <em>Data Understanding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Data_Understanding
		 * @see mLmodel.impl.MLmodelPackageImpl#getData_Understanding()
		 * @generated
		 */
		EClass DATA_UNDERSTANDING = eINSTANCE.getData_Understanding();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.StatisticsImpl <em>Statistics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.StatisticsImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getStatistics()
		 * @generated
		 */
		EClass STATISTICS = eINSTANCE.getStatistics();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS__TYPE = eINSTANCE.getStatistics_Type();

		/**
		 * The meta object literal for the '<em><b>Missing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS__MISSING = eINSTANCE.getStatistics_Missing();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS__MIN = eINSTANCE.getStatistics_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS__MAX = eINSTANCE.getStatistics_Max();

		/**
		 * The meta object literal for the '<em><b>Average</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS__AVERAGE = eINSTANCE.getStatistics_Average();

		/**
		 * The meta object literal for the '<em><b>Standard devision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS__STANDARD_DEVISION = eINSTANCE.getStatistics_Standard_devision();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.VisualizationImpl <em>Visualization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.VisualizationImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getVisualization()
		 * @generated
		 */
		EClass VISUALIZATION = eINSTANCE.getVisualization();

		/**
		 * The meta object literal for the '<em><b>Data und plots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUALIZATION__DATA_UND_PLOTS = eINSTANCE.getVisualization_Data_und_plots();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.CorrelationImpl <em>Correlation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.CorrelationImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getCorrelation()
		 * @generated
		 */
		EClass CORRELATION = eINSTANCE.getCorrelation();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRELATION__WIDTH = eINSTANCE.getCorrelation_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRELATION__HEIGHT = eINSTANCE.getCorrelation_Height();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRELATION__TABLE = eINSTANCE.getCorrelation_Table();

		/**
		 * The meta object literal for the '<em><b>Matrix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRELATION__MATRIX = eINSTANCE.getCorrelation_Matrix();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.Standard_DeviationImpl <em>Standard Deviation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.Standard_DeviationImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getStandard_Deviation()
		 * @generated
		 */
		EClass STANDARD_DEVIATION = eINSTANCE.getStandard_Deviation();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.BarImpl <em>Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.BarImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getBar()
		 * @generated
		 */
		EClass BAR = eINSTANCE.getBar();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.Linear_RegressionImpl <em>Linear Regression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.Linear_RegressionImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getLinear_Regression()
		 * @generated
		 */
		EClass LINEAR_REGRESSION = eINSTANCE.getLinear_Regression();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.ThingImpl <em>Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.ThingImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getThing()
		 * @generated
		 */
		EClass THING = eINSTANCE.getThing();

		/**
		 * The meta object literal for the '<em><b>Protocolbinding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__PROTOCOLBINDING = eINSTANCE.getThing_Protocolbinding();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__PROPERTY = eINSTANCE.getThing_Property();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__ACTION = eINSTANCE.getThing_Action();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__EVENT = eINSTANCE.getThing_Event();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__ID = eINSTANCE.getThing_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__TITLE = eINSTANCE.getThing_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__DESCRIPTION = eINSTANCE.getThing_Description();

		/**
		 * The meta object literal for the '<em><b>Base URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__BASE_URI = eINSTANCE.getThing_BaseURI();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.ProtocolBindingImpl <em>Protocol Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.ProtocolBindingImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getProtocolBinding()
		 * @generated
		 */
		EClass PROTOCOL_BINDING = eINSTANCE.getProtocolBinding();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL_BINDING__PROTOCOL = eINSTANCE.getProtocolBinding_Protocol();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL_BINDING__ENDPOINT = eINSTANCE.getProtocolBinding_Endpoint();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.PropertyImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Datasource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__DATASOURCE = eINSTANCE.getProperty_Datasource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__READ_ONLY = eINSTANCE.getProperty_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Write Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__WRITE_ONLY = eINSTANCE.getProperty_WriteOnly();

		/**
		 * The meta object literal for the '<em><b>Observable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__OBSERVABLE = eINSTANCE.getProperty_Observable();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.ActionImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__INPUT = eINSTANCE.getAction_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__OUTPUT = eINSTANCE.getAction_Output();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__DESCRIPTION = eINSTANCE.getAction_Description();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.EventImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Analysystriger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__ANALYSYSTRIGER = eINSTANCE.getEvent_Analysystriger();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__DATA = eINSTANCE.getEvent_Data();

		/**
		 * The meta object literal for the '<em><b>Subscription</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__SUBSCRIPTION = eINSTANCE.getEvent_Subscription();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.DataSourceImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__NAME = eINSTANCE.getDataSource_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__TYPE = eINSTANCE.getDataSource_Type();

		/**
		 * The meta object literal for the '<em><b>Source URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__SOURCE_URI = eINSTANCE.getDataSource_SourceURI();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__FORMAT = eINSTANCE.getDataSource_Format();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.AnalysisOutputImpl <em>Analysis Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.AnalysisOutputImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getAnalysisOutput()
		 * @generated
		 */
		EClass ANALYSIS_OUTPUT = eINSTANCE.getAnalysisOutput();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_OUTPUT__ACTION = eINSTANCE.getAnalysisOutput_Action();

		/**
		 * The meta object literal for the '<em><b>Result Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_OUTPUT__RESULT_VALUE = eINSTANCE.getAnalysisOutput_ResultValue();

		/**
		 * The meta object literal for the '<em><b>Result Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_OUTPUT__RESULT_TYPE = eINSTANCE.getAnalysisOutput_ResultType();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_OUTPUT__TIMESTAMP = eINSTANCE.getAnalysisOutput_Timestamp();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.AnalysysTrigerImpl <em>Analysys Triger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.AnalysysTrigerImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getAnalysysTriger()
		 * @generated
		 */
		EClass ANALYSYS_TRIGER = eINSTANCE.getAnalysysTriger();

		/**
		 * The meta object literal for the '<em><b>Trigger Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSYS_TRIGER__TRIGGER_TYPE = eINSTANCE.getAnalysysTriger_TriggerType();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSYS_TRIGER__CONDITION = eINSTANCE.getAnalysysTriger_Condition();

		/**
		 * The meta object literal for the '<em><b>Schedule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSYS_TRIGER__SCHEDULE = eINSTANCE.getAnalysysTriger_Schedule();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.CommunicationProtocolImpl <em>Communication Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.CommunicationProtocolImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getCommunicationProtocol()
		 * @generated
		 */
		EClass COMMUNICATION_PROTOCOL = eINSTANCE.getCommunicationProtocol();

		/**
		 * The meta object literal for the '<em><b>Mqtt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_PROTOCOL__MQTT = eINSTANCE.getCommunicationProtocol_Mqtt();

		/**
		 * The meta object literal for the '<em><b>Buffer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_PROTOCOL__BUFFER = eINSTANCE.getCommunicationProtocol_Buffer();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.BufferImpl <em>Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.BufferImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getBuffer()
		 * @generated
		 */
		EClass BUFFER = eINSTANCE.getBuffer();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.MQTTImpl <em>MQTT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.MQTTImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getMQTT()
		 * @generated
		 */
		EClass MQTT = eINSTANCE.getMQTT();

		/**
		 * The meta object literal for the '<em><b>MQTT BROKER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MQTT__MQTT_BROKER = eINSTANCE.getMQTT_MQTT_BROKER();

		/**
		 * The meta object literal for the '<em><b>MQTT PORT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MQTT__MQTT_PORT = eINSTANCE.getMQTT_MQTT_PORT();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MQTT__TOPIC = eINSTANCE.getMQTT_Topic();

		/**
		 * The meta object literal for the '{@link mLmodel.OnlineModelManager <em>Online Model Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.OnlineModelManager
		 * @see mLmodel.impl.MLmodelPackageImpl#getOnlineModelManager()
		 * @generated
		 */
		EClass ONLINE_MODEL_MANAGER = eINSTANCE.getOnlineModelManager();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.TopicImpl <em>Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.TopicImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getTopic()
		 * @generated
		 */
		EClass TOPIC = eINSTANCE.getTopic();

		/**
		 * The meta object literal for the '<em><b>MQTT CONTROL TOPIC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__MQTT_CONTROL_TOPIC = eINSTANCE.getTopic_MQTT_CONTROL_TOPIC();

		/**
		 * The meta object literal for the '<em><b>MQTT SENSOR TOPIC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPIC__MQTT_SENSOR_TOPIC = eINSTANCE.getTopic_MQTT_SENSOR_TOPIC();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.SGDClassifierImpl <em>SGD Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.SGDClassifierImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getSGDClassifier()
		 * @generated
		 */
		EClass SGD_CLASSIFIER = eINSTANCE.getSGDClassifier();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.PassiveAggressiveClassifierImpl <em>Passive Aggressive Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.PassiveAggressiveClassifierImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getPassiveAggressiveClassifier()
		 * @generated
		 */
		EClass PASSIVE_AGGRESSIVE_CLASSIFIER = eINSTANCE.getPassiveAggressiveClassifier();

		/**
		 * The meta object literal for the '{@link mLmodel.impl.PerceptronImpl <em>Perceptron</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.impl.PerceptronImpl
		 * @see mLmodel.impl.MLmodelPackageImpl#getPerceptron()
		 * @generated
		 */
		EClass PERCEPTRON = eINSTANCE.getPerceptron();

		/**
		 * The meta object literal for the '{@link mLmodel.Enum_CSV_Sep <em>Enum CSV Sep</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Enum_CSV_Sep
		 * @see mLmodel.impl.MLmodelPackageImpl#getEnum_CSV_Sep()
		 * @generated
		 */
		EEnum ENUM_CSV_SEP = eINSTANCE.getEnum_CSV_Sep();

		/**
		 * The meta object literal for the '{@link mLmodel.Strategy_Simple_Imputer <em>Strategy Simple Imputer</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Strategy_Simple_Imputer
		 * @see mLmodel.impl.MLmodelPackageImpl#getStrategy_Simple_Imputer()
		 * @generated
		 */
		EEnum STRATEGY_SIMPLE_IMPUTER = eINSTANCE.getStrategy_Simple_Imputer();

		/**
		 * The meta object literal for the '{@link mLmodel.OneHot_Cat_Arg <em>One Hot Cat Arg</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.OneHot_Cat_Arg
		 * @see mLmodel.impl.MLmodelPackageImpl#getOneHot_Cat_Arg()
		 * @generated
		 */
		EEnum ONE_HOT_CAT_ARG = eINSTANCE.getOneHot_Cat_Arg();

		/**
		 * The meta object literal for the '{@link mLmodel.OneHot_Drop_Arg <em>One Hot Drop Arg</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.OneHot_Drop_Arg
		 * @see mLmodel.impl.MLmodelPackageImpl#getOneHot_Drop_Arg()
		 * @generated
		 */
		EEnum ONE_HOT_DROP_ARG = eINSTANCE.getOneHot_Drop_Arg();

		/**
		 * The meta object literal for the '{@link mLmodel.OneHot_HandleUn_Arg <em>One Hot Handle Un Arg</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.OneHot_HandleUn_Arg
		 * @see mLmodel.impl.MLmodelPackageImpl#getOneHot_HandleUn_Arg()
		 * @generated
		 */
		EEnum ONE_HOT_HANDLE_UN_ARG = eINSTANCE.getOneHot_HandleUn_Arg();

		/**
		 * The meta object literal for the '{@link mLmodel.Dup_Arg_Keep <em>Dup Arg Keep</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Dup_Arg_Keep
		 * @see mLmodel.impl.MLmodelPackageImpl#getDup_Arg_Keep()
		 * @generated
		 */
		EEnum DUP_ARG_KEEP = eINSTANCE.getDup_Arg_Keep();

		/**
		 * The meta object literal for the '{@link mLmodel.SVM_Kernel_Enum <em>SVM Kernel Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.SVM_Kernel_Enum
		 * @see mLmodel.impl.MLmodelPackageImpl#getSVM_Kernel_Enum()
		 * @generated
		 */
		EEnum SVM_KERNEL_ENUM = eINSTANCE.getSVM_Kernel_Enum();

		/**
		 * The meta object literal for the '{@link mLmodel.Neural_Libraries <em>Neural Libraries</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Neural_Libraries
		 * @see mLmodel.impl.MLmodelPackageImpl#getNeural_Libraries()
		 * @generated
		 */
		EEnum NEURAL_LIBRARIES = eINSTANCE.getNeural_Libraries();

		/**
		 * The meta object literal for the '{@link mLmodel.Neural_Network_Activation <em>Neural Network Activation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Neural_Network_Activation
		 * @see mLmodel.impl.MLmodelPackageImpl#getNeural_Network_Activation()
		 * @generated
		 */
		EEnum NEURAL_NETWORK_ACTIVATION = eINSTANCE.getNeural_Network_Activation();

		/**
		 * The meta object literal for the '{@link mLmodel.voting_pred <em>voting pred</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.voting_pred
		 * @see mLmodel.impl.MLmodelPackageImpl#getvoting_pred()
		 * @generated
		 */
		EEnum VOTING_PRED = eINSTANCE.getvoting_pred();

		/**
		 * The meta object literal for the '{@link mLmodel.Random_Forest_Criterion_Enum <em>Random Forest Criterion Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Random_Forest_Criterion_Enum
		 * @see mLmodel.impl.MLmodelPackageImpl#getRandom_Forest_Criterion_Enum()
		 * @generated
		 */
		EEnum RANDOM_FOREST_CRITERION_ENUM = eINSTANCE.getRandom_Forest_Criterion_Enum();

		/**
		 * The meta object literal for the '{@link mLmodel.Library_Clustering <em>Library Clustering</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Library_Clustering
		 * @see mLmodel.impl.MLmodelPackageImpl#getLibrary_Clustering()
		 * @generated
		 */
		EEnum LIBRARY_CLUSTERING = eINSTANCE.getLibrary_Clustering();

		/**
		 * The meta object literal for the '{@link mLmodel.Metric_DBSCAN <em>Metric DBSCAN</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Metric_DBSCAN
		 * @see mLmodel.impl.MLmodelPackageImpl#getMetric_DBSCAN()
		 * @generated
		 */
		EEnum METRIC_DBSCAN = eINSTANCE.getMetric_DBSCAN();

		/**
		 * The meta object literal for the '{@link mLmodel.Attribiutes_Type <em>Attribiutes Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.Attribiutes_Type
		 * @see mLmodel.impl.MLmodelPackageImpl#getAttribiutes_Type()
		 * @generated
		 */
		EEnum ATTRIBIUTES_TYPE = eINSTANCE.getAttribiutes_Type();

		/**
		 * The meta object literal for the '{@link mLmodel.KNN_Imputer_Weights <em>KNN Imputer Weights</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.KNN_Imputer_Weights
		 * @see mLmodel.impl.MLmodelPackageImpl#getKNN_Imputer_Weights()
		 * @generated
		 */
		EEnum KNN_IMPUTER_WEIGHTS = eINSTANCE.getKNN_Imputer_Weights();

		/**
		 * The meta object literal for the '{@link mLmodel.TrigerEnum <em>Triger Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.TrigerEnum
		 * @see mLmodel.impl.MLmodelPackageImpl#getTrigerEnum()
		 * @generated
		 */
		EEnum TRIGER_ENUM = eINSTANCE.getTrigerEnum();

		/**
		 * The meta object literal for the '{@link mLmodel.ProtocolBindingEnum <em>Protocol Binding Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mLmodel.ProtocolBindingEnum
		 * @see mLmodel.impl.MLmodelPackageImpl#getProtocolBindingEnum()
		 * @generated
		 */
		EEnum PROTOCOL_BINDING_ENUM = eINSTANCE.getProtocolBindingEnum();

	}

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

} //MLmodelPackage