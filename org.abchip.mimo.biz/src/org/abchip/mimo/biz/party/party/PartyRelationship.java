/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party;

import java.util.Date;

import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.security.securitygroup.SecurityGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyRelationship#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyRelationship#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyRelationship#getRoleTypeIdFrom <em>Role Type Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyRelationship#getRoleTypeIdTo <em>Role Type Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyRelationship#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyRelationship#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyRelationship#getPartyRelationshipTypeId <em>Party Relationship Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyRelationship#getPermissionsEnumId <em>Permissions Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyRelationship#getPositionTitle <em>Position Title</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyRelationship#getPriorityTypeId <em>Priority Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyRelationship#getRelationshipName <em>Relationship Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyRelationship#getSecurityGroupId <em>Security Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyRelationship#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.PartyRelationship#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyRelationship()
 * @model
 * @generated
 */
public interface PartyRelationship extends BizEntityTyped<PartyRelationshipType> {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyRelationship_Comments()
	 * @model annotation="mimo-ent-format type='comment' length='255'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyRelationship_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Permissions Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permissions Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions Enum Id</em>' attribute.
	 * @see #setPermissionsEnumId(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyRelationship_PermissionsEnumId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPermissionsEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getPermissionsEnumId <em>Permissions Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permissions Enum Id</em>' attribute.
	 * @see #getPermissionsEnumId()
	 * @generated
	 */
	void setPermissionsEnumId(String value);

	/**
	 * Returns the value of the '<em><b>Position Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Title</em>' attribute.
	 * @see #setPositionTitle(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyRelationship_PositionTitle()
	 * @model annotation="mimo-ent-slot help='The exact word used within the company'"
	 *        annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getPositionTitle();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getPositionTitle <em>Position Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Title</em>' attribute.
	 * @see #getPositionTitle()
	 * @generated
	 */
	void setPositionTitle(String value);

	/**
	 * Returns the value of the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Name</em>' attribute.
	 * @see #setRelationshipName(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyRelationship_RelationshipName()
	 * @model annotation="mimo-ent-slot help='Official name of relationship, such as title in a company'"
	 *        annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getRelationshipName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getRelationshipName <em>Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Name</em>' attribute.
	 * @see #getRelationshipName()
	 * @generated
	 */
	void setRelationshipName(String value);

	/**
	 * Returns the value of the '<em><b>Security Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Group Id</em>' reference.
	 * @see #setSecurityGroupId(SecurityGroup)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyRelationship_SecurityGroupId()
	 * @model keys="groupId"
	 * @generated
	 */
	SecurityGroup getSecurityGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getSecurityGroupId <em>Security Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Group Id</em>' reference.
	 * @see #getSecurityGroupId()
	 * @generated
	 */
	void setSecurityGroupId(SecurityGroup value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' reference.
	 * @see #setStatusId(StatusItem)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyRelationship_StatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getStatusId <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' reference.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyRelationship_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Party Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id From</em>' reference.
	 * @see #setPartyIdFrom(Party)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyRelationship_PartyIdFrom()
	 * @model keys="partyId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getPartyIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getPartyIdFrom <em>Party Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id From</em>' reference.
	 * @see #getPartyIdFrom()
	 * @generated
	 */
	void setPartyIdFrom(Party value);

	/**
	 * Returns the value of the '<em><b>Party Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id To</em>' reference.
	 * @see #setPartyIdTo(Party)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyRelationship_PartyIdTo()
	 * @model keys="partyId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getPartyIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getPartyIdTo <em>Party Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id To</em>' reference.
	 * @see #getPartyIdTo()
	 * @generated
	 */
	void setPartyIdTo(Party value);

	/**
	 * Returns the value of the '<em><b>Role Type Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id From</em>' reference.
	 * @see #setRoleTypeIdFrom(RoleType)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyRelationship_RoleTypeIdFrom()
	 * @model keys="roleTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	RoleType getRoleTypeIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getRoleTypeIdFrom <em>Role Type Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id From</em>' reference.
	 * @see #getRoleTypeIdFrom()
	 * @generated
	 */
	void setRoleTypeIdFrom(RoleType value);

	/**
	 * Returns the value of the '<em><b>Role Type Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id To</em>' reference.
	 * @see #setRoleTypeIdTo(RoleType)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyRelationship_RoleTypeIdTo()
	 * @model keys="roleTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	RoleType getRoleTypeIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getRoleTypeIdTo <em>Role Type Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id To</em>' reference.
	 * @see #getRoleTypeIdTo()
	 * @generated
	 */
	void setRoleTypeIdTo(RoleType value);

	/**
	 * Returns the value of the '<em><b>Priority Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority Type Id</em>' reference.
	 * @see #setPriorityTypeId(PriorityType)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyRelationship_PriorityTypeId()
	 * @model keys="priorityTypeId"
	 * @generated
	 */
	PriorityType getPriorityTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getPriorityTypeId <em>Priority Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority Type Id</em>' reference.
	 * @see #getPriorityTypeId()
	 * @generated
	 */
	void setPriorityTypeId(PriorityType value);

	/**
	 * Returns the value of the '<em><b>Party Relationship Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Relationship Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Relationship Type Id</em>' reference.
	 * @see #setPartyRelationshipTypeId(PartyRelationshipType)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getPartyRelationship_PartyRelationshipTypeId()
	 * @model keys="partyRelationshipTypeId"
	 * @generated
	 */
	PartyRelationshipType getPartyRelationshipTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getPartyRelationshipTypeId <em>Party Relationship Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Relationship Type Id</em>' reference.
	 * @see #getPartyRelationshipTypeId()
	 * @generated
	 */
	void setPartyRelationshipTypeId(PartyRelationshipType value);

} // PartyRelationship
