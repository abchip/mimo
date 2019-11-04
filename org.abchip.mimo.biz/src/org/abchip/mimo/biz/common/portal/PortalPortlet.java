/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.portal;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Portal Portlet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPortlet#getPortalPortletId <em>Portal Portlet Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPortlet#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPortlet#getEditFormLocation <em>Edit Form Location</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPortlet#getEditFormName <em>Edit Form Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPortlet#getPortletName <em>Portlet Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPortlet#getScreenLocation <em>Screen Location</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPortlet#getScreenName <em>Screen Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPortlet#getScreenshot <em>Screenshot</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPortlet#getSecurityMainAction <em>Security Main Action</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPortlet#getSecurityServiceName <em>Security Service Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPortlet#getPortletPortletCategories <em>Portlet Portlet Categories</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPortlet()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface PortalPortlet extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPortlet_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPortlet#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Edit Form Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit Form Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Form Location</em>' attribute.
	 * @see #setEditFormLocation(String)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPortlet_EditFormLocation()
	 * @model
	 * @generated
	 */
	String getEditFormLocation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPortlet#getEditFormLocation <em>Edit Form Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Form Location</em>' attribute.
	 * @see #getEditFormLocation()
	 * @generated
	 */
	void setEditFormLocation(String value);

	/**
	 * Returns the value of the '<em><b>Edit Form Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit Form Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Form Name</em>' attribute.
	 * @see #setEditFormName(String)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPortlet_EditFormName()
	 * @model
	 * @generated
	 */
	String getEditFormName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPortlet#getEditFormName <em>Edit Form Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Form Name</em>' attribute.
	 * @see #getEditFormName()
	 * @generated
	 */
	void setEditFormName(String value);

	/**
	 * Returns the value of the '<em><b>Portlet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portlet Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portlet Name</em>' attribute.
	 * @see #setPortletName(String)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPortlet_PortletName()
	 * @model
	 * @generated
	 */
	String getPortletName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPortlet#getPortletName <em>Portlet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portlet Name</em>' attribute.
	 * @see #getPortletName()
	 * @generated
	 */
	void setPortletName(String value);

	/**
	 * Returns the value of the '<em><b>Screen Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screen Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen Location</em>' attribute.
	 * @see #setScreenLocation(String)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPortlet_ScreenLocation()
	 * @model
	 * @generated
	 */
	String getScreenLocation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPortlet#getScreenLocation <em>Screen Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen Location</em>' attribute.
	 * @see #getScreenLocation()
	 * @generated
	 */
	void setScreenLocation(String value);

	/**
	 * Returns the value of the '<em><b>Screen Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screen Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen Name</em>' attribute.
	 * @see #setScreenName(String)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPortlet_ScreenName()
	 * @model
	 * @generated
	 */
	String getScreenName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPortlet#getScreenName <em>Screen Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen Name</em>' attribute.
	 * @see #getScreenName()
	 * @generated
	 */
	void setScreenName(String value);

	/**
	 * Returns the value of the '<em><b>Screenshot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screenshot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screenshot</em>' attribute.
	 * @see #setScreenshot(String)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPortlet_Screenshot()
	 * @model
	 * @generated
	 */
	String getScreenshot();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPortlet#getScreenshot <em>Screenshot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screenshot</em>' attribute.
	 * @see #getScreenshot()
	 * @generated
	 */
	void setScreenshot(String value);

	/**
	 * Returns the value of the '<em><b>Security Main Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Main Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Main Action</em>' attribute.
	 * @see #setSecurityMainAction(String)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPortlet_SecurityMainAction()
	 * @model
	 * @generated
	 */
	String getSecurityMainAction();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPortlet#getSecurityMainAction <em>Security Main Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Main Action</em>' attribute.
	 * @see #getSecurityMainAction()
	 * @generated
	 */
	void setSecurityMainAction(String value);

	/**
	 * Returns the value of the '<em><b>Security Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Service Name</em>' attribute.
	 * @see #setSecurityServiceName(String)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPortlet_SecurityServiceName()
	 * @model
	 * @generated
	 */
	String getSecurityServiceName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPortlet#getSecurityServiceName <em>Security Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Service Name</em>' attribute.
	 * @see #getSecurityServiceName()
	 * @generated
	 */
	void setSecurityServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Portlet Portlet Categories</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portlet Portlet Categories</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portlet Portlet Categories</em>' attribute list.
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPortlet_PortletPortletCategories()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PortletPortletCategory'"
	 * @generated
	 */
	List<String> getPortletPortletCategories();

	/**
	 * Returns the value of the '<em><b>Portal Portlet Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portal Portlet Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portal Portlet Id</em>' attribute.
	 * @see #setPortalPortletId(String)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPortlet_PortalPortletId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getPortalPortletId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPortlet#getPortalPortletId <em>Portal Portlet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portal Portlet Id</em>' attribute.
	 * @see #getPortalPortletId()
	 * @generated
	 */
	void setPortalPortletId(String value);

} // PortalPortlet