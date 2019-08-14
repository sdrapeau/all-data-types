/**
 * Copyright  2019 Obeo. All Rights Reserved.
 * 
 * This file is part of Obeo Designer.
 * 
 * This software and the attached documentation are the exclusive ownership of its authors and was conceded to the profit of Obeo SARL.
 * This software and the attached documentation are protected under the rights of intellectual ownership, including the section "Titre II  Droits des auteurs (Articles L121-1, L123-12)"
 * By installing this software, you acknowledge being aware of this rights and accept them, and as a consequence you must:
 *  - be in possession of a valid license of use conceded by Obeo only.
 *  - agree that you have read, understood, and will comply with the license terms and conditions.
 * - agree not to do anything that could conflict with intellectual ownership owned by Obeo or its beneficiaries or the authors of this software
 * 
 * Should you not agree with these terms, you must stop to use this software and give it back to its legitimate owner.
 * 
 * Acceleo and Obeo are trademarks owned by Obeo.
 *  
 */
package fr.obeo.dsl.sample.alldatatypes.provider;


import fr.obeo.dsl.sample.alldatatypes.AlldatatypesFactory;
import fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage;
import fr.obeo.dsl.sample.alldatatypes.Root;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.obeo.dsl.sample.alldatatypes.Root} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RootItemProvider extends ElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(AlldatatypesPackage.Literals.ROOT__TYPES);
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
	 * This returns Root.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Root"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Root)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Root_type") :
			getString("_UI_Root_type") + " " + label;
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

		switch (notification.getFeatureID(Root.class)) {
			case AlldatatypesPackage.ROOT__TYPES:
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

		newChildDescriptors.add
			(createChildParameter
				(AlldatatypesPackage.Literals.ROOT__TYPES,
				 AlldatatypesFactory.eINSTANCE.createStrings()));

		newChildDescriptors.add
			(createChildParameter
				(AlldatatypesPackage.Literals.ROOT__TYPES,
				 AlldatatypesFactory.eINSTANCE.createDates()));

		newChildDescriptors.add
			(createChildParameter
				(AlldatatypesPackage.Literals.ROOT__TYPES,
				 AlldatatypesFactory.eINSTANCE.createEnums()));

		newChildDescriptors.add
			(createChildParameter
				(AlldatatypesPackage.Literals.ROOT__TYPES,
				 AlldatatypesFactory.eINSTANCE.createBooleans()));

		newChildDescriptors.add
			(createChildParameter
				(AlldatatypesPackage.Literals.ROOT__TYPES,
				 AlldatatypesFactory.eINSTANCE.createIntegers()));

		newChildDescriptors.add
			(createChildParameter
				(AlldatatypesPackage.Literals.ROOT__TYPES,
				 AlldatatypesFactory.eINSTANCE.createLongs()));

		newChildDescriptors.add
			(createChildParameter
				(AlldatatypesPackage.Literals.ROOT__TYPES,
				 AlldatatypesFactory.eINSTANCE.createShorts()));

		newChildDescriptors.add
			(createChildParameter
				(AlldatatypesPackage.Literals.ROOT__TYPES,
				 AlldatatypesFactory.eINSTANCE.createDoubles()));

		newChildDescriptors.add
			(createChildParameter
				(AlldatatypesPackage.Literals.ROOT__TYPES,
				 AlldatatypesFactory.eINSTANCE.createFloats()));

		newChildDescriptors.add
			(createChildParameter
				(AlldatatypesPackage.Literals.ROOT__TYPES,
				 AlldatatypesFactory.eINSTANCE.createBigIntegers()));

		newChildDescriptors.add
			(createChildParameter
				(AlldatatypesPackage.Literals.ROOT__TYPES,
				 AlldatatypesFactory.eINSTANCE.createBigDecimals()));
	}

}
