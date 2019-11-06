/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.accounting.invoice.Invoice;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.order.order.OrderItemBilling;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.abchip.mimo.biz.shipment.issuance.ItemIssuance;
import org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Item Billing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemBillingImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemBillingImpl#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemBillingImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemBillingImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemBillingImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemBillingImpl#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemBillingImpl#getShipmentReceiptId <em>Shipment Receipt Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemBillingImpl#getItemIssuanceId <em>Item Issuance Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderItemBillingImpl extends BizEntityImpl implements OrderItemBilling {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getOrderItemSeqId() <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderItemSeqId() <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String orderItemSeqId = ORDER_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvoiceItemSeqId() <em>Invoice Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvoiceItemSeqId() <em>Invoice Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String invoiceItemSeqId = INVOICE_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantity = QUANTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected OrderHeader orderId;

	/**
	 * The cached value of the '{@link #getInvoiceId() <em>Invoice Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceId()
	 * @generated
	 * @ordered
	 */
	protected Invoice invoiceId;

	/**
	 * The cached value of the '{@link #getShipmentReceiptId() <em>Shipment Receipt Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentReceiptId()
	 * @generated
	 * @ordered
	 */
	protected ShipmentReceipt shipmentReceiptId;

	/**
	 * The cached value of the '{@link #getItemIssuanceId() <em>Item Issuance Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemIssuanceId()
	 * @generated
	 * @ordered
	 */
	protected ItemIssuance itemIssuanceId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderItemBillingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_ITEM_BILLING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(BigDecimal newAmount) {
		amount = newAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Invoice getInvoiceId() {
		if (invoiceId != null && ((EObject)invoiceId).eIsProxy()) {
			InternalEObject oldInvoiceId = (InternalEObject)invoiceId;
			invoiceId = (Invoice)eResolveProxy(oldInvoiceId);
			if (invoiceId != oldInvoiceId) {
			}
		}
		return invoiceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoice basicGetInvoiceId() {
		return invoiceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceId(Invoice newInvoiceId) {
		invoiceId = newInvoiceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceItemSeqId() {
		return invoiceItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceItemSeqId(String newInvoiceItemSeqId) {
		invoiceItemSeqId = newInvoiceItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemIssuance getItemIssuanceId() {
		if (itemIssuanceId != null && ((EObject)itemIssuanceId).eIsProxy()) {
			InternalEObject oldItemIssuanceId = (InternalEObject)itemIssuanceId;
			itemIssuanceId = (ItemIssuance)eResolveProxy(oldItemIssuanceId);
			if (itemIssuanceId != oldItemIssuanceId) {
			}
		}
		return itemIssuanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemIssuance basicGetItemIssuanceId() {
		return itemIssuanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemIssuanceId(ItemIssuance newItemIssuanceId) {
		itemIssuanceId = newItemIssuanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeader getOrderId() {
		if (orderId != null && ((EObject)orderId).eIsProxy()) {
			InternalEObject oldOrderId = (InternalEObject)orderId;
			orderId = (OrderHeader)eResolveProxy(oldOrderId);
			if (orderId != oldOrderId) {
			}
		}
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderHeader basicGetOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(OrderHeader newOrderId) {
		orderId = newOrderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return orderItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		orderItemSeqId = newOrderItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(BigDecimal newQuantity) {
		quantity = newQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentReceipt getShipmentReceiptId() {
		if (shipmentReceiptId != null && ((EObject)shipmentReceiptId).eIsProxy()) {
			InternalEObject oldShipmentReceiptId = (InternalEObject)shipmentReceiptId;
			shipmentReceiptId = (ShipmentReceipt)eResolveProxy(oldShipmentReceiptId);
			if (shipmentReceiptId != oldShipmentReceiptId) {
			}
		}
		return shipmentReceiptId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipmentReceipt basicGetShipmentReceiptId() {
		return shipmentReceiptId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentReceiptId(ShipmentReceipt newShipmentReceiptId) {
		shipmentReceiptId = newShipmentReceiptId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrderPackage.ORDER_ITEM_BILLING__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case OrderPackage.ORDER_ITEM_BILLING__INVOICE_ITEM_SEQ_ID:
				return getInvoiceItemSeqId();
			case OrderPackage.ORDER_ITEM_BILLING__AMOUNT:
				return getAmount();
			case OrderPackage.ORDER_ITEM_BILLING__QUANTITY:
				return getQuantity();
			case OrderPackage.ORDER_ITEM_BILLING__ORDER_ID:
				if (resolve) return getOrderId();
				return basicGetOrderId();
			case OrderPackage.ORDER_ITEM_BILLING__INVOICE_ID:
				if (resolve) return getInvoiceId();
				return basicGetInvoiceId();
			case OrderPackage.ORDER_ITEM_BILLING__SHIPMENT_RECEIPT_ID:
				if (resolve) return getShipmentReceiptId();
				return basicGetShipmentReceiptId();
			case OrderPackage.ORDER_ITEM_BILLING__ITEM_ISSUANCE_ID:
				if (resolve) return getItemIssuanceId();
				return basicGetItemIssuanceId();
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
			case OrderPackage.ORDER_ITEM_BILLING__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_BILLING__INVOICE_ITEM_SEQ_ID:
				setInvoiceItemSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_BILLING__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_ITEM_BILLING__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_ITEM_BILLING__ORDER_ID:
				setOrderId((OrderHeader)newValue);
				return;
			case OrderPackage.ORDER_ITEM_BILLING__INVOICE_ID:
				setInvoiceId((Invoice)newValue);
				return;
			case OrderPackage.ORDER_ITEM_BILLING__SHIPMENT_RECEIPT_ID:
				setShipmentReceiptId((ShipmentReceipt)newValue);
				return;
			case OrderPackage.ORDER_ITEM_BILLING__ITEM_ISSUANCE_ID:
				setItemIssuanceId((ItemIssuance)newValue);
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
			case OrderPackage.ORDER_ITEM_BILLING__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_BILLING__INVOICE_ITEM_SEQ_ID:
				setInvoiceItemSeqId(INVOICE_ITEM_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_BILLING__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_BILLING__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_BILLING__ORDER_ID:
				setOrderId((OrderHeader)null);
				return;
			case OrderPackage.ORDER_ITEM_BILLING__INVOICE_ID:
				setInvoiceId((Invoice)null);
				return;
			case OrderPackage.ORDER_ITEM_BILLING__SHIPMENT_RECEIPT_ID:
				setShipmentReceiptId((ShipmentReceipt)null);
				return;
			case OrderPackage.ORDER_ITEM_BILLING__ITEM_ISSUANCE_ID:
				setItemIssuanceId((ItemIssuance)null);
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
			case OrderPackage.ORDER_ITEM_BILLING__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case OrderPackage.ORDER_ITEM_BILLING__INVOICE_ITEM_SEQ_ID:
				return INVOICE_ITEM_SEQ_ID_EDEFAULT == null ? invoiceItemSeqId != null : !INVOICE_ITEM_SEQ_ID_EDEFAULT.equals(invoiceItemSeqId);
			case OrderPackage.ORDER_ITEM_BILLING__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case OrderPackage.ORDER_ITEM_BILLING__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case OrderPackage.ORDER_ITEM_BILLING__ORDER_ID:
				return orderId != null;
			case OrderPackage.ORDER_ITEM_BILLING__INVOICE_ID:
				return invoiceId != null;
			case OrderPackage.ORDER_ITEM_BILLING__SHIPMENT_RECEIPT_ID:
				return shipmentReceiptId != null;
			case OrderPackage.ORDER_ITEM_BILLING__ITEM_ISSUANCE_ID:
				return itemIssuanceId != null;
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
		result.append(" (orderItemSeqId: ");
		result.append(orderItemSeqId);
		result.append(", invoiceItemSeqId: ");
		result.append(invoiceItemSeqId);
		result.append(", amount: ");
		result.append(amount);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //OrderItemBillingImpl
