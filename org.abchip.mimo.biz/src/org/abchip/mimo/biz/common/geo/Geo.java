/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.geo;

import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.geo.Geo#getGeoId <em>Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.Geo#getAbbreviation <em>Abbreviation</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.Geo#getGeoCode <em>Geo Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.Geo#getGeoName <em>Geo Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.Geo#getGeoSecCode <em>Geo Sec Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.Geo#getGeoTypeId <em>Geo Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.Geo#getMainGeoAssocs <em>Main Geo Assocs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.Geo#getTaxAuthTaxAuthorities <em>Tax Auth Tax Authorities</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.Geo#getWellKnownText <em>Well Known Text</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getGeo()
 * @model annotation="mimo-ent-frame title='Geographic Boundary' dictionary='CommonEntityLabels'"
 * @generated
 */
public interface Geo extends BizEntityTyped<GeoType> {
	/**
	 * Returns the value of the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abbreviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbreviation</em>' attribute.
	 * @see #setAbbreviation(String)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getGeo_Abbreviation()
	 * @model annotation="mimo-ent-format type='short-varchar' length='60'"
	 * @generated
	 */
	String getAbbreviation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.Geo#getAbbreviation <em>Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbreviation</em>' attribute.
	 * @see #getAbbreviation()
	 * @generated
	 */
	void setAbbreviation(String value);

	/**
	 * Returns the value of the '<em><b>Geo Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Code</em>' attribute.
	 * @see #setGeoCode(String)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getGeo_GeoCode()
	 * @model annotation="mimo-ent-format type='short-varchar' length='60'"
	 * @generated
	 */
	String getGeoCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.Geo#getGeoCode <em>Geo Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Code</em>' attribute.
	 * @see #getGeoCode()
	 * @generated
	 */
	void setGeoCode(String value);

	/**
	 * Returns the value of the '<em><b>Geo Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Name</em>' attribute.
	 * @see #setGeoName(String)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getGeo_GeoName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getGeoName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.Geo#getGeoName <em>Geo Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Name</em>' attribute.
	 * @see #getGeoName()
	 * @generated
	 */
	void setGeoName(String value);

	/**
	 * Returns the value of the '<em><b>Geo Sec Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Sec Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Sec Code</em>' attribute.
	 * @see #setGeoSecCode(String)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getGeo_GeoSecCode()
	 * @model annotation="mimo-ent-format type='short-varchar' length='60'"
	 * @generated
	 */
	String getGeoSecCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.Geo#getGeoSecCode <em>Geo Sec Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Sec Code</em>' attribute.
	 * @see #getGeoSecCode()
	 * @generated
	 */
	void setGeoSecCode(String value);

	/**
	 * Returns the value of the '<em><b>Well Known Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Well Known Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Well Known Text</em>' attribute.
	 * @see #setWellKnownText(String)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getGeo_WellKnownText()
	 * @model annotation="mimo-ent-format type='very-long'"
	 * @generated
	 */
	String getWellKnownText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.Geo#getWellKnownText <em>Well Known Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Well Known Text</em>' attribute.
	 * @see #getWellKnownText()
	 * @generated
	 */
	void setWellKnownText(String value);

	/**
	 * Returns the value of the '<em><b>Main Geo Assocs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Geo Assocs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Geo Assocs</em>' attribute list.
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getGeo_MainGeoAssocs()
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='GeoAssoc'"
	 * @generated
	 */
	List<String> getMainGeoAssocs();

