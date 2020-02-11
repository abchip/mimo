/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.website;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.content.website.WebsitePackage
 * @generated
 */
public interface WebsiteFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebsiteFactory eINSTANCE = org.abchip.mimo.biz.content.website.impl.WebsiteFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Web Analytics Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Analytics Config</em>'.
	 * @generated
	 */
	WebAnalyticsConfig createWebAnalyticsConfig();

	/**
	 * Returns a new object of class '<em>Web Analytics Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Analytics Type</em>'.
	 * @generated
	 */
	WebAnalyticsType createWebAnalyticsType();

	/**
	 * Returns a new object of class '<em>Web Site Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Site Content</em>'.
	 * @generated
	 */
	WebSiteContent createWebSiteContent();

	/**
	 * Returns a new object of class '<em>Web Site Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Site Content Type</em>'.
	 * @generated
	 */
	WebSiteContentType createWebSiteContentType();

	/**
	 * Returns a new object of class '<em>Web Site Path Alias</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Site Path Alias</em>'.
	 * @generated
	 */
	WebSitePathAlias createWebSitePathAlias();

	/**
	 * Returns a new object of class '<em>Web Site Publish Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Site Publish Point</em>'.
	 * @generated
	 */
	WebSitePublishPoint createWebSitePublishPoint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WebsitePackage getWebsitePackage();

} //WebsiteFactory
