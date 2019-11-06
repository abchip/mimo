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
import org.abchip.mimo.biz.content.content.Content;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.security.securitygroup.SecurityGroup;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;

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
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageImpl#getOriginalPortalPageId <em>Original Portal Page Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageImpl#getOwnerUserLoginId <em>Owner User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageImpl#getPortalPageName <em>Portal Page Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageImpl#getParentPortalPageId <em>Parent Portal Page Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageImpl#getSecurityGroupId <em>Security Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.portal.impl.PortalPageImpl#getHelpContentId <em>Help Content Id</em>}</li>
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
	 * The cached value of the '{@link #getParentPortalPageId() <em>Parent Portal Page Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentPortalPageId()
	 * @generated
	 * @ordered
	 */
	protected PortalPage parentPortalPageId;
	/**
	 * The cached value of the '{@link #getSecurityGroupId() <em>Security Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroupId()
	 * @generated
	 * @ordered
	 */
	protected SecurityGroup securityGroupId;
	/**
	 * The cached value of the '{@link #getHelpContentId() <em>Help Content Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpContentId()
	 * @generated
	 * @ordered
	 */
	protected Content helpContentId;

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
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Content getHelpContentId() {
		if (helpContentId != null && ((EObject)helpContentId).eIsProxy()) {
			InternalEObject oldHelpContentId = (InternalEObject)helpContentId;
			helpContentId = (Content)eResolveProxy(oldHelpContentId);
			if (helpContentId != oldHelpContentId) {
			}
		}
		return helpContentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content basicGetHelpContentId() {
		return helpContentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHelpContentId(Content newHelpContentId) {
		helpContentId = newHelpContentId;
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
		originalPortalPageId = newOriginalPortalPageId;
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
		ownerUserLoginId = newOwnerUserLoginId;
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
		portalPageName = newPortalPageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityGroup getSecurityGroupId() {
		if (securityGroupId != null && ((EObject)securityGroupId).eIsProxy()) {
			InternalEObject oldSecurityGroupId = (InternalEObject)securityGroupId;
			securityGroupId = (SecurityGroup)eResolveProxy(oldSecurityGroupId);
			if (securityGroupId != oldSecurityGroupId) {
			}
		}
		return securityGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityGroup basicGetSecurityGroupId() {
		return securityGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityGroupId(SecurityGroup newSecurityGroupId) {
		securityGroupId = newSecurityGroupId;
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
		sequenceNum = newSequenceNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getPortalPageColumns() {
		if (portalPageColumns == null) {
			portalPageColumns = new BasicInternalEList<String>(String.class);
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
	public PortalPage getParentPortalPageId() {
		if (parentPortalPageId != null && ((EObject)parentPortalPageId).eIsProxy()) {
			InternalEObject oldParentPortalPageId = (InternalEObject)parentPortalPageId;
			parentPortalPageId = (PortalPage)eResolveProxy(oldParentPortalPageId);
			if (parentPortalPageId != oldParentPortalPageId) {
			}
		}
		return parentPortalPageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortalPage basicGetParentPortalPageId() {
		return parentPortalPageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentPortalPageId(PortalPage newParentPortalPageId) {
		parentPortalPageId = newParentPortalPageId;
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
		portalPageId = newPortalPageId;
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
			case PortalPackage.PORTAL_PAGE__ORIGINAL_PORTAL_PAGE_ID:
				return getOriginalPortalPageId();
			case PortalPackage.PORTAL_PAGE__OWNER_USER_LOGIN_ID:
				return getOwnerUserLoginId();
			case PortalPackage.PORTAL_PAGE__PORTAL_PAGE_NAME:
				return getPortalPageName();
			case PortalPackage.PORTAL_PAGE__SEQUENCE_NUM:
				return getSequenceNum();
			case PortalPackage.PORTAL_PAGE__PARENT_PORTAL_PAGE_ID:
				if (resolve) return getParentPortalPageId();
				return basicGetParentPortalPageId();
			case PortalPackage.PORTAL_PAGE__SECURITY_GROUP_ID:
				if (resolve) return getSecurityGroupId();
				return basicGetSecurityGroupId();
			case PortalPackage.PORTAL_PAGE__HELP_CONTENT_ID:
				if (resolve) return getHelpContentId();
				return basicGetHelpContentId();
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
			case PortalPackage.PORTAL_PAGE__ORIGINAL_PORTAL_PAGE_ID:
				setOriginalPortalPageId((String)newValue);
				return;
			case PortalPackage.PORTAL_PAGE__OWNER_USER_LOGIN_ID:
				setOwnerUserLoginId((String)newValue);
				return;
			case PortalPackage.PORTAL_PAGE__PORTAL_PAGE_NAME:
				setPortalPageName((String)newValue);
				return;
			case PortalPackage.PORTAL_PAGE__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case PortalPackage.PORTAL_PAGE__PARENT_PORTAL_PAGE_ID:
				setParentPortalPageId((PortalPage)newValue);
				return;
			case PortalPackage.PORTAL_PAGE__SECURITY_GROUP_ID:
				setSecurityGroupId((SecurityGroup)newValue);
				return;
			case PortalPackage.PORTAL_PAGE__HELP_CONTENT_ID:
				setHelpContentId((Content)newValue);
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
			case PortalPackage.PORTAL_PAGE__ORIGINAL_PORTAL_PAGE_ID:
				setOriginalPortalPageId(ORIGINAL_PORTAL_PAGE_ID_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PAGE__OWNER_USER_LOGIN_ID:
				setOwnerUserLoginId(OWNER_USER_LOGIN_ID_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PAGE__PORTAL_PAGE_NAME:
				setPortalPageName(PORTAL_PAGE_NAME_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PAGE__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case PortalPackage.PORTAL_PAGE__PARENT_PORTAL_PAGE_ID:
				setParentPortalPageId((PortalPage)null);
				return;
			case PortalPackage.PORTAL_PAGE__SECURITY_GROUP_ID:
				setSecurityGroupId((SecurityGroup)null);
				return;
			case PortalPackage.PORTAL_PAGE__HELP_CONTENT_ID:
				setHelpContentId((Content)null);
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
			case PortalPackage.PORTAL_PAGE__ORIGINAL_PORTAL_PAGE_ID:
				return ORIGINAL_PORTAL_PAGE_ID_EDEFAULT == null ? originalPortalPageId != null : !ORIGINAL_PORTAL_PAGE_ID_EDEFAULT.equals(originalPortalPageId);
			case PortalPackage.PORTAL_PAGE__OWNER_USER_LOGIN_ID:
				return OWNER_USER_LOGIN_ID_EDEFAULT == null ? ownerUserLoginId != null : !OWNER_USER_LOGIN_ID_EDEFAULT.equals(ownerUserLoginId);
			case PortalPackage.PORTAL_PAGE__PORTAL_PAGE_NAME:
				return PORTAL_PAGE_NAME_EDEFAULT == null ? portalPageName != null : !PORTAL_PAGE_NAME_EDEFAULT.equals(portalPageName);
			case PortalPackage.PORTAL_PAGE__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case PortalPackage.PORTAL_PAGE__PARENT_PORTAL_PAGE_ID:
				return parentPortalPageId != null;
			case PortalPackage.PORTAL_PAGE__SECURITY_GROUP_ID:
				return securityGroupId != null;
			case PortalPackage.PORTAL_PAGE__HELP_CONTENT_ID:
				return helpContentId != null;
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
		result.append(", originalPortalPageId: ");
		result.append(originalPortalPageId);
		result.append(", ownerUserLoginId: ");
		result.append(ownerUserLoginId);
		result.append(", portalPageName: ");
		result.append(portalPageName);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(", portalPageColumns: ");
		result.append(portalPageColumns);
		result.append(')');
		return result.toString();
	}

} //PortalPageImpl
