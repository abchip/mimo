/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger;

import org.abchip.mimo.biz.BizPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.accounting.ledger.LedgerFactory
 * @model kind="package"
 * @generated
 */
public interface LedgerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ledger";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/accounting/ledger";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-ledger";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LedgerPackage eINSTANCE = org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl <em>Acctg Trans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getAcctgTrans()
	 * @generated
	 */
	int ACCTG_TRANS = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Acctg Trans Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__ACCTG_TRANS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Acctg Trans Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__ACCTG_TRANS_ATTRIBUTES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Acctg Trans Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__ACCTG_TRANS_ENTRIES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Acctg Trans Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__ACCTG_TRANS_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__CREATED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__CREATED_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fin Account Trans Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__FIN_ACCOUNT_TRANS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__FIXED_ASSET_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Gl Fiscal Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__GL_FISCAL_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Gl Journal Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__GL_JOURNAL_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Group Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__GROUP_STATUS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Inventory Item Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__INVENTORY_ITEM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Invoice Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__INVOICE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Is Posted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__IS_POSTED = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__LAST_MODIFIED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__LAST_MODIFIED_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__PARTY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Payment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__PAYMENT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Physical Inventory Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__PHYSICAL_INVENTORY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Posted Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__POSTED_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Receipt Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__RECEIPT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Scheduled Posting Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__SCHEDULED_POSTING_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Shipment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__SHIPMENT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Their Acctg Trans Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__THEIR_ACCTG_TRANS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Transaction Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__TRANSACTION_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Voucher Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__VOUCHER_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Voucher Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__VOUCHER_REF = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 29;

	/**
	 * The number of structural features of the '<em>Acctg Trans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 30;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransAttributeImpl <em>Acctg Trans Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransAttributeImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getAcctgTransAttribute()
	 * @generated
	 */
	int ACCTG_TRANS_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ATTRIBUTE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ATTRIBUTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ATTRIBUTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ATTRIBUTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Acctg Trans Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ATTRIBUTE__ACCTG_TRANS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ATTRIBUTE__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ATTRIBUTE__ATTR_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ATTRIBUTE__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Acctg Trans Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ATTRIBUTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl <em>Acctg Trans Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getAcctgTransEntry()
	 * @generated
	 */
	int ACCTG_TRANS_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Acctg Trans Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__ACCTG_TRANS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Acctg Trans Entry Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__ACCTG_TRANS_ENTRY_SEQ_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Acctg Trans Entry Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__ACCTG_TRANS_ENTRY_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__AMOUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Debit Credit Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__DEBIT_CREDIT_FLAG = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__DUE_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Gl Account Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__GL_ACCOUNT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__GROUP_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Inventory Item Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__INVENTORY_ITEM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Is Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__IS_SUMMARY = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Organization Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__ORGANIZATION_PARTY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Orig Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__ORIG_AMOUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Orig Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__ORIG_CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__PARTY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__PRODUCT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Reconcile Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__RECONCILE_STATUS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Settlement Term Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__SETTLEMENT_TERM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Tax Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__TAX_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Their Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__THEIR_PARTY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Their Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__THEIR_PRODUCT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Voucher Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY__VOUCHER_REF = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 24;

	/**
	 * The number of structural features of the '<em>Acctg Trans Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 25;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryTypeImpl <em>Acctg Trans Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryTypeImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getAcctgTransEntryType()
	 * @generated
	 */
	int ACCTG_TRANS_ENTRY_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Acctg Trans Entry Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY_TYPE__ACCTG_TRANS_ENTRY_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Acctg Trans Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_ENTRY_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransTypeImpl <em>Acctg Trans Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransTypeImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getAcctgTransType()
	 * @generated
	 */
	int ACCTG_TRANS_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Acctg Trans Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_TYPE__ACCTG_TRANS_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Acctg Trans Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_TYPE__ACCTG_TRANS_TYPE_ATTRS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Acctg Trans Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransTypeAttrImpl <em>Acctg Trans Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransTypeAttrImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getAcctgTransTypeAttr()
	 * @generated
	 */
	int ACCTG_TRANS_TYPE_ATTR = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_TYPE_ATTR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_TYPE_ATTR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_TYPE_ATTR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_TYPE_ATTR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Acctg Trans Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_TYPE_ATTR__ACCTG_TRANS_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_TYPE_ATTR__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_TYPE_ATTR__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Acctg Trans Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCTG_TRANS_TYPE_ATTR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl <em>Gl Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccount()
	 * @generated
	 */
	int GL_ACCOUNT = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Gl Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT__GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Account Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT__ACCOUNT_CODE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Account Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT__ACCOUNT_NAME = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT__EXTERNAL_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gl Account Class Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT__GL_ACCOUNT_CLASS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gl Account Group Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT__GL_ACCOUNT_GROUP_MEMBERS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gl Account Organizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT__GL_ACCOUNT_ORGANIZATIONS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Gl Account Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT__GL_ACCOUNT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Gl Resource Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT__GL_RESOURCE_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Gl Xbrl Class Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT__GL_XBRL_CLASS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Parent Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT__PARENT_GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT__PRODUCT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Gl Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountCategoryImpl <em>Gl Account Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountCategoryImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccountCategory()
	 * @generated
	 */
	int GL_ACCOUNT_CATEGORY = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CATEGORY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CATEGORY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CATEGORY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CATEGORY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Gl Account Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CATEGORY__GL_ACCOUNT_CATEGORY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CATEGORY__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gl Account Category Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CATEGORY__GL_ACCOUNT_CATEGORY_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gl Account Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CATEGORY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountCategoryMemberImpl <em>Gl Account Category Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountCategoryMemberImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccountCategoryMember()
	 * @generated
	 */
	int GL_ACCOUNT_CATEGORY_MEMBER = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CATEGORY_MEMBER__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CATEGORY_MEMBER__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CATEGORY_MEMBER__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CATEGORY_MEMBER__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CATEGORY_MEMBER__GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gl Account Category Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CATEGORY_MEMBER__GL_ACCOUNT_CATEGORY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CATEGORY_MEMBER__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Amount Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CATEGORY_MEMBER__AMOUNT_PERCENTAGE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CATEGORY_MEMBER__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Gl Account Category Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CATEGORY_MEMBER_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountCategoryTypeImpl <em>Gl Account Category Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountCategoryTypeImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccountCategoryType()
	 * @generated
	 */
	int GL_ACCOUNT_CATEGORY_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CATEGORY_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CATEGORY_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CATEGORY_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CATEGORY_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Gl Account Category Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CATEGORY_TYPE__GL_ACCOUNT_CATEGORY_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CATEGORY_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gl Account Category Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CATEGORY_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountClassImpl <em>Gl Account Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountClassImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccountClass()
	 * @generated
	 */
	int GL_ACCOUNT_CLASS = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CLASS__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CLASS__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CLASS__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CLASS__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Gl Account Class Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CLASS__GL_ACCOUNT_CLASS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CLASS__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Asset Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CLASS__IS_ASSET_CLASS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Class Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CLASS__PARENT_CLASS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CLASS__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Gl Account Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_CLASS_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountGroupImpl <em>Gl Account Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountGroupImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccountGroup()
	 * @generated
	 */
	int GL_ACCOUNT_GROUP = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_GROUP__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_GROUP__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_GROUP__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_GROUP__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Gl Account Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_GROUP__GL_ACCOUNT_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_GROUP__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gl Account Group Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_GROUP__GL_ACCOUNT_GROUP_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gl Account Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_GROUP_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountGroupMemberImpl <em>Gl Account Group Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountGroupMemberImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccountGroupMember()
	 * @generated
	 */
	int GL_ACCOUNT_GROUP_MEMBER = 12;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_GROUP_MEMBER__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_GROUP_MEMBER__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_GROUP_MEMBER__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_GROUP_MEMBER__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gl Account Group Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gl Account Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gl Account Group Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_GROUP_MEMBER_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountGroupTypeImpl <em>Gl Account Group Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountGroupTypeImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccountGroupType()
	 * @generated
	 */
	int GL_ACCOUNT_GROUP_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_GROUP_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_GROUP_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_GROUP_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_GROUP_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Gl Account Group Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_GROUP_TYPE__GL_ACCOUNT_GROUP_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_GROUP_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gl Account Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_GROUP_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountHistoryImpl <em>Gl Account History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountHistoryImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccountHistory()
	 * @generated
	 */
	int GL_ACCOUNT_HISTORY = 14;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_HISTORY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_HISTORY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_HISTORY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_HISTORY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_HISTORY__GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organization Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_HISTORY__ORGANIZATION_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Custom Time Period Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_HISTORY__CUSTOM_TIME_PERIOD_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ending Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_HISTORY__ENDING_BALANCE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Opening Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_HISTORY__OPENING_BALANCE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Posted Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_HISTORY__POSTED_CREDITS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Posted Debits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_HISTORY__POSTED_DEBITS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Gl Account History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_HISTORY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountOrganizationImpl <em>Gl Account Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountOrganizationImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccountOrganization()
	 * @generated
	 */
	int GL_ACCOUNT_ORGANIZATION = 15;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_ORGANIZATION__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_ORGANIZATION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_ORGANIZATION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_ORGANIZATION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_ORGANIZATION__GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organization Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_ORGANIZATION__ORGANIZATION_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_ORGANIZATION__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_ORGANIZATION__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_ORGANIZATION__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Gl Account Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_ORGANIZATION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountRoleImpl <em>Gl Account Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountRoleImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccountRole()
	 * @generated
	 */
	int GL_ACCOUNT_ROLE = 16;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_ROLE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_ROLE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_ROLE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_ROLE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_ROLE__GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_ROLE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_ROLE__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_ROLE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_ROLE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Gl Account Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_ROLE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountTypeImpl <em>Gl Account Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountTypeImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccountType()
	 * @generated
	 */
	int GL_ACCOUNT_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Gl Account Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_TYPE__GL_ACCOUNT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gl Account Type Defaults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_TYPE__GL_ACCOUNT_TYPE_DEFAULTS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Gl Account Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountTypeDefaultImpl <em>Gl Account Type Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountTypeDefaultImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccountTypeDefault()
	 * @generated
	 */
	int GL_ACCOUNT_TYPE_DEFAULT = 18;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_TYPE_DEFAULT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_TYPE_DEFAULT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_TYPE_DEFAULT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_TYPE_DEFAULT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Gl Account Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_TYPE_DEFAULT__GL_ACCOUNT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organization Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_TYPE_DEFAULT__ORGANIZATION_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_TYPE_DEFAULT__GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gl Account Type Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_ACCOUNT_TYPE_DEFAULT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlBudgetXrefImpl <em>Gl Budget Xref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlBudgetXrefImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlBudgetXref()
	 * @generated
	 */
	int GL_BUDGET_XREF = 19;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_BUDGET_XREF__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_BUDGET_XREF__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_BUDGET_XREF__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_BUDGET_XREF__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_BUDGET_XREF__GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Budget Item Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_BUDGET_XREF__BUDGET_ITEM_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_BUDGET_XREF__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allocation Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_BUDGET_XREF__ALLOCATION_PERCENTAGE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_BUDGET_XREF__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Gl Budget Xref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_BUDGET_XREF_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlFiscalTypeImpl <em>Gl Fiscal Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlFiscalTypeImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlFiscalType()
	 * @generated
	 */
	int GL_FISCAL_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_FISCAL_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_FISCAL_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_FISCAL_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_FISCAL_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Gl Fiscal Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_FISCAL_TYPE__GL_FISCAL_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_FISCAL_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gl Fiscal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_FISCAL_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlJournalImpl <em>Gl Journal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlJournalImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlJournal()
	 * @generated
	 */
	int GL_JOURNAL = 21;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_JOURNAL__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_JOURNAL__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_JOURNAL__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_JOURNAL__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Gl Journal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_JOURNAL__GL_JOURNAL_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gl Journal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_JOURNAL__GL_JOURNAL_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Posted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_JOURNAL__IS_POSTED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Organization Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_JOURNAL__ORGANIZATION_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Posted Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_JOURNAL__POSTED_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Gl Journal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_JOURNAL_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationImpl <em>Gl Reconciliation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlReconciliation()
	 * @generated
	 */
	int GL_RECONCILIATION = 22;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Gl Reconciliation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION__GL_RECONCILIATION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION__CREATED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION__CREATED_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION__GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gl Reconciliation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION__GL_RECONCILIATION_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION__LAST_MODIFIED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION__LAST_MODIFIED_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Opening Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION__OPENING_BALANCE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Organization Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION__ORGANIZATION_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Reconciled Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION__RECONCILED_BALANCE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Reconciled Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION__RECONCILED_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Gl Reconciliation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationEntryImpl <em>Gl Reconciliation Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationEntryImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlReconciliationEntry()
	 * @generated
	 */
	int GL_RECONCILIATION_ENTRY = 23;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION_ENTRY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION_ENTRY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION_ENTRY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION_ENTRY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Gl Reconciliation Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION_ENTRY__GL_RECONCILIATION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Acctg Trans Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION_ENTRY__ACCTG_TRANS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Acctg Trans Entry Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION_ENTRY__ACCTG_TRANS_ENTRY_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reconciled Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION_ENTRY__RECONCILED_AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Gl Reconciliation Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RECONCILIATION_ENTRY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlResourceTypeImpl <em>Gl Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlResourceTypeImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlResourceType()
	 * @generated
	 */
	int GL_RESOURCE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RESOURCE_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RESOURCE_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RESOURCE_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RESOURCE_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Gl Resource Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RESOURCE_TYPE__GL_RESOURCE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RESOURCE_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gl Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_RESOURCE_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlXbrlClassImpl <em>Gl Xbrl Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlXbrlClassImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlXbrlClass()
	 * @generated
	 */
	int GL_XBRL_CLASS = 25;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_XBRL_CLASS__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_XBRL_CLASS__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_XBRL_CLASS__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_XBRL_CLASS__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Gl Xbrl Class Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_XBRL_CLASS__GL_XBRL_CLASS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_XBRL_CLASS__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gl Xbrl Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GL_XBRL_CLASS_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl <em>Party Acctg Preference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getPartyAcctgPreference()
	 * @generated
	 */
	int PARTY_ACCTG_PREFERENCE = 26;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__BASE_CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cogs Method Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__COGS_METHOD_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enable Accounting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__ENABLE_ACCOUNTING = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Error Gl Journal Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__ERROR_GL_JOURNAL_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fiscal Year Start Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_DAY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fiscal Year Start Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_MONTH = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Invoice Id Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__INVOICE_ID_PREFIX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Invoice Seq Cust Meth Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__INVOICE_SEQ_CUST_METH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Last Invoice Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__LAST_INVOICE_NUMBER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Last Invoice Restart Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__LAST_INVOICE_RESTART_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Last Order Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__LAST_ORDER_NUMBER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Last Quote Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__LAST_QUOTE_NUMBER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Old Invoice Sequence Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__OLD_INVOICE_SEQUENCE_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Old Order Sequence Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__OLD_ORDER_SEQUENCE_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Old Quote Sequence Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__OLD_QUOTE_SEQUENCE_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Order Id Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__ORDER_ID_PREFIX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Order Seq Cust Meth Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__ORDER_SEQ_CUST_METH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Quote Id Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__QUOTE_ID_PREFIX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Quote Seq Cust Meth Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__QUOTE_SEQ_CUST_METH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Refund Payment Method Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__REFUND_PAYMENT_METHOD_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Tax Form Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__TAX_FORM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Use Invoice Id For Returns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE__USE_INVOICE_ID_FOR_RETURNS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>Party Acctg Preference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_ACCTG_PREFERENCE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 23;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyGlAccountImpl <em>Party Gl Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.PartyGlAccountImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getPartyGlAccount()
	 * @generated
	 */
	int PARTY_GL_ACCOUNT = 27;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GL_ACCOUNT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GL_ACCOUNT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GL_ACCOUNT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GL_ACCOUNT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Organization Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GL_ACCOUNT__ORGANIZATION_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GL_ACCOUNT__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GL_ACCOUNT__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gl Account Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GL_ACCOUNT__GL_ACCOUNT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GL_ACCOUNT__GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Party Gl Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_GL_ACCOUNT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyPrefDocTypeTplImpl <em>Party Pref Doc Type Tpl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.PartyPrefDocTypeTplImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getPartyPrefDocTypeTpl()
	 * @generated
	 */
	int PARTY_PREF_DOC_TYPE_TPL = 28;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PREF_DOC_TYPE_TPL__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PREF_DOC_TYPE_TPL__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PREF_DOC_TYPE_TPL__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PREF_DOC_TYPE_TPL__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Party Pref Doc Type Tpl Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PREF_DOC_TYPE_TPL__PARTY_PREF_DOC_TYPE_TPL_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Custom Screen Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PREF_DOC_TYPE_TPL__CUSTOM_SCREEN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PREF_DOC_TYPE_TPL__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Invoice Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PREF_DOC_TYPE_TPL__INVOICE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PREF_DOC_TYPE_TPL__ORDER_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PREF_DOC_TYPE_TPL__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Quote Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PREF_DOC_TYPE_TPL__QUOTE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PREF_DOC_TYPE_TPL__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Party Pref Doc Type Tpl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_PREF_DOC_TYPE_TPL_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.ProductAverageCostImpl <em>Product Average Cost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.ProductAverageCostImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getProductAverageCost()
	 * @generated
	 */
	int PRODUCT_AVERAGE_COST = 29;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_AVERAGE_COST__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_AVERAGE_COST__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_AVERAGE_COST__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_AVERAGE_COST__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Average Cost Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_AVERAGE_COST__PRODUCT_AVERAGE_COST_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organization Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_AVERAGE_COST__ORGANIZATION_PARTY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_AVERAGE_COST__PRODUCT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_AVERAGE_COST__FACILITY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_AVERAGE_COST__FROM_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Average Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_AVERAGE_COST__AVERAGE_COST = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_AVERAGE_COST__THRU_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Product Average Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_AVERAGE_COST_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.ProductAverageCostTypeImpl <em>Product Average Cost Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.ProductAverageCostTypeImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getProductAverageCostType()
	 * @generated
	 */
	int PRODUCT_AVERAGE_COST_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_AVERAGE_COST_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_AVERAGE_COST_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_AVERAGE_COST_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_AVERAGE_COST_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_AVERAGE_COST_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Average Cost Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_AVERAGE_COST_TYPE__PRODUCT_AVERAGE_COST_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_AVERAGE_COST_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_AVERAGE_COST_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_AVERAGE_COST_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Product Average Cost Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_AVERAGE_COST_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.SettlementTermImpl <em>Settlement Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.SettlementTermImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getSettlementTerm()
	 * @generated
	 */
	int SETTLEMENT_TERM = 31;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT_TERM__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT_TERM__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT_TERM__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT_TERM__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Settlement Term Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT_TERM__SETTLEMENT_TERM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Term Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT_TERM__TERM_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Term Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT_TERM__TERM_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT_TERM__UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Settlement Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTLEMENT_TERM_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.VarianceReasonGlAccountImpl <em>Variance Reason Gl Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.VarianceReasonGlAccountImpl
	 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getVarianceReasonGlAccount()
	 * @generated
	 */
	int VARIANCE_REASON_GL_ACCOUNT = 32;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE_REASON_GL_ACCOUNT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE_REASON_GL_ACCOUNT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE_REASON_GL_ACCOUNT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE_REASON_GL_ACCOUNT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Variance Reason Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE_REASON_GL_ACCOUNT__VARIANCE_REASON_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organization Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE_REASON_GL_ACCOUNT__ORGANIZATION_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE_REASON_GL_ACCOUNT__GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variance Reason Gl Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANCE_REASON_GL_ACCOUNT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans <em>Acctg Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acctg Trans</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans
	 * @generated
	 */
	EClass getAcctgTrans();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getAcctgTransId <em>Acctg Trans Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acctg Trans Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getAcctgTransId()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EAttribute getAcctgTrans_AcctgTransId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getAcctgTransAttributes <em>Acctg Trans Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Acctg Trans Attributes</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getAcctgTransAttributes()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EReference getAcctgTrans_AcctgTransAttributes();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getAcctgTransEntries <em>Acctg Trans Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Acctg Trans Entries</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getAcctgTransEntries()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EReference getAcctgTrans_AcctgTransEntries();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getAcctgTransTypeId <em>Acctg Trans Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Acctg Trans Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getAcctgTransTypeId()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EReference getAcctgTrans_AcctgTransTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getCreatedByUserLogin()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EAttribute getAcctgTrans_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getCreatedDate()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EAttribute getAcctgTrans_CreatedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getDescription()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EAttribute getAcctgTrans_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getFinAccountTransId <em>Fin Account Trans Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account Trans Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getFinAccountTransId()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EReference getAcctgTrans_FinAccountTransId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getFixedAssetId <em>Fixed Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getFixedAssetId()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EReference getAcctgTrans_FixedAssetId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getGlFiscalTypeId <em>Gl Fiscal Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Fiscal Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getGlFiscalTypeId()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EReference getAcctgTrans_GlFiscalTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getGlJournalId <em>Gl Journal Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Journal Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getGlJournalId()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EReference getAcctgTrans_GlJournalId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getGroupStatusId <em>Group Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group Status Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getGroupStatusId()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EReference getAcctgTrans_GroupStatusId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getInventoryItemId <em>Inventory Item Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Item Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getInventoryItemId()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EReference getAcctgTrans_InventoryItemId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getInvoiceId <em>Invoice Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getInvoiceId()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EReference getAcctgTrans_InvoiceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#isIsPosted <em>Is Posted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Posted</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#isIsPosted()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EAttribute getAcctgTrans_IsPosted();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getLastModifiedByUserLogin()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EAttribute getAcctgTrans_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getLastModifiedDate()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EAttribute getAcctgTrans_LastModifiedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getPartyId()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EReference getAcctgTrans_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getPaymentId <em>Payment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getPaymentId()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EReference getAcctgTrans_PaymentId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getPhysicalInventoryId <em>Physical Inventory Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Physical Inventory Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getPhysicalInventoryId()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EReference getAcctgTrans_PhysicalInventoryId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getPostedDate <em>Posted Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posted Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getPostedDate()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EAttribute getAcctgTrans_PostedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getReceiptId <em>Receipt Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receipt Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getReceiptId()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EReference getAcctgTrans_ReceiptId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getRoleTypeId()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EReference getAcctgTrans_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getScheduledPostingDate <em>Scheduled Posting Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduled Posting Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getScheduledPostingDate()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EAttribute getAcctgTrans_ScheduledPostingDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getShipmentId <em>Shipment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getShipmentId()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EReference getAcctgTrans_ShipmentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getTheirAcctgTransId <em>Their Acctg Trans Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Their Acctg Trans Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getTheirAcctgTransId()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EAttribute getAcctgTrans_TheirAcctgTransId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getTransactionDate <em>Transaction Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getTransactionDate()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EAttribute getAcctgTrans_TransactionDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getVoucherDate <em>Voucher Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voucher Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getVoucherDate()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EAttribute getAcctgTrans_VoucherDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getVoucherRef <em>Voucher Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voucher Ref</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getVoucherRef()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EAttribute getAcctgTrans_VoucherRef();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTrans#getWorkEffortId()
	 * @see #getAcctgTrans()
	 * @generated
	 */
	EReference getAcctgTrans_WorkEffortId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransAttribute <em>Acctg Trans Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acctg Trans Attribute</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransAttribute
	 * @generated
	 */
	EClass getAcctgTransAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransAttribute#getAcctgTransId <em>Acctg Trans Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Acctg Trans Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransAttribute#getAcctgTransId()
	 * @see #getAcctgTransAttribute()
	 * @generated
	 */
	EReference getAcctgTransAttribute_AcctgTransId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransAttribute#getAttrName()
	 * @see #getAcctgTransAttribute()
	 * @generated
	 */
	EAttribute getAcctgTransAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransAttribute#getAttrDescription()
	 * @see #getAcctgTransAttribute()
	 * @generated
	 */
	EAttribute getAcctgTransAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransAttribute#getAttrValue()
	 * @see #getAcctgTransAttribute()
	 * @generated
	 */
	EAttribute getAcctgTransAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry <em>Acctg Trans Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acctg Trans Entry</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry
	 * @generated
	 */
	EClass getAcctgTransEntry();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getAcctgTransId <em>Acctg Trans Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Acctg Trans Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getAcctgTransId()
	 * @see #getAcctgTransEntry()
	 * @generated
	 */
	EReference getAcctgTransEntry_AcctgTransId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getAcctgTransEntrySeqId <em>Acctg Trans Entry Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acctg Trans Entry Seq Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getAcctgTransEntrySeqId()
	 * @see #getAcctgTransEntry()
	 * @generated
	 */
	EAttribute getAcctgTransEntry_AcctgTransEntrySeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getAcctgTransEntryTypeId <em>Acctg Trans Entry Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Acctg Trans Entry Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getAcctgTransEntryTypeId()
	 * @see #getAcctgTransEntry()
	 * @generated
	 */
	EReference getAcctgTransEntry_AcctgTransEntryTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getAmount()
	 * @see #getAcctgTransEntry()
	 * @generated
	 */
	EAttribute getAcctgTransEntry_Amount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getCurrencyUomId <em>Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getCurrencyUomId()
	 * @see #getAcctgTransEntry()
	 * @generated
	 */
	EReference getAcctgTransEntry_CurrencyUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getDebitCreditFlag <em>Debit Credit Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debit Credit Flag</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getDebitCreditFlag()
	 * @see #getAcctgTransEntry()
	 * @generated
	 */
	EAttribute getAcctgTransEntry_DebitCreditFlag();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getDescription()
	 * @see #getAcctgTransEntry()
	 * @generated
	 */
	EAttribute getAcctgTransEntry_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getDueDate()
	 * @see #getAcctgTransEntry()
	 * @generated
	 */
	EAttribute getAcctgTransEntry_DueDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getGlAccountId <em>Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getGlAccountId()
	 * @see #getAcctgTransEntry()
	 * @generated
	 */
	EReference getAcctgTransEntry_GlAccountId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getGlAccountTypeId <em>Gl Account Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getGlAccountTypeId()
	 * @see #getAcctgTransEntry()
	 * @generated
	 */
	EReference getAcctgTransEntry_GlAccountTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getGroupId()
	 * @see #getAcctgTransEntry()
	 * @generated
	 */
	EAttribute getAcctgTransEntry_GroupId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getInventoryItemId <em>Inventory Item Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Item Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getInventoryItemId()
	 * @see #getAcctgTransEntry()
	 * @generated
	 */
	EReference getAcctgTransEntry_InventoryItemId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#isIsSummary <em>Is Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Summary</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#isIsSummary()
	 * @see #getAcctgTransEntry()
	 * @generated
	 */
	EAttribute getAcctgTransEntry_IsSummary();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getOrganizationPartyId <em>Organization Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getOrganizationPartyId()
	 * @see #getAcctgTransEntry()
	 * @generated
	 */
	EAttribute getAcctgTransEntry_OrganizationPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getOrigAmount <em>Orig Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orig Amount</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getOrigAmount()
	 * @see #getAcctgTransEntry()
	 * @generated
	 */
	EAttribute getAcctgTransEntry_OrigAmount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getOrigCurrencyUomId <em>Orig Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orig Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getOrigCurrencyUomId()
	 * @see #getAcctgTransEntry()
	 * @generated
	 */
	EReference getAcctgTransEntry_OrigCurrencyUomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getPartyId()
	 * @see #getAcctgTransEntry()
	 * @generated
	 */
	EReference getAcctgTransEntry_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getProductId()
	 * @see #getAcctgTransEntry()
	 * @generated
	 */
	EAttribute getAcctgTransEntry_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getReconcileStatusId <em>Reconcile Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reconcile Status Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getReconcileStatusId()
	 * @see #getAcctgTransEntry()
	 * @generated
	 */
	EReference getAcctgTransEntry_ReconcileStatusId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getRoleTypeId()
	 * @see #getAcctgTransEntry()
	 * @generated
	 */
	EReference getAcctgTransEntry_RoleTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getSettlementTermId <em>Settlement Term Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Settlement Term Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getSettlementTermId()
	 * @see #getAcctgTransEntry()
	 * @generated
	 */
	EReference getAcctgTransEntry_SettlementTermId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getTaxId <em>Tax Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getTaxId()
	 * @see #getAcctgTransEntry()
	 * @generated
	 */
	EAttribute getAcctgTransEntry_TaxId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getTheirPartyId <em>Their Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Their Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getTheirPartyId()
	 * @see #getAcctgTransEntry()
	 * @generated
	 */
	EAttribute getAcctgTransEntry_TheirPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getTheirProductId <em>Their Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Their Product Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getTheirProductId()
	 * @see #getAcctgTransEntry()
	 * @generated
	 */
	EAttribute getAcctgTransEntry_TheirProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getVoucherRef <em>Voucher Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voucher Ref</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntry#getVoucherRef()
	 * @see #getAcctgTransEntry()
	 * @generated
	 */
	EAttribute getAcctgTransEntry_VoucherRef();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntryType <em>Acctg Trans Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acctg Trans Entry Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntryType
	 * @generated
	 */
	EClass getAcctgTransEntryType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntryType#getAcctgTransEntryTypeId <em>Acctg Trans Entry Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acctg Trans Entry Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntryType#getAcctgTransEntryTypeId()
	 * @see #getAcctgTransEntryType()
	 * @generated
	 */
	EAttribute getAcctgTransEntryType_AcctgTransEntryTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntryType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntryType#getDescription()
	 * @see #getAcctgTransEntryType()
	 * @generated
	 */
	EAttribute getAcctgTransEntryType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntryType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntryType#isHasTable()
	 * @see #getAcctgTransEntryType()
	 * @generated
	 */
	EAttribute getAcctgTransEntryType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransEntryType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransEntryType#getParentTypeId()
	 * @see #getAcctgTransEntryType()
	 * @generated
	 */
	EReference getAcctgTransEntryType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransType <em>Acctg Trans Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acctg Trans Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransType
	 * @generated
	 */
	EClass getAcctgTransType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransType#getAcctgTransTypeId <em>Acctg Trans Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acctg Trans Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransType#getAcctgTransTypeId()
	 * @see #getAcctgTransType()
	 * @generated
	 */
	EAttribute getAcctgTransType_AcctgTransTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransType#getAcctgTransTypeAttrs <em>Acctg Trans Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Acctg Trans Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransType#getAcctgTransTypeAttrs()
	 * @see #getAcctgTransType()
	 * @generated
	 */
	EReference getAcctgTransType_AcctgTransTypeAttrs();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransType#getDescription()
	 * @see #getAcctgTransType()
	 * @generated
	 */
	EAttribute getAcctgTransType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransType#isHasTable()
	 * @see #getAcctgTransType()
	 * @generated
	 */
	EAttribute getAcctgTransType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransType#getParentTypeId()
	 * @see #getAcctgTransType()
	 * @generated
	 */
	EReference getAcctgTransType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransTypeAttr <em>Acctg Trans Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acctg Trans Type Attr</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransTypeAttr
	 * @generated
	 */
	EClass getAcctgTransTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransTypeAttr#getAcctgTransTypeId <em>Acctg Trans Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Acctg Trans Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransTypeAttr#getAcctgTransTypeId()
	 * @see #getAcctgTransTypeAttr()
	 * @generated
	 */
	EReference getAcctgTransTypeAttr_AcctgTransTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransTypeAttr#getAttrName()
	 * @see #getAcctgTransTypeAttr()
	 * @generated
	 */
	EAttribute getAcctgTransTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.AcctgTransTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.AcctgTransTypeAttr#getDescription()
	 * @see #getAcctgTransTypeAttr()
	 * @generated
	 */
	EAttribute getAcctgTransTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.GlAccount <em>Gl Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gl Account</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccount
	 * @generated
	 */
	EClass getGlAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlAccountId <em>Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlAccountId()
	 * @see #getGlAccount()
	 * @generated
	 */
	EAttribute getGlAccount_GlAccountId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getAccountCode <em>Account Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Code</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccount#getAccountCode()
	 * @see #getGlAccount()
	 * @generated
	 */
	EAttribute getGlAccount_AccountCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getAccountName <em>Account Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccount#getAccountName()
	 * @see #getGlAccount()
	 * @generated
	 */
	EAttribute getGlAccount_AccountName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccount#getDescription()
	 * @see #getGlAccount()
	 * @generated
	 */
	EAttribute getGlAccount_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getExternalId <em>External Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccount#getExternalId()
	 * @see #getGlAccount()
	 * @generated
	 */
	EAttribute getGlAccount_ExternalId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlAccountClassId <em>Gl Account Class Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Class Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlAccountClassId()
	 * @see #getGlAccount()
	 * @generated
	 */
	EReference getGlAccount_GlAccountClassId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlAccountGroupMembers <em>Gl Account Group Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gl Account Group Members</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlAccountGroupMembers()
	 * @see #getGlAccount()
	 * @generated
	 */
	EReference getGlAccount_GlAccountGroupMembers();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlAccountOrganizations <em>Gl Account Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gl Account Organizations</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlAccountOrganizations()
	 * @see #getGlAccount()
	 * @generated
	 */
	EReference getGlAccount_GlAccountOrganizations();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlAccountTypeId <em>Gl Account Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlAccountTypeId()
	 * @see #getGlAccount()
	 * @generated
	 */
	EReference getGlAccount_GlAccountTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlResourceTypeId <em>Gl Resource Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Resource Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlResourceTypeId()
	 * @see #getGlAccount()
	 * @generated
	 */
	EReference getGlAccount_GlResourceTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlXbrlClassId <em>Gl Xbrl Class Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Xbrl Class Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccount#getGlXbrlClassId()
	 * @see #getGlAccount()
	 * @generated
	 */
	EReference getGlAccount_GlXbrlClassId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getParentGlAccountId <em>Parent Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccount#getParentGlAccountId()
	 * @see #getGlAccount()
	 * @generated
	 */
	EReference getGlAccount_ParentGlAccountId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccount#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccount#getProductId()
	 * @see #getGlAccount()
	 * @generated
	 */
	EAttribute getGlAccount_ProductId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategory <em>Gl Account Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gl Account Category</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountCategory
	 * @generated
	 */
	EClass getGlAccountCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategory#getGlAccountCategoryId <em>Gl Account Category Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gl Account Category Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountCategory#getGlAccountCategoryId()
	 * @see #getGlAccountCategory()
	 * @generated
	 */
	EAttribute getGlAccountCategory_GlAccountCategoryId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategory#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountCategory#getDescription()
	 * @see #getGlAccountCategory()
	 * @generated
	 */
	EAttribute getGlAccountCategory_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategory#getGlAccountCategoryTypeId <em>Gl Account Category Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Category Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountCategory#getGlAccountCategoryTypeId()
	 * @see #getGlAccountCategory()
	 * @generated
	 */
	EReference getGlAccountCategory_GlAccountCategoryTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryMember <em>Gl Account Category Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gl Account Category Member</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryMember
	 * @generated
	 */
	EClass getGlAccountCategoryMember();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryMember#getGlAccountId <em>Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryMember#getGlAccountId()
	 * @see #getGlAccountCategoryMember()
	 * @generated
	 */
	EReference getGlAccountCategoryMember_GlAccountId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryMember#getGlAccountCategoryId <em>Gl Account Category Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Category Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryMember#getGlAccountCategoryId()
	 * @see #getGlAccountCategoryMember()
	 * @generated
	 */
	EReference getGlAccountCategoryMember_GlAccountCategoryId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryMember#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryMember#getFromDate()
	 * @see #getGlAccountCategoryMember()
	 * @generated
	 */
	EAttribute getGlAccountCategoryMember_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryMember#getAmountPercentage <em>Amount Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Percentage</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryMember#getAmountPercentage()
	 * @see #getGlAccountCategoryMember()
	 * @generated
	 */
	EAttribute getGlAccountCategoryMember_AmountPercentage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryMember#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryMember#getThruDate()
	 * @see #getGlAccountCategoryMember()
	 * @generated
	 */
	EAttribute getGlAccountCategoryMember_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryType <em>Gl Account Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gl Account Category Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryType
	 * @generated
	 */
	EClass getGlAccountCategoryType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryType#getGlAccountCategoryTypeId <em>Gl Account Category Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gl Account Category Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryType#getGlAccountCategoryTypeId()
	 * @see #getGlAccountCategoryType()
	 * @generated
	 */
	EAttribute getGlAccountCategoryType_GlAccountCategoryTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountCategoryType#getDescription()
	 * @see #getGlAccountCategoryType()
	 * @generated
	 */
	EAttribute getGlAccountCategoryType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountClass <em>Gl Account Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gl Account Class</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountClass
	 * @generated
	 */
	EClass getGlAccountClass();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountClass#getGlAccountClassId <em>Gl Account Class Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gl Account Class Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountClass#getGlAccountClassId()
	 * @see #getGlAccountClass()
	 * @generated
	 */
	EAttribute getGlAccountClass_GlAccountClassId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountClass#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountClass#getDescription()
	 * @see #getGlAccountClass()
	 * @generated
	 */
	EAttribute getGlAccountClass_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountClass#isIsAssetClass <em>Is Asset Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Asset Class</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountClass#isIsAssetClass()
	 * @see #getGlAccountClass()
	 * @generated
	 */
	EAttribute getGlAccountClass_IsAssetClass();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountClass#getParentClassId <em>Parent Class Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Class Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountClass#getParentClassId()
	 * @see #getGlAccountClass()
	 * @generated
	 */
	EReference getGlAccountClass_ParentClassId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountClass#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountClass#getSequenceNum()
	 * @see #getGlAccountClass()
	 * @generated
	 */
	EAttribute getGlAccountClass_SequenceNum();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountGroup <em>Gl Account Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gl Account Group</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountGroup
	 * @generated
	 */
	EClass getGlAccountGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountGroup#getGlAccountGroupId <em>Gl Account Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gl Account Group Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountGroup#getGlAccountGroupId()
	 * @see #getGlAccountGroup()
	 * @generated
	 */
	EAttribute getGlAccountGroup_GlAccountGroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountGroup#getDescription()
	 * @see #getGlAccountGroup()
	 * @generated
	 */
	EAttribute getGlAccountGroup_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountGroup#getGlAccountGroupTypeId <em>Gl Account Group Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Group Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountGroup#getGlAccountGroupTypeId()
	 * @see #getGlAccountGroup()
	 * @generated
	 */
	EReference getGlAccountGroup_GlAccountGroupTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountGroupMember <em>Gl Account Group Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gl Account Group Member</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountGroupMember
	 * @generated
	 */
	EClass getGlAccountGroupMember();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountGroupMember#getGlAccountId <em>Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountGroupMember#getGlAccountId()
	 * @see #getGlAccountGroupMember()
	 * @generated
	 */
	EReference getGlAccountGroupMember_GlAccountId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountGroupMember#getGlAccountGroupTypeId <em>Gl Account Group Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Group Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountGroupMember#getGlAccountGroupTypeId()
	 * @see #getGlAccountGroupMember()
	 * @generated
	 */
	EReference getGlAccountGroupMember_GlAccountGroupTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountGroupMember#getGlAccountGroupId <em>Gl Account Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Group Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountGroupMember#getGlAccountGroupId()
	 * @see #getGlAccountGroupMember()
	 * @generated
	 */
	EReference getGlAccountGroupMember_GlAccountGroupId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountGroupType <em>Gl Account Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gl Account Group Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountGroupType
	 * @generated
	 */
	EClass getGlAccountGroupType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountGroupType#getGlAccountGroupTypeId <em>Gl Account Group Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gl Account Group Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountGroupType#getGlAccountGroupTypeId()
	 * @see #getGlAccountGroupType()
	 * @generated
	 */
	EAttribute getGlAccountGroupType_GlAccountGroupTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountGroupType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountGroupType#getDescription()
	 * @see #getGlAccountGroupType()
	 * @generated
	 */
	EAttribute getGlAccountGroupType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountHistory <em>Gl Account History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gl Account History</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountHistory
	 * @generated
	 */
	EClass getGlAccountHistory();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountHistory#getGlAccountId <em>Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountHistory#getGlAccountId()
	 * @see #getGlAccountHistory()
	 * @generated
	 */
	EReference getGlAccountHistory_GlAccountId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountHistory#getOrganizationPartyId <em>Organization Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountHistory#getOrganizationPartyId()
	 * @see #getGlAccountHistory()
	 * @generated
	 */
	EReference getGlAccountHistory_OrganizationPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountHistory#getCustomTimePeriodId <em>Custom Time Period Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Custom Time Period Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountHistory#getCustomTimePeriodId()
	 * @see #getGlAccountHistory()
	 * @generated
	 */
	EReference getGlAccountHistory_CustomTimePeriodId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountHistory#getEndingBalance <em>Ending Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ending Balance</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountHistory#getEndingBalance()
	 * @see #getGlAccountHistory()
	 * @generated
	 */
	EAttribute getGlAccountHistory_EndingBalance();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountHistory#getOpeningBalance <em>Opening Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opening Balance</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountHistory#getOpeningBalance()
	 * @see #getGlAccountHistory()
	 * @generated
	 */
	EAttribute getGlAccountHistory_OpeningBalance();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountHistory#getPostedCredits <em>Posted Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posted Credits</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountHistory#getPostedCredits()
	 * @see #getGlAccountHistory()
	 * @generated
	 */
	EAttribute getGlAccountHistory_PostedCredits();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountHistory#getPostedDebits <em>Posted Debits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posted Debits</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountHistory#getPostedDebits()
	 * @see #getGlAccountHistory()
	 * @generated
	 */
	EAttribute getGlAccountHistory_PostedDebits();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountOrganization <em>Gl Account Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gl Account Organization</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountOrganization
	 * @generated
	 */
	EClass getGlAccountOrganization();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountOrganization#getGlAccountId <em>Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountOrganization#getGlAccountId()
	 * @see #getGlAccountOrganization()
	 * @generated
	 */
	EReference getGlAccountOrganization_GlAccountId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountOrganization#getOrganizationPartyId <em>Organization Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountOrganization#getOrganizationPartyId()
	 * @see #getGlAccountOrganization()
	 * @generated
	 */
	EReference getGlAccountOrganization_OrganizationPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountOrganization#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountOrganization#getFromDate()
	 * @see #getGlAccountOrganization()
	 * @generated
	 */
	EAttribute getGlAccountOrganization_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountOrganization#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountOrganization#getRoleTypeId()
	 * @see #getGlAccountOrganization()
	 * @generated
	 */
	EReference getGlAccountOrganization_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountOrganization#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountOrganization#getThruDate()
	 * @see #getGlAccountOrganization()
	 * @generated
	 */
	EAttribute getGlAccountOrganization_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountRole <em>Gl Account Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gl Account Role</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountRole
	 * @generated
	 */
	EClass getGlAccountRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountRole#getGlAccountId <em>Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountRole#getGlAccountId()
	 * @see #getGlAccountRole()
	 * @generated
	 */
	EReference getGlAccountRole_GlAccountId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountRole#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountRole#getPartyId()
	 * @see #getGlAccountRole()
	 * @generated
	 */
	EReference getGlAccountRole_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountRole#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountRole#getRoleTypeId()
	 * @see #getGlAccountRole()
	 * @generated
	 */
	EReference getGlAccountRole_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountRole#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountRole#getFromDate()
	 * @see #getGlAccountRole()
	 * @generated
	 */
	EAttribute getGlAccountRole_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountRole#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountRole#getThruDate()
	 * @see #getGlAccountRole()
	 * @generated
	 */
	EAttribute getGlAccountRole_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountType <em>Gl Account Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gl Account Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountType
	 * @generated
	 */
	EClass getGlAccountType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountType#getGlAccountTypeId <em>Gl Account Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gl Account Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountType#getGlAccountTypeId()
	 * @see #getGlAccountType()
	 * @generated
	 */
	EAttribute getGlAccountType_GlAccountTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountType#getDescription()
	 * @see #getGlAccountType()
	 * @generated
	 */
	EAttribute getGlAccountType_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountType#getGlAccountTypeDefaults <em>Gl Account Type Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Gl Account Type Defaults</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountType#getGlAccountTypeDefaults()
	 * @see #getGlAccountType()
	 * @generated
	 */
	EReference getGlAccountType_GlAccountTypeDefaults();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountType#isHasTable()
	 * @see #getGlAccountType()
	 * @generated
	 */
	EAttribute getGlAccountType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountType#getParentTypeId()
	 * @see #getGlAccountType()
	 * @generated
	 */
	EReference getGlAccountType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountTypeDefault <em>Gl Account Type Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gl Account Type Default</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountTypeDefault
	 * @generated
	 */
	EClass getGlAccountTypeDefault();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountTypeDefault#getGlAccountTypeId <em>Gl Account Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountTypeDefault#getGlAccountTypeId()
	 * @see #getGlAccountTypeDefault()
	 * @generated
	 */
	EReference getGlAccountTypeDefault_GlAccountTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountTypeDefault#getOrganizationPartyId <em>Organization Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountTypeDefault#getOrganizationPartyId()
	 * @see #getGlAccountTypeDefault()
	 * @generated
	 */
	EReference getGlAccountTypeDefault_OrganizationPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlAccountTypeDefault#getGlAccountId <em>Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlAccountTypeDefault#getGlAccountId()
	 * @see #getGlAccountTypeDefault()
	 * @generated
	 */
	EReference getGlAccountTypeDefault_GlAccountId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.GlBudgetXref <em>Gl Budget Xref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gl Budget Xref</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlBudgetXref
	 * @generated
	 */
	EClass getGlBudgetXref();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlBudgetXref#getGlAccountId <em>Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlBudgetXref#getGlAccountId()
	 * @see #getGlBudgetXref()
	 * @generated
	 */
	EReference getGlBudgetXref_GlAccountId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlBudgetXref#getBudgetItemTypeId <em>Budget Item Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Budget Item Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlBudgetXref#getBudgetItemTypeId()
	 * @see #getGlBudgetXref()
	 * @generated
	 */
	EReference getGlBudgetXref_BudgetItemTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlBudgetXref#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlBudgetXref#getFromDate()
	 * @see #getGlBudgetXref()
	 * @generated
	 */
	EAttribute getGlBudgetXref_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlBudgetXref#getAllocationPercentage <em>Allocation Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allocation Percentage</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlBudgetXref#getAllocationPercentage()
	 * @see #getGlBudgetXref()
	 * @generated
	 */
	EAttribute getGlBudgetXref_AllocationPercentage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlBudgetXref#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlBudgetXref#getThruDate()
	 * @see #getGlBudgetXref()
	 * @generated
	 */
	EAttribute getGlBudgetXref_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.GlFiscalType <em>Gl Fiscal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gl Fiscal Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlFiscalType
	 * @generated
	 */
	EClass getGlFiscalType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlFiscalType#getGlFiscalTypeId <em>Gl Fiscal Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gl Fiscal Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlFiscalType#getGlFiscalTypeId()
	 * @see #getGlFiscalType()
	 * @generated
	 */
	EAttribute getGlFiscalType_GlFiscalTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlFiscalType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlFiscalType#getDescription()
	 * @see #getGlFiscalType()
	 * @generated
	 */
	EAttribute getGlFiscalType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.GlJournal <em>Gl Journal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gl Journal</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlJournal
	 * @generated
	 */
	EClass getGlJournal();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlJournal#getGlJournalId <em>Gl Journal Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gl Journal Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlJournal#getGlJournalId()
	 * @see #getGlJournal()
	 * @generated
	 */
	EAttribute getGlJournal_GlJournalId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlJournal#getGlJournalName <em>Gl Journal Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gl Journal Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlJournal#getGlJournalName()
	 * @see #getGlJournal()
	 * @generated
	 */
	EAttribute getGlJournal_GlJournalName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlJournal#isIsPosted <em>Is Posted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Posted</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlJournal#isIsPosted()
	 * @see #getGlJournal()
	 * @generated
	 */
	EAttribute getGlJournal_IsPosted();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlJournal#getOrganizationPartyId <em>Organization Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlJournal#getOrganizationPartyId()
	 * @see #getGlJournal()
	 * @generated
	 */
	EReference getGlJournal_OrganizationPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlJournal#getPostedDate <em>Posted Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posted Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlJournal#getPostedDate()
	 * @see #getGlJournal()
	 * @generated
	 */
	EAttribute getGlJournal_PostedDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.GlReconciliation <em>Gl Reconciliation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gl Reconciliation</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlReconciliation
	 * @generated
	 */
	EClass getGlReconciliation();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getGlReconciliationId <em>Gl Reconciliation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gl Reconciliation Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getGlReconciliationId()
	 * @see #getGlReconciliation()
	 * @generated
	 */
	EAttribute getGlReconciliation_GlReconciliationId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getCreatedByUserLogin()
	 * @see #getGlReconciliation()
	 * @generated
	 */
	EAttribute getGlReconciliation_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getCreatedDate()
	 * @see #getGlReconciliation()
	 * @generated
	 */
	EAttribute getGlReconciliation_CreatedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getDescription()
	 * @see #getGlReconciliation()
	 * @generated
	 */
	EAttribute getGlReconciliation_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getGlAccountId <em>Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getGlAccountId()
	 * @see #getGlReconciliation()
	 * @generated
	 */
	EReference getGlReconciliation_GlAccountId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getGlReconciliationName <em>Gl Reconciliation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gl Reconciliation Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getGlReconciliationName()
	 * @see #getGlReconciliation()
	 * @generated
	 */
	EAttribute getGlReconciliation_GlReconciliationName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getLastModifiedByUserLogin()
	 * @see #getGlReconciliation()
	 * @generated
	 */
	EAttribute getGlReconciliation_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getLastModifiedDate()
	 * @see #getGlReconciliation()
	 * @generated
	 */
	EAttribute getGlReconciliation_LastModifiedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getOpeningBalance <em>Opening Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opening Balance</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getOpeningBalance()
	 * @see #getGlReconciliation()
	 * @generated
	 */
	EAttribute getGlReconciliation_OpeningBalance();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getOrganizationPartyId <em>Organization Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getOrganizationPartyId()
	 * @see #getGlReconciliation()
	 * @generated
	 */
	EReference getGlReconciliation_OrganizationPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getReconciledBalance <em>Reconciled Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reconciled Balance</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getReconciledBalance()
	 * @see #getGlReconciliation()
	 * @generated
	 */
	EAttribute getGlReconciliation_ReconciledBalance();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getReconciledDate <em>Reconciled Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reconciled Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getReconciledDate()
	 * @see #getGlReconciliation()
	 * @generated
	 */
	EAttribute getGlReconciliation_ReconciledDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlReconciliation#getStatusId()
	 * @see #getGlReconciliation()
	 * @generated
	 */
	EReference getGlReconciliation_StatusId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.GlReconciliationEntry <em>Gl Reconciliation Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gl Reconciliation Entry</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlReconciliationEntry
	 * @generated
	 */
	EClass getGlReconciliationEntry();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlReconciliationEntry#getGlReconciliationId <em>Gl Reconciliation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Reconciliation Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlReconciliationEntry#getGlReconciliationId()
	 * @see #getGlReconciliationEntry()
	 * @generated
	 */
	EReference getGlReconciliationEntry_GlReconciliationId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.GlReconciliationEntry#getAcctgTransId <em>Acctg Trans Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Acctg Trans Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlReconciliationEntry#getAcctgTransId()
	 * @see #getGlReconciliationEntry()
	 * @generated
	 */
	EReference getGlReconciliationEntry_AcctgTransId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlReconciliationEntry#getAcctgTransEntrySeqId <em>Acctg Trans Entry Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acctg Trans Entry Seq Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlReconciliationEntry#getAcctgTransEntrySeqId()
	 * @see #getGlReconciliationEntry()
	 * @generated
	 */
	EAttribute getGlReconciliationEntry_AcctgTransEntrySeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlReconciliationEntry#getReconciledAmount <em>Reconciled Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reconciled Amount</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlReconciliationEntry#getReconciledAmount()
	 * @see #getGlReconciliationEntry()
	 * @generated
	 */
	EAttribute getGlReconciliationEntry_ReconciledAmount();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.GlResourceType <em>Gl Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gl Resource Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlResourceType
	 * @generated
	 */
	EClass getGlResourceType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlResourceType#getGlResourceTypeId <em>Gl Resource Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gl Resource Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlResourceType#getGlResourceTypeId()
	 * @see #getGlResourceType()
	 * @generated
	 */
	EAttribute getGlResourceType_GlResourceTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlResourceType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlResourceType#getDescription()
	 * @see #getGlResourceType()
	 * @generated
	 */
	EAttribute getGlResourceType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.GlXbrlClass <em>Gl Xbrl Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gl Xbrl Class</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlXbrlClass
	 * @generated
	 */
	EClass getGlXbrlClass();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlXbrlClass#getGlXbrlClassId <em>Gl Xbrl Class Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gl Xbrl Class Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlXbrlClass#getGlXbrlClassId()
	 * @see #getGlXbrlClass()
	 * @generated
	 */
	EAttribute getGlXbrlClass_GlXbrlClassId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.GlXbrlClass#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.GlXbrlClass#getDescription()
	 * @see #getGlXbrlClass()
	 * @generated
	 */
	EAttribute getGlXbrlClass_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference <em>Party Acctg Preference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party Acctg Preference</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference
	 * @generated
	 */
	EClass getPartyAcctgPreference();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getPartyId()
	 * @see #getPartyAcctgPreference()
	 * @generated
	 */
	EAttribute getPartyAcctgPreference_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getBaseCurrencyUomId <em>Base Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getBaseCurrencyUomId()
	 * @see #getPartyAcctgPreference()
	 * @generated
	 */
	EReference getPartyAcctgPreference_BaseCurrencyUomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getCogsMethodId <em>Cogs Method Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cogs Method Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getCogsMethodId()
	 * @see #getPartyAcctgPreference()
	 * @generated
	 */
	EReference getPartyAcctgPreference_CogsMethodId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#isEnableAccounting <em>Enable Accounting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Accounting</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#isEnableAccounting()
	 * @see #getPartyAcctgPreference()
	 * @generated
	 */
	EAttribute getPartyAcctgPreference_EnableAccounting();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getErrorGlJournalId <em>Error Gl Journal Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Gl Journal Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getErrorGlJournalId()
	 * @see #getPartyAcctgPreference()
	 * @generated
	 */
	EReference getPartyAcctgPreference_ErrorGlJournalId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getFiscalYearStartDay <em>Fiscal Year Start Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fiscal Year Start Day</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getFiscalYearStartDay()
	 * @see #getPartyAcctgPreference()
	 * @generated
	 */
	EAttribute getPartyAcctgPreference_FiscalYearStartDay();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getFiscalYearStartMonth <em>Fiscal Year Start Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fiscal Year Start Month</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getFiscalYearStartMonth()
	 * @see #getPartyAcctgPreference()
	 * @generated
	 */
	EAttribute getPartyAcctgPreference_FiscalYearStartMonth();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getInvoiceIdPrefix <em>Invoice Id Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Id Prefix</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getInvoiceIdPrefix()
	 * @see #getPartyAcctgPreference()
	 * @generated
	 */
	EAttribute getPartyAcctgPreference_InvoiceIdPrefix();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getInvoiceSeqCustMethId <em>Invoice Seq Cust Meth Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Seq Cust Meth Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getInvoiceSeqCustMethId()
	 * @see #getPartyAcctgPreference()
	 * @generated
	 */
	EReference getPartyAcctgPreference_InvoiceSeqCustMethId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getLastInvoiceNumber <em>Last Invoice Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Invoice Number</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getLastInvoiceNumber()
	 * @see #getPartyAcctgPreference()
	 * @generated
	 */
	EAttribute getPartyAcctgPreference_LastInvoiceNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getLastInvoiceRestartDate <em>Last Invoice Restart Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Invoice Restart Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getLastInvoiceRestartDate()
	 * @see #getPartyAcctgPreference()
	 * @generated
	 */
	EAttribute getPartyAcctgPreference_LastInvoiceRestartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getLastOrderNumber <em>Last Order Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Order Number</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getLastOrderNumber()
	 * @see #getPartyAcctgPreference()
	 * @generated
	 */
	EAttribute getPartyAcctgPreference_LastOrderNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getLastQuoteNumber <em>Last Quote Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Quote Number</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getLastQuoteNumber()
	 * @see #getPartyAcctgPreference()
	 * @generated
	 */
	EAttribute getPartyAcctgPreference_LastQuoteNumber();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getOldInvoiceSequenceEnumId <em>Old Invoice Sequence Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Old Invoice Sequence Enum Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getOldInvoiceSequenceEnumId()
	 * @see #getPartyAcctgPreference()
	 * @generated
	 */
	EReference getPartyAcctgPreference_OldInvoiceSequenceEnumId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getOldOrderSequenceEnumId <em>Old Order Sequence Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Old Order Sequence Enum Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getOldOrderSequenceEnumId()
	 * @see #getPartyAcctgPreference()
	 * @generated
	 */
	EReference getPartyAcctgPreference_OldOrderSequenceEnumId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getOldQuoteSequenceEnumId <em>Old Quote Sequence Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Old Quote Sequence Enum Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getOldQuoteSequenceEnumId()
	 * @see #getPartyAcctgPreference()
	 * @generated
	 */
	EReference getPartyAcctgPreference_OldQuoteSequenceEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getOrderIdPrefix <em>Order Id Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Id Prefix</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getOrderIdPrefix()
	 * @see #getPartyAcctgPreference()
	 * @generated
	 */
	EAttribute getPartyAcctgPreference_OrderIdPrefix();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getOrderSeqCustMethId <em>Order Seq Cust Meth Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Seq Cust Meth Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getOrderSeqCustMethId()
	 * @see #getPartyAcctgPreference()
	 * @generated
	 */
	EReference getPartyAcctgPreference_OrderSeqCustMethId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getQuoteIdPrefix <em>Quote Id Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quote Id Prefix</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getQuoteIdPrefix()
	 * @see #getPartyAcctgPreference()
	 * @generated
	 */
	EAttribute getPartyAcctgPreference_QuoteIdPrefix();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getQuoteSeqCustMethId <em>Quote Seq Cust Meth Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote Seq Cust Meth Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getQuoteSeqCustMethId()
	 * @see #getPartyAcctgPreference()
	 * @generated
	 */
	EReference getPartyAcctgPreference_QuoteSeqCustMethId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getRefundPaymentMethodId <em>Refund Payment Method Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refund Payment Method Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getRefundPaymentMethodId()
	 * @see #getPartyAcctgPreference()
	 * @generated
	 */
	EReference getPartyAcctgPreference_RefundPaymentMethodId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getTaxFormId <em>Tax Form Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tax Form Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#getTaxFormId()
	 * @see #getPartyAcctgPreference()
	 * @generated
	 */
	EReference getPartyAcctgPreference_TaxFormId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#isUseInvoiceIdForReturns <em>Use Invoice Id For Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Invoice Id For Returns</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyAcctgPreference#isUseInvoiceIdForReturns()
	 * @see #getPartyAcctgPreference()
	 * @generated
	 */
	EAttribute getPartyAcctgPreference_UseInvoiceIdForReturns();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.PartyGlAccount <em>Party Gl Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party Gl Account</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyGlAccount
	 * @generated
	 */
	EClass getPartyGlAccount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.PartyGlAccount#getOrganizationPartyId <em>Organization Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyGlAccount#getOrganizationPartyId()
	 * @see #getPartyGlAccount()
	 * @generated
	 */
	EReference getPartyGlAccount_OrganizationPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.PartyGlAccount#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyGlAccount#getPartyId()
	 * @see #getPartyGlAccount()
	 * @generated
	 */
	EReference getPartyGlAccount_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.PartyGlAccount#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyGlAccount#getRoleTypeId()
	 * @see #getPartyGlAccount()
	 * @generated
	 */
	EReference getPartyGlAccount_RoleTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.PartyGlAccount#getGlAccountTypeId <em>Gl Account Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyGlAccount#getGlAccountTypeId()
	 * @see #getPartyGlAccount()
	 * @generated
	 */
	EReference getPartyGlAccount_GlAccountTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.PartyGlAccount#getGlAccountId <em>Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyGlAccount#getGlAccountId()
	 * @see #getPartyGlAccount()
	 * @generated
	 */
	EReference getPartyGlAccount_GlAccountId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl <em>Party Pref Doc Type Tpl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party Pref Doc Type Tpl</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl
	 * @generated
	 */
	EClass getPartyPrefDocTypeTpl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getPartyPrefDocTypeTplId <em>Party Pref Doc Type Tpl Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Pref Doc Type Tpl Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getPartyPrefDocTypeTplId()
	 * @see #getPartyPrefDocTypeTpl()
	 * @generated
	 */
	EAttribute getPartyPrefDocTypeTpl_PartyPrefDocTypeTplId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getCustomScreenId <em>Custom Screen Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Screen Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getCustomScreenId()
	 * @see #getPartyPrefDocTypeTpl()
	 * @generated
	 */
	EAttribute getPartyPrefDocTypeTpl_CustomScreenId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getFromDate()
	 * @see #getPartyPrefDocTypeTpl()
	 * @generated
	 */
	EAttribute getPartyPrefDocTypeTpl_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getInvoiceTypeId <em>Invoice Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getInvoiceTypeId()
	 * @see #getPartyPrefDocTypeTpl()
	 * @generated
	 */
	EReference getPartyPrefDocTypeTpl_InvoiceTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getOrderTypeId <em>Order Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getOrderTypeId()
	 * @see #getPartyPrefDocTypeTpl()
	 * @generated
	 */
	EReference getPartyPrefDocTypeTpl_OrderTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getPartyId()
	 * @see #getPartyPrefDocTypeTpl()
	 * @generated
	 */
	EReference getPartyPrefDocTypeTpl_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getQuoteTypeId <em>Quote Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getQuoteTypeId()
	 * @see #getPartyPrefDocTypeTpl()
	 * @generated
	 */
	EReference getPartyPrefDocTypeTpl_QuoteTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.PartyPrefDocTypeTpl#getThruDate()
	 * @see #getPartyPrefDocTypeTpl()
	 * @generated
	 */
	EAttribute getPartyPrefDocTypeTpl_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.ProductAverageCost <em>Product Average Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Average Cost</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.ProductAverageCost
	 * @generated
	 */
	EClass getProductAverageCost();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.ProductAverageCost#getProductAverageCostTypeId <em>Product Average Cost Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Average Cost Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.ProductAverageCost#getProductAverageCostTypeId()
	 * @see #getProductAverageCost()
	 * @generated
	 */
	EReference getProductAverageCost_ProductAverageCostTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.ProductAverageCost#getOrganizationPartyId <em>Organization Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.ProductAverageCost#getOrganizationPartyId()
	 * @see #getProductAverageCost()
	 * @generated
	 */
	EReference getProductAverageCost_OrganizationPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.ProductAverageCost#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.ProductAverageCost#getProductId()
	 * @see #getProductAverageCost()
	 * @generated
	 */
	EReference getProductAverageCost_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.ProductAverageCost#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.ProductAverageCost#getFacilityId()
	 * @see #getProductAverageCost()
	 * @generated
	 */
	EReference getProductAverageCost_FacilityId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.ProductAverageCost#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.ProductAverageCost#getFromDate()
	 * @see #getProductAverageCost()
	 * @generated
	 */
	EAttribute getProductAverageCost_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.ProductAverageCost#getAverageCost <em>Average Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Cost</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.ProductAverageCost#getAverageCost()
	 * @see #getProductAverageCost()
	 * @generated
	 */
	EAttribute getProductAverageCost_AverageCost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.ProductAverageCost#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.ProductAverageCost#getThruDate()
	 * @see #getProductAverageCost()
	 * @generated
	 */
	EAttribute getProductAverageCost_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.ProductAverageCostType <em>Product Average Cost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Average Cost Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.ProductAverageCostType
	 * @generated
	 */
	EClass getProductAverageCostType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.ProductAverageCostType#getProductAverageCostTypeId <em>Product Average Cost Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Average Cost Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.ProductAverageCostType#getProductAverageCostTypeId()
	 * @see #getProductAverageCostType()
	 * @generated
	 */
	EAttribute getProductAverageCostType_ProductAverageCostTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.ProductAverageCostType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.ProductAverageCostType#getDescription()
	 * @see #getProductAverageCostType()
	 * @generated
	 */
	EAttribute getProductAverageCostType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.ProductAverageCostType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.ProductAverageCostType#isHasTable()
	 * @see #getProductAverageCostType()
	 * @generated
	 */
	EAttribute getProductAverageCostType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.ProductAverageCostType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.ProductAverageCostType#getParentTypeId()
	 * @see #getProductAverageCostType()
	 * @generated
	 */
	EReference getProductAverageCostType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.SettlementTerm <em>Settlement Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Settlement Term</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.SettlementTerm
	 * @generated
	 */
	EClass getSettlementTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.SettlementTerm#getSettlementTermId <em>Settlement Term Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Settlement Term Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.SettlementTerm#getSettlementTermId()
	 * @see #getSettlementTerm()
	 * @generated
	 */
	EAttribute getSettlementTerm_SettlementTermId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.SettlementTerm#getTermName <em>Term Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.SettlementTerm#getTermName()
	 * @see #getSettlementTerm()
	 * @generated
	 */
	EAttribute getSettlementTerm_TermName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.SettlementTerm#getTermValue <em>Term Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Value</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.SettlementTerm#getTermValue()
	 * @see #getSettlementTerm()
	 * @generated
	 */
	EAttribute getSettlementTerm_TermValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.ledger.SettlementTerm#getUomId <em>Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uom Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.SettlementTerm#getUomId()
	 * @see #getSettlementTerm()
	 * @generated
	 */
	EAttribute getSettlementTerm_UomId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.ledger.VarianceReasonGlAccount <em>Variance Reason Gl Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variance Reason Gl Account</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.VarianceReasonGlAccount
	 * @generated
	 */
	EClass getVarianceReasonGlAccount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.VarianceReasonGlAccount#getVarianceReasonId <em>Variance Reason Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variance Reason Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.VarianceReasonGlAccount#getVarianceReasonId()
	 * @see #getVarianceReasonGlAccount()
	 * @generated
	 */
	EReference getVarianceReasonGlAccount_VarianceReasonId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.VarianceReasonGlAccount#getOrganizationPartyId <em>Organization Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.VarianceReasonGlAccount#getOrganizationPartyId()
	 * @see #getVarianceReasonGlAccount()
	 * @generated
	 */
	EReference getVarianceReasonGlAccount_OrganizationPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.ledger.VarianceReasonGlAccount#getGlAccountId <em>Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.ledger.VarianceReasonGlAccount#getGlAccountId()
	 * @see #getVarianceReasonGlAccount()
	 * @generated
	 */
	EReference getVarianceReasonGlAccount_GlAccountId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LedgerFactory getLedgerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl <em>Acctg Trans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getAcctgTrans()
		 * @generated
		 */
		EClass ACCTG_TRANS = eINSTANCE.getAcctgTrans();

		/**
		 * The meta object literal for the '<em><b>Acctg Trans Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS__ACCTG_TRANS_ID = eINSTANCE.getAcctgTrans_AcctgTransId();

		/**
		 * The meta object literal for the '<em><b>Acctg Trans Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS__ACCTG_TRANS_ATTRIBUTES = eINSTANCE.getAcctgTrans_AcctgTransAttributes();

		/**
		 * The meta object literal for the '<em><b>Acctg Trans Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS__ACCTG_TRANS_ENTRIES = eINSTANCE.getAcctgTrans_AcctgTransEntries();

		/**
		 * The meta object literal for the '<em><b>Acctg Trans Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS__ACCTG_TRANS_TYPE_ID = eINSTANCE.getAcctgTrans_AcctgTransTypeId();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS__CREATED_BY_USER_LOGIN = eINSTANCE.getAcctgTrans_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS__CREATED_DATE = eINSTANCE.getAcctgTrans_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS__DESCRIPTION = eINSTANCE.getAcctgTrans_Description();

		/**
		 * The meta object literal for the '<em><b>Fin Account Trans Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS__FIN_ACCOUNT_TRANS_ID = eINSTANCE.getAcctgTrans_FinAccountTransId();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS__FIXED_ASSET_ID = eINSTANCE.getAcctgTrans_FixedAssetId();

		/**
		 * The meta object literal for the '<em><b>Gl Fiscal Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS__GL_FISCAL_TYPE_ID = eINSTANCE.getAcctgTrans_GlFiscalTypeId();

		/**
		 * The meta object literal for the '<em><b>Gl Journal Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS__GL_JOURNAL_ID = eINSTANCE.getAcctgTrans_GlJournalId();

		/**
		 * The meta object literal for the '<em><b>Group Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS__GROUP_STATUS_ID = eINSTANCE.getAcctgTrans_GroupStatusId();

		/**
		 * The meta object literal for the '<em><b>Inventory Item Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS__INVENTORY_ITEM_ID = eINSTANCE.getAcctgTrans_InventoryItemId();

		/**
		 * The meta object literal for the '<em><b>Invoice Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS__INVOICE_ID = eINSTANCE.getAcctgTrans_InvoiceId();

		/**
		 * The meta object literal for the '<em><b>Is Posted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS__IS_POSTED = eINSTANCE.getAcctgTrans_IsPosted();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getAcctgTrans_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS__LAST_MODIFIED_DATE = eINSTANCE.getAcctgTrans_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS__PARTY_ID = eINSTANCE.getAcctgTrans_PartyId();

		/**
		 * The meta object literal for the '<em><b>Payment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS__PAYMENT_ID = eINSTANCE.getAcctgTrans_PaymentId();

		/**
		 * The meta object literal for the '<em><b>Physical Inventory Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS__PHYSICAL_INVENTORY_ID = eINSTANCE.getAcctgTrans_PhysicalInventoryId();

		/**
		 * The meta object literal for the '<em><b>Posted Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS__POSTED_DATE = eINSTANCE.getAcctgTrans_PostedDate();

		/**
		 * The meta object literal for the '<em><b>Receipt Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS__RECEIPT_ID = eINSTANCE.getAcctgTrans_ReceiptId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS__ROLE_TYPE_ID = eINSTANCE.getAcctgTrans_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Scheduled Posting Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS__SCHEDULED_POSTING_DATE = eINSTANCE.getAcctgTrans_ScheduledPostingDate();

		/**
		 * The meta object literal for the '<em><b>Shipment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS__SHIPMENT_ID = eINSTANCE.getAcctgTrans_ShipmentId();

		/**
		 * The meta object literal for the '<em><b>Their Acctg Trans Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS__THEIR_ACCTG_TRANS_ID = eINSTANCE.getAcctgTrans_TheirAcctgTransId();

		/**
		 * The meta object literal for the '<em><b>Transaction Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS__TRANSACTION_DATE = eINSTANCE.getAcctgTrans_TransactionDate();

		/**
		 * The meta object literal for the '<em><b>Voucher Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS__VOUCHER_DATE = eINSTANCE.getAcctgTrans_VoucherDate();

		/**
		 * The meta object literal for the '<em><b>Voucher Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS__VOUCHER_REF = eINSTANCE.getAcctgTrans_VoucherRef();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS__WORK_EFFORT_ID = eINSTANCE.getAcctgTrans_WorkEffortId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransAttributeImpl <em>Acctg Trans Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransAttributeImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getAcctgTransAttribute()
		 * @generated
		 */
		EClass ACCTG_TRANS_ATTRIBUTE = eINSTANCE.getAcctgTransAttribute();

		/**
		 * The meta object literal for the '<em><b>Acctg Trans Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS_ATTRIBUTE__ACCTG_TRANS_ID = eINSTANCE.getAcctgTransAttribute_AcctgTransId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS_ATTRIBUTE__ATTR_NAME = eINSTANCE.getAcctgTransAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getAcctgTransAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getAcctgTransAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl <em>Acctg Trans Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getAcctgTransEntry()
		 * @generated
		 */
		EClass ACCTG_TRANS_ENTRY = eINSTANCE.getAcctgTransEntry();

		/**
		 * The meta object literal for the '<em><b>Acctg Trans Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS_ENTRY__ACCTG_TRANS_ID = eINSTANCE.getAcctgTransEntry_AcctgTransId();

		/**
		 * The meta object literal for the '<em><b>Acctg Trans Entry Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS_ENTRY__ACCTG_TRANS_ENTRY_SEQ_ID = eINSTANCE.getAcctgTransEntry_AcctgTransEntrySeqId();

		/**
		 * The meta object literal for the '<em><b>Acctg Trans Entry Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS_ENTRY__ACCTG_TRANS_ENTRY_TYPE_ID = eINSTANCE.getAcctgTransEntry_AcctgTransEntryTypeId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS_ENTRY__AMOUNT = eINSTANCE.getAcctgTransEntry_Amount();

		/**
		 * The meta object literal for the '<em><b>Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS_ENTRY__CURRENCY_UOM_ID = eINSTANCE.getAcctgTransEntry_CurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Debit Credit Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS_ENTRY__DEBIT_CREDIT_FLAG = eINSTANCE.getAcctgTransEntry_DebitCreditFlag();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS_ENTRY__DESCRIPTION = eINSTANCE.getAcctgTransEntry_Description();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS_ENTRY__DUE_DATE = eINSTANCE.getAcctgTransEntry_DueDate();

		/**
		 * The meta object literal for the '<em><b>Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS_ENTRY__GL_ACCOUNT_ID = eINSTANCE.getAcctgTransEntry_GlAccountId();

		/**
		 * The meta object literal for the '<em><b>Gl Account Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS_ENTRY__GL_ACCOUNT_TYPE_ID = eINSTANCE.getAcctgTransEntry_GlAccountTypeId();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS_ENTRY__GROUP_ID = eINSTANCE.getAcctgTransEntry_GroupId();

		/**
		 * The meta object literal for the '<em><b>Inventory Item Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS_ENTRY__INVENTORY_ITEM_ID = eINSTANCE.getAcctgTransEntry_InventoryItemId();

		/**
		 * The meta object literal for the '<em><b>Is Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS_ENTRY__IS_SUMMARY = eINSTANCE.getAcctgTransEntry_IsSummary();

		/**
		 * The meta object literal for the '<em><b>Organization Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS_ENTRY__ORGANIZATION_PARTY_ID = eINSTANCE.getAcctgTransEntry_OrganizationPartyId();

		/**
		 * The meta object literal for the '<em><b>Orig Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS_ENTRY__ORIG_AMOUNT = eINSTANCE.getAcctgTransEntry_OrigAmount();

		/**
		 * The meta object literal for the '<em><b>Orig Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS_ENTRY__ORIG_CURRENCY_UOM_ID = eINSTANCE.getAcctgTransEntry_OrigCurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS_ENTRY__PARTY_ID = eINSTANCE.getAcctgTransEntry_PartyId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS_ENTRY__PRODUCT_ID = eINSTANCE.getAcctgTransEntry_ProductId();

		/**
		 * The meta object literal for the '<em><b>Reconcile Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS_ENTRY__RECONCILE_STATUS_ID = eINSTANCE.getAcctgTransEntry_ReconcileStatusId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS_ENTRY__ROLE_TYPE_ID = eINSTANCE.getAcctgTransEntry_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Settlement Term Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS_ENTRY__SETTLEMENT_TERM_ID = eINSTANCE.getAcctgTransEntry_SettlementTermId();

		/**
		 * The meta object literal for the '<em><b>Tax Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS_ENTRY__TAX_ID = eINSTANCE.getAcctgTransEntry_TaxId();

		/**
		 * The meta object literal for the '<em><b>Their Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS_ENTRY__THEIR_PARTY_ID = eINSTANCE.getAcctgTransEntry_TheirPartyId();

		/**
		 * The meta object literal for the '<em><b>Their Product Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS_ENTRY__THEIR_PRODUCT_ID = eINSTANCE.getAcctgTransEntry_TheirProductId();

		/**
		 * The meta object literal for the '<em><b>Voucher Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS_ENTRY__VOUCHER_REF = eINSTANCE.getAcctgTransEntry_VoucherRef();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryTypeImpl <em>Acctg Trans Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransEntryTypeImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getAcctgTransEntryType()
		 * @generated
		 */
		EClass ACCTG_TRANS_ENTRY_TYPE = eINSTANCE.getAcctgTransEntryType();

		/**
		 * The meta object literal for the '<em><b>Acctg Trans Entry Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS_ENTRY_TYPE__ACCTG_TRANS_ENTRY_TYPE_ID = eINSTANCE.getAcctgTransEntryType_AcctgTransEntryTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS_ENTRY_TYPE__DESCRIPTION = eINSTANCE.getAcctgTransEntryType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS_ENTRY_TYPE__HAS_TABLE = eINSTANCE.getAcctgTransEntryType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS_ENTRY_TYPE__PARENT_TYPE_ID = eINSTANCE.getAcctgTransEntryType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransTypeImpl <em>Acctg Trans Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransTypeImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getAcctgTransType()
		 * @generated
		 */
		EClass ACCTG_TRANS_TYPE = eINSTANCE.getAcctgTransType();

		/**
		 * The meta object literal for the '<em><b>Acctg Trans Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS_TYPE__ACCTG_TRANS_TYPE_ID = eINSTANCE.getAcctgTransType_AcctgTransTypeId();

		/**
		 * The meta object literal for the '<em><b>Acctg Trans Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS_TYPE__ACCTG_TRANS_TYPE_ATTRS = eINSTANCE.getAcctgTransType_AcctgTransTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS_TYPE__DESCRIPTION = eINSTANCE.getAcctgTransType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS_TYPE__HAS_TABLE = eINSTANCE.getAcctgTransType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS_TYPE__PARENT_TYPE_ID = eINSTANCE.getAcctgTransType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransTypeAttrImpl <em>Acctg Trans Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.AcctgTransTypeAttrImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getAcctgTransTypeAttr()
		 * @generated
		 */
		EClass ACCTG_TRANS_TYPE_ATTR = eINSTANCE.getAcctgTransTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Acctg Trans Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCTG_TRANS_TYPE_ATTR__ACCTG_TRANS_TYPE_ID = eINSTANCE.getAcctgTransTypeAttr_AcctgTransTypeId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS_TYPE_ATTR__ATTR_NAME = eINSTANCE.getAcctgTransTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCTG_TRANS_TYPE_ATTR__DESCRIPTION = eINSTANCE.getAcctgTransTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl <em>Gl Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccount()
		 * @generated
		 */
		EClass GL_ACCOUNT = eINSTANCE.getGlAccount();

		/**
		 * The meta object literal for the '<em><b>Gl Account Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT__GL_ACCOUNT_ID = eINSTANCE.getGlAccount_GlAccountId();

		/**
		 * The meta object literal for the '<em><b>Account Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT__ACCOUNT_CODE = eINSTANCE.getGlAccount_AccountCode();

		/**
		 * The meta object literal for the '<em><b>Account Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT__ACCOUNT_NAME = eINSTANCE.getGlAccount_AccountName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT__DESCRIPTION = eINSTANCE.getGlAccount_Description();

		/**
		 * The meta object literal for the '<em><b>External Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT__EXTERNAL_ID = eINSTANCE.getGlAccount_ExternalId();

		/**
		 * The meta object literal for the '<em><b>Gl Account Class Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT__GL_ACCOUNT_CLASS_ID = eINSTANCE.getGlAccount_GlAccountClassId();

		/**
		 * The meta object literal for the '<em><b>Gl Account Group Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT__GL_ACCOUNT_GROUP_MEMBERS = eINSTANCE.getGlAccount_GlAccountGroupMembers();

		/**
		 * The meta object literal for the '<em><b>Gl Account Organizations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT__GL_ACCOUNT_ORGANIZATIONS = eINSTANCE.getGlAccount_GlAccountOrganizations();

		/**
		 * The meta object literal for the '<em><b>Gl Account Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT__GL_ACCOUNT_TYPE_ID = eINSTANCE.getGlAccount_GlAccountTypeId();

		/**
		 * The meta object literal for the '<em><b>Gl Resource Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT__GL_RESOURCE_TYPE_ID = eINSTANCE.getGlAccount_GlResourceTypeId();

		/**
		 * The meta object literal for the '<em><b>Gl Xbrl Class Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT__GL_XBRL_CLASS_ID = eINSTANCE.getGlAccount_GlXbrlClassId();

		/**
		 * The meta object literal for the '<em><b>Parent Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT__PARENT_GL_ACCOUNT_ID = eINSTANCE.getGlAccount_ParentGlAccountId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT__PRODUCT_ID = eINSTANCE.getGlAccount_ProductId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountCategoryImpl <em>Gl Account Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountCategoryImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccountCategory()
		 * @generated
		 */
		EClass GL_ACCOUNT_CATEGORY = eINSTANCE.getGlAccountCategory();

		/**
		 * The meta object literal for the '<em><b>Gl Account Category Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_CATEGORY__GL_ACCOUNT_CATEGORY_ID = eINSTANCE.getGlAccountCategory_GlAccountCategoryId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_CATEGORY__DESCRIPTION = eINSTANCE.getGlAccountCategory_Description();

		/**
		 * The meta object literal for the '<em><b>Gl Account Category Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT_CATEGORY__GL_ACCOUNT_CATEGORY_TYPE_ID = eINSTANCE.getGlAccountCategory_GlAccountCategoryTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountCategoryMemberImpl <em>Gl Account Category Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountCategoryMemberImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccountCategoryMember()
		 * @generated
		 */
		EClass GL_ACCOUNT_CATEGORY_MEMBER = eINSTANCE.getGlAccountCategoryMember();

		/**
		 * The meta object literal for the '<em><b>Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT_CATEGORY_MEMBER__GL_ACCOUNT_ID = eINSTANCE.getGlAccountCategoryMember_GlAccountId();

		/**
		 * The meta object literal for the '<em><b>Gl Account Category Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT_CATEGORY_MEMBER__GL_ACCOUNT_CATEGORY_ID = eINSTANCE.getGlAccountCategoryMember_GlAccountCategoryId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_CATEGORY_MEMBER__FROM_DATE = eINSTANCE.getGlAccountCategoryMember_FromDate();

		/**
		 * The meta object literal for the '<em><b>Amount Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_CATEGORY_MEMBER__AMOUNT_PERCENTAGE = eINSTANCE.getGlAccountCategoryMember_AmountPercentage();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_CATEGORY_MEMBER__THRU_DATE = eINSTANCE.getGlAccountCategoryMember_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountCategoryTypeImpl <em>Gl Account Category Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountCategoryTypeImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccountCategoryType()
		 * @generated
		 */
		EClass GL_ACCOUNT_CATEGORY_TYPE = eINSTANCE.getGlAccountCategoryType();

		/**
		 * The meta object literal for the '<em><b>Gl Account Category Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_CATEGORY_TYPE__GL_ACCOUNT_CATEGORY_TYPE_ID = eINSTANCE.getGlAccountCategoryType_GlAccountCategoryTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_CATEGORY_TYPE__DESCRIPTION = eINSTANCE.getGlAccountCategoryType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountClassImpl <em>Gl Account Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountClassImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccountClass()
		 * @generated
		 */
		EClass GL_ACCOUNT_CLASS = eINSTANCE.getGlAccountClass();

		/**
		 * The meta object literal for the '<em><b>Gl Account Class Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_CLASS__GL_ACCOUNT_CLASS_ID = eINSTANCE.getGlAccountClass_GlAccountClassId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_CLASS__DESCRIPTION = eINSTANCE.getGlAccountClass_Description();

		/**
		 * The meta object literal for the '<em><b>Is Asset Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_CLASS__IS_ASSET_CLASS = eINSTANCE.getGlAccountClass_IsAssetClass();

		/**
		 * The meta object literal for the '<em><b>Parent Class Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT_CLASS__PARENT_CLASS_ID = eINSTANCE.getGlAccountClass_ParentClassId();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_CLASS__SEQUENCE_NUM = eINSTANCE.getGlAccountClass_SequenceNum();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountGroupImpl <em>Gl Account Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountGroupImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccountGroup()
		 * @generated
		 */
		EClass GL_ACCOUNT_GROUP = eINSTANCE.getGlAccountGroup();

		/**
		 * The meta object literal for the '<em><b>Gl Account Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_GROUP__GL_ACCOUNT_GROUP_ID = eINSTANCE.getGlAccountGroup_GlAccountGroupId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_GROUP__DESCRIPTION = eINSTANCE.getGlAccountGroup_Description();

		/**
		 * The meta object literal for the '<em><b>Gl Account Group Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT_GROUP__GL_ACCOUNT_GROUP_TYPE_ID = eINSTANCE.getGlAccountGroup_GlAccountGroupTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountGroupMemberImpl <em>Gl Account Group Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountGroupMemberImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccountGroupMember()
		 * @generated
		 */
		EClass GL_ACCOUNT_GROUP_MEMBER = eINSTANCE.getGlAccountGroupMember();

		/**
		 * The meta object literal for the '<em><b>Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_ID = eINSTANCE.getGlAccountGroupMember_GlAccountId();

		/**
		 * The meta object literal for the '<em><b>Gl Account Group Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP_TYPE_ID = eINSTANCE.getGlAccountGroupMember_GlAccountGroupTypeId();

		/**
		 * The meta object literal for the '<em><b>Gl Account Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT_GROUP_MEMBER__GL_ACCOUNT_GROUP_ID = eINSTANCE.getGlAccountGroupMember_GlAccountGroupId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountGroupTypeImpl <em>Gl Account Group Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountGroupTypeImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccountGroupType()
		 * @generated
		 */
		EClass GL_ACCOUNT_GROUP_TYPE = eINSTANCE.getGlAccountGroupType();

		/**
		 * The meta object literal for the '<em><b>Gl Account Group Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_GROUP_TYPE__GL_ACCOUNT_GROUP_TYPE_ID = eINSTANCE.getGlAccountGroupType_GlAccountGroupTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_GROUP_TYPE__DESCRIPTION = eINSTANCE.getGlAccountGroupType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountHistoryImpl <em>Gl Account History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountHistoryImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccountHistory()
		 * @generated
		 */
		EClass GL_ACCOUNT_HISTORY = eINSTANCE.getGlAccountHistory();

		/**
		 * The meta object literal for the '<em><b>Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT_HISTORY__GL_ACCOUNT_ID = eINSTANCE.getGlAccountHistory_GlAccountId();

		/**
		 * The meta object literal for the '<em><b>Organization Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT_HISTORY__ORGANIZATION_PARTY_ID = eINSTANCE.getGlAccountHistory_OrganizationPartyId();

		/**
		 * The meta object literal for the '<em><b>Custom Time Period Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT_HISTORY__CUSTOM_TIME_PERIOD_ID = eINSTANCE.getGlAccountHistory_CustomTimePeriodId();

		/**
		 * The meta object literal for the '<em><b>Ending Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_HISTORY__ENDING_BALANCE = eINSTANCE.getGlAccountHistory_EndingBalance();

		/**
		 * The meta object literal for the '<em><b>Opening Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_HISTORY__OPENING_BALANCE = eINSTANCE.getGlAccountHistory_OpeningBalance();

		/**
		 * The meta object literal for the '<em><b>Posted Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_HISTORY__POSTED_CREDITS = eINSTANCE.getGlAccountHistory_PostedCredits();

		/**
		 * The meta object literal for the '<em><b>Posted Debits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_HISTORY__POSTED_DEBITS = eINSTANCE.getGlAccountHistory_PostedDebits();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountOrganizationImpl <em>Gl Account Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountOrganizationImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccountOrganization()
		 * @generated
		 */
		EClass GL_ACCOUNT_ORGANIZATION = eINSTANCE.getGlAccountOrganization();

		/**
		 * The meta object literal for the '<em><b>Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT_ORGANIZATION__GL_ACCOUNT_ID = eINSTANCE.getGlAccountOrganization_GlAccountId();

		/**
		 * The meta object literal for the '<em><b>Organization Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT_ORGANIZATION__ORGANIZATION_PARTY_ID = eINSTANCE.getGlAccountOrganization_OrganizationPartyId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_ORGANIZATION__FROM_DATE = eINSTANCE.getGlAccountOrganization_FromDate();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT_ORGANIZATION__ROLE_TYPE_ID = eINSTANCE.getGlAccountOrganization_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_ORGANIZATION__THRU_DATE = eINSTANCE.getGlAccountOrganization_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountRoleImpl <em>Gl Account Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountRoleImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccountRole()
		 * @generated
		 */
		EClass GL_ACCOUNT_ROLE = eINSTANCE.getGlAccountRole();

		/**
		 * The meta object literal for the '<em><b>Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT_ROLE__GL_ACCOUNT_ID = eINSTANCE.getGlAccountRole_GlAccountId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT_ROLE__PARTY_ID = eINSTANCE.getGlAccountRole_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT_ROLE__ROLE_TYPE_ID = eINSTANCE.getGlAccountRole_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_ROLE__FROM_DATE = eINSTANCE.getGlAccountRole_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_ROLE__THRU_DATE = eINSTANCE.getGlAccountRole_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountTypeImpl <em>Gl Account Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountTypeImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccountType()
		 * @generated
		 */
		EClass GL_ACCOUNT_TYPE = eINSTANCE.getGlAccountType();

		/**
		 * The meta object literal for the '<em><b>Gl Account Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_TYPE__GL_ACCOUNT_TYPE_ID = eINSTANCE.getGlAccountType_GlAccountTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_TYPE__DESCRIPTION = eINSTANCE.getGlAccountType_Description();

		/**
		 * The meta object literal for the '<em><b>Gl Account Type Defaults</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT_TYPE__GL_ACCOUNT_TYPE_DEFAULTS = eINSTANCE.getGlAccountType_GlAccountTypeDefaults();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_ACCOUNT_TYPE__HAS_TABLE = eINSTANCE.getGlAccountType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT_TYPE__PARENT_TYPE_ID = eINSTANCE.getGlAccountType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlAccountTypeDefaultImpl <em>Gl Account Type Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlAccountTypeDefaultImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlAccountTypeDefault()
		 * @generated
		 */
		EClass GL_ACCOUNT_TYPE_DEFAULT = eINSTANCE.getGlAccountTypeDefault();

		/**
		 * The meta object literal for the '<em><b>Gl Account Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT_TYPE_DEFAULT__GL_ACCOUNT_TYPE_ID = eINSTANCE.getGlAccountTypeDefault_GlAccountTypeId();

		/**
		 * The meta object literal for the '<em><b>Organization Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT_TYPE_DEFAULT__ORGANIZATION_PARTY_ID = eINSTANCE.getGlAccountTypeDefault_OrganizationPartyId();

		/**
		 * The meta object literal for the '<em><b>Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_ACCOUNT_TYPE_DEFAULT__GL_ACCOUNT_ID = eINSTANCE.getGlAccountTypeDefault_GlAccountId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlBudgetXrefImpl <em>Gl Budget Xref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlBudgetXrefImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlBudgetXref()
		 * @generated
		 */
		EClass GL_BUDGET_XREF = eINSTANCE.getGlBudgetXref();

		/**
		 * The meta object literal for the '<em><b>Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_BUDGET_XREF__GL_ACCOUNT_ID = eINSTANCE.getGlBudgetXref_GlAccountId();

		/**
		 * The meta object literal for the '<em><b>Budget Item Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_BUDGET_XREF__BUDGET_ITEM_TYPE_ID = eINSTANCE.getGlBudgetXref_BudgetItemTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_BUDGET_XREF__FROM_DATE = eINSTANCE.getGlBudgetXref_FromDate();

		/**
		 * The meta object literal for the '<em><b>Allocation Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_BUDGET_XREF__ALLOCATION_PERCENTAGE = eINSTANCE.getGlBudgetXref_AllocationPercentage();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_BUDGET_XREF__THRU_DATE = eINSTANCE.getGlBudgetXref_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlFiscalTypeImpl <em>Gl Fiscal Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlFiscalTypeImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlFiscalType()
		 * @generated
		 */
		EClass GL_FISCAL_TYPE = eINSTANCE.getGlFiscalType();

		/**
		 * The meta object literal for the '<em><b>Gl Fiscal Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_FISCAL_TYPE__GL_FISCAL_TYPE_ID = eINSTANCE.getGlFiscalType_GlFiscalTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_FISCAL_TYPE__DESCRIPTION = eINSTANCE.getGlFiscalType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlJournalImpl <em>Gl Journal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlJournalImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlJournal()
		 * @generated
		 */
		EClass GL_JOURNAL = eINSTANCE.getGlJournal();

		/**
		 * The meta object literal for the '<em><b>Gl Journal Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_JOURNAL__GL_JOURNAL_ID = eINSTANCE.getGlJournal_GlJournalId();

		/**
		 * The meta object literal for the '<em><b>Gl Journal Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_JOURNAL__GL_JOURNAL_NAME = eINSTANCE.getGlJournal_GlJournalName();

		/**
		 * The meta object literal for the '<em><b>Is Posted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_JOURNAL__IS_POSTED = eINSTANCE.getGlJournal_IsPosted();

		/**
		 * The meta object literal for the '<em><b>Organization Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_JOURNAL__ORGANIZATION_PARTY_ID = eINSTANCE.getGlJournal_OrganizationPartyId();

		/**
		 * The meta object literal for the '<em><b>Posted Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_JOURNAL__POSTED_DATE = eINSTANCE.getGlJournal_PostedDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationImpl <em>Gl Reconciliation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlReconciliation()
		 * @generated
		 */
		EClass GL_RECONCILIATION = eINSTANCE.getGlReconciliation();

		/**
		 * The meta object literal for the '<em><b>Gl Reconciliation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_RECONCILIATION__GL_RECONCILIATION_ID = eINSTANCE.getGlReconciliation_GlReconciliationId();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_RECONCILIATION__CREATED_BY_USER_LOGIN = eINSTANCE.getGlReconciliation_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_RECONCILIATION__CREATED_DATE = eINSTANCE.getGlReconciliation_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_RECONCILIATION__DESCRIPTION = eINSTANCE.getGlReconciliation_Description();

		/**
		 * The meta object literal for the '<em><b>Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_RECONCILIATION__GL_ACCOUNT_ID = eINSTANCE.getGlReconciliation_GlAccountId();

		/**
		 * The meta object literal for the '<em><b>Gl Reconciliation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_RECONCILIATION__GL_RECONCILIATION_NAME = eINSTANCE.getGlReconciliation_GlReconciliationName();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_RECONCILIATION__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getGlReconciliation_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_RECONCILIATION__LAST_MODIFIED_DATE = eINSTANCE.getGlReconciliation_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Opening Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_RECONCILIATION__OPENING_BALANCE = eINSTANCE.getGlReconciliation_OpeningBalance();

		/**
		 * The meta object literal for the '<em><b>Organization Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_RECONCILIATION__ORGANIZATION_PARTY_ID = eINSTANCE.getGlReconciliation_OrganizationPartyId();

		/**
		 * The meta object literal for the '<em><b>Reconciled Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_RECONCILIATION__RECONCILED_BALANCE = eINSTANCE.getGlReconciliation_ReconciledBalance();

		/**
		 * The meta object literal for the '<em><b>Reconciled Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_RECONCILIATION__RECONCILED_DATE = eINSTANCE.getGlReconciliation_ReconciledDate();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_RECONCILIATION__STATUS_ID = eINSTANCE.getGlReconciliation_StatusId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationEntryImpl <em>Gl Reconciliation Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlReconciliationEntryImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlReconciliationEntry()
		 * @generated
		 */
		EClass GL_RECONCILIATION_ENTRY = eINSTANCE.getGlReconciliationEntry();

		/**
		 * The meta object literal for the '<em><b>Gl Reconciliation Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_RECONCILIATION_ENTRY__GL_RECONCILIATION_ID = eINSTANCE.getGlReconciliationEntry_GlReconciliationId();

		/**
		 * The meta object literal for the '<em><b>Acctg Trans Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GL_RECONCILIATION_ENTRY__ACCTG_TRANS_ID = eINSTANCE.getGlReconciliationEntry_AcctgTransId();

		/**
		 * The meta object literal for the '<em><b>Acctg Trans Entry Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_RECONCILIATION_ENTRY__ACCTG_TRANS_ENTRY_SEQ_ID = eINSTANCE.getGlReconciliationEntry_AcctgTransEntrySeqId();

		/**
		 * The meta object literal for the '<em><b>Reconciled Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_RECONCILIATION_ENTRY__RECONCILED_AMOUNT = eINSTANCE.getGlReconciliationEntry_ReconciledAmount();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlResourceTypeImpl <em>Gl Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlResourceTypeImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlResourceType()
		 * @generated
		 */
		EClass GL_RESOURCE_TYPE = eINSTANCE.getGlResourceType();

		/**
		 * The meta object literal for the '<em><b>Gl Resource Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_RESOURCE_TYPE__GL_RESOURCE_TYPE_ID = eINSTANCE.getGlResourceType_GlResourceTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_RESOURCE_TYPE__DESCRIPTION = eINSTANCE.getGlResourceType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.GlXbrlClassImpl <em>Gl Xbrl Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.GlXbrlClassImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getGlXbrlClass()
		 * @generated
		 */
		EClass GL_XBRL_CLASS = eINSTANCE.getGlXbrlClass();

		/**
		 * The meta object literal for the '<em><b>Gl Xbrl Class Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_XBRL_CLASS__GL_XBRL_CLASS_ID = eINSTANCE.getGlXbrlClass_GlXbrlClassId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GL_XBRL_CLASS__DESCRIPTION = eINSTANCE.getGlXbrlClass_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl <em>Party Acctg Preference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.PartyAcctgPreferenceImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getPartyAcctgPreference()
		 * @generated
		 */
		EClass PARTY_ACCTG_PREFERENCE = eINSTANCE.getPartyAcctgPreference();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_ACCTG_PREFERENCE__PARTY_ID = eINSTANCE.getPartyAcctgPreference_PartyId();

		/**
		 * The meta object literal for the '<em><b>Base Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_ACCTG_PREFERENCE__BASE_CURRENCY_UOM_ID = eINSTANCE.getPartyAcctgPreference_BaseCurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Cogs Method Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_ACCTG_PREFERENCE__COGS_METHOD_ID = eINSTANCE.getPartyAcctgPreference_CogsMethodId();

		/**
		 * The meta object literal for the '<em><b>Enable Accounting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_ACCTG_PREFERENCE__ENABLE_ACCOUNTING = eINSTANCE.getPartyAcctgPreference_EnableAccounting();

		/**
		 * The meta object literal for the '<em><b>Error Gl Journal Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_ACCTG_PREFERENCE__ERROR_GL_JOURNAL_ID = eINSTANCE.getPartyAcctgPreference_ErrorGlJournalId();

		/**
		 * The meta object literal for the '<em><b>Fiscal Year Start Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_DAY = eINSTANCE.getPartyAcctgPreference_FiscalYearStartDay();

		/**
		 * The meta object literal for the '<em><b>Fiscal Year Start Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_ACCTG_PREFERENCE__FISCAL_YEAR_START_MONTH = eINSTANCE.getPartyAcctgPreference_FiscalYearStartMonth();

		/**
		 * The meta object literal for the '<em><b>Invoice Id Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_ACCTG_PREFERENCE__INVOICE_ID_PREFIX = eINSTANCE.getPartyAcctgPreference_InvoiceIdPrefix();

		/**
		 * The meta object literal for the '<em><b>Invoice Seq Cust Meth Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_ACCTG_PREFERENCE__INVOICE_SEQ_CUST_METH_ID = eINSTANCE.getPartyAcctgPreference_InvoiceSeqCustMethId();

		/**
		 * The meta object literal for the '<em><b>Last Invoice Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_ACCTG_PREFERENCE__LAST_INVOICE_NUMBER = eINSTANCE.getPartyAcctgPreference_LastInvoiceNumber();

		/**
		 * The meta object literal for the '<em><b>Last Invoice Restart Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_ACCTG_PREFERENCE__LAST_INVOICE_RESTART_DATE = eINSTANCE.getPartyAcctgPreference_LastInvoiceRestartDate();

		/**
		 * The meta object literal for the '<em><b>Last Order Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_ACCTG_PREFERENCE__LAST_ORDER_NUMBER = eINSTANCE.getPartyAcctgPreference_LastOrderNumber();

		/**
		 * The meta object literal for the '<em><b>Last Quote Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_ACCTG_PREFERENCE__LAST_QUOTE_NUMBER = eINSTANCE.getPartyAcctgPreference_LastQuoteNumber();

		/**
		 * The meta object literal for the '<em><b>Old Invoice Sequence Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_ACCTG_PREFERENCE__OLD_INVOICE_SEQUENCE_ENUM_ID = eINSTANCE.getPartyAcctgPreference_OldInvoiceSequenceEnumId();

		/**
		 * The meta object literal for the '<em><b>Old Order Sequence Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_ACCTG_PREFERENCE__OLD_ORDER_SEQUENCE_ENUM_ID = eINSTANCE.getPartyAcctgPreference_OldOrderSequenceEnumId();

		/**
		 * The meta object literal for the '<em><b>Old Quote Sequence Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_ACCTG_PREFERENCE__OLD_QUOTE_SEQUENCE_ENUM_ID = eINSTANCE.getPartyAcctgPreference_OldQuoteSequenceEnumId();

		/**
		 * The meta object literal for the '<em><b>Order Id Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_ACCTG_PREFERENCE__ORDER_ID_PREFIX = eINSTANCE.getPartyAcctgPreference_OrderIdPrefix();

		/**
		 * The meta object literal for the '<em><b>Order Seq Cust Meth Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_ACCTG_PREFERENCE__ORDER_SEQ_CUST_METH_ID = eINSTANCE.getPartyAcctgPreference_OrderSeqCustMethId();

		/**
		 * The meta object literal for the '<em><b>Quote Id Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_ACCTG_PREFERENCE__QUOTE_ID_PREFIX = eINSTANCE.getPartyAcctgPreference_QuoteIdPrefix();

		/**
		 * The meta object literal for the '<em><b>Quote Seq Cust Meth Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_ACCTG_PREFERENCE__QUOTE_SEQ_CUST_METH_ID = eINSTANCE.getPartyAcctgPreference_QuoteSeqCustMethId();

		/**
		 * The meta object literal for the '<em><b>Refund Payment Method Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_ACCTG_PREFERENCE__REFUND_PAYMENT_METHOD_ID = eINSTANCE.getPartyAcctgPreference_RefundPaymentMethodId();

		/**
		 * The meta object literal for the '<em><b>Tax Form Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_ACCTG_PREFERENCE__TAX_FORM_ID = eINSTANCE.getPartyAcctgPreference_TaxFormId();

		/**
		 * The meta object literal for the '<em><b>Use Invoice Id For Returns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_ACCTG_PREFERENCE__USE_INVOICE_ID_FOR_RETURNS = eINSTANCE.getPartyAcctgPreference_UseInvoiceIdForReturns();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyGlAccountImpl <em>Party Gl Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.PartyGlAccountImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getPartyGlAccount()
		 * @generated
		 */
		EClass PARTY_GL_ACCOUNT = eINSTANCE.getPartyGlAccount();

		/**
		 * The meta object literal for the '<em><b>Organization Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_GL_ACCOUNT__ORGANIZATION_PARTY_ID = eINSTANCE.getPartyGlAccount_OrganizationPartyId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_GL_ACCOUNT__PARTY_ID = eINSTANCE.getPartyGlAccount_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_GL_ACCOUNT__ROLE_TYPE_ID = eINSTANCE.getPartyGlAccount_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Gl Account Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_GL_ACCOUNT__GL_ACCOUNT_TYPE_ID = eINSTANCE.getPartyGlAccount_GlAccountTypeId();

		/**
		 * The meta object literal for the '<em><b>Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_GL_ACCOUNT__GL_ACCOUNT_ID = eINSTANCE.getPartyGlAccount_GlAccountId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.PartyPrefDocTypeTplImpl <em>Party Pref Doc Type Tpl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.PartyPrefDocTypeTplImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getPartyPrefDocTypeTpl()
		 * @generated
		 */
		EClass PARTY_PREF_DOC_TYPE_TPL = eINSTANCE.getPartyPrefDocTypeTpl();

		/**
		 * The meta object literal for the '<em><b>Party Pref Doc Type Tpl Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_PREF_DOC_TYPE_TPL__PARTY_PREF_DOC_TYPE_TPL_ID = eINSTANCE.getPartyPrefDocTypeTpl_PartyPrefDocTypeTplId();

		/**
		 * The meta object literal for the '<em><b>Custom Screen Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_PREF_DOC_TYPE_TPL__CUSTOM_SCREEN_ID = eINSTANCE.getPartyPrefDocTypeTpl_CustomScreenId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_PREF_DOC_TYPE_TPL__FROM_DATE = eINSTANCE.getPartyPrefDocTypeTpl_FromDate();

		/**
		 * The meta object literal for the '<em><b>Invoice Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_PREF_DOC_TYPE_TPL__INVOICE_TYPE_ID = eINSTANCE.getPartyPrefDocTypeTpl_InvoiceTypeId();

		/**
		 * The meta object literal for the '<em><b>Order Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_PREF_DOC_TYPE_TPL__ORDER_TYPE_ID = eINSTANCE.getPartyPrefDocTypeTpl_OrderTypeId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_PREF_DOC_TYPE_TPL__PARTY_ID = eINSTANCE.getPartyPrefDocTypeTpl_PartyId();

		/**
		 * The meta object literal for the '<em><b>Quote Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_PREF_DOC_TYPE_TPL__QUOTE_TYPE_ID = eINSTANCE.getPartyPrefDocTypeTpl_QuoteTypeId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_PREF_DOC_TYPE_TPL__THRU_DATE = eINSTANCE.getPartyPrefDocTypeTpl_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.ProductAverageCostImpl <em>Product Average Cost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.ProductAverageCostImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getProductAverageCost()
		 * @generated
		 */
		EClass PRODUCT_AVERAGE_COST = eINSTANCE.getProductAverageCost();

		/**
		 * The meta object literal for the '<em><b>Product Average Cost Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_AVERAGE_COST__PRODUCT_AVERAGE_COST_TYPE_ID = eINSTANCE.getProductAverageCost_ProductAverageCostTypeId();

		/**
		 * The meta object literal for the '<em><b>Organization Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_AVERAGE_COST__ORGANIZATION_PARTY_ID = eINSTANCE.getProductAverageCost_OrganizationPartyId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_AVERAGE_COST__PRODUCT_ID = eINSTANCE.getProductAverageCost_ProductId();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_AVERAGE_COST__FACILITY_ID = eINSTANCE.getProductAverageCost_FacilityId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_AVERAGE_COST__FROM_DATE = eINSTANCE.getProductAverageCost_FromDate();

		/**
		 * The meta object literal for the '<em><b>Average Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_AVERAGE_COST__AVERAGE_COST = eINSTANCE.getProductAverageCost_AverageCost();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_AVERAGE_COST__THRU_DATE = eINSTANCE.getProductAverageCost_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.ProductAverageCostTypeImpl <em>Product Average Cost Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.ProductAverageCostTypeImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getProductAverageCostType()
		 * @generated
		 */
		EClass PRODUCT_AVERAGE_COST_TYPE = eINSTANCE.getProductAverageCostType();

		/**
		 * The meta object literal for the '<em><b>Product Average Cost Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_AVERAGE_COST_TYPE__PRODUCT_AVERAGE_COST_TYPE_ID = eINSTANCE.getProductAverageCostType_ProductAverageCostTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_AVERAGE_COST_TYPE__DESCRIPTION = eINSTANCE.getProductAverageCostType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_AVERAGE_COST_TYPE__HAS_TABLE = eINSTANCE.getProductAverageCostType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_AVERAGE_COST_TYPE__PARENT_TYPE_ID = eINSTANCE.getProductAverageCostType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.SettlementTermImpl <em>Settlement Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.SettlementTermImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getSettlementTerm()
		 * @generated
		 */
		EClass SETTLEMENT_TERM = eINSTANCE.getSettlementTerm();

		/**
		 * The meta object literal for the '<em><b>Settlement Term Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTLEMENT_TERM__SETTLEMENT_TERM_ID = eINSTANCE.getSettlementTerm_SettlementTermId();

		/**
		 * The meta object literal for the '<em><b>Term Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTLEMENT_TERM__TERM_NAME = eINSTANCE.getSettlementTerm_TermName();

		/**
		 * The meta object literal for the '<em><b>Term Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTLEMENT_TERM__TERM_VALUE = eINSTANCE.getSettlementTerm_TermValue();

		/**
		 * The meta object literal for the '<em><b>Uom Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTLEMENT_TERM__UOM_ID = eINSTANCE.getSettlementTerm_UomId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.ledger.impl.VarianceReasonGlAccountImpl <em>Variance Reason Gl Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.VarianceReasonGlAccountImpl
		 * @see org.abchip.mimo.biz.accounting.ledger.impl.LedgerPackageImpl#getVarianceReasonGlAccount()
		 * @generated
		 */
		EClass VARIANCE_REASON_GL_ACCOUNT = eINSTANCE.getVarianceReasonGlAccount();

		/**
		 * The meta object literal for the '<em><b>Variance Reason Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANCE_REASON_GL_ACCOUNT__VARIANCE_REASON_ID = eINSTANCE.getVarianceReasonGlAccount_VarianceReasonId();

		/**
		 * The meta object literal for the '<em><b>Organization Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANCE_REASON_GL_ACCOUNT__ORGANIZATION_PARTY_ID = eINSTANCE.getVarianceReasonGlAccount_OrganizationPartyId();

		/**
		 * The meta object literal for the '<em><b>Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANCE_REASON_GL_ACCOUNT__GL_ACCOUNT_ID = eINSTANCE.getVarianceReasonGlAccount_GlAccountId();

	}

} //LedgerPackage
