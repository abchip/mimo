/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.abchip.mimo.biz.party.party.Vendor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vendor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.VendorImpl#getManifestCompanyName <em>Manifest Company Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.VendorImpl#getManifestCompanyTitle <em>Manifest Company Title</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.VendorImpl#getManifestLogoUrl <em>Manifest Logo Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.VendorImpl#getManifestPolicies <em>Manifest Policies</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.VendorImpl#getPartyId <em>Party Id</em>}</li>
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
	 * The default value of the '{@link #getManifestCompanyName() <em>Manifest Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifestCompanyName()
	 * @generated
	 * @ordered
	 */
	protected static final String MANIFEST_COMPANY_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getManifestCompanyName() <em>Manifest Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifestCompanyName()
	 * @generated
	 * @ordered
	 */
	protected String manifestCompanyName = MANIFEST_COMPANY_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getManifestCompanyTitle() <em>Manifest Company Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifestCompanyTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String MANIFEST_COMPANY_TITLE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getManifestCompanyTitle() <em>Manifest Company Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifestCompanyTitle()
	 * @generated
	 * @ordered
	 */
	protected String manifestCompanyTitle = MANIFEST_COMPANY_TITLE_EDEFAULT;
	/**
	 * The default value of the '{@link #getManifestLogoUrl() <em>Manifest Logo Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifestLogoUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String MANIFEST_LOGO_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getManifestLogoUrl() <em>Manifest Logo Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifestLogoUrl()
	 * @generated
	 * @ordered
	 */
	protected String manifestLogoUrl = MANIFEST_LOGO_URL_EDEFAULT;
	/**
	 * The default value of the '{@link #getManifestPolicies() <em>Manifest Policies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifestPolicies()
	 * @generated
	 * @ordered
	 */
	protected static final String MANIFEST_POLICIES_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getManifestPolicies() <em>Manifest Policies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManifestPolicies()
	 * @generated
	 * @ordered
	 */
	protected String manifestPolicies = MANIFEST_POLICIES_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;

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
		return manifestCompanyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManifestCompanyName(String newManifestCompanyName) {
		manifestCompanyName = newManifestCompanyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManifestCompanyTitle() {
		return manifestCompanyTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManifestCompanyTitle(String newManifestCompanyTitle) {
		manifestCompanyTitle = newManifestCompanyTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManifestLogoUrl() {
		return manifestLogoUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManifestLogoUrl(String newManifestLogoUrl) {
		manifestLogoUrl = newManifestLogoUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManifestPolicies() {
		return manifestPolicies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManifestPolicies(String newManifestPolicies) {
		manifestPolicies = newManifestPolicies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		partyId = newPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartyPackage.VENDOR__MANIFEST_COMPANY_NAME:
				return getManifestCompanyName();
			case PartyPackage.VENDOR__MANIFEST_COMPANY_TITLE:
				return getManifestCompanyTitle();
			case PartyPackage.VENDOR__MANIFEST_LOGO_URL:
				return getManifestLogoUrl();
			case PartyPackage.VENDOR__MANIFEST_POLICIES:
				return getManifestPolicies();
			case PartyPackage.VENDOR__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
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
			case PartyPackage.VENDOR__MANIFEST_COMPANY_NAME:
				setManifestCompanyName((String)newValue);
				return;
			case PartyPackage.VENDOR__MANIFEST_COMPANY_TITLE:
				setManifestCompanyTitle((String)newValue);
				return;
			case PartyPackage.VENDOR__MANIFEST_LOGO_URL:
				setManifestLogoUrl((String)newValue);
				return;
			case PartyPackage.VENDOR__MANIFEST_POLICIES:
				setManifestPolicies((String)newValue);
				return;
			case PartyPackage.VENDOR__PARTY_ID:
				setPartyId((Party)newValue);
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
			case PartyPackage.VENDOR__MANIFEST_COMPANY_NAME:
				setManifestCompanyName(MANIFEST_COMPANY_NAME_EDEFAULT);
				return;
			case PartyPackage.VENDOR__MANIFEST_COMPANY_TITLE:
				setManifestCompanyTitle(MANIFEST_COMPANY_TITLE_EDEFAULT);
				return;
			case PartyPackage.VENDOR__MANIFEST_LOGO_URL:
				setManifestLogoUrl(MANIFEST_LOGO_URL_EDEFAULT);
				return;
			case PartyPackage.VENDOR__MANIFEST_POLICIES:
				setManifestPolicies(MANIFEST_POLICIES_EDEFAULT);
				return;
			case PartyPackage.VENDOR__PARTY_ID:
				setPartyId((Party)null);
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
			case PartyPackage.VENDOR__MANIFEST_COMPANY_NAME:
				return MANIFEST_COMPANY_NAME_EDEFAULT == null ? manifestCompanyName != null : !MANIFEST_COMPANY_NAME_EDEFAULT.equals(manifestCompanyName);
			case PartyPackage.VENDOR__MANIFEST_COMPANY_TITLE:
				return MANIFEST_COMPANY_TITLE_EDEFAULT == null ? manifestCompanyTitle != null : !MANIFEST_COMPANY_TITLE_EDEFAULT.equals(manifestCompanyTitle);
			case PartyPackage.VENDOR__MANIFEST_LOGO_URL:
				return MANIFEST_LOGO_URL_EDEFAULT == null ? manifestLogoUrl != null : !MANIFEST_LOGO_URL_EDEFAULT.equals(manifestLogoUrl);
			case PartyPackage.VENDOR__MANIFEST_POLICIES:
				return MANIFEST_POLICIES_EDEFAULT == null ? manifestPolicies != null : !MANIFEST_POLICIES_EDEFAULT.equals(manifestPolicies);
			case PartyPackage.VENDOR__PARTY_ID:
				return partyId != null;
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
		result.append(" (manifestCompanyName: ");
		result.append(manifestCompanyName);
		result.append(", manifestCompanyTitle: ");
		result.append(manifestCompanyTitle);
		result.append(", manifestLogoUrl: ");
		result.append(manifestLogoUrl);
		result.append(", manifestPolicies: ");
		result.append(manifestPolicies);
		result.append(')');
		return result.toString();
	}

} //VendorImpl
