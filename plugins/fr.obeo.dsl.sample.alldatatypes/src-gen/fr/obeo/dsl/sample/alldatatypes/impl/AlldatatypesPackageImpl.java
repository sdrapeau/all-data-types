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
package fr.obeo.dsl.sample.alldatatypes.impl;

import fr.obeo.dsl.sample.alldatatypes.AEnum;
import fr.obeo.dsl.sample.alldatatypes.AlldatatypesFactory;
import fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage;
import fr.obeo.dsl.sample.alldatatypes.BigDecimals;
import fr.obeo.dsl.sample.alldatatypes.BigIntegers;
import fr.obeo.dsl.sample.alldatatypes.Booleans;
import fr.obeo.dsl.sample.alldatatypes.Dates;
import fr.obeo.dsl.sample.alldatatypes.Doubles;
import fr.obeo.dsl.sample.alldatatypes.Element;
import fr.obeo.dsl.sample.alldatatypes.Enums;
import fr.obeo.dsl.sample.alldatatypes.Floats;
import fr.obeo.dsl.sample.alldatatypes.Heavy;
import fr.obeo.dsl.sample.alldatatypes.Integers;
import fr.obeo.dsl.sample.alldatatypes.Longs;
import fr.obeo.dsl.sample.alldatatypes.Root;
import fr.obeo.dsl.sample.alldatatypes.Shorts;
import fr.obeo.dsl.sample.alldatatypes.StateWithoutDefault;
import fr.obeo.dsl.sample.alldatatypes.Strings;
import fr.obeo.dsl.sample.alldatatypes.Type;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlldatatypesPackageImpl extends EPackageImpl implements AlldatatypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleansEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doublesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bigIntegersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bigDecimalsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateWithoutDefaultEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum heavyEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AlldatatypesPackageImpl() {
		super(eNS_URI, AlldatatypesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AlldatatypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AlldatatypesPackage init() {
		if (isInited) return (AlldatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(AlldatatypesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAlldatatypesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AlldatatypesPackageImpl theAlldatatypesPackage = registeredAlldatatypesPackage instanceof AlldatatypesPackageImpl ? (AlldatatypesPackageImpl)registeredAlldatatypesPackage : new AlldatatypesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAlldatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theAlldatatypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAlldatatypesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AlldatatypesPackage.eNS_URI, theAlldatatypesPackage);
		return theAlldatatypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Id() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Name() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Types() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoot__GetAllTypes() {
		return rootEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrings() {
		return stringsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrings_Text_01_EmptyDefault() {
		return (EAttribute)stringsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrings_Text_01() {
		return (EAttribute)stringsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrings_Text_1() {
		return (EAttribute)stringsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrings_Textarea() {
		return (EAttribute)stringsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrings_Link_01() {
		return (EAttribute)stringsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrings_Html_01() {
		return (EAttribute)stringsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrings_NotEditableText_01() {
		return (EAttribute)stringsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDates() {
		return datesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDates_DateEmptyDefault_01() {
		return (EAttribute)datesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDates_Date_01() {
		return (EAttribute)datesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDates_Date_1() {
		return (EAttribute)datesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDates_Date_01_HM() {
		return (EAttribute)datesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDates_Date_01_HMS() {
		return (EAttribute)datesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDates_Date_01_HMSms() {
		return (EAttribute)datesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDates_NotEditableDate_01() {
		return (EAttribute)datesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDates_Dates() {
		return (EAttribute)datesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnums() {
		return enumsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnums_Enum_01() {
		return (EAttribute)enumsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnums_Enum_01_EmptyDefault() {
		return (EAttribute)enumsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnums_Enum_1() {
		return (EAttribute)enumsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnums_Enums() {
		return (EAttribute)enumsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnums_NotEditableEnum_01() {
		return (EAttribute)enumsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnums_States() {
		return (EAttribute)enumsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnums_StatesMax2() {
		return (EAttribute)enumsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnums_StatesMin1Max2() {
		return (EAttribute)enumsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnums_Heavy() {
		return (EAttribute)enumsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleans() {
		return booleansEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleans_Boolean_01() {
		return (EAttribute)booleansEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleans_Boolean_01_EmptyDefault() {
		return (EAttribute)booleansEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleans_Boolean_1() {
		return (EAttribute)booleansEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleans_NotEditableBoolean_01() {
		return (EAttribute)booleansEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegers() {
		return integersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegers_Int_01() {
		return (EAttribute)integersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegers_Int_1() {
		return (EAttribute)integersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegers_Int_01_EmptyDefault() {
		return (EAttribute)integersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegers_NotEditableInt_01() {
		return (EAttribute)integersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegers_Ints() {
		return (EAttribute)integersEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegers_HiddenInt_01() {
		return (EAttribute)integersEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLongs() {
		return longsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongs_Long_01() {
		return (EAttribute)longsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongs_Long_1() {
		return (EAttribute)longsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongs_Long_01_EmptyDefault() {
		return (EAttribute)longsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLongs_NotEditableLong_01() {
		return (EAttribute)longsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShorts() {
		return shortsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShorts_Short_01() {
		return (EAttribute)shortsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShorts_Short_1() {
		return (EAttribute)shortsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShorts_Short_01_EmptyDefault() {
		return (EAttribute)shortsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShorts_NotEditableShort_01() {
		return (EAttribute)shortsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubles() {
		return doublesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubles_Double_01() {
		return (EAttribute)doublesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubles_Double_1() {
		return (EAttribute)doublesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubles_Double_01_EmptyDefault() {
		return (EAttribute)doublesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubles_NotEditableDouble_01() {
		return (EAttribute)doublesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloats() {
		return floatsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloats_Float_01() {
		return (EAttribute)floatsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloats_Float_1() {
		return (EAttribute)floatsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloats_Float_01_EmptyDefault() {
		return (EAttribute)floatsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloats_NotEditableFloat_01() {
		return (EAttribute)floatsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBigIntegers() {
		return bigIntegersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBigIntegers_BigInt_01() {
		return (EAttribute)bigIntegersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBigIntegers_BigInt_1() {
		return (EAttribute)bigIntegersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBigIntegers_BigInt_01_EmptyDefault() {
		return (EAttribute)bigIntegersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBigIntegers_NotEditableBigInt_01() {
		return (EAttribute)bigIntegersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBigIntegers_BigInts() {
		return (EAttribute)bigIntegersEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBigDecimals() {
		return bigDecimalsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBigDecimals_BigDecimal_01() {
		return (EAttribute)bigDecimalsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBigDecimals_BigDecimal_1() {
		return (EAttribute)bigDecimalsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBigDecimals_BigDecimal_01_EmptyDefault() {
		return (EAttribute)bigDecimalsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBigDecimals_NotEditableBigDecimal_01() {
		return (EAttribute)bigDecimalsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBigDecimals_BigDecimals() {
		return (EAttribute)bigDecimalsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAEnum() {
		return aEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStateWithoutDefault() {
		return stateWithoutDefaultEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHeavy() {
		return heavyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlldatatypesFactory getAlldatatypesFactory() {
		return (AlldatatypesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__ID);
		createEAttribute(elementEClass, ELEMENT__NAME);

		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__TYPES);
		createEOperation(rootEClass, ROOT___GET_ALL_TYPES);

		typeEClass = createEClass(TYPE);

		stringsEClass = createEClass(STRINGS);
		createEAttribute(stringsEClass, STRINGS__TEXT_01_EMPTY_DEFAULT);
		createEAttribute(stringsEClass, STRINGS__TEXT_01);
		createEAttribute(stringsEClass, STRINGS__TEXT_1);
		createEAttribute(stringsEClass, STRINGS__TEXTAREA);
		createEAttribute(stringsEClass, STRINGS__LINK_01);
		createEAttribute(stringsEClass, STRINGS__HTML_01);
		createEAttribute(stringsEClass, STRINGS__NOT_EDITABLE_TEXT_01);

		datesEClass = createEClass(DATES);
		createEAttribute(datesEClass, DATES__DATE_EMPTY_DEFAULT_01);
		createEAttribute(datesEClass, DATES__DATE_01);
		createEAttribute(datesEClass, DATES__DATE_1);
		createEAttribute(datesEClass, DATES__DATE_01_HM);
		createEAttribute(datesEClass, DATES__DATE_01_HMS);
		createEAttribute(datesEClass, DATES__DATE_01_HM_SMS);
		createEAttribute(datesEClass, DATES__NOT_EDITABLE_DATE_01);
		createEAttribute(datesEClass, DATES__DATES);

		enumsEClass = createEClass(ENUMS);
		createEAttribute(enumsEClass, ENUMS__ENUM_01);
		createEAttribute(enumsEClass, ENUMS__ENUM_01_EMPTY_DEFAULT);
		createEAttribute(enumsEClass, ENUMS__ENUM_1);
		createEAttribute(enumsEClass, ENUMS__ENUMS);
		createEAttribute(enumsEClass, ENUMS__NOT_EDITABLE_ENUM_01);
		createEAttribute(enumsEClass, ENUMS__STATES);
		createEAttribute(enumsEClass, ENUMS__STATES_MAX2);
		createEAttribute(enumsEClass, ENUMS__STATES_MIN1_MAX2);
		createEAttribute(enumsEClass, ENUMS__HEAVY);

		booleansEClass = createEClass(BOOLEANS);
		createEAttribute(booleansEClass, BOOLEANS__BOOLEAN_01);
		createEAttribute(booleansEClass, BOOLEANS__BOOLEAN_01_EMPTY_DEFAULT);
		createEAttribute(booleansEClass, BOOLEANS__BOOLEAN_1);
		createEAttribute(booleansEClass, BOOLEANS__NOT_EDITABLE_BOOLEAN_01);

		integersEClass = createEClass(INTEGERS);
		createEAttribute(integersEClass, INTEGERS__INT_01);
		createEAttribute(integersEClass, INTEGERS__INT_1);
		createEAttribute(integersEClass, INTEGERS__INT_01_EMPTY_DEFAULT);
		createEAttribute(integersEClass, INTEGERS__NOT_EDITABLE_INT_01);
		createEAttribute(integersEClass, INTEGERS__INTS);
		createEAttribute(integersEClass, INTEGERS__HIDDEN_INT_01);

		longsEClass = createEClass(LONGS);
		createEAttribute(longsEClass, LONGS__LONG_01);
		createEAttribute(longsEClass, LONGS__LONG_1);
		createEAttribute(longsEClass, LONGS__LONG_01_EMPTY_DEFAULT);
		createEAttribute(longsEClass, LONGS__NOT_EDITABLE_LONG_01);

		shortsEClass = createEClass(SHORTS);
		createEAttribute(shortsEClass, SHORTS__SHORT_01);
		createEAttribute(shortsEClass, SHORTS__SHORT_1);
		createEAttribute(shortsEClass, SHORTS__SHORT_01_EMPTY_DEFAULT);
		createEAttribute(shortsEClass, SHORTS__NOT_EDITABLE_SHORT_01);

		doublesEClass = createEClass(DOUBLES);
		createEAttribute(doublesEClass, DOUBLES__DOUBLE_01);
		createEAttribute(doublesEClass, DOUBLES__DOUBLE_1);
		createEAttribute(doublesEClass, DOUBLES__DOUBLE_01_EMPTY_DEFAULT);
		createEAttribute(doublesEClass, DOUBLES__NOT_EDITABLE_DOUBLE_01);

		floatsEClass = createEClass(FLOATS);
		createEAttribute(floatsEClass, FLOATS__FLOAT_01);
		createEAttribute(floatsEClass, FLOATS__FLOAT_1);
		createEAttribute(floatsEClass, FLOATS__FLOAT_01_EMPTY_DEFAULT);
		createEAttribute(floatsEClass, FLOATS__NOT_EDITABLE_FLOAT_01);

		bigIntegersEClass = createEClass(BIG_INTEGERS);
		createEAttribute(bigIntegersEClass, BIG_INTEGERS__BIG_INT_01);
		createEAttribute(bigIntegersEClass, BIG_INTEGERS__BIG_INT_1);
		createEAttribute(bigIntegersEClass, BIG_INTEGERS__BIG_INT_01_EMPTY_DEFAULT);
		createEAttribute(bigIntegersEClass, BIG_INTEGERS__NOT_EDITABLE_BIG_INT_01);
		createEAttribute(bigIntegersEClass, BIG_INTEGERS__BIG_INTS);

		bigDecimalsEClass = createEClass(BIG_DECIMALS);
		createEAttribute(bigDecimalsEClass, BIG_DECIMALS__BIG_DECIMAL_01);
		createEAttribute(bigDecimalsEClass, BIG_DECIMALS__BIG_DECIMAL_1);
		createEAttribute(bigDecimalsEClass, BIG_DECIMALS__BIG_DECIMAL_01_EMPTY_DEFAULT);
		createEAttribute(bigDecimalsEClass, BIG_DECIMALS__NOT_EDITABLE_BIG_DECIMAL_01);
		createEAttribute(bigDecimalsEClass, BIG_DECIMALS__BIG_DECIMALS);

		// Create enums
		aEnumEEnum = createEEnum(AENUM);
		stateWithoutDefaultEEnum = createEEnum(STATE_WITHOUT_DEFAULT);
		heavyEEnum = createEEnum(HEAVY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rootEClass.getESuperTypes().add(this.getElement());
		typeEClass.getESuperTypes().add(this.getElement());
		stringsEClass.getESuperTypes().add(this.getType());
		datesEClass.getESuperTypes().add(this.getType());
		enumsEClass.getESuperTypes().add(this.getType());
		booleansEClass.getESuperTypes().add(this.getType());
		integersEClass.getESuperTypes().add(this.getType());
		longsEClass.getESuperTypes().add(this.getType());
		shortsEClass.getESuperTypes().add(this.getType());
		doublesEClass.getESuperTypes().add(this.getType());
		floatsEClass.getESuperTypes().add(this.getType());
		bigIntegersEClass.getESuperTypes().add(this.getType());
		bigDecimalsEClass.getESuperTypes().add(this.getType());

		// Initialize classes, features, and operations; add parameters
		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Types(), this.getType(), null, "types", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRoot__GetAllTypes(), this.getType(), "getAllTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringsEClass, Strings.class, "Strings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStrings_Text_01_EmptyDefault(), ecorePackage.getEString(), "text_01_EmptyDefault", null, 0, 1, Strings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrings_Text_01(), ecorePackage.getEString(), "text_01", "SmartEA", 0, 1, Strings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrings_Text_1(), ecorePackage.getEString(), "text_1", "SmartEA", 1, 1, Strings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrings_Textarea(), ecorePackage.getEString(), "textarea", "SmartEA", 0, -1, Strings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrings_Link_01(), ecorePackage.getEString(), "link_01", "http://www.smartea.fr", 0, 1, Strings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrings_Html_01(), ecorePackage.getEString(), "html_01", "<strong>Obeo</strong> SmartEA", 0, 1, Strings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrings_NotEditableText_01(), ecorePackage.getEString(), "notEditableText_01", "SmartEA", 0, 1, Strings.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datesEClass, Dates.class, "Dates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDates_DateEmptyDefault_01(), ecorePackage.getEDate(), "dateEmptyDefault_01", null, 0, 1, Dates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDates_Date_01(), ecorePackage.getEDate(), "date_01", "1987-07-16", 0, 1, Dates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDates_Date_1(), ecorePackage.getEDate(), "date_1", "1987-07-16", 1, 1, Dates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDates_Date_01_HM(), ecorePackage.getEDate(), "date_01_HM", "1987-07-16T12:14", 0, 1, Dates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDates_Date_01_HMS(), ecorePackage.getEDate(), "date_01_HMS", "1987-07-16T12:14:010", 0, 1, Dates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDates_Date_01_HMSms(), ecorePackage.getEDate(), "date_01_HMSms", "1987-07-16T12:14:010+0010", 0, 1, Dates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDates_NotEditableDate_01(), ecorePackage.getEDate(), "notEditableDate_01", "1987-07-16", 0, 1, Dates.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDates_Dates(), ecorePackage.getEDate(), "dates", "1987-07-16", 0, -1, Dates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumsEClass, Enums.class, "Enums", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnums_Enum_01(), this.getAEnum(), "enum_01", "enum0", 0, 1, Enums.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnums_Enum_01_EmptyDefault(), this.getAEnum(), "enum_01_EmptyDefault", null, 0, 1, Enums.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnums_Enum_1(), this.getAEnum(), "enum_1", "enum0", 0, 1, Enums.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnums_Enums(), this.getAEnum(), "enums", "enum0", 0, -1, Enums.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnums_NotEditableEnum_01(), this.getAEnum(), "notEditableEnum_01", "enum0", 0, 1, Enums.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnums_States(), this.getStateWithoutDefault(), "states", null, 0, -1, Enums.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnums_StatesMax2(), this.getStateWithoutDefault(), "statesMax2", null, 0, 2, Enums.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnums_StatesMin1Max2(), this.getStateWithoutDefault(), "statesMin1Max2", "move", 1, 2, Enums.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnums_Heavy(), this.getHeavy(), "heavy", null, 0, -1, Enums.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleansEClass, Booleans.class, "Booleans", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleans_Boolean_01(), ecorePackage.getEBoolean(), "boolean_01", "true", 0, 1, Booleans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleans_Boolean_01_EmptyDefault(), ecorePackage.getEBoolean(), "boolean_01_EmptyDefault", null, 0, 1, Booleans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleans_Boolean_1(), ecorePackage.getEBoolean(), "boolean_1", "true", 1, 1, Booleans.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleans_NotEditableBoolean_01(), ecorePackage.getEBoolean(), "notEditableBoolean_01", "true", 0, 1, Booleans.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integersEClass, Integers.class, "Integers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegers_Int_01(), ecorePackage.getEInt(), "int_01", "23", 0, 1, Integers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegers_Int_1(), ecorePackage.getEInt(), "int_1", "23", 1, 1, Integers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegers_Int_01_EmptyDefault(), ecorePackage.getEInt(), "int_01_EmptyDefault", null, 0, 1, Integers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegers_NotEditableInt_01(), ecorePackage.getEInt(), "notEditableInt_01", "23", 0, 1, Integers.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegers_Ints(), ecorePackage.getEInt(), "ints", "23", 0, -1, Integers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegers_HiddenInt_01(), ecorePackage.getEInt(), "hiddenInt_01", "23", 0, 1, Integers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(longsEClass, Longs.class, "Longs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLongs_Long_01(), ecorePackage.getELong(), "long_01", "23", 0, 1, Longs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongs_Long_1(), ecorePackage.getELong(), "long_1", "23", 1, 1, Longs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongs_Long_01_EmptyDefault(), ecorePackage.getELong(), "long_01_EmptyDefault", null, 0, 1, Longs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongs_NotEditableLong_01(), ecorePackage.getELong(), "notEditableLong_01", "23", 0, 1, Longs.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shortsEClass, Shorts.class, "Shorts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShorts_Short_01(), ecorePackage.getEShort(), "short_01", "23", 0, 1, Shorts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShorts_Short_1(), ecorePackage.getEShort(), "short_1", "23", 1, 1, Shorts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShorts_Short_01_EmptyDefault(), ecorePackage.getEShort(), "short_01_EmptyDefault", null, 0, 1, Shorts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShorts_NotEditableShort_01(), ecorePackage.getEShort(), "notEditableShort_01", "23", 0, 1, Shorts.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doublesEClass, Doubles.class, "Doubles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoubles_Double_01(), ecorePackage.getEDouble(), "double_01", "12.1", 0, 1, Doubles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubles_Double_1(), ecorePackage.getEDouble(), "double_1", "12.1", 1, 1, Doubles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubles_Double_01_EmptyDefault(), ecorePackage.getEDouble(), "double_01_EmptyDefault", null, 0, 1, Doubles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubles_NotEditableDouble_01(), ecorePackage.getEDouble(), "notEditableDouble_01", "12.1", 0, 1, Doubles.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatsEClass, Floats.class, "Floats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloats_Float_01(), ecorePackage.getEFloat(), "float_01", "12.1", 0, 1, Floats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloats_Float_1(), ecorePackage.getEFloat(), "float_1", "12.1", 1, 1, Floats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloats_Float_01_EmptyDefault(), ecorePackage.getEFloat(), "float_01_EmptyDefault", null, 0, 1, Floats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloats_NotEditableFloat_01(), ecorePackage.getEFloat(), "notEditableFloat_01", "12.1", 0, 1, Floats.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bigIntegersEClass, BigIntegers.class, "BigIntegers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBigIntegers_BigInt_01(), ecorePackage.getEBigInteger(), "bigInt_01", "23", 0, 1, BigIntegers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBigIntegers_BigInt_1(), ecorePackage.getEBigInteger(), "bigInt_1", "23", 1, 1, BigIntegers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBigIntegers_BigInt_01_EmptyDefault(), ecorePackage.getEBigInteger(), "bigInt_01_EmptyDefault", null, 0, 1, BigIntegers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBigIntegers_NotEditableBigInt_01(), ecorePackage.getEBigInteger(), "notEditableBigInt_01", "23", 0, 1, BigIntegers.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBigIntegers_BigInts(), ecorePackage.getEBigInteger(), "bigInts", "23", 0, -1, BigIntegers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bigDecimalsEClass, BigDecimals.class, "BigDecimals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBigDecimals_BigDecimal_01(), ecorePackage.getEBigDecimal(), "bigDecimal_01", "23", 0, 1, BigDecimals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBigDecimals_BigDecimal_1(), ecorePackage.getEBigDecimal(), "bigDecimal_1", "23", 1, 1, BigDecimals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBigDecimals_BigDecimal_01_EmptyDefault(), ecorePackage.getEBigDecimal(), "bigDecimal_01_EmptyDefault", null, 0, 1, BigDecimals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBigDecimals_NotEditableBigDecimal_01(), ecorePackage.getEBigDecimal(), "notEditableBigDecimal_01", "23", 0, 1, BigDecimals.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBigDecimals_BigDecimals(), ecorePackage.getEBigDecimal(), "bigDecimals", "23", 0, -1, BigDecimals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(aEnumEEnum, AEnum.class, "AEnum");
		addEEnumLiteral(aEnumEEnum, AEnum.ENUM0);
		addEEnumLiteral(aEnumEEnum, AEnum.ENUM1);

		initEEnum(stateWithoutDefaultEEnum, StateWithoutDefault.class, "StateWithoutDefault");
		addEEnumLiteral(stateWithoutDefaultEEnum, StateWithoutDefault.OPEN);
		addEEnumLiteral(stateWithoutDefaultEEnum, StateWithoutDefault.MOVE);
		addEEnumLiteral(stateWithoutDefaultEEnum, StateWithoutDefault.CLOSE);
		addEEnumLiteral(stateWithoutDefaultEEnum, StateWithoutDefault.MOVING);
		addEEnumLiteral(stateWithoutDefaultEEnum, StateWithoutDefault.DELETE);

		initEEnum(heavyEEnum, Heavy.class, "Heavy");
		addEEnumLiteral(heavyEEnum, Heavy.OPEN);
		addEEnumLiteral(heavyEEnum, Heavy.MOVE);
		addEEnumLiteral(heavyEEnum, Heavy.CLOSE);
		addEEnumLiteral(heavyEEnum, Heavy.MOVING);
		addEEnumLiteral(heavyEEnum, Heavy.DELETE);
		addEEnumLiteral(heavyEEnum, Heavy.OPEN1);
		addEEnumLiteral(heavyEEnum, Heavy.MOVE1);
		addEEnumLiteral(heavyEEnum, Heavy.CLOS1E);
		addEEnumLiteral(heavyEEnum, Heavy.MOVING1);
		addEEnumLiteral(heavyEEnum, Heavy.DELETE1);
		addEEnumLiteral(heavyEEnum, Heavy.OPEN2);
		addEEnumLiteral(heavyEEnum, Heavy.MOVE2);
		addEEnumLiteral(heavyEEnum, Heavy.CLOSE2);
		addEEnumLiteral(heavyEEnum, Heavy.MOVING2);
		addEEnumLiteral(heavyEEnum, Heavy.DELETE2);
		addEEnumLiteral(heavyEEnum, Heavy.OPEN3);
		addEEnumLiteral(heavyEEnum, Heavy.MOVE3);
		addEEnumLiteral(heavyEEnum, Heavy.CLOSE3);
		addEEnumLiteral(heavyEEnum, Heavy.MOVING3);
		addEEnumLiteral(heavyEEnum, Heavy.DELETE3);
		addEEnumLiteral(heavyEEnum, Heavy.OPEN4);
		addEEnumLiteral(heavyEEnum, Heavy.MOVE4);
		addEEnumLiteral(heavyEEnum, Heavy.CLOSE4);
		addEEnumLiteral(heavyEEnum, Heavy.MOVING4);
		addEEnumLiteral(heavyEEnum, Heavy.DELETE4);

		// Create resource
		createResource(eNS_URI);
	}

} //AlldatatypesPackageImpl
