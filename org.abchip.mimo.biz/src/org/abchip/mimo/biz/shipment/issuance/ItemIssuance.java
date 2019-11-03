/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.issuance;

import java.math.BigDecimal;

import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Issuance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getItemIssuanceId <em>Item Issuance Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getCancelQuantity <em>Cancel Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getIssuedByUserLoginId <em>Issued By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getIssuedDateTime <em>Issued Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getMaintHistSeqId <em>Maint Hist Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.shipment.issuance.IssuancePackage#getItemIssuance()
 * @model
 * @generated
 */
public interface ItemIssuance extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Cancel Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Quantity</em>' attribute.
	 * @see #setCancelQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.issuance.IssuancePackage#getItemIssuance_CancelQuantity()
	 * @model
	 * @generated
	 */
	BigDecimal getCancelQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getCancelQuantity <em>Cancel Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Quantity</em>' attribute.
	 * @see #getCancelQuantity()
	 * @generated
	 */
	void setCancelQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Id</em>' attribute.
	 * @see #setFixedAssetId(String)
	 * @see org.abchip.mimo.biz.shipment.issuance.IssuancePackage#getItemIssuance_FixedAssetId()
	 * @model
	 * @generated
	 */
	String getFixedAssetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getFixedAssetId <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Id</em>' attribute.
	 * @see #getFixedAssetId()
	 * @generated
	 */
	void setFixedAssetId(String value);

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
	 * @see org.abchip.mimo.biz.shipment.issuance.IssuancePackage#getItemIssuance_InventoryItemId()
	 * @model annotation="mimo-ent-domain frame='InventoryItem'"
	 * @generated
	 */
	String getInventoryItemId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getInventoryItemId <em>Inventory Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item Id</em>' attribute.
	 * @see #getInventoryItemId()
	 * @generated
	 */
	void setInventoryItemId(String value);

	/**
	 * Returns the value of the '<em><b>Issued By User Login Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issued By User Login Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued By User Login Id</em>' attribute.
	 * @see #setIssuedByUserLoginId(String)
	 * @see org.abchip.mimo.biz.shipment.issuance.IssuancePackage#getItemIssuance_IssuedByUserLoginId()
	 * @model annotation="mimo-ent-domain frame='UserLogin'"
	 * @generated
	 */
	String getIssuedByUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getIssuedByUserLoginId <em>Issued By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued By User Login Id</em>' attribute.
	 * @see #getIssuedByUserLoginId()
	 * @generated
	 */
	void setIssuedByUserLoginId(String value);

	/**
	 * Returns the value of the '<em><b>Issued Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issued Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued Date Time</em>' attribute.
	 * @see #setIssuedDateTime(Date)
	 * @see org.abchip.mimo.biz.shipment.issuance.IssuancePackage#getItemIssuance_IssuedDateTime()
	 * @model
	 * @generated
	 */
	Date getIssuedDateTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getIssuedDateTime <em>Issued Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued Date Time</em>' attribute.
	 * @see #getIssuedDateTime()
	 * @generated
	 */
	void setIssuedDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Item Issuance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Issuance Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Issuance Id</em>' attribute.
	 * @see #setItemIssuanceId(String)
	 * @see org.abchip.mimo.biz.shipment.issuance.IssuancePackage#getItemIssuance_ItemIssuanceId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getItemIssuanceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getItemIssuanceId <em>Item Issuance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Issuance Id</em>' attribute.
	 * @see #getItemIssuanceId()
	 * @generated
	 */
	void setItemIssuanceId(String value);

	/**
	 * Returns the value of the '<em><b>Maint Hist Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maint Hist Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maint Hist Seq Id</em>' attribute.
	 * @see #setMaintHistSeqId(String)
	 * @see org.abchip.mimo.biz.shipment.issuance.IssuancePackage#getItemIssuance_MaintHistSeqId()
	 * @model
	 * @generated
	 */
	String getMaintHistSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getMaintHistSeqId <em>Maint Hist Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maint Hist Seq Id</em>' attribute.
	 * @see #getMaintHistSeqId()
	 * @generated
	 */
	void setMaintHistSeqId(String value);

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
	 * @see org.abchip.mimo.biz.shipment.issuance.IssuancePackage#getItemIssuance_OrderId()
	 * @model annotation="mimo-ent-domain frame='OrderHeader'"
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getOrderId <em>Order Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.shipment.issuance.IssuancePackage#getItemIssuance_OrderItemSeqId()
	 * @model
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #getOrderItemSeqId()
	 * @generated
	 */
	void setOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.issuance.IssuancePackage#getItemIssuance_Quantity()
	 * @model
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.shipment.issuance.IssuancePackage#getItemIssuance_ShipGroupSeqId()
	 * @model
	 * @generated
	 */
	String getShipGroupSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getShipGroupSeqId <em>Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship Group Seq Id</em>' attribute.
	 * @see #getShipGroupSeqId()
	 * @generated
	 */
	void setShipGroupSeqId(String value);

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
	 * @see org.abchip.mimo.biz.shipment.issuance.IssuancePackage#getItemIssuance_ShipmentId()
	 * @model annotation="mimo-ent-domain frame='Shipment'"
	 * @generated
	 */
	String getShipmentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getShipmentId <em>Shipment Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.shipment.issuance.IssuancePackage#getItemIssuance_ShipmentItemSeqId()
	 * @model
	 * @generated
	 */
	String getShipmentItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.issuance.ItemIssuance#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Item Seq Id</em>' attribute.
	 * @see #getShipmentItemSeqId()
	 * @generated
	 */
	void setShipmentItemSeqId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InventoryItemDetail' route='itemIssuanceId'"
	 * @generated
	 */
	List<String> inventoryItemDetails();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InventoryTransfer' route='itemIssuanceId'"
	 * @generated
	 */
	List<String> inventoryTransfers();

} // ItemIssuance
