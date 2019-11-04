/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Price Cond</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceCondImpl#getProductPriceCondSeqId <em>Product Price Cond Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceCondImpl#getCondValue <em>Cond Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.impl.ProductPriceCondImpl#getProductPriceRuleId <em>Product Price Rule Id</em>}</li>
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
	 * The cached value of the '{@link #getProductPriceRuleId() <em>Product Price Rule Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPriceRuleId()
	 * @generated
	 * @ordered
	 */
	protected ProductPriceRule productPriceRuleId;

	/**
	 * The cached value of the '{@link #getInputParamEnumId() <em>Input Param Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputParamEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration inputParamEnumId;

	/**
	 * The cached value of the '{@link #getOperatorEnumId() <em>Operator Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration operatorEnumId;

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
	public Enumeration getInputParamEnumId() {
		if (inputParamEnumId != null && ((EObject)inputParamEnumId).eIsProxy()) {
			InternalEObject oldInputParamEnumId = (InternalEObject)inputParamEnumId;
			inputParamEnumId = (Enumeration)eResolveProxy(oldInputParamEnumId);
			if (inputParamEnumId != oldInputParamEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PricePackage.PRODUCT_PRICE_COND__INPUT_PARAM_ENUM_ID, oldInputParamEnumId, inputParamEnumId));
			}
		}
		return inputParamEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetInputParamEnumId() {
		return inputParamEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputParamEnumId(Enumeration newInputParamEnumId) {
		Enumeration oldInputParamEnumId = inputParamEnumId;
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
	public Enumeration getOperatorEnumId() {
		if (operatorEnumId != null && ((EObject)operatorEnumId).eIsProxy()) {
			InternalEObject oldOperatorEnumId = (InternalEObject)operatorEnumId;
			operatorEnumId = (Enumeration)eResolveProxy(oldOperatorEnumId);
			if (operatorEnumId != oldOperatorEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PricePackage.PRODUCT_PRICE_COND__OPERATOR_ENUM_ID, oldOperatorEnumId, operatorEnumId));
			}
		}
		return operatorEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetOperatorEnumId() {
		return operatorEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperatorEnumId(Enumeration newOperatorEnumId) {
		Enumeration oldOperatorEnumId = operatorEnumId;
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
	public ProductPriceRule getProductPriceRuleId() {
		if (productPriceRuleId != null && ((EObject)productPriceRuleId).eIsProxy()) {
			InternalEObject oldProductPriceRuleId = (InternalEObject)productPriceRuleId;
			productPriceRuleId = (ProductPriceRule)eResolveProxy(oldProductPriceRuleId);
			if (productPriceRuleId != oldProductPriceRuleId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PricePackage.PRODUCT_PRICE_COND__PRODUCT_PRICE_RULE_ID, oldProductPriceRuleId, productPriceRuleId));
			}
		}
		return productPriceRuleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductPriceRule basicGetProductPriceRuleId() {
		return productPriceRuleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPriceRuleId(ProductPriceRule newProductPriceRuleId) {
		ProductPriceRule oldProductPriceRuleId = productPriceRuleId;
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
			case PricePackage.PRODUCT_PRICE_COND__PRODUCT_PRICE_COND_SEQ_ID:
				return getProductPriceCondSeqId();
			case PricePackage.PRODUCT_PRICE_COND__COND_VALUE:
				return getCondValue();
			case PricePackage.PRODUCT_PRICE_COND__PRODUCT_PRICE_RULE_ID:
				if (resolve) return getProductPriceRuleId();
				return basicGetProductPriceRuleId();
			case PricePackage.PRODUCT_PRICE_COND__INPUT_PARAM_ENUM_ID:
				if (resolve) return getInputParamEnumId();
				return basicGetInputParamEnumId();
			case PricePackage.PRODUCT_PRICE_COND__OPERATOR_ENUM_ID:
				if (resolve) return getOperatorEnumId();
				return basicGetOperatorEnumId();
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
			case PricePackage.PRODUCT_PRICE_COND__PRODUCT_PRICE_COND_SEQ_ID:
				setProductPriceCondSeqId((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_COND__COND_VALUE:
				setCondValue((String)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_COND__PRODUCT_PRICE_RULE_ID:
				setProductPriceRuleId((ProductPriceRule)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_COND__INPUT_PARAM_ENUM_ID:
				setInputParamEnumId((Enumeration)newValue);
				return;
			case PricePackage.PRODUCT_PRICE_COND__OPERATOR_ENUM_ID:
				setOperatorEnumId((Enumeration)newValue);
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
			case PricePackage.PRODUCT_PRICE_COND__PRODUCT_PRICE_COND_SEQ_ID:
				setProductPriceCondSeqId(PRODUCT_PRICE_COND_SEQ_ID_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_COND__COND_VALUE:
				setCondValue(COND_VALUE_EDEFAULT);
				return;
			case PricePackage.PRODUCT_PRICE_COND__PRODUCT_PRICE_RULE_ID:
				setProductPriceRuleId((ProductPriceRule)null);
				return;
			case PricePackage.PRODUCT_PRICE_COND__INPUT_PARAM_ENUM_ID:
				setInputParamEnumId((Enumeration)null);
				return;
			case PricePackage.PRODUCT_PRICE_COND__OPERATOR_ENUM_ID:
				setOperatorEnumId((Enumeration)null);
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
			case PricePackage.PRODUCT_PRICE_COND__PRODUCT_PRICE_COND_SEQ_ID:
				return PRODUCT_PRICE_COND_SEQ_ID_EDEFAULT == null ? productPriceCondSeqId != null : !PRODUCT_PRICE_COND_SEQ_ID_EDEFAULT.equals(productPriceCondSeqId);
			case PricePackage.PRODUCT_PRICE_COND__COND_VALUE:
				return COND_VALUE_EDEFAULT == null ? condValue != null : !COND_VALUE_EDEFAULT.equals(condValue);
			case PricePackage.PRODUCT_PRICE_COND__PRODUCT_PRICE_RULE_ID:
				return productPriceRuleId != null;
			case PricePackage.PRODUCT_PRICE_COND__INPUT_PARAM_ENUM_ID:
				return inputParamEnumId != null;
			case PricePackage.PRODUCT_PRICE_COND__OPERATOR_ENUM_ID:
				return operatorEnumId != null;
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
		result.append(" (productPriceCondSeqId: ");
		result.append(productPriceCondSeqId);
		result.append(", condValue: ");
		result.append(condValue);
		result.append(')');
		return result.toString();
	}

} //ProductPriceCondImpl
