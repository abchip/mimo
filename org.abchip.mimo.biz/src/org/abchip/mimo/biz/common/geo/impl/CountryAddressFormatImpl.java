/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.geo.impl;

import org.abchip.mimo.biz.common.geo.CountryAddressFormat;
import org.abchip.mimo.biz.common.geo.GeoAssocType;
import org.abchip.mimo.biz.common.geo.GeoPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Country Address Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.CountryAddressFormatImpl#getGeoId <em>Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.CountryAddressFormatImpl#getAddressFormat <em>Address Format</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.CountryAddressFormatImpl#getGeoAssocTypeId <em>Geo Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.CountryAddressFormatImpl#isHasPostalCodeExt <em>Has Postal Code Ext</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.CountryAddressFormatImpl#getPostalCodeRegex <em>Postal Code Regex</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.CountryAddressFormatImpl#isRequirePostalCode <em>Require Postal Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.CountryAddressFormatImpl#isRequirePostalCodeExt <em>Require Postal Code Ext</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.CountryAddressFormatImpl#getRequireStateProvinceId <em>Require State Province Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountryAddressFormatImpl extends BizEntityImpl implements CountryAddressFormat {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CountryAddressFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddressFormat() {
		return (String)eGet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__ADDRESS_FORMAT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressFormat(String newAddressFormat) {
		eSet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__ADDRESS_FORMAT, newAddressFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasPostalCodeExt() {
		return (Boolean)eGet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__HAS_POSTAL_CODE_EXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasPostalCodeExt(boolean newHasPostalCodeExt) {
		eSet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__HAS_POSTAL_CODE_EXT, newHasPostalCodeExt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostalCodeRegex() {
		return (String)eGet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__POSTAL_CODE_REGEX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostalCodeRegex(String newPostalCodeRegex) {
		eSet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__POSTAL_CODE_REGEX, newPostalCodeRegex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequirePostalCode() {
		return (Boolean)eGet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__REQUIRE_POSTAL_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirePostalCode(boolean newRequirePostalCode) {
		eSet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__REQUIRE_POSTAL_CODE, newRequirePostalCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequirePostalCodeExt() {
		return (Boolean)eGet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__REQUIRE_POSTAL_CODE_EXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirePostalCodeExt(boolean newRequirePostalCodeExt) {
		eSet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__REQUIRE_POSTAL_CODE_EXT, newRequirePostalCodeExt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequireStateProvinceId() {
		return (String)eGet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__REQUIRE_STATE_PROVINCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireStateProvinceId(String newRequireStateProvinceId) {
		eSet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__REQUIRE_STATE_PROVINCE_ID, newRequireStateProvinceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoAssocType getGeoAssocTypeId() {
		return (GeoAssocType)eGet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__GEO_ASSOC_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoAssocTypeId(GeoAssocType newGeoAssocTypeId) {
		eSet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__GEO_ASSOC_TYPE_ID, newGeoAssocTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeoId() {
		return (String)eGet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__GEO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoId(String newGeoId) {
		eSet(GeoPackage.Literals.COUNTRY_ADDRESS_FORMAT__GEO_ID, newGeoId);
	}

} //CountryAddressFormatImpl
