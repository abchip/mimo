/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.message;

import org.abchip.mimo.edi.entity.EntityEvent;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.edi.message.Message#getMessageId <em>Message Id</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.Message#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.Message#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.Message#getSender <em>Sender</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.Message#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.Message#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.Message#getEvent <em>Event</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.Message#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.edi.message.MessagePackage#getMessage()
 * @model abstract="true"
 * @generated
 */
public interface Message extends EntityTyped<MessageType<?>>, EntityInfo {
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
	 * @see org.abchip.mimo.edi.message.MessagePackage#getMessage_MessageId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getMessageId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.message.Message#getMessageId <em>Message Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Id</em>' attribute.
	 * @see #getMessageId()
	 * @generated
	 */
	void setMessageId(String value);

	/**
	 * Returns the value of the '<em><b>Message Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Type</em>' attribute.
	 * @see #setMessageType(String)
	 * @see org.abchip.mimo.edi.message.MessagePackage#getMessage_MessageType()
	 * @model required="true"
	 *        annotation="mimo-ent-domain frame='MessageType'"
	 * @generated
	 */
	String getMessageType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.message.Message#getMessageType <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Type</em>' attribute.
	 * @see #getMessageType()
	 * @generated
	 */
	void setMessageType(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see org.abchip.mimo.edi.message.MessagePackage#getMessage_Body()
	 * @model required="true"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.message.Message#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.edi.entity.EntityEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see org.abchip.mimo.edi.entity.EntityEvent
	 * @see #setEvent(EntityEvent)
	 * @see org.abchip.mimo.edi.message.MessagePackage#getMessage_Event()
	 * @model
	 * @generated
	 */
	EntityEvent getEvent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.message.Message#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see org.abchip.mimo.edi.entity.EntityEvent
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(EntityEvent value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.edi.message.MessageStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.abchip.mimo.edi.message.MessageStatus
	 * @see #setStatus(MessageStatus)
	 * @see org.abchip.mimo.edi.message.MessagePackage#getMessage_Status()
	 * @model required="true"
	 * @generated
	 */
	MessageStatus getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.message.Message#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.abchip.mimo.edi.message.MessageStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(MessageStatus value);

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' attribute.
	 * @see #setSender(String)
	 * @see org.abchip.mimo.edi.message.MessagePackage#getMessage_Sender()
	 * @model required="true"
	 *        annotation="mimo-ent-domain frame='UserLogin'"
	 * @generated
	 */
	String getSender();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.message.Message#getSender <em>Sender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' attribute.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(String value);

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' attribute.
	 * @see #setFrame(String)
	 * @see org.abchip.mimo.edi.message.MessagePackage#getMessage_Frame()
	 * @model required="true"
	 *        annotation="mimo-ent-domain frame='Frame'"
	 * @generated
	 */
	String getFrame();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.message.Message#getFrame <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' attribute.
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(String value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' attribute.
	 * @see #setEntity(String)
	 * @see org.abchip.mimo.edi.message.MessagePackage#getMessage_Entity()
	 * @model required="true"
	 * @generated
	 */
	String getEntity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.message.Message#getEntity <em>Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' attribute.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(String value);

} // Message
