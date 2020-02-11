/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.website;

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
 * @see org.abchip.mimo.biz.content.website.WebsiteFactory
 * @model kind="package"
 * @generated
 */
public interface WebsitePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "website";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/content/website";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-website";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebsitePackage eINSTANCE = org.abchip.mimo.biz.content.website.impl.WebsitePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.content.website.impl.WebAnalyticsConfigImpl <em>Web Analytics Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.content.website.impl.WebAnalyticsConfigImpl
	 * @see org.abchip.mimo.biz.content.website.impl.WebsitePackageImpl#getWebAnalyticsConfig()
	 * @generated
	 */
	int WEB_ANALYTICS_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ANALYTICS_CONFIG__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ANALYTICS_CONFIG__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ANALYTICS_CONFIG__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ANALYTICS_CONFIG__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Web Analytics Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ANALYTICS_CONFIG__WEB_ANALYTICS_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Web Site Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ANALYTICS_CONFIG__WEB_SITE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Web Analytics Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ANALYTICS_CONFIG__WEB_ANALYTICS_CODE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Web Analytics Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ANALYTICS_CONFIG_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.content.website.impl.WebAnalyticsTypeImpl <em>Web Analytics Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.content.website.impl.WebAnalyticsTypeImpl
	 * @see org.abchip.mimo.biz.content.website.impl.WebsitePackageImpl#getWebAnalyticsType()
	 * @generated
	 */
	int WEB_ANALYTICS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ANALYTICS_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ANALYTICS_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ANALYTICS_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ANALYTICS_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ANALYTICS_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Web Analytics Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ANALYTICS_TYPE__WEB_ANALYTICS_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ANALYTICS_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ANALYTICS_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ANALYTICS_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Web Analytics Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ANALYTICS_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.content.website.impl.WebSiteContentImpl <em>Web Site Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.content.website.impl.WebSiteContentImpl
	 * @see org.abchip.mimo.biz.content.website.impl.WebsitePackageImpl#getWebSiteContent()
	 * @generated
	 */
	int WEB_SITE_CONTENT = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTENT__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Web Site Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTENT__WEB_SITE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTENT__CONTENT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Web Site Content Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTENT__WEB_SITE_CONTENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTENT__FROM_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTENT__THRU_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Web Site Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.content.website.impl.WebSiteContentTypeImpl <em>Web Site Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.content.website.impl.WebSiteContentTypeImpl
	 * @see org.abchip.mimo.biz.content.website.impl.WebsitePackageImpl#getWebSiteContentType()
	 * @generated
	 */
	int WEB_SITE_CONTENT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTENT_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTENT_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTENT_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTENT_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTENT_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Web Site Content Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTENT_TYPE__WEB_SITE_CONTENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTENT_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTENT_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTENT_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Web Site Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTENT_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.content.website.impl.WebSitePathAliasImpl <em>Web Site Path Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.content.website.impl.WebSitePathAliasImpl
	 * @see org.abchip.mimo.biz.content.website.impl.WebsitePackageImpl#getWebSitePathAlias()
	 * @generated
	 */
	int WEB_SITE_PATH_ALIAS = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PATH_ALIAS__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PATH_ALIAS__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PATH_ALIAS__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PATH_ALIAS__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Web Site Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PATH_ALIAS__WEB_SITE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PATH_ALIAS__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Path Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PATH_ALIAS__PATH_ALIAS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alias To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PATH_ALIAS__ALIAS_TO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PATH_ALIAS__CONTENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PATH_ALIAS__MAP_KEY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PATH_ALIAS__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Web Site Path Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PATH_ALIAS_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.content.website.impl.WebSitePublishPointImpl <em>Web Site Publish Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.content.website.impl.WebSitePublishPointImpl
	 * @see org.abchip.mimo.biz.content.website.impl.WebsitePackageImpl#getWebSitePublishPoint()
	 * @generated
	 */
	int WEB_SITE_PUBLISH_POINT = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PUBLISH_POINT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PUBLISH_POINT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PUBLISH_POINT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PUBLISH_POINT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Content Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PUBLISH_POINT__CONTENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>About Content Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PUBLISH_POINT__ABOUT_CONTENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Content Dept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PUBLISH_POINT__CONTENT_DEPT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Left Bar Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PUBLISH_POINT__LEFT_BAR_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Line Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PUBLISH_POINT__LINE_LOGO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PUBLISH_POINT__LOGO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Medallion Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PUBLISH_POINT__MEDALLION_LOGO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Right Bar Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PUBLISH_POINT__RIGHT_BAR_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Style Sheet File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PUBLISH_POINT__STYLE_SHEET_FILE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Template Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PUBLISH_POINT__TEMPLATE_TITLE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Web Site Publish Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_PUBLISH_POINT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.content.website.WebAnalyticsConfig <em>Web Analytics Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Analytics Config</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebAnalyticsConfig
	 * @generated
	 */
	EClass getWebAnalyticsConfig();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.content.website.WebAnalyticsConfig#getWebSiteId <em>Web Site Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Web Site Id</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebAnalyticsConfig#getWebSiteId()
	 * @see #getWebAnalyticsConfig()
	 * @generated
	 */
	EReference getWebAnalyticsConfig_WebSiteId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.content.website.WebAnalyticsConfig#getWebAnalyticsTypeId <em>Web Analytics Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Web Analytics Type Id</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebAnalyticsConfig#getWebAnalyticsTypeId()
	 * @see #getWebAnalyticsConfig()
	 * @generated
	 */
	EReference getWebAnalyticsConfig_WebAnalyticsTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.website.WebAnalyticsConfig#getWebAnalyticsCode <em>Web Analytics Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Analytics Code</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebAnalyticsConfig#getWebAnalyticsCode()
	 * @see #getWebAnalyticsConfig()
	 * @generated
	 */
	EAttribute getWebAnalyticsConfig_WebAnalyticsCode();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.content.website.WebAnalyticsType <em>Web Analytics Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Analytics Type</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebAnalyticsType
	 * @generated
	 */
	EClass getWebAnalyticsType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.website.WebAnalyticsType#getWebAnalyticsTypeId <em>Web Analytics Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Analytics Type Id</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebAnalyticsType#getWebAnalyticsTypeId()
	 * @see #getWebAnalyticsType()
	 * @generated
	 */
	EAttribute getWebAnalyticsType_WebAnalyticsTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.website.WebAnalyticsType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebAnalyticsType#getDescription()
	 * @see #getWebAnalyticsType()
	 * @generated
	 */
	EAttribute getWebAnalyticsType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.website.WebAnalyticsType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebAnalyticsType#isHasTable()
	 * @see #getWebAnalyticsType()
	 * @generated
	 */
	EAttribute getWebAnalyticsType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.content.website.WebAnalyticsType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebAnalyticsType#getParentTypeId()
	 * @see #getWebAnalyticsType()
	 * @generated
	 */
	EReference getWebAnalyticsType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.content.website.WebSiteContent <em>Web Site Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Site Content</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSiteContent
	 * @generated
	 */
	EClass getWebSiteContent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.content.website.WebSiteContent#getWebSiteId <em>Web Site Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Web Site Id</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSiteContent#getWebSiteId()
	 * @see #getWebSiteContent()
	 * @generated
	 */
	EReference getWebSiteContent_WebSiteId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.content.website.WebSiteContent#getContentId <em>Content Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Id</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSiteContent#getContentId()
	 * @see #getWebSiteContent()
	 * @generated
	 */
	EReference getWebSiteContent_ContentId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.content.website.WebSiteContent#getWebSiteContentTypeId <em>Web Site Content Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Web Site Content Type Id</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSiteContent#getWebSiteContentTypeId()
	 * @see #getWebSiteContent()
	 * @generated
	 */
	EReference getWebSiteContent_WebSiteContentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.website.WebSiteContent#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSiteContent#getFromDate()
	 * @see #getWebSiteContent()
	 * @generated
	 */
	EAttribute getWebSiteContent_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.website.WebSiteContent#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSiteContent#getThruDate()
	 * @see #getWebSiteContent()
	 * @generated
	 */
	EAttribute getWebSiteContent_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.content.website.WebSiteContentType <em>Web Site Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Site Content Type</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSiteContentType
	 * @generated
	 */
	EClass getWebSiteContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.website.WebSiteContentType#getWebSiteContentTypeId <em>Web Site Content Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Site Content Type Id</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSiteContentType#getWebSiteContentTypeId()
	 * @see #getWebSiteContentType()
	 * @generated
	 */
	EAttribute getWebSiteContentType_WebSiteContentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.website.WebSiteContentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSiteContentType#getDescription()
	 * @see #getWebSiteContentType()
	 * @generated
	 */
	EAttribute getWebSiteContentType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.website.WebSiteContentType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSiteContentType#isHasTable()
	 * @see #getWebSiteContentType()
	 * @generated
	 */
	EAttribute getWebSiteContentType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.content.website.WebSiteContentType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSiteContentType#getParentTypeId()
	 * @see #getWebSiteContentType()
	 * @generated
	 */
	EReference getWebSiteContentType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.content.website.WebSitePathAlias <em>Web Site Path Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Site Path Alias</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSitePathAlias
	 * @generated
	 */
	EClass getWebSitePathAlias();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.content.website.WebSitePathAlias#getWebSiteId <em>Web Site Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Web Site Id</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSitePathAlias#getWebSiteId()
	 * @see #getWebSitePathAlias()
	 * @generated
	 */
	EReference getWebSitePathAlias_WebSiteId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.website.WebSitePathAlias#getPathAlias <em>Path Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Alias</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSitePathAlias#getPathAlias()
	 * @see #getWebSitePathAlias()
	 * @generated
	 */
	EAttribute getWebSitePathAlias_PathAlias();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.website.WebSitePathAlias#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSitePathAlias#getFromDate()
	 * @see #getWebSitePathAlias()
	 * @generated
	 */
	EAttribute getWebSitePathAlias_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.website.WebSitePathAlias#getAliasTo <em>Alias To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias To</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSitePathAlias#getAliasTo()
	 * @see #getWebSitePathAlias()
	 * @generated
	 */
	EAttribute getWebSitePathAlias_AliasTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.content.website.WebSitePathAlias#getContentId <em>Content Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Id</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSitePathAlias#getContentId()
	 * @see #getWebSitePathAlias()
	 * @generated
	 */
	EReference getWebSitePathAlias_ContentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.website.WebSitePathAlias#getMapKey <em>Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Key</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSitePathAlias#getMapKey()
	 * @see #getWebSitePathAlias()
	 * @generated
	 */
	EAttribute getWebSitePathAlias_MapKey();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.website.WebSitePathAlias#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSitePathAlias#getThruDate()
	 * @see #getWebSitePathAlias()
	 * @generated
	 */
	EAttribute getWebSitePathAlias_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint <em>Web Site Publish Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Site Publish Point</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSitePublishPoint
	 * @generated
	 */
	EClass getWebSitePublishPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getContentId <em>Content Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Id</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSitePublishPoint#getContentId()
	 * @see #getWebSitePublishPoint()
	 * @generated
	 */
	EAttribute getWebSitePublishPoint_ContentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getAboutContentId <em>About Content Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>About Content Id</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSitePublishPoint#getAboutContentId()
	 * @see #getWebSitePublishPoint()
	 * @generated
	 */
	EAttribute getWebSitePublishPoint_AboutContentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getContentDept <em>Content Dept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Dept</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSitePublishPoint#getContentDept()
	 * @see #getWebSitePublishPoint()
	 * @generated
	 */
	EAttribute getWebSitePublishPoint_ContentDept();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getLeftBarId <em>Left Bar Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Bar Id</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSitePublishPoint#getLeftBarId()
	 * @see #getWebSitePublishPoint()
	 * @generated
	 */
	EAttribute getWebSitePublishPoint_LeftBarId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getLineLogo <em>Line Logo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Logo</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSitePublishPoint#getLineLogo()
	 * @see #getWebSitePublishPoint()
	 * @generated
	 */
	EAttribute getWebSitePublishPoint_LineLogo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getLogo <em>Logo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logo</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSitePublishPoint#getLogo()
	 * @see #getWebSitePublishPoint()
	 * @generated
	 */
	EAttribute getWebSitePublishPoint_Logo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getMedallionLogo <em>Medallion Logo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medallion Logo</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSitePublishPoint#getMedallionLogo()
	 * @see #getWebSitePublishPoint()
	 * @generated
	 */
	EAttribute getWebSitePublishPoint_MedallionLogo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getRightBarId <em>Right Bar Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Bar Id</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSitePublishPoint#getRightBarId()
	 * @see #getWebSitePublishPoint()
	 * @generated
	 */
	EAttribute getWebSitePublishPoint_RightBarId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getStyleSheetFile <em>Style Sheet File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Sheet File</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSitePublishPoint#getStyleSheetFile()
	 * @see #getWebSitePublishPoint()
	 * @generated
	 */
	EAttribute getWebSitePublishPoint_StyleSheetFile();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.content.website.WebSitePublishPoint#getTemplateTitle <em>Template Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Title</em>'.
	 * @see org.abchip.mimo.biz.content.website.WebSitePublishPoint#getTemplateTitle()
	 * @see #getWebSitePublishPoint()
	 * @generated
	 */
	EAttribute getWebSitePublishPoint_TemplateTitle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebsiteFactory getWebsiteFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.content.website.impl.WebAnalyticsConfigImpl <em>Web Analytics Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.content.website.impl.WebAnalyticsConfigImpl
		 * @see org.abchip.mimo.biz.content.website.impl.WebsitePackageImpl#getWebAnalyticsConfig()
		 * @generated
		 */
		EClass WEB_ANALYTICS_CONFIG = eINSTANCE.getWebAnalyticsConfig();

		/**
		 * The meta object literal for the '<em><b>Web Site Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_ANALYTICS_CONFIG__WEB_SITE_ID = eINSTANCE.getWebAnalyticsConfig_WebSiteId();

		/**
		 * The meta object literal for the '<em><b>Web Analytics Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_ANALYTICS_CONFIG__WEB_ANALYTICS_TYPE_ID = eINSTANCE.getWebAnalyticsConfig_WebAnalyticsTypeId();

		/**
		 * The meta object literal for the '<em><b>Web Analytics Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_ANALYTICS_CONFIG__WEB_ANALYTICS_CODE = eINSTANCE.getWebAnalyticsConfig_WebAnalyticsCode();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.content.website.impl.WebAnalyticsTypeImpl <em>Web Analytics Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.content.website.impl.WebAnalyticsTypeImpl
		 * @see org.abchip.mimo.biz.content.website.impl.WebsitePackageImpl#getWebAnalyticsType()
		 * @generated
		 */
		EClass WEB_ANALYTICS_TYPE = eINSTANCE.getWebAnalyticsType();

		/**
		 * The meta object literal for the '<em><b>Web Analytics Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_ANALYTICS_TYPE__WEB_ANALYTICS_TYPE_ID = eINSTANCE.getWebAnalyticsType_WebAnalyticsTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_ANALYTICS_TYPE__DESCRIPTION = eINSTANCE.getWebAnalyticsType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_ANALYTICS_TYPE__HAS_TABLE = eINSTANCE.getWebAnalyticsType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_ANALYTICS_TYPE__PARENT_TYPE_ID = eINSTANCE.getWebAnalyticsType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.content.website.impl.WebSiteContentImpl <em>Web Site Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.content.website.impl.WebSiteContentImpl
		 * @see org.abchip.mimo.biz.content.website.impl.WebsitePackageImpl#getWebSiteContent()
		 * @generated
		 */
		EClass WEB_SITE_CONTENT = eINSTANCE.getWebSiteContent();

		/**
		 * The meta object literal for the '<em><b>Web Site Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE_CONTENT__WEB_SITE_ID = eINSTANCE.getWebSiteContent_WebSiteId();

		/**
		 * The meta object literal for the '<em><b>Content Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE_CONTENT__CONTENT_ID = eINSTANCE.getWebSiteContent_ContentId();

		/**
		 * The meta object literal for the '<em><b>Web Site Content Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE_CONTENT__WEB_SITE_CONTENT_TYPE_ID = eINSTANCE.getWebSiteContent_WebSiteContentTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_CONTENT__FROM_DATE = eINSTANCE.getWebSiteContent_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_CONTENT__THRU_DATE = eINSTANCE.getWebSiteContent_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.content.website.impl.WebSiteContentTypeImpl <em>Web Site Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.content.website.impl.WebSiteContentTypeImpl
		 * @see org.abchip.mimo.biz.content.website.impl.WebsitePackageImpl#getWebSiteContentType()
		 * @generated
		 */
		EClass WEB_SITE_CONTENT_TYPE = eINSTANCE.getWebSiteContentType();

		/**
		 * The meta object literal for the '<em><b>Web Site Content Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_CONTENT_TYPE__WEB_SITE_CONTENT_TYPE_ID = eINSTANCE.getWebSiteContentType_WebSiteContentTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_CONTENT_TYPE__DESCRIPTION = eINSTANCE.getWebSiteContentType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_CONTENT_TYPE__HAS_TABLE = eINSTANCE.getWebSiteContentType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE_CONTENT_TYPE__PARENT_TYPE_ID = eINSTANCE.getWebSiteContentType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.content.website.impl.WebSitePathAliasImpl <em>Web Site Path Alias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.content.website.impl.WebSitePathAliasImpl
		 * @see org.abchip.mimo.biz.content.website.impl.WebsitePackageImpl#getWebSitePathAlias()
		 * @generated
		 */
		EClass WEB_SITE_PATH_ALIAS = eINSTANCE.getWebSitePathAlias();

		/**
		 * The meta object literal for the '<em><b>Web Site Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE_PATH_ALIAS__WEB_SITE_ID = eINSTANCE.getWebSitePathAlias_WebSiteId();

		/**
		 * The meta object literal for the '<em><b>Path Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_PATH_ALIAS__PATH_ALIAS = eINSTANCE.getWebSitePathAlias_PathAlias();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_PATH_ALIAS__FROM_DATE = eINSTANCE.getWebSitePathAlias_FromDate();

		/**
		 * The meta object literal for the '<em><b>Alias To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_PATH_ALIAS__ALIAS_TO = eINSTANCE.getWebSitePathAlias_AliasTo();

		/**
		 * The meta object literal for the '<em><b>Content Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE_PATH_ALIAS__CONTENT_ID = eINSTANCE.getWebSitePathAlias_ContentId();

		/**
		 * The meta object literal for the '<em><b>Map Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_PATH_ALIAS__MAP_KEY = eINSTANCE.getWebSitePathAlias_MapKey();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_PATH_ALIAS__THRU_DATE = eINSTANCE.getWebSitePathAlias_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.content.website.impl.WebSitePublishPointImpl <em>Web Site Publish Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.content.website.impl.WebSitePublishPointImpl
		 * @see org.abchip.mimo.biz.content.website.impl.WebsitePackageImpl#getWebSitePublishPoint()
		 * @generated
		 */
		EClass WEB_SITE_PUBLISH_POINT = eINSTANCE.getWebSitePublishPoint();

		/**
		 * The meta object literal for the '<em><b>Content Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_PUBLISH_POINT__CONTENT_ID = eINSTANCE.getWebSitePublishPoint_ContentId();

		/**
		 * The meta object literal for the '<em><b>About Content Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_PUBLISH_POINT__ABOUT_CONTENT_ID = eINSTANCE.getWebSitePublishPoint_AboutContentId();

		/**
		 * The meta object literal for the '<em><b>Content Dept</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_PUBLISH_POINT__CONTENT_DEPT = eINSTANCE.getWebSitePublishPoint_ContentDept();

		/**
		 * The meta object literal for the '<em><b>Left Bar Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_PUBLISH_POINT__LEFT_BAR_ID = eINSTANCE.getWebSitePublishPoint_LeftBarId();

		/**
		 * The meta object literal for the '<em><b>Line Logo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_PUBLISH_POINT__LINE_LOGO = eINSTANCE.getWebSitePublishPoint_LineLogo();

		/**
		 * The meta object literal for the '<em><b>Logo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_PUBLISH_POINT__LOGO = eINSTANCE.getWebSitePublishPoint_Logo();

		/**
		 * The meta object literal for the '<em><b>Medallion Logo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_PUBLISH_POINT__MEDALLION_LOGO = eINSTANCE.getWebSitePublishPoint_MedallionLogo();

		/**
		 * The meta object literal for the '<em><b>Right Bar Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_PUBLISH_POINT__RIGHT_BAR_ID = eINSTANCE.getWebSitePublishPoint_RightBarId();

		/**
		 * The meta object literal for the '<em><b>Style Sheet File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_PUBLISH_POINT__STYLE_SHEET_FILE = eINSTANCE.getWebSitePublishPoint_StyleSheetFile();

		/**
		 * The meta object literal for the '<em><b>Template Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_PUBLISH_POINT__TEMPLATE_TITLE = eINSTANCE.getWebSitePublishPoint_TemplateTitle();

	}

} //WebsitePackage
