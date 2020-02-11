/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.opportunity;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.product.category.ProductCategory;
import org.abchip.mimo.biz.product.product.Product;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sales Forecast Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getSalesForecastId <em>Sales Forecast Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getSalesForecastDetailId <em>Sales Forecast Detail Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getQuantityUomId <em>Quantity Uom Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesForecastDetail()
 * @model annotation="mimo-ent-frame title='Stores Details of Resourses of Sales Forecast for simulation of MRP'"
 * @generated
 */
public interface SalesForecastDetail extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesForecastDetail_Amount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Product Category Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Category Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category Id</em>' reference.
	 * @see #setProductCategoryId(ProductCategory)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesForecastDetail_ProductCategoryId()
	 * @model keys="productCategoryId"
	 * @generated
	 */
	ProductCategory getProductCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getProductCategoryId <em>Product Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category Id</em>' reference.
	 * @see #getProductCategoryId()
	 * @generated
	 */
	void setProductCategoryId(ProductCategory value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' reference.
	 * @see #setProductId(Product)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesForecastDetail_ProductId()
	 * @model keys="productId"
	 * @generated
	 */
	Product getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getProductId <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' reference.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(Product value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesForecastDetail_Quantity()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesForecastDetail_QuantityUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getQuantityUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getQuantityUomId <em>Quantity Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Uom Id</em>' reference.
	 * @see #getQuantityUomId()
	 * @generated
	 */
	void setQuantityUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Sales Forecast Detail Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Forecast Detail Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Forecast Detail Id</em>' attribute.
	 * @see #setSalesForecastDetailId(String)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesForecastDetail_SalesForecastDetailId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSalesForecastDetailId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getSalesForecastDetailId <em>Sales Forecast Detail Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Forecast Detail Id</em>' attribute.
	 * @see #getSalesForecastDetailId()
	 * @generated
	 */
	void setSalesForecastDetailId(String value);

	/**
	 * Returns the value of the '<em><b>Sales Forecast Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Forecast Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Forecast Id</em>' reference.
	 * @see #setSalesForecastId(SalesForecast)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesForecastDetail_SalesForecastId()
	 * @model keys="salesForecastId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	SalesForecast getSalesForecastId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getSalesForecastId <em>Sales Forecast Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Forecast Id</em>' reference.
	 * @see #getSalesForecastId()
	 * @generated
	 */
	void setSalesForecastId(SalesForecast value);

} // SalesForecastDetail
