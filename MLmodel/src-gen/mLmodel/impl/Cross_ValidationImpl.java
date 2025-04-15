/**
 */
package mLmodel.impl;

import java.util.Collection;
import mLmodel.Cross_Validation;
import mLmodel.Cycle;
import mLmodel.MLmodelPackage;
import mLmodel.Plots;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cross Validation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.Cross_ValidationImpl#getAfter <em>After</em>}</li>
 *   <li>{@link mLmodel.impl.Cross_ValidationImpl#getBefore <em>Before</em>}</li>
 *   <li>{@link mLmodel.impl.Cross_ValidationImpl#isPrecision <em>Precision</em>}</li>
 *   <li>{@link mLmodel.impl.Cross_ValidationImpl#isAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link mLmodel.impl.Cross_ValidationImpl#isRecall <em>Recall</em>}</li>
 *   <li>{@link mLmodel.impl.Cross_ValidationImpl#isF1_score <em>F1 score</em>}</li>
 *   <li>{@link mLmodel.impl.Cross_ValidationImpl#getNumber_of_folds <em>Number of folds</em>}</li>
 *   <li>{@link mLmodel.impl.Cross_ValidationImpl#getPlots <em>Plots</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Cross_ValidationImpl extends MinimalEObjectImpl.Container implements Cross_Validation {
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
	 * The default value of the '{@link #isPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRECISION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrecision()
	 * @generated
	 * @ordered
	 */
	protected boolean precision = PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #isAccuracy() <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccuracy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACCURACY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAccuracy() <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccuracy()
	 * @generated
	 * @ordered
	 */
	protected boolean accuracy = ACCURACY_EDEFAULT;

	/**
	 * The default value of the '{@link #isRecall() <em>Recall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRecall()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RECALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRecall() <em>Recall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRecall()
	 * @generated
	 * @ordered
	 */
	protected boolean recall = RECALL_EDEFAULT;

	/**
	 * The default value of the '{@link #isF1_score() <em>F1 score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isF1_score()
	 * @generated
	 * @ordered
	 */
	protected static final boolean F1_SCORE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isF1_score() <em>F1 score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isF1_score()
	 * @generated
	 * @ordered
	 */
	protected boolean f1_score = F1_SCORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber_of_folds() <em>Number of folds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_of_folds()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_FOLDS_EDEFAULT = 5;

	/**
	 * The cached value of the '{@link #getNumber_of_folds() <em>Number of folds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_of_folds()
	 * @generated
	 * @ordered
	 */
	protected int number_of_folds = NUMBER_OF_FOLDS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlots() <em>Plots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlots()
	 * @generated
	 * @ordered
	 */
	protected EList<Plots> plots;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Cross_ValidationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.CROSS_VALIDATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MLmodelPackage.CROSS_VALIDATION__AFTER,
							oldAfter, after));
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
					MLmodelPackage.CROSS_VALIDATION__AFTER, oldAfter, newAfter);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.CROSS_VALIDATION__AFTER, newAfter,
					newAfter));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MLmodelPackage.CROSS_VALIDATION__BEFORE,
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
					MLmodelPackage.CROSS_VALIDATION__BEFORE, oldBefore, newBefore);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.CROSS_VALIDATION__BEFORE, newBefore,
					newBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(boolean newPrecision) {
		boolean oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.CROSS_VALIDATION__PRECISION,
					oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAccuracy() {
		return accuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccuracy(boolean newAccuracy) {
		boolean oldAccuracy = accuracy;
		accuracy = newAccuracy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.CROSS_VALIDATION__ACCURACY,
					oldAccuracy, accuracy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRecall() {
		return recall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecall(boolean newRecall) {
		boolean oldRecall = recall;
		recall = newRecall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.CROSS_VALIDATION__RECALL, oldRecall,
					recall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isF1_score() {
		return f1_score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF1_score(boolean newF1_score) {
		boolean oldF1_score = f1_score;
		f1_score = newF1_score;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.CROSS_VALIDATION__F1_SCORE,
					oldF1_score, f1_score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber_of_folds() {
		return number_of_folds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber_of_folds(int newNumber_of_folds) {
		int oldNumber_of_folds = number_of_folds;
		number_of_folds = newNumber_of_folds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.CROSS_VALIDATION__NUMBER_OF_FOLDS,
					oldNumber_of_folds, number_of_folds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plots> getPlots() {
		if (plots == null) {
			plots = new EObjectContainmentEList<Plots>(Plots.class, this, MLmodelPackage.CROSS_VALIDATION__PLOTS);
		}
		return plots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MLmodelPackage.CROSS_VALIDATION__AFTER:
			if (after != null)
				msgs = ((InternalEObject) after).eInverseRemove(this, MLmodelPackage.CYCLE__BEFORE, Cycle.class, msgs);
			return basicSetAfter((Cycle) otherEnd, msgs);
		case MLmodelPackage.CROSS_VALIDATION__BEFORE:
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
		case MLmodelPackage.CROSS_VALIDATION__AFTER:
			return basicSetAfter(null, msgs);
		case MLmodelPackage.CROSS_VALIDATION__BEFORE:
			return basicSetBefore(null, msgs);
		case MLmodelPackage.CROSS_VALIDATION__PLOTS:
			return ((InternalEList<?>) getPlots()).basicRemove(otherEnd, msgs);
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
		case MLmodelPackage.CROSS_VALIDATION__AFTER:
			if (resolve)
				return getAfter();
			return basicGetAfter();
		case MLmodelPackage.CROSS_VALIDATION__BEFORE:
			if (resolve)
				return getBefore();
			return basicGetBefore();
		case MLmodelPackage.CROSS_VALIDATION__PRECISION:
			return isPrecision();
		case MLmodelPackage.CROSS_VALIDATION__ACCURACY:
			return isAccuracy();
		case MLmodelPackage.CROSS_VALIDATION__RECALL:
			return isRecall();
		case MLmodelPackage.CROSS_VALIDATION__F1_SCORE:
			return isF1_score();
		case MLmodelPackage.CROSS_VALIDATION__NUMBER_OF_FOLDS:
			return getNumber_of_folds();
		case MLmodelPackage.CROSS_VALIDATION__PLOTS:
			return getPlots();
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
		case MLmodelPackage.CROSS_VALIDATION__AFTER:
			setAfter((Cycle) newValue);
			return;
		case MLmodelPackage.CROSS_VALIDATION__BEFORE:
			setBefore((Cycle) newValue);
			return;
		case MLmodelPackage.CROSS_VALIDATION__PRECISION:
			setPrecision((Boolean) newValue);
			return;
		case MLmodelPackage.CROSS_VALIDATION__ACCURACY:
			setAccuracy((Boolean) newValue);
			return;
		case MLmodelPackage.CROSS_VALIDATION__RECALL:
			setRecall((Boolean) newValue);
			return;
		case MLmodelPackage.CROSS_VALIDATION__F1_SCORE:
			setF1_score((Boolean) newValue);
			return;
		case MLmodelPackage.CROSS_VALIDATION__NUMBER_OF_FOLDS:
			setNumber_of_folds((Integer) newValue);
			return;
		case MLmodelPackage.CROSS_VALIDATION__PLOTS:
			getPlots().clear();
			getPlots().addAll((Collection<? extends Plots>) newValue);
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
		case MLmodelPackage.CROSS_VALIDATION__AFTER:
			setAfter((Cycle) null);
			return;
		case MLmodelPackage.CROSS_VALIDATION__BEFORE:
			setBefore((Cycle) null);
			return;
		case MLmodelPackage.CROSS_VALIDATION__PRECISION:
			setPrecision(PRECISION_EDEFAULT);
			return;
		case MLmodelPackage.CROSS_VALIDATION__ACCURACY:
			setAccuracy(ACCURACY_EDEFAULT);
			return;
		case MLmodelPackage.CROSS_VALIDATION__RECALL:
			setRecall(RECALL_EDEFAULT);
			return;
		case MLmodelPackage.CROSS_VALIDATION__F1_SCORE:
			setF1_score(F1_SCORE_EDEFAULT);
			return;
		case MLmodelPackage.CROSS_VALIDATION__NUMBER_OF_FOLDS:
			setNumber_of_folds(NUMBER_OF_FOLDS_EDEFAULT);
			return;
		case MLmodelPackage.CROSS_VALIDATION__PLOTS:
			getPlots().clear();
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
		case MLmodelPackage.CROSS_VALIDATION__AFTER:
			return after != null;
		case MLmodelPackage.CROSS_VALIDATION__BEFORE:
			return before != null;
		case MLmodelPackage.CROSS_VALIDATION__PRECISION:
			return precision != PRECISION_EDEFAULT;
		case MLmodelPackage.CROSS_VALIDATION__ACCURACY:
			return accuracy != ACCURACY_EDEFAULT;
		case MLmodelPackage.CROSS_VALIDATION__RECALL:
			return recall != RECALL_EDEFAULT;
		case MLmodelPackage.CROSS_VALIDATION__F1_SCORE:
			return f1_score != F1_SCORE_EDEFAULT;
		case MLmodelPackage.CROSS_VALIDATION__NUMBER_OF_FOLDS:
			return number_of_folds != NUMBER_OF_FOLDS_EDEFAULT;
		case MLmodelPackage.CROSS_VALIDATION__PLOTS:
			return plots != null && !plots.isEmpty();
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
		result.append(" (precision: ");
		result.append(precision);
		result.append(", accuracy: ");
		result.append(accuracy);
		result.append(", recall: ");
		result.append(recall);
		result.append(", f1_score: ");
		result.append(f1_score);
		result.append(", number_of_folds: ");
		result.append(number_of_folds);
		result.append(')');
		return result.toString();
	}

} //Cross_ValidationImpl
