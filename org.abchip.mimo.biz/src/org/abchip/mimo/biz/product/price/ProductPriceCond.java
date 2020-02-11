/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.price;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.enum_.Enumeration;

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
 * @model annotation="mimo-ent-frame title='Product Price Condition' dictionary='ProductEntityLabels'"
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
	 * @model annotation="mimo-ent-format length='255'"
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
	 * Returns the value of the '<em><b>Input Param Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Param Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Param Enum Id</em>' reference.
	 * @see #setInputParamEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceCond_InputParamEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getInputParamEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceCond#getInputParamEnumId <em>Input Param Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Param Enum Id</em>' reference.
	 * @see #getInputParamEnumId()
	 * @generated
	 */
	void setInputParamEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Operator Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Enum Id</em>' reference.
	 * @see #setOperatorEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceCond_OperatorEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getOperatorEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceCond#getOperatorEnumId <em>Operator Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator Enum Id</em>' reference.
	 * @see #getOperatorEnumId()
	 * @generated
	 */
	void setOperatorEnumId(Enumeration value);

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
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
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
	 * Returns the value of the '<em><b>Product Price Rule Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Price Rule Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Price Rule Id</em>' reference.
	 * @see #setProductPriceRuleId(ProductPriceRule)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPriceCond_ProductPriceRuleId()
	 * @model keys="productPriceRuleId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductPriceRule getProductPriceRuleId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPriceCond#getProductPriceRuleId <em>Product Price Rule Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Price Rule Id</em>' reference.
	 * @see #getProductPriceRuleId()
	 * @generated
	 */
	void setProductPriceRuleId(ProductPriceRule value);

} // ProductPriceCond
