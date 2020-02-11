/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
 * A representation of the model object '<em><b>Budget Revision Impact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact#getBudgetId <em>Budget Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact#getBudgetItemSeqId <em>Budget Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact#getRevisionSeqId <em>Revision Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact#isAddDeleteFlag <em>Add Delete Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact#getRevisedAmount <em>Revised Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact#getRevisionReason <em>Revision Reason</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetRevisionImpact()
 * @model
 * @generated
 */
public interface BudgetRevisionImpact extends BizEntity {
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
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetRevisionImpact_BudgetItemSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getBudgetItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact#getBudgetItemSeqId <em>Budget Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Item Seq Id</em>' attribute.
	 * @see #getBudgetItemSeqId()
	 * @generated
	 */
	void setBudgetItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Revised Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revised Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revised Amount</em>' attribute.
	 * @see #setRevisedAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetRevisionImpact_RevisedAmount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getRevisedAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact#getRevisedAmount <em>Revised Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revised Amount</em>' attribute.
	 * @see #getRevisedAmount()
	 * @generated
	 */
	void setRevisedAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Revision Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision Reason</em>' attribute.
	 * @see #setRevisionReason(String)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetRevisionImpact_RevisionReason()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getRevisionReason();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact#getRevisionReason <em>Revision Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Reason</em>' attribute.
	 * @see #getRevisionReason()
	 * @generated
	 */
	void setRevisionReason(String value);

	/**
	 * Returns the value of the '<em><b>Revision Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision Seq Id</em>' attribute.
	 * @see #setRevisionSeqId(String)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetRevisionImpact_RevisionSeqId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getRevisionSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact#getRevisionSeqId <em>Revision Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Seq Id</em>' attribute.
	 * @see #getRevisionSeqId()
	 * @generated
	 */
	void setRevisionSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Add Delete Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Delete Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Delete Flag</em>' attribute.
	 * @see #setAddDeleteFlag(boolean)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetRevisionImpact_AddDeleteFlag()
	 * @model
	 * @generated
	 */
	boolean isAddDeleteFlag();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact#isAddDeleteFlag <em>Add Delete Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Delete Flag</em>' attribute.
	 * @see #isAddDeleteFlag()
	 * @generated
	 */
	void setAddDeleteFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Budget Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Id</em>' reference.
	 * @see #setBudgetId(Budget)
	 * @see org.abchip.mimo.biz.accounting.budget.BudgetPackage#getBudgetRevisionImpact_BudgetId()
	 * @model keys="budgetId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Budget getBudgetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact#getBudgetId <em>Budget Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Id</em>' reference.
	 * @see #getBudgetId()
	 * @generated
	 */
	void setBudgetId(Budget value);

} // BudgetRevisionImpact
