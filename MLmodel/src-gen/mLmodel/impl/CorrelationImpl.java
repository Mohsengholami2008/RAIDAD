/**
 */
package mLmodel.impl;

import mLmodel.Correlation;
import mLmodel.MLmodelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correlation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mLmodel.impl.CorrelationImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link mLmodel.impl.CorrelationImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link mLmodel.impl.CorrelationImpl#isTable <em>Table</em>}</li>
 *   <li>{@link mLmodel.impl.CorrelationImpl#isMatrix <em>Matrix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CorrelationImpl extends MinimalEObjectImpl.Container implements Correlation {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 800;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 800;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #isTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTable()
	 * @generated
	 * @ordered
	 */
	protected boolean table = TABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMatrix() <em>Matrix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMatrix()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MATRIX_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMatrix() <em>Matrix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMatrix()
	 * @generated
	 * @ordered
	 */
	protected boolean matrix = MATRIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorrelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MLmodelPackage.Literals.CORRELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.CORRELATION__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.CORRELATION__HEIGHT, oldHeight,
					height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(boolean newTable) {
		boolean oldTable = table;
		table = newTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.CORRELATION__TABLE, oldTable, table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMatrix() {
		return matrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatrix(boolean newMatrix) {
		boolean oldMatrix = matrix;
		matrix = newMatrix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MLmodelPackage.CORRELATION__MATRIX, oldMatrix,
					matrix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MLmodelPackage.CORRELATION__WIDTH:
			return getWidth();
		case MLmodelPackage.CORRELATION__HEIGHT:
			return getHeight();
		case MLmodelPackage.CORRELATION__TABLE:
			return isTable();
		case MLmodelPackage.CORRELATION__MATRIX:
			return isMatrix();
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
		case MLmodelPackage.CORRELATION__WIDTH:
			setWidth((Integer) newValue);
			return;
		case MLmodelPackage.CORRELATION__HEIGHT:
			setHeight((Integer) newValue);
			return;
		case MLmodelPackage.CORRELATION__TABLE:
			setTable((Boolean) newValue);
			return;
		case MLmodelPackage.CORRELATION__MATRIX:
			setMatrix((Boolean) newValue);
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
		case MLmodelPackage.CORRELATION__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case MLmodelPackage.CORRELATION__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case MLmodelPackage.CORRELATION__TABLE:
			setTable(TABLE_EDEFAULT);
			return;
		case MLmodelPackage.CORRELATION__MATRIX:
			setMatrix(MATRIX_EDEFAULT);
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
		case MLmodelPackage.CORRELATION__WIDTH:
			return width != WIDTH_EDEFAULT;
		case MLmodelPackage.CORRELATION__HEIGHT:
			return height != HEIGHT_EDEFAULT;
		case MLmodelPackage.CORRELATION__TABLE:
			return table != TABLE_EDEFAULT;
		case MLmodelPackage.CORRELATION__MATRIX:
			return matrix != MATRIX_EDEFAULT;
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
		result.append(" (width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", table: ");
		result.append(table);
		result.append(", Matrix: ");
		result.append(matrix);
		result.append(')');
		return result.toString();
	}

} //CorrelationImpl
