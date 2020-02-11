/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.opportunity;

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
 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityFactory
 * @model kind="package"
 * @generated
 */
public interface OpportunityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "opportunity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/marketing/opportunity";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-opportunity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpportunityPackage eINSTANCE = org.abchip.mimo.biz.marketing.opportunity.impl.OpportunityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastImpl <em>Sales Forecast</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastImpl
	 * @see org.abchip.mimo.biz.marketing.opportunity.impl.OpportunityPackageImpl#getSalesForecast()
	 * @generated
	 */
	int SALES_FORECAST = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Sales Forecast Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__SALES_FORECAST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Best Case Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__BEST_CASE_AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Closed Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__CLOSED_AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Created By User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__CREATED_BY_USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Custom Time Period Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__CUSTOM_TIME_PERIOD_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Forecast Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__FORECAST_AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Internal Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__INTERNAL_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Modified By User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__MODIFIED_BY_USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Organization Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__ORGANIZATION_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Parent Sales Forecast Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__PARENT_SALES_FORECAST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Percent Of Quota Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__PERCENT_OF_QUOTA_CLOSED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Percent Of Quota Forecast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__PERCENT_OF_QUOTA_FORECAST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Pipeline Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__PIPELINE_AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Quota Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__QUOTA_AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Sales Forecast Details</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST__SALES_FORECAST_DETAILS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Sales Forecast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastDetailImpl <em>Sales Forecast Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastDetailImpl
	 * @see org.abchip.mimo.biz.marketing.opportunity.impl.OpportunityPackageImpl#getSalesForecastDetail()
	 * @generated
	 */
	int SALES_FORECAST_DETAIL = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_DETAIL__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_DETAIL__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_DETAIL__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_DETAIL__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Sales Forecast Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_DETAIL__SALES_FORECAST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sales Forecast Detail Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_DETAIL__SALES_FORECAST_DETAIL_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_DETAIL__AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Product Category Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_DETAIL__PRODUCT_CATEGORY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_DETAIL__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_DETAIL__QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Quantity Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_DETAIL__QUANTITY_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Sales Forecast Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_DETAIL_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl <em>Sales Forecast History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl
	 * @see org.abchip.mimo.biz.marketing.opportunity.impl.OpportunityPackageImpl#getSalesForecastHistory()
	 * @generated
	 */
	int SALES_FORECAST_HISTORY = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Sales Forecast History Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__SALES_FORECAST_HISTORY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Best Case Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__BEST_CASE_AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__CHANGE_NOTE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Closed Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__CLOSED_AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Custom Time Period Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__CUSTOM_TIME_PERIOD_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Forecast Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__FORECAST_AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Internal Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__INTERNAL_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Modified By User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__MODIFIED_BY_USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Modified Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__MODIFIED_TIMESTAMP = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Organization Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__ORGANIZATION_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Parent Sales Forecast Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__PARENT_SALES_FORECAST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Percent Of Quota Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_CLOSED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Percent Of Quota Forecast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_FORECAST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Quota Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__QUOTA_AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Sales Forecast Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY__SALES_FORECAST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Sales Forecast History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_FORECAST_HISTORY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityImpl <em>Sales Opportunity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityImpl
	 * @see org.abchip.mimo.biz.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunity()
	 * @generated
	 */
	int SALES_OPPORTUNITY = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Sales Opportunity Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__SALES_OPPORTUNITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__CREATED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__DATA_SOURCE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Estimated Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__ESTIMATED_AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Estimated Close Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__ESTIMATED_CLOSE_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Estimated Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__ESTIMATED_PROBABILITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Marketing Campaign Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__MARKETING_CAMPAIGN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__NEXT_STEP = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Next Step Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__NEXT_STEP_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Opportunity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__OPPORTUNITY_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Opportunity Stage Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__OPPORTUNITY_STAGE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Sales Opportunity Competitors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__SALES_OPPORTUNITY_COMPETITORS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Sales Opportunity Quotes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__SALES_OPPORTUNITY_QUOTES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Sales Opportunity Trck Codes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__SALES_OPPORTUNITY_TRCK_CODES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Sales Opportunity Work Efforts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__SALES_OPPORTUNITY_WORK_EFFORTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Type Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY__TYPE_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Sales Opportunity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityCompetitorImpl <em>Sales Opportunity Competitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityCompetitorImpl
	 * @see org.abchip.mimo.biz.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityCompetitor()
	 * @generated
	 */
	int SALES_OPPORTUNITY_COMPETITOR = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_COMPETITOR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_COMPETITOR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_COMPETITOR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_COMPETITOR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Sales Opportunity Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_COMPETITOR__SALES_OPPORTUNITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Competitor Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_COMPETITOR__COMPETITOR_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Position Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_COMPETITOR__POSITION_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Strengths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_COMPETITOR__STRENGTHS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Weaknesses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_COMPETITOR__WEAKNESSES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Sales Opportunity Competitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_COMPETITOR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl <em>Sales Opportunity History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl
	 * @see org.abchip.mimo.biz.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityHistory()
	 * @generated
	 */
	int SALES_OPPORTUNITY_HISTORY = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Sales Opportunity History Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY_HISTORY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Change Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__CHANGE_NOTE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Estimated Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__ESTIMATED_AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Estimated Close Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__ESTIMATED_CLOSE_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Estimated Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__ESTIMATED_PROBABILITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__MODIFIED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Modified Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__MODIFIED_TIMESTAMP = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__NEXT_STEP = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Opportunity Stage Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__OPPORTUNITY_STAGE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Sales Opportunity Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Sales Opportunity History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_HISTORY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityQuoteImpl <em>Sales Opportunity Quote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityQuoteImpl
	 * @see org.abchip.mimo.biz.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityQuote()
	 * @generated
	 */
	int SALES_OPPORTUNITY_QUOTE = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_QUOTE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_QUOTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_QUOTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_QUOTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Sales Opportunity Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_QUOTE__SALES_OPPORTUNITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quote Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_QUOTE__QUOTE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sales Opportunity Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_QUOTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityRoleImpl <em>Sales Opportunity Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityRoleImpl
	 * @see org.abchip.mimo.biz.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityRole()
	 * @generated
	 */
	int SALES_OPPORTUNITY_ROLE = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_ROLE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_ROLE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_ROLE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_ROLE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Sales Opportunity Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_ROLE__SALES_OPPORTUNITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_ROLE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_ROLE__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sales Opportunity Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_ROLE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityStageImpl <em>Sales Opportunity Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityStageImpl
	 * @see org.abchip.mimo.biz.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityStage()
	 * @generated
	 */
	int SALES_OPPORTUNITY_STAGE = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_STAGE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_STAGE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_STAGE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_STAGE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Opportunity Stage Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_STAGE__OPPORTUNITY_STAGE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_STAGE__DEFAULT_PROBABILITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_STAGE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_STAGE__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sales Opportunity Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_STAGE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityTrckCodeImpl <em>Sales Opportunity Trck Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityTrckCodeImpl
	 * @see org.abchip.mimo.biz.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityTrckCode()
	 * @generated
	 */
	int SALES_OPPORTUNITY_TRCK_CODE = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_TRCK_CODE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_TRCK_CODE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_TRCK_CODE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_TRCK_CODE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Sales Opportunity Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_TRCK_CODE__SALES_OPPORTUNITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tracking Code Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_TRCK_CODE__TRACKING_CODE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Received Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_TRCK_CODE__RECEIVED_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sales Opportunity Trck Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_TRCK_CODE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityWorkEffortImpl <em>Sales Opportunity Work Effort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityWorkEffortImpl
	 * @see org.abchip.mimo.biz.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityWorkEffort()
	 * @generated
	 */
	int SALES_OPPORTUNITY_WORK_EFFORT = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_WORK_EFFORT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_WORK_EFFORT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_WORK_EFFORT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_WORK_EFFORT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Sales Opportunity Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_WORK_EFFORT__SALES_OPPORTUNITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_WORK_EFFORT__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sales Opportunity Work Effort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALES_OPPORTUNITY_WORK_EFFORT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast <em>Sales Forecast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Forecast</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecast
	 * @generated
	 */
	EClass getSalesForecast();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getSalesForecastId <em>Sales Forecast Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sales Forecast Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getSalesForecastId()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EAttribute getSalesForecast_SalesForecastId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getBestCaseAmount <em>Best Case Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Best Case Amount</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getBestCaseAmount()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EAttribute getSalesForecast_BestCaseAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getClosedAmount <em>Closed Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closed Amount</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getClosedAmount()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EAttribute getSalesForecast_ClosedAmount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getCreatedByUserLoginId <em>Created By User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By User Login Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getCreatedByUserLoginId()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EReference getSalesForecast_CreatedByUserLoginId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getCurrencyUomId <em>Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getCurrencyUomId()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EReference getSalesForecast_CurrencyUomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getCustomTimePeriodId <em>Custom Time Period Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Custom Time Period Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getCustomTimePeriodId()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EReference getSalesForecast_CustomTimePeriodId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getForecastAmount <em>Forecast Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forecast Amount</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getForecastAmount()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EAttribute getSalesForecast_ForecastAmount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getInternalPartyId <em>Internal Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Party Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getInternalPartyId()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EReference getSalesForecast_InternalPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getModifiedByUserLoginId <em>Modified By User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modified By User Login Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getModifiedByUserLoginId()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EReference getSalesForecast_ModifiedByUserLoginId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getOrganizationPartyId <em>Organization Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Party Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getOrganizationPartyId()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EReference getSalesForecast_OrganizationPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getParentSalesForecastId <em>Parent Sales Forecast Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Sales Forecast Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getParentSalesForecastId()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EReference getSalesForecast_ParentSalesForecastId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getPercentOfQuotaClosed <em>Percent Of Quota Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent Of Quota Closed</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getPercentOfQuotaClosed()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EAttribute getSalesForecast_PercentOfQuotaClosed();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getPercentOfQuotaForecast <em>Percent Of Quota Forecast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent Of Quota Forecast</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getPercentOfQuotaForecast()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EAttribute getSalesForecast_PercentOfQuotaForecast();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getPipelineAmount <em>Pipeline Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pipeline Amount</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getPipelineAmount()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EAttribute getSalesForecast_PipelineAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getQuotaAmount <em>Quota Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quota Amount</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getQuotaAmount()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EAttribute getSalesForecast_QuotaAmount();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getSalesForecastDetails <em>Sales Forecast Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sales Forecast Details</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getSalesForecastDetails()
	 * @see #getSalesForecast()
	 * @generated
	 */
	EReference getSalesForecast_SalesForecastDetails();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail <em>Sales Forecast Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Forecast Detail</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail
	 * @generated
	 */
	EClass getSalesForecastDetail();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getSalesForecastId <em>Sales Forecast Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Forecast Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getSalesForecastId()
	 * @see #getSalesForecastDetail()
	 * @generated
	 */
	EReference getSalesForecastDetail_SalesForecastId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getSalesForecastDetailId <em>Sales Forecast Detail Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sales Forecast Detail Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getSalesForecastDetailId()
	 * @see #getSalesForecastDetail()
	 * @generated
	 */
	EAttribute getSalesForecastDetail_SalesForecastDetailId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getAmount()
	 * @see #getSalesForecastDetail()
	 * @generated
	 */
	EAttribute getSalesForecastDetail_Amount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getProductCategoryId <em>Product Category Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Category Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getProductCategoryId()
	 * @see #getSalesForecastDetail()
	 * @generated
	 */
	EReference getSalesForecastDetail_ProductCategoryId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getProductId()
	 * @see #getSalesForecastDetail()
	 * @generated
	 */
	EReference getSalesForecastDetail_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getQuantity()
	 * @see #getSalesForecastDetail()
	 * @generated
	 */
	EAttribute getSalesForecastDetail_Quantity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getQuantityUomId <em>Quantity Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quantity Uom Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecastDetail#getQuantityUomId()
	 * @see #getSalesForecastDetail()
	 * @generated
	 */
	EReference getSalesForecastDetail_QuantityUomId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory <em>Sales Forecast History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Forecast History</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory
	 * @generated
	 */
	EClass getSalesForecastHistory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getSalesForecastHistoryId <em>Sales Forecast History Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sales Forecast History Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getSalesForecastHistoryId()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EAttribute getSalesForecastHistory_SalesForecastHistoryId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getBestCaseAmount <em>Best Case Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Best Case Amount</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getBestCaseAmount()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EAttribute getSalesForecastHistory_BestCaseAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getChangeNote <em>Change Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Note</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getChangeNote()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EAttribute getSalesForecastHistory_ChangeNote();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getClosedAmount <em>Closed Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closed Amount</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getClosedAmount()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EAttribute getSalesForecastHistory_ClosedAmount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getCurrencyUomId <em>Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getCurrencyUomId()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EReference getSalesForecastHistory_CurrencyUomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getCustomTimePeriodId <em>Custom Time Period Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Custom Time Period Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getCustomTimePeriodId()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EReference getSalesForecastHistory_CustomTimePeriodId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getForecastAmount <em>Forecast Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forecast Amount</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getForecastAmount()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EAttribute getSalesForecastHistory_ForecastAmount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getInternalPartyId <em>Internal Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Party Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getInternalPartyId()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EReference getSalesForecastHistory_InternalPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getModifiedByUserLoginId <em>Modified By User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modified By User Login Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getModifiedByUserLoginId()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EReference getSalesForecastHistory_ModifiedByUserLoginId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getModifiedTimestamp <em>Modified Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified Timestamp</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getModifiedTimestamp()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EAttribute getSalesForecastHistory_ModifiedTimestamp();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getOrganizationPartyId <em>Organization Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Party Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getOrganizationPartyId()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EReference getSalesForecastHistory_OrganizationPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getParentSalesForecastId <em>Parent Sales Forecast Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Sales Forecast Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getParentSalesForecastId()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EAttribute getSalesForecastHistory_ParentSalesForecastId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getPercentOfQuotaClosed <em>Percent Of Quota Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent Of Quota Closed</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getPercentOfQuotaClosed()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EAttribute getSalesForecastHistory_PercentOfQuotaClosed();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getPercentOfQuotaForecast <em>Percent Of Quota Forecast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent Of Quota Forecast</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getPercentOfQuotaForecast()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EAttribute getSalesForecastHistory_PercentOfQuotaForecast();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getQuotaAmount <em>Quota Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quota Amount</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getQuotaAmount()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EAttribute getSalesForecastHistory_QuotaAmount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getSalesForecastId <em>Sales Forecast Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Forecast Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory#getSalesForecastId()
	 * @see #getSalesForecastHistory()
	 * @generated
	 */
	EReference getSalesForecastHistory_SalesForecastId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity <em>Sales Opportunity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Opportunity</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity
	 * @generated
	 */
	EClass getSalesOpportunity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getSalesOpportunityId <em>Sales Opportunity Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sales Opportunity Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getSalesOpportunityId()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EAttribute getSalesOpportunity_SalesOpportunityId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getCreatedByUserLogin()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EReference getSalesOpportunity_CreatedByUserLogin();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getCurrencyUomId <em>Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getCurrencyUomId()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EReference getSalesOpportunity_CurrencyUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getDataSourceId <em>Data Source Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Source Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getDataSourceId()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EAttribute getSalesOpportunity_DataSourceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getDescription()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EAttribute getSalesOpportunity_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getEstimatedAmount <em>Estimated Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Amount</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getEstimatedAmount()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EAttribute getSalesOpportunity_EstimatedAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getEstimatedCloseDate <em>Estimated Close Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Close Date</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getEstimatedCloseDate()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EAttribute getSalesOpportunity_EstimatedCloseDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getEstimatedProbability <em>Estimated Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Probability</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getEstimatedProbability()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EAttribute getSalesOpportunity_EstimatedProbability();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getMarketingCampaignId <em>Marketing Campaign Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Marketing Campaign Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getMarketingCampaignId()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EReference getSalesOpportunity_MarketingCampaignId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getNextStep <em>Next Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Step</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getNextStep()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EAttribute getSalesOpportunity_NextStep();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getNextStepDate <em>Next Step Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Step Date</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getNextStepDate()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EAttribute getSalesOpportunity_NextStepDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getOpportunityName <em>Opportunity Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opportunity Name</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getOpportunityName()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EAttribute getSalesOpportunity_OpportunityName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getOpportunityStageId <em>Opportunity Stage Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opportunity Stage Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getOpportunityStageId()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EReference getSalesOpportunity_OpportunityStageId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getSalesOpportunityCompetitors <em>Sales Opportunity Competitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sales Opportunity Competitors</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getSalesOpportunityCompetitors()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EReference getSalesOpportunity_SalesOpportunityCompetitors();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getSalesOpportunityQuotes <em>Sales Opportunity Quotes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sales Opportunity Quotes</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getSalesOpportunityQuotes()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EReference getSalesOpportunity_SalesOpportunityQuotes();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getSalesOpportunityTrckCodes <em>Sales Opportunity Trck Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sales Opportunity Trck Codes</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getSalesOpportunityTrckCodes()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EReference getSalesOpportunity_SalesOpportunityTrckCodes();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getSalesOpportunityWorkEfforts <em>Sales Opportunity Work Efforts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sales Opportunity Work Efforts</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getSalesOpportunityWorkEfforts()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EReference getSalesOpportunity_SalesOpportunityWorkEfforts();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getTypeEnumId <em>Type Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Enum Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getTypeEnumId()
	 * @see #getSalesOpportunity()
	 * @generated
	 */
	EReference getSalesOpportunity_TypeEnumId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityCompetitor <em>Sales Opportunity Competitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Opportunity Competitor</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityCompetitor
	 * @generated
	 */
	EClass getSalesOpportunityCompetitor();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityCompetitor#getSalesOpportunityId <em>Sales Opportunity Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Opportunity Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityCompetitor#getSalesOpportunityId()
	 * @see #getSalesOpportunityCompetitor()
	 * @generated
	 */
	EReference getSalesOpportunityCompetitor_SalesOpportunityId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityCompetitor#getCompetitorPartyId <em>Competitor Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Competitor Party Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityCompetitor#getCompetitorPartyId()
	 * @see #getSalesOpportunityCompetitor()
	 * @generated
	 */
	EAttribute getSalesOpportunityCompetitor_CompetitorPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityCompetitor#getPositionEnumId <em>Position Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Enum Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityCompetitor#getPositionEnumId()
	 * @see #getSalesOpportunityCompetitor()
	 * @generated
	 */
	EAttribute getSalesOpportunityCompetitor_PositionEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityCompetitor#getStrengths <em>Strengths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strengths</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityCompetitor#getStrengths()
	 * @see #getSalesOpportunityCompetitor()
	 * @generated
	 */
	EAttribute getSalesOpportunityCompetitor_Strengths();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityCompetitor#getWeaknesses <em>Weaknesses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weaknesses</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityCompetitor#getWeaknesses()
	 * @see #getSalesOpportunityCompetitor()
	 * @generated
	 */
	EAttribute getSalesOpportunityCompetitor_Weaknesses();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory <em>Sales Opportunity History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Opportunity History</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory
	 * @generated
	 */
	EClass getSalesOpportunityHistory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory#getSalesOpportunityHistoryId <em>Sales Opportunity History Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sales Opportunity History Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory#getSalesOpportunityHistoryId()
	 * @see #getSalesOpportunityHistory()
	 * @generated
	 */
	EAttribute getSalesOpportunityHistory_SalesOpportunityHistoryId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory#getChangeNote <em>Change Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Note</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory#getChangeNote()
	 * @see #getSalesOpportunityHistory()
	 * @generated
	 */
	EAttribute getSalesOpportunityHistory_ChangeNote();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory#getCurrencyUomId <em>Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory#getCurrencyUomId()
	 * @see #getSalesOpportunityHistory()
	 * @generated
	 */
	EReference getSalesOpportunityHistory_CurrencyUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory#getDescription()
	 * @see #getSalesOpportunityHistory()
	 * @generated
	 */
	EAttribute getSalesOpportunityHistory_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory#getEstimatedAmount <em>Estimated Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Amount</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory#getEstimatedAmount()
	 * @see #getSalesOpportunityHistory()
	 * @generated
	 */
	EAttribute getSalesOpportunityHistory_EstimatedAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory#getEstimatedCloseDate <em>Estimated Close Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Close Date</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory#getEstimatedCloseDate()
	 * @see #getSalesOpportunityHistory()
	 * @generated
	 */
	EAttribute getSalesOpportunityHistory_EstimatedCloseDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory#getEstimatedProbability <em>Estimated Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Probability</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory#getEstimatedProbability()
	 * @see #getSalesOpportunityHistory()
	 * @generated
	 */
	EAttribute getSalesOpportunityHistory_EstimatedProbability();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory#getModifiedByUserLogin <em>Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory#getModifiedByUserLogin()
	 * @see #getSalesOpportunityHistory()
	 * @generated
	 */
	EReference getSalesOpportunityHistory_ModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory#getModifiedTimestamp <em>Modified Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified Timestamp</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory#getModifiedTimestamp()
	 * @see #getSalesOpportunityHistory()
	 * @generated
	 */
	EAttribute getSalesOpportunityHistory_ModifiedTimestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory#getNextStep <em>Next Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Step</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory#getNextStep()
	 * @see #getSalesOpportunityHistory()
	 * @generated
	 */
	EAttribute getSalesOpportunityHistory_NextStep();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory#getOpportunityStageId <em>Opportunity Stage Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opportunity Stage Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory#getOpportunityStageId()
	 * @see #getSalesOpportunityHistory()
	 * @generated
	 */
	EReference getSalesOpportunityHistory_OpportunityStageId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory#getSalesOpportunityId <em>Sales Opportunity Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Opportunity Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory#getSalesOpportunityId()
	 * @see #getSalesOpportunityHistory()
	 * @generated
	 */
	EReference getSalesOpportunityHistory_SalesOpportunityId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityQuote <em>Sales Opportunity Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Opportunity Quote</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityQuote
	 * @generated
	 */
	EClass getSalesOpportunityQuote();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityQuote#getSalesOpportunityId <em>Sales Opportunity Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Opportunity Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityQuote#getSalesOpportunityId()
	 * @see #getSalesOpportunityQuote()
	 * @generated
	 */
	EReference getSalesOpportunityQuote_SalesOpportunityId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityQuote#getQuoteId <em>Quote Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityQuote#getQuoteId()
	 * @see #getSalesOpportunityQuote()
	 * @generated
	 */
	EReference getSalesOpportunityQuote_QuoteId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityRole <em>Sales Opportunity Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Opportunity Role</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityRole
	 * @generated
	 */
	EClass getSalesOpportunityRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityRole#getSalesOpportunityId <em>Sales Opportunity Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Opportunity Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityRole#getSalesOpportunityId()
	 * @see #getSalesOpportunityRole()
	 * @generated
	 */
	EReference getSalesOpportunityRole_SalesOpportunityId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityRole#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityRole#getPartyId()
	 * @see #getSalesOpportunityRole()
	 * @generated
	 */
	EReference getSalesOpportunityRole_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityRole#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityRole#getRoleTypeId()
	 * @see #getSalesOpportunityRole()
	 * @generated
	 */
	EReference getSalesOpportunityRole_RoleTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityStage <em>Sales Opportunity Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Opportunity Stage</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityStage
	 * @generated
	 */
	EClass getSalesOpportunityStage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityStage#getOpportunityStageId <em>Opportunity Stage Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opportunity Stage Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityStage#getOpportunityStageId()
	 * @see #getSalesOpportunityStage()
	 * @generated
	 */
	EAttribute getSalesOpportunityStage_OpportunityStageId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityStage#getDefaultProbability <em>Default Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Probability</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityStage#getDefaultProbability()
	 * @see #getSalesOpportunityStage()
	 * @generated
	 */
	EAttribute getSalesOpportunityStage_DefaultProbability();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityStage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityStage#getDescription()
	 * @see #getSalesOpportunityStage()
	 * @generated
	 */
	EAttribute getSalesOpportunityStage_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityStage#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityStage#getSequenceNum()
	 * @see #getSalesOpportunityStage()
	 * @generated
	 */
	EAttribute getSalesOpportunityStage_SequenceNum();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityTrckCode <em>Sales Opportunity Trck Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Opportunity Trck Code</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityTrckCode
	 * @generated
	 */
	EClass getSalesOpportunityTrckCode();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityTrckCode#getSalesOpportunityId <em>Sales Opportunity Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Opportunity Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityTrckCode#getSalesOpportunityId()
	 * @see #getSalesOpportunityTrckCode()
	 * @generated
	 */
	EReference getSalesOpportunityTrckCode_SalesOpportunityId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityTrckCode#getTrackingCodeId <em>Tracking Code Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tracking Code Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityTrckCode#getTrackingCodeId()
	 * @see #getSalesOpportunityTrckCode()
	 * @generated
	 */
	EAttribute getSalesOpportunityTrckCode_TrackingCodeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityTrckCode#getReceivedDate <em>Received Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Received Date</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityTrckCode#getReceivedDate()
	 * @see #getSalesOpportunityTrckCode()
	 * @generated
	 */
	EAttribute getSalesOpportunityTrckCode_ReceivedDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityWorkEffort <em>Sales Opportunity Work Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sales Opportunity Work Effort</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityWorkEffort
	 * @generated
	 */
	EClass getSalesOpportunityWorkEffort();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityWorkEffort#getSalesOpportunityId <em>Sales Opportunity Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Opportunity Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityWorkEffort#getSalesOpportunityId()
	 * @see #getSalesOpportunityWorkEffort()
	 * @generated
	 */
	EReference getSalesOpportunityWorkEffort_SalesOpportunityId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityWorkEffort#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityWorkEffort#getWorkEffortId()
	 * @see #getSalesOpportunityWorkEffort()
	 * @generated
	 */
	EReference getSalesOpportunityWorkEffort_WorkEffortId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OpportunityFactory getOpportunityFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastImpl <em>Sales Forecast</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastImpl
		 * @see org.abchip.mimo.biz.marketing.opportunity.impl.OpportunityPackageImpl#getSalesForecast()
		 * @generated
		 */
		EClass SALES_FORECAST = eINSTANCE.getSalesForecast();

		/**
		 * The meta object literal for the '<em><b>Sales Forecast Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST__SALES_FORECAST_ID = eINSTANCE.getSalesForecast_SalesForecastId();

		/**
		 * The meta object literal for the '<em><b>Best Case Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST__BEST_CASE_AMOUNT = eINSTANCE.getSalesForecast_BestCaseAmount();

		/**
		 * The meta object literal for the '<em><b>Closed Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST__CLOSED_AMOUNT = eINSTANCE.getSalesForecast_ClosedAmount();

		/**
		 * The meta object literal for the '<em><b>Created By User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST__CREATED_BY_USER_LOGIN_ID = eINSTANCE.getSalesForecast_CreatedByUserLoginId();

		/**
		 * The meta object literal for the '<em><b>Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST__CURRENCY_UOM_ID = eINSTANCE.getSalesForecast_CurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Custom Time Period Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST__CUSTOM_TIME_PERIOD_ID = eINSTANCE.getSalesForecast_CustomTimePeriodId();

		/**
		 * The meta object literal for the '<em><b>Forecast Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST__FORECAST_AMOUNT = eINSTANCE.getSalesForecast_ForecastAmount();

		/**
		 * The meta object literal for the '<em><b>Internal Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST__INTERNAL_PARTY_ID = eINSTANCE.getSalesForecast_InternalPartyId();

		/**
		 * The meta object literal for the '<em><b>Modified By User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST__MODIFIED_BY_USER_LOGIN_ID = eINSTANCE.getSalesForecast_ModifiedByUserLoginId();

		/**
		 * The meta object literal for the '<em><b>Organization Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST__ORGANIZATION_PARTY_ID = eINSTANCE.getSalesForecast_OrganizationPartyId();

		/**
		 * The meta object literal for the '<em><b>Parent Sales Forecast Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST__PARENT_SALES_FORECAST_ID = eINSTANCE.getSalesForecast_ParentSalesForecastId();

		/**
		 * The meta object literal for the '<em><b>Percent Of Quota Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST__PERCENT_OF_QUOTA_CLOSED = eINSTANCE.getSalesForecast_PercentOfQuotaClosed();

		/**
		 * The meta object literal for the '<em><b>Percent Of Quota Forecast</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST__PERCENT_OF_QUOTA_FORECAST = eINSTANCE.getSalesForecast_PercentOfQuotaForecast();

		/**
		 * The meta object literal for the '<em><b>Pipeline Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST__PIPELINE_AMOUNT = eINSTANCE.getSalesForecast_PipelineAmount();

		/**
		 * The meta object literal for the '<em><b>Quota Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST__QUOTA_AMOUNT = eINSTANCE.getSalesForecast_QuotaAmount();

		/**
		 * The meta object literal for the '<em><b>Sales Forecast Details</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST__SALES_FORECAST_DETAILS = eINSTANCE.getSalesForecast_SalesForecastDetails();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastDetailImpl <em>Sales Forecast Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastDetailImpl
		 * @see org.abchip.mimo.biz.marketing.opportunity.impl.OpportunityPackageImpl#getSalesForecastDetail()
		 * @generated
		 */
		EClass SALES_FORECAST_DETAIL = eINSTANCE.getSalesForecastDetail();

		/**
		 * The meta object literal for the '<em><b>Sales Forecast Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST_DETAIL__SALES_FORECAST_ID = eINSTANCE.getSalesForecastDetail_SalesForecastId();

		/**
		 * The meta object literal for the '<em><b>Sales Forecast Detail Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_DETAIL__SALES_FORECAST_DETAIL_ID = eINSTANCE.getSalesForecastDetail_SalesForecastDetailId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_DETAIL__AMOUNT = eINSTANCE.getSalesForecastDetail_Amount();

		/**
		 * The meta object literal for the '<em><b>Product Category Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST_DETAIL__PRODUCT_CATEGORY_ID = eINSTANCE.getSalesForecastDetail_ProductCategoryId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST_DETAIL__PRODUCT_ID = eINSTANCE.getSalesForecastDetail_ProductId();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_DETAIL__QUANTITY = eINSTANCE.getSalesForecastDetail_Quantity();

		/**
		 * The meta object literal for the '<em><b>Quantity Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST_DETAIL__QUANTITY_UOM_ID = eINSTANCE.getSalesForecastDetail_QuantityUomId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl <em>Sales Forecast History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl
		 * @see org.abchip.mimo.biz.marketing.opportunity.impl.OpportunityPackageImpl#getSalesForecastHistory()
		 * @generated
		 */
		EClass SALES_FORECAST_HISTORY = eINSTANCE.getSalesForecastHistory();

		/**
		 * The meta object literal for the '<em><b>Sales Forecast History Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_HISTORY__SALES_FORECAST_HISTORY_ID = eINSTANCE.getSalesForecastHistory_SalesForecastHistoryId();

		/**
		 * The meta object literal for the '<em><b>Best Case Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_HISTORY__BEST_CASE_AMOUNT = eINSTANCE.getSalesForecastHistory_BestCaseAmount();

		/**
		 * The meta object literal for the '<em><b>Change Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_HISTORY__CHANGE_NOTE = eINSTANCE.getSalesForecastHistory_ChangeNote();

		/**
		 * The meta object literal for the '<em><b>Closed Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_HISTORY__CLOSED_AMOUNT = eINSTANCE.getSalesForecastHistory_ClosedAmount();

		/**
		 * The meta object literal for the '<em><b>Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST_HISTORY__CURRENCY_UOM_ID = eINSTANCE.getSalesForecastHistory_CurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Custom Time Period Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST_HISTORY__CUSTOM_TIME_PERIOD_ID = eINSTANCE.getSalesForecastHistory_CustomTimePeriodId();

		/**
		 * The meta object literal for the '<em><b>Forecast Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_HISTORY__FORECAST_AMOUNT = eINSTANCE.getSalesForecastHistory_ForecastAmount();

		/**
		 * The meta object literal for the '<em><b>Internal Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST_HISTORY__INTERNAL_PARTY_ID = eINSTANCE.getSalesForecastHistory_InternalPartyId();

		/**
		 * The meta object literal for the '<em><b>Modified By User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST_HISTORY__MODIFIED_BY_USER_LOGIN_ID = eINSTANCE.getSalesForecastHistory_ModifiedByUserLoginId();

		/**
		 * The meta object literal for the '<em><b>Modified Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_HISTORY__MODIFIED_TIMESTAMP = eINSTANCE.getSalesForecastHistory_ModifiedTimestamp();

		/**
		 * The meta object literal for the '<em><b>Organization Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST_HISTORY__ORGANIZATION_PARTY_ID = eINSTANCE.getSalesForecastHistory_OrganizationPartyId();

		/**
		 * The meta object literal for the '<em><b>Parent Sales Forecast Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_HISTORY__PARENT_SALES_FORECAST_ID = eINSTANCE.getSalesForecastHistory_ParentSalesForecastId();

		/**
		 * The meta object literal for the '<em><b>Percent Of Quota Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_CLOSED = eINSTANCE.getSalesForecastHistory_PercentOfQuotaClosed();

		/**
		 * The meta object literal for the '<em><b>Percent Of Quota Forecast</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_FORECAST = eINSTANCE.getSalesForecastHistory_PercentOfQuotaForecast();

		/**
		 * The meta object literal for the '<em><b>Quota Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_FORECAST_HISTORY__QUOTA_AMOUNT = eINSTANCE.getSalesForecastHistory_QuotaAmount();

		/**
		 * The meta object literal for the '<em><b>Sales Forecast Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_FORECAST_HISTORY__SALES_FORECAST_ID = eINSTANCE.getSalesForecastHistory_SalesForecastId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityImpl <em>Sales Opportunity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityImpl
		 * @see org.abchip.mimo.biz.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunity()
		 * @generated
		 */
		EClass SALES_OPPORTUNITY = eINSTANCE.getSalesOpportunity();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY__SALES_OPPORTUNITY_ID = eINSTANCE.getSalesOpportunity_SalesOpportunityId();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY__CREATED_BY_USER_LOGIN = eINSTANCE.getSalesOpportunity_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY__CURRENCY_UOM_ID = eINSTANCE.getSalesOpportunity_CurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Data Source Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY__DATA_SOURCE_ID = eINSTANCE.getSalesOpportunity_DataSourceId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY__DESCRIPTION = eINSTANCE.getSalesOpportunity_Description();

		/**
		 * The meta object literal for the '<em><b>Estimated Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY__ESTIMATED_AMOUNT = eINSTANCE.getSalesOpportunity_EstimatedAmount();

		/**
		 * The meta object literal for the '<em><b>Estimated Close Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY__ESTIMATED_CLOSE_DATE = eINSTANCE.getSalesOpportunity_EstimatedCloseDate();

		/**
		 * The meta object literal for the '<em><b>Estimated Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY__ESTIMATED_PROBABILITY = eINSTANCE.getSalesOpportunity_EstimatedProbability();

		/**
		 * The meta object literal for the '<em><b>Marketing Campaign Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY__MARKETING_CAMPAIGN_ID = eINSTANCE.getSalesOpportunity_MarketingCampaignId();

		/**
		 * The meta object literal for the '<em><b>Next Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY__NEXT_STEP = eINSTANCE.getSalesOpportunity_NextStep();

		/**
		 * The meta object literal for the '<em><b>Next Step Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY__NEXT_STEP_DATE = eINSTANCE.getSalesOpportunity_NextStepDate();

		/**
		 * The meta object literal for the '<em><b>Opportunity Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY__OPPORTUNITY_NAME = eINSTANCE.getSalesOpportunity_OpportunityName();

		/**
		 * The meta object literal for the '<em><b>Opportunity Stage Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY__OPPORTUNITY_STAGE_ID = eINSTANCE.getSalesOpportunity_OpportunityStageId();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity Competitors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY__SALES_OPPORTUNITY_COMPETITORS = eINSTANCE.getSalesOpportunity_SalesOpportunityCompetitors();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity Quotes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY__SALES_OPPORTUNITY_QUOTES = eINSTANCE.getSalesOpportunity_SalesOpportunityQuotes();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity Trck Codes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY__SALES_OPPORTUNITY_TRCK_CODES = eINSTANCE.getSalesOpportunity_SalesOpportunityTrckCodes();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity Work Efforts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY__SALES_OPPORTUNITY_WORK_EFFORTS = eINSTANCE.getSalesOpportunity_SalesOpportunityWorkEfforts();

		/**
		 * The meta object literal for the '<em><b>Type Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY__TYPE_ENUM_ID = eINSTANCE.getSalesOpportunity_TypeEnumId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityCompetitorImpl <em>Sales Opportunity Competitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityCompetitorImpl
		 * @see org.abchip.mimo.biz.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityCompetitor()
		 * @generated
		 */
		EClass SALES_OPPORTUNITY_COMPETITOR = eINSTANCE.getSalesOpportunityCompetitor();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_COMPETITOR__SALES_OPPORTUNITY_ID = eINSTANCE.getSalesOpportunityCompetitor_SalesOpportunityId();

		/**
		 * The meta object literal for the '<em><b>Competitor Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_COMPETITOR__COMPETITOR_PARTY_ID = eINSTANCE.getSalesOpportunityCompetitor_CompetitorPartyId();

		/**
		 * The meta object literal for the '<em><b>Position Enum Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_COMPETITOR__POSITION_ENUM_ID = eINSTANCE.getSalesOpportunityCompetitor_PositionEnumId();

		/**
		 * The meta object literal for the '<em><b>Strengths</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_COMPETITOR__STRENGTHS = eINSTANCE.getSalesOpportunityCompetitor_Strengths();

		/**
		 * The meta object literal for the '<em><b>Weaknesses</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_COMPETITOR__WEAKNESSES = eINSTANCE.getSalesOpportunityCompetitor_Weaknesses();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl <em>Sales Opportunity History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl
		 * @see org.abchip.mimo.biz.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityHistory()
		 * @generated
		 */
		EClass SALES_OPPORTUNITY_HISTORY = eINSTANCE.getSalesOpportunityHistory();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity History Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY_HISTORY_ID = eINSTANCE.getSalesOpportunityHistory_SalesOpportunityHistoryId();

		/**
		 * The meta object literal for the '<em><b>Change Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_HISTORY__CHANGE_NOTE = eINSTANCE.getSalesOpportunityHistory_ChangeNote();

		/**
		 * The meta object literal for the '<em><b>Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_HISTORY__CURRENCY_UOM_ID = eINSTANCE.getSalesOpportunityHistory_CurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_HISTORY__DESCRIPTION = eINSTANCE.getSalesOpportunityHistory_Description();

		/**
		 * The meta object literal for the '<em><b>Estimated Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_HISTORY__ESTIMATED_AMOUNT = eINSTANCE.getSalesOpportunityHistory_EstimatedAmount();

		/**
		 * The meta object literal for the '<em><b>Estimated Close Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_HISTORY__ESTIMATED_CLOSE_DATE = eINSTANCE.getSalesOpportunityHistory_EstimatedCloseDate();

		/**
		 * The meta object literal for the '<em><b>Estimated Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_HISTORY__ESTIMATED_PROBABILITY = eINSTANCE.getSalesOpportunityHistory_EstimatedProbability();

		/**
		 * The meta object literal for the '<em><b>Modified By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_HISTORY__MODIFIED_BY_USER_LOGIN = eINSTANCE.getSalesOpportunityHistory_ModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Modified Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_HISTORY__MODIFIED_TIMESTAMP = eINSTANCE.getSalesOpportunityHistory_ModifiedTimestamp();

		/**
		 * The meta object literal for the '<em><b>Next Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_HISTORY__NEXT_STEP = eINSTANCE.getSalesOpportunityHistory_NextStep();

		/**
		 * The meta object literal for the '<em><b>Opportunity Stage Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_HISTORY__OPPORTUNITY_STAGE_ID = eINSTANCE.getSalesOpportunityHistory_OpportunityStageId();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY_ID = eINSTANCE.getSalesOpportunityHistory_SalesOpportunityId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityQuoteImpl <em>Sales Opportunity Quote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityQuoteImpl
		 * @see org.abchip.mimo.biz.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityQuote()
		 * @generated
		 */
		EClass SALES_OPPORTUNITY_QUOTE = eINSTANCE.getSalesOpportunityQuote();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_QUOTE__SALES_OPPORTUNITY_ID = eINSTANCE.getSalesOpportunityQuote_SalesOpportunityId();

		/**
		 * The meta object literal for the '<em><b>Quote Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_QUOTE__QUOTE_ID = eINSTANCE.getSalesOpportunityQuote_QuoteId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityRoleImpl <em>Sales Opportunity Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityRoleImpl
		 * @see org.abchip.mimo.biz.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityRole()
		 * @generated
		 */
		EClass SALES_OPPORTUNITY_ROLE = eINSTANCE.getSalesOpportunityRole();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_ROLE__SALES_OPPORTUNITY_ID = eINSTANCE.getSalesOpportunityRole_SalesOpportunityId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_ROLE__PARTY_ID = eINSTANCE.getSalesOpportunityRole_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_ROLE__ROLE_TYPE_ID = eINSTANCE.getSalesOpportunityRole_RoleTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityStageImpl <em>Sales Opportunity Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityStageImpl
		 * @see org.abchip.mimo.biz.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityStage()
		 * @generated
		 */
		EClass SALES_OPPORTUNITY_STAGE = eINSTANCE.getSalesOpportunityStage();

		/**
		 * The meta object literal for the '<em><b>Opportunity Stage Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_STAGE__OPPORTUNITY_STAGE_ID = eINSTANCE.getSalesOpportunityStage_OpportunityStageId();

		/**
		 * The meta object literal for the '<em><b>Default Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_STAGE__DEFAULT_PROBABILITY = eINSTANCE.getSalesOpportunityStage_DefaultProbability();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_STAGE__DESCRIPTION = eINSTANCE.getSalesOpportunityStage_Description();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_STAGE__SEQUENCE_NUM = eINSTANCE.getSalesOpportunityStage_SequenceNum();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityTrckCodeImpl <em>Sales Opportunity Trck Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityTrckCodeImpl
		 * @see org.abchip.mimo.biz.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityTrckCode()
		 * @generated
		 */
		EClass SALES_OPPORTUNITY_TRCK_CODE = eINSTANCE.getSalesOpportunityTrckCode();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_TRCK_CODE__SALES_OPPORTUNITY_ID = eINSTANCE.getSalesOpportunityTrckCode_SalesOpportunityId();

		/**
		 * The meta object literal for the '<em><b>Tracking Code Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_TRCK_CODE__TRACKING_CODE_ID = eINSTANCE.getSalesOpportunityTrckCode_TrackingCodeId();

		/**
		 * The meta object literal for the '<em><b>Received Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALES_OPPORTUNITY_TRCK_CODE__RECEIVED_DATE = eINSTANCE.getSalesOpportunityTrckCode_ReceivedDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityWorkEffortImpl <em>Sales Opportunity Work Effort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityWorkEffortImpl
		 * @see org.abchip.mimo.biz.marketing.opportunity.impl.OpportunityPackageImpl#getSalesOpportunityWorkEffort()
		 * @generated
		 */
		EClass SALES_OPPORTUNITY_WORK_EFFORT = eINSTANCE.getSalesOpportunityWorkEffort();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_WORK_EFFORT__SALES_OPPORTUNITY_ID = eINSTANCE.getSalesOpportunityWorkEffort_SalesOpportunityId();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALES_OPPORTUNITY_WORK_EFFORT__WORK_EFFORT_ID = eINSTANCE.getSalesOpportunityWorkEffort_WorkEffortId();

	}

} //OpportunityPackage
