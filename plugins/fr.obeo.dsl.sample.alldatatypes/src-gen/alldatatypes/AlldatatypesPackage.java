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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see alldatatypes.AlldatatypesFactory
 * @model kind="package"
 * @generated
 */
public interface AlldatatypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "alldatatypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://obeo.fr/alldatatypes/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "alldatatypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlldatatypesPackage eINSTANCE = alldatatypes.impl.AlldatatypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link alldatatypes.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alldatatypes.impl.ElementImpl
	 * @see alldatatypes.impl.AlldatatypesPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link alldatatypes.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alldatatypes.impl.RootImpl
	 * @see alldatatypes.impl.AlldatatypesPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__TYPES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT___GET_ALL_TYPES = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link alldatatypes.Type <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alldatatypes.Type
	 * @see alldatatypes.impl.AlldatatypesPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link alldatatypes.impl.StringsImpl <em>Strings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alldatatypes.impl.StringsImpl
	 * @see alldatatypes.impl.AlldatatypesPackageImpl#getStrings()
	 * @generated
	 */
	int STRINGS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Text 01 Empty Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS__TEXT_01_EMPTY_DEFAULT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS__TEXT_01 = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS__TEXT_1 = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Textarea</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS__TEXTAREA = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Link 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS__LINK_01 = TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Html 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS__HTML_01 = TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Not Editable Text 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS__NOT_EDITABLE_TEXT_01 = TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Strings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Strings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRINGS_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link alldatatypes.impl.DatesImpl <em>Dates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alldatatypes.impl.DatesImpl
	 * @see alldatatypes.impl.AlldatatypesPackageImpl#getDates()
	 * @generated
	 */
	int DATES = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Date Empty Default 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES__DATE_EMPTY_DEFAULT_01 = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES__DATE_01 = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES__DATE_1 = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Date 01 HM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES__DATE_01_HM = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Date 01 HMS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES__DATE_01_HMS = TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Date 01 HM Sms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES__DATE_01_HM_SMS = TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Not Editable Date 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES__NOT_EDITABLE_DATE_01 = TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Dates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES__DATES = TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Dates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES_FEATURE_COUNT = TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Dates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATES_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link alldatatypes.impl.EnumsImpl <em>Enums</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alldatatypes.impl.EnumsImpl
	 * @see alldatatypes.impl.AlldatatypesPackageImpl#getEnums()
	 * @generated
	 */
	int ENUMS = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMS__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMS__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Enum 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMS__ENUM_01 = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enum 01 Empty Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMS__ENUM_01_EMPTY_DEFAULT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enum 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMS__ENUM_1 = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enums</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMS__ENUMS = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Not Editable Enum 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMS__NOT_EDITABLE_ENUM_01 = TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>States</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMS__STATES = TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>States Max2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMS__STATES_MAX2 = TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>States Min1 Max2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMS__STATES_MIN1_MAX2 = TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Heavy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMS__HEAVY = TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Enums</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Enums</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMS_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link alldatatypes.impl.BooleansImpl <em>Booleans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alldatatypes.impl.BooleansImpl
	 * @see alldatatypes.impl.AlldatatypesPackageImpl#getBooleans()
	 * @generated
	 */
	int BOOLEANS = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEANS__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEANS__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Boolean 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEANS__BOOLEAN_01 = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Boolean 01 Empty Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEANS__BOOLEAN_01_EMPTY_DEFAULT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Boolean 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEANS__BOOLEAN_1 = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Not Editable Boolean 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEANS__NOT_EDITABLE_BOOLEAN_01 = TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Booleans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEANS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Booleans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEANS_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link alldatatypes.impl.IntegersImpl <em>Integers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alldatatypes.impl.IntegersImpl
	 * @see alldatatypes.impl.AlldatatypesPackageImpl#getIntegers()
	 * @generated
	 */
	int INTEGERS = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGERS__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGERS__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Int 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGERS__INT_01 = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Int 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGERS__INT_1 = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Int 01 Empty Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGERS__INT_01_EMPTY_DEFAULT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Not Editable Int 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGERS__NOT_EDITABLE_INT_01 = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGERS__INTS = TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hidden Int 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGERS__HIDDEN_INT_01 = TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Integers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGERS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Integers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGERS_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link alldatatypes.impl.LongsImpl <em>Longs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alldatatypes.impl.LongsImpl
	 * @see alldatatypes.impl.AlldatatypesPackageImpl#getLongs()
	 * @generated
	 */
	int LONGS = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONGS__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONGS__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Long 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONGS__LONG_01 = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Long 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONGS__LONG_1 = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Long 01 Empty Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONGS__LONG_01_EMPTY_DEFAULT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Not Editable Long 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONGS__NOT_EDITABLE_LONG_01 = TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Longs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONGS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Longs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONGS_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link alldatatypes.impl.ShortsImpl <em>Shorts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alldatatypes.impl.ShortsImpl
	 * @see alldatatypes.impl.AlldatatypesPackageImpl#getShorts()
	 * @generated
	 */
	int SHORTS = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTS__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTS__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Short 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTS__SHORT_01 = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Short 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTS__SHORT_1 = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Short 01 Empty Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTS__SHORT_01_EMPTY_DEFAULT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Not Editable Short 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTS__NOT_EDITABLE_SHORT_01 = TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Shorts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Shorts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTS_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link alldatatypes.impl.DoublesImpl <em>Doubles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alldatatypes.impl.DoublesImpl
	 * @see alldatatypes.impl.AlldatatypesPackageImpl#getDoubles()
	 * @generated
	 */
	int DOUBLES = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLES__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLES__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Double 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLES__DOUBLE_01 = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Double 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLES__DOUBLE_1 = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Double 01 Empty Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLES__DOUBLE_01_EMPTY_DEFAULT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Not Editable Double 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLES__NOT_EDITABLE_DOUBLE_01 = TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Doubles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLES_FEATURE_COUNT = TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Doubles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLES_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link alldatatypes.impl.FloatsImpl <em>Floats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alldatatypes.impl.FloatsImpl
	 * @see alldatatypes.impl.AlldatatypesPackageImpl#getFloats()
	 * @generated
	 */
	int FLOATS = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATS__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATS__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Float 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATS__FLOAT_01 = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Float 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATS__FLOAT_1 = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Float 01 Empty Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATS__FLOAT_01_EMPTY_DEFAULT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Not Editable Float 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATS__NOT_EDITABLE_FLOAT_01 = TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Floats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Floats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATS_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link alldatatypes.impl.BigIntegersImpl <em>Big Integers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alldatatypes.impl.BigIntegersImpl
	 * @see alldatatypes.impl.AlldatatypesPackageImpl#getBigIntegers()
	 * @generated
	 */
	int BIG_INTEGERS = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_INTEGERS__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_INTEGERS__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Big Int 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_INTEGERS__BIG_INT_01 = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Big Int 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_INTEGERS__BIG_INT_1 = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Big Int 01 Empty Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_INTEGERS__BIG_INT_01_EMPTY_DEFAULT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Not Editable Big Int 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_INTEGERS__NOT_EDITABLE_BIG_INT_01 = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Big Ints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_INTEGERS__BIG_INTS = TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Big Integers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_INTEGERS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Big Integers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_INTEGERS_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link alldatatypes.impl.BigDecimalsImpl <em>Big Decimals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alldatatypes.impl.BigDecimalsImpl
	 * @see alldatatypes.impl.AlldatatypesPackageImpl#getBigDecimals()
	 * @generated
	 */
	int BIG_DECIMALS = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_DECIMALS__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_DECIMALS__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Big Decimal 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_DECIMALS__BIG_DECIMAL_01 = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Big Decimal 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_DECIMALS__BIG_DECIMAL_1 = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Big Decimal 01 Empty Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_DECIMALS__BIG_DECIMAL_01_EMPTY_DEFAULT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Not Editable Big Decimal 01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_DECIMALS__NOT_EDITABLE_BIG_DECIMAL_01 = TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Big Decimals</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_DECIMALS__BIG_DECIMALS = TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Big Decimals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_DECIMALS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Big Decimals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_DECIMALS_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link alldatatypes.AEnum <em>AEnum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alldatatypes.AEnum
	 * @see alldatatypes.impl.AlldatatypesPackageImpl#getAEnum()
	 * @generated
	 */
	int AENUM = 14;

	/**
	 * The meta object id for the '{@link alldatatypes.StateWithoutDefault <em>State Without Default</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alldatatypes.StateWithoutDefault
	 * @see alldatatypes.impl.AlldatatypesPackageImpl#getStateWithoutDefault()
	 * @generated
	 */
	int STATE_WITHOUT_DEFAULT = 15;

	/**
	 * The meta object id for the '{@link alldatatypes.Heavy <em>Heavy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alldatatypes.Heavy
	 * @see alldatatypes.impl.AlldatatypesPackageImpl#getHeavy()
	 * @generated
	 */
	int HEAVY = 16;


	/**
	 * Returns the meta object for class '{@link alldatatypes.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see alldatatypes.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see alldatatypes.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see alldatatypes.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for class '{@link alldatatypes.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see alldatatypes.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link alldatatypes.Root#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see alldatatypes.Root#getTypes()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Types();

	/**
	 * Returns the meta object for the '{@link alldatatypes.Root#getAllTypes() <em>Get All Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Types</em>' operation.
	 * @see alldatatypes.Root#getAllTypes()
	 * @generated
	 */
	EOperation getRoot__GetAllTypes();

	/**
	 * Returns the meta object for class '{@link alldatatypes.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see alldatatypes.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link alldatatypes.Strings <em>Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strings</em>'.
	 * @see alldatatypes.Strings
	 * @generated
	 */
	EClass getStrings();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Strings#getText_01_EmptyDefault <em>Text 01 Empty Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text 01 Empty Default</em>'.
	 * @see alldatatypes.Strings#getText_01_EmptyDefault()
	 * @see #getStrings()
	 * @generated
	 */
	EAttribute getStrings_Text_01_EmptyDefault();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Strings#getText_01 <em>Text 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text 01</em>'.
	 * @see alldatatypes.Strings#getText_01()
	 * @see #getStrings()
	 * @generated
	 */
	EAttribute getStrings_Text_01();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Strings#getText_1 <em>Text 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text 1</em>'.
	 * @see alldatatypes.Strings#getText_1()
	 * @see #getStrings()
	 * @generated
	 */
	EAttribute getStrings_Text_1();

	/**
	 * Returns the meta object for the attribute list '{@link alldatatypes.Strings#getTextarea <em>Textarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Textarea</em>'.
	 * @see alldatatypes.Strings#getTextarea()
	 * @see #getStrings()
	 * @generated
	 */
	EAttribute getStrings_Textarea();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Strings#getLink_01 <em>Link 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link 01</em>'.
	 * @see alldatatypes.Strings#getLink_01()
	 * @see #getStrings()
	 * @generated
	 */
	EAttribute getStrings_Link_01();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Strings#getHtml_01 <em>Html 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Html 01</em>'.
	 * @see alldatatypes.Strings#getHtml_01()
	 * @see #getStrings()
	 * @generated
	 */
	EAttribute getStrings_Html_01();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Strings#getNotEditableText_01 <em>Not Editable Text 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Editable Text 01</em>'.
	 * @see alldatatypes.Strings#getNotEditableText_01()
	 * @see #getStrings()
	 * @generated
	 */
	EAttribute getStrings_NotEditableText_01();

	/**
	 * Returns the meta object for class '{@link alldatatypes.Dates <em>Dates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dates</em>'.
	 * @see alldatatypes.Dates
	 * @generated
	 */
	EClass getDates();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Dates#getDateEmptyDefault_01 <em>Date Empty Default 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Empty Default 01</em>'.
	 * @see alldatatypes.Dates#getDateEmptyDefault_01()
	 * @see #getDates()
	 * @generated
	 */
	EAttribute getDates_DateEmptyDefault_01();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Dates#getDate_01 <em>Date 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date 01</em>'.
	 * @see alldatatypes.Dates#getDate_01()
	 * @see #getDates()
	 * @generated
	 */
	EAttribute getDates_Date_01();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Dates#getDate_1 <em>Date 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date 1</em>'.
	 * @see alldatatypes.Dates#getDate_1()
	 * @see #getDates()
	 * @generated
	 */
	EAttribute getDates_Date_1();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Dates#getDate_01_HM <em>Date 01 HM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date 01 HM</em>'.
	 * @see alldatatypes.Dates#getDate_01_HM()
	 * @see #getDates()
	 * @generated
	 */
	EAttribute getDates_Date_01_HM();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Dates#getDate_01_HMS <em>Date 01 HMS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date 01 HMS</em>'.
	 * @see alldatatypes.Dates#getDate_01_HMS()
	 * @see #getDates()
	 * @generated
	 */
	EAttribute getDates_Date_01_HMS();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Dates#getDate_01_HMSms <em>Date 01 HM Sms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date 01 HM Sms</em>'.
	 * @see alldatatypes.Dates#getDate_01_HMSms()
	 * @see #getDates()
	 * @generated
	 */
	EAttribute getDates_Date_01_HMSms();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Dates#getNotEditableDate_01 <em>Not Editable Date 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Editable Date 01</em>'.
	 * @see alldatatypes.Dates#getNotEditableDate_01()
	 * @see #getDates()
	 * @generated
	 */
	EAttribute getDates_NotEditableDate_01();

	/**
	 * Returns the meta object for the attribute list '{@link alldatatypes.Dates#getDates <em>Dates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dates</em>'.
	 * @see alldatatypes.Dates#getDates()
	 * @see #getDates()
	 * @generated
	 */
	EAttribute getDates_Dates();

	/**
	 * Returns the meta object for class '{@link alldatatypes.Enums <em>Enums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enums</em>'.
	 * @see alldatatypes.Enums
	 * @generated
	 */
	EClass getEnums();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Enums#getEnum_01 <em>Enum 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum 01</em>'.
	 * @see alldatatypes.Enums#getEnum_01()
	 * @see #getEnums()
	 * @generated
	 */
	EAttribute getEnums_Enum_01();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Enums#getEnum_01_EmptyDefault <em>Enum 01 Empty Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum 01 Empty Default</em>'.
	 * @see alldatatypes.Enums#getEnum_01_EmptyDefault()
	 * @see #getEnums()
	 * @generated
	 */
	EAttribute getEnums_Enum_01_EmptyDefault();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Enums#getEnum_1 <em>Enum 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum 1</em>'.
	 * @see alldatatypes.Enums#getEnum_1()
	 * @see #getEnums()
	 * @generated
	 */
	EAttribute getEnums_Enum_1();

	/**
	 * Returns the meta object for the attribute list '{@link alldatatypes.Enums#getEnums <em>Enums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enums</em>'.
	 * @see alldatatypes.Enums#getEnums()
	 * @see #getEnums()
	 * @generated
	 */
	EAttribute getEnums_Enums();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Enums#getNotEditableEnum_01 <em>Not Editable Enum 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Editable Enum 01</em>'.
	 * @see alldatatypes.Enums#getNotEditableEnum_01()
	 * @see #getEnums()
	 * @generated
	 */
	EAttribute getEnums_NotEditableEnum_01();

	/**
	 * Returns the meta object for the attribute list '{@link alldatatypes.Enums#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>States</em>'.
	 * @see alldatatypes.Enums#getStates()
	 * @see #getEnums()
	 * @generated
	 */
	EAttribute getEnums_States();

	/**
	 * Returns the meta object for the attribute list '{@link alldatatypes.Enums#getStatesMax2 <em>States Max2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>States Max2</em>'.
	 * @see alldatatypes.Enums#getStatesMax2()
	 * @see #getEnums()
	 * @generated
	 */
	EAttribute getEnums_StatesMax2();

	/**
	 * Returns the meta object for the attribute list '{@link alldatatypes.Enums#getStatesMin1Max2 <em>States Min1 Max2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>States Min1 Max2</em>'.
	 * @see alldatatypes.Enums#getStatesMin1Max2()
	 * @see #getEnums()
	 * @generated
	 */
	EAttribute getEnums_StatesMin1Max2();

	/**
	 * Returns the meta object for the attribute list '{@link alldatatypes.Enums#getHeavy <em>Heavy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Heavy</em>'.
	 * @see alldatatypes.Enums#getHeavy()
	 * @see #getEnums()
	 * @generated
	 */
	EAttribute getEnums_Heavy();

	/**
	 * Returns the meta object for class '{@link alldatatypes.Booleans <em>Booleans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booleans</em>'.
	 * @see alldatatypes.Booleans
	 * @generated
	 */
	EClass getBooleans();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Booleans#isBoolean_01 <em>Boolean 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean 01</em>'.
	 * @see alldatatypes.Booleans#isBoolean_01()
	 * @see #getBooleans()
	 * @generated
	 */
	EAttribute getBooleans_Boolean_01();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Booleans#isBoolean_01_EmptyDefault <em>Boolean 01 Empty Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean 01 Empty Default</em>'.
	 * @see alldatatypes.Booleans#isBoolean_01_EmptyDefault()
	 * @see #getBooleans()
	 * @generated
	 */
	EAttribute getBooleans_Boolean_01_EmptyDefault();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Booleans#isBoolean_1 <em>Boolean 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean 1</em>'.
	 * @see alldatatypes.Booleans#isBoolean_1()
	 * @see #getBooleans()
	 * @generated
	 */
	EAttribute getBooleans_Boolean_1();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Booleans#isNotEditableBoolean_01 <em>Not Editable Boolean 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Editable Boolean 01</em>'.
	 * @see alldatatypes.Booleans#isNotEditableBoolean_01()
	 * @see #getBooleans()
	 * @generated
	 */
	EAttribute getBooleans_NotEditableBoolean_01();

	/**
	 * Returns the meta object for class '{@link alldatatypes.Integers <em>Integers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integers</em>'.
	 * @see alldatatypes.Integers
	 * @generated
	 */
	EClass getIntegers();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Integers#getInt_01 <em>Int 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int 01</em>'.
	 * @see alldatatypes.Integers#getInt_01()
	 * @see #getIntegers()
	 * @generated
	 */
	EAttribute getIntegers_Int_01();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Integers#getInt_1 <em>Int 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int 1</em>'.
	 * @see alldatatypes.Integers#getInt_1()
	 * @see #getIntegers()
	 * @generated
	 */
	EAttribute getIntegers_Int_1();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Integers#getInt_01_EmptyDefault <em>Int 01 Empty Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int 01 Empty Default</em>'.
	 * @see alldatatypes.Integers#getInt_01_EmptyDefault()
	 * @see #getIntegers()
	 * @generated
	 */
	EAttribute getIntegers_Int_01_EmptyDefault();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Integers#getNotEditableInt_01 <em>Not Editable Int 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Editable Int 01</em>'.
	 * @see alldatatypes.Integers#getNotEditableInt_01()
	 * @see #getIntegers()
	 * @generated
	 */
	EAttribute getIntegers_NotEditableInt_01();

	/**
	 * Returns the meta object for the attribute list '{@link alldatatypes.Integers#getInts <em>Ints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ints</em>'.
	 * @see alldatatypes.Integers#getInts()
	 * @see #getIntegers()
	 * @generated
	 */
	EAttribute getIntegers_Ints();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Integers#getHiddenInt_01 <em>Hidden Int 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden Int 01</em>'.
	 * @see alldatatypes.Integers#getHiddenInt_01()
	 * @see #getIntegers()
	 * @generated
	 */
	EAttribute getIntegers_HiddenInt_01();

	/**
	 * Returns the meta object for class '{@link alldatatypes.Longs <em>Longs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Longs</em>'.
	 * @see alldatatypes.Longs
	 * @generated
	 */
	EClass getLongs();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Longs#getLong_01 <em>Long 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long 01</em>'.
	 * @see alldatatypes.Longs#getLong_01()
	 * @see #getLongs()
	 * @generated
	 */
	EAttribute getLongs_Long_01();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Longs#getLong_1 <em>Long 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long 1</em>'.
	 * @see alldatatypes.Longs#getLong_1()
	 * @see #getLongs()
	 * @generated
	 */
	EAttribute getLongs_Long_1();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Longs#getLong_01_EmptyDefault <em>Long 01 Empty Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long 01 Empty Default</em>'.
	 * @see alldatatypes.Longs#getLong_01_EmptyDefault()
	 * @see #getLongs()
	 * @generated
	 */
	EAttribute getLongs_Long_01_EmptyDefault();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Longs#getNotEditableLong_01 <em>Not Editable Long 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Editable Long 01</em>'.
	 * @see alldatatypes.Longs#getNotEditableLong_01()
	 * @see #getLongs()
	 * @generated
	 */
	EAttribute getLongs_NotEditableLong_01();

	/**
	 * Returns the meta object for class '{@link alldatatypes.Shorts <em>Shorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shorts</em>'.
	 * @see alldatatypes.Shorts
	 * @generated
	 */
	EClass getShorts();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Shorts#getShort_01 <em>Short 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short 01</em>'.
	 * @see alldatatypes.Shorts#getShort_01()
	 * @see #getShorts()
	 * @generated
	 */
	EAttribute getShorts_Short_01();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Shorts#getShort_1 <em>Short 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short 1</em>'.
	 * @see alldatatypes.Shorts#getShort_1()
	 * @see #getShorts()
	 * @generated
	 */
	EAttribute getShorts_Short_1();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Shorts#getShort_01_EmptyDefault <em>Short 01 Empty Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short 01 Empty Default</em>'.
	 * @see alldatatypes.Shorts#getShort_01_EmptyDefault()
	 * @see #getShorts()
	 * @generated
	 */
	EAttribute getShorts_Short_01_EmptyDefault();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Shorts#getNotEditableShort_01 <em>Not Editable Short 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Editable Short 01</em>'.
	 * @see alldatatypes.Shorts#getNotEditableShort_01()
	 * @see #getShorts()
	 * @generated
	 */
	EAttribute getShorts_NotEditableShort_01();

	/**
	 * Returns the meta object for class '{@link alldatatypes.Doubles <em>Doubles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doubles</em>'.
	 * @see alldatatypes.Doubles
	 * @generated
	 */
	EClass getDoubles();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Doubles#getDouble_01 <em>Double 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Double 01</em>'.
	 * @see alldatatypes.Doubles#getDouble_01()
	 * @see #getDoubles()
	 * @generated
	 */
	EAttribute getDoubles_Double_01();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Doubles#getDouble_1 <em>Double 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Double 1</em>'.
	 * @see alldatatypes.Doubles#getDouble_1()
	 * @see #getDoubles()
	 * @generated
	 */
	EAttribute getDoubles_Double_1();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Doubles#getDouble_01_EmptyDefault <em>Double 01 Empty Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Double 01 Empty Default</em>'.
	 * @see alldatatypes.Doubles#getDouble_01_EmptyDefault()
	 * @see #getDoubles()
	 * @generated
	 */
	EAttribute getDoubles_Double_01_EmptyDefault();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Doubles#getNotEditableDouble_01 <em>Not Editable Double 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Editable Double 01</em>'.
	 * @see alldatatypes.Doubles#getNotEditableDouble_01()
	 * @see #getDoubles()
	 * @generated
	 */
	EAttribute getDoubles_NotEditableDouble_01();

	/**
	 * Returns the meta object for class '{@link alldatatypes.Floats <em>Floats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floats</em>'.
	 * @see alldatatypes.Floats
	 * @generated
	 */
	EClass getFloats();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Floats#getFloat_01 <em>Float 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float 01</em>'.
	 * @see alldatatypes.Floats#getFloat_01()
	 * @see #getFloats()
	 * @generated
	 */
	EAttribute getFloats_Float_01();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Floats#getFloat_1 <em>Float 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float 1</em>'.
	 * @see alldatatypes.Floats#getFloat_1()
	 * @see #getFloats()
	 * @generated
	 */
	EAttribute getFloats_Float_1();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Floats#getFloat_01_EmptyDefault <em>Float 01 Empty Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float 01 Empty Default</em>'.
	 * @see alldatatypes.Floats#getFloat_01_EmptyDefault()
	 * @see #getFloats()
	 * @generated
	 */
	EAttribute getFloats_Float_01_EmptyDefault();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.Floats#getNotEditableFloat_01 <em>Not Editable Float 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Editable Float 01</em>'.
	 * @see alldatatypes.Floats#getNotEditableFloat_01()
	 * @see #getFloats()
	 * @generated
	 */
	EAttribute getFloats_NotEditableFloat_01();

	/**
	 * Returns the meta object for class '{@link alldatatypes.BigIntegers <em>Big Integers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Big Integers</em>'.
	 * @see alldatatypes.BigIntegers
	 * @generated
	 */
	EClass getBigIntegers();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.BigIntegers#getBigInt_01 <em>Big Int 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Big Int 01</em>'.
	 * @see alldatatypes.BigIntegers#getBigInt_01()
	 * @see #getBigIntegers()
	 * @generated
	 */
	EAttribute getBigIntegers_BigInt_01();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.BigIntegers#getBigInt_1 <em>Big Int 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Big Int 1</em>'.
	 * @see alldatatypes.BigIntegers#getBigInt_1()
	 * @see #getBigIntegers()
	 * @generated
	 */
	EAttribute getBigIntegers_BigInt_1();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.BigIntegers#getBigInt_01_EmptyDefault <em>Big Int 01 Empty Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Big Int 01 Empty Default</em>'.
	 * @see alldatatypes.BigIntegers#getBigInt_01_EmptyDefault()
	 * @see #getBigIntegers()
	 * @generated
	 */
	EAttribute getBigIntegers_BigInt_01_EmptyDefault();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.BigIntegers#getNotEditableBigInt_01 <em>Not Editable Big Int 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Editable Big Int 01</em>'.
	 * @see alldatatypes.BigIntegers#getNotEditableBigInt_01()
	 * @see #getBigIntegers()
	 * @generated
	 */
	EAttribute getBigIntegers_NotEditableBigInt_01();

	/**
	 * Returns the meta object for the attribute list '{@link alldatatypes.BigIntegers#getBigInts <em>Big Ints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Big Ints</em>'.
	 * @see alldatatypes.BigIntegers#getBigInts()
	 * @see #getBigIntegers()
	 * @generated
	 */
	EAttribute getBigIntegers_BigInts();

	/**
	 * Returns the meta object for class '{@link alldatatypes.BigDecimals <em>Big Decimals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Big Decimals</em>'.
	 * @see alldatatypes.BigDecimals
	 * @generated
	 */
	EClass getBigDecimals();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.BigDecimals#getBigDecimal_01 <em>Big Decimal 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Big Decimal 01</em>'.
	 * @see alldatatypes.BigDecimals#getBigDecimal_01()
	 * @see #getBigDecimals()
	 * @generated
	 */
	EAttribute getBigDecimals_BigDecimal_01();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.BigDecimals#getBigDecimal_1 <em>Big Decimal 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Big Decimal 1</em>'.
	 * @see alldatatypes.BigDecimals#getBigDecimal_1()
	 * @see #getBigDecimals()
	 * @generated
	 */
	EAttribute getBigDecimals_BigDecimal_1();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.BigDecimals#getBigDecimal_01_EmptyDefault <em>Big Decimal 01 Empty Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Big Decimal 01 Empty Default</em>'.
	 * @see alldatatypes.BigDecimals#getBigDecimal_01_EmptyDefault()
	 * @see #getBigDecimals()
	 * @generated
	 */
	EAttribute getBigDecimals_BigDecimal_01_EmptyDefault();

	/**
	 * Returns the meta object for the attribute '{@link alldatatypes.BigDecimals#getNotEditableBigDecimal_01 <em>Not Editable Big Decimal 01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Editable Big Decimal 01</em>'.
	 * @see alldatatypes.BigDecimals#getNotEditableBigDecimal_01()
	 * @see #getBigDecimals()
	 * @generated
	 */
	EAttribute getBigDecimals_NotEditableBigDecimal_01();

	/**
	 * Returns the meta object for the attribute list '{@link alldatatypes.BigDecimals#getBigDecimals <em>Big Decimals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Big Decimals</em>'.
	 * @see alldatatypes.BigDecimals#getBigDecimals()
	 * @see #getBigDecimals()
	 * @generated
	 */
	EAttribute getBigDecimals_BigDecimals();

	/**
	 * Returns the meta object for enum '{@link alldatatypes.AEnum <em>AEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>AEnum</em>'.
	 * @see alldatatypes.AEnum
	 * @generated
	 */
	EEnum getAEnum();

	/**
	 * Returns the meta object for enum '{@link alldatatypes.StateWithoutDefault <em>State Without Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State Without Default</em>'.
	 * @see alldatatypes.StateWithoutDefault
	 * @generated
	 */
	EEnum getStateWithoutDefault();

	/**
	 * Returns the meta object for enum '{@link alldatatypes.Heavy <em>Heavy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Heavy</em>'.
	 * @see alldatatypes.Heavy
	 * @generated
	 */
	EEnum getHeavy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AlldatatypesFactory getAlldatatypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link alldatatypes.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alldatatypes.impl.ElementImpl
		 * @see alldatatypes.impl.AlldatatypesPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '{@link alldatatypes.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alldatatypes.impl.RootImpl
		 * @see alldatatypes.impl.AlldatatypesPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__TYPES = eINSTANCE.getRoot_Types();

		/**
		 * The meta object literal for the '<em><b>Get All Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT___GET_ALL_TYPES = eINSTANCE.getRoot__GetAllTypes();

		/**
		 * The meta object literal for the '{@link alldatatypes.Type <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alldatatypes.Type
		 * @see alldatatypes.impl.AlldatatypesPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link alldatatypes.impl.StringsImpl <em>Strings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alldatatypes.impl.StringsImpl
		 * @see alldatatypes.impl.AlldatatypesPackageImpl#getStrings()
		 * @generated
		 */
		EClass STRINGS = eINSTANCE.getStrings();

		/**
		 * The meta object literal for the '<em><b>Text 01 Empty Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRINGS__TEXT_01_EMPTY_DEFAULT = eINSTANCE.getStrings_Text_01_EmptyDefault();

		/**
		 * The meta object literal for the '<em><b>Text 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRINGS__TEXT_01 = eINSTANCE.getStrings_Text_01();

		/**
		 * The meta object literal for the '<em><b>Text 1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRINGS__TEXT_1 = eINSTANCE.getStrings_Text_1();

		/**
		 * The meta object literal for the '<em><b>Textarea</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRINGS__TEXTAREA = eINSTANCE.getStrings_Textarea();

		/**
		 * The meta object literal for the '<em><b>Link 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRINGS__LINK_01 = eINSTANCE.getStrings_Link_01();

		/**
		 * The meta object literal for the '<em><b>Html 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRINGS__HTML_01 = eINSTANCE.getStrings_Html_01();

		/**
		 * The meta object literal for the '<em><b>Not Editable Text 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRINGS__NOT_EDITABLE_TEXT_01 = eINSTANCE.getStrings_NotEditableText_01();

		/**
		 * The meta object literal for the '{@link alldatatypes.impl.DatesImpl <em>Dates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alldatatypes.impl.DatesImpl
		 * @see alldatatypes.impl.AlldatatypesPackageImpl#getDates()
		 * @generated
		 */
		EClass DATES = eINSTANCE.getDates();

		/**
		 * The meta object literal for the '<em><b>Date Empty Default 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATES__DATE_EMPTY_DEFAULT_01 = eINSTANCE.getDates_DateEmptyDefault_01();

		/**
		 * The meta object literal for the '<em><b>Date 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATES__DATE_01 = eINSTANCE.getDates_Date_01();

		/**
		 * The meta object literal for the '<em><b>Date 1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATES__DATE_1 = eINSTANCE.getDates_Date_1();

		/**
		 * The meta object literal for the '<em><b>Date 01 HM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATES__DATE_01_HM = eINSTANCE.getDates_Date_01_HM();

		/**
		 * The meta object literal for the '<em><b>Date 01 HMS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATES__DATE_01_HMS = eINSTANCE.getDates_Date_01_HMS();

		/**
		 * The meta object literal for the '<em><b>Date 01 HM Sms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATES__DATE_01_HM_SMS = eINSTANCE.getDates_Date_01_HMSms();

		/**
		 * The meta object literal for the '<em><b>Not Editable Date 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATES__NOT_EDITABLE_DATE_01 = eINSTANCE.getDates_NotEditableDate_01();

		/**
		 * The meta object literal for the '<em><b>Dates</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATES__DATES = eINSTANCE.getDates_Dates();

		/**
		 * The meta object literal for the '{@link alldatatypes.impl.EnumsImpl <em>Enums</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alldatatypes.impl.EnumsImpl
		 * @see alldatatypes.impl.AlldatatypesPackageImpl#getEnums()
		 * @generated
		 */
		EClass ENUMS = eINSTANCE.getEnums();

		/**
		 * The meta object literal for the '<em><b>Enum 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMS__ENUM_01 = eINSTANCE.getEnums_Enum_01();

		/**
		 * The meta object literal for the '<em><b>Enum 01 Empty Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMS__ENUM_01_EMPTY_DEFAULT = eINSTANCE.getEnums_Enum_01_EmptyDefault();

		/**
		 * The meta object literal for the '<em><b>Enum 1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMS__ENUM_1 = eINSTANCE.getEnums_Enum_1();

		/**
		 * The meta object literal for the '<em><b>Enums</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMS__ENUMS = eINSTANCE.getEnums_Enums();

		/**
		 * The meta object literal for the '<em><b>Not Editable Enum 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMS__NOT_EDITABLE_ENUM_01 = eINSTANCE.getEnums_NotEditableEnum_01();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMS__STATES = eINSTANCE.getEnums_States();

		/**
		 * The meta object literal for the '<em><b>States Max2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMS__STATES_MAX2 = eINSTANCE.getEnums_StatesMax2();

		/**
		 * The meta object literal for the '<em><b>States Min1 Max2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMS__STATES_MIN1_MAX2 = eINSTANCE.getEnums_StatesMin1Max2();

		/**
		 * The meta object literal for the '<em><b>Heavy</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMS__HEAVY = eINSTANCE.getEnums_Heavy();

		/**
		 * The meta object literal for the '{@link alldatatypes.impl.BooleansImpl <em>Booleans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alldatatypes.impl.BooleansImpl
		 * @see alldatatypes.impl.AlldatatypesPackageImpl#getBooleans()
		 * @generated
		 */
		EClass BOOLEANS = eINSTANCE.getBooleans();

		/**
		 * The meta object literal for the '<em><b>Boolean 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEANS__BOOLEAN_01 = eINSTANCE.getBooleans_Boolean_01();

		/**
		 * The meta object literal for the '<em><b>Boolean 01 Empty Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEANS__BOOLEAN_01_EMPTY_DEFAULT = eINSTANCE.getBooleans_Boolean_01_EmptyDefault();

		/**
		 * The meta object literal for the '<em><b>Boolean 1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEANS__BOOLEAN_1 = eINSTANCE.getBooleans_Boolean_1();

		/**
		 * The meta object literal for the '<em><b>Not Editable Boolean 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEANS__NOT_EDITABLE_BOOLEAN_01 = eINSTANCE.getBooleans_NotEditableBoolean_01();

		/**
		 * The meta object literal for the '{@link alldatatypes.impl.IntegersImpl <em>Integers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alldatatypes.impl.IntegersImpl
		 * @see alldatatypes.impl.AlldatatypesPackageImpl#getIntegers()
		 * @generated
		 */
		EClass INTEGERS = eINSTANCE.getIntegers();

		/**
		 * The meta object literal for the '<em><b>Int 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGERS__INT_01 = eINSTANCE.getIntegers_Int_01();

		/**
		 * The meta object literal for the '<em><b>Int 1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGERS__INT_1 = eINSTANCE.getIntegers_Int_1();

		/**
		 * The meta object literal for the '<em><b>Int 01 Empty Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGERS__INT_01_EMPTY_DEFAULT = eINSTANCE.getIntegers_Int_01_EmptyDefault();

		/**
		 * The meta object literal for the '<em><b>Not Editable Int 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGERS__NOT_EDITABLE_INT_01 = eINSTANCE.getIntegers_NotEditableInt_01();

		/**
		 * The meta object literal for the '<em><b>Ints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGERS__INTS = eINSTANCE.getIntegers_Ints();

		/**
		 * The meta object literal for the '<em><b>Hidden Int 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGERS__HIDDEN_INT_01 = eINSTANCE.getIntegers_HiddenInt_01();

		/**
		 * The meta object literal for the '{@link alldatatypes.impl.LongsImpl <em>Longs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alldatatypes.impl.LongsImpl
		 * @see alldatatypes.impl.AlldatatypesPackageImpl#getLongs()
		 * @generated
		 */
		EClass LONGS = eINSTANCE.getLongs();

		/**
		 * The meta object literal for the '<em><b>Long 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONGS__LONG_01 = eINSTANCE.getLongs_Long_01();

		/**
		 * The meta object literal for the '<em><b>Long 1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONGS__LONG_1 = eINSTANCE.getLongs_Long_1();

		/**
		 * The meta object literal for the '<em><b>Long 01 Empty Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONGS__LONG_01_EMPTY_DEFAULT = eINSTANCE.getLongs_Long_01_EmptyDefault();

		/**
		 * The meta object literal for the '<em><b>Not Editable Long 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LONGS__NOT_EDITABLE_LONG_01 = eINSTANCE.getLongs_NotEditableLong_01();

		/**
		 * The meta object literal for the '{@link alldatatypes.impl.ShortsImpl <em>Shorts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alldatatypes.impl.ShortsImpl
		 * @see alldatatypes.impl.AlldatatypesPackageImpl#getShorts()
		 * @generated
		 */
		EClass SHORTS = eINSTANCE.getShorts();

		/**
		 * The meta object literal for the '<em><b>Short 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORTS__SHORT_01 = eINSTANCE.getShorts_Short_01();

		/**
		 * The meta object literal for the '<em><b>Short 1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORTS__SHORT_1 = eINSTANCE.getShorts_Short_1();

		/**
		 * The meta object literal for the '<em><b>Short 01 Empty Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORTS__SHORT_01_EMPTY_DEFAULT = eINSTANCE.getShorts_Short_01_EmptyDefault();

		/**
		 * The meta object literal for the '<em><b>Not Editable Short 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHORTS__NOT_EDITABLE_SHORT_01 = eINSTANCE.getShorts_NotEditableShort_01();

		/**
		 * The meta object literal for the '{@link alldatatypes.impl.DoublesImpl <em>Doubles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alldatatypes.impl.DoublesImpl
		 * @see alldatatypes.impl.AlldatatypesPackageImpl#getDoubles()
		 * @generated
		 */
		EClass DOUBLES = eINSTANCE.getDoubles();

		/**
		 * The meta object literal for the '<em><b>Double 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLES__DOUBLE_01 = eINSTANCE.getDoubles_Double_01();

		/**
		 * The meta object literal for the '<em><b>Double 1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLES__DOUBLE_1 = eINSTANCE.getDoubles_Double_1();

		/**
		 * The meta object literal for the '<em><b>Double 01 Empty Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLES__DOUBLE_01_EMPTY_DEFAULT = eINSTANCE.getDoubles_Double_01_EmptyDefault();

		/**
		 * The meta object literal for the '<em><b>Not Editable Double 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLES__NOT_EDITABLE_DOUBLE_01 = eINSTANCE.getDoubles_NotEditableDouble_01();

		/**
		 * The meta object literal for the '{@link alldatatypes.impl.FloatsImpl <em>Floats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alldatatypes.impl.FloatsImpl
		 * @see alldatatypes.impl.AlldatatypesPackageImpl#getFloats()
		 * @generated
		 */
		EClass FLOATS = eINSTANCE.getFloats();

		/**
		 * The meta object literal for the '<em><b>Float 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATS__FLOAT_01 = eINSTANCE.getFloats_Float_01();

		/**
		 * The meta object literal for the '<em><b>Float 1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATS__FLOAT_1 = eINSTANCE.getFloats_Float_1();

		/**
		 * The meta object literal for the '<em><b>Float 01 Empty Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATS__FLOAT_01_EMPTY_DEFAULT = eINSTANCE.getFloats_Float_01_EmptyDefault();

		/**
		 * The meta object literal for the '<em><b>Not Editable Float 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATS__NOT_EDITABLE_FLOAT_01 = eINSTANCE.getFloats_NotEditableFloat_01();

		/**
		 * The meta object literal for the '{@link alldatatypes.impl.BigIntegersImpl <em>Big Integers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alldatatypes.impl.BigIntegersImpl
		 * @see alldatatypes.impl.AlldatatypesPackageImpl#getBigIntegers()
		 * @generated
		 */
		EClass BIG_INTEGERS = eINSTANCE.getBigIntegers();

		/**
		 * The meta object literal for the '<em><b>Big Int 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIG_INTEGERS__BIG_INT_01 = eINSTANCE.getBigIntegers_BigInt_01();

		/**
		 * The meta object literal for the '<em><b>Big Int 1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIG_INTEGERS__BIG_INT_1 = eINSTANCE.getBigIntegers_BigInt_1();

		/**
		 * The meta object literal for the '<em><b>Big Int 01 Empty Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIG_INTEGERS__BIG_INT_01_EMPTY_DEFAULT = eINSTANCE.getBigIntegers_BigInt_01_EmptyDefault();

		/**
		 * The meta object literal for the '<em><b>Not Editable Big Int 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIG_INTEGERS__NOT_EDITABLE_BIG_INT_01 = eINSTANCE.getBigIntegers_NotEditableBigInt_01();

		/**
		 * The meta object literal for the '<em><b>Big Ints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIG_INTEGERS__BIG_INTS = eINSTANCE.getBigIntegers_BigInts();

		/**
		 * The meta object literal for the '{@link alldatatypes.impl.BigDecimalsImpl <em>Big Decimals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alldatatypes.impl.BigDecimalsImpl
		 * @see alldatatypes.impl.AlldatatypesPackageImpl#getBigDecimals()
		 * @generated
		 */
		EClass BIG_DECIMALS = eINSTANCE.getBigDecimals();

		/**
		 * The meta object literal for the '<em><b>Big Decimal 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIG_DECIMALS__BIG_DECIMAL_01 = eINSTANCE.getBigDecimals_BigDecimal_01();

		/**
		 * The meta object literal for the '<em><b>Big Decimal 1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIG_DECIMALS__BIG_DECIMAL_1 = eINSTANCE.getBigDecimals_BigDecimal_1();

		/**
		 * The meta object literal for the '<em><b>Big Decimal 01 Empty Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIG_DECIMALS__BIG_DECIMAL_01_EMPTY_DEFAULT = eINSTANCE.getBigDecimals_BigDecimal_01_EmptyDefault();

		/**
		 * The meta object literal for the '<em><b>Not Editable Big Decimal 01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIG_DECIMALS__NOT_EDITABLE_BIG_DECIMAL_01 = eINSTANCE.getBigDecimals_NotEditableBigDecimal_01();

		/**
		 * The meta object literal for the '<em><b>Big Decimals</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIG_DECIMALS__BIG_DECIMALS = eINSTANCE.getBigDecimals_BigDecimals();

		/**
		 * The meta object literal for the '{@link alldatatypes.AEnum <em>AEnum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alldatatypes.AEnum
		 * @see alldatatypes.impl.AlldatatypesPackageImpl#getAEnum()
		 * @generated
		 */
		EEnum AENUM = eINSTANCE.getAEnum();

		/**
		 * The meta object literal for the '{@link alldatatypes.StateWithoutDefault <em>State Without Default</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alldatatypes.StateWithoutDefault
		 * @see alldatatypes.impl.AlldatatypesPackageImpl#getStateWithoutDefault()
		 * @generated
		 */
		EEnum STATE_WITHOUT_DEFAULT = eINSTANCE.getStateWithoutDefault();

		/**
		 * The meta object literal for the '{@link alldatatypes.Heavy <em>Heavy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alldatatypes.Heavy
		 * @see alldatatypes.impl.AlldatatypesPackageImpl#getHeavy()
		 * @generated
		 */
		EEnum HEAVY = eINSTANCE.getHeavy();

	}

} //AlldatatypesPackage
