/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.tax;

import java.util.Date;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tax Authority Assoc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getTaxAuthPartyId <em>Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getToTaxAuthGeoId <em>To Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getToTaxAuthPartyId <em>To Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getTaxAuthorityAssocTypeId <em>Tax Authority Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getTaxAuthorityAssoc()
 * @model
 * @generated
 */
public interface TaxAuthorityAssoc extends BizEntityTyped<TaxAuthorityAssocType> {
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
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getTaxAuthorityAssoc_FromDate()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

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
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getTaxAuthorityAssoc_TaxAuthGeoId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getTaxAuthGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getTaxAuthorityAssoc_TaxAuthPartyId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getTaxAuthPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getTaxAuthPartyId <em>Tax Auth Party Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getTaxAuthorityAssoc_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>To Tax Auth Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Tax Auth Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Tax Auth Geo Id</em>' attribute.
	 * @see #setToTaxAuthGeoId(String)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getTaxAuthorityAssoc_ToTaxAuthGeoId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getToTaxAuthGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getToTaxAuthGeoId <em>To Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Tax Auth Geo Id</em>' attribute.
	 * @see #getToTaxAuthGeoId()
	 * @generated
	 */
	void setToTaxAuthGeoId(String value);

	/**
	 * Returns the value of the '<em><b>To Tax Auth Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Tax Auth Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Tax Auth Party Id</em>' attribute.
	 * @see #setToTaxAuthPartyId(String)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getTaxAuthorityAssoc_ToTaxAuthPartyId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getToTaxAuthPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getToTaxAuthPartyId <em>To Tax Auth Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Tax Auth Party Id</em>' attribute.
	 * @see #getToTaxAuthPartyId()
	 * @generated
	 */
	void setToTaxAuthPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Tax Authority Assoc Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Authority Assoc Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Authority Assoc Type Id</em>' attribute.
	 * @see #setTaxAuthorityAssocTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getTaxAuthorityAssoc_TaxAuthorityAssocTypeId()
	 * @model annotation="mimo-ent-domain frame='TaxAuthorityAssocType'"
	 * @generated
	 */
	String getTaxAuthorityAssocTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.TaxAuthorityAssoc#getTaxAuthorityAssocTypeId <em>Tax Authority Assoc Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Authority Assoc Type Id</em>' attribute.
	 * @see #getTaxAuthorityAssocTypeId()
	 * @generated
	 */
	void setTaxAuthorityAssocTypeId(String value);

} // TaxAuthorityAssoc
