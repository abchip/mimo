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
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.abchip.mimo.biz.order.order.OrderType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderTypeImpl#getOrderTypeId <em>Order Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderTypeImpl#getOrderTypeAttrs <em>Order Type Attrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderTypeImpl extends BizEntityTypeImpl<OrderHeader> implements OrderType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getOrderTypeId() <em>Order Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderTypeId() <em>Order Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderTypeId()
	 * @generated
	 * @ordered
	 */
	protected String orderTypeId = ORDER_TYPE_ID_EDEFAULT;

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
	protected OrderType parentTypeId;

	/**
	 * The cached value of the '{@link #getOrderTypeAttrs() <em>Order Type Attrs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderTypeAttrs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> orderTypeAttrs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_TYPE;
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
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_TYPE__DESCRIPTION, oldDescription, description));
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
		boolean oldHasTable = hasTable;
		hasTable = newHasTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_TYPE__HAS_TABLE, oldHasTable, hasTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderTypeId() {
		return orderTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderTypeId(String newOrderTypeId) {
		String oldOrderTypeId = orderTypeId;
		orderTypeId = newOrderTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_TYPE__ORDER_TYPE_ID, oldOrderTypeId, orderTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (OrderType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrderPackage.ORDER_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(OrderType newParentTypeId) {
		OrderType oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getOrderTypeAttrs() {
		if (orderTypeAttrs == null) {
			orderTypeAttrs = new EDataTypeUniqueEList<String>(String.class, this, OrderPackage.ORDER_TYPE__ORDER_TYPE_ATTRS);
		}
		return orderTypeAttrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childOrderTypes() {
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
	public List<String> orderHeaders() {
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
	public List<String> partyPrefDocTypeTpls() {
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
			case OrderPackage.ORDER_TYPE__ORDER_TYPE_ID:
				return getOrderTypeId();
			case OrderPackage.ORDER_TYPE__DESCRIPTION:
				return getDescription();
			case OrderPackage.ORDER_TYPE__HAS_TABLE:
				return isHasTable();
			case OrderPackage.ORDER_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
			case OrderPackage.ORDER_TYPE__ORDER_TYPE_ATTRS:
				return getOrderTypeAttrs();
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
			case OrderPackage.ORDER_TYPE__ORDER_TYPE_ID:
				setOrderTypeId((String)newValue);
				return;
			case OrderPackage.ORDER_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OrderPackage.ORDER_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case OrderPackage.ORDER_TYPE__PARENT_TYPE_ID:
				setParentTypeId((OrderType)newValue);
				return;
			case OrderPackage.ORDER_TYPE__ORDER_TYPE_ATTRS:
				getOrderTypeAttrs().clear();
				getOrderTypeAttrs().addAll((Collection<? extends String>)newValue);
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
			case OrderPackage.ORDER_TYPE__ORDER_TYPE_ID:
				setOrderTypeId(ORDER_TYPE_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OrderPackage.ORDER_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case OrderPackage.ORDER_TYPE__PARENT_TYPE_ID:
				setParentTypeId((OrderType)null);
				return;
			case OrderPackage.ORDER_TYPE__ORDER_TYPE_ATTRS:
				getOrderTypeAttrs().clear();
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
			case OrderPackage.ORDER_TYPE__ORDER_TYPE_ID:
				return ORDER_TYPE_ID_EDEFAULT == null ? orderTypeId != null : !ORDER_TYPE_ID_EDEFAULT.equals(orderTypeId);
			case OrderPackage.ORDER_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OrderPackage.ORDER_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case OrderPackage.ORDER_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
			case OrderPackage.ORDER_TYPE__ORDER_TYPE_ATTRS:
				return orderTypeAttrs != null && !orderTypeAttrs.isEmpty();
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
		result.append(" (orderTypeId: ");
		result.append(orderTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(", orderTypeAttrs: ");
		result.append(orderTypeAttrs);
		result.append(')');
		return result.toString();
	}

} //OrderTypeImpl
