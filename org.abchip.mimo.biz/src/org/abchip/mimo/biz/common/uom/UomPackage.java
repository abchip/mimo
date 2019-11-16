/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.uom;

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
 * @see org.abchip.mimo.biz.common.uom.UomFactory
 * @model kind="package"
 * @generated
 */
public interface UomPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uom";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/common/uom";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-uom";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UomPackage eINSTANCE = org.abchip.mimo.biz.common.uom.impl.UomPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.uom.impl.UomImpl <em>Uom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.uom.impl.UomImpl
	 * @see org.abchip.mimo.biz.common.uom.impl.UomPackageImpl#getUom()
	 * @generated
	 */
	int UOM = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__ABBREVIATION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Numeric Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__NUMERIC_CODE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uom Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__UOM_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Main Uom Conversions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM__MAIN_UOM_CONVERSIONS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Uom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___ISA = BizPackage.BIZ_ENTITY_TYPED___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___GET_NAME = BizPackage.BIZ_ENTITY_TYPED___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___GET_URI = BizPackage.BIZ_ENTITY_TYPED___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___IS_PROXY = BizPackage.BIZ_ENTITY_TYPED___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___GET_TYPE = BizPackage.BIZ_ENTITY_TYPED___GET_TYPE;

	/**
	 * The operation id for the '<em>Actual Currency Payments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___ACTUAL_CURRENCY_PAYMENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Available Time Subscriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___AVAILABLE_TIME_SUBSCRIPTIONS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Billing Account Terms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___BILLING_ACCOUNT_TERMS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Billing Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___BILLING_ACCOUNTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Billing Weight Shipment Route Segments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___BILLING_WEIGHT_SHIPMENT_ROUTE_SEGMENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Cancel Time Subscriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___CANCEL_TIME_SUBSCRIPTIONS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Conv To Uom Conversions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___CONV_TO_UOM_CONVERSIONS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Cost Component Calcs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___COST_COMPONENT_CALCS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Currency Acctg Trans Entries</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___CURRENCY_ACCTG_TRANS_ENTRIES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Currency Cost Components</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___CURRENCY_COST_COMPONENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Currency Cust Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___CURRENCY_CUST_REQUESTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Currency Fin Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___CURRENCY_FIN_ACCOUNTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Currency Inventory Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___CURRENCY_INVENTORY_ITEMS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Currency Invoices</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___CURRENCY_INVOICES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Currency Payments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___CURRENCY_PAYMENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Currency Shipment Route Segments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___CURRENCY_SHIPMENT_ROUTE_SEGMENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Currency Shipments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___CURRENCY_SHIPMENTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Default Product Meter Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___DEFAULT_PRODUCT_METER_TYPES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Depth Products</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___DEPTH_PRODUCTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Diameter Products</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___DIAMETER_PRODUCTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Dimension Facilities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___DIMENSION_FACILITIES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Dimension Shipment Box Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___DIMENSION_SHIPMENT_BOX_TYPES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Dimension Shipment Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___DIMENSION_SHIPMENT_PACKAGES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Elevation Geo Points</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___ELEVATION_GEO_POINTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Facility Size Facilities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___FACILITY_SIZE_FACILITIES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Fixed Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___FIXED_ASSETS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Grace Period Subscriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___GRACE_PERIOD_SUBSCRIPTIONS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Height Products</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___HEIGHT_PRODUCTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Interval Fixed Asset Maints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___INTERVAL_FIXED_ASSET_MAINTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Interval Product Maints</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___INTERVAL_PRODUCT_MAINTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Inventory Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___INVENTORY_ITEMS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Invoice Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___INVOICE_ITEMS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Marketing Campaigns</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___MARKETING_CAMPAIGNS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Max Life Time Subscriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___MAX_LIFE_TIME_SUBSCRIPTIONS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Maximum Amount Cust Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___MAXIMUM_AMOUNT_CUST_REQUESTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Meter Product Meters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___METER_PRODUCT_METERS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Money Work Efforts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___MONEY_WORK_EFFORTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Order Headers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___ORDER_HEADERS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Orig Currency Acctg Trans Entries</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___ORIG_CURRENCY_ACCTG_TRANS_ENTRIES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Parties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___PARTIES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Party Acctg Preferences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___PARTY_ACCTG_PREFERENCES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Payment Gateway Responses</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___PAYMENT_GATEWAY_RESPONSES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Period Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___PERIOD_TYPES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Price Shipment Cost Estimates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___PRICE_SHIPMENT_COST_ESTIMATES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Product Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___PRODUCT_FEATURES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>Product Stores</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___PRODUCT_STORES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Quantity Products</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___QUANTITY_PRODUCTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Quantity Sales Forecast Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___QUANTITY_SALES_FORECAST_DETAILS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 47;

	/**
	 * The operation id for the '<em>Quantity Shipment Cost Estimates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___QUANTITY_SHIPMENT_COST_ESTIMATES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 48;

	/**
	 * The operation id for the '<em>Quote Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___QUOTE_ITEMS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 49;

	/**
	 * The operation id for the '<em>Quotes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___QUOTES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 50;

	/**
	 * The operation id for the '<em>Recurring Freq Order Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___RECURRING_FREQ_ORDER_ITEMS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 51;

	/**
	 * The operation id for the '<em>Return Headers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___RETURN_HEADERS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 52;

	/**
	 * The operation id for the '<em>Sales Forecast Histories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___SALES_FORECAST_HISTORIES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 53;

	/**
	 * The operation id for the '<em>Sales Forecasts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___SALES_FORECASTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 54;

	/**
	 * The operation id for the '<em>Sales Opportunities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___SALES_OPPORTUNITIES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 55;

	/**
	 * The operation id for the '<em>Sales Opportunity Histories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___SALES_OPPORTUNITY_HISTORIES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 56;

	/**
	 * The operation id for the '<em>Supplier Product Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___SUPPLIER_PRODUCT_FEATURES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 57;

	/**
	 * The operation id for the '<em>Total Cubic Order Delivery Schedules</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___TOTAL_CUBIC_ORDER_DELIVERY_SCHEDULES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 58;

	/**
	 * The operation id for the '<em>Total Weight Order Delivery Schedules</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___TOTAL_WEIGHT_ORDER_DELIVERY_SCHEDULES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 59;

	/**
	 * The operation id for the '<em>Uom Groups</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___UOM_GROUPS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 60;

	/**
	 * The operation id for the '<em>Use Time Subscriptions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___USE_TIME_SUBSCRIPTIONS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 61;

	/**
	 * The operation id for the '<em>Weight Facilities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___WEIGHT_FACILITIES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 62;

	/**
	 * The operation id for the '<em>Weight Products</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___WEIGHT_PRODUCTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 63;

	/**
	 * The operation id for the '<em>Weight Shipment Box Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___WEIGHT_SHIPMENT_BOX_TYPES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 64;

	/**
	 * The operation id for the '<em>Weight Shipment Cost Estimates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___WEIGHT_SHIPMENT_COST_ESTIMATES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 65;

	/**
	 * The operation id for the '<em>Weight Shipment Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___WEIGHT_SHIPMENT_PACKAGES = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 66;

	/**
	 * The operation id for the '<em>Width Products</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM___WIDTH_PRODUCTS = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 67;

	/**
	 * The number of operations of the '<em>Uom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_OPERATION_COUNT = BizPackage.BIZ_ENTITY_TYPED_OPERATION_COUNT + 68;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.uom.impl.UomConversionImpl <em>Conversion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.uom.impl.UomConversionImpl
	 * @see org.abchip.mimo.biz.common.uom.impl.UomPackageImpl#getUomConversion()
	 * @generated
	 */
	int UOM_CONVERSION = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Conversion Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__CONVERSION_FACTOR = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decimal Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__DECIMAL_SCALE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rounding Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__ROUNDING_MODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uom Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__UOM_ID_TO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Custom Method Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION__CUSTOM_METHOD_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The number of operations of the '<em>Conversion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.uom.impl.UomConversionDatedImpl <em>Conversion Dated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.uom.impl.UomConversionDatedImpl
	 * @see org.abchip.mimo.biz.common.uom.impl.UomPackageImpl#getUomConversionDated()
	 * @generated
	 */
	int UOM_CONVERSION_DATED = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conversion Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__CONVERSION_FACTOR = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Decimal Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__DECIMAL_SCALE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rounding Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__ROUNDING_MODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Uom Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__UOM_ID_TO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Custom Method Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__CUSTOM_METHOD_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Purpose Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED__PURPOSE_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Conversion Dated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The number of operations of the '<em>Conversion Dated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_CONVERSION_DATED_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.uom.impl.UomGroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.uom.impl.UomGroupImpl
	 * @see org.abchip.mimo.biz.common.uom.impl.UomPackageImpl#getUomGroup()
	 * @generated
	 */
	int UOM_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Uom Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP__UOM_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP__UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP___ISA = BizPackage.BIZ_ENTITY___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP___GET_NAME = BizPackage.BIZ_ENTITY___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP___GET_URI = BizPackage.BIZ_ENTITY___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP___IS_PROXY = BizPackage.BIZ_ENTITY___IS_PROXY;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_GROUP_OPERATION_COUNT = BizPackage.BIZ_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.common.uom.impl.UomTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.common.uom.impl.UomTypeImpl
	 * @see org.abchip.mimo.biz.common.uom.impl.UomPackageImpl#getUomType()
	 * @generated
	 */
	int UOM_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Uom Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__UOM_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;


	/**
	 * The operation id for the '<em>Isa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE___ISA = BizPackage.BIZ_ENTITY_TYPE___ISA;

	/**
	 * The operation id for the '<em>Get Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE___GET_NAME = BizPackage.BIZ_ENTITY_TYPE___GET_NAME;

	/**
	 * The operation id for the '<em>Get URI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE___GET_URI = BizPackage.BIZ_ENTITY_TYPE___GET_URI;

	/**
	 * The operation id for the '<em>Is Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE___IS_PROXY = BizPackage.BIZ_ENTITY_TYPE___IS_PROXY;

	/**
	 * The operation id for the '<em>Get Frame</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE___GET_FRAME = BizPackage.BIZ_ENTITY_TYPE___GET_FRAME;

	/**
	 * The operation id for the '<em>Get Type Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE___GET_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE___GET_TYPE_ID;

	/**
	 * The operation id for the '<em>Has Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE___HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE___HAS_TABLE;

	/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE___GET_TEXT = BizPackage.BIZ_ENTITY_TYPE___GET_TEXT;

	/**
	 * The operation id for the '<em>Amount Products</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE___AMOUNT_PRODUCTS = BizPackage.BIZ_ENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Child Uom Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE___CHILD_UOM_TYPES = BizPackage.BIZ_ENTITY_TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Uoms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE___UOMS = BizPackage.BIZ_ENTITY_TYPE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TYPE_OPERATION_COUNT = BizPackage.BIZ_ENTITY_TYPE_OPERATION_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.uom.Uom <em>Uom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uom</em>'.
	 * @see org.abchip.mimo.biz.common.uom.Uom
	 * @generated
	 */
	EClass getUom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.Uom#getUomId <em>Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uom Id</em>'.
	 * @see org.abchip.mimo.biz.common.uom.Uom#getUomId()
	 * @see #getUom()
	 * @generated
	 */
	EAttribute getUom_UomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.Uom#getAbbreviation <em>Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbreviation</em>'.
	 * @see org.abchip.mimo.biz.common.uom.Uom#getAbbreviation()
	 * @see #getUom()
	 * @generated
	 */
	EAttribute getUom_Abbreviation();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.Uom#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.common.uom.Uom#getDescription()
	 * @see #getUom()
	 * @generated
	 */
	EAttribute getUom_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.Uom#getNumericCode <em>Numeric Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numeric Code</em>'.
	 * @see org.abchip.mimo.biz.common.uom.Uom#getNumericCode()
	 * @see #getUom()
	 * @generated
	 */
	EAttribute getUom_NumericCode();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.uom.Uom#getUomTypeId <em>Uom Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.uom.Uom#getUomTypeId()
	 * @see #getUom()
	 * @generated
	 */
	EReference getUom_UomTypeId();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.biz.common.uom.Uom#getMainUomConversions <em>Main Uom Conversions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Main Uom Conversions</em>'.
	 * @see org.abchip.mimo.biz.common.uom.Uom#getMainUomConversions()
	 * @see #getUom()
	 * @generated
	 */
	EAttribute getUom_MainUomConversions();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#actualCurrencyPayments() <em>Actual Currency Payments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Actual Currency Payments</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#actualCurrencyPayments()
	 * @generated
	 */
	EOperation getUom__ActualCurrencyPayments();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#availableTimeSubscriptions() <em>Available Time Subscriptions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Available Time Subscriptions</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#availableTimeSubscriptions()
	 * @generated
	 */
	EOperation getUom__AvailableTimeSubscriptions();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#billingAccountTerms() <em>Billing Account Terms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Billing Account Terms</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#billingAccountTerms()
	 * @generated
	 */
	EOperation getUom__BillingAccountTerms();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#billingAccounts() <em>Billing Accounts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Billing Accounts</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#billingAccounts()
	 * @generated
	 */
	EOperation getUom__BillingAccounts();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#billingWeightShipmentRouteSegments() <em>Billing Weight Shipment Route Segments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Billing Weight Shipment Route Segments</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#billingWeightShipmentRouteSegments()
	 * @generated
	 */
	EOperation getUom__BillingWeightShipmentRouteSegments();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#cancelTimeSubscriptions() <em>Cancel Time Subscriptions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Time Subscriptions</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#cancelTimeSubscriptions()
	 * @generated
	 */
	EOperation getUom__CancelTimeSubscriptions();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#convToUomConversions() <em>Conv To Uom Conversions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Conv To Uom Conversions</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#convToUomConversions()
	 * @generated
	 */
	EOperation getUom__ConvToUomConversions();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#costComponentCalcs() <em>Cost Component Calcs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cost Component Calcs</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#costComponentCalcs()
	 * @generated
	 */
	EOperation getUom__CostComponentCalcs();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#currencyAcctgTransEntries() <em>Currency Acctg Trans Entries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Currency Acctg Trans Entries</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#currencyAcctgTransEntries()
	 * @generated
	 */
	EOperation getUom__CurrencyAcctgTransEntries();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#currencyCostComponents() <em>Currency Cost Components</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Currency Cost Components</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#currencyCostComponents()
	 * @generated
	 */
	EOperation getUom__CurrencyCostComponents();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#currencyCustRequests() <em>Currency Cust Requests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Currency Cust Requests</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#currencyCustRequests()
	 * @generated
	 */
	EOperation getUom__CurrencyCustRequests();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#currencyFinAccounts() <em>Currency Fin Accounts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Currency Fin Accounts</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#currencyFinAccounts()
	 * @generated
	 */
	EOperation getUom__CurrencyFinAccounts();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#currencyInventoryItems() <em>Currency Inventory Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Currency Inventory Items</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#currencyInventoryItems()
	 * @generated
	 */
	EOperation getUom__CurrencyInventoryItems();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#currencyInvoices() <em>Currency Invoices</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Currency Invoices</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#currencyInvoices()
	 * @generated
	 */
	EOperation getUom__CurrencyInvoices();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#currencyPayments() <em>Currency Payments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Currency Payments</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#currencyPayments()
	 * @generated
	 */
	EOperation getUom__CurrencyPayments();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#currencyShipmentRouteSegments() <em>Currency Shipment Route Segments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Currency Shipment Route Segments</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#currencyShipmentRouteSegments()
	 * @generated
	 */
	EOperation getUom__CurrencyShipmentRouteSegments();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#currencyShipments() <em>Currency Shipments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Currency Shipments</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#currencyShipments()
	 * @generated
	 */
	EOperation getUom__CurrencyShipments();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#defaultProductMeterTypes() <em>Default Product Meter Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Default Product Meter Types</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#defaultProductMeterTypes()
	 * @generated
	 */
	EOperation getUom__DefaultProductMeterTypes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#depthProducts() <em>Depth Products</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Depth Products</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#depthProducts()
	 * @generated
	 */
	EOperation getUom__DepthProducts();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#diameterProducts() <em>Diameter Products</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Diameter Products</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#diameterProducts()
	 * @generated
	 */
	EOperation getUom__DiameterProducts();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#dimensionFacilities() <em>Dimension Facilities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dimension Facilities</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#dimensionFacilities()
	 * @generated
	 */
	EOperation getUom__DimensionFacilities();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#dimensionShipmentBoxTypes() <em>Dimension Shipment Box Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dimension Shipment Box Types</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#dimensionShipmentBoxTypes()
	 * @generated
	 */
	EOperation getUom__DimensionShipmentBoxTypes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#dimensionShipmentPackages() <em>Dimension Shipment Packages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dimension Shipment Packages</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#dimensionShipmentPackages()
	 * @generated
	 */
	EOperation getUom__DimensionShipmentPackages();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#elevationGeoPoints() <em>Elevation Geo Points</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Elevation Geo Points</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#elevationGeoPoints()
	 * @generated
	 */
	EOperation getUom__ElevationGeoPoints();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#facilitySizeFacilities() <em>Facility Size Facilities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Facility Size Facilities</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#facilitySizeFacilities()
	 * @generated
	 */
	EOperation getUom__FacilitySizeFacilities();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#fixedAssets() <em>Fixed Assets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fixed Assets</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#fixedAssets()
	 * @generated
	 */
	EOperation getUom__FixedAssets();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#gracePeriodSubscriptions() <em>Grace Period Subscriptions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Grace Period Subscriptions</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#gracePeriodSubscriptions()
	 * @generated
	 */
	EOperation getUom__GracePeriodSubscriptions();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#heightProducts() <em>Height Products</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Height Products</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#heightProducts()
	 * @generated
	 */
	EOperation getUom__HeightProducts();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#intervalFixedAssetMaints() <em>Interval Fixed Asset Maints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Interval Fixed Asset Maints</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#intervalFixedAssetMaints()
	 * @generated
	 */
	EOperation getUom__IntervalFixedAssetMaints();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#intervalProductMaints() <em>Interval Product Maints</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Interval Product Maints</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#intervalProductMaints()
	 * @generated
	 */
	EOperation getUom__IntervalProductMaints();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#inventoryItems() <em>Inventory Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inventory Items</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#inventoryItems()
	 * @generated
	 */
	EOperation getUom__InventoryItems();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#invoiceItems() <em>Invoice Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Invoice Items</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#invoiceItems()
	 * @generated
	 */
	EOperation getUom__InvoiceItems();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#marketingCampaigns() <em>Marketing Campaigns</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Marketing Campaigns</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#marketingCampaigns()
	 * @generated
	 */
	EOperation getUom__MarketingCampaigns();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#maxLifeTimeSubscriptions() <em>Max Life Time Subscriptions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Max Life Time Subscriptions</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#maxLifeTimeSubscriptions()
	 * @generated
	 */
	EOperation getUom__MaxLifeTimeSubscriptions();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#maximumAmountCustRequests() <em>Maximum Amount Cust Requests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Maximum Amount Cust Requests</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#maximumAmountCustRequests()
	 * @generated
	 */
	EOperation getUom__MaximumAmountCustRequests();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#meterProductMeters() <em>Meter Product Meters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Meter Product Meters</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#meterProductMeters()
	 * @generated
	 */
	EOperation getUom__MeterProductMeters();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#moneyWorkEfforts() <em>Money Work Efforts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Money Work Efforts</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#moneyWorkEfforts()
	 * @generated
	 */
	EOperation getUom__MoneyWorkEfforts();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#orderHeaders() <em>Order Headers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Order Headers</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#orderHeaders()
	 * @generated
	 */
	EOperation getUom__OrderHeaders();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#origCurrencyAcctgTransEntries() <em>Orig Currency Acctg Trans Entries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Orig Currency Acctg Trans Entries</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#origCurrencyAcctgTransEntries()
	 * @generated
	 */
	EOperation getUom__OrigCurrencyAcctgTransEntries();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#parties() <em>Parties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parties</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#parties()
	 * @generated
	 */
	EOperation getUom__Parties();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#partyAcctgPreferences() <em>Party Acctg Preferences</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Party Acctg Preferences</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#partyAcctgPreferences()
	 * @generated
	 */
	EOperation getUom__PartyAcctgPreferences();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#paymentGatewayResponses() <em>Payment Gateway Responses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Payment Gateway Responses</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#paymentGatewayResponses()
	 * @generated
	 */
	EOperation getUom__PaymentGatewayResponses();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#periodTypes() <em>Period Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Period Types</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#periodTypes()
	 * @generated
	 */
	EOperation getUom__PeriodTypes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#priceShipmentCostEstimates() <em>Price Shipment Cost Estimates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Price Shipment Cost Estimates</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#priceShipmentCostEstimates()
	 * @generated
	 */
	EOperation getUom__PriceShipmentCostEstimates();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#productFeatures() <em>Product Features</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Product Features</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#productFeatures()
	 * @generated
	 */
	EOperation getUom__ProductFeatures();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#productStores() <em>Product Stores</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Product Stores</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#productStores()
	 * @generated
	 */
	EOperation getUom__ProductStores();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#quantityProducts() <em>Quantity Products</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Quantity Products</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#quantityProducts()
	 * @generated
	 */
	EOperation getUom__QuantityProducts();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#quantitySalesForecastDetails() <em>Quantity Sales Forecast Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Quantity Sales Forecast Details</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#quantitySalesForecastDetails()
	 * @generated
	 */
	EOperation getUom__QuantitySalesForecastDetails();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#quantityShipmentCostEstimates() <em>Quantity Shipment Cost Estimates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Quantity Shipment Cost Estimates</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#quantityShipmentCostEstimates()
	 * @generated
	 */
	EOperation getUom__QuantityShipmentCostEstimates();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#quoteItems() <em>Quote Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Quote Items</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#quoteItems()
	 * @generated
	 */
	EOperation getUom__QuoteItems();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#quotes() <em>Quotes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Quotes</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#quotes()
	 * @generated
	 */
	EOperation getUom__Quotes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#recurringFreqOrderItems() <em>Recurring Freq Order Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Recurring Freq Order Items</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#recurringFreqOrderItems()
	 * @generated
	 */
	EOperation getUom__RecurringFreqOrderItems();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#returnHeaders() <em>Return Headers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Return Headers</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#returnHeaders()
	 * @generated
	 */
	EOperation getUom__ReturnHeaders();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#salesForecastHistories() <em>Sales Forecast Histories</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sales Forecast Histories</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#salesForecastHistories()
	 * @generated
	 */
	EOperation getUom__SalesForecastHistories();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#salesForecasts() <em>Sales Forecasts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sales Forecasts</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#salesForecasts()
	 * @generated
	 */
	EOperation getUom__SalesForecasts();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#salesOpportunities() <em>Sales Opportunities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sales Opportunities</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#salesOpportunities()
	 * @generated
	 */
	EOperation getUom__SalesOpportunities();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#salesOpportunityHistories() <em>Sales Opportunity Histories</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sales Opportunity Histories</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#salesOpportunityHistories()
	 * @generated
	 */
	EOperation getUom__SalesOpportunityHistories();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#supplierProductFeatures() <em>Supplier Product Features</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Supplier Product Features</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#supplierProductFeatures()
	 * @generated
	 */
	EOperation getUom__SupplierProductFeatures();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#totalCubicOrderDeliverySchedules() <em>Total Cubic Order Delivery Schedules</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Total Cubic Order Delivery Schedules</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#totalCubicOrderDeliverySchedules()
	 * @generated
	 */
	EOperation getUom__TotalCubicOrderDeliverySchedules();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#totalWeightOrderDeliverySchedules() <em>Total Weight Order Delivery Schedules</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Total Weight Order Delivery Schedules</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#totalWeightOrderDeliverySchedules()
	 * @generated
	 */
	EOperation getUom__TotalWeightOrderDeliverySchedules();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#uomGroups() <em>Uom Groups</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Uom Groups</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#uomGroups()
	 * @generated
	 */
	EOperation getUom__UomGroups();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#useTimeSubscriptions() <em>Use Time Subscriptions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Use Time Subscriptions</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#useTimeSubscriptions()
	 * @generated
	 */
	EOperation getUom__UseTimeSubscriptions();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#weightFacilities() <em>Weight Facilities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Weight Facilities</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#weightFacilities()
	 * @generated
	 */
	EOperation getUom__WeightFacilities();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#weightProducts() <em>Weight Products</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Weight Products</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#weightProducts()
	 * @generated
	 */
	EOperation getUom__WeightProducts();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#weightShipmentBoxTypes() <em>Weight Shipment Box Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Weight Shipment Box Types</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#weightShipmentBoxTypes()
	 * @generated
	 */
	EOperation getUom__WeightShipmentBoxTypes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#weightShipmentCostEstimates() <em>Weight Shipment Cost Estimates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Weight Shipment Cost Estimates</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#weightShipmentCostEstimates()
	 * @generated
	 */
	EOperation getUom__WeightShipmentCostEstimates();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#weightShipmentPackages() <em>Weight Shipment Packages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Weight Shipment Packages</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#weightShipmentPackages()
	 * @generated
	 */
	EOperation getUom__WeightShipmentPackages();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.Uom#widthProducts() <em>Width Products</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Width Products</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.Uom#widthProducts()
	 * @generated
	 */
	EOperation getUom__WidthProducts();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.uom.UomConversion <em>Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversion
	 * @generated
	 */
	EClass getUomConversion();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.uom.UomConversion#getUomId <em>Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom Id</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversion#getUomId()
	 * @see #getUomConversion()
	 * @generated
	 */
	EReference getUomConversion_UomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.uom.UomConversion#getUomIdTo <em>Uom Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom Id To</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversion#getUomIdTo()
	 * @see #getUomConversion()
	 * @generated
	 */
	EReference getUomConversion_UomIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.UomConversion#getConversionFactor <em>Conversion Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversion Factor</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversion#getConversionFactor()
	 * @see #getUomConversion()
	 * @generated
	 */
	EAttribute getUomConversion_ConversionFactor();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.uom.UomConversion#getCustomMethodId <em>Custom Method Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Custom Method Id</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversion#getCustomMethodId()
	 * @see #getUomConversion()
	 * @generated
	 */
	EReference getUomConversion_CustomMethodId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.UomConversion#getDecimalScale <em>Decimal Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal Scale</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversion#getDecimalScale()
	 * @see #getUomConversion()
	 * @generated
	 */
	EAttribute getUomConversion_DecimalScale();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.UomConversion#getRoundingMode <em>Rounding Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rounding Mode</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversion#getRoundingMode()
	 * @see #getUomConversion()
	 * @generated
	 */
	EAttribute getUomConversion_RoundingMode();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.uom.UomConversionDated <em>Conversion Dated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conversion Dated</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversionDated
	 * @generated
	 */
	EClass getUomConversionDated();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getUomId <em>Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom Id</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversionDated#getUomId()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EReference getUomConversionDated_UomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getUomIdTo <em>Uom Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom Id To</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversionDated#getUomIdTo()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EReference getUomConversionDated_UomIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversionDated#getFromDate()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EAttribute getUomConversionDated_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getConversionFactor <em>Conversion Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversion Factor</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversionDated#getConversionFactor()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EAttribute getUomConversionDated_ConversionFactor();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getCustomMethodId <em>Custom Method Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Custom Method Id</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversionDated#getCustomMethodId()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EReference getUomConversionDated_CustomMethodId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getDecimalScale <em>Decimal Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal Scale</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversionDated#getDecimalScale()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EAttribute getUomConversionDated_DecimalScale();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getPurposeEnumId <em>Purpose Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Purpose Enum Id</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversionDated#getPurposeEnumId()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EReference getUomConversionDated_PurposeEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getRoundingMode <em>Rounding Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rounding Mode</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversionDated#getRoundingMode()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EAttribute getUomConversionDated_RoundingMode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.UomConversionDated#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomConversionDated#getThruDate()
	 * @see #getUomConversionDated()
	 * @generated
	 */
	EAttribute getUomConversionDated_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.uom.UomGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomGroup
	 * @generated
	 */
	EClass getUomGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.UomGroup#getUomGroupId <em>Uom Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uom Group Id</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomGroup#getUomGroupId()
	 * @see #getUomGroup()
	 * @generated
	 */
	EAttribute getUomGroup_UomGroupId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.uom.UomGroup#getUomId <em>Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom Id</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomGroup#getUomId()
	 * @see #getUomGroup()
	 * @generated
	 */
	EReference getUomGroup_UomId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.common.uom.UomType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomType
	 * @generated
	 */
	EClass getUomType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.UomType#getUomTypeId <em>Uom Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uom Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomType#getUomTypeId()
	 * @see #getUomType()
	 * @generated
	 */
	EAttribute getUomType_UomTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.UomType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomType#getDescription()
	 * @see #getUomType()
	 * @generated
	 */
	EAttribute getUomType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.common.uom.UomType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomType#isHasTable()
	 * @see #getUomType()
	 * @generated
	 */
	EAttribute getUomType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.common.uom.UomType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.common.uom.UomType#getParentTypeId()
	 * @see #getUomType()
	 * @generated
	 */
	EReference getUomType_ParentTypeId();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.UomType#amountProducts() <em>Amount Products</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Amount Products</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.UomType#amountProducts()
	 * @generated
	 */
	EOperation getUomType__AmountProducts();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.UomType#childUomTypes() <em>Child Uom Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Child Uom Types</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.UomType#childUomTypes()
	 * @generated
	 */
	EOperation getUomType__ChildUomTypes();

	/**
	 * Returns the meta object for the '{@link org.abchip.mimo.biz.common.uom.UomType#uoms() <em>Uoms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Uoms</em>' operation.
	 * @see org.abchip.mimo.biz.common.uom.UomType#uoms()
	 * @generated
	 */
	EOperation getUomType__Uoms();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UomFactory getUomFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.uom.impl.UomImpl <em>Uom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.uom.impl.UomImpl
		 * @see org.abchip.mimo.biz.common.uom.impl.UomPackageImpl#getUom()
		 * @generated
		 */
		EClass UOM = eINSTANCE.getUom();

		/**
		 * The meta object literal for the '<em><b>Uom Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM__UOM_ID = eINSTANCE.getUom_UomId();

		/**
		 * The meta object literal for the '<em><b>Abbreviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM__ABBREVIATION = eINSTANCE.getUom_Abbreviation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM__DESCRIPTION = eINSTANCE.getUom_Description();

		/**
		 * The meta object literal for the '<em><b>Numeric Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM__NUMERIC_CODE = eINSTANCE.getUom_NumericCode();

		/**
		 * The meta object literal for the '<em><b>Uom Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM__UOM_TYPE_ID = eINSTANCE.getUom_UomTypeId();

		/**
		 * The meta object literal for the '<em><b>Main Uom Conversions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM__MAIN_UOM_CONVERSIONS = eINSTANCE.getUom_MainUomConversions();

		/**
		 * The meta object literal for the '<em><b>Actual Currency Payments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___ACTUAL_CURRENCY_PAYMENTS = eINSTANCE.getUom__ActualCurrencyPayments();

		/**
		 * The meta object literal for the '<em><b>Available Time Subscriptions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___AVAILABLE_TIME_SUBSCRIPTIONS = eINSTANCE.getUom__AvailableTimeSubscriptions();

		/**
		 * The meta object literal for the '<em><b>Billing Account Terms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___BILLING_ACCOUNT_TERMS = eINSTANCE.getUom__BillingAccountTerms();

		/**
		 * The meta object literal for the '<em><b>Billing Accounts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___BILLING_ACCOUNTS = eINSTANCE.getUom__BillingAccounts();

		/**
		 * The meta object literal for the '<em><b>Billing Weight Shipment Route Segments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___BILLING_WEIGHT_SHIPMENT_ROUTE_SEGMENTS = eINSTANCE.getUom__BillingWeightShipmentRouteSegments();

		/**
		 * The meta object literal for the '<em><b>Cancel Time Subscriptions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___CANCEL_TIME_SUBSCRIPTIONS = eINSTANCE.getUom__CancelTimeSubscriptions();

		/**
		 * The meta object literal for the '<em><b>Conv To Uom Conversions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___CONV_TO_UOM_CONVERSIONS = eINSTANCE.getUom__ConvToUomConversions();

		/**
		 * The meta object literal for the '<em><b>Cost Component Calcs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___COST_COMPONENT_CALCS = eINSTANCE.getUom__CostComponentCalcs();

		/**
		 * The meta object literal for the '<em><b>Currency Acctg Trans Entries</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___CURRENCY_ACCTG_TRANS_ENTRIES = eINSTANCE.getUom__CurrencyAcctgTransEntries();

		/**
		 * The meta object literal for the '<em><b>Currency Cost Components</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___CURRENCY_COST_COMPONENTS = eINSTANCE.getUom__CurrencyCostComponents();

		/**
		 * The meta object literal for the '<em><b>Currency Cust Requests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___CURRENCY_CUST_REQUESTS = eINSTANCE.getUom__CurrencyCustRequests();

		/**
		 * The meta object literal for the '<em><b>Currency Fin Accounts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___CURRENCY_FIN_ACCOUNTS = eINSTANCE.getUom__CurrencyFinAccounts();

		/**
		 * The meta object literal for the '<em><b>Currency Inventory Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___CURRENCY_INVENTORY_ITEMS = eINSTANCE.getUom__CurrencyInventoryItems();

		/**
		 * The meta object literal for the '<em><b>Currency Invoices</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___CURRENCY_INVOICES = eINSTANCE.getUom__CurrencyInvoices();

		/**
		 * The meta object literal for the '<em><b>Currency Payments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___CURRENCY_PAYMENTS = eINSTANCE.getUom__CurrencyPayments();

		/**
		 * The meta object literal for the '<em><b>Currency Shipment Route Segments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___CURRENCY_SHIPMENT_ROUTE_SEGMENTS = eINSTANCE.getUom__CurrencyShipmentRouteSegments();

		/**
		 * The meta object literal for the '<em><b>Currency Shipments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___CURRENCY_SHIPMENTS = eINSTANCE.getUom__CurrencyShipments();

		/**
		 * The meta object literal for the '<em><b>Default Product Meter Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___DEFAULT_PRODUCT_METER_TYPES = eINSTANCE.getUom__DefaultProductMeterTypes();

		/**
		 * The meta object literal for the '<em><b>Depth Products</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___DEPTH_PRODUCTS = eINSTANCE.getUom__DepthProducts();

		/**
		 * The meta object literal for the '<em><b>Diameter Products</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___DIAMETER_PRODUCTS = eINSTANCE.getUom__DiameterProducts();

		/**
		 * The meta object literal for the '<em><b>Dimension Facilities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___DIMENSION_FACILITIES = eINSTANCE.getUom__DimensionFacilities();

		/**
		 * The meta object literal for the '<em><b>Dimension Shipment Box Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___DIMENSION_SHIPMENT_BOX_TYPES = eINSTANCE.getUom__DimensionShipmentBoxTypes();

		/**
		 * The meta object literal for the '<em><b>Dimension Shipment Packages</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___DIMENSION_SHIPMENT_PACKAGES = eINSTANCE.getUom__DimensionShipmentPackages();

		/**
		 * The meta object literal for the '<em><b>Elevation Geo Points</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___ELEVATION_GEO_POINTS = eINSTANCE.getUom__ElevationGeoPoints();

		/**
		 * The meta object literal for the '<em><b>Facility Size Facilities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___FACILITY_SIZE_FACILITIES = eINSTANCE.getUom__FacilitySizeFacilities();

		/**
		 * The meta object literal for the '<em><b>Fixed Assets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___FIXED_ASSETS = eINSTANCE.getUom__FixedAssets();

		/**
		 * The meta object literal for the '<em><b>Grace Period Subscriptions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___GRACE_PERIOD_SUBSCRIPTIONS = eINSTANCE.getUom__GracePeriodSubscriptions();

		/**
		 * The meta object literal for the '<em><b>Height Products</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___HEIGHT_PRODUCTS = eINSTANCE.getUom__HeightProducts();

		/**
		 * The meta object literal for the '<em><b>Interval Fixed Asset Maints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___INTERVAL_FIXED_ASSET_MAINTS = eINSTANCE.getUom__IntervalFixedAssetMaints();

		/**
		 * The meta object literal for the '<em><b>Interval Product Maints</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___INTERVAL_PRODUCT_MAINTS = eINSTANCE.getUom__IntervalProductMaints();

		/**
		 * The meta object literal for the '<em><b>Inventory Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___INVENTORY_ITEMS = eINSTANCE.getUom__InventoryItems();

		/**
		 * The meta object literal for the '<em><b>Invoice Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___INVOICE_ITEMS = eINSTANCE.getUom__InvoiceItems();

		/**
		 * The meta object literal for the '<em><b>Marketing Campaigns</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___MARKETING_CAMPAIGNS = eINSTANCE.getUom__MarketingCampaigns();

		/**
		 * The meta object literal for the '<em><b>Max Life Time Subscriptions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___MAX_LIFE_TIME_SUBSCRIPTIONS = eINSTANCE.getUom__MaxLifeTimeSubscriptions();

		/**
		 * The meta object literal for the '<em><b>Maximum Amount Cust Requests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___MAXIMUM_AMOUNT_CUST_REQUESTS = eINSTANCE.getUom__MaximumAmountCustRequests();

		/**
		 * The meta object literal for the '<em><b>Meter Product Meters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___METER_PRODUCT_METERS = eINSTANCE.getUom__MeterProductMeters();

		/**
		 * The meta object literal for the '<em><b>Money Work Efforts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___MONEY_WORK_EFFORTS = eINSTANCE.getUom__MoneyWorkEfforts();

		/**
		 * The meta object literal for the '<em><b>Order Headers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___ORDER_HEADERS = eINSTANCE.getUom__OrderHeaders();

		/**
		 * The meta object literal for the '<em><b>Orig Currency Acctg Trans Entries</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___ORIG_CURRENCY_ACCTG_TRANS_ENTRIES = eINSTANCE.getUom__OrigCurrencyAcctgTransEntries();

		/**
		 * The meta object literal for the '<em><b>Parties</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___PARTIES = eINSTANCE.getUom__Parties();

		/**
		 * The meta object literal for the '<em><b>Party Acctg Preferences</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___PARTY_ACCTG_PREFERENCES = eINSTANCE.getUom__PartyAcctgPreferences();

		/**
		 * The meta object literal for the '<em><b>Payment Gateway Responses</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___PAYMENT_GATEWAY_RESPONSES = eINSTANCE.getUom__PaymentGatewayResponses();

		/**
		 * The meta object literal for the '<em><b>Period Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___PERIOD_TYPES = eINSTANCE.getUom__PeriodTypes();

		/**
		 * The meta object literal for the '<em><b>Price Shipment Cost Estimates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___PRICE_SHIPMENT_COST_ESTIMATES = eINSTANCE.getUom__PriceShipmentCostEstimates();

		/**
		 * The meta object literal for the '<em><b>Product Features</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___PRODUCT_FEATURES = eINSTANCE.getUom__ProductFeatures();

		/**
		 * The meta object literal for the '<em><b>Product Stores</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___PRODUCT_STORES = eINSTANCE.getUom__ProductStores();

		/**
		 * The meta object literal for the '<em><b>Quantity Products</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___QUANTITY_PRODUCTS = eINSTANCE.getUom__QuantityProducts();

		/**
		 * The meta object literal for the '<em><b>Quantity Sales Forecast Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___QUANTITY_SALES_FORECAST_DETAILS = eINSTANCE.getUom__QuantitySalesForecastDetails();

		/**
		 * The meta object literal for the '<em><b>Quantity Shipment Cost Estimates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___QUANTITY_SHIPMENT_COST_ESTIMATES = eINSTANCE.getUom__QuantityShipmentCostEstimates();

		/**
		 * The meta object literal for the '<em><b>Quote Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___QUOTE_ITEMS = eINSTANCE.getUom__QuoteItems();

		/**
		 * The meta object literal for the '<em><b>Quotes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___QUOTES = eINSTANCE.getUom__Quotes();

		/**
		 * The meta object literal for the '<em><b>Recurring Freq Order Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___RECURRING_FREQ_ORDER_ITEMS = eINSTANCE.getUom__RecurringFreqOrderItems();

		/**
		 * The meta object literal for the '<em><b>Return Headers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___RETURN_HEADERS = eINSTANCE.getUom__ReturnHeaders();

		/**
		 * The meta object literal for the '<em><b>Sales Forecast Histories</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___SALES_FORECAST_HISTORIES = eINSTANCE.getUom__SalesForecastHistories();

		/**
		 * The meta object literal for the '<em><b>Sales Forecasts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___SALES_FORECASTS = eINSTANCE.getUom__SalesForecasts();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___SALES_OPPORTUNITIES = eINSTANCE.getUom__SalesOpportunities();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity Histories</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___SALES_OPPORTUNITY_HISTORIES = eINSTANCE.getUom__SalesOpportunityHistories();

		/**
		 * The meta object literal for the '<em><b>Supplier Product Features</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___SUPPLIER_PRODUCT_FEATURES = eINSTANCE.getUom__SupplierProductFeatures();

		/**
		 * The meta object literal for the '<em><b>Total Cubic Order Delivery Schedules</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___TOTAL_CUBIC_ORDER_DELIVERY_SCHEDULES = eINSTANCE.getUom__TotalCubicOrderDeliverySchedules();

		/**
		 * The meta object literal for the '<em><b>Total Weight Order Delivery Schedules</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___TOTAL_WEIGHT_ORDER_DELIVERY_SCHEDULES = eINSTANCE.getUom__TotalWeightOrderDeliverySchedules();

		/**
		 * The meta object literal for the '<em><b>Uom Groups</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___UOM_GROUPS = eINSTANCE.getUom__UomGroups();

		/**
		 * The meta object literal for the '<em><b>Use Time Subscriptions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___USE_TIME_SUBSCRIPTIONS = eINSTANCE.getUom__UseTimeSubscriptions();

		/**
		 * The meta object literal for the '<em><b>Weight Facilities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___WEIGHT_FACILITIES = eINSTANCE.getUom__WeightFacilities();

		/**
		 * The meta object literal for the '<em><b>Weight Products</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___WEIGHT_PRODUCTS = eINSTANCE.getUom__WeightProducts();

		/**
		 * The meta object literal for the '<em><b>Weight Shipment Box Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___WEIGHT_SHIPMENT_BOX_TYPES = eINSTANCE.getUom__WeightShipmentBoxTypes();

		/**
		 * The meta object literal for the '<em><b>Weight Shipment Cost Estimates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___WEIGHT_SHIPMENT_COST_ESTIMATES = eINSTANCE.getUom__WeightShipmentCostEstimates();

		/**
		 * The meta object literal for the '<em><b>Weight Shipment Packages</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___WEIGHT_SHIPMENT_PACKAGES = eINSTANCE.getUom__WeightShipmentPackages();

		/**
		 * The meta object literal for the '<em><b>Width Products</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM___WIDTH_PRODUCTS = eINSTANCE.getUom__WidthProducts();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.uom.impl.UomConversionImpl <em>Conversion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.uom.impl.UomConversionImpl
		 * @see org.abchip.mimo.biz.common.uom.impl.UomPackageImpl#getUomConversion()
		 * @generated
		 */
		EClass UOM_CONVERSION = eINSTANCE.getUomConversion();

		/**
		 * The meta object literal for the '<em><b>Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_CONVERSION__UOM_ID = eINSTANCE.getUomConversion_UomId();

		/**
		 * The meta object literal for the '<em><b>Uom Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_CONVERSION__UOM_ID_TO = eINSTANCE.getUomConversion_UomIdTo();

		/**
		 * The meta object literal for the '<em><b>Conversion Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_CONVERSION__CONVERSION_FACTOR = eINSTANCE.getUomConversion_ConversionFactor();

		/**
		 * The meta object literal for the '<em><b>Custom Method Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_CONVERSION__CUSTOM_METHOD_ID = eINSTANCE.getUomConversion_CustomMethodId();

		/**
		 * The meta object literal for the '<em><b>Decimal Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_CONVERSION__DECIMAL_SCALE = eINSTANCE.getUomConversion_DecimalScale();

		/**
		 * The meta object literal for the '<em><b>Rounding Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_CONVERSION__ROUNDING_MODE = eINSTANCE.getUomConversion_RoundingMode();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.uom.impl.UomConversionDatedImpl <em>Conversion Dated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.uom.impl.UomConversionDatedImpl
		 * @see org.abchip.mimo.biz.common.uom.impl.UomPackageImpl#getUomConversionDated()
		 * @generated
		 */
		EClass UOM_CONVERSION_DATED = eINSTANCE.getUomConversionDated();

		/**
		 * The meta object literal for the '<em><b>Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_CONVERSION_DATED__UOM_ID = eINSTANCE.getUomConversionDated_UomId();

		/**
		 * The meta object literal for the '<em><b>Uom Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_CONVERSION_DATED__UOM_ID_TO = eINSTANCE.getUomConversionDated_UomIdTo();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_CONVERSION_DATED__FROM_DATE = eINSTANCE.getUomConversionDated_FromDate();

		/**
		 * The meta object literal for the '<em><b>Conversion Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_CONVERSION_DATED__CONVERSION_FACTOR = eINSTANCE.getUomConversionDated_ConversionFactor();

		/**
		 * The meta object literal for the '<em><b>Custom Method Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_CONVERSION_DATED__CUSTOM_METHOD_ID = eINSTANCE.getUomConversionDated_CustomMethodId();

		/**
		 * The meta object literal for the '<em><b>Decimal Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_CONVERSION_DATED__DECIMAL_SCALE = eINSTANCE.getUomConversionDated_DecimalScale();

		/**
		 * The meta object literal for the '<em><b>Purpose Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_CONVERSION_DATED__PURPOSE_ENUM_ID = eINSTANCE.getUomConversionDated_PurposeEnumId();

		/**
		 * The meta object literal for the '<em><b>Rounding Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_CONVERSION_DATED__ROUNDING_MODE = eINSTANCE.getUomConversionDated_RoundingMode();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_CONVERSION_DATED__THRU_DATE = eINSTANCE.getUomConversionDated_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.uom.impl.UomGroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.uom.impl.UomGroupImpl
		 * @see org.abchip.mimo.biz.common.uom.impl.UomPackageImpl#getUomGroup()
		 * @generated
		 */
		EClass UOM_GROUP = eINSTANCE.getUomGroup();

		/**
		 * The meta object literal for the '<em><b>Uom Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_GROUP__UOM_GROUP_ID = eINSTANCE.getUomGroup_UomGroupId();

		/**
		 * The meta object literal for the '<em><b>Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_GROUP__UOM_ID = eINSTANCE.getUomGroup_UomId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.common.uom.impl.UomTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.common.uom.impl.UomTypeImpl
		 * @see org.abchip.mimo.biz.common.uom.impl.UomPackageImpl#getUomType()
		 * @generated
		 */
		EClass UOM_TYPE = eINSTANCE.getUomType();

		/**
		 * The meta object literal for the '<em><b>Uom Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_TYPE__UOM_TYPE_ID = eINSTANCE.getUomType_UomTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_TYPE__DESCRIPTION = eINSTANCE.getUomType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_TYPE__HAS_TABLE = eINSTANCE.getUomType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_TYPE__PARENT_TYPE_ID = eINSTANCE.getUomType_ParentTypeId();

		/**
		 * The meta object literal for the '<em><b>Amount Products</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM_TYPE___AMOUNT_PRODUCTS = eINSTANCE.getUomType__AmountProducts();

		/**
		 * The meta object literal for the '<em><b>Child Uom Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM_TYPE___CHILD_UOM_TYPES = eINSTANCE.getUomType__ChildUomTypes();

		/**
		 * The meta object literal for the '<em><b>Uoms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UOM_TYPE___UOMS = eINSTANCE.getUomType__Uoms();

	}

} //UomPackage
