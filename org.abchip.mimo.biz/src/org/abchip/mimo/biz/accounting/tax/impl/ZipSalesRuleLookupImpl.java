/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.tax.impl;

import java.util.Date;

import org.abchip.mimo.biz.accounting.tax.TaxPackage;
import org.abchip.mimo.biz.accounting.tax.ZipSalesRuleLookup;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zip Sales Rule Lookup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesRuleLookupImpl#getCity <em>City</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesRuleLookupImpl#getCounty <em>County</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesRuleLookupImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesRuleLookupImpl#getStateCode <em>State Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesRuleLookupImpl#getIdCode <em>Id Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesRuleLookupImpl#getShipCond <em>Ship Cond</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesRuleLookupImpl#getTaxable <em>Taxable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZipSalesRuleLookupImpl extends BizEntityImpl implements ZipSalesRuleLookup {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZipSalesRuleLookupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxPackage.Literals.ZIP_SALES_RULE_LOOKUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCity() {
		return (String)eGet(TaxPackage.Literals.ZIP_SALES_RULE_LOOKUP__CITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCity(String newCity) {
		eSet(TaxPackage.Literals.ZIP_SALES_RULE_LOOKUP__CITY, newCity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCounty() {
		return (String)eGet(TaxPackage.Literals.ZIP_SALES_RULE_LOOKUP__COUNTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCounty(String newCounty) {
		eSet(TaxPackage.Literals.ZIP_SALES_RULE_LOOKUP__COUNTY, newCounty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(TaxPackage.Literals.ZIP_SALES_RULE_LOOKUP__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(TaxPackage.Literals.ZIP_SALES_RULE_LOOKUP__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdCode() {
		return (String)eGet(TaxPackage.Literals.ZIP_SALES_RULE_LOOKUP__ID_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdCode(String newIdCode) {
		eSet(TaxPackage.Literals.ZIP_SALES_RULE_LOOKUP__ID_CODE, newIdCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipCond() {
		return (String)eGet(TaxPackage.Literals.ZIP_SALES_RULE_LOOKUP__SHIP_COND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipCond(String newShipCond) {
		eSet(TaxPackage.Literals.ZIP_SALES_RULE_LOOKUP__SHIP_COND, newShipCond);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStateCode() {
		return (String)eGet(TaxPackage.Literals.ZIP_SALES_RULE_LOOKUP__STATE_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateCode(String newStateCode) {
		eSet(TaxPackage.Literals.ZIP_SALES_RULE_LOOKUP__STATE_CODE, newStateCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxable() {
		return (String)eGet(TaxPackage.Literals.ZIP_SALES_RULE_LOOKUP__TAXABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxable(String newTaxable) {
		eSet(TaxPackage.Literals.ZIP_SALES_RULE_LOOKUP__TAXABLE, newTaxable);
	}

} //ZipSalesRuleLookupImpl
