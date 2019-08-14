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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shorts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Shorts#getShort_01 <em>Short 01</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Shorts#getShort_1 <em>Short 1</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Shorts#getShort_01_EmptyDefault <em>Short 01 Empty Default</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Shorts#getNotEditableShort_01 <em>Not Editable Short 01</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getShorts()
 * @model
 * @generated
 */
public interface Shorts extends Type {
	/**
	 * Returns the value of the '<em><b>Short 01</b></em>' attribute.
	 * The default value is <code>"23"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short 01</em>' attribute.
	 * @see #setShort_01(short)
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getShorts_Short_01()
	 * @model default="23"
	 * @generated
	 */
	short getShort_01();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.sample.alldatatypes.Shorts#getShort_01 <em>Short 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short 01</em>' attribute.
	 * @see #getShort_01()
	 * @generated
	 */
	void setShort_01(short value);

	/**
	 * Returns the value of the '<em><b>Short 1</b></em>' attribute.
	 * The default value is <code>"23"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short 1</em>' attribute.
	 * @see #setShort_1(short)
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getShorts_Short_1()
	 * @model default="23" required="true"
	 * @generated
	 */
	short getShort_1();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.sample.alldatatypes.Shorts#getShort_1 <em>Short 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short 1</em>' attribute.
	 * @see #getShort_1()
	 * @generated
	 */
	void setShort_1(short value);

	/**
	 * Returns the value of the '<em><b>Short 01 Empty Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short 01 Empty Default</em>' attribute.
	 * @see #setShort_01_EmptyDefault(short)
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getShorts_Short_01_EmptyDefault()
	 * @model
	 * @generated
	 */
	short getShort_01_EmptyDefault();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.sample.alldatatypes.Shorts#getShort_01_EmptyDefault <em>Short 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short 01 Empty Default</em>' attribute.
	 * @see #getShort_01_EmptyDefault()
	 * @generated
	 */
	void setShort_01_EmptyDefault(short value);

	/**
	 * Returns the value of the '<em><b>Not Editable Short 01</b></em>' attribute.
	 * The default value is <code>"23"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Editable Short 01</em>' attribute.
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getShorts_NotEditableShort_01()
	 * @model default="23" changeable="false"
	 * @generated
	 */
	short getNotEditableShort_01();

} // Shorts
