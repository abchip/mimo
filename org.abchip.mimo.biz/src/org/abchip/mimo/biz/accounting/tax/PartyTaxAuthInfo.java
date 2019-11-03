/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.tax;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party Tax Auth Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#getTaxAuthPartyId <em>Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#isIsExempt <em>Is Exempt</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#isIsNexus <em>Is Nexus</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#getPartyTaxId <em>Party Tax Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getPartyTaxAuthInfo()
 * @model
 * @generated
 */
public interface PartyTaxAuthInfo extends BizEntity {
	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getPartyTaxAuthInfo_FromDate()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Is Exempt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Exempt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Exempt</em>' attribute.
	 * @see #setIsExempt(boolean)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getPartyTaxAuthInfo_IsExempt()
	 * @model
	 * @generated
	 */
	boolean isIsExempt();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#isIsExempt <em>Is Exempt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Exempt</em>' attribute.
	 * @see #isIsExempt()
	 * @generated
	 */
	void setIsExempt(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Nexus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Nexus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Nexus</em>' attribute.
	 * @see #setIsNexus(boolean)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getPartyTaxAuthInfo_IsNexus()
	 * @model
	 * @generated
	 */
	boolean isIsNexus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#isIsNexus <em>Is Nexus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Nexus</em>' attribute.
	 * @see #isIsNexus()
	 * @generated
	 */
	void setIsNexus(boolean value);

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
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getPartyTaxAuthInfo_PartyId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Party Tax Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Tax Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Tax Id</em>' attribute.
	 * @see #setPartyTaxId(String)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getPartyTaxAuthInfo_PartyTaxId()
	 * @model
	 * @generated
	 */
	String getPartyTaxId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#getPartyTaxId <em>Party Tax Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Tax Id</em>' attribute.
	 * @see #getPartyTaxId()
	 * @generated
	 */
	void setPartyTaxId(String value);

	/**
	 * Returns the value of the '<em><b>Tax Auth Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Auth Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Auth Geo Id</em>' attribute.
	 * @see #setTaxAuthGeoId(String)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getPartyTaxAuthInfo_TaxAuthGeoId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getTaxAuthGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Auth Geo Id</em>' attribute.
	 * @see #getTaxAuthGeoId()
	 * @generated
	 */
	void setTaxAuthGeoId(String value);

	/**
	 * Returns the value of the '<em><b>Tax Auth Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Auth Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Auth Party Id</em>' attribute.
	 * @see #setTaxAuthPartyId(String)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getPartyTaxAuthInfo_TaxAuthPartyId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getTaxAuthPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#getTaxAuthPartyId <em>Tax Auth Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Auth Party Id</em>' attribute.
	 * @see #getTaxAuthPartyId()
	 * @generated
	 */
	void setTaxAuthPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getPartyTaxAuthInfo_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.PartyTaxAuthInfo#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // PartyTaxAuthInfo
