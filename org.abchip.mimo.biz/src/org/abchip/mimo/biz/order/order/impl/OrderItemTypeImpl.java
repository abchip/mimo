/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.order.order.OrderItem;
import org.abchip.mimo.biz.order.order.OrderItemType;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemTypeImpl#getOrderItemTypeId <em>Order Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderItemTypeImpl#getOrderItemTypeAttrs <em>Order Item Type Attrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderItemTypeImpl extends BizEntityTypeImpl<OrderItem> implements OrderItemType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getOrderItemTypeId() <em>Order Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ITEM_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderItemTypeId() <em>Order Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected String orderItemTypeId = ORDER_ITEM_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_TABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected boolean hasTable = HAS_TABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected OrderItemType parentTypeId;

	/**
	 * The cached value of the '{@link #getOrderItemTypeAttrs() <em>Order Item Type Attrs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemTypeAttrs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> orderItemTypeAttrs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_ITEM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return hasTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		hasTable = newHasTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemTypeId() {
		return orderItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemTypeId(String newOrderItemTypeId) {
		orderItemTypeId = newOrderItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderItemType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (OrderItemType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderItemType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(OrderItemType newParentTypeId) {
		parentTypeId = newParentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getOrderItemTypeAttrs() {
		if (orderItemTypeAttrs == null) {
			orderItemTypeAttrs = new BasicInternalEList<String>(String.class);
		}
		return orderItemTypeAttrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childOrderItemTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> orderItems() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrderPackage.ORDER_ITEM_TYPE__ORDER_ITEM_TYPE_ID:
				return getOrderItemTypeId();
			case OrderPackage.ORDER_ITEM_TYPE__DESCRIPTION:
				return getDescription();
			case OrderPackage.ORDER_ITEM_TYPE__HAS_TABLE:
				return isHasTable();
			case OrderPackage.ORDER_ITEM_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
			case OrderPackage.ORDER_ITEM_TYPE__ORDER_ITEM_TYPE_ATTRS:
				return getOrderItemTypeAttrs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrderPackage.ORDER_ITEM_TYPE__ORDER_ITEM_TYPE_ID:
				setOrderItemTypeId((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OrderPackage.ORDER_ITEM_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case OrderPackage.ORDER_ITEM_TYPE__PARENT_TYPE_ID:
				setParentTypeId((OrderItemType)newValue);
				return;
			case OrderPackage.ORDER_ITEM_TYPE__ORDER_ITEM_TYPE_ATTRS:
				getOrderItemTypeAttrs().clear();
				getOrderItemTypeAttrs().addAll((Collection<? extends String>)newValue);
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
			case OrderPackage.ORDER_ITEM_TYPE__ORDER_ITEM_TYPE_ID:
				setOrderItemTypeId(ORDER_ITEM_TYPE_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ITEM_TYPE__PARENT_TYPE_ID:
				setParentTypeId((OrderItemType)null);
				return;
			case OrderPackage.ORDER_ITEM_TYPE__ORDER_ITEM_TYPE_ATTRS:
				getOrderItemTypeAttrs().clear();
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
			case OrderPackage.ORDER_ITEM_TYPE__ORDER_ITEM_TYPE_ID:
				return ORDER_ITEM_TYPE_ID_EDEFAULT == null ? orderItemTypeId != null : !ORDER_ITEM_TYPE_ID_EDEFAULT.equals(orderItemTypeId);
			case OrderPackage.ORDER_ITEM_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OrderPackage.ORDER_ITEM_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case OrderPackage.ORDER_ITEM_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
			case OrderPackage.ORDER_ITEM_TYPE__ORDER_ITEM_TYPE_ATTRS:
				return orderItemTypeAttrs != null && !orderItemTypeAttrs.isEmpty();
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
		result.append(" (orderItemTypeId: ");
		result.append(orderItemTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(", orderItemTypeAttrs: ");
		result.append(orderItemTypeAttrs);
		result.append(')');
		return result.toString();
	}

} //OrderItemTypeImpl
