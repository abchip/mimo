/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.opportunity.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.common.period.CustomTimePeriod;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage;
import org.abchip.mimo.biz.marketing.opportunity.SalesForecast;
import org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sales Forecast History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getSalesForecastHistoryId <em>Sales Forecast History Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getBestCaseAmount <em>Best Case Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getChangeNote <em>Change Note</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getClosedAmount <em>Closed Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getForecastAmount <em>Forecast Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getModifiedTimestamp <em>Modified Timestamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getParentSalesForecastId <em>Parent Sales Forecast Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getPercentOfQuotaClosed <em>Percent Of Quota Closed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getPercentOfQuotaForecast <em>Percent Of Quota Forecast</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getQuotaAmount <em>Quota Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getSalesForecastId <em>Sales Forecast Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getInternalPartyId <em>Internal Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getCustomTimePeriodId <em>Custom Time Period Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getModifiedByUserLoginId <em>Modified By User Login Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SalesForecastHistoryImpl extends BizEntityImpl implements SalesForecastHistory {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getSalesForecastHistoryId() <em>Sales Forecast History Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesForecastHistoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String SALES_FORECAST_HISTORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSalesForecastHistoryId() <em>Sales Forecast History Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesForecastHistoryId()
	 * @generated
	 * @ordered
	 */
	protected String salesForecastHistoryId = SALES_FORECAST_HISTORY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBestCaseAmount() <em>Best Case Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestCaseAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BEST_CASE_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBestCaseAmount() <em>Best Case Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestCaseAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal bestCaseAmount = BEST_CASE_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeNote() <em>Change Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeNote()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGE_NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeNote() <em>Change Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeNote()
	 * @generated
	 * @ordered
	 */
	protected String changeNote = CHANGE_NOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClosedAmount() <em>Closed Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosedAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CLOSED_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClosedAmount() <em>Closed Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosedAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal closedAmount = CLOSED_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getForecastAmount() <em>Forecast Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecastAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal FORECAST_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForecastAmount() <em>Forecast Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForecastAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal forecastAmount = FORECAST_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getModifiedTimestamp() <em>Modified Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODIFIED_TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifiedTimestamp() <em>Modified Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Date modifiedTimestamp = MODIFIED_TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentSalesForecastId() <em>Parent Sales Forecast Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentSalesForecastId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_SALES_FORECAST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentSalesForecastId() <em>Parent Sales Forecast Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentSalesForecastId()
	 * @generated
	 * @ordered
	 */
	protected String parentSalesForecastId = PARENT_SALES_FORECAST_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentOfQuotaClosed() <em>Percent Of Quota Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentOfQuotaClosed()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PERCENT_OF_QUOTA_CLOSED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPercentOfQuotaClosed() <em>Percent Of Quota Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentOfQuotaClosed()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal percentOfQuotaClosed = PERCENT_OF_QUOTA_CLOSED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentOfQuotaForecast() <em>Percent Of Quota Forecast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentOfQuotaForecast()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PERCENT_OF_QUOTA_FORECAST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPercentOfQuotaForecast() <em>Percent Of Quota Forecast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentOfQuotaForecast()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal percentOfQuotaForecast = PERCENT_OF_QUOTA_FORECAST_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuotaAmount() <em>Quota Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuotaAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUOTA_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuotaAmount() <em>Quota Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuotaAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quotaAmount = QUOTA_AMOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSalesForecastId() <em>Sales Forecast Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesForecastId()
	 * @generated
	 * @ordered
	 */
	protected SalesForecast salesForecastId;

	/**
	 * The cached value of the '{@link #getOrganizationPartyId() <em>Organization Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party organizationPartyId;

	/**
	 * The cached value of the '{@link #getInternalPartyId() <em>Internal Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party internalPartyId;

	/**
	 * The cached value of the '{@link #getCustomTimePeriodId() <em>Custom Time Period Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomTimePeriodId()
	 * @generated
	 * @ordered
	 */
	protected CustomTimePeriod customTimePeriodId;

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
	 * The cached value of the '{@link #getModifiedByUserLoginId() <em>Modified By User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected UserLogin modifiedByUserLoginId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalesForecastHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpportunityPackage.Literals.SALES_FORECAST_HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getBestCaseAmount() {
		return bestCaseAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBestCaseAmount(BigDecimal newBestCaseAmount) {
		bestCaseAmount = newBestCaseAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangeNote() {
		return changeNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeNote(String newChangeNote) {
		changeNote = newChangeNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getClosedAmount() {
		return closedAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClosedAmount(BigDecimal newClosedAmount) {
		closedAmount = newClosedAmount;
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
		currencyUomId = newCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomTimePeriod getCustomTimePeriodId() {
		if (customTimePeriodId != null && ((EObject)customTimePeriodId).eIsProxy()) {
			InternalEObject oldCustomTimePeriodId = (InternalEObject)customTimePeriodId;
			customTimePeriodId = (CustomTimePeriod)eResolveProxy(oldCustomTimePeriodId);
			if (customTimePeriodId != oldCustomTimePeriodId) {
			}
		}
		return customTimePeriodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomTimePeriod basicGetCustomTimePeriodId() {
		return customTimePeriodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomTimePeriodId(CustomTimePeriod newCustomTimePeriodId) {
		customTimePeriodId = newCustomTimePeriodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getForecastAmount() {
		return forecastAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForecastAmount(BigDecimal newForecastAmount) {
		forecastAmount = newForecastAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getInternalPartyId() {
		if (internalPartyId != null && ((EObject)internalPartyId).eIsProxy()) {
			InternalEObject oldInternalPartyId = (InternalEObject)internalPartyId;
			internalPartyId = (Party)eResolveProxy(oldInternalPartyId);
			if (internalPartyId != oldInternalPartyId) {
			}
		}
		return internalPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetInternalPartyId() {
		return internalPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalPartyId(Party newInternalPartyId) {
		internalPartyId = newInternalPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getModifiedByUserLoginId() {
		if (modifiedByUserLoginId != null && ((EObject)modifiedByUserLoginId).eIsProxy()) {
			InternalEObject oldModifiedByUserLoginId = (InternalEObject)modifiedByUserLoginId;
			modifiedByUserLoginId = (UserLogin)eResolveProxy(oldModifiedByUserLoginId);
			if (modifiedByUserLoginId != oldModifiedByUserLoginId) {
			}
		}
		return modifiedByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetModifiedByUserLoginId() {
		return modifiedByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModifiedByUserLoginId(UserLogin newModifiedByUserLoginId) {
		modifiedByUserLoginId = newModifiedByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getModifiedTimestamp() {
		return modifiedTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModifiedTimestamp(Date newModifiedTimestamp) {
		modifiedTimestamp = newModifiedTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getOrganizationPartyId() {
		if (organizationPartyId != null && ((EObject)organizationPartyId).eIsProxy()) {
			InternalEObject oldOrganizationPartyId = (InternalEObject)organizationPartyId;
			organizationPartyId = (Party)eResolveProxy(oldOrganizationPartyId);
			if (organizationPartyId != oldOrganizationPartyId) {
			}
		}
		return organizationPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetOrganizationPartyId() {
		return organizationPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationPartyId(Party newOrganizationPartyId) {
		organizationPartyId = newOrganizationPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentSalesForecastId() {
		return parentSalesForecastId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentSalesForecastId(String newParentSalesForecastId) {
		parentSalesForecastId = newParentSalesForecastId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPercentOfQuotaClosed() {
		return percentOfQuotaClosed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentOfQuotaClosed(BigDecimal newPercentOfQuotaClosed) {
		percentOfQuotaClosed = newPercentOfQuotaClosed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPercentOfQuotaForecast() {
		return percentOfQuotaForecast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentOfQuotaForecast(BigDecimal newPercentOfQuotaForecast) {
		percentOfQuotaForecast = newPercentOfQuotaForecast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuotaAmount() {
		return quotaAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuotaAmount(BigDecimal newQuotaAmount) {
		quotaAmount = newQuotaAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSalesForecastHistoryId() {
		return salesForecastHistoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesForecastHistoryId(String newSalesForecastHistoryId) {
		salesForecastHistoryId = newSalesForecastHistoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SalesForecast getSalesForecastId() {
		if (salesForecastId != null && ((EObject)salesForecastId).eIsProxy()) {
			InternalEObject oldSalesForecastId = (InternalEObject)salesForecastId;
			salesForecastId = (SalesForecast)eResolveProxy(oldSalesForecastId);
			if (salesForecastId != oldSalesForecastId) {
			}
		}
		return salesForecastId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalesForecast basicGetSalesForecastId() {
		return salesForecastId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesForecastId(SalesForecast newSalesForecastId) {
		salesForecastId = newSalesForecastId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpportunityPackage.SALES_FORECAST_HISTORY__SALES_FORECAST_HISTORY_ID:
				return getSalesForecastHistoryId();
			case OpportunityPackage.SALES_FORECAST_HISTORY__BEST_CASE_AMOUNT:
				return getBestCaseAmount();
			case OpportunityPackage.SALES_FORECAST_HISTORY__CHANGE_NOTE:
				return getChangeNote();
			case OpportunityPackage.SALES_FORECAST_HISTORY__CLOSED_AMOUNT:
				return getClosedAmount();
			case OpportunityPackage.SALES_FORECAST_HISTORY__FORECAST_AMOUNT:
				return getForecastAmount();
			case OpportunityPackage.SALES_FORECAST_HISTORY__MODIFIED_TIMESTAMP:
				return getModifiedTimestamp();
			case OpportunityPackage.SALES_FORECAST_HISTORY__PARENT_SALES_FORECAST_ID:
				return getParentSalesForecastId();
			case OpportunityPackage.SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_CLOSED:
				return getPercentOfQuotaClosed();
			case OpportunityPackage.SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_FORECAST:
				return getPercentOfQuotaForecast();
			case OpportunityPackage.SALES_FORECAST_HISTORY__QUOTA_AMOUNT:
				return getQuotaAmount();
			case OpportunityPackage.SALES_FORECAST_HISTORY__SALES_FORECAST_ID:
				if (resolve) return getSalesForecastId();
				return basicGetSalesForecastId();
			case OpportunityPackage.SALES_FORECAST_HISTORY__ORGANIZATION_PARTY_ID:
				if (resolve) return getOrganizationPartyId();
				return basicGetOrganizationPartyId();
			case OpportunityPackage.SALES_FORECAST_HISTORY__INTERNAL_PARTY_ID:
				if (resolve) return getInternalPartyId();
				return basicGetInternalPartyId();
			case OpportunityPackage.SALES_FORECAST_HISTORY__CUSTOM_TIME_PERIOD_ID:
				if (resolve) return getCustomTimePeriodId();
				return basicGetCustomTimePeriodId();
			case OpportunityPackage.SALES_FORECAST_HISTORY__CURRENCY_UOM_ID:
				if (resolve) return getCurrencyUomId();
				return basicGetCurrencyUomId();
			case OpportunityPackage.SALES_FORECAST_HISTORY__MODIFIED_BY_USER_LOGIN_ID:
				if (resolve) return getModifiedByUserLoginId();
				return basicGetModifiedByUserLoginId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpportunityPackage.SALES_FORECAST_HISTORY__SALES_FORECAST_HISTORY_ID:
				setSalesForecastHistoryId((String)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__BEST_CASE_AMOUNT:
				setBestCaseAmount((BigDecimal)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__CHANGE_NOTE:
				setChangeNote((String)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__CLOSED_AMOUNT:
				setClosedAmount((BigDecimal)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__FORECAST_AMOUNT:
				setForecastAmount((BigDecimal)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__MODIFIED_TIMESTAMP:
				setModifiedTimestamp((Date)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__PARENT_SALES_FORECAST_ID:
				setParentSalesForecastId((String)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_CLOSED:
				setPercentOfQuotaClosed((BigDecimal)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_FORECAST:
				setPercentOfQuotaForecast((BigDecimal)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__QUOTA_AMOUNT:
				setQuotaAmount((BigDecimal)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__SALES_FORECAST_ID:
				setSalesForecastId((SalesForecast)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((Party)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__INTERNAL_PARTY_ID:
				setInternalPartyId((Party)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__CUSTOM_TIME_PERIOD_ID:
				setCustomTimePeriodId((CustomTimePeriod)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__MODIFIED_BY_USER_LOGIN_ID:
				setModifiedByUserLoginId((UserLogin)newValue);
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
			case OpportunityPackage.SALES_FORECAST_HISTORY__SALES_FORECAST_HISTORY_ID:
				setSalesForecastHistoryId(SALES_FORECAST_HISTORY_ID_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__BEST_CASE_AMOUNT:
				setBestCaseAmount(BEST_CASE_AMOUNT_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__CHANGE_NOTE:
				setChangeNote(CHANGE_NOTE_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__CLOSED_AMOUNT:
				setClosedAmount(CLOSED_AMOUNT_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__FORECAST_AMOUNT:
				setForecastAmount(FORECAST_AMOUNT_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__MODIFIED_TIMESTAMP:
				setModifiedTimestamp(MODIFIED_TIMESTAMP_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__PARENT_SALES_FORECAST_ID:
				setParentSalesForecastId(PARENT_SALES_FORECAST_ID_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_CLOSED:
				setPercentOfQuotaClosed(PERCENT_OF_QUOTA_CLOSED_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_FORECAST:
				setPercentOfQuotaForecast(PERCENT_OF_QUOTA_FORECAST_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__QUOTA_AMOUNT:
				setQuotaAmount(QUOTA_AMOUNT_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__SALES_FORECAST_ID:
				setSalesForecastId((SalesForecast)null);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((Party)null);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__INTERNAL_PARTY_ID:
				setInternalPartyId((Party)null);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__CUSTOM_TIME_PERIOD_ID:
				setCustomTimePeriodId((CustomTimePeriod)null);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)null);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__MODIFIED_BY_USER_LOGIN_ID:
				setModifiedByUserLoginId((UserLogin)null);
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
			case OpportunityPackage.SALES_FORECAST_HISTORY__SALES_FORECAST_HISTORY_ID:
				return SALES_FORECAST_HISTORY_ID_EDEFAULT == null ? salesForecastHistoryId != null : !SALES_FORECAST_HISTORY_ID_EDEFAULT.equals(salesForecastHistoryId);
			case OpportunityPackage.SALES_FORECAST_HISTORY__BEST_CASE_AMOUNT:
				return BEST_CASE_AMOUNT_EDEFAULT == null ? bestCaseAmount != null : !BEST_CASE_AMOUNT_EDEFAULT.equals(bestCaseAmount);
			case OpportunityPackage.SALES_FORECAST_HISTORY__CHANGE_NOTE:
				return CHANGE_NOTE_EDEFAULT == null ? changeNote != null : !CHANGE_NOTE_EDEFAULT.equals(changeNote);
			case OpportunityPackage.SALES_FORECAST_HISTORY__CLOSED_AMOUNT:
				return CLOSED_AMOUNT_EDEFAULT == null ? closedAmount != null : !CLOSED_AMOUNT_EDEFAULT.equals(closedAmount);
			case OpportunityPackage.SALES_FORECAST_HISTORY__FORECAST_AMOUNT:
				return FORECAST_AMOUNT_EDEFAULT == null ? forecastAmount != null : !FORECAST_AMOUNT_EDEFAULT.equals(forecastAmount);
			case OpportunityPackage.SALES_FORECAST_HISTORY__MODIFIED_TIMESTAMP:
				return MODIFIED_TIMESTAMP_EDEFAULT == null ? modifiedTimestamp != null : !MODIFIED_TIMESTAMP_EDEFAULT.equals(modifiedTimestamp);
			case OpportunityPackage.SALES_FORECAST_HISTORY__PARENT_SALES_FORECAST_ID:
				return PARENT_SALES_FORECAST_ID_EDEFAULT == null ? parentSalesForecastId != null : !PARENT_SALES_FORECAST_ID_EDEFAULT.equals(parentSalesForecastId);
			case OpportunityPackage.SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_CLOSED:
				return PERCENT_OF_QUOTA_CLOSED_EDEFAULT == null ? percentOfQuotaClosed != null : !PERCENT_OF_QUOTA_CLOSED_EDEFAULT.equals(percentOfQuotaClosed);
			case OpportunityPackage.SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_FORECAST:
				return PERCENT_OF_QUOTA_FORECAST_EDEFAULT == null ? percentOfQuotaForecast != null : !PERCENT_OF_QUOTA_FORECAST_EDEFAULT.equals(percentOfQuotaForecast);
			case OpportunityPackage.SALES_FORECAST_HISTORY__QUOTA_AMOUNT:
				return QUOTA_AMOUNT_EDEFAULT == null ? quotaAmount != null : !QUOTA_AMOUNT_EDEFAULT.equals(quotaAmount);
			case OpportunityPackage.SALES_FORECAST_HISTORY__SALES_FORECAST_ID:
				return salesForecastId != null;
			case OpportunityPackage.SALES_FORECAST_HISTORY__ORGANIZATION_PARTY_ID:
				return organizationPartyId != null;
			case OpportunityPackage.SALES_FORECAST_HISTORY__INTERNAL_PARTY_ID:
				return internalPartyId != null;
			case OpportunityPackage.SALES_FORECAST_HISTORY__CUSTOM_TIME_PERIOD_ID:
				return customTimePeriodId != null;
			case OpportunityPackage.SALES_FORECAST_HISTORY__CURRENCY_UOM_ID:
				return currencyUomId != null;
			case OpportunityPackage.SALES_FORECAST_HISTORY__MODIFIED_BY_USER_LOGIN_ID:
				return modifiedByUserLoginId != null;
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
		result.append(" (salesForecastHistoryId: ");
		result.append(salesForecastHistoryId);
		result.append(", bestCaseAmount: ");
		result.append(bestCaseAmount);
		result.append(", changeNote: ");
		result.append(changeNote);
		result.append(", closedAmount: ");
		result.append(closedAmount);
		result.append(", forecastAmount: ");
		result.append(forecastAmount);
		result.append(", modifiedTimestamp: ");
		result.append(modifiedTimestamp);
		result.append(", parentSalesForecastId: ");
		result.append(parentSalesForecastId);
		result.append(", percentOfQuotaClosed: ");
		result.append(percentOfQuotaClosed);
		result.append(", percentOfQuotaForecast: ");
		result.append(percentOfQuotaForecast);
		result.append(", quotaAmount: ");
		result.append(quotaAmount);
		result.append(')');
		return result.toString();
	}

} //SalesForecastHistoryImpl
