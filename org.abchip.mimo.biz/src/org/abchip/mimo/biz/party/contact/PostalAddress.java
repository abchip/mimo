/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact;

import java.util.List;
import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.common.geo.GeoPoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postal Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PostalAddress#getAddress1 <em>Address1</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PostalAddress#getAddress2 <em>Address2</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PostalAddress#getAttnName <em>Attn Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PostalAddress#getCity <em>City</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PostalAddress#getCityGeoId <em>City Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PostalAddress#getCountryGeoId <em>Country Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PostalAddress#getCountyGeoId <em>County Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PostalAddress#getDirections <em>Directions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PostalAddress#getGeoPointId <em>Geo Point Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PostalAddress#getHouseNumber <em>House Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PostalAddress#getHouseNumberExt <em>House Number Ext</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PostalAddress#getMunicipalityGeoId <em>Municipality Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PostalAddress#getPostalAddressBoundaries <em>Postal Address Boundaries</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PostalAddress#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PostalAddress#getPostalCodeExt <em>Postal Code Ext</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PostalAddress#getPostalCodeGeoId <em>Postal Code Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PostalAddress#getStateProvinceGeoId <em>State Province Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.contact.PostalAddress#getToName <em>To Name</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPostalAddress()
 * @model
 * @generated
 */
public interface PostalAddress extends ContactMech {
	/**
	 * Returns the value of the '<em><b>Address1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address1</em>' attribute.
	 * @see #setAddress1(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPostalAddress_Address1()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAddress1();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getAddress1 <em>Address1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address1</em>' attribute.
	 * @see #getAddress1()
	 * @generated
	 */
	void setAddress1(String value);

	/**
	 * Returns the value of the '<em><b>Address2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address2</em>' attribute.
	 * @see #setAddress2(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPostalAddress_Address2()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAddress2();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getAddress2 <em>Address2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address2</em>' attribute.
	 * @see #getAddress2()
	 * @generated
	 */
	void setAddress2(String value);

	/**
	 * Returns the value of the '<em><b>Attn Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attn Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attn Name</em>' attribute.
	 * @see #setAttnName(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPostalAddress_AttnName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getAttnName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getAttnName <em>Attn Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attn Name</em>' attribute.
	 * @see #getAttnName()
	 * @generated
	 */
	void setAttnName(String value);

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
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPostalAddress_City()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>City Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City Geo Id</em>' reference.
	 * @see #setCityGeoId(Geo)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPostalAddress_CityGeoId()
	 * @model keys="geoId"
	 * @generated
	 */
	Geo getCityGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getCityGeoId <em>City Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City Geo Id</em>' reference.
	 * @see #getCityGeoId()
	 * @generated
	 */
	void setCityGeoId(Geo value);

	/**
	 * Returns the value of the '<em><b>Country Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Geo Id</em>' reference.
	 * @see #setCountryGeoId(Geo)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPostalAddress_CountryGeoId()
	 * @model keys="geoId"
	 * @generated
	 */
	Geo getCountryGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getCountryGeoId <em>Country Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Geo Id</em>' reference.
	 * @see #getCountryGeoId()
	 * @generated
	 */
	void setCountryGeoId(Geo value);

	/**
	 * Returns the value of the '<em><b>County Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>County Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>County Geo Id</em>' reference.
	 * @see #setCountyGeoId(Geo)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPostalAddress_CountyGeoId()
	 * @model keys="geoId"
	 * @generated
	 */
	Geo getCountyGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getCountyGeoId <em>County Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>County Geo Id</em>' reference.
	 * @see #getCountyGeoId()
	 * @generated
	 */
	void setCountyGeoId(Geo value);

	/**
	 * Returns the value of the '<em><b>Directions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directions</em>' attribute.
	 * @see #setDirections(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPostalAddress_Directions()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getDirections();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getDirections <em>Directions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directions</em>' attribute.
	 * @see #getDirections()
	 * @generated
	 */
	void setDirections(String value);

