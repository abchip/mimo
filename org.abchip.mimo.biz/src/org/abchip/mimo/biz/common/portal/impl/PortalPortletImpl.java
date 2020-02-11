/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.portal.impl;

import java.util.List;
import org.abchip.mimo.biz.common.portal.PortalPackage;
import org.abchip.mimo.biz.common.portal.PortalPortlet;
import org.abchip.mimo.biz.common.portal.PortletPortletCategory;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Portal Portlet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPortletImpl#getPortalPortletId <em>Portal Portlet Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPortletImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPortletImpl#getEditFormLocation <em>Edit Form Location</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPortletImpl#getEditFormName <em>Edit Form Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPortletImpl#getPortletName <em>Portlet Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPortletImpl#getPortletPortletCategories <em>Portlet Portlet Categories</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPortletImpl#getScreenLocation <em>Screen Location</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPortletImpl#getScreenName <em>Screen Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPortletImpl#getScreenshot <em>Screenshot</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPortletImpl#getSecurityMainAction <em>Security Main Action</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPortletImpl#getSecurityServiceName <em>Security Service Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortalPortletImpl extends BizEntityImpl implements PortalPortlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortalPortletImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PortalPackage.Literals.PORTAL_PORTLET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(PortalPackage.Literals.PORTAL_PORTLET__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(PortalPackage.Literals.PORTAL_PORTLET__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEditFormLocation() {
		return (String)eGet(PortalPackage.Literals.PORTAL_PORTLET__EDIT_FORM_LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEditFormLocation(String newEditFormLocation) {
		eSet(PortalPackage.Literals.PORTAL_PORTLET__EDIT_FORM_LOCATION, newEditFormLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEditFormName() {
		return (String)eGet(PortalPackage.Literals.PORTAL_PORTLET__EDIT_FORM_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEditFormName(String newEditFormName) {
		eSet(PortalPackage.Literals.PORTAL_PORTLET__EDIT_FORM_NAME, newEditFormName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPortletName() {
		return (String)eGet(PortalPackage.Literals.PORTAL_PORTLET__PORTLET_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortletName(String newPortletName) {
		eSet(PortalPackage.Literals.PORTAL_PORTLET__PORTLET_NAME, newPortletName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PortletPortletCategory> getPortletPortletCategories() {
		return (List<PortletPortletCategory>)eGet(PortalPackage.Literals.PORTAL_PORTLET__PORTLET_PORTLET_CATEGORIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScreenLocation() {
		return (String)eGet(PortalPackage.Literals.PORTAL_PORTLET__SCREEN_LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScreenLocation(String newScreenLocation) {
		eSet(PortalPackage.Literals.PORTAL_PORTLET__SCREEN_LOCATION, newScreenLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScreenName() {
		return (String)eGet(PortalPackage.Literals.PORTAL_PORTLET__SCREEN_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScreenName(String newScreenName) {
		eSet(PortalPackage.Literals.PORTAL_PORTLET__SCREEN_NAME, newScreenName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScreenshot() {
		return (String)eGet(PortalPackage.Literals.PORTAL_PORTLET__SCREENSHOT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScreenshot(String newScreenshot) {
		eSet(PortalPackage.Literals.PORTAL_PORTLET__SCREENSHOT, newScreenshot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityMainAction() {
		return (String)eGet(PortalPackage.Literals.PORTAL_PORTLET__SECURITY_MAIN_ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityMainAction(String newSecurityMainAction) {
		eSet(PortalPackage.Literals.PORTAL_PORTLET__SECURITY_MAIN_ACTION, newSecurityMainAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityServiceName() {
		return (String)eGet(PortalPackage.Literals.PORTAL_PORTLET__SECURITY_SERVICE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityServiceName(String newSecurityServiceName) {
		eSet(PortalPackage.Literals.PORTAL_PORTLET__SECURITY_SERVICE_NAME, newSecurityServiceName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPortalPortletId() {
		return (String)eGet(PortalPackage.Literals.PORTAL_PORTLET__PORTAL_PORTLET_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortalPortletId(String newPortalPortletId) {
		eSet(PortalPackage.Literals.PORTAL_PORTLET__PORTAL_PORTLET_ID, newPortalPortletId);
	}

} //PortalPortletImpl
