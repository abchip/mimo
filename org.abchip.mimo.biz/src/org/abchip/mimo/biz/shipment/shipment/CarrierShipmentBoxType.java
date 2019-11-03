/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Carrier Shipment Box Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.CarrierShipmentBoxType#getShipmentBoxTypeId <em>Shipment Box Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.CarrierShipmentBoxType#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.CarrierShipmentBoxType#getOversizeCode <em>Oversize Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.CarrierShipmentBoxType#getPackagingTypeCode <em>Packaging Type Code</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getCarrierShipmentBoxType()
 * @model
 * @generated
 */
public interface CarrierShipmentBoxType extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Oversize Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oversize Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oversize Code</em>' attribute.
	 * @see #setOversizeCode(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getCarrierShipmentBoxType_OversizeCode()
	 * @model
	 * @generated
	 */
	String getOversizeCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.CarrierShipmentBoxType#getOversizeCode <em>Oversize Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oversize Code</em>' attribute.
	 * @see #getOversizeCode()
	 * @generated
	 */
	void setOversizeCode(String value);

	/**
	 * Returns the value of the '<em><b>Packaging Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packaging Type Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packaging Type Code</em>' attribute.
	 * @see #setPackagingTypeCode(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getCarrierShipmentBoxType_PackagingTypeCode()
	 * @model
	 * @generated
	 */
	String getPackagingTypeCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.CarrierShipmentBoxType#getPackagingTypeCode <em>Packaging Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packaging Type Code</em>' attribute.
	 * @see #getPackagingTypeCode()
	 * @generated
	 */
	void setPackagingTypeCode(String value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getCarrierShipmentBoxType_PartyId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.CarrierShipmentBoxType#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Shipment Box Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Box Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Box Type Id</em>' attribute.
	 * @see #setShipmentBoxTypeId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getCarrierShipmentBoxType_ShipmentBoxTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentBoxType'"
	 * @generated
	 */
	String getShipmentBoxTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.CarrierShipmentBoxType#getShipmentBoxTypeId <em>Shipment Box Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Box Type Id</em>' attribute.
	 * @see #getShipmentBoxTypeId()
	 * @generated
	 */
	void setShipmentBoxTypeId(String value);

} // CarrierShipmentBoxType
