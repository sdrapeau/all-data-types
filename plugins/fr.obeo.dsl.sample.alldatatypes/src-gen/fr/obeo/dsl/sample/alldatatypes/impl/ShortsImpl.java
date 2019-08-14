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
import fr.obeo.dsl.sample.alldatatypes.Shorts;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shorts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.ShortsImpl#getShort_01 <em>Short 01</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.ShortsImpl#getShort_1 <em>Short 1</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.ShortsImpl#getShort_01_EmptyDefault <em>Short 01 Empty Default</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.ShortsImpl#getNotEditableShort_01 <em>Not Editable Short 01</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShortsImpl extends ElementImpl implements Shorts {
	/**
	 * The default value of the '{@link #getShort_01() <em>Short 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShort_01()
	 * @generated
	 * @ordered
	 */
	protected static final short SHORT_01_EDEFAULT = 23;

	/**
	 * The cached value of the '{@link #getShort_01() <em>Short 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShort_01()
	 * @generated
	 * @ordered
	 */
	protected short short_01 = SHORT_01_EDEFAULT;

	/**
	 * The default value of the '{@link #getShort_1() <em>Short 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShort_1()
	 * @generated
	 * @ordered
	 */
	protected static final short SHORT_1_EDEFAULT = 23;

	/**
	 * The cached value of the '{@link #getShort_1() <em>Short 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShort_1()
	 * @generated
	 * @ordered
	 */
	protected short short_1 = SHORT_1_EDEFAULT;

	/**
	 * The default value of the '{@link #getShort_01_EmptyDefault() <em>Short 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShort_01_EmptyDefault()
	 * @generated
	 * @ordered
	 */
	protected static final short SHORT_01_EMPTY_DEFAULT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getShort_01_EmptyDefault() <em>Short 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShort_01_EmptyDefault()
	 * @generated
	 * @ordered
	 */
	protected short short_01_EmptyDefault = SHORT_01_EMPTY_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotEditableShort_01() <em>Not Editable Short 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotEditableShort_01()
	 * @generated
	 * @ordered
	 */
	protected static final short NOT_EDITABLE_SHORT_01_EDEFAULT = 23;

	/**
	 * The cached value of the '{@link #getNotEditableShort_01() <em>Not Editable Short 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotEditableShort_01()
	 * @generated
	 * @ordered
	 */
	protected short notEditableShort_01 = NOT_EDITABLE_SHORT_01_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShortsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlldatatypesPackage.Literals.SHORTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getShort_01() {
		return short_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShort_01(short newShort_01) {
		short oldShort_01 = short_01;
		short_01 = newShort_01;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.SHORTS__SHORT_01, oldShort_01, short_01));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getShort_1() {
		return short_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShort_1(short newShort_1) {
		short oldShort_1 = short_1;
		short_1 = newShort_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.SHORTS__SHORT_1, oldShort_1, short_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getShort_01_EmptyDefault() {
		return short_01_EmptyDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShort_01_EmptyDefault(short newShort_01_EmptyDefault) {
		short oldShort_01_EmptyDefault = short_01_EmptyDefault;
		short_01_EmptyDefault = newShort_01_EmptyDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.SHORTS__SHORT_01_EMPTY_DEFAULT, oldShort_01_EmptyDefault, short_01_EmptyDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getNotEditableShort_01() {
		return notEditableShort_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlldatatypesPackage.SHORTS__SHORT_01:
				return getShort_01();
			case AlldatatypesPackage.SHORTS__SHORT_1:
				return getShort_1();
			case AlldatatypesPackage.SHORTS__SHORT_01_EMPTY_DEFAULT:
				return getShort_01_EmptyDefault();
			case AlldatatypesPackage.SHORTS__NOT_EDITABLE_SHORT_01:
				return getNotEditableShort_01();
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
			case AlldatatypesPackage.SHORTS__SHORT_01:
				setShort_01((Short)newValue);
				return;
			case AlldatatypesPackage.SHORTS__SHORT_1:
				setShort_1((Short)newValue);
				return;
			case AlldatatypesPackage.SHORTS__SHORT_01_EMPTY_DEFAULT:
				setShort_01_EmptyDefault((Short)newValue);
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
			case AlldatatypesPackage.SHORTS__SHORT_01:
				setShort_01(SHORT_01_EDEFAULT);
				return;
			case AlldatatypesPackage.SHORTS__SHORT_1:
				setShort_1(SHORT_1_EDEFAULT);
				return;
			case AlldatatypesPackage.SHORTS__SHORT_01_EMPTY_DEFAULT:
				setShort_01_EmptyDefault(SHORT_01_EMPTY_DEFAULT_EDEFAULT);
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
			case AlldatatypesPackage.SHORTS__SHORT_01:
				return short_01 != SHORT_01_EDEFAULT;
			case AlldatatypesPackage.SHORTS__SHORT_1:
				return short_1 != SHORT_1_EDEFAULT;
			case AlldatatypesPackage.SHORTS__SHORT_01_EMPTY_DEFAULT:
				return short_01_EmptyDefault != SHORT_01_EMPTY_DEFAULT_EDEFAULT;
			case AlldatatypesPackage.SHORTS__NOT_EDITABLE_SHORT_01:
				return notEditableShort_01 != NOT_EDITABLE_SHORT_01_EDEFAULT;
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
		result.append(" (short_01: ");
		result.append(short_01);
		result.append(", short_1: ");
		result.append(short_1);
		result.append(", short_01_EmptyDefault: ");
		result.append(short_01_EmptyDefault);
		result.append(", notEditableShort_01: ");
		result.append(notEditableShort_01);
		result.append(')');
		return result.toString();
	}

} //ShortsImpl
