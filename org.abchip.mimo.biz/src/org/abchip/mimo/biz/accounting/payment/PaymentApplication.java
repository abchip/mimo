/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.accounting.invoice.Invoice;
import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.common.geo.Geo;

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
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
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
	 * @model annotation="mimo-ent-format length='20'"
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
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
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
	 * Returns the value of the '<em><b>Tax Auth Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Auth Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Auth Geo Id</em>' reference.
	 * @see #setTaxAuthGeoId(Geo)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentApplication_TaxAuthGeoId()
	 * @model keys="geoId"
	 * @generated
	 */
	Geo getTaxAuthGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Auth Geo Id</em>' reference.
	 * @see #getTaxAuthGeoId()
	 * @generated
	 */
	void setTaxAuthGeoId(Geo value);

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
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentApplication_PaymentId()
	 * @model keys="paymentId"
	 * @generated
	 */
	Payment getPaymentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getPaymentId <em>Payment Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Id</em>' reference.
	 * @see #getPaymentId()
	 * @generated
	 */
	void setPaymentId(Payment value);

	/**
	 * Returns the value of the '<em><b>Invoice Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Id</em>' reference.
	 * @see #setInvoiceId(Invoice)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentApplication_InvoiceId()
	 * @model keys="invoiceId"
	 * @generated
	 */
	Invoice getInvoiceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getInvoiceId <em>Invoice Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Id</em>' reference.
	 * @see #getInvoiceId()
	 * @generated
	 */
	void setInvoiceId(Invoice value);

	/**
	 * Returns the value of the '<em><b>Billing Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Account Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Account Id</em>' reference.
	 * @see #setBillingAccountId(BillingAccount)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentApplication_BillingAccountId()
	 * @model keys="billingAccountId"
	 * @generated
	 */
	BillingAccount getBillingAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getBillingAccountId <em>Billing Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Account Id</em>' reference.
	 * @see #getBillingAccountId()
	 * @generated
	 */
	void setBillingAccountId(BillingAccount value);

	/**
	 * Returns the value of the '<em><b>To Payment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Payment Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Payment Id</em>' reference.
	 * @see #setToPaymentId(Payment)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentApplication_ToPaymentId()
	 * @model keys="paymentId"
	 * @generated
	 */
	Payment getToPaymentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getToPaymentId <em>To Payment Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Payment Id</em>' reference.
	 * @see #getToPaymentId()
	 * @generated
	 */
	void setToPaymentId(Payment value);

	/**
	 * Returns the value of the '<em><b>Override Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Override Gl Account Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override Gl Account Id</em>' reference.
	 * @see #setOverrideGlAccountId(GlAccount)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentApplication_OverrideGlAccountId()
	 * @model keys="glAccountId"
	 *        annotation="mimo-ent-slot help='If filled in, payment is applied directly against this GL account'"
	 * @generated
	 */
	GlAccount getOverrideGlAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getOverrideGlAccountId <em>Override Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override Gl Account Id</em>' reference.
	 * @see #getOverrideGlAccountId()
	 * @generated
	 */
	void setOverrideGlAccountId(GlAccount value);

} // PaymentApplication
