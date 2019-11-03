/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.accounting.payment.PaymentApplication;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentApplicationImpl#getPaymentApplicationId <em>Payment Application Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentApplicationImpl#getAmountApplied <em>Amount Applied</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentApplicationImpl#getBillingAccountId <em>Billing Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentApplicationImpl#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentApplicationImpl#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentApplicationImpl#getOverrideGlAccountId <em>Override Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentApplicationImpl#getPaymentId <em>Payment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentApplicationImpl#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentApplicationImpl#getToPaymentId <em>To Payment Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentApplicationImpl extends BizEntityImpl implements PaymentApplication {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getPaymentApplicationId() <em>Payment Application Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentApplicationId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_APPLICATION_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPaymentApplicationId() <em>Payment Application Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentApplicationId()
	 * @generated
	 * @ordered
	 */
	protected String paymentApplicationId = PAYMENT_APPLICATION_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getAmountApplied() <em>Amount Applied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountApplied()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AMOUNT_APPLIED_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAmountApplied() <em>Amount Applied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountApplied()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal amountApplied = AMOUNT_APPLIED_EDEFAULT;
	/**
	 * The default value of the '{@link #getBillingAccountId() <em>Billing Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String BILLING_ACCOUNT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBillingAccountId() <em>Billing Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingAccountId()
	 * @generated
	 * @ordered
	 */
	protected String billingAccountId = BILLING_ACCOUNT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getInvoiceId() <em>Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInvoiceId() <em>Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceId()
	 * @generated
	 * @ordered
	 */
	protected String invoiceId = INVOICE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getInvoiceItemSeqId() <em>Invoice Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_ITEM_SEQ_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInvoiceItemSeqId() <em>Invoice Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String invoiceItemSeqId = INVOICE_ITEM_SEQ_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getOverrideGlAccountId() <em>Override Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String OVERRIDE_GL_ACCOUNT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOverrideGlAccountId() <em>Override Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected String overrideGlAccountId = OVERRIDE_GL_ACCOUNT_ID_EDEFAULT;
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
	 * The default value of the '{@link #getTaxAuthGeoId() <em>Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthGeoId()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_AUTH_GEO_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTaxAuthGeoId() <em>Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthGeoId()
	 * @generated
	 * @ordered
	 */
	protected String taxAuthGeoId = TAX_AUTH_GEO_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getToPaymentId() <em>To Payment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPaymentId()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_PAYMENT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getToPaymentId() <em>To Payment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPaymentId()
	 * @generated
	 * @ordered
	 */
	protected String toPaymentId = TO_PAYMENT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAmountApplied() {
		return amountApplied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountApplied(BigDecimal newAmountApplied) {
		BigDecimal oldAmountApplied = amountApplied;
		amountApplied = newAmountApplied;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_APPLICATION__AMOUNT_APPLIED, oldAmountApplied, amountApplied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceItemSeqId() {
		return invoiceItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceItemSeqId(String newInvoiceItemSeqId) {
		String oldInvoiceItemSeqId = invoiceItemSeqId;
		invoiceItemSeqId = newInvoiceItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_APPLICATION__INVOICE_ITEM_SEQ_ID, oldInvoiceItemSeqId, invoiceItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentApplicationId() {
		return paymentApplicationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentApplicationId(String newPaymentApplicationId) {
		String oldPaymentApplicationId = paymentApplicationId;
		paymentApplicationId = newPaymentApplicationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_APPLICATION__PAYMENT_APPLICATION_ID, oldPaymentApplicationId, paymentApplicationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxAuthGeoId() {
		return taxAuthGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthGeoId(String newTaxAuthGeoId) {
		String oldTaxAuthGeoId = taxAuthGeoId;
		taxAuthGeoId = newTaxAuthGeoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_APPLICATION__TAX_AUTH_GEO_ID, oldTaxAuthGeoId, taxAuthGeoId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_APPLICATION__PAYMENT_ID, oldPaymentId, paymentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceId() {
		return invoiceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceId(String newInvoiceId) {
		String oldInvoiceId = invoiceId;
		invoiceId = newInvoiceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_APPLICATION__INVOICE_ID, oldInvoiceId, invoiceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBillingAccountId() {
		return billingAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingAccountId(String newBillingAccountId) {
		String oldBillingAccountId = billingAccountId;
		billingAccountId = newBillingAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_APPLICATION__BILLING_ACCOUNT_ID, oldBillingAccountId, billingAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToPaymentId() {
		return toPaymentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToPaymentId(String newToPaymentId) {
		String oldToPaymentId = toPaymentId;
		toPaymentId = newToPaymentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_APPLICATION__TO_PAYMENT_ID, oldToPaymentId, toPaymentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOverrideGlAccountId() {
		return overrideGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverrideGlAccountId(String newOverrideGlAccountId) {
		String oldOverrideGlAccountId = overrideGlAccountId;
		overrideGlAccountId = newOverrideGlAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_APPLICATION__OVERRIDE_GL_ACCOUNT_ID, oldOverrideGlAccountId, overrideGlAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.PAYMENT_APPLICATION__PAYMENT_APPLICATION_ID:
				return getPaymentApplicationId();
			case PaymentPackage.PAYMENT_APPLICATION__AMOUNT_APPLIED:
				return getAmountApplied();
			case PaymentPackage.PAYMENT_APPLICATION__BILLING_ACCOUNT_ID:
				return getBillingAccountId();
			case PaymentPackage.PAYMENT_APPLICATION__INVOICE_ID:
				return getInvoiceId();
			case PaymentPackage.PAYMENT_APPLICATION__INVOICE_ITEM_SEQ_ID:
				return getInvoiceItemSeqId();
			case PaymentPackage.PAYMENT_APPLICATION__OVERRIDE_GL_ACCOUNT_ID:
				return getOverrideGlAccountId();
			case PaymentPackage.PAYMENT_APPLICATION__PAYMENT_ID:
				return getPaymentId();
			case PaymentPackage.PAYMENT_APPLICATION__TAX_AUTH_GEO_ID:
				return getTaxAuthGeoId();
			case PaymentPackage.PAYMENT_APPLICATION__TO_PAYMENT_ID:
				return getToPaymentId();
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
			case PaymentPackage.PAYMENT_APPLICATION__PAYMENT_APPLICATION_ID:
				setPaymentApplicationId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__AMOUNT_APPLIED:
				setAmountApplied((BigDecimal)newValue);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__BILLING_ACCOUNT_ID:
				setBillingAccountId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__INVOICE_ID:
				setInvoiceId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__INVOICE_ITEM_SEQ_ID:
				setInvoiceItemSeqId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__OVERRIDE_GL_ACCOUNT_ID:
				setOverrideGlAccountId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__PAYMENT_ID:
				setPaymentId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__TAX_AUTH_GEO_ID:
				setTaxAuthGeoId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__TO_PAYMENT_ID:
				setToPaymentId((String)newValue);
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
			case PaymentPackage.PAYMENT_APPLICATION__PAYMENT_APPLICATION_ID:
				setPaymentApplicationId(PAYMENT_APPLICATION_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__AMOUNT_APPLIED:
				setAmountApplied(AMOUNT_APPLIED_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__BILLING_ACCOUNT_ID:
				setBillingAccountId(BILLING_ACCOUNT_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__INVOICE_ID:
				setInvoiceId(INVOICE_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__INVOICE_ITEM_SEQ_ID:
				setInvoiceItemSeqId(INVOICE_ITEM_SEQ_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__OVERRIDE_GL_ACCOUNT_ID:
				setOverrideGlAccountId(OVERRIDE_GL_ACCOUNT_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__PAYMENT_ID:
				setPaymentId(PAYMENT_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__TAX_AUTH_GEO_ID:
				setTaxAuthGeoId(TAX_AUTH_GEO_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__TO_PAYMENT_ID:
				setToPaymentId(TO_PAYMENT_ID_EDEFAULT);
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
			case PaymentPackage.PAYMENT_APPLICATION__PAYMENT_APPLICATION_ID:
				return PAYMENT_APPLICATION_ID_EDEFAULT == null ? paymentApplicationId != null : !PAYMENT_APPLICATION_ID_EDEFAULT.equals(paymentApplicationId);
			case PaymentPackage.PAYMENT_APPLICATION__AMOUNT_APPLIED:
				return AMOUNT_APPLIED_EDEFAULT == null ? amountApplied != null : !AMOUNT_APPLIED_EDEFAULT.equals(amountApplied);
			case PaymentPackage.PAYMENT_APPLICATION__BILLING_ACCOUNT_ID:
				return BILLING_ACCOUNT_ID_EDEFAULT == null ? billingAccountId != null : !BILLING_ACCOUNT_ID_EDEFAULT.equals(billingAccountId);
			case PaymentPackage.PAYMENT_APPLICATION__INVOICE_ID:
				return INVOICE_ID_EDEFAULT == null ? invoiceId != null : !INVOICE_ID_EDEFAULT.equals(invoiceId);
			case PaymentPackage.PAYMENT_APPLICATION__INVOICE_ITEM_SEQ_ID:
				return INVOICE_ITEM_SEQ_ID_EDEFAULT == null ? invoiceItemSeqId != null : !INVOICE_ITEM_SEQ_ID_EDEFAULT.equals(invoiceItemSeqId);
			case PaymentPackage.PAYMENT_APPLICATION__OVERRIDE_GL_ACCOUNT_ID:
				return OVERRIDE_GL_ACCOUNT_ID_EDEFAULT == null ? overrideGlAccountId != null : !OVERRIDE_GL_ACCOUNT_ID_EDEFAULT.equals(overrideGlAccountId);
			case PaymentPackage.PAYMENT_APPLICATION__PAYMENT_ID:
				return PAYMENT_ID_EDEFAULT == null ? paymentId != null : !PAYMENT_ID_EDEFAULT.equals(paymentId);
			case PaymentPackage.PAYMENT_APPLICATION__TAX_AUTH_GEO_ID:
				return TAX_AUTH_GEO_ID_EDEFAULT == null ? taxAuthGeoId != null : !TAX_AUTH_GEO_ID_EDEFAULT.equals(taxAuthGeoId);
			case PaymentPackage.PAYMENT_APPLICATION__TO_PAYMENT_ID:
				return TO_PAYMENT_ID_EDEFAULT == null ? toPaymentId != null : !TO_PAYMENT_ID_EDEFAULT.equals(toPaymentId);
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
		result.append(" (paymentApplicationId: ");
		result.append(paymentApplicationId);
		result.append(", amountApplied: ");
		result.append(amountApplied);
		result.append(", billingAccountId: ");
		result.append(billingAccountId);
		result.append(", invoiceId: ");
		result.append(invoiceId);
		result.append(", invoiceItemSeqId: ");
		result.append(invoiceItemSeqId);
		result.append(", overrideGlAccountId: ");
		result.append(overrideGlAccountId);
		result.append(", paymentId: ");
		result.append(paymentId);
		result.append(", taxAuthGeoId: ");
		result.append(taxAuthGeoId);
		result.append(", toPaymentId: ");
		result.append(toPaymentId);
		result.append(')');
		return result.toString();
	}

} //PaymentApplicationImpl
