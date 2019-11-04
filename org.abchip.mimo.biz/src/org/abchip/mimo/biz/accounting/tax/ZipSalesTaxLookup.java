/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.tax;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zip Sales Tax Lookup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getZipCode <em>Zip Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getStateCode <em>State Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCity <em>City</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCounty <em>County</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCityLocalSalesTax <em>City Local Sales Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCityLocalUseTax <em>City Local Use Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCitySalesTax <em>City Sales Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCityUseTax <em>City Use Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getComboSalesTax <em>Combo Sales Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getComboUseTax <em>Combo Use Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#isCountyDefault <em>County Default</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCountyFips <em>County Fips</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCountyLocalSalesTax <em>County Local Sales Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCountyLocalUseTax <em>County Local Use Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCountySalesTax <em>County Sales Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCountyUseTax <em>County Use Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#isGeneralDefault <em>General Default</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getGeoCode <em>Geo Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#isInsideCity <em>Inside City</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getStateSalesTax <em>State Sales Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getStateUseTax <em>State Use Tax</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesTaxLookup()
 * @model
 * @generated
 */
public interface ZipSalesTaxLookup extends BizEntity {
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
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesTaxLookup_City()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>City Local Sales Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City Local Sales Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City Local Sales Tax</em>' attribute.
	 * @see #setCityLocalSalesTax(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesTaxLookup_CityLocalSalesTax()
	 * @model
	 * @generated
	 */
	BigDecimal getCityLocalSalesTax();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCityLocalSalesTax <em>City Local Sales Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City Local Sales Tax</em>' attribute.
	 * @see #getCityLocalSalesTax()
	 * @generated
	 */
	void setCityLocalSalesTax(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>City Local Use Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City Local Use Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City Local Use Tax</em>' attribute.
	 * @see #setCityLocalUseTax(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesTaxLookup_CityLocalUseTax()
	 * @model
	 * @generated
	 */
	BigDecimal getCityLocalUseTax();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCityLocalUseTax <em>City Local Use Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City Local Use Tax</em>' attribute.
	 * @see #getCityLocalUseTax()
	 * @generated
	 */
	void setCityLocalUseTax(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>City Sales Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City Sales Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City Sales Tax</em>' attribute.
	 * @see #setCitySalesTax(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesTaxLookup_CitySalesTax()
	 * @model
	 * @generated
	 */
	BigDecimal getCitySalesTax();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCitySalesTax <em>City Sales Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City Sales Tax</em>' attribute.
	 * @see #getCitySalesTax()
	 * @generated
	 */
	void setCitySalesTax(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>City Use Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City Use Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City Use Tax</em>' attribute.
	 * @see #setCityUseTax(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesTaxLookup_CityUseTax()
	 * @model
	 * @generated
	 */
	BigDecimal getCityUseTax();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCityUseTax <em>City Use Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City Use Tax</em>' attribute.
	 * @see #getCityUseTax()
	 * @generated
	 */
	void setCityUseTax(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Combo Sales Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combo Sales Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combo Sales Tax</em>' attribute.
	 * @see #setComboSalesTax(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesTaxLookup_ComboSalesTax()
	 * @model
	 * @generated
	 */
	BigDecimal getComboSalesTax();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getComboSalesTax <em>Combo Sales Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combo Sales Tax</em>' attribute.
	 * @see #getComboSalesTax()
	 * @generated
	 */
	void setComboSalesTax(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Combo Use Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combo Use Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combo Use Tax</em>' attribute.
	 * @see #setComboUseTax(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesTaxLookup_ComboUseTax()
	 * @model
	 * @generated
	 */
	BigDecimal getComboUseTax();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getComboUseTax <em>Combo Use Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combo Use Tax</em>' attribute.
	 * @see #getComboUseTax()
	 * @generated
	 */
	void setComboUseTax(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>County Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>County Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>County Default</em>' attribute.
	 * @see #setCountyDefault(boolean)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesTaxLookup_CountyDefault()
	 * @model
	 * @generated
	 */
	boolean isCountyDefault();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#isCountyDefault <em>County Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>County Default</em>' attribute.
	 * @see #isCountyDefault()
	 * @generated
	 */
	void setCountyDefault(boolean value);

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
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesTaxLookup_County()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getCounty();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCounty <em>County</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>County</em>' attribute.
	 * @see #getCounty()
	 * @generated
	 */
	void setCounty(String value);

	/**
	 * Returns the value of the '<em><b>County Fips</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>County Fips</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>County Fips</em>' attribute.
	 * @see #setCountyFips(String)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesTaxLookup_CountyFips()
	 * @model
	 * @generated
	 */
	String getCountyFips();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCountyFips <em>County Fips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>County Fips</em>' attribute.
	 * @see #getCountyFips()
	 * @generated
	 */
	void setCountyFips(String value);

	/**
	 * Returns the value of the '<em><b>County Local Sales Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>County Local Sales Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>County Local Sales Tax</em>' attribute.
	 * @see #setCountyLocalSalesTax(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesTaxLookup_CountyLocalSalesTax()
	 * @model
	 * @generated
	 */
	BigDecimal getCountyLocalSalesTax();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCountyLocalSalesTax <em>County Local Sales Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>County Local Sales Tax</em>' attribute.
	 * @see #getCountyLocalSalesTax()
	 * @generated
	 */
	void setCountyLocalSalesTax(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>County Local Use Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>County Local Use Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>County Local Use Tax</em>' attribute.
	 * @see #setCountyLocalUseTax(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesTaxLookup_CountyLocalUseTax()
	 * @model
	 * @generated
	 */
	BigDecimal getCountyLocalUseTax();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCountyLocalUseTax <em>County Local Use Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>County Local Use Tax</em>' attribute.
	 * @see #getCountyLocalUseTax()
	 * @generated
	 */
	void setCountyLocalUseTax(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>County Sales Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>County Sales Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>County Sales Tax</em>' attribute.
	 * @see #setCountySalesTax(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesTaxLookup_CountySalesTax()
	 * @model
	 * @generated
	 */
	BigDecimal getCountySalesTax();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCountySalesTax <em>County Sales Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>County Sales Tax</em>' attribute.
	 * @see #getCountySalesTax()
	 * @generated
	 */
	void setCountySalesTax(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>County Use Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>County Use Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>County Use Tax</em>' attribute.
	 * @see #setCountyUseTax(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesTaxLookup_CountyUseTax()
	 * @model
	 * @generated
	 */
	BigDecimal getCountyUseTax();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getCountyUseTax <em>County Use Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>County Use Tax</em>' attribute.
	 * @see #getCountyUseTax()
	 * @generated
	 */
	void setCountyUseTax(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>General Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Default</em>' attribute.
	 * @see #setGeneralDefault(boolean)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesTaxLookup_GeneralDefault()
	 * @model
	 * @generated
	 */
	boolean isGeneralDefault();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#isGeneralDefault <em>General Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Default</em>' attribute.
	 * @see #isGeneralDefault()
	 * @generated
	 */
	void setGeneralDefault(boolean value);

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
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesTaxLookup_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Geo Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Code</em>' attribute.
	 * @see #setGeoCode(String)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesTaxLookup_GeoCode()
	 * @model
	 * @generated
	 */
	String getGeoCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getGeoCode <em>Geo Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Code</em>' attribute.
	 * @see #getGeoCode()
	 * @generated
	 */
	void setGeoCode(String value);

	/**
	 * Returns the value of the '<em><b>Inside City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inside City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inside City</em>' attribute.
	 * @see #setInsideCity(boolean)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesTaxLookup_InsideCity()
	 * @model
	 * @generated
	 */
	boolean isInsideCity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#isInsideCity <em>Inside City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inside City</em>' attribute.
	 * @see #isInsideCity()
	 * @generated
	 */
	void setInsideCity(boolean value);

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
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesTaxLookup_StateCode()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getStateCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getStateCode <em>State Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Code</em>' attribute.
	 * @see #getStateCode()
	 * @generated
	 */
	void setStateCode(String value);

	/**
	 * Returns the value of the '<em><b>State Sales Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Sales Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Sales Tax</em>' attribute.
	 * @see #setStateSalesTax(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesTaxLookup_StateSalesTax()
	 * @model
	 * @generated
	 */
	BigDecimal getStateSalesTax();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getStateSalesTax <em>State Sales Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Sales Tax</em>' attribute.
	 * @see #getStateSalesTax()
	 * @generated
	 */
	void setStateSalesTax(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>State Use Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Use Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Use Tax</em>' attribute.
	 * @see #setStateUseTax(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesTaxLookup_StateUseTax()
	 * @model
	 * @generated
	 */
	BigDecimal getStateUseTax();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getStateUseTax <em>State Use Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Use Tax</em>' attribute.
	 * @see #getStateUseTax()
	 * @generated
	 */
	void setStateUseTax(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Zip Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zip Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zip Code</em>' attribute.
	 * @see #setZipCode(String)
	 * @see org.abchip.mimo.biz.accounting.tax.TaxPackage#getZipSalesTaxLookup_ZipCode()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getZipCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.tax.ZipSalesTaxLookup#getZipCode <em>Zip Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip Code</em>' attribute.
	 * @see #getZipCode()
	 * @generated
	 */
	void setZipCode(String value);

} // ZipSalesTaxLookup