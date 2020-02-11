/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
		return (PortalPortlet)eGet(PortalPackage.Literals.PORTLET_PORTLET_CATEGORY__PORTAL_PORTLET_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortalPortletId(PortalPortlet newPortalPortletId) {
		eSet(PortalPackage.Literals.PORTLET_PORTLET_CATEGORY__PORTAL_PORTLET_ID, newPortalPortletId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortletCategory getPortletCategoryId() {
		return (PortletCategory)eGet(PortalPackage.Literals.PORTLET_PORTLET_CATEGORY__PORTLET_CATEGORY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortletCategoryId(PortletCategory newPortletCategoryId) {
		eSet(PortalPackage.Literals.PORTLET_PORTLET_CATEGORY__PORTLET_CATEGORY_ID, newPortletCategoryId);
	}

} //PortletPortletCategoryImpl
