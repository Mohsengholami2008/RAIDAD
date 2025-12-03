package mLmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mLmodel.MLmodelPackage
 * @generated
 */
public interface MLmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MLmodelFactory eINSTANCE = mLmodel.impl.MLmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	Root createRoot();

	/**
	 * Returns a new object of class '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process</em>'.
	 * @generated
	 */
	Process createProcess();

	/**
	 * Returns a new object of class '<em>CSV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CSV</em>'.
	 * @generated
	 */
	CSV createCSV();

	/**
	 * Returns a new object of class '<em>Sep</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sep</em>'.
	 * @generated
	 */
	Sep createSep();

	/**
	 * Returns a new object of class '<em>Nrows</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nrows</em>'.
	 * @generated
	 */
	Nrows createNrows();

	/**
	 * Returns a new object of class '<em>ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ID</em>'.
	 * @generated
	 */
	ID createID();

	/**
	 * Returns a new object of class '<em>Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target</em>'.
	 * @generated
	 */
	Target createTarget();

	/**
	 * Returns a new object of class '<em>Regular</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regular</em>'.
	 * @generated
	 */
	Regular createRegular();

	/**
	 * Returns a new object of class '<em>Excel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Excel</em>'.
	 * @generated
	 */
	Excel createExcel();

	/**
	 * Returns a new object of class '<em>Header Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Ex</em>'.
	 * @generated
	 */
	Header_Ex createHeader_Ex();

	/**
	 * Returns a new object of class '<em>Simple Imputer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Imputer</em>'.
	 * @generated
	 */
	Simple_Imputer createSimple_Imputer();

	/**
	 * Returns a new object of class '<em>Missing Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Missing Values</em>'.
	 * @generated
	 */
	Missing_Values createMissing_Values();

	/**
	 * Returns a new object of class '<em>Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strategy</em>'.
	 * @generated
	 */
	Strategy createStrategy();

	/**
	 * Returns a new object of class '<em>Fill Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fill Value</em>'.
	 * @generated
	 */
	Fill_Value createFill_Value();

	/**
	 * Returns a new object of class '<em>KNN Imputer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KNN Imputer</em>'.
	 * @generated
	 */
	KNN_Imputer createKNN_Imputer();

	/**
	 * Returns a new object of class '<em>NNeighbors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NNeighbors</em>'.
	 * @generated
	 */
	N_Neighbors createN_Neighbors();

	/**
	 * Returns a new object of class '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metric</em>'.
	 * @generated
	 */
	Metric createMetric();

	/**
	 * Returns a new object of class '<em>Weights</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Weights</em>'.
	 * @generated
	 */
	Weights createWeights();

	/**
	 * Returns a new object of class '<em>KNN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KNN</em>'.
	 * @generated
	 */
	KNN createKNN();

	/**
	 * Returns a new object of class '<em>Cross Validation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cross Validation</em>'.
	 * @generated
	 */
	Cross_Validation createCross_Validation();

	/**
	 * Returns a new object of class '<em>Head CSV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Head CSV</em>'.
	 * @generated
	 */
	HeadCSV createHeadCSV();

	/**
	 * Returns a new object of class '<em>Sheet Na Excel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sheet Na Excel</em>'.
	 * @generated
	 */
	Sheet_Na_Excel createSheet_Na_Excel();

	/**
	 * Returns a new object of class '<em>Robust Scaling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robust Scaling</em>'.
	 * @generated
	 */
	Robust_Scaling createRobust_Scaling();

	/**
	 * Returns a new object of class '<em>Standardization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standardization</em>'.
	 * @generated
	 */
	Standardization createStandardization();

	/**
	 * Returns a new object of class '<em>Normalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normalization</em>'.
	 * @generated
	 */
	Normalization createNormalization();

	/**
	 * Returns a new object of class '<em>One Hot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One Hot</em>'.
	 * @generated
	 */
	OneHot createOneHot();

	/**
	 * Returns a new object of class '<em>Drop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drop</em>'.
	 * @generated
	 */
	Drop createDrop();

	/**
	 * Returns a new object of class '<em>Categories</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Categories</em>'.
	 * @generated
	 */
	Categories createCategories();

	/**
	 * Returns a new object of class '<em>Sparse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sparse</em>'.
	 * @generated
	 */
	Sparse createSparse();

	/**
	 * Returns a new object of class '<em>Handle Unk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Handle Unk</em>'.
	 * @generated
	 */
	Handle_Unk createHandle_Unk();

	/**
	 * Returns a new object of class '<em>Duplicates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Duplicates</em>'.
	 * @generated
	 */
	Duplicates createDuplicates();

	/**
	 * Returns a new object of class '<em>Keep</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keep</em>'.
	 * @generated
	 */
	Keep createKeep();

	/**
	 * Returns a new object of class '<em>Date to Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date to Int</em>'.
	 * @generated
	 */
	Date_to_Int createDate_to_Int();

	/**
	 * Returns a new object of class '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Year</em>'.
	 * @generated
	 */
	Year createYear();

	/**
	 * Returns a new object of class '<em>Month</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Month</em>'.
	 * @generated
	 */
	Month createMonth();

	/**
	 * Returns a new object of class '<em>Day</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Day</em>'.
	 * @generated
	 */
	Day createDay();

	/**
	 * Returns a new object of class '<em>PCA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCA</em>'.
	 * @generated
	 */
	PCA createPCA();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Varience</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Varience</em>'.
	 * @generated
	 */
	Varience createVarience();

	/**
	 * Returns a new object of class '<em>SVM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SVM</em>'.
	 * @generated
	 */
	SVM createSVM();

	/**
	 * Returns a new object of class '<em>MLP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MLP</em>'.
	 * @generated
	 */
	MLP createMLP();

	/**
	 * Returns a new object of class '<em>Hidden Layer Sizes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hidden Layer Sizes</em>'.
	 * @generated
	 */
	Hidden_Layer_Sizes createHidden_Layer_Sizes();

	/**
	 * Returns a new object of class '<em>Voting Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voting Classifier</em>'.
	 * @generated
	 */
	Voting_Classifier createVoting_Classifier();

	/**
	 * Returns a new object of class '<em>Random Forest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Random Forest</em>'.
	 * @generated
	 */
	Random_Forest createRandom_Forest();

	/**
	 * Returns a new object of class '<em>KMedians</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KMedians</em>'.
	 * @generated
	 */
	K_Medians createK_Medians();

	/**
	 * Returns a new object of class '<em>KMeans</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KMeans</em>'.
	 * @generated
	 */
	K_Means createK_Means();

	/**
	 * Returns a new object of class '<em>Logistic Regression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logistic Regression</em>'.
	 * @generated
	 */
	Logistic_Regression createLogistic_Regression();

	/**
	 * Returns a new object of class '<em>NEstimators RF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NEstimators RF</em>'.
	 * @generated
	 */
	N_Estimators_RF createN_Estimators_RF();

	/**
	 * Returns a new object of class '<em>Criterion RF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Criterion RF</em>'.
	 * @generated
	 */
	Criterion_RF createCriterion_RF();

	/**
	 * Returns a new object of class '<em>Random State RF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Random State RF</em>'.
	 * @generated
	 */
	Random_State_RF createRandom_State_RF();

	/**
	 * Returns a new object of class '<em>DBSCAN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DBSCAN</em>'.
	 * @generated
	 */
	DBSCAN createDBSCAN();

	/**
	 * Returns a new object of class '<em>Max Iter MLP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Iter MLP</em>'.
	 * @generated
	 */
	Max_Iter_MLP createMax_Iter_MLP();

	/**
	 * Returns a new object of class '<em>Random State MLP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Random State MLP</em>'.
	 * @generated
	 */
	Random_State_MLP createRandom_State_MLP();

	/**
	 * Returns a new object of class '<em>Activation MLP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activation MLP</em>'.
	 * @generated
	 */
	Activation_MLP createActivation_MLP();

	/**
	 * Returns a new object of class '<em>Alpha MLP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alpha MLP</em>'.
	 * @generated
	 */
	Alpha_MLP createAlpha_MLP();

	/**
	 * Returns a new object of class '<em>Scatter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scatter</em>'.
	 * @generated
	 */
	Scatter createScatter();

	/**
	 * Returns a new object of class '<em>Cluster Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cluster Evaluation</em>'.
	 * @generated
	 */
	Cluster_Evaluation createCluster_Evaluation();

	/**
	 * Returns a new object of class '<em>OPtics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OPtics</em>'.
	 * @generated
	 */
	OPtics createOPtics();

	/**
	 * Returns a new object of class '<em>Auto Prep</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auto Prep</em>'.
	 * @generated
	 */
	Auto_Prep createAuto_Prep();

	/**
	 * Returns a new object of class '<em>Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statistics</em>'.
	 * @generated
	 */
	Statistics createStatistics();

	/**
	 * Returns a new object of class '<em>Visualization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visualization</em>'.
	 * @generated
	 */
	Visualization createVisualization();

	/**
	 * Returns a new object of class '<em>Correlation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Correlation</em>'.
	 * @generated
	 */
	Correlation createCorrelation();

	/**
	 * Returns a new object of class '<em>Standard Deviation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Deviation</em>'.
	 * @generated
	 */
	Standard_Deviation createStandard_Deviation();

	/**
	 * Returns a new object of class '<em>Bar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bar</em>'.
	 * @generated
	 */
	Bar createBar();

	/**
	 * Returns a new object of class '<em>Linear Regression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linear Regression</em>'.
	 * @generated
	 */
	Linear_Regression createLinear_Regression();

	/**
	 * Returns a new object of class '<em>Thing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thing</em>'.
	 * @generated
	 */
	Thing createThing();

	/**
	 * Returns a new object of class '<em>Protocol Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Binding</em>'.
	 * @generated
	 */
	ProtocolBinding createProtocolBinding();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Source</em>'.
	 * @generated
	 */
	DataSource createDataSource();

	/**
	 * Returns a new object of class '<em>Analysis Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis Output</em>'.
	 * @generated
	 */
	AnalysisOutput createAnalysisOutput();

	/**
	 * Returns a new object of class '<em>Analysys Triger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysys Triger</em>'.
	 * @generated
	 */
	AnalysysTriger createAnalysysTriger();

	/**
	 * Returns a new object of class '<em>Communication Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Protocol</em>'.
	 * @generated
	 */
	CommunicationProtocol createCommunicationProtocol();

	/**
	 * Returns a new object of class '<em>Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Buffer</em>'.
	 * @generated
	 */
	Buffer createBuffer();

	/**
	 * Returns a new object of class '<em>MQTT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MQTT</em>'.
	 * @generated
	 */
	MQTT createMQTT();

	/**
	 * Returns a new object of class '<em>Topic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topic</em>'.
	 * @generated
	 */
	Topic createTopic();

	/**
	 * Returns a new object of class '<em>SGD Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SGD Classifier</em>'.
	 * @generated
	 */
	SGDClassifier createSGDClassifier();

	/**
	 * Returns a new object of class '<em>Passive Aggressive Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passive Aggressive Classifier</em>'.
	 * @generated
	 */
	PassiveAggressiveClassifier createPassiveAggressiveClassifier();

	/**
	 * Returns a new object of class '<em>Perceptron</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perceptron</em>'.
	 * @generated
	 */
	Perceptron createPerceptron();

	/**
	 * Returns a new object of class '<em>Devices</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Devices</em>'.
	 * @generated
	 */
	Devices createDevices();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MLmodelPackage getMLmodelPackage();

} //MLmodelFactory