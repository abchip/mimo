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
import org.abchip.mimo.biz.shipment.shipment.Shipment;
import org.abchip.mimo.biz.shipment.shipment.ShipmentContactMech;
import org.abchip.mimo.biz.shipment.shipment.ShipmentContactMechType;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

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
	 * The cached value of the '{@link #getShipmentId() <em>Shipment Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentId()
	 * @generated
	 * @ordered
	 */
	protected Shipment shipmentId;

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
		contactMechId = newContactMechId;
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
		shipmentContactMechTypeId = newShipmentContactMechTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shipment getShipmentId() {
		if (shipmentId != null && ((EObject)shipmentId).eIsProxy()) {
			InternalEObject oldShipmentId = (InternalEObject)shipmentId;
			shipmentId = (Shipment)eResolveProxy(oldShipmentId);
			if (shipmentId != oldShipmentId) {
			}
		}
		return shipmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shipment basicGetShipmentId() {
		return shipmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentId(Shipment newShipmentId) {
		shipmentId = newShipmentId;
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
				if (resolve) return getShipmentId();
				return basicGetShipmentId();
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
				setShipmentId((Shipment)newValue);
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
				setShipmentId((Shipment)null);
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
				return shipmentId != null;
			case Shipment_Package.SHIPMENT_CONTACT_MECH__CONTACT_MECH_ID:
				return contactMechId != null;
			case Shipment_Package.SHIPMENT_CONTACT_MECH__SHIPMENT_CONTACT_MECH_TYPE_ID:
				return shipmentContactMechTypeId != null;
		}
		return super.eIsSet(featureID);
	}

} //ShipmentContactMechImpl
