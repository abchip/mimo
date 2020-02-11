/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.language;

import org.abchip.mimo.biz.BizPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.common.language.LanguageFactory
 * @model kind="package"
 * @generated
 */
public interface LanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "language";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/common/language";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-language";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LanguagePackage eINSTANCE = org.abchip.mimo.biz.common.language.impl.LanguagePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.language.impl.StandardLanguageImpl <em>Standard Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.language.impl.StandardLanguageImpl
	 * @see org.abchip.mimo.biz.common.language.impl.LanguagePackageImpl#getStandardLanguage()
	 * @generated
	 */
	int STANDARD_LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LANGUAGE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LANGUAGE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LANGUAGE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LANGUAGE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Standard Language Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LANGUAGE__STANDARD_LANGUAGE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lang Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LANGUAGE__LANG_CHARSET = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lang Code2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LANGUAGE__LANG_CODE2 = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lang Code3b</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LANGUAGE__LANG_CODE3B = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lang Code3t</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LANGUAGE__LANG_CODE3T = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lang Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LANGUAGE__LANG_FAMILY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lang Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LANGUAGE__LANG_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Standard Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_LANGUAGE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.language.StandardLanguage <em>Standard Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Language</em>'.
	 * @see org.abchip.mimo.biz.common.language.StandardLanguage
	 * @generated
	 */
	EClass getStandardLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.language.StandardLanguage#getStandardLanguageId <em>Standard Language Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Language Id</em>'.
	 * @see org.abchip.mimo.biz.common.language.StandardLanguage#getStandardLanguageId()
	 * @see #getStandardLanguage()
	 * @generated
	 */
	EAttribute getStandardLanguage_StandardLanguageId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.language.StandardLanguage#getLangCharset <em>Lang Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang Charset</em>'.
	 * @see org.abchip.mimo.biz.common.language.StandardLanguage#getLangCharset()
	 * @see #getStandardLanguage()
	 * @generated
	 */
	EAttribute getStandardLanguage_LangCharset();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.language.StandardLanguage#getLangCode2 <em>Lang Code2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang Code2</em>'.
	 * @see org.abchip.mimo.biz.common.language.StandardLanguage#getLangCode2()
	 * @see #getStandardLanguage()
	 * @generated
	 */
	EAttribute getStandardLanguage_LangCode2();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.language.StandardLanguage#getLangCode3b <em>Lang Code3b</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang Code3b</em>'.
	 * @see org.abchip.mimo.biz.common.language.StandardLanguage#getLangCode3b()
	 * @see #getStandardLanguage()
	 * @generated
	 */
	EAttribute getStandardLanguage_LangCode3b();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.language.StandardLanguage#getLangCode3t <em>Lang Code3t</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang Code3t</em>'.
	 * @see org.abchip.mimo.biz.common.language.StandardLanguage#getLangCode3t()
	 * @see #getStandardLanguage()
	 * @generated
	 */
	EAttribute getStandardLanguage_LangCode3t();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.language.StandardLanguage#getLangFamily <em>Lang Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang Family</em>'.
	 * @see org.abchip.mimo.biz.common.language.StandardLanguage#getLangFamily()
	 * @see #getStandardLanguage()
	 * @generated
	 */
	EAttribute getStandardLanguage_LangFamily();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.language.StandardLanguage#getLangName <em>Lang Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang Name</em>'.
	 * @see org.abchip.mimo.biz.common.language.StandardLanguage#getLangName()
	 * @see #getStandardLanguage()
	 * @generated
	 */
	EAttribute getStandardLanguage_LangName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LanguageFactory getLanguageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.language.impl.StandardLanguageImpl <em>Standard Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.language.impl.StandardLanguageImpl
		 * @see org.abchip.mimo.biz.common.language.impl.LanguagePackageImpl#getStandardLanguage()
		 * @generated
		 */
		EClass STANDARD_LANGUAGE = eINSTANCE.getStandardLanguage();

		/**
		 * The meta object literal for the '<em><b>Standard Language Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_LANGUAGE__STANDARD_LANGUAGE_ID = eINSTANCE.getStandardLanguage_StandardLanguageId();

		/**
		 * The meta object literal for the '<em><b>Lang Charset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_LANGUAGE__LANG_CHARSET = eINSTANCE.getStandardLanguage_LangCharset();

		/**
		 * The meta object literal for the '<em><b>Lang Code2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_LANGUAGE__LANG_CODE2 = eINSTANCE.getStandardLanguage_LangCode2();

		/**
		 * The meta object literal for the '<em><b>Lang Code3b</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_LANGUAGE__LANG_CODE3B = eINSTANCE.getStandardLanguage_LangCode3b();

		/**
		 * The meta object literal for the '<em><b>Lang Code3t</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_LANGUAGE__LANG_CODE3T = eINSTANCE.getStandardLanguage_LangCode3t();

		/**
		 * The meta object literal for the '<em><b>Lang Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_LANGUAGE__LANG_FAMILY = eINSTANCE.getStandardLanguage_LangFamily();

		/**
		 * The meta object literal for the '<em><b>Lang Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_LANGUAGE__LANG_NAME = eINSTANCE.getStandardLanguage_LangName();

	}

} //LanguagePackage
