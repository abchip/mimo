/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.geo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.common.geo.GeoPackage
 * @generated
 */
public interface GeoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeoFactory eINSTANCE = org.abchip.mimo.biz.common.geo.impl.GeoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Country Address Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Country Address Format</em>'.
	 * @generated
	 */
	CountryAddressFormat createCountryAddressFormat();

	/**
	 * Returns a new object of class '<em>Country Capital</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Country Capital</em>'.
	 * @generated
	 */
	CountryCapital createCountryCapital();

	/**
	 * Returns a new object of class '<em>Country Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Country Code</em>'.
	 * @generated
	 */
	CountryCode createCountryCode();

	/**
	 * Returns a new object of class '<em>Country Tele Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Country Tele Code</em>'.
	 * @generated
	 */
	CountryTeleCode createCountryTeleCode();

	/**
	 * Returns a new object of class '<em>Geo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geo</em>'.
	 * @generated
	 */
	Geo createGeo();

	/**
	 * Returns a new object of class '<em>Assoc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assoc</em>'.
	 * @generated
	 */
	GeoAssoc createGeoAssoc();

	/**
	 * Returns a new object of class '<em>Assoc Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assoc Type</em>'.
	 * @generated
	 */
	GeoAssocType createGeoAssocType();

	/**
	 * Returns a new object of class '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point</em>'.
	 * @generated
	 */
	GeoPoint createGeoPoint();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	GeoType createGeoType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GeoPackage getGeoPackage();

} //GeoFactory
