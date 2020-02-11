/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.facility.impl;

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.geo.GeoPoint;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.product.facility.FacilityLocation;
import org.abchip.mimo.biz.product.facility.FacilityPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facility Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityLocationImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityLocationImpl#getLocationSeqId <em>Location Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityLocationImpl#getAisleId <em>Aisle Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityLocationImpl#getAreaId <em>Area Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityLocationImpl#getGeoPointId <em>Geo Point Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityLocationImpl#getLevelId <em>Level Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityLocationImpl#getLocationTypeEnumId <em>Location Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityLocationImpl#getPositionId <em>Position Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityLocationImpl#getSectionId <em>Section Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacilityLocationImpl extends BizEntityImpl implements FacilityLocation {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacilityLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacilityPackage.Literals.FACILITY_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAisleId() {
		return (String)eGet(FacilityPackage.Literals.FACILITY_LOCATION__AISLE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAisleId(String newAisleId) {
		eSet(FacilityPackage.Literals.FACILITY_LOCATION__AISLE_ID, newAisleId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAreaId() {
		return (String)eGet(FacilityPackage.Literals.FACILITY_LOCATION__AREA_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAreaId(String newAreaId) {
		eSet(FacilityPackage.Literals.FACILITY_LOCATION__AREA_ID, newAreaId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoPoint getGeoPointId() {
		return (GeoPoint)eGet(FacilityPackage.Literals.FACILITY_LOCATION__GEO_POINT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoPointId(GeoPoint newGeoPointId) {
		eSet(FacilityPackage.Literals.FACILITY_LOCATION__GEO_POINT_ID, newGeoPointId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLevelId() {
		return (String)eGet(FacilityPackage.Literals.FACILITY_LOCATION__LEVEL_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevelId(String newLevelId) {
		eSet(FacilityPackage.Literals.FACILITY_LOCATION__LEVEL_ID, newLevelId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocationSeqId() {
		return (String)eGet(FacilityPackage.Literals.FACILITY_LOCATION__LOCATION_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationSeqId(String newLocationSeqId) {
		eSet(FacilityPackage.Literals.FACILITY_LOCATION__LOCATION_SEQ_ID, newLocationSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getLocationTypeEnumId() {
		return (Enumeration)eGet(FacilityPackage.Literals.FACILITY_LOCATION__LOCATION_TYPE_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationTypeEnumId(Enumeration newLocationTypeEnumId) {
		eSet(FacilityPackage.Literals.FACILITY_LOCATION__LOCATION_TYPE_ENUM_ID, newLocationTypeEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPositionId() {
		return (String)eGet(FacilityPackage.Literals.FACILITY_LOCATION__POSITION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionId(String newPositionId) {
		eSet(FacilityPackage.Literals.FACILITY_LOCATION__POSITION_ID, newPositionId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSectionId() {
		return (String)eGet(FacilityPackage.Literals.FACILITY_LOCATION__SECTION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSectionId(String newSectionId) {
		eSet(FacilityPackage.Literals.FACILITY_LOCATION__SECTION_ID, newSectionId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getFacilityId() {
		return (Facility)eGet(FacilityPackage.Literals.FACILITY_LOCATION__FACILITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(Facility newFacilityId) {
		eSet(FacilityPackage.Literals.FACILITY_LOCATION__FACILITY_ID, newFacilityId);
	}

} //FacilityLocationImpl
