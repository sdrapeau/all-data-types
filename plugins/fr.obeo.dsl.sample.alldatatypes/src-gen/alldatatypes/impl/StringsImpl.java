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

import alldatatypes.AlldatatypesPackage;
import alldatatypes.Strings;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alldatatypes.impl.StringsImpl#getText_01_EmptyDefault <em>Text 01 Empty Default</em>}</li>
 *   <li>{@link alldatatypes.impl.StringsImpl#getText_01 <em>Text 01</em>}</li>
 *   <li>{@link alldatatypes.impl.StringsImpl#getText_1 <em>Text 1</em>}</li>
 *   <li>{@link alldatatypes.impl.StringsImpl#getTextarea <em>Textarea</em>}</li>
 *   <li>{@link alldatatypes.impl.StringsImpl#getLink_01 <em>Link 01</em>}</li>
 *   <li>{@link alldatatypes.impl.StringsImpl#getHtml_01 <em>Html 01</em>}</li>
 *   <li>{@link alldatatypes.impl.StringsImpl#getNotEditableText_01 <em>Not Editable Text 01</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringsImpl extends ElementImpl implements Strings {
	/**
	 * The default value of the '{@link #getText_01_EmptyDefault() <em>Text 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText_01_EmptyDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_01_EMPTY_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText_01_EmptyDefault() <em>Text 01 Empty Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText_01_EmptyDefault()
	 * @generated
	 * @ordered
	 */
	protected String text_01_EmptyDefault = TEXT_01_EMPTY_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getText_01() <em>Text 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText_01()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_01_EDEFAULT = "SmartEA";

	/**
	 * The cached value of the '{@link #getText_01() <em>Text 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText_01()
	 * @generated
	 * @ordered
	 */
	protected String text_01 = TEXT_01_EDEFAULT;

	/**
	 * The default value of the '{@link #getText_1() <em>Text 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText_1()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_1_EDEFAULT = "SmartEA";

	/**
	 * The cached value of the '{@link #getText_1() <em>Text 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText_1()
	 * @generated
	 * @ordered
	 */
	protected String text_1 = TEXT_1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTextarea() <em>Textarea</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextarea()
	 * @generated
	 * @ordered
	 */
	protected EList<String> textarea;

	/**
	 * The default value of the '{@link #getLink_01() <em>Link 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink_01()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_01_EDEFAULT = "http://www.smartea.fr";

	/**
	 * The cached value of the '{@link #getLink_01() <em>Link 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink_01()
	 * @generated
	 * @ordered
	 */
	protected String link_01 = LINK_01_EDEFAULT;

	/**
	 * The default value of the '{@link #getHtml_01() <em>Html 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtml_01()
	 * @generated
	 * @ordered
	 */
	protected static final String HTML_01_EDEFAULT = "<strong>Obeo</strong> SmartEA";

	/**
	 * The cached value of the '{@link #getHtml_01() <em>Html 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtml_01()
	 * @generated
	 * @ordered
	 */
	protected String html_01 = HTML_01_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotEditableText_01() <em>Not Editable Text 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotEditableText_01()
	 * @generated
	 * @ordered
	 */
	protected static final String NOT_EDITABLE_TEXT_01_EDEFAULT = "SmartEA";

	/**
	 * The cached value of the '{@link #getNotEditableText_01() <em>Not Editable Text 01</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotEditableText_01()
	 * @generated
	 * @ordered
	 */
	protected String notEditableText_01 = NOT_EDITABLE_TEXT_01_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlldatatypesPackage.Literals.STRINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText_01_EmptyDefault() {
		return text_01_EmptyDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText_01_EmptyDefault(String newText_01_EmptyDefault) {
		String oldText_01_EmptyDefault = text_01_EmptyDefault;
		text_01_EmptyDefault = newText_01_EmptyDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.STRINGS__TEXT_01_EMPTY_DEFAULT, oldText_01_EmptyDefault, text_01_EmptyDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText_01() {
		return text_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText_01(String newText_01) {
		String oldText_01 = text_01;
		text_01 = newText_01;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.STRINGS__TEXT_01, oldText_01, text_01));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText_1() {
		return text_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText_1(String newText_1) {
		String oldText_1 = text_1;
		text_1 = newText_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.STRINGS__TEXT_1, oldText_1, text_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTextarea() {
		if (textarea == null) {
			textarea = new EDataTypeEList<String>(String.class, this, AlldatatypesPackage.STRINGS__TEXTAREA);
		}
		return textarea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLink_01() {
		return link_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink_01(String newLink_01) {
		String oldLink_01 = link_01;
		link_01 = newLink_01;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.STRINGS__LINK_01, oldLink_01, link_01));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHtml_01() {
		return html_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHtml_01(String newHtml_01) {
		String oldHtml_01 = html_01;
		html_01 = newHtml_01;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlldatatypesPackage.STRINGS__HTML_01, oldHtml_01, html_01));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotEditableText_01() {
		return notEditableText_01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlldatatypesPackage.STRINGS__TEXT_01_EMPTY_DEFAULT:
				return getText_01_EmptyDefault();
			case AlldatatypesPackage.STRINGS__TEXT_01:
				return getText_01();
			case AlldatatypesPackage.STRINGS__TEXT_1:
				return getText_1();
			case AlldatatypesPackage.STRINGS__TEXTAREA:
				return getTextarea();
			case AlldatatypesPackage.STRINGS__LINK_01:
				return getLink_01();
			case AlldatatypesPackage.STRINGS__HTML_01:
				return getHtml_01();
			case AlldatatypesPackage.STRINGS__NOT_EDITABLE_TEXT_01:
				return getNotEditableText_01();
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
			case AlldatatypesPackage.STRINGS__TEXT_01_EMPTY_DEFAULT:
				setText_01_EmptyDefault((String)newValue);
				return;
			case AlldatatypesPackage.STRINGS__TEXT_01:
				setText_01((String)newValue);
				return;
			case AlldatatypesPackage.STRINGS__TEXT_1:
				setText_1((String)newValue);
				return;
			case AlldatatypesPackage.STRINGS__TEXTAREA:
				getTextarea().clear();
				getTextarea().addAll((Collection<? extends String>)newValue);
				return;
			case AlldatatypesPackage.STRINGS__LINK_01:
				setLink_01((String)newValue);
				return;
			case AlldatatypesPackage.STRINGS__HTML_01:
				setHtml_01((String)newValue);
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
			case AlldatatypesPackage.STRINGS__TEXT_01_EMPTY_DEFAULT:
				setText_01_EmptyDefault(TEXT_01_EMPTY_DEFAULT_EDEFAULT);
				return;
			case AlldatatypesPackage.STRINGS__TEXT_01:
				setText_01(TEXT_01_EDEFAULT);
				return;
			case AlldatatypesPackage.STRINGS__TEXT_1:
				setText_1(TEXT_1_EDEFAULT);
				return;
			case AlldatatypesPackage.STRINGS__TEXTAREA:
				getTextarea().clear();
				return;
			case AlldatatypesPackage.STRINGS__LINK_01:
				setLink_01(LINK_01_EDEFAULT);
				return;
			case AlldatatypesPackage.STRINGS__HTML_01:
				setHtml_01(HTML_01_EDEFAULT);
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
			case AlldatatypesPackage.STRINGS__TEXT_01_EMPTY_DEFAULT:
				return TEXT_01_EMPTY_DEFAULT_EDEFAULT == null ? text_01_EmptyDefault != null : !TEXT_01_EMPTY_DEFAULT_EDEFAULT.equals(text_01_EmptyDefault);
			case AlldatatypesPackage.STRINGS__TEXT_01:
				return TEXT_01_EDEFAULT == null ? text_01 != null : !TEXT_01_EDEFAULT.equals(text_01);
			case AlldatatypesPackage.STRINGS__TEXT_1:
				return TEXT_1_EDEFAULT == null ? text_1 != null : !TEXT_1_EDEFAULT.equals(text_1);
			case AlldatatypesPackage.STRINGS__TEXTAREA:
				return textarea != null && !textarea.isEmpty();
			case AlldatatypesPackage.STRINGS__LINK_01:
				return LINK_01_EDEFAULT == null ? link_01 != null : !LINK_01_EDEFAULT.equals(link_01);
			case AlldatatypesPackage.STRINGS__HTML_01:
				return HTML_01_EDEFAULT == null ? html_01 != null : !HTML_01_EDEFAULT.equals(html_01);
			case AlldatatypesPackage.STRINGS__NOT_EDITABLE_TEXT_01:
				return NOT_EDITABLE_TEXT_01_EDEFAULT == null ? notEditableText_01 != null : !NOT_EDITABLE_TEXT_01_EDEFAULT.equals(notEditableText_01);
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
		result.append(" (text_01_EmptyDefault: ");
		result.append(text_01_EmptyDefault);
		result.append(", text_01: ");
		result.append(text_01);
		result.append(", text_1: ");
		result.append(text_1);
		result.append(", textarea: ");
		result.append(textarea);
		result.append(", link_01: ");
		result.append(link_01);
		result.append(", html_01: ");
		result.append(html_01);
		result.append(", notEditableText_01: ");
		result.append(notEditableText_01);
		result.append(')');
		return result.toString();
	}

} //StringsImpl
