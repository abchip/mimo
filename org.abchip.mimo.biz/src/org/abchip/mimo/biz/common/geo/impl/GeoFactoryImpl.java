/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.geo.impl;

import org.abchip.mimo.biz.common.geo.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeoFactoryImpl extends EFactoryImpl implements GeoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GeoFactory init() {
		try {
			GeoFactory theGeoFactory = (GeoFactory)EPackage.Registry.INSTANCE.getEFactory(GeoPackage.eNS_URI);
			if (theGeoFactory != null) {
				return theGeoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GeoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GeoPackage.COUNTRY_ADDRESS_FORMAT: return (EObject)createCountryAddressFormat();
			case GeoPackage.COUNTRY_CAPITAL: return (EObject)createCountryCapital();
			case GeoPackage.COUNTRY_CODE: return (EObject)createCountryCode();
			case GeoPackage.COUNTRY_TELE_CODE: return (EObject)createCountryTeleCode();
			case GeoPackage.GEO: return (EObject)createGeo();
			case GeoPackage.GEO_ASSOC: return (EObject)createGeoAssoc();
			case GeoPackage.GEO_ASSOC_TYPE: return (EObject)createGeoAssocType();
			case GeoPackage.GEO_POINT: return (EObject)createGeoPoint();
			case GeoPackage.GEO_TYPE: return (EObject)createGeoType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountryAddressFormat createCountryAddressFormat() {
		CountryAddressFormatImpl countryAddressFormat = new CountryAddressFormatImpl();
		return countryAddressFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountryCapital createCountryCapital() {
		CountryCapitalImpl countryCapital = new CountryCapitalImpl();
		return countryCapital;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountryCode createCountryCode() {
		CountryCodeImpl countryCode = new CountryCodeImpl();
		return countryCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountryTeleCode createCountryTeleCode() {
		CountryTeleCodeImpl countryTeleCode = new CountryTeleCodeImpl();
		return countryTeleCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo createGeo() {
		GeoImpl geo = new GeoImpl();
		return geo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoAssoc createGeoAssoc() {
		GeoAssocImpl geoAssoc = new GeoAssocImpl();
		return geoAssoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoAssocType createGeoAssocType() {
		GeoAssocTypeImpl geoAssocType = new GeoAssocTypeImpl();
		return geoAssocType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoPoint createGeoPoint() {
		GeoPointImpl geoPoint = new GeoPointImpl();
		return geoPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoType createGeoType() {
		GeoTypeImpl geoType = new GeoTypeImpl();
		return geoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoPackage getGeoPackage() {
		return (GeoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GeoPackage getPackage() {
		return GeoPackage.eINSTANCE;
	}

} //GeoFactoryImpl
