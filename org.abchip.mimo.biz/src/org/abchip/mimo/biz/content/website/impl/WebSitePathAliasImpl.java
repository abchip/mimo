/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.website.impl;

import java.util.Date;

import org.abchip.mimo.biz.content.website.WebSitePathAlias;
import org.abchip.mimo.biz.content.website.WebsitePackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Site Path Alias</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebSitePathAliasImpl#getWebSiteId <em>Web Site Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebSitePathAliasImpl#getPathAlias <em>Path Alias</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebSitePathAliasImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebSitePathAliasImpl#getAliasTo <em>Alias To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebSitePathAliasImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebSitePathAliasImpl#getMapKey <em>Map Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebSitePathAliasImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebSitePathAliasImpl extends BizEntityImpl implements WebSitePathAlias {
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
	 * The default value of the '{@link #getPathAlias() <em>Path Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathAlias() <em>Path Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathAlias()
	 * @generated
	 * @ordered
	 */
	protected String pathAlias = PATH_ALIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAliasTo() <em>Alias To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasTo()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAliasTo() <em>Alias To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasTo()
	 * @generated
	 * @ordered
	 */
	protected String aliasTo = ALIAS_TO_EDEFAULT;

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
	 * The default value of the '{@link #getMapKey() <em>Map Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapKey()
	 * @generated
	 * @ordered
	 */
	protected static final String MAP_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapKey() <em>Map Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapKey()
	 * @generated
	 * @ordered
	 */
	protected String mapKey = MAP_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebSitePathAliasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.WEB_SITE_PATH_ALIAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAliasTo() {
		return aliasTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAliasTo(String newAliasTo) {
		String oldAliasTo = aliasTo;
		aliasTo = newAliasTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE_PATH_ALIAS__ALIAS_TO, oldAliasTo, aliasTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE_PATH_ALIAS__CONTENT_ID, oldContentId, contentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE_PATH_ALIAS__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMapKey() {
		return mapKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMapKey(String newMapKey) {
		String oldMapKey = mapKey;
		mapKey = newMapKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE_PATH_ALIAS__MAP_KEY, oldMapKey, mapKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPathAlias() {
		return pathAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathAlias(String newPathAlias) {
		String oldPathAlias = pathAlias;
		pathAlias = newPathAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE_PATH_ALIAS__PATH_ALIAS, oldPathAlias, pathAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE_PATH_ALIAS__THRU_DATE, oldThruDate, thruDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_SITE_PATH_ALIAS__WEB_SITE_ID, oldWebSiteId, webSiteId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.WEB_SITE_PATH_ALIAS__WEB_SITE_ID:
				return getWebSiteId();
			case WebsitePackage.WEB_SITE_PATH_ALIAS__PATH_ALIAS:
				return getPathAlias();
			case WebsitePackage.WEB_SITE_PATH_ALIAS__FROM_DATE:
				return getFromDate();
			case WebsitePackage.WEB_SITE_PATH_ALIAS__ALIAS_TO:
				return getAliasTo();
			case WebsitePackage.WEB_SITE_PATH_ALIAS__CONTENT_ID:
				return getContentId();
			case WebsitePackage.WEB_SITE_PATH_ALIAS__MAP_KEY:
				return getMapKey();
			case WebsitePackage.WEB_SITE_PATH_ALIAS__THRU_DATE:
				return getThruDate();
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
			case WebsitePackage.WEB_SITE_PATH_ALIAS__WEB_SITE_ID:
				setWebSiteId((String)newValue);
				return;
			case WebsitePackage.WEB_SITE_PATH_ALIAS__PATH_ALIAS:
				setPathAlias((String)newValue);
				return;
			case WebsitePackage.WEB_SITE_PATH_ALIAS__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case WebsitePackage.WEB_SITE_PATH_ALIAS__ALIAS_TO:
				setAliasTo((String)newValue);
				return;
			case WebsitePackage.WEB_SITE_PATH_ALIAS__CONTENT_ID:
				setContentId((String)newValue);
				return;
			case WebsitePackage.WEB_SITE_PATH_ALIAS__MAP_KEY:
				setMapKey((String)newValue);
				return;
			case WebsitePackage.WEB_SITE_PATH_ALIAS__THRU_DATE:
				setThruDate((Date)newValue);
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
			case WebsitePackage.WEB_SITE_PATH_ALIAS__WEB_SITE_ID:
				setWebSiteId(WEB_SITE_ID_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE_PATH_ALIAS__PATH_ALIAS:
				setPathAlias(PATH_ALIAS_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE_PATH_ALIAS__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE_PATH_ALIAS__ALIAS_TO:
				setAliasTo(ALIAS_TO_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE_PATH_ALIAS__CONTENT_ID:
				setContentId(CONTENT_ID_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE_PATH_ALIAS__MAP_KEY:
				setMapKey(MAP_KEY_EDEFAULT);
				return;
			case WebsitePackage.WEB_SITE_PATH_ALIAS__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
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
			case WebsitePackage.WEB_SITE_PATH_ALIAS__WEB_SITE_ID:
				return WEB_SITE_ID_EDEFAULT == null ? webSiteId != null : !WEB_SITE_ID_EDEFAULT.equals(webSiteId);
			case WebsitePackage.WEB_SITE_PATH_ALIAS__PATH_ALIAS:
				return PATH_ALIAS_EDEFAULT == null ? pathAlias != null : !PATH_ALIAS_EDEFAULT.equals(pathAlias);
			case WebsitePackage.WEB_SITE_PATH_ALIAS__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case WebsitePackage.WEB_SITE_PATH_ALIAS__ALIAS_TO:
				return ALIAS_TO_EDEFAULT == null ? aliasTo != null : !ALIAS_TO_EDEFAULT.equals(aliasTo);
			case WebsitePackage.WEB_SITE_PATH_ALIAS__CONTENT_ID:
				return CONTENT_ID_EDEFAULT == null ? contentId != null : !CONTENT_ID_EDEFAULT.equals(contentId);
			case WebsitePackage.WEB_SITE_PATH_ALIAS__MAP_KEY:
				return MAP_KEY_EDEFAULT == null ? mapKey != null : !MAP_KEY_EDEFAULT.equals(mapKey);
			case WebsitePackage.WEB_SITE_PATH_ALIAS__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
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
		result.append(", pathAlias: ");
		result.append(pathAlias);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", aliasTo: ");
		result.append(aliasTo);
		result.append(", contentId: ");
		result.append(contentId);
		result.append(", mapKey: ");
		result.append(mapKey);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //WebSitePathAliasImpl
