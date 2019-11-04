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

import org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.accounting.invoice.Invoice;
import org.abchip.mimo.biz.accounting.ledger.AcctgTrans;
import org.abchip.mimo.biz.accounting.ledger.AcctgTransType;
import org.abchip.mimo.biz.accounting.ledger.GlFiscalType;
import org.abchip.mimo.biz.accounting.ledger.GlJournal;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.accounting.payment.Payment;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.RoleType;
import org.abchip.mimo.biz.product.inventory.InventoryItem;
import org.abchip.mimo.biz.product.inventory.PhysicalInventory;
import org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt;
import org.abchip.mimo.biz.shipment.shipment.Shipment;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#isIsPosted <em>Is Posted</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getPostedDate <em>Posted Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getScheduledPostingDate <em>Scheduled Posting Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getTheirAcctgTransId <em>Their Acctg Trans Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getTransactionDate <em>Transaction Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getVoucherDate <em>Voucher Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getVoucherRef <em>Voucher Ref</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getAcctgTransTypeId <em>Acctg Trans Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getGlJournalId <em>Gl Journal Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getGlFiscalTypeId <em>Gl Fiscal Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getGroupStatusId <em>Group Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getPhysicalInventoryId <em>Physical Inventory Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getPaymentId <em>Payment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getFinAccountTransId <em>Fin Account Trans Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl#getReceiptId <em>Receipt Id</em>}</li>
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
	 * The cached value of the '{@link #getAcctgTransTypeId() <em>Acctg Trans Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcctgTransTypeId()
	 * @generated
	 * @ordered
	 */
	protected AcctgTransType acctgTransTypeId;
	/**
	 * The cached value of the '{@link #getGlJournalId() <em>Gl Journal Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlJournalId()
	 * @generated
	 * @ordered
	 */
	protected GlJournal glJournalId;
	/**
	 * The cached value of the '{@link #getGlFiscalTypeId() <em>Gl Fiscal Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlFiscalTypeId()
	 * @generated
	 * @ordered
	 */
	protected GlFiscalType glFiscalTypeId;
	/**
	 * The cached value of the '{@link #getGroupStatusId() <em>Group Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem groupStatusId;
	/**
	 * The cached value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected FixedAsset fixedAssetId;
	/**
	 * The cached value of the '{@link #getPhysicalInventoryId() <em>Physical Inventory Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalInventoryId()
	 * @generated
	 * @ordered
	 */
	protected PhysicalInventory physicalInventoryId;
	/**
	 * The cached value of the '{@link #getInventoryItemId() <em>Inventory Item Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemId()
	 * @generated
	 * @ordered
	 */
	protected InventoryItem inventoryItemId;
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
	 * The cached value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleTypeId;
	/**
	 * The cached value of the '{@link #getInvoiceId() <em>Invoice Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceId()
	 * @generated
	 * @ordered
	 */
	protected Invoice invoiceId;
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
	 * The cached value of the '{@link #getFinAccountTransId() <em>Fin Account Trans Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountTransId()
	 * @generated
	 * @ordered
	 */
	protected FinAccountTrans finAccountTransId;
	/**
	 * The cached value of the '{@link #getShipmentId() <em>Shipment Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentId()
	 * @generated
	 * @ordered
	 */
	protected Shipment shipmentId;
	/**
	 * The cached value of the '{@link #getReceiptId() <em>Receipt Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptId()
	 * @generated
	 * @ordered
	 */
	protected ShipmentReceipt receiptId;
	/**
	 * The cached value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected WorkEffort workEffortId;

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
	public StatusItem getGroupStatusId() {
		if (groupStatusId != null && ((EObject)groupStatusId).eIsProxy()) {
			InternalEObject oldGroupStatusId = (InternalEObject)groupStatusId;
			groupStatusId = (StatusItem)eResolveProxy(oldGroupStatusId);
			if (groupStatusId != oldGroupStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS__GROUP_STATUS_ID, oldGroupStatusId, groupStatusId));
			}
		}
		return groupStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetGroupStatusId() {
		return groupStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupStatusId(StatusItem newGroupStatusId) {
		StatusItem oldGroupStatusId = groupStatusId;
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
	public InventoryItem getInventoryItemId() {
		if (inventoryItemId != null && ((EObject)inventoryItemId).eIsProxy()) {
			InternalEObject oldInventoryItemId = (InternalEObject)inventoryItemId;
			inventoryItemId = (InventoryItem)eResolveProxy(oldInventoryItemId);
			if (inventoryItemId != oldInventoryItemId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS__INVENTORY_ITEM_ID, oldInventoryItemId, inventoryItemId));
			}
		}
		return inventoryItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryItem basicGetInventoryItemId() {
		return inventoryItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemId(InventoryItem newInventoryItemId) {
		InventoryItem oldInventoryItemId = inventoryItemId;
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
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS__PARTY_ID, oldPartyId, partyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__PARTY_ID, oldPartyId, partyId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS__PAYMENT_ID, oldPaymentId, paymentId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__PAYMENT_ID, oldPaymentId, paymentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalInventory getPhysicalInventoryId() {
		if (physicalInventoryId != null && ((EObject)physicalInventoryId).eIsProxy()) {
			InternalEObject oldPhysicalInventoryId = (InternalEObject)physicalInventoryId;
			physicalInventoryId = (PhysicalInventory)eResolveProxy(oldPhysicalInventoryId);
			if (physicalInventoryId != oldPhysicalInventoryId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS__PHYSICAL_INVENTORY_ID, oldPhysicalInventoryId, physicalInventoryId));
			}
		}
		return physicalInventoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalInventory basicGetPhysicalInventoryId() {
		return physicalInventoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalInventoryId(PhysicalInventory newPhysicalInventoryId) {
		PhysicalInventory oldPhysicalInventoryId = physicalInventoryId;
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
	public ShipmentReceipt getReceiptId() {
		if (receiptId != null && ((EObject)receiptId).eIsProxy()) {
			InternalEObject oldReceiptId = (InternalEObject)receiptId;
			receiptId = (ShipmentReceipt)eResolveProxy(oldReceiptId);
			if (receiptId != oldReceiptId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS__RECEIPT_ID, oldReceiptId, receiptId));
			}
		}
		return receiptId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipmentReceipt basicGetReceiptId() {
		return receiptId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiptId(ShipmentReceipt newReceiptId) {
		ShipmentReceipt oldReceiptId = receiptId;
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
	public RoleType getRoleTypeId() {
		if (roleTypeId != null && ((EObject)roleTypeId).eIsProxy()) {
			InternalEObject oldRoleTypeId = (InternalEObject)roleTypeId;
			roleTypeId = (RoleType)eResolveProxy(oldRoleTypeId);
			if (roleTypeId != oldRoleTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS__ROLE_TYPE_ID, oldRoleTypeId, roleTypeId));
			}
		}
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetRoleTypeId() {
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(RoleType newRoleTypeId) {
		RoleType oldRoleTypeId = roleTypeId;
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
	public Shipment getShipmentId() {
		if (shipmentId != null && ((EObject)shipmentId).eIsProxy()) {
			InternalEObject oldShipmentId = (InternalEObject)shipmentId;
			shipmentId = (Shipment)eResolveProxy(oldShipmentId);
			if (shipmentId != oldShipmentId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS__SHIPMENT_ID, oldShipmentId, shipmentId));
			}
		}
		return shipmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shipment basicGetShipmentId() {
		return shipmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentId(Shipment newShipmentId) {
		Shipment oldShipmentId = shipmentId;
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
	public WorkEffort getWorkEffortId() {
		if (workEffortId != null && ((EObject)workEffortId).eIsProxy()) {
			InternalEObject oldWorkEffortId = (InternalEObject)workEffortId;
			workEffortId = (WorkEffort)eResolveProxy(oldWorkEffortId);
			if (workEffortId != oldWorkEffortId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS__WORK_EFFORT_ID, oldWorkEffortId, workEffortId));
			}
		}
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEffort basicGetWorkEffortId() {
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortId(WorkEffort newWorkEffortId) {
		WorkEffort oldWorkEffortId = workEffortId;
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
	public GlJournal getGlJournalId() {
		if (glJournalId != null && ((EObject)glJournalId).eIsProxy()) {
			InternalEObject oldGlJournalId = (InternalEObject)glJournalId;
			glJournalId = (GlJournal)eResolveProxy(oldGlJournalId);
			if (glJournalId != oldGlJournalId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS__GL_JOURNAL_ID, oldGlJournalId, glJournalId));
			}
		}
		return glJournalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlJournal basicGetGlJournalId() {
		return glJournalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlJournalId(GlJournal newGlJournalId) {
		GlJournal oldGlJournalId = glJournalId;
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
	public GlFiscalType getGlFiscalTypeId() {
		if (glFiscalTypeId != null && ((EObject)glFiscalTypeId).eIsProxy()) {
			InternalEObject oldGlFiscalTypeId = (InternalEObject)glFiscalTypeId;
			glFiscalTypeId = (GlFiscalType)eResolveProxy(oldGlFiscalTypeId);
			if (glFiscalTypeId != oldGlFiscalTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS__GL_FISCAL_TYPE_ID, oldGlFiscalTypeId, glFiscalTypeId));
			}
		}
		return glFiscalTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlFiscalType basicGetGlFiscalTypeId() {
		return glFiscalTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlFiscalTypeId(GlFiscalType newGlFiscalTypeId) {
		GlFiscalType oldGlFiscalTypeId = glFiscalTypeId;
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
	public FixedAsset getFixedAssetId() {
		if (fixedAssetId != null && ((EObject)fixedAssetId).eIsProxy()) {
			InternalEObject oldFixedAssetId = (InternalEObject)fixedAssetId;
			fixedAssetId = (FixedAsset)eResolveProxy(oldFixedAssetId);
			if (fixedAssetId != oldFixedAssetId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS__FIXED_ASSET_ID, oldFixedAssetId, fixedAssetId));
			}
		}
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedAsset basicGetFixedAssetId() {
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetId(FixedAsset newFixedAssetId) {
		FixedAsset oldFixedAssetId = fixedAssetId;
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
	public Invoice getInvoiceId() {
		if (invoiceId != null && ((EObject)invoiceId).eIsProxy()) {
			InternalEObject oldInvoiceId = (InternalEObject)invoiceId;
			invoiceId = (Invoice)eResolveProxy(oldInvoiceId);
			if (invoiceId != oldInvoiceId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS__INVOICE_ID, oldInvoiceId, invoiceId));
			}
		}
		return invoiceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoice basicGetInvoiceId() {
		return invoiceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceId(Invoice newInvoiceId) {
		Invoice oldInvoiceId = invoiceId;
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
	public FinAccountTrans getFinAccountTransId() {
		if (finAccountTransId != null && ((EObject)finAccountTransId).eIsProxy()) {
			InternalEObject oldFinAccountTransId = (InternalEObject)finAccountTransId;
			finAccountTransId = (FinAccountTrans)eResolveProxy(oldFinAccountTransId);
			if (finAccountTransId != oldFinAccountTransId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS__FIN_ACCOUNT_TRANS_ID, oldFinAccountTransId, finAccountTransId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS__FIN_ACCOUNT_TRANS_ID, oldFinAccountTransId, finAccountTransId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcctgTransType getAcctgTransTypeId() {
		if (acctgTransTypeId != null && ((EObject)acctgTransTypeId).eIsProxy()) {
			InternalEObject oldAcctgTransTypeId = (InternalEObject)acctgTransTypeId;
			acctgTransTypeId = (AcctgTransType)eResolveProxy(oldAcctgTransTypeId);
			if (acctgTransTypeId != oldAcctgTransTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS__ACCTG_TRANS_TYPE_ID, oldAcctgTransTypeId, acctgTransTypeId));
			}
		}
		return acctgTransTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcctgTransType basicGetAcctgTransTypeId() {
		return acctgTransTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcctgTransTypeId(AcctgTransType newAcctgTransTypeId) {
		AcctgTransType oldAcctgTransTypeId = acctgTransTypeId;
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
			case LedgerPackage.ACCTG_TRANS__CREATED_BY_USER_LOGIN:
				return getCreatedByUserLogin();
			case LedgerPackage.ACCTG_TRANS__CREATED_DATE:
				return getCreatedDate();
			case LedgerPackage.ACCTG_TRANS__DESCRIPTION:
				return getDescription();
			case LedgerPackage.ACCTG_TRANS__IS_POSTED:
				return isIsPosted();
			case LedgerPackage.ACCTG_TRANS__LAST_MODIFIED_BY_USER_LOGIN:
				return getLastModifiedByUserLogin();
			case LedgerPackage.ACCTG_TRANS__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case LedgerPackage.ACCTG_TRANS__POSTED_DATE:
				return getPostedDate();
			case LedgerPackage.ACCTG_TRANS__SCHEDULED_POSTING_DATE:
				return getScheduledPostingDate();
			case LedgerPackage.ACCTG_TRANS__THEIR_ACCTG_TRANS_ID:
				return getTheirAcctgTransId();
			case LedgerPackage.ACCTG_TRANS__TRANSACTION_DATE:
				return getTransactionDate();
			case LedgerPackage.ACCTG_TRANS__VOUCHER_DATE:
				return getVoucherDate();
			case LedgerPackage.ACCTG_TRANS__VOUCHER_REF:
				return getVoucherRef();
			case LedgerPackage.ACCTG_TRANS__ACCTG_TRANS_TYPE_ID:
				if (resolve) return getAcctgTransTypeId();
				return basicGetAcctgTransTypeId();
			case LedgerPackage.ACCTG_TRANS__GL_JOURNAL_ID:
				if (resolve) return getGlJournalId();
				return basicGetGlJournalId();
			case LedgerPackage.ACCTG_TRANS__GL_FISCAL_TYPE_ID:
				if (resolve) return getGlFiscalTypeId();
				return basicGetGlFiscalTypeId();
			case LedgerPackage.ACCTG_TRANS__GROUP_STATUS_ID:
				if (resolve) return getGroupStatusId();
				return basicGetGroupStatusId();
			case LedgerPackage.ACCTG_TRANS__FIXED_ASSET_ID:
				if (resolve) return getFixedAssetId();
				return basicGetFixedAssetId();
			case LedgerPackage.ACCTG_TRANS__PHYSICAL_INVENTORY_ID:
				if (resolve) return getPhysicalInventoryId();
				return basicGetPhysicalInventoryId();
			case LedgerPackage.ACCTG_TRANS__INVENTORY_ITEM_ID:
				if (resolve) return getInventoryItemId();
				return basicGetInventoryItemId();
			case LedgerPackage.ACCTG_TRANS__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case LedgerPackage.ACCTG_TRANS__ROLE_TYPE_ID:
				if (resolve) return getRoleTypeId();
				return basicGetRoleTypeId();
			case LedgerPackage.ACCTG_TRANS__INVOICE_ID:
				if (resolve) return getInvoiceId();
				return basicGetInvoiceId();
			case LedgerPackage.ACCTG_TRANS__PAYMENT_ID:
				if (resolve) return getPaymentId();
				return basicGetPaymentId();
			case LedgerPackage.ACCTG_TRANS__FIN_ACCOUNT_TRANS_ID:
				if (resolve) return getFinAccountTransId();
				return basicGetFinAccountTransId();
			case LedgerPackage.ACCTG_TRANS__SHIPMENT_ID:
				if (resolve) return getShipmentId();
				return basicGetShipmentId();
			case LedgerPackage.ACCTG_TRANS__RECEIPT_ID:
				if (resolve) return getReceiptId();
				return basicGetReceiptId();
			case LedgerPackage.ACCTG_TRANS__WORK_EFFORT_ID:
				if (resolve) return getWorkEffortId();
				return basicGetWorkEffortId();
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
			case LedgerPackage.ACCTG_TRANS__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__DESCRIPTION:
				setDescription((String)newValue);
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
			case LedgerPackage.ACCTG_TRANS__POSTED_DATE:
				setPostedDate((Date)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__SCHEDULED_POSTING_DATE:
				setScheduledPostingDate((Date)newValue);
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
			case LedgerPackage.ACCTG_TRANS__ACCTG_TRANS_TYPE_ID:
				setAcctgTransTypeId((AcctgTransType)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__GL_JOURNAL_ID:
				setGlJournalId((GlJournal)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__GL_FISCAL_TYPE_ID:
				setGlFiscalTypeId((GlFiscalType)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__GROUP_STATUS_ID:
				setGroupStatusId((StatusItem)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__PHYSICAL_INVENTORY_ID:
				setPhysicalInventoryId((PhysicalInventory)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__INVENTORY_ITEM_ID:
				setInventoryItemId((InventoryItem)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__INVOICE_ID:
				setInvoiceId((Invoice)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__PAYMENT_ID:
				setPaymentId((Payment)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__FIN_ACCOUNT_TRANS_ID:
				setFinAccountTransId((FinAccountTrans)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__SHIPMENT_ID:
				setShipmentId((Shipment)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__RECEIPT_ID:
				setReceiptId((ShipmentReceipt)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)newValue);
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
			case LedgerPackage.ACCTG_TRANS__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin(CREATED_BY_USER_LOGIN_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case LedgerPackage.ACCTG_TRANS__POSTED_DATE:
				setPostedDate(POSTED_DATE_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS__SCHEDULED_POSTING_DATE:
				setScheduledPostingDate(SCHEDULED_POSTING_DATE_EDEFAULT);
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
			case LedgerPackage.ACCTG_TRANS__ACCTG_TRANS_TYPE_ID:
				setAcctgTransTypeId((AcctgTransType)null);
				return;
			case LedgerPackage.ACCTG_TRANS__GL_JOURNAL_ID:
				setGlJournalId((GlJournal)null);
				return;
			case LedgerPackage.ACCTG_TRANS__GL_FISCAL_TYPE_ID:
				setGlFiscalTypeId((GlFiscalType)null);
				return;
			case LedgerPackage.ACCTG_TRANS__GROUP_STATUS_ID:
				setGroupStatusId((StatusItem)null);
				return;
			case LedgerPackage.ACCTG_TRANS__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)null);
				return;
			case LedgerPackage.ACCTG_TRANS__PHYSICAL_INVENTORY_ID:
				setPhysicalInventoryId((PhysicalInventory)null);
				return;
			case LedgerPackage.ACCTG_TRANS__INVENTORY_ITEM_ID:
				setInventoryItemId((InventoryItem)null);
				return;
			case LedgerPackage.ACCTG_TRANS__PARTY_ID:
				setPartyId((Party)null);
				return;
			case LedgerPackage.ACCTG_TRANS__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)null);
				return;
			case LedgerPackage.ACCTG_TRANS__INVOICE_ID:
				setInvoiceId((Invoice)null);
				return;
			case LedgerPackage.ACCTG_TRANS__PAYMENT_ID:
				setPaymentId((Payment)null);
				return;
			case LedgerPackage.ACCTG_TRANS__FIN_ACCOUNT_TRANS_ID:
				setFinAccountTransId((FinAccountTrans)null);
				return;
			case LedgerPackage.ACCTG_TRANS__SHIPMENT_ID:
				setShipmentId((Shipment)null);
				return;
			case LedgerPackage.ACCTG_TRANS__RECEIPT_ID:
				setReceiptId((ShipmentReceipt)null);
				return;
			case LedgerPackage.ACCTG_TRANS__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)null);
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
			case LedgerPackage.ACCTG_TRANS__CREATED_BY_USER_LOGIN:
				return CREATED_BY_USER_LOGIN_EDEFAULT == null ? createdByUserLogin != null : !CREATED_BY_USER_LOGIN_EDEFAULT.equals(createdByUserLogin);
			case LedgerPackage.ACCTG_TRANS__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case LedgerPackage.ACCTG_TRANS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case LedgerPackage.ACCTG_TRANS__IS_POSTED:
				return isPosted != IS_POSTED_EDEFAULT;
			case LedgerPackage.ACCTG_TRANS__LAST_MODIFIED_BY_USER_LOGIN:
				return LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT == null ? lastModifiedByUserLogin != null : !LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT.equals(lastModifiedByUserLogin);
			case LedgerPackage.ACCTG_TRANS__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case LedgerPackage.ACCTG_TRANS__POSTED_DATE:
				return POSTED_DATE_EDEFAULT == null ? postedDate != null : !POSTED_DATE_EDEFAULT.equals(postedDate);
			case LedgerPackage.ACCTG_TRANS__SCHEDULED_POSTING_DATE:
				return SCHEDULED_POSTING_DATE_EDEFAULT == null ? scheduledPostingDate != null : !SCHEDULED_POSTING_DATE_EDEFAULT.equals(scheduledPostingDate);
			case LedgerPackage.ACCTG_TRANS__THEIR_ACCTG_TRANS_ID:
				return THEIR_ACCTG_TRANS_ID_EDEFAULT == null ? theirAcctgTransId != null : !THEIR_ACCTG_TRANS_ID_EDEFAULT.equals(theirAcctgTransId);
			case LedgerPackage.ACCTG_TRANS__TRANSACTION_DATE:
				return TRANSACTION_DATE_EDEFAULT == null ? transactionDate != null : !TRANSACTION_DATE_EDEFAULT.equals(transactionDate);
			case LedgerPackage.ACCTG_TRANS__VOUCHER_DATE:
				return VOUCHER_DATE_EDEFAULT == null ? voucherDate != null : !VOUCHER_DATE_EDEFAULT.equals(voucherDate);
			case LedgerPackage.ACCTG_TRANS__VOUCHER_REF:
				return VOUCHER_REF_EDEFAULT == null ? voucherRef != null : !VOUCHER_REF_EDEFAULT.equals(voucherRef);
			case LedgerPackage.ACCTG_TRANS__ACCTG_TRANS_TYPE_ID:
				return acctgTransTypeId != null;
			case LedgerPackage.ACCTG_TRANS__GL_JOURNAL_ID:
				return glJournalId != null;
			case LedgerPackage.ACCTG_TRANS__GL_FISCAL_TYPE_ID:
				return glFiscalTypeId != null;
			case LedgerPackage.ACCTG_TRANS__GROUP_STATUS_ID:
				return groupStatusId != null;
			case LedgerPackage.ACCTG_TRANS__FIXED_ASSET_ID:
				return fixedAssetId != null;
			case LedgerPackage.ACCTG_TRANS__PHYSICAL_INVENTORY_ID:
				return physicalInventoryId != null;
			case LedgerPackage.ACCTG_TRANS__INVENTORY_ITEM_ID:
				return inventoryItemId != null;
			case LedgerPackage.ACCTG_TRANS__PARTY_ID:
				return partyId != null;
			case LedgerPackage.ACCTG_TRANS__ROLE_TYPE_ID:
				return roleTypeId != null;
			case LedgerPackage.ACCTG_TRANS__INVOICE_ID:
				return invoiceId != null;
			case LedgerPackage.ACCTG_TRANS__PAYMENT_ID:
				return paymentId != null;
			case LedgerPackage.ACCTG_TRANS__FIN_ACCOUNT_TRANS_ID:
				return finAccountTransId != null;
			case LedgerPackage.ACCTG_TRANS__SHIPMENT_ID:
				return shipmentId != null;
			case LedgerPackage.ACCTG_TRANS__RECEIPT_ID:
				return receiptId != null;
			case LedgerPackage.ACCTG_TRANS__WORK_EFFORT_ID:
				return workEffortId != null;
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
		result.append(", createdByUserLogin: ");
		result.append(createdByUserLogin);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(", description: ");
		result.append(description);
		result.append(", isPosted: ");
		result.append(isPosted);
		result.append(", lastModifiedByUserLogin: ");
		result.append(lastModifiedByUserLogin);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", postedDate: ");
		result.append(postedDate);
		result.append(", scheduledPostingDate: ");
		result.append(scheduledPostingDate);
		result.append(", theirAcctgTransId: ");
		result.append(theirAcctgTransId);
		result.append(", transactionDate: ");
		result.append(transactionDate);
		result.append(", voucherDate: ");
		result.append(voucherDate);
		result.append(", voucherRef: ");
		result.append(voucherRef);
		result.append(", acctgTransAttributes: ");
		result.append(acctgTransAttributes);
		result.append(", acctgTransEntries: ");
		result.append(acctgTransEntries);
		result.append(')');
		return result.toString();
	}

} //AcctgTransImpl
