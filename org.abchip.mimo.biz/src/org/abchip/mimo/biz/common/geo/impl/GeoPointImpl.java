/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.geo.impl;

import java.math.BigDecimal;

import java.util.List;

import org.abchip.mimo.biz.common.geo.GeoPackage;
import org.abchip.mimo.biz.common.geo.GeoPoint;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geo Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.GeoPointImpl#getGeoPointId <em>Geo Point Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.GeoPointImpl#getDataSourceId <em>Data Source Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.GeoPointImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.GeoPointImpl#getElevation <em>Elevation</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.GeoPointImpl#getElevationUomId <em>Elevation Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.GeoPointImpl#getGeoPointTypeEnumId <em>Geo Point Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.GeoPointImpl#getInformation <em>Information</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.GeoPointImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.geo.impl.GeoPointImpl#getLongitude <em>Longitude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeoPointImpl extends BizEntityImpl implements GeoPoint {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getGeoPointId() <em>Geo Point Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoPointId()
	 * @generated
	 * @ordered
	 */
	protected static final String GEO_POINT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGeoPointId() <em>Geo Point Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoPointId()
	 * @generated
	 * @ordered
	 */
	protected String geoPointId = GEO_POINT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getDataSourceId() <em>Data Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceId()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SOURCE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDataSourceId() <em>Data Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceId()
	 * @generated
	 * @ordered
	 */
	protected String dataSourceId = DATA_SOURCE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getElevation() <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevation()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ELEVATION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getElevation() <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevation()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal elevation = ELEVATION_EDEFAULT;
	/**
	 * The default value of the '{@link #getElevationUomId() <em>Elevation Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEVATION_UOM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getElevationUomId() <em>Elevation Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationUomId()
	 * @generated
	 * @ordered
	 */
	protected String elevationUomId = ELEVATION_UOM_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getGeoPointTypeEnumId() <em>Geo Point Type Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoPointTypeEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String GEO_POINT_TYPE_ENUM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeoPointTypeEnumId() <em>Geo Point Type Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoPointTypeEnumId()
	 * @generated
	 * @ordered
	 */
	protected String geoPointTypeEnumId = GEO_POINT_TYPE_ENUM_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getInformation() <em>Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected static final String INFORMATION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInformation() <em>Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected String information = INFORMATION_EDEFAULT;
	/**
	 * The default value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final String LATITUDE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected String latitude = LATITUDE_EDEFAULT;
	/**
	 * The default value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final String LONGITUDE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected String longitude = LONGITUDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeoPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeoPackage.Literals.GEO_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoPackage.GEO_POINT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getElevation() {
		return elevation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElevation(BigDecimal newElevation) {
		BigDecimal oldElevation = elevation;
		elevation = newElevation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoPackage.GEO_POINT__ELEVATION, oldElevation, elevation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElevationUomId() {
		return elevationUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElevationUomId(String newElevationUomId) {
		String oldElevationUomId = elevationUomId;
		elevationUomId = newElevationUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoPackage.GEO_POINT__ELEVATION_UOM_ID, oldElevationUomId, elevationUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeoPointId() {
		return geoPointId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoPointId(String newGeoPointId) {
		String oldGeoPointId = geoPointId;
		geoPointId = newGeoPointId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoPackage.GEO_POINT__GEO_POINT_ID, oldGeoPointId, geoPointId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInformation() {
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInformation(String newInformation) {
		String oldInformation = information;
		information = newInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoPackage.GEO_POINT__INFORMATION, oldInformation, information));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLatitude() {
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLatitude(String newLatitude) {
		String oldLatitude = latitude;
		latitude = newLatitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoPackage.GEO_POINT__LATITUDE, oldLatitude, latitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLongitude() {
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongitude(String newLongitude) {
		String oldLongitude = longitude;
		longitude = newLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoPackage.GEO_POINT__LONGITUDE, oldLongitude, longitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> facilities() {
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
	public List<String> facilityLocations() {
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
	public List<String> postalAddresses() {
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
	public String getDataSourceId() {
		return dataSourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataSourceId(String newDataSourceId) {
		String oldDataSourceId = dataSourceId;
		dataSourceId = newDataSourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoPackage.GEO_POINT__DATA_SOURCE_ID, oldDataSourceId, dataSourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeoPointTypeEnumId() {
		return geoPointTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoPointTypeEnumId(String newGeoPointTypeEnumId) {
		String oldGeoPointTypeEnumId = geoPointTypeEnumId;
		geoPointTypeEnumId = newGeoPointTypeEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeoPackage.GEO_POINT__GEO_POINT_TYPE_ENUM_ID, oldGeoPointTypeEnumId, geoPointTypeEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeoPackage.GEO_POINT__GEO_POINT_ID:
				return getGeoPointId();
			case GeoPackage.GEO_POINT__DATA_SOURCE_ID:
				return getDataSourceId();
			case GeoPackage.GEO_POINT__DESCRIPTION:
				return getDescription();
			case GeoPackage.GEO_POINT__ELEVATION:
				return getElevation();
			case GeoPackage.GEO_POINT__ELEVATION_UOM_ID:
				return getElevationUomId();
			case GeoPackage.GEO_POINT__GEO_POINT_TYPE_ENUM_ID:
				return getGeoPointTypeEnumId();
			case GeoPackage.GEO_POINT__INFORMATION:
				return getInformation();
			case GeoPackage.GEO_POINT__LATITUDE:
				return getLatitude();
			case GeoPackage.GEO_POINT__LONGITUDE:
				return getLongitude();
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
			case GeoPackage.GEO_POINT__GEO_POINT_ID:
				setGeoPointId((String)newValue);
				return;
			case GeoPackage.GEO_POINT__DATA_SOURCE_ID:
				setDataSourceId((String)newValue);
				return;
			case GeoPackage.GEO_POINT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GeoPackage.GEO_POINT__ELEVATION:
				setElevation((BigDecimal)newValue);
				return;
			case GeoPackage.GEO_POINT__ELEVATION_UOM_ID:
				setElevationUomId((String)newValue);
				return;
			case GeoPackage.GEO_POINT__GEO_POINT_TYPE_ENUM_ID:
				setGeoPointTypeEnumId((String)newValue);
				return;
			case GeoPackage.GEO_POINT__INFORMATION:
				setInformation((String)newValue);
				return;
			case GeoPackage.GEO_POINT__LATITUDE:
				setLatitude((String)newValue);
				return;
			case GeoPackage.GEO_POINT__LONGITUDE:
				setLongitude((String)newValue);
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
			case GeoPackage.GEO_POINT__GEO_POINT_ID:
				setGeoPointId(GEO_POINT_ID_EDEFAULT);
				return;
			case GeoPackage.GEO_POINT__DATA_SOURCE_ID:
				setDataSourceId(DATA_SOURCE_ID_EDEFAULT);
				return;
			case GeoPackage.GEO_POINT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GeoPackage.GEO_POINT__ELEVATION:
				setElevation(ELEVATION_EDEFAULT);
				return;
			case GeoPackage.GEO_POINT__ELEVATION_UOM_ID:
				setElevationUomId(ELEVATION_UOM_ID_EDEFAULT);
				return;
			case GeoPackage.GEO_POINT__GEO_POINT_TYPE_ENUM_ID:
				setGeoPointTypeEnumId(GEO_POINT_TYPE_ENUM_ID_EDEFAULT);
				return;
			case GeoPackage.GEO_POINT__INFORMATION:
				setInformation(INFORMATION_EDEFAULT);
				return;
			case GeoPackage.GEO_POINT__LATITUDE:
				setLatitude(LATITUDE_EDEFAULT);
				return;
			case GeoPackage.GEO_POINT__LONGITUDE:
				setLongitude(LONGITUDE_EDEFAULT);
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
			case GeoPackage.GEO_POINT__GEO_POINT_ID:
				return GEO_POINT_ID_EDEFAULT == null ? geoPointId != null : !GEO_POINT_ID_EDEFAULT.equals(geoPointId);
			case GeoPackage.GEO_POINT__DATA_SOURCE_ID:
				return DATA_SOURCE_ID_EDEFAULT == null ? dataSourceId != null : !DATA_SOURCE_ID_EDEFAULT.equals(dataSourceId);
			case GeoPackage.GEO_POINT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case GeoPackage.GEO_POINT__ELEVATION:
				return ELEVATION_EDEFAULT == null ? elevation != null : !ELEVATION_EDEFAULT.equals(elevation);
			case GeoPackage.GEO_POINT__ELEVATION_UOM_ID:
				return ELEVATION_UOM_ID_EDEFAULT == null ? elevationUomId != null : !ELEVATION_UOM_ID_EDEFAULT.equals(elevationUomId);
			case GeoPackage.GEO_POINT__GEO_POINT_TYPE_ENUM_ID:
				return GEO_POINT_TYPE_ENUM_ID_EDEFAULT == null ? geoPointTypeEnumId != null : !GEO_POINT_TYPE_ENUM_ID_EDEFAULT.equals(geoPointTypeEnumId);
			case GeoPackage.GEO_POINT__INFORMATION:
				return INFORMATION_EDEFAULT == null ? information != null : !INFORMATION_EDEFAULT.equals(information);
			case GeoPackage.GEO_POINT__LATITUDE:
				return LATITUDE_EDEFAULT == null ? latitude != null : !LATITUDE_EDEFAULT.equals(latitude);
			case GeoPackage.GEO_POINT__LONGITUDE:
				return LONGITUDE_EDEFAULT == null ? longitude != null : !LONGITUDE_EDEFAULT.equals(longitude);
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
		result.append(" (geoPointId: ");
		result.append(geoPointId);
		result.append(", dataSourceId: ");
		result.append(dataSourceId);
		result.append(", description: ");
		result.append(description);
		result.append(", elevation: ");
		result.append(elevation);
		result.append(", elevationUomId: ");
		result.append(elevationUomId);
		result.append(", geoPointTypeEnumId: ");
		result.append(geoPointTypeEnumId);
		result.append(", information: ");
		result.append(information);
		result.append(", latitude: ");
		result.append(latitude);
		result.append(", longitude: ");
		result.append(longitude);
		result.append(')');
		return result.toString();
	}

} //GeoPointImpl
