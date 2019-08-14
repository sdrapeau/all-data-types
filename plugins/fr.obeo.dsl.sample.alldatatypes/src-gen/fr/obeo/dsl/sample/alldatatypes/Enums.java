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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enums</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Enums#getEnum_01 <em>Enum 01</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Enums#getEnum_01_EmptyDefault <em>Enum 01 Empty Default</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Enums#getEnum_1 <em>Enum 1</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Enums#getEnums <em>Enums</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Enums#getNotEditableEnum_01 <em>Not Editable Enum 01</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Enums#getStates <em>States</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Enums#getStatesMax2 <em>States Max2</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Enums#getStatesMin1Max2 <em>States Min1 Max2</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Enums#getHeavy <em>Heavy</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getEnums()
 * @model
 * @generated
 */
public interface Enums extends Type {
	/**
	 * Returns the value of the '<em><b>Enum 01</b></em>' attribute.
	 * The default value is <code>"enum0"</code>.
	 * The literals are from the enumeration {@link fr.obeo.dsl.sample.alldatatypes.AEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum 01</em>' attribute.
	 * @see fr.obeo.dsl.sample.alldatatypes.AEnum
	 * @see #setEnum_01(AEnum)
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getEnums_Enum_01()
	 * @model default="enum0"
	 * @generated
	 */
	AEnum getEnum_01();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.sample.alldatatypes.Enums#getEnum_01 <em>Enum 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum 01</em>' attribute.
	 * @see fr.obeo.dsl.sample.alldatatypes.AEnum
	 * @see #getEnum_01()
	 * @generated
	 */
	void setEnum_01(AEnum value);

	/**
	 * Returns the value of the '<em><b>Enum 01 Empty Default</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.obeo.dsl.sample.alldatatypes.AEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum 01 Empty Default</em>' attribute.
	 * @see fr.obeo.dsl.sample.alldatatypes.AEnum
	 * @see #setEnum_01_EmptyDefault(AEnum)
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getEnums_Enum_01_EmptyDefault()
	 * @model
	 * @generated
	 */
	AEnum getEnum_01_EmptyDefault();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.sample.alldatatypes.Enums#getEnum_01_EmptyDefault <em>Enum 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum 01 Empty Default</em>' attribute.
	 * @see fr.obeo.dsl.sample.alldatatypes.AEnum
	 * @see #getEnum_01_EmptyDefault()
	 * @generated
	 */
	void setEnum_01_EmptyDefault(AEnum value);

	/**
	 * Returns the value of the '<em><b>Enum 1</b></em>' attribute.
	 * The default value is <code>"enum0"</code>.
	 * The literals are from the enumeration {@link fr.obeo.dsl.sample.alldatatypes.AEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum 1</em>' attribute.
	 * @see fr.obeo.dsl.sample.alldatatypes.AEnum
	 * @see #setEnum_1(AEnum)
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getEnums_Enum_1()
	 * @model default="enum0"
	 * @generated
	 */
	AEnum getEnum_1();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.sample.alldatatypes.Enums#getEnum_1 <em>Enum 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum 1</em>' attribute.
	 * @see fr.obeo.dsl.sample.alldatatypes.AEnum
	 * @see #getEnum_1()
	 * @generated
	 */
	void setEnum_1(AEnum value);

	/**
	 * Returns the value of the '<em><b>Enums</b></em>' attribute list.
	 * The list contents are of type {@link fr.obeo.dsl.sample.alldatatypes.AEnum}.
	 * The literals are from the enumeration {@link fr.obeo.dsl.sample.alldatatypes.AEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enums</em>' attribute list.
	 * @see fr.obeo.dsl.sample.alldatatypes.AEnum
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getEnums_Enums()
	 * @model default="enum0"
	 * @generated
	 */
	EList<AEnum> getEnums();

	/**
	 * Returns the value of the '<em><b>Not Editable Enum 01</b></em>' attribute.
	 * The default value is <code>"enum0"</code>.
	 * The literals are from the enumeration {@link fr.obeo.dsl.sample.alldatatypes.AEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Editable Enum 01</em>' attribute.
	 * @see fr.obeo.dsl.sample.alldatatypes.AEnum
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getEnums_NotEditableEnum_01()
	 * @model default="enum0" changeable="false"
	 * @generated
	 */
	AEnum getNotEditableEnum_01();

	/**
	 * Returns the value of the '<em><b>States</b></em>' attribute list.
	 * The list contents are of type {@link fr.obeo.dsl.sample.alldatatypes.StateWithoutDefault}.
	 * The literals are from the enumeration {@link fr.obeo.dsl.sample.alldatatypes.StateWithoutDefault}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' attribute list.
	 * @see fr.obeo.dsl.sample.alldatatypes.StateWithoutDefault
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getEnums_States()
	 * @model
	 * @generated
	 */
	EList<StateWithoutDefault> getStates();

	/**
	 * Returns the value of the '<em><b>States Max2</b></em>' attribute list.
	 * The list contents are of type {@link fr.obeo.dsl.sample.alldatatypes.StateWithoutDefault}.
	 * The literals are from the enumeration {@link fr.obeo.dsl.sample.alldatatypes.StateWithoutDefault}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States Max2</em>' attribute list.
	 * @see fr.obeo.dsl.sample.alldatatypes.StateWithoutDefault
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getEnums_StatesMax2()
	 * @model upper="2"
	 * @generated
	 */
	EList<StateWithoutDefault> getStatesMax2();

	/**
	 * Returns the value of the '<em><b>States Min1 Max2</b></em>' attribute list.
	 * The list contents are of type {@link fr.obeo.dsl.sample.alldatatypes.StateWithoutDefault}.
	 * The literals are from the enumeration {@link fr.obeo.dsl.sample.alldatatypes.StateWithoutDefault}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States Min1 Max2</em>' attribute list.
	 * @see fr.obeo.dsl.sample.alldatatypes.StateWithoutDefault
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getEnums_StatesMin1Max2()
	 * @model default="move" required="true" upper="2"
	 * @generated
	 */
	EList<StateWithoutDefault> getStatesMin1Max2();

	/**
	 * Returns the value of the '<em><b>Heavy</b></em>' attribute list.
	 * The list contents are of type {@link fr.obeo.dsl.sample.alldatatypes.Heavy}.
	 * The literals are from the enumeration {@link fr.obeo.dsl.sample.alldatatypes.Heavy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heavy</em>' attribute list.
	 * @see fr.obeo.dsl.sample.alldatatypes.Heavy
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getEnums_Heavy()
	 * @model
	 * @generated
	 */
	EList<Heavy> getHeavy();

} // Enums