	/**
	 * Returns the value of the '<em><b>Geo Point Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Point Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Point Id</em>' reference.
	 * @see #setGeoPointId(GeoPoint)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPostalAddress_GeoPointId()
	 * @model keys="geoPointId"
	 * @generated
	 */
	GeoPoint getGeoPointId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getGeoPointId <em>Geo Point Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Point Id</em>' reference.
	 * @see #getGeoPointId()
	 * @generated
	 */
	void setGeoPointId(GeoPoint value);

	/**
	 * Returns the value of the '<em><b>House Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>House Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House Number</em>' attribute.
	 * @see #setHouseNumber(long)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPostalAddress_HouseNumber()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getHouseNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getHouseNumber <em>House Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>House Number</em>' attribute.
	 * @see #getHouseNumber()
	 * @generated
	 */
	void setHouseNumber(long value);

	/**
	 * Returns the value of the '<em><b>House Number Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>House Number Ext</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House Number Ext</em>' attribute.
	 * @see #setHouseNumberExt(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPostalAddress_HouseNumberExt()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getHouseNumberExt();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getHouseNumberExt <em>House Number Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>House Number Ext</em>' attribute.
	 * @see #getHouseNumberExt()
	 * @generated
	 */
	void setHouseNumberExt(String value);

	/**
	 * Returns the value of the '<em><b>Municipality Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Municipality Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Municipality Geo Id</em>' reference.
	 * @see #setMunicipalityGeoId(Geo)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPostalAddress_MunicipalityGeoId()
	 * @model keys="geoId"
	 * @generated
	 */
	Geo getMunicipalityGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getMunicipalityGeoId <em>Municipality Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Municipality Geo Id</em>' reference.
	 * @see #getMunicipalityGeoId()
	 * @generated
	 */
	void setMunicipalityGeoId(Geo value);

	/**
	 * Returns the value of the '<em><b>Postal Address Boundaries</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.party.contact.PostalAddressBoundary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Address Boundaries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Address Boundaries</em>' reference list.
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPostalAddress_PostalAddressBoundaries()
	 * @model derived="true"
	 * @generated
	 */
	List<PostalAddressBoundary> getPostalAddressBoundaries();

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #setPostalCode(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPostalAddress_PostalCode()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getPostalCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' attribute.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(String value);

	/**
	 * Returns the value of the '<em><b>Postal Code Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Code Ext</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code Ext</em>' attribute.
	 * @see #setPostalCodeExt(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPostalAddress_PostalCodeExt()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getPostalCodeExt();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getPostalCodeExt <em>Postal Code Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code Ext</em>' attribute.
	 * @see #getPostalCodeExt()
	 * @generated
	 */
	void setPostalCodeExt(String value);

	/**
	 * Returns the value of the '<em><b>Postal Code Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postal Code Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code Geo Id</em>' reference.
	 * @see #setPostalCodeGeoId(Geo)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPostalAddress_PostalCodeGeoId()
	 * @model keys="geoId"
	 * @generated
	 */
	Geo getPostalCodeGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getPostalCodeGeoId <em>Postal Code Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code Geo Id</em>' reference.
	 * @see #getPostalCodeGeoId()
	 * @generated
	 */
	void setPostalCodeGeoId(Geo value);

	/**
	 * Returns the value of the '<em><b>State Province Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Province Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Province Geo Id</em>' reference.
	 * @see #setStateProvinceGeoId(Geo)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPostalAddress_StateProvinceGeoId()
	 * @model keys="geoId"
	 * @generated
	 */
	Geo getStateProvinceGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getStateProvinceGeoId <em>State Province Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Province Geo Id</em>' reference.
	 * @see #getStateProvinceGeoId()
	 * @generated
	 */
	void setStateProvinceGeoId(Geo value);

	/**
	 * Returns the value of the '<em><b>To Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Name</em>' attribute.
	 * @see #setToName(String)
	 * @see org.abchip.mimo.biz.party.contact.ContactPackage#getPostalAddress_ToName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getToName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getToName <em>To Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Name</em>' attribute.
	 * @see #getToName()
	 * @generated
	 */
	void setToName(String value);

} // PostalAddress
