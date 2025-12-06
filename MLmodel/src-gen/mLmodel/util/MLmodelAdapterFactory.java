/**
 */
package mLmodel.util;

import mLmodel.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mLmodel.MLmodelPackage
 * @generated
 */
public class MLmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MLmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MLmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MLmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MLmodelSwitch<Adapter> modelSwitch = new MLmodelSwitch<Adapter>() {
		@Override
		public Adapter caseRoot(Root object) {
			return createRootAdapter();
		}

		@Override
		public Adapter caseProcess(mLmodel.Process object) {
			return createProcessAdapter();
		}

		@Override
		public Adapter caseCycle(Cycle object) {
			return createCycleAdapter();
		}

		@Override
		public Adapter caseImport_Data(Import_Data object) {
			return createImport_DataAdapter();
		}

		@Override
		public Adapter caseCSV(CSV object) {
			return createCSVAdapter();
		}

		@Override
		public Adapter caseCSV_Argumans(CSV_Argumans object) {
			return createCSV_ArgumansAdapter();
		}

		@Override
		public Adapter caseSep(Sep object) {
			return createSepAdapter();
		}

		@Override
		public Adapter caseNrows(Nrows object) {
			return createNrowsAdapter();
		}

		@Override
		public Adapter caseSet_Role(Set_Role object) {
			return createSet_RoleAdapter();
		}

		@Override
		public Adapter caseID(ID object) {
			return createIDAdapter();
		}

		@Override
		public Adapter caseTarget(Target object) {
			return createTargetAdapter();
		}

		@Override
		public Adapter caseRegular(Regular object) {
			return createRegularAdapter();
		}

		@Override
		public Adapter caseExcel(Excel object) {
			return createExcelAdapter();
		}

		@Override
		public Adapter caseExcel_Argumans(Excel_Argumans object) {
			return createExcel_ArgumansAdapter();
		}

		@Override
		public Adapter caseHeader_Ex(Header_Ex object) {
			return createHeader_ExAdapter();
		}

		@Override
		public Adapter caseSimple_Imputer(Simple_Imputer object) {
			return createSimple_ImputerAdapter();
		}

		@Override
		public Adapter caseSimple_Imputer_Arguments(Simple_Imputer_Arguments object) {
			return createSimple_Imputer_ArgumentsAdapter();
		}

		@Override
		public Adapter caseMissing_Values(Missing_Values object) {
			return createMissing_ValuesAdapter();
		}

		@Override
		public Adapter caseStrategy(Strategy object) {
			return createStrategyAdapter();
		}

		@Override
		public Adapter caseFill_Value(Fill_Value object) {
			return createFill_ValueAdapter();
		}

		@Override
		public Adapter caseKNN_Imputer(KNN_Imputer object) {
			return createKNN_ImputerAdapter();
		}

		@Override
		public Adapter caseKNN_Argumans(KNN_Argumans object) {
			return createKNN_ArgumansAdapter();
		}

		@Override
		public Adapter caseN_Neighbors(N_Neighbors object) {
			return createN_NeighborsAdapter();
		}

		@Override
		public Adapter caseMetric(Metric object) {
			return createMetricAdapter();
		}

		@Override
		public Adapter caseWeights(Weights object) {
			return createWeightsAdapter();
		}

		@Override
		public Adapter caseClassification(Classification object) {
			return createClassificationAdapter();
		}

		@Override
		public Adapter caseKNN(KNN object) {
			return createKNNAdapter();
		}

		@Override
		public Adapter caseEvaluation_Methods(Evaluation_Methods object) {
			return createEvaluation_MethodsAdapter();
		}

		@Override
		public Adapter caseCross_Validation(Cross_Validation object) {
			return createCross_ValidationAdapter();
		}

		@Override
		public Adapter caseHeadCSV(HeadCSV object) {
			return createHeadCSVAdapter();
		}

		@Override
		public Adapter caseSheet_Na_Excel(Sheet_Na_Excel object) {
			return createSheet_Na_ExcelAdapter();
		}

		@Override
		public Adapter caseScaling(Scaling object) {
			return createScalingAdapter();
		}

		@Override
		public Adapter caseRobust_Scaling(Robust_Scaling object) {
			return createRobust_ScalingAdapter();
		}

		@Override
		public Adapter caseStandardization(Standardization object) {
			return createStandardizationAdapter();
		}

		@Override
		public Adapter caseNormalization(Normalization object) {
			return createNormalizationAdapter();
		}

