/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.contact.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.marketing.contact.ContactListCommStatus;
import org.abchip.mimo.biz.marketing.contact.ContactPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact List Comm Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListCommStatusImpl#getContactListId <em>Contact List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListCommStatusImpl#getCommunicationEventId <em>Communication Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListCommStatusImpl#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListCommStatusImpl#getChangeByUserLoginId <em>Change By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListCommStatusImpl#getMessageId <em>Message Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListCommStatusImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListCommStatusImpl#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactListCommStatusImpl extends BizEntityImpl implements ContactListCommStatus {
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
	 * The default value of the '{@link #getCommunicationEventId() <em>Communication Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationEventId()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMUNICATION_EVENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommunicationEventId() <em>Communication Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationEventId()
	 * @generated
	 * @ordered
	 */
	protected String communicationEventId = COMMUNICATION_EVENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_MECH_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected String contactMechId = CONTACT_MECH_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeByUserLoginId() <em>Change By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGE_BY_USER_LOGIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeByUserLoginId() <em>Change By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected String changeByUserLoginId = CHANGE_BY_USER_LOGIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageId() <em>Message Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageId()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageId() <em>Message Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageId()
	 * @generated
	 * @ordered
	 */
	protected String messageId = MESSAGE_ID_EDEFAULT;

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
	protected ContactListCommStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContactPackage.Literals.CONTACT_LIST_COMM_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangeByUserLoginId() {
		return changeByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeByUserLoginId(String newChangeByUserLoginId) {
		String oldChangeByUserLoginId = changeByUserLoginId;
		changeByUserLoginId = newChangeByUserLoginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST_COMM_STATUS__CHANGE_BY_USER_LOGIN_ID, oldChangeByUserLoginId, changeByUserLoginId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommunicationEventId() {
		return communicationEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationEventId(String newCommunicationEventId) {
		String oldCommunicationEventId = communicationEventId;
		communicationEventId = newCommunicationEventId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST_COMM_STATUS__COMMUNICATION_EVENT_ID, oldCommunicationEventId, communicationEventId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST_COMM_STATUS__CONTACT_LIST_ID, oldContactListId, contactListId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactMechId() {
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(String newContactMechId) {
		String oldContactMechId = contactMechId;
		contactMechId = newContactMechId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST_COMM_STATUS__CONTACT_MECH_ID, oldContactMechId, contactMechId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessageId() {
		return messageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageId(String newMessageId) {
		String oldMessageId = messageId;
		messageId = newMessageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST_COMM_STATUS__MESSAGE_ID, oldMessageId, messageId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST_COMM_STATUS__PARTY_ID, oldPartyId, partyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST_COMM_STATUS__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContactPackage.CONTACT_LIST_COMM_STATUS__CONTACT_LIST_ID:
				return getContactListId();
			case ContactPackage.CONTACT_LIST_COMM_STATUS__COMMUNICATION_EVENT_ID:
				return getCommunicationEventId();
			case ContactPackage.CONTACT_LIST_COMM_STATUS__CONTACT_MECH_ID:
				return getContactMechId();
			case ContactPackage.CONTACT_LIST_COMM_STATUS__CHANGE_BY_USER_LOGIN_ID:
				return getChangeByUserLoginId();
			case ContactPackage.CONTACT_LIST_COMM_STATUS__MESSAGE_ID:
				return getMessageId();
			case ContactPackage.CONTACT_LIST_COMM_STATUS__PARTY_ID:
				return getPartyId();
			case ContactPackage.CONTACT_LIST_COMM_STATUS__STATUS_ID:
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
			case ContactPackage.CONTACT_LIST_COMM_STATUS__CONTACT_LIST_ID:
				setContactListId((String)newValue);
				return;
			case ContactPackage.CONTACT_LIST_COMM_STATUS__COMMUNICATION_EVENT_ID:
				setCommunicationEventId((String)newValue);
				return;
			case ContactPackage.CONTACT_LIST_COMM_STATUS__CONTACT_MECH_ID:
				setContactMechId((String)newValue);
				return;
			case ContactPackage.CONTACT_LIST_COMM_STATUS__CHANGE_BY_USER_LOGIN_ID:
				setChangeByUserLoginId((String)newValue);
				return;
			case ContactPackage.CONTACT_LIST_COMM_STATUS__MESSAGE_ID:
				setMessageId((String)newValue);
				return;
			case ContactPackage.CONTACT_LIST_COMM_STATUS__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case ContactPackage.CONTACT_LIST_COMM_STATUS__STATUS_ID:
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
			case ContactPackage.CONTACT_LIST_COMM_STATUS__CONTACT_LIST_ID:
				setContactListId(CONTACT_LIST_ID_EDEFAULT);
				return;
			case ContactPackage.CONTACT_LIST_COMM_STATUS__COMMUNICATION_EVENT_ID:
				setCommunicationEventId(COMMUNICATION_EVENT_ID_EDEFAULT);
				return;
			case ContactPackage.CONTACT_LIST_COMM_STATUS__CONTACT_MECH_ID:
				setContactMechId(CONTACT_MECH_ID_EDEFAULT);
				return;
			case ContactPackage.CONTACT_LIST_COMM_STATUS__CHANGE_BY_USER_LOGIN_ID:
				setChangeByUserLoginId(CHANGE_BY_USER_LOGIN_ID_EDEFAULT);
				return;
			case ContactPackage.CONTACT_LIST_COMM_STATUS__MESSAGE_ID:
				setMessageId(MESSAGE_ID_EDEFAULT);
				return;
			case ContactPackage.CONTACT_LIST_COMM_STATUS__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case ContactPackage.CONTACT_LIST_COMM_STATUS__STATUS_ID:
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
			case ContactPackage.CONTACT_LIST_COMM_STATUS__CONTACT_LIST_ID:
				return CONTACT_LIST_ID_EDEFAULT == null ? contactListId != null : !CONTACT_LIST_ID_EDEFAULT.equals(contactListId);
			case ContactPackage.CONTACT_LIST_COMM_STATUS__COMMUNICATION_EVENT_ID:
				return COMMUNICATION_EVENT_ID_EDEFAULT == null ? communicationEventId != null : !COMMUNICATION_EVENT_ID_EDEFAULT.equals(communicationEventId);
			case ContactPackage.CONTACT_LIST_COMM_STATUS__CONTACT_MECH_ID:
				return CONTACT_MECH_ID_EDEFAULT == null ? contactMechId != null : !CONTACT_MECH_ID_EDEFAULT.equals(contactMechId);
			case ContactPackage.CONTACT_LIST_COMM_STATUS__CHANGE_BY_USER_LOGIN_ID:
				return CHANGE_BY_USER_LOGIN_ID_EDEFAULT == null ? changeByUserLoginId != null : !CHANGE_BY_USER_LOGIN_ID_EDEFAULT.equals(changeByUserLoginId);
			case ContactPackage.CONTACT_LIST_COMM_STATUS__MESSAGE_ID:
				return MESSAGE_ID_EDEFAULT == null ? messageId != null : !MESSAGE_ID_EDEFAULT.equals(messageId);
			case ContactPackage.CONTACT_LIST_COMM_STATUS__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case ContactPackage.CONTACT_LIST_COMM_STATUS__STATUS_ID:
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
		result.append(", communicationEventId: ");
		result.append(communicationEventId);
		result.append(", contactMechId: ");
		result.append(contactMechId);
		result.append(", changeByUserLoginId: ");
		result.append(changeByUserLoginId);
		result.append(", messageId: ");
		result.append(messageId);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(')');
		return result.toString();
	}

} //ContactListCommStatusImpl
