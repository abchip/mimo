/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party;

import org.abchip.mimo.biz.BizPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see org.abchip.mimo.biz.party.party.PartyFactory
 * @model kind="package"
 * @generated
 */
public interface PartyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "party";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/party/party";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-party";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PartyPackage eINSTANCE = org.abchip.mimo.biz.party.party.impl.PartyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.AddressMatchMapImpl <em>Address Match Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.AddressMatchMapImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getAddressMatchMap()
	 * @generated
	 */
	int ADDRESS_MATCH_MAP = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MATCH_MAP__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MATCH_MAP__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MATCH_MAP__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MATCH_MAP__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Map Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MATCH_MAP__MAP_KEY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Map Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MATCH_MAP__MAP_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MATCH_MAP__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Address Match Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MATCH_MAP_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MATCH_MAP___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MATCH_MAP___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MATCH_MAP___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MATCH_MAP___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The number of operations of the '<em>Address Match Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MATCH_MAP_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.AffiliateImpl <em>Affiliate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.AffiliateImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getAffiliate()
	 * @generated
	 */
	int AFFILIATE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Affiliate Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__AFFILIATE_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Affiliate Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__AFFILIATE_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date Time Approved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__DATE_TIME_APPROVED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Date Time Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__DATE_TIME_CREATED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Site Page Views</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__SITE_PAGE_VIEWS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Site Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__SITE_TYPE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Site Visitors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__SITE_VISITORS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Year Established</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__YEAR_ESTABLISHED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Affiliate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The number of operations of the '<em>Affiliate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFILIATE_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyImpl <em>Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getParty()
	 * @generated
	 */
	int PARTY = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__CREATED_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__EXTERNAL_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Unread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__IS_UNREAD = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__LAST_MODIFIED_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Party Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__CREATED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__LAST_MODIFIED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Preferred Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PREFERRED_CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__STATUS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Data Source Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__DATA_SOURCE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Party Attributes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_ATTRIBUTES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Party Identifications</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_IDENTIFICATIONS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Party Name Histories</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_NAME_HISTORIES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Party Notes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_NOTES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Party Profile Defaults</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_PROFILE_DEFAULTS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Party Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_ROLES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Party Skills</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__PARTY_SKILLS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Supplier Product Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY__SUPPLIER_PRODUCT_FEATURES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___ISA = BizPackage.BIZ_ENTITY_TYPED___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___GET_NAME = BizPackage.BIZ_ENTITY_TYPED___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___GET_URI = BizPackage.BIZ_ENTITY_TYPED___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___IS_PROXY = BizPackage.BIZ_ENTITY_TYPED___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___GET_TYPE = BizPackage.BIZ_ENTITY_TYPED___GET_TYPE;

	/**
	 * The operation id for the '<em>Acctg Trans Entries</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___ACCTG_TRANS_ENTRIES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Acctg Transs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___ACCTG_TRANSS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Applying Employment Apps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___APPLYING_EMPLOYMENT_APPS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Approver Employment Apps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___APPROVER_EMPLOYMENT_APPS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Carrier Order Item Ship Groups</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___CARRIER_ORDER_ITEM_SHIP_GROUPS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Carrier Shipment Box Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___CARRIER_SHIPMENT_BOX_TYPES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Carrier Shipment Route Segments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___CARRIER_SHIPMENT_ROUTE_SEGMENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Client Timesheets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___CLIENT_TIMESHEETS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Committed By Content Revisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___COMMITTED_BY_CONTENT_REVISIONS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Content Approvals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___CONTENT_APPROVALS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Cost Components</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___COST_COMPONENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Cust Request Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___CUST_REQUEST_TYPES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Empl Positions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___EMPL_POSITIONS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Fin Account Transs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___FIN_ACCOUNT_TRANSS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Fixed Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___FIXED_ASSETS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>From Agreements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___FROM_AGREEMENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>From Communication Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___FROM_COMMUNICATION_EVENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>From Cust Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___FROM_CUST_REQUESTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>From Invoices</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___FROM_INVOICES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>From Payments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___FROM_PAYMENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>From Shipments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___FROM_SHIPMENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Gift Card Fulfillments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___GIFT_CARD_FULFILLMENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Gl Account Organizations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___GL_ACCOUNT_ORGANIZATIONS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Gl Journals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___GL_JOURNALS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Gl Reconciliations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___GL_RECONCILIATIONS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Gov Agency Fixed Asset Registrations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___GOV_AGENCY_FIXED_ASSET_REGISTRATIONS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Internal Sales Forecast Histories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___INTERNAL_SALES_FORECAST_HISTORIES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Internal Sales Forecasts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___INTERNAL_SALES_FORECASTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Interviewee Job Interviews</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___INTERVIEWEE_JOB_INTERVIEWS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Interviewer Job Interviews</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___INTERVIEWER_JOB_INTERVIEWS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Inventory Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___INVENTORY_ITEMS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Invoices</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___INVOICES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Note Note Datas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___NOTE_NOTE_DATAS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Organization Custom Time Periods</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___ORGANIZATION_CUSTOM_TIME_PERIODS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Organization Fin Account Type Gl Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___ORGANIZATION_FIN_ACCOUNT_TYPE_GL_ACCOUNTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Organization Fin Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___ORGANIZATION_FIN_ACCOUNTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Organization Gl Account Type Defaults</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___ORGANIZATION_GL_ACCOUNT_TYPE_DEFAULTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Organization Invoice Item Type Gl Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___ORGANIZATION_INVOICE_ITEM_TYPE_GL_ACCOUNTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Organization Payment Method Type Gl Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___ORGANIZATION_PAYMENT_METHOD_TYPE_GL_ACCOUNTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Organization Sales Forecast Histories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___ORGANIZATION_SALES_FORECAST_HISTORIES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Organization Sales Forecasts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___ORGANIZATION_SALES_FORECASTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Organization Variance Reason Gl Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___ORGANIZATION_VARIANCE_REASON_GL_ACCOUNTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Originated From Subscriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___ORIGINATED_FROM_SUBSCRIPTIONS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Override Org Invoice Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___OVERRIDE_ORG_INVOICE_ITEMS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Owner Contact Lists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___OWNER_CONTACT_LISTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>Owner Facilities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___OWNER_FACILITIES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Owner Fin Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___OWNER_FIN_ACCOUNTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Owner Inventory Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___OWNER_INVENTORY_ITEMS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 47;

	/**
	 * The operation id for the '<em>Party Invitations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___PARTY_INVITATIONS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 48;

	/**
	 * The operation id for the '<em>Party Pref Doc Type Tpls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___PARTY_PREF_DOC_TYPE_TPLS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 49;

	/**
	 * The operation id for the '<em>Party Resumes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___PARTY_RESUMES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 50;

	/**
	 * The operation id for the '<em>Payment Gl Account Type Maps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___PAYMENT_GL_ACCOUNT_TYPE_MAPS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 51;

	/**
	 * The operation id for the '<em>Payment Methods</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___PAYMENT_METHODS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 52;

	/**
	 * The operation id for the '<em>Performed By Fin Account Transs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___PERFORMED_BY_FIN_ACCOUNT_TRANSS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 53;

	/**
	 * The operation id for the '<em>Product Promo Code Parties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___PRODUCT_PROMO_CODE_PARTIES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 54;

	/**
	 * The operation id for the '<em>Product Promo Uses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___PRODUCT_PROMO_USES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 55;

	/**
	 * The operation id for the '<em>Product Promos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___PRODUCT_PROMOS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 56;

	/**
	 * The operation id for the '<em>Product Store Shipment Meths</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___PRODUCT_STORE_SHIPMENT_METHS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 57;

	/**
	 * The operation id for the '<em>Product Stores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___PRODUCT_STORES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 58;

	/**
	 * The operation id for the '<em>Quotes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___QUOTES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 59;

	/**
	 * The operation id for the '<em>Referred By Employment Apps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___REFERRED_BY_EMPLOYMENT_APPS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 60;

	/**
	 * The operation id for the '<em>Reorder Guidelines</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___REORDER_GUIDELINES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 61;

	/**
	 * The operation id for the '<em>Return Headers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___RETURN_HEADERS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 62;

	/**
	 * The operation id for the '<em>Shipment Cost Estimates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___SHIPMENT_COST_ESTIMATES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 63;

	/**
	 * The operation id for the '<em>Shopping Lists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___SHOPPING_LISTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 64;

	/**
	 * The operation id for the '<em>Subscriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___SUBSCRIPTIONS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 65;

	/**
	 * The operation id for the '<em>Supplier Order Item Ship Groups</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___SUPPLIER_ORDER_ITEM_SHIP_GROUPS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 66;

	/**
	 * The operation id for the '<em>Survey Responses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___SURVEY_RESPONSES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 67;

	/**
	 * The operation id for the '<em>Tax Auth Tax Authorities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___TAX_AUTH_TAX_AUTHORITIES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 68;

	/**
	 * The operation id for the '<em>Tax Authority Invoice Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___TAX_AUTHORITY_INVOICE_ITEMS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 69;

	/**
	 * The operation id for the '<em>Time Entries</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___TIME_ENTRIES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 70;

	/**
	 * The operation id for the '<em>Timesheets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___TIMESHEETS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 71;

	/**
	 * The operation id for the '<em>To Agreements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___TO_AGREEMENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 72;

	/**
	 * The operation id for the '<em>To Communication Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___TO_COMMUNICATION_EVENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 73;

	/**
	 * The operation id for the '<em>To Party Invitation Group Assocs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___TO_PARTY_INVITATION_GROUP_ASSOCS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 74;

	/**
	 * The operation id for the '<em>To Payments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___TO_PAYMENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 75;

	/**
	 * The operation id for the '<em>To Return Headers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___TO_RETURN_HEADERS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 76;

	/**
	 * The operation id for the '<em>To Shipments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___TO_SHIPMENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 77;

	/**
	 * The operation id for the '<em>User Login Histories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___USER_LOGIN_HISTORIES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 78;

	/**
	 * The operation id for the '<em>User Logins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___USER_LOGINS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 79;

	/**
	 * The operation id for the '<em>Vendor Order Item Ship Groups</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___VENDOR_ORDER_ITEM_SHIP_GROUPS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 80;

	/**
	 * The operation id for the '<em>Work Effort Event Reminders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY___WORK_EFFORT_EVENT_REMINDERS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 81;

	/**
	 * The number of operations of the '<em>Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_OPERATION_COUNT = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 82;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyAttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyAttributeImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyAttribute()
	 * @generated
	 */
	int PARTY_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ATTRIBUTE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ATTRIBUTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ATTRIBUTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ATTRIBUTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ATTRIBUTE__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ATTRIBUTE__ATTR_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ATTRIBUTE__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ATTRIBUTE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ATTRIBUTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ATTRIBUTE___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ATTRIBUTE___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ATTRIBUTE___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ATTRIBUTE___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ATTRIBUTE_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyCarrierAccountImpl <em>Carrier Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyCarrierAccountImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyCarrierAccount()
	 * @generated
	 */
	int PARTY_CARRIER_ACCOUNT = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CARRIER_ACCOUNT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CARRIER_ACCOUNT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CARRIER_ACCOUNT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CARRIER_ACCOUNT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CARRIER_ACCOUNT__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Account Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CARRIER_ACCOUNT__ACCOUNT_NUMBER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CARRIER_ACCOUNT__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CARRIER_ACCOUNT__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Carrier Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CARRIER_ACCOUNT__CARRIER_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Carrier Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CARRIER_ACCOUNT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CARRIER_ACCOUNT___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CARRIER_ACCOUNT___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CARRIER_ACCOUNT___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CARRIER_ACCOUNT___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The number of operations of the '<em>Carrier Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CARRIER_ACCOUNT_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyClassificationImpl <em>Classification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyClassificationImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyClassification()
	 * @generated
	 */
	int PARTY_CLASSIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION__FROM_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION__THRU_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION__PARTY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Party Classification Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION__PARTY_CLASSIFICATION_GROUP_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION___ISA = BizPackage.BIZ_ENTITY_TYPED___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION___GET_NAME = BizPackage.BIZ_ENTITY_TYPED___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION___GET_URI = BizPackage.BIZ_ENTITY_TYPED___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION___IS_PROXY = BizPackage.BIZ_ENTITY_TYPED___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION___GET_TYPE = BizPackage.BIZ_ENTITY_TYPED___GET_TYPE;

	/**
	 * The number of operations of the '<em>Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_OPERATION_COUNT = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyClassificationGroupImpl <em>Classification Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyClassificationGroupImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyClassificationGroup()
	 * @generated
	 */
	int PARTY_CLASSIFICATION_GROUP = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_GROUP__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_GROUP__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_GROUP__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_GROUP__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Party Classification Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_GROUP__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_GROUP__PARENT_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Party Classification Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Classification Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_GROUP_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_GROUP___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_GROUP___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_GROUP___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_GROUP___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The operation id for the '<em>Child Party Classification Groups</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_GROUP___CHILD_PARTY_CLASSIFICATION_GROUPS = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Segment Group Classifications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_GROUP___SEGMENT_GROUP_CLASSIFICATIONS = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Classification Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_GROUP_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyClassificationTypeImpl <em>Classification Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyClassificationTypeImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyClassificationType()
	 * @generated
	 */
	int PARTY_CLASSIFICATION_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Party Classification Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE__PARTY_CLASSIFICATION_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Classification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE___ISA = BizPackage.BIZ_ENTITY_TYPE___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE___GET_NAME = BizPackage.BIZ_ENTITY_TYPE___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE___GET_URI = BizPackage.BIZ_ENTITY_TYPE___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE___IS_PROXY = BizPackage.BIZ_ENTITY_TYPE___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Frame</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE___GET_FRAME = BizPackage.BIZ_ENTITY_TYPE___GET_FRAME;

	/**
	 * The operation id for the '<em>Get Type Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE___GET_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE___GET_TYPE_ID;

	/**
	 * The operation id for the '<em>Has Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE___HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE___HAS_TABLE;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE___GET_TEXT = BizPackage.BIZ_ENTITY_TYPE___GET_TEXT;

	/**
	 * The operation id for the '<em>Child Party Classification Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE___CHILD_PARTY_CLASSIFICATION_TYPES = BizPackage.BIZ_ENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Party Classification Groups</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE___PARTY_CLASSIFICATION_GROUPS = BizPackage.BIZ_ENTITY_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Classification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CLASSIFICATION_TYPE_OPERATION_COUNT = BizPackage.BIZ_ENTITY_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyContentImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyContent()
	 * @generated
	 */
	int PARTY_CONTENT = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT__FROM_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT__THRU_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT__PARTY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT__CONTENT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Content Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT__PARTY_CONTENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT___ISA = BizPackage.BIZ_ENTITY_TYPED___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT___GET_NAME = BizPackage.BIZ_ENTITY_TYPED___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT___GET_URI = BizPackage.BIZ_ENTITY_TYPED___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT___IS_PROXY = BizPackage.BIZ_ENTITY_TYPED___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT___GET_TYPE = BizPackage.BIZ_ENTITY_TYPED___GET_TYPE;

	/**
	 * The number of operations of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_OPERATION_COUNT = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyContentTypeImpl <em>Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyContentTypeImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyContentType()
	 * @generated
	 */
	int PARTY_CONTENT_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Party Content Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE__PARTY_CONTENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE___ISA = BizPackage.BIZ_ENTITY_TYPE___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE___GET_NAME = BizPackage.BIZ_ENTITY_TYPE___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE___GET_URI = BizPackage.BIZ_ENTITY_TYPE___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE___IS_PROXY = BizPackage.BIZ_ENTITY_TYPE___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Frame</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE___GET_FRAME = BizPackage.BIZ_ENTITY_TYPE___GET_FRAME;

	/**
	 * The operation id for the '<em>Get Type Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE___GET_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE___GET_TYPE_ID;

	/**
	 * The operation id for the '<em>Has Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE___HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE___HAS_TABLE;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE___GET_TEXT = BizPackage.BIZ_ENTITY_TYPE___GET_TEXT;

	/**
	 * The operation id for the '<em>Child Party Content Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE___CHILD_PARTY_CONTENT_TYPES = BizPackage.BIZ_ENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTENT_TYPE_OPERATION_COUNT = BizPackage.BIZ_ENTITY_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyDataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyDataSourceImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyDataSource()
	 * @generated
	 */
	int PARTY_DATA_SOURCE = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE__COMMENTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE__IS_CREATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Visit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE__VISIT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Data Source Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE__DATA_SOURCE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The number of operations of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_DATA_SOURCE_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyGeoPointImpl <em>Geo Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyGeoPointImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyGeoPoint()
	 * @generated
	 */
	int PARTY_GEO_POINT = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GEO_POINT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GEO_POINT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GEO_POINT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GEO_POINT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GEO_POINT__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GEO_POINT__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GEO_POINT__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Geo Point Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GEO_POINT__GEO_POINT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Geo Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GEO_POINT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GEO_POINT___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GEO_POINT___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GEO_POINT___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GEO_POINT___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The number of operations of the '<em>Geo Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GEO_POINT_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyGroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyGroupImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyGroup()
	 * @generated
	 */
	int PARTY_GROUP = 12;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__CREATED_STAMP = PARTY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__CREATED_TX_STAMP = PARTY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__LAST_UPDATED_STAMP = PARTY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__LAST_UPDATED_TX_STAMP = PARTY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PARTY_ID = PARTY__PARTY_ID;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__CREATED_DATE = PARTY__CREATED_DATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__DESCRIPTION = PARTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__EXTERNAL_ID = PARTY__EXTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Is Unread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__IS_UNREAD = PARTY__IS_UNREAD;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__LAST_MODIFIED_DATE = PARTY__LAST_MODIFIED_DATE;

	/**
	 * The feature id for the '<em><b>Party Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PARTY_TYPE_ID = PARTY__PARTY_TYPE_ID;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__CREATED_BY_USER_LOGIN = PARTY__CREATED_BY_USER_LOGIN;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__LAST_MODIFIED_BY_USER_LOGIN = PARTY__LAST_MODIFIED_BY_USER_LOGIN;

	/**
	 * The feature id for the '<em><b>Preferred Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PREFERRED_CURRENCY_UOM_ID = PARTY__PREFERRED_CURRENCY_UOM_ID;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__STATUS_ID = PARTY__STATUS_ID;

	/**
	 * The feature id for the '<em><b>Data Source Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__DATA_SOURCE_ID = PARTY__DATA_SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Party Attributes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PARTY_ATTRIBUTES = PARTY__PARTY_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Party Identifications</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PARTY_IDENTIFICATIONS = PARTY__PARTY_IDENTIFICATIONS;

	/**
	 * The feature id for the '<em><b>Party Name Histories</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PARTY_NAME_HISTORIES = PARTY__PARTY_NAME_HISTORIES;

	/**
	 * The feature id for the '<em><b>Party Notes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PARTY_NOTES = PARTY__PARTY_NOTES;

	/**
	 * The feature id for the '<em><b>Party Profile Defaults</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PARTY_PROFILE_DEFAULTS = PARTY__PARTY_PROFILE_DEFAULTS;

	/**
	 * The feature id for the '<em><b>Party Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PARTY_ROLES = PARTY__PARTY_ROLES;

	/**
	 * The feature id for the '<em><b>Party Skills</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__PARTY_SKILLS = PARTY__PARTY_SKILLS;

	/**
	 * The feature id for the '<em><b>Supplier Product Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__SUPPLIER_PRODUCT_FEATURES = PARTY__SUPPLIER_PRODUCT_FEATURES;

	/**
	 * The feature id for the '<em><b>Annual Revenue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__ANNUAL_REVENUE = PARTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__COMMENTS = PARTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__GROUP_NAME = PARTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group Name Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__GROUP_NAME_LOCAL = PARTY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Logo Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__LOGO_IMAGE_URL = PARTY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Num Employees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__NUM_EMPLOYEES = PARTY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Office Site Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__OFFICE_SITE_NAME = PARTY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ticker Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP__TICKER_SYMBOL = PARTY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP_FEATURE_COUNT = PARTY_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___ISA = PARTY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___GET_NAME = PARTY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___GET_URI = PARTY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___IS_PROXY = PARTY___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___GET_TYPE = PARTY___GET_TYPE;

	/**
	 * The operation id for the '<em>Acctg Trans Entries</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___ACCTG_TRANS_ENTRIES = PARTY___ACCTG_TRANS_ENTRIES;

	/**
	 * The operation id for the '<em>Acctg Transs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___ACCTG_TRANSS = PARTY___ACCTG_TRANSS;

	/**
	 * The operation id for the '<em>Applying Employment Apps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___APPLYING_EMPLOYMENT_APPS = PARTY___APPLYING_EMPLOYMENT_APPS;

	/**
	 * The operation id for the '<em>Approver Employment Apps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___APPROVER_EMPLOYMENT_APPS = PARTY___APPROVER_EMPLOYMENT_APPS;

	/**
	 * The operation id for the '<em>Carrier Order Item Ship Groups</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___CARRIER_ORDER_ITEM_SHIP_GROUPS = PARTY___CARRIER_ORDER_ITEM_SHIP_GROUPS;

	/**
	 * The operation id for the '<em>Carrier Shipment Box Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___CARRIER_SHIPMENT_BOX_TYPES = PARTY___CARRIER_SHIPMENT_BOX_TYPES;

	/**
	 * The operation id for the '<em>Carrier Shipment Route Segments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___CARRIER_SHIPMENT_ROUTE_SEGMENTS = PARTY___CARRIER_SHIPMENT_ROUTE_SEGMENTS;

	/**
	 * The operation id for the '<em>Client Timesheets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___CLIENT_TIMESHEETS = PARTY___CLIENT_TIMESHEETS;

	/**
	 * The operation id for the '<em>Committed By Content Revisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___COMMITTED_BY_CONTENT_REVISIONS = PARTY___COMMITTED_BY_CONTENT_REVISIONS;

	/**
	 * The operation id for the '<em>Content Approvals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___CONTENT_APPROVALS = PARTY___CONTENT_APPROVALS;

	/**
	 * The operation id for the '<em>Cost Components</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___COST_COMPONENTS = PARTY___COST_COMPONENTS;

	/**
	 * The operation id for the '<em>Cust Request Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___CUST_REQUEST_TYPES = PARTY___CUST_REQUEST_TYPES;

	/**
	 * The operation id for the '<em>Empl Positions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___EMPL_POSITIONS = PARTY___EMPL_POSITIONS;

	/**
	 * The operation id for the '<em>Fin Account Transs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___FIN_ACCOUNT_TRANSS = PARTY___FIN_ACCOUNT_TRANSS;

	/**
	 * The operation id for the '<em>Fixed Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___FIXED_ASSETS = PARTY___FIXED_ASSETS;

	/**
	 * The operation id for the '<em>From Agreements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___FROM_AGREEMENTS = PARTY___FROM_AGREEMENTS;

	/**
	 * The operation id for the '<em>From Communication Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___FROM_COMMUNICATION_EVENTS = PARTY___FROM_COMMUNICATION_EVENTS;

	/**
	 * The operation id for the '<em>From Cust Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___FROM_CUST_REQUESTS = PARTY___FROM_CUST_REQUESTS;

	/**
	 * The operation id for the '<em>From Invoices</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___FROM_INVOICES = PARTY___FROM_INVOICES;

	/**
	 * The operation id for the '<em>From Payments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___FROM_PAYMENTS = PARTY___FROM_PAYMENTS;

	/**
	 * The operation id for the '<em>From Shipments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___FROM_SHIPMENTS = PARTY___FROM_SHIPMENTS;

	/**
	 * The operation id for the '<em>Gift Card Fulfillments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___GIFT_CARD_FULFILLMENTS = PARTY___GIFT_CARD_FULFILLMENTS;

	/**
	 * The operation id for the '<em>Gl Account Organizations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___GL_ACCOUNT_ORGANIZATIONS = PARTY___GL_ACCOUNT_ORGANIZATIONS;

	/**
	 * The operation id for the '<em>Gl Journals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___GL_JOURNALS = PARTY___GL_JOURNALS;

	/**
	 * The operation id for the '<em>Gl Reconciliations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___GL_RECONCILIATIONS = PARTY___GL_RECONCILIATIONS;

	/**
	 * The operation id for the '<em>Gov Agency Fixed Asset Registrations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___GOV_AGENCY_FIXED_ASSET_REGISTRATIONS = PARTY___GOV_AGENCY_FIXED_ASSET_REGISTRATIONS;

	/**
	 * The operation id for the '<em>Internal Sales Forecast Histories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___INTERNAL_SALES_FORECAST_HISTORIES = PARTY___INTERNAL_SALES_FORECAST_HISTORIES;

	/**
	 * The operation id for the '<em>Internal Sales Forecasts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___INTERNAL_SALES_FORECASTS = PARTY___INTERNAL_SALES_FORECASTS;

	/**
	 * The operation id for the '<em>Interviewee Job Interviews</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___INTERVIEWEE_JOB_INTERVIEWS = PARTY___INTERVIEWEE_JOB_INTERVIEWS;

	/**
	 * The operation id for the '<em>Interviewer Job Interviews</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___INTERVIEWER_JOB_INTERVIEWS = PARTY___INTERVIEWER_JOB_INTERVIEWS;

	/**
	 * The operation id for the '<em>Inventory Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___INVENTORY_ITEMS = PARTY___INVENTORY_ITEMS;

	/**
	 * The operation id for the '<em>Invoices</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___INVOICES = PARTY___INVOICES;

	/**
	 * The operation id for the '<em>Note Note Datas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___NOTE_NOTE_DATAS = PARTY___NOTE_NOTE_DATAS;

	/**
	 * The operation id for the '<em>Organization Custom Time Periods</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___ORGANIZATION_CUSTOM_TIME_PERIODS = PARTY___ORGANIZATION_CUSTOM_TIME_PERIODS;

	/**
	 * The operation id for the '<em>Organization Fin Account Type Gl Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___ORGANIZATION_FIN_ACCOUNT_TYPE_GL_ACCOUNTS = PARTY___ORGANIZATION_FIN_ACCOUNT_TYPE_GL_ACCOUNTS;

	/**
	 * The operation id for the '<em>Organization Fin Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___ORGANIZATION_FIN_ACCOUNTS = PARTY___ORGANIZATION_FIN_ACCOUNTS;

	/**
	 * The operation id for the '<em>Organization Gl Account Type Defaults</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___ORGANIZATION_GL_ACCOUNT_TYPE_DEFAULTS = PARTY___ORGANIZATION_GL_ACCOUNT_TYPE_DEFAULTS;

	/**
	 * The operation id for the '<em>Organization Invoice Item Type Gl Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___ORGANIZATION_INVOICE_ITEM_TYPE_GL_ACCOUNTS = PARTY___ORGANIZATION_INVOICE_ITEM_TYPE_GL_ACCOUNTS;

	/**
	 * The operation id for the '<em>Organization Payment Method Type Gl Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___ORGANIZATION_PAYMENT_METHOD_TYPE_GL_ACCOUNTS = PARTY___ORGANIZATION_PAYMENT_METHOD_TYPE_GL_ACCOUNTS;

	/**
	 * The operation id for the '<em>Organization Sales Forecast Histories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___ORGANIZATION_SALES_FORECAST_HISTORIES = PARTY___ORGANIZATION_SALES_FORECAST_HISTORIES;

	/**
	 * The operation id for the '<em>Organization Sales Forecasts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___ORGANIZATION_SALES_FORECASTS = PARTY___ORGANIZATION_SALES_FORECASTS;

	/**
	 * The operation id for the '<em>Organization Variance Reason Gl Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___ORGANIZATION_VARIANCE_REASON_GL_ACCOUNTS = PARTY___ORGANIZATION_VARIANCE_REASON_GL_ACCOUNTS;

	/**
	 * The operation id for the '<em>Originated From Subscriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___ORIGINATED_FROM_SUBSCRIPTIONS = PARTY___ORIGINATED_FROM_SUBSCRIPTIONS;

	/**
	 * The operation id for the '<em>Override Org Invoice Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___OVERRIDE_ORG_INVOICE_ITEMS = PARTY___OVERRIDE_ORG_INVOICE_ITEMS;

	/**
	 * The operation id for the '<em>Owner Contact Lists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___OWNER_CONTACT_LISTS = PARTY___OWNER_CONTACT_LISTS;

	/**
	 * The operation id for the '<em>Owner Facilities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___OWNER_FACILITIES = PARTY___OWNER_FACILITIES;

	/**
	 * The operation id for the '<em>Owner Fin Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___OWNER_FIN_ACCOUNTS = PARTY___OWNER_FIN_ACCOUNTS;

	/**
	 * The operation id for the '<em>Owner Inventory Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___OWNER_INVENTORY_ITEMS = PARTY___OWNER_INVENTORY_ITEMS;

	/**
	 * The operation id for the '<em>Party Invitations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___PARTY_INVITATIONS = PARTY___PARTY_INVITATIONS;

	/**
	 * The operation id for the '<em>Party Pref Doc Type Tpls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___PARTY_PREF_DOC_TYPE_TPLS = PARTY___PARTY_PREF_DOC_TYPE_TPLS;

	/**
	 * The operation id for the '<em>Party Resumes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___PARTY_RESUMES = PARTY___PARTY_RESUMES;

	/**
	 * The operation id for the '<em>Payment Gl Account Type Maps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___PAYMENT_GL_ACCOUNT_TYPE_MAPS = PARTY___PAYMENT_GL_ACCOUNT_TYPE_MAPS;

	/**
	 * The operation id for the '<em>Payment Methods</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___PAYMENT_METHODS = PARTY___PAYMENT_METHODS;

	/**
	 * The operation id for the '<em>Performed By Fin Account Transs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___PERFORMED_BY_FIN_ACCOUNT_TRANSS = PARTY___PERFORMED_BY_FIN_ACCOUNT_TRANSS;

	/**
	 * The operation id for the '<em>Product Promo Code Parties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___PRODUCT_PROMO_CODE_PARTIES = PARTY___PRODUCT_PROMO_CODE_PARTIES;

	/**
	 * The operation id for the '<em>Product Promo Uses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___PRODUCT_PROMO_USES = PARTY___PRODUCT_PROMO_USES;

	/**
	 * The operation id for the '<em>Product Promos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___PRODUCT_PROMOS = PARTY___PRODUCT_PROMOS;

	/**
	 * The operation id for the '<em>Product Store Shipment Meths</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___PRODUCT_STORE_SHIPMENT_METHS = PARTY___PRODUCT_STORE_SHIPMENT_METHS;

	/**
	 * The operation id for the '<em>Product Stores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___PRODUCT_STORES = PARTY___PRODUCT_STORES;

	/**
	 * The operation id for the '<em>Quotes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___QUOTES = PARTY___QUOTES;

	/**
	 * The operation id for the '<em>Referred By Employment Apps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___REFERRED_BY_EMPLOYMENT_APPS = PARTY___REFERRED_BY_EMPLOYMENT_APPS;

	/**
	 * The operation id for the '<em>Reorder Guidelines</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___REORDER_GUIDELINES = PARTY___REORDER_GUIDELINES;

	/**
	 * The operation id for the '<em>Return Headers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___RETURN_HEADERS = PARTY___RETURN_HEADERS;

	/**
	 * The operation id for the '<em>Shipment Cost Estimates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___SHIPMENT_COST_ESTIMATES = PARTY___SHIPMENT_COST_ESTIMATES;

	/**
	 * The operation id for the '<em>Shopping Lists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___SHOPPING_LISTS = PARTY___SHOPPING_LISTS;

	/**
	 * The operation id for the '<em>Subscriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___SUBSCRIPTIONS = PARTY___SUBSCRIPTIONS;

	/**
	 * The operation id for the '<em>Supplier Order Item Ship Groups</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___SUPPLIER_ORDER_ITEM_SHIP_GROUPS = PARTY___SUPPLIER_ORDER_ITEM_SHIP_GROUPS;

	/**
	 * The operation id for the '<em>Survey Responses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___SURVEY_RESPONSES = PARTY___SURVEY_RESPONSES;

	/**
	 * The operation id for the '<em>Tax Auth Tax Authorities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___TAX_AUTH_TAX_AUTHORITIES = PARTY___TAX_AUTH_TAX_AUTHORITIES;

	/**
	 * The operation id for the '<em>Tax Authority Invoice Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___TAX_AUTHORITY_INVOICE_ITEMS = PARTY___TAX_AUTHORITY_INVOICE_ITEMS;

	/**
	 * The operation id for the '<em>Time Entries</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___TIME_ENTRIES = PARTY___TIME_ENTRIES;

	/**
	 * The operation id for the '<em>Timesheets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___TIMESHEETS = PARTY___TIMESHEETS;

	/**
	 * The operation id for the '<em>To Agreements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___TO_AGREEMENTS = PARTY___TO_AGREEMENTS;

	/**
	 * The operation id for the '<em>To Communication Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___TO_COMMUNICATION_EVENTS = PARTY___TO_COMMUNICATION_EVENTS;

	/**
	 * The operation id for the '<em>To Party Invitation Group Assocs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___TO_PARTY_INVITATION_GROUP_ASSOCS = PARTY___TO_PARTY_INVITATION_GROUP_ASSOCS;

	/**
	 * The operation id for the '<em>To Payments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___TO_PAYMENTS = PARTY___TO_PAYMENTS;

	/**
	 * The operation id for the '<em>To Return Headers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___TO_RETURN_HEADERS = PARTY___TO_RETURN_HEADERS;

	/**
	 * The operation id for the '<em>To Shipments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___TO_SHIPMENTS = PARTY___TO_SHIPMENTS;

	/**
	 * The operation id for the '<em>User Login Histories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___USER_LOGIN_HISTORIES = PARTY___USER_LOGIN_HISTORIES;

	/**
	 * The operation id for the '<em>User Logins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___USER_LOGINS = PARTY___USER_LOGINS;

	/**
	 * The operation id for the '<em>Vendor Order Item Ship Groups</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___VENDOR_ORDER_ITEM_SHIP_GROUPS = PARTY___VENDOR_ORDER_ITEM_SHIP_GROUPS;

	/**
	 * The operation id for the '<em>Work Effort Event Reminders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP___WORK_EFFORT_EVENT_REMINDERS = PARTY___WORK_EFFORT_EVENT_REMINDERS;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GROUP_OPERATION_COUNT = PARTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyIcsAvsOverrideImpl <em>Ics Avs Override</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyIcsAvsOverrideImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyIcsAvsOverride()
	 * @generated
	 */
	int PARTY_ICS_AVS_OVERRIDE = 13;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ICS_AVS_OVERRIDE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ICS_AVS_OVERRIDE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ICS_AVS_OVERRIDE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ICS_AVS_OVERRIDE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Avs Decline String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ICS_AVS_OVERRIDE__AVS_DECLINE_STRING = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ICS_AVS_OVERRIDE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ics Avs Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ICS_AVS_OVERRIDE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ICS_AVS_OVERRIDE___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ICS_AVS_OVERRIDE___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ICS_AVS_OVERRIDE___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ICS_AVS_OVERRIDE___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The number of operations of the '<em>Ics Avs Override</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ICS_AVS_OVERRIDE_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyIdentificationImpl <em>Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyIdentificationImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyIdentification()
	 * @generated
	 */
	int PARTY_IDENTIFICATION = 14;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Id Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION__ID_VALUE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Identification Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION__PARTY_IDENTIFICATION_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION__PARTY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION___ISA = BizPackage.BIZ_ENTITY_TYPED___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION___GET_NAME = BizPackage.BIZ_ENTITY_TYPED___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION___GET_URI = BizPackage.BIZ_ENTITY_TYPED___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION___IS_PROXY = BizPackage.BIZ_ENTITY_TYPED___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION___GET_TYPE = BizPackage.BIZ_ENTITY_TYPED___GET_TYPE;

	/**
	 * The number of operations of the '<em>Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_OPERATION_COUNT = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyIdentificationTypeImpl <em>Identification Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyIdentificationTypeImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyIdentificationType()
	 * @generated
	 */
	int PARTY_IDENTIFICATION_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Party Identification Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE__PARTY_IDENTIFICATION_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Identification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE___ISA = BizPackage.BIZ_ENTITY_TYPE___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE___GET_NAME = BizPackage.BIZ_ENTITY_TYPE___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE___GET_URI = BizPackage.BIZ_ENTITY_TYPE___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE___IS_PROXY = BizPackage.BIZ_ENTITY_TYPE___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Frame</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE___GET_FRAME = BizPackage.BIZ_ENTITY_TYPE___GET_FRAME;

	/**
	 * The operation id for the '<em>Get Type Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE___GET_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE___GET_TYPE_ID;

	/**
	 * The operation id for the '<em>Has Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE___HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE___HAS_TABLE;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE___GET_TEXT = BizPackage.BIZ_ENTITY_TYPE___GET_TEXT;

	/**
	 * The operation id for the '<em>Child Party Identification Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE___CHILD_PARTY_IDENTIFICATION_TYPES = BizPackage.BIZ_ENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Party Identifications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE___PARTY_IDENTIFICATIONS = BizPackage.BIZ_ENTITY_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Identification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_IDENTIFICATION_TYPE_OPERATION_COUNT = BizPackage.BIZ_ENTITY_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationImpl <em>Invitation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyInvitationImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyInvitation()
	 * @generated
	 */
	int PARTY_INVITATION = 16;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Party Invitation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__PARTY_INVITATION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__EMAIL_ADDRESS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Invite Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__LAST_INVITE_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>To Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__TO_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__PARTY_ID_FROM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Party Invitation Group Assocs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__PARTY_INVITATION_GROUP_ASSOCS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Party Invitation Role Assocs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION__PARTY_INVITATION_ROLE_ASSOCS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Invitation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The number of operations of the '<em>Invitation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationGroupAssocImpl <em>Invitation Group Assoc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyInvitationGroupAssocImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyInvitationGroupAssoc()
	 * @generated
	 */
	int PARTY_INVITATION_GROUP_ASSOC = 17;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_GROUP_ASSOC__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_GROUP_ASSOC__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_GROUP_ASSOC__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_GROUP_ASSOC__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Party Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_GROUP_ASSOC__PARTY_ID_TO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Invitation Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_GROUP_ASSOC__PARTY_INVITATION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Invitation Group Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_GROUP_ASSOC_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_GROUP_ASSOC___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_GROUP_ASSOC___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_GROUP_ASSOC___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_GROUP_ASSOC___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The number of operations of the '<em>Invitation Group Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_GROUP_ASSOC_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationRoleAssocImpl <em>Invitation Role Assoc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyInvitationRoleAssocImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyInvitationRoleAssoc()
	 * @generated
	 */
	int PARTY_INVITATION_ROLE_ASSOC = 18;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_ROLE_ASSOC__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_ROLE_ASSOC__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_ROLE_ASSOC__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_ROLE_ASSOC__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_ROLE_ASSOC__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Invitation Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_ROLE_ASSOC__PARTY_INVITATION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Invitation Role Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_ROLE_ASSOC_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_ROLE_ASSOC___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_ROLE_ASSOC___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_ROLE_ASSOC___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_ROLE_ASSOC___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The number of operations of the '<em>Invitation Role Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_INVITATION_ROLE_ASSOC_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyNameHistoryImpl <em>Name History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyNameHistoryImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyNameHistory()
	 * @generated
	 */
	int PARTY_NAME_HISTORY = 19;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY__CHANGE_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY__FIRST_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY__GROUP_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY__LAST_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY__MIDDLE_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Personal Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY__PERSONAL_TITLE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY__SUFFIX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Name History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The number of operations of the '<em>Name History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NAME_HISTORY_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyNoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyNoteImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyNote()
	 * @generated
	 */
	int PARTY_NOTE = 20;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NOTE__CREATED_STAMP = BizPackage.BIZ_ENTITY_NOTE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NOTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_NOTE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NOTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_NOTE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NOTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_NOTE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Note Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NOTE__NOTE_ID = BizPackage.BIZ_ENTITY_NOTE__NOTE_ID;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NOTE__NOTE = BizPackage.BIZ_ENTITY_NOTE__NOTE;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NOTE__PARTY_ID = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NOTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NOTE___ISA = BizPackage.BIZ_ENTITY_NOTE___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NOTE___GET_NAME = BizPackage.BIZ_ENTITY_NOTE___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NOTE___GET_URI = BizPackage.BIZ_ENTITY_NOTE___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NOTE___IS_PROXY = BizPackage.BIZ_ENTITY_NOTE___IS_PROXY;

	/**
	 * The number of operations of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_NOTE_OPERATION_COUNT = BizPackage.BIZ_ENTITY_NOTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyProfileDefaultImpl <em>Profile Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyProfileDefaultImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyProfileDefault()
	 * @generated
	 */
	int PARTY_PROFILE_DEFAULT = 21;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Default Bill Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT__DEFAULT_BILL_ADDR = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Pay Meth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT__DEFAULT_PAY_METH = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Ship Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_ADDR = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Ship Meth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_METH = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Profile Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The number of operations of the '<em>Profile Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PROFILE_DEFAULT_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyRelationship()
	 * @generated
	 */
	int PARTY_RELATIONSHIP = 22;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__FROM_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__COMMENTS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Permissions Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__PERMISSIONS_ENUM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Position Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__POSITION_TITLE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__RELATIONSHIP_NAME = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__THRU_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Party Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__PARTY_ID_FROM = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Party Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__PARTY_ID_TO = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Role Type Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__ROLE_TYPE_ID_FROM = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Role Type Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__ROLE_TYPE_ID_TO = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__STATUS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Priority Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__PRIORITY_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Party Relationship Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__PARTY_RELATIONSHIP_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Security Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP__SECURITY_GROUP_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP___ISA = BizPackage.BIZ_ENTITY_TYPED___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP___GET_NAME = BizPackage.BIZ_ENTITY_TYPED___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP___GET_URI = BizPackage.BIZ_ENTITY_TYPED___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP___IS_PROXY = BizPackage.BIZ_ENTITY_TYPED___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP___GET_TYPE = BizPackage.BIZ_ENTITY_TYPED___GET_TYPE;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_OPERATION_COUNT = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipTypeImpl <em>Relationship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyRelationshipTypeImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyRelationshipType()
	 * @generated
	 */
	int PARTY_RELATIONSHIP_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Party Relationship Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Party Relationship Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_NAME = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Role Type Id Valid From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_FROM = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Role Type Id Valid To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_TO = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE___ISA = BizPackage.BIZ_ENTITY_TYPE___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE___GET_NAME = BizPackage.BIZ_ENTITY_TYPE___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE___GET_URI = BizPackage.BIZ_ENTITY_TYPE___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE___IS_PROXY = BizPackage.BIZ_ENTITY_TYPE___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Frame</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE___GET_FRAME = BizPackage.BIZ_ENTITY_TYPE___GET_FRAME;

	/**
	 * The operation id for the '<em>Get Type Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE___GET_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE___GET_TYPE_ID;

	/**
	 * The operation id for the '<em>Has Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE___HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE___HAS_TABLE;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE___GET_TEXT = BizPackage.BIZ_ENTITY_TYPE___GET_TEXT;

	/**
	 * The operation id for the '<em>Child Party Relationship Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE___CHILD_PARTY_RELATIONSHIP_TYPES = BizPackage.BIZ_ENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_RELATIONSHIP_TYPE_OPERATION_COUNT = BizPackage.BIZ_ENTITY_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyRoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyRoleImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyRole()
	 * @generated
	 */
	int PARTY_ROLE = 24;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ROLE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ROLE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ROLE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ROLE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ROLE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ROLE__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ROLE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ROLE___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ROLE___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ROLE___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ROLE___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ROLE_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyStatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyStatusImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyStatus()
	 * @generated
	 */
	int PARTY_STATUS = 25;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_STATUS__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_STATUS__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_STATUS__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_STATUS__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_STATUS__STATUS_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_STATUS__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_STATUS__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Change By User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_STATUS__CHANGE_BY_USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_STATUS_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_STATUS___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_STATUS___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_STATUS___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_STATUS___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The number of operations of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_STATUS_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyTypeImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyType()
	 * @generated
	 */
	int PARTY_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Party Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE__PARTY_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Type Attrs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE__PARTY_TYPE_ATTRS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE___ISA = BizPackage.BIZ_ENTITY_TYPE___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE___GET_NAME = BizPackage.BIZ_ENTITY_TYPE___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE___GET_URI = BizPackage.BIZ_ENTITY_TYPE___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE___IS_PROXY = BizPackage.BIZ_ENTITY_TYPE___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Frame</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE___GET_FRAME = BizPackage.BIZ_ENTITY_TYPE___GET_FRAME;

	/**
	 * The operation id for the '<em>Get Type Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE___GET_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE___GET_TYPE_ID;

	/**
	 * The operation id for the '<em>Has Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE___HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE___HAS_TABLE;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE___GET_TEXT = BizPackage.BIZ_ENTITY_TYPE___GET_TEXT;

	/**
	 * The operation id for the '<em>Child Party Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE___CHILD_PARTY_TYPES = BizPackage.BIZ_ENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Parties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE___PARTIES = BizPackage.BIZ_ENTITY_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE_OPERATION_COUNT = BizPackage.BIZ_ENTITY_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PartyTypeAttrImpl <em>Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PartyTypeAttrImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyTypeAttr()
	 * @generated
	 */
	int PARTY_TYPE_ATTR = 27;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE_ATTR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE_ATTR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE_ATTR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE_ATTR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE_ATTR__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE_ATTR__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Party Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE_ATTR__PARTY_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE_ATTR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE_ATTR___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE_ATTR___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE_ATTR___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE_ATTR___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The number of operations of the '<em>Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_TYPE_ATTR_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PersonImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 28;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CREATED_STAMP = PARTY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CREATED_TX_STAMP = PARTY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_UPDATED_STAMP = PARTY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_UPDATED_TX_STAMP = PARTY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTY_ID = PARTY__PARTY_ID;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CREATED_DATE = PARTY__CREATED_DATE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DESCRIPTION = PARTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EXTERNAL_ID = PARTY__EXTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Is Unread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IS_UNREAD = PARTY__IS_UNREAD;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_MODIFIED_DATE = PARTY__LAST_MODIFIED_DATE;

	/**
	 * The feature id for the '<em><b>Party Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTY_TYPE_ID = PARTY__PARTY_TYPE_ID;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CREATED_BY_USER_LOGIN = PARTY__CREATED_BY_USER_LOGIN;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_MODIFIED_BY_USER_LOGIN = PARTY__LAST_MODIFIED_BY_USER_LOGIN;

	/**
	 * The feature id for the '<em><b>Preferred Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PREFERRED_CURRENCY_UOM_ID = PARTY__PREFERRED_CURRENCY_UOM_ID;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__STATUS_ID = PARTY__STATUS_ID;

	/**
	 * The feature id for the '<em><b>Data Source Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DATA_SOURCE_ID = PARTY__DATA_SOURCE_ID;

	/**
	 * The feature id for the '<em><b>Party Attributes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTY_ATTRIBUTES = PARTY__PARTY_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Party Identifications</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTY_IDENTIFICATIONS = PARTY__PARTY_IDENTIFICATIONS;

	/**
	 * The feature id for the '<em><b>Party Name Histories</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTY_NAME_HISTORIES = PARTY__PARTY_NAME_HISTORIES;

	/**
	 * The feature id for the '<em><b>Party Notes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTY_NOTES = PARTY__PARTY_NOTES;

	/**
	 * The feature id for the '<em><b>Party Profile Defaults</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTY_PROFILE_DEFAULTS = PARTY__PARTY_PROFILE_DEFAULTS;

	/**
	 * The feature id for the '<em><b>Party Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTY_ROLES = PARTY__PARTY_ROLES;

	/**
	 * The feature id for the '<em><b>Party Skills</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTY_SKILLS = PARTY__PARTY_SKILLS;

	/**
	 * The feature id for the '<em><b>Supplier Product Features</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SUPPLIER_PRODUCT_FEATURES = PARTY__SUPPLIER_PRODUCT_FEATURES;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BIRTH_DATE = PARTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Card Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CARD_ID = PARTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__COMMENTS = PARTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Deceased Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DECEASED_DATE = PARTY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Existing Customer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EXISTING_CUSTOMER = PARTY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME = PARTY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>First Name Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME_LOCAL = PARTY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GENDER = PARTY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__HEIGHT = PARTY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_NAME = PARTY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Last Name Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_NAME_LOCAL = PARTY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Marital Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MARITAL_STATUS = PARTY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Member Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MEMBER_ID = PARTY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MIDDLE_NAME = PARTY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Middle Name Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MIDDLE_NAME_LOCAL = PARTY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Months With Employer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MONTHS_WITH_EMPLOYER = PARTY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Mothers Maiden Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MOTHERS_MAIDEN_NAME = PARTY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NICKNAME = PARTY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Occupation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__OCCUPATION = PARTY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Other Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__OTHER_LOCAL = PARTY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Passport Expire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PASSPORT_EXPIRE_DATE = PARTY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Passport Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PASSPORT_NUMBER = PARTY_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Personal Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PERSONAL_TITLE = PARTY_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Salutation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SALUTATION = PARTY_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Social Security Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SOCIAL_SECURITY_NUMBER = PARTY_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SUFFIX = PARTY_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Total Years Work Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TOTAL_YEARS_WORK_EXPERIENCE = PARTY_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__WEIGHT = PARTY_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Years With Employer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__YEARS_WITH_EMPLOYER = PARTY_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Employment Status Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMPLOYMENT_STATUS_ENUM_ID = PARTY_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Residence Status Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__RESIDENCE_STATUS_ENUM_ID = PARTY_FEATURE_COUNT + 30;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = PARTY_FEATURE_COUNT + 31;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ISA = PARTY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_NAME = PARTY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_URI = PARTY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___IS_PROXY = PARTY___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_TYPE = PARTY___GET_TYPE;

	/**
	 * The operation id for the '<em>Acctg Trans Entries</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ACCTG_TRANS_ENTRIES = PARTY___ACCTG_TRANS_ENTRIES;

	/**
	 * The operation id for the '<em>Acctg Transs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ACCTG_TRANSS = PARTY___ACCTG_TRANSS;

	/**
	 * The operation id for the '<em>Applying Employment Apps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___APPLYING_EMPLOYMENT_APPS = PARTY___APPLYING_EMPLOYMENT_APPS;

	/**
	 * The operation id for the '<em>Approver Employment Apps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___APPROVER_EMPLOYMENT_APPS = PARTY___APPROVER_EMPLOYMENT_APPS;

	/**
	 * The operation id for the '<em>Carrier Order Item Ship Groups</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___CARRIER_ORDER_ITEM_SHIP_GROUPS = PARTY___CARRIER_ORDER_ITEM_SHIP_GROUPS;

	/**
	 * The operation id for the '<em>Carrier Shipment Box Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___CARRIER_SHIPMENT_BOX_TYPES = PARTY___CARRIER_SHIPMENT_BOX_TYPES;

	/**
	 * The operation id for the '<em>Carrier Shipment Route Segments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___CARRIER_SHIPMENT_ROUTE_SEGMENTS = PARTY___CARRIER_SHIPMENT_ROUTE_SEGMENTS;

	/**
	 * The operation id for the '<em>Client Timesheets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___CLIENT_TIMESHEETS = PARTY___CLIENT_TIMESHEETS;

	/**
	 * The operation id for the '<em>Committed By Content Revisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___COMMITTED_BY_CONTENT_REVISIONS = PARTY___COMMITTED_BY_CONTENT_REVISIONS;

	/**
	 * The operation id for the '<em>Content Approvals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___CONTENT_APPROVALS = PARTY___CONTENT_APPROVALS;

	/**
	 * The operation id for the '<em>Cost Components</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___COST_COMPONENTS = PARTY___COST_COMPONENTS;

	/**
	 * The operation id for the '<em>Cust Request Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___CUST_REQUEST_TYPES = PARTY___CUST_REQUEST_TYPES;

	/**
	 * The operation id for the '<em>Empl Positions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___EMPL_POSITIONS = PARTY___EMPL_POSITIONS;

	/**
	 * The operation id for the '<em>Fin Account Transs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___FIN_ACCOUNT_TRANSS = PARTY___FIN_ACCOUNT_TRANSS;

	/**
	 * The operation id for the '<em>Fixed Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___FIXED_ASSETS = PARTY___FIXED_ASSETS;

	/**
	 * The operation id for the '<em>From Agreements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___FROM_AGREEMENTS = PARTY___FROM_AGREEMENTS;

	/**
	 * The operation id for the '<em>From Communication Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___FROM_COMMUNICATION_EVENTS = PARTY___FROM_COMMUNICATION_EVENTS;

	/**
	 * The operation id for the '<em>From Cust Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___FROM_CUST_REQUESTS = PARTY___FROM_CUST_REQUESTS;

	/**
	 * The operation id for the '<em>From Invoices</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___FROM_INVOICES = PARTY___FROM_INVOICES;

	/**
	 * The operation id for the '<em>From Payments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___FROM_PAYMENTS = PARTY___FROM_PAYMENTS;

	/**
	 * The operation id for the '<em>From Shipments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___FROM_SHIPMENTS = PARTY___FROM_SHIPMENTS;

	/**
	 * The operation id for the '<em>Gift Card Fulfillments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GIFT_CARD_FULFILLMENTS = PARTY___GIFT_CARD_FULFILLMENTS;

	/**
	 * The operation id for the '<em>Gl Account Organizations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GL_ACCOUNT_ORGANIZATIONS = PARTY___GL_ACCOUNT_ORGANIZATIONS;

	/**
	 * The operation id for the '<em>Gl Journals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GL_JOURNALS = PARTY___GL_JOURNALS;

	/**
	 * The operation id for the '<em>Gl Reconciliations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GL_RECONCILIATIONS = PARTY___GL_RECONCILIATIONS;

	/**
	 * The operation id for the '<em>Gov Agency Fixed Asset Registrations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GOV_AGENCY_FIXED_ASSET_REGISTRATIONS = PARTY___GOV_AGENCY_FIXED_ASSET_REGISTRATIONS;

	/**
	 * The operation id for the '<em>Internal Sales Forecast Histories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___INTERNAL_SALES_FORECAST_HISTORIES = PARTY___INTERNAL_SALES_FORECAST_HISTORIES;

	/**
	 * The operation id for the '<em>Internal Sales Forecasts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___INTERNAL_SALES_FORECASTS = PARTY___INTERNAL_SALES_FORECASTS;

	/**
	 * The operation id for the '<em>Interviewee Job Interviews</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___INTERVIEWEE_JOB_INTERVIEWS = PARTY___INTERVIEWEE_JOB_INTERVIEWS;

	/**
	 * The operation id for the '<em>Interviewer Job Interviews</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___INTERVIEWER_JOB_INTERVIEWS = PARTY___INTERVIEWER_JOB_INTERVIEWS;

	/**
	 * The operation id for the '<em>Inventory Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___INVENTORY_ITEMS = PARTY___INVENTORY_ITEMS;

	/**
	 * The operation id for the '<em>Invoices</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___INVOICES = PARTY___INVOICES;

	/**
	 * The operation id for the '<em>Note Note Datas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___NOTE_NOTE_DATAS = PARTY___NOTE_NOTE_DATAS;

	/**
	 * The operation id for the '<em>Organization Custom Time Periods</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ORGANIZATION_CUSTOM_TIME_PERIODS = PARTY___ORGANIZATION_CUSTOM_TIME_PERIODS;

	/**
	 * The operation id for the '<em>Organization Fin Account Type Gl Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ORGANIZATION_FIN_ACCOUNT_TYPE_GL_ACCOUNTS = PARTY___ORGANIZATION_FIN_ACCOUNT_TYPE_GL_ACCOUNTS;

	/**
	 * The operation id for the '<em>Organization Fin Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ORGANIZATION_FIN_ACCOUNTS = PARTY___ORGANIZATION_FIN_ACCOUNTS;

	/**
	 * The operation id for the '<em>Organization Gl Account Type Defaults</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ORGANIZATION_GL_ACCOUNT_TYPE_DEFAULTS = PARTY___ORGANIZATION_GL_ACCOUNT_TYPE_DEFAULTS;

	/**
	 * The operation id for the '<em>Organization Invoice Item Type Gl Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ORGANIZATION_INVOICE_ITEM_TYPE_GL_ACCOUNTS = PARTY___ORGANIZATION_INVOICE_ITEM_TYPE_GL_ACCOUNTS;

	/**
	 * The operation id for the '<em>Organization Payment Method Type Gl Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ORGANIZATION_PAYMENT_METHOD_TYPE_GL_ACCOUNTS = PARTY___ORGANIZATION_PAYMENT_METHOD_TYPE_GL_ACCOUNTS;

	/**
	 * The operation id for the '<em>Organization Sales Forecast Histories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ORGANIZATION_SALES_FORECAST_HISTORIES = PARTY___ORGANIZATION_SALES_FORECAST_HISTORIES;

	/**
	 * The operation id for the '<em>Organization Sales Forecasts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ORGANIZATION_SALES_FORECASTS = PARTY___ORGANIZATION_SALES_FORECASTS;

	/**
	 * The operation id for the '<em>Organization Variance Reason Gl Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ORGANIZATION_VARIANCE_REASON_GL_ACCOUNTS = PARTY___ORGANIZATION_VARIANCE_REASON_GL_ACCOUNTS;

	/**
	 * The operation id for the '<em>Originated From Subscriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ORIGINATED_FROM_SUBSCRIPTIONS = PARTY___ORIGINATED_FROM_SUBSCRIPTIONS;

	/**
	 * The operation id for the '<em>Override Org Invoice Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___OVERRIDE_ORG_INVOICE_ITEMS = PARTY___OVERRIDE_ORG_INVOICE_ITEMS;

	/**
	 * The operation id for the '<em>Owner Contact Lists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___OWNER_CONTACT_LISTS = PARTY___OWNER_CONTACT_LISTS;

	/**
	 * The operation id for the '<em>Owner Facilities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___OWNER_FACILITIES = PARTY___OWNER_FACILITIES;

	/**
	 * The operation id for the '<em>Owner Fin Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___OWNER_FIN_ACCOUNTS = PARTY___OWNER_FIN_ACCOUNTS;

	/**
	 * The operation id for the '<em>Owner Inventory Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___OWNER_INVENTORY_ITEMS = PARTY___OWNER_INVENTORY_ITEMS;

	/**
	 * The operation id for the '<em>Party Invitations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___PARTY_INVITATIONS = PARTY___PARTY_INVITATIONS;

	/**
	 * The operation id for the '<em>Party Pref Doc Type Tpls</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___PARTY_PREF_DOC_TYPE_TPLS = PARTY___PARTY_PREF_DOC_TYPE_TPLS;

	/**
	 * The operation id for the '<em>Party Resumes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___PARTY_RESUMES = PARTY___PARTY_RESUMES;

	/**
	 * The operation id for the '<em>Payment Gl Account Type Maps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___PAYMENT_GL_ACCOUNT_TYPE_MAPS = PARTY___PAYMENT_GL_ACCOUNT_TYPE_MAPS;

	/**
	 * The operation id for the '<em>Payment Methods</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___PAYMENT_METHODS = PARTY___PAYMENT_METHODS;

	/**
	 * The operation id for the '<em>Performed By Fin Account Transs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___PERFORMED_BY_FIN_ACCOUNT_TRANSS = PARTY___PERFORMED_BY_FIN_ACCOUNT_TRANSS;

	/**
	 * The operation id for the '<em>Product Promo Code Parties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___PRODUCT_PROMO_CODE_PARTIES = PARTY___PRODUCT_PROMO_CODE_PARTIES;

	/**
	 * The operation id for the '<em>Product Promo Uses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___PRODUCT_PROMO_USES = PARTY___PRODUCT_PROMO_USES;

	/**
	 * The operation id for the '<em>Product Promos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___PRODUCT_PROMOS = PARTY___PRODUCT_PROMOS;

	/**
	 * The operation id for the '<em>Product Store Shipment Meths</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___PRODUCT_STORE_SHIPMENT_METHS = PARTY___PRODUCT_STORE_SHIPMENT_METHS;

	/**
	 * The operation id for the '<em>Product Stores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___PRODUCT_STORES = PARTY___PRODUCT_STORES;

	/**
	 * The operation id for the '<em>Quotes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___QUOTES = PARTY___QUOTES;

	/**
	 * The operation id for the '<em>Referred By Employment Apps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___REFERRED_BY_EMPLOYMENT_APPS = PARTY___REFERRED_BY_EMPLOYMENT_APPS;

	/**
	 * The operation id for the '<em>Reorder Guidelines</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___REORDER_GUIDELINES = PARTY___REORDER_GUIDELINES;

	/**
	 * The operation id for the '<em>Return Headers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___RETURN_HEADERS = PARTY___RETURN_HEADERS;

	/**
	 * The operation id for the '<em>Shipment Cost Estimates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___SHIPMENT_COST_ESTIMATES = PARTY___SHIPMENT_COST_ESTIMATES;

	/**
	 * The operation id for the '<em>Shopping Lists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___SHOPPING_LISTS = PARTY___SHOPPING_LISTS;

	/**
	 * The operation id for the '<em>Subscriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___SUBSCRIPTIONS = PARTY___SUBSCRIPTIONS;

	/**
	 * The operation id for the '<em>Supplier Order Item Ship Groups</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___SUPPLIER_ORDER_ITEM_SHIP_GROUPS = PARTY___SUPPLIER_ORDER_ITEM_SHIP_GROUPS;

	/**
	 * The operation id for the '<em>Survey Responses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___SURVEY_RESPONSES = PARTY___SURVEY_RESPONSES;

	/**
	 * The operation id for the '<em>Tax Auth Tax Authorities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___TAX_AUTH_TAX_AUTHORITIES = PARTY___TAX_AUTH_TAX_AUTHORITIES;

	/**
	 * The operation id for the '<em>Tax Authority Invoice Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___TAX_AUTHORITY_INVOICE_ITEMS = PARTY___TAX_AUTHORITY_INVOICE_ITEMS;

	/**
	 * The operation id for the '<em>Time Entries</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___TIME_ENTRIES = PARTY___TIME_ENTRIES;

	/**
	 * The operation id for the '<em>Timesheets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___TIMESHEETS = PARTY___TIMESHEETS;

	/**
	 * The operation id for the '<em>To Agreements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___TO_AGREEMENTS = PARTY___TO_AGREEMENTS;

	/**
	 * The operation id for the '<em>To Communication Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___TO_COMMUNICATION_EVENTS = PARTY___TO_COMMUNICATION_EVENTS;

	/**
	 * The operation id for the '<em>To Party Invitation Group Assocs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___TO_PARTY_INVITATION_GROUP_ASSOCS = PARTY___TO_PARTY_INVITATION_GROUP_ASSOCS;

	/**
	 * The operation id for the '<em>To Payments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___TO_PAYMENTS = PARTY___TO_PAYMENTS;

	/**
	 * The operation id for the '<em>To Return Headers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___TO_RETURN_HEADERS = PARTY___TO_RETURN_HEADERS;

	/**
	 * The operation id for the '<em>To Shipments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___TO_SHIPMENTS = PARTY___TO_SHIPMENTS;

	/**
	 * The operation id for the '<em>User Login Histories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___USER_LOGIN_HISTORIES = PARTY___USER_LOGIN_HISTORIES;

	/**
	 * The operation id for the '<em>User Logins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___USER_LOGINS = PARTY___USER_LOGINS;

	/**
	 * The operation id for the '<em>Vendor Order Item Ship Groups</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___VENDOR_ORDER_ITEM_SHIP_GROUPS = PARTY___VENDOR_ORDER_ITEM_SHIP_GROUPS;

	/**
	 * The operation id for the '<em>Work Effort Event Reminders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___WORK_EFFORT_EVENT_REMINDERS = PARTY___WORK_EFFORT_EVENT_REMINDERS;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = PARTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.PriorityTypeImpl <em>Priority Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.PriorityTypeImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPriorityType()
	 * @generated
	 */
	int PRIORITY_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Priority Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_TYPE__PRIORITY_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Priority Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_TYPE___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_TYPE___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_TYPE___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_TYPE___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The number of operations of the '<em>Priority Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_TYPE_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.RoleTypeImpl <em>Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.RoleTypeImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getRoleType()
	 * @generated
	 */
	int ROLE_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Role Type Attrs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__ROLE_TYPE_ATTRS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Valid Contact Mech Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__VALID_CONTACT_MECH_ROLES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The operation id for the '<em>Acctg Trans Entries</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE___ACCTG_TRANS_ENTRIES = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Acctg Transs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE___ACCTG_TRANSS = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Child Role Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE___CHILD_ROLE_TYPES = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Content Approvals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE___CONTENT_APPROVALS = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Fixed Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE___FIXED_ASSETS = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>From Agreements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE___FROM_AGREEMENTS = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>From Communication Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE___FROM_COMMUNICATION_EVENTS = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Gl Account Organizations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE___GL_ACCOUNT_ORGANIZATIONS = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Invoices</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE___INVOICES = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Originated From Subscriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE___ORIGINATED_FROM_SUBSCRIPTIONS = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Party Invitation Role Assocs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE___PARTY_INVITATION_ROLE_ASSOCS = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Party Roles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE___PARTY_ROLES = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Shipment Cost Estimates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE___SHIPMENT_COST_ESTIMATES = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Subscriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE___SUBSCRIPTIONS = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>To Agreements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE___TO_AGREEMENTS = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>To Communication Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE___TO_COMMUNICATION_EVENTS = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>To Payments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE___TO_PAYMENTS = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Valid From Party Relationship Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE___VALID_FROM_PARTY_RELATIONSHIP_TYPES = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Valid To Party Relationship Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE___VALID_TO_PARTY_RELATIONSHIP_TYPES = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 18;

	/**
	 * The number of operations of the '<em>Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 19;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.RoleTypeAttrImpl <em>Role Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.RoleTypeAttrImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getRoleTypeAttr()
	 * @generated
	 */
	int ROLE_TYPE_ATTR = 31;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATTR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATTR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATTR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATTR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATTR__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATTR__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATTR__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Role Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATTR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATTR___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATTR___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATTR___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATTR___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The number of operations of the '<em>Role Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_ATTR_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.VendorImpl <em>Vendor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.VendorImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getVendor()
	 * @generated
	 */
	int VENDOR = 32;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Manifest Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__MANIFEST_COMPANY_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Manifest Company Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__MANIFEST_COMPANY_TITLE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Manifest Logo Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__MANIFEST_LOGO_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Manifest Policies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__MANIFEST_POLICIES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Vendor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The number of operations of the '<em>Vendor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.party.impl.WebSiteRoleImpl <em>Web Site Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.party.impl.WebSiteRoleImpl
	 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getWebSiteRole()
	 * @generated
	 */
	int WEB_SITE_ROLE = 33;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Web Site Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE__WEB_SITE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Web Site Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;


	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The number of operations of the '<em>Web Site Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_ROLE_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.AddressMatchMap <em>Address Match Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Match Map</em>'.
	 * @see org.abchip.mimo.biz.party.party.AddressMatchMap
	 * @generated
	 */
	EClass getAddressMatchMap();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.AddressMatchMap#getMapKey <em>Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Key</em>'.
	 * @see org.abchip.mimo.biz.party.party.AddressMatchMap#getMapKey()
	 * @see #getAddressMatchMap()
	 * @generated
	 */
	EAttribute getAddressMatchMap_MapKey();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.AddressMatchMap#getMapValue <em>Map Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map Value</em>'.
	 * @see org.abchip.mimo.biz.party.party.AddressMatchMap#getMapValue()
	 * @see #getAddressMatchMap()
	 * @generated
	 */
	EAttribute getAddressMatchMap_MapValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.AddressMatchMap#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.party.party.AddressMatchMap#getSequenceNum()
	 * @see #getAddressMatchMap()
	 * @generated
	 */
	EAttribute getAddressMatchMap_SequenceNum();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.Affiliate <em>Affiliate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affiliate</em>'.
	 * @see org.abchip.mimo.biz.party.party.Affiliate
	 * @generated
	 */
	EClass getAffiliate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.Affiliate#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.Affiliate#getPartyId()
	 * @see #getAffiliate()
	 * @generated
	 */
	EReference getAffiliate_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Affiliate#getAffiliateDescription <em>Affiliate Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Affiliate Description</em>'.
	 * @see org.abchip.mimo.biz.party.party.Affiliate#getAffiliateDescription()
	 * @see #getAffiliate()
	 * @generated
	 */
	EAttribute getAffiliate_AffiliateDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Affiliate#getAffiliateName <em>Affiliate Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Affiliate Name</em>'.
	 * @see org.abchip.mimo.biz.party.party.Affiliate#getAffiliateName()
	 * @see #getAffiliate()
	 * @generated
	 */
	EAttribute getAffiliate_AffiliateName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Affiliate#getDateTimeApproved <em>Date Time Approved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time Approved</em>'.
	 * @see org.abchip.mimo.biz.party.party.Affiliate#getDateTimeApproved()
	 * @see #getAffiliate()
	 * @generated
	 */
	EAttribute getAffiliate_DateTimeApproved();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Affiliate#getDateTimeCreated <em>Date Time Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time Created</em>'.
	 * @see org.abchip.mimo.biz.party.party.Affiliate#getDateTimeCreated()
	 * @see #getAffiliate()
	 * @generated
	 */
	EAttribute getAffiliate_DateTimeCreated();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Affiliate#getSitePageViews <em>Site Page Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Page Views</em>'.
	 * @see org.abchip.mimo.biz.party.party.Affiliate#getSitePageViews()
	 * @see #getAffiliate()
	 * @generated
	 */
	EAttribute getAffiliate_SitePageViews();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Affiliate#getSiteType <em>Site Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Type</em>'.
	 * @see org.abchip.mimo.biz.party.party.Affiliate#getSiteType()
	 * @see #getAffiliate()
	 * @generated
	 */
	EAttribute getAffiliate_SiteType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Affiliate#getSiteVisitors <em>Site Visitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site Visitors</em>'.
	 * @see org.abchip.mimo.biz.party.party.Affiliate#getSiteVisitors()
	 * @see #getAffiliate()
	 * @generated
	 */
	EAttribute getAffiliate_SiteVisitors();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Affiliate#getYearEstablished <em>Year Established</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year Established</em>'.
	 * @see org.abchip.mimo.biz.party.party.Affiliate#getYearEstablished()
	 * @see #getAffiliate()
	 * @generated
	 */
	EAttribute getAffiliate_YearEstablished();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party</em>'.
	 * @see org.abchip.mimo.biz.party.party.Party
	 * @generated
	 */
	EClass getParty();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Party#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.Party#getPartyId()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.Party#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.party.party.Party#getCreatedByUserLogin()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Party#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.party.party.Party#getCreatedDate()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_CreatedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.Party#getDataSourceId <em>Data Source Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Source Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.Party#getDataSourceId()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_DataSourceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Party#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.party.party.Party#getDescription()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Party#getExternalId <em>External Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.Party#getExternalId()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_ExternalId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Party#isIsUnread <em>Is Unread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unread</em>'.
	 * @see org.abchip.mimo.biz.party.party.Party#isIsUnread()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_IsUnread();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.Party#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.party.party.Party#getLastModifiedByUserLogin()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Party#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.party.party.Party#getLastModifiedDate()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_LastModifiedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.Party#getPartyTypeId <em>Party Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.Party#getPartyTypeId()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_PartyTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.Party#getPreferredCurrencyUomId <em>Preferred Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Preferred Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.Party#getPreferredCurrencyUomId()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_PreferredCurrencyUomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.Party#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.Party#getStatusId()
	 * @see #getParty()
	 * @generated
	 */
	EReference getParty_StatusId();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.biz.party.party.Party#getPartyAttributes <em>Party Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Party Attributes</em>'.
	 * @see org.abchip.mimo.biz.party.party.Party#getPartyAttributes()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_PartyAttributes();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.biz.party.party.Party#getPartyIdentifications <em>Party Identifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Party Identifications</em>'.
	 * @see org.abchip.mimo.biz.party.party.Party#getPartyIdentifications()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_PartyIdentifications();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.biz.party.party.Party#getPartyNameHistories <em>Party Name Histories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Party Name Histories</em>'.
	 * @see org.abchip.mimo.biz.party.party.Party#getPartyNameHistories()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_PartyNameHistories();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.biz.party.party.Party#getPartyNotes <em>Party Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Party Notes</em>'.
	 * @see org.abchip.mimo.biz.party.party.Party#getPartyNotes()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_PartyNotes();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.biz.party.party.Party#getPartyProfileDefaults <em>Party Profile Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Party Profile Defaults</em>'.
	 * @see org.abchip.mimo.biz.party.party.Party#getPartyProfileDefaults()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_PartyProfileDefaults();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.biz.party.party.Party#getPartyRoles <em>Party Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Party Roles</em>'.
	 * @see org.abchip.mimo.biz.party.party.Party#getPartyRoles()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_PartyRoles();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.biz.party.party.Party#getPartySkills <em>Party Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Party Skills</em>'.
	 * @see org.abchip.mimo.biz.party.party.Party#getPartySkills()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_PartySkills();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.biz.party.party.Party#getSupplierProductFeatures <em>Supplier Product Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supplier Product Features</em>'.
	 * @see org.abchip.mimo.biz.party.party.Party#getSupplierProductFeatures()
	 * @see #getParty()
	 * @generated
	 */
	EAttribute getParty_SupplierProductFeatures();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#acctgTransEntries() <em>Acctg Trans Entries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Acctg Trans Entries</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#acctgTransEntries()
	 * @generated
	 */
	EOperation getParty__AcctgTransEntries();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#acctgTranss() <em>Acctg Transs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Acctg Transs</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#acctgTranss()
	 * @generated
	 */
	EOperation getParty__AcctgTranss();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#applyingEmploymentApps() <em>Applying Employment Apps</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applying Employment Apps</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#applyingEmploymentApps()
	 * @generated
	 */
	EOperation getParty__ApplyingEmploymentApps();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#approverEmploymentApps() <em>Approver Employment Apps</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Approver Employment Apps</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#approverEmploymentApps()
	 * @generated
	 */
	EOperation getParty__ApproverEmploymentApps();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#carrierOrderItemShipGroups() <em>Carrier Order Item Ship Groups</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Carrier Order Item Ship Groups</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#carrierOrderItemShipGroups()
	 * @generated
	 */
	EOperation getParty__CarrierOrderItemShipGroups();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#carrierShipmentBoxTypes() <em>Carrier Shipment Box Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Carrier Shipment Box Types</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#carrierShipmentBoxTypes()
	 * @generated
	 */
	EOperation getParty__CarrierShipmentBoxTypes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#carrierShipmentRouteSegments() <em>Carrier Shipment Route Segments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Carrier Shipment Route Segments</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#carrierShipmentRouteSegments()
	 * @generated
	 */
	EOperation getParty__CarrierShipmentRouteSegments();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#clientTimesheets() <em>Client Timesheets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Client Timesheets</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#clientTimesheets()
	 * @generated
	 */
	EOperation getParty__ClientTimesheets();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#committedByContentRevisions() <em>Committed By Content Revisions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Committed By Content Revisions</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#committedByContentRevisions()
	 * @generated
	 */
	EOperation getParty__CommittedByContentRevisions();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#contentApprovals() <em>Content Approvals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Content Approvals</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#contentApprovals()
	 * @generated
	 */
	EOperation getParty__ContentApprovals();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#costComponents() <em>Cost Components</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cost Components</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#costComponents()
	 * @generated
	 */
	EOperation getParty__CostComponents();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#custRequestTypes() <em>Cust Request Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cust Request Types</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#custRequestTypes()
	 * @generated
	 */
	EOperation getParty__CustRequestTypes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#emplPositions() <em>Empl Positions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Empl Positions</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#emplPositions()
	 * @generated
	 */
	EOperation getParty__EmplPositions();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#finAccountTranss() <em>Fin Account Transs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fin Account Transs</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#finAccountTranss()
	 * @generated
	 */
	EOperation getParty__FinAccountTranss();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#fixedAssets() <em>Fixed Assets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fixed Assets</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#fixedAssets()
	 * @generated
	 */
	EOperation getParty__FixedAssets();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#fromAgreements() <em>From Agreements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>From Agreements</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#fromAgreements()
	 * @generated
	 */
	EOperation getParty__FromAgreements();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#fromCommunicationEvents() <em>From Communication Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>From Communication Events</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#fromCommunicationEvents()
	 * @generated
	 */
	EOperation getParty__FromCommunicationEvents();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#fromCustRequests() <em>From Cust Requests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>From Cust Requests</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#fromCustRequests()
	 * @generated
	 */
	EOperation getParty__FromCustRequests();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#fromInvoices() <em>From Invoices</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>From Invoices</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#fromInvoices()
	 * @generated
	 */
	EOperation getParty__FromInvoices();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#fromPayments() <em>From Payments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>From Payments</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#fromPayments()
	 * @generated
	 */
	EOperation getParty__FromPayments();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#fromShipments() <em>From Shipments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>From Shipments</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#fromShipments()
	 * @generated
	 */
	EOperation getParty__FromShipments();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#giftCardFulfillments() <em>Gift Card Fulfillments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Gift Card Fulfillments</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#giftCardFulfillments()
	 * @generated
	 */
	EOperation getParty__GiftCardFulfillments();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#glAccountOrganizations() <em>Gl Account Organizations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Gl Account Organizations</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#glAccountOrganizations()
	 * @generated
	 */
	EOperation getParty__GlAccountOrganizations();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#glJournals() <em>Gl Journals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Gl Journals</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#glJournals()
	 * @generated
	 */
	EOperation getParty__GlJournals();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#glReconciliations() <em>Gl Reconciliations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Gl Reconciliations</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#glReconciliations()
	 * @generated
	 */
	EOperation getParty__GlReconciliations();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#govAgencyFixedAssetRegistrations() <em>Gov Agency Fixed Asset Registrations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Gov Agency Fixed Asset Registrations</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#govAgencyFixedAssetRegistrations()
	 * @generated
	 */
	EOperation getParty__GovAgencyFixedAssetRegistrations();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#internalSalesForecastHistories() <em>Internal Sales Forecast Histories</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Internal Sales Forecast Histories</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#internalSalesForecastHistories()
	 * @generated
	 */
	EOperation getParty__InternalSalesForecastHistories();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#internalSalesForecasts() <em>Internal Sales Forecasts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Internal Sales Forecasts</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#internalSalesForecasts()
	 * @generated
	 */
	EOperation getParty__InternalSalesForecasts();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#intervieweeJobInterviews() <em>Interviewee Job Interviews</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Interviewee Job Interviews</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#intervieweeJobInterviews()
	 * @generated
	 */
	EOperation getParty__IntervieweeJobInterviews();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#interviewerJobInterviews() <em>Interviewer Job Interviews</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Interviewer Job Interviews</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#interviewerJobInterviews()
	 * @generated
	 */
	EOperation getParty__InterviewerJobInterviews();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#inventoryItems() <em>Inventory Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inventory Items</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#inventoryItems()
	 * @generated
	 */
	EOperation getParty__InventoryItems();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#invoices() <em>Invoices</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Invoices</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#invoices()
	 * @generated
	 */
	EOperation getParty__Invoices();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#noteNoteDatas() <em>Note Note Datas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Note Note Datas</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#noteNoteDatas()
	 * @generated
	 */
	EOperation getParty__NoteNoteDatas();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#organizationCustomTimePeriods() <em>Organization Custom Time Periods</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Organization Custom Time Periods</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#organizationCustomTimePeriods()
	 * @generated
	 */
	EOperation getParty__OrganizationCustomTimePeriods();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#organizationFinAccountTypeGlAccounts() <em>Organization Fin Account Type Gl Accounts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Organization Fin Account Type Gl Accounts</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#organizationFinAccountTypeGlAccounts()
	 * @generated
	 */
	EOperation getParty__OrganizationFinAccountTypeGlAccounts();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#organizationFinAccounts() <em>Organization Fin Accounts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Organization Fin Accounts</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#organizationFinAccounts()
	 * @generated
	 */
	EOperation getParty__OrganizationFinAccounts();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#organizationGlAccountTypeDefaults() <em>Organization Gl Account Type Defaults</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Organization Gl Account Type Defaults</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#organizationGlAccountTypeDefaults()
	 * @generated
	 */
	EOperation getParty__OrganizationGlAccountTypeDefaults();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#organizationInvoiceItemTypeGlAccounts() <em>Organization Invoice Item Type Gl Accounts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Organization Invoice Item Type Gl Accounts</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#organizationInvoiceItemTypeGlAccounts()
	 * @generated
	 */
	EOperation getParty__OrganizationInvoiceItemTypeGlAccounts();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#organizationPaymentMethodTypeGlAccounts() <em>Organization Payment Method Type Gl Accounts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Organization Payment Method Type Gl Accounts</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#organizationPaymentMethodTypeGlAccounts()
	 * @generated
	 */
	EOperation getParty__OrganizationPaymentMethodTypeGlAccounts();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#organizationSalesForecastHistories() <em>Organization Sales Forecast Histories</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Organization Sales Forecast Histories</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#organizationSalesForecastHistories()
	 * @generated
	 */
	EOperation getParty__OrganizationSalesForecastHistories();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#organizationSalesForecasts() <em>Organization Sales Forecasts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Organization Sales Forecasts</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#organizationSalesForecasts()
	 * @generated
	 */
	EOperation getParty__OrganizationSalesForecasts();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#organizationVarianceReasonGlAccounts() <em>Organization Variance Reason Gl Accounts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Organization Variance Reason Gl Accounts</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#organizationVarianceReasonGlAccounts()
	 * @generated
	 */
	EOperation getParty__OrganizationVarianceReasonGlAccounts();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#originatedFromSubscriptions() <em>Originated From Subscriptions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Originated From Subscriptions</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#originatedFromSubscriptions()
	 * @generated
	 */
	EOperation getParty__OriginatedFromSubscriptions();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#overrideOrgInvoiceItems() <em>Override Org Invoice Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Override Org Invoice Items</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#overrideOrgInvoiceItems()
	 * @generated
	 */
	EOperation getParty__OverrideOrgInvoiceItems();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#ownerContactLists() <em>Owner Contact Lists</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Owner Contact Lists</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#ownerContactLists()
	 * @generated
	 */
	EOperation getParty__OwnerContactLists();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#ownerFacilities() <em>Owner Facilities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Owner Facilities</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#ownerFacilities()
	 * @generated
	 */
	EOperation getParty__OwnerFacilities();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#ownerFinAccounts() <em>Owner Fin Accounts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Owner Fin Accounts</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#ownerFinAccounts()
	 * @generated
	 */
	EOperation getParty__OwnerFinAccounts();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#ownerInventoryItems() <em>Owner Inventory Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Owner Inventory Items</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#ownerInventoryItems()
	 * @generated
	 */
	EOperation getParty__OwnerInventoryItems();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#partyInvitations() <em>Party Invitations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Party Invitations</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#partyInvitations()
	 * @generated
	 */
	EOperation getParty__PartyInvitations();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#partyPrefDocTypeTpls() <em>Party Pref Doc Type Tpls</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Party Pref Doc Type Tpls</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#partyPrefDocTypeTpls()
	 * @generated
	 */
	EOperation getParty__PartyPrefDocTypeTpls();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#partyResumes() <em>Party Resumes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Party Resumes</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#partyResumes()
	 * @generated
	 */
	EOperation getParty__PartyResumes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#paymentGlAccountTypeMaps() <em>Payment Gl Account Type Maps</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Payment Gl Account Type Maps</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#paymentGlAccountTypeMaps()
	 * @generated
	 */
	EOperation getParty__PaymentGlAccountTypeMaps();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#paymentMethods() <em>Payment Methods</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Payment Methods</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#paymentMethods()
	 * @generated
	 */
	EOperation getParty__PaymentMethods();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#performedByFinAccountTranss() <em>Performed By Fin Account Transs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Performed By Fin Account Transs</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#performedByFinAccountTranss()
	 * @generated
	 */
	EOperation getParty__PerformedByFinAccountTranss();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#productPromoCodeParties() <em>Product Promo Code Parties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Product Promo Code Parties</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#productPromoCodeParties()
	 * @generated
	 */
	EOperation getParty__ProductPromoCodeParties();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#productPromoUses() <em>Product Promo Uses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Product Promo Uses</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#productPromoUses()
	 * @generated
	 */
	EOperation getParty__ProductPromoUses();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#productPromos() <em>Product Promos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Product Promos</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#productPromos()
	 * @generated
	 */
	EOperation getParty__ProductPromos();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#productStoreShipmentMeths() <em>Product Store Shipment Meths</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Product Store Shipment Meths</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#productStoreShipmentMeths()
	 * @generated
	 */
	EOperation getParty__ProductStoreShipmentMeths();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#productStores() <em>Product Stores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Product Stores</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#productStores()
	 * @generated
	 */
	EOperation getParty__ProductStores();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#quotes() <em>Quotes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Quotes</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#quotes()
	 * @generated
	 */
	EOperation getParty__Quotes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#referredByEmploymentApps() <em>Referred By Employment Apps</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Referred By Employment Apps</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#referredByEmploymentApps()
	 * @generated
	 */
	EOperation getParty__ReferredByEmploymentApps();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#reorderGuidelines() <em>Reorder Guidelines</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reorder Guidelines</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#reorderGuidelines()
	 * @generated
	 */
	EOperation getParty__ReorderGuidelines();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#returnHeaders() <em>Return Headers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Return Headers</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#returnHeaders()
	 * @generated
	 */
	EOperation getParty__ReturnHeaders();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#shipmentCostEstimates() <em>Shipment Cost Estimates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Shipment Cost Estimates</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#shipmentCostEstimates()
	 * @generated
	 */
	EOperation getParty__ShipmentCostEstimates();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#shoppingLists() <em>Shopping Lists</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Shopping Lists</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#shoppingLists()
	 * @generated
	 */
	EOperation getParty__ShoppingLists();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#subscriptions() <em>Subscriptions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Subscriptions</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#subscriptions()
	 * @generated
	 */
	EOperation getParty__Subscriptions();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#supplierOrderItemShipGroups() <em>Supplier Order Item Ship Groups</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Supplier Order Item Ship Groups</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#supplierOrderItemShipGroups()
	 * @generated
	 */
	EOperation getParty__SupplierOrderItemShipGroups();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#surveyResponses() <em>Survey Responses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Survey Responses</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#surveyResponses()
	 * @generated
	 */
	EOperation getParty__SurveyResponses();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#taxAuthTaxAuthorities() <em>Tax Auth Tax Authorities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tax Auth Tax Authorities</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#taxAuthTaxAuthorities()
	 * @generated
	 */
	EOperation getParty__TaxAuthTaxAuthorities();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#taxAuthorityInvoiceItems() <em>Tax Authority Invoice Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tax Authority Invoice Items</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#taxAuthorityInvoiceItems()
	 * @generated
	 */
	EOperation getParty__TaxAuthorityInvoiceItems();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#timeEntries() <em>Time Entries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Time Entries</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#timeEntries()
	 * @generated
	 */
	EOperation getParty__TimeEntries();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#timesheets() <em>Timesheets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Timesheets</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#timesheets()
	 * @generated
	 */
	EOperation getParty__Timesheets();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#toAgreements() <em>To Agreements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Agreements</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#toAgreements()
	 * @generated
	 */
	EOperation getParty__ToAgreements();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#toCommunicationEvents() <em>To Communication Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Communication Events</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#toCommunicationEvents()
	 * @generated
	 */
	EOperation getParty__ToCommunicationEvents();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#toPartyInvitationGroupAssocs() <em>To Party Invitation Group Assocs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Party Invitation Group Assocs</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#toPartyInvitationGroupAssocs()
	 * @generated
	 */
	EOperation getParty__ToPartyInvitationGroupAssocs();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#toPayments() <em>To Payments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Payments</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#toPayments()
	 * @generated
	 */
	EOperation getParty__ToPayments();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#toReturnHeaders() <em>To Return Headers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Return Headers</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#toReturnHeaders()
	 * @generated
	 */
	EOperation getParty__ToReturnHeaders();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#toShipments() <em>To Shipments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Shipments</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#toShipments()
	 * @generated
	 */
	EOperation getParty__ToShipments();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#userLoginHistories() <em>User Login Histories</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>User Login Histories</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#userLoginHistories()
	 * @generated
	 */
	EOperation getParty__UserLoginHistories();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#userLogins() <em>User Logins</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>User Logins</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#userLogins()
	 * @generated
	 */
	EOperation getParty__UserLogins();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#vendorOrderItemShipGroups() <em>Vendor Order Item Ship Groups</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Vendor Order Item Ship Groups</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#vendorOrderItemShipGroups()
	 * @generated
	 */
	EOperation getParty__VendorOrderItemShipGroups();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.Party#workEffortEventReminders() <em>Work Effort Event Reminders</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Work Effort Event Reminders</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.Party#workEffortEventReminders()
	 * @generated
	 */
	EOperation getParty__WorkEffortEventReminders();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PartyAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyAttribute
	 * @generated
	 */
	EClass getPartyAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyAttribute#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyAttribute#getPartyId()
	 * @see #getPartyAttribute()
	 * @generated
	 */
	EReference getPartyAttribute_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyAttribute#getAttrName()
	 * @see #getPartyAttribute()
	 * @generated
	 */
	EAttribute getPartyAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyAttribute#getAttrDescription()
	 * @see #getPartyAttribute()
	 * @generated
	 */
	EAttribute getPartyAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyAttribute#getAttrValue()
	 * @see #getPartyAttribute()
	 * @generated
	 */
	EAttribute getPartyAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PartyCarrierAccount <em>Carrier Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Account</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyCarrierAccount
	 * @generated
	 */
	EClass getPartyCarrierAccount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyCarrierAccount#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyCarrierAccount#getPartyId()
	 * @see #getPartyCarrierAccount()
	 * @generated
	 */
	EReference getPartyCarrierAccount_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyCarrierAccount#getCarrierPartyId <em>Carrier Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Party Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyCarrierAccount#getCarrierPartyId()
	 * @see #getPartyCarrierAccount()
	 * @generated
	 */
	EReference getPartyCarrierAccount_CarrierPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyCarrierAccount#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyCarrierAccount#getFromDate()
	 * @see #getPartyCarrierAccount()
	 * @generated
	 */
	EAttribute getPartyCarrierAccount_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyCarrierAccount#getAccountNumber <em>Account Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Number</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyCarrierAccount#getAccountNumber()
	 * @see #getPartyCarrierAccount()
	 * @generated
	 */
	EAttribute getPartyCarrierAccount_AccountNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyCarrierAccount#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyCarrierAccount#getThruDate()
	 * @see #getPartyCarrierAccount()
	 * @generated
	 */
	EAttribute getPartyCarrierAccount_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PartyClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyClassification
	 * @generated
	 */
	EClass getPartyClassification();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyClassification#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyClassification#getPartyId()
	 * @see #getPartyClassification()
	 * @generated
	 */
	EReference getPartyClassification_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyClassification#getPartyClassificationGroupId <em>Party Classification Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Classification Group Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyClassification#getPartyClassificationGroupId()
	 * @see #getPartyClassification()
	 * @generated
	 */
	EReference getPartyClassification_PartyClassificationGroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyClassification#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyClassification#getFromDate()
	 * @see #getPartyClassification()
	 * @generated
	 */
	EAttribute getPartyClassification_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyClassification#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyClassification#getThruDate()
	 * @see #getPartyClassification()
	 * @generated
	 */
	EAttribute getPartyClassification_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PartyClassificationGroup <em>Classification Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Group</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyClassificationGroup
	 * @generated
	 */
	EClass getPartyClassificationGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyClassificationGroup#getPartyClassificationGroupId <em>Party Classification Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Classification Group Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyClassificationGroup#getPartyClassificationGroupId()
	 * @see #getPartyClassificationGroup()
	 * @generated
	 */
	EAttribute getPartyClassificationGroup_PartyClassificationGroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyClassificationGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyClassificationGroup#getDescription()
	 * @see #getPartyClassificationGroup()
	 * @generated
	 */
	EAttribute getPartyClassificationGroup_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyClassificationGroup#getParentGroupId <em>Parent Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Group Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyClassificationGroup#getParentGroupId()
	 * @see #getPartyClassificationGroup()
	 * @generated
	 */
	EReference getPartyClassificationGroup_ParentGroupId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyClassificationGroup#getPartyClassificationTypeId <em>Party Classification Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Classification Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyClassificationGroup#getPartyClassificationTypeId()
	 * @see #getPartyClassificationGroup()
	 * @generated
	 */
	EReference getPartyClassificationGroup_PartyClassificationTypeId();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.PartyClassificationGroup#childPartyClassificationGroups() <em>Child Party Classification Groups</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Child Party Classification Groups</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.PartyClassificationGroup#childPartyClassificationGroups()
	 * @generated
	 */
	EOperation getPartyClassificationGroup__ChildPartyClassificationGroups();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.PartyClassificationGroup#segmentGroupClassifications() <em>Segment Group Classifications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Segment Group Classifications</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.PartyClassificationGroup#segmentGroupClassifications()
	 * @generated
	 */
	EOperation getPartyClassificationGroup__SegmentGroupClassifications();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PartyClassificationType <em>Classification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Type</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyClassificationType
	 * @generated
	 */
	EClass getPartyClassificationType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyClassificationType#getPartyClassificationTypeId <em>Party Classification Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Classification Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyClassificationType#getPartyClassificationTypeId()
	 * @see #getPartyClassificationType()
	 * @generated
	 */
	EAttribute getPartyClassificationType_PartyClassificationTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyClassificationType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyClassificationType#getDescription()
	 * @see #getPartyClassificationType()
	 * @generated
	 */
	EAttribute getPartyClassificationType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyClassificationType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyClassificationType#isHasTable()
	 * @see #getPartyClassificationType()
	 * @generated
	 */
	EAttribute getPartyClassificationType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyClassificationType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyClassificationType#getParentTypeId()
	 * @see #getPartyClassificationType()
	 * @generated
	 */
	EReference getPartyClassificationType_ParentTypeId();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.PartyClassificationType#childPartyClassificationTypes() <em>Child Party Classification Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Child Party Classification Types</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.PartyClassificationType#childPartyClassificationTypes()
	 * @generated
	 */
	EOperation getPartyClassificationType__ChildPartyClassificationTypes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.PartyClassificationType#partyClassificationGroups() <em>Party Classification Groups</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Party Classification Groups</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.PartyClassificationType#partyClassificationGroups()
	 * @generated
	 */
	EOperation getPartyClassificationType__PartyClassificationGroups();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PartyContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyContent
	 * @generated
	 */
	EClass getPartyContent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyContent#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyContent#getPartyId()
	 * @see #getPartyContent()
	 * @generated
	 */
	EReference getPartyContent_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyContent#getContentId <em>Content Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyContent#getContentId()
	 * @see #getPartyContent()
	 * @generated
	 */
	EReference getPartyContent_ContentId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyContent#getPartyContentTypeId <em>Party Content Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Content Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyContent#getPartyContentTypeId()
	 * @see #getPartyContent()
	 * @generated
	 */
	EReference getPartyContent_PartyContentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyContent#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyContent#getFromDate()
	 * @see #getPartyContent()
	 * @generated
	 */
	EAttribute getPartyContent_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyContent#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyContent#getThruDate()
	 * @see #getPartyContent()
	 * @generated
	 */
	EAttribute getPartyContent_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PartyContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Type</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyContentType
	 * @generated
	 */
	EClass getPartyContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyContentType#getPartyContentTypeId <em>Party Content Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Content Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyContentType#getPartyContentTypeId()
	 * @see #getPartyContentType()
	 * @generated
	 */
	EAttribute getPartyContentType_PartyContentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyContentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyContentType#getDescription()
	 * @see #getPartyContentType()
	 * @generated
	 */
	EAttribute getPartyContentType_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyContentType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyContentType#getParentTypeId()
	 * @see #getPartyContentType()
	 * @generated
	 */
	EReference getPartyContentType_ParentTypeId();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.PartyContentType#childPartyContentTypes() <em>Child Party Content Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Child Party Content Types</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.PartyContentType#childPartyContentTypes()
	 * @generated
	 */
	EOperation getPartyContentType__ChildPartyContentTypes();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PartyDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyDataSource
	 * @generated
	 */
	EClass getPartyDataSource();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyDataSource#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyDataSource#getPartyId()
	 * @see #getPartyDataSource()
	 * @generated
	 */
	EReference getPartyDataSource_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyDataSource#getDataSourceId <em>Data Source Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Source Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyDataSource#getDataSourceId()
	 * @see #getPartyDataSource()
	 * @generated
	 */
	EReference getPartyDataSource_DataSourceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyDataSource#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyDataSource#getFromDate()
	 * @see #getPartyDataSource()
	 * @generated
	 */
	EAttribute getPartyDataSource_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyDataSource#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyDataSource#getComments()
	 * @see #getPartyDataSource()
	 * @generated
	 */
	EAttribute getPartyDataSource_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyDataSource#isIsCreate <em>Is Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Create</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyDataSource#isIsCreate()
	 * @see #getPartyDataSource()
	 * @generated
	 */
	EAttribute getPartyDataSource_IsCreate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyDataSource#getVisitId <em>Visit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visit Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyDataSource#getVisitId()
	 * @see #getPartyDataSource()
	 * @generated
	 */
	EAttribute getPartyDataSource_VisitId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PartyGeoPoint <em>Geo Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geo Point</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyGeoPoint
	 * @generated
	 */
	EClass getPartyGeoPoint();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyGeoPoint#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyGeoPoint#getPartyId()
	 * @see #getPartyGeoPoint()
	 * @generated
	 */
	EReference getPartyGeoPoint_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyGeoPoint#getGeoPointId <em>Geo Point Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo Point Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyGeoPoint#getGeoPointId()
	 * @see #getPartyGeoPoint()
	 * @generated
	 */
	EReference getPartyGeoPoint_GeoPointId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyGeoPoint#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyGeoPoint#getFromDate()
	 * @see #getPartyGeoPoint()
	 * @generated
	 */
	EAttribute getPartyGeoPoint_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyGeoPoint#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyGeoPoint#getThruDate()
	 * @see #getPartyGeoPoint()
	 * @generated
	 */
	EAttribute getPartyGeoPoint_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PartyGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyGroup
	 * @generated
	 */
	EClass getPartyGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyGroup#getAnnualRevenue <em>Annual Revenue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annual Revenue</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyGroup#getAnnualRevenue()
	 * @see #getPartyGroup()
	 * @generated
	 */
	EAttribute getPartyGroup_AnnualRevenue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyGroup#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyGroup#getComments()
	 * @see #getPartyGroup()
	 * @generated
	 */
	EAttribute getPartyGroup_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyGroup#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyGroup#getGroupName()
	 * @see #getPartyGroup()
	 * @generated
	 */
	EAttribute getPartyGroup_GroupName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyGroup#getGroupNameLocal <em>Group Name Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name Local</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyGroup#getGroupNameLocal()
	 * @see #getPartyGroup()
	 * @generated
	 */
	EAttribute getPartyGroup_GroupNameLocal();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyGroup#getLogoImageUrl <em>Logo Image Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logo Image Url</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyGroup#getLogoImageUrl()
	 * @see #getPartyGroup()
	 * @generated
	 */
	EAttribute getPartyGroup_LogoImageUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyGroup#getNumEmployees <em>Num Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Employees</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyGroup#getNumEmployees()
	 * @see #getPartyGroup()
	 * @generated
	 */
	EAttribute getPartyGroup_NumEmployees();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyGroup#getOfficeSiteName <em>Office Site Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Office Site Name</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyGroup#getOfficeSiteName()
	 * @see #getPartyGroup()
	 * @generated
	 */
	EAttribute getPartyGroup_OfficeSiteName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyGroup#getTickerSymbol <em>Ticker Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ticker Symbol</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyGroup#getTickerSymbol()
	 * @see #getPartyGroup()
	 * @generated
	 */
	EAttribute getPartyGroup_TickerSymbol();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PartyIcsAvsOverride <em>Ics Avs Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ics Avs Override</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyIcsAvsOverride
	 * @generated
	 */
	EClass getPartyIcsAvsOverride();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyIcsAvsOverride#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyIcsAvsOverride#getPartyId()
	 * @see #getPartyIcsAvsOverride()
	 * @generated
	 */
	EReference getPartyIcsAvsOverride_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyIcsAvsOverride#getAvsDeclineString <em>Avs Decline String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avs Decline String</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyIcsAvsOverride#getAvsDeclineString()
	 * @see #getPartyIcsAvsOverride()
	 * @generated
	 */
	EAttribute getPartyIcsAvsOverride_AvsDeclineString();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PartyIdentification <em>Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identification</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyIdentification
	 * @generated
	 */
	EClass getPartyIdentification();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyIdentification#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyIdentification#getPartyId()
	 * @see #getPartyIdentification()
	 * @generated
	 */
	EReference getPartyIdentification_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyIdentification#getPartyIdentificationTypeId <em>Party Identification Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Identification Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyIdentification#getPartyIdentificationTypeId()
	 * @see #getPartyIdentification()
	 * @generated
	 */
	EReference getPartyIdentification_PartyIdentificationTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyIdentification#getIdValue <em>Id Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Value</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyIdentification#getIdValue()
	 * @see #getPartyIdentification()
	 * @generated
	 */
	EAttribute getPartyIdentification_IdValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PartyIdentificationType <em>Identification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identification Type</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyIdentificationType
	 * @generated
	 */
	EClass getPartyIdentificationType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyIdentificationType#getPartyIdentificationTypeId <em>Party Identification Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Identification Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyIdentificationType#getPartyIdentificationTypeId()
	 * @see #getPartyIdentificationType()
	 * @generated
	 */
	EAttribute getPartyIdentificationType_PartyIdentificationTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyIdentificationType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyIdentificationType#getDescription()
	 * @see #getPartyIdentificationType()
	 * @generated
	 */
	EAttribute getPartyIdentificationType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyIdentificationType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyIdentificationType#isHasTable()
	 * @see #getPartyIdentificationType()
	 * @generated
	 */
	EAttribute getPartyIdentificationType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyIdentificationType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyIdentificationType#getParentTypeId()
	 * @see #getPartyIdentificationType()
	 * @generated
	 */
	EReference getPartyIdentificationType_ParentTypeId();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.PartyIdentificationType#childPartyIdentificationTypes() <em>Child Party Identification Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Child Party Identification Types</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.PartyIdentificationType#childPartyIdentificationTypes()
	 * @generated
	 */
	EOperation getPartyIdentificationType__ChildPartyIdentificationTypes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.PartyIdentificationType#partyIdentifications() <em>Party Identifications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Party Identifications</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.PartyIdentificationType#partyIdentifications()
	 * @generated
	 */
	EOperation getPartyIdentificationType__PartyIdentifications();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PartyInvitation <em>Invitation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invitation</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyInvitation
	 * @generated
	 */
	EClass getPartyInvitation();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyInvitation#getPartyInvitationId <em>Party Invitation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Invitation Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyInvitation#getPartyInvitationId()
	 * @see #getPartyInvitation()
	 * @generated
	 */
	EAttribute getPartyInvitation_PartyInvitationId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyInvitation#getEmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Address</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyInvitation#getEmailAddress()
	 * @see #getPartyInvitation()
	 * @generated
	 */
	EAttribute getPartyInvitation_EmailAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyInvitation#getLastInviteDate <em>Last Invite Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Invite Date</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyInvitation#getLastInviteDate()
	 * @see #getPartyInvitation()
	 * @generated
	 */
	EAttribute getPartyInvitation_LastInviteDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyInvitation#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyInvitation#getPartyId()
	 * @see #getPartyInvitation()
	 * @generated
	 */
	EAttribute getPartyInvitation_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyInvitation#getPartyIdFrom <em>Party Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id From</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyInvitation#getPartyIdFrom()
	 * @see #getPartyInvitation()
	 * @generated
	 */
	EReference getPartyInvitation_PartyIdFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyInvitation#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyInvitation#getStatusId()
	 * @see #getPartyInvitation()
	 * @generated
	 */
	EReference getPartyInvitation_StatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyInvitation#getToName <em>To Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Name</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyInvitation#getToName()
	 * @see #getPartyInvitation()
	 * @generated
	 */
	EAttribute getPartyInvitation_ToName();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.biz.party.party.PartyInvitation#getPartyInvitationGroupAssocs <em>Party Invitation Group Assocs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Party Invitation Group Assocs</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyInvitation#getPartyInvitationGroupAssocs()
	 * @see #getPartyInvitation()
	 * @generated
	 */
	EAttribute getPartyInvitation_PartyInvitationGroupAssocs();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.biz.party.party.PartyInvitation#getPartyInvitationRoleAssocs <em>Party Invitation Role Assocs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Party Invitation Role Assocs</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyInvitation#getPartyInvitationRoleAssocs()
	 * @see #getPartyInvitation()
	 * @generated
	 */
	EAttribute getPartyInvitation_PartyInvitationRoleAssocs();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PartyInvitationGroupAssoc <em>Invitation Group Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invitation Group Assoc</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyInvitationGroupAssoc
	 * @generated
	 */
	EClass getPartyInvitationGroupAssoc();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyInvitationGroupAssoc#getPartyInvitationId <em>Party Invitation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Invitation Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyInvitationGroupAssoc#getPartyInvitationId()
	 * @see #getPartyInvitationGroupAssoc()
	 * @generated
	 */
	EReference getPartyInvitationGroupAssoc_PartyInvitationId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyInvitationGroupAssoc#getPartyIdTo <em>Party Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id To</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyInvitationGroupAssoc#getPartyIdTo()
	 * @see #getPartyInvitationGroupAssoc()
	 * @generated
	 */
	EReference getPartyInvitationGroupAssoc_PartyIdTo();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PartyInvitationRoleAssoc <em>Invitation Role Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invitation Role Assoc</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyInvitationRoleAssoc
	 * @generated
	 */
	EClass getPartyInvitationRoleAssoc();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyInvitationRoleAssoc#getPartyInvitationId <em>Party Invitation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Invitation Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyInvitationRoleAssoc#getPartyInvitationId()
	 * @see #getPartyInvitationRoleAssoc()
	 * @generated
	 */
	EReference getPartyInvitationRoleAssoc_PartyInvitationId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyInvitationRoleAssoc#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyInvitationRoleAssoc#getRoleTypeId()
	 * @see #getPartyInvitationRoleAssoc()
	 * @generated
	 */
	EReference getPartyInvitationRoleAssoc_RoleTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PartyNameHistory <em>Name History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name History</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyNameHistory
	 * @generated
	 */
	EClass getPartyNameHistory();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyNameHistory#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyNameHistory#getPartyId()
	 * @see #getPartyNameHistory()
	 * @generated
	 */
	EReference getPartyNameHistory_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyNameHistory#getChangeDate <em>Change Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Date</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyNameHistory#getChangeDate()
	 * @see #getPartyNameHistory()
	 * @generated
	 */
	EAttribute getPartyNameHistory_ChangeDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyNameHistory#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyNameHistory#getFirstName()
	 * @see #getPartyNameHistory()
	 * @generated
	 */
	EAttribute getPartyNameHistory_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyNameHistory#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyNameHistory#getGroupName()
	 * @see #getPartyNameHistory()
	 * @generated
	 */
	EAttribute getPartyNameHistory_GroupName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyNameHistory#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyNameHistory#getLastName()
	 * @see #getPartyNameHistory()
	 * @generated
	 */
	EAttribute getPartyNameHistory_LastName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyNameHistory#getMiddleName <em>Middle Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Middle Name</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyNameHistory#getMiddleName()
	 * @see #getPartyNameHistory()
	 * @generated
	 */
	EAttribute getPartyNameHistory_MiddleName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyNameHistory#getPersonalTitle <em>Personal Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Personal Title</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyNameHistory#getPersonalTitle()
	 * @see #getPartyNameHistory()
	 * @generated
	 */
	EAttribute getPartyNameHistory_PersonalTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyNameHistory#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suffix</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyNameHistory#getSuffix()
	 * @see #getPartyNameHistory()
	 * @generated
	 */
	EAttribute getPartyNameHistory_Suffix();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PartyNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyNote
	 * @generated
	 */
	EClass getPartyNote();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyNote#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyNote#getPartyId()
	 * @see #getPartyNote()
	 * @generated
	 */
	EReference getPartyNote_PartyId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PartyProfileDefault <em>Profile Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile Default</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyProfileDefault
	 * @generated
	 */
	EClass getPartyProfileDefault();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyProfileDefault#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyProfileDefault#getPartyId()
	 * @see #getPartyProfileDefault()
	 * @generated
	 */
	EReference getPartyProfileDefault_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyProfileDefault#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyProfileDefault#getProductStoreId()
	 * @see #getPartyProfileDefault()
	 * @generated
	 */
	EReference getPartyProfileDefault_ProductStoreId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyProfileDefault#getDefaultBillAddr <em>Default Bill Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Bill Addr</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyProfileDefault#getDefaultBillAddr()
	 * @see #getPartyProfileDefault()
	 * @generated
	 */
	EAttribute getPartyProfileDefault_DefaultBillAddr();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyProfileDefault#getDefaultPayMeth <em>Default Pay Meth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Pay Meth</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyProfileDefault#getDefaultPayMeth()
	 * @see #getPartyProfileDefault()
	 * @generated
	 */
	EAttribute getPartyProfileDefault_DefaultPayMeth();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyProfileDefault#getDefaultShipAddr <em>Default Ship Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Ship Addr</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyProfileDefault#getDefaultShipAddr()
	 * @see #getPartyProfileDefault()
	 * @generated
	 */
	EAttribute getPartyProfileDefault_DefaultShipAddr();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyProfileDefault#getDefaultShipMeth <em>Default Ship Meth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Ship Meth</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyProfileDefault#getDefaultShipMeth()
	 * @see #getPartyProfileDefault()
	 * @generated
	 */
	EAttribute getPartyProfileDefault_DefaultShipMeth();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PartyRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRelationship
	 * @generated
	 */
	EClass getPartyRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getPartyIdFrom <em>Party Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id From</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRelationship#getPartyIdFrom()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EReference getPartyRelationship_PartyIdFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getPartyIdTo <em>Party Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id To</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRelationship#getPartyIdTo()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EReference getPartyRelationship_PartyIdTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getRoleTypeIdFrom <em>Role Type Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id From</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRelationship#getRoleTypeIdFrom()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EReference getPartyRelationship_RoleTypeIdFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getRoleTypeIdTo <em>Role Type Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id To</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRelationship#getRoleTypeIdTo()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EReference getPartyRelationship_RoleTypeIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRelationship#getFromDate()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EAttribute getPartyRelationship_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRelationship#getComments()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EAttribute getPartyRelationship_Comments();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getPartyRelationshipTypeId <em>Party Relationship Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Relationship Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRelationship#getPartyRelationshipTypeId()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EReference getPartyRelationship_PartyRelationshipTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getPermissionsEnumId <em>Permissions Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permissions Enum Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRelationship#getPermissionsEnumId()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EAttribute getPartyRelationship_PermissionsEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getPositionTitle <em>Position Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Title</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRelationship#getPositionTitle()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EAttribute getPartyRelationship_PositionTitle();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getPriorityTypeId <em>Priority Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Priority Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRelationship#getPriorityTypeId()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EReference getPartyRelationship_PriorityTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getRelationshipName <em>Relationship Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Name</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRelationship#getRelationshipName()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EAttribute getPartyRelationship_RelationshipName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getSecurityGroupId <em>Security Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Group Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRelationship#getSecurityGroupId()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EReference getPartyRelationship_SecurityGroupId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRelationship#getStatusId()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EReference getPartyRelationship_StatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyRelationship#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRelationship#getThruDate()
	 * @see #getPartyRelationship()
	 * @generated
	 */
	EAttribute getPartyRelationship_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PartyRelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Type</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRelationshipType
	 * @generated
	 */
	EClass getPartyRelationshipType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyRelationshipType#getPartyRelationshipTypeId <em>Party Relationship Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Relationship Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRelationshipType#getPartyRelationshipTypeId()
	 * @see #getPartyRelationshipType()
	 * @generated
	 */
	EAttribute getPartyRelationshipType_PartyRelationshipTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyRelationshipType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRelationshipType#getDescription()
	 * @see #getPartyRelationshipType()
	 * @generated
	 */
	EAttribute getPartyRelationshipType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyRelationshipType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRelationshipType#isHasTable()
	 * @see #getPartyRelationshipType()
	 * @generated
	 */
	EAttribute getPartyRelationshipType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyRelationshipType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRelationshipType#getParentTypeId()
	 * @see #getPartyRelationshipType()
	 * @generated
	 */
	EReference getPartyRelationshipType_ParentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyRelationshipType#getPartyRelationshipName <em>Party Relationship Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Relationship Name</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRelationshipType#getPartyRelationshipName()
	 * @see #getPartyRelationshipType()
	 * @generated
	 */
	EAttribute getPartyRelationshipType_PartyRelationshipName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyRelationshipType#getRoleTypeIdValidFrom <em>Role Type Id Valid From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id Valid From</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRelationshipType#getRoleTypeIdValidFrom()
	 * @see #getPartyRelationshipType()
	 * @generated
	 */
	EReference getPartyRelationshipType_RoleTypeIdValidFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyRelationshipType#getRoleTypeIdValidTo <em>Role Type Id Valid To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id Valid To</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRelationshipType#getRoleTypeIdValidTo()
	 * @see #getPartyRelationshipType()
	 * @generated
	 */
	EReference getPartyRelationshipType_RoleTypeIdValidTo();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.PartyRelationshipType#childPartyRelationshipTypes() <em>Child Party Relationship Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Child Party Relationship Types</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.PartyRelationshipType#childPartyRelationshipTypes()
	 * @generated
	 */
	EOperation getPartyRelationshipType__ChildPartyRelationshipTypes();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PartyRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRole
	 * @generated
	 */
	EClass getPartyRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyRole#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRole#getPartyId()
	 * @see #getPartyRole()
	 * @generated
	 */
	EReference getPartyRole_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyRole#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyRole#getRoleTypeId()
	 * @see #getPartyRole()
	 * @generated
	 */
	EReference getPartyRole_RoleTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PartyStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyStatus
	 * @generated
	 */
	EClass getPartyStatus();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyStatus#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyStatus#getStatusId()
	 * @see #getPartyStatus()
	 * @generated
	 */
	EReference getPartyStatus_StatusId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyStatus#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyStatus#getPartyId()
	 * @see #getPartyStatus()
	 * @generated
	 */
	EReference getPartyStatus_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyStatus#getStatusDate <em>Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Date</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyStatus#getStatusDate()
	 * @see #getPartyStatus()
	 * @generated
	 */
	EAttribute getPartyStatus_StatusDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyStatus#getChangeByUserLoginId <em>Change By User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change By User Login Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyStatus#getChangeByUserLoginId()
	 * @see #getPartyStatus()
	 * @generated
	 */
	EReference getPartyStatus_ChangeByUserLoginId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PartyType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyType
	 * @generated
	 */
	EClass getPartyType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyType#getPartyTypeId <em>Party Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyType#getPartyTypeId()
	 * @see #getPartyType()
	 * @generated
	 */
	EAttribute getPartyType_PartyTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyType#getDescription()
	 * @see #getPartyType()
	 * @generated
	 */
	EAttribute getPartyType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyType#isHasTable()
	 * @see #getPartyType()
	 * @generated
	 */
	EAttribute getPartyType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyType#getParentTypeId()
	 * @see #getPartyType()
	 * @generated
	 */
	EReference getPartyType_ParentTypeId();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.biz.party.party.PartyType#getPartyTypeAttrs <em>Party Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Party Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyType#getPartyTypeAttrs()
	 * @see #getPartyType()
	 * @generated
	 */
	EAttribute getPartyType_PartyTypeAttrs();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.PartyType#childPartyTypes() <em>Child Party Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Child Party Types</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.PartyType#childPartyTypes()
	 * @generated
	 */
	EOperation getPartyType__ChildPartyTypes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.PartyType#parties() <em>Parties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parties</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.PartyType#parties()
	 * @generated
	 */
	EOperation getPartyType__Parties();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PartyTypeAttr <em>Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Attr</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyTypeAttr
	 * @generated
	 */
	EClass getPartyTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.PartyTypeAttr#getPartyTypeId <em>Party Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyTypeAttr#getPartyTypeId()
	 * @see #getPartyTypeAttr()
	 * @generated
	 */
	EReference getPartyTypeAttr_PartyTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyTypeAttr#getAttrName()
	 * @see #getPartyTypeAttr()
	 * @generated
	 */
	EAttribute getPartyTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PartyTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.party.party.PartyTypeAttr#getDescription()
	 * @see #getPartyTypeAttr()
	 * @generated
	 */
	EAttribute getPartyTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getBirthDate <em>Birth Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Date</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getBirthDate()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_BirthDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getCardId <em>Card Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getCardId()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_CardId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getComments()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getDeceasedDate <em>Deceased Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deceased Date</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getDeceasedDate()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_DeceasedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.Person#getEmploymentStatusEnumId <em>Employment Status Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Employment Status Enum Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getEmploymentStatusEnumId()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_EmploymentStatusEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#isExistingCustomer <em>Existing Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Existing Customer</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#isExistingCustomer()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_ExistingCustomer();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getFirstName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getFirstNameLocal <em>First Name Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name Local</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getFirstNameLocal()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstNameLocal();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#isGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#isGender()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Gender();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getHeight()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getLastName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getLastNameLocal <em>Last Name Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name Local</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getLastNameLocal()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastNameLocal();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#isMaritalStatus <em>Marital Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marital Status</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#isMaritalStatus()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_MaritalStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getMemberId <em>Member Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getMemberId()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_MemberId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getMiddleName <em>Middle Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Middle Name</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getMiddleName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_MiddleName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getMiddleNameLocal <em>Middle Name Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Middle Name Local</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getMiddleNameLocal()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_MiddleNameLocal();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getMonthsWithEmployer <em>Months With Employer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Months With Employer</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getMonthsWithEmployer()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_MonthsWithEmployer();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getMothersMaidenName <em>Mothers Maiden Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mothers Maiden Name</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getMothersMaidenName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_MothersMaidenName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getNickname <em>Nickname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nickname</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getNickname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Nickname();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getOccupation <em>Occupation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occupation</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getOccupation()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Occupation();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getOtherLocal <em>Other Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other Local</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getOtherLocal()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_OtherLocal();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getPassportExpireDate <em>Passport Expire Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passport Expire Date</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getPassportExpireDate()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PassportExpireDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getPassportNumber <em>Passport Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passport Number</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getPassportNumber()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PassportNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getPersonalTitle <em>Personal Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Personal Title</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getPersonalTitle()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_PersonalTitle();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.Person#getResidenceStatusEnumId <em>Residence Status Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Residence Status Enum Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getResidenceStatusEnumId()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_ResidenceStatusEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getSalutation <em>Salutation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salutation</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getSalutation()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Salutation();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getSocialSecurityNumber <em>Social Security Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Social Security Number</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getSocialSecurityNumber()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_SocialSecurityNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suffix</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getSuffix()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Suffix();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getTotalYearsWorkExperience <em>Total Years Work Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Years Work Experience</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getTotalYearsWorkExperience()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_TotalYearsWorkExperience();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getWeight()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Weight();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Person#getYearsWithEmployer <em>Years With Employer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Years With Employer</em>'.
	 * @see org.abchip.mimo.biz.party.party.Person#getYearsWithEmployer()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_YearsWithEmployer();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.PriorityType <em>Priority Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Priority Type</em>'.
	 * @see org.abchip.mimo.biz.party.party.PriorityType
	 * @generated
	 */
	EClass getPriorityType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PriorityType#getPriorityTypeId <em>Priority Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.PriorityType#getPriorityTypeId()
	 * @see #getPriorityType()
	 * @generated
	 */
	EAttribute getPriorityType_PriorityTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.PriorityType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.party.party.PriorityType#getDescription()
	 * @see #getPriorityType()
	 * @generated
	 */
	EAttribute getPriorityType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Type</em>'.
	 * @see org.abchip.mimo.biz.party.party.RoleType
	 * @generated
	 */
	EClass getRoleType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.RoleType#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.RoleType#getRoleTypeId()
	 * @see #getRoleType()
	 * @generated
	 */
	EAttribute getRoleType_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.RoleType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.party.party.RoleType#getDescription()
	 * @see #getRoleType()
	 * @generated
	 */
	EAttribute getRoleType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.RoleType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.party.party.RoleType#isHasTable()
	 * @see #getRoleType()
	 * @generated
	 */
	EAttribute getRoleType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.RoleType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.RoleType#getParentTypeId()
	 * @see #getRoleType()
	 * @generated
	 */
	EReference getRoleType_ParentTypeId();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.biz.party.party.RoleType#getRoleTypeAttrs <em>Role Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Role Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.party.party.RoleType#getRoleTypeAttrs()
	 * @see #getRoleType()
	 * @generated
	 */
	EAttribute getRoleType_RoleTypeAttrs();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.biz.party.party.RoleType#getValidContactMechRoles <em>Valid Contact Mech Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Valid Contact Mech Roles</em>'.
	 * @see org.abchip.mimo.biz.party.party.RoleType#getValidContactMechRoles()
	 * @see #getRoleType()
	 * @generated
	 */
	EAttribute getRoleType_ValidContactMechRoles();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.RoleType#acctgTransEntries() <em>Acctg Trans Entries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Acctg Trans Entries</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.RoleType#acctgTransEntries()
	 * @generated
	 */
	EOperation getRoleType__AcctgTransEntries();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.RoleType#acctgTranss() <em>Acctg Transs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Acctg Transs</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.RoleType#acctgTranss()
	 * @generated
	 */
	EOperation getRoleType__AcctgTranss();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.RoleType#childRoleTypes() <em>Child Role Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Child Role Types</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.RoleType#childRoleTypes()
	 * @generated
	 */
	EOperation getRoleType__ChildRoleTypes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.RoleType#contentApprovals() <em>Content Approvals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Content Approvals</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.RoleType#contentApprovals()
	 * @generated
	 */
	EOperation getRoleType__ContentApprovals();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.RoleType#fixedAssets() <em>Fixed Assets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fixed Assets</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.RoleType#fixedAssets()
	 * @generated
	 */
	EOperation getRoleType__FixedAssets();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.RoleType#fromAgreements() <em>From Agreements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>From Agreements</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.RoleType#fromAgreements()
	 * @generated
	 */
	EOperation getRoleType__FromAgreements();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.RoleType#fromCommunicationEvents() <em>From Communication Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>From Communication Events</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.RoleType#fromCommunicationEvents()
	 * @generated
	 */
	EOperation getRoleType__FromCommunicationEvents();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.RoleType#glAccountOrganizations() <em>Gl Account Organizations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Gl Account Organizations</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.RoleType#glAccountOrganizations()
	 * @generated
	 */
	EOperation getRoleType__GlAccountOrganizations();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.RoleType#invoices() <em>Invoices</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Invoices</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.RoleType#invoices()
	 * @generated
	 */
	EOperation getRoleType__Invoices();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.RoleType#originatedFromSubscriptions() <em>Originated From Subscriptions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Originated From Subscriptions</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.RoleType#originatedFromSubscriptions()
	 * @generated
	 */
	EOperation getRoleType__OriginatedFromSubscriptions();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.RoleType#partyInvitationRoleAssocs() <em>Party Invitation Role Assocs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Party Invitation Role Assocs</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.RoleType#partyInvitationRoleAssocs()
	 * @generated
	 */
	EOperation getRoleType__PartyInvitationRoleAssocs();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.RoleType#partyRoles() <em>Party Roles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Party Roles</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.RoleType#partyRoles()
	 * @generated
	 */
	EOperation getRoleType__PartyRoles();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.RoleType#shipmentCostEstimates() <em>Shipment Cost Estimates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Shipment Cost Estimates</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.RoleType#shipmentCostEstimates()
	 * @generated
	 */
	EOperation getRoleType__ShipmentCostEstimates();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.RoleType#subscriptions() <em>Subscriptions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Subscriptions</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.RoleType#subscriptions()
	 * @generated
	 */
	EOperation getRoleType__Subscriptions();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.RoleType#toAgreements() <em>To Agreements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Agreements</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.RoleType#toAgreements()
	 * @generated
	 */
	EOperation getRoleType__ToAgreements();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.RoleType#toCommunicationEvents() <em>To Communication Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Communication Events</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.RoleType#toCommunicationEvents()
	 * @generated
	 */
	EOperation getRoleType__ToCommunicationEvents();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.RoleType#toPayments() <em>To Payments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Payments</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.RoleType#toPayments()
	 * @generated
	 */
	EOperation getRoleType__ToPayments();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.RoleType#validFromPartyRelationshipTypes() <em>Valid From Party Relationship Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid From Party Relationship Types</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.RoleType#validFromPartyRelationshipTypes()
	 * @generated
	 */
	EOperation getRoleType__ValidFromPartyRelationshipTypes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.party.party.RoleType#validToPartyRelationshipTypes() <em>Valid To Party Relationship Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid To Party Relationship Types</em>' operation.
	 * @see org.abchip.mimo.biz.party.party.RoleType#validToPartyRelationshipTypes()
	 * @generated
	 */
	EOperation getRoleType__ValidToPartyRelationshipTypes();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.RoleTypeAttr <em>Role Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Type Attr</em>'.
	 * @see org.abchip.mimo.biz.party.party.RoleTypeAttr
	 * @generated
	 */
	EClass getRoleTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.RoleTypeAttr#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.RoleTypeAttr#getRoleTypeId()
	 * @see #getRoleTypeAttr()
	 * @generated
	 */
	EReference getRoleTypeAttr_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.RoleTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.party.party.RoleTypeAttr#getAttrName()
	 * @see #getRoleTypeAttr()
	 * @generated
	 */
	EAttribute getRoleTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.RoleTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.party.party.RoleTypeAttr#getDescription()
	 * @see #getRoleTypeAttr()
	 * @generated
	 */
	EAttribute getRoleTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.Vendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vendor</em>'.
	 * @see org.abchip.mimo.biz.party.party.Vendor
	 * @generated
	 */
	EClass getVendor();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.Vendor#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.Vendor#getPartyId()
	 * @see #getVendor()
	 * @generated
	 */
	EReference getVendor_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Vendor#getManifestCompanyName <em>Manifest Company Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manifest Company Name</em>'.
	 * @see org.abchip.mimo.biz.party.party.Vendor#getManifestCompanyName()
	 * @see #getVendor()
	 * @generated
	 */
	EAttribute getVendor_ManifestCompanyName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Vendor#getManifestCompanyTitle <em>Manifest Company Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manifest Company Title</em>'.
	 * @see org.abchip.mimo.biz.party.party.Vendor#getManifestCompanyTitle()
	 * @see #getVendor()
	 * @generated
	 */
	EAttribute getVendor_ManifestCompanyTitle();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Vendor#getManifestLogoUrl <em>Manifest Logo Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manifest Logo Url</em>'.
	 * @see org.abchip.mimo.biz.party.party.Vendor#getManifestLogoUrl()
	 * @see #getVendor()
	 * @generated
	 */
	EAttribute getVendor_ManifestLogoUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.Vendor#getManifestPolicies <em>Manifest Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manifest Policies</em>'.
	 * @see org.abchip.mimo.biz.party.party.Vendor#getManifestPolicies()
	 * @see #getVendor()
	 * @generated
	 */
	EAttribute getVendor_ManifestPolicies();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.party.WebSiteRole <em>Web Site Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Site Role</em>'.
	 * @see org.abchip.mimo.biz.party.party.WebSiteRole
	 * @generated
	 */
	EClass getWebSiteRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.WebSiteRole#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.WebSiteRole#getPartyId()
	 * @see #getWebSiteRole()
	 * @generated
	 */
	EReference getWebSiteRole_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.WebSiteRole#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.WebSiteRole#getRoleTypeId()
	 * @see #getWebSiteRole()
	 * @generated
	 */
	EReference getWebSiteRole_RoleTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.party.WebSiteRole#getWebSiteId <em>Web Site Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Web Site Id</em>'.
	 * @see org.abchip.mimo.biz.party.party.WebSiteRole#getWebSiteId()
	 * @see #getWebSiteRole()
	 * @generated
	 */
	EReference getWebSiteRole_WebSiteId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.WebSiteRole#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.party.party.WebSiteRole#getFromDate()
	 * @see #getWebSiteRole()
	 * @generated
	 */
	EAttribute getWebSiteRole_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.WebSiteRole#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.party.party.WebSiteRole#getSequenceNum()
	 * @see #getWebSiteRole()
	 * @generated
	 */
	EAttribute getWebSiteRole_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.party.WebSiteRole#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.party.party.WebSiteRole#getThruDate()
	 * @see #getWebSiteRole()
	 * @generated
	 */
	EAttribute getWebSiteRole_ThruDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PartyFactory getPartyFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.AddressMatchMapImpl <em>Address Match Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.AddressMatchMapImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getAddressMatchMap()
		 * @generated
		 */
		EClass ADDRESS_MATCH_MAP = eINSTANCE.getAddressMatchMap();

		/**
		 * The meta object literal for the '<em><b>Map Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_MATCH_MAP__MAP_KEY = eINSTANCE.getAddressMatchMap_MapKey();

		/**
		 * The meta object literal for the '<em><b>Map Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_MATCH_MAP__MAP_VALUE = eINSTANCE.getAddressMatchMap_MapValue();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_MATCH_MAP__SEQUENCE_NUM = eINSTANCE.getAddressMatchMap_SequenceNum();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.AffiliateImpl <em>Affiliate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.AffiliateImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getAffiliate()
		 * @generated
		 */
		EClass AFFILIATE = eINSTANCE.getAffiliate();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFFILIATE__PARTY_ID = eINSTANCE.getAffiliate_PartyId();

		/**
		 * The meta object literal for the '<em><b>Affiliate Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATE__AFFILIATE_DESCRIPTION = eINSTANCE.getAffiliate_AffiliateDescription();

		/**
		 * The meta object literal for the '<em><b>Affiliate Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATE__AFFILIATE_NAME = eINSTANCE.getAffiliate_AffiliateName();

		/**
		 * The meta object literal for the '<em><b>Date Time Approved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATE__DATE_TIME_APPROVED = eINSTANCE.getAffiliate_DateTimeApproved();

		/**
		 * The meta object literal for the '<em><b>Date Time Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATE__DATE_TIME_CREATED = eINSTANCE.getAffiliate_DateTimeCreated();

		/**
		 * The meta object literal for the '<em><b>Site Page Views</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATE__SITE_PAGE_VIEWS = eINSTANCE.getAffiliate_SitePageViews();

		/**
		 * The meta object literal for the '<em><b>Site Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATE__SITE_TYPE = eINSTANCE.getAffiliate_SiteType();

		/**
		 * The meta object literal for the '<em><b>Site Visitors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATE__SITE_VISITORS = eINSTANCE.getAffiliate_SiteVisitors();

		/**
		 * The meta object literal for the '<em><b>Year Established</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AFFILIATE__YEAR_ESTABLISHED = eINSTANCE.getAffiliate_YearEstablished();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyImpl <em>Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getParty()
		 * @generated
		 */
		EClass PARTY = eINSTANCE.getParty();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__PARTY_ID = eINSTANCE.getParty_PartyId();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__CREATED_BY_USER_LOGIN = eINSTANCE.getParty_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__CREATED_DATE = eINSTANCE.getParty_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Data Source Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__DATA_SOURCE_ID = eINSTANCE.getParty_DataSourceId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__DESCRIPTION = eINSTANCE.getParty_Description();

		/**
		 * The meta object literal for the '<em><b>External Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__EXTERNAL_ID = eINSTANCE.getParty_ExternalId();

		/**
		 * The meta object literal for the '<em><b>Is Unread</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__IS_UNREAD = eINSTANCE.getParty_IsUnread();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getParty_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__LAST_MODIFIED_DATE = eINSTANCE.getParty_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Party Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__PARTY_TYPE_ID = eINSTANCE.getParty_PartyTypeId();

		/**
		 * The meta object literal for the '<em><b>Preferred Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__PREFERRED_CURRENCY_UOM_ID = eINSTANCE.getParty_PreferredCurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY__STATUS_ID = eINSTANCE.getParty_StatusId();

		/**
		 * The meta object literal for the '<em><b>Party Attributes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__PARTY_ATTRIBUTES = eINSTANCE.getParty_PartyAttributes();

		/**
		 * The meta object literal for the '<em><b>Party Identifications</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__PARTY_IDENTIFICATIONS = eINSTANCE.getParty_PartyIdentifications();

		/**
		 * The meta object literal for the '<em><b>Party Name Histories</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__PARTY_NAME_HISTORIES = eINSTANCE.getParty_PartyNameHistories();

		/**
		 * The meta object literal for the '<em><b>Party Notes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__PARTY_NOTES = eINSTANCE.getParty_PartyNotes();

		/**
		 * The meta object literal for the '<em><b>Party Profile Defaults</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__PARTY_PROFILE_DEFAULTS = eINSTANCE.getParty_PartyProfileDefaults();

		/**
		 * The meta object literal for the '<em><b>Party Roles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__PARTY_ROLES = eINSTANCE.getParty_PartyRoles();

		/**
		 * The meta object literal for the '<em><b>Party Skills</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__PARTY_SKILLS = eINSTANCE.getParty_PartySkills();

		/**
		 * The meta object literal for the '<em><b>Supplier Product Features</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY__SUPPLIER_PRODUCT_FEATURES = eINSTANCE.getParty_SupplierProductFeatures();

		/**
		 * The meta object literal for the '<em><b>Acctg Trans Entries</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___ACCTG_TRANS_ENTRIES = eINSTANCE.getParty__AcctgTransEntries();

		/**
		 * The meta object literal for the '<em><b>Acctg Transs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___ACCTG_TRANSS = eINSTANCE.getParty__AcctgTranss();

		/**
		 * The meta object literal for the '<em><b>Applying Employment Apps</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___APPLYING_EMPLOYMENT_APPS = eINSTANCE.getParty__ApplyingEmploymentApps();

		/**
		 * The meta object literal for the '<em><b>Approver Employment Apps</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___APPROVER_EMPLOYMENT_APPS = eINSTANCE.getParty__ApproverEmploymentApps();

		/**
		 * The meta object literal for the '<em><b>Carrier Order Item Ship Groups</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___CARRIER_ORDER_ITEM_SHIP_GROUPS = eINSTANCE.getParty__CarrierOrderItemShipGroups();

		/**
		 * The meta object literal for the '<em><b>Carrier Shipment Box Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___CARRIER_SHIPMENT_BOX_TYPES = eINSTANCE.getParty__CarrierShipmentBoxTypes();

		/**
		 * The meta object literal for the '<em><b>Carrier Shipment Route Segments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___CARRIER_SHIPMENT_ROUTE_SEGMENTS = eINSTANCE.getParty__CarrierShipmentRouteSegments();

		/**
		 * The meta object literal for the '<em><b>Client Timesheets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___CLIENT_TIMESHEETS = eINSTANCE.getParty__ClientTimesheets();

		/**
		 * The meta object literal for the '<em><b>Committed By Content Revisions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___COMMITTED_BY_CONTENT_REVISIONS = eINSTANCE.getParty__CommittedByContentRevisions();

		/**
		 * The meta object literal for the '<em><b>Content Approvals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___CONTENT_APPROVALS = eINSTANCE.getParty__ContentApprovals();

		/**
		 * The meta object literal for the '<em><b>Cost Components</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___COST_COMPONENTS = eINSTANCE.getParty__CostComponents();

		/**
		 * The meta object literal for the '<em><b>Cust Request Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___CUST_REQUEST_TYPES = eINSTANCE.getParty__CustRequestTypes();

		/**
		 * The meta object literal for the '<em><b>Empl Positions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___EMPL_POSITIONS = eINSTANCE.getParty__EmplPositions();

		/**
		 * The meta object literal for the '<em><b>Fin Account Transs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___FIN_ACCOUNT_TRANSS = eINSTANCE.getParty__FinAccountTranss();

		/**
		 * The meta object literal for the '<em><b>Fixed Assets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___FIXED_ASSETS = eINSTANCE.getParty__FixedAssets();

		/**
		 * The meta object literal for the '<em><b>From Agreements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___FROM_AGREEMENTS = eINSTANCE.getParty__FromAgreements();

		/**
		 * The meta object literal for the '<em><b>From Communication Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___FROM_COMMUNICATION_EVENTS = eINSTANCE.getParty__FromCommunicationEvents();

		/**
		 * The meta object literal for the '<em><b>From Cust Requests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___FROM_CUST_REQUESTS = eINSTANCE.getParty__FromCustRequests();

		/**
		 * The meta object literal for the '<em><b>From Invoices</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___FROM_INVOICES = eINSTANCE.getParty__FromInvoices();

		/**
		 * The meta object literal for the '<em><b>From Payments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___FROM_PAYMENTS = eINSTANCE.getParty__FromPayments();

		/**
		 * The meta object literal for the '<em><b>From Shipments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___FROM_SHIPMENTS = eINSTANCE.getParty__FromShipments();

		/**
		 * The meta object literal for the '<em><b>Gift Card Fulfillments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___GIFT_CARD_FULFILLMENTS = eINSTANCE.getParty__GiftCardFulfillments();

		/**
		 * The meta object literal for the '<em><b>Gl Account Organizations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___GL_ACCOUNT_ORGANIZATIONS = eINSTANCE.getParty__GlAccountOrganizations();

		/**
		 * The meta object literal for the '<em><b>Gl Journals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___GL_JOURNALS = eINSTANCE.getParty__GlJournals();

		/**
		 * The meta object literal for the '<em><b>Gl Reconciliations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___GL_RECONCILIATIONS = eINSTANCE.getParty__GlReconciliations();

		/**
		 * The meta object literal for the '<em><b>Gov Agency Fixed Asset Registrations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___GOV_AGENCY_FIXED_ASSET_REGISTRATIONS = eINSTANCE.getParty__GovAgencyFixedAssetRegistrations();

		/**
		 * The meta object literal for the '<em><b>Internal Sales Forecast Histories</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___INTERNAL_SALES_FORECAST_HISTORIES = eINSTANCE.getParty__InternalSalesForecastHistories();

		/**
		 * The meta object literal for the '<em><b>Internal Sales Forecasts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___INTERNAL_SALES_FORECASTS = eINSTANCE.getParty__InternalSalesForecasts();

		/**
		 * The meta object literal for the '<em><b>Interviewee Job Interviews</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___INTERVIEWEE_JOB_INTERVIEWS = eINSTANCE.getParty__IntervieweeJobInterviews();

		/**
		 * The meta object literal for the '<em><b>Interviewer Job Interviews</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___INTERVIEWER_JOB_INTERVIEWS = eINSTANCE.getParty__InterviewerJobInterviews();

		/**
		 * The meta object literal for the '<em><b>Inventory Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___INVENTORY_ITEMS = eINSTANCE.getParty__InventoryItems();

		/**
		 * The meta object literal for the '<em><b>Invoices</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___INVOICES = eINSTANCE.getParty__Invoices();

		/**
		 * The meta object literal for the '<em><b>Note Note Datas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___NOTE_NOTE_DATAS = eINSTANCE.getParty__NoteNoteDatas();

		/**
		 * The meta object literal for the '<em><b>Organization Custom Time Periods</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___ORGANIZATION_CUSTOM_TIME_PERIODS = eINSTANCE.getParty__OrganizationCustomTimePeriods();

		/**
		 * The meta object literal for the '<em><b>Organization Fin Account Type Gl Accounts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___ORGANIZATION_FIN_ACCOUNT_TYPE_GL_ACCOUNTS = eINSTANCE.getParty__OrganizationFinAccountTypeGlAccounts();

		/**
		 * The meta object literal for the '<em><b>Organization Fin Accounts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___ORGANIZATION_FIN_ACCOUNTS = eINSTANCE.getParty__OrganizationFinAccounts();

		/**
		 * The meta object literal for the '<em><b>Organization Gl Account Type Defaults</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___ORGANIZATION_GL_ACCOUNT_TYPE_DEFAULTS = eINSTANCE.getParty__OrganizationGlAccountTypeDefaults();

		/**
		 * The meta object literal for the '<em><b>Organization Invoice Item Type Gl Accounts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___ORGANIZATION_INVOICE_ITEM_TYPE_GL_ACCOUNTS = eINSTANCE.getParty__OrganizationInvoiceItemTypeGlAccounts();

		/**
		 * The meta object literal for the '<em><b>Organization Payment Method Type Gl Accounts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___ORGANIZATION_PAYMENT_METHOD_TYPE_GL_ACCOUNTS = eINSTANCE.getParty__OrganizationPaymentMethodTypeGlAccounts();

		/**
		 * The meta object literal for the '<em><b>Organization Sales Forecast Histories</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___ORGANIZATION_SALES_FORECAST_HISTORIES = eINSTANCE.getParty__OrganizationSalesForecastHistories();

		/**
		 * The meta object literal for the '<em><b>Organization Sales Forecasts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___ORGANIZATION_SALES_FORECASTS = eINSTANCE.getParty__OrganizationSalesForecasts();

		/**
		 * The meta object literal for the '<em><b>Organization Variance Reason Gl Accounts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___ORGANIZATION_VARIANCE_REASON_GL_ACCOUNTS = eINSTANCE.getParty__OrganizationVarianceReasonGlAccounts();

		/**
		 * The meta object literal for the '<em><b>Originated From Subscriptions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___ORIGINATED_FROM_SUBSCRIPTIONS = eINSTANCE.getParty__OriginatedFromSubscriptions();

		/**
		 * The meta object literal for the '<em><b>Override Org Invoice Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___OVERRIDE_ORG_INVOICE_ITEMS = eINSTANCE.getParty__OverrideOrgInvoiceItems();

		/**
		 * The meta object literal for the '<em><b>Owner Contact Lists</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___OWNER_CONTACT_LISTS = eINSTANCE.getParty__OwnerContactLists();

		/**
		 * The meta object literal for the '<em><b>Owner Facilities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___OWNER_FACILITIES = eINSTANCE.getParty__OwnerFacilities();

		/**
		 * The meta object literal for the '<em><b>Owner Fin Accounts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___OWNER_FIN_ACCOUNTS = eINSTANCE.getParty__OwnerFinAccounts();

		/**
		 * The meta object literal for the '<em><b>Owner Inventory Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___OWNER_INVENTORY_ITEMS = eINSTANCE.getParty__OwnerInventoryItems();

		/**
		 * The meta object literal for the '<em><b>Party Invitations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___PARTY_INVITATIONS = eINSTANCE.getParty__PartyInvitations();

		/**
		 * The meta object literal for the '<em><b>Party Pref Doc Type Tpls</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___PARTY_PREF_DOC_TYPE_TPLS = eINSTANCE.getParty__PartyPrefDocTypeTpls();

		/**
		 * The meta object literal for the '<em><b>Party Resumes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___PARTY_RESUMES = eINSTANCE.getParty__PartyResumes();

		/**
		 * The meta object literal for the '<em><b>Payment Gl Account Type Maps</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___PAYMENT_GL_ACCOUNT_TYPE_MAPS = eINSTANCE.getParty__PaymentGlAccountTypeMaps();

		/**
		 * The meta object literal for the '<em><b>Payment Methods</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___PAYMENT_METHODS = eINSTANCE.getParty__PaymentMethods();

		/**
		 * The meta object literal for the '<em><b>Performed By Fin Account Transs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___PERFORMED_BY_FIN_ACCOUNT_TRANSS = eINSTANCE.getParty__PerformedByFinAccountTranss();

		/**
		 * The meta object literal for the '<em><b>Product Promo Code Parties</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___PRODUCT_PROMO_CODE_PARTIES = eINSTANCE.getParty__ProductPromoCodeParties();

		/**
		 * The meta object literal for the '<em><b>Product Promo Uses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___PRODUCT_PROMO_USES = eINSTANCE.getParty__ProductPromoUses();

		/**
		 * The meta object literal for the '<em><b>Product Promos</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___PRODUCT_PROMOS = eINSTANCE.getParty__ProductPromos();

		/**
		 * The meta object literal for the '<em><b>Product Store Shipment Meths</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___PRODUCT_STORE_SHIPMENT_METHS = eINSTANCE.getParty__ProductStoreShipmentMeths();

		/**
		 * The meta object literal for the '<em><b>Product Stores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___PRODUCT_STORES = eINSTANCE.getParty__ProductStores();

		/**
		 * The meta object literal for the '<em><b>Quotes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___QUOTES = eINSTANCE.getParty__Quotes();

		/**
		 * The meta object literal for the '<em><b>Referred By Employment Apps</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___REFERRED_BY_EMPLOYMENT_APPS = eINSTANCE.getParty__ReferredByEmploymentApps();

		/**
		 * The meta object literal for the '<em><b>Reorder Guidelines</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___REORDER_GUIDELINES = eINSTANCE.getParty__ReorderGuidelines();

		/**
		 * The meta object literal for the '<em><b>Return Headers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___RETURN_HEADERS = eINSTANCE.getParty__ReturnHeaders();

		/**
		 * The meta object literal for the '<em><b>Shipment Cost Estimates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___SHIPMENT_COST_ESTIMATES = eINSTANCE.getParty__ShipmentCostEstimates();

		/**
		 * The meta object literal for the '<em><b>Shopping Lists</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___SHOPPING_LISTS = eINSTANCE.getParty__ShoppingLists();

		/**
		 * The meta object literal for the '<em><b>Subscriptions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___SUBSCRIPTIONS = eINSTANCE.getParty__Subscriptions();

		/**
		 * The meta object literal for the '<em><b>Supplier Order Item Ship Groups</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___SUPPLIER_ORDER_ITEM_SHIP_GROUPS = eINSTANCE.getParty__SupplierOrderItemShipGroups();

		/**
		 * The meta object literal for the '<em><b>Survey Responses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___SURVEY_RESPONSES = eINSTANCE.getParty__SurveyResponses();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Tax Authorities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___TAX_AUTH_TAX_AUTHORITIES = eINSTANCE.getParty__TaxAuthTaxAuthorities();

		/**
		 * The meta object literal for the '<em><b>Tax Authority Invoice Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___TAX_AUTHORITY_INVOICE_ITEMS = eINSTANCE.getParty__TaxAuthorityInvoiceItems();

		/**
		 * The meta object literal for the '<em><b>Time Entries</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___TIME_ENTRIES = eINSTANCE.getParty__TimeEntries();

		/**
		 * The meta object literal for the '<em><b>Timesheets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___TIMESHEETS = eINSTANCE.getParty__Timesheets();

		/**
		 * The meta object literal for the '<em><b>To Agreements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___TO_AGREEMENTS = eINSTANCE.getParty__ToAgreements();

		/**
		 * The meta object literal for the '<em><b>To Communication Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___TO_COMMUNICATION_EVENTS = eINSTANCE.getParty__ToCommunicationEvents();

		/**
		 * The meta object literal for the '<em><b>To Party Invitation Group Assocs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___TO_PARTY_INVITATION_GROUP_ASSOCS = eINSTANCE.getParty__ToPartyInvitationGroupAssocs();

		/**
		 * The meta object literal for the '<em><b>To Payments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___TO_PAYMENTS = eINSTANCE.getParty__ToPayments();

		/**
		 * The meta object literal for the '<em><b>To Return Headers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___TO_RETURN_HEADERS = eINSTANCE.getParty__ToReturnHeaders();

		/**
		 * The meta object literal for the '<em><b>To Shipments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___TO_SHIPMENTS = eINSTANCE.getParty__ToShipments();

		/**
		 * The meta object literal for the '<em><b>User Login Histories</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___USER_LOGIN_HISTORIES = eINSTANCE.getParty__UserLoginHistories();

		/**
		 * The meta object literal for the '<em><b>User Logins</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___USER_LOGINS = eINSTANCE.getParty__UserLogins();

		/**
		 * The meta object literal for the '<em><b>Vendor Order Item Ship Groups</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___VENDOR_ORDER_ITEM_SHIP_GROUPS = eINSTANCE.getParty__VendorOrderItemShipGroups();

		/**
		 * The meta object literal for the '<em><b>Work Effort Event Reminders</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY___WORK_EFFORT_EVENT_REMINDERS = eINSTANCE.getParty__WorkEffortEventReminders();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyAttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyAttributeImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyAttribute()
		 * @generated
		 */
		EClass PARTY_ATTRIBUTE = eINSTANCE.getPartyAttribute();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_ATTRIBUTE__PARTY_ID = eINSTANCE.getPartyAttribute_PartyId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_ATTRIBUTE__ATTR_NAME = eINSTANCE.getPartyAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getPartyAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getPartyAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyCarrierAccountImpl <em>Carrier Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyCarrierAccountImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyCarrierAccount()
		 * @generated
		 */
		EClass PARTY_CARRIER_ACCOUNT = eINSTANCE.getPartyCarrierAccount();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CARRIER_ACCOUNT__PARTY_ID = eINSTANCE.getPartyCarrierAccount_PartyId();

		/**
		 * The meta object literal for the '<em><b>Carrier Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CARRIER_ACCOUNT__CARRIER_PARTY_ID = eINSTANCE.getPartyCarrierAccount_CarrierPartyId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CARRIER_ACCOUNT__FROM_DATE = eINSTANCE.getPartyCarrierAccount_FromDate();

		/**
		 * The meta object literal for the '<em><b>Account Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CARRIER_ACCOUNT__ACCOUNT_NUMBER = eINSTANCE.getPartyCarrierAccount_AccountNumber();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CARRIER_ACCOUNT__THRU_DATE = eINSTANCE.getPartyCarrierAccount_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyClassificationImpl <em>Classification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyClassificationImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyClassification()
		 * @generated
		 */
		EClass PARTY_CLASSIFICATION = eINSTANCE.getPartyClassification();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CLASSIFICATION__PARTY_ID = eINSTANCE.getPartyClassification_PartyId();

		/**
		 * The meta object literal for the '<em><b>Party Classification Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CLASSIFICATION__PARTY_CLASSIFICATION_GROUP_ID = eINSTANCE.getPartyClassification_PartyClassificationGroupId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CLASSIFICATION__FROM_DATE = eINSTANCE.getPartyClassification_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CLASSIFICATION__THRU_DATE = eINSTANCE.getPartyClassification_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyClassificationGroupImpl <em>Classification Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyClassificationGroupImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyClassificationGroup()
		 * @generated
		 */
		EClass PARTY_CLASSIFICATION_GROUP = eINSTANCE.getPartyClassificationGroup();

		/**
		 * The meta object literal for the '<em><b>Party Classification Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_GROUP_ID = eINSTANCE.getPartyClassificationGroup_PartyClassificationGroupId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CLASSIFICATION_GROUP__DESCRIPTION = eINSTANCE.getPartyClassificationGroup_Description();

		/**
		 * The meta object literal for the '<em><b>Parent Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CLASSIFICATION_GROUP__PARENT_GROUP_ID = eINSTANCE.getPartyClassificationGroup_ParentGroupId();

		/**
		 * The meta object literal for the '<em><b>Party Classification Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CLASSIFICATION_GROUP__PARTY_CLASSIFICATION_TYPE_ID = eINSTANCE.getPartyClassificationGroup_PartyClassificationTypeId();

		/**
		 * The meta object literal for the '<em><b>Child Party Classification Groups</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY_CLASSIFICATION_GROUP___CHILD_PARTY_CLASSIFICATION_GROUPS = eINSTANCE.getPartyClassificationGroup__ChildPartyClassificationGroups();

		/**
		 * The meta object literal for the '<em><b>Segment Group Classifications</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY_CLASSIFICATION_GROUP___SEGMENT_GROUP_CLASSIFICATIONS = eINSTANCE.getPartyClassificationGroup__SegmentGroupClassifications();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyClassificationTypeImpl <em>Classification Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyClassificationTypeImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyClassificationType()
		 * @generated
		 */
		EClass PARTY_CLASSIFICATION_TYPE = eINSTANCE.getPartyClassificationType();

		/**
		 * The meta object literal for the '<em><b>Party Classification Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CLASSIFICATION_TYPE__PARTY_CLASSIFICATION_TYPE_ID = eINSTANCE.getPartyClassificationType_PartyClassificationTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CLASSIFICATION_TYPE__DESCRIPTION = eINSTANCE.getPartyClassificationType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CLASSIFICATION_TYPE__HAS_TABLE = eINSTANCE.getPartyClassificationType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CLASSIFICATION_TYPE__PARENT_TYPE_ID = eINSTANCE.getPartyClassificationType_ParentTypeId();

		/**
		 * The meta object literal for the '<em><b>Child Party Classification Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY_CLASSIFICATION_TYPE___CHILD_PARTY_CLASSIFICATION_TYPES = eINSTANCE.getPartyClassificationType__ChildPartyClassificationTypes();

		/**
		 * The meta object literal for the '<em><b>Party Classification Groups</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY_CLASSIFICATION_TYPE___PARTY_CLASSIFICATION_GROUPS = eINSTANCE.getPartyClassificationType__PartyClassificationGroups();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyContentImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyContent()
		 * @generated
		 */
		EClass PARTY_CONTENT = eINSTANCE.getPartyContent();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CONTENT__PARTY_ID = eINSTANCE.getPartyContent_PartyId();

		/**
		 * The meta object literal for the '<em><b>Content Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CONTENT__CONTENT_ID = eINSTANCE.getPartyContent_ContentId();

		/**
		 * The meta object literal for the '<em><b>Party Content Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CONTENT__PARTY_CONTENT_TYPE_ID = eINSTANCE.getPartyContent_PartyContentTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CONTENT__FROM_DATE = eINSTANCE.getPartyContent_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CONTENT__THRU_DATE = eINSTANCE.getPartyContent_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyContentTypeImpl <em>Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyContentTypeImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyContentType()
		 * @generated
		 */
		EClass PARTY_CONTENT_TYPE = eINSTANCE.getPartyContentType();

		/**
		 * The meta object literal for the '<em><b>Party Content Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CONTENT_TYPE__PARTY_CONTENT_TYPE_ID = eINSTANCE.getPartyContentType_PartyContentTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CONTENT_TYPE__DESCRIPTION = eINSTANCE.getPartyContentType_Description();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CONTENT_TYPE__PARENT_TYPE_ID = eINSTANCE.getPartyContentType_ParentTypeId();

		/**
		 * The meta object literal for the '<em><b>Child Party Content Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY_CONTENT_TYPE___CHILD_PARTY_CONTENT_TYPES = eINSTANCE.getPartyContentType__ChildPartyContentTypes();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyDataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyDataSourceImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyDataSource()
		 * @generated
		 */
		EClass PARTY_DATA_SOURCE = eINSTANCE.getPartyDataSource();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_DATA_SOURCE__PARTY_ID = eINSTANCE.getPartyDataSource_PartyId();

		/**
		 * The meta object literal for the '<em><b>Data Source Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_DATA_SOURCE__DATA_SOURCE_ID = eINSTANCE.getPartyDataSource_DataSourceId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_DATA_SOURCE__FROM_DATE = eINSTANCE.getPartyDataSource_FromDate();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_DATA_SOURCE__COMMENTS = eINSTANCE.getPartyDataSource_Comments();

		/**
		 * The meta object literal for the '<em><b>Is Create</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_DATA_SOURCE__IS_CREATE = eINSTANCE.getPartyDataSource_IsCreate();

		/**
		 * The meta object literal for the '<em><b>Visit Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_DATA_SOURCE__VISIT_ID = eINSTANCE.getPartyDataSource_VisitId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyGeoPointImpl <em>Geo Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyGeoPointImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyGeoPoint()
		 * @generated
		 */
		EClass PARTY_GEO_POINT = eINSTANCE.getPartyGeoPoint();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_GEO_POINT__PARTY_ID = eINSTANCE.getPartyGeoPoint_PartyId();

		/**
		 * The meta object literal for the '<em><b>Geo Point Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_GEO_POINT__GEO_POINT_ID = eINSTANCE.getPartyGeoPoint_GeoPointId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_GEO_POINT__FROM_DATE = eINSTANCE.getPartyGeoPoint_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_GEO_POINT__THRU_DATE = eINSTANCE.getPartyGeoPoint_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyGroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyGroupImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyGroup()
		 * @generated
		 */
		EClass PARTY_GROUP = eINSTANCE.getPartyGroup();

		/**
		 * The meta object literal for the '<em><b>Annual Revenue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_GROUP__ANNUAL_REVENUE = eINSTANCE.getPartyGroup_AnnualRevenue();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_GROUP__COMMENTS = eINSTANCE.getPartyGroup_Comments();

		/**
		 * The meta object literal for the '<em><b>Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_GROUP__GROUP_NAME = eINSTANCE.getPartyGroup_GroupName();

		/**
		 * The meta object literal for the '<em><b>Group Name Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_GROUP__GROUP_NAME_LOCAL = eINSTANCE.getPartyGroup_GroupNameLocal();

		/**
		 * The meta object literal for the '<em><b>Logo Image Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_GROUP__LOGO_IMAGE_URL = eINSTANCE.getPartyGroup_LogoImageUrl();

		/**
		 * The meta object literal for the '<em><b>Num Employees</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_GROUP__NUM_EMPLOYEES = eINSTANCE.getPartyGroup_NumEmployees();

		/**
		 * The meta object literal for the '<em><b>Office Site Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_GROUP__OFFICE_SITE_NAME = eINSTANCE.getPartyGroup_OfficeSiteName();

		/**
		 * The meta object literal for the '<em><b>Ticker Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_GROUP__TICKER_SYMBOL = eINSTANCE.getPartyGroup_TickerSymbol();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyIcsAvsOverrideImpl <em>Ics Avs Override</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyIcsAvsOverrideImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyIcsAvsOverride()
		 * @generated
		 */
		EClass PARTY_ICS_AVS_OVERRIDE = eINSTANCE.getPartyIcsAvsOverride();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_ICS_AVS_OVERRIDE__PARTY_ID = eINSTANCE.getPartyIcsAvsOverride_PartyId();

		/**
		 * The meta object literal for the '<em><b>Avs Decline String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_ICS_AVS_OVERRIDE__AVS_DECLINE_STRING = eINSTANCE.getPartyIcsAvsOverride_AvsDeclineString();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyIdentificationImpl <em>Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyIdentificationImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyIdentification()
		 * @generated
		 */
		EClass PARTY_IDENTIFICATION = eINSTANCE.getPartyIdentification();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_IDENTIFICATION__PARTY_ID = eINSTANCE.getPartyIdentification_PartyId();

		/**
		 * The meta object literal for the '<em><b>Party Identification Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_IDENTIFICATION__PARTY_IDENTIFICATION_TYPE_ID = eINSTANCE.getPartyIdentification_PartyIdentificationTypeId();

		/**
		 * The meta object literal for the '<em><b>Id Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_IDENTIFICATION__ID_VALUE = eINSTANCE.getPartyIdentification_IdValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyIdentificationTypeImpl <em>Identification Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyIdentificationTypeImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyIdentificationType()
		 * @generated
		 */
		EClass PARTY_IDENTIFICATION_TYPE = eINSTANCE.getPartyIdentificationType();

		/**
		 * The meta object literal for the '<em><b>Party Identification Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_IDENTIFICATION_TYPE__PARTY_IDENTIFICATION_TYPE_ID = eINSTANCE.getPartyIdentificationType_PartyIdentificationTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_IDENTIFICATION_TYPE__DESCRIPTION = eINSTANCE.getPartyIdentificationType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_IDENTIFICATION_TYPE__HAS_TABLE = eINSTANCE.getPartyIdentificationType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_IDENTIFICATION_TYPE__PARENT_TYPE_ID = eINSTANCE.getPartyIdentificationType_ParentTypeId();

		/**
		 * The meta object literal for the '<em><b>Child Party Identification Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY_IDENTIFICATION_TYPE___CHILD_PARTY_IDENTIFICATION_TYPES = eINSTANCE.getPartyIdentificationType__ChildPartyIdentificationTypes();

		/**
		 * The meta object literal for the '<em><b>Party Identifications</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY_IDENTIFICATION_TYPE___PARTY_IDENTIFICATIONS = eINSTANCE.getPartyIdentificationType__PartyIdentifications();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationImpl <em>Invitation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyInvitationImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyInvitation()
		 * @generated
		 */
		EClass PARTY_INVITATION = eINSTANCE.getPartyInvitation();

		/**
		 * The meta object literal for the '<em><b>Party Invitation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_INVITATION__PARTY_INVITATION_ID = eINSTANCE.getPartyInvitation_PartyInvitationId();

		/**
		 * The meta object literal for the '<em><b>Email Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_INVITATION__EMAIL_ADDRESS = eINSTANCE.getPartyInvitation_EmailAddress();

		/**
		 * The meta object literal for the '<em><b>Last Invite Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_INVITATION__LAST_INVITE_DATE = eINSTANCE.getPartyInvitation_LastInviteDate();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_INVITATION__PARTY_ID = eINSTANCE.getPartyInvitation_PartyId();

		/**
		 * The meta object literal for the '<em><b>Party Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_INVITATION__PARTY_ID_FROM = eINSTANCE.getPartyInvitation_PartyIdFrom();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_INVITATION__STATUS_ID = eINSTANCE.getPartyInvitation_StatusId();

		/**
		 * The meta object literal for the '<em><b>To Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_INVITATION__TO_NAME = eINSTANCE.getPartyInvitation_ToName();

		/**
		 * The meta object literal for the '<em><b>Party Invitation Group Assocs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_INVITATION__PARTY_INVITATION_GROUP_ASSOCS = eINSTANCE.getPartyInvitation_PartyInvitationGroupAssocs();

		/**
		 * The meta object literal for the '<em><b>Party Invitation Role Assocs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_INVITATION__PARTY_INVITATION_ROLE_ASSOCS = eINSTANCE.getPartyInvitation_PartyInvitationRoleAssocs();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationGroupAssocImpl <em>Invitation Group Assoc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyInvitationGroupAssocImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyInvitationGroupAssoc()
		 * @generated
		 */
		EClass PARTY_INVITATION_GROUP_ASSOC = eINSTANCE.getPartyInvitationGroupAssoc();

		/**
		 * The meta object literal for the '<em><b>Party Invitation Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_INVITATION_GROUP_ASSOC__PARTY_INVITATION_ID = eINSTANCE.getPartyInvitationGroupAssoc_PartyInvitationId();

		/**
		 * The meta object literal for the '<em><b>Party Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_INVITATION_GROUP_ASSOC__PARTY_ID_TO = eINSTANCE.getPartyInvitationGroupAssoc_PartyIdTo();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyInvitationRoleAssocImpl <em>Invitation Role Assoc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyInvitationRoleAssocImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyInvitationRoleAssoc()
		 * @generated
		 */
		EClass PARTY_INVITATION_ROLE_ASSOC = eINSTANCE.getPartyInvitationRoleAssoc();

		/**
		 * The meta object literal for the '<em><b>Party Invitation Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_INVITATION_ROLE_ASSOC__PARTY_INVITATION_ID = eINSTANCE.getPartyInvitationRoleAssoc_PartyInvitationId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_INVITATION_ROLE_ASSOC__ROLE_TYPE_ID = eINSTANCE.getPartyInvitationRoleAssoc_RoleTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyNameHistoryImpl <em>Name History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyNameHistoryImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyNameHistory()
		 * @generated
		 */
		EClass PARTY_NAME_HISTORY = eINSTANCE.getPartyNameHistory();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_NAME_HISTORY__PARTY_ID = eINSTANCE.getPartyNameHistory_PartyId();

		/**
		 * The meta object literal for the '<em><b>Change Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_NAME_HISTORY__CHANGE_DATE = eINSTANCE.getPartyNameHistory_ChangeDate();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_NAME_HISTORY__FIRST_NAME = eINSTANCE.getPartyNameHistory_FirstName();

		/**
		 * The meta object literal for the '<em><b>Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_NAME_HISTORY__GROUP_NAME = eINSTANCE.getPartyNameHistory_GroupName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_NAME_HISTORY__LAST_NAME = eINSTANCE.getPartyNameHistory_LastName();

		/**
		 * The meta object literal for the '<em><b>Middle Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_NAME_HISTORY__MIDDLE_NAME = eINSTANCE.getPartyNameHistory_MiddleName();

		/**
		 * The meta object literal for the '<em><b>Personal Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_NAME_HISTORY__PERSONAL_TITLE = eINSTANCE.getPartyNameHistory_PersonalTitle();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_NAME_HISTORY__SUFFIX = eINSTANCE.getPartyNameHistory_Suffix();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyNoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyNoteImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyNote()
		 * @generated
		 */
		EClass PARTY_NOTE = eINSTANCE.getPartyNote();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_NOTE__PARTY_ID = eINSTANCE.getPartyNote_PartyId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyProfileDefaultImpl <em>Profile Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyProfileDefaultImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyProfileDefault()
		 * @generated
		 */
		EClass PARTY_PROFILE_DEFAULT = eINSTANCE.getPartyProfileDefault();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_PROFILE_DEFAULT__PARTY_ID = eINSTANCE.getPartyProfileDefault_PartyId();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_PROFILE_DEFAULT__PRODUCT_STORE_ID = eINSTANCE.getPartyProfileDefault_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Default Bill Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_PROFILE_DEFAULT__DEFAULT_BILL_ADDR = eINSTANCE.getPartyProfileDefault_DefaultBillAddr();

		/**
		 * The meta object literal for the '<em><b>Default Pay Meth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_PROFILE_DEFAULT__DEFAULT_PAY_METH = eINSTANCE.getPartyProfileDefault_DefaultPayMeth();

		/**
		 * The meta object literal for the '<em><b>Default Ship Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_ADDR = eINSTANCE.getPartyProfileDefault_DefaultShipAddr();

		/**
		 * The meta object literal for the '<em><b>Default Ship Meth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_PROFILE_DEFAULT__DEFAULT_SHIP_METH = eINSTANCE.getPartyProfileDefault_DefaultShipMeth();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyRelationshipImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyRelationship()
		 * @generated
		 */
		EClass PARTY_RELATIONSHIP = eINSTANCE.getPartyRelationship();

		/**
		 * The meta object literal for the '<em><b>Party Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RELATIONSHIP__PARTY_ID_FROM = eINSTANCE.getPartyRelationship_PartyIdFrom();

		/**
		 * The meta object literal for the '<em><b>Party Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RELATIONSHIP__PARTY_ID_TO = eINSTANCE.getPartyRelationship_PartyIdTo();

		/**
		 * The meta object literal for the '<em><b>Role Type Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RELATIONSHIP__ROLE_TYPE_ID_FROM = eINSTANCE.getPartyRelationship_RoleTypeIdFrom();

		/**
		 * The meta object literal for the '<em><b>Role Type Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RELATIONSHIP__ROLE_TYPE_ID_TO = eINSTANCE.getPartyRelationship_RoleTypeIdTo();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RELATIONSHIP__FROM_DATE = eINSTANCE.getPartyRelationship_FromDate();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RELATIONSHIP__COMMENTS = eINSTANCE.getPartyRelationship_Comments();

		/**
		 * The meta object literal for the '<em><b>Party Relationship Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RELATIONSHIP__PARTY_RELATIONSHIP_TYPE_ID = eINSTANCE.getPartyRelationship_PartyRelationshipTypeId();

		/**
		 * The meta object literal for the '<em><b>Permissions Enum Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RELATIONSHIP__PERMISSIONS_ENUM_ID = eINSTANCE.getPartyRelationship_PermissionsEnumId();

		/**
		 * The meta object literal for the '<em><b>Position Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RELATIONSHIP__POSITION_TITLE = eINSTANCE.getPartyRelationship_PositionTitle();

		/**
		 * The meta object literal for the '<em><b>Priority Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RELATIONSHIP__PRIORITY_TYPE_ID = eINSTANCE.getPartyRelationship_PriorityTypeId();

		/**
		 * The meta object literal for the '<em><b>Relationship Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RELATIONSHIP__RELATIONSHIP_NAME = eINSTANCE.getPartyRelationship_RelationshipName();

		/**
		 * The meta object literal for the '<em><b>Security Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RELATIONSHIP__SECURITY_GROUP_ID = eINSTANCE.getPartyRelationship_SecurityGroupId();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RELATIONSHIP__STATUS_ID = eINSTANCE.getPartyRelationship_StatusId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RELATIONSHIP__THRU_DATE = eINSTANCE.getPartyRelationship_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyRelationshipTypeImpl <em>Relationship Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyRelationshipTypeImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyRelationshipType()
		 * @generated
		 */
		EClass PARTY_RELATIONSHIP_TYPE = eINSTANCE.getPartyRelationshipType();

		/**
		 * The meta object literal for the '<em><b>Party Relationship Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_TYPE_ID = eINSTANCE.getPartyRelationshipType_PartyRelationshipTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RELATIONSHIP_TYPE__DESCRIPTION = eINSTANCE.getPartyRelationshipType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RELATIONSHIP_TYPE__HAS_TABLE = eINSTANCE.getPartyRelationshipType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RELATIONSHIP_TYPE__PARENT_TYPE_ID = eINSTANCE.getPartyRelationshipType_ParentTypeId();

		/**
		 * The meta object literal for the '<em><b>Party Relationship Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_RELATIONSHIP_TYPE__PARTY_RELATIONSHIP_NAME = eINSTANCE.getPartyRelationshipType_PartyRelationshipName();

		/**
		 * The meta object literal for the '<em><b>Role Type Id Valid From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_FROM = eINSTANCE.getPartyRelationshipType_RoleTypeIdValidFrom();

		/**
		 * The meta object literal for the '<em><b>Role Type Id Valid To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_RELATIONSHIP_TYPE__ROLE_TYPE_ID_VALID_TO = eINSTANCE.getPartyRelationshipType_RoleTypeIdValidTo();

		/**
		 * The meta object literal for the '<em><b>Child Party Relationship Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY_RELATIONSHIP_TYPE___CHILD_PARTY_RELATIONSHIP_TYPES = eINSTANCE.getPartyRelationshipType__ChildPartyRelationshipTypes();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyRoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyRoleImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyRole()
		 * @generated
		 */
		EClass PARTY_ROLE = eINSTANCE.getPartyRole();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_ROLE__PARTY_ID = eINSTANCE.getPartyRole_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_ROLE__ROLE_TYPE_ID = eINSTANCE.getPartyRole_RoleTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyStatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyStatusImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyStatus()
		 * @generated
		 */
		EClass PARTY_STATUS = eINSTANCE.getPartyStatus();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_STATUS__STATUS_ID = eINSTANCE.getPartyStatus_StatusId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_STATUS__PARTY_ID = eINSTANCE.getPartyStatus_PartyId();

		/**
		 * The meta object literal for the '<em><b>Status Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_STATUS__STATUS_DATE = eINSTANCE.getPartyStatus_StatusDate();

		/**
		 * The meta object literal for the '<em><b>Change By User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_STATUS__CHANGE_BY_USER_LOGIN_ID = eINSTANCE.getPartyStatus_ChangeByUserLoginId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyTypeImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyType()
		 * @generated
		 */
		EClass PARTY_TYPE = eINSTANCE.getPartyType();

		/**
		 * The meta object literal for the '<em><b>Party Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_TYPE__PARTY_TYPE_ID = eINSTANCE.getPartyType_PartyTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_TYPE__DESCRIPTION = eINSTANCE.getPartyType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_TYPE__HAS_TABLE = eINSTANCE.getPartyType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_TYPE__PARENT_TYPE_ID = eINSTANCE.getPartyType_ParentTypeId();

		/**
		 * The meta object literal for the '<em><b>Party Type Attrs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_TYPE__PARTY_TYPE_ATTRS = eINSTANCE.getPartyType_PartyTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Child Party Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY_TYPE___CHILD_PARTY_TYPES = eINSTANCE.getPartyType__ChildPartyTypes();

		/**
		 * The meta object literal for the '<em><b>Parties</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARTY_TYPE___PARTIES = eINSTANCE.getPartyType__Parties();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PartyTypeAttrImpl <em>Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PartyTypeAttrImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPartyTypeAttr()
		 * @generated
		 */
		EClass PARTY_TYPE_ATTR = eINSTANCE.getPartyTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Party Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_TYPE_ATTR__PARTY_TYPE_ID = eINSTANCE.getPartyTypeAttr_PartyTypeId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_TYPE_ATTR__ATTR_NAME = eINSTANCE.getPartyTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_TYPE_ATTR__DESCRIPTION = eINSTANCE.getPartyTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PersonImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Birth Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__BIRTH_DATE = eINSTANCE.getPerson_BirthDate();

		/**
		 * The meta object literal for the '<em><b>Card Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__CARD_ID = eINSTANCE.getPerson_CardId();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__COMMENTS = eINSTANCE.getPerson_Comments();

		/**
		 * The meta object literal for the '<em><b>Deceased Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__DECEASED_DATE = eINSTANCE.getPerson_DeceasedDate();

		/**
		 * The meta object literal for the '<em><b>Employment Status Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__EMPLOYMENT_STATUS_ENUM_ID = eINSTANCE.getPerson_EmploymentStatusEnumId();

		/**
		 * The meta object literal for the '<em><b>Existing Customer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__EXISTING_CUSTOMER = eINSTANCE.getPerson_ExistingCustomer();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>First Name Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME_LOCAL = eINSTANCE.getPerson_FirstNameLocal();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__GENDER = eINSTANCE.getPerson_Gender();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__HEIGHT = eINSTANCE.getPerson_Height();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

		/**
		 * The meta object literal for the '<em><b>Last Name Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LAST_NAME_LOCAL = eINSTANCE.getPerson_LastNameLocal();

		/**
		 * The meta object literal for the '<em><b>Marital Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__MARITAL_STATUS = eINSTANCE.getPerson_MaritalStatus();

		/**
		 * The meta object literal for the '<em><b>Member Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__MEMBER_ID = eINSTANCE.getPerson_MemberId();

		/**
		 * The meta object literal for the '<em><b>Middle Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__MIDDLE_NAME = eINSTANCE.getPerson_MiddleName();

		/**
		 * The meta object literal for the '<em><b>Middle Name Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__MIDDLE_NAME_LOCAL = eINSTANCE.getPerson_MiddleNameLocal();

		/**
		 * The meta object literal for the '<em><b>Months With Employer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__MONTHS_WITH_EMPLOYER = eINSTANCE.getPerson_MonthsWithEmployer();

		/**
		 * The meta object literal for the '<em><b>Mothers Maiden Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__MOTHERS_MAIDEN_NAME = eINSTANCE.getPerson_MothersMaidenName();

		/**
		 * The meta object literal for the '<em><b>Nickname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NICKNAME = eINSTANCE.getPerson_Nickname();

		/**
		 * The meta object literal for the '<em><b>Occupation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__OCCUPATION = eINSTANCE.getPerson_Occupation();

		/**
		 * The meta object literal for the '<em><b>Other Local</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__OTHER_LOCAL = eINSTANCE.getPerson_OtherLocal();

		/**
		 * The meta object literal for the '<em><b>Passport Expire Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PASSPORT_EXPIRE_DATE = eINSTANCE.getPerson_PassportExpireDate();

		/**
		 * The meta object literal for the '<em><b>Passport Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PASSPORT_NUMBER = eINSTANCE.getPerson_PassportNumber();

		/**
		 * The meta object literal for the '<em><b>Personal Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__PERSONAL_TITLE = eINSTANCE.getPerson_PersonalTitle();

		/**
		 * The meta object literal for the '<em><b>Residence Status Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__RESIDENCE_STATUS_ENUM_ID = eINSTANCE.getPerson_ResidenceStatusEnumId();

		/**
		 * The meta object literal for the '<em><b>Salutation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SALUTATION = eINSTANCE.getPerson_Salutation();

		/**
		 * The meta object literal for the '<em><b>Social Security Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SOCIAL_SECURITY_NUMBER = eINSTANCE.getPerson_SocialSecurityNumber();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SUFFIX = eINSTANCE.getPerson_Suffix();

		/**
		 * The meta object literal for the '<em><b>Total Years Work Experience</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__TOTAL_YEARS_WORK_EXPERIENCE = eINSTANCE.getPerson_TotalYearsWorkExperience();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__WEIGHT = eINSTANCE.getPerson_Weight();

		/**
		 * The meta object literal for the '<em><b>Years With Employer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__YEARS_WITH_EMPLOYER = eINSTANCE.getPerson_YearsWithEmployer();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.PriorityTypeImpl <em>Priority Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.PriorityTypeImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getPriorityType()
		 * @generated
		 */
		EClass PRIORITY_TYPE = eINSTANCE.getPriorityType();

		/**
		 * The meta object literal for the '<em><b>Priority Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIORITY_TYPE__PRIORITY_TYPE_ID = eINSTANCE.getPriorityType_PriorityTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIORITY_TYPE__DESCRIPTION = eINSTANCE.getPriorityType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.RoleTypeImpl <em>Role Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.RoleTypeImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getRoleType()
		 * @generated
		 */
		EClass ROLE_TYPE = eINSTANCE.getRoleType();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_TYPE__ROLE_TYPE_ID = eINSTANCE.getRoleType_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_TYPE__DESCRIPTION = eINSTANCE.getRoleType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_TYPE__HAS_TABLE = eINSTANCE.getRoleType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_TYPE__PARENT_TYPE_ID = eINSTANCE.getRoleType_ParentTypeId();

		/**
		 * The meta object literal for the '<em><b>Role Type Attrs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_TYPE__ROLE_TYPE_ATTRS = eINSTANCE.getRoleType_RoleTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Valid Contact Mech Roles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_TYPE__VALID_CONTACT_MECH_ROLES = eINSTANCE.getRoleType_ValidContactMechRoles();

		/**
		 * The meta object literal for the '<em><b>Acctg Trans Entries</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE_TYPE___ACCTG_TRANS_ENTRIES = eINSTANCE.getRoleType__AcctgTransEntries();

		/**
		 * The meta object literal for the '<em><b>Acctg Transs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE_TYPE___ACCTG_TRANSS = eINSTANCE.getRoleType__AcctgTranss();

		/**
		 * The meta object literal for the '<em><b>Child Role Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE_TYPE___CHILD_ROLE_TYPES = eINSTANCE.getRoleType__ChildRoleTypes();

		/**
		 * The meta object literal for the '<em><b>Content Approvals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE_TYPE___CONTENT_APPROVALS = eINSTANCE.getRoleType__ContentApprovals();

		/**
		 * The meta object literal for the '<em><b>Fixed Assets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE_TYPE___FIXED_ASSETS = eINSTANCE.getRoleType__FixedAssets();

		/**
		 * The meta object literal for the '<em><b>From Agreements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE_TYPE___FROM_AGREEMENTS = eINSTANCE.getRoleType__FromAgreements();

		/**
		 * The meta object literal for the '<em><b>From Communication Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE_TYPE___FROM_COMMUNICATION_EVENTS = eINSTANCE.getRoleType__FromCommunicationEvents();

		/**
		 * The meta object literal for the '<em><b>Gl Account Organizations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE_TYPE___GL_ACCOUNT_ORGANIZATIONS = eINSTANCE.getRoleType__GlAccountOrganizations();

		/**
		 * The meta object literal for the '<em><b>Invoices</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE_TYPE___INVOICES = eINSTANCE.getRoleType__Invoices();

		/**
		 * The meta object literal for the '<em><b>Originated From Subscriptions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE_TYPE___ORIGINATED_FROM_SUBSCRIPTIONS = eINSTANCE.getRoleType__OriginatedFromSubscriptions();

		/**
		 * The meta object literal for the '<em><b>Party Invitation Role Assocs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE_TYPE___PARTY_INVITATION_ROLE_ASSOCS = eINSTANCE.getRoleType__PartyInvitationRoleAssocs();

		/**
		 * The meta object literal for the '<em><b>Party Roles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE_TYPE___PARTY_ROLES = eINSTANCE.getRoleType__PartyRoles();

		/**
		 * The meta object literal for the '<em><b>Shipment Cost Estimates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE_TYPE___SHIPMENT_COST_ESTIMATES = eINSTANCE.getRoleType__ShipmentCostEstimates();

		/**
		 * The meta object literal for the '<em><b>Subscriptions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE_TYPE___SUBSCRIPTIONS = eINSTANCE.getRoleType__Subscriptions();

		/**
		 * The meta object literal for the '<em><b>To Agreements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE_TYPE___TO_AGREEMENTS = eINSTANCE.getRoleType__ToAgreements();

		/**
		 * The meta object literal for the '<em><b>To Communication Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE_TYPE___TO_COMMUNICATION_EVENTS = eINSTANCE.getRoleType__ToCommunicationEvents();

		/**
		 * The meta object literal for the '<em><b>To Payments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE_TYPE___TO_PAYMENTS = eINSTANCE.getRoleType__ToPayments();

		/**
		 * The meta object literal for the '<em><b>Valid From Party Relationship Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE_TYPE___VALID_FROM_PARTY_RELATIONSHIP_TYPES = eINSTANCE.getRoleType__ValidFromPartyRelationshipTypes();

		/**
		 * The meta object literal for the '<em><b>Valid To Party Relationship Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE_TYPE___VALID_TO_PARTY_RELATIONSHIP_TYPES = eINSTANCE.getRoleType__ValidToPartyRelationshipTypes();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.RoleTypeAttrImpl <em>Role Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.RoleTypeAttrImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getRoleTypeAttr()
		 * @generated
		 */
		EClass ROLE_TYPE_ATTR = eINSTANCE.getRoleTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_TYPE_ATTR__ROLE_TYPE_ID = eINSTANCE.getRoleTypeAttr_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_TYPE_ATTR__ATTR_NAME = eINSTANCE.getRoleTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_TYPE_ATTR__DESCRIPTION = eINSTANCE.getRoleTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.VendorImpl <em>Vendor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.VendorImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getVendor()
		 * @generated
		 */
		EClass VENDOR = eINSTANCE.getVendor();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDOR__PARTY_ID = eINSTANCE.getVendor_PartyId();

		/**
		 * The meta object literal for the '<em><b>Manifest Company Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR__MANIFEST_COMPANY_NAME = eINSTANCE.getVendor_ManifestCompanyName();

		/**
		 * The meta object literal for the '<em><b>Manifest Company Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR__MANIFEST_COMPANY_TITLE = eINSTANCE.getVendor_ManifestCompanyTitle();

		/**
		 * The meta object literal for the '<em><b>Manifest Logo Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR__MANIFEST_LOGO_URL = eINSTANCE.getVendor_ManifestLogoUrl();

		/**
		 * The meta object literal for the '<em><b>Manifest Policies</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VENDOR__MANIFEST_POLICIES = eINSTANCE.getVendor_ManifestPolicies();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.party.impl.WebSiteRoleImpl <em>Web Site Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.party.impl.WebSiteRoleImpl
		 * @see org.abchip.mimo.biz.party.party.impl.PartyPackageImpl#getWebSiteRole()
		 * @generated
		 */
		EClass WEB_SITE_ROLE = eINSTANCE.getWebSiteRole();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE_ROLE__PARTY_ID = eINSTANCE.getWebSiteRole_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE_ROLE__ROLE_TYPE_ID = eINSTANCE.getWebSiteRole_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Web Site Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE_ROLE__WEB_SITE_ID = eINSTANCE.getWebSiteRole_WebSiteId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_ROLE__FROM_DATE = eINSTANCE.getWebSiteRole_FromDate();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_ROLE__SEQUENCE_NUM = eINSTANCE.getWebSiteRole_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_ROLE__THRU_DATE = eINSTANCE.getWebSiteRole_ThruDate();

	}

} //PartyPackage
