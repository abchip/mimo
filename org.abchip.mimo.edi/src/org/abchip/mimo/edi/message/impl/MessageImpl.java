/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.message.impl;

import java.util.Date;
import org.abchip.mimo.edi.entity.EntityEvent;
import org.abchip.mimo.edi.message.Message;
import org.abchip.mimo.edi.message.MessageBody;
import org.abchip.mimo.edi.message.MessagePackage;
import org.abchip.mimo.edi.message.MessageStatus;
import org.abchip.mimo.edi.message.MessageType;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypedImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
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
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageImpl#getMessageId <em>Message Id</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageImpl#getFrameId <em>Frame Id</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageImpl#getEntityId <em>Entity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageImpl#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MessageImpl extends EntityTypedImpl<MessageType> implements Message {
	/**
	 * The default value of the '{@link #getCreatedStamp() <em>Created Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedStamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedStamp() <em>Created Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedStamp()
	 * @generated
	 * @ordered
	 */
	protected Date createdStamp = CREATED_STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedTxStamp() <em>Created Tx Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedTxStamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_TX_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedTxStamp() <em>Created Tx Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedTxStamp()
	 * @generated
	 * @ordered
	 */
	protected Date createdTxStamp = CREATED_TX_STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastUpdatedStamp() <em>Last Updated Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdatedStamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_UPDATED_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastUpdatedStamp() <em>Last Updated Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdatedStamp()
	 * @generated
	 * @ordered
	 */
	protected Date lastUpdatedStamp = LAST_UPDATED_STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastUpdatedTxStamp() <em>Last Updated Tx Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdatedTxStamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_UPDATED_TX_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastUpdatedTxStamp() <em>Last Updated Tx Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdatedTxStamp()
	 * @generated
	 * @ordered
	 */
	protected Date lastUpdatedTxStamp = LAST_UPDATED_TX_STAMP_EDEFAULT;


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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final MessageStatus STATUS_EDEFAULT = MessageStatus.READY;

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
	 * The default value of the '{@link #getSender() <em>Sender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected static final String SENDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected String sender = SENDER_EDEFAULT;

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
	 * The default value of the '{@link #getEntityId() <em>Entity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityId()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntityId() <em>Entity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityId()
	 * @generated
	 * @ordered
	 */
	protected String entityId = ENTITY_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getMessageType() <em>Message Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageType()
	 * @generated
	 * @ordered
	 */
	protected MessageType messageType;

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
	public Date getCreatedStamp() {
		return createdStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedStamp(Date newCreatedStamp) {
		Date oldCreatedStamp = createdStamp;
		createdStamp = newCreatedStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.MESSAGE__CREATED_STAMP, oldCreatedStamp, createdStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedTxStamp() {
		return createdTxStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedTxStamp(Date newCreatedTxStamp) {
		Date oldCreatedTxStamp = createdTxStamp;
		createdTxStamp = newCreatedTxStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.MESSAGE__CREATED_TX_STAMP, oldCreatedTxStamp, createdTxStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedStamp() {
		return lastUpdatedStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedStamp(Date newLastUpdatedStamp) {
		Date oldLastUpdatedStamp = lastUpdatedStamp;
		lastUpdatedStamp = newLastUpdatedStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.MESSAGE__LAST_UPDATED_STAMP, oldLastUpdatedStamp, lastUpdatedStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdatedTxStamp() {
		return lastUpdatedTxStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdatedTxStamp(Date newLastUpdatedTxStamp) {
		Date oldLastUpdatedTxStamp = lastUpdatedTxStamp;
		lastUpdatedTxStamp = newLastUpdatedTxStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.MESSAGE__LAST_UPDATED_TX_STAMP, oldLastUpdatedTxStamp, lastUpdatedTxStamp));
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
	public MessageType getMessageType() {
		if (messageType != null && ((EObject)messageType).eIsProxy()) {
			InternalEObject oldMessageType = (InternalEObject)messageType;
			messageType = (MessageType)eResolveProxy(oldMessageType);
			if (messageType != oldMessageType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MessagePackage.MESSAGE__MESSAGE_TYPE, oldMessageType, messageType));
			}
		}
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType basicGetMessageType() {
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageType(MessageType newMessageType) {
		MessageType oldMessageType = messageType;
		messageType = newMessageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.MESSAGE__MESSAGE_TYPE, oldMessageType, messageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageBody getBody() {
		if (body != null && ((EObject)body).eIsProxy()) {
			InternalEObject oldBody = (InternalEObject)body;
			body = (MessageBody)eResolveProxy(oldBody);
			if (body != oldBody) {
				InternalEObject newBody = (InternalEObject)body;
				NotificationChain msgs = oldBody.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MessagePackage.MESSAGE__BODY, null, null);
				if (newBody.eInternalContainer() == null) {
					msgs = newBody.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MessagePackage.MESSAGE__BODY, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MessagePackage.MESSAGE__BODY, oldBody, body));
			}
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageBody basicGetBody() {
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
	public String getSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSender(String newSender) {
		String oldSender = sender;
		sender = newSender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.MESSAGE__SENDER, oldSender, sender));
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
	public String getEntityId() {
		return entityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityId(String newEntityId) {
		String oldEntityId = entityId;
		entityId = newEntityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.MESSAGE__ENTITY_ID, oldEntityId, entityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MessagePackage.MESSAGE__CREATED_STAMP:
				return getCreatedStamp();
			case MessagePackage.MESSAGE__CREATED_TX_STAMP:
				return getCreatedTxStamp();
			case MessagePackage.MESSAGE__LAST_UPDATED_STAMP:
				return getLastUpdatedStamp();
			case MessagePackage.MESSAGE__LAST_UPDATED_TX_STAMP:
				return getLastUpdatedTxStamp();
			case MessagePackage.MESSAGE__MESSAGE_ID:
				return getMessageId();
			case MessagePackage.MESSAGE__STATUS:
				return getStatus();
			case MessagePackage.MESSAGE__SENDER:
				return getSender();
			case MessagePackage.MESSAGE__FRAME_ID:
				return getFrameId();
			case MessagePackage.MESSAGE__ENTITY_ID:
				return getEntityId();
			case MessagePackage.MESSAGE__EVENT:
				return getEvent();
			case MessagePackage.MESSAGE__MESSAGE_TYPE:
				if (resolve) return getMessageType();
				return basicGetMessageType();
			case MessagePackage.MESSAGE__BODY:
				if (resolve) return getBody();
				return basicGetBody();
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
			case MessagePackage.MESSAGE__CREATED_STAMP:
				setCreatedStamp((Date)newValue);
				return;
			case MessagePackage.MESSAGE__CREATED_TX_STAMP:
				setCreatedTxStamp((Date)newValue);
				return;
			case MessagePackage.MESSAGE__LAST_UPDATED_STAMP:
				setLastUpdatedStamp((Date)newValue);
				return;
			case MessagePackage.MESSAGE__LAST_UPDATED_TX_STAMP:
				setLastUpdatedTxStamp((Date)newValue);
				return;
			case MessagePackage.MESSAGE__MESSAGE_ID:
				setMessageId((String)newValue);
				return;
			case MessagePackage.MESSAGE__STATUS:
				setStatus((MessageStatus)newValue);
				return;
			case MessagePackage.MESSAGE__SENDER:
				setSender((String)newValue);
				return;
			case MessagePackage.MESSAGE__FRAME_ID:
				setFrameId((String)newValue);
				return;
			case MessagePackage.MESSAGE__ENTITY_ID:
				setEntityId((String)newValue);
				return;
			case MessagePackage.MESSAGE__EVENT:
				setEvent((EntityEvent)newValue);
				return;
			case MessagePackage.MESSAGE__MESSAGE_TYPE:
				setMessageType((MessageType)newValue);
				return;
			case MessagePackage.MESSAGE__BODY:
				setBody((MessageBody)newValue);
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
			case MessagePackage.MESSAGE__CREATED_STAMP:
				setCreatedStamp(CREATED_STAMP_EDEFAULT);
				return;
			case MessagePackage.MESSAGE__CREATED_TX_STAMP:
				setCreatedTxStamp(CREATED_TX_STAMP_EDEFAULT);
				return;
			case MessagePackage.MESSAGE__LAST_UPDATED_STAMP:
				setLastUpdatedStamp(LAST_UPDATED_STAMP_EDEFAULT);
				return;
			case MessagePackage.MESSAGE__LAST_UPDATED_TX_STAMP:
				setLastUpdatedTxStamp(LAST_UPDATED_TX_STAMP_EDEFAULT);
				return;
			case MessagePackage.MESSAGE__MESSAGE_ID:
				setMessageId(MESSAGE_ID_EDEFAULT);
				return;
			case MessagePackage.MESSAGE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case MessagePackage.MESSAGE__SENDER:
				setSender(SENDER_EDEFAULT);
				return;
			case MessagePackage.MESSAGE__FRAME_ID:
				setFrameId(FRAME_ID_EDEFAULT);
				return;
			case MessagePackage.MESSAGE__ENTITY_ID:
				setEntityId(ENTITY_ID_EDEFAULT);
				return;
			case MessagePackage.MESSAGE__EVENT:
				setEvent(EVENT_EDEFAULT);
				return;
			case MessagePackage.MESSAGE__MESSAGE_TYPE:
				setMessageType((MessageType)null);
				return;
			case MessagePackage.MESSAGE__BODY:
				setBody((MessageBody)null);
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
			case MessagePackage.MESSAGE__CREATED_STAMP:
				return CREATED_STAMP_EDEFAULT == null ? createdStamp != null : !CREATED_STAMP_EDEFAULT.equals(createdStamp);
			case MessagePackage.MESSAGE__CREATED_TX_STAMP:
				return CREATED_TX_STAMP_EDEFAULT == null ? createdTxStamp != null : !CREATED_TX_STAMP_EDEFAULT.equals(createdTxStamp);
			case MessagePackage.MESSAGE__LAST_UPDATED_STAMP:
				return LAST_UPDATED_STAMP_EDEFAULT == null ? lastUpdatedStamp != null : !LAST_UPDATED_STAMP_EDEFAULT.equals(lastUpdatedStamp);
			case MessagePackage.MESSAGE__LAST_UPDATED_TX_STAMP:
				return LAST_UPDATED_TX_STAMP_EDEFAULT == null ? lastUpdatedTxStamp != null : !LAST_UPDATED_TX_STAMP_EDEFAULT.equals(lastUpdatedTxStamp);
			case MessagePackage.MESSAGE__MESSAGE_ID:
				return MESSAGE_ID_EDEFAULT == null ? messageId != null : !MESSAGE_ID_EDEFAULT.equals(messageId);
			case MessagePackage.MESSAGE__STATUS:
				return status != STATUS_EDEFAULT;
			case MessagePackage.MESSAGE__SENDER:
				return SENDER_EDEFAULT == null ? sender != null : !SENDER_EDEFAULT.equals(sender);
			case MessagePackage.MESSAGE__FRAME_ID:
				return FRAME_ID_EDEFAULT == null ? frameId != null : !FRAME_ID_EDEFAULT.equals(frameId);
			case MessagePackage.MESSAGE__ENTITY_ID:
				return ENTITY_ID_EDEFAULT == null ? entityId != null : !ENTITY_ID_EDEFAULT.equals(entityId);
			case MessagePackage.MESSAGE__EVENT:
				return event != EVENT_EDEFAULT;
			case MessagePackage.MESSAGE__MESSAGE_TYPE:
				return messageType != null;
			case MessagePackage.MESSAGE__BODY:
				return body != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (derivedFeatureID) {
				case MessagePackage.MESSAGE__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case MessagePackage.MESSAGE__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case MessagePackage.MESSAGE__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case MessagePackage.MESSAGE__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EntityInfo.class) {
			switch (baseFeatureID) {
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return MessagePackage.MESSAGE__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return MessagePackage.MESSAGE__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return MessagePackage.MESSAGE__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return MessagePackage.MESSAGE__LAST_UPDATED_TX_STAMP;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (createdStamp: ");
		result.append(createdStamp);
		result.append(", createdTxStamp: ");
		result.append(createdTxStamp);
		result.append(", lastUpdatedStamp: ");
		result.append(lastUpdatedStamp);
		result.append(", lastUpdatedTxStamp: ");
		result.append(lastUpdatedTxStamp);
		result.append(", messageId: ");
		result.append(messageId);
		result.append(", status: ");
		result.append(status);
		result.append(", sender: ");
		result.append(sender);
		result.append(", frameId: ");
		result.append(frameId);
		result.append(", entityId: ");
		result.append(entityId);
		result.append(", event: ");
		result.append(event);
		result.append(')');
		return result.toString();
	}

} //MessageImpl
