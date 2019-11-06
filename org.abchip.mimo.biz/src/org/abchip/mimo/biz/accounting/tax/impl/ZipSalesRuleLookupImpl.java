/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesRuleLookupImpl#getStateCode <em>State Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesRuleLookupImpl#getCity <em>City</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesRuleLookupImpl#getCounty <em>County</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.tax.impl.ZipSalesRuleLookupImpl#getFromDate <em>From Date</em>}</li>
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
	 * The default value of the '{@link #getIdCode() <em>Id Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_CODE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getIdCode() <em>Id Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdCode()
	 * @generated
	 * @ordered
	 */
	protected String idCode = ID_CODE_EDEFAULT;
	/**
	 * The default value of the '{@link #getShipCond() <em>Ship Cond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipCond()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIP_COND_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getShipCond() <em>Ship Cond</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipCond()
	 * @generated
	 * @ordered
	 */
	protected String shipCond = SHIP_COND_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxable() <em>Taxable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxable()
	 * @generated
	 * @ordered
	 */
	protected static final String TAXABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxable() <em>Taxable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxable()
	 * @generated
	 * @ordered
	 */
	protected String taxable = TAXABLE_EDEFAULT;

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
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCity(String newCity) {
		city = newCity;
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
		county = newCounty;
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
		fromDate = newFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdCode() {
		return idCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdCode(String newIdCode) {
		idCode = newIdCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipCond() {
		return shipCond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipCond(String newShipCond) {
		shipCond = newShipCond;
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
		stateCode = newStateCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxable() {
		return taxable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxable(String newTaxable) {
		taxable = newTaxable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__STATE_CODE:
				return getStateCode();
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__CITY:
				return getCity();
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__COUNTY:
				return getCounty();
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__FROM_DATE:
				return getFromDate();
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__ID_CODE:
				return getIdCode();
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__SHIP_COND:
				return getShipCond();
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__TAXABLE:
				return getTaxable();
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
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__STATE_CODE:
				setStateCode((String)newValue);
				return;
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__CITY:
				setCity((String)newValue);
				return;
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__COUNTY:
				setCounty((String)newValue);
				return;
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__ID_CODE:
				setIdCode((String)newValue);
				return;
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__SHIP_COND:
				setShipCond((String)newValue);
				return;
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__TAXABLE:
				setTaxable((String)newValue);
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
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__STATE_CODE:
				setStateCode(STATE_CODE_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__COUNTY:
				setCounty(COUNTY_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__ID_CODE:
				setIdCode(ID_CODE_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__SHIP_COND:
				setShipCond(SHIP_COND_EDEFAULT);
				return;
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__TAXABLE:
				setTaxable(TAXABLE_EDEFAULT);
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
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__STATE_CODE:
				return STATE_CODE_EDEFAULT == null ? stateCode != null : !STATE_CODE_EDEFAULT.equals(stateCode);
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__COUNTY:
				return COUNTY_EDEFAULT == null ? county != null : !COUNTY_EDEFAULT.equals(county);
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__ID_CODE:
				return ID_CODE_EDEFAULT == null ? idCode != null : !ID_CODE_EDEFAULT.equals(idCode);
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__SHIP_COND:
				return SHIP_COND_EDEFAULT == null ? shipCond != null : !SHIP_COND_EDEFAULT.equals(shipCond);
			case TaxPackage.ZIP_SALES_RULE_LOOKUP__TAXABLE:
				return TAXABLE_EDEFAULT == null ? taxable != null : !TAXABLE_EDEFAULT.equals(taxable);
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
		result.append(" (stateCode: ");
		result.append(stateCode);
		result.append(", city: ");
		result.append(city);
		result.append(", county: ");
		result.append(county);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", idCode: ");
		result.append(idCode);
		result.append(", shipCond: ");
		result.append(shipCond);
		result.append(", taxable: ");
		result.append(taxable);
		result.append(')');
		return result.toString();
	}

} //ZipSalesRuleLookupImpl
