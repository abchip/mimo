/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.language.impl;

import org.abchip.mimo.biz.common.language.LanguagePackage;
import org.abchip.mimo.biz.common.language.StandardLanguage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The default value of the '{@link #getStandardLanguageId() <em>Standard Language Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardLanguageId()
	 * @generated
	 * @ordered
	 */
	protected static final String STANDARD_LANGUAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandardLanguageId() <em>Standard Language Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardLanguageId()
	 * @generated
	 * @ordered
	 */
	protected String standardLanguageId = STANDARD_LANGUAGE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getLangCharset() <em>Lang Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangCharset()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_CHARSET_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLangCharset() <em>Lang Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangCharset()
	 * @generated
	 * @ordered
	 */
	protected String langCharset = LANG_CHARSET_EDEFAULT;
	/**
	 * The default value of the '{@link #getLangCode2() <em>Lang Code2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangCode2()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_CODE2_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLangCode2() <em>Lang Code2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangCode2()
	 * @generated
	 * @ordered
	 */
	protected String langCode2 = LANG_CODE2_EDEFAULT;
	/**
	 * The default value of the '{@link #getLangCode3b() <em>Lang Code3b</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangCode3b()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_CODE3B_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLangCode3b() <em>Lang Code3b</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangCode3b()
	 * @generated
	 * @ordered
	 */
	protected String langCode3b = LANG_CODE3B_EDEFAULT;
	/**
	 * The default value of the '{@link #getLangCode3t() <em>Lang Code3t</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangCode3t()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_CODE3T_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLangCode3t() <em>Lang Code3t</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangCode3t()
	 * @generated
	 * @ordered
	 */
	protected String langCode3t = LANG_CODE3T_EDEFAULT;
	/**
	 * The default value of the '{@link #getLangFamily() <em>Lang Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangFamily()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_FAMILY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLangFamily() <em>Lang Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangFamily()
	 * @generated
	 * @ordered
	 */
	protected String langFamily = LANG_FAMILY_EDEFAULT;
	/**
	 * The default value of the '{@link #getLangName() <em>Lang Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangName()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLangName() <em>Lang Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangName()
	 * @generated
	 * @ordered
	 */
	protected String langName = LANG_NAME_EDEFAULT;

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
		return langCharset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLangCharset(String newLangCharset) {
		String oldLangCharset = langCharset;
		langCharset = newLangCharset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.STANDARD_LANGUAGE__LANG_CHARSET, oldLangCharset, langCharset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLangCode2() {
		return langCode2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLangCode2(String newLangCode2) {
		String oldLangCode2 = langCode2;
		langCode2 = newLangCode2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.STANDARD_LANGUAGE__LANG_CODE2, oldLangCode2, langCode2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLangCode3b() {
		return langCode3b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLangCode3b(String newLangCode3b) {
		String oldLangCode3b = langCode3b;
		langCode3b = newLangCode3b;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.STANDARD_LANGUAGE__LANG_CODE3B, oldLangCode3b, langCode3b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLangCode3t() {
		return langCode3t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLangCode3t(String newLangCode3t) {
		String oldLangCode3t = langCode3t;
		langCode3t = newLangCode3t;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.STANDARD_LANGUAGE__LANG_CODE3T, oldLangCode3t, langCode3t));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLangFamily() {
		return langFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLangFamily(String newLangFamily) {
		String oldLangFamily = langFamily;
		langFamily = newLangFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.STANDARD_LANGUAGE__LANG_FAMILY, oldLangFamily, langFamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLangName() {
		return langName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLangName(String newLangName) {
		String oldLangName = langName;
		langName = newLangName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.STANDARD_LANGUAGE__LANG_NAME, oldLangName, langName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStandardLanguageId() {
		return standardLanguageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardLanguageId(String newStandardLanguageId) {
		String oldStandardLanguageId = standardLanguageId;
		standardLanguageId = newStandardLanguageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.STANDARD_LANGUAGE__STANDARD_LANGUAGE_ID, oldStandardLanguageId, standardLanguageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LanguagePackage.STANDARD_LANGUAGE__STANDARD_LANGUAGE_ID:
				return getStandardLanguageId();
			case LanguagePackage.STANDARD_LANGUAGE__LANG_CHARSET:
				return getLangCharset();
			case LanguagePackage.STANDARD_LANGUAGE__LANG_CODE2:
				return getLangCode2();
			case LanguagePackage.STANDARD_LANGUAGE__LANG_CODE3B:
				return getLangCode3b();
			case LanguagePackage.STANDARD_LANGUAGE__LANG_CODE3T:
				return getLangCode3t();
			case LanguagePackage.STANDARD_LANGUAGE__LANG_FAMILY:
				return getLangFamily();
			case LanguagePackage.STANDARD_LANGUAGE__LANG_NAME:
				return getLangName();
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
			case LanguagePackage.STANDARD_LANGUAGE__STANDARD_LANGUAGE_ID:
				setStandardLanguageId((String)newValue);
				return;
			case LanguagePackage.STANDARD_LANGUAGE__LANG_CHARSET:
				setLangCharset((String)newValue);
				return;
			case LanguagePackage.STANDARD_LANGUAGE__LANG_CODE2:
				setLangCode2((String)newValue);
				return;
			case LanguagePackage.STANDARD_LANGUAGE__LANG_CODE3B:
				setLangCode3b((String)newValue);
				return;
			case LanguagePackage.STANDARD_LANGUAGE__LANG_CODE3T:
				setLangCode3t((String)newValue);
				return;
			case LanguagePackage.STANDARD_LANGUAGE__LANG_FAMILY:
				setLangFamily((String)newValue);
				return;
			case LanguagePackage.STANDARD_LANGUAGE__LANG_NAME:
				setLangName((String)newValue);
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
			case LanguagePackage.STANDARD_LANGUAGE__STANDARD_LANGUAGE_ID:
				setStandardLanguageId(STANDARD_LANGUAGE_ID_EDEFAULT);
				return;
			case LanguagePackage.STANDARD_LANGUAGE__LANG_CHARSET:
				setLangCharset(LANG_CHARSET_EDEFAULT);
				return;
			case LanguagePackage.STANDARD_LANGUAGE__LANG_CODE2:
				setLangCode2(LANG_CODE2_EDEFAULT);
				return;
			case LanguagePackage.STANDARD_LANGUAGE__LANG_CODE3B:
				setLangCode3b(LANG_CODE3B_EDEFAULT);
				return;
			case LanguagePackage.STANDARD_LANGUAGE__LANG_CODE3T:
				setLangCode3t(LANG_CODE3T_EDEFAULT);
				return;
			case LanguagePackage.STANDARD_LANGUAGE__LANG_FAMILY:
				setLangFamily(LANG_FAMILY_EDEFAULT);
				return;
			case LanguagePackage.STANDARD_LANGUAGE__LANG_NAME:
				setLangName(LANG_NAME_EDEFAULT);
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
			case LanguagePackage.STANDARD_LANGUAGE__STANDARD_LANGUAGE_ID:
				return STANDARD_LANGUAGE_ID_EDEFAULT == null ? standardLanguageId != null : !STANDARD_LANGUAGE_ID_EDEFAULT.equals(standardLanguageId);
			case LanguagePackage.STANDARD_LANGUAGE__LANG_CHARSET:
				return LANG_CHARSET_EDEFAULT == null ? langCharset != null : !LANG_CHARSET_EDEFAULT.equals(langCharset);
			case LanguagePackage.STANDARD_LANGUAGE__LANG_CODE2:
				return LANG_CODE2_EDEFAULT == null ? langCode2 != null : !LANG_CODE2_EDEFAULT.equals(langCode2);
			case LanguagePackage.STANDARD_LANGUAGE__LANG_CODE3B:
				return LANG_CODE3B_EDEFAULT == null ? langCode3b != null : !LANG_CODE3B_EDEFAULT.equals(langCode3b);
			case LanguagePackage.STANDARD_LANGUAGE__LANG_CODE3T:
				return LANG_CODE3T_EDEFAULT == null ? langCode3t != null : !LANG_CODE3T_EDEFAULT.equals(langCode3t);
			case LanguagePackage.STANDARD_LANGUAGE__LANG_FAMILY:
				return LANG_FAMILY_EDEFAULT == null ? langFamily != null : !LANG_FAMILY_EDEFAULT.equals(langFamily);
			case LanguagePackage.STANDARD_LANGUAGE__LANG_NAME:
				return LANG_NAME_EDEFAULT == null ? langName != null : !LANG_NAME_EDEFAULT.equals(langName);
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
		result.append(" (standardLanguageId: ");
		result.append(standardLanguageId);
		result.append(", langCharset: ");
		result.append(langCharset);
		result.append(", langCode2: ");
		result.append(langCode2);
		result.append(", langCode3b: ");
		result.append(langCode3b);
		result.append(", langCode3t: ");
		result.append(langCode3t);
		result.append(", langFamily: ");
		result.append(langFamily);
		result.append(", langName: ");
		result.append(langName);
		result.append(')');
		return result.toString();
	}

} //StandardLanguageImpl
