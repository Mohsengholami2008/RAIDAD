package mLmodel.impl;

import mLmodel.*;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MLmodelPackageImpl extends EPackageImpl implements MLmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cycleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass import_DataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csV_ArgumansEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nrowsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass set_RoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regularEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excel_ArgumansEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass header_ExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simple_ImputerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simple_Imputer_ArgumentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass missing_ValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fill_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knN_ImputerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knN_ArgumansEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass n_NeighborsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weightsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluation_MethodsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cross_ValidationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headCSVEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sheet_Na_ExcelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scalingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robust_ScalingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encodingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneHotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneHot_ArgumansEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sparseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass handle_UnkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass duplicatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass duplicates_ArgumansEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trasformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass date_to_IntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass date_CompEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yearEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dime_ReductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcA_ArgumansEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varienceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neural_NetworksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mlpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hidden_Layer_SizesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voting_ClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ensemblesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass random_ForestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusteringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass k_MediansEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass k_MeansEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logistic_RegressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rF_ArgumansEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass n_Estimators_RFEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criterion_RFEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass random_State_RFEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameters_DBOPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbscanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mlP_ArgumansEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass max_Iter_MLPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass random_State_MLPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activation_MLPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alpha_MLPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plotsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scatterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cluster_EvaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oPticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preprocessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auto_PrepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass data_UnderstandingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statisticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correlationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standard_DeviationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass barEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linear_RegressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysysTrigerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mqttEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass devicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onlineModelManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sgdClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passiveAggressiveClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perceptronEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lgSGDClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass svlgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onlinePreprocessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feature_EngineeringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureDiffsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polynomialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass min_MaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enum_CSV_SepEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum strategy_Simple_ImputerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum oneHot_Cat_ArgEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum oneHot_Drop_ArgEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum oneHot_HandleUn_ArgEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dup_Arg_KeepEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum svM_Kernel_EnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum neural_LibrariesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum neural_Network_ActivationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum voting_predEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum random_Forest_Criterion_EnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum library_ClusteringEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum metric_DBSCANEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attribiutes_TypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum knN_Imputer_WeightsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum trigerEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protocolBindingEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum learninG_RATEEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mLmodel.MLmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MLmodelPackageImpl() {
		super(eNS_URI, MLmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MLmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MLmodelPackage init() {
		if (isInited)
			return (MLmodelPackage) EPackage.Registry.INSTANCE.getEPackage(MLmodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMLmodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MLmodelPackageImpl theMLmodelPackage = registeredMLmodelPackage instanceof MLmodelPackageImpl
				? (MLmodelPackageImpl) registeredMLmodelPackage
				: new MLmodelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMLmodelPackage.createPackageContents();

		// Initialize created meta-data
		theMLmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMLmodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MLmodelPackage.eNS_URI, theMLmodelPackage);
		return theMLmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoot_Name() {
		return (EAttribute) rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Process() {
		return (EReference) rootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Thing() {
		return (EReference) rootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcess_File_path() {
		return (EAttribute) processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_Cycle() {
		return (EReference) processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_Data_understanding() {
		return (EReference) processEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_Analysystriger() {
		return (EReference) processEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCycle() {
		return cycleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCycle_After() {
		return (EReference) cycleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCycle_Before() {
		return (EReference) cycleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport_Data() {
		return import_DataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImport_Data_Role() {
		return (EReference) import_DataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSV() {
		return csvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSV_Csv_argumans() {
		return (EReference) csvEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSV_Argumans() {
		return csV_ArgumansEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSep() {
		return sepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSep_Default_value_sep() {
		return (EAttribute) sepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSep_Manual_sep() {
		return (EAttribute) sepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSep_Define() {
		return (EAttribute) sepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNrows() {
		return nrowsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNrows_Default_value_nrows() {
		return (EAttribute) nrowsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSet_Role() {
		return set_RoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_Role_Name() {
		return (EAttribute) set_RoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSet_Role_Type() {
		return (EAttribute) set_RoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getID() {
		return idEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTarget() {
		return targetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegular() {
		return regularEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcel() {
		return excelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExcel_Excel_arguments() {
		return (EReference) excelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcel_Argumans() {
		return excel_ArgumansEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeader_Ex() {
		return header_ExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeader_Ex_Defauld_value_head_ex() {
		return (EAttribute) header_ExEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimple_Imputer() {
		return simple_ImputerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimple_Imputer_Simple_imputer_arguments() {
		return (EReference) simple_ImputerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimple_Imputer_Arguments() {
		return simple_Imputer_ArgumentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMissing_Values() {
		return missing_ValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMissing_Values_Default_value_si_miss() {
		return (EAttribute) missing_ValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategy() {
		return strategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrategy_Default_value_sim_str() {
		return (EAttribute) strategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFill_Value() {
		return fill_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFill_Value_Default_value_sim_fill() {
		return (EAttribute) fill_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKNN_Imputer() {
		return knN_ImputerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKNN_Imputer_Knn_argumans() {
		return (EReference) knN_ImputerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKNN_Argumans() {
		return knN_ArgumansEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getN_Neighbors() {
		return n_NeighborsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getN_Neighbors_N_neighbors() {
		return (EAttribute) n_NeighborsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetric() {
		return metricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeights() {
		return weightsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeights_Weights() {
		return (EAttribute) weightsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassification() {
		return classificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKNN() {
		return knnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKNN_K() {
		return (EAttribute) knnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluation_Methods() {
		return evaluation_MethodsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluation_Methods_Precision() {
		return (EAttribute) evaluation_MethodsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluation_Methods_Accuracy() {
		return (EAttribute) evaluation_MethodsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluation_Methods_Recall() {
		return (EAttribute) evaluation_MethodsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluation_Methods_F1_score() {
		return (EAttribute) evaluation_MethodsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCross_Validation() {
		return cross_ValidationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCross_Validation_Number_of_folds() {
		return (EAttribute) cross_ValidationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCross_Validation_Plots() {
		return (EReference) cross_ValidationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeadCSV() {
		return headCSVEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeadCSV_Default_header() {
		return (EAttribute) headCSVEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSheet_Na_Excel() {
		return sheet_Na_ExcelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSheet_Na_Excel_Default_val_sheet() {
		return (EAttribute) sheet_Na_ExcelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScaling() {
		return scalingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRobust_Scaling() {
		return robust_ScalingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardization() {
		return standardizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalization() {
		return normalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncoding() {
		return encodingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneHot() {
		return oneHotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneHot_Onehot_argumans() {
		return (EReference) oneHotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneHot_Argumans() {
		return oneHot_ArgumansEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrop() {
		return dropEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrop_Default_value_drop() {
		return (EAttribute) dropEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategories() {
		return categoriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategories_Default_value_cat() {
		return (EAttribute) categoriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSparse() {
		return sparseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSparse_Default_value_sparse() {
		return (EAttribute) sparseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHandle_Unk() {
		return handle_UnkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandle_Unk_Default_value_handle() {
		return (EAttribute) handle_UnkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDuplicates() {
		return duplicatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDuplicates_Duplicates_argumans() {
		return (EReference) duplicatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeep() {
		return keepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeep_Dup_keep() {
		return (EAttribute) keepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDuplicates_Argumans() {
		return duplicates_ArgumansEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrasformation() {
		return trasformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDate_to_Int() {
		return date_to_IntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDate_to_Int_Date_comp() {
		return (EReference) date_to_IntEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDate_Comp() {
		return date_CompEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYear() {
		return yearEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonth() {
		return monthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDay() {
		return dayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDime_Reduct() {
		return dime_ReductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCA() {
		return pcaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCA_Pca_argumans() {
		return (EReference) pcaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCA_Argumans() {
		return pcA_ArgumansEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Component_value() {
		return (EAttribute) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarience() {
		return varienceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarience_Varience_value() {
		return (EAttribute) varienceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSVM() {
		return svmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSVM_C() {
		return (EAttribute) svmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSVM_Kernel() {
		return (EAttribute) svmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNeural_Networks() {
		return neural_NetworksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNeural_Networks_Library() {
		return (EAttribute) neural_NetworksEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMLP() {
		return mlpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLP_Hidden_layer_sizes() {
		return (EReference) mlpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMLP_Mlp_argumans() {
		return (EReference) mlpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHidden_Layer_Sizes() {
		return hidden_Layer_SizesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHidden_Layer_Sizes_Neurons() {
		return (EAttribute) hidden_Layer_SizesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoting_Classifier() {
		return voting_ClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoting_Classifier_Voting() {
		return (EAttribute) voting_ClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVoting_Classifier_Classification() {
		return (EReference) voting_ClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnsembles() {
		return ensemblesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRandom_Forest() {
		return random_ForestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRandom_Forest_Rf_argumans() {
		return (EReference) random_ForestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClustering() {
		return clusteringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClustering_Library() {
		return (EAttribute) clusteringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getK_Medians() {
		return k_MediansEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getK_Means() {
		return k_MeansEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameters() {
		return parametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameters_K() {
		return (EAttribute) parametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameters_Max_iter() {
		return (EAttribute) parametersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegression() {
		return regressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogistic_Regression() {
		return logistic_RegressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRF_Argumans() {
		return rF_ArgumansEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getN_Estimators_RF() {
		return n_Estimators_RFEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getN_Estimators_RF_N_estimators() {
		return (EAttribute) n_Estimators_RFEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCriterion_RF() {
		return criterion_RFEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCriterion_RF_Criterion() {
		return (EAttribute) criterion_RFEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRandom_State_RF() {
		return random_State_RFEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRandom_State_RF_Random_state() {
		return (EAttribute) random_State_RFEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameters_DBOP() {
		return parameters_DBOPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameters_DBOP_Eps() {
		return (EAttribute) parameters_DBOPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameters_DBOP_Min_samples() {
		return (EAttribute) parameters_DBOPEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDBSCAN() {
		return dbscanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBSCAN_P() {
		return (EAttribute) dbscanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMLP_Argumans() {
		return mlP_ArgumansEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMax_Iter_MLP() {
		return max_Iter_MLPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMax_Iter_MLP_Max_iter() {
		return (EAttribute) max_Iter_MLPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRandom_State_MLP() {
		return random_State_MLPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRandom_State_MLP_Random_state() {
		return (EAttribute) random_State_MLPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivation_MLP() {
		return activation_MLPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivation_MLP_Activation() {
		return (EAttribute) activation_MLPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlpha_MLP() {
		return alpha_MLPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlpha_MLP_Alpha() {
		return (EAttribute) alpha_MLPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlots() {
		return plotsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScatter() {
		return scatterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCluster_Evaluation() {
		return cluster_EvaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCluster_Evaluation_Scatter() {
		return (EReference) cluster_EvaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCluster_Evaluation_Cluster_sizes() {
		return (EAttribute) cluster_EvaluationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCluster_Evaluation_Cluster_centers_features() {
		return (EAttribute) cluster_EvaluationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCluster_Evaluation_Cluster_centers_standard_deviation() {
		return (EAttribute) cluster_EvaluationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCluster_Evaluation_Cluster_centers() {
		return (EAttribute) cluster_EvaluationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOPtics() {
		return oPticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreprocess() {
		return preprocessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreprocess_Regular() {
		return (EReference) preprocessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreprocess_Save_file() {
		return (EAttribute) preprocessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreprocess_Print_data() {
		return (EAttribute) preprocessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuto_Prep() {
		return auto_PrepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuto_Prep_Simple_Imputer() {
		return (EAttribute) auto_PrepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuto_Prep_KNN_Imputer() {
		return (EAttribute) auto_PrepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuto_Prep_Scaling() {
		return (EAttribute) auto_PrepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuto_Prep_Encoding() {
		return (EAttribute) auto_PrepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuto_Prep_Duplicates() {
		return (EAttribute) auto_PrepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuto_Prep_Trasformation() {
		return (EAttribute) auto_PrepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuto_Prep_Dime_Reduct() {
		return (EAttribute) auto_PrepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuto_Prep_Date_to_Int() {
		return (EAttribute) auto_PrepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuto_Prep_Drop() {
		return (EAttribute) auto_PrepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuto_Prep_Miss_id() {
		return (EAttribute) auto_PrepEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData_Understanding() {
		return data_UnderstandingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatistics() {
		return statisticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistics_Type() {
		return (EAttribute) statisticsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistics_Missing() {
		return (EAttribute) statisticsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistics_Min() {
		return (EAttribute) statisticsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistics_Max() {
		return (EAttribute) statisticsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistics_Average() {
		return (EAttribute) statisticsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatistics_Standard_devision() {
		return (EAttribute) statisticsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualization() {
		return visualizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisualization_Data_und_plots() {
		return (EReference) visualizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrelation() {
		return correlationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCorrelation_Width() {
		return (EAttribute) correlationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCorrelation_Height() {
		return (EAttribute) correlationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCorrelation_Table() {
		return (EAttribute) correlationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCorrelation_Matrix() {
		return (EAttribute) correlationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandard_Deviation() {
		return standard_DeviationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBar() {
		return barEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinear_Regression() {
		return linear_RegressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThing() {
		return thingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThing_Protocolbinding() {
		return (EReference) thingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThing_Property() {
		return (EReference) thingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThing_Action() {
		return (EReference) thingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThing_Event() {
		return (EReference) thingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThing_Id() {
		return (EAttribute) thingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThing_Title() {
		return (EAttribute) thingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThing_Description() {
		return (EAttribute) thingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThing_BaseURI() {
		return (EAttribute) thingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolBinding() {
		return protocolBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolBinding_Protocol() {
		return (EAttribute) protocolBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolBinding_Endpoint() {
		return (EAttribute) protocolBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Datasource() {
		return (EReference) propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Type() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_ReadOnly() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_WriteOnly() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Observable() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Name() {
		return (EAttribute) actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Input() {
		return (EAttribute) actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Output() {
		return (EAttribute) actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Description() {
		return (EAttribute) actionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Analysystriger() {
		return (EReference) eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Name() {
		return (EAttribute) eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Data() {
		return (EAttribute) eventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Subscription() {
		return (EAttribute) eventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSource() {
		return dataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSource_Name() {
		return (EAttribute) dataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSource_Type() {
		return (EAttribute) dataSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSource_SourceURI() {
		return (EAttribute) dataSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSource_Format() {
		return (EAttribute) dataSourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisOutput() {
		return analysisOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisOutput_Action() {
		return (EReference) analysisOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysisOutput_ResultValue() {
		return (EAttribute) analysisOutputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysisOutput_ResultType() {
		return (EAttribute) analysisOutputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysisOutput_Timestamp() {
		return (EAttribute) analysisOutputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysysTriger() {
		return analysysTrigerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysysTriger_TriggerType() {
		return (EAttribute) analysysTrigerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysysTriger_Condition() {
		return (EAttribute) analysysTrigerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysysTriger_Schedule() {
		return (EAttribute) analysysTrigerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationProtocol() {
		return communicationProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationProtocol_Buffer() {
		return (EReference) communicationProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationProtocol_Mqtt() {
		return (EReference) communicationProtocolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationProtocol_Devices() {
		return (EReference) communicationProtocolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuffer() {
		return bufferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMQTT() {
		return mqttEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMQTT_Topic() {
		return (EReference) mqttEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMQTT_MQTT_BROKER() {
		return (EAttribute) mqttEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMQTT_MQTT_PORT() {
		return (EAttribute) mqttEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevices() {
		return devicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevices_REQUIRED_DEVICES() {
		return (EAttribute) devicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopic() {
		return topicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopic_MQTT_CONTROL_TOPIC() {
		return (EAttribute) topicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopic_MQTT_SENSOR_TOPIC() {
		return (EAttribute) topicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnlineModelManager() {
		return onlineModelManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnlineModelManager_Random_state() {
		return (EAttribute) onlineModelManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGDClassifier() {
		return sgdClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassiveAggressiveClassifier() {
		return passiveAggressiveClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerceptron() {
		return perceptronEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLgSGDClassifier() {
		return lgSGDClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSVLG() {
		return svlgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSVLG_Learning_rate() {
		return (EAttribute) svlgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnlinePreprocess() {
		return onlinePreprocessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature_Engineering() {
		return feature_EngineeringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureDiffs() {
		return featureDiffsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolynomial() {
		return polynomialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMin_Max() {
		return min_MaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnum_CSV_Sep() {
		return enum_CSV_SepEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStrategy_Simple_Imputer() {
		return strategy_Simple_ImputerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOneHot_Cat_Arg() {
		return oneHot_Cat_ArgEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOneHot_Drop_Arg() {
		return oneHot_Drop_ArgEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOneHot_HandleUn_Arg() {
		return oneHot_HandleUn_ArgEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDup_Arg_Keep() {
		return dup_Arg_KeepEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSVM_Kernel_Enum() {
		return svM_Kernel_EnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNeural_Libraries() {
		return neural_LibrariesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNeural_Network_Activation() {
		return neural_Network_ActivationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getvoting_pred() {
		return voting_predEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRandom_Forest_Criterion_Enum() {
		return random_Forest_Criterion_EnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLibrary_Clustering() {
		return library_ClusteringEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMetric_DBSCAN() {
		return metric_DBSCANEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttribiutes_Type() {
		return attribiutes_TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKNN_Imputer_Weights() {
		return knN_Imputer_WeightsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTrigerEnum() {
		return trigerEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProtocolBindingEnum() {
		return protocolBindingEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLEARNING_RATE() {
		return learninG_RATEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MLmodelFactory getMLmodelFactory() {
		return (MLmodelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		rootEClass = createEClass(ROOT);
		createEAttribute(rootEClass, ROOT__NAME);
		createEReference(rootEClass, ROOT__PROCESS);
		createEReference(rootEClass, ROOT__THING);

		processEClass = createEClass(PROCESS);
		createEAttribute(processEClass, PROCESS__FILE_PATH);
		createEReference(processEClass, PROCESS__CYCLE);
		createEReference(processEClass, PROCESS__DATA_UNDERSTANDING);
		createEReference(processEClass, PROCESS__ANALYSYSTRIGER);

		cycleEClass = createEClass(CYCLE);
		createEReference(cycleEClass, CYCLE__AFTER);
		createEReference(cycleEClass, CYCLE__BEFORE);

		import_DataEClass = createEClass(IMPORT_DATA);
		createEReference(import_DataEClass, IMPORT_DATA__ROLE);

		csvEClass = createEClass(CSV);
		createEReference(csvEClass, CSV__CSV_ARGUMANS);

		csV_ArgumansEClass = createEClass(CSV_ARGUMANS);

		sepEClass = createEClass(SEP);
		createEAttribute(sepEClass, SEP__DEFAULT_VALUE_SEP);
		createEAttribute(sepEClass, SEP__MANUAL_SEP);
		createEAttribute(sepEClass, SEP__DEFINE);

		nrowsEClass = createEClass(NROWS);
		createEAttribute(nrowsEClass, NROWS__DEFAULT_VALUE_NROWS);

		set_RoleEClass = createEClass(SET_ROLE);
		createEAttribute(set_RoleEClass, SET_ROLE__NAME);
		createEAttribute(set_RoleEClass, SET_ROLE__TYPE);

		idEClass = createEClass(ID);

		targetEClass = createEClass(TARGET);

		regularEClass = createEClass(REGULAR);

		excelEClass = createEClass(EXCEL);
		createEReference(excelEClass, EXCEL__EXCEL_ARGUMENTS);

		excel_ArgumansEClass = createEClass(EXCEL_ARGUMANS);

		header_ExEClass = createEClass(HEADER_EX);
		createEAttribute(header_ExEClass, HEADER_EX__DEFAULD_VALUE_HEAD_EX);

		simple_ImputerEClass = createEClass(SIMPLE_IMPUTER);
		createEReference(simple_ImputerEClass, SIMPLE_IMPUTER__SIMPLE_IMPUTER_ARGUMENTS);

		simple_Imputer_ArgumentsEClass = createEClass(SIMPLE_IMPUTER_ARGUMENTS);

		missing_ValuesEClass = createEClass(MISSING_VALUES);
		createEAttribute(missing_ValuesEClass, MISSING_VALUES__DEFAULT_VALUE_SI_MISS);

		strategyEClass = createEClass(STRATEGY);
		createEAttribute(strategyEClass, STRATEGY__DEFAULT_VALUE_SIM_STR);

		fill_ValueEClass = createEClass(FILL_VALUE);
		createEAttribute(fill_ValueEClass, FILL_VALUE__DEFAULT_VALUE_SIM_FILL);

		knN_ImputerEClass = createEClass(KNN_IMPUTER);
		createEReference(knN_ImputerEClass, KNN_IMPUTER__KNN_ARGUMANS);

		knN_ArgumansEClass = createEClass(KNN_ARGUMANS);

		n_NeighborsEClass = createEClass(NNEIGHBORS);
		createEAttribute(n_NeighborsEClass, NNEIGHBORS__NNEIGHBORS);

		metricEClass = createEClass(METRIC);

		weightsEClass = createEClass(WEIGHTS);
		createEAttribute(weightsEClass, WEIGHTS__WEIGHTS);

		classificationEClass = createEClass(CLASSIFICATION);

		knnEClass = createEClass(KNN);
		createEAttribute(knnEClass, KNN__K);

		evaluation_MethodsEClass = createEClass(EVALUATION_METHODS);
		createEAttribute(evaluation_MethodsEClass, EVALUATION_METHODS__PRECISION);
		createEAttribute(evaluation_MethodsEClass, EVALUATION_METHODS__ACCURACY);
		createEAttribute(evaluation_MethodsEClass, EVALUATION_METHODS__RECALL);
		createEAttribute(evaluation_MethodsEClass, EVALUATION_METHODS__F1_SCORE);

		cross_ValidationEClass = createEClass(CROSS_VALIDATION);
		createEAttribute(cross_ValidationEClass, CROSS_VALIDATION__NUMBER_OF_FOLDS);
		createEReference(cross_ValidationEClass, CROSS_VALIDATION__PLOTS);

		headCSVEClass = createEClass(HEAD_CSV);
		createEAttribute(headCSVEClass, HEAD_CSV__DEFAULT_HEADER);

		sheet_Na_ExcelEClass = createEClass(SHEET_NA_EXCEL);
		createEAttribute(sheet_Na_ExcelEClass, SHEET_NA_EXCEL__DEFAULT_VAL_SHEET);

		scalingEClass = createEClass(SCALING);

		robust_ScalingEClass = createEClass(ROBUST_SCALING);

		standardizationEClass = createEClass(STANDARDIZATION);

		normalizationEClass = createEClass(NORMALIZATION);

		encodingEClass = createEClass(ENCODING);

		oneHotEClass = createEClass(ONE_HOT);
		createEReference(oneHotEClass, ONE_HOT__ONEHOT_ARGUMANS);

		oneHot_ArgumansEClass = createEClass(ONE_HOT_ARGUMANS);

		dropEClass = createEClass(DROP);
		createEAttribute(dropEClass, DROP__DEFAULT_VALUE_DROP);

		categoriesEClass = createEClass(CATEGORIES);
		createEAttribute(categoriesEClass, CATEGORIES__DEFAULT_VALUE_CAT);

		sparseEClass = createEClass(SPARSE);
		createEAttribute(sparseEClass, SPARSE__DEFAULT_VALUE_SPARSE);

		handle_UnkEClass = createEClass(HANDLE_UNK);
		createEAttribute(handle_UnkEClass, HANDLE_UNK__DEFAULT_VALUE_HANDLE);

		duplicatesEClass = createEClass(DUPLICATES);
		createEReference(duplicatesEClass, DUPLICATES__DUPLICATES_ARGUMANS);

		keepEClass = createEClass(KEEP);
		createEAttribute(keepEClass, KEEP__DUP_KEEP);

		duplicates_ArgumansEClass = createEClass(DUPLICATES_ARGUMANS);

		trasformationEClass = createEClass(TRASFORMATION);

		date_to_IntEClass = createEClass(DATE_TO_INT);
		createEReference(date_to_IntEClass, DATE_TO_INT__DATE_COMP);

		date_CompEClass = createEClass(DATE_COMP);

		yearEClass = createEClass(YEAR);

		monthEClass = createEClass(MONTH);

		dayEClass = createEClass(DAY);

		dime_ReductEClass = createEClass(DIME_REDUCT);

		pcaEClass = createEClass(PCA);
		createEReference(pcaEClass, PCA__PCA_ARGUMANS);

		pcA_ArgumansEClass = createEClass(PCA_ARGUMANS);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__COMPONENT_VALUE);

		varienceEClass = createEClass(VARIENCE);
		createEAttribute(varienceEClass, VARIENCE__VARIENCE_VALUE);

		svmEClass = createEClass(SVM);
		createEAttribute(svmEClass, SVM__C);
		createEAttribute(svmEClass, SVM__KERNEL);

		neural_NetworksEClass = createEClass(NEURAL_NETWORKS);
		createEAttribute(neural_NetworksEClass, NEURAL_NETWORKS__LIBRARY);

		mlpEClass = createEClass(MLP);
		createEReference(mlpEClass, MLP__HIDDEN_LAYER_SIZES);
		createEReference(mlpEClass, MLP__MLP_ARGUMANS);

		hidden_Layer_SizesEClass = createEClass(HIDDEN_LAYER_SIZES);
		createEAttribute(hidden_Layer_SizesEClass, HIDDEN_LAYER_SIZES__NEURONS);

		voting_ClassifierEClass = createEClass(VOTING_CLASSIFIER);
		createEAttribute(voting_ClassifierEClass, VOTING_CLASSIFIER__VOTING);
		createEReference(voting_ClassifierEClass, VOTING_CLASSIFIER__CLASSIFICATION);

		ensemblesEClass = createEClass(ENSEMBLES);

		random_ForestEClass = createEClass(RANDOM_FOREST);
		createEReference(random_ForestEClass, RANDOM_FOREST__RF_ARGUMANS);

		clusteringEClass = createEClass(CLUSTERING);
		createEAttribute(clusteringEClass, CLUSTERING__LIBRARY);

		k_MediansEClass = createEClass(KMEDIANS);

		k_MeansEClass = createEClass(KMEANS);

		parametersEClass = createEClass(PARAMETERS);
		createEAttribute(parametersEClass, PARAMETERS__K);
		createEAttribute(parametersEClass, PARAMETERS__MAX_ITER);

		regressionEClass = createEClass(REGRESSION);

		logistic_RegressionEClass = createEClass(LOGISTIC_REGRESSION);

		rF_ArgumansEClass = createEClass(RF_ARGUMANS);

		n_Estimators_RFEClass = createEClass(NESTIMATORS_RF);
		createEAttribute(n_Estimators_RFEClass, NESTIMATORS_RF__NESTIMATORS);

		criterion_RFEClass = createEClass(CRITERION_RF);
		createEAttribute(criterion_RFEClass, CRITERION_RF__CRITERION);

		random_State_RFEClass = createEClass(RANDOM_STATE_RF);
		createEAttribute(random_State_RFEClass, RANDOM_STATE_RF__RANDOM_STATE);

		parameters_DBOPEClass = createEClass(PARAMETERS_DBOP);
		createEAttribute(parameters_DBOPEClass, PARAMETERS_DBOP__EPS);
		createEAttribute(parameters_DBOPEClass, PARAMETERS_DBOP__MIN_SAMPLES);

		dbscanEClass = createEClass(DBSCAN);
		createEAttribute(dbscanEClass, DBSCAN__P);

		mlP_ArgumansEClass = createEClass(MLP_ARGUMANS);

		max_Iter_MLPEClass = createEClass(MAX_ITER_MLP);
		createEAttribute(max_Iter_MLPEClass, MAX_ITER_MLP__MAX_ITER);

		random_State_MLPEClass = createEClass(RANDOM_STATE_MLP);
		createEAttribute(random_State_MLPEClass, RANDOM_STATE_MLP__RANDOM_STATE);

		activation_MLPEClass = createEClass(ACTIVATION_MLP);
		createEAttribute(activation_MLPEClass, ACTIVATION_MLP__ACTIVATION);

		alpha_MLPEClass = createEClass(ALPHA_MLP);
		createEAttribute(alpha_MLPEClass, ALPHA_MLP__ALPHA);

		plotsEClass = createEClass(PLOTS);

		scatterEClass = createEClass(SCATTER);

		cluster_EvaluationEClass = createEClass(CLUSTER_EVALUATION);
		createEReference(cluster_EvaluationEClass, CLUSTER_EVALUATION__SCATTER);
		createEAttribute(cluster_EvaluationEClass, CLUSTER_EVALUATION__CLUSTER_SIZES);
		createEAttribute(cluster_EvaluationEClass, CLUSTER_EVALUATION__CLUSTER_CENTERS_FEATURES);
		createEAttribute(cluster_EvaluationEClass, CLUSTER_EVALUATION__CLUSTER_CENTERS_STANDARD_DEVIATION);
		createEAttribute(cluster_EvaluationEClass, CLUSTER_EVALUATION__CLUSTER_CENTERS);

		oPticsEClass = createEClass(OPTICS);

		preprocessEClass = createEClass(PREPROCESS);
		createEReference(preprocessEClass, PREPROCESS__REGULAR);
		createEAttribute(preprocessEClass, PREPROCESS__SAVE_FILE);
		createEAttribute(preprocessEClass, PREPROCESS__PRINT_DATA);

		auto_PrepEClass = createEClass(AUTO_PREP);
		createEAttribute(auto_PrepEClass, AUTO_PREP__SIMPLE_IMPUTER);
		createEAttribute(auto_PrepEClass, AUTO_PREP__KNN_IMPUTER);
		createEAttribute(auto_PrepEClass, AUTO_PREP__SCALING);
		createEAttribute(auto_PrepEClass, AUTO_PREP__ENCODING);
		createEAttribute(auto_PrepEClass, AUTO_PREP__DUPLICATES);
		createEAttribute(auto_PrepEClass, AUTO_PREP__TRASFORMATION);
		createEAttribute(auto_PrepEClass, AUTO_PREP__DIME_REDUCT);
		createEAttribute(auto_PrepEClass, AUTO_PREP__DATE_TO_INT);
		createEAttribute(auto_PrepEClass, AUTO_PREP__DROP);
		createEAttribute(auto_PrepEClass, AUTO_PREP__MISS_ID);

		data_UnderstandingEClass = createEClass(DATA_UNDERSTANDING);

		statisticsEClass = createEClass(STATISTICS);
		createEAttribute(statisticsEClass, STATISTICS__TYPE);
		createEAttribute(statisticsEClass, STATISTICS__MISSING);
		createEAttribute(statisticsEClass, STATISTICS__MIN);
		createEAttribute(statisticsEClass, STATISTICS__MAX);
		createEAttribute(statisticsEClass, STATISTICS__AVERAGE);
		createEAttribute(statisticsEClass, STATISTICS__STANDARD_DEVISION);

		visualizationEClass = createEClass(VISUALIZATION);
		createEReference(visualizationEClass, VISUALIZATION__DATA_UND_PLOTS);

		correlationEClass = createEClass(CORRELATION);
		createEAttribute(correlationEClass, CORRELATION__WIDTH);
		createEAttribute(correlationEClass, CORRELATION__HEIGHT);
		createEAttribute(correlationEClass, CORRELATION__TABLE);
		createEAttribute(correlationEClass, CORRELATION__MATRIX);

		standard_DeviationEClass = createEClass(STANDARD_DEVIATION);

		barEClass = createEClass(BAR);

		linear_RegressionEClass = createEClass(LINEAR_REGRESSION);

		thingEClass = createEClass(THING);
		createEReference(thingEClass, THING__PROTOCOLBINDING);
		createEReference(thingEClass, THING__PROPERTY);
		createEReference(thingEClass, THING__ACTION);
		createEReference(thingEClass, THING__EVENT);
		createEAttribute(thingEClass, THING__ID);
		createEAttribute(thingEClass, THING__TITLE);
		createEAttribute(thingEClass, THING__DESCRIPTION);
		createEAttribute(thingEClass, THING__BASE_URI);

		protocolBindingEClass = createEClass(PROTOCOL_BINDING);
		createEAttribute(protocolBindingEClass, PROTOCOL_BINDING__PROTOCOL);
		createEAttribute(protocolBindingEClass, PROTOCOL_BINDING__ENDPOINT);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__DATASOURCE);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__TYPE);
		createEAttribute(propertyEClass, PROPERTY__READ_ONLY);
		createEAttribute(propertyEClass, PROPERTY__WRITE_ONLY);
		createEAttribute(propertyEClass, PROPERTY__OBSERVABLE);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__NAME);
		createEAttribute(actionEClass, ACTION__INPUT);
		createEAttribute(actionEClass, ACTION__OUTPUT);
		createEAttribute(actionEClass, ACTION__DESCRIPTION);

		eventEClass = createEClass(EVENT);
		createEReference(eventEClass, EVENT__ANALYSYSTRIGER);
		createEAttribute(eventEClass, EVENT__NAME);
		createEAttribute(eventEClass, EVENT__DATA);
		createEAttribute(eventEClass, EVENT__SUBSCRIPTION);

		dataSourceEClass = createEClass(DATA_SOURCE);
		createEAttribute(dataSourceEClass, DATA_SOURCE__NAME);
		createEAttribute(dataSourceEClass, DATA_SOURCE__TYPE);
		createEAttribute(dataSourceEClass, DATA_SOURCE__SOURCE_URI);
		createEAttribute(dataSourceEClass, DATA_SOURCE__FORMAT);

		analysisOutputEClass = createEClass(ANALYSIS_OUTPUT);
		createEReference(analysisOutputEClass, ANALYSIS_OUTPUT__ACTION);
		createEAttribute(analysisOutputEClass, ANALYSIS_OUTPUT__RESULT_VALUE);
		createEAttribute(analysisOutputEClass, ANALYSIS_OUTPUT__RESULT_TYPE);
		createEAttribute(analysisOutputEClass, ANALYSIS_OUTPUT__TIMESTAMP);

		analysysTrigerEClass = createEClass(ANALYSYS_TRIGER);
		createEAttribute(analysysTrigerEClass, ANALYSYS_TRIGER__TRIGGER_TYPE);
		createEAttribute(analysysTrigerEClass, ANALYSYS_TRIGER__CONDITION);
		createEAttribute(analysysTrigerEClass, ANALYSYS_TRIGER__SCHEDULE);

		communicationProtocolEClass = createEClass(COMMUNICATION_PROTOCOL);
		createEReference(communicationProtocolEClass, COMMUNICATION_PROTOCOL__BUFFER);
		createEReference(communicationProtocolEClass, COMMUNICATION_PROTOCOL__MQTT);
		createEReference(communicationProtocolEClass, COMMUNICATION_PROTOCOL__DEVICES);

		bufferEClass = createEClass(BUFFER);

		mqttEClass = createEClass(MQTT);
		createEReference(mqttEClass, MQTT__TOPIC);
		createEAttribute(mqttEClass, MQTT__MQTT_BROKER);
		createEAttribute(mqttEClass, MQTT__MQTT_PORT);

		devicesEClass = createEClass(DEVICES);
		createEAttribute(devicesEClass, DEVICES__REQUIRED_DEVICES);

		topicEClass = createEClass(TOPIC);
		createEAttribute(topicEClass, TOPIC__MQTT_CONTROL_TOPIC);
		createEAttribute(topicEClass, TOPIC__MQTT_SENSOR_TOPIC);

		onlineModelManagerEClass = createEClass(ONLINE_MODEL_MANAGER);
		createEAttribute(onlineModelManagerEClass, ONLINE_MODEL_MANAGER__RANDOM_STATE);

		sgdClassifierEClass = createEClass(SGD_CLASSIFIER);

		passiveAggressiveClassifierEClass = createEClass(PASSIVE_AGGRESSIVE_CLASSIFIER);

		perceptronEClass = createEClass(PERCEPTRON);

		lgSGDClassifierEClass = createEClass(LG_SGD_CLASSIFIER);

		svlgEClass = createEClass(SVLG);
		createEAttribute(svlgEClass, SVLG__LEARNING_RATE);

		onlinePreprocessEClass = createEClass(ONLINE_PREPROCESS);

		feature_EngineeringEClass = createEClass(FEATURE_ENGINEERING);

		featureDiffsEClass = createEClass(FEATURE_DIFFS);

		polynomialEClass = createEClass(POLYNOMIAL);

		min_MaxEClass = createEClass(MIN_MAX);

		// Create enums
		enum_CSV_SepEEnum = createEEnum(ENUM_CSV_SEP);
		strategy_Simple_ImputerEEnum = createEEnum(STRATEGY_SIMPLE_IMPUTER);
		oneHot_Cat_ArgEEnum = createEEnum(ONE_HOT_CAT_ARG);
		oneHot_Drop_ArgEEnum = createEEnum(ONE_HOT_DROP_ARG);
		oneHot_HandleUn_ArgEEnum = createEEnum(ONE_HOT_HANDLE_UN_ARG);
		dup_Arg_KeepEEnum = createEEnum(DUP_ARG_KEEP);
		svM_Kernel_EnumEEnum = createEEnum(SVM_KERNEL_ENUM);
		neural_LibrariesEEnum = createEEnum(NEURAL_LIBRARIES);
		neural_Network_ActivationEEnum = createEEnum(NEURAL_NETWORK_ACTIVATION);
		voting_predEEnum = createEEnum(VOTING_PRED);
		random_Forest_Criterion_EnumEEnum = createEEnum(RANDOM_FOREST_CRITERION_ENUM);
		library_ClusteringEEnum = createEEnum(LIBRARY_CLUSTERING);
		metric_DBSCANEEnum = createEEnum(METRIC_DBSCAN);
		attribiutes_TypeEEnum = createEEnum(ATTRIBIUTES_TYPE);
		knN_Imputer_WeightsEEnum = createEEnum(KNN_IMPUTER_WEIGHTS);
		trigerEnumEEnum = createEEnum(TRIGER_ENUM);
		protocolBindingEnumEEnum = createEEnum(PROTOCOL_BINDING_ENUM);
		learninG_RATEEEnum = createEEnum(LEARNING_RATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		import_DataEClass.getESuperTypes().add(this.getPreprocess());
		csvEClass.getESuperTypes().add(this.getImport_Data());
		sepEClass.getESuperTypes().add(this.getCSV_Argumans());
		nrowsEClass.getESuperTypes().add(this.getCSV_Argumans());
		idEClass.getESuperTypes().add(this.getSet_Role());
		targetEClass.getESuperTypes().add(this.getSet_Role());
		regularEClass.getESuperTypes().add(this.getSet_Role());
		excelEClass.getESuperTypes().add(this.getImport_Data());
		header_ExEClass.getESuperTypes().add(this.getExcel_Argumans());
		simple_ImputerEClass.getESuperTypes().add(this.getPreprocess());
		missing_ValuesEClass.getESuperTypes().add(this.getSimple_Imputer_Arguments());
		strategyEClass.getESuperTypes().add(this.getSimple_Imputer_Arguments());
		fill_ValueEClass.getESuperTypes().add(this.getSimple_Imputer_Arguments());
		knN_ImputerEClass.getESuperTypes().add(this.getPreprocess());
		n_NeighborsEClass.getESuperTypes().add(this.getKNN_Argumans());
		metricEClass.getESuperTypes().add(this.getKNN_Argumans());
		weightsEClass.getESuperTypes().add(this.getKNN_Argumans());
		classificationEClass.getESuperTypes().add(this.getCycle());
		knnEClass.getESuperTypes().add(this.getClassification());
		evaluation_MethodsEClass.getESuperTypes().add(this.getCycle());
		cross_ValidationEClass.getESuperTypes().add(this.getEvaluation_Methods());
		headCSVEClass.getESuperTypes().add(this.getCSV_Argumans());
		sheet_Na_ExcelEClass.getESuperTypes().add(this.getExcel_Argumans());
		scalingEClass.getESuperTypes().add(this.getPreprocess());
		scalingEClass.getESuperTypes().add(this.getOnlinePreprocess());
		robust_ScalingEClass.getESuperTypes().add(this.getScaling());
		standardizationEClass.getESuperTypes().add(this.getScaling());
		normalizationEClass.getESuperTypes().add(this.getScaling());
		encodingEClass.getESuperTypes().add(this.getPreprocess());
		oneHotEClass.getESuperTypes().add(this.getEncoding());
		dropEClass.getESuperTypes().add(this.getOneHot_Argumans());
		categoriesEClass.getESuperTypes().add(this.getOneHot_Argumans());
		sparseEClass.getESuperTypes().add(this.getOneHot_Argumans());
		handle_UnkEClass.getESuperTypes().add(this.getOneHot_Argumans());
		duplicatesEClass.getESuperTypes().add(this.getPreprocess());
		keepEClass.getESuperTypes().add(this.getDuplicates_Argumans());
		trasformationEClass.getESuperTypes().add(this.getPreprocess());
		date_to_IntEClass.getESuperTypes().add(this.getTrasformation());
		yearEClass.getESuperTypes().add(this.getDate_Comp());
		monthEClass.getESuperTypes().add(this.getDate_Comp());
		dayEClass.getESuperTypes().add(this.getDate_Comp());
		dime_ReductEClass.getESuperTypes().add(this.getPreprocess());
		pcaEClass.getESuperTypes().add(this.getDime_Reduct());
		componentEClass.getESuperTypes().add(this.getPCA_Argumans());
		varienceEClass.getESuperTypes().add(this.getPCA_Argumans());
		svmEClass.getESuperTypes().add(this.getClassification());
		neural_NetworksEClass.getESuperTypes().add(this.getClassification());
		mlpEClass.getESuperTypes().add(this.getNeural_Networks());
		voting_ClassifierEClass.getESuperTypes().add(this.getEnsembles());
		ensemblesEClass.getESuperTypes().add(this.getClassification());
		random_ForestEClass.getESuperTypes().add(this.getEnsembles());
		clusteringEClass.getESuperTypes().add(this.getCycle());
		k_MediansEClass.getESuperTypes().add(this.getParameters());
		k_MeansEClass.getESuperTypes().add(this.getParameters());
		parametersEClass.getESuperTypes().add(this.getClustering());
		regressionEClass.getESuperTypes().add(this.getCycle());
		logistic_RegressionEClass.getESuperTypes().add(this.getRegression());
		n_Estimators_RFEClass.getESuperTypes().add(this.getRF_Argumans());
		criterion_RFEClass.getESuperTypes().add(this.getRF_Argumans());
		random_State_RFEClass.getESuperTypes().add(this.getRF_Argumans());
		parameters_DBOPEClass.getESuperTypes().add(this.getClustering());
		dbscanEClass.getESuperTypes().add(this.getParameters_DBOP());
		max_Iter_MLPEClass.getESuperTypes().add(this.getMLP_Argumans());
		random_State_MLPEClass.getESuperTypes().add(this.getMLP_Argumans());
		activation_MLPEClass.getESuperTypes().add(this.getMLP_Argumans());
		alpha_MLPEClass.getESuperTypes().add(this.getMLP_Argumans());
		scatterEClass.getESuperTypes().add(this.getPlots());
		cluster_EvaluationEClass.getESuperTypes().add(this.getCycle());
		oPticsEClass.getESuperTypes().add(this.getParameters_DBOP());
		preprocessEClass.getESuperTypes().add(this.getCycle());
		auto_PrepEClass.getESuperTypes().add(this.getPreprocess());
		statisticsEClass.getESuperTypes().add(this.getData_Understanding());
		visualizationEClass.getESuperTypes().add(this.getData_Understanding());
		correlationEClass.getESuperTypes().add(this.getData_Understanding());
		standard_DeviationEClass.getESuperTypes().add(this.getData_Understanding());
		barEClass.getESuperTypes().add(this.getPlots());
		linear_RegressionEClass.getESuperTypes().add(this.getRegression());
		dataSourceEClass.getESuperTypes().add(this.getImport_Data());
		analysisOutputEClass.getESuperTypes().add(this.getEvaluation_Methods());
		communicationProtocolEClass.getESuperTypes().add(this.getImport_Data());
		onlineModelManagerEClass.getESuperTypes().add(this.getCycle());
		sgdClassifierEClass.getESuperTypes().add(this.getSVLG());
		passiveAggressiveClassifierEClass.getESuperTypes().add(this.getOnlineModelManager());
		perceptronEClass.getESuperTypes().add(this.getOnlineModelManager());
		lgSGDClassifierEClass.getESuperTypes().add(this.getSVLG());
		svlgEClass.getESuperTypes().add(this.getOnlineModelManager());
		onlinePreprocessEClass.getESuperTypes().add(this.getPreprocess());
		feature_EngineeringEClass.getESuperTypes().add(this.getOnlinePreprocess());
		featureDiffsEClass.getESuperTypes().add(this.getFeature_Engineering());
		polynomialEClass.getESuperTypes().add(this.getFeature_Engineering());
		min_MaxEClass.getESuperTypes().add(this.getScaling());

		// Initialize classes, features, and operations; add parameters
		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoot_Name(), theXMLTypePackage.getString(), "name", "MLModel", 0, 1, Root.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Process(), this.getProcess(), null, "process", null, 0, 1, Root.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRoot_Thing(), this.getThing(), null, "thing", null, 0, -1, Root.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(processEClass, mLmodel.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcess_File_path(), theXMLTypePackage.getString(), "file_path", null, 0, 1,
				mLmodel.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Cycle(), this.getCycle(), null, "cycle", null, 0, -1, mLmodel.Process.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Data_understanding(), this.getData_Understanding(), null, "data_understanding", null,
				0, -1, mLmodel.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Analysystriger(), this.getAnalysysTriger(), null, "analysystriger", null, 0, -1,
				mLmodel.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cycleEClass, Cycle.class, "Cycle", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCycle_After(), this.getCycle(), this.getCycle_Before(), "after", null, 0, 1, Cycle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCycle_Before(), this.getCycle(), this.getCycle_After(), "before", null, 0, 1, Cycle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(import_DataEClass, Import_Data.class, "Import_Data", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImport_Data_Role(), this.getSet_Role(), null, "role", null, 0, -1, Import_Data.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csvEClass, mLmodel.CSV.class, "CSV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSV_Csv_argumans(), this.getCSV_Argumans(), null, "csv_argumans", null, 0, -1,
				mLmodel.CSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csV_ArgumansEClass, CSV_Argumans.class, "CSV_Argumans", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sepEClass, Sep.class, "Sep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSep_Default_value_sep(), this.getEnum_CSV_Sep(), "default_value_sep", null, 0, 1, Sep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSep_Manual_sep(), theXMLTypePackage.getBoolean(), "manual_sep", null, 0, 1, Sep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSep_Define(), theXMLTypePackage.getString(), "define", null, 0, 1, Sep.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nrowsEClass, Nrows.class, "Nrows", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNrows_Default_value_nrows(), theXMLTypePackage.getInt(), "default_value_nrows", null, 0, 1,
				Nrows.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(set_RoleEClass, Set_Role.class, "Set_Role", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSet_Role_Name(), theXMLTypePackage.getString(), "name", "Variable", 0, 1, Set_Role.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSet_Role_Type(), this.getAttribiutes_Type(), "type", null, 0, 1, Set_Role.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idEClass, mLmodel.ID.class, "ID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetEClass, Target.class, "Target", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(regularEClass, Regular.class, "Regular", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(excelEClass, Excel.class, "Excel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExcel_Excel_arguments(), this.getExcel_Argumans(), null, "excel_arguments", null, 0, -1,
				Excel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(excel_ArgumansEClass, Excel_Argumans.class, "Excel_Argumans", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(header_ExEClass, Header_Ex.class, "Header_Ex", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeader_Ex_Defauld_value_head_ex(), theXMLTypePackage.getInt(), "defauld_value_head_ex", "0",
				0, 1, Header_Ex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(simple_ImputerEClass, Simple_Imputer.class, "Simple_Imputer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimple_Imputer_Simple_imputer_arguments(), this.getSimple_Imputer_Arguments(), null,
				"simple_imputer_arguments", null, 0, -1, Simple_Imputer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simple_Imputer_ArgumentsEClass, Simple_Imputer_Arguments.class, "Simple_Imputer_Arguments",
				IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(missing_ValuesEClass, Missing_Values.class, "Missing_Values", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMissing_Values_Default_value_si_miss(), theXMLTypePackage.getString(),
				"default_value_si_miss", null, 0, 1, Missing_Values.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strategyEClass, Strategy.class, "Strategy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStrategy_Default_value_sim_str(), this.getStrategy_Simple_Imputer(), "default_value_sim_str",
				null, 0, 1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fill_ValueEClass, Fill_Value.class, "Fill_Value", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFill_Value_Default_value_sim_fill(), theXMLTypePackage.getString(), "default_value_sim_fill",
				null, 0, 1, Fill_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knN_ImputerEClass, KNN_Imputer.class, "KNN_Imputer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKNN_Imputer_Knn_argumans(), this.getKNN_Argumans(), null, "knn_argumans", null, 0, -1,
				KNN_Imputer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knN_ArgumansEClass, KNN_Argumans.class, "KNN_Argumans", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(n_NeighborsEClass, N_Neighbors.class, "N_Neighbors", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getN_Neighbors_N_neighbors(), theXMLTypePackage.getInt(), "n_neighbors", "5", 0, 1,
				N_Neighbors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(metricEClass, Metric.class, "Metric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(weightsEClass, Weights.class, "Weights", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeights_Weights(), this.getKNN_Imputer_Weights(), "weights", null, 0, 1, Weights.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classificationEClass, Classification.class, "Classification", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(knnEClass, mLmodel.KNN.class, "KNN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKNN_K(), theXMLTypePackage.getInt(), "k", "5", 0, 1, mLmodel.KNN.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluation_MethodsEClass, Evaluation_Methods.class, "Evaluation_Methods", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvaluation_Methods_Precision(), theXMLTypePackage.getBoolean(), "precision", null, 0, 1,
				Evaluation_Methods.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluation_Methods_Accuracy(), theXMLTypePackage.getBoolean(), "accuracy", null, 0, 1,
				Evaluation_Methods.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluation_Methods_Recall(), theXMLTypePackage.getBoolean(), "recall", null, 0, 1,
				Evaluation_Methods.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvaluation_Methods_F1_score(), theXMLTypePackage.getBoolean(), "f1_score", null, 0, 1,
				Evaluation_Methods.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(cross_ValidationEClass, Cross_Validation.class, "Cross_Validation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCross_Validation_Number_of_folds(), theXMLTypePackage.getInt(), "number_of_folds", "5", 0, 1,
				Cross_Validation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCross_Validation_Plots(), this.getPlots(), null, "plots", null, 0, -1, Cross_Validation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headCSVEClass, HeadCSV.class, "HeadCSV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeadCSV_Default_header(), theXMLTypePackage.getInt(), "default_header", "0", 0, 1,
				HeadCSV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(sheet_Na_ExcelEClass, Sheet_Na_Excel.class, "Sheet_Na_Excel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSheet_Na_Excel_Default_val_sheet(), theXMLTypePackage.getInt(), "default_val_sheet", "0", 0,
				1, Sheet_Na_Excel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(scalingEClass, Scaling.class, "Scaling", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(robust_ScalingEClass, Robust_Scaling.class, "Robust_Scaling", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(standardizationEClass, Standardization.class, "Standardization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(normalizationEClass, Normalization.class, "Normalization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(encodingEClass, Encoding.class, "Encoding", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oneHotEClass, OneHot.class, "OneHot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOneHot_Onehot_argumans(), this.getOneHot_Argumans(), null, "onehot_argumans", null, 0, -1,
				OneHot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneHot_ArgumansEClass, OneHot_Argumans.class, "OneHot_Argumans", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dropEClass, Drop.class, "Drop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDrop_Default_value_drop(), this.getOneHot_Drop_Arg(), "default_value_drop", null, 0, 1,
				Drop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(categoriesEClass, Categories.class, "Categories", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategories_Default_value_cat(), this.getOneHot_Cat_Arg(), "default_value_cat", null, 0, 1,
				Categories.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(sparseEClass, Sparse.class, "Sparse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSparse_Default_value_sparse(), theXMLTypePackage.getBoolean(), "default_value_sparse", "true",
				0, 1, Sparse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(handle_UnkEClass, Handle_Unk.class, "Handle_Unk", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHandle_Unk_Default_value_handle(), this.getOneHot_HandleUn_Arg(), "default_value_handle",
				null, 0, 1, Handle_Unk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(duplicatesEClass, Duplicates.class, "Duplicates", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDuplicates_Duplicates_argumans(), this.getDuplicates_Argumans(), null, "duplicates_argumans",
				null, 0, -1, Duplicates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keepEClass, Keep.class, "Keep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeep_Dup_keep(), this.getDup_Arg_Keep(), "dup_keep", null, 0, 1, Keep.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(duplicates_ArgumansEClass, Duplicates_Argumans.class, "Duplicates_Argumans", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trasformationEClass, Trasformation.class, "Trasformation", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(date_to_IntEClass, Date_to_Int.class, "Date_to_Int", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDate_to_Int_Date_comp(), this.getDate_Comp(), null, "date_comp", null, 0, -1,
				Date_to_Int.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(date_CompEClass, Date_Comp.class, "Date_Comp", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(yearEClass, Year.class, "Year", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(monthEClass, Month.class, "Month", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dayEClass, Day.class, "Day", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dime_ReductEClass, Dime_Reduct.class, "Dime_Reduct", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcaEClass, mLmodel.PCA.class, "PCA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCA_Pca_argumans(), this.getPCA_Argumans(), null, "pca_argumans", null, 0, -1,
				mLmodel.PCA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcA_ArgumansEClass, PCA_Argumans.class, "PCA_Argumans", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Component_value(), theXMLTypePackage.getInt(), "component_value", "2", 0, 1,
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(varienceEClass, Varience.class, "Varience", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVarience_Varience_value(), theXMLTypePackage.getFloat(), "varience_value", "0.8", 0, 1,
				Varience.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(svmEClass, mLmodel.SVM.class, "SVM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSVM_C(), theXMLTypePackage.getFloat(), "c", "1.0", 0, 1, mLmodel.SVM.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSVM_Kernel(), this.getSVM_Kernel_Enum(), "kernel", null, 0, 1, mLmodel.SVM.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(neural_NetworksEClass, Neural_Networks.class, "Neural_Networks", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNeural_Networks_Library(), this.getNeural_Libraries(), "library", null, 0, 1,
				Neural_Networks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(mlpEClass, mLmodel.MLP.class, "MLP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMLP_Hidden_layer_sizes(), this.getHidden_Layer_Sizes(), null, "hidden_layer_sizes", null, 1,
				-1, mLmodel.MLP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMLP_Mlp_argumans(), this.getMLP_Argumans(), null, "mlp_argumans", null, 0, -1,
				mLmodel.MLP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hidden_Layer_SizesEClass, Hidden_Layer_Sizes.class, "Hidden_Layer_Sizes", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHidden_Layer_Sizes_Neurons(), theXMLTypePackage.getInt(), "neurons", "100", 0, 1,
				Hidden_Layer_Sizes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(voting_ClassifierEClass, Voting_Classifier.class, "Voting_Classifier", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVoting_Classifier_Voting(), this.getvoting_pred(), "voting", null, 0, 1,
				Voting_Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getVoting_Classifier_Classification(), this.getClassification(), null, "classification", null, 0,
				-1, Voting_Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ensemblesEClass, Ensembles.class, "Ensembles", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(random_ForestEClass, Random_Forest.class, "Random_Forest", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRandom_Forest_Rf_argumans(), this.getRF_Argumans(), null, "rf_argumans", null, 0, -1,
				Random_Forest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clusteringEClass, Clustering.class, "Clustering", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClustering_Library(), this.getLibrary_Clustering(), "library", null, 0, 1, Clustering.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(k_MediansEClass, K_Medians.class, "K_Medians", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(k_MeansEClass, K_Means.class, "K_Means", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parametersEClass, Parameters.class, "Parameters", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameters_K(), theXMLTypePackage.getInt(), "K", "5", 0, 1, Parameters.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameters_Max_iter(), theXMLTypePackage.getInt(), "max_iter", "300", 0, 1, Parameters.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regressionEClass, Regression.class, "Regression", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(logistic_RegressionEClass, Logistic_Regression.class, "Logistic_Regression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rF_ArgumansEClass, RF_Argumans.class, "RF_Argumans", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(n_Estimators_RFEClass, N_Estimators_RF.class, "N_Estimators_RF", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getN_Estimators_RF_N_estimators(), theXMLTypePackage.getInt(), "n_estimators", "100", 0, 1,
				N_Estimators_RF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(criterion_RFEClass, Criterion_RF.class, "Criterion_RF", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCriterion_RF_Criterion(), this.getRandom_Forest_Criterion_Enum(), "criterion", null, 0, 1,
				Criterion_RF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(random_State_RFEClass, Random_State_RF.class, "Random_State_RF", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRandom_State_RF_Random_state(), theXMLTypePackage.getInt(), "random_state", null, 0, 1,
				Random_State_RF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(parameters_DBOPEClass, Parameters_DBOP.class, "Parameters_DBOP", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameters_DBOP_Eps(), theXMLTypePackage.getFloat(), "eps", "0.5", 0, 1,
				Parameters_DBOP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameters_DBOP_Min_samples(), theXMLTypePackage.getInt(), "min_samples", "5", 0, 1,
				Parameters_DBOP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(dbscanEClass, mLmodel.DBSCAN.class, "DBSCAN", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDBSCAN_P(), theXMLTypePackage.getFloat(), "p", null, 0, 1, mLmodel.DBSCAN.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mlP_ArgumansEClass, MLP_Argumans.class, "MLP_Argumans", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(max_Iter_MLPEClass, Max_Iter_MLP.class, "Max_Iter_MLP", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMax_Iter_MLP_Max_iter(), theXMLTypePackage.getInt(), "max_iter", "200", 0, 1,
				Max_Iter_MLP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(random_State_MLPEClass, Random_State_MLP.class, "Random_State_MLP", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRandom_State_MLP_Random_state(), theXMLTypePackage.getInt(), "random_state", null, 0, 1,
				Random_State_MLP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(activation_MLPEClass, Activation_MLP.class, "Activation_MLP", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivation_MLP_Activation(), this.getNeural_Network_Activation(), "activation", null, 0, 1,
				Activation_MLP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(alpha_MLPEClass, Alpha_MLP.class, "Alpha_MLP", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlpha_MLP_Alpha(), theXMLTypePackage.getFloat(), "alpha", "0.0001", 0, 1, Alpha_MLP.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plotsEClass, Plots.class, "Plots", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scatterEClass, Scatter.class, "Scatter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cluster_EvaluationEClass, Cluster_Evaluation.class, "Cluster_Evaluation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCluster_Evaluation_Scatter(), this.getScatter(), null, "scatter", null, 0, 1,
				Cluster_Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCluster_Evaluation_Cluster_sizes(), theXMLTypePackage.getBoolean(), "cluster_sizes", null, 0,
				1, Cluster_Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCluster_Evaluation_Cluster_centers_features(), theXMLTypePackage.getBoolean(),
				"cluster_centers_features", null, 0, 1, Cluster_Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCluster_Evaluation_Cluster_centers_standard_deviation(), theXMLTypePackage.getBoolean(),
				"cluster_centers_standard_deviation", null, 0, 1, Cluster_Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCluster_Evaluation_Cluster_centers(), theXMLTypePackage.getBoolean(), "cluster_centers", null,
				0, 1, Cluster_Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oPticsEClass, OPtics.class, "OPtics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(preprocessEClass, Preprocess.class, "Preprocess", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPreprocess_Regular(), this.getRegular(), null, "regular", null, 0, -1, Preprocess.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreprocess_Save_file(), theXMLTypePackage.getBoolean(), "save_file", null, 0, 1,
				Preprocess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreprocess_Print_data(), theXMLTypePackage.getBoolean(), "print_data", null, 0, 1,
				Preprocess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(auto_PrepEClass, Auto_Prep.class, "Auto_Prep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuto_Prep_Simple_Imputer(), theXMLTypePackage.getBoolean(), "Simple_Imputer", null, 0, 1,
				Auto_Prep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuto_Prep_KNN_Imputer(), theXMLTypePackage.getBoolean(), "KNN_Imputer", null, 0, 1,
				Auto_Prep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuto_Prep_Scaling(), theXMLTypePackage.getBoolean(), "Scaling", null, 0, 1, Auto_Prep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuto_Prep_Encoding(), theXMLTypePackage.getBoolean(), "Encoding", null, 0, 1, Auto_Prep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuto_Prep_Duplicates(), theXMLTypePackage.getBoolean(), "duplicates", null, 0, 1,
				Auto_Prep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuto_Prep_Trasformation(), theXMLTypePackage.getBoolean(), "Trasformation", null, 0, 1,
				Auto_Prep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuto_Prep_Dime_Reduct(), theXMLTypePackage.getBoolean(), "Dime_Reduct", null, 0, 1,
				Auto_Prep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuto_Prep_Date_to_Int(), theXMLTypePackage.getBoolean(), "Date_to_Int", null, 0, 1,
				Auto_Prep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuto_Prep_Drop(), theXMLTypePackage.getBoolean(), "drop", null, 0, 1, Auto_Prep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuto_Prep_Miss_id(), theXMLTypePackage.getString(), "miss_id", null, 0, -1, Auto_Prep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(data_UnderstandingEClass, Data_Understanding.class, "Data_Understanding", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(statisticsEClass, Statistics.class, "Statistics", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatistics_Type(), theXMLTypePackage.getBoolean(), "type", null, 0, 1, Statistics.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistics_Missing(), theXMLTypePackage.getBoolean(), "missing", null, 0, 1, Statistics.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistics_Min(), theXMLTypePackage.getBoolean(), "min", null, 0, 1, Statistics.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistics_Max(), theXMLTypePackage.getBoolean(), "max", null, 0, 1, Statistics.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistics_Average(), theXMLTypePackage.getBoolean(), "average", null, 0, 1, Statistics.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatistics_Standard_devision(), theXMLTypePackage.getBoolean(), "standard_devision", null, 0,
				1, Statistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(visualizationEClass, Visualization.class, "Visualization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVisualization_Data_und_plots(), this.getPlots(), null, "data_und_plots", null, 0, -1,
				Visualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(correlationEClass, Correlation.class, "Correlation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCorrelation_Width(), theXMLTypePackage.getInt(), "width", "800", 0, 1, Correlation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCorrelation_Height(), theXMLTypePackage.getInt(), "height", "800", 0, 1, Correlation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCorrelation_Table(), theXMLTypePackage.getBoolean(), "table", null, 0, 1, Correlation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCorrelation_Matrix(), theXMLTypePackage.getBoolean(), "Matrix", "true", 0, 1,
				Correlation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(standard_DeviationEClass, Standard_Deviation.class, "Standard_Deviation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(barEClass, Bar.class, "Bar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linear_RegressionEClass, Linear_Regression.class, "Linear_Regression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(thingEClass, Thing.class, "Thing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThing_Protocolbinding(), this.getProtocolBinding(), null, "protocolbinding", null, 0, -1,
				Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Property(), this.getProperty(), null, "property", null, 0, -1, Thing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Action(), this.getAction(), null, "action", null, 0, -1, Thing.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getThing_Event(), this.getEvent(), null, "event", null, 0, -1, Thing.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getThing_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, Thing.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThing_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, Thing.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThing_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, Thing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThing_BaseURI(), theXMLTypePackage.getString(), "baseURI", null, 0, 1, Thing.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protocolBindingEClass, ProtocolBinding.class, "ProtocolBinding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProtocolBinding_Protocol(), this.getProtocolBindingEnum(), "protocol", null, 0, 1,
				ProtocolBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtocolBinding_Endpoint(), theXMLTypePackage.getString(), "endpoint", null, 0, 1,
				ProtocolBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_Datasource(), this.getDataSource(), null, "datasource", null, 0, 1, Property.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Property.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, Property.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_ReadOnly(), theXMLTypePackage.getBoolean(), "readOnly", null, 0, 1, Property.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_WriteOnly(), theXMLTypePackage.getBoolean(), "writeOnly", null, 0, 1, Property.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Observable(), theXMLTypePackage.getBoolean(), "observable", null, 0, 1,
				Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Action.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Input(), theXMLTypePackage.getString(), "input", null, 0, 1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Output(), theXMLTypePackage.getString(), "output", null, 0, 1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvent_Analysystriger(), this.getAnalysysTriger(), null, "analysystriger", null, 0, 1,
				Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Event.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Data(), theXMLTypePackage.getString(), "data", null, 0, 1, Event.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Subscription(), theXMLTypePackage.getBoolean(), "subscription", null, 0, 1, Event.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceEClass, DataSource.class, "DataSource", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSource_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, DataSource.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSource_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, DataSource.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSource_SourceURI(), theXMLTypePackage.getString(), "sourceURI", null, 0, 1,
				DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSource_Format(), theXMLTypePackage.getString(), "format", null, 0, 1, DataSource.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analysisOutputEClass, AnalysisOutput.class, "AnalysisOutput", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysisOutput_Action(), this.getAction(), null, "action", null, 0, 1, AnalysisOutput.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysisOutput_ResultValue(), theXMLTypePackage.getString(), "resultValue", null, 0, 1,
				AnalysisOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysisOutput_ResultType(), theXMLTypePackage.getString(), "resultType", null, 0, 1,
				AnalysisOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysisOutput_Timestamp(), theXMLTypePackage.getDateTime(), "timestamp", null, 0, 1,
				AnalysisOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(analysysTrigerEClass, AnalysysTriger.class, "AnalysysTriger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalysysTriger_TriggerType(), this.getTrigerEnum(), "triggerType", null, 0, 1,
				AnalysysTriger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysysTriger_Condition(), theXMLTypePackage.getString(), "condition", null, 0, 1,
				AnalysysTriger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalysysTriger_Schedule(), theXMLTypePackage.getString(), "schedule", null, 0, 1,
				AnalysysTriger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(communicationProtocolEClass, CommunicationProtocol.class, "CommunicationProtocol", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationProtocol_Buffer(), this.getBuffer(), null, "buffer", null, 0, -1,
				CommunicationProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationProtocol_Mqtt(), this.getMQTT(), null, "mqtt", null, 0, -1,
				CommunicationProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationProtocol_Devices(), this.getDevices(), null, "devices", null, 0, -1,
				CommunicationProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bufferEClass, Buffer.class, "Buffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mqttEClass, mLmodel.MQTT.class, "MQTT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMQTT_Topic(), this.getTopic(), null, "topic", null, 0, -1, mLmodel.MQTT.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMQTT_MQTT_BROKER(), theXMLTypePackage.getString(), "MQTT_BROKER", "localhost", 0, 1,
				mLmodel.MQTT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMQTT_MQTT_PORT(), theXMLTypePackage.getInt(), "MQTT_PORT", "1883", 0, 1, mLmodel.MQTT.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(devicesEClass, Devices.class, "Devices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevices_REQUIRED_DEVICES(), theXMLTypePackage.getString(), "REQUIRED_DEVICES", "dev", 0, 1,
				Devices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(topicEClass, Topic.class, "Topic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTopic_MQTT_CONTROL_TOPIC(), theXMLTypePackage.getString(), "MQTT_CONTROL_TOPIC",
				"control/mode", 0, 1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopic_MQTT_SENSOR_TOPIC(), theXMLTypePackage.getString(), "MQTT_SENSOR_TOPIC",
				"sensors/+/value", 0, 1, Topic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onlineModelManagerEClass, OnlineModelManager.class, "OnlineModelManager", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOnlineModelManager_Random_state(), theXMLTypePackage.getInt(), "random_state", "0", 0, 1,
				OnlineModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(sgdClassifierEClass, SGDClassifier.class, "SGDClassifier", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(passiveAggressiveClassifierEClass, PassiveAggressiveClassifier.class, "PassiveAggressiveClassifier",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(perceptronEClass, Perceptron.class, "Perceptron", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(lgSGDClassifierEClass, LgSGDClassifier.class, "LgSGDClassifier", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(svlgEClass, mLmodel.SVLG.class, "SVLG", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSVLG_Learning_rate(), this.getLEARNING_RATE(), "learning_rate", null, 0, 1,
				mLmodel.SVLG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(onlinePreprocessEClass, OnlinePreprocess.class, "OnlinePreprocess", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(feature_EngineeringEClass, Feature_Engineering.class, "Feature_Engineering", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureDiffsEClass, FeatureDiffs.class, "FeatureDiffs", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(polynomialEClass, Polynomial.class, "Polynomial", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(min_MaxEClass, Min_Max.class, "Min_Max", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(enum_CSV_SepEEnum, Enum_CSV_Sep.class, "Enum_CSV_Sep");
		addEEnumLiteral(enum_CSV_SepEEnum, Enum_CSV_Sep.COLON);
		addEEnumLiteral(enum_CSV_SepEEnum, Enum_CSV_Sep.TAB);
		addEEnumLiteral(enum_CSV_SepEEnum, Enum_CSV_Sep.SEMICOLON);
		addEEnumLiteral(enum_CSV_SepEEnum, Enum_CSV_Sep.DOT);
		addEEnumLiteral(enum_CSV_SepEEnum, Enum_CSV_Sep.LITERAL4);

		initEEnum(strategy_Simple_ImputerEEnum, Strategy_Simple_Imputer.class, "Strategy_Simple_Imputer");
		addEEnumLiteral(strategy_Simple_ImputerEEnum, Strategy_Simple_Imputer.MEAN);
		addEEnumLiteral(strategy_Simple_ImputerEEnum, Strategy_Simple_Imputer.MEDIAN);
		addEEnumLiteral(strategy_Simple_ImputerEEnum, Strategy_Simple_Imputer.MOST_FREQUENT);
		addEEnumLiteral(strategy_Simple_ImputerEEnum, Strategy_Simple_Imputer.CONSTANT);

		initEEnum(oneHot_Cat_ArgEEnum, OneHot_Cat_Arg.class, "OneHot_Cat_Arg");
		addEEnumLiteral(oneHot_Cat_ArgEEnum, OneHot_Cat_Arg.AUTO);
		addEEnumLiteral(oneHot_Cat_ArgEEnum, OneHot_Cat_Arg.LIST);

		initEEnum(oneHot_Drop_ArgEEnum, OneHot_Drop_Arg.class, "OneHot_Drop_Arg");
		addEEnumLiteral(oneHot_Drop_ArgEEnum, OneHot_Drop_Arg.FIRST);
		addEEnumLiteral(oneHot_Drop_ArgEEnum, OneHot_Drop_Arg.IF_BINARY);
		addEEnumLiteral(oneHot_Drop_ArgEEnum, OneHot_Drop_Arg.ARRAY);

		initEEnum(oneHot_HandleUn_ArgEEnum, OneHot_HandleUn_Arg.class, "OneHot_HandleUn_Arg");
		addEEnumLiteral(oneHot_HandleUn_ArgEEnum, OneHot_HandleUn_Arg.ERROR);
		addEEnumLiteral(oneHot_HandleUn_ArgEEnum, OneHot_HandleUn_Arg.IGNORE);
		addEEnumLiteral(oneHot_HandleUn_ArgEEnum, OneHot_HandleUn_Arg.INFREQUENT_IF_EXIST);

		initEEnum(dup_Arg_KeepEEnum, Dup_Arg_Keep.class, "Dup_Arg_Keep");
		addEEnumLiteral(dup_Arg_KeepEEnum, Dup_Arg_Keep.FIRST);
		addEEnumLiteral(dup_Arg_KeepEEnum, Dup_Arg_Keep.LAST);
		addEEnumLiteral(dup_Arg_KeepEEnum, Dup_Arg_Keep.FALSE);

		initEEnum(svM_Kernel_EnumEEnum, SVM_Kernel_Enum.class, "SVM_Kernel_Enum");
		addEEnumLiteral(svM_Kernel_EnumEEnum, SVM_Kernel_Enum.LINEAR);
		addEEnumLiteral(svM_Kernel_EnumEEnum, SVM_Kernel_Enum.POLY);
		addEEnumLiteral(svM_Kernel_EnumEEnum, SVM_Kernel_Enum.RBF);
		addEEnumLiteral(svM_Kernel_EnumEEnum, SVM_Kernel_Enum.SIGMOID);
		addEEnumLiteral(svM_Kernel_EnumEEnum, SVM_Kernel_Enum.PRECOMPUTED);

		initEEnum(neural_LibrariesEEnum, Neural_Libraries.class, "Neural_Libraries");
		addEEnumLiteral(neural_LibrariesEEnum, Neural_Libraries.KERAS);
		addEEnumLiteral(neural_LibrariesEEnum, Neural_Libraries.SCIKIT);

		initEEnum(neural_Network_ActivationEEnum, Neural_Network_Activation.class, "Neural_Network_Activation");
		addEEnumLiteral(neural_Network_ActivationEEnum, Neural_Network_Activation.IDENTITY);
		addEEnumLiteral(neural_Network_ActivationEEnum, Neural_Network_Activation.LOGISTIC);
		addEEnumLiteral(neural_Network_ActivationEEnum, Neural_Network_Activation.TANH);
		addEEnumLiteral(neural_Network_ActivationEEnum, Neural_Network_Activation.RELU);

		initEEnum(voting_predEEnum, voting_pred.class, "voting_pred");
		addEEnumLiteral(voting_predEEnum, voting_pred.HARD);
		addEEnumLiteral(voting_predEEnum, voting_pred.SOFT);

		initEEnum(random_Forest_Criterion_EnumEEnum, Random_Forest_Criterion_Enum.class,
				"Random_Forest_Criterion_Enum");
		addEEnumLiteral(random_Forest_Criterion_EnumEEnum, Random_Forest_Criterion_Enum.GINI);
		addEEnumLiteral(random_Forest_Criterion_EnumEEnum, Random_Forest_Criterion_Enum.ENTROPY);
		addEEnumLiteral(random_Forest_Criterion_EnumEEnum, Random_Forest_Criterion_Enum.LOG_LOS);

		initEEnum(library_ClusteringEEnum, Library_Clustering.class, "Library_Clustering");
		addEEnumLiteral(library_ClusteringEEnum, Library_Clustering.SCIKIT);
		addEEnumLiteral(library_ClusteringEEnum, Library_Clustering.PYCLUSTERING);

		initEEnum(metric_DBSCANEEnum, Metric_DBSCAN.class, "Metric_DBSCAN");
		addEEnumLiteral(metric_DBSCANEEnum, Metric_DBSCAN.EUCLIDEAN);
		addEEnumLiteral(metric_DBSCANEEnum, Metric_DBSCAN.COSINE);
		addEEnumLiteral(metric_DBSCANEEnum, Metric_DBSCAN.MANHATTAN);

		initEEnum(attribiutes_TypeEEnum, Attribiutes_Type.class, "Attribiutes_Type");
		addEEnumLiteral(attribiutes_TypeEEnum, Attribiutes_Type.STRING);
		addEEnumLiteral(attribiutes_TypeEEnum, Attribiutes_Type.DATE);
		addEEnumLiteral(attribiutes_TypeEEnum, Attribiutes_Type.BINOMINAL);
		addEEnumLiteral(attribiutes_TypeEEnum, Attribiutes_Type.TIME);
		addEEnumLiteral(attribiutes_TypeEEnum, Attribiutes_Type.INTEGER);
		addEEnumLiteral(attribiutes_TypeEEnum, Attribiutes_Type.FLOAT);
		addEEnumLiteral(attribiutes_TypeEEnum, Attribiutes_Type.CATEGORICAL);

		initEEnum(knN_Imputer_WeightsEEnum, KNN_Imputer_Weights.class, "KNN_Imputer_Weights");
		addEEnumLiteral(knN_Imputer_WeightsEEnum, KNN_Imputer_Weights.UNIFORM);
		addEEnumLiteral(knN_Imputer_WeightsEEnum, KNN_Imputer_Weights.DISTANCE);

		initEEnum(trigerEnumEEnum, TrigerEnum.class, "TrigerEnum");
		addEEnumLiteral(trigerEnumEEnum, TrigerEnum.EVENT);
		addEEnumLiteral(trigerEnumEEnum, TrigerEnum.TIMER);
		addEEnumLiteral(trigerEnumEEnum, TrigerEnum.DATA_UPDATE);

		initEEnum(protocolBindingEnumEEnum, ProtocolBindingEnum.class, "ProtocolBindingEnum");
		addEEnumLiteral(protocolBindingEnumEEnum, ProtocolBindingEnum.HTTP);
		addEEnumLiteral(protocolBindingEnumEEnum, ProtocolBindingEnum.MQTT);
		addEEnumLiteral(protocolBindingEnumEEnum, ProtocolBindingEnum.CO_AP);

		initEEnum(learninG_RATEEEnum, mLmodel.LEARNING_RATE.class, "LEARNING_RATE");
		addEEnumLiteral(learninG_RATEEEnum, mLmodel.LEARNING_RATE.OPTIMAL);
		addEEnumLiteral(learninG_RATEEEnum, mLmodel.LEARNING_RATE.CONSTANT);
		addEEnumLiteral(learninG_RATEEEnum, mLmodel.LEARNING_RATE.INVSCALING);
		addEEnumLiteral(learninG_RATEEEnum, mLmodel.LEARNING_RATE.ADAPTIVE);

		// Create resource
		createResource(eNS_URI);
	}

} //MLmodelPackageImpl