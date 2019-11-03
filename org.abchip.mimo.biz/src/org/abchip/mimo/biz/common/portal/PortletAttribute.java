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
 * A representation of the model object '<em><b>Portlet Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortletAttribute#getPortalPageId <em>Portal Page Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortletAttribute#getPortalPortletId <em>Portal Portlet Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortletAttribute#getPortletSeqId <em>Portlet Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortletAttribute#getAttrName <em>Attr Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortletAttribute#getAttrDescription <em>Attr Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortletAttribute#getAttrType <em>Attr Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortletAttribute#getAttrValue <em>Attr Value</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortletAttribute()
 * @model
 * @generated
 */
public interface PortletAttribute extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Description</em>' attribute.
	 * @see #setAttrDescription(String)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortletAttribute_AttrDescription()
	 * @model
	 * @generated
	 */
	String getAttrDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortletAttribute#getAttrDescription <em>Attr Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr Description</em>' attribute.
	 * @see #getAttrDescription()
	 * @generated
	 */
	void setAttrDescription(String value);

	/**
	 * Returns the value of the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Name</em>' attribute.
	 * @see #setAttrName(String)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortletAttribute_AttrName()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getAttrName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortletAttribute#getAttrName <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr Name</em>' attribute.
	 * @see #getAttrName()
	 * @generated
	 */
	void setAttrName(String value);

	/**
	 * Returns the value of the '<em><b>Attr Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Type</em>' attribute.
	 * @see #setAttrType(String)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortletAttribute_AttrType()
	 * @model
	 * @generated
	 */
	String getAttrType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortletAttribute#getAttrType <em>Attr Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr Type</em>' attribute.
	 * @see #getAttrType()
	 * @generated
	 */
	void setAttrType(String value);

	/**
	 * Returns the value of the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Value</em>' attribute.
	 * @see #setAttrValue(String)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortletAttribute_AttrValue()
	 * @model
	 * @generated
	 */
	String getAttrValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortletAttribute#getAttrValue <em>Attr Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr Value</em>' attribute.
	 * @see #getAttrValue()
	 * @generated
	 */
	void setAttrValue(String value);

	/**
	 * Returns the value of the '<em><b>Portal Page Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portal Page Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portal Page Id</em>' attribute.
	 * @see #setPortalPageId(String)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortletAttribute_PortalPageId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getPortalPageId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortletAttribute#getPortalPageId <em>Portal Page Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portal Page Id</em>' attribute.
	 * @see #getPortalPageId()
	 * @generated
	 */
	void setPortalPageId(String value);

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
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortletAttribute_PortletSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getPortletSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortletAttribute#getPortletSeqId <em>Portlet Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portlet Seq Id</em>' attribute.
	 * @see #getPortletSeqId()
	 * @generated
	 */
	void setPortletSeqId(String value);

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
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortletAttribute_PortalPortletId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='PortalPortlet'"
	 * @generated
	 */
	String getPortalPortletId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortletAttribute#getPortalPortletId <em>Portal Portlet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portal Portlet Id</em>' attribute.
	 * @see #getPortalPortletId()
	 * @generated
	 */
	void setPortalPortletId(String value);

} // PortletAttribute
