/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store.impl;

import org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfig;
import org.abchip.mimo.biz.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.method.CustomMethod;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.abchip.mimo.biz.product.store.ProductStorePaymentSetting;
import org.abchip.mimo.biz.product.store.StorePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Store Payment Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStorePaymentSettingImpl#isApplyToAllProducts <em>Apply To All Products</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStorePaymentSettingImpl#getPaymentPropertiesPath <em>Payment Properties Path</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStorePaymentSettingImpl#getPaymentService <em>Payment Service</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStorePaymentSettingImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStorePaymentSettingImpl#getPaymentMethodTypeId <em>Payment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStorePaymentSettingImpl#getPaymentServiceTypeEnumId <em>Payment Service Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStorePaymentSettingImpl#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStorePaymentSettingImpl#getPaymentCustomMethodId <em>Payment Custom Method Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductStorePaymentSettingImpl extends BizEntityImpl implements ProductStorePaymentSetting {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #isApplyToAllProducts() <em>Apply To All Products</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyToAllProducts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLY_TO_ALL_PRODUCTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplyToAllProducts() <em>Apply To All Products</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyToAllProducts()
	 * @generated
	 * @ordered
	 */
	protected boolean applyToAllProducts = APPLY_TO_ALL_PRODUCTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentPropertiesPath() <em>Payment Properties Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentPropertiesPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_PROPERTIES_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentPropertiesPath() <em>Payment Properties Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentPropertiesPath()
	 * @generated
	 * @ordered
	 */
	protected String paymentPropertiesPath = PAYMENT_PROPERTIES_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentService() <em>Payment Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentService()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentService() <em>Payment Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentService()
	 * @generated
	 * @ordered
	 */
	protected String paymentService = PAYMENT_SERVICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected ProductStore productStoreId;

	/**
	 * The cached value of the '{@link #getPaymentMethodTypeId() <em>Payment Method Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected PaymentMethodType paymentMethodTypeId;

	/**
	 * The cached value of the '{@link #getPaymentServiceTypeEnumId() <em>Payment Service Type Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentServiceTypeEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration paymentServiceTypeEnumId;

	/**
	 * The cached value of the '{@link #getPaymentGatewayConfigId() <em>Payment Gateway Config Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGatewayConfigId()
	 * @generated
	 * @ordered
	 */
	protected PaymentGatewayConfig paymentGatewayConfigId;

	/**
	 * The cached value of the '{@link #getPaymentCustomMethodId() <em>Payment Custom Method Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentCustomMethodId()
	 * @generated
	 * @ordered
	 */
	protected CustomMethod paymentCustomMethodId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductStorePaymentSettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.PRODUCT_STORE_PAYMENT_SETTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMethod getPaymentCustomMethodId() {
		if (paymentCustomMethodId != null && ((EObject)paymentCustomMethodId).eIsProxy()) {
			InternalEObject oldPaymentCustomMethodId = (InternalEObject)paymentCustomMethodId;
			paymentCustomMethodId = (CustomMethod)eResolveProxy(oldPaymentCustomMethodId);
			if (paymentCustomMethodId != oldPaymentCustomMethodId) {
			}
		}
		return paymentCustomMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomMethod basicGetPaymentCustomMethodId() {
		return paymentCustomMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentCustomMethodId(CustomMethod newPaymentCustomMethodId) {
		paymentCustomMethodId = newPaymentCustomMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGatewayConfig getPaymentGatewayConfigId() {
		if (paymentGatewayConfigId != null && ((EObject)paymentGatewayConfigId).eIsProxy()) {
			InternalEObject oldPaymentGatewayConfigId = (InternalEObject)paymentGatewayConfigId;
			paymentGatewayConfigId = (PaymentGatewayConfig)eResolveProxy(oldPaymentGatewayConfigId);
			if (paymentGatewayConfigId != oldPaymentGatewayConfigId) {
			}
		}
		return paymentGatewayConfigId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentGatewayConfig basicGetPaymentGatewayConfigId() {
		return paymentGatewayConfigId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayConfigId(PaymentGatewayConfig newPaymentGatewayConfigId) {
		paymentGatewayConfigId = newPaymentGatewayConfigId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethodType getPaymentMethodTypeId() {
		if (paymentMethodTypeId != null && ((EObject)paymentMethodTypeId).eIsProxy()) {
			InternalEObject oldPaymentMethodTypeId = (InternalEObject)paymentMethodTypeId;
			paymentMethodTypeId = (PaymentMethodType)eResolveProxy(oldPaymentMethodTypeId);
			if (paymentMethodTypeId != oldPaymentMethodTypeId) {
			}
		}
		return paymentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMethodType basicGetPaymentMethodTypeId() {
		return paymentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodTypeId(PaymentMethodType newPaymentMethodTypeId) {
		paymentMethodTypeId = newPaymentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentPropertiesPath() {
		return paymentPropertiesPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentPropertiesPath(String newPaymentPropertiesPath) {
		paymentPropertiesPath = newPaymentPropertiesPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentService() {
		return paymentService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentService(String newPaymentService) {
		paymentService = newPaymentService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getPaymentServiceTypeEnumId() {
		if (paymentServiceTypeEnumId != null && ((EObject)paymentServiceTypeEnumId).eIsProxy()) {
			InternalEObject oldPaymentServiceTypeEnumId = (InternalEObject)paymentServiceTypeEnumId;
			paymentServiceTypeEnumId = (Enumeration)eResolveProxy(oldPaymentServiceTypeEnumId);
			if (paymentServiceTypeEnumId != oldPaymentServiceTypeEnumId) {
			}
		}
		return paymentServiceTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetPaymentServiceTypeEnumId() {
		return paymentServiceTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentServiceTypeEnumId(Enumeration newPaymentServiceTypeEnumId) {
		paymentServiceTypeEnumId = newPaymentServiceTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isApplyToAllProducts() {
		return applyToAllProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplyToAllProducts(boolean newApplyToAllProducts) {
		applyToAllProducts = newApplyToAllProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore getProductStoreId() {
		if (productStoreId != null && ((EObject)productStoreId).eIsProxy()) {
			InternalEObject oldProductStoreId = (InternalEObject)productStoreId;
			productStoreId = (ProductStore)eResolveProxy(oldProductStoreId);
			if (productStoreId != oldProductStoreId) {
			}
		}
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductStore basicGetProductStoreId() {
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(ProductStore newProductStoreId) {
		productStoreId = newProductStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__APPLY_TO_ALL_PRODUCTS:
				return isApplyToAllProducts();
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_PROPERTIES_PATH:
				return getPaymentPropertiesPath();
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE:
				return getPaymentService();
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PRODUCT_STORE_ID:
				if (resolve) return getProductStoreId();
				return basicGetProductStoreId();
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_METHOD_TYPE_ID:
				if (resolve) return getPaymentMethodTypeId();
				return basicGetPaymentMethodTypeId();
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE_TYPE_ENUM_ID:
				if (resolve) return getPaymentServiceTypeEnumId();
				return basicGetPaymentServiceTypeEnumId();
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_GATEWAY_CONFIG_ID:
				if (resolve) return getPaymentGatewayConfigId();
				return basicGetPaymentGatewayConfigId();
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_CUSTOM_METHOD_ID:
				if (resolve) return getPaymentCustomMethodId();
				return basicGetPaymentCustomMethodId();
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
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__APPLY_TO_ALL_PRODUCTS:
				setApplyToAllProducts((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_PROPERTIES_PATH:
				setPaymentPropertiesPath((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE:
				setPaymentService((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)newValue);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_METHOD_TYPE_ID:
				setPaymentMethodTypeId((PaymentMethodType)newValue);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE_TYPE_ENUM_ID:
				setPaymentServiceTypeEnumId((Enumeration)newValue);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_GATEWAY_CONFIG_ID:
				setPaymentGatewayConfigId((PaymentGatewayConfig)newValue);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_CUSTOM_METHOD_ID:
				setPaymentCustomMethodId((CustomMethod)newValue);
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
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__APPLY_TO_ALL_PRODUCTS:
				setApplyToAllProducts(APPLY_TO_ALL_PRODUCTS_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_PROPERTIES_PATH:
				setPaymentPropertiesPath(PAYMENT_PROPERTIES_PATH_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE:
				setPaymentService(PAYMENT_SERVICE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)null);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_METHOD_TYPE_ID:
				setPaymentMethodTypeId((PaymentMethodType)null);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE_TYPE_ENUM_ID:
				setPaymentServiceTypeEnumId((Enumeration)null);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_GATEWAY_CONFIG_ID:
				setPaymentGatewayConfigId((PaymentGatewayConfig)null);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_CUSTOM_METHOD_ID:
				setPaymentCustomMethodId((CustomMethod)null);
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
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__APPLY_TO_ALL_PRODUCTS:
				return applyToAllProducts != APPLY_TO_ALL_PRODUCTS_EDEFAULT;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_PROPERTIES_PATH:
				return PAYMENT_PROPERTIES_PATH_EDEFAULT == null ? paymentPropertiesPath != null : !PAYMENT_PROPERTIES_PATH_EDEFAULT.equals(paymentPropertiesPath);
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE:
				return PAYMENT_SERVICE_EDEFAULT == null ? paymentService != null : !PAYMENT_SERVICE_EDEFAULT.equals(paymentService);
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PRODUCT_STORE_ID:
				return productStoreId != null;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_METHOD_TYPE_ID:
				return paymentMethodTypeId != null;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE_TYPE_ENUM_ID:
				return paymentServiceTypeEnumId != null;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_GATEWAY_CONFIG_ID:
				return paymentGatewayConfigId != null;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_CUSTOM_METHOD_ID:
				return paymentCustomMethodId != null;
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
		result.append(" (applyToAllProducts: ");
		result.append(applyToAllProducts);
		result.append(", paymentPropertiesPath: ");
		result.append(paymentPropertiesPath);
		result.append(", paymentService: ");
		result.append(paymentService);
		result.append(')');
		return result.toString();
	}

} //ProductStorePaymentSettingImpl
