/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.webapp.website;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.WebPage#getWebPageId <em>Web Page Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.WebPage#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.WebPage#getPageName <em>Page Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.WebPage#getWebSiteId <em>Web Site Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.webapp.website.WebsitePackage#getWebPage()
 * @model
 * @generated
 */
public interface WebPage extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Web Page Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Page Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Page Id</em>' attribute.
	 * @see #setWebPageId(String)
	 * @see org.abchip.mimo.biz.webapp.website.WebsitePackage#getWebPage_WebPageId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getWebPageId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.website.WebPage#getWebPageId <em>Web Page Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Page Id</em>' attribute.
	 * @see #getWebPageId()
	 * @generated
	 */
	void setWebPageId(String value);

	/**
	 * Returns the value of the '<em><b>Content Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Id</em>' attribute.
	 * @see #setContentId(String)
	 * @see org.abchip.mimo.biz.webapp.website.WebsitePackage#getWebPage_ContentId()
	 * @model annotation="mimo-ent-domain frame='Content'"
	 * @generated
	 */
	String getContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.website.WebPage#getContentId <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Id</em>' attribute.
	 * @see #getContentId()
	 * @generated
	 */
	void setContentId(String value);

	/**
	 * Returns the value of the '<em><b>Page Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Name</em>' attribute.
	 * @see #setPageName(String)
	 * @see org.abchip.mimo.biz.webapp.website.WebsitePackage#getWebPage_PageName()
	 * @model
	 * @generated
	 */
	String getPageName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.website.WebPage#getPageName <em>Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Name</em>' attribute.
	 * @see #getPageName()
	 * @generated
	 */
	void setPageName(String value);

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
	 * @see org.abchip.mimo.biz.webapp.website.WebsitePackage#getWebPage_WebSiteId()
	 * @model annotation="mimo-ent-domain frame='WebSite'"
	 * @generated
	 */
	String getWebSiteId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.website.WebPage#getWebSiteId <em>Web Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Site Id</em>' attribute.
	 * @see #getWebSiteId()
	 * @generated
	 */
	void setWebSiteId(String value);

} // WebPage
