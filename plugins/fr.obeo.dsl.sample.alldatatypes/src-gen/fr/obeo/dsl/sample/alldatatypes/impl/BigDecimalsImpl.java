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
import fr.obeo.dsl.sample.alldatatypes.BigDecimals;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Big Decimals</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.BigDecimalsImpl#getBigDecimal_01 <em>Big Decimal 01</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.BigDecimalsImpl#getBigDecimal_1 <em>Big Decimal 1</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.BigDecimalsImpl#getBigDecimal_01_EmptyDefault <em>Big Decimal 01 Empty Default</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.BigDecimalsImpl#getNotEditableBigDecimal_01 <em>Not Editable Big Decimal 01</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.BigDecimalsImpl#getBigDecimals <em>Big Decimals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BigDecimalsImpl extends ElementImpl implements BigDecimals {
	/**
	 * The default value of the '{@link #getBigDecimal_01() <em>Big Decimal 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigDecimal_01()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BIG_DECIMAL_01_EDEFAULT = new BigDecimal("23");

	/**
	 * The cached value of the '{@link #getBigDecimal_01() <em>Big Decimal 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigDecimal_01()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal bigDecimal_01 = BIG_DECIMAL_01_EDEFAULT;

	/**
	 * The default value of the '{@link #getBigDecimal_1() <em>Big Decimal 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigDecimal_1()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BIG_DECIMAL_1_EDEFAULT = new BigDecimal("23");

	/**
	 * The cached value of the '{@link #getBigDecimal_1() <em>Big Decimal 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigDecimal_1()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal bigDecimal_1 = BIG_DECIMAL_1_EDEFAULT;

	/**
	 * The default value of the '{@link #getBigDecimal_01_EmptyDefault() <em>Big Decimal 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigDecimal_01_EmptyDefault()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BIG_DECIMAL_01_EMPTY_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBigDecimal_01_EmptyDefault() <em>Big Decimal 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigDecimal_01_EmptyDefault()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal bigDecimal_01_EmptyDefault = BIG_DECIMAL_01_EMPTY_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotEditableBigDecimal_01() <em>Not Editable Big Decimal 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotEditableBigDecimal_01()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal NOT_EDITABLE_BIG_DECIMAL_01_EDEFAULT = new BigDecimal("23");

	/**
	 * The cached value of the '{@link #getNotEditableBigDecimal_01() <em>Not Editable Big Decimal 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotEditableBigDecimal_01()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal notEditableBigDecimal_01 = NOT_EDITABLE_BIG_DECIMAL_01_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBigDecimals() <em>Big Decimals</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigDecimals()
	 * @generated
	 * @ordered
	 */
	protected EList<BigDecimal> bigDecimals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BigDecimalsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlldatatypesPackage.Literals.BIG_DECIMALS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getBigDecimal_01() {
		return bigDecimal_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBigDecimal_01(BigDecimal newBigDecimal_01) {
		BigDecimal oldBigDecimal_01 = bigDecimal_01;
		bigDecimal_01 = newBigDecimal_01;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.BIG_DECIMALS__BIG_DECIMAL_01, oldBigDecimal_01, bigDecimal_01));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getBigDecimal_1() {
		return bigDecimal_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBigDecimal_1(BigDecimal newBigDecimal_1) {
		BigDecimal oldBigDecimal_1 = bigDecimal_1;
		bigDecimal_1 = newBigDecimal_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.BIG_DECIMALS__BIG_DECIMAL_1, oldBigDecimal_1, bigDecimal_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getBigDecimal_01_EmptyDefault() {
		return bigDecimal_01_EmptyDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBigDecimal_01_EmptyDefault(BigDecimal newBigDecimal_01_EmptyDefault) {
		BigDecimal oldBigDecimal_01_EmptyDefault = bigDecimal_01_EmptyDefault;
		bigDecimal_01_EmptyDefault = newBigDecimal_01_EmptyDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.BIG_DECIMALS__BIG_DECIMAL_01_EMPTY_DEFAULT, oldBigDecimal_01_EmptyDefault, bigDecimal_01_EmptyDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getNotEditableBigDecimal_01() {
		return notEditableBigDecimal_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigDecimal> getBigDecimals() {
		if (bigDecimals == null) {
			bigDecimals = new EDataTypeUniqueEList<BigDecimal>(BigDecimal.class, this, AlldatatypesPackage.BIG_DECIMALS__BIG_DECIMALS);
		}
		return bigDecimals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlldatatypesPackage.BIG_DECIMALS__BIG_DECIMAL_01:
				return getBigDecimal_01();
			case AlldatatypesPackage.BIG_DECIMALS__BIG_DECIMAL_1:
				return getBigDecimal_1();
			case AlldatatypesPackage.BIG_DECIMALS__BIG_DECIMAL_01_EMPTY_DEFAULT:
				return getBigDecimal_01_EmptyDefault();
			case AlldatatypesPackage.BIG_DECIMALS__NOT_EDITABLE_BIG_DECIMAL_01:
				return getNotEditableBigDecimal_01();
			case AlldatatypesPackage.BIG_DECIMALS__BIG_DECIMALS:
				return getBigDecimals();
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
			case AlldatatypesPackage.BIG_DECIMALS__BIG_DECIMAL_01:
				setBigDecimal_01((BigDecimal)newValue);
				return;
			case AlldatatypesPackage.BIG_DECIMALS__BIG_DECIMAL_1:
				setBigDecimal_1((BigDecimal)newValue);
				return;
			case AlldatatypesPackage.BIG_DECIMALS__BIG_DECIMAL_01_EMPTY_DEFAULT:
				setBigDecimal_01_EmptyDefault((BigDecimal)newValue);
				return;
			case AlldatatypesPackage.BIG_DECIMALS__BIG_DECIMALS:
				getBigDecimals().clear();
				getBigDecimals().addAll((Collection<? extends BigDecimal>)newValue);
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
			case AlldatatypesPackage.BIG_DECIMALS__BIG_DECIMAL_01:
				setBigDecimal_01(BIG_DECIMAL_01_EDEFAULT);
				return;
			case AlldatatypesPackage.BIG_DECIMALS__BIG_DECIMAL_1:
				setBigDecimal_1(BIG_DECIMAL_1_EDEFAULT);
				return;
			case AlldatatypesPackage.BIG_DECIMALS__BIG_DECIMAL_01_EMPTY_DEFAULT:
				setBigDecimal_01_EmptyDefault(BIG_DECIMAL_01_EMPTY_DEFAULT_EDEFAULT);
				return;
			case AlldatatypesPackage.BIG_DECIMALS__BIG_DECIMALS:
				getBigDecimals().clear();
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
			case AlldatatypesPackage.BIG_DECIMALS__BIG_DECIMAL_01:
				return BIG_DECIMAL_01_EDEFAULT == null ? bigDecimal_01 != null : !BIG_DECIMAL_01_EDEFAULT.equals(bigDecimal_01);
			case AlldatatypesPackage.BIG_DECIMALS__BIG_DECIMAL_1:
				return BIG_DECIMAL_1_EDEFAULT == null ? bigDecimal_1 != null : !BIG_DECIMAL_1_EDEFAULT.equals(bigDecimal_1);
			case AlldatatypesPackage.BIG_DECIMALS__BIG_DECIMAL_01_EMPTY_DEFAULT:
				return BIG_DECIMAL_01_EMPTY_DEFAULT_EDEFAULT == null ? bigDecimal_01_EmptyDefault != null : !BIG_DECIMAL_01_EMPTY_DEFAULT_EDEFAULT.equals(bigDecimal_01_EmptyDefault);
			case AlldatatypesPackage.BIG_DECIMALS__NOT_EDITABLE_BIG_DECIMAL_01:
				return NOT_EDITABLE_BIG_DECIMAL_01_EDEFAULT == null ? notEditableBigDecimal_01 != null : !NOT_EDITABLE_BIG_DECIMAL_01_EDEFAULT.equals(notEditableBigDecimal_01);
			case AlldatatypesPackage.BIG_DECIMALS__BIG_DECIMALS:
				return bigDecimals != null && !bigDecimals.isEmpty();
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
		result.append(" (bigDecimal_01: ");
		result.append(bigDecimal_01);
		result.append(", bigDecimal_1: ");
		result.append(bigDecimal_1);
		result.append(", bigDecimal_01_EmptyDefault: ");
		result.append(bigDecimal_01_EmptyDefault);
		result.append(", notEditableBigDecimal_01: ");
		result.append(notEditableBigDecimal_01);
		result.append(", bigDecimals: ");
		result.append(bigDecimals);
		result.append(')');
		return result.toString();
	}

} //BigDecimalsImpl
