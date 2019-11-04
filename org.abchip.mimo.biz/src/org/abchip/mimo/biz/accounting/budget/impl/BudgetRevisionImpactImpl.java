/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Budget Revision Impact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetRevisionImpactImpl#getBudgetItemSeqId <em>Budget Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetRevisionImpactImpl#getRevisionSeqId <em>Revision Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetRevisionImpactImpl#isAddDeleteFlag <em>Add Delete Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetRevisionImpactImpl#getRevisedAmount <em>Revised Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetRevisionImpactImpl#getRevisionReason <em>Revision Reason</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetRevisionImpactImpl#getBudgetId <em>Budget Id</em>}</li>
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
	 * The default value of the '{@link #getBudgetItemSeqId() <em>Budget Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String BUDGET_ITEM_SEQ_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBudgetItemSeqId() <em>Budget Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String budgetItemSeqId = BUDGET_ITEM_SEQ_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getRevisionSeqId() <em>Revision Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_SEQ_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRevisionSeqId() <em>Revision Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionSeqId()
	 * @generated
	 * @ordered
	 */
	protected String revisionSeqId = REVISION_SEQ_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #isAddDeleteFlag() <em>Add Delete Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAddDeleteFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADD_DELETE_FLAG_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isAddDeleteFlag() <em>Add Delete Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAddDeleteFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean addDeleteFlag = ADD_DELETE_FLAG_EDEFAULT;
	/**
	 * The default value of the '{@link #getRevisedAmount() <em>Revised Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal REVISED_AMOUNT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRevisedAmount() <em>Revised Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisedAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal revisedAmount = REVISED_AMOUNT_EDEFAULT;
	/**
	 * The default value of the '{@link #getRevisionReason() <em>Revision Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionReason()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_REASON_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRevisionReason() <em>Revision Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionReason()
	 * @generated
	 * @ordered
	 */
	protected String revisionReason = REVISION_REASON_EDEFAULT;
	/**
	 * The cached value of the '{@link #getBudgetId() <em>Budget Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetId()
	 * @generated
	 * @ordered
	 */
	protected Budget budgetId;

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
		return budgetItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetItemSeqId(String newBudgetItemSeqId) {
		String oldBudgetItemSeqId = budgetItemSeqId;
		budgetItemSeqId = newBudgetItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_REVISION_IMPACT__BUDGET_ITEM_SEQ_ID, oldBudgetItemSeqId, budgetItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getRevisedAmount() {
		return revisedAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevisedAmount(BigDecimal newRevisedAmount) {
		BigDecimal oldRevisedAmount = revisedAmount;
		revisedAmount = newRevisedAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_REVISION_IMPACT__REVISED_AMOUNT, oldRevisedAmount, revisedAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRevisionReason() {
		return revisionReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevisionReason(String newRevisionReason) {
		String oldRevisionReason = revisionReason;
		revisionReason = newRevisionReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_REVISION_IMPACT__REVISION_REASON, oldRevisionReason, revisionReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRevisionSeqId() {
		return revisionSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevisionSeqId(String newRevisionSeqId) {
		String oldRevisionSeqId = revisionSeqId;
		revisionSeqId = newRevisionSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_REVISION_IMPACT__REVISION_SEQ_ID, oldRevisionSeqId, revisionSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAddDeleteFlag() {
		return addDeleteFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddDeleteFlag(boolean newAddDeleteFlag) {
		boolean oldAddDeleteFlag = addDeleteFlag;
		addDeleteFlag = newAddDeleteFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_REVISION_IMPACT__ADD_DELETE_FLAG, oldAddDeleteFlag, addDeleteFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Budget getBudgetId() {
		if (budgetId != null && ((EObject)budgetId).eIsProxy()) {
			InternalEObject oldBudgetId = (InternalEObject)budgetId;
			budgetId = (Budget)eResolveProxy(oldBudgetId);
			if (budgetId != oldBudgetId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BudgetPackage.BUDGET_REVISION_IMPACT__BUDGET_ID, oldBudgetId, budgetId));
			}
		}
		return budgetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Budget basicGetBudgetId() {
		return budgetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetId(Budget newBudgetId) {
		Budget oldBudgetId = budgetId;
		budgetId = newBudgetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BudgetPackage.BUDGET_REVISION_IMPACT__BUDGET_ID, oldBudgetId, budgetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BudgetPackage.BUDGET_REVISION_IMPACT__BUDGET_ITEM_SEQ_ID:
				return getBudgetItemSeqId();
			case BudgetPackage.BUDGET_REVISION_IMPACT__REVISION_SEQ_ID:
				return getRevisionSeqId();
			case BudgetPackage.BUDGET_REVISION_IMPACT__ADD_DELETE_FLAG:
				return isAddDeleteFlag();
			case BudgetPackage.BUDGET_REVISION_IMPACT__REVISED_AMOUNT:
				return getRevisedAmount();
			case BudgetPackage.BUDGET_REVISION_IMPACT__REVISION_REASON:
				return getRevisionReason();
			case BudgetPackage.BUDGET_REVISION_IMPACT__BUDGET_ID:
				if (resolve) return getBudgetId();
				return basicGetBudgetId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BudgetPackage.BUDGET_REVISION_IMPACT__BUDGET_ITEM_SEQ_ID:
				setBudgetItemSeqId((String)newValue);
				return;
			case BudgetPackage.BUDGET_REVISION_IMPACT__REVISION_SEQ_ID:
				setRevisionSeqId((String)newValue);
				return;
			case BudgetPackage.BUDGET_REVISION_IMPACT__ADD_DELETE_FLAG:
				setAddDeleteFlag((Boolean)newValue);
				return;
			case BudgetPackage.BUDGET_REVISION_IMPACT__REVISED_AMOUNT:
				setRevisedAmount((BigDecimal)newValue);
				return;
			case BudgetPackage.BUDGET_REVISION_IMPACT__REVISION_REASON:
				setRevisionReason((String)newValue);
				return;
			case BudgetPackage.BUDGET_REVISION_IMPACT__BUDGET_ID:
				setBudgetId((Budget)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BudgetPackage.BUDGET_REVISION_IMPACT__BUDGET_ITEM_SEQ_ID:
				setBudgetItemSeqId(BUDGET_ITEM_SEQ_ID_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_REVISION_IMPACT__REVISION_SEQ_ID:
				setRevisionSeqId(REVISION_SEQ_ID_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_REVISION_IMPACT__ADD_DELETE_FLAG:
				setAddDeleteFlag(ADD_DELETE_FLAG_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_REVISION_IMPACT__REVISED_AMOUNT:
				setRevisedAmount(REVISED_AMOUNT_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_REVISION_IMPACT__REVISION_REASON:
				setRevisionReason(REVISION_REASON_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_REVISION_IMPACT__BUDGET_ID:
				setBudgetId((Budget)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BudgetPackage.BUDGET_REVISION_IMPACT__BUDGET_ITEM_SEQ_ID:
				return BUDGET_ITEM_SEQ_ID_EDEFAULT == null ? budgetItemSeqId != null : !BUDGET_ITEM_SEQ_ID_EDEFAULT.equals(budgetItemSeqId);
			case BudgetPackage.BUDGET_REVISION_IMPACT__REVISION_SEQ_ID:
				return REVISION_SEQ_ID_EDEFAULT == null ? revisionSeqId != null : !REVISION_SEQ_ID_EDEFAULT.equals(revisionSeqId);
			case BudgetPackage.BUDGET_REVISION_IMPACT__ADD_DELETE_FLAG:
				return addDeleteFlag != ADD_DELETE_FLAG_EDEFAULT;
			case BudgetPackage.BUDGET_REVISION_IMPACT__REVISED_AMOUNT:
				return REVISED_AMOUNT_EDEFAULT == null ? revisedAmount != null : !REVISED_AMOUNT_EDEFAULT.equals(revisedAmount);
			case BudgetPackage.BUDGET_REVISION_IMPACT__REVISION_REASON:
				return REVISION_REASON_EDEFAULT == null ? revisionReason != null : !REVISION_REASON_EDEFAULT.equals(revisionReason);
			case BudgetPackage.BUDGET_REVISION_IMPACT__BUDGET_ID:
				return budgetId != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (budgetItemSeqId: ");
		result.append(budgetItemSeqId);
		result.append(", revisionSeqId: ");
		result.append(revisionSeqId);
		result.append(", addDeleteFlag: ");
		result.append(addDeleteFlag);
		result.append(", revisedAmount: ");
		result.append(revisedAmount);
		result.append(", revisionReason: ");
		result.append(revisionReason);
		result.append(')');
		return result.toString();
	}

} //BudgetRevisionImpactImpl
