/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.party.party.Party;

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
	 * Returns the value of the '<em><b>Credit Card Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Card Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Card Enum Id</em>' reference.
	 * @see #setCreditCardEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreVendorPayment_CreditCardEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getCreditCardEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreVendorPayment#getCreditCardEnumId <em>Credit Card Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Card Enum Id</em>' reference.
	 * @see #getCreditCardEnumId()
	 * @generated
	 */
	void setCreditCardEnumId(Enumeration value);

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
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreVendorPayment_PaymentMethodTypeId()
	 * @model keys="paymentMethodTypeId"
	 * @generated
	 */
	PaymentMethodType getPaymentMethodTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreVendorPayment#getPaymentMethodTypeId <em>Payment Method Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method Type Id</em>' reference.
	 * @see #getPaymentMethodTypeId()
	 * @generated
	 */
	void setPaymentMethodTypeId(PaymentMethodType value);

	/**
	 * Returns the value of the '<em><b>Vendor Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Party Id</em>' reference.
	 * @see #setVendorPartyId(Party)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreVendorPayment_VendorPartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getVendorPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreVendorPayment#getVendorPartyId <em>Vendor Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Party Id</em>' reference.
	 * @see #getVendorPartyId()
	 * @generated
	 */
	void setVendorPartyId(Party value);

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
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
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
