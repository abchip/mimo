/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.website.impl;

import org.abchip.mimo.biz.content.website.WebAnalyticsConfig;
import org.abchip.mimo.biz.content.website.WebAnalyticsType;
import org.abchip.mimo.biz.content.website.WebsitePackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.webapp.website.WebSite;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Analytics Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebAnalyticsConfigImpl#getWebAnalyticsTypeId <em>Web Analytics Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebAnalyticsConfigImpl#getWebSiteId <em>Web Site Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebAnalyticsConfigImpl#getWebAnalyticsCode <em>Web Analytics Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebAnalyticsConfigImpl extends BizEntityTypedImpl<WebAnalyticsType> implements WebAnalyticsConfig {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebAnalyticsConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.WEB_ANALYTICS_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebAnalyticsCode() {
		return (String)eGet(WebsitePackage.Literals.WEB_ANALYTICS_CONFIG__WEB_ANALYTICS_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebAnalyticsCode(String newWebAnalyticsCode) {
		eSet(WebsitePackage.Literals.WEB_ANALYTICS_CONFIG__WEB_ANALYTICS_CODE, newWebAnalyticsCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebAnalyticsType getWebAnalyticsTypeId() {
		return (WebAnalyticsType)eGet(WebsitePackage.Literals.WEB_ANALYTICS_CONFIG__WEB_ANALYTICS_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebAnalyticsTypeId(WebAnalyticsType newWebAnalyticsTypeId) {
		eSet(WebsitePackage.Literals.WEB_ANALYTICS_CONFIG__WEB_ANALYTICS_TYPE_ID, newWebAnalyticsTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebSite getWebSiteId() {
		return (WebSite)eGet(WebsitePackage.Literals.WEB_ANALYTICS_CONFIG__WEB_SITE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebSiteId(WebSite newWebSiteId) {
		eSet(WebsitePackage.Literals.WEB_ANALYTICS_CONFIG__WEB_SITE_ID, newWebSiteId);
	}

} //WebAnalyticsConfigImpl
