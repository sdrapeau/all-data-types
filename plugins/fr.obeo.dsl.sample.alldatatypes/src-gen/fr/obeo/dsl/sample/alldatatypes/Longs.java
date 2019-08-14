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
 * A representation of the model object '<em><b>Longs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Longs#getLong_01 <em>Long 01</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Longs#getLong_1 <em>Long 1</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Longs#getLong_01_EmptyDefault <em>Long 01 Empty Default</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Longs#getNotEditableLong_01 <em>Not Editable Long 01</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getLongs()
 * @model
 * @generated
 */
public interface Longs extends Type {
	/**
	 * Returns the value of the '<em><b>Long 01</b></em>' attribute.
	 * The default value is <code>"23"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long 01</em>' attribute.
	 * @see #setLong_01(long)
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getLongs_Long_01()
	 * @model default="23"
	 * @generated
	 */
	long getLong_01();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.sample.alldatatypes.Longs#getLong_01 <em>Long 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long 01</em>' attribute.
	 * @see #getLong_01()
	 * @generated
	 */
	void setLong_01(long value);

	/**
	 * Returns the value of the '<em><b>Long 1</b></em>' attribute.
	 * The default value is <code>"23"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long 1</em>' attribute.
	 * @see #setLong_1(long)
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getLongs_Long_1()
	 * @model default="23" required="true"
	 * @generated
	 */
	long getLong_1();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.sample.alldatatypes.Longs#getLong_1 <em>Long 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long 1</em>' attribute.
	 * @see #getLong_1()
	 * @generated
	 */
	void setLong_1(long value);

	/**
	 * Returns the value of the '<em><b>Long 01 Empty Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long 01 Empty Default</em>' attribute.
	 * @see #setLong_01_EmptyDefault(long)
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getLongs_Long_01_EmptyDefault()
	 * @model
	 * @generated
	 */
	long getLong_01_EmptyDefault();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.sample.alldatatypes.Longs#getLong_01_EmptyDefault <em>Long 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long 01 Empty Default</em>' attribute.
	 * @see #getLong_01_EmptyDefault()
	 * @generated
	 */
	void setLong_01_EmptyDefault(long value);

	/**
	 * Returns the value of the '<em><b>Not Editable Long 01</b></em>' attribute.
	 * The default value is <code>"23"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Editable Long 01</em>' attribute.
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getLongs_NotEditableLong_01()
	 * @model default="23" changeable="false"
	 * @generated
	 */
	long getNotEditableLong_01();

} // Longs
