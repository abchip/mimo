/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.price;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Price Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceAction#getProductPriceRuleId <em>Product Price Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceAction#getProductPriceActionSeqId <em>Product Price Action Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceAction#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceAction#getProductPriceActionTypeId <em>Product Price Action Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceAction#getRateCode <em>Rate Code</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceAction()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductPriceAction extends BizEntity {
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
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceAction_Amount()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceAction#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Product Price Action Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Price Action Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Price Action Seq Id</em>' attribute.
	 * @see #setProductPriceActionSeqId(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceAction_ProductPriceActionSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductPriceActionSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceAction#getProductPriceActionSeqId <em>Product Price Action Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Price Action Seq Id</em>' attribute.
	 * @see #getProductPriceActionSeqId()
	 * @generated
	 */
	void setProductPriceActionSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Rate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Code</em>' attribute.
	 * @see #setRateCode(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceAction_RateCode()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getRateCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceAction#getRateCode <em>Rate Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Code</em>' attribute.
	 * @see #getRateCode()
	 * @generated
	 */
	void setRateCode(String value);

	/**
	 * Returns the value of the '<em><b>Product Price Action Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Price Action Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Price Action Type Id</em>' reference.
	 * @see #setProductPriceActionTypeId(ProductPriceActionType)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceAction_ProductPriceActionTypeId()
	 * @model keys="productPriceActionTypeId"
	 * @generated
	 */
	ProductPriceActionType getProductPriceActionTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceAction#getProductPriceActionTypeId <em>Product Price Action Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Price Action Type Id</em>' reference.
	 * @see #getProductPriceActionTypeId()
	 * @generated
	 */
	void setProductPriceActionTypeId(ProductPriceActionType value);

	/**
	 * Returns the value of the '<em><b>Product Price Rule Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Price Rule Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Price Rule Id</em>' reference.
	 * @see #setProductPriceRuleId(ProductPriceRule)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceAction_ProductPriceRuleId()
	 * @model keys="productPriceRuleId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductPriceRule getProductPriceRuleId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceAction#getProductPriceRuleId <em>Product Price Rule Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Price Rule Id</em>' reference.
	 * @see #getProductPriceRuleId()
	 * @generated
	 */
	void setProductPriceRuleId(ProductPriceRule value);

} // ProductPriceAction
