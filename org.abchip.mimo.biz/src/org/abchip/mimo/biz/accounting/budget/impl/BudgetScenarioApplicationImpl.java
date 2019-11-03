/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.budget.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.accounting.budget.BudgetPackage;
import org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Budget Scenario Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioApplicationImpl#getBudgetScenarioApplicId <em>Budget Scenario Applic Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioApplicationImpl#getBudgetScenarioId <em>Budget Scenario Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioApplicationImpl#getAmountChange <em>Amount Change</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioApplicationImpl#getBudgetId <em>Budget Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioApplicationImpl#getBudgetItemSeqId <em>Budget Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioApplicationImpl#getPercentageChange <em>Percentage Change</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BudgetScenarioApplicationImpl extends BizEntityImpl implements BudgetScenarioApplication {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getBudgetScenarioApplicId() <em>Budget Scenario Applic Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetScenarioApplicId()
	 * @generated
	 * @ordered
	 */
	protected static final String BUDGET_SCENARIO_APPLIC_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBudgetScenarioApplicId() <em>Budget Scenario Applic Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetScenarioApplicId()
	 * @generated
	 * @ordered
	 */
	protected String budgetScenarioApplicId = BUDGET_SCENARIO_APPLIC_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getBudgetScenarioId() <em>Budget Scenario Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetScenarioId()
	 * @generated
	 * @ordered
	 */
	protected static final String BUDGET_SCENARIO_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBudgetScenarioId() <em>Budget Scenario Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetScenarioId()
	 * @generated
	 * @ordered
	 */
	protected String budgetScenarioId = BUDGET_SCENARIO_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getAmountChange() <em>Amount Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountChange()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AMOUNT_CHANGE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAmountChange() <em>Amount Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountChange()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal amountChange = AMOUNT_CHANGE_EDEFAULT;
	/**
	 * The default value of the '{@link #getBudgetId() <em>Budget Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetId()
	 * @generated
	 * @ordered
	 */
	protected static final String BUDGET_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBudgetId() <em>Budget Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetId()
	 * @generated
	 * @ordered
	 */
	protected String budgetId = BUDGET_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getBudgetItemSeqId() <em>Budget Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String BUDGET_ITEM_SEQ_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBudgetItemSeqId() <em>Budget Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String budgetItemSeqId = BUDGET_ITEM_SEQ_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getPercentageChange() <em>Percentage Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageChange()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PERCENTAGE_CHANGE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPercentageChange() <em>Percentage Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageChange()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal percentageChange = PERCENTAGE_CHANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BudgetScenarioApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BudgetPackage.Literals.BUDGET_SCENARIO_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAmountChange() {
		return amountChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountChange(BigDecimal newAmountChange) {
		BigDecimal oldAmountChange = amountChange;
		amountChange = newAmountChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_SCENARIO_APPLICATION__AMOUNT_CHANGE, oldAmountChange, amountChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBudgetItemSeqId() {
		return budgetItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetItemSeqId(String newBudgetItemSeqId) {
		String oldBudgetItemSeqId = budgetItemSeqId;
		budgetItemSeqId = newBudgetItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_SCENARIO_APPLICATION__BUDGET_ITEM_SEQ_ID, oldBudgetItemSeqId, budgetItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBudgetScenarioApplicId() {
		return budgetScenarioApplicId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetScenarioApplicId(String newBudgetScenarioApplicId) {
		String oldBudgetScenarioApplicId = budgetScenarioApplicId;
		budgetScenarioApplicId = newBudgetScenarioApplicId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_SCENARIO_APPLICATION__BUDGET_SCENARIO_APPLIC_ID, oldBudgetScenarioApplicId, budgetScenarioApplicId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPercentageChange() {
		return percentageChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentageChange(BigDecimal newPercentageChange) {
		BigDecimal oldPercentageChange = percentageChange;
		percentageChange = newPercentageChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_SCENARIO_APPLICATION__PERCENTAGE_CHANGE, oldPercentageChange, percentageChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBudgetScenarioId() {
		return budgetScenarioId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetScenarioId(String newBudgetScenarioId) {
		String oldBudgetScenarioId = budgetScenarioId;
		budgetScenarioId = newBudgetScenarioId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_SCENARIO_APPLICATION__BUDGET_SCENARIO_ID, oldBudgetScenarioId, budgetScenarioId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBudgetId() {
		return budgetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetId(String newBudgetId) {
		String oldBudgetId = budgetId;
		budgetId = newBudgetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_SCENARIO_APPLICATION__BUDGET_ID, oldBudgetId, budgetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BudgetPackage.BUDGET_SCENARIO_APPLICATION__BUDGET_SCENARIO_APPLIC_ID:
				return getBudgetScenarioApplicId();
			case BudgetPackage.BUDGET_SCENARIO_APPLICATION__BUDGET_SCENARIO_ID:
				return getBudgetScenarioId();
			case BudgetPackage.BUDGET_SCENARIO_APPLICATION__AMOUNT_CHANGE:
				return getAmountChange();
			case BudgetPackage.BUDGET_SCENARIO_APPLICATION__BUDGET_ID:
				return getBudgetId();
			case BudgetPackage.BUDGET_SCENARIO_APPLICATION__BUDGET_ITEM_SEQ_ID:
				return getBudgetItemSeqId();
			case BudgetPackage.BUDGET_SCENARIO_APPLICATION__PERCENTAGE_CHANGE:
				return getPercentageChange();
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
			case BudgetPackage.BUDGET_SCENARIO_APPLICATION__BUDGET_SCENARIO_APPLIC_ID:
				setBudgetScenarioApplicId((String)newValue);
				return;
			case BudgetPackage.BUDGET_SCENARIO_APPLICATION__BUDGET_SCENARIO_ID:
				setBudgetScenarioId((String)newValue);
				return;
			case BudgetPackage.BUDGET_SCENARIO_APPLICATION__AMOUNT_CHANGE:
				setAmountChange((BigDecimal)newValue);
				return;
			case BudgetPackage.BUDGET_SCENARIO_APPLICATION__BUDGET_ID:
				setBudgetId((String)newValue);
				return;
			case BudgetPackage.BUDGET_SCENARIO_APPLICATION__BUDGET_ITEM_SEQ_ID:
				setBudgetItemSeqId((String)newValue);
				return;
			case BudgetPackage.BUDGET_SCENARIO_APPLICATION__PERCENTAGE_CHANGE:
				setPercentageChange((BigDecimal)newValue);
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
			case BudgetPackage.BUDGET_SCENARIO_APPLICATION__BUDGET_SCENARIO_APPLIC_ID:
				setBudgetScenarioApplicId(BUDGET_SCENARIO_APPLIC_ID_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_SCENARIO_APPLICATION__BUDGET_SCENARIO_ID:
				setBudgetScenarioId(BUDGET_SCENARIO_ID_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_SCENARIO_APPLICATION__AMOUNT_CHANGE:
				setAmountChange(AMOUNT_CHANGE_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_SCENARIO_APPLICATION__BUDGET_ID:
				setBudgetId(BUDGET_ID_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_SCENARIO_APPLICATION__BUDGET_ITEM_SEQ_ID:
				setBudgetItemSeqId(BUDGET_ITEM_SEQ_ID_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_SCENARIO_APPLICATION__PERCENTAGE_CHANGE:
				setPercentageChange(PERCENTAGE_CHANGE_EDEFAULT);
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
			case BudgetPackage.BUDGET_SCENARIO_APPLICATION__BUDGET_SCENARIO_APPLIC_ID:
				return BUDGET_SCENARIO_APPLIC_ID_EDEFAULT == null ? budgetScenarioApplicId != null : !BUDGET_SCENARIO_APPLIC_ID_EDEFAULT.equals(budgetScenarioApplicId);
			case BudgetPackage.BUDGET_SCENARIO_APPLICATION__BUDGET_SCENARIO_ID:
				return BUDGET_SCENARIO_ID_EDEFAULT == null ? budgetScenarioId != null : !BUDGET_SCENARIO_ID_EDEFAULT.equals(budgetScenarioId);
			case BudgetPackage.BUDGET_SCENARIO_APPLICATION__AMOUNT_CHANGE:
				return AMOUNT_CHANGE_EDEFAULT == null ? amountChange != null : !AMOUNT_CHANGE_EDEFAULT.equals(amountChange);
			case BudgetPackage.BUDGET_SCENARIO_APPLICATION__BUDGET_ID:
				return BUDGET_ID_EDEFAULT == null ? budgetId != null : !BUDGET_ID_EDEFAULT.equals(budgetId);
			case BudgetPackage.BUDGET_SCENARIO_APPLICATION__BUDGET_ITEM_SEQ_ID:
				return BUDGET_ITEM_SEQ_ID_EDEFAULT == null ? budgetItemSeqId != null : !BUDGET_ITEM_SEQ_ID_EDEFAULT.equals(budgetItemSeqId);
			case BudgetPackage.BUDGET_SCENARIO_APPLICATION__PERCENTAGE_CHANGE:
				return PERCENTAGE_CHANGE_EDEFAULT == null ? percentageChange != null : !PERCENTAGE_CHANGE_EDEFAULT.equals(percentageChange);
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
		result.append(" (budgetScenarioApplicId: ");
		result.append(budgetScenarioApplicId);
		result.append(", budgetScenarioId: ");
		result.append(budgetScenarioId);
		result.append(", amountChange: ");
		result.append(amountChange);
		result.append(", budgetId: ");
		result.append(budgetId);
		result.append(", budgetItemSeqId: ");
		result.append(budgetItemSeqId);
		result.append(", percentageChange: ");
		result.append(percentageChange);
		result.append(')');
		return result.toString();
	}

} //BudgetScenarioApplicationImpl
