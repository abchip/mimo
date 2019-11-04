/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.portal;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Portlet Portlet Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortletPortletCategory#getPortalPortletId <em>Portal Portlet Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortletPortletCategory#getPortletCategoryId <em>Portlet Category Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortletPortletCategory()
 * @model
 * @generated
 */
public interface PortletPortletCategory extends BizEntity {
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
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortletPortletCategory_PortalPortletId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getPortalPortletId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortletPortletCategory#getPortalPortletId <em>Portal Portlet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portal Portlet Id</em>' attribute.
	 * @see #getPortalPortletId()
	 * @generated
	 */
	void setPortalPortletId(String value);

	/**
	 * Returns the value of the '<em><b>Portlet Category Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portlet Category Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portlet Category Id</em>' reference.
	 * @see #setPortletCategoryId(PortletCategory)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortletPortletCategory_PortletCategoryId()
	 * @model keys="portletCategoryId"
	 * @generated
	 */
	PortletCategory getPortletCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortletPortletCategory#getPortletCategoryId <em>Portlet Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portlet Category Id</em>' reference.
	 * @see #getPortletCategoryId()
	 * @generated
	 */
	void setPortletCategoryId(PortletCategory value);

} // PortletPortletCategory