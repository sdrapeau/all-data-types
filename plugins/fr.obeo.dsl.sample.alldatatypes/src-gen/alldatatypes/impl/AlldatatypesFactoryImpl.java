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
package alldatatypes.impl;

import alldatatypes.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlldatatypesFactoryImpl extends EFactoryImpl implements AlldatatypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AlldatatypesFactory init() {
		try {
			AlldatatypesFactory theAlldatatypesFactory = (AlldatatypesFactory)EPackage.Registry.INSTANCE.getEFactory(AlldatatypesPackage.eNS_URI);
			if (theAlldatatypesFactory != null) {
				return theAlldatatypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AlldatatypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlldatatypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AlldatatypesPackage.ROOT: return createRoot();
			case AlldatatypesPackage.STRINGS: return createStrings();
			case AlldatatypesPackage.DATES: return createDates();
			case AlldatatypesPackage.ENUMS: return createEnums();
			case AlldatatypesPackage.BOOLEANS: return createBooleans();
			case AlldatatypesPackage.INTEGERS: return createIntegers();
			case AlldatatypesPackage.LONGS: return createLongs();
			case AlldatatypesPackage.SHORTS: return createShorts();
			case AlldatatypesPackage.DOUBLES: return createDoubles();
			case AlldatatypesPackage.FLOATS: return createFloats();
			case AlldatatypesPackage.BIG_INTEGERS: return createBigIntegers();
			case AlldatatypesPackage.BIG_DECIMALS: return createBigDecimals();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AlldatatypesPackage.AENUM:
				return createAEnumFromString(eDataType, initialValue);
			case AlldatatypesPackage.STATE_WITHOUT_DEFAULT:
				return createStateWithoutDefaultFromString(eDataType, initialValue);
			case AlldatatypesPackage.HEAVY:
				return createHeavyFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AlldatatypesPackage.AENUM:
				return convertAEnumToString(eDataType, instanceValue);
			case AlldatatypesPackage.STATE_WITHOUT_DEFAULT:
				return convertStateWithoutDefaultToString(eDataType, instanceValue);
			case AlldatatypesPackage.HEAVY:
				return convertHeavyToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strings createStrings() {
		StringsImpl strings = new StringsImpl();
		return strings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dates createDates() {
		DatesImpl dates = new DatesImpl();
		return dates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enums createEnums() {
		EnumsImpl enums = new EnumsImpl();
		return enums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booleans createBooleans() {
		BooleansImpl booleans = new BooleansImpl();
		return booleans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integers createIntegers() {
		IntegersImpl integers = new IntegersImpl();
		return integers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Longs createLongs() {
		LongsImpl longs = new LongsImpl();
		return longs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shorts createShorts() {
		ShortsImpl shorts = new ShortsImpl();
		return shorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Doubles createDoubles() {
		DoublesImpl doubles = new DoublesImpl();
		return doubles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Floats createFloats() {
		FloatsImpl floats = new FloatsImpl();
		return floats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigIntegers createBigIntegers() {
		BigIntegersImpl bigIntegers = new BigIntegersImpl();
		return bigIntegers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimals createBigDecimals() {
		BigDecimalsImpl bigDecimals = new BigDecimalsImpl();
		return bigDecimals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AEnum createAEnumFromString(EDataType eDataType, String initialValue) {
		AEnum result = AEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateWithoutDefault createStateWithoutDefaultFromString(EDataType eDataType, String initialValue) {
		StateWithoutDefault result = StateWithoutDefault.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateWithoutDefaultToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Heavy createHeavyFromString(EDataType eDataType, String initialValue) {
		Heavy result = Heavy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHeavyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlldatatypesPackage getAlldatatypesPackage() {
		return (AlldatatypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AlldatatypesPackage getPackage() {
		return AlldatatypesPackage.eINSTANCE;
	}

} //AlldatatypesFactoryImpl
