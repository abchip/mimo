/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.keyword;

import org.abchip.mimo.biz.BizPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.abchip.mimo.biz.common.keyword.KeywordFactory
 * @model kind="package"
 * @generated
 */
public interface KeywordPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "keyword";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/common/keyword";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-keyword";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KeywordPackage eINSTANCE = org.abchip.mimo.biz.common.keyword.impl.KeywordPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.keyword.impl.KeywordThesaurusImpl <em>Thesaurus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.keyword.impl.KeywordThesaurusImpl
	 * @see org.abchip.mimo.biz.common.keyword.impl.KeywordPackageImpl#getKeywordThesaurus()
	 * @generated
	 */
	int KEYWORD_THESAURUS = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_THESAURUS__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_THESAURUS__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_THESAURUS__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_THESAURUS__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Alternate Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_THESAURUS__ALTERNATE_KEYWORD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entered Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_THESAURUS__ENTERED_KEYWORD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relationship Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_THESAURUS__RELATIONSHIP_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Thesaurus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_THESAURUS_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.keyword.KeywordThesaurus <em>Thesaurus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thesaurus</em>'.
	 * @see org.abchip.mimo.biz.common.keyword.KeywordThesaurus
	 * @generated
	 */
	EClass getKeywordThesaurus();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.keyword.KeywordThesaurus#getEnteredKeyword <em>Entered Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entered Keyword</em>'.
	 * @see org.abchip.mimo.biz.common.keyword.KeywordThesaurus#getEnteredKeyword()
	 * @see #getKeywordThesaurus()
	 * @generated
	 */
	EAttribute getKeywordThesaurus_EnteredKeyword();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.keyword.KeywordThesaurus#getAlternateKeyword <em>Alternate Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alternate Keyword</em>'.
	 * @see org.abchip.mimo.biz.common.keyword.KeywordThesaurus#getAlternateKeyword()
	 * @see #getKeywordThesaurus()
	 * @generated
	 */
	EAttribute getKeywordThesaurus_AlternateKeyword();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.keyword.KeywordThesaurus#getRelationshipEnumId <em>Relationship Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relationship Enum Id</em>'.
	 * @see org.abchip.mimo.biz.common.keyword.KeywordThesaurus#getRelationshipEnumId()
	 * @see #getKeywordThesaurus()
	 * @generated
	 */
	EReference getKeywordThesaurus_RelationshipEnumId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KeywordFactory getKeywordFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.keyword.impl.KeywordThesaurusImpl <em>Thesaurus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.keyword.impl.KeywordThesaurusImpl
		 * @see org.abchip.mimo.biz.common.keyword.impl.KeywordPackageImpl#getKeywordThesaurus()
		 * @generated
		 */
		EClass KEYWORD_THESAURUS = eINSTANCE.getKeywordThesaurus();

		/**
		 * The meta object literal for the '<em><b>Entered Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYWORD_THESAURUS__ENTERED_KEYWORD = eINSTANCE.getKeywordThesaurus_EnteredKeyword();

		/**
		 * The meta object literal for the '<em><b>Alternate Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYWORD_THESAURUS__ALTERNATE_KEYWORD = eINSTANCE.getKeywordThesaurus_AlternateKeyword();

		/**
		 * The meta object literal for the '<em><b>Relationship Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEYWORD_THESAURUS__RELATIONSHIP_ENUM_ID = eINSTANCE.getKeywordThesaurus_RelationshipEnumId();

	}

} //KeywordPackage
