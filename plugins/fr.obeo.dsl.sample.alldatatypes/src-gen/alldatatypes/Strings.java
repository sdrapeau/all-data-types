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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alldatatypes.Strings#getText_01_EmptyDefault <em>Text 01 Empty Default</em>}</li>
 *   <li>{@link alldatatypes.Strings#getText_01 <em>Text 01</em>}</li>
 *   <li>{@link alldatatypes.Strings#getText_1 <em>Text 1</em>}</li>
 *   <li>{@link alldatatypes.Strings#getTextarea <em>Textarea</em>}</li>
 *   <li>{@link alldatatypes.Strings#getLink_01 <em>Link 01</em>}</li>
 *   <li>{@link alldatatypes.Strings#getHtml_01 <em>Html 01</em>}</li>
 *   <li>{@link alldatatypes.Strings#getNotEditableText_01 <em>Not Editable Text 01</em>}</li>
 * </ul>
 *
 * @see alldatatypes.AlldatatypesPackage#getStrings()
 * @model
 * @generated
 */
public interface Strings extends Type {
	/**
	 * Returns the value of the '<em><b>Text 01 Empty Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text 01 Empty Default</em>' attribute.
	 * @see #setText_01_EmptyDefault(String)
	 * @see alldatatypes.AlldatatypesPackage#getStrings_Text_01_EmptyDefault()
	 * @model
	 * @generated
	 */
	String getText_01_EmptyDefault();

	/**
	 * Sets the value of the '{@link alldatatypes.Strings#getText_01_EmptyDefault <em>Text 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text 01 Empty Default</em>' attribute.
	 * @see #getText_01_EmptyDefault()
	 * @generated
	 */
	void setText_01_EmptyDefault(String value);

	/**
	 * Returns the value of the '<em><b>Text 01</b></em>' attribute.
	 * The default value is <code>"SmartEA"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text 01</em>' attribute.
	 * @see #setText_01(String)
	 * @see alldatatypes.AlldatatypesPackage#getStrings_Text_01()
	 * @model default="SmartEA"
	 * @generated
	 */
	String getText_01();

	/**
	 * Sets the value of the '{@link alldatatypes.Strings#getText_01 <em>Text 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text 01</em>' attribute.
	 * @see #getText_01()
	 * @generated
	 */
	void setText_01(String value);

	/**
	 * Returns the value of the '<em><b>Text 1</b></em>' attribute.
	 * The default value is <code>"SmartEA"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text 1</em>' attribute.
	 * @see #setText_1(String)
	 * @see alldatatypes.AlldatatypesPackage#getStrings_Text_1()
	 * @model default="SmartEA" required="true"
	 * @generated
	 */
	String getText_1();

	/**
	 * Sets the value of the '{@link alldatatypes.Strings#getText_1 <em>Text 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text 1</em>' attribute.
	 * @see #getText_1()
	 * @generated
	 */
	void setText_1(String value);

	/**
	 * Returns the value of the '<em><b>Textarea</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textarea</em>' attribute list.
	 * @see alldatatypes.AlldatatypesPackage#getStrings_Textarea()
	 * @model default="SmartEA" unique="false"
	 * @generated
	 */
	EList<String> getTextarea();

	/**
	 * Returns the value of the '<em><b>Link 01</b></em>' attribute.
	 * The default value is <code>"http://www.smartea.fr"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link 01</em>' attribute.
	 * @see #setLink_01(String)
	 * @see alldatatypes.AlldatatypesPackage#getStrings_Link_01()
	 * @model default="http://www.smartea.fr"
	 * @generated
	 */
	String getLink_01();

	/**
	 * Sets the value of the '{@link alldatatypes.Strings#getLink_01 <em>Link 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link 01</em>' attribute.
	 * @see #getLink_01()
	 * @generated
	 */
	void setLink_01(String value);

	/**
	 * Returns the value of the '<em><b>Html 01</b></em>' attribute.
	 * The default value is <code>"<strong>Obeo</strong> SmartEA"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Html 01</em>' attribute.
	 * @see #setHtml_01(String)
	 * @see alldatatypes.AlldatatypesPackage#getStrings_Html_01()
	 * @model default="&lt;strong&gt;Obeo&lt;/strong&gt; SmartEA"
	 * @generated
	 */
	String getHtml_01();

	/**
	 * Sets the value of the '{@link alldatatypes.Strings#getHtml_01 <em>Html 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html 01</em>' attribute.
	 * @see #getHtml_01()
	 * @generated
	 */
	void setHtml_01(String value);

	/**
	 * Returns the value of the '<em><b>Not Editable Text 01</b></em>' attribute.
	 * The default value is <code>"SmartEA"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Editable Text 01</em>' attribute.
	 * @see alldatatypes.AlldatatypesPackage#getStrings_NotEditableText_01()
	 * @model default="SmartEA" changeable="false"
	 * @generated
	 */
	String getNotEditableText_01();

} // Strings
