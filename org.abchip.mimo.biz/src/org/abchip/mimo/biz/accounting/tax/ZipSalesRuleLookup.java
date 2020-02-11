/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
 * A representation of the model object '<em><b>Zip Sales Rule Lookup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getCity <em>City</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getCounty <em>County</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getStateCode <em>State Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getIdCode <em>Id Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getShipCond <em>Ship Cond</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getTaxable <em>Taxable</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesRuleLookup()
 * @model annotation="mimo-ent-frame title='Zip Sales Tax Lookup'"
 * @generated
 */
public interface ZipSalesRuleLookup extends BizEntity {
	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesRuleLookup_City()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>County</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>County</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>County</em>' attribute.
	 * @see #setCounty(String)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesRuleLookup_County()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getCounty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getCounty <em>County</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>County</em>' attribute.
	 * @see #getCounty()
	 * @generated
	 */
	void setCounty(String value);

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
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesRuleLookup_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Id Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Code</em>' attribute.
	 * @see #setIdCode(String)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesRuleLookup_IdCode()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getIdCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getIdCode <em>Id Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Code</em>' attribute.
	 * @see #getIdCode()
	 * @generated
	 */
	void setIdCode(String value);

	/**
	 * Returns the value of the '<em><b>Ship Cond</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship Cond</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship Cond</em>' attribute.
	 * @see #setShipCond(String)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesRuleLookup_ShipCond()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getShipCond();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getShipCond <em>Ship Cond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship Cond</em>' attribute.
	 * @see #getShipCond()
	 * @generated
	 */
	void setShipCond(String value);

	/**
	 * Returns the value of the '<em><b>State Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Code</em>' attribute.
	 * @see #setStateCode(String)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesRuleLookup_StateCode()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getStateCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getStateCode <em>State Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Code</em>' attribute.
	 * @see #getStateCode()
	 * @generated
	 */
	void setStateCode(String value);

	/**
	 * Returns the value of the '<em><b>Taxable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taxable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taxable</em>' attribute.
	 * @see #setTaxable(String)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesRuleLookup_Taxable()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getTaxable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup#getTaxable <em>Taxable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taxable</em>' attribute.
	 * @see #getTaxable()
	 * @generated
	 */
	void setTaxable(String value);

} // ZipSalesRuleLookup
