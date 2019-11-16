/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.geo.impl;

import org.abchip.mimo.biz.common.geo.CountryAddressFormat;
import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.common.geo.GeoAssocType;
import org.abchip.mimo.biz.common.geo.GeoPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Country Address Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.CountryAddressFormatImpl#getAddressFormat <em>Address Format</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.CountryAddressFormatImpl#isHasPostalCodeExt <em>Has Postal Code Ext</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.CountryAddressFormatImpl#getPostalCodeRegex <em>Postal Code Regex</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.CountryAddressFormatImpl#isRequirePostalCode <em>Require Postal Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.CountryAddressFormatImpl#isRequirePostalCodeExt <em>Require Postal Code Ext</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.CountryAddressFormatImpl#getRequireStateProvinceId <em>Require State Province Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.CountryAddressFormatImpl#getGeoId <em>Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.CountryAddressFormatImpl#getGeoAssocTypeId <em>Geo Assoc Type Id</em>}</li>
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
	 * The default value of the '{@link #getAddressFormat() <em>Address Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_FORMAT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAddressFormat() <em>Address Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressFormat()
	 * @generated
	 * @ordered
	 */
	protected String addressFormat = ADDRESS_FORMAT_EDEFAULT;
	/**
	 * The default value of the '{@link #isHasPostalCodeExt() <em>Has Postal Code Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasPostalCodeExt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_POSTAL_CODE_EXT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isHasPostalCodeExt() <em>Has Postal Code Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasPostalCodeExt()
	 * @generated
	 * @ordered
	 */
	protected boolean hasPostalCodeExt = HAS_POSTAL_CODE_EXT_EDEFAULT;
	/**
	 * The default value of the '{@link #getPostalCodeRegex() <em>Postal Code Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCodeRegex()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTAL_CODE_REGEX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPostalCodeRegex() <em>Postal Code Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCodeRegex()
	 * @generated
	 * @ordered
	 */
	protected String postalCodeRegex = POSTAL_CODE_REGEX_EDEFAULT;
	/**
	 * The default value of the '{@link #isRequirePostalCode() <em>Require Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequirePostalCode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRE_POSTAL_CODE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isRequirePostalCode() <em>Require Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequirePostalCode()
	 * @generated
	 * @ordered
	 */
	protected boolean requirePostalCode = REQUIRE_POSTAL_CODE_EDEFAULT;
	/**
	 * The default value of the '{@link #isRequirePostalCodeExt() <em>Require Postal Code Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequirePostalCodeExt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRE_POSTAL_CODE_EXT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isRequirePostalCodeExt() <em>Require Postal Code Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequirePostalCodeExt()
	 * @generated
	 * @ordered
	 */
	protected boolean requirePostalCodeExt = REQUIRE_POSTAL_CODE_EXT_EDEFAULT;
	/**
	 * The default value of the '{@link #getRequireStateProvinceId() <em>Require State Province Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireStateProvinceId()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRE_STATE_PROVINCE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRequireStateProvinceId() <em>Require State Province Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireStateProvinceId()
	 * @generated
	 * @ordered
	 */
	protected String requireStateProvinceId = REQUIRE_STATE_PROVINCE_ID_EDEFAULT;
	/**
	 * The cached value of the '{@link #getGeoId() <em>Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoId()
	 * @generated
	 * @ordered
	 */
	protected Geo geoId;
	/**
	 * The cached value of the '{@link #getGeoAssocTypeId() <em>Geo Assoc Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoAssocTypeId()
	 * @generated
	 * @ordered
	 */
	protected GeoAssocType geoAssocTypeId;

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
		return addressFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressFormat(String newAddressFormat) {
		String oldAddressFormat = addressFormat;
		addressFormat = newAddressFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoPackage.COUNTRY_ADDRESS_FORMAT__ADDRESS_FORMAT, oldAddressFormat, addressFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostalCodeRegex() {
		return postalCodeRegex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostalCodeRegex(String newPostalCodeRegex) {
		String oldPostalCodeRegex = postalCodeRegex;
		postalCodeRegex = newPostalCodeRegex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoPackage.COUNTRY_ADDRESS_FORMAT__POSTAL_CODE_REGEX, oldPostalCodeRegex, postalCodeRegex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequirePostalCode() {
		return requirePostalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirePostalCode(boolean newRequirePostalCode) {
		boolean oldRequirePostalCode = requirePostalCode;
		requirePostalCode = newRequirePostalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoPackage.COUNTRY_ADDRESS_FORMAT__REQUIRE_POSTAL_CODE, oldRequirePostalCode, requirePostalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequirePostalCodeExt() {
		return requirePostalCodeExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirePostalCodeExt(boolean newRequirePostalCodeExt) {
		boolean oldRequirePostalCodeExt = requirePostalCodeExt;
		requirePostalCodeExt = newRequirePostalCodeExt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoPackage.COUNTRY_ADDRESS_FORMAT__REQUIRE_POSTAL_CODE_EXT, oldRequirePostalCodeExt, requirePostalCodeExt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequireStateProvinceId() {
		return requireStateProvinceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireStateProvinceId(String newRequireStateProvinceId) {
		String oldRequireStateProvinceId = requireStateProvinceId;
		requireStateProvinceId = newRequireStateProvinceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoPackage.COUNTRY_ADDRESS_FORMAT__REQUIRE_STATE_PROVINCE_ID, oldRequireStateProvinceId, requireStateProvinceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoAssocType getGeoAssocTypeId() {
		if (geoAssocTypeId != null && ((EObject)geoAssocTypeId).eIsProxy()) {
			InternalEObject oldGeoAssocTypeId = (InternalEObject)geoAssocTypeId;
			geoAssocTypeId = (GeoAssocType)eResolveProxy(oldGeoAssocTypeId);
			if (geoAssocTypeId != oldGeoAssocTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeoPackage.COUNTRY_ADDRESS_FORMAT__GEO_ASSOC_TYPE_ID, oldGeoAssocTypeId, geoAssocTypeId));
			}
		}
		return geoAssocTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoAssocType basicGetGeoAssocTypeId() {
		return geoAssocTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoAssocTypeId(GeoAssocType newGeoAssocTypeId) {
		GeoAssocType oldGeoAssocTypeId = geoAssocTypeId;
		geoAssocTypeId = newGeoAssocTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoPackage.COUNTRY_ADDRESS_FORMAT__GEO_ASSOC_TYPE_ID, oldGeoAssocTypeId, geoAssocTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasPostalCodeExt() {
		return hasPostalCodeExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasPostalCodeExt(boolean newHasPostalCodeExt) {
		boolean oldHasPostalCodeExt = hasPostalCodeExt;
		hasPostalCodeExt = newHasPostalCodeExt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoPackage.COUNTRY_ADDRESS_FORMAT__HAS_POSTAL_CODE_EXT, oldHasPostalCodeExt, hasPostalCodeExt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getGeoId() {
		if (geoId != null && ((EObject)geoId).eIsProxy()) {
			InternalEObject oldGeoId = (InternalEObject)geoId;
			geoId = (Geo)eResolveProxy(oldGeoId);
			if (geoId != oldGeoId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeoPackage.COUNTRY_ADDRESS_FORMAT__GEO_ID, oldGeoId, geoId));
			}
		}
		return geoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geo basicGetGeoId() {
		return geoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoId(Geo newGeoId) {
		Geo oldGeoId = geoId;
		geoId = newGeoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoPackage.COUNTRY_ADDRESS_FORMAT__GEO_ID, oldGeoId, geoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__ADDRESS_FORMAT:
				return getAddressFormat();
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__HAS_POSTAL_CODE_EXT:
				return isHasPostalCodeExt();
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__POSTAL_CODE_REGEX:
				return getPostalCodeRegex();
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__REQUIRE_POSTAL_CODE:
				return isRequirePostalCode();
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__REQUIRE_POSTAL_CODE_EXT:
				return isRequirePostalCodeExt();
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__REQUIRE_STATE_PROVINCE_ID:
				return getRequireStateProvinceId();
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__GEO_ID:
				if (resolve) return getGeoId();
				return basicGetGeoId();
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__GEO_ASSOC_TYPE_ID:
				if (resolve) return getGeoAssocTypeId();
				return basicGetGeoAssocTypeId();
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
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__ADDRESS_FORMAT:
				setAddressFormat((String)newValue);
				return;
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__HAS_POSTAL_CODE_EXT:
				setHasPostalCodeExt((Boolean)newValue);
				return;
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__POSTAL_CODE_REGEX:
				setPostalCodeRegex((String)newValue);
				return;
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__REQUIRE_POSTAL_CODE:
				setRequirePostalCode((Boolean)newValue);
				return;
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__REQUIRE_POSTAL_CODE_EXT:
				setRequirePostalCodeExt((Boolean)newValue);
				return;
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__REQUIRE_STATE_PROVINCE_ID:
				setRequireStateProvinceId((String)newValue);
				return;
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__GEO_ID:
				setGeoId((Geo)newValue);
				return;
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__GEO_ASSOC_TYPE_ID:
				setGeoAssocTypeId((GeoAssocType)newValue);
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
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__ADDRESS_FORMAT:
				setAddressFormat(ADDRESS_FORMAT_EDEFAULT);
				return;
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__HAS_POSTAL_CODE_EXT:
				setHasPostalCodeExt(HAS_POSTAL_CODE_EXT_EDEFAULT);
				return;
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__POSTAL_CODE_REGEX:
				setPostalCodeRegex(POSTAL_CODE_REGEX_EDEFAULT);
				return;
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__REQUIRE_POSTAL_CODE:
				setRequirePostalCode(REQUIRE_POSTAL_CODE_EDEFAULT);
				return;
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__REQUIRE_POSTAL_CODE_EXT:
				setRequirePostalCodeExt(REQUIRE_POSTAL_CODE_EXT_EDEFAULT);
				return;
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__REQUIRE_STATE_PROVINCE_ID:
				setRequireStateProvinceId(REQUIRE_STATE_PROVINCE_ID_EDEFAULT);
				return;
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__GEO_ID:
				setGeoId((Geo)null);
				return;
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__GEO_ASSOC_TYPE_ID:
				setGeoAssocTypeId((GeoAssocType)null);
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
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__ADDRESS_FORMAT:
				return ADDRESS_FORMAT_EDEFAULT == null ? addressFormat != null : !ADDRESS_FORMAT_EDEFAULT.equals(addressFormat);
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__HAS_POSTAL_CODE_EXT:
				return hasPostalCodeExt != HAS_POSTAL_CODE_EXT_EDEFAULT;
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__POSTAL_CODE_REGEX:
				return POSTAL_CODE_REGEX_EDEFAULT == null ? postalCodeRegex != null : !POSTAL_CODE_REGEX_EDEFAULT.equals(postalCodeRegex);
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__REQUIRE_POSTAL_CODE:
				return requirePostalCode != REQUIRE_POSTAL_CODE_EDEFAULT;
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__REQUIRE_POSTAL_CODE_EXT:
				return requirePostalCodeExt != REQUIRE_POSTAL_CODE_EXT_EDEFAULT;
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__REQUIRE_STATE_PROVINCE_ID:
				return REQUIRE_STATE_PROVINCE_ID_EDEFAULT == null ? requireStateProvinceId != null : !REQUIRE_STATE_PROVINCE_ID_EDEFAULT.equals(requireStateProvinceId);
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__GEO_ID:
				return geoId != null;
			case GeoPackage.COUNTRY_ADDRESS_FORMAT__GEO_ASSOC_TYPE_ID:
				return geoAssocTypeId != null;
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
		result.append(" (addressFormat: ");
		result.append(addressFormat);
		result.append(", hasPostalCodeExt: ");
		result.append(hasPostalCodeExt);
		result.append(", postalCodeRegex: ");
		result.append(postalCodeRegex);
		result.append(", requirePostalCode: ");
		result.append(requirePostalCode);
		result.append(", requirePostalCodeExt: ");
		result.append(requirePostalCodeExt);
		result.append(", requireStateProvinceId: ");
		result.append(requireStateProvinceId);
		result.append(')');
		return result.toString();
	}

} //CountryAddressFormatImpl
