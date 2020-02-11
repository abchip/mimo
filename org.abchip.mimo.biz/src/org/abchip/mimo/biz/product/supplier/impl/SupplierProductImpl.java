/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.supplier.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.supplier.SupplierPackage;
import org.abchip.mimo.biz.product.supplier.SupplierPrefOrder;
import org.abchip.mimo.biz.product.supplier.SupplierProduct;
import org.abchip.mimo.biz.product.supplier.SupplierRatingType;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplier Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getAvailableFromDate <em>Available From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getMinimumOrderQuantity <em>Minimum Order Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getAgreementId <em>Agreement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getAvailableThruDate <em>Available Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#isCanDropShip <em>Can Drop Ship</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getLastPrice <em>Last Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getOrderQtyIncrements <em>Order Qty Increments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getQuantityUomId <em>Quantity Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getShippingPrice <em>Shipping Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getStandardLeadTimeDays <em>Standard Lead Time Days</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getSupplierPrefOrderId <em>Supplier Pref Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getSupplierProductId <em>Supplier Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getSupplierProductName <em>Supplier Product Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getSupplierRatingTypeId <em>Supplier Rating Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getUnitsIncluded <em>Units Included</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplierProductImpl extends BizEntityImpl implements SupplierProduct {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplierProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupplierPackage.Literals.SUPPLIER_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAgreementId() {
		return (String)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__AGREEMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementId(String newAgreementId) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__AGREEMENT_ID, newAgreementId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAgreementItemSeqId() {
		return (String)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__AGREEMENT_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementItemSeqId(String newAgreementItemSeqId) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__AGREEMENT_ITEM_SEQ_ID, newAgreementItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getAvailableFromDate() {
		return (Date)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__AVAILABLE_FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableFromDate(Date newAvailableFromDate) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__AVAILABLE_FROM_DATE, newAvailableFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getAvailableThruDate() {
		return (Date)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__AVAILABLE_THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableThruDate(Date newAvailableThruDate) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__AVAILABLE_THRU_DATE, newAvailableThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCanDropShip() {
		return (Boolean)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__CAN_DROP_SHIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanDropShip(boolean newCanDropShip) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__CAN_DROP_SHIP, newCanDropShip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return (String)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUomId() {
		return (Uom)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__CURRENCY_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(Uom newCurrencyUomId) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__CURRENCY_UOM_ID, newCurrencyUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getLastPrice() {
		return (BigDecimal)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__LAST_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastPrice(BigDecimal newLastPrice) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__LAST_PRICE, newLastPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMinimumOrderQuantity() {
		return (BigDecimal)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__MINIMUM_ORDER_QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumOrderQuantity(BigDecimal newMinimumOrderQuantity) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__MINIMUM_ORDER_QUANTITY, newMinimumOrderQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOrderQtyIncrements() {
		return (BigDecimal)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__ORDER_QTY_INCREMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderQtyIncrements(BigDecimal newOrderQtyIncrements) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__ORDER_QTY_INCREMENTS, newOrderQtyIncrements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		return (Party)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getQuantityUomId() {
		return (Uom)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__QUANTITY_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityUomId(Uom newQuantityUomId) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__QUANTITY_UOM_ID, newQuantityUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getShippingPrice() {
		return (BigDecimal)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__SHIPPING_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShippingPrice(BigDecimal newShippingPrice) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__SHIPPING_PRICE, newShippingPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getStandardLeadTimeDays() {
		return (BigDecimal)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__STANDARD_LEAD_TIME_DAYS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardLeadTimeDays(BigDecimal newStandardLeadTimeDays) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__STANDARD_LEAD_TIME_DAYS, newStandardLeadTimeDays);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupplierProductId() {
		return (String)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__SUPPLIER_PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierProductId(String newSupplierProductId) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__SUPPLIER_PRODUCT_ID, newSupplierProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupplierProductName() {
		return (String)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__SUPPLIER_PRODUCT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierProductName(String newSupplierProductName) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__SUPPLIER_PRODUCT_NAME, newSupplierProductName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUnitsIncluded() {
		return (BigDecimal)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__UNITS_INCLUDED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitsIncluded(BigDecimal newUnitsIncluded) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__UNITS_INCLUDED, newUnitsIncluded);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductId() {
		return (Product)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__PRODUCT_ID, newProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplierPrefOrder getSupplierPrefOrderId() {
		return (SupplierPrefOrder)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__SUPPLIER_PREF_ORDER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierPrefOrderId(SupplierPrefOrder newSupplierPrefOrderId) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__SUPPLIER_PREF_ORDER_ID, newSupplierPrefOrderId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplierRatingType getSupplierRatingTypeId() {
		return (SupplierRatingType)eGet(SupplierPackage.Literals.SUPPLIER_PRODUCT__SUPPLIER_RATING_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierRatingTypeId(SupplierRatingType newSupplierRatingTypeId) {
		eSet(SupplierPackage.Literals.SUPPLIER_PRODUCT__SUPPLIER_RATING_TYPE_ID, newSupplierRatingTypeId);
	}

} //SupplierProductImpl
