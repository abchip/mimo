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
import org.abchip.mimo.biz.product.store.ProductStoreVendorPayment;
import org.abchip.mimo.biz.product.store.StorePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__CREDIT_CARD_ENUM_ID, oldCreditCardEnumId, creditCardEnumId));
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
		Enumeration oldCreditCardEnumId = creditCardEnumId;
		creditCardEnumId = newCreditCardEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__CREDIT_CARD_ENUM_ID, oldCreditCardEnumId, creditCardEnumId));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__PAYMENT_METHOD_TYPE_ID, oldPaymentMethodTypeId, paymentMethodTypeId));
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
		PaymentMethodType oldPaymentMethodTypeId = paymentMethodTypeId;
		paymentMethodTypeId = newPaymentMethodTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__PAYMENT_METHOD_TYPE_ID, oldPaymentMethodTypeId, paymentMethodTypeId));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__VENDOR_PARTY_ID, oldVendorPartyId, vendorPartyId));
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
		Party oldVendorPartyId = vendorPartyId;
		vendorPartyId = newVendorPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__VENDOR_PARTY_ID, oldVendorPartyId, vendorPartyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
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
				return getProductStoreId();
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
				setProductStoreId((String)newValue);
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
				setProductStoreId(PRODUCT_STORE_ID_EDEFAULT);
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
				return PRODUCT_STORE_ID_EDEFAULT == null ? productStoreId != null : !PRODUCT_STORE_ID_EDEFAULT.equals(productStoreId);
			case StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__VENDOR_PARTY_ID:
				return vendorPartyId != null;
			case StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__PAYMENT_METHOD_TYPE_ID:
				return paymentMethodTypeId != null;
			case StorePackage.PRODUCT_STORE_VENDOR_PAYMENT__CREDIT_CARD_ENUM_ID:
				return creditCardEnumId != null;
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
		result.append(')');
		return result.toString();
	}

} //ProductStoreVendorPaymentImpl