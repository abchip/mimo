/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.entity.impl;

import org.abchip.mimo.edi.entity.EdiFrameSetup;
import org.abchip.mimo.edi.entity.EntityCondition;
import org.abchip.mimo.edi.entity.EntityEvent;
import org.abchip.mimo.edi.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityIdentifiableImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edi Frame Setup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.edi.entity.impl.EdiFrameSetupImpl#getMessageType <em>Message Type</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.entity.impl.EdiFrameSetupImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.entity.impl.EdiFrameSetupImpl#getEntityCondition <em>Entity Condition</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.entity.impl.EdiFrameSetupImpl#getEntityEvent <em>Entity Event</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.entity.impl.EdiFrameSetupImpl#isEncrypt <em>Encrypt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdiFrameSetupImpl extends EntityIdentifiableImpl implements EdiFrameSetup {
	/**
	 * The default value of the '{@link #getMessageType() <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageType()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageType() <em>Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageType()
	 * @generated
	 * @ordered
	 */
	protected String messageType = MESSAGE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrame() <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected static final String FRAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrame() <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected String frame = FRAME_EDEFAULT;


	/**
	 * The default value of the '{@link #getEntityCondition() <em>Entity Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityCondition()
	 * @generated
	 * @ordered
	 */
	protected static final EntityCondition ENTITY_CONDITION_EDEFAULT = EntityCondition.ALL;

	/**
	 * The cached value of the '{@link #getEntityCondition() <em>Entity Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityCondition()
	 * @generated
	 * @ordered
	 */
	protected EntityCondition entityCondition = ENTITY_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntityEvent() <em>Entity Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityEvent()
	 * @generated
	 * @ordered
	 */
	protected static final EntityEvent ENTITY_EVENT_EDEFAULT = EntityEvent.ALL;

	/**
	 * The cached value of the '{@link #getEntityEvent() <em>Entity Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityEvent()
	 * @generated
	 * @ordered
	 */
	protected EntityEvent entityEvent = ENTITY_EVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isEncrypt() <em>Encrypt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncrypt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENCRYPT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEncrypt() <em>Encrypt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncrypt()
	 * @generated
	 * @ordered
	 */
	protected boolean encrypt = ENCRYPT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdiFrameSetupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.EDI_FRAME_SETUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessageType() {
		return messageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageType(String newMessageType) {
		String oldMessageType = messageType;
		messageType = newMessageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.EDI_FRAME_SETUP__MESSAGE_TYPE, oldMessageType, messageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFrame() {
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrame(String newFrame) {
		String oldFrame = frame;
		frame = newFrame;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.EDI_FRAME_SETUP__FRAME, oldFrame, frame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityCondition getEntityCondition() {
		return entityCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityCondition(EntityCondition newEntityCondition) {
		EntityCondition oldEntityCondition = entityCondition;
		entityCondition = newEntityCondition == null ? ENTITY_CONDITION_EDEFAULT : newEntityCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.EDI_FRAME_SETUP__ENTITY_CONDITION, oldEntityCondition, entityCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityEvent getEntityEvent() {
		return entityEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityEvent(EntityEvent newEntityEvent) {
		EntityEvent oldEntityEvent = entityEvent;
		entityEvent = newEntityEvent == null ? ENTITY_EVENT_EDEFAULT : newEntityEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.EDI_FRAME_SETUP__ENTITY_EVENT, oldEntityEvent, entityEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEncrypt() {
		return encrypt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncrypt(boolean newEncrypt) {
		boolean oldEncrypt = encrypt;
		encrypt = newEncrypt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityPackage.EDI_FRAME_SETUP__ENCRYPT, oldEncrypt, encrypt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntityPackage.EDI_FRAME_SETUP__MESSAGE_TYPE:
				return getMessageType();
			case EntityPackage.EDI_FRAME_SETUP__FRAME:
				return getFrame();
			case EntityPackage.EDI_FRAME_SETUP__ENTITY_CONDITION:
				return getEntityCondition();
			case EntityPackage.EDI_FRAME_SETUP__ENTITY_EVENT:
				return getEntityEvent();
			case EntityPackage.EDI_FRAME_SETUP__ENCRYPT:
				return isEncrypt();
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
			case EntityPackage.EDI_FRAME_SETUP__MESSAGE_TYPE:
				setMessageType((String)newValue);
				return;
			case EntityPackage.EDI_FRAME_SETUP__FRAME:
				setFrame((String)newValue);
				return;
			case EntityPackage.EDI_FRAME_SETUP__ENTITY_CONDITION:
				setEntityCondition((EntityCondition)newValue);
				return;
			case EntityPackage.EDI_FRAME_SETUP__ENTITY_EVENT:
				setEntityEvent((EntityEvent)newValue);
				return;
			case EntityPackage.EDI_FRAME_SETUP__ENCRYPT:
				setEncrypt((Boolean)newValue);
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
			case EntityPackage.EDI_FRAME_SETUP__MESSAGE_TYPE:
				setMessageType(MESSAGE_TYPE_EDEFAULT);
				return;
			case EntityPackage.EDI_FRAME_SETUP__FRAME:
				setFrame(FRAME_EDEFAULT);
				return;
			case EntityPackage.EDI_FRAME_SETUP__ENTITY_CONDITION:
				setEntityCondition(ENTITY_CONDITION_EDEFAULT);
				return;
			case EntityPackage.EDI_FRAME_SETUP__ENTITY_EVENT:
				setEntityEvent(ENTITY_EVENT_EDEFAULT);
				return;
			case EntityPackage.EDI_FRAME_SETUP__ENCRYPT:
				setEncrypt(ENCRYPT_EDEFAULT);
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
			case EntityPackage.EDI_FRAME_SETUP__MESSAGE_TYPE:
				return MESSAGE_TYPE_EDEFAULT == null ? messageType != null : !MESSAGE_TYPE_EDEFAULT.equals(messageType);
			case EntityPackage.EDI_FRAME_SETUP__FRAME:
				return FRAME_EDEFAULT == null ? frame != null : !FRAME_EDEFAULT.equals(frame);
			case EntityPackage.EDI_FRAME_SETUP__ENTITY_CONDITION:
				return entityCondition != ENTITY_CONDITION_EDEFAULT;
			case EntityPackage.EDI_FRAME_SETUP__ENTITY_EVENT:
				return entityEvent != ENTITY_EVENT_EDEFAULT;
			case EntityPackage.EDI_FRAME_SETUP__ENCRYPT:
				return encrypt != ENCRYPT_EDEFAULT;
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
		result.append(" (messageType: ");
		result.append(messageType);
		result.append(", frame: ");
		result.append(frame);
		result.append(", entityCondition: ");
		result.append(entityCondition);
		result.append(", entityEvent: ");
		result.append(entityEvent);
		result.append(", encrypt: ");
		result.append(encrypt);
		result.append(')');
		return result.toString();
	}

} //EdiFrameSetupImpl
