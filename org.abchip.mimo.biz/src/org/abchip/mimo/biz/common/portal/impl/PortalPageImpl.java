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
import org.abchip.mimo.biz.common.portal.PortalPage;
import org.abchip.mimo.biz.common.portal.PortalPageColumn;
import org.abchip.mimo.biz.content.content.Content;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.security.securitygroup.SecurityGroup;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Portal Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageImpl#getPortalPageId <em>Portal Page Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageImpl#getHelpContentId <em>Help Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageImpl#getOriginalPortalPageId <em>Original Portal Page Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageImpl#getOwnerUserLoginId <em>Owner User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageImpl#getParentPortalPageId <em>Parent Portal Page Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageImpl#getPortalPageColumns <em>Portal Page Columns</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageImpl#getPortalPageName <em>Portal Page Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageImpl#getSecurityGroupId <em>Security Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageImpl#getSequenceNum <em>Sequence Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortalPageImpl extends BizEntityImpl implements PortalPage {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortalPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PortalPackage.Literals.PORTAL_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(PortalPackage.Literals.PORTAL_PAGE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(PortalPackage.Literals.PORTAL_PAGE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Content getHelpContentId() {
		return (Content)eGet(PortalPackage.Literals.PORTAL_PAGE__HELP_CONTENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHelpContentId(Content newHelpContentId) {
		eSet(PortalPackage.Literals.PORTAL_PAGE__HELP_CONTENT_ID, newHelpContentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOriginalPortalPageId() {
		return (String)eGet(PortalPackage.Literals.PORTAL_PAGE__ORIGINAL_PORTAL_PAGE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginalPortalPageId(String newOriginalPortalPageId) {
		eSet(PortalPackage.Literals.PORTAL_PAGE__ORIGINAL_PORTAL_PAGE_ID, newOriginalPortalPageId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOwnerUserLoginId() {
		return (String)eGet(PortalPackage.Literals.PORTAL_PAGE__OWNER_USER_LOGIN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerUserLoginId(String newOwnerUserLoginId) {
		eSet(PortalPackage.Literals.PORTAL_PAGE__OWNER_USER_LOGIN_ID, newOwnerUserLoginId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPortalPageName() {
		return (String)eGet(PortalPackage.Literals.PORTAL_PAGE__PORTAL_PAGE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortalPageName(String newPortalPageName) {
		eSet(PortalPackage.Literals.PORTAL_PAGE__PORTAL_PAGE_NAME, newPortalPageName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityGroup getSecurityGroupId() {
		return (SecurityGroup)eGet(PortalPackage.Literals.PORTAL_PAGE__SECURITY_GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityGroupId(SecurityGroup newSecurityGroupId) {
		eSet(PortalPackage.Literals.PORTAL_PAGE__SECURITY_GROUP_ID, newSecurityGroupId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNum() {
		return (Long)eGet(PortalPackage.Literals.PORTAL_PAGE__SEQUENCE_NUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		eSet(PortalPackage.Literals.PORTAL_PAGE__SEQUENCE_NUM, newSequenceNum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortalPage getParentPortalPageId() {
		return (PortalPage)eGet(PortalPackage.Literals.PORTAL_PAGE__PARENT_PORTAL_PAGE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentPortalPageId(PortalPage newParentPortalPageId) {
		eSet(PortalPackage.Literals.PORTAL_PAGE__PARENT_PORTAL_PAGE_ID, newParentPortalPageId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PortalPageColumn> getPortalPageColumns() {
		return (List<PortalPageColumn>)eGet(PortalPackage.Literals.PORTAL_PAGE__PORTAL_PAGE_COLUMNS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPortalPageId() {
		return (String)eGet(PortalPackage.Literals.PORTAL_PAGE__PORTAL_PAGE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortalPageId(String newPortalPageId) {
		eSet(PortalPackage.Literals.PORTAL_PAGE__PORTAL_PAGE_ID, newPortalPageId);
	}

} //PortalPageImpl
