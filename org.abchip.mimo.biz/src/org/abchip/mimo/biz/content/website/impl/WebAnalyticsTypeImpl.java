/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.website.impl;

import java.util.List;

import org.abchip.mimo.biz.content.website.WebAnalyticsType;
import org.abchip.mimo.biz.content.website.WebsitePackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Analytics Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebAnalyticsTypeImpl#getWebAnalyticsTypeId <em>Web Analytics Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebAnalyticsTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebAnalyticsTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.website.impl.WebAnalyticsTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebAnalyticsTypeImpl extends BizEntityImpl implements WebAnalyticsType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_TABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected boolean hasTable = HAS_TABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected WebAnalyticsType parentTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebAnalyticsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebsitePackage.Literals.WEB_ANALYTICS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_ANALYTICS_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return hasTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		boolean oldHasTable = hasTable;
		hasTable = newHasTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_ANALYTICS_TYPE__HAS_TABLE, oldHasTable, hasTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebAnalyticsType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (WebAnalyticsType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebsitePackage.WEB_ANALYTICS_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebAnalyticsType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(WebAnalyticsType newParentTypeId) {
		WebAnalyticsType oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_ANALYTICS_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childWebAnalyticsTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> webAnalyticsConfigs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebsitePackage.WEB_ANALYTICS_TYPE__WEB_ANALYTICS_TYPE_ID, oldWebAnalyticsTypeId, webAnalyticsTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebsitePackage.WEB_ANALYTICS_TYPE__WEB_ANALYTICS_TYPE_ID:
				return getWebAnalyticsTypeId();
			case WebsitePackage.WEB_ANALYTICS_TYPE__DESCRIPTION:
				return getDescription();
			case WebsitePackage.WEB_ANALYTICS_TYPE__HAS_TABLE:
				return isHasTable();
			case WebsitePackage.WEB_ANALYTICS_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
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
			case WebsitePackage.WEB_ANALYTICS_TYPE__WEB_ANALYTICS_TYPE_ID:
				setWebAnalyticsTypeId((String)newValue);
				return;
			case WebsitePackage.WEB_ANALYTICS_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WebsitePackage.WEB_ANALYTICS_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case WebsitePackage.WEB_ANALYTICS_TYPE__PARENT_TYPE_ID:
				setParentTypeId((WebAnalyticsType)newValue);
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
			case WebsitePackage.WEB_ANALYTICS_TYPE__WEB_ANALYTICS_TYPE_ID:
				setWebAnalyticsTypeId(WEB_ANALYTICS_TYPE_ID_EDEFAULT);
				return;
			case WebsitePackage.WEB_ANALYTICS_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WebsitePackage.WEB_ANALYTICS_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case WebsitePackage.WEB_ANALYTICS_TYPE__PARENT_TYPE_ID:
				setParentTypeId((WebAnalyticsType)null);
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
			case WebsitePackage.WEB_ANALYTICS_TYPE__WEB_ANALYTICS_TYPE_ID:
				return WEB_ANALYTICS_TYPE_ID_EDEFAULT == null ? webAnalyticsTypeId != null : !WEB_ANALYTICS_TYPE_ID_EDEFAULT.equals(webAnalyticsTypeId);
			case WebsitePackage.WEB_ANALYTICS_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WebsitePackage.WEB_ANALYTICS_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case WebsitePackage.WEB_ANALYTICS_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
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
		result.append(" (webAnalyticsTypeId: ");
		result.append(webAnalyticsTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(')');
		return result.toString();
	}

} //WebAnalyticsTypeImpl
