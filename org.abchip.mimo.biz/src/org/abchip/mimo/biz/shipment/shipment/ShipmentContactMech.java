/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment;

import org.abchip.mimo.biz.BizEntityTyped;

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
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentContactMech#getShipmentContactMechTypeId <em>Shipment Contact Mech Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentContactMech#getContactMechId <em>Contact Mech Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentContactMech()
 * @model
 * @generated
 */
public interface ShipmentContactMech extends BizEntityTyped<ShipmentContactMechType> {
	/**
	 * Returns the value of the '<em><b>Contact Mech Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Id</em>' attribute.
	 * @see #setContactMechId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentContactMech_ContactMechId()
	 * @model annotation="mimo-ent-domain frame='ContactMech'"
	 * @generated
	 */
	String getContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentContactMech#getContactMechId <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Id</em>' attribute.
	 * @see #getContactMechId()
	 * @generated
	 */
	void setContactMechId(String value);

	/**
	 * Returns the value of the '<em><b>Shipment Contact Mech Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Contact Mech Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Contact Mech Type Id</em>' attribute.
	 * @see #setShipmentContactMechTypeId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentContactMech_ShipmentContactMechTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentContactMechType'"
	 * @generated
	 */
	String getShipmentContactMechTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentContactMech#getShipmentContactMechTypeId <em>Shipment Contact Mech Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Contact Mech Type Id</em>' attribute.
	 * @see #getShipmentContactMechTypeId()
	 * @generated
	 */
	void setShipmentContactMechTypeId(String value);

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
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Shipment'"
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
