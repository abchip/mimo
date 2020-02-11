/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.PaymentGatewayEway;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Gateway Eway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayEwayImpl#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayEwayImpl#getCustomerId <em>Customer Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayEwayImpl#getEnableBeagle <em>Enable Beagle</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayEwayImpl#getEnableCvn <em>Enable Cvn</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayEwayImpl#getRefundPwd <em>Refund Pwd</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayEwayImpl#getTestMode <em>Test Mode</em>}</li>
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
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_EWAY__CUSTOMER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerId(String newCustomerId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_EWAY__CUSTOMER_ID, newCustomerId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnableBeagle() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_EWAY__ENABLE_BEAGLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableBeagle(String newEnableBeagle) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_EWAY__ENABLE_BEAGLE, newEnableBeagle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnableCvn() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_EWAY__ENABLE_CVN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableCvn(String newEnableCvn) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_EWAY__ENABLE_CVN, newEnableCvn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentGatewayConfigId() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_EWAY__PAYMENT_GATEWAY_CONFIG_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayConfigId(String newPaymentGatewayConfigId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_EWAY__PAYMENT_GATEWAY_CONFIG_ID, newPaymentGatewayConfigId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRefundPwd() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_EWAY__REFUND_PWD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefundPwd(String newRefundPwd) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_EWAY__REFUND_PWD, newRefundPwd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestMode() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_EWAY__TEST_MODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestMode(String newTestMode) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_EWAY__TEST_MODE, newTestMode);
	}

} //PaymentGatewayEwayImpl
