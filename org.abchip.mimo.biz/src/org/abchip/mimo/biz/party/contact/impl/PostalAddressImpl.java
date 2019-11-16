/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.common.geo.GeoPoint;
import org.abchip.mimo.biz.party.contact.ContactPackage;
import org.abchip.mimo.biz.party.contact.PostalAddress;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

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
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getDirections <em>Directions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getHouseNumber <em>House Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getHouseNumberExt <em>House Number Ext</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getPostalCodeExt <em>Postal Code Ext</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getToName <em>To Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getCountryGeoId <em>Country Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getStateProvinceGeoId <em>State Province Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getCountyGeoId <em>County Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getMunicipalityGeoId <em>Municipality Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getCityGeoId <em>City Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getPostalCodeGeoId <em>Postal Code Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getGeoPointId <em>Geo Point Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl#getPostalAddressBoundaries <em>Postal Address Boundaries</em>}</li>
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
	 * The default value of the '{@link #getAddress1() <em>Address1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress1()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress1() <em>Address1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress1()
	 * @generated
	 * @ordered
	 */
	protected String address1 = ADDRESS1_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress2() <em>Address2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress2()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress2() <em>Address2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress2()
	 * @generated
	 * @ordered
	 */
	protected String address2 = ADDRESS2_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttnName() <em>Attn Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttnName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttnName() <em>Attn Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttnName()
	 * @generated
	 * @ordered
	 */
	protected String attnName = ATTN_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getDirections() <em>Directions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirections()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTIONS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDirections() <em>Directions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirections()
	 * @generated
	 * @ordered
	 */
	protected String directions = DIRECTIONS_EDEFAULT;
	/**
	 * The default value of the '{@link #getHouseNumber() <em>House Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseNumber()
	 * @generated
	 * @ordered
	 */
	protected static final long HOUSE_NUMBER_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getHouseNumber() <em>House Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseNumber()
	 * @generated
	 * @ordered
	 */
	protected long houseNumber = HOUSE_NUMBER_EDEFAULT;
	/**
	 * The default value of the '{@link #getHouseNumberExt() <em>House Number Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseNumberExt()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSE_NUMBER_EXT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getHouseNumberExt() <em>House Number Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseNumberExt()
	 * @generated
	 * @ordered
	 */
	protected String houseNumberExt = HOUSE_NUMBER_EXT_EDEFAULT;
	/**
	 * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTAL_CODE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected String postalCode = POSTAL_CODE_EDEFAULT;
	/**
	 * The default value of the '{@link #getPostalCodeExt() <em>Postal Code Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCodeExt()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTAL_CODE_EXT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPostalCodeExt() <em>Postal Code Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCodeExt()
	 * @generated
	 * @ordered
	 */
	protected String postalCodeExt = POSTAL_CODE_EXT_EDEFAULT;
	/**
	 * The default value of the '{@link #getToName() <em>To Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToName()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getToName() <em>To Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToName()
	 * @generated
	 * @ordered
	 */
	protected String toName = TO_NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getCountryGeoId() <em>Country Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryGeoId()
	 * @generated
	 * @ordered
	 */
	protected Geo countryGeoId;
	/**
	 * The cached value of the '{@link #getStateProvinceGeoId() <em>State Province Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateProvinceGeoId()
	 * @generated
	 * @ordered
	 */
	protected Geo stateProvinceGeoId;
	/**
	 * The cached value of the '{@link #getCountyGeoId() <em>County Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountyGeoId()
	 * @generated
	 * @ordered
	 */
	protected Geo countyGeoId;
	/**
	 * The cached value of the '{@link #getMunicipalityGeoId() <em>Municipality Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMunicipalityGeoId()
	 * @generated
	 * @ordered
	 */
	protected Geo municipalityGeoId;
	/**
	 * The cached value of the '{@link #getCityGeoId() <em>City Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCityGeoId()
	 * @generated
	 * @ordered
	 */
	protected Geo cityGeoId;
	/**
	 * The cached value of the '{@link #getPostalCodeGeoId() <em>Postal Code Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCodeGeoId()
	 * @generated
	 * @ordered
	 */
	protected Geo postalCodeGeoId;
	/**
	 * The cached value of the '{@link #getGeoPointId() <em>Geo Point Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoPointId()
	 * @generated
	 * @ordered
	 */
	protected GeoPoint geoPointId;

	/**
	 * The cached value of the '{@link #getPostalAddressBoundaries() <em>Postal Address Boundaries</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalAddressBoundaries()
	 * @generated
	 * @ordered
	 */
	protected EList<String> postalAddressBoundaries;

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
		return address1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress1(String newAddress1) {
		String oldAddress1 = address1;
		address1 = newAddress1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.POSTAL_ADDRESS__ADDRESS1, oldAddress1, address1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress2() {
		return address2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress2(String newAddress2) {
		String oldAddress2 = address2;
		address2 = newAddress2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.POSTAL_ADDRESS__ADDRESS2, oldAddress2, address2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttnName() {
		return attnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttnName(String newAttnName) {
		String oldAttnName = attnName;
		attnName = newAttnName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.POSTAL_ADDRESS__ATTN_NAME, oldAttnName, attnName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.POSTAL_ADDRESS__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getCityGeoId() {
		if (cityGeoId != null && ((EObject)cityGeoId).eIsProxy()) {
			InternalEObject oldCityGeoId = (InternalEObject)cityGeoId;
			cityGeoId = (Geo)eResolveProxy(oldCityGeoId);
			if (cityGeoId != oldCityGeoId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContactPackage.POSTAL_ADDRESS__CITY_GEO_ID, oldCityGeoId, cityGeoId));
			}
		}
		return cityGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geo basicGetCityGeoId() {
		return cityGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCityGeoId(Geo newCityGeoId) {
		Geo oldCityGeoId = cityGeoId;
		cityGeoId = newCityGeoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.POSTAL_ADDRESS__CITY_GEO_ID, oldCityGeoId, cityGeoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getCountryGeoId() {
		if (countryGeoId != null && ((EObject)countryGeoId).eIsProxy()) {
			InternalEObject oldCountryGeoId = (InternalEObject)countryGeoId;
			countryGeoId = (Geo)eResolveProxy(oldCountryGeoId);
			if (countryGeoId != oldCountryGeoId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContactPackage.POSTAL_ADDRESS__COUNTRY_GEO_ID, oldCountryGeoId, countryGeoId));
			}
		}
		return countryGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geo basicGetCountryGeoId() {
		return countryGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountryGeoId(Geo newCountryGeoId) {
		Geo oldCountryGeoId = countryGeoId;
		countryGeoId = newCountryGeoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.POSTAL_ADDRESS__COUNTRY_GEO_ID, oldCountryGeoId, countryGeoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getCountyGeoId() {
		if (countyGeoId != null && ((EObject)countyGeoId).eIsProxy()) {
			InternalEObject oldCountyGeoId = (InternalEObject)countyGeoId;
			countyGeoId = (Geo)eResolveProxy(oldCountyGeoId);
			if (countyGeoId != oldCountyGeoId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContactPackage.POSTAL_ADDRESS__COUNTY_GEO_ID, oldCountyGeoId, countyGeoId));
			}
		}
		return countyGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geo basicGetCountyGeoId() {
		return countyGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountyGeoId(Geo newCountyGeoId) {
		Geo oldCountyGeoId = countyGeoId;
		countyGeoId = newCountyGeoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.POSTAL_ADDRESS__COUNTY_GEO_ID, oldCountyGeoId, countyGeoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDirections() {
		return directions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirections(String newDirections) {
		String oldDirections = directions;
		directions = newDirections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.POSTAL_ADDRESS__DIRECTIONS, oldDirections, directions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoPoint getGeoPointId() {
		if (geoPointId != null && ((EObject)geoPointId).eIsProxy()) {
			InternalEObject oldGeoPointId = (InternalEObject)geoPointId;
			geoPointId = (GeoPoint)eResolveProxy(oldGeoPointId);
			if (geoPointId != oldGeoPointId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContactPackage.POSTAL_ADDRESS__GEO_POINT_ID, oldGeoPointId, geoPointId));
			}
		}
		return geoPointId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoPoint basicGetGeoPointId() {
		return geoPointId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoPointId(GeoPoint newGeoPointId) {
		GeoPoint oldGeoPointId = geoPointId;
		geoPointId = newGeoPointId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.POSTAL_ADDRESS__GEO_POINT_ID, oldGeoPointId, geoPointId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getHouseNumber() {
		return houseNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHouseNumber(long newHouseNumber) {
		long oldHouseNumber = houseNumber;
		houseNumber = newHouseNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.POSTAL_ADDRESS__HOUSE_NUMBER, oldHouseNumber, houseNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHouseNumberExt() {
		return houseNumberExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHouseNumberExt(String newHouseNumberExt) {
		String oldHouseNumberExt = houseNumberExt;
		houseNumberExt = newHouseNumberExt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.POSTAL_ADDRESS__HOUSE_NUMBER_EXT, oldHouseNumberExt, houseNumberExt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getMunicipalityGeoId() {
		if (municipalityGeoId != null && ((EObject)municipalityGeoId).eIsProxy()) {
			InternalEObject oldMunicipalityGeoId = (InternalEObject)municipalityGeoId;
			municipalityGeoId = (Geo)eResolveProxy(oldMunicipalityGeoId);
			if (municipalityGeoId != oldMunicipalityGeoId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContactPackage.POSTAL_ADDRESS__MUNICIPALITY_GEO_ID, oldMunicipalityGeoId, municipalityGeoId));
			}
		}
		return municipalityGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geo basicGetMunicipalityGeoId() {
		return municipalityGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMunicipalityGeoId(Geo newMunicipalityGeoId) {
		Geo oldMunicipalityGeoId = municipalityGeoId;
		municipalityGeoId = newMunicipalityGeoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.POSTAL_ADDRESS__MUNICIPALITY_GEO_ID, oldMunicipalityGeoId, municipalityGeoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostalCode(String newPostalCode) {
		String oldPostalCode = postalCode;
		postalCode = newPostalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.POSTAL_ADDRESS__POSTAL_CODE, oldPostalCode, postalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostalCodeExt() {
		return postalCodeExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostalCodeExt(String newPostalCodeExt) {
		String oldPostalCodeExt = postalCodeExt;
		postalCodeExt = newPostalCodeExt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.POSTAL_ADDRESS__POSTAL_CODE_EXT, oldPostalCodeExt, postalCodeExt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getPostalCodeGeoId() {
		if (postalCodeGeoId != null && ((EObject)postalCodeGeoId).eIsProxy()) {
			InternalEObject oldPostalCodeGeoId = (InternalEObject)postalCodeGeoId;
			postalCodeGeoId = (Geo)eResolveProxy(oldPostalCodeGeoId);
			if (postalCodeGeoId != oldPostalCodeGeoId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContactPackage.POSTAL_ADDRESS__POSTAL_CODE_GEO_ID, oldPostalCodeGeoId, postalCodeGeoId));
			}
		}
		return postalCodeGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geo basicGetPostalCodeGeoId() {
		return postalCodeGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostalCodeGeoId(Geo newPostalCodeGeoId) {
		Geo oldPostalCodeGeoId = postalCodeGeoId;
		postalCodeGeoId = newPostalCodeGeoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.POSTAL_ADDRESS__POSTAL_CODE_GEO_ID, oldPostalCodeGeoId, postalCodeGeoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getStateProvinceGeoId() {
		if (stateProvinceGeoId != null && ((EObject)stateProvinceGeoId).eIsProxy()) {
			InternalEObject oldStateProvinceGeoId = (InternalEObject)stateProvinceGeoId;
			stateProvinceGeoId = (Geo)eResolveProxy(oldStateProvinceGeoId);
			if (stateProvinceGeoId != oldStateProvinceGeoId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContactPackage.POSTAL_ADDRESS__STATE_PROVINCE_GEO_ID, oldStateProvinceGeoId, stateProvinceGeoId));
			}
		}
		return stateProvinceGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geo basicGetStateProvinceGeoId() {
		return stateProvinceGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateProvinceGeoId(Geo newStateProvinceGeoId) {
		Geo oldStateProvinceGeoId = stateProvinceGeoId;
		stateProvinceGeoId = newStateProvinceGeoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.POSTAL_ADDRESS__STATE_PROVINCE_GEO_ID, oldStateProvinceGeoId, stateProvinceGeoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToName() {
		return toName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToName(String newToName) {
		String oldToName = toName;
		toName = newToName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.POSTAL_ADDRESS__TO_NAME, oldToName, toName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getPostalAddressBoundaries() {
		if (postalAddressBoundaries == null) {
			postalAddressBoundaries = new EDataTypeUniqueEList<String>(String.class, this, ContactPackage.POSTAL_ADDRESS__POSTAL_ADDRESS_BOUNDARIES);
		}
		return postalAddressBoundaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> destinationShipments() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContactPackage.POSTAL_ADDRESS__ADDRESS1:
				return getAddress1();
			case ContactPackage.POSTAL_ADDRESS__ADDRESS2:
				return getAddress2();
			case ContactPackage.POSTAL_ADDRESS__ATTN_NAME:
				return getAttnName();
			case ContactPackage.POSTAL_ADDRESS__CITY:
				return getCity();
			case ContactPackage.POSTAL_ADDRESS__DIRECTIONS:
				return getDirections();
			case ContactPackage.POSTAL_ADDRESS__HOUSE_NUMBER:
				return getHouseNumber();
			case ContactPackage.POSTAL_ADDRESS__HOUSE_NUMBER_EXT:
				return getHouseNumberExt();
			case ContactPackage.POSTAL_ADDRESS__POSTAL_CODE:
				return getPostalCode();
			case ContactPackage.POSTAL_ADDRESS__POSTAL_CODE_EXT:
				return getPostalCodeExt();
			case ContactPackage.POSTAL_ADDRESS__TO_NAME:
				return getToName();
			case ContactPackage.POSTAL_ADDRESS__COUNTRY_GEO_ID:
				if (resolve) return getCountryGeoId();
				return basicGetCountryGeoId();
			case ContactPackage.POSTAL_ADDRESS__STATE_PROVINCE_GEO_ID:
				if (resolve) return getStateProvinceGeoId();
				return basicGetStateProvinceGeoId();
			case ContactPackage.POSTAL_ADDRESS__COUNTY_GEO_ID:
				if (resolve) return getCountyGeoId();
				return basicGetCountyGeoId();
			case ContactPackage.POSTAL_ADDRESS__MUNICIPALITY_GEO_ID:
				if (resolve) return getMunicipalityGeoId();
				return basicGetMunicipalityGeoId();
			case ContactPackage.POSTAL_ADDRESS__CITY_GEO_ID:
				if (resolve) return getCityGeoId();
				return basicGetCityGeoId();
			case ContactPackage.POSTAL_ADDRESS__POSTAL_CODE_GEO_ID:
				if (resolve) return getPostalCodeGeoId();
				return basicGetPostalCodeGeoId();
			case ContactPackage.POSTAL_ADDRESS__GEO_POINT_ID:
				if (resolve) return getGeoPointId();
				return basicGetGeoPointId();
			case ContactPackage.POSTAL_ADDRESS__POSTAL_ADDRESS_BOUNDARIES:
				return getPostalAddressBoundaries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContactPackage.POSTAL_ADDRESS__ADDRESS1:
				setAddress1((String)newValue);
				return;
			case ContactPackage.POSTAL_ADDRESS__ADDRESS2:
				setAddress2((String)newValue);
				return;
			case ContactPackage.POSTAL_ADDRESS__ATTN_NAME:
				setAttnName((String)newValue);
				return;
			case ContactPackage.POSTAL_ADDRESS__CITY:
				setCity((String)newValue);
				return;
			case ContactPackage.POSTAL_ADDRESS__DIRECTIONS:
				setDirections((String)newValue);
				return;
			case ContactPackage.POSTAL_ADDRESS__HOUSE_NUMBER:
				setHouseNumber((Long)newValue);
				return;
			case ContactPackage.POSTAL_ADDRESS__HOUSE_NUMBER_EXT:
				setHouseNumberExt((String)newValue);
				return;
			case ContactPackage.POSTAL_ADDRESS__POSTAL_CODE:
				setPostalCode((String)newValue);
				return;
			case ContactPackage.POSTAL_ADDRESS__POSTAL_CODE_EXT:
				setPostalCodeExt((String)newValue);
				return;
			case ContactPackage.POSTAL_ADDRESS__TO_NAME:
				setToName((String)newValue);
				return;
			case ContactPackage.POSTAL_ADDRESS__COUNTRY_GEO_ID:
				setCountryGeoId((Geo)newValue);
				return;
			case ContactPackage.POSTAL_ADDRESS__STATE_PROVINCE_GEO_ID:
				setStateProvinceGeoId((Geo)newValue);
				return;
			case ContactPackage.POSTAL_ADDRESS__COUNTY_GEO_ID:
				setCountyGeoId((Geo)newValue);
				return;
			case ContactPackage.POSTAL_ADDRESS__MUNICIPALITY_GEO_ID:
				setMunicipalityGeoId((Geo)newValue);
				return;
			case ContactPackage.POSTAL_ADDRESS__CITY_GEO_ID:
				setCityGeoId((Geo)newValue);
				return;
			case ContactPackage.POSTAL_ADDRESS__POSTAL_CODE_GEO_ID:
				setPostalCodeGeoId((Geo)newValue);
				return;
			case ContactPackage.POSTAL_ADDRESS__GEO_POINT_ID:
				setGeoPointId((GeoPoint)newValue);
				return;
			case ContactPackage.POSTAL_ADDRESS__POSTAL_ADDRESS_BOUNDARIES:
				getPostalAddressBoundaries().clear();
				getPostalAddressBoundaries().addAll((Collection<? extends String>)newValue);
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
			case ContactPackage.POSTAL_ADDRESS__ADDRESS1:
				setAddress1(ADDRESS1_EDEFAULT);
				return;
			case ContactPackage.POSTAL_ADDRESS__ADDRESS2:
				setAddress2(ADDRESS2_EDEFAULT);
				return;
			case ContactPackage.POSTAL_ADDRESS__ATTN_NAME:
				setAttnName(ATTN_NAME_EDEFAULT);
				return;
			case ContactPackage.POSTAL_ADDRESS__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case ContactPackage.POSTAL_ADDRESS__DIRECTIONS:
				setDirections(DIRECTIONS_EDEFAULT);
				return;
			case ContactPackage.POSTAL_ADDRESS__HOUSE_NUMBER:
				setHouseNumber(HOUSE_NUMBER_EDEFAULT);
				return;
			case ContactPackage.POSTAL_ADDRESS__HOUSE_NUMBER_EXT:
				setHouseNumberExt(HOUSE_NUMBER_EXT_EDEFAULT);
				return;
			case ContactPackage.POSTAL_ADDRESS__POSTAL_CODE:
				setPostalCode(POSTAL_CODE_EDEFAULT);
				return;
			case ContactPackage.POSTAL_ADDRESS__POSTAL_CODE_EXT:
				setPostalCodeExt(POSTAL_CODE_EXT_EDEFAULT);
				return;
			case ContactPackage.POSTAL_ADDRESS__TO_NAME:
				setToName(TO_NAME_EDEFAULT);
				return;
			case ContactPackage.POSTAL_ADDRESS__COUNTRY_GEO_ID:
				setCountryGeoId((Geo)null);
				return;
			case ContactPackage.POSTAL_ADDRESS__STATE_PROVINCE_GEO_ID:
				setStateProvinceGeoId((Geo)null);
				return;
			case ContactPackage.POSTAL_ADDRESS__COUNTY_GEO_ID:
				setCountyGeoId((Geo)null);
				return;
			case ContactPackage.POSTAL_ADDRESS__MUNICIPALITY_GEO_ID:
				setMunicipalityGeoId((Geo)null);
				return;
			case ContactPackage.POSTAL_ADDRESS__CITY_GEO_ID:
				setCityGeoId((Geo)null);
				return;
			case ContactPackage.POSTAL_ADDRESS__POSTAL_CODE_GEO_ID:
				setPostalCodeGeoId((Geo)null);
				return;
			case ContactPackage.POSTAL_ADDRESS__GEO_POINT_ID:
				setGeoPointId((GeoPoint)null);
				return;
			case ContactPackage.POSTAL_ADDRESS__POSTAL_ADDRESS_BOUNDARIES:
				getPostalAddressBoundaries().clear();
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
			case ContactPackage.POSTAL_ADDRESS__ADDRESS1:
				return ADDRESS1_EDEFAULT == null ? address1 != null : !ADDRESS1_EDEFAULT.equals(address1);
			case ContactPackage.POSTAL_ADDRESS__ADDRESS2:
				return ADDRESS2_EDEFAULT == null ? address2 != null : !ADDRESS2_EDEFAULT.equals(address2);
			case ContactPackage.POSTAL_ADDRESS__ATTN_NAME:
				return ATTN_NAME_EDEFAULT == null ? attnName != null : !ATTN_NAME_EDEFAULT.equals(attnName);
			case ContactPackage.POSTAL_ADDRESS__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case ContactPackage.POSTAL_ADDRESS__DIRECTIONS:
				return DIRECTIONS_EDEFAULT == null ? directions != null : !DIRECTIONS_EDEFAULT.equals(directions);
			case ContactPackage.POSTAL_ADDRESS__HOUSE_NUMBER:
				return houseNumber != HOUSE_NUMBER_EDEFAULT;
			case ContactPackage.POSTAL_ADDRESS__HOUSE_NUMBER_EXT:
				return HOUSE_NUMBER_EXT_EDEFAULT == null ? houseNumberExt != null : !HOUSE_NUMBER_EXT_EDEFAULT.equals(houseNumberExt);
			case ContactPackage.POSTAL_ADDRESS__POSTAL_CODE:
				return POSTAL_CODE_EDEFAULT == null ? postalCode != null : !POSTAL_CODE_EDEFAULT.equals(postalCode);
			case ContactPackage.POSTAL_ADDRESS__POSTAL_CODE_EXT:
				return POSTAL_CODE_EXT_EDEFAULT == null ? postalCodeExt != null : !POSTAL_CODE_EXT_EDEFAULT.equals(postalCodeExt);
			case ContactPackage.POSTAL_ADDRESS__TO_NAME:
				return TO_NAME_EDEFAULT == null ? toName != null : !TO_NAME_EDEFAULT.equals(toName);
			case ContactPackage.POSTAL_ADDRESS__COUNTRY_GEO_ID:
				return countryGeoId != null;
			case ContactPackage.POSTAL_ADDRESS__STATE_PROVINCE_GEO_ID:
				return stateProvinceGeoId != null;
			case ContactPackage.POSTAL_ADDRESS__COUNTY_GEO_ID:
				return countyGeoId != null;
			case ContactPackage.POSTAL_ADDRESS__MUNICIPALITY_GEO_ID:
				return municipalityGeoId != null;
			case ContactPackage.POSTAL_ADDRESS__CITY_GEO_ID:
				return cityGeoId != null;
			case ContactPackage.POSTAL_ADDRESS__POSTAL_CODE_GEO_ID:
				return postalCodeGeoId != null;
			case ContactPackage.POSTAL_ADDRESS__GEO_POINT_ID:
				return geoPointId != null;
			case ContactPackage.POSTAL_ADDRESS__POSTAL_ADDRESS_BOUNDARIES:
				return postalAddressBoundaries != null && !postalAddressBoundaries.isEmpty();
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
		result.append(" (address1: ");
		result.append(address1);
		result.append(", address2: ");
		result.append(address2);
		result.append(", attnName: ");
		result.append(attnName);
		result.append(", city: ");
		result.append(city);
		result.append(", directions: ");
		result.append(directions);
		result.append(", houseNumber: ");
		result.append(houseNumber);
		result.append(", houseNumberExt: ");
		result.append(houseNumberExt);
		result.append(", postalCode: ");
		result.append(postalCode);
		result.append(", postalCodeExt: ");
		result.append(postalCodeExt);
		result.append(", toName: ");
		result.append(toName);
		result.append(", postalAddressBoundaries: ");
		result.append(postalAddressBoundaries);
		result.append(')');
		return result.toString();
	}

} //PostalAddressImpl
