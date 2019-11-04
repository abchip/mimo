/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.budget;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Budget Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetScenario#getBudgetScenarioId <em>Budget Scenario Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetScenario#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetScenario#getBudgetScenarioRules <em>Budget Scenario Rules</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetScenario()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface BudgetScenario extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetScenario_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenario#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Budget Scenario Rules</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Scenario Rules</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Scenario Rules</em>' attribute list.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetScenario_BudgetScenarioRules()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='BudgetScenarioRule'"
	 * @generated
	 */
	List<String> getBudgetScenarioRules();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='BudgetScenarioApplication' route='budgetScenarioId'"
	 * @generated
	 */
	List<String> budgetScenarioApplications();

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
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetScenario_BudgetScenarioId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getBudgetScenarioId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetScenario#getBudgetScenarioId <em>Budget Scenario Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Scenario Id</em>' attribute.
	 * @see #getBudgetScenarioId()
	 * @generated
	 */
	void setBudgetScenarioId(String value);

} // BudgetScenario
