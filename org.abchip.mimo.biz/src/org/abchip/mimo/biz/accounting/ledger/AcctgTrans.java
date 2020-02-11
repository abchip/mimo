/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.accounting.invoice.Invoice;
import org.abchip.mimo.biz.accounting.payment.Payment;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.RoleType;
import org.abchip.mimo.biz.product.inventory.InventoryItem;
import org.abchip.mimo.biz.product.inventory.PhysicalInventory;
import org.abchip.mimo.biz.shipment.receipt.ShipmentReceipt;
import org.abchip.mimo.biz.shipment.shipment.Shipment;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acctg Trans</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getAcctgTransId <em>Acctg Trans Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getAcctgTransAttributes <em>Acctg Trans Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getAcctgTransEntries <em>Acctg Trans Entries</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getAcctgTransTypeId <em>Acctg Trans Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getFinAccountTransId <em>Fin Account Trans Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getGlFiscalTypeId <em>Gl Fiscal Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getGlJournalId <em>Gl Journal Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getGroupStatusId <em>Group Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#isIsPosted <em>Is Posted</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getPaymentId <em>Payment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getPhysicalInventoryId <em>Physical Inventory Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getPostedDate <em>Posted Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getReceiptId <em>Receipt Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getScheduledPostingDate <em>Scheduled Posting Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getTheirAcctgTransId <em>Their Acctg Trans Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getTransactionDate <em>Transaction Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getVoucherDate <em>Voucher Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getVoucherRef <em>Voucher Ref</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getWorkEffortId <em>Work Effort Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans()
 * @model annotation="mimo-ent-frame title='Accounting Transaction' formula='description'"
 * @generated
 */
public interface AcctgTrans extends BizEntityTyped<AcctgTransType> {
	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' attribute.
	 * @see #setCreatedByUserLogin(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_CreatedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getCreatedByUserLogin <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' attribute.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Posted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Posted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Posted</em>' attribute.
	 * @see #setIsPosted(boolean)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_IsPosted()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsPosted();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#isIsPosted <em>Is Posted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Posted</em>' attribute.
	 * @see #isIsPosted()
	 * @generated
	 */
	void setIsPosted(boolean value);

