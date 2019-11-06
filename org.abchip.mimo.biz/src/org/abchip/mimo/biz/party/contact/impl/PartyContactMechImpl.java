/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.contact.ContactPackage;
import org.abchip.mimo.biz.party.contact.PartyContactMech;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.RoleType;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Contact Mech</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PartyContactMechImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PartyContactMechImpl#isAllowSolicitation <em>Allow Solicitation</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PartyContactMechImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PartyContactMechImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PartyContactMechImpl#getMonthsWithContactMech <em>Months With Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PartyContactMechImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PartyContactMechImpl#isVerified <em>Verified</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PartyContactMechImpl#getYearsWithContactMech <em>Years With Contact Mech</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PartyContactMechImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PartyContactMechImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PartyContactMechImpl#getContactMechId <em>Contact Mech Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyContactMechImpl extends BizEntityImpl implements PartyContactMech {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	 * The default value of the '{@link #isAllowSolicitation() <em>Allow Solicitation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowSolicitation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_SOLICITATION_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isAllowSolicitation() <em>Allow Solicitation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowSolicitation()
	 * @generated
	 * @ordered
	 */
	protected boolean allowSolicitation = ALLOW_SOLICITATION_EDEFAULT;
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
	 * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected String extension = EXTENSION_EDEFAULT;
	/**
	 * The default value of the '{@link #getMonthsWithContactMech() <em>Months With Contact Mech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthsWithContactMech()
	 * @generated
	 * @ordered
	 */
	protected static final long MONTHS_WITH_CONTACT_MECH_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getMonthsWithContactMech() <em>Months With Contact Mech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthsWithContactMech()
	 * @generated
	 * @ordered
	 */
	protected long monthsWithContactMech = MONTHS_WITH_CONTACT_MECH_EDEFAULT;
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
	 * The default value of the '{@link #isVerified() <em>Verified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerified()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERIFIED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isVerified() <em>Verified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerified()
	 * @generated
	 * @ordered
	 */
	protected boolean verified = VERIFIED_EDEFAULT;
	/**
	 * The default value of the '{@link #getYearsWithContactMech() <em>Years With Contact Mech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearsWithContactMech()
	 * @generated
	 * @ordered
	 */
	protected static final long YEARS_WITH_CONTACT_MECH_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getYearsWithContactMech() <em>Years With Contact Mech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearsWithContactMech()
	 * @generated
	 * @ordered
	 */
	protected long yearsWithContactMech = YEARS_WITH_CONTACT_MECH_EDEFAULT;
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
	 * The cached value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleTypeId;
	/**
	 * The cached value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected ContactMech contactMechId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyContactMechImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContactPackage.Literals.PARTY_CONTACT_MECH;
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
		comments = newComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExtension() {
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtension(String newExtension) {
		extension = newExtension;
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
		fromDate = newFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowSolicitation() {
		return allowSolicitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowSolicitation(boolean newAllowSolicitation) {
		allowSolicitation = newAllowSolicitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMonthsWithContactMech() {
		return monthsWithContactMech;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonthsWithContactMech(long newMonthsWithContactMech) {
		monthsWithContactMech = newMonthsWithContactMech;
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
	public RoleType getRoleTypeId() {
		if (roleTypeId != null && ((EObject)roleTypeId).eIsProxy()) {
			InternalEObject oldRoleTypeId = (InternalEObject)roleTypeId;
			roleTypeId = (RoleType)eResolveProxy(oldRoleTypeId);
			if (roleTypeId != oldRoleTypeId) {
			}
		}
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetRoleTypeId() {
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(RoleType newRoleTypeId) {
		roleTypeId = newRoleTypeId;
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
		thruDate = newThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVerified() {
		return verified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerified(boolean newVerified) {
		verified = newVerified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getYearsWithContactMech() {
		return yearsWithContactMech;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYearsWithContactMech(long newYearsWithContactMech) {
		yearsWithContactMech = newYearsWithContactMech;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getContactMechId() {
		if (contactMechId != null && ((EObject)contactMechId).eIsProxy()) {
			InternalEObject oldContactMechId = (InternalEObject)contactMechId;
			contactMechId = (ContactMech)eResolveProxy(oldContactMechId);
			if (contactMechId != oldContactMechId) {
			}
		}
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMech basicGetContactMechId() {
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(ContactMech newContactMechId) {
		contactMechId = newContactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContactPackage.PARTY_CONTACT_MECH__FROM_DATE:
				return getFromDate();
			case ContactPackage.PARTY_CONTACT_MECH__ALLOW_SOLICITATION:
				return isAllowSolicitation();
			case ContactPackage.PARTY_CONTACT_MECH__COMMENTS:
				return getComments();
			case ContactPackage.PARTY_CONTACT_MECH__EXTENSION:
				return getExtension();
			case ContactPackage.PARTY_CONTACT_MECH__MONTHS_WITH_CONTACT_MECH:
				return getMonthsWithContactMech();
			case ContactPackage.PARTY_CONTACT_MECH__THRU_DATE:
				return getThruDate();
			case ContactPackage.PARTY_CONTACT_MECH__VERIFIED:
				return isVerified();
			case ContactPackage.PARTY_CONTACT_MECH__YEARS_WITH_CONTACT_MECH:
				return getYearsWithContactMech();
			case ContactPackage.PARTY_CONTACT_MECH__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case ContactPackage.PARTY_CONTACT_MECH__ROLE_TYPE_ID:
				if (resolve) return getRoleTypeId();
				return basicGetRoleTypeId();
			case ContactPackage.PARTY_CONTACT_MECH__CONTACT_MECH_ID:
				if (resolve) return getContactMechId();
				return basicGetContactMechId();
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
			case ContactPackage.PARTY_CONTACT_MECH__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case ContactPackage.PARTY_CONTACT_MECH__ALLOW_SOLICITATION:
				setAllowSolicitation((Boolean)newValue);
				return;
			case ContactPackage.PARTY_CONTACT_MECH__COMMENTS:
				setComments((String)newValue);
				return;
			case ContactPackage.PARTY_CONTACT_MECH__EXTENSION:
				setExtension((String)newValue);
				return;
			case ContactPackage.PARTY_CONTACT_MECH__MONTHS_WITH_CONTACT_MECH:
				setMonthsWithContactMech((Long)newValue);
				return;
			case ContactPackage.PARTY_CONTACT_MECH__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case ContactPackage.PARTY_CONTACT_MECH__VERIFIED:
				setVerified((Boolean)newValue);
				return;
			case ContactPackage.PARTY_CONTACT_MECH__YEARS_WITH_CONTACT_MECH:
				setYearsWithContactMech((Long)newValue);
				return;
			case ContactPackage.PARTY_CONTACT_MECH__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case ContactPackage.PARTY_CONTACT_MECH__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)newValue);
				return;
			case ContactPackage.PARTY_CONTACT_MECH__CONTACT_MECH_ID:
				setContactMechId((ContactMech)newValue);
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
			case ContactPackage.PARTY_CONTACT_MECH__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case ContactPackage.PARTY_CONTACT_MECH__ALLOW_SOLICITATION:
				setAllowSolicitation(ALLOW_SOLICITATION_EDEFAULT);
				return;
			case ContactPackage.PARTY_CONTACT_MECH__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case ContactPackage.PARTY_CONTACT_MECH__EXTENSION:
				setExtension(EXTENSION_EDEFAULT);
				return;
			case ContactPackage.PARTY_CONTACT_MECH__MONTHS_WITH_CONTACT_MECH:
				setMonthsWithContactMech(MONTHS_WITH_CONTACT_MECH_EDEFAULT);
				return;
			case ContactPackage.PARTY_CONTACT_MECH__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case ContactPackage.PARTY_CONTACT_MECH__VERIFIED:
				setVerified(VERIFIED_EDEFAULT);
				return;
			case ContactPackage.PARTY_CONTACT_MECH__YEARS_WITH_CONTACT_MECH:
				setYearsWithContactMech(YEARS_WITH_CONTACT_MECH_EDEFAULT);
				return;
			case ContactPackage.PARTY_CONTACT_MECH__PARTY_ID:
				setPartyId((Party)null);
				return;
			case ContactPackage.PARTY_CONTACT_MECH__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)null);
				return;
			case ContactPackage.PARTY_CONTACT_MECH__CONTACT_MECH_ID:
				setContactMechId((ContactMech)null);
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
			case ContactPackage.PARTY_CONTACT_MECH__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case ContactPackage.PARTY_CONTACT_MECH__ALLOW_SOLICITATION:
				return allowSolicitation != ALLOW_SOLICITATION_EDEFAULT;
			case ContactPackage.PARTY_CONTACT_MECH__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case ContactPackage.PARTY_CONTACT_MECH__EXTENSION:
				return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
			case ContactPackage.PARTY_CONTACT_MECH__MONTHS_WITH_CONTACT_MECH:
				return monthsWithContactMech != MONTHS_WITH_CONTACT_MECH_EDEFAULT;
			case ContactPackage.PARTY_CONTACT_MECH__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case ContactPackage.PARTY_CONTACT_MECH__VERIFIED:
				return verified != VERIFIED_EDEFAULT;
			case ContactPackage.PARTY_CONTACT_MECH__YEARS_WITH_CONTACT_MECH:
				return yearsWithContactMech != YEARS_WITH_CONTACT_MECH_EDEFAULT;
			case ContactPackage.PARTY_CONTACT_MECH__PARTY_ID:
				return partyId != null;
			case ContactPackage.PARTY_CONTACT_MECH__ROLE_TYPE_ID:
				return roleTypeId != null;
			case ContactPackage.PARTY_CONTACT_MECH__CONTACT_MECH_ID:
				return contactMechId != null;
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
		result.append(" (fromDate: ");
		result.append(fromDate);
		result.append(", allowSolicitation: ");
		result.append(allowSolicitation);
		result.append(", comments: ");
		result.append(comments);
		result.append(", extension: ");
		result.append(extension);
		result.append(", monthsWithContactMech: ");
		result.append(monthsWithContactMech);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(", verified: ");
		result.append(verified);
		result.append(", yearsWithContactMech: ");
		result.append(yearsWithContactMech);
		result.append(')');
		return result.toString();
	}

} //PartyContactMechImpl
