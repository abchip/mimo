/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact.impl;

import java.util.List;
import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.common.geo.GeoPoint;
import org.abchip.mimo.biz.party.contact.ContactPackage;
import org.abchip.mimo.biz.party.contact.PostalAddress;
import org.abchip.mimo.biz.party.contact.PostalAddressBoundary;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postal Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getAddress1 <em>Address1</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getAddress2 <em>Address2</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getAttnName <em>Attn Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getCity <em>City</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getCityGeoId <em>City Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getCountryGeoId <em>Country Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getCountyGeoId <em>County Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getDirections <em>Directions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getGeoPointId <em>Geo Point Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getHouseNumber <em>House Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getHouseNumberExt <em>House Number Ext</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getMunicipalityGeoId <em>Municipality Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getPostalAddressBoundaries <em>Postal Address Boundaries</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getPostalCodeExt <em>Postal Code Ext</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getPostalCodeGeoId <em>Postal Code Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getStateProvinceGeoId <em>State Province Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getToName <em>To Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostalAddressImpl extends ContactMechImpl implements PostalAddress {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;                     
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostalAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContactPackage.Literals.POSTAL_ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress1() {
		return (String)eGet(ContactPackage.Literals.POSTAL_ADDRESS__ADDRESS1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress1(String newAddress1) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__ADDRESS1, newAddress1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress2() {
		return (String)eGet(ContactPackage.Literals.POSTAL_ADDRESS__ADDRESS2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress2(String newAddress2) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__ADDRESS2, newAddress2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttnName() {
		return (String)eGet(ContactPackage.Literals.POSTAL_ADDRESS__ATTN_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttnName(String newAttnName) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__ATTN_NAME, newAttnName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCity() {
		return (String)eGet(ContactPackage.Literals.POSTAL_ADDRESS__CITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCity(String newCity) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__CITY, newCity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getCityGeoId() {
		return (Geo)eGet(ContactPackage.Literals.POSTAL_ADDRESS__CITY_GEO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCityGeoId(Geo newCityGeoId) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__CITY_GEO_ID, newCityGeoId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getCountryGeoId() {
		return (Geo)eGet(ContactPackage.Literals.POSTAL_ADDRESS__COUNTRY_GEO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountryGeoId(Geo newCountryGeoId) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__COUNTRY_GEO_ID, newCountryGeoId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getCountyGeoId() {
		return (Geo)eGet(ContactPackage.Literals.POSTAL_ADDRESS__COUNTY_GEO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountyGeoId(Geo newCountyGeoId) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__COUNTY_GEO_ID, newCountyGeoId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDirections() {
		return (String)eGet(ContactPackage.Literals.POSTAL_ADDRESS__DIRECTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirections(String newDirections) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__DIRECTIONS, newDirections);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoPoint getGeoPointId() {
		return (GeoPoint)eGet(ContactPackage.Literals.POSTAL_ADDRESS__GEO_POINT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoPointId(GeoPoint newGeoPointId) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__GEO_POINT_ID, newGeoPointId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getHouseNumber() {
		return (Long)eGet(ContactPackage.Literals.POSTAL_ADDRESS__HOUSE_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHouseNumber(long newHouseNumber) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__HOUSE_NUMBER, newHouseNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHouseNumberExt() {
		return (String)eGet(ContactPackage.Literals.POSTAL_ADDRESS__HOUSE_NUMBER_EXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHouseNumberExt(String newHouseNumberExt) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__HOUSE_NUMBER_EXT, newHouseNumberExt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getMunicipalityGeoId() {
		return (Geo)eGet(ContactPackage.Literals.POSTAL_ADDRESS__MUNICIPALITY_GEO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMunicipalityGeoId(Geo newMunicipalityGeoId) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__MUNICIPALITY_GEO_ID, newMunicipalityGeoId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PostalAddressBoundary> getPostalAddressBoundaries() {
		return (List<PostalAddressBoundary>)eGet(ContactPackage.Literals.POSTAL_ADDRESS__POSTAL_ADDRESS_BOUNDARIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostalCode() {
		return (String)eGet(ContactPackage.Literals.POSTAL_ADDRESS__POSTAL_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostalCode(String newPostalCode) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__POSTAL_CODE, newPostalCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostalCodeExt() {
		return (String)eGet(ContactPackage.Literals.POSTAL_ADDRESS__POSTAL_CODE_EXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostalCodeExt(String newPostalCodeExt) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__POSTAL_CODE_EXT, newPostalCodeExt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getPostalCodeGeoId() {
		return (Geo)eGet(ContactPackage.Literals.POSTAL_ADDRESS__POSTAL_CODE_GEO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostalCodeGeoId(Geo newPostalCodeGeoId) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__POSTAL_CODE_GEO_ID, newPostalCodeGeoId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getStateProvinceGeoId() {
		return (Geo)eGet(ContactPackage.Literals.POSTAL_ADDRESS__STATE_PROVINCE_GEO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateProvinceGeoId(Geo newStateProvinceGeoId) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__STATE_PROVINCE_GEO_ID, newStateProvinceGeoId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToName() {
		return (String)eGet(ContactPackage.Literals.POSTAL_ADDRESS__TO_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToName(String newToName) {
		eSet(ContactPackage.Literals.POSTAL_ADDRESS__TO_NAME, newToName);
	}

} //PostalAddressImpl
