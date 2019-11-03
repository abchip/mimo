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

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage;
import org.abchip.mimo.biz.marketing.opportunity.SalesForecastHistory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getCustomTimePeriodId <em>Custom Time Period Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getForecastAmount <em>Forecast Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getInternalPartyId <em>Internal Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getModifiedByUserLoginId <em>Modified By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getModifiedTimestamp <em>Modified Timestamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getParentSalesForecastId <em>Parent Sales Forecast Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getPercentOfQuotaClosed <em>Percent Of Quota Closed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getPercentOfQuotaForecast <em>Percent Of Quota Forecast</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getQuotaAmount <em>Quota Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastHistoryImpl#getSalesForecastId <em>Sales Forecast Id</em>}</li>
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
	 * The default value of the '{@link #getCustomTimePeriodId() <em>Custom Time Period Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomTimePeriodId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_TIME_PERIOD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomTimePeriodId() <em>Custom Time Period Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomTimePeriodId()
	 * @generated
	 * @ordered
	 */
	protected String customTimePeriodId = CUSTOM_TIME_PERIOD_ID_EDEFAULT;

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
	 * The default value of the '{@link #getInternalPartyId() <em>Internal Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERNAL_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternalPartyId() <em>Internal Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalPartyId()
	 * @generated
	 * @ordered
	 */
	protected String internalPartyId = INTERNAL_PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getModifiedByUserLoginId() <em>Modified By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFIED_BY_USER_LOGIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifiedByUserLoginId() <em>Modified By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected String modifiedByUserLoginId = MODIFIED_BY_USER_LOGIN_ID_EDEFAULT;

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
	 * The default value of the '{@link #getOrganizationPartyId() <em>Organization Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganizationPartyId() <em>Organization Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationPartyId()
	 * @generated
	 * @ordered
	 */
	protected String organizationPartyId = ORGANIZATION_PARTY_ID_EDEFAULT;

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
	 * The default value of the '{@link #getSalesForecastId() <em>Sales Forecast Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesForecastId()
	 * @generated
	 * @ordered
	 */
	protected static final String SALES_FORECAST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSalesForecastId() <em>Sales Forecast Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesForecastId()
	 * @generated
	 * @ordered
	 */
	protected String salesForecastId = SALES_FORECAST_ID_EDEFAULT;

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
		BigDecimal oldBestCaseAmount = bestCaseAmount;
		bestCaseAmount = newBestCaseAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST_HISTORY__BEST_CASE_AMOUNT, oldBestCaseAmount, bestCaseAmount));
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
		String oldChangeNote = changeNote;
		changeNote = newChangeNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST_HISTORY__CHANGE_NOTE, oldChangeNote, changeNote));
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
		BigDecimal oldClosedAmount = closedAmount;
		closedAmount = newClosedAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST_HISTORY__CLOSED_AMOUNT, oldClosedAmount, closedAmount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST_HISTORY__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomTimePeriodId() {
		return customTimePeriodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomTimePeriodId(String newCustomTimePeriodId) {
		String oldCustomTimePeriodId = customTimePeriodId;
		customTimePeriodId = newCustomTimePeriodId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST_HISTORY__CUSTOM_TIME_PERIOD_ID, oldCustomTimePeriodId, customTimePeriodId));
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
		BigDecimal oldForecastAmount = forecastAmount;
		forecastAmount = newForecastAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST_HISTORY__FORECAST_AMOUNT, oldForecastAmount, forecastAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInternalPartyId() {
		return internalPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalPartyId(String newInternalPartyId) {
		String oldInternalPartyId = internalPartyId;
		internalPartyId = newInternalPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST_HISTORY__INTERNAL_PARTY_ID, oldInternalPartyId, internalPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModifiedByUserLoginId() {
		return modifiedByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModifiedByUserLoginId(String newModifiedByUserLoginId) {
		String oldModifiedByUserLoginId = modifiedByUserLoginId;
		modifiedByUserLoginId = newModifiedByUserLoginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST_HISTORY__MODIFIED_BY_USER_LOGIN_ID, oldModifiedByUserLoginId, modifiedByUserLoginId));
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
		Date oldModifiedTimestamp = modifiedTimestamp;
		modifiedTimestamp = newModifiedTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST_HISTORY__MODIFIED_TIMESTAMP, oldModifiedTimestamp, modifiedTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrganizationPartyId() {
		return organizationPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationPartyId(String newOrganizationPartyId) {
		String oldOrganizationPartyId = organizationPartyId;
		organizationPartyId = newOrganizationPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST_HISTORY__ORGANIZATION_PARTY_ID, oldOrganizationPartyId, organizationPartyId));
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
		String oldParentSalesForecastId = parentSalesForecastId;
		parentSalesForecastId = newParentSalesForecastId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST_HISTORY__PARENT_SALES_FORECAST_ID, oldParentSalesForecastId, parentSalesForecastId));
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
		BigDecimal oldPercentOfQuotaClosed = percentOfQuotaClosed;
		percentOfQuotaClosed = newPercentOfQuotaClosed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_CLOSED, oldPercentOfQuotaClosed, percentOfQuotaClosed));
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
		BigDecimal oldPercentOfQuotaForecast = percentOfQuotaForecast;
		percentOfQuotaForecast = newPercentOfQuotaForecast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_FORECAST, oldPercentOfQuotaForecast, percentOfQuotaForecast));
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
		BigDecimal oldQuotaAmount = quotaAmount;
		quotaAmount = newQuotaAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST_HISTORY__QUOTA_AMOUNT, oldQuotaAmount, quotaAmount));
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
		String oldSalesForecastHistoryId = salesForecastHistoryId;
		salesForecastHistoryId = newSalesForecastHistoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST_HISTORY__SALES_FORECAST_HISTORY_ID, oldSalesForecastHistoryId, salesForecastHistoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSalesForecastId() {
		return salesForecastId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesForecastId(String newSalesForecastId) {
		String oldSalesForecastId = salesForecastId;
		salesForecastId = newSalesForecastId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST_HISTORY__SALES_FORECAST_ID, oldSalesForecastId, salesForecastId));
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
			case OpportunityPackage.SALES_FORECAST_HISTORY__CURRENCY_UOM_ID:
				return getCurrencyUomId();
			case OpportunityPackage.SALES_FORECAST_HISTORY__CUSTOM_TIME_PERIOD_ID:
				return getCustomTimePeriodId();
			case OpportunityPackage.SALES_FORECAST_HISTORY__FORECAST_AMOUNT:
				return getForecastAmount();
			case OpportunityPackage.SALES_FORECAST_HISTORY__INTERNAL_PARTY_ID:
				return getInternalPartyId();
			case OpportunityPackage.SALES_FORECAST_HISTORY__MODIFIED_BY_USER_LOGIN_ID:
				return getModifiedByUserLoginId();
			case OpportunityPackage.SALES_FORECAST_HISTORY__MODIFIED_TIMESTAMP:
				return getModifiedTimestamp();
			case OpportunityPackage.SALES_FORECAST_HISTORY__ORGANIZATION_PARTY_ID:
				return getOrganizationPartyId();
			case OpportunityPackage.SALES_FORECAST_HISTORY__PARENT_SALES_FORECAST_ID:
				return getParentSalesForecastId();
			case OpportunityPackage.SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_CLOSED:
				return getPercentOfQuotaClosed();
			case OpportunityPackage.SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_FORECAST:
				return getPercentOfQuotaForecast();
			case OpportunityPackage.SALES_FORECAST_HISTORY__QUOTA_AMOUNT:
				return getQuotaAmount();
			case OpportunityPackage.SALES_FORECAST_HISTORY__SALES_FORECAST_ID:
				return getSalesForecastId();
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
			case OpportunityPackage.SALES_FORECAST_HISTORY__CURRENCY_UOM_ID:
				setCurrencyUomId((String)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__CUSTOM_TIME_PERIOD_ID:
				setCustomTimePeriodId((String)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__FORECAST_AMOUNT:
				setForecastAmount((BigDecimal)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__INTERNAL_PARTY_ID:
				setInternalPartyId((String)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__MODIFIED_BY_USER_LOGIN_ID:
				setModifiedByUserLoginId((String)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__MODIFIED_TIMESTAMP:
				setModifiedTimestamp((Date)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((String)newValue);
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
				setSalesForecastId((String)newValue);
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
			case OpportunityPackage.SALES_FORECAST_HISTORY__CURRENCY_UOM_ID:
				setCurrencyUomId(CURRENCY_UOM_ID_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__CUSTOM_TIME_PERIOD_ID:
				setCustomTimePeriodId(CUSTOM_TIME_PERIOD_ID_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__FORECAST_AMOUNT:
				setForecastAmount(FORECAST_AMOUNT_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__INTERNAL_PARTY_ID:
				setInternalPartyId(INTERNAL_PARTY_ID_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__MODIFIED_BY_USER_LOGIN_ID:
				setModifiedByUserLoginId(MODIFIED_BY_USER_LOGIN_ID_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__MODIFIED_TIMESTAMP:
				setModifiedTimestamp(MODIFIED_TIMESTAMP_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST_HISTORY__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId(ORGANIZATION_PARTY_ID_EDEFAULT);
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
				setSalesForecastId(SALES_FORECAST_ID_EDEFAULT);
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
			case OpportunityPackage.SALES_FORECAST_HISTORY__CURRENCY_UOM_ID:
				return CURRENCY_UOM_ID_EDEFAULT == null ? currencyUomId != null : !CURRENCY_UOM_ID_EDEFAULT.equals(currencyUomId);
			case OpportunityPackage.SALES_FORECAST_HISTORY__CUSTOM_TIME_PERIOD_ID:
				return CUSTOM_TIME_PERIOD_ID_EDEFAULT == null ? customTimePeriodId != null : !CUSTOM_TIME_PERIOD_ID_EDEFAULT.equals(customTimePeriodId);
			case OpportunityPackage.SALES_FORECAST_HISTORY__FORECAST_AMOUNT:
				return FORECAST_AMOUNT_EDEFAULT == null ? forecastAmount != null : !FORECAST_AMOUNT_EDEFAULT.equals(forecastAmount);
			case OpportunityPackage.SALES_FORECAST_HISTORY__INTERNAL_PARTY_ID:
				return INTERNAL_PARTY_ID_EDEFAULT == null ? internalPartyId != null : !INTERNAL_PARTY_ID_EDEFAULT.equals(internalPartyId);
			case OpportunityPackage.SALES_FORECAST_HISTORY__MODIFIED_BY_USER_LOGIN_ID:
				return MODIFIED_BY_USER_LOGIN_ID_EDEFAULT == null ? modifiedByUserLoginId != null : !MODIFIED_BY_USER_LOGIN_ID_EDEFAULT.equals(modifiedByUserLoginId);
			case OpportunityPackage.SALES_FORECAST_HISTORY__MODIFIED_TIMESTAMP:
				return MODIFIED_TIMESTAMP_EDEFAULT == null ? modifiedTimestamp != null : !MODIFIED_TIMESTAMP_EDEFAULT.equals(modifiedTimestamp);
			case OpportunityPackage.SALES_FORECAST_HISTORY__ORGANIZATION_PARTY_ID:
				return ORGANIZATION_PARTY_ID_EDEFAULT == null ? organizationPartyId != null : !ORGANIZATION_PARTY_ID_EDEFAULT.equals(organizationPartyId);
			case OpportunityPackage.SALES_FORECAST_HISTORY__PARENT_SALES_FORECAST_ID:
				return PARENT_SALES_FORECAST_ID_EDEFAULT == null ? parentSalesForecastId != null : !PARENT_SALES_FORECAST_ID_EDEFAULT.equals(parentSalesForecastId);
			case OpportunityPackage.SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_CLOSED:
				return PERCENT_OF_QUOTA_CLOSED_EDEFAULT == null ? percentOfQuotaClosed != null : !PERCENT_OF_QUOTA_CLOSED_EDEFAULT.equals(percentOfQuotaClosed);
			case OpportunityPackage.SALES_FORECAST_HISTORY__PERCENT_OF_QUOTA_FORECAST:
				return PERCENT_OF_QUOTA_FORECAST_EDEFAULT == null ? percentOfQuotaForecast != null : !PERCENT_OF_QUOTA_FORECAST_EDEFAULT.equals(percentOfQuotaForecast);
			case OpportunityPackage.SALES_FORECAST_HISTORY__QUOTA_AMOUNT:
				return QUOTA_AMOUNT_EDEFAULT == null ? quotaAmount != null : !QUOTA_AMOUNT_EDEFAULT.equals(quotaAmount);
			case OpportunityPackage.SALES_FORECAST_HISTORY__SALES_FORECAST_ID:
				return SALES_FORECAST_ID_EDEFAULT == null ? salesForecastId != null : !SALES_FORECAST_ID_EDEFAULT.equals(salesForecastId);
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
		result.append(", currencyUomId: ");
		result.append(currencyUomId);
		result.append(", customTimePeriodId: ");
		result.append(customTimePeriodId);
		result.append(", forecastAmount: ");
		result.append(forecastAmount);
		result.append(", internalPartyId: ");
		result.append(internalPartyId);
		result.append(", modifiedByUserLoginId: ");
		result.append(modifiedByUserLoginId);
		result.append(", modifiedTimestamp: ");
		result.append(modifiedTimestamp);
		result.append(", organizationPartyId: ");
		result.append(organizationPartyId);
		result.append(", parentSalesForecastId: ");
		result.append(parentSalesForecastId);
		result.append(", percentOfQuotaClosed: ");
		result.append(percentOfQuotaClosed);
		result.append(", percentOfQuotaForecast: ");
		result.append(percentOfQuotaForecast);
		result.append(", quotaAmount: ");
		result.append(quotaAmount);
		result.append(", salesForecastId: ");
		result.append(salesForecastId);
		result.append(')');
		return result.toString();
	}

} //SalesForecastHistoryImpl
