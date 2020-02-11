/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.abchip.mimo.biz.order.order.OrderSummaryEntry;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.product.product.Product;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Summary Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderSummaryEntryImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderSummaryEntryImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderSummaryEntryImpl#getEntryDate <em>Entry Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderSummaryEntryImpl#getGrossSales <em>Gross Sales</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderSummaryEntryImpl#getProductCost <em>Product Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderSummaryEntryImpl#getTotalQuantity <em>Total Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderSummaryEntryImpl extends BizEntityImpl implements OrderSummaryEntry {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderSummaryEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_SUMMARY_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEntryDate() {
		return (Date)eGet(OrderPackage.Literals.ORDER_SUMMARY_ENTRY__ENTRY_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntryDate(Date newEntryDate) {
		eSet(OrderPackage.Literals.ORDER_SUMMARY_ENTRY__ENTRY_DATE, newEntryDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getFacilityId() {
		return (Facility)eGet(OrderPackage.Literals.ORDER_SUMMARY_ENTRY__FACILITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(Facility newFacilityId) {
		eSet(OrderPackage.Literals.ORDER_SUMMARY_ENTRY__FACILITY_ID, newFacilityId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getGrossSales() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_SUMMARY_ENTRY__GROSS_SALES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrossSales(BigDecimal newGrossSales) {
		eSet(OrderPackage.Literals.ORDER_SUMMARY_ENTRY__GROSS_SALES, newGrossSales);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getProductCost() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_SUMMARY_ENTRY__PRODUCT_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCost(BigDecimal newProductCost) {
		eSet(OrderPackage.Literals.ORDER_SUMMARY_ENTRY__PRODUCT_COST, newProductCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductId() {
		return (Product)eGet(OrderPackage.Literals.ORDER_SUMMARY_ENTRY__PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		eSet(OrderPackage.Literals.ORDER_SUMMARY_ENTRY__PRODUCT_ID, newProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTotalQuantity() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_SUMMARY_ENTRY__TOTAL_QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalQuantity(BigDecimal newTotalQuantity) {
		eSet(OrderPackage.Literals.ORDER_SUMMARY_ENTRY__TOTAL_QUANTITY, newTotalQuantity);
	}

} //OrderSummaryEntryImpl
