/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.status;

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
 * @see org.abchip.mimo.biz.common.status.StatusFactory
 * @model kind="package"
 * @generated
 */
public interface StatusPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "status";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/common/status";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-status";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatusPackage eINSTANCE = org.abchip.mimo.biz.common.status.impl.StatusPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.status.impl.StatusItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.status.impl.StatusItemImpl
	 * @see org.abchip.mimo.biz.common.status.impl.StatusPackageImpl#getStatusItem()
	 * @generated
	 */
	int STATUS_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM__STATUS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM__SEQUENCE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM__STATUS_CODE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM__STATUS_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Shipment Statuss</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM__SHIPMENT_STATUSS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Main Status Valid Changes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM__MAIN_STATUS_VALID_CHANGES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___ISA = BizPackage.BIZ_ENTITY_TYPED___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___GET_NAME = BizPackage.BIZ_ENTITY_TYPED___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___GET_URI = BizPackage.BIZ_ENTITY_TYPED___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___IS_PROXY = BizPackage.BIZ_ENTITY_TYPED___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___GET_TYPE = BizPackage.BIZ_ENTITY_TYPED___GET_TYPE;

	/**
	 * The operation id for the '<em>Acctg Trans Entries</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___ACCTG_TRANS_ENTRIES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Acctg Transs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___ACCTG_TRANSS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Approval Content Approvals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___APPROVAL_CONTENT_APPROVALS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Budget Statuss</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___BUDGET_STATUSS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Carrier Service Shipment Route Segments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___CARRIER_SERVICE_SHIPMENT_ROUTE_SEGMENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Communication Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___COMMUNICATION_EVENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___CONTENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Current Work Efforts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___CURRENT_WORK_EFFORTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Cust Request Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___CUST_REQUEST_ITEMS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Cust Request Statuss</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___CUST_REQUEST_STATUSS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Cust Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___CUST_REQUESTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Data Resources</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___DATA_RESOURCES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Digital Item Approved Product Stores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___DIGITAL_ITEM_APPROVED_PRODUCT_STORES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Empl Positions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___EMPL_POSITIONS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Employment Apps</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___EMPLOYMENT_APPS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Fin Account Transs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___FIN_ACCOUNT_TRANSS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Fixed Asset Maints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___FIXED_ASSET_MAINTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Gl Reconciliations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___GL_RECONCILIATIONS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Header Approved Product Stores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___HEADER_APPROVED_PRODUCT_STORES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Header Cancel Product Stores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___HEADER_CANCEL_PRODUCT_STORES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Header Declined Product Stores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___HEADER_DECLINED_PRODUCT_STORES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Inventory Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___INVENTORY_ITEMS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Inventory Return Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___INVENTORY_RETURN_ITEMS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Inventory Transfers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___INVENTORY_TRANSFERS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Invoices</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___INVOICES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Item Approved Product Stores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___ITEM_APPROVED_PRODUCT_STORES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Item Cancel Product Stores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___ITEM_CANCEL_PRODUCT_STORES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Item Declined Product Stores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___ITEM_DECLINED_PRODUCT_STORES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Job Sandboxs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___JOB_SANDBOXS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Marketing Campaigns</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___MARKETING_CAMPAIGNS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Order Delivery Schedules</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___ORDER_DELIVERY_SCHEDULES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Order Headers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___ORDER_HEADERS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Order Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___ORDER_ITEMS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Order Payment Preferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___ORDER_PAYMENT_PREFERENCES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Order Statuss</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___ORDER_STATUSS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Parties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___PARTIES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Party Invitations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___PARTY_INVITATIONS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Payments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___PAYMENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Picklist Status Histories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___PICKLIST_STATUS_HISTORIES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Picklists</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___PICKLISTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Product Group Orders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___PRODUCT_GROUP_ORDERS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Product Reviews</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___PRODUCT_REVIEWS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Quotes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___QUOTES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Requirement Statuss</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___REQUIREMENT_STATUSS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Requirements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___REQUIREMENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>Return Headers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___RETURN_HEADERS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Return Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___RETURN_ITEMS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Return Statuss</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___RETURN_STATUSS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 47;

	/**
	 * The operation id for the '<em>Shipments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___SHIPMENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 48;

	/**
	 * The operation id for the '<em>Survey Responses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___SURVEY_RESPONSES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 49;

	/**
	 * The operation id for the '<em>Sync Order Headers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___SYNC_ORDER_HEADERS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 50;

	/**
	 * The operation id for the '<em>Sync Order Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___SYNC_ORDER_ITEMS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 51;

	/**
	 * The operation id for the '<em>Testing Statuss</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___TESTING_STATUSS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 52;

	/**
	 * The operation id for the '<em>Timesheets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___TIMESHEETS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 53;

	/**
	 * The operation id for the '<em>To Picklist Status Histories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___TO_PICKLIST_STATUS_HISTORIES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 54;

	/**
	 * The operation id for the '<em>To Status Valid Changes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___TO_STATUS_VALID_CHANGES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 55;

	/**
	 * The operation id for the '<em>Unemployment Claims</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___UNEMPLOYMENT_CLAIMS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 56;

	/**
	 * The operation id for the '<em>Work Effort Inventory Assigns</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM___WORK_EFFORT_INVENTORY_ASSIGNS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 57;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_ITEM_OPERATION_COUNT = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 58;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.status.impl.StatusTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.status.impl.StatusTypeImpl
	 * @see org.abchip.mimo.biz.common.status.impl.StatusPackageImpl#getStatusType()
	 * @generated
	 */
	int STATUS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Status Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE__STATUS_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE___ISA = BizPackage.BIZ_ENTITY_TYPE___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE___GET_NAME = BizPackage.BIZ_ENTITY_TYPE___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE___GET_URI = BizPackage.BIZ_ENTITY_TYPE___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE___IS_PROXY = BizPackage.BIZ_ENTITY_TYPE___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Frame</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE___GET_FRAME = BizPackage.BIZ_ENTITY_TYPE___GET_FRAME;

	/**
	 * The operation id for the '<em>Get Type Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE___GET_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE___GET_TYPE_ID;

	/**
	 * The operation id for the '<em>Has Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE___HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE___HAS_TABLE;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE___GET_TEXT = BizPackage.BIZ_ENTITY_TYPE___GET_TEXT;

	/**
	 * The operation id for the '<em>Child Status Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE___CHILD_STATUS_TYPES = BizPackage.BIZ_ENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Status Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE___STATUS_ITEMS = BizPackage.BIZ_ENTITY_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_TYPE_OPERATION_COUNT = BizPackage.BIZ_ENTITY_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.status.impl.StatusValidChangeImpl <em>Valid Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.status.impl.StatusValidChangeImpl
	 * @see org.abchip.mimo.biz.common.status.impl.StatusPackageImpl#getStatusValidChange()
	 * @generated
	 */
	int STATUS_VALID_CHANGE = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_VALID_CHANGE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_VALID_CHANGE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_VALID_CHANGE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_VALID_CHANGE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Condition Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_VALID_CHANGE__CONDITION_EXPRESSION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transition Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_VALID_CHANGE__TRANSITION_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_VALID_CHANGE__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_VALID_CHANGE__STATUS_ID_TO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Valid Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_VALID_CHANGE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;


	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_VALID_CHANGE___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_VALID_CHANGE___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_VALID_CHANGE___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_VALID_CHANGE___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The number of operations of the '<em>Valid Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_VALID_CHANGE_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.status.StatusItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusItem
	 * @generated
	 */
	EClass getStatusItem();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.status.StatusItem#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#getStatusId()
	 * @see #getStatusItem()
	 * @generated
	 */
	EAttribute getStatusItem_StatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.status.StatusItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#getDescription()
	 * @see #getStatusItem()
	 * @generated
	 */
	EAttribute getStatusItem_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.status.StatusItem#getSequenceId <em>Sequence Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Id</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#getSequenceId()
	 * @see #getStatusItem()
	 * @generated
	 */
	EAttribute getStatusItem_SequenceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.status.StatusItem#getStatusCode <em>Status Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Code</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#getStatusCode()
	 * @see #getStatusItem()
	 * @generated
	 */
	EAttribute getStatusItem_StatusCode();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.status.StatusItem#getStatusTypeId <em>Status Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#getStatusTypeId()
	 * @see #getStatusItem()
	 * @generated
	 */
	EReference getStatusItem_StatusTypeId();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.biz.common.status.StatusItem#getShipmentStatuss <em>Shipment Statuss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Shipment Statuss</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#getShipmentStatuss()
	 * @see #getStatusItem()
	 * @generated
	 */
	EAttribute getStatusItem_ShipmentStatuss();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.biz.common.status.StatusItem#getMainStatusValidChanges <em>Main Status Valid Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Main Status Valid Changes</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#getMainStatusValidChanges()
	 * @see #getStatusItem()
	 * @generated
	 */
	EAttribute getStatusItem_MainStatusValidChanges();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#acctgTransEntries() <em>Acctg Trans Entries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Acctg Trans Entries</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#acctgTransEntries()
	 * @generated
	 */
	EOperation getStatusItem__AcctgTransEntries();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#acctgTranss() <em>Acctg Transs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Acctg Transs</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#acctgTranss()
	 * @generated
	 */
	EOperation getStatusItem__AcctgTranss();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#approvalContentApprovals() <em>Approval Content Approvals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Approval Content Approvals</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#approvalContentApprovals()
	 * @generated
	 */
	EOperation getStatusItem__ApprovalContentApprovals();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#budgetStatuss() <em>Budget Statuss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Budget Statuss</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#budgetStatuss()
	 * @generated
	 */
	EOperation getStatusItem__BudgetStatuss();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#carrierServiceShipmentRouteSegments() <em>Carrier Service Shipment Route Segments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Carrier Service Shipment Route Segments</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#carrierServiceShipmentRouteSegments()
	 * @generated
	 */
	EOperation getStatusItem__CarrierServiceShipmentRouteSegments();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#communicationEvents() <em>Communication Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Communication Events</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#communicationEvents()
	 * @generated
	 */
	EOperation getStatusItem__CommunicationEvents();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#contents() <em>Contents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contents</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#contents()
	 * @generated
	 */
	EOperation getStatusItem__Contents();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#currentWorkEfforts() <em>Current Work Efforts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Current Work Efforts</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#currentWorkEfforts()
	 * @generated
	 */
	EOperation getStatusItem__CurrentWorkEfforts();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#custRequestItems() <em>Cust Request Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cust Request Items</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#custRequestItems()
	 * @generated
	 */
	EOperation getStatusItem__CustRequestItems();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#custRequestStatuss() <em>Cust Request Statuss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cust Request Statuss</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#custRequestStatuss()
	 * @generated
	 */
	EOperation getStatusItem__CustRequestStatuss();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#custRequests() <em>Cust Requests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cust Requests</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#custRequests()
	 * @generated
	 */
	EOperation getStatusItem__CustRequests();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#dataResources() <em>Data Resources</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Data Resources</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#dataResources()
	 * @generated
	 */
	EOperation getStatusItem__DataResources();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#digitalItemApprovedProductStores() <em>Digital Item Approved Product Stores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Digital Item Approved Product Stores</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#digitalItemApprovedProductStores()
	 * @generated
	 */
	EOperation getStatusItem__DigitalItemApprovedProductStores();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#emplPositions() <em>Empl Positions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Empl Positions</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#emplPositions()
	 * @generated
	 */
	EOperation getStatusItem__EmplPositions();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#employmentApps() <em>Employment Apps</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Employment Apps</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#employmentApps()
	 * @generated
	 */
	EOperation getStatusItem__EmploymentApps();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#finAccountTranss() <em>Fin Account Transs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fin Account Transs</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#finAccountTranss()
	 * @generated
	 */
	EOperation getStatusItem__FinAccountTranss();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#fixedAssetMaints() <em>Fixed Asset Maints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fixed Asset Maints</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#fixedAssetMaints()
	 * @generated
	 */
	EOperation getStatusItem__FixedAssetMaints();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#glReconciliations() <em>Gl Reconciliations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Gl Reconciliations</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#glReconciliations()
	 * @generated
	 */
	EOperation getStatusItem__GlReconciliations();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#headerApprovedProductStores() <em>Header Approved Product Stores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Header Approved Product Stores</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#headerApprovedProductStores()
	 * @generated
	 */
	EOperation getStatusItem__HeaderApprovedProductStores();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#headerCancelProductStores() <em>Header Cancel Product Stores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Header Cancel Product Stores</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#headerCancelProductStores()
	 * @generated
	 */
	EOperation getStatusItem__HeaderCancelProductStores();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#headerDeclinedProductStores() <em>Header Declined Product Stores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Header Declined Product Stores</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#headerDeclinedProductStores()
	 * @generated
	 */
	EOperation getStatusItem__HeaderDeclinedProductStores();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#inventoryItems() <em>Inventory Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inventory Items</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#inventoryItems()
	 * @generated
	 */
	EOperation getStatusItem__InventoryItems();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#inventoryReturnItems() <em>Inventory Return Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inventory Return Items</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#inventoryReturnItems()
	 * @generated
	 */
	EOperation getStatusItem__InventoryReturnItems();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#inventoryTransfers() <em>Inventory Transfers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inventory Transfers</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#inventoryTransfers()
	 * @generated
	 */
	EOperation getStatusItem__InventoryTransfers();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#invoices() <em>Invoices</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Invoices</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#invoices()
	 * @generated
	 */
	EOperation getStatusItem__Invoices();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#itemApprovedProductStores() <em>Item Approved Product Stores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Item Approved Product Stores</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#itemApprovedProductStores()
	 * @generated
	 */
	EOperation getStatusItem__ItemApprovedProductStores();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#itemCancelProductStores() <em>Item Cancel Product Stores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Item Cancel Product Stores</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#itemCancelProductStores()
	 * @generated
	 */
	EOperation getStatusItem__ItemCancelProductStores();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#itemDeclinedProductStores() <em>Item Declined Product Stores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Item Declined Product Stores</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#itemDeclinedProductStores()
	 * @generated
	 */
	EOperation getStatusItem__ItemDeclinedProductStores();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#jobSandboxs() <em>Job Sandboxs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Job Sandboxs</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#jobSandboxs()
	 * @generated
	 */
	EOperation getStatusItem__JobSandboxs();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#marketingCampaigns() <em>Marketing Campaigns</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Marketing Campaigns</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#marketingCampaigns()
	 * @generated
	 */
	EOperation getStatusItem__MarketingCampaigns();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#orderDeliverySchedules() <em>Order Delivery Schedules</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Order Delivery Schedules</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#orderDeliverySchedules()
	 * @generated
	 */
	EOperation getStatusItem__OrderDeliverySchedules();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#orderHeaders() <em>Order Headers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Order Headers</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#orderHeaders()
	 * @generated
	 */
	EOperation getStatusItem__OrderHeaders();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#orderItems() <em>Order Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Order Items</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#orderItems()
	 * @generated
	 */
	EOperation getStatusItem__OrderItems();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#orderPaymentPreferences() <em>Order Payment Preferences</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Order Payment Preferences</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#orderPaymentPreferences()
	 * @generated
	 */
	EOperation getStatusItem__OrderPaymentPreferences();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#orderStatuss() <em>Order Statuss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Order Statuss</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#orderStatuss()
	 * @generated
	 */
	EOperation getStatusItem__OrderStatuss();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#parties() <em>Parties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parties</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#parties()
	 * @generated
	 */
	EOperation getStatusItem__Parties();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#partyInvitations() <em>Party Invitations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Party Invitations</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#partyInvitations()
	 * @generated
	 */
	EOperation getStatusItem__PartyInvitations();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#payments() <em>Payments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Payments</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#payments()
	 * @generated
	 */
	EOperation getStatusItem__Payments();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#picklistStatusHistories() <em>Picklist Status Histories</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Picklist Status Histories</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#picklistStatusHistories()
	 * @generated
	 */
	EOperation getStatusItem__PicklistStatusHistories();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#picklists() <em>Picklists</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Picklists</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#picklists()
	 * @generated
	 */
	EOperation getStatusItem__Picklists();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#productGroupOrders() <em>Product Group Orders</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Product Group Orders</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#productGroupOrders()
	 * @generated
	 */
	EOperation getStatusItem__ProductGroupOrders();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#productReviews() <em>Product Reviews</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Product Reviews</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#productReviews()
	 * @generated
	 */
	EOperation getStatusItem__ProductReviews();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#quotes() <em>Quotes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Quotes</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#quotes()
	 * @generated
	 */
	EOperation getStatusItem__Quotes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#requirementStatuss() <em>Requirement Statuss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Requirement Statuss</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#requirementStatuss()
	 * @generated
	 */
	EOperation getStatusItem__RequirementStatuss();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#requirements() <em>Requirements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Requirements</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#requirements()
	 * @generated
	 */
	EOperation getStatusItem__Requirements();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#returnHeaders() <em>Return Headers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Return Headers</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#returnHeaders()
	 * @generated
	 */
	EOperation getStatusItem__ReturnHeaders();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#returnItems() <em>Return Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Return Items</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#returnItems()
	 * @generated
	 */
	EOperation getStatusItem__ReturnItems();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#returnStatuss() <em>Return Statuss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Return Statuss</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#returnStatuss()
	 * @generated
	 */
	EOperation getStatusItem__ReturnStatuss();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#shipments() <em>Shipments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Shipments</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#shipments()
	 * @generated
	 */
	EOperation getStatusItem__Shipments();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#surveyResponses() <em>Survey Responses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Survey Responses</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#surveyResponses()
	 * @generated
	 */
	EOperation getStatusItem__SurveyResponses();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#syncOrderHeaders() <em>Sync Order Headers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sync Order Headers</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#syncOrderHeaders()
	 * @generated
	 */
	EOperation getStatusItem__SyncOrderHeaders();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#syncOrderItems() <em>Sync Order Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sync Order Items</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#syncOrderItems()
	 * @generated
	 */
	EOperation getStatusItem__SyncOrderItems();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#testingStatuss() <em>Testing Statuss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Testing Statuss</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#testingStatuss()
	 * @generated
	 */
	EOperation getStatusItem__TestingStatuss();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#timesheets() <em>Timesheets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Timesheets</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#timesheets()
	 * @generated
	 */
	EOperation getStatusItem__Timesheets();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#toPicklistStatusHistories() <em>To Picklist Status Histories</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Picklist Status Histories</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#toPicklistStatusHistories()
	 * @generated
	 */
	EOperation getStatusItem__ToPicklistStatusHistories();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#toStatusValidChanges() <em>To Status Valid Changes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Status Valid Changes</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#toStatusValidChanges()
	 * @generated
	 */
	EOperation getStatusItem__ToStatusValidChanges();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#unemploymentClaims() <em>Unemployment Claims</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unemployment Claims</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#unemploymentClaims()
	 * @generated
	 */
	EOperation getStatusItem__UnemploymentClaims();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusItem#workEffortInventoryAssigns() <em>Work Effort Inventory Assigns</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Work Effort Inventory Assigns</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusItem#workEffortInventoryAssigns()
	 * @generated
	 */
	EOperation getStatusItem__WorkEffortInventoryAssigns();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.status.StatusType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusType
	 * @generated
	 */
	EClass getStatusType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.status.StatusType#getStatusTypeId <em>Status Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusType#getStatusTypeId()
	 * @see #getStatusType()
	 * @generated
	 */
	EAttribute getStatusType_StatusTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.status.StatusType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusType#getDescription()
	 * @see #getStatusType()
	 * @generated
	 */
	EAttribute getStatusType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.status.StatusType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusType#isHasTable()
	 * @see #getStatusType()
	 * @generated
	 */
	EAttribute getStatusType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.status.StatusType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusType#getParentTypeId()
	 * @see #getStatusType()
	 * @generated
	 */
	EReference getStatusType_ParentTypeId();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusType#childStatusTypes() <em>Child Status Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Child Status Types</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusType#childStatusTypes()
	 * @generated
	 */
	EOperation getStatusType__ChildStatusTypes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.status.StatusType#statusItems() <em>Status Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Status Items</em>' operation.
	 * @see org.abchip.mimo.biz.common.status.StatusType#statusItems()
	 * @generated
	 */
	EOperation getStatusType__StatusItems();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.status.StatusValidChange <em>Valid Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Change</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusValidChange
	 * @generated
	 */
	EClass getStatusValidChange();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.status.StatusValidChange#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusValidChange#getStatusId()
	 * @see #getStatusValidChange()
	 * @generated
	 */
	EReference getStatusValidChange_StatusId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.status.StatusValidChange#getStatusIdTo <em>Status Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id To</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusValidChange#getStatusIdTo()
	 * @see #getStatusValidChange()
	 * @generated
	 */
	EReference getStatusValidChange_StatusIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.status.StatusValidChange#getConditionExpression <em>Condition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Expression</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusValidChange#getConditionExpression()
	 * @see #getStatusValidChange()
	 * @generated
	 */
	EAttribute getStatusValidChange_ConditionExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.status.StatusValidChange#getTransitionName <em>Transition Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transition Name</em>'.
	 * @see org.abchip.mimo.biz.common.status.StatusValidChange#getTransitionName()
	 * @see #getStatusValidChange()
	 * @generated
	 */
	EAttribute getStatusValidChange_TransitionName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatusFactory getStatusFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.status.impl.StatusItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.status.impl.StatusItemImpl
		 * @see org.abchip.mimo.biz.common.status.impl.StatusPackageImpl#getStatusItem()
		 * @generated
		 */
		EClass STATUS_ITEM = eINSTANCE.getStatusItem();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_ITEM__STATUS_ID = eINSTANCE.getStatusItem_StatusId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_ITEM__DESCRIPTION = eINSTANCE.getStatusItem_Description();

		/**
		 * The meta object literal for the '<em><b>Sequence Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_ITEM__SEQUENCE_ID = eINSTANCE.getStatusItem_SequenceId();

		/**
		 * The meta object literal for the '<em><b>Status Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_ITEM__STATUS_CODE = eINSTANCE.getStatusItem_StatusCode();

		/**
		 * The meta object literal for the '<em><b>Status Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATUS_ITEM__STATUS_TYPE_ID = eINSTANCE.getStatusItem_StatusTypeId();

		/**
		 * The meta object literal for the '<em><b>Shipment Statuss</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_ITEM__SHIPMENT_STATUSS = eINSTANCE.getStatusItem_ShipmentStatuss();

		/**
		 * The meta object literal for the '<em><b>Main Status Valid Changes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_ITEM__MAIN_STATUS_VALID_CHANGES = eINSTANCE.getStatusItem_MainStatusValidChanges();

		/**
		 * The meta object literal for the '<em><b>Acctg Trans Entries</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___ACCTG_TRANS_ENTRIES = eINSTANCE.getStatusItem__AcctgTransEntries();

		/**
		 * The meta object literal for the '<em><b>Acctg Transs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___ACCTG_TRANSS = eINSTANCE.getStatusItem__AcctgTranss();

		/**
		 * The meta object literal for the '<em><b>Approval Content Approvals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___APPROVAL_CONTENT_APPROVALS = eINSTANCE.getStatusItem__ApprovalContentApprovals();

		/**
		 * The meta object literal for the '<em><b>Budget Statuss</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___BUDGET_STATUSS = eINSTANCE.getStatusItem__BudgetStatuss();

		/**
		 * The meta object literal for the '<em><b>Carrier Service Shipment Route Segments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___CARRIER_SERVICE_SHIPMENT_ROUTE_SEGMENTS = eINSTANCE.getStatusItem__CarrierServiceShipmentRouteSegments();

		/**
		 * The meta object literal for the '<em><b>Communication Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___COMMUNICATION_EVENTS = eINSTANCE.getStatusItem__CommunicationEvents();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___CONTENTS = eINSTANCE.getStatusItem__Contents();

		/**
		 * The meta object literal for the '<em><b>Current Work Efforts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___CURRENT_WORK_EFFORTS = eINSTANCE.getStatusItem__CurrentWorkEfforts();

		/**
		 * The meta object literal for the '<em><b>Cust Request Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___CUST_REQUEST_ITEMS = eINSTANCE.getStatusItem__CustRequestItems();

		/**
		 * The meta object literal for the '<em><b>Cust Request Statuss</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___CUST_REQUEST_STATUSS = eINSTANCE.getStatusItem__CustRequestStatuss();

		/**
		 * The meta object literal for the '<em><b>Cust Requests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___CUST_REQUESTS = eINSTANCE.getStatusItem__CustRequests();

		/**
		 * The meta object literal for the '<em><b>Data Resources</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___DATA_RESOURCES = eINSTANCE.getStatusItem__DataResources();

		/**
		 * The meta object literal for the '<em><b>Digital Item Approved Product Stores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___DIGITAL_ITEM_APPROVED_PRODUCT_STORES = eINSTANCE.getStatusItem__DigitalItemApprovedProductStores();

		/**
		 * The meta object literal for the '<em><b>Empl Positions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___EMPL_POSITIONS = eINSTANCE.getStatusItem__EmplPositions();

		/**
		 * The meta object literal for the '<em><b>Employment Apps</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___EMPLOYMENT_APPS = eINSTANCE.getStatusItem__EmploymentApps();

		/**
		 * The meta object literal for the '<em><b>Fin Account Transs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___FIN_ACCOUNT_TRANSS = eINSTANCE.getStatusItem__FinAccountTranss();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Maints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___FIXED_ASSET_MAINTS = eINSTANCE.getStatusItem__FixedAssetMaints();

		/**
		 * The meta object literal for the '<em><b>Gl Reconciliations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___GL_RECONCILIATIONS = eINSTANCE.getStatusItem__GlReconciliations();

		/**
		 * The meta object literal for the '<em><b>Header Approved Product Stores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___HEADER_APPROVED_PRODUCT_STORES = eINSTANCE.getStatusItem__HeaderApprovedProductStores();

		/**
		 * The meta object literal for the '<em><b>Header Cancel Product Stores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___HEADER_CANCEL_PRODUCT_STORES = eINSTANCE.getStatusItem__HeaderCancelProductStores();

		/**
		 * The meta object literal for the '<em><b>Header Declined Product Stores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___HEADER_DECLINED_PRODUCT_STORES = eINSTANCE.getStatusItem__HeaderDeclinedProductStores();

		/**
		 * The meta object literal for the '<em><b>Inventory Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___INVENTORY_ITEMS = eINSTANCE.getStatusItem__InventoryItems();

		/**
		 * The meta object literal for the '<em><b>Inventory Return Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___INVENTORY_RETURN_ITEMS = eINSTANCE.getStatusItem__InventoryReturnItems();

		/**
		 * The meta object literal for the '<em><b>Inventory Transfers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___INVENTORY_TRANSFERS = eINSTANCE.getStatusItem__InventoryTransfers();

		/**
		 * The meta object literal for the '<em><b>Invoices</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___INVOICES = eINSTANCE.getStatusItem__Invoices();

		/**
		 * The meta object literal for the '<em><b>Item Approved Product Stores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___ITEM_APPROVED_PRODUCT_STORES = eINSTANCE.getStatusItem__ItemApprovedProductStores();

		/**
		 * The meta object literal for the '<em><b>Item Cancel Product Stores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___ITEM_CANCEL_PRODUCT_STORES = eINSTANCE.getStatusItem__ItemCancelProductStores();

		/**
		 * The meta object literal for the '<em><b>Item Declined Product Stores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___ITEM_DECLINED_PRODUCT_STORES = eINSTANCE.getStatusItem__ItemDeclinedProductStores();

		/**
		 * The meta object literal for the '<em><b>Job Sandboxs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___JOB_SANDBOXS = eINSTANCE.getStatusItem__JobSandboxs();

		/**
		 * The meta object literal for the '<em><b>Marketing Campaigns</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___MARKETING_CAMPAIGNS = eINSTANCE.getStatusItem__MarketingCampaigns();

		/**
		 * The meta object literal for the '<em><b>Order Delivery Schedules</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___ORDER_DELIVERY_SCHEDULES = eINSTANCE.getStatusItem__OrderDeliverySchedules();

		/**
		 * The meta object literal for the '<em><b>Order Headers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___ORDER_HEADERS = eINSTANCE.getStatusItem__OrderHeaders();

		/**
		 * The meta object literal for the '<em><b>Order Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___ORDER_ITEMS = eINSTANCE.getStatusItem__OrderItems();

		/**
		 * The meta object literal for the '<em><b>Order Payment Preferences</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___ORDER_PAYMENT_PREFERENCES = eINSTANCE.getStatusItem__OrderPaymentPreferences();

		/**
		 * The meta object literal for the '<em><b>Order Statuss</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___ORDER_STATUSS = eINSTANCE.getStatusItem__OrderStatuss();

		/**
		 * The meta object literal for the '<em><b>Parties</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___PARTIES = eINSTANCE.getStatusItem__Parties();

		/**
		 * The meta object literal for the '<em><b>Party Invitations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___PARTY_INVITATIONS = eINSTANCE.getStatusItem__PartyInvitations();

		/**
		 * The meta object literal for the '<em><b>Payments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___PAYMENTS = eINSTANCE.getStatusItem__Payments();

		/**
		 * The meta object literal for the '<em><b>Picklist Status Histories</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___PICKLIST_STATUS_HISTORIES = eINSTANCE.getStatusItem__PicklistStatusHistories();

		/**
		 * The meta object literal for the '<em><b>Picklists</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___PICKLISTS = eINSTANCE.getStatusItem__Picklists();

		/**
		 * The meta object literal for the '<em><b>Product Group Orders</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___PRODUCT_GROUP_ORDERS = eINSTANCE.getStatusItem__ProductGroupOrders();

		/**
		 * The meta object literal for the '<em><b>Product Reviews</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___PRODUCT_REVIEWS = eINSTANCE.getStatusItem__ProductReviews();

		/**
		 * The meta object literal for the '<em><b>Quotes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___QUOTES = eINSTANCE.getStatusItem__Quotes();

		/**
		 * The meta object literal for the '<em><b>Requirement Statuss</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___REQUIREMENT_STATUSS = eINSTANCE.getStatusItem__RequirementStatuss();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___REQUIREMENTS = eINSTANCE.getStatusItem__Requirements();

		/**
		 * The meta object literal for the '<em><b>Return Headers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___RETURN_HEADERS = eINSTANCE.getStatusItem__ReturnHeaders();

		/**
		 * The meta object literal for the '<em><b>Return Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___RETURN_ITEMS = eINSTANCE.getStatusItem__ReturnItems();

		/**
		 * The meta object literal for the '<em><b>Return Statuss</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___RETURN_STATUSS = eINSTANCE.getStatusItem__ReturnStatuss();

		/**
		 * The meta object literal for the '<em><b>Shipments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___SHIPMENTS = eINSTANCE.getStatusItem__Shipments();

		/**
		 * The meta object literal for the '<em><b>Survey Responses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___SURVEY_RESPONSES = eINSTANCE.getStatusItem__SurveyResponses();

		/**
		 * The meta object literal for the '<em><b>Sync Order Headers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___SYNC_ORDER_HEADERS = eINSTANCE.getStatusItem__SyncOrderHeaders();

		/**
		 * The meta object literal for the '<em><b>Sync Order Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___SYNC_ORDER_ITEMS = eINSTANCE.getStatusItem__SyncOrderItems();

		/**
		 * The meta object literal for the '<em><b>Testing Statuss</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___TESTING_STATUSS = eINSTANCE.getStatusItem__TestingStatuss();

		/**
		 * The meta object literal for the '<em><b>Timesheets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___TIMESHEETS = eINSTANCE.getStatusItem__Timesheets();

		/**
		 * The meta object literal for the '<em><b>To Picklist Status Histories</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___TO_PICKLIST_STATUS_HISTORIES = eINSTANCE.getStatusItem__ToPicklistStatusHistories();

		/**
		 * The meta object literal for the '<em><b>To Status Valid Changes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___TO_STATUS_VALID_CHANGES = eINSTANCE.getStatusItem__ToStatusValidChanges();

		/**
		 * The meta object literal for the '<em><b>Unemployment Claims</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___UNEMPLOYMENT_CLAIMS = eINSTANCE.getStatusItem__UnemploymentClaims();

		/**
		 * The meta object literal for the '<em><b>Work Effort Inventory Assigns</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_ITEM___WORK_EFFORT_INVENTORY_ASSIGNS = eINSTANCE.getStatusItem__WorkEffortInventoryAssigns();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.status.impl.StatusTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.status.impl.StatusTypeImpl
		 * @see org.abchip.mimo.biz.common.status.impl.StatusPackageImpl#getStatusType()
		 * @generated
		 */
		EClass STATUS_TYPE = eINSTANCE.getStatusType();

		/**
		 * The meta object literal for the '<em><b>Status Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_TYPE__STATUS_TYPE_ID = eINSTANCE.getStatusType_StatusTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_TYPE__DESCRIPTION = eINSTANCE.getStatusType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_TYPE__HAS_TABLE = eINSTANCE.getStatusType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATUS_TYPE__PARENT_TYPE_ID = eINSTANCE.getStatusType_ParentTypeId();

		/**
		 * The meta object literal for the '<em><b>Child Status Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_TYPE___CHILD_STATUS_TYPES = eINSTANCE.getStatusType__ChildStatusTypes();

		/**
		 * The meta object literal for the '<em><b>Status Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATUS_TYPE___STATUS_ITEMS = eINSTANCE.getStatusType__StatusItems();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.status.impl.StatusValidChangeImpl <em>Valid Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.status.impl.StatusValidChangeImpl
		 * @see org.abchip.mimo.biz.common.status.impl.StatusPackageImpl#getStatusValidChange()
		 * @generated
		 */
		EClass STATUS_VALID_CHANGE = eINSTANCE.getStatusValidChange();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATUS_VALID_CHANGE__STATUS_ID = eINSTANCE.getStatusValidChange_StatusId();

		/**
		 * The meta object literal for the '<em><b>Status Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATUS_VALID_CHANGE__STATUS_ID_TO = eINSTANCE.getStatusValidChange_StatusIdTo();

		/**
		 * The meta object literal for the '<em><b>Condition Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_VALID_CHANGE__CONDITION_EXPRESSION = eINSTANCE.getStatusValidChange_ConditionExpression();

		/**
		 * The meta object literal for the '<em><b>Transition Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_VALID_CHANGE__TRANSITION_NAME = eINSTANCE.getStatusValidChange_TransitionName();

	}

} //StatusPackage
