/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.webapp.website.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.common.theme.VisualThemeSet;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.abchip.mimo.biz.webapp.website.WebSite;
import org.abchip.mimo.biz.webapp.website.WebsitePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.impl.WebSiteImpl#getWebSiteId <em>Web Site Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.impl.WebSiteImpl#isAllowProductStoreChange <em>Allow Product Store Change</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.impl.WebSiteImpl#getCookieDomain <em>Cookie Domain</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.impl.WebSiteImpl#isDisplayMaintenancePage <em>Display Maintenance Page</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.impl.WebSiteImpl#isEnableHttps <em>Enable Https</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.impl.WebSiteImpl#getHostedPathAlias <em>Hosted Path Alias</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.impl.WebSiteImpl#getHttpHost <em>Http Host</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.impl.WebSiteImpl#getHttpPort <em>Http Port</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.impl.WebSiteImpl#getHttpsHost <em>Https Host</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.impl.WebSiteImpl#getHttpsPort <em>Https Port</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.impl.WebSiteImpl#isIsDefault <em>Is Default</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.impl.WebSiteImpl#getSecureContentPrefix <em>Secure Content Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.impl.WebSiteImpl#getSiteName <em>Site Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.impl.WebSiteImpl#getStandardContentPrefix <em>Standard Content Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.impl.WebSiteImpl#getWebappPath <em>Webapp Path</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.impl.WebSiteImpl#getVisualThemeSetId <em>Visual Theme Set Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.impl.WebSiteImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.impl.WebSiteImpl#getWebAnalyticsConfigs <em>Web Analytics Configs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebSiteImpl extends BizEntityImpl implements WebSite {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getWebSiteId() <em>Web Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebSiteId()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_SITE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebSiteId() <em>Web Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebSiteId()
	 * @generated
	 * @ordered
	 */
	protected String webSiteId = WEB_SITE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowProductStoreChange() <em>Allow Product Store Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowProductStoreChange()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_PRODUCT_STORE_CHANGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowProductStoreChange() <em>Allow Product Store Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowProductStoreChange()
	 * @generated
	 * @ordered
	 */
	protected boolean allowProductStoreChange = ALLOW_PRODUCT_STORE_CHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCookieDomain() <em>Cookie Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCookieDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String COOKIE_DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCookieDomain() <em>Cookie Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCookieDomain()
	 * @generated
	 * @ordered
	 */
	protected String cookieDomain = COOKIE_DOMAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisplayMaintenancePage() <em>Display Maintenance Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplayMaintenancePage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPLAY_MAINTENANCE_PAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisplayMaintenancePage() <em>Display Maintenance Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplayMaintenancePage()
	 * @generated
	 * @ordered
	 */
	protected boolean displayMaintenancePage = DISPLAY_MAINTENANCE_PAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnableHttps() <em>Enable Https</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableHttps()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_HTTPS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableHttps() <em>Enable Https</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableHttps()
	 * @generated
	 * @ordered
	 */
	protected boolean enableHttps = ENABLE_HTTPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostedPathAlias() <em>Hosted Path Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostedPathAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String HOSTED_PATH_ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostedPathAlias() <em>Hosted Path Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostedPathAlias()
	 * @generated
	 * @ordered
	 */
	protected String hostedPathAlias = HOSTED_PATH_ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHttpHost() <em>Http Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTP_HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHttpHost() <em>Http Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpHost()
	 * @generated
	 * @ordered
	 */
	protected String httpHost = HTTP_HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getHttpPort() <em>Http Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpPort()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTP_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHttpPort() <em>Http Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpPort()
	 * @generated
	 * @ordered
	 */
	protected String httpPort = HTTP_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHttpsHost() <em>Https Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpsHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTPS_HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHttpsHost() <em>Https Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpsHost()
	 * @generated
	 * @ordered
	 */
	protected String httpsHost = HTTPS_HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getHttpsPort() <em>Https Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpsPort()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTPS_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHttpsPort() <em>Https Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpsPort()
	 * @generated
	 * @ordered
	 */
	protected String httpsPort = HTTPS_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean isDefault = IS_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecureContentPrefix() <em>Secure Content Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecureContentPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURE_CONTENT_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecureContentPrefix() <em>Secure Content Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecureContentPrefix()
	 * @generated
	 * @ordered
	 */
	protected String secureContentPrefix = SECURE_CONTENT_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSiteName() <em>Site Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteName()
	 * @generated
	 * @ordered
	 */
	protected static final String SITE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSiteName() <em>Site Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteName()
	 * @generated
	 * @ordered
	 */
	protected String siteName = SITE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStandardContentPrefix() <em>Standard Content Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardContentPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String STANDARD_CONTENT_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandardContentPrefix() <em>Standard Content Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardContentPrefix()
	 * @generated
	 * @ordered
	 */
	protected String standardContentPrefix = STANDARD_CONTENT_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebappPath() <em>Webapp Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebappPath()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBAPP_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebappPath() <em>Webapp Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebappPath()
	 * @generated
	 * @ordered
	 */
	protected String webappPath = WEBAPP_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVisualThemeSetId() <em>Visual Theme Set Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualThemeSetId()
	 * @generated
	 * @ordered
	 */
	protected VisualThemeSet visualThemeSetId;

	/**
	 * The cached value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected ProductStore productStoreId;

	/**
	 * The cached value of the '{@link #getWebAnalyticsConfigs() <em>Web Analytics Configs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebAnalyticsConfigs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> webAnalyticsConfigs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebSiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.WEB_SITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebSiteId() {
		return webSiteId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebSiteId(String newWebSiteId) {
		String oldWebSiteId = webSiteId;
		webSiteId = newWebSiteId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE__WEB_SITE_ID, oldWebSiteId, webSiteId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowProductStoreChange() {
		return allowProductStoreChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowProductStoreChange(boolean newAllowProductStoreChange) {
		boolean oldAllowProductStoreChange = allowProductStoreChange;
		allowProductStoreChange = newAllowProductStoreChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE__ALLOW_PRODUCT_STORE_CHANGE, oldAllowProductStoreChange, allowProductStoreChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCookieDomain() {
		return cookieDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCookieDomain(String newCookieDomain) {
		String oldCookieDomain = cookieDomain;
		cookieDomain = newCookieDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE__COOKIE_DOMAIN, oldCookieDomain, cookieDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDisplayMaintenancePage() {
		return displayMaintenancePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayMaintenancePage(boolean newDisplayMaintenancePage) {
		boolean oldDisplayMaintenancePage = displayMaintenancePage;
		displayMaintenancePage = newDisplayMaintenancePage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE__DISPLAY_MAINTENANCE_PAGE, oldDisplayMaintenancePage, displayMaintenancePage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnableHttps() {
		return enableHttps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableHttps(boolean newEnableHttps) {
		boolean oldEnableHttps = enableHttps;
		enableHttps = newEnableHttps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE__ENABLE_HTTPS, oldEnableHttps, enableHttps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHostedPathAlias() {
		return hostedPathAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostedPathAlias(String newHostedPathAlias) {
		String oldHostedPathAlias = hostedPathAlias;
		hostedPathAlias = newHostedPathAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE__HOSTED_PATH_ALIAS, oldHostedPathAlias, hostedPathAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHttpHost() {
		return httpHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHttpHost(String newHttpHost) {
		String oldHttpHost = httpHost;
		httpHost = newHttpHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE__HTTP_HOST, oldHttpHost, httpHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHttpPort() {
		return httpPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHttpPort(String newHttpPort) {
		String oldHttpPort = httpPort;
		httpPort = newHttpPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE__HTTP_PORT, oldHttpPort, httpPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHttpsHost() {
		return httpsHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHttpsHost(String newHttpsHost) {
		String oldHttpsHost = httpsHost;
		httpsHost = newHttpsHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE__HTTPS_HOST, oldHttpsHost, httpsHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHttpsPort() {
		return httpsPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHttpsPort(String newHttpsPort) {
		String oldHttpsPort = httpsPort;
		httpsPort = newHttpsPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE__HTTPS_PORT, oldHttpsPort, httpsPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsDefault() {
		return isDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDefault(boolean newIsDefault) {
		boolean oldIsDefault = isDefault;
		isDefault = newIsDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE__IS_DEFAULT, oldIsDefault, isDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore getProductStoreId() {
		if (productStoreId != null && ((EObject)productStoreId).eIsProxy()) {
			InternalEObject oldProductStoreId = (InternalEObject)productStoreId;
			productStoreId = (ProductStore)eResolveProxy(oldProductStoreId);
			if (productStoreId != oldProductStoreId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.WEB_SITE__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
			}
		}
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductStore basicGetProductStoreId() {
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(ProductStore newProductStoreId) {
		ProductStore oldProductStoreId = productStoreId;
		productStoreId = newProductStoreId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecureContentPrefix() {
		return secureContentPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecureContentPrefix(String newSecureContentPrefix) {
		String oldSecureContentPrefix = secureContentPrefix;
		secureContentPrefix = newSecureContentPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE__SECURE_CONTENT_PREFIX, oldSecureContentPrefix, secureContentPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSiteName() {
		return siteName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSiteName(String newSiteName) {
		String oldSiteName = siteName;
		siteName = newSiteName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE__SITE_NAME, oldSiteName, siteName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStandardContentPrefix() {
		return standardContentPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardContentPrefix(String newStandardContentPrefix) {
		String oldStandardContentPrefix = standardContentPrefix;
		standardContentPrefix = newStandardContentPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE__STANDARD_CONTENT_PREFIX, oldStandardContentPrefix, standardContentPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisualThemeSet getVisualThemeSetId() {
		if (visualThemeSetId != null && ((EObject)visualThemeSetId).eIsProxy()) {
			InternalEObject oldVisualThemeSetId = (InternalEObject)visualThemeSetId;
			visualThemeSetId = (VisualThemeSet)eResolveProxy(oldVisualThemeSetId);
			if (visualThemeSetId != oldVisualThemeSetId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.WEB_SITE__VISUAL_THEME_SET_ID, oldVisualThemeSetId, visualThemeSetId));
			}
		}
		return visualThemeSetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualThemeSet basicGetVisualThemeSetId() {
		return visualThemeSetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisualThemeSetId(VisualThemeSet newVisualThemeSetId) {
		VisualThemeSet oldVisualThemeSetId = visualThemeSetId;
		visualThemeSetId = newVisualThemeSetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE__VISUAL_THEME_SET_ID, oldVisualThemeSetId, visualThemeSetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebappPath() {
		return webappPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebappPath(String newWebappPath) {
		String oldWebappPath = webappPath;
		webappPath = newWebappPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE__WEBAPP_PATH, oldWebappPath, webappPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getWebAnalyticsConfigs() {
		if (webAnalyticsConfigs == null) {
			webAnalyticsConfigs = new EDataTypeUniqueEList<String>(String.class, this, WebsitePackage.WEB_SITE__WEB_ANALYTICS_CONFIGS);
		}
		return webAnalyticsConfigs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> orderHeaders() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> subscriptionResources() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> webPages() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.WEB_SITE__WEB_SITE_ID:
				return getWebSiteId();
			case WebsitePackage.WEB_SITE__ALLOW_PRODUCT_STORE_CHANGE:
				return isAllowProductStoreChange();
			case WebsitePackage.WEB_SITE__COOKIE_DOMAIN:
				return getCookieDomain();
			case WebsitePackage.WEB_SITE__DISPLAY_MAINTENANCE_PAGE:
				return isDisplayMaintenancePage();
			case WebsitePackage.WEB_SITE__ENABLE_HTTPS:
				return isEnableHttps();
			case WebsitePackage.WEB_SITE__HOSTED_PATH_ALIAS:
				return getHostedPathAlias();
			case WebsitePackage.WEB_SITE__HTTP_HOST:
				return getHttpHost();
			case WebsitePackage.WEB_SITE__HTTP_PORT:
				return getHttpPort();
			case WebsitePackage.WEB_SITE__HTTPS_HOST:
				return getHttpsHost();
			case WebsitePackage.WEB_SITE__HTTPS_PORT:
				return getHttpsPort();
			case WebsitePackage.WEB_SITE__IS_DEFAULT:
				return isIsDefault();
			case WebsitePackage.WEB_SITE__SECURE_CONTENT_PREFIX:
				return getSecureContentPrefix();
			case WebsitePackage.WEB_SITE__SITE_NAME:
				return getSiteName();
			case WebsitePackage.WEB_SITE__STANDARD_CONTENT_PREFIX:
				return getStandardContentPrefix();
			case WebsitePackage.WEB_SITE__WEBAPP_PATH:
				return getWebappPath();
			case WebsitePackage.WEB_SITE__VISUAL_THEME_SET_ID:
				if (resolve) return getVisualThemeSetId();
				return basicGetVisualThemeSetId();
			case WebsitePackage.WEB_SITE__PRODUCT_STORE_ID:
				if (resolve) return getProductStoreId();
				return basicGetProductStoreId();
			case WebsitePackage.WEB_SITE__WEB_ANALYTICS_CONFIGS:
				return getWebAnalyticsConfigs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebsitePackage.WEB_SITE__WEB_SITE_ID:
				setWebSiteId((String)newValue);
				return;
			case WebsitePackage.WEB_SITE__ALLOW_PRODUCT_STORE_CHANGE:
				setAllowProductStoreChange((Boolean)newValue);
				return;
			case WebsitePackage.WEB_SITE__COOKIE_DOMAIN:
				setCookieDomain((String)newValue);
				return;
			case WebsitePackage.WEB_SITE__DISPLAY_MAINTENANCE_PAGE:
				setDisplayMaintenancePage((Boolean)newValue);
				return;
			case WebsitePackage.WEB_SITE__ENABLE_HTTPS:
				setEnableHttps((Boolean)newValue);
				return;
			case WebsitePackage.WEB_SITE__HOSTED_PATH_ALIAS:
				setHostedPathAlias((String)newValue);
				return;
			case WebsitePackage.WEB_SITE__HTTP_HOST:
				setHttpHost((String)newValue);
				return;
			case WebsitePackage.WEB_SITE__HTTP_PORT:
				setHttpPort((String)newValue);
				return;
			case WebsitePackage.WEB_SITE__HTTPS_HOST:
				setHttpsHost((String)newValue);
				return;
			case WebsitePackage.WEB_SITE__HTTPS_PORT:
				setHttpsPort((String)newValue);
				return;
			case WebsitePackage.WEB_SITE__IS_DEFAULT:
				setIsDefault((Boolean)newValue);
				return;
			case WebsitePackage.WEB_SITE__SECURE_CONTENT_PREFIX:
				setSecureContentPrefix((String)newValue);
				return;
			case WebsitePackage.WEB_SITE__SITE_NAME:
				setSiteName((String)newValue);
				return;
			case WebsitePackage.WEB_SITE__STANDARD_CONTENT_PREFIX:
				setStandardContentPrefix((String)newValue);
				return;
			case WebsitePackage.WEB_SITE__WEBAPP_PATH:
				setWebappPath((String)newValue);
				return;
			case WebsitePackage.WEB_SITE__VISUAL_THEME_SET_ID:
				setVisualThemeSetId((VisualThemeSet)newValue);
				return;
			case WebsitePackage.WEB_SITE__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)newValue);
				return;
			case WebsitePackage.WEB_SITE__WEB_ANALYTICS_CONFIGS:
				getWebAnalyticsConfigs().clear();
				getWebAnalyticsConfigs().addAll((Collection<? extends String>)newValue);
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
			case WebsitePackage.WEB_SITE__WEB_SITE_ID:
				setWebSiteId(WEB_SITE_ID_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE__ALLOW_PRODUCT_STORE_CHANGE:
				setAllowProductStoreChange(ALLOW_PRODUCT_STORE_CHANGE_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE__COOKIE_DOMAIN:
				setCookieDomain(COOKIE_DOMAIN_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE__DISPLAY_MAINTENANCE_PAGE:
				setDisplayMaintenancePage(DISPLAY_MAINTENANCE_PAGE_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE__ENABLE_HTTPS:
				setEnableHttps(ENABLE_HTTPS_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE__HOSTED_PATH_ALIAS:
				setHostedPathAlias(HOSTED_PATH_ALIAS_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE__HTTP_HOST:
				setHttpHost(HTTP_HOST_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE__HTTP_PORT:
				setHttpPort(HTTP_PORT_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE__HTTPS_HOST:
				setHttpsHost(HTTPS_HOST_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE__HTTPS_PORT:
				setHttpsPort(HTTPS_PORT_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE__IS_DEFAULT:
				setIsDefault(IS_DEFAULT_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE__SECURE_CONTENT_PREFIX:
				setSecureContentPrefix(SECURE_CONTENT_PREFIX_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE__SITE_NAME:
				setSiteName(SITE_NAME_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE__STANDARD_CONTENT_PREFIX:
				setStandardContentPrefix(STANDARD_CONTENT_PREFIX_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE__WEBAPP_PATH:
				setWebappPath(WEBAPP_PATH_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE__VISUAL_THEME_SET_ID:
				setVisualThemeSetId((VisualThemeSet)null);
				return;
			case WebsitePackage.WEB_SITE__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)null);
				return;
			case WebsitePackage.WEB_SITE__WEB_ANALYTICS_CONFIGS:
				getWebAnalyticsConfigs().clear();
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
			case WebsitePackage.WEB_SITE__WEB_SITE_ID:
				return WEB_SITE_ID_EDEFAULT == null ? webSiteId != null : !WEB_SITE_ID_EDEFAULT.equals(webSiteId);
			case WebsitePackage.WEB_SITE__ALLOW_PRODUCT_STORE_CHANGE:
				return allowProductStoreChange != ALLOW_PRODUCT_STORE_CHANGE_EDEFAULT;
			case WebsitePackage.WEB_SITE__COOKIE_DOMAIN:
				return COOKIE_DOMAIN_EDEFAULT == null ? cookieDomain != null : !COOKIE_DOMAIN_EDEFAULT.equals(cookieDomain);
			case WebsitePackage.WEB_SITE__DISPLAY_MAINTENANCE_PAGE:
				return displayMaintenancePage != DISPLAY_MAINTENANCE_PAGE_EDEFAULT;
			case WebsitePackage.WEB_SITE__ENABLE_HTTPS:
				return enableHttps != ENABLE_HTTPS_EDEFAULT;
			case WebsitePackage.WEB_SITE__HOSTED_PATH_ALIAS:
				return HOSTED_PATH_ALIAS_EDEFAULT == null ? hostedPathAlias != null : !HOSTED_PATH_ALIAS_EDEFAULT.equals(hostedPathAlias);
			case WebsitePackage.WEB_SITE__HTTP_HOST:
				return HTTP_HOST_EDEFAULT == null ? httpHost != null : !HTTP_HOST_EDEFAULT.equals(httpHost);
			case WebsitePackage.WEB_SITE__HTTP_PORT:
				return HTTP_PORT_EDEFAULT == null ? httpPort != null : !HTTP_PORT_EDEFAULT.equals(httpPort);
			case WebsitePackage.WEB_SITE__HTTPS_HOST:
				return HTTPS_HOST_EDEFAULT == null ? httpsHost != null : !HTTPS_HOST_EDEFAULT.equals(httpsHost);
			case WebsitePackage.WEB_SITE__HTTPS_PORT:
				return HTTPS_PORT_EDEFAULT == null ? httpsPort != null : !HTTPS_PORT_EDEFAULT.equals(httpsPort);
			case WebsitePackage.WEB_SITE__IS_DEFAULT:
				return isDefault != IS_DEFAULT_EDEFAULT;
			case WebsitePackage.WEB_SITE__SECURE_CONTENT_PREFIX:
				return SECURE_CONTENT_PREFIX_EDEFAULT == null ? secureContentPrefix != null : !SECURE_CONTENT_PREFIX_EDEFAULT.equals(secureContentPrefix);
			case WebsitePackage.WEB_SITE__SITE_NAME:
				return SITE_NAME_EDEFAULT == null ? siteName != null : !SITE_NAME_EDEFAULT.equals(siteName);
			case WebsitePackage.WEB_SITE__STANDARD_CONTENT_PREFIX:
				return STANDARD_CONTENT_PREFIX_EDEFAULT == null ? standardContentPrefix != null : !STANDARD_CONTENT_PREFIX_EDEFAULT.equals(standardContentPrefix);
			case WebsitePackage.WEB_SITE__WEBAPP_PATH:
				return WEBAPP_PATH_EDEFAULT == null ? webappPath != null : !WEBAPP_PATH_EDEFAULT.equals(webappPath);
			case WebsitePackage.WEB_SITE__VISUAL_THEME_SET_ID:
				return visualThemeSetId != null;
			case WebsitePackage.WEB_SITE__PRODUCT_STORE_ID:
				return productStoreId != null;
			case WebsitePackage.WEB_SITE__WEB_ANALYTICS_CONFIGS:
				return webAnalyticsConfigs != null && !webAnalyticsConfigs.isEmpty();
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
		result.append(" (webSiteId: ");
		result.append(webSiteId);
		result.append(", allowProductStoreChange: ");
		result.append(allowProductStoreChange);
		result.append(", cookieDomain: ");
		result.append(cookieDomain);
		result.append(", displayMaintenancePage: ");
		result.append(displayMaintenancePage);
		result.append(", enableHttps: ");
		result.append(enableHttps);
		result.append(", hostedPathAlias: ");
		result.append(hostedPathAlias);
		result.append(", httpHost: ");
		result.append(httpHost);
		result.append(", httpPort: ");
		result.append(httpPort);
		result.append(", httpsHost: ");
		result.append(httpsHost);
		result.append(", httpsPort: ");
		result.append(httpsPort);
		result.append(", isDefault: ");
		result.append(isDefault);
		result.append(", secureContentPrefix: ");
		result.append(secureContentPrefix);
		result.append(", siteName: ");
		result.append(siteName);
		result.append(", standardContentPrefix: ");
		result.append(standardContentPrefix);
		result.append(", webappPath: ");
		result.append(webappPath);
		result.append(", webAnalyticsConfigs: ");
		result.append(webAnalyticsConfigs);
		result.append(')');
		return result.toString();
	}

} //WebSiteImpl
