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
import alldatatypes.Dates;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alldatatypes.impl.DatesImpl#getDateEmptyDefault_01 <em>Date Empty Default 01</em>}</li>
 *   <li>{@link alldatatypes.impl.DatesImpl#getDate_01 <em>Date 01</em>}</li>
 *   <li>{@link alldatatypes.impl.DatesImpl#getDate_1 <em>Date 1</em>}</li>
 *   <li>{@link alldatatypes.impl.DatesImpl#getDate_01_HM <em>Date 01 HM</em>}</li>
 *   <li>{@link alldatatypes.impl.DatesImpl#getDate_01_HMS <em>Date 01 HMS</em>}</li>
 *   <li>{@link alldatatypes.impl.DatesImpl#getDate_01_HMSms <em>Date 01 HM Sms</em>}</li>
 *   <li>{@link alldatatypes.impl.DatesImpl#getNotEditableDate_01 <em>Not Editable Date 01</em>}</li>
 *   <li>{@link alldatatypes.impl.DatesImpl#getDates <em>Dates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatesImpl extends ElementImpl implements Dates {
	/**
	 * The default value of the '{@link #getDateEmptyDefault_01() <em>Date Empty Default 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEmptyDefault_01()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EMPTY_DEFAULT_01_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateEmptyDefault_01() <em>Date Empty Default 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEmptyDefault_01()
	 * @generated
	 * @ordered
	 */
	protected Date dateEmptyDefault_01 = DATE_EMPTY_DEFAULT_01_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate_01() <em>Date 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_01()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_01_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "1987-07-16");

	/**
	 * The cached value of the '{@link #getDate_01() <em>Date 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_01()
	 * @generated
	 * @ordered
	 */
	protected Date date_01 = DATE_01_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate_1() <em>Date 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_1()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_1_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "1987-07-16");

	/**
	 * The cached value of the '{@link #getDate_1() <em>Date 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_1()
	 * @generated
	 * @ordered
	 */
	protected Date date_1 = DATE_1_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate_01_HM() <em>Date 01 HM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_01_HM()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_01_HM_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "1987-07-16T12:14");

	/**
	 * The cached value of the '{@link #getDate_01_HM() <em>Date 01 HM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_01_HM()
	 * @generated
	 * @ordered
	 */
	protected Date date_01_HM = DATE_01_HM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate_01_HMS() <em>Date 01 HMS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_01_HMS()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_01_HMS_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "1987-07-16T12:14:010");

	/**
	 * The cached value of the '{@link #getDate_01_HMS() <em>Date 01 HMS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_01_HMS()
	 * @generated
	 * @ordered
	 */
	protected Date date_01_HMS = DATE_01_HMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate_01_HMSms() <em>Date 01 HM Sms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_01_HMSms()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_01_HM_SMS_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "1987-07-16T12:14:010+0010");

	/**
	 * The cached value of the '{@link #getDate_01_HMSms() <em>Date 01 HM Sms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate_01_HMSms()
	 * @generated
	 * @ordered
	 */
	protected Date date_01_HMSms = DATE_01_HM_SMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotEditableDate_01() <em>Not Editable Date 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotEditableDate_01()
	 * @generated
	 * @ordered
	 */
	protected static final Date NOT_EDITABLE_DATE_01_EDEFAULT = (Date)EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), "1987-07-16");

	/**
	 * The cached value of the '{@link #getNotEditableDate_01() <em>Not Editable Date 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotEditableDate_01()
	 * @generated
	 * @ordered
	 */
	protected Date notEditableDate_01 = NOT_EDITABLE_DATE_01_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDates() <em>Dates</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDates()
	 * @generated
	 * @ordered
	 */
	protected EList<Date> dates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlldatatypesPackage.Literals.DATES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateEmptyDefault_01() {
		return dateEmptyDefault_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateEmptyDefault_01(Date newDateEmptyDefault_01) {
		Date oldDateEmptyDefault_01 = dateEmptyDefault_01;
		dateEmptyDefault_01 = newDateEmptyDefault_01;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.DATES__DATE_EMPTY_DEFAULT_01, oldDateEmptyDefault_01, dateEmptyDefault_01));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate_01() {
		return date_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate_01(Date newDate_01) {
		Date oldDate_01 = date_01;
		date_01 = newDate_01;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.DATES__DATE_01, oldDate_01, date_01));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate_1() {
		return date_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate_1(Date newDate_1) {
		Date oldDate_1 = date_1;
		date_1 = newDate_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.DATES__DATE_1, oldDate_1, date_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate_01_HM() {
		return date_01_HM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate_01_HM(Date newDate_01_HM) {
		Date oldDate_01_HM = date_01_HM;
		date_01_HM = newDate_01_HM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.DATES__DATE_01_HM, oldDate_01_HM, date_01_HM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate_01_HMS() {
		return date_01_HMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate_01_HMS(Date newDate_01_HMS) {
		Date oldDate_01_HMS = date_01_HMS;
		date_01_HMS = newDate_01_HMS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.DATES__DATE_01_HMS, oldDate_01_HMS, date_01_HMS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate_01_HMSms() {
		return date_01_HMSms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate_01_HMSms(Date newDate_01_HMSms) {
		Date oldDate_01_HMSms = date_01_HMSms;
		date_01_HMSms = newDate_01_HMSms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.DATES__DATE_01_HM_SMS, oldDate_01_HMSms, date_01_HMSms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getNotEditableDate_01() {
		return notEditableDate_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Date> getDates() {
		if (dates == null) {
			dates = new EDataTypeUniqueEList<Date>(Date.class, this, AlldatatypesPackage.DATES__DATES);
		}
		return dates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlldatatypesPackage.DATES__DATE_EMPTY_DEFAULT_01:
				return getDateEmptyDefault_01();
			case AlldatatypesPackage.DATES__DATE_01:
				return getDate_01();
			case AlldatatypesPackage.DATES__DATE_1:
				return getDate_1();
			case AlldatatypesPackage.DATES__DATE_01_HM:
				return getDate_01_HM();
			case AlldatatypesPackage.DATES__DATE_01_HMS:
				return getDate_01_HMS();
			case AlldatatypesPackage.DATES__DATE_01_HM_SMS:
				return getDate_01_HMSms();
			case AlldatatypesPackage.DATES__NOT_EDITABLE_DATE_01:
				return getNotEditableDate_01();
			case AlldatatypesPackage.DATES__DATES:
				return getDates();
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
			case AlldatatypesPackage.DATES__DATE_EMPTY_DEFAULT_01:
				setDateEmptyDefault_01((Date)newValue);
				return;
			case AlldatatypesPackage.DATES__DATE_01:
				setDate_01((Date)newValue);
				return;
			case AlldatatypesPackage.DATES__DATE_1:
				setDate_1((Date)newValue);
				return;
			case AlldatatypesPackage.DATES__DATE_01_HM:
				setDate_01_HM((Date)newValue);
				return;
			case AlldatatypesPackage.DATES__DATE_01_HMS:
				setDate_01_HMS((Date)newValue);
				return;
			case AlldatatypesPackage.DATES__DATE_01_HM_SMS:
				setDate_01_HMSms((Date)newValue);
				return;
			case AlldatatypesPackage.DATES__DATES:
				getDates().clear();
				getDates().addAll((Collection<? extends Date>)newValue);
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
			case AlldatatypesPackage.DATES__DATE_EMPTY_DEFAULT_01:
				setDateEmptyDefault_01(DATE_EMPTY_DEFAULT_01_EDEFAULT);
				return;
			case AlldatatypesPackage.DATES__DATE_01:
				setDate_01(DATE_01_EDEFAULT);
				return;
			case AlldatatypesPackage.DATES__DATE_1:
				setDate_1(DATE_1_EDEFAULT);
				return;
			case AlldatatypesPackage.DATES__DATE_01_HM:
				setDate_01_HM(DATE_01_HM_EDEFAULT);
				return;
			case AlldatatypesPackage.DATES__DATE_01_HMS:
				setDate_01_HMS(DATE_01_HMS_EDEFAULT);
				return;
			case AlldatatypesPackage.DATES__DATE_01_HM_SMS:
				setDate_01_HMSms(DATE_01_HM_SMS_EDEFAULT);
				return;
			case AlldatatypesPackage.DATES__DATES:
				getDates().clear();
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
			case AlldatatypesPackage.DATES__DATE_EMPTY_DEFAULT_01:
				return DATE_EMPTY_DEFAULT_01_EDEFAULT == null ? dateEmptyDefault_01 != null : !DATE_EMPTY_DEFAULT_01_EDEFAULT.equals(dateEmptyDefault_01);
			case AlldatatypesPackage.DATES__DATE_01:
				return DATE_01_EDEFAULT == null ? date_01 != null : !DATE_01_EDEFAULT.equals(date_01);
			case AlldatatypesPackage.DATES__DATE_1:
				return DATE_1_EDEFAULT == null ? date_1 != null : !DATE_1_EDEFAULT.equals(date_1);
			case AlldatatypesPackage.DATES__DATE_01_HM:
				return DATE_01_HM_EDEFAULT == null ? date_01_HM != null : !DATE_01_HM_EDEFAULT.equals(date_01_HM);
			case AlldatatypesPackage.DATES__DATE_01_HMS:
				return DATE_01_HMS_EDEFAULT == null ? date_01_HMS != null : !DATE_01_HMS_EDEFAULT.equals(date_01_HMS);
			case AlldatatypesPackage.DATES__DATE_01_HM_SMS:
				return DATE_01_HM_SMS_EDEFAULT == null ? date_01_HMSms != null : !DATE_01_HM_SMS_EDEFAULT.equals(date_01_HMSms);
			case AlldatatypesPackage.DATES__NOT_EDITABLE_DATE_01:
				return NOT_EDITABLE_DATE_01_EDEFAULT == null ? notEditableDate_01 != null : !NOT_EDITABLE_DATE_01_EDEFAULT.equals(notEditableDate_01);
			case AlldatatypesPackage.DATES__DATES:
				return dates != null && !dates.isEmpty();
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
		result.append(" (dateEmptyDefault_01: ");
		result.append(dateEmptyDefault_01);
		result.append(", date_01: ");
		result.append(date_01);
		result.append(", date_1: ");
		result.append(date_1);
		result.append(", date_01_HM: ");
		result.append(date_01_HM);
		result.append(", date_01_HMS: ");
		result.append(date_01_HMS);
		result.append(", date_01_HMSms: ");
		result.append(date_01_HMSms);
		result.append(", notEditableDate_01: ");
		result.append(notEditableDate_01);
		result.append(", dates: ");
		result.append(dates);
		result.append(')');
		return result.toString();
	}

} //DatesImpl
