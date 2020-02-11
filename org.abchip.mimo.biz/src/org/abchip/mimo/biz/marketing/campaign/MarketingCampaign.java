/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;

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
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getMarketingCampaignNotes <em>Marketing Campaign Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getNumSent <em>Num Sent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getParentCampaignId <em>Parent Campaign Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getThruDate <em>Thru Date</em>}</li>
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
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
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
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
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
	 * @model annotation="mimo-ent-format type='name' length='100'"
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
	 * @model annotation="mimo-ent-format length='20'"
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
	 * @model annotation="mimo-ent-format length='255'"
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
	 * Returns the value of the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom Id</em>' reference.
	 * @see #setCurrencyUomId(Uom)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaign_CurrencyUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getCurrencyUomId <em>Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' reference.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(Uom value);

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
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
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
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
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
	 * @model required="true"
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
	 * @model annotation="mimo-ent-format length='255'"
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
	 * Returns the value of the '<em><b>Marketing Campaign Notes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaignNote}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marketing Campaign Notes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marketing Campaign Notes</em>' reference list.
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaign_MarketingCampaignNotes()
	 * @model derived="true"
	 * @generated
	 */
	List<MarketingCampaignNote> getMarketingCampaignNotes();

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
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
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
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
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
	 * Returns the value of the '<em><b>Parent Campaign Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Campaign Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Campaign Id</em>' reference.
	 * @see #setParentCampaignId(MarketingCampaign)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaign_ParentCampaignId()
	 * @model keys="marketingCampaignId"
	 * @generated
	 */
	MarketingCampaign getParentCampaignId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getParentCampaignId <em>Parent Campaign Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Campaign Id</em>' reference.
	 * @see #getParentCampaignId()
	 * @generated
	 */
	void setParentCampaignId(MarketingCampaign value);

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
	 * Returns the value of the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' reference.
	 * @see #setStatusId(StatusItem)
	 * @see org.abchip.mimo.biz.marketing.campaign.CampaignPackage#getMarketingCampaign_StatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.campaign.MarketingCampaign#getStatusId <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' reference.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(StatusItem value);

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

} // MarketingCampaign
