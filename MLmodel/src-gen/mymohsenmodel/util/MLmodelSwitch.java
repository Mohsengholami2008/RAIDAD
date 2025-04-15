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
 * @see mymohsenmodel.MLmodelPackage
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
			mymohsenmodel.Process process = (mymohsenmodel.Process) theEObject;
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
		case MLmodelPackage.HEADER: {
			Header header = (Header) theEObject;
			T result = caseHeader(header);
			if (result == null)
				result = caseCSV_Argumans(header);
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
	public T caseProcess(mymohsenmodel.Process object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeader(Header object) {
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
