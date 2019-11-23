/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.budget;

import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.common.period.CustomTimePeriod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Budget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.Budget#getBudgetId <em>Budget Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.Budget#getBudgetAttributes <em>Budget Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.Budget#getBudgetItems <em>Budget Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.Budget#getBudgetRevisions <em>Budget Revisions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.Budget#getBudgetStatuss <em>Budget Statuss</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.Budget#getBudgetTypeId <em>Budget Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.Budget#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.Budget#getCustomTimePeriodId <em>Custom Time Period Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudget()
 * @model
 * @generated
 */
public interface Budget extends BizEntityTyped<BudgetType> {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudget_Comments()
	 * @model annotation="mimo-ent-format type='comment' length='255'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.Budget#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Custom Time Period Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Time Period Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Time Period Id</em>' reference.
	 * @see #setCustomTimePeriodId(CustomTimePeriod)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudget_CustomTimePeriodId()
	 * @model keys="customTimePeriodId"
	 * @generated
	 */
	CustomTimePeriod getCustomTimePeriodId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.Budget#getCustomTimePeriodId <em>Custom Time Period Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Time Period Id</em>' reference.
	 * @see #getCustomTimePeriodId()
	 * @generated
	 */
	void setCustomTimePeriodId(CustomTimePeriod value);

	/**
	 * Returns the value of the '<em><b>Budget Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Attributes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Attributes</em>' attribute list.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudget_BudgetAttributes()
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='BudgetAttribute'"
	 * @generated
	 */
	List<String> getBudgetAttributes();

	/**
	 * Returns the value of the '<em><b>Budget Items</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Items</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Items</em>' attribute list.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudget_BudgetItems()
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='BudgetItem'"
	 * @generated
	 */
	List<String> getBudgetItems();

	/**
	 * Returns the value of the '<em><b>Budget Revisions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Revisions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Revisions</em>' attribute list.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudget_BudgetRevisions()
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='BudgetRevision'"
	 * @generated
	 */
	List<String> getBudgetRevisions();

	/**
	 * Returns the value of the '<em><b>Budget Statuss</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Statuss</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Statuss</em>' attribute list.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudget_BudgetStatuss()
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='BudgetStatus'"
	 * @generated
	 */
	List<String> getBudgetStatuss();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='BudgetScenarioApplication' route='budgetId'"
	 * @generated
	 */
	List<String> budgetScenarioApplications();

	/**
	 * Returns the value of the '<em><b>Budget Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Type Id</em>' reference.
	 * @see #setBudgetTypeId(BudgetType)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudget_BudgetTypeId()
	 * @model keys="budgetTypeId"
	 * @generated
	 */
	BudgetType getBudgetTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.Budget#getBudgetTypeId <em>Budget Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Type Id</em>' reference.
	 * @see #getBudgetTypeId()
	 * @generated
	 */
	void setBudgetTypeId(BudgetType value);

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
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudget_BudgetId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 * @generated
	 */
	String getBudgetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.Budget#getBudgetId <em>Budget Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Id</em>' attribute.
	 * @see #getBudgetId()
	 * @generated
	 */
	void setBudgetId(String value);

} // Budget
