/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.return_.ReturnItemBilling;
import org.abchip.mimo.biz.order.return_.ReturnPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Item Billing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemBillingImpl#getReturnId <em>Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemBillingImpl#getReturnItemSeqId <em>Return Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemBillingImpl#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemBillingImpl#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemBillingImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemBillingImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemBillingImpl#getShipmentReceiptId <em>Shipment Receipt Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnItemBillingImpl extends BizEntityImpl implements ReturnItemBilling {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getReturnId() <em>Return Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnId()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnId() <em>Return Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnId()
	 * @generated
	 * @ordered
	 */
	protected String returnId = RETURN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnItemSeqId() <em>Return Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnItemSeqId() <em>Return Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String returnItemSeqId = RETURN_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvoiceId() <em>Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvoiceId() <em>Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceId()
	 * @generated
	 * @ordered
	 */
	protected String invoiceId = INVOICE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getShipmentReceiptId() <em>Shipment Receipt Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentReceiptId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_RECEIPT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentReceiptId() <em>Shipment Receipt Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentReceiptId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentReceiptId = SHIPMENT_RECEIPT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnItemBillingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReturnPackage.Literals.RETURN_ITEM_BILLING;
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
		BigDecimal oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM_BILLING__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceId() {
		return invoiceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceId(String newInvoiceId) {
		String oldInvoiceId = invoiceId;
		invoiceId = newInvoiceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM_BILLING__INVOICE_ID, oldInvoiceId, invoiceId));
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
		String oldInvoiceItemSeqId = invoiceItemSeqId;
		invoiceItemSeqId = newInvoiceItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM_BILLING__INVOICE_ITEM_SEQ_ID, oldInvoiceItemSeqId, invoiceItemSeqId));
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
		BigDecimal oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM_BILLING__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnId() {
		return returnId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnId(String newReturnId) {
		String oldReturnId = returnId;
		returnId = newReturnId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM_BILLING__RETURN_ID, oldReturnId, returnId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnItemSeqId() {
		return returnItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnItemSeqId(String newReturnItemSeqId) {
		String oldReturnItemSeqId = returnItemSeqId;
		returnItemSeqId = newReturnItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM_BILLING__RETURN_ITEM_SEQ_ID, oldReturnItemSeqId, returnItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentReceiptId() {
		return shipmentReceiptId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentReceiptId(String newShipmentReceiptId) {
		String oldShipmentReceiptId = shipmentReceiptId;
		shipmentReceiptId = newShipmentReceiptId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM_BILLING__SHIPMENT_RECEIPT_ID, oldShipmentReceiptId, shipmentReceiptId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReturnPackage.RETURN_ITEM_BILLING__RETURN_ID:
				return getReturnId();
			case ReturnPackage.RETURN_ITEM_BILLING__RETURN_ITEM_SEQ_ID:
				return getReturnItemSeqId();
			case ReturnPackage.RETURN_ITEM_BILLING__INVOICE_ID:
				return getInvoiceId();
			case ReturnPackage.RETURN_ITEM_BILLING__INVOICE_ITEM_SEQ_ID:
				return getInvoiceItemSeqId();
			case ReturnPackage.RETURN_ITEM_BILLING__AMOUNT:
				return getAmount();
			case ReturnPackage.RETURN_ITEM_BILLING__QUANTITY:
				return getQuantity();
			case ReturnPackage.RETURN_ITEM_BILLING__SHIPMENT_RECEIPT_ID:
				return getShipmentReceiptId();
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
			case ReturnPackage.RETURN_ITEM_BILLING__RETURN_ID:
				setReturnId((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM_BILLING__RETURN_ITEM_SEQ_ID:
				setReturnItemSeqId((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM_BILLING__INVOICE_ID:
				setInvoiceId((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM_BILLING__INVOICE_ITEM_SEQ_ID:
				setInvoiceItemSeqId((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM_BILLING__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case ReturnPackage.RETURN_ITEM_BILLING__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case ReturnPackage.RETURN_ITEM_BILLING__SHIPMENT_RECEIPT_ID:
				setShipmentReceiptId((String)newValue);
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
			case ReturnPackage.RETURN_ITEM_BILLING__RETURN_ID:
				setReturnId(RETURN_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM_BILLING__RETURN_ITEM_SEQ_ID:
				setReturnItemSeqId(RETURN_ITEM_SEQ_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM_BILLING__INVOICE_ID:
				setInvoiceId(INVOICE_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM_BILLING__INVOICE_ITEM_SEQ_ID:
				setInvoiceItemSeqId(INVOICE_ITEM_SEQ_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM_BILLING__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM_BILLING__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM_BILLING__SHIPMENT_RECEIPT_ID:
				setShipmentReceiptId(SHIPMENT_RECEIPT_ID_EDEFAULT);
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
			case ReturnPackage.RETURN_ITEM_BILLING__RETURN_ID:
				return RETURN_ID_EDEFAULT == null ? returnId != null : !RETURN_ID_EDEFAULT.equals(returnId);
			case ReturnPackage.RETURN_ITEM_BILLING__RETURN_ITEM_SEQ_ID:
				return RETURN_ITEM_SEQ_ID_EDEFAULT == null ? returnItemSeqId != null : !RETURN_ITEM_SEQ_ID_EDEFAULT.equals(returnItemSeqId);
			case ReturnPackage.RETURN_ITEM_BILLING__INVOICE_ID:
				return INVOICE_ID_EDEFAULT == null ? invoiceId != null : !INVOICE_ID_EDEFAULT.equals(invoiceId);
			case ReturnPackage.RETURN_ITEM_BILLING__INVOICE_ITEM_SEQ_ID:
				return INVOICE_ITEM_SEQ_ID_EDEFAULT == null ? invoiceItemSeqId != null : !INVOICE_ITEM_SEQ_ID_EDEFAULT.equals(invoiceItemSeqId);
			case ReturnPackage.RETURN_ITEM_BILLING__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case ReturnPackage.RETURN_ITEM_BILLING__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case ReturnPackage.RETURN_ITEM_BILLING__SHIPMENT_RECEIPT_ID:
				return SHIPMENT_RECEIPT_ID_EDEFAULT == null ? shipmentReceiptId != null : !SHIPMENT_RECEIPT_ID_EDEFAULT.equals(shipmentReceiptId);
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
		result.append(" (returnId: ");
		result.append(returnId);
		result.append(", returnItemSeqId: ");
		result.append(returnItemSeqId);
		result.append(", invoiceId: ");
		result.append(invoiceId);
		result.append(", invoiceItemSeqId: ");
		result.append(invoiceItemSeqId);
		result.append(", amount: ");
		result.append(amount);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", shipmentReceiptId: ");
		result.append(shipmentReceiptId);
		result.append(')');
		return result.toString();
	}

} //ReturnItemBillingImpl
