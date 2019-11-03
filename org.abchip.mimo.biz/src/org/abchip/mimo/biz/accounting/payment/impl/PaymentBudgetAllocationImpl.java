/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.accounting.payment.PaymentBudgetAllocation;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Budget Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentBudgetAllocationImpl#getBudgetId <em>Budget Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentBudgetAllocationImpl#getBudgetItemSeqId <em>Budget Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentBudgetAllocationImpl#getPaymentId <em>Payment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentBudgetAllocationImpl#getAmount <em>Amount</em>}</li>
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
	 * The default value of the '{@link #getBudgetId() <em>Budget Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetId()
	 * @generated
	 * @ordered
	 */
	protected static final String BUDGET_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBudgetId() <em>Budget Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBudgetId()
	 * @generated
	 * @ordered
	 */
	protected String budgetId = BUDGET_ID_EDEFAULT;
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
	 * The default value of the '{@link #getPaymentId() <em>Payment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentId() <em>Payment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentId()
	 * @generated
	 * @ordered
	 */
	protected String paymentId = PAYMENT_ID_EDEFAULT;
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
		BigDecimal oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_BUDGET_ALLOCATION__AMOUNT, oldAmount, amount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_BUDGET_ALLOCATION__BUDGET_ITEM_SEQ_ID, oldBudgetItemSeqId, budgetItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBudgetId() {
		return budgetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBudgetId(String newBudgetId) {
		String oldBudgetId = budgetId;
		budgetId = newBudgetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_BUDGET_ALLOCATION__BUDGET_ID, oldBudgetId, budgetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentId() {
		return paymentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentId(String newPaymentId) {
		String oldPaymentId = paymentId;
		paymentId = newPaymentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_BUDGET_ALLOCATION__PAYMENT_ID, oldPaymentId, paymentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__BUDGET_ID:
				return getBudgetId();
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__BUDGET_ITEM_SEQ_ID:
				return getBudgetItemSeqId();
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__PAYMENT_ID:
				return getPaymentId();
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__AMOUNT:
				return getAmount();
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
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__BUDGET_ID:
				setBudgetId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__BUDGET_ITEM_SEQ_ID:
				setBudgetItemSeqId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__PAYMENT_ID:
				setPaymentId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__AMOUNT:
				setAmount((BigDecimal)newValue);
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
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__BUDGET_ID:
				setBudgetId(BUDGET_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__BUDGET_ITEM_SEQ_ID:
				setBudgetItemSeqId(BUDGET_ITEM_SEQ_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__PAYMENT_ID:
				setPaymentId(PAYMENT_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
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
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__BUDGET_ID:
				return BUDGET_ID_EDEFAULT == null ? budgetId != null : !BUDGET_ID_EDEFAULT.equals(budgetId);
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__BUDGET_ITEM_SEQ_ID:
				return BUDGET_ITEM_SEQ_ID_EDEFAULT == null ? budgetItemSeqId != null : !BUDGET_ITEM_SEQ_ID_EDEFAULT.equals(budgetItemSeqId);
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__PAYMENT_ID:
				return PAYMENT_ID_EDEFAULT == null ? paymentId != null : !PAYMENT_ID_EDEFAULT.equals(paymentId);
			case PaymentPackage.PAYMENT_BUDGET_ALLOCATION__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
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
		result.append(" (budgetId: ");
		result.append(budgetId);
		result.append(", budgetItemSeqId: ");
		result.append(budgetItemSeqId);
		result.append(", paymentId: ");
		result.append(paymentId);
		result.append(", amount: ");
		result.append(amount);
		result.append(')');
		return result.toString();
	}

} //PaymentBudgetAllocationImpl
