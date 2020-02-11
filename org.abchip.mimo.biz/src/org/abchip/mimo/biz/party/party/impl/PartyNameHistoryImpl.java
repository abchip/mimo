/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.PartyNameHistory;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Name History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyNameHistoryImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyNameHistoryImpl#getChangeDate <em>Change Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyNameHistoryImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyNameHistoryImpl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyNameHistoryImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyNameHistoryImpl#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyNameHistoryImpl#getPersonalTitle <em>Personal Title</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyNameHistoryImpl#getSuffix <em>Suffix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyNameHistoryImpl extends BizEntityImpl implements PartyNameHistory {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyNameHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.PARTY_NAME_HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getChangeDate() {
		return (Date)eGet(PartyPackage.Literals.PARTY_NAME_HISTORY__CHANGE_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeDate(Date newChangeDate) {
		eSet(PartyPackage.Literals.PARTY_NAME_HISTORY__CHANGE_DATE, newChangeDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstName() {
		return (String)eGet(PartyPackage.Literals.PARTY_NAME_HISTORY__FIRST_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstName(String newFirstName) {
		eSet(PartyPackage.Literals.PARTY_NAME_HISTORY__FIRST_NAME, newFirstName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupName() {
		return (String)eGet(PartyPackage.Literals.PARTY_NAME_HISTORY__GROUP_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupName(String newGroupName) {
		eSet(PartyPackage.Literals.PARTY_NAME_HISTORY__GROUP_NAME, newGroupName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastName() {
		return (String)eGet(PartyPackage.Literals.PARTY_NAME_HISTORY__LAST_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastName(String newLastName) {
		eSet(PartyPackage.Literals.PARTY_NAME_HISTORY__LAST_NAME, newLastName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMiddleName() {
		return (String)eGet(PartyPackage.Literals.PARTY_NAME_HISTORY__MIDDLE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMiddleName(String newMiddleName) {
		eSet(PartyPackage.Literals.PARTY_NAME_HISTORY__MIDDLE_NAME, newMiddleName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPersonalTitle() {
		return (String)eGet(PartyPackage.Literals.PARTY_NAME_HISTORY__PERSONAL_TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersonalTitle(String newPersonalTitle) {
		eSet(PartyPackage.Literals.PARTY_NAME_HISTORY__PERSONAL_TITLE, newPersonalTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuffix() {
		return (String)eGet(PartyPackage.Literals.PARTY_NAME_HISTORY__SUFFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuffix(String newSuffix) {
		eSet(PartyPackage.Literals.PARTY_NAME_HISTORY__SUFFIX, newSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		return (Party)eGet(PartyPackage.Literals.PARTY_NAME_HISTORY__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		eSet(PartyPackage.Literals.PARTY_NAME_HISTORY__PARTY_ID, newPartyId);
	}

} //PartyNameHistoryImpl
