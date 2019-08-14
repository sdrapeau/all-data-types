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
package fr.obeo.dsl.sample.alldatatypes.util;

import fr.obeo.dsl.sample.alldatatypes.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage
 * @generated
 */
public class AlldatatypesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AlldatatypesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlldatatypesSwitch() {
		if (modelPackage == null) {
			modelPackage = AlldatatypesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AlldatatypesPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlldatatypesPackage.ROOT: {
				Root root = (Root)theEObject;
				T result = caseRoot(root);
				if (result == null) result = caseElement(root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlldatatypesPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseElement(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlldatatypesPackage.STRINGS: {
				Strings strings = (Strings)theEObject;
				T result = caseStrings(strings);
				if (result == null) result = caseType(strings);
				if (result == null) result = caseElement(strings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlldatatypesPackage.DATES: {
				Dates dates = (Dates)theEObject;
				T result = caseDates(dates);
				if (result == null) result = caseType(dates);
				if (result == null) result = caseElement(dates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlldatatypesPackage.ENUMS: {
				Enums enums = (Enums)theEObject;
				T result = caseEnums(enums);
				if (result == null) result = caseType(enums);
				if (result == null) result = caseElement(enums);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlldatatypesPackage.BOOLEANS: {
				Booleans booleans = (Booleans)theEObject;
				T result = caseBooleans(booleans);
				if (result == null) result = caseType(booleans);
				if (result == null) result = caseElement(booleans);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlldatatypesPackage.INTEGERS: {
				Integers integers = (Integers)theEObject;
				T result = caseIntegers(integers);
				if (result == null) result = caseType(integers);
				if (result == null) result = caseElement(integers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlldatatypesPackage.LONGS: {
				Longs longs = (Longs)theEObject;
				T result = caseLongs(longs);
				if (result == null) result = caseType(longs);
				if (result == null) result = caseElement(longs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlldatatypesPackage.SHORTS: {
				Shorts shorts = (Shorts)theEObject;
				T result = caseShorts(shorts);
				if (result == null) result = caseType(shorts);
				if (result == null) result = caseElement(shorts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlldatatypesPackage.DOUBLES: {
				Doubles doubles = (Doubles)theEObject;
				T result = caseDoubles(doubles);
				if (result == null) result = caseType(doubles);
				if (result == null) result = caseElement(doubles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlldatatypesPackage.FLOATS: {
				Floats floats = (Floats)theEObject;
				T result = caseFloats(floats);
				if (result == null) result = caseType(floats);
				if (result == null) result = caseElement(floats);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlldatatypesPackage.BIG_INTEGERS: {
				BigIntegers bigIntegers = (BigIntegers)theEObject;
				T result = caseBigIntegers(bigIntegers);
				if (result == null) result = caseType(bigIntegers);
				if (result == null) result = caseElement(bigIntegers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlldatatypesPackage.BIG_DECIMALS: {
				BigDecimals bigDecimals = (BigDecimals)theEObject;
				T result = caseBigDecimals(bigDecimals);
				if (result == null) result = caseType(bigDecimals);
				if (result == null) result = caseElement(bigDecimals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoot(Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrings(Strings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDates(Dates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enums</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enums</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnums(Enums object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booleans</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booleans</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleans(Booleans object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegers(Integers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Longs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Longs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongs(Longs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shorts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shorts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShorts(Shorts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Doubles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doubles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubles(Doubles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floats</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floats</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloats(Floats object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Big Integers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Big Integers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBigIntegers(BigIntegers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Big Decimals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Big Decimals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBigDecimals(BigDecimals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AlldatatypesSwitch
