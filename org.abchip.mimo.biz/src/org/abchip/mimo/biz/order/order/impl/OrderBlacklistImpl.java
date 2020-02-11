/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.order.OrderBlacklist;
import org.abchip.mimo.biz.order.order.OrderBlacklistType;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Blacklist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderBlacklistImpl#getOrderBlacklistTypeId <em>Order Blacklist Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderBlacklistImpl#getBlacklistString <em>Blacklist String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderBlacklistImpl extends BizEntityImpl implements OrderBlacklist {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderBlacklistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_BLACKLIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBlacklistString() {
		return (String)eGet(OrderPackage.Literals.ORDER_BLACKLIST__BLACKLIST_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlacklistString(String newBlacklistString) {
		eSet(OrderPackage.Literals.ORDER_BLACKLIST__BLACKLIST_STRING, newBlacklistString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderBlacklistType getOrderBlacklistTypeId() {
		return (OrderBlacklistType)eGet(OrderPackage.Literals.ORDER_BLACKLIST__ORDER_BLACKLIST_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderBlacklistTypeId(OrderBlacklistType newOrderBlacklistTypeId) {
		eSet(OrderPackage.Literals.ORDER_BLACKLIST__ORDER_BLACKLIST_TYPE_ID, newOrderBlacklistTypeId);
	}

} //OrderBlacklistImpl
