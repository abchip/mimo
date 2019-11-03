/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.accounting.payment.Payment;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.accounting.payment.PaymentType;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getPaymentId <em>Payment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getActualCurrencyAmount <em>Actual Currency Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getActualCurrencyUomId <em>Actual Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getFinAccountTransId <em>Fin Account Trans Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getOverrideGlAccountId <em>Override Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getPaymentGatewayResponseId <em>Payment Gateway Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getPaymentMethodId <em>Payment Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getPaymentMethodTypeId <em>Payment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getPaymentPreferenceId <em>Payment Preference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getPaymentRefNum <em>Payment Ref Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getPaymentTypeId <em>Payment Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getRoleTypeIdTo <em>Role Type Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getPaymentAttributes <em>Payment Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentImpl extends BizEntityTypedImpl<PaymentType> implements Payment {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getPaymentId() <em>Payment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentId() <em>Payment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentId()
	 * @generated
	 * @ordered
	 */
	protected String paymentId = PAYMENT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getActualCurrencyAmount() <em>Actual Currency Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualCurrencyAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ACTUAL_CURRENCY_AMOUNT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getActualCurrencyAmount() <em>Actual Currency Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualCurrencyAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal actualCurrencyAmount = ACTUAL_CURRENCY_AMOUNT_EDEFAULT;
	/**
	 * The default value of the '{@link #getActualCurrencyUomId() <em>Actual Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTUAL_CURRENCY_UOM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getActualCurrencyUomId() <em>Actual Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected String actualCurrencyUomId = ACTUAL_CURRENCY_UOM_ID_EDEFAULT;
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
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;
	/**
	 * The default value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_UOM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected String currencyUomId = CURRENCY_UOM_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EFFECTIVE_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEffectiveDate() <em>Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected Date effectiveDate = EFFECTIVE_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getFinAccountTransId() <em>Fin Account Trans Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountTransId()
	 * @generated
	 * @ordered
	 */
	protected static final String FIN_ACCOUNT_TRANS_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFinAccountTransId() <em>Fin Account Trans Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountTransId()
	 * @generated
	 * @ordered
	 */
	protected String finAccountTransId = FIN_ACCOUNT_TRANS_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getOverrideGlAccountId() <em>Override Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String OVERRIDE_GL_ACCOUNT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOverrideGlAccountId() <em>Override Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected String overrideGlAccountId = OVERRIDE_GL_ACCOUNT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getPartyIdFrom() <em>Party Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_FROM_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPartyIdFrom() <em>Party Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdFrom()
	 * @generated
	 * @ordered
	 */
	protected String partyIdFrom = PARTY_ID_FROM_EDEFAULT;
	/**
	 * The default value of the '{@link #getPartyIdTo() <em>Party Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_TO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPartyIdTo() <em>Party Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdTo()
	 * @generated
	 * @ordered
	 */
	protected String partyIdTo = PARTY_ID_TO_EDEFAULT;
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
	 * The default value of the '{@link #getPaymentMethodId() <em>Payment Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_METHOD_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPaymentMethodId() <em>Payment Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodId()
	 * @generated
	 * @ordered
	 */
	protected String paymentMethodId = PAYMENT_METHOD_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getPaymentMethodTypeId() <em>Payment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_METHOD_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPaymentMethodTypeId() <em>Payment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected String paymentMethodTypeId = PAYMENT_METHOD_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getPaymentPreferenceId() <em>Payment Preference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentPreferenceId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_PREFERENCE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPaymentPreferenceId() <em>Payment Preference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentPreferenceId()
	 * @generated
	 * @ordered
	 */
	protected String paymentPreferenceId = PAYMENT_PREFERENCE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getPaymentRefNum() <em>Payment Ref Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentRefNum()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_REF_NUM_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPaymentRefNum() <em>Payment Ref Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentRefNum()
	 * @generated
	 * @ordered
	 */
	protected String paymentRefNum = PAYMENT_REF_NUM_EDEFAULT;
	/**
	 * The default value of the '{@link #getPaymentTypeId() <em>Payment Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPaymentTypeId() <em>Payment Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentTypeId()
	 * @generated
	 * @ordered
	 */
	protected String paymentTypeId = PAYMENT_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getRoleTypeIdTo() <em>Role Type Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TYPE_ID_TO_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRoleTypeIdTo() <em>Role Type Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdTo()
	 * @generated
	 * @ordered
	 */
	protected String roleTypeIdTo = ROLE_TYPE_ID_TO_EDEFAULT;
	/**
	 * The default value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected String statusId = STATUS_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPaymentAttributes() <em>Payment Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> paymentAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getActualCurrencyAmount() {
		return actualCurrencyAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualCurrencyAmount(BigDecimal newActualCurrencyAmount) {
		BigDecimal oldActualCurrencyAmount = actualCurrencyAmount;
		actualCurrencyAmount = newActualCurrencyAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT__ACTUAL_CURRENCY_AMOUNT, oldActualCurrencyAmount, actualCurrencyAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActualCurrencyUomId() {
		return actualCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualCurrencyUomId(String newActualCurrencyUomId) {
		String oldActualCurrencyUomId = actualCurrencyUomId;
		actualCurrencyUomId = newActualCurrencyUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT__ACTUAL_CURRENCY_UOM_ID, oldActualCurrencyUomId, actualCurrencyUomId));
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
		BigDecimal oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrencyUomId() {
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(String newCurrencyUomId) {
		String oldCurrencyUomId = currencyUomId;
		currencyUomId = newCurrencyUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEffectiveDate(Date newEffectiveDate) {
		Date oldEffectiveDate = effectiveDate;
		effectiveDate = newEffectiveDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT__EFFECTIVE_DATE, oldEffectiveDate, effectiveDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyIdFrom() {
		return partyIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdFrom(String newPartyIdFrom) {
		String oldPartyIdFrom = partyIdFrom;
		partyIdFrom = newPartyIdFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT__PARTY_ID_FROM, oldPartyIdFrom, partyIdFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyIdTo() {
		return partyIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdTo(String newPartyIdTo) {
		String oldPartyIdTo = partyIdTo;
		partyIdTo = newPartyIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT__PARTY_ID_TO, oldPartyIdTo, partyIdTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentPreferenceId() {
		return paymentPreferenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentPreferenceId(String newPaymentPreferenceId) {
		String oldPaymentPreferenceId = paymentPreferenceId;
		paymentPreferenceId = newPaymentPreferenceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT__PAYMENT_PREFERENCE_ID, oldPaymentPreferenceId, paymentPreferenceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentRefNum() {
		return paymentRefNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentRefNum(String newPaymentRefNum) {
		String oldPaymentRefNum = paymentRefNum;
		paymentRefNum = newPaymentRefNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT__PAYMENT_REF_NUM, oldPaymentRefNum, paymentRefNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleTypeIdTo() {
		return roleTypeIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdTo(String newRoleTypeIdTo) {
		String oldRoleTypeIdTo = roleTypeIdTo;
		roleTypeIdTo = newRoleTypeIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT__ROLE_TYPE_ID_TO, oldRoleTypeIdTo, roleTypeIdTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(String newStatusId) {
		String oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getPaymentAttributes() {
		if (paymentAttributes == null) {
			paymentAttributes = new EDataTypeUniqueEList<String>(String.class, this, PaymentPackage.PAYMENT__PAYMENT_ATTRIBUTES);
		}
		return paymentAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> acctgTranss() {
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
	public List<String> deductions() {
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
	public List<String> paymentApplications() {
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
	public List<String> returnItemResponses() {
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
	public List<String> toPaymentApplications() {
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
	public String getPaymentTypeId() {
		return paymentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentTypeId(String newPaymentTypeId) {
		String oldPaymentTypeId = paymentTypeId;
		paymentTypeId = newPaymentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT__PAYMENT_TYPE_ID, oldPaymentTypeId, paymentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentMethodTypeId() {
		return paymentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodTypeId(String newPaymentMethodTypeId) {
		String oldPaymentMethodTypeId = paymentMethodTypeId;
		paymentMethodTypeId = newPaymentMethodTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT__PAYMENT_METHOD_TYPE_ID, oldPaymentMethodTypeId, paymentMethodTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentMethodId() {
		return paymentMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodId(String newPaymentMethodId) {
		String oldPaymentMethodId = paymentMethodId;
		paymentMethodId = newPaymentMethodId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT__PAYMENT_METHOD_ID, oldPaymentMethodId, paymentMethodId));
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
		String oldPaymentGatewayResponseId = paymentGatewayResponseId;
		paymentGatewayResponseId = newPaymentGatewayResponseId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT__PAYMENT_GATEWAY_RESPONSE_ID, oldPaymentGatewayResponseId, paymentGatewayResponseId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFinAccountTransId() {
		return finAccountTransId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountTransId(String newFinAccountTransId) {
		String oldFinAccountTransId = finAccountTransId;
		finAccountTransId = newFinAccountTransId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT__FIN_ACCOUNT_TRANS_ID, oldFinAccountTransId, finAccountTransId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOverrideGlAccountId() {
		return overrideGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverrideGlAccountId(String newOverrideGlAccountId) {
		String oldOverrideGlAccountId = overrideGlAccountId;
		overrideGlAccountId = newOverrideGlAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT__OVERRIDE_GL_ACCOUNT_ID, oldOverrideGlAccountId, overrideGlAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentId() {
		return paymentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentId(String newPaymentId) {
		String oldPaymentId = paymentId;
		paymentId = newPaymentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT__PAYMENT_ID, oldPaymentId, paymentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.PAYMENT__PAYMENT_ID:
				return getPaymentId();
			case PaymentPackage.PAYMENT__ACTUAL_CURRENCY_AMOUNT:
				return getActualCurrencyAmount();
			case PaymentPackage.PAYMENT__ACTUAL_CURRENCY_UOM_ID:
				return getActualCurrencyUomId();
			case PaymentPackage.PAYMENT__AMOUNT:
				return getAmount();
			case PaymentPackage.PAYMENT__COMMENTS:
				return getComments();
			case PaymentPackage.PAYMENT__CURRENCY_UOM_ID:
				return getCurrencyUomId();
			case PaymentPackage.PAYMENT__EFFECTIVE_DATE:
				return getEffectiveDate();
			case PaymentPackage.PAYMENT__FIN_ACCOUNT_TRANS_ID:
				return getFinAccountTransId();
			case PaymentPackage.PAYMENT__OVERRIDE_GL_ACCOUNT_ID:
				return getOverrideGlAccountId();
			case PaymentPackage.PAYMENT__PARTY_ID_FROM:
				return getPartyIdFrom();
			case PaymentPackage.PAYMENT__PARTY_ID_TO:
				return getPartyIdTo();
			case PaymentPackage.PAYMENT__PAYMENT_GATEWAY_RESPONSE_ID:
				return getPaymentGatewayResponseId();
			case PaymentPackage.PAYMENT__PAYMENT_METHOD_ID:
				return getPaymentMethodId();
			case PaymentPackage.PAYMENT__PAYMENT_METHOD_TYPE_ID:
				return getPaymentMethodTypeId();
			case PaymentPackage.PAYMENT__PAYMENT_PREFERENCE_ID:
				return getPaymentPreferenceId();
			case PaymentPackage.PAYMENT__PAYMENT_REF_NUM:
				return getPaymentRefNum();
			case PaymentPackage.PAYMENT__PAYMENT_TYPE_ID:
				return getPaymentTypeId();
			case PaymentPackage.PAYMENT__ROLE_TYPE_ID_TO:
				return getRoleTypeIdTo();
			case PaymentPackage.PAYMENT__STATUS_ID:
				return getStatusId();
			case PaymentPackage.PAYMENT__PAYMENT_ATTRIBUTES:
				return getPaymentAttributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PaymentPackage.PAYMENT__PAYMENT_ID:
				setPaymentId((String)newValue);
				return;
			case PaymentPackage.PAYMENT__ACTUAL_CURRENCY_AMOUNT:
				setActualCurrencyAmount((BigDecimal)newValue);
				return;
			case PaymentPackage.PAYMENT__ACTUAL_CURRENCY_UOM_ID:
				setActualCurrencyUomId((String)newValue);
				return;
			case PaymentPackage.PAYMENT__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case PaymentPackage.PAYMENT__COMMENTS:
				setComments((String)newValue);
				return;
			case PaymentPackage.PAYMENT__CURRENCY_UOM_ID:
				setCurrencyUomId((String)newValue);
				return;
			case PaymentPackage.PAYMENT__EFFECTIVE_DATE:
				setEffectiveDate((Date)newValue);
				return;
			case PaymentPackage.PAYMENT__FIN_ACCOUNT_TRANS_ID:
				setFinAccountTransId((String)newValue);
				return;
			case PaymentPackage.PAYMENT__OVERRIDE_GL_ACCOUNT_ID:
				setOverrideGlAccountId((String)newValue);
				return;
			case PaymentPackage.PAYMENT__PARTY_ID_FROM:
				setPartyIdFrom((String)newValue);
				return;
			case PaymentPackage.PAYMENT__PARTY_ID_TO:
				setPartyIdTo((String)newValue);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_GATEWAY_RESPONSE_ID:
				setPaymentGatewayResponseId((String)newValue);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_METHOD_ID:
				setPaymentMethodId((String)newValue);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_METHOD_TYPE_ID:
				setPaymentMethodTypeId((String)newValue);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_PREFERENCE_ID:
				setPaymentPreferenceId((String)newValue);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_REF_NUM:
				setPaymentRefNum((String)newValue);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_TYPE_ID:
				setPaymentTypeId((String)newValue);
				return;
			case PaymentPackage.PAYMENT__ROLE_TYPE_ID_TO:
				setRoleTypeIdTo((String)newValue);
				return;
			case PaymentPackage.PAYMENT__STATUS_ID:
				setStatusId((String)newValue);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_ATTRIBUTES:
				getPaymentAttributes().clear();
				getPaymentAttributes().addAll((Collection<? extends String>)newValue);
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
			case PaymentPackage.PAYMENT__PAYMENT_ID:
				setPaymentId(PAYMENT_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT__ACTUAL_CURRENCY_AMOUNT:
				setActualCurrencyAmount(ACTUAL_CURRENCY_AMOUNT_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT__ACTUAL_CURRENCY_UOM_ID:
				setActualCurrencyUomId(ACTUAL_CURRENCY_UOM_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT__CURRENCY_UOM_ID:
				setCurrencyUomId(CURRENCY_UOM_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT__EFFECTIVE_DATE:
				setEffectiveDate(EFFECTIVE_DATE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT__FIN_ACCOUNT_TRANS_ID:
				setFinAccountTransId(FIN_ACCOUNT_TRANS_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT__OVERRIDE_GL_ACCOUNT_ID:
				setOverrideGlAccountId(OVERRIDE_GL_ACCOUNT_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT__PARTY_ID_FROM:
				setPartyIdFrom(PARTY_ID_FROM_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT__PARTY_ID_TO:
				setPartyIdTo(PARTY_ID_TO_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_GATEWAY_RESPONSE_ID:
				setPaymentGatewayResponseId(PAYMENT_GATEWAY_RESPONSE_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_METHOD_ID:
				setPaymentMethodId(PAYMENT_METHOD_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_METHOD_TYPE_ID:
				setPaymentMethodTypeId(PAYMENT_METHOD_TYPE_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_PREFERENCE_ID:
				setPaymentPreferenceId(PAYMENT_PREFERENCE_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_REF_NUM:
				setPaymentRefNum(PAYMENT_REF_NUM_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_TYPE_ID:
				setPaymentTypeId(PAYMENT_TYPE_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT__ROLE_TYPE_ID_TO:
				setRoleTypeIdTo(ROLE_TYPE_ID_TO_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_ATTRIBUTES:
				getPaymentAttributes().clear();
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
			case PaymentPackage.PAYMENT__PAYMENT_ID:
				return PAYMENT_ID_EDEFAULT == null ? paymentId != null : !PAYMENT_ID_EDEFAULT.equals(paymentId);
			case PaymentPackage.PAYMENT__ACTUAL_CURRENCY_AMOUNT:
				return ACTUAL_CURRENCY_AMOUNT_EDEFAULT == null ? actualCurrencyAmount != null : !ACTUAL_CURRENCY_AMOUNT_EDEFAULT.equals(actualCurrencyAmount);
			case PaymentPackage.PAYMENT__ACTUAL_CURRENCY_UOM_ID:
				return ACTUAL_CURRENCY_UOM_ID_EDEFAULT == null ? actualCurrencyUomId != null : !ACTUAL_CURRENCY_UOM_ID_EDEFAULT.equals(actualCurrencyUomId);
			case PaymentPackage.PAYMENT__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case PaymentPackage.PAYMENT__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case PaymentPackage.PAYMENT__CURRENCY_UOM_ID:
				return CURRENCY_UOM_ID_EDEFAULT == null ? currencyUomId != null : !CURRENCY_UOM_ID_EDEFAULT.equals(currencyUomId);
			case PaymentPackage.PAYMENT__EFFECTIVE_DATE:
				return EFFECTIVE_DATE_EDEFAULT == null ? effectiveDate != null : !EFFECTIVE_DATE_EDEFAULT.equals(effectiveDate);
			case PaymentPackage.PAYMENT__FIN_ACCOUNT_TRANS_ID:
				return FIN_ACCOUNT_TRANS_ID_EDEFAULT == null ? finAccountTransId != null : !FIN_ACCOUNT_TRANS_ID_EDEFAULT.equals(finAccountTransId);
			case PaymentPackage.PAYMENT__OVERRIDE_GL_ACCOUNT_ID:
				return OVERRIDE_GL_ACCOUNT_ID_EDEFAULT == null ? overrideGlAccountId != null : !OVERRIDE_GL_ACCOUNT_ID_EDEFAULT.equals(overrideGlAccountId);
			case PaymentPackage.PAYMENT__PARTY_ID_FROM:
				return PARTY_ID_FROM_EDEFAULT == null ? partyIdFrom != null : !PARTY_ID_FROM_EDEFAULT.equals(partyIdFrom);
			case PaymentPackage.PAYMENT__PARTY_ID_TO:
				return PARTY_ID_TO_EDEFAULT == null ? partyIdTo != null : !PARTY_ID_TO_EDEFAULT.equals(partyIdTo);
			case PaymentPackage.PAYMENT__PAYMENT_GATEWAY_RESPONSE_ID:
				return PAYMENT_GATEWAY_RESPONSE_ID_EDEFAULT == null ? paymentGatewayResponseId != null : !PAYMENT_GATEWAY_RESPONSE_ID_EDEFAULT.equals(paymentGatewayResponseId);
			case PaymentPackage.PAYMENT__PAYMENT_METHOD_ID:
				return PAYMENT_METHOD_ID_EDEFAULT == null ? paymentMethodId != null : !PAYMENT_METHOD_ID_EDEFAULT.equals(paymentMethodId);
			case PaymentPackage.PAYMENT__PAYMENT_METHOD_TYPE_ID:
				return PAYMENT_METHOD_TYPE_ID_EDEFAULT == null ? paymentMethodTypeId != null : !PAYMENT_METHOD_TYPE_ID_EDEFAULT.equals(paymentMethodTypeId);
			case PaymentPackage.PAYMENT__PAYMENT_PREFERENCE_ID:
				return PAYMENT_PREFERENCE_ID_EDEFAULT == null ? paymentPreferenceId != null : !PAYMENT_PREFERENCE_ID_EDEFAULT.equals(paymentPreferenceId);
			case PaymentPackage.PAYMENT__PAYMENT_REF_NUM:
				return PAYMENT_REF_NUM_EDEFAULT == null ? paymentRefNum != null : !PAYMENT_REF_NUM_EDEFAULT.equals(paymentRefNum);
			case PaymentPackage.PAYMENT__PAYMENT_TYPE_ID:
				return PAYMENT_TYPE_ID_EDEFAULT == null ? paymentTypeId != null : !PAYMENT_TYPE_ID_EDEFAULT.equals(paymentTypeId);
			case PaymentPackage.PAYMENT__ROLE_TYPE_ID_TO:
				return ROLE_TYPE_ID_TO_EDEFAULT == null ? roleTypeIdTo != null : !ROLE_TYPE_ID_TO_EDEFAULT.equals(roleTypeIdTo);
			case PaymentPackage.PAYMENT__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
			case PaymentPackage.PAYMENT__PAYMENT_ATTRIBUTES:
				return paymentAttributes != null && !paymentAttributes.isEmpty();
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
		result.append(" (paymentId: ");
		result.append(paymentId);
		result.append(", actualCurrencyAmount: ");
		result.append(actualCurrencyAmount);
		result.append(", actualCurrencyUomId: ");
		result.append(actualCurrencyUomId);
		result.append(", amount: ");
		result.append(amount);
		result.append(", comments: ");
		result.append(comments);
		result.append(", currencyUomId: ");
		result.append(currencyUomId);
		result.append(", effectiveDate: ");
		result.append(effectiveDate);
		result.append(", finAccountTransId: ");
		result.append(finAccountTransId);
		result.append(", overrideGlAccountId: ");
		result.append(overrideGlAccountId);
		result.append(", partyIdFrom: ");
		result.append(partyIdFrom);
		result.append(", partyIdTo: ");
		result.append(partyIdTo);
		result.append(", paymentGatewayResponseId: ");
		result.append(paymentGatewayResponseId);
		result.append(", paymentMethodId: ");
		result.append(paymentMethodId);
		result.append(", paymentMethodTypeId: ");
		result.append(paymentMethodTypeId);
		result.append(", paymentPreferenceId: ");
		result.append(paymentPreferenceId);
		result.append(", paymentRefNum: ");
		result.append(paymentRefNum);
		result.append(", paymentTypeId: ");
		result.append(paymentTypeId);
		result.append(", roleTypeIdTo: ");
		result.append(roleTypeIdTo);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(", paymentAttributes: ");
		result.append(paymentAttributes);
		result.append(')');
		return result.toString();
	}

} //PaymentImpl
