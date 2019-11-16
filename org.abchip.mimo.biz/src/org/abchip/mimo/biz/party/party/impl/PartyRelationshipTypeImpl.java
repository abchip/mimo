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
import org.abchip.mimo.biz.party.party.RoleType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipTypeImpl#getPartyRelationshipName <em>Party Relationship Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
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
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected PartyRelationshipType parentTypeId;

	/**
	 * The cached value of the '{@link #getRoleTypeIdValidFrom() <em>Role Type Id Valid From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdValidFrom()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleTypeIdValidFrom;
	/**
	 * The cached value of the '{@link #getRoleTypeIdValidTo() <em>Role Type Id Valid To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdValidTo()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleTypeIdValidTo;

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
	public PartyRelationshipType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (PartyRelationshipType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartyPackage.PARTY_RELATIONSHIP_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyRelationshipType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(PartyRelationshipType newParentTypeId) {
		PartyRelationshipType oldParentTypeId = parentTypeId;
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
	public RoleType getRoleTypeIdValidFrom() {
		if (roleTypeIdValidFrom != null && ((EObject)roleTypeIdValidFrom).eIsProxy()) {
			InternalEObject oldRoleTypeIdValidFrom = (InternalEObject)roleTypeIdValidFrom;
			roleTypeIdValidFrom = (RoleType)eResolveProxy(oldRoleTypeIdValidFrom);
			if (roleTypeIdValidFrom != oldRoleTypeIdValidFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartyPackage.PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_FROM, oldRoleTypeIdValidFrom, roleTypeIdValidFrom));
			}
		}
		return roleTypeIdValidFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetRoleTypeIdValidFrom() {
		return roleTypeIdValidFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdValidFrom(RoleType newRoleTypeIdValidFrom) {
		RoleType oldRoleTypeIdValidFrom = roleTypeIdValidFrom;
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
	public RoleType getRoleTypeIdValidTo() {
		if (roleTypeIdValidTo != null && ((EObject)roleTypeIdValidTo).eIsProxy()) {
			InternalEObject oldRoleTypeIdValidTo = (InternalEObject)roleTypeIdValidTo;
			roleTypeIdValidTo = (RoleType)eResolveProxy(oldRoleTypeIdValidTo);
			if (roleTypeIdValidTo != oldRoleTypeIdValidTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartyPackage.PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_TO, oldRoleTypeIdValidTo, roleTypeIdValidTo));
			}
		}
		return roleTypeIdValidTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetRoleTypeIdValidTo() {
		return roleTypeIdValidTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdValidTo(RoleType newRoleTypeIdValidTo) {
		RoleType oldRoleTypeIdValidTo = roleTypeIdValidTo;
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
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_NAME:
				return getPartyRelationshipName();
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_FROM:
				if (resolve) return getRoleTypeIdValidFrom();
				return basicGetRoleTypeIdValidFrom();
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_TO:
				if (resolve) return getRoleTypeIdValidTo();
				return basicGetRoleTypeIdValidTo();
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
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_NAME:
				setPartyRelationshipName((String)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__PARENT_TYPE_ID:
				setParentTypeId((PartyRelationshipType)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_FROM:
				setRoleTypeIdValidFrom((RoleType)newValue);
				return;
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_TO:
				setRoleTypeIdValidTo((RoleType)newValue);
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
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_NAME:
				setPartyRelationshipName(PARTY_RELATIONSHIP_NAME_EDEFAULT);
				return;
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__PARENT_TYPE_ID:
				setParentTypeId((PartyRelationshipType)null);
				return;
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_FROM:
				setRoleTypeIdValidFrom((RoleType)null);
				return;
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_TO:
				setRoleTypeIdValidTo((RoleType)null);
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
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_NAME:
				return PARTY_RELATIONSHIP_NAME_EDEFAULT == null ? partyRelationshipName != null : !PARTY_RELATIONSHIP_NAME_EDEFAULT.equals(partyRelationshipName);
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_FROM:
				return roleTypeIdValidFrom != null;
			case PartyPackage.PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_TO:
				return roleTypeIdValidTo != null;
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
		result.append(", partyRelationshipName: ");
		result.append(partyRelationshipName);
		result.append(')');
		return result.toString();
	}

} //PartyRelationshipTypeImpl
