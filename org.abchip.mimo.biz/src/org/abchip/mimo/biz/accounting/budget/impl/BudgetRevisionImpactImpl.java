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
import org.abchip.mimo.biz.accounting.budget.BudgetRevisionImpact;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Budget Revision Impact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetRevisionImpactImpl#getBudgetId <em>Budget Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetRevisionImpactImpl#getBudgetItemSeqId <em>Budget Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetRevisionImpactImpl#getRevisionSeqId <em>Revision Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetRevisionImpactImpl#isAddDeleteFlag <em>Add Delete Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetRevisionImpactImpl#getRevisedAmount <em>Revised Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetRevisionImpactImpl#getRevisionReason <em>Revision Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BudgetRevisionImpactImpl extends BizEntityImpl implements BudgetRevisionImpact {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BudgetRevisionImpactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BudgetPackage.Literals.BUDGET_REVISION_IMPACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBudgetItemSeqId() {
		return (String)eGet(BudgetPackage.Literals.BUDGET_REVISION_IMPACT__BUDGET_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetItemSeqId(String newBudgetItemSeqId) {
		eSet(BudgetPackage.Literals.BUDGET_REVISION_IMPACT__BUDGET_ITEM_SEQ_ID, newBudgetItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getRevisedAmount() {
		return (BigDecimal)eGet(BudgetPackage.Literals.BUDGET_REVISION_IMPACT__REVISED_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevisedAmount(BigDecimal newRevisedAmount) {
		eSet(BudgetPackage.Literals.BUDGET_REVISION_IMPACT__REVISED_AMOUNT, newRevisedAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRevisionReason() {
		return (String)eGet(BudgetPackage.Literals.BUDGET_REVISION_IMPACT__REVISION_REASON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevisionReason(String newRevisionReason) {
		eSet(BudgetPackage.Literals.BUDGET_REVISION_IMPACT__REVISION_REASON, newRevisionReason);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRevisionSeqId() {
		return (String)eGet(BudgetPackage.Literals.BUDGET_REVISION_IMPACT__REVISION_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevisionSeqId(String newRevisionSeqId) {
		eSet(BudgetPackage.Literals.BUDGET_REVISION_IMPACT__REVISION_SEQ_ID, newRevisionSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAddDeleteFlag() {
		return (Boolean)eGet(BudgetPackage.Literals.BUDGET_REVISION_IMPACT__ADD_DELETE_FLAG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddDeleteFlag(boolean newAddDeleteFlag) {
		eSet(BudgetPackage.Literals.BUDGET_REVISION_IMPACT__ADD_DELETE_FLAG, newAddDeleteFlag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Budget getBudgetId() {
		return (Budget)eGet(BudgetPackage.Literals.BUDGET_REVISION_IMPACT__BUDGET_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetId(Budget newBudgetId) {
		eSet(BudgetPackage.Literals.BUDGET_REVISION_IMPACT__BUDGET_ID, newBudgetId);
	}

} //BudgetRevisionImpactImpl
