/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.price;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Price</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPrice#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPrice#getProductPriceTypeId <em>Product Price Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPrice#getProductPricePurposeId <em>Product Price Purpose Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPrice#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPrice#getProductStoreGroupId <em>Product Store Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPrice#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPrice#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPrice#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPrice#getCustomPriceCalcService <em>Custom Price Calc Service</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPrice#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPrice#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPrice#getPrice <em>Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPrice#getPriceWithTax <em>Price With Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPrice#getPriceWithoutTax <em>Price Without Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPrice#getTaxAmount <em>Tax Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPrice#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPrice#getTaxAuthPartyId <em>Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPrice#isTaxInPrice <em>Tax In Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPrice#getTaxPercentage <em>Tax Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPrice#getTermUomId <em>Term Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPrice#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPrice()
 * @model
 * @generated
 */
public interface ProductPrice extends BizEntityTyped<ProductPriceType> {
	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' attribute.
	 * @see #setCreatedByUserLogin(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPrice_CreatedByUserLogin()
	 * @model annotation="mimo-ent-domain frame='UserLogin'"
	 * @generated
	 */
	String getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPrice#getCreatedByUserLogin <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' attribute.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPrice_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPrice#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Currency Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #setCurrencyUomId(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPrice_CurrencyUomId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPrice#getCurrencyUomId <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(String value);

	/**
	 * Returns the value of the '<em><b>Custom Price Calc Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Price Calc Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Price Calc Service</em>' attribute.
	 * @see #setCustomPriceCalcService(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPrice_CustomPriceCalcService()
	 * @model annotation="mimo-ent-domain frame='CustomMethod'"
	 * @generated
	 */
	String getCustomPriceCalcService();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPrice#getCustomPriceCalcService <em>Custom Price Calc Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Price Calc Service</em>' attribute.
	 * @see #getCustomPriceCalcService()
	 * @generated
	 */
	void setCustomPriceCalcService(String value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPrice_FromDate()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPrice#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #setLastModifiedByUserLogin(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPrice_LastModifiedByUserLogin()
	 * @model annotation="mimo-ent-domain frame='UserLogin'"
	 * @generated
	 */
	String getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPrice#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #setLastModifiedDate(Date)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPrice_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPrice#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPrice_Price()
	 * @model
	 * @generated
	 */
	BigDecimal getPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPrice#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Price With Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price With Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price With Tax</em>' attribute.
	 * @see #setPriceWithTax(BigDecimal)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPrice_PriceWithTax()
	 * @model
	 * @generated
	 */
	BigDecimal getPriceWithTax();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPrice#getPriceWithTax <em>Price With Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price With Tax</em>' attribute.
	 * @see #getPriceWithTax()
	 * @generated
	 */
	void setPriceWithTax(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Price Without Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price Without Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Without Tax</em>' attribute.
	 * @see #setPriceWithoutTax(BigDecimal)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPrice_PriceWithoutTax()
	 * @model
	 * @generated
	 */
	BigDecimal getPriceWithoutTax();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPrice#getPriceWithoutTax <em>Price Without Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Without Tax</em>' attribute.
	 * @see #getPriceWithoutTax()
	 * @generated
	 */
	void setPriceWithoutTax(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPrice_ProductId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Product'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPrice#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

	/**
	 * Returns the value of the '<em><b>Product Store Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Group Id</em>' attribute.
	 * @see #setProductStoreGroupId(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPrice_ProductStoreGroupId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ProductStoreGroup'"
	 * @generated
	 */
	String getProductStoreGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPrice#getProductStoreGroupId <em>Product Store Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Group Id</em>' attribute.
	 * @see #getProductStoreGroupId()
	 * @generated
	 */
	void setProductStoreGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Tax Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Amount</em>' attribute.
	 * @see #setTaxAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPrice_TaxAmount()
	 * @model
	 * @generated
	 */
	BigDecimal getTaxAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPrice#getTaxAmount <em>Tax Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Amount</em>' attribute.
	 * @see #getTaxAmount()
	 * @generated
	 */
	void setTaxAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Tax Auth Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Auth Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Auth Geo Id</em>' attribute.
	 * @see #setTaxAuthGeoId(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPrice_TaxAuthGeoId()
	 * @model annotation="mimo-ent-domain frame='Geo'"
	 * @generated
	 */
	String getTaxAuthGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPrice#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Auth Geo Id</em>' attribute.
	 * @see #getTaxAuthGeoId()
	 * @generated
	 */
	void setTaxAuthGeoId(String value);

	/**
	 * Returns the value of the '<em><b>Tax Auth Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Auth Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Auth Party Id</em>' attribute.
	 * @see #setTaxAuthPartyId(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPrice_TaxAuthPartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getTaxAuthPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPrice#getTaxAuthPartyId <em>Tax Auth Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Auth Party Id</em>' attribute.
	 * @see #getTaxAuthPartyId()
	 * @generated
	 */
	void setTaxAuthPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Tax In Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax In Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax In Price</em>' attribute.
	 * @see #setTaxInPrice(boolean)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPrice_TaxInPrice()
	 * @model
	 * @generated
	 */
	boolean isTaxInPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPrice#isTaxInPrice <em>Tax In Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax In Price</em>' attribute.
	 * @see #isTaxInPrice()
	 * @generated
	 */
	void setTaxInPrice(boolean value);

	/**
	 * Returns the value of the '<em><b>Tax Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Percentage</em>' attribute.
	 * @see #setTaxPercentage(BigDecimal)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPrice_TaxPercentage()
	 * @model
	 * @generated
	 */
	BigDecimal getTaxPercentage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPrice#getTaxPercentage <em>Tax Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Percentage</em>' attribute.
	 * @see #getTaxPercentage()
	 * @generated
	 */
	void setTaxPercentage(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Term Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term Uom Id</em>' attribute.
	 * @see #setTermUomId(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPrice_TermUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getTermUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPrice#getTermUomId <em>Term Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Uom Id</em>' attribute.
	 * @see #getTermUomId()
	 * @generated
	 */
	void setTermUomId(String value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPrice_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPrice#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Product Price Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Price Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Price Type Id</em>' attribute.
	 * @see #setProductPriceTypeId(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPrice_ProductPriceTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ProductPriceType'"
	 * @generated
	 */
	String getProductPriceTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPrice#getProductPriceTypeId <em>Product Price Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Price Type Id</em>' attribute.
	 * @see #getProductPriceTypeId()
	 * @generated
	 */
	void setProductPriceTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Product Price Purpose Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Price Purpose Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Price Purpose Id</em>' attribute.
	 * @see #setProductPricePurposeId(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPrice_ProductPricePurposeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ProductPricePurpose'"
	 * @generated
	 */
	String getProductPricePurposeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPrice#getProductPricePurposeId <em>Product Price Purpose Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Price Purpose Id</em>' attribute.
	 * @see #getProductPricePurposeId()
	 * @generated
	 */
	void setProductPricePurposeId(String value);

} // ProductPrice
