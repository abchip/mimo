/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.portal.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.common.portal.PortalPackage;
import org.abchip.mimo.biz.common.portal.PortalPortlet;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.BasicInternalEList;

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
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPortletImpl#getScreenLocation <em>Screen Location</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPortletImpl#getScreenName <em>Screen Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPortletImpl#getScreenshot <em>Screenshot</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPortletImpl#getSecurityMainAction <em>Security Main Action</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPortletImpl#getSecurityServiceName <em>Security Service Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPortletImpl#getPortletPortletCategories <em>Portlet Portlet Categories</em>}</li>
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
	 * The default value of the '{@link #getPortalPortletId() <em>Portal Portlet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortalPortletId()
	 * @generated
	 * @ordered
	 */
	protected static final String PORTAL_PORTLET_ID_EDEFAULT = null;
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
	 * The default value of the '{@link #getEditFormLocation() <em>Edit Form Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditFormLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String EDIT_FORM_LOCATION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEditFormLocation() <em>Edit Form Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditFormLocation()
	 * @generated
	 * @ordered
	 */
	protected String editFormLocation = EDIT_FORM_LOCATION_EDEFAULT;
	/**
	 * The default value of the '{@link #getEditFormName() <em>Edit Form Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditFormName()
	 * @generated
	 * @ordered
	 */
	protected static final String EDIT_FORM_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEditFormName() <em>Edit Form Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditFormName()
	 * @generated
	 * @ordered
	 */
	protected String editFormName = EDIT_FORM_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getPortletName() <em>Portlet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortletName()
	 * @generated
	 * @ordered
	 */
	protected static final String PORTLET_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPortletName() <em>Portlet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortletName()
	 * @generated
	 * @ordered
	 */
	protected String portletName = PORTLET_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getScreenLocation() <em>Screen Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String SCREEN_LOCATION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getScreenLocation() <em>Screen Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenLocation()
	 * @generated
	 * @ordered
	 */
	protected String screenLocation = SCREEN_LOCATION_EDEFAULT;
	/**
	 * The default value of the '{@link #getScreenName() <em>Screen Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenName()
	 * @generated
	 * @ordered
	 */
	protected static final String SCREEN_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getScreenName() <em>Screen Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenName()
	 * @generated
	 * @ordered
	 */
	protected String screenName = SCREEN_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getScreenshot() <em>Screenshot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenshot()
	 * @generated
	 * @ordered
	 */
	protected static final String SCREENSHOT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getScreenshot() <em>Screenshot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenshot()
	 * @generated
	 * @ordered
	 */
	protected String screenshot = SCREENSHOT_EDEFAULT;
	/**
	 * The default value of the '{@link #getSecurityMainAction() <em>Security Main Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityMainAction()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_MAIN_ACTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSecurityMainAction() <em>Security Main Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityMainAction()
	 * @generated
	 * @ordered
	 */
	protected String securityMainAction = SECURITY_MAIN_ACTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getSecurityServiceName() <em>Security Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_SERVICE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSecurityServiceName() <em>Security Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityServiceName()
	 * @generated
	 * @ordered
	 */
	protected String securityServiceName = SECURITY_SERVICE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPortletPortletCategories() <em>Portlet Portlet Categories</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortletPortletCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<String> portletPortletCategories;

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
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEditFormLocation() {
		return editFormLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEditFormLocation(String newEditFormLocation) {
		editFormLocation = newEditFormLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEditFormName() {
		return editFormName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEditFormName(String newEditFormName) {
		editFormName = newEditFormName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPortletName() {
		return portletName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortletName(String newPortletName) {
		portletName = newPortletName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScreenLocation() {
		return screenLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScreenLocation(String newScreenLocation) {
		screenLocation = newScreenLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScreenName() {
		return screenName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScreenName(String newScreenName) {
		screenName = newScreenName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScreenshot() {
		return screenshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScreenshot(String newScreenshot) {
		screenshot = newScreenshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityMainAction() {
		return securityMainAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityMainAction(String newSecurityMainAction) {
		securityMainAction = newSecurityMainAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityServiceName() {
		return securityServiceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityServiceName(String newSecurityServiceName) {
		securityServiceName = newSecurityServiceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getPortletPortletCategories() {
		if (portletPortletCategories == null) {
			portletPortletCategories = new BasicInternalEList<String>(String.class);
		}
		return portletPortletCategories;
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
		portalPortletId = newPortalPortletId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PortalPackage.PORTAL_PORTLET__PORTAL_PORTLET_ID:
				return getPortalPortletId();
			case PortalPackage.PORTAL_PORTLET__DESCRIPTION:
				return getDescription();
			case PortalPackage.PORTAL_PORTLET__EDIT_FORM_LOCATION:
				return getEditFormLocation();
			case PortalPackage.PORTAL_PORTLET__EDIT_FORM_NAME:
				return getEditFormName();
			case PortalPackage.PORTAL_PORTLET__PORTLET_NAME:
				return getPortletName();
			case PortalPackage.PORTAL_PORTLET__SCREEN_LOCATION:
				return getScreenLocation();
			case PortalPackage.PORTAL_PORTLET__SCREEN_NAME:
				return getScreenName();
			case PortalPackage.PORTAL_PORTLET__SCREENSHOT:
				return getScreenshot();
			case PortalPackage.PORTAL_PORTLET__SECURITY_MAIN_ACTION:
				return getSecurityMainAction();
			case PortalPackage.PORTAL_PORTLET__SECURITY_SERVICE_NAME:
				return getSecurityServiceName();
			case PortalPackage.PORTAL_PORTLET__PORTLET_PORTLET_CATEGORIES:
				return getPortletPortletCategories();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PortalPackage.PORTAL_PORTLET__PORTAL_PORTLET_ID:
				setPortalPortletId((String)newValue);
				return;
			case PortalPackage.PORTAL_PORTLET__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PortalPackage.PORTAL_PORTLET__EDIT_FORM_LOCATION:
				setEditFormLocation((String)newValue);
				return;
			case PortalPackage.PORTAL_PORTLET__EDIT_FORM_NAME:
				setEditFormName((String)newValue);
				return;
			case PortalPackage.PORTAL_PORTLET__PORTLET_NAME:
				setPortletName((String)newValue);
				return;
			case PortalPackage.PORTAL_PORTLET__SCREEN_LOCATION:
				setScreenLocation((String)newValue);
				return;
			case PortalPackage.PORTAL_PORTLET__SCREEN_NAME:
				setScreenName((String)newValue);
				return;
			case PortalPackage.PORTAL_PORTLET__SCREENSHOT:
				setScreenshot((String)newValue);
				return;
			case PortalPackage.PORTAL_PORTLET__SECURITY_MAIN_ACTION:
				setSecurityMainAction((String)newValue);
				return;
			case PortalPackage.PORTAL_PORTLET__SECURITY_SERVICE_NAME:
				setSecurityServiceName((String)newValue);
				return;
			case PortalPackage.PORTAL_PORTLET__PORTLET_PORTLET_CATEGORIES:
				getPortletPortletCategories().clear();
				getPortletPortletCategories().addAll((Collection<? extends String>)newValue);
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
			case PortalPackage.PORTAL_PORTLET__PORTAL_PORTLET_ID:
				setPortalPortletId(PORTAL_PORTLET_ID_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PORTLET__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PORTLET__EDIT_FORM_LOCATION:
				setEditFormLocation(EDIT_FORM_LOCATION_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PORTLET__EDIT_FORM_NAME:
				setEditFormName(EDIT_FORM_NAME_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PORTLET__PORTLET_NAME:
				setPortletName(PORTLET_NAME_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PORTLET__SCREEN_LOCATION:
				setScreenLocation(SCREEN_LOCATION_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PORTLET__SCREEN_NAME:
				setScreenName(SCREEN_NAME_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PORTLET__SCREENSHOT:
				setScreenshot(SCREENSHOT_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PORTLET__SECURITY_MAIN_ACTION:
				setSecurityMainAction(SECURITY_MAIN_ACTION_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PORTLET__SECURITY_SERVICE_NAME:
				setSecurityServiceName(SECURITY_SERVICE_NAME_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PORTLET__PORTLET_PORTLET_CATEGORIES:
				getPortletPortletCategories().clear();
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
			case PortalPackage.PORTAL_PORTLET__PORTAL_PORTLET_ID:
				return PORTAL_PORTLET_ID_EDEFAULT == null ? portalPortletId != null : !PORTAL_PORTLET_ID_EDEFAULT.equals(portalPortletId);
			case PortalPackage.PORTAL_PORTLET__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PortalPackage.PORTAL_PORTLET__EDIT_FORM_LOCATION:
				return EDIT_FORM_LOCATION_EDEFAULT == null ? editFormLocation != null : !EDIT_FORM_LOCATION_EDEFAULT.equals(editFormLocation);
			case PortalPackage.PORTAL_PORTLET__EDIT_FORM_NAME:
				return EDIT_FORM_NAME_EDEFAULT == null ? editFormName != null : !EDIT_FORM_NAME_EDEFAULT.equals(editFormName);
			case PortalPackage.PORTAL_PORTLET__PORTLET_NAME:
				return PORTLET_NAME_EDEFAULT == null ? portletName != null : !PORTLET_NAME_EDEFAULT.equals(portletName);
			case PortalPackage.PORTAL_PORTLET__SCREEN_LOCATION:
				return SCREEN_LOCATION_EDEFAULT == null ? screenLocation != null : !SCREEN_LOCATION_EDEFAULT.equals(screenLocation);
			case PortalPackage.PORTAL_PORTLET__SCREEN_NAME:
				return SCREEN_NAME_EDEFAULT == null ? screenName != null : !SCREEN_NAME_EDEFAULT.equals(screenName);
			case PortalPackage.PORTAL_PORTLET__SCREENSHOT:
				return SCREENSHOT_EDEFAULT == null ? screenshot != null : !SCREENSHOT_EDEFAULT.equals(screenshot);
			case PortalPackage.PORTAL_PORTLET__SECURITY_MAIN_ACTION:
				return SECURITY_MAIN_ACTION_EDEFAULT == null ? securityMainAction != null : !SECURITY_MAIN_ACTION_EDEFAULT.equals(securityMainAction);
			case PortalPackage.PORTAL_PORTLET__SECURITY_SERVICE_NAME:
				return SECURITY_SERVICE_NAME_EDEFAULT == null ? securityServiceName != null : !SECURITY_SERVICE_NAME_EDEFAULT.equals(securityServiceName);
			case PortalPackage.PORTAL_PORTLET__PORTLET_PORTLET_CATEGORIES:
				return portletPortletCategories != null && !portletPortletCategories.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(", editFormLocation: ");
		result.append(editFormLocation);
		result.append(", editFormName: ");
		result.append(editFormName);
		result.append(", portletName: ");
		result.append(portletName);
		result.append(", screenLocation: ");
		result.append(screenLocation);
		result.append(", screenName: ");
		result.append(screenName);
		result.append(", screenshot: ");
		result.append(screenshot);
		result.append(", securityMainAction: ");
		result.append(securityMainAction);
		result.append(", securityServiceName: ");
		result.append(securityServiceName);
		result.append(", portletPortletCategories: ");
		result.append(portletPortletCategories);
		result.append(')');
		return result.toString();
	}

} //PortalPortletImpl
