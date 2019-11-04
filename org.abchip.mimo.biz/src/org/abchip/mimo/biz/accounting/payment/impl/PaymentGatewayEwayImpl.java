/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfig;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayEway;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Gateway Eway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayEwayImpl#getCustomerId <em>Customer Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayEwayImpl#getEnableBeagle <em>Enable Beagle</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayEwayImpl#getEnableCvn <em>Enable Cvn</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayEwayImpl#getRefundPwd <em>Refund Pwd</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayEwayImpl#getTestMode <em>Test Mode</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayEwayImpl#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentGatewayEwayImpl extends BizEntityImpl implements PaymentGatewayEway {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getCustomerId() <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCustomerId() <em>Customer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerId()
	 * @generated
	 * @ordered
	 */
	protected String customerId = CUSTOMER_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getEnableBeagle() <em>Enable Beagle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableBeagle()
	 * @generated
	 * @ordered
	 */
	protected static final String ENABLE_BEAGLE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEnableBeagle() <em>Enable Beagle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableBeagle()
	 * @generated
	 * @ordered
	 */
	protected String enableBeagle = ENABLE_BEAGLE_EDEFAULT;
	/**
	 * The default value of the '{@link #getEnableCvn() <em>Enable Cvn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableCvn()
	 * @generated
	 * @ordered
	 */
	protected static final String ENABLE_CVN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEnableCvn() <em>Enable Cvn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableCvn()
	 * @generated
	 * @ordered
	 */
	protected String enableCvn = ENABLE_CVN_EDEFAULT;
	/**
	 * The default value of the '{@link #getRefundPwd() <em>Refund Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefundPwd()
	 * @generated
	 * @ordered
	 */
	protected static final String REFUND_PWD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRefundPwd() <em>Refund Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefundPwd()
	 * @generated
	 * @ordered
	 */
	protected String refundPwd = REFUND_PWD_EDEFAULT;
	/**
	 * The default value of the '{@link #getTestMode() <em>Test Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestMode()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_MODE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTestMode() <em>Test Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestMode()
	 * @generated
	 * @ordered
	 */
	protected String testMode = TEST_MODE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPaymentGatewayConfigId() <em>Payment Gateway Config Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGatewayConfigId()
	 * @generated
	 * @ordered
	 */
	protected PaymentGatewayConfig paymentGatewayConfigId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentGatewayEwayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_GATEWAY_EWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerId(String newCustomerId) {
		String oldCustomerId = customerId;
		customerId = newCustomerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_EWAY__CUSTOMER_ID, oldCustomerId, customerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnableBeagle() {
		return enableBeagle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableBeagle(String newEnableBeagle) {
		String oldEnableBeagle = enableBeagle;
		enableBeagle = newEnableBeagle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_EWAY__ENABLE_BEAGLE, oldEnableBeagle, enableBeagle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnableCvn() {
		return enableCvn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableCvn(String newEnableCvn) {
		String oldEnableCvn = enableCvn;
		enableCvn = newEnableCvn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_EWAY__ENABLE_CVN, oldEnableCvn, enableCvn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGatewayConfig getPaymentGatewayConfigId() {
		if (paymentGatewayConfigId != null && ((EObject)paymentGatewayConfigId).eIsProxy()) {
			InternalEObject oldPaymentGatewayConfigId = (InternalEObject)paymentGatewayConfigId;
			paymentGatewayConfigId = (PaymentGatewayConfig)eResolveProxy(oldPaymentGatewayConfigId);
			if (paymentGatewayConfigId != oldPaymentGatewayConfigId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT_GATEWAY_EWAY__PAYMENT_GATEWAY_CONFIG_ID, oldPaymentGatewayConfigId, paymentGatewayConfigId));
			}
		}
		return paymentGatewayConfigId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentGatewayConfig basicGetPaymentGatewayConfigId() {
		return paymentGatewayConfigId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayConfigId(PaymentGatewayConfig newPaymentGatewayConfigId) {
		PaymentGatewayConfig oldPaymentGatewayConfigId = paymentGatewayConfigId;
		paymentGatewayConfigId = newPaymentGatewayConfigId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_EWAY__PAYMENT_GATEWAY_CONFIG_ID, oldPaymentGatewayConfigId, paymentGatewayConfigId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRefundPwd() {
		return refundPwd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefundPwd(String newRefundPwd) {
		String oldRefundPwd = refundPwd;
		refundPwd = newRefundPwd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_EWAY__REFUND_PWD, oldRefundPwd, refundPwd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestMode() {
		return testMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestMode(String newTestMode) {
		String oldTestMode = testMode;
		testMode = newTestMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_EWAY__TEST_MODE, oldTestMode, testMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.PAYMENT_GATEWAY_EWAY__CUSTOMER_ID:
				return getCustomerId();
			case PaymentPackage.PAYMENT_GATEWAY_EWAY__ENABLE_BEAGLE:
				return getEnableBeagle();
			case PaymentPackage.PAYMENT_GATEWAY_EWAY__ENABLE_CVN:
				return getEnableCvn();
			case PaymentPackage.PAYMENT_GATEWAY_EWAY__REFUND_PWD:
				return getRefundPwd();
			case PaymentPackage.PAYMENT_GATEWAY_EWAY__TEST_MODE:
				return getTestMode();
			case PaymentPackage.PAYMENT_GATEWAY_EWAY__PAYMENT_GATEWAY_CONFIG_ID:
				if (resolve) return getPaymentGatewayConfigId();
				return basicGetPaymentGatewayConfigId();
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
			case PaymentPackage.PAYMENT_GATEWAY_EWAY__CUSTOMER_ID:
				setCustomerId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_EWAY__ENABLE_BEAGLE:
				setEnableBeagle((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_EWAY__ENABLE_CVN:
				setEnableCvn((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_EWAY__REFUND_PWD:
				setRefundPwd((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_EWAY__TEST_MODE:
				setTestMode((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_EWAY__PAYMENT_GATEWAY_CONFIG_ID:
				setPaymentGatewayConfigId((PaymentGatewayConfig)newValue);
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
			case PaymentPackage.PAYMENT_GATEWAY_EWAY__CUSTOMER_ID:
				setCustomerId(CUSTOMER_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_EWAY__ENABLE_BEAGLE:
				setEnableBeagle(ENABLE_BEAGLE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_EWAY__ENABLE_CVN:
				setEnableCvn(ENABLE_CVN_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_EWAY__REFUND_PWD:
				setRefundPwd(REFUND_PWD_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_EWAY__TEST_MODE:
				setTestMode(TEST_MODE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_EWAY__PAYMENT_GATEWAY_CONFIG_ID:
				setPaymentGatewayConfigId((PaymentGatewayConfig)null);
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
			case PaymentPackage.PAYMENT_GATEWAY_EWAY__CUSTOMER_ID:
				return CUSTOMER_ID_EDEFAULT == null ? customerId != null : !CUSTOMER_ID_EDEFAULT.equals(customerId);
			case PaymentPackage.PAYMENT_GATEWAY_EWAY__ENABLE_BEAGLE:
				return ENABLE_BEAGLE_EDEFAULT == null ? enableBeagle != null : !ENABLE_BEAGLE_EDEFAULT.equals(enableBeagle);
			case PaymentPackage.PAYMENT_GATEWAY_EWAY__ENABLE_CVN:
				return ENABLE_CVN_EDEFAULT == null ? enableCvn != null : !ENABLE_CVN_EDEFAULT.equals(enableCvn);
			case PaymentPackage.PAYMENT_GATEWAY_EWAY__REFUND_PWD:
				return REFUND_PWD_EDEFAULT == null ? refundPwd != null : !REFUND_PWD_EDEFAULT.equals(refundPwd);
			case PaymentPackage.PAYMENT_GATEWAY_EWAY__TEST_MODE:
				return TEST_MODE_EDEFAULT == null ? testMode != null : !TEST_MODE_EDEFAULT.equals(testMode);
			case PaymentPackage.PAYMENT_GATEWAY_EWAY__PAYMENT_GATEWAY_CONFIG_ID:
				return paymentGatewayConfigId != null;
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
		result.append(" (customerId: ");
		result.append(customerId);
		result.append(", enableBeagle: ");
		result.append(enableBeagle);
		result.append(", enableCvn: ");
		result.append(enableCvn);
		result.append(", refundPwd: ");
		result.append(refundPwd);
		result.append(", testMode: ");
		result.append(testMode);
		result.append(')');
		return result.toString();
	}

} //PaymentGatewayEwayImpl
