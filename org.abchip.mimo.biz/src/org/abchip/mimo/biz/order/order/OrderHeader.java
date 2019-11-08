/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.accounting.payment.BillingAccount;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.order.shoppinglist.ShoppingList;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.biz.webapp.website.WebSite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getAgreementId <em>Agreement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getEntryDate <em>Entry Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getExternalId <em>External Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getFirstAttemptOrderId <em>First Attempt Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getGrandTotal <em>Grand Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getInternalCode <em>Internal Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#isInvoicePerShipment <em>Invoice Per Shipment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#isIsRushOrder <em>Is Rush Order</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#isIsViewed <em>Is Viewed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#isNeedsInventoryIssuance <em>Needs Inventory Issuance</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getOrderDate <em>Order Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getOrderName <em>Order Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getPickSheetPrintedDate <em>Pick Sheet Printed Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#isPriority <em>Priority</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getRemainingSubTotal <em>Remaining Sub Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getTerminalId <em>Terminal Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getTransactionId <em>Transaction Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getVisitId <em>Visit Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getOrderTypeId <em>Order Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getSalesChannelEnumId <em>Sales Channel Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getOriginFacilityId <em>Origin Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getBillingAccountId <em>Billing Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getAutoOrderShoppingListId <em>Auto Order Shopping List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getSyncStatusId <em>Sync Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getCurrencyUom <em>Currency Uom</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getWebSiteId <em>Web Site Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getCommunicationEventOrders <em>Communication Event Orders</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getOrderAttributes <em>Order Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getOrderDeliverySchedules <em>Order Delivery Schedules</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getOrderHeaderNotes <em>Order Header Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getOrderHeaderWorkEfforts <em>Order Header Work Efforts</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getOrderItems <em>Order Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getOrderItemGroups <em>Order Item Groups</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getOrderItemShipGroups <em>Order Item Ship Groups</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getOrderProductPromoCodes <em>Order Product Promo Codes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getProductPromoUses <em>Product Promo Uses</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderHeader#getTrackingCodeOrders <em>Tracking Code Orders</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader()
 * @model
 * @generated
 */
public interface OrderHeader extends BizEntityTyped<OrderType> {
	/**
	 * Returns the value of the '<em><b>Agreement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Id</em>' attribute.
	 * @see #setAgreementId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_AgreementId()
	 * @model
	 * @generated
	 */
	String getAgreementId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#getAgreementId <em>Agreement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Id</em>' attribute.
	 * @see #getAgreementId()
	 * @generated
	 */
	void setAgreementId(String value);

	/**
	 * Returns the value of the '<em><b>Auto Order Shopping List Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Order Shopping List Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Order Shopping List Id</em>' reference.
	 * @see #setAutoOrderShoppingListId(ShoppingList)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_AutoOrderShoppingListId()
	 * @model keys="shoppingListId"
	 * @generated
	 */
	ShoppingList getAutoOrderShoppingListId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#getAutoOrderShoppingListId <em>Auto Order Shopping List Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Order Shopping List Id</em>' reference.
	 * @see #getAutoOrderShoppingListId()
	 * @generated
	 */
	void setAutoOrderShoppingListId(ShoppingList value);

	/**
	 * Returns the value of the '<em><b>Billing Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Account Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Account Id</em>' reference.
	 * @see #setBillingAccountId(BillingAccount)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_BillingAccountId()
	 * @model keys="billingAccountId"
	 * @generated
	 */
	BillingAccount getBillingAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#getBillingAccountId <em>Billing Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Account Id</em>' reference.
	 * @see #getBillingAccountId()
	 * @generated
	 */
	void setBillingAccountId(BillingAccount value);

