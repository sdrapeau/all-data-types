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
package alldatatypes.impl;

import alldatatypes.AlldatatypesPackage;
import alldatatypes.Integers;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alldatatypes.impl.IntegersImpl#getInt_01 <em>Int 01</em>}</li>
 *   <li>{@link alldatatypes.impl.IntegersImpl#getInt_1 <em>Int 1</em>}</li>
 *   <li>{@link alldatatypes.impl.IntegersImpl#getInt_01_EmptyDefault <em>Int 01 Empty Default</em>}</li>
 *   <li>{@link alldatatypes.impl.IntegersImpl#getNotEditableInt_01 <em>Not Editable Int 01</em>}</li>
 *   <li>{@link alldatatypes.impl.IntegersImpl#getInts <em>Ints</em>}</li>
 *   <li>{@link alldatatypes.impl.IntegersImpl#getHiddenInt_01 <em>Hidden Int 01</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegersImpl extends ElementImpl implements Integers {
	/**
	 * The default value of the '{@link #getInt_01() <em>Int 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt_01()
	 * @generated
	 * @ordered
	 */
	protected static final int INT_01_EDEFAULT = 23;

	/**
	 * The cached value of the '{@link #getInt_01() <em>Int 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt_01()
	 * @generated
	 * @ordered
	 */
	protected int int_01 = INT_01_EDEFAULT;

	/**
	 * The default value of the '{@link #getInt_1() <em>Int 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt_1()
	 * @generated
	 * @ordered
	 */
	protected static final int INT_1_EDEFAULT = 23;

	/**
	 * The cached value of the '{@link #getInt_1() <em>Int 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt_1()
	 * @generated
	 * @ordered
	 */
	protected int int_1 = INT_1_EDEFAULT;

	/**
	 * The default value of the '{@link #getInt_01_EmptyDefault() <em>Int 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt_01_EmptyDefault()
	 * @generated
	 * @ordered
	 */
	protected static final int INT_01_EMPTY_DEFAULT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInt_01_EmptyDefault() <em>Int 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt_01_EmptyDefault()
	 * @generated
	 * @ordered
	 */
	protected int int_01_EmptyDefault = INT_01_EMPTY_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotEditableInt_01() <em>Not Editable Int 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotEditableInt_01()
	 * @generated
	 * @ordered
	 */
	protected static final int NOT_EDITABLE_INT_01_EDEFAULT = 23;

	/**
	 * The cached value of the '{@link #getNotEditableInt_01() <em>Not Editable Int 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotEditableInt_01()
	 * @generated
	 * @ordered
	 */
	protected int notEditableInt_01 = NOT_EDITABLE_INT_01_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInts() <em>Ints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInts()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> ints;

	/**
	 * The default value of the '{@link #getHiddenInt_01() <em>Hidden Int 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiddenInt_01()
	 * @generated
	 * @ordered
	 */
	protected static final int HIDDEN_INT_01_EDEFAULT = 23;

	/**
	 * The cached value of the '{@link #getHiddenInt_01() <em>Hidden Int 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiddenInt_01()
	 * @generated
	 * @ordered
	 */
	protected int hiddenInt_01 = HIDDEN_INT_01_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlldatatypesPackage.Literals.INTEGERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInt_01() {
		return int_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInt_01(int newInt_01) {
		int oldInt_01 = int_01;
		int_01 = newInt_01;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.INTEGERS__INT_01, oldInt_01, int_01));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInt_1() {
		return int_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInt_1(int newInt_1) {
		int oldInt_1 = int_1;
		int_1 = newInt_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.INTEGERS__INT_1, oldInt_1, int_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInt_01_EmptyDefault() {
		return int_01_EmptyDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInt_01_EmptyDefault(int newInt_01_EmptyDefault) {
		int oldInt_01_EmptyDefault = int_01_EmptyDefault;
		int_01_EmptyDefault = newInt_01_EmptyDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.INTEGERS__INT_01_EMPTY_DEFAULT, oldInt_01_EmptyDefault, int_01_EmptyDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNotEditableInt_01() {
		return notEditableInt_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getInts() {
		if (ints == null) {
			ints = new EDataTypeUniqueEList<Integer>(Integer.class, this, AlldatatypesPackage.INTEGERS__INTS);
		}
		return ints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHiddenInt_01() {
		return hiddenInt_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHiddenInt_01(int newHiddenInt_01) {
		int oldHiddenInt_01 = hiddenInt_01;
		hiddenInt_01 = newHiddenInt_01;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.INTEGERS__HIDDEN_INT_01, oldHiddenInt_01, hiddenInt_01));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlldatatypesPackage.INTEGERS__INT_01:
				return getInt_01();
			case AlldatatypesPackage.INTEGERS__INT_1:
				return getInt_1();
			case AlldatatypesPackage.INTEGERS__INT_01_EMPTY_DEFAULT:
				return getInt_01_EmptyDefault();
			case AlldatatypesPackage.INTEGERS__NOT_EDITABLE_INT_01:
				return getNotEditableInt_01();
			case AlldatatypesPackage.INTEGERS__INTS:
				return getInts();
			case AlldatatypesPackage.INTEGERS__HIDDEN_INT_01:
				return getHiddenInt_01();
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
			case AlldatatypesPackage.INTEGERS__INT_01:
				setInt_01((Integer)newValue);
				return;
			case AlldatatypesPackage.INTEGERS__INT_1:
				setInt_1((Integer)newValue);
				return;
			case AlldatatypesPackage.INTEGERS__INT_01_EMPTY_DEFAULT:
				setInt_01_EmptyDefault((Integer)newValue);
				return;
			case AlldatatypesPackage.INTEGERS__INTS:
				getInts().clear();
				getInts().addAll((Collection<? extends Integer>)newValue);
				return;
			case AlldatatypesPackage.INTEGERS__HIDDEN_INT_01:
				setHiddenInt_01((Integer)newValue);
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
			case AlldatatypesPackage.INTEGERS__INT_01:
				setInt_01(INT_01_EDEFAULT);
				return;
			case AlldatatypesPackage.INTEGERS__INT_1:
				setInt_1(INT_1_EDEFAULT);
				return;
			case AlldatatypesPackage.INTEGERS__INT_01_EMPTY_DEFAULT:
				setInt_01_EmptyDefault(INT_01_EMPTY_DEFAULT_EDEFAULT);
				return;
			case AlldatatypesPackage.INTEGERS__INTS:
				getInts().clear();
				return;
			case AlldatatypesPackage.INTEGERS__HIDDEN_INT_01:
				setHiddenInt_01(HIDDEN_INT_01_EDEFAULT);
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
			case AlldatatypesPackage.INTEGERS__INT_01:
				return int_01 != INT_01_EDEFAULT;
			case AlldatatypesPackage.INTEGERS__INT_1:
				return int_1 != INT_1_EDEFAULT;
			case AlldatatypesPackage.INTEGERS__INT_01_EMPTY_DEFAULT:
				return int_01_EmptyDefault != INT_01_EMPTY_DEFAULT_EDEFAULT;
			case AlldatatypesPackage.INTEGERS__NOT_EDITABLE_INT_01:
				return notEditableInt_01 != NOT_EDITABLE_INT_01_EDEFAULT;
			case AlldatatypesPackage.INTEGERS__INTS:
				return ints != null && !ints.isEmpty();
			case AlldatatypesPackage.INTEGERS__HIDDEN_INT_01:
				return hiddenInt_01 != HIDDEN_INT_01_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (int_01: ");
		result.append(int_01);
		result.append(", int_1: ");
		result.append(int_1);
		result.append(", int_01_EmptyDefault: ");
		result.append(int_01_EmptyDefault);
		result.append(", notEditableInt_01: ");
		result.append(notEditableInt_01);
		result.append(", ints: ");
		result.append(ints);
		result.append(", hiddenInt_01: ");
		result.append(hiddenInt_01);
		result.append(')');
		return result.toString();
	}

} //IntegersImpl
