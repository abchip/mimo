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
 * A representation of the model object '<em><b>Budget Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetItemType#getBudgetItemTypeId <em>Budget Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetItemType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetItemType#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetItemType#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetItemType#getBudgetItemTypeAttrs <em>Budget Item Type Attrs</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetItemType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface BudgetItemType extends BizEntityType<BudgetItem> {
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
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetItemType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetItemType#getDescription <em>Description</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetItemType_HasTable()
	 * @model
	 * @generated
	 */
	boolean isHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetItemType#isHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #isHasTable()
	 * @generated
	 */
	void setHasTable(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type Id</em>' reference.
	 * @see #setParentTypeId(BudgetItemType)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetItemType_ParentTypeId()
	 * @model keys="budgetItemTypeId"
	 * @generated
	 */
	BudgetItemType getParentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetItemType#getParentTypeId <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Id</em>' reference.
	 * @see #getParentTypeId()
	 * @generated
	 */
	void setParentTypeId(BudgetItemType value);

	/**
	 * Returns the value of the '<em><b>Budget Item Type Attrs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Item Type Attrs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Item Type Attrs</em>' attribute list.
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetItemType_BudgetItemTypeAttrs()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='BudgetItemTypeAttr'"
	 * @generated
	 */
	List<String> getBudgetItemTypeAttrs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='BudgetItem' route='budgetItemTypeId'"
	 * @generated
	 */
	List<String> budgetItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='BudgetScenarioRule' route='budgetItemTypeId'"
	 * @generated
	 */
	List<String> budgetScenarioRules();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='BudgetItemType' route='parentTypeId'"
	 * @generated
	 */
	List<String> childBudgetItemTypes();

	/**
	 * Returns the value of the '<em><b>Budget Item Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Item Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Item Type Id</em>' attribute.
	 * @see #setBudgetItemTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetItemType_BudgetItemTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getBudgetItemTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetItemType#getBudgetItemTypeId <em>Budget Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Item Type Id</em>' attribute.
	 * @see #getBudgetItemTypeId()
	 * @generated
	 */
	void setBudgetItemTypeId(String value);

} // BudgetItemType