	/**
	 * Returns the value of the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By</em>' reference.
	 * @see #setCreatedBy(UserLogin)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_CreatedBy()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getCreatedBy();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#getCreatedBy <em>Created By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By</em>' reference.
	 * @see #getCreatedBy()
	 * @generated
	 */
	void setCreatedBy(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Currency Uom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom</em>' reference.
	 * @see #setCurrencyUom(Uom)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_CurrencyUom()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getCurrencyUom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#getCurrencyUom <em>Currency Uom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom</em>' reference.
	 * @see #getCurrencyUom()
	 * @generated
	 */
	void setCurrencyUom(Uom value);

	/**
	 * Returns the value of the '<em><b>Entry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Date</em>' attribute.
	 * @see #setEntryDate(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_EntryDate()
	 * @model
	 * @generated
	 */
	Date getEntryDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#getEntryDate <em>Entry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Date</em>' attribute.
	 * @see #getEntryDate()
	 * @generated
	 */
	void setEntryDate(Date value);

	/**
	 * Returns the value of the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Id</em>' attribute.
	 * @see #setExternalId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_ExternalId()
	 * @model
	 * @generated
	 */
	String getExternalId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#getExternalId <em>External Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Id</em>' attribute.
	 * @see #getExternalId()
	 * @generated
	 */
	void setExternalId(String value);

	/**
	 * Returns the value of the '<em><b>First Attempt Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Attempt Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Attempt Order Id</em>' attribute.
	 * @see #setFirstAttemptOrderId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_FirstAttemptOrderId()
	 * @model
	 * @generated
	 */
	String getFirstAttemptOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#getFirstAttemptOrderId <em>First Attempt Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Attempt Order Id</em>' attribute.
	 * @see #getFirstAttemptOrderId()
	 * @generated
	 */
	void setFirstAttemptOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Grand Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grand Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grand Total</em>' attribute.
	 * @see #setGrandTotal(BigDecimal)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_GrandTotal()
	 * @model
	 * @generated
	 */
	BigDecimal getGrandTotal();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#getGrandTotal <em>Grand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grand Total</em>' attribute.
	 * @see #getGrandTotal()
	 * @generated
	 */
	void setGrandTotal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Internal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Code</em>' attribute.
	 * @see #setInternalCode(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_InternalCode()
	 * @model
	 * @generated
	 */
	String getInternalCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#getInternalCode <em>Internal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Code</em>' attribute.
	 * @see #getInternalCode()
	 * @generated
	 */
	void setInternalCode(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Per Shipment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Per Shipment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Per Shipment</em>' attribute.
	 * @see #setInvoicePerShipment(boolean)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_InvoicePerShipment()
	 * @model
	 * @generated
	 */
	boolean isInvoicePerShipment();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#isInvoicePerShipment <em>Invoice Per Shipment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Per Shipment</em>' attribute.
	 * @see #isInvoicePerShipment()
	 * @generated
	 */
	void setInvoicePerShipment(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Rush Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Rush Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Rush Order</em>' attribute.
	 * @see #setIsRushOrder(boolean)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_IsRushOrder()
	 * @model
	 * @generated
	 */
	boolean isIsRushOrder();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#isIsRushOrder <em>Is Rush Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Rush Order</em>' attribute.
	 * @see #isIsRushOrder()
	 * @generated
	 */
	void setIsRushOrder(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Viewed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Viewed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Viewed</em>' attribute.
	 * @see #setIsViewed(boolean)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_IsViewed()
	 * @model
	 * @generated
	 */
	boolean isIsViewed();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#isIsViewed <em>Is Viewed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Viewed</em>' attribute.
	 * @see #isIsViewed()
	 * @generated
	 */
	void setIsViewed(boolean value);

	/**
	 * Returns the value of the '<em><b>Needs Inventory Issuance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needs Inventory Issuance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs Inventory Issuance</em>' attribute.
	 * @see #setNeedsInventoryIssuance(boolean)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_NeedsInventoryIssuance()
	 * @model
	 * @generated
	 */
	boolean isNeedsInventoryIssuance();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#isNeedsInventoryIssuance <em>Needs Inventory Issuance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Inventory Issuance</em>' attribute.
	 * @see #isNeedsInventoryIssuance()
	 * @generated
	 */
	void setNeedsInventoryIssuance(boolean value);

	/**
	 * Returns the value of the '<em><b>Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Date</em>' attribute.
	 * @see #setOrderDate(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_OrderDate()
	 * @model
	 * @generated
	 */
	Date getOrderDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#getOrderDate <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Date</em>' attribute.
	 * @see #getOrderDate()
	 * @generated
	 */
	void setOrderDate(Date value);

	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #setOrderId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_OrderId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Order Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Name</em>' attribute.
	 * @see #setOrderName(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_OrderName()
	 * @model
	 * @generated
	 */
	String getOrderName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#getOrderName <em>Order Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Name</em>' attribute.
	 * @see #getOrderName()
	 * @generated
	 */
	void setOrderName(String value);

	/**
	 * Returns the value of the '<em><b>Order Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Type Id</em>' reference.
	 * @see #setOrderTypeId(OrderType)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_OrderTypeId()
	 * @model keys="orderTypeId"
	 * @generated
	 */
	OrderType getOrderTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#getOrderTypeId <em>Order Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Type Id</em>' reference.
	 * @see #getOrderTypeId()
	 * @generated
	 */
	void setOrderTypeId(OrderType value);

	/**
	 * Returns the value of the '<em><b>Origin Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Facility Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Facility Id</em>' reference.
	 * @see #setOriginFacilityId(Facility)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_OriginFacilityId()
	 * @model keys="facilityId"
	 * @generated
	 */
	Facility getOriginFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#getOriginFacilityId <em>Origin Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Facility Id</em>' reference.
	 * @see #getOriginFacilityId()
	 * @generated
	 */
	void setOriginFacilityId(Facility value);

	/**
	 * Returns the value of the '<em><b>Pick Sheet Printed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pick Sheet Printed Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pick Sheet Printed Date</em>' attribute.
	 * @see #setPickSheetPrintedDate(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_PickSheetPrintedDate()
	 * @model
	 * @generated
	 */
	Date getPickSheetPrintedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#getPickSheetPrintedDate <em>Pick Sheet Printed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pick Sheet Printed Date</em>' attribute.
	 * @see #getPickSheetPrintedDate()
	 * @generated
	 */
	void setPickSheetPrintedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(boolean)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_Priority()
	 * @model
	 * @generated
	 */
	boolean isPriority();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#isPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #isPriority()
	 * @generated
	 */
	void setPriority(boolean value);

	/**
	 * Returns the value of the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' reference.
	 * @see #setProductStoreId(ProductStore)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_ProductStoreId()
	 * @model keys="productStoreId"
	 * @generated
	 */
	ProductStore getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#getProductStoreId <em>Product Store Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' reference.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(ProductStore value);

	/**
	 * Returns the value of the '<em><b>Remaining Sub Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remaining Sub Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Sub Total</em>' attribute.
	 * @see #setRemainingSubTotal(BigDecimal)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_RemainingSubTotal()
	 * @model
	 * @generated
	 */
	BigDecimal getRemainingSubTotal();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#getRemainingSubTotal <em>Remaining Sub Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Sub Total</em>' attribute.
	 * @see #getRemainingSubTotal()
	 * @generated
	 */
	void setRemainingSubTotal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Sales Channel Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Channel Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Channel Enum Id</em>' reference.
	 * @see #setSalesChannelEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_SalesChannelEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getSalesChannelEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#getSalesChannelEnumId <em>Sales Channel Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Channel Enum Id</em>' reference.
	 * @see #getSalesChannelEnumId()
	 * @generated
	 */
	void setSalesChannelEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' reference.
	 * @see #setStatusId(StatusItem)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_StatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#getStatusId <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' reference.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Sync Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sync Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync Status Id</em>' reference.
	 * @see #setSyncStatusId(StatusItem)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_SyncStatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getSyncStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#getSyncStatusId <em>Sync Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Status Id</em>' reference.
	 * @see #getSyncStatusId()
	 * @generated
	 */
	void setSyncStatusId(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Terminal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal Id</em>' attribute.
	 * @see #setTerminalId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_TerminalId()
	 * @model
	 * @generated
	 */
	String getTerminalId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#getTerminalId <em>Terminal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal Id</em>' attribute.
	 * @see #getTerminalId()
	 * @generated
	 */
	void setTerminalId(String value);

	/**
	 * Returns the value of the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Id</em>' attribute.
	 * @see #setTransactionId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_TransactionId()
	 * @model
	 * @generated
	 */
	String getTransactionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#getTransactionId <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Id</em>' attribute.
	 * @see #getTransactionId()
	 * @generated
	 */
	void setTransactionId(String value);

	/**
	 * Returns the value of the '<em><b>Visit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visit Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visit Id</em>' attribute.
	 * @see #setVisitId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_VisitId()
	 * @model
	 * @generated
	 */
	String getVisitId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#getVisitId <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visit Id</em>' attribute.
	 * @see #getVisitId()
	 * @generated
	 */
	void setVisitId(String value);

	/**
	 * Returns the value of the '<em><b>Web Site Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Site Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Site Id</em>' reference.
	 * @see #setWebSiteId(WebSite)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_WebSiteId()
	 * @model keys="webSiteId"
	 * @generated
	 */
	WebSite getWebSiteId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderHeader#getWebSiteId <em>Web Site Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Site Id</em>' reference.
	 * @see #getWebSiteId()
	 * @generated
	 */
	void setWebSiteId(WebSite value);

	/**
	 * Returns the value of the '<em><b>Communication Event Orders</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Event Orders</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event Orders</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_CommunicationEventOrders()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CommunicationEventOrder'"
	 * @generated
	 */
	List<String> getCommunicationEventOrders();

	/**
	 * Returns the value of the '<em><b>Order Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Attributes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Attributes</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_OrderAttributes()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderAttribute'"
	 * @generated
	 */
	List<String> getOrderAttributes();

	/**
	 * Returns the value of the '<em><b>Order Delivery Schedules</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Delivery Schedules</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Delivery Schedules</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_OrderDeliverySchedules()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderDeliverySchedule'"
	 * @generated
	 */
	List<String> getOrderDeliverySchedules();

	/**
	 * Returns the value of the '<em><b>Order Header Notes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Header Notes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Header Notes</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_OrderHeaderNotes()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderHeaderNote'"
	 * @generated
	 */
	List<String> getOrderHeaderNotes();

	/**
	 * Returns the value of the '<em><b>Order Header Work Efforts</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Header Work Efforts</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Header Work Efforts</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_OrderHeaderWorkEfforts()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderHeaderWorkEffort'"
	 * @generated
	 */
	List<String> getOrderHeaderWorkEfforts();

	/**
	 * Returns the value of the '<em><b>Order Items</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Items</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Items</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_OrderItems()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderItem'"
	 * @generated
	 */
	List<String> getOrderItems();

	/**
	 * Returns the value of the '<em><b>Order Item Groups</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Item Groups</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Groups</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_OrderItemGroups()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderItemGroup'"
	 * @generated
	 */
	List<String> getOrderItemGroups();

	/**
	 * Returns the value of the '<em><b>Order Item Ship Groups</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Item Ship Groups</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Ship Groups</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_OrderItemShipGroups()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderItemShipGroup'"
	 * @generated
	 */
	List<String> getOrderItemShipGroups();

	/**
	 * Returns the value of the '<em><b>Order Product Promo Codes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Product Promo Codes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Product Promo Codes</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_OrderProductPromoCodes()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderProductPromoCode'"
	 * @generated
	 */
	List<String> getOrderProductPromoCodes();

	/**
	 * Returns the value of the '<em><b>Product Promo Uses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Promo Uses</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Uses</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_ProductPromoUses()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductPromoUse'"
	 * @generated
	 */
	List<String> getProductPromoUses();

	/**
	 * Returns the value of the '<em><b>Tracking Code Orders</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracking Code Orders</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracking Code Orders</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderHeader_TrackingCodeOrders()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='TrackingCodeOrder'"
	 * @generated
	 */
	List<String> getTrackingCodeOrders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FixedAsset' route='acquireOrderId'"
	 * @generated
	 */
	List<String> acquireFixedAssets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='GiftCardFulfillment' route='orderId'"
	 * @generated
	 */
	List<String> giftCardFulfillments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ItemIssuance' route='orderId'"
	 * @generated
	 */
	List<String> itemIssuances();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderAdjustment' route='orderId'"
	 * @generated
	 */
	List<String> orderAdjustments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderItemChange' route='orderId'"
	 * @generated
	 */
	List<String> orderItemChanges();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderItemPriceInfo' route='orderId'"
	 * @generated
	 */
	List<String> orderItemPriceInfos();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderNotification' route='orderId'"
	 * @generated
	 */
	List<String> orderNotifications();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderPaymentPreference' route='orderId'"
	 * @generated
	 */
	List<String> orderPaymentPreferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderStatus' route='orderId'"
	 * @generated
	 */
	List<String> orderStatuss();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PicklistBin' route='primaryOrderId'"
	 * @generated
	 */
	List<String> primaryPicklistBins();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Shipment' route='primaryOrderId'"
	 * @generated
	 */
	List<String> primaryShipments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FixedAssetMaint' route='purchaseOrderId'"
	 * @generated
	 */
	List<String> purchaseFixedAssetMaints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ReturnItemResponse' route='replacementOrderId'"
	 * @generated
	 */
	List<String> replacementReturnItemResponses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ReturnItem' route='orderId'"
	 * @generated
	 */
	List<String> returnItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentReceipt' route='orderId'"
	 * @generated
	 */
	List<String> shipmentReceipts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Subscription' route='orderId'"
	 * @generated
	 */
	List<String> subscriptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SurveyResponse' route='orderId'"
	 * @generated
	 */
	List<String> surveyResponses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	boolean isApprovable();

} // OrderHeader
