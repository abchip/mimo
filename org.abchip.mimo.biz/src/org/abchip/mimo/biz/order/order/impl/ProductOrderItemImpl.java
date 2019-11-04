/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.abchip.mimo.biz.order.order.ProductOrderItem;
import org.abchip.mimo.biz.product.product.Product;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.ProductOrderItemImpl#getEngagementItemSeqId <em>Engagement Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.ProductOrderItemImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.ProductOrderItemImpl#getEngagementId <em>Engagement Id</em>}</li>
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
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected Product productId;

	/**
	 * The cached value of the '{@link #getEngagementId() <em>Engagement Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngagementId()
	 * @generated
	 * @ordered
	 */
	protected OrderHeader engagementId;

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
	public OrderHeader getEngagementId() {
		if (engagementId != null && ((EObject)engagementId).eIsProxy()) {
			InternalEObject oldEngagementId = (InternalEObject)engagementId;
			engagementId = (OrderHeader)eResolveProxy(oldEngagementId);
			if (engagementId != oldEngagementId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.PRODUCT_ORDER_ITEM__ENGAGEMENT_ID, oldEngagementId, engagementId));
			}
		}
		return engagementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderHeader basicGetEngagementId() {
		return engagementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEngagementId(OrderHeader newEngagementId) {
		OrderHeader oldEngagementId = engagementId;
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
	public Product getProductId() {
		if (productId != null && ((EObject)productId).eIsProxy()) {
			InternalEObject oldProductId = (InternalEObject)productId;
			productId = (Product)eResolveProxy(oldProductId);
			if (productId != oldProductId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.PRODUCT_ORDER_ITEM__PRODUCT_ID, oldProductId, productId));
			}
		}
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		Product oldProductId = productId;
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
			case OrderPackage.PRODUCT_ORDER_ITEM__ENGAGEMENT_ITEM_SEQ_ID:
				return getEngagementItemSeqId();
			case OrderPackage.PRODUCT_ORDER_ITEM__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case OrderPackage.PRODUCT_ORDER_ITEM__ENGAGEMENT_ID:
				if (resolve) return getEngagementId();
				return basicGetEngagementId();
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
			case OrderPackage.PRODUCT_ORDER_ITEM__ENGAGEMENT_ITEM_SEQ_ID:
				setEngagementItemSeqId((String)newValue);
				return;
			case OrderPackage.PRODUCT_ORDER_ITEM__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case OrderPackage.PRODUCT_ORDER_ITEM__ENGAGEMENT_ID:
				setEngagementId((OrderHeader)newValue);
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
			case OrderPackage.PRODUCT_ORDER_ITEM__ENGAGEMENT_ITEM_SEQ_ID:
				setEngagementItemSeqId(ENGAGEMENT_ITEM_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.PRODUCT_ORDER_ITEM__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case OrderPackage.PRODUCT_ORDER_ITEM__ENGAGEMENT_ID:
				setEngagementId((OrderHeader)null);
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
			case OrderPackage.PRODUCT_ORDER_ITEM__ENGAGEMENT_ITEM_SEQ_ID:
				return ENGAGEMENT_ITEM_SEQ_ID_EDEFAULT == null ? engagementItemSeqId != null : !ENGAGEMENT_ITEM_SEQ_ID_EDEFAULT.equals(engagementItemSeqId);
			case OrderPackage.PRODUCT_ORDER_ITEM__PRODUCT_ID:
				return productId != null;
			case OrderPackage.PRODUCT_ORDER_ITEM__ENGAGEMENT_ID:
				return engagementId != null;
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
		result.append(", engagementItemSeqId: ");
		result.append(engagementItemSeqId);
		result.append(')');
		return result.toString();
	}

} //ProductOrderItemImpl
