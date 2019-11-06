/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.geo.impl;

import org.abchip.mimo.biz.common.geo.CountryCapital;
import org.abchip.mimo.biz.common.geo.GeoPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Country Capital</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.CountryCapitalImpl#getCountryCapital <em>Country Capital</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountryCapitalImpl extends CountryCodeImpl implements CountryCapital {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getCountryCapital() <em>Country Capital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCapital()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_CAPITAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountryCapital() <em>Country Capital</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCapital()
	 * @generated
	 * @ordered
	 */
	protected String countryCapital = COUNTRY_CAPITAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountryCapitalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeoPackage.Literals.COUNTRY_CAPITAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountryCapital() {
		return countryCapital;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountryCapital(String newCountryCapital) {
		countryCapital = newCountryCapital;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeoPackage.COUNTRY_CAPITAL__COUNTRY_CAPITAL:
				return getCountryCapital();
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
			case GeoPackage.COUNTRY_CAPITAL__COUNTRY_CAPITAL:
				setCountryCapital((String)newValue);
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
			case GeoPackage.COUNTRY_CAPITAL__COUNTRY_CAPITAL:
				setCountryCapital(COUNTRY_CAPITAL_EDEFAULT);
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
			case GeoPackage.COUNTRY_CAPITAL__COUNTRY_CAPITAL:
				return COUNTRY_CAPITAL_EDEFAULT == null ? countryCapital != null : !COUNTRY_CAPITAL_EDEFAULT.equals(countryCapital);
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
		result.append(" (countryCapital: ");
		result.append(countryCapital);
		result.append(')');
		return result.toString();
	}

} //CountryCapitalImpl
