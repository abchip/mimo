/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.message.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.abchip.mimo.edi.message.Message;
import org.abchip.mimo.edi.message.MessagePackage;
import org.abchip.mimo.edi.message.MessageType;

import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.impl.EntityTypeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageTypeImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageTypeImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageTypeImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageTypeImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageTypeImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageTypeImpl#getTransmissionType <em>Transmission Type</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageTypeImpl#isEncrypt <em>Encrypt</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.impl.MessageTypeImpl#getEdiFrameSetups <em>Edi Frame Setups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageTypeImpl<E extends Message> extends EntityTypeImpl<E> implements MessageType<E> {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;
	/**
	 * The default value of the '{@link #getTransmissionType() <em>Transmission Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionType()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSMISSION_TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTransmissionType() <em>Transmission Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionType()
	 * @generated
	 * @ordered
	 */
	protected String transmissionType = TRANSMISSION_TYPE_EDEFAULT;
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
	 * The cached value of the '{@link #getEdiFrameSetups() <em>Edi Frame Setups</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdiFrameSetups()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ediFrameSetups;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MessagePackage.Literals.MESSAGE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.MESSAGE_TYPE__CREATED_STAMP, oldCreatedStamp, createdStamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.MESSAGE_TYPE__CREATED_TX_STAMP, oldCreatedTxStamp, createdTxStamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.MESSAGE_TYPE__LAST_UPDATED_STAMP, oldLastUpdatedStamp, lastUpdatedStamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.MESSAGE_TYPE__LAST_UPDATED_TX_STAMP, oldLastUpdatedTxStamp, lastUpdatedTxStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.MESSAGE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.MESSAGE_TYPE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransmissionType() {
		return transmissionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransmissionType(String newTransmissionType) {
		String oldTransmissionType = transmissionType;
		transmissionType = newTransmissionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.MESSAGE_TYPE__TRANSMISSION_TYPE, oldTransmissionType, transmissionType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MessagePackage.MESSAGE_TYPE__ENCRYPT, oldEncrypt, encrypt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getEdiFrameSetups() {
		if (ediFrameSetups == null) {
			ediFrameSetups = new EDataTypeUniqueEList<String>(String.class, this, MessagePackage.MESSAGE_TYPE__EDI_FRAME_SETUPS);
		}
		return ediFrameSetups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> messageReceiveds() {
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
	public List<String> messageSents() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MessagePackage.MESSAGE_TYPE__CREATED_STAMP:
				return getCreatedStamp();
			case MessagePackage.MESSAGE_TYPE__CREATED_TX_STAMP:
				return getCreatedTxStamp();
			case MessagePackage.MESSAGE_TYPE__LAST_UPDATED_STAMP:
				return getLastUpdatedStamp();
			case MessagePackage.MESSAGE_TYPE__LAST_UPDATED_TX_STAMP:
				return getLastUpdatedTxStamp();
			case MessagePackage.MESSAGE_TYPE__NAME:
				return getName();
			case MessagePackage.MESSAGE_TYPE__TEXT:
				return getText();
			case MessagePackage.MESSAGE_TYPE__TRANSMISSION_TYPE:
				return getTransmissionType();
			case MessagePackage.MESSAGE_TYPE__ENCRYPT:
				return isEncrypt();
			case MessagePackage.MESSAGE_TYPE__EDI_FRAME_SETUPS:
				return getEdiFrameSetups();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MessagePackage.MESSAGE_TYPE__CREATED_STAMP:
				setCreatedStamp((Date)newValue);
				return;
			case MessagePackage.MESSAGE_TYPE__CREATED_TX_STAMP:
				setCreatedTxStamp((Date)newValue);
				return;
			case MessagePackage.MESSAGE_TYPE__LAST_UPDATED_STAMP:
				setLastUpdatedStamp((Date)newValue);
				return;
			case MessagePackage.MESSAGE_TYPE__LAST_UPDATED_TX_STAMP:
				setLastUpdatedTxStamp((Date)newValue);
				return;
			case MessagePackage.MESSAGE_TYPE__NAME:
				setName((String)newValue);
				return;
			case MessagePackage.MESSAGE_TYPE__TEXT:
				setText((String)newValue);
				return;
			case MessagePackage.MESSAGE_TYPE__TRANSMISSION_TYPE:
				setTransmissionType((String)newValue);
				return;
			case MessagePackage.MESSAGE_TYPE__ENCRYPT:
				setEncrypt((Boolean)newValue);
				return;
			case MessagePackage.MESSAGE_TYPE__EDI_FRAME_SETUPS:
				getEdiFrameSetups().clear();
				getEdiFrameSetups().addAll((Collection<? extends String>)newValue);
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
			case MessagePackage.MESSAGE_TYPE__CREATED_STAMP:
				setCreatedStamp(CREATED_STAMP_EDEFAULT);
				return;
			case MessagePackage.MESSAGE_TYPE__CREATED_TX_STAMP:
				setCreatedTxStamp(CREATED_TX_STAMP_EDEFAULT);
				return;
			case MessagePackage.MESSAGE_TYPE__LAST_UPDATED_STAMP:
				setLastUpdatedStamp(LAST_UPDATED_STAMP_EDEFAULT);
				return;
			case MessagePackage.MESSAGE_TYPE__LAST_UPDATED_TX_STAMP:
				setLastUpdatedTxStamp(LAST_UPDATED_TX_STAMP_EDEFAULT);
				return;
			case MessagePackage.MESSAGE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MessagePackage.MESSAGE_TYPE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case MessagePackage.MESSAGE_TYPE__TRANSMISSION_TYPE:
				setTransmissionType(TRANSMISSION_TYPE_EDEFAULT);
				return;
			case MessagePackage.MESSAGE_TYPE__ENCRYPT:
				setEncrypt(ENCRYPT_EDEFAULT);
				return;
			case MessagePackage.MESSAGE_TYPE__EDI_FRAME_SETUPS:
				getEdiFrameSetups().clear();
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
			case MessagePackage.MESSAGE_TYPE__CREATED_STAMP:
				return CREATED_STAMP_EDEFAULT == null ? createdStamp != null : !CREATED_STAMP_EDEFAULT.equals(createdStamp);
			case MessagePackage.MESSAGE_TYPE__CREATED_TX_STAMP:
				return CREATED_TX_STAMP_EDEFAULT == null ? createdTxStamp != null : !CREATED_TX_STAMP_EDEFAULT.equals(createdTxStamp);
			case MessagePackage.MESSAGE_TYPE__LAST_UPDATED_STAMP:
				return LAST_UPDATED_STAMP_EDEFAULT == null ? lastUpdatedStamp != null : !LAST_UPDATED_STAMP_EDEFAULT.equals(lastUpdatedStamp);
			case MessagePackage.MESSAGE_TYPE__LAST_UPDATED_TX_STAMP:
				return LAST_UPDATED_TX_STAMP_EDEFAULT == null ? lastUpdatedTxStamp != null : !LAST_UPDATED_TX_STAMP_EDEFAULT.equals(lastUpdatedTxStamp);
			case MessagePackage.MESSAGE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MessagePackage.MESSAGE_TYPE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case MessagePackage.MESSAGE_TYPE__TRANSMISSION_TYPE:
				return TRANSMISSION_TYPE_EDEFAULT == null ? transmissionType != null : !TRANSMISSION_TYPE_EDEFAULT.equals(transmissionType);
			case MessagePackage.MESSAGE_TYPE__ENCRYPT:
				return encrypt != ENCRYPT_EDEFAULT;
			case MessagePackage.MESSAGE_TYPE__EDI_FRAME_SETUPS:
				return ediFrameSetups != null && !ediFrameSetups.isEmpty();
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
				case MessagePackage.MESSAGE_TYPE__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case MessagePackage.MESSAGE_TYPE__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case MessagePackage.MESSAGE_TYPE__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case MessagePackage.MESSAGE_TYPE__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return MessagePackage.MESSAGE_TYPE__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return MessagePackage.MESSAGE_TYPE__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return MessagePackage.MESSAGE_TYPE__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return MessagePackage.MESSAGE_TYPE__LAST_UPDATED_TX_STAMP;
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
		result.append(", name: ");
		result.append(name);
		result.append(", text: ");
		result.append(text);
		result.append(", transmissionType: ");
		result.append(transmissionType);
		result.append(", encrypt: ");
		result.append(encrypt);
		result.append(", ediFrameSetups: ");
		result.append(ediFrameSetups);
		result.append(')');
		return result.toString();
	}

} //MessageTypeImpl
