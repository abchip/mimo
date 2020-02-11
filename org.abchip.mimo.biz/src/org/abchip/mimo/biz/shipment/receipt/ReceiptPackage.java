/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.receipt;

import org.abchip.mimo.biz.BizPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.shipment.receipt.ReceiptFactory
 * @model kind="package"
 * @generated
 */
public interface ReceiptPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "receipt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/shipment/receipt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-receipt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReceiptPackage eINSTANCE = org.abchip.mimo.biz.shipment.receipt.impl.ReceiptPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.receipt.impl.RejectionReasonImpl <em>Rejection Reason</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.receipt.impl.RejectionReasonImpl
	 * @see org.abchip.mimo.biz.shipment.receipt.impl.ReceiptPackageImpl#getRejectionReason()
	 * @generated
	 */
	int REJECTION_REASON = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECTION_REASON__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECTION_REASON__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECTION_REASON__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECTION_REASON__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Rejection Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECTION_REASON__REJECTION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECTION_REASON__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rejection Reason</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECTION_REASON_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl <em>Shipment Receipt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl
	 * @see org.abchip.mimo.biz.shipment.receipt.impl.ReceiptPackageImpl#getShipmentReceipt()
	 * @generated
	 */
	int SHIPMENT_RECEIPT = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Receipt Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__RECEIPT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datetime Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__DATETIME_RECEIVED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inventory Item Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__INVENTORY_ITEM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Item Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__ITEM_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__ORDER_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__ORDER_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Quantity Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__QUANTITY_ACCEPTED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Quantity Rejected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__QUANTITY_REJECTED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Received By User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__RECEIVED_BY_USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Rejection Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__REJECTION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Return Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__RETURN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Return Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__RETURN_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Shipment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__SHIPMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Shipment Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__SHIPMENT_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Shipment Package Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT__SHIPMENT_PACKAGE_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Shipment Receipt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptRoleImpl <em>Shipment Receipt Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptRoleImpl
	 * @see org.abchip.mimo.biz.shipment.receipt.impl.ReceiptPackageImpl#getShipmentReceiptRole()
	 * @generated
	 */
	int SHIPMENT_RECEIPT_ROLE = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT_ROLE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT_ROLE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT_ROLE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT_ROLE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Receipt Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT_ROLE__RECEIPT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT_ROLE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT_ROLE__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Shipment Receipt Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_RECEIPT_ROLE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.receipt.RejectionReason <em>Rejection Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rejection Reason</em>'.
	 * @see org.abchip.mimo.biz.shipment.receipt.RejectionReason
	 * @generated
	 */
	EClass getRejectionReason();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.receipt.RejectionReason#getRejectionId <em>Rejection Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rejection Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.receipt.RejectionReason#getRejectionId()
	 * @see #getRejectionReason()
	 * @generated
	 */
	EAttribute getRejectionReason_RejectionId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.receipt.RejectionReason#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.shipment.receipt.RejectionReason#getDescription()
	 * @see #getRejectionReason()
	 * @generated
	 */
	EAttribute getRejectionReason_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt <em>Shipment Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Receipt</em>'.
	 * @see org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt
	 * @generated
	 */
	EClass getShipmentReceipt();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getReceiptId <em>Receipt Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Receipt Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getReceiptId()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EAttribute getShipmentReceipt_ReceiptId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getDatetimeReceived <em>Datetime Received</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datetime Received</em>'.
	 * @see org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getDatetimeReceived()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EAttribute getShipmentReceipt_DatetimeReceived();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getInventoryItemId <em>Inventory Item Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Item Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getInventoryItemId()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EReference getShipmentReceipt_InventoryItemId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getItemDescription <em>Item Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Description</em>'.
	 * @see org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getItemDescription()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EAttribute getShipmentReceipt_ItemDescription();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getOrderId()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EReference getShipmentReceipt_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getOrderItemSeqId()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EAttribute getShipmentReceipt_OrderItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getProductId()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EReference getShipmentReceipt_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getQuantityAccepted <em>Quantity Accepted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity Accepted</em>'.
	 * @see org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getQuantityAccepted()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EAttribute getShipmentReceipt_QuantityAccepted();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getQuantityRejected <em>Quantity Rejected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity Rejected</em>'.
	 * @see org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getQuantityRejected()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EAttribute getShipmentReceipt_QuantityRejected();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getReceivedByUserLoginId <em>Received By User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Received By User Login Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getReceivedByUserLoginId()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EReference getShipmentReceipt_ReceivedByUserLoginId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getRejectionId <em>Rejection Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rejection Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getRejectionId()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EReference getShipmentReceipt_RejectionId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getReturnId <em>Return Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getReturnId()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EAttribute getShipmentReceipt_ReturnId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getReturnItemSeqId <em>Return Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getReturnItemSeqId()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EAttribute getShipmentReceipt_ReturnItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getShipmentId <em>Shipment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getShipmentId()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EReference getShipmentReceipt_ShipmentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getShipmentItemSeqId()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EAttribute getShipmentReceipt_ShipmentItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getShipmentPackageSeqId <em>Shipment Package Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Package Seq Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt#getShipmentPackageSeqId()
	 * @see #getShipmentReceipt()
	 * @generated
	 */
	EAttribute getShipmentReceipt_ShipmentPackageSeqId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceiptRole <em>Shipment Receipt Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Receipt Role</em>'.
	 * @see org.abchip.mimo.biz.shipment.receipt.ShipmentReceiptRole
	 * @generated
	 */
	EClass getShipmentReceiptRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceiptRole#getReceiptId <em>Receipt Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receipt Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.receipt.ShipmentReceiptRole#getReceiptId()
	 * @see #getShipmentReceiptRole()
	 * @generated
	 */
	EReference getShipmentReceiptRole_ReceiptId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceiptRole#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.receipt.ShipmentReceiptRole#getPartyId()
	 * @see #getShipmentReceiptRole()
	 * @generated
	 */
	EReference getShipmentReceiptRole_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.receipt.ShipmentReceiptRole#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.receipt.ShipmentReceiptRole#getRoleTypeId()
	 * @see #getShipmentReceiptRole()
	 * @generated
	 */
	EAttribute getShipmentReceiptRole_RoleTypeId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReceiptFactory getReceiptFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.receipt.impl.RejectionReasonImpl <em>Rejection Reason</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.receipt.impl.RejectionReasonImpl
		 * @see org.abchip.mimo.biz.shipment.receipt.impl.ReceiptPackageImpl#getRejectionReason()
		 * @generated
		 */
		EClass REJECTION_REASON = eINSTANCE.getRejectionReason();

		/**
		 * The meta object literal for the '<em><b>Rejection Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REJECTION_REASON__REJECTION_ID = eINSTANCE.getRejectionReason_RejectionId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REJECTION_REASON__DESCRIPTION = eINSTANCE.getRejectionReason_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl <em>Shipment Receipt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptImpl
		 * @see org.abchip.mimo.biz.shipment.receipt.impl.ReceiptPackageImpl#getShipmentReceipt()
		 * @generated
		 */
		EClass SHIPMENT_RECEIPT = eINSTANCE.getShipmentReceipt();

		/**
		 * The meta object literal for the '<em><b>Receipt Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_RECEIPT__RECEIPT_ID = eINSTANCE.getShipmentReceipt_ReceiptId();

		/**
		 * The meta object literal for the '<em><b>Datetime Received</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_RECEIPT__DATETIME_RECEIVED = eINSTANCE.getShipmentReceipt_DatetimeReceived();

		/**
		 * The meta object literal for the '<em><b>Inventory Item Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECEIPT__INVENTORY_ITEM_ID = eINSTANCE.getShipmentReceipt_InventoryItemId();

		/**
		 * The meta object literal for the '<em><b>Item Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_RECEIPT__ITEM_DESCRIPTION = eINSTANCE.getShipmentReceipt_ItemDescription();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECEIPT__ORDER_ID = eINSTANCE.getShipmentReceipt_OrderId();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_RECEIPT__ORDER_ITEM_SEQ_ID = eINSTANCE.getShipmentReceipt_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECEIPT__PRODUCT_ID = eINSTANCE.getShipmentReceipt_ProductId();

		/**
		 * The meta object literal for the '<em><b>Quantity Accepted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_RECEIPT__QUANTITY_ACCEPTED = eINSTANCE.getShipmentReceipt_QuantityAccepted();

		/**
		 * The meta object literal for the '<em><b>Quantity Rejected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_RECEIPT__QUANTITY_REJECTED = eINSTANCE.getShipmentReceipt_QuantityRejected();

		/**
		 * The meta object literal for the '<em><b>Received By User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECEIPT__RECEIVED_BY_USER_LOGIN_ID = eINSTANCE.getShipmentReceipt_ReceivedByUserLoginId();

		/**
		 * The meta object literal for the '<em><b>Rejection Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECEIPT__REJECTION_ID = eINSTANCE.getShipmentReceipt_RejectionId();

		/**
		 * The meta object literal for the '<em><b>Return Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_RECEIPT__RETURN_ID = eINSTANCE.getShipmentReceipt_ReturnId();

		/**
		 * The meta object literal for the '<em><b>Return Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_RECEIPT__RETURN_ITEM_SEQ_ID = eINSTANCE.getShipmentReceipt_ReturnItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Shipment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECEIPT__SHIPMENT_ID = eINSTANCE.getShipmentReceipt_ShipmentId();

		/**
		 * The meta object literal for the '<em><b>Shipment Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_RECEIPT__SHIPMENT_ITEM_SEQ_ID = eINSTANCE.getShipmentReceipt_ShipmentItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Shipment Package Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_RECEIPT__SHIPMENT_PACKAGE_SEQ_ID = eINSTANCE.getShipmentReceipt_ShipmentPackageSeqId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptRoleImpl <em>Shipment Receipt Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.receipt.impl.ShipmentReceiptRoleImpl
		 * @see org.abchip.mimo.biz.shipment.receipt.impl.ReceiptPackageImpl#getShipmentReceiptRole()
		 * @generated
		 */
		EClass SHIPMENT_RECEIPT_ROLE = eINSTANCE.getShipmentReceiptRole();

		/**
		 * The meta object literal for the '<em><b>Receipt Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECEIPT_ROLE__RECEIPT_ID = eINSTANCE.getShipmentReceiptRole_ReceiptId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_RECEIPT_ROLE__PARTY_ID = eINSTANCE.getShipmentReceiptRole_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_RECEIPT_ROLE__ROLE_TYPE_ID = eINSTANCE.getShipmentReceiptRole_RoleTypeId();

	}

} //ReceiptPackage
