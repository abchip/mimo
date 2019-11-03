/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Budget Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentBudgetAllocation#getBudgetId <em>Budget Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentBudgetAllocation#getBudgetItemSeqId <em>Budget Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentBudgetAllocation#getPaymentId <em>Payment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentBudgetAllocation#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentBudgetAllocation()
 * @model
 * @generated
 */
public interface PaymentBudgetAllocation extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentBudgetAllocation_Amount()
	 * @model
	 * @generated
	 */
	BigDecimal getAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentBudgetAllocation#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentBudgetAllocation_BudgetItemSeqId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getBudgetItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentBudgetAllocation#getBudgetItemSeqId <em>Budget Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Item Seq Id</em>' attribute.
	 * @see #getBudgetItemSeqId()
	 * @generated
	 */
	void setBudgetItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Budget Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Budget Id</em>' attribute.
	 * @see #setBudgetId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentBudgetAllocation_BudgetId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Budget'"
	 * @generated
	 */
	String getBudgetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentBudgetAllocation#getBudgetId <em>Budget Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget Id</em>' attribute.
	 * @see #getBudgetId()
	 * @generated
	 */
	void setBudgetId(String value);

	/**
	 * Returns the value of the '<em><b>Payment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Id</em>' attribute.
	 * @see #setPaymentId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentBudgetAllocation_PaymentId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Payment'"
	 * @generated
	 */
	String getPaymentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentBudgetAllocation#getPaymentId <em>Payment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Id</em>' attribute.
	 * @see #getPaymentId()
	 * @generated
	 */
	void setPaymentId(String value);

} // PaymentBudgetAllocation
