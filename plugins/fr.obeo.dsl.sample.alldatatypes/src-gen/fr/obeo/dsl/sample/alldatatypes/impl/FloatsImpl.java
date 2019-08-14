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
import fr.obeo.dsl.sample.alldatatypes.Floats;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Floats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.FloatsImpl#getFloat_01 <em>Float 01</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.FloatsImpl#getFloat_1 <em>Float 1</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.FloatsImpl#getFloat_01_EmptyDefault <em>Float 01 Empty Default</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.FloatsImpl#getNotEditableFloat_01 <em>Not Editable Float 01</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FloatsImpl extends ElementImpl implements Floats {
	/**
	 * The default value of the '{@link #getFloat_01() <em>Float 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat_01()
	 * @generated
	 * @ordered
	 */
	protected static final float FLOAT_01_EDEFAULT = 12.1F;

	/**
	 * The cached value of the '{@link #getFloat_01() <em>Float 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat_01()
	 * @generated
	 * @ordered
	 */
	protected float float_01 = FLOAT_01_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloat_1() <em>Float 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat_1()
	 * @generated
	 * @ordered
	 */
	protected static final float FLOAT_1_EDEFAULT = 12.1F;

	/**
	 * The cached value of the '{@link #getFloat_1() <em>Float 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat_1()
	 * @generated
	 * @ordered
	 */
	protected float float_1 = FLOAT_1_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloat_01_EmptyDefault() <em>Float 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat_01_EmptyDefault()
	 * @generated
	 * @ordered
	 */
	protected static final float FLOAT_01_EMPTY_DEFAULT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFloat_01_EmptyDefault() <em>Float 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat_01_EmptyDefault()
	 * @generated
	 * @ordered
	 */
	protected float float_01_EmptyDefault = FLOAT_01_EMPTY_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotEditableFloat_01() <em>Not Editable Float 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotEditableFloat_01()
	 * @generated
	 * @ordered
	 */
	protected static final float NOT_EDITABLE_FLOAT_01_EDEFAULT = 12.1F;

	/**
	 * The cached value of the '{@link #getNotEditableFloat_01() <em>Not Editable Float 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotEditableFloat_01()
	 * @generated
	 * @ordered
	 */
	protected float notEditableFloat_01 = NOT_EDITABLE_FLOAT_01_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlldatatypesPackage.Literals.FLOATS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFloat_01() {
		return float_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloat_01(float newFloat_01) {
		float oldFloat_01 = float_01;
		float_01 = newFloat_01;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.FLOATS__FLOAT_01, oldFloat_01, float_01));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFloat_1() {
		return float_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloat_1(float newFloat_1) {
		float oldFloat_1 = float_1;
		float_1 = newFloat_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.FLOATS__FLOAT_1, oldFloat_1, float_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFloat_01_EmptyDefault() {
		return float_01_EmptyDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloat_01_EmptyDefault(float newFloat_01_EmptyDefault) {
		float oldFloat_01_EmptyDefault = float_01_EmptyDefault;
		float_01_EmptyDefault = newFloat_01_EmptyDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.FLOATS__FLOAT_01_EMPTY_DEFAULT, oldFloat_01_EmptyDefault, float_01_EmptyDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNotEditableFloat_01() {
		return notEditableFloat_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlldatatypesPackage.FLOATS__FLOAT_01:
				return getFloat_01();
			case AlldatatypesPackage.FLOATS__FLOAT_1:
				return getFloat_1();
			case AlldatatypesPackage.FLOATS__FLOAT_01_EMPTY_DEFAULT:
				return getFloat_01_EmptyDefault();
			case AlldatatypesPackage.FLOATS__NOT_EDITABLE_FLOAT_01:
				return getNotEditableFloat_01();
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
			case AlldatatypesPackage.FLOATS__FLOAT_01:
				setFloat_01((Float)newValue);
				return;
			case AlldatatypesPackage.FLOATS__FLOAT_1:
				setFloat_1((Float)newValue);
				return;
			case AlldatatypesPackage.FLOATS__FLOAT_01_EMPTY_DEFAULT:
				setFloat_01_EmptyDefault((Float)newValue);
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
			case AlldatatypesPackage.FLOATS__FLOAT_01:
				setFloat_01(FLOAT_01_EDEFAULT);
				return;
			case AlldatatypesPackage.FLOATS__FLOAT_1:
				setFloat_1(FLOAT_1_EDEFAULT);
				return;
			case AlldatatypesPackage.FLOATS__FLOAT_01_EMPTY_DEFAULT:
				setFloat_01_EmptyDefault(FLOAT_01_EMPTY_DEFAULT_EDEFAULT);
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
			case AlldatatypesPackage.FLOATS__FLOAT_01:
				return float_01 != FLOAT_01_EDEFAULT;
			case AlldatatypesPackage.FLOATS__FLOAT_1:
				return float_1 != FLOAT_1_EDEFAULT;
			case AlldatatypesPackage.FLOATS__FLOAT_01_EMPTY_DEFAULT:
				return float_01_EmptyDefault != FLOAT_01_EMPTY_DEFAULT_EDEFAULT;
			case AlldatatypesPackage.FLOATS__NOT_EDITABLE_FLOAT_01:
				return notEditableFloat_01 != NOT_EDITABLE_FLOAT_01_EDEFAULT;
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
		result.append(" (float_01: ");
		result.append(float_01);
		result.append(", float_1: ");
		result.append(float_1);
		result.append(", float_01_EmptyDefault: ");
		result.append(float_01_EmptyDefault);
		result.append(", notEditableFloat_01: ");
		result.append(notEditableFloat_01);
		result.append(')');
		return result.toString();
	}

} //FloatsImpl
