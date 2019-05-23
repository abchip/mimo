/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi;

import org.abchip.mimo.entity.EntityName;
import org.abchip.mimo.entity.EntityNameable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.edi.Message#getMessageId <em>Message Id</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.Message#getBody <em>Body</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.Message#getEvent <em>Event</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.Message#getSender <em>Sender</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.Message#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.edi.EDIPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EntityNameable {
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
	 * @see org.abchip.mimo.edi.EDIPackage#getMessage_MessageId()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getMessageId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.Message#getMessageId <em>Message Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Id</em>' attribute.
	 * @see #getMessageId()
	 * @generated
	 */
	void setMessageId(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(MessageBody)
	 * @see org.abchip.mimo.edi.EDIPackage#getMessage_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MessageBody getBody();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.Message#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(MessageBody value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.edi.EntityEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see org.abchip.mimo.edi.EntityEvent
	 * @see #setEvent(EntityEvent)
	 * @see org.abchip.mimo.edi.EDIPackage#getMessage_Event()
	 * @model required="true"
	 * @generated
	 */
	EntityEvent getEvent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.Message#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see org.abchip.mimo.edi.EntityEvent
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(EntityEvent value);

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' containment reference.
	 * @see #setSender(EntityName)
	 * @see org.abchip.mimo.edi.EDIPackage#getMessage_Sender()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EntityName getSender();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.Message#getSender <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' containment reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(EntityName value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.edi.MessageStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.abchip.mimo.edi.MessageStatus
	 * @see #setStatus(MessageStatus)
	 * @see org.abchip.mimo.edi.EDIPackage#getMessage_Status()
	 * @model required="true"
	 * @generated
	 */
	MessageStatus getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.Message#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.abchip.mimo.edi.MessageStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(MessageStatus value);

} // Message
