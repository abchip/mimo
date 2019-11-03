/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.webapp.website;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.WebSite#getWebSiteId <em>Web Site Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.WebSite#isAllowProductStoreChange <em>Allow Product Store Change</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.WebSite#getCookieDomain <em>Cookie Domain</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.WebSite#isDisplayMaintenancePage <em>Display Maintenance Page</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.WebSite#isEnableHttps <em>Enable Https</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.WebSite#getHostedPathAlias <em>Hosted Path Alias</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.WebSite#getHttpHost <em>Http Host</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.WebSite#getHttpPort <em>Http Port</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.WebSite#getHttpsHost <em>Https Host</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.WebSite#getHttpsPort <em>Https Port</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.WebSite#isIsDefault <em>Is Default</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.WebSite#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.WebSite#getSecureContentPrefix <em>Secure Content Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.WebSite#getSiteName <em>Site Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.WebSite#getStandardContentPrefix <em>Standard Content Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.WebSite#getVisualThemeSetId <em>Visual Theme Set Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.WebSite#getWebappPath <em>Webapp Path</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.WebSite#getWebAnalyticsConfigs <em>Web Analytics Configs</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.webapp.website.WebsitePackage#getWebSite()
 * @model
 * @generated
 */
public interface WebSite extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Web Site Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Site Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Site Id</em>' attribute.
	 * @see #setWebSiteId(String)
	 * @see org.abchip.mimo.biz.webapp.website.WebsitePackage#getWebSite_WebSiteId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getWebSiteId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.website.WebSite#getWebSiteId <em>Web Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Site Id</em>' attribute.
	 * @see #getWebSiteId()
	 * @generated
	 */
	void setWebSiteId(String value);

	/**
	 * Returns the value of the '<em><b>Allow Product Store Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Product Store Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Product Store Change</em>' attribute.
	 * @see #setAllowProductStoreChange(boolean)
	 * @see org.abchip.mimo.biz.webapp.website.WebsitePackage#getWebSite_AllowProductStoreChange()
	 * @model
	 * @generated
	 */
	boolean isAllowProductStoreChange();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.website.WebSite#isAllowProductStoreChange <em>Allow Product Store Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Product Store Change</em>' attribute.
	 * @see #isAllowProductStoreChange()
	 * @generated
	 */
	void setAllowProductStoreChange(boolean value);

	/**
	 * Returns the value of the '<em><b>Cookie Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cookie Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookie Domain</em>' attribute.
	 * @see #setCookieDomain(String)
	 * @see org.abchip.mimo.biz.webapp.website.WebsitePackage#getWebSite_CookieDomain()
	 * @model
	 * @generated
	 */
	String getCookieDomain();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.website.WebSite#getCookieDomain <em>Cookie Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cookie Domain</em>' attribute.
	 * @see #getCookieDomain()
	 * @generated
	 */
	void setCookieDomain(String value);

	/**
	 * Returns the value of the '<em><b>Display Maintenance Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Maintenance Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Maintenance Page</em>' attribute.
	 * @see #setDisplayMaintenancePage(boolean)
	 * @see org.abchip.mimo.biz.webapp.website.WebsitePackage#getWebSite_DisplayMaintenancePage()
	 * @model
	 * @generated
	 */
	boolean isDisplayMaintenancePage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.website.WebSite#isDisplayMaintenancePage <em>Display Maintenance Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Maintenance Page</em>' attribute.
	 * @see #isDisplayMaintenancePage()
	 * @generated
	 */
	void setDisplayMaintenancePage(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Https</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Https</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Https</em>' attribute.
	 * @see #setEnableHttps(boolean)
	 * @see org.abchip.mimo.biz.webapp.website.WebsitePackage#getWebSite_EnableHttps()
	 * @model
	 * @generated
	 */
	boolean isEnableHttps();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.website.WebSite#isEnableHttps <em>Enable Https</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Https</em>' attribute.
	 * @see #isEnableHttps()
	 * @generated
	 */
	void setEnableHttps(boolean value);

	/**
	 * Returns the value of the '<em><b>Hosted Path Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hosted Path Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosted Path Alias</em>' attribute.
	 * @see #setHostedPathAlias(String)
	 * @see org.abchip.mimo.biz.webapp.website.WebsitePackage#getWebSite_HostedPathAlias()
	 * @model
	 * @generated
	 */
	String getHostedPathAlias();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.website.WebSite#getHostedPathAlias <em>Hosted Path Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hosted Path Alias</em>' attribute.
	 * @see #getHostedPathAlias()
	 * @generated
	 */
	void setHostedPathAlias(String value);

	/**
	 * Returns the value of the '<em><b>Http Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Http Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Host</em>' attribute.
	 * @see #setHttpHost(String)
	 * @see org.abchip.mimo.biz.webapp.website.WebsitePackage#getWebSite_HttpHost()
	 * @model
	 * @generated
	 */
	String getHttpHost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.website.WebSite#getHttpHost <em>Http Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Host</em>' attribute.
	 * @see #getHttpHost()
	 * @generated
	 */
	void setHttpHost(String value);

	/**
	 * Returns the value of the '<em><b>Http Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Http Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Port</em>' attribute.
	 * @see #setHttpPort(String)
	 * @see org.abchip.mimo.biz.webapp.website.WebsitePackage#getWebSite_HttpPort()
	 * @model
	 * @generated
	 */
	String getHttpPort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.website.WebSite#getHttpPort <em>Http Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Port</em>' attribute.
	 * @see #getHttpPort()
	 * @generated
	 */
	void setHttpPort(String value);

	/**
	 * Returns the value of the '<em><b>Https Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Https Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Https Host</em>' attribute.
	 * @see #setHttpsHost(String)
	 * @see org.abchip.mimo.biz.webapp.website.WebsitePackage#getWebSite_HttpsHost()
	 * @model
	 * @generated
	 */
	String getHttpsHost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.website.WebSite#getHttpsHost <em>Https Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Https Host</em>' attribute.
	 * @see #getHttpsHost()
	 * @generated
	 */
	void setHttpsHost(String value);

	/**
	 * Returns the value of the '<em><b>Https Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Https Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Https Port</em>' attribute.
	 * @see #setHttpsPort(String)
	 * @see org.abchip.mimo.biz.webapp.website.WebsitePackage#getWebSite_HttpsPort()
	 * @model
	 * @generated
	 */
	String getHttpsPort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.website.WebSite#getHttpsPort <em>Https Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Https Port</em>' attribute.
	 * @see #getHttpsPort()
	 * @generated
	 */
	void setHttpsPort(String value);

	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(boolean)
	 * @see org.abchip.mimo.biz.webapp.website.WebsitePackage#getWebSite_IsDefault()
	 * @model
	 * @generated
	 */
	boolean isIsDefault();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.website.WebSite#isIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #isIsDefault()
	 * @generated
	 */
	void setIsDefault(boolean value);

	/**
	 * Returns the value of the '<em><b>Product Store Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' attribute.
	 * @see #setProductStoreId(String)
	 * @see org.abchip.mimo.biz.webapp.website.WebsitePackage#getWebSite_ProductStoreId()
	 * @model annotation="mimo-ent-domain frame='ProductStore'"
	 * @generated
	 */
	String getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.website.WebSite#getProductStoreId <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' attribute.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(String value);

	/**
	 * Returns the value of the '<em><b>Secure Content Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secure Content Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secure Content Prefix</em>' attribute.
	 * @see #setSecureContentPrefix(String)
	 * @see org.abchip.mimo.biz.webapp.website.WebsitePackage#getWebSite_SecureContentPrefix()
	 * @model
	 * @generated
	 */
	String getSecureContentPrefix();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.website.WebSite#getSecureContentPrefix <em>Secure Content Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secure Content Prefix</em>' attribute.
	 * @see #getSecureContentPrefix()
	 * @generated
	 */
	void setSecureContentPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Site Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Name</em>' attribute.
	 * @see #setSiteName(String)
	 * @see org.abchip.mimo.biz.webapp.website.WebsitePackage#getWebSite_SiteName()
	 * @model
	 * @generated
	 */
	String getSiteName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.website.WebSite#getSiteName <em>Site Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Name</em>' attribute.
	 * @see #getSiteName()
	 * @generated
	 */
	void setSiteName(String value);

	/**
	 * Returns the value of the '<em><b>Standard Content Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Content Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Content Prefix</em>' attribute.
	 * @see #setStandardContentPrefix(String)
	 * @see org.abchip.mimo.biz.webapp.website.WebsitePackage#getWebSite_StandardContentPrefix()
	 * @model
	 * @generated
	 */
	String getStandardContentPrefix();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.website.WebSite#getStandardContentPrefix <em>Standard Content Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Content Prefix</em>' attribute.
	 * @see #getStandardContentPrefix()
	 * @generated
	 */
	void setStandardContentPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Visual Theme Set Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visual Theme Set Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual Theme Set Id</em>' attribute.
	 * @see #setVisualThemeSetId(String)
	 * @see org.abchip.mimo.biz.webapp.website.WebsitePackage#getWebSite_VisualThemeSetId()
	 * @model annotation="mimo-ent-domain frame='VisualThemeSet'"
	 * @generated
	 */
	String getVisualThemeSetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.website.WebSite#getVisualThemeSetId <em>Visual Theme Set Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visual Theme Set Id</em>' attribute.
	 * @see #getVisualThemeSetId()
	 * @generated
	 */
	void setVisualThemeSetId(String value);

	/**
	 * Returns the value of the '<em><b>Webapp Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Webapp Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webapp Path</em>' attribute.
	 * @see #setWebappPath(String)
	 * @see org.abchip.mimo.biz.webapp.website.WebsitePackage#getWebSite_WebappPath()
	 * @model
	 * @generated
	 */
	String getWebappPath();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.website.WebSite#getWebappPath <em>Webapp Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Webapp Path</em>' attribute.
	 * @see #getWebappPath()
	 * @generated
	 */
	void setWebappPath(String value);

	/**
	 * Returns the value of the '<em><b>Web Analytics Configs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Analytics Configs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Analytics Configs</em>' attribute list.
	 * @see org.abchip.mimo.biz.webapp.website.WebsitePackage#getWebSite_WebAnalyticsConfigs()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='WebAnalyticsConfig'"
	 * @generated
	 */
	List<String> getWebAnalyticsConfigs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderHeader' route='webSiteId'"
	 * @generated
	 */
	List<String> orderHeaders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SubscriptionResource' route='webSiteId'"
	 * @generated
	 */
	List<String> subscriptionResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='WebPage' route='webSiteId'"
	 * @generated
	 */
	List<String> webPages();

} // WebSite
