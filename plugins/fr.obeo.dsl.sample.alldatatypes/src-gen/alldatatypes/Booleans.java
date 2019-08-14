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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booleans</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alldatatypes.Booleans#isBoolean_01 <em>Boolean 01</em>}</li>
 *   <li>{@link alldatatypes.Booleans#isBoolean_01_EmptyDefault <em>Boolean 01 Empty Default</em>}</li>
 *   <li>{@link alldatatypes.Booleans#isBoolean_1 <em>Boolean 1</em>}</li>
 *   <li>{@link alldatatypes.Booleans#isNotEditableBoolean_01 <em>Not Editable Boolean 01</em>}</li>
 * </ul>
 *
 * @see alldatatypes.AlldatatypesPackage#getBooleans()
 * @model
 * @generated
 */
public interface Booleans extends Type {
	/**
	 * Returns the value of the '<em><b>Boolean 01</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean 01</em>' attribute.
	 * @see #setBoolean_01(boolean)
	 * @see alldatatypes.AlldatatypesPackage#getBooleans_Boolean_01()
	 * @model default="true"
	 * @generated
	 */
	boolean isBoolean_01();

	/**
	 * Sets the value of the '{@link alldatatypes.Booleans#isBoolean_01 <em>Boolean 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean 01</em>' attribute.
	 * @see #isBoolean_01()
	 * @generated
	 */
	void setBoolean_01(boolean value);

	/**
	 * Returns the value of the '<em><b>Boolean 01 Empty Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean 01 Empty Default</em>' attribute.
	 * @see #setBoolean_01_EmptyDefault(boolean)
	 * @see alldatatypes.AlldatatypesPackage#getBooleans_Boolean_01_EmptyDefault()
	 * @model
	 * @generated
	 */
	boolean isBoolean_01_EmptyDefault();

	/**
	 * Sets the value of the '{@link alldatatypes.Booleans#isBoolean_01_EmptyDefault <em>Boolean 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean 01 Empty Default</em>' attribute.
	 * @see #isBoolean_01_EmptyDefault()
	 * @generated
	 */
	void setBoolean_01_EmptyDefault(boolean value);

	/**
	 * Returns the value of the '<em><b>Boolean 1</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean 1</em>' attribute.
	 * @see #setBoolean_1(boolean)
	 * @see alldatatypes.AlldatatypesPackage#getBooleans_Boolean_1()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isBoolean_1();

	/**
	 * Sets the value of the '{@link alldatatypes.Booleans#isBoolean_1 <em>Boolean 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean 1</em>' attribute.
	 * @see #isBoolean_1()
	 * @generated
	 */
	void setBoolean_1(boolean value);

	/**
	 * Returns the value of the '<em><b>Not Editable Boolean 01</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Editable Boolean 01</em>' attribute.
	 * @see alldatatypes.AlldatatypesPackage#getBooleans_NotEditableBoolean_01()
	 * @model default="true" changeable="false"
	 * @generated
	 */
	boolean isNotEditableBoolean_01();

} // Booleans
