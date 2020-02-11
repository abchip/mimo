/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.price.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.price.PricePackage;
import org.abchip.mimo.biz.product.price.ProductPriceAction;
import org.abchip.mimo.biz.product.price.ProductPriceActionType;
import org.abchip.mimo.biz.product.price.ProductPriceRule;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Price Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceActionImpl#getProductPriceRuleId <em>Product Price Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceActionImpl#getProductPriceActionSeqId <em>Product Price Action Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceActionImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceActionImpl#getProductPriceActionTypeId <em>Product Price Action Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceActionImpl#getRateCode <em>Rate Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductPriceActionImpl extends BizEntityImpl implements ProductPriceAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductPriceActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PricePackage.Literals.PRODUCT_PRICE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAmount() {
		return (BigDecimal)eGet(PricePackage.Literals.PRODUCT_PRICE_ACTION__AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(BigDecimal newAmount) {
		eSet(PricePackage.Literals.PRODUCT_PRICE_ACTION__AMOUNT, newAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPriceActionSeqId() {
		return (String)eGet(PricePackage.Literals.PRODUCT_PRICE_ACTION__PRODUCT_PRICE_ACTION_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPriceActionSeqId(String newProductPriceActionSeqId) {
		eSet(PricePackage.Literals.PRODUCT_PRICE_ACTION__PRODUCT_PRICE_ACTION_SEQ_ID, newProductPriceActionSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRateCode() {
		return (String)eGet(PricePackage.Literals.PRODUCT_PRICE_ACTION__RATE_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRateCode(String newRateCode) {
		eSet(PricePackage.Literals.PRODUCT_PRICE_ACTION__RATE_CODE, newRateCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPriceActionType getProductPriceActionTypeId() {
		return (ProductPriceActionType)eGet(PricePackage.Literals.PRODUCT_PRICE_ACTION__PRODUCT_PRICE_ACTION_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPriceActionTypeId(ProductPriceActionType newProductPriceActionTypeId) {
		eSet(PricePackage.Literals.PRODUCT_PRICE_ACTION__PRODUCT_PRICE_ACTION_TYPE_ID, newProductPriceActionTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPriceRule getProductPriceRuleId() {
		return (ProductPriceRule)eGet(PricePackage.Literals.PRODUCT_PRICE_ACTION__PRODUCT_PRICE_RULE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPriceRuleId(ProductPriceRule newProductPriceRuleId) {
		eSet(PricePackage.Literals.PRODUCT_PRICE_ACTION__PRODUCT_PRICE_RULE_ID, newProductPriceRuleId);
	}

} //ProductPriceActionImpl
