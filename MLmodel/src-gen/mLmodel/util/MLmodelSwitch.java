/**
 */
package mLmodel.util;

import mLmodel.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mLmodel.MLmodelPackage
 * @generated
 */
public class MLmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MLmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MLmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = MLmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case MLmodelPackage.ROOT: {
			Root root = (Root) theEObject;
			T result = caseRoot(root);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.PROCESS: {
			mLmodel.Process process = (mLmodel.Process) theEObject;
			T result = caseProcess(process);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.CYCLE: {
			Cycle cycle = (Cycle) theEObject;
			T result = caseCycle(cycle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.IMPORT_DATA: {
			Import_Data import_Data = (Import_Data) theEObject;
			T result = caseImport_Data(import_Data);
			if (result == null)
				result = casePreprocess(import_Data);
			if (result == null)
				result = caseCycle(import_Data);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.CSV: {
			CSV csv = (CSV) theEObject;
			T result = caseCSV(csv);
			if (result == null)
				result = caseImport_Data(csv);
			if (result == null)
				result = casePreprocess(csv);
			if (result == null)
				result = caseCycle(csv);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.CSV_ARGUMANS: {
			CSV_Argumans csV_Argumans = (CSV_Argumans) theEObject;
			T result = caseCSV_Argumans(csV_Argumans);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.SEP: {
			Sep sep = (Sep) theEObject;
			T result = caseSep(sep);
			if (result == null)
				result = caseCSV_Argumans(sep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.NROWS: {
			Nrows nrows = (Nrows) theEObject;
			T result = caseNrows(nrows);
			if (result == null)
				result = caseCSV_Argumans(nrows);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.SET_ROLE: {
			Set_Role set_Role = (Set_Role) theEObject;
			T result = caseSet_Role(set_Role);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.ID: {
			ID id = (ID) theEObject;
			T result = caseID(id);
			if (result == null)
				result = caseSet_Role(id);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.TARGET: {
			Target target = (Target) theEObject;
			T result = caseTarget(target);
			if (result == null)
				result = caseSet_Role(target);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.REGULAR: {
			Regular regular = (Regular) theEObject;
			T result = caseRegular(regular);
			if (result == null)
				result = caseSet_Role(regular);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.EXCEL: {
			Excel excel = (Excel) theEObject;
			T result = caseExcel(excel);
			if (result == null)
				result = caseImport_Data(excel);
			if (result == null)
				result = casePreprocess(excel);
			if (result == null)
				result = caseCycle(excel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.EXCEL_ARGUMANS: {
			Excel_Argumans excel_Argumans = (Excel_Argumans) theEObject;
			T result = caseExcel_Argumans(excel_Argumans);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.HEADER_EX: {
			Header_Ex header_Ex = (Header_Ex) theEObject;
			T result = caseHeader_Ex(header_Ex);
			if (result == null)
				result = caseExcel_Argumans(header_Ex);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.SIMPLE_IMPUTER: {
			Simple_Imputer simple_Imputer = (Simple_Imputer) theEObject;
			T result = caseSimple_Imputer(simple_Imputer);
			if (result == null)
				result = casePreprocess(simple_Imputer);
			if (result == null)
				result = caseCycle(simple_Imputer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.SIMPLE_IMPUTER_ARGUMENTS: {
			Simple_Imputer_Arguments simple_Imputer_Arguments = (Simple_Imputer_Arguments) theEObject;
			T result = caseSimple_Imputer_Arguments(simple_Imputer_Arguments);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.MISSING_VALUES: {
			Missing_Values missing_Values = (Missing_Values) theEObject;
			T result = caseMissing_Values(missing_Values);
			if (result == null)
				result = caseSimple_Imputer_Arguments(missing_Values);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.STRATEGY: {
			Strategy strategy = (Strategy) theEObject;
			T result = caseStrategy(strategy);
			if (result == null)
				result = caseSimple_Imputer_Arguments(strategy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.FILL_VALUE: {
			Fill_Value fill_Value = (Fill_Value) theEObject;
			T result = caseFill_Value(fill_Value);
			if (result == null)
				result = caseSimple_Imputer_Arguments(fill_Value);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.KNN_IMPUTER: {
			KNN_Imputer knN_Imputer = (KNN_Imputer) theEObject;
			T result = caseKNN_Imputer(knN_Imputer);
			if (result == null)
				result = casePreprocess(knN_Imputer);
			if (result == null)
				result = caseCycle(knN_Imputer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.KNN_ARGUMANS: {
			KNN_Argumans knN_Argumans = (KNN_Argumans) theEObject;
			T result = caseKNN_Argumans(knN_Argumans);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.NNEIGHBORS: {
			N_Neighbors n_Neighbors = (N_Neighbors) theEObject;
			T result = caseN_Neighbors(n_Neighbors);
			if (result == null)
				result = caseKNN_Argumans(n_Neighbors);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.METRIC: {
			Metric metric = (Metric) theEObject;
			T result = caseMetric(metric);
			if (result == null)
				result = caseKNN_Argumans(metric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.WEIGHTS: {
			Weights weights = (Weights) theEObject;
			T result = caseWeights(weights);
			if (result == null)
				result = caseKNN_Argumans(weights);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.CLASSIFICATION: {
			Classification classification = (Classification) theEObject;
			T result = caseClassification(classification);
			if (result == null)
				result = caseCycle(classification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.KNN: {
			KNN knn = (KNN) theEObject;
			T result = caseKNN(knn);
			if (result == null)
				result = caseClassification(knn);
			if (result == null)
				result = caseCycle(knn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.EVALUATION_METHODS: {
			Evaluation_Methods evaluation_Methods = (Evaluation_Methods) theEObject;
			T result = caseEvaluation_Methods(evaluation_Methods);
			if (result == null)
				result = caseCycle(evaluation_Methods);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.CROSS_VALIDATION: {
			Cross_Validation cross_Validation = (Cross_Validation) theEObject;
			T result = caseCross_Validation(cross_Validation);
			if (result == null)
				result = caseEvaluation_Methods(cross_Validation);
			if (result == null)
				result = caseCycle(cross_Validation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.HEAD_CSV: {
			HeadCSV headCSV = (HeadCSV) theEObject;
			T result = caseHeadCSV(headCSV);
			if (result == null)
				result = caseCSV_Argumans(headCSV);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.SHEET_NA_EXCEL: {
			Sheet_Na_Excel sheet_Na_Excel = (Sheet_Na_Excel) theEObject;
			T result = caseSheet_Na_Excel(sheet_Na_Excel);
			if (result == null)
				result = caseExcel_Argumans(sheet_Na_Excel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.SCALING: {
			Scaling scaling = (Scaling) theEObject;
			T result = caseScaling(scaling);
			if (result == null)
				result = casePreprocess(scaling);
			if (result == null)
				result = caseCycle(scaling);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.ROBUST_SCALING: {
			Robust_Scaling robust_Scaling = (Robust_Scaling) theEObject;
			T result = caseRobust_Scaling(robust_Scaling);
			if (result == null)
				result = caseScaling(robust_Scaling);
			if (result == null)
				result = casePreprocess(robust_Scaling);
			if (result == null)
				result = caseCycle(robust_Scaling);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.STANDARDIZATION: {
			Standardization standardization = (Standardization) theEObject;
			T result = caseStandardization(standardization);
			if (result == null)
				result = caseScaling(standardization);
			if (result == null)
				result = casePreprocess(standardization);
			if (result == null)
				result = caseCycle(standardization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.NORMALIZATION: {
			Normalization normalization = (Normalization) theEObject;
			T result = caseNormalization(normalization);
			if (result == null)
				result = caseScaling(normalization);
			if (result == null)
				result = casePreprocess(normalization);
			if (result == null)
				result = caseCycle(normalization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.ENCODING: {
			Encoding encoding = (Encoding) theEObject;
			T result = caseEncoding(encoding);
			if (result == null)
				result = casePreprocess(encoding);
			if (result == null)
				result = caseCycle(encoding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.ONE_HOT: {
			OneHot oneHot = (OneHot) theEObject;
			T result = caseOneHot(oneHot);
			if (result == null)
				result = caseEncoding(oneHot);
			if (result == null)
				result = casePreprocess(oneHot);
			if (result == null)
				result = caseCycle(oneHot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.ONE_HOT_ARGUMANS: {
			OneHot_Argumans oneHot_Argumans = (OneHot_Argumans) theEObject;
			T result = caseOneHot_Argumans(oneHot_Argumans);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.DROP: {
			Drop drop = (Drop) theEObject;
			T result = caseDrop(drop);
			if (result == null)
				result = caseOneHot_Argumans(drop);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.CATEGORIES: {
			Categories categories = (Categories) theEObject;
			T result = caseCategories(categories);
			if (result == null)
				result = caseOneHot_Argumans(categories);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.SPARSE: {
			Sparse sparse = (Sparse) theEObject;
			T result = caseSparse(sparse);
			if (result == null)
				result = caseOneHot_Argumans(sparse);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.HANDLE_UNK: {
			Handle_Unk handle_Unk = (Handle_Unk) theEObject;
			T result = caseHandle_Unk(handle_Unk);
			if (result == null)
				result = caseOneHot_Argumans(handle_Unk);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.DUPLICATES: {
			Duplicates duplicates = (Duplicates) theEObject;
			T result = caseDuplicates(duplicates);
			if (result == null)
				result = casePreprocess(duplicates);
			if (result == null)
				result = caseCycle(duplicates);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.KEEP: {
			Keep keep = (Keep) theEObject;
			T result = caseKeep(keep);
			if (result == null)
				result = caseDuplicates_Argumans(keep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.DUPLICATES_ARGUMANS: {
			Duplicates_Argumans duplicates_Argumans = (Duplicates_Argumans) theEObject;
			T result = caseDuplicates_Argumans(duplicates_Argumans);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.TRASFORMATION: {
			Trasformation trasformation = (Trasformation) theEObject;
			T result = caseTrasformation(trasformation);
			if (result == null)
				result = casePreprocess(trasformation);
			if (result == null)
				result = caseCycle(trasformation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.DATE_TO_INT: {
			Date_to_Int date_to_Int = (Date_to_Int) theEObject;
			T result = caseDate_to_Int(date_to_Int);
			if (result == null)
				result = caseTrasformation(date_to_Int);
			if (result == null)
				result = casePreprocess(date_to_Int);
			if (result == null)
				result = caseCycle(date_to_Int);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.DATE_COMP: {
			Date_Comp date_Comp = (Date_Comp) theEObject;
			T result = caseDate_Comp(date_Comp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.YEAR: {
			Year year = (Year) theEObject;
			T result = caseYear(year);
			if (result == null)
				result = caseDate_Comp(year);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.MONTH: {
			Month month = (Month) theEObject;
			T result = caseMonth(month);
			if (result == null)
				result = caseDate_Comp(month);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.DAY: {
			Day day = (Day) theEObject;
			T result = caseDay(day);
			if (result == null)
				result = caseDate_Comp(day);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.DIME_REDUCT: {
			Dime_Reduct dime_Reduct = (Dime_Reduct) theEObject;
			T result = caseDime_Reduct(dime_Reduct);
			if (result == null)
				result = casePreprocess(dime_Reduct);
			if (result == null)
				result = caseCycle(dime_Reduct);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.PCA: {
			PCA pca = (PCA) theEObject;
			T result = casePCA(pca);
			if (result == null)
				result = caseDime_Reduct(pca);
			if (result == null)
				result = casePreprocess(pca);
			if (result == null)
				result = caseCycle(pca);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.PCA_ARGUMANS: {
			PCA_Argumans pcA_Argumans = (PCA_Argumans) theEObject;
			T result = casePCA_Argumans(pcA_Argumans);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.COMPONENT: {
			Component component = (Component) theEObject;
			T result = caseComponent(component);
			if (result == null)
				result = casePCA_Argumans(component);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.VARIENCE: {
			Varience varience = (Varience) theEObject;
			T result = caseVarience(varience);
			if (result == null)
				result = casePCA_Argumans(varience);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.SVM: {
			SVM svm = (SVM) theEObject;
			T result = caseSVM(svm);
			if (result == null)
				result = caseClassification(svm);
			if (result == null)
				result = caseCycle(svm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.NEURAL_NETWORKS: {
			Neural_Networks neural_Networks = (Neural_Networks) theEObject;
			T result = caseNeural_Networks(neural_Networks);
			if (result == null)
				result = caseClassification(neural_Networks);
			if (result == null)
				result = caseCycle(neural_Networks);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.MLP: {
			MLP mlp = (MLP) theEObject;
			T result = caseMLP(mlp);
			if (result == null)
				result = caseNeural_Networks(mlp);
			if (result == null)
				result = caseClassification(mlp);
			if (result == null)
				result = caseCycle(mlp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.HIDDEN_LAYER_SIZES: {
			Hidden_Layer_Sizes hidden_Layer_Sizes = (Hidden_Layer_Sizes) theEObject;
			T result = caseHidden_Layer_Sizes(hidden_Layer_Sizes);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.VOTING_CLASSIFIER: {
			Voting_Classifier voting_Classifier = (Voting_Classifier) theEObject;
			T result = caseVoting_Classifier(voting_Classifier);
			if (result == null)
				result = caseEnsembles(voting_Classifier);
			if (result == null)
				result = caseClassification(voting_Classifier);
			if (result == null)
				result = caseCycle(voting_Classifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.ENSEMBLES: {
			Ensembles ensembles = (Ensembles) theEObject;
			T result = caseEnsembles(ensembles);
			if (result == null)
				result = caseClassification(ensembles);
			if (result == null)
				result = caseCycle(ensembles);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.RANDOM_FOREST: {
			Random_Forest random_Forest = (Random_Forest) theEObject;
			T result = caseRandom_Forest(random_Forest);
			if (result == null)
				result = caseEnsembles(random_Forest);
			if (result == null)
				result = caseClassification(random_Forest);
			if (result == null)
				result = caseCycle(random_Forest);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.CLUSTERING: {
			Clustering clustering = (Clustering) theEObject;
			T result = caseClustering(clustering);
			if (result == null)
				result = caseCycle(clustering);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.KMEDIANS: {
			K_Medians k_Medians = (K_Medians) theEObject;
			T result = caseK_Medians(k_Medians);
			if (result == null)
				result = caseParameters(k_Medians);
			if (result == null)
				result = caseClustering(k_Medians);
			if (result == null)
				result = caseCycle(k_Medians);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.KMEANS: {
			K_Means k_Means = (K_Means) theEObject;
			T result = caseK_Means(k_Means);
			if (result == null)
				result = caseParameters(k_Means);
			if (result == null)
				result = caseClustering(k_Means);
			if (result == null)
				result = caseCycle(k_Means);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.PARAMETERS: {
			Parameters parameters = (Parameters) theEObject;
			T result = caseParameters(parameters);
			if (result == null)
				result = caseClustering(parameters);
			if (result == null)
				result = caseCycle(parameters);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.REGRESSION: {
			Regression regression = (Regression) theEObject;
			T result = caseRegression(regression);
			if (result == null)
				result = caseCycle(regression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.LOGISTIC_REGRESSION: {
			Logistic_Regression logistic_Regression = (Logistic_Regression) theEObject;
			T result = caseLogistic_Regression(logistic_Regression);
			if (result == null)
				result = caseRegression(logistic_Regression);
			if (result == null)
				result = caseCycle(logistic_Regression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.RF_ARGUMANS: {
			RF_Argumans rF_Argumans = (RF_Argumans) theEObject;
			T result = caseRF_Argumans(rF_Argumans);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.NESTIMATORS_RF: {
			N_Estimators_RF n_Estimators_RF = (N_Estimators_RF) theEObject;
			T result = caseN_Estimators_RF(n_Estimators_RF);
			if (result == null)
				result = caseRF_Argumans(n_Estimators_RF);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.CRITERION_RF: {
			Criterion_RF criterion_RF = (Criterion_RF) theEObject;
			T result = caseCriterion_RF(criterion_RF);
			if (result == null)
				result = caseRF_Argumans(criterion_RF);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.RANDOM_STATE_RF: {
			Random_State_RF random_State_RF = (Random_State_RF) theEObject;
			T result = caseRandom_State_RF(random_State_RF);
			if (result == null)
				result = caseRF_Argumans(random_State_RF);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.PARAMETERS_DBOP: {
			Parameters_DBOP parameters_DBOP = (Parameters_DBOP) theEObject;
			T result = caseParameters_DBOP(parameters_DBOP);
			if (result == null)
				result = caseClustering(parameters_DBOP);
			if (result == null)
				result = caseCycle(parameters_DBOP);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.DBSCAN: {
			DBSCAN dbscan = (DBSCAN) theEObject;
			T result = caseDBSCAN(dbscan);
			if (result == null)
				result = caseParameters_DBOP(dbscan);
			if (result == null)
				result = caseClustering(dbscan);
			if (result == null)
				result = caseCycle(dbscan);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.MLP_ARGUMANS: {
			MLP_Argumans mlP_Argumans = (MLP_Argumans) theEObject;
			T result = caseMLP_Argumans(mlP_Argumans);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.MAX_ITER_MLP: {
			Max_Iter_MLP max_Iter_MLP = (Max_Iter_MLP) theEObject;
			T result = caseMax_Iter_MLP(max_Iter_MLP);
			if (result == null)
				result = caseMLP_Argumans(max_Iter_MLP);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.RANDOM_STATE_MLP: {
			Random_State_MLP random_State_MLP = (Random_State_MLP) theEObject;
			T result = caseRandom_State_MLP(random_State_MLP);
			if (result == null)
				result = caseMLP_Argumans(random_State_MLP);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.ACTIVATION_MLP: {
			Activation_MLP activation_MLP = (Activation_MLP) theEObject;
			T result = caseActivation_MLP(activation_MLP);
			if (result == null)
				result = caseMLP_Argumans(activation_MLP);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.ALPHA_MLP: {
			Alpha_MLP alpha_MLP = (Alpha_MLP) theEObject;
			T result = caseAlpha_MLP(alpha_MLP);
			if (result == null)
				result = caseMLP_Argumans(alpha_MLP);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.PLOTS: {
			Plots plots = (Plots) theEObject;
			T result = casePlots(plots);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.SCATTER: {
			Scatter scatter = (Scatter) theEObject;
			T result = caseScatter(scatter);
			if (result == null)
				result = casePlots(scatter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.CLUSTER_EVALUATION: {
			Cluster_Evaluation cluster_Evaluation = (Cluster_Evaluation) theEObject;
			T result = caseCluster_Evaluation(cluster_Evaluation);
			if (result == null)
				result = caseCycle(cluster_Evaluation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.OPTICS: {
			OPtics oPtics = (OPtics) theEObject;
			T result = caseOPtics(oPtics);
			if (result == null)
				result = caseParameters_DBOP(oPtics);
			if (result == null)
				result = caseClustering(oPtics);
			if (result == null)
				result = caseCycle(oPtics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.PREPROCESS: {
			Preprocess preprocess = (Preprocess) theEObject;
			T result = casePreprocess(preprocess);
			if (result == null)
				result = caseCycle(preprocess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.AUTO_PREP: {
			Auto_Prep auto_Prep = (Auto_Prep) theEObject;
			T result = caseAuto_Prep(auto_Prep);
			if (result == null)
				result = casePreprocess(auto_Prep);
			if (result == null)
				result = caseCycle(auto_Prep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.DATA_UNDERSTANDING: {
			Data_Understanding data_Understanding = (Data_Understanding) theEObject;
			T result = caseData_Understanding(data_Understanding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.STATISTICS: {
			Statistics statistics = (Statistics) theEObject;
			T result = caseStatistics(statistics);
			if (result == null)
				result = caseData_Understanding(statistics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.VISUALIZATION: {
			Visualization visualization = (Visualization) theEObject;
			T result = caseVisualization(visualization);
			if (result == null)
				result = caseData_Understanding(visualization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.CORRELATION: {
			Correlation correlation = (Correlation) theEObject;
			T result = caseCorrelation(correlation);
			if (result == null)
				result = caseData_Understanding(correlation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.STANDARD_DEVIATION: {
			Standard_Deviation standard_Deviation = (Standard_Deviation) theEObject;
			T result = caseStandard_Deviation(standard_Deviation);
			if (result == null)
				result = caseData_Understanding(standard_Deviation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.BAR: {
			Bar bar = (Bar) theEObject;
			T result = caseBar(bar);
			if (result == null)
				result = casePlots(bar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.LINEAR_REGRESSION: {
			Linear_Regression linear_Regression = (Linear_Regression) theEObject;
			T result = caseLinear_Regression(linear_Regression);
			if (result == null)
				result = caseRegression(linear_Regression);
			if (result == null)
				result = caseCycle(linear_Regression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.THING: {
			Thing thing = (Thing) theEObject;
			T result = caseThing(thing);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.PROTOCOL_BINDING: {
			ProtocolBinding protocolBinding = (ProtocolBinding) theEObject;
			T result = caseProtocolBinding(protocolBinding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.PROPERTY: {
			Property property = (Property) theEObject;
			T result = caseProperty(property);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.ACTION: {
			Action action = (Action) theEObject;
			T result = caseAction(action);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.EVENT: {
			Event event = (Event) theEObject;
			T result = caseEvent(event);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.DATA_SOURCE: {
			DataSource dataSource = (DataSource) theEObject;
			T result = caseDataSource(dataSource);
			if (result == null)
				result = caseImport_Data(dataSource);
			if (result == null)
				result = casePreprocess(dataSource);
			if (result == null)
				result = caseCycle(dataSource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.ANALYSIS_OUTPUT: {
			AnalysisOutput analysisOutput = (AnalysisOutput) theEObject;
			T result = caseAnalysisOutput(analysisOutput);
			if (result == null)
				result = caseEvaluation_Methods(analysisOutput);
			if (result == null)
				result = caseCycle(analysisOutput);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.ANALYSYS_TRIGER: {
			AnalysysTriger analysysTriger = (AnalysysTriger) theEObject;
			T result = caseAnalysysTriger(analysysTriger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.COMMUNICATION_PROTOCOL: {
			CommunicationProtocol communicationProtocol = (CommunicationProtocol) theEObject;
			T result = caseCommunicationProtocol(communicationProtocol);
			if (result == null)
				result = caseImport_Data(communicationProtocol);
			if (result == null)
				result = casePreprocess(communicationProtocol);
			if (result == null)
				result = caseCycle(communicationProtocol);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.BUFFER: {
			Buffer buffer = (Buffer) theEObject;
			T result = caseBuffer(buffer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.MQTT: {
			MQTT mqtt = (MQTT) theEObject;
			T result = caseMQTT(mqtt);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.ONLINE_MODEL_MANAGER: {
			OnlineModelManager onlineModelManager = (OnlineModelManager) theEObject;
			T result = caseOnlineModelManager(onlineModelManager);
			if (result == null)
				result = caseCycle(onlineModelManager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.TOPIC: {
			Topic topic = (Topic) theEObject;
			T result = caseTopic(topic);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.SGD_CLASSIFIER: {
			SGDClassifier sgdClassifier = (SGDClassifier) theEObject;
			T result = caseSGDClassifier(sgdClassifier);
			if (result == null)
				result = caseOnlineModelManager(sgdClassifier);
			if (result == null)
				result = caseCycle(sgdClassifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.PASSIVE_AGGRESSIVE_CLASSIFIER: {
			PassiveAggressiveClassifier passiveAggressiveClassifier = (PassiveAggressiveClassifier) theEObject;
			T result = casePassiveAggressiveClassifier(passiveAggressiveClassifier);
			if (result == null)
				result = caseOnlineModelManager(passiveAggressiveClassifier);
			if (result == null)
				result = caseCycle(passiveAggressiveClassifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.PERCEPTRON: {
			Perceptron perceptron = (Perceptron) theEObject;
			T result = casePerceptron(perceptron);
			if (result == null)
				result = caseOnlineModelManager(perceptron);
			if (result == null)
				result = caseCycle(perceptron);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MLmodelPackage.DEVICES: {
			Devices devices = (Devices) theEObject;
			T result = caseDevices(devices);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoot(Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(mLmodel.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cycle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cycle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCycle(Cycle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport_Data(Import_Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSV(CSV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSV Argumans</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSV Argumans</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSV_Argumans(CSV_Argumans object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sep</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sep</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSep(Sep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nrows</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nrows</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNrows(Nrows object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSet_Role(Set_Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseID(ID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTarget(Target object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegular(Regular object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Excel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Excel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcel(Excel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Excel Argumans</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Excel Argumans</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcel_Argumans(Excel_Argumans object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeader_Ex(Header_Ex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Imputer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Imputer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimple_Imputer(Simple_Imputer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Imputer Arguments</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Imputer Arguments</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimple_Imputer_Arguments(Simple_Imputer_Arguments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Missing Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Missing Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMissing_Values(Missing_Values object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategy(Strategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fill Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fill Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFill_Value(Fill_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KNN Imputer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KNN Imputer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKNN_Imputer(KNN_Imputer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KNN Argumans</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KNN Argumans</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKNN_Argumans(KNN_Argumans object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NNeighbors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NNeighbors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseN_Neighbors(N_Neighbors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetric(Metric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weights</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weights</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeights(Weights object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassification(Classification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KNN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KNN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKNN(KNN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation Methods</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation Methods</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluation_Methods(Evaluation_Methods object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cross Validation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cross Validation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCross_Validation(Cross_Validation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Head CSV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Head CSV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeadCSV(HeadCSV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sheet Na Excel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sheet Na Excel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSheet_Na_Excel(Sheet_Na_Excel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scaling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scaling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScaling(Scaling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Robust Scaling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robust Scaling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRobust_Scaling(Robust_Scaling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standardization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standardization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardization(Standardization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalization(Normalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encoding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encoding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncoding(Encoding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One Hot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One Hot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneHot(OneHot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One Hot Argumans</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One Hot Argumans</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneHot_Argumans(OneHot_Argumans object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrop(Drop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Categories</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Categories</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategories(Categories object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sparse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sparse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSparse(Sparse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Handle Unk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Handle Unk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHandle_Unk(Handle_Unk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duplicates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duplicates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuplicates(Duplicates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keep</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keep</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeep(Keep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duplicates Argumans</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duplicates Argumans</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuplicates_Argumans(Duplicates_Argumans object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trasformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trasformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrasformation(Trasformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date to Int</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date to Int</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDate_to_Int(Date_to_Int object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Comp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Comp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDate_Comp(Date_Comp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Year</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYear(Year object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Month</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Month</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonth(Month object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Day</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Day</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDay(Day object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dime Reduct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dime Reduct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDime_Reduct(Dime_Reduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCA(PCA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCA Argumans</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCA Argumans</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCA_Argumans(PCA_Argumans object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Varience</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Varience</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarience(Varience object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SVM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SVM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSVM(SVM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neural Networks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neural Networks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeural_Networks(Neural_Networks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MLP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MLP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMLP(MLP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hidden Layer Sizes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hidden Layer Sizes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHidden_Layer_Sizes(Hidden_Layer_Sizes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Voting Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Voting Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoting_Classifier(Voting_Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ensembles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ensembles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnsembles(Ensembles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Random Forest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Random Forest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRandom_Forest(Random_Forest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clustering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clustering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClustering(Clustering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KMedians</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KMedians</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseK_Medians(K_Medians object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KMeans</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KMeans</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseK_Means(K_Means object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameters(Parameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DBSCAN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DBSCAN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBSCAN(DBSCAN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MLP Argumans</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MLP Argumans</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMLP_Argumans(MLP_Argumans object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Iter MLP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Iter MLP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMax_Iter_MLP(Max_Iter_MLP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Random State MLP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Random State MLP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRandom_State_MLP(Random_State_MLP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activation MLP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activation MLP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivation_MLP(Activation_MLP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alpha MLP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alpha MLP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlpha_MLP(Alpha_MLP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plots</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plots</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlots(Plots object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scatter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scatter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScatter(Scatter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cluster Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cluster Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCluster_Evaluation(Cluster_Evaluation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OPtics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OPtics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOPtics(OPtics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preprocess</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preprocess</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreprocess(Preprocess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auto Prep</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto Prep</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuto_Prep(Auto_Prep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Understanding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Understanding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData_Understanding(Data_Understanding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statistics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatistics(Statistics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visualization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visualization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualization(Visualization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correlation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correlation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrelation(Correlation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Deviation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Deviation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandard_Deviation(Standard_Deviation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBar(Bar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear Regression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear Regression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinear_Regression(Linear_Regression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThing(Thing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolBinding(ProtocolBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSource(DataSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analysis Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analysis Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysisOutput(AnalysisOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analysys Triger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analysys Triger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysysTriger(AnalysysTriger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationProtocol(CommunicationProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buffer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuffer(Buffer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MQTT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MQTT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMQTT(MQTT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Online Model Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Online Model Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnlineModelManager(OnlineModelManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopic(Topic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGD Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGD Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGDClassifier(SGDClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passive Aggressive Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passive Aggressive Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassiveAggressiveClassifier(PassiveAggressiveClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perceptron</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perceptron</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerceptron(Perceptron object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Devices</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Devices</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevices(Devices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegression(Regression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logistic Regression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logistic Regression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogistic_Regression(Logistic_Regression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RF Argumans</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RF Argumans</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRF_Argumans(RF_Argumans object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NEstimators RF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NEstimators RF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseN_Estimators_RF(N_Estimators_RF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Criterion RF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Criterion RF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCriterion_RF(Criterion_RF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Random State RF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Random State RF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRandom_State_RF(Random_State_RF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameters DBOP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameters DBOP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameters_DBOP(Parameters_DBOP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MLmodelSwitch
