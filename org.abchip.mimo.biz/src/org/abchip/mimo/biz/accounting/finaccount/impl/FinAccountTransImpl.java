/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.finaccount.impl;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.accounting.finaccount.FinAccount;
import org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans;
import org.abchip.mimo.biz.accounting.finaccount.FinAccountTransType;
import org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage;
import org.abchip.mimo.biz.accounting.ledger.GlReconciliation;
import org.abchip.mimo.biz.accounting.payment.Payment;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fin Account Trans</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getFinAccountTransId <em>Fin Account Trans Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getEntryDate <em>Entry Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getTransactionDate <em>Transaction Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getFinAccountTransTypeId <em>Fin Account Trans Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getFinAccountId <em>Fin Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getPaymentId <em>Payment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getPerformedByPartyId <em>Performed By Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getReasonEnumId <em>Reason Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getGlReconciliationId <em>Gl Reconciliation Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getFinAccountTransAttributes <em>Fin Account Trans Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinAccountTransImpl extends BizEntityTypedImpl<FinAccountTransType> implements FinAccountTrans {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	 * The default value of the '{@link #getEntryDate() <em>Entry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ENTRY_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEntryDate() <em>Entry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryDate()
	 * @generated
	 * @ordered
	 */
	protected Date entryDate = ENTRY_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected String orderId = ORDER_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getOrderItemSeqId() <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ITEM_SEQ_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOrderItemSeqId() <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String orderItemSeqId = ORDER_ITEM_SEQ_ID_EDEFAULT;
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
	 * The cached value of the '{@link #getFinAccountTransTypeId() <em>Fin Account Trans Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountTransTypeId()
	 * @generated
	 * @ordered
	 */
	protected FinAccountTransType finAccountTransTypeId;
	/**
	 * The cached value of the '{@link #getFinAccountId() <em>Fin Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountId()
	 * @generated
	 * @ordered
	 */
	protected FinAccount finAccountId;
	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;
	/**
	 * The cached value of the '{@link #getPaymentId() <em>Payment Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentId()
	 * @generated
	 * @ordered
	 */
	protected Payment paymentId;
	/**
	 * The cached value of the '{@link #getPerformedByPartyId() <em>Performed By Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedByPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party performedByPartyId;
	/**
	 * The cached value of the '{@link #getReasonEnumId() <em>Reason Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration reasonEnumId;
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
	 * The cached value of the '{@link #getGlReconciliationId() <em>Gl Reconciliation Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlReconciliationId()
	 * @generated
	 * @ordered
	 */
	protected GlReconciliation glReconciliationId;

	/**
	 * The cached value of the '{@link #getFinAccountTransAttributes() <em>Fin Account Trans Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountTransAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> finAccountTransAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinAccountTransImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinaccountPackage.Literals.FIN_ACCOUNT_TRANS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_TRANS__AMOUNT, oldAmount, amount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_TRANS__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEntryDate() {
		return entryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntryDate(Date newEntryDate) {
		Date oldEntryDate = entryDate;
		entryDate = newEntryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_TRANS__ENTRY_DATE, oldEntryDate, entryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlReconciliation getGlReconciliationId() {
		if (glReconciliationId != null && ((EObject)glReconciliationId).eIsProxy()) {
			InternalEObject oldGlReconciliationId = (InternalEObject)glReconciliationId;
			glReconciliationId = (GlReconciliation)eResolveProxy(oldGlReconciliationId);
			if (glReconciliationId != oldGlReconciliationId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinaccountPackage.FIN_ACCOUNT_TRANS__GL_RECONCILIATION_ID, oldGlReconciliationId, glReconciliationId));
			}
		}
		return glReconciliationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlReconciliation basicGetGlReconciliationId() {
		return glReconciliationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlReconciliationId(GlReconciliation newGlReconciliationId) {
		GlReconciliation oldGlReconciliationId = glReconciliationId;
		glReconciliationId = newGlReconciliationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_TRANS__GL_RECONCILIATION_ID, oldGlReconciliationId, glReconciliationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(String newOrderId) {
		String oldOrderId = orderId;
		orderId = newOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_TRANS__ORDER_ID, oldOrderId, orderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return orderItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		String oldOrderItemSeqId = orderItemSeqId;
		orderItemSeqId = newOrderItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_TRANS__ORDER_ITEM_SEQ_ID, oldOrderItemSeqId, orderItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinaccountPackage.FIN_ACCOUNT_TRANS__PARTY_ID, oldPartyId, partyId));
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		Party oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_TRANS__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Payment getPaymentId() {
		if (paymentId != null && ((EObject)paymentId).eIsProxy()) {
			InternalEObject oldPaymentId = (InternalEObject)paymentId;
			paymentId = (Payment)eResolveProxy(oldPaymentId);
			if (paymentId != oldPaymentId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinaccountPackage.FIN_ACCOUNT_TRANS__PAYMENT_ID, oldPaymentId, paymentId));
			}
		}
		return paymentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Payment basicGetPaymentId() {
		return paymentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentId(Payment newPaymentId) {
		Payment oldPaymentId = paymentId;
		paymentId = newPaymentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_TRANS__PAYMENT_ID, oldPaymentId, paymentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPerformedByPartyId() {
		if (performedByPartyId != null && ((EObject)performedByPartyId).eIsProxy()) {
			InternalEObject oldPerformedByPartyId = (InternalEObject)performedByPartyId;
			performedByPartyId = (Party)eResolveProxy(oldPerformedByPartyId);
			if (performedByPartyId != oldPerformedByPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinaccountPackage.FIN_ACCOUNT_TRANS__PERFORMED_BY_PARTY_ID, oldPerformedByPartyId, performedByPartyId));
			}
		}
		return performedByPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPerformedByPartyId() {
		return performedByPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerformedByPartyId(Party newPerformedByPartyId) {
		Party oldPerformedByPartyId = performedByPartyId;
		performedByPartyId = newPerformedByPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_TRANS__PERFORMED_BY_PARTY_ID, oldPerformedByPartyId, performedByPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getReasonEnumId() {
		if (reasonEnumId != null && ((EObject)reasonEnumId).eIsProxy()) {
			InternalEObject oldReasonEnumId = (InternalEObject)reasonEnumId;
			reasonEnumId = (Enumeration)eResolveProxy(oldReasonEnumId);
			if (reasonEnumId != oldReasonEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinaccountPackage.FIN_ACCOUNT_TRANS__REASON_ENUM_ID, oldReasonEnumId, reasonEnumId));
			}
		}
		return reasonEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetReasonEnumId() {
		return reasonEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReasonEnumId(Enumeration newReasonEnumId) {
		Enumeration oldReasonEnumId = reasonEnumId;
		reasonEnumId = newReasonEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_TRANS__REASON_ENUM_ID, oldReasonEnumId, reasonEnumId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinaccountPackage.FIN_ACCOUNT_TRANS__STATUS_ID, oldStatusId, statusId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_TRANS__STATUS_ID, oldStatusId, statusId));
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
		Date oldTransactionDate = transactionDate;
		transactionDate = newTransactionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_TRANS__TRANSACTION_DATE, oldTransactionDate, transactionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getFinAccountTransAttributes() {
		if (finAccountTransAttributes == null) {
			finAccountTransAttributes = new EDataTypeUniqueEList<String>(String.class, this, FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_ATTRIBUTES);
		}
		return finAccountTransAttributes;
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
	public FinAccountTransType getFinAccountTransTypeId() {
		if (finAccountTransTypeId != null && ((EObject)finAccountTransTypeId).eIsProxy()) {
			InternalEObject oldFinAccountTransTypeId = (InternalEObject)finAccountTransTypeId;
			finAccountTransTypeId = (FinAccountTransType)eResolveProxy(oldFinAccountTransTypeId);
			if (finAccountTransTypeId != oldFinAccountTransTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_TYPE_ID, oldFinAccountTransTypeId, finAccountTransTypeId));
			}
		}
		return finAccountTransTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinAccountTransType basicGetFinAccountTransTypeId() {
		return finAccountTransTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountTransTypeId(FinAccountTransType newFinAccountTransTypeId) {
		FinAccountTransType oldFinAccountTransTypeId = finAccountTransTypeId;
		finAccountTransTypeId = newFinAccountTransTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_TYPE_ID, oldFinAccountTransTypeId, finAccountTransTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccount getFinAccountId() {
		if (finAccountId != null && ((EObject)finAccountId).eIsProxy()) {
			InternalEObject oldFinAccountId = (InternalEObject)finAccountId;
			finAccountId = (FinAccount)eResolveProxy(oldFinAccountId);
			if (finAccountId != oldFinAccountId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_ID, oldFinAccountId, finAccountId));
			}
		}
		return finAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinAccount basicGetFinAccountId() {
		return finAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountId(FinAccount newFinAccountId) {
		FinAccount oldFinAccountId = finAccountId;
		finAccountId = newFinAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_ID, oldFinAccountId, finAccountId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_ID, oldFinAccountTransId, finAccountTransId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_ID:
				return getFinAccountTransId();
			case FinaccountPackage.FIN_ACCOUNT_TRANS__AMOUNT:
				return getAmount();
			case FinaccountPackage.FIN_ACCOUNT_TRANS__COMMENTS:
				return getComments();
			case FinaccountPackage.FIN_ACCOUNT_TRANS__ENTRY_DATE:
				return getEntryDate();
			case FinaccountPackage.FIN_ACCOUNT_TRANS__ORDER_ID:
				return getOrderId();
			case FinaccountPackage.FIN_ACCOUNT_TRANS__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case FinaccountPackage.FIN_ACCOUNT_TRANS__TRANSACTION_DATE:
				return getTransactionDate();
			case FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_TYPE_ID:
				if (resolve) return getFinAccountTransTypeId();
				return basicGetFinAccountTransTypeId();
			case FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_ID:
				if (resolve) return getFinAccountId();
				return basicGetFinAccountId();
			case FinaccountPackage.FIN_ACCOUNT_TRANS__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case FinaccountPackage.FIN_ACCOUNT_TRANS__PAYMENT_ID:
				if (resolve) return getPaymentId();
				return basicGetPaymentId();
			case FinaccountPackage.FIN_ACCOUNT_TRANS__PERFORMED_BY_PARTY_ID:
				if (resolve) return getPerformedByPartyId();
				return basicGetPerformedByPartyId();
			case FinaccountPackage.FIN_ACCOUNT_TRANS__REASON_ENUM_ID:
				if (resolve) return getReasonEnumId();
				return basicGetReasonEnumId();
			case FinaccountPackage.FIN_ACCOUNT_TRANS__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case FinaccountPackage.FIN_ACCOUNT_TRANS__GL_RECONCILIATION_ID:
				if (resolve) return getGlReconciliationId();
				return basicGetGlReconciliationId();
			case FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_ATTRIBUTES:
				return getFinAccountTransAttributes();
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
			case FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_ID:
				setFinAccountTransId((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__COMMENTS:
				setComments((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__ENTRY_DATE:
				setEntryDate((Date)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__ORDER_ID:
				setOrderId((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__TRANSACTION_DATE:
				setTransactionDate((Date)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_TYPE_ID:
				setFinAccountTransTypeId((FinAccountTransType)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_ID:
				setFinAccountId((FinAccount)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__PAYMENT_ID:
				setPaymentId((Payment)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__PERFORMED_BY_PARTY_ID:
				setPerformedByPartyId((Party)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__REASON_ENUM_ID:
				setReasonEnumId((Enumeration)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__GL_RECONCILIATION_ID:
				setGlReconciliationId((GlReconciliation)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_ATTRIBUTES:
				getFinAccountTransAttributes().clear();
				getFinAccountTransAttributes().addAll((Collection<? extends String>)newValue);
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
			case FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_ID:
				setFinAccountTransId(FIN_ACCOUNT_TRANS_ID_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__ENTRY_DATE:
				setEntryDate(ENTRY_DATE_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__TRANSACTION_DATE:
				setTransactionDate(TRANSACTION_DATE_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_TYPE_ID:
				setFinAccountTransTypeId((FinAccountTransType)null);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_ID:
				setFinAccountId((FinAccount)null);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__PARTY_ID:
				setPartyId((Party)null);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__PAYMENT_ID:
				setPaymentId((Payment)null);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__PERFORMED_BY_PARTY_ID:
				setPerformedByPartyId((Party)null);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__REASON_ENUM_ID:
				setReasonEnumId((Enumeration)null);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__GL_RECONCILIATION_ID:
				setGlReconciliationId((GlReconciliation)null);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_ATTRIBUTES:
				getFinAccountTransAttributes().clear();
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
			case FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_ID:
				return FIN_ACCOUNT_TRANS_ID_EDEFAULT == null ? finAccountTransId != null : !FIN_ACCOUNT_TRANS_ID_EDEFAULT.equals(finAccountTransId);
			case FinaccountPackage.FIN_ACCOUNT_TRANS__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case FinaccountPackage.FIN_ACCOUNT_TRANS__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case FinaccountPackage.FIN_ACCOUNT_TRANS__ENTRY_DATE:
				return ENTRY_DATE_EDEFAULT == null ? entryDate != null : !ENTRY_DATE_EDEFAULT.equals(entryDate);
			case FinaccountPackage.FIN_ACCOUNT_TRANS__ORDER_ID:
				return ORDER_ID_EDEFAULT == null ? orderId != null : !ORDER_ID_EDEFAULT.equals(orderId);
			case FinaccountPackage.FIN_ACCOUNT_TRANS__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case FinaccountPackage.FIN_ACCOUNT_TRANS__TRANSACTION_DATE:
				return TRANSACTION_DATE_EDEFAULT == null ? transactionDate != null : !TRANSACTION_DATE_EDEFAULT.equals(transactionDate);
			case FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_TYPE_ID:
				return finAccountTransTypeId != null;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_ID:
				return finAccountId != null;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__PARTY_ID:
				return partyId != null;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__PAYMENT_ID:
				return paymentId != null;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__PERFORMED_BY_PARTY_ID:
				return performedByPartyId != null;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__REASON_ENUM_ID:
				return reasonEnumId != null;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__STATUS_ID:
				return statusId != null;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__GL_RECONCILIATION_ID:
				return glReconciliationId != null;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_ATTRIBUTES:
				return finAccountTransAttributes != null && !finAccountTransAttributes.isEmpty();
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
		result.append(" (finAccountTransId: ");
		result.append(finAccountTransId);
		result.append(", amount: ");
		result.append(amount);
		result.append(", comments: ");
		result.append(comments);
		result.append(", entryDate: ");
		result.append(entryDate);
		result.append(", orderId: ");
		result.append(orderId);
		result.append(", orderItemSeqId: ");
		result.append(orderItemSeqId);
		result.append(", transactionDate: ");
		result.append(transactionDate);
		result.append(", finAccountTransAttributes: ");
		result.append(finAccountTransAttributes);
		result.append(')');
		return result.toString();
	}

} //FinAccountTransImpl
