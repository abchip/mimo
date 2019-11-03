/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.tax.impl;

import org.abchip.mimo.biz.accounting.tax.TaxAuthority;
import org.abchip.mimo.biz.accounting.tax.TaxPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tax Authority</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityImpl#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityImpl#getTaxAuthPartyId <em>Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityImpl#isIncludeTaxInPrice <em>Include Tax In Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityImpl#isRequireTaxIdForExemption <em>Require Tax Id For Exemption</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityImpl#getTaxIdFormatPattern <em>Tax Id Format Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaxAuthorityImpl extends BizEntityImpl implements TaxAuthority {
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
	 * The default value of the '{@link #isIncludeTaxInPrice() <em>Include Tax In Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeTaxInPrice()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_TAX_IN_PRICE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIncludeTaxInPrice() <em>Include Tax In Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeTaxInPrice()
	 * @generated
	 * @ordered
	 */
	protected boolean includeTaxInPrice = INCLUDE_TAX_IN_PRICE_EDEFAULT;
	/**
	 * The default value of the '{@link #isRequireTaxIdForExemption() <em>Require Tax Id For Exemption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireTaxIdForExemption()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRE_TAX_ID_FOR_EXEMPTION_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isRequireTaxIdForExemption() <em>Require Tax Id For Exemption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireTaxIdForExemption()
	 * @generated
	 * @ordered
	 */
	protected boolean requireTaxIdForExemption = REQUIRE_TAX_ID_FOR_EXEMPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxIdFormatPattern() <em>Tax Id Format Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxIdFormatPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_ID_FORMAT_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxIdFormatPattern() <em>Tax Id Format Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxIdFormatPattern()
	 * @generated
	 * @ordered
	 */
	protected String taxIdFormatPattern = TAX_ID_FORMAT_PATTERN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaxAuthorityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxPackage.Literals.TAX_AUTHORITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY__TAX_AUTH_GEO_ID, oldTaxAuthGeoId, taxAuthGeoId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY__TAX_AUTH_PARTY_ID, oldTaxAuthPartyId, taxAuthPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIncludeTaxInPrice() {
		return includeTaxInPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeTaxInPrice(boolean newIncludeTaxInPrice) {
		boolean oldIncludeTaxInPrice = includeTaxInPrice;
		includeTaxInPrice = newIncludeTaxInPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY__INCLUDE_TAX_IN_PRICE, oldIncludeTaxInPrice, includeTaxInPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequireTaxIdForExemption() {
		return requireTaxIdForExemption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireTaxIdForExemption(boolean newRequireTaxIdForExemption) {
		boolean oldRequireTaxIdForExemption = requireTaxIdForExemption;
		requireTaxIdForExemption = newRequireTaxIdForExemption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY__REQUIRE_TAX_ID_FOR_EXEMPTION, oldRequireTaxIdForExemption, requireTaxIdForExemption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxIdFormatPattern() {
		return taxIdFormatPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxIdFormatPattern(String newTaxIdFormatPattern) {
		String oldTaxIdFormatPattern = taxIdFormatPattern;
		taxIdFormatPattern = newTaxIdFormatPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.TAX_AUTHORITY__TAX_ID_FORMAT_PATTERN, oldTaxIdFormatPattern, taxIdFormatPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxPackage.TAX_AUTHORITY__TAX_AUTH_GEO_ID:
				return getTaxAuthGeoId();
			case TaxPackage.TAX_AUTHORITY__TAX_AUTH_PARTY_ID:
				return getTaxAuthPartyId();
			case TaxPackage.TAX_AUTHORITY__INCLUDE_TAX_IN_PRICE:
				return isIncludeTaxInPrice();
			case TaxPackage.TAX_AUTHORITY__REQUIRE_TAX_ID_FOR_EXEMPTION:
				return isRequireTaxIdForExemption();
			case TaxPackage.TAX_AUTHORITY__TAX_ID_FORMAT_PATTERN:
				return getTaxIdFormatPattern();
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
			case TaxPackage.TAX_AUTHORITY__TAX_AUTH_GEO_ID:
				setTaxAuthGeoId((String)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY__TAX_AUTH_PARTY_ID:
				setTaxAuthPartyId((String)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY__INCLUDE_TAX_IN_PRICE:
				setIncludeTaxInPrice((Boolean)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY__REQUIRE_TAX_ID_FOR_EXEMPTION:
				setRequireTaxIdForExemption((Boolean)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY__TAX_ID_FORMAT_PATTERN:
				setTaxIdFormatPattern((String)newValue);
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
			case TaxPackage.TAX_AUTHORITY__TAX_AUTH_GEO_ID:
				setTaxAuthGeoId(TAX_AUTH_GEO_ID_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY__TAX_AUTH_PARTY_ID:
				setTaxAuthPartyId(TAX_AUTH_PARTY_ID_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY__INCLUDE_TAX_IN_PRICE:
				setIncludeTaxInPrice(INCLUDE_TAX_IN_PRICE_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY__REQUIRE_TAX_ID_FOR_EXEMPTION:
				setRequireTaxIdForExemption(REQUIRE_TAX_ID_FOR_EXEMPTION_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY__TAX_ID_FORMAT_PATTERN:
				setTaxIdFormatPattern(TAX_ID_FORMAT_PATTERN_EDEFAULT);
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
			case TaxPackage.TAX_AUTHORITY__TAX_AUTH_GEO_ID:
				return TAX_AUTH_GEO_ID_EDEFAULT == null ? taxAuthGeoId != null : !TAX_AUTH_GEO_ID_EDEFAULT.equals(taxAuthGeoId);
			case TaxPackage.TAX_AUTHORITY__TAX_AUTH_PARTY_ID:
				return TAX_AUTH_PARTY_ID_EDEFAULT == null ? taxAuthPartyId != null : !TAX_AUTH_PARTY_ID_EDEFAULT.equals(taxAuthPartyId);
			case TaxPackage.TAX_AUTHORITY__INCLUDE_TAX_IN_PRICE:
				return includeTaxInPrice != INCLUDE_TAX_IN_PRICE_EDEFAULT;
			case TaxPackage.TAX_AUTHORITY__REQUIRE_TAX_ID_FOR_EXEMPTION:
				return requireTaxIdForExemption != REQUIRE_TAX_ID_FOR_EXEMPTION_EDEFAULT;
			case TaxPackage.TAX_AUTHORITY__TAX_ID_FORMAT_PATTERN:
				return TAX_ID_FORMAT_PATTERN_EDEFAULT == null ? taxIdFormatPattern != null : !TAX_ID_FORMAT_PATTERN_EDEFAULT.equals(taxIdFormatPattern);
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
		result.append(", includeTaxInPrice: ");
		result.append(includeTaxInPrice);
		result.append(", requireTaxIdForExemption: ");
		result.append(requireTaxIdForExemption);
		result.append(", taxIdFormatPattern: ");
		result.append(taxIdFormatPattern);
		result.append(')');
		return result.toString();
	}

} //TaxAuthorityImpl
