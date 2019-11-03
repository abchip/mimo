/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.promo.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.promo.ProductPromoCond;
import org.abchip.mimo.biz.product.promo.PromoPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Promo Cond</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCondImpl#getProductPromoId <em>Product Promo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCondImpl#getProductPromoRuleId <em>Product Promo Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCondImpl#getProductPromoCondSeqId <em>Product Promo Cond Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCondImpl#getCondValue <em>Cond Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCondImpl#getCustomMethodId <em>Custom Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCondImpl#getInputParamEnumId <em>Input Param Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCondImpl#getOperatorEnumId <em>Operator Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCondImpl#getOtherValue <em>Other Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductPromoCondImpl extends BizEntityImpl implements ProductPromoCond {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getProductPromoId() <em>Product Promo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PROMO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPromoId() <em>Product Promo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoId()
	 * @generated
	 * @ordered
	 */
	protected String productPromoId = PRODUCT_PROMO_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductPromoRuleId() <em>Product Promo Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoRuleId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PROMO_RULE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPromoRuleId() <em>Product Promo Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoRuleId()
	 * @generated
	 * @ordered
	 */
	protected String productPromoRuleId = PRODUCT_PROMO_RULE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductPromoCondSeqId() <em>Product Promo Cond Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoCondSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PROMO_COND_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPromoCondSeqId() <em>Product Promo Cond Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoCondSeqId()
	 * @generated
	 * @ordered
	 */
	protected String productPromoCondSeqId = PRODUCT_PROMO_COND_SEQ_ID_EDEFAULT;

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
	 * The default value of the '{@link #getCustomMethodId() <em>Custom Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomMethodId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_METHOD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomMethodId() <em>Custom Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomMethodId()
	 * @generated
	 * @ordered
	 */
	protected String customMethodId = CUSTOM_METHOD_ID_EDEFAULT;

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
	 * The default value of the '{@link #getOtherValue() <em>Other Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherValue()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherValue() <em>Other Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherValue()
	 * @generated
	 * @ordered
	 */
	protected String otherValue = OTHER_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductPromoCondImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PromoPackage.Literals.PRODUCT_PROMO_COND;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_COND__COND_VALUE, oldCondValue, condValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomMethodId() {
		return customMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomMethodId(String newCustomMethodId) {
		String oldCustomMethodId = customMethodId;
		customMethodId = newCustomMethodId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_COND__CUSTOM_METHOD_ID, oldCustomMethodId, customMethodId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_COND__INPUT_PARAM_ENUM_ID, oldInputParamEnumId, inputParamEnumId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_COND__OPERATOR_ENUM_ID, oldOperatorEnumId, operatorEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherValue() {
		return otherValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherValue(String newOtherValue) {
		String oldOtherValue = otherValue;
		otherValue = newOtherValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_COND__OTHER_VALUE, oldOtherValue, otherValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPromoCondSeqId() {
		return productPromoCondSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoCondSeqId(String newProductPromoCondSeqId) {
		String oldProductPromoCondSeqId = productPromoCondSeqId;
		productPromoCondSeqId = newProductPromoCondSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_COND_SEQ_ID, oldProductPromoCondSeqId, productPromoCondSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPromoRuleId() {
		return productPromoRuleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoRuleId(String newProductPromoRuleId) {
		String oldProductPromoRuleId = productPromoRuleId;
		productPromoRuleId = newProductPromoRuleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_RULE_ID, oldProductPromoRuleId, productPromoRuleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPromoId() {
		return productPromoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoId(String newProductPromoId) {
		String oldProductPromoId = productPromoId;
		productPromoId = newProductPromoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_ID, oldProductPromoId, productPromoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_ID:
				return getProductPromoId();
			case PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_RULE_ID:
				return getProductPromoRuleId();
			case PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_COND_SEQ_ID:
				return getProductPromoCondSeqId();
			case PromoPackage.PRODUCT_PROMO_COND__COND_VALUE:
				return getCondValue();
			case PromoPackage.PRODUCT_PROMO_COND__CUSTOM_METHOD_ID:
				return getCustomMethodId();
			case PromoPackage.PRODUCT_PROMO_COND__INPUT_PARAM_ENUM_ID:
				return getInputParamEnumId();
			case PromoPackage.PRODUCT_PROMO_COND__OPERATOR_ENUM_ID:
				return getOperatorEnumId();
			case PromoPackage.PRODUCT_PROMO_COND__OTHER_VALUE:
				return getOtherValue();
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
			case PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_ID:
				setProductPromoId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_RULE_ID:
				setProductPromoRuleId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_COND_SEQ_ID:
				setProductPromoCondSeqId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__COND_VALUE:
				setCondValue((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__CUSTOM_METHOD_ID:
				setCustomMethodId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__INPUT_PARAM_ENUM_ID:
				setInputParamEnumId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__OPERATOR_ENUM_ID:
				setOperatorEnumId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__OTHER_VALUE:
				setOtherValue((String)newValue);
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
			case PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_ID:
				setProductPromoId(PRODUCT_PROMO_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_RULE_ID:
				setProductPromoRuleId(PRODUCT_PROMO_RULE_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_COND_SEQ_ID:
				setProductPromoCondSeqId(PRODUCT_PROMO_COND_SEQ_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__COND_VALUE:
				setCondValue(COND_VALUE_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__CUSTOM_METHOD_ID:
				setCustomMethodId(CUSTOM_METHOD_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__INPUT_PARAM_ENUM_ID:
				setInputParamEnumId(INPUT_PARAM_ENUM_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__OPERATOR_ENUM_ID:
				setOperatorEnumId(OPERATOR_ENUM_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__OTHER_VALUE:
				setOtherValue(OTHER_VALUE_EDEFAULT);
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
			case PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_ID:
				return PRODUCT_PROMO_ID_EDEFAULT == null ? productPromoId != null : !PRODUCT_PROMO_ID_EDEFAULT.equals(productPromoId);
			case PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_RULE_ID:
				return PRODUCT_PROMO_RULE_ID_EDEFAULT == null ? productPromoRuleId != null : !PRODUCT_PROMO_RULE_ID_EDEFAULT.equals(productPromoRuleId);
			case PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_COND_SEQ_ID:
				return PRODUCT_PROMO_COND_SEQ_ID_EDEFAULT == null ? productPromoCondSeqId != null : !PRODUCT_PROMO_COND_SEQ_ID_EDEFAULT.equals(productPromoCondSeqId);
			case PromoPackage.PRODUCT_PROMO_COND__COND_VALUE:
				return COND_VALUE_EDEFAULT == null ? condValue != null : !COND_VALUE_EDEFAULT.equals(condValue);
			case PromoPackage.PRODUCT_PROMO_COND__CUSTOM_METHOD_ID:
				return CUSTOM_METHOD_ID_EDEFAULT == null ? customMethodId != null : !CUSTOM_METHOD_ID_EDEFAULT.equals(customMethodId);
			case PromoPackage.PRODUCT_PROMO_COND__INPUT_PARAM_ENUM_ID:
				return INPUT_PARAM_ENUM_ID_EDEFAULT == null ? inputParamEnumId != null : !INPUT_PARAM_ENUM_ID_EDEFAULT.equals(inputParamEnumId);
			case PromoPackage.PRODUCT_PROMO_COND__OPERATOR_ENUM_ID:
				return OPERATOR_ENUM_ID_EDEFAULT == null ? operatorEnumId != null : !OPERATOR_ENUM_ID_EDEFAULT.equals(operatorEnumId);
			case PromoPackage.PRODUCT_PROMO_COND__OTHER_VALUE:
				return OTHER_VALUE_EDEFAULT == null ? otherValue != null : !OTHER_VALUE_EDEFAULT.equals(otherValue);
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
		result.append(" (productPromoId: ");
		result.append(productPromoId);
		result.append(", productPromoRuleId: ");
		result.append(productPromoRuleId);
		result.append(", productPromoCondSeqId: ");
		result.append(productPromoCondSeqId);
		result.append(", condValue: ");
		result.append(condValue);
		result.append(", customMethodId: ");
		result.append(customMethodId);
		result.append(", inputParamEnumId: ");
		result.append(inputParamEnumId);
		result.append(", operatorEnumId: ");
		result.append(operatorEnumId);
		result.append(", otherValue: ");
		result.append(otherValue);
		result.append(')');
		return result.toString();
	}

} //ProductPromoCondImpl
