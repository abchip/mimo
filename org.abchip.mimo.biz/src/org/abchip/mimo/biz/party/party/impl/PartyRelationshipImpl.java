/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.abchip.mimo.biz.party.party.PartyRelationship;
import org.abchip.mimo.biz.party.party.PartyRelationshipType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
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
	 * The default value of the '{@link #getPartyIdTo() <em>Party Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_TO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPartyIdTo() <em>Party Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdTo()
	 * @generated
	 * @ordered
	 */
	protected String partyIdTo = PARTY_ID_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleTypeIdFrom() <em>Role Type Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TYPE_ID_FROM_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRoleTypeIdFrom() <em>Role Type Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdFrom()
	 * @generated
	 * @ordered
	 */
	protected String roleTypeIdFrom = ROLE_TYPE_ID_FROM_EDEFAULT;
	/**
	 * The default value of the '{@link #getRoleTypeIdTo() <em>Role Type Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TYPE_ID_TO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRoleTypeIdTo() <em>Role Type Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdTo()
	 * @generated
	 * @ordered
	 */
	protected String roleTypeIdTo = ROLE_TYPE_ID_TO_EDEFAULT;
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
	 * The default value of the '{@link #getPartyRelationshipTypeId() <em>Party Relationship Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyRelationshipTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_RELATIONSHIP_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPartyRelationshipTypeId() <em>Party Relationship Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyRelationshipTypeId()
	 * @generated
	 * @ordered
	 */
	protected String partyRelationshipTypeId = PARTY_RELATIONSHIP_TYPE_ID_EDEFAULT;
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
	 * The default value of the '{@link #getPriorityTypeId() <em>Priority Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORITY_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPriorityTypeId() <em>Priority Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityTypeId()
	 * @generated
	 * @ordered
	 */
	protected String priorityTypeId = PRIORITY_TYPE_ID_EDEFAULT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_RELATIONSHIP__SECURITY_GROUP_ID, oldSecurityGroupId, securityGroupId));
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
	public String getPartyIdTo() {
		return partyIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdTo(String newPartyIdTo) {
		String oldPartyIdTo = partyIdTo;
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
	public String getRoleTypeIdFrom() {
		return roleTypeIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdFrom(String newRoleTypeIdFrom) {
		String oldRoleTypeIdFrom = roleTypeIdFrom;
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
	public String getRoleTypeIdTo() {
		return roleTypeIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdTo(String newRoleTypeIdTo) {
		String oldRoleTypeIdTo = roleTypeIdTo;
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
	public String getPriorityTypeId() {
		return priorityTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriorityTypeId(String newPriorityTypeId) {
		String oldPriorityTypeId = priorityTypeId;
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
	public String getPartyRelationshipTypeId() {
		return partyRelationshipTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyRelationshipTypeId(String newPartyRelationshipTypeId) {
		String oldPartyRelationshipTypeId = partyRelationshipTypeId;
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
			case PartyPackage.PARTY_RELATIONSHIP__PARTY_ID_TO:
				return getPartyIdTo();
			case PartyPackage.PARTY_RELATIONSHIP__ROLE_TYPE_ID_FROM:
				return getRoleTypeIdFrom();
			case PartyPackage.PARTY_RELATIONSHIP__ROLE_TYPE_ID_TO:
				return getRoleTypeIdTo();
			case PartyPackage.PARTY_RELATIONSHIP__FROM_DATE:
				return getFromDate();
			case PartyPackage.PARTY_RELATIONSHIP__COMMENTS:
				return getComments();
			case PartyPackage.PARTY_RELATIONSHIP__PARTY_RELATIONSHIP_TYPE_ID:
				return getPartyRelationshipTypeId();
			case PartyPackage.PARTY_RELATIONSHIP__PERMISSIONS_ENUM_ID:
				return getPermissionsEnumId();
			case PartyPackage.PARTY_RELATIONSHIP__POSITION_TITLE:
				return getPositionTitle();
			case PartyPackage.PARTY_RELATIONSHIP__PRIORITY_TYPE_ID:
				return getPriorityTypeId();
			case PartyPackage.PARTY_RELATIONSHIP__RELATIONSHIP_NAME:
				return getRelationshipName();
			case PartyPackage.PARTY_RELATIONSHIP__SECURITY_GROUP_ID:
				return getSecurityGroupId();
			case PartyPackage.PARTY_RELATIONSHIP__STATUS_ID:
				return getStatusId();
			case PartyPackage.PARTY_RELATIONSHIP__THRU_DATE:
				return getThruDate();
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
			case PartyPackage.PARTY_RELATIONSHIP__PARTY_ID_TO:
				setPartyIdTo((String)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__ROLE_TYPE_ID_FROM:
				setRoleTypeIdFrom((String)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__ROLE_TYPE_ID_TO:
				setRoleTypeIdTo((String)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__COMMENTS:
				setComments((String)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__PARTY_RELATIONSHIP_TYPE_ID:
				setPartyRelationshipTypeId((String)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__PERMISSIONS_ENUM_ID:
				setPermissionsEnumId((String)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__POSITION_TITLE:
				setPositionTitle((String)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__PRIORITY_TYPE_ID:
				setPriorityTypeId((String)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__RELATIONSHIP_NAME:
				setRelationshipName((String)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__SECURITY_GROUP_ID:
				setSecurityGroupId((String)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__STATUS_ID:
				setStatusId((String)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__THRU_DATE:
				setThruDate((Date)newValue);
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
			case PartyPackage.PARTY_RELATIONSHIP__PARTY_ID_TO:
				setPartyIdTo(PARTY_ID_TO_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__ROLE_TYPE_ID_FROM:
				setRoleTypeIdFrom(ROLE_TYPE_ID_FROM_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__ROLE_TYPE_ID_TO:
				setRoleTypeIdTo(ROLE_TYPE_ID_TO_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__PARTY_RELATIONSHIP_TYPE_ID:
				setPartyRelationshipTypeId(PARTY_RELATIONSHIP_TYPE_ID_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__PERMISSIONS_ENUM_ID:
				setPermissionsEnumId(PERMISSIONS_ENUM_ID_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__POSITION_TITLE:
				setPositionTitle(POSITION_TITLE_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__PRIORITY_TYPE_ID:
				setPriorityTypeId(PRIORITY_TYPE_ID_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__RELATIONSHIP_NAME:
				setRelationshipName(RELATIONSHIP_NAME_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__SECURITY_GROUP_ID:
				setSecurityGroupId(SECURITY_GROUP_ID_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
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
			case PartyPackage.PARTY_RELATIONSHIP__PARTY_ID_TO:
				return PARTY_ID_TO_EDEFAULT == null ? partyIdTo != null : !PARTY_ID_TO_EDEFAULT.equals(partyIdTo);
			case PartyPackage.PARTY_RELATIONSHIP__ROLE_TYPE_ID_FROM:
				return ROLE_TYPE_ID_FROM_EDEFAULT == null ? roleTypeIdFrom != null : !ROLE_TYPE_ID_FROM_EDEFAULT.equals(roleTypeIdFrom);
			case PartyPackage.PARTY_RELATIONSHIP__ROLE_TYPE_ID_TO:
				return ROLE_TYPE_ID_TO_EDEFAULT == null ? roleTypeIdTo != null : !ROLE_TYPE_ID_TO_EDEFAULT.equals(roleTypeIdTo);
			case PartyPackage.PARTY_RELATIONSHIP__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case PartyPackage.PARTY_RELATIONSHIP__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case PartyPackage.PARTY_RELATIONSHIP__PARTY_RELATIONSHIP_TYPE_ID:
				return PARTY_RELATIONSHIP_TYPE_ID_EDEFAULT == null ? partyRelationshipTypeId != null : !PARTY_RELATIONSHIP_TYPE_ID_EDEFAULT.equals(partyRelationshipTypeId);
			case PartyPackage.PARTY_RELATIONSHIP__PERMISSIONS_ENUM_ID:
				return PERMISSIONS_ENUM_ID_EDEFAULT == null ? permissionsEnumId != null : !PERMISSIONS_ENUM_ID_EDEFAULT.equals(permissionsEnumId);
			case PartyPackage.PARTY_RELATIONSHIP__POSITION_TITLE:
				return POSITION_TITLE_EDEFAULT == null ? positionTitle != null : !POSITION_TITLE_EDEFAULT.equals(positionTitle);
			case PartyPackage.PARTY_RELATIONSHIP__PRIORITY_TYPE_ID:
				return PRIORITY_TYPE_ID_EDEFAULT == null ? priorityTypeId != null : !PRIORITY_TYPE_ID_EDEFAULT.equals(priorityTypeId);
			case PartyPackage.PARTY_RELATIONSHIP__RELATIONSHIP_NAME:
				return RELATIONSHIP_NAME_EDEFAULT == null ? relationshipName != null : !RELATIONSHIP_NAME_EDEFAULT.equals(relationshipName);
			case PartyPackage.PARTY_RELATIONSHIP__SECURITY_GROUP_ID:
				return SECURITY_GROUP_ID_EDEFAULT == null ? securityGroupId != null : !SECURITY_GROUP_ID_EDEFAULT.equals(securityGroupId);
			case PartyPackage.PARTY_RELATIONSHIP__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
			case PartyPackage.PARTY_RELATIONSHIP__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
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
		result.append(", partyIdTo: ");
		result.append(partyIdTo);
		result.append(", roleTypeIdFrom: ");
		result.append(roleTypeIdFrom);
		result.append(", roleTypeIdTo: ");
		result.append(roleTypeIdTo);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", comments: ");
		result.append(comments);
		result.append(", partyRelationshipTypeId: ");
		result.append(partyRelationshipTypeId);
		result.append(", permissionsEnumId: ");
		result.append(permissionsEnumId);
		result.append(", positionTitle: ");
		result.append(positionTitle);
		result.append(", priorityTypeId: ");
		result.append(priorityTypeId);
		result.append(", relationshipName: ");
		result.append(relationshipName);
		result.append(", securityGroupId: ");
		result.append(securityGroupId);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //PartyRelationshipImpl
