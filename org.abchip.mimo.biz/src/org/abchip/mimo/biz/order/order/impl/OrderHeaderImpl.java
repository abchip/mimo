/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order.impl;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.accounting.payment.BillingAccount;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.abchip.mimo.biz.order.order.OrderType;
import org.abchip.mimo.biz.order.shoppinglist.ShoppingList;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.biz.webapp.website.WebSite;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Order
 * Header</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOrderId
 * <em>Order Id</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getAgreementId
 * <em>Agreement Id</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getEntryDate
 * <em>Entry Date</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getExternalId
 * <em>External Id</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getFirstAttemptOrderId
 * <em>First Attempt Order Id</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getGrandTotal
 * <em>Grand Total</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getInternalCode
 * <em>Internal Code</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#isInvoicePerShipment
 * <em>Invoice Per Shipment</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#isIsRushOrder
 * <em>Is Rush Order</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#isIsViewed
 * <em>Is Viewed</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#isNeedsInventoryIssuance
 * <em>Needs Inventory Issuance</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOrderDate
 * <em>Order Date</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOrderName
 * <em>Order Name</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getPickSheetPrintedDate
 * <em>Pick Sheet Printed Date</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#isPriority
 * <em>Priority</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getRemainingSubTotal
 * <em>Remaining Sub Total</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getTerminalId
 * <em>Terminal Id</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getTransactionId
 * <em>Transaction Id</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getVisitId
 * <em>Visit Id</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOrderTypeId
 * <em>Order Type Id</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getSalesChannelEnumId
 * <em>Sales Channel Enum Id</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOriginFacilityId
 * <em>Origin Facility Id</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getBillingAccountId
 * <em>Billing Account Id</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getProductStoreId
 * <em>Product Store Id</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getAutoOrderShoppingListId
 * <em>Auto Order Shopping List Id</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getCreatedBy
 * <em>Created By</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getStatusId
 * <em>Status Id</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getSyncStatusId
 * <em>Sync Status Id</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getCurrencyUom
 * <em>Currency Uom</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getWebSiteId
 * <em>Web Site Id</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getCommunicationEventOrders
 * <em>Communication Event Orders</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOrderAttributes
 * <em>Order Attributes</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOrderDeliverySchedules
 * <em>Order Delivery Schedules</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOrderHeaderNotes
 * <em>Order Header Notes</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOrderHeaderWorkEfforts
 * <em>Order Header Work Efforts</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOrderItems
 * <em>Order Items</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOrderItemGroups
 * <em>Order Item Groups</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOrderItemShipGroups
 * <em>Order Item Ship Groups</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getOrderProductPromoCodes
 * <em>Order Product Promo Codes</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getProductPromoUses
 * <em>Product Promo Uses</em>}</li>
 * <li>{@link org.abchip.mimo.biz.order.order.impl.OrderHeaderImpl#getTrackingCodeOrders
 * <em>Tracking Code Orders</em>}</li>
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
	 * The default value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected String orderId = ORDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgreementId() <em>Agreement Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAgreementId()
	 * @generated
	 * @ordered
	 */
	protected static final String AGREEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgreementId() <em>Agreement Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAgreementId()
	 * @generated
	 * @ordered
	 */
	protected String agreementId = AGREEMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntryDate() <em>Entry Date</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEntryDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ENTRY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntryDate() <em>Entry Date</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEntryDate()
	 * @generated
	 * @ordered
	 */
	protected Date entryDate = ENTRY_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalId() <em>External Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getExternalId()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalId() <em>External Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getExternalId()
	 * @generated
	 * @ordered
	 */
	protected String externalId = EXTERNAL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstAttemptOrderId() <em>First Attempt
	 * Order Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFirstAttemptOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_ATTEMPT_ORDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstAttemptOrderId() <em>First Attempt
	 * Order Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFirstAttemptOrderId()
	 * @generated
	 * @ordered
	 */
	protected String firstAttemptOrderId = FIRST_ATTEMPT_ORDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrandTotal() <em>Grand Total</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getGrandTotal()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal GRAND_TOTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGrandTotal() <em>Grand Total</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getGrandTotal()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal grandTotal = GRAND_TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getInternalCode() <em>Internal Code</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInternalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERNAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternalCode() <em>Internal Code</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInternalCode()
	 * @generated
	 * @ordered
	 */
	protected String internalCode = INTERNAL_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isInvoicePerShipment() <em>Invoice Per
	 * Shipment</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isInvoicePerShipment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVOICE_PER_SHIPMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInvoicePerShipment() <em>Invoice Per
	 * Shipment</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isInvoicePerShipment()
	 * @generated
	 * @ordered
	 */
	protected boolean invoicePerShipment = INVOICE_PER_SHIPMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsRushOrder() <em>Is Rush Order</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isIsRushOrder()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RUSH_ORDER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRushOrder() <em>Is Rush Order</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isIsRushOrder()
	 * @generated
	 * @ordered
	 */
	protected boolean isRushOrder = IS_RUSH_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsViewed() <em>Is Viewed</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isIsViewed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VIEWED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsViewed() <em>Is Viewed</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isIsViewed()
	 * @generated
	 * @ordered
	 */
	protected boolean isViewed = IS_VIEWED_EDEFAULT;

	/**
	 * The default value of the '{@link #isNeedsInventoryIssuance() <em>Needs
	 * Inventory Issuance</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isNeedsInventoryIssuance()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEEDS_INVENTORY_ISSUANCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedsInventoryIssuance() <em>Needs
	 * Inventory Issuance</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isNeedsInventoryIssuance()
	 * @generated
	 * @ordered
	 */
	protected boolean needsInventoryIssuance = NEEDS_INVENTORY_ISSUANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderDate() <em>Order Date</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOrderDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ORDER_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderDate() <em>Order Date</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOrderDate()
	 * @generated
	 * @ordered
	 */
	protected Date orderDate = ORDER_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderName() <em>Order Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOrderName()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderName() <em>Order Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOrderName()
	 * @generated
	 * @ordered
	 */
	protected String orderName = ORDER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPickSheetPrintedDate() <em>Pick Sheet
	 * Printed Date</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPickSheetPrintedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PICK_SHEET_PRINTED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPickSheetPrintedDate() <em>Pick Sheet
	 * Printed Date</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPickSheetPrintedDate()
	 * @generated
	 * @ordered
	 */
	protected Date pickSheetPrintedDate = PICK_SHEET_PRINTED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isPriority()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIORITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isPriority()
	 * @generated
	 * @ordered
	 */
	protected boolean priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemainingSubTotal() <em>Remaining Sub
	 * Total</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRemainingSubTotal()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal REMAINING_SUB_TOTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemainingSubTotal() <em>Remaining Sub
	 * Total</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRemainingSubTotal()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal remainingSubTotal = REMAINING_SUB_TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTerminalId() <em>Terminal Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTerminalId()
	 * @generated
	 * @ordered
	 */
	protected static final String TERMINAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerminalId() <em>Terminal Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTerminalId()
	 * @generated
	 * @ordered
	 */
	protected String terminalId = TERMINAL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionId() <em>Transaction
	 * Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTransactionId()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSACTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionId() <em>Transaction Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTransactionId()
	 * @generated
	 * @ordered
	 */
	protected String transactionId = TRANSACTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisitId() <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getVisitId()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisitId() <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getVisitId()
	 * @generated
	 * @ordered
	 */
	protected String visitId = VISIT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrderTypeId() <em>Order Type Id</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOrderTypeId()
	 * @generated
	 * @ordered
	 */
	protected OrderType orderTypeId;

	/**
	 * The cached value of the '{@link #getSalesChannelEnumId() <em>Sales Channel
	 * Enum Id</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSalesChannelEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration salesChannelEnumId;

	/**
	 * The cached value of the '{@link #getOriginFacilityId() <em>Origin Facility
	 * Id</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOriginFacilityId()
	 * @generated
	 * @ordered
	 */
	protected Facility originFacilityId;

	/**
	 * The cached value of the '{@link #getBillingAccountId() <em>Billing Account
	 * Id</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBillingAccountId()
	 * @generated
	 * @ordered
	 */
	protected BillingAccount billingAccountId;

	/**
	 * The cached value of the '{@link #getProductStoreId() <em>Product Store
	 * Id</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected ProductStore productStoreId;

	/**
	 * The cached value of the '{@link #getAutoOrderShoppingListId() <em>Auto Order
	 * Shopping List Id</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getAutoOrderShoppingListId()
	 * @generated
	 * @ordered
	 */
	protected ShoppingList autoOrderShoppingListId;

	/**
	 * The cached value of the '{@link #getCreatedBy() <em>Created By</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected UserLogin createdBy;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;

	/**
	 * The cached value of the '{@link #getSyncStatusId() <em>Sync Status Id</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSyncStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem syncStatusId;

	/**
	 * The cached value of the '{@link #getCurrencyUom() <em>Currency Uom</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCurrencyUom()
	 * @generated
	 * @ordered
	 */
	protected Uom currencyUom;

	/**
	 * The cached value of the '{@link #getWebSiteId() <em>Web Site Id</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWebSiteId()
	 * @generated
	 * @ordered
	 */
	protected WebSite webSiteId;

	/**
	 * The cached value of the '{@link #getCommunicationEventOrders()
	 * <em>Communication Event Orders</em>}' attribute list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getCommunicationEventOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<String> communicationEventOrders;

	/**
	 * The cached value of the '{@link #getOrderAttributes() <em>Order
	 * Attributes</em>}' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getOrderAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> orderAttributes;

	/**
	 * The cached value of the '{@link #getOrderDeliverySchedules() <em>Order
	 * Delivery Schedules</em>}' attribute list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getOrderDeliverySchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<String> orderDeliverySchedules;

	/**
	 * The cached value of the '{@link #getOrderHeaderNotes() <em>Order Header
	 * Notes</em>}' attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOrderHeaderNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> orderHeaderNotes;

	/**
	 * The cached value of the '{@link #getOrderHeaderWorkEfforts() <em>Order Header
	 * Work Efforts</em>}' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getOrderHeaderWorkEfforts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> orderHeaderWorkEfforts;

	/**
	 * The cached value of the '{@link #getOrderItems() <em>Order Items</em>}'
	 * attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOrderItems()
	 * @generated
	 * @ordered
	 */
	protected EList<String> orderItems;

	/**
	 * The cached value of the '{@link #getOrderItemGroups() <em>Order Item
	 * Groups</em>}' attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOrderItemGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<String> orderItemGroups;

	/**
	 * The cached value of the '{@link #getOrderItemShipGroups() <em>Order Item Ship
	 * Groups</em>}' attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOrderItemShipGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<String> orderItemShipGroups;

	/**
	 * The cached value of the '{@link #getOrderProductPromoCodes() <em>Order
	 * Product Promo Codes</em>}' attribute list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getOrderProductPromoCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> orderProductPromoCodes;

	/**
	 * The cached value of the '{@link #getProductPromoUses() <em>Product Promo
	 * Uses</em>}' attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProductPromoUses()
	 * @generated
	 * @ordered
	 */
	protected EList<String> productPromoUses;

	/**
	 * The cached value of the '{@link #getTrackingCodeOrders() <em>Tracking Code
	 * Orders</em>}' attribute list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTrackingCodeOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<String> trackingCodeOrders;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected OrderHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_HEADER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getAgreementId() {
		return agreementId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setAgreementId(String newAgreementId) {
		agreementId = newAgreementId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ShoppingList getAutoOrderShoppingListId() {
		if (autoOrderShoppingListId != null && ((EObject) autoOrderShoppingListId).eIsProxy()) {
			InternalEObject oldAutoOrderShoppingListId = (InternalEObject) autoOrderShoppingListId;
			autoOrderShoppingListId = (ShoppingList) eResolveProxy(oldAutoOrderShoppingListId);
			if (autoOrderShoppingListId != oldAutoOrderShoppingListId) {
			}
		}
		return autoOrderShoppingListId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ShoppingList basicGetAutoOrderShoppingListId() {
		return autoOrderShoppingListId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setAutoOrderShoppingListId(ShoppingList newAutoOrderShoppingListId) {
		autoOrderShoppingListId = newAutoOrderShoppingListId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BillingAccount getBillingAccountId() {
		if (billingAccountId != null && ((EObject) billingAccountId).eIsProxy()) {
			InternalEObject oldBillingAccountId = (InternalEObject) billingAccountId;
			billingAccountId = (BillingAccount) eResolveProxy(oldBillingAccountId);
			if (billingAccountId != oldBillingAccountId) {
			}
		}
		return billingAccountId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BillingAccount basicGetBillingAccountId() {
		return billingAccountId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setBillingAccountId(BillingAccount newBillingAccountId) {
		billingAccountId = newBillingAccountId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public UserLogin getCreatedBy() {
		if (createdBy != null && ((EObject) createdBy).eIsProxy()) {
			InternalEObject oldCreatedBy = (InternalEObject) createdBy;
			createdBy = (UserLogin) eResolveProxy(oldCreatedBy);
			if (createdBy != oldCreatedBy) {
			}
		}
		return createdBy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UserLogin basicGetCreatedBy() {
		return createdBy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setCreatedBy(UserLogin newCreatedBy) {
		createdBy = newCreatedBy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Uom getCurrencyUom() {
		if (currencyUom != null && ((EObject) currencyUom).eIsProxy()) {
			InternalEObject oldCurrencyUom = (InternalEObject) currencyUom;
			currencyUom = (Uom) eResolveProxy(oldCurrencyUom);
			if (currencyUom != oldCurrencyUom) {
			}
		}
		return currencyUom;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Uom basicGetCurrencyUom() {
		return currencyUom;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setCurrencyUom(Uom newCurrencyUom) {
		currencyUom = newCurrencyUom;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Date getEntryDate() {
		return entryDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setEntryDate(Date newEntryDate) {
		entryDate = newEntryDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getExternalId() {
		return externalId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setExternalId(String newExternalId) {
		externalId = newExternalId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getFirstAttemptOrderId() {
		return firstAttemptOrderId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setFirstAttemptOrderId(String newFirstAttemptOrderId) {
		firstAttemptOrderId = newFirstAttemptOrderId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BigDecimal getGrandTotal() {
		return grandTotal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setGrandTotal(BigDecimal newGrandTotal) {
		grandTotal = newGrandTotal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getInternalCode() {
		return internalCode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setInternalCode(String newInternalCode) {
		internalCode = newInternalCode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isInvoicePerShipment() {
		return invoicePerShipment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setInvoicePerShipment(boolean newInvoicePerShipment) {
		invoicePerShipment = newInvoicePerShipment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isIsRushOrder() {
		return isRushOrder;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setIsRushOrder(boolean newIsRushOrder) {
		isRushOrder = newIsRushOrder;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isIsViewed() {
		return isViewed;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setIsViewed(boolean newIsViewed) {
		isViewed = newIsViewed;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isNeedsInventoryIssuance() {
		return needsInventoryIssuance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setNeedsInventoryIssuance(boolean newNeedsInventoryIssuance) {
		needsInventoryIssuance = newNeedsInventoryIssuance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setOrderDate(Date newOrderDate) {
		orderDate = newOrderDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setOrderId(String newOrderId) {
		orderId = newOrderId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getOrderName() {
		return orderName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setOrderName(String newOrderName) {
		orderName = newOrderName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public OrderType getOrderTypeId() {
		if (orderTypeId != null && ((EObject) orderTypeId).eIsProxy()) {
			InternalEObject oldOrderTypeId = (InternalEObject) orderTypeId;
			orderTypeId = (OrderType) eResolveProxy(oldOrderTypeId);
			if (orderTypeId != oldOrderTypeId) {
			}
		}
		return orderTypeId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OrderType basicGetOrderTypeId() {
		return orderTypeId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setOrderTypeId(OrderType newOrderTypeId) {
		orderTypeId = newOrderTypeId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Facility getOriginFacilityId() {
		if (originFacilityId != null && ((EObject) originFacilityId).eIsProxy()) {
			InternalEObject oldOriginFacilityId = (InternalEObject) originFacilityId;
			originFacilityId = (Facility) eResolveProxy(oldOriginFacilityId);
			if (originFacilityId != oldOriginFacilityId) {
			}
		}
		return originFacilityId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Facility basicGetOriginFacilityId() {
		return originFacilityId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setOriginFacilityId(Facility newOriginFacilityId) {
		originFacilityId = newOriginFacilityId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Date getPickSheetPrintedDate() {
		return pickSheetPrintedDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPickSheetPrintedDate(Date newPickSheetPrintedDate) {
		pickSheetPrintedDate = newPickSheetPrintedDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPriority(boolean newPriority) {
		priority = newPriority;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ProductStore getProductStoreId() {
		if (productStoreId != null && ((EObject) productStoreId).eIsProxy()) {
			InternalEObject oldProductStoreId = (InternalEObject) productStoreId;
			productStoreId = (ProductStore) eResolveProxy(oldProductStoreId);
			if (productStoreId != oldProductStoreId) {
			}
		}
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProductStore basicGetProductStoreId() {
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setProductStoreId(ProductStore newProductStoreId) {
		productStoreId = newProductStoreId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public BigDecimal getRemainingSubTotal() {
		return remainingSubTotal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setRemainingSubTotal(BigDecimal newRemainingSubTotal) {
		remainingSubTotal = newRemainingSubTotal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Enumeration getSalesChannelEnumId() {
		if (salesChannelEnumId != null && ((EObject) salesChannelEnumId).eIsProxy()) {
			InternalEObject oldSalesChannelEnumId = (InternalEObject) salesChannelEnumId;
			salesChannelEnumId = (Enumeration) eResolveProxy(oldSalesChannelEnumId);
			if (salesChannelEnumId != oldSalesChannelEnumId) {
			}
		}
		return salesChannelEnumId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Enumeration basicGetSalesChannelEnumId() {
		return salesChannelEnumId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSalesChannelEnumId(Enumeration newSalesChannelEnumId) {
		salesChannelEnumId = newSalesChannelEnumId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject) statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject) statusId;
			statusId = (StatusItem) eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		statusId = newStatusId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public StatusItem getSyncStatusId() {
		if (syncStatusId != null && ((EObject) syncStatusId).eIsProxy()) {
			InternalEObject oldSyncStatusId = (InternalEObject) syncStatusId;
			syncStatusId = (StatusItem) eResolveProxy(oldSyncStatusId);
			if (syncStatusId != oldSyncStatusId) {
			}
		}
		return syncStatusId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StatusItem basicGetSyncStatusId() {
		return syncStatusId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSyncStatusId(StatusItem newSyncStatusId) {
		syncStatusId = newSyncStatusId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getTerminalId() {
		return terminalId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setTerminalId(String newTerminalId) {
		terminalId = newTerminalId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setTransactionId(String newTransactionId) {
		transactionId = newTransactionId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getVisitId() {
		return visitId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setVisitId(String newVisitId) {
		visitId = newVisitId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public WebSite getWebSiteId() {
		if (webSiteId != null && ((EObject) webSiteId).eIsProxy()) {
			InternalEObject oldWebSiteId = (InternalEObject) webSiteId;
			webSiteId = (WebSite) eResolveProxy(oldWebSiteId);
			if (webSiteId != oldWebSiteId) {
			}
		}
		return webSiteId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public WebSite basicGetWebSiteId() {
		return webSiteId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setWebSiteId(WebSite newWebSiteId) {
		webSiteId = newWebSiteId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> getCommunicationEventOrders() {
		if (communicationEventOrders == null) {
			communicationEventOrders = new BasicInternalEList<String>(String.class);
		}
		return communicationEventOrders;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> getOrderAttributes() {
		if (orderAttributes == null) {
			orderAttributes = new BasicInternalEList<String>(String.class);
		}
		return orderAttributes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> getOrderDeliverySchedules() {
		if (orderDeliverySchedules == null) {
			orderDeliverySchedules = new BasicInternalEList<String>(String.class);
		}
		return orderDeliverySchedules;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> getOrderHeaderNotes() {
		if (orderHeaderNotes == null) {
			orderHeaderNotes = new BasicInternalEList<String>(String.class);
		}
		return orderHeaderNotes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> getOrderHeaderWorkEfforts() {
		if (orderHeaderWorkEfforts == null) {
			orderHeaderWorkEfforts = new BasicInternalEList<String>(String.class);
		}
		return orderHeaderWorkEfforts;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> getOrderItems() {
		if (orderItems == null) {
			orderItems = new BasicInternalEList<String>(String.class);
		}
		return orderItems;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> getOrderItemGroups() {
		if (orderItemGroups == null) {
			orderItemGroups = new BasicInternalEList<String>(String.class);
		}
		return orderItemGroups;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> getOrderItemShipGroups() {
		if (orderItemShipGroups == null) {
			orderItemShipGroups = new BasicInternalEList<String>(String.class);
		}
		return orderItemShipGroups;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> getOrderProductPromoCodes() {
		if (orderProductPromoCodes == null) {
			orderProductPromoCodes = new BasicInternalEList<String>(String.class);
		}
		return orderProductPromoCodes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> getProductPromoUses() {
		if (productPromoUses == null) {
			productPromoUses = new BasicInternalEList<String>(String.class);
		}
		return productPromoUses;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> getTrackingCodeOrders() {
		if (trackingCodeOrders == null) {
			trackingCodeOrders = new BasicInternalEList<String>(String.class);
		}
		return trackingCodeOrders;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> acquireFixedAssets() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> giftCardFulfillments() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> itemIssuances() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> orderAdjustments() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> orderItemChanges() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> orderItemPriceInfos() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> orderNotifications() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> orderPaymentPreferences() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> orderStatuss() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> primaryPicklistBins() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> primaryShipments() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> purchaseFixedAssetMaints() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> replacementReturnItemResponses() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> returnItems() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> shipmentReceipts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> subscriptions() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<String> surveyResponses() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OrderPackage.ORDER_HEADER__ORDER_ID:
			return getOrderId();
		case OrderPackage.ORDER_HEADER__AGREEMENT_ID:
			return getAgreementId();
		case OrderPackage.ORDER_HEADER__ENTRY_DATE:
			return getEntryDate();
		case OrderPackage.ORDER_HEADER__EXTERNAL_ID:
			return getExternalId();
		case OrderPackage.ORDER_HEADER__FIRST_ATTEMPT_ORDER_ID:
			return getFirstAttemptOrderId();
		case OrderPackage.ORDER_HEADER__GRAND_TOTAL:
			return getGrandTotal();
		case OrderPackage.ORDER_HEADER__INTERNAL_CODE:
			return getInternalCode();
		case OrderPackage.ORDER_HEADER__INVOICE_PER_SHIPMENT:
			return isInvoicePerShipment();
		case OrderPackage.ORDER_HEADER__IS_RUSH_ORDER:
			return isIsRushOrder();
		case OrderPackage.ORDER_HEADER__IS_VIEWED:
			return isIsViewed();
		case OrderPackage.ORDER_HEADER__NEEDS_INVENTORY_ISSUANCE:
			return isNeedsInventoryIssuance();
		case OrderPackage.ORDER_HEADER__ORDER_DATE:
			return getOrderDate();
		case OrderPackage.ORDER_HEADER__ORDER_NAME:
			return getOrderName();
		case OrderPackage.ORDER_HEADER__PICK_SHEET_PRINTED_DATE:
			return getPickSheetPrintedDate();
		case OrderPackage.ORDER_HEADER__PRIORITY:
			return isPriority();
		case OrderPackage.ORDER_HEADER__REMAINING_SUB_TOTAL:
			return getRemainingSubTotal();
		case OrderPackage.ORDER_HEADER__TERMINAL_ID:
			return getTerminalId();
		case OrderPackage.ORDER_HEADER__TRANSACTION_ID:
			return getTransactionId();
		case OrderPackage.ORDER_HEADER__VISIT_ID:
			return getVisitId();
		case OrderPackage.ORDER_HEADER__ORDER_TYPE_ID:
			if (resolve)
				return getOrderTypeId();
			return basicGetOrderTypeId();
		case OrderPackage.ORDER_HEADER__SALES_CHANNEL_ENUM_ID:
			if (resolve)
				return getSalesChannelEnumId();
			return basicGetSalesChannelEnumId();
		case OrderPackage.ORDER_HEADER__ORIGIN_FACILITY_ID:
			if (resolve)
				return getOriginFacilityId();
			return basicGetOriginFacilityId();
		case OrderPackage.ORDER_HEADER__BILLING_ACCOUNT_ID:
			if (resolve)
				return getBillingAccountId();
			return basicGetBillingAccountId();
		case OrderPackage.ORDER_HEADER__PRODUCT_STORE_ID:
			if (resolve)
				return getProductStoreId();
			return basicGetProductStoreId();
		case OrderPackage.ORDER_HEADER__AUTO_ORDER_SHOPPING_LIST_ID:
			if (resolve)
				return getAutoOrderShoppingListId();
			return basicGetAutoOrderShoppingListId();
		case OrderPackage.ORDER_HEADER__CREATED_BY:
			if (resolve)
				return getCreatedBy();
			return basicGetCreatedBy();
		case OrderPackage.ORDER_HEADER__STATUS_ID:
			if (resolve)
				return getStatusId();
			return basicGetStatusId();
		case OrderPackage.ORDER_HEADER__SYNC_STATUS_ID:
			if (resolve)
				return getSyncStatusId();
			return basicGetSyncStatusId();
		case OrderPackage.ORDER_HEADER__CURRENCY_UOM:
			if (resolve)
				return getCurrencyUom();
			return basicGetCurrencyUom();
		case OrderPackage.ORDER_HEADER__WEB_SITE_ID:
			if (resolve)
				return getWebSiteId();
			return basicGetWebSiteId();
		case OrderPackage.ORDER_HEADER__COMMUNICATION_EVENT_ORDERS:
			return getCommunicationEventOrders();
		case OrderPackage.ORDER_HEADER__ORDER_ATTRIBUTES:
			return getOrderAttributes();
		case OrderPackage.ORDER_HEADER__ORDER_DELIVERY_SCHEDULES:
			return getOrderDeliverySchedules();
		case OrderPackage.ORDER_HEADER__ORDER_HEADER_NOTES:
			return getOrderHeaderNotes();
		case OrderPackage.ORDER_HEADER__ORDER_HEADER_WORK_EFFORTS:
			return getOrderHeaderWorkEfforts();
		case OrderPackage.ORDER_HEADER__ORDER_ITEMS:
			return getOrderItems();
		case OrderPackage.ORDER_HEADER__ORDER_ITEM_GROUPS:
			return getOrderItemGroups();
		case OrderPackage.ORDER_HEADER__ORDER_ITEM_SHIP_GROUPS:
			return getOrderItemShipGroups();
		case OrderPackage.ORDER_HEADER__ORDER_PRODUCT_PROMO_CODES:
			return getOrderProductPromoCodes();
		case OrderPackage.ORDER_HEADER__PRODUCT_PROMO_USES:
			return getProductPromoUses();
		case OrderPackage.ORDER_HEADER__TRACKING_CODE_ORDERS:
			return getTrackingCodeOrders();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case OrderPackage.ORDER_HEADER__ORDER_ID:
			setOrderId((String) newValue);
			return;
		case OrderPackage.ORDER_HEADER__AGREEMENT_ID:
			setAgreementId((String) newValue);
			return;
		case OrderPackage.ORDER_HEADER__ENTRY_DATE:
			setEntryDate((Date) newValue);
			return;
		case OrderPackage.ORDER_HEADER__EXTERNAL_ID:
			setExternalId((String) newValue);
			return;
		case OrderPackage.ORDER_HEADER__FIRST_ATTEMPT_ORDER_ID:
			setFirstAttemptOrderId((String) newValue);
			return;
		case OrderPackage.ORDER_HEADER__GRAND_TOTAL:
			setGrandTotal((BigDecimal) newValue);
			return;
		case OrderPackage.ORDER_HEADER__INTERNAL_CODE:
			setInternalCode((String) newValue);
			return;
		case OrderPackage.ORDER_HEADER__INVOICE_PER_SHIPMENT:
			setInvoicePerShipment((Boolean) newValue);
			return;
		case OrderPackage.ORDER_HEADER__IS_RUSH_ORDER:
			setIsRushOrder((Boolean) newValue);
			return;
		case OrderPackage.ORDER_HEADER__IS_VIEWED:
			setIsViewed((Boolean) newValue);
			return;
		case OrderPackage.ORDER_HEADER__NEEDS_INVENTORY_ISSUANCE:
			setNeedsInventoryIssuance((Boolean) newValue);
			return;
		case OrderPackage.ORDER_HEADER__ORDER_DATE:
			setOrderDate((Date) newValue);
			return;
		case OrderPackage.ORDER_HEADER__ORDER_NAME:
			setOrderName((String) newValue);
			return;
		case OrderPackage.ORDER_HEADER__PICK_SHEET_PRINTED_DATE:
			setPickSheetPrintedDate((Date) newValue);
			return;
		case OrderPackage.ORDER_HEADER__PRIORITY:
			setPriority((Boolean) newValue);
			return;
		case OrderPackage.ORDER_HEADER__REMAINING_SUB_TOTAL:
			setRemainingSubTotal((BigDecimal) newValue);
			return;
		case OrderPackage.ORDER_HEADER__TERMINAL_ID:
			setTerminalId((String) newValue);
			return;
		case OrderPackage.ORDER_HEADER__TRANSACTION_ID:
			setTransactionId((String) newValue);
			return;
		case OrderPackage.ORDER_HEADER__VISIT_ID:
			setVisitId((String) newValue);
			return;
		case OrderPackage.ORDER_HEADER__ORDER_TYPE_ID:
			setOrderTypeId((OrderType) newValue);
			return;
		case OrderPackage.ORDER_HEADER__SALES_CHANNEL_ENUM_ID:
			setSalesChannelEnumId((Enumeration) newValue);
			return;
		case OrderPackage.ORDER_HEADER__ORIGIN_FACILITY_ID:
			setOriginFacilityId((Facility) newValue);
			return;
		case OrderPackage.ORDER_HEADER__BILLING_ACCOUNT_ID:
			setBillingAccountId((BillingAccount) newValue);
			return;
		case OrderPackage.ORDER_HEADER__PRODUCT_STORE_ID:
			setProductStoreId((ProductStore) newValue);
			return;
		case OrderPackage.ORDER_HEADER__AUTO_ORDER_SHOPPING_LIST_ID:
			setAutoOrderShoppingListId((ShoppingList) newValue);
			return;
		case OrderPackage.ORDER_HEADER__CREATED_BY:
			setCreatedBy((UserLogin) newValue);
			return;
		case OrderPackage.ORDER_HEADER__STATUS_ID:
			setStatusId((StatusItem) newValue);
			return;
		case OrderPackage.ORDER_HEADER__SYNC_STATUS_ID:
			setSyncStatusId((StatusItem) newValue);
			return;
		case OrderPackage.ORDER_HEADER__CURRENCY_UOM:
			setCurrencyUom((Uom) newValue);
			return;
		case OrderPackage.ORDER_HEADER__WEB_SITE_ID:
			setWebSiteId((WebSite) newValue);
			return;
		case OrderPackage.ORDER_HEADER__COMMUNICATION_EVENT_ORDERS:
			getCommunicationEventOrders().clear();
			getCommunicationEventOrders().addAll((Collection<? extends String>) newValue);
			return;
		case OrderPackage.ORDER_HEADER__ORDER_ATTRIBUTES:
			getOrderAttributes().clear();
			getOrderAttributes().addAll((Collection<? extends String>) newValue);
			return;
		case OrderPackage.ORDER_HEADER__ORDER_DELIVERY_SCHEDULES:
			getOrderDeliverySchedules().clear();
			getOrderDeliverySchedules().addAll((Collection<? extends String>) newValue);
			return;
		case OrderPackage.ORDER_HEADER__ORDER_HEADER_NOTES:
			getOrderHeaderNotes().clear();
			getOrderHeaderNotes().addAll((Collection<? extends String>) newValue);
			return;
		case OrderPackage.ORDER_HEADER__ORDER_HEADER_WORK_EFFORTS:
			getOrderHeaderWorkEfforts().clear();
			getOrderHeaderWorkEfforts().addAll((Collection<? extends String>) newValue);
			return;
		case OrderPackage.ORDER_HEADER__ORDER_ITEMS:
			getOrderItems().clear();
			getOrderItems().addAll((Collection<? extends String>) newValue);
			return;
		case OrderPackage.ORDER_HEADER__ORDER_ITEM_GROUPS:
			getOrderItemGroups().clear();
			getOrderItemGroups().addAll((Collection<? extends String>) newValue);
			return;
		case OrderPackage.ORDER_HEADER__ORDER_ITEM_SHIP_GROUPS:
			getOrderItemShipGroups().clear();
			getOrderItemShipGroups().addAll((Collection<? extends String>) newValue);
			return;
		case OrderPackage.ORDER_HEADER__ORDER_PRODUCT_PROMO_CODES:
			getOrderProductPromoCodes().clear();
			getOrderProductPromoCodes().addAll((Collection<? extends String>) newValue);
			return;
		case OrderPackage.ORDER_HEADER__PRODUCT_PROMO_USES:
			getProductPromoUses().clear();
			getProductPromoUses().addAll((Collection<? extends String>) newValue);
			return;
		case OrderPackage.ORDER_HEADER__TRACKING_CODE_ORDERS:
			getTrackingCodeOrders().clear();
			getTrackingCodeOrders().addAll((Collection<? extends String>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case OrderPackage.ORDER_HEADER__ORDER_ID:
			setOrderId(ORDER_ID_EDEFAULT);
			return;
		case OrderPackage.ORDER_HEADER__AGREEMENT_ID:
			setAgreementId(AGREEMENT_ID_EDEFAULT);
			return;
		case OrderPackage.ORDER_HEADER__ENTRY_DATE:
			setEntryDate(ENTRY_DATE_EDEFAULT);
			return;
		case OrderPackage.ORDER_HEADER__EXTERNAL_ID:
			setExternalId(EXTERNAL_ID_EDEFAULT);
			return;
		case OrderPackage.ORDER_HEADER__FIRST_ATTEMPT_ORDER_ID:
			setFirstAttemptOrderId(FIRST_ATTEMPT_ORDER_ID_EDEFAULT);
			return;
		case OrderPackage.ORDER_HEADER__GRAND_TOTAL:
			setGrandTotal(GRAND_TOTAL_EDEFAULT);
			return;
		case OrderPackage.ORDER_HEADER__INTERNAL_CODE:
			setInternalCode(INTERNAL_CODE_EDEFAULT);
			return;
		case OrderPackage.ORDER_HEADER__INVOICE_PER_SHIPMENT:
			setInvoicePerShipment(INVOICE_PER_SHIPMENT_EDEFAULT);
			return;
		case OrderPackage.ORDER_HEADER__IS_RUSH_ORDER:
			setIsRushOrder(IS_RUSH_ORDER_EDEFAULT);
			return;
		case OrderPackage.ORDER_HEADER__IS_VIEWED:
			setIsViewed(IS_VIEWED_EDEFAULT);
			return;
		case OrderPackage.ORDER_HEADER__NEEDS_INVENTORY_ISSUANCE:
			setNeedsInventoryIssuance(NEEDS_INVENTORY_ISSUANCE_EDEFAULT);
			return;
		case OrderPackage.ORDER_HEADER__ORDER_DATE:
			setOrderDate(ORDER_DATE_EDEFAULT);
			return;
		case OrderPackage.ORDER_HEADER__ORDER_NAME:
			setOrderName(ORDER_NAME_EDEFAULT);
			return;
		case OrderPackage.ORDER_HEADER__PICK_SHEET_PRINTED_DATE:
			setPickSheetPrintedDate(PICK_SHEET_PRINTED_DATE_EDEFAULT);
			return;
		case OrderPackage.ORDER_HEADER__PRIORITY:
			setPriority(PRIORITY_EDEFAULT);
			return;
		case OrderPackage.ORDER_HEADER__REMAINING_SUB_TOTAL:
			setRemainingSubTotal(REMAINING_SUB_TOTAL_EDEFAULT);
			return;
		case OrderPackage.ORDER_HEADER__TERMINAL_ID:
			setTerminalId(TERMINAL_ID_EDEFAULT);
			return;
		case OrderPackage.ORDER_HEADER__TRANSACTION_ID:
			setTransactionId(TRANSACTION_ID_EDEFAULT);
			return;
		case OrderPackage.ORDER_HEADER__VISIT_ID:
			setVisitId(VISIT_ID_EDEFAULT);
			return;
		case OrderPackage.ORDER_HEADER__ORDER_TYPE_ID:
			setOrderTypeId((OrderType) null);
			return;
		case OrderPackage.ORDER_HEADER__SALES_CHANNEL_ENUM_ID:
			setSalesChannelEnumId((Enumeration) null);
			return;
		case OrderPackage.ORDER_HEADER__ORIGIN_FACILITY_ID:
			setOriginFacilityId((Facility) null);
			return;
		case OrderPackage.ORDER_HEADER__BILLING_ACCOUNT_ID:
			setBillingAccountId((BillingAccount) null);
			return;
		case OrderPackage.ORDER_HEADER__PRODUCT_STORE_ID:
			setProductStoreId((ProductStore) null);
			return;
		case OrderPackage.ORDER_HEADER__AUTO_ORDER_SHOPPING_LIST_ID:
			setAutoOrderShoppingListId((ShoppingList) null);
			return;
		case OrderPackage.ORDER_HEADER__CREATED_BY:
			setCreatedBy((UserLogin) null);
			return;
		case OrderPackage.ORDER_HEADER__STATUS_ID:
			setStatusId((StatusItem) null);
			return;
		case OrderPackage.ORDER_HEADER__SYNC_STATUS_ID:
			setSyncStatusId((StatusItem) null);
			return;
		case OrderPackage.ORDER_HEADER__CURRENCY_UOM:
			setCurrencyUom((Uom) null);
			return;
		case OrderPackage.ORDER_HEADER__WEB_SITE_ID:
			setWebSiteId((WebSite) null);
			return;
		case OrderPackage.ORDER_HEADER__COMMUNICATION_EVENT_ORDERS:
			getCommunicationEventOrders().clear();
			return;
		case OrderPackage.ORDER_HEADER__ORDER_ATTRIBUTES:
			getOrderAttributes().clear();
			return;
		case OrderPackage.ORDER_HEADER__ORDER_DELIVERY_SCHEDULES:
			getOrderDeliverySchedules().clear();
			return;
		case OrderPackage.ORDER_HEADER__ORDER_HEADER_NOTES:
			getOrderHeaderNotes().clear();
			return;
		case OrderPackage.ORDER_HEADER__ORDER_HEADER_WORK_EFFORTS:
			getOrderHeaderWorkEfforts().clear();
			return;
		case OrderPackage.ORDER_HEADER__ORDER_ITEMS:
			getOrderItems().clear();
			return;
		case OrderPackage.ORDER_HEADER__ORDER_ITEM_GROUPS:
			getOrderItemGroups().clear();
			return;
		case OrderPackage.ORDER_HEADER__ORDER_ITEM_SHIP_GROUPS:
			getOrderItemShipGroups().clear();
			return;
		case OrderPackage.ORDER_HEADER__ORDER_PRODUCT_PROMO_CODES:
			getOrderProductPromoCodes().clear();
			return;
		case OrderPackage.ORDER_HEADER__PRODUCT_PROMO_USES:
			getProductPromoUses().clear();
			return;
		case OrderPackage.ORDER_HEADER__TRACKING_CODE_ORDERS:
			getTrackingCodeOrders().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case OrderPackage.ORDER_HEADER__ORDER_ID:
			return ORDER_ID_EDEFAULT == null ? orderId != null : !ORDER_ID_EDEFAULT.equals(orderId);
		case OrderPackage.ORDER_HEADER__AGREEMENT_ID:
			return AGREEMENT_ID_EDEFAULT == null ? agreementId != null : !AGREEMENT_ID_EDEFAULT.equals(agreementId);
		case OrderPackage.ORDER_HEADER__ENTRY_DATE:
			return ENTRY_DATE_EDEFAULT == null ? entryDate != null : !ENTRY_DATE_EDEFAULT.equals(entryDate);
		case OrderPackage.ORDER_HEADER__EXTERNAL_ID:
			return EXTERNAL_ID_EDEFAULT == null ? externalId != null : !EXTERNAL_ID_EDEFAULT.equals(externalId);
		case OrderPackage.ORDER_HEADER__FIRST_ATTEMPT_ORDER_ID:
			return FIRST_ATTEMPT_ORDER_ID_EDEFAULT == null ? firstAttemptOrderId != null : !FIRST_ATTEMPT_ORDER_ID_EDEFAULT.equals(firstAttemptOrderId);
		case OrderPackage.ORDER_HEADER__GRAND_TOTAL:
			return GRAND_TOTAL_EDEFAULT == null ? grandTotal != null : !GRAND_TOTAL_EDEFAULT.equals(grandTotal);
		case OrderPackage.ORDER_HEADER__INTERNAL_CODE:
			return INTERNAL_CODE_EDEFAULT == null ? internalCode != null : !INTERNAL_CODE_EDEFAULT.equals(internalCode);
		case OrderPackage.ORDER_HEADER__INVOICE_PER_SHIPMENT:
			return invoicePerShipment != INVOICE_PER_SHIPMENT_EDEFAULT;
		case OrderPackage.ORDER_HEADER__IS_RUSH_ORDER:
			return isRushOrder != IS_RUSH_ORDER_EDEFAULT;
		case OrderPackage.ORDER_HEADER__IS_VIEWED:
			return isViewed != IS_VIEWED_EDEFAULT;
		case OrderPackage.ORDER_HEADER__NEEDS_INVENTORY_ISSUANCE:
			return needsInventoryIssuance != NEEDS_INVENTORY_ISSUANCE_EDEFAULT;
		case OrderPackage.ORDER_HEADER__ORDER_DATE:
			return ORDER_DATE_EDEFAULT == null ? orderDate != null : !ORDER_DATE_EDEFAULT.equals(orderDate);
		case OrderPackage.ORDER_HEADER__ORDER_NAME:
			return ORDER_NAME_EDEFAULT == null ? orderName != null : !ORDER_NAME_EDEFAULT.equals(orderName);
		case OrderPackage.ORDER_HEADER__PICK_SHEET_PRINTED_DATE:
			return PICK_SHEET_PRINTED_DATE_EDEFAULT == null ? pickSheetPrintedDate != null : !PICK_SHEET_PRINTED_DATE_EDEFAULT.equals(pickSheetPrintedDate);
		case OrderPackage.ORDER_HEADER__PRIORITY:
			return priority != PRIORITY_EDEFAULT;
		case OrderPackage.ORDER_HEADER__REMAINING_SUB_TOTAL:
			return REMAINING_SUB_TOTAL_EDEFAULT == null ? remainingSubTotal != null : !REMAINING_SUB_TOTAL_EDEFAULT.equals(remainingSubTotal);
		case OrderPackage.ORDER_HEADER__TERMINAL_ID:
			return TERMINAL_ID_EDEFAULT == null ? terminalId != null : !TERMINAL_ID_EDEFAULT.equals(terminalId);
		case OrderPackage.ORDER_HEADER__TRANSACTION_ID:
			return TRANSACTION_ID_EDEFAULT == null ? transactionId != null : !TRANSACTION_ID_EDEFAULT.equals(transactionId);
		case OrderPackage.ORDER_HEADER__VISIT_ID:
			return VISIT_ID_EDEFAULT == null ? visitId != null : !VISIT_ID_EDEFAULT.equals(visitId);
		case OrderPackage.ORDER_HEADER__ORDER_TYPE_ID:
			return orderTypeId != null;
		case OrderPackage.ORDER_HEADER__SALES_CHANNEL_ENUM_ID:
			return salesChannelEnumId != null;
		case OrderPackage.ORDER_HEADER__ORIGIN_FACILITY_ID:
			return originFacilityId != null;
		case OrderPackage.ORDER_HEADER__BILLING_ACCOUNT_ID:
			return billingAccountId != null;
		case OrderPackage.ORDER_HEADER__PRODUCT_STORE_ID:
			return productStoreId != null;
		case OrderPackage.ORDER_HEADER__AUTO_ORDER_SHOPPING_LIST_ID:
			return autoOrderShoppingListId != null;
		case OrderPackage.ORDER_HEADER__CREATED_BY:
			return createdBy != null;
		case OrderPackage.ORDER_HEADER__STATUS_ID:
			return statusId != null;
		case OrderPackage.ORDER_HEADER__SYNC_STATUS_ID:
			return syncStatusId != null;
		case OrderPackage.ORDER_HEADER__CURRENCY_UOM:
			return currencyUom != null;
		case OrderPackage.ORDER_HEADER__WEB_SITE_ID:
			return webSiteId != null;
		case OrderPackage.ORDER_HEADER__COMMUNICATION_EVENT_ORDERS:
			return communicationEventOrders != null && !communicationEventOrders.isEmpty();
		case OrderPackage.ORDER_HEADER__ORDER_ATTRIBUTES:
			return orderAttributes != null && !orderAttributes.isEmpty();
		case OrderPackage.ORDER_HEADER__ORDER_DELIVERY_SCHEDULES:
			return orderDeliverySchedules != null && !orderDeliverySchedules.isEmpty();
		case OrderPackage.ORDER_HEADER__ORDER_HEADER_NOTES:
			return orderHeaderNotes != null && !orderHeaderNotes.isEmpty();
		case OrderPackage.ORDER_HEADER__ORDER_HEADER_WORK_EFFORTS:
			return orderHeaderWorkEfforts != null && !orderHeaderWorkEfforts.isEmpty();
		case OrderPackage.ORDER_HEADER__ORDER_ITEMS:
			return orderItems != null && !orderItems.isEmpty();
		case OrderPackage.ORDER_HEADER__ORDER_ITEM_GROUPS:
			return orderItemGroups != null && !orderItemGroups.isEmpty();
		case OrderPackage.ORDER_HEADER__ORDER_ITEM_SHIP_GROUPS:
			return orderItemShipGroups != null && !orderItemShipGroups.isEmpty();
		case OrderPackage.ORDER_HEADER__ORDER_PRODUCT_PROMO_CODES:
			return orderProductPromoCodes != null && !orderProductPromoCodes.isEmpty();
		case OrderPackage.ORDER_HEADER__PRODUCT_PROMO_USES:
			return productPromoUses != null && !productPromoUses.isEmpty();
		case OrderPackage.ORDER_HEADER__TRACKING_CODE_ORDERS:
			return trackingCodeOrders != null && !trackingCodeOrders.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (orderId: ");
		result.append(orderId);
		result.append(", agreementId: ");
		result.append(agreementId);
		result.append(", entryDate: ");
		result.append(entryDate);
		result.append(", externalId: ");
		result.append(externalId);
		result.append(", firstAttemptOrderId: ");
		result.append(firstAttemptOrderId);
		result.append(", grandTotal: ");
		result.append(grandTotal);
		result.append(", internalCode: ");
		result.append(internalCode);
		result.append(", invoicePerShipment: ");
		result.append(invoicePerShipment);
		result.append(", isRushOrder: ");
		result.append(isRushOrder);
		result.append(", isViewed: ");
		result.append(isViewed);
		result.append(", needsInventoryIssuance: ");
		result.append(needsInventoryIssuance);
		result.append(", orderDate: ");
		result.append(orderDate);
		result.append(", orderName: ");
		result.append(orderName);
		result.append(", pickSheetPrintedDate: ");
		result.append(pickSheetPrintedDate);
		result.append(", priority: ");
		result.append(priority);
		result.append(", remainingSubTotal: ");
		result.append(remainingSubTotal);
		result.append(", terminalId: ");
		result.append(terminalId);
		result.append(", transactionId: ");
		result.append(transactionId);
		result.append(", visitId: ");
		result.append(visitId);
		result.append(", communicationEventOrders: ");
		result.append(communicationEventOrders);
		result.append(", orderAttributes: ");
		result.append(orderAttributes);
		result.append(", orderDeliverySchedules: ");
		result.append(orderDeliverySchedules);
		result.append(", orderHeaderNotes: ");
		result.append(orderHeaderNotes);
		result.append(", orderHeaderWorkEfforts: ");
		result.append(orderHeaderWorkEfforts);
		result.append(", orderItems: ");
		result.append(orderItems);
		result.append(", orderItemGroups: ");
		result.append(orderItemGroups);
		result.append(", orderItemShipGroups: ");
		result.append(orderItemShipGroups);
		result.append(", orderProductPromoCodes: ");
		result.append(orderProductPromoCodes);
		result.append(", productPromoUses: ");
		result.append(productPromoUses);
		result.append(", trackingCodeOrders: ");
		result.append(trackingCodeOrders);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean isApprovable() {

		if (this.statusId == null)
			return false;

		if (this.statusId.getStatusId().equals("ORDER_CREATED") || this.statusId.getStatusId().equals("ORDER_PROCESSING") || this.statusId.getStatusId().equals("ORDER_HOLD"))
			return true;
		else
			return false;
	}
} // OrderHeaderImpl
