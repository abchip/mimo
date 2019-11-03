/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.tax.impl;

import org.abchip.mimo.biz.accounting.tax.TaxAuthorityCategory;
import org.abchip.mimo.biz.accounting.tax.TaxPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tax Authority Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityCategoryImpl#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityCategoryImpl#getTaxAuthPartyId <em>Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityCategoryImpl#getProductCategoryId <em>Product Category Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaxAuthorityCategoryImpl extends BizEntityImpl implements TaxAuthorityCategory {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getTaxAuthGeoId() <em>Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthGeoId()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_AUTH_GEO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxAuthGeoId() <em>Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthGeoId()
	 * @generated
	 * @ordered
	 */
	protected String taxAuthGeoId = TAX_AUTH_GEO_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxAuthPartyId() <em>Tax Auth Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_AUTH_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxAuthPartyId() <em>Tax Auth Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthPartyId()
	 * @generated
	 * @ordered
	 */
	protected String taxAuthPartyId = TAX_AUTH_PARTY_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getProductCategoryId() <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_CATEGORY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProductCategoryId() <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected String productCategoryId = PRODUCT_CATEGORY_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaxAuthorityCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxPackage.Literals.TAX_AUTHORITY_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductCategoryId() {
		return productCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryId(String newProductCategoryId) {
		String oldProductCategoryId = productCategoryId;
		productCategoryId = newProductCategoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_CATEGORY__PRODUCT_CATEGORY_ID, oldProductCategoryId, productCategoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxAuthGeoId() {
		return taxAuthGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthGeoId(String newTaxAuthGeoId) {
		String oldTaxAuthGeoId = taxAuthGeoId;
		taxAuthGeoId = newTaxAuthGeoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_CATEGORY__TAX_AUTH_GEO_ID, oldTaxAuthGeoId, taxAuthGeoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxAuthPartyId() {
		return taxAuthPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthPartyId(String newTaxAuthPartyId) {
		String oldTaxAuthPartyId = taxAuthPartyId;
		taxAuthPartyId = newTaxAuthPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY_CATEGORY__TAX_AUTH_PARTY_ID, oldTaxAuthPartyId, taxAuthPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxPackage.TAX_AUTHORITY_CATEGORY__TAX_AUTH_GEO_ID:
				return getTaxAuthGeoId();
			case TaxPackage.TAX_AUTHORITY_CATEGORY__TAX_AUTH_PARTY_ID:
				return getTaxAuthPartyId();
			case TaxPackage.TAX_AUTHORITY_CATEGORY__PRODUCT_CATEGORY_ID:
				return getProductCategoryId();
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
			case TaxPackage.TAX_AUTHORITY_CATEGORY__TAX_AUTH_GEO_ID:
				setTaxAuthGeoId((String)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY_CATEGORY__TAX_AUTH_PARTY_ID:
				setTaxAuthPartyId((String)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY_CATEGORY__PRODUCT_CATEGORY_ID:
				setProductCategoryId((String)newValue);
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
			case TaxPackage.TAX_AUTHORITY_CATEGORY__TAX_AUTH_GEO_ID:
				setTaxAuthGeoId(TAX_AUTH_GEO_ID_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY_CATEGORY__TAX_AUTH_PARTY_ID:
				setTaxAuthPartyId(TAX_AUTH_PARTY_ID_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY_CATEGORY__PRODUCT_CATEGORY_ID:
				setProductCategoryId(PRODUCT_CATEGORY_ID_EDEFAULT);
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
			case TaxPackage.TAX_AUTHORITY_CATEGORY__TAX_AUTH_GEO_ID:
				return TAX_AUTH_GEO_ID_EDEFAULT == null ? taxAuthGeoId != null : !TAX_AUTH_GEO_ID_EDEFAULT.equals(taxAuthGeoId);
			case TaxPackage.TAX_AUTHORITY_CATEGORY__TAX_AUTH_PARTY_ID:
				return TAX_AUTH_PARTY_ID_EDEFAULT == null ? taxAuthPartyId != null : !TAX_AUTH_PARTY_ID_EDEFAULT.equals(taxAuthPartyId);
			case TaxPackage.TAX_AUTHORITY_CATEGORY__PRODUCT_CATEGORY_ID:
				return PRODUCT_CATEGORY_ID_EDEFAULT == null ? productCategoryId != null : !PRODUCT_CATEGORY_ID_EDEFAULT.equals(productCategoryId);
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
		result.append(" (taxAuthGeoId: ");
		result.append(taxAuthGeoId);
		result.append(", taxAuthPartyId: ");
		result.append(taxAuthPartyId);
		result.append(", productCategoryId: ");
		result.append(productCategoryId);
		result.append(')');
		return result.toString();
	}

} //TaxAuthorityCategoryImpl
