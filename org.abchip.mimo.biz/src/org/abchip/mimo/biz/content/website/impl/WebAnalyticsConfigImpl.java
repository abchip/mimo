/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.website.impl;

import org.abchip.mimo.biz.content.website.WebAnalyticsConfig;
import org.abchip.mimo.biz.content.website.WebsitePackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Analytics Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebAnalyticsConfigImpl#getWebSiteId <em>Web Site Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebAnalyticsConfigImpl#getWebAnalyticsTypeId <em>Web Analytics Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebAnalyticsConfigImpl#getWebAnalyticsCode <em>Web Analytics Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebAnalyticsConfigImpl extends BizEntityImpl implements WebAnalyticsConfig {
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
	 * The default value of the '{@link #getWebAnalyticsTypeId() <em>Web Analytics Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebAnalyticsTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_ANALYTICS_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebAnalyticsTypeId() <em>Web Analytics Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebAnalyticsTypeId()
	 * @generated
	 * @ordered
	 */
	protected String webAnalyticsTypeId = WEB_ANALYTICS_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebAnalyticsCode() <em>Web Analytics Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebAnalyticsCode()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_ANALYTICS_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebAnalyticsCode() <em>Web Analytics Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebAnalyticsCode()
	 * @generated
	 * @ordered
	 */
	protected String webAnalyticsCode = WEB_ANALYTICS_CODE_EDEFAULT;

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
		return webAnalyticsCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebAnalyticsCode(String newWebAnalyticsCode) {
		String oldWebAnalyticsCode = webAnalyticsCode;
		webAnalyticsCode = newWebAnalyticsCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_ANALYTICS_CONFIG__WEB_ANALYTICS_CODE, oldWebAnalyticsCode, webAnalyticsCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebAnalyticsTypeId() {
		return webAnalyticsTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebAnalyticsTypeId(String newWebAnalyticsTypeId) {
		String oldWebAnalyticsTypeId = webAnalyticsTypeId;
		webAnalyticsTypeId = newWebAnalyticsTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_ANALYTICS_CONFIG__WEB_ANALYTICS_TYPE_ID, oldWebAnalyticsTypeId, webAnalyticsTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_ANALYTICS_CONFIG__WEB_SITE_ID, oldWebSiteId, webSiteId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.WEB_ANALYTICS_CONFIG__WEB_SITE_ID:
				return getWebSiteId();
			case WebsitePackage.WEB_ANALYTICS_CONFIG__WEB_ANALYTICS_TYPE_ID:
				return getWebAnalyticsTypeId();
			case WebsitePackage.WEB_ANALYTICS_CONFIG__WEB_ANALYTICS_CODE:
				return getWebAnalyticsCode();
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
			case WebsitePackage.WEB_ANALYTICS_CONFIG__WEB_SITE_ID:
				setWebSiteId((String)newValue);
				return;
			case WebsitePackage.WEB_ANALYTICS_CONFIG__WEB_ANALYTICS_TYPE_ID:
				setWebAnalyticsTypeId((String)newValue);
				return;
			case WebsitePackage.WEB_ANALYTICS_CONFIG__WEB_ANALYTICS_CODE:
				setWebAnalyticsCode((String)newValue);
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
			case WebsitePackage.WEB_ANALYTICS_CONFIG__WEB_SITE_ID:
				setWebSiteId(WEB_SITE_ID_EDEFAULT);
				return;
			case WebsitePackage.WEB_ANALYTICS_CONFIG__WEB_ANALYTICS_TYPE_ID:
				setWebAnalyticsTypeId(WEB_ANALYTICS_TYPE_ID_EDEFAULT);
				return;
			case WebsitePackage.WEB_ANALYTICS_CONFIG__WEB_ANALYTICS_CODE:
				setWebAnalyticsCode(WEB_ANALYTICS_CODE_EDEFAULT);
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
			case WebsitePackage.WEB_ANALYTICS_CONFIG__WEB_SITE_ID:
				return WEB_SITE_ID_EDEFAULT == null ? webSiteId != null : !WEB_SITE_ID_EDEFAULT.equals(webSiteId);
			case WebsitePackage.WEB_ANALYTICS_CONFIG__WEB_ANALYTICS_TYPE_ID:
				return WEB_ANALYTICS_TYPE_ID_EDEFAULT == null ? webAnalyticsTypeId != null : !WEB_ANALYTICS_TYPE_ID_EDEFAULT.equals(webAnalyticsTypeId);
			case WebsitePackage.WEB_ANALYTICS_CONFIG__WEB_ANALYTICS_CODE:
				return WEB_ANALYTICS_CODE_EDEFAULT == null ? webAnalyticsCode != null : !WEB_ANALYTICS_CODE_EDEFAULT.equals(webAnalyticsCode);
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
		result.append(", webAnalyticsTypeId: ");
		result.append(webAnalyticsTypeId);
		result.append(", webAnalyticsCode: ");
		result.append(webAnalyticsCode);
		result.append(')');
		return result.toString();
	}

} //WebAnalyticsConfigImpl
