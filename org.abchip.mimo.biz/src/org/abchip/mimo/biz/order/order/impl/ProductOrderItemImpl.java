/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.abchip.mimo.biz.order.order.ProductOrderItem;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Order Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.ProductOrderItemImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.ProductOrderItemImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.ProductOrderItemImpl#getEngagementId <em>Engagement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.ProductOrderItemImpl#getEngagementItemSeqId <em>Engagement Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.ProductOrderItemImpl#getProductId <em>Product Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductOrderItemImpl extends BizEntityImpl implements ProductOrderItem {
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
	 * The default value of the '{@link #getEngagementId() <em>Engagement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngagementId()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGAGEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngagementId() <em>Engagement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngagementId()
	 * @generated
	 * @ordered
	 */
	protected String engagementId = ENGAGEMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEngagementItemSeqId() <em>Engagement Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngagementItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGAGEMENT_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngagementItemSeqId() <em>Engagement Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngagementItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String engagementItemSeqId = ENGAGEMENT_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected String productId = PRODUCT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductOrderItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.PRODUCT_ORDER_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEngagementId() {
		return engagementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEngagementId(String newEngagementId) {
		String oldEngagementId = engagementId;
		engagementId = newEngagementId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.PRODUCT_ORDER_ITEM__ENGAGEMENT_ID, oldEngagementId, engagementId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEngagementItemSeqId() {
		return engagementItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEngagementItemSeqId(String newEngagementItemSeqId) {
		String oldEngagementItemSeqId = engagementItemSeqId;
		engagementItemSeqId = newEngagementItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.PRODUCT_ORDER_ITEM__ENGAGEMENT_ITEM_SEQ_ID, oldEngagementItemSeqId, engagementItemSeqId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.PRODUCT_ORDER_ITEM__ORDER_ID, oldOrderId, orderId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.PRODUCT_ORDER_ITEM__ORDER_ITEM_SEQ_ID, oldOrderItemSeqId, orderItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		String oldProductId = productId;
		productId = newProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.PRODUCT_ORDER_ITEM__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrderPackage.PRODUCT_ORDER_ITEM__ORDER_ID:
				return getOrderId();
			case OrderPackage.PRODUCT_ORDER_ITEM__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case OrderPackage.PRODUCT_ORDER_ITEM__ENGAGEMENT_ID:
				return getEngagementId();
			case OrderPackage.PRODUCT_ORDER_ITEM__ENGAGEMENT_ITEM_SEQ_ID:
				return getEngagementItemSeqId();
			case OrderPackage.PRODUCT_ORDER_ITEM__PRODUCT_ID:
				return getProductId();
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
			case OrderPackage.PRODUCT_ORDER_ITEM__ORDER_ID:
				setOrderId((String)newValue);
				return;
			case OrderPackage.PRODUCT_ORDER_ITEM__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case OrderPackage.PRODUCT_ORDER_ITEM__ENGAGEMENT_ID:
				setEngagementId((String)newValue);
				return;
			case OrderPackage.PRODUCT_ORDER_ITEM__ENGAGEMENT_ITEM_SEQ_ID:
				setEngagementItemSeqId((String)newValue);
				return;
			case OrderPackage.PRODUCT_ORDER_ITEM__PRODUCT_ID:
				setProductId((String)newValue);
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
			case OrderPackage.PRODUCT_ORDER_ITEM__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case OrderPackage.PRODUCT_ORDER_ITEM__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.PRODUCT_ORDER_ITEM__ENGAGEMENT_ID:
				setEngagementId(ENGAGEMENT_ID_EDEFAULT);
				return;
			case OrderPackage.PRODUCT_ORDER_ITEM__ENGAGEMENT_ITEM_SEQ_ID:
				setEngagementItemSeqId(ENGAGEMENT_ITEM_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.PRODUCT_ORDER_ITEM__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
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
			case OrderPackage.PRODUCT_ORDER_ITEM__ORDER_ID:
				return ORDER_ID_EDEFAULT == null ? orderId != null : !ORDER_ID_EDEFAULT.equals(orderId);
			case OrderPackage.PRODUCT_ORDER_ITEM__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case OrderPackage.PRODUCT_ORDER_ITEM__ENGAGEMENT_ID:
				return ENGAGEMENT_ID_EDEFAULT == null ? engagementId != null : !ENGAGEMENT_ID_EDEFAULT.equals(engagementId);
			case OrderPackage.PRODUCT_ORDER_ITEM__ENGAGEMENT_ITEM_SEQ_ID:
				return ENGAGEMENT_ITEM_SEQ_ID_EDEFAULT == null ? engagementItemSeqId != null : !ENGAGEMENT_ITEM_SEQ_ID_EDEFAULT.equals(engagementItemSeqId);
			case OrderPackage.PRODUCT_ORDER_ITEM__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
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
		result.append(", engagementId: ");
		result.append(engagementId);
		result.append(", engagementItemSeqId: ");
		result.append(engagementItemSeqId);
		result.append(", productId: ");
		result.append(productId);
		result.append(')');
		return result.toString();
	}

} //ProductOrderItemImpl
