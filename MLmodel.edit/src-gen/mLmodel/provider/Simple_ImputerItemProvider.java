/**
 */
package mLmodel.provider;

import java.util.Collection;
import java.util.List;

import mLmodel.MLmodelFactory;
import mLmodel.MLmodelPackage;
import mLmodel.Simple_Imputer;

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
 * This is the item provider adapter for a {@link mLmodel.Simple_Imputer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Simple_ImputerItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simple_ImputerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(MLmodelPackage.Literals.SIMPLE_IMPUTER__SIMPLE_IMPUTER_ARGUMENTS);
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
	 * This returns Simple_Imputer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Simple_Imputer"));
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
		Simple_Imputer simple_Imputer = (Simple_Imputer) object;
		return getString("_UI_Simple_Imputer_type") + " " + simple_Imputer.isSave_file();
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

		switch (notification.getFeatureID(Simple_Imputer.class)) {
		case MLmodelPackage.SIMPLE_IMPUTER__SAVE_FILE:
		case MLmodelPackage.SIMPLE_IMPUTER__PRINT_DATA:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case MLmodelPackage.SIMPLE_IMPUTER__SIMPLE_IMPUTER_ARGUMENTS:
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

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.SIMPLE_IMPUTER__SIMPLE_IMPUTER_ARGUMENTS,
				MLmodelFactory.eINSTANCE.createMissing_Values()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.SIMPLE_IMPUTER__SIMPLE_IMPUTER_ARGUMENTS,
				MLmodelFactory.eINSTANCE.createStrategy()));

		newChildDescriptors.add(createChildParameter(MLmodelPackage.Literals.SIMPLE_IMPUTER__SIMPLE_IMPUTER_ARGUMENTS,
				MLmodelFactory.eINSTANCE.createFill_Value()));
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
