/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store.impl;

import org.abchip.mimo.biz.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.abchip.mimo.biz.product.store.ProductStoreVendorPayment;
import org.abchip.mimo.biz.product.store.StorePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Store Vendor Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreVendorPaymentImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreVendorPaymentImpl#getVendorPartyId <em>Vendor Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreVendorPaymentImpl#getPaymentMethodTypeId <em>Payment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreVendorPaymentImpl#getCreditCardEnumId <em>Credit Card Enum Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductStoreVendorPaymentImpl extends BizEntityImpl implements ProductStoreVendorPayment {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The cached value of the '{@link #getVendorPartyId() <em>Vendor Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party vendorPartyId;

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
	 * The cached value of the '{@link #getCreditCardEnumId() <em>Credit Card Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditCardEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration creditCardEnumId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductStoreVendorPaymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.PRODUCT_STORE_VENDOR_PAYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getCreditCardEnumId() {
		if (creditCardEnumId != null && ((EObject)creditCardEnumId).eIsProxy()) {
			InternalEObject oldCreditCardEnumId = (InternalEObject)creditCardEnumId;
			creditCardEnumId = (Enumeration)eResolveProxy(oldCreditCardEnumId);
			if (creditCardEnumId != oldCreditCardEnumId) {
			}
		}
		return creditCardEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetCreditCardEnumId() {
		return creditCardEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreditCardEnumId(Enumeration newCreditCardEnumId) {
		creditCardEnumId = newCreditCardEnumId;
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
	public Party getVendorPartyId() {
		if (vendorPartyId != null && ((EObject)vendorPartyId).eIsProxy()) {
			InternalEObject oldVendorPartyId = (InternalEObject)vendorPartyId;
			vendorPartyId = (Party)eResolveProxy(oldVendorPartyId);
			if (vendorPartyId != oldVendorPartyId) {
			}
		}
		return vendorPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetVendorPartyId() {
		return vendorPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendorPartyId(Party newVendorPartyId) {
		vendorPartyId = newVendorPartyId;
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
			case StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__PRODUCT_STORE_ID:
				if (resolve) return getProductStoreId();
				return basicGetProductStoreId();
			case StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__VENDOR_PARTY_ID:
				if (resolve) return getVendorPartyId();
				return basicGetVendorPartyId();
			case StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__PAYMENT_METHOD_TYPE_ID:
				if (resolve) return getPaymentMethodTypeId();
				return basicGetPaymentMethodTypeId();
			case StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__CREDIT_CARD_ENUM_ID:
				if (resolve) return getCreditCardEnumId();
				return basicGetCreditCardEnumId();
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
			case StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)newValue);
				return;
			case StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__VENDOR_PARTY_ID:
				setVendorPartyId((Party)newValue);
				return;
			case StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__PAYMENT_METHOD_TYPE_ID:
				setPaymentMethodTypeId((PaymentMethodType)newValue);
				return;
			case StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__CREDIT_CARD_ENUM_ID:
				setCreditCardEnumId((Enumeration)newValue);
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
			case StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)null);
				return;
			case StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__VENDOR_PARTY_ID:
				setVendorPartyId((Party)null);
				return;
			case StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__PAYMENT_METHOD_TYPE_ID:
				setPaymentMethodTypeId((PaymentMethodType)null);
				return;
			case StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__CREDIT_CARD_ENUM_ID:
				setCreditCardEnumId((Enumeration)null);
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
			case StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__PRODUCT_STORE_ID:
				return productStoreId != null;
			case StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__VENDOR_PARTY_ID:
				return vendorPartyId != null;
			case StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__PAYMENT_METHOD_TYPE_ID:
				return paymentMethodTypeId != null;
			case StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__CREDIT_CARD_ENUM_ID:
				return creditCardEnumId != null;
		}
		return super.eIsSet(featureID);
	}

} //ProductStoreVendorPaymentImpl
