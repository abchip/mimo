/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.price;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Price Cond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceCond#getProductPriceRuleId <em>Product Price Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceCond#getProductPriceCondSeqId <em>Product Price Cond Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceCond#getCondValue <em>Cond Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceCond#getInputParamEnumId <em>Input Param Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPriceCond#getOperatorEnumId <em>Operator Enum Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceCond()
 * @model
 * @generated
 */
public interface ProductPriceCond extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Cond Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond Value</em>' attribute.
	 * @see #setCondValue(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceCond_CondValue()
	 * @model
	 * @generated
	 */
	String getCondValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceCond#getCondValue <em>Cond Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond Value</em>' attribute.
	 * @see #getCondValue()
	 * @generated
	 */
	void setCondValue(String value);

	/**
	 * Returns the value of the '<em><b>Input Param Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Param Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Param Enum Id</em>' attribute.
	 * @see #setInputParamEnumId(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceCond_InputParamEnumId()
	 * @model annotation="mimo-ent-domain frame='Enumeration'"
	 * @generated
	 */
	String getInputParamEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceCond#getInputParamEnumId <em>Input Param Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Param Enum Id</em>' attribute.
	 * @see #getInputParamEnumId()
	 * @generated
	 */
	void setInputParamEnumId(String value);

	/**
	 * Returns the value of the '<em><b>Operator Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Enum Id</em>' attribute.
	 * @see #setOperatorEnumId(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceCond_OperatorEnumId()
	 * @model annotation="mimo-ent-domain frame='Enumeration'"
	 * @generated
	 */
	String getOperatorEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceCond#getOperatorEnumId <em>Operator Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator Enum Id</em>' attribute.
	 * @see #getOperatorEnumId()
	 * @generated
	 */
	void setOperatorEnumId(String value);

	/**
	 * Returns the value of the '<em><b>Product Price Cond Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Price Cond Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Price Cond Seq Id</em>' attribute.
	 * @see #setProductPriceCondSeqId(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceCond_ProductPriceCondSeqId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getProductPriceCondSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceCond#getProductPriceCondSeqId <em>Product Price Cond Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Price Cond Seq Id</em>' attribute.
	 * @see #getProductPriceCondSeqId()
	 * @generated
	 */
	void setProductPriceCondSeqId(String value);

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
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceCond_ProductPriceRuleId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ProductPriceRule'"
	 * @generated
	 */
	String getProductPriceRuleId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceCond#getProductPriceRuleId <em>Product Price Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Price Rule Id</em>' attribute.
	 * @see #getProductPriceRuleId()
	 * @generated
	 */
	void setProductPriceRuleId(String value);

} // ProductPriceCond
