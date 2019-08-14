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
 * A representation of the model object '<em><b>Floats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Floats#getFloat_01 <em>Float 01</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Floats#getFloat_1 <em>Float 1</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Floats#getFloat_01_EmptyDefault <em>Float 01 Empty Default</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Floats#getNotEditableFloat_01 <em>Not Editable Float 01</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getFloats()
 * @model
 * @generated
 */
public interface Floats extends Type {
	/**
	 * Returns the value of the '<em><b>Float 01</b></em>' attribute.
	 * The default value is <code>"12.1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float 01</em>' attribute.
	 * @see #setFloat_01(float)
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getFloats_Float_01()
	 * @model default="12.1"
	 * @generated
	 */
	float getFloat_01();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.sample.alldatatypes.Floats#getFloat_01 <em>Float 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float 01</em>' attribute.
	 * @see #getFloat_01()
	 * @generated
	 */
	void setFloat_01(float value);

	/**
	 * Returns the value of the '<em><b>Float 1</b></em>' attribute.
	 * The default value is <code>"12.1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float 1</em>' attribute.
	 * @see #setFloat_1(float)
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getFloats_Float_1()
	 * @model default="12.1" required="true"
	 * @generated
	 */
	float getFloat_1();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.sample.alldatatypes.Floats#getFloat_1 <em>Float 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float 1</em>' attribute.
	 * @see #getFloat_1()
	 * @generated
	 */
	void setFloat_1(float value);

	/**
	 * Returns the value of the '<em><b>Float 01 Empty Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float 01 Empty Default</em>' attribute.
	 * @see #setFloat_01_EmptyDefault(float)
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getFloats_Float_01_EmptyDefault()
	 * @model
	 * @generated
	 */
	float getFloat_01_EmptyDefault();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.sample.alldatatypes.Floats#getFloat_01_EmptyDefault <em>Float 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float 01 Empty Default</em>' attribute.
	 * @see #getFloat_01_EmptyDefault()
	 * @generated
	 */
	void setFloat_01_EmptyDefault(float value);

	/**
	 * Returns the value of the '<em><b>Not Editable Float 01</b></em>' attribute.
	 * The default value is <code>"12.1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Editable Float 01</em>' attribute.
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getFloats_NotEditableFloat_01()
	 * @model default="12.1" changeable="false"
	 * @generated
	 */
	float getNotEditableFloat_01();

} // Floats
