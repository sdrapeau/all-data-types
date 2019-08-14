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
import fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage;
import fr.obeo.dsl.sample.alldatatypes.Enums;
import fr.obeo.dsl.sample.alldatatypes.Heavy;
import fr.obeo.dsl.sample.alldatatypes.StateWithoutDefault;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enums</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.EnumsImpl#getEnum_01 <em>Enum 01</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.EnumsImpl#getEnum_01_EmptyDefault <em>Enum 01 Empty Default</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.EnumsImpl#getEnum_1 <em>Enum 1</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.EnumsImpl#getEnums <em>Enums</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.EnumsImpl#getNotEditableEnum_01 <em>Not Editable Enum 01</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.EnumsImpl#getStates <em>States</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.EnumsImpl#getStatesMax2 <em>States Max2</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.EnumsImpl#getStatesMin1Max2 <em>States Min1 Max2</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.impl.EnumsImpl#getHeavy <em>Heavy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumsImpl extends ElementImpl implements Enums {
	/**
	 * The default value of the '{@link #getEnum_01() <em>Enum 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum_01()
	 * @generated
	 * @ordered
	 */
	protected static final AEnum ENUM_01_EDEFAULT = AEnum.ENUM0;

	/**
	 * The cached value of the '{@link #getEnum_01() <em>Enum 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum_01()
	 * @generated
	 * @ordered
	 */
	protected AEnum enum_01 = ENUM_01_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnum_01_EmptyDefault() <em>Enum 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum_01_EmptyDefault()
	 * @generated
	 * @ordered
	 */
	protected static final AEnum ENUM_01_EMPTY_DEFAULT_EDEFAULT = AEnum.ENUM0;

	/**
	 * The cached value of the '{@link #getEnum_01_EmptyDefault() <em>Enum 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum_01_EmptyDefault()
	 * @generated
	 * @ordered
	 */
	protected AEnum enum_01_EmptyDefault = ENUM_01_EMPTY_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnum_1() <em>Enum 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum_1()
	 * @generated
	 * @ordered
	 */
	protected static final AEnum ENUM_1_EDEFAULT = AEnum.ENUM0;

	/**
	 * The cached value of the '{@link #getEnum_1() <em>Enum 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum_1()
	 * @generated
	 * @ordered
	 */
	protected AEnum enum_1 = ENUM_1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnums() <em>Enums</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnums()
	 * @generated
	 * @ordered
	 */
	protected EList<AEnum> enums;

	/**
	 * The default value of the '{@link #getNotEditableEnum_01() <em>Not Editable Enum 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotEditableEnum_01()
	 * @generated
	 * @ordered
	 */
	protected static final AEnum NOT_EDITABLE_ENUM_01_EDEFAULT = AEnum.ENUM0;

	/**
	 * The cached value of the '{@link #getNotEditableEnum_01() <em>Not Editable Enum 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotEditableEnum_01()
	 * @generated
	 * @ordered
	 */
	protected AEnum notEditableEnum_01 = NOT_EDITABLE_ENUM_01_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<StateWithoutDefault> states;

	/**
	 * The cached value of the '{@link #getStatesMax2() <em>States Max2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatesMax2()
	 * @generated
	 * @ordered
	 */
	protected EList<StateWithoutDefault> statesMax2;

	/**
	 * The cached value of the '{@link #getStatesMin1Max2() <em>States Min1 Max2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatesMin1Max2()
	 * @generated
	 * @ordered
	 */
	protected EList<StateWithoutDefault> statesMin1Max2;

	/**
	 * The cached value of the '{@link #getHeavy() <em>Heavy</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeavy()
	 * @generated
	 * @ordered
	 */
	protected EList<Heavy> heavy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlldatatypesPackage.Literals.ENUMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AEnum getEnum_01() {
		return enum_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnum_01(AEnum newEnum_01) {
		AEnum oldEnum_01 = enum_01;
		enum_01 = newEnum_01 == null ? ENUM_01_EDEFAULT : newEnum_01;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.ENUMS__ENUM_01, oldEnum_01, enum_01));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AEnum getEnum_01_EmptyDefault() {
		return enum_01_EmptyDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnum_01_EmptyDefault(AEnum newEnum_01_EmptyDefault) {
		AEnum oldEnum_01_EmptyDefault = enum_01_EmptyDefault;
		enum_01_EmptyDefault = newEnum_01_EmptyDefault == null ? ENUM_01_EMPTY_DEFAULT_EDEFAULT : newEnum_01_EmptyDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.ENUMS__ENUM_01_EMPTY_DEFAULT, oldEnum_01_EmptyDefault, enum_01_EmptyDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AEnum getEnum_1() {
		return enum_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnum_1(AEnum newEnum_1) {
		AEnum oldEnum_1 = enum_1;
		enum_1 = newEnum_1 == null ? ENUM_1_EDEFAULT : newEnum_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.ENUMS__ENUM_1, oldEnum_1, enum_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AEnum> getEnums() {
		if (enums == null) {
			enums = new EDataTypeUniqueEList<AEnum>(AEnum.class, this, AlldatatypesPackage.ENUMS__ENUMS);
		}
		return enums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AEnum getNotEditableEnum_01() {
		return notEditableEnum_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateWithoutDefault> getStates() {
		if (states == null) {
			states = new EDataTypeUniqueEList<StateWithoutDefault>(StateWithoutDefault.class, this, AlldatatypesPackage.ENUMS__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateWithoutDefault> getStatesMax2() {
		if (statesMax2 == null) {
			statesMax2 = new EDataTypeUniqueEList<StateWithoutDefault>(StateWithoutDefault.class, this, AlldatatypesPackage.ENUMS__STATES_MAX2);
		}
		return statesMax2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateWithoutDefault> getStatesMin1Max2() {
		if (statesMin1Max2 == null) {
			statesMin1Max2 = new EDataTypeUniqueEList<StateWithoutDefault>(StateWithoutDefault.class, this, AlldatatypesPackage.ENUMS__STATES_MIN1_MAX2);
		}
		return statesMin1Max2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Heavy> getHeavy() {
		if (heavy == null) {
			heavy = new EDataTypeUniqueEList<Heavy>(Heavy.class, this, AlldatatypesPackage.ENUMS__HEAVY);
		}
		return heavy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlldatatypesPackage.ENUMS__ENUM_01:
				return getEnum_01();
			case AlldatatypesPackage.ENUMS__ENUM_01_EMPTY_DEFAULT:
				return getEnum_01_EmptyDefault();
			case AlldatatypesPackage.ENUMS__ENUM_1:
				return getEnum_1();
			case AlldatatypesPackage.ENUMS__ENUMS:
				return getEnums();
			case AlldatatypesPackage.ENUMS__NOT_EDITABLE_ENUM_01:
				return getNotEditableEnum_01();
			case AlldatatypesPackage.ENUMS__STATES:
				return getStates();
			case AlldatatypesPackage.ENUMS__STATES_MAX2:
				return getStatesMax2();
			case AlldatatypesPackage.ENUMS__STATES_MIN1_MAX2:
				return getStatesMin1Max2();
			case AlldatatypesPackage.ENUMS__HEAVY:
				return getHeavy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AlldatatypesPackage.ENUMS__ENUM_01:
				setEnum_01((AEnum)newValue);
				return;
			case AlldatatypesPackage.ENUMS__ENUM_01_EMPTY_DEFAULT:
				setEnum_01_EmptyDefault((AEnum)newValue);
				return;
			case AlldatatypesPackage.ENUMS__ENUM_1:
				setEnum_1((AEnum)newValue);
				return;
			case AlldatatypesPackage.ENUMS__ENUMS:
				getEnums().clear();
				getEnums().addAll((Collection<? extends AEnum>)newValue);
				return;
			case AlldatatypesPackage.ENUMS__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends StateWithoutDefault>)newValue);
				return;
			case AlldatatypesPackage.ENUMS__STATES_MAX2:
				getStatesMax2().clear();
				getStatesMax2().addAll((Collection<? extends StateWithoutDefault>)newValue);
				return;
			case AlldatatypesPackage.ENUMS__STATES_MIN1_MAX2:
				getStatesMin1Max2().clear();
				getStatesMin1Max2().addAll((Collection<? extends StateWithoutDefault>)newValue);
				return;
			case AlldatatypesPackage.ENUMS__HEAVY:
				getHeavy().clear();
				getHeavy().addAll((Collection<? extends Heavy>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AlldatatypesPackage.ENUMS__ENUM_01:
				setEnum_01(ENUM_01_EDEFAULT);
				return;
			case AlldatatypesPackage.ENUMS__ENUM_01_EMPTY_DEFAULT:
				setEnum_01_EmptyDefault(ENUM_01_EMPTY_DEFAULT_EDEFAULT);
				return;
			case AlldatatypesPackage.ENUMS__ENUM_1:
				setEnum_1(ENUM_1_EDEFAULT);
				return;
			case AlldatatypesPackage.ENUMS__ENUMS:
				getEnums().clear();
				return;
			case AlldatatypesPackage.ENUMS__STATES:
				getStates().clear();
				return;
			case AlldatatypesPackage.ENUMS__STATES_MAX2:
				getStatesMax2().clear();
				return;
			case AlldatatypesPackage.ENUMS__STATES_MIN1_MAX2:
				getStatesMin1Max2().clear();
				return;
			case AlldatatypesPackage.ENUMS__HEAVY:
				getHeavy().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AlldatatypesPackage.ENUMS__ENUM_01:
				return enum_01 != ENUM_01_EDEFAULT;
			case AlldatatypesPackage.ENUMS__ENUM_01_EMPTY_DEFAULT:
				return enum_01_EmptyDefault != ENUM_01_EMPTY_DEFAULT_EDEFAULT;
			case AlldatatypesPackage.ENUMS__ENUM_1:
				return enum_1 != ENUM_1_EDEFAULT;
			case AlldatatypesPackage.ENUMS__ENUMS:
				return enums != null && !enums.isEmpty();
			case AlldatatypesPackage.ENUMS__NOT_EDITABLE_ENUM_01:
				return notEditableEnum_01 != NOT_EDITABLE_ENUM_01_EDEFAULT;
			case AlldatatypesPackage.ENUMS__STATES:
				return states != null && !states.isEmpty();
			case AlldatatypesPackage.ENUMS__STATES_MAX2:
				return statesMax2 != null && !statesMax2.isEmpty();
			case AlldatatypesPackage.ENUMS__STATES_MIN1_MAX2:
				return statesMin1Max2 != null && !statesMin1Max2.isEmpty();
			case AlldatatypesPackage.ENUMS__HEAVY:
				return heavy != null && !heavy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (enum_01: ");
		result.append(enum_01);
		result.append(", enum_01_EmptyDefault: ");
		result.append(enum_01_EmptyDefault);
		result.append(", enum_1: ");
		result.append(enum_1);
		result.append(", enums: ");
		result.append(enums);
		result.append(", notEditableEnum_01: ");
		result.append(notEditableEnum_01);
		result.append(", states: ");
		result.append(states);
		result.append(", statesMax2: ");
		result.append(statesMax2);
		result.append(", statesMin1Max2: ");
		result.append(statesMin1Max2);
		result.append(", heavy: ");
		result.append(heavy);
		result.append(')');
		return result.toString();
	}

} //EnumsImpl