		@Override
		public Adapter caseEncoding(Encoding object) {
			return createEncodingAdapter();
		}

		@Override
		public Adapter caseOneHot(OneHot object) {
			return createOneHotAdapter();
		}

		@Override
		public Adapter caseOneHot_Argumans(OneHot_Argumans object) {
			return createOneHot_ArgumansAdapter();
		}

		@Override
		public Adapter caseDrop(Drop object) {
			return createDropAdapter();
		}

		@Override
		public Adapter caseCategories(Categories object) {
			return createCategoriesAdapter();
		}

		@Override
		public Adapter caseSparse(Sparse object) {
			return createSparseAdapter();
		}

		@Override
		public Adapter caseHandle_Unk(Handle_Unk object) {
			return createHandle_UnkAdapter();
		}

		@Override
		public Adapter caseDuplicates(Duplicates object) {
			return createDuplicatesAdapter();
		}

		@Override
		public Adapter caseKeep(Keep object) {
			return createKeepAdapter();
		}

		@Override
		public Adapter caseDuplicates_Argumans(Duplicates_Argumans object) {
			return createDuplicates_ArgumansAdapter();
		}

		@Override
		public Adapter caseTrasformation(Trasformation object) {
			return createTrasformationAdapter();
		}

		@Override
		public Adapter caseDate_to_Int(Date_to_Int object) {
			return createDate_to_IntAdapter();
		}

		@Override
		public Adapter caseDate_Comp(Date_Comp object) {
			return createDate_CompAdapter();
		}

		@Override
		public Adapter caseYear(Year object) {
			return createYearAdapter();
		}

		@Override
		public Adapter caseMonth(Month object) {
			return createMonthAdapter();
		}

		@Override
		public Adapter caseDay(Day object) {
			return createDayAdapter();
		}

		@Override
		public Adapter caseDime_Reduct(Dime_Reduct object) {
			return createDime_ReductAdapter();
		}

		@Override
		public Adapter casePCA(PCA object) {
			return createPCAAdapter();
		}

		@Override
		public Adapter casePCA_Argumans(PCA_Argumans object) {
			return createPCA_ArgumansAdapter();
		}

		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter caseVarience(Varience object) {
			return createVarienceAdapter();
		}

		@Override
		public Adapter caseSVM(SVM object) {
			return createSVMAdapter();
		}

		@Override
		public Adapter caseNeural_Networks(Neural_Networks object) {
			return createNeural_NetworksAdapter();
		}

		@Override
		public Adapter caseMLP(MLP object) {
			return createMLPAdapter();
		}

		@Override
		public Adapter caseHidden_Layer_Sizes(Hidden_Layer_Sizes object) {
			return createHidden_Layer_SizesAdapter();
		}

		@Override
		public Adapter caseVoting_Classifier(Voting_Classifier object) {
			return createVoting_ClassifierAdapter();
		}

		@Override
		public Adapter caseEnsembles(Ensembles object) {
			return createEnsemblesAdapter();
		}

		@Override
		public Adapter caseRandom_Forest(Random_Forest object) {
			return createRandom_ForestAdapter();
		}

		@Override
		public Adapter caseClustering(Clustering object) {
			return createClusteringAdapter();
		}

		@Override
		public Adapter caseK_Medians(K_Medians object) {
			return createK_MediansAdapter();
		}

		@Override
		public Adapter caseK_Means(K_Means object) {
			return createK_MeansAdapter();
		}

		@Override
		public Adapter caseParameters(Parameters object) {
			return createParametersAdapter();
		}

		@Override
		public Adapter caseRegression(Regression object) {
			return createRegressionAdapter();
		}

		@Override
		public Adapter caseLogistic_Regression(Logistic_Regression object) {
			return createLogistic_RegressionAdapter();
		}

		@Override
		public Adapter caseRF_Argumans(RF_Argumans object) {
			return createRF_ArgumansAdapter();
		}

		@Override
		public Adapter caseN_Estimators_RF(N_Estimators_RF object) {
			return createN_Estimators_RFAdapter();
		}

		@Override
		public Adapter caseCriterion_RF(Criterion_RF object) {
			return createCriterion_RFAdapter();
		}

		@Override
		public Adapter caseRandom_State_RF(Random_State_RF object) {
			return createRandom_State_RFAdapter();
		}

		@Override
		public Adapter caseParameters_DBOP(Parameters_DBOP object) {
			return createParameters_DBOPAdapter();
		}

