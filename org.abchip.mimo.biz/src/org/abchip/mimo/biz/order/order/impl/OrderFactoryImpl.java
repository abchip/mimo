/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order.impl;

import org.abchip.mimo.biz.order.order.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrderFactoryImpl extends EFactoryImpl implements OrderFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrderFactory init() {
		try {
			OrderFactory theOrderFactory = (OrderFactory)EPackage.Registry.INSTANCE.getEFactory(OrderPackage.eNS_URI);
			if (theOrderFactory != null) {
				return theOrderFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OrderFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OrderPackage.COMMUNICATION_EVENT_ORDER: return (EObject)createCommunicationEventOrder();
			case OrderPackage.ORDER_ADJUSTMENT: return (EObject)createOrderAdjustment();
			case OrderPackage.ORDER_ADJUSTMENT_ATTRIBUTE: return (EObject)createOrderAdjustmentAttribute();
			case OrderPackage.ORDER_ADJUSTMENT_BILLING: return (EObject)createOrderAdjustmentBilling();
			case OrderPackage.ORDER_ADJUSTMENT_TYPE: return (EObject)createOrderAdjustmentType();
			case OrderPackage.ORDER_ADJUSTMENT_TYPE_ATTR: return (EObject)createOrderAdjustmentTypeAttr();
			case OrderPackage.ORDER_ATTRIBUTE: return (EObject)createOrderAttribute();
			case OrderPackage.ORDER_BLACKLIST: return (EObject)createOrderBlacklist();
			case OrderPackage.ORDER_BLACKLIST_TYPE: return (EObject)createOrderBlacklistType();
			case OrderPackage.ORDER_CONTACT_MECH: return (EObject)createOrderContactMech();
			case OrderPackage.ORDER_CONTENT: return (EObject)createOrderContent();
			case OrderPackage.ORDER_CONTENT_TYPE: return (EObject)createOrderContentType();
			case OrderPackage.ORDER_DELIVERY_SCHEDULE: return (EObject)createOrderDeliverySchedule();
			case OrderPackage.ORDER_HEADER: return (EObject)createOrderHeader();
			case OrderPackage.ORDER_HEADER_NOTE: return (EObject)createOrderHeaderNote();
			case OrderPackage.ORDER_HEADER_WORK_EFFORT: return (EObject)createOrderHeaderWorkEffort();
			case OrderPackage.ORDER_ITEM: return (EObject)createOrderItem();
			case OrderPackage.ORDER_ITEM_ASSOC: return (EObject)createOrderItemAssoc();
			case OrderPackage.ORDER_ITEM_ASSOC_TYPE: return (EObject)createOrderItemAssocType();
			case OrderPackage.ORDER_ITEM_ATTRIBUTE: return (EObject)createOrderItemAttribute();
			case OrderPackage.ORDER_ITEM_BILLING: return (EObject)createOrderItemBilling();
			case OrderPackage.ORDER_ITEM_CHANGE: return (EObject)createOrderItemChange();
			case OrderPackage.ORDER_ITEM_CONTACT_MECH: return (EObject)createOrderItemContactMech();
			case OrderPackage.ORDER_ITEM_GROUP: return (EObject)createOrderItemGroup();
			case OrderPackage.ORDER_ITEM_GROUP_ORDER: return (EObject)createOrderItemGroupOrder();
			case OrderPackage.ORDER_ITEM_PRICE_INFO: return (EObject)createOrderItemPriceInfo();
			case OrderPackage.ORDER_ITEM_ROLE: return (EObject)createOrderItemRole();
			case OrderPackage.ORDER_ITEM_SHIP_GROUP: return (EObject)createOrderItemShipGroup();
			case OrderPackage.ORDER_ITEM_SHIP_GROUP_ASSOC: return (EObject)createOrderItemShipGroupAssoc();
			case OrderPackage.ORDER_ITEM_SHIP_GRP_INV_RES: return (EObject)createOrderItemShipGrpInvRes();
			case OrderPackage.ORDER_ITEM_TYPE: return (EObject)createOrderItemType();
			case OrderPackage.ORDER_ITEM_TYPE_ATTR: return (EObject)createOrderItemTypeAttr();
			case OrderPackage.ORDER_NOTIFICATION: return (EObject)createOrderNotification();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE: return (EObject)createOrderPaymentPreference();
			case OrderPackage.ORDER_PRODUCT_PROMO_CODE: return (EObject)createOrderProductPromoCode();
			case OrderPackage.ORDER_ROLE: return (EObject)createOrderRole();
			case OrderPackage.ORDER_SHIPMENT: return (EObject)createOrderShipment();
			case OrderPackage.ORDER_STATUS: return (EObject)createOrderStatus();
			case OrderPackage.ORDER_SUMMARY_ENTRY: return (EObject)createOrderSummaryEntry();
			case OrderPackage.ORDER_TERM: return (EObject)createOrderTerm();
			case OrderPackage.ORDER_TERM_ATTRIBUTE: return (EObject)createOrderTermAttribute();
			case OrderPackage.ORDER_TYPE: return (EObject)createOrderType();
			case OrderPackage.ORDER_TYPE_ATTR: return (EObject)createOrderTypeAttr();
			case OrderPackage.PRODUCT_ORDER_ITEM: return (EObject)createProductOrderItem();
			case OrderPackage.WORK_ORDER_ITEM_FULFILLMENT: return (EObject)createWorkOrderItemFulfillment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationEventOrder createCommunicationEventOrder() {
		CommunicationEventOrderImpl communicationEventOrder = new CommunicationEventOrderImpl();
		return communicationEventOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderAdjustment createOrderAdjustment() {
		OrderAdjustmentImpl orderAdjustment = new OrderAdjustmentImpl();
		return orderAdjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderAdjustmentAttribute createOrderAdjustmentAttribute() {
		OrderAdjustmentAttributeImpl orderAdjustmentAttribute = new OrderAdjustmentAttributeImpl();
		return orderAdjustmentAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderAdjustmentBilling createOrderAdjustmentBilling() {
		OrderAdjustmentBillingImpl orderAdjustmentBilling = new OrderAdjustmentBillingImpl();
		return orderAdjustmentBilling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderAdjustmentType createOrderAdjustmentType() {
		OrderAdjustmentTypeImpl orderAdjustmentType = new OrderAdjustmentTypeImpl();
		return orderAdjustmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderAdjustmentTypeAttr createOrderAdjustmentTypeAttr() {
		OrderAdjustmentTypeAttrImpl orderAdjustmentTypeAttr = new OrderAdjustmentTypeAttrImpl();
		return orderAdjustmentTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderAttribute createOrderAttribute() {
		OrderAttributeImpl orderAttribute = new OrderAttributeImpl();
		return orderAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderBlacklist createOrderBlacklist() {
		OrderBlacklistImpl orderBlacklist = new OrderBlacklistImpl();
		return orderBlacklist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderBlacklistType createOrderBlacklistType() {
		OrderBlacklistTypeImpl orderBlacklistType = new OrderBlacklistTypeImpl();
		return orderBlacklistType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderContactMech createOrderContactMech() {
		OrderContactMechImpl orderContactMech = new OrderContactMechImpl();
		return orderContactMech;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderContent createOrderContent() {
		OrderContentImpl orderContent = new OrderContentImpl();
		return orderContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderContentType createOrderContentType() {
		OrderContentTypeImpl orderContentType = new OrderContentTypeImpl();
		return orderContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderDeliverySchedule createOrderDeliverySchedule() {
		OrderDeliveryScheduleImpl orderDeliverySchedule = new OrderDeliveryScheduleImpl();
		return orderDeliverySchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeader createOrderHeader() {
		OrderHeaderImpl orderHeader = new OrderHeaderImpl();
		return orderHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeaderNote createOrderHeaderNote() {
		OrderHeaderNoteImpl orderHeaderNote = new OrderHeaderNoteImpl();
		return orderHeaderNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeaderWorkEffort createOrderHeaderWorkEffort() {
		OrderHeaderWorkEffortImpl orderHeaderWorkEffort = new OrderHeaderWorkEffortImpl();
		return orderHeaderWorkEffort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderItem createOrderItem() {
		OrderItemImpl orderItem = new OrderItemImpl();
		return orderItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderItemAssoc createOrderItemAssoc() {
		OrderItemAssocImpl orderItemAssoc = new OrderItemAssocImpl();
		return orderItemAssoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderItemAssocType createOrderItemAssocType() {
		OrderItemAssocTypeImpl orderItemAssocType = new OrderItemAssocTypeImpl();
		return orderItemAssocType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderItemAttribute createOrderItemAttribute() {
		OrderItemAttributeImpl orderItemAttribute = new OrderItemAttributeImpl();
		return orderItemAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderItemBilling createOrderItemBilling() {
		OrderItemBillingImpl orderItemBilling = new OrderItemBillingImpl();
		return orderItemBilling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderItemChange createOrderItemChange() {
		OrderItemChangeImpl orderItemChange = new OrderItemChangeImpl();
		return orderItemChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderItemContactMech createOrderItemContactMech() {
		OrderItemContactMechImpl orderItemContactMech = new OrderItemContactMechImpl();
		return orderItemContactMech;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderItemGroup createOrderItemGroup() {
		OrderItemGroupImpl orderItemGroup = new OrderItemGroupImpl();
		return orderItemGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderItemGroupOrder createOrderItemGroupOrder() {
		OrderItemGroupOrderImpl orderItemGroupOrder = new OrderItemGroupOrderImpl();
		return orderItemGroupOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderItemPriceInfo createOrderItemPriceInfo() {
		OrderItemPriceInfoImpl orderItemPriceInfo = new OrderItemPriceInfoImpl();
		return orderItemPriceInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderItemRole createOrderItemRole() {
		OrderItemRoleImpl orderItemRole = new OrderItemRoleImpl();
		return orderItemRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderItemShipGroup createOrderItemShipGroup() {
		OrderItemShipGroupImpl orderItemShipGroup = new OrderItemShipGroupImpl();
		return orderItemShipGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderItemShipGroupAssoc createOrderItemShipGroupAssoc() {
		OrderItemShipGroupAssocImpl orderItemShipGroupAssoc = new OrderItemShipGroupAssocImpl();
		return orderItemShipGroupAssoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderItemShipGrpInvRes createOrderItemShipGrpInvRes() {
		OrderItemShipGrpInvResImpl orderItemShipGrpInvRes = new OrderItemShipGrpInvResImpl();
		return orderItemShipGrpInvRes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderItemType createOrderItemType() {
		OrderItemTypeImpl orderItemType = new OrderItemTypeImpl();
		return orderItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderItemTypeAttr createOrderItemTypeAttr() {
		OrderItemTypeAttrImpl orderItemTypeAttr = new OrderItemTypeAttrImpl();
		return orderItemTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderNotification createOrderNotification() {
		OrderNotificationImpl orderNotification = new OrderNotificationImpl();
		return orderNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderPaymentPreference createOrderPaymentPreference() {
		OrderPaymentPreferenceImpl orderPaymentPreference = new OrderPaymentPreferenceImpl();
		return orderPaymentPreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderProductPromoCode createOrderProductPromoCode() {
		OrderProductPromoCodeImpl orderProductPromoCode = new OrderProductPromoCodeImpl();
		return orderProductPromoCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderRole createOrderRole() {
		OrderRoleImpl orderRole = new OrderRoleImpl();
		return orderRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderShipment createOrderShipment() {
		OrderShipmentImpl orderShipment = new OrderShipmentImpl();
		return orderShipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderStatus createOrderStatus() {
		OrderStatusImpl orderStatus = new OrderStatusImpl();
		return orderStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderSummaryEntry createOrderSummaryEntry() {
		OrderSummaryEntryImpl orderSummaryEntry = new OrderSummaryEntryImpl();
		return orderSummaryEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderTerm createOrderTerm() {
		OrderTermImpl orderTerm = new OrderTermImpl();
		return orderTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderTermAttribute createOrderTermAttribute() {
		OrderTermAttributeImpl orderTermAttribute = new OrderTermAttributeImpl();
		return orderTermAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderType createOrderType() {
		OrderTypeImpl orderType = new OrderTypeImpl();
		return orderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderTypeAttr createOrderTypeAttr() {
		OrderTypeAttrImpl orderTypeAttr = new OrderTypeAttrImpl();
		return orderTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductOrderItem createProductOrderItem() {
		ProductOrderItemImpl productOrderItem = new ProductOrderItemImpl();
		return productOrderItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkOrderItemFulfillment createWorkOrderItemFulfillment() {
		WorkOrderItemFulfillmentImpl workOrderItemFulfillment = new WorkOrderItemFulfillmentImpl();
		return workOrderItemFulfillment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderPackage getOrderPackage() {
		return (OrderPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OrderPackage getPackage() {
		return OrderPackage.eINSTANCE;
	}

} //OrderFactoryImpl
