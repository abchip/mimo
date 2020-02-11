/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.campaign;

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
 * @see org.abchip.mimo.biz.marketing.campaign.CampaignFactory
 * @model kind="package"
 * @generated
 */
public interface CampaignPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "campaign";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/marketing/campaign";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-campaign";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CampaignPackage eINSTANCE = org.abchip.mimo.biz.marketing.campaign.impl.CampaignPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignImpl <em>Marketing Campaign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignImpl
	 * @see org.abchip.mimo.biz.marketing.campaign.impl.CampaignPackageImpl#getMarketingCampaign()
	 * @generated
	 */
	int MARKETING_CAMPAIGN = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Marketing Campaign Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__ACTUAL_COST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Budgeted Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__BUDGETED_COST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Campaign Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__CAMPAIGN_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Campaign Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__CAMPAIGN_SUMMARY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Converted Leads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__CONVERTED_LEADS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__CREATED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Estimated Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__ESTIMATED_COST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Expected Response Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__EXPECTED_RESPONSE_PERCENT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Expected Revenue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__EXPECTED_REVENUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__IS_ACTIVE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__LAST_MODIFIED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Marketing Campaign Notes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_NOTES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Num Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__NUM_SENT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Parent Campaign Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__PARENT_CAMPAIGN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__START_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Marketing Campaign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 20;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignNoteImpl <em>Marketing Campaign Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignNoteImpl
	 * @see org.abchip.mimo.biz.marketing.campaign.impl.CampaignPackageImpl#getMarketingCampaignNote()
	 * @generated
	 */
	int MARKETING_CAMPAIGN_NOTE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_NOTE__CREATED_STAMP = BizPackage.BIZ_ENTITY_NOTE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_NOTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_NOTE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_NOTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_NOTE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_NOTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_NOTE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Note Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_NOTE__NOTE_ID = BizPackage.BIZ_ENTITY_NOTE__NOTE_ID;

	/**
	 * The feature id for the '<em><b>Marketing Campaign Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_NOTE__MARKETING_CAMPAIGN_ID = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Marketing Campaign Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_NOTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignPriceImpl <em>Marketing Campaign Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignPriceImpl
	 * @see org.abchip.mimo.biz.marketing.campaign.impl.CampaignPackageImpl#getMarketingCampaignPrice()
	 * @generated
	 */
	int MARKETING_CAMPAIGN_PRICE = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PRICE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PRICE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PRICE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PRICE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Marketing Campaign Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PRICE__MARKETING_CAMPAIGN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Price Rule Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PRICE__PRODUCT_PRICE_RULE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PRICE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PRICE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Marketing Campaign Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PRICE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignPromoImpl <em>Marketing Campaign Promo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignPromoImpl
	 * @see org.abchip.mimo.biz.marketing.campaign.impl.CampaignPackageImpl#getMarketingCampaignPromo()
	 * @generated
	 */
	int MARKETING_CAMPAIGN_PROMO = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PROMO__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PROMO__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PROMO__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PROMO__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Marketing Campaign Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PROMO__MARKETING_CAMPAIGN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Promo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PROMO__PRODUCT_PROMO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PROMO__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PROMO__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Marketing Campaign Promo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_PROMO_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignRoleImpl <em>Marketing Campaign Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignRoleImpl
	 * @see org.abchip.mimo.biz.marketing.campaign.impl.CampaignPackageImpl#getMarketingCampaignRole()
	 * @generated
	 */
	int MARKETING_CAMPAIGN_ROLE = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_ROLE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_ROLE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_ROLE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_ROLE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Marketing Campaign Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_ROLE__MARKETING_CAMPAIGN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_ROLE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_ROLE__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_ROLE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_ROLE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Marketing Campaign Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKETING_CAMPAIGN_ROLE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign <em>Marketing Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marketing Campaign</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaign
	 * @generated
	 */
	EClass getMarketingCampaign();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getMarketingCampaignId <em>Marketing Campaign Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marketing Campaign Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getMarketingCampaignId()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_MarketingCampaignId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getActualCost <em>Actual Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Cost</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getActualCost()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_ActualCost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getBudgetedCost <em>Budgeted Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budgeted Cost</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getBudgetedCost()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_BudgetedCost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getCampaignName <em>Campaign Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Campaign Name</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getCampaignName()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_CampaignName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getCampaignSummary <em>Campaign Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Campaign Summary</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getCampaignSummary()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_CampaignSummary();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getConvertedLeads <em>Converted Leads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Converted Leads</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getConvertedLeads()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_ConvertedLeads();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getCreatedByUserLogin()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_CreatedByUserLogin();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getCurrencyUomId <em>Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getCurrencyUomId()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EReference getMarketingCampaign_CurrencyUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getEstimatedCost <em>Estimated Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Cost</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getEstimatedCost()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_EstimatedCost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getExpectedResponsePercent <em>Expected Response Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Response Percent</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getExpectedResponsePercent()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_ExpectedResponsePercent();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getExpectedRevenue <em>Expected Revenue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Revenue</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getExpectedRevenue()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_ExpectedRevenue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getFromDate()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#isIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#isIsActive()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_IsActive();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getLastModifiedByUserLogin()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getMarketingCampaignNotes <em>Marketing Campaign Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Marketing Campaign Notes</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getMarketingCampaignNotes()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EReference getMarketingCampaign_MarketingCampaignNotes();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getNumSent <em>Num Sent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Sent</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getNumSent()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_NumSent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getParentCampaignId <em>Parent Campaign Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Campaign Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getParentCampaignId()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EReference getMarketingCampaign_ParentCampaignId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getStartDate()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_StartDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getStatusId()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EReference getMarketingCampaign_StatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getThruDate()
	 * @see #getMarketingCampaign()
	 * @generated
	 */
	EAttribute getMarketingCampaign_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignNote <em>Marketing Campaign Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marketing Campaign Note</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaignNote
	 * @generated
	 */
	EClass getMarketingCampaignNote();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignNote#getMarketingCampaignId <em>Marketing Campaign Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Marketing Campaign Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaignNote#getMarketingCampaignId()
	 * @see #getMarketingCampaignNote()
	 * @generated
	 */
	EReference getMarketingCampaignNote_MarketingCampaignId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPrice <em>Marketing Campaign Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marketing Campaign Price</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPrice
	 * @generated
	 */
	EClass getMarketingCampaignPrice();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPrice#getMarketingCampaignId <em>Marketing Campaign Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Marketing Campaign Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPrice#getMarketingCampaignId()
	 * @see #getMarketingCampaignPrice()
	 * @generated
	 */
	EReference getMarketingCampaignPrice_MarketingCampaignId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPrice#getProductPriceRuleId <em>Product Price Rule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Price Rule Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPrice#getProductPriceRuleId()
	 * @see #getMarketingCampaignPrice()
	 * @generated
	 */
	EReference getMarketingCampaignPrice_ProductPriceRuleId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPrice#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPrice#getFromDate()
	 * @see #getMarketingCampaignPrice()
	 * @generated
	 */
	EAttribute getMarketingCampaignPrice_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPrice#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPrice#getThruDate()
	 * @see #getMarketingCampaignPrice()
	 * @generated
	 */
	EAttribute getMarketingCampaignPrice_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPromo <em>Marketing Campaign Promo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marketing Campaign Promo</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPromo
	 * @generated
	 */
	EClass getMarketingCampaignPromo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPromo#getMarketingCampaignId <em>Marketing Campaign Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Marketing Campaign Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPromo#getMarketingCampaignId()
	 * @see #getMarketingCampaignPromo()
	 * @generated
	 */
	EReference getMarketingCampaignPromo_MarketingCampaignId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPromo#getProductPromoId <em>Product Promo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPromo#getProductPromoId()
	 * @see #getMarketingCampaignPromo()
	 * @generated
	 */
	EReference getMarketingCampaignPromo_ProductPromoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPromo#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPromo#getFromDate()
	 * @see #getMarketingCampaignPromo()
	 * @generated
	 */
	EAttribute getMarketingCampaignPromo_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPromo#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPromo#getThruDate()
	 * @see #getMarketingCampaignPromo()
	 * @generated
	 */
	EAttribute getMarketingCampaignPromo_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignRole <em>Marketing Campaign Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marketing Campaign Role</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaignRole
	 * @generated
	 */
	EClass getMarketingCampaignRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignRole#getMarketingCampaignId <em>Marketing Campaign Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Marketing Campaign Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaignRole#getMarketingCampaignId()
	 * @see #getMarketingCampaignRole()
	 * @generated
	 */
	EReference getMarketingCampaignRole_MarketingCampaignId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignRole#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaignRole#getPartyId()
	 * @see #getMarketingCampaignRole()
	 * @generated
	 */
	EReference getMarketingCampaignRole_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignRole#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaignRole#getRoleTypeId()
	 * @see #getMarketingCampaignRole()
	 * @generated
	 */
	EReference getMarketingCampaignRole_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignRole#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaignRole#getFromDate()
	 * @see #getMarketingCampaignRole()
	 * @generated
	 */
	EAttribute getMarketingCampaignRole_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignRole#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.marketing.campaign.MarketingCampaignRole#getThruDate()
	 * @see #getMarketingCampaignRole()
	 * @generated
	 */
	EAttribute getMarketingCampaignRole_ThruDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CampaignFactory getCampaignFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignImpl <em>Marketing Campaign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignImpl
		 * @see org.abchip.mimo.biz.marketing.campaign.impl.CampaignPackageImpl#getMarketingCampaign()
		 * @generated
		 */
		EClass MARKETING_CAMPAIGN = eINSTANCE.getMarketingCampaign();

		/**
		 * The meta object literal for the '<em><b>Marketing Campaign Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_ID = eINSTANCE.getMarketingCampaign_MarketingCampaignId();

		/**
		 * The meta object literal for the '<em><b>Actual Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__ACTUAL_COST = eINSTANCE.getMarketingCampaign_ActualCost();

		/**
		 * The meta object literal for the '<em><b>Budgeted Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__BUDGETED_COST = eINSTANCE.getMarketingCampaign_BudgetedCost();

		/**
		 * The meta object literal for the '<em><b>Campaign Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__CAMPAIGN_NAME = eINSTANCE.getMarketingCampaign_CampaignName();

		/**
		 * The meta object literal for the '<em><b>Campaign Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__CAMPAIGN_SUMMARY = eINSTANCE.getMarketingCampaign_CampaignSummary();

		/**
		 * The meta object literal for the '<em><b>Converted Leads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__CONVERTED_LEADS = eINSTANCE.getMarketingCampaign_ConvertedLeads();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__CREATED_BY_USER_LOGIN = eINSTANCE.getMarketingCampaign_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN__CURRENCY_UOM_ID = eINSTANCE.getMarketingCampaign_CurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Estimated Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__ESTIMATED_COST = eINSTANCE.getMarketingCampaign_EstimatedCost();

		/**
		 * The meta object literal for the '<em><b>Expected Response Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__EXPECTED_RESPONSE_PERCENT = eINSTANCE.getMarketingCampaign_ExpectedResponsePercent();

		/**
		 * The meta object literal for the '<em><b>Expected Revenue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__EXPECTED_REVENUE = eINSTANCE.getMarketingCampaign_ExpectedRevenue();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__FROM_DATE = eINSTANCE.getMarketingCampaign_FromDate();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__IS_ACTIVE = eINSTANCE.getMarketingCampaign_IsActive();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getMarketingCampaign_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Marketing Campaign Notes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_NOTES = eINSTANCE.getMarketingCampaign_MarketingCampaignNotes();

		/**
		 * The meta object literal for the '<em><b>Num Sent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__NUM_SENT = eINSTANCE.getMarketingCampaign_NumSent();

		/**
		 * The meta object literal for the '<em><b>Parent Campaign Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN__PARENT_CAMPAIGN_ID = eINSTANCE.getMarketingCampaign_ParentCampaignId();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__START_DATE = eINSTANCE.getMarketingCampaign_StartDate();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN__STATUS_ID = eINSTANCE.getMarketingCampaign_StatusId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN__THRU_DATE = eINSTANCE.getMarketingCampaign_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignNoteImpl <em>Marketing Campaign Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignNoteImpl
		 * @see org.abchip.mimo.biz.marketing.campaign.impl.CampaignPackageImpl#getMarketingCampaignNote()
		 * @generated
		 */
		EClass MARKETING_CAMPAIGN_NOTE = eINSTANCE.getMarketingCampaignNote();

		/**
		 * The meta object literal for the '<em><b>Marketing Campaign Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN_NOTE__MARKETING_CAMPAIGN_ID = eINSTANCE.getMarketingCampaignNote_MarketingCampaignId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignPriceImpl <em>Marketing Campaign Price</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignPriceImpl
		 * @see org.abchip.mimo.biz.marketing.campaign.impl.CampaignPackageImpl#getMarketingCampaignPrice()
		 * @generated
		 */
		EClass MARKETING_CAMPAIGN_PRICE = eINSTANCE.getMarketingCampaignPrice();

		/**
		 * The meta object literal for the '<em><b>Marketing Campaign Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN_PRICE__MARKETING_CAMPAIGN_ID = eINSTANCE.getMarketingCampaignPrice_MarketingCampaignId();

		/**
		 * The meta object literal for the '<em><b>Product Price Rule Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN_PRICE__PRODUCT_PRICE_RULE_ID = eINSTANCE.getMarketingCampaignPrice_ProductPriceRuleId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN_PRICE__FROM_DATE = eINSTANCE.getMarketingCampaignPrice_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN_PRICE__THRU_DATE = eINSTANCE.getMarketingCampaignPrice_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignPromoImpl <em>Marketing Campaign Promo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignPromoImpl
		 * @see org.abchip.mimo.biz.marketing.campaign.impl.CampaignPackageImpl#getMarketingCampaignPromo()
		 * @generated
		 */
		EClass MARKETING_CAMPAIGN_PROMO = eINSTANCE.getMarketingCampaignPromo();

		/**
		 * The meta object literal for the '<em><b>Marketing Campaign Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN_PROMO__MARKETING_CAMPAIGN_ID = eINSTANCE.getMarketingCampaignPromo_MarketingCampaignId();

		/**
		 * The meta object literal for the '<em><b>Product Promo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN_PROMO__PRODUCT_PROMO_ID = eINSTANCE.getMarketingCampaignPromo_ProductPromoId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN_PROMO__FROM_DATE = eINSTANCE.getMarketingCampaignPromo_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN_PROMO__THRU_DATE = eINSTANCE.getMarketingCampaignPromo_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignRoleImpl <em>Marketing Campaign Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignRoleImpl
		 * @see org.abchip.mimo.biz.marketing.campaign.impl.CampaignPackageImpl#getMarketingCampaignRole()
		 * @generated
		 */
		EClass MARKETING_CAMPAIGN_ROLE = eINSTANCE.getMarketingCampaignRole();

		/**
		 * The meta object literal for the '<em><b>Marketing Campaign Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN_ROLE__MARKETING_CAMPAIGN_ID = eINSTANCE.getMarketingCampaignRole_MarketingCampaignId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN_ROLE__PARTY_ID = eINSTANCE.getMarketingCampaignRole_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKETING_CAMPAIGN_ROLE__ROLE_TYPE_ID = eINSTANCE.getMarketingCampaignRole_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN_ROLE__FROM_DATE = eINSTANCE.getMarketingCampaignRole_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKETING_CAMPAIGN_ROLE__THRU_DATE = eINSTANCE.getMarketingCampaignRole_ThruDate();

	}

} //CampaignPackage