		@Override
		public Adapter caseDBSCAN(DBSCAN object) {
			return createDBSCANAdapter();
		}

		@Override
		public Adapter caseMLP_Argumans(MLP_Argumans object) {
			return createMLP_ArgumansAdapter();
		}

		@Override
		public Adapter caseMax_Iter_MLP(Max_Iter_MLP object) {
			return createMax_Iter_MLPAdapter();
		}

		@Override
		public Adapter caseRandom_State_MLP(Random_State_MLP object) {
			return createRandom_State_MLPAdapter();
		}

		@Override
		public Adapter caseActivation_MLP(Activation_MLP object) {
			return createActivation_MLPAdapter();
		}

		@Override
		public Adapter caseAlpha_MLP(Alpha_MLP object) {
			return createAlpha_MLPAdapter();
		}

		@Override
		public Adapter casePlots(Plots object) {
			return createPlotsAdapter();
		}

		@Override
		public Adapter caseScatter(Scatter object) {
			return createScatterAdapter();
		}

		@Override
		public Adapter caseCluster_Evaluation(Cluster_Evaluation object) {
			return createCluster_EvaluationAdapter();
		}

		@Override
		public Adapter caseOPtics(OPtics object) {
			return createOPticsAdapter();
		}

		@Override
		public Adapter casePreprocess(Preprocess object) {
			return createPreprocessAdapter();
		}

		@Override
		public Adapter caseAuto_Prep(Auto_Prep object) {
			return createAuto_PrepAdapter();
		}

		@Override
		public Adapter caseData_Understanding(Data_Understanding object) {
			return createData_UnderstandingAdapter();
		}

		@Override
		public Adapter caseStatistics(Statistics object) {
			return createStatisticsAdapter();
		}

		@Override
		public Adapter caseVisualization(Visualization object) {
			return createVisualizationAdapter();
		}

		@Override
		public Adapter caseCorrelation(Correlation object) {
			return createCorrelationAdapter();
		}

		@Override
		public Adapter caseStandard_Deviation(Standard_Deviation object) {
			return createStandard_DeviationAdapter();
		}

		@Override
		public Adapter caseBar(Bar object) {
			return createBarAdapter();
		}

		@Override
		public Adapter caseLinear_Regression(Linear_Regression object) {
			return createLinear_RegressionAdapter();
		}

		@Override
		public Adapter caseThing(Thing object) {
			return createThingAdapter();
		}

		@Override
		public Adapter caseProtocolBinding(ProtocolBinding object) {
			return createProtocolBindingAdapter();
		}

		@Override
		public Adapter caseProperty(Property object) {
			return createPropertyAdapter();
		}

		@Override
		public Adapter caseAction(Action object) {
			return createActionAdapter();
		}

		@Override
		public Adapter caseEvent(Event object) {
			return createEventAdapter();
		}

		@Override
		public Adapter caseDataSource(DataSource object) {
			return createDataSourceAdapter();
		}

		@Override
		public Adapter caseAnalysisOutput(AnalysisOutput object) {
			return createAnalysisOutputAdapter();
		}

		@Override
		public Adapter caseAnalysysTriger(AnalysysTriger object) {
			return createAnalysysTrigerAdapter();
		}

		@Override
		public Adapter caseCommunicationProtocol(CommunicationProtocol object) {
			return createCommunicationProtocolAdapter();
		}

		@Override
		public Adapter caseBuffer(Buffer object) {
			return createBufferAdapter();
		}

		@Override
		public Adapter caseMQTT(MQTT object) {
			return createMQTTAdapter();
		}

		@Override
		public Adapter caseDevices(Devices object) {
			return createDevicesAdapter();
		}

		@Override
		public Adapter caseTopic(Topic object) {
			return createTopicAdapter();
		}

		@Override
		public Adapter caseOnlineModelManager(OnlineModelManager object) {
			return createOnlineModelManagerAdapter();
		}

		@Override
		public Adapter caseSGDClassifier(SGDClassifier object) {
			return createSGDClassifierAdapter();
		}

		@Override
		public Adapter casePassiveAggressiveClassifier(PassiveAggressiveClassifier object) {
			return createPassiveAggressiveClassifierAdapter();
		}

		@Override
		public Adapter casePerceptron(Perceptron object) {
			return createPerceptronAdapter();
		}

		@Override
		public Adapter caseLgSGDClassifier(LgSGDClassifier object) {
			return createLgSGDClassifierAdapter();
		}

