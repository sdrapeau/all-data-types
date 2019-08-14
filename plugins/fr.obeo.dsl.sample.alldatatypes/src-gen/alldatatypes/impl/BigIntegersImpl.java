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
import alldatatypes.BigIntegers;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Big Integers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alldatatypes.impl.BigIntegersImpl#getBigInt_01 <em>Big Int 01</em>}</li>
 *   <li>{@link alldatatypes.impl.BigIntegersImpl#getBigInt_1 <em>Big Int 1</em>}</li>
 *   <li>{@link alldatatypes.impl.BigIntegersImpl#getBigInt_01_EmptyDefault <em>Big Int 01 Empty Default</em>}</li>
 *   <li>{@link alldatatypes.impl.BigIntegersImpl#getNotEditableBigInt_01 <em>Not Editable Big Int 01</em>}</li>
 *   <li>{@link alldatatypes.impl.BigIntegersImpl#getBigInts <em>Big Ints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BigIntegersImpl extends ElementImpl implements BigIntegers {
	/**
	 * The default value of the '{@link #getBigInt_01() <em>Big Int 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigInt_01()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BIG_INT_01_EDEFAULT = new BigInteger("23");

	/**
	 * The cached value of the '{@link #getBigInt_01() <em>Big Int 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigInt_01()
	 * @generated
	 * @ordered
	 */
	protected BigInteger bigInt_01 = BIG_INT_01_EDEFAULT;

	/**
	 * The default value of the '{@link #getBigInt_1() <em>Big Int 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigInt_1()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BIG_INT_1_EDEFAULT = new BigInteger("23");

	/**
	 * The cached value of the '{@link #getBigInt_1() <em>Big Int 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigInt_1()
	 * @generated
	 * @ordered
	 */
	protected BigInteger bigInt_1 = BIG_INT_1_EDEFAULT;

	/**
	 * The default value of the '{@link #getBigInt_01_EmptyDefault() <em>Big Int 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigInt_01_EmptyDefault()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BIG_INT_01_EMPTY_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBigInt_01_EmptyDefault() <em>Big Int 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigInt_01_EmptyDefault()
	 * @generated
	 * @ordered
	 */
	protected BigInteger bigInt_01_EmptyDefault = BIG_INT_01_EMPTY_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotEditableBigInt_01() <em>Not Editable Big Int 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotEditableBigInt_01()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NOT_EDITABLE_BIG_INT_01_EDEFAULT = new BigInteger("23");

	/**
	 * The cached value of the '{@link #getNotEditableBigInt_01() <em>Not Editable Big Int 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotEditableBigInt_01()
	 * @generated
	 * @ordered
	 */
	protected BigInteger notEditableBigInt_01 = NOT_EDITABLE_BIG_INT_01_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBigInts() <em>Big Ints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigInts()
	 * @generated
	 * @ordered
	 */
	protected EList<BigInteger> bigInts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BigIntegersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlldatatypesPackage.Literals.BIG_INTEGERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBigInt_01() {
		return bigInt_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBigInt_01(BigInteger newBigInt_01) {
		BigInteger oldBigInt_01 = bigInt_01;
		bigInt_01 = newBigInt_01;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.BIG_INTEGERS__BIG_INT_01, oldBigInt_01, bigInt_01));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBigInt_1() {
		return bigInt_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBigInt_1(BigInteger newBigInt_1) {
		BigInteger oldBigInt_1 = bigInt_1;
		bigInt_1 = newBigInt_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.BIG_INTEGERS__BIG_INT_1, oldBigInt_1, bigInt_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBigInt_01_EmptyDefault() {
		return bigInt_01_EmptyDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBigInt_01_EmptyDefault(BigInteger newBigInt_01_EmptyDefault) {
		BigInteger oldBigInt_01_EmptyDefault = bigInt_01_EmptyDefault;
		bigInt_01_EmptyDefault = newBigInt_01_EmptyDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.BIG_INTEGERS__BIG_INT_01_EMPTY_DEFAULT, oldBigInt_01_EmptyDefault, bigInt_01_EmptyDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNotEditableBigInt_01() {
		return notEditableBigInt_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigInteger> getBigInts() {
		if (bigInts == null) {
			bigInts = new EDataTypeUniqueEList<BigInteger>(BigInteger.class, this, AlldatatypesPackage.BIG_INTEGERS__BIG_INTS);
		}
		return bigInts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlldatatypesPackage.BIG_INTEGERS__BIG_INT_01:
				return getBigInt_01();
			case AlldatatypesPackage.BIG_INTEGERS__BIG_INT_1:
				return getBigInt_1();
			case AlldatatypesPackage.BIG_INTEGERS__BIG_INT_01_EMPTY_DEFAULT:
				return getBigInt_01_EmptyDefault();
			case AlldatatypesPackage.BIG_INTEGERS__NOT_EDITABLE_BIG_INT_01:
				return getNotEditableBigInt_01();
			case AlldatatypesPackage.BIG_INTEGERS__BIG_INTS:
				return getBigInts();
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
			case AlldatatypesPackage.BIG_INTEGERS__BIG_INT_01:
				setBigInt_01((BigInteger)newValue);
				return;
			case AlldatatypesPackage.BIG_INTEGERS__BIG_INT_1:
				setBigInt_1((BigInteger)newValue);
				return;
			case AlldatatypesPackage.BIG_INTEGERS__BIG_INT_01_EMPTY_DEFAULT:
				setBigInt_01_EmptyDefault((BigInteger)newValue);
				return;
			case AlldatatypesPackage.BIG_INTEGERS__BIG_INTS:
				getBigInts().clear();
				getBigInts().addAll((Collection<? extends BigInteger>)newValue);
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
			case AlldatatypesPackage.BIG_INTEGERS__BIG_INT_01:
				setBigInt_01(BIG_INT_01_EDEFAULT);
				return;
			case AlldatatypesPackage.BIG_INTEGERS__BIG_INT_1:
				setBigInt_1(BIG_INT_1_EDEFAULT);
				return;
			case AlldatatypesPackage.BIG_INTEGERS__BIG_INT_01_EMPTY_DEFAULT:
				setBigInt_01_EmptyDefault(BIG_INT_01_EMPTY_DEFAULT_EDEFAULT);
				return;
			case AlldatatypesPackage.BIG_INTEGERS__BIG_INTS:
				getBigInts().clear();
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
			case AlldatatypesPackage.BIG_INTEGERS__BIG_INT_01:
				return BIG_INT_01_EDEFAULT == null ? bigInt_01 != null : !BIG_INT_01_EDEFAULT.equals(bigInt_01);
			case AlldatatypesPackage.BIG_INTEGERS__BIG_INT_1:
				return BIG_INT_1_EDEFAULT == null ? bigInt_1 != null : !BIG_INT_1_EDEFAULT.equals(bigInt_1);
			case AlldatatypesPackage.BIG_INTEGERS__BIG_INT_01_EMPTY_DEFAULT:
				return BIG_INT_01_EMPTY_DEFAULT_EDEFAULT == null ? bigInt_01_EmptyDefault != null : !BIG_INT_01_EMPTY_DEFAULT_EDEFAULT.equals(bigInt_01_EmptyDefault);
			case AlldatatypesPackage.BIG_INTEGERS__NOT_EDITABLE_BIG_INT_01:
				return NOT_EDITABLE_BIG_INT_01_EDEFAULT == null ? notEditableBigInt_01 != null : !NOT_EDITABLE_BIG_INT_01_EDEFAULT.equals(notEditableBigInt_01);
			case AlldatatypesPackage.BIG_INTEGERS__BIG_INTS:
				return bigInts != null && !bigInts.isEmpty();
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
		result.append(" (bigInt_01: ");
		result.append(bigInt_01);
		result.append(", bigInt_1: ");
		result.append(bigInt_1);
		result.append(", bigInt_01_EmptyDefault: ");
		result.append(bigInt_01_EmptyDefault);
		result.append(", notEditableBigInt_01: ");
		result.append(notEditableBigInt_01);
		result.append(", bigInts: ");
		result.append(bigInts);
		result.append(')');
		return result.toString();
	}

} //BigIntegersImpl
