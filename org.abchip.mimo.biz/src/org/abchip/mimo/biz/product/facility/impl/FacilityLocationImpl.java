/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facility Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityLocationImpl#getLocationSeqId <em>Location Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityLocationImpl#getAisleId <em>Aisle Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityLocationImpl#getAreaId <em>Area Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityLocationImpl#getLevelId <em>Level Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityLocationImpl#getPositionId <em>Position Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityLocationImpl#getSectionId <em>Section Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityLocationImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityLocationImpl#getLocationTypeEnumId <em>Location Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityLocationImpl#getGeoPointId <em>Geo Point Id</em>}</li>
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
	 * The default value of the '{@link #getLocationSeqId() <em>Location Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationSeqId() <em>Location Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationSeqId()
	 * @generated
	 * @ordered
	 */
	protected String locationSeqId = LOCATION_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAisleId() <em>Aisle Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAisleId()
	 * @generated
	 * @ordered
	 */
	protected static final String AISLE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAisleId() <em>Aisle Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAisleId()
	 * @generated
	 * @ordered
	 */
	protected String aisleId = AISLE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAreaId() <em>Area Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaId()
	 * @generated
	 * @ordered
	 */
	protected static final String AREA_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAreaId() <em>Area Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaId()
	 * @generated
	 * @ordered
	 */
	protected String areaId = AREA_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevelId() <em>Level Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelId()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevelId() <em>Level Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelId()
	 * @generated
	 * @ordered
	 */
	protected String levelId = LEVEL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionId() <em>Position Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionId()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPositionId() <em>Position Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionId()
	 * @generated
	 * @ordered
	 */
	protected String positionId = POSITION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSectionId() <em>Section Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionId()
	 * @generated
	 * @ordered
	 */
	protected static final String SECTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSectionId() <em>Section Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionId()
	 * @generated
	 * @ordered
	 */
	protected String sectionId = SECTION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFacilityId() <em>Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected Facility facilityId;

	/**
	 * The cached value of the '{@link #getLocationTypeEnumId() <em>Location Type Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationTypeEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration locationTypeEnumId;

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
		return aisleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAisleId(String newAisleId) {
		String oldAisleId = aisleId;
		aisleId = newAisleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY_LOCATION__AISLE_ID, oldAisleId, aisleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAreaId() {
		return areaId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAreaId(String newAreaId) {
		String oldAreaId = areaId;
		areaId = newAreaId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY_LOCATION__AREA_ID, oldAreaId, areaId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilityPackage.FACILITY_LOCATION__GEO_POINT_ID, oldGeoPointId, geoPointId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY_LOCATION__GEO_POINT_ID, oldGeoPointId, geoPointId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLevelId() {
		return levelId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevelId(String newLevelId) {
		String oldLevelId = levelId;
		levelId = newLevelId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY_LOCATION__LEVEL_ID, oldLevelId, levelId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocationSeqId() {
		return locationSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationSeqId(String newLocationSeqId) {
		String oldLocationSeqId = locationSeqId;
		locationSeqId = newLocationSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY_LOCATION__LOCATION_SEQ_ID, oldLocationSeqId, locationSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getLocationTypeEnumId() {
		if (locationTypeEnumId != null && ((EObject)locationTypeEnumId).eIsProxy()) {
			InternalEObject oldLocationTypeEnumId = (InternalEObject)locationTypeEnumId;
			locationTypeEnumId = (Enumeration)eResolveProxy(oldLocationTypeEnumId);
			if (locationTypeEnumId != oldLocationTypeEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilityPackage.FACILITY_LOCATION__LOCATION_TYPE_ENUM_ID, oldLocationTypeEnumId, locationTypeEnumId));
			}
		}
		return locationTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetLocationTypeEnumId() {
		return locationTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationTypeEnumId(Enumeration newLocationTypeEnumId) {
		Enumeration oldLocationTypeEnumId = locationTypeEnumId;
		locationTypeEnumId = newLocationTypeEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY_LOCATION__LOCATION_TYPE_ENUM_ID, oldLocationTypeEnumId, locationTypeEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPositionId() {
		return positionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionId(String newPositionId) {
		String oldPositionId = positionId;
		positionId = newPositionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY_LOCATION__POSITION_ID, oldPositionId, positionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSectionId() {
		return sectionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSectionId(String newSectionId) {
		String oldSectionId = sectionId;
		sectionId = newSectionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY_LOCATION__SECTION_ID, oldSectionId, sectionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getFacilityId() {
		if (facilityId != null && ((EObject)facilityId).eIsProxy()) {
			InternalEObject oldFacilityId = (InternalEObject)facilityId;
			facilityId = (Facility)eResolveProxy(oldFacilityId);
			if (facilityId != oldFacilityId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilityPackage.FACILITY_LOCATION__FACILITY_ID, oldFacilityId, facilityId));
			}
		}
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facility basicGetFacilityId() {
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(Facility newFacilityId) {
		Facility oldFacilityId = facilityId;
		facilityId = newFacilityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY_LOCATION__FACILITY_ID, oldFacilityId, facilityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FacilityPackage.FACILITY_LOCATION__LOCATION_SEQ_ID:
				return getLocationSeqId();
			case FacilityPackage.FACILITY_LOCATION__AISLE_ID:
				return getAisleId();
			case FacilityPackage.FACILITY_LOCATION__AREA_ID:
				return getAreaId();
			case FacilityPackage.FACILITY_LOCATION__LEVEL_ID:
				return getLevelId();
			case FacilityPackage.FACILITY_LOCATION__POSITION_ID:
				return getPositionId();
			case FacilityPackage.FACILITY_LOCATION__SECTION_ID:
				return getSectionId();
			case FacilityPackage.FACILITY_LOCATION__FACILITY_ID:
				if (resolve) return getFacilityId();
				return basicGetFacilityId();
			case FacilityPackage.FACILITY_LOCATION__LOCATION_TYPE_ENUM_ID:
				if (resolve) return getLocationTypeEnumId();
				return basicGetLocationTypeEnumId();
			case FacilityPackage.FACILITY_LOCATION__GEO_POINT_ID:
				if (resolve) return getGeoPointId();
				return basicGetGeoPointId();
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
			case FacilityPackage.FACILITY_LOCATION__LOCATION_SEQ_ID:
				setLocationSeqId((String)newValue);
				return;
			case FacilityPackage.FACILITY_LOCATION__AISLE_ID:
				setAisleId((String)newValue);
				return;
			case FacilityPackage.FACILITY_LOCATION__AREA_ID:
				setAreaId((String)newValue);
				return;
			case FacilityPackage.FACILITY_LOCATION__LEVEL_ID:
				setLevelId((String)newValue);
				return;
			case FacilityPackage.FACILITY_LOCATION__POSITION_ID:
				setPositionId((String)newValue);
				return;
			case FacilityPackage.FACILITY_LOCATION__SECTION_ID:
				setSectionId((String)newValue);
				return;
			case FacilityPackage.FACILITY_LOCATION__FACILITY_ID:
				setFacilityId((Facility)newValue);
				return;
			case FacilityPackage.FACILITY_LOCATION__LOCATION_TYPE_ENUM_ID:
				setLocationTypeEnumId((Enumeration)newValue);
				return;
			case FacilityPackage.FACILITY_LOCATION__GEO_POINT_ID:
				setGeoPointId((GeoPoint)newValue);
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
			case FacilityPackage.FACILITY_LOCATION__LOCATION_SEQ_ID:
				setLocationSeqId(LOCATION_SEQ_ID_EDEFAULT);
				return;
			case FacilityPackage.FACILITY_LOCATION__AISLE_ID:
				setAisleId(AISLE_ID_EDEFAULT);
				return;
			case FacilityPackage.FACILITY_LOCATION__AREA_ID:
				setAreaId(AREA_ID_EDEFAULT);
				return;
			case FacilityPackage.FACILITY_LOCATION__LEVEL_ID:
				setLevelId(LEVEL_ID_EDEFAULT);
				return;
			case FacilityPackage.FACILITY_LOCATION__POSITION_ID:
				setPositionId(POSITION_ID_EDEFAULT);
				return;
			case FacilityPackage.FACILITY_LOCATION__SECTION_ID:
				setSectionId(SECTION_ID_EDEFAULT);
				return;
			case FacilityPackage.FACILITY_LOCATION__FACILITY_ID:
				setFacilityId((Facility)null);
				return;
			case FacilityPackage.FACILITY_LOCATION__LOCATION_TYPE_ENUM_ID:
				setLocationTypeEnumId((Enumeration)null);
				return;
			case FacilityPackage.FACILITY_LOCATION__GEO_POINT_ID:
				setGeoPointId((GeoPoint)null);
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
			case FacilityPackage.FACILITY_LOCATION__LOCATION_SEQ_ID:
				return LOCATION_SEQ_ID_EDEFAULT == null ? locationSeqId != null : !LOCATION_SEQ_ID_EDEFAULT.equals(locationSeqId);
			case FacilityPackage.FACILITY_LOCATION__AISLE_ID:
				return AISLE_ID_EDEFAULT == null ? aisleId != null : !AISLE_ID_EDEFAULT.equals(aisleId);
			case FacilityPackage.FACILITY_LOCATION__AREA_ID:
				return AREA_ID_EDEFAULT == null ? areaId != null : !AREA_ID_EDEFAULT.equals(areaId);
			case FacilityPackage.FACILITY_LOCATION__LEVEL_ID:
				return LEVEL_ID_EDEFAULT == null ? levelId != null : !LEVEL_ID_EDEFAULT.equals(levelId);
			case FacilityPackage.FACILITY_LOCATION__POSITION_ID:
				return POSITION_ID_EDEFAULT == null ? positionId != null : !POSITION_ID_EDEFAULT.equals(positionId);
			case FacilityPackage.FACILITY_LOCATION__SECTION_ID:
				return SECTION_ID_EDEFAULT == null ? sectionId != null : !SECTION_ID_EDEFAULT.equals(sectionId);
			case FacilityPackage.FACILITY_LOCATION__FACILITY_ID:
				return facilityId != null;
			case FacilityPackage.FACILITY_LOCATION__LOCATION_TYPE_ENUM_ID:
				return locationTypeEnumId != null;
			case FacilityPackage.FACILITY_LOCATION__GEO_POINT_ID:
				return geoPointId != null;
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
		result.append(" (locationSeqId: ");
		result.append(locationSeqId);
		result.append(", aisleId: ");
		result.append(aisleId);
		result.append(", areaId: ");
		result.append(areaId);
		result.append(", levelId: ");
		result.append(levelId);
		result.append(", positionId: ");
		result.append(positionId);
		result.append(", sectionId: ");
		result.append(sectionId);
		result.append(')');
		return result.toString();
	}

} //FacilityLocationImpl
