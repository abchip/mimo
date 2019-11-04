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

import org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans;
import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.accounting.payment.GiftCard;
import org.abchip.mimo.biz.accounting.payment.Payment;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse;
import org.abchip.mimo.biz.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.accounting.payment.PaymentType;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.order.order.OrderPaymentPreference;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.RoleType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getEffectiveDate <em>Effective Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getPaymentRefNum <em>Payment Ref Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getPaymentTypeId <em>Payment Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getPaymentMethodTypeId <em>Payment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getActualCurrencyUomId <em>Actual Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getPaymentMethodId <em>Payment Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getPaymentPreferenceId <em>Payment Preference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getPaymentGatewayResponseId <em>Payment Gateway Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getPartyIdFrom <em>Party Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getPartyIdTo <em>Party Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getRoleTypeIdTo <em>Role Type Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getFinAccountTransId <em>Fin Account Trans Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl#getOverrideGlAccountId <em>Override Gl Account Id</em>}</li>
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
	 * The cached value of the '{@link #getPaymentTypeId() <em>Payment Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentTypeId()
	 * @generated
	 * @ordered
	 */
	protected PaymentType paymentTypeId;
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
	 * The cached value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom currencyUomId;
	/**
	 * The cached value of the '{@link #getActualCurrencyUomId() <em>Actual Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom actualCurrencyUomId;
	/**
	 * The cached value of the '{@link #getPaymentMethodId() <em>Payment Method Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodId()
	 * @generated
	 * @ordered
	 */
	protected GiftCard paymentMethodId;
	/**
	 * The cached value of the '{@link #getPaymentPreferenceId() <em>Payment Preference Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentPreferenceId()
	 * @generated
	 * @ordered
	 */
	protected OrderPaymentPreference paymentPreferenceId;
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
	 * The cached value of the '{@link #getPartyIdFrom() <em>Party Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdFrom()
	 * @generated
	 * @ordered
	 */
	protected Party partyIdFrom;
	/**
	 * The cached value of the '{@link #getPartyIdTo() <em>Party Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyIdTo()
	 * @generated
	 * @ordered
	 */
	protected Party partyIdTo;
	/**
	 * The cached value of the '{@link #getRoleTypeIdTo() <em>Role Type Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeIdTo()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleTypeIdTo;
	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;
	/**
	 * The cached value of the '{@link #getFinAccountTransId() <em>Fin Account Trans Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountTransId()
	 * @generated
	 * @ordered
	 */
	protected FinAccountTrans finAccountTransId;
	/**
	 * The cached value of the '{@link #getOverrideGlAccountId() <em>Override Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected GlAccount overrideGlAccountId;

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
	public Uom getActualCurrencyUomId() {
		if (actualCurrencyUomId != null && ((EObject)actualCurrencyUomId).eIsProxy()) {
			InternalEObject oldActualCurrencyUomId = (InternalEObject)actualCurrencyUomId;
			actualCurrencyUomId = (Uom)eResolveProxy(oldActualCurrencyUomId);
			if (actualCurrencyUomId != oldActualCurrencyUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT__ACTUAL_CURRENCY_UOM_ID, oldActualCurrencyUomId, actualCurrencyUomId));
			}
		}
		return actualCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetActualCurrencyUomId() {
		return actualCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualCurrencyUomId(Uom newActualCurrencyUomId) {
		Uom oldActualCurrencyUomId = actualCurrencyUomId;
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
	public Uom getCurrencyUomId() {
		if (currencyUomId != null && ((EObject)currencyUomId).eIsProxy()) {
			InternalEObject oldCurrencyUomId = (InternalEObject)currencyUomId;
			currencyUomId = (Uom)eResolveProxy(oldCurrencyUomId);
			if (currencyUomId != oldCurrencyUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
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
		Uom oldCurrencyUomId = currencyUomId;
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
	public Party getPartyIdFrom() {
		if (partyIdFrom != null && ((EObject)partyIdFrom).eIsProxy()) {
			InternalEObject oldPartyIdFrom = (InternalEObject)partyIdFrom;
			partyIdFrom = (Party)eResolveProxy(oldPartyIdFrom);
			if (partyIdFrom != oldPartyIdFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT__PARTY_ID_FROM, oldPartyIdFrom, partyIdFrom));
			}
		}
		return partyIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyIdFrom() {
		return partyIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdFrom(Party newPartyIdFrom) {
		Party oldPartyIdFrom = partyIdFrom;
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
	public Party getPartyIdTo() {
		if (partyIdTo != null && ((EObject)partyIdTo).eIsProxy()) {
			InternalEObject oldPartyIdTo = (InternalEObject)partyIdTo;
			partyIdTo = (Party)eResolveProxy(oldPartyIdTo);
			if (partyIdTo != oldPartyIdTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT__PARTY_ID_TO, oldPartyIdTo, partyIdTo));
			}
		}
		return partyIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyIdTo() {
		return partyIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyIdTo(Party newPartyIdTo) {
		Party oldPartyIdTo = partyIdTo;
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
	public OrderPaymentPreference getPaymentPreferenceId() {
		if (paymentPreferenceId != null && ((EObject)paymentPreferenceId).eIsProxy()) {
			InternalEObject oldPaymentPreferenceId = (InternalEObject)paymentPreferenceId;
			paymentPreferenceId = (OrderPaymentPreference)eResolveProxy(oldPaymentPreferenceId);
			if (paymentPreferenceId != oldPaymentPreferenceId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT__PAYMENT_PREFERENCE_ID, oldPaymentPreferenceId, paymentPreferenceId));
			}
		}
		return paymentPreferenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderPaymentPreference basicGetPaymentPreferenceId() {
		return paymentPreferenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentPreferenceId(OrderPaymentPreference newPaymentPreferenceId) {
		OrderPaymentPreference oldPaymentPreferenceId = paymentPreferenceId;
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
	public RoleType getRoleTypeIdTo() {
		if (roleTypeIdTo != null && ((EObject)roleTypeIdTo).eIsProxy()) {
			InternalEObject oldRoleTypeIdTo = (InternalEObject)roleTypeIdTo;
			roleTypeIdTo = (RoleType)eResolveProxy(oldRoleTypeIdTo);
			if (roleTypeIdTo != oldRoleTypeIdTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT__ROLE_TYPE_ID_TO, oldRoleTypeIdTo, roleTypeIdTo));
			}
		}
		return roleTypeIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetRoleTypeIdTo() {
		return roleTypeIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeIdTo(RoleType newRoleTypeIdTo) {
		RoleType oldRoleTypeIdTo = roleTypeIdTo;
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
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT__STATUS_ID, oldStatusId, statusId));
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		StatusItem oldStatusId = statusId;
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
	public PaymentType getPaymentTypeId() {
		if (paymentTypeId != null && ((EObject)paymentTypeId).eIsProxy()) {
			InternalEObject oldPaymentTypeId = (InternalEObject)paymentTypeId;
			paymentTypeId = (PaymentType)eResolveProxy(oldPaymentTypeId);
			if (paymentTypeId != oldPaymentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT__PAYMENT_TYPE_ID, oldPaymentTypeId, paymentTypeId));
			}
		}
		return paymentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentType basicGetPaymentTypeId() {
		return paymentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentTypeId(PaymentType newPaymentTypeId) {
		PaymentType oldPaymentTypeId = paymentTypeId;
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
	public PaymentMethodType getPaymentMethodTypeId() {
		if (paymentMethodTypeId != null && ((EObject)paymentMethodTypeId).eIsProxy()) {
			InternalEObject oldPaymentMethodTypeId = (InternalEObject)paymentMethodTypeId;
			paymentMethodTypeId = (PaymentMethodType)eResolveProxy(oldPaymentMethodTypeId);
			if (paymentMethodTypeId != oldPaymentMethodTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT__PAYMENT_METHOD_TYPE_ID, oldPaymentMethodTypeId, paymentMethodTypeId));
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
		PaymentMethodType oldPaymentMethodTypeId = paymentMethodTypeId;
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
	public GiftCard getPaymentMethodId() {
		if (paymentMethodId != null && ((EObject)paymentMethodId).eIsProxy()) {
			InternalEObject oldPaymentMethodId = (InternalEObject)paymentMethodId;
			paymentMethodId = (GiftCard)eResolveProxy(oldPaymentMethodId);
			if (paymentMethodId != oldPaymentMethodId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT__PAYMENT_METHOD_ID, oldPaymentMethodId, paymentMethodId));
			}
		}
		return paymentMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GiftCard basicGetPaymentMethodId() {
		return paymentMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodId(GiftCard newPaymentMethodId) {
		GiftCard oldPaymentMethodId = paymentMethodId;
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
	public PaymentGatewayResponse getPaymentGatewayResponseId() {
		if (paymentGatewayResponseId != null && ((EObject)paymentGatewayResponseId).eIsProxy()) {
			InternalEObject oldPaymentGatewayResponseId = (InternalEObject)paymentGatewayResponseId;
			paymentGatewayResponseId = (PaymentGatewayResponse)eResolveProxy(oldPaymentGatewayResponseId);
			if (paymentGatewayResponseId != oldPaymentGatewayResponseId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT__PAYMENT_GATEWAY_RESPONSE_ID, oldPaymentGatewayResponseId, paymentGatewayResponseId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT__PAYMENT_GATEWAY_RESPONSE_ID, oldPaymentGatewayResponseId, paymentGatewayResponseId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccountTrans getFinAccountTransId() {
		if (finAccountTransId != null && ((EObject)finAccountTransId).eIsProxy()) {
			InternalEObject oldFinAccountTransId = (InternalEObject)finAccountTransId;
			finAccountTransId = (FinAccountTrans)eResolveProxy(oldFinAccountTransId);
			if (finAccountTransId != oldFinAccountTransId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT__FIN_ACCOUNT_TRANS_ID, oldFinAccountTransId, finAccountTransId));
			}
		}
		return finAccountTransId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinAccountTrans basicGetFinAccountTransId() {
		return finAccountTransId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountTransId(FinAccountTrans newFinAccountTransId) {
		FinAccountTrans oldFinAccountTransId = finAccountTransId;
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
	public GlAccount getOverrideGlAccountId() {
		if (overrideGlAccountId != null && ((EObject)overrideGlAccountId).eIsProxy()) {
			InternalEObject oldOverrideGlAccountId = (InternalEObject)overrideGlAccountId;
			overrideGlAccountId = (GlAccount)eResolveProxy(oldOverrideGlAccountId);
			if (overrideGlAccountId != oldOverrideGlAccountId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT__OVERRIDE_GL_ACCOUNT_ID, oldOverrideGlAccountId, overrideGlAccountId));
			}
		}
		return overrideGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccount basicGetOverrideGlAccountId() {
		return overrideGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverrideGlAccountId(GlAccount newOverrideGlAccountId) {
		GlAccount oldOverrideGlAccountId = overrideGlAccountId;
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
			case PaymentPackage.PAYMENT__AMOUNT:
				return getAmount();
			case PaymentPackage.PAYMENT__COMMENTS:
				return getComments();
			case PaymentPackage.PAYMENT__EFFECTIVE_DATE:
				return getEffectiveDate();
			case PaymentPackage.PAYMENT__PAYMENT_REF_NUM:
				return getPaymentRefNum();
			case PaymentPackage.PAYMENT__PAYMENT_TYPE_ID:
				if (resolve) return getPaymentTypeId();
				return basicGetPaymentTypeId();
			case PaymentPackage.PAYMENT__PAYMENT_METHOD_TYPE_ID:
				if (resolve) return getPaymentMethodTypeId();
				return basicGetPaymentMethodTypeId();
			case PaymentPackage.PAYMENT__CURRENCY_UOM_ID:
				if (resolve) return getCurrencyUomId();
				return basicGetCurrencyUomId();
			case PaymentPackage.PAYMENT__ACTUAL_CURRENCY_UOM_ID:
				if (resolve) return getActualCurrencyUomId();
				return basicGetActualCurrencyUomId();
			case PaymentPackage.PAYMENT__PAYMENT_METHOD_ID:
				if (resolve) return getPaymentMethodId();
				return basicGetPaymentMethodId();
			case PaymentPackage.PAYMENT__PAYMENT_PREFERENCE_ID:
				if (resolve) return getPaymentPreferenceId();
				return basicGetPaymentPreferenceId();
			case PaymentPackage.PAYMENT__PAYMENT_GATEWAY_RESPONSE_ID:
				if (resolve) return getPaymentGatewayResponseId();
				return basicGetPaymentGatewayResponseId();
			case PaymentPackage.PAYMENT__PARTY_ID_FROM:
				if (resolve) return getPartyIdFrom();
				return basicGetPartyIdFrom();
			case PaymentPackage.PAYMENT__PARTY_ID_TO:
				if (resolve) return getPartyIdTo();
				return basicGetPartyIdTo();
			case PaymentPackage.PAYMENT__ROLE_TYPE_ID_TO:
				if (resolve) return getRoleTypeIdTo();
				return basicGetRoleTypeIdTo();
			case PaymentPackage.PAYMENT__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case PaymentPackage.PAYMENT__FIN_ACCOUNT_TRANS_ID:
				if (resolve) return getFinAccountTransId();
				return basicGetFinAccountTransId();
			case PaymentPackage.PAYMENT__OVERRIDE_GL_ACCOUNT_ID:
				if (resolve) return getOverrideGlAccountId();
				return basicGetOverrideGlAccountId();
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
			case PaymentPackage.PAYMENT__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case PaymentPackage.PAYMENT__COMMENTS:
				setComments((String)newValue);
				return;
			case PaymentPackage.PAYMENT__EFFECTIVE_DATE:
				setEffectiveDate((Date)newValue);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_REF_NUM:
				setPaymentRefNum((String)newValue);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_TYPE_ID:
				setPaymentTypeId((PaymentType)newValue);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_METHOD_TYPE_ID:
				setPaymentMethodTypeId((PaymentMethodType)newValue);
				return;
			case PaymentPackage.PAYMENT__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)newValue);
				return;
			case PaymentPackage.PAYMENT__ACTUAL_CURRENCY_UOM_ID:
				setActualCurrencyUomId((Uom)newValue);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_METHOD_ID:
				setPaymentMethodId((GiftCard)newValue);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_PREFERENCE_ID:
				setPaymentPreferenceId((OrderPaymentPreference)newValue);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_GATEWAY_RESPONSE_ID:
				setPaymentGatewayResponseId((PaymentGatewayResponse)newValue);
				return;
			case PaymentPackage.PAYMENT__PARTY_ID_FROM:
				setPartyIdFrom((Party)newValue);
				return;
			case PaymentPackage.PAYMENT__PARTY_ID_TO:
				setPartyIdTo((Party)newValue);
				return;
			case PaymentPackage.PAYMENT__ROLE_TYPE_ID_TO:
				setRoleTypeIdTo((RoleType)newValue);
				return;
			case PaymentPackage.PAYMENT__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case PaymentPackage.PAYMENT__FIN_ACCOUNT_TRANS_ID:
				setFinAccountTransId((FinAccountTrans)newValue);
				return;
			case PaymentPackage.PAYMENT__OVERRIDE_GL_ACCOUNT_ID:
				setOverrideGlAccountId((GlAccount)newValue);
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
			case PaymentPackage.PAYMENT__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT__EFFECTIVE_DATE:
				setEffectiveDate(EFFECTIVE_DATE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_REF_NUM:
				setPaymentRefNum(PAYMENT_REF_NUM_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_TYPE_ID:
				setPaymentTypeId((PaymentType)null);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_METHOD_TYPE_ID:
				setPaymentMethodTypeId((PaymentMethodType)null);
				return;
			case PaymentPackage.PAYMENT__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)null);
				return;
			case PaymentPackage.PAYMENT__ACTUAL_CURRENCY_UOM_ID:
				setActualCurrencyUomId((Uom)null);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_METHOD_ID:
				setPaymentMethodId((GiftCard)null);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_PREFERENCE_ID:
				setPaymentPreferenceId((OrderPaymentPreference)null);
				return;
			case PaymentPackage.PAYMENT__PAYMENT_GATEWAY_RESPONSE_ID:
				setPaymentGatewayResponseId((PaymentGatewayResponse)null);
				return;
			case PaymentPackage.PAYMENT__PARTY_ID_FROM:
				setPartyIdFrom((Party)null);
				return;
			case PaymentPackage.PAYMENT__PARTY_ID_TO:
				setPartyIdTo((Party)null);
				return;
			case PaymentPackage.PAYMENT__ROLE_TYPE_ID_TO:
				setRoleTypeIdTo((RoleType)null);
				return;
			case PaymentPackage.PAYMENT__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case PaymentPackage.PAYMENT__FIN_ACCOUNT_TRANS_ID:
				setFinAccountTransId((FinAccountTrans)null);
				return;
			case PaymentPackage.PAYMENT__OVERRIDE_GL_ACCOUNT_ID:
				setOverrideGlAccountId((GlAccount)null);
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
			case PaymentPackage.PAYMENT__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case PaymentPackage.PAYMENT__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case PaymentPackage.PAYMENT__EFFECTIVE_DATE:
				return EFFECTIVE_DATE_EDEFAULT == null ? effectiveDate != null : !EFFECTIVE_DATE_EDEFAULT.equals(effectiveDate);
			case PaymentPackage.PAYMENT__PAYMENT_REF_NUM:
				return PAYMENT_REF_NUM_EDEFAULT == null ? paymentRefNum != null : !PAYMENT_REF_NUM_EDEFAULT.equals(paymentRefNum);
			case PaymentPackage.PAYMENT__PAYMENT_TYPE_ID:
				return paymentTypeId != null;
			case PaymentPackage.PAYMENT__PAYMENT_METHOD_TYPE_ID:
				return paymentMethodTypeId != null;
			case PaymentPackage.PAYMENT__CURRENCY_UOM_ID:
				return currencyUomId != null;
			case PaymentPackage.PAYMENT__ACTUAL_CURRENCY_UOM_ID:
				return actualCurrencyUomId != null;
			case PaymentPackage.PAYMENT__PAYMENT_METHOD_ID:
				return paymentMethodId != null;
			case PaymentPackage.PAYMENT__PAYMENT_PREFERENCE_ID:
				return paymentPreferenceId != null;
			case PaymentPackage.PAYMENT__PAYMENT_GATEWAY_RESPONSE_ID:
				return paymentGatewayResponseId != null;
			case PaymentPackage.PAYMENT__PARTY_ID_FROM:
				return partyIdFrom != null;
			case PaymentPackage.PAYMENT__PARTY_ID_TO:
				return partyIdTo != null;
			case PaymentPackage.PAYMENT__ROLE_TYPE_ID_TO:
				return roleTypeIdTo != null;
			case PaymentPackage.PAYMENT__STATUS_ID:
				return statusId != null;
			case PaymentPackage.PAYMENT__FIN_ACCOUNT_TRANS_ID:
				return finAccountTransId != null;
			case PaymentPackage.PAYMENT__OVERRIDE_GL_ACCOUNT_ID:
				return overrideGlAccountId != null;
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
		result.append(", amount: ");
		result.append(amount);
		result.append(", comments: ");
		result.append(comments);
		result.append(", effectiveDate: ");
		result.append(effectiveDate);
		result.append(", paymentRefNum: ");
		result.append(paymentRefNum);
		result.append(", paymentAttributes: ");
		result.append(paymentAttributes);
		result.append(')');
		return result.toString();
	}

} //PaymentImpl
