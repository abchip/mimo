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
import org.abchip.mimo.biz.common.portal.PortalPage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

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
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageImpl#getPortalPageName <em>Portal Page Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageImpl#getSecurityGroupId <em>Security Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageImpl#getPortalPageColumns <em>Portal Page Columns</em>}</li>
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
	 * The default value of the '{@link #getPortalPageId() <em>Portal Page Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortalPageId()
	 * @generated
	 * @ordered
	 */
	protected static final String PORTAL_PAGE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPortalPageId() <em>Portal Page Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortalPageId()
	 * @generated
	 * @ordered
	 */
	protected String portalPageId = PORTAL_PAGE_ID_EDEFAULT;
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
	 * The default value of the '{@link #getHelpContentId() <em>Help Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpContentId()
	 * @generated
	 * @ordered
	 */
	protected static final String HELP_CONTENT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getHelpContentId() <em>Help Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpContentId()
	 * @generated
	 * @ordered
	 */
	protected String helpContentId = HELP_CONTENT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getOriginalPortalPageId() <em>Original Portal Page Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalPortalPageId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_PORTAL_PAGE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOriginalPortalPageId() <em>Original Portal Page Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalPortalPageId()
	 * @generated
	 * @ordered
	 */
	protected String originalPortalPageId = ORIGINAL_PORTAL_PAGE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getOwnerUserLoginId() <em>Owner User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_USER_LOGIN_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOwnerUserLoginId() <em>Owner User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected String ownerUserLoginId = OWNER_USER_LOGIN_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getParentPortalPageId() <em>Parent Portal Page Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentPortalPageId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_PORTAL_PAGE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getParentPortalPageId() <em>Parent Portal Page Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentPortalPageId()
	 * @generated
	 * @ordered
	 */
	protected String parentPortalPageId = PARENT_PORTAL_PAGE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getPortalPageName() <em>Portal Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortalPageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PORTAL_PAGE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPortalPageName() <em>Portal Page Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortalPageName()
	 * @generated
	 * @ordered
	 */
	protected String portalPageName = PORTAL_PAGE_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getSecurityGroupId() <em>Security Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_GROUP_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSecurityGroupId() <em>Security Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroupId()
	 * @generated
	 * @ordered
	 */
	protected String securityGroupId = SECURITY_GROUP_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected static final long SEQUENCE_NUM_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected long sequenceNum = SEQUENCE_NUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPortalPageColumns() <em>Portal Page Columns</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortalPageColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<String> portalPageColumns;

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
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTAL_PAGE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHelpContentId() {
		return helpContentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHelpContentId(String newHelpContentId) {
		String oldHelpContentId = helpContentId;
		helpContentId = newHelpContentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTAL_PAGE__HELP_CONTENT_ID, oldHelpContentId, helpContentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOriginalPortalPageId() {
		return originalPortalPageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginalPortalPageId(String newOriginalPortalPageId) {
		String oldOriginalPortalPageId = originalPortalPageId;
		originalPortalPageId = newOriginalPortalPageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTAL_PAGE__ORIGINAL_PORTAL_PAGE_ID, oldOriginalPortalPageId, originalPortalPageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOwnerUserLoginId() {
		return ownerUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerUserLoginId(String newOwnerUserLoginId) {
		String oldOwnerUserLoginId = ownerUserLoginId;
		ownerUserLoginId = newOwnerUserLoginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTAL_PAGE__OWNER_USER_LOGIN_ID, oldOwnerUserLoginId, ownerUserLoginId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPortalPageName() {
		return portalPageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortalPageName(String newPortalPageName) {
		String oldPortalPageName = portalPageName;
		portalPageName = newPortalPageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTAL_PAGE__PORTAL_PAGE_NAME, oldPortalPageName, portalPageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityGroupId() {
		return securityGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityGroupId(String newSecurityGroupId) {
		String oldSecurityGroupId = securityGroupId;
		securityGroupId = newSecurityGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTAL_PAGE__SECURITY_GROUP_ID, oldSecurityGroupId, securityGroupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNum() {
		return sequenceNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		long oldSequenceNum = sequenceNum;
		sequenceNum = newSequenceNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTAL_PAGE__SEQUENCE_NUM, oldSequenceNum, sequenceNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getPortalPageColumns() {
		if (portalPageColumns == null) {
			portalPageColumns = new EDataTypeUniqueEList<String>(String.class, this, PortalPackage.PORTAL_PAGE__PORTAL_PAGE_COLUMNS);
		}
		return portalPageColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childPortalPages() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentPortalPageId() {
		return parentPortalPageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentPortalPageId(String newParentPortalPageId) {
		String oldParentPortalPageId = parentPortalPageId;
		parentPortalPageId = newParentPortalPageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTAL_PAGE__PARENT_PORTAL_PAGE_ID, oldParentPortalPageId, parentPortalPageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPortalPageId() {
		return portalPageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortalPageId(String newPortalPageId) {
		String oldPortalPageId = portalPageId;
		portalPageId = newPortalPageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortalPackage.PORTAL_PAGE__PORTAL_PAGE_ID, oldPortalPageId, portalPageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PortalPackage.PORTAL_PAGE__PORTAL_PAGE_ID:
				return getPortalPageId();
			case PortalPackage.PORTAL_PAGE__DESCRIPTION:
				return getDescription();
			case PortalPackage.PORTAL_PAGE__HELP_CONTENT_ID:
				return getHelpContentId();
			case PortalPackage.PORTAL_PAGE__ORIGINAL_PORTAL_PAGE_ID:
				return getOriginalPortalPageId();
			case PortalPackage.PORTAL_PAGE__OWNER_USER_LOGIN_ID:
				return getOwnerUserLoginId();
			case PortalPackage.PORTAL_PAGE__PARENT_PORTAL_PAGE_ID:
				return getParentPortalPageId();
			case PortalPackage.PORTAL_PAGE__PORTAL_PAGE_NAME:
				return getPortalPageName();
			case PortalPackage.PORTAL_PAGE__SECURITY_GROUP_ID:
				return getSecurityGroupId();
			case PortalPackage.PORTAL_PAGE__SEQUENCE_NUM:
				return getSequenceNum();
			case PortalPackage.PORTAL_PAGE__PORTAL_PAGE_COLUMNS:
				return getPortalPageColumns();
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
			case PortalPackage.PORTAL_PAGE__PORTAL_PAGE_ID:
				setPortalPageId((String)newValue);
				return;
			case PortalPackage.PORTAL_PAGE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PortalPackage.PORTAL_PAGE__HELP_CONTENT_ID:
				setHelpContentId((String)newValue);
				return;
			case PortalPackage.PORTAL_PAGE__ORIGINAL_PORTAL_PAGE_ID:
				setOriginalPortalPageId((String)newValue);
				return;
			case PortalPackage.PORTAL_PAGE__OWNER_USER_LOGIN_ID:
				setOwnerUserLoginId((String)newValue);
				return;
			case PortalPackage.PORTAL_PAGE__PARENT_PORTAL_PAGE_ID:
				setParentPortalPageId((String)newValue);
				return;
			case PortalPackage.PORTAL_PAGE__PORTAL_PAGE_NAME:
				setPortalPageName((String)newValue);
				return;
			case PortalPackage.PORTAL_PAGE__SECURITY_GROUP_ID:
				setSecurityGroupId((String)newValue);
				return;
			case PortalPackage.PORTAL_PAGE__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case PortalPackage.PORTAL_PAGE__PORTAL_PAGE_COLUMNS:
				getPortalPageColumns().clear();
				getPortalPageColumns().addAll((Collection<? extends String>)newValue);
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
			case PortalPackage.PORTAL_PAGE__PORTAL_PAGE_ID:
				setPortalPageId(PORTAL_PAGE_ID_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PAGE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PAGE__HELP_CONTENT_ID:
				setHelpContentId(HELP_CONTENT_ID_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PAGE__ORIGINAL_PORTAL_PAGE_ID:
				setOriginalPortalPageId(ORIGINAL_PORTAL_PAGE_ID_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PAGE__OWNER_USER_LOGIN_ID:
				setOwnerUserLoginId(OWNER_USER_LOGIN_ID_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PAGE__PARENT_PORTAL_PAGE_ID:
				setParentPortalPageId(PARENT_PORTAL_PAGE_ID_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PAGE__PORTAL_PAGE_NAME:
				setPortalPageName(PORTAL_PAGE_NAME_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PAGE__SECURITY_GROUP_ID:
				setSecurityGroupId(SECURITY_GROUP_ID_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PAGE__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PAGE__PORTAL_PAGE_COLUMNS:
				getPortalPageColumns().clear();
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
			case PortalPackage.PORTAL_PAGE__PORTAL_PAGE_ID:
				return PORTAL_PAGE_ID_EDEFAULT == null ? portalPageId != null : !PORTAL_PAGE_ID_EDEFAULT.equals(portalPageId);
			case PortalPackage.PORTAL_PAGE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PortalPackage.PORTAL_PAGE__HELP_CONTENT_ID:
				return HELP_CONTENT_ID_EDEFAULT == null ? helpContentId != null : !HELP_CONTENT_ID_EDEFAULT.equals(helpContentId);
			case PortalPackage.PORTAL_PAGE__ORIGINAL_PORTAL_PAGE_ID:
				return ORIGINAL_PORTAL_PAGE_ID_EDEFAULT == null ? originalPortalPageId != null : !ORIGINAL_PORTAL_PAGE_ID_EDEFAULT.equals(originalPortalPageId);
			case PortalPackage.PORTAL_PAGE__OWNER_USER_LOGIN_ID:
				return OWNER_USER_LOGIN_ID_EDEFAULT == null ? ownerUserLoginId != null : !OWNER_USER_LOGIN_ID_EDEFAULT.equals(ownerUserLoginId);
			case PortalPackage.PORTAL_PAGE__PARENT_PORTAL_PAGE_ID:
				return PARENT_PORTAL_PAGE_ID_EDEFAULT == null ? parentPortalPageId != null : !PARENT_PORTAL_PAGE_ID_EDEFAULT.equals(parentPortalPageId);
			case PortalPackage.PORTAL_PAGE__PORTAL_PAGE_NAME:
				return PORTAL_PAGE_NAME_EDEFAULT == null ? portalPageName != null : !PORTAL_PAGE_NAME_EDEFAULT.equals(portalPageName);
			case PortalPackage.PORTAL_PAGE__SECURITY_GROUP_ID:
				return SECURITY_GROUP_ID_EDEFAULT == null ? securityGroupId != null : !SECURITY_GROUP_ID_EDEFAULT.equals(securityGroupId);
			case PortalPackage.PORTAL_PAGE__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case PortalPackage.PORTAL_PAGE__PORTAL_PAGE_COLUMNS:
				return portalPageColumns != null && !portalPageColumns.isEmpty();
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
		result.append(" (portalPageId: ");
		result.append(portalPageId);
		result.append(", description: ");
		result.append(description);
		result.append(", helpContentId: ");
		result.append(helpContentId);
		result.append(", originalPortalPageId: ");
		result.append(originalPortalPageId);
		result.append(", ownerUserLoginId: ");
		result.append(ownerUserLoginId);
		result.append(", parentPortalPageId: ");
		result.append(parentPortalPageId);
		result.append(", portalPageName: ");
		result.append(portalPageName);
		result.append(", securityGroupId: ");
		result.append(securityGroupId);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(", portalPageColumns: ");
		result.append(portalPageColumns);
		result.append(')');
		return result.toString();
	}

} //PortalPageImpl
