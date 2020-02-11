/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.facility;

import org.abchip.mimo.biz.BizPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.product.facility.FacilityFactory
 * @model kind="package"
 * @generated
 */
public interface FacilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "facility";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/product/facility";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-facility";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FacilityPackage eINSTANCE = org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.facility.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.facility.impl.ContainerImpl
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Container Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTAINER_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTAINER_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__FACILITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.facility.impl.ContainerGeoPointImpl <em>Container Geo Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.facility.impl.ContainerGeoPointImpl
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getContainerGeoPoint()
	 * @generated
	 */
	int CONTAINER_GEO_POINT = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_GEO_POINT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_GEO_POINT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_GEO_POINT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_GEO_POINT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Container Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_GEO_POINT__CONTAINER_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Geo Point Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_GEO_POINT__GEO_POINT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_GEO_POINT__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_GEO_POINT__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Container Geo Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_GEO_POINT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.facility.impl.ContainerTypeImpl <em>Container Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.facility.impl.ContainerTypeImpl
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getContainerType()
	 * @generated
	 */
	int CONTAINER_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Container Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__CONTAINER_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityImpl <em>Facility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityImpl
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacility()
	 * @generated
	 */
	int FACILITY = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__FACILITY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Closed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__CLOSED_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Days To Ship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__DEFAULT_DAYS_TO_SHIP = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Dimension Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__DEFAULT_DIMENSION_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Default Inventory Item Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__DEFAULT_INVENTORY_ITEM_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default Weight Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__DEFAULT_WEIGHT_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Facility Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__FACILITY_ATTRIBUTES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Facility Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__FACILITY_LOCATIONS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Facility Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__FACILITY_NAME = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Facility Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__FACILITY_SIZE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Facility Size Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__FACILITY_SIZE_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Facility Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__FACILITY_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Geo Point Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__GEO_POINT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Old Square Footage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__OLD_SQUARE_FOOTAGE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Opened Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__OPENED_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Owner Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__OWNER_PARTY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Parent Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__PARENT_FACILITY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Primary Facility Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__PRIMARY_FACILITY_GROUP_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Facility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityAttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityAttributeImpl
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityAttribute()
	 * @generated
	 */
	int FACILITY_ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ATTRIBUTE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ATTRIBUTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ATTRIBUTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ATTRIBUTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ATTRIBUTE__FACILITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ATTRIBUTE__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ATTRIBUTE__ATTR_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ATTRIBUTE__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ATTRIBUTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityCalendarImpl <em>Calendar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityCalendarImpl
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityCalendar()
	 * @generated
	 */
	int FACILITY_CALENDAR = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CALENDAR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CALENDAR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CALENDAR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CALENDAR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CALENDAR__FACILITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facility Calendar Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CALENDAR__FACILITY_CALENDAR_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Calendar Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CALENDAR__CALENDAR_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CALENDAR__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CALENDAR__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Calendar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CALENDAR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityCalendarTypeImpl <em>Calendar Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityCalendarTypeImpl
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityCalendarType()
	 * @generated
	 */
	int FACILITY_CALENDAR_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CALENDAR_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CALENDAR_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CALENDAR_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CALENDAR_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Facility Calendar Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CALENDAR_TYPE__FACILITY_CALENDAR_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CALENDAR_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CALENDAR_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Calendar Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CALENDAR_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityCarrierShipmentImpl <em>Carrier Shipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityCarrierShipmentImpl
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityCarrierShipment()
	 * @generated
	 */
	int FACILITY_CARRIER_SHIPMENT = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CARRIER_SHIPMENT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CARRIER_SHIPMENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CARRIER_SHIPMENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CARRIER_SHIPMENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CARRIER_SHIPMENT__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CARRIER_SHIPMENT__FACILITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shipment Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CARRIER_SHIPMENT__SHIPMENT_METHOD_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CARRIER_SHIPMENT__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Carrier Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CARRIER_SHIPMENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityContactMechImpl <em>Contact Mech</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityContactMechImpl
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityContactMech()
	 * @generated
	 */
	int FACILITY_CONTACT_MECH = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTACT_MECH__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTACT_MECH__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTACT_MECH__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTACT_MECH__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTACT_MECH__FACILITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTACT_MECH__CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTACT_MECH__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTACT_MECH__COMMENTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTACT_MECH__EXTENSION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTACT_MECH__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Contact Mech</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTACT_MECH_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityContactMechPurposeImpl <em>Contact Mech Purpose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityContactMechPurposeImpl
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityContactMechPurpose()
	 * @generated
	 */
	int FACILITY_CONTACT_MECH_PURPOSE = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTACT_MECH_PURPOSE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTACT_MECH_PURPOSE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTACT_MECH_PURPOSE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTACT_MECH_PURPOSE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Contact Mech Purpose Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTACT_MECH_PURPOSE__CONTACT_MECH_PURPOSE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTACT_MECH_PURPOSE__FACILITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTACT_MECH_PURPOSE__CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTACT_MECH_PURPOSE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTACT_MECH_PURPOSE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Contact Mech Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTACT_MECH_PURPOSE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityContentImpl
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityContent()
	 * @generated
	 */
	int FACILITY_CONTENT = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTENT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTENT__FACILITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTENT__CONTENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTENT__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTENT__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_CONTENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityGroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityGroupImpl
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityGroup()
	 * @generated
	 */
	int FACILITY_GROUP = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Facility Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP__FACILITY_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Facility Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP__FACILITY_GROUP_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Facility Group Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP__FACILITY_GROUP_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Primary Parent Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP__PRIMARY_PARENT_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityGroupMemberImpl <em>Group Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityGroupMemberImpl
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityGroupMember()
	 * @generated
	 */
	int FACILITY_GROUP_MEMBER = 12;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_MEMBER__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_MEMBER__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_MEMBER__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_MEMBER__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_MEMBER__FACILITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facility Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_MEMBER__FACILITY_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_MEMBER__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_MEMBER__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_MEMBER__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Group Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_MEMBER_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityGroupRoleImpl <em>Group Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityGroupRoleImpl
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityGroupRole()
	 * @generated
	 */
	int FACILITY_GROUP_ROLE = 13;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_ROLE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_ROLE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_ROLE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_ROLE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Facility Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_ROLE__FACILITY_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_ROLE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_ROLE__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Group Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_ROLE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityGroupRollupImpl <em>Group Rollup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityGroupRollupImpl
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityGroupRollup()
	 * @generated
	 */
	int FACILITY_GROUP_ROLLUP = 14;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_ROLLUP__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_ROLLUP__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_ROLLUP__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_ROLLUP__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Facility Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_ROLLUP__FACILITY_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Facility Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_ROLLUP__PARENT_FACILITY_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_ROLLUP__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_ROLLUP__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_ROLLUP__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Group Rollup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_ROLLUP_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityGroupTypeImpl <em>Group Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityGroupTypeImpl
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityGroupType()
	 * @generated
	 */
	int FACILITY_GROUP_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Facility Group Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_TYPE__FACILITY_GROUP_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_GROUP_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityLocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityLocationImpl
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityLocation()
	 * @generated
	 */
	int FACILITY_LOCATION = 16;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_LOCATION__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_LOCATION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_LOCATION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_LOCATION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_LOCATION__FACILITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_LOCATION__LOCATION_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aisle Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_LOCATION__AISLE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Area Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_LOCATION__AREA_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Geo Point Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_LOCATION__GEO_POINT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Level Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_LOCATION__LEVEL_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Location Type Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_LOCATION__LOCATION_TYPE_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Position Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_LOCATION__POSITION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_LOCATION__SECTION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_LOCATION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityLocationGeoPointImpl <em>Location Geo Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityLocationGeoPointImpl
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityLocationGeoPoint()
	 * @generated
	 */
	int FACILITY_LOCATION_GEO_POINT = 17;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_LOCATION_GEO_POINT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_LOCATION_GEO_POINT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_LOCATION_GEO_POINT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_LOCATION_GEO_POINT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Geo Point Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_LOCATION_GEO_POINT__GEO_POINT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_LOCATION_GEO_POINT__FACILITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_LOCATION_GEO_POINT__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Location Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_LOCATION_GEO_POINT__LOCATION_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_LOCATION_GEO_POINT__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Location Geo Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_LOCATION_GEO_POINT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityPartyImpl <em>Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPartyImpl
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityParty()
	 * @generated
	 */
	int FACILITY_PARTY = 18;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_PARTY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_PARTY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_PARTY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_PARTY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_PARTY__FACILITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_PARTY__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_PARTY__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_PARTY__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_PARTY__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_PARTY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityTypeImpl
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityType()
	 * @generated
	 */
	int FACILITY_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Facility Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_TYPE__FACILITY_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Facility Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_TYPE__FACILITY_TYPE_ATTRS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityTypeAttrImpl <em>Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityTypeAttrImpl
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityTypeAttr()
	 * @generated
	 */
	int FACILITY_TYPE_ATTR = 20;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_TYPE_ATTR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_TYPE_ATTR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_TYPE_ATTR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_TYPE_ATTR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Facility Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_TYPE_ATTR__FACILITY_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_TYPE_ATTR__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_TYPE_ATTR__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_TYPE_ATTR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.facility.impl.ProductFacilityImpl <em>Product Facility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.facility.impl.ProductFacilityImpl
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getProductFacility()
	 * @generated
	 */
	int PRODUCT_FACILITY = 21;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FACILITY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FACILITY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FACILITY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FACILITY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FACILITY__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FACILITY__FACILITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Days To Ship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FACILITY__DAYS_TO_SHIP = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Inventory Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FACILITY__LAST_INVENTORY_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Minimum Stock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FACILITY__MINIMUM_STOCK = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reorder Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FACILITY__REORDER_QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Requirement Method Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FACILITY__REQUIREMENT_METHOD_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Product Facility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FACILITY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.facility.impl.ProductFacilityLocationImpl <em>Product Facility Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.facility.impl.ProductFacilityLocationImpl
	 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getProductFacilityLocation()
	 * @generated
	 */
	int PRODUCT_FACILITY_LOCATION = 22;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FACILITY_LOCATION__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FACILITY_LOCATION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FACILITY_LOCATION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FACILITY_LOCATION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FACILITY_LOCATION__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FACILITY_LOCATION__FACILITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FACILITY_LOCATION__LOCATION_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Minimum Stock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FACILITY_LOCATION__MINIMUM_STOCK = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Move Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FACILITY_LOCATION__MOVE_QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Product Facility Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FACILITY_LOCATION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.facility.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.Container#getContainerId <em>Container Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Container#getContainerId()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_ContainerId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.Container#getContainerTypeId <em>Container Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Container#getContainerTypeId()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_ContainerTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.Container#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Container#getDescription()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.Container#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Container#getFacilityId()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_FacilityId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.facility.ContainerGeoPoint <em>Container Geo Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Geo Point</em>'.
	 * @see org.abchip.mimo.biz.product.facility.ContainerGeoPoint
	 * @generated
	 */
	EClass getContainerGeoPoint();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.ContainerGeoPoint#getContainerId <em>Container Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.ContainerGeoPoint#getContainerId()
	 * @see #getContainerGeoPoint()
	 * @generated
	 */
	EReference getContainerGeoPoint_ContainerId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.ContainerGeoPoint#getGeoPointId <em>Geo Point Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo Point Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.ContainerGeoPoint#getGeoPointId()
	 * @see #getContainerGeoPoint()
	 * @generated
	 */
	EReference getContainerGeoPoint_GeoPointId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.ContainerGeoPoint#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.facility.ContainerGeoPoint#getFromDate()
	 * @see #getContainerGeoPoint()
	 * @generated
	 */
	EAttribute getContainerGeoPoint_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.ContainerGeoPoint#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.facility.ContainerGeoPoint#getThruDate()
	 * @see #getContainerGeoPoint()
	 * @generated
	 */
	EAttribute getContainerGeoPoint_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.facility.ContainerType <em>Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Type</em>'.
	 * @see org.abchip.mimo.biz.product.facility.ContainerType
	 * @generated
	 */
	EClass getContainerType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.ContainerType#getContainerTypeId <em>Container Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.ContainerType#getContainerTypeId()
	 * @see #getContainerType()
	 * @generated
	 */
	EAttribute getContainerType_ContainerTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.ContainerType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.facility.ContainerType#getDescription()
	 * @see #getContainerType()
	 * @generated
	 */
	EAttribute getContainerType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.facility.Facility <em>Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facility</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Facility
	 * @generated
	 */
	EClass getFacility();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.Facility#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facility Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Facility#getFacilityId()
	 * @see #getFacility()
	 * @generated
	 */
	EAttribute getFacility_FacilityId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.Facility#getClosedDate <em>Closed Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closed Date</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Facility#getClosedDate()
	 * @see #getFacility()
	 * @generated
	 */
	EAttribute getFacility_ClosedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.Facility#getDefaultDaysToShip <em>Default Days To Ship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Days To Ship</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Facility#getDefaultDaysToShip()
	 * @see #getFacility()
	 * @generated
	 */
	EAttribute getFacility_DefaultDaysToShip();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.Facility#getDefaultDimensionUomId <em>Default Dimension Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Dimension Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Facility#getDefaultDimensionUomId()
	 * @see #getFacility()
	 * @generated
	 */
	EReference getFacility_DefaultDimensionUomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.Facility#getDefaultInventoryItemTypeId <em>Default Inventory Item Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Inventory Item Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Facility#getDefaultInventoryItemTypeId()
	 * @see #getFacility()
	 * @generated
	 */
	EReference getFacility_DefaultInventoryItemTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.Facility#getDefaultWeightUomId <em>Default Weight Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Weight Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Facility#getDefaultWeightUomId()
	 * @see #getFacility()
	 * @generated
	 */
	EReference getFacility_DefaultWeightUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.Facility#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Facility#getDescription()
	 * @see #getFacility()
	 * @generated
	 */
	EAttribute getFacility_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.facility.Facility#getFacilityAttributes <em>Facility Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facility Attributes</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Facility#getFacilityAttributes()
	 * @see #getFacility()
	 * @generated
	 */
	EReference getFacility_FacilityAttributes();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.facility.Facility#getFacilityLocations <em>Facility Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facility Locations</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Facility#getFacilityLocations()
	 * @see #getFacility()
	 * @generated
	 */
	EReference getFacility_FacilityLocations();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.Facility#getFacilityName <em>Facility Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facility Name</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Facility#getFacilityName()
	 * @see #getFacility()
	 * @generated
	 */
	EAttribute getFacility_FacilityName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.Facility#getFacilitySize <em>Facility Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facility Size</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Facility#getFacilitySize()
	 * @see #getFacility()
	 * @generated
	 */
	EAttribute getFacility_FacilitySize();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.Facility#getFacilitySizeUomId <em>Facility Size Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Size Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Facility#getFacilitySizeUomId()
	 * @see #getFacility()
	 * @generated
	 */
	EReference getFacility_FacilitySizeUomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.Facility#getFacilityTypeId <em>Facility Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Facility#getFacilityTypeId()
	 * @see #getFacility()
	 * @generated
	 */
	EReference getFacility_FacilityTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.Facility#getGeoPointId <em>Geo Point Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo Point Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Facility#getGeoPointId()
	 * @see #getFacility()
	 * @generated
	 */
	EReference getFacility_GeoPointId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.Facility#getOldSquareFootage <em>Old Square Footage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Square Footage</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Facility#getOldSquareFootage()
	 * @see #getFacility()
	 * @generated
	 */
	EAttribute getFacility_OldSquareFootage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.Facility#getOpenedDate <em>Opened Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opened Date</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Facility#getOpenedDate()
	 * @see #getFacility()
	 * @generated
	 */
	EAttribute getFacility_OpenedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.Facility#getOwnerPartyId <em>Owner Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner Party Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Facility#getOwnerPartyId()
	 * @see #getFacility()
	 * @generated
	 */
	EReference getFacility_OwnerPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.Facility#getParentFacilityId <em>Parent Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Facility Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Facility#getParentFacilityId()
	 * @see #getFacility()
	 * @generated
	 */
	EReference getFacility_ParentFacilityId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.Facility#getPrimaryFacilityGroupId <em>Primary Facility Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Facility Group Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Facility#getPrimaryFacilityGroupId()
	 * @see #getFacility()
	 * @generated
	 */
	EReference getFacility_PrimaryFacilityGroupId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.Facility#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.Facility#getProductStoreId()
	 * @see #getFacility()
	 * @generated
	 */
	EReference getFacility_ProductStoreId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.facility.FacilityAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityAttribute
	 * @generated
	 */
	EClass getFacilityAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityAttribute#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityAttribute#getFacilityId()
	 * @see #getFacilityAttribute()
	 * @generated
	 */
	EReference getFacilityAttribute_FacilityId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityAttribute#getAttrName()
	 * @see #getFacilityAttribute()
	 * @generated
	 */
	EAttribute getFacilityAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityAttribute#getAttrDescription()
	 * @see #getFacilityAttribute()
	 * @generated
	 */
	EAttribute getFacilityAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityAttribute#getAttrValue()
	 * @see #getFacilityAttribute()
	 * @generated
	 */
	EAttribute getFacilityAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.facility.FacilityCalendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityCalendar
	 * @generated
	 */
	EClass getFacilityCalendar();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityCalendar#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityCalendar#getFacilityId()
	 * @see #getFacilityCalendar()
	 * @generated
	 */
	EReference getFacilityCalendar_FacilityId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityCalendar#getCalendarId <em>Calendar Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calendar Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityCalendar#getCalendarId()
	 * @see #getFacilityCalendar()
	 * @generated
	 */
	EAttribute getFacilityCalendar_CalendarId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityCalendar#getFacilityCalendarTypeId <em>Facility Calendar Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Calendar Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityCalendar#getFacilityCalendarTypeId()
	 * @see #getFacilityCalendar()
	 * @generated
	 */
	EReference getFacilityCalendar_FacilityCalendarTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityCalendar#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityCalendar#getFromDate()
	 * @see #getFacilityCalendar()
	 * @generated
	 */
	EAttribute getFacilityCalendar_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityCalendar#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityCalendar#getThruDate()
	 * @see #getFacilityCalendar()
	 * @generated
	 */
	EAttribute getFacilityCalendar_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.facility.FacilityCalendarType <em>Calendar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calendar Type</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityCalendarType
	 * @generated
	 */
	EClass getFacilityCalendarType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityCalendarType#getFacilityCalendarTypeId <em>Facility Calendar Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facility Calendar Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityCalendarType#getFacilityCalendarTypeId()
	 * @see #getFacilityCalendarType()
	 * @generated
	 */
	EAttribute getFacilityCalendarType_FacilityCalendarTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityCalendarType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityCalendarType#getDescription()
	 * @see #getFacilityCalendarType()
	 * @generated
	 */
	EAttribute getFacilityCalendarType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityCalendarType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityCalendarType#getParentTypeId()
	 * @see #getFacilityCalendarType()
	 * @generated
	 */
	EAttribute getFacilityCalendarType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.facility.FacilityCarrierShipment <em>Carrier Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Shipment</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityCarrierShipment
	 * @generated
	 */
	EClass getFacilityCarrierShipment();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityCarrierShipment#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityCarrierShipment#getFacilityId()
	 * @see #getFacilityCarrierShipment()
	 * @generated
	 */
	EReference getFacilityCarrierShipment_FacilityId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityCarrierShipment#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityCarrierShipment#getPartyId()
	 * @see #getFacilityCarrierShipment()
	 * @generated
	 */
	EReference getFacilityCarrierShipment_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityCarrierShipment#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityCarrierShipment#getRoleTypeId()
	 * @see #getFacilityCarrierShipment()
	 * @generated
	 */
	EAttribute getFacilityCarrierShipment_RoleTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityCarrierShipment#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Method Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityCarrierShipment#getShipmentMethodTypeId()
	 * @see #getFacilityCarrierShipment()
	 * @generated
	 */
	EReference getFacilityCarrierShipment_ShipmentMethodTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.facility.FacilityContactMech <em>Contact Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Mech</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityContactMech
	 * @generated
	 */
	EClass getFacilityContactMech();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityContactMech#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityContactMech#getFacilityId()
	 * @see #getFacilityContactMech()
	 * @generated
	 */
	EReference getFacilityContactMech_FacilityId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityContactMech#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityContactMech#getContactMechId()
	 * @see #getFacilityContactMech()
	 * @generated
	 */
	EReference getFacilityContactMech_ContactMechId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityContactMech#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityContactMech#getFromDate()
	 * @see #getFacilityContactMech()
	 * @generated
	 */
	EAttribute getFacilityContactMech_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityContactMech#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityContactMech#getComments()
	 * @see #getFacilityContactMech()
	 * @generated
	 */
	EAttribute getFacilityContactMech_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityContactMech#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityContactMech#getExtension()
	 * @see #getFacilityContactMech()
	 * @generated
	 */
	EAttribute getFacilityContactMech_Extension();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityContactMech#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityContactMech#getThruDate()
	 * @see #getFacilityContactMech()
	 * @generated
	 */
	EAttribute getFacilityContactMech_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.facility.FacilityContactMechPurpose <em>Contact Mech Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Mech Purpose</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityContactMechPurpose
	 * @generated
	 */
	EClass getFacilityContactMechPurpose();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityContactMechPurpose#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityContactMechPurpose#getFacilityId()
	 * @see #getFacilityContactMechPurpose()
	 * @generated
	 */
	EReference getFacilityContactMechPurpose_FacilityId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityContactMechPurpose#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityContactMechPurpose#getContactMechId()
	 * @see #getFacilityContactMechPurpose()
	 * @generated
	 */
	EReference getFacilityContactMechPurpose_ContactMechId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityContactMechPurpose#getContactMechPurposeTypeId <em>Contact Mech Purpose Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Purpose Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityContactMechPurpose#getContactMechPurposeTypeId()
	 * @see #getFacilityContactMechPurpose()
	 * @generated
	 */
	EReference getFacilityContactMechPurpose_ContactMechPurposeTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityContactMechPurpose#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityContactMechPurpose#getFromDate()
	 * @see #getFacilityContactMechPurpose()
	 * @generated
	 */
	EAttribute getFacilityContactMechPurpose_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityContactMechPurpose#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityContactMechPurpose#getThruDate()
	 * @see #getFacilityContactMechPurpose()
	 * @generated
	 */
	EAttribute getFacilityContactMechPurpose_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.facility.FacilityContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityContent
	 * @generated
	 */
	EClass getFacilityContent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityContent#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityContent#getFacilityId()
	 * @see #getFacilityContent()
	 * @generated
	 */
	EReference getFacilityContent_FacilityId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityContent#getContentId <em>Content Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityContent#getContentId()
	 * @see #getFacilityContent()
	 * @generated
	 */
	EReference getFacilityContent_ContentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityContent#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityContent#getFromDate()
	 * @see #getFacilityContent()
	 * @generated
	 */
	EAttribute getFacilityContent_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityContent#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityContent#getThruDate()
	 * @see #getFacilityContent()
	 * @generated
	 */
	EAttribute getFacilityContent_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.facility.FacilityGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityGroup
	 * @generated
	 */
	EClass getFacilityGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityGroup#getFacilityGroupId <em>Facility Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facility Group Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityGroup#getFacilityGroupId()
	 * @see #getFacilityGroup()
	 * @generated
	 */
	EAttribute getFacilityGroup_FacilityGroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityGroup#getDescription()
	 * @see #getFacilityGroup()
	 * @generated
	 */
	EAttribute getFacilityGroup_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityGroup#getFacilityGroupName <em>Facility Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facility Group Name</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityGroup#getFacilityGroupName()
	 * @see #getFacilityGroup()
	 * @generated
	 */
	EAttribute getFacilityGroup_FacilityGroupName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityGroup#getFacilityGroupTypeId <em>Facility Group Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Group Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityGroup#getFacilityGroupTypeId()
	 * @see #getFacilityGroup()
	 * @generated
	 */
	EReference getFacilityGroup_FacilityGroupTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityGroup#getPrimaryParentGroupId <em>Primary Parent Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Parent Group Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityGroup#getPrimaryParentGroupId()
	 * @see #getFacilityGroup()
	 * @generated
	 */
	EReference getFacilityGroup_PrimaryParentGroupId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.facility.FacilityGroupMember <em>Group Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Member</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityGroupMember
	 * @generated
	 */
	EClass getFacilityGroupMember();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityGroupMember#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityGroupMember#getFacilityId()
	 * @see #getFacilityGroupMember()
	 * @generated
	 */
	EReference getFacilityGroupMember_FacilityId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityGroupMember#getFacilityGroupId <em>Facility Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Group Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityGroupMember#getFacilityGroupId()
	 * @see #getFacilityGroupMember()
	 * @generated
	 */
	EReference getFacilityGroupMember_FacilityGroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityGroupMember#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityGroupMember#getFromDate()
	 * @see #getFacilityGroupMember()
	 * @generated
	 */
	EAttribute getFacilityGroupMember_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityGroupMember#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityGroupMember#getSequenceNum()
	 * @see #getFacilityGroupMember()
	 * @generated
	 */
	EAttribute getFacilityGroupMember_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityGroupMember#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityGroupMember#getThruDate()
	 * @see #getFacilityGroupMember()
	 * @generated
	 */
	EAttribute getFacilityGroupMember_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.facility.FacilityGroupRole <em>Group Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Role</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityGroupRole
	 * @generated
	 */
	EClass getFacilityGroupRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityGroupRole#getFacilityGroupId <em>Facility Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Group Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityGroupRole#getFacilityGroupId()
	 * @see #getFacilityGroupRole()
	 * @generated
	 */
	EReference getFacilityGroupRole_FacilityGroupId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityGroupRole#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityGroupRole#getPartyId()
	 * @see #getFacilityGroupRole()
	 * @generated
	 */
	EReference getFacilityGroupRole_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityGroupRole#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityGroupRole#getRoleTypeId()
	 * @see #getFacilityGroupRole()
	 * @generated
	 */
	EReference getFacilityGroupRole_RoleTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.facility.FacilityGroupRollup <em>Group Rollup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Rollup</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityGroupRollup
	 * @generated
	 */
	EClass getFacilityGroupRollup();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityGroupRollup#getFacilityGroupId <em>Facility Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Group Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityGroupRollup#getFacilityGroupId()
	 * @see #getFacilityGroupRollup()
	 * @generated
	 */
	EReference getFacilityGroupRollup_FacilityGroupId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityGroupRollup#getParentFacilityGroupId <em>Parent Facility Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Facility Group Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityGroupRollup#getParentFacilityGroupId()
	 * @see #getFacilityGroupRollup()
	 * @generated
	 */
	EReference getFacilityGroupRollup_ParentFacilityGroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityGroupRollup#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityGroupRollup#getFromDate()
	 * @see #getFacilityGroupRollup()
	 * @generated
	 */
	EAttribute getFacilityGroupRollup_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityGroupRollup#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityGroupRollup#getSequenceNum()
	 * @see #getFacilityGroupRollup()
	 * @generated
	 */
	EAttribute getFacilityGroupRollup_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityGroupRollup#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityGroupRollup#getThruDate()
	 * @see #getFacilityGroupRollup()
	 * @generated
	 */
	EAttribute getFacilityGroupRollup_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.facility.FacilityGroupType <em>Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Type</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityGroupType
	 * @generated
	 */
	EClass getFacilityGroupType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityGroupType#getFacilityGroupTypeId <em>Facility Group Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facility Group Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityGroupType#getFacilityGroupTypeId()
	 * @see #getFacilityGroupType()
	 * @generated
	 */
	EAttribute getFacilityGroupType_FacilityGroupTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityGroupType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityGroupType#getDescription()
	 * @see #getFacilityGroupType()
	 * @generated
	 */
	EAttribute getFacilityGroupType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.facility.FacilityLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityLocation
	 * @generated
	 */
	EClass getFacilityLocation();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityLocation#getFacilityId()
	 * @see #getFacilityLocation()
	 * @generated
	 */
	EReference getFacilityLocation_FacilityId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getLocationSeqId <em>Location Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Seq Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityLocation#getLocationSeqId()
	 * @see #getFacilityLocation()
	 * @generated
	 */
	EAttribute getFacilityLocation_LocationSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getAisleId <em>Aisle Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aisle Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityLocation#getAisleId()
	 * @see #getFacilityLocation()
	 * @generated
	 */
	EAttribute getFacilityLocation_AisleId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getAreaId <em>Area Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityLocation#getAreaId()
	 * @see #getFacilityLocation()
	 * @generated
	 */
	EAttribute getFacilityLocation_AreaId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getGeoPointId <em>Geo Point Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo Point Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityLocation#getGeoPointId()
	 * @see #getFacilityLocation()
	 * @generated
	 */
	EReference getFacilityLocation_GeoPointId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getLevelId <em>Level Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityLocation#getLevelId()
	 * @see #getFacilityLocation()
	 * @generated
	 */
	EAttribute getFacilityLocation_LevelId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getLocationTypeEnumId <em>Location Type Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location Type Enum Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityLocation#getLocationTypeEnumId()
	 * @see #getFacilityLocation()
	 * @generated
	 */
	EReference getFacilityLocation_LocationTypeEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getPositionId <em>Position Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityLocation#getPositionId()
	 * @see #getFacilityLocation()
	 * @generated
	 */
	EAttribute getFacilityLocation_PositionId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityLocation#getSectionId <em>Section Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Section Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityLocation#getSectionId()
	 * @see #getFacilityLocation()
	 * @generated
	 */
	EAttribute getFacilityLocation_SectionId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.facility.FacilityLocationGeoPoint <em>Location Geo Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Geo Point</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityLocationGeoPoint
	 * @generated
	 */
	EClass getFacilityLocationGeoPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityLocationGeoPoint#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facility Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityLocationGeoPoint#getFacilityId()
	 * @see #getFacilityLocationGeoPoint()
	 * @generated
	 */
	EAttribute getFacilityLocationGeoPoint_FacilityId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityLocationGeoPoint#getLocationSeqId <em>Location Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Seq Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityLocationGeoPoint#getLocationSeqId()
	 * @see #getFacilityLocationGeoPoint()
	 * @generated
	 */
	EAttribute getFacilityLocationGeoPoint_LocationSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityLocationGeoPoint#getGeoPointId <em>Geo Point Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo Point Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityLocationGeoPoint#getGeoPointId()
	 * @see #getFacilityLocationGeoPoint()
	 * @generated
	 */
	EReference getFacilityLocationGeoPoint_GeoPointId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityLocationGeoPoint#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityLocationGeoPoint#getFromDate()
	 * @see #getFacilityLocationGeoPoint()
	 * @generated
	 */
	EAttribute getFacilityLocationGeoPoint_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityLocationGeoPoint#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityLocationGeoPoint#getThruDate()
	 * @see #getFacilityLocationGeoPoint()
	 * @generated
	 */
	EAttribute getFacilityLocationGeoPoint_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.facility.FacilityParty <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityParty
	 * @generated
	 */
	EClass getFacilityParty();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityParty#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityParty#getFacilityId()
	 * @see #getFacilityParty()
	 * @generated
	 */
	EReference getFacilityParty_FacilityId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityParty#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityParty#getPartyId()
	 * @see #getFacilityParty()
	 * @generated
	 */
	EReference getFacilityParty_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityParty#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityParty#getRoleTypeId()
	 * @see #getFacilityParty()
	 * @generated
	 */
	EReference getFacilityParty_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityParty#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityParty#getFromDate()
	 * @see #getFacilityParty()
	 * @generated
	 */
	EAttribute getFacilityParty_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityParty#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityParty#getThruDate()
	 * @see #getFacilityParty()
	 * @generated
	 */
	EAttribute getFacilityParty_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.facility.FacilityType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityType
	 * @generated
	 */
	EClass getFacilityType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityType#getFacilityTypeId <em>Facility Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facility Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityType#getFacilityTypeId()
	 * @see #getFacilityType()
	 * @generated
	 */
	EAttribute getFacilityType_FacilityTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityType#getDescription()
	 * @see #getFacilityType()
	 * @generated
	 */
	EAttribute getFacilityType_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.facility.FacilityType#getFacilityTypeAttrs <em>Facility Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facility Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityType#getFacilityTypeAttrs()
	 * @see #getFacilityType()
	 * @generated
	 */
	EReference getFacilityType_FacilityTypeAttrs();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityType#isHasTable()
	 * @see #getFacilityType()
	 * @generated
	 */
	EAttribute getFacilityType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityType#getParentTypeId()
	 * @see #getFacilityType()
	 * @generated
	 */
	EReference getFacilityType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.facility.FacilityTypeAttr <em>Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Attr</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityTypeAttr
	 * @generated
	 */
	EClass getFacilityTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.FacilityTypeAttr#getFacilityTypeId <em>Facility Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityTypeAttr#getFacilityTypeId()
	 * @see #getFacilityTypeAttr()
	 * @generated
	 */
	EReference getFacilityTypeAttr_FacilityTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityTypeAttr#getAttrName()
	 * @see #getFacilityTypeAttr()
	 * @generated
	 */
	EAttribute getFacilityTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.FacilityTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.facility.FacilityTypeAttr#getDescription()
	 * @see #getFacilityTypeAttr()
	 * @generated
	 */
	EAttribute getFacilityTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.facility.ProductFacility <em>Product Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Facility</em>'.
	 * @see org.abchip.mimo.biz.product.facility.ProductFacility
	 * @generated
	 */
	EClass getProductFacility();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.ProductFacility#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.ProductFacility#getProductId()
	 * @see #getProductFacility()
	 * @generated
	 */
	EReference getProductFacility_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.ProductFacility#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.ProductFacility#getFacilityId()
	 * @see #getProductFacility()
	 * @generated
	 */
	EReference getProductFacility_FacilityId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.ProductFacility#getDaysToShip <em>Days To Ship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Days To Ship</em>'.
	 * @see org.abchip.mimo.biz.product.facility.ProductFacility#getDaysToShip()
	 * @see #getProductFacility()
	 * @generated
	 */
	EAttribute getProductFacility_DaysToShip();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.ProductFacility#getLastInventoryCount <em>Last Inventory Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Inventory Count</em>'.
	 * @see org.abchip.mimo.biz.product.facility.ProductFacility#getLastInventoryCount()
	 * @see #getProductFacility()
	 * @generated
	 */
	EAttribute getProductFacility_LastInventoryCount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.ProductFacility#getMinimumStock <em>Minimum Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Stock</em>'.
	 * @see org.abchip.mimo.biz.product.facility.ProductFacility#getMinimumStock()
	 * @see #getProductFacility()
	 * @generated
	 */
	EAttribute getProductFacility_MinimumStock();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.ProductFacility#getReorderQuantity <em>Reorder Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reorder Quantity</em>'.
	 * @see org.abchip.mimo.biz.product.facility.ProductFacility#getReorderQuantity()
	 * @see #getProductFacility()
	 * @generated
	 */
	EAttribute getProductFacility_ReorderQuantity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.ProductFacility#getRequirementMethodEnumId <em>Requirement Method Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement Method Enum Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.ProductFacility#getRequirementMethodEnumId()
	 * @see #getProductFacility()
	 * @generated
	 */
	EReference getProductFacility_RequirementMethodEnumId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.facility.ProductFacilityLocation <em>Product Facility Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Facility Location</em>'.
	 * @see org.abchip.mimo.biz.product.facility.ProductFacilityLocation
	 * @generated
	 */
	EClass getProductFacilityLocation();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.ProductFacilityLocation#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.ProductFacilityLocation#getProductId()
	 * @see #getProductFacilityLocation()
	 * @generated
	 */
	EReference getProductFacilityLocation_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.facility.ProductFacilityLocation#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.ProductFacilityLocation#getFacilityId()
	 * @see #getProductFacilityLocation()
	 * @generated
	 */
	EReference getProductFacilityLocation_FacilityId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.ProductFacilityLocation#getLocationSeqId <em>Location Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Seq Id</em>'.
	 * @see org.abchip.mimo.biz.product.facility.ProductFacilityLocation#getLocationSeqId()
	 * @see #getProductFacilityLocation()
	 * @generated
	 */
	EAttribute getProductFacilityLocation_LocationSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.ProductFacilityLocation#getMinimumStock <em>Minimum Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Stock</em>'.
	 * @see org.abchip.mimo.biz.product.facility.ProductFacilityLocation#getMinimumStock()
	 * @see #getProductFacilityLocation()
	 * @generated
	 */
	EAttribute getProductFacilityLocation_MinimumStock();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.facility.ProductFacilityLocation#getMoveQuantity <em>Move Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Move Quantity</em>'.
	 * @see org.abchip.mimo.biz.product.facility.ProductFacilityLocation#getMoveQuantity()
	 * @see #getProductFacilityLocation()
	 * @generated
	 */
	EAttribute getProductFacilityLocation_MoveQuantity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FacilityFactory getFacilityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.facility.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.facility.impl.ContainerImpl
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Container Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__CONTAINER_ID = eINSTANCE.getContainer_ContainerId();

		/**
		 * The meta object literal for the '<em><b>Container Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CONTAINER_TYPE_ID = eINSTANCE.getContainer_ContainerTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__DESCRIPTION = eINSTANCE.getContainer_Description();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__FACILITY_ID = eINSTANCE.getContainer_FacilityId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.facility.impl.ContainerGeoPointImpl <em>Container Geo Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.facility.impl.ContainerGeoPointImpl
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getContainerGeoPoint()
		 * @generated
		 */
		EClass CONTAINER_GEO_POINT = eINSTANCE.getContainerGeoPoint();

		/**
		 * The meta object literal for the '<em><b>Container Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_GEO_POINT__CONTAINER_ID = eINSTANCE.getContainerGeoPoint_ContainerId();

		/**
		 * The meta object literal for the '<em><b>Geo Point Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_GEO_POINT__GEO_POINT_ID = eINSTANCE.getContainerGeoPoint_GeoPointId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_GEO_POINT__FROM_DATE = eINSTANCE.getContainerGeoPoint_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_GEO_POINT__THRU_DATE = eINSTANCE.getContainerGeoPoint_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.facility.impl.ContainerTypeImpl <em>Container Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.facility.impl.ContainerTypeImpl
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getContainerType()
		 * @generated
		 */
		EClass CONTAINER_TYPE = eINSTANCE.getContainerType();

		/**
		 * The meta object literal for the '<em><b>Container Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_TYPE__CONTAINER_TYPE_ID = eINSTANCE.getContainerType_ContainerTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_TYPE__DESCRIPTION = eINSTANCE.getContainerType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityImpl <em>Facility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityImpl
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacility()
		 * @generated
		 */
		EClass FACILITY = eINSTANCE.getFacility();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY__FACILITY_ID = eINSTANCE.getFacility_FacilityId();

		/**
		 * The meta object literal for the '<em><b>Closed Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY__CLOSED_DATE = eINSTANCE.getFacility_ClosedDate();

		/**
		 * The meta object literal for the '<em><b>Default Days To Ship</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY__DEFAULT_DAYS_TO_SHIP = eINSTANCE.getFacility_DefaultDaysToShip();

		/**
		 * The meta object literal for the '<em><b>Default Dimension Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY__DEFAULT_DIMENSION_UOM_ID = eINSTANCE.getFacility_DefaultDimensionUomId();

		/**
		 * The meta object literal for the '<em><b>Default Inventory Item Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY__DEFAULT_INVENTORY_ITEM_TYPE_ID = eINSTANCE.getFacility_DefaultInventoryItemTypeId();

		/**
		 * The meta object literal for the '<em><b>Default Weight Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY__DEFAULT_WEIGHT_UOM_ID = eINSTANCE.getFacility_DefaultWeightUomId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY__DESCRIPTION = eINSTANCE.getFacility_Description();

		/**
		 * The meta object literal for the '<em><b>Facility Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY__FACILITY_ATTRIBUTES = eINSTANCE.getFacility_FacilityAttributes();

		/**
		 * The meta object literal for the '<em><b>Facility Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY__FACILITY_LOCATIONS = eINSTANCE.getFacility_FacilityLocations();

		/**
		 * The meta object literal for the '<em><b>Facility Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY__FACILITY_NAME = eINSTANCE.getFacility_FacilityName();

		/**
		 * The meta object literal for the '<em><b>Facility Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY__FACILITY_SIZE = eINSTANCE.getFacility_FacilitySize();

		/**
		 * The meta object literal for the '<em><b>Facility Size Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY__FACILITY_SIZE_UOM_ID = eINSTANCE.getFacility_FacilitySizeUomId();

		/**
		 * The meta object literal for the '<em><b>Facility Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY__FACILITY_TYPE_ID = eINSTANCE.getFacility_FacilityTypeId();

		/**
		 * The meta object literal for the '<em><b>Geo Point Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY__GEO_POINT_ID = eINSTANCE.getFacility_GeoPointId();

		/**
		 * The meta object literal for the '<em><b>Old Square Footage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY__OLD_SQUARE_FOOTAGE = eINSTANCE.getFacility_OldSquareFootage();

		/**
		 * The meta object literal for the '<em><b>Opened Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY__OPENED_DATE = eINSTANCE.getFacility_OpenedDate();

		/**
		 * The meta object literal for the '<em><b>Owner Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY__OWNER_PARTY_ID = eINSTANCE.getFacility_OwnerPartyId();

		/**
		 * The meta object literal for the '<em><b>Parent Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY__PARENT_FACILITY_ID = eINSTANCE.getFacility_ParentFacilityId();

		/**
		 * The meta object literal for the '<em><b>Primary Facility Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY__PRIMARY_FACILITY_GROUP_ID = eINSTANCE.getFacility_PrimaryFacilityGroupId();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY__PRODUCT_STORE_ID = eINSTANCE.getFacility_ProductStoreId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityAttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityAttributeImpl
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityAttribute()
		 * @generated
		 */
		EClass FACILITY_ATTRIBUTE = eINSTANCE.getFacilityAttribute();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_ATTRIBUTE__FACILITY_ID = eINSTANCE.getFacilityAttribute_FacilityId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_ATTRIBUTE__ATTR_NAME = eINSTANCE.getFacilityAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getFacilityAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getFacilityAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityCalendarImpl <em>Calendar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityCalendarImpl
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityCalendar()
		 * @generated
		 */
		EClass FACILITY_CALENDAR = eINSTANCE.getFacilityCalendar();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_CALENDAR__FACILITY_ID = eINSTANCE.getFacilityCalendar_FacilityId();

		/**
		 * The meta object literal for the '<em><b>Calendar Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_CALENDAR__CALENDAR_ID = eINSTANCE.getFacilityCalendar_CalendarId();

		/**
		 * The meta object literal for the '<em><b>Facility Calendar Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_CALENDAR__FACILITY_CALENDAR_TYPE_ID = eINSTANCE.getFacilityCalendar_FacilityCalendarTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_CALENDAR__FROM_DATE = eINSTANCE.getFacilityCalendar_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_CALENDAR__THRU_DATE = eINSTANCE.getFacilityCalendar_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityCalendarTypeImpl <em>Calendar Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityCalendarTypeImpl
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityCalendarType()
		 * @generated
		 */
		EClass FACILITY_CALENDAR_TYPE = eINSTANCE.getFacilityCalendarType();

		/**
		 * The meta object literal for the '<em><b>Facility Calendar Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_CALENDAR_TYPE__FACILITY_CALENDAR_TYPE_ID = eINSTANCE.getFacilityCalendarType_FacilityCalendarTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_CALENDAR_TYPE__DESCRIPTION = eINSTANCE.getFacilityCalendarType_Description();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_CALENDAR_TYPE__PARENT_TYPE_ID = eINSTANCE.getFacilityCalendarType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityCarrierShipmentImpl <em>Carrier Shipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityCarrierShipmentImpl
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityCarrierShipment()
		 * @generated
		 */
		EClass FACILITY_CARRIER_SHIPMENT = eINSTANCE.getFacilityCarrierShipment();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_CARRIER_SHIPMENT__FACILITY_ID = eINSTANCE.getFacilityCarrierShipment_FacilityId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_CARRIER_SHIPMENT__PARTY_ID = eINSTANCE.getFacilityCarrierShipment_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_CARRIER_SHIPMENT__ROLE_TYPE_ID = eINSTANCE.getFacilityCarrierShipment_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Shipment Method Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_CARRIER_SHIPMENT__SHIPMENT_METHOD_TYPE_ID = eINSTANCE.getFacilityCarrierShipment_ShipmentMethodTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityContactMechImpl <em>Contact Mech</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityContactMechImpl
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityContactMech()
		 * @generated
		 */
		EClass FACILITY_CONTACT_MECH = eINSTANCE.getFacilityContactMech();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_CONTACT_MECH__FACILITY_ID = eINSTANCE.getFacilityContactMech_FacilityId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_CONTACT_MECH__CONTACT_MECH_ID = eINSTANCE.getFacilityContactMech_ContactMechId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_CONTACT_MECH__FROM_DATE = eINSTANCE.getFacilityContactMech_FromDate();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_CONTACT_MECH__COMMENTS = eINSTANCE.getFacilityContactMech_Comments();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_CONTACT_MECH__EXTENSION = eINSTANCE.getFacilityContactMech_Extension();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_CONTACT_MECH__THRU_DATE = eINSTANCE.getFacilityContactMech_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityContactMechPurposeImpl <em>Contact Mech Purpose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityContactMechPurposeImpl
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityContactMechPurpose()
		 * @generated
		 */
		EClass FACILITY_CONTACT_MECH_PURPOSE = eINSTANCE.getFacilityContactMechPurpose();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_CONTACT_MECH_PURPOSE__FACILITY_ID = eINSTANCE.getFacilityContactMechPurpose_FacilityId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_CONTACT_MECH_PURPOSE__CONTACT_MECH_ID = eINSTANCE.getFacilityContactMechPurpose_ContactMechId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Purpose Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_CONTACT_MECH_PURPOSE__CONTACT_MECH_PURPOSE_TYPE_ID = eINSTANCE.getFacilityContactMechPurpose_ContactMechPurposeTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_CONTACT_MECH_PURPOSE__FROM_DATE = eINSTANCE.getFacilityContactMechPurpose_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_CONTACT_MECH_PURPOSE__THRU_DATE = eINSTANCE.getFacilityContactMechPurpose_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityContentImpl
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityContent()
		 * @generated
		 */
		EClass FACILITY_CONTENT = eINSTANCE.getFacilityContent();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_CONTENT__FACILITY_ID = eINSTANCE.getFacilityContent_FacilityId();

		/**
		 * The meta object literal for the '<em><b>Content Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_CONTENT__CONTENT_ID = eINSTANCE.getFacilityContent_ContentId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_CONTENT__FROM_DATE = eINSTANCE.getFacilityContent_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_CONTENT__THRU_DATE = eINSTANCE.getFacilityContent_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityGroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityGroupImpl
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityGroup()
		 * @generated
		 */
		EClass FACILITY_GROUP = eINSTANCE.getFacilityGroup();

		/**
		 * The meta object literal for the '<em><b>Facility Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_GROUP__FACILITY_GROUP_ID = eINSTANCE.getFacilityGroup_FacilityGroupId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_GROUP__DESCRIPTION = eINSTANCE.getFacilityGroup_Description();

		/**
		 * The meta object literal for the '<em><b>Facility Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_GROUP__FACILITY_GROUP_NAME = eINSTANCE.getFacilityGroup_FacilityGroupName();

		/**
		 * The meta object literal for the '<em><b>Facility Group Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_GROUP__FACILITY_GROUP_TYPE_ID = eINSTANCE.getFacilityGroup_FacilityGroupTypeId();

		/**
		 * The meta object literal for the '<em><b>Primary Parent Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_GROUP__PRIMARY_PARENT_GROUP_ID = eINSTANCE.getFacilityGroup_PrimaryParentGroupId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityGroupMemberImpl <em>Group Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityGroupMemberImpl
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityGroupMember()
		 * @generated
		 */
		EClass FACILITY_GROUP_MEMBER = eINSTANCE.getFacilityGroupMember();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_GROUP_MEMBER__FACILITY_ID = eINSTANCE.getFacilityGroupMember_FacilityId();

		/**
		 * The meta object literal for the '<em><b>Facility Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_GROUP_MEMBER__FACILITY_GROUP_ID = eINSTANCE.getFacilityGroupMember_FacilityGroupId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_GROUP_MEMBER__FROM_DATE = eINSTANCE.getFacilityGroupMember_FromDate();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_GROUP_MEMBER__SEQUENCE_NUM = eINSTANCE.getFacilityGroupMember_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_GROUP_MEMBER__THRU_DATE = eINSTANCE.getFacilityGroupMember_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityGroupRoleImpl <em>Group Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityGroupRoleImpl
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityGroupRole()
		 * @generated
		 */
		EClass FACILITY_GROUP_ROLE = eINSTANCE.getFacilityGroupRole();

		/**
		 * The meta object literal for the '<em><b>Facility Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_GROUP_ROLE__FACILITY_GROUP_ID = eINSTANCE.getFacilityGroupRole_FacilityGroupId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_GROUP_ROLE__PARTY_ID = eINSTANCE.getFacilityGroupRole_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_GROUP_ROLE__ROLE_TYPE_ID = eINSTANCE.getFacilityGroupRole_RoleTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityGroupRollupImpl <em>Group Rollup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityGroupRollupImpl
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityGroupRollup()
		 * @generated
		 */
		EClass FACILITY_GROUP_ROLLUP = eINSTANCE.getFacilityGroupRollup();

		/**
		 * The meta object literal for the '<em><b>Facility Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_GROUP_ROLLUP__FACILITY_GROUP_ID = eINSTANCE.getFacilityGroupRollup_FacilityGroupId();

		/**
		 * The meta object literal for the '<em><b>Parent Facility Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_GROUP_ROLLUP__PARENT_FACILITY_GROUP_ID = eINSTANCE.getFacilityGroupRollup_ParentFacilityGroupId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_GROUP_ROLLUP__FROM_DATE = eINSTANCE.getFacilityGroupRollup_FromDate();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_GROUP_ROLLUP__SEQUENCE_NUM = eINSTANCE.getFacilityGroupRollup_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_GROUP_ROLLUP__THRU_DATE = eINSTANCE.getFacilityGroupRollup_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityGroupTypeImpl <em>Group Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityGroupTypeImpl
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityGroupType()
		 * @generated
		 */
		EClass FACILITY_GROUP_TYPE = eINSTANCE.getFacilityGroupType();

		/**
		 * The meta object literal for the '<em><b>Facility Group Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_GROUP_TYPE__FACILITY_GROUP_TYPE_ID = eINSTANCE.getFacilityGroupType_FacilityGroupTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_GROUP_TYPE__DESCRIPTION = eINSTANCE.getFacilityGroupType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityLocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityLocationImpl
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityLocation()
		 * @generated
		 */
		EClass FACILITY_LOCATION = eINSTANCE.getFacilityLocation();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_LOCATION__FACILITY_ID = eINSTANCE.getFacilityLocation_FacilityId();

		/**
		 * The meta object literal for the '<em><b>Location Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_LOCATION__LOCATION_SEQ_ID = eINSTANCE.getFacilityLocation_LocationSeqId();

		/**
		 * The meta object literal for the '<em><b>Aisle Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_LOCATION__AISLE_ID = eINSTANCE.getFacilityLocation_AisleId();

		/**
		 * The meta object literal for the '<em><b>Area Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_LOCATION__AREA_ID = eINSTANCE.getFacilityLocation_AreaId();

		/**
		 * The meta object literal for the '<em><b>Geo Point Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_LOCATION__GEO_POINT_ID = eINSTANCE.getFacilityLocation_GeoPointId();

		/**
		 * The meta object literal for the '<em><b>Level Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_LOCATION__LEVEL_ID = eINSTANCE.getFacilityLocation_LevelId();

		/**
		 * The meta object literal for the '<em><b>Location Type Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_LOCATION__LOCATION_TYPE_ENUM_ID = eINSTANCE.getFacilityLocation_LocationTypeEnumId();

		/**
		 * The meta object literal for the '<em><b>Position Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_LOCATION__POSITION_ID = eINSTANCE.getFacilityLocation_PositionId();

		/**
		 * The meta object literal for the '<em><b>Section Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_LOCATION__SECTION_ID = eINSTANCE.getFacilityLocation_SectionId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityLocationGeoPointImpl <em>Location Geo Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityLocationGeoPointImpl
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityLocationGeoPoint()
		 * @generated
		 */
		EClass FACILITY_LOCATION_GEO_POINT = eINSTANCE.getFacilityLocationGeoPoint();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_LOCATION_GEO_POINT__FACILITY_ID = eINSTANCE.getFacilityLocationGeoPoint_FacilityId();

		/**
		 * The meta object literal for the '<em><b>Location Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_LOCATION_GEO_POINT__LOCATION_SEQ_ID = eINSTANCE.getFacilityLocationGeoPoint_LocationSeqId();

		/**
		 * The meta object literal for the '<em><b>Geo Point Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_LOCATION_GEO_POINT__GEO_POINT_ID = eINSTANCE.getFacilityLocationGeoPoint_GeoPointId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_LOCATION_GEO_POINT__FROM_DATE = eINSTANCE.getFacilityLocationGeoPoint_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_LOCATION_GEO_POINT__THRU_DATE = eINSTANCE.getFacilityLocationGeoPoint_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityPartyImpl <em>Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPartyImpl
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityParty()
		 * @generated
		 */
		EClass FACILITY_PARTY = eINSTANCE.getFacilityParty();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_PARTY__FACILITY_ID = eINSTANCE.getFacilityParty_FacilityId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_PARTY__PARTY_ID = eINSTANCE.getFacilityParty_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_PARTY__ROLE_TYPE_ID = eINSTANCE.getFacilityParty_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_PARTY__FROM_DATE = eINSTANCE.getFacilityParty_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_PARTY__THRU_DATE = eINSTANCE.getFacilityParty_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityTypeImpl
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityType()
		 * @generated
		 */
		EClass FACILITY_TYPE = eINSTANCE.getFacilityType();

		/**
		 * The meta object literal for the '<em><b>Facility Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_TYPE__FACILITY_TYPE_ID = eINSTANCE.getFacilityType_FacilityTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_TYPE__DESCRIPTION = eINSTANCE.getFacilityType_Description();

		/**
		 * The meta object literal for the '<em><b>Facility Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_TYPE__FACILITY_TYPE_ATTRS = eINSTANCE.getFacilityType_FacilityTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_TYPE__HAS_TABLE = eINSTANCE.getFacilityType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_TYPE__PARENT_TYPE_ID = eINSTANCE.getFacilityType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.facility.impl.FacilityTypeAttrImpl <em>Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityTypeAttrImpl
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getFacilityTypeAttr()
		 * @generated
		 */
		EClass FACILITY_TYPE_ATTR = eINSTANCE.getFacilityTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Facility Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_TYPE_ATTR__FACILITY_TYPE_ID = eINSTANCE.getFacilityTypeAttr_FacilityTypeId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_TYPE_ATTR__ATTR_NAME = eINSTANCE.getFacilityTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_TYPE_ATTR__DESCRIPTION = eINSTANCE.getFacilityTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.facility.impl.ProductFacilityImpl <em>Product Facility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.facility.impl.ProductFacilityImpl
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getProductFacility()
		 * @generated
		 */
		EClass PRODUCT_FACILITY = eINSTANCE.getProductFacility();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FACILITY__PRODUCT_ID = eINSTANCE.getProductFacility_ProductId();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FACILITY__FACILITY_ID = eINSTANCE.getProductFacility_FacilityId();

		/**
		 * The meta object literal for the '<em><b>Days To Ship</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FACILITY__DAYS_TO_SHIP = eINSTANCE.getProductFacility_DaysToShip();

		/**
		 * The meta object literal for the '<em><b>Last Inventory Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FACILITY__LAST_INVENTORY_COUNT = eINSTANCE.getProductFacility_LastInventoryCount();

		/**
		 * The meta object literal for the '<em><b>Minimum Stock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FACILITY__MINIMUM_STOCK = eINSTANCE.getProductFacility_MinimumStock();

		/**
		 * The meta object literal for the '<em><b>Reorder Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FACILITY__REORDER_QUANTITY = eINSTANCE.getProductFacility_ReorderQuantity();

		/**
		 * The meta object literal for the '<em><b>Requirement Method Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FACILITY__REQUIREMENT_METHOD_ENUM_ID = eINSTANCE.getProductFacility_RequirementMethodEnumId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.facility.impl.ProductFacilityLocationImpl <em>Product Facility Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.facility.impl.ProductFacilityLocationImpl
		 * @see org.abchip.mimo.biz.product.facility.impl.FacilityPackageImpl#getProductFacilityLocation()
		 * @generated
		 */
		EClass PRODUCT_FACILITY_LOCATION = eINSTANCE.getProductFacilityLocation();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FACILITY_LOCATION__PRODUCT_ID = eINSTANCE.getProductFacilityLocation_ProductId();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FACILITY_LOCATION__FACILITY_ID = eINSTANCE.getProductFacilityLocation_FacilityId();

		/**
		 * The meta object literal for the '<em><b>Location Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FACILITY_LOCATION__LOCATION_SEQ_ID = eINSTANCE.getProductFacilityLocation_LocationSeqId();

		/**
		 * The meta object literal for the '<em><b>Minimum Stock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FACILITY_LOCATION__MINIMUM_STOCK = eINSTANCE.getProductFacilityLocation_MinimumStock();

		/**
		 * The meta object literal for the '<em><b>Move Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FACILITY_LOCATION__MOVE_QUANTITY = eINSTANCE.getProductFacilityLocation_MoveQuantity();

	}

} //FacilityPackage
