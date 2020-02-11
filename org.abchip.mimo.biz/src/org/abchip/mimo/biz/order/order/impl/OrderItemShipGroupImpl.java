/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.order.order.OrderItemShipGroup;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.abchip.mimo.biz.party.agreement.Agreement;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.shipment.shipment.ShipmentMethodType;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Item Ship Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGroupImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGroupImpl#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGroupImpl#getCarrierPartyId <em>Carrier Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGroupImpl#getCarrierRoleTypeId <em>Carrier Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGroupImpl#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGroupImpl#getEstimatedDeliveryDate <em>Estimated Delivery Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGroupImpl#getEstimatedShipDate <em>Estimated Ship Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGroupImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGroupImpl#getGiftMessage <em>Gift Message</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGroupImpl#isIsGift <em>Is Gift</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGroupImpl#isMaySplit <em>May Split</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGroupImpl#getShipAfterDate <em>Ship After Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGroupImpl#getShipByDate <em>Ship By Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGroupImpl#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGroupImpl#getShippingInstructions <em>Shipping Instructions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGroupImpl#getSupplierAgreementId <em>Supplier Agreement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGroupImpl#getSupplierPartyId <em>Supplier Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGroupImpl#getTelecomContactMechId <em>Telecom Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGroupImpl#getTrackingNumber <em>Tracking Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemShipGroupImpl#getVendorPartyId <em>Vendor Party Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderItemShipGroupImpl extends BizEntityImpl implements OrderItemShipGroup {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderItemShipGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getCarrierPartyId() {
		return (Party)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__CARRIER_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierPartyId(Party newCarrierPartyId) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__CARRIER_PARTY_ID, newCarrierPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCarrierRoleTypeId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__CARRIER_ROLE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierRoleTypeId(String newCarrierRoleTypeId) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__CARRIER_ROLE_TYPE_ID, newCarrierRoleTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getContactMechId() {
		return (ContactMech)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__CONTACT_MECH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(ContactMech newContactMechId) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__CONTACT_MECH_ID, newContactMechId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedDeliveryDate() {
		return (Date)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__ESTIMATED_DELIVERY_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedDeliveryDate(Date newEstimatedDeliveryDate) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__ESTIMATED_DELIVERY_DATE, newEstimatedDeliveryDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedShipDate() {
		return (Date)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__ESTIMATED_SHIP_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedShipDate(Date newEstimatedShipDate) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__ESTIMATED_SHIP_DATE, newEstimatedShipDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getFacilityId() {
		return (Facility)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__FACILITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(Facility newFacilityId) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__FACILITY_ID, newFacilityId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGiftMessage() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__GIFT_MESSAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGiftMessage(String newGiftMessage) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__GIFT_MESSAGE, newGiftMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsGift() {
		return (Boolean)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__IS_GIFT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsGift(boolean newIsGift) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__IS_GIFT, newIsGift);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMaySplit() {
		return (Boolean)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__MAY_SPLIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaySplit(boolean newMaySplit) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__MAY_SPLIT, newMaySplit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeader getOrderId() {
		return (OrderHeader)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__ORDER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(OrderHeader newOrderId) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__ORDER_ID, newOrderId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getShipAfterDate() {
		return (Date)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__SHIP_AFTER_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipAfterDate(Date newShipAfterDate) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__SHIP_AFTER_DATE, newShipAfterDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getShipByDate() {
		return (Date)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__SHIP_BY_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipByDate(Date newShipByDate) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__SHIP_BY_DATE, newShipByDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipGroupSeqId() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__SHIP_GROUP_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipGroupSeqId(String newShipGroupSeqId) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__SHIP_GROUP_SEQ_ID, newShipGroupSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentMethodType getShipmentMethodTypeId() {
		return (ShipmentMethodType)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__SHIPMENT_METHOD_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentMethodTypeId(ShipmentMethodType newShipmentMethodTypeId) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__SHIPMENT_METHOD_TYPE_ID, newShipmentMethodTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShippingInstructions() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__SHIPPING_INSTRUCTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShippingInstructions(String newShippingInstructions) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__SHIPPING_INSTRUCTIONS, newShippingInstructions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agreement getSupplierAgreementId() {
		return (Agreement)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__SUPPLIER_AGREEMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierAgreementId(Agreement newSupplierAgreementId) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__SUPPLIER_AGREEMENT_ID, newSupplierAgreementId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getSupplierPartyId() {
		return (Party)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__SUPPLIER_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierPartyId(Party newSupplierPartyId) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__SUPPLIER_PARTY_ID, newSupplierPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getTelecomContactMechId() {
		return (ContactMech)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__TELECOM_CONTACT_MECH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTelecomContactMechId(ContactMech newTelecomContactMechId) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__TELECOM_CONTACT_MECH_ID, newTelecomContactMechId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrackingNumber() {
		return (String)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__TRACKING_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackingNumber(String newTrackingNumber) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__TRACKING_NUMBER, newTrackingNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getVendorPartyId() {
		return (Party)eGet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__VENDOR_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendorPartyId(Party newVendorPartyId) {
		eSet(OrderPackage.Literals.ORDER_ITEM_SHIP_GROUP__VENDOR_PARTY_ID, newVendorPartyId);
	}

} //OrderItemShipGroupImpl
