/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.website.impl;

import org.abchip.mimo.biz.content.website.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebsiteFactoryImpl extends EFactoryImpl implements WebsiteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WebsiteFactory init() {
		try {
			WebsiteFactory theWebsiteFactory = (WebsiteFactory)EPackage.Registry.INSTANCE.getEFactory(WebsitePackage.eNS_URI);
			if (theWebsiteFactory != null) {
				return theWebsiteFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WebsiteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebsiteFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WebsitePackage.WEB_ANALYTICS_CONFIG: return (EObject)createWebAnalyticsConfig();
			case WebsitePackage.WEB_ANALYTICS_TYPE: return (EObject)createWebAnalyticsType();
			case WebsitePackage.WEB_SITE_CONTENT: return (EObject)createWebSiteContent();
			case WebsitePackage.WEB_SITE_CONTENT_TYPE: return (EObject)createWebSiteContentType();
			case WebsitePackage.WEB_SITE_PATH_ALIAS: return (EObject)createWebSitePathAlias();
			case WebsitePackage.WEB_SITE_PUBLISH_POINT: return (EObject)createWebSitePublishPoint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebAnalyticsConfig createWebAnalyticsConfig() {
		WebAnalyticsConfigImpl webAnalyticsConfig = new WebAnalyticsConfigImpl();
		return webAnalyticsConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebAnalyticsType createWebAnalyticsType() {
		WebAnalyticsTypeImpl webAnalyticsType = new WebAnalyticsTypeImpl();
		return webAnalyticsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebSiteContent createWebSiteContent() {
		WebSiteContentImpl webSiteContent = new WebSiteContentImpl();
		return webSiteContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebSiteContentType createWebSiteContentType() {
		WebSiteContentTypeImpl webSiteContentType = new WebSiteContentTypeImpl();
		return webSiteContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebSitePathAlias createWebSitePathAlias() {
		WebSitePathAliasImpl webSitePathAlias = new WebSitePathAliasImpl();
		return webSitePathAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebSitePublishPoint createWebSitePublishPoint() {
		WebSitePublishPointImpl webSitePublishPoint = new WebSitePublishPointImpl();
		return webSitePublishPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebsitePackage getWebsitePackage() {
		return (WebsitePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WebsitePackage getPackage() {
		return WebsitePackage.eINSTANCE;
	}

} //WebsiteFactoryImpl
