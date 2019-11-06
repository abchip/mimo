/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.geo.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.common.geo.GeoPackage;
import org.abchip.mimo.biz.common.geo.GeoType;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;

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
	 * The default value of the '{@link #getGeoId() <em>Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoId()
	 * @generated
	 * @ordered
	 */
	protected static final String GEO_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGeoId() <em>Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoId()
	 * @generated
	 * @ordered
	 */
	protected String geoId = GEO_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviation()
	 * @generated
	 * @ordered
	 */
	protected static final String ABBREVIATION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviation()
	 * @generated
	 * @ordered
	 */
	protected String abbreviation = ABBREVIATION_EDEFAULT;
	/**
	 * The default value of the '{@link #getGeoCode() <em>Geo Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoCode()
	 * @generated
	 * @ordered
	 */
	protected static final String GEO_CODE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGeoCode() <em>Geo Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoCode()
	 * @generated
	 * @ordered
	 */
	protected String geoCode = GEO_CODE_EDEFAULT;
	/**
	 * The default value of the '{@link #getGeoName() <em>Geo Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoName()
	 * @generated
	 * @ordered
	 */
	protected static final String GEO_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGeoName() <em>Geo Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoName()
	 * @generated
	 * @ordered
	 */
	protected String geoName = GEO_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getGeoSecCode() <em>Geo Sec Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoSecCode()
	 * @generated
	 * @ordered
	 */
	protected static final String GEO_SEC_CODE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGeoSecCode() <em>Geo Sec Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoSecCode()
	 * @generated
	 * @ordered
	 */
	protected String geoSecCode = GEO_SEC_CODE_EDEFAULT;
	/**
	 * The default value of the '{@link #getWellKnownText() <em>Well Known Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWellKnownText()
	 * @generated
	 * @ordered
	 */
	protected static final String WELL_KNOWN_TEXT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getWellKnownText() <em>Well Known Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWellKnownText()
	 * @generated
	 * @ordered
	 */
	protected String wellKnownText = WELL_KNOWN_TEXT_EDEFAULT;
	/**
	 * The cached value of the '{@link #getGeoTypeId() <em>Geo Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoTypeId()
	 * @generated
	 * @ordered
	 */
	protected GeoType geoTypeId;

	/**
	 * The cached value of the '{@link #getMainGeoAssocs() <em>Main Geo Assocs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainGeoAssocs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> mainGeoAssocs;
	/**
	 * The cached value of the '{@link #getTaxAuthTaxAuthorities() <em>Tax Auth Tax Authorities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthTaxAuthorities()
	 * @generated
	 * @ordered
	 */
	protected EList<String> taxAuthTaxAuthorities;

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
		return abbreviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbbreviation(String newAbbreviation) {
		abbreviation = newAbbreviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeoCode() {
		return geoCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoCode(String newGeoCode) {
		geoCode = newGeoCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeoName() {
		return geoName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoName(String newGeoName) {
		geoName = newGeoName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeoSecCode() {
		return geoSecCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoSecCode(String newGeoSecCode) {
		geoSecCode = newGeoSecCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWellKnownText() {
		return wellKnownText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWellKnownText(String newWellKnownText) {
		wellKnownText = newWellKnownText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getMainGeoAssocs() {
		if (mainGeoAssocs == null) {
			mainGeoAssocs = new BasicInternalEList<String>(String.class);
		}
		return mainGeoAssocs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getTaxAuthTaxAuthorities() {
		if (taxAuthTaxAuthorities == null) {
			taxAuthTaxAuthorities = new BasicInternalEList<String>(String.class);
		}
		return taxAuthTaxAuthorities;
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
	public GeoType getGeoTypeId() {
		if (geoTypeId != null && ((EObject)geoTypeId).eIsProxy()) {
			InternalEObject oldGeoTypeId = (InternalEObject)geoTypeId;
			geoTypeId = (GeoType)eResolveProxy(oldGeoTypeId);
			if (geoTypeId != oldGeoTypeId) {
			}
		}
		return geoTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoType basicGetGeoTypeId() {
		return geoTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoTypeId(GeoType newGeoTypeId) {
		geoTypeId = newGeoTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeoId() {
		return geoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoId(String newGeoId) {
		geoId = newGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeoPackage.GEO__GEO_ID:
				return getGeoId();
			case GeoPackage.GEO__ABBREVIATION:
				return getAbbreviation();
			case GeoPackage.GEO__GEO_CODE:
				return getGeoCode();
			case GeoPackage.GEO__GEO_NAME:
				return getGeoName();
			case GeoPackage.GEO__GEO_SEC_CODE:
				return getGeoSecCode();
			case GeoPackage.GEO__WELL_KNOWN_TEXT:
				return getWellKnownText();
			case GeoPackage.GEO__GEO_TYPE_ID:
				if (resolve) return getGeoTypeId();
				return basicGetGeoTypeId();
			case GeoPackage.GEO__MAIN_GEO_ASSOCS:
				return getMainGeoAssocs();
			case GeoPackage.GEO__TAX_AUTH_TAX_AUTHORITIES:
				return getTaxAuthTaxAuthorities();
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
			case GeoPackage.GEO__GEO_ID:
				setGeoId((String)newValue);
				return;
			case GeoPackage.GEO__ABBREVIATION:
				setAbbreviation((String)newValue);
				return;
			case GeoPackage.GEO__GEO_CODE:
				setGeoCode((String)newValue);
				return;
			case GeoPackage.GEO__GEO_NAME:
				setGeoName((String)newValue);
				return;
			case GeoPackage.GEO__GEO_SEC_CODE:
				setGeoSecCode((String)newValue);
				return;
			case GeoPackage.GEO__WELL_KNOWN_TEXT:
				setWellKnownText((String)newValue);
				return;
			case GeoPackage.GEO__GEO_TYPE_ID:
				setGeoTypeId((GeoType)newValue);
				return;
			case GeoPackage.GEO__MAIN_GEO_ASSOCS:
				getMainGeoAssocs().clear();
				getMainGeoAssocs().addAll((Collection<? extends String>)newValue);
				return;
			case GeoPackage.GEO__TAX_AUTH_TAX_AUTHORITIES:
				getTaxAuthTaxAuthorities().clear();
				getTaxAuthTaxAuthorities().addAll((Collection<? extends String>)newValue);
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
			case GeoPackage.GEO__GEO_ID:
				setGeoId(GEO_ID_EDEFAULT);
				return;
			case GeoPackage.GEO__ABBREVIATION:
				setAbbreviation(ABBREVIATION_EDEFAULT);
				return;
			case GeoPackage.GEO__GEO_CODE:
				setGeoCode(GEO_CODE_EDEFAULT);
				return;
			case GeoPackage.GEO__GEO_NAME:
				setGeoName(GEO_NAME_EDEFAULT);
				return;
			case GeoPackage.GEO__GEO_SEC_CODE:
				setGeoSecCode(GEO_SEC_CODE_EDEFAULT);
				return;
			case GeoPackage.GEO__WELL_KNOWN_TEXT:
				setWellKnownText(WELL_KNOWN_TEXT_EDEFAULT);
				return;
			case GeoPackage.GEO__GEO_TYPE_ID:
				setGeoTypeId((GeoType)null);
				return;
			case GeoPackage.GEO__MAIN_GEO_ASSOCS:
				getMainGeoAssocs().clear();
				return;
			case GeoPackage.GEO__TAX_AUTH_TAX_AUTHORITIES:
				getTaxAuthTaxAuthorities().clear();
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
			case GeoPackage.GEO__GEO_ID:
				return GEO_ID_EDEFAULT == null ? geoId != null : !GEO_ID_EDEFAULT.equals(geoId);
			case GeoPackage.GEO__ABBREVIATION:
				return ABBREVIATION_EDEFAULT == null ? abbreviation != null : !ABBREVIATION_EDEFAULT.equals(abbreviation);
			case GeoPackage.GEO__GEO_CODE:
				return GEO_CODE_EDEFAULT == null ? geoCode != null : !GEO_CODE_EDEFAULT.equals(geoCode);
			case GeoPackage.GEO__GEO_NAME:
				return GEO_NAME_EDEFAULT == null ? geoName != null : !GEO_NAME_EDEFAULT.equals(geoName);
			case GeoPackage.GEO__GEO_SEC_CODE:
				return GEO_SEC_CODE_EDEFAULT == null ? geoSecCode != null : !GEO_SEC_CODE_EDEFAULT.equals(geoSecCode);
			case GeoPackage.GEO__WELL_KNOWN_TEXT:
				return WELL_KNOWN_TEXT_EDEFAULT == null ? wellKnownText != null : !WELL_KNOWN_TEXT_EDEFAULT.equals(wellKnownText);
			case GeoPackage.GEO__GEO_TYPE_ID:
				return geoTypeId != null;
			case GeoPackage.GEO__MAIN_GEO_ASSOCS:
				return mainGeoAssocs != null && !mainGeoAssocs.isEmpty();
			case GeoPackage.GEO__TAX_AUTH_TAX_AUTHORITIES:
				return taxAuthTaxAuthorities != null && !taxAuthTaxAuthorities.isEmpty();
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
		result.append(" (geoId: ");
		result.append(geoId);
		result.append(", abbreviation: ");
		result.append(abbreviation);
		result.append(", geoCode: ");
		result.append(geoCode);
		result.append(", geoName: ");
		result.append(geoName);
		result.append(", geoSecCode: ");
		result.append(geoSecCode);
		result.append(", wellKnownText: ");
		result.append(wellKnownText);
		result.append(", mainGeoAssocs: ");
		result.append(mainGeoAssocs);
		result.append(", taxAuthTaxAuthorities: ");
		result.append(taxAuthTaxAuthorities);
		result.append(')');
		return result.toString();
	}

} //GeoImpl
