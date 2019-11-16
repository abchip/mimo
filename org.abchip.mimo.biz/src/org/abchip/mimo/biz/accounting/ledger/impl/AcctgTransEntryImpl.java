/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.accounting.ledger.AcctgTrans;
import org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry;
import org.abchip.mimo.biz.accounting.ledger.AcctgTransEntryType;
import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.accounting.ledger.GlAccountType;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.accounting.ledger.SettlementTerm;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.RoleType;
import org.abchip.mimo.biz.product.inventory.InventoryItem;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acctg Trans Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl#getAcctgTransEntrySeqId <em>Acctg Trans Entry Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl#isDebitCreditFlag <em>Debit Credit Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl#isIsSummary <em>Is Summary</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl#getOrigAmount <em>Orig Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl#getTaxId <em>Tax Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl#getTheirPartyId <em>Their Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl#getTheirProductId <em>Their Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl#getVoucherRef <em>Voucher Ref</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl#getAcctgTransEntryTypeId <em>Acctg Trans Entry Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl#getOrigCurrencyUomId <em>Orig Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl#getAcctgTransId <em>Acctg Trans Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl#getGlAccountTypeId <em>Gl Account Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl#getGlAccountId <em>Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl#getReconcileStatusId <em>Reconcile Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl#getSettlementTermId <em>Settlement Term Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcctgTransEntryImpl extends BizEntityTypedImpl<AcctgTransEntryType> implements AcctgTransEntry {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getAcctgTransEntrySeqId() <em>Acctg Trans Entry Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcctgTransEntrySeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCTG_TRANS_ENTRY_SEQ_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAcctgTransEntrySeqId() <em>Acctg Trans Entry Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcctgTransEntrySeqId()
	 * @generated
	 * @ordered
	 */
	protected String acctgTransEntrySeqId = ACCTG_TRANS_ENTRY_SEQ_ID_EDEFAULT;
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
	 * The default value of the '{@link #isDebitCreditFlag() <em>Debit Credit Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDebitCreditFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEBIT_CREDIT_FLAG_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isDebitCreditFlag() <em>Debit Credit Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDebitCreditFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean debitCreditFlag = DEBIT_CREDIT_FLAG_EDEFAULT;
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
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DUE_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected Date dueDate = DUE_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected String groupId = GROUP_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #isIsSummary() <em>Is Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSummary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SUMMARY_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsSummary() <em>Is Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSummary()
	 * @generated
	 * @ordered
	 */
	protected boolean isSummary = IS_SUMMARY_EDEFAULT;
	/**
	 * The default value of the '{@link #getOrganizationPartyId() <em>Organization Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_PARTY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOrganizationPartyId() <em>Organization Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationPartyId()
	 * @generated
	 * @ordered
	 */
	protected String organizationPartyId = ORGANIZATION_PARTY_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getOrigAmount() <em>Orig Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ORIG_AMOUNT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOrigAmount() <em>Orig Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal origAmount = ORIG_AMOUNT_EDEFAULT;
	/**
	 * The default value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected String productId = PRODUCT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getTaxId() <em>Tax Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxId()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTaxId() <em>Tax Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxId()
	 * @generated
	 * @ordered
	 */
	protected String taxId = TAX_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getTheirPartyId() <em>Their Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheirPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String THEIR_PARTY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTheirPartyId() <em>Their Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheirPartyId()
	 * @generated
	 * @ordered
	 */
	protected String theirPartyId = THEIR_PARTY_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getTheirProductId() <em>Their Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheirProductId()
	 * @generated
	 * @ordered
	 */
	protected static final String THEIR_PRODUCT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTheirProductId() <em>Their Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheirProductId()
	 * @generated
	 * @ordered
	 */
	protected String theirProductId = THEIR_PRODUCT_ID_EDEFAULT;
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
	 * The cached value of the '{@link #getAcctgTransEntryTypeId() <em>Acctg Trans Entry Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcctgTransEntryTypeId()
	 * @generated
	 * @ordered
	 */
	protected AcctgTransEntryType acctgTransEntryTypeId;
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
	 * The cached value of the '{@link #getOrigCurrencyUomId() <em>Orig Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom origCurrencyUomId;
	/**
	 * The cached value of the '{@link #getAcctgTransId() <em>Acctg Trans Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcctgTransId()
	 * @generated
	 * @ordered
	 */
	protected AcctgTrans acctgTransId;
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
	 * The cached value of the '{@link #getGlAccountTypeId() <em>Gl Account Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountTypeId()
	 * @generated
	 * @ordered
	 */
	protected GlAccountType glAccountTypeId;
	/**
	 * The cached value of the '{@link #getGlAccountId() <em>Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected GlAccount glAccountId;
	/**
	 * The cached value of the '{@link #getReconcileStatusId() <em>Reconcile Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconcileStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem reconcileStatusId;
	/**
	 * The cached value of the '{@link #getSettlementTermId() <em>Settlement Term Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettlementTermId()
	 * @generated
	 * @ordered
	 */
	protected SettlementTerm settlementTermId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcctgTransEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.ACCTG_TRANS_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAcctgTransEntrySeqId() {
		return acctgTransEntrySeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcctgTransEntrySeqId(String newAcctgTransEntrySeqId) {
		String oldAcctgTransEntrySeqId = acctgTransEntrySeqId;
		acctgTransEntrySeqId = newAcctgTransEntrySeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_ENTRY__ACCTG_TRANS_ENTRY_SEQ_ID, oldAcctgTransEntrySeqId, acctgTransEntrySeqId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_ENTRY__AMOUNT, oldAmount, amount));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS_ENTRY__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_ENTRY__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDebitCreditFlag() {
		return debitCreditFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDebitCreditFlag(boolean newDebitCreditFlag) {
		boolean oldDebitCreditFlag = debitCreditFlag;
		debitCreditFlag = newDebitCreditFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_ENTRY__DEBIT_CREDIT_FLAG, oldDebitCreditFlag, debitCreditFlag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_ENTRY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDueDate() {
		return dueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDueDate(Date newDueDate) {
		Date oldDueDate = dueDate;
		dueDate = newDueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_ENTRY__DUE_DATE, oldDueDate, dueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupId(String newGroupId) {
		String oldGroupId = groupId;
		groupId = newGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_ENTRY__GROUP_ID, oldGroupId, groupId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS_ENTRY__INVENTORY_ITEM_ID, oldInventoryItemId, inventoryItemId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_ENTRY__INVENTORY_ITEM_ID, oldInventoryItemId, inventoryItemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsSummary() {
		return isSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSummary(boolean newIsSummary) {
		boolean oldIsSummary = isSummary;
		isSummary = newIsSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_ENTRY__IS_SUMMARY, oldIsSummary, isSummary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrganizationPartyId() {
		return organizationPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationPartyId(String newOrganizationPartyId) {
		String oldOrganizationPartyId = organizationPartyId;
		organizationPartyId = newOrganizationPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_ENTRY__ORGANIZATION_PARTY_ID, oldOrganizationPartyId, organizationPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOrigAmount() {
		return origAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigAmount(BigDecimal newOrigAmount) {
		BigDecimal oldOrigAmount = origAmount;
		origAmount = newOrigAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_ENTRY__ORIG_AMOUNT, oldOrigAmount, origAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getOrigCurrencyUomId() {
		if (origCurrencyUomId != null && ((EObject)origCurrencyUomId).eIsProxy()) {
			InternalEObject oldOrigCurrencyUomId = (InternalEObject)origCurrencyUomId;
			origCurrencyUomId = (Uom)eResolveProxy(oldOrigCurrencyUomId);
			if (origCurrencyUomId != oldOrigCurrencyUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS_ENTRY__ORIG_CURRENCY_UOM_ID, oldOrigCurrencyUomId, origCurrencyUomId));
			}
		}
		return origCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetOrigCurrencyUomId() {
		return origCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigCurrencyUomId(Uom newOrigCurrencyUomId) {
		Uom oldOrigCurrencyUomId = origCurrencyUomId;
		origCurrencyUomId = newOrigCurrencyUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_ENTRY__ORIG_CURRENCY_UOM_ID, oldOrigCurrencyUomId, origCurrencyUomId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS_ENTRY__PARTY_ID, oldPartyId, partyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_ENTRY__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		String oldProductId = productId;
		productId = newProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_ENTRY__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getReconcileStatusId() {
		if (reconcileStatusId != null && ((EObject)reconcileStatusId).eIsProxy()) {
			InternalEObject oldReconcileStatusId = (InternalEObject)reconcileStatusId;
			reconcileStatusId = (StatusItem)eResolveProxy(oldReconcileStatusId);
			if (reconcileStatusId != oldReconcileStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS_ENTRY__RECONCILE_STATUS_ID, oldReconcileStatusId, reconcileStatusId));
			}
		}
		return reconcileStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetReconcileStatusId() {
		return reconcileStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReconcileStatusId(StatusItem newReconcileStatusId) {
		StatusItem oldReconcileStatusId = reconcileStatusId;
		reconcileStatusId = newReconcileStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_ENTRY__RECONCILE_STATUS_ID, oldReconcileStatusId, reconcileStatusId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS_ENTRY__ROLE_TYPE_ID, oldRoleTypeId, roleTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_ENTRY__ROLE_TYPE_ID, oldRoleTypeId, roleTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxId() {
		return taxId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxId(String newTaxId) {
		String oldTaxId = taxId;
		taxId = newTaxId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_ENTRY__TAX_ID, oldTaxId, taxId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTheirPartyId() {
		return theirPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTheirPartyId(String newTheirPartyId) {
		String oldTheirPartyId = theirPartyId;
		theirPartyId = newTheirPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_ENTRY__THEIR_PARTY_ID, oldTheirPartyId, theirPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTheirProductId() {
		return theirProductId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTheirProductId(String newTheirProductId) {
		String oldTheirProductId = theirProductId;
		theirProductId = newTheirProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_ENTRY__THEIR_PRODUCT_ID, oldTheirProductId, theirProductId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_ENTRY__VOUCHER_REF, oldVoucherRef, voucherRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcctgTransEntryType getAcctgTransEntryTypeId() {
		if (acctgTransEntryTypeId != null && ((EObject)acctgTransEntryTypeId).eIsProxy()) {
			InternalEObject oldAcctgTransEntryTypeId = (InternalEObject)acctgTransEntryTypeId;
			acctgTransEntryTypeId = (AcctgTransEntryType)eResolveProxy(oldAcctgTransEntryTypeId);
			if (acctgTransEntryTypeId != oldAcctgTransEntryTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS_ENTRY__ACCTG_TRANS_ENTRY_TYPE_ID, oldAcctgTransEntryTypeId, acctgTransEntryTypeId));
			}
		}
		return acctgTransEntryTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcctgTransEntryType basicGetAcctgTransEntryTypeId() {
		return acctgTransEntryTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcctgTransEntryTypeId(AcctgTransEntryType newAcctgTransEntryTypeId) {
		AcctgTransEntryType oldAcctgTransEntryTypeId = acctgTransEntryTypeId;
		acctgTransEntryTypeId = newAcctgTransEntryTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_ENTRY__ACCTG_TRANS_ENTRY_TYPE_ID, oldAcctgTransEntryTypeId, acctgTransEntryTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AcctgTrans getAcctgTransId() {
		if (acctgTransId != null && ((EObject)acctgTransId).eIsProxy()) {
			InternalEObject oldAcctgTransId = (InternalEObject)acctgTransId;
			acctgTransId = (AcctgTrans)eResolveProxy(oldAcctgTransId);
			if (acctgTransId != oldAcctgTransId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS_ENTRY__ACCTG_TRANS_ID, oldAcctgTransId, acctgTransId));
			}
		}
		return acctgTransId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcctgTrans basicGetAcctgTransId() {
		return acctgTransId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcctgTransId(AcctgTrans newAcctgTransId) {
		AcctgTrans oldAcctgTransId = acctgTransId;
		acctgTransId = newAcctgTransId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_ENTRY__ACCTG_TRANS_ID, oldAcctgTransId, acctgTransId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountType getGlAccountTypeId() {
		if (glAccountTypeId != null && ((EObject)glAccountTypeId).eIsProxy()) {
			InternalEObject oldGlAccountTypeId = (InternalEObject)glAccountTypeId;
			glAccountTypeId = (GlAccountType)eResolveProxy(oldGlAccountTypeId);
			if (glAccountTypeId != oldGlAccountTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS_ENTRY__GL_ACCOUNT_TYPE_ID, oldGlAccountTypeId, glAccountTypeId));
			}
		}
		return glAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccountType basicGetGlAccountTypeId() {
		return glAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountTypeId(GlAccountType newGlAccountTypeId) {
		GlAccountType oldGlAccountTypeId = glAccountTypeId;
		glAccountTypeId = newGlAccountTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_ENTRY__GL_ACCOUNT_TYPE_ID, oldGlAccountTypeId, glAccountTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount getGlAccountId() {
		if (glAccountId != null && ((EObject)glAccountId).eIsProxy()) {
			InternalEObject oldGlAccountId = (InternalEObject)glAccountId;
			glAccountId = (GlAccount)eResolveProxy(oldGlAccountId);
			if (glAccountId != oldGlAccountId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS_ENTRY__GL_ACCOUNT_ID, oldGlAccountId, glAccountId));
			}
		}
		return glAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccount basicGetGlAccountId() {
		return glAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountId(GlAccount newGlAccountId) {
		GlAccount oldGlAccountId = glAccountId;
		glAccountId = newGlAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_ENTRY__GL_ACCOUNT_ID, oldGlAccountId, glAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SettlementTerm getSettlementTermId() {
		if (settlementTermId != null && ((EObject)settlementTermId).eIsProxy()) {
			InternalEObject oldSettlementTermId = (InternalEObject)settlementTermId;
			settlementTermId = (SettlementTerm)eResolveProxy(oldSettlementTermId);
			if (settlementTermId != oldSettlementTermId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.ACCTG_TRANS_ENTRY__SETTLEMENT_TERM_ID, oldSettlementTermId, settlementTermId));
			}
		}
		return settlementTermId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SettlementTerm basicGetSettlementTermId() {
		return settlementTermId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSettlementTermId(SettlementTerm newSettlementTermId) {
		SettlementTerm oldSettlementTermId = settlementTermId;
		settlementTermId = newSettlementTermId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.ACCTG_TRANS_ENTRY__SETTLEMENT_TERM_ID, oldSettlementTermId, settlementTermId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LedgerPackage.ACCTG_TRANS_ENTRY__ACCTG_TRANS_ENTRY_SEQ_ID:
				return getAcctgTransEntrySeqId();
			case LedgerPackage.ACCTG_TRANS_ENTRY__AMOUNT:
				return getAmount();
			case LedgerPackage.ACCTG_TRANS_ENTRY__DEBIT_CREDIT_FLAG:
				return isDebitCreditFlag();
			case LedgerPackage.ACCTG_TRANS_ENTRY__DESCRIPTION:
				return getDescription();
			case LedgerPackage.ACCTG_TRANS_ENTRY__DUE_DATE:
				return getDueDate();
			case LedgerPackage.ACCTG_TRANS_ENTRY__GROUP_ID:
				return getGroupId();
			case LedgerPackage.ACCTG_TRANS_ENTRY__IS_SUMMARY:
				return isIsSummary();
			case LedgerPackage.ACCTG_TRANS_ENTRY__ORGANIZATION_PARTY_ID:
				return getOrganizationPartyId();
			case LedgerPackage.ACCTG_TRANS_ENTRY__ORIG_AMOUNT:
				return getOrigAmount();
			case LedgerPackage.ACCTG_TRANS_ENTRY__PRODUCT_ID:
				return getProductId();
			case LedgerPackage.ACCTG_TRANS_ENTRY__TAX_ID:
				return getTaxId();
			case LedgerPackage.ACCTG_TRANS_ENTRY__THEIR_PARTY_ID:
				return getTheirPartyId();
			case LedgerPackage.ACCTG_TRANS_ENTRY__THEIR_PRODUCT_ID:
				return getTheirProductId();
			case LedgerPackage.ACCTG_TRANS_ENTRY__VOUCHER_REF:
				return getVoucherRef();
			case LedgerPackage.ACCTG_TRANS_ENTRY__ACCTG_TRANS_ENTRY_TYPE_ID:
				if (resolve) return getAcctgTransEntryTypeId();
				return basicGetAcctgTransEntryTypeId();
			case LedgerPackage.ACCTG_TRANS_ENTRY__CURRENCY_UOM_ID:
				if (resolve) return getCurrencyUomId();
				return basicGetCurrencyUomId();
			case LedgerPackage.ACCTG_TRANS_ENTRY__ORIG_CURRENCY_UOM_ID:
				if (resolve) return getOrigCurrencyUomId();
				return basicGetOrigCurrencyUomId();
			case LedgerPackage.ACCTG_TRANS_ENTRY__ACCTG_TRANS_ID:
				if (resolve) return getAcctgTransId();
				return basicGetAcctgTransId();
			case LedgerPackage.ACCTG_TRANS_ENTRY__INVENTORY_ITEM_ID:
				if (resolve) return getInventoryItemId();
				return basicGetInventoryItemId();
			case LedgerPackage.ACCTG_TRANS_ENTRY__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case LedgerPackage.ACCTG_TRANS_ENTRY__ROLE_TYPE_ID:
				if (resolve) return getRoleTypeId();
				return basicGetRoleTypeId();
			case LedgerPackage.ACCTG_TRANS_ENTRY__GL_ACCOUNT_TYPE_ID:
				if (resolve) return getGlAccountTypeId();
				return basicGetGlAccountTypeId();
			case LedgerPackage.ACCTG_TRANS_ENTRY__GL_ACCOUNT_ID:
				if (resolve) return getGlAccountId();
				return basicGetGlAccountId();
			case LedgerPackage.ACCTG_TRANS_ENTRY__RECONCILE_STATUS_ID:
				if (resolve) return getReconcileStatusId();
				return basicGetReconcileStatusId();
			case LedgerPackage.ACCTG_TRANS_ENTRY__SETTLEMENT_TERM_ID:
				if (resolve) return getSettlementTermId();
				return basicGetSettlementTermId();
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
			case LedgerPackage.ACCTG_TRANS_ENTRY__ACCTG_TRANS_ENTRY_SEQ_ID:
				setAcctgTransEntrySeqId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__DEBIT_CREDIT_FLAG:
				setDebitCreditFlag((Boolean)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__DUE_DATE:
				setDueDate((Date)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__GROUP_ID:
				setGroupId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__IS_SUMMARY:
				setIsSummary((Boolean)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__ORIG_AMOUNT:
				setOrigAmount((BigDecimal)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__TAX_ID:
				setTaxId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__THEIR_PARTY_ID:
				setTheirPartyId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__THEIR_PRODUCT_ID:
				setTheirProductId((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__VOUCHER_REF:
				setVoucherRef((String)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__ACCTG_TRANS_ENTRY_TYPE_ID:
				setAcctgTransEntryTypeId((AcctgTransEntryType)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__ORIG_CURRENCY_UOM_ID:
				setOrigCurrencyUomId((Uom)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__ACCTG_TRANS_ID:
				setAcctgTransId((AcctgTrans)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__INVENTORY_ITEM_ID:
				setInventoryItemId((InventoryItem)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__GL_ACCOUNT_TYPE_ID:
				setGlAccountTypeId((GlAccountType)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__GL_ACCOUNT_ID:
				setGlAccountId((GlAccount)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__RECONCILE_STATUS_ID:
				setReconcileStatusId((StatusItem)newValue);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__SETTLEMENT_TERM_ID:
				setSettlementTermId((SettlementTerm)newValue);
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
			case LedgerPackage.ACCTG_TRANS_ENTRY__ACCTG_TRANS_ENTRY_SEQ_ID:
				setAcctgTransEntrySeqId(ACCTG_TRANS_ENTRY_SEQ_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__DEBIT_CREDIT_FLAG:
				setDebitCreditFlag(DEBIT_CREDIT_FLAG_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__DUE_DATE:
				setDueDate(DUE_DATE_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__IS_SUMMARY:
				setIsSummary(IS_SUMMARY_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId(ORGANIZATION_PARTY_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__ORIG_AMOUNT:
				setOrigAmount(ORIG_AMOUNT_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__TAX_ID:
				setTaxId(TAX_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__THEIR_PARTY_ID:
				setTheirPartyId(THEIR_PARTY_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__THEIR_PRODUCT_ID:
				setTheirProductId(THEIR_PRODUCT_ID_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__VOUCHER_REF:
				setVoucherRef(VOUCHER_REF_EDEFAULT);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__ACCTG_TRANS_ENTRY_TYPE_ID:
				setAcctgTransEntryTypeId((AcctgTransEntryType)null);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)null);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__ORIG_CURRENCY_UOM_ID:
				setOrigCurrencyUomId((Uom)null);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__ACCTG_TRANS_ID:
				setAcctgTransId((AcctgTrans)null);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__INVENTORY_ITEM_ID:
				setInventoryItemId((InventoryItem)null);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__PARTY_ID:
				setPartyId((Party)null);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)null);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__GL_ACCOUNT_TYPE_ID:
				setGlAccountTypeId((GlAccountType)null);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__GL_ACCOUNT_ID:
				setGlAccountId((GlAccount)null);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__RECONCILE_STATUS_ID:
				setReconcileStatusId((StatusItem)null);
				return;
			case LedgerPackage.ACCTG_TRANS_ENTRY__SETTLEMENT_TERM_ID:
				setSettlementTermId((SettlementTerm)null);
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
			case LedgerPackage.ACCTG_TRANS_ENTRY__ACCTG_TRANS_ENTRY_SEQ_ID:
				return ACCTG_TRANS_ENTRY_SEQ_ID_EDEFAULT == null ? acctgTransEntrySeqId != null : !ACCTG_TRANS_ENTRY_SEQ_ID_EDEFAULT.equals(acctgTransEntrySeqId);
			case LedgerPackage.ACCTG_TRANS_ENTRY__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case LedgerPackage.ACCTG_TRANS_ENTRY__DEBIT_CREDIT_FLAG:
				return debitCreditFlag != DEBIT_CREDIT_FLAG_EDEFAULT;
			case LedgerPackage.ACCTG_TRANS_ENTRY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case LedgerPackage.ACCTG_TRANS_ENTRY__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
			case LedgerPackage.ACCTG_TRANS_ENTRY__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
			case LedgerPackage.ACCTG_TRANS_ENTRY__IS_SUMMARY:
				return isSummary != IS_SUMMARY_EDEFAULT;
			case LedgerPackage.ACCTG_TRANS_ENTRY__ORGANIZATION_PARTY_ID:
				return ORGANIZATION_PARTY_ID_EDEFAULT == null ? organizationPartyId != null : !ORGANIZATION_PARTY_ID_EDEFAULT.equals(organizationPartyId);
			case LedgerPackage.ACCTG_TRANS_ENTRY__ORIG_AMOUNT:
				return ORIG_AMOUNT_EDEFAULT == null ? origAmount != null : !ORIG_AMOUNT_EDEFAULT.equals(origAmount);
			case LedgerPackage.ACCTG_TRANS_ENTRY__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case LedgerPackage.ACCTG_TRANS_ENTRY__TAX_ID:
				return TAX_ID_EDEFAULT == null ? taxId != null : !TAX_ID_EDEFAULT.equals(taxId);
			case LedgerPackage.ACCTG_TRANS_ENTRY__THEIR_PARTY_ID:
				return THEIR_PARTY_ID_EDEFAULT == null ? theirPartyId != null : !THEIR_PARTY_ID_EDEFAULT.equals(theirPartyId);
			case LedgerPackage.ACCTG_TRANS_ENTRY__THEIR_PRODUCT_ID:
				return THEIR_PRODUCT_ID_EDEFAULT == null ? theirProductId != null : !THEIR_PRODUCT_ID_EDEFAULT.equals(theirProductId);
			case LedgerPackage.ACCTG_TRANS_ENTRY__VOUCHER_REF:
				return VOUCHER_REF_EDEFAULT == null ? voucherRef != null : !VOUCHER_REF_EDEFAULT.equals(voucherRef);
			case LedgerPackage.ACCTG_TRANS_ENTRY__ACCTG_TRANS_ENTRY_TYPE_ID:
				return acctgTransEntryTypeId != null;
			case LedgerPackage.ACCTG_TRANS_ENTRY__CURRENCY_UOM_ID:
				return currencyUomId != null;
			case LedgerPackage.ACCTG_TRANS_ENTRY__ORIG_CURRENCY_UOM_ID:
				return origCurrencyUomId != null;
			case LedgerPackage.ACCTG_TRANS_ENTRY__ACCTG_TRANS_ID:
				return acctgTransId != null;
			case LedgerPackage.ACCTG_TRANS_ENTRY__INVENTORY_ITEM_ID:
				return inventoryItemId != null;
			case LedgerPackage.ACCTG_TRANS_ENTRY__PARTY_ID:
				return partyId != null;
			case LedgerPackage.ACCTG_TRANS_ENTRY__ROLE_TYPE_ID:
				return roleTypeId != null;
			case LedgerPackage.ACCTG_TRANS_ENTRY__GL_ACCOUNT_TYPE_ID:
				return glAccountTypeId != null;
			case LedgerPackage.ACCTG_TRANS_ENTRY__GL_ACCOUNT_ID:
				return glAccountId != null;
			case LedgerPackage.ACCTG_TRANS_ENTRY__RECONCILE_STATUS_ID:
				return reconcileStatusId != null;
			case LedgerPackage.ACCTG_TRANS_ENTRY__SETTLEMENT_TERM_ID:
				return settlementTermId != null;
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
		result.append(" (acctgTransEntrySeqId: ");
		result.append(acctgTransEntrySeqId);
		result.append(", amount: ");
		result.append(amount);
		result.append(", debitCreditFlag: ");
		result.append(debitCreditFlag);
		result.append(", description: ");
		result.append(description);
		result.append(", dueDate: ");
		result.append(dueDate);
		result.append(", groupId: ");
		result.append(groupId);
		result.append(", isSummary: ");
		result.append(isSummary);
		result.append(", organizationPartyId: ");
		result.append(organizationPartyId);
		result.append(", origAmount: ");
		result.append(origAmount);
		result.append(", productId: ");
		result.append(productId);
		result.append(", taxId: ");
		result.append(taxId);
		result.append(", theirPartyId: ");
		result.append(theirPartyId);
		result.append(", theirProductId: ");
		result.append(theirProductId);
		result.append(", voucherRef: ");
		result.append(voucherRef);
		result.append(')');
		return result.toString();
	}

} //AcctgTransEntryImpl
