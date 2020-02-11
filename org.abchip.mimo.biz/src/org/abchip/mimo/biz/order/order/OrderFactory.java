/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.order.order.OrderPackage
 * @generated
 */
public interface OrderFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrderFactory eINSTANCE = org.abchip.mimo.biz.order.order.impl.OrderFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Communication Event Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Event Order</em>'.
	 * @generated
	 */
	CommunicationEventOrder createCommunicationEventOrder();

	/**
	 * Returns a new object of class '<em>Adjustment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adjustment</em>'.
	 * @generated
	 */
	OrderAdjustment createOrderAdjustment();

	/**
	 * Returns a new object of class '<em>Adjustment Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adjustment Attribute</em>'.
	 * @generated
	 */
	OrderAdjustmentAttribute createOrderAdjustmentAttribute();

	/**
	 * Returns a new object of class '<em>Adjustment Billing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adjustment Billing</em>'.
	 * @generated
	 */
	OrderAdjustmentBilling createOrderAdjustmentBilling();

	/**
	 * Returns a new object of class '<em>Adjustment Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adjustment Type</em>'.
	 * @generated
	 */
	OrderAdjustmentType createOrderAdjustmentType();

	/**
	 * Returns a new object of class '<em>Adjustment Type Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adjustment Type Attr</em>'.
	 * @generated
	 */
	OrderAdjustmentTypeAttr createOrderAdjustmentTypeAttr();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	OrderAttribute createOrderAttribute();

	/**
	 * Returns a new object of class '<em>Blacklist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blacklist</em>'.
	 * @generated
	 */
	OrderBlacklist createOrderBlacklist();

	/**
	 * Returns a new object of class '<em>Blacklist Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blacklist Type</em>'.
	 * @generated
	 */
	OrderBlacklistType createOrderBlacklistType();

	/**
	 * Returns a new object of class '<em>Contact Mech</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Mech</em>'.
	 * @generated
	 */
	OrderContactMech createOrderContactMech();

	/**
	 * Returns a new object of class '<em>Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content</em>'.
	 * @generated
	 */
	OrderContent createOrderContent();

	/**
	 * Returns a new object of class '<em>Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Type</em>'.
	 * @generated
	 */
	OrderContentType createOrderContentType();

	/**
	 * Returns a new object of class '<em>Delivery Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delivery Schedule</em>'.
	 * @generated
	 */
	OrderDeliverySchedule createOrderDeliverySchedule();

	/**
	 * Returns a new object of class '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header</em>'.
	 * @generated
	 */
	OrderHeader createOrderHeader();

	/**
	 * Returns a new object of class '<em>Header Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Note</em>'.
	 * @generated
	 */
	OrderHeaderNote createOrderHeaderNote();

	/**
	 * Returns a new object of class '<em>Header Work Effort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Work Effort</em>'.
	 * @generated
	 */
	OrderHeaderWorkEffort createOrderHeaderWorkEffort();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	OrderItem createOrderItem();

	/**
	 * Returns a new object of class '<em>Item Assoc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Assoc</em>'.
	 * @generated
	 */
	OrderItemAssoc createOrderItemAssoc();

	/**
	 * Returns a new object of class '<em>Item Assoc Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Assoc Type</em>'.
	 * @generated
	 */
	OrderItemAssocType createOrderItemAssocType();

	/**
	 * Returns a new object of class '<em>Item Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Attribute</em>'.
	 * @generated
	 */
	OrderItemAttribute createOrderItemAttribute();

	/**
	 * Returns a new object of class '<em>Item Billing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Billing</em>'.
	 * @generated
	 */
	OrderItemBilling createOrderItemBilling();

	/**
	 * Returns a new object of class '<em>Item Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Change</em>'.
	 * @generated
	 */
	OrderItemChange createOrderItemChange();

	/**
	 * Returns a new object of class '<em>Item Contact Mech</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Contact Mech</em>'.
	 * @generated
	 */
	OrderItemContactMech createOrderItemContactMech();

	/**
	 * Returns a new object of class '<em>Item Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Group</em>'.
	 * @generated
	 */
	OrderItemGroup createOrderItemGroup();

	/**
	 * Returns a new object of class '<em>Item Group Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Group Order</em>'.
	 * @generated
	 */
	OrderItemGroupOrder createOrderItemGroupOrder();

	/**
	 * Returns a new object of class '<em>Item Price Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Price Info</em>'.
	 * @generated
	 */
	OrderItemPriceInfo createOrderItemPriceInfo();

	/**
	 * Returns a new object of class '<em>Item Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Role</em>'.
	 * @generated
	 */
	OrderItemRole createOrderItemRole();

	/**
	 * Returns a new object of class '<em>Item Ship Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Ship Group</em>'.
	 * @generated
	 */
	OrderItemShipGroup createOrderItemShipGroup();

	/**
	 * Returns a new object of class '<em>Item Ship Group Assoc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Ship Group Assoc</em>'.
	 * @generated
	 */
	OrderItemShipGroupAssoc createOrderItemShipGroupAssoc();

	/**
	 * Returns a new object of class '<em>Item Ship Grp Inv Res</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Ship Grp Inv Res</em>'.
	 * @generated
	 */
	OrderItemShipGrpInvRes createOrderItemShipGrpInvRes();

	/**
	 * Returns a new object of class '<em>Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Type</em>'.
	 * @generated
	 */
	OrderItemType createOrderItemType();

	/**
	 * Returns a new object of class '<em>Item Type Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Type Attr</em>'.
	 * @generated
	 */
	OrderItemTypeAttr createOrderItemTypeAttr();

	/**
	 * Returns a new object of class '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notification</em>'.
	 * @generated
	 */
	OrderNotification createOrderNotification();

	/**
	 * Returns a new object of class '<em>Payment Preference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment Preference</em>'.
	 * @generated
	 */
	OrderPaymentPreference createOrderPaymentPreference();

	/**
	 * Returns a new object of class '<em>Product Promo Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Promo Code</em>'.
	 * @generated
	 */
	OrderProductPromoCode createOrderProductPromoCode();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	OrderRole createOrderRole();

	/**
	 * Returns a new object of class '<em>Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment</em>'.
	 * @generated
	 */
	OrderShipment createOrderShipment();

	/**
	 * Returns a new object of class '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status</em>'.
	 * @generated
	 */
	OrderStatus createOrderStatus();

	/**
	 * Returns a new object of class '<em>Summary Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Summary Entry</em>'.
	 * @generated
	 */
	OrderSummaryEntry createOrderSummaryEntry();

	/**
	 * Returns a new object of class '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term</em>'.
	 * @generated
	 */
	OrderTerm createOrderTerm();

	/**
	 * Returns a new object of class '<em>Term Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term Attribute</em>'.
	 * @generated
	 */
	OrderTermAttribute createOrderTermAttribute();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	OrderType createOrderType();

	/**
	 * Returns a new object of class '<em>Type Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Attr</em>'.
	 * @generated
	 */
	OrderTypeAttr createOrderTypeAttr();

	/**
	 * Returns a new object of class '<em>Product Order Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Order Item</em>'.
	 * @generated
	 */
	ProductOrderItem createProductOrderItem();

	/**
	 * Returns a new object of class '<em>Work Order Item Fulfillment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Order Item Fulfillment</em>'.
	 * @generated
	 */
	WorkOrderItemFulfillment createWorkOrderItemFulfillment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OrderPackage getOrderPackage();

} //OrderFactory
