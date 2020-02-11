/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfig;
import org.abchip.mimo.biz.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.method.CustomMethod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Store Payment Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentMethodTypeId <em>Payment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentServiceTypeEnumId <em>Payment Service Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#isApplyToAllProducts <em>Apply To All Products</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentCustomMethodId <em>Payment Custom Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentPropertiesPath <em>Payment Properties Path</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentService <em>Payment Service</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStorePaymentSetting()
 * @model annotation="mimo-ent-frame title='Product Store Payment Settings' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductStorePaymentSetting extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Apply To All Products</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apply To All Products</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply To All Products</em>' attribute.
	 * @see #setApplyToAllProducts(boolean)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStorePaymentSetting_ApplyToAllProducts()
	 * @model required="true"
	 * @generated
	 */
	boolean isApplyToAllProducts();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#isApplyToAllProducts <em>Apply To All Products</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply To All Products</em>' attribute.
	 * @see #isApplyToAllProducts()
	 * @generated
	 */
	void setApplyToAllProducts(boolean value);

	/**
	 * Returns the value of the '<em><b>Payment Custom Method Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Custom Method Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Custom Method Id</em>' reference.
	 * @see #setPaymentCustomMethodId(CustomMethod)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStorePaymentSetting_PaymentCustomMethodId()
	 * @model keys="customMethodId"
	 * @generated
	 */
	CustomMethod getPaymentCustomMethodId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentCustomMethodId <em>Payment Custom Method Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Custom Method Id</em>' reference.
	 * @see #getPaymentCustomMethodId()
	 * @generated
	 */
	void setPaymentCustomMethodId(CustomMethod value);

	/**
	 * Returns the value of the '<em><b>Payment Gateway Config Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Gateway Config Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Gateway Config Id</em>' reference.
	 * @see #setPaymentGatewayConfigId(PaymentGatewayConfig)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStorePaymentSetting_PaymentGatewayConfigId()
	 * @model keys="paymentGatewayConfigId"
	 * @generated
	 */
	PaymentGatewayConfig getPaymentGatewayConfigId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Gateway Config Id</em>' reference.
	 * @see #getPaymentGatewayConfigId()
	 * @generated
	 */
	void setPaymentGatewayConfigId(PaymentGatewayConfig value);

	/**
	 * Returns the value of the '<em><b>Payment Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Method Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method Type Id</em>' reference.
	 * @see #setPaymentMethodTypeId(PaymentMethodType)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStorePaymentSetting_PaymentMethodTypeId()
	 * @model keys="paymentMethodTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	PaymentMethodType getPaymentMethodTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentMethodTypeId <em>Payment Method Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method Type Id</em>' reference.
	 * @see #getPaymentMethodTypeId()
	 * @generated
	 */
	void setPaymentMethodTypeId(PaymentMethodType value);

	/**
	 * Returns the value of the '<em><b>Payment Properties Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Properties Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Properties Path</em>' attribute.
	 * @see #setPaymentPropertiesPath(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStorePaymentSetting_PaymentPropertiesPath()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getPaymentPropertiesPath();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentPropertiesPath <em>Payment Properties Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Properties Path</em>' attribute.
	 * @see #getPaymentPropertiesPath()
	 * @generated
	 */
	void setPaymentPropertiesPath(String value);

	/**
	 * Returns the value of the '<em><b>Payment Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Service</em>' attribute.
	 * @see #setPaymentService(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStorePaymentSetting_PaymentService()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getPaymentService();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentService <em>Payment Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Service</em>' attribute.
	 * @see #getPaymentService()
	 * @generated
	 */
	void setPaymentService(String value);

	/**
	 * Returns the value of the '<em><b>Payment Service Type Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Service Type Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Service Type Enum Id</em>' reference.
	 * @see #setPaymentServiceTypeEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStorePaymentSetting_PaymentServiceTypeEnumId()
	 * @model keys="enumId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Enumeration getPaymentServiceTypeEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentServiceTypeEnumId <em>Payment Service Type Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Service Type Enum Id</em>' reference.
	 * @see #getPaymentServiceTypeEnumId()
	 * @generated
	 */
	void setPaymentServiceTypeEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' reference.
	 * @see #setProductStoreId(ProductStore)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStorePaymentSetting_ProductStoreId()
	 * @model keys="productStoreId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductStore getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getProductStoreId <em>Product Store Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' reference.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(ProductStore value);

} // ProductStorePaymentSetting
