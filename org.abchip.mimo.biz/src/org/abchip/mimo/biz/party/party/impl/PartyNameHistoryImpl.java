/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Name History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyNameHistoryImpl#getChangeDate <em>Change Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyNameHistoryImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyNameHistoryImpl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyNameHistoryImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyNameHistoryImpl#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyNameHistoryImpl#getPersonalTitle <em>Personal Title</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyNameHistoryImpl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyNameHistoryImpl#getPartyId <em>Party Id</em>}</li>
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
	 * The default value of the '{@link #getChangeDate() <em>Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CHANGE_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getChangeDate() <em>Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeDate()
	 * @generated
	 * @ordered
	 */
	protected Date changeDate = CHANGE_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected String groupName = GROUP_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getMiddleName() <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleName()
	 * @generated
	 * @ordered
	 */
	protected static final String MIDDLE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMiddleName() <em>Middle Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleName()
	 * @generated
	 * @ordered
	 */
	protected String middleName = MIDDLE_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getPersonalTitle() <em>Personal Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSONAL_TITLE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPersonalTitle() <em>Personal Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalTitle()
	 * @generated
	 * @ordered
	 */
	protected String personalTitle = PERSONAL_TITLE_EDEFAULT;
	/**
	 * The default value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String SUFFIX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected String suffix = SUFFIX_EDEFAULT;
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
		return changeDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeDate(Date newChangeDate) {
		changeDate = newChangeDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupName() {
		return groupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupName(String newGroupName) {
		groupName = newGroupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMiddleName(String newMiddleName) {
		middleName = newMiddleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPersonalTitle() {
		return personalTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersonalTitle(String newPersonalTitle) {
		personalTitle = newPersonalTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuffix() {
		return suffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuffix(String newSuffix) {
		suffix = newSuffix;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartyPackage.PARTY_NAME_HISTORY__CHANGE_DATE:
				return getChangeDate();
			case PartyPackage.PARTY_NAME_HISTORY__FIRST_NAME:
				return getFirstName();
			case PartyPackage.PARTY_NAME_HISTORY__GROUP_NAME:
				return getGroupName();
			case PartyPackage.PARTY_NAME_HISTORY__LAST_NAME:
				return getLastName();
			case PartyPackage.PARTY_NAME_HISTORY__MIDDLE_NAME:
				return getMiddleName();
			case PartyPackage.PARTY_NAME_HISTORY__PERSONAL_TITLE:
				return getPersonalTitle();
			case PartyPackage.PARTY_NAME_HISTORY__SUFFIX:
				return getSuffix();
			case PartyPackage.PARTY_NAME_HISTORY__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
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
			case PartyPackage.PARTY_NAME_HISTORY__CHANGE_DATE:
				setChangeDate((Date)newValue);
				return;
			case PartyPackage.PARTY_NAME_HISTORY__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case PartyPackage.PARTY_NAME_HISTORY__GROUP_NAME:
				setGroupName((String)newValue);
				return;
			case PartyPackage.PARTY_NAME_HISTORY__LAST_NAME:
				setLastName((String)newValue);
				return;
			case PartyPackage.PARTY_NAME_HISTORY__MIDDLE_NAME:
				setMiddleName((String)newValue);
				return;
			case PartyPackage.PARTY_NAME_HISTORY__PERSONAL_TITLE:
				setPersonalTitle((String)newValue);
				return;
			case PartyPackage.PARTY_NAME_HISTORY__SUFFIX:
				setSuffix((String)newValue);
				return;
			case PartyPackage.PARTY_NAME_HISTORY__PARTY_ID:
				setPartyId((Party)newValue);
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
			case PartyPackage.PARTY_NAME_HISTORY__CHANGE_DATE:
				setChangeDate(CHANGE_DATE_EDEFAULT);
				return;
			case PartyPackage.PARTY_NAME_HISTORY__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case PartyPackage.PARTY_NAME_HISTORY__GROUP_NAME:
				setGroupName(GROUP_NAME_EDEFAULT);
				return;
			case PartyPackage.PARTY_NAME_HISTORY__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case PartyPackage.PARTY_NAME_HISTORY__MIDDLE_NAME:
				setMiddleName(MIDDLE_NAME_EDEFAULT);
				return;
			case PartyPackage.PARTY_NAME_HISTORY__PERSONAL_TITLE:
				setPersonalTitle(PERSONAL_TITLE_EDEFAULT);
				return;
			case PartyPackage.PARTY_NAME_HISTORY__SUFFIX:
				setSuffix(SUFFIX_EDEFAULT);
				return;
			case PartyPackage.PARTY_NAME_HISTORY__PARTY_ID:
				setPartyId((Party)null);
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
			case PartyPackage.PARTY_NAME_HISTORY__CHANGE_DATE:
				return CHANGE_DATE_EDEFAULT == null ? changeDate != null : !CHANGE_DATE_EDEFAULT.equals(changeDate);
			case PartyPackage.PARTY_NAME_HISTORY__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case PartyPackage.PARTY_NAME_HISTORY__GROUP_NAME:
				return GROUP_NAME_EDEFAULT == null ? groupName != null : !GROUP_NAME_EDEFAULT.equals(groupName);
			case PartyPackage.PARTY_NAME_HISTORY__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case PartyPackage.PARTY_NAME_HISTORY__MIDDLE_NAME:
				return MIDDLE_NAME_EDEFAULT == null ? middleName != null : !MIDDLE_NAME_EDEFAULT.equals(middleName);
			case PartyPackage.PARTY_NAME_HISTORY__PERSONAL_TITLE:
				return PERSONAL_TITLE_EDEFAULT == null ? personalTitle != null : !PERSONAL_TITLE_EDEFAULT.equals(personalTitle);
			case PartyPackage.PARTY_NAME_HISTORY__SUFFIX:
				return SUFFIX_EDEFAULT == null ? suffix != null : !SUFFIX_EDEFAULT.equals(suffix);
			case PartyPackage.PARTY_NAME_HISTORY__PARTY_ID:
				return partyId != null;
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
		result.append(" (changeDate: ");
		result.append(changeDate);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", groupName: ");
		result.append(groupName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", middleName: ");
		result.append(middleName);
		result.append(", personalTitle: ");
		result.append(personalTitle);
		result.append(", suffix: ");
		result.append(suffix);
		result.append(')');
		return result.toString();
	}

} //PartyNameHistoryImpl
