/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplier Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getMinimumOrderQuantity <em>Minimum Order Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getAvailableFromDate <em>Available From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getAgreementId <em>Agreement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getAvailableThruDate <em>Available Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#isCanDropShip <em>Can Drop Ship</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getLastPrice <em>Last Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getOrderQtyIncrements <em>Order Qty Increments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getShippingPrice <em>Shipping Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getStandardLeadTimeDays <em>Standard Lead Time Days</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getSupplierProductId <em>Supplier Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getSupplierProductName <em>Supplier Product Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getUnitsIncluded <em>Units Included</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getSupplierPrefOrderId <em>Supplier Pref Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getSupplierRatingTypeId <em>Supplier Rating Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl#getQuantityUomId <em>Quantity Uom Id</em>}</li>
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
	 * The default value of the '{@link #getMinimumOrderQuantity() <em>Minimum Order Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumOrderQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MINIMUM_ORDER_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumOrderQuantity() <em>Minimum Order Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumOrderQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal minimumOrderQuantity = MINIMUM_ORDER_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableFromDate() <em>Available From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date AVAILABLE_FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailableFromDate() <em>Available From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date availableFromDate = AVAILABLE_FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgreementId() <em>Agreement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementId()
	 * @generated
	 * @ordered
	 */
	protected static final String AGREEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgreementId() <em>Agreement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementId()
	 * @generated
	 * @ordered
	 */
	protected String agreementId = AGREEMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgreementItemSeqId() <em>Agreement Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String AGREEMENT_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgreementItemSeqId() <em>Agreement Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String agreementItemSeqId = AGREEMENT_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableThruDate() <em>Available Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date AVAILABLE_THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailableThruDate() <em>Available Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date availableThruDate = AVAILABLE_THRU_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCanDropShip() <em>Can Drop Ship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanDropShip()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_DROP_SHIP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanDropShip() <em>Can Drop Ship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanDropShip()
	 * @generated
	 * @ordered
	 */
	protected boolean canDropShip = CAN_DROP_SHIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastPrice() <em>Last Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal LAST_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastPrice() <em>Last Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal lastPrice = LAST_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderQtyIncrements() <em>Order Qty Increments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderQtyIncrements()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ORDER_QTY_INCREMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderQtyIncrements() <em>Order Qty Increments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderQtyIncrements()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal orderQtyIncrements = ORDER_QTY_INCREMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getShippingPrice() <em>Shipping Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingPrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SHIPPING_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShippingPrice() <em>Shipping Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingPrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal shippingPrice = SHIPPING_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStandardLeadTimeDays() <em>Standard Lead Time Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardLeadTimeDays()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal STANDARD_LEAD_TIME_DAYS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandardLeadTimeDays() <em>Standard Lead Time Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardLeadTimeDays()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal standardLeadTimeDays = STANDARD_LEAD_TIME_DAYS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupplierProductId() <em>Supplier Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierProductId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_PRODUCT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplierProductId() <em>Supplier Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierProductId()
	 * @generated
	 * @ordered
	 */
	protected String supplierProductId = SUPPLIER_PRODUCT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupplierProductName() <em>Supplier Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierProductName()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_PRODUCT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplierProductName() <em>Supplier Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierProductName()
	 * @generated
	 * @ordered
	 */
	protected String supplierProductName = SUPPLIER_PRODUCT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitsIncluded() <em>Units Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsIncluded()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal UNITS_INCLUDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitsIncluded() <em>Units Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsIncluded()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal unitsIncluded = UNITS_INCLUDED_EDEFAULT;

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
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;

	/**
	 * The cached value of the '{@link #getSupplierPrefOrderId() <em>Supplier Pref Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierPrefOrderId()
	 * @generated
	 * @ordered
	 */
	protected SupplierPrefOrder supplierPrefOrderId;

	/**
	 * The cached value of the '{@link #getSupplierRatingTypeId() <em>Supplier Rating Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierRatingTypeId()
	 * @generated
	 * @ordered
	 */
	protected SupplierRatingType supplierRatingTypeId;

	/**
	 * The cached value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom currencyUomId;

	/**
	 * The cached value of the '{@link #getQuantityUomId() <em>Quantity Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom quantityUomId;

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
		return agreementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementId(String newAgreementId) {
		agreementId = newAgreementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAgreementItemSeqId() {
		return agreementItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementItemSeqId(String newAgreementItemSeqId) {
		agreementItemSeqId = newAgreementItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getAvailableFromDate() {
		return availableFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableFromDate(Date newAvailableFromDate) {
		availableFromDate = newAvailableFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getAvailableThruDate() {
		return availableThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableThruDate(Date newAvailableThruDate) {
		availableThruDate = newAvailableThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCanDropShip() {
		return canDropShip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanDropShip(boolean newCanDropShip) {
		canDropShip = newCanDropShip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		comments = newComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUomId() {
		if (currencyUomId != null && ((EObject)currencyUomId).eIsProxy()) {
			InternalEObject oldCurrencyUomId = (InternalEObject)currencyUomId;
			currencyUomId = (Uom)eResolveProxy(oldCurrencyUomId);
			if (currencyUomId != oldCurrencyUomId) {
			}
		}
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetCurrencyUomId() {
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(Uom newCurrencyUomId) {
		currencyUomId = newCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getLastPrice() {
		return lastPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastPrice(BigDecimal newLastPrice) {
		lastPrice = newLastPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMinimumOrderQuantity() {
		return minimumOrderQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumOrderQuantity(BigDecimal newMinimumOrderQuantity) {
		minimumOrderQuantity = newMinimumOrderQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOrderQtyIncrements() {
		return orderQtyIncrements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderQtyIncrements(BigDecimal newOrderQtyIncrements) {
		orderQtyIncrements = newOrderQtyIncrements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		partyId = newPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getQuantityUomId() {
		if (quantityUomId != null && ((EObject)quantityUomId).eIsProxy()) {
			InternalEObject oldQuantityUomId = (InternalEObject)quantityUomId;
			quantityUomId = (Uom)eResolveProxy(oldQuantityUomId);
			if (quantityUomId != oldQuantityUomId) {
			}
		}
		return quantityUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetQuantityUomId() {
		return quantityUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityUomId(Uom newQuantityUomId) {
		quantityUomId = newQuantityUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getShippingPrice() {
		return shippingPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShippingPrice(BigDecimal newShippingPrice) {
		shippingPrice = newShippingPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getStandardLeadTimeDays() {
		return standardLeadTimeDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandardLeadTimeDays(BigDecimal newStandardLeadTimeDays) {
		standardLeadTimeDays = newStandardLeadTimeDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupplierProductId() {
		return supplierProductId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierProductId(String newSupplierProductId) {
		supplierProductId = newSupplierProductId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupplierProductName() {
		return supplierProductName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierProductName(String newSupplierProductName) {
		supplierProductName = newSupplierProductName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUnitsIncluded() {
		return unitsIncluded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitsIncluded(BigDecimal newUnitsIncluded) {
		unitsIncluded = newUnitsIncluded;
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
	public SupplierPrefOrder getSupplierPrefOrderId() {
		if (supplierPrefOrderId != null && ((EObject)supplierPrefOrderId).eIsProxy()) {
			InternalEObject oldSupplierPrefOrderId = (InternalEObject)supplierPrefOrderId;
			supplierPrefOrderId = (SupplierPrefOrder)eResolveProxy(oldSupplierPrefOrderId);
			if (supplierPrefOrderId != oldSupplierPrefOrderId) {
			}
		}
		return supplierPrefOrderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplierPrefOrder basicGetSupplierPrefOrderId() {
		return supplierPrefOrderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierPrefOrderId(SupplierPrefOrder newSupplierPrefOrderId) {
		supplierPrefOrderId = newSupplierPrefOrderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplierRatingType getSupplierRatingTypeId() {
		if (supplierRatingTypeId != null && ((EObject)supplierRatingTypeId).eIsProxy()) {
			InternalEObject oldSupplierRatingTypeId = (InternalEObject)supplierRatingTypeId;
			supplierRatingTypeId = (SupplierRatingType)eResolveProxy(oldSupplierRatingTypeId);
			if (supplierRatingTypeId != oldSupplierRatingTypeId) {
			}
		}
		return supplierRatingTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplierRatingType basicGetSupplierRatingTypeId() {
		return supplierRatingTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierRatingTypeId(SupplierRatingType newSupplierRatingTypeId) {
		supplierRatingTypeId = newSupplierRatingTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SupplierPackage.SUPPLIER_PRODUCT__MINIMUM_ORDER_QUANTITY:
				return getMinimumOrderQuantity();
			case SupplierPackage.SUPPLIER_PRODUCT__AVAILABLE_FROM_DATE:
				return getAvailableFromDate();
			case SupplierPackage.SUPPLIER_PRODUCT__AGREEMENT_ID:
				return getAgreementId();
			case SupplierPackage.SUPPLIER_PRODUCT__AGREEMENT_ITEM_SEQ_ID:
				return getAgreementItemSeqId();
			case SupplierPackage.SUPPLIER_PRODUCT__AVAILABLE_THRU_DATE:
				return getAvailableThruDate();
			case SupplierPackage.SUPPLIER_PRODUCT__CAN_DROP_SHIP:
				return isCanDropShip();
			case SupplierPackage.SUPPLIER_PRODUCT__COMMENTS:
				return getComments();
			case SupplierPackage.SUPPLIER_PRODUCT__LAST_PRICE:
				return getLastPrice();
			case SupplierPackage.SUPPLIER_PRODUCT__ORDER_QTY_INCREMENTS:
				return getOrderQtyIncrements();
			case SupplierPackage.SUPPLIER_PRODUCT__SHIPPING_PRICE:
				return getShippingPrice();
			case SupplierPackage.SUPPLIER_PRODUCT__STANDARD_LEAD_TIME_DAYS:
				return getStandardLeadTimeDays();
			case SupplierPackage.SUPPLIER_PRODUCT__SUPPLIER_PRODUCT_ID:
				return getSupplierProductId();
			case SupplierPackage.SUPPLIER_PRODUCT__SUPPLIER_PRODUCT_NAME:
				return getSupplierProductName();
			case SupplierPackage.SUPPLIER_PRODUCT__UNITS_INCLUDED:
				return getUnitsIncluded();
			case SupplierPackage.SUPPLIER_PRODUCT__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case SupplierPackage.SUPPLIER_PRODUCT__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case SupplierPackage.SUPPLIER_PRODUCT__SUPPLIER_PREF_ORDER_ID:
				if (resolve) return getSupplierPrefOrderId();
				return basicGetSupplierPrefOrderId();
			case SupplierPackage.SUPPLIER_PRODUCT__SUPPLIER_RATING_TYPE_ID:
				if (resolve) return getSupplierRatingTypeId();
				return basicGetSupplierRatingTypeId();
			case SupplierPackage.SUPPLIER_PRODUCT__CURRENCY_UOM_ID:
				if (resolve) return getCurrencyUomId();
				return basicGetCurrencyUomId();
			case SupplierPackage.SUPPLIER_PRODUCT__QUANTITY_UOM_ID:
				if (resolve) return getQuantityUomId();
				return basicGetQuantityUomId();
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
			case SupplierPackage.SUPPLIER_PRODUCT__MINIMUM_ORDER_QUANTITY:
				setMinimumOrderQuantity((BigDecimal)newValue);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__AVAILABLE_FROM_DATE:
				setAvailableFromDate((Date)newValue);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__AGREEMENT_ID:
				setAgreementId((String)newValue);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__AGREEMENT_ITEM_SEQ_ID:
				setAgreementItemSeqId((String)newValue);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__AVAILABLE_THRU_DATE:
				setAvailableThruDate((Date)newValue);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__CAN_DROP_SHIP:
				setCanDropShip((Boolean)newValue);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__COMMENTS:
				setComments((String)newValue);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__LAST_PRICE:
				setLastPrice((BigDecimal)newValue);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__ORDER_QTY_INCREMENTS:
				setOrderQtyIncrements((BigDecimal)newValue);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__SHIPPING_PRICE:
				setShippingPrice((BigDecimal)newValue);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__STANDARD_LEAD_TIME_DAYS:
				setStandardLeadTimeDays((BigDecimal)newValue);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__SUPPLIER_PRODUCT_ID:
				setSupplierProductId((String)newValue);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__SUPPLIER_PRODUCT_NAME:
				setSupplierProductName((String)newValue);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__UNITS_INCLUDED:
				setUnitsIncluded((BigDecimal)newValue);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__SUPPLIER_PREF_ORDER_ID:
				setSupplierPrefOrderId((SupplierPrefOrder)newValue);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__SUPPLIER_RATING_TYPE_ID:
				setSupplierRatingTypeId((SupplierRatingType)newValue);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)newValue);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__QUANTITY_UOM_ID:
				setQuantityUomId((Uom)newValue);
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
			case SupplierPackage.SUPPLIER_PRODUCT__MINIMUM_ORDER_QUANTITY:
				setMinimumOrderQuantity(MINIMUM_ORDER_QUANTITY_EDEFAULT);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__AVAILABLE_FROM_DATE:
				setAvailableFromDate(AVAILABLE_FROM_DATE_EDEFAULT);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__AGREEMENT_ID:
				setAgreementId(AGREEMENT_ID_EDEFAULT);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__AGREEMENT_ITEM_SEQ_ID:
				setAgreementItemSeqId(AGREEMENT_ITEM_SEQ_ID_EDEFAULT);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__AVAILABLE_THRU_DATE:
				setAvailableThruDate(AVAILABLE_THRU_DATE_EDEFAULT);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__CAN_DROP_SHIP:
				setCanDropShip(CAN_DROP_SHIP_EDEFAULT);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__LAST_PRICE:
				setLastPrice(LAST_PRICE_EDEFAULT);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__ORDER_QTY_INCREMENTS:
				setOrderQtyIncrements(ORDER_QTY_INCREMENTS_EDEFAULT);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__SHIPPING_PRICE:
				setShippingPrice(SHIPPING_PRICE_EDEFAULT);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__STANDARD_LEAD_TIME_DAYS:
				setStandardLeadTimeDays(STANDARD_LEAD_TIME_DAYS_EDEFAULT);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__SUPPLIER_PRODUCT_ID:
				setSupplierProductId(SUPPLIER_PRODUCT_ID_EDEFAULT);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__SUPPLIER_PRODUCT_NAME:
				setSupplierProductName(SUPPLIER_PRODUCT_NAME_EDEFAULT);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__UNITS_INCLUDED:
				setUnitsIncluded(UNITS_INCLUDED_EDEFAULT);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__PARTY_ID:
				setPartyId((Party)null);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__SUPPLIER_PREF_ORDER_ID:
				setSupplierPrefOrderId((SupplierPrefOrder)null);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__SUPPLIER_RATING_TYPE_ID:
				setSupplierRatingTypeId((SupplierRatingType)null);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)null);
				return;
			case SupplierPackage.SUPPLIER_PRODUCT__QUANTITY_UOM_ID:
				setQuantityUomId((Uom)null);
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
			case SupplierPackage.SUPPLIER_PRODUCT__MINIMUM_ORDER_QUANTITY:
				return MINIMUM_ORDER_QUANTITY_EDEFAULT == null ? minimumOrderQuantity != null : !MINIMUM_ORDER_QUANTITY_EDEFAULT.equals(minimumOrderQuantity);
			case SupplierPackage.SUPPLIER_PRODUCT__AVAILABLE_FROM_DATE:
				return AVAILABLE_FROM_DATE_EDEFAULT == null ? availableFromDate != null : !AVAILABLE_FROM_DATE_EDEFAULT.equals(availableFromDate);
			case SupplierPackage.SUPPLIER_PRODUCT__AGREEMENT_ID:
				return AGREEMENT_ID_EDEFAULT == null ? agreementId != null : !AGREEMENT_ID_EDEFAULT.equals(agreementId);
			case SupplierPackage.SUPPLIER_PRODUCT__AGREEMENT_ITEM_SEQ_ID:
				return AGREEMENT_ITEM_SEQ_ID_EDEFAULT == null ? agreementItemSeqId != null : !AGREEMENT_ITEM_SEQ_ID_EDEFAULT.equals(agreementItemSeqId);
			case SupplierPackage.SUPPLIER_PRODUCT__AVAILABLE_THRU_DATE:
				return AVAILABLE_THRU_DATE_EDEFAULT == null ? availableThruDate != null : !AVAILABLE_THRU_DATE_EDEFAULT.equals(availableThruDate);
			case SupplierPackage.SUPPLIER_PRODUCT__CAN_DROP_SHIP:
				return canDropShip != CAN_DROP_SHIP_EDEFAULT;
			case SupplierPackage.SUPPLIER_PRODUCT__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case SupplierPackage.SUPPLIER_PRODUCT__LAST_PRICE:
				return LAST_PRICE_EDEFAULT == null ? lastPrice != null : !LAST_PRICE_EDEFAULT.equals(lastPrice);
			case SupplierPackage.SUPPLIER_PRODUCT__ORDER_QTY_INCREMENTS:
				return ORDER_QTY_INCREMENTS_EDEFAULT == null ? orderQtyIncrements != null : !ORDER_QTY_INCREMENTS_EDEFAULT.equals(orderQtyIncrements);
			case SupplierPackage.SUPPLIER_PRODUCT__SHIPPING_PRICE:
				return SHIPPING_PRICE_EDEFAULT == null ? shippingPrice != null : !SHIPPING_PRICE_EDEFAULT.equals(shippingPrice);
			case SupplierPackage.SUPPLIER_PRODUCT__STANDARD_LEAD_TIME_DAYS:
				return STANDARD_LEAD_TIME_DAYS_EDEFAULT == null ? standardLeadTimeDays != null : !STANDARD_LEAD_TIME_DAYS_EDEFAULT.equals(standardLeadTimeDays);
			case SupplierPackage.SUPPLIER_PRODUCT__SUPPLIER_PRODUCT_ID:
				return SUPPLIER_PRODUCT_ID_EDEFAULT == null ? supplierProductId != null : !SUPPLIER_PRODUCT_ID_EDEFAULT.equals(supplierProductId);
			case SupplierPackage.SUPPLIER_PRODUCT__SUPPLIER_PRODUCT_NAME:
				return SUPPLIER_PRODUCT_NAME_EDEFAULT == null ? supplierProductName != null : !SUPPLIER_PRODUCT_NAME_EDEFAULT.equals(supplierProductName);
			case SupplierPackage.SUPPLIER_PRODUCT__UNITS_INCLUDED:
				return UNITS_INCLUDED_EDEFAULT == null ? unitsIncluded != null : !UNITS_INCLUDED_EDEFAULT.equals(unitsIncluded);
			case SupplierPackage.SUPPLIER_PRODUCT__PRODUCT_ID:
				return productId != null;
			case SupplierPackage.SUPPLIER_PRODUCT__PARTY_ID:
				return partyId != null;
			case SupplierPackage.SUPPLIER_PRODUCT__SUPPLIER_PREF_ORDER_ID:
				return supplierPrefOrderId != null;
			case SupplierPackage.SUPPLIER_PRODUCT__SUPPLIER_RATING_TYPE_ID:
				return supplierRatingTypeId != null;
			case SupplierPackage.SUPPLIER_PRODUCT__CURRENCY_UOM_ID:
				return currencyUomId != null;
			case SupplierPackage.SUPPLIER_PRODUCT__QUANTITY_UOM_ID:
				return quantityUomId != null;
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
		result.append(" (minimumOrderQuantity: ");
		result.append(minimumOrderQuantity);
		result.append(", availableFromDate: ");
		result.append(availableFromDate);
		result.append(", agreementId: ");
		result.append(agreementId);
		result.append(", agreementItemSeqId: ");
		result.append(agreementItemSeqId);
		result.append(", availableThruDate: ");
		result.append(availableThruDate);
		result.append(", canDropShip: ");
		result.append(canDropShip);
		result.append(", comments: ");
		result.append(comments);
		result.append(", lastPrice: ");
		result.append(lastPrice);
		result.append(", orderQtyIncrements: ");
		result.append(orderQtyIncrements);
		result.append(", shippingPrice: ");
		result.append(shippingPrice);
		result.append(", standardLeadTimeDays: ");
		result.append(standardLeadTimeDays);
		result.append(", supplierProductId: ");
		result.append(supplierProductId);
		result.append(", supplierProductName: ");
		result.append(supplierProductName);
		result.append(", unitsIncluded: ");
		result.append(unitsIncluded);
		result.append(')');
		return result.toString();
	}

} //SupplierProductImpl
