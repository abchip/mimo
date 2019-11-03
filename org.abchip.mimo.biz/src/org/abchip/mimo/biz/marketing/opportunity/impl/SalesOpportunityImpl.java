/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.opportunity.impl;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage;
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sales Opportunity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityImpl#getSalesOpportunityId <em>Sales Opportunity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityImpl#getDataSourceId <em>Data Source Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityImpl#getEstimatedAmount <em>Estimated Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityImpl#getEstimatedCloseDate <em>Estimated Close Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityImpl#getEstimatedProbability <em>Estimated Probability</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityImpl#getMarketingCampaignId <em>Marketing Campaign Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityImpl#getNextStep <em>Next Step</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityImpl#getNextStepDate <em>Next Step Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityImpl#getOpportunityName <em>Opportunity Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityImpl#getOpportunityStageId <em>Opportunity Stage Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityImpl#getTypeEnumId <em>Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityImpl#getSalesOpportunityCompetitors <em>Sales Opportunity Competitors</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityImpl#getSalesOpportunityQuotes <em>Sales Opportunity Quotes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityImpl#getSalesOpportunityTrckCodes <em>Sales Opportunity Trck Codes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityImpl#getSalesOpportunityWorkEfforts <em>Sales Opportunity Work Efforts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SalesOpportunityImpl extends BizEntityImpl implements SalesOpportunity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getSalesOpportunityId() <em>Sales Opportunity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesOpportunityId()
	 * @generated
	 * @ordered
	 */
	protected static final String SALES_OPPORTUNITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSalesOpportunityId() <em>Sales Opportunity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesOpportunityId()
	 * @generated
	 * @ordered
	 */
	protected String salesOpportunityId = SALES_OPPORTUNITY_ID_EDEFAULT;

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
	 * The default value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_UOM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected String currencyUomId = CURRENCY_UOM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataSourceId() <em>Data Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceId()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSourceId() <em>Data Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceId()
	 * @generated
	 * @ordered
	 */
	protected String dataSourceId = DATA_SOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedAmount() <em>Estimated Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ESTIMATED_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedAmount() <em>Estimated Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal estimatedAmount = ESTIMATED_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedCloseDate() <em>Estimated Close Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedCloseDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ESTIMATED_CLOSE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedCloseDate() <em>Estimated Close Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedCloseDate()
	 * @generated
	 * @ordered
	 */
	protected Date estimatedCloseDate = ESTIMATED_CLOSE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedProbability() <em>Estimated Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedProbability()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ESTIMATED_PROBABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedProbability() <em>Estimated Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedProbability()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal estimatedProbability = ESTIMATED_PROBABILITY_EDEFAULT;

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
	 * The default value of the '{@link #getNextStep() <em>Next Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStep()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_STEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextStep() <em>Next Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStep()
	 * @generated
	 * @ordered
	 */
	protected String nextStep = NEXT_STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextStepDate() <em>Next Step Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStepDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date NEXT_STEP_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextStepDate() <em>Next Step Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStepDate()
	 * @generated
	 * @ordered
	 */
	protected Date nextStepDate = NEXT_STEP_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpportunityName() <em>Opportunity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpportunityName()
	 * @generated
	 * @ordered
	 */
	protected static final String OPPORTUNITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpportunityName() <em>Opportunity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpportunityName()
	 * @generated
	 * @ordered
	 */
	protected String opportunityName = OPPORTUNITY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpportunityStageId() <em>Opportunity Stage Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpportunityStageId()
	 * @generated
	 * @ordered
	 */
	protected static final String OPPORTUNITY_STAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpportunityStageId() <em>Opportunity Stage Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpportunityStageId()
	 * @generated
	 * @ordered
	 */
	protected String opportunityStageId = OPPORTUNITY_STAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeEnumId() <em>Type Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_ENUM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeEnumId() <em>Type Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeEnumId()
	 * @generated
	 * @ordered
	 */
	protected String typeEnumId = TYPE_ENUM_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSalesOpportunityCompetitors() <em>Sales Opportunity Competitors</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesOpportunityCompetitors()
	 * @generated
	 * @ordered
	 */
	protected EList<String> salesOpportunityCompetitors;

	/**
	 * The cached value of the '{@link #getSalesOpportunityQuotes() <em>Sales Opportunity Quotes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesOpportunityQuotes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> salesOpportunityQuotes;

	/**
	 * The cached value of the '{@link #getSalesOpportunityTrckCodes() <em>Sales Opportunity Trck Codes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesOpportunityTrckCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> salesOpportunityTrckCodes;

	/**
	 * The cached value of the '{@link #getSalesOpportunityWorkEfforts() <em>Sales Opportunity Work Efforts</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesOpportunityWorkEfforts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> salesOpportunityWorkEfforts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalesOpportunityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpportunityPackage.Literals.SALES_OPPORTUNITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrencyUomId() {
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(String newCurrencyUomId) {
		String oldCurrencyUomId = currencyUomId;
		currencyUomId = newCurrencyUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataSourceId() {
		return dataSourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataSourceId(String newDataSourceId) {
		String oldDataSourceId = dataSourceId;
		dataSourceId = newDataSourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY__DATA_SOURCE_ID, oldDataSourceId, dataSourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getEstimatedAmount() {
		return estimatedAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedAmount(BigDecimal newEstimatedAmount) {
		BigDecimal oldEstimatedAmount = estimatedAmount;
		estimatedAmount = newEstimatedAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY__ESTIMATED_AMOUNT, oldEstimatedAmount, estimatedAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedCloseDate() {
		return estimatedCloseDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedCloseDate(Date newEstimatedCloseDate) {
		Date oldEstimatedCloseDate = estimatedCloseDate;
		estimatedCloseDate = newEstimatedCloseDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY__ESTIMATED_CLOSE_DATE, oldEstimatedCloseDate, estimatedCloseDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getEstimatedProbability() {
		return estimatedProbability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedProbability(BigDecimal newEstimatedProbability) {
		BigDecimal oldEstimatedProbability = estimatedProbability;
		estimatedProbability = newEstimatedProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY__ESTIMATED_PROBABILITY, oldEstimatedProbability, estimatedProbability));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY__MARKETING_CAMPAIGN_ID, oldMarketingCampaignId, marketingCampaignId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNextStep() {
		return nextStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextStep(String newNextStep) {
		String oldNextStep = nextStep;
		nextStep = newNextStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY__NEXT_STEP, oldNextStep, nextStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getNextStepDate() {
		return nextStepDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextStepDate(Date newNextStepDate) {
		Date oldNextStepDate = nextStepDate;
		nextStepDate = newNextStepDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY__NEXT_STEP_DATE, oldNextStepDate, nextStepDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOpportunityName() {
		return opportunityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpportunityName(String newOpportunityName) {
		String oldOpportunityName = opportunityName;
		opportunityName = newOpportunityName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY__OPPORTUNITY_NAME, oldOpportunityName, opportunityName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOpportunityStageId() {
		return opportunityStageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpportunityStageId(String newOpportunityStageId) {
		String oldOpportunityStageId = opportunityStageId;
		opportunityStageId = newOpportunityStageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY__OPPORTUNITY_STAGE_ID, oldOpportunityStageId, opportunityStageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSalesOpportunityId() {
		return salesOpportunityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesOpportunityId(String newSalesOpportunityId) {
		String oldSalesOpportunityId = salesOpportunityId;
		salesOpportunityId = newSalesOpportunityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY__SALES_OPPORTUNITY_ID, oldSalesOpportunityId, salesOpportunityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTypeEnumId() {
		return typeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeEnumId(String newTypeEnumId) {
		String oldTypeEnumId = typeEnumId;
		typeEnumId = newTypeEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY__TYPE_ENUM_ID, oldTypeEnumId, typeEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getSalesOpportunityCompetitors() {
		if (salesOpportunityCompetitors == null) {
			salesOpportunityCompetitors = new EDataTypeUniqueEList<String>(String.class, this, OpportunityPackage.SALES_OPPORTUNITY__SALES_OPPORTUNITY_COMPETITORS);
		}
		return salesOpportunityCompetitors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getSalesOpportunityQuotes() {
		if (salesOpportunityQuotes == null) {
			salesOpportunityQuotes = new EDataTypeUniqueEList<String>(String.class, this, OpportunityPackage.SALES_OPPORTUNITY__SALES_OPPORTUNITY_QUOTES);
		}
		return salesOpportunityQuotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getSalesOpportunityTrckCodes() {
		if (salesOpportunityTrckCodes == null) {
			salesOpportunityTrckCodes = new EDataTypeUniqueEList<String>(String.class, this, OpportunityPackage.SALES_OPPORTUNITY__SALES_OPPORTUNITY_TRCK_CODES);
		}
		return salesOpportunityTrckCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getSalesOpportunityWorkEfforts() {
		if (salesOpportunityWorkEfforts == null) {
			salesOpportunityWorkEfforts = new EDataTypeUniqueEList<String>(String.class, this, OpportunityPackage.SALES_OPPORTUNITY__SALES_OPPORTUNITY_WORK_EFFORTS);
		}
		return salesOpportunityWorkEfforts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> invoiceItems() {
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
	public List<String> orderItems() {
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
	public List<String> salesOpportunityHistories() {
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
			case OpportunityPackage.SALES_OPPORTUNITY__SALES_OPPORTUNITY_ID:
				return getSalesOpportunityId();
			case OpportunityPackage.SALES_OPPORTUNITY__CREATED_BY_USER_LOGIN:
				return getCreatedByUserLogin();
			case OpportunityPackage.SALES_OPPORTUNITY__CURRENCY_UOM_ID:
				return getCurrencyUomId();
			case OpportunityPackage.SALES_OPPORTUNITY__DATA_SOURCE_ID:
				return getDataSourceId();
			case OpportunityPackage.SALES_OPPORTUNITY__DESCRIPTION:
				return getDescription();
			case OpportunityPackage.SALES_OPPORTUNITY__ESTIMATED_AMOUNT:
				return getEstimatedAmount();
			case OpportunityPackage.SALES_OPPORTUNITY__ESTIMATED_CLOSE_DATE:
				return getEstimatedCloseDate();
			case OpportunityPackage.SALES_OPPORTUNITY__ESTIMATED_PROBABILITY:
				return getEstimatedProbability();
			case OpportunityPackage.SALES_OPPORTUNITY__MARKETING_CAMPAIGN_ID:
				return getMarketingCampaignId();
			case OpportunityPackage.SALES_OPPORTUNITY__NEXT_STEP:
				return getNextStep();
			case OpportunityPackage.SALES_OPPORTUNITY__NEXT_STEP_DATE:
				return getNextStepDate();
			case OpportunityPackage.SALES_OPPORTUNITY__OPPORTUNITY_NAME:
				return getOpportunityName();
			case OpportunityPackage.SALES_OPPORTUNITY__OPPORTUNITY_STAGE_ID:
				return getOpportunityStageId();
			case OpportunityPackage.SALES_OPPORTUNITY__TYPE_ENUM_ID:
				return getTypeEnumId();
			case OpportunityPackage.SALES_OPPORTUNITY__SALES_OPPORTUNITY_COMPETITORS:
				return getSalesOpportunityCompetitors();
			case OpportunityPackage.SALES_OPPORTUNITY__SALES_OPPORTUNITY_QUOTES:
				return getSalesOpportunityQuotes();
			case OpportunityPackage.SALES_OPPORTUNITY__SALES_OPPORTUNITY_TRCK_CODES:
				return getSalesOpportunityTrckCodes();
			case OpportunityPackage.SALES_OPPORTUNITY__SALES_OPPORTUNITY_WORK_EFFORTS:
				return getSalesOpportunityWorkEfforts();
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
			case OpportunityPackage.SALES_OPPORTUNITY__SALES_OPPORTUNITY_ID:
				setSalesOpportunityId((String)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((String)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__CURRENCY_UOM_ID:
				setCurrencyUomId((String)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__DATA_SOURCE_ID:
				setDataSourceId((String)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__ESTIMATED_AMOUNT:
				setEstimatedAmount((BigDecimal)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__ESTIMATED_CLOSE_DATE:
				setEstimatedCloseDate((Date)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__ESTIMATED_PROBABILITY:
				setEstimatedProbability((BigDecimal)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__MARKETING_CAMPAIGN_ID:
				setMarketingCampaignId((String)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__NEXT_STEP:
				setNextStep((String)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__NEXT_STEP_DATE:
				setNextStepDate((Date)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__OPPORTUNITY_NAME:
				setOpportunityName((String)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__OPPORTUNITY_STAGE_ID:
				setOpportunityStageId((String)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__TYPE_ENUM_ID:
				setTypeEnumId((String)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__SALES_OPPORTUNITY_COMPETITORS:
				getSalesOpportunityCompetitors().clear();
				getSalesOpportunityCompetitors().addAll((Collection<? extends String>)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__SALES_OPPORTUNITY_QUOTES:
				getSalesOpportunityQuotes().clear();
				getSalesOpportunityQuotes().addAll((Collection<? extends String>)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__SALES_OPPORTUNITY_TRCK_CODES:
				getSalesOpportunityTrckCodes().clear();
				getSalesOpportunityTrckCodes().addAll((Collection<? extends String>)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__SALES_OPPORTUNITY_WORK_EFFORTS:
				getSalesOpportunityWorkEfforts().clear();
				getSalesOpportunityWorkEfforts().addAll((Collection<? extends String>)newValue);
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
			case OpportunityPackage.SALES_OPPORTUNITY__SALES_OPPORTUNITY_ID:
				setSalesOpportunityId(SALES_OPPORTUNITY_ID_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin(CREATED_BY_USER_LOGIN_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__CURRENCY_UOM_ID:
				setCurrencyUomId(CURRENCY_UOM_ID_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__DATA_SOURCE_ID:
				setDataSourceId(DATA_SOURCE_ID_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__ESTIMATED_AMOUNT:
				setEstimatedAmount(ESTIMATED_AMOUNT_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__ESTIMATED_CLOSE_DATE:
				setEstimatedCloseDate(ESTIMATED_CLOSE_DATE_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__ESTIMATED_PROBABILITY:
				setEstimatedProbability(ESTIMATED_PROBABILITY_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__MARKETING_CAMPAIGN_ID:
				setMarketingCampaignId(MARKETING_CAMPAIGN_ID_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__NEXT_STEP:
				setNextStep(NEXT_STEP_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__NEXT_STEP_DATE:
				setNextStepDate(NEXT_STEP_DATE_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__OPPORTUNITY_NAME:
				setOpportunityName(OPPORTUNITY_NAME_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__OPPORTUNITY_STAGE_ID:
				setOpportunityStageId(OPPORTUNITY_STAGE_ID_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__TYPE_ENUM_ID:
				setTypeEnumId(TYPE_ENUM_ID_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__SALES_OPPORTUNITY_COMPETITORS:
				getSalesOpportunityCompetitors().clear();
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__SALES_OPPORTUNITY_QUOTES:
				getSalesOpportunityQuotes().clear();
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__SALES_OPPORTUNITY_TRCK_CODES:
				getSalesOpportunityTrckCodes().clear();
				return;
			case OpportunityPackage.SALES_OPPORTUNITY__SALES_OPPORTUNITY_WORK_EFFORTS:
				getSalesOpportunityWorkEfforts().clear();
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
			case OpportunityPackage.SALES_OPPORTUNITY__SALES_OPPORTUNITY_ID:
				return SALES_OPPORTUNITY_ID_EDEFAULT == null ? salesOpportunityId != null : !SALES_OPPORTUNITY_ID_EDEFAULT.equals(salesOpportunityId);
			case OpportunityPackage.SALES_OPPORTUNITY__CREATED_BY_USER_LOGIN:
				return CREATED_BY_USER_LOGIN_EDEFAULT == null ? createdByUserLogin != null : !CREATED_BY_USER_LOGIN_EDEFAULT.equals(createdByUserLogin);
			case OpportunityPackage.SALES_OPPORTUNITY__CURRENCY_UOM_ID:
				return CURRENCY_UOM_ID_EDEFAULT == null ? currencyUomId != null : !CURRENCY_UOM_ID_EDEFAULT.equals(currencyUomId);
			case OpportunityPackage.SALES_OPPORTUNITY__DATA_SOURCE_ID:
				return DATA_SOURCE_ID_EDEFAULT == null ? dataSourceId != null : !DATA_SOURCE_ID_EDEFAULT.equals(dataSourceId);
			case OpportunityPackage.SALES_OPPORTUNITY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OpportunityPackage.SALES_OPPORTUNITY__ESTIMATED_AMOUNT:
				return ESTIMATED_AMOUNT_EDEFAULT == null ? estimatedAmount != null : !ESTIMATED_AMOUNT_EDEFAULT.equals(estimatedAmount);
			case OpportunityPackage.SALES_OPPORTUNITY__ESTIMATED_CLOSE_DATE:
				return ESTIMATED_CLOSE_DATE_EDEFAULT == null ? estimatedCloseDate != null : !ESTIMATED_CLOSE_DATE_EDEFAULT.equals(estimatedCloseDate);
			case OpportunityPackage.SALES_OPPORTUNITY__ESTIMATED_PROBABILITY:
				return ESTIMATED_PROBABILITY_EDEFAULT == null ? estimatedProbability != null : !ESTIMATED_PROBABILITY_EDEFAULT.equals(estimatedProbability);
			case OpportunityPackage.SALES_OPPORTUNITY__MARKETING_CAMPAIGN_ID:
				return MARKETING_CAMPAIGN_ID_EDEFAULT == null ? marketingCampaignId != null : !MARKETING_CAMPAIGN_ID_EDEFAULT.equals(marketingCampaignId);
			case OpportunityPackage.SALES_OPPORTUNITY__NEXT_STEP:
				return NEXT_STEP_EDEFAULT == null ? nextStep != null : !NEXT_STEP_EDEFAULT.equals(nextStep);
			case OpportunityPackage.SALES_OPPORTUNITY__NEXT_STEP_DATE:
				return NEXT_STEP_DATE_EDEFAULT == null ? nextStepDate != null : !NEXT_STEP_DATE_EDEFAULT.equals(nextStepDate);
			case OpportunityPackage.SALES_OPPORTUNITY__OPPORTUNITY_NAME:
				return OPPORTUNITY_NAME_EDEFAULT == null ? opportunityName != null : !OPPORTUNITY_NAME_EDEFAULT.equals(opportunityName);
			case OpportunityPackage.SALES_OPPORTUNITY__OPPORTUNITY_STAGE_ID:
				return OPPORTUNITY_STAGE_ID_EDEFAULT == null ? opportunityStageId != null : !OPPORTUNITY_STAGE_ID_EDEFAULT.equals(opportunityStageId);
			case OpportunityPackage.SALES_OPPORTUNITY__TYPE_ENUM_ID:
				return TYPE_ENUM_ID_EDEFAULT == null ? typeEnumId != null : !TYPE_ENUM_ID_EDEFAULT.equals(typeEnumId);
			case OpportunityPackage.SALES_OPPORTUNITY__SALES_OPPORTUNITY_COMPETITORS:
				return salesOpportunityCompetitors != null && !salesOpportunityCompetitors.isEmpty();
			case OpportunityPackage.SALES_OPPORTUNITY__SALES_OPPORTUNITY_QUOTES:
				return salesOpportunityQuotes != null && !salesOpportunityQuotes.isEmpty();
			case OpportunityPackage.SALES_OPPORTUNITY__SALES_OPPORTUNITY_TRCK_CODES:
				return salesOpportunityTrckCodes != null && !salesOpportunityTrckCodes.isEmpty();
			case OpportunityPackage.SALES_OPPORTUNITY__SALES_OPPORTUNITY_WORK_EFFORTS:
				return salesOpportunityWorkEfforts != null && !salesOpportunityWorkEfforts.isEmpty();
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
		result.append(" (salesOpportunityId: ");
		result.append(salesOpportunityId);
		result.append(", createdByUserLogin: ");
		result.append(createdByUserLogin);
		result.append(", currencyUomId: ");
		result.append(currencyUomId);
		result.append(", dataSourceId: ");
		result.append(dataSourceId);
		result.append(", description: ");
		result.append(description);
		result.append(", estimatedAmount: ");
		result.append(estimatedAmount);
		result.append(", estimatedCloseDate: ");
		result.append(estimatedCloseDate);
		result.append(", estimatedProbability: ");
		result.append(estimatedProbability);
		result.append(", marketingCampaignId: ");
		result.append(marketingCampaignId);
		result.append(", nextStep: ");
		result.append(nextStep);
		result.append(", nextStepDate: ");
		result.append(nextStepDate);
		result.append(", opportunityName: ");
		result.append(opportunityName);
		result.append(", opportunityStageId: ");
		result.append(opportunityStageId);
		result.append(", typeEnumId: ");
		result.append(typeEnumId);
		result.append(", salesOpportunityCompetitors: ");
		result.append(salesOpportunityCompetitors);
		result.append(", salesOpportunityQuotes: ");
		result.append(salesOpportunityQuotes);
		result.append(", salesOpportunityTrckCodes: ");
		result.append(salesOpportunityTrckCodes);
		result.append(", salesOpportunityWorkEfforts: ");
		result.append(salesOpportunityWorkEfforts);
		result.append(')');
		return result.toString();
	}

} //SalesOpportunityImpl
