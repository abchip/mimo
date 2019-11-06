/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.accounting.budget.Budget;
import org.abchip.mimo.biz.accounting.payment.Payment;
import org.abchip.mimo.biz.accounting.payment.PaymentBudgetAllocation;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Budget Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentBudgetAllocationImpl#getBudgetItemSeqId <em>Budget Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentBudgetAllocationImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentBudgetAllocationImpl#getBudgetId <em>Budget Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentBudgetAllocationImpl#getPaymentId <em>Payment Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentBudgetAllocationImpl extends BizEntityImpl implements PaymentBudgetAllocation {
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
	 * The cached value of the '{@link #getBudgetId() <em>Budget Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetId()
	 * @generated
	 * @ordered
	 */
	protected Budget budgetId;
	/**
	 * The cached value of the '{@link #getPaymentId() <em>Payment Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentId()
	 * @generated
	 * @ordered
	 */
	protected Payment paymentId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentBudgetAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_BUDGET_ALLOCATION;
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
	public Payment getPaymentId() {
		if (paymentId != null && ((EObject)paymentId).eIsProxy()) {
			InternalEObject oldPaymentId = (InternalEObject)paymentId;
			paymentId = (Payment)eResolveProxy(oldPaymentId);
			if (paymentId != oldPaymentId) {
			}
		}
		return paymentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Payment basicGetPaymentId() {
		return paymentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentId(Payment newPaymentId) {
		paymentId = newPaymentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__BUDGET_ITEM_SEQ_ID:
				return getBudgetItemSeqId();
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__AMOUNT:
				return getAmount();
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__BUDGET_ID:
				if (resolve) return getBudgetId();
				return basicGetBudgetId();
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__PAYMENT_ID:
				if (resolve) return getPaymentId();
				return basicGetPaymentId();
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
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__BUDGET_ITEM_SEQ_ID:
				setBudgetItemSeqId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__BUDGET_ID:
				setBudgetId((Budget)newValue);
				return;
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__PAYMENT_ID:
				setPaymentId((Payment)newValue);
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
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__BUDGET_ITEM_SEQ_ID:
				setBudgetItemSeqId(BUDGET_ITEM_SEQ_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__BUDGET_ID:
				setBudgetId((Budget)null);
				return;
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__PAYMENT_ID:
				setPaymentId((Payment)null);
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
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__BUDGET_ITEM_SEQ_ID:
				return BUDGET_ITEM_SEQ_ID_EDEFAULT == null ? budgetItemSeqId != null : !BUDGET_ITEM_SEQ_ID_EDEFAULT.equals(budgetItemSeqId);
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__BUDGET_ID:
				return budgetId != null;
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__PAYMENT_ID:
				return paymentId != null;
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
		result.append(')');
		return result.toString();
	}

} //PaymentBudgetAllocationImpl
