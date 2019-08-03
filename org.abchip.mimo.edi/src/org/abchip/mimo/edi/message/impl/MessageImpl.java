/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.message.impl;

import org.abchip.mimo.edi.EntityEvent;

import org.abchip.mimo.edi.message.Message;
import org.abchip.mimo.edi.message.MessageBody;
import org.abchip.mimo.edi.message.MessagePackage;
import org.abchip.mimo.edi.message.MessageStatus;
import org.abchip.mimo.edi.message.MessageType;

import org.abchip.mimo.entity.impl.EntityTypedImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageImpl#getMessageId <em>Message Id</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageImpl#getMessageTypeId <em>Message Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageImpl#getFrameId <em>Frame Id</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageImpl#getSenderId <em>Sender Id</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MessageImpl extends EntityTypedImpl<MessageType<?>> implements Message {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The default value of the '{@link #getMessageTypeId() <em>Message Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageTypeId() <em>Message Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageTypeId()
	 * @generated
	 * @ordered
	 */
	protected String messageTypeId = MESSAGE_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrameId() <em>Frame Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameId()
	 * @generated
	 * @ordered
	 */
	protected static final String FRAME_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrameId() <em>Frame Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameId()
	 * @generated
	 * @ordered
	 */
	protected String frameId = FRAME_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected MessageBody body;

	/**
	 * The default value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected static final EntityEvent EVENT_EDEFAULT = EntityEvent.ALL;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EntityEvent event = EVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSenderId() <em>Sender Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenderId()
	 * @generated
	 * @ordered
	 */
	protected static final String SENDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSenderId() <em>Sender Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenderId()
	 * @generated
	 * @ordered
	 */
	protected String senderId = SENDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final MessageStatus STATUS_EDEFAULT = MessageStatus.TRASMITTED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected MessageStatus status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MessagePackage.Literals.MESSAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.MESSAGE__MESSAGE_ID, oldMessageId, messageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessageTypeId() {
		return messageTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageTypeId(String newMessageTypeId) {
		String oldMessageTypeId = messageTypeId;
		messageTypeId = newMessageTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.MESSAGE__MESSAGE_TYPE_ID, oldMessageTypeId, messageTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFrameId() {
		return frameId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrameId(String newFrameId) {
		String oldFrameId = frameId;
		frameId = newFrameId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.MESSAGE__FRAME_ID, oldFrameId, frameId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageBody getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(MessageBody newBody, NotificationChain msgs) {
		MessageBody oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MessagePackage.MESSAGE__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBody(MessageBody newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MessagePackage.MESSAGE__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MessagePackage.MESSAGE__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.MESSAGE__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityEvent getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvent(EntityEvent newEvent) {
		EntityEvent oldEvent = event;
		event = newEvent == null ? EVENT_EDEFAULT : newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.MESSAGE__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSenderId() {
		return senderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSenderId(String newSenderId) {
		String oldSenderId = senderId;
		senderId = newSenderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.MESSAGE__SENDER_ID, oldSenderId, senderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(MessageStatus newStatus) {
		MessageStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.MESSAGE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MessagePackage.MESSAGE__BODY:
				return basicSetBody(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MessagePackage.MESSAGE__MESSAGE_ID:
				return getMessageId();
			case MessagePackage.MESSAGE__MESSAGE_TYPE_ID:
				return getMessageTypeId();
			case MessagePackage.MESSAGE__FRAME_ID:
				return getFrameId();
			case MessagePackage.MESSAGE__BODY:
				return getBody();
			case MessagePackage.MESSAGE__EVENT:
				return getEvent();
			case MessagePackage.MESSAGE__SENDER_ID:
				return getSenderId();
			case MessagePackage.MESSAGE__STATUS:
				return getStatus();
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
			case MessagePackage.MESSAGE__MESSAGE_ID:
				setMessageId((String)newValue);
				return;
			case MessagePackage.MESSAGE__MESSAGE_TYPE_ID:
				setMessageTypeId((String)newValue);
				return;
			case MessagePackage.MESSAGE__FRAME_ID:
				setFrameId((String)newValue);
				return;
			case MessagePackage.MESSAGE__BODY:
				setBody((MessageBody)newValue);
				return;
			case MessagePackage.MESSAGE__EVENT:
				setEvent((EntityEvent)newValue);
				return;
			case MessagePackage.MESSAGE__SENDER_ID:
				setSenderId((String)newValue);
				return;
			case MessagePackage.MESSAGE__STATUS:
				setStatus((MessageStatus)newValue);
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
			case MessagePackage.MESSAGE__MESSAGE_ID:
				setMessageId(MESSAGE_ID_EDEFAULT);
				return;
			case MessagePackage.MESSAGE__MESSAGE_TYPE_ID:
				setMessageTypeId(MESSAGE_TYPE_ID_EDEFAULT);
				return;
			case MessagePackage.MESSAGE__FRAME_ID:
				setFrameId(FRAME_ID_EDEFAULT);
				return;
			case MessagePackage.MESSAGE__BODY:
				setBody((MessageBody)null);
				return;
			case MessagePackage.MESSAGE__EVENT:
				setEvent(EVENT_EDEFAULT);
				return;
			case MessagePackage.MESSAGE__SENDER_ID:
				setSenderId(SENDER_ID_EDEFAULT);
				return;
			case MessagePackage.MESSAGE__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case MessagePackage.MESSAGE__MESSAGE_ID:
				return MESSAGE_ID_EDEFAULT == null ? messageId != null : !MESSAGE_ID_EDEFAULT.equals(messageId);
			case MessagePackage.MESSAGE__MESSAGE_TYPE_ID:
				return MESSAGE_TYPE_ID_EDEFAULT == null ? messageTypeId != null : !MESSAGE_TYPE_ID_EDEFAULT.equals(messageTypeId);
			case MessagePackage.MESSAGE__FRAME_ID:
				return FRAME_ID_EDEFAULT == null ? frameId != null : !FRAME_ID_EDEFAULT.equals(frameId);
			case MessagePackage.MESSAGE__BODY:
				return body != null;
			case MessagePackage.MESSAGE__EVENT:
				return event != EVENT_EDEFAULT;
			case MessagePackage.MESSAGE__SENDER_ID:
				return SENDER_ID_EDEFAULT == null ? senderId != null : !SENDER_ID_EDEFAULT.equals(senderId);
			case MessagePackage.MESSAGE__STATUS:
				return status != STATUS_EDEFAULT;
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
		result.append(" (messageId: ");
		result.append(messageId);
		result.append(", messageTypeId: ");
		result.append(messageTypeId);
		result.append(", frameId: ");
		result.append(frameId);
		result.append(", event: ");
		result.append(event);
		result.append(", senderId: ");
		result.append(senderId);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //MessageImpl
