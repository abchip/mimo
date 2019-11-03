/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.price.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.price.PricePackage;
import org.abchip.mimo.biz.product.price.ProductPriceCond;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The default value of the '{@link #getProductPriceRuleId() <em>Product Price Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPriceRuleId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PRICE_RULE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPriceRuleId() <em>Product Price Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPriceRuleId()
	 * @generated
	 * @ordered
	 */
	protected String productPriceRuleId = PRODUCT_PRICE_RULE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductPriceCondSeqId() <em>Product Price Cond Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPriceCondSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PRICE_COND_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPriceCondSeqId() <em>Product Price Cond Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPriceCondSeqId()
	 * @generated
	 * @ordered
	 */
	protected String productPriceCondSeqId = PRODUCT_PRICE_COND_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCondValue() <em>Cond Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondValue()
	 * @generated
	 * @ordered
	 */
	protected static final String COND_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondValue() <em>Cond Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondValue()
	 * @generated
	 * @ordered
	 */
	protected String condValue = COND_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputParamEnumId() <em>Input Param Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputParamEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_PARAM_ENUM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputParamEnumId() <em>Input Param Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputParamEnumId()
	 * @generated
	 * @ordered
	 */
	protected String inputParamEnumId = INPUT_PARAM_ENUM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperatorEnumId() <em>Operator Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATOR_ENUM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperatorEnumId() <em>Operator Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorEnumId()
	 * @generated
	 * @ordered
	 */
	protected String operatorEnumId = OPERATOR_ENUM_ID_EDEFAULT;

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
		return condValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondValue(String newCondValue) {
		String oldCondValue = condValue;
		condValue = newCondValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_COND__COND_VALUE, oldCondValue, condValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputParamEnumId() {
		return inputParamEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputParamEnumId(String newInputParamEnumId) {
		String oldInputParamEnumId = inputParamEnumId;
		inputParamEnumId = newInputParamEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_COND__INPUT_PARAM_ENUM_ID, oldInputParamEnumId, inputParamEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOperatorEnumId() {
		return operatorEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperatorEnumId(String newOperatorEnumId) {
		String oldOperatorEnumId = operatorEnumId;
		operatorEnumId = newOperatorEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_COND__OPERATOR_ENUM_ID, oldOperatorEnumId, operatorEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPriceCondSeqId() {
		return productPriceCondSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPriceCondSeqId(String newProductPriceCondSeqId) {
		String oldProductPriceCondSeqId = productPriceCondSeqId;
		productPriceCondSeqId = newProductPriceCondSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_COND__PRODUCT_PRICE_COND_SEQ_ID, oldProductPriceCondSeqId, productPriceCondSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPriceRuleId() {
		return productPriceRuleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPriceRuleId(String newProductPriceRuleId) {
		String oldProductPriceRuleId = productPriceRuleId;
		productPriceRuleId = newProductPriceRuleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PricePackage.PRODUCT_PRICE_COND__PRODUCT_PRICE_RULE_ID, oldProductPriceRuleId, productPriceRuleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PricePackage.PRODUCT_PRICE_COND__PRODUCT_PRICE_RULE_ID:
				return getProductPriceRuleId();
			case PricePackage.PRODUCT_PRICE_COND__PRODUCT_PRICE_COND_SEQ_ID:
				return getProductPriceCondSeqId();
			case PricePackage.PRODUCT_PRICE_COND__COND_VALUE:
				return getCondValue();
			case PricePackage.PRODUCT_PRICE_COND__INPUT_PARAM_ENUM_ID:
				return getInputParamEnumId();
			case PricePackage.PRODUCT_PRICE_COND__OPERATOR_ENUM_ID:
				return getOperatorEnumId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PricePackage.PRODUCT_PRICE_COND__PRODUCT_PRICE_RULE_ID:
				setProductPriceRuleId((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_COND__PRODUCT_PRICE_COND_SEQ_ID:
				setProductPriceCondSeqId((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_COND__COND_VALUE:
				setCondValue((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_COND__INPUT_PARAM_ENUM_ID:
				setInputParamEnumId((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_COND__OPERATOR_ENUM_ID:
				setOperatorEnumId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PricePackage.PRODUCT_PRICE_COND__PRODUCT_PRICE_RULE_ID:
				setProductPriceRuleId(PRODUCT_PRICE_RULE_ID_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_COND__PRODUCT_PRICE_COND_SEQ_ID:
				setProductPriceCondSeqId(PRODUCT_PRICE_COND_SEQ_ID_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_COND__COND_VALUE:
				setCondValue(COND_VALUE_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_COND__INPUT_PARAM_ENUM_ID:
				setInputParamEnumId(INPUT_PARAM_ENUM_ID_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_COND__OPERATOR_ENUM_ID:
				setOperatorEnumId(OPERATOR_ENUM_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PricePackage.PRODUCT_PRICE_COND__PRODUCT_PRICE_RULE_ID:
				return PRODUCT_PRICE_RULE_ID_EDEFAULT == null ? productPriceRuleId != null : !PRODUCT_PRICE_RULE_ID_EDEFAULT.equals(productPriceRuleId);
			case PricePackage.PRODUCT_PRICE_COND__PRODUCT_PRICE_COND_SEQ_ID:
				return PRODUCT_PRICE_COND_SEQ_ID_EDEFAULT == null ? productPriceCondSeqId != null : !PRODUCT_PRICE_COND_SEQ_ID_EDEFAULT.equals(productPriceCondSeqId);
			case PricePackage.PRODUCT_PRICE_COND__COND_VALUE:
				return COND_VALUE_EDEFAULT == null ? condValue != null : !COND_VALUE_EDEFAULT.equals(condValue);
			case PricePackage.PRODUCT_PRICE_COND__INPUT_PARAM_ENUM_ID:
				return INPUT_PARAM_ENUM_ID_EDEFAULT == null ? inputParamEnumId != null : !INPUT_PARAM_ENUM_ID_EDEFAULT.equals(inputParamEnumId);
			case PricePackage.PRODUCT_PRICE_COND__OPERATOR_ENUM_ID:
				return OPERATOR_ENUM_ID_EDEFAULT == null ? operatorEnumId != null : !OPERATOR_ENUM_ID_EDEFAULT.equals(operatorEnumId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (productPriceRuleId: ");
		result.append(productPriceRuleId);
		result.append(", productPriceCondSeqId: ");
		result.append(productPriceCondSeqId);
		result.append(", condValue: ");
		result.append(condValue);
		result.append(", inputParamEnumId: ");
		result.append(inputParamEnumId);
		result.append(", operatorEnumId: ");
		result.append(operatorEnumId);
		result.append(')');
		return result.toString();
	}

} //ProductPriceCondImpl
