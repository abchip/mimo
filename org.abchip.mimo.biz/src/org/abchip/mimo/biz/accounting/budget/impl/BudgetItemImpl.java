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
import org.abchip.mimo.biz.accounting.budget.BudgetItem;
import org.abchip.mimo.biz.accounting.budget.BudgetItemType;
import org.abchip.mimo.biz.accounting.budget.BudgetPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Budget Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetItemImpl#getBudgetItemSeqId <em>Budget Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetItemImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetItemImpl#getJustification <em>Justification</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetItemImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetItemImpl#getBudgetId <em>Budget Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.budget.impl.BudgetItemImpl#getBudgetItemTypeId <em>Budget Item Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BudgetItemImpl extends BizEntityTypedImpl<BudgetItemType> implements BudgetItem {
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
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AMOUNT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal amount = AMOUNT_EDEFAULT;
	/**
	 * The default value of the '{@link #getJustification() <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustification()
	 * @generated
	 * @ordered
	 */
	protected static final String JUSTIFICATION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getJustification() <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustification()
	 * @generated
	 * @ordered
	 */
	protected String justification = JUSTIFICATION_EDEFAULT;
	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;
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
	 * The cached value of the '{@link #getBudgetItemTypeId() <em>Budget Item Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected BudgetItemType budgetItemTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BudgetItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BudgetPackage.Literals.BUDGET_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(BigDecimal newAmount) {
		amount = newAmount;
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
		budgetItemSeqId = newBudgetItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJustification() {
		return justification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJustification(String newJustification) {
		justification = newJustification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurpose(String newPurpose) {
		purpose = newPurpose;
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
		budgetId = newBudgetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BudgetItemType getBudgetItemTypeId() {
		if (budgetItemTypeId != null && ((EObject)budgetItemTypeId).eIsProxy()) {
			InternalEObject oldBudgetItemTypeId = (InternalEObject)budgetItemTypeId;
			budgetItemTypeId = (BudgetItemType)eResolveProxy(oldBudgetItemTypeId);
			if (budgetItemTypeId != oldBudgetItemTypeId) {
			}
		}
		return budgetItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BudgetItemType basicGetBudgetItemTypeId() {
		return budgetItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetItemTypeId(BudgetItemType newBudgetItemTypeId) {
		budgetItemTypeId = newBudgetItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BudgetPackage.BUDGET_ITEM__BUDGET_ITEM_SEQ_ID:
				return getBudgetItemSeqId();
			case BudgetPackage.BUDGET_ITEM__AMOUNT:
				return getAmount();
			case BudgetPackage.BUDGET_ITEM__JUSTIFICATION:
				return getJustification();
			case BudgetPackage.BUDGET_ITEM__PURPOSE:
				return getPurpose();
			case BudgetPackage.BUDGET_ITEM__BUDGET_ID:
				if (resolve) return getBudgetId();
				return basicGetBudgetId();
			case BudgetPackage.BUDGET_ITEM__BUDGET_ITEM_TYPE_ID:
				if (resolve) return getBudgetItemTypeId();
				return basicGetBudgetItemTypeId();
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
			case BudgetPackage.BUDGET_ITEM__BUDGET_ITEM_SEQ_ID:
				setBudgetItemSeqId((String)newValue);
				return;
			case BudgetPackage.BUDGET_ITEM__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case BudgetPackage.BUDGET_ITEM__JUSTIFICATION:
				setJustification((String)newValue);
				return;
			case BudgetPackage.BUDGET_ITEM__PURPOSE:
				setPurpose((String)newValue);
				return;
			case BudgetPackage.BUDGET_ITEM__BUDGET_ID:
				setBudgetId((Budget)newValue);
				return;
			case BudgetPackage.BUDGET_ITEM__BUDGET_ITEM_TYPE_ID:
				setBudgetItemTypeId((BudgetItemType)newValue);
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
			case BudgetPackage.BUDGET_ITEM__BUDGET_ITEM_SEQ_ID:
				setBudgetItemSeqId(BUDGET_ITEM_SEQ_ID_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_ITEM__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_ITEM__JUSTIFICATION:
				setJustification(JUSTIFICATION_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_ITEM__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case BudgetPackage.BUDGET_ITEM__BUDGET_ID:
				setBudgetId((Budget)null);
				return;
			case BudgetPackage.BUDGET_ITEM__BUDGET_ITEM_TYPE_ID:
				setBudgetItemTypeId((BudgetItemType)null);
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
			case BudgetPackage.BUDGET_ITEM__BUDGET_ITEM_SEQ_ID:
				return BUDGET_ITEM_SEQ_ID_EDEFAULT == null ? budgetItemSeqId != null : !BUDGET_ITEM_SEQ_ID_EDEFAULT.equals(budgetItemSeqId);
			case BudgetPackage.BUDGET_ITEM__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case BudgetPackage.BUDGET_ITEM__JUSTIFICATION:
				return JUSTIFICATION_EDEFAULT == null ? justification != null : !JUSTIFICATION_EDEFAULT.equals(justification);
			case BudgetPackage.BUDGET_ITEM__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case BudgetPackage.BUDGET_ITEM__BUDGET_ID:
				return budgetId != null;
			case BudgetPackage.BUDGET_ITEM__BUDGET_ITEM_TYPE_ID:
				return budgetItemTypeId != null;
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
		result.append(", amount: ");
		result.append(amount);
		result.append(", justification: ");
		result.append(justification);
		result.append(", purpose: ");
		result.append(purpose);
		result.append(')');
		return result.toString();
	}

} //BudgetItemImpl
