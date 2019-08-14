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

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Big Integers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alldatatypes.BigIntegers#getBigInt_01 <em>Big Int 01</em>}</li>
 *   <li>{@link alldatatypes.BigIntegers#getBigInt_1 <em>Big Int 1</em>}</li>
 *   <li>{@link alldatatypes.BigIntegers#getBigInt_01_EmptyDefault <em>Big Int 01 Empty Default</em>}</li>
 *   <li>{@link alldatatypes.BigIntegers#getNotEditableBigInt_01 <em>Not Editable Big Int 01</em>}</li>
 *   <li>{@link alldatatypes.BigIntegers#getBigInts <em>Big Ints</em>}</li>
 * </ul>
 *
 * @see alldatatypes.AlldatatypesPackage#getBigIntegers()
 * @model
 * @generated
 */
public interface BigIntegers extends Type {
	/**
	 * Returns the value of the '<em><b>Big Int 01</b></em>' attribute.
	 * The default value is <code>"23"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Big Int 01</em>' attribute.
	 * @see #setBigInt_01(BigInteger)
	 * @see alldatatypes.AlldatatypesPackage#getBigIntegers_BigInt_01()
	 * @model default="23"
	 * @generated
	 */
	BigInteger getBigInt_01();

	/**
	 * Sets the value of the '{@link alldatatypes.BigIntegers#getBigInt_01 <em>Big Int 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Big Int 01</em>' attribute.
	 * @see #getBigInt_01()
	 * @generated
	 */
	void setBigInt_01(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Big Int 1</b></em>' attribute.
	 * The default value is <code>"23"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Big Int 1</em>' attribute.
	 * @see #setBigInt_1(BigInteger)
	 * @see alldatatypes.AlldatatypesPackage#getBigIntegers_BigInt_1()
	 * @model default="23" required="true"
	 * @generated
	 */
	BigInteger getBigInt_1();

	/**
	 * Sets the value of the '{@link alldatatypes.BigIntegers#getBigInt_1 <em>Big Int 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Big Int 1</em>' attribute.
	 * @see #getBigInt_1()
	 * @generated
	 */
	void setBigInt_1(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Big Int 01 Empty Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Big Int 01 Empty Default</em>' attribute.
	 * @see #setBigInt_01_EmptyDefault(BigInteger)
	 * @see alldatatypes.AlldatatypesPackage#getBigIntegers_BigInt_01_EmptyDefault()
	 * @model
	 * @generated
	 */
	BigInteger getBigInt_01_EmptyDefault();

	/**
	 * Sets the value of the '{@link alldatatypes.BigIntegers#getBigInt_01_EmptyDefault <em>Big Int 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Big Int 01 Empty Default</em>' attribute.
	 * @see #getBigInt_01_EmptyDefault()
	 * @generated
	 */
	void setBigInt_01_EmptyDefault(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Not Editable Big Int 01</b></em>' attribute.
	 * The default value is <code>"23"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Editable Big Int 01</em>' attribute.
	 * @see alldatatypes.AlldatatypesPackage#getBigIntegers_NotEditableBigInt_01()
	 * @model default="23" changeable="false"
	 * @generated
	 */
	BigInteger getNotEditableBigInt_01();

	/**
	 * Returns the value of the '<em><b>Big Ints</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigInteger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Big Ints</em>' attribute list.
	 * @see alldatatypes.AlldatatypesPackage#getBigIntegers_BigInts()
	 * @model default="23"
	 * @generated
	 */
	EList<BigInteger> getBigInts();

} // BigIntegers
