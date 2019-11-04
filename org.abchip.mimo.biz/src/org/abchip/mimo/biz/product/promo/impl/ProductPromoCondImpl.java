/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.promo.impl;

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.method.CustomMethod;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.promo.ProductPromo;
import org.abchip.mimo.biz.product.promo.ProductPromoCond;
import org.abchip.mimo.biz.product.promo.PromoPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Promo Cond</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCondImpl#getProductPromoRuleId <em>Product Promo Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCondImpl#getProductPromoCondSeqId <em>Product Promo Cond Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCondImpl#getCondValue <em>Cond Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCondImpl#getOtherValue <em>Other Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCondImpl#getProductPromoId <em>Product Promo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCondImpl#getCustomMethodId <em>Custom Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCondImpl#getInputParamEnumId <em>Input Param Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.impl.ProductPromoCondImpl#getOperatorEnumId <em>Operator Enum Id</em>}</li>
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
	 * The cached value of the '{@link #getProductPromoId() <em>Product Promo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoId()
	 * @generated
	 * @ordered
	 */
	protected ProductPromo productPromoId;

	/**
	 * The cached value of the '{@link #getCustomMethodId() <em>Custom Method Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomMethodId()
	 * @generated
	 * @ordered
	 */
	protected CustomMethod customMethodId;

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
	public CustomMethod getCustomMethodId() {
		if (customMethodId != null && ((EObject)customMethodId).eIsProxy()) {
			InternalEObject oldCustomMethodId = (InternalEObject)customMethodId;
			customMethodId = (CustomMethod)eResolveProxy(oldCustomMethodId);
			if (customMethodId != oldCustomMethodId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PromoPackage.PRODUCT_PROMO_COND__CUSTOM_METHOD_ID, oldCustomMethodId, customMethodId));
			}
		}
		return customMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomMethod basicGetCustomMethodId() {
		return customMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomMethodId(CustomMethod newCustomMethodId) {
		CustomMethod oldCustomMethodId = customMethodId;
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
	public Enumeration getInputParamEnumId() {
		if (inputParamEnumId != null && ((EObject)inputParamEnumId).eIsProxy()) {
			InternalEObject oldInputParamEnumId = (InternalEObject)inputParamEnumId;
			inputParamEnumId = (Enumeration)eResolveProxy(oldInputParamEnumId);
			if (inputParamEnumId != oldInputParamEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PromoPackage.PRODUCT_PROMO_COND__INPUT_PARAM_ENUM_ID, oldInputParamEnumId, inputParamEnumId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PromoPackage.PRODUCT_PROMO_COND__INPUT_PARAM_ENUM_ID, oldInputParamEnumId, inputParamEnumId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PromoPackage.PRODUCT_PROMO_COND__OPERATOR_ENUM_ID, oldOperatorEnumId, operatorEnumId));
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
	public ProductPromo getProductPromoId() {
		if (productPromoId != null && ((EObject)productPromoId).eIsProxy()) {
			InternalEObject oldProductPromoId = (InternalEObject)productPromoId;
			productPromoId = (ProductPromo)eResolveProxy(oldProductPromoId);
			if (productPromoId != oldProductPromoId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_ID, oldProductPromoId, productPromoId));
			}
		}
		return productPromoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductPromo basicGetProductPromoId() {
		return productPromoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoId(ProductPromo newProductPromoId) {
		ProductPromo oldProductPromoId = productPromoId;
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
			case PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_RULE_ID:
				return getProductPromoRuleId();
			case PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_COND_SEQ_ID:
				return getProductPromoCondSeqId();
			case PromoPackage.PRODUCT_PROMO_COND__COND_VALUE:
				return getCondValue();
			case PromoPackage.PRODUCT_PROMO_COND__OTHER_VALUE:
				return getOtherValue();
			case PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_ID:
				if (resolve) return getProductPromoId();
				return basicGetProductPromoId();
			case PromoPackage.PRODUCT_PROMO_COND__CUSTOM_METHOD_ID:
				if (resolve) return getCustomMethodId();
				return basicGetCustomMethodId();
			case PromoPackage.PRODUCT_PROMO_COND__INPUT_PARAM_ENUM_ID:
				if (resolve) return getInputParamEnumId();
				return basicGetInputParamEnumId();
			case PromoPackage.PRODUCT_PROMO_COND__OPERATOR_ENUM_ID:
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
			case PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_RULE_ID:
				setProductPromoRuleId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_COND_SEQ_ID:
				setProductPromoCondSeqId((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__COND_VALUE:
				setCondValue((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__OTHER_VALUE:
				setOtherValue((String)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_ID:
				setProductPromoId((ProductPromo)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__CUSTOM_METHOD_ID:
				setCustomMethodId((CustomMethod)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__INPUT_PARAM_ENUM_ID:
				setInputParamEnumId((Enumeration)newValue);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__OPERATOR_ENUM_ID:
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
			case PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_RULE_ID:
				setProductPromoRuleId(PRODUCT_PROMO_RULE_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_COND_SEQ_ID:
				setProductPromoCondSeqId(PRODUCT_PROMO_COND_SEQ_ID_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__COND_VALUE:
				setCondValue(COND_VALUE_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__OTHER_VALUE:
				setOtherValue(OTHER_VALUE_EDEFAULT);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_ID:
				setProductPromoId((ProductPromo)null);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__CUSTOM_METHOD_ID:
				setCustomMethodId((CustomMethod)null);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__INPUT_PARAM_ENUM_ID:
				setInputParamEnumId((Enumeration)null);
				return;
			case PromoPackage.PRODUCT_PROMO_COND__OPERATOR_ENUM_ID:
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
			case PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_RULE_ID:
				return PRODUCT_PROMO_RULE_ID_EDEFAULT == null ? productPromoRuleId != null : !PRODUCT_PROMO_RULE_ID_EDEFAULT.equals(productPromoRuleId);
			case PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_COND_SEQ_ID:
				return PRODUCT_PROMO_COND_SEQ_ID_EDEFAULT == null ? productPromoCondSeqId != null : !PRODUCT_PROMO_COND_SEQ_ID_EDEFAULT.equals(productPromoCondSeqId);
			case PromoPackage.PRODUCT_PROMO_COND__COND_VALUE:
				return COND_VALUE_EDEFAULT == null ? condValue != null : !COND_VALUE_EDEFAULT.equals(condValue);
			case PromoPackage.PRODUCT_PROMO_COND__OTHER_VALUE:
				return OTHER_VALUE_EDEFAULT == null ? otherValue != null : !OTHER_VALUE_EDEFAULT.equals(otherValue);
			case PromoPackage.PRODUCT_PROMO_COND__PRODUCT_PROMO_ID:
				return productPromoId != null;
			case PromoPackage.PRODUCT_PROMO_COND__CUSTOM_METHOD_ID:
				return customMethodId != null;
			case PromoPackage.PRODUCT_PROMO_COND__INPUT_PARAM_ENUM_ID:
				return inputParamEnumId != null;
			case PromoPackage.PRODUCT_PROMO_COND__OPERATOR_ENUM_ID:
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
		result.append(" (productPromoRuleId: ");
		result.append(productPromoRuleId);
		result.append(", productPromoCondSeqId: ");
		result.append(productPromoCondSeqId);
		result.append(", condValue: ");
		result.append(condValue);
		result.append(", otherValue: ");
		result.append(otherValue);
		result.append(')');
		return result.toString();
	}

} //ProductPromoCondImpl
