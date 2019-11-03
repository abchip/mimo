/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.category;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Category Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategoryContent#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategoryContent#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategoryContent#getProdCatContentTypeId <em>Prod Cat Content Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategoryContent#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategoryContent#getPurchaseFromDate <em>Purchase From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategoryContent#getPurchaseThruDate <em>Purchase Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategoryContent#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategoryContent#getUseCountLimit <em>Use Count Limit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategoryContent#getUseDaysLimit <em>Use Days Limit</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategoryContent()
 * @model
 * @generated
 */
public interface ProductCategoryContent extends BizEntityTyped<ProductCategoryContentType> {
	/**
	 * Returns the value of the '<em><b>Content Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Id</em>' attribute.
	 * @see #setContentId(String)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategoryContent_ContentId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Content'"
	 * @generated
	 */
	String getContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategoryContent#getContentId <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Id</em>' attribute.
	 * @see #getContentId()
	 * @generated
	 */
	void setContentId(String value);

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
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategoryContent_FromDate()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategoryContent#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Purchase From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase From Date</em>' attribute.
	 * @see #setPurchaseFromDate(Date)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategoryContent_PurchaseFromDate()
	 * @model
	 * @generated
	 */
	Date getPurchaseFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategoryContent#getPurchaseFromDate <em>Purchase From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase From Date</em>' attribute.
	 * @see #getPurchaseFromDate()
	 * @generated
	 */
	void setPurchaseFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Purchase Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Thru Date</em>' attribute.
	 * @see #setPurchaseThruDate(Date)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategoryContent_PurchaseThruDate()
	 * @model
	 * @generated
	 */
	Date getPurchaseThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategoryContent#getPurchaseThruDate <em>Purchase Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Thru Date</em>' attribute.
	 * @see #getPurchaseThruDate()
	 * @generated
	 */
	void setPurchaseThruDate(Date value);

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
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategoryContent_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategoryContent#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Use Count Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Count Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Count Limit</em>' attribute.
	 * @see #setUseCountLimit(long)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategoryContent_UseCountLimit()
	 * @model
	 * @generated
	 */
	long getUseCountLimit();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategoryContent#getUseCountLimit <em>Use Count Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Count Limit</em>' attribute.
	 * @see #getUseCountLimit()
	 * @generated
	 */
	void setUseCountLimit(long value);

	/**
	 * Returns the value of the '<em><b>Use Days Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Days Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Days Limit</em>' attribute.
	 * @see #setUseDaysLimit(BigDecimal)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategoryContent_UseDaysLimit()
	 * @model
	 * @generated
	 */
	BigDecimal getUseDaysLimit();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategoryContent#getUseDaysLimit <em>Use Days Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Days Limit</em>' attribute.
	 * @see #getUseDaysLimit()
	 * @generated
	 */
	void setUseDaysLimit(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Product Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Category Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category Id</em>' attribute.
	 * @see #setProductCategoryId(String)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategoryContent_ProductCategoryId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ProductCategory'"
	 * @generated
	 */
	String getProductCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategoryContent#getProductCategoryId <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category Id</em>' attribute.
	 * @see #getProductCategoryId()
	 * @generated
	 */
	void setProductCategoryId(String value);

	/**
	 * Returns the value of the '<em><b>Prod Cat Content Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prod Cat Content Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prod Cat Content Type Id</em>' attribute.
	 * @see #setProdCatContentTypeId(String)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategoryContent_ProdCatContentTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ProductCategoryContentType'"
	 * @generated
	 */
	String getProdCatContentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategoryContent#getProdCatContentTypeId <em>Prod Cat Content Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prod Cat Content Type Id</em>' attribute.
	 * @see #getProdCatContentTypeId()
	 * @generated
	 */
	void setProdCatContentTypeId(String value);

} // ProductCategoryContent
