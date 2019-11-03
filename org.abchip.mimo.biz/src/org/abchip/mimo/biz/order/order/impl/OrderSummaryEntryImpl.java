/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Summary Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderSummaryEntryImpl#getEntryDate <em>Entry Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderSummaryEntryImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderSummaryEntryImpl#getFacilityId <em>Facility Id</em>}</li>
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
	 * The default value of the '{@link #getEntryDate() <em>Entry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ENTRY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntryDate() <em>Entry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryDate()
	 * @generated
	 * @ordered
	 */
	protected Date entryDate = ENTRY_DATE_EDEFAULT;

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
	 * The default value of the '{@link #getFacilityId() <em>Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected static final String FACILITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFacilityId() <em>Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected String facilityId = FACILITY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrossSales() <em>Gross Sales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrossSales()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal GROSS_SALES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGrossSales() <em>Gross Sales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrossSales()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal grossSales = GROSS_SALES_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductCost() <em>Product Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PRODUCT_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductCost() <em>Product Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal productCost = PRODUCT_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalQuantity() <em>Total Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TOTAL_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalQuantity() <em>Total Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal totalQuantity = TOTAL_QUANTITY_EDEFAULT;

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
		return entryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntryDate(Date newEntryDate) {
		Date oldEntryDate = entryDate;
		entryDate = newEntryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_SUMMARY_ENTRY__ENTRY_DATE, oldEntryDate, entryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFacilityId() {
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(String newFacilityId) {
		String oldFacilityId = facilityId;
		facilityId = newFacilityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_SUMMARY_ENTRY__FACILITY_ID, oldFacilityId, facilityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getGrossSales() {
		return grossSales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrossSales(BigDecimal newGrossSales) {
		BigDecimal oldGrossSales = grossSales;
		grossSales = newGrossSales;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_SUMMARY_ENTRY__GROSS_SALES, oldGrossSales, grossSales));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getProductCost() {
		return productCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCost(BigDecimal newProductCost) {
		BigDecimal oldProductCost = productCost;
		productCost = newProductCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_SUMMARY_ENTRY__PRODUCT_COST, oldProductCost, productCost));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_SUMMARY_ENTRY__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTotalQuantity() {
		return totalQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalQuantity(BigDecimal newTotalQuantity) {
		BigDecimal oldTotalQuantity = totalQuantity;
		totalQuantity = newTotalQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_SUMMARY_ENTRY__TOTAL_QUANTITY, oldTotalQuantity, totalQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrderPackage.ORDER_SUMMARY_ENTRY__ENTRY_DATE:
				return getEntryDate();
			case OrderPackage.ORDER_SUMMARY_ENTRY__PRODUCT_ID:
				return getProductId();
			case OrderPackage.ORDER_SUMMARY_ENTRY__FACILITY_ID:
				return getFacilityId();
			case OrderPackage.ORDER_SUMMARY_ENTRY__GROSS_SALES:
				return getGrossSales();
			case OrderPackage.ORDER_SUMMARY_ENTRY__PRODUCT_COST:
				return getProductCost();
			case OrderPackage.ORDER_SUMMARY_ENTRY__TOTAL_QUANTITY:
				return getTotalQuantity();
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
			case OrderPackage.ORDER_SUMMARY_ENTRY__ENTRY_DATE:
				setEntryDate((Date)newValue);
				return;
			case OrderPackage.ORDER_SUMMARY_ENTRY__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case OrderPackage.ORDER_SUMMARY_ENTRY__FACILITY_ID:
				setFacilityId((String)newValue);
				return;
			case OrderPackage.ORDER_SUMMARY_ENTRY__GROSS_SALES:
				setGrossSales((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_SUMMARY_ENTRY__PRODUCT_COST:
				setProductCost((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_SUMMARY_ENTRY__TOTAL_QUANTITY:
				setTotalQuantity((BigDecimal)newValue);
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
			case OrderPackage.ORDER_SUMMARY_ENTRY__ENTRY_DATE:
				setEntryDate(ENTRY_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER_SUMMARY_ENTRY__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_SUMMARY_ENTRY__FACILITY_ID:
				setFacilityId(FACILITY_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_SUMMARY_ENTRY__GROSS_SALES:
				setGrossSales(GROSS_SALES_EDEFAULT);
				return;
			case OrderPackage.ORDER_SUMMARY_ENTRY__PRODUCT_COST:
				setProductCost(PRODUCT_COST_EDEFAULT);
				return;
			case OrderPackage.ORDER_SUMMARY_ENTRY__TOTAL_QUANTITY:
				setTotalQuantity(TOTAL_QUANTITY_EDEFAULT);
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
			case OrderPackage.ORDER_SUMMARY_ENTRY__ENTRY_DATE:
				return ENTRY_DATE_EDEFAULT == null ? entryDate != null : !ENTRY_DATE_EDEFAULT.equals(entryDate);
			case OrderPackage.ORDER_SUMMARY_ENTRY__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case OrderPackage.ORDER_SUMMARY_ENTRY__FACILITY_ID:
				return FACILITY_ID_EDEFAULT == null ? facilityId != null : !FACILITY_ID_EDEFAULT.equals(facilityId);
			case OrderPackage.ORDER_SUMMARY_ENTRY__GROSS_SALES:
				return GROSS_SALES_EDEFAULT == null ? grossSales != null : !GROSS_SALES_EDEFAULT.equals(grossSales);
			case OrderPackage.ORDER_SUMMARY_ENTRY__PRODUCT_COST:
				return PRODUCT_COST_EDEFAULT == null ? productCost != null : !PRODUCT_COST_EDEFAULT.equals(productCost);
			case OrderPackage.ORDER_SUMMARY_ENTRY__TOTAL_QUANTITY:
				return TOTAL_QUANTITY_EDEFAULT == null ? totalQuantity != null : !TOTAL_QUANTITY_EDEFAULT.equals(totalQuantity);
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
		result.append(" (entryDate: ");
		result.append(entryDate);
		result.append(", productId: ");
		result.append(productId);
		result.append(", facilityId: ");
		result.append(facilityId);
		result.append(", grossSales: ");
		result.append(grossSales);
		result.append(", productCost: ");
		result.append(productCost);
		result.append(", totalQuantity: ");
		result.append(totalQuantity);
		result.append(')');
		return result.toString();
	}

} //OrderSummaryEntryImpl
