/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.webapp.website;

import org.abchip.mimo.biz.BizPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see org.abchip.mimo.biz.webapp.website.WebsiteFactory
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
	String eNS_URI = "http://www.abchip.org/mimo/biz/webapp/website";

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
	WebsitePackage eINSTANCE = org.abchip.mimo.biz.webapp.website.impl.WebsitePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.webapp.website.impl.WebPageImpl <em>Web Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.webapp.website.impl.WebPageImpl
	 * @see org.abchip.mimo.biz.webapp.website.impl.WebsitePackageImpl#getWebPage()
	 * @generated
	 */
	int WEB_PAGE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Web Page Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__WEB_PAGE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Page Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__PAGE_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Web Site Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__WEB_SITE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE__CONTENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Web Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The number of operations of the '<em>Web Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_PAGE_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.webapp.website.impl.WebSiteImpl <em>Web Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.webapp.website.impl.WebSiteImpl
	 * @see org.abchip.mimo.biz.webapp.website.impl.WebsitePackageImpl#getWebSite()
	 * @generated
	 */
	int WEB_SITE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Web Site Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_SITE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allow Product Store Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__ALLOW_PRODUCT_STORE_CHANGE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cookie Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__COOKIE_DOMAIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Display Maintenance Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__DISPLAY_MAINTENANCE_PAGE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Enable Https</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__ENABLE_HTTPS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hosted Path Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__HOSTED_PATH_ALIAS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Http Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__HTTP_HOST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Http Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__HTTP_PORT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Https Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__HTTPS_HOST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Https Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__HTTPS_PORT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__IS_DEFAULT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Secure Content Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__SECURE_CONTENT_PREFIX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Site Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__SITE_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Standard Content Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__STANDARD_CONTENT_PREFIX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Webapp Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEBAPP_PATH = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Visual Theme Set Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__VISUAL_THEME_SET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Web Analytics Configs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__WEB_ANALYTICS_CONFIGS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Web Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 18;


	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The operation id for the '<em>Order Headers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___ORDER_HEADERS = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Subscription Resources</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___SUBSCRIPTION_RESOURCES = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Web Pages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___WEB_PAGES = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Web Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.webapp.website.WebPage <em>Web Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Page</em>'.
	 * @see org.abchip.mimo.biz.webapp.website.WebPage
	 * @generated
	 */
	EClass getWebPage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.website.WebPage#getWebPageId <em>Web Page Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Page Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.website.WebPage#getWebPageId()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_WebPageId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.webapp.website.WebPage#getContentId <em>Content Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.website.WebPage#getContentId()
	 * @see #getWebPage()
	 * @generated
	 */
	EReference getWebPage_ContentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.website.WebPage#getPageName <em>Page Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Name</em>'.
	 * @see org.abchip.mimo.biz.webapp.website.WebPage#getPageName()
	 * @see #getWebPage()
	 * @generated
	 */
	EAttribute getWebPage_PageName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.webapp.website.WebPage#getWebSiteId <em>Web Site Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Web Site Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.website.WebPage#getWebSiteId()
	 * @see #getWebPage()
	 * @generated
	 */
	EReference getWebPage_WebSiteId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.webapp.website.WebSite <em>Web Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Site</em>'.
	 * @see org.abchip.mimo.biz.webapp.website.WebSite
	 * @generated
	 */
	EClass getWebSite();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.website.WebSite#getWebSiteId <em>Web Site Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Site Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.website.WebSite#getWebSiteId()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebSiteId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.website.WebSite#isAllowProductStoreChange <em>Allow Product Store Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Product Store Change</em>'.
	 * @see org.abchip.mimo.biz.webapp.website.WebSite#isAllowProductStoreChange()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_AllowProductStoreChange();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.website.WebSite#getCookieDomain <em>Cookie Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cookie Domain</em>'.
	 * @see org.abchip.mimo.biz.webapp.website.WebSite#getCookieDomain()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_CookieDomain();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.website.WebSite#isDisplayMaintenancePage <em>Display Maintenance Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Maintenance Page</em>'.
	 * @see org.abchip.mimo.biz.webapp.website.WebSite#isDisplayMaintenancePage()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_DisplayMaintenancePage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.website.WebSite#isEnableHttps <em>Enable Https</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Https</em>'.
	 * @see org.abchip.mimo.biz.webapp.website.WebSite#isEnableHttps()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_EnableHttps();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.website.WebSite#getHostedPathAlias <em>Hosted Path Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hosted Path Alias</em>'.
	 * @see org.abchip.mimo.biz.webapp.website.WebSite#getHostedPathAlias()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_HostedPathAlias();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.website.WebSite#getHttpHost <em>Http Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Host</em>'.
	 * @see org.abchip.mimo.biz.webapp.website.WebSite#getHttpHost()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_HttpHost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.website.WebSite#getHttpPort <em>Http Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Port</em>'.
	 * @see org.abchip.mimo.biz.webapp.website.WebSite#getHttpPort()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_HttpPort();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.website.WebSite#getHttpsHost <em>Https Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Https Host</em>'.
	 * @see org.abchip.mimo.biz.webapp.website.WebSite#getHttpsHost()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_HttpsHost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.website.WebSite#getHttpsPort <em>Https Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Https Port</em>'.
	 * @see org.abchip.mimo.biz.webapp.website.WebSite#getHttpsPort()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_HttpsPort();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.website.WebSite#isIsDefault <em>Is Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Default</em>'.
	 * @see org.abchip.mimo.biz.webapp.website.WebSite#isIsDefault()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_IsDefault();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.webapp.website.WebSite#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.website.WebSite#getProductStoreId()
	 * @see #getWebSite()
	 * @generated
	 */
	EReference getWebSite_ProductStoreId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.website.WebSite#getSecureContentPrefix <em>Secure Content Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secure Content Prefix</em>'.
	 * @see org.abchip.mimo.biz.webapp.website.WebSite#getSecureContentPrefix()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_SecureContentPrefix();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.website.WebSite#getSiteName <em>Site Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Name</em>'.
	 * @see org.abchip.mimo.biz.webapp.website.WebSite#getSiteName()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_SiteName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.website.WebSite#getStandardContentPrefix <em>Standard Content Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Content Prefix</em>'.
	 * @see org.abchip.mimo.biz.webapp.website.WebSite#getStandardContentPrefix()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_StandardContentPrefix();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.webapp.website.WebSite#getVisualThemeSetId <em>Visual Theme Set Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visual Theme Set Id</em>'.
	 * @see org.abchip.mimo.biz.webapp.website.WebSite#getVisualThemeSetId()
	 * @see #getWebSite()
	 * @generated
	 */
	EReference getWebSite_VisualThemeSetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.webapp.website.WebSite#getWebappPath <em>Webapp Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Webapp Path</em>'.
	 * @see org.abchip.mimo.biz.webapp.website.WebSite#getWebappPath()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebappPath();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.biz.webapp.website.WebSite#getWebAnalyticsConfigs <em>Web Analytics Configs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Web Analytics Configs</em>'.
	 * @see org.abchip.mimo.biz.webapp.website.WebSite#getWebAnalyticsConfigs()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_WebAnalyticsConfigs();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.webapp.website.WebSite#orderHeaders() <em>Order Headers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Order Headers</em>' operation.
	 * @see org.abchip.mimo.biz.webapp.website.WebSite#orderHeaders()
	 * @generated
	 */
	EOperation getWebSite__OrderHeaders();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.webapp.website.WebSite#subscriptionResources() <em>Subscription Resources</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Subscription Resources</em>' operation.
	 * @see org.abchip.mimo.biz.webapp.website.WebSite#subscriptionResources()
	 * @generated
	 */
	EOperation getWebSite__SubscriptionResources();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.webapp.website.WebSite#webPages() <em>Web Pages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Web Pages</em>' operation.
	 * @see org.abchip.mimo.biz.webapp.website.WebSite#webPages()
	 * @generated
	 */
	EOperation getWebSite__WebPages();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.webapp.website.impl.WebPageImpl <em>Web Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.webapp.website.impl.WebPageImpl
		 * @see org.abchip.mimo.biz.webapp.website.impl.WebsitePackageImpl#getWebPage()
		 * @generated
		 */
		EClass WEB_PAGE = eINSTANCE.getWebPage();

		/**
		 * The meta object literal for the '<em><b>Web Page Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__WEB_PAGE_ID = eINSTANCE.getWebPage_WebPageId();

		/**
		 * The meta object literal for the '<em><b>Content Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_PAGE__CONTENT_ID = eINSTANCE.getWebPage_ContentId();

		/**
		 * The meta object literal for the '<em><b>Page Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_PAGE__PAGE_NAME = eINSTANCE.getWebPage_PageName();

		/**
		 * The meta object literal for the '<em><b>Web Site Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_PAGE__WEB_SITE_ID = eINSTANCE.getWebPage_WebSiteId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.webapp.website.impl.WebSiteImpl <em>Web Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.webapp.website.impl.WebSiteImpl
		 * @see org.abchip.mimo.biz.webapp.website.impl.WebsitePackageImpl#getWebSite()
		 * @generated
		 */
		EClass WEB_SITE = eINSTANCE.getWebSite();

		/**
		 * The meta object literal for the '<em><b>Web Site Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_SITE_ID = eINSTANCE.getWebSite_WebSiteId();

		/**
		 * The meta object literal for the '<em><b>Allow Product Store Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__ALLOW_PRODUCT_STORE_CHANGE = eINSTANCE.getWebSite_AllowProductStoreChange();

		/**
		 * The meta object literal for the '<em><b>Cookie Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__COOKIE_DOMAIN = eINSTANCE.getWebSite_CookieDomain();

		/**
		 * The meta object literal for the '<em><b>Display Maintenance Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__DISPLAY_MAINTENANCE_PAGE = eINSTANCE.getWebSite_DisplayMaintenancePage();

		/**
		 * The meta object literal for the '<em><b>Enable Https</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__ENABLE_HTTPS = eINSTANCE.getWebSite_EnableHttps();

		/**
		 * The meta object literal for the '<em><b>Hosted Path Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__HOSTED_PATH_ALIAS = eINSTANCE.getWebSite_HostedPathAlias();

		/**
		 * The meta object literal for the '<em><b>Http Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__HTTP_HOST = eINSTANCE.getWebSite_HttpHost();

		/**
		 * The meta object literal for the '<em><b>Http Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__HTTP_PORT = eINSTANCE.getWebSite_HttpPort();

		/**
		 * The meta object literal for the '<em><b>Https Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__HTTPS_HOST = eINSTANCE.getWebSite_HttpsHost();

		/**
		 * The meta object literal for the '<em><b>Https Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__HTTPS_PORT = eINSTANCE.getWebSite_HttpsPort();

		/**
		 * The meta object literal for the '<em><b>Is Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__IS_DEFAULT = eINSTANCE.getWebSite_IsDefault();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE__PRODUCT_STORE_ID = eINSTANCE.getWebSite_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Secure Content Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__SECURE_CONTENT_PREFIX = eINSTANCE.getWebSite_SecureContentPrefix();

		/**
		 * The meta object literal for the '<em><b>Site Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__SITE_NAME = eINSTANCE.getWebSite_SiteName();

		/**
		 * The meta object literal for the '<em><b>Standard Content Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__STANDARD_CONTENT_PREFIX = eINSTANCE.getWebSite_StandardContentPrefix();

		/**
		 * The meta object literal for the '<em><b>Visual Theme Set Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE__VISUAL_THEME_SET_ID = eINSTANCE.getWebSite_VisualThemeSetId();

		/**
		 * The meta object literal for the '<em><b>Webapp Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEBAPP_PATH = eINSTANCE.getWebSite_WebappPath();

		/**
		 * The meta object literal for the '<em><b>Web Analytics Configs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__WEB_ANALYTICS_CONFIGS = eINSTANCE.getWebSite_WebAnalyticsConfigs();

		/**
		 * The meta object literal for the '<em><b>Order Headers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WEB_SITE___ORDER_HEADERS = eINSTANCE.getWebSite__OrderHeaders();

		/**
		 * The meta object literal for the '<em><b>Subscription Resources</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WEB_SITE___SUBSCRIPTION_RESOURCES = eINSTANCE.getWebSite__SubscriptionResources();

		/**
		 * The meta object literal for the '<em><b>Web Pages</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WEB_SITE___WEB_PAGES = eINSTANCE.getWebSite__WebPages();

	}

} //WebsitePackage
