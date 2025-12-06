/**
 */
package mLmodel.provider;

import java.util.Collection;
import java.util.List;

import mLmodel.MLmodelFactory;
import mLmodel.MLmodelPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link mLmodel.Process} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessItemProvider(AdapterFactory adapterFactory) {
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

			addFile_pathPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the File path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFile_pathPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Process_file_path_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Process_file_path_feature",
								"_UI_Process_type"),
						MLmodelPackage.Literals.PROCESS__FILE_PATH, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MLmodelPackage.Literals.PROCESS__CYCLE);
			childrenFeatures.add(MLmodelPackage.Literals.PROCESS__DATA_UNDERSTANDING);
			childrenFeatures.add(MLmodelPackage.Literals.PROCESS__ANALYSYSTRIGER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Process.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Process"));
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
		String label = ((mLmodel.Process) object).getFile_path();
		return label == null || label.length() == 0 ? getString("_UI_Process_type")
				: getString("_UI_Process_type") + " " + label;
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

		switch (notification.getFeatureID(mLmodel.Process.class)) {
		case MLmodelPackage.PROCESS__FILE_PATH:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case MLmodelPackage.PROCESS__CYCLE:
		case MLmodelPackage.PROCESS__DATA_UNDERSTANDING:
		case MLmodelPackage.PROCESS__ANALYSYSTRIGER:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(
				createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE, MLmodelFactory.eINSTANCE.createCSV()));

		newChildDescriptors.add(
				createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE, MLmodelFactory.eINSTANCE.createExcel()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE,
				MLmodelFactory.eINSTANCE.createSimple_Imputer()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE,
				MLmodelFactory.eINSTANCE.createKNN_Imputer()));

		newChildDescriptors.add(
				createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE, MLmodelFactory.eINSTANCE.createKNN()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE,
				MLmodelFactory.eINSTANCE.createCross_Validation()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE,
				MLmodelFactory.eINSTANCE.createRobust_Scaling()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE,
				MLmodelFactory.eINSTANCE.createStandardization()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE,
				MLmodelFactory.eINSTANCE.createNormalization()));

		newChildDescriptors.add(
				createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE, MLmodelFactory.eINSTANCE.createOneHot()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE,
				MLmodelFactory.eINSTANCE.createDuplicates()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE,
				MLmodelFactory.eINSTANCE.createDate_to_Int()));

		newChildDescriptors.add(
				createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE, MLmodelFactory.eINSTANCE.createPCA()));

		newChildDescriptors.add(
				createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE, MLmodelFactory.eINSTANCE.createSVM()));

		newChildDescriptors.add(
				createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE, MLmodelFactory.eINSTANCE.createMLP()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE,
				MLmodelFactory.eINSTANCE.createVoting_Classifier()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE,
				MLmodelFactory.eINSTANCE.createRandom_Forest()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE,
				MLmodelFactory.eINSTANCE.createK_Medians()));

		newChildDescriptors.add(
				createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE, MLmodelFactory.eINSTANCE.createK_Means()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE,
				MLmodelFactory.eINSTANCE.createLogistic_Regression()));

		newChildDescriptors.add(
				createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE, MLmodelFactory.eINSTANCE.createDBSCAN()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE,
				MLmodelFactory.eINSTANCE.createCluster_Evaluation()));

		newChildDescriptors.add(
				createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE, MLmodelFactory.eINSTANCE.createOPtics()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE,
				MLmodelFactory.eINSTANCE.createAuto_Prep()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE,
				MLmodelFactory.eINSTANCE.createLinear_Regression()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE,
				MLmodelFactory.eINSTANCE.createDataSource()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE,
				MLmodelFactory.eINSTANCE.createAnalysisOutput()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE,
				MLmodelFactory.eINSTANCE.createCommunicationProtocol()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE,
				MLmodelFactory.eINSTANCE.createSGDClassifier()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE,
				MLmodelFactory.eINSTANCE.createPassiveAggressiveClassifier()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE,
				MLmodelFactory.eINSTANCE.createPerceptron()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE,
				MLmodelFactory.eINSTANCE.createLgSGDClassifier()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE,
				MLmodelFactory.eINSTANCE.createFeatureDiffs()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE,
				MLmodelFactory.eINSTANCE.createPolynomial()));

		newChildDescriptors.add(
				createChildParameter(MLmodelPackage.Literals.PROCESS__CYCLE, MLmodelFactory.eINSTANCE.createMin_Max()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__DATA_UNDERSTANDING,
				MLmodelFactory.eINSTANCE.createStatistics()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__DATA_UNDERSTANDING,
				MLmodelFactory.eINSTANCE.createVisualization()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__DATA_UNDERSTANDING,
				MLmodelFactory.eINSTANCE.createCorrelation()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__DATA_UNDERSTANDING,
				MLmodelFactory.eINSTANCE.createStandard_Deviation()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.PROCESS__ANALYSYSTRIGER,
				MLmodelFactory.eINSTANCE.createAnalysysTriger()));
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
