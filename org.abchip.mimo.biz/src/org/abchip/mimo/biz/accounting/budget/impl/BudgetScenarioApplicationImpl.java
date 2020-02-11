/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.budget.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.accounting.budget.Budget;
import org.abchip.mimo.biz.accounting.budget.BudgetPackage;
import org.abchip.mimo.biz.accounting.budget.BudgetScenario;
import org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Budget Scenario Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioApplicationImpl#getBudgetScenarioId <em>Budget Scenario Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetScenarioApplicationImpl#getBudgetScenarioApplicId <em>Budget Scenario Applic Id</em>}</li>
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
		return (BigDecimal)eGet(BudgetPackage.Literals.BUDGET_SCENARIO_APPLICATION__AMOUNT_CHANGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountChange(BigDecimal newAmountChange) {
		eSet(BudgetPackage.Literals.BUDGET_SCENARIO_APPLICATION__AMOUNT_CHANGE, newAmountChange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBudgetItemSeqId() {
		return (String)eGet(BudgetPackage.Literals.BUDGET_SCENARIO_APPLICATION__BUDGET_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetItemSeqId(String newBudgetItemSeqId) {
		eSet(BudgetPackage.Literals.BUDGET_SCENARIO_APPLICATION__BUDGET_ITEM_SEQ_ID, newBudgetItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBudgetScenarioApplicId() {
		return (String)eGet(BudgetPackage.Literals.BUDGET_SCENARIO_APPLICATION__BUDGET_SCENARIO_APPLIC_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetScenarioApplicId(String newBudgetScenarioApplicId) {
		eSet(BudgetPackage.Literals.BUDGET_SCENARIO_APPLICATION__BUDGET_SCENARIO_APPLIC_ID, newBudgetScenarioApplicId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPercentageChange() {
		return (BigDecimal)eGet(BudgetPackage.Literals.BUDGET_SCENARIO_APPLICATION__PERCENTAGE_CHANGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentageChange(BigDecimal newPercentageChange) {
		eSet(BudgetPackage.Literals.BUDGET_SCENARIO_APPLICATION__PERCENTAGE_CHANGE, newPercentageChange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetScenario getBudgetScenarioId() {
		return (BudgetScenario)eGet(BudgetPackage.Literals.BUDGET_SCENARIO_APPLICATION__BUDGET_SCENARIO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetScenarioId(BudgetScenario newBudgetScenarioId) {
		eSet(BudgetPackage.Literals.BUDGET_SCENARIO_APPLICATION__BUDGET_SCENARIO_ID, newBudgetScenarioId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Budget getBudgetId() {
		return (Budget)eGet(BudgetPackage.Literals.BUDGET_SCENARIO_APPLICATION__BUDGET_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetId(Budget newBudgetId) {
		eSet(BudgetPackage.Literals.BUDGET_SCENARIO_APPLICATION__BUDGET_ID, newBudgetId);
	}

} //BudgetScenarioApplicationImpl
