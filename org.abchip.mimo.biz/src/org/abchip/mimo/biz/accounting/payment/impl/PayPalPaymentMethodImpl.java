/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod;
import org.abchip.mimo.biz.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pay Pal Payment Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PayPalPaymentMethodImpl#isAvsAddr <em>Avs Addr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PayPalPaymentMethodImpl#isAvsZip <em>Avs Zip</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PayPalPaymentMethodImpl#getCorrelationId <em>Correlation Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PayPalPaymentMethodImpl#getExpressCheckoutToken <em>Express Checkout Token</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PayPalPaymentMethodImpl#getPayerId <em>Payer Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PayPalPaymentMethodImpl#getPayerStatus <em>Payer Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PayPalPaymentMethodImpl#getTransactionId <em>Transaction Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PayPalPaymentMethodImpl#getPaymentMethodId <em>Payment Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PayPalPaymentMethodImpl#getContactMechId <em>Contact Mech Id</em>}</li>
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
	 * The default value of the '{@link #isAvsAddr() <em>Avs Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvsAddr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AVS_ADDR_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isAvsAddr() <em>Avs Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvsAddr()
	 * @generated
	 * @ordered
	 */
	protected boolean avsAddr = AVS_ADDR_EDEFAULT;
	/**
	 * The default value of the '{@link #isAvsZip() <em>Avs Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvsZip()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AVS_ZIP_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isAvsZip() <em>Avs Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvsZip()
	 * @generated
	 * @ordered
	 */
	protected boolean avsZip = AVS_ZIP_EDEFAULT;
	/**
	 * The default value of the '{@link #getCorrelationId() <em>Correlation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationId()
	 * @generated
	 * @ordered
	 */
	protected static final String CORRELATION_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCorrelationId() <em>Correlation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationId()
	 * @generated
	 * @ordered
	 */
	protected String correlationId = CORRELATION_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getExpressCheckoutToken() <em>Express Checkout Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressCheckoutToken()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESS_CHECKOUT_TOKEN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getExpressCheckoutToken() <em>Express Checkout Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressCheckoutToken()
	 * @generated
	 * @ordered
	 */
	protected String expressCheckoutToken = EXPRESS_CHECKOUT_TOKEN_EDEFAULT;
	/**
	 * The default value of the '{@link #getPayerId() <em>Payer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayerId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYER_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPayerId() <em>Payer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayerId()
	 * @generated
	 * @ordered
	 */
	protected String payerId = PAYER_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getPayerStatus() <em>Payer Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayerStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYER_STATUS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPayerStatus() <em>Payer Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayerStatus()
	 * @generated
	 * @ordered
	 */
	protected String payerStatus = PAYER_STATUS_EDEFAULT;
	/**
	 * The default value of the '{@link #getTransactionId() <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionId()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSACTION_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTransactionId() <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionId()
	 * @generated
	 * @ordered
	 */
	protected String transactionId = TRANSACTION_ID_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPaymentMethodId() <em>Payment Method Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodId()
	 * @generated
	 * @ordered
	 */
	protected PaymentMethod paymentMethodId;
	/**
	 * The cached value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected ContactMech contactMechId;

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
		if (contactMechId != null && ((EObject)contactMechId).eIsProxy()) {
			InternalEObject oldContactMechId = (InternalEObject)contactMechId;
			contactMechId = (ContactMech)eResolveProxy(oldContactMechId);
			if (contactMechId != oldContactMechId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAY_PAL_PAYMENT_METHOD__CONTACT_MECH_ID, oldContactMechId, contactMechId));
			}
		}
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMech basicGetContactMechId() {
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(ContactMech newContactMechId) {
		ContactMech oldContactMechId = contactMechId;
		contactMechId = newContactMechId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAY_PAL_PAYMENT_METHOD__CONTACT_MECH_ID, oldContactMechId, contactMechId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCorrelationId() {
		return correlationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrelationId(String newCorrelationId) {
		String oldCorrelationId = correlationId;
		correlationId = newCorrelationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAY_PAL_PAYMENT_METHOD__CORRELATION_ID, oldCorrelationId, correlationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpressCheckoutToken() {
		return expressCheckoutToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpressCheckoutToken(String newExpressCheckoutToken) {
		String oldExpressCheckoutToken = expressCheckoutToken;
		expressCheckoutToken = newExpressCheckoutToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAY_PAL_PAYMENT_METHOD__EXPRESS_CHECKOUT_TOKEN, oldExpressCheckoutToken, expressCheckoutToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPayerId() {
		return payerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayerId(String newPayerId) {
		String oldPayerId = payerId;
		payerId = newPayerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAY_PAL_PAYMENT_METHOD__PAYER_ID, oldPayerId, payerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPayerStatus() {
		return payerStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPayerStatus(String newPayerStatus) {
		String oldPayerStatus = payerStatus;
		payerStatus = newPayerStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAY_PAL_PAYMENT_METHOD__PAYER_STATUS, oldPayerStatus, payerStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethod getPaymentMethodId() {
		if (paymentMethodId != null && ((EObject)paymentMethodId).eIsProxy()) {
			InternalEObject oldPaymentMethodId = (InternalEObject)paymentMethodId;
			paymentMethodId = (PaymentMethod)eResolveProxy(oldPaymentMethodId);
			if (paymentMethodId != oldPaymentMethodId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAY_PAL_PAYMENT_METHOD__PAYMENT_METHOD_ID, oldPaymentMethodId, paymentMethodId));
			}
		}
		return paymentMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMethod basicGetPaymentMethodId() {
		return paymentMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodId(PaymentMethod newPaymentMethodId) {
		PaymentMethod oldPaymentMethodId = paymentMethodId;
		paymentMethodId = newPaymentMethodId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAY_PAL_PAYMENT_METHOD__PAYMENT_METHOD_ID, oldPaymentMethodId, paymentMethodId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAvsAddr() {
		return avsAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvsAddr(boolean newAvsAddr) {
		boolean oldAvsAddr = avsAddr;
		avsAddr = newAvsAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAY_PAL_PAYMENT_METHOD__AVS_ADDR, oldAvsAddr, avsAddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAvsZip() {
		return avsZip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvsZip(boolean newAvsZip) {
		boolean oldAvsZip = avsZip;
		avsZip = newAvsZip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAY_PAL_PAYMENT_METHOD__AVS_ZIP, oldAvsZip, avsZip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionId(String newTransactionId) {
		String oldTransactionId = transactionId;
		transactionId = newTransactionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAY_PAL_PAYMENT_METHOD__TRANSACTION_ID, oldTransactionId, transactionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__AVS_ADDR:
				return isAvsAddr();
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__AVS_ZIP:
				return isAvsZip();
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__CORRELATION_ID:
				return getCorrelationId();
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__EXPRESS_CHECKOUT_TOKEN:
				return getExpressCheckoutToken();
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__PAYER_ID:
				return getPayerId();
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__PAYER_STATUS:
				return getPayerStatus();
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__TRANSACTION_ID:
				return getTransactionId();
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__PAYMENT_METHOD_ID:
				if (resolve) return getPaymentMethodId();
				return basicGetPaymentMethodId();
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__CONTACT_MECH_ID:
				if (resolve) return getContactMechId();
				return basicGetContactMechId();
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
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__AVS_ADDR:
				setAvsAddr((Boolean)newValue);
				return;
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__AVS_ZIP:
				setAvsZip((Boolean)newValue);
				return;
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__CORRELATION_ID:
				setCorrelationId((String)newValue);
				return;
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__EXPRESS_CHECKOUT_TOKEN:
				setExpressCheckoutToken((String)newValue);
				return;
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__PAYER_ID:
				setPayerId((String)newValue);
				return;
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__PAYER_STATUS:
				setPayerStatus((String)newValue);
				return;
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__TRANSACTION_ID:
				setTransactionId((String)newValue);
				return;
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__PAYMENT_METHOD_ID:
				setPaymentMethodId((PaymentMethod)newValue);
				return;
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__CONTACT_MECH_ID:
				setContactMechId((ContactMech)newValue);
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
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__AVS_ADDR:
				setAvsAddr(AVS_ADDR_EDEFAULT);
				return;
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__AVS_ZIP:
				setAvsZip(AVS_ZIP_EDEFAULT);
				return;
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__CORRELATION_ID:
				setCorrelationId(CORRELATION_ID_EDEFAULT);
				return;
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__EXPRESS_CHECKOUT_TOKEN:
				setExpressCheckoutToken(EXPRESS_CHECKOUT_TOKEN_EDEFAULT);
				return;
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__PAYER_ID:
				setPayerId(PAYER_ID_EDEFAULT);
				return;
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__PAYER_STATUS:
				setPayerStatus(PAYER_STATUS_EDEFAULT);
				return;
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__TRANSACTION_ID:
				setTransactionId(TRANSACTION_ID_EDEFAULT);
				return;
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__PAYMENT_METHOD_ID:
				setPaymentMethodId((PaymentMethod)null);
				return;
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__CONTACT_MECH_ID:
				setContactMechId((ContactMech)null);
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
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__AVS_ADDR:
				return avsAddr != AVS_ADDR_EDEFAULT;
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__AVS_ZIP:
				return avsZip != AVS_ZIP_EDEFAULT;
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__CORRELATION_ID:
				return CORRELATION_ID_EDEFAULT == null ? correlationId != null : !CORRELATION_ID_EDEFAULT.equals(correlationId);
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__EXPRESS_CHECKOUT_TOKEN:
				return EXPRESS_CHECKOUT_TOKEN_EDEFAULT == null ? expressCheckoutToken != null : !EXPRESS_CHECKOUT_TOKEN_EDEFAULT.equals(expressCheckoutToken);
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__PAYER_ID:
				return PAYER_ID_EDEFAULT == null ? payerId != null : !PAYER_ID_EDEFAULT.equals(payerId);
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__PAYER_STATUS:
				return PAYER_STATUS_EDEFAULT == null ? payerStatus != null : !PAYER_STATUS_EDEFAULT.equals(payerStatus);
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__TRANSACTION_ID:
				return TRANSACTION_ID_EDEFAULT == null ? transactionId != null : !TRANSACTION_ID_EDEFAULT.equals(transactionId);
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__PAYMENT_METHOD_ID:
				return paymentMethodId != null;
			case PaymentPackage.PAY_PAL_PAYMENT_METHOD__CONTACT_MECH_ID:
				return contactMechId != null;
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
		result.append(" (avsAddr: ");
		result.append(avsAddr);
		result.append(", avsZip: ");
		result.append(avsZip);
		result.append(", correlationId: ");
		result.append(correlationId);
		result.append(", expressCheckoutToken: ");
		result.append(expressCheckoutToken);
		result.append(", payerId: ");
		result.append(payerId);
		result.append(", payerStatus: ");
		result.append(payerStatus);
		result.append(", transactionId: ");
		result.append(transactionId);
		result.append(')');
		return result.toString();
	}

} //PayPalPaymentMethodImpl
