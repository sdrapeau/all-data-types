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
package fr.obeo.dsl.sample.alldatatypes.impl;

import fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage;
import fr.obeo.dsl.sample.alldatatypes.Booleans;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booleans</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.BooleansImpl#isBoolean_01 <em>Boolean 01</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.BooleansImpl#isBoolean_01_EmptyDefault <em>Boolean 01 Empty Default</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.BooleansImpl#isBoolean_1 <em>Boolean 1</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.BooleansImpl#isNotEditableBoolean_01 <em>Not Editable Boolean 01</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleansImpl extends ElementImpl implements Booleans {
	/**
	 * The default value of the '{@link #isBoolean_01() <em>Boolean 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolean_01()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOLEAN_01_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isBoolean_01() <em>Boolean 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolean_01()
	 * @generated
	 * @ordered
	 */
	protected boolean boolean_01 = BOOLEAN_01_EDEFAULT;

	/**
	 * The default value of the '{@link #isBoolean_01_EmptyDefault() <em>Boolean 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolean_01_EmptyDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOLEAN_01_EMPTY_DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBoolean_01_EmptyDefault() <em>Boolean 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolean_01_EmptyDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean boolean_01_EmptyDefault = BOOLEAN_01_EMPTY_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #isBoolean_1() <em>Boolean 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolean_1()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOLEAN_1_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isBoolean_1() <em>Boolean 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolean_1()
	 * @generated
	 * @ordered
	 */
	protected boolean boolean_1 = BOOLEAN_1_EDEFAULT;

	/**
	 * The default value of the '{@link #isNotEditableBoolean_01() <em>Not Editable Boolean 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotEditableBoolean_01()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_EDITABLE_BOOLEAN_01_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isNotEditableBoolean_01() <em>Not Editable Boolean 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotEditableBoolean_01()
	 * @generated
	 * @ordered
	 */
	protected boolean notEditableBoolean_01 = NOT_EDITABLE_BOOLEAN_01_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleansImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlldatatypesPackage.Literals.BOOLEANS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBoolean_01() {
		return boolean_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolean_01(boolean newBoolean_01) {
		boolean oldBoolean_01 = boolean_01;
		boolean_01 = newBoolean_01;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.BOOLEANS__BOOLEAN_01, oldBoolean_01, boolean_01));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBoolean_01_EmptyDefault() {
		return boolean_01_EmptyDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolean_01_EmptyDefault(boolean newBoolean_01_EmptyDefault) {
		boolean oldBoolean_01_EmptyDefault = boolean_01_EmptyDefault;
		boolean_01_EmptyDefault = newBoolean_01_EmptyDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.BOOLEANS__BOOLEAN_01_EMPTY_DEFAULT, oldBoolean_01_EmptyDefault, boolean_01_EmptyDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBoolean_1() {
		return boolean_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolean_1(boolean newBoolean_1) {
		boolean oldBoolean_1 = boolean_1;
		boolean_1 = newBoolean_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.BOOLEANS__BOOLEAN_1, oldBoolean_1, boolean_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNotEditableBoolean_01() {
		return notEditableBoolean_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlldatatypesPackage.BOOLEANS__BOOLEAN_01:
				return isBoolean_01();
			case AlldatatypesPackage.BOOLEANS__BOOLEAN_01_EMPTY_DEFAULT:
				return isBoolean_01_EmptyDefault();
			case AlldatatypesPackage.BOOLEANS__BOOLEAN_1:
				return isBoolean_1();
			case AlldatatypesPackage.BOOLEANS__NOT_EDITABLE_BOOLEAN_01:
				return isNotEditableBoolean_01();
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
			case AlldatatypesPackage.BOOLEANS__BOOLEAN_01:
				setBoolean_01((Boolean)newValue);
				return;
			case AlldatatypesPackage.BOOLEANS__BOOLEAN_01_EMPTY_DEFAULT:
				setBoolean_01_EmptyDefault((Boolean)newValue);
				return;
			case AlldatatypesPackage.BOOLEANS__BOOLEAN_1:
				setBoolean_1((Boolean)newValue);
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
			case AlldatatypesPackage.BOOLEANS__BOOLEAN_01:
				setBoolean_01(BOOLEAN_01_EDEFAULT);
				return;
			case AlldatatypesPackage.BOOLEANS__BOOLEAN_01_EMPTY_DEFAULT:
				setBoolean_01_EmptyDefault(BOOLEAN_01_EMPTY_DEFAULT_EDEFAULT);
				return;
			case AlldatatypesPackage.BOOLEANS__BOOLEAN_1:
				setBoolean_1(BOOLEAN_1_EDEFAULT);
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
			case AlldatatypesPackage.BOOLEANS__BOOLEAN_01:
				return boolean_01 != BOOLEAN_01_EDEFAULT;
			case AlldatatypesPackage.BOOLEANS__BOOLEAN_01_EMPTY_DEFAULT:
				return boolean_01_EmptyDefault != BOOLEAN_01_EMPTY_DEFAULT_EDEFAULT;
			case AlldatatypesPackage.BOOLEANS__BOOLEAN_1:
				return boolean_1 != BOOLEAN_1_EDEFAULT;
			case AlldatatypesPackage.BOOLEANS__NOT_EDITABLE_BOOLEAN_01:
				return notEditableBoolean_01 != NOT_EDITABLE_BOOLEAN_01_EDEFAULT;
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
		result.append(" (boolean_01: ");
		result.append(boolean_01);
		result.append(", boolean_01_EmptyDefault: ");
		result.append(boolean_01_EmptyDefault);
		result.append(", boolean_1: ");
		result.append(boolean_1);
		result.append(", notEditableBoolean_01: ");
		result.append(notEditableBoolean_01);
		result.append(')');
		return result.toString();
	}

} //BooleansImpl
