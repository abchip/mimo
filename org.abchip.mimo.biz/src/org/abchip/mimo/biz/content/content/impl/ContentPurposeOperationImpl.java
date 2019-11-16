/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The cached value of the '{@link #getContentPurposeTypeId() <em>Content Purpose Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentPurposeTypeId()
	 * @generated
	 * @ordered
	 */
	protected ContentPurposeType contentPurposeTypeId;

	/**
	 * The cached value of the '{@link #getContentOperationId() <em>Content Operation Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentOperationId()
	 * @generated
	 * @ordered
	 */
	protected ContentOperation contentOperationId;

	/**
	 * The cached value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleTypeId;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;

	/**
	 * The cached value of the '{@link #getPrivilegeEnumId() <em>Privilege Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivilegeEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration privilegeEnumId;

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
		if (contentOperationId != null && ((EObject)contentOperationId).eIsProxy()) {
			InternalEObject oldContentOperationId = (InternalEObject)contentOperationId;
			contentOperationId = (ContentOperation)eResolveProxy(oldContentOperationId);
			if (contentOperationId != oldContentOperationId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT_PURPOSE_OPERATION__CONTENT_OPERATION_ID, oldContentOperationId, contentOperationId));
			}
		}
		return contentOperationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentOperation basicGetContentOperationId() {
		return contentOperationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentOperationId(ContentOperation newContentOperationId) {
		ContentOperation oldContentOperationId = contentOperationId;
		contentOperationId = newContentOperationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_PURPOSE_OPERATION__CONTENT_OPERATION_ID, oldContentOperationId, contentOperationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentPurposeType getContentPurposeTypeId() {
		if (contentPurposeTypeId != null && ((EObject)contentPurposeTypeId).eIsProxy()) {
			InternalEObject oldContentPurposeTypeId = (InternalEObject)contentPurposeTypeId;
			contentPurposeTypeId = (ContentPurposeType)eResolveProxy(oldContentPurposeTypeId);
			if (contentPurposeTypeId != oldContentPurposeTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT_PURPOSE_OPERATION__CONTENT_PURPOSE_TYPE_ID, oldContentPurposeTypeId, contentPurposeTypeId));
			}
		}
		return contentPurposeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentPurposeType basicGetContentPurposeTypeId() {
		return contentPurposeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentPurposeTypeId(ContentPurposeType newContentPurposeTypeId) {
		ContentPurposeType oldContentPurposeTypeId = contentPurposeTypeId;
		contentPurposeTypeId = newContentPurposeTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_PURPOSE_OPERATION__CONTENT_PURPOSE_TYPE_ID, oldContentPurposeTypeId, contentPurposeTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getPrivilegeEnumId() {
		if (privilegeEnumId != null && ((EObject)privilegeEnumId).eIsProxy()) {
			InternalEObject oldPrivilegeEnumId = (InternalEObject)privilegeEnumId;
			privilegeEnumId = (Enumeration)eResolveProxy(oldPrivilegeEnumId);
			if (privilegeEnumId != oldPrivilegeEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT_PURPOSE_OPERATION__PRIVILEGE_ENUM_ID, oldPrivilegeEnumId, privilegeEnumId));
			}
		}
		return privilegeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetPrivilegeEnumId() {
		return privilegeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivilegeEnumId(Enumeration newPrivilegeEnumId) {
		Enumeration oldPrivilegeEnumId = privilegeEnumId;
		privilegeEnumId = newPrivilegeEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_PURPOSE_OPERATION__PRIVILEGE_ENUM_ID, oldPrivilegeEnumId, privilegeEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleTypeId() {
		if (roleTypeId != null && ((EObject)roleTypeId).eIsProxy()) {
			InternalEObject oldRoleTypeId = (InternalEObject)roleTypeId;
			roleTypeId = (RoleType)eResolveProxy(oldRoleTypeId);
			if (roleTypeId != oldRoleTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT_PURPOSE_OPERATION__ROLE_TYPE_ID, oldRoleTypeId, roleTypeId));
			}
		}
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetRoleTypeId() {
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(RoleType newRoleTypeId) {
		RoleType oldRoleTypeId = roleTypeId;
		roleTypeId = newRoleTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_PURPOSE_OPERATION__ROLE_TYPE_ID, oldRoleTypeId, roleTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT_PURPOSE_OPERATION__STATUS_ID, oldStatusId, statusId));
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		StatusItem oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_PURPOSE_OPERATION__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentPackage.CONTENT_PURPOSE_OPERATION__CONTENT_PURPOSE_TYPE_ID:
				if (resolve) return getContentPurposeTypeId();
				return basicGetContentPurposeTypeId();
			case ContentPackage.CONTENT_PURPOSE_OPERATION__CONTENT_OPERATION_ID:
				if (resolve) return getContentOperationId();
				return basicGetContentOperationId();
			case ContentPackage.CONTENT_PURPOSE_OPERATION__ROLE_TYPE_ID:
				if (resolve) return getRoleTypeId();
				return basicGetRoleTypeId();
			case ContentPackage.CONTENT_PURPOSE_OPERATION__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case ContentPackage.CONTENT_PURPOSE_OPERATION__PRIVILEGE_ENUM_ID:
				if (resolve) return getPrivilegeEnumId();
				return basicGetPrivilegeEnumId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContentPackage.CONTENT_PURPOSE_OPERATION__CONTENT_PURPOSE_TYPE_ID:
				setContentPurposeTypeId((ContentPurposeType)newValue);
				return;
			case ContentPackage.CONTENT_PURPOSE_OPERATION__CONTENT_OPERATION_ID:
				setContentOperationId((ContentOperation)newValue);
				return;
			case ContentPackage.CONTENT_PURPOSE_OPERATION__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)newValue);
				return;
			case ContentPackage.CONTENT_PURPOSE_OPERATION__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case ContentPackage.CONTENT_PURPOSE_OPERATION__PRIVILEGE_ENUM_ID:
				setPrivilegeEnumId((Enumeration)newValue);
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
			case ContentPackage.CONTENT_PURPOSE_OPERATION__CONTENT_PURPOSE_TYPE_ID:
				setContentPurposeTypeId((ContentPurposeType)null);
				return;
			case ContentPackage.CONTENT_PURPOSE_OPERATION__CONTENT_OPERATION_ID:
				setContentOperationId((ContentOperation)null);
				return;
			case ContentPackage.CONTENT_PURPOSE_OPERATION__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)null);
				return;
			case ContentPackage.CONTENT_PURPOSE_OPERATION__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case ContentPackage.CONTENT_PURPOSE_OPERATION__PRIVILEGE_ENUM_ID:
				setPrivilegeEnumId((Enumeration)null);
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
			case ContentPackage.CONTENT_PURPOSE_OPERATION__CONTENT_PURPOSE_TYPE_ID:
				return contentPurposeTypeId != null;
			case ContentPackage.CONTENT_PURPOSE_OPERATION__CONTENT_OPERATION_ID:
				return contentOperationId != null;
			case ContentPackage.CONTENT_PURPOSE_OPERATION__ROLE_TYPE_ID:
				return roleTypeId != null;
			case ContentPackage.CONTENT_PURPOSE_OPERATION__STATUS_ID:
				return statusId != null;
			case ContentPackage.CONTENT_PURPOSE_OPERATION__PRIVILEGE_ENUM_ID:
				return privilegeEnumId != null;
		}
		return super.eIsSet(featureID);
	}

} //ContentPurposeOperationImpl
