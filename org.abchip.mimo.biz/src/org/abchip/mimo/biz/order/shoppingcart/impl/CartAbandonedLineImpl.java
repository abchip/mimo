/**
 * Copyright (c) 2017, 2019 ABChip and others.
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cart Abandoned Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getVisitId <em>Visit Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getCartAbandonedLineSeqId <em>Cart Abandoned Line Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getConfigId <em>Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getReserv2ndPPPerc <em>Reserv2nd PP Perc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getReservLength <em>Reserv Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getReservNthPPPerc <em>Reserv Nth PP Perc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getReservPersons <em>Reserv Persons</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getReservStart <em>Reserv Start</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getTotalWithAdjustments <em>Total With Adjustments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#isWasReserved <em>Was Reserved</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppingcart.impl.CartAbandonedLineImpl#getProdCatalogId <em>Prod Catalog Id</em>}</li>
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
	 * The default value of the '{@link #getVisitId() <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitId()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisitId() <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitId()
	 * @generated
	 * @ordered
	 */
	protected String visitId = VISIT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCartAbandonedLineSeqId() <em>Cart Abandoned Line Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartAbandonedLineSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String CART_ABANDONED_LINE_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCartAbandonedLineSeqId() <em>Cart Abandoned Line Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCartAbandonedLineSeqId()
	 * @generated
	 * @ordered
	 */
	protected String cartAbandonedLineSeqId = CART_ABANDONED_LINE_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigId() <em>Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigId() <em>Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigId()
	 * @generated
	 * @ordered
	 */
	protected String configId = CONFIG_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserv2ndPPPerc() <em>Reserv2nd PP Perc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserv2ndPPPerc()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RESERV2ND_PP_PERC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserv2ndPPPerc() <em>Reserv2nd PP Perc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserv2ndPPPerc()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal reserv2ndPPPerc = RESERV2ND_PP_PERC_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservLength() <em>Reserv Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservLength()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RESERV_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReservLength() <em>Reserv Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservLength()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal reservLength = RESERV_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservNthPPPerc() <em>Reserv Nth PP Perc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservNthPPPerc()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RESERV_NTH_PP_PERC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReservNthPPPerc() <em>Reserv Nth PP Perc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservNthPPPerc()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal reservNthPPPerc = RESERV_NTH_PP_PERC_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservPersons() <em>Reserv Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservPersons()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RESERV_PERSONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReservPersons() <em>Reserv Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservPersons()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal reservPersons = RESERV_PERSONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservStart() <em>Reserv Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date RESERV_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReservStart() <em>Reserv Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservStart()
	 * @generated
	 * @ordered
	 */
	protected Date reservStart = RESERV_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalWithAdjustments() <em>Total With Adjustments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalWithAdjustments()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TOTAL_WITH_ADJUSTMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalWithAdjustments() <em>Total With Adjustments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalWithAdjustments()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal totalWithAdjustments = TOTAL_WITH_ADJUSTMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitPrice() <em>Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal UNIT_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitPrice() <em>Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal unitPrice = UNIT_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #isWasReserved() <em>Was Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWasReserved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WAS_RESERVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWasReserved() <em>Was Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWasReserved()
	 * @generated
	 * @ordered
	 */
	protected boolean wasReserved = WAS_RESERVED_EDEFAULT;

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
	 * The cached value of the '{@link #getProdCatalogId() <em>Prod Catalog Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdCatalogId()
	 * @generated
	 * @ordered
	 */
	protected ProdCatalog prodCatalogId;

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
		return cartAbandonedLineSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCartAbandonedLineSeqId(String newCartAbandonedLineSeqId) {
		cartAbandonedLineSeqId = newCartAbandonedLineSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigId() {
		return configId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigId(String newConfigId) {
		configId = newConfigId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProdCatalog getProdCatalogId() {
		if (prodCatalogId != null && ((EObject)prodCatalogId).eIsProxy()) {
			InternalEObject oldProdCatalogId = (InternalEObject)prodCatalogId;
			prodCatalogId = (ProdCatalog)eResolveProxy(oldProdCatalogId);
			if (prodCatalogId != oldProdCatalogId) {
			}
		}
		return prodCatalogId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProdCatalog basicGetProdCatalogId() {
		return prodCatalogId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProdCatalogId(ProdCatalog newProdCatalogId) {
		prodCatalogId = newProdCatalogId;
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
	public BigDecimal getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(BigDecimal newQuantity) {
		quantity = newQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReserv2ndPPPerc() {
		return reserv2ndPPPerc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserv2ndPPPerc(BigDecimal newReserv2ndPPPerc) {
		reserv2ndPPPerc = newReserv2ndPPPerc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReservLength() {
		return reservLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservLength(BigDecimal newReservLength) {
		reservLength = newReservLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReservNthPPPerc() {
		return reservNthPPPerc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservNthPPPerc(BigDecimal newReservNthPPPerc) {
		reservNthPPPerc = newReservNthPPPerc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReservPersons() {
		return reservPersons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservPersons(BigDecimal newReservPersons) {
		reservPersons = newReservPersons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReservStart() {
		return reservStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservStart(Date newReservStart) {
		reservStart = newReservStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTotalWithAdjustments() {
		return totalWithAdjustments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalWithAdjustments(BigDecimal newTotalWithAdjustments) {
		totalWithAdjustments = newTotalWithAdjustments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitPrice(BigDecimal newUnitPrice) {
		unitPrice = newUnitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWasReserved() {
		return wasReserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWasReserved(boolean newWasReserved) {
		wasReserved = newWasReserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisitId() {
		return visitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisitId(String newVisitId) {
		visitId = newVisitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShoppingcartPackage.CART_ABANDONED_LINE__VISIT_ID:
				return getVisitId();
			case ShoppingcartPackage.CART_ABANDONED_LINE__CART_ABANDONED_LINE_SEQ_ID:
				return getCartAbandonedLineSeqId();
			case ShoppingcartPackage.CART_ABANDONED_LINE__CONFIG_ID:
				return getConfigId();
			case ShoppingcartPackage.CART_ABANDONED_LINE__QUANTITY:
				return getQuantity();
			case ShoppingcartPackage.CART_ABANDONED_LINE__RESERV2ND_PP_PERC:
				return getReserv2ndPPPerc();
			case ShoppingcartPackage.CART_ABANDONED_LINE__RESERV_LENGTH:
				return getReservLength();
			case ShoppingcartPackage.CART_ABANDONED_LINE__RESERV_NTH_PP_PERC:
				return getReservNthPPPerc();
			case ShoppingcartPackage.CART_ABANDONED_LINE__RESERV_PERSONS:
				return getReservPersons();
			case ShoppingcartPackage.CART_ABANDONED_LINE__RESERV_START:
				return getReservStart();
			case ShoppingcartPackage.CART_ABANDONED_LINE__TOTAL_WITH_ADJUSTMENTS:
				return getTotalWithAdjustments();
			case ShoppingcartPackage.CART_ABANDONED_LINE__UNIT_PRICE:
				return getUnitPrice();
			case ShoppingcartPackage.CART_ABANDONED_LINE__WAS_RESERVED:
				return isWasReserved();
			case ShoppingcartPackage.CART_ABANDONED_LINE__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case ShoppingcartPackage.CART_ABANDONED_LINE__PROD_CATALOG_ID:
				if (resolve) return getProdCatalogId();
				return basicGetProdCatalogId();
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
			case ShoppingcartPackage.CART_ABANDONED_LINE__VISIT_ID:
				setVisitId((String)newValue);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__CART_ABANDONED_LINE_SEQ_ID:
				setCartAbandonedLineSeqId((String)newValue);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__CONFIG_ID:
				setConfigId((String)newValue);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__RESERV2ND_PP_PERC:
				setReserv2ndPPPerc((BigDecimal)newValue);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__RESERV_LENGTH:
				setReservLength((BigDecimal)newValue);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__RESERV_NTH_PP_PERC:
				setReservNthPPPerc((BigDecimal)newValue);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__RESERV_PERSONS:
				setReservPersons((BigDecimal)newValue);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__RESERV_START:
				setReservStart((Date)newValue);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__TOTAL_WITH_ADJUSTMENTS:
				setTotalWithAdjustments((BigDecimal)newValue);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__UNIT_PRICE:
				setUnitPrice((BigDecimal)newValue);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__WAS_RESERVED:
				setWasReserved((Boolean)newValue);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__PROD_CATALOG_ID:
				setProdCatalogId((ProdCatalog)newValue);
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
			case ShoppingcartPackage.CART_ABANDONED_LINE__VISIT_ID:
				setVisitId(VISIT_ID_EDEFAULT);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__CART_ABANDONED_LINE_SEQ_ID:
				setCartAbandonedLineSeqId(CART_ABANDONED_LINE_SEQ_ID_EDEFAULT);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__CONFIG_ID:
				setConfigId(CONFIG_ID_EDEFAULT);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__RESERV2ND_PP_PERC:
				setReserv2ndPPPerc(RESERV2ND_PP_PERC_EDEFAULT);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__RESERV_LENGTH:
				setReservLength(RESERV_LENGTH_EDEFAULT);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__RESERV_NTH_PP_PERC:
				setReservNthPPPerc(RESERV_NTH_PP_PERC_EDEFAULT);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__RESERV_PERSONS:
				setReservPersons(RESERV_PERSONS_EDEFAULT);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__RESERV_START:
				setReservStart(RESERV_START_EDEFAULT);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__TOTAL_WITH_ADJUSTMENTS:
				setTotalWithAdjustments(TOTAL_WITH_ADJUSTMENTS_EDEFAULT);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__UNIT_PRICE:
				setUnitPrice(UNIT_PRICE_EDEFAULT);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__WAS_RESERVED:
				setWasReserved(WAS_RESERVED_EDEFAULT);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case ShoppingcartPackage.CART_ABANDONED_LINE__PROD_CATALOG_ID:
				setProdCatalogId((ProdCatalog)null);
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
			case ShoppingcartPackage.CART_ABANDONED_LINE__VISIT_ID:
				return VISIT_ID_EDEFAULT == null ? visitId != null : !VISIT_ID_EDEFAULT.equals(visitId);
			case ShoppingcartPackage.CART_ABANDONED_LINE__CART_ABANDONED_LINE_SEQ_ID:
				return CART_ABANDONED_LINE_SEQ_ID_EDEFAULT == null ? cartAbandonedLineSeqId != null : !CART_ABANDONED_LINE_SEQ_ID_EDEFAULT.equals(cartAbandonedLineSeqId);
			case ShoppingcartPackage.CART_ABANDONED_LINE__CONFIG_ID:
				return CONFIG_ID_EDEFAULT == null ? configId != null : !CONFIG_ID_EDEFAULT.equals(configId);
			case ShoppingcartPackage.CART_ABANDONED_LINE__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case ShoppingcartPackage.CART_ABANDONED_LINE__RESERV2ND_PP_PERC:
				return RESERV2ND_PP_PERC_EDEFAULT == null ? reserv2ndPPPerc != null : !RESERV2ND_PP_PERC_EDEFAULT.equals(reserv2ndPPPerc);
			case ShoppingcartPackage.CART_ABANDONED_LINE__RESERV_LENGTH:
				return RESERV_LENGTH_EDEFAULT == null ? reservLength != null : !RESERV_LENGTH_EDEFAULT.equals(reservLength);
			case ShoppingcartPackage.CART_ABANDONED_LINE__RESERV_NTH_PP_PERC:
				return RESERV_NTH_PP_PERC_EDEFAULT == null ? reservNthPPPerc != null : !RESERV_NTH_PP_PERC_EDEFAULT.equals(reservNthPPPerc);
			case ShoppingcartPackage.CART_ABANDONED_LINE__RESERV_PERSONS:
				return RESERV_PERSONS_EDEFAULT == null ? reservPersons != null : !RESERV_PERSONS_EDEFAULT.equals(reservPersons);
			case ShoppingcartPackage.CART_ABANDONED_LINE__RESERV_START:
				return RESERV_START_EDEFAULT == null ? reservStart != null : !RESERV_START_EDEFAULT.equals(reservStart);
			case ShoppingcartPackage.CART_ABANDONED_LINE__TOTAL_WITH_ADJUSTMENTS:
				return TOTAL_WITH_ADJUSTMENTS_EDEFAULT == null ? totalWithAdjustments != null : !TOTAL_WITH_ADJUSTMENTS_EDEFAULT.equals(totalWithAdjustments);
			case ShoppingcartPackage.CART_ABANDONED_LINE__UNIT_PRICE:
				return UNIT_PRICE_EDEFAULT == null ? unitPrice != null : !UNIT_PRICE_EDEFAULT.equals(unitPrice);
			case ShoppingcartPackage.CART_ABANDONED_LINE__WAS_RESERVED:
				return wasReserved != WAS_RESERVED_EDEFAULT;
			case ShoppingcartPackage.CART_ABANDONED_LINE__PRODUCT_ID:
				return productId != null;
			case ShoppingcartPackage.CART_ABANDONED_LINE__PROD_CATALOG_ID:
				return prodCatalogId != null;
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
		result.append(" (visitId: ");
		result.append(visitId);
		result.append(", cartAbandonedLineSeqId: ");
		result.append(cartAbandonedLineSeqId);
		result.append(", configId: ");
		result.append(configId);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", reserv2ndPPPerc: ");
		result.append(reserv2ndPPPerc);
		result.append(", reservLength: ");
		result.append(reservLength);
		result.append(", reservNthPPPerc: ");
		result.append(reservNthPPPerc);
		result.append(", reservPersons: ");
		result.append(reservPersons);
		result.append(", reservStart: ");
		result.append(reservStart);
		result.append(", totalWithAdjustments: ");
		result.append(totalWithAdjustments);
		result.append(", unitPrice: ");
		result.append(unitPrice);
		result.append(", wasReserved: ");
		result.append(wasReserved);
		result.append(')');
		return result.toString();
	}

} //CartAbandonedLineImpl
