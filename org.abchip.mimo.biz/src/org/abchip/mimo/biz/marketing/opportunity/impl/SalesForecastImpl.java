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
import java.util.List;

import org.abchip.mimo.biz.common.period.CustomTimePeriod;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage;
import org.abchip.mimo.biz.marketing.opportunity.SalesForecast;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sales Forecast</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastImpl#getSalesForecastId <em>Sales Forecast Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastImpl#getBestCaseAmount <em>Best Case Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastImpl#getClosedAmount <em>Closed Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastImpl#getForecastAmount <em>Forecast Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastImpl#getPercentOfQuotaClosed <em>Percent Of Quota Closed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastImpl#getPercentOfQuotaForecast <em>Percent Of Quota Forecast</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastImpl#getPipelineAmount <em>Pipeline Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastImpl#getQuotaAmount <em>Quota Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastImpl#getParentSalesForecastId <em>Parent Sales Forecast Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastImpl#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastImpl#getInternalPartyId <em>Internal Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastImpl#getCustomTimePeriodId <em>Custom Time Period Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastImpl#getCreatedByUserLoginId <em>Created By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastImpl#getModifiedByUserLoginId <em>Modified By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesForecastImpl#getSalesForecastDetails <em>Sales Forecast Details</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SalesForecastImpl extends BizEntityImpl implements SalesForecast {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The default value of the '{@link #getPipelineAmount() <em>Pipeline Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPipelineAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PIPELINE_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPipelineAmount() <em>Pipeline Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPipelineAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal pipelineAmount = PIPELINE_AMOUNT_EDEFAULT;

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
	 * The cached value of the '{@link #getParentSalesForecastId() <em>Parent Sales Forecast Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentSalesForecastId()
	 * @generated
	 * @ordered
	 */
	protected SalesForecast parentSalesForecastId;

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
	 * The cached value of the '{@link #getCreatedByUserLoginId() <em>Created By User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected UserLogin createdByUserLoginId;

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
	 * The cached value of the '{@link #getSalesForecastDetails() <em>Sales Forecast Details</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesForecastDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<String> salesForecastDetails;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalesForecastImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpportunityPackage.Literals.SALES_FORECAST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST__BEST_CASE_AMOUNT, oldBestCaseAmount, bestCaseAmount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST__CLOSED_AMOUNT, oldClosedAmount, closedAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getCreatedByUserLoginId() {
		if (createdByUserLoginId != null && ((EObject)createdByUserLoginId).eIsProxy()) {
			InternalEObject oldCreatedByUserLoginId = (InternalEObject)createdByUserLoginId;
			createdByUserLoginId = (UserLogin)eResolveProxy(oldCreatedByUserLoginId);
			if (createdByUserLoginId != oldCreatedByUserLoginId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpportunityPackage.SALES_FORECAST__CREATED_BY_USER_LOGIN_ID, oldCreatedByUserLoginId, createdByUserLoginId));
			}
		}
		return createdByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetCreatedByUserLoginId() {
		return createdByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLoginId(UserLogin newCreatedByUserLoginId) {
		UserLogin oldCreatedByUserLoginId = createdByUserLoginId;
		createdByUserLoginId = newCreatedByUserLoginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST__CREATED_BY_USER_LOGIN_ID, oldCreatedByUserLoginId, createdByUserLoginId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpportunityPackage.SALES_FORECAST__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpportunityPackage.SALES_FORECAST__CUSTOM_TIME_PERIOD_ID, oldCustomTimePeriodId, customTimePeriodId));
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
		CustomTimePeriod oldCustomTimePeriodId = customTimePeriodId;
		customTimePeriodId = newCustomTimePeriodId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST__CUSTOM_TIME_PERIOD_ID, oldCustomTimePeriodId, customTimePeriodId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST__FORECAST_AMOUNT, oldForecastAmount, forecastAmount));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpportunityPackage.SALES_FORECAST__INTERNAL_PARTY_ID, oldInternalPartyId, internalPartyId));
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
		Party oldInternalPartyId = internalPartyId;
		internalPartyId = newInternalPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST__INTERNAL_PARTY_ID, oldInternalPartyId, internalPartyId));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpportunityPackage.SALES_FORECAST__MODIFIED_BY_USER_LOGIN_ID, oldModifiedByUserLoginId, modifiedByUserLoginId));
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
		UserLogin oldModifiedByUserLoginId = modifiedByUserLoginId;
		modifiedByUserLoginId = newModifiedByUserLoginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST__MODIFIED_BY_USER_LOGIN_ID, oldModifiedByUserLoginId, modifiedByUserLoginId));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpportunityPackage.SALES_FORECAST__ORGANIZATION_PARTY_ID, oldOrganizationPartyId, organizationPartyId));
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
		Party oldOrganizationPartyId = organizationPartyId;
		organizationPartyId = newOrganizationPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST__ORGANIZATION_PARTY_ID, oldOrganizationPartyId, organizationPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SalesForecast getParentSalesForecastId() {
		if (parentSalesForecastId != null && ((EObject)parentSalesForecastId).eIsProxy()) {
			InternalEObject oldParentSalesForecastId = (InternalEObject)parentSalesForecastId;
			parentSalesForecastId = (SalesForecast)eResolveProxy(oldParentSalesForecastId);
			if (parentSalesForecastId != oldParentSalesForecastId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpportunityPackage.SALES_FORECAST__PARENT_SALES_FORECAST_ID, oldParentSalesForecastId, parentSalesForecastId));
			}
		}
		return parentSalesForecastId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalesForecast basicGetParentSalesForecastId() {
		return parentSalesForecastId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentSalesForecastId(SalesForecast newParentSalesForecastId) {
		SalesForecast oldParentSalesForecastId = parentSalesForecastId;
		parentSalesForecastId = newParentSalesForecastId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST__PARENT_SALES_FORECAST_ID, oldParentSalesForecastId, parentSalesForecastId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST__PERCENT_OF_QUOTA_CLOSED, oldPercentOfQuotaClosed, percentOfQuotaClosed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST__PERCENT_OF_QUOTA_FORECAST, oldPercentOfQuotaForecast, percentOfQuotaForecast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPipelineAmount() {
		return pipelineAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPipelineAmount(BigDecimal newPipelineAmount) {
		BigDecimal oldPipelineAmount = pipelineAmount;
		pipelineAmount = newPipelineAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST__PIPELINE_AMOUNT, oldPipelineAmount, pipelineAmount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST__QUOTA_AMOUNT, oldQuotaAmount, quotaAmount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_FORECAST__SALES_FORECAST_ID, oldSalesForecastId, salesForecastId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getSalesForecastDetails() {
		if (salesForecastDetails == null) {
			salesForecastDetails = new EDataTypeUniqueEList<String>(String.class, this, OpportunityPackage.SALES_FORECAST__SALES_FORECAST_DETAILS);
		}
		return salesForecastDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childSalesForecasts() {
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
	public List<String> salesForecastHistories() {
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
			case OpportunityPackage.SALES_FORECAST__SALES_FORECAST_ID:
				return getSalesForecastId();
			case OpportunityPackage.SALES_FORECAST__BEST_CASE_AMOUNT:
				return getBestCaseAmount();
			case OpportunityPackage.SALES_FORECAST__CLOSED_AMOUNT:
				return getClosedAmount();
			case OpportunityPackage.SALES_FORECAST__FORECAST_AMOUNT:
				return getForecastAmount();
			case OpportunityPackage.SALES_FORECAST__PERCENT_OF_QUOTA_CLOSED:
				return getPercentOfQuotaClosed();
			case OpportunityPackage.SALES_FORECAST__PERCENT_OF_QUOTA_FORECAST:
				return getPercentOfQuotaForecast();
			case OpportunityPackage.SALES_FORECAST__PIPELINE_AMOUNT:
				return getPipelineAmount();
			case OpportunityPackage.SALES_FORECAST__QUOTA_AMOUNT:
				return getQuotaAmount();
			case OpportunityPackage.SALES_FORECAST__PARENT_SALES_FORECAST_ID:
				if (resolve) return getParentSalesForecastId();
				return basicGetParentSalesForecastId();
			case OpportunityPackage.SALES_FORECAST__ORGANIZATION_PARTY_ID:
				if (resolve) return getOrganizationPartyId();
				return basicGetOrganizationPartyId();
			case OpportunityPackage.SALES_FORECAST__INTERNAL_PARTY_ID:
				if (resolve) return getInternalPartyId();
				return basicGetInternalPartyId();
			case OpportunityPackage.SALES_FORECAST__CUSTOM_TIME_PERIOD_ID:
				if (resolve) return getCustomTimePeriodId();
				return basicGetCustomTimePeriodId();
			case OpportunityPackage.SALES_FORECAST__CURRENCY_UOM_ID:
				if (resolve) return getCurrencyUomId();
				return basicGetCurrencyUomId();
			case OpportunityPackage.SALES_FORECAST__CREATED_BY_USER_LOGIN_ID:
				if (resolve) return getCreatedByUserLoginId();
				return basicGetCreatedByUserLoginId();
			case OpportunityPackage.SALES_FORECAST__MODIFIED_BY_USER_LOGIN_ID:
				if (resolve) return getModifiedByUserLoginId();
				return basicGetModifiedByUserLoginId();
			case OpportunityPackage.SALES_FORECAST__SALES_FORECAST_DETAILS:
				return getSalesForecastDetails();
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
			case OpportunityPackage.SALES_FORECAST__SALES_FORECAST_ID:
				setSalesForecastId((String)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST__BEST_CASE_AMOUNT:
				setBestCaseAmount((BigDecimal)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST__CLOSED_AMOUNT:
				setClosedAmount((BigDecimal)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST__FORECAST_AMOUNT:
				setForecastAmount((BigDecimal)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST__PERCENT_OF_QUOTA_CLOSED:
				setPercentOfQuotaClosed((BigDecimal)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST__PERCENT_OF_QUOTA_FORECAST:
				setPercentOfQuotaForecast((BigDecimal)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST__PIPELINE_AMOUNT:
				setPipelineAmount((BigDecimal)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST__QUOTA_AMOUNT:
				setQuotaAmount((BigDecimal)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST__PARENT_SALES_FORECAST_ID:
				setParentSalesForecastId((SalesForecast)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((Party)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST__INTERNAL_PARTY_ID:
				setInternalPartyId((Party)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST__CUSTOM_TIME_PERIOD_ID:
				setCustomTimePeriodId((CustomTimePeriod)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST__CREATED_BY_USER_LOGIN_ID:
				setCreatedByUserLoginId((UserLogin)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST__MODIFIED_BY_USER_LOGIN_ID:
				setModifiedByUserLoginId((UserLogin)newValue);
				return;
			case OpportunityPackage.SALES_FORECAST__SALES_FORECAST_DETAILS:
				getSalesForecastDetails().clear();
				getSalesForecastDetails().addAll((Collection<? extends String>)newValue);
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
			case OpportunityPackage.SALES_FORECAST__SALES_FORECAST_ID:
				setSalesForecastId(SALES_FORECAST_ID_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST__BEST_CASE_AMOUNT:
				setBestCaseAmount(BEST_CASE_AMOUNT_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST__CLOSED_AMOUNT:
				setClosedAmount(CLOSED_AMOUNT_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST__FORECAST_AMOUNT:
				setForecastAmount(FORECAST_AMOUNT_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST__PERCENT_OF_QUOTA_CLOSED:
				setPercentOfQuotaClosed(PERCENT_OF_QUOTA_CLOSED_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST__PERCENT_OF_QUOTA_FORECAST:
				setPercentOfQuotaForecast(PERCENT_OF_QUOTA_FORECAST_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST__PIPELINE_AMOUNT:
				setPipelineAmount(PIPELINE_AMOUNT_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST__QUOTA_AMOUNT:
				setQuotaAmount(QUOTA_AMOUNT_EDEFAULT);
				return;
			case OpportunityPackage.SALES_FORECAST__PARENT_SALES_FORECAST_ID:
				setParentSalesForecastId((SalesForecast)null);
				return;
			case OpportunityPackage.SALES_FORECAST__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((Party)null);
				return;
			case OpportunityPackage.SALES_FORECAST__INTERNAL_PARTY_ID:
				setInternalPartyId((Party)null);
				return;
			case OpportunityPackage.SALES_FORECAST__CUSTOM_TIME_PERIOD_ID:
				setCustomTimePeriodId((CustomTimePeriod)null);
				return;
			case OpportunityPackage.SALES_FORECAST__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)null);
				return;
			case OpportunityPackage.SALES_FORECAST__CREATED_BY_USER_LOGIN_ID:
				setCreatedByUserLoginId((UserLogin)null);
				return;
			case OpportunityPackage.SALES_FORECAST__MODIFIED_BY_USER_LOGIN_ID:
				setModifiedByUserLoginId((UserLogin)null);
				return;
			case OpportunityPackage.SALES_FORECAST__SALES_FORECAST_DETAILS:
				getSalesForecastDetails().clear();
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
			case OpportunityPackage.SALES_FORECAST__SALES_FORECAST_ID:
				return SALES_FORECAST_ID_EDEFAULT == null ? salesForecastId != null : !SALES_FORECAST_ID_EDEFAULT.equals(salesForecastId);
			case OpportunityPackage.SALES_FORECAST__BEST_CASE_AMOUNT:
				return BEST_CASE_AMOUNT_EDEFAULT == null ? bestCaseAmount != null : !BEST_CASE_AMOUNT_EDEFAULT.equals(bestCaseAmount);
			case OpportunityPackage.SALES_FORECAST__CLOSED_AMOUNT:
				return CLOSED_AMOUNT_EDEFAULT == null ? closedAmount != null : !CLOSED_AMOUNT_EDEFAULT.equals(closedAmount);
			case OpportunityPackage.SALES_FORECAST__FORECAST_AMOUNT:
				return FORECAST_AMOUNT_EDEFAULT == null ? forecastAmount != null : !FORECAST_AMOUNT_EDEFAULT.equals(forecastAmount);
			case OpportunityPackage.SALES_FORECAST__PERCENT_OF_QUOTA_CLOSED:
				return PERCENT_OF_QUOTA_CLOSED_EDEFAULT == null ? percentOfQuotaClosed != null : !PERCENT_OF_QUOTA_CLOSED_EDEFAULT.equals(percentOfQuotaClosed);
			case OpportunityPackage.SALES_FORECAST__PERCENT_OF_QUOTA_FORECAST:
				return PERCENT_OF_QUOTA_FORECAST_EDEFAULT == null ? percentOfQuotaForecast != null : !PERCENT_OF_QUOTA_FORECAST_EDEFAULT.equals(percentOfQuotaForecast);
			case OpportunityPackage.SALES_FORECAST__PIPELINE_AMOUNT:
				return PIPELINE_AMOUNT_EDEFAULT == null ? pipelineAmount != null : !PIPELINE_AMOUNT_EDEFAULT.equals(pipelineAmount);
			case OpportunityPackage.SALES_FORECAST__QUOTA_AMOUNT:
				return QUOTA_AMOUNT_EDEFAULT == null ? quotaAmount != null : !QUOTA_AMOUNT_EDEFAULT.equals(quotaAmount);
			case OpportunityPackage.SALES_FORECAST__PARENT_SALES_FORECAST_ID:
				return parentSalesForecastId != null;
			case OpportunityPackage.SALES_FORECAST__ORGANIZATION_PARTY_ID:
				return organizationPartyId != null;
			case OpportunityPackage.SALES_FORECAST__INTERNAL_PARTY_ID:
				return internalPartyId != null;
			case OpportunityPackage.SALES_FORECAST__CUSTOM_TIME_PERIOD_ID:
				return customTimePeriodId != null;
			case OpportunityPackage.SALES_FORECAST__CURRENCY_UOM_ID:
				return currencyUomId != null;
			case OpportunityPackage.SALES_FORECAST__CREATED_BY_USER_LOGIN_ID:
				return createdByUserLoginId != null;
			case OpportunityPackage.SALES_FORECAST__MODIFIED_BY_USER_LOGIN_ID:
				return modifiedByUserLoginId != null;
			case OpportunityPackage.SALES_FORECAST__SALES_FORECAST_DETAILS:
				return salesForecastDetails != null && !salesForecastDetails.isEmpty();
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
		result.append(" (salesForecastId: ");
		result.append(salesForecastId);
		result.append(", bestCaseAmount: ");
		result.append(bestCaseAmount);
		result.append(", closedAmount: ");
		result.append(closedAmount);
		result.append(", forecastAmount: ");
		result.append(forecastAmount);
		result.append(", percentOfQuotaClosed: ");
		result.append(percentOfQuotaClosed);
		result.append(", percentOfQuotaForecast: ");
		result.append(percentOfQuotaForecast);
		result.append(", pipelineAmount: ");
		result.append(pipelineAmount);
		result.append(", quotaAmount: ");
		result.append(quotaAmount);
		result.append(", salesForecastDetails: ");
		result.append(salesForecastDetails);
		result.append(')');
		return result.toString();
	}

} //SalesForecastImpl
