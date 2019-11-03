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

import org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans;
import org.abchip.mimo.biz.accounting.finaccount.FinAccountTransType;
import org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getFinAccountId <em>Fin Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getFinAccountTransTypeId <em>Fin Account Trans Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getGlReconciliationId <em>Gl Reconciliation Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getPaymentId <em>Payment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getPerformedByPartyId <em>Performed By Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getReasonEnumId <em>Reason Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl#getTransactionDate <em>Transaction Date</em>}</li>
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
	 * The default value of the '{@link #getFinAccountId() <em>Fin Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String FIN_ACCOUNT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFinAccountId() <em>Fin Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountId()
	 * @generated
	 * @ordered
	 */
	protected String finAccountId = FIN_ACCOUNT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinAccountTransTypeId() <em>Fin Account Trans Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountTransTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String FIN_ACCOUNT_TRANS_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFinAccountTransTypeId() <em>Fin Account Trans Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountTransTypeId()
	 * @generated
	 * @ordered
	 */
	protected String finAccountTransTypeId = FIN_ACCOUNT_TRANS_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getGlReconciliationId() <em>Gl Reconciliation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlReconciliationId()
	 * @generated
	 * @ordered
	 */
	protected static final String GL_RECONCILIATION_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGlReconciliationId() <em>Gl Reconciliation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlReconciliationId()
	 * @generated
	 * @ordered
	 */
	protected String glReconciliationId = GL_RECONCILIATION_ID_EDEFAULT;
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
	 * The default value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected String partyId = PARTY_ID_EDEFAULT;
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
	 * The default value of the '{@link #getPerformedByPartyId() <em>Performed By Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedByPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String PERFORMED_BY_PARTY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPerformedByPartyId() <em>Performed By Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedByPartyId()
	 * @generated
	 * @ordered
	 */
	protected String performedByPartyId = PERFORMED_BY_PARTY_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getReasonEnumId() <em>Reason Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_ENUM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getReasonEnumId() <em>Reason Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonEnumId()
	 * @generated
	 * @ordered
	 */
	protected String reasonEnumId = REASON_ENUM_ID_EDEFAULT;
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
	public String getGlReconciliationId() {
		return glReconciliationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlReconciliationId(String newGlReconciliationId) {
		String oldGlReconciliationId = glReconciliationId;
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
	public String getPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		String oldPartyId = partyId;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinaccountPackage.FIN_ACCOUNT_TRANS__PAYMENT_ID, oldPaymentId, paymentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPerformedByPartyId() {
		return performedByPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerformedByPartyId(String newPerformedByPartyId) {
		String oldPerformedByPartyId = performedByPartyId;
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
	public String getReasonEnumId() {
		return reasonEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReasonEnumId(String newReasonEnumId) {
		String oldReasonEnumId = reasonEnumId;
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
	public String getFinAccountTransTypeId() {
		return finAccountTransTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountTransTypeId(String newFinAccountTransTypeId) {
		String oldFinAccountTransTypeId = finAccountTransTypeId;
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
	public String getFinAccountId() {
		return finAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountId(String newFinAccountId) {
		String oldFinAccountId = finAccountId;
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
			case FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_ID:
				return getFinAccountId();
			case FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_TYPE_ID:
				return getFinAccountTransTypeId();
			case FinaccountPackage.FIN_ACCOUNT_TRANS__GL_RECONCILIATION_ID:
				return getGlReconciliationId();
			case FinaccountPackage.FIN_ACCOUNT_TRANS__ORDER_ID:
				return getOrderId();
			case FinaccountPackage.FIN_ACCOUNT_TRANS__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case FinaccountPackage.FIN_ACCOUNT_TRANS__PARTY_ID:
				return getPartyId();
			case FinaccountPackage.FIN_ACCOUNT_TRANS__PAYMENT_ID:
				return getPaymentId();
			case FinaccountPackage.FIN_ACCOUNT_TRANS__PERFORMED_BY_PARTY_ID:
				return getPerformedByPartyId();
			case FinaccountPackage.FIN_ACCOUNT_TRANS__REASON_ENUM_ID:
				return getReasonEnumId();
			case FinaccountPackage.FIN_ACCOUNT_TRANS__STATUS_ID:
				return getStatusId();
			case FinaccountPackage.FIN_ACCOUNT_TRANS__TRANSACTION_DATE:
				return getTransactionDate();
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
			case FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_ID:
				setFinAccountId((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_TYPE_ID:
				setFinAccountTransTypeId((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__GL_RECONCILIATION_ID:
				setGlReconciliationId((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__ORDER_ID:
				setOrderId((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__PAYMENT_ID:
				setPaymentId((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__PERFORMED_BY_PARTY_ID:
				setPerformedByPartyId((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__REASON_ENUM_ID:
				setReasonEnumId((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__STATUS_ID:
				setStatusId((String)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__TRANSACTION_DATE:
				setTransactionDate((Date)newValue);
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
			case FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_ID:
				setFinAccountId(FIN_ACCOUNT_ID_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_TYPE_ID:
				setFinAccountTransTypeId(FIN_ACCOUNT_TRANS_TYPE_ID_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__GL_RECONCILIATION_ID:
				setGlReconciliationId(GL_RECONCILIATION_ID_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__PAYMENT_ID:
				setPaymentId(PAYMENT_ID_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__PERFORMED_BY_PARTY_ID:
				setPerformedByPartyId(PERFORMED_BY_PARTY_ID_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__REASON_ENUM_ID:
				setReasonEnumId(REASON_ENUM_ID_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TRANS__TRANSACTION_DATE:
				setTransactionDate(TRANSACTION_DATE_EDEFAULT);
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
			case FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_ID:
				return FIN_ACCOUNT_ID_EDEFAULT == null ? finAccountId != null : !FIN_ACCOUNT_ID_EDEFAULT.equals(finAccountId);
			case FinaccountPackage.FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_TYPE_ID:
				return FIN_ACCOUNT_TRANS_TYPE_ID_EDEFAULT == null ? finAccountTransTypeId != null : !FIN_ACCOUNT_TRANS_TYPE_ID_EDEFAULT.equals(finAccountTransTypeId);
			case FinaccountPackage.FIN_ACCOUNT_TRANS__GL_RECONCILIATION_ID:
				return GL_RECONCILIATION_ID_EDEFAULT == null ? glReconciliationId != null : !GL_RECONCILIATION_ID_EDEFAULT.equals(glReconciliationId);
			case FinaccountPackage.FIN_ACCOUNT_TRANS__ORDER_ID:
				return ORDER_ID_EDEFAULT == null ? orderId != null : !ORDER_ID_EDEFAULT.equals(orderId);
			case FinaccountPackage.FIN_ACCOUNT_TRANS__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case FinaccountPackage.FIN_ACCOUNT_TRANS__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case FinaccountPackage.FIN_ACCOUNT_TRANS__PAYMENT_ID:
				return PAYMENT_ID_EDEFAULT == null ? paymentId != null : !PAYMENT_ID_EDEFAULT.equals(paymentId);
			case FinaccountPackage.FIN_ACCOUNT_TRANS__PERFORMED_BY_PARTY_ID:
				return PERFORMED_BY_PARTY_ID_EDEFAULT == null ? performedByPartyId != null : !PERFORMED_BY_PARTY_ID_EDEFAULT.equals(performedByPartyId);
			case FinaccountPackage.FIN_ACCOUNT_TRANS__REASON_ENUM_ID:
				return REASON_ENUM_ID_EDEFAULT == null ? reasonEnumId != null : !REASON_ENUM_ID_EDEFAULT.equals(reasonEnumId);
			case FinaccountPackage.FIN_ACCOUNT_TRANS__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
			case FinaccountPackage.FIN_ACCOUNT_TRANS__TRANSACTION_DATE:
				return TRANSACTION_DATE_EDEFAULT == null ? transactionDate != null : !TRANSACTION_DATE_EDEFAULT.equals(transactionDate);
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
		result.append(", finAccountId: ");
		result.append(finAccountId);
		result.append(", finAccountTransTypeId: ");
		result.append(finAccountTransTypeId);
		result.append(", glReconciliationId: ");
		result.append(glReconciliationId);
		result.append(", orderId: ");
		result.append(orderId);
		result.append(", orderItemSeqId: ");
		result.append(orderItemSeqId);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", paymentId: ");
		result.append(paymentId);
		result.append(", performedByPartyId: ");
		result.append(performedByPartyId);
		result.append(", reasonEnumId: ");
		result.append(reasonEnumId);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(", transactionDate: ");
		result.append(transactionDate);
		result.append(", finAccountTransAttributes: ");
		result.append(finAccountTransAttributes);
		result.append(')');
		return result.toString();
	}

} //FinAccountTransImpl
