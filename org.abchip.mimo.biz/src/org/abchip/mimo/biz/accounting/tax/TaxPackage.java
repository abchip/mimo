/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.tax;

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
 * @see org.abchip.mimo.biz.accounting.tax.TaxFactory
 * @model kind="package"
 * @generated
 */
public interface TaxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tax";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/accounting/tax";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-tax";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaxPackage eINSTANCE = org.abchip.mimo.biz.accounting.tax.impl.TaxPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.tax.impl.PartyTaxAuthInfoImpl <em>Party Tax Auth Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.tax.impl.PartyTaxAuthInfoImpl
	 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxPackageImpl#getPartyTaxAuthInfo()
	 * @generated
	 */
	int PARTY_TAX_AUTH_INFO = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TAX_AUTH_INFO__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TAX_AUTH_INFO__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TAX_AUTH_INFO__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TAX_AUTH_INFO__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TAX_AUTH_INFO__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TAX_AUTH_INFO__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tax Auth Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TAX_AUTH_INFO__TAX_AUTH_GEO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tax Auth Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TAX_AUTH_INFO__TAX_AUTH_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Exempt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TAX_AUTH_INFO__IS_EXEMPT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Nexus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TAX_AUTH_INFO__IS_NEXUS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Party Tax Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TAX_AUTH_INFO__PARTY_TAX_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TAX_AUTH_INFO__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Party Tax Auth Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TAX_AUTH_INFO_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityImpl <em>Authority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityImpl
	 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxPackageImpl#getTaxAuthority()
	 * @generated
	 */
	int TAX_AUTHORITY = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Tax Auth Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY__TAX_AUTH_GEO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tax Auth Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY__TAX_AUTH_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Include Tax In Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY__INCLUDE_TAX_IN_PRICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Require Tax Id For Exemption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY__REQUIRE_TAX_ID_FOR_EXEMPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tax Id Format Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY__TAX_ID_FORMAT_PATTERN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Authority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityAssocImpl <em>Authority Assoc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityAssocImpl
	 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxPackageImpl#getTaxAuthorityAssoc()
	 * @generated
	 */
	int TAX_AUTHORITY_ASSOC = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_ASSOC__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_ASSOC__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_ASSOC__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_ASSOC__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_ASSOC__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tax Auth Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_ASSOC__TAX_AUTH_GEO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tax Auth Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_ASSOC__TAX_AUTH_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>To Tax Auth Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_ASSOC__TO_TAX_AUTH_GEO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>To Tax Auth Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_ASSOC__TO_TAX_AUTH_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tax Authority Assoc Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_ASSOC__TAX_AUTHORITY_ASSOC_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_ASSOC__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Authority Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_ASSOC_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityAssocTypeImpl <em>Authority Assoc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityAssocTypeImpl
	 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxPackageImpl#getTaxAuthorityAssocType()
	 * @generated
	 */
	int TAX_AUTHORITY_ASSOC_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_ASSOC_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_ASSOC_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_ASSOC_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_ASSOC_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Tax Authority Assoc Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_ASSOC_TYPE__TAX_AUTHORITY_ASSOC_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_ASSOC_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Authority Assoc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_ASSOC_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityCategoryImpl <em>Authority Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityCategoryImpl
	 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxPackageImpl#getTaxAuthorityCategory()
	 * @generated
	 */
	int TAX_AUTHORITY_CATEGORY = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_CATEGORY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_CATEGORY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_CATEGORY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_CATEGORY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Category Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_CATEGORY__PRODUCT_CATEGORY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tax Auth Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_CATEGORY__TAX_AUTH_GEO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tax Auth Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_CATEGORY__TAX_AUTH_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Authority Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_CATEGORY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityGlAccountImpl <em>Authority Gl Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityGlAccountImpl
	 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxPackageImpl#getTaxAuthorityGlAccount()
	 * @generated
	 */
	int TAX_AUTHORITY_GL_ACCOUNT = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_GL_ACCOUNT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_GL_ACCOUNT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_GL_ACCOUNT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_GL_ACCOUNT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Organization Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_GL_ACCOUNT__ORGANIZATION_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tax Auth Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_GL_ACCOUNT__TAX_AUTH_GEO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tax Auth Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_GL_ACCOUNT__TAX_AUTH_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_GL_ACCOUNT__GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Authority Gl Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_GL_ACCOUNT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateProductImpl <em>Authority Rate Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateProductImpl
	 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxPackageImpl#getTaxAuthorityRateProduct()
	 * @generated
	 */
	int TAX_AUTHORITY_RATE_PRODUCT = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_PRODUCT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_PRODUCT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_PRODUCT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_PRODUCT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Tax Authority Rate Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTHORITY_RATE_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_PRODUCT__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_PRODUCT__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Tax In Shipping Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_PRODUCT__IS_TAX_IN_SHIPPING_PRICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min Item Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_PRODUCT__MIN_ITEM_PRICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Purchase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_PRODUCT__MIN_PURCHASE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Product Category Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_PRODUCT__PRODUCT_CATEGORY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_PRODUCT__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Tax Auth Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTH_GEO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Tax Auth Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTH_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Tax Authority Rate Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTHORITY_RATE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Tax Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_PRODUCT__TAX_PERCENTAGE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Tax Promotions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_PRODUCT__TAX_PROMOTIONS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Tax Shipping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_PRODUCT__TAX_SHIPPING = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_PRODUCT__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Title Transfer Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_PRODUCT__TITLE_TRANSFER_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Authority Rate Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_PRODUCT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateTypeImpl <em>Authority Rate Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateTypeImpl
	 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxPackageImpl#getTaxAuthorityRateType()
	 * @generated
	 */
	int TAX_AUTHORITY_RATE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Tax Authority Rate Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_TYPE__TAX_AUTHORITY_RATE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Authority Rate Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_AUTHORITY_RATE_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesRuleLookupImpl <em>Zip Sales Rule Lookup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.tax.impl.ZipSalesRuleLookupImpl
	 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxPackageImpl#getZipSalesRuleLookup()
	 * @generated
	 */
	int ZIP_SALES_RULE_LOOKUP = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_RULE_LOOKUP__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_RULE_LOOKUP__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_RULE_LOOKUP__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_RULE_LOOKUP__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_RULE_LOOKUP__CITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>County</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_RULE_LOOKUP__COUNTY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_RULE_LOOKUP__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_RULE_LOOKUP__STATE_CODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_RULE_LOOKUP__ID_CODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ship Cond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_RULE_LOOKUP__SHIP_COND = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Taxable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_RULE_LOOKUP__TAXABLE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Zip Sales Rule Lookup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_RULE_LOOKUP_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl <em>Zip Sales Tax Lookup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl
	 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxPackageImpl#getZipSalesTaxLookup()
	 * @generated
	 */
	int ZIP_SALES_TAX_LOOKUP = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__CITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>County</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__COUNTY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__STATE_CODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Zip Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__ZIP_CODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>City Local Sales Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__CITY_LOCAL_SALES_TAX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>City Local Use Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__CITY_LOCAL_USE_TAX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>City Sales Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__CITY_SALES_TAX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>City Use Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__CITY_USE_TAX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Combo Sales Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__COMBO_SALES_TAX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Combo Use Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__COMBO_USE_TAX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>County Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__COUNTY_DEFAULT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>County Fips</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__COUNTY_FIPS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>County Local Sales Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__COUNTY_LOCAL_SALES_TAX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>County Local Use Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__COUNTY_LOCAL_USE_TAX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>County Sales Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__COUNTY_SALES_TAX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>County Use Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__COUNTY_USE_TAX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>General Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__GENERAL_DEFAULT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Geo Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__GEO_CODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Inside City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__INSIDE_CITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>State Sales Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__STATE_SALES_TAX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>State Use Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP__STATE_USE_TAX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Zip Sales Tax Lookup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZIP_SALES_TAX_LOOKUP_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 22;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo <em>Party Tax Auth Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party Tax Auth Info</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo
	 * @generated
	 */
	EClass getPartyTaxAuthInfo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#getPartyId()
	 * @see #getPartyTaxAuthInfo()
	 * @generated
	 */
	EReference getPartyTaxAuthInfo_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Auth Geo Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#getTaxAuthGeoId()
	 * @see #getPartyTaxAuthInfo()
	 * @generated
	 */
	EAttribute getPartyTaxAuthInfo_TaxAuthGeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#getTaxAuthPartyId <em>Tax Auth Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Auth Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#getTaxAuthPartyId()
	 * @see #getPartyTaxAuthInfo()
	 * @generated
	 */
	EAttribute getPartyTaxAuthInfo_TaxAuthPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#getFromDate()
	 * @see #getPartyTaxAuthInfo()
	 * @generated
	 */
	EAttribute getPartyTaxAuthInfo_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#isIsExempt <em>Is Exempt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Exempt</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#isIsExempt()
	 * @see #getPartyTaxAuthInfo()
	 * @generated
	 */
	EAttribute getPartyTaxAuthInfo_IsExempt();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#isIsNexus <em>Is Nexus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Nexus</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#isIsNexus()
	 * @see #getPartyTaxAuthInfo()
	 * @generated
	 */
	EAttribute getPartyTaxAuthInfo_IsNexus();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#getPartyTaxId <em>Party Tax Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Tax Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#getPartyTaxId()
	 * @see #getPartyTaxAuthInfo()
	 * @generated
	 */
	EAttribute getPartyTaxAuthInfo_PartyTaxId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#getThruDate()
	 * @see #getPartyTaxAuthInfo()
	 * @generated
	 */
	EAttribute getPartyTaxAuthInfo_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthority <em>Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authority</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthority
	 * @generated
	 */
	EClass getTaxAuthority();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthority#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tax Auth Geo Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthority#getTaxAuthGeoId()
	 * @see #getTaxAuthority()
	 * @generated
	 */
	EReference getTaxAuthority_TaxAuthGeoId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthority#getTaxAuthPartyId <em>Tax Auth Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tax Auth Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthority#getTaxAuthPartyId()
	 * @see #getTaxAuthority()
	 * @generated
	 */
	EReference getTaxAuthority_TaxAuthPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthority#isIncludeTaxInPrice <em>Include Tax In Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Tax In Price</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthority#isIncludeTaxInPrice()
	 * @see #getTaxAuthority()
	 * @generated
	 */
	EAttribute getTaxAuthority_IncludeTaxInPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthority#isRequireTaxIdForExemption <em>Require Tax Id For Exemption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Require Tax Id For Exemption</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthority#isRequireTaxIdForExemption()
	 * @see #getTaxAuthority()
	 * @generated
	 */
	EAttribute getTaxAuthority_RequireTaxIdForExemption();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthority#getTaxIdFormatPattern <em>Tax Id Format Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Id Format Pattern</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthority#getTaxIdFormatPattern()
	 * @see #getTaxAuthority()
	 * @generated
	 */
	EAttribute getTaxAuthority_TaxIdFormatPattern();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc <em>Authority Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authority Assoc</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc
	 * @generated
	 */
	EClass getTaxAuthorityAssoc();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Auth Geo Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getTaxAuthGeoId()
	 * @see #getTaxAuthorityAssoc()
	 * @generated
	 */
	EAttribute getTaxAuthorityAssoc_TaxAuthGeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getTaxAuthPartyId <em>Tax Auth Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Auth Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getTaxAuthPartyId()
	 * @see #getTaxAuthorityAssoc()
	 * @generated
	 */
	EAttribute getTaxAuthorityAssoc_TaxAuthPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getToTaxAuthGeoId <em>To Tax Auth Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Tax Auth Geo Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getToTaxAuthGeoId()
	 * @see #getTaxAuthorityAssoc()
	 * @generated
	 */
	EAttribute getTaxAuthorityAssoc_ToTaxAuthGeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getToTaxAuthPartyId <em>To Tax Auth Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Tax Auth Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getToTaxAuthPartyId()
	 * @see #getTaxAuthorityAssoc()
	 * @generated
	 */
	EAttribute getTaxAuthorityAssoc_ToTaxAuthPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getFromDate()
	 * @see #getTaxAuthorityAssoc()
	 * @generated
	 */
	EAttribute getTaxAuthorityAssoc_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getTaxAuthorityAssocTypeId <em>Tax Authority Assoc Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tax Authority Assoc Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getTaxAuthorityAssocTypeId()
	 * @see #getTaxAuthorityAssoc()
	 * @generated
	 */
	EReference getTaxAuthorityAssoc_TaxAuthorityAssocTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getThruDate()
	 * @see #getTaxAuthorityAssoc()
	 * @generated
	 */
	EAttribute getTaxAuthorityAssoc_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssocType <em>Authority Assoc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authority Assoc Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssocType
	 * @generated
	 */
	EClass getTaxAuthorityAssocType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssocType#getTaxAuthorityAssocTypeId <em>Tax Authority Assoc Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Authority Assoc Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssocType#getTaxAuthorityAssocTypeId()
	 * @see #getTaxAuthorityAssocType()
	 * @generated
	 */
	EAttribute getTaxAuthorityAssocType_TaxAuthorityAssocTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssocType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssocType#getDescription()
	 * @see #getTaxAuthorityAssocType()
	 * @generated
	 */
	EAttribute getTaxAuthorityAssocType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityCategory <em>Authority Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authority Category</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityCategory
	 * @generated
	 */
	EClass getTaxAuthorityCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityCategory#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Auth Geo Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityCategory#getTaxAuthGeoId()
	 * @see #getTaxAuthorityCategory()
	 * @generated
	 */
	EAttribute getTaxAuthorityCategory_TaxAuthGeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityCategory#getTaxAuthPartyId <em>Tax Auth Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Auth Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityCategory#getTaxAuthPartyId()
	 * @see #getTaxAuthorityCategory()
	 * @generated
	 */
	EAttribute getTaxAuthorityCategory_TaxAuthPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityCategory#getProductCategoryId <em>Product Category Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Category Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityCategory#getProductCategoryId()
	 * @see #getTaxAuthorityCategory()
	 * @generated
	 */
	EReference getTaxAuthorityCategory_ProductCategoryId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityGlAccount <em>Authority Gl Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authority Gl Account</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityGlAccount
	 * @generated
	 */
	EClass getTaxAuthorityGlAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityGlAccount#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Auth Geo Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityGlAccount#getTaxAuthGeoId()
	 * @see #getTaxAuthorityGlAccount()
	 * @generated
	 */
	EAttribute getTaxAuthorityGlAccount_TaxAuthGeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityGlAccount#getTaxAuthPartyId <em>Tax Auth Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Auth Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityGlAccount#getTaxAuthPartyId()
	 * @see #getTaxAuthorityGlAccount()
	 * @generated
	 */
	EAttribute getTaxAuthorityGlAccount_TaxAuthPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityGlAccount#getOrganizationPartyId <em>Organization Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityGlAccount#getOrganizationPartyId()
	 * @see #getTaxAuthorityGlAccount()
	 * @generated
	 */
	EReference getTaxAuthorityGlAccount_OrganizationPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityGlAccount#getGlAccountId <em>Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityGlAccount#getGlAccountId()
	 * @see #getTaxAuthorityGlAccount()
	 * @generated
	 */
	EReference getTaxAuthorityGlAccount_GlAccountId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct <em>Authority Rate Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authority Rate Product</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct
	 * @generated
	 */
	EClass getTaxAuthorityRateProduct();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getTaxAuthorityRateSeqId <em>Tax Authority Rate Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Authority Rate Seq Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getTaxAuthorityRateSeqId()
	 * @see #getTaxAuthorityRateProduct()
	 * @generated
	 */
	EAttribute getTaxAuthorityRateProduct_TaxAuthorityRateSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getDescription()
	 * @see #getTaxAuthorityRateProduct()
	 * @generated
	 */
	EAttribute getTaxAuthorityRateProduct_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getFromDate()
	 * @see #getTaxAuthorityRateProduct()
	 * @generated
	 */
	EAttribute getTaxAuthorityRateProduct_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#isIsTaxInShippingPrice <em>Is Tax In Shipping Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Tax In Shipping Price</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#isIsTaxInShippingPrice()
	 * @see #getTaxAuthorityRateProduct()
	 * @generated
	 */
	EAttribute getTaxAuthorityRateProduct_IsTaxInShippingPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getMinItemPrice <em>Min Item Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Item Price</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getMinItemPrice()
	 * @see #getTaxAuthorityRateProduct()
	 * @generated
	 */
	EAttribute getTaxAuthorityRateProduct_MinItemPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getMinPurchase <em>Min Purchase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Purchase</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getMinPurchase()
	 * @see #getTaxAuthorityRateProduct()
	 * @generated
	 */
	EAttribute getTaxAuthorityRateProduct_MinPurchase();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getProductCategoryId <em>Product Category Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Category Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getProductCategoryId()
	 * @see #getTaxAuthorityRateProduct()
	 * @generated
	 */
	EReference getTaxAuthorityRateProduct_ProductCategoryId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getProductStoreId()
	 * @see #getTaxAuthorityRateProduct()
	 * @generated
	 */
	EReference getTaxAuthorityRateProduct_ProductStoreId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Auth Geo Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getTaxAuthGeoId()
	 * @see #getTaxAuthorityRateProduct()
	 * @generated
	 */
	EAttribute getTaxAuthorityRateProduct_TaxAuthGeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getTaxAuthPartyId <em>Tax Auth Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Auth Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getTaxAuthPartyId()
	 * @see #getTaxAuthorityRateProduct()
	 * @generated
	 */
	EAttribute getTaxAuthorityRateProduct_TaxAuthPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getTaxAuthorityRateTypeId <em>Tax Authority Rate Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tax Authority Rate Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getTaxAuthorityRateTypeId()
	 * @see #getTaxAuthorityRateProduct()
	 * @generated
	 */
	EReference getTaxAuthorityRateProduct_TaxAuthorityRateTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getTaxPercentage <em>Tax Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Percentage</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getTaxPercentage()
	 * @see #getTaxAuthorityRateProduct()
	 * @generated
	 */
	EAttribute getTaxAuthorityRateProduct_TaxPercentage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#isTaxPromotions <em>Tax Promotions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Promotions</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#isTaxPromotions()
	 * @see #getTaxAuthorityRateProduct()
	 * @generated
	 */
	EAttribute getTaxAuthorityRateProduct_TaxPromotions();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#isTaxShipping <em>Tax Shipping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Shipping</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#isTaxShipping()
	 * @see #getTaxAuthorityRateProduct()
	 * @generated
	 */
	EAttribute getTaxAuthorityRateProduct_TaxShipping();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getThruDate()
	 * @see #getTaxAuthorityRateProduct()
	 * @generated
	 */
	EAttribute getTaxAuthorityRateProduct_ThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getTitleTransferEnumId <em>Title Transfer Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Transfer Enum Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getTitleTransferEnumId()
	 * @see #getTaxAuthorityRateProduct()
	 * @generated
	 */
	EAttribute getTaxAuthorityRateProduct_TitleTransferEnumId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateType <em>Authority Rate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authority Rate Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateType
	 * @generated
	 */
	EClass getTaxAuthorityRateType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateType#getTaxAuthorityRateTypeId <em>Tax Authority Rate Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Authority Rate Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateType#getTaxAuthorityRateTypeId()
	 * @see #getTaxAuthorityRateType()
	 * @generated
	 */
	EAttribute getTaxAuthorityRateType_TaxAuthorityRateTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateType#getDescription()
	 * @see #getTaxAuthorityRateType()
	 * @generated
	 */
	EAttribute getTaxAuthorityRateType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup <em>Zip Sales Rule Lookup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zip Sales Rule Lookup</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup
	 * @generated
	 */
	EClass getZipSalesRuleLookup();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getStateCode <em>State Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Code</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getStateCode()
	 * @see #getZipSalesRuleLookup()
	 * @generated
	 */
	EAttribute getZipSalesRuleLookup_StateCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getCity()
	 * @see #getZipSalesRuleLookup()
	 * @generated
	 */
	EAttribute getZipSalesRuleLookup_City();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getCounty <em>County</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>County</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getCounty()
	 * @see #getZipSalesRuleLookup()
	 * @generated
	 */
	EAttribute getZipSalesRuleLookup_County();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getFromDate()
	 * @see #getZipSalesRuleLookup()
	 * @generated
	 */
	EAttribute getZipSalesRuleLookup_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getIdCode <em>Id Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Code</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getIdCode()
	 * @see #getZipSalesRuleLookup()
	 * @generated
	 */
	EAttribute getZipSalesRuleLookup_IdCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getShipCond <em>Ship Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ship Cond</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getShipCond()
	 * @see #getZipSalesRuleLookup()
	 * @generated
	 */
	EAttribute getZipSalesRuleLookup_ShipCond();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getTaxable <em>Taxable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taxable</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getTaxable()
	 * @see #getZipSalesRuleLookup()
	 * @generated
	 */
	EAttribute getZipSalesRuleLookup_Taxable();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup <em>Zip Sales Tax Lookup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zip Sales Tax Lookup</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup
	 * @generated
	 */
	EClass getZipSalesTaxLookup();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getZipCode <em>Zip Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip Code</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getZipCode()
	 * @see #getZipSalesTaxLookup()
	 * @generated
	 */
	EAttribute getZipSalesTaxLookup_ZipCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getStateCode <em>State Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Code</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getStateCode()
	 * @see #getZipSalesTaxLookup()
	 * @generated
	 */
	EAttribute getZipSalesTaxLookup_StateCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCity()
	 * @see #getZipSalesTaxLookup()
	 * @generated
	 */
	EAttribute getZipSalesTaxLookup_City();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCounty <em>County</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>County</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCounty()
	 * @see #getZipSalesTaxLookup()
	 * @generated
	 */
	EAttribute getZipSalesTaxLookup_County();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getFromDate()
	 * @see #getZipSalesTaxLookup()
	 * @generated
	 */
	EAttribute getZipSalesTaxLookup_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCityLocalSalesTax <em>City Local Sales Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City Local Sales Tax</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCityLocalSalesTax()
	 * @see #getZipSalesTaxLookup()
	 * @generated
	 */
	EAttribute getZipSalesTaxLookup_CityLocalSalesTax();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCityLocalUseTax <em>City Local Use Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City Local Use Tax</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCityLocalUseTax()
	 * @see #getZipSalesTaxLookup()
	 * @generated
	 */
	EAttribute getZipSalesTaxLookup_CityLocalUseTax();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCitySalesTax <em>City Sales Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City Sales Tax</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCitySalesTax()
	 * @see #getZipSalesTaxLookup()
	 * @generated
	 */
	EAttribute getZipSalesTaxLookup_CitySalesTax();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCityUseTax <em>City Use Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City Use Tax</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCityUseTax()
	 * @see #getZipSalesTaxLookup()
	 * @generated
	 */
	EAttribute getZipSalesTaxLookup_CityUseTax();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getComboSalesTax <em>Combo Sales Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Combo Sales Tax</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getComboSalesTax()
	 * @see #getZipSalesTaxLookup()
	 * @generated
	 */
	EAttribute getZipSalesTaxLookup_ComboSalesTax();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getComboUseTax <em>Combo Use Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Combo Use Tax</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getComboUseTax()
	 * @see #getZipSalesTaxLookup()
	 * @generated
	 */
	EAttribute getZipSalesTaxLookup_ComboUseTax();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCountyDefault <em>County Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>County Default</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCountyDefault()
	 * @see #getZipSalesTaxLookup()
	 * @generated
	 */
	EAttribute getZipSalesTaxLookup_CountyDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCountyFips <em>County Fips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>County Fips</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCountyFips()
	 * @see #getZipSalesTaxLookup()
	 * @generated
	 */
	EAttribute getZipSalesTaxLookup_CountyFips();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCountyLocalSalesTax <em>County Local Sales Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>County Local Sales Tax</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCountyLocalSalesTax()
	 * @see #getZipSalesTaxLookup()
	 * @generated
	 */
	EAttribute getZipSalesTaxLookup_CountyLocalSalesTax();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCountyLocalUseTax <em>County Local Use Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>County Local Use Tax</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCountyLocalUseTax()
	 * @see #getZipSalesTaxLookup()
	 * @generated
	 */
	EAttribute getZipSalesTaxLookup_CountyLocalUseTax();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCountySalesTax <em>County Sales Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>County Sales Tax</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCountySalesTax()
	 * @see #getZipSalesTaxLookup()
	 * @generated
	 */
	EAttribute getZipSalesTaxLookup_CountySalesTax();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCountyUseTax <em>County Use Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>County Use Tax</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCountyUseTax()
	 * @see #getZipSalesTaxLookup()
	 * @generated
	 */
	EAttribute getZipSalesTaxLookup_CountyUseTax();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getGeneralDefault <em>General Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>General Default</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getGeneralDefault()
	 * @see #getZipSalesTaxLookup()
	 * @generated
	 */
	EAttribute getZipSalesTaxLookup_GeneralDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getGeoCode <em>Geo Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geo Code</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getGeoCode()
	 * @see #getZipSalesTaxLookup()
	 * @generated
	 */
	EAttribute getZipSalesTaxLookup_GeoCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#isInsideCity <em>Inside City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inside City</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#isInsideCity()
	 * @see #getZipSalesTaxLookup()
	 * @generated
	 */
	EAttribute getZipSalesTaxLookup_InsideCity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getStateSalesTax <em>State Sales Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Sales Tax</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getStateSalesTax()
	 * @see #getZipSalesTaxLookup()
	 * @generated
	 */
	EAttribute getZipSalesTaxLookup_StateSalesTax();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getStateUseTax <em>State Use Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Use Tax</em>'.
	 * @see org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getStateUseTax()
	 * @see #getZipSalesTaxLookup()
	 * @generated
	 */
	EAttribute getZipSalesTaxLookup_StateUseTax();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TaxFactory getTaxFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.tax.impl.PartyTaxAuthInfoImpl <em>Party Tax Auth Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.tax.impl.PartyTaxAuthInfoImpl
		 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxPackageImpl#getPartyTaxAuthInfo()
		 * @generated
		 */
		EClass PARTY_TAX_AUTH_INFO = eINSTANCE.getPartyTaxAuthInfo();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_TAX_AUTH_INFO__PARTY_ID = eINSTANCE.getPartyTaxAuthInfo_PartyId();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Geo Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_TAX_AUTH_INFO__TAX_AUTH_GEO_ID = eINSTANCE.getPartyTaxAuthInfo_TaxAuthGeoId();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_TAX_AUTH_INFO__TAX_AUTH_PARTY_ID = eINSTANCE.getPartyTaxAuthInfo_TaxAuthPartyId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_TAX_AUTH_INFO__FROM_DATE = eINSTANCE.getPartyTaxAuthInfo_FromDate();

		/**
		 * The meta object literal for the '<em><b>Is Exempt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_TAX_AUTH_INFO__IS_EXEMPT = eINSTANCE.getPartyTaxAuthInfo_IsExempt();

		/**
		 * The meta object literal for the '<em><b>Is Nexus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_TAX_AUTH_INFO__IS_NEXUS = eINSTANCE.getPartyTaxAuthInfo_IsNexus();

		/**
		 * The meta object literal for the '<em><b>Party Tax Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_TAX_AUTH_INFO__PARTY_TAX_ID = eINSTANCE.getPartyTaxAuthInfo_PartyTaxId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_TAX_AUTH_INFO__THRU_DATE = eINSTANCE.getPartyTaxAuthInfo_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityImpl <em>Authority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityImpl
		 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxPackageImpl#getTaxAuthority()
		 * @generated
		 */
		EClass TAX_AUTHORITY = eINSTANCE.getTaxAuthority();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Geo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAX_AUTHORITY__TAX_AUTH_GEO_ID = eINSTANCE.getTaxAuthority_TaxAuthGeoId();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAX_AUTHORITY__TAX_AUTH_PARTY_ID = eINSTANCE.getTaxAuthority_TaxAuthPartyId();

		/**
		 * The meta object literal for the '<em><b>Include Tax In Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY__INCLUDE_TAX_IN_PRICE = eINSTANCE.getTaxAuthority_IncludeTaxInPrice();

		/**
		 * The meta object literal for the '<em><b>Require Tax Id For Exemption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY__REQUIRE_TAX_ID_FOR_EXEMPTION = eINSTANCE.getTaxAuthority_RequireTaxIdForExemption();

		/**
		 * The meta object literal for the '<em><b>Tax Id Format Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY__TAX_ID_FORMAT_PATTERN = eINSTANCE.getTaxAuthority_TaxIdFormatPattern();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityAssocImpl <em>Authority Assoc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityAssocImpl
		 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxPackageImpl#getTaxAuthorityAssoc()
		 * @generated
		 */
		EClass TAX_AUTHORITY_ASSOC = eINSTANCE.getTaxAuthorityAssoc();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Geo Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_ASSOC__TAX_AUTH_GEO_ID = eINSTANCE.getTaxAuthorityAssoc_TaxAuthGeoId();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_ASSOC__TAX_AUTH_PARTY_ID = eINSTANCE.getTaxAuthorityAssoc_TaxAuthPartyId();

		/**
		 * The meta object literal for the '<em><b>To Tax Auth Geo Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_ASSOC__TO_TAX_AUTH_GEO_ID = eINSTANCE.getTaxAuthorityAssoc_ToTaxAuthGeoId();

		/**
		 * The meta object literal for the '<em><b>To Tax Auth Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_ASSOC__TO_TAX_AUTH_PARTY_ID = eINSTANCE.getTaxAuthorityAssoc_ToTaxAuthPartyId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_ASSOC__FROM_DATE = eINSTANCE.getTaxAuthorityAssoc_FromDate();

		/**
		 * The meta object literal for the '<em><b>Tax Authority Assoc Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAX_AUTHORITY_ASSOC__TAX_AUTHORITY_ASSOC_TYPE_ID = eINSTANCE.getTaxAuthorityAssoc_TaxAuthorityAssocTypeId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_ASSOC__THRU_DATE = eINSTANCE.getTaxAuthorityAssoc_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityAssocTypeImpl <em>Authority Assoc Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityAssocTypeImpl
		 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxPackageImpl#getTaxAuthorityAssocType()
		 * @generated
		 */
		EClass TAX_AUTHORITY_ASSOC_TYPE = eINSTANCE.getTaxAuthorityAssocType();

		/**
		 * The meta object literal for the '<em><b>Tax Authority Assoc Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_ASSOC_TYPE__TAX_AUTHORITY_ASSOC_TYPE_ID = eINSTANCE.getTaxAuthorityAssocType_TaxAuthorityAssocTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_ASSOC_TYPE__DESCRIPTION = eINSTANCE.getTaxAuthorityAssocType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityCategoryImpl <em>Authority Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityCategoryImpl
		 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxPackageImpl#getTaxAuthorityCategory()
		 * @generated
		 */
		EClass TAX_AUTHORITY_CATEGORY = eINSTANCE.getTaxAuthorityCategory();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Geo Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_CATEGORY__TAX_AUTH_GEO_ID = eINSTANCE.getTaxAuthorityCategory_TaxAuthGeoId();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_CATEGORY__TAX_AUTH_PARTY_ID = eINSTANCE.getTaxAuthorityCategory_TaxAuthPartyId();

		/**
		 * The meta object literal for the '<em><b>Product Category Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAX_AUTHORITY_CATEGORY__PRODUCT_CATEGORY_ID = eINSTANCE.getTaxAuthorityCategory_ProductCategoryId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityGlAccountImpl <em>Authority Gl Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityGlAccountImpl
		 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxPackageImpl#getTaxAuthorityGlAccount()
		 * @generated
		 */
		EClass TAX_AUTHORITY_GL_ACCOUNT = eINSTANCE.getTaxAuthorityGlAccount();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Geo Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_GL_ACCOUNT__TAX_AUTH_GEO_ID = eINSTANCE.getTaxAuthorityGlAccount_TaxAuthGeoId();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_GL_ACCOUNT__TAX_AUTH_PARTY_ID = eINSTANCE.getTaxAuthorityGlAccount_TaxAuthPartyId();

		/**
		 * The meta object literal for the '<em><b>Organization Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAX_AUTHORITY_GL_ACCOUNT__ORGANIZATION_PARTY_ID = eINSTANCE.getTaxAuthorityGlAccount_OrganizationPartyId();

		/**
		 * The meta object literal for the '<em><b>Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAX_AUTHORITY_GL_ACCOUNT__GL_ACCOUNT_ID = eINSTANCE.getTaxAuthorityGlAccount_GlAccountId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateProductImpl <em>Authority Rate Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateProductImpl
		 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxPackageImpl#getTaxAuthorityRateProduct()
		 * @generated
		 */
		EClass TAX_AUTHORITY_RATE_PRODUCT = eINSTANCE.getTaxAuthorityRateProduct();

		/**
		 * The meta object literal for the '<em><b>Tax Authority Rate Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTHORITY_RATE_SEQ_ID = eINSTANCE.getTaxAuthorityRateProduct_TaxAuthorityRateSeqId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_RATE_PRODUCT__DESCRIPTION = eINSTANCE.getTaxAuthorityRateProduct_Description();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_RATE_PRODUCT__FROM_DATE = eINSTANCE.getTaxAuthorityRateProduct_FromDate();

		/**
		 * The meta object literal for the '<em><b>Is Tax In Shipping Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_RATE_PRODUCT__IS_TAX_IN_SHIPPING_PRICE = eINSTANCE.getTaxAuthorityRateProduct_IsTaxInShippingPrice();

		/**
		 * The meta object literal for the '<em><b>Min Item Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_RATE_PRODUCT__MIN_ITEM_PRICE = eINSTANCE.getTaxAuthorityRateProduct_MinItemPrice();

		/**
		 * The meta object literal for the '<em><b>Min Purchase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_RATE_PRODUCT__MIN_PURCHASE = eINSTANCE.getTaxAuthorityRateProduct_MinPurchase();

		/**
		 * The meta object literal for the '<em><b>Product Category Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAX_AUTHORITY_RATE_PRODUCT__PRODUCT_CATEGORY_ID = eINSTANCE.getTaxAuthorityRateProduct_ProductCategoryId();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAX_AUTHORITY_RATE_PRODUCT__PRODUCT_STORE_ID = eINSTANCE.getTaxAuthorityRateProduct_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Geo Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTH_GEO_ID = eINSTANCE.getTaxAuthorityRateProduct_TaxAuthGeoId();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTH_PARTY_ID = eINSTANCE.getTaxAuthorityRateProduct_TaxAuthPartyId();

		/**
		 * The meta object literal for the '<em><b>Tax Authority Rate Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAX_AUTHORITY_RATE_PRODUCT__TAX_AUTHORITY_RATE_TYPE_ID = eINSTANCE.getTaxAuthorityRateProduct_TaxAuthorityRateTypeId();

		/**
		 * The meta object literal for the '<em><b>Tax Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_RATE_PRODUCT__TAX_PERCENTAGE = eINSTANCE.getTaxAuthorityRateProduct_TaxPercentage();

		/**
		 * The meta object literal for the '<em><b>Tax Promotions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_RATE_PRODUCT__TAX_PROMOTIONS = eINSTANCE.getTaxAuthorityRateProduct_TaxPromotions();

		/**
		 * The meta object literal for the '<em><b>Tax Shipping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_RATE_PRODUCT__TAX_SHIPPING = eINSTANCE.getTaxAuthorityRateProduct_TaxShipping();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_RATE_PRODUCT__THRU_DATE = eINSTANCE.getTaxAuthorityRateProduct_ThruDate();

		/**
		 * The meta object literal for the '<em><b>Title Transfer Enum Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_RATE_PRODUCT__TITLE_TRANSFER_ENUM_ID = eINSTANCE.getTaxAuthorityRateProduct_TitleTransferEnumId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateTypeImpl <em>Authority Rate Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityRateTypeImpl
		 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxPackageImpl#getTaxAuthorityRateType()
		 * @generated
		 */
		EClass TAX_AUTHORITY_RATE_TYPE = eINSTANCE.getTaxAuthorityRateType();

		/**
		 * The meta object literal for the '<em><b>Tax Authority Rate Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_RATE_TYPE__TAX_AUTHORITY_RATE_TYPE_ID = eINSTANCE.getTaxAuthorityRateType_TaxAuthorityRateTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_AUTHORITY_RATE_TYPE__DESCRIPTION = eINSTANCE.getTaxAuthorityRateType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesRuleLookupImpl <em>Zip Sales Rule Lookup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.tax.impl.ZipSalesRuleLookupImpl
		 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxPackageImpl#getZipSalesRuleLookup()
		 * @generated
		 */
		EClass ZIP_SALES_RULE_LOOKUP = eINSTANCE.getZipSalesRuleLookup();

		/**
		 * The meta object literal for the '<em><b>State Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_RULE_LOOKUP__STATE_CODE = eINSTANCE.getZipSalesRuleLookup_StateCode();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_RULE_LOOKUP__CITY = eINSTANCE.getZipSalesRuleLookup_City();

		/**
		 * The meta object literal for the '<em><b>County</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_RULE_LOOKUP__COUNTY = eINSTANCE.getZipSalesRuleLookup_County();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_RULE_LOOKUP__FROM_DATE = eINSTANCE.getZipSalesRuleLookup_FromDate();

		/**
		 * The meta object literal for the '<em><b>Id Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_RULE_LOOKUP__ID_CODE = eINSTANCE.getZipSalesRuleLookup_IdCode();

		/**
		 * The meta object literal for the '<em><b>Ship Cond</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_RULE_LOOKUP__SHIP_COND = eINSTANCE.getZipSalesRuleLookup_ShipCond();

		/**
		 * The meta object literal for the '<em><b>Taxable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_RULE_LOOKUP__TAXABLE = eINSTANCE.getZipSalesRuleLookup_Taxable();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl <em>Zip Sales Tax Lookup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl
		 * @see org.abchip.mimo.biz.accounting.tax.impl.TaxPackageImpl#getZipSalesTaxLookup()
		 * @generated
		 */
		EClass ZIP_SALES_TAX_LOOKUP = eINSTANCE.getZipSalesTaxLookup();

		/**
		 * The meta object literal for the '<em><b>Zip Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_TAX_LOOKUP__ZIP_CODE = eINSTANCE.getZipSalesTaxLookup_ZipCode();

		/**
		 * The meta object literal for the '<em><b>State Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_TAX_LOOKUP__STATE_CODE = eINSTANCE.getZipSalesTaxLookup_StateCode();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_TAX_LOOKUP__CITY = eINSTANCE.getZipSalesTaxLookup_City();

		/**
		 * The meta object literal for the '<em><b>County</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_TAX_LOOKUP__COUNTY = eINSTANCE.getZipSalesTaxLookup_County();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_TAX_LOOKUP__FROM_DATE = eINSTANCE.getZipSalesTaxLookup_FromDate();

		/**
		 * The meta object literal for the '<em><b>City Local Sales Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_TAX_LOOKUP__CITY_LOCAL_SALES_TAX = eINSTANCE.getZipSalesTaxLookup_CityLocalSalesTax();

		/**
		 * The meta object literal for the '<em><b>City Local Use Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_TAX_LOOKUP__CITY_LOCAL_USE_TAX = eINSTANCE.getZipSalesTaxLookup_CityLocalUseTax();

		/**
		 * The meta object literal for the '<em><b>City Sales Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_TAX_LOOKUP__CITY_SALES_TAX = eINSTANCE.getZipSalesTaxLookup_CitySalesTax();

		/**
		 * The meta object literal for the '<em><b>City Use Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_TAX_LOOKUP__CITY_USE_TAX = eINSTANCE.getZipSalesTaxLookup_CityUseTax();

		/**
		 * The meta object literal for the '<em><b>Combo Sales Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_TAX_LOOKUP__COMBO_SALES_TAX = eINSTANCE.getZipSalesTaxLookup_ComboSalesTax();

		/**
		 * The meta object literal for the '<em><b>Combo Use Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_TAX_LOOKUP__COMBO_USE_TAX = eINSTANCE.getZipSalesTaxLookup_ComboUseTax();

		/**
		 * The meta object literal for the '<em><b>County Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_TAX_LOOKUP__COUNTY_DEFAULT = eINSTANCE.getZipSalesTaxLookup_CountyDefault();

		/**
		 * The meta object literal for the '<em><b>County Fips</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_TAX_LOOKUP__COUNTY_FIPS = eINSTANCE.getZipSalesTaxLookup_CountyFips();

		/**
		 * The meta object literal for the '<em><b>County Local Sales Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_TAX_LOOKUP__COUNTY_LOCAL_SALES_TAX = eINSTANCE.getZipSalesTaxLookup_CountyLocalSalesTax();

		/**
		 * The meta object literal for the '<em><b>County Local Use Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_TAX_LOOKUP__COUNTY_LOCAL_USE_TAX = eINSTANCE.getZipSalesTaxLookup_CountyLocalUseTax();

		/**
		 * The meta object literal for the '<em><b>County Sales Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_TAX_LOOKUP__COUNTY_SALES_TAX = eINSTANCE.getZipSalesTaxLookup_CountySalesTax();

		/**
		 * The meta object literal for the '<em><b>County Use Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_TAX_LOOKUP__COUNTY_USE_TAX = eINSTANCE.getZipSalesTaxLookup_CountyUseTax();

		/**
		 * The meta object literal for the '<em><b>General Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_TAX_LOOKUP__GENERAL_DEFAULT = eINSTANCE.getZipSalesTaxLookup_GeneralDefault();

		/**
		 * The meta object literal for the '<em><b>Geo Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_TAX_LOOKUP__GEO_CODE = eINSTANCE.getZipSalesTaxLookup_GeoCode();

		/**
		 * The meta object literal for the '<em><b>Inside City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_TAX_LOOKUP__INSIDE_CITY = eINSTANCE.getZipSalesTaxLookup_InsideCity();

		/**
		 * The meta object literal for the '<em><b>State Sales Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_TAX_LOOKUP__STATE_SALES_TAX = eINSTANCE.getZipSalesTaxLookup_StateSalesTax();

		/**
		 * The meta object literal for the '<em><b>State Use Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZIP_SALES_TAX_LOOKUP__STATE_USE_TAX = eINSTANCE.getZipSalesTaxLookup_StateUseTax();

	}

} //TaxPackage
