/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.website;

import java.util.Date;

import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.content.content.Content;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Site Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.website.WebSiteContent#getWebSiteId <em>Web Site Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.WebSiteContent#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.WebSiteContent#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.WebSiteContent#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.WebSiteContent#getWebSiteContentTypeId <em>Web Site Content Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.website.WebsitePackage#getWebSiteContent()
 * @model
 * @generated
 */
public interface WebSiteContent extends BizEntityTyped<WebSiteContentType> {
	/**
	 * Returns the value of the '<em><b>Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Id</em>' reference.
	 * @see #setContentId(Content)
	 * @see org.abchip.mimo.biz.content.website.WebsitePackage#getWebSiteContent_ContentId()
	 * @model keys="contentId"
	 * @generated
	 */
	Content getContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.website.WebSiteContent#getContentId <em>Content Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Id</em>' reference.
	 * @see #getContentId()
	 * @generated
	 */
	void setContentId(Content value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.content.website.WebsitePackage#getWebSiteContent_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.website.WebSiteContent#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.content.website.WebsitePackage#getWebSiteContent_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.website.WebSiteContent#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Web Site Content Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Site Content Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Site Content Type Id</em>' reference.
	 * @see #setWebSiteContentTypeId(WebSiteContentType)
	 * @see org.abchip.mimo.biz.content.website.WebsitePackage#getWebSiteContent_WebSiteContentTypeId()
	 * @model keys="webSiteContentTypeId"
	 * @generated
	 */
	WebSiteContentType getWebSiteContentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.website.WebSiteContent#getWebSiteContentTypeId <em>Web Site Content Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Site Content Type Id</em>' reference.
	 * @see #getWebSiteContentTypeId()
	 * @generated
	 */
	void setWebSiteContentTypeId(WebSiteContentType value);

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
	 * @see org.abchip.mimo.biz.content.website.WebsitePackage#getWebSiteContent_WebSiteId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getWebSiteId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.website.WebSiteContent#getWebSiteId <em>Web Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Site Id</em>' attribute.
	 * @see #getWebSiteId()
	 * @generated
	 */
	void setWebSiteId(String value);

} // WebSiteContent