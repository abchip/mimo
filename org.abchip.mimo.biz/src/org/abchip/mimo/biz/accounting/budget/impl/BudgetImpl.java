/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.budget.impl;

import java.util.List;
import org.abchip.mimo.biz.accounting.budget.Budget;
import org.abchip.mimo.biz.accounting.budget.BudgetAttribute;
import org.abchip.mimo.biz.accounting.budget.BudgetItem;
import org.abchip.mimo.biz.accounting.budget.BudgetPackage;
import org.abchip.mimo.biz.accounting.budget.BudgetRevision;
import org.abchip.mimo.biz.accounting.budget.BudgetStatus;
import org.abchip.mimo.biz.accounting.budget.BudgetType;
import org.abchip.mimo.biz.common.period.CustomTimePeriod;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Budget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetImpl#getBudgetId <em>Budget Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetImpl#getBudgetAttributes <em>Budget Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetImpl#getBudgetItems <em>Budget Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetImpl#getBudgetRevisions <em>Budget Revisions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetImpl#getBudgetStatuss <em>Budget Statuss</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetImpl#getBudgetTypeId <em>Budget Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetImpl#getCustomTimePeriodId <em>Custom Time Period Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BudgetImpl extends BizEntityTypedImpl<BudgetType> implements Budget {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BudgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BudgetPackage.Literals.BUDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return (String)eGet(BudgetPackage.Literals.BUDGET__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(BudgetPackage.Literals.BUDGET__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomTimePeriod getCustomTimePeriodId() {
		return (CustomTimePeriod)eGet(BudgetPackage.Literals.BUDGET__CUSTOM_TIME_PERIOD_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomTimePeriodId(CustomTimePeriod newCustomTimePeriodId) {
		eSet(BudgetPackage.Literals.BUDGET__CUSTOM_TIME_PERIOD_ID, newCustomTimePeriodId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetType getBudgetTypeId() {
		return (BudgetType)eGet(BudgetPackage.Literals.BUDGET__BUDGET_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetTypeId(BudgetType newBudgetTypeId) {
		eSet(BudgetPackage.Literals.BUDGET__BUDGET_TYPE_ID, newBudgetTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBudgetId() {
		return (String)eGet(BudgetPackage.Literals.BUDGET__BUDGET_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetId(String newBudgetId) {
		eSet(BudgetPackage.Literals.BUDGET__BUDGET_ID, newBudgetId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<BudgetAttribute> getBudgetAttributes() {
		return (List<BudgetAttribute>)eGet(BudgetPackage.Literals.BUDGET__BUDGET_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<BudgetItem> getBudgetItems() {
		return (List<BudgetItem>)eGet(BudgetPackage.Literals.BUDGET__BUDGET_ITEMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<BudgetRevision> getBudgetRevisions() {
		return (List<BudgetRevision>)eGet(BudgetPackage.Literals.BUDGET__BUDGET_REVISIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<BudgetStatus> getBudgetStatuss() {
		return (List<BudgetStatus>)eGet(BudgetPackage.Literals.BUDGET__BUDGET_STATUSS, true);
	}

} //BudgetImpl
