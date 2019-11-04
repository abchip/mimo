/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.portal.impl;

import org.abchip.mimo.biz.common.portal.PortalPackage;
import org.abchip.mimo.biz.common.portal.PortletCategory;
import org.abchip.mimo.biz.common.portal.PortletPortletCategory;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
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
	 * The cached value of the '{@link #getPortletCategoryId() <em>Portlet Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortletCategoryId()
	 * @generated
	 * @ordered
	 */
	protected PortletCategory portletCategoryId;

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
	public PortletCategory getPortletCategoryId() {
		if (portletCategoryId != null && ((EObject)portletCategoryId).eIsProxy()) {
			InternalEObject oldPortletCategoryId = (InternalEObject)portletCategoryId;
			portletCategoryId = (PortletCategory)eResolveProxy(oldPortletCategoryId);
			if (portletCategoryId != oldPortletCategoryId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PortalPackage.PORTLET_PORTLET_CATEGORY__PORTLET_CATEGORY_ID, oldPortletCategoryId, portletCategoryId));
			}
		}
		return portletCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortletCategory basicGetPortletCategoryId() {
		return portletCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortletCategoryId(PortletCategory newPortletCategoryId) {
		PortletCategory oldPortletCategoryId = portletCategoryId;
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
				if (resolve) return getPortletCategoryId();
				return basicGetPortletCategoryId();
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
				setPortletCategoryId((PortletCategory)newValue);
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
				setPortletCategoryId((PortletCategory)null);
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
				return portletCategoryId != null;
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
		result.append(')');
		return result.toString();
	}

} //PortletPortletCategoryImpl
