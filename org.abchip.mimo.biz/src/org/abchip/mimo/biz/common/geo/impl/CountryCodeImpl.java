/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.geo.impl;

import org.abchip.mimo.biz.common.geo.CountryCode;
import org.abchip.mimo.biz.common.geo.GeoPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Country Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.CountryCodeImpl#getCountryCode <em>Country Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.CountryCodeImpl#getCountryAbbr <em>Country Abbr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.CountryCodeImpl#getCountryName <em>Country Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.CountryCodeImpl#getCountryNumber <em>Country Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountryCodeImpl extends BizEntityImpl implements CountryCode {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCode()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_CODE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCode()
	 * @generated
	 * @ordered
	 */
	protected String countryCode = COUNTRY_CODE_EDEFAULT;
	/**
	 * The default value of the '{@link #getCountryAbbr() <em>Country Abbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryAbbr()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_ABBR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCountryAbbr() <em>Country Abbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryAbbr()
	 * @generated
	 * @ordered
	 */
	protected String countryAbbr = COUNTRY_ABBR_EDEFAULT;
	/**
	 * The default value of the '{@link #getCountryName() <em>Country Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryName()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCountryName() <em>Country Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryName()
	 * @generated
	 * @ordered
	 */
	protected String countryName = COUNTRY_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getCountryNumber() <em>Country Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_NUMBER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCountryNumber() <em>Country Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryNumber()
	 * @generated
	 * @ordered
	 */
	protected String countryNumber = COUNTRY_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountryCodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeoPackage.Literals.COUNTRY_CODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountryAbbr() {
		return countryAbbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountryAbbr(String newCountryAbbr) {
		String oldCountryAbbr = countryAbbr;
		countryAbbr = newCountryAbbr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoPackage.COUNTRY_CODE__COUNTRY_ABBR, oldCountryAbbr, countryAbbr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountryName() {
		return countryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountryName(String newCountryName) {
		String oldCountryName = countryName;
		countryName = newCountryName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoPackage.COUNTRY_CODE__COUNTRY_NAME, oldCountryName, countryName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountryNumber() {
		return countryNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountryNumber(String newCountryNumber) {
		String oldCountryNumber = countryNumber;
		countryNumber = newCountryNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoPackage.COUNTRY_CODE__COUNTRY_NUMBER, oldCountryNumber, countryNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountryCode(String newCountryCode) {
		String oldCountryCode = countryCode;
		countryCode = newCountryCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoPackage.COUNTRY_CODE__COUNTRY_CODE, oldCountryCode, countryCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeoPackage.COUNTRY_CODE__COUNTRY_CODE:
				return getCountryCode();
			case GeoPackage.COUNTRY_CODE__COUNTRY_ABBR:
				return getCountryAbbr();
			case GeoPackage.COUNTRY_CODE__COUNTRY_NAME:
				return getCountryName();
			case GeoPackage.COUNTRY_CODE__COUNTRY_NUMBER:
				return getCountryNumber();
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
			case GeoPackage.COUNTRY_CODE__COUNTRY_CODE:
				setCountryCode((String)newValue);
				return;
			case GeoPackage.COUNTRY_CODE__COUNTRY_ABBR:
				setCountryAbbr((String)newValue);
				return;
			case GeoPackage.COUNTRY_CODE__COUNTRY_NAME:
				setCountryName((String)newValue);
				return;
			case GeoPackage.COUNTRY_CODE__COUNTRY_NUMBER:
				setCountryNumber((String)newValue);
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
			case GeoPackage.COUNTRY_CODE__COUNTRY_CODE:
				setCountryCode(COUNTRY_CODE_EDEFAULT);
				return;
			case GeoPackage.COUNTRY_CODE__COUNTRY_ABBR:
				setCountryAbbr(COUNTRY_ABBR_EDEFAULT);
				return;
			case GeoPackage.COUNTRY_CODE__COUNTRY_NAME:
				setCountryName(COUNTRY_NAME_EDEFAULT);
				return;
			case GeoPackage.COUNTRY_CODE__COUNTRY_NUMBER:
				setCountryNumber(COUNTRY_NUMBER_EDEFAULT);
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
			case GeoPackage.COUNTRY_CODE__COUNTRY_CODE:
				return COUNTRY_CODE_EDEFAULT == null ? countryCode != null : !COUNTRY_CODE_EDEFAULT.equals(countryCode);
			case GeoPackage.COUNTRY_CODE__COUNTRY_ABBR:
				return COUNTRY_ABBR_EDEFAULT == null ? countryAbbr != null : !COUNTRY_ABBR_EDEFAULT.equals(countryAbbr);
			case GeoPackage.COUNTRY_CODE__COUNTRY_NAME:
				return COUNTRY_NAME_EDEFAULT == null ? countryName != null : !COUNTRY_NAME_EDEFAULT.equals(countryName);
			case GeoPackage.COUNTRY_CODE__COUNTRY_NUMBER:
				return COUNTRY_NUMBER_EDEFAULT == null ? countryNumber != null : !COUNTRY_NUMBER_EDEFAULT.equals(countryNumber);
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
		result.append(" (countryCode: ");
		result.append(countryCode);
		result.append(", countryAbbr: ");
		result.append(countryAbbr);
		result.append(", countryName: ");
		result.append(countryName);
		result.append(", countryNumber: ");
		result.append(countryNumber);
		result.append(')');
		return result.toString();
	}

} //CountryCodeImpl
