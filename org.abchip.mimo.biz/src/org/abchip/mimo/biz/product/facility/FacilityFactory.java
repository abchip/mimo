/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.facility;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.product.facility.FacilityPackage
 * @generated
 */
public interface FacilityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FacilityFactory eINSTANCE = org.abchip.mimo.biz.product.facility.impl.FacilityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	Container createContainer();

	/**
	 * Returns a new object of class '<em>Container Geo Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Geo Point</em>'.
	 * @generated
	 */
	ContainerGeoPoint createContainerGeoPoint();

	/**
	 * Returns a new object of class '<em>Container Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Type</em>'.
	 * @generated
	 */
	ContainerType createContainerType();

	/**
	 * Returns a new object of class '<em>Facility</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facility</em>'.
	 * @generated
	 */
	Facility createFacility();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	FacilityAttribute createFacilityAttribute();

	/**
	 * Returns a new object of class '<em>Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calendar</em>'.
	 * @generated
	 */
	FacilityCalendar createFacilityCalendar();

	/**
	 * Returns a new object of class '<em>Calendar Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calendar Type</em>'.
	 * @generated
	 */
	FacilityCalendarType createFacilityCalendarType();

	/**
	 * Returns a new object of class '<em>Carrier Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier Shipment</em>'.
	 * @generated
	 */
	FacilityCarrierShipment createFacilityCarrierShipment();

	/**
	 * Returns a new object of class '<em>Contact Mech</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Mech</em>'.
	 * @generated
	 */
	FacilityContactMech createFacilityContactMech();

	/**
	 * Returns a new object of class '<em>Contact Mech Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Mech Purpose</em>'.
	 * @generated
	 */
	FacilityContactMechPurpose createFacilityContactMechPurpose();

	/**
	 * Returns a new object of class '<em>Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content</em>'.
	 * @generated
	 */
	FacilityContent createFacilityContent();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	FacilityGroup createFacilityGroup();

	/**
	 * Returns a new object of class '<em>Group Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Member</em>'.
	 * @generated
	 */
	FacilityGroupMember createFacilityGroupMember();

	/**
	 * Returns a new object of class '<em>Group Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Role</em>'.
	 * @generated
	 */
	FacilityGroupRole createFacilityGroupRole();

	/**
	 * Returns a new object of class '<em>Group Rollup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Rollup</em>'.
	 * @generated
	 */
	FacilityGroupRollup createFacilityGroupRollup();

	/**
	 * Returns a new object of class '<em>Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Type</em>'.
	 * @generated
	 */
	FacilityGroupType createFacilityGroupType();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	FacilityLocation createFacilityLocation();

	/**
	 * Returns a new object of class '<em>Location Geo Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Geo Point</em>'.
	 * @generated
	 */
	FacilityLocationGeoPoint createFacilityLocationGeoPoint();

	/**
	 * Returns a new object of class '<em>Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Party</em>'.
	 * @generated
	 */
	FacilityParty createFacilityParty();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	FacilityType createFacilityType();

	/**
	 * Returns a new object of class '<em>Type Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Attr</em>'.
	 * @generated
	 */
	FacilityTypeAttr createFacilityTypeAttr();

	/**
	 * Returns a new object of class '<em>Product Facility</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Facility</em>'.
	 * @generated
	 */
	ProductFacility createProductFacility();

	/**
	 * Returns a new object of class '<em>Product Facility Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Facility Location</em>'.
	 * @generated
	 */
	ProductFacilityLocation createProductFacilityLocation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FacilityPackage getFacilityPackage();

} //FacilityFactory
