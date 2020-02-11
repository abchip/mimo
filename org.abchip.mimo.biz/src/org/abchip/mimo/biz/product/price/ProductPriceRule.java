/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.price;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Price Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceRule#getProductPriceRuleId <em>Product Price Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceRule#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceRule#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceRule#isIsSale <em>Is Sale</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceRule#getProductPriceActions <em>Product Price Actions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceRule#getProductPriceConds <em>Product Price Conds</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceRule#getRuleName <em>Rule Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceRule#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceRule()
 * @model annotation="mimo-ent-frame title='Product Pice Rule' dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface ProductPriceRule extends BizEntity {
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
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceRule_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceRule#getDescription <em>Description</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceRule_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceRule#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Is Sale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Sale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Sale</em>' attribute.
	 * @see #setIsSale(boolean)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceRule_IsSale()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsSale();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceRule#isIsSale <em>Is Sale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sale</em>' attribute.
	 * @see #isIsSale()
	 * @generated
	 */
	void setIsSale(boolean value);

	/**
	 * Returns the value of the '<em><b>Product Price Actions</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.product.price.ProductPriceAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Price Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Price Actions</em>' reference list.
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceRule_ProductPriceActions()
	 * @model derived="true"
	 * @generated
	 */
	List<ProductPriceAction> getProductPriceActions();

	/**
	 * Returns the value of the '<em><b>Product Price Conds</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.product.price.ProductPriceCond}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Price Conds</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Price Conds</em>' reference list.
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceRule_ProductPriceConds()
	 * @model derived="true"
	 * @generated
	 */
	List<ProductPriceCond> getProductPriceConds();

	/**
	 * Returns the value of the '<em><b>Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Name</em>' attribute.
	 * @see #setRuleName(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceRule_RuleName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getRuleName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceRule#getRuleName <em>Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Name</em>' attribute.
	 * @see #getRuleName()
	 * @generated
	 */
	void setRuleName(String value);

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
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceRule_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceRule#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Product Price Rule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Price Rule Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Price Rule Id</em>' attribute.
	 * @see #setProductPriceRuleId(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceRule_ProductPriceRuleId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductPriceRuleId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceRule#getProductPriceRuleId <em>Product Price Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Price Rule Id</em>' attribute.
	 * @see #getProductPriceRuleId()
	 * @generated
	 */
	void setProductPriceRuleId(String value);

} // ProductPriceRule
