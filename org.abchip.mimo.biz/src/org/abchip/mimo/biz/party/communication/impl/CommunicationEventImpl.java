/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.communication.impl;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.communication.CommunicationEvent;
import org.abchip.mimo.biz.party.communication.CommunicationEventType;
import org.abchip.mimo.biz.party.communication.CommunicationPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getCommunicationEventId <em>Communication Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getBccString <em>Bcc String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getCcString <em>Cc String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getCommunicationEventTypeId <em>Communication Event Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getContactListId <em>Contact List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getContactMechIdFrom <em>Contact Mech Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getContactMechIdTo <em>Contact Mech Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getContactMechTypeId <em>Contact Mech Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getContentMimeTypeId <em>Content Mime Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getDatetimeEnded <em>Datetime Ended</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getDatetimeStarted <em>Datetime Started</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getEntryDate <em>Entry Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getFromString <em>From String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getHeaderString <em>Header String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getMessageId <em>Message Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getOrigCommEventId <em>Orig Comm Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getParentCommEventId <em>Parent Comm Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getReasonEnumId <em>Reason Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getRoleTypeIdFrom <em>Role Type Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getRoleTypeIdTo <em>Role Type Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getToString <em>To String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationEventImpl extends BizEntityTypedImpl<CommunicationEventType> implements CommunicationEvent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	 * The default value of the '{@link #getBccString() <em>Bcc String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBccString()
	 * @generated
	 * @ordered
	 */
	protected static final String BCC_STRING_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBccString() <em>Bcc String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBccString()
	 * @generated
	 * @ordered
	 */
	protected String bccString = BCC_STRING_EDEFAULT;
	/**
	 * The default value of the '{@link #getCcString() <em>Cc String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcString()
	 * @generated
	 * @ordered
	 */
	protected static final String CC_STRING_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCcString() <em>Cc String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcString()
	 * @generated
	 * @ordered
	 */
	protected String ccString = CC_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommunicationEventTypeId() <em>Communication Event Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationEventTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMUNICATION_EVENT_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCommunicationEventTypeId() <em>Communication Event Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationEventTypeId()
	 * @generated
	 * @ordered
	 */
	protected String communicationEventTypeId = COMMUNICATION_EVENT_TYPE_ID_EDEFAULT;
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
	 * The default value of the '{@link #getContactMechIdFrom() <em>Contact Mech Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechIdFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_MECH_ID_FROM_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getContactMechIdFrom() <em>Contact Mech Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechIdFrom()
	 * @generated
	 * @ordered
	 */
	protected String contactMechIdFrom = CONTACT_MECH_ID_FROM_EDEFAULT;
	/**
	 * The default value of the '{@link #getContactMechIdTo() <em>Contact Mech Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_MECH_ID_TO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getContactMechIdTo() <em>Contact Mech Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechIdTo()
	 * @generated
	 * @ordered
	 */
	protected String contactMechIdTo = CONTACT_MECH_ID_TO_EDEFAULT;
	/**
	 * The default value of the '{@link #getContactMechTypeId() <em>Contact Mech Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_MECH_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getContactMechTypeId() <em>Contact Mech Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechTypeId()
	 * @generated
	 * @ordered
	 */
	protected String contactMechTypeId = CONTACT_MECH_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;
	/**
	 * The default value of the '{@link #getContentMimeTypeId() <em>Content Mime Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentMimeTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_MIME_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getContentMimeTypeId() <em>Content Mime Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentMimeTypeId()
	 * @generated
	 * @ordered
	 */
	protected String contentMimeTypeId = CONTENT_MIME_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getDatetimeEnded() <em>Datetime Ended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetimeEnded()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATETIME_ENDED_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDatetimeEnded() <em>Datetime Ended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetimeEnded()
	 * @generated
	 * @ordered
	 */
	protected Date datetimeEnded = DATETIME_ENDED_EDEFAULT;
	/**
	 * The default value of the '{@link #getDatetimeStarted() <em>Datetime Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetimeStarted()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATETIME_STARTED_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDatetimeStarted() <em>Datetime Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetimeStarted()
	 * @generated
	 * @ordered
	 */
	protected Date datetimeStarted = DATETIME_STARTED_EDEFAULT;
	/**
	 * The default value of the '{@link #getEntryDate() <em>Entry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ENTRY_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEntryDate() <em>Entry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryDate()
	 * @generated
	 * @ordered
	 */
	protected Date entryDate = ENTRY_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getFromString() <em>From String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromString()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_STRING_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFromString() <em>From String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromString()
	 * @generated
	 * @ordered
	 */
	protected String fromString = FROM_STRING_EDEFAULT;
	/**
	 * The default value of the '{@link #getHeaderString() <em>Header String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderString()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADER_STRING_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getHeaderString() <em>Header String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderString()
	 * @generated
	 * @ordered
	 */
	protected String headerString = HEADER_STRING_EDEFAULT;
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
	 * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected String note = NOTE_EDEFAULT;
	/**
	 * The default value of the '{@link #getOrigCommEventId() <em>Orig Comm Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigCommEventId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIG_COMM_EVENT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOrigCommEventId() <em>Orig Comm Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigCommEventId()
	 * @generated
	 * @ordered
	 */
	protected String origCommEventId = ORIG_COMM_EVENT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getParentCommEventId() <em>Parent Comm Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentCommEventId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_COMM_EVENT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getParentCommEventId() <em>Parent Comm Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentCommEventId()
	 * @generated
	 * @ordered
	 */
	protected String parentCommEventId = PARENT_COMM_EVENT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getPartyIdFrom() <em>Party Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_FROM_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPartyIdFrom() <em>Party Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdFrom()
	 * @generated
	 * @ordered
	 */
	protected String partyIdFrom = PARTY_ID_FROM_EDEFAULT;
	/**
	 * The default value of the '{@link #getPartyIdTo() <em>Party Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_TO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPartyIdTo() <em>Party Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdTo()
	 * @generated
	 * @ordered
	 */
	protected String partyIdTo = PARTY_ID_TO_EDEFAULT;
	/**
	 * The default value of the '{@link #getReasonEnumId() <em>Reason Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_ENUM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getReasonEnumId() <em>Reason Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonEnumId()
	 * @generated
	 * @ordered
	 */
	protected String reasonEnumId = REASON_ENUM_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getRoleTypeIdFrom() <em>Role Type Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TYPE_ID_FROM_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRoleTypeIdFrom() <em>Role Type Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdFrom()
	 * @generated
	 * @ordered
	 */
	protected String roleTypeIdFrom = ROLE_TYPE_ID_FROM_EDEFAULT;
	/**
	 * The default value of the '{@link #getRoleTypeIdTo() <em>Role Type Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TYPE_ID_TO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRoleTypeIdTo() <em>Role Type Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdTo()
	 * @generated
	 * @ordered
	 */
	protected String roleTypeIdTo = ROLE_TYPE_ID_TO_EDEFAULT;
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
	 * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected String subject = SUBJECT_EDEFAULT;
	/**
	 * The default value of the '{@link #getToString() <em>To String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToString()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_STRING_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getToString() <em>To String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToString()
	 * @generated
	 * @ordered
	 */
	protected String toString = TO_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.COMMUNICATION_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBccString() {
		return bccString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBccString(String newBccString) {
		String oldBccString = bccString;
		bccString = newBccString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__BCC_STRING, oldBccString, bccString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCcString() {
		return ccString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCcString(String newCcString) {
		String oldCcString = ccString;
		ccString = newCcString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__CC_STRING, oldCcString, ccString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__CONTACT_LIST_ID, oldContactListId, contactListId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactMechIdFrom() {
		return contactMechIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechIdFrom(String newContactMechIdFrom) {
		String oldContactMechIdFrom = contactMechIdFrom;
		contactMechIdFrom = newContactMechIdFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_ID_FROM, oldContactMechIdFrom, contactMechIdFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactMechIdTo() {
		return contactMechIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechIdTo(String newContactMechIdTo) {
		String oldContactMechIdTo = contactMechIdTo;
		contactMechIdTo = newContactMechIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_ID_TO, oldContactMechIdTo, contactMechIdTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactMechTypeId() {
		return contactMechTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechTypeId(String newContactMechTypeId) {
		String oldContactMechTypeId = contactMechTypeId;
		contactMechTypeId = newContactMechTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_TYPE_ID, oldContactMechTypeId, contactMechTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentMimeTypeId() {
		return contentMimeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentMimeTypeId(String newContentMimeTypeId) {
		String oldContentMimeTypeId = contentMimeTypeId;
		contentMimeTypeId = newContentMimeTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__CONTENT_MIME_TYPE_ID, oldContentMimeTypeId, contentMimeTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDatetimeEnded() {
		return datetimeEnded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatetimeEnded(Date newDatetimeEnded) {
		Date oldDatetimeEnded = datetimeEnded;
		datetimeEnded = newDatetimeEnded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__DATETIME_ENDED, oldDatetimeEnded, datetimeEnded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDatetimeStarted() {
		return datetimeStarted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatetimeStarted(Date newDatetimeStarted) {
		Date oldDatetimeStarted = datetimeStarted;
		datetimeStarted = newDatetimeStarted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__DATETIME_STARTED, oldDatetimeStarted, datetimeStarted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEntryDate() {
		return entryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntryDate(Date newEntryDate) {
		Date oldEntryDate = entryDate;
		entryDate = newEntryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__ENTRY_DATE, oldEntryDate, entryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFromString() {
		return fromString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromString(String newFromString) {
		String oldFromString = fromString;
		fromString = newFromString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__FROM_STRING, oldFromString, fromString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeaderString() {
		return headerString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeaderString(String newHeaderString) {
		String oldHeaderString = headerString;
		headerString = newHeaderString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__HEADER_STRING, oldHeaderString, headerString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__MESSAGE_ID, oldMessageId, messageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNote(String newNote) {
		String oldNote = note;
		note = newNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrigCommEventId() {
		return origCommEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigCommEventId(String newOrigCommEventId) {
		String oldOrigCommEventId = origCommEventId;
		origCommEventId = newOrigCommEventId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__ORIG_COMM_EVENT_ID, oldOrigCommEventId, origCommEventId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentCommEventId() {
		return parentCommEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentCommEventId(String newParentCommEventId) {
		String oldParentCommEventId = parentCommEventId;
		parentCommEventId = newParentCommEventId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__PARENT_COMM_EVENT_ID, oldParentCommEventId, parentCommEventId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyIdFrom() {
		return partyIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdFrom(String newPartyIdFrom) {
		String oldPartyIdFrom = partyIdFrom;
		partyIdFrom = newPartyIdFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__PARTY_ID_FROM, oldPartyIdFrom, partyIdFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyIdTo() {
		return partyIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdTo(String newPartyIdTo) {
		String oldPartyIdTo = partyIdTo;
		partyIdTo = newPartyIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__PARTY_ID_TO, oldPartyIdTo, partyIdTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReasonEnumId() {
		return reasonEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReasonEnumId(String newReasonEnumId) {
		String oldReasonEnumId = reasonEnumId;
		reasonEnumId = newReasonEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__REASON_ENUM_ID, oldReasonEnumId, reasonEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleTypeIdFrom() {
		return roleTypeIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdFrom(String newRoleTypeIdFrom) {
		String oldRoleTypeIdFrom = roleTypeIdFrom;
		roleTypeIdFrom = newRoleTypeIdFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__ROLE_TYPE_ID_FROM, oldRoleTypeIdFrom, roleTypeIdFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleTypeIdTo() {
		return roleTypeIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdTo(String newRoleTypeIdTo) {
		String oldRoleTypeIdTo = roleTypeIdTo;
		roleTypeIdTo = newRoleTypeIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__ROLE_TYPE_ID_TO, oldRoleTypeIdTo, roleTypeIdTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(String newSubject) {
		String oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToString() {
		return toString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToString(String newToString) {
		String oldToString = toString;
		toString = newToString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__TO_STRING, oldToString, toString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> communicationEventOrders() {
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
	public List<String> communicationEventProducts() {
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
	public List<String> communicationEventPurposes() {
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
	public List<String> communicationEventReturns() {
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
	public List<String> communicationEventWorkEffs() {
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
	public List<String> custRequestCommEvents() {
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
	public List<String> subscriptionCommEvents() {
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
	public String getCommunicationEventTypeId() {
		return communicationEventTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationEventTypeId(String newCommunicationEventTypeId) {
		String oldCommunicationEventTypeId = communicationEventTypeId;
		communicationEventTypeId = newCommunicationEventTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__COMMUNICATION_EVENT_TYPE_ID, oldCommunicationEventTypeId, communicationEventTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_EVENT__COMMUNICATION_EVENT_ID, oldCommunicationEventId, communicationEventId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommunicationPackage.COMMUNICATION_EVENT__COMMUNICATION_EVENT_ID:
				return getCommunicationEventId();
			case CommunicationPackage.COMMUNICATION_EVENT__BCC_STRING:
				return getBccString();
			case CommunicationPackage.COMMUNICATION_EVENT__CC_STRING:
				return getCcString();
			case CommunicationPackage.COMMUNICATION_EVENT__COMMUNICATION_EVENT_TYPE_ID:
				return getCommunicationEventTypeId();
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_LIST_ID:
				return getContactListId();
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_ID_FROM:
				return getContactMechIdFrom();
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_ID_TO:
				return getContactMechIdTo();
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_TYPE_ID:
				return getContactMechTypeId();
			case CommunicationPackage.COMMUNICATION_EVENT__CONTENT:
				return getContent();
			case CommunicationPackage.COMMUNICATION_EVENT__CONTENT_MIME_TYPE_ID:
				return getContentMimeTypeId();
			case CommunicationPackage.COMMUNICATION_EVENT__DATETIME_ENDED:
				return getDatetimeEnded();
			case CommunicationPackage.COMMUNICATION_EVENT__DATETIME_STARTED:
				return getDatetimeStarted();
			case CommunicationPackage.COMMUNICATION_EVENT__ENTRY_DATE:
				return getEntryDate();
			case CommunicationPackage.COMMUNICATION_EVENT__FROM_STRING:
				return getFromString();
			case CommunicationPackage.COMMUNICATION_EVENT__HEADER_STRING:
				return getHeaderString();
			case CommunicationPackage.COMMUNICATION_EVENT__MESSAGE_ID:
				return getMessageId();
			case CommunicationPackage.COMMUNICATION_EVENT__NOTE:
				return getNote();
			case CommunicationPackage.COMMUNICATION_EVENT__ORIG_COMM_EVENT_ID:
				return getOrigCommEventId();
			case CommunicationPackage.COMMUNICATION_EVENT__PARENT_COMM_EVENT_ID:
				return getParentCommEventId();
			case CommunicationPackage.COMMUNICATION_EVENT__PARTY_ID_FROM:
				return getPartyIdFrom();
			case CommunicationPackage.COMMUNICATION_EVENT__PARTY_ID_TO:
				return getPartyIdTo();
			case CommunicationPackage.COMMUNICATION_EVENT__REASON_ENUM_ID:
				return getReasonEnumId();
			case CommunicationPackage.COMMUNICATION_EVENT__ROLE_TYPE_ID_FROM:
				return getRoleTypeIdFrom();
			case CommunicationPackage.COMMUNICATION_EVENT__ROLE_TYPE_ID_TO:
				return getRoleTypeIdTo();
			case CommunicationPackage.COMMUNICATION_EVENT__STATUS_ID:
				return getStatusId();
			case CommunicationPackage.COMMUNICATION_EVENT__SUBJECT:
				return getSubject();
			case CommunicationPackage.COMMUNICATION_EVENT__TO_STRING:
				return getToString();
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
			case CommunicationPackage.COMMUNICATION_EVENT__COMMUNICATION_EVENT_ID:
				setCommunicationEventId((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__BCC_STRING:
				setBccString((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__CC_STRING:
				setCcString((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__COMMUNICATION_EVENT_TYPE_ID:
				setCommunicationEventTypeId((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_LIST_ID:
				setContactListId((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_ID_FROM:
				setContactMechIdFrom((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_ID_TO:
				setContactMechIdTo((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_TYPE_ID:
				setContactMechTypeId((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTENT:
				setContent((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTENT_MIME_TYPE_ID:
				setContentMimeTypeId((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__DATETIME_ENDED:
				setDatetimeEnded((Date)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__DATETIME_STARTED:
				setDatetimeStarted((Date)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__ENTRY_DATE:
				setEntryDate((Date)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__FROM_STRING:
				setFromString((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__HEADER_STRING:
				setHeaderString((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__MESSAGE_ID:
				setMessageId((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__NOTE:
				setNote((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__ORIG_COMM_EVENT_ID:
				setOrigCommEventId((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__PARENT_COMM_EVENT_ID:
				setParentCommEventId((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__PARTY_ID_FROM:
				setPartyIdFrom((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__PARTY_ID_TO:
				setPartyIdTo((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__REASON_ENUM_ID:
				setReasonEnumId((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__ROLE_TYPE_ID_FROM:
				setRoleTypeIdFrom((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__ROLE_TYPE_ID_TO:
				setRoleTypeIdTo((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__STATUS_ID:
				setStatusId((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__SUBJECT:
				setSubject((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__TO_STRING:
				setToString((String)newValue);
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
			case CommunicationPackage.COMMUNICATION_EVENT__COMMUNICATION_EVENT_ID:
				setCommunicationEventId(COMMUNICATION_EVENT_ID_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__BCC_STRING:
				setBccString(BCC_STRING_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__CC_STRING:
				setCcString(CC_STRING_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__COMMUNICATION_EVENT_TYPE_ID:
				setCommunicationEventTypeId(COMMUNICATION_EVENT_TYPE_ID_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_LIST_ID:
				setContactListId(CONTACT_LIST_ID_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_ID_FROM:
				setContactMechIdFrom(CONTACT_MECH_ID_FROM_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_ID_TO:
				setContactMechIdTo(CONTACT_MECH_ID_TO_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_TYPE_ID:
				setContactMechTypeId(CONTACT_MECH_TYPE_ID_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTENT_MIME_TYPE_ID:
				setContentMimeTypeId(CONTENT_MIME_TYPE_ID_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__DATETIME_ENDED:
				setDatetimeEnded(DATETIME_ENDED_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__DATETIME_STARTED:
				setDatetimeStarted(DATETIME_STARTED_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__ENTRY_DATE:
				setEntryDate(ENTRY_DATE_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__FROM_STRING:
				setFromString(FROM_STRING_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__HEADER_STRING:
				setHeaderString(HEADER_STRING_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__MESSAGE_ID:
				setMessageId(MESSAGE_ID_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__NOTE:
				setNote(NOTE_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__ORIG_COMM_EVENT_ID:
				setOrigCommEventId(ORIG_COMM_EVENT_ID_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__PARENT_COMM_EVENT_ID:
				setParentCommEventId(PARENT_COMM_EVENT_ID_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__PARTY_ID_FROM:
				setPartyIdFrom(PARTY_ID_FROM_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__PARTY_ID_TO:
				setPartyIdTo(PARTY_ID_TO_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__REASON_ENUM_ID:
				setReasonEnumId(REASON_ENUM_ID_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__ROLE_TYPE_ID_FROM:
				setRoleTypeIdFrom(ROLE_TYPE_ID_FROM_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__ROLE_TYPE_ID_TO:
				setRoleTypeIdTo(ROLE_TYPE_ID_TO_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__SUBJECT:
				setSubject(SUBJECT_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__TO_STRING:
				setToString(TO_STRING_EDEFAULT);
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
			case CommunicationPackage.COMMUNICATION_EVENT__COMMUNICATION_EVENT_ID:
				return COMMUNICATION_EVENT_ID_EDEFAULT == null ? communicationEventId != null : !COMMUNICATION_EVENT_ID_EDEFAULT.equals(communicationEventId);
			case CommunicationPackage.COMMUNICATION_EVENT__BCC_STRING:
				return BCC_STRING_EDEFAULT == null ? bccString != null : !BCC_STRING_EDEFAULT.equals(bccString);
			case CommunicationPackage.COMMUNICATION_EVENT__CC_STRING:
				return CC_STRING_EDEFAULT == null ? ccString != null : !CC_STRING_EDEFAULT.equals(ccString);
			case CommunicationPackage.COMMUNICATION_EVENT__COMMUNICATION_EVENT_TYPE_ID:
				return COMMUNICATION_EVENT_TYPE_ID_EDEFAULT == null ? communicationEventTypeId != null : !COMMUNICATION_EVENT_TYPE_ID_EDEFAULT.equals(communicationEventTypeId);
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_LIST_ID:
				return CONTACT_LIST_ID_EDEFAULT == null ? contactListId != null : !CONTACT_LIST_ID_EDEFAULT.equals(contactListId);
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_ID_FROM:
				return CONTACT_MECH_ID_FROM_EDEFAULT == null ? contactMechIdFrom != null : !CONTACT_MECH_ID_FROM_EDEFAULT.equals(contactMechIdFrom);
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_ID_TO:
				return CONTACT_MECH_ID_TO_EDEFAULT == null ? contactMechIdTo != null : !CONTACT_MECH_ID_TO_EDEFAULT.equals(contactMechIdTo);
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_TYPE_ID:
				return CONTACT_MECH_TYPE_ID_EDEFAULT == null ? contactMechTypeId != null : !CONTACT_MECH_TYPE_ID_EDEFAULT.equals(contactMechTypeId);
			case CommunicationPackage.COMMUNICATION_EVENT__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case CommunicationPackage.COMMUNICATION_EVENT__CONTENT_MIME_TYPE_ID:
				return CONTENT_MIME_TYPE_ID_EDEFAULT == null ? contentMimeTypeId != null : !CONTENT_MIME_TYPE_ID_EDEFAULT.equals(contentMimeTypeId);
			case CommunicationPackage.COMMUNICATION_EVENT__DATETIME_ENDED:
				return DATETIME_ENDED_EDEFAULT == null ? datetimeEnded != null : !DATETIME_ENDED_EDEFAULT.equals(datetimeEnded);
			case CommunicationPackage.COMMUNICATION_EVENT__DATETIME_STARTED:
				return DATETIME_STARTED_EDEFAULT == null ? datetimeStarted != null : !DATETIME_STARTED_EDEFAULT.equals(datetimeStarted);
			case CommunicationPackage.COMMUNICATION_EVENT__ENTRY_DATE:
				return ENTRY_DATE_EDEFAULT == null ? entryDate != null : !ENTRY_DATE_EDEFAULT.equals(entryDate);
			case CommunicationPackage.COMMUNICATION_EVENT__FROM_STRING:
				return FROM_STRING_EDEFAULT == null ? fromString != null : !FROM_STRING_EDEFAULT.equals(fromString);
			case CommunicationPackage.COMMUNICATION_EVENT__HEADER_STRING:
				return HEADER_STRING_EDEFAULT == null ? headerString != null : !HEADER_STRING_EDEFAULT.equals(headerString);
			case CommunicationPackage.COMMUNICATION_EVENT__MESSAGE_ID:
				return MESSAGE_ID_EDEFAULT == null ? messageId != null : !MESSAGE_ID_EDEFAULT.equals(messageId);
			case CommunicationPackage.COMMUNICATION_EVENT__NOTE:
				return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
			case CommunicationPackage.COMMUNICATION_EVENT__ORIG_COMM_EVENT_ID:
				return ORIG_COMM_EVENT_ID_EDEFAULT == null ? origCommEventId != null : !ORIG_COMM_EVENT_ID_EDEFAULT.equals(origCommEventId);
			case CommunicationPackage.COMMUNICATION_EVENT__PARENT_COMM_EVENT_ID:
				return PARENT_COMM_EVENT_ID_EDEFAULT == null ? parentCommEventId != null : !PARENT_COMM_EVENT_ID_EDEFAULT.equals(parentCommEventId);
			case CommunicationPackage.COMMUNICATION_EVENT__PARTY_ID_FROM:
				return PARTY_ID_FROM_EDEFAULT == null ? partyIdFrom != null : !PARTY_ID_FROM_EDEFAULT.equals(partyIdFrom);
			case CommunicationPackage.COMMUNICATION_EVENT__PARTY_ID_TO:
				return PARTY_ID_TO_EDEFAULT == null ? partyIdTo != null : !PARTY_ID_TO_EDEFAULT.equals(partyIdTo);
			case CommunicationPackage.COMMUNICATION_EVENT__REASON_ENUM_ID:
				return REASON_ENUM_ID_EDEFAULT == null ? reasonEnumId != null : !REASON_ENUM_ID_EDEFAULT.equals(reasonEnumId);
			case CommunicationPackage.COMMUNICATION_EVENT__ROLE_TYPE_ID_FROM:
				return ROLE_TYPE_ID_FROM_EDEFAULT == null ? roleTypeIdFrom != null : !ROLE_TYPE_ID_FROM_EDEFAULT.equals(roleTypeIdFrom);
			case CommunicationPackage.COMMUNICATION_EVENT__ROLE_TYPE_ID_TO:
				return ROLE_TYPE_ID_TO_EDEFAULT == null ? roleTypeIdTo != null : !ROLE_TYPE_ID_TO_EDEFAULT.equals(roleTypeIdTo);
			case CommunicationPackage.COMMUNICATION_EVENT__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
			case CommunicationPackage.COMMUNICATION_EVENT__SUBJECT:
				return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
			case CommunicationPackage.COMMUNICATION_EVENT__TO_STRING:
				return TO_STRING_EDEFAULT == null ? toString != null : !TO_STRING_EDEFAULT.equals(toString);
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
		result.append(" (communicationEventId: ");
		result.append(communicationEventId);
		result.append(", bccString: ");
		result.append(bccString);
		result.append(", ccString: ");
		result.append(ccString);
		result.append(", communicationEventTypeId: ");
		result.append(communicationEventTypeId);
		result.append(", contactListId: ");
		result.append(contactListId);
		result.append(", contactMechIdFrom: ");
		result.append(contactMechIdFrom);
		result.append(", contactMechIdTo: ");
		result.append(contactMechIdTo);
		result.append(", contactMechTypeId: ");
		result.append(contactMechTypeId);
		result.append(", content: ");
		result.append(content);
		result.append(", contentMimeTypeId: ");
		result.append(contentMimeTypeId);
		result.append(", datetimeEnded: ");
		result.append(datetimeEnded);
		result.append(", datetimeStarted: ");
		result.append(datetimeStarted);
		result.append(", entryDate: ");
		result.append(entryDate);
		result.append(", fromString: ");
		result.append(fromString);
		result.append(", headerString: ");
		result.append(headerString);
		result.append(", messageId: ");
		result.append(messageId);
		result.append(", note: ");
		result.append(note);
		result.append(", origCommEventId: ");
		result.append(origCommEventId);
		result.append(", parentCommEventId: ");
		result.append(parentCommEventId);
		result.append(", partyIdFrom: ");
		result.append(partyIdFrom);
		result.append(", partyIdTo: ");
		result.append(partyIdTo);
		result.append(", reasonEnumId: ");
		result.append(reasonEnumId);
		result.append(", roleTypeIdFrom: ");
		result.append(roleTypeIdFrom);
		result.append(", roleTypeIdTo: ");
		result.append(roleTypeIdTo);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(", subject: ");
		result.append(subject);
		result.append(", toString: ");
		result.append(toString);
		result.append(')');
		return result.toString();
	}

} //CommunicationEventImpl
