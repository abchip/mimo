/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.Payment#getPaymentId <em>Payment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.Payment#getActualCurrencyAmount <em>Actual Currency Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.Payment#getActualCurrencyUomId <em>Actual Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.Payment#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.Payment#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.Payment#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.Payment#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.Payment#getFinAccountTransId <em>Fin Account Trans Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.Payment#getOverrideGlAccountId <em>Override Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.Payment#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.Payment#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.Payment#getPaymentGatewayResponseId <em>Payment Gateway Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.Payment#getPaymentMethodId <em>Payment Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.Payment#getPaymentMethodTypeId <em>Payment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.Payment#getPaymentPreferenceId <em>Payment Preference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.Payment#getPaymentRefNum <em>Payment Ref Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.Payment#getPaymentTypeId <em>Payment Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.Payment#getRoleTypeIdTo <em>Role Type Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.Payment#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.Payment#getPaymentAttributes <em>Payment Attributes</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayment()
 * @model
 * @generated
 */
public interface Payment extends BizEntityTyped<PaymentType> {
	/**
	 * Returns the value of the '<em><b>Actual Currency Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Currency Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Currency Amount</em>' attribute.
	 * @see #setActualCurrencyAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayment_ActualCurrencyAmount()
	 * @model
	 * @generated
	 */
	BigDecimal getActualCurrencyAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.Payment#getActualCurrencyAmount <em>Actual Currency Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Currency Amount</em>' attribute.
	 * @see #getActualCurrencyAmount()
	 * @generated
	 */
	void setActualCurrencyAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Actual Currency Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Currency Uom Id</em>' attribute.
	 * @see #setActualCurrencyUomId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayment_ActualCurrencyUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getActualCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.Payment#getActualCurrencyUomId <em>Actual Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Currency Uom Id</em>' attribute.
	 * @see #getActualCurrencyUomId()
	 * @generated
	 */
	void setActualCurrencyUomId(String value);

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
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayment_Amount()
	 * @model
	 * @generated
	 */
	BigDecimal getAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.Payment#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayment_Comments()
	 * @model
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.Payment#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Currency Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #setCurrencyUomId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayment_CurrencyUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.Payment#getCurrencyUomId <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(String value);

	/**
	 * Returns the value of the '<em><b>Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Date</em>' attribute.
	 * @see #setEffectiveDate(Date)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayment_EffectiveDate()
	 * @model
	 * @generated
	 */
	Date getEffectiveDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.Payment#getEffectiveDate <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Date</em>' attribute.
	 * @see #getEffectiveDate()
	 * @generated
	 */
	void setEffectiveDate(Date value);

	/**
	 * Returns the value of the '<em><b>Party Id From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id From</em>' attribute.
	 * @see #setPartyIdFrom(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayment_PartyIdFrom()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.Payment#getPartyIdFrom <em>Party Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id From</em>' attribute.
	 * @see #getPartyIdFrom()
	 * @generated
	 */
	void setPartyIdFrom(String value);

	/**
	 * Returns the value of the '<em><b>Party Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id To</em>' attribute.
	 * @see #setPartyIdTo(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayment_PartyIdTo()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.Payment#getPartyIdTo <em>Party Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id To</em>' attribute.
	 * @see #getPartyIdTo()
	 * @generated
	 */
	void setPartyIdTo(String value);

	/**
	 * Returns the value of the '<em><b>Payment Preference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Preference Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Preference Id</em>' attribute.
	 * @see #setPaymentPreferenceId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayment_PaymentPreferenceId()
	 * @model annotation="mimo-ent-domain frame='OrderPaymentPreference'"
	 * @generated
	 */
	String getPaymentPreferenceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.Payment#getPaymentPreferenceId <em>Payment Preference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Preference Id</em>' attribute.
	 * @see #getPaymentPreferenceId()
	 * @generated
	 */
	void setPaymentPreferenceId(String value);

	/**
	 * Returns the value of the '<em><b>Payment Ref Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Ref Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Ref Num</em>' attribute.
	 * @see #setPaymentRefNum(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayment_PaymentRefNum()
	 * @model
	 * @generated
	 */
	String getPaymentRefNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.Payment#getPaymentRefNum <em>Payment Ref Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Ref Num</em>' attribute.
	 * @see #getPaymentRefNum()
	 * @generated
	 */
	void setPaymentRefNum(String value);

