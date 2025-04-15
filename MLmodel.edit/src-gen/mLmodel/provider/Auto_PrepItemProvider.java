/**
 */
package mLmodel.provider;

import java.util.Collection;
import java.util.List;

import mLmodel.Auto_Prep;
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
 * This is the item provider adapter for a {@link mLmodel.Auto_Prep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Auto_PrepItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Auto_PrepItemProvider(AdapterFactory adapterFactory) {
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
			addRegularPropertyDescriptor(object);
			addSave_filePropertyDescriptor(object);
			addPrint_dataPropertyDescriptor(object);
			addSimple_ImputerPropertyDescriptor(object);
			addKNN_ImputerPropertyDescriptor(object);
			addScalingPropertyDescriptor(object);
			addEncodingPropertyDescriptor(object);
			addDuplicatesPropertyDescriptor(object);
			addTrasformationPropertyDescriptor(object);
			addDime_ReductPropertyDescriptor(object);
			addDate_to_IntPropertyDescriptor(object);
			addDropPropertyDescriptor(object);
			addMiss_idPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Regular feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegularPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Preprocess_regular_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Preprocess_regular_feature",
								"_UI_Preprocess_type"),
						MLmodelPackage.Literals.PREPROCESS__REGULAR, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Save file feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSave_filePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Preprocess_save_file_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Preprocess_save_file_feature",
								"_UI_Preprocess_type"),
						MLmodelPackage.Literals.PREPROCESS__SAVE_FILE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Print data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrint_dataPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Preprocess_print_data_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Preprocess_print_data_feature",
								"_UI_Preprocess_type"),
						MLmodelPackage.Literals.PREPROCESS__PRINT_DATA, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Simple Imputer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSimple_ImputerPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Auto_Prep_Simple_Imputer_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Auto_Prep_Simple_Imputer_feature",
								"_UI_Auto_Prep_type"),
						MLmodelPackage.Literals.AUTO_PREP__SIMPLE_IMPUTER, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the KNN Imputer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKNN_ImputerPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Auto_Prep_KNN_Imputer_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Auto_Prep_KNN_Imputer_feature",
								"_UI_Auto_Prep_type"),
						MLmodelPackage.Literals.AUTO_PREP__KNN_IMPUTER, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Scaling feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScalingPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Auto_Prep_Scaling_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Auto_Prep_Scaling_feature",
								"_UI_Auto_Prep_type"),
						MLmodelPackage.Literals.AUTO_PREP__SCALING, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Encoding feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncodingPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Auto_Prep_Encoding_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Auto_Prep_Encoding_feature",
								"_UI_Auto_Prep_type"),
						MLmodelPackage.Literals.AUTO_PREP__ENCODING, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Duplicates feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDuplicatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Auto_Prep_duplicates_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Auto_Prep_duplicates_feature",
								"_UI_Auto_Prep_type"),
						MLmodelPackage.Literals.AUTO_PREP__DUPLICATES, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Trasformation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrasformationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Auto_Prep_Trasformation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Auto_Prep_Trasformation_feature",
								"_UI_Auto_Prep_type"),
						MLmodelPackage.Literals.AUTO_PREP__TRASFORMATION, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Dime Reduct feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDime_ReductPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Auto_Prep_Dime_Reduct_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Auto_Prep_Dime_Reduct_feature",
								"_UI_Auto_Prep_type"),
						MLmodelPackage.Literals.AUTO_PREP__DIME_REDUCT, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Date to Int feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDate_to_IntPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Auto_Prep_Date_to_Int_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Auto_Prep_Date_to_Int_feature",
								"_UI_Auto_Prep_type"),
						MLmodelPackage.Literals.AUTO_PREP__DATE_TO_INT, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Drop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDropPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Auto_Prep_drop_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Auto_Prep_drop_feature",
								"_UI_Auto_Prep_type"),
						MLmodelPackage.Literals.AUTO_PREP__DROP, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Miss id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMiss_idPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Auto_Prep_miss_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Auto_Prep_miss_id_feature",
								"_UI_Auto_Prep_type"),
						MLmodelPackage.Literals.AUTO_PREP__MISS_ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Auto_Prep.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Auto_Prep"));
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
		Auto_Prep auto_Prep = (Auto_Prep) object;
		return getString("_UI_Auto_Prep_type") + " " + auto_Prep.isSave_file();
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

		switch (notification.getFeatureID(Auto_Prep.class)) {
		case MLmodelPackage.AUTO_PREP__SAVE_FILE:
		case MLmodelPackage.AUTO_PREP__PRINT_DATA:
		case MLmodelPackage.AUTO_PREP__SIMPLE_IMPUTER:
		case MLmodelPackage.AUTO_PREP__KNN_IMPUTER:
		case MLmodelPackage.AUTO_PREP__SCALING:
		case MLmodelPackage.AUTO_PREP__ENCODING:
		case MLmodelPackage.AUTO_PREP__DUPLICATES:
		case MLmodelPackage.AUTO_PREP__TRASFORMATION:
		case MLmodelPackage.AUTO_PREP__DIME_REDUCT:
		case MLmodelPackage.AUTO_PREP__DATE_TO_INT:
		case MLmodelPackage.AUTO_PREP__DROP:
		case MLmodelPackage.AUTO_PREP__MISS_ID:
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
