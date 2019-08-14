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
import alldatatypes.Doubles;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doubles</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alldatatypes.impl.DoublesImpl#getDouble_01 <em>Double 01</em>}</li>
 *   <li>{@link alldatatypes.impl.DoublesImpl#getDouble_1 <em>Double 1</em>}</li>
 *   <li>{@link alldatatypes.impl.DoublesImpl#getDouble_01_EmptyDefault <em>Double 01 Empty Default</em>}</li>
 *   <li>{@link alldatatypes.impl.DoublesImpl#getNotEditableDouble_01 <em>Not Editable Double 01</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoublesImpl extends ElementImpl implements Doubles {
	/**
	 * The default value of the '{@link #getDouble_01() <em>Double 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDouble_01()
	 * @generated
	 * @ordered
	 */
	protected static final double DOUBLE_01_EDEFAULT = 12.1;

	/**
	 * The cached value of the '{@link #getDouble_01() <em>Double 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDouble_01()
	 * @generated
	 * @ordered
	 */
	protected double double_01 = DOUBLE_01_EDEFAULT;

	/**
	 * The default value of the '{@link #getDouble_1() <em>Double 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDouble_1()
	 * @generated
	 * @ordered
	 */
	protected static final double DOUBLE_1_EDEFAULT = 12.1;

	/**
	 * The cached value of the '{@link #getDouble_1() <em>Double 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDouble_1()
	 * @generated
	 * @ordered
	 */
	protected double double_1 = DOUBLE_1_EDEFAULT;

	/**
	 * The default value of the '{@link #getDouble_01_EmptyDefault() <em>Double 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDouble_01_EmptyDefault()
	 * @generated
	 * @ordered
	 */
	protected static final double DOUBLE_01_EMPTY_DEFAULT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDouble_01_EmptyDefault() <em>Double 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDouble_01_EmptyDefault()
	 * @generated
	 * @ordered
	 */
	protected double double_01_EmptyDefault = DOUBLE_01_EMPTY_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotEditableDouble_01() <em>Not Editable Double 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotEditableDouble_01()
	 * @generated
	 * @ordered
	 */
	protected static final double NOT_EDITABLE_DOUBLE_01_EDEFAULT = 12.1;

	/**
	 * The cached value of the '{@link #getNotEditableDouble_01() <em>Not Editable Double 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotEditableDouble_01()
	 * @generated
	 * @ordered
	 */
	protected double notEditableDouble_01 = NOT_EDITABLE_DOUBLE_01_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoublesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlldatatypesPackage.Literals.DOUBLES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDouble_01() {
		return double_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDouble_01(double newDouble_01) {
		double oldDouble_01 = double_01;
		double_01 = newDouble_01;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.DOUBLES__DOUBLE_01, oldDouble_01, double_01));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDouble_1() {
		return double_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDouble_1(double newDouble_1) {
		double oldDouble_1 = double_1;
		double_1 = newDouble_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.DOUBLES__DOUBLE_1, oldDouble_1, double_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDouble_01_EmptyDefault() {
		return double_01_EmptyDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDouble_01_EmptyDefault(double newDouble_01_EmptyDefault) {
		double oldDouble_01_EmptyDefault = double_01_EmptyDefault;
		double_01_EmptyDefault = newDouble_01_EmptyDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.DOUBLES__DOUBLE_01_EMPTY_DEFAULT, oldDouble_01_EmptyDefault, double_01_EmptyDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNotEditableDouble_01() {
		return notEditableDouble_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlldatatypesPackage.DOUBLES__DOUBLE_01:
				return getDouble_01();
			case AlldatatypesPackage.DOUBLES__DOUBLE_1:
				return getDouble_1();
			case AlldatatypesPackage.DOUBLES__DOUBLE_01_EMPTY_DEFAULT:
				return getDouble_01_EmptyDefault();
			case AlldatatypesPackage.DOUBLES__NOT_EDITABLE_DOUBLE_01:
				return getNotEditableDouble_01();
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
			case AlldatatypesPackage.DOUBLES__DOUBLE_01:
				setDouble_01((Double)newValue);
				return;
			case AlldatatypesPackage.DOUBLES__DOUBLE_1:
				setDouble_1((Double)newValue);
				return;
			case AlldatatypesPackage.DOUBLES__DOUBLE_01_EMPTY_DEFAULT:
				setDouble_01_EmptyDefault((Double)newValue);
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
			case AlldatatypesPackage.DOUBLES__DOUBLE_01:
				setDouble_01(DOUBLE_01_EDEFAULT);
				return;
			case AlldatatypesPackage.DOUBLES__DOUBLE_1:
				setDouble_1(DOUBLE_1_EDEFAULT);
				return;
			case AlldatatypesPackage.DOUBLES__DOUBLE_01_EMPTY_DEFAULT:
				setDouble_01_EmptyDefault(DOUBLE_01_EMPTY_DEFAULT_EDEFAULT);
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
			case AlldatatypesPackage.DOUBLES__DOUBLE_01:
				return double_01 != DOUBLE_01_EDEFAULT;
			case AlldatatypesPackage.DOUBLES__DOUBLE_1:
				return double_1 != DOUBLE_1_EDEFAULT;
			case AlldatatypesPackage.DOUBLES__DOUBLE_01_EMPTY_DEFAULT:
				return double_01_EmptyDefault != DOUBLE_01_EMPTY_DEFAULT_EDEFAULT;
			case AlldatatypesPackage.DOUBLES__NOT_EDITABLE_DOUBLE_01:
				return notEditableDouble_01 != NOT_EDITABLE_DOUBLE_01_EDEFAULT;
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
		result.append(" (double_01: ");
		result.append(double_01);
		result.append(", double_1: ");
		result.append(double_1);
		result.append(", double_01_EmptyDefault: ");
		result.append(double_01_EmptyDefault);
		result.append(", notEditableDouble_01: ");
		result.append(notEditableDouble_01);
		result.append(')');
		return result.toString();
	}

} //DoublesImpl
