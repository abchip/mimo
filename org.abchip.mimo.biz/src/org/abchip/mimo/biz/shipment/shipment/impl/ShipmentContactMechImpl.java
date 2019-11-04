/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment.impl;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.shipment.shipment.ShipmentContactMech;
import org.abchip.mimo.biz.shipment.shipment.ShipmentContactMechType;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Contact Mech</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentContactMechImpl#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentContactMechImpl#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentContactMechImpl#getShipmentContactMechTypeId <em>Shipment Contact Mech Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentContactMechImpl extends BizEntityTypedImpl<ShipmentContactMechType> implements ShipmentContactMech {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getShipmentId() <em>Shipment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentId() <em>Shipment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentId = SHIPMENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected ContactMech contactMechId;

	/**
	 * The cached value of the '{@link #getShipmentContactMechTypeId() <em>Shipment Contact Mech Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentContactMechTypeId()
	 * @generated
	 * @ordered
	 */
	protected ShipmentContactMechType shipmentContactMechTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentContactMechImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shipment_Package.Literals.SHIPMENT_CONTACT_MECH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getContactMechId() {
		if (contactMechId != null && ((EObject)contactMechId).eIsProxy()) {
			InternalEObject oldContactMechId = (InternalEObject)contactMechId;
			contactMechId = (ContactMech)eResolveProxy(oldContactMechId);
			if (contactMechId != oldContactMechId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_CONTACT_MECH__CONTACT_MECH_ID, oldContactMechId, contactMechId));
			}
		}
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMech basicGetContactMechId() {
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(ContactMech newContactMechId) {
		ContactMech oldContactMechId = contactMechId;
		contactMechId = newContactMechId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_CONTACT_MECH__CONTACT_MECH_ID, oldContactMechId, contactMechId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentContactMechType getShipmentContactMechTypeId() {
		if (shipmentContactMechTypeId != null && ((EObject)shipmentContactMechTypeId).eIsProxy()) {
			InternalEObject oldShipmentContactMechTypeId = (InternalEObject)shipmentContactMechTypeId;
			shipmentContactMechTypeId = (ShipmentContactMechType)eResolveProxy(oldShipmentContactMechTypeId);
			if (shipmentContactMechTypeId != oldShipmentContactMechTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_CONTACT_MECH__SHIPMENT_CONTACT_MECH_TYPE_ID, oldShipmentContactMechTypeId, shipmentContactMechTypeId));
			}
		}
		return shipmentContactMechTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipmentContactMechType basicGetShipmentContactMechTypeId() {
		return shipmentContactMechTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentContactMechTypeId(ShipmentContactMechType newShipmentContactMechTypeId) {
		ShipmentContactMechType oldShipmentContactMechTypeId = shipmentContactMechTypeId;
		shipmentContactMechTypeId = newShipmentContactMechTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_CONTACT_MECH__SHIPMENT_CONTACT_MECH_TYPE_ID, oldShipmentContactMechTypeId, shipmentContactMechTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentId() {
		return shipmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentId(String newShipmentId) {
		String oldShipmentId = shipmentId;
		shipmentId = newShipmentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_CONTACT_MECH__SHIPMENT_ID, oldShipmentId, shipmentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shipment_Package.SHIPMENT_CONTACT_MECH__SHIPMENT_ID:
				return getShipmentId();
			case Shipment_Package.SHIPMENT_CONTACT_MECH__CONTACT_MECH_ID:
				if (resolve) return getContactMechId();
				return basicGetContactMechId();
			case Shipment_Package.SHIPMENT_CONTACT_MECH__SHIPMENT_CONTACT_MECH_TYPE_ID:
				if (resolve) return getShipmentContactMechTypeId();
				return basicGetShipmentContactMechTypeId();
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
			case Shipment_Package.SHIPMENT_CONTACT_MECH__SHIPMENT_ID:
				setShipmentId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_CONTACT_MECH__CONTACT_MECH_ID:
				setContactMechId((ContactMech)newValue);
				return;
			case Shipment_Package.SHIPMENT_CONTACT_MECH__SHIPMENT_CONTACT_MECH_TYPE_ID:
				setShipmentContactMechTypeId((ShipmentContactMechType)newValue);
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
			case Shipment_Package.SHIPMENT_CONTACT_MECH__SHIPMENT_ID:
				setShipmentId(SHIPMENT_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_CONTACT_MECH__CONTACT_MECH_ID:
				setContactMechId((ContactMech)null);
				return;
			case Shipment_Package.SHIPMENT_CONTACT_MECH__SHIPMENT_CONTACT_MECH_TYPE_ID:
				setShipmentContactMechTypeId((ShipmentContactMechType)null);
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
			case Shipment_Package.SHIPMENT_CONTACT_MECH__SHIPMENT_ID:
				return SHIPMENT_ID_EDEFAULT == null ? shipmentId != null : !SHIPMENT_ID_EDEFAULT.equals(shipmentId);
			case Shipment_Package.SHIPMENT_CONTACT_MECH__CONTACT_MECH_ID:
				return contactMechId != null;
			case Shipment_Package.SHIPMENT_CONTACT_MECH__SHIPMENT_CONTACT_MECH_TYPE_ID:
				return shipmentContactMechTypeId != null;
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
		result.append(" (shipmentId: ");
		result.append(shipmentId);
		result.append(')');
		return result.toString();
	}

} //ShipmentContactMechImpl
