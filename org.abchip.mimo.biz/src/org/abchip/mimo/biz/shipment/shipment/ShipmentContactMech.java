/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment;

import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.party.contact.ContactMech;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Contact Mech</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentContactMech#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentContactMech#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentContactMech#getShipmentContactMechTypeId <em>Shipment Contact Mech Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentContactMech()
 * @model
 * @generated
 */
public interface ShipmentContactMech extends BizEntityTyped<ShipmentContactMechType> {
	/**
	 * Returns the value of the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Id</em>' reference.
	 * @see #setContactMechId(ContactMech)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentContactMech_ContactMechId()
	 * @model keys="contactMechId"
	 * @generated
	 */
	ContactMech getContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentContactMech#getContactMechId <em>Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Id</em>' reference.
	 * @see #getContactMechId()
	 * @generated
	 */
	void setContactMechId(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Shipment Contact Mech Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Contact Mech Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Contact Mech Type Id</em>' reference.
	 * @see #setShipmentContactMechTypeId(ShipmentContactMechType)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentContactMech_ShipmentContactMechTypeId()
	 * @model keys="shipmentContactMechTypeId"
	 * @generated
	 */
	ShipmentContactMechType getShipmentContactMechTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentContactMech#getShipmentContactMechTypeId <em>Shipment Contact Mech Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Contact Mech Type Id</em>' reference.
	 * @see #getShipmentContactMechTypeId()
	 * @generated
	 */
	void setShipmentContactMechTypeId(ShipmentContactMechType value);

	/**
	 * Returns the value of the '<em><b>Shipment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Id</em>' attribute.
	 * @see #setShipmentId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentContactMech_ShipmentId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getShipmentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentContactMech#getShipmentId <em>Shipment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Id</em>' attribute.
	 * @see #getShipmentId()
	 * @generated
	 */
	void setShipmentId(String value);

} // ShipmentContactMech