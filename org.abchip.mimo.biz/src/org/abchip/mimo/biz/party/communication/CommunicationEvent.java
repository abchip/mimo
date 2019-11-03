/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.communication;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getCommunicationEventId <em>Communication Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getBccString <em>Bcc String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getCcString <em>Cc String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getCommunicationEventTypeId <em>Communication Event Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getContactListId <em>Contact List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getContactMechIdFrom <em>Contact Mech Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getContactMechIdTo <em>Contact Mech Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getContactMechTypeId <em>Contact Mech Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getContent <em>Content</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getContentMimeTypeId <em>Content Mime Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getDatetimeEnded <em>Datetime Ended</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getDatetimeStarted <em>Datetime Started</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getEntryDate <em>Entry Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getFromString <em>From String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getHeaderString <em>Header String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getMessageId <em>Message Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getNote <em>Note</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getOrigCommEventId <em>Orig Comm Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getParentCommEventId <em>Parent Comm Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getReasonEnumId <em>Reason Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getRoleTypeIdFrom <em>Role Type Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getRoleTypeIdTo <em>Role Type Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getToString <em>To String</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent()
 * @model
 * @generated
 */
public interface CommunicationEvent extends BizEntityTyped<CommunicationEventType> {
	/**
	 * Returns the value of the '<em><b>Bcc String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bcc String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bcc String</em>' attribute.
	 * @see #setBccString(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_BccString()
	 * @model
	 * @generated
	 */
	String getBccString();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getBccString <em>Bcc String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bcc String</em>' attribute.
	 * @see #getBccString()
	 * @generated
	 */
	void setBccString(String value);

	/**
	 * Returns the value of the '<em><b>Cc String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc String</em>' attribute.
	 * @see #setCcString(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_CcString()
	 * @model
	 * @generated
	 */
	String getCcString();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getCcString <em>Cc String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc String</em>' attribute.
	 * @see #getCcString()
	 * @generated
	 */
	void setCcString(String value);

	/**
	 * Returns the value of the '<em><b>Contact List Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact List Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact List Id</em>' attribute.
	 * @see #setContactListId(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_ContactListId()
	 * @model annotation="mimo-ent-domain frame='ContactList'"
	 * @generated
	 */
	String getContactListId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getContactListId <em>Contact List Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact List Id</em>' attribute.
	 * @see #getContactListId()
	 * @generated
	 */
	void setContactListId(String value);

	/**
	 * Returns the value of the '<em><b>Contact Mech Id From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Id From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Id From</em>' attribute.
	 * @see #setContactMechIdFrom(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_ContactMechIdFrom()
	 * @model annotation="mimo-ent-domain frame='ContactMech'"
	 * @generated
	 */
	String getContactMechIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getContactMechIdFrom <em>Contact Mech Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Id From</em>' attribute.
	 * @see #getContactMechIdFrom()
	 * @generated
	 */
	void setContactMechIdFrom(String value);

	/**
	 * Returns the value of the '<em><b>Contact Mech Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Id To</em>' attribute.
	 * @see #setContactMechIdTo(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_ContactMechIdTo()
	 * @model annotation="mimo-ent-domain frame='ContactMech'"
	 * @generated
	 */
	String getContactMechIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getContactMechIdTo <em>Contact Mech Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Id To</em>' attribute.
	 * @see #getContactMechIdTo()
	 * @generated
	 */
	void setContactMechIdTo(String value);

