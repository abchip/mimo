/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.portal;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Portal Page Portlet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPagePortlet#getPortalPageId <em>Portal Page Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPagePortlet#getPortalPortletId <em>Portal Portlet Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPagePortlet#getPortletSeqId <em>Portlet Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPagePortlet#getColumnSeqId <em>Column Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPagePortlet#getSequenceNum <em>Sequence Num</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPagePortlet()
 * @model annotation="mimo-ent-frame title='Defines Portlets included into Portal Pages'"
 * @generated
 */
public interface PortalPagePortlet extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Column Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Seq Id</em>' attribute.
	 * @see #setColumnSeqId(String)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPagePortlet_ColumnSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getColumnSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPagePortlet#getColumnSeqId <em>Column Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Seq Id</em>' attribute.
	 * @see #getColumnSeqId()
	 * @generated
	 */
	void setColumnSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Portlet Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portlet Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portlet Seq Id</em>' attribute.
	 * @see #setPortletSeqId(String)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPagePortlet_PortletSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true' help='Identify the portalPortlet instance in case more copy of the same portalPortlet are present in the same portalPage'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPortletSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPagePortlet#getPortletSeqId <em>Portlet Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portlet Seq Id</em>' attribute.
	 * @see #getPortletSeqId()
	 * @generated
	 */
	void setPortletSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Num</em>' attribute.
	 * @see #setSequenceNum(long)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPagePortlet_SequenceNum()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPagePortlet#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

	/**
	 * Returns the value of the '<em><b>Portal Page Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portal Page Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portal Page Id</em>' reference.
	 * @see #setPortalPageId(PortalPage)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPagePortlet_PortalPageId()
	 * @model keys="portalPageId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	PortalPage getPortalPageId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPagePortlet#getPortalPageId <em>Portal Page Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portal Page Id</em>' reference.
	 * @see #getPortalPageId()
	 * @generated
	 */
	void setPortalPageId(PortalPage value);

	/**
	 * Returns the value of the '<em><b>Portal Portlet Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portal Portlet Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portal Portlet Id</em>' reference.
	 * @see #setPortalPortletId(PortalPortlet)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPagePortlet_PortalPortletId()
	 * @model keys="portalPortletId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	PortalPortlet getPortalPortletId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPagePortlet#getPortalPortletId <em>Portal Portlet Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portal Portlet Id</em>' reference.
	 * @see #getPortalPortletId()
	 * @generated
	 */
	void setPortalPortletId(PortalPortlet value);

} // PortalPagePortlet
