/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.budget.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.accounting.budget.BudgetItemType;
import org.abchip.mimo.biz.accounting.budget.BudgetPackage;
import org.abchip.mimo.biz.accounting.budget.BudgetScenario;
import org.abchip.mimo.biz.accounting.budget.BudgetScenarioRule;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Budget Scenario Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioRuleImpl#getAmountChange <em>Amount Change</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioRuleImpl#getPercentageChange <em>Percentage Change</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioRuleImpl#getBudgetScenarioId <em>Budget Scenario Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioRuleImpl#getBudgetItemTypeId <em>Budget Item Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BudgetScenarioRuleImpl extends BizEntityImpl implements BudgetScenarioRule {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	 * The cached value of the '{@link #getBudgetScenarioId() <em>Budget Scenario Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetScenarioId()
	 * @generated
	 * @ordered
	 */
	protected BudgetScenario budgetScenarioId;
	/**
	 * The cached value of the '{@link #getBudgetItemTypeId() <em>Budget Item Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected BudgetItemType budgetItemTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BudgetScenarioRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BudgetPackage.Literals.BUDGET_SCENARIO_RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_SCENARIO_RULE__AMOUNT_CHANGE, oldAmountChange, amountChange));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_SCENARIO_RULE__PERCENTAGE_CHANGE, oldPercentageChange, percentageChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetScenario getBudgetScenarioId() {
		if (budgetScenarioId != null && ((EObject)budgetScenarioId).eIsProxy()) {
			InternalEObject oldBudgetScenarioId = (InternalEObject)budgetScenarioId;
			budgetScenarioId = (BudgetScenario)eResolveProxy(oldBudgetScenarioId);
			if (budgetScenarioId != oldBudgetScenarioId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BudgetPackage.BUDGET_SCENARIO_RULE__BUDGET_SCENARIO_ID, oldBudgetScenarioId, budgetScenarioId));
			}
		}
		return budgetScenarioId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BudgetScenario basicGetBudgetScenarioId() {
		return budgetScenarioId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetScenarioId(BudgetScenario newBudgetScenarioId) {
		BudgetScenario oldBudgetScenarioId = budgetScenarioId;
		budgetScenarioId = newBudgetScenarioId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_SCENARIO_RULE__BUDGET_SCENARIO_ID, oldBudgetScenarioId, budgetScenarioId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetItemType getBudgetItemTypeId() {
		if (budgetItemTypeId != null && ((EObject)budgetItemTypeId).eIsProxy()) {
			InternalEObject oldBudgetItemTypeId = (InternalEObject)budgetItemTypeId;
			budgetItemTypeId = (BudgetItemType)eResolveProxy(oldBudgetItemTypeId);
			if (budgetItemTypeId != oldBudgetItemTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BudgetPackage.BUDGET_SCENARIO_RULE__BUDGET_ITEM_TYPE_ID, oldBudgetItemTypeId, budgetItemTypeId));
			}
		}
		return budgetItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BudgetItemType basicGetBudgetItemTypeId() {
		return budgetItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetItemTypeId(BudgetItemType newBudgetItemTypeId) {
		BudgetItemType oldBudgetItemTypeId = budgetItemTypeId;
		budgetItemTypeId = newBudgetItemTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_SCENARIO_RULE__BUDGET_ITEM_TYPE_ID, oldBudgetItemTypeId, budgetItemTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BudgetPackage.BUDGET_SCENARIO_RULE__AMOUNT_CHANGE:
				return getAmountChange();
			case BudgetPackage.BUDGET_SCENARIO_RULE__PERCENTAGE_CHANGE:
				return getPercentageChange();
			case BudgetPackage.BUDGET_SCENARIO_RULE__BUDGET_SCENARIO_ID:
				if (resolve) return getBudgetScenarioId();
				return basicGetBudgetScenarioId();
			case BudgetPackage.BUDGET_SCENARIO_RULE__BUDGET_ITEM_TYPE_ID:
				if (resolve) return getBudgetItemTypeId();
				return basicGetBudgetItemTypeId();
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
			case BudgetPackage.BUDGET_SCENARIO_RULE__AMOUNT_CHANGE:
				setAmountChange((BigDecimal)newValue);
				return;
			case BudgetPackage.BUDGET_SCENARIO_RULE__PERCENTAGE_CHANGE:
				setPercentageChange((BigDecimal)newValue);
				return;
			case BudgetPackage.BUDGET_SCENARIO_RULE__BUDGET_SCENARIO_ID:
				setBudgetScenarioId((BudgetScenario)newValue);
				return;
			case BudgetPackage.BUDGET_SCENARIO_RULE__BUDGET_ITEM_TYPE_ID:
				setBudgetItemTypeId((BudgetItemType)newValue);
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
			case BudgetPackage.BUDGET_SCENARIO_RULE__AMOUNT_CHANGE:
				setAmountChange(AMOUNT_CHANGE_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_SCENARIO_RULE__PERCENTAGE_CHANGE:
				setPercentageChange(PERCENTAGE_CHANGE_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_SCENARIO_RULE__BUDGET_SCENARIO_ID:
				setBudgetScenarioId((BudgetScenario)null);
				return;
			case BudgetPackage.BUDGET_SCENARIO_RULE__BUDGET_ITEM_TYPE_ID:
				setBudgetItemTypeId((BudgetItemType)null);
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
			case BudgetPackage.BUDGET_SCENARIO_RULE__AMOUNT_CHANGE:
				return AMOUNT_CHANGE_EDEFAULT == null ? amountChange != null : !AMOUNT_CHANGE_EDEFAULT.equals(amountChange);
			case BudgetPackage.BUDGET_SCENARIO_RULE__PERCENTAGE_CHANGE:
				return PERCENTAGE_CHANGE_EDEFAULT == null ? percentageChange != null : !PERCENTAGE_CHANGE_EDEFAULT.equals(percentageChange);
			case BudgetPackage.BUDGET_SCENARIO_RULE__BUDGET_SCENARIO_ID:
				return budgetScenarioId != null;
			case BudgetPackage.BUDGET_SCENARIO_RULE__BUDGET_ITEM_TYPE_ID:
				return budgetItemTypeId != null;
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
		result.append(" (amountChange: ");
		result.append(amountChange);
		result.append(", percentageChange: ");
		result.append(percentageChange);
		result.append(')');
		return result.toString();
	}

} //BudgetScenarioRuleImpl