	/**
	 * Returns the value of the '<em><b>Contact Mech Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Type Id</em>' attribute.
	 * @see #setContactMechTypeId(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_ContactMechTypeId()
	 * @model annotation="mimo-ent-domain frame='ContactMechType'"
	 * @generated
	 */
	String getContactMechTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getContactMechTypeId <em>Contact Mech Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Type Id</em>' attribute.
	 * @see #getContactMechTypeId()
	 * @generated
	 */
	void setContactMechTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Content Mime Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Mime Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Mime Type Id</em>' attribute.
	 * @see #setContentMimeTypeId(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_ContentMimeTypeId()
	 * @model annotation="mimo-ent-domain frame='MimeType'"
	 * @generated
	 */
	String getContentMimeTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getContentMimeTypeId <em>Content Mime Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Mime Type Id</em>' attribute.
	 * @see #getContentMimeTypeId()
	 * @generated
	 */
	void setContentMimeTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Datetime Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datetime Ended</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datetime Ended</em>' attribute.
	 * @see #setDatetimeEnded(Date)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_DatetimeEnded()
	 * @model
	 * @generated
	 */
	Date getDatetimeEnded();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getDatetimeEnded <em>Datetime Ended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datetime Ended</em>' attribute.
	 * @see #getDatetimeEnded()
	 * @generated
	 */
	void setDatetimeEnded(Date value);

	/**
	 * Returns the value of the '<em><b>Datetime Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datetime Started</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datetime Started</em>' attribute.
	 * @see #setDatetimeStarted(Date)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_DatetimeStarted()
	 * @model
	 * @generated
	 */
	Date getDatetimeStarted();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getDatetimeStarted <em>Datetime Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datetime Started</em>' attribute.
	 * @see #getDatetimeStarted()
	 * @generated
	 */
	void setDatetimeStarted(Date value);

	/**
	 * Returns the value of the '<em><b>Entry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Date</em>' attribute.
	 * @see #setEntryDate(Date)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_EntryDate()
	 * @model
	 * @generated
	 */
	Date getEntryDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getEntryDate <em>Entry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Date</em>' attribute.
	 * @see #getEntryDate()
	 * @generated
	 */
	void setEntryDate(Date value);

	/**
	 * Returns the value of the '<em><b>From String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From String</em>' attribute.
	 * @see #setFromString(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_FromString()
	 * @model
	 * @generated
	 */
	String getFromString();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getFromString <em>From String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From String</em>' attribute.
	 * @see #getFromString()
	 * @generated
	 */
	void setFromString(String value);

	/**
	 * Returns the value of the '<em><b>Header String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header String</em>' attribute.
	 * @see #setHeaderString(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_HeaderString()
	 * @model
	 * @generated
	 */
	String getHeaderString();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getHeaderString <em>Header String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header String</em>' attribute.
	 * @see #getHeaderString()
	 * @generated
	 */
	void setHeaderString(String value);