	/**
	 * Returns the value of the '<em><b>Tax Auth Tax Authorities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Auth Tax Authorities</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Auth Tax Authorities</em>' attribute list.
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getGeo_TaxAuthTaxAuthorities()
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='TaxAuthority'"
	 * @generated
	 */
	List<String> getTaxAuthTaxAuthorities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='GeoAssoc' route='geoIdTo'"
	 * @generated
	 */
	List<String> assocGeoAssocs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PostalAddress' route='cityGeoId'"
	 * @generated
	 */
	List<String> cityPostalAddresses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CostComponent' route='geoId'"
	 * @generated
	 */
	List<String> costComponents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PostalAddress' route='countryGeoId'"
	 * @generated
	 */
	List<String> countryPostalAddresses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PostalAddress' route='countyGeoId'"
	 * @generated
	 */
	List<String> countyPostalAddresses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductStoreShipmentMeth' route='excludeGeoId'"
	 * @generated
	 */
	List<String> excludeProductStoreShipmentMeths();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentCostEstimate' route='geoIdFrom'"
	 * @generated
	 */
	List<String> fromShipmentCostEstimates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductStoreShipmentMeth' route='includeGeoId'"
	 * @generated
	 */
	List<String> includeProductStoreShipmentMeths();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PostalAddress' route='municipalityGeoId'"
	 * @generated
	 */
	List<String> municipalityPostalAddresses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Product' route='originGeoId'"
	 * @generated
	 */
	List<String> originProducts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PaymentApplication' route='taxAuthGeoId'"
	 * @generated
	 */
	List<String> paymentApplications();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PostalAddressBoundary' route='geoId'"
	 * @generated
	 */
	List<String> postalAddressBoundaries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PostalAddress' route='postalCodeGeoId'"
	 * @generated
	 */
	List<String> postalCodePostalAddresses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderAdjustment' route='primaryGeoId'"
	 * @generated
	 */
	List<String> primaryOrderAdjustments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='QuoteAdjustment' route='primaryGeoId'"
	 * @generated
	 */
	List<String> primaryQuoteAdjustments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ReturnAdjustment' route='primaryGeoId'"
	 * @generated
	 */
	List<String> primaryReturnAdjustments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductGeo' route='geoId'"
	 * @generated
	 */
	List<String> productGeos();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ReorderGuideline' route='geoId'"
	 * @generated
	 */
	List<String> reorderGuidelines();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderAdjustment' route='secondaryGeoId'"
	 * @generated
	 */
	List<String> secondaryOrderAdjustments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='QuoteAdjustment' route='secondaryGeoId'"
	 * @generated
	 */
	List<String> secondaryQuoteAdjustments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ReturnAdjustment' route='secondaryGeoId'"
	 * @generated
	 */
	List<String> secondaryReturnAdjustments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SegmentGroupGeo' route='geoId'"
	 * @generated
	 */
	List<String> segmentGroupGeos();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PostalAddress' route='stateProvinceGeoId'"
	 * @generated
	 */
	List<String> stateProvincePostalAddresses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SurveyQuestion' route='geoId'"
	 * @generated
	 */
	List<String> surveyQuestions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InvoiceItem' route='taxAuthGeoId'"
	 * @generated
	 */
	List<String> taxInvoiceItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentCostEstimate' route='geoIdTo'"
	 * @generated
	 */
	List<String> toShipmentCostEstimates();

	/**
	 * Returns the value of the '<em><b>Geo Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Type Id</em>' reference.
	 * @see #setGeoTypeId(GeoType)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getGeo_GeoTypeId()
	 * @model keys="geoTypeId"
	 * @generated
	 */
	GeoType getGeoTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.Geo#getGeoTypeId <em>Geo Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Type Id</em>' reference.
	 * @see #getGeoTypeId()
	 * @generated
	 */
	void setGeoTypeId(GeoType value);

	/**
	 * Returns the value of the '<em><b>Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Id</em>' attribute.
	 * @see #setGeoId(String)
	 * @see org.abchip.mimo.biz.common.geo.GeoPackage#getGeo_GeoId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 * @generated
	 */
	String getGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.geo.Geo#getGeoId <em>Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Id</em>' attribute.
	 * @see #getGeoId()
	 * @generated
	 */
	void setGeoId(String value);

} // Geo
