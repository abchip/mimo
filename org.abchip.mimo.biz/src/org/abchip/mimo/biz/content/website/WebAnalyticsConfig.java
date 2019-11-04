/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.website;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Analytics Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.website.WebAnalyticsConfig#getWebSiteId <em>Web Site Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.WebAnalyticsConfig#getWebAnalyticsCode <em>Web Analytics Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.WebAnalyticsConfig#getWebAnalyticsTypeId <em>Web Analytics Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.website.WebsitePackage#getWebAnalyticsConfig()
 * @model
 * @generated
 */
public interface WebAnalyticsConfig extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Web Analytics Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Analytics Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Analytics Code</em>' attribute.
	 * @see #setWebAnalyticsCode(String)
	 * @see org.abchip.mimo.biz.content.website.WebsitePackage#getWebAnalyticsConfig_WebAnalyticsCode()
	 * @model
	 * @generated
	 */
	String getWebAnalyticsCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.website.WebAnalyticsConfig#getWebAnalyticsCode <em>Web Analytics Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Analytics Code</em>' attribute.
	 * @see #getWebAnalyticsCode()
	 * @generated
	 */
	void setWebAnalyticsCode(String value);

	/**
	 * Returns the value of the '<em><b>Web Analytics Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Analytics Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Analytics Type Id</em>' reference.
	 * @see #setWebAnalyticsTypeId(WebAnalyticsType)
	 * @see org.abchip.mimo.biz.content.website.WebsitePackage#getWebAnalyticsConfig_WebAnalyticsTypeId()
	 * @model keys="webAnalyticsTypeId"
	 * @generated
	 */
	WebAnalyticsType getWebAnalyticsTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.website.WebAnalyticsConfig#getWebAnalyticsTypeId <em>Web Analytics Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Analytics Type Id</em>' reference.
	 * @see #getWebAnalyticsTypeId()
	 * @generated
	 */
	void setWebAnalyticsTypeId(WebAnalyticsType value);

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
	 * @see org.abchip.mimo.biz.content.website.WebsitePackage#getWebAnalyticsConfig_WebSiteId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getWebSiteId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.website.WebAnalyticsConfig#getWebSiteId <em>Web Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Site Id</em>' attribute.
	 * @see #getWebSiteId()
	 * @generated
	 */
	void setWebSiteId(String value);

} // WebAnalyticsConfig
