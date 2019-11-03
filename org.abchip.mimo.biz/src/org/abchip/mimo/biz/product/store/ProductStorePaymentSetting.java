/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store;

import org.abchip.mimo.biz.BizEntity;

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
 * @model
 * @generated
 */
public interface ProductStorePaymentSetting extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Payment Custom Method Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Custom Method Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Custom Method Id</em>' attribute.
	 * @see #setPaymentCustomMethodId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStorePaymentSetting_PaymentCustomMethodId()
	 * @model annotation="mimo-ent-domain frame='CustomMethod'"
	 * @generated
	 */
	String getPaymentCustomMethodId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentCustomMethodId <em>Payment Custom Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Custom Method Id</em>' attribute.
	 * @see #getPaymentCustomMethodId()
	 * @generated
	 */
	void setPaymentCustomMethodId(String value);

	/**
	 * Returns the value of the '<em><b>Payment Gateway Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Gateway Config Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Gateway Config Id</em>' attribute.
	 * @see #setPaymentGatewayConfigId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStorePaymentSetting_PaymentGatewayConfigId()
	 * @model annotation="mimo-ent-domain frame='PaymentGatewayConfig'"
	 * @generated
	 */
	String getPaymentGatewayConfigId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Gateway Config Id</em>' attribute.
	 * @see #getPaymentGatewayConfigId()
	 * @generated
	 */
	void setPaymentGatewayConfigId(String value);

	/**
	 * Returns the value of the '<em><b>Payment Method Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Method Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method Type Id</em>' attribute.
	 * @see #setPaymentMethodTypeId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStorePaymentSetting_PaymentMethodTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='PaymentMethodType'"
	 * @generated
	 */
	String getPaymentMethodTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentMethodTypeId <em>Payment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method Type Id</em>' attribute.
	 * @see #getPaymentMethodTypeId()
	 * @generated
	 */
	void setPaymentMethodTypeId(String value);

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
	 * @model
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
	 * @model
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
	 * Returns the value of the '<em><b>Payment Service Type Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Service Type Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Service Type Enum Id</em>' attribute.
	 * @see #setPaymentServiceTypeEnumId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStorePaymentSetting_PaymentServiceTypeEnumId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Enumeration'"
	 * @generated
	 */
	String getPaymentServiceTypeEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentServiceTypeEnumId <em>Payment Service Type Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Service Type Enum Id</em>' attribute.
	 * @see #getPaymentServiceTypeEnumId()
	 * @generated
	 */
	void setPaymentServiceTypeEnumId(String value);

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
	 * @model
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
	 * Returns the value of the '<em><b>Product Store Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' attribute.
	 * @see #setProductStoreId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStorePaymentSetting_ProductStoreId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ProductStore'"
	 * @generated
	 */
	String getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getProductStoreId <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' attribute.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(String value);

} // ProductStorePaymentSetting
