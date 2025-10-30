package mLmodel.impl;

import mLmodel.Action;
import mLmodel.Activation_MLP;
import mLmodel.Alpha_MLP;
import mLmodel.AnalysisOutput;
import mLmodel.AnalysysTriger;
import mLmodel.Attribiutes_Type;
import mLmodel.Auto_Prep;
import mLmodel.Bar;
import mLmodel.CSV;
import mLmodel.Categories;
import mLmodel.Cluster_Evaluation;
import mLmodel.Component;
import mLmodel.Correlation;
import mLmodel.Criterion_RF;
import mLmodel.Cross_Validation;
import mLmodel.DBSCAN;
import mLmodel.DataSource;
import mLmodel.Date_to_Int;
import mLmodel.Day;
import mLmodel.Drop;
import mLmodel.Dup_Arg_Keep;
import mLmodel.Duplicates;
import mLmodel.Enum_CSV_Sep;
import mLmodel.Event;
import mLmodel.Excel;
import mLmodel.Fill_Value;
import mLmodel.Handle_Unk;
import mLmodel.HeadCSV;
import mLmodel.Header_Ex;
import mLmodel.Hidden_Layer_Sizes;
import mLmodel.ID;
import mLmodel.KNN;
import mLmodel.KNN_Imputer;
import mLmodel.KNN_Imputer_Weights;
import mLmodel.K_Means;
import mLmodel.K_Medians;
import mLmodel.Keep;
import mLmodel.Library_Clustering;
import mLmodel.Linear_Regression;
import mLmodel.Logistic_Regression;
import mLmodel.MLP;
import mLmodel.MLmodelFactory;
import mLmodel.MLmodelPackage;
import mLmodel.Max_Iter_MLP;
import mLmodel.Metric;
import mLmodel.Metric_DBSCAN;
import mLmodel.Missing_Values;
import mLmodel.Month;
import mLmodel.N_Estimators_RF;
import mLmodel.N_Neighbors;
import mLmodel.Neural_Libraries;
import mLmodel.Neural_Network_Activation;
import mLmodel.Normalization;
import mLmodel.Nrows;
import mLmodel.OPtics;
import mLmodel.OneHot;
import mLmodel.OneHot_Cat_Arg;
import mLmodel.OneHot_Drop_Arg;
import mLmodel.OneHot_HandleUn_Arg;
import mLmodel.PCA;
import mLmodel.Property;
import mLmodel.ProtocolBinding;
import mLmodel.ProtocolBindingEnum;
import mLmodel.Random_Forest;
import mLmodel.Random_Forest_Criterion_Enum;
import mLmodel.Random_State_MLP;
import mLmodel.Random_State_RF;
import mLmodel.Regular;
import mLmodel.Robust_Scaling;
import mLmodel.Root;
import mLmodel.SVM;
import mLmodel.SVM_Kernel_Enum;
import mLmodel.Scatter;
import mLmodel.Sep;
import mLmodel.Sheet_Na_Excel;
import mLmodel.Simple_Imputer;
import mLmodel.Sparse;
import mLmodel.Standard_Deviation;
import mLmodel.Standardization;
import mLmodel.Statistics;
import mLmodel.Strategy;
import mLmodel.Strategy_Simple_Imputer;
import mLmodel.Target;
import mLmodel.Thing;
import mLmodel.TrigerEnum;
import mLmodel.Varience;
import mLmodel.Visualization;
import mLmodel.Voting_Classifier;
import mLmodel.Weights;
import mLmodel.Year;
import mLmodel.voting_pred;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MLmodelFactoryImpl extends EFactoryImpl implements MLmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MLmodelFactory init() {
		try {
			MLmodelFactory theMLmodelFactory = (MLmodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(MLmodelPackage.eNS_URI);
			if (theMLmodelFactory != null) {
				return theMLmodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MLmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MLmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MLmodelPackage.ROOT:
			return createRoot();
		case MLmodelPackage.PROCESS:
			return createProcess();
		case MLmodelPackage.CSV:
			return createCSV();
		case MLmodelPackage.SEP:
			return createSep();
		case MLmodelPackage.NROWS:
			return createNrows();
		case MLmodelPackage.ID:
			return createID();
		case MLmodelPackage.TARGET:
			return createTarget();
		case MLmodelPackage.REGULAR:
			return createRegular();
		case MLmodelPackage.EXCEL:
			return createExcel();
		case MLmodelPackage.HEADER_EX:
			return createHeader_Ex();
		case MLmodelPackage.SIMPLE_IMPUTER:
			return createSimple_Imputer();
		case MLmodelPackage.MISSING_VALUES:
			return createMissing_Values();
		case MLmodelPackage.STRATEGY:
			return createStrategy();
		case MLmodelPackage.FILL_VALUE:
			return createFill_Value();
		case MLmodelPackage.KNN_IMPUTER:
			return createKNN_Imputer();
		case MLmodelPackage.NNEIGHBORS:
			return createN_Neighbors();
		case MLmodelPackage.METRIC:
			return createMetric();
		case MLmodelPackage.WEIGHTS:
			return createWeights();
		case MLmodelPackage.KNN:
			return createKNN();
		case MLmodelPackage.CROSS_VALIDATION:
			return createCross_Validation();
		case MLmodelPackage.HEAD_CSV:
			return createHeadCSV();
		case MLmodelPackage.SHEET_NA_EXCEL:
			return createSheet_Na_Excel();
		case MLmodelPackage.ROBUST_SCALING:
			return createRobust_Scaling();
		case MLmodelPackage.STANDARDIZATION:
			return createStandardization();
		case MLmodelPackage.NORMALIZATION:
			return createNormalization();
		case MLmodelPackage.ONE_HOT:
			return createOneHot();
		case MLmodelPackage.DROP:
			return createDrop();
		case MLmodelPackage.CATEGORIES:
			return createCategories();
		case MLmodelPackage.SPARSE:
			return createSparse();
		case MLmodelPackage.HANDLE_UNK:
			return createHandle_Unk();
		case MLmodelPackage.DUPLICATES:
			return createDuplicates();
		case MLmodelPackage.KEEP:
			return createKeep();
		case MLmodelPackage.DATE_TO_INT:
			return createDate_to_Int();
		case MLmodelPackage.YEAR:
			return createYear();
		case MLmodelPackage.MONTH:
			return createMonth();
		case MLmodelPackage.DAY:
			return createDay();
		case MLmodelPackage.PCA:
			return createPCA();
		case MLmodelPackage.COMPONENT:
			return createComponent();
		case MLmodelPackage.VARIENCE:
			return createVarience();
		case MLmodelPackage.SVM:
			return createSVM();
		case MLmodelPackage.MLP:
			return createMLP();
		case MLmodelPackage.HIDDEN_LAYER_SIZES:
			return createHidden_Layer_Sizes();
		case MLmodelPackage.VOTING_CLASSIFIER:
			return createVoting_Classifier();
		case MLmodelPackage.RANDOM_FOREST:
			return createRandom_Forest();
		case MLmodelPackage.KMEDIANS:
			return createK_Medians();
		case MLmodelPackage.KMEANS:
			return createK_Means();
		case MLmodelPackage.LOGISTIC_REGRESSION:
			return createLogistic_Regression();
		case MLmodelPackage.NESTIMATORS_RF:
			return createN_Estimators_RF();
		case MLmodelPackage.CRITERION_RF:
			return createCriterion_RF();
		case MLmodelPackage.RANDOM_STATE_RF:
			return createRandom_State_RF();
		case MLmodelPackage.DBSCAN:
			return createDBSCAN();
		case MLmodelPackage.MAX_ITER_MLP:
			return createMax_Iter_MLP();
		case MLmodelPackage.RANDOM_STATE_MLP:
			return createRandom_State_MLP();
		case MLmodelPackage.ACTIVATION_MLP:
			return createActivation_MLP();
		case MLmodelPackage.ALPHA_MLP:
			return createAlpha_MLP();
		case MLmodelPackage.SCATTER:
			return createScatter();
		case MLmodelPackage.CLUSTER_EVALUATION:
			return createCluster_Evaluation();
		case MLmodelPackage.OPTICS:
			return createOPtics();
		case MLmodelPackage.AUTO_PREP:
			return createAuto_Prep();
		case MLmodelPackage.STATISTICS:
			return createStatistics();
		case MLmodelPackage.VISUALIZATION:
			return createVisualization();
		case MLmodelPackage.CORRELATION:
			return createCorrelation();
		case MLmodelPackage.STANDARD_DEVIATION:
			return createStandard_Deviation();
		case MLmodelPackage.BAR:
			return createBar();
		case MLmodelPackage.LINEAR_REGRESSION:
			return createLinear_Regression();
		case MLmodelPackage.THING:
			return createThing();
		case MLmodelPackage.PROTOCOL_BINDING:
			return createProtocolBinding();
		case MLmodelPackage.PROPERTY:
			return createProperty();
		case MLmodelPackage.ACTION:
			return createAction();
		case MLmodelPackage.EVENT:
			return createEvent();
		case MLmodelPackage.DATA_SOURCE:
			return createDataSource();
		case MLmodelPackage.ANALYSIS_OUTPUT:
			return createAnalysisOutput();
		case MLmodelPackage.ANALYSYS_TRIGER:
			return createAnalysysTriger();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case MLmodelPackage.ENUM_CSV_SEP:
			return createEnum_CSV_SepFromString(eDataType, initialValue);
		case MLmodelPackage.STRATEGY_SIMPLE_IMPUTER:
			return createStrategy_Simple_ImputerFromString(eDataType, initialValue);
		case MLmodelPackage.ONE_HOT_CAT_ARG:
			return createOneHot_Cat_ArgFromString(eDataType, initialValue);
		case MLmodelPackage.ONE_HOT_DROP_ARG:
			return createOneHot_Drop_ArgFromString(eDataType, initialValue);
		case MLmodelPackage.ONE_HOT_HANDLE_UN_ARG:
			return createOneHot_HandleUn_ArgFromString(eDataType, initialValue);
		case MLmodelPackage.DUP_ARG_KEEP:
			return createDup_Arg_KeepFromString(eDataType, initialValue);
		case MLmodelPackage.SVM_KERNEL_ENUM:
			return createSVM_Kernel_EnumFromString(eDataType, initialValue);
		case MLmodelPackage.NEURAL_LIBRARIES:
			return createNeural_LibrariesFromString(eDataType, initialValue);
		case MLmodelPackage.NEURAL_NETWORK_ACTIVATION:
			return createNeural_Network_ActivationFromString(eDataType, initialValue);
		case MLmodelPackage.VOTING_PRED:
			return createvoting_predFromString(eDataType, initialValue);
		case MLmodelPackage.RANDOM_FOREST_CRITERION_ENUM:
			return createRandom_Forest_Criterion_EnumFromString(eDataType, initialValue);
		case MLmodelPackage.LIBRARY_CLUSTERING:
			return createLibrary_ClusteringFromString(eDataType, initialValue);
		case MLmodelPackage.METRIC_DBSCAN:
			return createMetric_DBSCANFromString(eDataType, initialValue);
		case MLmodelPackage.ATTRIBIUTES_TYPE:
			return createAttribiutes_TypeFromString(eDataType, initialValue);
		case MLmodelPackage.KNN_IMPUTER_WEIGHTS:
			return createKNN_Imputer_WeightsFromString(eDataType, initialValue);
		case MLmodelPackage.TRIGER_ENUM:
			return createTrigerEnumFromString(eDataType, initialValue);
		case MLmodelPackage.PROTOCOL_BINDING_ENUM:
			return createProtocolBindingEnumFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case MLmodelPackage.ENUM_CSV_SEP:
			return convertEnum_CSV_SepToString(eDataType, instanceValue);
		case MLmodelPackage.STRATEGY_SIMPLE_IMPUTER:
			return convertStrategy_Simple_ImputerToString(eDataType, instanceValue);
		case MLmodelPackage.ONE_HOT_CAT_ARG:
			return convertOneHot_Cat_ArgToString(eDataType, instanceValue);
		case MLmodelPackage.ONE_HOT_DROP_ARG:
			return convertOneHot_Drop_ArgToString(eDataType, instanceValue);
		case MLmodelPackage.ONE_HOT_HANDLE_UN_ARG:
			return convertOneHot_HandleUn_ArgToString(eDataType, instanceValue);
		case MLmodelPackage.DUP_ARG_KEEP:
			return convertDup_Arg_KeepToString(eDataType, instanceValue);
		case MLmodelPackage.SVM_KERNEL_ENUM:
			return convertSVM_Kernel_EnumToString(eDataType, instanceValue);
		case MLmodelPackage.NEURAL_LIBRARIES:
			return convertNeural_LibrariesToString(eDataType, instanceValue);
		case MLmodelPackage.NEURAL_NETWORK_ACTIVATION:
			return convertNeural_Network_ActivationToString(eDataType, instanceValue);
		case MLmodelPackage.VOTING_PRED:
			return convertvoting_predToString(eDataType, instanceValue);
		case MLmodelPackage.RANDOM_FOREST_CRITERION_ENUM:
			return convertRandom_Forest_Criterion_EnumToString(eDataType, instanceValue);
		case MLmodelPackage.LIBRARY_CLUSTERING:
			return convertLibrary_ClusteringToString(eDataType, instanceValue);
		case MLmodelPackage.METRIC_DBSCAN:
			return convertMetric_DBSCANToString(eDataType, instanceValue);
		case MLmodelPackage.ATTRIBIUTES_TYPE:
			return convertAttribiutes_TypeToString(eDataType, instanceValue);
		case MLmodelPackage.KNN_IMPUTER_WEIGHTS:
			return convertKNN_Imputer_WeightsToString(eDataType, instanceValue);
		case MLmodelPackage.TRIGER_ENUM:
			return convertTrigerEnumToString(eDataType, instanceValue);
		case MLmodelPackage.PROTOCOL_BINDING_ENUM:
			return convertProtocolBindingEnumToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public mLmodel.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSV createCSV() {
		CSVImpl csv = new CSVImpl();
		return csv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sep createSep() {
		SepImpl sep = new SepImpl();
		return sep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nrows createNrows() {
		NrowsImpl nrows = new NrowsImpl();
		return nrows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ID createID() {
		IDImpl id = new IDImpl();
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target createTarget() {
		TargetImpl target = new TargetImpl();
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Regular createRegular() {
		RegularImpl regular = new RegularImpl();
		return regular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Excel createExcel() {
		ExcelImpl excel = new ExcelImpl();
		return excel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header_Ex createHeader_Ex() {
		Header_ExImpl header_Ex = new Header_ExImpl();
		return header_Ex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simple_Imputer createSimple_Imputer() {
		Simple_ImputerImpl simple_Imputer = new Simple_ImputerImpl();
		return simple_Imputer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Missing_Values createMissing_Values() {
		Missing_ValuesImpl missing_Values = new Missing_ValuesImpl();
		return missing_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strategy createStrategy() {
		StrategyImpl strategy = new StrategyImpl();
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fill_Value createFill_Value() {
		Fill_ValueImpl fill_Value = new Fill_ValueImpl();
		return fill_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KNN_Imputer createKNN_Imputer() {
		KNN_ImputerImpl knN_Imputer = new KNN_ImputerImpl();
		return knN_Imputer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public N_Neighbors createN_Neighbors() {
		N_NeighborsImpl n_Neighbors = new N_NeighborsImpl();
		return n_Neighbors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric createMetric() {
		MetricImpl metric = new MetricImpl();
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weights createWeights() {
		WeightsImpl weights = new WeightsImpl();
		return weights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KNN createKNN() {
		KNNImpl knn = new KNNImpl();
		return knn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cross_Validation createCross_Validation() {
		Cross_ValidationImpl cross_Validation = new Cross_ValidationImpl();
		return cross_Validation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeadCSV createHeadCSV() {
		HeadCSVImpl headCSV = new HeadCSVImpl();
		return headCSV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sheet_Na_Excel createSheet_Na_Excel() {
		Sheet_Na_ExcelImpl sheet_Na_Excel = new Sheet_Na_ExcelImpl();
		return sheet_Na_Excel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Robust_Scaling createRobust_Scaling() {
		Robust_ScalingImpl robust_Scaling = new Robust_ScalingImpl();
		return robust_Scaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Standardization createStandardization() {
		StandardizationImpl standardization = new StandardizationImpl();
		return standardization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Normalization createNormalization() {
		NormalizationImpl normalization = new NormalizationImpl();
		return normalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneHot createOneHot() {
		OneHotImpl oneHot = new OneHotImpl();
		return oneHot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drop createDrop() {
		DropImpl drop = new DropImpl();
		return drop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Categories createCategories() {
		CategoriesImpl categories = new CategoriesImpl();
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sparse createSparse() {
		SparseImpl sparse = new SparseImpl();
		return sparse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Handle_Unk createHandle_Unk() {
		Handle_UnkImpl handle_Unk = new Handle_UnkImpl();
		return handle_Unk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duplicates createDuplicates() {
		DuplicatesImpl duplicates = new DuplicatesImpl();
		return duplicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keep createKeep() {
		KeepImpl keep = new KeepImpl();
		return keep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date_to_Int createDate_to_Int() {
		Date_to_IntImpl date_to_Int = new Date_to_IntImpl();
		return date_to_Int;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Year createYear() {
		YearImpl year = new YearImpl();
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Month createMonth() {
		MonthImpl month = new MonthImpl();
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Day createDay() {
		DayImpl day = new DayImpl();
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCA createPCA() {
		PCAImpl pca = new PCAImpl();
		return pca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Varience createVarience() {
		VarienceImpl varience = new VarienceImpl();
		return varience;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SVM createSVM() {
		SVMImpl svm = new SVMImpl();
		return svm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MLP createMLP() {
		MLPImpl mlp = new MLPImpl();
		return mlp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hidden_Layer_Sizes createHidden_Layer_Sizes() {
		Hidden_Layer_SizesImpl hidden_Layer_Sizes = new Hidden_Layer_SizesImpl();
		return hidden_Layer_Sizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Voting_Classifier createVoting_Classifier() {
		Voting_ClassifierImpl voting_Classifier = new Voting_ClassifierImpl();
		return voting_Classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Random_Forest createRandom_Forest() {
		Random_ForestImpl random_Forest = new Random_ForestImpl();
		return random_Forest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public K_Medians createK_Medians() {
		K_MediansImpl k_Medians = new K_MediansImpl();
		return k_Medians;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public K_Means createK_Means() {
		K_MeansImpl k_Means = new K_MeansImpl();
		return k_Means;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logistic_Regression createLogistic_Regression() {
		Logistic_RegressionImpl logistic_Regression = new Logistic_RegressionImpl();
		return logistic_Regression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public N_Estimators_RF createN_Estimators_RF() {
		N_Estimators_RFImpl n_Estimators_RF = new N_Estimators_RFImpl();
		return n_Estimators_RF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Criterion_RF createCriterion_RF() {
		Criterion_RFImpl criterion_RF = new Criterion_RFImpl();
		return criterion_RF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Random_State_RF createRandom_State_RF() {
		Random_State_RFImpl random_State_RF = new Random_State_RFImpl();
		return random_State_RF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBSCAN createDBSCAN() {
		DBSCANImpl dbscan = new DBSCANImpl();
		return dbscan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Max_Iter_MLP createMax_Iter_MLP() {
		Max_Iter_MLPImpl max_Iter_MLP = new Max_Iter_MLPImpl();
		return max_Iter_MLP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Random_State_MLP createRandom_State_MLP() {
		Random_State_MLPImpl random_State_MLP = new Random_State_MLPImpl();
		return random_State_MLP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activation_MLP createActivation_MLP() {
		Activation_MLPImpl activation_MLP = new Activation_MLPImpl();
		return activation_MLP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alpha_MLP createAlpha_MLP() {
		Alpha_MLPImpl alpha_MLP = new Alpha_MLPImpl();
		return alpha_MLP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scatter createScatter() {
		ScatterImpl scatter = new ScatterImpl();
		return scatter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster_Evaluation createCluster_Evaluation() {
		Cluster_EvaluationImpl cluster_Evaluation = new Cluster_EvaluationImpl();
		return cluster_Evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPtics createOPtics() {
		OPticsImpl oPtics = new OPticsImpl();
		return oPtics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Auto_Prep createAuto_Prep() {
		Auto_PrepImpl auto_Prep = new Auto_PrepImpl();
		return auto_Prep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statistics createStatistics() {
		StatisticsImpl statistics = new StatisticsImpl();
		return statistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visualization createVisualization() {
		VisualizationImpl visualization = new VisualizationImpl();
		return visualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correlation createCorrelation() {
		CorrelationImpl correlation = new CorrelationImpl();
		return correlation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Standard_Deviation createStandard_Deviation() {
		Standard_DeviationImpl standard_Deviation = new Standard_DeviationImpl();
		return standard_Deviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bar createBar() {
		BarImpl bar = new BarImpl();
		return bar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Linear_Regression createLinear_Regression() {
		Linear_RegressionImpl linear_Regression = new Linear_RegressionImpl();
		return linear_Regression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thing createThing() {
		ThingImpl thing = new ThingImpl();
		return thing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolBinding createProtocolBinding() {
		ProtocolBindingImpl protocolBinding = new ProtocolBindingImpl();
		return protocolBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource createDataSource() {
		DataSourceImpl dataSource = new DataSourceImpl();
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisOutput createAnalysisOutput() {
		AnalysisOutputImpl analysisOutput = new AnalysisOutputImpl();
		return analysisOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysysTriger createAnalysysTriger() {
		AnalysysTrigerImpl analysysTriger = new AnalysysTrigerImpl();
		return analysysTriger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enum_CSV_Sep createEnum_CSV_SepFromString(EDataType eDataType, String initialValue) {
		Enum_CSV_Sep result = Enum_CSV_Sep.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnum_CSV_SepToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strategy_Simple_Imputer createStrategy_Simple_ImputerFromString(EDataType eDataType, String initialValue) {
		Strategy_Simple_Imputer result = Strategy_Simple_Imputer.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStrategy_Simple_ImputerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneHot_Cat_Arg createOneHot_Cat_ArgFromString(EDataType eDataType, String initialValue) {
		OneHot_Cat_Arg result = OneHot_Cat_Arg.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOneHot_Cat_ArgToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneHot_Drop_Arg createOneHot_Drop_ArgFromString(EDataType eDataType, String initialValue) {
		OneHot_Drop_Arg result = OneHot_Drop_Arg.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOneHot_Drop_ArgToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneHot_HandleUn_Arg createOneHot_HandleUn_ArgFromString(EDataType eDataType, String initialValue) {
		OneHot_HandleUn_Arg result = OneHot_HandleUn_Arg.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOneHot_HandleUn_ArgToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dup_Arg_Keep createDup_Arg_KeepFromString(EDataType eDataType, String initialValue) {
		Dup_Arg_Keep result = Dup_Arg_Keep.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDup_Arg_KeepToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SVM_Kernel_Enum createSVM_Kernel_EnumFromString(EDataType eDataType, String initialValue) {
		SVM_Kernel_Enum result = SVM_Kernel_Enum.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSVM_Kernel_EnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Neural_Libraries createNeural_LibrariesFromString(EDataType eDataType, String initialValue) {
		Neural_Libraries result = Neural_Libraries.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNeural_LibrariesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Neural_Network_Activation createNeural_Network_ActivationFromString(EDataType eDataType,
			String initialValue) {
		Neural_Network_Activation result = Neural_Network_Activation.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNeural_Network_ActivationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public voting_pred createvoting_predFromString(EDataType eDataType, String initialValue) {
		voting_pred result = voting_pred.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertvoting_predToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Random_Forest_Criterion_Enum createRandom_Forest_Criterion_EnumFromString(EDataType eDataType,
			String initialValue) {
		Random_Forest_Criterion_Enum result = Random_Forest_Criterion_Enum.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRandom_Forest_Criterion_EnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library_Clustering createLibrary_ClusteringFromString(EDataType eDataType, String initialValue) {
		Library_Clustering result = Library_Clustering.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLibrary_ClusteringToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric_DBSCAN createMetric_DBSCANFromString(EDataType eDataType, String initialValue) {
		Metric_DBSCAN result = Metric_DBSCAN.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetric_DBSCANToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribiutes_Type createAttribiutes_TypeFromString(EDataType eDataType, String initialValue) {
		Attribiutes_Type result = Attribiutes_Type.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttribiutes_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KNN_Imputer_Weights createKNN_Imputer_WeightsFromString(EDataType eDataType, String initialValue) {
		KNN_Imputer_Weights result = KNN_Imputer_Weights.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKNN_Imputer_WeightsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrigerEnum createTrigerEnumFromString(EDataType eDataType, String initialValue) {
		TrigerEnum result = TrigerEnum.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTrigerEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolBindingEnum createProtocolBindingEnumFromString(EDataType eDataType, String initialValue) {
		ProtocolBindingEnum result = ProtocolBindingEnum.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtocolBindingEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MLmodelPackage getMLmodelPackage() {
		return (MLmodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MLmodelPackage getPackage() {
		return MLmodelPackage.eINSTANCE;
	}

} //MLmodelFactoryImpl