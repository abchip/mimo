/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.order.order.OrderItemAssoc;
import org.abchip.mimo.biz.order.order.OrderItemAssocType;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Item Assoc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemAssocImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemAssocImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemAssocImpl#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemAssocImpl#getToOrderItemSeqId <em>To Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemAssocImpl#getToShipGroupSeqId <em>To Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemAssocImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemAssocImpl#getOrderItemAssocTypeId <em>Order Item Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemAssocImpl#getToOrderId <em>To Order Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderItemAssocImpl extends BizEntityTypedImpl<OrderItemAssocType> implements OrderItemAssoc {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected String orderId = ORDER_ID_EDEFAULT;

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
	 * The default value of the '{@link #getShipGroupSeqId() <em>Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipGroupSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIP_GROUP_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipGroupSeqId() <em>Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipGroupSeqId()
	 * @generated
	 * @ordered
	 */
	protected String shipGroupSeqId = SHIP_GROUP_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getToOrderItemSeqId() <em>To Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToOrderItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_ORDER_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToOrderItemSeqId() <em>To Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToOrderItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String toOrderItemSeqId = TO_ORDER_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getToShipGroupSeqId() <em>To Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToShipGroupSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_SHIP_GROUP_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToShipGroupSeqId() <em>To Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToShipGroupSeqId()
	 * @generated
	 * @ordered
	 */
	protected String toShipGroupSeqId = TO_SHIP_GROUP_SEQ_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getOrderItemAssocTypeId() <em>Order Item Assoc Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemAssocTypeId()
	 * @generated
	 * @ordered
	 */
	protected OrderItemAssocType orderItemAssocTypeId;

	/**
	 * The cached value of the '{@link #getToOrderId() <em>To Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToOrderId()
	 * @generated
	 * @ordered
	 */
	protected OrderHeader toOrderId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderItemAssocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_ITEM_ASSOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(String newOrderId) {
		String oldOrderId = orderId;
		orderId = newOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_ASSOC__ORDER_ID, oldOrderId, orderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderItemAssocType getOrderItemAssocTypeId() {
		if (orderItemAssocTypeId != null && ((EObject)orderItemAssocTypeId).eIsProxy()) {
			InternalEObject oldOrderItemAssocTypeId = (InternalEObject)orderItemAssocTypeId;
			orderItemAssocTypeId = (OrderItemAssocType)eResolveProxy(oldOrderItemAssocTypeId);
			if (orderItemAssocTypeId != oldOrderItemAssocTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER_ITEM_ASSOC__ORDER_ITEM_ASSOC_TYPE_ID, oldOrderItemAssocTypeId, orderItemAssocTypeId));
			}
		}
		return orderItemAssocTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderItemAssocType basicGetOrderItemAssocTypeId() {
		return orderItemAssocTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemAssocTypeId(OrderItemAssocType newOrderItemAssocTypeId) {
		OrderItemAssocType oldOrderItemAssocTypeId = orderItemAssocTypeId;
		orderItemAssocTypeId = newOrderItemAssocTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_ASSOC__ORDER_ITEM_ASSOC_TYPE_ID, oldOrderItemAssocTypeId, orderItemAssocTypeId));
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
		String oldOrderItemSeqId = orderItemSeqId;
		orderItemSeqId = newOrderItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_ASSOC__ORDER_ITEM_SEQ_ID, oldOrderItemSeqId, orderItemSeqId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_ASSOC__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipGroupSeqId() {
		return shipGroupSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipGroupSeqId(String newShipGroupSeqId) {
		String oldShipGroupSeqId = shipGroupSeqId;
		shipGroupSeqId = newShipGroupSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_ASSOC__SHIP_GROUP_SEQ_ID, oldShipGroupSeqId, shipGroupSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeader getToOrderId() {
		if (toOrderId != null && ((EObject)toOrderId).eIsProxy()) {
			InternalEObject oldToOrderId = (InternalEObject)toOrderId;
			toOrderId = (OrderHeader)eResolveProxy(oldToOrderId);
			if (toOrderId != oldToOrderId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER_ITEM_ASSOC__TO_ORDER_ID, oldToOrderId, toOrderId));
			}
		}
		return toOrderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderHeader basicGetToOrderId() {
		return toOrderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToOrderId(OrderHeader newToOrderId) {
		OrderHeader oldToOrderId = toOrderId;
		toOrderId = newToOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_ASSOC__TO_ORDER_ID, oldToOrderId, toOrderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToOrderItemSeqId() {
		return toOrderItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToOrderItemSeqId(String newToOrderItemSeqId) {
		String oldToOrderItemSeqId = toOrderItemSeqId;
		toOrderItemSeqId = newToOrderItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_ASSOC__TO_ORDER_ITEM_SEQ_ID, oldToOrderItemSeqId, toOrderItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToShipGroupSeqId() {
		return toShipGroupSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToShipGroupSeqId(String newToShipGroupSeqId) {
		String oldToShipGroupSeqId = toShipGroupSeqId;
		toShipGroupSeqId = newToShipGroupSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_ASSOC__TO_SHIP_GROUP_SEQ_ID, oldToShipGroupSeqId, toShipGroupSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrderPackage.ORDER_ITEM_ASSOC__ORDER_ID:
				return getOrderId();
			case OrderPackage.ORDER_ITEM_ASSOC__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case OrderPackage.ORDER_ITEM_ASSOC__SHIP_GROUP_SEQ_ID:
				return getShipGroupSeqId();
			case OrderPackage.ORDER_ITEM_ASSOC__TO_ORDER_ITEM_SEQ_ID:
				return getToOrderItemSeqId();
			case OrderPackage.ORDER_ITEM_ASSOC__TO_SHIP_GROUP_SEQ_ID:
				return getToShipGroupSeqId();
			case OrderPackage.ORDER_ITEM_ASSOC__QUANTITY:
				return getQuantity();
			case OrderPackage.ORDER_ITEM_ASSOC__ORDER_ITEM_ASSOC_TYPE_ID:
				if (resolve) return getOrderItemAssocTypeId();
				return basicGetOrderItemAssocTypeId();
			case OrderPackage.ORDER_ITEM_ASSOC__TO_ORDER_ID:
				if (resolve) return getToOrderId();
				return basicGetToOrderId();
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
			case OrderPackage.ORDER_ITEM_ASSOC__ORDER_ID:
				setOrderId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_ASSOC__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_ASSOC__SHIP_GROUP_SEQ_ID:
				setShipGroupSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_ASSOC__TO_ORDER_ITEM_SEQ_ID:
				setToOrderItemSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_ASSOC__TO_SHIP_GROUP_SEQ_ID:
				setToShipGroupSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_ASSOC__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_ITEM_ASSOC__ORDER_ITEM_ASSOC_TYPE_ID:
				setOrderItemAssocTypeId((OrderItemAssocType)newValue);
				return;
			case OrderPackage.ORDER_ITEM_ASSOC__TO_ORDER_ID:
				setToOrderId((OrderHeader)newValue);
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
			case OrderPackage.ORDER_ITEM_ASSOC__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_ASSOC__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_ASSOC__SHIP_GROUP_SEQ_ID:
				setShipGroupSeqId(SHIP_GROUP_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_ASSOC__TO_ORDER_ITEM_SEQ_ID:
				setToOrderItemSeqId(TO_ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_ASSOC__TO_SHIP_GROUP_SEQ_ID:
				setToShipGroupSeqId(TO_SHIP_GROUP_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_ASSOC__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_ASSOC__ORDER_ITEM_ASSOC_TYPE_ID:
				setOrderItemAssocTypeId((OrderItemAssocType)null);
				return;
			case OrderPackage.ORDER_ITEM_ASSOC__TO_ORDER_ID:
				setToOrderId((OrderHeader)null);
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
			case OrderPackage.ORDER_ITEM_ASSOC__ORDER_ID:
				return ORDER_ID_EDEFAULT == null ? orderId != null : !ORDER_ID_EDEFAULT.equals(orderId);
			case OrderPackage.ORDER_ITEM_ASSOC__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case OrderPackage.ORDER_ITEM_ASSOC__SHIP_GROUP_SEQ_ID:
				return SHIP_GROUP_SEQ_ID_EDEFAULT == null ? shipGroupSeqId != null : !SHIP_GROUP_SEQ_ID_EDEFAULT.equals(shipGroupSeqId);
			case OrderPackage.ORDER_ITEM_ASSOC__TO_ORDER_ITEM_SEQ_ID:
				return TO_ORDER_ITEM_SEQ_ID_EDEFAULT == null ? toOrderItemSeqId != null : !TO_ORDER_ITEM_SEQ_ID_EDEFAULT.equals(toOrderItemSeqId);
			case OrderPackage.ORDER_ITEM_ASSOC__TO_SHIP_GROUP_SEQ_ID:
				return TO_SHIP_GROUP_SEQ_ID_EDEFAULT == null ? toShipGroupSeqId != null : !TO_SHIP_GROUP_SEQ_ID_EDEFAULT.equals(toShipGroupSeqId);
			case OrderPackage.ORDER_ITEM_ASSOC__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case OrderPackage.ORDER_ITEM_ASSOC__ORDER_ITEM_ASSOC_TYPE_ID:
				return orderItemAssocTypeId != null;
			case OrderPackage.ORDER_ITEM_ASSOC__TO_ORDER_ID:
				return toOrderId != null;
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
		result.append(" (orderId: ");
		result.append(orderId);
		result.append(", orderItemSeqId: ");
		result.append(orderItemSeqId);
		result.append(", shipGroupSeqId: ");
		result.append(shipGroupSeqId);
		result.append(", toOrderItemSeqId: ");
		result.append(toOrderItemSeqId);
		result.append(", toShipGroupSeqId: ");
		result.append(toShipGroupSeqId);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //OrderItemAssocImpl
