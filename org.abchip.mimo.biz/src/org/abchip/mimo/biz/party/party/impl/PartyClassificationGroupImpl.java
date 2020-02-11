/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.PartyClassificationGroup;
import org.abchip.mimo.biz.party.party.PartyClassificationType;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Classification Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyClassificationGroupImpl#getPartyClassificationGroupId <em>Party Classification Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyClassificationGroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyClassificationGroupImpl#getParentGroupId <em>Parent Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyClassificationGroupImpl#getPartyClassificationTypeId <em>Party Classification Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyClassificationGroupImpl extends BizEntityImpl implements PartyClassificationGroup {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyClassificationGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.PARTY_CLASSIFICATION_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(PartyPackage.Literals.PARTY_CLASSIFICATION_GROUP__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(PartyPackage.Literals.PARTY_CLASSIFICATION_GROUP__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyClassificationGroup getParentGroupId() {
		return (PartyClassificationGroup)eGet(PartyPackage.Literals.PARTY_CLASSIFICATION_GROUP__PARENT_GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentGroupId(PartyClassificationGroup newParentGroupId) {
		eSet(PartyPackage.Literals.PARTY_CLASSIFICATION_GROUP__PARENT_GROUP_ID, newParentGroupId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyClassificationType getPartyClassificationTypeId() {
		return (PartyClassificationType)eGet(PartyPackage.Literals.PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyClassificationTypeId(PartyClassificationType newPartyClassificationTypeId) {
		eSet(PartyPackage.Literals.PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_TYPE_ID, newPartyClassificationTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyClassificationGroupId() {
		return (String)eGet(PartyPackage.Literals.PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyClassificationGroupId(String newPartyClassificationGroupId) {
		eSet(PartyPackage.Literals.PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_GROUP_ID, newPartyClassificationGroupId);
	}

} //PartyClassificationGroupImpl
