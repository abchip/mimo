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
import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tax Authority</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityImpl#isIncludeTaxInPrice <em>Include Tax In Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityImpl#isRequireTaxIdForExemption <em>Require Tax Id For Exemption</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityImpl#getTaxIdFormatPattern <em>Tax Id Format Pattern</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityImpl#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.TaxAuthorityImpl#getTaxAuthPartyId <em>Tax Auth Party Id</em>}</li>
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
	 * The cached value of the '{@link #getTaxAuthGeoId() <em>Tax Auth Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthGeoId()
	 * @generated
	 * @ordered
	 */
	protected Geo taxAuthGeoId;
	/**
	 * The cached value of the '{@link #getTaxAuthPartyId() <em>Tax Auth Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party taxAuthPartyId;

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
	public Geo getTaxAuthGeoId() {
		if (taxAuthGeoId != null && ((EObject)taxAuthGeoId).eIsProxy()) {
			InternalEObject oldTaxAuthGeoId = (InternalEObject)taxAuthGeoId;
			taxAuthGeoId = (Geo)eResolveProxy(oldTaxAuthGeoId);
			if (taxAuthGeoId != oldTaxAuthGeoId) {
			}
		}
		return taxAuthGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geo basicGetTaxAuthGeoId() {
		return taxAuthGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthGeoId(Geo newTaxAuthGeoId) {
		taxAuthGeoId = newTaxAuthGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getTaxAuthPartyId() {
		if (taxAuthPartyId != null && ((EObject)taxAuthPartyId).eIsProxy()) {
			InternalEObject oldTaxAuthPartyId = (InternalEObject)taxAuthPartyId;
			taxAuthPartyId = (Party)eResolveProxy(oldTaxAuthPartyId);
			if (taxAuthPartyId != oldTaxAuthPartyId) {
			}
		}
		return taxAuthPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetTaxAuthPartyId() {
		return taxAuthPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthPartyId(Party newTaxAuthPartyId) {
		taxAuthPartyId = newTaxAuthPartyId;
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
		includeTaxInPrice = newIncludeTaxInPrice;
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
		requireTaxIdForExemption = newRequireTaxIdForExemption;
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
		taxIdFormatPattern = newTaxIdFormatPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxPackage.TAX_AUTHORITY__INCLUDE_TAX_IN_PRICE:
				return isIncludeTaxInPrice();
			case TaxPackage.TAX_AUTHORITY__REQUIRE_TAX_ID_FOR_EXEMPTION:
				return isRequireTaxIdForExemption();
			case TaxPackage.TAX_AUTHORITY__TAX_ID_FORMAT_PATTERN:
				return getTaxIdFormatPattern();
			case TaxPackage.TAX_AUTHORITY__TAX_AUTH_GEO_ID:
				if (resolve) return getTaxAuthGeoId();
				return basicGetTaxAuthGeoId();
			case TaxPackage.TAX_AUTHORITY__TAX_AUTH_PARTY_ID:
				if (resolve) return getTaxAuthPartyId();
				return basicGetTaxAuthPartyId();
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
			case TaxPackage.TAX_AUTHORITY__INCLUDE_TAX_IN_PRICE:
				setIncludeTaxInPrice((Boolean)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY__REQUIRE_TAX_ID_FOR_EXEMPTION:
				setRequireTaxIdForExemption((Boolean)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY__TAX_ID_FORMAT_PATTERN:
				setTaxIdFormatPattern((String)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY__TAX_AUTH_GEO_ID:
				setTaxAuthGeoId((Geo)newValue);
				return;
			case TaxPackage.TAX_AUTHORITY__TAX_AUTH_PARTY_ID:
				setTaxAuthPartyId((Party)newValue);
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
			case TaxPackage.TAX_AUTHORITY__INCLUDE_TAX_IN_PRICE:
				setIncludeTaxInPrice(INCLUDE_TAX_IN_PRICE_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY__REQUIRE_TAX_ID_FOR_EXEMPTION:
				setRequireTaxIdForExemption(REQUIRE_TAX_ID_FOR_EXEMPTION_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY__TAX_ID_FORMAT_PATTERN:
				setTaxIdFormatPattern(TAX_ID_FORMAT_PATTERN_EDEFAULT);
				return;
			case TaxPackage.TAX_AUTHORITY__TAX_AUTH_GEO_ID:
				setTaxAuthGeoId((Geo)null);
				return;
			case TaxPackage.TAX_AUTHORITY__TAX_AUTH_PARTY_ID:
				setTaxAuthPartyId((Party)null);
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
			case TaxPackage.TAX_AUTHORITY__INCLUDE_TAX_IN_PRICE:
				return includeTaxInPrice != INCLUDE_TAX_IN_PRICE_EDEFAULT;
			case TaxPackage.TAX_AUTHORITY__REQUIRE_TAX_ID_FOR_EXEMPTION:
				return requireTaxIdForExemption != REQUIRE_TAX_ID_FOR_EXEMPTION_EDEFAULT;
			case TaxPackage.TAX_AUTHORITY__TAX_ID_FORMAT_PATTERN:
				return TAX_ID_FORMAT_PATTERN_EDEFAULT == null ? taxIdFormatPattern != null : !TAX_ID_FORMAT_PATTERN_EDEFAULT.equals(taxIdFormatPattern);
			case TaxPackage.TAX_AUTHORITY__TAX_AUTH_GEO_ID:
				return taxAuthGeoId != null;
			case TaxPackage.TAX_AUTHORITY__TAX_AUTH_PARTY_ID:
				return taxAuthPartyId != null;
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
		result.append(" (includeTaxInPrice: ");
		result.append(includeTaxInPrice);
		result.append(", requireTaxIdForExemption: ");
		result.append(requireTaxIdForExemption);
		result.append(", taxIdFormatPattern: ");
		result.append(taxIdFormatPattern);
		result.append(')');
		return result.toString();
	}

} //TaxAuthorityImpl
