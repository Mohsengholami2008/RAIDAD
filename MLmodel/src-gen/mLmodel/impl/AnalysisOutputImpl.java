/**
 */
package mLmodel.impl;

import javax.xml.datatype.XMLGregorianCalendar;
import mLmodel.Action;
import mLmodel.AnalysisOutput;
import mLmodel.Cycle;
import mLmodel.MLmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.AnalysisOutputImpl#getAfter <em>After</em>}</li>
 *   <li>{@link mLmodel.impl.AnalysisOutputImpl#getBefore <em>Before</em>}</li>
 *   <li>{@link mLmodel.impl.AnalysisOutputImpl#isPrecision <em>Precision</em>}</li>
 *   <li>{@link mLmodel.impl.AnalysisOutputImpl#isAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link mLmodel.impl.AnalysisOutputImpl#isRecall <em>Recall</em>}</li>
 *   <li>{@link mLmodel.impl.AnalysisOutputImpl#isF1_score <em>F1 score</em>}</li>
 *   <li>{@link mLmodel.impl.AnalysisOutputImpl#getAction <em>Action</em>}</li>
 *   <li>{@link mLmodel.impl.AnalysisOutputImpl#getResultValue <em>Result Value</em>}</li>
 *   <li>{@link mLmodel.impl.AnalysisOutputImpl#getResultType <em>Result Type</em>}</li>
 *   <li>{@link mLmodel.impl.AnalysisOutputImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisOutputImpl extends MinimalEObjectImpl.Container implements AnalysisOutput {
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
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * The default value of the '{@link #getResultValue() <em>Result Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getResultValue() <em>Result Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultValue()
	 * @generated
	 * @ordered
	 */
	protected String resultValue = RESULT_VALUE_EDEFAULT;
	/**
	 * The default value of the '{@link #getResultType() <em>Result Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultType()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getResultType() <em>Result Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultType()
	 * @generated
	 * @ordered
	 */
	protected String resultType = RESULT_TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TIMESTAMP_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.ANALYSIS_OUTPUT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MLmodelPackage.ANALYSIS_OUTPUT__AFTER,
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
					MLmodelPackage.ANALYSIS_OUTPUT__AFTER, oldAfter, newAfter);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.ANALYSIS_OUTPUT__AFTER, newAfter,
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MLmodelPackage.ANALYSIS_OUTPUT__BEFORE,
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
					MLmodelPackage.ANALYSIS_OUTPUT__BEFORE, oldBefore, newBefore);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.ANALYSIS_OUTPUT__BEFORE, newBefore,
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
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.ANALYSIS_OUTPUT__PRECISION,
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
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.ANALYSIS_OUTPUT__ACCURACY, oldAccuracy,
					accuracy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.ANALYSIS_OUTPUT__RECALL, oldRecall,
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
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.ANALYSIS_OUTPUT__F1_SCORE, oldF1_score,
					f1_score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject) action;
			action = (Action) eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MLmodelPackage.ANALYSIS_OUTPUT__ACTION,
							oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.ANALYSIS_OUTPUT__ACTION, oldAction,
					action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultValue() {
		return resultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultValue(String newResultValue) {
		String oldResultValue = resultValue;
		resultValue = newResultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.ANALYSIS_OUTPUT__RESULT_VALUE,
					oldResultValue, resultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResultType() {
		return resultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultType(String newResultType) {
		String oldResultType = resultType;
		resultType = newResultType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.ANALYSIS_OUTPUT__RESULT_TYPE,
					oldResultType, resultType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(XMLGregorianCalendar newTimestamp) {
		XMLGregorianCalendar oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.ANALYSIS_OUTPUT__TIMESTAMP,
					oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MLmodelPackage.ANALYSIS_OUTPUT__AFTER:
			if (after != null)
				msgs = ((InternalEObject) after).eInverseRemove(this, MLmodelPackage.CYCLE__BEFORE, Cycle.class, msgs);
			return basicSetAfter((Cycle) otherEnd, msgs);
		case MLmodelPackage.ANALYSIS_OUTPUT__BEFORE:
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
		case MLmodelPackage.ANALYSIS_OUTPUT__AFTER:
			return basicSetAfter(null, msgs);
		case MLmodelPackage.ANALYSIS_OUTPUT__BEFORE:
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
		case MLmodelPackage.ANALYSIS_OUTPUT__AFTER:
			if (resolve)
				return getAfter();
			return basicGetAfter();
		case MLmodelPackage.ANALYSIS_OUTPUT__BEFORE:
			if (resolve)
				return getBefore();
			return basicGetBefore();
		case MLmodelPackage.ANALYSIS_OUTPUT__PRECISION:
			return isPrecision();
		case MLmodelPackage.ANALYSIS_OUTPUT__ACCURACY:
			return isAccuracy();
		case MLmodelPackage.ANALYSIS_OUTPUT__RECALL:
			return isRecall();
		case MLmodelPackage.ANALYSIS_OUTPUT__F1_SCORE:
			return isF1_score();
		case MLmodelPackage.ANALYSIS_OUTPUT__ACTION:
			if (resolve)
				return getAction();
			return basicGetAction();
		case MLmodelPackage.ANALYSIS_OUTPUT__RESULT_VALUE:
			return getResultValue();
		case MLmodelPackage.ANALYSIS_OUTPUT__RESULT_TYPE:
			return getResultType();
		case MLmodelPackage.ANALYSIS_OUTPUT__TIMESTAMP:
			return getTimestamp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MLmodelPackage.ANALYSIS_OUTPUT__AFTER:
			setAfter((Cycle) newValue);
			return;
		case MLmodelPackage.ANALYSIS_OUTPUT__BEFORE:
			setBefore((Cycle) newValue);
			return;
		case MLmodelPackage.ANALYSIS_OUTPUT__PRECISION:
			setPrecision((Boolean) newValue);
			return;
		case MLmodelPackage.ANALYSIS_OUTPUT__ACCURACY:
			setAccuracy((Boolean) newValue);
			return;
		case MLmodelPackage.ANALYSIS_OUTPUT__RECALL:
			setRecall((Boolean) newValue);
			return;
		case MLmodelPackage.ANALYSIS_OUTPUT__F1_SCORE:
			setF1_score((Boolean) newValue);
			return;
		case MLmodelPackage.ANALYSIS_OUTPUT__ACTION:
			setAction((Action) newValue);
			return;
		case MLmodelPackage.ANALYSIS_OUTPUT__RESULT_VALUE:
			setResultValue((String) newValue);
			return;
		case MLmodelPackage.ANALYSIS_OUTPUT__RESULT_TYPE:
			setResultType((String) newValue);
			return;
		case MLmodelPackage.ANALYSIS_OUTPUT__TIMESTAMP:
			setTimestamp((XMLGregorianCalendar) newValue);
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
		case MLmodelPackage.ANALYSIS_OUTPUT__AFTER:
			setAfter((Cycle) null);
			return;
		case MLmodelPackage.ANALYSIS_OUTPUT__BEFORE:
			setBefore((Cycle) null);
			return;
		case MLmodelPackage.ANALYSIS_OUTPUT__PRECISION:
			setPrecision(PRECISION_EDEFAULT);
			return;
		case MLmodelPackage.ANALYSIS_OUTPUT__ACCURACY:
			setAccuracy(ACCURACY_EDEFAULT);
			return;
		case MLmodelPackage.ANALYSIS_OUTPUT__RECALL:
			setRecall(RECALL_EDEFAULT);
			return;
		case MLmodelPackage.ANALYSIS_OUTPUT__F1_SCORE:
			setF1_score(F1_SCORE_EDEFAULT);
			return;
		case MLmodelPackage.ANALYSIS_OUTPUT__ACTION:
			setAction((Action) null);
			return;
		case MLmodelPackage.ANALYSIS_OUTPUT__RESULT_VALUE:
			setResultValue(RESULT_VALUE_EDEFAULT);
			return;
		case MLmodelPackage.ANALYSIS_OUTPUT__RESULT_TYPE:
			setResultType(RESULT_TYPE_EDEFAULT);
			return;
		case MLmodelPackage.ANALYSIS_OUTPUT__TIMESTAMP:
			setTimestamp(TIMESTAMP_EDEFAULT);
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
		case MLmodelPackage.ANALYSIS_OUTPUT__AFTER:
			return after != null;
		case MLmodelPackage.ANALYSIS_OUTPUT__BEFORE:
			return before != null;
		case MLmodelPackage.ANALYSIS_OUTPUT__PRECISION:
			return precision != PRECISION_EDEFAULT;
		case MLmodelPackage.ANALYSIS_OUTPUT__ACCURACY:
			return accuracy != ACCURACY_EDEFAULT;
		case MLmodelPackage.ANALYSIS_OUTPUT__RECALL:
			return recall != RECALL_EDEFAULT;
		case MLmodelPackage.ANALYSIS_OUTPUT__F1_SCORE:
			return f1_score != F1_SCORE_EDEFAULT;
		case MLmodelPackage.ANALYSIS_OUTPUT__ACTION:
			return action != null;
		case MLmodelPackage.ANALYSIS_OUTPUT__RESULT_VALUE:
			return RESULT_VALUE_EDEFAULT == null ? resultValue != null : !RESULT_VALUE_EDEFAULT.equals(resultValue);
		case MLmodelPackage.ANALYSIS_OUTPUT__RESULT_TYPE:
			return RESULT_TYPE_EDEFAULT == null ? resultType != null : !RESULT_TYPE_EDEFAULT.equals(resultType);
		case MLmodelPackage.ANALYSIS_OUTPUT__TIMESTAMP:
			return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
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
		result.append(", resultValue: ");
		result.append(resultValue);
		result.append(", resultType: ");
		result.append(resultType);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //AnalysisOutputImpl
