/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.geo.impl;

import java.util.List;
import org.abchip.mimo.biz.accounting.tax.TaxAuthority;
import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.common.geo.GeoAssoc;
import org.abchip.mimo.biz.common.geo.GeoPackage;
import org.abchip.mimo.biz.common.geo.GeoType;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
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
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.GeoImpl#getGeoTypeId <em>Geo Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.GeoImpl#getMainGeoAssocs <em>Main Geo Assocs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.GeoImpl#getTaxAuthTaxAuthorities <em>Tax Auth Tax Authorities</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.GeoImpl#getWellKnownText <em>Well Known Text</em>}</li>
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
	@SuppressWarnings("unchecked")
	@Override
	public List<GeoAssoc> getMainGeoAssocs() {
		return (List<GeoAssoc>)eGet(GeoPackage.Literals.GEO__MAIN_GEO_ASSOCS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<TaxAuthority> getTaxAuthTaxAuthorities() {
		return (List<TaxAuthority>)eGet(GeoPackage.Literals.GEO__TAX_AUTH_TAX_AUTHORITIES, true);
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
