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
package fr.obeo.dsl.sample.alldatatypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doubles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Doubles#getDouble_01 <em>Double 01</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Doubles#getDouble_1 <em>Double 1</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Doubles#getDouble_01_EmptyDefault <em>Double 01 Empty Default</em>}</li>
 *   <li>{@link fr.obeo.dsl.sample.alldatatypes.Doubles#getNotEditableDouble_01 <em>Not Editable Double 01</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getDoubles()
 * @model
 * @generated
 */
public interface Doubles extends Type {
	/**
	 * Returns the value of the '<em><b>Double 01</b></em>' attribute.
	 * The default value is <code>"12.1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Double 01</em>' attribute.
	 * @see #setDouble_01(double)
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getDoubles_Double_01()
	 * @model default="12.1"
	 * @generated
	 */
	double getDouble_01();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.sample.alldatatypes.Doubles#getDouble_01 <em>Double 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double 01</em>' attribute.
	 * @see #getDouble_01()
	 * @generated
	 */
	void setDouble_01(double value);

	/**
	 * Returns the value of the '<em><b>Double 1</b></em>' attribute.
	 * The default value is <code>"12.1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Double 1</em>' attribute.
	 * @see #setDouble_1(double)
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getDoubles_Double_1()
	 * @model default="12.1" required="true"
	 * @generated
	 */
	double getDouble_1();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.sample.alldatatypes.Doubles#getDouble_1 <em>Double 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double 1</em>' attribute.
	 * @see #getDouble_1()
	 * @generated
	 */
	void setDouble_1(double value);

	/**
	 * Returns the value of the '<em><b>Double 01 Empty Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Double 01 Empty Default</em>' attribute.
	 * @see #setDouble_01_EmptyDefault(double)
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getDoubles_Double_01_EmptyDefault()
	 * @model
	 * @generated
	 */
	double getDouble_01_EmptyDefault();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.sample.alldatatypes.Doubles#getDouble_01_EmptyDefault <em>Double 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double 01 Empty Default</em>' attribute.
	 * @see #getDouble_01_EmptyDefault()
	 * @generated
	 */
	void setDouble_01_EmptyDefault(double value);

	/**
	 * Returns the value of the '<em><b>Not Editable Double 01</b></em>' attribute.
	 * The default value is <code>"12.1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Editable Double 01</em>' attribute.
	 * @see fr.obeo.dsl.sample.alldatatypes.AlldatatypesPackage#getDoubles_NotEditableDouble_01()
	 * @model default="12.1" changeable="false"
	 * @generated
	 */
	double getNotEditableDouble_01();

} // Doubles
