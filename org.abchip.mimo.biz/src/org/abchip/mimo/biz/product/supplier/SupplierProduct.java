/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.supplier;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.product.Product;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplier Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getAvailableFromDate <em>Available From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getMinimumOrderQuantity <em>Minimum Order Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getAgreementId <em>Agreement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getAvailableThruDate <em>Available Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#isCanDropShip <em>Can Drop Ship</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getLastPrice <em>Last Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getOrderQtyIncrements <em>Order Qty Increments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getQuantityUomId <em>Quantity Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getShippingPrice <em>Shipping Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getStandardLeadTimeDays <em>Standard Lead Time Days</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getSupplierPrefOrderId <em>Supplier Pref Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getSupplierProductId <em>Supplier Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getSupplierProductName <em>Supplier Product Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getSupplierRatingTypeId <em>Supplier Rating Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getUnitsIncluded <em>Units Included</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProduct()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface SupplierProduct extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Agreement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Id</em>' attribute.
	 * @see #setAgreementId(String)
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProduct_AgreementId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getAgreementId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getAgreementId <em>Agreement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Id</em>' attribute.
	 * @see #getAgreementId()
	 * @generated
	 */
	void setAgreementId(String value);

	/**
	 * Returns the value of the '<em><b>Agreement Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Item Seq Id</em>' attribute.
	 * @see #setAgreementItemSeqId(String)
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProduct_AgreementItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getAgreementItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Item Seq Id</em>' attribute.
	 * @see #getAgreementItemSeqId()
	 * @generated
	 */
	void setAgreementItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Available From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available From Date</em>' attribute.
	 * @see #setAvailableFromDate(Date)
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProduct_AvailableFromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getAvailableFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getAvailableFromDate <em>Available From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available From Date</em>' attribute.
	 * @see #getAvailableFromDate()
	 * @generated
	 */
	void setAvailableFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Available Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Thru Date</em>' attribute.
	 * @see #setAvailableThruDate(Date)
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProduct_AvailableThruDate()
	 * @model
	 * @generated
	 */
	Date getAvailableThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getAvailableThruDate <em>Available Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Thru Date</em>' attribute.
	 * @see #getAvailableThruDate()
	 * @generated
	 */
	void setAvailableThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Can Drop Ship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Drop Ship</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Drop Ship</em>' attribute.
	 * @see #setCanDropShip(boolean)
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProduct_CanDropShip()
	 * @model required="true"
	 * @generated
	 */
	boolean isCanDropShip();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#isCanDropShip <em>Can Drop Ship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Drop Ship</em>' attribute.
	 * @see #isCanDropShip()
	 * @generated
	 */
	void setCanDropShip(boolean value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProduct_Comments()
	 * @model annotation="mimo-ent-format type='comment' length='255'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom Id</em>' reference.
	 * @see #setCurrencyUomId(Uom)
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProduct_CurrencyUomId()
	 * @model keys="uomId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Uom getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getCurrencyUomId <em>Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' reference.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Last Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Price</em>' attribute.
	 * @see #setLastPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProduct_LastPrice()
	 * @model annotation="mimo-ent-format type='currency-precise' precision='18' scale='3'"
	 * @generated
	 */
	BigDecimal getLastPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getLastPrice <em>Last Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Price</em>' attribute.
	 * @see #getLastPrice()
	 * @generated
	 */
	void setLastPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Minimum Order Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Order Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Order Quantity</em>' attribute.
	 * @see #setMinimumOrderQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProduct_MinimumOrderQuantity()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getMinimumOrderQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getMinimumOrderQuantity <em>Minimum Order Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Order Quantity</em>' attribute.
	 * @see #getMinimumOrderQuantity()
	 * @generated
	 */
	void setMinimumOrderQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Order Qty Increments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Qty Increments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Qty Increments</em>' attribute.
	 * @see #setOrderQtyIncrements(BigDecimal)
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProduct_OrderQtyIncrements()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getOrderQtyIncrements();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getOrderQtyIncrements <em>Order Qty Increments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Qty Increments</em>' attribute.
	 * @see #getOrderQtyIncrements()
	 * @generated
	 */
	void setOrderQtyIncrements(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' reference.
	 * @see #setPartyId(Party)
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProduct_PartyId()
	 * @model keys="partyId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getPartyId <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' reference.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Quantity Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Uom Id</em>' reference.
	 * @see #setQuantityUomId(Uom)
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProduct_QuantityUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getQuantityUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getQuantityUomId <em>Quantity Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Uom Id</em>' reference.
	 * @see #getQuantityUomId()
	 * @generated
	 */
	void setQuantityUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Shipping Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipping Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipping Price</em>' attribute.
	 * @see #setShippingPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProduct_ShippingPrice()
	 * @model annotation="mimo-ent-format type='currency-precise' precision='18' scale='3'"
	 * @generated
	 */
	BigDecimal getShippingPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getShippingPrice <em>Shipping Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipping Price</em>' attribute.
	 * @see #getShippingPrice()
	 * @generated
	 */
	void setShippingPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Standard Lead Time Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Lead Time Days</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Lead Time Days</em>' attribute.
	 * @see #setStandardLeadTimeDays(BigDecimal)
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProduct_StandardLeadTimeDays()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getStandardLeadTimeDays();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getStandardLeadTimeDays <em>Standard Lead Time Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Lead Time Days</em>' attribute.
	 * @see #getStandardLeadTimeDays()
	 * @generated
	 */
	void setStandardLeadTimeDays(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Supplier Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Product Id</em>' attribute.
	 * @see #setSupplierProductId(String)
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProduct_SupplierProductId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSupplierProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getSupplierProductId <em>Supplier Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Product Id</em>' attribute.
	 * @see #getSupplierProductId()
	 * @generated
	 */
	void setSupplierProductId(String value);

	/**
	 * Returns the value of the '<em><b>Supplier Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier Product Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Product Name</em>' attribute.
	 * @see #setSupplierProductName(String)
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProduct_SupplierProductName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getSupplierProductName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getSupplierProductName <em>Supplier Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Product Name</em>' attribute.
	 * @see #getSupplierProductName()
	 * @generated
	 */
	void setSupplierProductName(String value);

	/**
	 * Returns the value of the '<em><b>Units Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units Included</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units Included</em>' attribute.
	 * @see #setUnitsIncluded(BigDecimal)
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProduct_UnitsIncluded()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getUnitsIncluded();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getUnitsIncluded <em>Units Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units Included</em>' attribute.
	 * @see #getUnitsIncluded()
	 * @generated
	 */
	void setUnitsIncluded(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' reference.
	 * @see #setProductId(Product)
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProduct_ProductId()
	 * @model keys="productId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Product getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getProductId <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' reference.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(Product value);

	/**
	 * Returns the value of the '<em><b>Supplier Pref Order Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier Pref Order Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Pref Order Id</em>' reference.
	 * @see #setSupplierPrefOrderId(SupplierPrefOrder)
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProduct_SupplierPrefOrderId()
	 * @model keys="supplierPrefOrderId"
	 * @generated
	 */
	SupplierPrefOrder getSupplierPrefOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getSupplierPrefOrderId <em>Supplier Pref Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Pref Order Id</em>' reference.
	 * @see #getSupplierPrefOrderId()
	 * @generated
	 */
	void setSupplierPrefOrderId(SupplierPrefOrder value);

	/**
	 * Returns the value of the '<em><b>Supplier Rating Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier Rating Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Rating Type Id</em>' reference.
	 * @see #setSupplierRatingTypeId(SupplierRatingType)
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierProduct_SupplierRatingTypeId()
	 * @model keys="supplierRatingTypeId"
	 * @generated
	 */
	SupplierRatingType getSupplierRatingTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getSupplierRatingTypeId <em>Supplier Rating Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Rating Type Id</em>' reference.
	 * @see #getSupplierRatingTypeId()
	 * @generated
	 */
	void setSupplierRatingTypeId(SupplierRatingType value);

} // SupplierProduct
