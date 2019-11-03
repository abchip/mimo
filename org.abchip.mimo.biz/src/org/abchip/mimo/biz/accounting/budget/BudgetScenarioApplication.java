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
 * A representation of the model object '<em><b>Budget Scenario Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication#getBudgetScenarioApplicId <em>Budget Scenario Applic Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication#getBudgetScenarioId <em>Budget Scenario Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication#getAmountChange <em>Amount Change</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication#getBudgetId <em>Budget Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication#getBudgetItemSeqId <em>Budget Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication#getPercentageChange <em>Percentage Change</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetScenarioApplication()
 * @model
 * @generated
 */
public interface BudgetScenarioApplication extends BizEntity {
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
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetScenarioApplication_AmountChange()
	 * @model
	 * @generated
	 */
	BigDecimal getAmountChange();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication#getAmountChange <em>Amount Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Change</em>' attribute.
	 * @see #getAmountChange()
	 * @generated
	 */
	void setAmountChange(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Budget Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Item Seq Id</em>' attribute.
	 * @see #setBudgetItemSeqId(String)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetScenarioApplication_BudgetItemSeqId()
	 * @model
	 * @generated
	 */
	String getBudgetItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication#getBudgetItemSeqId <em>Budget Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Item Seq Id</em>' attribute.
	 * @see #getBudgetItemSeqId()
	 * @generated
	 */
	void setBudgetItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Budget Scenario Applic Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Scenario Applic Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Scenario Applic Id</em>' attribute.
	 * @see #setBudgetScenarioApplicId(String)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetScenarioApplication_BudgetScenarioApplicId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getBudgetScenarioApplicId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication#getBudgetScenarioApplicId <em>Budget Scenario Applic Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Scenario Applic Id</em>' attribute.
	 * @see #getBudgetScenarioApplicId()
	 * @generated
	 */
	void setBudgetScenarioApplicId(String value);

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
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetScenarioApplication_PercentageChange()
	 * @model
	 * @generated
	 */
	BigDecimal getPercentageChange();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication#getPercentageChange <em>Percentage Change</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetScenarioApplication_BudgetScenarioId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='BudgetScenario'"
	 * @generated
	 */
	String getBudgetScenarioId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication#getBudgetScenarioId <em>Budget Scenario Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Scenario Id</em>' attribute.
	 * @see #getBudgetScenarioId()
	 * @generated
	 */
	void setBudgetScenarioId(String value);

	/**
	 * Returns the value of the '<em><b>Budget Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Id</em>' attribute.
	 * @see #setBudgetId(String)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetScenarioApplication_BudgetId()
	 * @model annotation="mimo-ent-domain frame='Budget'"
	 * @generated
	 */
	String getBudgetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenarioApplication#getBudgetId <em>Budget Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Id</em>' attribute.
	 * @see #getBudgetId()
	 * @generated
	 */
	void setBudgetId(String value);

} // BudgetScenarioApplication
