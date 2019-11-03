/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.tax;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tax Authority Rate Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getTaxAuthorityRateSeqId <em>Tax Authority Rate Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#isIsTaxInShippingPrice <em>Is Tax In Shipping Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getMinItemPrice <em>Min Item Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getMinPurchase <em>Min Purchase</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getTaxAuthPartyId <em>Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getTaxAuthorityRateTypeId <em>Tax Authority Rate Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getTaxPercentage <em>Tax Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#isTaxPromotions <em>Tax Promotions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#isTaxShipping <em>Tax Shipping</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getTitleTransferEnumId <em>Title Transfer Enum Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getTaxAuthorityRateProduct()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface TaxAuthorityRateProduct extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Is Tax In Shipping Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Tax In Shipping Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Tax In Shipping Price</em>' attribute.
	 * @see #setIsTaxInShippingPrice(boolean)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_IsTaxInShippingPrice()
	 * @model
	 * @generated
	 */
	boolean isIsTaxInShippingPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#isIsTaxInShippingPrice <em>Is Tax In Shipping Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Tax In Shipping Price</em>' attribute.
	 * @see #isIsTaxInShippingPrice()
	 * @generated
	 */
	void setIsTaxInShippingPrice(boolean value);

	/**
	 * Returns the value of the '<em><b>Min Item Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Item Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Item Price</em>' attribute.
	 * @see #setMinItemPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_MinItemPrice()
	 * @model
	 * @generated
	 */
	BigDecimal getMinItemPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getMinItemPrice <em>Min Item Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Item Price</em>' attribute.
	 * @see #getMinItemPrice()
	 * @generated
	 */
	void setMinItemPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Min Purchase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Purchase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Purchase</em>' attribute.
	 * @see #setMinPurchase(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_MinPurchase()
	 * @model
	 * @generated
	 */
	BigDecimal getMinPurchase();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getMinPurchase <em>Min Purchase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Purchase</em>' attribute.
	 * @see #getMinPurchase()
	 * @generated
	 */
	void setMinPurchase(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Product Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Category Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category Id</em>' attribute.
	 * @see #setProductCategoryId(String)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_ProductCategoryId()
	 * @model annotation="mimo-ent-domain frame='ProductCategory'"
	 * @generated
	 */
	String getProductCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getProductCategoryId <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category Id</em>' attribute.
	 * @see #getProductCategoryId()
	 * @generated
	 */
	void setProductCategoryId(String value);

	/**
	 * Returns the value of the '<em><b>Product Store Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' attribute.
	 * @see #setProductStoreId(String)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_ProductStoreId()
	 * @model annotation="mimo-ent-domain frame='ProductStore'"
	 * @generated
	 */
	String getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getProductStoreId <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' attribute.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(String value);

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
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_TaxAuthGeoId()
	 * @model
	 * @generated
	 */
	String getTaxAuthGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_TaxAuthPartyId()
	 * @model
	 * @generated
	 */
	String getTaxAuthPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getTaxAuthPartyId <em>Tax Auth Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Auth Party Id</em>' attribute.
	 * @see #getTaxAuthPartyId()
	 * @generated
	 */
	void setTaxAuthPartyId(String value);

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
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_TaxPercentage()
	 * @model
	 * @generated
	 */
	BigDecimal getTaxPercentage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getTaxPercentage <em>Tax Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Percentage</em>' attribute.
	 * @see #getTaxPercentage()
	 * @generated
	 */
	void setTaxPercentage(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Tax Promotions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Promotions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Promotions</em>' attribute.
	 * @see #setTaxPromotions(boolean)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_TaxPromotions()
	 * @model
	 * @generated
	 */
	boolean isTaxPromotions();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#isTaxPromotions <em>Tax Promotions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Promotions</em>' attribute.
	 * @see #isTaxPromotions()
	 * @generated
	 */
	void setTaxPromotions(boolean value);

	/**
	 * Returns the value of the '<em><b>Tax Shipping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Shipping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Shipping</em>' attribute.
	 * @see #setTaxShipping(boolean)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_TaxShipping()
	 * @model
	 * @generated
	 */
	boolean isTaxShipping();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#isTaxShipping <em>Tax Shipping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Shipping</em>' attribute.
	 * @see #isTaxShipping()
	 * @generated
	 */
	void setTaxShipping(boolean value);

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
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Title Transfer Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title Transfer Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title Transfer Enum Id</em>' attribute.
	 * @see #setTitleTransferEnumId(String)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_TitleTransferEnumId()
	 * @model
	 * @generated
	 */
	String getTitleTransferEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getTitleTransferEnumId <em>Title Transfer Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title Transfer Enum Id</em>' attribute.
	 * @see #getTitleTransferEnumId()
	 * @generated
	 */
	void setTitleTransferEnumId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InvoiceItem' route='taxAuthorityRateSeqId'"
	 * @generated
	 */
	List<String> invoiceItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderAdjustment' route='taxAuthorityRateSeqId'"
	 * @generated
	 */
	List<String> orderAdjustments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ReturnAdjustment' route='taxAuthorityRateSeqId'"
	 * @generated
	 */
	List<String> returnAdjustments();

	/**
	 * Returns the value of the '<em><b>Tax Authority Rate Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Authority Rate Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Authority Rate Type Id</em>' attribute.
	 * @see #setTaxAuthorityRateTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_TaxAuthorityRateTypeId()
	 * @model annotation="mimo-ent-domain frame='TaxAuthorityRateType'"
	 * @generated
	 */
	String getTaxAuthorityRateTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getTaxAuthorityRateTypeId <em>Tax Authority Rate Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Authority Rate Type Id</em>' attribute.
	 * @see #getTaxAuthorityRateTypeId()
	 * @generated
	 */
	void setTaxAuthorityRateTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Tax Authority Rate Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Authority Rate Seq Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Authority Rate Seq Id</em>' attribute.
	 * @see #setTaxAuthorityRateSeqId(String)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getTaxAuthorityRateProduct_TaxAuthorityRateSeqId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getTaxAuthorityRateSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct#getTaxAuthorityRateSeqId <em>Tax Authority Rate Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Authority Rate Seq Id</em>' attribute.
	 * @see #getTaxAuthorityRateSeqId()
	 * @generated
	 */
	void setTaxAuthorityRateSeqId(String value);

} // TaxAuthorityRateProduct
