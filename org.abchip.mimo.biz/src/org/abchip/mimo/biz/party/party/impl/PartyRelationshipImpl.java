/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getPermissionsEnumId <em>Permissions Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getPositionTitle <em>Position Title</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getRelationshipName <em>Relationship Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getRoleTypeIdFrom <em>Role Type Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getRoleTypeIdTo <em>Role Type Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getPriorityTypeId <em>Priority Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getPartyRelationshipTypeId <em>Party Relationship Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl#getSecurityGroupId <em>Security Group Id</em>}</li>
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
	 * The default value of the '{@link #getPartyIdFrom() <em>Party Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_FROM_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPartyIdFrom() <em>Party Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdFrom()
	 * @generated
	 * @ordered
	 */
	protected String partyIdFrom = PARTY_ID_FROM_EDEFAULT;

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
	 * The default value of the '{@link #getPermissionsEnumId() <em>Permissions Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissionsEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String PERMISSIONS_ENUM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPermissionsEnumId() <em>Permissions Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissionsEnumId()
	 * @generated
	 * @ordered
	 */
	protected String permissionsEnumId = PERMISSIONS_ENUM_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getPositionTitle() <em>Position Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_TITLE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPositionTitle() <em>Position Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionTitle()
	 * @generated
	 * @ordered
	 */
	protected String positionTitle = POSITION_TITLE_EDEFAULT;
	/**
	 * The default value of the '{@link #getRelationshipName() <em>Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipName()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATIONSHIP_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRelationshipName() <em>Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipName()
	 * @generated
	 * @ordered
	 */
	protected String relationshipName = RELATIONSHIP_NAME_EDEFAULT;
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
	 * The cached value of the '{@link #getPartyIdTo() <em>Party Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdTo()
	 * @generated
	 * @ordered
	 */
	protected Party partyIdTo;
	/**
	 * The cached value of the '{@link #getRoleTypeIdFrom() <em>Role Type Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdFrom()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleTypeIdFrom;
	/**
	 * The cached value of the '{@link #getRoleTypeIdTo() <em>Role Type Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdTo()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleTypeIdTo;
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
	 * The cached value of the '{@link #getPriorityTypeId() <em>Priority Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityTypeId()
	 * @generated
	 * @ordered
	 */
	protected PriorityType priorityTypeId;
	/**
	 * The cached value of the '{@link #getPartyRelationshipTypeId() <em>Party Relationship Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyRelationshipTypeId()
	 * @generated
	 * @ordered
	 */
	protected PartyRelationshipType partyRelationshipTypeId;
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
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_RELATIONSHIP__COMMENTS, oldComments, comments));
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
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_RELATIONSHIP__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPermissionsEnumId() {
		return permissionsEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPermissionsEnumId(String newPermissionsEnumId) {
		String oldPermissionsEnumId = permissionsEnumId;
		permissionsEnumId = newPermissionsEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_RELATIONSHIP__PERMISSIONS_ENUM_ID, oldPermissionsEnumId, permissionsEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPositionTitle() {
		return positionTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionTitle(String newPositionTitle) {
		String oldPositionTitle = positionTitle;
		positionTitle = newPositionTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_RELATIONSHIP__POSITION_TITLE, oldPositionTitle, positionTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRelationshipName() {
		return relationshipName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationshipName(String newRelationshipName) {
		String oldRelationshipName = relationshipName;
		relationshipName = newRelationshipName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_RELATIONSHIP__RELATIONSHIP_NAME, oldRelationshipName, relationshipName));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartyPackage.PARTY_RELATIONSHIP__SECURITY_GROUP_ID, oldSecurityGroupId, securityGroupId));
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
		SecurityGroup oldSecurityGroupId = securityGroupId;
		securityGroupId = newSecurityGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_RELATIONSHIP__SECURITY_GROUP_ID, oldSecurityGroupId, securityGroupId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartyPackage.PARTY_RELATIONSHIP__STATUS_ID, oldStatusId, statusId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_RELATIONSHIP__STATUS_ID, oldStatusId, statusId));
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
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_RELATIONSHIP__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyIdFrom() {
		return partyIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdFrom(String newPartyIdFrom) {
		String oldPartyIdFrom = partyIdFrom;
		partyIdFrom = newPartyIdFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_RELATIONSHIP__PARTY_ID_FROM, oldPartyIdFrom, partyIdFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyIdTo() {
		if (partyIdTo != null && ((EObject)partyIdTo).eIsProxy()) {
			InternalEObject oldPartyIdTo = (InternalEObject)partyIdTo;
			partyIdTo = (Party)eResolveProxy(oldPartyIdTo);
			if (partyIdTo != oldPartyIdTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartyPackage.PARTY_RELATIONSHIP__PARTY_ID_TO, oldPartyIdTo, partyIdTo));
			}
		}
		return partyIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyIdTo() {
		return partyIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdTo(Party newPartyIdTo) {
		Party oldPartyIdTo = partyIdTo;
		partyIdTo = newPartyIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_RELATIONSHIP__PARTY_ID_TO, oldPartyIdTo, partyIdTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleTypeIdFrom() {
		if (roleTypeIdFrom != null && ((EObject)roleTypeIdFrom).eIsProxy()) {
			InternalEObject oldRoleTypeIdFrom = (InternalEObject)roleTypeIdFrom;
			roleTypeIdFrom = (RoleType)eResolveProxy(oldRoleTypeIdFrom);
			if (roleTypeIdFrom != oldRoleTypeIdFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartyPackage.PARTY_RELATIONSHIP__ROLE_TYPE_ID_FROM, oldRoleTypeIdFrom, roleTypeIdFrom));
			}
		}
		return roleTypeIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetRoleTypeIdFrom() {
		return roleTypeIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdFrom(RoleType newRoleTypeIdFrom) {
		RoleType oldRoleTypeIdFrom = roleTypeIdFrom;
		roleTypeIdFrom = newRoleTypeIdFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_RELATIONSHIP__ROLE_TYPE_ID_FROM, oldRoleTypeIdFrom, roleTypeIdFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleTypeIdTo() {
		if (roleTypeIdTo != null && ((EObject)roleTypeIdTo).eIsProxy()) {
			InternalEObject oldRoleTypeIdTo = (InternalEObject)roleTypeIdTo;
			roleTypeIdTo = (RoleType)eResolveProxy(oldRoleTypeIdTo);
			if (roleTypeIdTo != oldRoleTypeIdTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartyPackage.PARTY_RELATIONSHIP__ROLE_TYPE_ID_TO, oldRoleTypeIdTo, roleTypeIdTo));
			}
		}
		return roleTypeIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetRoleTypeIdTo() {
		return roleTypeIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdTo(RoleType newRoleTypeIdTo) {
		RoleType oldRoleTypeIdTo = roleTypeIdTo;
		roleTypeIdTo = newRoleTypeIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_RELATIONSHIP__ROLE_TYPE_ID_TO, oldRoleTypeIdTo, roleTypeIdTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PriorityType getPriorityTypeId() {
		if (priorityTypeId != null && ((EObject)priorityTypeId).eIsProxy()) {
			InternalEObject oldPriorityTypeId = (InternalEObject)priorityTypeId;
			priorityTypeId = (PriorityType)eResolveProxy(oldPriorityTypeId);
			if (priorityTypeId != oldPriorityTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartyPackage.PARTY_RELATIONSHIP__PRIORITY_TYPE_ID, oldPriorityTypeId, priorityTypeId));
			}
		}
		return priorityTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityType basicGetPriorityTypeId() {
		return priorityTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriorityTypeId(PriorityType newPriorityTypeId) {
		PriorityType oldPriorityTypeId = priorityTypeId;
		priorityTypeId = newPriorityTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_RELATIONSHIP__PRIORITY_TYPE_ID, oldPriorityTypeId, priorityTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyRelationshipType getPartyRelationshipTypeId() {
		if (partyRelationshipTypeId != null && ((EObject)partyRelationshipTypeId).eIsProxy()) {
			InternalEObject oldPartyRelationshipTypeId = (InternalEObject)partyRelationshipTypeId;
			partyRelationshipTypeId = (PartyRelationshipType)eResolveProxy(oldPartyRelationshipTypeId);
			if (partyRelationshipTypeId != oldPartyRelationshipTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartyPackage.PARTY_RELATIONSHIP__PARTY_RELATIONSHIP_TYPE_ID, oldPartyRelationshipTypeId, partyRelationshipTypeId));
			}
		}
		return partyRelationshipTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyRelationshipType basicGetPartyRelationshipTypeId() {
		return partyRelationshipTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyRelationshipTypeId(PartyRelationshipType newPartyRelationshipTypeId) {
		PartyRelationshipType oldPartyRelationshipTypeId = partyRelationshipTypeId;
		partyRelationshipTypeId = newPartyRelationshipTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_RELATIONSHIP__PARTY_RELATIONSHIP_TYPE_ID, oldPartyRelationshipTypeId, partyRelationshipTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartyPackage.PARTY_RELATIONSHIP__PARTY_ID_FROM:
				return getPartyIdFrom();
			case PartyPackage.PARTY_RELATIONSHIP__FROM_DATE:
				return getFromDate();
			case PartyPackage.PARTY_RELATIONSHIP__COMMENTS:
				return getComments();
			case PartyPackage.PARTY_RELATIONSHIP__PERMISSIONS_ENUM_ID:
				return getPermissionsEnumId();
			case PartyPackage.PARTY_RELATIONSHIP__POSITION_TITLE:
				return getPositionTitle();
			case PartyPackage.PARTY_RELATIONSHIP__RELATIONSHIP_NAME:
				return getRelationshipName();
			case PartyPackage.PARTY_RELATIONSHIP__THRU_DATE:
				return getThruDate();
			case PartyPackage.PARTY_RELATIONSHIP__PARTY_ID_TO:
				if (resolve) return getPartyIdTo();
				return basicGetPartyIdTo();
			case PartyPackage.PARTY_RELATIONSHIP__ROLE_TYPE_ID_FROM:
				if (resolve) return getRoleTypeIdFrom();
				return basicGetRoleTypeIdFrom();
			case PartyPackage.PARTY_RELATIONSHIP__ROLE_TYPE_ID_TO:
				if (resolve) return getRoleTypeIdTo();
				return basicGetRoleTypeIdTo();
			case PartyPackage.PARTY_RELATIONSHIP__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case PartyPackage.PARTY_RELATIONSHIP__PRIORITY_TYPE_ID:
				if (resolve) return getPriorityTypeId();
				return basicGetPriorityTypeId();
			case PartyPackage.PARTY_RELATIONSHIP__PARTY_RELATIONSHIP_TYPE_ID:
				if (resolve) return getPartyRelationshipTypeId();
				return basicGetPartyRelationshipTypeId();
			case PartyPackage.PARTY_RELATIONSHIP__SECURITY_GROUP_ID:
				if (resolve) return getSecurityGroupId();
				return basicGetSecurityGroupId();
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
			case PartyPackage.PARTY_RELATIONSHIP__PARTY_ID_FROM:
				setPartyIdFrom((String)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__COMMENTS:
				setComments((String)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__PERMISSIONS_ENUM_ID:
				setPermissionsEnumId((String)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__POSITION_TITLE:
				setPositionTitle((String)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__RELATIONSHIP_NAME:
				setRelationshipName((String)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__PARTY_ID_TO:
				setPartyIdTo((Party)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__ROLE_TYPE_ID_FROM:
				setRoleTypeIdFrom((RoleType)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__ROLE_TYPE_ID_TO:
				setRoleTypeIdTo((RoleType)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__PRIORITY_TYPE_ID:
				setPriorityTypeId((PriorityType)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__PARTY_RELATIONSHIP_TYPE_ID:
				setPartyRelationshipTypeId((PartyRelationshipType)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__SECURITY_GROUP_ID:
				setSecurityGroupId((SecurityGroup)newValue);
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
			case PartyPackage.PARTY_RELATIONSHIP__PARTY_ID_FROM:
				setPartyIdFrom(PARTY_ID_FROM_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__PERMISSIONS_ENUM_ID:
				setPermissionsEnumId(PERMISSIONS_ENUM_ID_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__POSITION_TITLE:
				setPositionTitle(POSITION_TITLE_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__RELATIONSHIP_NAME:
				setRelationshipName(RELATIONSHIP_NAME_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__PARTY_ID_TO:
				setPartyIdTo((Party)null);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__ROLE_TYPE_ID_FROM:
				setRoleTypeIdFrom((RoleType)null);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__ROLE_TYPE_ID_TO:
				setRoleTypeIdTo((RoleType)null);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__PRIORITY_TYPE_ID:
				setPriorityTypeId((PriorityType)null);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__PARTY_RELATIONSHIP_TYPE_ID:
				setPartyRelationshipTypeId((PartyRelationshipType)null);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__SECURITY_GROUP_ID:
				setSecurityGroupId((SecurityGroup)null);
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
			case PartyPackage.PARTY_RELATIONSHIP__PARTY_ID_FROM:
				return PARTY_ID_FROM_EDEFAULT == null ? partyIdFrom != null : !PARTY_ID_FROM_EDEFAULT.equals(partyIdFrom);
			case PartyPackage.PARTY_RELATIONSHIP__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case PartyPackage.PARTY_RELATIONSHIP__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case PartyPackage.PARTY_RELATIONSHIP__PERMISSIONS_ENUM_ID:
				return PERMISSIONS_ENUM_ID_EDEFAULT == null ? permissionsEnumId != null : !PERMISSIONS_ENUM_ID_EDEFAULT.equals(permissionsEnumId);
			case PartyPackage.PARTY_RELATIONSHIP__POSITION_TITLE:
				return POSITION_TITLE_EDEFAULT == null ? positionTitle != null : !POSITION_TITLE_EDEFAULT.equals(positionTitle);
			case PartyPackage.PARTY_RELATIONSHIP__RELATIONSHIP_NAME:
				return RELATIONSHIP_NAME_EDEFAULT == null ? relationshipName != null : !RELATIONSHIP_NAME_EDEFAULT.equals(relationshipName);
			case PartyPackage.PARTY_RELATIONSHIP__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case PartyPackage.PARTY_RELATIONSHIP__PARTY_ID_TO:
				return partyIdTo != null;
			case PartyPackage.PARTY_RELATIONSHIP__ROLE_TYPE_ID_FROM:
				return roleTypeIdFrom != null;
			case PartyPackage.PARTY_RELATIONSHIP__ROLE_TYPE_ID_TO:
				return roleTypeIdTo != null;
			case PartyPackage.PARTY_RELATIONSHIP__STATUS_ID:
				return statusId != null;
			case PartyPackage.PARTY_RELATIONSHIP__PRIORITY_TYPE_ID:
				return priorityTypeId != null;
			case PartyPackage.PARTY_RELATIONSHIP__PARTY_RELATIONSHIP_TYPE_ID:
				return partyRelationshipTypeId != null;
			case PartyPackage.PARTY_RELATIONSHIP__SECURITY_GROUP_ID:
				return securityGroupId != null;
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
		result.append(" (partyIdFrom: ");
		result.append(partyIdFrom);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", comments: ");
		result.append(comments);
		result.append(", permissionsEnumId: ");
		result.append(permissionsEnumId);
		result.append(", positionTitle: ");
		result.append(positionTitle);
		result.append(", relationshipName: ");
		result.append(relationshipName);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //PartyRelationshipImpl
