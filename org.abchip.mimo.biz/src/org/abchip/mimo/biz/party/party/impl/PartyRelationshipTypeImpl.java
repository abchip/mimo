/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.abchip.mimo.biz.party.party.PartyRelationship;
import org.abchip.mimo.biz.party.party.PartyRelationshipType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipTypeImpl#getPartyRelationshipTypeId <em>Party Relationship Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipTypeImpl#getPartyRelationshipName <em>Party Relationship Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipTypeImpl#getRoleTypeIdValidFrom <em>Role Type Id Valid From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipTypeImpl#getRoleTypeIdValidTo <em>Role Type Id Valid To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyRelationshipTypeImpl extends BizEntityTypeImpl<PartyRelationship> implements PartyRelationshipType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	 * The default value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_TABLE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected boolean hasTable = HAS_TABLE_EDEFAULT;
	/**
	 * The default value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected String parentTypeId = PARENT_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getPartyRelationshipName() <em>Party Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyRelationshipName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_RELATIONSHIP_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPartyRelationshipName() <em>Party Relationship Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyRelationshipName()
	 * @generated
	 * @ordered
	 */
	protected String partyRelationshipName = PARTY_RELATIONSHIP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleTypeIdValidFrom() <em>Role Type Id Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdValidFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TYPE_ID_VALID_FROM_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRoleTypeIdValidFrom() <em>Role Type Id Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdValidFrom()
	 * @generated
	 * @ordered
	 */
	protected String roleTypeIdValidFrom = ROLE_TYPE_ID_VALID_FROM_EDEFAULT;
	/**
	 * The default value of the '{@link #getRoleTypeIdValidTo() <em>Role Type Id Valid To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdValidTo()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TYPE_ID_VALID_TO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRoleTypeIdValidTo() <em>Role Type Id Valid To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdValidTo()
	 * @generated
	 * @ordered
	 */
	protected String roleTypeIdValidTo = ROLE_TYPE_ID_VALID_TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyRelationshipTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.PARTY_RELATIONSHIP_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_RELATIONSHIP_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return hasTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		boolean oldHasTable = hasTable;
		hasTable = newHasTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_RELATIONSHIP_TYPE__HAS_TABLE, oldHasTable, hasTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyRelationshipName() {
		return partyRelationshipName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyRelationshipName(String newPartyRelationshipName) {
		String oldPartyRelationshipName = partyRelationshipName;
		partyRelationshipName = newPartyRelationshipName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_NAME, oldPartyRelationshipName, partyRelationshipName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(String newParentTypeId) {
		String oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_RELATIONSHIP_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleTypeIdValidFrom() {
		return roleTypeIdValidFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdValidFrom(String newRoleTypeIdValidFrom) {
		String oldRoleTypeIdValidFrom = roleTypeIdValidFrom;
		roleTypeIdValidFrom = newRoleTypeIdValidFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_FROM, oldRoleTypeIdValidFrom, roleTypeIdValidFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleTypeIdValidTo() {
		return roleTypeIdValidTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdValidTo(String newRoleTypeIdValidTo) {
		String oldRoleTypeIdValidTo = roleTypeIdValidTo;
		roleTypeIdValidTo = newRoleTypeIdValidTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_TO, oldRoleTypeIdValidTo, roleTypeIdValidTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childPartyRelationshipTypes() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_TYPE_ID, oldPartyRelationshipTypeId, partyRelationshipTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_TYPE_ID:
				return getPartyRelationshipTypeId();
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__DESCRIPTION:
				return getDescription();
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__HAS_TABLE:
				return isHasTable();
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__PARENT_TYPE_ID:
				return getParentTypeId();
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_NAME:
				return getPartyRelationshipName();
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_FROM:
				return getRoleTypeIdValidFrom();
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_TO:
				return getRoleTypeIdValidTo();
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
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_TYPE_ID:
				setPartyRelationshipTypeId((String)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__PARENT_TYPE_ID:
				setParentTypeId((String)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_NAME:
				setPartyRelationshipName((String)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_FROM:
				setRoleTypeIdValidFrom((String)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_TO:
				setRoleTypeIdValidTo((String)newValue);
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
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_TYPE_ID:
				setPartyRelationshipTypeId(PARTY_RELATIONSHIP_TYPE_ID_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__PARENT_TYPE_ID:
				setParentTypeId(PARENT_TYPE_ID_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_NAME:
				setPartyRelationshipName(PARTY_RELATIONSHIP_NAME_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_FROM:
				setRoleTypeIdValidFrom(ROLE_TYPE_ID_VALID_FROM_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_TO:
				setRoleTypeIdValidTo(ROLE_TYPE_ID_VALID_TO_EDEFAULT);
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
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_TYPE_ID:
				return PARTY_RELATIONSHIP_TYPE_ID_EDEFAULT == null ? partyRelationshipTypeId != null : !PARTY_RELATIONSHIP_TYPE_ID_EDEFAULT.equals(partyRelationshipTypeId);
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__PARENT_TYPE_ID:
				return PARENT_TYPE_ID_EDEFAULT == null ? parentTypeId != null : !PARENT_TYPE_ID_EDEFAULT.equals(parentTypeId);
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_NAME:
				return PARTY_RELATIONSHIP_NAME_EDEFAULT == null ? partyRelationshipName != null : !PARTY_RELATIONSHIP_NAME_EDEFAULT.equals(partyRelationshipName);
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_FROM:
				return ROLE_TYPE_ID_VALID_FROM_EDEFAULT == null ? roleTypeIdValidFrom != null : !ROLE_TYPE_ID_VALID_FROM_EDEFAULT.equals(roleTypeIdValidFrom);
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_TO:
				return ROLE_TYPE_ID_VALID_TO_EDEFAULT == null ? roleTypeIdValidTo != null : !ROLE_TYPE_ID_VALID_TO_EDEFAULT.equals(roleTypeIdValidTo);
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
		result.append(" (partyRelationshipTypeId: ");
		result.append(partyRelationshipTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(", parentTypeId: ");
		result.append(parentTypeId);
		result.append(", partyRelationshipName: ");
		result.append(partyRelationshipName);
		result.append(", roleTypeIdValidFrom: ");
		result.append(roleTypeIdValidFrom);
		result.append(", roleTypeIdValidTo: ");
		result.append(roleTypeIdValidTo);
		result.append(')');
		return result.toString();
	}

} //PartyRelationshipTypeImpl
