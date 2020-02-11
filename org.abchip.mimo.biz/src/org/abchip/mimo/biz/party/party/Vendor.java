/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vendor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.Vendor#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Vendor#getManifestCompanyName <em>Manifest Company Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Vendor#getManifestCompanyTitle <em>Manifest Company Title</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Vendor#getManifestLogoUrl <em>Manifest Logo Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Vendor#getManifestPolicies <em>Manifest Policies</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.party.PartyPackage#getVendor()
 * @model
 * @generated
 */
public interface Vendor extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Manifest Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manifest Company Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manifest Company Name</em>' attribute.
	 * @see #setManifestCompanyName(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getVendor_ManifestCompanyName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getManifestCompanyName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Vendor#getManifestCompanyName <em>Manifest Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manifest Company Name</em>' attribute.
	 * @see #getManifestCompanyName()
	 * @generated
	 */
	void setManifestCompanyName(String value);

	/**
	 * Returns the value of the '<em><b>Manifest Company Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manifest Company Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manifest Company Title</em>' attribute.
	 * @see #setManifestCompanyTitle(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getVendor_ManifestCompanyTitle()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getManifestCompanyTitle();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Vendor#getManifestCompanyTitle <em>Manifest Company Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manifest Company Title</em>' attribute.
	 * @see #getManifestCompanyTitle()
	 * @generated
	 */
	void setManifestCompanyTitle(String value);

	/**
	 * Returns the value of the '<em><b>Manifest Logo Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manifest Logo Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manifest Logo Url</em>' attribute.
	 * @see #setManifestLogoUrl(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getVendor_ManifestLogoUrl()
	 * @model annotation="mimo-ent-format type='url' length='2000'"
	 * @generated
	 */
	String getManifestLogoUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Vendor#getManifestLogoUrl <em>Manifest Logo Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manifest Logo Url</em>' attribute.
	 * @see #getManifestLogoUrl()
	 * @generated
	 */
	void setManifestLogoUrl(String value);

	/**
	 * Returns the value of the '<em><b>Manifest Policies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manifest Policies</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manifest Policies</em>' attribute.
	 * @see #setManifestPolicies(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getVendor_ManifestPolicies()
	 * @model
	 * @generated
	 */
	String getManifestPolicies();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Vendor#getManifestPolicies <em>Manifest Policies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manifest Policies</em>' attribute.
	 * @see #getManifestPolicies()
	 * @generated
	 */
	void setManifestPolicies(String value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getVendor_PartyId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Vendor#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

} // Vendor
