/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Budget Scenario Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioRuleImpl#getBudgetScenarioId <em>Budget Scenario Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioRuleImpl#getBudgetItemTypeId <em>Budget Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioRuleImpl#getAmountChange <em>Amount Change</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioRuleImpl#getPercentageChange <em>Percentage Change</em>}</li>
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
		return (BigDecimal)eGet(BudgetPackage.Literals.BUDGET_SCENARIO_RULE__AMOUNT_CHANGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountChange(BigDecimal newAmountChange) {
		eSet(BudgetPackage.Literals.BUDGET_SCENARIO_RULE__AMOUNT_CHANGE, newAmountChange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPercentageChange() {
		return (BigDecimal)eGet(BudgetPackage.Literals.BUDGET_SCENARIO_RULE__PERCENTAGE_CHANGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentageChange(BigDecimal newPercentageChange) {
		eSet(BudgetPackage.Literals.BUDGET_SCENARIO_RULE__PERCENTAGE_CHANGE, newPercentageChange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetScenario getBudgetScenarioId() {
		return (BudgetScenario)eGet(BudgetPackage.Literals.BUDGET_SCENARIO_RULE__BUDGET_SCENARIO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetScenarioId(BudgetScenario newBudgetScenarioId) {
		eSet(BudgetPackage.Literals.BUDGET_SCENARIO_RULE__BUDGET_SCENARIO_ID, newBudgetScenarioId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetItemType getBudgetItemTypeId() {
		return (BudgetItemType)eGet(BudgetPackage.Literals.BUDGET_SCENARIO_RULE__BUDGET_ITEM_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetItemTypeId(BudgetItemType newBudgetItemTypeId) {
		eSet(BudgetPackage.Literals.BUDGET_SCENARIO_RULE__BUDGET_ITEM_TYPE_ID, newBudgetItemTypeId);
	}

} //BudgetScenarioRuleImpl
