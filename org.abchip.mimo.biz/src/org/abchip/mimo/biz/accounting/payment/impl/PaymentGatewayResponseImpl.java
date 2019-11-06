/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse;
import org.abchip.mimo.biz.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.order.OrderPaymentPreference;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Gateway Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getPaymentGatewayResponseId <em>Payment Gateway Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getAltReference <em>Alt Reference</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getGatewayAvsResult <em>Gateway Avs Result</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getGatewayCode <em>Gateway Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getGatewayCvResult <em>Gateway Cv Result</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getGatewayFlag <em>Gateway Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getGatewayMessage <em>Gateway Message</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getGatewayScoreResult <em>Gateway Score Result</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getReferenceNum <em>Reference Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#isResultBadCardNumber <em>Result Bad Card Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#isResultBadExpire <em>Result Bad Expire</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#isResultDeclined <em>Result Declined</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#isResultNsf <em>Result Nsf</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getSubReference <em>Sub Reference</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getTransactionDate <em>Transaction Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getPaymentServiceTypeEnumId <em>Payment Service Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getTransCodeEnumId <em>Trans Code Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getOrderPaymentPreferenceId <em>Order Payment Preference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getPaymentMethodTypeId <em>Payment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getPaymentMethodId <em>Payment Method Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentGatewayResponseImpl extends BizEntityImpl implements PaymentGatewayResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getPaymentGatewayResponseId() <em>Payment Gateway Response Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGatewayResponseId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_GATEWAY_RESPONSE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPaymentGatewayResponseId() <em>Payment Gateway Response Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGatewayResponseId()
	 * @generated
	 * @ordered
	 */
	protected String paymentGatewayResponseId = PAYMENT_GATEWAY_RESPONSE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getAltReference() <em>Alt Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ALT_REFERENCE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAltReference() <em>Alt Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltReference()
	 * @generated
	 * @ordered
	 */
	protected String altReference = ALT_REFERENCE_EDEFAULT;
	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AMOUNT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal amount = AMOUNT_EDEFAULT;
	/**
	 * The default value of the '{@link #getGatewayAvsResult() <em>Gateway Avs Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayAvsResult()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEWAY_AVS_RESULT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGatewayAvsResult() <em>Gateway Avs Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayAvsResult()
	 * @generated
	 * @ordered
	 */
	protected String gatewayAvsResult = GATEWAY_AVS_RESULT_EDEFAULT;
	/**
	 * The default value of the '{@link #getGatewayCode() <em>Gateway Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayCode()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEWAY_CODE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGatewayCode() <em>Gateway Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayCode()
	 * @generated
	 * @ordered
	 */
	protected String gatewayCode = GATEWAY_CODE_EDEFAULT;
	/**
	 * The default value of the '{@link #getGatewayCvResult() <em>Gateway Cv Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayCvResult()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEWAY_CV_RESULT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGatewayCvResult() <em>Gateway Cv Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayCvResult()
	 * @generated
	 * @ordered
	 */
	protected String gatewayCvResult = GATEWAY_CV_RESULT_EDEFAULT;
	/**
	 * The default value of the '{@link #getGatewayFlag() <em>Gateway Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayFlag()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEWAY_FLAG_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGatewayFlag() <em>Gateway Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayFlag()
	 * @generated
	 * @ordered
	 */
	protected String gatewayFlag = GATEWAY_FLAG_EDEFAULT;
	/**
	 * The default value of the '{@link #getGatewayMessage() <em>Gateway Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEWAY_MESSAGE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGatewayMessage() <em>Gateway Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayMessage()
	 * @generated
	 * @ordered
	 */
	protected String gatewayMessage = GATEWAY_MESSAGE_EDEFAULT;
	/**
	 * The default value of the '{@link #getGatewayScoreResult() <em>Gateway Score Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayScoreResult()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEWAY_SCORE_RESULT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGatewayScoreResult() <em>Gateway Score Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayScoreResult()
	 * @generated
	 * @ordered
	 */
	protected String gatewayScoreResult = GATEWAY_SCORE_RESULT_EDEFAULT;
	/**
	 * The default value of the '{@link #getReferenceNum() <em>Reference Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceNum()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_NUM_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getReferenceNum() <em>Reference Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceNum()
	 * @generated
	 * @ordered
	 */
	protected String referenceNum = REFERENCE_NUM_EDEFAULT;
	/**
	 * The default value of the '{@link #isResultBadCardNumber() <em>Result Bad Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResultBadCardNumber()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESULT_BAD_CARD_NUMBER_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isResultBadCardNumber() <em>Result Bad Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResultBadCardNumber()
	 * @generated
	 * @ordered
	 */
	protected boolean resultBadCardNumber = RESULT_BAD_CARD_NUMBER_EDEFAULT;
	/**
	 * The default value of the '{@link #isResultBadExpire() <em>Result Bad Expire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResultBadExpire()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESULT_BAD_EXPIRE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isResultBadExpire() <em>Result Bad Expire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResultBadExpire()
	 * @generated
	 * @ordered
	 */
	protected boolean resultBadExpire = RESULT_BAD_EXPIRE_EDEFAULT;
	/**
	 * The default value of the '{@link #isResultDeclined() <em>Result Declined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResultDeclined()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESULT_DECLINED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isResultDeclined() <em>Result Declined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResultDeclined()
	 * @generated
	 * @ordered
	 */
	protected boolean resultDeclined = RESULT_DECLINED_EDEFAULT;
	/**
	 * The default value of the '{@link #isResultNsf() <em>Result Nsf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResultNsf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESULT_NSF_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isResultNsf() <em>Result Nsf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResultNsf()
	 * @generated
	 * @ordered
	 */
	protected boolean resultNsf = RESULT_NSF_EDEFAULT;
	/**
	 * The default value of the '{@link #getSubReference() <em>Sub Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubReference()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_REFERENCE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSubReference() <em>Sub Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubReference()
	 * @generated
	 * @ordered
	 */
	protected String subReference = SUB_REFERENCE_EDEFAULT;
	/**
	 * The default value of the '{@link #getTransactionDate() <em>Transaction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date TRANSACTION_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTransactionDate() <em>Transaction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionDate()
	 * @generated
	 * @ordered
	 */
	protected Date transactionDate = TRANSACTION_DATE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPaymentServiceTypeEnumId() <em>Payment Service Type Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentServiceTypeEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration paymentServiceTypeEnumId;
	/**
	 * The cached value of the '{@link #getTransCodeEnumId() <em>Trans Code Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransCodeEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration transCodeEnumId;
	/**
	 * The cached value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom currencyUomId;
	/**
	 * The cached value of the '{@link #getOrderPaymentPreferenceId() <em>Order Payment Preference Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderPaymentPreferenceId()
	 * @generated
	 * @ordered
	 */
	protected OrderPaymentPreference orderPaymentPreferenceId;
	/**
	 * The cached value of the '{@link #getPaymentMethodTypeId() <em>Payment Method Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected PaymentMethodType paymentMethodTypeId;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentGatewayResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAltReference() {
		return altReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAltReference(String newAltReference) {
		altReference = newAltReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(BigDecimal newAmount) {
		amount = newAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUomId() {
		if (currencyUomId != null && ((EObject)currencyUomId).eIsProxy()) {
			InternalEObject oldCurrencyUomId = (InternalEObject)currencyUomId;
			currencyUomId = (Uom)eResolveProxy(oldCurrencyUomId);
			if (currencyUomId != oldCurrencyUomId) {
			}
		}
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetCurrencyUomId() {
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(Uom newCurrencyUomId) {
		currencyUomId = newCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGatewayAvsResult() {
		return gatewayAvsResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayAvsResult(String newGatewayAvsResult) {
		gatewayAvsResult = newGatewayAvsResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGatewayCode() {
		return gatewayCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayCode(String newGatewayCode) {
		gatewayCode = newGatewayCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGatewayCvResult() {
		return gatewayCvResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayCvResult(String newGatewayCvResult) {
		gatewayCvResult = newGatewayCvResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGatewayFlag() {
		return gatewayFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayFlag(String newGatewayFlag) {
		gatewayFlag = newGatewayFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGatewayMessage() {
		return gatewayMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayMessage(String newGatewayMessage) {
		gatewayMessage = newGatewayMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGatewayScoreResult() {
		return gatewayScoreResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayScoreResult(String newGatewayScoreResult) {
		gatewayScoreResult = newGatewayScoreResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderPaymentPreference getOrderPaymentPreferenceId() {
		if (orderPaymentPreferenceId != null && ((EObject)orderPaymentPreferenceId).eIsProxy()) {
			InternalEObject oldOrderPaymentPreferenceId = (InternalEObject)orderPaymentPreferenceId;
			orderPaymentPreferenceId = (OrderPaymentPreference)eResolveProxy(oldOrderPaymentPreferenceId);
			if (orderPaymentPreferenceId != oldOrderPaymentPreferenceId) {
			}
		}
		return orderPaymentPreferenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderPaymentPreference basicGetOrderPaymentPreferenceId() {
		return orderPaymentPreferenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderPaymentPreferenceId(OrderPaymentPreference newOrderPaymentPreferenceId) {
		orderPaymentPreferenceId = newOrderPaymentPreferenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getPaymentServiceTypeEnumId() {
		if (paymentServiceTypeEnumId != null && ((EObject)paymentServiceTypeEnumId).eIsProxy()) {
			InternalEObject oldPaymentServiceTypeEnumId = (InternalEObject)paymentServiceTypeEnumId;
			paymentServiceTypeEnumId = (Enumeration)eResolveProxy(oldPaymentServiceTypeEnumId);
			if (paymentServiceTypeEnumId != oldPaymentServiceTypeEnumId) {
			}
		}
		return paymentServiceTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetPaymentServiceTypeEnumId() {
		return paymentServiceTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentServiceTypeEnumId(Enumeration newPaymentServiceTypeEnumId) {
		paymentServiceTypeEnumId = newPaymentServiceTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReferenceNum() {
		return referenceNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceNum(String newReferenceNum) {
		referenceNum = newReferenceNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isResultBadCardNumber() {
		return resultBadCardNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultBadCardNumber(boolean newResultBadCardNumber) {
		resultBadCardNumber = newResultBadCardNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isResultBadExpire() {
		return resultBadExpire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultBadExpire(boolean newResultBadExpire) {
		resultBadExpire = newResultBadExpire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isResultDeclined() {
		return resultDeclined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultDeclined(boolean newResultDeclined) {
		resultDeclined = newResultDeclined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isResultNsf() {
		return resultNsf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultNsf(boolean newResultNsf) {
		resultNsf = newResultNsf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubReference() {
		return subReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubReference(String newSubReference) {
		subReference = newSubReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getTransCodeEnumId() {
		if (transCodeEnumId != null && ((EObject)transCodeEnumId).eIsProxy()) {
			InternalEObject oldTransCodeEnumId = (InternalEObject)transCodeEnumId;
			transCodeEnumId = (Enumeration)eResolveProxy(oldTransCodeEnumId);
			if (transCodeEnumId != oldTransCodeEnumId) {
			}
		}
		return transCodeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetTransCodeEnumId() {
		return transCodeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransCodeEnumId(Enumeration newTransCodeEnumId) {
		transCodeEnumId = newTransCodeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTransactionDate() {
		return transactionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionDate(Date newTransactionDate) {
		transactionDate = newTransactionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> paymentGatewayRespMsgs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> payments() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethodType getPaymentMethodTypeId() {
		if (paymentMethodTypeId != null && ((EObject)paymentMethodTypeId).eIsProxy()) {
			InternalEObject oldPaymentMethodTypeId = (InternalEObject)paymentMethodTypeId;
			paymentMethodTypeId = (PaymentMethodType)eResolveProxy(oldPaymentMethodTypeId);
			if (paymentMethodTypeId != oldPaymentMethodTypeId) {
			}
		}
		return paymentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMethodType basicGetPaymentMethodTypeId() {
		return paymentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodTypeId(PaymentMethodType newPaymentMethodTypeId) {
		paymentMethodTypeId = newPaymentMethodTypeId;
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
		paymentMethodId = newPaymentMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentGatewayResponseId() {
		return paymentGatewayResponseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayResponseId(String newPaymentGatewayResponseId) {
		paymentGatewayResponseId = newPaymentGatewayResponseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__PAYMENT_GATEWAY_RESPONSE_ID:
				return getPaymentGatewayResponseId();
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__ALT_REFERENCE:
				return getAltReference();
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__AMOUNT:
				return getAmount();
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__GATEWAY_AVS_RESULT:
				return getGatewayAvsResult();
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__GATEWAY_CODE:
				return getGatewayCode();
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__GATEWAY_CV_RESULT:
				return getGatewayCvResult();
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__GATEWAY_FLAG:
				return getGatewayFlag();
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__GATEWAY_MESSAGE:
				return getGatewayMessage();
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__GATEWAY_SCORE_RESULT:
				return getGatewayScoreResult();
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__REFERENCE_NUM:
				return getReferenceNum();
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__RESULT_BAD_CARD_NUMBER:
				return isResultBadCardNumber();
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__RESULT_BAD_EXPIRE:
				return isResultBadExpire();
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__RESULT_DECLINED:
				return isResultDeclined();
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__RESULT_NSF:
				return isResultNsf();
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__SUB_REFERENCE:
				return getSubReference();
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__TRANSACTION_DATE:
				return getTransactionDate();
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__PAYMENT_SERVICE_TYPE_ENUM_ID:
				if (resolve) return getPaymentServiceTypeEnumId();
				return basicGetPaymentServiceTypeEnumId();
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__TRANS_CODE_ENUM_ID:
				if (resolve) return getTransCodeEnumId();
				return basicGetTransCodeEnumId();
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__CURRENCY_UOM_ID:
				if (resolve) return getCurrencyUomId();
				return basicGetCurrencyUomId();
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__ORDER_PAYMENT_PREFERENCE_ID:
				if (resolve) return getOrderPaymentPreferenceId();
				return basicGetOrderPaymentPreferenceId();
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__PAYMENT_METHOD_TYPE_ID:
				if (resolve) return getPaymentMethodTypeId();
				return basicGetPaymentMethodTypeId();
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__PAYMENT_METHOD_ID:
				if (resolve) return getPaymentMethodId();
				return basicGetPaymentMethodId();
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
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__PAYMENT_GATEWAY_RESPONSE_ID:
				setPaymentGatewayResponseId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__ALT_REFERENCE:
				setAltReference((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__GATEWAY_AVS_RESULT:
				setGatewayAvsResult((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__GATEWAY_CODE:
				setGatewayCode((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__GATEWAY_CV_RESULT:
				setGatewayCvResult((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__GATEWAY_FLAG:
				setGatewayFlag((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__GATEWAY_MESSAGE:
				setGatewayMessage((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__GATEWAY_SCORE_RESULT:
				setGatewayScoreResult((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__REFERENCE_NUM:
				setReferenceNum((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__RESULT_BAD_CARD_NUMBER:
				setResultBadCardNumber((Boolean)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__RESULT_BAD_EXPIRE:
				setResultBadExpire((Boolean)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__RESULT_DECLINED:
				setResultDeclined((Boolean)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__RESULT_NSF:
				setResultNsf((Boolean)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__SUB_REFERENCE:
				setSubReference((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__TRANSACTION_DATE:
				setTransactionDate((Date)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__PAYMENT_SERVICE_TYPE_ENUM_ID:
				setPaymentServiceTypeEnumId((Enumeration)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__TRANS_CODE_ENUM_ID:
				setTransCodeEnumId((Enumeration)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__ORDER_PAYMENT_PREFERENCE_ID:
				setOrderPaymentPreferenceId((OrderPaymentPreference)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__PAYMENT_METHOD_TYPE_ID:
				setPaymentMethodTypeId((PaymentMethodType)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__PAYMENT_METHOD_ID:
				setPaymentMethodId((PaymentMethod)newValue);
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
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__PAYMENT_GATEWAY_RESPONSE_ID:
				setPaymentGatewayResponseId(PAYMENT_GATEWAY_RESPONSE_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__ALT_REFERENCE:
				setAltReference(ALT_REFERENCE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__GATEWAY_AVS_RESULT:
				setGatewayAvsResult(GATEWAY_AVS_RESULT_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__GATEWAY_CODE:
				setGatewayCode(GATEWAY_CODE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__GATEWAY_CV_RESULT:
				setGatewayCvResult(GATEWAY_CV_RESULT_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__GATEWAY_FLAG:
				setGatewayFlag(GATEWAY_FLAG_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__GATEWAY_MESSAGE:
				setGatewayMessage(GATEWAY_MESSAGE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__GATEWAY_SCORE_RESULT:
				setGatewayScoreResult(GATEWAY_SCORE_RESULT_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__REFERENCE_NUM:
				setReferenceNum(REFERENCE_NUM_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__RESULT_BAD_CARD_NUMBER:
				setResultBadCardNumber(RESULT_BAD_CARD_NUMBER_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__RESULT_BAD_EXPIRE:
				setResultBadExpire(RESULT_BAD_EXPIRE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__RESULT_DECLINED:
				setResultDeclined(RESULT_DECLINED_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__RESULT_NSF:
				setResultNsf(RESULT_NSF_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__SUB_REFERENCE:
				setSubReference(SUB_REFERENCE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__TRANSACTION_DATE:
				setTransactionDate(TRANSACTION_DATE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__PAYMENT_SERVICE_TYPE_ENUM_ID:
				setPaymentServiceTypeEnumId((Enumeration)null);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__TRANS_CODE_ENUM_ID:
				setTransCodeEnumId((Enumeration)null);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)null);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__ORDER_PAYMENT_PREFERENCE_ID:
				setOrderPaymentPreferenceId((OrderPaymentPreference)null);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__PAYMENT_METHOD_TYPE_ID:
				setPaymentMethodTypeId((PaymentMethodType)null);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__PAYMENT_METHOD_ID:
				setPaymentMethodId((PaymentMethod)null);
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
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__PAYMENT_GATEWAY_RESPONSE_ID:
				return PAYMENT_GATEWAY_RESPONSE_ID_EDEFAULT == null ? paymentGatewayResponseId != null : !PAYMENT_GATEWAY_RESPONSE_ID_EDEFAULT.equals(paymentGatewayResponseId);
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__ALT_REFERENCE:
				return ALT_REFERENCE_EDEFAULT == null ? altReference != null : !ALT_REFERENCE_EDEFAULT.equals(altReference);
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__GATEWAY_AVS_RESULT:
				return GATEWAY_AVS_RESULT_EDEFAULT == null ? gatewayAvsResult != null : !GATEWAY_AVS_RESULT_EDEFAULT.equals(gatewayAvsResult);
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__GATEWAY_CODE:
				return GATEWAY_CODE_EDEFAULT == null ? gatewayCode != null : !GATEWAY_CODE_EDEFAULT.equals(gatewayCode);
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__GATEWAY_CV_RESULT:
				return GATEWAY_CV_RESULT_EDEFAULT == null ? gatewayCvResult != null : !GATEWAY_CV_RESULT_EDEFAULT.equals(gatewayCvResult);
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__GATEWAY_FLAG:
				return GATEWAY_FLAG_EDEFAULT == null ? gatewayFlag != null : !GATEWAY_FLAG_EDEFAULT.equals(gatewayFlag);
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__GATEWAY_MESSAGE:
				return GATEWAY_MESSAGE_EDEFAULT == null ? gatewayMessage != null : !GATEWAY_MESSAGE_EDEFAULT.equals(gatewayMessage);
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__GATEWAY_SCORE_RESULT:
				return GATEWAY_SCORE_RESULT_EDEFAULT == null ? gatewayScoreResult != null : !GATEWAY_SCORE_RESULT_EDEFAULT.equals(gatewayScoreResult);
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__REFERENCE_NUM:
				return REFERENCE_NUM_EDEFAULT == null ? referenceNum != null : !REFERENCE_NUM_EDEFAULT.equals(referenceNum);
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__RESULT_BAD_CARD_NUMBER:
				return resultBadCardNumber != RESULT_BAD_CARD_NUMBER_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__RESULT_BAD_EXPIRE:
				return resultBadExpire != RESULT_BAD_EXPIRE_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__RESULT_DECLINED:
				return resultDeclined != RESULT_DECLINED_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__RESULT_NSF:
				return resultNsf != RESULT_NSF_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__SUB_REFERENCE:
				return SUB_REFERENCE_EDEFAULT == null ? subReference != null : !SUB_REFERENCE_EDEFAULT.equals(subReference);
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__TRANSACTION_DATE:
				return TRANSACTION_DATE_EDEFAULT == null ? transactionDate != null : !TRANSACTION_DATE_EDEFAULT.equals(transactionDate);
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__PAYMENT_SERVICE_TYPE_ENUM_ID:
				return paymentServiceTypeEnumId != null;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__TRANS_CODE_ENUM_ID:
				return transCodeEnumId != null;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__CURRENCY_UOM_ID:
				return currencyUomId != null;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__ORDER_PAYMENT_PREFERENCE_ID:
				return orderPaymentPreferenceId != null;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__PAYMENT_METHOD_TYPE_ID:
				return paymentMethodTypeId != null;
			case PaymentPackage.PAYMENT_GATEWAY_RESPONSE__PAYMENT_METHOD_ID:
				return paymentMethodId != null;
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
		result.append(" (paymentGatewayResponseId: ");
		result.append(paymentGatewayResponseId);
		result.append(", altReference: ");
		result.append(altReference);
		result.append(", amount: ");
		result.append(amount);
		result.append(", gatewayAvsResult: ");
		result.append(gatewayAvsResult);
		result.append(", gatewayCode: ");
		result.append(gatewayCode);
		result.append(", gatewayCvResult: ");
		result.append(gatewayCvResult);
		result.append(", gatewayFlag: ");
		result.append(gatewayFlag);
		result.append(", gatewayMessage: ");
		result.append(gatewayMessage);
		result.append(", gatewayScoreResult: ");
		result.append(gatewayScoreResult);
		result.append(", referenceNum: ");
		result.append(referenceNum);
		result.append(", resultBadCardNumber: ");
		result.append(resultBadCardNumber);
		result.append(", resultBadExpire: ");
		result.append(resultBadExpire);
		result.append(", resultDeclined: ");
		result.append(resultDeclined);
		result.append(", resultNsf: ");
		result.append(resultNsf);
		result.append(", subReference: ");
		result.append(subReference);
		result.append(", transactionDate: ");
		result.append(transactionDate);
		result.append(')');
		return result.toString();
	}

} //PaymentGatewayResponseImpl
