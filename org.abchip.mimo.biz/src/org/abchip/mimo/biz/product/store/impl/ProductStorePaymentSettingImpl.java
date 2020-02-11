/**
 * Copyright (c) 2017, 2020 ABChip and others.
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Store Payment Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStorePaymentSettingImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStorePaymentSettingImpl#getPaymentMethodTypeId <em>Payment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStorePaymentSettingImpl#getPaymentServiceTypeEnumId <em>Payment Service Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStorePaymentSettingImpl#isApplyToAllProducts <em>Apply To All Products</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStorePaymentSettingImpl#getPaymentCustomMethodId <em>Payment Custom Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStorePaymentSettingImpl#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStorePaymentSettingImpl#getPaymentPropertiesPath <em>Payment Properties Path</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStorePaymentSettingImpl#getPaymentService <em>Payment Service</em>}</li>
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
	public boolean isApplyToAllProducts() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE_PAYMENT_SETTING__APPLY_TO_ALL_PRODUCTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplyToAllProducts(boolean newApplyToAllProducts) {
		eSet(StorePackage.Literals.PRODUCT_STORE_PAYMENT_SETTING__APPLY_TO_ALL_PRODUCTS, newApplyToAllProducts);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMethod getPaymentCustomMethodId() {
		return (CustomMethod)eGet(StorePackage.Literals.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_CUSTOM_METHOD_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentCustomMethodId(CustomMethod newPaymentCustomMethodId) {
		eSet(StorePackage.Literals.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_CUSTOM_METHOD_ID, newPaymentCustomMethodId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGatewayConfig getPaymentGatewayConfigId() {
		return (PaymentGatewayConfig)eGet(StorePackage.Literals.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_GATEWAY_CONFIG_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayConfigId(PaymentGatewayConfig newPaymentGatewayConfigId) {
		eSet(StorePackage.Literals.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_GATEWAY_CONFIG_ID, newPaymentGatewayConfigId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethodType getPaymentMethodTypeId() {
		return (PaymentMethodType)eGet(StorePackage.Literals.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_METHOD_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodTypeId(PaymentMethodType newPaymentMethodTypeId) {
		eSet(StorePackage.Literals.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_METHOD_TYPE_ID, newPaymentMethodTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentPropertiesPath() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_PROPERTIES_PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentPropertiesPath(String newPaymentPropertiesPath) {
		eSet(StorePackage.Literals.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_PROPERTIES_PATH, newPaymentPropertiesPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentService() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentService(String newPaymentService) {
		eSet(StorePackage.Literals.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE, newPaymentService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getPaymentServiceTypeEnumId() {
		return (Enumeration)eGet(StorePackage.Literals.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE_TYPE_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentServiceTypeEnumId(Enumeration newPaymentServiceTypeEnumId) {
		eSet(StorePackage.Literals.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE_TYPE_ENUM_ID, newPaymentServiceTypeEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore getProductStoreId() {
		return (ProductStore)eGet(StorePackage.Literals.PRODUCT_STORE_PAYMENT_SETTING__PRODUCT_STORE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(ProductStore newProductStoreId) {
		eSet(StorePackage.Literals.PRODUCT_STORE_PAYMENT_SETTING__PRODUCT_STORE_ID, newProductStoreId);
	}

} //ProductStorePaymentSettingImpl
