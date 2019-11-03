/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.opportunity;

import java.math.BigDecimal;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sales Forecast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getSalesForecastId <em>Sales Forecast Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getBestCaseAmount <em>Best Case Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getClosedAmount <em>Closed Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getCreatedByUserLoginId <em>Created By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getCustomTimePeriodId <em>Custom Time Period Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getForecastAmount <em>Forecast Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getInternalPartyId <em>Internal Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getModifiedByUserLoginId <em>Modified By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getParentSalesForecastId <em>Parent Sales Forecast Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getPercentOfQuotaClosed <em>Percent Of Quota Closed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getPercentOfQuotaForecast <em>Percent Of Quota Forecast</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getPipelineAmount <em>Pipeline Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getQuotaAmount <em>Quota Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getSalesForecastDetails <em>Sales Forecast Details</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesForecast()
 * @model
 * @generated
 */
public interface SalesForecast extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Best Case Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Best Case Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Best Case Amount</em>' attribute.
	 * @see #setBestCaseAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesForecast_BestCaseAmount()
	 * @model
	 * @generated
	 */
	BigDecimal getBestCaseAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getBestCaseAmount <em>Best Case Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Best Case Amount</em>' attribute.
	 * @see #getBestCaseAmount()
	 * @generated
	 */
	void setBestCaseAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Closed Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closed Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed Amount</em>' attribute.
	 * @see #setClosedAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesForecast_ClosedAmount()
	 * @model
	 * @generated
	 */
	BigDecimal getClosedAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getClosedAmount <em>Closed Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed Amount</em>' attribute.
	 * @see #getClosedAmount()
	 * @generated
	 */
	void setClosedAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Created By User Login Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login Id</em>' attribute.
	 * @see #setCreatedByUserLoginId(String)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesForecast_CreatedByUserLoginId()
	 * @model annotation="mimo-ent-domain frame='UserLogin'"
	 * @generated
	 */
	String getCreatedByUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getCreatedByUserLoginId <em>Created By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login Id</em>' attribute.
	 * @see #getCreatedByUserLoginId()
	 * @generated
	 */
	void setCreatedByUserLoginId(String value);

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
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesForecast_CurrencyUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getCurrencyUomId <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(String value);

	/**
	 * Returns the value of the '<em><b>Custom Time Period Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Time Period Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Time Period Id</em>' attribute.
	 * @see #setCustomTimePeriodId(String)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesForecast_CustomTimePeriodId()
	 * @model annotation="mimo-ent-domain frame='CustomTimePeriod'"
	 * @generated
	 */
	String getCustomTimePeriodId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getCustomTimePeriodId <em>Custom Time Period Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Time Period Id</em>' attribute.
	 * @see #getCustomTimePeriodId()
	 * @generated
	 */
	void setCustomTimePeriodId(String value);

	/**
	 * Returns the value of the '<em><b>Forecast Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forecast Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forecast Amount</em>' attribute.
	 * @see #setForecastAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesForecast_ForecastAmount()
	 * @model
	 * @generated
	 */
	BigDecimal getForecastAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getForecastAmount <em>Forecast Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forecast Amount</em>' attribute.
	 * @see #getForecastAmount()
	 * @generated
	 */
	void setForecastAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Internal Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Party Id</em>' attribute.
	 * @see #setInternalPartyId(String)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesForecast_InternalPartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getInternalPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getInternalPartyId <em>Internal Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Party Id</em>' attribute.
	 * @see #getInternalPartyId()
	 * @generated
	 */
	void setInternalPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Modified By User Login Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified By User Login Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified By User Login Id</em>' attribute.
	 * @see #setModifiedByUserLoginId(String)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesForecast_ModifiedByUserLoginId()
	 * @model annotation="mimo-ent-domain frame='UserLogin'"
	 * @generated
	 */
	String getModifiedByUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getModifiedByUserLoginId <em>Modified By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified By User Login Id</em>' attribute.
	 * @see #getModifiedByUserLoginId()
	 * @generated
	 */
	void setModifiedByUserLoginId(String value);

	/**
	 * Returns the value of the '<em><b>Organization Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Party Id</em>' attribute.
	 * @see #setOrganizationPartyId(String)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesForecast_OrganizationPartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getOrganizationPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getOrganizationPartyId <em>Organization Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Party Id</em>' attribute.
	 * @see #getOrganizationPartyId()
	 * @generated
	 */
	void setOrganizationPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Parent Sales Forecast Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Sales Forecast Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Sales Forecast Id</em>' attribute.
	 * @see #setParentSalesForecastId(String)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesForecast_ParentSalesForecastId()
	 * @model annotation="mimo-ent-domain frame='SalesForecast'"
	 * @generated
	 */
	String getParentSalesForecastId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getParentSalesForecastId <em>Parent Sales Forecast Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Sales Forecast Id</em>' attribute.
	 * @see #getParentSalesForecastId()
	 * @generated
	 */
	void setParentSalesForecastId(String value);

	/**
	 * Returns the value of the '<em><b>Percent Of Quota Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percent Of Quota Closed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percent Of Quota Closed</em>' attribute.
	 * @see #setPercentOfQuotaClosed(BigDecimal)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesForecast_PercentOfQuotaClosed()
	 * @model
	 * @generated
	 */
	BigDecimal getPercentOfQuotaClosed();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getPercentOfQuotaClosed <em>Percent Of Quota Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Of Quota Closed</em>' attribute.
	 * @see #getPercentOfQuotaClosed()
	 * @generated
	 */
	void setPercentOfQuotaClosed(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Percent Of Quota Forecast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percent Of Quota Forecast</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percent Of Quota Forecast</em>' attribute.
	 * @see #setPercentOfQuotaForecast(BigDecimal)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesForecast_PercentOfQuotaForecast()
	 * @model
	 * @generated
	 */
	BigDecimal getPercentOfQuotaForecast();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getPercentOfQuotaForecast <em>Percent Of Quota Forecast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Of Quota Forecast</em>' attribute.
	 * @see #getPercentOfQuotaForecast()
	 * @generated
	 */
	void setPercentOfQuotaForecast(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Pipeline Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pipeline Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pipeline Amount</em>' attribute.
	 * @see #setPipelineAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesForecast_PipelineAmount()
	 * @model
	 * @generated
	 */
	BigDecimal getPipelineAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getPipelineAmount <em>Pipeline Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pipeline Amount</em>' attribute.
	 * @see #getPipelineAmount()
	 * @generated
	 */
	void setPipelineAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Quota Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quota Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quota Amount</em>' attribute.
	 * @see #setQuotaAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesForecast_QuotaAmount()
	 * @model
	 * @generated
	 */
	BigDecimal getQuotaAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getQuotaAmount <em>Quota Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quota Amount</em>' attribute.
	 * @see #getQuotaAmount()
	 * @generated
	 */
	void setQuotaAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Sales Forecast Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Forecast Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Forecast Id</em>' attribute.
	 * @see #setSalesForecastId(String)
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesForecast_SalesForecastId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getSalesForecastId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.opportunity.SalesForecast#getSalesForecastId <em>Sales Forecast Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Forecast Id</em>' attribute.
	 * @see #getSalesForecastId()
	 * @generated
	 */
	void setSalesForecastId(String value);

	/**
	 * Returns the value of the '<em><b>Sales Forecast Details</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Forecast Details</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Forecast Details</em>' attribute list.
	 * @see org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage#getSalesForecast_SalesForecastDetails()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesForecastDetail'"
	 * @generated
	 */
	List<String> getSalesForecastDetails();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesForecast' route='parentSalesForecastId'"
	 * @generated
	 */
	List<String> childSalesForecasts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesForecastHistory' route='salesForecastId'"
	 * @generated
	 */
	List<String> salesForecastHistories();

} // SalesForecast