	/**
	 * Returns the value of the '<em><b>Message Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Id</em>' attribute.
	 * @see #setMessageId(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_MessageId()
	 * @model
	 * @generated
	 */
	String getMessageId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getMessageId <em>Message Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Id</em>' attribute.
	 * @see #getMessageId()
	 * @generated
	 */
	void setMessageId(String value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute.
	 * @see #setNote(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_Note()
	 * @model
	 * @generated
	 */
	String getNote();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(String value);

	/**
	 * Returns the value of the '<em><b>Orig Comm Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orig Comm Event Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orig Comm Event Id</em>' attribute.
	 * @see #setOrigCommEventId(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_OrigCommEventId()
	 * @model
	 * @generated
	 */
	String getOrigCommEventId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getOrigCommEventId <em>Orig Comm Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orig Comm Event Id</em>' attribute.
	 * @see #getOrigCommEventId()
	 * @generated
	 */
	void setOrigCommEventId(String value);

	/**
	 * Returns the value of the '<em><b>Parent Comm Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Comm Event Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Comm Event Id</em>' attribute.
	 * @see #setParentCommEventId(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_ParentCommEventId()
	 * @model
	 * @generated
	 */
	String getParentCommEventId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getParentCommEventId <em>Parent Comm Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Comm Event Id</em>' attribute.
	 * @see #getParentCommEventId()
	 * @generated
	 */
	void setParentCommEventId(String value);

	/**
	 * Returns the value of the '<em><b>Party Id From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id From</em>' attribute.
	 * @see #setPartyIdFrom(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_PartyIdFrom()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getPartyIdFrom <em>Party Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id From</em>' attribute.
	 * @see #getPartyIdFrom()
	 * @generated
	 */
	void setPartyIdFrom(String value);

	/**
	 * Returns the value of the '<em><b>Party Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id To</em>' attribute.
	 * @see #setPartyIdTo(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_PartyIdTo()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getPartyIdTo <em>Party Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id To</em>' attribute.
	 * @see #getPartyIdTo()
	 * @generated
	 */
	void setPartyIdTo(String value);

	/**
	 * Returns the value of the '<em><b>Reason Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Enum Id</em>' attribute.
	 * @see #setReasonEnumId(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_ReasonEnumId()
	 * @model annotation="mimo-ent-domain frame='Enumeration'"
	 * @generated
	 */
	String getReasonEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getReasonEnumId <em>Reason Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason Enum Id</em>' attribute.
	 * @see #getReasonEnumId()
	 * @generated
	 */
	void setReasonEnumId(String value);

	/**
	 * Returns the value of the '<em><b>Role Type Id From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id From</em>' attribute.
	 * @see #setRoleTypeIdFrom(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_RoleTypeIdFrom()
	 * @model annotation="mimo-ent-domain frame='RoleType'"
	 * @generated
	 */
	String getRoleTypeIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getRoleTypeIdFrom <em>Role Type Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id From</em>' attribute.
	 * @see #getRoleTypeIdFrom()
	 * @generated
	 */
	void setRoleTypeIdFrom(String value);

	/**
	 * Returns the value of the '<em><b>Role Type Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id To</em>' attribute.
	 * @see #setRoleTypeIdTo(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_RoleTypeIdTo()
	 * @model annotation="mimo-ent-domain frame='RoleType'"
	 * @generated
	 */
	String getRoleTypeIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getRoleTypeIdTo <em>Role Type Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id To</em>' attribute.
	 * @see #getRoleTypeIdTo()
	 * @generated
	 */
	void setRoleTypeIdTo(String value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' attribute.
	 * @see #setStatusId(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_StatusId()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_Subject()
	 * @model
	 * @generated
	 */
	String getSubject();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(String value);

	/**
	 * Returns the value of the '<em><b>To String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To String</em>' attribute.
	 * @see #setToString(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_ToString()
	 * @model
	 * @generated
	 */
	String getToString();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getToString <em>To String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To String</em>' attribute.
	 * @see #getToString()
	 * @generated
	 */
	void setToString(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CommunicationEventOrder' route='communicationEventId'"
	 * @generated
	 */
	List<String> communicationEventOrders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CommunicationEventProduct' route='communicationEventId'"
	 * @generated
	 */
	List<String> communicationEventProducts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CommunicationEventPurpose' route='communicationEventId'"
	 * @generated
	 */
	List<String> communicationEventPurposes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CommunicationEventReturn' route='communicationEventId'"
	 * @generated
	 */
	List<String> communicationEventReturns();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CommunicationEventWorkEff' route='communicationEventId'"
	 * @generated
	 */
	List<String> communicationEventWorkEffs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CustRequestCommEvent' route='communicationEventId'"
	 * @generated
	 */
	List<String> custRequestCommEvents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SubscriptionCommEvent' route='communicationEventId'"
	 * @generated
	 */
	List<String> subscriptionCommEvents();

	/**
	 * Returns the value of the '<em><b>Communication Event Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Event Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event Type Id</em>' attribute.
	 * @see #setCommunicationEventTypeId(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_CommunicationEventTypeId()
	 * @model annotation="mimo-ent-domain frame='CommunicationEventType'"
	 * @generated
	 */
	String getCommunicationEventTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getCommunicationEventTypeId <em>Communication Event Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Event Type Id</em>' attribute.
	 * @see #getCommunicationEventTypeId()
	 * @generated
	 */
	void setCommunicationEventTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Communication Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Event Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event Id</em>' attribute.
	 * @see #setCommunicationEventId(String)
	 * @see org.abchip.mimo.biz.party.communication.CommunicationPackage#getCommunicationEvent_CommunicationEventId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getCommunicationEventId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getCommunicationEventId <em>Communication Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Event Id</em>' attribute.
	 * @see #getCommunicationEventId()
	 * @generated
	 */
	void setCommunicationEventId(String value);

} // CommunicationEvent