	/**
	 * Returns the value of the '<em><b>Group Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Status Id</em>' reference.
	 * @see #setGroupStatusId(StatusItem)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_GroupStatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getGroupStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getGroupStatusId <em>Group Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Status Id</em>' reference.
	 * @see #getGroupStatusId()
	 * @generated
	 */
	void setGroupStatusId(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Inventory Item Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Item Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Id</em>' reference.
	 * @see #setInventoryItemId(InventoryItem)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_InventoryItemId()
	 * @model keys="inventoryItemId"
	 * @generated
	 */
	InventoryItem getInventoryItemId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getInventoryItemId <em>Inventory Item Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item Id</em>' reference.
	 * @see #getInventoryItemId()
	 * @generated
	 */
	void setInventoryItemId(InventoryItem value);

	/**
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #setLastModifiedByUserLogin(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_LastModifiedByUserLogin()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #setLastModifiedDate(Date)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' reference.
	 * @see #setPartyId(Party)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_PartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getPartyId <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' reference.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Payment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Id</em>' reference.
	 * @see #setPaymentId(Payment)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_PaymentId()
	 * @model keys="paymentId"
	 * @generated
	 */
	Payment getPaymentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getPaymentId <em>Payment Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Id</em>' reference.
	 * @see #getPaymentId()
	 * @generated
	 */
	void setPaymentId(Payment value);

	/**
	 * Returns the value of the '<em><b>Physical Inventory Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Inventory Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Inventory Id</em>' reference.
	 * @see #setPhysicalInventoryId(PhysicalInventory)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_PhysicalInventoryId()
	 * @model keys="physicalInventoryId"
	 * @generated
	 */
	PhysicalInventory getPhysicalInventoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getPhysicalInventoryId <em>Physical Inventory Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Inventory Id</em>' reference.
	 * @see #getPhysicalInventoryId()
	 * @generated
	 */
	void setPhysicalInventoryId(PhysicalInventory value);

	/**
	 * Returns the value of the '<em><b>Posted Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posted Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posted Date</em>' attribute.
	 * @see #setPostedDate(Date)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_PostedDate()
	 * @model
	 * @generated
	 */
	Date getPostedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getPostedDate <em>Posted Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posted Date</em>' attribute.
	 * @see #getPostedDate()
	 * @generated
	 */
	void setPostedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Receipt Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipt Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipt Id</em>' reference.
	 * @see #setReceiptId(ShipmentReceipt)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_ReceiptId()
	 * @model keys="receiptId"
	 * @generated
	 */
	ShipmentReceipt getReceiptId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getReceiptId <em>Receipt Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receipt Id</em>' reference.
	 * @see #getReceiptId()
	 * @generated
	 */
	void setReceiptId(ShipmentReceipt value);

	/**
	 * Returns the value of the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id</em>' reference.
	 * @see #setRoleTypeId(RoleType)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_RoleTypeId()
	 * @model keys="roleTypeId"
	 * @generated
	 */
	RoleType getRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getRoleTypeId <em>Role Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id</em>' reference.
	 * @see #getRoleTypeId()
	 * @generated
	 */
	void setRoleTypeId(RoleType value);

	/**
	 * Returns the value of the '<em><b>Scheduled Posting Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Posting Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Posting Date</em>' attribute.
	 * @see #setScheduledPostingDate(Date)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_ScheduledPostingDate()
	 * @model
	 * @generated
	 */
	Date getScheduledPostingDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getScheduledPostingDate <em>Scheduled Posting Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Posting Date</em>' attribute.
	 * @see #getScheduledPostingDate()
	 * @generated
	 */
	void setScheduledPostingDate(Date value);

	/**
	 * Returns the value of the '<em><b>Shipment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Id</em>' reference.
	 * @see #setShipmentId(Shipment)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_ShipmentId()
	 * @model keys="shipmentId"
	 * @generated
	 */
	Shipment getShipmentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getShipmentId <em>Shipment Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Id</em>' reference.
	 * @see #getShipmentId()
	 * @generated
	 */
	void setShipmentId(Shipment value);

	/**
	 * Returns the value of the '<em><b>Their Acctg Trans Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Their Acctg Trans Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Their Acctg Trans Id</em>' attribute.
	 * @see #setTheirAcctgTransId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_TheirAcctgTransId()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getTheirAcctgTransId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getTheirAcctgTransId <em>Their Acctg Trans Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Their Acctg Trans Id</em>' attribute.
	 * @see #getTheirAcctgTransId()
	 * @generated
	 */
	void setTheirAcctgTransId(String value);

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
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_TransactionDate()
	 * @model
	 * @generated
	 */
	Date getTransactionDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getTransactionDate <em>Transaction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Date</em>' attribute.
	 * @see #getTransactionDate()
	 * @generated
	 */
	void setTransactionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Voucher Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voucher Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voucher Date</em>' attribute.
	 * @see #setVoucherDate(Date)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_VoucherDate()
	 * @model
	 * @generated
	 */
	Date getVoucherDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getVoucherDate <em>Voucher Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voucher Date</em>' attribute.
	 * @see #getVoucherDate()
	 * @generated
	 */
	void setVoucherDate(Date value);

	/**
	 * Returns the value of the '<em><b>Voucher Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voucher Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voucher Ref</em>' attribute.
	 * @see #setVoucherRef(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_VoucherRef()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getVoucherRef();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getVoucherRef <em>Voucher Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voucher Ref</em>' attribute.
	 * @see #getVoucherRef()
	 * @generated
	 */
	void setVoucherRef(String value);

	/**
	 * Returns the value of the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Id</em>' reference.
	 * @see #setWorkEffortId(WorkEffort)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_WorkEffortId()
	 * @model keys="workEffortId"
	 * @generated
	 */
	WorkEffort getWorkEffortId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getWorkEffortId <em>Work Effort Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Id</em>' reference.
	 * @see #getWorkEffortId()
	 * @generated
	 */
	void setWorkEffortId(WorkEffort value);

	/**
	 * Returns the value of the '<em><b>Gl Journal Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Journal Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Journal Id</em>' reference.
	 * @see #setGlJournalId(GlJournal)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_GlJournalId()
	 * @model keys="glJournalId"
	 * @generated
	 */
	GlJournal getGlJournalId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getGlJournalId <em>Gl Journal Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Journal Id</em>' reference.
	 * @see #getGlJournalId()
	 * @generated
	 */
	void setGlJournalId(GlJournal value);

	/**
	 * Returns the value of the '<em><b>Gl Fiscal Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Fiscal Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Fiscal Type Id</em>' reference.
	 * @see #setGlFiscalTypeId(GlFiscalType)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_GlFiscalTypeId()
	 * @model keys="glFiscalTypeId"
	 * @generated
	 */
	GlFiscalType getGlFiscalTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getGlFiscalTypeId <em>Gl Fiscal Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Fiscal Type Id</em>' reference.
	 * @see #getGlFiscalTypeId()
	 * @generated
	 */
	void setGlFiscalTypeId(GlFiscalType value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Id</em>' reference.
	 * @see #setFixedAssetId(FixedAsset)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_FixedAssetId()
	 * @model keys="fixedAssetId"
	 * @generated
	 */
	FixedAsset getFixedAssetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getFixedAssetId <em>Fixed Asset Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Id</em>' reference.
	 * @see #getFixedAssetId()
	 * @generated
	 */
	void setFixedAssetId(FixedAsset value);

	/**
	 * Returns the value of the '<em><b>Invoice Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Id</em>' reference.
	 * @see #setInvoiceId(Invoice)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_InvoiceId()
	 * @model keys="invoiceId"
	 * @generated
	 */
	Invoice getInvoiceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getInvoiceId <em>Invoice Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Id</em>' reference.
	 * @see #getInvoiceId()
	 * @generated
	 */
	void setInvoiceId(Invoice value);

	/**
	 * Returns the value of the '<em><b>Fin Account Trans Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Account Trans Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Trans Id</em>' reference.
	 * @see #setFinAccountTransId(FinAccountTrans)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_FinAccountTransId()
	 * @model keys="finAccountTransId"
	 * @generated
	 */
	FinAccountTrans getFinAccountTransId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getFinAccountTransId <em>Fin Account Trans Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Trans Id</em>' reference.
	 * @see #getFinAccountTransId()
	 * @generated
	 */
	void setFinAccountTransId(FinAccountTrans value);

	/**
	 * Returns the value of the '<em><b>Acctg Trans Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acctg Trans Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acctg Trans Type Id</em>' reference.
	 * @see #setAcctgTransTypeId(AcctgTransType)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_AcctgTransTypeId()
	 * @model keys="acctgTransTypeId"
	 * @generated
	 */
	AcctgTransType getAcctgTransTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getAcctgTransTypeId <em>Acctg Trans Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acctg Trans Type Id</em>' reference.
	 * @see #getAcctgTransTypeId()
	 * @generated
	 */
	void setAcctgTransTypeId(AcctgTransType value);

	/**
	 * Returns the value of the '<em><b>Acctg Trans Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acctg Trans Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acctg Trans Id</em>' attribute.
	 * @see #setAcctgTransId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_AcctgTransId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getAcctgTransId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getAcctgTransId <em>Acctg Trans Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acctg Trans Id</em>' attribute.
	 * @see #getAcctgTransId()
	 * @generated
	 */
	void setAcctgTransId(String value);

	/**
	 * Returns the value of the '<em><b>Acctg Trans Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.accounting.ledger.AcctgTransAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acctg Trans Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acctg Trans Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_AcctgTransAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<AcctgTransAttribute> getAcctgTransAttributes();

	/**
	 * Returns the value of the '<em><b>Acctg Trans Entries</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acctg Trans Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acctg Trans Entries</em>' reference list.
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_AcctgTransEntries()
	 * @model derived="true"
	 * @generated
	 */
	List<AcctgTransEntry> getAcctgTransEntries();

} // AcctgTrans
