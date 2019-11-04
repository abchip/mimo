/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.accounting.invoice.Invoice;
import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.accounting.payment.BillingAccount;
import org.abchip.mimo.biz.accounting.payment.Payment;
import org.abchip.mimo.biz.accounting.payment.PaymentApplication;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentApplicationImpl#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentApplicationImpl#getPaymentId <em>Payment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentApplicationImpl#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentApplicationImpl#getBillingAccountId <em>Billing Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentApplicationImpl#getToPaymentId <em>To Payment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentApplicationImpl#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentApplicationImpl#getOverrideGlAccountId <em>Override Gl Account Id</em>}</li>
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
	 * The cached value of the '{@link #getPaymentId() <em>Payment Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentId()
	 * @generated
	 * @ordered
	 */
	protected Payment paymentId;
	/**
	 * The cached value of the '{@link #getInvoiceId() <em>Invoice Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceId()
	 * @generated
	 * @ordered
	 */
	protected Invoice invoiceId;
	/**
	 * The cached value of the '{@link #getBillingAccountId() <em>Billing Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingAccountId()
	 * @generated
	 * @ordered
	 */
	protected BillingAccount billingAccountId;
	/**
	 * The cached value of the '{@link #getToPaymentId() <em>To Payment Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPaymentId()
	 * @generated
	 * @ordered
	 */
	protected Payment toPaymentId;
	/**
	 * The cached value of the '{@link #getTaxAuthGeoId() <em>Tax Auth Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthGeoId()
	 * @generated
	 * @ordered
	 */
	protected Geo taxAuthGeoId;
	/**
	 * The cached value of the '{@link #getOverrideGlAccountId() <em>Override Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected GlAccount overrideGlAccountId;

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
	public Geo getTaxAuthGeoId() {
		if (taxAuthGeoId != null && ((EObject)taxAuthGeoId).eIsProxy()) {
			InternalEObject oldTaxAuthGeoId = (InternalEObject)taxAuthGeoId;
			taxAuthGeoId = (Geo)eResolveProxy(oldTaxAuthGeoId);
			if (taxAuthGeoId != oldTaxAuthGeoId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT_APPLICATION__TAX_AUTH_GEO_ID, oldTaxAuthGeoId, taxAuthGeoId));
			}
		}
		return taxAuthGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geo basicGetTaxAuthGeoId() {
		return taxAuthGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthGeoId(Geo newTaxAuthGeoId) {
		Geo oldTaxAuthGeoId = taxAuthGeoId;
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
	public Payment getPaymentId() {
		if (paymentId != null && ((EObject)paymentId).eIsProxy()) {
			InternalEObject oldPaymentId = (InternalEObject)paymentId;
			paymentId = (Payment)eResolveProxy(oldPaymentId);
			if (paymentId != oldPaymentId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT_APPLICATION__PAYMENT_ID, oldPaymentId, paymentId));
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
		Payment oldPaymentId = paymentId;
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
	public Invoice getInvoiceId() {
		if (invoiceId != null && ((EObject)invoiceId).eIsProxy()) {
			InternalEObject oldInvoiceId = (InternalEObject)invoiceId;
			invoiceId = (Invoice)eResolveProxy(oldInvoiceId);
			if (invoiceId != oldInvoiceId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT_APPLICATION__INVOICE_ID, oldInvoiceId, invoiceId));
			}
		}
		return invoiceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoice basicGetInvoiceId() {
		return invoiceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceId(Invoice newInvoiceId) {
		Invoice oldInvoiceId = invoiceId;
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
	public BillingAccount getBillingAccountId() {
		if (billingAccountId != null && ((EObject)billingAccountId).eIsProxy()) {
			InternalEObject oldBillingAccountId = (InternalEObject)billingAccountId;
			billingAccountId = (BillingAccount)eResolveProxy(oldBillingAccountId);
			if (billingAccountId != oldBillingAccountId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT_APPLICATION__BILLING_ACCOUNT_ID, oldBillingAccountId, billingAccountId));
			}
		}
		return billingAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillingAccount basicGetBillingAccountId() {
		return billingAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingAccountId(BillingAccount newBillingAccountId) {
		BillingAccount oldBillingAccountId = billingAccountId;
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
	public Payment getToPaymentId() {
		if (toPaymentId != null && ((EObject)toPaymentId).eIsProxy()) {
			InternalEObject oldToPaymentId = (InternalEObject)toPaymentId;
			toPaymentId = (Payment)eResolveProxy(oldToPaymentId);
			if (toPaymentId != oldToPaymentId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT_APPLICATION__TO_PAYMENT_ID, oldToPaymentId, toPaymentId));
			}
		}
		return toPaymentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Payment basicGetToPaymentId() {
		return toPaymentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToPaymentId(Payment newToPaymentId) {
		Payment oldToPaymentId = toPaymentId;
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
	public GlAccount getOverrideGlAccountId() {
		if (overrideGlAccountId != null && ((EObject)overrideGlAccountId).eIsProxy()) {
			InternalEObject oldOverrideGlAccountId = (InternalEObject)overrideGlAccountId;
			overrideGlAccountId = (GlAccount)eResolveProxy(oldOverrideGlAccountId);
			if (overrideGlAccountId != oldOverrideGlAccountId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT_APPLICATION__OVERRIDE_GL_ACCOUNT_ID, oldOverrideGlAccountId, overrideGlAccountId));
			}
		}
		return overrideGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccount basicGetOverrideGlAccountId() {
		return overrideGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverrideGlAccountId(GlAccount newOverrideGlAccountId) {
		GlAccount oldOverrideGlAccountId = overrideGlAccountId;
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
			case PaymentPackage.PAYMENT_APPLICATION__INVOICE_ITEM_SEQ_ID:
				return getInvoiceItemSeqId();
			case PaymentPackage.PAYMENT_APPLICATION__PAYMENT_ID:
				if (resolve) return getPaymentId();
				return basicGetPaymentId();
			case PaymentPackage.PAYMENT_APPLICATION__INVOICE_ID:
				if (resolve) return getInvoiceId();
				return basicGetInvoiceId();
			case PaymentPackage.PAYMENT_APPLICATION__BILLING_ACCOUNT_ID:
				if (resolve) return getBillingAccountId();
				return basicGetBillingAccountId();
			case PaymentPackage.PAYMENT_APPLICATION__TO_PAYMENT_ID:
				if (resolve) return getToPaymentId();
				return basicGetToPaymentId();
			case PaymentPackage.PAYMENT_APPLICATION__TAX_AUTH_GEO_ID:
				if (resolve) return getTaxAuthGeoId();
				return basicGetTaxAuthGeoId();
			case PaymentPackage.PAYMENT_APPLICATION__OVERRIDE_GL_ACCOUNT_ID:
				if (resolve) return getOverrideGlAccountId();
				return basicGetOverrideGlAccountId();
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
			case PaymentPackage.PAYMENT_APPLICATION__INVOICE_ITEM_SEQ_ID:
				setInvoiceItemSeqId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__PAYMENT_ID:
				setPaymentId((Payment)newValue);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__INVOICE_ID:
				setInvoiceId((Invoice)newValue);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__BILLING_ACCOUNT_ID:
				setBillingAccountId((BillingAccount)newValue);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__TO_PAYMENT_ID:
				setToPaymentId((Payment)newValue);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__TAX_AUTH_GEO_ID:
				setTaxAuthGeoId((Geo)newValue);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__OVERRIDE_GL_ACCOUNT_ID:
				setOverrideGlAccountId((GlAccount)newValue);
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
			case PaymentPackage.PAYMENT_APPLICATION__INVOICE_ITEM_SEQ_ID:
				setInvoiceItemSeqId(INVOICE_ITEM_SEQ_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__PAYMENT_ID:
				setPaymentId((Payment)null);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__INVOICE_ID:
				setInvoiceId((Invoice)null);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__BILLING_ACCOUNT_ID:
				setBillingAccountId((BillingAccount)null);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__TO_PAYMENT_ID:
				setToPaymentId((Payment)null);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__TAX_AUTH_GEO_ID:
				setTaxAuthGeoId((Geo)null);
				return;
			case PaymentPackage.PAYMENT_APPLICATION__OVERRIDE_GL_ACCOUNT_ID:
				setOverrideGlAccountId((GlAccount)null);
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
			case PaymentPackage.PAYMENT_APPLICATION__INVOICE_ITEM_SEQ_ID:
				return INVOICE_ITEM_SEQ_ID_EDEFAULT == null ? invoiceItemSeqId != null : !INVOICE_ITEM_SEQ_ID_EDEFAULT.equals(invoiceItemSeqId);
			case PaymentPackage.PAYMENT_APPLICATION__PAYMENT_ID:
				return paymentId != null;
			case PaymentPackage.PAYMENT_APPLICATION__INVOICE_ID:
				return invoiceId != null;
			case PaymentPackage.PAYMENT_APPLICATION__BILLING_ACCOUNT_ID:
				return billingAccountId != null;
			case PaymentPackage.PAYMENT_APPLICATION__TO_PAYMENT_ID:
				return toPaymentId != null;
			case PaymentPackage.PAYMENT_APPLICATION__TAX_AUTH_GEO_ID:
				return taxAuthGeoId != null;
			case PaymentPackage.PAYMENT_APPLICATION__OVERRIDE_GL_ACCOUNT_ID:
				return overrideGlAccountId != null;
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
		result.append(", invoiceItemSeqId: ");
		result.append(invoiceItemSeqId);
		result.append(')');
		return result.toString();
	}

} //PaymentApplicationImpl
