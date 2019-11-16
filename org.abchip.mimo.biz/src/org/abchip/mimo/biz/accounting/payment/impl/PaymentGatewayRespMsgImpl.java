/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Gateway Resp Msg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayRespMsgImpl#getPaymentGatewayRespMsgId <em>Payment Gateway Resp Msg Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayRespMsgImpl#getPgrMessage <em>Pgr Message</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayRespMsgImpl#getPaymentGatewayResponseId <em>Payment Gateway Response Id</em>}</li>
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
	 * The default value of the '{@link #getPaymentGatewayRespMsgId() <em>Payment Gateway Resp Msg Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGatewayRespMsgId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_GATEWAY_RESP_MSG_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentGatewayRespMsgId() <em>Payment Gateway Resp Msg Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGatewayRespMsgId()
	 * @generated
	 * @ordered
	 */
	protected String paymentGatewayRespMsgId = PAYMENT_GATEWAY_RESP_MSG_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPgrMessage() <em>Pgr Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgrMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String PGR_MESSAGE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPgrMessage() <em>Pgr Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgrMessage()
	 * @generated
	 * @ordered
	 */
	protected String pgrMessage = PGR_MESSAGE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPaymentGatewayResponseId() <em>Payment Gateway Response Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGatewayResponseId()
	 * @generated
	 * @ordered
	 */
	protected PaymentGatewayResponse paymentGatewayResponseId;

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
		return paymentGatewayRespMsgId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayRespMsgId(String newPaymentGatewayRespMsgId) {
		String oldPaymentGatewayRespMsgId = paymentGatewayRespMsgId;
		paymentGatewayRespMsgId = newPaymentGatewayRespMsgId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_RESP_MSG__PAYMENT_GATEWAY_RESP_MSG_ID, oldPaymentGatewayRespMsgId, paymentGatewayRespMsgId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPgrMessage() {
		return pgrMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPgrMessage(String newPgrMessage) {
		String oldPgrMessage = pgrMessage;
		pgrMessage = newPgrMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_RESP_MSG__PGR_MESSAGE, oldPgrMessage, pgrMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGatewayResponse getPaymentGatewayResponseId() {
		if (paymentGatewayResponseId != null && ((EObject)paymentGatewayResponseId).eIsProxy()) {
			InternalEObject oldPaymentGatewayResponseId = (InternalEObject)paymentGatewayResponseId;
			paymentGatewayResponseId = (PaymentGatewayResponse)eResolveProxy(oldPaymentGatewayResponseId);
			if (paymentGatewayResponseId != oldPaymentGatewayResponseId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT_GATEWAY_RESP_MSG__PAYMENT_GATEWAY_RESPONSE_ID, oldPaymentGatewayResponseId, paymentGatewayResponseId));
			}
		}
		return paymentGatewayResponseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentGatewayResponse basicGetPaymentGatewayResponseId() {
		return paymentGatewayResponseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayResponseId(PaymentGatewayResponse newPaymentGatewayResponseId) {
		PaymentGatewayResponse oldPaymentGatewayResponseId = paymentGatewayResponseId;
		paymentGatewayResponseId = newPaymentGatewayResponseId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_RESP_MSG__PAYMENT_GATEWAY_RESPONSE_ID, oldPaymentGatewayResponseId, paymentGatewayResponseId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.PAYMENT_GATEWAY_RESP_MSG__PAYMENT_GATEWAY_RESP_MSG_ID:
				return getPaymentGatewayRespMsgId();
			case PaymentPackage.PAYMENT_GATEWAY_RESP_MSG__PGR_MESSAGE:
				return getPgrMessage();
			case PaymentPackage.PAYMENT_GATEWAY_RESP_MSG__PAYMENT_GATEWAY_RESPONSE_ID:
				if (resolve) return getPaymentGatewayResponseId();
				return basicGetPaymentGatewayResponseId();
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
			case PaymentPackage.PAYMENT_GATEWAY_RESP_MSG__PAYMENT_GATEWAY_RESP_MSG_ID:
				setPaymentGatewayRespMsgId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESP_MSG__PGR_MESSAGE:
				setPgrMessage((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESP_MSG__PAYMENT_GATEWAY_RESPONSE_ID:
				setPaymentGatewayResponseId((PaymentGatewayResponse)newValue);
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
			case PaymentPackage.PAYMENT_GATEWAY_RESP_MSG__PAYMENT_GATEWAY_RESP_MSG_ID:
				setPaymentGatewayRespMsgId(PAYMENT_GATEWAY_RESP_MSG_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESP_MSG__PGR_MESSAGE:
				setPgrMessage(PGR_MESSAGE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESP_MSG__PAYMENT_GATEWAY_RESPONSE_ID:
				setPaymentGatewayResponseId((PaymentGatewayResponse)null);
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
			case PaymentPackage.PAYMENT_GATEWAY_RESP_MSG__PAYMENT_GATEWAY_RESP_MSG_ID:
				return PAYMENT_GATEWAY_RESP_MSG_ID_EDEFAULT == null ? paymentGatewayRespMsgId != null : !PAYMENT_GATEWAY_RESP_MSG_ID_EDEFAULT.equals(paymentGatewayRespMsgId);
			case PaymentPackage.PAYMENT_GATEWAY_RESP_MSG__PGR_MESSAGE:
				return PGR_MESSAGE_EDEFAULT == null ? pgrMessage != null : !PGR_MESSAGE_EDEFAULT.equals(pgrMessage);
			case PaymentPackage.PAYMENT_GATEWAY_RESP_MSG__PAYMENT_GATEWAY_RESPONSE_ID:
				return paymentGatewayResponseId != null;
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
		result.append(" (paymentGatewayRespMsgId: ");
		result.append(paymentGatewayRespMsgId);
		result.append(", pgrMessage: ");
		result.append(pgrMessage);
		result.append(')');
		return result.toString();
	}

} //PaymentGatewayRespMsgImpl
