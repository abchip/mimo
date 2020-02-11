/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.accounting.payment.BillingAccount;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.marketing.tracking.TrackingCodeOrder;
import org.abchip.mimo.biz.order.order.CommunicationEventOrder;
import org.abchip.mimo.biz.order.order.OrderAttribute;
import org.abchip.mimo.biz.order.order.OrderDeliverySchedule;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.order.order.OrderHeaderNote;
import org.abchip.mimo.biz.order.order.OrderHeaderWorkEffort;
import org.abchip.mimo.biz.order.order.OrderItem;
import org.abchip.mimo.biz.order.order.OrderItemGroup;
import org.abchip.mimo.biz.order.order.OrderItemShipGroup;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.abchip.mimo.biz.order.order.OrderProductPromoCode;
import org.abchip.mimo.biz.order.order.OrderStatus;
import org.abchip.mimo.biz.order.order.OrderType;
import org.abchip.mimo.biz.order.shoppinglist.ShoppingList;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.product.promo.ProductPromoUse;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.biz.webapp.website.WebSite;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Order
 * Header</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getAgreementId <em>Agreement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getAutoOrderShoppingListId <em>Auto Order Shopping List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getBillingAccountId <em>Billing Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getCommunicationEventOrders <em>Communication Event Orders</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getEntryDate <em>Entry Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getExternalId <em>External Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getFirstAttemptOrderId <em>First Attempt Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getGrandTotal <em>Grand Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getInternalCode <em>Internal Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#isInvoicePerShipment <em>Invoice Per Shipment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#isIsRushOrder <em>Is Rush Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#isIsViewed <em>Is Viewed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#isNeedsInventoryIssuance <em>Needs Inventory Issuance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOrderAttributes <em>Order Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOrderDate <em>Order Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOrderDeliverySchedules <em>Order Delivery Schedules</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOrderHeaderNotes <em>Order Header Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOrderHeaderWorkEfforts <em>Order Header Work Efforts</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOrderItemGroups <em>Order Item Groups</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOrderItemShipGroups <em>Order Item Ship Groups</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOrderItems <em>Order Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOrderName <em>Order Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOrderProductPromoCodes <em>Order Product Promo Codes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOrderTypeId <em>Order Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOriginFacilityId <em>Origin Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getPickSheetPrintedDate <em>Pick Sheet Printed Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#isPriority <em>Priority</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getProductPromoUses <em>Product Promo Uses</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getRemainingSubTotal <em>Remaining Sub Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getSalesChannelEnumId <em>Sales Channel Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getSyncStatusId <em>Sync Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getTerminalId <em>Terminal Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getTrackingCodeOrders <em>Tracking Code Orders</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getTransactionId <em>Transaction Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getVisitId <em>Visit Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getWebSiteId <em>Web Site Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderHeaderImpl extends BizEntityTypedImpl<OrderType> implements OrderHeader {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_HEADER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAgreementId() {
		return (String)eGet(OrderPackage.Literals.ORDER_HEADER__AGREEMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementId(String newAgreementId) {
		eSet(OrderPackage.Literals.ORDER_HEADER__AGREEMENT_ID, newAgreementId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShoppingList getAutoOrderShoppingListId() {
		return (ShoppingList)eGet(OrderPackage.Literals.ORDER_HEADER__AUTO_ORDER_SHOPPING_LIST_ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoOrderShoppingListId(ShoppingList newAutoOrderShoppingListId) {
		eSet(OrderPackage.Literals.ORDER_HEADER__AUTO_ORDER_SHOPPING_LIST_ID, newAutoOrderShoppingListId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BillingAccount getBillingAccountId() {
		return (BillingAccount)eGet(OrderPackage.Literals.ORDER_HEADER__BILLING_ACCOUNT_ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingAccountId(BillingAccount newBillingAccountId) {
		eSet(OrderPackage.Literals.ORDER_HEADER__BILLING_ACCOUNT_ID, newBillingAccountId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<CommunicationEventOrder> getCommunicationEventOrders() {
		return (List<CommunicationEventOrder>)eGet(OrderPackage.Literals.ORDER_HEADER__COMMUNICATION_EVENT_ORDERS, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getCreatedBy() {
		return (UserLogin)eGet(OrderPackage.Literals.ORDER_HEADER__CREATED_BY, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedBy(UserLogin newCreatedBy) {
		eSet(OrderPackage.Literals.ORDER_HEADER__CREATED_BY, newCreatedBy);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUom() {
		return (Uom)eGet(OrderPackage.Literals.ORDER_HEADER__CURRENCY_UOM, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUom(Uom newCurrencyUom) {
		eSet(OrderPackage.Literals.ORDER_HEADER__CURRENCY_UOM, newCurrencyUom);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEntryDate() {
		return (Date)eGet(OrderPackage.Literals.ORDER_HEADER__ENTRY_DATE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntryDate(Date newEntryDate) {
		eSet(OrderPackage.Literals.ORDER_HEADER__ENTRY_DATE, newEntryDate);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalId() {
		return (String)eGet(OrderPackage.Literals.ORDER_HEADER__EXTERNAL_ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalId(String newExternalId) {
		eSet(OrderPackage.Literals.ORDER_HEADER__EXTERNAL_ID, newExternalId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstAttemptOrderId() {
		return (String)eGet(OrderPackage.Literals.ORDER_HEADER__FIRST_ATTEMPT_ORDER_ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstAttemptOrderId(String newFirstAttemptOrderId) {
		eSet(OrderPackage.Literals.ORDER_HEADER__FIRST_ATTEMPT_ORDER_ID, newFirstAttemptOrderId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getGrandTotal() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_HEADER__GRAND_TOTAL, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrandTotal(BigDecimal newGrandTotal) {
		eSet(OrderPackage.Literals.ORDER_HEADER__GRAND_TOTAL, newGrandTotal);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInternalCode() {
		return (String)eGet(OrderPackage.Literals.ORDER_HEADER__INTERNAL_CODE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalCode(String newInternalCode) {
		eSet(OrderPackage.Literals.ORDER_HEADER__INTERNAL_CODE, newInternalCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInvoicePerShipment() {
		return (Boolean)eGet(OrderPackage.Literals.ORDER_HEADER__INVOICE_PER_SHIPMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoicePerShipment(boolean newInvoicePerShipment) {
		eSet(OrderPackage.Literals.ORDER_HEADER__INVOICE_PER_SHIPMENT, newInvoicePerShipment);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsRushOrder() {
		return (Boolean)eGet(OrderPackage.Literals.ORDER_HEADER__IS_RUSH_ORDER, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsRushOrder(boolean newIsRushOrder) {
		eSet(OrderPackage.Literals.ORDER_HEADER__IS_RUSH_ORDER, newIsRushOrder);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsViewed() {
		return (Boolean)eGet(OrderPackage.Literals.ORDER_HEADER__IS_VIEWED, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsViewed(boolean newIsViewed) {
		eSet(OrderPackage.Literals.ORDER_HEADER__IS_VIEWED, newIsViewed);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNeedsInventoryIssuance() {
		return (Boolean)eGet(OrderPackage.Literals.ORDER_HEADER__NEEDS_INVENTORY_ISSUANCE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeedsInventoryIssuance(boolean newNeedsInventoryIssuance) {
		eSet(OrderPackage.Literals.ORDER_HEADER__NEEDS_INVENTORY_ISSUANCE, newNeedsInventoryIssuance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<OrderAttribute> getOrderAttributes() {
		return (List<OrderAttribute>)eGet(OrderPackage.Literals.ORDER_HEADER__ORDER_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getOrderDate() {
		return (Date)eGet(OrderPackage.Literals.ORDER_HEADER__ORDER_DATE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderDate(Date newOrderDate) {
		eSet(OrderPackage.Literals.ORDER_HEADER__ORDER_DATE, newOrderDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<OrderDeliverySchedule> getOrderDeliverySchedules() {
		return (List<OrderDeliverySchedule>)eGet(OrderPackage.Literals.ORDER_HEADER__ORDER_DELIVERY_SCHEDULES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<OrderHeaderNote> getOrderHeaderNotes() {
		return (List<OrderHeaderNote>)eGet(OrderPackage.Literals.ORDER_HEADER__ORDER_HEADER_NOTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<OrderHeaderWorkEffort> getOrderHeaderWorkEfforts() {
		return (List<OrderHeaderWorkEffort>)eGet(OrderPackage.Literals.ORDER_HEADER__ORDER_HEADER_WORK_EFFORTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<OrderItemGroup> getOrderItemGroups() {
		return (List<OrderItemGroup>)eGet(OrderPackage.Literals.ORDER_HEADER__ORDER_ITEM_GROUPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<OrderItemShipGroup> getOrderItemShipGroups() {
		return (List<OrderItemShipGroup>)eGet(OrderPackage.Literals.ORDER_HEADER__ORDER_ITEM_SHIP_GROUPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<OrderItem> getOrderItems() {
		return (List<OrderItem>)eGet(OrderPackage.Literals.ORDER_HEADER__ORDER_ITEMS, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderId() {
		return (String)eGet(OrderPackage.Literals.ORDER_HEADER__ORDER_ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(String newOrderId) {
		eSet(OrderPackage.Literals.ORDER_HEADER__ORDER_ID, newOrderId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderName() {
		return (String)eGet(OrderPackage.Literals.ORDER_HEADER__ORDER_NAME, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderName(String newOrderName) {
		eSet(OrderPackage.Literals.ORDER_HEADER__ORDER_NAME, newOrderName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<OrderProductPromoCode> getOrderProductPromoCodes() {
		return (List<OrderProductPromoCode>)eGet(OrderPackage.Literals.ORDER_HEADER__ORDER_PRODUCT_PROMO_CODES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderType getOrderTypeId() {
		return (OrderType)eGet(OrderPackage.Literals.ORDER_HEADER__ORDER_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderTypeId(OrderType newOrderTypeId) {
		eSet(OrderPackage.Literals.ORDER_HEADER__ORDER_TYPE_ID, newOrderTypeId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getOriginFacilityId() {
		return (Facility)eGet(OrderPackage.Literals.ORDER_HEADER__ORIGIN_FACILITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginFacilityId(Facility newOriginFacilityId) {
		eSet(OrderPackage.Literals.ORDER_HEADER__ORIGIN_FACILITY_ID, newOriginFacilityId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPickSheetPrintedDate() {
		return (Date)eGet(OrderPackage.Literals.ORDER_HEADER__PICK_SHEET_PRINTED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPickSheetPrintedDate(Date newPickSheetPrintedDate) {
		eSet(OrderPackage.Literals.ORDER_HEADER__PICK_SHEET_PRINTED_DATE, newPickSheetPrintedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPriority() {
		return (Boolean)eGet(OrderPackage.Literals.ORDER_HEADER__PRIORITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(boolean newPriority) {
		eSet(OrderPackage.Literals.ORDER_HEADER__PRIORITY, newPriority);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductPromoUse> getProductPromoUses() {
		return (List<ProductPromoUse>)eGet(OrderPackage.Literals.ORDER_HEADER__PRODUCT_PROMO_USES, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore getProductStoreId() {
		return (ProductStore)eGet(OrderPackage.Literals.ORDER_HEADER__PRODUCT_STORE_ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(ProductStore newProductStoreId) {
		eSet(OrderPackage.Literals.ORDER_HEADER__PRODUCT_STORE_ID, newProductStoreId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getRemainingSubTotal() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_HEADER__REMAINING_SUB_TOTAL, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemainingSubTotal(BigDecimal newRemainingSubTotal) {
		eSet(OrderPackage.Literals.ORDER_HEADER__REMAINING_SUB_TOTAL, newRemainingSubTotal);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getSalesChannelEnumId() {
		return (Enumeration)eGet(OrderPackage.Literals.ORDER_HEADER__SALES_CHANNEL_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesChannelEnumId(Enumeration newSalesChannelEnumId) {
		eSet(OrderPackage.Literals.ORDER_HEADER__SALES_CHANNEL_ENUM_ID, newSalesChannelEnumId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		return (StatusItem)eGet(OrderPackage.Literals.ORDER_HEADER__STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		eSet(OrderPackage.Literals.ORDER_HEADER__STATUS_ID, newStatusId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getSyncStatusId() {
		return (StatusItem)eGet(OrderPackage.Literals.ORDER_HEADER__SYNC_STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSyncStatusId(StatusItem newSyncStatusId) {
		eSet(OrderPackage.Literals.ORDER_HEADER__SYNC_STATUS_ID, newSyncStatusId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTerminalId() {
		return (String)eGet(OrderPackage.Literals.ORDER_HEADER__TERMINAL_ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTerminalId(String newTerminalId) {
		eSet(OrderPackage.Literals.ORDER_HEADER__TERMINAL_ID, newTerminalId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<TrackingCodeOrder> getTrackingCodeOrders() {
		return (List<TrackingCodeOrder>)eGet(OrderPackage.Literals.ORDER_HEADER__TRACKING_CODE_ORDERS, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransactionId() {
		return (String)eGet(OrderPackage.Literals.ORDER_HEADER__TRANSACTION_ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionId(String newTransactionId) {
		eSet(OrderPackage.Literals.ORDER_HEADER__TRANSACTION_ID, newTransactionId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisitId() {
		return (String)eGet(OrderPackage.Literals.ORDER_HEADER__VISIT_ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisitId(String newVisitId) {
		eSet(OrderPackage.Literals.ORDER_HEADER__VISIT_ID, newVisitId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebSite getWebSiteId() {
		return (WebSite)eGet(OrderPackage.Literals.ORDER_HEADER__WEB_SITE_ID, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebSiteId(WebSite newWebSiteId) {
		eSet(OrderPackage.Literals.ORDER_HEADER__WEB_SITE_ID, newWebSiteId);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean isApprovable() {

		if (!eIsSet(OrderPackage.ORDER_HEADER__STATUS_ID))
			return false;

		OrderStatus statusId = (OrderStatus) eGet(OrderPackage.ORDER_HEADER__STATUS_ID, false, true);

		if (statusId.getID().equals("ORDER_CREATED") || statusId.getID().equals("ORDER_PROCESSING") || statusId.getID().equals("ORDER_HOLD"))
			return true;
		else
			return false;
	}
} // OrderHeaderImpl
