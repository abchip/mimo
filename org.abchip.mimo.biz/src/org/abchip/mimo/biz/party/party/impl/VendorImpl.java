/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.abchip.mimo.biz.party.party.Vendor;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vendor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.VendorImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.VendorImpl#getManifestCompanyName <em>Manifest Company Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.VendorImpl#getManifestCompanyTitle <em>Manifest Company Title</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.VendorImpl#getManifestLogoUrl <em>Manifest Logo Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.VendorImpl#getManifestPolicies <em>Manifest Policies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VendorImpl extends BizEntityImpl implements Vendor {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VendorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.VENDOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManifestCompanyName() {
		return (String)eGet(PartyPackage.Literals.VENDOR__MANIFEST_COMPANY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManifestCompanyName(String newManifestCompanyName) {
		eSet(PartyPackage.Literals.VENDOR__MANIFEST_COMPANY_NAME, newManifestCompanyName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManifestCompanyTitle() {
		return (String)eGet(PartyPackage.Literals.VENDOR__MANIFEST_COMPANY_TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManifestCompanyTitle(String newManifestCompanyTitle) {
		eSet(PartyPackage.Literals.VENDOR__MANIFEST_COMPANY_TITLE, newManifestCompanyTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManifestLogoUrl() {
		return (String)eGet(PartyPackage.Literals.VENDOR__MANIFEST_LOGO_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManifestLogoUrl(String newManifestLogoUrl) {
		eSet(PartyPackage.Literals.VENDOR__MANIFEST_LOGO_URL, newManifestLogoUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManifestPolicies() {
		return (String)eGet(PartyPackage.Literals.VENDOR__MANIFEST_POLICIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManifestPolicies(String newManifestPolicies) {
		eSet(PartyPackage.Literals.VENDOR__MANIFEST_POLICIES, newManifestPolicies);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return (String)eGet(PartyPackage.Literals.VENDOR__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		eSet(PartyPackage.Literals.VENDOR__PARTY_ID, newPartyId);
	}

} //VendorImpl
