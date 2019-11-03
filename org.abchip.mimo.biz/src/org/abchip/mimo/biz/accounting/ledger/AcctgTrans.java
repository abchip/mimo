/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

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
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getAcctgTransAttributes <em>Acctg Trans Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getAcctgTransEntries <em>Acctg Trans Entries</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans()
 * @model annotation="mimo-ent-frame formula='description'"
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
	 * @model
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
	 * @model
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
	 * Returns the value of the '<em><b>Group Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Status Id</em>' attribute.
	 * @see #setGroupStatusId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_GroupStatusId()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getGroupStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getGroupStatusId <em>Group Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Status Id</em>' attribute.
	 * @see #getGroupStatusId()
	 * @generated
	 */
	void setGroupStatusId(String value);

	/**
	 * Returns the value of the '<em><b>Inventory Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Item Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Id</em>' attribute.
	 * @see #setInventoryItemId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_InventoryItemId()
	 * @model annotation="mimo-ent-domain frame='InventoryItem'"
	 * @generated
	 */
	String getInventoryItemId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getInventoryItemId <em>Inventory Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item Id</em>' attribute.
	 * @see #getInventoryItemId()
	 * @generated
	 */
	void setInventoryItemId(String value);

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
	 * @model
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
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_PartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Payment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Id</em>' attribute.
	 * @see #setPaymentId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_PaymentId()
	 * @model annotation="mimo-ent-domain frame='Payment'"
	 * @generated
	 */
	String getPaymentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getPaymentId <em>Payment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Id</em>' attribute.
	 * @see #getPaymentId()
	 * @generated
	 */
	void setPaymentId(String value);

	/**
	 * Returns the value of the '<em><b>Physical Inventory Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Inventory Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Inventory Id</em>' attribute.
	 * @see #setPhysicalInventoryId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_PhysicalInventoryId()
	 * @model annotation="mimo-ent-domain frame='PhysicalInventory'"
	 * @generated
	 */
	String getPhysicalInventoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getPhysicalInventoryId <em>Physical Inventory Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Inventory Id</em>' attribute.
	 * @see #getPhysicalInventoryId()
	 * @generated
	 */
	void setPhysicalInventoryId(String value);

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
	 * Returns the value of the '<em><b>Receipt Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipt Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipt Id</em>' attribute.
	 * @see #setReceiptId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_ReceiptId()
	 * @model annotation="mimo-ent-domain frame='ShipmentReceipt'"
	 * @generated
	 */
	String getReceiptId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getReceiptId <em>Receipt Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receipt Id</em>' attribute.
	 * @see #getReceiptId()
	 * @generated
	 */
	void setReceiptId(String value);

	/**
	 * Returns the value of the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id</em>' attribute.
	 * @see #setRoleTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_RoleTypeId()
	 * @model annotation="mimo-ent-domain frame='RoleType'"
	 * @generated
	 */
	String getRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getRoleTypeId <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id</em>' attribute.
	 * @see #getRoleTypeId()
	 * @generated
	 */
	void setRoleTypeId(String value);

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
	 * Returns the value of the '<em><b>Shipment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Id</em>' attribute.
	 * @see #setShipmentId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_ShipmentId()
	 * @model annotation="mimo-ent-domain frame='Shipment'"
	 * @generated
	 */
	String getShipmentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getShipmentId <em>Shipment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Id</em>' attribute.
	 * @see #getShipmentId()
	 * @generated
	 */
	void setShipmentId(String value);

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
	 * @model
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
	 * @model
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
	 * Returns the value of the '<em><b>Work Effort Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Id</em>' attribute.
	 * @see #setWorkEffortId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_WorkEffortId()
	 * @model annotation="mimo-ent-domain frame='WorkEffort'"
	 * @generated
	 */
	String getWorkEffortId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getWorkEffortId <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Id</em>' attribute.
	 * @see #getWorkEffortId()
	 * @generated
	 */
	void setWorkEffortId(String value);

	/**
	 * Returns the value of the '<em><b>Acctg Trans Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acctg Trans Attributes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acctg Trans Attributes</em>' attribute list.
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_AcctgTransAttributes()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='AcctgTransAttribute'"
	 * @generated
	 */
	List<String> getAcctgTransAttributes();

	/**
	 * Returns the value of the '<em><b>Acctg Trans Entries</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acctg Trans Entries</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acctg Trans Entries</em>' attribute list.
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_AcctgTransEntries()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='AcctgTransEntry'"
	 * @generated
	 */
	List<String> getAcctgTransEntries();

	/**
	 * Returns the value of the '<em><b>Gl Journal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Journal Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Journal Id</em>' attribute.
	 * @see #setGlJournalId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_GlJournalId()
	 * @model annotation="mimo-ent-domain frame='GlJournal'"
	 * @generated
	 */
	String getGlJournalId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getGlJournalId <em>Gl Journal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Journal Id</em>' attribute.
	 * @see #getGlJournalId()
	 * @generated
	 */
	void setGlJournalId(String value);

	/**
	 * Returns the value of the '<em><b>Gl Fiscal Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gl Fiscal Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gl Fiscal Type Id</em>' attribute.
	 * @see #setGlFiscalTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_GlFiscalTypeId()
	 * @model annotation="mimo-ent-domain frame='GlFiscalType'"
	 * @generated
	 */
	String getGlFiscalTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getGlFiscalTypeId <em>Gl Fiscal Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gl Fiscal Type Id</em>' attribute.
	 * @see #getGlFiscalTypeId()
	 * @generated
	 */
	void setGlFiscalTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Id</em>' attribute.
	 * @see #setFixedAssetId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_FixedAssetId()
	 * @model annotation="mimo-ent-domain frame='FixedAsset'"
	 * @generated
	 */
	String getFixedAssetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getFixedAssetId <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Id</em>' attribute.
	 * @see #getFixedAssetId()
	 * @generated
	 */
	void setFixedAssetId(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Id</em>' attribute.
	 * @see #setInvoiceId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_InvoiceId()
	 * @model annotation="mimo-ent-domain frame='Invoice'"
	 * @generated
	 */
	String getInvoiceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getInvoiceId <em>Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Id</em>' attribute.
	 * @see #getInvoiceId()
	 * @generated
	 */
	void setInvoiceId(String value);

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
	 * @model
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
	 * Returns the value of the '<em><b>Fin Account Trans Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Account Trans Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Trans Id</em>' attribute.
	 * @see #setFinAccountTransId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_FinAccountTransId()
	 * @model annotation="mimo-ent-domain frame='FinAccountTrans'"
	 * @generated
	 */
	String getFinAccountTransId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getFinAccountTransId <em>Fin Account Trans Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Trans Id</em>' attribute.
	 * @see #getFinAccountTransId()
	 * @generated
	 */
	void setFinAccountTransId(String value);

	/**
	 * Returns the value of the '<em><b>Acctg Trans Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acctg Trans Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acctg Trans Type Id</em>' attribute.
	 * @see #setAcctgTransTypeId(String)
	 * @see org.abchip.mimo.biz.accounting.ledger.LedgerPackage#getAcctgTrans_AcctgTransTypeId()
	 * @model annotation="mimo-ent-domain frame='AcctgTransType'"
	 * @generated
	 */
	String getAcctgTransTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getAcctgTransTypeId <em>Acctg Trans Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acctg Trans Type Id</em>' attribute.
	 * @see #getAcctgTransTypeId()
	 * @generated
	 */
	void setAcctgTransTypeId(String value);

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
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
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

} // AcctgTrans
