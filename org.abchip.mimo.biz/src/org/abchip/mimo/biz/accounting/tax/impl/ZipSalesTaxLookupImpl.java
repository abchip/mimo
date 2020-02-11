/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.tax.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.accounting.tax.TaxPackage;
import org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zip Sales Tax Lookup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getCity <em>City</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getCounty <em>County</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getStateCode <em>State Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getZipCode <em>Zip Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getCityLocalSalesTax <em>City Local Sales Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getCityLocalUseTax <em>City Local Use Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getCitySalesTax <em>City Sales Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getCityUseTax <em>City Use Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getComboSalesTax <em>Combo Sales Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getComboUseTax <em>Combo Use Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getCountyDefault <em>County Default</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getCountyFips <em>County Fips</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getCountyLocalSalesTax <em>County Local Sales Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getCountyLocalUseTax <em>County Local Use Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getCountySalesTax <em>County Sales Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getCountyUseTax <em>County Use Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getGeneralDefault <em>General Default</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getGeoCode <em>Geo Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#isInsideCity <em>Inside City</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getStateSalesTax <em>State Sales Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getStateUseTax <em>State Use Tax</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZipSalesTaxLookupImpl extends BizEntityImpl implements ZipSalesTaxLookup {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZipSalesTaxLookupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCity() {
		return (String)eGet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__CITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCity(String newCity) {
		eSet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__CITY, newCity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCityLocalSalesTax() {
		return (BigDecimal)eGet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__CITY_LOCAL_SALES_TAX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCityLocalSalesTax(BigDecimal newCityLocalSalesTax) {
		eSet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__CITY_LOCAL_SALES_TAX, newCityLocalSalesTax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCityLocalUseTax() {
		return (BigDecimal)eGet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__CITY_LOCAL_USE_TAX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCityLocalUseTax(BigDecimal newCityLocalUseTax) {
		eSet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__CITY_LOCAL_USE_TAX, newCityLocalUseTax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCitySalesTax() {
		return (BigDecimal)eGet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__CITY_SALES_TAX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCitySalesTax(BigDecimal newCitySalesTax) {
		eSet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__CITY_SALES_TAX, newCitySalesTax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCityUseTax() {
		return (BigDecimal)eGet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__CITY_USE_TAX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCityUseTax(BigDecimal newCityUseTax) {
		eSet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__CITY_USE_TAX, newCityUseTax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getComboSalesTax() {
		return (BigDecimal)eGet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__COMBO_SALES_TAX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComboSalesTax(BigDecimal newComboSalesTax) {
		eSet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__COMBO_SALES_TAX, newComboSalesTax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getComboUseTax() {
		return (BigDecimal)eGet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__COMBO_USE_TAX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComboUseTax(BigDecimal newComboUseTax) {
		eSet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__COMBO_USE_TAX, newComboUseTax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountyDefault() {
		return (String)eGet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__COUNTY_DEFAULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountyDefault(String newCountyDefault) {
		eSet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__COUNTY_DEFAULT, newCountyDefault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCounty() {
		return (String)eGet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__COUNTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCounty(String newCounty) {
		eSet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__COUNTY, newCounty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountyFips() {
		return (String)eGet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__COUNTY_FIPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountyFips(String newCountyFips) {
		eSet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__COUNTY_FIPS, newCountyFips);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCountyLocalSalesTax() {
		return (BigDecimal)eGet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__COUNTY_LOCAL_SALES_TAX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountyLocalSalesTax(BigDecimal newCountyLocalSalesTax) {
		eSet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__COUNTY_LOCAL_SALES_TAX, newCountyLocalSalesTax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCountyLocalUseTax() {
		return (BigDecimal)eGet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__COUNTY_LOCAL_USE_TAX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountyLocalUseTax(BigDecimal newCountyLocalUseTax) {
		eSet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__COUNTY_LOCAL_USE_TAX, newCountyLocalUseTax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCountySalesTax() {
		return (BigDecimal)eGet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__COUNTY_SALES_TAX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountySalesTax(BigDecimal newCountySalesTax) {
		eSet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__COUNTY_SALES_TAX, newCountySalesTax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCountyUseTax() {
		return (BigDecimal)eGet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__COUNTY_USE_TAX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountyUseTax(BigDecimal newCountyUseTax) {
		eSet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__COUNTY_USE_TAX, newCountyUseTax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeneralDefault() {
		return (String)eGet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__GENERAL_DEFAULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeneralDefault(String newGeneralDefault) {
		eSet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__GENERAL_DEFAULT, newGeneralDefault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeoCode() {
		return (String)eGet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__GEO_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoCode(String newGeoCode) {
		eSet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__GEO_CODE, newGeoCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInsideCity() {
		return (Boolean)eGet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__INSIDE_CITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInsideCity(boolean newInsideCity) {
		eSet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__INSIDE_CITY, newInsideCity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStateCode() {
		return (String)eGet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__STATE_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateCode(String newStateCode) {
		eSet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__STATE_CODE, newStateCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getStateSalesTax() {
		return (BigDecimal)eGet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__STATE_SALES_TAX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateSalesTax(BigDecimal newStateSalesTax) {
		eSet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__STATE_SALES_TAX, newStateSalesTax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getStateUseTax() {
		return (BigDecimal)eGet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__STATE_USE_TAX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateUseTax(BigDecimal newStateUseTax) {
		eSet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__STATE_USE_TAX, newStateUseTax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZipCode() {
		return (String)eGet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__ZIP_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZipCode(String newZipCode) {
		eSet(TaxPackage.Literals.ZIP_SALES_TAX_LOOKUP__ZIP_CODE, newZipCode);
	}

} //ZipSalesTaxLookupImpl
