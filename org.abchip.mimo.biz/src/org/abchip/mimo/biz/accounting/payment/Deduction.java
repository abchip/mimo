/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deduction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.Deduction#getDeductionId <em>Deduction Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.Deduction#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.Deduction#getDeductionTypeId <em>Deduction Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.Deduction#getPaymentId <em>Payment Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getDeduction()
 * @model
 * @generated
 */
public interface Deduction extends BizEntityTyped<DeductionType> {
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
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getDeduction_Amount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.Deduction#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Deduction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deduction Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduction Id</em>' attribute.
	 * @see #setDeductionId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getDeduction_DeductionId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getDeductionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.Deduction#getDeductionId <em>Deduction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduction Id</em>' attribute.
	 * @see #getDeductionId()
	 * @generated
	 */
	void setDeductionId(String value);

	/**
	 * Returns the value of the '<em><b>Deduction Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deduction Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deduction Type Id</em>' reference.
	 * @see #setDeductionTypeId(DeductionType)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getDeduction_DeductionTypeId()
	 * @model keys="deductionTypeId"
	 * @generated
	 */
	DeductionType getDeductionTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.Deduction#getDeductionTypeId <em>Deduction Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduction Type Id</em>' reference.
	 * @see #getDeductionTypeId()
	 * @generated
	 */
	void setDeductionTypeId(DeductionType value);

	/**
	 * Returns the value of the '<em><b>Payment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Id</em>' reference.
	 * @see #setPaymentId(Payment)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getDeduction_PaymentId()
	 * @model keys="paymentId"
	 * @generated
	 */
	Payment getPaymentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.Deduction#getPaymentId <em>Payment Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Id</em>' reference.
	 * @see #getPaymentId()
	 * @generated
	 */
	void setPaymentId(Payment value);

} // Deduction
