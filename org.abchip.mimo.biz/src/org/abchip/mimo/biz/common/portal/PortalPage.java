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
import org.abchip.mimo.biz.content.content.Content;
import org.abchip.mimo.biz.security.securitygroup.SecurityGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Portal Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPage#getPortalPageId <em>Portal Page Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPage#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPage#getOriginalPortalPageId <em>Original Portal Page Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPage#getOwnerUserLoginId <em>Owner User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPage#getPortalPageName <em>Portal Page Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPage#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPage#getParentPortalPageId <em>Parent Portal Page Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPage#getSecurityGroupId <em>Security Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPage#getHelpContentId <em>Help Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.PortalPage#getPortalPageColumns <em>Portal Page Columns</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPage()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface PortalPage extends BizEntity {
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
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPage_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPage#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Help Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Help Content Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help Content Id</em>' reference.
	 * @see #setHelpContentId(Content)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPage_HelpContentId()
	 * @model keys="contentId"
	 * @generated
	 */
	Content getHelpContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPage#getHelpContentId <em>Help Content Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Help Content Id</em>' reference.
	 * @see #getHelpContentId()
	 * @generated
	 */
	void setHelpContentId(Content value);

	/**
	 * Returns the value of the '<em><b>Original Portal Page Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Portal Page Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Portal Page Id</em>' attribute.
	 * @see #setOriginalPortalPageId(String)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPage_OriginalPortalPageId()
	 * @model
	 * @generated
	 */
	String getOriginalPortalPageId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPage#getOriginalPortalPageId <em>Original Portal Page Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Portal Page Id</em>' attribute.
	 * @see #getOriginalPortalPageId()
	 * @generated
	 */
	void setOriginalPortalPageId(String value);

	/**
	 * Returns the value of the '<em><b>Owner User Login Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner User Login Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner User Login Id</em>' attribute.
	 * @see #setOwnerUserLoginId(String)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPage_OwnerUserLoginId()
	 * @model
	 * @generated
	 */
	String getOwnerUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPage#getOwnerUserLoginId <em>Owner User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner User Login Id</em>' attribute.
	 * @see #getOwnerUserLoginId()
	 * @generated
	 */
	void setOwnerUserLoginId(String value);

	/**
	 * Returns the value of the '<em><b>Portal Page Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portal Page Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portal Page Name</em>' attribute.
	 * @see #setPortalPageName(String)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPage_PortalPageName()
	 * @model
	 * @generated
	 */
	String getPortalPageName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPage#getPortalPageName <em>Portal Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portal Page Name</em>' attribute.
	 * @see #getPortalPageName()
	 * @generated
	 */
	void setPortalPageName(String value);

	/**
	 * Returns the value of the '<em><b>Security Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Group Id</em>' reference.
	 * @see #setSecurityGroupId(SecurityGroup)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPage_SecurityGroupId()
	 * @model keys="groupId"
	 * @generated
	 */
	SecurityGroup getSecurityGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPage#getSecurityGroupId <em>Security Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Group Id</em>' reference.
	 * @see #getSecurityGroupId()
	 * @generated
	 */
	void setSecurityGroupId(SecurityGroup value);

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
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPage_SequenceNum()
	 * @model
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPage#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

	/**
	 * Returns the value of the '<em><b>Portal Page Columns</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portal Page Columns</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portal Page Columns</em>' attribute list.
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPage_PortalPageColumns()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PortalPageColumn'"
	 * @generated
	 */
	List<String> getPortalPageColumns();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PortalPage' route='parentPortalPageId'"
	 * @generated
	 */
	List<String> childPortalPages();

	/**
	 * Returns the value of the '<em><b>Parent Portal Page Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Portal Page Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Portal Page Id</em>' reference.
	 * @see #setParentPortalPageId(PortalPage)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPage_ParentPortalPageId()
	 * @model keys="portalPageId"
	 * @generated
	 */
	PortalPage getParentPortalPageId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPage#getParentPortalPageId <em>Parent Portal Page Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Portal Page Id</em>' reference.
	 * @see #getParentPortalPageId()
	 * @generated
	 */
	void setParentPortalPageId(PortalPage value);

	/**
	 * Returns the value of the '<em><b>Portal Page Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portal Page Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portal Page Id</em>' attribute.
	 * @see #setPortalPageId(String)
	 * @see org.abchip.mimo.biz.common.portal.PortalPackage#getPortalPage_PortalPageId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getPortalPageId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.portal.PortalPage#getPortalPageId <em>Portal Page Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portal Page Id</em>' attribute.
	 * @see #getPortalPageId()
	 * @generated
	 */
	void setPortalPageId(String value);

} // PortalPage