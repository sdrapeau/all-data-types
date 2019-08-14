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
package fr.obeo.dsl.sample.alldatatypes;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Dates#getDateEmptyDefault_01 <em>Date Empty Default 01</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Dates#getDate_01 <em>Date 01</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Dates#getDate_1 <em>Date 1</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Dates#getDate_01_HM <em>Date 01 HM</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Dates#getDate_01_HMS <em>Date 01 HMS</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Dates#getDate_01_HMSms <em>Date 01 HM Sms</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Dates#getNotEditableDate_01 <em>Not Editable Date 01</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Dates#getDates <em>Dates</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getDates()
 * @model
 * @generated
 */
public interface Dates extends Type {
	/**
	 * Returns the value of the '<em><b>Date Empty Default 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Empty Default 01</em>' attribute.
	 * @see #setDateEmptyDefault_01(Date)
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getDates_DateEmptyDefault_01()
	 * @model
	 * @generated
	 */
	Date getDateEmptyDefault_01();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.sample.alldatatypes.Dates#getDateEmptyDefault_01 <em>Date Empty Default 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Empty Default 01</em>' attribute.
	 * @see #getDateEmptyDefault_01()
	 * @generated
	 */
	void setDateEmptyDefault_01(Date value);

	/**
	 * Returns the value of the '<em><b>Date 01</b></em>' attribute.
	 * The default value is <code>"1987-07-16"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date 01</em>' attribute.
	 * @see #setDate_01(Date)
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getDates_Date_01()
	 * @model default="1987-07-16"
	 * @generated
	 */
	Date getDate_01();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.sample.alldatatypes.Dates#getDate_01 <em>Date 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date 01</em>' attribute.
	 * @see #getDate_01()
	 * @generated
	 */
	void setDate_01(Date value);

	/**
	 * Returns the value of the '<em><b>Date 1</b></em>' attribute.
	 * The default value is <code>"1987-07-16"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date 1</em>' attribute.
	 * @see #setDate_1(Date)
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getDates_Date_1()
	 * @model default="1987-07-16" required="true"
	 * @generated
	 */
	Date getDate_1();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.sample.alldatatypes.Dates#getDate_1 <em>Date 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date 1</em>' attribute.
	 * @see #getDate_1()
	 * @generated
	 */
	void setDate_1(Date value);

	/**
	 * Returns the value of the '<em><b>Date 01 HM</b></em>' attribute.
	 * The default value is <code>"1987-07-16T12:14"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date 01 HM</em>' attribute.
	 * @see #setDate_01_HM(Date)
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getDates_Date_01_HM()
	 * @model default="1987-07-16T12:14"
	 * @generated
	 */
	Date getDate_01_HM();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.sample.alldatatypes.Dates#getDate_01_HM <em>Date 01 HM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date 01 HM</em>' attribute.
	 * @see #getDate_01_HM()
	 * @generated
	 */
	void setDate_01_HM(Date value);

	/**
	 * Returns the value of the '<em><b>Date 01 HMS</b></em>' attribute.
	 * The default value is <code>"1987-07-16T12:14:010"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date 01 HMS</em>' attribute.
	 * @see #setDate_01_HMS(Date)
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getDates_Date_01_HMS()
	 * @model default="1987-07-16T12:14:010"
	 * @generated
	 */
	Date getDate_01_HMS();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.sample.alldatatypes.Dates#getDate_01_HMS <em>Date 01 HMS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date 01 HMS</em>' attribute.
	 * @see #getDate_01_HMS()
	 * @generated
	 */
	void setDate_01_HMS(Date value);

	/**
	 * Returns the value of the '<em><b>Date 01 HM Sms</b></em>' attribute.
	 * The default value is <code>"1987-07-16T12:14:010+0010"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date 01 HM Sms</em>' attribute.
	 * @see #setDate_01_HMSms(Date)
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getDates_Date_01_HMSms()
	 * @model default="1987-07-16T12:14:010+0010"
	 * @generated
	 */
	Date getDate_01_HMSms();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.sample.alldatatypes.Dates#getDate_01_HMSms <em>Date 01 HM Sms</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date 01 HM Sms</em>' attribute.
	 * @see #getDate_01_HMSms()
	 * @generated
	 */
	void setDate_01_HMSms(Date value);

	/**
	 * Returns the value of the '<em><b>Not Editable Date 01</b></em>' attribute.
	 * The default value is <code>"1987-07-16"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Editable Date 01</em>' attribute.
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getDates_NotEditableDate_01()
	 * @model default="1987-07-16" changeable="false"
	 * @generated
	 */
	Date getNotEditableDate_01();

	/**
	 * Returns the value of the '<em><b>Dates</b></em>' attribute list.
	 * The list contents are of type {@link java.util.Date}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dates</em>' attribute list.
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getDates_Dates()
	 * @model default="1987-07-16"
	 * @generated
	 */
	EList<Date> getDates();

} // Dates
