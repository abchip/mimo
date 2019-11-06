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

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.content.data.MimeType;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.marketing.contact.ContactList;
import org.abchip.mimo.biz.party.communication.CommunicationEvent;
import org.abchip.mimo.biz.party.communication.CommunicationEventType;
import org.abchip.mimo.biz.party.communication.CommunicationPackage;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.contact.ContactMechType;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.RoleType;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getDatetimeEnded <em>Datetime Ended</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getDatetimeStarted <em>Datetime Started</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getEntryDate <em>Entry Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getFromString <em>From String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getHeaderString <em>Header String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getMessageId <em>Message Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getOrigCommEventId <em>Orig Comm Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getParentCommEventId <em>Parent Comm Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getToString <em>To String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getCommunicationEventTypeId <em>Communication Event Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getRoleTypeIdTo <em>Role Type Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getRoleTypeIdFrom <em>Role Type Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getContactMechTypeId <em>Contact Mech Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getContactMechIdFrom <em>Contact Mech Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getContactMechIdTo <em>Contact Mech Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getContactListId <em>Contact List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getContentMimeTypeId <em>Content Mime Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl#getReasonEnumId <em>Reason Enum Id</em>}</li>
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
	 * The cached value of the '{@link #getCommunicationEventTypeId() <em>Communication Event Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationEventTypeId()
	 * @generated
	 * @ordered
	 */
	protected CommunicationEventType communicationEventTypeId;
	/**
	 * The cached value of the '{@link #getPartyIdTo() <em>Party Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdTo()
	 * @generated
	 * @ordered
	 */
	protected Party partyIdTo;
	/**
	 * The cached value of the '{@link #getRoleTypeIdTo() <em>Role Type Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdTo()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleTypeIdTo;
	/**
	 * The cached value of the '{@link #getPartyIdFrom() <em>Party Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdFrom()
	 * @generated
	 * @ordered
	 */
	protected Party partyIdFrom;
	/**
	 * The cached value of the '{@link #getRoleTypeIdFrom() <em>Role Type Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdFrom()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleTypeIdFrom;
	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;
	/**
	 * The cached value of the '{@link #getContactMechTypeId() <em>Contact Mech Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechTypeId()
	 * @generated
	 * @ordered
	 */
	protected ContactMechType contactMechTypeId;
	/**
	 * The cached value of the '{@link #getContactMechIdFrom() <em>Contact Mech Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechIdFrom()
	 * @generated
	 * @ordered
	 */
	protected ContactMech contactMechIdFrom;
	/**
	 * The cached value of the '{@link #getContactMechIdTo() <em>Contact Mech Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechIdTo()
	 * @generated
	 * @ordered
	 */
	protected ContactMech contactMechIdTo;
	/**
	 * The cached value of the '{@link #getContactListId() <em>Contact List Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactListId()
	 * @generated
	 * @ordered
	 */
	protected ContactList contactListId;
	/**
	 * The cached value of the '{@link #getContentMimeTypeId() <em>Content Mime Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentMimeTypeId()
	 * @generated
	 * @ordered
	 */
	protected MimeType contentMimeTypeId;
	/**
	 * The cached value of the '{@link #getReasonEnumId() <em>Reason Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration reasonEnumId;

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
		bccString = newBccString;
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
		ccString = newCcString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactList getContactListId() {
		if (contactListId != null && ((EObject)contactListId).eIsProxy()) {
			InternalEObject oldContactListId = (InternalEObject)contactListId;
			contactListId = (ContactList)eResolveProxy(oldContactListId);
			if (contactListId != oldContactListId) {
			}
		}
		return contactListId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactList basicGetContactListId() {
		return contactListId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactListId(ContactList newContactListId) {
		contactListId = newContactListId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getContactMechIdFrom() {
		if (contactMechIdFrom != null && ((EObject)contactMechIdFrom).eIsProxy()) {
			InternalEObject oldContactMechIdFrom = (InternalEObject)contactMechIdFrom;
			contactMechIdFrom = (ContactMech)eResolveProxy(oldContactMechIdFrom);
			if (contactMechIdFrom != oldContactMechIdFrom) {
			}
		}
		return contactMechIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMech basicGetContactMechIdFrom() {
		return contactMechIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechIdFrom(ContactMech newContactMechIdFrom) {
		contactMechIdFrom = newContactMechIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getContactMechIdTo() {
		if (contactMechIdTo != null && ((EObject)contactMechIdTo).eIsProxy()) {
			InternalEObject oldContactMechIdTo = (InternalEObject)contactMechIdTo;
			contactMechIdTo = (ContactMech)eResolveProxy(oldContactMechIdTo);
			if (contactMechIdTo != oldContactMechIdTo) {
			}
		}
		return contactMechIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMech basicGetContactMechIdTo() {
		return contactMechIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechIdTo(ContactMech newContactMechIdTo) {
		contactMechIdTo = newContactMechIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMechType getContactMechTypeId() {
		if (contactMechTypeId != null && ((EObject)contactMechTypeId).eIsProxy()) {
			InternalEObject oldContactMechTypeId = (InternalEObject)contactMechTypeId;
			contactMechTypeId = (ContactMechType)eResolveProxy(oldContactMechTypeId);
			if (contactMechTypeId != oldContactMechTypeId) {
			}
		}
		return contactMechTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMechType basicGetContactMechTypeId() {
		return contactMechTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechTypeId(ContactMechType newContactMechTypeId) {
		contactMechTypeId = newContactMechTypeId;
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
		content = newContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MimeType getContentMimeTypeId() {
		if (contentMimeTypeId != null && ((EObject)contentMimeTypeId).eIsProxy()) {
			InternalEObject oldContentMimeTypeId = (InternalEObject)contentMimeTypeId;
			contentMimeTypeId = (MimeType)eResolveProxy(oldContentMimeTypeId);
			if (contentMimeTypeId != oldContentMimeTypeId) {
			}
		}
		return contentMimeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MimeType basicGetContentMimeTypeId() {
		return contentMimeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentMimeTypeId(MimeType newContentMimeTypeId) {
		contentMimeTypeId = newContentMimeTypeId;
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
		datetimeEnded = newDatetimeEnded;
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
		datetimeStarted = newDatetimeStarted;
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
		entryDate = newEntryDate;
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
		fromString = newFromString;
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
		headerString = newHeaderString;
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
		messageId = newMessageId;
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
		note = newNote;
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
		origCommEventId = newOrigCommEventId;
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
		parentCommEventId = newParentCommEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyIdFrom() {
		if (partyIdFrom != null && ((EObject)partyIdFrom).eIsProxy()) {
			InternalEObject oldPartyIdFrom = (InternalEObject)partyIdFrom;
			partyIdFrom = (Party)eResolveProxy(oldPartyIdFrom);
			if (partyIdFrom != oldPartyIdFrom) {
			}
		}
		return partyIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyIdFrom() {
		return partyIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdFrom(Party newPartyIdFrom) {
		partyIdFrom = newPartyIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyIdTo() {
		if (partyIdTo != null && ((EObject)partyIdTo).eIsProxy()) {
			InternalEObject oldPartyIdTo = (InternalEObject)partyIdTo;
			partyIdTo = (Party)eResolveProxy(oldPartyIdTo);
			if (partyIdTo != oldPartyIdTo) {
			}
		}
		return partyIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyIdTo() {
		return partyIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdTo(Party newPartyIdTo) {
		partyIdTo = newPartyIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getReasonEnumId() {
		if (reasonEnumId != null && ((EObject)reasonEnumId).eIsProxy()) {
			InternalEObject oldReasonEnumId = (InternalEObject)reasonEnumId;
			reasonEnumId = (Enumeration)eResolveProxy(oldReasonEnumId);
			if (reasonEnumId != oldReasonEnumId) {
			}
		}
		return reasonEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetReasonEnumId() {
		return reasonEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReasonEnumId(Enumeration newReasonEnumId) {
		reasonEnumId = newReasonEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleTypeIdFrom() {
		if (roleTypeIdFrom != null && ((EObject)roleTypeIdFrom).eIsProxy()) {
			InternalEObject oldRoleTypeIdFrom = (InternalEObject)roleTypeIdFrom;
			roleTypeIdFrom = (RoleType)eResolveProxy(oldRoleTypeIdFrom);
			if (roleTypeIdFrom != oldRoleTypeIdFrom) {
			}
		}
		return roleTypeIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetRoleTypeIdFrom() {
		return roleTypeIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdFrom(RoleType newRoleTypeIdFrom) {
		roleTypeIdFrom = newRoleTypeIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleTypeIdTo() {
		if (roleTypeIdTo != null && ((EObject)roleTypeIdTo).eIsProxy()) {
			InternalEObject oldRoleTypeIdTo = (InternalEObject)roleTypeIdTo;
			roleTypeIdTo = (RoleType)eResolveProxy(oldRoleTypeIdTo);
			if (roleTypeIdTo != oldRoleTypeIdTo) {
			}
		}
		return roleTypeIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetRoleTypeIdTo() {
		return roleTypeIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdTo(RoleType newRoleTypeIdTo) {
		roleTypeIdTo = newRoleTypeIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		statusId = newStatusId;
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
		subject = newSubject;
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
		toString = newToString;
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
	public CommunicationEventType getCommunicationEventTypeId() {
		if (communicationEventTypeId != null && ((EObject)communicationEventTypeId).eIsProxy()) {
			InternalEObject oldCommunicationEventTypeId = (InternalEObject)communicationEventTypeId;
			communicationEventTypeId = (CommunicationEventType)eResolveProxy(oldCommunicationEventTypeId);
			if (communicationEventTypeId != oldCommunicationEventTypeId) {
			}
		}
		return communicationEventTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationEventType basicGetCommunicationEventTypeId() {
		return communicationEventTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationEventTypeId(CommunicationEventType newCommunicationEventTypeId) {
		communicationEventTypeId = newCommunicationEventTypeId;
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
		communicationEventId = newCommunicationEventId;
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
			case CommunicationPackage.COMMUNICATION_EVENT__CONTENT:
				return getContent();
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
			case CommunicationPackage.COMMUNICATION_EVENT__SUBJECT:
				return getSubject();
			case CommunicationPackage.COMMUNICATION_EVENT__TO_STRING:
				return getToString();
			case CommunicationPackage.COMMUNICATION_EVENT__COMMUNICATION_EVENT_TYPE_ID:
				if (resolve) return getCommunicationEventTypeId();
				return basicGetCommunicationEventTypeId();
			case CommunicationPackage.COMMUNICATION_EVENT__PARTY_ID_TO:
				if (resolve) return getPartyIdTo();
				return basicGetPartyIdTo();
			case CommunicationPackage.COMMUNICATION_EVENT__ROLE_TYPE_ID_TO:
				if (resolve) return getRoleTypeIdTo();
				return basicGetRoleTypeIdTo();
			case CommunicationPackage.COMMUNICATION_EVENT__PARTY_ID_FROM:
				if (resolve) return getPartyIdFrom();
				return basicGetPartyIdFrom();
			case CommunicationPackage.COMMUNICATION_EVENT__ROLE_TYPE_ID_FROM:
				if (resolve) return getRoleTypeIdFrom();
				return basicGetRoleTypeIdFrom();
			case CommunicationPackage.COMMUNICATION_EVENT__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_TYPE_ID:
				if (resolve) return getContactMechTypeId();
				return basicGetContactMechTypeId();
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_ID_FROM:
				if (resolve) return getContactMechIdFrom();
				return basicGetContactMechIdFrom();
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_ID_TO:
				if (resolve) return getContactMechIdTo();
				return basicGetContactMechIdTo();
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_LIST_ID:
				if (resolve) return getContactListId();
				return basicGetContactListId();
			case CommunicationPackage.COMMUNICATION_EVENT__CONTENT_MIME_TYPE_ID:
				if (resolve) return getContentMimeTypeId();
				return basicGetContentMimeTypeId();
			case CommunicationPackage.COMMUNICATION_EVENT__REASON_ENUM_ID:
				if (resolve) return getReasonEnumId();
				return basicGetReasonEnumId();
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
			case CommunicationPackage.COMMUNICATION_EVENT__CONTENT:
				setContent((String)newValue);
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
			case CommunicationPackage.COMMUNICATION_EVENT__SUBJECT:
				setSubject((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__TO_STRING:
				setToString((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__COMMUNICATION_EVENT_TYPE_ID:
				setCommunicationEventTypeId((CommunicationEventType)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__PARTY_ID_TO:
				setPartyIdTo((Party)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__ROLE_TYPE_ID_TO:
				setRoleTypeIdTo((RoleType)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__PARTY_ID_FROM:
				setPartyIdFrom((Party)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__ROLE_TYPE_ID_FROM:
				setRoleTypeIdFrom((RoleType)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_TYPE_ID:
				setContactMechTypeId((ContactMechType)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_ID_FROM:
				setContactMechIdFrom((ContactMech)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_ID_TO:
				setContactMechIdTo((ContactMech)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_LIST_ID:
				setContactListId((ContactList)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTENT_MIME_TYPE_ID:
				setContentMimeTypeId((MimeType)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__REASON_ENUM_ID:
				setReasonEnumId((Enumeration)newValue);
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
			case CommunicationPackage.COMMUNICATION_EVENT__CONTENT:
				setContent(CONTENT_EDEFAULT);
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
			case CommunicationPackage.COMMUNICATION_EVENT__SUBJECT:
				setSubject(SUBJECT_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__TO_STRING:
				setToString(TO_STRING_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__COMMUNICATION_EVENT_TYPE_ID:
				setCommunicationEventTypeId((CommunicationEventType)null);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__PARTY_ID_TO:
				setPartyIdTo((Party)null);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__ROLE_TYPE_ID_TO:
				setRoleTypeIdTo((RoleType)null);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__PARTY_ID_FROM:
				setPartyIdFrom((Party)null);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__ROLE_TYPE_ID_FROM:
				setRoleTypeIdFrom((RoleType)null);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_TYPE_ID:
				setContactMechTypeId((ContactMechType)null);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_ID_FROM:
				setContactMechIdFrom((ContactMech)null);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_ID_TO:
				setContactMechIdTo((ContactMech)null);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_LIST_ID:
				setContactListId((ContactList)null);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTENT_MIME_TYPE_ID:
				setContentMimeTypeId((MimeType)null);
				return;
			case CommunicationPackage.COMMUNICATION_EVENT__REASON_ENUM_ID:
				setReasonEnumId((Enumeration)null);
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
			case CommunicationPackage.COMMUNICATION_EVENT__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
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
			case CommunicationPackage.COMMUNICATION_EVENT__SUBJECT:
				return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
			case CommunicationPackage.COMMUNICATION_EVENT__TO_STRING:
				return TO_STRING_EDEFAULT == null ? toString != null : !TO_STRING_EDEFAULT.equals(toString);
			case CommunicationPackage.COMMUNICATION_EVENT__COMMUNICATION_EVENT_TYPE_ID:
				return communicationEventTypeId != null;
			case CommunicationPackage.COMMUNICATION_EVENT__PARTY_ID_TO:
				return partyIdTo != null;
			case CommunicationPackage.COMMUNICATION_EVENT__ROLE_TYPE_ID_TO:
				return roleTypeIdTo != null;
			case CommunicationPackage.COMMUNICATION_EVENT__PARTY_ID_FROM:
				return partyIdFrom != null;
			case CommunicationPackage.COMMUNICATION_EVENT__ROLE_TYPE_ID_FROM:
				return roleTypeIdFrom != null;
			case CommunicationPackage.COMMUNICATION_EVENT__STATUS_ID:
				return statusId != null;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_TYPE_ID:
				return contactMechTypeId != null;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_ID_FROM:
				return contactMechIdFrom != null;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_MECH_ID_TO:
				return contactMechIdTo != null;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTACT_LIST_ID:
				return contactListId != null;
			case CommunicationPackage.COMMUNICATION_EVENT__CONTENT_MIME_TYPE_ID:
				return contentMimeTypeId != null;
			case CommunicationPackage.COMMUNICATION_EVENT__REASON_ENUM_ID:
				return reasonEnumId != null;
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
		result.append(", content: ");
		result.append(content);
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
		result.append(", subject: ");
		result.append(subject);
		result.append(", toString: ");
		result.append(toString);
		result.append(')');
		return result.toString();
	}

} //CommunicationEventImpl