	/**
	 * Returns the value of the '<em><b>Role Type Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id To</em>' attribute.
	 * @see #setRoleTypeIdTo(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayment_RoleTypeIdTo()
	 * @model annotation="mimo-ent-domain frame='RoleType'"
	 * @generated
	 */
	String getRoleTypeIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.Payment#getRoleTypeIdTo <em>Role Type Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id To</em>' attribute.
	 * @see #getRoleTypeIdTo()
	 * @generated
	 */
	void setRoleTypeIdTo(String value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' attribute.
	 * @see #setStatusId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayment_StatusId()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.Payment#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

	/**
	 * Returns the value of the '<em><b>Payment Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Attributes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Attributes</em>' attribute list.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayment_PaymentAttributes()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PaymentAttribute'"
	 * @generated
	 */
	List<String> getPaymentAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='AcctgTrans' route='paymentId'"
	 * @generated
	 */
	List<String> acctgTranss();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Deduction' route='paymentId'"
	 * @generated
	 */
	List<String> deductions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PaymentApplication' route='paymentId'"
	 * @generated
	 */
	List<String> paymentApplications();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ReturnItemResponse' route='paymentId'"
	 * @generated
	 */
	List<String> returnItemResponses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PaymentApplication' route='toPaymentId'"
	 * @generated
	 */
	List<String> toPaymentApplications();

	/**
	 * Returns the value of the '<em><b>Payment Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Type Id</em>' attribute.
	 * @see #setPaymentTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayment_PaymentTypeId()
	 * @model annotation="mimo-ent-domain frame='PaymentType'"
	 * @generated
	 */
	String getPaymentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.Payment#getPaymentTypeId <em>Payment Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Type Id</em>' attribute.
	 * @see #getPaymentTypeId()
	 * @generated
	 */
	void setPaymentTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Payment Method Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Method Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method Type Id</em>' attribute.
	 * @see #setPaymentMethodTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayment_PaymentMethodTypeId()
	 * @model annotation="mimo-ent-domain frame='PaymentMethodType'"
	 * @generated
	 */
	String getPaymentMethodTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.Payment#getPaymentMethodTypeId <em>Payment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method Type Id</em>' attribute.
	 * @see #getPaymentMethodTypeId()
	 * @generated
	 */
	void setPaymentMethodTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Payment Method Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Method Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method Id</em>' attribute.
	 * @see #setPaymentMethodId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayment_PaymentMethodId()
	 * @model annotation="mimo-ent-domain frame='PaymentMethod'"
	 * @generated
	 */
	String getPaymentMethodId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.Payment#getPaymentMethodId <em>Payment Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method Id</em>' attribute.
	 * @see #getPaymentMethodId()
	 * @generated
	 */
	void setPaymentMethodId(String value);

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
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayment_PaymentGatewayResponseId()
	 * @model annotation="mimo-ent-domain frame='PaymentGatewayResponse'"
	 * @generated
	 */
	String getPaymentGatewayResponseId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.Payment#getPaymentGatewayResponseId <em>Payment Gateway Response Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Gateway Response Id</em>' attribute.
	 * @see #getPaymentGatewayResponseId()
	 * @generated
	 */
	void setPaymentGatewayResponseId(String value);

	/**
	 * Returns the value of the '<em><b>Fin Account Trans Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Account Trans Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Trans Id</em>' attribute.
	 * @see #setFinAccountTransId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayment_FinAccountTransId()
	 * @model annotation="mimo-ent-domain frame='FinAccountTrans'"
	 * @generated
	 */
	String getFinAccountTransId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.Payment#getFinAccountTransId <em>Fin Account Trans Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Trans Id</em>' attribute.
	 * @see #getFinAccountTransId()
	 * @generated
	 */
	void setFinAccountTransId(String value);

	/**
	 * Returns the value of the '<em><b>Override Gl Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Override Gl Account Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override Gl Account Id</em>' attribute.
	 * @see #setOverrideGlAccountId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayment_OverrideGlAccountId()
	 * @model annotation="mimo-ent-domain frame='GlAccount'"
	 * @generated
	 */
	String getOverrideGlAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.Payment#getOverrideGlAccountId <em>Override Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override Gl Account Id</em>' attribute.
	 * @see #getOverrideGlAccountId()
	 * @generated
	 */
	void setOverrideGlAccountId(String value);

	/**
	 * Returns the value of the '<em><b>Payment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Id</em>' attribute.
	 * @see #setPaymentId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayment_PaymentId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getPaymentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.Payment#getPaymentId <em>Payment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Id</em>' attribute.
	 * @see #getPaymentId()
	 * @generated
	 */
	void setPaymentId(String value);

} // Payment
