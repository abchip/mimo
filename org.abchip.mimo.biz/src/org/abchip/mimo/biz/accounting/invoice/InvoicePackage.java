/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.invoice;

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
 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceFactory
 * @model kind="package"
 * @generated
 */
public interface InvoicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "invoice";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/accounting/invoice";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-invoice";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InvoicePackage eINSTANCE = org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl <em>Invoice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoice()
	 * @generated
	 */
	int INVOICE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Invoice Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__INVOICE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Billing Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__BILLING_ACCOUNT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__DUE_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Invoice Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__INVOICE_ATTRIBUTES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Invoice Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__INVOICE_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Invoice Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__INVOICE_ITEMS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Invoice Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__INVOICE_MESSAGE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Invoice Notes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__INVOICE_NOTES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Invoice Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__INVOICE_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Paid Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__PAID_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__PARTY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Party Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__PARTY_ID_FROM = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Recurrence Info Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__RECURRENCE_INFO_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__REFERENCE_NUMBER = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__STATUS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Invoice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceAttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceAttributeImpl
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceAttribute()
	 * @generated
	 */
	int INVOICE_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ATTRIBUTE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ATTRIBUTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ATTRIBUTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ATTRIBUTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Invoice Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ATTRIBUTE__INVOICE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ATTRIBUTE__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ATTRIBUTE__ATTR_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ATTRIBUTE__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ATTRIBUTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceContactMechImpl <em>Contact Mech</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceContactMechImpl
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceContactMech()
	 * @generated
	 */
	int INVOICE_CONTACT_MECH = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTACT_MECH__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTACT_MECH__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTACT_MECH__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTACT_MECH__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Invoice Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTACT_MECH__INVOICE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTACT_MECH__CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contact Mech Purpose Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Contact Mech</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTACT_MECH_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceContentImpl
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceContent()
	 * @generated
	 */
	int INVOICE_CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Invoice Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT__INVOICE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT__CONTENT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Invoice Content Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT__INVOICE_CONTENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT__FROM_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT__THRU_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceContentTypeImpl <em>Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceContentTypeImpl
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceContentType()
	 * @generated
	 */
	int INVOICE_CONTENT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Invoice Content Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT_TYPE__INVOICE_CONTENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_CONTENT_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItem()
	 * @generated
	 */
	int INVOICE_ITEM = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Invoice Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__INVOICE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invoice Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__INVOICE_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__AMOUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inventory Item Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__INVENTORY_ITEM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Invoice Item Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__INVOICE_ITEM_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Override Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__OVERRIDE_GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Override Org Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__OVERRIDE_ORG_PARTY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent Invoice Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__PARENT_INVOICE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Parent Invoice Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__PARENT_INVOICE_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Product Feature Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__PRODUCT_FEATURE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__PRODUCT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__QUANTITY = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Sales Opportunity Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__SALES_OPPORTUNITY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Tax Auth Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__TAX_AUTH_GEO_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Tax Auth Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__TAX_AUTH_PARTY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Tax Authority Rate Seq Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__TAX_AUTHORITY_RATE_SEQ_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Taxable Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__TAXABLE_FLAG = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM__UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAssocImpl <em>Item Assoc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAssocImpl
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemAssoc()
	 * @generated
	 */
	int INVOICE_ITEM_ASSOC = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Invoice Item Assoc Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__INVOICE_ITEM_ASSOC_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__FROM_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Invoice Id From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__INVOICE_ID_FROM = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Invoice Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__INVOICE_ID_TO = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invoice Item Seq Id From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__INVOICE_ITEM_SEQ_ID_FROM = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Invoice Item Seq Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__INVOICE_ITEM_SEQ_ID_TO = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__AMOUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Party Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__PARTY_ID_FROM = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Party Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__PARTY_ID_TO = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__QUANTITY = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC__THRU_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Item Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAssocTypeImpl <em>Item Assoc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAssocTypeImpl
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemAssocType()
	 * @generated
	 */
	int INVOICE_ITEM_ASSOC_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Invoice Item Assoc Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC_TYPE__INVOICE_ITEM_ASSOC_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Item Assoc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ASSOC_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAttributeImpl <em>Item Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAttributeImpl
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemAttribute()
	 * @generated
	 */
	int INVOICE_ITEM_ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ATTRIBUTE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ATTRIBUTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ATTRIBUTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ATTRIBUTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ATTRIBUTE__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invoice Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ATTRIBUTE__INVOICE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Invoice Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ATTRIBUTE__INVOICE_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ATTRIBUTE__ATTR_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ATTRIBUTE__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Item Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_ATTRIBUTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeImpl <em>Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeImpl
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemType()
	 * @generated
	 */
	int INVOICE_ITEM_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Invoice Item Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE__DEFAULT_GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invoice Item Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_ATTRS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Invoice Item Type Gl Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_GL_ACCOUNTS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeAttrImpl <em>Item Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeAttrImpl
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemTypeAttr()
	 * @generated
	 */
	int INVOICE_ITEM_TYPE_ATTR = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_ATTR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_ATTR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_ATTR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_ATTR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Invoice Item Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_ATTR__INVOICE_ITEM_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_ATTR__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_ATTR__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Item Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_ATTR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeGlAccountImpl <em>Item Type Gl Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeGlAccountImpl
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemTypeGlAccount()
	 * @generated
	 */
	int INVOICE_ITEM_TYPE_GL_ACCOUNT = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_GL_ACCOUNT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_GL_ACCOUNT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_GL_ACCOUNT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_GL_ACCOUNT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Invoice Item Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_GL_ACCOUNT__INVOICE_ITEM_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organization Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_GL_ACCOUNT__GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Item Type Gl Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_GL_ACCOUNT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeMapImpl <em>Item Type Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeMapImpl
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemTypeMap()
	 * @generated
	 */
	int INVOICE_ITEM_TYPE_MAP = 12;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_MAP__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_MAP__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_MAP__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_MAP__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Invoice Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_MAP__INVOICE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invoice Item Map Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_MAP__INVOICE_ITEM_MAP_KEY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Invoice Item Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_MAP__INVOICE_ITEM_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Item Type Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ITEM_TYPE_MAP_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceNoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceNoteImpl
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceNote()
	 * @generated
	 */
	int INVOICE_NOTE = 13;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_NOTE__CREATED_STAMP = BizPackage.BIZ_ENTITY_NOTE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_NOTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_NOTE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_NOTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_NOTE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_NOTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_NOTE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Note Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_NOTE__NOTE_ID = BizPackage.BIZ_ENTITY_NOTE__NOTE_ID;

	/**
	 * The feature id for the '<em><b>Invoice Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_NOTE__INVOICE_ID = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_NOTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceRoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceRoleImpl
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceRole()
	 * @generated
	 */
	int INVOICE_ROLE = 14;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ROLE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ROLE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ROLE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ROLE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Invoice Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ROLE__INVOICE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ROLE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ROLE__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Datetime Performed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ROLE__DATETIME_PERFORMED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ROLE__PERCENTAGE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_ROLE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceStatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceStatusImpl
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceStatus()
	 * @generated
	 */
	int INVOICE_STATUS = 15;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_STATUS__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_STATUS__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_STATUS__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_STATUS__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_STATUS__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invoice Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_STATUS__INVOICE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_STATUS__STATUS_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Change By User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_STATUS__CHANGE_BY_USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_STATUS_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceTermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceTermImpl
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceTerm()
	 * @generated
	 */
	int INVOICE_TERM = 16;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Invoice Term Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__INVOICE_TERM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Invoice Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__INVOICE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Invoice Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__INVOICE_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invoice Term Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__INVOICE_TERM_ATTRIBUTES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Term Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__TERM_DAYS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Term Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__TERM_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Term Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__TERM_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Text Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__TEXT_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM__UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceTermAttributeImpl <em>Term Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceTermAttributeImpl
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceTermAttribute()
	 * @generated
	 */
	int INVOICE_TERM_ATTRIBUTE = 17;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM_ATTRIBUTE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM_ATTRIBUTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM_ATTRIBUTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM_ATTRIBUTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Invoice Term Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM_ATTRIBUTE__INVOICE_TERM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM_ATTRIBUTE__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM_ATTRIBUTE__ATTR_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM_ATTRIBUTE__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Term Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TERM_ATTRIBUTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceTypeImpl
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceType()
	 * @generated
	 */
	int INVOICE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Invoice Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__INVOICE_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Invoice Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__INVOICE_TYPE_ATTRS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceTypeAttrImpl <em>Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceTypeAttrImpl
	 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceTypeAttr()
	 * @generated
	 */
	int INVOICE_TYPE_ATTR = 19;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE_ATTR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE_ATTR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE_ATTR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE_ATTR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Invoice Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE_ATTR__INVOICE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE_ATTR__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE_ATTR__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_TYPE_ATTR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.invoice.Invoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoice</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.Invoice
	 * @generated
	 */
	EClass getInvoice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceId <em>Invoice Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceId()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_InvoiceId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getBillingAccountId <em>Billing Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Billing Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.Invoice#getBillingAccountId()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_BillingAccountId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.Invoice#getContactMechId()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_ContactMechId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getCurrencyUomId <em>Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.Invoice#getCurrencyUomId()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_CurrencyUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.Invoice#getDescription()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.Invoice#getDueDate()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_DueDate();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceAttributes <em>Invoice Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invoice Attributes</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceAttributes()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_InvoiceAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceDate <em>Invoice Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceDate()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_InvoiceDate();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceItems <em>Invoice Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invoice Items</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceItems()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_InvoiceItems();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceMessage <em>Invoice Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Message</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceMessage()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_InvoiceMessage();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceNotes <em>Invoice Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invoice Notes</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceNotes()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_InvoiceNotes();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceTypeId <em>Invoice Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.Invoice#getInvoiceTypeId()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_InvoiceTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getPaidDate <em>Paid Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paid Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.Invoice#getPaidDate()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_PaidDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.Invoice#getPartyId()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getPartyIdFrom <em>Party Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id From</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.Invoice#getPartyIdFrom()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_PartyIdFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getRecurrenceInfoId <em>Recurrence Info Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recurrence Info Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.Invoice#getRecurrenceInfoId()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_RecurrenceInfoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getReferenceNumber <em>Reference Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Number</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.Invoice#getReferenceNumber()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_ReferenceNumber();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.Invoice#getRoleTypeId()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_RoleTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.Invoice#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.Invoice#getStatusId()
	 * @see #getInvoice()
	 * @generated
	 */
	EReference getInvoice_StatusId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceAttribute
	 * @generated
	 */
	EClass getInvoiceAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceAttribute#getInvoiceId <em>Invoice Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceAttribute#getInvoiceId()
	 * @see #getInvoiceAttribute()
	 * @generated
	 */
	EReference getInvoiceAttribute_InvoiceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceAttribute#getAttrName()
	 * @see #getInvoiceAttribute()
	 * @generated
	 */
	EAttribute getInvoiceAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceAttribute#getAttrDescription()
	 * @see #getInvoiceAttribute()
	 * @generated
	 */
	EAttribute getInvoiceAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceAttribute#getAttrValue()
	 * @see #getInvoiceAttribute()
	 * @generated
	 */
	EAttribute getInvoiceAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceContactMech <em>Contact Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Mech</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceContactMech
	 * @generated
	 */
	EClass getInvoiceContactMech();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceContactMech#getInvoiceId <em>Invoice Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceContactMech#getInvoiceId()
	 * @see #getInvoiceContactMech()
	 * @generated
	 */
	EReference getInvoiceContactMech_InvoiceId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceContactMech#getContactMechPurposeTypeId <em>Contact Mech Purpose Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Purpose Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceContactMech#getContactMechPurposeTypeId()
	 * @see #getInvoiceContactMech()
	 * @generated
	 */
	EReference getInvoiceContactMech_ContactMechPurposeTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceContactMech#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceContactMech#getContactMechId()
	 * @see #getInvoiceContactMech()
	 * @generated
	 */
	EReference getInvoiceContactMech_ContactMechId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceContent
	 * @generated
	 */
	EClass getInvoiceContent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceContent#getContentId <em>Content Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceContent#getContentId()
	 * @see #getInvoiceContent()
	 * @generated
	 */
	EReference getInvoiceContent_ContentId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceContent#getInvoiceId <em>Invoice Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceContent#getInvoiceId()
	 * @see #getInvoiceContent()
	 * @generated
	 */
	EReference getInvoiceContent_InvoiceId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceContent#getInvoiceContentTypeId <em>Invoice Content Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Content Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceContent#getInvoiceContentTypeId()
	 * @see #getInvoiceContent()
	 * @generated
	 */
	EReference getInvoiceContent_InvoiceContentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceContent#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceContent#getFromDate()
	 * @see #getInvoiceContent()
	 * @generated
	 */
	EAttribute getInvoiceContent_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceContent#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceContent#getThruDate()
	 * @see #getInvoiceContent()
	 * @generated
	 */
	EAttribute getInvoiceContent_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceContentType
	 * @generated
	 */
	EClass getInvoiceContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceContentType#getInvoiceContentTypeId <em>Invoice Content Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Content Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceContentType#getInvoiceContentTypeId()
	 * @see #getInvoiceContentType()
	 * @generated
	 */
	EAttribute getInvoiceContentType_InvoiceContentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceContentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceContentType#getDescription()
	 * @see #getInvoiceContentType()
	 * @generated
	 */
	EAttribute getInvoiceContentType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceContentType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceContentType#isHasTable()
	 * @see #getInvoiceContentType()
	 * @generated
	 */
	EAttribute getInvoiceContentType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceContentType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceContentType#getParentTypeId()
	 * @see #getInvoiceContentType()
	 * @generated
	 */
	EReference getInvoiceContentType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItem
	 * @generated
	 */
	EClass getInvoiceItem();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getInvoiceId <em>Invoice Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getInvoiceId()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EReference getInvoiceItem_InvoiceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getInvoiceItemSeqId()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EAttribute getInvoiceItem_InvoiceItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getAmount()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EAttribute getInvoiceItem_Amount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getDescription()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EAttribute getInvoiceItem_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getInventoryItemId <em>Inventory Item Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Item Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getInventoryItemId()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EReference getInvoiceItem_InventoryItemId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getInvoiceItemTypeId <em>Invoice Item Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Item Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getInvoiceItemTypeId()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EReference getInvoiceItem_InvoiceItemTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getOverrideGlAccountId <em>Override Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Override Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getOverrideGlAccountId()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EReference getInvoiceItem_OverrideGlAccountId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getOverrideOrgPartyId <em>Override Org Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Override Org Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getOverrideOrgPartyId()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EReference getInvoiceItem_OverrideOrgPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getParentInvoiceId <em>Parent Invoice Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Invoice Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getParentInvoiceId()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EAttribute getInvoiceItem_ParentInvoiceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getParentInvoiceItemSeqId <em>Parent Invoice Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Invoice Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getParentInvoiceItemSeqId()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EAttribute getInvoiceItem_ParentInvoiceItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getProductFeatureId <em>Product Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Feature Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getProductFeatureId()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EReference getInvoiceItem_ProductFeatureId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getProductId()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EReference getInvoiceItem_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getQuantity()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EAttribute getInvoiceItem_Quantity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getSalesOpportunityId <em>Sales Opportunity Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Opportunity Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getSalesOpportunityId()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EReference getInvoiceItem_SalesOpportunityId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tax Auth Geo Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getTaxAuthGeoId()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EReference getInvoiceItem_TaxAuthGeoId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getTaxAuthPartyId <em>Tax Auth Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tax Auth Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getTaxAuthPartyId()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EReference getInvoiceItem_TaxAuthPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getTaxAuthorityRateSeqId <em>Tax Authority Rate Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tax Authority Rate Seq Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getTaxAuthorityRateSeqId()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EReference getInvoiceItem_TaxAuthorityRateSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#isTaxableFlag <em>Taxable Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taxable Flag</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItem#isTaxableFlag()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EAttribute getInvoiceItem_TaxableFlag();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getUomId <em>Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItem#getUomId()
	 * @see #getInvoiceItem()
	 * @generated
	 */
	EReference getInvoiceItem_UomId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc <em>Item Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Assoc</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc
	 * @generated
	 */
	EClass getInvoiceItemAssoc();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getInvoiceIdFrom <em>Invoice Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Id From</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getInvoiceIdFrom()
	 * @see #getInvoiceItemAssoc()
	 * @generated
	 */
	EAttribute getInvoiceItemAssoc_InvoiceIdFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getInvoiceItemSeqIdFrom <em>Invoice Item Seq Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Item Seq Id From</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getInvoiceItemSeqIdFrom()
	 * @see #getInvoiceItemAssoc()
	 * @generated
	 */
	EAttribute getInvoiceItemAssoc_InvoiceItemSeqIdFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getInvoiceIdTo <em>Invoice Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Id To</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getInvoiceIdTo()
	 * @see #getInvoiceItemAssoc()
	 * @generated
	 */
	EAttribute getInvoiceItemAssoc_InvoiceIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getInvoiceItemSeqIdTo <em>Invoice Item Seq Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Item Seq Id To</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getInvoiceItemSeqIdTo()
	 * @see #getInvoiceItemAssoc()
	 * @generated
	 */
	EAttribute getInvoiceItemAssoc_InvoiceItemSeqIdTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getInvoiceItemAssocTypeId <em>Invoice Item Assoc Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Item Assoc Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getInvoiceItemAssocTypeId()
	 * @see #getInvoiceItemAssoc()
	 * @generated
	 */
	EReference getInvoiceItemAssoc_InvoiceItemAssocTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getFromDate()
	 * @see #getInvoiceItemAssoc()
	 * @generated
	 */
	EAttribute getInvoiceItemAssoc_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getAmount()
	 * @see #getInvoiceItemAssoc()
	 * @generated
	 */
	EAttribute getInvoiceItemAssoc_Amount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getPartyIdFrom <em>Party Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id From</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getPartyIdFrom()
	 * @see #getInvoiceItemAssoc()
	 * @generated
	 */
	EReference getInvoiceItemAssoc_PartyIdFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getPartyIdTo <em>Party Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id To</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getPartyIdTo()
	 * @see #getInvoiceItemAssoc()
	 * @generated
	 */
	EReference getInvoiceItemAssoc_PartyIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getQuantity()
	 * @see #getInvoiceItemAssoc()
	 * @generated
	 */
	EAttribute getInvoiceItemAssoc_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssoc#getThruDate()
	 * @see #getInvoiceItemAssoc()
	 * @generated
	 */
	EAttribute getInvoiceItemAssoc_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssocType <em>Item Assoc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Assoc Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssocType
	 * @generated
	 */
	EClass getInvoiceItemAssocType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssocType#getInvoiceItemAssocTypeId <em>Invoice Item Assoc Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Item Assoc Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssocType#getInvoiceItemAssocTypeId()
	 * @see #getInvoiceItemAssocType()
	 * @generated
	 */
	EAttribute getInvoiceItemAssocType_InvoiceItemAssocTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssocType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssocType#getDescription()
	 * @see #getInvoiceItemAssocType()
	 * @generated
	 */
	EAttribute getInvoiceItemAssocType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssocType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssocType#isHasTable()
	 * @see #getInvoiceItemAssocType()
	 * @generated
	 */
	EAttribute getInvoiceItemAssocType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssocType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemAssocType#getParentTypeId()
	 * @see #getInvoiceItemAssocType()
	 * @generated
	 */
	EReference getInvoiceItemAssocType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAttribute <em>Item Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Attribute</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemAttribute
	 * @generated
	 */
	EClass getInvoiceItemAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAttribute#getInvoiceId <em>Invoice Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemAttribute#getInvoiceId()
	 * @see #getInvoiceItemAttribute()
	 * @generated
	 */
	EAttribute getInvoiceItemAttribute_InvoiceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAttribute#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemAttribute#getInvoiceItemSeqId()
	 * @see #getInvoiceItemAttribute()
	 * @generated
	 */
	EAttribute getInvoiceItemAttribute_InvoiceItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemAttribute#getAttrName()
	 * @see #getInvoiceItemAttribute()
	 * @generated
	 */
	EAttribute getInvoiceItemAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemAttribute#getAttrDescription()
	 * @see #getInvoiceItemAttribute()
	 * @generated
	 */
	EAttribute getInvoiceItemAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemAttribute#getAttrValue()
	 * @see #getInvoiceItemAttribute()
	 * @generated
	 */
	EAttribute getInvoiceItemAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemType
	 * @generated
	 */
	EClass getInvoiceItemType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#getInvoiceItemTypeId <em>Invoice Item Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Item Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#getInvoiceItemTypeId()
	 * @see #getInvoiceItemType()
	 * @generated
	 */
	EAttribute getInvoiceItemType_InvoiceItemTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#getDefaultGlAccountId <em>Default Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#getDefaultGlAccountId()
	 * @see #getInvoiceItemType()
	 * @generated
	 */
	EReference getInvoiceItemType_DefaultGlAccountId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#getDescription()
	 * @see #getInvoiceItemType()
	 * @generated
	 */
	EAttribute getInvoiceItemType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#isHasTable()
	 * @see #getInvoiceItemType()
	 * @generated
	 */
	EAttribute getInvoiceItemType_HasTable();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#getInvoiceItemTypeAttrs <em>Invoice Item Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invoice Item Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#getInvoiceItemTypeAttrs()
	 * @see #getInvoiceItemType()
	 * @generated
	 */
	EReference getInvoiceItemType_InvoiceItemTypeAttrs();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#getInvoiceItemTypeGlAccounts <em>Invoice Item Type Gl Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invoice Item Type Gl Accounts</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#getInvoiceItemTypeGlAccounts()
	 * @see #getInvoiceItemType()
	 * @generated
	 */
	EReference getInvoiceItemType_InvoiceItemTypeGlAccounts();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemType#getParentTypeId()
	 * @see #getInvoiceItemType()
	 * @generated
	 */
	EReference getInvoiceItemType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeAttr <em>Item Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type Attr</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeAttr
	 * @generated
	 */
	EClass getInvoiceItemTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeAttr#getInvoiceItemTypeId <em>Invoice Item Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Item Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeAttr#getInvoiceItemTypeId()
	 * @see #getInvoiceItemTypeAttr()
	 * @generated
	 */
	EReference getInvoiceItemTypeAttr_InvoiceItemTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeAttr#getAttrName()
	 * @see #getInvoiceItemTypeAttr()
	 * @generated
	 */
	EAttribute getInvoiceItemTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeAttr#getDescription()
	 * @see #getInvoiceItemTypeAttr()
	 * @generated
	 */
	EAttribute getInvoiceItemTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeGlAccount <em>Item Type Gl Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type Gl Account</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeGlAccount
	 * @generated
	 */
	EClass getInvoiceItemTypeGlAccount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeGlAccount#getInvoiceItemTypeId <em>Invoice Item Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Item Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeGlAccount#getInvoiceItemTypeId()
	 * @see #getInvoiceItemTypeGlAccount()
	 * @generated
	 */
	EReference getInvoiceItemTypeGlAccount_InvoiceItemTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeGlAccount#getOrganizationPartyId <em>Organization Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeGlAccount#getOrganizationPartyId()
	 * @see #getInvoiceItemTypeGlAccount()
	 * @generated
	 */
	EReference getInvoiceItemTypeGlAccount_OrganizationPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeGlAccount#getGlAccountId <em>Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeGlAccount#getGlAccountId()
	 * @see #getInvoiceItemTypeGlAccount()
	 * @generated
	 */
	EReference getInvoiceItemTypeGlAccount_GlAccountId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeMap <em>Item Type Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type Map</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeMap
	 * @generated
	 */
	EClass getInvoiceItemTypeMap();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeMap#getInvoiceItemMapKey <em>Invoice Item Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Item Map Key</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeMap#getInvoiceItemMapKey()
	 * @see #getInvoiceItemTypeMap()
	 * @generated
	 */
	EAttribute getInvoiceItemTypeMap_InvoiceItemMapKey();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeMap#getInvoiceTypeId <em>Invoice Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeMap#getInvoiceTypeId()
	 * @see #getInvoiceItemTypeMap()
	 * @generated
	 */
	EReference getInvoiceItemTypeMap_InvoiceTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeMap#getInvoiceItemTypeId <em>Invoice Item Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Item Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceItemTypeMap#getInvoiceItemTypeId()
	 * @see #getInvoiceItemTypeMap()
	 * @generated
	 */
	EReference getInvoiceItemTypeMap_InvoiceItemTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceNote
	 * @generated
	 */
	EClass getInvoiceNote();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceNote#getInvoiceId <em>Invoice Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceNote#getInvoiceId()
	 * @see #getInvoiceNote()
	 * @generated
	 */
	EReference getInvoiceNote_InvoiceId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceRole
	 * @generated
	 */
	EClass getInvoiceRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceRole#getInvoiceId <em>Invoice Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceRole#getInvoiceId()
	 * @see #getInvoiceRole()
	 * @generated
	 */
	EReference getInvoiceRole_InvoiceId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceRole#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceRole#getPartyId()
	 * @see #getInvoiceRole()
	 * @generated
	 */
	EReference getInvoiceRole_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceRole#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceRole#getRoleTypeId()
	 * @see #getInvoiceRole()
	 * @generated
	 */
	EReference getInvoiceRole_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceRole#getDatetimePerformed <em>Datetime Performed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datetime Performed</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceRole#getDatetimePerformed()
	 * @see #getInvoiceRole()
	 * @generated
	 */
	EAttribute getInvoiceRole_DatetimePerformed();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceRole#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceRole#getPercentage()
	 * @see #getInvoiceRole()
	 * @generated
	 */
	EAttribute getInvoiceRole_Percentage();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceStatus
	 * @generated
	 */
	EClass getInvoiceStatus();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceStatus#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceStatus#getStatusId()
	 * @see #getInvoiceStatus()
	 * @generated
	 */
	EReference getInvoiceStatus_StatusId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceStatus#getInvoiceId <em>Invoice Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceStatus#getInvoiceId()
	 * @see #getInvoiceStatus()
	 * @generated
	 */
	EReference getInvoiceStatus_InvoiceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceStatus#getStatusDate <em>Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceStatus#getStatusDate()
	 * @see #getInvoiceStatus()
	 * @generated
	 */
	EAttribute getInvoiceStatus_StatusDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceStatus#getChangeByUserLoginId <em>Change By User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change By User Login Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceStatus#getChangeByUserLoginId()
	 * @see #getInvoiceStatus()
	 * @generated
	 */
	EReference getInvoiceStatus_ChangeByUserLoginId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceTerm
	 * @generated
	 */
	EClass getInvoiceTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTerm#getInvoiceTermId <em>Invoice Term Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Term Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceTerm#getInvoiceTermId()
	 * @see #getInvoiceTerm()
	 * @generated
	 */
	EAttribute getInvoiceTerm_InvoiceTermId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTerm#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceTerm#getDescription()
	 * @see #getInvoiceTerm()
	 * @generated
	 */
	EAttribute getInvoiceTerm_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTerm#getInvoiceId <em>Invoice Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceTerm#getInvoiceId()
	 * @see #getInvoiceTerm()
	 * @generated
	 */
	EReference getInvoiceTerm_InvoiceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTerm#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceTerm#getInvoiceItemSeqId()
	 * @see #getInvoiceTerm()
	 * @generated
	 */
	EAttribute getInvoiceTerm_InvoiceItemSeqId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTerm#getInvoiceTermAttributes <em>Invoice Term Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invoice Term Attributes</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceTerm#getInvoiceTermAttributes()
	 * @see #getInvoiceTerm()
	 * @generated
	 */
	EReference getInvoiceTerm_InvoiceTermAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTerm#getTermDays <em>Term Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Days</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceTerm#getTermDays()
	 * @see #getInvoiceTerm()
	 * @generated
	 */
	EAttribute getInvoiceTerm_TermDays();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTerm#getTermTypeId <em>Term Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Term Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceTerm#getTermTypeId()
	 * @see #getInvoiceTerm()
	 * @generated
	 */
	EReference getInvoiceTerm_TermTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTerm#getTermValue <em>Term Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Value</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceTerm#getTermValue()
	 * @see #getInvoiceTerm()
	 * @generated
	 */
	EAttribute getInvoiceTerm_TermValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTerm#getTextValue <em>Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Value</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceTerm#getTextValue()
	 * @see #getInvoiceTerm()
	 * @generated
	 */
	EAttribute getInvoiceTerm_TextValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTerm#getUomId <em>Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uom Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceTerm#getUomId()
	 * @see #getInvoiceTerm()
	 * @generated
	 */
	EAttribute getInvoiceTerm_UomId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTermAttribute <em>Term Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Attribute</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceTermAttribute
	 * @generated
	 */
	EClass getInvoiceTermAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTermAttribute#getInvoiceTermId <em>Invoice Term Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Term Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceTermAttribute#getInvoiceTermId()
	 * @see #getInvoiceTermAttribute()
	 * @generated
	 */
	EReference getInvoiceTermAttribute_InvoiceTermId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTermAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceTermAttribute#getAttrName()
	 * @see #getInvoiceTermAttribute()
	 * @generated
	 */
	EAttribute getInvoiceTermAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTermAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceTermAttribute#getAttrDescription()
	 * @see #getInvoiceTermAttribute()
	 * @generated
	 */
	EAttribute getInvoiceTermAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTermAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceTermAttribute#getAttrValue()
	 * @see #getInvoiceTermAttribute()
	 * @generated
	 */
	EAttribute getInvoiceTermAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceType
	 * @generated
	 */
	EClass getInvoiceType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceType#getInvoiceTypeId <em>Invoice Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceType#getInvoiceTypeId()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_InvoiceTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceType#getDescription()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceType#isHasTable()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EAttribute getInvoiceType_HasTable();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceType#getInvoiceTypeAttrs <em>Invoice Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Invoice Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceType#getInvoiceTypeAttrs()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EReference getInvoiceType_InvoiceTypeAttrs();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceType#getParentTypeId()
	 * @see #getInvoiceType()
	 * @generated
	 */
	EReference getInvoiceType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTypeAttr <em>Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Attr</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceTypeAttr
	 * @generated
	 */
	EClass getInvoiceTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTypeAttr#getInvoiceTypeId <em>Invoice Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceTypeAttr#getInvoiceTypeId()
	 * @see #getInvoiceTypeAttr()
	 * @generated
	 */
	EReference getInvoiceTypeAttr_InvoiceTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceTypeAttr#getAttrName()
	 * @see #getInvoiceTypeAttr()
	 * @generated
	 */
	EAttribute getInvoiceTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.invoice.InvoiceTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.invoice.InvoiceTypeAttr#getDescription()
	 * @see #getInvoiceTypeAttr()
	 * @generated
	 */
	EAttribute getInvoiceTypeAttr_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InvoiceFactory getInvoiceFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl <em>Invoice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceImpl
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoice()
		 * @generated
		 */
		EClass INVOICE = eINSTANCE.getInvoice();

		/**
		 * The meta object literal for the '<em><b>Invoice Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__INVOICE_ID = eINSTANCE.getInvoice_InvoiceId();

		/**
		 * The meta object literal for the '<em><b>Billing Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__BILLING_ACCOUNT_ID = eINSTANCE.getInvoice_BillingAccountId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__CONTACT_MECH_ID = eINSTANCE.getInvoice_ContactMechId();

		/**
		 * The meta object literal for the '<em><b>Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__CURRENCY_UOM_ID = eINSTANCE.getInvoice_CurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__DESCRIPTION = eINSTANCE.getInvoice_Description();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__DUE_DATE = eINSTANCE.getInvoice_DueDate();

		/**
		 * The meta object literal for the '<em><b>Invoice Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__INVOICE_ATTRIBUTES = eINSTANCE.getInvoice_InvoiceAttributes();

		/**
		 * The meta object literal for the '<em><b>Invoice Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__INVOICE_DATE = eINSTANCE.getInvoice_InvoiceDate();

		/**
		 * The meta object literal for the '<em><b>Invoice Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__INVOICE_ITEMS = eINSTANCE.getInvoice_InvoiceItems();

		/**
		 * The meta object literal for the '<em><b>Invoice Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__INVOICE_MESSAGE = eINSTANCE.getInvoice_InvoiceMessage();

		/**
		 * The meta object literal for the '<em><b>Invoice Notes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__INVOICE_NOTES = eINSTANCE.getInvoice_InvoiceNotes();

		/**
		 * The meta object literal for the '<em><b>Invoice Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__INVOICE_TYPE_ID = eINSTANCE.getInvoice_InvoiceTypeId();

		/**
		 * The meta object literal for the '<em><b>Paid Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__PAID_DATE = eINSTANCE.getInvoice_PaidDate();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__PARTY_ID = eINSTANCE.getInvoice_PartyId();

		/**
		 * The meta object literal for the '<em><b>Party Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__PARTY_ID_FROM = eINSTANCE.getInvoice_PartyIdFrom();

		/**
		 * The meta object literal for the '<em><b>Recurrence Info Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__RECURRENCE_INFO_ID = eINSTANCE.getInvoice_RecurrenceInfoId();

		/**
		 * The meta object literal for the '<em><b>Reference Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__REFERENCE_NUMBER = eINSTANCE.getInvoice_ReferenceNumber();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__ROLE_TYPE_ID = eINSTANCE.getInvoice_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE__STATUS_ID = eINSTANCE.getInvoice_StatusId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceAttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceAttributeImpl
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceAttribute()
		 * @generated
		 */
		EClass INVOICE_ATTRIBUTE = eINSTANCE.getInvoiceAttribute();

		/**
		 * The meta object literal for the '<em><b>Invoice Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ATTRIBUTE__INVOICE_ID = eINSTANCE.getInvoiceAttribute_InvoiceId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ATTRIBUTE__ATTR_NAME = eINSTANCE.getInvoiceAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getInvoiceAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getInvoiceAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceContactMechImpl <em>Contact Mech</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceContactMechImpl
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceContactMech()
		 * @generated
		 */
		EClass INVOICE_CONTACT_MECH = eINSTANCE.getInvoiceContactMech();

		/**
		 * The meta object literal for the '<em><b>Invoice Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_CONTACT_MECH__INVOICE_ID = eINSTANCE.getInvoiceContactMech_InvoiceId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Purpose Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE_ID = eINSTANCE.getInvoiceContactMech_ContactMechPurposeTypeId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_CONTACT_MECH__CONTACT_MECH_ID = eINSTANCE.getInvoiceContactMech_ContactMechId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceContentImpl
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceContent()
		 * @generated
		 */
		EClass INVOICE_CONTENT = eINSTANCE.getInvoiceContent();

		/**
		 * The meta object literal for the '<em><b>Content Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_CONTENT__CONTENT_ID = eINSTANCE.getInvoiceContent_ContentId();

		/**
		 * The meta object literal for the '<em><b>Invoice Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_CONTENT__INVOICE_ID = eINSTANCE.getInvoiceContent_InvoiceId();

		/**
		 * The meta object literal for the '<em><b>Invoice Content Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_CONTENT__INVOICE_CONTENT_TYPE_ID = eINSTANCE.getInvoiceContent_InvoiceContentTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_CONTENT__FROM_DATE = eINSTANCE.getInvoiceContent_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_CONTENT__THRU_DATE = eINSTANCE.getInvoiceContent_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceContentTypeImpl <em>Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceContentTypeImpl
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceContentType()
		 * @generated
		 */
		EClass INVOICE_CONTENT_TYPE = eINSTANCE.getInvoiceContentType();

		/**
		 * The meta object literal for the '<em><b>Invoice Content Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_CONTENT_TYPE__INVOICE_CONTENT_TYPE_ID = eINSTANCE.getInvoiceContentType_InvoiceContentTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_CONTENT_TYPE__DESCRIPTION = eINSTANCE.getInvoiceContentType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_CONTENT_TYPE__HAS_TABLE = eINSTANCE.getInvoiceContentType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_CONTENT_TYPE__PARENT_TYPE_ID = eINSTANCE.getInvoiceContentType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemImpl
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItem()
		 * @generated
		 */
		EClass INVOICE_ITEM = eINSTANCE.getInvoiceItem();

		/**
		 * The meta object literal for the '<em><b>Invoice Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM__INVOICE_ID = eINSTANCE.getInvoiceItem_InvoiceId();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM__INVOICE_ITEM_SEQ_ID = eINSTANCE.getInvoiceItem_InvoiceItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM__AMOUNT = eINSTANCE.getInvoiceItem_Amount();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM__DESCRIPTION = eINSTANCE.getInvoiceItem_Description();

		/**
		 * The meta object literal for the '<em><b>Inventory Item Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM__INVENTORY_ITEM_ID = eINSTANCE.getInvoiceItem_InventoryItemId();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM__INVOICE_ITEM_TYPE_ID = eINSTANCE.getInvoiceItem_InvoiceItemTypeId();

		/**
		 * The meta object literal for the '<em><b>Override Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM__OVERRIDE_GL_ACCOUNT_ID = eINSTANCE.getInvoiceItem_OverrideGlAccountId();

		/**
		 * The meta object literal for the '<em><b>Override Org Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM__OVERRIDE_ORG_PARTY_ID = eINSTANCE.getInvoiceItem_OverrideOrgPartyId();

		/**
		 * The meta object literal for the '<em><b>Parent Invoice Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM__PARENT_INVOICE_ID = eINSTANCE.getInvoiceItem_ParentInvoiceId();

		/**
		 * The meta object literal for the '<em><b>Parent Invoice Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM__PARENT_INVOICE_ITEM_SEQ_ID = eINSTANCE.getInvoiceItem_ParentInvoiceItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Product Feature Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM__PRODUCT_FEATURE_ID = eINSTANCE.getInvoiceItem_ProductFeatureId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM__PRODUCT_ID = eINSTANCE.getInvoiceItem_ProductId();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM__QUANTITY = eINSTANCE.getInvoiceItem_Quantity();

		/**
		 * The meta object literal for the '<em><b>Sales Opportunity Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM__SALES_OPPORTUNITY_ID = eINSTANCE.getInvoiceItem_SalesOpportunityId();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Geo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM__TAX_AUTH_GEO_ID = eINSTANCE.getInvoiceItem_TaxAuthGeoId();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM__TAX_AUTH_PARTY_ID = eINSTANCE.getInvoiceItem_TaxAuthPartyId();

		/**
		 * The meta object literal for the '<em><b>Tax Authority Rate Seq Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM__TAX_AUTHORITY_RATE_SEQ_ID = eINSTANCE.getInvoiceItem_TaxAuthorityRateSeqId();

		/**
		 * The meta object literal for the '<em><b>Taxable Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM__TAXABLE_FLAG = eINSTANCE.getInvoiceItem_TaxableFlag();

		/**
		 * The meta object literal for the '<em><b>Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM__UOM_ID = eINSTANCE.getInvoiceItem_UomId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAssocImpl <em>Item Assoc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAssocImpl
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemAssoc()
		 * @generated
		 */
		EClass INVOICE_ITEM_ASSOC = eINSTANCE.getInvoiceItemAssoc();

		/**
		 * The meta object literal for the '<em><b>Invoice Id From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ASSOC__INVOICE_ID_FROM = eINSTANCE.getInvoiceItemAssoc_InvoiceIdFrom();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Seq Id From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ASSOC__INVOICE_ITEM_SEQ_ID_FROM = eINSTANCE.getInvoiceItemAssoc_InvoiceItemSeqIdFrom();

		/**
		 * The meta object literal for the '<em><b>Invoice Id To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ASSOC__INVOICE_ID_TO = eINSTANCE.getInvoiceItemAssoc_InvoiceIdTo();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Seq Id To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ASSOC__INVOICE_ITEM_SEQ_ID_TO = eINSTANCE.getInvoiceItemAssoc_InvoiceItemSeqIdTo();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Assoc Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_ASSOC__INVOICE_ITEM_ASSOC_TYPE_ID = eINSTANCE.getInvoiceItemAssoc_InvoiceItemAssocTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ASSOC__FROM_DATE = eINSTANCE.getInvoiceItemAssoc_FromDate();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ASSOC__AMOUNT = eINSTANCE.getInvoiceItemAssoc_Amount();

		/**
		 * The meta object literal for the '<em><b>Party Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_ASSOC__PARTY_ID_FROM = eINSTANCE.getInvoiceItemAssoc_PartyIdFrom();

		/**
		 * The meta object literal for the '<em><b>Party Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_ASSOC__PARTY_ID_TO = eINSTANCE.getInvoiceItemAssoc_PartyIdTo();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ASSOC__QUANTITY = eINSTANCE.getInvoiceItemAssoc_Quantity();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ASSOC__THRU_DATE = eINSTANCE.getInvoiceItemAssoc_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAssocTypeImpl <em>Item Assoc Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAssocTypeImpl
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemAssocType()
		 * @generated
		 */
		EClass INVOICE_ITEM_ASSOC_TYPE = eINSTANCE.getInvoiceItemAssocType();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Assoc Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ASSOC_TYPE__INVOICE_ITEM_ASSOC_TYPE_ID = eINSTANCE.getInvoiceItemAssocType_InvoiceItemAssocTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ASSOC_TYPE__DESCRIPTION = eINSTANCE.getInvoiceItemAssocType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ASSOC_TYPE__HAS_TABLE = eINSTANCE.getInvoiceItemAssocType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_ASSOC_TYPE__PARENT_TYPE_ID = eINSTANCE.getInvoiceItemAssocType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAttributeImpl <em>Item Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemAttributeImpl
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemAttribute()
		 * @generated
		 */
		EClass INVOICE_ITEM_ATTRIBUTE = eINSTANCE.getInvoiceItemAttribute();

		/**
		 * The meta object literal for the '<em><b>Invoice Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ATTRIBUTE__INVOICE_ID = eINSTANCE.getInvoiceItemAttribute_InvoiceId();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ATTRIBUTE__INVOICE_ITEM_SEQ_ID = eINSTANCE.getInvoiceItemAttribute_InvoiceItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ATTRIBUTE__ATTR_NAME = eINSTANCE.getInvoiceItemAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getInvoiceItemAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getInvoiceItemAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeImpl <em>Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeImpl
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemType()
		 * @generated
		 */
		EClass INVOICE_ITEM_TYPE = eINSTANCE.getInvoiceItemType();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_ID = eINSTANCE.getInvoiceItemType_InvoiceItemTypeId();

		/**
		 * The meta object literal for the '<em><b>Default Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_TYPE__DEFAULT_GL_ACCOUNT_ID = eINSTANCE.getInvoiceItemType_DefaultGlAccountId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_TYPE__DESCRIPTION = eINSTANCE.getInvoiceItemType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_TYPE__HAS_TABLE = eINSTANCE.getInvoiceItemType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_ATTRS = eINSTANCE.getInvoiceItemType_InvoiceItemTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Type Gl Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_TYPE__INVOICE_ITEM_TYPE_GL_ACCOUNTS = eINSTANCE.getInvoiceItemType_InvoiceItemTypeGlAccounts();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_TYPE__PARENT_TYPE_ID = eINSTANCE.getInvoiceItemType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeAttrImpl <em>Item Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeAttrImpl
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemTypeAttr()
		 * @generated
		 */
		EClass INVOICE_ITEM_TYPE_ATTR = eINSTANCE.getInvoiceItemTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_TYPE_ATTR__INVOICE_ITEM_TYPE_ID = eINSTANCE.getInvoiceItemTypeAttr_InvoiceItemTypeId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_TYPE_ATTR__ATTR_NAME = eINSTANCE.getInvoiceItemTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_TYPE_ATTR__DESCRIPTION = eINSTANCE.getInvoiceItemTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeGlAccountImpl <em>Item Type Gl Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeGlAccountImpl
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemTypeGlAccount()
		 * @generated
		 */
		EClass INVOICE_ITEM_TYPE_GL_ACCOUNT = eINSTANCE.getInvoiceItemTypeGlAccount();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_TYPE_GL_ACCOUNT__INVOICE_ITEM_TYPE_ID = eINSTANCE.getInvoiceItemTypeGlAccount_InvoiceItemTypeId();

		/**
		 * The meta object literal for the '<em><b>Organization Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID = eINSTANCE.getInvoiceItemTypeGlAccount_OrganizationPartyId();

		/**
		 * The meta object literal for the '<em><b>Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_TYPE_GL_ACCOUNT__GL_ACCOUNT_ID = eINSTANCE.getInvoiceItemTypeGlAccount_GlAccountId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeMapImpl <em>Item Type Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceItemTypeMapImpl
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceItemTypeMap()
		 * @generated
		 */
		EClass INVOICE_ITEM_TYPE_MAP = eINSTANCE.getInvoiceItemTypeMap();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Map Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ITEM_TYPE_MAP__INVOICE_ITEM_MAP_KEY = eINSTANCE.getInvoiceItemTypeMap_InvoiceItemMapKey();

		/**
		 * The meta object literal for the '<em><b>Invoice Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_TYPE_MAP__INVOICE_TYPE_ID = eINSTANCE.getInvoiceItemTypeMap_InvoiceTypeId();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ITEM_TYPE_MAP__INVOICE_ITEM_TYPE_ID = eINSTANCE.getInvoiceItemTypeMap_InvoiceItemTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceNoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceNoteImpl
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceNote()
		 * @generated
		 */
		EClass INVOICE_NOTE = eINSTANCE.getInvoiceNote();

		/**
		 * The meta object literal for the '<em><b>Invoice Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_NOTE__INVOICE_ID = eINSTANCE.getInvoiceNote_InvoiceId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceRoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceRoleImpl
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceRole()
		 * @generated
		 */
		EClass INVOICE_ROLE = eINSTANCE.getInvoiceRole();

		/**
		 * The meta object literal for the '<em><b>Invoice Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ROLE__INVOICE_ID = eINSTANCE.getInvoiceRole_InvoiceId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ROLE__PARTY_ID = eINSTANCE.getInvoiceRole_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_ROLE__ROLE_TYPE_ID = eINSTANCE.getInvoiceRole_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Datetime Performed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ROLE__DATETIME_PERFORMED = eINSTANCE.getInvoiceRole_DatetimePerformed();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_ROLE__PERCENTAGE = eINSTANCE.getInvoiceRole_Percentage();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceStatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceStatusImpl
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceStatus()
		 * @generated
		 */
		EClass INVOICE_STATUS = eINSTANCE.getInvoiceStatus();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_STATUS__STATUS_ID = eINSTANCE.getInvoiceStatus_StatusId();

		/**
		 * The meta object literal for the '<em><b>Invoice Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_STATUS__INVOICE_ID = eINSTANCE.getInvoiceStatus_InvoiceId();

		/**
		 * The meta object literal for the '<em><b>Status Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_STATUS__STATUS_DATE = eINSTANCE.getInvoiceStatus_StatusDate();

		/**
		 * The meta object literal for the '<em><b>Change By User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_STATUS__CHANGE_BY_USER_LOGIN_ID = eINSTANCE.getInvoiceStatus_ChangeByUserLoginId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceTermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceTermImpl
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceTerm()
		 * @generated
		 */
		EClass INVOICE_TERM = eINSTANCE.getInvoiceTerm();

		/**
		 * The meta object literal for the '<em><b>Invoice Term Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TERM__INVOICE_TERM_ID = eINSTANCE.getInvoiceTerm_InvoiceTermId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TERM__DESCRIPTION = eINSTANCE.getInvoiceTerm_Description();

		/**
		 * The meta object literal for the '<em><b>Invoice Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_TERM__INVOICE_ID = eINSTANCE.getInvoiceTerm_InvoiceId();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TERM__INVOICE_ITEM_SEQ_ID = eINSTANCE.getInvoiceTerm_InvoiceItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Invoice Term Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_TERM__INVOICE_TERM_ATTRIBUTES = eINSTANCE.getInvoiceTerm_InvoiceTermAttributes();

		/**
		 * The meta object literal for the '<em><b>Term Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TERM__TERM_DAYS = eINSTANCE.getInvoiceTerm_TermDays();

		/**
		 * The meta object literal for the '<em><b>Term Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_TERM__TERM_TYPE_ID = eINSTANCE.getInvoiceTerm_TermTypeId();

		/**
		 * The meta object literal for the '<em><b>Term Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TERM__TERM_VALUE = eINSTANCE.getInvoiceTerm_TermValue();

		/**
		 * The meta object literal for the '<em><b>Text Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TERM__TEXT_VALUE = eINSTANCE.getInvoiceTerm_TextValue();

		/**
		 * The meta object literal for the '<em><b>Uom Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TERM__UOM_ID = eINSTANCE.getInvoiceTerm_UomId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceTermAttributeImpl <em>Term Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceTermAttributeImpl
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceTermAttribute()
		 * @generated
		 */
		EClass INVOICE_TERM_ATTRIBUTE = eINSTANCE.getInvoiceTermAttribute();

		/**
		 * The meta object literal for the '<em><b>Invoice Term Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_TERM_ATTRIBUTE__INVOICE_TERM_ID = eINSTANCE.getInvoiceTermAttribute_InvoiceTermId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TERM_ATTRIBUTE__ATTR_NAME = eINSTANCE.getInvoiceTermAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TERM_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getInvoiceTermAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TERM_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getInvoiceTermAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceTypeImpl
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceType()
		 * @generated
		 */
		EClass INVOICE_TYPE = eINSTANCE.getInvoiceType();

		/**
		 * The meta object literal for the '<em><b>Invoice Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TYPE__INVOICE_TYPE_ID = eINSTANCE.getInvoiceType_InvoiceTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TYPE__DESCRIPTION = eINSTANCE.getInvoiceType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TYPE__HAS_TABLE = eINSTANCE.getInvoiceType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Invoice Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_TYPE__INVOICE_TYPE_ATTRS = eINSTANCE.getInvoiceType_InvoiceTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_TYPE__PARENT_TYPE_ID = eINSTANCE.getInvoiceType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.invoice.impl.InvoiceTypeAttrImpl <em>Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoiceTypeAttrImpl
		 * @see org.abchip.mimo.biz.accounting.invoice.impl.InvoicePackageImpl#getInvoiceTypeAttr()
		 * @generated
		 */
		EClass INVOICE_TYPE_ATTR = eINSTANCE.getInvoiceTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Invoice Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_TYPE_ATTR__INVOICE_TYPE_ID = eINSTANCE.getInvoiceTypeAttr_InvoiceTypeId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TYPE_ATTR__ATTR_NAME = eINSTANCE.getInvoiceTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_TYPE_ATTR__DESCRIPTION = eINSTANCE.getInvoiceTypeAttr_Description();

	}

} //InvoicePackage
