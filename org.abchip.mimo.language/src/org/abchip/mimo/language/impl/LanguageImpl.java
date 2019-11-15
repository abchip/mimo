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
import org.eclipse.emf.ecore.EClass;

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
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
		return (String)eGet(LanguagePackage.Literals.LANGUAGE__ISO_639_1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIso_639_1(String newIso_639_1) {
		eSet(LanguagePackage.Literals.LANGUAGE__ISO_639_1, newIso_639_1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eGet(LanguagePackage.Literals.LANGUAGE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eSet(LanguagePackage.Literals.LANGUAGE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LanguageScope getScope() {
		return (LanguageScope)eGet(LanguagePackage.Literals.LANGUAGE__SCOPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(LanguageScope newScope) {
		eSet(LanguagePackage.Literals.LANGUAGE__SCOPE, newScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return (String)eGet(LanguagePackage.Literals.LANGUAGE__TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		eSet(LanguagePackage.Literals.LANGUAGE__TEXT, newText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LanguageType getType() {
		return (LanguageType)eGet(LanguagePackage.Literals.LANGUAGE__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(LanguageType newType) {
		eSet(LanguagePackage.Literals.LANGUAGE__TYPE, newType);
	}

} //LanguageImpl
