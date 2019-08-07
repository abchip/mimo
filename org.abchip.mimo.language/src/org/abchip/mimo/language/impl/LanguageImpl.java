/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language.impl;

import org.abchip.mimo.entity.impl.EntityNameableImpl;

import org.abchip.mimo.language.Language;
import org.abchip.mimo.language.LanguagePackage;

import org.abchip.mimo.language.LanguageScope;
import org.abchip.mimo.language.LanguageType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.language.impl.LanguageImpl#getIso_639_1 <em>Iso 639 1</em>}</li>
 *   <li>{@link org.abchip.mimo.language.impl.LanguageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.language.impl.LanguageImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.abchip.mimo.language.impl.LanguageImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.abchip.mimo.language.impl.LanguageImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LanguageImpl extends EntityNameableImpl implements Language {
	/**
	 * The default value of the '{@link #getIso_639_1() <em>Iso 639 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIso_639_1()
	 * @generated
	 * @ordered
	 */
	protected static final String ISO_639_1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIso_639_1() <em>Iso 639 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIso_639_1()
	 * @generated
	 * @ordered
	 */
	protected String iso_639_1 = ISO_639_1_EDEFAULT;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final LanguageScope SCOPE_EDEFAULT = LanguageScope.I;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected LanguageScope scope = SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final LanguageType TYPE_EDEFAULT = LanguageType.L;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected LanguageType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LanguagePackage.Literals.LANGUAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIso_639_1() {
		return iso_639_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIso_639_1(String newIso_639_1) {
		String oldIso_639_1 = iso_639_1;
		iso_639_1 = newIso_639_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.LANGUAGE__ISO_639_1, oldIso_639_1, iso_639_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.LANGUAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LanguageScope getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(LanguageScope newScope) {
		LanguageScope oldScope = scope;
		scope = newScope == null ? SCOPE_EDEFAULT : newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.LANGUAGE__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.LANGUAGE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LanguageType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(LanguageType newType) {
		LanguageType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.LANGUAGE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LanguagePackage.LANGUAGE__ISO_639_1:
				return getIso_639_1();
			case LanguagePackage.LANGUAGE__NAME:
				return getName();
			case LanguagePackage.LANGUAGE__SCOPE:
				return getScope();
			case LanguagePackage.LANGUAGE__TEXT:
				return getText();
			case LanguagePackage.LANGUAGE__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LanguagePackage.LANGUAGE__ISO_639_1:
				setIso_639_1((String)newValue);
				return;
			case LanguagePackage.LANGUAGE__NAME:
				setName((String)newValue);
				return;
			case LanguagePackage.LANGUAGE__SCOPE:
				setScope((LanguageScope)newValue);
				return;
			case LanguagePackage.LANGUAGE__TEXT:
				setText((String)newValue);
				return;
			case LanguagePackage.LANGUAGE__TYPE:
				setType((LanguageType)newValue);
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
			case LanguagePackage.LANGUAGE__ISO_639_1:
				setIso_639_1(ISO_639_1_EDEFAULT);
				return;
			case LanguagePackage.LANGUAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LanguagePackage.LANGUAGE__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case LanguagePackage.LANGUAGE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case LanguagePackage.LANGUAGE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case LanguagePackage.LANGUAGE__ISO_639_1:
				return ISO_639_1_EDEFAULT == null ? iso_639_1 != null : !ISO_639_1_EDEFAULT.equals(iso_639_1);
			case LanguagePackage.LANGUAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LanguagePackage.LANGUAGE__SCOPE:
				return scope != SCOPE_EDEFAULT;
			case LanguagePackage.LANGUAGE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case LanguagePackage.LANGUAGE__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (iso_639_1: ");
		result.append(iso_639_1);
		result.append(", name: ");
		result.append(name);
		result.append(", scope: ");
		result.append(scope);
		result.append(", text: ");
		result.append(text);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //LanguageImpl
