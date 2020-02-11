/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.facility.impl;

import org.abchip.mimo.biz.product.facility.*;
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
public class FacilityFactoryImpl extends EFactoryImpl implements FacilityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FacilityFactory init() {
		try {
			FacilityFactory theFacilityFactory = (FacilityFactory)EPackage.Registry.INSTANCE.getEFactory(FacilityPackage.eNS_URI);
			if (theFacilityFactory != null) {
				return theFacilityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FacilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityFactoryImpl() {
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
			case FacilityPackage.CONTAINER: return (EObject)createContainer();
			case FacilityPackage.CONTAINER_GEO_POINT: return (EObject)createContainerGeoPoint();
			case FacilityPackage.CONTAINER_TYPE: return (EObject)createContainerType();
			case FacilityPackage.FACILITY: return (EObject)createFacility();
			case FacilityPackage.FACILITY_ATTRIBUTE: return (EObject)createFacilityAttribute();
			case FacilityPackage.FACILITY_CALENDAR: return (EObject)createFacilityCalendar();
			case FacilityPackage.FACILITY_CALENDAR_TYPE: return (EObject)createFacilityCalendarType();
			case FacilityPackage.FACILITY_CARRIER_SHIPMENT: return (EObject)createFacilityCarrierShipment();
			case FacilityPackage.FACILITY_CONTACT_MECH: return (EObject)createFacilityContactMech();
			case FacilityPackage.FACILITY_CONTACT_MECH_PURPOSE: return (EObject)createFacilityContactMechPurpose();
			case FacilityPackage.FACILITY_CONTENT: return (EObject)createFacilityContent();
			case FacilityPackage.FACILITY_GROUP: return (EObject)createFacilityGroup();
			case FacilityPackage.FACILITY_GROUP_MEMBER: return (EObject)createFacilityGroupMember();
			case FacilityPackage.FACILITY_GROUP_ROLE: return (EObject)createFacilityGroupRole();
			case FacilityPackage.FACILITY_GROUP_ROLLUP: return (EObject)createFacilityGroupRollup();
			case FacilityPackage.FACILITY_GROUP_TYPE: return (EObject)createFacilityGroupType();
			case FacilityPackage.FACILITY_LOCATION: return (EObject)createFacilityLocation();
			case FacilityPackage.FACILITY_LOCATION_GEO_POINT: return (EObject)createFacilityLocationGeoPoint();
			case FacilityPackage.FACILITY_PARTY: return (EObject)createFacilityParty();
			case FacilityPackage.FACILITY_TYPE: return (EObject)createFacilityType();
			case FacilityPackage.FACILITY_TYPE_ATTR: return (EObject)createFacilityTypeAttr();
			case FacilityPackage.PRODUCT_FACILITY: return (EObject)createProductFacility();
			case FacilityPackage.PRODUCT_FACILITY_LOCATION: return (EObject)createProductFacilityLocation();
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
	public org.abchip.mimo.biz.product.facility.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerGeoPoint createContainerGeoPoint() {
		ContainerGeoPointImpl containerGeoPoint = new ContainerGeoPointImpl();
		return containerGeoPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerType createContainerType() {
		ContainerTypeImpl containerType = new ContainerTypeImpl();
		return containerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility createFacility() {
		FacilityImpl facility = new FacilityImpl();
		return facility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityAttribute createFacilityAttribute() {
		FacilityAttributeImpl facilityAttribute = new FacilityAttributeImpl();
		return facilityAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityCalendar createFacilityCalendar() {
		FacilityCalendarImpl facilityCalendar = new FacilityCalendarImpl();
		return facilityCalendar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityCalendarType createFacilityCalendarType() {
		FacilityCalendarTypeImpl facilityCalendarType = new FacilityCalendarTypeImpl();
		return facilityCalendarType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityCarrierShipment createFacilityCarrierShipment() {
		FacilityCarrierShipmentImpl facilityCarrierShipment = new FacilityCarrierShipmentImpl();
		return facilityCarrierShipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityContactMech createFacilityContactMech() {
		FacilityContactMechImpl facilityContactMech = new FacilityContactMechImpl();
		return facilityContactMech;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityContactMechPurpose createFacilityContactMechPurpose() {
		FacilityContactMechPurposeImpl facilityContactMechPurpose = new FacilityContactMechPurposeImpl();
		return facilityContactMechPurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityContent createFacilityContent() {
		FacilityContentImpl facilityContent = new FacilityContentImpl();
		return facilityContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityGroup createFacilityGroup() {
		FacilityGroupImpl facilityGroup = new FacilityGroupImpl();
		return facilityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityGroupMember createFacilityGroupMember() {
		FacilityGroupMemberImpl facilityGroupMember = new FacilityGroupMemberImpl();
		return facilityGroupMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityGroupRole createFacilityGroupRole() {
		FacilityGroupRoleImpl facilityGroupRole = new FacilityGroupRoleImpl();
		return facilityGroupRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityGroupRollup createFacilityGroupRollup() {
		FacilityGroupRollupImpl facilityGroupRollup = new FacilityGroupRollupImpl();
		return facilityGroupRollup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityGroupType createFacilityGroupType() {
		FacilityGroupTypeImpl facilityGroupType = new FacilityGroupTypeImpl();
		return facilityGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityLocation createFacilityLocation() {
		FacilityLocationImpl facilityLocation = new FacilityLocationImpl();
		return facilityLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityLocationGeoPoint createFacilityLocationGeoPoint() {
		FacilityLocationGeoPointImpl facilityLocationGeoPoint = new FacilityLocationGeoPointImpl();
		return facilityLocationGeoPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityParty createFacilityParty() {
		FacilityPartyImpl facilityParty = new FacilityPartyImpl();
		return facilityParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityType createFacilityType() {
		FacilityTypeImpl facilityType = new FacilityTypeImpl();
		return facilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityTypeAttr createFacilityTypeAttr() {
		FacilityTypeAttrImpl facilityTypeAttr = new FacilityTypeAttrImpl();
		return facilityTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFacility createProductFacility() {
		ProductFacilityImpl productFacility = new ProductFacilityImpl();
		return productFacility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFacilityLocation createProductFacilityLocation() {
		ProductFacilityLocationImpl productFacilityLocation = new ProductFacilityLocationImpl();
		return productFacilityLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityPackage getFacilityPackage() {
		return (FacilityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FacilityPackage getPackage() {
		return FacilityPackage.eINSTANCE;
	}

} //FacilityFactoryImpl
