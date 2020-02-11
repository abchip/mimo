/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import java.math.BigDecimal;
import java.util.Date;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse;
import org.abchip.mimo.biz.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.order.OrderPaymentPreference;
import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getGatewayAvsResult <em>Gateway Avs Result</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getGatewayCode <em>Gateway Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getGatewayCvResult <em>Gateway Cv Result</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getGatewayFlag <em>Gateway Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getGatewayMessage <em>Gateway Message</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getGatewayScoreResult <em>Gateway Score Result</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getOrderPaymentPreferenceId <em>Order Payment Preference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getPaymentMethodId <em>Payment Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getPaymentMethodTypeId <em>Payment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getPaymentServiceTypeEnumId <em>Payment Service Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getReferenceNum <em>Reference Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#isResultBadCardNumber <em>Result Bad Card Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#isResultBadExpire <em>Result Bad Expire</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#isResultDeclined <em>Result Declined</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#isResultNsf <em>Result Nsf</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getSubReference <em>Sub Reference</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getTransCodeEnumId <em>Trans Code Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl#getTransactionDate <em>Transaction Date</em>}</li>
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
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__ALT_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAltReference(String newAltReference) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__ALT_REFERENCE, newAltReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAmount() {
		return (BigDecimal)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(BigDecimal newAmount) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__AMOUNT, newAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUomId() {
		return (Uom)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__CURRENCY_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(Uom newCurrencyUomId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__CURRENCY_UOM_ID, newCurrencyUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGatewayAvsResult() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__GATEWAY_AVS_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayAvsResult(String newGatewayAvsResult) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__GATEWAY_AVS_RESULT, newGatewayAvsResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGatewayCode() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__GATEWAY_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayCode(String newGatewayCode) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__GATEWAY_CODE, newGatewayCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGatewayCvResult() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__GATEWAY_CV_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayCvResult(String newGatewayCvResult) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__GATEWAY_CV_RESULT, newGatewayCvResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGatewayFlag() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__GATEWAY_FLAG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayFlag(String newGatewayFlag) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__GATEWAY_FLAG, newGatewayFlag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGatewayMessage() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__GATEWAY_MESSAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayMessage(String newGatewayMessage) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__GATEWAY_MESSAGE, newGatewayMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGatewayScoreResult() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__GATEWAY_SCORE_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayScoreResult(String newGatewayScoreResult) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__GATEWAY_SCORE_RESULT, newGatewayScoreResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderPaymentPreference getOrderPaymentPreferenceId() {
		return (OrderPaymentPreference)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__ORDER_PAYMENT_PREFERENCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderPaymentPreferenceId(OrderPaymentPreference newOrderPaymentPreferenceId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__ORDER_PAYMENT_PREFERENCE_ID, newOrderPaymentPreferenceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getPaymentServiceTypeEnumId() {
		return (Enumeration)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__PAYMENT_SERVICE_TYPE_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentServiceTypeEnumId(Enumeration newPaymentServiceTypeEnumId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__PAYMENT_SERVICE_TYPE_ENUM_ID, newPaymentServiceTypeEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReferenceNum() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__REFERENCE_NUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceNum(String newReferenceNum) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__REFERENCE_NUM, newReferenceNum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isResultBadCardNumber() {
		return (Boolean)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__RESULT_BAD_CARD_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultBadCardNumber(boolean newResultBadCardNumber) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__RESULT_BAD_CARD_NUMBER, newResultBadCardNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isResultBadExpire() {
		return (Boolean)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__RESULT_BAD_EXPIRE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultBadExpire(boolean newResultBadExpire) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__RESULT_BAD_EXPIRE, newResultBadExpire);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isResultDeclined() {
		return (Boolean)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__RESULT_DECLINED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultDeclined(boolean newResultDeclined) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__RESULT_DECLINED, newResultDeclined);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isResultNsf() {
		return (Boolean)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__RESULT_NSF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultNsf(boolean newResultNsf) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__RESULT_NSF, newResultNsf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubReference() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__SUB_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubReference(String newSubReference) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__SUB_REFERENCE, newSubReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getTransCodeEnumId() {
		return (Enumeration)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__TRANS_CODE_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransCodeEnumId(Enumeration newTransCodeEnumId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__TRANS_CODE_ENUM_ID, newTransCodeEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTransactionDate() {
		return (Date)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__TRANSACTION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionDate(Date newTransactionDate) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__TRANSACTION_DATE, newTransactionDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethodType getPaymentMethodTypeId() {
		return (PaymentMethodType)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__PAYMENT_METHOD_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodTypeId(PaymentMethodType newPaymentMethodTypeId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__PAYMENT_METHOD_TYPE_ID, newPaymentMethodTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethod getPaymentMethodId() {
		return (PaymentMethod)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__PAYMENT_METHOD_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodId(PaymentMethod newPaymentMethodId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__PAYMENT_METHOD_ID, newPaymentMethodId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentGatewayResponseId() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__PAYMENT_GATEWAY_RESPONSE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayResponseId(String newPaymentGatewayResponseId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_RESPONSE__PAYMENT_GATEWAY_RESPONSE_ID, newPaymentGatewayResponseId);
	}

} //PaymentGatewayResponseImpl
