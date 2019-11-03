/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.order.OrderItemShipGroup;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The default value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected String orderId = ORDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipGroupSeqId() <em>Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipGroupSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIP_GROUP_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipGroupSeqId() <em>Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipGroupSeqId()
	 * @generated
	 * @ordered
	 */
	protected String shipGroupSeqId = SHIP_GROUP_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCarrierPartyId() <em>Carrier Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String CARRIER_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarrierPartyId() <em>Carrier Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierPartyId()
	 * @generated
	 * @ordered
	 */
	protected String carrierPartyId = CARRIER_PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCarrierRoleTypeId() <em>Carrier Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String CARRIER_ROLE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarrierRoleTypeId() <em>Carrier Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected String carrierRoleTypeId = CARRIER_ROLE_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_MECH_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected String contactMechId = CONTACT_MECH_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedDeliveryDate() <em>Estimated Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ESTIMATED_DELIVERY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedDeliveryDate() <em>Estimated Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected Date estimatedDeliveryDate = ESTIMATED_DELIVERY_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedShipDate() <em>Estimated Ship Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedShipDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ESTIMATED_SHIP_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedShipDate() <em>Estimated Ship Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedShipDate()
	 * @generated
	 * @ordered
	 */
	protected Date estimatedShipDate = ESTIMATED_SHIP_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFacilityId() <em>Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected static final String FACILITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFacilityId() <em>Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected String facilityId = FACILITY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGiftMessage() <em>Gift Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGiftMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String GIFT_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGiftMessage() <em>Gift Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGiftMessage()
	 * @generated
	 * @ordered
	 */
	protected String giftMessage = GIFT_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsGift() <em>Is Gift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGift()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_GIFT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsGift() <em>Is Gift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGift()
	 * @generated
	 * @ordered
	 */
	protected boolean isGift = IS_GIFT_EDEFAULT;

	/**
	 * The default value of the '{@link #isMaySplit() <em>May Split</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaySplit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAY_SPLIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMaySplit() <em>May Split</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaySplit()
	 * @generated
	 * @ordered
	 */
	protected boolean maySplit = MAY_SPLIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipAfterDate() <em>Ship After Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipAfterDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SHIP_AFTER_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipAfterDate() <em>Ship After Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipAfterDate()
	 * @generated
	 * @ordered
	 */
	protected Date shipAfterDate = SHIP_AFTER_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipByDate() <em>Ship By Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipByDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SHIP_BY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipByDate() <em>Ship By Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipByDate()
	 * @generated
	 * @ordered
	 */
	protected Date shipByDate = SHIP_BY_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipmentMethodTypeId() <em>Shipment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_METHOD_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentMethodTypeId() <em>Shipment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentMethodTypeId = SHIPMENT_METHOD_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getShippingInstructions() <em>Shipping Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingInstructions()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPPING_INSTRUCTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShippingInstructions() <em>Shipping Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingInstructions()
	 * @generated
	 * @ordered
	 */
	protected String shippingInstructions = SHIPPING_INSTRUCTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupplierAgreementId() <em>Supplier Agreement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierAgreementId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_AGREEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplierAgreementId() <em>Supplier Agreement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierAgreementId()
	 * @generated
	 * @ordered
	 */
	protected String supplierAgreementId = SUPPLIER_AGREEMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupplierPartyId() <em>Supplier Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplierPartyId() <em>Supplier Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierPartyId()
	 * @generated
	 * @ordered
	 */
	protected String supplierPartyId = SUPPLIER_PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelecomContactMechId() <em>Telecom Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecomContactMechId()
	 * @generated
	 * @ordered
	 */
	protected static final String TELECOM_CONTACT_MECH_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelecomContactMechId() <em>Telecom Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecomContactMechId()
	 * @generated
	 * @ordered
	 */
	protected String telecomContactMechId = TELECOM_CONTACT_MECH_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrackingNumber() <em>Tracking Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackingNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACKING_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrackingNumber() <em>Tracking Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackingNumber()
	 * @generated
	 * @ordered
	 */
	protected String trackingNumber = TRACKING_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendorPartyId() <em>Vendor Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendorPartyId() <em>Vendor Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorPartyId()
	 * @generated
	 * @ordered
	 */
	protected String vendorPartyId = VENDOR_PARTY_ID_EDEFAULT;

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
	public String getCarrierPartyId() {
		return carrierPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierPartyId(String newCarrierPartyId) {
		String oldCarrierPartyId = carrierPartyId;
		carrierPartyId = newCarrierPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GROUP__CARRIER_PARTY_ID, oldCarrierPartyId, carrierPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCarrierRoleTypeId() {
		return carrierRoleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierRoleTypeId(String newCarrierRoleTypeId) {
		String oldCarrierRoleTypeId = carrierRoleTypeId;
		carrierRoleTypeId = newCarrierRoleTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GROUP__CARRIER_ROLE_TYPE_ID, oldCarrierRoleTypeId, carrierRoleTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactMechId() {
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(String newContactMechId) {
		String oldContactMechId = contactMechId;
		contactMechId = newContactMechId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GROUP__CONTACT_MECH_ID, oldContactMechId, contactMechId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedDeliveryDate() {
		return estimatedDeliveryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedDeliveryDate(Date newEstimatedDeliveryDate) {
		Date oldEstimatedDeliveryDate = estimatedDeliveryDate;
		estimatedDeliveryDate = newEstimatedDeliveryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GROUP__ESTIMATED_DELIVERY_DATE, oldEstimatedDeliveryDate, estimatedDeliveryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedShipDate() {
		return estimatedShipDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedShipDate(Date newEstimatedShipDate) {
		Date oldEstimatedShipDate = estimatedShipDate;
		estimatedShipDate = newEstimatedShipDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GROUP__ESTIMATED_SHIP_DATE, oldEstimatedShipDate, estimatedShipDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFacilityId() {
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(String newFacilityId) {
		String oldFacilityId = facilityId;
		facilityId = newFacilityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GROUP__FACILITY_ID, oldFacilityId, facilityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGiftMessage() {
		return giftMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGiftMessage(String newGiftMessage) {
		String oldGiftMessage = giftMessage;
		giftMessage = newGiftMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GROUP__GIFT_MESSAGE, oldGiftMessage, giftMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsGift() {
		return isGift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsGift(boolean newIsGift) {
		boolean oldIsGift = isGift;
		isGift = newIsGift;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GROUP__IS_GIFT, oldIsGift, isGift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMaySplit() {
		return maySplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaySplit(boolean newMaySplit) {
		boolean oldMaySplit = maySplit;
		maySplit = newMaySplit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GROUP__MAY_SPLIT, oldMaySplit, maySplit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(String newOrderId) {
		String oldOrderId = orderId;
		orderId = newOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GROUP__ORDER_ID, oldOrderId, orderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getShipAfterDate() {
		return shipAfterDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipAfterDate(Date newShipAfterDate) {
		Date oldShipAfterDate = shipAfterDate;
		shipAfterDate = newShipAfterDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GROUP__SHIP_AFTER_DATE, oldShipAfterDate, shipAfterDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getShipByDate() {
		return shipByDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipByDate(Date newShipByDate) {
		Date oldShipByDate = shipByDate;
		shipByDate = newShipByDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GROUP__SHIP_BY_DATE, oldShipByDate, shipByDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipGroupSeqId() {
		return shipGroupSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipGroupSeqId(String newShipGroupSeqId) {
		String oldShipGroupSeqId = shipGroupSeqId;
		shipGroupSeqId = newShipGroupSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GROUP__SHIP_GROUP_SEQ_ID, oldShipGroupSeqId, shipGroupSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentMethodTypeId() {
		return shipmentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentMethodTypeId(String newShipmentMethodTypeId) {
		String oldShipmentMethodTypeId = shipmentMethodTypeId;
		shipmentMethodTypeId = newShipmentMethodTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GROUP__SHIPMENT_METHOD_TYPE_ID, oldShipmentMethodTypeId, shipmentMethodTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShippingInstructions() {
		return shippingInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShippingInstructions(String newShippingInstructions) {
		String oldShippingInstructions = shippingInstructions;
		shippingInstructions = newShippingInstructions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GROUP__SHIPPING_INSTRUCTIONS, oldShippingInstructions, shippingInstructions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupplierAgreementId() {
		return supplierAgreementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierAgreementId(String newSupplierAgreementId) {
		String oldSupplierAgreementId = supplierAgreementId;
		supplierAgreementId = newSupplierAgreementId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GROUP__SUPPLIER_AGREEMENT_ID, oldSupplierAgreementId, supplierAgreementId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupplierPartyId() {
		return supplierPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierPartyId(String newSupplierPartyId) {
		String oldSupplierPartyId = supplierPartyId;
		supplierPartyId = newSupplierPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GROUP__SUPPLIER_PARTY_ID, oldSupplierPartyId, supplierPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTelecomContactMechId() {
		return telecomContactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTelecomContactMechId(String newTelecomContactMechId) {
		String oldTelecomContactMechId = telecomContactMechId;
		telecomContactMechId = newTelecomContactMechId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GROUP__TELECOM_CONTACT_MECH_ID, oldTelecomContactMechId, telecomContactMechId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrackingNumber() {
		return trackingNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackingNumber(String newTrackingNumber) {
		String oldTrackingNumber = trackingNumber;
		trackingNumber = newTrackingNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GROUP__TRACKING_NUMBER, oldTrackingNumber, trackingNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVendorPartyId() {
		return vendorPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendorPartyId(String newVendorPartyId) {
		String oldVendorPartyId = vendorPartyId;
		vendorPartyId = newVendorPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_SHIP_GROUP__VENDOR_PARTY_ID, oldVendorPartyId, vendorPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__ORDER_ID:
				return getOrderId();
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SHIP_GROUP_SEQ_ID:
				return getShipGroupSeqId();
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__CARRIER_PARTY_ID:
				return getCarrierPartyId();
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__CARRIER_ROLE_TYPE_ID:
				return getCarrierRoleTypeId();
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__CONTACT_MECH_ID:
				return getContactMechId();
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__ESTIMATED_DELIVERY_DATE:
				return getEstimatedDeliveryDate();
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__ESTIMATED_SHIP_DATE:
				return getEstimatedShipDate();
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__FACILITY_ID:
				return getFacilityId();
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__GIFT_MESSAGE:
				return getGiftMessage();
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__IS_GIFT:
				return isIsGift();
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__MAY_SPLIT:
				return isMaySplit();
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SHIP_AFTER_DATE:
				return getShipAfterDate();
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SHIP_BY_DATE:
				return getShipByDate();
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SHIPMENT_METHOD_TYPE_ID:
				return getShipmentMethodTypeId();
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SHIPPING_INSTRUCTIONS:
				return getShippingInstructions();
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SUPPLIER_AGREEMENT_ID:
				return getSupplierAgreementId();
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SUPPLIER_PARTY_ID:
				return getSupplierPartyId();
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__TELECOM_CONTACT_MECH_ID:
				return getTelecomContactMechId();
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__TRACKING_NUMBER:
				return getTrackingNumber();
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__VENDOR_PARTY_ID:
				return getVendorPartyId();
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
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__ORDER_ID:
				setOrderId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SHIP_GROUP_SEQ_ID:
				setShipGroupSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__CARRIER_PARTY_ID:
				setCarrierPartyId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__CARRIER_ROLE_TYPE_ID:
				setCarrierRoleTypeId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__CONTACT_MECH_ID:
				setContactMechId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__ESTIMATED_DELIVERY_DATE:
				setEstimatedDeliveryDate((Date)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__ESTIMATED_SHIP_DATE:
				setEstimatedShipDate((Date)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__FACILITY_ID:
				setFacilityId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__GIFT_MESSAGE:
				setGiftMessage((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__IS_GIFT:
				setIsGift((Boolean)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__MAY_SPLIT:
				setMaySplit((Boolean)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SHIP_AFTER_DATE:
				setShipAfterDate((Date)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SHIP_BY_DATE:
				setShipByDate((Date)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SHIPMENT_METHOD_TYPE_ID:
				setShipmentMethodTypeId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SHIPPING_INSTRUCTIONS:
				setShippingInstructions((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SUPPLIER_AGREEMENT_ID:
				setSupplierAgreementId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SUPPLIER_PARTY_ID:
				setSupplierPartyId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__TELECOM_CONTACT_MECH_ID:
				setTelecomContactMechId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__TRACKING_NUMBER:
				setTrackingNumber((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__VENDOR_PARTY_ID:
				setVendorPartyId((String)newValue);
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
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SHIP_GROUP_SEQ_ID:
				setShipGroupSeqId(SHIP_GROUP_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__CARRIER_PARTY_ID:
				setCarrierPartyId(CARRIER_PARTY_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__CARRIER_ROLE_TYPE_ID:
				setCarrierRoleTypeId(CARRIER_ROLE_TYPE_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__CONTACT_MECH_ID:
				setContactMechId(CONTACT_MECH_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__ESTIMATED_DELIVERY_DATE:
				setEstimatedDeliveryDate(ESTIMATED_DELIVERY_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__ESTIMATED_SHIP_DATE:
				setEstimatedShipDate(ESTIMATED_SHIP_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__FACILITY_ID:
				setFacilityId(FACILITY_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__GIFT_MESSAGE:
				setGiftMessage(GIFT_MESSAGE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__IS_GIFT:
				setIsGift(IS_GIFT_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__MAY_SPLIT:
				setMaySplit(MAY_SPLIT_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SHIP_AFTER_DATE:
				setShipAfterDate(SHIP_AFTER_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SHIP_BY_DATE:
				setShipByDate(SHIP_BY_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SHIPMENT_METHOD_TYPE_ID:
				setShipmentMethodTypeId(SHIPMENT_METHOD_TYPE_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SHIPPING_INSTRUCTIONS:
				setShippingInstructions(SHIPPING_INSTRUCTIONS_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SUPPLIER_AGREEMENT_ID:
				setSupplierAgreementId(SUPPLIER_AGREEMENT_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SUPPLIER_PARTY_ID:
				setSupplierPartyId(SUPPLIER_PARTY_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__TELECOM_CONTACT_MECH_ID:
				setTelecomContactMechId(TELECOM_CONTACT_MECH_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__TRACKING_NUMBER:
				setTrackingNumber(TRACKING_NUMBER_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__VENDOR_PARTY_ID:
				setVendorPartyId(VENDOR_PARTY_ID_EDEFAULT);
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
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__ORDER_ID:
				return ORDER_ID_EDEFAULT == null ? orderId != null : !ORDER_ID_EDEFAULT.equals(orderId);
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SHIP_GROUP_SEQ_ID:
				return SHIP_GROUP_SEQ_ID_EDEFAULT == null ? shipGroupSeqId != null : !SHIP_GROUP_SEQ_ID_EDEFAULT.equals(shipGroupSeqId);
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__CARRIER_PARTY_ID:
				return CARRIER_PARTY_ID_EDEFAULT == null ? carrierPartyId != null : !CARRIER_PARTY_ID_EDEFAULT.equals(carrierPartyId);
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__CARRIER_ROLE_TYPE_ID:
				return CARRIER_ROLE_TYPE_ID_EDEFAULT == null ? carrierRoleTypeId != null : !CARRIER_ROLE_TYPE_ID_EDEFAULT.equals(carrierRoleTypeId);
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__CONTACT_MECH_ID:
				return CONTACT_MECH_ID_EDEFAULT == null ? contactMechId != null : !CONTACT_MECH_ID_EDEFAULT.equals(contactMechId);
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__ESTIMATED_DELIVERY_DATE:
				return ESTIMATED_DELIVERY_DATE_EDEFAULT == null ? estimatedDeliveryDate != null : !ESTIMATED_DELIVERY_DATE_EDEFAULT.equals(estimatedDeliveryDate);
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__ESTIMATED_SHIP_DATE:
				return ESTIMATED_SHIP_DATE_EDEFAULT == null ? estimatedShipDate != null : !ESTIMATED_SHIP_DATE_EDEFAULT.equals(estimatedShipDate);
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__FACILITY_ID:
				return FACILITY_ID_EDEFAULT == null ? facilityId != null : !FACILITY_ID_EDEFAULT.equals(facilityId);
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__GIFT_MESSAGE:
				return GIFT_MESSAGE_EDEFAULT == null ? giftMessage != null : !GIFT_MESSAGE_EDEFAULT.equals(giftMessage);
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__IS_GIFT:
				return isGift != IS_GIFT_EDEFAULT;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__MAY_SPLIT:
				return maySplit != MAY_SPLIT_EDEFAULT;
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SHIP_AFTER_DATE:
				return SHIP_AFTER_DATE_EDEFAULT == null ? shipAfterDate != null : !SHIP_AFTER_DATE_EDEFAULT.equals(shipAfterDate);
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SHIP_BY_DATE:
				return SHIP_BY_DATE_EDEFAULT == null ? shipByDate != null : !SHIP_BY_DATE_EDEFAULT.equals(shipByDate);
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SHIPMENT_METHOD_TYPE_ID:
				return SHIPMENT_METHOD_TYPE_ID_EDEFAULT == null ? shipmentMethodTypeId != null : !SHIPMENT_METHOD_TYPE_ID_EDEFAULT.equals(shipmentMethodTypeId);
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SHIPPING_INSTRUCTIONS:
				return SHIPPING_INSTRUCTIONS_EDEFAULT == null ? shippingInstructions != null : !SHIPPING_INSTRUCTIONS_EDEFAULT.equals(shippingInstructions);
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SUPPLIER_AGREEMENT_ID:
				return SUPPLIER_AGREEMENT_ID_EDEFAULT == null ? supplierAgreementId != null : !SUPPLIER_AGREEMENT_ID_EDEFAULT.equals(supplierAgreementId);
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__SUPPLIER_PARTY_ID:
				return SUPPLIER_PARTY_ID_EDEFAULT == null ? supplierPartyId != null : !SUPPLIER_PARTY_ID_EDEFAULT.equals(supplierPartyId);
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__TELECOM_CONTACT_MECH_ID:
				return TELECOM_CONTACT_MECH_ID_EDEFAULT == null ? telecomContactMechId != null : !TELECOM_CONTACT_MECH_ID_EDEFAULT.equals(telecomContactMechId);
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__TRACKING_NUMBER:
				return TRACKING_NUMBER_EDEFAULT == null ? trackingNumber != null : !TRACKING_NUMBER_EDEFAULT.equals(trackingNumber);
			case OrderPackage.ORDER_ITEM_SHIP_GROUP__VENDOR_PARTY_ID:
				return VENDOR_PARTY_ID_EDEFAULT == null ? vendorPartyId != null : !VENDOR_PARTY_ID_EDEFAULT.equals(vendorPartyId);
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
		result.append(" (orderId: ");
		result.append(orderId);
		result.append(", shipGroupSeqId: ");
		result.append(shipGroupSeqId);
		result.append(", carrierPartyId: ");
		result.append(carrierPartyId);
		result.append(", carrierRoleTypeId: ");
		result.append(carrierRoleTypeId);
		result.append(", contactMechId: ");
		result.append(contactMechId);
		result.append(", estimatedDeliveryDate: ");
		result.append(estimatedDeliveryDate);
		result.append(", estimatedShipDate: ");
		result.append(estimatedShipDate);
		result.append(", facilityId: ");
		result.append(facilityId);
		result.append(", giftMessage: ");
		result.append(giftMessage);
		result.append(", isGift: ");
		result.append(isGift);
		result.append(", maySplit: ");
		result.append(maySplit);
		result.append(", shipAfterDate: ");
		result.append(shipAfterDate);
		result.append(", shipByDate: ");
		result.append(shipByDate);
		result.append(", shipmentMethodTypeId: ");
		result.append(shipmentMethodTypeId);
		result.append(", shippingInstructions: ");
		result.append(shippingInstructions);
		result.append(", supplierAgreementId: ");
		result.append(supplierAgreementId);
		result.append(", supplierPartyId: ");
		result.append(supplierPartyId);
		result.append(", telecomContactMechId: ");
		result.append(telecomContactMechId);
		result.append(", trackingNumber: ");
		result.append(trackingNumber);
		result.append(", vendorPartyId: ");
		result.append(vendorPartyId);
		result.append(')');
		return result.toString();
	}

} //OrderItemShipGroupImpl
