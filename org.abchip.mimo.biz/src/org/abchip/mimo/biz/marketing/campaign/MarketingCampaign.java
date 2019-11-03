/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.campaign;

import java.math.BigDecimal;

import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marketing Campaign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getMarketingCampaignId <em>Marketing Campaign Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getActualCost <em>Actual Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getBudgetedCost <em>Budgeted Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getCampaignName <em>Campaign Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getCampaignSummary <em>Campaign Summary</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getConvertedLeads <em>Converted Leads</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getEstimatedCost <em>Estimated Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getExpectedResponsePercent <em>Expected Response Percent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getExpectedRevenue <em>Expected Revenue</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getNumSent <em>Num Sent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getParentCampaignId <em>Parent Campaign Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getMarketingCampaignNotes <em>Marketing Campaign Notes</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaign()
 * @model
 * @generated
 */
public interface MarketingCampaign extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Actual Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Cost</em>' attribute.
	 * @see #setActualCost(BigDecimal)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaign_ActualCost()
	 * @model
	 * @generated
	 */
	BigDecimal getActualCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getActualCost <em>Actual Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Cost</em>' attribute.
	 * @see #getActualCost()
	 * @generated
	 */
	void setActualCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Budgeted Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budgeted Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budgeted Cost</em>' attribute.
	 * @see #setBudgetedCost(BigDecimal)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaign_BudgetedCost()
	 * @model
	 * @generated
	 */
	BigDecimal getBudgetedCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getBudgetedCost <em>Budgeted Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budgeted Cost</em>' attribute.
	 * @see #getBudgetedCost()
	 * @generated
	 */
	void setBudgetedCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Campaign Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Campaign Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campaign Name</em>' attribute.
	 * @see #setCampaignName(String)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaign_CampaignName()
	 * @model
	 * @generated
	 */
	String getCampaignName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getCampaignName <em>Campaign Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Campaign Name</em>' attribute.
	 * @see #getCampaignName()
	 * @generated
	 */
	void setCampaignName(String value);

	/**
	 * Returns the value of the '<em><b>Campaign Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Campaign Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campaign Summary</em>' attribute.
	 * @see #setCampaignSummary(String)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaign_CampaignSummary()
	 * @model
	 * @generated
	 */
	String getCampaignSummary();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getCampaignSummary <em>Campaign Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Campaign Summary</em>' attribute.
	 * @see #getCampaignSummary()
	 * @generated
	 */
	void setCampaignSummary(String value);

	/**
	 * Returns the value of the '<em><b>Converted Leads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Converted Leads</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Converted Leads</em>' attribute.
	 * @see #setConvertedLeads(String)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaign_ConvertedLeads()
	 * @model
	 * @generated
	 */
	String getConvertedLeads();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getConvertedLeads <em>Converted Leads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Converted Leads</em>' attribute.
	 * @see #getConvertedLeads()
	 * @generated
	 */
	void setConvertedLeads(String value);

	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' attribute.
	 * @see #setCreatedByUserLogin(String)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaign_CreatedByUserLogin()
	 * @model
	 * @generated
	 */
	String getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getCreatedByUserLogin <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' attribute.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Currency Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #setCurrencyUomId(String)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaign_CurrencyUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getCurrencyUomId <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(String value);

	/**
	 * Returns the value of the '<em><b>Estimated Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Cost</em>' attribute.
	 * @see #setEstimatedCost(BigDecimal)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaign_EstimatedCost()
	 * @model
	 * @generated
	 */
	BigDecimal getEstimatedCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getEstimatedCost <em>Estimated Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Cost</em>' attribute.
	 * @see #getEstimatedCost()
	 * @generated
	 */
	void setEstimatedCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Expected Response Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Response Percent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Response Percent</em>' attribute.
	 * @see #setExpectedResponsePercent(double)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaign_ExpectedResponsePercent()
	 * @model
	 * @generated
	 */
	double getExpectedResponsePercent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getExpectedResponsePercent <em>Expected Response Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Response Percent</em>' attribute.
	 * @see #getExpectedResponsePercent()
	 * @generated
	 */
	void setExpectedResponsePercent(double value);

	/**
	 * Returns the value of the '<em><b>Expected Revenue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Revenue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Revenue</em>' attribute.
	 * @see #setExpectedRevenue(BigDecimal)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaign_ExpectedRevenue()
	 * @model
	 * @generated
	 */
	BigDecimal getExpectedRevenue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getExpectedRevenue <em>Expected Revenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Revenue</em>' attribute.
	 * @see #getExpectedRevenue()
	 * @generated
	 */
	void setExpectedRevenue(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaign_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaign_IsActive()
	 * @model
	 * @generated
	 */
	boolean isIsActive();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#isIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isIsActive()
	 * @generated
	 */
	void setIsActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #setLastModifiedByUserLogin(String)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaign_LastModifiedByUserLogin()
	 * @model
	 * @generated
	 */
	String getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Marketing Campaign Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marketing Campaign Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marketing Campaign Id</em>' attribute.
	 * @see #setMarketingCampaignId(String)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaign_MarketingCampaignId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getMarketingCampaignId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getMarketingCampaignId <em>Marketing Campaign Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marketing Campaign Id</em>' attribute.
	 * @see #getMarketingCampaignId()
	 * @generated
	 */
	void setMarketingCampaignId(String value);

	/**
	 * Returns the value of the '<em><b>Num Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Sent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Sent</em>' attribute.
	 * @see #setNumSent(long)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaign_NumSent()
	 * @model
	 * @generated
	 */
	long getNumSent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getNumSent <em>Num Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Sent</em>' attribute.
	 * @see #getNumSent()
	 * @generated
	 */
	void setNumSent(long value);

	/**
	 * Returns the value of the '<em><b>Parent Campaign Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Campaign Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Campaign Id</em>' attribute.
	 * @see #setParentCampaignId(String)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaign_ParentCampaignId()
	 * @model annotation="mimo-ent-domain frame='MarketingCampaign'"
	 * @generated
	 */
	String getParentCampaignId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getParentCampaignId <em>Parent Campaign Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Campaign Id</em>' attribute.
	 * @see #getParentCampaignId()
	 * @generated
	 */
	void setParentCampaignId(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaign_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' attribute.
	 * @see #setStatusId(String)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaign_StatusId()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaign_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Marketing Campaign Notes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marketing Campaign Notes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marketing Campaign Notes</em>' attribute list.
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaign_MarketingCampaignNotes()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='MarketingCampaignNote'"
	 * @generated
	 */
	List<String> getMarketingCampaignNotes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='MarketingCampaign' route='parentCampaignId'"
	 * @generated
	 */
	List<String> childMarketingCampaigns();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ContactList' route='marketingCampaignId'"
	 * @generated
	 */
	List<String> contactLists();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesOpportunity' route='marketingCampaignId'"
	 * @generated
	 */
	List<String> salesOpportunities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='TrackingCode' route='marketingCampaignId'"
	 * @generated
	 */
	List<String> trackingCodes();

} // MarketingCampaign
