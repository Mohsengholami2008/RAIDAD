/**
 */
package mLmodel.provider;

import java.util.Collection;
import java.util.List;

import mLmodel.AnalysisOutput;
import mLmodel.MLmodelPackage;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link mLmodel.AnalysisOutput} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysisOutputItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisOutputItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAfterPropertyDescriptor(object);
			addBeforePropertyDescriptor(object);
			addPrecisionPropertyDescriptor(object);
			addAccuracyPropertyDescriptor(object);
			addRecallPropertyDescriptor(object);
			addF1_scorePropertyDescriptor(object);
			addActionPropertyDescriptor(object);
			addResultValuePropertyDescriptor(object);
			addResultTypePropertyDescriptor(object);
			addTimestampPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the After feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAfterPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Cycle_after_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Cycle_after_feature", "_UI_Cycle_type"),
						MLmodelPackage.Literals.CYCLE__AFTER, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Before feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBeforePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Cycle_before_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Cycle_before_feature", "_UI_Cycle_type"),
						MLmodelPackage.Literals.CYCLE__BEFORE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Precision feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrecisionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Evaluation_Methods_precision_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Evaluation_Methods_precision_feature",
								"_UI_Evaluation_Methods_type"),
						MLmodelPackage.Literals.EVALUATION_METHODS__PRECISION, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Accuracy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccuracyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Evaluation_Methods_accuracy_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Evaluation_Methods_accuracy_feature",
								"_UI_Evaluation_Methods_type"),
						MLmodelPackage.Literals.EVALUATION_METHODS__ACCURACY, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Recall feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecallPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Evaluation_Methods_recall_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Evaluation_Methods_recall_feature",
								"_UI_Evaluation_Methods_type"),
						MLmodelPackage.Literals.EVALUATION_METHODS__RECALL, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the F1 score feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addF1_scorePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Evaluation_Methods_f1_score_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Evaluation_Methods_f1_score_feature",
								"_UI_Evaluation_Methods_type"),
						MLmodelPackage.Literals.EVALUATION_METHODS__F1_SCORE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AnalysisOutput_action_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AnalysisOutput_action_feature",
								"_UI_AnalysisOutput_type"),
						MLmodelPackage.Literals.ANALYSIS_OUTPUT__ACTION, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Result Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AnalysisOutput_resultValue_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AnalysisOutput_resultValue_feature",
								"_UI_AnalysisOutput_type"),
						MLmodelPackage.Literals.ANALYSIS_OUTPUT__RESULT_VALUE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Result Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResultTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AnalysisOutput_resultType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AnalysisOutput_resultType_feature",
								"_UI_AnalysisOutput_type"),
						MLmodelPackage.Literals.ANALYSIS_OUTPUT__RESULT_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Timestamp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimestampPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AnalysisOutput_timestamp_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AnalysisOutput_timestamp_feature",
								"_UI_AnalysisOutput_type"),
						MLmodelPackage.Literals.ANALYSIS_OUTPUT__TIMESTAMP, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns AnalysisOutput.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AnalysisOutput"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		AnalysisOutput analysisOutput = (AnalysisOutput) object;
		return getString("_UI_AnalysisOutput_type") + " " + analysisOutput.isPrecision();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AnalysisOutput.class)) {
		case MLmodelPackage.ANALYSIS_OUTPUT__PRECISION:
		case MLmodelPackage.ANALYSIS_OUTPUT__ACCURACY:
		case MLmodelPackage.ANALYSIS_OUTPUT__RECALL:
		case MLmodelPackage.ANALYSIS_OUTPUT__F1_SCORE:
		case MLmodelPackage.ANALYSIS_OUTPUT__RESULT_VALUE:
		case MLmodelPackage.ANALYSIS_OUTPUT__RESULT_TYPE:
		case MLmodelPackage.ANALYSIS_OUTPUT__TIMESTAMP:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MLmodelEditPlugin.INSTANCE;
	}

}
