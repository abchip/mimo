/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.budget;

import java.util.List;

import org.abchip.mimo.biz.BizEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Budget Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetType#getBudgetTypeId <em>Budget Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetType#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetType#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetType#getBudgetTypeAttrs <em>Budget Type Attrs</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface BudgetType extends BizEntityType<Budget> {
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
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(boolean)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetType_HasTable()
	 * @model
	 * @generated
	 */
	boolean isHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetType#isHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #isHasTable()
	 * @generated
	 */
	void setHasTable(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type Id</em>' attribute.
	 * @see #setParentTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetType_ParentTypeId()
	 * @model annotation="mimo-ent-domain frame='BudgetType'"
	 * @generated
	 */
	String getParentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetType#getParentTypeId <em>Parent Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Id</em>' attribute.
	 * @see #getParentTypeId()
	 * @generated
	 */
	void setParentTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Budget Type Attrs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Type Attrs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Type Attrs</em>' attribute list.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetType_BudgetTypeAttrs()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='BudgetTypeAttr'"
	 * @generated
	 */
	List<String> getBudgetTypeAttrs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Budget' route='budgetTypeId'"
	 * @generated
	 */
	List<String> budgets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='BudgetType' route='parentTypeId'"
	 * @generated
	 */
	List<String> childBudgetTypes();

	/**
	 * Returns the value of the '<em><b>Budget Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Type Id</em>' attribute.
	 * @see #setBudgetTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetType_BudgetTypeId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getBudgetTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetType#getBudgetTypeId <em>Budget Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Type Id</em>' attribute.
	 * @see #getBudgetTypeId()
	 * @generated
	 */
	void setBudgetTypeId(String value);

} // BudgetType
