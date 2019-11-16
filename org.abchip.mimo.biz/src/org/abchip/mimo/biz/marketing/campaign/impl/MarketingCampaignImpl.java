/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.campaign.impl;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.marketing.campaign.CampaignPackage;
import org.abchip.mimo.biz.marketing.campaign.MarketingCampaign;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Marketing Campaign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignImpl#getMarketingCampaignId <em>Marketing Campaign Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignImpl#getActualCost <em>Actual Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignImpl#getBudgetedCost <em>Budgeted Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignImpl#getCampaignName <em>Campaign Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignImpl#getCampaignSummary <em>Campaign Summary</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignImpl#getConvertedLeads <em>Converted Leads</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignImpl#getEstimatedCost <em>Estimated Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignImpl#getExpectedResponsePercent <em>Expected Response Percent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignImpl#getExpectedRevenue <em>Expected Revenue</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignImpl#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignImpl#getNumSent <em>Num Sent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignImpl#getParentCampaignId <em>Parent Campaign Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignImpl#getMarketingCampaignNotes <em>Marketing Campaign Notes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarketingCampaignImpl extends BizEntityImpl implements MarketingCampaign {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * The default value of the '{@link #getMarketingCampaignId() <em>Marketing Campaign Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketingCampaignId()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKETING_CAMPAIGN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarketingCampaignId() <em>Marketing Campaign Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketingCampaignId()
	 * @generated
	 * @ordered
	 */
	protected String marketingCampaignId = MARKETING_CAMPAIGN_ID_EDEFAULT;


	/**
	 * The default value of the '{@link #getActualCost() <em>Actual Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ACTUAL_COST_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getActualCost() <em>Actual Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal actualCost = ACTUAL_COST_EDEFAULT;


	/**
	 * The default value of the '{@link #getBudgetedCost() <em>Budgeted Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetedCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BUDGETED_COST_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getBudgetedCost() <em>Budgeted Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetedCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal budgetedCost = BUDGETED_COST_EDEFAULT;


	/**
	 * The default value of the '{@link #getCampaignName() <em>Campaign Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampaignName()
	 * @generated
	 * @ordered
	 */
	protected static final String CAMPAIGN_NAME_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getCampaignName() <em>Campaign Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampaignName()
	 * @generated
	 * @ordered
	 */
	protected String campaignName = CAMPAIGN_NAME_EDEFAULT;


	/**
	 * The default value of the '{@link #getCampaignSummary() <em>Campaign Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampaignSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String CAMPAIGN_SUMMARY_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getCampaignSummary() <em>Campaign Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampaignSummary()
	 * @generated
	 * @ordered
	 */
	protected String campaignSummary = CAMPAIGN_SUMMARY_EDEFAULT;


	/**
	 * The default value of the '{@link #getConvertedLeads() <em>Converted Leads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvertedLeads()
	 * @generated
	 * @ordered
	 */
	protected static final String CONVERTED_LEADS_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getConvertedLeads() <em>Converted Leads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvertedLeads()
	 * @generated
	 * @ordered
	 */
	protected String convertedLeads = CONVERTED_LEADS_EDEFAULT;


	/**
	 * The default value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_BY_USER_LOGIN_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String createdByUserLogin = CREATED_BY_USER_LOGIN_EDEFAULT;


	/**
	 * The default value of the '{@link #getEstimatedCost() <em>Estimated Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ESTIMATED_COST_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getEstimatedCost() <em>Estimated Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal estimatedCost = ESTIMATED_COST_EDEFAULT;


	/**
	 * The default value of the '{@link #getExpectedResponsePercent() <em>Expected Response Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedResponsePercent()
	 * @generated
	 * @ordered
	 */
	protected static final double EXPECTED_RESPONSE_PERCENT_EDEFAULT = 0.0;


	/**
	 * The cached value of the '{@link #getExpectedResponsePercent() <em>Expected Response Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedResponsePercent()
	 * @generated
	 * @ordered
	 */
	protected double expectedResponsePercent = EXPECTED_RESPONSE_PERCENT_EDEFAULT;


	/**
	 * The default value of the '{@link #getExpectedRevenue() <em>Expected Revenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedRevenue()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal EXPECTED_REVENUE_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getExpectedRevenue() <em>Expected Revenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedRevenue()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal expectedRevenue = EXPECTED_REVENUE_EDEFAULT;


	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;


	/**
	 * The default value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVE_EDEFAULT = false;


	/**
	 * The cached value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected boolean isActive = IS_ACTIVE_EDEFAULT;


	/**
	 * The default value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT = null;


	/**
	 * The cached value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String lastModifiedByUserLogin = LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumSent() <em>Num Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumSent()
	 * @generated
	 * @ordered
	 */
	protected static final long NUM_SENT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumSent() <em>Num Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumSent()
	 * @generated
	 * @ordered
	 */
	protected long numSent = NUM_SENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;


	/**
	 * The cached value of the '{@link #getParentCampaignId() <em>Parent Campaign Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentCampaignId()
	 * @generated
	 * @ordered
	 */
	protected MarketingCampaign parentCampaignId;


	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;


	/**
	 * The cached value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom currencyUomId;

	/**
	 * The cached value of the '{@link #getMarketingCampaignNotes() <em>Marketing Campaign Notes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketingCampaignNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> marketingCampaignNotes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarketingCampaignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CampaignPackage.Literals.MARKETING_CAMPAIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getActualCost() {
		return actualCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualCost(BigDecimal newActualCost) {
		BigDecimal oldActualCost = actualCost;
		actualCost = newActualCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CampaignPackage.MARKETING_CAMPAIGN__ACTUAL_COST, oldActualCost, actualCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getBudgetedCost() {
		return budgetedCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetedCost(BigDecimal newBudgetedCost) {
		BigDecimal oldBudgetedCost = budgetedCost;
		budgetedCost = newBudgetedCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CampaignPackage.MARKETING_CAMPAIGN__BUDGETED_COST, oldBudgetedCost, budgetedCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCampaignName() {
		return campaignName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCampaignName(String newCampaignName) {
		String oldCampaignName = campaignName;
		campaignName = newCampaignName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CampaignPackage.MARKETING_CAMPAIGN__CAMPAIGN_NAME, oldCampaignName, campaignName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCampaignSummary() {
		return campaignSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCampaignSummary(String newCampaignSummary) {
		String oldCampaignSummary = campaignSummary;
		campaignSummary = newCampaignSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CampaignPackage.MARKETING_CAMPAIGN__CAMPAIGN_SUMMARY, oldCampaignSummary, campaignSummary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConvertedLeads() {
		return convertedLeads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConvertedLeads(String newConvertedLeads) {
		String oldConvertedLeads = convertedLeads;
		convertedLeads = newConvertedLeads;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CampaignPackage.MARKETING_CAMPAIGN__CONVERTED_LEADS, oldConvertedLeads, convertedLeads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreatedByUserLogin() {
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(String newCreatedByUserLogin) {
		String oldCreatedByUserLogin = createdByUserLogin;
		createdByUserLogin = newCreatedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CampaignPackage.MARKETING_CAMPAIGN__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUomId() {
		if (currencyUomId != null && ((EObject)currencyUomId).eIsProxy()) {
			InternalEObject oldCurrencyUomId = (InternalEObject)currencyUomId;
			currencyUomId = (Uom)eResolveProxy(oldCurrencyUomId);
			if (currencyUomId != oldCurrencyUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CampaignPackage.MARKETING_CAMPAIGN__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
			}
		}
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetCurrencyUomId() {
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(Uom newCurrencyUomId) {
		Uom oldCurrencyUomId = currencyUomId;
		currencyUomId = newCurrencyUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CampaignPackage.MARKETING_CAMPAIGN__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getEstimatedCost() {
		return estimatedCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedCost(BigDecimal newEstimatedCost) {
		BigDecimal oldEstimatedCost = estimatedCost;
		estimatedCost = newEstimatedCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CampaignPackage.MARKETING_CAMPAIGN__ESTIMATED_COST, oldEstimatedCost, estimatedCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getExpectedResponsePercent() {
		return expectedResponsePercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedResponsePercent(double newExpectedResponsePercent) {
		double oldExpectedResponsePercent = expectedResponsePercent;
		expectedResponsePercent = newExpectedResponsePercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CampaignPackage.MARKETING_CAMPAIGN__EXPECTED_RESPONSE_PERCENT, oldExpectedResponsePercent, expectedResponsePercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getExpectedRevenue() {
		return expectedRevenue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedRevenue(BigDecimal newExpectedRevenue) {
		BigDecimal oldExpectedRevenue = expectedRevenue;
		expectedRevenue = newExpectedRevenue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CampaignPackage.MARKETING_CAMPAIGN__EXPECTED_REVENUE, oldExpectedRevenue, expectedRevenue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CampaignPackage.MARKETING_CAMPAIGN__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsActive(boolean newIsActive) {
		boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CampaignPackage.MARKETING_CAMPAIGN__IS_ACTIVE, oldIsActive, isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedByUserLogin() {
		return lastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(String newLastModifiedByUserLogin) {
		String oldLastModifiedByUserLogin = lastModifiedByUserLogin;
		lastModifiedByUserLogin = newLastModifiedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CampaignPackage.MARKETING_CAMPAIGN__LAST_MODIFIED_BY_USER_LOGIN, oldLastModifiedByUserLogin, lastModifiedByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMarketingCampaignId() {
		return marketingCampaignId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarketingCampaignId(String newMarketingCampaignId) {
		String oldMarketingCampaignId = marketingCampaignId;
		marketingCampaignId = newMarketingCampaignId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CampaignPackage.MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_ID, oldMarketingCampaignId, marketingCampaignId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getNumSent() {
		return numSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumSent(long newNumSent) {
		long oldNumSent = numSent;
		numSent = newNumSent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CampaignPackage.MARKETING_CAMPAIGN__NUM_SENT, oldNumSent, numSent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarketingCampaign getParentCampaignId() {
		if (parentCampaignId != null && ((EObject)parentCampaignId).eIsProxy()) {
			InternalEObject oldParentCampaignId = (InternalEObject)parentCampaignId;
			parentCampaignId = (MarketingCampaign)eResolveProxy(oldParentCampaignId);
			if (parentCampaignId != oldParentCampaignId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CampaignPackage.MARKETING_CAMPAIGN__PARENT_CAMPAIGN_ID, oldParentCampaignId, parentCampaignId));
			}
		}
		return parentCampaignId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketingCampaign basicGetParentCampaignId() {
		return parentCampaignId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentCampaignId(MarketingCampaign newParentCampaignId) {
		MarketingCampaign oldParentCampaignId = parentCampaignId;
		parentCampaignId = newParentCampaignId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CampaignPackage.MARKETING_CAMPAIGN__PARENT_CAMPAIGN_ID, oldParentCampaignId, parentCampaignId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CampaignPackage.MARKETING_CAMPAIGN__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CampaignPackage.MARKETING_CAMPAIGN__STATUS_ID, oldStatusId, statusId));
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		StatusItem oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CampaignPackage.MARKETING_CAMPAIGN__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CampaignPackage.MARKETING_CAMPAIGN__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getMarketingCampaignNotes() {
		if (marketingCampaignNotes == null) {
			marketingCampaignNotes = new EDataTypeUniqueEList<String>(String.class, this, CampaignPackage.MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_NOTES);
		}
		return marketingCampaignNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childMarketingCampaigns() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> contactLists() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> salesOpportunities() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> trackingCodes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CampaignPackage.MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_ID:
				return getMarketingCampaignId();
			case CampaignPackage.MARKETING_CAMPAIGN__ACTUAL_COST:
				return getActualCost();
			case CampaignPackage.MARKETING_CAMPAIGN__BUDGETED_COST:
				return getBudgetedCost();
			case CampaignPackage.MARKETING_CAMPAIGN__CAMPAIGN_NAME:
				return getCampaignName();
			case CampaignPackage.MARKETING_CAMPAIGN__CAMPAIGN_SUMMARY:
				return getCampaignSummary();
			case CampaignPackage.MARKETING_CAMPAIGN__CONVERTED_LEADS:
				return getConvertedLeads();
			case CampaignPackage.MARKETING_CAMPAIGN__CREATED_BY_USER_LOGIN:
				return getCreatedByUserLogin();
			case CampaignPackage.MARKETING_CAMPAIGN__ESTIMATED_COST:
				return getEstimatedCost();
			case CampaignPackage.MARKETING_CAMPAIGN__EXPECTED_RESPONSE_PERCENT:
				return getExpectedResponsePercent();
			case CampaignPackage.MARKETING_CAMPAIGN__EXPECTED_REVENUE:
				return getExpectedRevenue();
			case CampaignPackage.MARKETING_CAMPAIGN__FROM_DATE:
				return getFromDate();
			case CampaignPackage.MARKETING_CAMPAIGN__IS_ACTIVE:
				return isIsActive();
			case CampaignPackage.MARKETING_CAMPAIGN__LAST_MODIFIED_BY_USER_LOGIN:
				return getLastModifiedByUserLogin();
			case CampaignPackage.MARKETING_CAMPAIGN__NUM_SENT:
				return getNumSent();
			case CampaignPackage.MARKETING_CAMPAIGN__START_DATE:
				return getStartDate();
			case CampaignPackage.MARKETING_CAMPAIGN__THRU_DATE:
				return getThruDate();
			case CampaignPackage.MARKETING_CAMPAIGN__PARENT_CAMPAIGN_ID:
				if (resolve) return getParentCampaignId();
				return basicGetParentCampaignId();
			case CampaignPackage.MARKETING_CAMPAIGN__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case CampaignPackage.MARKETING_CAMPAIGN__CURRENCY_UOM_ID:
				if (resolve) return getCurrencyUomId();
				return basicGetCurrencyUomId();
			case CampaignPackage.MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_NOTES:
				return getMarketingCampaignNotes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CampaignPackage.MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_ID:
				setMarketingCampaignId((String)newValue);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__ACTUAL_COST:
				setActualCost((BigDecimal)newValue);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__BUDGETED_COST:
				setBudgetedCost((BigDecimal)newValue);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__CAMPAIGN_NAME:
				setCampaignName((String)newValue);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__CAMPAIGN_SUMMARY:
				setCampaignSummary((String)newValue);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__CONVERTED_LEADS:
				setConvertedLeads((String)newValue);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((String)newValue);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__ESTIMATED_COST:
				setEstimatedCost((BigDecimal)newValue);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__EXPECTED_RESPONSE_PERCENT:
				setExpectedResponsePercent((Double)newValue);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__EXPECTED_REVENUE:
				setExpectedRevenue((BigDecimal)newValue);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__IS_ACTIVE:
				setIsActive((Boolean)newValue);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((String)newValue);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__NUM_SENT:
				setNumSent((Long)newValue);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__START_DATE:
				setStartDate((Date)newValue);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__PARENT_CAMPAIGN_ID:
				setParentCampaignId((MarketingCampaign)newValue);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)newValue);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_NOTES:
				getMarketingCampaignNotes().clear();
				getMarketingCampaignNotes().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CampaignPackage.MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_ID:
				setMarketingCampaignId(MARKETING_CAMPAIGN_ID_EDEFAULT);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__ACTUAL_COST:
				setActualCost(ACTUAL_COST_EDEFAULT);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__BUDGETED_COST:
				setBudgetedCost(BUDGETED_COST_EDEFAULT);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__CAMPAIGN_NAME:
				setCampaignName(CAMPAIGN_NAME_EDEFAULT);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__CAMPAIGN_SUMMARY:
				setCampaignSummary(CAMPAIGN_SUMMARY_EDEFAULT);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__CONVERTED_LEADS:
				setConvertedLeads(CONVERTED_LEADS_EDEFAULT);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin(CREATED_BY_USER_LOGIN_EDEFAULT);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__ESTIMATED_COST:
				setEstimatedCost(ESTIMATED_COST_EDEFAULT);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__EXPECTED_RESPONSE_PERCENT:
				setExpectedResponsePercent(EXPECTED_RESPONSE_PERCENT_EDEFAULT);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__EXPECTED_REVENUE:
				setExpectedRevenue(EXPECTED_REVENUE_EDEFAULT);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin(LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__NUM_SENT:
				setNumSent(NUM_SENT_EDEFAULT);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__PARENT_CAMPAIGN_ID:
				setParentCampaignId((MarketingCampaign)null);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)null);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_NOTES:
				getMarketingCampaignNotes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CampaignPackage.MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_ID:
				return MARKETING_CAMPAIGN_ID_EDEFAULT == null ? marketingCampaignId != null : !MARKETING_CAMPAIGN_ID_EDEFAULT.equals(marketingCampaignId);
			case CampaignPackage.MARKETING_CAMPAIGN__ACTUAL_COST:
				return ACTUAL_COST_EDEFAULT == null ? actualCost != null : !ACTUAL_COST_EDEFAULT.equals(actualCost);
			case CampaignPackage.MARKETING_CAMPAIGN__BUDGETED_COST:
				return BUDGETED_COST_EDEFAULT == null ? budgetedCost != null : !BUDGETED_COST_EDEFAULT.equals(budgetedCost);
			case CampaignPackage.MARKETING_CAMPAIGN__CAMPAIGN_NAME:
				return CAMPAIGN_NAME_EDEFAULT == null ? campaignName != null : !CAMPAIGN_NAME_EDEFAULT.equals(campaignName);
			case CampaignPackage.MARKETING_CAMPAIGN__CAMPAIGN_SUMMARY:
				return CAMPAIGN_SUMMARY_EDEFAULT == null ? campaignSummary != null : !CAMPAIGN_SUMMARY_EDEFAULT.equals(campaignSummary);
			case CampaignPackage.MARKETING_CAMPAIGN__CONVERTED_LEADS:
				return CONVERTED_LEADS_EDEFAULT == null ? convertedLeads != null : !CONVERTED_LEADS_EDEFAULT.equals(convertedLeads);
			case CampaignPackage.MARKETING_CAMPAIGN__CREATED_BY_USER_LOGIN:
				return CREATED_BY_USER_LOGIN_EDEFAULT == null ? createdByUserLogin != null : !CREATED_BY_USER_LOGIN_EDEFAULT.equals(createdByUserLogin);
			case CampaignPackage.MARKETING_CAMPAIGN__ESTIMATED_COST:
				return ESTIMATED_COST_EDEFAULT == null ? estimatedCost != null : !ESTIMATED_COST_EDEFAULT.equals(estimatedCost);
			case CampaignPackage.MARKETING_CAMPAIGN__EXPECTED_RESPONSE_PERCENT:
				return expectedResponsePercent != EXPECTED_RESPONSE_PERCENT_EDEFAULT;
			case CampaignPackage.MARKETING_CAMPAIGN__EXPECTED_REVENUE:
				return EXPECTED_REVENUE_EDEFAULT == null ? expectedRevenue != null : !EXPECTED_REVENUE_EDEFAULT.equals(expectedRevenue);
			case CampaignPackage.MARKETING_CAMPAIGN__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case CampaignPackage.MARKETING_CAMPAIGN__IS_ACTIVE:
				return isActive != IS_ACTIVE_EDEFAULT;
			case CampaignPackage.MARKETING_CAMPAIGN__LAST_MODIFIED_BY_USER_LOGIN:
				return LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT == null ? lastModifiedByUserLogin != null : !LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT.equals(lastModifiedByUserLogin);
			case CampaignPackage.MARKETING_CAMPAIGN__NUM_SENT:
				return numSent != NUM_SENT_EDEFAULT;
			case CampaignPackage.MARKETING_CAMPAIGN__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case CampaignPackage.MARKETING_CAMPAIGN__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case CampaignPackage.MARKETING_CAMPAIGN__PARENT_CAMPAIGN_ID:
				return parentCampaignId != null;
			case CampaignPackage.MARKETING_CAMPAIGN__STATUS_ID:
				return statusId != null;
			case CampaignPackage.MARKETING_CAMPAIGN__CURRENCY_UOM_ID:
				return currencyUomId != null;
			case CampaignPackage.MARKETING_CAMPAIGN__MARKETING_CAMPAIGN_NOTES:
				return marketingCampaignNotes != null && !marketingCampaignNotes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (marketingCampaignId: ");
		result.append(marketingCampaignId);
		result.append(", actualCost: ");
		result.append(actualCost);
		result.append(", budgetedCost: ");
		result.append(budgetedCost);
		result.append(", campaignName: ");
		result.append(campaignName);
		result.append(", campaignSummary: ");
		result.append(campaignSummary);
		result.append(", convertedLeads: ");
		result.append(convertedLeads);
		result.append(", createdByUserLogin: ");
		result.append(createdByUserLogin);
		result.append(", estimatedCost: ");
		result.append(estimatedCost);
		result.append(", expectedResponsePercent: ");
		result.append(expectedResponsePercent);
		result.append(", expectedRevenue: ");
		result.append(expectedRevenue);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", isActive: ");
		result.append(isActive);
		result.append(", lastModifiedByUserLogin: ");
		result.append(lastModifiedByUserLogin);
		result.append(", numSent: ");
		result.append(numSent);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(", marketingCampaignNotes: ");
		result.append(marketingCampaignNotes);
		result.append(')');
		return result.toString();
	}

} //MarketingCampaignImpl
