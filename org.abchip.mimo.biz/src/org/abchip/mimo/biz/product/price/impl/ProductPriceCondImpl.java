/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.price.impl;

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.price.PricePackage;
import org.abchip.mimo.biz.product.price.ProductPriceCond;
import org.abchip.mimo.biz.product.price.ProductPriceRule;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Price Cond</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceCondImpl#getProductPriceRuleId <em>Product Price Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceCondImpl#getProductPriceCondSeqId <em>Product Price Cond Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceCondImpl#getCondValue <em>Cond Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceCondImpl#getInputParamEnumId <em>Input Param Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceCondImpl#getOperatorEnumId <em>Operator Enum Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductPriceCondImpl extends BizEntityImpl implements ProductPriceCond {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductPriceCondImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PricePackage.Literals.PRODUCT_PRICE_COND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondValue() {
		return (String)eGet(PricePackage.Literals.PRODUCT_PRICE_COND__COND_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondValue(String newCondValue) {
		eSet(PricePackage.Literals.PRODUCT_PRICE_COND__COND_VALUE, newCondValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getInputParamEnumId() {
		return (Enumeration)eGet(PricePackage.Literals.PRODUCT_PRICE_COND__INPUT_PARAM_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputParamEnumId(Enumeration newInputParamEnumId) {
		eSet(PricePackage.Literals.PRODUCT_PRICE_COND__INPUT_PARAM_ENUM_ID, newInputParamEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getOperatorEnumId() {
		return (Enumeration)eGet(PricePackage.Literals.PRODUCT_PRICE_COND__OPERATOR_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperatorEnumId(Enumeration newOperatorEnumId) {
		eSet(PricePackage.Literals.PRODUCT_PRICE_COND__OPERATOR_ENUM_ID, newOperatorEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPriceCondSeqId() {
		return (String)eGet(PricePackage.Literals.PRODUCT_PRICE_COND__PRODUCT_PRICE_COND_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPriceCondSeqId(String newProductPriceCondSeqId) {
		eSet(PricePackage.Literals.PRODUCT_PRICE_COND__PRODUCT_PRICE_COND_SEQ_ID, newProductPriceCondSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPriceRule getProductPriceRuleId() {
		return (ProductPriceRule)eGet(PricePackage.Literals.PRODUCT_PRICE_COND__PRODUCT_PRICE_RULE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPriceRuleId(ProductPriceRule newProductPriceRuleId) {
		eSet(PricePackage.Literals.PRODUCT_PRICE_COND__PRODUCT_PRICE_RULE_ID, newProductPriceRuleId);
	}

} //ProductPriceCondImpl
