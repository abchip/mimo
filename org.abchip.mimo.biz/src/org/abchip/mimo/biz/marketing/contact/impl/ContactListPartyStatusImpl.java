/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.contact.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus;
import org.abchip.mimo.biz.marketing.contact.ContactPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact List Party Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListPartyStatusImpl#getContactListId <em>Contact List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListPartyStatusImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListPartyStatusImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListPartyStatusImpl#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListPartyStatusImpl#getOptInVerifyCode <em>Opt In Verify Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListPartyStatusImpl#getSetByUserLoginId <em>Set By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListPartyStatusImpl#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactListPartyStatusImpl extends BizEntityImpl implements ContactListPartyStatus {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getContactListId() <em>Contact List Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactListId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_LIST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactListId() <em>Contact List Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactListId()
	 * @generated
	 * @ordered
	 */
	protected String contactListId = CONTACT_LIST_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected String partyId = PARTY_ID_EDEFAULT;

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
	 * The default value of the '{@link #getStatusDate() <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date STATUS_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusDate() <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected Date statusDate = STATUS_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptInVerifyCode() <em>Opt In Verify Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptInVerifyCode()
	 * @generated
	 * @ordered
	 */
	protected static final String OPT_IN_VERIFY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptInVerifyCode() <em>Opt In Verify Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptInVerifyCode()
	 * @generated
	 * @ordered
	 */
	protected String optInVerifyCode = OPT_IN_VERIFY_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetByUserLoginId() <em>Set By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected static final String SET_BY_USER_LOGIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSetByUserLoginId() <em>Set By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected String setByUserLoginId = SET_BY_USER_LOGIN_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactListPartyStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContactPackage.Literals.CONTACT_LIST_PARTY_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactListId() {
		return contactListId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactListId(String newContactListId) {
		String oldContactListId = contactListId;
		contactListId = newContactListId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST_PARTY_STATUS__CONTACT_LIST_ID, oldContactListId, contactListId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST_PARTY_STATUS__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOptInVerifyCode() {
		return optInVerifyCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptInVerifyCode(String newOptInVerifyCode) {
		String oldOptInVerifyCode = optInVerifyCode;
		optInVerifyCode = newOptInVerifyCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST_PARTY_STATUS__OPT_IN_VERIFY_CODE, oldOptInVerifyCode, optInVerifyCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		String oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST_PARTY_STATUS__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSetByUserLoginId() {
		return setByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetByUserLoginId(String newSetByUserLoginId) {
		String oldSetByUserLoginId = setByUserLoginId;
		setByUserLoginId = newSetByUserLoginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST_PARTY_STATUS__SET_BY_USER_LOGIN_ID, oldSetByUserLoginId, setByUserLoginId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStatusDate() {
		return statusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusDate(Date newStatusDate) {
		Date oldStatusDate = statusDate;
		statusDate = newStatusDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST_PARTY_STATUS__STATUS_DATE, oldStatusDate, statusDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST_PARTY_STATUS__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__CONTACT_LIST_ID:
				return getContactListId();
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__PARTY_ID:
				return getPartyId();
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__FROM_DATE:
				return getFromDate();
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__STATUS_DATE:
				return getStatusDate();
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__OPT_IN_VERIFY_CODE:
				return getOptInVerifyCode();
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__SET_BY_USER_LOGIN_ID:
				return getSetByUserLoginId();
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__STATUS_ID:
				return getStatusId();
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
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__CONTACT_LIST_ID:
				setContactListId((String)newValue);
				return;
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__STATUS_DATE:
				setStatusDate((Date)newValue);
				return;
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__OPT_IN_VERIFY_CODE:
				setOptInVerifyCode((String)newValue);
				return;
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__SET_BY_USER_LOGIN_ID:
				setSetByUserLoginId((String)newValue);
				return;
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__STATUS_ID:
				setStatusId((String)newValue);
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
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__CONTACT_LIST_ID:
				setContactListId(CONTACT_LIST_ID_EDEFAULT);
				return;
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__STATUS_DATE:
				setStatusDate(STATUS_DATE_EDEFAULT);
				return;
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__OPT_IN_VERIFY_CODE:
				setOptInVerifyCode(OPT_IN_VERIFY_CODE_EDEFAULT);
				return;
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__SET_BY_USER_LOGIN_ID:
				setSetByUserLoginId(SET_BY_USER_LOGIN_ID_EDEFAULT);
				return;
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
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
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__CONTACT_LIST_ID:
				return CONTACT_LIST_ID_EDEFAULT == null ? contactListId != null : !CONTACT_LIST_ID_EDEFAULT.equals(contactListId);
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__STATUS_DATE:
				return STATUS_DATE_EDEFAULT == null ? statusDate != null : !STATUS_DATE_EDEFAULT.equals(statusDate);
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__OPT_IN_VERIFY_CODE:
				return OPT_IN_VERIFY_CODE_EDEFAULT == null ? optInVerifyCode != null : !OPT_IN_VERIFY_CODE_EDEFAULT.equals(optInVerifyCode);
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__SET_BY_USER_LOGIN_ID:
				return SET_BY_USER_LOGIN_ID_EDEFAULT == null ? setByUserLoginId != null : !SET_BY_USER_LOGIN_ID_EDEFAULT.equals(setByUserLoginId);
			case ContactPackage.CONTACT_LIST_PARTY_STATUS__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
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
		result.append(" (contactListId: ");
		result.append(contactListId);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", statusDate: ");
		result.append(statusDate);
		result.append(", optInVerifyCode: ");
		result.append(optInVerifyCode);
		result.append(", setByUserLoginId: ");
		result.append(setByUserLoginId);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(')');
		return result.toString();
	}

} //ContactListPartyStatusImpl
