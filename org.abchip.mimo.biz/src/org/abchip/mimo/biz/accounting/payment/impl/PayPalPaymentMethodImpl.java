/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pay Pal Payment Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PayPalPaymentMethodImpl#getPaymentMethodId <em>Payment Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PayPalPaymentMethodImpl#isAvsAddr <em>Avs Addr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PayPalPaymentMethodImpl#isAvsZip <em>Avs Zip</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PayPalPaymentMethodImpl#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PayPalPaymentMethodImpl#getCorrelationId <em>Correlation Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PayPalPaymentMethodImpl#getExpressCheckoutToken <em>Express Checkout Token</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PayPalPaymentMethodImpl#getPayerId <em>Payer Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PayPalPaymentMethodImpl#getPayerStatus <em>Payer Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PayPalPaymentMethodImpl#getTransactionId <em>Transaction Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PayPalPaymentMethodImpl extends BizEntityImpl implements PayPalPaymentMethod {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PayPalPaymentMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAY_PAL_PAYMENT_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getContactMechId() {
		return (ContactMech)eGet(PaymentPackage.Literals.PAY_PAL_PAYMENT_METHOD__CONTACT_MECH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(ContactMech newContactMechId) {
		eSet(PaymentPackage.Literals.PAY_PAL_PAYMENT_METHOD__CONTACT_MECH_ID, newContactMechId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCorrelationId() {
		return (String)eGet(PaymentPackage.Literals.PAY_PAL_PAYMENT_METHOD__CORRELATION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrelationId(String newCorrelationId) {
		eSet(PaymentPackage.Literals.PAY_PAL_PAYMENT_METHOD__CORRELATION_ID, newCorrelationId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpressCheckoutToken() {
		return (String)eGet(PaymentPackage.Literals.PAY_PAL_PAYMENT_METHOD__EXPRESS_CHECKOUT_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpressCheckoutToken(String newExpressCheckoutToken) {
		eSet(PaymentPackage.Literals.PAY_PAL_PAYMENT_METHOD__EXPRESS_CHECKOUT_TOKEN, newExpressCheckoutToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPayerId() {
		return (String)eGet(PaymentPackage.Literals.PAY_PAL_PAYMENT_METHOD__PAYER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayerId(String newPayerId) {
		eSet(PaymentPackage.Literals.PAY_PAL_PAYMENT_METHOD__PAYER_ID, newPayerId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPayerStatus() {
		return (String)eGet(PaymentPackage.Literals.PAY_PAL_PAYMENT_METHOD__PAYER_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayerStatus(String newPayerStatus) {
		eSet(PaymentPackage.Literals.PAY_PAL_PAYMENT_METHOD__PAYER_STATUS, newPayerStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentMethodId() {
		return (String)eGet(PaymentPackage.Literals.PAY_PAL_PAYMENT_METHOD__PAYMENT_METHOD_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodId(String newPaymentMethodId) {
		eSet(PaymentPackage.Literals.PAY_PAL_PAYMENT_METHOD__PAYMENT_METHOD_ID, newPaymentMethodId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAvsAddr() {
		return (Boolean)eGet(PaymentPackage.Literals.PAY_PAL_PAYMENT_METHOD__AVS_ADDR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvsAddr(boolean newAvsAddr) {
		eSet(PaymentPackage.Literals.PAY_PAL_PAYMENT_METHOD__AVS_ADDR, newAvsAddr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAvsZip() {
		return (Boolean)eGet(PaymentPackage.Literals.PAY_PAL_PAYMENT_METHOD__AVS_ZIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvsZip(boolean newAvsZip) {
		eSet(PaymentPackage.Literals.PAY_PAL_PAYMENT_METHOD__AVS_ZIP, newAvsZip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransactionId() {
		return (String)eGet(PaymentPackage.Literals.PAY_PAL_PAYMENT_METHOD__TRANSACTION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionId(String newTransactionId) {
		eSet(PaymentPackage.Literals.PAY_PAL_PAYMENT_METHOD__TRANSACTION_ID, newTransactionId);
	}

} //PayPalPaymentMethodImpl
