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
package alldatatypes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alldatatypes.Integers#getInt_01 <em>Int 01</em>}</li>
 *   <li>{@link alldatatypes.Integers#getInt_1 <em>Int 1</em>}</li>
 *   <li>{@link alldatatypes.Integers#getInt_01_EmptyDefault <em>Int 01 Empty Default</em>}</li>
 *   <li>{@link alldatatypes.Integers#getNotEditableInt_01 <em>Not Editable Int 01</em>}</li>
 *   <li>{@link alldatatypes.Integers#getInts <em>Ints</em>}</li>
 *   <li>{@link alldatatypes.Integers#getHiddenInt_01 <em>Hidden Int 01</em>}</li>
 * </ul>
 *
 * @see alldatatypes.AlldatatypesPackage#getIntegers()
 * @model
 * @generated
 */
public interface Integers extends Type {
	/**
	 * Returns the value of the '<em><b>Int 01</b></em>' attribute.
	 * The default value is <code>"23"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int 01</em>' attribute.
	 * @see #setInt_01(int)
	 * @see alldatatypes.AlldatatypesPackage#getIntegers_Int_01()
	 * @model default="23"
	 * @generated
	 */
	int getInt_01();

	/**
	 * Sets the value of the '{@link alldatatypes.Integers#getInt_01 <em>Int 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int 01</em>' attribute.
	 * @see #getInt_01()
	 * @generated
	 */
	void setInt_01(int value);

	/**
	 * Returns the value of the '<em><b>Int 1</b></em>' attribute.
	 * The default value is <code>"23"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int 1</em>' attribute.
	 * @see #setInt_1(int)
	 * @see alldatatypes.AlldatatypesPackage#getIntegers_Int_1()
	 * @model default="23" required="true"
	 * @generated
	 */
	int getInt_1();

	/**
	 * Sets the value of the '{@link alldatatypes.Integers#getInt_1 <em>Int 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int 1</em>' attribute.
	 * @see #getInt_1()
	 * @generated
	 */
	void setInt_1(int value);

	/**
	 * Returns the value of the '<em><b>Int 01 Empty Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int 01 Empty Default</em>' attribute.
	 * @see #setInt_01_EmptyDefault(int)
	 * @see alldatatypes.AlldatatypesPackage#getIntegers_Int_01_EmptyDefault()
	 * @model
	 * @generated
	 */
	int getInt_01_EmptyDefault();

	/**
	 * Sets the value of the '{@link alldatatypes.Integers#getInt_01_EmptyDefault <em>Int 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int 01 Empty Default</em>' attribute.
	 * @see #getInt_01_EmptyDefault()
	 * @generated
	 */
	void setInt_01_EmptyDefault(int value);

	/**
	 * Returns the value of the '<em><b>Not Editable Int 01</b></em>' attribute.
	 * The default value is <code>"23"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Editable Int 01</em>' attribute.
	 * @see alldatatypes.AlldatatypesPackage#getIntegers_NotEditableInt_01()
	 * @model default="23" changeable="false"
	 * @generated
	 */
	int getNotEditableInt_01();

	/**
	 * Returns the value of the '<em><b>Ints</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ints</em>' attribute list.
	 * @see alldatatypes.AlldatatypesPackage#getIntegers_Ints()
	 * @model default="23"
	 * @generated
	 */
	EList<Integer> getInts();

	/**
	 * Returns the value of the '<em><b>Hidden Int 01</b></em>' attribute.
	 * The default value is <code>"23"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden Int 01</em>' attribute.
	 * @see #setHiddenInt_01(int)
	 * @see alldatatypes.AlldatatypesPackage#getIntegers_HiddenInt_01()
	 * @model default="23"
	 * @generated
	 */
	int getHiddenInt_01();

	/**
	 * Sets the value of the '{@link alldatatypes.Integers#getHiddenInt_01 <em>Hidden Int 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hidden Int 01</em>' attribute.
	 * @see #getHiddenInt_01()
	 * @generated
	 */
	void setHiddenInt_01(int value);

} // Integers
