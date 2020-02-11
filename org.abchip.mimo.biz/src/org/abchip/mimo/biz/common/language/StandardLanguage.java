/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.language;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.language.StandardLanguage#getStandardLanguageId <em>Standard Language Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.language.StandardLanguage#getLangCharset <em>Lang Charset</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.language.StandardLanguage#getLangCode2 <em>Lang Code2</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.language.StandardLanguage#getLangCode3b <em>Lang Code3b</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.language.StandardLanguage#getLangCode3t <em>Lang Code3t</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.language.StandardLanguage#getLangFamily <em>Lang Family</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.language.StandardLanguage#getLangName <em>Lang Name</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.language.LanguagePackage#getStandardLanguage()
 * @model
 * @generated
 */
public interface StandardLanguage extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Lang Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang Charset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang Charset</em>' attribute.
	 * @see #setLangCharset(String)
	 * @see org.abchip.mimo.biz.common.language.LanguagePackage#getStandardLanguage_LangCharset()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getLangCharset();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.language.StandardLanguage#getLangCharset <em>Lang Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Charset</em>' attribute.
	 * @see #getLangCharset()
	 * @generated
	 */
	void setLangCharset(String value);

	/**
	 * Returns the value of the '<em><b>Lang Code2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang Code2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang Code2</em>' attribute.
	 * @see #setLangCode2(String)
	 * @see org.abchip.mimo.biz.common.language.LanguagePackage#getStandardLanguage_LangCode2()
	 * @model annotation="mimo-ent-format length='10'"
	 * @generated
	 */
	String getLangCode2();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.language.StandardLanguage#getLangCode2 <em>Lang Code2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Code2</em>' attribute.
	 * @see #getLangCode2()
	 * @generated
	 */
	void setLangCode2(String value);

	/**
	 * Returns the value of the '<em><b>Lang Code3b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang Code3b</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang Code3b</em>' attribute.
	 * @see #setLangCode3b(String)
	 * @see org.abchip.mimo.biz.common.language.LanguagePackage#getStandardLanguage_LangCode3b()
	 * @model annotation="mimo-ent-format length='10'"
	 * @generated
	 */
	String getLangCode3b();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.language.StandardLanguage#getLangCode3b <em>Lang Code3b</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Code3b</em>' attribute.
	 * @see #getLangCode3b()
	 * @generated
	 */
	void setLangCode3b(String value);

	/**
	 * Returns the value of the '<em><b>Lang Code3t</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang Code3t</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang Code3t</em>' attribute.
	 * @see #setLangCode3t(String)
	 * @see org.abchip.mimo.biz.common.language.LanguagePackage#getStandardLanguage_LangCode3t()
	 * @model annotation="mimo-ent-format length='10'"
	 * @generated
	 */
	String getLangCode3t();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.language.StandardLanguage#getLangCode3t <em>Lang Code3t</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Code3t</em>' attribute.
	 * @see #getLangCode3t()
	 * @generated
	 */
	void setLangCode3t(String value);

	/**
	 * Returns the value of the '<em><b>Lang Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang Family</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang Family</em>' attribute.
	 * @see #setLangFamily(String)
	 * @see org.abchip.mimo.biz.common.language.LanguagePackage#getStandardLanguage_LangFamily()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getLangFamily();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.language.StandardLanguage#getLangFamily <em>Lang Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Family</em>' attribute.
	 * @see #getLangFamily()
	 * @generated
	 */
	void setLangFamily(String value);

	/**
	 * Returns the value of the '<em><b>Lang Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang Name</em>' attribute.
	 * @see #setLangName(String)
	 * @see org.abchip.mimo.biz.common.language.LanguagePackage#getStandardLanguage_LangName()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getLangName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.language.StandardLanguage#getLangName <em>Lang Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Name</em>' attribute.
	 * @see #getLangName()
	 * @generated
	 */
	void setLangName(String value);

	/**
	 * Returns the value of the '<em><b>Standard Language Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Language Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Language Id</em>' attribute.
	 * @see #setStandardLanguageId(String)
	 * @see org.abchip.mimo.biz.common.language.LanguagePackage#getStandardLanguage_StandardLanguageId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getStandardLanguageId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.language.StandardLanguage#getStandardLanguageId <em>Standard Language Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Language Id</em>' attribute.
	 * @see #getStandardLanguageId()
	 * @generated
	 */
	void setStandardLanguageId(String value);

} // StandardLanguage
