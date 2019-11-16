/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.geo.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.common.geo.GeoPackage;
import org.abchip.mimo.biz.common.geo.GeoType;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.GeoImpl#getGeoId <em>Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.GeoImpl#getAbbreviation <em>Abbreviation</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.GeoImpl#getGeoCode <em>Geo Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.GeoImpl#getGeoName <em>Geo Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.GeoImpl#getGeoSecCode <em>Geo Sec Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.GeoImpl#getWellKnownText <em>Well Known Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.GeoImpl#getGeoTypeId <em>Geo Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.GeoImpl#getMainGeoAssocs <em>Main Geo Assocs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.GeoImpl#getTaxAuthTaxAuthorities <em>Tax Auth Tax Authorities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeoImpl extends BizEntityTypedImpl<GeoType> implements Geo {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeoPackage.Literals.GEO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbbreviation() {
		return (String)eGet(GeoPackage.Literals.GEO__ABBREVIATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbbreviation(String newAbbreviation) {
		eSet(GeoPackage.Literals.GEO__ABBREVIATION, newAbbreviation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeoCode() {
		return (String)eGet(GeoPackage.Literals.GEO__GEO_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoCode(String newGeoCode) {
		eSet(GeoPackage.Literals.GEO__GEO_CODE, newGeoCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeoName() {
		return (String)eGet(GeoPackage.Literals.GEO__GEO_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoName(String newGeoName) {
		eSet(GeoPackage.Literals.GEO__GEO_NAME, newGeoName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeoSecCode() {
		return (String)eGet(GeoPackage.Literals.GEO__GEO_SEC_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoSecCode(String newGeoSecCode) {
		eSet(GeoPackage.Literals.GEO__GEO_SEC_CODE, newGeoSecCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWellKnownText() {
		return (String)eGet(GeoPackage.Literals.GEO__WELL_KNOWN_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWellKnownText(String newWellKnownText) {
		eSet(GeoPackage.Literals.GEO__WELL_KNOWN_TEXT, newWellKnownText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getMainGeoAssocs() {
		return (List<String>)eGet(GeoPackage.Literals.GEO__MAIN_GEO_ASSOCS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getTaxAuthTaxAuthorities() {
		return (List<String>)eGet(GeoPackage.Literals.GEO__TAX_AUTH_TAX_AUTHORITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> assocGeoAssocs() {
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
	public List<String> cityPostalAddresses() {
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
	public List<String> costComponents() {
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
	public List<String> countryPostalAddresses() {
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
	public List<String> countyPostalAddresses() {
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
	public List<String> excludeProductStoreShipmentMeths() {
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
	public List<String> fromShipmentCostEstimates() {
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
	public List<String> includeProductStoreShipmentMeths() {
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
	public List<String> municipalityPostalAddresses() {
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
	public List<String> originProducts() {
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
	public List<String> paymentApplications() {
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
	public List<String> postalAddressBoundaries() {
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
	public List<String> postalCodePostalAddresses() {
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
	public List<String> primaryOrderAdjustments() {
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
	public List<String> primaryQuoteAdjustments() {
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
	public List<String> primaryReturnAdjustments() {
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
	public List<String> productGeos() {
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
	public List<String> reorderGuidelines() {
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
	public List<String> secondaryOrderAdjustments() {
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
	public List<String> secondaryQuoteAdjustments() {
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
	public List<String> secondaryReturnAdjustments() {
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
	public List<String> segmentGroupGeos() {
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
	public List<String> stateProvincePostalAddresses() {
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
	public List<String> surveyQuestions() {
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
	public List<String> taxInvoiceItems() {
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
	public List<String> toShipmentCostEstimates() {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GeoPackage.GEO___ASSOC_GEO_ASSOCS:
				return assocGeoAssocs();
			case GeoPackage.GEO___CITY_POSTAL_ADDRESSES:
				return cityPostalAddresses();
			case GeoPackage.GEO___COST_COMPONENTS:
				return costComponents();
			case GeoPackage.GEO___COUNTRY_POSTAL_ADDRESSES:
				return countryPostalAddresses();
			case GeoPackage.GEO___COUNTY_POSTAL_ADDRESSES:
				return countyPostalAddresses();
			case GeoPackage.GEO___EXCLUDE_PRODUCT_STORE_SHIPMENT_METHS:
				return excludeProductStoreShipmentMeths();
			case GeoPackage.GEO___FROM_SHIPMENT_COST_ESTIMATES:
				return fromShipmentCostEstimates();
			case GeoPackage.GEO___INCLUDE_PRODUCT_STORE_SHIPMENT_METHS:
				return includeProductStoreShipmentMeths();
			case GeoPackage.GEO___MUNICIPALITY_POSTAL_ADDRESSES:
				return municipalityPostalAddresses();
			case GeoPackage.GEO___ORIGIN_PRODUCTS:
				return originProducts();
			case GeoPackage.GEO___PAYMENT_APPLICATIONS:
				return paymentApplications();
			case GeoPackage.GEO___POSTAL_ADDRESS_BOUNDARIES:
				return postalAddressBoundaries();
			case GeoPackage.GEO___POSTAL_CODE_POSTAL_ADDRESSES:
				return postalCodePostalAddresses();
			case GeoPackage.GEO___PRIMARY_ORDER_ADJUSTMENTS:
				return primaryOrderAdjustments();
			case GeoPackage.GEO___PRIMARY_QUOTE_ADJUSTMENTS:
				return primaryQuoteAdjustments();
			case GeoPackage.GEO___PRIMARY_RETURN_ADJUSTMENTS:
				return primaryReturnAdjustments();
			case GeoPackage.GEO___PRODUCT_GEOS:
				return productGeos();
			case GeoPackage.GEO___REORDER_GUIDELINES:
				return reorderGuidelines();
			case GeoPackage.GEO___SECONDARY_ORDER_ADJUSTMENTS:
				return secondaryOrderAdjustments();
			case GeoPackage.GEO___SECONDARY_QUOTE_ADJUSTMENTS:
				return secondaryQuoteAdjustments();
			case GeoPackage.GEO___SECONDARY_RETURN_ADJUSTMENTS:
				return secondaryReturnAdjustments();
			case GeoPackage.GEO___SEGMENT_GROUP_GEOS:
				return segmentGroupGeos();
			case GeoPackage.GEO___STATE_PROVINCE_POSTAL_ADDRESSES:
				return stateProvincePostalAddresses();
			case GeoPackage.GEO___SURVEY_QUESTIONS:
				return surveyQuestions();
			case GeoPackage.GEO___TAX_INVOICE_ITEMS:
				return taxInvoiceItems();
			case GeoPackage.GEO___TO_SHIPMENT_COST_ESTIMATES:
				return toShipmentCostEstimates();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoType getGeoTypeId() {
		return (GeoType)eGet(GeoPackage.Literals.GEO__GEO_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoTypeId(GeoType newGeoTypeId) {
		eSet(GeoPackage.Literals.GEO__GEO_TYPE_ID, newGeoTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeoId() {
		return (String)eGet(GeoPackage.Literals.GEO__GEO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoId(String newGeoId) {
		eSet(GeoPackage.Literals.GEO__GEO_ID, newGeoId);
	}

} //GeoImpl
