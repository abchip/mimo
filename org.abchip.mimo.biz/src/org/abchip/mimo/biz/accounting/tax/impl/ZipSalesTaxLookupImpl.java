/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zip Sales Tax Lookup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getZipCode <em>Zip Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getStateCode <em>State Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getCity <em>City</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getCounty <em>County</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getCityLocalSalesTax <em>City Local Sales Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getCityLocalUseTax <em>City Local Use Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getCitySalesTax <em>City Sales Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getCityUseTax <em>City Use Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getComboSalesTax <em>Combo Sales Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getComboUseTax <em>Combo Use Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#isCountyDefault <em>County Default</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getCountyFips <em>County Fips</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getCountyLocalSalesTax <em>County Local Sales Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getCountyLocalUseTax <em>County Local Use Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getCountySalesTax <em>County Sales Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#getCountyUseTax <em>County Use Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesTaxLookupImpl#isGeneralDefault <em>General Default</em>}</li>
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
	 * The default value of the '{@link #getZipCode() <em>Zip Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ZIP_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZipCode() <em>Zip Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipCode()
	 * @generated
	 * @ordered
	 */
	protected String zipCode = ZIP_CODE_EDEFAULT;
	/**
	 * The default value of the '{@link #getStateCode() <em>State Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateCode()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_CODE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStateCode() <em>State Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateCode()
	 * @generated
	 * @ordered
	 */
	protected String stateCode = STATE_CODE_EDEFAULT;
	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;
	/**
	 * The default value of the '{@link #getCounty() <em>County</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounty()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCounty() <em>County</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounty()
	 * @generated
	 * @ordered
	 */
	protected String county = COUNTY_EDEFAULT;
	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getCityLocalSalesTax() <em>City Local Sales Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCityLocalSalesTax()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CITY_LOCAL_SALES_TAX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCityLocalSalesTax() <em>City Local Sales Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCityLocalSalesTax()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal cityLocalSalesTax = CITY_LOCAL_SALES_TAX_EDEFAULT;
	/**
	 * The default value of the '{@link #getCityLocalUseTax() <em>City Local Use Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCityLocalUseTax()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CITY_LOCAL_USE_TAX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCityLocalUseTax() <em>City Local Use Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCityLocalUseTax()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal cityLocalUseTax = CITY_LOCAL_USE_TAX_EDEFAULT;
	/**
	 * The default value of the '{@link #getCitySalesTax() <em>City Sales Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitySalesTax()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CITY_SALES_TAX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCitySalesTax() <em>City Sales Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitySalesTax()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal citySalesTax = CITY_SALES_TAX_EDEFAULT;
	/**
	 * The default value of the '{@link #getCityUseTax() <em>City Use Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCityUseTax()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CITY_USE_TAX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCityUseTax() <em>City Use Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCityUseTax()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal cityUseTax = CITY_USE_TAX_EDEFAULT;
	/**
	 * The default value of the '{@link #getComboSalesTax() <em>Combo Sales Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComboSalesTax()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal COMBO_SALES_TAX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getComboSalesTax() <em>Combo Sales Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComboSalesTax()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal comboSalesTax = COMBO_SALES_TAX_EDEFAULT;
	/**
	 * The default value of the '{@link #getComboUseTax() <em>Combo Use Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComboUseTax()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal COMBO_USE_TAX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getComboUseTax() <em>Combo Use Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComboUseTax()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal comboUseTax = COMBO_USE_TAX_EDEFAULT;
	/**
	 * The default value of the '{@link #isCountyDefault() <em>County Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCountyDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COUNTY_DEFAULT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isCountyDefault() <em>County Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCountyDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean countyDefault = COUNTY_DEFAULT_EDEFAULT;
	/**
	 * The default value of the '{@link #getCountyFips() <em>County Fips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountyFips()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTY_FIPS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCountyFips() <em>County Fips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountyFips()
	 * @generated
	 * @ordered
	 */
	protected String countyFips = COUNTY_FIPS_EDEFAULT;
	/**
	 * The default value of the '{@link #getCountyLocalSalesTax() <em>County Local Sales Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountyLocalSalesTax()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal COUNTY_LOCAL_SALES_TAX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCountyLocalSalesTax() <em>County Local Sales Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountyLocalSalesTax()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal countyLocalSalesTax = COUNTY_LOCAL_SALES_TAX_EDEFAULT;
	/**
	 * The default value of the '{@link #getCountyLocalUseTax() <em>County Local Use Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountyLocalUseTax()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal COUNTY_LOCAL_USE_TAX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCountyLocalUseTax() <em>County Local Use Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountyLocalUseTax()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal countyLocalUseTax = COUNTY_LOCAL_USE_TAX_EDEFAULT;
	/**
	 * The default value of the '{@link #getCountySalesTax() <em>County Sales Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountySalesTax()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal COUNTY_SALES_TAX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCountySalesTax() <em>County Sales Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountySalesTax()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal countySalesTax = COUNTY_SALES_TAX_EDEFAULT;
	/**
	 * The default value of the '{@link #getCountyUseTax() <em>County Use Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountyUseTax()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal COUNTY_USE_TAX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCountyUseTax() <em>County Use Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountyUseTax()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal countyUseTax = COUNTY_USE_TAX_EDEFAULT;
	/**
	 * The default value of the '{@link #isGeneralDefault() <em>General Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeneralDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERAL_DEFAULT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isGeneralDefault() <em>General Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeneralDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean generalDefault = GENERAL_DEFAULT_EDEFAULT;
	/**
	 * The default value of the '{@link #getGeoCode() <em>Geo Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoCode()
	 * @generated
	 * @ordered
	 */
	protected static final String GEO_CODE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGeoCode() <em>Geo Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoCode()
	 * @generated
	 * @ordered
	 */
	protected String geoCode = GEO_CODE_EDEFAULT;
	/**
	 * The default value of the '{@link #isInsideCity() <em>Inside City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsideCity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSIDE_CITY_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isInsideCity() <em>Inside City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsideCity()
	 * @generated
	 * @ordered
	 */
	protected boolean insideCity = INSIDE_CITY_EDEFAULT;
	/**
	 * The default value of the '{@link #getStateSalesTax() <em>State Sales Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateSalesTax()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal STATE_SALES_TAX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStateSalesTax() <em>State Sales Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateSalesTax()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal stateSalesTax = STATE_SALES_TAX_EDEFAULT;
	/**
	 * The default value of the '{@link #getStateUseTax() <em>State Use Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateUseTax()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal STATE_USE_TAX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStateUseTax() <em>State Use Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateUseTax()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal stateUseTax = STATE_USE_TAX_EDEFAULT;

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
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.ZIP_SALES_TAX_LOOKUP__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCityLocalSalesTax() {
		return cityLocalSalesTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCityLocalSalesTax(BigDecimal newCityLocalSalesTax) {
		BigDecimal oldCityLocalSalesTax = cityLocalSalesTax;
		cityLocalSalesTax = newCityLocalSalesTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.ZIP_SALES_TAX_LOOKUP__CITY_LOCAL_SALES_TAX, oldCityLocalSalesTax, cityLocalSalesTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCityLocalUseTax() {
		return cityLocalUseTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCityLocalUseTax(BigDecimal newCityLocalUseTax) {
		BigDecimal oldCityLocalUseTax = cityLocalUseTax;
		cityLocalUseTax = newCityLocalUseTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.ZIP_SALES_TAX_LOOKUP__CITY_LOCAL_USE_TAX, oldCityLocalUseTax, cityLocalUseTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCitySalesTax() {
		return citySalesTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCitySalesTax(BigDecimal newCitySalesTax) {
		BigDecimal oldCitySalesTax = citySalesTax;
		citySalesTax = newCitySalesTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.ZIP_SALES_TAX_LOOKUP__CITY_SALES_TAX, oldCitySalesTax, citySalesTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCityUseTax() {
		return cityUseTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCityUseTax(BigDecimal newCityUseTax) {
		BigDecimal oldCityUseTax = cityUseTax;
		cityUseTax = newCityUseTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.ZIP_SALES_TAX_LOOKUP__CITY_USE_TAX, oldCityUseTax, cityUseTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getComboSalesTax() {
		return comboSalesTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComboSalesTax(BigDecimal newComboSalesTax) {
		BigDecimal oldComboSalesTax = comboSalesTax;
		comboSalesTax = newComboSalesTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.ZIP_SALES_TAX_LOOKUP__COMBO_SALES_TAX, oldComboSalesTax, comboSalesTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getComboUseTax() {
		return comboUseTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComboUseTax(BigDecimal newComboUseTax) {
		BigDecimal oldComboUseTax = comboUseTax;
		comboUseTax = newComboUseTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.ZIP_SALES_TAX_LOOKUP__COMBO_USE_TAX, oldComboUseTax, comboUseTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCountyDefault() {
		return countyDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountyDefault(boolean newCountyDefault) {
		boolean oldCountyDefault = countyDefault;
		countyDefault = newCountyDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_DEFAULT, oldCountyDefault, countyDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCounty() {
		return county;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCounty(String newCounty) {
		String oldCounty = county;
		county = newCounty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY, oldCounty, county));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountyFips() {
		return countyFips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountyFips(String newCountyFips) {
		String oldCountyFips = countyFips;
		countyFips = newCountyFips;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_FIPS, oldCountyFips, countyFips));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCountyLocalSalesTax() {
		return countyLocalSalesTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountyLocalSalesTax(BigDecimal newCountyLocalSalesTax) {
		BigDecimal oldCountyLocalSalesTax = countyLocalSalesTax;
		countyLocalSalesTax = newCountyLocalSalesTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_LOCAL_SALES_TAX, oldCountyLocalSalesTax, countyLocalSalesTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCountyLocalUseTax() {
		return countyLocalUseTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountyLocalUseTax(BigDecimal newCountyLocalUseTax) {
		BigDecimal oldCountyLocalUseTax = countyLocalUseTax;
		countyLocalUseTax = newCountyLocalUseTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_LOCAL_USE_TAX, oldCountyLocalUseTax, countyLocalUseTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCountySalesTax() {
		return countySalesTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountySalesTax(BigDecimal newCountySalesTax) {
		BigDecimal oldCountySalesTax = countySalesTax;
		countySalesTax = newCountySalesTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_SALES_TAX, oldCountySalesTax, countySalesTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCountyUseTax() {
		return countyUseTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountyUseTax(BigDecimal newCountyUseTax) {
		BigDecimal oldCountyUseTax = countyUseTax;
		countyUseTax = newCountyUseTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_USE_TAX, oldCountyUseTax, countyUseTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGeneralDefault() {
		return generalDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeneralDefault(boolean newGeneralDefault) {
		boolean oldGeneralDefault = generalDefault;
		generalDefault = newGeneralDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.ZIP_SALES_TAX_LOOKUP__GENERAL_DEFAULT, oldGeneralDefault, generalDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.ZIP_SALES_TAX_LOOKUP__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeoCode() {
		return geoCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoCode(String newGeoCode) {
		String oldGeoCode = geoCode;
		geoCode = newGeoCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.ZIP_SALES_TAX_LOOKUP__GEO_CODE, oldGeoCode, geoCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInsideCity() {
		return insideCity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInsideCity(boolean newInsideCity) {
		boolean oldInsideCity = insideCity;
		insideCity = newInsideCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.ZIP_SALES_TAX_LOOKUP__INSIDE_CITY, oldInsideCity, insideCity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStateCode() {
		return stateCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateCode(String newStateCode) {
		String oldStateCode = stateCode;
		stateCode = newStateCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.ZIP_SALES_TAX_LOOKUP__STATE_CODE, oldStateCode, stateCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getStateSalesTax() {
		return stateSalesTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateSalesTax(BigDecimal newStateSalesTax) {
		BigDecimal oldStateSalesTax = stateSalesTax;
		stateSalesTax = newStateSalesTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.ZIP_SALES_TAX_LOOKUP__STATE_SALES_TAX, oldStateSalesTax, stateSalesTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getStateUseTax() {
		return stateUseTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateUseTax(BigDecimal newStateUseTax) {
		BigDecimal oldStateUseTax = stateUseTax;
		stateUseTax = newStateUseTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.ZIP_SALES_TAX_LOOKUP__STATE_USE_TAX, oldStateUseTax, stateUseTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZipCode(String newZipCode) {
		String oldZipCode = zipCode;
		zipCode = newZipCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxPackage.ZIP_SALES_TAX_LOOKUP__ZIP_CODE, oldZipCode, zipCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__ZIP_CODE:
				return getZipCode();
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__STATE_CODE:
				return getStateCode();
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__CITY:
				return getCity();
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY:
				return getCounty();
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__FROM_DATE:
				return getFromDate();
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__CITY_LOCAL_SALES_TAX:
				return getCityLocalSalesTax();
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__CITY_LOCAL_USE_TAX:
				return getCityLocalUseTax();
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__CITY_SALES_TAX:
				return getCitySalesTax();
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__CITY_USE_TAX:
				return getCityUseTax();
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COMBO_SALES_TAX:
				return getComboSalesTax();
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COMBO_USE_TAX:
				return getComboUseTax();
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_DEFAULT:
				return isCountyDefault();
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_FIPS:
				return getCountyFips();
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_LOCAL_SALES_TAX:
				return getCountyLocalSalesTax();
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_LOCAL_USE_TAX:
				return getCountyLocalUseTax();
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_SALES_TAX:
				return getCountySalesTax();
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_USE_TAX:
				return getCountyUseTax();
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__GENERAL_DEFAULT:
				return isGeneralDefault();
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__GEO_CODE:
				return getGeoCode();
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__INSIDE_CITY:
				return isInsideCity();
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__STATE_SALES_TAX:
				return getStateSalesTax();
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__STATE_USE_TAX:
				return getStateUseTax();
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
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__ZIP_CODE:
				setZipCode((String)newValue);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__STATE_CODE:
				setStateCode((String)newValue);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__CITY:
				setCity((String)newValue);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY:
				setCounty((String)newValue);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__CITY_LOCAL_SALES_TAX:
				setCityLocalSalesTax((BigDecimal)newValue);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__CITY_LOCAL_USE_TAX:
				setCityLocalUseTax((BigDecimal)newValue);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__CITY_SALES_TAX:
				setCitySalesTax((BigDecimal)newValue);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__CITY_USE_TAX:
				setCityUseTax((BigDecimal)newValue);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COMBO_SALES_TAX:
				setComboSalesTax((BigDecimal)newValue);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COMBO_USE_TAX:
				setComboUseTax((BigDecimal)newValue);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_DEFAULT:
				setCountyDefault((Boolean)newValue);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_FIPS:
				setCountyFips((String)newValue);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_LOCAL_SALES_TAX:
				setCountyLocalSalesTax((BigDecimal)newValue);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_LOCAL_USE_TAX:
				setCountyLocalUseTax((BigDecimal)newValue);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_SALES_TAX:
				setCountySalesTax((BigDecimal)newValue);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_USE_TAX:
				setCountyUseTax((BigDecimal)newValue);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__GENERAL_DEFAULT:
				setGeneralDefault((Boolean)newValue);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__GEO_CODE:
				setGeoCode((String)newValue);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__INSIDE_CITY:
				setInsideCity((Boolean)newValue);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__STATE_SALES_TAX:
				setStateSalesTax((BigDecimal)newValue);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__STATE_USE_TAX:
				setStateUseTax((BigDecimal)newValue);
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
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__ZIP_CODE:
				setZipCode(ZIP_CODE_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__STATE_CODE:
				setStateCode(STATE_CODE_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY:
				setCounty(COUNTY_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__CITY_LOCAL_SALES_TAX:
				setCityLocalSalesTax(CITY_LOCAL_SALES_TAX_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__CITY_LOCAL_USE_TAX:
				setCityLocalUseTax(CITY_LOCAL_USE_TAX_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__CITY_SALES_TAX:
				setCitySalesTax(CITY_SALES_TAX_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__CITY_USE_TAX:
				setCityUseTax(CITY_USE_TAX_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COMBO_SALES_TAX:
				setComboSalesTax(COMBO_SALES_TAX_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COMBO_USE_TAX:
				setComboUseTax(COMBO_USE_TAX_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_DEFAULT:
				setCountyDefault(COUNTY_DEFAULT_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_FIPS:
				setCountyFips(COUNTY_FIPS_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_LOCAL_SALES_TAX:
				setCountyLocalSalesTax(COUNTY_LOCAL_SALES_TAX_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_LOCAL_USE_TAX:
				setCountyLocalUseTax(COUNTY_LOCAL_USE_TAX_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_SALES_TAX:
				setCountySalesTax(COUNTY_SALES_TAX_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_USE_TAX:
				setCountyUseTax(COUNTY_USE_TAX_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__GENERAL_DEFAULT:
				setGeneralDefault(GENERAL_DEFAULT_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__GEO_CODE:
				setGeoCode(GEO_CODE_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__INSIDE_CITY:
				setInsideCity(INSIDE_CITY_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__STATE_SALES_TAX:
				setStateSalesTax(STATE_SALES_TAX_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__STATE_USE_TAX:
				setStateUseTax(STATE_USE_TAX_EDEFAULT);
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
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__ZIP_CODE:
				return ZIP_CODE_EDEFAULT == null ? zipCode != null : !ZIP_CODE_EDEFAULT.equals(zipCode);
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__STATE_CODE:
				return STATE_CODE_EDEFAULT == null ? stateCode != null : !STATE_CODE_EDEFAULT.equals(stateCode);
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY:
				return COUNTY_EDEFAULT == null ? county != null : !COUNTY_EDEFAULT.equals(county);
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__CITY_LOCAL_SALES_TAX:
				return CITY_LOCAL_SALES_TAX_EDEFAULT == null ? cityLocalSalesTax != null : !CITY_LOCAL_SALES_TAX_EDEFAULT.equals(cityLocalSalesTax);
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__CITY_LOCAL_USE_TAX:
				return CITY_LOCAL_USE_TAX_EDEFAULT == null ? cityLocalUseTax != null : !CITY_LOCAL_USE_TAX_EDEFAULT.equals(cityLocalUseTax);
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__CITY_SALES_TAX:
				return CITY_SALES_TAX_EDEFAULT == null ? citySalesTax != null : !CITY_SALES_TAX_EDEFAULT.equals(citySalesTax);
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__CITY_USE_TAX:
				return CITY_USE_TAX_EDEFAULT == null ? cityUseTax != null : !CITY_USE_TAX_EDEFAULT.equals(cityUseTax);
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COMBO_SALES_TAX:
				return COMBO_SALES_TAX_EDEFAULT == null ? comboSalesTax != null : !COMBO_SALES_TAX_EDEFAULT.equals(comboSalesTax);
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COMBO_USE_TAX:
				return COMBO_USE_TAX_EDEFAULT == null ? comboUseTax != null : !COMBO_USE_TAX_EDEFAULT.equals(comboUseTax);
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_DEFAULT:
				return countyDefault != COUNTY_DEFAULT_EDEFAULT;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_FIPS:
				return COUNTY_FIPS_EDEFAULT == null ? countyFips != null : !COUNTY_FIPS_EDEFAULT.equals(countyFips);
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_LOCAL_SALES_TAX:
				return COUNTY_LOCAL_SALES_TAX_EDEFAULT == null ? countyLocalSalesTax != null : !COUNTY_LOCAL_SALES_TAX_EDEFAULT.equals(countyLocalSalesTax);
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_LOCAL_USE_TAX:
				return COUNTY_LOCAL_USE_TAX_EDEFAULT == null ? countyLocalUseTax != null : !COUNTY_LOCAL_USE_TAX_EDEFAULT.equals(countyLocalUseTax);
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_SALES_TAX:
				return COUNTY_SALES_TAX_EDEFAULT == null ? countySalesTax != null : !COUNTY_SALES_TAX_EDEFAULT.equals(countySalesTax);
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__COUNTY_USE_TAX:
				return COUNTY_USE_TAX_EDEFAULT == null ? countyUseTax != null : !COUNTY_USE_TAX_EDEFAULT.equals(countyUseTax);
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__GENERAL_DEFAULT:
				return generalDefault != GENERAL_DEFAULT_EDEFAULT;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__GEO_CODE:
				return GEO_CODE_EDEFAULT == null ? geoCode != null : !GEO_CODE_EDEFAULT.equals(geoCode);
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__INSIDE_CITY:
				return insideCity != INSIDE_CITY_EDEFAULT;
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__STATE_SALES_TAX:
				return STATE_SALES_TAX_EDEFAULT == null ? stateSalesTax != null : !STATE_SALES_TAX_EDEFAULT.equals(stateSalesTax);
			case TaxPackage.ZIP_SALES_TAX_LOOKUP__STATE_USE_TAX:
				return STATE_USE_TAX_EDEFAULT == null ? stateUseTax != null : !STATE_USE_TAX_EDEFAULT.equals(stateUseTax);
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
		result.append(" (zipCode: ");
		result.append(zipCode);
		result.append(", stateCode: ");
		result.append(stateCode);
		result.append(", city: ");
		result.append(city);
		result.append(", county: ");
		result.append(county);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", cityLocalSalesTax: ");
		result.append(cityLocalSalesTax);
		result.append(", cityLocalUseTax: ");
		result.append(cityLocalUseTax);
		result.append(", citySalesTax: ");
		result.append(citySalesTax);
		result.append(", cityUseTax: ");
		result.append(cityUseTax);
		result.append(", comboSalesTax: ");
		result.append(comboSalesTax);
		result.append(", comboUseTax: ");
		result.append(comboUseTax);
		result.append(", countyDefault: ");
		result.append(countyDefault);
		result.append(", countyFips: ");
		result.append(countyFips);
		result.append(", countyLocalSalesTax: ");
		result.append(countyLocalSalesTax);
		result.append(", countyLocalUseTax: ");
		result.append(countyLocalUseTax);
		result.append(", countySalesTax: ");
		result.append(countySalesTax);
		result.append(", countyUseTax: ");
		result.append(countyUseTax);
		result.append(", generalDefault: ");
		result.append(generalDefault);
		result.append(", geoCode: ");
		result.append(geoCode);
		result.append(", insideCity: ");
		result.append(insideCity);
		result.append(", stateSalesTax: ");
		result.append(stateSalesTax);
		result.append(", stateUseTax: ");
		result.append(stateUseTax);
		result.append(')');
		return result.toString();
	}

} //ZipSalesTaxLookupImpl
