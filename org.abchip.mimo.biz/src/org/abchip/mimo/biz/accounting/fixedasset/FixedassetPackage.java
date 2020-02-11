/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.fixedasset;

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
 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetFactory
 * @model kind="package"
 * @generated
 */
public interface FixedassetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fixedasset";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/accounting/fixedasset";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-fixedasset";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FixedassetPackage eINSTANCE = org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.AccommodationClassImpl <em>Accommodation Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.AccommodationClassImpl
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getAccommodationClass()
	 * @generated
	 */
	int ACCOMMODATION_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_CLASS__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_CLASS__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_CLASS__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_CLASS__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Accommodation Class Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_CLASS__ACCOMMODATION_CLASS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_CLASS__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Class Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_CLASS__PARENT_CLASS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Accommodation Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_CLASS_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.AccommodationMapImpl <em>Accommodation Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.AccommodationMapImpl
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getAccommodationMap()
	 * @generated
	 */
	int ACCOMMODATION_MAP = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_MAP__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_MAP__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_MAP__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_MAP__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Accommodation Map Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_MAP__ACCOMMODATION_MAP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accommodation Class Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_MAP__ACCOMMODATION_CLASS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Accommodation Map Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_MAP__ACCOMMODATION_MAP_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_MAP__FIXED_ASSET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Number Of Spaces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_MAP__NUMBER_OF_SPACES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Accommodation Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_MAP_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.AccommodationMapTypeImpl <em>Accommodation Map Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.AccommodationMapTypeImpl
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getAccommodationMapType()
	 * @generated
	 */
	int ACCOMMODATION_MAP_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_MAP_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_MAP_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_MAP_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_MAP_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Accommodation Map Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_MAP_TYPE__ACCOMMODATION_MAP_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_MAP_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Accommodation Map Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOMMODATION_MAP_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl <em>Fixed Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAsset()
	 * @generated
	 */
	int FIXED_ASSET = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fixed Asset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__FIXED_ASSET_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Acquire Order Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__ACQUIRE_ORDER_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Acquire Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__ACQUIRE_ORDER_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Actual End Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__ACTUAL_END_OF_LIFE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Calendar Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__CALENDAR_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Class Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__CLASS_ENUM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Date Acquired</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__DATE_ACQUIRED = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Date Last Serviced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__DATE_LAST_SERVICED = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Date Next Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__DATE_NEXT_SERVICE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Depreciation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__DEPRECIATION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Expected End Of Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__EXPECTED_END_OF_LIFE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Fixed Asset Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__FIXED_ASSET_ATTRIBUTES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Fixed Asset Idents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__FIXED_ASSET_IDENTS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Fixed Asset Maints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__FIXED_ASSET_MAINTS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Fixed Asset Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__FIXED_ASSET_NAME = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Fixed Asset Registrations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__FIXED_ASSET_REGISTRATIONS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Fixed Asset Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__FIXED_ASSET_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Instance Of Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__INSTANCE_OF_PRODUCT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Located At Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__LOCATED_AT_FACILITY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Located At Location Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__LOCATED_AT_LOCATION_SEQ_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Parent Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__PARENT_FIXED_ASSET_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__PARTY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Production Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__PRODUCTION_CAPACITY = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Purchase Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__PURCHASE_COST = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Purchase Cost Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__PURCHASE_COST_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Salvage Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__SALVAGE_VALUE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__SERIAL_NUMBER = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET__UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 28;

	/**
	 * The number of structural features of the '<em>Fixed Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 29;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetAttributeImpl <em>Fixed Asset Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetAttributeImpl
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetAttribute()
	 * @generated
	 */
	int FIXED_ASSET_ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_ATTRIBUTE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_ATTRIBUTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_ATTRIBUTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_ATTRIBUTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_ATTRIBUTE__FIXED_ASSET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_ATTRIBUTE__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_ATTRIBUTE__ATTR_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_ATTRIBUTE__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Fixed Asset Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_ATTRIBUTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetDepMethodImpl <em>Fixed Asset Dep Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetDepMethodImpl
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetDepMethod()
	 * @generated
	 */
	int FIXED_ASSET_DEP_METHOD = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_DEP_METHOD__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_DEP_METHOD__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_DEP_METHOD__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_DEP_METHOD__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Depreciation Custom Method Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_DEP_METHOD__DEPRECIATION_CUSTOM_METHOD_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_DEP_METHOD__FIXED_ASSET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_DEP_METHOD__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_DEP_METHOD__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Fixed Asset Dep Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_DEP_METHOD_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetGeoPointImpl <em>Fixed Asset Geo Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetGeoPointImpl
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetGeoPoint()
	 * @generated
	 */
	int FIXED_ASSET_GEO_POINT = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_GEO_POINT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_GEO_POINT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_GEO_POINT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_GEO_POINT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_GEO_POINT__FIXED_ASSET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Geo Point Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_GEO_POINT__GEO_POINT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_GEO_POINT__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_GEO_POINT__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Fixed Asset Geo Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_GEO_POINT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetIdentImpl <em>Fixed Asset Ident</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetIdentImpl
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetIdent()
	 * @generated
	 */
	int FIXED_ASSET_IDENT = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_IDENT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_IDENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_IDENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_IDENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_IDENT__FIXED_ASSET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fixed Asset Ident Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_IDENT__FIXED_ASSET_IDENT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_IDENT__ID_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fixed Asset Ident</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_IDENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetIdentTypeImpl <em>Fixed Asset Ident Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetIdentTypeImpl
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetIdentType()
	 * @generated
	 */
	int FIXED_ASSET_IDENT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_IDENT_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_IDENT_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_IDENT_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_IDENT_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fixed Asset Ident Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_IDENT_TYPE__FIXED_ASSET_IDENT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_IDENT_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fixed Asset Ident Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_IDENT_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintImpl <em>Fixed Asset Maint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintImpl
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetMaint()
	 * @generated
	 */
	int FIXED_ASSET_MAINT = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_MAINT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_MAINT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_MAINT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_MAINT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_MAINT__FIXED_ASSET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maint Hist Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_MAINT__MAINT_HIST_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interval Meter Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_MAINT__INTERVAL_METER_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interval Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_MAINT__INTERVAL_QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interval Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_MAINT__INTERVAL_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Product Maint Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_MAINT__PRODUCT_MAINT_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Product Maint Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_MAINT__PRODUCT_MAINT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Purchase Order Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_MAINT__PURCHASE_ORDER_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Schedule Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_MAINT__SCHEDULE_WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_MAINT__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Fixed Asset Maint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_MAINT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintOrderImpl <em>Fixed Asset Maint Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintOrderImpl
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetMaintOrder()
	 * @generated
	 */
	int FIXED_ASSET_MAINT_ORDER = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_MAINT_ORDER__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_MAINT_ORDER__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_MAINT_ORDER__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_MAINT_ORDER__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_MAINT_ORDER__FIXED_ASSET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_MAINT_ORDER__ORDER_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maint Hist Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_MAINT_ORDER__MAINT_HIST_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_MAINT_ORDER__ORDER_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Fixed Asset Maint Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_MAINT_ORDER_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMeterImpl <em>Fixed Asset Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMeterImpl
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetMeter()
	 * @generated
	 */
	int FIXED_ASSET_METER = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_METER__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_METER__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_METER__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_METER__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Meter Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_METER__PRODUCT_METER_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fixed Asset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_METER__FIXED_ASSET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reading Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_METER__READING_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Maint Hist Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_METER__MAINT_HIST_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Meter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_METER__METER_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reading Reason Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_METER__READING_REASON_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_METER__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Fixed Asset Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_METER_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetProductImpl <em>Fixed Asset Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetProductImpl
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetProduct()
	 * @generated
	 */
	int FIXED_ASSET_PRODUCT = 12;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_PRODUCT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_PRODUCT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_PRODUCT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_PRODUCT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_PRODUCT__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_PRODUCT__FIXED_ASSET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fixed Asset Product Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_PRODUCT__FIXED_ASSET_PRODUCT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_PRODUCT__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_PRODUCT__COMMENTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_PRODUCT__QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Quantity Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_PRODUCT__QUANTITY_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_PRODUCT__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_PRODUCT__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Fixed Asset Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_PRODUCT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetProductTypeImpl <em>Fixed Asset Product Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetProductTypeImpl
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetProductType()
	 * @generated
	 */
	int FIXED_ASSET_PRODUCT_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_PRODUCT_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_PRODUCT_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_PRODUCT_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_PRODUCT_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fixed Asset Product Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_PRODUCT_TYPE__FIXED_ASSET_PRODUCT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_PRODUCT_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fixed Asset Product Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_PRODUCT_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetRegistrationImpl <em>Fixed Asset Registration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetRegistrationImpl
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetRegistration()
	 * @generated
	 */
	int FIXED_ASSET_REGISTRATION = 14;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_REGISTRATION__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_REGISTRATION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_REGISTRATION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_REGISTRATION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_REGISTRATION__FIXED_ASSET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_REGISTRATION__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gov Agency Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_REGISTRATION__GOV_AGENCY_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>License Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_REGISTRATION__LICENSE_NUMBER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Registration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_REGISTRATION__REGISTRATION_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Registration Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_REGISTRATION__REGISTRATION_NUMBER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_REGISTRATION__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Fixed Asset Registration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_REGISTRATION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetStdCostImpl <em>Fixed Asset Std Cost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetStdCostImpl
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetStdCost()
	 * @generated
	 */
	int FIXED_ASSET_STD_COST = 15;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_STD_COST__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_STD_COST__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_STD_COST__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_STD_COST__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_STD_COST__FIXED_ASSET_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fixed Asset Std Cost Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_STD_COST__FIXED_ASSET_STD_COST_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_STD_COST__FROM_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_STD_COST__AMOUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Amount Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_STD_COST__AMOUNT_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_STD_COST__THRU_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Fixed Asset Std Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_STD_COST_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetStdCostTypeImpl <em>Fixed Asset Std Cost Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetStdCostTypeImpl
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetStdCostType()
	 * @generated
	 */
	int FIXED_ASSET_STD_COST_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_STD_COST_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_STD_COST_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_STD_COST_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_STD_COST_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_STD_COST_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fixed Asset Std Cost Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_STD_COST_TYPE__FIXED_ASSET_STD_COST_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_STD_COST_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_STD_COST_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_STD_COST_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Fixed Asset Std Cost Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_STD_COST_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetTypeImpl <em>Fixed Asset Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetTypeImpl
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetType()
	 * @generated
	 */
	int FIXED_ASSET_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fixed Asset Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE__FIXED_ASSET_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fixed Asset Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE__FIXED_ASSET_TYPE_ATTRS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Fixed Asset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetTypeAttrImpl <em>Fixed Asset Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetTypeAttrImpl
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetTypeAttr()
	 * @generated
	 */
	int FIXED_ASSET_TYPE_ATTR = 18;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE_ATTR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE_ATTR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE_ATTR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE_ATTR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fixed Asset Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE_ATTR__FIXED_ASSET_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE_ATTR__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE_ATTR__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fixed Asset Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE_ATTR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl <em>Fixed Asset Type Gl Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetTypeGlAccount()
	 * @generated
	 */
	int FIXED_ASSET_TYPE_GL_ACCOUNT = 19;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE_GL_ACCOUNT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE_GL_ACCOUNT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE_GL_ACCOUNT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE_GL_ACCOUNT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fixed Asset Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE_GL_ACCOUNT__FIXED_ASSET_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE_GL_ACCOUNT__FIXED_ASSET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Organization Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Acc Dep Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE_GL_ACCOUNT__ACC_DEP_GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Asset Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE_GL_ACCOUNT__ASSET_GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dep Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE_GL_ACCOUNT__DEP_GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Loss Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE_GL_ACCOUNT__LOSS_GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Profit Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE_GL_ACCOUNT__PROFIT_GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Fixed Asset Type Gl Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_ASSET_TYPE_GL_ACCOUNT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.PartyFixedAssetAssignmentImpl <em>Party Fixed Asset Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.PartyFixedAssetAssignmentImpl
	 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getPartyFixedAssetAssignment()
	 * @generated
	 */
	int PARTY_FIXED_ASSET_ASSIGNMENT = 20;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FIXED_ASSET_ASSIGNMENT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FIXED_ASSET_ASSIGNMENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FIXED_ASSET_ASSIGNMENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FIXED_ASSET_ASSIGNMENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FIXED_ASSET_ASSIGNMENT__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FIXED_ASSET_ASSIGNMENT__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FIXED_ASSET_ASSIGNMENT__FIXED_ASSET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FIXED_ASSET_ASSIGNMENT__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Allocated Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FIXED_ASSET_ASSIGNMENT__ALLOCATED_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FIXED_ASSET_ASSIGNMENT__COMMENTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FIXED_ASSET_ASSIGNMENT__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FIXED_ASSET_ASSIGNMENT__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Party Fixed Asset Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FIXED_ASSET_ASSIGNMENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.fixedasset.AccommodationClass <em>Accommodation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accommodation Class</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.AccommodationClass
	 * @generated
	 */
	EClass getAccommodationClass();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.AccommodationClass#getAccommodationClassId <em>Accommodation Class Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accommodation Class Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.AccommodationClass#getAccommodationClassId()
	 * @see #getAccommodationClass()
	 * @generated
	 */
	EAttribute getAccommodationClass_AccommodationClassId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.AccommodationClass#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.AccommodationClass#getDescription()
	 * @see #getAccommodationClass()
	 * @generated
	 */
	EAttribute getAccommodationClass_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.AccommodationClass#getParentClassId <em>Parent Class Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Class Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.AccommodationClass#getParentClassId()
	 * @see #getAccommodationClass()
	 * @generated
	 */
	EReference getAccommodationClass_ParentClassId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap <em>Accommodation Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accommodation Map</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap
	 * @generated
	 */
	EClass getAccommodationMap();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap#getAccommodationMapId <em>Accommodation Map Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accommodation Map Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap#getAccommodationMapId()
	 * @see #getAccommodationMap()
	 * @generated
	 */
	EAttribute getAccommodationMap_AccommodationMapId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap#getAccommodationClassId <em>Accommodation Class Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Accommodation Class Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap#getAccommodationClassId()
	 * @see #getAccommodationMap()
	 * @generated
	 */
	EReference getAccommodationMap_AccommodationClassId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap#getAccommodationMapTypeId <em>Accommodation Map Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Accommodation Map Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap#getAccommodationMapTypeId()
	 * @see #getAccommodationMap()
	 * @generated
	 */
	EReference getAccommodationMap_AccommodationMapTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap#getFixedAssetId <em>Fixed Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap#getFixedAssetId()
	 * @see #getAccommodationMap()
	 * @generated
	 */
	EReference getAccommodationMap_FixedAssetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap#getNumberOfSpaces <em>Number Of Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Spaces</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.AccommodationMap#getNumberOfSpaces()
	 * @see #getAccommodationMap()
	 * @generated
	 */
	EAttribute getAccommodationMap_NumberOfSpaces();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.fixedasset.AccommodationMapType <em>Accommodation Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accommodation Map Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.AccommodationMapType
	 * @generated
	 */
	EClass getAccommodationMapType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.AccommodationMapType#getAccommodationMapTypeId <em>Accommodation Map Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accommodation Map Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.AccommodationMapType#getAccommodationMapTypeId()
	 * @see #getAccommodationMapType()
	 * @generated
	 */
	EAttribute getAccommodationMapType_AccommodationMapTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.AccommodationMapType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.AccommodationMapType#getDescription()
	 * @see #getAccommodationMapType()
	 * @generated
	 */
	EAttribute getAccommodationMapType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset <em>Fixed Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Asset</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset
	 * @generated
	 */
	EClass getFixedAsset();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetId <em>Fixed Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Asset Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetId()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EAttribute getFixedAsset_FixedAssetId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getAcquireOrderId <em>Acquire Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Acquire Order Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getAcquireOrderId()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EReference getFixedAsset_AcquireOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getAcquireOrderItemSeqId <em>Acquire Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acquire Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getAcquireOrderItemSeqId()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EAttribute getFixedAsset_AcquireOrderItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getActualEndOfLife <em>Actual End Of Life</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual End Of Life</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getActualEndOfLife()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EAttribute getFixedAsset_ActualEndOfLife();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getCalendarId <em>Calendar Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Calendar Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getCalendarId()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EReference getFixedAsset_CalendarId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getClassEnumId <em>Class Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class Enum Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getClassEnumId()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EReference getFixedAsset_ClassEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getDateAcquired <em>Date Acquired</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Acquired</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getDateAcquired()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EAttribute getFixedAsset_DateAcquired();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getDateLastServiced <em>Date Last Serviced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Last Serviced</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getDateLastServiced()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EAttribute getFixedAsset_DateLastServiced();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getDateNextService <em>Date Next Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Next Service</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getDateNextService()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EAttribute getFixedAsset_DateNextService();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getDepreciation <em>Depreciation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depreciation</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getDepreciation()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EAttribute getFixedAsset_Depreciation();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getExpectedEndOfLife <em>Expected End Of Life</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected End Of Life</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getExpectedEndOfLife()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EAttribute getFixedAsset_ExpectedEndOfLife();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetAttributes <em>Fixed Asset Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fixed Asset Attributes</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetAttributes()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EReference getFixedAsset_FixedAssetAttributes();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetIdents <em>Fixed Asset Idents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fixed Asset Idents</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetIdents()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EReference getFixedAsset_FixedAssetIdents();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetMaints <em>Fixed Asset Maints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fixed Asset Maints</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetMaints()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EReference getFixedAsset_FixedAssetMaints();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetName <em>Fixed Asset Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Asset Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetName()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EAttribute getFixedAsset_FixedAssetName();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetRegistrations <em>Fixed Asset Registrations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fixed Asset Registrations</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetRegistrations()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EReference getFixedAsset_FixedAssetRegistrations();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetTypeId <em>Fixed Asset Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getFixedAssetTypeId()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EReference getFixedAsset_FixedAssetTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getInstanceOfProductId <em>Instance Of Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Of Product Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getInstanceOfProductId()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EReference getFixedAsset_InstanceOfProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getLocatedAtFacilityId <em>Located At Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Located At Facility Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getLocatedAtFacilityId()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EReference getFixedAsset_LocatedAtFacilityId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getLocatedAtLocationSeqId <em>Located At Location Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Located At Location Seq Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getLocatedAtLocationSeqId()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EAttribute getFixedAsset_LocatedAtLocationSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getParentFixedAssetId <em>Parent Fixed Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Fixed Asset Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getParentFixedAssetId()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EReference getFixedAsset_ParentFixedAssetId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getPartyId()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EReference getFixedAsset_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getProductionCapacity <em>Production Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Production Capacity</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getProductionCapacity()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EAttribute getFixedAsset_ProductionCapacity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getPurchaseCost <em>Purchase Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purchase Cost</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getPurchaseCost()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EAttribute getFixedAsset_PurchaseCost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getPurchaseCostUomId <em>Purchase Cost Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purchase Cost Uom Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getPurchaseCostUomId()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EAttribute getFixedAsset_PurchaseCostUomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getRoleTypeId()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EReference getFixedAsset_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getSalvageValue <em>Salvage Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salvage Value</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getSalvageValue()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EAttribute getFixedAsset_SalvageValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getSerialNumber <em>Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial Number</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getSerialNumber()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EAttribute getFixedAsset_SerialNumber();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getUomId <em>Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAsset#getUomId()
	 * @see #getFixedAsset()
	 * @generated
	 */
	EReference getFixedAsset_UomId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetAttribute <em>Fixed Asset Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Asset Attribute</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetAttribute
	 * @generated
	 */
	EClass getFixedAssetAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetAttribute#getFixedAssetId <em>Fixed Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetAttribute#getFixedAssetId()
	 * @see #getFixedAssetAttribute()
	 * @generated
	 */
	EReference getFixedAssetAttribute_FixedAssetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetAttribute#getAttrName()
	 * @see #getFixedAssetAttribute()
	 * @generated
	 */
	EAttribute getFixedAssetAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetAttribute#getAttrDescription()
	 * @see #getFixedAssetAttribute()
	 * @generated
	 */
	EAttribute getFixedAssetAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetAttribute#getAttrValue()
	 * @see #getFixedAssetAttribute()
	 * @generated
	 */
	EAttribute getFixedAssetAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetDepMethod <em>Fixed Asset Dep Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Asset Dep Method</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetDepMethod
	 * @generated
	 */
	EClass getFixedAssetDepMethod();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetDepMethod#getDepreciationCustomMethodId <em>Depreciation Custom Method Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Depreciation Custom Method Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetDepMethod#getDepreciationCustomMethodId()
	 * @see #getFixedAssetDepMethod()
	 * @generated
	 */
	EReference getFixedAssetDepMethod_DepreciationCustomMethodId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetDepMethod#getFixedAssetId <em>Fixed Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetDepMethod#getFixedAssetId()
	 * @see #getFixedAssetDepMethod()
	 * @generated
	 */
	EReference getFixedAssetDepMethod_FixedAssetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetDepMethod#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetDepMethod#getFromDate()
	 * @see #getFixedAssetDepMethod()
	 * @generated
	 */
	EAttribute getFixedAssetDepMethod_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetDepMethod#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetDepMethod#getThruDate()
	 * @see #getFixedAssetDepMethod()
	 * @generated
	 */
	EAttribute getFixedAssetDepMethod_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetGeoPoint <em>Fixed Asset Geo Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Asset Geo Point</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetGeoPoint
	 * @generated
	 */
	EClass getFixedAssetGeoPoint();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetGeoPoint#getFixedAssetId <em>Fixed Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetGeoPoint#getFixedAssetId()
	 * @see #getFixedAssetGeoPoint()
	 * @generated
	 */
	EReference getFixedAssetGeoPoint_FixedAssetId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetGeoPoint#getGeoPointId <em>Geo Point Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo Point Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetGeoPoint#getGeoPointId()
	 * @see #getFixedAssetGeoPoint()
	 * @generated
	 */
	EReference getFixedAssetGeoPoint_GeoPointId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetGeoPoint#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetGeoPoint#getFromDate()
	 * @see #getFixedAssetGeoPoint()
	 * @generated
	 */
	EAttribute getFixedAssetGeoPoint_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetGeoPoint#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetGeoPoint#getThruDate()
	 * @see #getFixedAssetGeoPoint()
	 * @generated
	 */
	EAttribute getFixedAssetGeoPoint_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetIdent <em>Fixed Asset Ident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Asset Ident</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetIdent
	 * @generated
	 */
	EClass getFixedAssetIdent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetIdent#getFixedAssetId <em>Fixed Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetIdent#getFixedAssetId()
	 * @see #getFixedAssetIdent()
	 * @generated
	 */
	EReference getFixedAssetIdent_FixedAssetId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetIdent#getFixedAssetIdentTypeId <em>Fixed Asset Ident Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Ident Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetIdent#getFixedAssetIdentTypeId()
	 * @see #getFixedAssetIdent()
	 * @generated
	 */
	EReference getFixedAssetIdent_FixedAssetIdentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetIdent#getIdValue <em>Id Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Value</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetIdent#getIdValue()
	 * @see #getFixedAssetIdent()
	 * @generated
	 */
	EAttribute getFixedAssetIdent_IdValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetIdentType <em>Fixed Asset Ident Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Asset Ident Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetIdentType
	 * @generated
	 */
	EClass getFixedAssetIdentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetIdentType#getFixedAssetIdentTypeId <em>Fixed Asset Ident Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Asset Ident Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetIdentType#getFixedAssetIdentTypeId()
	 * @see #getFixedAssetIdentType()
	 * @generated
	 */
	EAttribute getFixedAssetIdentType_FixedAssetIdentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetIdentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetIdentType#getDescription()
	 * @see #getFixedAssetIdentType()
	 * @generated
	 */
	EAttribute getFixedAssetIdentType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint <em>Fixed Asset Maint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Asset Maint</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint
	 * @generated
	 */
	EClass getFixedAssetMaint();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getFixedAssetId <em>Fixed Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getFixedAssetId()
	 * @see #getFixedAssetMaint()
	 * @generated
	 */
	EReference getFixedAssetMaint_FixedAssetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getMaintHistSeqId <em>Maint Hist Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maint Hist Seq Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getMaintHistSeqId()
	 * @see #getFixedAssetMaint()
	 * @generated
	 */
	EAttribute getFixedAssetMaint_MaintHistSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getIntervalMeterTypeId <em>Interval Meter Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interval Meter Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getIntervalMeterTypeId()
	 * @see #getFixedAssetMaint()
	 * @generated
	 */
	EReference getFixedAssetMaint_IntervalMeterTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getIntervalQuantity <em>Interval Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval Quantity</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getIntervalQuantity()
	 * @see #getFixedAssetMaint()
	 * @generated
	 */
	EAttribute getFixedAssetMaint_IntervalQuantity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getIntervalUomId <em>Interval Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interval Uom Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getIntervalUomId()
	 * @see #getFixedAssetMaint()
	 * @generated
	 */
	EReference getFixedAssetMaint_IntervalUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getProductMaintSeqId <em>Product Maint Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Maint Seq Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getProductMaintSeqId()
	 * @see #getFixedAssetMaint()
	 * @generated
	 */
	EAttribute getFixedAssetMaint_ProductMaintSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getProductMaintTypeId <em>Product Maint Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Maint Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getProductMaintTypeId()
	 * @see #getFixedAssetMaint()
	 * @generated
	 */
	EReference getFixedAssetMaint_ProductMaintTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getPurchaseOrderId <em>Purchase Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Purchase Order Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getPurchaseOrderId()
	 * @see #getFixedAssetMaint()
	 * @generated
	 */
	EReference getFixedAssetMaint_PurchaseOrderId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getScheduleWorkEffortId <em>Schedule Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schedule Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getScheduleWorkEffortId()
	 * @see #getFixedAssetMaint()
	 * @generated
	 */
	EReference getFixedAssetMaint_ScheduleWorkEffortId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint#getStatusId()
	 * @see #getFixedAssetMaint()
	 * @generated
	 */
	EReference getFixedAssetMaint_StatusId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaintOrder <em>Fixed Asset Maint Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Asset Maint Order</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaintOrder
	 * @generated
	 */
	EClass getFixedAssetMaintOrder();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaintOrder#getFixedAssetId <em>Fixed Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaintOrder#getFixedAssetId()
	 * @see #getFixedAssetMaintOrder()
	 * @generated
	 */
	EReference getFixedAssetMaintOrder_FixedAssetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaintOrder#getMaintHistSeqId <em>Maint Hist Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maint Hist Seq Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaintOrder#getMaintHistSeqId()
	 * @see #getFixedAssetMaintOrder()
	 * @generated
	 */
	EAttribute getFixedAssetMaintOrder_MaintHistSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaintOrder#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaintOrder#getOrderId()
	 * @see #getFixedAssetMaintOrder()
	 * @generated
	 */
	EReference getFixedAssetMaintOrder_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaintOrder#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaintOrder#getOrderItemSeqId()
	 * @see #getFixedAssetMaintOrder()
	 * @generated
	 */
	EAttribute getFixedAssetMaintOrder_OrderItemSeqId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMeter <em>Fixed Asset Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Asset Meter</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMeter
	 * @generated
	 */
	EClass getFixedAssetMeter();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMeter#getFixedAssetId <em>Fixed Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Asset Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMeter#getFixedAssetId()
	 * @see #getFixedAssetMeter()
	 * @generated
	 */
	EAttribute getFixedAssetMeter_FixedAssetId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMeter#getProductMeterTypeId <em>Product Meter Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Meter Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMeter#getProductMeterTypeId()
	 * @see #getFixedAssetMeter()
	 * @generated
	 */
	EReference getFixedAssetMeter_ProductMeterTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMeter#getReadingDate <em>Reading Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reading Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMeter#getReadingDate()
	 * @see #getFixedAssetMeter()
	 * @generated
	 */
	EAttribute getFixedAssetMeter_ReadingDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMeter#getMaintHistSeqId <em>Maint Hist Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maint Hist Seq Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMeter#getMaintHistSeqId()
	 * @see #getFixedAssetMeter()
	 * @generated
	 */
	EAttribute getFixedAssetMeter_MaintHistSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMeter#getMeterValue <em>Meter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meter Value</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMeter#getMeterValue()
	 * @see #getFixedAssetMeter()
	 * @generated
	 */
	EAttribute getFixedAssetMeter_MeterValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMeter#getReadingReasonEnumId <em>Reading Reason Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reading Reason Enum Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMeter#getReadingReasonEnumId()
	 * @see #getFixedAssetMeter()
	 * @generated
	 */
	EAttribute getFixedAssetMeter_ReadingReasonEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMeter#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMeter#getWorkEffortId()
	 * @see #getFixedAssetMeter()
	 * @generated
	 */
	EAttribute getFixedAssetMeter_WorkEffortId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProduct <em>Fixed Asset Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Asset Product</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProduct
	 * @generated
	 */
	EClass getFixedAssetProduct();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProduct#getFixedAssetId <em>Fixed Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProduct#getFixedAssetId()
	 * @see #getFixedAssetProduct()
	 * @generated
	 */
	EReference getFixedAssetProduct_FixedAssetId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProduct#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProduct#getProductId()
	 * @see #getFixedAssetProduct()
	 * @generated
	 */
	EReference getFixedAssetProduct_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProduct#getFixedAssetProductTypeId <em>Fixed Asset Product Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Product Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProduct#getFixedAssetProductTypeId()
	 * @see #getFixedAssetProduct()
	 * @generated
	 */
	EReference getFixedAssetProduct_FixedAssetProductTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProduct#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProduct#getFromDate()
	 * @see #getFixedAssetProduct()
	 * @generated
	 */
	EAttribute getFixedAssetProduct_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProduct#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProduct#getComments()
	 * @see #getFixedAssetProduct()
	 * @generated
	 */
	EAttribute getFixedAssetProduct_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProduct#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProduct#getQuantity()
	 * @see #getFixedAssetProduct()
	 * @generated
	 */
	EAttribute getFixedAssetProduct_Quantity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProduct#getQuantityUomId <em>Quantity Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quantity Uom Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProduct#getQuantityUomId()
	 * @see #getFixedAssetProduct()
	 * @generated
	 */
	EReference getFixedAssetProduct_QuantityUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProduct#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProduct#getSequenceNum()
	 * @see #getFixedAssetProduct()
	 * @generated
	 */
	EAttribute getFixedAssetProduct_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProduct#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProduct#getThruDate()
	 * @see #getFixedAssetProduct()
	 * @generated
	 */
	EAttribute getFixedAssetProduct_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProductType <em>Fixed Asset Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Asset Product Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProductType
	 * @generated
	 */
	EClass getFixedAssetProductType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProductType#getFixedAssetProductTypeId <em>Fixed Asset Product Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Asset Product Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProductType#getFixedAssetProductTypeId()
	 * @see #getFixedAssetProductType()
	 * @generated
	 */
	EAttribute getFixedAssetProductType_FixedAssetProductTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProductType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetProductType#getDescription()
	 * @see #getFixedAssetProductType()
	 * @generated
	 */
	EAttribute getFixedAssetProductType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetRegistration <em>Fixed Asset Registration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Asset Registration</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetRegistration
	 * @generated
	 */
	EClass getFixedAssetRegistration();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetRegistration#getFixedAssetId <em>Fixed Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetRegistration#getFixedAssetId()
	 * @see #getFixedAssetRegistration()
	 * @generated
	 */
	EReference getFixedAssetRegistration_FixedAssetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetRegistration#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetRegistration#getFromDate()
	 * @see #getFixedAssetRegistration()
	 * @generated
	 */
	EAttribute getFixedAssetRegistration_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetRegistration#getGovAgencyPartyId <em>Gov Agency Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gov Agency Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetRegistration#getGovAgencyPartyId()
	 * @see #getFixedAssetRegistration()
	 * @generated
	 */
	EReference getFixedAssetRegistration_GovAgencyPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetRegistration#getLicenseNumber <em>License Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License Number</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetRegistration#getLicenseNumber()
	 * @see #getFixedAssetRegistration()
	 * @generated
	 */
	EAttribute getFixedAssetRegistration_LicenseNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetRegistration#getRegistrationDate <em>Registration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registration Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetRegistration#getRegistrationDate()
	 * @see #getFixedAssetRegistration()
	 * @generated
	 */
	EAttribute getFixedAssetRegistration_RegistrationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetRegistration#getRegistrationNumber <em>Registration Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registration Number</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetRegistration#getRegistrationNumber()
	 * @see #getFixedAssetRegistration()
	 * @generated
	 */
	EAttribute getFixedAssetRegistration_RegistrationNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetRegistration#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetRegistration#getThruDate()
	 * @see #getFixedAssetRegistration()
	 * @generated
	 */
	EAttribute getFixedAssetRegistration_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCost <em>Fixed Asset Std Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Asset Std Cost</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCost
	 * @generated
	 */
	EClass getFixedAssetStdCost();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCost#getFixedAssetId <em>Fixed Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCost#getFixedAssetId()
	 * @see #getFixedAssetStdCost()
	 * @generated
	 */
	EReference getFixedAssetStdCost_FixedAssetId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCost#getFixedAssetStdCostTypeId <em>Fixed Asset Std Cost Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Std Cost Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCost#getFixedAssetStdCostTypeId()
	 * @see #getFixedAssetStdCost()
	 * @generated
	 */
	EReference getFixedAssetStdCost_FixedAssetStdCostTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCost#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCost#getFromDate()
	 * @see #getFixedAssetStdCost()
	 * @generated
	 */
	EAttribute getFixedAssetStdCost_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCost#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCost#getAmount()
	 * @see #getFixedAssetStdCost()
	 * @generated
	 */
	EAttribute getFixedAssetStdCost_Amount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCost#getAmountUomId <em>Amount Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Amount Uom Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCost#getAmountUomId()
	 * @see #getFixedAssetStdCost()
	 * @generated
	 */
	EReference getFixedAssetStdCost_AmountUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCost#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCost#getThruDate()
	 * @see #getFixedAssetStdCost()
	 * @generated
	 */
	EAttribute getFixedAssetStdCost_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCostType <em>Fixed Asset Std Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Asset Std Cost Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCostType
	 * @generated
	 */
	EClass getFixedAssetStdCostType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCostType#getFixedAssetStdCostTypeId <em>Fixed Asset Std Cost Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Asset Std Cost Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCostType#getFixedAssetStdCostTypeId()
	 * @see #getFixedAssetStdCostType()
	 * @generated
	 */
	EAttribute getFixedAssetStdCostType_FixedAssetStdCostTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCostType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCostType#getDescription()
	 * @see #getFixedAssetStdCostType()
	 * @generated
	 */
	EAttribute getFixedAssetStdCostType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCostType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCostType#isHasTable()
	 * @see #getFixedAssetStdCostType()
	 * @generated
	 */
	EAttribute getFixedAssetStdCostType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCostType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetStdCostType#getParentTypeId()
	 * @see #getFixedAssetStdCostType()
	 * @generated
	 */
	EReference getFixedAssetStdCostType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetType <em>Fixed Asset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Asset Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetType
	 * @generated
	 */
	EClass getFixedAssetType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetType#getFixedAssetTypeId <em>Fixed Asset Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Asset Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetType#getFixedAssetTypeId()
	 * @see #getFixedAssetType()
	 * @generated
	 */
	EAttribute getFixedAssetType_FixedAssetTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetType#getDescription()
	 * @see #getFixedAssetType()
	 * @generated
	 */
	EAttribute getFixedAssetType_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetType#getFixedAssetTypeAttrs <em>Fixed Asset Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fixed Asset Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetType#getFixedAssetTypeAttrs()
	 * @see #getFixedAssetType()
	 * @generated
	 */
	EReference getFixedAssetType_FixedAssetTypeAttrs();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetType#isHasTable()
	 * @see #getFixedAssetType()
	 * @generated
	 */
	EAttribute getFixedAssetType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetType#getParentTypeId()
	 * @see #getFixedAssetType()
	 * @generated
	 */
	EReference getFixedAssetType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeAttr <em>Fixed Asset Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Asset Type Attr</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeAttr
	 * @generated
	 */
	EClass getFixedAssetTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeAttr#getFixedAssetTypeId <em>Fixed Asset Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeAttr#getFixedAssetTypeId()
	 * @see #getFixedAssetTypeAttr()
	 * @generated
	 */
	EReference getFixedAssetTypeAttr_FixedAssetTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeAttr#getAttrName()
	 * @see #getFixedAssetTypeAttr()
	 * @generated
	 */
	EAttribute getFixedAssetTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeAttr#getDescription()
	 * @see #getFixedAssetTypeAttr()
	 * @generated
	 */
	EAttribute getFixedAssetTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount <em>Fixed Asset Type Gl Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Asset Type Gl Account</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount
	 * @generated
	 */
	EClass getFixedAssetTypeGlAccount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getFixedAssetTypeId <em>Fixed Asset Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getFixedAssetTypeId()
	 * @see #getFixedAssetTypeGlAccount()
	 * @generated
	 */
	EReference getFixedAssetTypeGlAccount_FixedAssetTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getFixedAssetId <em>Fixed Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getFixedAssetId()
	 * @see #getFixedAssetTypeGlAccount()
	 * @generated
	 */
	EReference getFixedAssetTypeGlAccount_FixedAssetId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getOrganizationPartyId <em>Organization Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getOrganizationPartyId()
	 * @see #getFixedAssetTypeGlAccount()
	 * @generated
	 */
	EReference getFixedAssetTypeGlAccount_OrganizationPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getAccDepGlAccountId <em>Acc Dep Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Acc Dep Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getAccDepGlAccountId()
	 * @see #getFixedAssetTypeGlAccount()
	 * @generated
	 */
	EReference getFixedAssetTypeGlAccount_AccDepGlAccountId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getAssetGlAccountId <em>Asset Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getAssetGlAccountId()
	 * @see #getFixedAssetTypeGlAccount()
	 * @generated
	 */
	EReference getFixedAssetTypeGlAccount_AssetGlAccountId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getDepGlAccountId <em>Dep Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dep Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getDepGlAccountId()
	 * @see #getFixedAssetTypeGlAccount()
	 * @generated
	 */
	EReference getFixedAssetTypeGlAccount_DepGlAccountId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getLossGlAccountId <em>Loss Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loss Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getLossGlAccountId()
	 * @see #getFixedAssetTypeGlAccount()
	 * @generated
	 */
	EReference getFixedAssetTypeGlAccount_LossGlAccountId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getProfitGlAccountId <em>Profit Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Profit Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getProfitGlAccountId()
	 * @see #getFixedAssetTypeGlAccount()
	 * @generated
	 */
	EReference getFixedAssetTypeGlAccount_ProfitGlAccountId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.fixedasset.PartyFixedAssetAssignment <em>Party Fixed Asset Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party Fixed Asset Assignment</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.PartyFixedAssetAssignment
	 * @generated
	 */
	EClass getPartyFixedAssetAssignment();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.PartyFixedAssetAssignment#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.PartyFixedAssetAssignment#getPartyId()
	 * @see #getPartyFixedAssetAssignment()
	 * @generated
	 */
	EReference getPartyFixedAssetAssignment_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.PartyFixedAssetAssignment#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.PartyFixedAssetAssignment#getRoleTypeId()
	 * @see #getPartyFixedAssetAssignment()
	 * @generated
	 */
	EReference getPartyFixedAssetAssignment_RoleTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.PartyFixedAssetAssignment#getFixedAssetId <em>Fixed Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.PartyFixedAssetAssignment#getFixedAssetId()
	 * @see #getPartyFixedAssetAssignment()
	 * @generated
	 */
	EReference getPartyFixedAssetAssignment_FixedAssetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.PartyFixedAssetAssignment#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.PartyFixedAssetAssignment#getFromDate()
	 * @see #getPartyFixedAssetAssignment()
	 * @generated
	 */
	EAttribute getPartyFixedAssetAssignment_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.PartyFixedAssetAssignment#getAllocatedDate <em>Allocated Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allocated Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.PartyFixedAssetAssignment#getAllocatedDate()
	 * @see #getPartyFixedAssetAssignment()
	 * @generated
	 */
	EAttribute getPartyFixedAssetAssignment_AllocatedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.PartyFixedAssetAssignment#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.PartyFixedAssetAssignment#getComments()
	 * @see #getPartyFixedAssetAssignment()
	 * @generated
	 */
	EAttribute getPartyFixedAssetAssignment_Comments();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.fixedasset.PartyFixedAssetAssignment#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.PartyFixedAssetAssignment#getStatusId()
	 * @see #getPartyFixedAssetAssignment()
	 * @generated
	 */
	EReference getPartyFixedAssetAssignment_StatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.fixedasset.PartyFixedAssetAssignment#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.fixedasset.PartyFixedAssetAssignment#getThruDate()
	 * @see #getPartyFixedAssetAssignment()
	 * @generated
	 */
	EAttribute getPartyFixedAssetAssignment_ThruDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FixedassetFactory getFixedassetFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.AccommodationClassImpl <em>Accommodation Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.AccommodationClassImpl
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getAccommodationClass()
		 * @generated
		 */
		EClass ACCOMMODATION_CLASS = eINSTANCE.getAccommodationClass();

		/**
		 * The meta object literal for the '<em><b>Accommodation Class Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOMMODATION_CLASS__ACCOMMODATION_CLASS_ID = eINSTANCE.getAccommodationClass_AccommodationClassId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOMMODATION_CLASS__DESCRIPTION = eINSTANCE.getAccommodationClass_Description();

		/**
		 * The meta object literal for the '<em><b>Parent Class Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOMMODATION_CLASS__PARENT_CLASS_ID = eINSTANCE.getAccommodationClass_ParentClassId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.AccommodationMapImpl <em>Accommodation Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.AccommodationMapImpl
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getAccommodationMap()
		 * @generated
		 */
		EClass ACCOMMODATION_MAP = eINSTANCE.getAccommodationMap();

		/**
		 * The meta object literal for the '<em><b>Accommodation Map Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOMMODATION_MAP__ACCOMMODATION_MAP_ID = eINSTANCE.getAccommodationMap_AccommodationMapId();

		/**
		 * The meta object literal for the '<em><b>Accommodation Class Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOMMODATION_MAP__ACCOMMODATION_CLASS_ID = eINSTANCE.getAccommodationMap_AccommodationClassId();

		/**
		 * The meta object literal for the '<em><b>Accommodation Map Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOMMODATION_MAP__ACCOMMODATION_MAP_TYPE_ID = eINSTANCE.getAccommodationMap_AccommodationMapTypeId();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOMMODATION_MAP__FIXED_ASSET_ID = eINSTANCE.getAccommodationMap_FixedAssetId();

		/**
		 * The meta object literal for the '<em><b>Number Of Spaces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOMMODATION_MAP__NUMBER_OF_SPACES = eINSTANCE.getAccommodationMap_NumberOfSpaces();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.AccommodationMapTypeImpl <em>Accommodation Map Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.AccommodationMapTypeImpl
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getAccommodationMapType()
		 * @generated
		 */
		EClass ACCOMMODATION_MAP_TYPE = eINSTANCE.getAccommodationMapType();

		/**
		 * The meta object literal for the '<em><b>Accommodation Map Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOMMODATION_MAP_TYPE__ACCOMMODATION_MAP_TYPE_ID = eINSTANCE.getAccommodationMapType_AccommodationMapTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOMMODATION_MAP_TYPE__DESCRIPTION = eINSTANCE.getAccommodationMapType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl <em>Fixed Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAsset()
		 * @generated
		 */
		EClass FIXED_ASSET = eINSTANCE.getFixedAsset();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET__FIXED_ASSET_ID = eINSTANCE.getFixedAsset_FixedAssetId();

		/**
		 * The meta object literal for the '<em><b>Acquire Order Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET__ACQUIRE_ORDER_ID = eINSTANCE.getFixedAsset_AcquireOrderId();

		/**
		 * The meta object literal for the '<em><b>Acquire Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET__ACQUIRE_ORDER_ITEM_SEQ_ID = eINSTANCE.getFixedAsset_AcquireOrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Actual End Of Life</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET__ACTUAL_END_OF_LIFE = eINSTANCE.getFixedAsset_ActualEndOfLife();

		/**
		 * The meta object literal for the '<em><b>Calendar Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET__CALENDAR_ID = eINSTANCE.getFixedAsset_CalendarId();

		/**
		 * The meta object literal for the '<em><b>Class Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET__CLASS_ENUM_ID = eINSTANCE.getFixedAsset_ClassEnumId();

		/**
		 * The meta object literal for the '<em><b>Date Acquired</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET__DATE_ACQUIRED = eINSTANCE.getFixedAsset_DateAcquired();

		/**
		 * The meta object literal for the '<em><b>Date Last Serviced</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET__DATE_LAST_SERVICED = eINSTANCE.getFixedAsset_DateLastServiced();

		/**
		 * The meta object literal for the '<em><b>Date Next Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET__DATE_NEXT_SERVICE = eINSTANCE.getFixedAsset_DateNextService();

		/**
		 * The meta object literal for the '<em><b>Depreciation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET__DEPRECIATION = eINSTANCE.getFixedAsset_Depreciation();

		/**
		 * The meta object literal for the '<em><b>Expected End Of Life</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET__EXPECTED_END_OF_LIFE = eINSTANCE.getFixedAsset_ExpectedEndOfLife();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET__FIXED_ASSET_ATTRIBUTES = eINSTANCE.getFixedAsset_FixedAssetAttributes();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Idents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET__FIXED_ASSET_IDENTS = eINSTANCE.getFixedAsset_FixedAssetIdents();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Maints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET__FIXED_ASSET_MAINTS = eINSTANCE.getFixedAsset_FixedAssetMaints();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET__FIXED_ASSET_NAME = eINSTANCE.getFixedAsset_FixedAssetName();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Registrations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET__FIXED_ASSET_REGISTRATIONS = eINSTANCE.getFixedAsset_FixedAssetRegistrations();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET__FIXED_ASSET_TYPE_ID = eINSTANCE.getFixedAsset_FixedAssetTypeId();

		/**
		 * The meta object literal for the '<em><b>Instance Of Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET__INSTANCE_OF_PRODUCT_ID = eINSTANCE.getFixedAsset_InstanceOfProductId();

		/**
		 * The meta object literal for the '<em><b>Located At Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET__LOCATED_AT_FACILITY_ID = eINSTANCE.getFixedAsset_LocatedAtFacilityId();

		/**
		 * The meta object literal for the '<em><b>Located At Location Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET__LOCATED_AT_LOCATION_SEQ_ID = eINSTANCE.getFixedAsset_LocatedAtLocationSeqId();

		/**
		 * The meta object literal for the '<em><b>Parent Fixed Asset Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET__PARENT_FIXED_ASSET_ID = eINSTANCE.getFixedAsset_ParentFixedAssetId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET__PARTY_ID = eINSTANCE.getFixedAsset_PartyId();

		/**
		 * The meta object literal for the '<em><b>Production Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET__PRODUCTION_CAPACITY = eINSTANCE.getFixedAsset_ProductionCapacity();

		/**
		 * The meta object literal for the '<em><b>Purchase Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET__PURCHASE_COST = eINSTANCE.getFixedAsset_PurchaseCost();

		/**
		 * The meta object literal for the '<em><b>Purchase Cost Uom Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET__PURCHASE_COST_UOM_ID = eINSTANCE.getFixedAsset_PurchaseCostUomId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET__ROLE_TYPE_ID = eINSTANCE.getFixedAsset_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Salvage Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET__SALVAGE_VALUE = eINSTANCE.getFixedAsset_SalvageValue();

		/**
		 * The meta object literal for the '<em><b>Serial Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET__SERIAL_NUMBER = eINSTANCE.getFixedAsset_SerialNumber();

		/**
		 * The meta object literal for the '<em><b>Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET__UOM_ID = eINSTANCE.getFixedAsset_UomId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetAttributeImpl <em>Fixed Asset Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetAttributeImpl
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetAttribute()
		 * @generated
		 */
		EClass FIXED_ASSET_ATTRIBUTE = eINSTANCE.getFixedAssetAttribute();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_ATTRIBUTE__FIXED_ASSET_ID = eINSTANCE.getFixedAssetAttribute_FixedAssetId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_ATTRIBUTE__ATTR_NAME = eINSTANCE.getFixedAssetAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getFixedAssetAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getFixedAssetAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetDepMethodImpl <em>Fixed Asset Dep Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetDepMethodImpl
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetDepMethod()
		 * @generated
		 */
		EClass FIXED_ASSET_DEP_METHOD = eINSTANCE.getFixedAssetDepMethod();

		/**
		 * The meta object literal for the '<em><b>Depreciation Custom Method Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_DEP_METHOD__DEPRECIATION_CUSTOM_METHOD_ID = eINSTANCE.getFixedAssetDepMethod_DepreciationCustomMethodId();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_DEP_METHOD__FIXED_ASSET_ID = eINSTANCE.getFixedAssetDepMethod_FixedAssetId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_DEP_METHOD__FROM_DATE = eINSTANCE.getFixedAssetDepMethod_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_DEP_METHOD__THRU_DATE = eINSTANCE.getFixedAssetDepMethod_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetGeoPointImpl <em>Fixed Asset Geo Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetGeoPointImpl
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetGeoPoint()
		 * @generated
		 */
		EClass FIXED_ASSET_GEO_POINT = eINSTANCE.getFixedAssetGeoPoint();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_GEO_POINT__FIXED_ASSET_ID = eINSTANCE.getFixedAssetGeoPoint_FixedAssetId();

		/**
		 * The meta object literal for the '<em><b>Geo Point Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_GEO_POINT__GEO_POINT_ID = eINSTANCE.getFixedAssetGeoPoint_GeoPointId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_GEO_POINT__FROM_DATE = eINSTANCE.getFixedAssetGeoPoint_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_GEO_POINT__THRU_DATE = eINSTANCE.getFixedAssetGeoPoint_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetIdentImpl <em>Fixed Asset Ident</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetIdentImpl
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetIdent()
		 * @generated
		 */
		EClass FIXED_ASSET_IDENT = eINSTANCE.getFixedAssetIdent();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_IDENT__FIXED_ASSET_ID = eINSTANCE.getFixedAssetIdent_FixedAssetId();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Ident Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_IDENT__FIXED_ASSET_IDENT_TYPE_ID = eINSTANCE.getFixedAssetIdent_FixedAssetIdentTypeId();

		/**
		 * The meta object literal for the '<em><b>Id Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_IDENT__ID_VALUE = eINSTANCE.getFixedAssetIdent_IdValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetIdentTypeImpl <em>Fixed Asset Ident Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetIdentTypeImpl
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetIdentType()
		 * @generated
		 */
		EClass FIXED_ASSET_IDENT_TYPE = eINSTANCE.getFixedAssetIdentType();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Ident Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_IDENT_TYPE__FIXED_ASSET_IDENT_TYPE_ID = eINSTANCE.getFixedAssetIdentType_FixedAssetIdentTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_IDENT_TYPE__DESCRIPTION = eINSTANCE.getFixedAssetIdentType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintImpl <em>Fixed Asset Maint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintImpl
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetMaint()
		 * @generated
		 */
		EClass FIXED_ASSET_MAINT = eINSTANCE.getFixedAssetMaint();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_MAINT__FIXED_ASSET_ID = eINSTANCE.getFixedAssetMaint_FixedAssetId();

		/**
		 * The meta object literal for the '<em><b>Maint Hist Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_MAINT__MAINT_HIST_SEQ_ID = eINSTANCE.getFixedAssetMaint_MaintHistSeqId();

		/**
		 * The meta object literal for the '<em><b>Interval Meter Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_MAINT__INTERVAL_METER_TYPE_ID = eINSTANCE.getFixedAssetMaint_IntervalMeterTypeId();

		/**
		 * The meta object literal for the '<em><b>Interval Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_MAINT__INTERVAL_QUANTITY = eINSTANCE.getFixedAssetMaint_IntervalQuantity();

		/**
		 * The meta object literal for the '<em><b>Interval Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_MAINT__INTERVAL_UOM_ID = eINSTANCE.getFixedAssetMaint_IntervalUomId();

		/**
		 * The meta object literal for the '<em><b>Product Maint Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_MAINT__PRODUCT_MAINT_SEQ_ID = eINSTANCE.getFixedAssetMaint_ProductMaintSeqId();

		/**
		 * The meta object literal for the '<em><b>Product Maint Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_MAINT__PRODUCT_MAINT_TYPE_ID = eINSTANCE.getFixedAssetMaint_ProductMaintTypeId();

		/**
		 * The meta object literal for the '<em><b>Purchase Order Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_MAINT__PURCHASE_ORDER_ID = eINSTANCE.getFixedAssetMaint_PurchaseOrderId();

		/**
		 * The meta object literal for the '<em><b>Schedule Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_MAINT__SCHEDULE_WORK_EFFORT_ID = eINSTANCE.getFixedAssetMaint_ScheduleWorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_MAINT__STATUS_ID = eINSTANCE.getFixedAssetMaint_StatusId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintOrderImpl <em>Fixed Asset Maint Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMaintOrderImpl
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetMaintOrder()
		 * @generated
		 */
		EClass FIXED_ASSET_MAINT_ORDER = eINSTANCE.getFixedAssetMaintOrder();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_MAINT_ORDER__FIXED_ASSET_ID = eINSTANCE.getFixedAssetMaintOrder_FixedAssetId();

		/**
		 * The meta object literal for the '<em><b>Maint Hist Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_MAINT_ORDER__MAINT_HIST_SEQ_ID = eINSTANCE.getFixedAssetMaintOrder_MaintHistSeqId();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_MAINT_ORDER__ORDER_ID = eINSTANCE.getFixedAssetMaintOrder_OrderId();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_MAINT_ORDER__ORDER_ITEM_SEQ_ID = eINSTANCE.getFixedAssetMaintOrder_OrderItemSeqId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMeterImpl <em>Fixed Asset Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetMeterImpl
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetMeter()
		 * @generated
		 */
		EClass FIXED_ASSET_METER = eINSTANCE.getFixedAssetMeter();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_METER__FIXED_ASSET_ID = eINSTANCE.getFixedAssetMeter_FixedAssetId();

		/**
		 * The meta object literal for the '<em><b>Product Meter Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_METER__PRODUCT_METER_TYPE_ID = eINSTANCE.getFixedAssetMeter_ProductMeterTypeId();

		/**
		 * The meta object literal for the '<em><b>Reading Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_METER__READING_DATE = eINSTANCE.getFixedAssetMeter_ReadingDate();

		/**
		 * The meta object literal for the '<em><b>Maint Hist Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_METER__MAINT_HIST_SEQ_ID = eINSTANCE.getFixedAssetMeter_MaintHistSeqId();

		/**
		 * The meta object literal for the '<em><b>Meter Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_METER__METER_VALUE = eINSTANCE.getFixedAssetMeter_MeterValue();

		/**
		 * The meta object literal for the '<em><b>Reading Reason Enum Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_METER__READING_REASON_ENUM_ID = eINSTANCE.getFixedAssetMeter_ReadingReasonEnumId();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_METER__WORK_EFFORT_ID = eINSTANCE.getFixedAssetMeter_WorkEffortId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetProductImpl <em>Fixed Asset Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetProductImpl
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetProduct()
		 * @generated
		 */
		EClass FIXED_ASSET_PRODUCT = eINSTANCE.getFixedAssetProduct();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_PRODUCT__FIXED_ASSET_ID = eINSTANCE.getFixedAssetProduct_FixedAssetId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_PRODUCT__PRODUCT_ID = eINSTANCE.getFixedAssetProduct_ProductId();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Product Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_PRODUCT__FIXED_ASSET_PRODUCT_TYPE_ID = eINSTANCE.getFixedAssetProduct_FixedAssetProductTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_PRODUCT__FROM_DATE = eINSTANCE.getFixedAssetProduct_FromDate();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_PRODUCT__COMMENTS = eINSTANCE.getFixedAssetProduct_Comments();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_PRODUCT__QUANTITY = eINSTANCE.getFixedAssetProduct_Quantity();

		/**
		 * The meta object literal for the '<em><b>Quantity Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_PRODUCT__QUANTITY_UOM_ID = eINSTANCE.getFixedAssetProduct_QuantityUomId();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_PRODUCT__SEQUENCE_NUM = eINSTANCE.getFixedAssetProduct_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_PRODUCT__THRU_DATE = eINSTANCE.getFixedAssetProduct_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetProductTypeImpl <em>Fixed Asset Product Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetProductTypeImpl
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetProductType()
		 * @generated
		 */
		EClass FIXED_ASSET_PRODUCT_TYPE = eINSTANCE.getFixedAssetProductType();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Product Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_PRODUCT_TYPE__FIXED_ASSET_PRODUCT_TYPE_ID = eINSTANCE.getFixedAssetProductType_FixedAssetProductTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_PRODUCT_TYPE__DESCRIPTION = eINSTANCE.getFixedAssetProductType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetRegistrationImpl <em>Fixed Asset Registration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetRegistrationImpl
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetRegistration()
		 * @generated
		 */
		EClass FIXED_ASSET_REGISTRATION = eINSTANCE.getFixedAssetRegistration();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_REGISTRATION__FIXED_ASSET_ID = eINSTANCE.getFixedAssetRegistration_FixedAssetId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_REGISTRATION__FROM_DATE = eINSTANCE.getFixedAssetRegistration_FromDate();

		/**
		 * The meta object literal for the '<em><b>Gov Agency Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_REGISTRATION__GOV_AGENCY_PARTY_ID = eINSTANCE.getFixedAssetRegistration_GovAgencyPartyId();

		/**
		 * The meta object literal for the '<em><b>License Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_REGISTRATION__LICENSE_NUMBER = eINSTANCE.getFixedAssetRegistration_LicenseNumber();

		/**
		 * The meta object literal for the '<em><b>Registration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_REGISTRATION__REGISTRATION_DATE = eINSTANCE.getFixedAssetRegistration_RegistrationDate();

		/**
		 * The meta object literal for the '<em><b>Registration Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_REGISTRATION__REGISTRATION_NUMBER = eINSTANCE.getFixedAssetRegistration_RegistrationNumber();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_REGISTRATION__THRU_DATE = eINSTANCE.getFixedAssetRegistration_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetStdCostImpl <em>Fixed Asset Std Cost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetStdCostImpl
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetStdCost()
		 * @generated
		 */
		EClass FIXED_ASSET_STD_COST = eINSTANCE.getFixedAssetStdCost();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_STD_COST__FIXED_ASSET_ID = eINSTANCE.getFixedAssetStdCost_FixedAssetId();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Std Cost Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_STD_COST__FIXED_ASSET_STD_COST_TYPE_ID = eINSTANCE.getFixedAssetStdCost_FixedAssetStdCostTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_STD_COST__FROM_DATE = eINSTANCE.getFixedAssetStdCost_FromDate();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_STD_COST__AMOUNT = eINSTANCE.getFixedAssetStdCost_Amount();

		/**
		 * The meta object literal for the '<em><b>Amount Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_STD_COST__AMOUNT_UOM_ID = eINSTANCE.getFixedAssetStdCost_AmountUomId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_STD_COST__THRU_DATE = eINSTANCE.getFixedAssetStdCost_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetStdCostTypeImpl <em>Fixed Asset Std Cost Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetStdCostTypeImpl
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetStdCostType()
		 * @generated
		 */
		EClass FIXED_ASSET_STD_COST_TYPE = eINSTANCE.getFixedAssetStdCostType();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Std Cost Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_STD_COST_TYPE__FIXED_ASSET_STD_COST_TYPE_ID = eINSTANCE.getFixedAssetStdCostType_FixedAssetStdCostTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_STD_COST_TYPE__DESCRIPTION = eINSTANCE.getFixedAssetStdCostType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_STD_COST_TYPE__HAS_TABLE = eINSTANCE.getFixedAssetStdCostType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_STD_COST_TYPE__PARENT_TYPE_ID = eINSTANCE.getFixedAssetStdCostType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetTypeImpl <em>Fixed Asset Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetTypeImpl
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetType()
		 * @generated
		 */
		EClass FIXED_ASSET_TYPE = eINSTANCE.getFixedAssetType();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_TYPE__FIXED_ASSET_TYPE_ID = eINSTANCE.getFixedAssetType_FixedAssetTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_TYPE__DESCRIPTION = eINSTANCE.getFixedAssetType_Description();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_TYPE__FIXED_ASSET_TYPE_ATTRS = eINSTANCE.getFixedAssetType_FixedAssetTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_TYPE__HAS_TABLE = eINSTANCE.getFixedAssetType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_TYPE__PARENT_TYPE_ID = eINSTANCE.getFixedAssetType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetTypeAttrImpl <em>Fixed Asset Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetTypeAttrImpl
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetTypeAttr()
		 * @generated
		 */
		EClass FIXED_ASSET_TYPE_ATTR = eINSTANCE.getFixedAssetTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_TYPE_ATTR__FIXED_ASSET_TYPE_ID = eINSTANCE.getFixedAssetTypeAttr_FixedAssetTypeId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_TYPE_ATTR__ATTR_NAME = eINSTANCE.getFixedAssetTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_ASSET_TYPE_ATTR__DESCRIPTION = eINSTANCE.getFixedAssetTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl <em>Fixed Asset Type Gl Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getFixedAssetTypeGlAccount()
		 * @generated
		 */
		EClass FIXED_ASSET_TYPE_GL_ACCOUNT = eINSTANCE.getFixedAssetTypeGlAccount();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_TYPE_GL_ACCOUNT__FIXED_ASSET_TYPE_ID = eINSTANCE.getFixedAssetTypeGlAccount_FixedAssetTypeId();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_TYPE_GL_ACCOUNT__FIXED_ASSET_ID = eINSTANCE.getFixedAssetTypeGlAccount_FixedAssetId();

		/**
		 * The meta object literal for the '<em><b>Organization Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID = eINSTANCE.getFixedAssetTypeGlAccount_OrganizationPartyId();

		/**
		 * The meta object literal for the '<em><b>Acc Dep Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_TYPE_GL_ACCOUNT__ACC_DEP_GL_ACCOUNT_ID = eINSTANCE.getFixedAssetTypeGlAccount_AccDepGlAccountId();

		/**
		 * The meta object literal for the '<em><b>Asset Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_TYPE_GL_ACCOUNT__ASSET_GL_ACCOUNT_ID = eINSTANCE.getFixedAssetTypeGlAccount_AssetGlAccountId();

		/**
		 * The meta object literal for the '<em><b>Dep Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_TYPE_GL_ACCOUNT__DEP_GL_ACCOUNT_ID = eINSTANCE.getFixedAssetTypeGlAccount_DepGlAccountId();

		/**
		 * The meta object literal for the '<em><b>Loss Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_TYPE_GL_ACCOUNT__LOSS_GL_ACCOUNT_ID = eINSTANCE.getFixedAssetTypeGlAccount_LossGlAccountId();

		/**
		 * The meta object literal for the '<em><b>Profit Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_ASSET_TYPE_GL_ACCOUNT__PROFIT_GL_ACCOUNT_ID = eINSTANCE.getFixedAssetTypeGlAccount_ProfitGlAccountId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.fixedasset.impl.PartyFixedAssetAssignmentImpl <em>Party Fixed Asset Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.PartyFixedAssetAssignmentImpl
		 * @see org.abchip.mimo.biz.accounting.fixedasset.impl.FixedassetPackageImpl#getPartyFixedAssetAssignment()
		 * @generated
		 */
		EClass PARTY_FIXED_ASSET_ASSIGNMENT = eINSTANCE.getPartyFixedAssetAssignment();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_FIXED_ASSET_ASSIGNMENT__PARTY_ID = eINSTANCE.getPartyFixedAssetAssignment_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_FIXED_ASSET_ASSIGNMENT__ROLE_TYPE_ID = eINSTANCE.getPartyFixedAssetAssignment_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_FIXED_ASSET_ASSIGNMENT__FIXED_ASSET_ID = eINSTANCE.getPartyFixedAssetAssignment_FixedAssetId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_FIXED_ASSET_ASSIGNMENT__FROM_DATE = eINSTANCE.getPartyFixedAssetAssignment_FromDate();

		/**
		 * The meta object literal for the '<em><b>Allocated Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_FIXED_ASSET_ASSIGNMENT__ALLOCATED_DATE = eINSTANCE.getPartyFixedAssetAssignment_AllocatedDate();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_FIXED_ASSET_ASSIGNMENT__COMMENTS = eINSTANCE.getPartyFixedAssetAssignment_Comments();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_FIXED_ASSET_ASSIGNMENT__STATUS_ID = eINSTANCE.getPartyFixedAssetAssignment_StatusId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_FIXED_ASSET_ASSIGNMENT__THRU_DATE = eINSTANCE.getPartyFixedAssetAssignment_ThruDate();

	}

} //FixedassetPackage
