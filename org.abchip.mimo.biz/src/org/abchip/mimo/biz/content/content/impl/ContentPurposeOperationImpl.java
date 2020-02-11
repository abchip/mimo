/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.content.impl;

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.content.content.ContentOperation;
import org.abchip.mimo.biz.content.content.ContentPackage;
import org.abchip.mimo.biz.content.content.ContentPurposeOperation;
import org.abchip.mimo.biz.content.content.ContentPurposeType;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.RoleType;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Purpose Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentPurposeOperationImpl#getContentPurposeTypeId <em>Content Purpose Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentPurposeOperationImpl#getContentOperationId <em>Content Operation Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentPurposeOperationImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentPurposeOperationImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentPurposeOperationImpl#getPrivilegeEnumId <em>Privilege Enum Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentPurposeOperationImpl extends BizEntityImpl implements ContentPurposeOperation {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentPurposeOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.CONTENT_PURPOSE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentOperation getContentOperationId() {
		return (ContentOperation)eGet(ContentPackage.Literals.CONTENT_PURPOSE_OPERATION__CONTENT_OPERATION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentOperationId(ContentOperation newContentOperationId) {
		eSet(ContentPackage.Literals.CONTENT_PURPOSE_OPERATION__CONTENT_OPERATION_ID, newContentOperationId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentPurposeType getContentPurposeTypeId() {
		return (ContentPurposeType)eGet(ContentPackage.Literals.CONTENT_PURPOSE_OPERATION__CONTENT_PURPOSE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentPurposeTypeId(ContentPurposeType newContentPurposeTypeId) {
		eSet(ContentPackage.Literals.CONTENT_PURPOSE_OPERATION__CONTENT_PURPOSE_TYPE_ID, newContentPurposeTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getPrivilegeEnumId() {
		return (Enumeration)eGet(ContentPackage.Literals.CONTENT_PURPOSE_OPERATION__PRIVILEGE_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivilegeEnumId(Enumeration newPrivilegeEnumId) {
		eSet(ContentPackage.Literals.CONTENT_PURPOSE_OPERATION__PRIVILEGE_ENUM_ID, newPrivilegeEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleTypeId() {
		return (RoleType)eGet(ContentPackage.Literals.CONTENT_PURPOSE_OPERATION__ROLE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(RoleType newRoleTypeId) {
		eSet(ContentPackage.Literals.CONTENT_PURPOSE_OPERATION__ROLE_TYPE_ID, newRoleTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		return (StatusItem)eGet(ContentPackage.Literals.CONTENT_PURPOSE_OPERATION__STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		eSet(ContentPackage.Literals.CONTENT_PURPOSE_OPERATION__STATUS_ID, newStatusId);
	}

} //ContentPurposeOperationImpl
