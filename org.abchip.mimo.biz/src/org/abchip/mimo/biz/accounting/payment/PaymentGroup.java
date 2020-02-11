/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGroup#getPaymentGroupId <em>Payment Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGroup#getPaymentGroupName <em>Payment Group Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGroup#getPaymentGroupTypeId <em>Payment Group Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGroup()
 * @model annotation="mimo-ent-frame help='Payment Group'"
 * @generated
 */
public interface PaymentGroup extends BizEntityTyped<PaymentGroupType> {
	/**
	 * Returns the value of the '<em><b>Payment Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Group Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Group Name</em>' attribute.
	 * @see #setPaymentGroupName(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGroup_PaymentGroupName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getPaymentGroupName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGroup#getPaymentGroupName <em>Payment Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Group Name</em>' attribute.
	 * @see #getPaymentGroupName()
	 * @generated
	 */
	void setPaymentGroupName(String value);

	/**
	 * Returns the value of the '<em><b>Payment Group Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Group Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Group Type Id</em>' reference.
	 * @see #setPaymentGroupTypeId(PaymentGroupType)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGroup_PaymentGroupTypeId()
	 * @model keys="paymentGroupTypeId"
	 * @generated
	 */
	PaymentGroupType getPaymentGroupTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGroup#getPaymentGroupTypeId <em>Payment Group Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Group Type Id</em>' reference.
	 * @see #getPaymentGroupTypeId()
	 * @generated
	 */
	void setPaymentGroupTypeId(PaymentGroupType value);

	/**
	 * Returns the value of the '<em><b>Payment Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Group Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Group Id</em>' attribute.
	 * @see #setPaymentGroupId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGroup_PaymentGroupId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPaymentGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGroup#getPaymentGroupId <em>Payment Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Group Id</em>' attribute.
	 * @see #getPaymentGroupId()
	 * @generated
	 */
	void setPaymentGroupId(String value);

} // PaymentGroup