		@Override
		public Adapter caseSVLG(SVLG object) {
			return createSVLGAdapter();
		}

		@Override
		public Adapter caseOnlinePreprocess(OnlinePreprocess object) {
			return createOnlinePreprocessAdapter();
		}

		@Override
		public Adapter caseFeature_Engineering(Feature_Engineering object) {
			return createFeature_EngineeringAdapter();
		}

		@Override
		public Adapter caseFeatureDiffs(FeatureDiffs object) {
			return createFeatureDiffsAdapter();
		}

		@Override
		public Adapter casePolynomial(Polynomial object) {
			return createPolynomialAdapter();
		}

		@Override
		public Adapter caseMin_Max(Min_Max object) {
			return createMin_MaxAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Root
	 * @generated
	 */
	public Adapter createRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Cycle <em>Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Cycle
	 * @generated
	 */
	public Adapter createCycleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Import_Data <em>Import Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Import_Data
	 * @generated
	 */
	public Adapter createImport_DataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.CSV <em>CSV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.CSV
	 * @generated
	 */
	public Adapter createCSVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.CSV_Argumans <em>CSV Argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.CSV_Argumans
	 * @generated
	 */
	public Adapter createCSV_ArgumansAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Sep <em>Sep</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Sep
	 * @generated
	 */
	public Adapter createSepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Nrows <em>Nrows</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Nrows
	 * @generated
	 */
	public Adapter createNrowsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Set_Role <em>Set Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Set_Role
	 * @generated
	 */
	public Adapter createSet_RoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.ID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.ID
	 * @generated
	 */
	public Adapter createIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Target
	 * @generated
	 */
	public Adapter createTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Regular <em>Regular</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Regular
	 * @generated
	 */
	public Adapter createRegularAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Excel <em>Excel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Excel
	 * @generated
	 */
	public Adapter createExcelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Excel_Argumans <em>Excel Argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Excel_Argumans
	 * @generated
	 */
	public Adapter createExcel_ArgumansAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Header_Ex <em>Header Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Header_Ex
	 * @generated
	 */
	public Adapter createHeader_ExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Simple_Imputer <em>Simple Imputer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Simple_Imputer
	 * @generated
	 */
	public Adapter createSimple_ImputerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Simple_Imputer_Arguments <em>Simple Imputer Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Simple_Imputer_Arguments
	 * @generated
	 */
	public Adapter createSimple_Imputer_ArgumentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Missing_Values <em>Missing Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Missing_Values
	 * @generated
	 */
	public Adapter createMissing_ValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Strategy
	 * @generated
	 */
	public Adapter createStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Fill_Value <em>Fill Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Fill_Value
	 * @generated
	 */
	public Adapter createFill_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.KNN_Imputer <em>KNN Imputer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.KNN_Imputer
	 * @generated
	 */
	public Adapter createKNN_ImputerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.KNN_Argumans <em>KNN Argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.KNN_Argumans
	 * @generated
	 */
	public Adapter createKNN_ArgumansAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.N_Neighbors <em>NNeighbors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.N_Neighbors
	 * @generated
	 */
	public Adapter createN_NeighborsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Metric
	 * @generated
	 */
	public Adapter createMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Weights <em>Weights</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Weights
	 * @generated
	 */
	public Adapter createWeightsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Classification
	 * @generated
	 */
	public Adapter createClassificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.KNN <em>KNN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.KNN
	 * @generated
	 */
	public Adapter createKNNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Evaluation_Methods <em>Evaluation Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Evaluation_Methods
	 * @generated
	 */
	public Adapter createEvaluation_MethodsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Cross_Validation <em>Cross Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Cross_Validation
	 * @generated
	 */
	public Adapter createCross_ValidationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.HeadCSV <em>Head CSV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.HeadCSV
	 * @generated
	 */
	public Adapter createHeadCSVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Sheet_Na_Excel <em>Sheet Na Excel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Sheet_Na_Excel
	 * @generated
	 */
	public Adapter createSheet_Na_ExcelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Scaling <em>Scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Scaling
	 * @generated
	 */
	public Adapter createScalingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Robust_Scaling <em>Robust Scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Robust_Scaling
	 * @generated
	 */
	public Adapter createRobust_ScalingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Standardization <em>Standardization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Standardization
	 * @generated
	 */
	public Adapter createStandardizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Normalization <em>Normalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Normalization
	 * @generated
	 */
	public Adapter createNormalizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Encoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Encoding
	 * @generated
	 */
	public Adapter createEncodingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.OneHot <em>One Hot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.OneHot
	 * @generated
	 */
	public Adapter createOneHotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.OneHot_Argumans <em>One Hot Argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.OneHot_Argumans
	 * @generated
	 */
	public Adapter createOneHot_ArgumansAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Drop <em>Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Drop
	 * @generated
	 */
	public Adapter createDropAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Categories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Categories
	 * @generated
	 */
	public Adapter createCategoriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Sparse <em>Sparse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Sparse
	 * @generated
	 */
	public Adapter createSparseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Handle_Unk <em>Handle Unk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Handle_Unk
	 * @generated
	 */
	public Adapter createHandle_UnkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Duplicates <em>Duplicates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Duplicates
	 * @generated
	 */
	public Adapter createDuplicatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Keep <em>Keep</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Keep
	 * @generated
	 */
	public Adapter createKeepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Duplicates_Argumans <em>Duplicates Argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Duplicates_Argumans
	 * @generated
	 */
	public Adapter createDuplicates_ArgumansAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Trasformation <em>Trasformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Trasformation
	 * @generated
	 */
	public Adapter createTrasformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Date_to_Int <em>Date to Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Date_to_Int
	 * @generated
	 */
	public Adapter createDate_to_IntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Date_Comp <em>Date Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Date_Comp
	 * @generated
	 */
	public Adapter createDate_CompAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Year <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Year
	 * @generated
	 */
	public Adapter createYearAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Month <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Month
	 * @generated
	 */
	public Adapter createMonthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Day <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Day
	 * @generated
	 */
	public Adapter createDayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Dime_Reduct <em>Dime Reduct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Dime_Reduct
	 * @generated
	 */
	public Adapter createDime_ReductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.PCA <em>PCA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.PCA
	 * @generated
	 */
	public Adapter createPCAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.PCA_Argumans <em>PCA Argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.PCA_Argumans
	 * @generated
	 */
	public Adapter createPCA_ArgumansAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Varience <em>Varience</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Varience
	 * @generated
	 */
	public Adapter createVarienceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.SVM <em>SVM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.SVM
	 * @generated
	 */
	public Adapter createSVMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Neural_Networks <em>Neural Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Neural_Networks
	 * @generated
	 */
	public Adapter createNeural_NetworksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.MLP <em>MLP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.MLP
	 * @generated
	 */
	public Adapter createMLPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Hidden_Layer_Sizes <em>Hidden Layer Sizes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Hidden_Layer_Sizes
	 * @generated
	 */
	public Adapter createHidden_Layer_SizesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Voting_Classifier <em>Voting Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Voting_Classifier
	 * @generated
	 */
	public Adapter createVoting_ClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Ensembles <em>Ensembles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Ensembles
	 * @generated
	 */
	public Adapter createEnsemblesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Random_Forest <em>Random Forest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Random_Forest
	 * @generated
	 */
	public Adapter createRandom_ForestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Clustering <em>Clustering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Clustering
	 * @generated
	 */
	public Adapter createClusteringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.K_Medians <em>KMedians</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.K_Medians
	 * @generated
	 */
	public Adapter createK_MediansAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.K_Means <em>KMeans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.K_Means
	 * @generated
	 */
	public Adapter createK_MeansAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Parameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Parameters
	 * @generated
	 */
	public Adapter createParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.DBSCAN <em>DBSCAN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.DBSCAN
	 * @generated
	 */
	public Adapter createDBSCANAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.MLP_Argumans <em>MLP Argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.MLP_Argumans
	 * @generated
	 */
	public Adapter createMLP_ArgumansAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Max_Iter_MLP <em>Max Iter MLP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Max_Iter_MLP
	 * @generated
	 */
	public Adapter createMax_Iter_MLPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Random_State_MLP <em>Random State MLP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Random_State_MLP
	 * @generated
	 */
	public Adapter createRandom_State_MLPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Activation_MLP <em>Activation MLP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Activation_MLP
	 * @generated
	 */
	public Adapter createActivation_MLPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Alpha_MLP <em>Alpha MLP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Alpha_MLP
	 * @generated
	 */
	public Adapter createAlpha_MLPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Plots <em>Plots</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Plots
	 * @generated
	 */
	public Adapter createPlotsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Scatter <em>Scatter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Scatter
	 * @generated
	 */
	public Adapter createScatterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Cluster_Evaluation <em>Cluster Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Cluster_Evaluation
	 * @generated
	 */
	public Adapter createCluster_EvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.OPtics <em>OPtics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.OPtics
	 * @generated
	 */
	public Adapter createOPticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Preprocess <em>Preprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Preprocess
	 * @generated
	 */
	public Adapter createPreprocessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Auto_Prep <em>Auto Prep</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Auto_Prep
	 * @generated
	 */
	public Adapter createAuto_PrepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Data_Understanding <em>Data Understanding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Data_Understanding
	 * @generated
	 */
	public Adapter createData_UnderstandingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Statistics <em>Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Statistics
	 * @generated
	 */
	public Adapter createStatisticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Visualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Visualization
	 * @generated
	 */
	public Adapter createVisualizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Correlation <em>Correlation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Correlation
	 * @generated
	 */
	public Adapter createCorrelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Standard_Deviation <em>Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Standard_Deviation
	 * @generated
	 */
	public Adapter createStandard_DeviationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Bar <em>Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Bar
	 * @generated
	 */
	public Adapter createBarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Linear_Regression <em>Linear Regression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Linear_Regression
	 * @generated
	 */
	public Adapter createLinear_RegressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Thing
	 * @generated
	 */
	public Adapter createThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.ProtocolBinding <em>Protocol Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.ProtocolBinding
	 * @generated
	 */
	public Adapter createProtocolBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.DataSource
	 * @generated
	 */
	public Adapter createDataSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.AnalysisOutput <em>Analysis Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.AnalysisOutput
	 * @generated
	 */
	public Adapter createAnalysisOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.AnalysysTriger <em>Analysys Triger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.AnalysysTriger
	 * @generated
	 */
	public Adapter createAnalysysTrigerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.CommunicationProtocol <em>Communication Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.CommunicationProtocol
	 * @generated
	 */
	public Adapter createCommunicationProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Buffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Buffer
	 * @generated
	 */
	public Adapter createBufferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.MQTT <em>MQTT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.MQTT
	 * @generated
	 */
	public Adapter createMQTTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Devices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Devices
	 * @generated
	 */
	public Adapter createDevicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Topic
	 * @generated
	 */
	public Adapter createTopicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.OnlineModelManager <em>Online Model Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.OnlineModelManager
	 * @generated
	 */
	public Adapter createOnlineModelManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.SGDClassifier <em>SGD Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.SGDClassifier
	 * @generated
	 */
	public Adapter createSGDClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.PassiveAggressiveClassifier <em>Passive Aggressive Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.PassiveAggressiveClassifier
	 * @generated
	 */
	public Adapter createPassiveAggressiveClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Perceptron <em>Perceptron</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Perceptron
	 * @generated
	 */
	public Adapter createPerceptronAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.LgSGDClassifier <em>Lg SGD Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.LgSGDClassifier
	 * @generated
	 */
	public Adapter createLgSGDClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.SVLG <em>SVLG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.SVLG
	 * @generated
	 */
	public Adapter createSVLGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.OnlinePreprocess <em>Online Preprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.OnlinePreprocess
	 * @generated
	 */
	public Adapter createOnlinePreprocessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Feature_Engineering <em>Feature Engineering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Feature_Engineering
	 * @generated
	 */
	public Adapter createFeature_EngineeringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.FeatureDiffs <em>Feature Diffs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.FeatureDiffs
	 * @generated
	 */
	public Adapter createFeatureDiffsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Polynomial <em>Polynomial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Polynomial
	 * @generated
	 */
	public Adapter createPolynomialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Min_Max <em>Min Max</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Min_Max
	 * @generated
	 */
	public Adapter createMin_MaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Regression <em>Regression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Regression
	 * @generated
	 */
	public Adapter createRegressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Logistic_Regression <em>Logistic Regression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Logistic_Regression
	 * @generated
	 */
	public Adapter createLogistic_RegressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.RF_Argumans <em>RF Argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.RF_Argumans
	 * @generated
	 */
	public Adapter createRF_ArgumansAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.N_Estimators_RF <em>NEstimators RF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.N_Estimators_RF
	 * @generated
	 */
	public Adapter createN_Estimators_RFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Criterion_RF <em>Criterion RF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Criterion_RF
	 * @generated
	 */
	public Adapter createCriterion_RFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Random_State_RF <em>Random State RF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Random_State_RF
	 * @generated
	 */
	public Adapter createRandom_State_RFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mLmodel.Parameters_DBOP <em>Parameters DBOP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mLmodel.Parameters_DBOP
	 * @generated
	 */
	public Adapter createParameters_DBOPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MLmodelAdapterFactory
