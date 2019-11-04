/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.accounting.budget.BudgetItemType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gl Budget Xref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlBudgetXref#getGlAccountId <em>Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlBudgetXref#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlBudgetXref#getAllocationPercentage <em>Allocation Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlBudgetXref#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.GlBudgetXref#getBudgetItemTypeId <em>Budget Item Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlBudgetXref()
 * @model
 * @generated
 */
public interface GlBudgetXref extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Allocation Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation Percentage</em>' attribute.
	 * @see #setAllocationPercentage(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlBudgetXref_AllocationPercentage()
	 * @model
	 * @generated
	 */
	BigDecimal getAllocationPercentage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlBudgetXref#getAllocationPercentage <em>Allocation Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Percentage</em>' attribute.
	 * @see #getAllocationPercentage()
	 * @generated
	 */
	void setAllocationPercentage(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlBudgetXref_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlBudgetXref#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlBudgetXref_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlBudgetXref#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Gl Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Account Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Account Id</em>' attribute.
	 * @see #setGlAccountId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlBudgetXref_GlAccountId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getGlAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlBudgetXref#getGlAccountId <em>Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Account Id</em>' attribute.
	 * @see #getGlAccountId()
	 * @generated
	 */
	void setGlAccountId(String value);

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
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getGlBudgetXref_BudgetItemTypeId()
	 * @model keys="budgetItemTypeId"
	 * @generated
	 */
	BudgetItemType getBudgetItemTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.GlBudgetXref#getBudgetItemTypeId <em>Budget Item Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Item Type Id</em>' reference.
	 * @see #getBudgetItemTypeId()
	 * @generated
	 */
	void setBudgetItemTypeId(BudgetItemType value);

} // GlBudgetXref
