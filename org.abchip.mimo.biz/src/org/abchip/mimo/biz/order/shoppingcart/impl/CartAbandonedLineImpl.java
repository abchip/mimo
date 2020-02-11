/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.shoppingcart.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.shoppingcart.CartAbandonedLine;
import org.abchip.mimo.biz.order.shoppingcart.ShoppingcartPackage;
import org.abchip.mimo.biz.product.catalog.ProdCatalog;
import org.abchip.mimo.biz.product.product.Product;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cart Abandoned Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getCartAbandonedLineSeqId <em>Cart Abandoned Line Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getVisitId <em>Visit Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getConfigId <em>Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getProdCatalogId <em>Prod Catalog Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getReserv2ndPPPerc <em>Reserv2nd PP Perc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getReservLength <em>Reserv Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getReservNthPPPerc <em>Reserv Nth PP Perc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getReservPersons <em>Reserv Persons</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getReservStart <em>Reserv Start</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getTotalWithAdjustments <em>Total With Adjustments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#isWasReserved <em>Was Reserved</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CartAbandonedLineImpl extends BizEntityImpl implements CartAbandonedLine {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartAbandonedLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShoppingcartPackage.Literals.CART_ABANDONED_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCartAbandonedLineSeqId() {
		return (String)eGet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__CART_ABANDONED_LINE_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCartAbandonedLineSeqId(String newCartAbandonedLineSeqId) {
		eSet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__CART_ABANDONED_LINE_SEQ_ID, newCartAbandonedLineSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigId() {
		return (String)eGet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__CONFIG_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigId(String newConfigId) {
		eSet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__CONFIG_ID, newConfigId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProdCatalog getProdCatalogId() {
		return (ProdCatalog)eGet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__PROD_CATALOG_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProdCatalogId(ProdCatalog newProdCatalogId) {
		eSet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__PROD_CATALOG_ID, newProdCatalogId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductId() {
		return (Product)eGet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		eSet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__PRODUCT_ID, newProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantity() {
		return (BigDecimal)eGet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(BigDecimal newQuantity) {
		eSet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__QUANTITY, newQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReserv2ndPPPerc() {
		return (BigDecimal)eGet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__RESERV2ND_PP_PERC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserv2ndPPPerc(BigDecimal newReserv2ndPPPerc) {
		eSet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__RESERV2ND_PP_PERC, newReserv2ndPPPerc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReservLength() {
		return (BigDecimal)eGet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__RESERV_LENGTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservLength(BigDecimal newReservLength) {
		eSet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__RESERV_LENGTH, newReservLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReservNthPPPerc() {
		return (BigDecimal)eGet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__RESERV_NTH_PP_PERC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservNthPPPerc(BigDecimal newReservNthPPPerc) {
		eSet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__RESERV_NTH_PP_PERC, newReservNthPPPerc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReservPersons() {
		return (BigDecimal)eGet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__RESERV_PERSONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservPersons(BigDecimal newReservPersons) {
		eSet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__RESERV_PERSONS, newReservPersons);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReservStart() {
		return (Date)eGet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__RESERV_START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservStart(Date newReservStart) {
		eSet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__RESERV_START, newReservStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTotalWithAdjustments() {
		return (BigDecimal)eGet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__TOTAL_WITH_ADJUSTMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalWithAdjustments(BigDecimal newTotalWithAdjustments) {
		eSet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__TOTAL_WITH_ADJUSTMENTS, newTotalWithAdjustments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUnitPrice() {
		return (BigDecimal)eGet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__UNIT_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitPrice(BigDecimal newUnitPrice) {
		eSet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__UNIT_PRICE, newUnitPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWasReserved() {
		return (Boolean)eGet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__WAS_RESERVED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWasReserved(boolean newWasReserved) {
		eSet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__WAS_RESERVED, newWasReserved);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisitId() {
		return (String)eGet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__VISIT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisitId(String newVisitId) {
		eSet(ShoppingcartPackage.Literals.CART_ABANDONED_LINE__VISIT_ID, newVisitId);
	}

} //CartAbandonedLineImpl
