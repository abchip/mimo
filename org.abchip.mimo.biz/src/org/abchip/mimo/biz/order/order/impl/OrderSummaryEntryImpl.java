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
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.product.product.Product;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Summary Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderSummaryEntryImpl#getEntryDate <em>Entry Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderSummaryEntryImpl#getGrossSales <em>Gross Sales</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderSummaryEntryImpl#getProductCost <em>Product Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderSummaryEntryImpl#getTotalQuantity <em>Total Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderSummaryEntryImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderSummaryEntryImpl#getFacilityId <em>Facility Id</em>}</li>
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
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected Product productId;

	/**
	 * The cached value of the '{@link #getFacilityId() <em>Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected Facility facilityId;

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
		entryDate = newEntryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getFacilityId() {
		if (facilityId != null && ((EObject)facilityId).eIsProxy()) {
			InternalEObject oldFacilityId = (InternalEObject)facilityId;
			facilityId = (Facility)eResolveProxy(oldFacilityId);
			if (facilityId != oldFacilityId) {
			}
		}
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facility basicGetFacilityId() {
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(Facility newFacilityId) {
		facilityId = newFacilityId;
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
		grossSales = newGrossSales;
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
		productCost = newProductCost;
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
		productId = newProductId;
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
		totalQuantity = newTotalQuantity;
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
			case OrderPackage.ORDER_SUMMARY_ENTRY__GROSS_SALES:
				return getGrossSales();
			case OrderPackage.ORDER_SUMMARY_ENTRY__PRODUCT_COST:
				return getProductCost();
			case OrderPackage.ORDER_SUMMARY_ENTRY__TOTAL_QUANTITY:
				return getTotalQuantity();
			case OrderPackage.ORDER_SUMMARY_ENTRY__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case OrderPackage.ORDER_SUMMARY_ENTRY__FACILITY_ID:
				if (resolve) return getFacilityId();
				return basicGetFacilityId();
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
			case OrderPackage.ORDER_SUMMARY_ENTRY__GROSS_SALES:
				setGrossSales((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_SUMMARY_ENTRY__PRODUCT_COST:
				setProductCost((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_SUMMARY_ENTRY__TOTAL_QUANTITY:
				setTotalQuantity((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_SUMMARY_ENTRY__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case OrderPackage.ORDER_SUMMARY_ENTRY__FACILITY_ID:
				setFacilityId((Facility)newValue);
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
			case OrderPackage.ORDER_SUMMARY_ENTRY__GROSS_SALES:
				setGrossSales(GROSS_SALES_EDEFAULT);
				return;
			case OrderPackage.ORDER_SUMMARY_ENTRY__PRODUCT_COST:
				setProductCost(PRODUCT_COST_EDEFAULT);
				return;
			case OrderPackage.ORDER_SUMMARY_ENTRY__TOTAL_QUANTITY:
				setTotalQuantity(TOTAL_QUANTITY_EDEFAULT);
				return;
			case OrderPackage.ORDER_SUMMARY_ENTRY__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case OrderPackage.ORDER_SUMMARY_ENTRY__FACILITY_ID:
				setFacilityId((Facility)null);
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
			case OrderPackage.ORDER_SUMMARY_ENTRY__GROSS_SALES:
				return GROSS_SALES_EDEFAULT == null ? grossSales != null : !GROSS_SALES_EDEFAULT.equals(grossSales);
			case OrderPackage.ORDER_SUMMARY_ENTRY__PRODUCT_COST:
				return PRODUCT_COST_EDEFAULT == null ? productCost != null : !PRODUCT_COST_EDEFAULT.equals(productCost);
			case OrderPackage.ORDER_SUMMARY_ENTRY__TOTAL_QUANTITY:
				return TOTAL_QUANTITY_EDEFAULT == null ? totalQuantity != null : !TOTAL_QUANTITY_EDEFAULT.equals(totalQuantity);
			case OrderPackage.ORDER_SUMMARY_ENTRY__PRODUCT_ID:
				return productId != null;
			case OrderPackage.ORDER_SUMMARY_ENTRY__FACILITY_ID:
				return facilityId != null;
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
