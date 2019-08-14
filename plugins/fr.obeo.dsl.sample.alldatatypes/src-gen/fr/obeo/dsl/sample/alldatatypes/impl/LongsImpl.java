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
import fr.obeo.dsl.sample.alldatatypes.Longs;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Longs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.LongsImpl#getLong_01 <em>Long 01</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.LongsImpl#getLong_1 <em>Long 1</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.LongsImpl#getLong_01_EmptyDefault <em>Long 01 Empty Default</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.LongsImpl#getNotEditableLong_01 <em>Not Editable Long 01</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LongsImpl extends ElementImpl implements Longs {
	/**
	 * The default value of the '{@link #getLong_01() <em>Long 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong_01()
	 * @generated
	 * @ordered
	 */
	protected static final long LONG_01_EDEFAULT = 23L;

	/**
	 * The cached value of the '{@link #getLong_01() <em>Long 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong_01()
	 * @generated
	 * @ordered
	 */
	protected long long_01 = LONG_01_EDEFAULT;

	/**
	 * The default value of the '{@link #getLong_1() <em>Long 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong_1()
	 * @generated
	 * @ordered
	 */
	protected static final long LONG_1_EDEFAULT = 23L;

	/**
	 * The cached value of the '{@link #getLong_1() <em>Long 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong_1()
	 * @generated
	 * @ordered
	 */
	protected long long_1 = LONG_1_EDEFAULT;

	/**
	 * The default value of the '{@link #getLong_01_EmptyDefault() <em>Long 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong_01_EmptyDefault()
	 * @generated
	 * @ordered
	 */
	protected static final long LONG_01_EMPTY_DEFAULT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLong_01_EmptyDefault() <em>Long 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong_01_EmptyDefault()
	 * @generated
	 * @ordered
	 */
	protected long long_01_EmptyDefault = LONG_01_EMPTY_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotEditableLong_01() <em>Not Editable Long 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotEditableLong_01()
	 * @generated
	 * @ordered
	 */
	protected static final long NOT_EDITABLE_LONG_01_EDEFAULT = 23L;

	/**
	 * The cached value of the '{@link #getNotEditableLong_01() <em>Not Editable Long 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotEditableLong_01()
	 * @generated
	 * @ordered
	 */
	protected long notEditableLong_01 = NOT_EDITABLE_LONG_01_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LongsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlldatatypesPackage.Literals.LONGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLong_01() {
		return long_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLong_01(long newLong_01) {
		long oldLong_01 = long_01;
		long_01 = newLong_01;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.LONGS__LONG_01, oldLong_01, long_01));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLong_1() {
		return long_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLong_1(long newLong_1) {
		long oldLong_1 = long_1;
		long_1 = newLong_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.LONGS__LONG_1, oldLong_1, long_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLong_01_EmptyDefault() {
		return long_01_EmptyDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLong_01_EmptyDefault(long newLong_01_EmptyDefault) {
		long oldLong_01_EmptyDefault = long_01_EmptyDefault;
		long_01_EmptyDefault = newLong_01_EmptyDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.LONGS__LONG_01_EMPTY_DEFAULT, oldLong_01_EmptyDefault, long_01_EmptyDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNotEditableLong_01() {
		return notEditableLong_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlldatatypesPackage.LONGS__LONG_01:
				return getLong_01();
			case AlldatatypesPackage.LONGS__LONG_1:
				return getLong_1();
			case AlldatatypesPackage.LONGS__LONG_01_EMPTY_DEFAULT:
				return getLong_01_EmptyDefault();
			case AlldatatypesPackage.LONGS__NOT_EDITABLE_LONG_01:
				return getNotEditableLong_01();
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
			case AlldatatypesPackage.LONGS__LONG_01:
				setLong_01((Long)newValue);
				return;
			case AlldatatypesPackage.LONGS__LONG_1:
				setLong_1((Long)newValue);
				return;
			case AlldatatypesPackage.LONGS__LONG_01_EMPTY_DEFAULT:
				setLong_01_EmptyDefault((Long)newValue);
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
			case AlldatatypesPackage.LONGS__LONG_01:
				setLong_01(LONG_01_EDEFAULT);
				return;
			case AlldatatypesPackage.LONGS__LONG_1:
				setLong_1(LONG_1_EDEFAULT);
				return;
			case AlldatatypesPackage.LONGS__LONG_01_EMPTY_DEFAULT:
				setLong_01_EmptyDefault(LONG_01_EMPTY_DEFAULT_EDEFAULT);
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
			case AlldatatypesPackage.LONGS__LONG_01:
				return long_01 != LONG_01_EDEFAULT;
			case AlldatatypesPackage.LONGS__LONG_1:
				return long_1 != LONG_1_EDEFAULT;
			case AlldatatypesPackage.LONGS__LONG_01_EMPTY_DEFAULT:
				return long_01_EmptyDefault != LONG_01_EMPTY_DEFAULT_EDEFAULT;
			case AlldatatypesPackage.LONGS__NOT_EDITABLE_LONG_01:
				return notEditableLong_01 != NOT_EDITABLE_LONG_01_EDEFAULT;
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
		result.append(" (long_01: ");
		result.append(long_01);
		result.append(", long_1: ");
		result.append(long_1);
		result.append(", long_01_EmptyDefault: ");
		result.append(long_01_EmptyDefault);
		result.append(", notEditableLong_01: ");
		result.append(notEditableLong_01);
		result.append(')');
		return result.toString();
	}

} //LongsImpl
