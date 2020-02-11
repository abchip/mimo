/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.geo.impl;

import org.abchip.mimo.biz.common.geo.CountryCode;
import org.abchip.mimo.biz.common.geo.GeoPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

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
		return (String)eGet(GeoPackage.Literals.COUNTRY_CODE__COUNTRY_ABBR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountryAbbr(String newCountryAbbr) {
		eSet(GeoPackage.Literals.COUNTRY_CODE__COUNTRY_ABBR, newCountryAbbr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountryName() {
		return (String)eGet(GeoPackage.Literals.COUNTRY_CODE__COUNTRY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountryName(String newCountryName) {
		eSet(GeoPackage.Literals.COUNTRY_CODE__COUNTRY_NAME, newCountryName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountryNumber() {
		return (String)eGet(GeoPackage.Literals.COUNTRY_CODE__COUNTRY_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountryNumber(String newCountryNumber) {
		eSet(GeoPackage.Literals.COUNTRY_CODE__COUNTRY_NUMBER, newCountryNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountryCode() {
		return (String)eGet(GeoPackage.Literals.COUNTRY_CODE__COUNTRY_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountryCode(String newCountryCode) {
		eSet(GeoPackage.Literals.COUNTRY_CODE__COUNTRY_CODE, newCountryCode);
	}

} //CountryCodeImpl
