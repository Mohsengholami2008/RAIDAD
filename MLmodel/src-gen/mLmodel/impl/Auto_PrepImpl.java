/**
 */
package mLmodel.impl;

import java.util.Collection;

import mLmodel.Auto_Prep;
import mLmodel.Cycle;
import mLmodel.MLmodelPackage;
import mLmodel.Regular;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auto Prep</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.Auto_PrepImpl#getAfter <em>After</em>}</li>
 *   <li>{@link mLmodel.impl.Auto_PrepImpl#getBefore <em>Before</em>}</li>
 *   <li>{@link mLmodel.impl.Auto_PrepImpl#getRegular <em>Regular</em>}</li>
 *   <li>{@link mLmodel.impl.Auto_PrepImpl#isSave_file <em>Save file</em>}</li>
 *   <li>{@link mLmodel.impl.Auto_PrepImpl#isPrint_data <em>Print data</em>}</li>
 *   <li>{@link mLmodel.impl.Auto_PrepImpl#isSimple_Imputer <em>Simple Imputer</em>}</li>
 *   <li>{@link mLmodel.impl.Auto_PrepImpl#isKNN_Imputer <em>KNN Imputer</em>}</li>
 *   <li>{@link mLmodel.impl.Auto_PrepImpl#isScaling <em>Scaling</em>}</li>
 *   <li>{@link mLmodel.impl.Auto_PrepImpl#isEncoding <em>Encoding</em>}</li>
 *   <li>{@link mLmodel.impl.Auto_PrepImpl#isDuplicates <em>Duplicates</em>}</li>
 *   <li>{@link mLmodel.impl.Auto_PrepImpl#isTrasformation <em>Trasformation</em>}</li>
 *   <li>{@link mLmodel.impl.Auto_PrepImpl#isDime_Reduct <em>Dime Reduct</em>}</li>
 *   <li>{@link mLmodel.impl.Auto_PrepImpl#isDate_to_Int <em>Date to Int</em>}</li>
 *   <li>{@link mLmodel.impl.Auto_PrepImpl#isDrop <em>Drop</em>}</li>
 *   <li>{@link mLmodel.impl.Auto_PrepImpl#getMiss_id <em>Miss id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Auto_PrepImpl extends MinimalEObjectImpl.Container implements Auto_Prep {
	/**
	 * The cached value of the '{@link #getAfter() <em>After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfter()
	 * @generated
	 * @ordered
	 */
	protected Cycle after;

	/**
	 * The cached value of the '{@link #getBefore() <em>Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBefore()
	 * @generated
	 * @ordered
	 */
	protected Cycle before;

	/**
	 * The cached value of the '{@link #getRegular() <em>Regular</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegular()
	 * @generated
	 * @ordered
	 */
	protected EList<Regular> regular;

	/**
	 * The default value of the '{@link #isSave_file() <em>Save file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSave_file()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAVE_FILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSave_file() <em>Save file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSave_file()
	 * @generated
	 * @ordered
	 */
	protected boolean save_file = SAVE_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrint_data() <em>Print data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrint_data()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRINT_DATA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrint_data() <em>Print data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrint_data()
	 * @generated
	 * @ordered
	 */
	protected boolean print_data = PRINT_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #isSimple_Imputer() <em>Simple Imputer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSimple_Imputer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SIMPLE_IMPUTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSimple_Imputer() <em>Simple Imputer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSimple_Imputer()
	 * @generated
	 * @ordered
	 */
	protected boolean simple_Imputer = SIMPLE_IMPUTER_EDEFAULT;

	/**
	 * The default value of the '{@link #isKNN_Imputer() <em>KNN Imputer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKNN_Imputer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KNN_IMPUTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKNN_Imputer() <em>KNN Imputer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKNN_Imputer()
	 * @generated
	 * @ordered
	 */
	protected boolean knN_Imputer = KNN_IMPUTER_EDEFAULT;

	/**
	 * The default value of the '{@link #isScaling() <em>Scaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScaling()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SCALING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isScaling() <em>Scaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScaling()
	 * @generated
	 * @ordered
	 */
	protected boolean scaling = SCALING_EDEFAULT;

	/**
	 * The default value of the '{@link #isEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENCODING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncoding()
	 * @generated
	 * @ordered
	 */
	protected boolean encoding = ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #isDuplicates() <em>Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDuplicates()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DUPLICATES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDuplicates() <em>Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDuplicates()
	 * @generated
	 * @ordered
	 */
	protected boolean duplicates = DUPLICATES_EDEFAULT;

	/**
	 * The default value of the '{@link #isTrasformation() <em>Trasformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrasformation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRASFORMATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTrasformation() <em>Trasformation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrasformation()
	 * @generated
	 * @ordered
	 */
	protected boolean trasformation = TRASFORMATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isDime_Reduct() <em>Dime Reduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDime_Reduct()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DIME_REDUCT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDime_Reduct() <em>Dime Reduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDime_Reduct()
	 * @generated
	 * @ordered
	 */
	protected boolean dime_Reduct = DIME_REDUCT_EDEFAULT;

	/**
	 * The default value of the '{@link #isDate_to_Int() <em>Date to Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDate_to_Int()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DATE_TO_INT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDate_to_Int() <em>Date to Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDate_to_Int()
	 * @generated
	 * @ordered
	 */
	protected boolean date_to_Int = DATE_TO_INT_EDEFAULT;

	/**
	 * The default value of the '{@link #isDrop() <em>Drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDrop()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DROP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDrop() <em>Drop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDrop()
	 * @generated
	 * @ordered
	 */
	protected boolean drop = DROP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMiss_id() <em>Miss id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiss_id()
	 * @generated
	 * @ordered
	 */
	protected EList<String> miss_id;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Auto_PrepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.AUTO_PREP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cycle getAfter() {
		if (after != null && after.eIsProxy()) {
			InternalEObject oldAfter = (InternalEObject) after;
			after = (Cycle) eResolveProxy(oldAfter);
			if (after != oldAfter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MLmodelPackage.AUTO_PREP__AFTER, oldAfter,
							after));
			}
		}
		return after;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cycle basicGetAfter() {
		return after;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAfter(Cycle newAfter, NotificationChain msgs) {
		Cycle oldAfter = after;
		after = newAfter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MLmodelPackage.AUTO_PREP__AFTER, oldAfter, newAfter);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfter(Cycle newAfter) {
		if (newAfter != after) {
			NotificationChain msgs = null;
			if (after != null)
				msgs = ((InternalEObject) after).eInverseRemove(this, MLmodelPackage.CYCLE__BEFORE, Cycle.class, msgs);
			if (newAfter != null)
				msgs = ((InternalEObject) newAfter).eInverseAdd(this, MLmodelPackage.CYCLE__BEFORE, Cycle.class, msgs);
			msgs = basicSetAfter(newAfter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.AUTO_PREP__AFTER, newAfter, newAfter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cycle getBefore() {
		if (before != null && before.eIsProxy()) {
			InternalEObject oldBefore = (InternalEObject) before;
			before = (Cycle) eResolveProxy(oldBefore);
			if (before != oldBefore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MLmodelPackage.AUTO_PREP__BEFORE,
							oldBefore, before));
			}
		}
		return before;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cycle basicGetBefore() {
		return before;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBefore(Cycle newBefore, NotificationChain msgs) {
		Cycle oldBefore = before;
		before = newBefore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MLmodelPackage.AUTO_PREP__BEFORE, oldBefore, newBefore);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBefore(Cycle newBefore) {
		if (newBefore != before) {
			NotificationChain msgs = null;
			if (before != null)
				msgs = ((InternalEObject) before).eInverseRemove(this, MLmodelPackage.CYCLE__AFTER, Cycle.class, msgs);
			if (newBefore != null)
				msgs = ((InternalEObject) newBefore).eInverseAdd(this, MLmodelPackage.CYCLE__AFTER, Cycle.class, msgs);
			msgs = basicSetBefore(newBefore, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.AUTO_PREP__BEFORE, newBefore,
					newBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Regular> getRegular() {
		if (regular == null) {
			regular = new EObjectResolvingEList<Regular>(Regular.class, this, MLmodelPackage.AUTO_PREP__REGULAR);
		}
		return regular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSave_file() {
		return save_file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSave_file(boolean newSave_file) {
		boolean oldSave_file = save_file;
		save_file = newSave_file;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.AUTO_PREP__SAVE_FILE, oldSave_file,
					save_file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrint_data() {
		return print_data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrint_data(boolean newPrint_data) {
		boolean oldPrint_data = print_data;
		print_data = newPrint_data;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.AUTO_PREP__PRINT_DATA, oldPrint_data,
					print_data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSimple_Imputer() {
		return simple_Imputer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimple_Imputer(boolean newSimple_Imputer) {
		boolean oldSimple_Imputer = simple_Imputer;
		simple_Imputer = newSimple_Imputer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.AUTO_PREP__SIMPLE_IMPUTER,
					oldSimple_Imputer, simple_Imputer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isKNN_Imputer() {
		return knN_Imputer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKNN_Imputer(boolean newKNN_Imputer) {
		boolean oldKNN_Imputer = knN_Imputer;
		knN_Imputer = newKNN_Imputer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.AUTO_PREP__KNN_IMPUTER, oldKNN_Imputer,
					knN_Imputer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isScaling() {
		return scaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaling(boolean newScaling) {
		boolean oldScaling = scaling;
		scaling = newScaling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.AUTO_PREP__SCALING, oldScaling,
					scaling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(boolean newEncoding) {
		boolean oldEncoding = encoding;
		encoding = newEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.AUTO_PREP__ENCODING, oldEncoding,
					encoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDuplicates() {
		return duplicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuplicates(boolean newDuplicates) {
		boolean oldDuplicates = duplicates;
		duplicates = newDuplicates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.AUTO_PREP__DUPLICATES, oldDuplicates,
					duplicates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTrasformation() {
		return trasformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrasformation(boolean newTrasformation) {
		boolean oldTrasformation = trasformation;
		trasformation = newTrasformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.AUTO_PREP__TRASFORMATION,
					oldTrasformation, trasformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDime_Reduct() {
		return dime_Reduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDime_Reduct(boolean newDime_Reduct) {
		boolean oldDime_Reduct = dime_Reduct;
		dime_Reduct = newDime_Reduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.AUTO_PREP__DIME_REDUCT, oldDime_Reduct,
					dime_Reduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDate_to_Int() {
		return date_to_Int;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate_to_Int(boolean newDate_to_Int) {
		boolean oldDate_to_Int = date_to_Int;
		date_to_Int = newDate_to_Int;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.AUTO_PREP__DATE_TO_INT, oldDate_to_Int,
					date_to_Int));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDrop() {
		return drop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrop(boolean newDrop) {
		boolean oldDrop = drop;
		drop = newDrop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.AUTO_PREP__DROP, oldDrop, drop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMiss_id() {
		if (miss_id == null) {
			miss_id = new EDataTypeUniqueEList<String>(String.class, this, MLmodelPackage.AUTO_PREP__MISS_ID);
		}
		return miss_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MLmodelPackage.AUTO_PREP__AFTER:
			if (after != null)
				msgs = ((InternalEObject) after).eInverseRemove(this, MLmodelPackage.CYCLE__BEFORE, Cycle.class, msgs);
			return basicSetAfter((Cycle) otherEnd, msgs);
		case MLmodelPackage.AUTO_PREP__BEFORE:
			if (before != null)
				msgs = ((InternalEObject) before).eInverseRemove(this, MLmodelPackage.CYCLE__AFTER, Cycle.class, msgs);
			return basicSetBefore((Cycle) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MLmodelPackage.AUTO_PREP__AFTER:
			return basicSetAfter(null, msgs);
		case MLmodelPackage.AUTO_PREP__BEFORE:
			return basicSetBefore(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.AUTO_PREP__AFTER:
			if (resolve)
				return getAfter();
			return basicGetAfter();
		case MLmodelPackage.AUTO_PREP__BEFORE:
			if (resolve)
				return getBefore();
			return basicGetBefore();
		case MLmodelPackage.AUTO_PREP__REGULAR:
			return getRegular();
		case MLmodelPackage.AUTO_PREP__SAVE_FILE:
			return isSave_file();
		case MLmodelPackage.AUTO_PREP__PRINT_DATA:
			return isPrint_data();
		case MLmodelPackage.AUTO_PREP__SIMPLE_IMPUTER:
			return isSimple_Imputer();
		case MLmodelPackage.AUTO_PREP__KNN_IMPUTER:
			return isKNN_Imputer();
		case MLmodelPackage.AUTO_PREP__SCALING:
			return isScaling();
		case MLmodelPackage.AUTO_PREP__ENCODING:
			return isEncoding();
		case MLmodelPackage.AUTO_PREP__DUPLICATES:
			return isDuplicates();
		case MLmodelPackage.AUTO_PREP__TRASFORMATION:
			return isTrasformation();
		case MLmodelPackage.AUTO_PREP__DIME_REDUCT:
			return isDime_Reduct();
		case MLmodelPackage.AUTO_PREP__DATE_TO_INT:
			return isDate_to_Int();
		case MLmodelPackage.AUTO_PREP__DROP:
			return isDrop();
		case MLmodelPackage.AUTO_PREP__MISS_ID:
			return getMiss_id();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MLmodelPackage.AUTO_PREP__AFTER:
			setAfter((Cycle) newValue);
			return;
		case MLmodelPackage.AUTO_PREP__BEFORE:
			setBefore((Cycle) newValue);
			return;
		case MLmodelPackage.AUTO_PREP__REGULAR:
			getRegular().clear();
			getRegular().addAll((Collection<? extends Regular>) newValue);
			return;
		case MLmodelPackage.AUTO_PREP__SAVE_FILE:
			setSave_file((Boolean) newValue);
			return;
		case MLmodelPackage.AUTO_PREP__PRINT_DATA:
			setPrint_data((Boolean) newValue);
			return;
		case MLmodelPackage.AUTO_PREP__SIMPLE_IMPUTER:
			setSimple_Imputer((Boolean) newValue);
			return;
		case MLmodelPackage.AUTO_PREP__KNN_IMPUTER:
			setKNN_Imputer((Boolean) newValue);
			return;
		case MLmodelPackage.AUTO_PREP__SCALING:
			setScaling((Boolean) newValue);
			return;
		case MLmodelPackage.AUTO_PREP__ENCODING:
			setEncoding((Boolean) newValue);
			return;
		case MLmodelPackage.AUTO_PREP__DUPLICATES:
			setDuplicates((Boolean) newValue);
			return;
		case MLmodelPackage.AUTO_PREP__TRASFORMATION:
			setTrasformation((Boolean) newValue);
			return;
		case MLmodelPackage.AUTO_PREP__DIME_REDUCT:
			setDime_Reduct((Boolean) newValue);
			return;
		case MLmodelPackage.AUTO_PREP__DATE_TO_INT:
			setDate_to_Int((Boolean) newValue);
			return;
		case MLmodelPackage.AUTO_PREP__DROP:
			setDrop((Boolean) newValue);
			return;
		case MLmodelPackage.AUTO_PREP__MISS_ID:
			getMiss_id().clear();
			getMiss_id().addAll((Collection<? extends String>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MLmodelPackage.AUTO_PREP__AFTER:
			setAfter((Cycle) null);
			return;
		case MLmodelPackage.AUTO_PREP__BEFORE:
			setBefore((Cycle) null);
			return;
		case MLmodelPackage.AUTO_PREP__REGULAR:
			getRegular().clear();
			return;
		case MLmodelPackage.AUTO_PREP__SAVE_FILE:
			setSave_file(SAVE_FILE_EDEFAULT);
			return;
		case MLmodelPackage.AUTO_PREP__PRINT_DATA:
			setPrint_data(PRINT_DATA_EDEFAULT);
			return;
		case MLmodelPackage.AUTO_PREP__SIMPLE_IMPUTER:
			setSimple_Imputer(SIMPLE_IMPUTER_EDEFAULT);
			return;
		case MLmodelPackage.AUTO_PREP__KNN_IMPUTER:
			setKNN_Imputer(KNN_IMPUTER_EDEFAULT);
			return;
		case MLmodelPackage.AUTO_PREP__SCALING:
			setScaling(SCALING_EDEFAULT);
			return;
		case MLmodelPackage.AUTO_PREP__ENCODING:
			setEncoding(ENCODING_EDEFAULT);
			return;
		case MLmodelPackage.AUTO_PREP__DUPLICATES:
			setDuplicates(DUPLICATES_EDEFAULT);
			return;
		case MLmodelPackage.AUTO_PREP__TRASFORMATION:
			setTrasformation(TRASFORMATION_EDEFAULT);
			return;
		case MLmodelPackage.AUTO_PREP__DIME_REDUCT:
			setDime_Reduct(DIME_REDUCT_EDEFAULT);
			return;
		case MLmodelPackage.AUTO_PREP__DATE_TO_INT:
			setDate_to_Int(DATE_TO_INT_EDEFAULT);
			return;
		case MLmodelPackage.AUTO_PREP__DROP:
			setDrop(DROP_EDEFAULT);
			return;
		case MLmodelPackage.AUTO_PREP__MISS_ID:
			getMiss_id().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MLmodelPackage.AUTO_PREP__AFTER:
			return after != null;
		case MLmodelPackage.AUTO_PREP__BEFORE:
			return before != null;
		case MLmodelPackage.AUTO_PREP__REGULAR:
			return regular != null && !regular.isEmpty();
		case MLmodelPackage.AUTO_PREP__SAVE_FILE:
			return save_file != SAVE_FILE_EDEFAULT;
		case MLmodelPackage.AUTO_PREP__PRINT_DATA:
			return print_data != PRINT_DATA_EDEFAULT;
		case MLmodelPackage.AUTO_PREP__SIMPLE_IMPUTER:
			return simple_Imputer != SIMPLE_IMPUTER_EDEFAULT;
		case MLmodelPackage.AUTO_PREP__KNN_IMPUTER:
			return knN_Imputer != KNN_IMPUTER_EDEFAULT;
		case MLmodelPackage.AUTO_PREP__SCALING:
			return scaling != SCALING_EDEFAULT;
		case MLmodelPackage.AUTO_PREP__ENCODING:
			return encoding != ENCODING_EDEFAULT;
		case MLmodelPackage.AUTO_PREP__DUPLICATES:
			return duplicates != DUPLICATES_EDEFAULT;
		case MLmodelPackage.AUTO_PREP__TRASFORMATION:
			return trasformation != TRASFORMATION_EDEFAULT;
		case MLmodelPackage.AUTO_PREP__DIME_REDUCT:
			return dime_Reduct != DIME_REDUCT_EDEFAULT;
		case MLmodelPackage.AUTO_PREP__DATE_TO_INT:
			return date_to_Int != DATE_TO_INT_EDEFAULT;
		case MLmodelPackage.AUTO_PREP__DROP:
			return drop != DROP_EDEFAULT;
		case MLmodelPackage.AUTO_PREP__MISS_ID:
			return miss_id != null && !miss_id.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (save_file: ");
		result.append(save_file);
		result.append(", print_data: ");
		result.append(print_data);
		result.append(", Simple_Imputer: ");
		result.append(simple_Imputer);
		result.append(", KNN_Imputer: ");
		result.append(knN_Imputer);
		result.append(", Scaling: ");
		result.append(scaling);
		result.append(", Encoding: ");
		result.append(encoding);
		result.append(", duplicates: ");
		result.append(duplicates);
		result.append(", Trasformation: ");
		result.append(trasformation);
		result.append(", Dime_Reduct: ");
		result.append(dime_Reduct);
		result.append(", Date_to_Int: ");
		result.append(date_to_Int);
		result.append(", drop: ");
		result.append(drop);
		result.append(", miss_id: ");
		result.append(miss_id);
		result.append(')');
		return result.toString();
	}

} //Auto_PrepImpl
