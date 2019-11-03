/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.picklist;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Picklist Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.PicklistItem#getPicklistBinId <em>Picklist Bin Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.PicklistItem#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.PicklistItem#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.PicklistItem#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.PicklistItem#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.PicklistItem#getItemStatusId <em>Item Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.PicklistItem#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklistItem()
 * @model
 * @generated
 */
public interface PicklistItem extends BizEntity {
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
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklistItem_InventoryItemId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='InventoryItem'"
	 * @generated
	 */
	String getInventoryItemId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.PicklistItem#getInventoryItemId <em>Inventory Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item Id</em>' attribute.
	 * @see #getInventoryItemId()
	 * @generated
	 */
	void setInventoryItemId(String value);

	/**
	 * Returns the value of the '<em><b>Item Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Status Id</em>' attribute.
	 * @see #setItemStatusId(String)
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklistItem_ItemStatusId()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getItemStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.PicklistItem#getItemStatusId <em>Item Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Status Id</em>' attribute.
	 * @see #getItemStatusId()
	 * @generated
	 */
	void setItemStatusId(String value);

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
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklistItem_OrderId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='OrderHeader'"
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.PicklistItem#getOrderId <em>Order Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklistItem_OrderItemSeqId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.PicklistItem#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #getOrderItemSeqId()
	 * @generated
	 */
	void setOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Picklist Bin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Picklist Bin Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picklist Bin Id</em>' attribute.
	 * @see #setPicklistBinId(String)
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklistItem_PicklistBinId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='PicklistBin'"
	 * @generated
	 */
	String getPicklistBinId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.PicklistItem#getPicklistBinId <em>Picklist Bin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Picklist Bin Id</em>' attribute.
	 * @see #getPicklistBinId()
	 * @generated
	 */
	void setPicklistBinId(String value);

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
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklistItem_Quantity()
	 * @model
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.PicklistItem#getQuantity <em>Quantity</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistPackage#getPicklistItem_ShipGroupSeqId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getShipGroupSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.picklist.PicklistItem#getShipGroupSeqId <em>Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship Group Seq Id</em>' attribute.
	 * @see #getShipGroupSeqId()
	 * @generated
	 */
	void setShipGroupSeqId(String value);

} // PicklistItem
