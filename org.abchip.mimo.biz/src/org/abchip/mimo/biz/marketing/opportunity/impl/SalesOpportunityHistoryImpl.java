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
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sales Opportunity History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl#getSalesOpportunityHistoryId <em>Sales Opportunity History Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl#getChangeNote <em>Change Note</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl#getEstimatedAmount <em>Estimated Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl#getEstimatedCloseDate <em>Estimated Close Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl#getEstimatedProbability <em>Estimated Probability</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl#getModifiedByUserLogin <em>Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl#getModifiedTimestamp <em>Modified Timestamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl#getNextStep <em>Next Step</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl#getOpportunityStageId <em>Opportunity Stage Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl#getSalesOpportunityId <em>Sales Opportunity Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SalesOpportunityHistoryImpl extends BizEntityImpl implements SalesOpportunityHistory {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getSalesOpportunityHistoryId() <em>Sales Opportunity History Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesOpportunityHistoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String SALES_OPPORTUNITY_HISTORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSalesOpportunityHistoryId() <em>Sales Opportunity History Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesOpportunityHistoryId()
	 * @generated
	 * @ordered
	 */
	protected String salesOpportunityHistoryId = SALES_OPPORTUNITY_HISTORY_ID_EDEFAULT;

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
	 * The default value of the '{@link #getModifiedByUserLogin() <em>Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFIED_BY_USER_LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifiedByUserLogin() <em>Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String modifiedByUserLogin = MODIFIED_BY_USER_LOGIN_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalesOpportunityHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpportunityPackage.Literals.SALES_OPPORTUNITY_HISTORY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY_HISTORY__CHANGE_NOTE, oldChangeNote, changeNote));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY_HISTORY__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY_HISTORY__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY_HISTORY__ESTIMATED_AMOUNT, oldEstimatedAmount, estimatedAmount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY_HISTORY__ESTIMATED_CLOSE_DATE, oldEstimatedCloseDate, estimatedCloseDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY_HISTORY__ESTIMATED_PROBABILITY, oldEstimatedProbability, estimatedProbability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModifiedByUserLogin() {
		return modifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModifiedByUserLogin(String newModifiedByUserLogin) {
		String oldModifiedByUserLogin = modifiedByUserLogin;
		modifiedByUserLogin = newModifiedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY_HISTORY__MODIFIED_BY_USER_LOGIN, oldModifiedByUserLogin, modifiedByUserLogin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY_HISTORY__MODIFIED_TIMESTAMP, oldModifiedTimestamp, modifiedTimestamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY_HISTORY__NEXT_STEP, oldNextStep, nextStep));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY_HISTORY__OPPORTUNITY_STAGE_ID, oldOpportunityStageId, opportunityStageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSalesOpportunityHistoryId() {
		return salesOpportunityHistoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesOpportunityHistoryId(String newSalesOpportunityHistoryId) {
		String oldSalesOpportunityHistoryId = salesOpportunityHistoryId;
		salesOpportunityHistoryId = newSalesOpportunityHistoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY_HISTORY_ID, oldSalesOpportunityHistoryId, salesOpportunityHistoryId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpportunityPackage.SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY_ID, oldSalesOpportunityId, salesOpportunityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY_HISTORY_ID:
				return getSalesOpportunityHistoryId();
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__CHANGE_NOTE:
				return getChangeNote();
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__CURRENCY_UOM_ID:
				return getCurrencyUomId();
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__DESCRIPTION:
				return getDescription();
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__ESTIMATED_AMOUNT:
				return getEstimatedAmount();
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__ESTIMATED_CLOSE_DATE:
				return getEstimatedCloseDate();
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__ESTIMATED_PROBABILITY:
				return getEstimatedProbability();
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__MODIFIED_BY_USER_LOGIN:
				return getModifiedByUserLogin();
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__MODIFIED_TIMESTAMP:
				return getModifiedTimestamp();
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__NEXT_STEP:
				return getNextStep();
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__OPPORTUNITY_STAGE_ID:
				return getOpportunityStageId();
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY_ID:
				return getSalesOpportunityId();
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
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY_HISTORY_ID:
				setSalesOpportunityHistoryId((String)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__CHANGE_NOTE:
				setChangeNote((String)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__CURRENCY_UOM_ID:
				setCurrencyUomId((String)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__ESTIMATED_AMOUNT:
				setEstimatedAmount((BigDecimal)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__ESTIMATED_CLOSE_DATE:
				setEstimatedCloseDate((Date)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__ESTIMATED_PROBABILITY:
				setEstimatedProbability((BigDecimal)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__MODIFIED_BY_USER_LOGIN:
				setModifiedByUserLogin((String)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__MODIFIED_TIMESTAMP:
				setModifiedTimestamp((Date)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__NEXT_STEP:
				setNextStep((String)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__OPPORTUNITY_STAGE_ID:
				setOpportunityStageId((String)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY_ID:
				setSalesOpportunityId((String)newValue);
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
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY_HISTORY_ID:
				setSalesOpportunityHistoryId(SALES_OPPORTUNITY_HISTORY_ID_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__CHANGE_NOTE:
				setChangeNote(CHANGE_NOTE_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__CURRENCY_UOM_ID:
				setCurrencyUomId(CURRENCY_UOM_ID_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__ESTIMATED_AMOUNT:
				setEstimatedAmount(ESTIMATED_AMOUNT_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__ESTIMATED_CLOSE_DATE:
				setEstimatedCloseDate(ESTIMATED_CLOSE_DATE_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__ESTIMATED_PROBABILITY:
				setEstimatedProbability(ESTIMATED_PROBABILITY_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__MODIFIED_BY_USER_LOGIN:
				setModifiedByUserLogin(MODIFIED_BY_USER_LOGIN_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__MODIFIED_TIMESTAMP:
				setModifiedTimestamp(MODIFIED_TIMESTAMP_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__NEXT_STEP:
				setNextStep(NEXT_STEP_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__OPPORTUNITY_STAGE_ID:
				setOpportunityStageId(OPPORTUNITY_STAGE_ID_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY_ID:
				setSalesOpportunityId(SALES_OPPORTUNITY_ID_EDEFAULT);
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
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY_HISTORY_ID:
				return SALES_OPPORTUNITY_HISTORY_ID_EDEFAULT == null ? salesOpportunityHistoryId != null : !SALES_OPPORTUNITY_HISTORY_ID_EDEFAULT.equals(salesOpportunityHistoryId);
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__CHANGE_NOTE:
				return CHANGE_NOTE_EDEFAULT == null ? changeNote != null : !CHANGE_NOTE_EDEFAULT.equals(changeNote);
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__CURRENCY_UOM_ID:
				return CURRENCY_UOM_ID_EDEFAULT == null ? currencyUomId != null : !CURRENCY_UOM_ID_EDEFAULT.equals(currencyUomId);
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__ESTIMATED_AMOUNT:
				return ESTIMATED_AMOUNT_EDEFAULT == null ? estimatedAmount != null : !ESTIMATED_AMOUNT_EDEFAULT.equals(estimatedAmount);
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__ESTIMATED_CLOSE_DATE:
				return ESTIMATED_CLOSE_DATE_EDEFAULT == null ? estimatedCloseDate != null : !ESTIMATED_CLOSE_DATE_EDEFAULT.equals(estimatedCloseDate);
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__ESTIMATED_PROBABILITY:
				return ESTIMATED_PROBABILITY_EDEFAULT == null ? estimatedProbability != null : !ESTIMATED_PROBABILITY_EDEFAULT.equals(estimatedProbability);
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__MODIFIED_BY_USER_LOGIN:
				return MODIFIED_BY_USER_LOGIN_EDEFAULT == null ? modifiedByUserLogin != null : !MODIFIED_BY_USER_LOGIN_EDEFAULT.equals(modifiedByUserLogin);
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__MODIFIED_TIMESTAMP:
				return MODIFIED_TIMESTAMP_EDEFAULT == null ? modifiedTimestamp != null : !MODIFIED_TIMESTAMP_EDEFAULT.equals(modifiedTimestamp);
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__NEXT_STEP:
				return NEXT_STEP_EDEFAULT == null ? nextStep != null : !NEXT_STEP_EDEFAULT.equals(nextStep);
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__OPPORTUNITY_STAGE_ID:
				return OPPORTUNITY_STAGE_ID_EDEFAULT == null ? opportunityStageId != null : !OPPORTUNITY_STAGE_ID_EDEFAULT.equals(opportunityStageId);
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY_ID:
				return SALES_OPPORTUNITY_ID_EDEFAULT == null ? salesOpportunityId != null : !SALES_OPPORTUNITY_ID_EDEFAULT.equals(salesOpportunityId);
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
		result.append(" (salesOpportunityHistoryId: ");
		result.append(salesOpportunityHistoryId);
		result.append(", changeNote: ");
		result.append(changeNote);
		result.append(", currencyUomId: ");
		result.append(currencyUomId);
		result.append(", description: ");
		result.append(description);
		result.append(", estimatedAmount: ");
		result.append(estimatedAmount);
		result.append(", estimatedCloseDate: ");
		result.append(estimatedCloseDate);
		result.append(", estimatedProbability: ");
		result.append(estimatedProbability);
		result.append(", modifiedByUserLogin: ");
		result.append(modifiedByUserLogin);
		result.append(", modifiedTimestamp: ");
		result.append(modifiedTimestamp);
		result.append(", nextStep: ");
		result.append(nextStep);
		result.append(", opportunityStageId: ");
		result.append(opportunityStageId);
		result.append(", salesOpportunityId: ");
		result.append(salesOpportunityId);
		result.append(')');
		return result.toString();
	}

} //SalesOpportunityHistoryImpl
