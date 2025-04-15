/**
 */
package mymohsenmodel.impl;

import mymohsenmodel.CSV;
import mymohsenmodel.Enum_CSV_Sep;
import mymohsenmodel.Header;
import mymohsenmodel.ID;
import mymohsenmodel.MLmodelFactory;
import mymohsenmodel.MLmodelPackage;
import mymohsenmodel.Nrows;
import mymohsenmodel.Regular;
import mymohsenmodel.Root;
import mymohsenmodel.Sep;
import mymohsenmodel.Target;

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
		case MLmodelPackage.HEADER:
			return createHeader();
		case MLmodelPackage.NROWS:
			return createNrows();
		case MLmodelPackage.ID:
			return createID();
		case MLmodelPackage.TARGET:
			return createTarget();
		case MLmodelPackage.REGULAR:
			return createRegular();
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
	public mymohsenmodel.Process createProcess() {
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
	public Header createHeader() {
		HeaderImpl header = new HeaderImpl();
		return header;
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
