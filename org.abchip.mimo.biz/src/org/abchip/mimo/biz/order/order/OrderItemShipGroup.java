/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.party.agreement.Agreement;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.shipment.shipment.ShipmentMethodType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Item Ship Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getCarrierPartyId <em>Carrier Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getCarrierRoleTypeId <em>Carrier Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getEstimatedDeliveryDate <em>Estimated Delivery Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getEstimatedShipDate <em>Estimated Ship Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getGiftMessage <em>Gift Message</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#isIsGift <em>Is Gift</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#isMaySplit <em>May Split</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getShipAfterDate <em>Ship After Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getShipByDate <em>Ship By Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getShippingInstructions <em>Shipping Instructions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getSupplierAgreementId <em>Supplier Agreement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getSupplierPartyId <em>Supplier Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getTelecomContactMechId <em>Telecom Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getTrackingNumber <em>Tracking Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getVendorPartyId <em>Vendor Party Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGroup()
 * @model
 * @generated
 */
public interface OrderItemShipGroup extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Carrier Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carrier Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Party Id</em>' reference.
	 * @see #setCarrierPartyId(Party)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGroup_CarrierPartyId()
	 * @model keys="partyId"
	 *        annotation="mimo-ent-slot audit='true'"
	 * @generated
	 */
	Party getCarrierPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getCarrierPartyId <em>Carrier Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Party Id</em>' reference.
	 * @see #getCarrierPartyId()
	 * @generated
	 */
	void setCarrierPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Carrier Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carrier Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Role Type Id</em>' attribute.
	 * @see #setCarrierRoleTypeId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGroup_CarrierRoleTypeId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCarrierRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getCarrierRoleTypeId <em>Carrier Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Role Type Id</em>' attribute.
	 * @see #getCarrierRoleTypeId()
	 * @generated
	 */
	void setCarrierRoleTypeId(String value);

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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGroup_ContactMechId()
	 * @model keys="contactMechId"
	 * @generated
	 */
	ContactMech getContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getContactMechId <em>Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Id</em>' reference.
	 * @see #getContactMechId()
	 * @generated
	 */
	void setContactMechId(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Estimated Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Delivery Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Delivery Date</em>' attribute.
	 * @see #setEstimatedDeliveryDate(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGroup_EstimatedDeliveryDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedDeliveryDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getEstimatedDeliveryDate <em>Estimated Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Delivery Date</em>' attribute.
	 * @see #getEstimatedDeliveryDate()
	 * @generated
	 */
	void setEstimatedDeliveryDate(Date value);

	/**
	 * Returns the value of the '<em><b>Estimated Ship Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Ship Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Ship Date</em>' attribute.
	 * @see #setEstimatedShipDate(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGroup_EstimatedShipDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedShipDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getEstimatedShipDate <em>Estimated Ship Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Ship Date</em>' attribute.
	 * @see #getEstimatedShipDate()
	 * @generated
	 */
	void setEstimatedShipDate(Date value);

	/**
	 * Returns the value of the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Id</em>' reference.
	 * @see #setFacilityId(Facility)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGroup_FacilityId()
	 * @model keys="facilityId"
	 * @generated
	 */
	Facility getFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getFacilityId <em>Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Id</em>' reference.
	 * @see #getFacilityId()
	 * @generated
	 */
	void setFacilityId(Facility value);

	/**
	 * Returns the value of the '<em><b>Gift Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gift Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gift Message</em>' attribute.
	 * @see #setGiftMessage(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGroup_GiftMessage()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getGiftMessage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getGiftMessage <em>Gift Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gift Message</em>' attribute.
	 * @see #getGiftMessage()
	 * @generated
	 */
	void setGiftMessage(String value);

	/**
	 * Returns the value of the '<em><b>Is Gift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Gift</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Gift</em>' attribute.
	 * @see #setIsGift(boolean)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGroup_IsGift()
	 * @model
	 * @generated
	 */
	boolean isIsGift();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#isIsGift <em>Is Gift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Gift</em>' attribute.
	 * @see #isIsGift()
	 * @generated
	 */
	void setIsGift(boolean value);

	/**
	 * Returns the value of the '<em><b>May Split</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>May Split</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>May Split</em>' attribute.
	 * @see #setMaySplit(boolean)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGroup_MaySplit()
	 * @model
	 * @generated
	 */
	boolean isMaySplit();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#isMaySplit <em>May Split</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>May Split</em>' attribute.
	 * @see #isMaySplit()
	 * @generated
	 */
	void setMaySplit(boolean value);

	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' reference.
	 * @see #setOrderId(OrderHeader)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGroup_OrderId()
	 * @model keys="orderId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	OrderHeader getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getOrderId <em>Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' reference.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(OrderHeader value);

	/**
	 * Returns the value of the '<em><b>Ship After Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship After Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship After Date</em>' attribute.
	 * @see #setShipAfterDate(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGroup_ShipAfterDate()
	 * @model
	 * @generated
	 */
	Date getShipAfterDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getShipAfterDate <em>Ship After Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship After Date</em>' attribute.
	 * @see #getShipAfterDate()
	 * @generated
	 */
	void setShipAfterDate(Date value);

	/**
	 * Returns the value of the '<em><b>Ship By Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship By Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship By Date</em>' attribute.
	 * @see #setShipByDate(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGroup_ShipByDate()
	 * @model
	 * @generated
	 */
	Date getShipByDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getShipByDate <em>Ship By Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship By Date</em>' attribute.
	 * @see #getShipByDate()
	 * @generated
	 */
	void setShipByDate(Date value);

	/**
	 * Returns the value of the '<em><b>Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship Group Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship Group Seq Id</em>' attribute.
	 * @see #setShipGroupSeqId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGroup_ShipGroupSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getShipGroupSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getShipGroupSeqId <em>Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship Group Seq Id</em>' attribute.
	 * @see #getShipGroupSeqId()
	 * @generated
	 */
	void setShipGroupSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Shipment Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Method Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Method Type Id</em>' reference.
	 * @see #setShipmentMethodTypeId(ShipmentMethodType)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGroup_ShipmentMethodTypeId()
	 * @model keys="shipmentMethodTypeId"
	 *        annotation="mimo-ent-slot audit='true'"
	 * @generated
	 */
	ShipmentMethodType getShipmentMethodTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Method Type Id</em>' reference.
	 * @see #getShipmentMethodTypeId()
	 * @generated
	 */
	void setShipmentMethodTypeId(ShipmentMethodType value);

	/**
	 * Returns the value of the '<em><b>Shipping Instructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipping Instructions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipping Instructions</em>' attribute.
	 * @see #setShippingInstructions(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGroup_ShippingInstructions()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getShippingInstructions();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getShippingInstructions <em>Shipping Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipping Instructions</em>' attribute.
	 * @see #getShippingInstructions()
	 * @generated
	 */
	void setShippingInstructions(String value);

	/**
	 * Returns the value of the '<em><b>Supplier Agreement Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier Agreement Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Agreement Id</em>' reference.
	 * @see #setSupplierAgreementId(Agreement)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGroup_SupplierAgreementId()
	 * @model keys="agreementId"
	 * @generated
	 */
	Agreement getSupplierAgreementId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getSupplierAgreementId <em>Supplier Agreement Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Agreement Id</em>' reference.
	 * @see #getSupplierAgreementId()
	 * @generated
	 */
	void setSupplierAgreementId(Agreement value);

	/**
	 * Returns the value of the '<em><b>Supplier Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Party Id</em>' reference.
	 * @see #setSupplierPartyId(Party)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGroup_SupplierPartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getSupplierPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getSupplierPartyId <em>Supplier Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Party Id</em>' reference.
	 * @see #getSupplierPartyId()
	 * @generated
	 */
	void setSupplierPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Telecom Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telecom Contact Mech Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telecom Contact Mech Id</em>' reference.
	 * @see #setTelecomContactMechId(ContactMech)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGroup_TelecomContactMechId()
	 * @model keys="contactMechId"
	 * @generated
	 */
	ContactMech getTelecomContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getTelecomContactMechId <em>Telecom Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telecom Contact Mech Id</em>' reference.
	 * @see #getTelecomContactMechId()
	 * @generated
	 */
	void setTelecomContactMechId(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Tracking Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracking Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracking Number</em>' attribute.
	 * @see #setTrackingNumber(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGroup_TrackingNumber()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getTrackingNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getTrackingNumber <em>Tracking Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracking Number</em>' attribute.
	 * @see #getTrackingNumber()
	 * @generated
	 */
	void setTrackingNumber(String value);

	/**
	 * Returns the value of the '<em><b>Vendor Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Party Id</em>' reference.
	 * @see #setVendorPartyId(Party)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderItemShipGroup_VendorPartyId()
	 * @model keys="partyId"
	 *        annotation="mimo-ent-slot help='For use with multi-vendor stores, order will be split so that each ship group is associated with only one vendor (only if applicable)'"
	 * @generated
	 */
	Party getVendorPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderItemShipGroup#getVendorPartyId <em>Vendor Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Party Id</em>' reference.
	 * @see #getVendorPartyId()
	 * @generated
	 */
	void setVendorPartyId(Party value);

} // OrderItemShipGroup
