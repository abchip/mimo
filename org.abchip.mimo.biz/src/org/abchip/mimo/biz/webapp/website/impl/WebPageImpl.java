/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.webapp.website.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.webapp.website.WebPage;
import org.abchip.mimo.biz.webapp.website.WebsitePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.impl.WebPageImpl#getWebPageId <em>Web Page Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.impl.WebPageImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.impl.WebPageImpl#getPageName <em>Page Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.website.impl.WebPageImpl#getWebSiteId <em>Web Site Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebPageImpl extends BizEntityImpl implements WebPage {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getWebPageId() <em>Web Page Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebPageId()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_PAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebPageId() <em>Web Page Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebPageId()
	 * @generated
	 * @ordered
	 */
	protected String webPageId = WEB_PAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentId() <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentId() <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected String contentId = CONTENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPageName() <em>Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageName() <em>Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageName()
	 * @generated
	 * @ordered
	 */
	protected String pageName = PAGE_NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.WEB_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebPageId() {
		return webPageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebPageId(String newWebPageId) {
		String oldWebPageId = webPageId;
		webPageId = newWebPageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_PAGE__WEB_PAGE_ID, oldWebPageId, webPageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentId() {
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentId(String newContentId) {
		String oldContentId = contentId;
		contentId = newContentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_PAGE__CONTENT_ID, oldContentId, contentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPageName() {
		return pageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPageName(String newPageName) {
		String oldPageName = pageName;
		pageName = newPageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_PAGE__PAGE_NAME, oldPageName, pageName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_PAGE__WEB_SITE_ID, oldWebSiteId, webSiteId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.WEB_PAGE__WEB_PAGE_ID:
				return getWebPageId();
			case WebsitePackage.WEB_PAGE__CONTENT_ID:
				return getContentId();
			case WebsitePackage.WEB_PAGE__PAGE_NAME:
				return getPageName();
			case WebsitePackage.WEB_PAGE__WEB_SITE_ID:
				return getWebSiteId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebsitePackage.WEB_PAGE__WEB_PAGE_ID:
				setWebPageId((String)newValue);
				return;
			case WebsitePackage.WEB_PAGE__CONTENT_ID:
				setContentId((String)newValue);
				return;
			case WebsitePackage.WEB_PAGE__PAGE_NAME:
				setPageName((String)newValue);
				return;
			case WebsitePackage.WEB_PAGE__WEB_SITE_ID:
				setWebSiteId((String)newValue);
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
			case WebsitePackage.WEB_PAGE__WEB_PAGE_ID:
				setWebPageId(WEB_PAGE_ID_EDEFAULT);
				return;
			case WebsitePackage.WEB_PAGE__CONTENT_ID:
				setContentId(CONTENT_ID_EDEFAULT);
				return;
			case WebsitePackage.WEB_PAGE__PAGE_NAME:
				setPageName(PAGE_NAME_EDEFAULT);
				return;
			case WebsitePackage.WEB_PAGE__WEB_SITE_ID:
				setWebSiteId(WEB_SITE_ID_EDEFAULT);
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
			case WebsitePackage.WEB_PAGE__WEB_PAGE_ID:
				return WEB_PAGE_ID_EDEFAULT == null ? webPageId != null : !WEB_PAGE_ID_EDEFAULT.equals(webPageId);
			case WebsitePackage.WEB_PAGE__CONTENT_ID:
				return CONTENT_ID_EDEFAULT == null ? contentId != null : !CONTENT_ID_EDEFAULT.equals(contentId);
			case WebsitePackage.WEB_PAGE__PAGE_NAME:
				return PAGE_NAME_EDEFAULT == null ? pageName != null : !PAGE_NAME_EDEFAULT.equals(pageName);
			case WebsitePackage.WEB_PAGE__WEB_SITE_ID:
				return WEB_SITE_ID_EDEFAULT == null ? webSiteId != null : !WEB_SITE_ID_EDEFAULT.equals(webSiteId);
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
		result.append(" (webPageId: ");
		result.append(webPageId);
		result.append(", contentId: ");
		result.append(contentId);
		result.append(", pageName: ");
		result.append(pageName);
		result.append(", webSiteId: ");
		result.append(webSiteId);
		result.append(')');
		return result.toString();
	}

} //WebPageImpl
