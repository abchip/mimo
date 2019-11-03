/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.content.impl;

import org.abchip.mimo.biz.content.content.ContentPackage;
import org.abchip.mimo.biz.content.content.ContentPurposeOperation;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

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
	 * The default value of the '{@link #getContentPurposeTypeId() <em>Content Purpose Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentPurposeTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_PURPOSE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentPurposeTypeId() <em>Content Purpose Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentPurposeTypeId()
	 * @generated
	 * @ordered
	 */
	protected String contentPurposeTypeId = CONTENT_PURPOSE_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentOperationId() <em>Content Operation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentOperationId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_OPERATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentOperationId() <em>Content Operation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentOperationId()
	 * @generated
	 * @ordered
	 */
	protected String contentOperationId = CONTENT_OPERATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected String roleTypeId = ROLE_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected String statusId = STATUS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivilegeEnumId() <em>Privilege Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivilegeEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVILEGE_ENUM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivilegeEnumId() <em>Privilege Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivilegeEnumId()
	 * @generated
	 * @ordered
	 */
	protected String privilegeEnumId = PRIVILEGE_ENUM_ID_EDEFAULT;

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
	public String getContentOperationId() {
		return contentOperationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentOperationId(String newContentOperationId) {
		String oldContentOperationId = contentOperationId;
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
	public String getContentPurposeTypeId() {
		return contentPurposeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentPurposeTypeId(String newContentPurposeTypeId) {
		String oldContentPurposeTypeId = contentPurposeTypeId;
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
	public String getPrivilegeEnumId() {
		return privilegeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivilegeEnumId(String newPrivilegeEnumId) {
		String oldPrivilegeEnumId = privilegeEnumId;
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
	public String getRoleTypeId() {
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(String newRoleTypeId) {
		String oldRoleTypeId = roleTypeId;
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
	public String getStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(String newStatusId) {
		String oldStatusId = statusId;
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
				return getContentPurposeTypeId();
			case ContentPackage.CONTENT_PURPOSE_OPERATION__CONTENT_OPERATION_ID:
				return getContentOperationId();
			case ContentPackage.CONTENT_PURPOSE_OPERATION__ROLE_TYPE_ID:
				return getRoleTypeId();
			case ContentPackage.CONTENT_PURPOSE_OPERATION__STATUS_ID:
				return getStatusId();
			case ContentPackage.CONTENT_PURPOSE_OPERATION__PRIVILEGE_ENUM_ID:
				return getPrivilegeEnumId();
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
				setContentPurposeTypeId((String)newValue);
				return;
			case ContentPackage.CONTENT_PURPOSE_OPERATION__CONTENT_OPERATION_ID:
				setContentOperationId((String)newValue);
				return;
			case ContentPackage.CONTENT_PURPOSE_OPERATION__ROLE_TYPE_ID:
				setRoleTypeId((String)newValue);
				return;
			case ContentPackage.CONTENT_PURPOSE_OPERATION__STATUS_ID:
				setStatusId((String)newValue);
				return;
			case ContentPackage.CONTENT_PURPOSE_OPERATION__PRIVILEGE_ENUM_ID:
				setPrivilegeEnumId((String)newValue);
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
				setContentPurposeTypeId(CONTENT_PURPOSE_TYPE_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT_PURPOSE_OPERATION__CONTENT_OPERATION_ID:
				setContentOperationId(CONTENT_OPERATION_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT_PURPOSE_OPERATION__ROLE_TYPE_ID:
				setRoleTypeId(ROLE_TYPE_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT_PURPOSE_OPERATION__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT_PURPOSE_OPERATION__PRIVILEGE_ENUM_ID:
				setPrivilegeEnumId(PRIVILEGE_ENUM_ID_EDEFAULT);
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
				return CONTENT_PURPOSE_TYPE_ID_EDEFAULT == null ? contentPurposeTypeId != null : !CONTENT_PURPOSE_TYPE_ID_EDEFAULT.equals(contentPurposeTypeId);
			case ContentPackage.CONTENT_PURPOSE_OPERATION__CONTENT_OPERATION_ID:
				return CONTENT_OPERATION_ID_EDEFAULT == null ? contentOperationId != null : !CONTENT_OPERATION_ID_EDEFAULT.equals(contentOperationId);
			case ContentPackage.CONTENT_PURPOSE_OPERATION__ROLE_TYPE_ID:
				return ROLE_TYPE_ID_EDEFAULT == null ? roleTypeId != null : !ROLE_TYPE_ID_EDEFAULT.equals(roleTypeId);
			case ContentPackage.CONTENT_PURPOSE_OPERATION__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
			case ContentPackage.CONTENT_PURPOSE_OPERATION__PRIVILEGE_ENUM_ID:
				return PRIVILEGE_ENUM_ID_EDEFAULT == null ? privilegeEnumId != null : !PRIVILEGE_ENUM_ID_EDEFAULT.equals(privilegeEnumId);
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
		result.append(" (contentPurposeTypeId: ");
		result.append(contentPurposeTypeId);
		result.append(", contentOperationId: ");
		result.append(contentOperationId);
		result.append(", roleTypeId: ");
		result.append(roleTypeId);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(", privilegeEnumId: ");
		result.append(privilegeEnumId);
		result.append(')');
		return result.toString();
	}

} //ContentPurposeOperationImpl
