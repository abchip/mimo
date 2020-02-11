/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.language.impl;

import org.abchip.mimo.biz.common.language.LanguagePackage;
import org.abchip.mimo.biz.common.language.StandardLanguage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Language</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.language.impl.StandardLanguageImpl#getStandardLanguageId <em>Standard Language Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.language.impl.StandardLanguageImpl#getLangCharset <em>Lang Charset</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.language.impl.StandardLanguageImpl#getLangCode2 <em>Lang Code2</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.language.impl.StandardLanguageImpl#getLangCode3b <em>Lang Code3b</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.language.impl.StandardLanguageImpl#getLangCode3t <em>Lang Code3t</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.language.impl.StandardLanguageImpl#getLangFamily <em>Lang Family</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.language.impl.StandardLanguageImpl#getLangName <em>Lang Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StandardLanguageImpl extends BizEntityImpl implements StandardLanguage {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardLanguageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LanguagePackage.Literals.STANDARD_LANGUAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLangCharset() {
		return (String)eGet(LanguagePackage.Literals.STANDARD_LANGUAGE__LANG_CHARSET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLangCharset(String newLangCharset) {
		eSet(LanguagePackage.Literals.STANDARD_LANGUAGE__LANG_CHARSET, newLangCharset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLangCode2() {
		return (String)eGet(LanguagePackage.Literals.STANDARD_LANGUAGE__LANG_CODE2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLangCode2(String newLangCode2) {
		eSet(LanguagePackage.Literals.STANDARD_LANGUAGE__LANG_CODE2, newLangCode2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLangCode3b() {
		return (String)eGet(LanguagePackage.Literals.STANDARD_LANGUAGE__LANG_CODE3B, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLangCode3b(String newLangCode3b) {
		eSet(LanguagePackage.Literals.STANDARD_LANGUAGE__LANG_CODE3B, newLangCode3b);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLangCode3t() {
		return (String)eGet(LanguagePackage.Literals.STANDARD_LANGUAGE__LANG_CODE3T, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLangCode3t(String newLangCode3t) {
		eSet(LanguagePackage.Literals.STANDARD_LANGUAGE__LANG_CODE3T, newLangCode3t);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLangFamily() {
		return (String)eGet(LanguagePackage.Literals.STANDARD_LANGUAGE__LANG_FAMILY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLangFamily(String newLangFamily) {
		eSet(LanguagePackage.Literals.STANDARD_LANGUAGE__LANG_FAMILY, newLangFamily);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLangName() {
		return (String)eGet(LanguagePackage.Literals.STANDARD_LANGUAGE__LANG_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLangName(String newLangName) {
		eSet(LanguagePackage.Literals.STANDARD_LANGUAGE__LANG_NAME, newLangName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStandardLanguageId() {
		return (String)eGet(LanguagePackage.Literals.STANDARD_LANGUAGE__STANDARD_LANGUAGE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardLanguageId(String newStandardLanguageId) {
		eSet(LanguagePackage.Literals.STANDARD_LANGUAGE__STANDARD_LANGUAGE_ID, newStandardLanguageId);
	}

} //StandardLanguageImpl
