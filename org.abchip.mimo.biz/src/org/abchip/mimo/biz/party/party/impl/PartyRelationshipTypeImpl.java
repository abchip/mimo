/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.abchip.mimo.biz.party.party.PartyRelationship;
import org.abchip.mimo.biz.party.party.PartyRelationshipType;
import org.abchip.mimo.biz.party.party.RoleType;
import org.eclipse.emf.ecore.EClass;

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
		return (String)eGet(PartyPackage.Literals.PARTY_RELATIONSHIP_TYPE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(PartyPackage.Literals.PARTY_RELATIONSHIP_TYPE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return (Boolean)eGet(PartyPackage.Literals.PARTY_RELATIONSHIP_TYPE__HAS_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		eSet(PartyPackage.Literals.PARTY_RELATIONSHIP_TYPE__HAS_TABLE, newHasTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyRelationshipName() {
		return (String)eGet(PartyPackage.Literals.PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyRelationshipName(String newPartyRelationshipName) {
		eSet(PartyPackage.Literals.PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_NAME, newPartyRelationshipName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyRelationshipType getParentTypeId() {
		return (PartyRelationshipType)eGet(PartyPackage.Literals.PARTY_RELATIONSHIP_TYPE__PARENT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(PartyRelationshipType newParentTypeId) {
		eSet(PartyPackage.Literals.PARTY_RELATIONSHIP_TYPE__PARENT_TYPE_ID, newParentTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleTypeIdValidFrom() {
		return (RoleType)eGet(PartyPackage.Literals.PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdValidFrom(RoleType newRoleTypeIdValidFrom) {
		eSet(PartyPackage.Literals.PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_FROM, newRoleTypeIdValidFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleTypeIdValidTo() {
		return (RoleType)eGet(PartyPackage.Literals.PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdValidTo(RoleType newRoleTypeIdValidTo) {
		eSet(PartyPackage.Literals.PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_TO, newRoleTypeIdValidTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyRelationshipTypeId() {
		return (String)eGet(PartyPackage.Literals.PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyRelationshipTypeId(String newPartyRelationshipTypeId) {
		eSet(PartyPackage.Literals.PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_TYPE_ID, newPartyRelationshipTypeId);
	}

} //PartyRelationshipTypeImpl
