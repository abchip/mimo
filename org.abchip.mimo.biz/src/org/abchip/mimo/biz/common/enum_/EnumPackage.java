/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.enum_;

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
 * @see org.abchip.mimo.biz.common.enum_.EnumFactory
 * @model kind="package"
 * @generated
 */
public interface EnumPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "enum";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/common/enum";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-enum";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnumPackage eINSTANCE = org.abchip.mimo.biz.common.enum_.impl.EnumPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.enum_.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.enum_.impl.EnumerationImpl
	 * @see org.abchip.mimo.biz.common.enum_.impl.EnumPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ENUM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enum Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ENUM_CODE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequence Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__SEQUENCE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Enum Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ENUM_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>User Login Security Questions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__USER_LOGIN_SECURITY_QUESTIONS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___ISA = BizPackage.BIZ_ENTITY_TYPED___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___GET_NAME = BizPackage.BIZ_ENTITY_TYPED___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___GET_URI = BizPackage.BIZ_ENTITY_TYPED___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___IS_PROXY = BizPackage.BIZ_ENTITY_TYPED___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___GET_TYPE = BizPackage.BIZ_ENTITY_TYPED___GET_TYPE;

	/**
	 * The operation id for the '<em>Class Fixed Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___CLASS_FIXED_ASSETS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Cogs Party Acctg Preferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___COGS_PARTY_ACCTG_PREFERENCES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Communication Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___COMMUNICATION_EVENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Default Sales Channel Product Stores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___DEFAULT_SALES_CHANNEL_PRODUCT_STORES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Email Template Settings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___EMAIL_TEMPLATE_SETTINGS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Employment Status Persons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___EMPLOYMENT_STATUS_PERSONS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Exam Type Job Requisitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___EXAM_TYPE_JOB_REQUISITIONS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Geo Point Type Geo Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___GEO_POINT_TYPE_GEO_POINTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Gift Card Fulfillments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___GIFT_CARD_FULFILLMENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Input Param Product Price Conds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___INPUT_PARAM_PRODUCT_PRICE_CONDS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Invoice Sequence Party Acctg Preferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___INVOICE_SEQUENCE_PARTY_ACCTG_PREFERENCES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Job Interviews</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___JOB_INTERVIEWS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Job Posting Type Job Requisitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___JOB_POSTING_TYPE_JOB_REQUISITIONS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Operator Product Price Conds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___OPERATOR_PRODUCT_PRICE_CONDS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Order Item Changes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___ORDER_ITEM_CHANGES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Order Notifications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___ORDER_NOTIFICATIONS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Order Sequence Party Acctg Preferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___ORDER_SEQUENCE_PARTY_ACCTG_PREFERENCES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Privilege Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___PRIVILEGE_CONTENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Product Geos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___PRODUCT_GEOS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Product Store Email Settings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___PRODUCT_STORE_EMAIL_SETTINGS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Quote Sequence Party Acctg Preferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___QUOTE_SEQUENCE_PARTY_ACCTG_PREFERENCES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Rating Products</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___RATING_PRODUCTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Reason Fin Account Transs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___REASON_FIN_ACCOUNT_TRANSS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Reason Inventory Item Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___REASON_INVENTORY_ITEM_DETAILS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Reason Job Manager Locks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___REASON_JOB_MANAGER_LOCKS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Reason Order Item Changes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___REASON_ORDER_ITEM_CHANGES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Relationship Keyword Thesauruss</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___RELATIONSHIP_KEYWORD_THESAURUSS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Replenish Fin Account Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___REPLENISH_FIN_ACCOUNT_TYPES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Replenish Method Product Store Fin Act Settings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___REPLENISH_METHOD_PRODUCT_STORE_FIN_ACT_SETTINGS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Requirement Method Product Facilities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___REQUIREMENT_METHOD_PRODUCT_FACILITIES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Requirement Method Product Stores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___REQUIREMENT_METHOD_PRODUCT_STORES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Requirement Method Products</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___REQUIREMENT_METHOD_PRODUCTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Reserve Order Product Stores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___RESERVE_ORDER_PRODUCT_STORES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Residence Status Persons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___RESIDENCE_STATUS_PERSONS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Sales Channel Cust Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___SALES_CHANNEL_CUST_REQUESTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Sales Channel Order Headers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___SALES_CHANNEL_ORDER_HEADERS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Sales Channel Quotes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___SALES_CHANNEL_QUOTES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Scope Work Efforts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___SCOPE_WORK_EFFORTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Service Type Payment Gateway Responses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___SERVICE_TYPE_PAYMENT_GATEWAY_RESPONSES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Store Credit Account Product Stores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___STORE_CREDIT_ACCOUNT_PRODUCT_STORES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Tax Form Party Acctg Preferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___TAX_FORM_PARTY_ACCTG_PREFERENCES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Tran Code Payment Gateway Responses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___TRAN_CODE_PAYMENT_GATEWAY_RESPONSES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Type Facility Locations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___TYPE_FACILITY_LOCATIONS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Type Sales Opportunities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___TYPE_SALES_OPPORTUNITIES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Virtual Variant Method Products</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___VIRTUAL_VARIANT_METHOD_PRODUCTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 44;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 45;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.enum_.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.enum_.impl.EnumerationTypeImpl
	 * @see org.abchip.mimo.biz.common.enum_.impl.EnumPackageImpl#getEnumerationType()
	 * @generated
	 */
	int ENUMERATION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Enum Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__ENUM_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;


	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE___ISA = BizPackage.BIZ_ENTITY_TYPE___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE___GET_NAME = BizPackage.BIZ_ENTITY_TYPE___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE___GET_URI = BizPackage.BIZ_ENTITY_TYPE___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE___IS_PROXY = BizPackage.BIZ_ENTITY_TYPE___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Frame</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE___GET_FRAME = BizPackage.BIZ_ENTITY_TYPE___GET_FRAME;

	/**
	 * The operation id for the '<em>Get Type Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE___GET_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE___GET_TYPE_ID;

	/**
	 * The operation id for the '<em>Has Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE___HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE___HAS_TABLE;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE___GET_TEXT = BizPackage.BIZ_ENTITY_TYPE___GET_TEXT;

	/**
	 * The operation id for the '<em>Child Enumeration Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE___CHILD_ENUMERATION_TYPES = BizPackage.BIZ_ENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Enumerations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE___ENUMERATIONS = BizPackage.BIZ_ENTITY_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_OPERATION_COUNT = BizPackage.BIZ_ENTITY_TYPE_OPERATION_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.enum_.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.enum_.Enumeration#getEnumId <em>Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum Id</em>'.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#getEnumId()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_EnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.enum_.Enumeration#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#getDescription()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.enum_.Enumeration#getEnumCode <em>Enum Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum Code</em>'.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#getEnumCode()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_EnumCode();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.enum_.Enumeration#getEnumTypeId <em>Enum Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enum Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#getEnumTypeId()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_EnumTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.enum_.Enumeration#getSequenceId <em>Sequence Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Id</em>'.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#getSequenceId()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_SequenceId();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.biz.common.enum_.Enumeration#getUserLoginSecurityQuestions <em>User Login Security Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>User Login Security Questions</em>'.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#getUserLoginSecurityQuestions()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_UserLoginSecurityQuestions();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#classFixedAssets() <em>Class Fixed Assets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Class Fixed Assets</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#classFixedAssets()
	 * @generated
	 */
	EOperation getEnumeration__ClassFixedAssets();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#cogsPartyAcctgPreferences() <em>Cogs Party Acctg Preferences</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cogs Party Acctg Preferences</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#cogsPartyAcctgPreferences()
	 * @generated
	 */
	EOperation getEnumeration__CogsPartyAcctgPreferences();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#communicationEvents() <em>Communication Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Communication Events</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#communicationEvents()
	 * @generated
	 */
	EOperation getEnumeration__CommunicationEvents();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#defaultSalesChannelProductStores() <em>Default Sales Channel Product Stores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Default Sales Channel Product Stores</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#defaultSalesChannelProductStores()
	 * @generated
	 */
	EOperation getEnumeration__DefaultSalesChannelProductStores();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#emailTemplateSettings() <em>Email Template Settings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Email Template Settings</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#emailTemplateSettings()
	 * @generated
	 */
	EOperation getEnumeration__EmailTemplateSettings();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#employmentStatusPersons() <em>Employment Status Persons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Employment Status Persons</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#employmentStatusPersons()
	 * @generated
	 */
	EOperation getEnumeration__EmploymentStatusPersons();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#examTypeJobRequisitions() <em>Exam Type Job Requisitions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exam Type Job Requisitions</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#examTypeJobRequisitions()
	 * @generated
	 */
	EOperation getEnumeration__ExamTypeJobRequisitions();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#geoPointTypeGeoPoints() <em>Geo Point Type Geo Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Geo Point Type Geo Points</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#geoPointTypeGeoPoints()
	 * @generated
	 */
	EOperation getEnumeration__GeoPointTypeGeoPoints();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#giftCardFulfillments() <em>Gift Card Fulfillments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Gift Card Fulfillments</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#giftCardFulfillments()
	 * @generated
	 */
	EOperation getEnumeration__GiftCardFulfillments();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#inputParamProductPriceConds() <em>Input Param Product Price Conds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Input Param Product Price Conds</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#inputParamProductPriceConds()
	 * @generated
	 */
	EOperation getEnumeration__InputParamProductPriceConds();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#invoiceSequencePartyAcctgPreferences() <em>Invoice Sequence Party Acctg Preferences</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Invoice Sequence Party Acctg Preferences</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#invoiceSequencePartyAcctgPreferences()
	 * @generated
	 */
	EOperation getEnumeration__InvoiceSequencePartyAcctgPreferences();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#jobInterviews() <em>Job Interviews</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Job Interviews</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#jobInterviews()
	 * @generated
	 */
	EOperation getEnumeration__JobInterviews();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#jobPostingTypeJobRequisitions() <em>Job Posting Type Job Requisitions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Job Posting Type Job Requisitions</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#jobPostingTypeJobRequisitions()
	 * @generated
	 */
	EOperation getEnumeration__JobPostingTypeJobRequisitions();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#operatorProductPriceConds() <em>Operator Product Price Conds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Operator Product Price Conds</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#operatorProductPriceConds()
	 * @generated
	 */
	EOperation getEnumeration__OperatorProductPriceConds();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#orderItemChanges() <em>Order Item Changes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Order Item Changes</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#orderItemChanges()
	 * @generated
	 */
	EOperation getEnumeration__OrderItemChanges();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#orderNotifications() <em>Order Notifications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Order Notifications</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#orderNotifications()
	 * @generated
	 */
	EOperation getEnumeration__OrderNotifications();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#orderSequencePartyAcctgPreferences() <em>Order Sequence Party Acctg Preferences</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Order Sequence Party Acctg Preferences</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#orderSequencePartyAcctgPreferences()
	 * @generated
	 */
	EOperation getEnumeration__OrderSequencePartyAcctgPreferences();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#privilegeContents() <em>Privilege Contents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Privilege Contents</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#privilegeContents()
	 * @generated
	 */
	EOperation getEnumeration__PrivilegeContents();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#productGeos() <em>Product Geos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Product Geos</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#productGeos()
	 * @generated
	 */
	EOperation getEnumeration__ProductGeos();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#productStoreEmailSettings() <em>Product Store Email Settings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Product Store Email Settings</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#productStoreEmailSettings()
	 * @generated
	 */
	EOperation getEnumeration__ProductStoreEmailSettings();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#quoteSequencePartyAcctgPreferences() <em>Quote Sequence Party Acctg Preferences</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Quote Sequence Party Acctg Preferences</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#quoteSequencePartyAcctgPreferences()
	 * @generated
	 */
	EOperation getEnumeration__QuoteSequencePartyAcctgPreferences();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#ratingProducts() <em>Rating Products</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rating Products</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#ratingProducts()
	 * @generated
	 */
	EOperation getEnumeration__RatingProducts();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#reasonFinAccountTranss() <em>Reason Fin Account Transs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reason Fin Account Transs</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#reasonFinAccountTranss()
	 * @generated
	 */
	EOperation getEnumeration__ReasonFinAccountTranss();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#reasonInventoryItemDetails() <em>Reason Inventory Item Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reason Inventory Item Details</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#reasonInventoryItemDetails()
	 * @generated
	 */
	EOperation getEnumeration__ReasonInventoryItemDetails();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#reasonJobManagerLocks() <em>Reason Job Manager Locks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reason Job Manager Locks</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#reasonJobManagerLocks()
	 * @generated
	 */
	EOperation getEnumeration__ReasonJobManagerLocks();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#reasonOrderItemChanges() <em>Reason Order Item Changes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reason Order Item Changes</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#reasonOrderItemChanges()
	 * @generated
	 */
	EOperation getEnumeration__ReasonOrderItemChanges();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#relationshipKeywordThesauruss() <em>Relationship Keyword Thesauruss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Relationship Keyword Thesauruss</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#relationshipKeywordThesauruss()
	 * @generated
	 */
	EOperation getEnumeration__RelationshipKeywordThesauruss();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#replenishFinAccountTypes() <em>Replenish Fin Account Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Replenish Fin Account Types</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#replenishFinAccountTypes()
	 * @generated
	 */
	EOperation getEnumeration__ReplenishFinAccountTypes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#replenishMethodProductStoreFinActSettings() <em>Replenish Method Product Store Fin Act Settings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Replenish Method Product Store Fin Act Settings</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#replenishMethodProductStoreFinActSettings()
	 * @generated
	 */
	EOperation getEnumeration__ReplenishMethodProductStoreFinActSettings();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#requirementMethodProductFacilities() <em>Requirement Method Product Facilities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Requirement Method Product Facilities</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#requirementMethodProductFacilities()
	 * @generated
	 */
	EOperation getEnumeration__RequirementMethodProductFacilities();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#requirementMethodProductStores() <em>Requirement Method Product Stores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Requirement Method Product Stores</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#requirementMethodProductStores()
	 * @generated
	 */
	EOperation getEnumeration__RequirementMethodProductStores();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#requirementMethodProducts() <em>Requirement Method Products</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Requirement Method Products</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#requirementMethodProducts()
	 * @generated
	 */
	EOperation getEnumeration__RequirementMethodProducts();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#reserveOrderProductStores() <em>Reserve Order Product Stores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reserve Order Product Stores</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#reserveOrderProductStores()
	 * @generated
	 */
	EOperation getEnumeration__ReserveOrderProductStores();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#residenceStatusPersons() <em>Residence Status Persons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Residence Status Persons</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#residenceStatusPersons()
	 * @generated
	 */
	EOperation getEnumeration__ResidenceStatusPersons();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#salesChannelCustRequests() <em>Sales Channel Cust Requests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sales Channel Cust Requests</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#salesChannelCustRequests()
	 * @generated
	 */
	EOperation getEnumeration__SalesChannelCustRequests();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#salesChannelOrderHeaders() <em>Sales Channel Order Headers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sales Channel Order Headers</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#salesChannelOrderHeaders()
	 * @generated
	 */
	EOperation getEnumeration__SalesChannelOrderHeaders();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#salesChannelQuotes() <em>Sales Channel Quotes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sales Channel Quotes</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#salesChannelQuotes()
	 * @generated
	 */
	EOperation getEnumeration__SalesChannelQuotes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#scopeWorkEfforts() <em>Scope Work Efforts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Scope Work Efforts</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#scopeWorkEfforts()
	 * @generated
	 */
	EOperation getEnumeration__ScopeWorkEfforts();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#serviceTypePaymentGatewayResponses() <em>Service Type Payment Gateway Responses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Service Type Payment Gateway Responses</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#serviceTypePaymentGatewayResponses()
	 * @generated
	 */
	EOperation getEnumeration__ServiceTypePaymentGatewayResponses();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#storeCreditAccountProductStores() <em>Store Credit Account Product Stores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Store Credit Account Product Stores</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#storeCreditAccountProductStores()
	 * @generated
	 */
	EOperation getEnumeration__StoreCreditAccountProductStores();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#taxFormPartyAcctgPreferences() <em>Tax Form Party Acctg Preferences</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tax Form Party Acctg Preferences</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#taxFormPartyAcctgPreferences()
	 * @generated
	 */
	EOperation getEnumeration__TaxFormPartyAcctgPreferences();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#tranCodePaymentGatewayResponses() <em>Tran Code Payment Gateway Responses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tran Code Payment Gateway Responses</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#tranCodePaymentGatewayResponses()
	 * @generated
	 */
	EOperation getEnumeration__TranCodePaymentGatewayResponses();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#typeFacilityLocations() <em>Type Facility Locations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type Facility Locations</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#typeFacilityLocations()
	 * @generated
	 */
	EOperation getEnumeration__TypeFacilityLocations();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#typeSalesOpportunities() <em>Type Sales Opportunities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type Sales Opportunities</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#typeSalesOpportunities()
	 * @generated
	 */
	EOperation getEnumeration__TypeSalesOpportunities();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.Enumeration#virtualVariantMethodProducts() <em>Virtual Variant Method Products</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Virtual Variant Method Products</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.Enumeration#virtualVariantMethodProducts()
	 * @generated
	 */
	EOperation getEnumeration__VirtualVariantMethodProducts();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.enum_.EnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Type</em>'.
	 * @see org.abchip.mimo.biz.common.enum_.EnumerationType
	 * @generated
	 */
	EClass getEnumerationType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.enum_.EnumerationType#getEnumTypeId <em>Enum Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.enum_.EnumerationType#getEnumTypeId()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EAttribute getEnumerationType_EnumTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.enum_.EnumerationType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.common.enum_.EnumerationType#getDescription()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EAttribute getEnumerationType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.enum_.EnumerationType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.common.enum_.EnumerationType#isHasTable()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EAttribute getEnumerationType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.enum_.EnumerationType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.enum_.EnumerationType#getParentTypeId()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EReference getEnumerationType_ParentTypeId();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.EnumerationType#childEnumerationTypes() <em>Child Enumeration Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Child Enumeration Types</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.EnumerationType#childEnumerationTypes()
	 * @generated
	 */
	EOperation getEnumerationType__ChildEnumerationTypes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.enum_.EnumerationType#enumerations() <em>Enumerations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enumerations</em>' operation.
	 * @see org.abchip.mimo.biz.common.enum_.EnumerationType#enumerations()
	 * @generated
	 */
	EOperation getEnumerationType__Enumerations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnumFactory getEnumFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.enum_.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.enum_.impl.EnumerationImpl
		 * @see org.abchip.mimo.biz.common.enum_.impl.EnumPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Enum Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__ENUM_ID = eINSTANCE.getEnumeration_EnumId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__DESCRIPTION = eINSTANCE.getEnumeration_Description();

		/**
		 * The meta object literal for the '<em><b>Enum Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__ENUM_CODE = eINSTANCE.getEnumeration_EnumCode();

		/**
		 * The meta object literal for the '<em><b>Enum Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__ENUM_TYPE_ID = eINSTANCE.getEnumeration_EnumTypeId();

		/**
		 * The meta object literal for the '<em><b>Sequence Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__SEQUENCE_ID = eINSTANCE.getEnumeration_SequenceId();

		/**
		 * The meta object literal for the '<em><b>User Login Security Questions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__USER_LOGIN_SECURITY_QUESTIONS = eINSTANCE.getEnumeration_UserLoginSecurityQuestions();

		/**
		 * The meta object literal for the '<em><b>Class Fixed Assets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___CLASS_FIXED_ASSETS = eINSTANCE.getEnumeration__ClassFixedAssets();

		/**
		 * The meta object literal for the '<em><b>Cogs Party Acctg Preferences</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___COGS_PARTY_ACCTG_PREFERENCES = eINSTANCE.getEnumeration__CogsPartyAcctgPreferences();

		/**
		 * The meta object literal for the '<em><b>Communication Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___COMMUNICATION_EVENTS = eINSTANCE.getEnumeration__CommunicationEvents();

		/**
		 * The meta object literal for the '<em><b>Default Sales Channel Product Stores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___DEFAULT_SALES_CHANNEL_PRODUCT_STORES = eINSTANCE.getEnumeration__DefaultSalesChannelProductStores();

		/**
		 * The meta object literal for the '<em><b>Email Template Settings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___EMAIL_TEMPLATE_SETTINGS = eINSTANCE.getEnumeration__EmailTemplateSettings();

		/**
		 * The meta object literal for the '<em><b>Employment Status Persons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___EMPLOYMENT_STATUS_PERSONS = eINSTANCE.getEnumeration__EmploymentStatusPersons();

		/**
		 * The meta object literal for the '<em><b>Exam Type Job Requisitions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___EXAM_TYPE_JOB_REQUISITIONS = eINSTANCE.getEnumeration__ExamTypeJobRequisitions();

		/**
		 * The meta object literal for the '<em><b>Geo Point Type Geo Points</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___GEO_POINT_TYPE_GEO_POINTS = eINSTANCE.getEnumeration__GeoPointTypeGeoPoints();

		/**
		 * The meta object literal for the '<em><b>Gift Card Fulfillments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___GIFT_CARD_FULFILLMENTS = eINSTANCE.getEnumeration__GiftCardFulfillments();

		/**
		 * The meta object literal for the '<em><b>Input Param Product Price Conds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___INPUT_PARAM_PRODUCT_PRICE_CONDS = eINSTANCE.getEnumeration__InputParamProductPriceConds();

		/**
		 * The meta object literal for the '<em><b>Invoice Sequence Party Acctg Preferences</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___INVOICE_SEQUENCE_PARTY_ACCTG_PREFERENCES = eINSTANCE.getEnumeration__InvoiceSequencePartyAcctgPreferences();

		/**
		 * The meta object literal for the '<em><b>Job Interviews</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___JOB_INTERVIEWS = eINSTANCE.getEnumeration__JobInterviews();

		/**
		 * The meta object literal for the '<em><b>Job Posting Type Job Requisitions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___JOB_POSTING_TYPE_JOB_REQUISITIONS = eINSTANCE.getEnumeration__JobPostingTypeJobRequisitions();

		/**
		 * The meta object literal for the '<em><b>Operator Product Price Conds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___OPERATOR_PRODUCT_PRICE_CONDS = eINSTANCE.getEnumeration__OperatorProductPriceConds();

		/**
		 * The meta object literal for the '<em><b>Order Item Changes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___ORDER_ITEM_CHANGES = eINSTANCE.getEnumeration__OrderItemChanges();

		/**
		 * The meta object literal for the '<em><b>Order Notifications</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___ORDER_NOTIFICATIONS = eINSTANCE.getEnumeration__OrderNotifications();

		/**
		 * The meta object literal for the '<em><b>Order Sequence Party Acctg Preferences</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___ORDER_SEQUENCE_PARTY_ACCTG_PREFERENCES = eINSTANCE.getEnumeration__OrderSequencePartyAcctgPreferences();

		/**
		 * The meta object literal for the '<em><b>Privilege Contents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___PRIVILEGE_CONTENTS = eINSTANCE.getEnumeration__PrivilegeContents();

		/**
		 * The meta object literal for the '<em><b>Product Geos</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___PRODUCT_GEOS = eINSTANCE.getEnumeration__ProductGeos();

		/**
		 * The meta object literal for the '<em><b>Product Store Email Settings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___PRODUCT_STORE_EMAIL_SETTINGS = eINSTANCE.getEnumeration__ProductStoreEmailSettings();

		/**
		 * The meta object literal for the '<em><b>Quote Sequence Party Acctg Preferences</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___QUOTE_SEQUENCE_PARTY_ACCTG_PREFERENCES = eINSTANCE.getEnumeration__QuoteSequencePartyAcctgPreferences();

		/**
		 * The meta object literal for the '<em><b>Rating Products</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___RATING_PRODUCTS = eINSTANCE.getEnumeration__RatingProducts();

		/**
		 * The meta object literal for the '<em><b>Reason Fin Account Transs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___REASON_FIN_ACCOUNT_TRANSS = eINSTANCE.getEnumeration__ReasonFinAccountTranss();

		/**
		 * The meta object literal for the '<em><b>Reason Inventory Item Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___REASON_INVENTORY_ITEM_DETAILS = eINSTANCE.getEnumeration__ReasonInventoryItemDetails();

		/**
		 * The meta object literal for the '<em><b>Reason Job Manager Locks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___REASON_JOB_MANAGER_LOCKS = eINSTANCE.getEnumeration__ReasonJobManagerLocks();

		/**
		 * The meta object literal for the '<em><b>Reason Order Item Changes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___REASON_ORDER_ITEM_CHANGES = eINSTANCE.getEnumeration__ReasonOrderItemChanges();

		/**
		 * The meta object literal for the '<em><b>Relationship Keyword Thesauruss</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___RELATIONSHIP_KEYWORD_THESAURUSS = eINSTANCE.getEnumeration__RelationshipKeywordThesauruss();

		/**
		 * The meta object literal for the '<em><b>Replenish Fin Account Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___REPLENISH_FIN_ACCOUNT_TYPES = eINSTANCE.getEnumeration__ReplenishFinAccountTypes();

		/**
		 * The meta object literal for the '<em><b>Replenish Method Product Store Fin Act Settings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___REPLENISH_METHOD_PRODUCT_STORE_FIN_ACT_SETTINGS = eINSTANCE.getEnumeration__ReplenishMethodProductStoreFinActSettings();

		/**
		 * The meta object literal for the '<em><b>Requirement Method Product Facilities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___REQUIREMENT_METHOD_PRODUCT_FACILITIES = eINSTANCE.getEnumeration__RequirementMethodProductFacilities();

		/**
		 * The meta object literal for the '<em><b>Requirement Method Product Stores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___REQUIREMENT_METHOD_PRODUCT_STORES = eINSTANCE.getEnumeration__RequirementMethodProductStores();

		/**
		 * The meta object literal for the '<em><b>Requirement Method Products</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___REQUIREMENT_METHOD_PRODUCTS = eINSTANCE.getEnumeration__RequirementMethodProducts();

		/**
		 * The meta object literal for the '<em><b>Reserve Order Product Stores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___RESERVE_ORDER_PRODUCT_STORES = eINSTANCE.getEnumeration__ReserveOrderProductStores();

		/**
		 * The meta object literal for the '<em><b>Residence Status Persons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___RESIDENCE_STATUS_PERSONS = eINSTANCE.getEnumeration__ResidenceStatusPersons();

		/**
		 * The meta object literal for the '<em><b>Sales Channel Cust Requests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___SALES_CHANNEL_CUST_REQUESTS = eINSTANCE.getEnumeration__SalesChannelCustRequests();

		/**
		 * The meta object literal for the '<em><b>Sales Channel Order Headers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___SALES_CHANNEL_ORDER_HEADERS = eINSTANCE.getEnumeration__SalesChannelOrderHeaders();

		/**
		 * The meta object literal for the '<em><b>Sales Channel Quotes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___SALES_CHANNEL_QUOTES = eINSTANCE.getEnumeration__SalesChannelQuotes();

		/**
		 * The meta object literal for the '<em><b>Scope Work Efforts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___SCOPE_WORK_EFFORTS = eINSTANCE.getEnumeration__ScopeWorkEfforts();

		/**
		 * The meta object literal for the '<em><b>Service Type Payment Gateway Responses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___SERVICE_TYPE_PAYMENT_GATEWAY_RESPONSES = eINSTANCE.getEnumeration__ServiceTypePaymentGatewayResponses();

		/**
		 * The meta object literal for the '<em><b>Store Credit Account Product Stores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___STORE_CREDIT_ACCOUNT_PRODUCT_STORES = eINSTANCE.getEnumeration__StoreCreditAccountProductStores();

		/**
		 * The meta object literal for the '<em><b>Tax Form Party Acctg Preferences</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___TAX_FORM_PARTY_ACCTG_PREFERENCES = eINSTANCE.getEnumeration__TaxFormPartyAcctgPreferences();

		/**
		 * The meta object literal for the '<em><b>Tran Code Payment Gateway Responses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___TRAN_CODE_PAYMENT_GATEWAY_RESPONSES = eINSTANCE.getEnumeration__TranCodePaymentGatewayResponses();

		/**
		 * The meta object literal for the '<em><b>Type Facility Locations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___TYPE_FACILITY_LOCATIONS = eINSTANCE.getEnumeration__TypeFacilityLocations();

		/**
		 * The meta object literal for the '<em><b>Type Sales Opportunities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___TYPE_SALES_OPPORTUNITIES = eINSTANCE.getEnumeration__TypeSalesOpportunities();

		/**
		 * The meta object literal for the '<em><b>Virtual Variant Method Products</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION___VIRTUAL_VARIANT_METHOD_PRODUCTS = eINSTANCE.getEnumeration__VirtualVariantMethodProducts();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.enum_.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.enum_.impl.EnumerationTypeImpl
		 * @see org.abchip.mimo.biz.common.enum_.impl.EnumPackageImpl#getEnumerationType()
		 * @generated
		 */
		EClass ENUMERATION_TYPE = eINSTANCE.getEnumerationType();

		/**
		 * The meta object literal for the '<em><b>Enum Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_TYPE__ENUM_TYPE_ID = eINSTANCE.getEnumerationType_EnumTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_TYPE__DESCRIPTION = eINSTANCE.getEnumerationType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_TYPE__HAS_TABLE = eINSTANCE.getEnumerationType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_TYPE__PARENT_TYPE_ID = eINSTANCE.getEnumerationType_ParentTypeId();

		/**
		 * The meta object literal for the '<em><b>Child Enumeration Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION_TYPE___CHILD_ENUMERATION_TYPES = eINSTANCE.getEnumerationType__ChildEnumerationTypes();

		/**
		 * The meta object literal for the '<em><b>Enumerations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION_TYPE___ENUMERATIONS = eINSTANCE.getEnumerationType__Enumerations();

	}

} //EnumPackage
