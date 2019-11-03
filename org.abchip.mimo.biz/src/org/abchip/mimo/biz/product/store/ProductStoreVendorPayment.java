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
 * A representation of the model object '<em><b>Product Store Vendor Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreVendorPayment#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreVendorPayment#getVendorPartyId <em>Vendor Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreVendorPayment#getPaymentMethodTypeId <em>Payment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreVendorPayment#getCreditCardEnumId <em>Credit Card Enum Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreVendorPayment()
 * @model
 * @generated
 */
public interface ProductStoreVendorPayment extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Credit Card Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Card Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Card Enum Id</em>' attribute.
	 * @see #setCreditCardEnumId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreVendorPayment_CreditCardEnumId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Enumeration'"
	 * @generated
	 */
	String getCreditCardEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreVendorPayment#getCreditCardEnumId <em>Credit Card Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Card Enum Id</em>' attribute.
	 * @see #getCreditCardEnumId()
	 * @generated
	 */
	void setCreditCardEnumId(String value);

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
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreVendorPayment_PaymentMethodTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='PaymentMethodType'"
	 * @generated
	 */
	String getPaymentMethodTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreVendorPayment#getPaymentMethodTypeId <em>Payment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method Type Id</em>' attribute.
	 * @see #getPaymentMethodTypeId()
	 * @generated
	 */
	void setPaymentMethodTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Vendor Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Party Id</em>' attribute.
	 * @see #setVendorPartyId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreVendorPayment_VendorPartyId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getVendorPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreVendorPayment#getVendorPartyId <em>Vendor Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Party Id</em>' attribute.
	 * @see #getVendorPartyId()
	 * @generated
	 */
	void setVendorPartyId(String value);

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
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreVendorPayment_ProductStoreId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ProductStore'"
	 * @generated
	 */
	String getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreVendorPayment#getProductStoreId <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' attribute.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(String value);

} // ProductStoreVendorPayment
