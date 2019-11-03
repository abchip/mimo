/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import java.util.Collection;
import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.accounting.ledger.AcctgTrans;
import org.abchip.mimo.biz.accounting.ledger.AcctgTransType;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acctg Trans</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getAcctgTransId <em>Acctg Trans Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getAcctgTransTypeId <em>Acctg Trans Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getFinAccountTransId <em>Fin Account Trans Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getGlFiscalTypeId <em>Gl Fiscal Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getGlJournalId <em>Gl Journal Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getGroupStatusId <em>Group Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#isIsPosted <em>Is Posted</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getPaymentId <em>Payment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getPhysicalInventoryId <em>Physical Inventory Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getPostedDate <em>Posted Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getReceiptId <em>Receipt Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getScheduledPostingDate <em>Scheduled Posting Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getTheirAcctgTransId <em>Their Acctg Trans Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getTransactionDate <em>Transaction Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getVoucherDate <em>Voucher Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getVoucherRef <em>Voucher Ref</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getAcctgTransAttributes <em>Acctg Trans Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getAcctgTransEntries <em>Acctg Trans Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcctgTransImpl extends BizEntityTypedImpl<AcctgTransType> implements AcctgTrans {
	/**
	 * The default value of the '{@link #getAcctgTransId() <em>Acctg Trans Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcctgTransId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCTG_TRANS_ID_EDEFAULT = null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getAcctgTransId() <em>Acctg Trans Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcctgTransId()
	 * @generated
	 * @ordered
	 */
	protected String acctgTransId = ACCTG_TRANS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAcctgTransTypeId() <em>Acctg Trans Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcctgTransTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCTG_TRANS_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAcctgTransTypeId() <em>Acctg Trans Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcctgTransTypeId()
	 * @generated
	 * @ordered
	 */
	protected String acctgTransTypeId = ACCTG_TRANS_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_BY_USER_LOGIN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String createdByUserLogin = CREATED_BY_USER_LOGIN_EDEFAULT;
	/**
	 * The default value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected Date createdDate = CREATED_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
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
	 * The default value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected static final String FIXED_ASSET_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected String fixedAssetId = FIXED_ASSET_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getGlFiscalTypeId() <em>Gl Fiscal Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlFiscalTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String GL_FISCAL_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGlFiscalTypeId() <em>Gl Fiscal Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlFiscalTypeId()
	 * @generated
	 * @ordered
	 */
	protected String glFiscalTypeId = GL_FISCAL_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getGlJournalId() <em>Gl Journal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlJournalId()
	 * @generated
	 * @ordered
	 */
	protected static final String GL_JOURNAL_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGlJournalId() <em>Gl Journal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlJournalId()
	 * @generated
	 * @ordered
	 */
	protected String glJournalId = GL_JOURNAL_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getGroupStatusId() <em>Group Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_STATUS_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGroupStatusId() <em>Group Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupStatusId()
	 * @generated
	 * @ordered
	 */
	protected String groupStatusId = GROUP_STATUS_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getInventoryItemId() <em>Inventory Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVENTORY_ITEM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInventoryItemId() <em>Inventory Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemId()
	 * @generated
	 * @ordered
	 */
	protected String inventoryItemId = INVENTORY_ITEM_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getInvoiceId() <em>Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInvoiceId() <em>Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceId()
	 * @generated
	 * @ordered
	 */
	protected String invoiceId = INVOICE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #isIsPosted() <em>Is Posted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPosted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_POSTED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsPosted() <em>Is Posted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPosted()
	 * @generated
	 * @ordered
	 */
	protected boolean isPosted = IS_POSTED_EDEFAULT;
	/**
	 * The default value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String lastModifiedByUserLogin = LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT;
	/**
	 * The default value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MODIFIED_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastModifiedDate = LAST_MODIFIED_DATE_EDEFAULT;
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
	 * The default value of the '{@link #getPhysicalInventoryId() <em>Physical Inventory Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalInventoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSICAL_INVENTORY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPhysicalInventoryId() <em>Physical Inventory Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalInventoryId()
	 * @generated
	 * @ordered
	 */
	protected String physicalInventoryId = PHYSICAL_INVENTORY_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getPostedDate() <em>Posted Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date POSTED_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPostedDate() <em>Posted Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostedDate()
	 * @generated
	 * @ordered
	 */
	protected Date postedDate = POSTED_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getReceiptId() <em>Receipt Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptId()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEIPT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getReceiptId() <em>Receipt Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptId()
	 * @generated
	 * @ordered
	 */
	protected String receiptId = RECEIPT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected String roleTypeId = ROLE_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getScheduledPostingDate() <em>Scheduled Posting Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledPostingDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SCHEDULED_POSTING_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getScheduledPostingDate() <em>Scheduled Posting Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledPostingDate()
	 * @generated
	 * @ordered
	 */
	protected Date scheduledPostingDate = SCHEDULED_POSTING_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getShipmentId() <em>Shipment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getShipmentId() <em>Shipment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentId = SHIPMENT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getTheirAcctgTransId() <em>Their Acctg Trans Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheirAcctgTransId()
	 * @generated
	 * @ordered
	 */
	protected static final String THEIR_ACCTG_TRANS_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTheirAcctgTransId() <em>Their Acctg Trans Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheirAcctgTransId()
	 * @generated
	 * @ordered
	 */
	protected String theirAcctgTransId = THEIR_ACCTG_TRANS_ID_EDEFAULT;
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
	 * The default value of the '{@link #getVoucherDate() <em>Voucher Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoucherDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date VOUCHER_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getVoucherDate() <em>Voucher Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoucherDate()
	 * @generated
	 * @ordered
	 */
	protected Date voucherDate = VOUCHER_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getVoucherRef() <em>Voucher Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoucherRef()
	 * @generated
	 * @ordered
	 */
	protected static final String VOUCHER_REF_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getVoucherRef() <em>Voucher Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoucherRef()
	 * @generated
	 * @ordered
	 */
	protected String voucherRef = VOUCHER_REF_EDEFAULT;
	/**
	 * The default value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_EFFORT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected String workEffortId = WORK_EFFORT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAcctgTransAttributes() <em>Acctg Trans Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcctgTransAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> acctgTransAttributes;
	/**
	 * The cached value of the '{@link #getAcctgTransEntries() <em>Acctg Trans Entries</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcctgTransEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<String> acctgTransEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcctgTransImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.ACCTG_TRANS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreatedByUserLogin() {
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(String newCreatedByUserLogin) {
		String oldCreatedByUserLogin = createdByUserLogin;
		createdByUserLogin = newCreatedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		Date oldCreatedDate = createdDate;
		createdDate = newCreatedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__CREATED_DATE, oldCreatedDate, createdDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupStatusId() {
		return groupStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupStatusId(String newGroupStatusId) {
		String oldGroupStatusId = groupStatusId;
		groupStatusId = newGroupStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__GROUP_STATUS_ID, oldGroupStatusId, groupStatusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInventoryItemId() {
		return inventoryItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemId(String newInventoryItemId) {
		String oldInventoryItemId = inventoryItemId;
		inventoryItemId = newInventoryItemId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__INVENTORY_ITEM_ID, oldInventoryItemId, inventoryItemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedByUserLogin() {
		return lastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(String newLastModifiedByUserLogin) {
		String oldLastModifiedByUserLogin = lastModifiedByUserLogin;
		lastModifiedByUserLogin = newLastModifiedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__LAST_MODIFIED_BY_USER_LOGIN, oldLastModifiedByUserLogin, lastModifiedByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		Date oldLastModifiedDate = lastModifiedDate;
		lastModifiedDate = newLastModifiedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__LAST_MODIFIED_DATE, oldLastModifiedDate, lastModifiedDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__PARTY_ID, oldPartyId, partyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__PAYMENT_ID, oldPaymentId, paymentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPhysicalInventoryId() {
		return physicalInventoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalInventoryId(String newPhysicalInventoryId) {
		String oldPhysicalInventoryId = physicalInventoryId;
		physicalInventoryId = newPhysicalInventoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__PHYSICAL_INVENTORY_ID, oldPhysicalInventoryId, physicalInventoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPostedDate() {
		return postedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostedDate(Date newPostedDate) {
		Date oldPostedDate = postedDate;
		postedDate = newPostedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__POSTED_DATE, oldPostedDate, postedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReceiptId() {
		return receiptId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiptId(String newReceiptId) {
		String oldReceiptId = receiptId;
		receiptId = newReceiptId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__RECEIPT_ID, oldReceiptId, receiptId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleTypeId() {
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(String newRoleTypeId) {
		String oldRoleTypeId = roleTypeId;
		roleTypeId = newRoleTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__ROLE_TYPE_ID, oldRoleTypeId, roleTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getScheduledPostingDate() {
		return scheduledPostingDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScheduledPostingDate(Date newScheduledPostingDate) {
		Date oldScheduledPostingDate = scheduledPostingDate;
		scheduledPostingDate = newScheduledPostingDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__SCHEDULED_POSTING_DATE, oldScheduledPostingDate, scheduledPostingDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentId() {
		return shipmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentId(String newShipmentId) {
		String oldShipmentId = shipmentId;
		shipmentId = newShipmentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__SHIPMENT_ID, oldShipmentId, shipmentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTheirAcctgTransId() {
		return theirAcctgTransId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTheirAcctgTransId(String newTheirAcctgTransId) {
		String oldTheirAcctgTransId = theirAcctgTransId;
		theirAcctgTransId = newTheirAcctgTransId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__THEIR_ACCTG_TRANS_ID, oldTheirAcctgTransId, theirAcctgTransId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__TRANSACTION_DATE, oldTransactionDate, transactionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getVoucherDate() {
		return voucherDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoucherDate(Date newVoucherDate) {
		Date oldVoucherDate = voucherDate;
		voucherDate = newVoucherDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__VOUCHER_DATE, oldVoucherDate, voucherDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVoucherRef() {
		return voucherRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoucherRef(String newVoucherRef) {
		String oldVoucherRef = voucherRef;
		voucherRef = newVoucherRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__VOUCHER_REF, oldVoucherRef, voucherRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkEffortId() {
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortId(String newWorkEffortId) {
		String oldWorkEffortId = workEffortId;
		workEffortId = newWorkEffortId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__WORK_EFFORT_ID, oldWorkEffortId, workEffortId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getAcctgTransAttributes() {
		if (acctgTransAttributes == null) {
			acctgTransAttributes = new EDataTypeUniqueEList<String>(String.class, this, LedgerPackage.ACCTG_TRANS__ACCTG_TRANS_ATTRIBUTES);
		}
		return acctgTransAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getAcctgTransEntries() {
		if (acctgTransEntries == null) {
			acctgTransEntries = new EDataTypeUniqueEList<String>(String.class, this, LedgerPackage.ACCTG_TRANS__ACCTG_TRANS_ENTRIES);
		}
		return acctgTransEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGlJournalId() {
		return glJournalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlJournalId(String newGlJournalId) {
		String oldGlJournalId = glJournalId;
		glJournalId = newGlJournalId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__GL_JOURNAL_ID, oldGlJournalId, glJournalId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGlFiscalTypeId() {
		return glFiscalTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlFiscalTypeId(String newGlFiscalTypeId) {
		String oldGlFiscalTypeId = glFiscalTypeId;
		glFiscalTypeId = newGlFiscalTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__GL_FISCAL_TYPE_ID, oldGlFiscalTypeId, glFiscalTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFixedAssetId() {
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetId(String newFixedAssetId) {
		String oldFixedAssetId = fixedAssetId;
		fixedAssetId = newFixedAssetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__FIXED_ASSET_ID, oldFixedAssetId, fixedAssetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceId() {
		return invoiceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceId(String newInvoiceId) {
		String oldInvoiceId = invoiceId;
		invoiceId = newInvoiceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__INVOICE_ID, oldInvoiceId, invoiceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsPosted() {
		return isPosted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPosted(boolean newIsPosted) {
		boolean oldIsPosted = isPosted;
		isPosted = newIsPosted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__IS_POSTED, oldIsPosted, isPosted));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__FIN_ACCOUNT_TRANS_ID, oldFinAccountTransId, finAccountTransId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAcctgTransTypeId() {
		return acctgTransTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcctgTransTypeId(String newAcctgTransTypeId) {
		String oldAcctgTransTypeId = acctgTransTypeId;
		acctgTransTypeId = newAcctgTransTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__ACCTG_TRANS_TYPE_ID, oldAcctgTransTypeId, acctgTransTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAcctgTransId() {
		return acctgTransId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcctgTransId(String newAcctgTransId) {
		String oldAcctgTransId = acctgTransId;
		acctgTransId = newAcctgTransId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__ACCTG_TRANS_ID, oldAcctgTransId, acctgTransId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LedgerPackage.ACCTG_TRANS__ACCTG_TRANS_ID:
				return getAcctgTransId();
			case LedgerPackage.ACCTG_TRANS__ACCTG_TRANS_TYPE_ID:
				return getAcctgTransTypeId();
			case LedgerPackage.ACCTG_TRANS__CREATED_BY_USER_LOGIN:
				return getCreatedByUserLogin();
			case LedgerPackage.ACCTG_TRANS__CREATED_DATE:
				return getCreatedDate();
			case LedgerPackage.ACCTG_TRANS__DESCRIPTION:
				return getDescription();
			case LedgerPackage.ACCTG_TRANS__FIN_ACCOUNT_TRANS_ID:
				return getFinAccountTransId();
			case LedgerPackage.ACCTG_TRANS__FIXED_ASSET_ID:
				return getFixedAssetId();
			case LedgerPackage.ACCTG_TRANS__GL_FISCAL_TYPE_ID:
				return getGlFiscalTypeId();
			case LedgerPackage.ACCTG_TRANS__GL_JOURNAL_ID:
				return getGlJournalId();
			case LedgerPackage.ACCTG_TRANS__GROUP_STATUS_ID:
				return getGroupStatusId();
			case LedgerPackage.ACCTG_TRANS__INVENTORY_ITEM_ID:
				return getInventoryItemId();
			case LedgerPackage.ACCTG_TRANS__INVOICE_ID:
				return getInvoiceId();
			case LedgerPackage.ACCTG_TRANS__IS_POSTED:
				return isIsPosted();
			case LedgerPackage.ACCTG_TRANS__LAST_MODIFIED_BY_USER_LOGIN:
				return getLastModifiedByUserLogin();
			case LedgerPackage.ACCTG_TRANS__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case LedgerPackage.ACCTG_TRANS__PARTY_ID:
				return getPartyId();
			case LedgerPackage.ACCTG_TRANS__PAYMENT_ID:
				return getPaymentId();
			case LedgerPackage.ACCTG_TRANS__PHYSICAL_INVENTORY_ID:
				return getPhysicalInventoryId();
			case LedgerPackage.ACCTG_TRANS__POSTED_DATE:
				return getPostedDate();
			case LedgerPackage.ACCTG_TRANS__RECEIPT_ID:
				return getReceiptId();
			case LedgerPackage.ACCTG_TRANS__ROLE_TYPE_ID:
				return getRoleTypeId();
			case LedgerPackage.ACCTG_TRANS__SCHEDULED_POSTING_DATE:
				return getScheduledPostingDate();
			case LedgerPackage.ACCTG_TRANS__SHIPMENT_ID:
				return getShipmentId();
			case LedgerPackage.ACCTG_TRANS__THEIR_ACCTG_TRANS_ID:
				return getTheirAcctgTransId();
			case LedgerPackage.ACCTG_TRANS__TRANSACTION_DATE:
				return getTransactionDate();
			case LedgerPackage.ACCTG_TRANS__VOUCHER_DATE:
				return getVoucherDate();
			case LedgerPackage.ACCTG_TRANS__VOUCHER_REF:
				return getVoucherRef();
			case LedgerPackage.ACCTG_TRANS__WORK_EFFORT_ID:
				return getWorkEffortId();
			case LedgerPackage.ACCTG_TRANS__ACCTG_TRANS_ATTRIBUTES:
				return getAcctgTransAttributes();
			case LedgerPackage.ACCTG_TRANS__ACCTG_TRANS_ENTRIES:
				return getAcctgTransEntries();
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
			case LedgerPackage.ACCTG_TRANS__ACCTG_TRANS_ID:
				setAcctgTransId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__ACCTG_TRANS_TYPE_ID:
				setAcctgTransTypeId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__FIN_ACCOUNT_TRANS_ID:
				setFinAccountTransId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__FIXED_ASSET_ID:
				setFixedAssetId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__GL_FISCAL_TYPE_ID:
				setGlFiscalTypeId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__GL_JOURNAL_ID:
				setGlJournalId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__GROUP_STATUS_ID:
				setGroupStatusId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__INVENTORY_ITEM_ID:
				setInventoryItemId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__INVOICE_ID:
				setInvoiceId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__IS_POSTED:
				setIsPosted((Boolean)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__LAST_MODIFIED_DATE:
				setLastModifiedDate((Date)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__PAYMENT_ID:
				setPaymentId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__PHYSICAL_INVENTORY_ID:
				setPhysicalInventoryId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__POSTED_DATE:
				setPostedDate((Date)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__RECEIPT_ID:
				setReceiptId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__ROLE_TYPE_ID:
				setRoleTypeId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__SCHEDULED_POSTING_DATE:
				setScheduledPostingDate((Date)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__SHIPMENT_ID:
				setShipmentId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__THEIR_ACCTG_TRANS_ID:
				setTheirAcctgTransId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__TRANSACTION_DATE:
				setTransactionDate((Date)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__VOUCHER_DATE:
				setVoucherDate((Date)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__VOUCHER_REF:
				setVoucherRef((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__WORK_EFFORT_ID:
				setWorkEffortId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__ACCTG_TRANS_ATTRIBUTES:
				getAcctgTransAttributes().clear();
				getAcctgTransAttributes().addAll((Collection<? extends String>)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__ACCTG_TRANS_ENTRIES:
				getAcctgTransEntries().clear();
				getAcctgTransEntries().addAll((Collection<? extends String>)newValue);
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
			case LedgerPackage.ACCTG_TRANS__ACCTG_TRANS_ID:
				setAcctgTransId(ACCTG_TRANS_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__ACCTG_TRANS_TYPE_ID:
				setAcctgTransTypeId(ACCTG_TRANS_TYPE_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin(CREATED_BY_USER_LOGIN_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__FIN_ACCOUNT_TRANS_ID:
				setFinAccountTransId(FIN_ACCOUNT_TRANS_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__FIXED_ASSET_ID:
				setFixedAssetId(FIXED_ASSET_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__GL_FISCAL_TYPE_ID:
				setGlFiscalTypeId(GL_FISCAL_TYPE_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__GL_JOURNAL_ID:
				setGlJournalId(GL_JOURNAL_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__GROUP_STATUS_ID:
				setGroupStatusId(GROUP_STATUS_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__INVENTORY_ITEM_ID:
				setInventoryItemId(INVENTORY_ITEM_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__INVOICE_ID:
				setInvoiceId(INVOICE_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__IS_POSTED:
				setIsPosted(IS_POSTED_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin(LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__PAYMENT_ID:
				setPaymentId(PAYMENT_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__PHYSICAL_INVENTORY_ID:
				setPhysicalInventoryId(PHYSICAL_INVENTORY_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__POSTED_DATE:
				setPostedDate(POSTED_DATE_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__RECEIPT_ID:
				setReceiptId(RECEIPT_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__ROLE_TYPE_ID:
				setRoleTypeId(ROLE_TYPE_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__SCHEDULED_POSTING_DATE:
				setScheduledPostingDate(SCHEDULED_POSTING_DATE_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__SHIPMENT_ID:
				setShipmentId(SHIPMENT_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__THEIR_ACCTG_TRANS_ID:
				setTheirAcctgTransId(THEIR_ACCTG_TRANS_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__TRANSACTION_DATE:
				setTransactionDate(TRANSACTION_DATE_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__VOUCHER_DATE:
				setVoucherDate(VOUCHER_DATE_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__VOUCHER_REF:
				setVoucherRef(VOUCHER_REF_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__WORK_EFFORT_ID:
				setWorkEffortId(WORK_EFFORT_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__ACCTG_TRANS_ATTRIBUTES:
				getAcctgTransAttributes().clear();
				return;
			case LedgerPackage.ACCTG_TRANS__ACCTG_TRANS_ENTRIES:
				getAcctgTransEntries().clear();
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
			case LedgerPackage.ACCTG_TRANS__ACCTG_TRANS_ID:
				return ACCTG_TRANS_ID_EDEFAULT == null ? acctgTransId != null : !ACCTG_TRANS_ID_EDEFAULT.equals(acctgTransId);
			case LedgerPackage.ACCTG_TRANS__ACCTG_TRANS_TYPE_ID:
				return ACCTG_TRANS_TYPE_ID_EDEFAULT == null ? acctgTransTypeId != null : !ACCTG_TRANS_TYPE_ID_EDEFAULT.equals(acctgTransTypeId);
			case LedgerPackage.ACCTG_TRANS__CREATED_BY_USER_LOGIN:
				return CREATED_BY_USER_LOGIN_EDEFAULT == null ? createdByUserLogin != null : !CREATED_BY_USER_LOGIN_EDEFAULT.equals(createdByUserLogin);
			case LedgerPackage.ACCTG_TRANS__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case LedgerPackage.ACCTG_TRANS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case LedgerPackage.ACCTG_TRANS__FIN_ACCOUNT_TRANS_ID:
				return FIN_ACCOUNT_TRANS_ID_EDEFAULT == null ? finAccountTransId != null : !FIN_ACCOUNT_TRANS_ID_EDEFAULT.equals(finAccountTransId);
			case LedgerPackage.ACCTG_TRANS__FIXED_ASSET_ID:
				return FIXED_ASSET_ID_EDEFAULT == null ? fixedAssetId != null : !FIXED_ASSET_ID_EDEFAULT.equals(fixedAssetId);
			case LedgerPackage.ACCTG_TRANS__GL_FISCAL_TYPE_ID:
				return GL_FISCAL_TYPE_ID_EDEFAULT == null ? glFiscalTypeId != null : !GL_FISCAL_TYPE_ID_EDEFAULT.equals(glFiscalTypeId);
			case LedgerPackage.ACCTG_TRANS__GL_JOURNAL_ID:
				return GL_JOURNAL_ID_EDEFAULT == null ? glJournalId != null : !GL_JOURNAL_ID_EDEFAULT.equals(glJournalId);
			case LedgerPackage.ACCTG_TRANS__GROUP_STATUS_ID:
				return GROUP_STATUS_ID_EDEFAULT == null ? groupStatusId != null : !GROUP_STATUS_ID_EDEFAULT.equals(groupStatusId);
			case LedgerPackage.ACCTG_TRANS__INVENTORY_ITEM_ID:
				return INVENTORY_ITEM_ID_EDEFAULT == null ? inventoryItemId != null : !INVENTORY_ITEM_ID_EDEFAULT.equals(inventoryItemId);
			case LedgerPackage.ACCTG_TRANS__INVOICE_ID:
				return INVOICE_ID_EDEFAULT == null ? invoiceId != null : !INVOICE_ID_EDEFAULT.equals(invoiceId);
			case LedgerPackage.ACCTG_TRANS__IS_POSTED:
				return isPosted != IS_POSTED_EDEFAULT;
			case LedgerPackage.ACCTG_TRANS__LAST_MODIFIED_BY_USER_LOGIN:
				return LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT == null ? lastModifiedByUserLogin != null : !LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT.equals(lastModifiedByUserLogin);
			case LedgerPackage.ACCTG_TRANS__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case LedgerPackage.ACCTG_TRANS__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case LedgerPackage.ACCTG_TRANS__PAYMENT_ID:
				return PAYMENT_ID_EDEFAULT == null ? paymentId != null : !PAYMENT_ID_EDEFAULT.equals(paymentId);
			case LedgerPackage.ACCTG_TRANS__PHYSICAL_INVENTORY_ID:
				return PHYSICAL_INVENTORY_ID_EDEFAULT == null ? physicalInventoryId != null : !PHYSICAL_INVENTORY_ID_EDEFAULT.equals(physicalInventoryId);
			case LedgerPackage.ACCTG_TRANS__POSTED_DATE:
				return POSTED_DATE_EDEFAULT == null ? postedDate != null : !POSTED_DATE_EDEFAULT.equals(postedDate);
			case LedgerPackage.ACCTG_TRANS__RECEIPT_ID:
				return RECEIPT_ID_EDEFAULT == null ? receiptId != null : !RECEIPT_ID_EDEFAULT.equals(receiptId);
			case LedgerPackage.ACCTG_TRANS__ROLE_TYPE_ID:
				return ROLE_TYPE_ID_EDEFAULT == null ? roleTypeId != null : !ROLE_TYPE_ID_EDEFAULT.equals(roleTypeId);
			case LedgerPackage.ACCTG_TRANS__SCHEDULED_POSTING_DATE:
				return SCHEDULED_POSTING_DATE_EDEFAULT == null ? scheduledPostingDate != null : !SCHEDULED_POSTING_DATE_EDEFAULT.equals(scheduledPostingDate);
			case LedgerPackage.ACCTG_TRANS__SHIPMENT_ID:
				return SHIPMENT_ID_EDEFAULT == null ? shipmentId != null : !SHIPMENT_ID_EDEFAULT.equals(shipmentId);
			case LedgerPackage.ACCTG_TRANS__THEIR_ACCTG_TRANS_ID:
				return THEIR_ACCTG_TRANS_ID_EDEFAULT == null ? theirAcctgTransId != null : !THEIR_ACCTG_TRANS_ID_EDEFAULT.equals(theirAcctgTransId);
			case LedgerPackage.ACCTG_TRANS__TRANSACTION_DATE:
				return TRANSACTION_DATE_EDEFAULT == null ? transactionDate != null : !TRANSACTION_DATE_EDEFAULT.equals(transactionDate);
			case LedgerPackage.ACCTG_TRANS__VOUCHER_DATE:
				return VOUCHER_DATE_EDEFAULT == null ? voucherDate != null : !VOUCHER_DATE_EDEFAULT.equals(voucherDate);
			case LedgerPackage.ACCTG_TRANS__VOUCHER_REF:
				return VOUCHER_REF_EDEFAULT == null ? voucherRef != null : !VOUCHER_REF_EDEFAULT.equals(voucherRef);
			case LedgerPackage.ACCTG_TRANS__WORK_EFFORT_ID:
				return WORK_EFFORT_ID_EDEFAULT == null ? workEffortId != null : !WORK_EFFORT_ID_EDEFAULT.equals(workEffortId);
			case LedgerPackage.ACCTG_TRANS__ACCTG_TRANS_ATTRIBUTES:
				return acctgTransAttributes != null && !acctgTransAttributes.isEmpty();
			case LedgerPackage.ACCTG_TRANS__ACCTG_TRANS_ENTRIES:
				return acctgTransEntries != null && !acctgTransEntries.isEmpty();
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
		result.append(" (acctgTransId: ");
		result.append(acctgTransId);
		result.append(", acctgTransTypeId: ");
		result.append(acctgTransTypeId);
		result.append(", createdByUserLogin: ");
		result.append(createdByUserLogin);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(", description: ");
		result.append(description);
		result.append(", finAccountTransId: ");
		result.append(finAccountTransId);
		result.append(", fixedAssetId: ");
		result.append(fixedAssetId);
		result.append(", glFiscalTypeId: ");
		result.append(glFiscalTypeId);
		result.append(", glJournalId: ");
		result.append(glJournalId);
		result.append(", groupStatusId: ");
		result.append(groupStatusId);
		result.append(", inventoryItemId: ");
		result.append(inventoryItemId);
		result.append(", invoiceId: ");
		result.append(invoiceId);
		result.append(", isPosted: ");
		result.append(isPosted);
		result.append(", lastModifiedByUserLogin: ");
		result.append(lastModifiedByUserLogin);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", paymentId: ");
		result.append(paymentId);
		result.append(", physicalInventoryId: ");
		result.append(physicalInventoryId);
		result.append(", postedDate: ");
		result.append(postedDate);
		result.append(", receiptId: ");
		result.append(receiptId);
		result.append(", roleTypeId: ");
		result.append(roleTypeId);
		result.append(", scheduledPostingDate: ");
		result.append(scheduledPostingDate);
		result.append(", shipmentId: ");
		result.append(shipmentId);
		result.append(", theirAcctgTransId: ");
		result.append(theirAcctgTransId);
		result.append(", transactionDate: ");
		result.append(transactionDate);
		result.append(", voucherDate: ");
		result.append(voucherDate);
		result.append(", voucherRef: ");
		result.append(voucherRef);
		result.append(", workEffortId: ");
		result.append(workEffortId);
		result.append(", acctgTransAttributes: ");
		result.append(acctgTransAttributes);
		result.append(", acctgTransEntries: ");
		result.append(acctgTransEntries);
		result.append(')');
		return result.toString();
	}

} //AcctgTransImpl
