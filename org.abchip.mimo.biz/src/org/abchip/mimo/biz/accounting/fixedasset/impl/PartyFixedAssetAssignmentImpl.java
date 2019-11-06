/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.fixedasset.impl;

import java.util.Date;

import org.abchip.mimo.biz.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage;
import org.abchip.mimo.biz.accounting.fixedasset.PartyFixedAssetAssignment;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.RoleType;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Fixed Asset Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.PartyFixedAssetAssignmentImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.PartyFixedAssetAssignmentImpl#getAllocatedDate <em>Allocated Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.PartyFixedAssetAssignmentImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.PartyFixedAssetAssignmentImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.PartyFixedAssetAssignmentImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.PartyFixedAssetAssignmentImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.PartyFixedAssetAssignmentImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.PartyFixedAssetAssignmentImpl#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyFixedAssetAssignmentImpl extends BizEntityImpl implements PartyFixedAssetAssignment {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getAllocatedDate() <em>Allocated Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ALLOCATED_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAllocatedDate() <em>Allocated Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedDate()
	 * @generated
	 * @ordered
	 */
	protected Date allocatedDate = ALLOCATED_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;
	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;
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
	 * The cached value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected FixedAsset fixedAssetId;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyFixedAssetAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FixedassetPackage.Literals.PARTY_FIXED_ASSET_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getAllocatedDate() {
		return allocatedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllocatedDate(Date newAllocatedDate) {
		allocatedDate = newAllocatedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		comments = newComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		fromDate = newFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		partyId = newPartyId;
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
		roleTypeId = newRoleTypeId;
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
		statusId = newStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		thruDate = newThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAsset getFixedAssetId() {
		if (fixedAssetId != null && ((EObject)fixedAssetId).eIsProxy()) {
			InternalEObject oldFixedAssetId = (InternalEObject)fixedAssetId;
			fixedAssetId = (FixedAsset)eResolveProxy(oldFixedAssetId);
			if (fixedAssetId != oldFixedAssetId) {
			}
		}
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedAsset basicGetFixedAssetId() {
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetId(FixedAsset newFixedAssetId) {
		fixedAssetId = newFixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__FROM_DATE:
				return getFromDate();
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__ALLOCATED_DATE:
				return getAllocatedDate();
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__COMMENTS:
				return getComments();
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__THRU_DATE:
				return getThruDate();
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__ROLE_TYPE_ID:
				if (resolve) return getRoleTypeId();
				return basicGetRoleTypeId();
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__FIXED_ASSET_ID:
				if (resolve) return getFixedAssetId();
				return basicGetFixedAssetId();
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
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
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__ALLOCATED_DATE:
				setAllocatedDate((Date)newValue);
				return;
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__COMMENTS:
				setComments((String)newValue);
				return;
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)newValue);
				return;
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)newValue);
				return;
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__STATUS_ID:
				setStatusId((StatusItem)newValue);
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
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__ALLOCATED_DATE:
				setAllocatedDate(ALLOCATED_DATE_EDEFAULT);
				return;
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__PARTY_ID:
				setPartyId((Party)null);
				return;
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)null);
				return;
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)null);
				return;
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__STATUS_ID:
				setStatusId((StatusItem)null);
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
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__ALLOCATED_DATE:
				return ALLOCATED_DATE_EDEFAULT == null ? allocatedDate != null : !ALLOCATED_DATE_EDEFAULT.equals(allocatedDate);
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__PARTY_ID:
				return partyId != null;
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__ROLE_TYPE_ID:
				return roleTypeId != null;
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__FIXED_ASSET_ID:
				return fixedAssetId != null;
			case FixedassetPackage.PARTY_FIXED_ASSET_ASSIGNMENT__STATUS_ID:
				return statusId != null;
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
		result.append(" (fromDate: ");
		result.append(fromDate);
		result.append(", allocatedDate: ");
		result.append(allocatedDate);
		result.append(", comments: ");
		result.append(comments);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //PartyFixedAssetAssignmentImpl
