/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.PaymentGatewayRespMsg;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Gateway Resp Msg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayRespMsgImpl#getPaymentGatewayRespMsgId <em>Payment Gateway Resp Msg Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayRespMsgImpl#getPaymentGatewayResponseId <em>Payment Gateway Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayRespMsgImpl#getPgrMessage <em>Pgr Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentGatewayRespMsgImpl extends BizEntityImpl implements PaymentGatewayRespMsg {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentGatewayRespMsgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_GATEWAY_RESP_MSG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentGatewayRespMsgId() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESP_MSG__PAYMENT_GATEWAY_RESP_MSG_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayRespMsgId(String newPaymentGatewayRespMsgId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESP_MSG__PAYMENT_GATEWAY_RESP_MSG_ID, newPaymentGatewayRespMsgId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPgrMessage() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESP_MSG__PGR_MESSAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPgrMessage(String newPgrMessage) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESP_MSG__PGR_MESSAGE, newPgrMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGatewayResponse getPaymentGatewayResponseId() {
		return (PaymentGatewayResponse)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESP_MSG__PAYMENT_GATEWAY_RESPONSE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayResponseId(PaymentGatewayResponse newPaymentGatewayResponseId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESP_MSG__PAYMENT_GATEWAY_RESPONSE_ID, newPaymentGatewayResponseId);
	}

} //PaymentGatewayRespMsgImpl
