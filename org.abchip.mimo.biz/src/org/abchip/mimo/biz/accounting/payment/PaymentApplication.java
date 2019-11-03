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
 * A representation of the model object '<em><b>Payment Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getPaymentApplicationId <em>Payment Application Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getAmountApplied <em>Amount Applied</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getBillingAccountId <em>Billing Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getOverrideGlAccountId <em>Override Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getPaymentId <em>Payment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getToPaymentId <em>To Payment Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentApplication()
 * @model
 * @generated
 */
public interface PaymentApplication extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Amount Applied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Applied</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Applied</em>' attribute.
	 * @see #setAmountApplied(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentApplication_AmountApplied()
	 * @model
	 * @generated
	 */
	BigDecimal getAmountApplied();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getAmountApplied <em>Amount Applied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Applied</em>' attribute.
	 * @see #getAmountApplied()
	 * @generated
	 */
	void setAmountApplied(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Invoice Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Item Seq Id</em>' attribute.
	 * @see #setInvoiceItemSeqId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentApplication_InvoiceItemSeqId()
	 * @model
	 * @generated
	 */
	String getInvoiceItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Item Seq Id</em>' attribute.
	 * @see #getInvoiceItemSeqId()
	 * @generated
	 */
	void setInvoiceItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Payment Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Application Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Application Id</em>' attribute.
	 * @see #setPaymentApplicationId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentApplication_PaymentApplicationId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getPaymentApplicationId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getPaymentApplicationId <em>Payment Application Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Application Id</em>' attribute.
	 * @see #getPaymentApplicationId()
	 * @generated
	 */
	void setPaymentApplicationId(String value);

	/**
	 * Returns the value of the '<em><b>Tax Auth Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Auth Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Auth Geo Id</em>' attribute.
	 * @see #setTaxAuthGeoId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentApplication_TaxAuthGeoId()
	 * @model annotation="mimo-ent-domain frame='Geo'"
	 * @generated
	 */
	String getTaxAuthGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Auth Geo Id</em>' attribute.
	 * @see #getTaxAuthGeoId()
	 * @generated
	 */
	void setTaxAuthGeoId(String value);

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
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentApplication_PaymentId()
	 * @model annotation="mimo-ent-domain frame='Payment'"
	 * @generated
	 */
	String getPaymentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getPaymentId <em>Payment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Id</em>' attribute.
	 * @see #getPaymentId()
	 * @generated
	 */
	void setPaymentId(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Id</em>' attribute.
	 * @see #setInvoiceId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentApplication_InvoiceId()
	 * @model annotation="mimo-ent-domain frame='Invoice'"
	 * @generated
	 */
	String getInvoiceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getInvoiceId <em>Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Id</em>' attribute.
	 * @see #getInvoiceId()
	 * @generated
	 */
	void setInvoiceId(String value);

	/**
	 * Returns the value of the '<em><b>Billing Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Account Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Account Id</em>' attribute.
	 * @see #setBillingAccountId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentApplication_BillingAccountId()
	 * @model annotation="mimo-ent-domain frame='BillingAccount'"
	 * @generated
	 */
	String getBillingAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getBillingAccountId <em>Billing Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Account Id</em>' attribute.
	 * @see #getBillingAccountId()
	 * @generated
	 */
	void setBillingAccountId(String value);

	/**
	 * Returns the value of the '<em><b>To Payment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Payment Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Payment Id</em>' attribute.
	 * @see #setToPaymentId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentApplication_ToPaymentId()
	 * @model annotation="mimo-ent-domain frame='Payment'"
	 * @generated
	 */
	String getToPaymentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getToPaymentId <em>To Payment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Payment Id</em>' attribute.
	 * @see #getToPaymentId()
	 * @generated
	 */
	void setToPaymentId(String value);

	/**
	 * Returns the value of the '<em><b>Override Gl Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Override Gl Account Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override Gl Account Id</em>' attribute.
	 * @see #setOverrideGlAccountId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentApplication_OverrideGlAccountId()
	 * @model annotation="mimo-ent-domain frame='GlAccount'"
	 * @generated
	 */
	String getOverrideGlAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getOverrideGlAccountId <em>Override Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override Gl Account Id</em>' attribute.
	 * @see #getOverrideGlAccountId()
	 * @generated
	 */
	void setOverrideGlAccountId(String value);

} // PaymentApplication
