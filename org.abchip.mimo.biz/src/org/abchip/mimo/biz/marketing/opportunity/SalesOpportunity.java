/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.opportunity;

import java.math.BigDecimal;

import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sales Opportunity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getSalesOpportunityId <em>Sales Opportunity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getDataSourceId <em>Data Source Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getEstimatedAmount <em>Estimated Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getEstimatedCloseDate <em>Estimated Close Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getEstimatedProbability <em>Estimated Probability</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getMarketingCampaignId <em>Marketing Campaign Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getNextStep <em>Next Step</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getNextStepDate <em>Next Step Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getOpportunityName <em>Opportunity Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getOpportunityStageId <em>Opportunity Stage Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getTypeEnumId <em>Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getSalesOpportunityCompetitors <em>Sales Opportunity Competitors</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getSalesOpportunityQuotes <em>Sales Opportunity Quotes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getSalesOpportunityTrckCodes <em>Sales Opportunity Trck Codes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getSalesOpportunityWorkEfforts <em>Sales Opportunity Work Efforts</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunity()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface SalesOpportunity extends BizEntity {
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
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunity_CreatedByUserLogin()
	 * @model annotation="mimo-ent-domain frame='UserLogin'"
	 * @generated
	 */
	String getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getCreatedByUserLogin <em>Created By User Login</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunity_CurrencyUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getCurrencyUomId <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(String value);

	/**
	 * Returns the value of the '<em><b>Data Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source Id</em>' attribute.
	 * @see #setDataSourceId(String)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunity_DataSourceId()
	 * @model
	 * @generated
	 */
	String getDataSourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getDataSourceId <em>Data Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source Id</em>' attribute.
	 * @see #getDataSourceId()
	 * @generated
	 */
	void setDataSourceId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunity_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Estimated Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Amount</em>' attribute.
	 * @see #setEstimatedAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunity_EstimatedAmount()
	 * @model
	 * @generated
	 */
	BigDecimal getEstimatedAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getEstimatedAmount <em>Estimated Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Amount</em>' attribute.
	 * @see #getEstimatedAmount()
	 * @generated
	 */
	void setEstimatedAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Estimated Close Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Close Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Close Date</em>' attribute.
	 * @see #setEstimatedCloseDate(Date)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunity_EstimatedCloseDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedCloseDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getEstimatedCloseDate <em>Estimated Close Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Close Date</em>' attribute.
	 * @see #getEstimatedCloseDate()
	 * @generated
	 */
	void setEstimatedCloseDate(Date value);

	/**
	 * Returns the value of the '<em><b>Estimated Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Probability</em>' attribute.
	 * @see #setEstimatedProbability(BigDecimal)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunity_EstimatedProbability()
	 * @model
	 * @generated
	 */
	BigDecimal getEstimatedProbability();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getEstimatedProbability <em>Estimated Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Probability</em>' attribute.
	 * @see #getEstimatedProbability()
	 * @generated
	 */
	void setEstimatedProbability(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunity_MarketingCampaignId()
	 * @model annotation="mimo-ent-domain frame='MarketingCampaign'"
	 * @generated
	 */
	String getMarketingCampaignId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getMarketingCampaignId <em>Marketing Campaign Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marketing Campaign Id</em>' attribute.
	 * @see #getMarketingCampaignId()
	 * @generated
	 */
	void setMarketingCampaignId(String value);

	/**
	 * Returns the value of the '<em><b>Next Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Step</em>' attribute.
	 * @see #setNextStep(String)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunity_NextStep()
	 * @model
	 * @generated
	 */
	String getNextStep();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getNextStep <em>Next Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Step</em>' attribute.
	 * @see #getNextStep()
	 * @generated
	 */
	void setNextStep(String value);

	/**
	 * Returns the value of the '<em><b>Next Step Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Step Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Step Date</em>' attribute.
	 * @see #setNextStepDate(Date)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunity_NextStepDate()
	 * @model
	 * @generated
	 */
	Date getNextStepDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getNextStepDate <em>Next Step Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Step Date</em>' attribute.
	 * @see #getNextStepDate()
	 * @generated
	 */
	void setNextStepDate(Date value);

	/**
	 * Returns the value of the '<em><b>Opportunity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opportunity Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opportunity Name</em>' attribute.
	 * @see #setOpportunityName(String)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunity_OpportunityName()
	 * @model
	 * @generated
	 */
	String getOpportunityName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getOpportunityName <em>Opportunity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opportunity Name</em>' attribute.
	 * @see #getOpportunityName()
	 * @generated
	 */
	void setOpportunityName(String value);

	/**
	 * Returns the value of the '<em><b>Opportunity Stage Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opportunity Stage Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opportunity Stage Id</em>' attribute.
	 * @see #setOpportunityStageId(String)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunity_OpportunityStageId()
	 * @model annotation="mimo-ent-domain frame='SalesOpportunityStage'"
	 * @generated
	 */
	String getOpportunityStageId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getOpportunityStageId <em>Opportunity Stage Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opportunity Stage Id</em>' attribute.
	 * @see #getOpportunityStageId()
	 * @generated
	 */
	void setOpportunityStageId(String value);

	/**
	 * Returns the value of the '<em><b>Sales Opportunity Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Opportunity Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Opportunity Id</em>' attribute.
	 * @see #setSalesOpportunityId(String)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunity_SalesOpportunityId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getSalesOpportunityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getSalesOpportunityId <em>Sales Opportunity Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Opportunity Id</em>' attribute.
	 * @see #getSalesOpportunityId()
	 * @generated
	 */
	void setSalesOpportunityId(String value);

	/**
	 * Returns the value of the '<em><b>Type Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Enum Id</em>' attribute.
	 * @see #setTypeEnumId(String)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunity_TypeEnumId()
	 * @model annotation="mimo-ent-domain frame='Enumeration'"
	 * @generated
	 */
	String getTypeEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity#getTypeEnumId <em>Type Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Enum Id</em>' attribute.
	 * @see #getTypeEnumId()
	 * @generated
	 */
	void setTypeEnumId(String value);

	/**
	 * Returns the value of the '<em><b>Sales Opportunity Competitors</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Opportunity Competitors</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Opportunity Competitors</em>' attribute list.
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunity_SalesOpportunityCompetitors()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesOpportunityCompetitor'"
	 * @generated
	 */
	List<String> getSalesOpportunityCompetitors();

	/**
	 * Returns the value of the '<em><b>Sales Opportunity Quotes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Opportunity Quotes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Opportunity Quotes</em>' attribute list.
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunity_SalesOpportunityQuotes()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesOpportunityQuote'"
	 * @generated
	 */
	List<String> getSalesOpportunityQuotes();

	/**
	 * Returns the value of the '<em><b>Sales Opportunity Trck Codes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Opportunity Trck Codes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Opportunity Trck Codes</em>' attribute list.
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunity_SalesOpportunityTrckCodes()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesOpportunityTrckCode'"
	 * @generated
	 */
	List<String> getSalesOpportunityTrckCodes();

	/**
	 * Returns the value of the '<em><b>Sales Opportunity Work Efforts</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Opportunity Work Efforts</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Opportunity Work Efforts</em>' attribute list.
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesOpportunity_SalesOpportunityWorkEfforts()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesOpportunityWorkEffort'"
	 * @generated
	 */
	List<String> getSalesOpportunityWorkEfforts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InvoiceItem' route='salesOpportunityId'"
	 * @generated
	 */
	List<String> invoiceItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderItem' route='salesOpportunityId'"
	 * @generated
	 */
	List<String> orderItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesOpportunityHistory' route='salesOpportunityId'"
	 * @generated
	 */
	List<String> salesOpportunityHistories();

} // SalesOpportunity
