/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.website;

import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.webapp.website.WebSite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Analytics Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.website.WebAnalyticsConfig#getWebAnalyticsTypeId <em>Web Analytics Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.WebAnalyticsConfig#getWebSiteId <em>Web Site Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.WebAnalyticsConfig#getWebAnalyticsCode <em>Web Analytics Code</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.website.WebsitePackage#getWebAnalyticsConfig()
 * @model annotation="mimo-ent-frame title='Web Analytics Configuration'"
 * @generated
 */
public interface WebAnalyticsConfig extends BizEntityTyped<WebAnalyticsType> {
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
	 * @model annotation="mimo-ent-slot help='copy in here the analitics javascript code without the beginning- and end&lt;script&gt; tags'"
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
	 * @model keys="webAnalyticsTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
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
	 * Returns the value of the '<em><b>Web Site Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Site Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Site Id</em>' reference.
	 * @see #setWebSiteId(WebSite)
	 * @see org.abchip.mimo.biz.content.website.WebsitePackage#getWebAnalyticsConfig_WebSiteId()
	 * @model keys="webSiteId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	WebSite getWebSiteId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.website.WebAnalyticsConfig#getWebSiteId <em>Web Site Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Site Id</em>' reference.
	 * @see #getWebSiteId()
	 * @generated
	 */
	void setWebSiteId(WebSite value);

} // WebAnalyticsConfig
