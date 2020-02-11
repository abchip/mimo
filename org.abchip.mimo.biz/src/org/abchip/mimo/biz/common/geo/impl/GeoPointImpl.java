/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.geo.impl;

import java.math.BigDecimal;
import org.abchip.mimo.biz.common.datasource.DataSource;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.geo.GeoPackage;
import org.abchip.mimo.biz.common.geo.GeoPoint;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

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
		return (String)eGet(GeoPackage.Literals.GEO_POINT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(GeoPackage.Literals.GEO_POINT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getElevation() {
		return (BigDecimal)eGet(GeoPackage.Literals.GEO_POINT__ELEVATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElevation(BigDecimal newElevation) {
		eSet(GeoPackage.Literals.GEO_POINT__ELEVATION, newElevation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getElevationUomId() {
		return (Uom)eGet(GeoPackage.Literals.GEO_POINT__ELEVATION_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElevationUomId(Uom newElevationUomId) {
		eSet(GeoPackage.Literals.GEO_POINT__ELEVATION_UOM_ID, newElevationUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeoPointId() {
		return (String)eGet(GeoPackage.Literals.GEO_POINT__GEO_POINT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoPointId(String newGeoPointId) {
		eSet(GeoPackage.Literals.GEO_POINT__GEO_POINT_ID, newGeoPointId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInformation() {
		return (String)eGet(GeoPackage.Literals.GEO_POINT__INFORMATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInformation(String newInformation) {
		eSet(GeoPackage.Literals.GEO_POINT__INFORMATION, newInformation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLatitude() {
		return (String)eGet(GeoPackage.Literals.GEO_POINT__LATITUDE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLatitude(String newLatitude) {
		eSet(GeoPackage.Literals.GEO_POINT__LATITUDE, newLatitude);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLongitude() {
		return (String)eGet(GeoPackage.Literals.GEO_POINT__LONGITUDE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongitude(String newLongitude) {
		eSet(GeoPackage.Literals.GEO_POINT__LONGITUDE, newLongitude);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSource getDataSourceId() {
		return (DataSource)eGet(GeoPackage.Literals.GEO_POINT__DATA_SOURCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataSourceId(DataSource newDataSourceId) {
		eSet(GeoPackage.Literals.GEO_POINT__DATA_SOURCE_ID, newDataSourceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getGeoPointTypeEnumId() {
		return (Enumeration)eGet(GeoPackage.Literals.GEO_POINT__GEO_POINT_TYPE_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoPointTypeEnumId(Enumeration newGeoPointTypeEnumId) {
		eSet(GeoPackage.Literals.GEO_POINT__GEO_POINT_TYPE_ENUM_ID, newGeoPointTypeEnumId);
	}

} //GeoPointImpl
