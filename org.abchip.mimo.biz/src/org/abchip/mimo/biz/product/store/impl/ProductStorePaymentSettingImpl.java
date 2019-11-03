/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.store.ProductStorePaymentSetting;
import org.abchip.mimo.biz.product.store.StorePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The default value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_STORE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected String productStoreId = PRODUCT_STORE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentMethodTypeId() <em>Payment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_METHOD_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentMethodTypeId() <em>Payment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected String paymentMethodTypeId = PAYMENT_METHOD_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentServiceTypeEnumId() <em>Payment Service Type Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentServiceTypeEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_SERVICE_TYPE_ENUM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentServiceTypeEnumId() <em>Payment Service Type Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentServiceTypeEnumId()
	 * @generated
	 * @ordered
	 */
	protected String paymentServiceTypeEnumId = PAYMENT_SERVICE_TYPE_ENUM_ID_EDEFAULT;

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
	 * The default value of the '{@link #getPaymentCustomMethodId() <em>Payment Custom Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentCustomMethodId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_CUSTOM_METHOD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentCustomMethodId() <em>Payment Custom Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentCustomMethodId()
	 * @generated
	 * @ordered
	 */
	protected String paymentCustomMethodId = PAYMENT_CUSTOM_METHOD_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentGatewayConfigId() <em>Payment Gateway Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGatewayConfigId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_GATEWAY_CONFIG_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentGatewayConfigId() <em>Payment Gateway Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGatewayConfigId()
	 * @generated
	 * @ordered
	 */
	protected String paymentGatewayConfigId = PAYMENT_GATEWAY_CONFIG_ID_EDEFAULT;

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
	public String getPaymentCustomMethodId() {
		return paymentCustomMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentCustomMethodId(String newPaymentCustomMethodId) {
		String oldPaymentCustomMethodId = paymentCustomMethodId;
		paymentCustomMethodId = newPaymentCustomMethodId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_CUSTOM_METHOD_ID, oldPaymentCustomMethodId, paymentCustomMethodId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentGatewayConfigId() {
		return paymentGatewayConfigId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayConfigId(String newPaymentGatewayConfigId) {
		String oldPaymentGatewayConfigId = paymentGatewayConfigId;
		paymentGatewayConfigId = newPaymentGatewayConfigId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_GATEWAY_CONFIG_ID, oldPaymentGatewayConfigId, paymentGatewayConfigId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentMethodTypeId() {
		return paymentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodTypeId(String newPaymentMethodTypeId) {
		String oldPaymentMethodTypeId = paymentMethodTypeId;
		paymentMethodTypeId = newPaymentMethodTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_METHOD_TYPE_ID, oldPaymentMethodTypeId, paymentMethodTypeId));
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
		String oldPaymentPropertiesPath = paymentPropertiesPath;
		paymentPropertiesPath = newPaymentPropertiesPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_PROPERTIES_PATH, oldPaymentPropertiesPath, paymentPropertiesPath));
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
		String oldPaymentService = paymentService;
		paymentService = newPaymentService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE, oldPaymentService, paymentService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentServiceTypeEnumId() {
		return paymentServiceTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentServiceTypeEnumId(String newPaymentServiceTypeEnumId) {
		String oldPaymentServiceTypeEnumId = paymentServiceTypeEnumId;
		paymentServiceTypeEnumId = newPaymentServiceTypeEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE_TYPE_ENUM_ID, oldPaymentServiceTypeEnumId, paymentServiceTypeEnumId));
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
		boolean oldApplyToAllProducts = applyToAllProducts;
		applyToAllProducts = newApplyToAllProducts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_PAYMENT_SETTING__APPLY_TO_ALL_PRODUCTS, oldApplyToAllProducts, applyToAllProducts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductStoreId() {
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(String newProductStoreId) {
		String oldProductStoreId = productStoreId;
		productStoreId = newProductStoreId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PRODUCT_STORE_ID:
				return getProductStoreId();
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_METHOD_TYPE_ID:
				return getPaymentMethodTypeId();
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE_TYPE_ENUM_ID:
				return getPaymentServiceTypeEnumId();
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__APPLY_TO_ALL_PRODUCTS:
				return isApplyToAllProducts();
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_CUSTOM_METHOD_ID:
				return getPaymentCustomMethodId();
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_GATEWAY_CONFIG_ID:
				return getPaymentGatewayConfigId();
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_PROPERTIES_PATH:
				return getPaymentPropertiesPath();
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE:
				return getPaymentService();
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
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PRODUCT_STORE_ID:
				setProductStoreId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_METHOD_TYPE_ID:
				setPaymentMethodTypeId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE_TYPE_ENUM_ID:
				setPaymentServiceTypeEnumId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__APPLY_TO_ALL_PRODUCTS:
				setApplyToAllProducts((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_CUSTOM_METHOD_ID:
				setPaymentCustomMethodId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_GATEWAY_CONFIG_ID:
				setPaymentGatewayConfigId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_PROPERTIES_PATH:
				setPaymentPropertiesPath((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE:
				setPaymentService((String)newValue);
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
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PRODUCT_STORE_ID:
				setProductStoreId(PRODUCT_STORE_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_METHOD_TYPE_ID:
				setPaymentMethodTypeId(PAYMENT_METHOD_TYPE_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE_TYPE_ENUM_ID:
				setPaymentServiceTypeEnumId(PAYMENT_SERVICE_TYPE_ENUM_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__APPLY_TO_ALL_PRODUCTS:
				setApplyToAllProducts(APPLY_TO_ALL_PRODUCTS_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_CUSTOM_METHOD_ID:
				setPaymentCustomMethodId(PAYMENT_CUSTOM_METHOD_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_GATEWAY_CONFIG_ID:
				setPaymentGatewayConfigId(PAYMENT_GATEWAY_CONFIG_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_PROPERTIES_PATH:
				setPaymentPropertiesPath(PAYMENT_PROPERTIES_PATH_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE:
				setPaymentService(PAYMENT_SERVICE_EDEFAULT);
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
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PRODUCT_STORE_ID:
				return PRODUCT_STORE_ID_EDEFAULT == null ? productStoreId != null : !PRODUCT_STORE_ID_EDEFAULT.equals(productStoreId);
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_METHOD_TYPE_ID:
				return PAYMENT_METHOD_TYPE_ID_EDEFAULT == null ? paymentMethodTypeId != null : !PAYMENT_METHOD_TYPE_ID_EDEFAULT.equals(paymentMethodTypeId);
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE_TYPE_ENUM_ID:
				return PAYMENT_SERVICE_TYPE_ENUM_ID_EDEFAULT == null ? paymentServiceTypeEnumId != null : !PAYMENT_SERVICE_TYPE_ENUM_ID_EDEFAULT.equals(paymentServiceTypeEnumId);
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__APPLY_TO_ALL_PRODUCTS:
				return applyToAllProducts != APPLY_TO_ALL_PRODUCTS_EDEFAULT;
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_CUSTOM_METHOD_ID:
				return PAYMENT_CUSTOM_METHOD_ID_EDEFAULT == null ? paymentCustomMethodId != null : !PAYMENT_CUSTOM_METHOD_ID_EDEFAULT.equals(paymentCustomMethodId);
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_GATEWAY_CONFIG_ID:
				return PAYMENT_GATEWAY_CONFIG_ID_EDEFAULT == null ? paymentGatewayConfigId != null : !PAYMENT_GATEWAY_CONFIG_ID_EDEFAULT.equals(paymentGatewayConfigId);
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_PROPERTIES_PATH:
				return PAYMENT_PROPERTIES_PATH_EDEFAULT == null ? paymentPropertiesPath != null : !PAYMENT_PROPERTIES_PATH_EDEFAULT.equals(paymentPropertiesPath);
			case StorePackage.PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE:
				return PAYMENT_SERVICE_EDEFAULT == null ? paymentService != null : !PAYMENT_SERVICE_EDEFAULT.equals(paymentService);
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
		result.append(" (productStoreId: ");
		result.append(productStoreId);
		result.append(", paymentMethodTypeId: ");
		result.append(paymentMethodTypeId);
		result.append(", paymentServiceTypeEnumId: ");
		result.append(paymentServiceTypeEnumId);
		result.append(", applyToAllProducts: ");
		result.append(applyToAllProducts);
		result.append(", paymentCustomMethodId: ");
		result.append(paymentCustomMethodId);
		result.append(", paymentGatewayConfigId: ");
		result.append(paymentGatewayConfigId);
		result.append(", paymentPropertiesPath: ");
		result.append(paymentPropertiesPath);
		result.append(", paymentService: ");
		result.append(paymentService);
		result.append(')');
		return result.toString();
	}

} //ProductStorePaymentSettingImpl
