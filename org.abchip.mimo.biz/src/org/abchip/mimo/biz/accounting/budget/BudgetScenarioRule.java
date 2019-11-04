/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.budget;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Budget Scenario Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioRule#getBudgetScenarioId <em>Budget Scenario Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioRule#getAmountChange <em>Amount Change</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioRule#getPercentageChange <em>Percentage Change</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioRule#getBudgetItemTypeId <em>Budget Item Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetScenarioRule()
 * @model
 * @generated
 */
public interface BudgetScenarioRule extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Amount Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Change</em>' attribute.
	 * @see #setAmountChange(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetScenarioRule_AmountChange()
	 * @model
	 * @generated
	 */
	BigDecimal getAmountChange();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioRule#getAmountChange <em>Amount Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Change</em>' attribute.
	 * @see #getAmountChange()
	 * @generated
	 */
	void setAmountChange(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Percentage Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Change</em>' attribute.
	 * @see #setPercentageChange(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetScenarioRule_PercentageChange()
	 * @model
	 * @generated
	 */
	BigDecimal getPercentageChange();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioRule#getPercentageChange <em>Percentage Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Change</em>' attribute.
	 * @see #getPercentageChange()
	 * @generated
	 */
	void setPercentageChange(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Budget Scenario Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Scenario Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Scenario Id</em>' attribute.
	 * @see #setBudgetScenarioId(String)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetScenarioRule_BudgetScenarioId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getBudgetScenarioId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioRule#getBudgetScenarioId <em>Budget Scenario Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Scenario Id</em>' attribute.
	 * @see #getBudgetScenarioId()
	 * @generated
	 */
	void setBudgetScenarioId(String value);

	/**
	 * Returns the value of the '<em><b>Budget Item Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Item Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Item Type Id</em>' reference.
	 * @see #setBudgetItemTypeId(BudgetItemType)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetScenarioRule_BudgetItemTypeId()
	 * @model keys="budgetItemTypeId"
	 * @generated
	 */
	BudgetItemType getBudgetItemTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioRule#getBudgetItemTypeId <em>Budget Item Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Item Type Id</em>' reference.
	 * @see #getBudgetItemTypeId()
	 * @generated
	 */
	void setBudgetItemTypeId(BudgetItemType value);

} // BudgetScenarioRule
