/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.receipt;

import java.math.BigDecimal;

import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Receipt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getReceiptId <em>Receipt Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getDatetimeReceived <em>Datetime Received</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getItemDescription <em>Item Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getQuantityAccepted <em>Quantity Accepted</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getQuantityRejected <em>Quantity Rejected</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getReceivedByUserLoginId <em>Received By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getRejectionId <em>Rejection Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getReturnId <em>Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getReturnItemSeqId <em>Return Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getShipmentPackageSeqId <em>Shipment Package Seq Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.shipment.receipt.ReceiptPackage#getShipmentReceipt()
 * @model
 * @generated
 */
public interface ShipmentReceipt extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Datetime Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datetime Received</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datetime Received</em>' attribute.
	 * @see #setDatetimeReceived(Date)
	 * @see org.abchip.mimo.biz.shipment.receipt.ReceiptPackage#getShipmentReceipt_DatetimeReceived()
	 * @model
	 * @generated
	 */
	Date getDatetimeReceived();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getDatetimeReceived <em>Datetime Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datetime Received</em>' attribute.
	 * @see #getDatetimeReceived()
	 * @generated
	 */
	void setDatetimeReceived(Date value);

	/**
	 * Returns the value of the '<em><b>Inventory Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Item Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Id</em>' attribute.
	 * @see #setInventoryItemId(String)
	 * @see org.abchip.mimo.biz.shipment.receipt.ReceiptPackage#getShipmentReceipt_InventoryItemId()
	 * @model annotation="mimo-ent-domain frame='InventoryItem'"
	 * @generated
	 */
	String getInventoryItemId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getInventoryItemId <em>Inventory Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item Id</em>' attribute.
	 * @see #getInventoryItemId()
	 * @generated
	 */
	void setInventoryItemId(String value);

	/**
	 * Returns the value of the '<em><b>Item Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Description</em>' attribute.
	 * @see #setItemDescription(String)
	 * @see org.abchip.mimo.biz.shipment.receipt.ReceiptPackage#getShipmentReceipt_ItemDescription()
	 * @model
	 * @generated
	 */
	String getItemDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getItemDescription <em>Item Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Description</em>' attribute.
	 * @see #getItemDescription()
	 * @generated
	 */
	void setItemDescription(String value);

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
	 * @see org.abchip.mimo.biz.shipment.receipt.ReceiptPackage#getShipmentReceipt_OrderId()
	 * @model annotation="mimo-ent-domain frame='OrderHeader'"
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #setOrderItemSeqId(String)
	 * @see org.abchip.mimo.biz.shipment.receipt.ReceiptPackage#getShipmentReceipt_OrderItemSeqId()
	 * @model
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #getOrderItemSeqId()
	 * @generated
	 */
	void setOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see org.abchip.mimo.biz.shipment.receipt.ReceiptPackage#getShipmentReceipt_ProductId()
	 * @model annotation="mimo-ent-domain frame='Product'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

	/**
	 * Returns the value of the '<em><b>Quantity Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Accepted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Accepted</em>' attribute.
	 * @see #setQuantityAccepted(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.receipt.ReceiptPackage#getShipmentReceipt_QuantityAccepted()
	 * @model
	 * @generated
	 */
	BigDecimal getQuantityAccepted();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getQuantityAccepted <em>Quantity Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Accepted</em>' attribute.
	 * @see #getQuantityAccepted()
	 * @generated
	 */
	void setQuantityAccepted(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Quantity Rejected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Rejected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Rejected</em>' attribute.
	 * @see #setQuantityRejected(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.receipt.ReceiptPackage#getShipmentReceipt_QuantityRejected()
	 * @model
	 * @generated
	 */
	BigDecimal getQuantityRejected();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getQuantityRejected <em>Quantity Rejected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Rejected</em>' attribute.
	 * @see #getQuantityRejected()
	 * @generated
	 */
	void setQuantityRejected(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Receipt Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipt Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipt Id</em>' attribute.
	 * @see #setReceiptId(String)
	 * @see org.abchip.mimo.biz.shipment.receipt.ReceiptPackage#getShipmentReceipt_ReceiptId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getReceiptId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getReceiptId <em>Receipt Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receipt Id</em>' attribute.
	 * @see #getReceiptId()
	 * @generated
	 */
	void setReceiptId(String value);

	/**
	 * Returns the value of the '<em><b>Received By User Login Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received By User Login Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received By User Login Id</em>' attribute.
	 * @see #setReceivedByUserLoginId(String)
	 * @see org.abchip.mimo.biz.shipment.receipt.ReceiptPackage#getShipmentReceipt_ReceivedByUserLoginId()
	 * @model annotation="mimo-ent-domain frame='UserLogin'"
	 * @generated
	 */
	String getReceivedByUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getReceivedByUserLoginId <em>Received By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received By User Login Id</em>' attribute.
	 * @see #getReceivedByUserLoginId()
	 * @generated
	 */
	void setReceivedByUserLoginId(String value);

	/**
	 * Returns the value of the '<em><b>Rejection Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rejection Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rejection Id</em>' attribute.
	 * @see #setRejectionId(String)
	 * @see org.abchip.mimo.biz.shipment.receipt.ReceiptPackage#getShipmentReceipt_RejectionId()
	 * @model annotation="mimo-ent-domain frame='RejectionReason'"
	 * @generated
	 */
	String getRejectionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getRejectionId <em>Rejection Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rejection Id</em>' attribute.
	 * @see #getRejectionId()
	 * @generated
	 */
	void setRejectionId(String value);

	/**
	 * Returns the value of the '<em><b>Return Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Id</em>' attribute.
	 * @see #setReturnId(String)
	 * @see org.abchip.mimo.biz.shipment.receipt.ReceiptPackage#getShipmentReceipt_ReturnId()
	 * @model
	 * @generated
	 */
	String getReturnId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getReturnId <em>Return Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Id</em>' attribute.
	 * @see #getReturnId()
	 * @generated
	 */
	void setReturnId(String value);

	/**
	 * Returns the value of the '<em><b>Return Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Item Seq Id</em>' attribute.
	 * @see #setReturnItemSeqId(String)
	 * @see org.abchip.mimo.biz.shipment.receipt.ReceiptPackage#getShipmentReceipt_ReturnItemSeqId()
	 * @model
	 * @generated
	 */
	String getReturnItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getReturnItemSeqId <em>Return Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Item Seq Id</em>' attribute.
	 * @see #getReturnItemSeqId()
	 * @generated
	 */
	void setReturnItemSeqId(String value);

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
	 * @see org.abchip.mimo.biz.shipment.receipt.ReceiptPackage#getShipmentReceipt_ShipmentId()
	 * @model annotation="mimo-ent-domain frame='Shipment'"
	 * @generated
	 */
	String getShipmentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getShipmentId <em>Shipment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Id</em>' attribute.
	 * @see #getShipmentId()
	 * @generated
	 */
	void setShipmentId(String value);

	/**
	 * Returns the value of the '<em><b>Shipment Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Item Seq Id</em>' attribute.
	 * @see #setShipmentItemSeqId(String)
	 * @see org.abchip.mimo.biz.shipment.receipt.ReceiptPackage#getShipmentReceipt_ShipmentItemSeqId()
	 * @model
	 * @generated
	 */
	String getShipmentItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Item Seq Id</em>' attribute.
	 * @see #getShipmentItemSeqId()
	 * @generated
	 */
	void setShipmentItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Shipment Package Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Package Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Package Seq Id</em>' attribute.
	 * @see #setShipmentPackageSeqId(String)
	 * @see org.abchip.mimo.biz.shipment.receipt.ReceiptPackage#getShipmentReceipt_ShipmentPackageSeqId()
	 * @model
	 * @generated
	 */
	String getShipmentPackageSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getShipmentPackageSeqId <em>Shipment Package Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Package Seq Id</em>' attribute.
	 * @see #getShipmentPackageSeqId()
	 * @generated
	 */
	void setShipmentPackageSeqId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='AcctgTrans' route='receiptId'"
	 * @generated
	 */
	List<String> acctgTranss();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InventoryItemDetail' route='receiptId'"
	 * @generated
	 */
	List<String> inventoryItemDetails();

} // ShipmentReceipt
