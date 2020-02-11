/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import java.util.Date;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.abchip.mimo.biz.party.party.PartyRelationship;
import org.abchip.mimo.biz.party.party.PartyRelationshipType;
import org.abchip.mimo.biz.party.party.PriorityType;
import org.abchip.mimo.biz.party.party.RoleType;
import org.abchip.mimo.biz.security.securitygroup.SecurityGroup;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getRoleTypeIdFrom <em>Role Type Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getRoleTypeIdTo <em>Role Type Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getPartyRelationshipTypeId <em>Party Relationship Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getPermissionsEnumId <em>Permissions Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getPositionTitle <em>Position Title</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getPriorityTypeId <em>Priority Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getRelationshipName <em>Relationship Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getSecurityGroupId <em>Security Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyRelationshipImpl extends BizEntityTypedImpl<PartyRelationshipType> implements PartyRelationship {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.PARTY_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return (String)eGet(PartyPackage.Literals.PARTY_RELATIONSHIP__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(PartyPackage.Literals.PARTY_RELATIONSHIP__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(PartyPackage.Literals.PARTY_RELATIONSHIP__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(PartyPackage.Literals.PARTY_RELATIONSHIP__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPermissionsEnumId() {
		return (String)eGet(PartyPackage.Literals.PARTY_RELATIONSHIP__PERMISSIONS_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPermissionsEnumId(String newPermissionsEnumId) {
		eSet(PartyPackage.Literals.PARTY_RELATIONSHIP__PERMISSIONS_ENUM_ID, newPermissionsEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPositionTitle() {
		return (String)eGet(PartyPackage.Literals.PARTY_RELATIONSHIP__POSITION_TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionTitle(String newPositionTitle) {
		eSet(PartyPackage.Literals.PARTY_RELATIONSHIP__POSITION_TITLE, newPositionTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRelationshipName() {
		return (String)eGet(PartyPackage.Literals.PARTY_RELATIONSHIP__RELATIONSHIP_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationshipName(String newRelationshipName) {
		eSet(PartyPackage.Literals.PARTY_RELATIONSHIP__RELATIONSHIP_NAME, newRelationshipName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityGroup getSecurityGroupId() {
		return (SecurityGroup)eGet(PartyPackage.Literals.PARTY_RELATIONSHIP__SECURITY_GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityGroupId(SecurityGroup newSecurityGroupId) {
		eSet(PartyPackage.Literals.PARTY_RELATIONSHIP__SECURITY_GROUP_ID, newSecurityGroupId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		return (StatusItem)eGet(PartyPackage.Literals.PARTY_RELATIONSHIP__STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		eSet(PartyPackage.Literals.PARTY_RELATIONSHIP__STATUS_ID, newStatusId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(PartyPackage.Literals.PARTY_RELATIONSHIP__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(PartyPackage.Literals.PARTY_RELATIONSHIP__THRU_DATE, newThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyIdFrom() {
		return (Party)eGet(PartyPackage.Literals.PARTY_RELATIONSHIP__PARTY_ID_FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdFrom(Party newPartyIdFrom) {
		eSet(PartyPackage.Literals.PARTY_RELATIONSHIP__PARTY_ID_FROM, newPartyIdFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyIdTo() {
		return (Party)eGet(PartyPackage.Literals.PARTY_RELATIONSHIP__PARTY_ID_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdTo(Party newPartyIdTo) {
		eSet(PartyPackage.Literals.PARTY_RELATIONSHIP__PARTY_ID_TO, newPartyIdTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleTypeIdFrom() {
		return (RoleType)eGet(PartyPackage.Literals.PARTY_RELATIONSHIP__ROLE_TYPE_ID_FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdFrom(RoleType newRoleTypeIdFrom) {
		eSet(PartyPackage.Literals.PARTY_RELATIONSHIP__ROLE_TYPE_ID_FROM, newRoleTypeIdFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleTypeIdTo() {
		return (RoleType)eGet(PartyPackage.Literals.PARTY_RELATIONSHIP__ROLE_TYPE_ID_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdTo(RoleType newRoleTypeIdTo) {
		eSet(PartyPackage.Literals.PARTY_RELATIONSHIP__ROLE_TYPE_ID_TO, newRoleTypeIdTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PriorityType getPriorityTypeId() {
		return (PriorityType)eGet(PartyPackage.Literals.PARTY_RELATIONSHIP__PRIORITY_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriorityTypeId(PriorityType newPriorityTypeId) {
		eSet(PartyPackage.Literals.PARTY_RELATIONSHIP__PRIORITY_TYPE_ID, newPriorityTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyRelationshipType getPartyRelationshipTypeId() {
		return (PartyRelationshipType)eGet(PartyPackage.Literals.PARTY_RELATIONSHIP__PARTY_RELATIONSHIP_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyRelationshipTypeId(PartyRelationshipType newPartyRelationshipTypeId) {
		eSet(PartyPackage.Literals.PARTY_RELATIONSHIP__PARTY_RELATIONSHIP_TYPE_ID, newPartyRelationshipTypeId);
	}

} //PartyRelationshipImpl
