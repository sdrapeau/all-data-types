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

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Big Decimals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alldatatypes.BigDecimals#getBigDecimal_01 <em>Big Decimal 01</em>}</li>
 *   <li>{@link alldatatypes.BigDecimals#getBigDecimal_1 <em>Big Decimal 1</em>}</li>
 *   <li>{@link alldatatypes.BigDecimals#getBigDecimal_01_EmptyDefault <em>Big Decimal 01 Empty Default</em>}</li>
 *   <li>{@link alldatatypes.BigDecimals#getNotEditableBigDecimal_01 <em>Not Editable Big Decimal 01</em>}</li>
 *   <li>{@link alldatatypes.BigDecimals#getBigDecimals <em>Big Decimals</em>}</li>
 * </ul>
 *
 * @see alldatatypes.AlldatatypesPackage#getBigDecimals()
 * @model
 * @generated
 */
public interface BigDecimals extends Type {
	/**
	 * Returns the value of the '<em><b>Big Decimal 01</b></em>' attribute.
	 * The default value is <code>"23"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Big Decimal 01</em>' attribute.
	 * @see #setBigDecimal_01(BigDecimal)
	 * @see alldatatypes.AlldatatypesPackage#getBigDecimals_BigDecimal_01()
	 * @model default="23"
	 * @generated
	 */
	BigDecimal getBigDecimal_01();

	/**
	 * Sets the value of the '{@link alldatatypes.BigDecimals#getBigDecimal_01 <em>Big Decimal 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Big Decimal 01</em>' attribute.
	 * @see #getBigDecimal_01()
	 * @generated
	 */
	void setBigDecimal_01(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Big Decimal 1</b></em>' attribute.
	 * The default value is <code>"23"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Big Decimal 1</em>' attribute.
	 * @see #setBigDecimal_1(BigDecimal)
	 * @see alldatatypes.AlldatatypesPackage#getBigDecimals_BigDecimal_1()
	 * @model default="23" required="true"
	 * @generated
	 */
	BigDecimal getBigDecimal_1();

	/**
	 * Sets the value of the '{@link alldatatypes.BigDecimals#getBigDecimal_1 <em>Big Decimal 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Big Decimal 1</em>' attribute.
	 * @see #getBigDecimal_1()
	 * @generated
	 */
	void setBigDecimal_1(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Big Decimal 01 Empty Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Big Decimal 01 Empty Default</em>' attribute.
	 * @see #setBigDecimal_01_EmptyDefault(BigDecimal)
	 * @see alldatatypes.AlldatatypesPackage#getBigDecimals_BigDecimal_01_EmptyDefault()
	 * @model
	 * @generated
	 */
	BigDecimal getBigDecimal_01_EmptyDefault();

	/**
	 * Sets the value of the '{@link alldatatypes.BigDecimals#getBigDecimal_01_EmptyDefault <em>Big Decimal 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Big Decimal 01 Empty Default</em>' attribute.
	 * @see #getBigDecimal_01_EmptyDefault()
	 * @generated
	 */
	void setBigDecimal_01_EmptyDefault(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Not Editable Big Decimal 01</b></em>' attribute.
	 * The default value is <code>"23"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Editable Big Decimal 01</em>' attribute.
	 * @see alldatatypes.AlldatatypesPackage#getBigDecimals_NotEditableBigDecimal_01()
	 * @model default="23" changeable="false"
	 * @generated
	 */
	BigDecimal getNotEditableBigDecimal_01();

	/**
	 * Returns the value of the '<em><b>Big Decimals</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigDecimal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Big Decimals</em>' attribute list.
	 * @see alldatatypes.AlldatatypesPackage#getBigDecimals_BigDecimals()
	 * @model default="23"
	 * @generated
	 */
	EList<BigDecimal> getBigDecimals();

} // BigDecimals
