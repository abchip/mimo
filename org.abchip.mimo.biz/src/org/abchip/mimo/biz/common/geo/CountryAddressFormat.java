/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.geo;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Country Address Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.geo.CountryAddressFormat#getGeoId <em>Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.CountryAddressFormat#getAddressFormat <em>Address Format</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.CountryAddressFormat#getGeoAssocTypeId <em>Geo Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.CountryAddressFormat#isHasPostalCodeExt <em>Has Postal Code Ext</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.CountryAddressFormat#getPostalCodeRegex <em>Postal Code Regex</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.CountryAddressFormat#isRequirePostalCode <em>Require Postal Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.CountryAddressFormat#isRequirePostalCodeExt <em>Require Postal Code Ext</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.CountryAddressFormat#getRequireStateProvinceId <em>Require State Province Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getCountryAddressFormat()
 * @model annotation="mimo-ent-frame dictionary='CommonEntityLabels'"
 * @generated
 */
public interface CountryAddressFormat extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Address Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Format</em>' attribute.
	 * @see #setAddressFormat(String)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getCountryAddressFormat_AddressFormat()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAddressFormat();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.CountryAddressFormat#getAddressFormat <em>Address Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Format</em>' attribute.
	 * @see #getAddressFormat()
	 * @generated
	 */
	void setAddressFormat(String value);

	/**
	 * Returns the value of the '<em><b>Has Postal Code Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Postal Code Ext</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Postal Code Ext</em>' attribute.
	 * @see #setHasPostalCodeExt(boolean)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getCountryAddressFormat_HasPostalCodeExt()
	 * @model
	 * @generated
	 */
	boolean isHasPostalCodeExt();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.CountryAddressFormat#isHasPostalCodeExt <em>Has Postal Code Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Postal Code Ext</em>' attribute.
	 * @see #isHasPostalCodeExt()
	 * @generated
	 */
	void setHasPostalCodeExt(boolean value);

	/**
	 * Returns the value of the '<em><b>Postal Code Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Code Regex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code Regex</em>' attribute.
	 * @see #setPostalCodeRegex(String)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getCountryAddressFormat_PostalCodeRegex()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getPostalCodeRegex();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.CountryAddressFormat#getPostalCodeRegex <em>Postal Code Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code Regex</em>' attribute.
	 * @see #getPostalCodeRegex()
	 * @generated
	 */
	void setPostalCodeRegex(String value);

	/**
	 * Returns the value of the '<em><b>Require Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Postal Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Postal Code</em>' attribute.
	 * @see #setRequirePostalCode(boolean)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getCountryAddressFormat_RequirePostalCode()
	 * @model
	 * @generated
	 */
	boolean isRequirePostalCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.CountryAddressFormat#isRequirePostalCode <em>Require Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Postal Code</em>' attribute.
	 * @see #isRequirePostalCode()
	 * @generated
	 */
	void setRequirePostalCode(boolean value);

	/**
	 * Returns the value of the '<em><b>Require Postal Code Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Postal Code Ext</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Postal Code Ext</em>' attribute.
	 * @see #setRequirePostalCodeExt(boolean)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getCountryAddressFormat_RequirePostalCodeExt()
	 * @model
	 * @generated
	 */
	boolean isRequirePostalCodeExt();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.CountryAddressFormat#isRequirePostalCodeExt <em>Require Postal Code Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Postal Code Ext</em>' attribute.
	 * @see #isRequirePostalCodeExt()
	 * @generated
	 */
	void setRequirePostalCodeExt(boolean value);

	/**
	 * Returns the value of the '<em><b>Require State Province Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require State Province Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require State Province Id</em>' attribute.
	 * @see #setRequireStateProvinceId(String)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getCountryAddressFormat_RequireStateProvinceId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getRequireStateProvinceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.CountryAddressFormat#getRequireStateProvinceId <em>Require State Province Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require State Province Id</em>' attribute.
	 * @see #getRequireStateProvinceId()
	 * @generated
	 */
	void setRequireStateProvinceId(String value);

	/**
	 * Returns the value of the '<em><b>Geo Assoc Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Assoc Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Assoc Type Id</em>' reference.
	 * @see #setGeoAssocTypeId(GeoAssocType)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getCountryAddressFormat_GeoAssocTypeId()
	 * @model keys="geoAssocTypeId"
	 * @generated
	 */
	GeoAssocType getGeoAssocTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.CountryAddressFormat#getGeoAssocTypeId <em>Geo Assoc Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Assoc Type Id</em>' reference.
	 * @see #getGeoAssocTypeId()
	 * @generated
	 */
	void setGeoAssocTypeId(GeoAssocType value);

	/**
	 * Returns the value of the '<em><b>Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Id</em>' attribute.
	 * @see #setGeoId(String)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getCountryAddressFormat_GeoId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.CountryAddressFormat#getGeoId <em>Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Id</em>' attribute.
	 * @see #getGeoId()
	 * @generated
	 */
	void setGeoId(String value);

} // CountryAddressFormat
