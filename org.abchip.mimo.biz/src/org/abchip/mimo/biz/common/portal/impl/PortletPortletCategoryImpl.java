/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.portal.impl;

import org.abchip.mimo.biz.common.portal.PortalPackage;
import org.abchip.mimo.biz.common.portal.PortalPortlet;
import org.abchip.mimo.biz.common.portal.PortletCategory;
import org.abchip.mimo.biz.common.portal.PortletPortletCategory;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

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
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getPortalPortletId() <em>Portal Portlet Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortalPortletId()
	 * @generated
	 * @ordered
	 */
	protected PortalPortlet portalPortletId;

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
	public PortalPortlet getPortalPortletId() {
		if (portalPortletId != null && ((EObject)portalPortletId).eIsProxy()) {
			InternalEObject oldPortalPortletId = (InternalEObject)portalPortletId;
			portalPortletId = (PortalPortlet)eResolveProxy(oldPortalPortletId);
			if (portalPortletId != oldPortalPortletId) {
			}
		}
		return portalPortletId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortalPortlet basicGetPortalPortletId() {
		return portalPortletId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortalPortletId(PortalPortlet newPortalPortletId) {
		portalPortletId = newPortalPortletId;
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
		portletCategoryId = newPortletCategoryId;
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
				if (resolve) return getPortalPortletId();
				return basicGetPortalPortletId();
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
				setPortalPortletId((PortalPortlet)newValue);
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
				setPortalPortletId((PortalPortlet)null);
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
				return portalPortletId != null;
			case PortalPackage.PORTLET_PORTLET_CATEGORY__PORTLET_CATEGORY_ID:
				return portletCategoryId != null;
		}
		return super.eIsSet(featureID);
	}

} //PortletPortletCategoryImpl
