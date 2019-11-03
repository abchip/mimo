/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.order.OrderItemGroup;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Item Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemGroupImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemGroupImpl#getOrderItemGroupSeqId <em>Order Item Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemGroupImpl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemGroupImpl#getParentGroupSeqId <em>Parent Group Seq Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderItemGroupImpl extends BizEntityImpl implements OrderItemGroup {
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
	 * The default value of the '{@link #getOrderItemGroupSeqId() <em>Order Item Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemGroupSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ITEM_GROUP_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderItemGroupSeqId() <em>Order Item Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemGroupSeqId()
	 * @generated
	 * @ordered
	 */
	protected String orderItemGroupSeqId = ORDER_ITEM_GROUP_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupName() <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupName()
	 * @generated
	 * @ordered
	 */
	protected String groupName = GROUP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentGroupSeqId() <em>Parent Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentGroupSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_GROUP_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentGroupSeqId() <em>Parent Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentGroupSeqId()
	 * @generated
	 * @ordered
	 */
	protected String parentGroupSeqId = PARENT_GROUP_SEQ_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderItemGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_ITEM_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupName() {
		return groupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupName(String newGroupName) {
		String oldGroupName = groupName;
		groupName = newGroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_GROUP__GROUP_NAME, oldGroupName, groupName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_GROUP__ORDER_ID, oldOrderId, orderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemGroupSeqId() {
		return orderItemGroupSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemGroupSeqId(String newOrderItemGroupSeqId) {
		String oldOrderItemGroupSeqId = orderItemGroupSeqId;
		orderItemGroupSeqId = newOrderItemGroupSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_GROUP__ORDER_ITEM_GROUP_SEQ_ID, oldOrderItemGroupSeqId, orderItemGroupSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentGroupSeqId() {
		return parentGroupSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentGroupSeqId(String newParentGroupSeqId) {
		String oldParentGroupSeqId = parentGroupSeqId;
		parentGroupSeqId = newParentGroupSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ITEM_GROUP__PARENT_GROUP_SEQ_ID, oldParentGroupSeqId, parentGroupSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrderPackage.ORDER_ITEM_GROUP__ORDER_ID:
				return getOrderId();
			case OrderPackage.ORDER_ITEM_GROUP__ORDER_ITEM_GROUP_SEQ_ID:
				return getOrderItemGroupSeqId();
			case OrderPackage.ORDER_ITEM_GROUP__GROUP_NAME:
				return getGroupName();
			case OrderPackage.ORDER_ITEM_GROUP__PARENT_GROUP_SEQ_ID:
				return getParentGroupSeqId();
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
			case OrderPackage.ORDER_ITEM_GROUP__ORDER_ID:
				setOrderId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_GROUP__ORDER_ITEM_GROUP_SEQ_ID:
				setOrderItemGroupSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_GROUP__GROUP_NAME:
				setGroupName((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_GROUP__PARENT_GROUP_SEQ_ID:
				setParentGroupSeqId((String)newValue);
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
			case OrderPackage.ORDER_ITEM_GROUP__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_GROUP__ORDER_ITEM_GROUP_SEQ_ID:
				setOrderItemGroupSeqId(ORDER_ITEM_GROUP_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_GROUP__GROUP_NAME:
				setGroupName(GROUP_NAME_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_GROUP__PARENT_GROUP_SEQ_ID:
				setParentGroupSeqId(PARENT_GROUP_SEQ_ID_EDEFAULT);
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
			case OrderPackage.ORDER_ITEM_GROUP__ORDER_ID:
				return ORDER_ID_EDEFAULT == null ? orderId != null : !ORDER_ID_EDEFAULT.equals(orderId);
			case OrderPackage.ORDER_ITEM_GROUP__ORDER_ITEM_GROUP_SEQ_ID:
				return ORDER_ITEM_GROUP_SEQ_ID_EDEFAULT == null ? orderItemGroupSeqId != null : !ORDER_ITEM_GROUP_SEQ_ID_EDEFAULT.equals(orderItemGroupSeqId);
			case OrderPackage.ORDER_ITEM_GROUP__GROUP_NAME:
				return GROUP_NAME_EDEFAULT == null ? groupName != null : !GROUP_NAME_EDEFAULT.equals(groupName);
			case OrderPackage.ORDER_ITEM_GROUP__PARENT_GROUP_SEQ_ID:
				return PARENT_GROUP_SEQ_ID_EDEFAULT == null ? parentGroupSeqId != null : !PARENT_GROUP_SEQ_ID_EDEFAULT.equals(parentGroupSeqId);
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
		result.append(", orderItemGroupSeqId: ");
		result.append(orderItemGroupSeqId);
		result.append(", groupName: ");
		result.append(groupName);
		result.append(", parentGroupSeqId: ");
		result.append(parentGroupSeqId);
		result.append(')');
		return result.toString();
	}

} //OrderItemGroupImpl
