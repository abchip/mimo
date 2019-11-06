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

import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.marketing.opportunity.OpportunityPackage;
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunity;
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityHistory;
import org.abchip.mimo.biz.marketing.opportunity.SalesOpportunityStage;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl#getEstimatedAmount <em>Estimated Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl#getEstimatedCloseDate <em>Estimated Close Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl#getEstimatedProbability <em>Estimated Probability</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl#getModifiedTimestamp <em>Modified Timestamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl#getNextStep <em>Next Step</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl#getOpportunityStageId <em>Opportunity Stage Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl#getSalesOpportunityId <em>Sales Opportunity Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.opportunity.impl.SalesOpportunityHistoryImpl#getModifiedByUserLogin <em>Modified By User Login</em>}</li>
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
	 * The cached value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom currencyUomId;

	/**
	 * The cached value of the '{@link #getOpportunityStageId() <em>Opportunity Stage Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpportunityStageId()
	 * @generated
	 * @ordered
	 */
	protected SalesOpportunityStage opportunityStageId;

	/**
	 * The cached value of the '{@link #getSalesOpportunityId() <em>Sales Opportunity Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesOpportunityId()
	 * @generated
	 * @ordered
	 */
	protected SalesOpportunity salesOpportunityId;

	/**
	 * The cached value of the '{@link #getModifiedByUserLogin() <em>Modified By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected UserLogin modifiedByUserLogin;

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
		changeNote = newChangeNote;
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
		description = newDescription;
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
		estimatedAmount = newEstimatedAmount;
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
		estimatedCloseDate = newEstimatedCloseDate;
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
		estimatedProbability = newEstimatedProbability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getModifiedByUserLogin() {
		if (modifiedByUserLogin != null && ((EObject)modifiedByUserLogin).eIsProxy()) {
			InternalEObject oldModifiedByUserLogin = (InternalEObject)modifiedByUserLogin;
			modifiedByUserLogin = (UserLogin)eResolveProxy(oldModifiedByUserLogin);
			if (modifiedByUserLogin != oldModifiedByUserLogin) {
			}
		}
		return modifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetModifiedByUserLogin() {
		return modifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModifiedByUserLogin(UserLogin newModifiedByUserLogin) {
		modifiedByUserLogin = newModifiedByUserLogin;
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
		nextStep = newNextStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SalesOpportunityStage getOpportunityStageId() {
		if (opportunityStageId != null && ((EObject)opportunityStageId).eIsProxy()) {
			InternalEObject oldOpportunityStageId = (InternalEObject)opportunityStageId;
			opportunityStageId = (SalesOpportunityStage)eResolveProxy(oldOpportunityStageId);
			if (opportunityStageId != oldOpportunityStageId) {
			}
		}
		return opportunityStageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalesOpportunityStage basicGetOpportunityStageId() {
		return opportunityStageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpportunityStageId(SalesOpportunityStage newOpportunityStageId) {
		opportunityStageId = newOpportunityStageId;
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
		salesOpportunityHistoryId = newSalesOpportunityHistoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SalesOpportunity getSalesOpportunityId() {
		if (salesOpportunityId != null && ((EObject)salesOpportunityId).eIsProxy()) {
			InternalEObject oldSalesOpportunityId = (InternalEObject)salesOpportunityId;
			salesOpportunityId = (SalesOpportunity)eResolveProxy(oldSalesOpportunityId);
			if (salesOpportunityId != oldSalesOpportunityId) {
			}
		}
		return salesOpportunityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalesOpportunity basicGetSalesOpportunityId() {
		return salesOpportunityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesOpportunityId(SalesOpportunity newSalesOpportunityId) {
		salesOpportunityId = newSalesOpportunityId;
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
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__DESCRIPTION:
				return getDescription();
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__ESTIMATED_AMOUNT:
				return getEstimatedAmount();
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__ESTIMATED_CLOSE_DATE:
				return getEstimatedCloseDate();
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__ESTIMATED_PROBABILITY:
				return getEstimatedProbability();
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__MODIFIED_TIMESTAMP:
				return getModifiedTimestamp();
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__NEXT_STEP:
				return getNextStep();
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__CURRENCY_UOM_ID:
				if (resolve) return getCurrencyUomId();
				return basicGetCurrencyUomId();
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__OPPORTUNITY_STAGE_ID:
				if (resolve) return getOpportunityStageId();
				return basicGetOpportunityStageId();
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY_ID:
				if (resolve) return getSalesOpportunityId();
				return basicGetSalesOpportunityId();
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__MODIFIED_BY_USER_LOGIN:
				if (resolve) return getModifiedByUserLogin();
				return basicGetModifiedByUserLogin();
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
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__MODIFIED_TIMESTAMP:
				setModifiedTimestamp((Date)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__NEXT_STEP:
				setNextStep((String)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__OPPORTUNITY_STAGE_ID:
				setOpportunityStageId((SalesOpportunityStage)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY_ID:
				setSalesOpportunityId((SalesOpportunity)newValue);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__MODIFIED_BY_USER_LOGIN:
				setModifiedByUserLogin((UserLogin)newValue);
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
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__MODIFIED_TIMESTAMP:
				setModifiedTimestamp(MODIFIED_TIMESTAMP_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__NEXT_STEP:
				setNextStep(NEXT_STEP_EDEFAULT);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)null);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__OPPORTUNITY_STAGE_ID:
				setOpportunityStageId((SalesOpportunityStage)null);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY_ID:
				setSalesOpportunityId((SalesOpportunity)null);
				return;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__MODIFIED_BY_USER_LOGIN:
				setModifiedByUserLogin((UserLogin)null);
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
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__ESTIMATED_AMOUNT:
				return ESTIMATED_AMOUNT_EDEFAULT == null ? estimatedAmount != null : !ESTIMATED_AMOUNT_EDEFAULT.equals(estimatedAmount);
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__ESTIMATED_CLOSE_DATE:
				return ESTIMATED_CLOSE_DATE_EDEFAULT == null ? estimatedCloseDate != null : !ESTIMATED_CLOSE_DATE_EDEFAULT.equals(estimatedCloseDate);
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__ESTIMATED_PROBABILITY:
				return ESTIMATED_PROBABILITY_EDEFAULT == null ? estimatedProbability != null : !ESTIMATED_PROBABILITY_EDEFAULT.equals(estimatedProbability);
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__MODIFIED_TIMESTAMP:
				return MODIFIED_TIMESTAMP_EDEFAULT == null ? modifiedTimestamp != null : !MODIFIED_TIMESTAMP_EDEFAULT.equals(modifiedTimestamp);
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__NEXT_STEP:
				return NEXT_STEP_EDEFAULT == null ? nextStep != null : !NEXT_STEP_EDEFAULT.equals(nextStep);
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__CURRENCY_UOM_ID:
				return currencyUomId != null;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__OPPORTUNITY_STAGE_ID:
				return opportunityStageId != null;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__SALES_OPPORTUNITY_ID:
				return salesOpportunityId != null;
			case OpportunityPackage.SALES_OPPORTUNITY_HISTORY__MODIFIED_BY_USER_LOGIN:
				return modifiedByUserLogin != null;
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
		result.append(", description: ");
		result.append(description);
		result.append(", estimatedAmount: ");
		result.append(estimatedAmount);
		result.append(", estimatedCloseDate: ");
		result.append(estimatedCloseDate);
		result.append(", estimatedProbability: ");
		result.append(estimatedProbability);
		result.append(", modifiedTimestamp: ");
		result.append(modifiedTimestamp);
		result.append(", nextStep: ");
		result.append(nextStep);
		result.append(')');
		return result.toString();
	}

} //SalesOpportunityHistoryImpl
