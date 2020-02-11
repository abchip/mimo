/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.geo;

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
 * @see org.abchip.mimo.biz.common.geo.GeoFactory
 * @model kind="package"
 * @generated
 */
public interface GeoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "geo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/common/geo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-geo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeoPackage eINSTANCE = org.abchip.mimo.biz.common.geo.impl.GeoPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.geo.impl.CountryAddressFormatImpl <em>Country Address Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.geo.impl.CountryAddressFormatImpl
	 * @see org.abchip.mimo.biz.common.geo.impl.GeoPackageImpl#getCountryAddressFormat()
	 * @generated
	 */
	int COUNTRY_ADDRESS_FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_ADDRESS_FORMAT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_ADDRESS_FORMAT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_ADDRESS_FORMAT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_ADDRESS_FORMAT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_ADDRESS_FORMAT__GEO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Address Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_ADDRESS_FORMAT__ADDRESS_FORMAT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Geo Assoc Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_ADDRESS_FORMAT__GEO_ASSOC_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Postal Code Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_ADDRESS_FORMAT__HAS_POSTAL_CODE_EXT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Postal Code Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_ADDRESS_FORMAT__POSTAL_CODE_REGEX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Require Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_ADDRESS_FORMAT__REQUIRE_POSTAL_CODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Require Postal Code Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_ADDRESS_FORMAT__REQUIRE_POSTAL_CODE_EXT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Require State Province Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_ADDRESS_FORMAT__REQUIRE_STATE_PROVINCE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Country Address Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_ADDRESS_FORMAT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.geo.impl.CountryCodeImpl <em>Country Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.geo.impl.CountryCodeImpl
	 * @see org.abchip.mimo.biz.common.geo.impl.GeoPackageImpl#getCountryCode()
	 * @generated
	 */
	int COUNTRY_CODE = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CODE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CODE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CODE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CODE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CODE__COUNTRY_CODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Country Abbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CODE__COUNTRY_ABBR = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Country Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CODE__COUNTRY_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Country Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CODE__COUNTRY_NUMBER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Country Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CODE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.geo.impl.CountryCapitalImpl <em>Country Capital</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.geo.impl.CountryCapitalImpl
	 * @see org.abchip.mimo.biz.common.geo.impl.GeoPackageImpl#getCountryCapital()
	 * @generated
	 */
	int COUNTRY_CAPITAL = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CAPITAL__CREATED_STAMP = COUNTRY_CODE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CAPITAL__CREATED_TX_STAMP = COUNTRY_CODE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CAPITAL__LAST_UPDATED_STAMP = COUNTRY_CODE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CAPITAL__LAST_UPDATED_TX_STAMP = COUNTRY_CODE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CAPITAL__COUNTRY_CODE = COUNTRY_CODE__COUNTRY_CODE;

	/**
	 * The feature id for the '<em><b>Country Abbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CAPITAL__COUNTRY_ABBR = COUNTRY_CODE__COUNTRY_ABBR;

	/**
	 * The feature id for the '<em><b>Country Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CAPITAL__COUNTRY_NAME = COUNTRY_CODE__COUNTRY_NAME;

	/**
	 * The feature id for the '<em><b>Country Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CAPITAL__COUNTRY_NUMBER = COUNTRY_CODE__COUNTRY_NUMBER;

	/**
	 * The feature id for the '<em><b>Country Capital</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CAPITAL__COUNTRY_CAPITAL = COUNTRY_CODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Country Capital</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_CAPITAL_FEATURE_COUNT = COUNTRY_CODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.geo.impl.CountryTeleCodeImpl <em>Country Tele Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.geo.impl.CountryTeleCodeImpl
	 * @see org.abchip.mimo.biz.common.geo.impl.GeoPackageImpl#getCountryTeleCode()
	 * @generated
	 */
	int COUNTRY_TELE_CODE = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TELE_CODE__CREATED_STAMP = COUNTRY_CODE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TELE_CODE__CREATED_TX_STAMP = COUNTRY_CODE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TELE_CODE__LAST_UPDATED_STAMP = COUNTRY_CODE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TELE_CODE__LAST_UPDATED_TX_STAMP = COUNTRY_CODE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TELE_CODE__COUNTRY_CODE = COUNTRY_CODE__COUNTRY_CODE;

	/**
	 * The feature id for the '<em><b>Country Abbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TELE_CODE__COUNTRY_ABBR = COUNTRY_CODE__COUNTRY_ABBR;

	/**
	 * The feature id for the '<em><b>Country Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TELE_CODE__COUNTRY_NAME = COUNTRY_CODE__COUNTRY_NAME;

	/**
	 * The feature id for the '<em><b>Country Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TELE_CODE__COUNTRY_NUMBER = COUNTRY_CODE__COUNTRY_NUMBER;

	/**
	 * The feature id for the '<em><b>Tele Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TELE_CODE__TELE_CODE = COUNTRY_CODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Country Tele Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_TELE_CODE_FEATURE_COUNT = COUNTRY_CODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.geo.impl.GeoImpl <em>Geo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.geo.impl.GeoImpl
	 * @see org.abchip.mimo.biz.common.geo.impl.GeoPackageImpl#getGeo()
	 * @generated
	 */
	int GEO = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__GEO_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__ABBREVIATION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Geo Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__GEO_CODE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Geo Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__GEO_NAME = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Geo Sec Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__GEO_SEC_CODE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Geo Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__GEO_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Main Geo Assocs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__MAIN_GEO_ASSOCS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tax Auth Tax Authorities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__TAX_AUTH_TAX_AUTHORITIES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Well Known Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO__WELL_KNOWN_TEXT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Geo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.geo.impl.GeoAssocImpl <em>Assoc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.geo.impl.GeoAssocImpl
	 * @see org.abchip.mimo.biz.common.geo.impl.GeoPackageImpl#getGeoAssoc()
	 * @generated
	 */
	int GEO_ASSOC = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_ASSOC__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_ASSOC__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_ASSOC__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_ASSOC__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_ASSOC__GEO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Geo Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_ASSOC__GEO_ID_TO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Geo Assoc Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_ASSOC__GEO_ASSOC_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_ASSOC_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.geo.impl.GeoAssocTypeImpl <em>Assoc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.geo.impl.GeoAssocTypeImpl
	 * @see org.abchip.mimo.biz.common.geo.impl.GeoPackageImpl#getGeoAssocType()
	 * @generated
	 */
	int GEO_ASSOC_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_ASSOC_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_ASSOC_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_ASSOC_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_ASSOC_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Geo Assoc Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_ASSOC_TYPE__GEO_ASSOC_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_ASSOC_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assoc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_ASSOC_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.geo.impl.GeoPointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.geo.impl.GeoPointImpl
	 * @see org.abchip.mimo.biz.common.geo.impl.GeoPackageImpl#getGeoPoint()
	 * @generated
	 */
	int GEO_POINT = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_POINT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_POINT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_POINT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_POINT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Geo Point Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_POINT__GEO_POINT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Source Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_POINT__DATA_SOURCE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_POINT__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_POINT__ELEVATION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Elevation Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_POINT__ELEVATION_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Geo Point Type Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_POINT__GEO_POINT_TYPE_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_POINT__INFORMATION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_POINT__LATITUDE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_POINT__LONGITUDE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_POINT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.geo.impl.GeoTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.geo.impl.GeoTypeImpl
	 * @see org.abchip.mimo.biz.common.geo.impl.GeoPackageImpl#getGeoType()
	 * @generated
	 */
	int GEO_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Geo Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_TYPE__GEO_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.geo.CountryAddressFormat <em>Country Address Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country Address Format</em>'.
	 * @see org.abchip.mimo.biz.common.geo.CountryAddressFormat
	 * @generated
	 */
	EClass getCountryAddressFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.CountryAddressFormat#getGeoId <em>Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geo Id</em>'.
	 * @see org.abchip.mimo.biz.common.geo.CountryAddressFormat#getGeoId()
	 * @see #getCountryAddressFormat()
	 * @generated
	 */
	EAttribute getCountryAddressFormat_GeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.CountryAddressFormat#getAddressFormat <em>Address Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Format</em>'.
	 * @see org.abchip.mimo.biz.common.geo.CountryAddressFormat#getAddressFormat()
	 * @see #getCountryAddressFormat()
	 * @generated
	 */
	EAttribute getCountryAddressFormat_AddressFormat();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.geo.CountryAddressFormat#getGeoAssocTypeId <em>Geo Assoc Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo Assoc Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.geo.CountryAddressFormat#getGeoAssocTypeId()
	 * @see #getCountryAddressFormat()
	 * @generated
	 */
	EReference getCountryAddressFormat_GeoAssocTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.CountryAddressFormat#isHasPostalCodeExt <em>Has Postal Code Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Postal Code Ext</em>'.
	 * @see org.abchip.mimo.biz.common.geo.CountryAddressFormat#isHasPostalCodeExt()
	 * @see #getCountryAddressFormat()
	 * @generated
	 */
	EAttribute getCountryAddressFormat_HasPostalCodeExt();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.CountryAddressFormat#getPostalCodeRegex <em>Postal Code Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code Regex</em>'.
	 * @see org.abchip.mimo.biz.common.geo.CountryAddressFormat#getPostalCodeRegex()
	 * @see #getCountryAddressFormat()
	 * @generated
	 */
	EAttribute getCountryAddressFormat_PostalCodeRegex();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.CountryAddressFormat#isRequirePostalCode <em>Require Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Require Postal Code</em>'.
	 * @see org.abchip.mimo.biz.common.geo.CountryAddressFormat#isRequirePostalCode()
	 * @see #getCountryAddressFormat()
	 * @generated
	 */
	EAttribute getCountryAddressFormat_RequirePostalCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.CountryAddressFormat#isRequirePostalCodeExt <em>Require Postal Code Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Require Postal Code Ext</em>'.
	 * @see org.abchip.mimo.biz.common.geo.CountryAddressFormat#isRequirePostalCodeExt()
	 * @see #getCountryAddressFormat()
	 * @generated
	 */
	EAttribute getCountryAddressFormat_RequirePostalCodeExt();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.CountryAddressFormat#getRequireStateProvinceId <em>Require State Province Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Require State Province Id</em>'.
	 * @see org.abchip.mimo.biz.common.geo.CountryAddressFormat#getRequireStateProvinceId()
	 * @see #getCountryAddressFormat()
	 * @generated
	 */
	EAttribute getCountryAddressFormat_RequireStateProvinceId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.geo.CountryCapital <em>Country Capital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country Capital</em>'.
	 * @see org.abchip.mimo.biz.common.geo.CountryCapital
	 * @generated
	 */
	EClass getCountryCapital();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.CountryCapital#getCountryCapital <em>Country Capital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Capital</em>'.
	 * @see org.abchip.mimo.biz.common.geo.CountryCapital#getCountryCapital()
	 * @see #getCountryCapital()
	 * @generated
	 */
	EAttribute getCountryCapital_CountryCapital();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.geo.CountryCode <em>Country Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country Code</em>'.
	 * @see org.abchip.mimo.biz.common.geo.CountryCode
	 * @generated
	 */
	EClass getCountryCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.CountryCode#getCountryCode <em>Country Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Code</em>'.
	 * @see org.abchip.mimo.biz.common.geo.CountryCode#getCountryCode()
	 * @see #getCountryCode()
	 * @generated
	 */
	EAttribute getCountryCode_CountryCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.CountryCode#getCountryAbbr <em>Country Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Abbr</em>'.
	 * @see org.abchip.mimo.biz.common.geo.CountryCode#getCountryAbbr()
	 * @see #getCountryCode()
	 * @generated
	 */
	EAttribute getCountryCode_CountryAbbr();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.CountryCode#getCountryName <em>Country Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Name</em>'.
	 * @see org.abchip.mimo.biz.common.geo.CountryCode#getCountryName()
	 * @see #getCountryCode()
	 * @generated
	 */
	EAttribute getCountryCode_CountryName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.CountryCode#getCountryNumber <em>Country Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Number</em>'.
	 * @see org.abchip.mimo.biz.common.geo.CountryCode#getCountryNumber()
	 * @see #getCountryCode()
	 * @generated
	 */
	EAttribute getCountryCode_CountryNumber();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.geo.CountryTeleCode <em>Country Tele Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country Tele Code</em>'.
	 * @see org.abchip.mimo.biz.common.geo.CountryTeleCode
	 * @generated
	 */
	EClass getCountryTeleCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.CountryTeleCode#getTeleCode <em>Tele Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tele Code</em>'.
	 * @see org.abchip.mimo.biz.common.geo.CountryTeleCode#getTeleCode()
	 * @see #getCountryTeleCode()
	 * @generated
	 */
	EAttribute getCountryTeleCode_TeleCode();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.geo.Geo <em>Geo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geo</em>'.
	 * @see org.abchip.mimo.biz.common.geo.Geo
	 * @generated
	 */
	EClass getGeo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.Geo#getGeoId <em>Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geo Id</em>'.
	 * @see org.abchip.mimo.biz.common.geo.Geo#getGeoId()
	 * @see #getGeo()
	 * @generated
	 */
	EAttribute getGeo_GeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.Geo#getAbbreviation <em>Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbreviation</em>'.
	 * @see org.abchip.mimo.biz.common.geo.Geo#getAbbreviation()
	 * @see #getGeo()
	 * @generated
	 */
	EAttribute getGeo_Abbreviation();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.Geo#getGeoCode <em>Geo Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geo Code</em>'.
	 * @see org.abchip.mimo.biz.common.geo.Geo#getGeoCode()
	 * @see #getGeo()
	 * @generated
	 */
	EAttribute getGeo_GeoCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.Geo#getGeoName <em>Geo Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geo Name</em>'.
	 * @see org.abchip.mimo.biz.common.geo.Geo#getGeoName()
	 * @see #getGeo()
	 * @generated
	 */
	EAttribute getGeo_GeoName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.Geo#getGeoSecCode <em>Geo Sec Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geo Sec Code</em>'.
	 * @see org.abchip.mimo.biz.common.geo.Geo#getGeoSecCode()
	 * @see #getGeo()
	 * @generated
	 */
	EAttribute getGeo_GeoSecCode();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.geo.Geo#getGeoTypeId <em>Geo Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.geo.Geo#getGeoTypeId()
	 * @see #getGeo()
	 * @generated
	 */
	EReference getGeo_GeoTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.common.geo.Geo#getMainGeoAssocs <em>Main Geo Assocs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Main Geo Assocs</em>'.
	 * @see org.abchip.mimo.biz.common.geo.Geo#getMainGeoAssocs()
	 * @see #getGeo()
	 * @generated
	 */
	EReference getGeo_MainGeoAssocs();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.common.geo.Geo#getTaxAuthTaxAuthorities <em>Tax Auth Tax Authorities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tax Auth Tax Authorities</em>'.
	 * @see org.abchip.mimo.biz.common.geo.Geo#getTaxAuthTaxAuthorities()
	 * @see #getGeo()
	 * @generated
	 */
	EReference getGeo_TaxAuthTaxAuthorities();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.Geo#getWellKnownText <em>Well Known Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Well Known Text</em>'.
	 * @see org.abchip.mimo.biz.common.geo.Geo#getWellKnownText()
	 * @see #getGeo()
	 * @generated
	 */
	EAttribute getGeo_WellKnownText();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.geo.GeoAssoc <em>Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assoc</em>'.
	 * @see org.abchip.mimo.biz.common.geo.GeoAssoc
	 * @generated
	 */
	EClass getGeoAssoc();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.geo.GeoAssoc#getGeoId <em>Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo Id</em>'.
	 * @see org.abchip.mimo.biz.common.geo.GeoAssoc#getGeoId()
	 * @see #getGeoAssoc()
	 * @generated
	 */
	EReference getGeoAssoc_GeoId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.geo.GeoAssoc#getGeoIdTo <em>Geo Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo Id To</em>'.
	 * @see org.abchip.mimo.biz.common.geo.GeoAssoc#getGeoIdTo()
	 * @see #getGeoAssoc()
	 * @generated
	 */
	EReference getGeoAssoc_GeoIdTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.geo.GeoAssoc#getGeoAssocTypeId <em>Geo Assoc Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo Assoc Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.geo.GeoAssoc#getGeoAssocTypeId()
	 * @see #getGeoAssoc()
	 * @generated
	 */
	EReference getGeoAssoc_GeoAssocTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.geo.GeoAssocType <em>Assoc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assoc Type</em>'.
	 * @see org.abchip.mimo.biz.common.geo.GeoAssocType
	 * @generated
	 */
	EClass getGeoAssocType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.GeoAssocType#getGeoAssocTypeId <em>Geo Assoc Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geo Assoc Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.geo.GeoAssocType#getGeoAssocTypeId()
	 * @see #getGeoAssocType()
	 * @generated
	 */
	EAttribute getGeoAssocType_GeoAssocTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.GeoAssocType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.common.geo.GeoAssocType#getDescription()
	 * @see #getGeoAssocType()
	 * @generated
	 */
	EAttribute getGeoAssocType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.geo.GeoPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see org.abchip.mimo.biz.common.geo.GeoPoint
	 * @generated
	 */
	EClass getGeoPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.GeoPoint#getGeoPointId <em>Geo Point Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geo Point Id</em>'.
	 * @see org.abchip.mimo.biz.common.geo.GeoPoint#getGeoPointId()
	 * @see #getGeoPoint()
	 * @generated
	 */
	EAttribute getGeoPoint_GeoPointId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.geo.GeoPoint#getDataSourceId <em>Data Source Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Source Id</em>'.
	 * @see org.abchip.mimo.biz.common.geo.GeoPoint#getDataSourceId()
	 * @see #getGeoPoint()
	 * @generated
	 */
	EReference getGeoPoint_DataSourceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.GeoPoint#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.common.geo.GeoPoint#getDescription()
	 * @see #getGeoPoint()
	 * @generated
	 */
	EAttribute getGeoPoint_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.GeoPoint#getElevation <em>Elevation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elevation</em>'.
	 * @see org.abchip.mimo.biz.common.geo.GeoPoint#getElevation()
	 * @see #getGeoPoint()
	 * @generated
	 */
	EAttribute getGeoPoint_Elevation();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.geo.GeoPoint#getElevationUomId <em>Elevation Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Elevation Uom Id</em>'.
	 * @see org.abchip.mimo.biz.common.geo.GeoPoint#getElevationUomId()
	 * @see #getGeoPoint()
	 * @generated
	 */
	EReference getGeoPoint_ElevationUomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.geo.GeoPoint#getGeoPointTypeEnumId <em>Geo Point Type Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo Point Type Enum Id</em>'.
	 * @see org.abchip.mimo.biz.common.geo.GeoPoint#getGeoPointTypeEnumId()
	 * @see #getGeoPoint()
	 * @generated
	 */
	EReference getGeoPoint_GeoPointTypeEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.GeoPoint#getInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Information</em>'.
	 * @see org.abchip.mimo.biz.common.geo.GeoPoint#getInformation()
	 * @see #getGeoPoint()
	 * @generated
	 */
	EAttribute getGeoPoint_Information();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.GeoPoint#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see org.abchip.mimo.biz.common.geo.GeoPoint#getLatitude()
	 * @see #getGeoPoint()
	 * @generated
	 */
	EAttribute getGeoPoint_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.GeoPoint#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see org.abchip.mimo.biz.common.geo.GeoPoint#getLongitude()
	 * @see #getGeoPoint()
	 * @generated
	 */
	EAttribute getGeoPoint_Longitude();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.geo.GeoType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.common.geo.GeoType
	 * @generated
	 */
	EClass getGeoType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.GeoType#getGeoTypeId <em>Geo Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geo Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.geo.GeoType#getGeoTypeId()
	 * @see #getGeoType()
	 * @generated
	 */
	EAttribute getGeoType_GeoTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.GeoType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.common.geo.GeoType#getDescription()
	 * @see #getGeoType()
	 * @generated
	 */
	EAttribute getGeoType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.geo.GeoType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.common.geo.GeoType#isHasTable()
	 * @see #getGeoType()
	 * @generated
	 */
	EAttribute getGeoType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.geo.GeoType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.geo.GeoType#getParentTypeId()
	 * @see #getGeoType()
	 * @generated
	 */
	EReference getGeoType_ParentTypeId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeoFactory getGeoFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.geo.impl.CountryAddressFormatImpl <em>Country Address Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.geo.impl.CountryAddressFormatImpl
		 * @see org.abchip.mimo.biz.common.geo.impl.GeoPackageImpl#getCountryAddressFormat()
		 * @generated
		 */
		EClass COUNTRY_ADDRESS_FORMAT = eINSTANCE.getCountryAddressFormat();

		/**
		 * The meta object literal for the '<em><b>Geo Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY_ADDRESS_FORMAT__GEO_ID = eINSTANCE.getCountryAddressFormat_GeoId();

		/**
		 * The meta object literal for the '<em><b>Address Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY_ADDRESS_FORMAT__ADDRESS_FORMAT = eINSTANCE.getCountryAddressFormat_AddressFormat();

		/**
		 * The meta object literal for the '<em><b>Geo Assoc Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTRY_ADDRESS_FORMAT__GEO_ASSOC_TYPE_ID = eINSTANCE.getCountryAddressFormat_GeoAssocTypeId();

		/**
		 * The meta object literal for the '<em><b>Has Postal Code Ext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY_ADDRESS_FORMAT__HAS_POSTAL_CODE_EXT = eINSTANCE.getCountryAddressFormat_HasPostalCodeExt();

		/**
		 * The meta object literal for the '<em><b>Postal Code Regex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY_ADDRESS_FORMAT__POSTAL_CODE_REGEX = eINSTANCE.getCountryAddressFormat_PostalCodeRegex();

		/**
		 * The meta object literal for the '<em><b>Require Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY_ADDRESS_FORMAT__REQUIRE_POSTAL_CODE = eINSTANCE.getCountryAddressFormat_RequirePostalCode();

		/**
		 * The meta object literal for the '<em><b>Require Postal Code Ext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY_ADDRESS_FORMAT__REQUIRE_POSTAL_CODE_EXT = eINSTANCE.getCountryAddressFormat_RequirePostalCodeExt();

		/**
		 * The meta object literal for the '<em><b>Require State Province Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY_ADDRESS_FORMAT__REQUIRE_STATE_PROVINCE_ID = eINSTANCE.getCountryAddressFormat_RequireStateProvinceId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.geo.impl.CountryCapitalImpl <em>Country Capital</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.geo.impl.CountryCapitalImpl
		 * @see org.abchip.mimo.biz.common.geo.impl.GeoPackageImpl#getCountryCapital()
		 * @generated
		 */
		EClass COUNTRY_CAPITAL = eINSTANCE.getCountryCapital();

		/**
		 * The meta object literal for the '<em><b>Country Capital</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY_CAPITAL__COUNTRY_CAPITAL = eINSTANCE.getCountryCapital_CountryCapital();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.geo.impl.CountryCodeImpl <em>Country Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.geo.impl.CountryCodeImpl
		 * @see org.abchip.mimo.biz.common.geo.impl.GeoPackageImpl#getCountryCode()
		 * @generated
		 */
		EClass COUNTRY_CODE = eINSTANCE.getCountryCode();

		/**
		 * The meta object literal for the '<em><b>Country Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY_CODE__COUNTRY_CODE = eINSTANCE.getCountryCode_CountryCode();

		/**
		 * The meta object literal for the '<em><b>Country Abbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY_CODE__COUNTRY_ABBR = eINSTANCE.getCountryCode_CountryAbbr();

		/**
		 * The meta object literal for the '<em><b>Country Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY_CODE__COUNTRY_NAME = eINSTANCE.getCountryCode_CountryName();

		/**
		 * The meta object literal for the '<em><b>Country Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY_CODE__COUNTRY_NUMBER = eINSTANCE.getCountryCode_CountryNumber();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.geo.impl.CountryTeleCodeImpl <em>Country Tele Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.geo.impl.CountryTeleCodeImpl
		 * @see org.abchip.mimo.biz.common.geo.impl.GeoPackageImpl#getCountryTeleCode()
		 * @generated
		 */
		EClass COUNTRY_TELE_CODE = eINSTANCE.getCountryTeleCode();

		/**
		 * The meta object literal for the '<em><b>Tele Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY_TELE_CODE__TELE_CODE = eINSTANCE.getCountryTeleCode_TeleCode();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.geo.impl.GeoImpl <em>Geo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.geo.impl.GeoImpl
		 * @see org.abchip.mimo.biz.common.geo.impl.GeoPackageImpl#getGeo()
		 * @generated
		 */
		EClass GEO = eINSTANCE.getGeo();

		/**
		 * The meta object literal for the '<em><b>Geo Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO__GEO_ID = eINSTANCE.getGeo_GeoId();

		/**
		 * The meta object literal for the '<em><b>Abbreviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO__ABBREVIATION = eINSTANCE.getGeo_Abbreviation();

		/**
		 * The meta object literal for the '<em><b>Geo Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO__GEO_CODE = eINSTANCE.getGeo_GeoCode();

		/**
		 * The meta object literal for the '<em><b>Geo Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO__GEO_NAME = eINSTANCE.getGeo_GeoName();

		/**
		 * The meta object literal for the '<em><b>Geo Sec Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO__GEO_SEC_CODE = eINSTANCE.getGeo_GeoSecCode();

		/**
		 * The meta object literal for the '<em><b>Geo Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO__GEO_TYPE_ID = eINSTANCE.getGeo_GeoTypeId();

		/**
		 * The meta object literal for the '<em><b>Main Geo Assocs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO__MAIN_GEO_ASSOCS = eINSTANCE.getGeo_MainGeoAssocs();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Tax Authorities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO__TAX_AUTH_TAX_AUTHORITIES = eINSTANCE.getGeo_TaxAuthTaxAuthorities();

		/**
		 * The meta object literal for the '<em><b>Well Known Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO__WELL_KNOWN_TEXT = eINSTANCE.getGeo_WellKnownText();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.geo.impl.GeoAssocImpl <em>Assoc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.geo.impl.GeoAssocImpl
		 * @see org.abchip.mimo.biz.common.geo.impl.GeoPackageImpl#getGeoAssoc()
		 * @generated
		 */
		EClass GEO_ASSOC = eINSTANCE.getGeoAssoc();

		/**
		 * The meta object literal for the '<em><b>Geo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_ASSOC__GEO_ID = eINSTANCE.getGeoAssoc_GeoId();

		/**
		 * The meta object literal for the '<em><b>Geo Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_ASSOC__GEO_ID_TO = eINSTANCE.getGeoAssoc_GeoIdTo();

		/**
		 * The meta object literal for the '<em><b>Geo Assoc Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_ASSOC__GEO_ASSOC_TYPE_ID = eINSTANCE.getGeoAssoc_GeoAssocTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.geo.impl.GeoAssocTypeImpl <em>Assoc Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.geo.impl.GeoAssocTypeImpl
		 * @see org.abchip.mimo.biz.common.geo.impl.GeoPackageImpl#getGeoAssocType()
		 * @generated
		 */
		EClass GEO_ASSOC_TYPE = eINSTANCE.getGeoAssocType();

		/**
		 * The meta object literal for the '<em><b>Geo Assoc Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_ASSOC_TYPE__GEO_ASSOC_TYPE_ID = eINSTANCE.getGeoAssocType_GeoAssocTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_ASSOC_TYPE__DESCRIPTION = eINSTANCE.getGeoAssocType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.geo.impl.GeoPointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.geo.impl.GeoPointImpl
		 * @see org.abchip.mimo.biz.common.geo.impl.GeoPackageImpl#getGeoPoint()
		 * @generated
		 */
		EClass GEO_POINT = eINSTANCE.getGeoPoint();

		/**
		 * The meta object literal for the '<em><b>Geo Point Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_POINT__GEO_POINT_ID = eINSTANCE.getGeoPoint_GeoPointId();

		/**
		 * The meta object literal for the '<em><b>Data Source Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_POINT__DATA_SOURCE_ID = eINSTANCE.getGeoPoint_DataSourceId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_POINT__DESCRIPTION = eINSTANCE.getGeoPoint_Description();

		/**
		 * The meta object literal for the '<em><b>Elevation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_POINT__ELEVATION = eINSTANCE.getGeoPoint_Elevation();

		/**
		 * The meta object literal for the '<em><b>Elevation Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_POINT__ELEVATION_UOM_ID = eINSTANCE.getGeoPoint_ElevationUomId();

		/**
		 * The meta object literal for the '<em><b>Geo Point Type Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_POINT__GEO_POINT_TYPE_ENUM_ID = eINSTANCE.getGeoPoint_GeoPointTypeEnumId();

		/**
		 * The meta object literal for the '<em><b>Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_POINT__INFORMATION = eINSTANCE.getGeoPoint_Information();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_POINT__LATITUDE = eINSTANCE.getGeoPoint_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_POINT__LONGITUDE = eINSTANCE.getGeoPoint_Longitude();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.geo.impl.GeoTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.geo.impl.GeoTypeImpl
		 * @see org.abchip.mimo.biz.common.geo.impl.GeoPackageImpl#getGeoType()
		 * @generated
		 */
		EClass GEO_TYPE = eINSTANCE.getGeoType();

		/**
		 * The meta object literal for the '<em><b>Geo Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_TYPE__GEO_TYPE_ID = eINSTANCE.getGeoType_GeoTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_TYPE__DESCRIPTION = eINSTANCE.getGeoType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_TYPE__HAS_TABLE = eINSTANCE.getGeoType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_TYPE__PARENT_TYPE_ID = eINSTANCE.getGeoType_ParentTypeId();

	}

} //GeoPackage
