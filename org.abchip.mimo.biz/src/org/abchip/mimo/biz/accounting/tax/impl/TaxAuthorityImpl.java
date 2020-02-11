/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
	public boolean isIncludeTaxInPrice() {
		return (Boolean)eGet(TaxPackage.Literals.TAX_AUTHORITY__INCLUDE_TAX_IN_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeTaxInPrice(boolean newIncludeTaxInPrice) {
		eSet(TaxPackage.Literals.TAX_AUTHORITY__INCLUDE_TAX_IN_PRICE, newIncludeTaxInPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequireTaxIdForExemption() {
		return (Boolean)eGet(TaxPackage.Literals.TAX_AUTHORITY__REQUIRE_TAX_ID_FOR_EXEMPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireTaxIdForExemption(boolean newRequireTaxIdForExemption) {
		eSet(TaxPackage.Literals.TAX_AUTHORITY__REQUIRE_TAX_ID_FOR_EXEMPTION, newRequireTaxIdForExemption);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getTaxAuthGeoId() {
		return (Geo)eGet(TaxPackage.Literals.TAX_AUTHORITY__TAX_AUTH_GEO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthGeoId(Geo newTaxAuthGeoId) {
		eSet(TaxPackage.Literals.TAX_AUTHORITY__TAX_AUTH_GEO_ID, newTaxAuthGeoId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getTaxAuthPartyId() {
		return (Party)eGet(TaxPackage.Literals.TAX_AUTHORITY__TAX_AUTH_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthPartyId(Party newTaxAuthPartyId) {
		eSet(TaxPackage.Literals.TAX_AUTHORITY__TAX_AUTH_PARTY_ID, newTaxAuthPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxIdFormatPattern() {
		return (String)eGet(TaxPackage.Literals.TAX_AUTHORITY__TAX_ID_FORMAT_PATTERN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxIdFormatPattern(String newTaxIdFormatPattern) {
		eSet(TaxPackage.Literals.TAX_AUTHORITY__TAX_ID_FORMAT_PATTERN, newTaxIdFormatPattern);
	}

} //TaxAuthorityImpl
