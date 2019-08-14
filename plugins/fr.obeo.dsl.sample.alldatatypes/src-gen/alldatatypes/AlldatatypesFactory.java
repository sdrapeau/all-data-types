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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see alldatatypes.AlldatatypesPackage
 * @generated
 */
public interface AlldatatypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlldatatypesFactory eINSTANCE = alldatatypes.impl.AlldatatypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	Root createRoot();

	/**
	 * Returns a new object of class '<em>Strings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strings</em>'.
	 * @generated
	 */
	Strings createStrings();

	/**
	 * Returns a new object of class '<em>Dates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dates</em>'.
	 * @generated
	 */
	Dates createDates();

	/**
	 * Returns a new object of class '<em>Enums</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enums</em>'.
	 * @generated
	 */
	Enums createEnums();

	/**
	 * Returns a new object of class '<em>Booleans</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booleans</em>'.
	 * @generated
	 */
	Booleans createBooleans();

	/**
	 * Returns a new object of class '<em>Integers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integers</em>'.
	 * @generated
	 */
	Integers createIntegers();

	/**
	 * Returns a new object of class '<em>Longs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Longs</em>'.
	 * @generated
	 */
	Longs createLongs();

	/**
	 * Returns a new object of class '<em>Shorts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shorts</em>'.
	 * @generated
	 */
	Shorts createShorts();

	/**
	 * Returns a new object of class '<em>Doubles</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doubles</em>'.
	 * @generated
	 */
	Doubles createDoubles();

	/**
	 * Returns a new object of class '<em>Floats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Floats</em>'.
	 * @generated
	 */
	Floats createFloats();

	/**
	 * Returns a new object of class '<em>Big Integers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Big Integers</em>'.
	 * @generated
	 */
	BigIntegers createBigIntegers();

	/**
	 * Returns a new object of class '<em>Big Decimals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Big Decimals</em>'.
	 * @generated
	 */
	BigDecimals createBigDecimals();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AlldatatypesPackage getAlldatatypesPackage();

} //AlldatatypesFactory
