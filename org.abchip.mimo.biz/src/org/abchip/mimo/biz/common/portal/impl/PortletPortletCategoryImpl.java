/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.portal.impl;

import org.abchip.mimo.biz.common.portal.PortalPackage;
import org.abchip.mimo.biz.common.portal.PortletPortletCategory;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Portlet Portlet Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortletPortletCategoryImpl#getPortalPortletId <em>Portal Portlet Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortletPortletCategoryImpl#getPortletCategoryId <em>Portlet Category Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortletPortletCategoryImpl extends BizEntityImpl implements PortletPortletCategory {
	/**
	 * The default value of the '{@link #getPortalPortletId() <em>Portal Portlet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortalPortletId()
	 * @generated
	 * @ordered
	 */
	protected static final String PORTAL_PORTLET_ID_EDEFAULT = null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getPortalPortletId() <em>Portal Portlet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortalPortletId()
	 * @generated
	 * @ordered
	 */
	protected String portalPortletId = PORTAL_PORTLET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortletCategoryId() <em>Portlet Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortletCategoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String PORTLET_CATEGORY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPortletCategoryId() <em>Portlet Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortletCategoryId()
	 * @generated
	 * @ordered
	 */
	protected String portletCategoryId = PORTLET_CATEGORY_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortletPortletCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PortalPackage.Literals.PORTLET_PORTLET_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPortalPortletId() {
		return portalPortletId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortalPortletId(String newPortalPortletId) {
		String oldPortalPortletId = portalPortletId;
		portalPortletId = newPortalPortletId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTLET_PORTLET_CATEGORY__PORTAL_PORTLET_ID, oldPortalPortletId, portalPortletId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPortletCategoryId() {
		return portletCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortletCategoryId(String newPortletCategoryId) {
		String oldPortletCategoryId = portletCategoryId;
		portletCategoryId = newPortletCategoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTLET_PORTLET_CATEGORY__PORTLET_CATEGORY_ID, oldPortletCategoryId, portletCategoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PortalPackage.PORTLET_PORTLET_CATEGORY__PORTAL_PORTLET_ID:
				return getPortalPortletId();
			case PortalPackage.PORTLET_PORTLET_CATEGORY__PORTLET_CATEGORY_ID:
				return getPortletCategoryId();
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
			case PortalPackage.PORTLET_PORTLET_CATEGORY__PORTAL_PORTLET_ID:
				setPortalPortletId((String)newValue);
				return;
			case PortalPackage.PORTLET_PORTLET_CATEGORY__PORTLET_CATEGORY_ID:
				setPortletCategoryId((String)newValue);
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
			case PortalPackage.PORTLET_PORTLET_CATEGORY__PORTAL_PORTLET_ID:
				setPortalPortletId(PORTAL_PORTLET_ID_EDEFAULT);
				return;
			case PortalPackage.PORTLET_PORTLET_CATEGORY__PORTLET_CATEGORY_ID:
				setPortletCategoryId(PORTLET_CATEGORY_ID_EDEFAULT);
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
			case PortalPackage.PORTLET_PORTLET_CATEGORY__PORTAL_PORTLET_ID:
				return PORTAL_PORTLET_ID_EDEFAULT == null ? portalPortletId != null : !PORTAL_PORTLET_ID_EDEFAULT.equals(portalPortletId);
			case PortalPackage.PORTLET_PORTLET_CATEGORY__PORTLET_CATEGORY_ID:
				return PORTLET_CATEGORY_ID_EDEFAULT == null ? portletCategoryId != null : !PORTLET_CATEGORY_ID_EDEFAULT.equals(portletCategoryId);
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
		result.append(" (portalPortletId: ");
		result.append(portalPortletId);
		result.append(", portletCategoryId: ");
		result.append(portletCategoryId);
		result.append(')');
		return result.toString();
	}

} //PortletPortletCategoryImpl
