/**
 */
package mymohsenmodel.util;

import mymohsenmodel.CSV;
import mymohsenmodel.CSV_Argumans;
import mymohsenmodel.Cycle;
import mymohsenmodel.Header;
import mymohsenmodel.ID;
import mymohsenmodel.Import_Data;
import mymohsenmodel.MLmodelPackage;
import mymohsenmodel.Nrows;
import mymohsenmodel.Regular;
import mymohsenmodel.Root;
import mymohsenmodel.Sep;
import mymohsenmodel.Set_Role;
import mymohsenmodel.Target;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mymohsenmodel.MLmodelPackage
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
		public Adapter caseProcess(mymohsenmodel.Process object) {
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
		public Adapter caseHeader(Header object) {
			return createHeaderAdapter();
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
	 * Creates a new adapter for an object of class '{@link mymohsenmodel.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mymohsenmodel.Root
	 * @generated
	 */
	public Adapter createRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mymohsenmodel.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mymohsenmodel.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mymohsenmodel.Cycle <em>Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mymohsenmodel.Cycle
	 * @generated
	 */
	public Adapter createCycleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mymohsenmodel.Import_Data <em>Import Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mymohsenmodel.Import_Data
	 * @generated
	 */
	public Adapter createImport_DataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mymohsenmodel.CSV <em>CSV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mymohsenmodel.CSV
	 * @generated
	 */
	public Adapter createCSVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mymohsenmodel.CSV_Argumans <em>CSV Argumans</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mymohsenmodel.CSV_Argumans
	 * @generated
	 */
	public Adapter createCSV_ArgumansAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mymohsenmodel.Sep <em>Sep</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mymohsenmodel.Sep
	 * @generated
	 */
	public Adapter createSepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mymohsenmodel.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mymohsenmodel.Header
	 * @generated
	 */
	public Adapter createHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mymohsenmodel.Nrows <em>Nrows</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mymohsenmodel.Nrows
	 * @generated
	 */
	public Adapter createNrowsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mymohsenmodel.Set_Role <em>Set Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mymohsenmodel.Set_Role
	 * @generated
	 */
	public Adapter createSet_RoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mymohsenmodel.ID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mymohsenmodel.ID
	 * @generated
	 */
	public Adapter createIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mymohsenmodel.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mymohsenmodel.Target
	 * @generated
	 */
	public Adapter createTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mymohsenmodel.Regular <em>Regular</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mymohsenmodel.Regular
	 * @generated
	 */
	public Adapter createRegularAdapter() {
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
