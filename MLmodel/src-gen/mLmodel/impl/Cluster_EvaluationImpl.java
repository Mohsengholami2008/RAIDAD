/**
 */
package mLmodel.impl;

import mLmodel.Cluster_Evaluation;
import mLmodel.Cycle;
import mLmodel.MLmodelPackage;
import mLmodel.Scatter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cluster Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.Cluster_EvaluationImpl#getAfter <em>After</em>}</li>
 *   <li>{@link mLmodel.impl.Cluster_EvaluationImpl#getBefore <em>Before</em>}</li>
 *   <li>{@link mLmodel.impl.Cluster_EvaluationImpl#getScatter <em>Scatter</em>}</li>
 *   <li>{@link mLmodel.impl.Cluster_EvaluationImpl#isCluster_sizes <em>Cluster sizes</em>}</li>
 *   <li>{@link mLmodel.impl.Cluster_EvaluationImpl#isCluster_centers_features <em>Cluster centers features</em>}</li>
 *   <li>{@link mLmodel.impl.Cluster_EvaluationImpl#isCluster_centers_standard_deviation <em>Cluster centers standard deviation</em>}</li>
 *   <li>{@link mLmodel.impl.Cluster_EvaluationImpl#isCluster_centers <em>Cluster centers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Cluster_EvaluationImpl extends MinimalEObjectImpl.Container implements Cluster_Evaluation {
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
	 * The cached value of the '{@link #getScatter() <em>Scatter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScatter()
	 * @generated
	 * @ordered
	 */
	protected Scatter scatter;

	/**
	 * The default value of the '{@link #isCluster_sizes() <em>Cluster sizes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCluster_sizes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLUSTER_SIZES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCluster_sizes() <em>Cluster sizes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCluster_sizes()
	 * @generated
	 * @ordered
	 */
	protected boolean cluster_sizes = CLUSTER_SIZES_EDEFAULT;

	/**
	 * The default value of the '{@link #isCluster_centers_features() <em>Cluster centers features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCluster_centers_features()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLUSTER_CENTERS_FEATURES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCluster_centers_features() <em>Cluster centers features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCluster_centers_features()
	 * @generated
	 * @ordered
	 */
	protected boolean cluster_centers_features = CLUSTER_CENTERS_FEATURES_EDEFAULT;

	/**
	 * The default value of the '{@link #isCluster_centers_standard_deviation() <em>Cluster centers standard deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCluster_centers_standard_deviation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLUSTER_CENTERS_STANDARD_DEVIATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCluster_centers_standard_deviation() <em>Cluster centers standard deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCluster_centers_standard_deviation()
	 * @generated
	 * @ordered
	 */
	protected boolean cluster_centers_standard_deviation = CLUSTER_CENTERS_STANDARD_DEVIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isCluster_centers() <em>Cluster centers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCluster_centers()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLUSTER_CENTERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCluster_centers() <em>Cluster centers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCluster_centers()
	 * @generated
	 * @ordered
	 */
	protected boolean cluster_centers = CLUSTER_CENTERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Cluster_EvaluationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.CLUSTER_EVALUATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MLmodelPackage.CLUSTER_EVALUATION__AFTER,
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
					MLmodelPackage.CLUSTER_EVALUATION__AFTER, oldAfter, newAfter);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.CLUSTER_EVALUATION__AFTER, newAfter,
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MLmodelPackage.CLUSTER_EVALUATION__BEFORE,
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
					MLmodelPackage.CLUSTER_EVALUATION__BEFORE, oldBefore, newBefore);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.CLUSTER_EVALUATION__BEFORE, newBefore,
					newBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scatter getScatter() {
		return scatter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScatter(Scatter newScatter, NotificationChain msgs) {
		Scatter oldScatter = scatter;
		scatter = newScatter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MLmodelPackage.CLUSTER_EVALUATION__SCATTER, oldScatter, newScatter);
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
	public void setScatter(Scatter newScatter) {
		if (newScatter != scatter) {
			NotificationChain msgs = null;
			if (scatter != null)
				msgs = ((InternalEObject) scatter).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MLmodelPackage.CLUSTER_EVALUATION__SCATTER, null, msgs);
			if (newScatter != null)
				msgs = ((InternalEObject) newScatter).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MLmodelPackage.CLUSTER_EVALUATION__SCATTER, null, msgs);
			msgs = basicSetScatter(newScatter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.CLUSTER_EVALUATION__SCATTER,
					newScatter, newScatter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCluster_sizes() {
		return cluster_sizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCluster_sizes(boolean newCluster_sizes) {
		boolean oldCluster_sizes = cluster_sizes;
		cluster_sizes = newCluster_sizes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.CLUSTER_EVALUATION__CLUSTER_SIZES,
					oldCluster_sizes, cluster_sizes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCluster_centers_features() {
		return cluster_centers_features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCluster_centers_features(boolean newCluster_centers_features) {
		boolean oldCluster_centers_features = cluster_centers_features;
		cluster_centers_features = newCluster_centers_features;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MLmodelPackage.CLUSTER_EVALUATION__CLUSTER_CENTERS_FEATURES, oldCluster_centers_features,
					cluster_centers_features));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCluster_centers_standard_deviation() {
		return cluster_centers_standard_deviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCluster_centers_standard_deviation(boolean newCluster_centers_standard_deviation) {
		boolean oldCluster_centers_standard_deviation = cluster_centers_standard_deviation;
		cluster_centers_standard_deviation = newCluster_centers_standard_deviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MLmodelPackage.CLUSTER_EVALUATION__CLUSTER_CENTERS_STANDARD_DEVIATION,
					oldCluster_centers_standard_deviation, cluster_centers_standard_deviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCluster_centers() {
		return cluster_centers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCluster_centers(boolean newCluster_centers) {
		boolean oldCluster_centers = cluster_centers;
		cluster_centers = newCluster_centers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.CLUSTER_EVALUATION__CLUSTER_CENTERS,
					oldCluster_centers, cluster_centers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MLmodelPackage.CLUSTER_EVALUATION__AFTER:
			if (after != null)
				msgs = ((InternalEObject) after).eInverseRemove(this, MLmodelPackage.CYCLE__BEFORE, Cycle.class, msgs);
			return basicSetAfter((Cycle) otherEnd, msgs);
		case MLmodelPackage.CLUSTER_EVALUATION__BEFORE:
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
		case MLmodelPackage.CLUSTER_EVALUATION__AFTER:
			return basicSetAfter(null, msgs);
		case MLmodelPackage.CLUSTER_EVALUATION__BEFORE:
			return basicSetBefore(null, msgs);
		case MLmodelPackage.CLUSTER_EVALUATION__SCATTER:
			return basicSetScatter(null, msgs);
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
		case MLmodelPackage.CLUSTER_EVALUATION__AFTER:
			if (resolve)
				return getAfter();
			return basicGetAfter();
		case MLmodelPackage.CLUSTER_EVALUATION__BEFORE:
			if (resolve)
				return getBefore();
			return basicGetBefore();
		case MLmodelPackage.CLUSTER_EVALUATION__SCATTER:
			return getScatter();
		case MLmodelPackage.CLUSTER_EVALUATION__CLUSTER_SIZES:
			return isCluster_sizes();
		case MLmodelPackage.CLUSTER_EVALUATION__CLUSTER_CENTERS_FEATURES:
			return isCluster_centers_features();
		case MLmodelPackage.CLUSTER_EVALUATION__CLUSTER_CENTERS_STANDARD_DEVIATION:
			return isCluster_centers_standard_deviation();
		case MLmodelPackage.CLUSTER_EVALUATION__CLUSTER_CENTERS:
			return isCluster_centers();
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
		case MLmodelPackage.CLUSTER_EVALUATION__AFTER:
			setAfter((Cycle) newValue);
			return;
		case MLmodelPackage.CLUSTER_EVALUATION__BEFORE:
			setBefore((Cycle) newValue);
			return;
		case MLmodelPackage.CLUSTER_EVALUATION__SCATTER:
			setScatter((Scatter) newValue);
			return;
		case MLmodelPackage.CLUSTER_EVALUATION__CLUSTER_SIZES:
			setCluster_sizes((Boolean) newValue);
			return;
		case MLmodelPackage.CLUSTER_EVALUATION__CLUSTER_CENTERS_FEATURES:
			setCluster_centers_features((Boolean) newValue);
			return;
		case MLmodelPackage.CLUSTER_EVALUATION__CLUSTER_CENTERS_STANDARD_DEVIATION:
			setCluster_centers_standard_deviation((Boolean) newValue);
			return;
		case MLmodelPackage.CLUSTER_EVALUATION__CLUSTER_CENTERS:
			setCluster_centers((Boolean) newValue);
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
		case MLmodelPackage.CLUSTER_EVALUATION__AFTER:
			setAfter((Cycle) null);
			return;
		case MLmodelPackage.CLUSTER_EVALUATION__BEFORE:
			setBefore((Cycle) null);
			return;
		case MLmodelPackage.CLUSTER_EVALUATION__SCATTER:
			setScatter((Scatter) null);
			return;
		case MLmodelPackage.CLUSTER_EVALUATION__CLUSTER_SIZES:
			setCluster_sizes(CLUSTER_SIZES_EDEFAULT);
			return;
		case MLmodelPackage.CLUSTER_EVALUATION__CLUSTER_CENTERS_FEATURES:
			setCluster_centers_features(CLUSTER_CENTERS_FEATURES_EDEFAULT);
			return;
		case MLmodelPackage.CLUSTER_EVALUATION__CLUSTER_CENTERS_STANDARD_DEVIATION:
			setCluster_centers_standard_deviation(CLUSTER_CENTERS_STANDARD_DEVIATION_EDEFAULT);
			return;
		case MLmodelPackage.CLUSTER_EVALUATION__CLUSTER_CENTERS:
			setCluster_centers(CLUSTER_CENTERS_EDEFAULT);
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
		case MLmodelPackage.CLUSTER_EVALUATION__AFTER:
			return after != null;
		case MLmodelPackage.CLUSTER_EVALUATION__BEFORE:
			return before != null;
		case MLmodelPackage.CLUSTER_EVALUATION__SCATTER:
			return scatter != null;
		case MLmodelPackage.CLUSTER_EVALUATION__CLUSTER_SIZES:
			return cluster_sizes != CLUSTER_SIZES_EDEFAULT;
		case MLmodelPackage.CLUSTER_EVALUATION__CLUSTER_CENTERS_FEATURES:
			return cluster_centers_features != CLUSTER_CENTERS_FEATURES_EDEFAULT;
		case MLmodelPackage.CLUSTER_EVALUATION__CLUSTER_CENTERS_STANDARD_DEVIATION:
			return cluster_centers_standard_deviation != CLUSTER_CENTERS_STANDARD_DEVIATION_EDEFAULT;
		case MLmodelPackage.CLUSTER_EVALUATION__CLUSTER_CENTERS:
			return cluster_centers != CLUSTER_CENTERS_EDEFAULT;
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
		result.append(" (cluster_sizes: ");
		result.append(cluster_sizes);
		result.append(", cluster_centers_features: ");
		result.append(cluster_centers_features);
		result.append(", cluster_centers_standard_deviation: ");
		result.append(cluster_centers_standard_deviation);
		result.append(", cluster_centers: ");
		result.append(cluster_centers);
		result.append(')');
		return result.toString();
	}

} //Cluster_EvaluationImpl
