/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.transmission.impl;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.edi.transmission.TransmissionPackage;
import org.abchip.mimo.edi.transmission.Transmitter;
import org.abchip.mimo.edi.transmission.TransmitterType;

import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityPackage;

import org.abchip.mimo.entity.impl.EntityTypedImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transmitter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.edi.transmission.impl.TransmitterImpl#getCreatedStamp <em>Created Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.transmission.impl.TransmitterImpl#getCreatedTxStamp <em>Created Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.transmission.impl.TransmitterImpl#getLastUpdatedStamp <em>Last Updated Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.transmission.impl.TransmitterImpl#getLastUpdatedTxStamp <em>Last Updated Tx Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.transmission.impl.TransmitterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.transmission.impl.TransmitterImpl#getTransmitterType <em>Transmitter Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransmitterImpl extends EntityTypedImpl<TransmitterType> implements Transmitter {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The default value of the '{@link #getTransmitterType() <em>Transmitter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmitterType()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSMITTER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransmitterType() <em>Transmitter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmitterType()
	 * @generated
	 * @ordered
	 */
	protected String transmitterType = TRANSMITTER_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransmitterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransmissionPackage.Literals.TRANSMITTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TransmissionPackage.TRANSMITTER__CREATED_STAMP, oldCreatedStamp, createdStamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TransmissionPackage.TRANSMITTER__CREATED_TX_STAMP, oldCreatedTxStamp, createdTxStamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TransmissionPackage.TRANSMITTER__LAST_UPDATED_STAMP, oldLastUpdatedStamp, lastUpdatedStamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TransmissionPackage.TRANSMITTER__LAST_UPDATED_TX_STAMP, oldLastUpdatedTxStamp, lastUpdatedTxStamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TransmissionPackage.TRANSMITTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransmitterType() {
		return transmitterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransmitterType(String newTransmitterType) {
		String oldTransmitterType = transmitterType;
		transmitterType = newTransmitterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransmissionPackage.TRANSMITTER__TRANSMITTER_TYPE, oldTransmitterType, transmitterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> messageTypes() {
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
			case TransmissionPackage.TRANSMITTER__CREATED_STAMP:
				return getCreatedStamp();
			case TransmissionPackage.TRANSMITTER__CREATED_TX_STAMP:
				return getCreatedTxStamp();
			case TransmissionPackage.TRANSMITTER__LAST_UPDATED_STAMP:
				return getLastUpdatedStamp();
			case TransmissionPackage.TRANSMITTER__LAST_UPDATED_TX_STAMP:
				return getLastUpdatedTxStamp();
			case TransmissionPackage.TRANSMITTER__NAME:
				return getName();
			case TransmissionPackage.TRANSMITTER__TRANSMITTER_TYPE:
				return getTransmitterType();
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
			case TransmissionPackage.TRANSMITTER__CREATED_STAMP:
				setCreatedStamp((Date)newValue);
				return;
			case TransmissionPackage.TRANSMITTER__CREATED_TX_STAMP:
				setCreatedTxStamp((Date)newValue);
				return;
			case TransmissionPackage.TRANSMITTER__LAST_UPDATED_STAMP:
				setLastUpdatedStamp((Date)newValue);
				return;
			case TransmissionPackage.TRANSMITTER__LAST_UPDATED_TX_STAMP:
				setLastUpdatedTxStamp((Date)newValue);
				return;
			case TransmissionPackage.TRANSMITTER__NAME:
				setName((String)newValue);
				return;
			case TransmissionPackage.TRANSMITTER__TRANSMITTER_TYPE:
				setTransmitterType((String)newValue);
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
			case TransmissionPackage.TRANSMITTER__CREATED_STAMP:
				setCreatedStamp(CREATED_STAMP_EDEFAULT);
				return;
			case TransmissionPackage.TRANSMITTER__CREATED_TX_STAMP:
				setCreatedTxStamp(CREATED_TX_STAMP_EDEFAULT);
				return;
			case TransmissionPackage.TRANSMITTER__LAST_UPDATED_STAMP:
				setLastUpdatedStamp(LAST_UPDATED_STAMP_EDEFAULT);
				return;
			case TransmissionPackage.TRANSMITTER__LAST_UPDATED_TX_STAMP:
				setLastUpdatedTxStamp(LAST_UPDATED_TX_STAMP_EDEFAULT);
				return;
			case TransmissionPackage.TRANSMITTER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TransmissionPackage.TRANSMITTER__TRANSMITTER_TYPE:
				setTransmitterType(TRANSMITTER_TYPE_EDEFAULT);
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
			case TransmissionPackage.TRANSMITTER__CREATED_STAMP:
				return CREATED_STAMP_EDEFAULT == null ? createdStamp != null : !CREATED_STAMP_EDEFAULT.equals(createdStamp);
			case TransmissionPackage.TRANSMITTER__CREATED_TX_STAMP:
				return CREATED_TX_STAMP_EDEFAULT == null ? createdTxStamp != null : !CREATED_TX_STAMP_EDEFAULT.equals(createdTxStamp);
			case TransmissionPackage.TRANSMITTER__LAST_UPDATED_STAMP:
				return LAST_UPDATED_STAMP_EDEFAULT == null ? lastUpdatedStamp != null : !LAST_UPDATED_STAMP_EDEFAULT.equals(lastUpdatedStamp);
			case TransmissionPackage.TRANSMITTER__LAST_UPDATED_TX_STAMP:
				return LAST_UPDATED_TX_STAMP_EDEFAULT == null ? lastUpdatedTxStamp != null : !LAST_UPDATED_TX_STAMP_EDEFAULT.equals(lastUpdatedTxStamp);
			case TransmissionPackage.TRANSMITTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TransmissionPackage.TRANSMITTER__TRANSMITTER_TYPE:
				return TRANSMITTER_TYPE_EDEFAULT == null ? transmitterType != null : !TRANSMITTER_TYPE_EDEFAULT.equals(transmitterType);
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
				case TransmissionPackage.TRANSMITTER__CREATED_STAMP: return EntityPackage.ENTITY_INFO__CREATED_STAMP;
				case TransmissionPackage.TRANSMITTER__CREATED_TX_STAMP: return EntityPackage.ENTITY_INFO__CREATED_TX_STAMP;
				case TransmissionPackage.TRANSMITTER__LAST_UPDATED_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP;
				case TransmissionPackage.TRANSMITTER__LAST_UPDATED_TX_STAMP: return EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP;
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
				case EntityPackage.ENTITY_INFO__CREATED_STAMP: return TransmissionPackage.TRANSMITTER__CREATED_STAMP;
				case EntityPackage.ENTITY_INFO__CREATED_TX_STAMP: return TransmissionPackage.TRANSMITTER__CREATED_TX_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_STAMP: return TransmissionPackage.TRANSMITTER__LAST_UPDATED_STAMP;
				case EntityPackage.ENTITY_INFO__LAST_UPDATED_TX_STAMP: return TransmissionPackage.TRANSMITTER__LAST_UPDATED_TX_STAMP;
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
		result.append(", transmitterType: ");
		result.append(transmitterType);
		result.append(')');
		return result.toString();
	}

} //TransmitterImpl
