/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.order.order.OrderPaymentPreference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Gateway Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getPaymentGatewayResponseId <em>Payment Gateway Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getAltReference <em>Alt Reference</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getGatewayAvsResult <em>Gateway Avs Result</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getGatewayCode <em>Gateway Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getGatewayCvResult <em>Gateway Cv Result</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getGatewayFlag <em>Gateway Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getGatewayMessage <em>Gateway Message</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getGatewayScoreResult <em>Gateway Score Result</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getOrderPaymentPreferenceId <em>Order Payment Preference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getPaymentMethodId <em>Payment Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getPaymentMethodTypeId <em>Payment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getPaymentServiceTypeEnumId <em>Payment Service Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getReferenceNum <em>Reference Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#isResultBadCardNumber <em>Result Bad Card Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#isResultBadExpire <em>Result Bad Expire</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#isResultDeclined <em>Result Declined</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#isResultNsf <em>Result Nsf</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getSubReference <em>Sub Reference</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getTransCodeEnumId <em>Trans Code Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getTransactionDate <em>Transaction Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayResponse()
 * @model
 * @generated
 */
public interface PaymentGatewayResponse extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Alt Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt Reference</em>' attribute.
	 * @see #setAltReference(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayResponse_AltReference()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getAltReference();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getAltReference <em>Alt Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Reference</em>' attribute.
	 * @see #getAltReference()
	 * @generated
	 */
	void setAltReference(String value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayResponse_Amount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom Id</em>' reference.
	 * @see #setCurrencyUomId(Uom)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayResponse_CurrencyUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getCurrencyUomId <em>Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' reference.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Gateway Avs Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway Avs Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Avs Result</em>' attribute.
	 * @see #setGatewayAvsResult(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayResponse_GatewayAvsResult()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getGatewayAvsResult();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getGatewayAvsResult <em>Gateway Avs Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Avs Result</em>' attribute.
	 * @see #getGatewayAvsResult()
	 * @generated
	 */
	void setGatewayAvsResult(String value);

	/**
	 * Returns the value of the '<em><b>Gateway Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Code</em>' attribute.
	 * @see #setGatewayCode(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayResponse_GatewayCode()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getGatewayCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getGatewayCode <em>Gateway Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Code</em>' attribute.
	 * @see #getGatewayCode()
	 * @generated
	 */
	void setGatewayCode(String value);

	/**
	 * Returns the value of the '<em><b>Gateway Cv Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway Cv Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Cv Result</em>' attribute.
	 * @see #setGatewayCvResult(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayResponse_GatewayCvResult()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getGatewayCvResult();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getGatewayCvResult <em>Gateway Cv Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Cv Result</em>' attribute.
	 * @see #getGatewayCvResult()
	 * @generated
	 */
	void setGatewayCvResult(String value);

	/**
	 * Returns the value of the '<em><b>Gateway Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Flag</em>' attribute.
	 * @see #setGatewayFlag(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayResponse_GatewayFlag()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getGatewayFlag();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getGatewayFlag <em>Gateway Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Flag</em>' attribute.
	 * @see #getGatewayFlag()
	 * @generated
	 */
	void setGatewayFlag(String value);

	/**
	 * Returns the value of the '<em><b>Gateway Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Message</em>' attribute.
	 * @see #setGatewayMessage(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayResponse_GatewayMessage()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getGatewayMessage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getGatewayMessage <em>Gateway Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Message</em>' attribute.
	 * @see #getGatewayMessage()
	 * @generated
	 */
	void setGatewayMessage(String value);

	/**
	 * Returns the value of the '<em><b>Gateway Score Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway Score Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Score Result</em>' attribute.
	 * @see #setGatewayScoreResult(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayResponse_GatewayScoreResult()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getGatewayScoreResult();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getGatewayScoreResult <em>Gateway Score Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Score Result</em>' attribute.
	 * @see #getGatewayScoreResult()
	 * @generated
	 */
	void setGatewayScoreResult(String value);

	/**
	 * Returns the value of the '<em><b>Order Payment Preference Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Payment Preference Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Payment Preference Id</em>' reference.
	 * @see #setOrderPaymentPreferenceId(OrderPaymentPreference)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayResponse_OrderPaymentPreferenceId()
	 * @model keys="orderPaymentPreferenceId"
	 * @generated
	 */
	OrderPaymentPreference getOrderPaymentPreferenceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getOrderPaymentPreferenceId <em>Order Payment Preference Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Payment Preference Id</em>' reference.
	 * @see #getOrderPaymentPreferenceId()
	 * @generated
	 */
	void setOrderPaymentPreferenceId(OrderPaymentPreference value);

	/**
	 * Returns the value of the '<em><b>Payment Service Type Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Service Type Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Service Type Enum Id</em>' reference.
	 * @see #setPaymentServiceTypeEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayResponse_PaymentServiceTypeEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getPaymentServiceTypeEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getPaymentServiceTypeEnumId <em>Payment Service Type Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Service Type Enum Id</em>' reference.
	 * @see #getPaymentServiceTypeEnumId()
	 * @generated
	 */
	void setPaymentServiceTypeEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Reference Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Num</em>' attribute.
	 * @see #setReferenceNum(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayResponse_ReferenceNum()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getReferenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getReferenceNum <em>Reference Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Num</em>' attribute.
	 * @see #getReferenceNum()
	 * @generated
	 */
	void setReferenceNum(String value);

	/**
	 * Returns the value of the '<em><b>Result Bad Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Bad Card Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Bad Card Number</em>' attribute.
	 * @see #setResultBadCardNumber(boolean)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayResponse_ResultBadCardNumber()
	 * @model
	 * @generated
	 */
	boolean isResultBadCardNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#isResultBadCardNumber <em>Result Bad Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Bad Card Number</em>' attribute.
	 * @see #isResultBadCardNumber()
	 * @generated
	 */
	void setResultBadCardNumber(boolean value);

	/**
	 * Returns the value of the '<em><b>Result Bad Expire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Bad Expire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Bad Expire</em>' attribute.
	 * @see #setResultBadExpire(boolean)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayResponse_ResultBadExpire()
	 * @model
	 * @generated
	 */
	boolean isResultBadExpire();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#isResultBadExpire <em>Result Bad Expire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Bad Expire</em>' attribute.
	 * @see #isResultBadExpire()
	 * @generated
	 */
	void setResultBadExpire(boolean value);

	/**
	 * Returns the value of the '<em><b>Result Declined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Declined</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Declined</em>' attribute.
	 * @see #setResultDeclined(boolean)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayResponse_ResultDeclined()
	 * @model
	 * @generated
	 */
	boolean isResultDeclined();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#isResultDeclined <em>Result Declined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Declined</em>' attribute.
	 * @see #isResultDeclined()
	 * @generated
	 */
	void setResultDeclined(boolean value);

	/**
	 * Returns the value of the '<em><b>Result Nsf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Nsf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Nsf</em>' attribute.
	 * @see #setResultNsf(boolean)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayResponse_ResultNsf()
	 * @model
	 * @generated
	 */
	boolean isResultNsf();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#isResultNsf <em>Result Nsf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Nsf</em>' attribute.
	 * @see #isResultNsf()
	 * @generated
	 */
	void setResultNsf(boolean value);

	/**
	 * Returns the value of the '<em><b>Sub Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Reference</em>' attribute.
	 * @see #setSubReference(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayResponse_SubReference()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getSubReference();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getSubReference <em>Sub Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Reference</em>' attribute.
	 * @see #getSubReference()
	 * @generated
	 */
	void setSubReference(String value);

	/**
	 * Returns the value of the '<em><b>Trans Code Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trans Code Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trans Code Enum Id</em>' reference.
	 * @see #setTransCodeEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayResponse_TransCodeEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getTransCodeEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getTransCodeEnumId <em>Trans Code Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trans Code Enum Id</em>' reference.
	 * @see #getTransCodeEnumId()
	 * @generated
	 */
	void setTransCodeEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Transaction Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Date</em>' attribute.
	 * @see #setTransactionDate(Date)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayResponse_TransactionDate()
	 * @model
	 * @generated
	 */
	Date getTransactionDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getTransactionDate <em>Transaction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Date</em>' attribute.
	 * @see #getTransactionDate()
	 * @generated
	 */
	void setTransactionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Payment Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Method Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method Type Id</em>' reference.
	 * @see #setPaymentMethodTypeId(PaymentMethodType)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayResponse_PaymentMethodTypeId()
	 * @model keys="paymentMethodTypeId"
	 * @generated
	 */
	PaymentMethodType getPaymentMethodTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getPaymentMethodTypeId <em>Payment Method Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method Type Id</em>' reference.
	 * @see #getPaymentMethodTypeId()
	 * @generated
	 */
	void setPaymentMethodTypeId(PaymentMethodType value);

	/**
	 * Returns the value of the '<em><b>Payment Method Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Method Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method Id</em>' reference.
	 * @see #setPaymentMethodId(PaymentMethod)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayResponse_PaymentMethodId()
	 * @model keys="paymentMethodId"
	 * @generated
	 */
	PaymentMethod getPaymentMethodId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getPaymentMethodId <em>Payment Method Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method Id</em>' reference.
	 * @see #getPaymentMethodId()
	 * @generated
	 */
	void setPaymentMethodId(PaymentMethod value);

	/**
	 * Returns the value of the '<em><b>Payment Gateway Response Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Gateway Response Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Gateway Response Id</em>' attribute.
	 * @see #setPaymentGatewayResponseId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayResponse_PaymentGatewayResponseId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPaymentGatewayResponseId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getPaymentGatewayResponseId <em>Payment Gateway Response Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Gateway Response Id</em>' attribute.
	 * @see #getPaymentGatewayResponseId()
	 * @generated
	 */
	void setPaymentGatewayResponseId(String value);

} // PaymentGatewayResponse
