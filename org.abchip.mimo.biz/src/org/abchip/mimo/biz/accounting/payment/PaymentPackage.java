/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment;

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
 * @see org.abchip.mimo.biz.accounting.payment.PaymentFactory
 * @model kind="package"
 * @generated
 */
public interface PaymentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "payment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/accounting/payment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-payment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PaymentPackage eINSTANCE = org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountImpl <em>Billing Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.BillingAccountImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getBillingAccount()
	 * @generated
	 */
	int BILLING_ACCOUNT = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Billing Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT__BILLING_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Account Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT__ACCOUNT_CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Account Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT__ACCOUNT_LIMIT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT__CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>External Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT__EXTERNAL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Billing Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountRoleImpl <em>Billing Account Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.BillingAccountRoleImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getBillingAccountRole()
	 * @generated
	 */
	int BILLING_ACCOUNT_ROLE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_ROLE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_ROLE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_ROLE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_ROLE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Billing Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_ROLE__BILLING_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_ROLE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_ROLE__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_ROLE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_ROLE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Billing Account Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_ROLE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountTermImpl <em>Billing Account Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.BillingAccountTermImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getBillingAccountTerm()
	 * @generated
	 */
	int BILLING_ACCOUNT_TERM = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_TERM__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_TERM__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_TERM__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_TERM__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Billing Account Term Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_TERM__BILLING_ACCOUNT_TERM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Billing Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_TERM__BILLING_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Billing Account Term Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_TERM__BILLING_ACCOUNT_TERM_ATTRS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Term Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_TERM__TERM_DAYS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Term Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_TERM__TERM_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Term Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_TERM__TERM_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_TERM__UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Billing Account Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_TERM_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountTermAttrImpl <em>Billing Account Term Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.BillingAccountTermAttrImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getBillingAccountTermAttr()
	 * @generated
	 */
	int BILLING_ACCOUNT_TERM_ATTR = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_TERM_ATTR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_TERM_ATTR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_TERM_ATTR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_TERM_ATTR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Billing Account Term Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_TERM_ATTR__BILLING_ACCOUNT_TERM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_TERM_ATTR__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_TERM_ATTR__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Billing Account Term Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_ACCOUNT_TERM_ATTR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.CheckAccountImpl <em>Check Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.CheckAccountImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getCheckAccount()
	 * @generated
	 */
	int CHECK_ACCOUNT = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ACCOUNT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ACCOUNT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ACCOUNT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ACCOUNT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Method Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ACCOUNT__PAYMENT_METHOD_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Account Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ACCOUNT__ACCOUNT_NUMBER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Account Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ACCOUNT__ACCOUNT_TYPE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bank Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ACCOUNT__BANK_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Branch Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ACCOUNT__BRANCH_CODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Company Name On Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ACCOUNT__COMPANY_NAME_ON_ACCOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ACCOUNT__CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name On Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ACCOUNT__NAME_ON_ACCOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Routing Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ACCOUNT__ROUTING_NUMBER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Check Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_ACCOUNT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentMethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentMethodImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentMethod()
	 * @generated
	 */
	int PAYMENT_METHOD = 37;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Method Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD__PAYMENT_METHOD_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fin Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD__FIN_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD__GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Payment Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD__PAYMENT_METHOD_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.CreditCardImpl <em>Credit Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.CreditCardImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getCreditCard()
	 * @generated
	 */
	int CREDIT_CARD = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__CREATED_STAMP = PAYMENT_METHOD__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__CREATED_TX_STAMP = PAYMENT_METHOD__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__LAST_UPDATED_STAMP = PAYMENT_METHOD__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__LAST_UPDATED_TX_STAMP = PAYMENT_METHOD__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Method Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__PAYMENT_METHOD_ID = PAYMENT_METHOD__PAYMENT_METHOD_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__DESCRIPTION = PAYMENT_METHOD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fin Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__FIN_ACCOUNT_ID = PAYMENT_METHOD__FIN_ACCOUNT_ID;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__FROM_DATE = PAYMENT_METHOD__FROM_DATE;

	/**
	 * The feature id for the '<em><b>Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__GL_ACCOUNT_ID = PAYMENT_METHOD__GL_ACCOUNT_ID;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__PARTY_ID = PAYMENT_METHOD__PARTY_ID;

	/**
	 * The feature id for the '<em><b>Payment Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__PAYMENT_METHOD_TYPE_ID = PAYMENT_METHOD__PAYMENT_METHOD_TYPE_ID;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__THRU_DATE = PAYMENT_METHOD__THRU_DATE;

	/**
	 * The feature id for the '<em><b>Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__CARD_NUMBER = PAYMENT_METHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Card Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__CARD_TYPE = PAYMENT_METHOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Company Name On Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__COMPANY_NAME_ON_CARD = PAYMENT_METHOD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Consecutive Failed Auths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__CONSECUTIVE_FAILED_AUTHS = PAYMENT_METHOD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Consecutive Failed Nsf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__CONSECUTIVE_FAILED_NSF = PAYMENT_METHOD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__CONTACT_MECH_ID = PAYMENT_METHOD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Expire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__EXPIRE_DATE = PAYMENT_METHOD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>First Name On Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__FIRST_NAME_ON_CARD = PAYMENT_METHOD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Issue Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__ISSUE_NUMBER = PAYMENT_METHOD_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Last Failed Auth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__LAST_FAILED_AUTH_DATE = PAYMENT_METHOD_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Last Failed Nsf Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__LAST_FAILED_NSF_DATE = PAYMENT_METHOD_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Last Name On Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__LAST_NAME_ON_CARD = PAYMENT_METHOD_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Middle Name On Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__MIDDLE_NAME_ON_CARD = PAYMENT_METHOD_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Suffix On Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__SUFFIX_ON_CARD = PAYMENT_METHOD_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Title On Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__TITLE_ON_CARD = PAYMENT_METHOD_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Valid From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__VALID_FROM_DATE = PAYMENT_METHOD_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Credit Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_FEATURE_COUNT = PAYMENT_METHOD_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.CreditCardTypeGlAccountImpl <em>Credit Card Type Gl Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.CreditCardTypeGlAccountImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getCreditCardTypeGlAccount()
	 * @generated
	 */
	int CREDIT_CARD_TYPE_GL_ACCOUNT = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_TYPE_GL_ACCOUNT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_TYPE_GL_ACCOUNT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_TYPE_GL_ACCOUNT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_TYPE_GL_ACCOUNT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Card Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_TYPE_GL_ACCOUNT__CARD_TYPE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organization Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gl Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_TYPE_GL_ACCOUNT__GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Credit Card Type Gl Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_TYPE_GL_ACCOUNT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.DeductionImpl <em>Deduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.DeductionImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getDeduction()
	 * @generated
	 */
	int DEDUCTION = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUCTION__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUCTION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUCTION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUCTION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Deduction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUCTION__DEDUCTION_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUCTION__AMOUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deduction Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUCTION__DEDUCTION_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Payment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUCTION__PAYMENT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUCTION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.DeductionTypeImpl <em>Deduction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.DeductionTypeImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getDeductionType()
	 * @generated
	 */
	int DEDUCTION_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUCTION_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUCTION_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUCTION_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUCTION_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUCTION_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Deduction Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUCTION_TYPE__DEDUCTION_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUCTION_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUCTION_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUCTION_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Deduction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEDUCTION_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.EftAccountImpl <em>Eft Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.EftAccountImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getEftAccount()
	 * @generated
	 */
	int EFT_ACCOUNT = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFT_ACCOUNT__CREATED_STAMP = PAYMENT_METHOD__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFT_ACCOUNT__CREATED_TX_STAMP = PAYMENT_METHOD__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFT_ACCOUNT__LAST_UPDATED_STAMP = PAYMENT_METHOD__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFT_ACCOUNT__LAST_UPDATED_TX_STAMP = PAYMENT_METHOD__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Method Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFT_ACCOUNT__PAYMENT_METHOD_ID = PAYMENT_METHOD__PAYMENT_METHOD_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFT_ACCOUNT__DESCRIPTION = PAYMENT_METHOD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fin Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFT_ACCOUNT__FIN_ACCOUNT_ID = PAYMENT_METHOD__FIN_ACCOUNT_ID;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFT_ACCOUNT__FROM_DATE = PAYMENT_METHOD__FROM_DATE;

	/**
	 * The feature id for the '<em><b>Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFT_ACCOUNT__GL_ACCOUNT_ID = PAYMENT_METHOD__GL_ACCOUNT_ID;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFT_ACCOUNT__PARTY_ID = PAYMENT_METHOD__PARTY_ID;

	/**
	 * The feature id for the '<em><b>Payment Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFT_ACCOUNT__PAYMENT_METHOD_TYPE_ID = PAYMENT_METHOD__PAYMENT_METHOD_TYPE_ID;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFT_ACCOUNT__THRU_DATE = PAYMENT_METHOD__THRU_DATE;

	/**
	 * The feature id for the '<em><b>Account Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFT_ACCOUNT__ACCOUNT_NUMBER = PAYMENT_METHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Account Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFT_ACCOUNT__ACCOUNT_TYPE = PAYMENT_METHOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bank Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFT_ACCOUNT__BANK_NAME = PAYMENT_METHOD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Company Name On Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFT_ACCOUNT__COMPANY_NAME_ON_ACCOUNT = PAYMENT_METHOD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFT_ACCOUNT__CONTACT_MECH_ID = PAYMENT_METHOD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name On Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFT_ACCOUNT__NAME_ON_ACCOUNT = PAYMENT_METHOD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Routing Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFT_ACCOUNT__ROUTING_NUMBER = PAYMENT_METHOD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Years At Bank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFT_ACCOUNT__YEARS_AT_BANK = PAYMENT_METHOD_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Eft Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFT_ACCOUNT_FEATURE_COUNT = PAYMENT_METHOD_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardImpl <em>Gift Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.GiftCardImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getGiftCard()
	 * @generated
	 */
	int GIFT_CARD = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD__CREATED_STAMP = PAYMENT_METHOD__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD__CREATED_TX_STAMP = PAYMENT_METHOD__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD__LAST_UPDATED_STAMP = PAYMENT_METHOD__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD__LAST_UPDATED_TX_STAMP = PAYMENT_METHOD__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Method Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD__PAYMENT_METHOD_ID = PAYMENT_METHOD__PAYMENT_METHOD_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD__DESCRIPTION = PAYMENT_METHOD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fin Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD__FIN_ACCOUNT_ID = PAYMENT_METHOD__FIN_ACCOUNT_ID;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD__FROM_DATE = PAYMENT_METHOD__FROM_DATE;

	/**
	 * The feature id for the '<em><b>Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD__GL_ACCOUNT_ID = PAYMENT_METHOD__GL_ACCOUNT_ID;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD__PARTY_ID = PAYMENT_METHOD__PARTY_ID;

	/**
	 * The feature id for the '<em><b>Payment Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD__PAYMENT_METHOD_TYPE_ID = PAYMENT_METHOD__PAYMENT_METHOD_TYPE_ID;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD__THRU_DATE = PAYMENT_METHOD__THRU_DATE;

	/**
	 * The feature id for the '<em><b>Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD__CARD_NUMBER = PAYMENT_METHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD__CONTACT_MECH_ID = PAYMENT_METHOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD__EXPIRE_DATE = PAYMENT_METHOD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pin Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD__PIN_NUMBER = PAYMENT_METHOD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Gift Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD_FEATURE_COUNT = PAYMENT_METHOD_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl <em>Gift Card Fulfillment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getGiftCardFulfillment()
	 * @generated
	 */
	int GIFT_CARD_FULFILLMENT = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD_FULFILLMENT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD_FULFILLMENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD_FULFILLMENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD_FULFILLMENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fulfillment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD_FULFILLMENT__FULFILLMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD_FULFILLMENT__AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Auth Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD_FULFILLMENT__AUTH_CODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD_FULFILLMENT__CARD_NUMBER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fulfillment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD_FULFILLMENT__FULFILLMENT_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Merchant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD_FULFILLMENT__MERCHANT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD_FULFILLMENT__ORDER_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD_FULFILLMENT__ORDER_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD_FULFILLMENT__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Pin Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD_FULFILLMENT__PIN_NUMBER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Reference Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD_FULFILLMENT__REFERENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Response Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD_FULFILLMENT__RESPONSE_CODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Survey Response Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD_FULFILLMENT__SURVEY_RESPONSE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Type Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD_FULFILLMENT__TYPE_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Gift Card Fulfillment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIFT_CARD_FULFILLMENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PayPalPaymentMethodImpl <em>Pay Pal Payment Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PayPalPaymentMethodImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPayPalPaymentMethod()
	 * @generated
	 */
	int PAY_PAL_PAYMENT_METHOD = 12;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_PAL_PAYMENT_METHOD__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_PAL_PAYMENT_METHOD__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_PAL_PAYMENT_METHOD__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_PAL_PAYMENT_METHOD__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Method Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_PAL_PAYMENT_METHOD__PAYMENT_METHOD_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Avs Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_PAL_PAYMENT_METHOD__AVS_ADDR = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Avs Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_PAL_PAYMENT_METHOD__AVS_ZIP = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_PAL_PAYMENT_METHOD__CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Correlation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_PAL_PAYMENT_METHOD__CORRELATION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Express Checkout Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_PAL_PAYMENT_METHOD__EXPRESS_CHECKOUT_TOKEN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Payer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_PAL_PAYMENT_METHOD__PAYER_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Payer Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_PAL_PAYMENT_METHOD__PAYER_STATUS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_PAL_PAYMENT_METHOD__TRANSACTION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Pay Pal Payment Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAY_PAL_PAYMENT_METHOD_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl <em>Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPayment()
	 * @generated
	 */
	int PAYMENT = 13;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual Currency Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__ACTUAL_CURRENCY_AMOUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actual Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__ACTUAL_CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__AMOUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__COMMENTS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Effective Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__EFFECTIVE_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fin Account Trans Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__FIN_ACCOUNT_TRANS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Override Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__OVERRIDE_GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Party Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PARTY_ID_FROM = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Party Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PARTY_ID_TO = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Payment Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_ATTRIBUTES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Payment Gateway Response Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_GATEWAY_RESPONSE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Payment Method Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_METHOD_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Payment Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_METHOD_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Payment Preference Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_PREFERENCE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Payment Ref Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_REF_NUM = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Payment Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Role Type Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__ROLE_TYPE_ID_TO = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__STATUS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentApplicationImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentApplication()
	 * @generated
	 */
	int PAYMENT_APPLICATION = 14;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_APPLICATION__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_APPLICATION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_APPLICATION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_APPLICATION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Application Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_APPLICATION__PAYMENT_APPLICATION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Amount Applied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_APPLICATION__AMOUNT_APPLIED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Billing Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_APPLICATION__BILLING_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Invoice Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_APPLICATION__INVOICE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Invoice Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_APPLICATION__INVOICE_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Override Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_APPLICATION__OVERRIDE_GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Payment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_APPLICATION__PAYMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tax Auth Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_APPLICATION__TAX_AUTH_GEO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>To Payment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_APPLICATION__TO_PAYMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_APPLICATION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentAttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentAttributeImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentAttribute()
	 * @generated
	 */
	int PAYMENT_ATTRIBUTE = 15;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_ATTRIBUTE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_ATTRIBUTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_ATTRIBUTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_ATTRIBUTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_ATTRIBUTE__PAYMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_ATTRIBUTE__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_ATTRIBUTE__ATTR_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_ATTRIBUTE__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_ATTRIBUTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentBudgetAllocationImpl <em>Budget Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentBudgetAllocationImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentBudgetAllocation()
	 * @generated
	 */
	int PAYMENT_BUDGET_ALLOCATION = 16;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_BUDGET_ALLOCATION__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_BUDGET_ALLOCATION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_BUDGET_ALLOCATION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_BUDGET_ALLOCATION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Budget Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_BUDGET_ALLOCATION__BUDGET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Payment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_BUDGET_ALLOCATION__PAYMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Budget Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_BUDGET_ALLOCATION__BUDGET_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_BUDGET_ALLOCATION__AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Budget Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_BUDGET_ALLOCATION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentContentImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentContent()
	 * @generated
	 */
	int PAYMENT_CONTENT = 17;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_CONTENT__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_CONTENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_CONTENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_CONTENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_CONTENT__PAYMENT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_CONTENT__CONTENT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Payment Content Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_CONTENT__PAYMENT_CONTENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_CONTENT__FROM_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_CONTENT__THRU_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_CONTENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentContentTypeImpl <em>Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentContentTypeImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentContentType()
	 * @generated
	 */
	int PAYMENT_CONTENT_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_CONTENT_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_CONTENT_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_CONTENT_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_CONTENT_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_CONTENT_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Content Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_CONTENT_TYPE__PAYMENT_CONTENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_CONTENT_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_CONTENT_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_CONTENT_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_CONTENT_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayAuthorizeNetImpl <em>Gateway Authorize Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayAuthorizeNetImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewayAuthorizeNet()
	 * @generated
	 */
	int PAYMENT_GATEWAY_AUTHORIZE_NET = 19;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_AUTHORIZE_NET__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_AUTHORIZE_NET__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_AUTHORIZE_NET__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_AUTHORIZE_NET__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Gateway Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_AUTHORIZE_NET__PAYMENT_GATEWAY_CONFIG_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_AUTHORIZE_NET__API_VERSION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Certificate Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_AUTHORIZE_NET__CERTIFICATE_ALIAS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cp Device Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_AUTHORIZE_NET__CP_DEVICE_TYPE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cp Market Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_AUTHORIZE_NET__CP_MARKET_TYPE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cp Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_AUTHORIZE_NET__CP_VERSION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Delimited Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_AUTHORIZE_NET__DELIMITED_DATA = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Delimiter Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_AUTHORIZE_NET__DELIMITER_CHAR = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Duplicate Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_AUTHORIZE_NET__DUPLICATE_WINDOW = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Email Customer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_AUTHORIZE_NET__EMAIL_CUSTOMER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Email Merchant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_AUTHORIZE_NET__EMAIL_MERCHANT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_AUTHORIZE_NET__METHOD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_AUTHORIZE_NET__PWD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Relay Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_AUTHORIZE_NET__RELAY_RESPONSE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Test Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_AUTHORIZE_NET__TEST_MODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Tran Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_AUTHORIZE_NET__TRAN_KEY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Trans Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_AUTHORIZE_NET__TRANS_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Transaction Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_AUTHORIZE_NET__TRANSACTION_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_AUTHORIZE_NET__USER_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Gateway Authorize Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_AUTHORIZE_NET_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl <em>Gateway Clear Commerce</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewayClearCommerce()
	 * @generated
	 */
	int PAYMENT_GATEWAY_CLEAR_COMMERCE = 20;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CLEAR_COMMERCE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CLEAR_COMMERCE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CLEAR_COMMERCE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CLEAR_COMMERCE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Gateway Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CLEAR_COMMERCE__PAYMENT_GATEWAY_CONFIG_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Client Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CLEAR_COMMERCE__CLIENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Effective Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CLEAR_COMMERCE__EFFECTIVE_ALIAS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enable CVM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CLEAR_COMMERCE__ENABLE_CVM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CLEAR_COMMERCE__GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Process Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CLEAR_COMMERCE__PROCESS_MODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CLEAR_COMMERCE__PWD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Server URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CLEAR_COMMERCE__SERVER_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CLEAR_COMMERCE__SOURCE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>User Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CLEAR_COMMERCE__USER_ALIAS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CLEAR_COMMERCE__USERNAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Gateway Clear Commerce</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CLEAR_COMMERCE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayConfigImpl <em>Gateway Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayConfigImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewayConfig()
	 * @generated
	 */
	int PAYMENT_GATEWAY_CONFIG = 21;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CONFIG__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CONFIG__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CONFIG__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CONFIG__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Gateway Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CONFIG__PAYMENT_GATEWAY_CONFIG_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CONFIG__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Payment Gateway Config Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CONFIG__PAYMENT_GATEWAY_CONFIG_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gateway Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CONFIG_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayConfigTypeImpl <em>Gateway Config Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayConfigTypeImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewayConfigType()
	 * @generated
	 */
	int PAYMENT_GATEWAY_CONFIG_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CONFIG_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CONFIG_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CONFIG_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CONFIG_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CONFIG_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Gateway Config Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CONFIG_TYPE__PAYMENT_GATEWAY_CONFIG_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CONFIG_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CONFIG_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CONFIG_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Gateway Config Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CONFIG_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayCyberSourceImpl <em>Gateway Cyber Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayCyberSourceImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewayCyberSource()
	 * @generated
	 */
	int PAYMENT_GATEWAY_CYBER_SOURCE = 23;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CYBER_SOURCE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CYBER_SOURCE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CYBER_SOURCE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CYBER_SOURCE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Gateway Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CYBER_SOURCE__PAYMENT_GATEWAY_CONFIG_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CYBER_SOURCE__API_VERSION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Auto Bill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CYBER_SOURCE__AUTO_BILL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Avs Decline Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CYBER_SOURCE__AVS_DECLINE_CODES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Disable Bill Avs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CYBER_SOURCE__DISABLE_BILL_AVS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Enable Dav</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CYBER_SOURCE__ENABLE_DAV = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fraud Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CYBER_SOURCE__FRAUD_SCORE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ignore Avs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CYBER_SOURCE__IGNORE_AVS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Keys Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CYBER_SOURCE__KEYS_DIR = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Keys File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CYBER_SOURCE__KEYS_FILE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Log Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CYBER_SOURCE__LOG_DIR = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Log Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CYBER_SOURCE__LOG_ENABLED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Log File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CYBER_SOURCE__LOG_FILE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Log Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CYBER_SOURCE__LOG_SIZE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Merchant Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_CONTACT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Merchant Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_DESCR = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Merchant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Production</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CYBER_SOURCE__PRODUCTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Gateway Cyber Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_CYBER_SOURCE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayEwayImpl <em>Gateway Eway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayEwayImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewayEway()
	 * @generated
	 */
	int PAYMENT_GATEWAY_EWAY = 24;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_EWAY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_EWAY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_EWAY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_EWAY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Gateway Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_EWAY__PAYMENT_GATEWAY_CONFIG_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Customer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_EWAY__CUSTOMER_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enable Beagle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_EWAY__ENABLE_BEAGLE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enable Cvn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_EWAY__ENABLE_CVN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refund Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_EWAY__REFUND_PWD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Test Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_EWAY__TEST_MODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Gateway Eway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_EWAY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayOrbitalImpl <em>Gateway Orbital</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayOrbitalImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewayOrbital()
	 * @generated
	 */
	int PAYMENT_GATEWAY_ORBITAL = 25;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_ORBITAL__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_ORBITAL__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_ORBITAL__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_ORBITAL__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Gateway Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_ORBITAL__PAYMENT_GATEWAY_CONFIG_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Authorization URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_ORBITAL__AUTHORIZATION_URI = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connection Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_ORBITAL__CONNECTION_PASSWORD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connection Timeout Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_ORBITAL__CONNECTION_TIMEOUT_SECONDS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Engine Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_ORBITAL__ENGINE_CLASS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Host Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_ORBITAL__HOST_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Host Name Failover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_ORBITAL__HOST_NAME_FAILOVER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Merchant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_ORBITAL__MERCHANT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_ORBITAL__PORT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Port Failover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_ORBITAL__PORT_FAILOVER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Read Timeout Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_ORBITAL__READ_TIMEOUT_SECONDS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Response Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_ORBITAL__RESPONSE_TYPE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Sdk Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_ORBITAL__SDK_VERSION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Ssl Socket Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_ORBITAL__SSL_SOCKET_FACTORY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_ORBITAL__USERNAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Gateway Orbital</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_ORBITAL_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl <em>Gateway Pay Pal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewayPayPal()
	 * @generated
	 */
	int PAYMENT_GATEWAY_PAY_PAL = 26;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAY_PAL__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAY_PAL__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAY_PAL__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAY_PAL__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Gateway Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAY_PAL__PAYMENT_GATEWAY_CONFIG_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Api Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAY_PAL__API_ENVIRONMENT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Api Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAY_PAL__API_PASSWORD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Api Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAY_PAL__API_SIGNATURE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Api User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAY_PAL__API_USER_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Business Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAY_PAL__BUSINESS_EMAIL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cancel Return Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAY_PAL__CANCEL_RETURN_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Confirm Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAY_PAL__CONFIRM_TEMPLATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Confirm Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAY_PAL__CONFIRM_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAY_PAL__IMAGE_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Notify Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAY_PAL__NOTIFY_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Redirect Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAY_PAL__REDIRECT_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Require Confirmed Shipping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAY_PAL__REQUIRE_CONFIRMED_SHIPPING = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Return Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAY_PAL__RETURN_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Shipping Callback Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAY_PAL__SHIPPING_CALLBACK_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Gateway Pay Pal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAY_PAL_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl <em>Gateway Payflow Pro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewayPayflowPro()
	 * @generated
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO = 27;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Gateway Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__PAYMENT_GATEWAY_CONFIG_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cancel Return Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__CANCEL_RETURN_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Certs Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__CERTS_PATH = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Check Avs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__CHECK_AVS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Check Cvv2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__CHECK_CVV2 = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Enable Transmit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__ENABLE_TRANSMIT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Host Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__HOST_ADDRESS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Host Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__HOST_PORT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Log File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__LOG_FILE_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Logging Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__LOGGING_LEVEL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Max Log File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__MAX_LOG_FILE_SIZE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Partner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__PARTNER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Pre Auth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__PRE_AUTH = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Proxy Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_ADDRESS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Proxy Logon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_LOGON = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Proxy Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_PASSWORD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Proxy Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_PORT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__PWD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Redirect Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__REDIRECT_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Return Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__RETURN_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Stack Trace On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__STACK_TRACE_ON = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__TIMEOUT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__USER_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO__VENDOR = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Gateway Payflow Pro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_PAYFLOW_PRO_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 24;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayRespMsgImpl <em>Gateway Resp Msg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayRespMsgImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewayRespMsg()
	 * @generated
	 */
	int PAYMENT_GATEWAY_RESP_MSG = 28;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESP_MSG__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESP_MSG__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESP_MSG__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESP_MSG__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Gateway Resp Msg Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESP_MSG__PAYMENT_GATEWAY_RESP_MSG_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Payment Gateway Response Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESP_MSG__PAYMENT_GATEWAY_RESPONSE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pgr Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESP_MSG__PGR_MESSAGE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gateway Resp Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESP_MSG_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl <em>Gateway Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewayResponse()
	 * @generated
	 */
	int PAYMENT_GATEWAY_RESPONSE = 29;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Gateway Response Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__PAYMENT_GATEWAY_RESPONSE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alt Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__ALT_REFERENCE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gateway Avs Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__GATEWAY_AVS_RESULT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gateway Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__GATEWAY_CODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gateway Cv Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__GATEWAY_CV_RESULT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gateway Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__GATEWAY_FLAG = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Gateway Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__GATEWAY_MESSAGE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Gateway Score Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__GATEWAY_SCORE_RESULT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Order Payment Preference Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__ORDER_PAYMENT_PREFERENCE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Payment Method Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__PAYMENT_METHOD_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Payment Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__PAYMENT_METHOD_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Payment Service Type Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__PAYMENT_SERVICE_TYPE_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Reference Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__REFERENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Result Bad Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__RESULT_BAD_CARD_NUMBER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Result Bad Expire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__RESULT_BAD_EXPIRE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Result Declined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__RESULT_DECLINED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Result Nsf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__RESULT_NSF = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Sub Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__SUB_REFERENCE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Trans Code Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__TRANS_CODE_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Transaction Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE__TRANSACTION_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Gateway Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_RESPONSE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 22;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySagePayImpl <em>Gateway Sage Pay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySagePayImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewaySagePay()
	 * @generated
	 */
	int PAYMENT_GATEWAY_SAGE_PAY = 30;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SAGE_PAY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SAGE_PAY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SAGE_PAY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SAGE_PAY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Gateway Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SAGE_PAY__PAYMENT_GATEWAY_CONFIG_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Authentication Trans Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SAGE_PAY__AUTHENTICATION_TRANS_TYPE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Authentication Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SAGE_PAY__AUTHENTICATION_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Authorise Trans Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SAGE_PAY__AUTHORISE_TRANS_TYPE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Authorise Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SAGE_PAY__AUTHORISE_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Production Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SAGE_PAY__PRODUCTION_HOST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Protocol Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SAGE_PAY__PROTOCOL_VERSION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Refund Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SAGE_PAY__REFUND_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Release Trans Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SAGE_PAY__RELEASE_TRANS_TYPE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Release Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SAGE_PAY__RELEASE_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Sage Pay Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SAGE_PAY__SAGE_PAY_MODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Testing Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SAGE_PAY__TESTING_HOST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SAGE_PAY__VENDOR = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Void Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SAGE_PAY__VOID_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Gateway Sage Pay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SAGE_PAY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySecurePayImpl <em>Gateway Secure Pay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySecurePayImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewaySecurePay()
	 * @generated
	 */
	int PAYMENT_GATEWAY_SECURE_PAY = 31;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SECURE_PAY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SECURE_PAY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SECURE_PAY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SECURE_PAY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Gateway Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SECURE_PAY__PAYMENT_GATEWAY_CONFIG_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enable Amount Round</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SECURE_PAY__ENABLE_AMOUNT_ROUND = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Merchant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SECURE_PAY__MERCHANT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Process Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SECURE_PAY__PROCESS_TIMEOUT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SECURE_PAY__PWD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Server URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SECURE_PAY__SERVER_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Gateway Secure Pay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_SECURE_PAY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl <em>Gateway World Pay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewayWorldPay()
	 * @generated
	 */
	int PAYMENT_GATEWAY_WORLD_PAY = 32;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_WORLD_PAY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_WORLD_PAY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_WORLD_PAY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_WORLD_PAY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Gateway Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_WORLD_PAY__PAYMENT_GATEWAY_CONFIG_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Auth Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_WORLD_PAY__AUTH_MODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fix Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_WORLD_PAY__FIX_CONTACT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hide Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_WORLD_PAY__HIDE_CONTACT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hide Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_WORLD_PAY__HIDE_CURRENCY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inst Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_WORLD_PAY__INST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lang Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_WORLD_PAY__LANG_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>No Language Menu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_WORLD_PAY__NO_LANGUAGE_MENU = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Redirect Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_WORLD_PAY__REDIRECT_URL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Test Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_WORLD_PAY__TEST_MODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>With Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_WORLD_PAY__WITH_DELIVERY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Gateway World Pay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_WORLD_PAY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGlAccountTypeMapImpl <em>Gl Account Type Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGlAccountTypeMapImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGlAccountTypeMap()
	 * @generated
	 */
	int PAYMENT_GL_ACCOUNT_TYPE_MAP = 33;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GL_ACCOUNT_TYPE_MAP__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GL_ACCOUNT_TYPE_MAP__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GL_ACCOUNT_TYPE_MAP__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GL_ACCOUNT_TYPE_MAP__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GL_ACCOUNT_TYPE_MAP__PAYMENT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organization Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GL_ACCOUNT_TYPE_MAP__ORGANIZATION_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gl Account Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GL_ACCOUNT_TYPE_MAP__GL_ACCOUNT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gl Account Type Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GL_ACCOUNT_TYPE_MAP_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGroupImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGroup()
	 * @generated
	 */
	int PAYMENT_GROUP = 34;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP__PAYMENT_GROUP_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Payment Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP__PAYMENT_GROUP_NAME = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Payment Group Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP__PAYMENT_GROUP_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGroupMemberImpl <em>Group Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGroupMemberImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGroupMember()
	 * @generated
	 */
	int PAYMENT_GROUP_MEMBER = 35;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP_MEMBER__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP_MEMBER__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP_MEMBER__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP_MEMBER__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP_MEMBER__PAYMENT_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Payment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP_MEMBER__PAYMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP_MEMBER__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP_MEMBER__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP_MEMBER__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Group Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP_MEMBER_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGroupTypeImpl <em>Group Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGroupTypeImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGroupType()
	 * @generated
	 */
	int PAYMENT_GROUP_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Group Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP_TYPE__PAYMENT_GROUP_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GROUP_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentMethodTypeImpl <em>Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentMethodTypeImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentMethodType()
	 * @generated
	 */
	int PAYMENT_METHOD_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Method Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD_TYPE__PAYMENT_METHOD_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD_TYPE__DEFAULT_GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Payment Method Type Gl Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD_TYPE__PAYMENT_METHOD_TYPE_GL_ACCOUNTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentMethodTypeGlAccountImpl <em>Method Type Gl Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentMethodTypeGlAccountImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentMethodTypeGlAccount()
	 * @generated
	 */
	int PAYMENT_METHOD_TYPE_GL_ACCOUNT = 39;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD_TYPE_GL_ACCOUNT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD_TYPE_GL_ACCOUNT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD_TYPE_GL_ACCOUNT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD_TYPE_GL_ACCOUNT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD_TYPE_GL_ACCOUNT__PAYMENT_METHOD_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organization Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD_TYPE_GL_ACCOUNT__GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Method Type Gl Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_METHOD_TYPE_GL_ACCOUNT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentTypeImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentType()
	 * @generated
	 */
	int PAYMENT_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__PAYMENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Payment Gl Account Type Maps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__PAYMENT_GL_ACCOUNT_TYPE_MAPS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Payment Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE__PAYMENT_TYPE_ATTRS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentTypeAttrImpl <em>Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentTypeAttrImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentTypeAttr()
	 * @generated
	 */
	int PAYMENT_TYPE_ATTR = 41;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE_ATTR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE_ATTR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE_ATTR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE_ATTR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Payment Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE_ATTR__PAYMENT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE_ATTR__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE_ATTR__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_TYPE_ATTR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.payment.impl.ValueLinkKeyImpl <em>Value Link Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.payment.impl.ValueLinkKeyImpl
	 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getValueLinkKey()
	 * @generated
	 */
	int VALUE_LINK_KEY = 42;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LINK_KEY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LINK_KEY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LINK_KEY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LINK_KEY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Merchant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LINK_KEY__MERCHANT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created By Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LINK_KEY__CREATED_BY_TERMINAL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LINK_KEY__CREATED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LINK_KEY__CREATED_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Exchange Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LINK_KEY__EXCHANGE_KEY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Last Modified By Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LINK_KEY__LAST_MODIFIED_BY_TERMINAL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LINK_KEY__LAST_MODIFIED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LINK_KEY__LAST_MODIFIED_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Last Working Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LINK_KEY__LAST_WORKING_KEY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Private Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LINK_KEY__PRIVATE_KEY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Public Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LINK_KEY__PUBLIC_KEY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Working Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LINK_KEY__WORKING_KEY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Working Key Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LINK_KEY__WORKING_KEY_INDEX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Value Link Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_LINK_KEY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.BillingAccount <em>Billing Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Billing Account</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccount
	 * @generated
	 */
	EClass getBillingAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.BillingAccount#getBillingAccountId <em>Billing Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Billing Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccount#getBillingAccountId()
	 * @see #getBillingAccount()
	 * @generated
	 */
	EAttribute getBillingAccount_BillingAccountId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.BillingAccount#getAccountCurrencyUomId <em>Account Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Account Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccount#getAccountCurrencyUomId()
	 * @see #getBillingAccount()
	 * @generated
	 */
	EReference getBillingAccount_AccountCurrencyUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.BillingAccount#getAccountLimit <em>Account Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Limit</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccount#getAccountLimit()
	 * @see #getBillingAccount()
	 * @generated
	 */
	EAttribute getBillingAccount_AccountLimit();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.BillingAccount#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccount#getContactMechId()
	 * @see #getBillingAccount()
	 * @generated
	 */
	EReference getBillingAccount_ContactMechId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.BillingAccount#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccount#getDescription()
	 * @see #getBillingAccount()
	 * @generated
	 */
	EAttribute getBillingAccount_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.BillingAccount#getExternalAccountId <em>External Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccount#getExternalAccountId()
	 * @see #getBillingAccount()
	 * @generated
	 */
	EAttribute getBillingAccount_ExternalAccountId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.BillingAccount#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccount#getFromDate()
	 * @see #getBillingAccount()
	 * @generated
	 */
	EAttribute getBillingAccount_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.BillingAccount#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccount#getThruDate()
	 * @see #getBillingAccount()
	 * @generated
	 */
	EAttribute getBillingAccount_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.BillingAccountRole <em>Billing Account Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Billing Account Role</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccountRole
	 * @generated
	 */
	EClass getBillingAccountRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.BillingAccountRole#getBillingAccountId <em>Billing Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Billing Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccountRole#getBillingAccountId()
	 * @see #getBillingAccountRole()
	 * @generated
	 */
	EReference getBillingAccountRole_BillingAccountId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.BillingAccountRole#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccountRole#getPartyId()
	 * @see #getBillingAccountRole()
	 * @generated
	 */
	EReference getBillingAccountRole_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.BillingAccountRole#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccountRole#getRoleTypeId()
	 * @see #getBillingAccountRole()
	 * @generated
	 */
	EReference getBillingAccountRole_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.BillingAccountRole#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccountRole#getFromDate()
	 * @see #getBillingAccountRole()
	 * @generated
	 */
	EAttribute getBillingAccountRole_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.BillingAccountRole#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccountRole#getThruDate()
	 * @see #getBillingAccountRole()
	 * @generated
	 */
	EAttribute getBillingAccountRole_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.BillingAccountTerm <em>Billing Account Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Billing Account Term</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccountTerm
	 * @generated
	 */
	EClass getBillingAccountTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getBillingAccountTermId <em>Billing Account Term Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Billing Account Term Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getBillingAccountTermId()
	 * @see #getBillingAccountTerm()
	 * @generated
	 */
	EAttribute getBillingAccountTerm_BillingAccountTermId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getBillingAccountId <em>Billing Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Billing Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getBillingAccountId()
	 * @see #getBillingAccountTerm()
	 * @generated
	 */
	EReference getBillingAccountTerm_BillingAccountId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getBillingAccountTermAttrs <em>Billing Account Term Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Billing Account Term Attrs</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getBillingAccountTermAttrs()
	 * @see #getBillingAccountTerm()
	 * @generated
	 */
	EReference getBillingAccountTerm_BillingAccountTermAttrs();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getTermDays <em>Term Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Days</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getTermDays()
	 * @see #getBillingAccountTerm()
	 * @generated
	 */
	EAttribute getBillingAccountTerm_TermDays();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getTermTypeId <em>Term Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Term Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getTermTypeId()
	 * @see #getBillingAccountTerm()
	 * @generated
	 */
	EReference getBillingAccountTerm_TermTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getTermValue <em>Term Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Value</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getTermValue()
	 * @see #getBillingAccountTerm()
	 * @generated
	 */
	EAttribute getBillingAccountTerm_TermValue();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getUomId <em>Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccountTerm#getUomId()
	 * @see #getBillingAccountTerm()
	 * @generated
	 */
	EReference getBillingAccountTerm_UomId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.BillingAccountTermAttr <em>Billing Account Term Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Billing Account Term Attr</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccountTermAttr
	 * @generated
	 */
	EClass getBillingAccountTermAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.BillingAccountTermAttr#getBillingAccountTermId <em>Billing Account Term Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Billing Account Term Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccountTermAttr#getBillingAccountTermId()
	 * @see #getBillingAccountTermAttr()
	 * @generated
	 */
	EReference getBillingAccountTermAttr_BillingAccountTermId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.BillingAccountTermAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccountTermAttr#getAttrName()
	 * @see #getBillingAccountTermAttr()
	 * @generated
	 */
	EAttribute getBillingAccountTermAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.BillingAccountTermAttr#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.BillingAccountTermAttr#getAttrValue()
	 * @see #getBillingAccountTermAttr()
	 * @generated
	 */
	EAttribute getBillingAccountTermAttr_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.CheckAccount <em>Check Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Account</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CheckAccount
	 * @generated
	 */
	EClass getCheckAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getPaymentMethodId <em>Payment Method Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Method Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CheckAccount#getPaymentMethodId()
	 * @see #getCheckAccount()
	 * @generated
	 */
	EAttribute getCheckAccount_PaymentMethodId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getAccountNumber <em>Account Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Number</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CheckAccount#getAccountNumber()
	 * @see #getCheckAccount()
	 * @generated
	 */
	EAttribute getCheckAccount_AccountNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getAccountType <em>Account Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CheckAccount#getAccountType()
	 * @see #getCheckAccount()
	 * @generated
	 */
	EAttribute getCheckAccount_AccountType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getBankName <em>Bank Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bank Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CheckAccount#getBankName()
	 * @see #getCheckAccount()
	 * @generated
	 */
	EAttribute getCheckAccount_BankName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getBranchCode <em>Branch Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch Code</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CheckAccount#getBranchCode()
	 * @see #getCheckAccount()
	 * @generated
	 */
	EAttribute getCheckAccount_BranchCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getCompanyNameOnAccount <em>Company Name On Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company Name On Account</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CheckAccount#getCompanyNameOnAccount()
	 * @see #getCheckAccount()
	 * @generated
	 */
	EAttribute getCheckAccount_CompanyNameOnAccount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CheckAccount#getContactMechId()
	 * @see #getCheckAccount()
	 * @generated
	 */
	EReference getCheckAccount_ContactMechId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getNameOnAccount <em>Name On Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name On Account</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CheckAccount#getNameOnAccount()
	 * @see #getCheckAccount()
	 * @generated
	 */
	EAttribute getCheckAccount_NameOnAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getRoutingNumber <em>Routing Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Routing Number</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CheckAccount#getRoutingNumber()
	 * @see #getCheckAccount()
	 * @generated
	 */
	EAttribute getCheckAccount_RoutingNumber();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.CreditCard <em>Credit Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credit Card</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CreditCard
	 * @generated
	 */
	EClass getCreditCard();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getCardNumber <em>Card Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Number</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CreditCard#getCardNumber()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_CardNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getCardType <em>Card Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CreditCard#getCardType()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_CardType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getCompanyNameOnCard <em>Company Name On Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company Name On Card</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CreditCard#getCompanyNameOnCard()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_CompanyNameOnCard();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getConsecutiveFailedAuths <em>Consecutive Failed Auths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consecutive Failed Auths</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CreditCard#getConsecutiveFailedAuths()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_ConsecutiveFailedAuths();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getConsecutiveFailedNsf <em>Consecutive Failed Nsf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consecutive Failed Nsf</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CreditCard#getConsecutiveFailedNsf()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_ConsecutiveFailedNsf();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CreditCard#getContactMechId()
	 * @see #getCreditCard()
	 * @generated
	 */
	EReference getCreditCard_ContactMechId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getExpireDate <em>Expire Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expire Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CreditCard#getExpireDate()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_ExpireDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getFirstNameOnCard <em>First Name On Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name On Card</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CreditCard#getFirstNameOnCard()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_FirstNameOnCard();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getIssueNumber <em>Issue Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Number</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CreditCard#getIssueNumber()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_IssueNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getLastFailedAuthDate <em>Last Failed Auth Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Failed Auth Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CreditCard#getLastFailedAuthDate()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_LastFailedAuthDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getLastFailedNsfDate <em>Last Failed Nsf Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Failed Nsf Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CreditCard#getLastFailedNsfDate()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_LastFailedNsfDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getLastNameOnCard <em>Last Name On Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name On Card</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CreditCard#getLastNameOnCard()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_LastNameOnCard();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getMiddleNameOnCard <em>Middle Name On Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Middle Name On Card</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CreditCard#getMiddleNameOnCard()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_MiddleNameOnCard();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getSuffixOnCard <em>Suffix On Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suffix On Card</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CreditCard#getSuffixOnCard()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_SuffixOnCard();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getTitleOnCard <em>Title On Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title On Card</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CreditCard#getTitleOnCard()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_TitleOnCard();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getValidFromDate <em>Valid From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CreditCard#getValidFromDate()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_ValidFromDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.CreditCardTypeGlAccount <em>Credit Card Type Gl Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credit Card Type Gl Account</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CreditCardTypeGlAccount
	 * @generated
	 */
	EClass getCreditCardTypeGlAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CreditCardTypeGlAccount#getCardType <em>Card Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CreditCardTypeGlAccount#getCardType()
	 * @see #getCreditCardTypeGlAccount()
	 * @generated
	 */
	EAttribute getCreditCardTypeGlAccount_CardType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CreditCardTypeGlAccount#getOrganizationPartyId <em>Organization Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CreditCardTypeGlAccount#getOrganizationPartyId()
	 * @see #getCreditCardTypeGlAccount()
	 * @generated
	 */
	EAttribute getCreditCardTypeGlAccount_OrganizationPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.CreditCardTypeGlAccount#getGlAccountId <em>Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.CreditCardTypeGlAccount#getGlAccountId()
	 * @see #getCreditCardTypeGlAccount()
	 * @generated
	 */
	EAttribute getCreditCardTypeGlAccount_GlAccountId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.Deduction <em>Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deduction</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Deduction
	 * @generated
	 */
	EClass getDeduction();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.Deduction#getDeductionId <em>Deduction Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Deduction#getDeductionId()
	 * @see #getDeduction()
	 * @generated
	 */
	EAttribute getDeduction_DeductionId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.Deduction#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Deduction#getAmount()
	 * @see #getDeduction()
	 * @generated
	 */
	EAttribute getDeduction_Amount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.Deduction#getDeductionTypeId <em>Deduction Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deduction Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Deduction#getDeductionTypeId()
	 * @see #getDeduction()
	 * @generated
	 */
	EReference getDeduction_DeductionTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.Deduction#getPaymentId <em>Payment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Deduction#getPaymentId()
	 * @see #getDeduction()
	 * @generated
	 */
	EReference getDeduction_PaymentId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.DeductionType <em>Deduction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deduction Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.DeductionType
	 * @generated
	 */
	EClass getDeductionType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.DeductionType#getDeductionTypeId <em>Deduction Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.DeductionType#getDeductionTypeId()
	 * @see #getDeductionType()
	 * @generated
	 */
	EAttribute getDeductionType_DeductionTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.DeductionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.DeductionType#getDescription()
	 * @see #getDeductionType()
	 * @generated
	 */
	EAttribute getDeductionType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.DeductionType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.DeductionType#isHasTable()
	 * @see #getDeductionType()
	 * @generated
	 */
	EAttribute getDeductionType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.DeductionType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.DeductionType#getParentTypeId()
	 * @see #getDeductionType()
	 * @generated
	 */
	EReference getDeductionType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.EftAccount <em>Eft Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eft Account</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.EftAccount
	 * @generated
	 */
	EClass getEftAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.EftAccount#getAccountNumber <em>Account Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Number</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.EftAccount#getAccountNumber()
	 * @see #getEftAccount()
	 * @generated
	 */
	EAttribute getEftAccount_AccountNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.EftAccount#getAccountType <em>Account Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.EftAccount#getAccountType()
	 * @see #getEftAccount()
	 * @generated
	 */
	EAttribute getEftAccount_AccountType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.EftAccount#getBankName <em>Bank Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bank Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.EftAccount#getBankName()
	 * @see #getEftAccount()
	 * @generated
	 */
	EAttribute getEftAccount_BankName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.EftAccount#getCompanyNameOnAccount <em>Company Name On Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company Name On Account</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.EftAccount#getCompanyNameOnAccount()
	 * @see #getEftAccount()
	 * @generated
	 */
	EAttribute getEftAccount_CompanyNameOnAccount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.EftAccount#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.EftAccount#getContactMechId()
	 * @see #getEftAccount()
	 * @generated
	 */
	EReference getEftAccount_ContactMechId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.EftAccount#getNameOnAccount <em>Name On Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name On Account</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.EftAccount#getNameOnAccount()
	 * @see #getEftAccount()
	 * @generated
	 */
	EAttribute getEftAccount_NameOnAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.EftAccount#getRoutingNumber <em>Routing Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Routing Number</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.EftAccount#getRoutingNumber()
	 * @see #getEftAccount()
	 * @generated
	 */
	EAttribute getEftAccount_RoutingNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.EftAccount#getYearsAtBank <em>Years At Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Years At Bank</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.EftAccount#getYearsAtBank()
	 * @see #getEftAccount()
	 * @generated
	 */
	EAttribute getEftAccount_YearsAtBank();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.GiftCard <em>Gift Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gift Card</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.GiftCard
	 * @generated
	 */
	EClass getGiftCard();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.GiftCard#getCardNumber <em>Card Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Number</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.GiftCard#getCardNumber()
	 * @see #getGiftCard()
	 * @generated
	 */
	EAttribute getGiftCard_CardNumber();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.GiftCard#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.GiftCard#getContactMechId()
	 * @see #getGiftCard()
	 * @generated
	 */
	EReference getGiftCard_ContactMechId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.GiftCard#getExpireDate <em>Expire Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expire Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.GiftCard#getExpireDate()
	 * @see #getGiftCard()
	 * @generated
	 */
	EAttribute getGiftCard_ExpireDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.GiftCard#getPinNumber <em>Pin Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin Number</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.GiftCard#getPinNumber()
	 * @see #getGiftCard()
	 * @generated
	 */
	EAttribute getGiftCard_PinNumber();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment <em>Gift Card Fulfillment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gift Card Fulfillment</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment
	 * @generated
	 */
	EClass getGiftCardFulfillment();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getFulfillmentId <em>Fulfillment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fulfillment Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getFulfillmentId()
	 * @see #getGiftCardFulfillment()
	 * @generated
	 */
	EAttribute getGiftCardFulfillment_FulfillmentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getAmount()
	 * @see #getGiftCardFulfillment()
	 * @generated
	 */
	EAttribute getGiftCardFulfillment_Amount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getAuthCode <em>Auth Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auth Code</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getAuthCode()
	 * @see #getGiftCardFulfillment()
	 * @generated
	 */
	EAttribute getGiftCardFulfillment_AuthCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getCardNumber <em>Card Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Number</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getCardNumber()
	 * @see #getGiftCardFulfillment()
	 * @generated
	 */
	EAttribute getGiftCardFulfillment_CardNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getFulfillmentDate <em>Fulfillment Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fulfillment Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getFulfillmentDate()
	 * @see #getGiftCardFulfillment()
	 * @generated
	 */
	EAttribute getGiftCardFulfillment_FulfillmentDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getMerchantId <em>Merchant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merchant Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getMerchantId()
	 * @see #getGiftCardFulfillment()
	 * @generated
	 */
	EAttribute getGiftCardFulfillment_MerchantId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getOrderId()
	 * @see #getGiftCardFulfillment()
	 * @generated
	 */
	EReference getGiftCardFulfillment_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getOrderItemSeqId()
	 * @see #getGiftCardFulfillment()
	 * @generated
	 */
	EAttribute getGiftCardFulfillment_OrderItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getPartyId()
	 * @see #getGiftCardFulfillment()
	 * @generated
	 */
	EReference getGiftCardFulfillment_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getPinNumber <em>Pin Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin Number</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getPinNumber()
	 * @see #getGiftCardFulfillment()
	 * @generated
	 */
	EAttribute getGiftCardFulfillment_PinNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getReferenceNum <em>Reference Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Num</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getReferenceNum()
	 * @see #getGiftCardFulfillment()
	 * @generated
	 */
	EAttribute getGiftCardFulfillment_ReferenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getResponseCode <em>Response Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Code</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getResponseCode()
	 * @see #getGiftCardFulfillment()
	 * @generated
	 */
	EAttribute getGiftCardFulfillment_ResponseCode();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getSurveyResponseId <em>Survey Response Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Survey Response Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getSurveyResponseId()
	 * @see #getGiftCardFulfillment()
	 * @generated
	 */
	EReference getGiftCardFulfillment_SurveyResponseId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getTypeEnumId <em>Type Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Enum Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getTypeEnumId()
	 * @see #getGiftCardFulfillment()
	 * @generated
	 */
	EReference getGiftCardFulfillment_TypeEnumId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod <em>Pay Pal Payment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pay Pal Payment Method</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod
	 * @generated
	 */
	EClass getPayPalPaymentMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getPaymentMethodId <em>Payment Method Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Method Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getPaymentMethodId()
	 * @see #getPayPalPaymentMethod()
	 * @generated
	 */
	EAttribute getPayPalPaymentMethod_PaymentMethodId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#isAvsAddr <em>Avs Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avs Addr</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#isAvsAddr()
	 * @see #getPayPalPaymentMethod()
	 * @generated
	 */
	EAttribute getPayPalPaymentMethod_AvsAddr();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#isAvsZip <em>Avs Zip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avs Zip</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#isAvsZip()
	 * @see #getPayPalPaymentMethod()
	 * @generated
	 */
	EAttribute getPayPalPaymentMethod_AvsZip();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getContactMechId()
	 * @see #getPayPalPaymentMethod()
	 * @generated
	 */
	EReference getPayPalPaymentMethod_ContactMechId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getCorrelationId <em>Correlation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correlation Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getCorrelationId()
	 * @see #getPayPalPaymentMethod()
	 * @generated
	 */
	EAttribute getPayPalPaymentMethod_CorrelationId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getExpressCheckoutToken <em>Express Checkout Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Express Checkout Token</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getExpressCheckoutToken()
	 * @see #getPayPalPaymentMethod()
	 * @generated
	 */
	EAttribute getPayPalPaymentMethod_ExpressCheckoutToken();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getPayerId <em>Payer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payer Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getPayerId()
	 * @see #getPayPalPaymentMethod()
	 * @generated
	 */
	EAttribute getPayPalPaymentMethod_PayerId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getPayerStatus <em>Payer Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payer Status</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getPayerStatus()
	 * @see #getPayPalPaymentMethod()
	 * @generated
	 */
	EAttribute getPayPalPaymentMethod_PayerStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getTransactionId <em>Transaction Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getTransactionId()
	 * @see #getPayPalPaymentMethod()
	 * @generated
	 */
	EAttribute getPayPalPaymentMethod_TransactionId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Payment
	 * @generated
	 */
	EClass getPayment();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.Payment#getPaymentId <em>Payment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Payment#getPaymentId()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_PaymentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.Payment#getActualCurrencyAmount <em>Actual Currency Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Currency Amount</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Payment#getActualCurrencyAmount()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_ActualCurrencyAmount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.Payment#getActualCurrencyUomId <em>Actual Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actual Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Payment#getActualCurrencyUomId()
	 * @see #getPayment()
	 * @generated
	 */
	EReference getPayment_ActualCurrencyUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.Payment#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Payment#getAmount()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Amount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.Payment#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Payment#getComments()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Comments();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.Payment#getCurrencyUomId <em>Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Payment#getCurrencyUomId()
	 * @see #getPayment()
	 * @generated
	 */
	EReference getPayment_CurrencyUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.Payment#getEffectiveDate <em>Effective Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Payment#getEffectiveDate()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_EffectiveDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.Payment#getFinAccountTransId <em>Fin Account Trans Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account Trans Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Payment#getFinAccountTransId()
	 * @see #getPayment()
	 * @generated
	 */
	EReference getPayment_FinAccountTransId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.Payment#getOverrideGlAccountId <em>Override Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Override Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Payment#getOverrideGlAccountId()
	 * @see #getPayment()
	 * @generated
	 */
	EReference getPayment_OverrideGlAccountId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.Payment#getPartyIdFrom <em>Party Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id From</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Payment#getPartyIdFrom()
	 * @see #getPayment()
	 * @generated
	 */
	EReference getPayment_PartyIdFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.Payment#getPartyIdTo <em>Party Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id To</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Payment#getPartyIdTo()
	 * @see #getPayment()
	 * @generated
	 */
	EReference getPayment_PartyIdTo();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.payment.Payment#getPaymentAttributes <em>Payment Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Payment Attributes</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Payment#getPaymentAttributes()
	 * @see #getPayment()
	 * @generated
	 */
	EReference getPayment_PaymentAttributes();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.Payment#getPaymentGatewayResponseId <em>Payment Gateway Response Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Gateway Response Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Payment#getPaymentGatewayResponseId()
	 * @see #getPayment()
	 * @generated
	 */
	EReference getPayment_PaymentGatewayResponseId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.Payment#getPaymentMethodId <em>Payment Method Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Method Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Payment#getPaymentMethodId()
	 * @see #getPayment()
	 * @generated
	 */
	EReference getPayment_PaymentMethodId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.Payment#getPaymentMethodTypeId <em>Payment Method Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Method Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Payment#getPaymentMethodTypeId()
	 * @see #getPayment()
	 * @generated
	 */
	EReference getPayment_PaymentMethodTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.Payment#getPaymentPreferenceId <em>Payment Preference Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Preference Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Payment#getPaymentPreferenceId()
	 * @see #getPayment()
	 * @generated
	 */
	EReference getPayment_PaymentPreferenceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.Payment#getPaymentRefNum <em>Payment Ref Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Ref Num</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Payment#getPaymentRefNum()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_PaymentRefNum();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.Payment#getPaymentTypeId <em>Payment Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Payment#getPaymentTypeId()
	 * @see #getPayment()
	 * @generated
	 */
	EReference getPayment_PaymentTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.Payment#getRoleTypeIdTo <em>Role Type Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id To</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Payment#getRoleTypeIdTo()
	 * @see #getPayment()
	 * @generated
	 */
	EReference getPayment_RoleTypeIdTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.Payment#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.Payment#getStatusId()
	 * @see #getPayment()
	 * @generated
	 */
	EReference getPayment_StatusId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentApplication
	 * @generated
	 */
	EClass getPaymentApplication();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getPaymentApplicationId <em>Payment Application Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Application Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentApplication#getPaymentApplicationId()
	 * @see #getPaymentApplication()
	 * @generated
	 */
	EAttribute getPaymentApplication_PaymentApplicationId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getAmountApplied <em>Amount Applied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Applied</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentApplication#getAmountApplied()
	 * @see #getPaymentApplication()
	 * @generated
	 */
	EAttribute getPaymentApplication_AmountApplied();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getBillingAccountId <em>Billing Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Billing Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentApplication#getBillingAccountId()
	 * @see #getPaymentApplication()
	 * @generated
	 */
	EReference getPaymentApplication_BillingAccountId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getInvoiceId <em>Invoice Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentApplication#getInvoiceId()
	 * @see #getPaymentApplication()
	 * @generated
	 */
	EReference getPaymentApplication_InvoiceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentApplication#getInvoiceItemSeqId()
	 * @see #getPaymentApplication()
	 * @generated
	 */
	EAttribute getPaymentApplication_InvoiceItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getOverrideGlAccountId <em>Override Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Override Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentApplication#getOverrideGlAccountId()
	 * @see #getPaymentApplication()
	 * @generated
	 */
	EReference getPaymentApplication_OverrideGlAccountId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getPaymentId <em>Payment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentApplication#getPaymentId()
	 * @see #getPaymentApplication()
	 * @generated
	 */
	EReference getPaymentApplication_PaymentId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tax Auth Geo Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentApplication#getTaxAuthGeoId()
	 * @see #getPaymentApplication()
	 * @generated
	 */
	EReference getPaymentApplication_TaxAuthGeoId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentApplication#getToPaymentId <em>To Payment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Payment Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentApplication#getToPaymentId()
	 * @see #getPaymentApplication()
	 * @generated
	 */
	EReference getPaymentApplication_ToPaymentId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentAttribute
	 * @generated
	 */
	EClass getPaymentAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentAttribute#getPaymentId <em>Payment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentAttribute#getPaymentId()
	 * @see #getPaymentAttribute()
	 * @generated
	 */
	EReference getPaymentAttribute_PaymentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentAttribute#getAttrName()
	 * @see #getPaymentAttribute()
	 * @generated
	 */
	EAttribute getPaymentAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentAttribute#getAttrDescription()
	 * @see #getPaymentAttribute()
	 * @generated
	 */
	EAttribute getPaymentAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentAttribute#getAttrValue()
	 * @see #getPaymentAttribute()
	 * @generated
	 */
	EAttribute getPaymentAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentBudgetAllocation <em>Budget Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Budget Allocation</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentBudgetAllocation
	 * @generated
	 */
	EClass getPaymentBudgetAllocation();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentBudgetAllocation#getBudgetId <em>Budget Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Budget Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentBudgetAllocation#getBudgetId()
	 * @see #getPaymentBudgetAllocation()
	 * @generated
	 */
	EReference getPaymentBudgetAllocation_BudgetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentBudgetAllocation#getBudgetItemSeqId <em>Budget Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentBudgetAllocation#getBudgetItemSeqId()
	 * @see #getPaymentBudgetAllocation()
	 * @generated
	 */
	EAttribute getPaymentBudgetAllocation_BudgetItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentBudgetAllocation#getPaymentId <em>Payment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentBudgetAllocation#getPaymentId()
	 * @see #getPaymentBudgetAllocation()
	 * @generated
	 */
	EReference getPaymentBudgetAllocation_PaymentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentBudgetAllocation#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentBudgetAllocation#getAmount()
	 * @see #getPaymentBudgetAllocation()
	 * @generated
	 */
	EAttribute getPaymentBudgetAllocation_Amount();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentContent
	 * @generated
	 */
	EClass getPaymentContent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentContent#getContentId <em>Content Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentContent#getContentId()
	 * @see #getPaymentContent()
	 * @generated
	 */
	EReference getPaymentContent_ContentId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentContent#getPaymentId <em>Payment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentContent#getPaymentId()
	 * @see #getPaymentContent()
	 * @generated
	 */
	EReference getPaymentContent_PaymentId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentContent#getPaymentContentTypeId <em>Payment Content Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Content Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentContent#getPaymentContentTypeId()
	 * @see #getPaymentContent()
	 * @generated
	 */
	EReference getPaymentContent_PaymentContentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentContent#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentContent#getFromDate()
	 * @see #getPaymentContent()
	 * @generated
	 */
	EAttribute getPaymentContent_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentContent#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentContent#getThruDate()
	 * @see #getPaymentContent()
	 * @generated
	 */
	EAttribute getPaymentContent_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentContentType
	 * @generated
	 */
	EClass getPaymentContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentContentType#getPaymentContentTypeId <em>Payment Content Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Content Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentContentType#getPaymentContentTypeId()
	 * @see #getPaymentContentType()
	 * @generated
	 */
	EAttribute getPaymentContentType_PaymentContentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentContentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentContentType#getDescription()
	 * @see #getPaymentContentType()
	 * @generated
	 */
	EAttribute getPaymentContentType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentContentType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentContentType#isHasTable()
	 * @see #getPaymentContentType()
	 * @generated
	 */
	EAttribute getPaymentContentType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentContentType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentContentType#getParentTypeId()
	 * @see #getPaymentContentType()
	 * @generated
	 */
	EReference getPaymentContentType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet <em>Gateway Authorize Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway Authorize Net</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet
	 * @generated
	 */
	EClass getPaymentGatewayAuthorizeNet();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Gateway Config Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getPaymentGatewayConfigId()
	 * @see #getPaymentGatewayAuthorizeNet()
	 * @generated
	 */
	EAttribute getPaymentGatewayAuthorizeNet_PaymentGatewayConfigId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getApiVersion <em>Api Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Version</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getApiVersion()
	 * @see #getPaymentGatewayAuthorizeNet()
	 * @generated
	 */
	EAttribute getPaymentGatewayAuthorizeNet_ApiVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getCertificateAlias <em>Certificate Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate Alias</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getCertificateAlias()
	 * @see #getPaymentGatewayAuthorizeNet()
	 * @generated
	 */
	EAttribute getPaymentGatewayAuthorizeNet_CertificateAlias();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getCpDeviceType <em>Cp Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cp Device Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getCpDeviceType()
	 * @see #getPaymentGatewayAuthorizeNet()
	 * @generated
	 */
	EAttribute getPaymentGatewayAuthorizeNet_CpDeviceType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getCpMarketType <em>Cp Market Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cp Market Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getCpMarketType()
	 * @see #getPaymentGatewayAuthorizeNet()
	 * @generated
	 */
	EAttribute getPaymentGatewayAuthorizeNet_CpMarketType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getCpVersion <em>Cp Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cp Version</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getCpVersion()
	 * @see #getPaymentGatewayAuthorizeNet()
	 * @generated
	 */
	EAttribute getPaymentGatewayAuthorizeNet_CpVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getDelimitedData <em>Delimited Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delimited Data</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getDelimitedData()
	 * @see #getPaymentGatewayAuthorizeNet()
	 * @generated
	 */
	EAttribute getPaymentGatewayAuthorizeNet_DelimitedData();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getDelimiterChar <em>Delimiter Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delimiter Char</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getDelimiterChar()
	 * @see #getPaymentGatewayAuthorizeNet()
	 * @generated
	 */
	EAttribute getPaymentGatewayAuthorizeNet_DelimiterChar();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getDuplicateWindow <em>Duplicate Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duplicate Window</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getDuplicateWindow()
	 * @see #getPaymentGatewayAuthorizeNet()
	 * @generated
	 */
	EAttribute getPaymentGatewayAuthorizeNet_DuplicateWindow();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getEmailCustomer <em>Email Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Customer</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getEmailCustomer()
	 * @see #getPaymentGatewayAuthorizeNet()
	 * @generated
	 */
	EAttribute getPaymentGatewayAuthorizeNet_EmailCustomer();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getEmailMerchant <em>Email Merchant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Merchant</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getEmailMerchant()
	 * @see #getPaymentGatewayAuthorizeNet()
	 * @generated
	 */
	EAttribute getPaymentGatewayAuthorizeNet_EmailMerchant();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getMethod()
	 * @see #getPaymentGatewayAuthorizeNet()
	 * @generated
	 */
	EAttribute getPaymentGatewayAuthorizeNet_Method();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getPwd <em>Pwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pwd</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getPwd()
	 * @see #getPaymentGatewayAuthorizeNet()
	 * @generated
	 */
	EAttribute getPaymentGatewayAuthorizeNet_Pwd();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getRelayResponse <em>Relay Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relay Response</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getRelayResponse()
	 * @see #getPaymentGatewayAuthorizeNet()
	 * @generated
	 */
	EAttribute getPaymentGatewayAuthorizeNet_RelayResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getTestMode <em>Test Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Mode</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getTestMode()
	 * @see #getPaymentGatewayAuthorizeNet()
	 * @generated
	 */
	EAttribute getPaymentGatewayAuthorizeNet_TestMode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getTranKey <em>Tran Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tran Key</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getTranKey()
	 * @see #getPaymentGatewayAuthorizeNet()
	 * @generated
	 */
	EAttribute getPaymentGatewayAuthorizeNet_TranKey();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getTransDescription <em>Trans Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trans Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getTransDescription()
	 * @see #getPaymentGatewayAuthorizeNet()
	 * @generated
	 */
	EAttribute getPaymentGatewayAuthorizeNet_TransDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getTransactionUrl <em>Transaction Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Url</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getTransactionUrl()
	 * @see #getPaymentGatewayAuthorizeNet()
	 * @generated
	 */
	EAttribute getPaymentGatewayAuthorizeNet_TransactionUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getUserId()
	 * @see #getPaymentGatewayAuthorizeNet()
	 * @generated
	 */
	EAttribute getPaymentGatewayAuthorizeNet_UserId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce <em>Gateway Clear Commerce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway Clear Commerce</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce
	 * @generated
	 */
	EClass getPaymentGatewayClearCommerce();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Gateway Config Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce#getPaymentGatewayConfigId()
	 * @see #getPaymentGatewayClearCommerce()
	 * @generated
	 */
	EAttribute getPaymentGatewayClearCommerce_PaymentGatewayConfigId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce#getClientId <em>Client Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce#getClientId()
	 * @see #getPaymentGatewayClearCommerce()
	 * @generated
	 */
	EAttribute getPaymentGatewayClearCommerce_ClientId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce#getEffectiveAlias <em>Effective Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effective Alias</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce#getEffectiveAlias()
	 * @see #getPaymentGatewayClearCommerce()
	 * @generated
	 */
	EAttribute getPaymentGatewayClearCommerce_EffectiveAlias();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce#isEnableCVM <em>Enable CVM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable CVM</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce#isEnableCVM()
	 * @see #getPaymentGatewayClearCommerce()
	 * @generated
	 */
	EAttribute getPaymentGatewayClearCommerce_EnableCVM();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce#getGroupId()
	 * @see #getPaymentGatewayClearCommerce()
	 * @generated
	 */
	EAttribute getPaymentGatewayClearCommerce_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce#getProcessMode <em>Process Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Mode</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce#getProcessMode()
	 * @see #getPaymentGatewayClearCommerce()
	 * @generated
	 */
	EAttribute getPaymentGatewayClearCommerce_ProcessMode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce#getPwd <em>Pwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pwd</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce#getPwd()
	 * @see #getPaymentGatewayClearCommerce()
	 * @generated
	 */
	EAttribute getPaymentGatewayClearCommerce_Pwd();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce#getServerURL <em>Server URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server URL</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce#getServerURL()
	 * @see #getPaymentGatewayClearCommerce()
	 * @generated
	 */
	EAttribute getPaymentGatewayClearCommerce_ServerURL();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce#getSourceId <em>Source Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce#getSourceId()
	 * @see #getPaymentGatewayClearCommerce()
	 * @generated
	 */
	EAttribute getPaymentGatewayClearCommerce_SourceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce#getUserAlias <em>User Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Alias</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce#getUserAlias()
	 * @see #getPaymentGatewayClearCommerce()
	 * @generated
	 */
	EAttribute getPaymentGatewayClearCommerce_UserAlias();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayClearCommerce#getUsername()
	 * @see #getPaymentGatewayClearCommerce()
	 * @generated
	 */
	EAttribute getPaymentGatewayClearCommerce_Username();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfig <em>Gateway Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway Config</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfig
	 * @generated
	 */
	EClass getPaymentGatewayConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfig#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Gateway Config Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfig#getPaymentGatewayConfigId()
	 * @see #getPaymentGatewayConfig()
	 * @generated
	 */
	EAttribute getPaymentGatewayConfig_PaymentGatewayConfigId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfig#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfig#getDescription()
	 * @see #getPaymentGatewayConfig()
	 * @generated
	 */
	EAttribute getPaymentGatewayConfig_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfig#getPaymentGatewayConfigTypeId <em>Payment Gateway Config Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Gateway Config Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfig#getPaymentGatewayConfigTypeId()
	 * @see #getPaymentGatewayConfig()
	 * @generated
	 */
	EReference getPaymentGatewayConfig_PaymentGatewayConfigTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfigType <em>Gateway Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway Config Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfigType
	 * @generated
	 */
	EClass getPaymentGatewayConfigType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfigType#getPaymentGatewayConfigTypeId <em>Payment Gateway Config Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Gateway Config Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfigType#getPaymentGatewayConfigTypeId()
	 * @see #getPaymentGatewayConfigType()
	 * @generated
	 */
	EAttribute getPaymentGatewayConfigType_PaymentGatewayConfigTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfigType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfigType#getDescription()
	 * @see #getPaymentGatewayConfigType()
	 * @generated
	 */
	EAttribute getPaymentGatewayConfigType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfigType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfigType#isHasTable()
	 * @see #getPaymentGatewayConfigType()
	 * @generated
	 */
	EAttribute getPaymentGatewayConfigType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfigType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfigType#getParentTypeId()
	 * @see #getPaymentGatewayConfigType()
	 * @generated
	 */
	EReference getPaymentGatewayConfigType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource <em>Gateway Cyber Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway Cyber Source</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource
	 * @generated
	 */
	EClass getPaymentGatewayCyberSource();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Gateway Config Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getPaymentGatewayConfigId()
	 * @see #getPaymentGatewayCyberSource()
	 * @generated
	 */
	EAttribute getPaymentGatewayCyberSource_PaymentGatewayConfigId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getApiVersion <em>Api Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Version</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getApiVersion()
	 * @see #getPaymentGatewayCyberSource()
	 * @generated
	 */
	EAttribute getPaymentGatewayCyberSource_ApiVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getAutoBill <em>Auto Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Bill</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getAutoBill()
	 * @see #getPaymentGatewayCyberSource()
	 * @generated
	 */
	EAttribute getPaymentGatewayCyberSource_AutoBill();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getAvsDeclineCodes <em>Avs Decline Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avs Decline Codes</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getAvsDeclineCodes()
	 * @see #getPaymentGatewayCyberSource()
	 * @generated
	 */
	EAttribute getPaymentGatewayCyberSource_AvsDeclineCodes();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#isDisableBillAvs <em>Disable Bill Avs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disable Bill Avs</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#isDisableBillAvs()
	 * @see #getPaymentGatewayCyberSource()
	 * @generated
	 */
	EAttribute getPaymentGatewayCyberSource_DisableBillAvs();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#isEnableDav <em>Enable Dav</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Dav</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#isEnableDav()
	 * @see #getPaymentGatewayCyberSource()
	 * @generated
	 */
	EAttribute getPaymentGatewayCyberSource_EnableDav();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#isFraudScore <em>Fraud Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fraud Score</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#isFraudScore()
	 * @see #getPaymentGatewayCyberSource()
	 * @generated
	 */
	EAttribute getPaymentGatewayCyberSource_FraudScore();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getIgnoreAvs <em>Ignore Avs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Avs</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getIgnoreAvs()
	 * @see #getPaymentGatewayCyberSource()
	 * @generated
	 */
	EAttribute getPaymentGatewayCyberSource_IgnoreAvs();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getKeysDir <em>Keys Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keys Dir</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getKeysDir()
	 * @see #getPaymentGatewayCyberSource()
	 * @generated
	 */
	EAttribute getPaymentGatewayCyberSource_KeysDir();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getKeysFile <em>Keys File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keys File</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getKeysFile()
	 * @see #getPaymentGatewayCyberSource()
	 * @generated
	 */
	EAttribute getPaymentGatewayCyberSource_KeysFile();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getLogDir <em>Log Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Dir</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getLogDir()
	 * @see #getPaymentGatewayCyberSource()
	 * @generated
	 */
	EAttribute getPaymentGatewayCyberSource_LogDir();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getLogEnabled <em>Log Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Enabled</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getLogEnabled()
	 * @see #getPaymentGatewayCyberSource()
	 * @generated
	 */
	EAttribute getPaymentGatewayCyberSource_LogEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getLogFile <em>Log File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log File</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getLogFile()
	 * @see #getPaymentGatewayCyberSource()
	 * @generated
	 */
	EAttribute getPaymentGatewayCyberSource_LogFile();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getLogSize <em>Log Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Size</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getLogSize()
	 * @see #getPaymentGatewayCyberSource()
	 * @generated
	 */
	EAttribute getPaymentGatewayCyberSource_LogSize();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getMerchantContact <em>Merchant Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merchant Contact</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getMerchantContact()
	 * @see #getPaymentGatewayCyberSource()
	 * @generated
	 */
	EAttribute getPaymentGatewayCyberSource_MerchantContact();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getMerchantDescr <em>Merchant Descr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merchant Descr</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getMerchantDescr()
	 * @see #getPaymentGatewayCyberSource()
	 * @generated
	 */
	EAttribute getPaymentGatewayCyberSource_MerchantDescr();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getMerchantId <em>Merchant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merchant Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getMerchantId()
	 * @see #getPaymentGatewayCyberSource()
	 * @generated
	 */
	EAttribute getPaymentGatewayCyberSource_MerchantId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getProduction <em>Production</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Production</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getProduction()
	 * @see #getPaymentGatewayCyberSource()
	 * @generated
	 */
	EAttribute getPaymentGatewayCyberSource_Production();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayEway <em>Gateway Eway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway Eway</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayEway
	 * @generated
	 */
	EClass getPaymentGatewayEway();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayEway#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Gateway Config Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayEway#getPaymentGatewayConfigId()
	 * @see #getPaymentGatewayEway()
	 * @generated
	 */
	EAttribute getPaymentGatewayEway_PaymentGatewayConfigId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayEway#getCustomerId <em>Customer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayEway#getCustomerId()
	 * @see #getPaymentGatewayEway()
	 * @generated
	 */
	EAttribute getPaymentGatewayEway_CustomerId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayEway#getEnableBeagle <em>Enable Beagle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Beagle</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayEway#getEnableBeagle()
	 * @see #getPaymentGatewayEway()
	 * @generated
	 */
	EAttribute getPaymentGatewayEway_EnableBeagle();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayEway#getEnableCvn <em>Enable Cvn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Cvn</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayEway#getEnableCvn()
	 * @see #getPaymentGatewayEway()
	 * @generated
	 */
	EAttribute getPaymentGatewayEway_EnableCvn();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayEway#getRefundPwd <em>Refund Pwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refund Pwd</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayEway#getRefundPwd()
	 * @see #getPaymentGatewayEway()
	 * @generated
	 */
	EAttribute getPaymentGatewayEway_RefundPwd();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayEway#getTestMode <em>Test Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Mode</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayEway#getTestMode()
	 * @see #getPaymentGatewayEway()
	 * @generated
	 */
	EAttribute getPaymentGatewayEway_TestMode();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital <em>Gateway Orbital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway Orbital</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital
	 * @generated
	 */
	EClass getPaymentGatewayOrbital();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Gateway Config Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getPaymentGatewayConfigId()
	 * @see #getPaymentGatewayOrbital()
	 * @generated
	 */
	EAttribute getPaymentGatewayOrbital_PaymentGatewayConfigId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getAuthorizationURI <em>Authorization URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization URI</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getAuthorizationURI()
	 * @see #getPaymentGatewayOrbital()
	 * @generated
	 */
	EAttribute getPaymentGatewayOrbital_AuthorizationURI();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getConnectionPassword <em>Connection Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Password</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getConnectionPassword()
	 * @see #getPaymentGatewayOrbital()
	 * @generated
	 */
	EAttribute getPaymentGatewayOrbital_ConnectionPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getConnectionTimeoutSeconds <em>Connection Timeout Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Timeout Seconds</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getConnectionTimeoutSeconds()
	 * @see #getPaymentGatewayOrbital()
	 * @generated
	 */
	EAttribute getPaymentGatewayOrbital_ConnectionTimeoutSeconds();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getEngineClass <em>Engine Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine Class</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getEngineClass()
	 * @see #getPaymentGatewayOrbital()
	 * @generated
	 */
	EAttribute getPaymentGatewayOrbital_EngineClass();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getHostName <em>Host Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getHostName()
	 * @see #getPaymentGatewayOrbital()
	 * @generated
	 */
	EAttribute getPaymentGatewayOrbital_HostName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getHostNameFailover <em>Host Name Failover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Name Failover</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getHostNameFailover()
	 * @see #getPaymentGatewayOrbital()
	 * @generated
	 */
	EAttribute getPaymentGatewayOrbital_HostNameFailover();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getMerchantId <em>Merchant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merchant Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getMerchantId()
	 * @see #getPaymentGatewayOrbital()
	 * @generated
	 */
	EAttribute getPaymentGatewayOrbital_MerchantId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getPort()
	 * @see #getPaymentGatewayOrbital()
	 * @generated
	 */
	EAttribute getPaymentGatewayOrbital_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getPortFailover <em>Port Failover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Failover</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getPortFailover()
	 * @see #getPaymentGatewayOrbital()
	 * @generated
	 */
	EAttribute getPaymentGatewayOrbital_PortFailover();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getReadTimeoutSeconds <em>Read Timeout Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Timeout Seconds</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getReadTimeoutSeconds()
	 * @see #getPaymentGatewayOrbital()
	 * @generated
	 */
	EAttribute getPaymentGatewayOrbital_ReadTimeoutSeconds();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getResponseType <em>Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getResponseType()
	 * @see #getPaymentGatewayOrbital()
	 * @generated
	 */
	EAttribute getPaymentGatewayOrbital_ResponseType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getSdkVersion <em>Sdk Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sdk Version</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getSdkVersion()
	 * @see #getPaymentGatewayOrbital()
	 * @generated
	 */
	EAttribute getPaymentGatewayOrbital_SdkVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getSslSocketFactory <em>Ssl Socket Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssl Socket Factory</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getSslSocketFactory()
	 * @see #getPaymentGatewayOrbital()
	 * @generated
	 */
	EAttribute getPaymentGatewayOrbital_SslSocketFactory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getUsername()
	 * @see #getPaymentGatewayOrbital()
	 * @generated
	 */
	EAttribute getPaymentGatewayOrbital_Username();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal <em>Gateway Pay Pal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway Pay Pal</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal
	 * @generated
	 */
	EClass getPaymentGatewayPayPal();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Gateway Config Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getPaymentGatewayConfigId()
	 * @see #getPaymentGatewayPayPal()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayPal_PaymentGatewayConfigId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getApiEnvironment <em>Api Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Environment</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getApiEnvironment()
	 * @see #getPaymentGatewayPayPal()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayPal_ApiEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getApiPassword <em>Api Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Password</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getApiPassword()
	 * @see #getPaymentGatewayPayPal()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayPal_ApiPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getApiSignature <em>Api Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api Signature</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getApiSignature()
	 * @see #getPaymentGatewayPayPal()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayPal_ApiSignature();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getApiUserName <em>Api User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api User Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getApiUserName()
	 * @see #getPaymentGatewayPayPal()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayPal_ApiUserName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getBusinessEmail <em>Business Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Business Email</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getBusinessEmail()
	 * @see #getPaymentGatewayPayPal()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayPal_BusinessEmail();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getCancelReturnUrl <em>Cancel Return Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Return Url</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getCancelReturnUrl()
	 * @see #getPaymentGatewayPayPal()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayPal_CancelReturnUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getConfirmTemplate <em>Confirm Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm Template</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getConfirmTemplate()
	 * @see #getPaymentGatewayPayPal()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayPal_ConfirmTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getConfirmUrl <em>Confirm Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirm Url</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getConfirmUrl()
	 * @see #getPaymentGatewayPayPal()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayPal_ConfirmUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getImageUrl <em>Image Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Url</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getImageUrl()
	 * @see #getPaymentGatewayPayPal()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayPal_ImageUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getNotifyUrl <em>Notify Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notify Url</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getNotifyUrl()
	 * @see #getPaymentGatewayPayPal()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayPal_NotifyUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getRedirectUrl <em>Redirect Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Redirect Url</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getRedirectUrl()
	 * @see #getPaymentGatewayPayPal()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayPal_RedirectUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#isRequireConfirmedShipping <em>Require Confirmed Shipping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Require Confirmed Shipping</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#isRequireConfirmedShipping()
	 * @see #getPaymentGatewayPayPal()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayPal_RequireConfirmedShipping();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getReturnUrl <em>Return Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Url</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getReturnUrl()
	 * @see #getPaymentGatewayPayPal()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayPal_ReturnUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getShippingCallbackUrl <em>Shipping Callback Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipping Callback Url</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal#getShippingCallbackUrl()
	 * @see #getPaymentGatewayPayPal()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayPal_ShippingCallbackUrl();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro <em>Gateway Payflow Pro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway Payflow Pro</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro
	 * @generated
	 */
	EClass getPaymentGatewayPayflowPro();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Gateway Config Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getPaymentGatewayConfigId()
	 * @see #getPaymentGatewayPayflowPro()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayflowPro_PaymentGatewayConfigId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getCancelReturnUrl <em>Cancel Return Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Return Url</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getCancelReturnUrl()
	 * @see #getPaymentGatewayPayflowPro()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayflowPro_CancelReturnUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getCertsPath <em>Certs Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certs Path</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getCertsPath()
	 * @see #getPaymentGatewayPayflowPro()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayflowPro_CertsPath();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#isCheckAvs <em>Check Avs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Avs</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#isCheckAvs()
	 * @see #getPaymentGatewayPayflowPro()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayflowPro_CheckAvs();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#isCheckCvv2 <em>Check Cvv2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Cvv2</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#isCheckCvv2()
	 * @see #getPaymentGatewayPayflowPro()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayflowPro_CheckCvv2();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getEnableTransmit <em>Enable Transmit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Transmit</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getEnableTransmit()
	 * @see #getPaymentGatewayPayflowPro()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayflowPro_EnableTransmit();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getHostAddress <em>Host Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Address</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getHostAddress()
	 * @see #getPaymentGatewayPayflowPro()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayflowPro_HostAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getHostPort <em>Host Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Port</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getHostPort()
	 * @see #getPaymentGatewayPayflowPro()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayflowPro_HostPort();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getLogFileName <em>Log File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log File Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getLogFileName()
	 * @see #getPaymentGatewayPayflowPro()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayflowPro_LogFileName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getLoggingLevel <em>Logging Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logging Level</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getLoggingLevel()
	 * @see #getPaymentGatewayPayflowPro()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayflowPro_LoggingLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getMaxLogFileSize <em>Max Log File Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Log File Size</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getMaxLogFileSize()
	 * @see #getPaymentGatewayPayflowPro()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayflowPro_MaxLogFileSize();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getPartner <em>Partner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partner</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getPartner()
	 * @see #getPaymentGatewayPayflowPro()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayflowPro_Partner();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#isPreAuth <em>Pre Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre Auth</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#isPreAuth()
	 * @see #getPaymentGatewayPayflowPro()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayflowPro_PreAuth();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getProxyAddress <em>Proxy Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy Address</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getProxyAddress()
	 * @see #getPaymentGatewayPayflowPro()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayflowPro_ProxyAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getProxyLogon <em>Proxy Logon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy Logon</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getProxyLogon()
	 * @see #getPaymentGatewayPayflowPro()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayflowPro_ProxyLogon();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getProxyPassword <em>Proxy Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy Password</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getProxyPassword()
	 * @see #getPaymentGatewayPayflowPro()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayflowPro_ProxyPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getProxyPort <em>Proxy Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy Port</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getProxyPort()
	 * @see #getPaymentGatewayPayflowPro()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayflowPro_ProxyPort();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getPwd <em>Pwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pwd</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getPwd()
	 * @see #getPaymentGatewayPayflowPro()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayflowPro_Pwd();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getRedirectUrl <em>Redirect Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Redirect Url</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getRedirectUrl()
	 * @see #getPaymentGatewayPayflowPro()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayflowPro_RedirectUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getReturnUrl <em>Return Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Url</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getReturnUrl()
	 * @see #getPaymentGatewayPayflowPro()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayflowPro_ReturnUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#isStackTraceOn <em>Stack Trace On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack Trace On</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#isStackTraceOn()
	 * @see #getPaymentGatewayPayflowPro()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayflowPro_StackTraceOn();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getTimeout()
	 * @see #getPaymentGatewayPayflowPro()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayflowPro_Timeout();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getUserId()
	 * @see #getPaymentGatewayPayflowPro()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayflowPro_UserId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getVendor()
	 * @see #getPaymentGatewayPayflowPro()
	 * @generated
	 */
	EAttribute getPaymentGatewayPayflowPro_Vendor();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayRespMsg <em>Gateway Resp Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway Resp Msg</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayRespMsg
	 * @generated
	 */
	EClass getPaymentGatewayRespMsg();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayRespMsg#getPaymentGatewayRespMsgId <em>Payment Gateway Resp Msg Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Gateway Resp Msg Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayRespMsg#getPaymentGatewayRespMsgId()
	 * @see #getPaymentGatewayRespMsg()
	 * @generated
	 */
	EAttribute getPaymentGatewayRespMsg_PaymentGatewayRespMsgId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayRespMsg#getPaymentGatewayResponseId <em>Payment Gateway Response Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Gateway Response Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayRespMsg#getPaymentGatewayResponseId()
	 * @see #getPaymentGatewayRespMsg()
	 * @generated
	 */
	EReference getPaymentGatewayRespMsg_PaymentGatewayResponseId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayRespMsg#getPgrMessage <em>Pgr Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pgr Message</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayRespMsg#getPgrMessage()
	 * @see #getPaymentGatewayRespMsg()
	 * @generated
	 */
	EAttribute getPaymentGatewayRespMsg_PgrMessage();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse <em>Gateway Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway Response</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse
	 * @generated
	 */
	EClass getPaymentGatewayResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getPaymentGatewayResponseId <em>Payment Gateway Response Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Gateway Response Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getPaymentGatewayResponseId()
	 * @see #getPaymentGatewayResponse()
	 * @generated
	 */
	EAttribute getPaymentGatewayResponse_PaymentGatewayResponseId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getAltReference <em>Alt Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt Reference</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getAltReference()
	 * @see #getPaymentGatewayResponse()
	 * @generated
	 */
	EAttribute getPaymentGatewayResponse_AltReference();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getAmount()
	 * @see #getPaymentGatewayResponse()
	 * @generated
	 */
	EAttribute getPaymentGatewayResponse_Amount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getCurrencyUomId <em>Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getCurrencyUomId()
	 * @see #getPaymentGatewayResponse()
	 * @generated
	 */
	EReference getPaymentGatewayResponse_CurrencyUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getGatewayAvsResult <em>Gateway Avs Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway Avs Result</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getGatewayAvsResult()
	 * @see #getPaymentGatewayResponse()
	 * @generated
	 */
	EAttribute getPaymentGatewayResponse_GatewayAvsResult();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getGatewayCode <em>Gateway Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway Code</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getGatewayCode()
	 * @see #getPaymentGatewayResponse()
	 * @generated
	 */
	EAttribute getPaymentGatewayResponse_GatewayCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getGatewayCvResult <em>Gateway Cv Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway Cv Result</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getGatewayCvResult()
	 * @see #getPaymentGatewayResponse()
	 * @generated
	 */
	EAttribute getPaymentGatewayResponse_GatewayCvResult();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getGatewayFlag <em>Gateway Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway Flag</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getGatewayFlag()
	 * @see #getPaymentGatewayResponse()
	 * @generated
	 */
	EAttribute getPaymentGatewayResponse_GatewayFlag();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getGatewayMessage <em>Gateway Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway Message</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getGatewayMessage()
	 * @see #getPaymentGatewayResponse()
	 * @generated
	 */
	EAttribute getPaymentGatewayResponse_GatewayMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getGatewayScoreResult <em>Gateway Score Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway Score Result</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getGatewayScoreResult()
	 * @see #getPaymentGatewayResponse()
	 * @generated
	 */
	EAttribute getPaymentGatewayResponse_GatewayScoreResult();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getOrderPaymentPreferenceId <em>Order Payment Preference Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Payment Preference Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getOrderPaymentPreferenceId()
	 * @see #getPaymentGatewayResponse()
	 * @generated
	 */
	EReference getPaymentGatewayResponse_OrderPaymentPreferenceId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getPaymentMethodId <em>Payment Method Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Method Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getPaymentMethodId()
	 * @see #getPaymentGatewayResponse()
	 * @generated
	 */
	EReference getPaymentGatewayResponse_PaymentMethodId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getPaymentMethodTypeId <em>Payment Method Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Method Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getPaymentMethodTypeId()
	 * @see #getPaymentGatewayResponse()
	 * @generated
	 */
	EReference getPaymentGatewayResponse_PaymentMethodTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getPaymentServiceTypeEnumId <em>Payment Service Type Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Service Type Enum Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getPaymentServiceTypeEnumId()
	 * @see #getPaymentGatewayResponse()
	 * @generated
	 */
	EReference getPaymentGatewayResponse_PaymentServiceTypeEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getReferenceNum <em>Reference Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Num</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getReferenceNum()
	 * @see #getPaymentGatewayResponse()
	 * @generated
	 */
	EAttribute getPaymentGatewayResponse_ReferenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#isResultBadCardNumber <em>Result Bad Card Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Bad Card Number</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#isResultBadCardNumber()
	 * @see #getPaymentGatewayResponse()
	 * @generated
	 */
	EAttribute getPaymentGatewayResponse_ResultBadCardNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#isResultBadExpire <em>Result Bad Expire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Bad Expire</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#isResultBadExpire()
	 * @see #getPaymentGatewayResponse()
	 * @generated
	 */
	EAttribute getPaymentGatewayResponse_ResultBadExpire();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#isResultDeclined <em>Result Declined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Declined</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#isResultDeclined()
	 * @see #getPaymentGatewayResponse()
	 * @generated
	 */
	EAttribute getPaymentGatewayResponse_ResultDeclined();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#isResultNsf <em>Result Nsf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Nsf</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#isResultNsf()
	 * @see #getPaymentGatewayResponse()
	 * @generated
	 */
	EAttribute getPaymentGatewayResponse_ResultNsf();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getSubReference <em>Sub Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Reference</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getSubReference()
	 * @see #getPaymentGatewayResponse()
	 * @generated
	 */
	EAttribute getPaymentGatewayResponse_SubReference();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getTransCodeEnumId <em>Trans Code Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trans Code Enum Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getTransCodeEnumId()
	 * @see #getPaymentGatewayResponse()
	 * @generated
	 */
	EReference getPaymentGatewayResponse_TransCodeEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getTransactionDate <em>Transaction Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayResponse#getTransactionDate()
	 * @see #getPaymentGatewayResponse()
	 * @generated
	 */
	EAttribute getPaymentGatewayResponse_TransactionDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay <em>Gateway Sage Pay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway Sage Pay</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay
	 * @generated
	 */
	EClass getPaymentGatewaySagePay();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Gateway Config Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getPaymentGatewayConfigId()
	 * @see #getPaymentGatewaySagePay()
	 * @generated
	 */
	EAttribute getPaymentGatewaySagePay_PaymentGatewayConfigId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getAuthenticationTransType <em>Authentication Trans Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authentication Trans Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getAuthenticationTransType()
	 * @see #getPaymentGatewaySagePay()
	 * @generated
	 */
	EAttribute getPaymentGatewaySagePay_AuthenticationTransType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getAuthenticationUrl <em>Authentication Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authentication Url</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getAuthenticationUrl()
	 * @see #getPaymentGatewaySagePay()
	 * @generated
	 */
	EAttribute getPaymentGatewaySagePay_AuthenticationUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getAuthoriseTransType <em>Authorise Trans Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorise Trans Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getAuthoriseTransType()
	 * @see #getPaymentGatewaySagePay()
	 * @generated
	 */
	EAttribute getPaymentGatewaySagePay_AuthoriseTransType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getAuthoriseUrl <em>Authorise Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorise Url</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getAuthoriseUrl()
	 * @see #getPaymentGatewaySagePay()
	 * @generated
	 */
	EAttribute getPaymentGatewaySagePay_AuthoriseUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getProductionHost <em>Production Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Production Host</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getProductionHost()
	 * @see #getPaymentGatewaySagePay()
	 * @generated
	 */
	EAttribute getPaymentGatewaySagePay_ProductionHost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getProtocolVersion <em>Protocol Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol Version</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getProtocolVersion()
	 * @see #getPaymentGatewaySagePay()
	 * @generated
	 */
	EAttribute getPaymentGatewaySagePay_ProtocolVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getRefundUrl <em>Refund Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refund Url</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getRefundUrl()
	 * @see #getPaymentGatewaySagePay()
	 * @generated
	 */
	EAttribute getPaymentGatewaySagePay_RefundUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getReleaseTransType <em>Release Trans Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Trans Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getReleaseTransType()
	 * @see #getPaymentGatewaySagePay()
	 * @generated
	 */
	EAttribute getPaymentGatewaySagePay_ReleaseTransType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getReleaseUrl <em>Release Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Url</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getReleaseUrl()
	 * @see #getPaymentGatewaySagePay()
	 * @generated
	 */
	EAttribute getPaymentGatewaySagePay_ReleaseUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getSagePayMode <em>Sage Pay Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sage Pay Mode</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getSagePayMode()
	 * @see #getPaymentGatewaySagePay()
	 * @generated
	 */
	EAttribute getPaymentGatewaySagePay_SagePayMode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getTestingHost <em>Testing Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Testing Host</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getTestingHost()
	 * @see #getPaymentGatewaySagePay()
	 * @generated
	 */
	EAttribute getPaymentGatewaySagePay_TestingHost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getVendor()
	 * @see #getPaymentGatewaySagePay()
	 * @generated
	 */
	EAttribute getPaymentGatewaySagePay_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getVoidUrl <em>Void Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Void Url</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getVoidUrl()
	 * @see #getPaymentGatewaySagePay()
	 * @generated
	 */
	EAttribute getPaymentGatewaySagePay_VoidUrl();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay <em>Gateway Secure Pay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway Secure Pay</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay
	 * @generated
	 */
	EClass getPaymentGatewaySecurePay();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Gateway Config Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay#getPaymentGatewayConfigId()
	 * @see #getPaymentGatewaySecurePay()
	 * @generated
	 */
	EAttribute getPaymentGatewaySecurePay_PaymentGatewayConfigId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay#isEnableAmountRound <em>Enable Amount Round</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Amount Round</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay#isEnableAmountRound()
	 * @see #getPaymentGatewaySecurePay()
	 * @generated
	 */
	EAttribute getPaymentGatewaySecurePay_EnableAmountRound();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay#getMerchantId <em>Merchant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merchant Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay#getMerchantId()
	 * @see #getPaymentGatewaySecurePay()
	 * @generated
	 */
	EAttribute getPaymentGatewaySecurePay_MerchantId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay#getProcessTimeout <em>Process Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Timeout</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay#getProcessTimeout()
	 * @see #getPaymentGatewaySecurePay()
	 * @generated
	 */
	EAttribute getPaymentGatewaySecurePay_ProcessTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay#getPwd <em>Pwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pwd</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay#getPwd()
	 * @see #getPaymentGatewaySecurePay()
	 * @generated
	 */
	EAttribute getPaymentGatewaySecurePay_Pwd();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay#getServerURL <em>Server URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server URL</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay#getServerURL()
	 * @see #getPaymentGatewaySecurePay()
	 * @generated
	 */
	EAttribute getPaymentGatewaySecurePay_ServerURL();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay <em>Gateway World Pay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway World Pay</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay
	 * @generated
	 */
	EClass getPaymentGatewayWorldPay();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Gateway Config Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#getPaymentGatewayConfigId()
	 * @see #getPaymentGatewayWorldPay()
	 * @generated
	 */
	EAttribute getPaymentGatewayWorldPay_PaymentGatewayConfigId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#getAuthMode <em>Auth Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auth Mode</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#getAuthMode()
	 * @see #getPaymentGatewayWorldPay()
	 * @generated
	 */
	EAttribute getPaymentGatewayWorldPay_AuthMode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#isFixContact <em>Fix Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fix Contact</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#isFixContact()
	 * @see #getPaymentGatewayWorldPay()
	 * @generated
	 */
	EAttribute getPaymentGatewayWorldPay_FixContact();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#isHideContact <em>Hide Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide Contact</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#isHideContact()
	 * @see #getPaymentGatewayWorldPay()
	 * @generated
	 */
	EAttribute getPaymentGatewayWorldPay_HideContact();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#isHideCurrency <em>Hide Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide Currency</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#isHideCurrency()
	 * @see #getPaymentGatewayWorldPay()
	 * @generated
	 */
	EAttribute getPaymentGatewayWorldPay_HideCurrency();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#getInstId <em>Inst Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inst Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#getInstId()
	 * @see #getPaymentGatewayWorldPay()
	 * @generated
	 */
	EAttribute getPaymentGatewayWorldPay_InstId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#getLangId <em>Lang Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#getLangId()
	 * @see #getPaymentGatewayWorldPay()
	 * @generated
	 */
	EAttribute getPaymentGatewayWorldPay_LangId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#isNoLanguageMenu <em>No Language Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Language Menu</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#isNoLanguageMenu()
	 * @see #getPaymentGatewayWorldPay()
	 * @generated
	 */
	EAttribute getPaymentGatewayWorldPay_NoLanguageMenu();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#getRedirectUrl <em>Redirect Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Redirect Url</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#getRedirectUrl()
	 * @see #getPaymentGatewayWorldPay()
	 * @generated
	 */
	EAttribute getPaymentGatewayWorldPay_RedirectUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#getTestMode <em>Test Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Mode</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#getTestMode()
	 * @see #getPaymentGatewayWorldPay()
	 * @generated
	 */
	EAttribute getPaymentGatewayWorldPay_TestMode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#isWithDelivery <em>With Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With Delivery</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#isWithDelivery()
	 * @see #getPaymentGatewayWorldPay()
	 * @generated
	 */
	EAttribute getPaymentGatewayWorldPay_WithDelivery();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentGlAccountTypeMap <em>Gl Account Type Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gl Account Type Map</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGlAccountTypeMap
	 * @generated
	 */
	EClass getPaymentGlAccountTypeMap();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentGlAccountTypeMap#getPaymentTypeId <em>Payment Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGlAccountTypeMap#getPaymentTypeId()
	 * @see #getPaymentGlAccountTypeMap()
	 * @generated
	 */
	EReference getPaymentGlAccountTypeMap_PaymentTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentGlAccountTypeMap#getOrganizationPartyId <em>Organization Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGlAccountTypeMap#getOrganizationPartyId()
	 * @see #getPaymentGlAccountTypeMap()
	 * @generated
	 */
	EReference getPaymentGlAccountTypeMap_OrganizationPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentGlAccountTypeMap#getGlAccountTypeId <em>Gl Account Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGlAccountTypeMap#getGlAccountTypeId()
	 * @see #getPaymentGlAccountTypeMap()
	 * @generated
	 */
	EReference getPaymentGlAccountTypeMap_GlAccountTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGroup
	 * @generated
	 */
	EClass getPaymentGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGroup#getPaymentGroupId <em>Payment Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Group Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGroup#getPaymentGroupId()
	 * @see #getPaymentGroup()
	 * @generated
	 */
	EAttribute getPaymentGroup_PaymentGroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGroup#getPaymentGroupName <em>Payment Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Group Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGroup#getPaymentGroupName()
	 * @see #getPaymentGroup()
	 * @generated
	 */
	EAttribute getPaymentGroup_PaymentGroupName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentGroup#getPaymentGroupTypeId <em>Payment Group Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Group Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGroup#getPaymentGroupTypeId()
	 * @see #getPaymentGroup()
	 * @generated
	 */
	EReference getPaymentGroup_PaymentGroupTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentGroupMember <em>Group Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Member</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGroupMember
	 * @generated
	 */
	EClass getPaymentGroupMember();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentGroupMember#getPaymentGroupId <em>Payment Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Group Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGroupMember#getPaymentGroupId()
	 * @see #getPaymentGroupMember()
	 * @generated
	 */
	EReference getPaymentGroupMember_PaymentGroupId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentGroupMember#getPaymentId <em>Payment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGroupMember#getPaymentId()
	 * @see #getPaymentGroupMember()
	 * @generated
	 */
	EReference getPaymentGroupMember_PaymentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGroupMember#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGroupMember#getFromDate()
	 * @see #getPaymentGroupMember()
	 * @generated
	 */
	EAttribute getPaymentGroupMember_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGroupMember#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGroupMember#getSequenceNum()
	 * @see #getPaymentGroupMember()
	 * @generated
	 */
	EAttribute getPaymentGroupMember_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGroupMember#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGroupMember#getThruDate()
	 * @see #getPaymentGroupMember()
	 * @generated
	 */
	EAttribute getPaymentGroupMember_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentGroupType <em>Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGroupType
	 * @generated
	 */
	EClass getPaymentGroupType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGroupType#getPaymentGroupTypeId <em>Payment Group Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Group Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGroupType#getPaymentGroupTypeId()
	 * @see #getPaymentGroupType()
	 * @generated
	 */
	EAttribute getPaymentGroupType_PaymentGroupTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGroupType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGroupType#getDescription()
	 * @see #getPaymentGroupType()
	 * @generated
	 */
	EAttribute getPaymentGroupType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentGroupType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGroupType#isHasTable()
	 * @see #getPaymentGroupType()
	 * @generated
	 */
	EAttribute getPaymentGroupType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentGroupType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentGroupType#getParentTypeId()
	 * @see #getPaymentGroupType()
	 * @generated
	 */
	EReference getPaymentGroupType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentMethod
	 * @generated
	 */
	EClass getPaymentMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentMethod#getPaymentMethodId <em>Payment Method Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Method Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentMethod#getPaymentMethodId()
	 * @see #getPaymentMethod()
	 * @generated
	 */
	EAttribute getPaymentMethod_PaymentMethodId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentMethod#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentMethod#getDescription()
	 * @see #getPaymentMethod()
	 * @generated
	 */
	EAttribute getPaymentMethod_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentMethod#getFinAccountId <em>Fin Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentMethod#getFinAccountId()
	 * @see #getPaymentMethod()
	 * @generated
	 */
	EReference getPaymentMethod_FinAccountId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentMethod#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentMethod#getFromDate()
	 * @see #getPaymentMethod()
	 * @generated
	 */
	EAttribute getPaymentMethod_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentMethod#getGlAccountId <em>Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentMethod#getGlAccountId()
	 * @see #getPaymentMethod()
	 * @generated
	 */
	EReference getPaymentMethod_GlAccountId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentMethod#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentMethod#getPartyId()
	 * @see #getPaymentMethod()
	 * @generated
	 */
	EReference getPaymentMethod_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentMethod#getPaymentMethodTypeId <em>Payment Method Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Method Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentMethod#getPaymentMethodTypeId()
	 * @see #getPaymentMethod()
	 * @generated
	 */
	EReference getPaymentMethod_PaymentMethodTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentMethod#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentMethod#getThruDate()
	 * @see #getPaymentMethod()
	 * @generated
	 */
	EAttribute getPaymentMethod_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentMethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentMethodType
	 * @generated
	 */
	EClass getPaymentMethodType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentMethodType#getPaymentMethodTypeId <em>Payment Method Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Method Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentMethodType#getPaymentMethodTypeId()
	 * @see #getPaymentMethodType()
	 * @generated
	 */
	EAttribute getPaymentMethodType_PaymentMethodTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentMethodType#getDefaultGlAccountId <em>Default Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentMethodType#getDefaultGlAccountId()
	 * @see #getPaymentMethodType()
	 * @generated
	 */
	EReference getPaymentMethodType_DefaultGlAccountId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentMethodType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentMethodType#getDescription()
	 * @see #getPaymentMethodType()
	 * @generated
	 */
	EAttribute getPaymentMethodType_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.payment.PaymentMethodType#getPaymentMethodTypeGlAccounts <em>Payment Method Type Gl Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Payment Method Type Gl Accounts</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentMethodType#getPaymentMethodTypeGlAccounts()
	 * @see #getPaymentMethodType()
	 * @generated
	 */
	EReference getPaymentMethodType_PaymentMethodTypeGlAccounts();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentMethodTypeGlAccount <em>Method Type Gl Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Type Gl Account</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentMethodTypeGlAccount
	 * @generated
	 */
	EClass getPaymentMethodTypeGlAccount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentMethodTypeGlAccount#getPaymentMethodTypeId <em>Payment Method Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Method Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentMethodTypeGlAccount#getPaymentMethodTypeId()
	 * @see #getPaymentMethodTypeGlAccount()
	 * @generated
	 */
	EReference getPaymentMethodTypeGlAccount_PaymentMethodTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentMethodTypeGlAccount#getOrganizationPartyId <em>Organization Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentMethodTypeGlAccount#getOrganizationPartyId()
	 * @see #getPaymentMethodTypeGlAccount()
	 * @generated
	 */
	EReference getPaymentMethodTypeGlAccount_OrganizationPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentMethodTypeGlAccount#getGlAccountId <em>Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentMethodTypeGlAccount#getGlAccountId()
	 * @see #getPaymentMethodTypeGlAccount()
	 * @generated
	 */
	EReference getPaymentMethodTypeGlAccount_GlAccountId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentType
	 * @generated
	 */
	EClass getPaymentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentType#getPaymentTypeId <em>Payment Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentType#getPaymentTypeId()
	 * @see #getPaymentType()
	 * @generated
	 */
	EAttribute getPaymentType_PaymentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentType#getDescription()
	 * @see #getPaymentType()
	 * @generated
	 */
	EAttribute getPaymentType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentType#isHasTable()
	 * @see #getPaymentType()
	 * @generated
	 */
	EAttribute getPaymentType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentType#getParentTypeId()
	 * @see #getPaymentType()
	 * @generated
	 */
	EReference getPaymentType_ParentTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.payment.PaymentType#getPaymentGlAccountTypeMaps <em>Payment Gl Account Type Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Payment Gl Account Type Maps</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentType#getPaymentGlAccountTypeMaps()
	 * @see #getPaymentType()
	 * @generated
	 */
	EReference getPaymentType_PaymentGlAccountTypeMaps();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.payment.PaymentType#getPaymentTypeAttrs <em>Payment Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Payment Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentType#getPaymentTypeAttrs()
	 * @see #getPaymentType()
	 * @generated
	 */
	EReference getPaymentType_PaymentTypeAttrs();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.PaymentTypeAttr <em>Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Attr</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentTypeAttr
	 * @generated
	 */
	EClass getPaymentTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.payment.PaymentTypeAttr#getPaymentTypeId <em>Payment Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentTypeAttr#getPaymentTypeId()
	 * @see #getPaymentTypeAttr()
	 * @generated
	 */
	EReference getPaymentTypeAttr_PaymentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentTypeAttr#getAttrName()
	 * @see #getPaymentTypeAttr()
	 * @generated
	 */
	EAttribute getPaymentTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.PaymentTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentTypeAttr#getDescription()
	 * @see #getPaymentTypeAttr()
	 * @generated
	 */
	EAttribute getPaymentTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey <em>Value Link Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Link Key</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.ValueLinkKey
	 * @generated
	 */
	EClass getValueLinkKey();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getMerchantId <em>Merchant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merchant Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getMerchantId()
	 * @see #getValueLinkKey()
	 * @generated
	 */
	EAttribute getValueLinkKey_MerchantId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getCreatedByTerminal <em>Created By Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By Terminal</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getCreatedByTerminal()
	 * @see #getValueLinkKey()
	 * @generated
	 */
	EAttribute getValueLinkKey_CreatedByTerminal();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getCreatedByUserLogin()
	 * @see #getValueLinkKey()
	 * @generated
	 */
	EAttribute getValueLinkKey_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getCreatedDate()
	 * @see #getValueLinkKey()
	 * @generated
	 */
	EAttribute getValueLinkKey_CreatedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getExchangeKey <em>Exchange Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exchange Key</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getExchangeKey()
	 * @see #getValueLinkKey()
	 * @generated
	 */
	EAttribute getValueLinkKey_ExchangeKey();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getLastModifiedByTerminal <em>Last Modified By Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified By Terminal</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getLastModifiedByTerminal()
	 * @see #getValueLinkKey()
	 * @generated
	 */
	EAttribute getValueLinkKey_LastModifiedByTerminal();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getLastModifiedByUserLogin()
	 * @see #getValueLinkKey()
	 * @generated
	 */
	EAttribute getValueLinkKey_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getLastModifiedDate()
	 * @see #getValueLinkKey()
	 * @generated
	 */
	EAttribute getValueLinkKey_LastModifiedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getLastWorkingKey <em>Last Working Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Working Key</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getLastWorkingKey()
	 * @see #getValueLinkKey()
	 * @generated
	 */
	EAttribute getValueLinkKey_LastWorkingKey();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getPrivateKey <em>Private Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Key</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getPrivateKey()
	 * @see #getValueLinkKey()
	 * @generated
	 */
	EAttribute getValueLinkKey_PrivateKey();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getPublicKey <em>Public Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Key</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getPublicKey()
	 * @see #getValueLinkKey()
	 * @generated
	 */
	EAttribute getValueLinkKey_PublicKey();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getWorkingKey <em>Working Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Working Key</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getWorkingKey()
	 * @see #getValueLinkKey()
	 * @generated
	 */
	EAttribute getValueLinkKey_WorkingKey();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getWorkingKeyIndex <em>Working Key Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Working Key Index</em>'.
	 * @see org.abchip.mimo.biz.accounting.payment.ValueLinkKey#getWorkingKeyIndex()
	 * @see #getValueLinkKey()
	 * @generated
	 */
	EAttribute getValueLinkKey_WorkingKeyIndex();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PaymentFactory getPaymentFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountImpl <em>Billing Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.BillingAccountImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getBillingAccount()
		 * @generated
		 */
		EClass BILLING_ACCOUNT = eINSTANCE.getBillingAccount();

		/**
		 * The meta object literal for the '<em><b>Billing Account Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILLING_ACCOUNT__BILLING_ACCOUNT_ID = eINSTANCE.getBillingAccount_BillingAccountId();

		/**
		 * The meta object literal for the '<em><b>Account Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILLING_ACCOUNT__ACCOUNT_CURRENCY_UOM_ID = eINSTANCE.getBillingAccount_AccountCurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Account Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILLING_ACCOUNT__ACCOUNT_LIMIT = eINSTANCE.getBillingAccount_AccountLimit();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILLING_ACCOUNT__CONTACT_MECH_ID = eINSTANCE.getBillingAccount_ContactMechId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILLING_ACCOUNT__DESCRIPTION = eINSTANCE.getBillingAccount_Description();

		/**
		 * The meta object literal for the '<em><b>External Account Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILLING_ACCOUNT__EXTERNAL_ACCOUNT_ID = eINSTANCE.getBillingAccount_ExternalAccountId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILLING_ACCOUNT__FROM_DATE = eINSTANCE.getBillingAccount_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILLING_ACCOUNT__THRU_DATE = eINSTANCE.getBillingAccount_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountRoleImpl <em>Billing Account Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.BillingAccountRoleImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getBillingAccountRole()
		 * @generated
		 */
		EClass BILLING_ACCOUNT_ROLE = eINSTANCE.getBillingAccountRole();

		/**
		 * The meta object literal for the '<em><b>Billing Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILLING_ACCOUNT_ROLE__BILLING_ACCOUNT_ID = eINSTANCE.getBillingAccountRole_BillingAccountId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILLING_ACCOUNT_ROLE__PARTY_ID = eINSTANCE.getBillingAccountRole_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILLING_ACCOUNT_ROLE__ROLE_TYPE_ID = eINSTANCE.getBillingAccountRole_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILLING_ACCOUNT_ROLE__FROM_DATE = eINSTANCE.getBillingAccountRole_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILLING_ACCOUNT_ROLE__THRU_DATE = eINSTANCE.getBillingAccountRole_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountTermImpl <em>Billing Account Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.BillingAccountTermImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getBillingAccountTerm()
		 * @generated
		 */
		EClass BILLING_ACCOUNT_TERM = eINSTANCE.getBillingAccountTerm();

		/**
		 * The meta object literal for the '<em><b>Billing Account Term Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILLING_ACCOUNT_TERM__BILLING_ACCOUNT_TERM_ID = eINSTANCE.getBillingAccountTerm_BillingAccountTermId();

		/**
		 * The meta object literal for the '<em><b>Billing Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILLING_ACCOUNT_TERM__BILLING_ACCOUNT_ID = eINSTANCE.getBillingAccountTerm_BillingAccountId();

		/**
		 * The meta object literal for the '<em><b>Billing Account Term Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILLING_ACCOUNT_TERM__BILLING_ACCOUNT_TERM_ATTRS = eINSTANCE.getBillingAccountTerm_BillingAccountTermAttrs();

		/**
		 * The meta object literal for the '<em><b>Term Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILLING_ACCOUNT_TERM__TERM_DAYS = eINSTANCE.getBillingAccountTerm_TermDays();

		/**
		 * The meta object literal for the '<em><b>Term Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILLING_ACCOUNT_TERM__TERM_TYPE_ID = eINSTANCE.getBillingAccountTerm_TermTypeId();

		/**
		 * The meta object literal for the '<em><b>Term Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILLING_ACCOUNT_TERM__TERM_VALUE = eINSTANCE.getBillingAccountTerm_TermValue();

		/**
		 * The meta object literal for the '<em><b>Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILLING_ACCOUNT_TERM__UOM_ID = eINSTANCE.getBillingAccountTerm_UomId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountTermAttrImpl <em>Billing Account Term Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.BillingAccountTermAttrImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getBillingAccountTermAttr()
		 * @generated
		 */
		EClass BILLING_ACCOUNT_TERM_ATTR = eINSTANCE.getBillingAccountTermAttr();

		/**
		 * The meta object literal for the '<em><b>Billing Account Term Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILLING_ACCOUNT_TERM_ATTR__BILLING_ACCOUNT_TERM_ID = eINSTANCE.getBillingAccountTermAttr_BillingAccountTermId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILLING_ACCOUNT_TERM_ATTR__ATTR_NAME = eINSTANCE.getBillingAccountTermAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILLING_ACCOUNT_TERM_ATTR__ATTR_VALUE = eINSTANCE.getBillingAccountTermAttr_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.CheckAccountImpl <em>Check Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.CheckAccountImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getCheckAccount()
		 * @generated
		 */
		EClass CHECK_ACCOUNT = eINSTANCE.getCheckAccount();

		/**
		 * The meta object literal for the '<em><b>Payment Method Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_ACCOUNT__PAYMENT_METHOD_ID = eINSTANCE.getCheckAccount_PaymentMethodId();

		/**
		 * The meta object literal for the '<em><b>Account Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_ACCOUNT__ACCOUNT_NUMBER = eINSTANCE.getCheckAccount_AccountNumber();

		/**
		 * The meta object literal for the '<em><b>Account Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_ACCOUNT__ACCOUNT_TYPE = eINSTANCE.getCheckAccount_AccountType();

		/**
		 * The meta object literal for the '<em><b>Bank Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_ACCOUNT__BANK_NAME = eINSTANCE.getCheckAccount_BankName();

		/**
		 * The meta object literal for the '<em><b>Branch Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_ACCOUNT__BRANCH_CODE = eINSTANCE.getCheckAccount_BranchCode();

		/**
		 * The meta object literal for the '<em><b>Company Name On Account</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_ACCOUNT__COMPANY_NAME_ON_ACCOUNT = eINSTANCE.getCheckAccount_CompanyNameOnAccount();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_ACCOUNT__CONTACT_MECH_ID = eINSTANCE.getCheckAccount_ContactMechId();

		/**
		 * The meta object literal for the '<em><b>Name On Account</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_ACCOUNT__NAME_ON_ACCOUNT = eINSTANCE.getCheckAccount_NameOnAccount();

		/**
		 * The meta object literal for the '<em><b>Routing Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_ACCOUNT__ROUTING_NUMBER = eINSTANCE.getCheckAccount_RoutingNumber();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.CreditCardImpl <em>Credit Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.CreditCardImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getCreditCard()
		 * @generated
		 */
		EClass CREDIT_CARD = eINSTANCE.getCreditCard();

		/**
		 * The meta object literal for the '<em><b>Card Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__CARD_NUMBER = eINSTANCE.getCreditCard_CardNumber();

		/**
		 * The meta object literal for the '<em><b>Card Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__CARD_TYPE = eINSTANCE.getCreditCard_CardType();

		/**
		 * The meta object literal for the '<em><b>Company Name On Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__COMPANY_NAME_ON_CARD = eINSTANCE.getCreditCard_CompanyNameOnCard();

		/**
		 * The meta object literal for the '<em><b>Consecutive Failed Auths</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__CONSECUTIVE_FAILED_AUTHS = eINSTANCE.getCreditCard_ConsecutiveFailedAuths();

		/**
		 * The meta object literal for the '<em><b>Consecutive Failed Nsf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__CONSECUTIVE_FAILED_NSF = eINSTANCE.getCreditCard_ConsecutiveFailedNsf();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREDIT_CARD__CONTACT_MECH_ID = eINSTANCE.getCreditCard_ContactMechId();

		/**
		 * The meta object literal for the '<em><b>Expire Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__EXPIRE_DATE = eINSTANCE.getCreditCard_ExpireDate();

		/**
		 * The meta object literal for the '<em><b>First Name On Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__FIRST_NAME_ON_CARD = eINSTANCE.getCreditCard_FirstNameOnCard();

		/**
		 * The meta object literal for the '<em><b>Issue Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__ISSUE_NUMBER = eINSTANCE.getCreditCard_IssueNumber();

		/**
		 * The meta object literal for the '<em><b>Last Failed Auth Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__LAST_FAILED_AUTH_DATE = eINSTANCE.getCreditCard_LastFailedAuthDate();

		/**
		 * The meta object literal for the '<em><b>Last Failed Nsf Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__LAST_FAILED_NSF_DATE = eINSTANCE.getCreditCard_LastFailedNsfDate();

		/**
		 * The meta object literal for the '<em><b>Last Name On Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__LAST_NAME_ON_CARD = eINSTANCE.getCreditCard_LastNameOnCard();

		/**
		 * The meta object literal for the '<em><b>Middle Name On Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__MIDDLE_NAME_ON_CARD = eINSTANCE.getCreditCard_MiddleNameOnCard();

		/**
		 * The meta object literal for the '<em><b>Suffix On Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__SUFFIX_ON_CARD = eINSTANCE.getCreditCard_SuffixOnCard();

		/**
		 * The meta object literal for the '<em><b>Title On Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__TITLE_ON_CARD = eINSTANCE.getCreditCard_TitleOnCard();

		/**
		 * The meta object literal for the '<em><b>Valid From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__VALID_FROM_DATE = eINSTANCE.getCreditCard_ValidFromDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.CreditCardTypeGlAccountImpl <em>Credit Card Type Gl Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.CreditCardTypeGlAccountImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getCreditCardTypeGlAccount()
		 * @generated
		 */
		EClass CREDIT_CARD_TYPE_GL_ACCOUNT = eINSTANCE.getCreditCardTypeGlAccount();

		/**
		 * The meta object literal for the '<em><b>Card Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD_TYPE_GL_ACCOUNT__CARD_TYPE = eINSTANCE.getCreditCardTypeGlAccount_CardType();

		/**
		 * The meta object literal for the '<em><b>Organization Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID = eINSTANCE.getCreditCardTypeGlAccount_OrganizationPartyId();

		/**
		 * The meta object literal for the '<em><b>Gl Account Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD_TYPE_GL_ACCOUNT__GL_ACCOUNT_ID = eINSTANCE.getCreditCardTypeGlAccount_GlAccountId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.DeductionImpl <em>Deduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.DeductionImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getDeduction()
		 * @generated
		 */
		EClass DEDUCTION = eINSTANCE.getDeduction();

		/**
		 * The meta object literal for the '<em><b>Deduction Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEDUCTION__DEDUCTION_ID = eINSTANCE.getDeduction_DeductionId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEDUCTION__AMOUNT = eINSTANCE.getDeduction_Amount();

		/**
		 * The meta object literal for the '<em><b>Deduction Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEDUCTION__DEDUCTION_TYPE_ID = eINSTANCE.getDeduction_DeductionTypeId();

		/**
		 * The meta object literal for the '<em><b>Payment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEDUCTION__PAYMENT_ID = eINSTANCE.getDeduction_PaymentId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.DeductionTypeImpl <em>Deduction Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.DeductionTypeImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getDeductionType()
		 * @generated
		 */
		EClass DEDUCTION_TYPE = eINSTANCE.getDeductionType();

		/**
		 * The meta object literal for the '<em><b>Deduction Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEDUCTION_TYPE__DEDUCTION_TYPE_ID = eINSTANCE.getDeductionType_DeductionTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEDUCTION_TYPE__DESCRIPTION = eINSTANCE.getDeductionType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEDUCTION_TYPE__HAS_TABLE = eINSTANCE.getDeductionType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEDUCTION_TYPE__PARENT_TYPE_ID = eINSTANCE.getDeductionType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.EftAccountImpl <em>Eft Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.EftAccountImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getEftAccount()
		 * @generated
		 */
		EClass EFT_ACCOUNT = eINSTANCE.getEftAccount();

		/**
		 * The meta object literal for the '<em><b>Account Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFT_ACCOUNT__ACCOUNT_NUMBER = eINSTANCE.getEftAccount_AccountNumber();

		/**
		 * The meta object literal for the '<em><b>Account Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFT_ACCOUNT__ACCOUNT_TYPE = eINSTANCE.getEftAccount_AccountType();

		/**
		 * The meta object literal for the '<em><b>Bank Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFT_ACCOUNT__BANK_NAME = eINSTANCE.getEftAccount_BankName();

		/**
		 * The meta object literal for the '<em><b>Company Name On Account</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFT_ACCOUNT__COMPANY_NAME_ON_ACCOUNT = eINSTANCE.getEftAccount_CompanyNameOnAccount();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFT_ACCOUNT__CONTACT_MECH_ID = eINSTANCE.getEftAccount_ContactMechId();

		/**
		 * The meta object literal for the '<em><b>Name On Account</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFT_ACCOUNT__NAME_ON_ACCOUNT = eINSTANCE.getEftAccount_NameOnAccount();

		/**
		 * The meta object literal for the '<em><b>Routing Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFT_ACCOUNT__ROUTING_NUMBER = eINSTANCE.getEftAccount_RoutingNumber();

		/**
		 * The meta object literal for the '<em><b>Years At Bank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFT_ACCOUNT__YEARS_AT_BANK = eINSTANCE.getEftAccount_YearsAtBank();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardImpl <em>Gift Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.GiftCardImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getGiftCard()
		 * @generated
		 */
		EClass GIFT_CARD = eINSTANCE.getGiftCard();

		/**
		 * The meta object literal for the '<em><b>Card Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIFT_CARD__CARD_NUMBER = eINSTANCE.getGiftCard_CardNumber();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIFT_CARD__CONTACT_MECH_ID = eINSTANCE.getGiftCard_ContactMechId();

		/**
		 * The meta object literal for the '<em><b>Expire Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIFT_CARD__EXPIRE_DATE = eINSTANCE.getGiftCard_ExpireDate();

		/**
		 * The meta object literal for the '<em><b>Pin Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIFT_CARD__PIN_NUMBER = eINSTANCE.getGiftCard_PinNumber();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl <em>Gift Card Fulfillment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getGiftCardFulfillment()
		 * @generated
		 */
		EClass GIFT_CARD_FULFILLMENT = eINSTANCE.getGiftCardFulfillment();

		/**
		 * The meta object literal for the '<em><b>Fulfillment Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIFT_CARD_FULFILLMENT__FULFILLMENT_ID = eINSTANCE.getGiftCardFulfillment_FulfillmentId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIFT_CARD_FULFILLMENT__AMOUNT = eINSTANCE.getGiftCardFulfillment_Amount();

		/**
		 * The meta object literal for the '<em><b>Auth Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIFT_CARD_FULFILLMENT__AUTH_CODE = eINSTANCE.getGiftCardFulfillment_AuthCode();

		/**
		 * The meta object literal for the '<em><b>Card Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIFT_CARD_FULFILLMENT__CARD_NUMBER = eINSTANCE.getGiftCardFulfillment_CardNumber();

		/**
		 * The meta object literal for the '<em><b>Fulfillment Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIFT_CARD_FULFILLMENT__FULFILLMENT_DATE = eINSTANCE.getGiftCardFulfillment_FulfillmentDate();

		/**
		 * The meta object literal for the '<em><b>Merchant Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIFT_CARD_FULFILLMENT__MERCHANT_ID = eINSTANCE.getGiftCardFulfillment_MerchantId();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIFT_CARD_FULFILLMENT__ORDER_ID = eINSTANCE.getGiftCardFulfillment_OrderId();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIFT_CARD_FULFILLMENT__ORDER_ITEM_SEQ_ID = eINSTANCE.getGiftCardFulfillment_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIFT_CARD_FULFILLMENT__PARTY_ID = eINSTANCE.getGiftCardFulfillment_PartyId();

		/**
		 * The meta object literal for the '<em><b>Pin Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIFT_CARD_FULFILLMENT__PIN_NUMBER = eINSTANCE.getGiftCardFulfillment_PinNumber();

		/**
		 * The meta object literal for the '<em><b>Reference Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIFT_CARD_FULFILLMENT__REFERENCE_NUM = eINSTANCE.getGiftCardFulfillment_ReferenceNum();

		/**
		 * The meta object literal for the '<em><b>Response Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIFT_CARD_FULFILLMENT__RESPONSE_CODE = eINSTANCE.getGiftCardFulfillment_ResponseCode();

		/**
		 * The meta object literal for the '<em><b>Survey Response Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIFT_CARD_FULFILLMENT__SURVEY_RESPONSE_ID = eINSTANCE.getGiftCardFulfillment_SurveyResponseId();

		/**
		 * The meta object literal for the '<em><b>Type Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIFT_CARD_FULFILLMENT__TYPE_ENUM_ID = eINSTANCE.getGiftCardFulfillment_TypeEnumId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PayPalPaymentMethodImpl <em>Pay Pal Payment Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PayPalPaymentMethodImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPayPalPaymentMethod()
		 * @generated
		 */
		EClass PAY_PAL_PAYMENT_METHOD = eINSTANCE.getPayPalPaymentMethod();

		/**
		 * The meta object literal for the '<em><b>Payment Method Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_PAL_PAYMENT_METHOD__PAYMENT_METHOD_ID = eINSTANCE.getPayPalPaymentMethod_PaymentMethodId();

		/**
		 * The meta object literal for the '<em><b>Avs Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_PAL_PAYMENT_METHOD__AVS_ADDR = eINSTANCE.getPayPalPaymentMethod_AvsAddr();

		/**
		 * The meta object literal for the '<em><b>Avs Zip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_PAL_PAYMENT_METHOD__AVS_ZIP = eINSTANCE.getPayPalPaymentMethod_AvsZip();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAY_PAL_PAYMENT_METHOD__CONTACT_MECH_ID = eINSTANCE.getPayPalPaymentMethod_ContactMechId();

		/**
		 * The meta object literal for the '<em><b>Correlation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_PAL_PAYMENT_METHOD__CORRELATION_ID = eINSTANCE.getPayPalPaymentMethod_CorrelationId();

		/**
		 * The meta object literal for the '<em><b>Express Checkout Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_PAL_PAYMENT_METHOD__EXPRESS_CHECKOUT_TOKEN = eINSTANCE.getPayPalPaymentMethod_ExpressCheckoutToken();

		/**
		 * The meta object literal for the '<em><b>Payer Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_PAL_PAYMENT_METHOD__PAYER_ID = eINSTANCE.getPayPalPaymentMethod_PayerId();

		/**
		 * The meta object literal for the '<em><b>Payer Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_PAL_PAYMENT_METHOD__PAYER_STATUS = eINSTANCE.getPayPalPaymentMethod_PayerStatus();

		/**
		 * The meta object literal for the '<em><b>Transaction Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAY_PAL_PAYMENT_METHOD__TRANSACTION_ID = eINSTANCE.getPayPalPaymentMethod_TransactionId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl <em>Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPayment()
		 * @generated
		 */
		EClass PAYMENT = eINSTANCE.getPayment();

		/**
		 * The meta object literal for the '<em><b>Payment Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__PAYMENT_ID = eINSTANCE.getPayment_PaymentId();

		/**
		 * The meta object literal for the '<em><b>Actual Currency Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__ACTUAL_CURRENCY_AMOUNT = eINSTANCE.getPayment_ActualCurrencyAmount();

		/**
		 * The meta object literal for the '<em><b>Actual Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT__ACTUAL_CURRENCY_UOM_ID = eINSTANCE.getPayment_ActualCurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__AMOUNT = eINSTANCE.getPayment_Amount();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__COMMENTS = eINSTANCE.getPayment_Comments();

		/**
		 * The meta object literal for the '<em><b>Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT__CURRENCY_UOM_ID = eINSTANCE.getPayment_CurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Effective Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__EFFECTIVE_DATE = eINSTANCE.getPayment_EffectiveDate();

		/**
		 * The meta object literal for the '<em><b>Fin Account Trans Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT__FIN_ACCOUNT_TRANS_ID = eINSTANCE.getPayment_FinAccountTransId();

		/**
		 * The meta object literal for the '<em><b>Override Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT__OVERRIDE_GL_ACCOUNT_ID = eINSTANCE.getPayment_OverrideGlAccountId();

		/**
		 * The meta object literal for the '<em><b>Party Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT__PARTY_ID_FROM = eINSTANCE.getPayment_PartyIdFrom();

		/**
		 * The meta object literal for the '<em><b>Party Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT__PARTY_ID_TO = eINSTANCE.getPayment_PartyIdTo();

		/**
		 * The meta object literal for the '<em><b>Payment Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT__PAYMENT_ATTRIBUTES = eINSTANCE.getPayment_PaymentAttributes();

		/**
		 * The meta object literal for the '<em><b>Payment Gateway Response Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT__PAYMENT_GATEWAY_RESPONSE_ID = eINSTANCE.getPayment_PaymentGatewayResponseId();

		/**
		 * The meta object literal for the '<em><b>Payment Method Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT__PAYMENT_METHOD_ID = eINSTANCE.getPayment_PaymentMethodId();

		/**
		 * The meta object literal for the '<em><b>Payment Method Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT__PAYMENT_METHOD_TYPE_ID = eINSTANCE.getPayment_PaymentMethodTypeId();

		/**
		 * The meta object literal for the '<em><b>Payment Preference Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT__PAYMENT_PREFERENCE_ID = eINSTANCE.getPayment_PaymentPreferenceId();

		/**
		 * The meta object literal for the '<em><b>Payment Ref Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__PAYMENT_REF_NUM = eINSTANCE.getPayment_PaymentRefNum();

		/**
		 * The meta object literal for the '<em><b>Payment Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT__PAYMENT_TYPE_ID = eINSTANCE.getPayment_PaymentTypeId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT__ROLE_TYPE_ID_TO = eINSTANCE.getPayment_RoleTypeIdTo();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT__STATUS_ID = eINSTANCE.getPayment_StatusId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentApplicationImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentApplication()
		 * @generated
		 */
		EClass PAYMENT_APPLICATION = eINSTANCE.getPaymentApplication();

		/**
		 * The meta object literal for the '<em><b>Payment Application Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_APPLICATION__PAYMENT_APPLICATION_ID = eINSTANCE.getPaymentApplication_PaymentApplicationId();

		/**
		 * The meta object literal for the '<em><b>Amount Applied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_APPLICATION__AMOUNT_APPLIED = eINSTANCE.getPaymentApplication_AmountApplied();

		/**
		 * The meta object literal for the '<em><b>Billing Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_APPLICATION__BILLING_ACCOUNT_ID = eINSTANCE.getPaymentApplication_BillingAccountId();

		/**
		 * The meta object literal for the '<em><b>Invoice Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_APPLICATION__INVOICE_ID = eINSTANCE.getPaymentApplication_InvoiceId();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_APPLICATION__INVOICE_ITEM_SEQ_ID = eINSTANCE.getPaymentApplication_InvoiceItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Override Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_APPLICATION__OVERRIDE_GL_ACCOUNT_ID = eINSTANCE.getPaymentApplication_OverrideGlAccountId();

		/**
		 * The meta object literal for the '<em><b>Payment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_APPLICATION__PAYMENT_ID = eINSTANCE.getPaymentApplication_PaymentId();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Geo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_APPLICATION__TAX_AUTH_GEO_ID = eINSTANCE.getPaymentApplication_TaxAuthGeoId();

		/**
		 * The meta object literal for the '<em><b>To Payment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_APPLICATION__TO_PAYMENT_ID = eINSTANCE.getPaymentApplication_ToPaymentId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentAttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentAttributeImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentAttribute()
		 * @generated
		 */
		EClass PAYMENT_ATTRIBUTE = eINSTANCE.getPaymentAttribute();

		/**
		 * The meta object literal for the '<em><b>Payment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_ATTRIBUTE__PAYMENT_ID = eINSTANCE.getPaymentAttribute_PaymentId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_ATTRIBUTE__ATTR_NAME = eINSTANCE.getPaymentAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getPaymentAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getPaymentAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentBudgetAllocationImpl <em>Budget Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentBudgetAllocationImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentBudgetAllocation()
		 * @generated
		 */
		EClass PAYMENT_BUDGET_ALLOCATION = eINSTANCE.getPaymentBudgetAllocation();

		/**
		 * The meta object literal for the '<em><b>Budget Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_BUDGET_ALLOCATION__BUDGET_ID = eINSTANCE.getPaymentBudgetAllocation_BudgetId();

		/**
		 * The meta object literal for the '<em><b>Budget Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_BUDGET_ALLOCATION__BUDGET_ITEM_SEQ_ID = eINSTANCE.getPaymentBudgetAllocation_BudgetItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Payment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_BUDGET_ALLOCATION__PAYMENT_ID = eINSTANCE.getPaymentBudgetAllocation_PaymentId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_BUDGET_ALLOCATION__AMOUNT = eINSTANCE.getPaymentBudgetAllocation_Amount();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentContentImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentContent()
		 * @generated
		 */
		EClass PAYMENT_CONTENT = eINSTANCE.getPaymentContent();

		/**
		 * The meta object literal for the '<em><b>Content Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_CONTENT__CONTENT_ID = eINSTANCE.getPaymentContent_ContentId();

		/**
		 * The meta object literal for the '<em><b>Payment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_CONTENT__PAYMENT_ID = eINSTANCE.getPaymentContent_PaymentId();

		/**
		 * The meta object literal for the '<em><b>Payment Content Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_CONTENT__PAYMENT_CONTENT_TYPE_ID = eINSTANCE.getPaymentContent_PaymentContentTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_CONTENT__FROM_DATE = eINSTANCE.getPaymentContent_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_CONTENT__THRU_DATE = eINSTANCE.getPaymentContent_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentContentTypeImpl <em>Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentContentTypeImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentContentType()
		 * @generated
		 */
		EClass PAYMENT_CONTENT_TYPE = eINSTANCE.getPaymentContentType();

		/**
		 * The meta object literal for the '<em><b>Payment Content Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_CONTENT_TYPE__PAYMENT_CONTENT_TYPE_ID = eINSTANCE.getPaymentContentType_PaymentContentTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_CONTENT_TYPE__DESCRIPTION = eINSTANCE.getPaymentContentType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_CONTENT_TYPE__HAS_TABLE = eINSTANCE.getPaymentContentType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_CONTENT_TYPE__PARENT_TYPE_ID = eINSTANCE.getPaymentContentType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayAuthorizeNetImpl <em>Gateway Authorize Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayAuthorizeNetImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewayAuthorizeNet()
		 * @generated
		 */
		EClass PAYMENT_GATEWAY_AUTHORIZE_NET = eINSTANCE.getPaymentGatewayAuthorizeNet();

		/**
		 * The meta object literal for the '<em><b>Payment Gateway Config Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_AUTHORIZE_NET__PAYMENT_GATEWAY_CONFIG_ID = eINSTANCE.getPaymentGatewayAuthorizeNet_PaymentGatewayConfigId();

		/**
		 * The meta object literal for the '<em><b>Api Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_AUTHORIZE_NET__API_VERSION = eINSTANCE.getPaymentGatewayAuthorizeNet_ApiVersion();

		/**
		 * The meta object literal for the '<em><b>Certificate Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_AUTHORIZE_NET__CERTIFICATE_ALIAS = eINSTANCE.getPaymentGatewayAuthorizeNet_CertificateAlias();

		/**
		 * The meta object literal for the '<em><b>Cp Device Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_AUTHORIZE_NET__CP_DEVICE_TYPE = eINSTANCE.getPaymentGatewayAuthorizeNet_CpDeviceType();

		/**
		 * The meta object literal for the '<em><b>Cp Market Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_AUTHORIZE_NET__CP_MARKET_TYPE = eINSTANCE.getPaymentGatewayAuthorizeNet_CpMarketType();

		/**
		 * The meta object literal for the '<em><b>Cp Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_AUTHORIZE_NET__CP_VERSION = eINSTANCE.getPaymentGatewayAuthorizeNet_CpVersion();

		/**
		 * The meta object literal for the '<em><b>Delimited Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_AUTHORIZE_NET__DELIMITED_DATA = eINSTANCE.getPaymentGatewayAuthorizeNet_DelimitedData();

		/**
		 * The meta object literal for the '<em><b>Delimiter Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_AUTHORIZE_NET__DELIMITER_CHAR = eINSTANCE.getPaymentGatewayAuthorizeNet_DelimiterChar();

		/**
		 * The meta object literal for the '<em><b>Duplicate Window</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_AUTHORIZE_NET__DUPLICATE_WINDOW = eINSTANCE.getPaymentGatewayAuthorizeNet_DuplicateWindow();

		/**
		 * The meta object literal for the '<em><b>Email Customer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_AUTHORIZE_NET__EMAIL_CUSTOMER = eINSTANCE.getPaymentGatewayAuthorizeNet_EmailCustomer();

		/**
		 * The meta object literal for the '<em><b>Email Merchant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_AUTHORIZE_NET__EMAIL_MERCHANT = eINSTANCE.getPaymentGatewayAuthorizeNet_EmailMerchant();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_AUTHORIZE_NET__METHOD = eINSTANCE.getPaymentGatewayAuthorizeNet_Method();

		/**
		 * The meta object literal for the '<em><b>Pwd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_AUTHORIZE_NET__PWD = eINSTANCE.getPaymentGatewayAuthorizeNet_Pwd();

		/**
		 * The meta object literal for the '<em><b>Relay Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_AUTHORIZE_NET__RELAY_RESPONSE = eINSTANCE.getPaymentGatewayAuthorizeNet_RelayResponse();

		/**
		 * The meta object literal for the '<em><b>Test Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_AUTHORIZE_NET__TEST_MODE = eINSTANCE.getPaymentGatewayAuthorizeNet_TestMode();

		/**
		 * The meta object literal for the '<em><b>Tran Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_AUTHORIZE_NET__TRAN_KEY = eINSTANCE.getPaymentGatewayAuthorizeNet_TranKey();

		/**
		 * The meta object literal for the '<em><b>Trans Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_AUTHORIZE_NET__TRANS_DESCRIPTION = eINSTANCE.getPaymentGatewayAuthorizeNet_TransDescription();

		/**
		 * The meta object literal for the '<em><b>Transaction Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_AUTHORIZE_NET__TRANSACTION_URL = eINSTANCE.getPaymentGatewayAuthorizeNet_TransactionUrl();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_AUTHORIZE_NET__USER_ID = eINSTANCE.getPaymentGatewayAuthorizeNet_UserId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl <em>Gateway Clear Commerce</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayClearCommerceImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewayClearCommerce()
		 * @generated
		 */
		EClass PAYMENT_GATEWAY_CLEAR_COMMERCE = eINSTANCE.getPaymentGatewayClearCommerce();

		/**
		 * The meta object literal for the '<em><b>Payment Gateway Config Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CLEAR_COMMERCE__PAYMENT_GATEWAY_CONFIG_ID = eINSTANCE.getPaymentGatewayClearCommerce_PaymentGatewayConfigId();

		/**
		 * The meta object literal for the '<em><b>Client Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CLEAR_COMMERCE__CLIENT_ID = eINSTANCE.getPaymentGatewayClearCommerce_ClientId();

		/**
		 * The meta object literal for the '<em><b>Effective Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CLEAR_COMMERCE__EFFECTIVE_ALIAS = eINSTANCE.getPaymentGatewayClearCommerce_EffectiveAlias();

		/**
		 * The meta object literal for the '<em><b>Enable CVM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CLEAR_COMMERCE__ENABLE_CVM = eINSTANCE.getPaymentGatewayClearCommerce_EnableCVM();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CLEAR_COMMERCE__GROUP_ID = eINSTANCE.getPaymentGatewayClearCommerce_GroupId();

		/**
		 * The meta object literal for the '<em><b>Process Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CLEAR_COMMERCE__PROCESS_MODE = eINSTANCE.getPaymentGatewayClearCommerce_ProcessMode();

		/**
		 * The meta object literal for the '<em><b>Pwd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CLEAR_COMMERCE__PWD = eINSTANCE.getPaymentGatewayClearCommerce_Pwd();

		/**
		 * The meta object literal for the '<em><b>Server URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CLEAR_COMMERCE__SERVER_URL = eINSTANCE.getPaymentGatewayClearCommerce_ServerURL();

		/**
		 * The meta object literal for the '<em><b>Source Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CLEAR_COMMERCE__SOURCE_ID = eINSTANCE.getPaymentGatewayClearCommerce_SourceId();

		/**
		 * The meta object literal for the '<em><b>User Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CLEAR_COMMERCE__USER_ALIAS = eINSTANCE.getPaymentGatewayClearCommerce_UserAlias();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CLEAR_COMMERCE__USERNAME = eINSTANCE.getPaymentGatewayClearCommerce_Username();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayConfigImpl <em>Gateway Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayConfigImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewayConfig()
		 * @generated
		 */
		EClass PAYMENT_GATEWAY_CONFIG = eINSTANCE.getPaymentGatewayConfig();

		/**
		 * The meta object literal for the '<em><b>Payment Gateway Config Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CONFIG__PAYMENT_GATEWAY_CONFIG_ID = eINSTANCE.getPaymentGatewayConfig_PaymentGatewayConfigId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CONFIG__DESCRIPTION = eINSTANCE.getPaymentGatewayConfig_Description();

		/**
		 * The meta object literal for the '<em><b>Payment Gateway Config Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_GATEWAY_CONFIG__PAYMENT_GATEWAY_CONFIG_TYPE_ID = eINSTANCE.getPaymentGatewayConfig_PaymentGatewayConfigTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayConfigTypeImpl <em>Gateway Config Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayConfigTypeImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewayConfigType()
		 * @generated
		 */
		EClass PAYMENT_GATEWAY_CONFIG_TYPE = eINSTANCE.getPaymentGatewayConfigType();

		/**
		 * The meta object literal for the '<em><b>Payment Gateway Config Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CONFIG_TYPE__PAYMENT_GATEWAY_CONFIG_TYPE_ID = eINSTANCE.getPaymentGatewayConfigType_PaymentGatewayConfigTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CONFIG_TYPE__DESCRIPTION = eINSTANCE.getPaymentGatewayConfigType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CONFIG_TYPE__HAS_TABLE = eINSTANCE.getPaymentGatewayConfigType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_GATEWAY_CONFIG_TYPE__PARENT_TYPE_ID = eINSTANCE.getPaymentGatewayConfigType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayCyberSourceImpl <em>Gateway Cyber Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayCyberSourceImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewayCyberSource()
		 * @generated
		 */
		EClass PAYMENT_GATEWAY_CYBER_SOURCE = eINSTANCE.getPaymentGatewayCyberSource();

		/**
		 * The meta object literal for the '<em><b>Payment Gateway Config Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CYBER_SOURCE__PAYMENT_GATEWAY_CONFIG_ID = eINSTANCE.getPaymentGatewayCyberSource_PaymentGatewayConfigId();

		/**
		 * The meta object literal for the '<em><b>Api Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CYBER_SOURCE__API_VERSION = eINSTANCE.getPaymentGatewayCyberSource_ApiVersion();

		/**
		 * The meta object literal for the '<em><b>Auto Bill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CYBER_SOURCE__AUTO_BILL = eINSTANCE.getPaymentGatewayCyberSource_AutoBill();

		/**
		 * The meta object literal for the '<em><b>Avs Decline Codes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CYBER_SOURCE__AVS_DECLINE_CODES = eINSTANCE.getPaymentGatewayCyberSource_AvsDeclineCodes();

		/**
		 * The meta object literal for the '<em><b>Disable Bill Avs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CYBER_SOURCE__DISABLE_BILL_AVS = eINSTANCE.getPaymentGatewayCyberSource_DisableBillAvs();

		/**
		 * The meta object literal for the '<em><b>Enable Dav</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CYBER_SOURCE__ENABLE_DAV = eINSTANCE.getPaymentGatewayCyberSource_EnableDav();

		/**
		 * The meta object literal for the '<em><b>Fraud Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CYBER_SOURCE__FRAUD_SCORE = eINSTANCE.getPaymentGatewayCyberSource_FraudScore();

		/**
		 * The meta object literal for the '<em><b>Ignore Avs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CYBER_SOURCE__IGNORE_AVS = eINSTANCE.getPaymentGatewayCyberSource_IgnoreAvs();

		/**
		 * The meta object literal for the '<em><b>Keys Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CYBER_SOURCE__KEYS_DIR = eINSTANCE.getPaymentGatewayCyberSource_KeysDir();

		/**
		 * The meta object literal for the '<em><b>Keys File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CYBER_SOURCE__KEYS_FILE = eINSTANCE.getPaymentGatewayCyberSource_KeysFile();

		/**
		 * The meta object literal for the '<em><b>Log Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CYBER_SOURCE__LOG_DIR = eINSTANCE.getPaymentGatewayCyberSource_LogDir();

		/**
		 * The meta object literal for the '<em><b>Log Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CYBER_SOURCE__LOG_ENABLED = eINSTANCE.getPaymentGatewayCyberSource_LogEnabled();

		/**
		 * The meta object literal for the '<em><b>Log File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CYBER_SOURCE__LOG_FILE = eINSTANCE.getPaymentGatewayCyberSource_LogFile();

		/**
		 * The meta object literal for the '<em><b>Log Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CYBER_SOURCE__LOG_SIZE = eINSTANCE.getPaymentGatewayCyberSource_LogSize();

		/**
		 * The meta object literal for the '<em><b>Merchant Contact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_CONTACT = eINSTANCE.getPaymentGatewayCyberSource_MerchantContact();

		/**
		 * The meta object literal for the '<em><b>Merchant Descr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_DESCR = eINSTANCE.getPaymentGatewayCyberSource_MerchantDescr();

		/**
		 * The meta object literal for the '<em><b>Merchant Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_ID = eINSTANCE.getPaymentGatewayCyberSource_MerchantId();

		/**
		 * The meta object literal for the '<em><b>Production</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_CYBER_SOURCE__PRODUCTION = eINSTANCE.getPaymentGatewayCyberSource_Production();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayEwayImpl <em>Gateway Eway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayEwayImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewayEway()
		 * @generated
		 */
		EClass PAYMENT_GATEWAY_EWAY = eINSTANCE.getPaymentGatewayEway();

		/**
		 * The meta object literal for the '<em><b>Payment Gateway Config Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_EWAY__PAYMENT_GATEWAY_CONFIG_ID = eINSTANCE.getPaymentGatewayEway_PaymentGatewayConfigId();

		/**
		 * The meta object literal for the '<em><b>Customer Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_EWAY__CUSTOMER_ID = eINSTANCE.getPaymentGatewayEway_CustomerId();

		/**
		 * The meta object literal for the '<em><b>Enable Beagle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_EWAY__ENABLE_BEAGLE = eINSTANCE.getPaymentGatewayEway_EnableBeagle();

		/**
		 * The meta object literal for the '<em><b>Enable Cvn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_EWAY__ENABLE_CVN = eINSTANCE.getPaymentGatewayEway_EnableCvn();

		/**
		 * The meta object literal for the '<em><b>Refund Pwd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_EWAY__REFUND_PWD = eINSTANCE.getPaymentGatewayEway_RefundPwd();

		/**
		 * The meta object literal for the '<em><b>Test Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_EWAY__TEST_MODE = eINSTANCE.getPaymentGatewayEway_TestMode();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayOrbitalImpl <em>Gateway Orbital</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayOrbitalImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewayOrbital()
		 * @generated
		 */
		EClass PAYMENT_GATEWAY_ORBITAL = eINSTANCE.getPaymentGatewayOrbital();

		/**
		 * The meta object literal for the '<em><b>Payment Gateway Config Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_ORBITAL__PAYMENT_GATEWAY_CONFIG_ID = eINSTANCE.getPaymentGatewayOrbital_PaymentGatewayConfigId();

		/**
		 * The meta object literal for the '<em><b>Authorization URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_ORBITAL__AUTHORIZATION_URI = eINSTANCE.getPaymentGatewayOrbital_AuthorizationURI();

		/**
		 * The meta object literal for the '<em><b>Connection Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_ORBITAL__CONNECTION_PASSWORD = eINSTANCE.getPaymentGatewayOrbital_ConnectionPassword();

		/**
		 * The meta object literal for the '<em><b>Connection Timeout Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_ORBITAL__CONNECTION_TIMEOUT_SECONDS = eINSTANCE.getPaymentGatewayOrbital_ConnectionTimeoutSeconds();

		/**
		 * The meta object literal for the '<em><b>Engine Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_ORBITAL__ENGINE_CLASS = eINSTANCE.getPaymentGatewayOrbital_EngineClass();

		/**
		 * The meta object literal for the '<em><b>Host Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_ORBITAL__HOST_NAME = eINSTANCE.getPaymentGatewayOrbital_HostName();

		/**
		 * The meta object literal for the '<em><b>Host Name Failover</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_ORBITAL__HOST_NAME_FAILOVER = eINSTANCE.getPaymentGatewayOrbital_HostNameFailover();

		/**
		 * The meta object literal for the '<em><b>Merchant Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_ORBITAL__MERCHANT_ID = eINSTANCE.getPaymentGatewayOrbital_MerchantId();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_ORBITAL__PORT = eINSTANCE.getPaymentGatewayOrbital_Port();

		/**
		 * The meta object literal for the '<em><b>Port Failover</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_ORBITAL__PORT_FAILOVER = eINSTANCE.getPaymentGatewayOrbital_PortFailover();

		/**
		 * The meta object literal for the '<em><b>Read Timeout Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_ORBITAL__READ_TIMEOUT_SECONDS = eINSTANCE.getPaymentGatewayOrbital_ReadTimeoutSeconds();

		/**
		 * The meta object literal for the '<em><b>Response Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_ORBITAL__RESPONSE_TYPE = eINSTANCE.getPaymentGatewayOrbital_ResponseType();

		/**
		 * The meta object literal for the '<em><b>Sdk Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_ORBITAL__SDK_VERSION = eINSTANCE.getPaymentGatewayOrbital_SdkVersion();

		/**
		 * The meta object literal for the '<em><b>Ssl Socket Factory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_ORBITAL__SSL_SOCKET_FACTORY = eINSTANCE.getPaymentGatewayOrbital_SslSocketFactory();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_ORBITAL__USERNAME = eINSTANCE.getPaymentGatewayOrbital_Username();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl <em>Gateway Pay Pal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewayPayPal()
		 * @generated
		 */
		EClass PAYMENT_GATEWAY_PAY_PAL = eINSTANCE.getPaymentGatewayPayPal();

		/**
		 * The meta object literal for the '<em><b>Payment Gateway Config Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAY_PAL__PAYMENT_GATEWAY_CONFIG_ID = eINSTANCE.getPaymentGatewayPayPal_PaymentGatewayConfigId();

		/**
		 * The meta object literal for the '<em><b>Api Environment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAY_PAL__API_ENVIRONMENT = eINSTANCE.getPaymentGatewayPayPal_ApiEnvironment();

		/**
		 * The meta object literal for the '<em><b>Api Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAY_PAL__API_PASSWORD = eINSTANCE.getPaymentGatewayPayPal_ApiPassword();

		/**
		 * The meta object literal for the '<em><b>Api Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAY_PAL__API_SIGNATURE = eINSTANCE.getPaymentGatewayPayPal_ApiSignature();

		/**
		 * The meta object literal for the '<em><b>Api User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAY_PAL__API_USER_NAME = eINSTANCE.getPaymentGatewayPayPal_ApiUserName();

		/**
		 * The meta object literal for the '<em><b>Business Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAY_PAL__BUSINESS_EMAIL = eINSTANCE.getPaymentGatewayPayPal_BusinessEmail();

		/**
		 * The meta object literal for the '<em><b>Cancel Return Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAY_PAL__CANCEL_RETURN_URL = eINSTANCE.getPaymentGatewayPayPal_CancelReturnUrl();

		/**
		 * The meta object literal for the '<em><b>Confirm Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAY_PAL__CONFIRM_TEMPLATE = eINSTANCE.getPaymentGatewayPayPal_ConfirmTemplate();

		/**
		 * The meta object literal for the '<em><b>Confirm Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAY_PAL__CONFIRM_URL = eINSTANCE.getPaymentGatewayPayPal_ConfirmUrl();

		/**
		 * The meta object literal for the '<em><b>Image Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAY_PAL__IMAGE_URL = eINSTANCE.getPaymentGatewayPayPal_ImageUrl();

		/**
		 * The meta object literal for the '<em><b>Notify Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAY_PAL__NOTIFY_URL = eINSTANCE.getPaymentGatewayPayPal_NotifyUrl();

		/**
		 * The meta object literal for the '<em><b>Redirect Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAY_PAL__REDIRECT_URL = eINSTANCE.getPaymentGatewayPayPal_RedirectUrl();

		/**
		 * The meta object literal for the '<em><b>Require Confirmed Shipping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAY_PAL__REQUIRE_CONFIRMED_SHIPPING = eINSTANCE.getPaymentGatewayPayPal_RequireConfirmedShipping();

		/**
		 * The meta object literal for the '<em><b>Return Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAY_PAL__RETURN_URL = eINSTANCE.getPaymentGatewayPayPal_ReturnUrl();

		/**
		 * The meta object literal for the '<em><b>Shipping Callback Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAY_PAL__SHIPPING_CALLBACK_URL = eINSTANCE.getPaymentGatewayPayPal_ShippingCallbackUrl();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl <em>Gateway Payflow Pro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewayPayflowPro()
		 * @generated
		 */
		EClass PAYMENT_GATEWAY_PAYFLOW_PRO = eINSTANCE.getPaymentGatewayPayflowPro();

		/**
		 * The meta object literal for the '<em><b>Payment Gateway Config Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAYFLOW_PRO__PAYMENT_GATEWAY_CONFIG_ID = eINSTANCE.getPaymentGatewayPayflowPro_PaymentGatewayConfigId();

		/**
		 * The meta object literal for the '<em><b>Cancel Return Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAYFLOW_PRO__CANCEL_RETURN_URL = eINSTANCE.getPaymentGatewayPayflowPro_CancelReturnUrl();

		/**
		 * The meta object literal for the '<em><b>Certs Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAYFLOW_PRO__CERTS_PATH = eINSTANCE.getPaymentGatewayPayflowPro_CertsPath();

		/**
		 * The meta object literal for the '<em><b>Check Avs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAYFLOW_PRO__CHECK_AVS = eINSTANCE.getPaymentGatewayPayflowPro_CheckAvs();

		/**
		 * The meta object literal for the '<em><b>Check Cvv2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAYFLOW_PRO__CHECK_CVV2 = eINSTANCE.getPaymentGatewayPayflowPro_CheckCvv2();

		/**
		 * The meta object literal for the '<em><b>Enable Transmit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAYFLOW_PRO__ENABLE_TRANSMIT = eINSTANCE.getPaymentGatewayPayflowPro_EnableTransmit();

		/**
		 * The meta object literal for the '<em><b>Host Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAYFLOW_PRO__HOST_ADDRESS = eINSTANCE.getPaymentGatewayPayflowPro_HostAddress();

		/**
		 * The meta object literal for the '<em><b>Host Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAYFLOW_PRO__HOST_PORT = eINSTANCE.getPaymentGatewayPayflowPro_HostPort();

		/**
		 * The meta object literal for the '<em><b>Log File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAYFLOW_PRO__LOG_FILE_NAME = eINSTANCE.getPaymentGatewayPayflowPro_LogFileName();

		/**
		 * The meta object literal for the '<em><b>Logging Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAYFLOW_PRO__LOGGING_LEVEL = eINSTANCE.getPaymentGatewayPayflowPro_LoggingLevel();

		/**
		 * The meta object literal for the '<em><b>Max Log File Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAYFLOW_PRO__MAX_LOG_FILE_SIZE = eINSTANCE.getPaymentGatewayPayflowPro_MaxLogFileSize();

		/**
		 * The meta object literal for the '<em><b>Partner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAYFLOW_PRO__PARTNER = eINSTANCE.getPaymentGatewayPayflowPro_Partner();

		/**
		 * The meta object literal for the '<em><b>Pre Auth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAYFLOW_PRO__PRE_AUTH = eINSTANCE.getPaymentGatewayPayflowPro_PreAuth();

		/**
		 * The meta object literal for the '<em><b>Proxy Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_ADDRESS = eINSTANCE.getPaymentGatewayPayflowPro_ProxyAddress();

		/**
		 * The meta object literal for the '<em><b>Proxy Logon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_LOGON = eINSTANCE.getPaymentGatewayPayflowPro_ProxyLogon();

		/**
		 * The meta object literal for the '<em><b>Proxy Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_PASSWORD = eINSTANCE.getPaymentGatewayPayflowPro_ProxyPassword();

		/**
		 * The meta object literal for the '<em><b>Proxy Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_PORT = eINSTANCE.getPaymentGatewayPayflowPro_ProxyPort();

		/**
		 * The meta object literal for the '<em><b>Pwd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAYFLOW_PRO__PWD = eINSTANCE.getPaymentGatewayPayflowPro_Pwd();

		/**
		 * The meta object literal for the '<em><b>Redirect Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAYFLOW_PRO__REDIRECT_URL = eINSTANCE.getPaymentGatewayPayflowPro_RedirectUrl();

		/**
		 * The meta object literal for the '<em><b>Return Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAYFLOW_PRO__RETURN_URL = eINSTANCE.getPaymentGatewayPayflowPro_ReturnUrl();

		/**
		 * The meta object literal for the '<em><b>Stack Trace On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAYFLOW_PRO__STACK_TRACE_ON = eINSTANCE.getPaymentGatewayPayflowPro_StackTraceOn();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAYFLOW_PRO__TIMEOUT = eINSTANCE.getPaymentGatewayPayflowPro_Timeout();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAYFLOW_PRO__USER_ID = eINSTANCE.getPaymentGatewayPayflowPro_UserId();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_PAYFLOW_PRO__VENDOR = eINSTANCE.getPaymentGatewayPayflowPro_Vendor();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayRespMsgImpl <em>Gateway Resp Msg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayRespMsgImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewayRespMsg()
		 * @generated
		 */
		EClass PAYMENT_GATEWAY_RESP_MSG = eINSTANCE.getPaymentGatewayRespMsg();

		/**
		 * The meta object literal for the '<em><b>Payment Gateway Resp Msg Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_RESP_MSG__PAYMENT_GATEWAY_RESP_MSG_ID = eINSTANCE.getPaymentGatewayRespMsg_PaymentGatewayRespMsgId();

		/**
		 * The meta object literal for the '<em><b>Payment Gateway Response Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_GATEWAY_RESP_MSG__PAYMENT_GATEWAY_RESPONSE_ID = eINSTANCE.getPaymentGatewayRespMsg_PaymentGatewayResponseId();

		/**
		 * The meta object literal for the '<em><b>Pgr Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_RESP_MSG__PGR_MESSAGE = eINSTANCE.getPaymentGatewayRespMsg_PgrMessage();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl <em>Gateway Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayResponseImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewayResponse()
		 * @generated
		 */
		EClass PAYMENT_GATEWAY_RESPONSE = eINSTANCE.getPaymentGatewayResponse();

		/**
		 * The meta object literal for the '<em><b>Payment Gateway Response Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_RESPONSE__PAYMENT_GATEWAY_RESPONSE_ID = eINSTANCE.getPaymentGatewayResponse_PaymentGatewayResponseId();

		/**
		 * The meta object literal for the '<em><b>Alt Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_RESPONSE__ALT_REFERENCE = eINSTANCE.getPaymentGatewayResponse_AltReference();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_RESPONSE__AMOUNT = eINSTANCE.getPaymentGatewayResponse_Amount();

		/**
		 * The meta object literal for the '<em><b>Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_GATEWAY_RESPONSE__CURRENCY_UOM_ID = eINSTANCE.getPaymentGatewayResponse_CurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Gateway Avs Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_RESPONSE__GATEWAY_AVS_RESULT = eINSTANCE.getPaymentGatewayResponse_GatewayAvsResult();

		/**
		 * The meta object literal for the '<em><b>Gateway Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_RESPONSE__GATEWAY_CODE = eINSTANCE.getPaymentGatewayResponse_GatewayCode();

		/**
		 * The meta object literal for the '<em><b>Gateway Cv Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_RESPONSE__GATEWAY_CV_RESULT = eINSTANCE.getPaymentGatewayResponse_GatewayCvResult();

		/**
		 * The meta object literal for the '<em><b>Gateway Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_RESPONSE__GATEWAY_FLAG = eINSTANCE.getPaymentGatewayResponse_GatewayFlag();

		/**
		 * The meta object literal for the '<em><b>Gateway Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_RESPONSE__GATEWAY_MESSAGE = eINSTANCE.getPaymentGatewayResponse_GatewayMessage();

		/**
		 * The meta object literal for the '<em><b>Gateway Score Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_RESPONSE__GATEWAY_SCORE_RESULT = eINSTANCE.getPaymentGatewayResponse_GatewayScoreResult();

		/**
		 * The meta object literal for the '<em><b>Order Payment Preference Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_GATEWAY_RESPONSE__ORDER_PAYMENT_PREFERENCE_ID = eINSTANCE.getPaymentGatewayResponse_OrderPaymentPreferenceId();

		/**
		 * The meta object literal for the '<em><b>Payment Method Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_GATEWAY_RESPONSE__PAYMENT_METHOD_ID = eINSTANCE.getPaymentGatewayResponse_PaymentMethodId();

		/**
		 * The meta object literal for the '<em><b>Payment Method Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_GATEWAY_RESPONSE__PAYMENT_METHOD_TYPE_ID = eINSTANCE.getPaymentGatewayResponse_PaymentMethodTypeId();

		/**
		 * The meta object literal for the '<em><b>Payment Service Type Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_GATEWAY_RESPONSE__PAYMENT_SERVICE_TYPE_ENUM_ID = eINSTANCE.getPaymentGatewayResponse_PaymentServiceTypeEnumId();

		/**
		 * The meta object literal for the '<em><b>Reference Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_RESPONSE__REFERENCE_NUM = eINSTANCE.getPaymentGatewayResponse_ReferenceNum();

		/**
		 * The meta object literal for the '<em><b>Result Bad Card Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_RESPONSE__RESULT_BAD_CARD_NUMBER = eINSTANCE.getPaymentGatewayResponse_ResultBadCardNumber();

		/**
		 * The meta object literal for the '<em><b>Result Bad Expire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_RESPONSE__RESULT_BAD_EXPIRE = eINSTANCE.getPaymentGatewayResponse_ResultBadExpire();

		/**
		 * The meta object literal for the '<em><b>Result Declined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_RESPONSE__RESULT_DECLINED = eINSTANCE.getPaymentGatewayResponse_ResultDeclined();

		/**
		 * The meta object literal for the '<em><b>Result Nsf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_RESPONSE__RESULT_NSF = eINSTANCE.getPaymentGatewayResponse_ResultNsf();

		/**
		 * The meta object literal for the '<em><b>Sub Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_RESPONSE__SUB_REFERENCE = eINSTANCE.getPaymentGatewayResponse_SubReference();

		/**
		 * The meta object literal for the '<em><b>Trans Code Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_GATEWAY_RESPONSE__TRANS_CODE_ENUM_ID = eINSTANCE.getPaymentGatewayResponse_TransCodeEnumId();

		/**
		 * The meta object literal for the '<em><b>Transaction Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_RESPONSE__TRANSACTION_DATE = eINSTANCE.getPaymentGatewayResponse_TransactionDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySagePayImpl <em>Gateway Sage Pay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySagePayImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewaySagePay()
		 * @generated
		 */
		EClass PAYMENT_GATEWAY_SAGE_PAY = eINSTANCE.getPaymentGatewaySagePay();

		/**
		 * The meta object literal for the '<em><b>Payment Gateway Config Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_SAGE_PAY__PAYMENT_GATEWAY_CONFIG_ID = eINSTANCE.getPaymentGatewaySagePay_PaymentGatewayConfigId();

		/**
		 * The meta object literal for the '<em><b>Authentication Trans Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_SAGE_PAY__AUTHENTICATION_TRANS_TYPE = eINSTANCE.getPaymentGatewaySagePay_AuthenticationTransType();

		/**
		 * The meta object literal for the '<em><b>Authentication Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_SAGE_PAY__AUTHENTICATION_URL = eINSTANCE.getPaymentGatewaySagePay_AuthenticationUrl();

		/**
		 * The meta object literal for the '<em><b>Authorise Trans Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_SAGE_PAY__AUTHORISE_TRANS_TYPE = eINSTANCE.getPaymentGatewaySagePay_AuthoriseTransType();

		/**
		 * The meta object literal for the '<em><b>Authorise Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_SAGE_PAY__AUTHORISE_URL = eINSTANCE.getPaymentGatewaySagePay_AuthoriseUrl();

		/**
		 * The meta object literal for the '<em><b>Production Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_SAGE_PAY__PRODUCTION_HOST = eINSTANCE.getPaymentGatewaySagePay_ProductionHost();

		/**
		 * The meta object literal for the '<em><b>Protocol Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_SAGE_PAY__PROTOCOL_VERSION = eINSTANCE.getPaymentGatewaySagePay_ProtocolVersion();

		/**
		 * The meta object literal for the '<em><b>Refund Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_SAGE_PAY__REFUND_URL = eINSTANCE.getPaymentGatewaySagePay_RefundUrl();

		/**
		 * The meta object literal for the '<em><b>Release Trans Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_SAGE_PAY__RELEASE_TRANS_TYPE = eINSTANCE.getPaymentGatewaySagePay_ReleaseTransType();

		/**
		 * The meta object literal for the '<em><b>Release Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_SAGE_PAY__RELEASE_URL = eINSTANCE.getPaymentGatewaySagePay_ReleaseUrl();

		/**
		 * The meta object literal for the '<em><b>Sage Pay Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_SAGE_PAY__SAGE_PAY_MODE = eINSTANCE.getPaymentGatewaySagePay_SagePayMode();

		/**
		 * The meta object literal for the '<em><b>Testing Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_SAGE_PAY__TESTING_HOST = eINSTANCE.getPaymentGatewaySagePay_TestingHost();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_SAGE_PAY__VENDOR = eINSTANCE.getPaymentGatewaySagePay_Vendor();

		/**
		 * The meta object literal for the '<em><b>Void Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_SAGE_PAY__VOID_URL = eINSTANCE.getPaymentGatewaySagePay_VoidUrl();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySecurePayImpl <em>Gateway Secure Pay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySecurePayImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewaySecurePay()
		 * @generated
		 */
		EClass PAYMENT_GATEWAY_SECURE_PAY = eINSTANCE.getPaymentGatewaySecurePay();

		/**
		 * The meta object literal for the '<em><b>Payment Gateway Config Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_SECURE_PAY__PAYMENT_GATEWAY_CONFIG_ID = eINSTANCE.getPaymentGatewaySecurePay_PaymentGatewayConfigId();

		/**
		 * The meta object literal for the '<em><b>Enable Amount Round</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_SECURE_PAY__ENABLE_AMOUNT_ROUND = eINSTANCE.getPaymentGatewaySecurePay_EnableAmountRound();

		/**
		 * The meta object literal for the '<em><b>Merchant Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_SECURE_PAY__MERCHANT_ID = eINSTANCE.getPaymentGatewaySecurePay_MerchantId();

		/**
		 * The meta object literal for the '<em><b>Process Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_SECURE_PAY__PROCESS_TIMEOUT = eINSTANCE.getPaymentGatewaySecurePay_ProcessTimeout();

		/**
		 * The meta object literal for the '<em><b>Pwd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_SECURE_PAY__PWD = eINSTANCE.getPaymentGatewaySecurePay_Pwd();

		/**
		 * The meta object literal for the '<em><b>Server URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_SECURE_PAY__SERVER_URL = eINSTANCE.getPaymentGatewaySecurePay_ServerURL();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl <em>Gateway World Pay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayWorldPayImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGatewayWorldPay()
		 * @generated
		 */
		EClass PAYMENT_GATEWAY_WORLD_PAY = eINSTANCE.getPaymentGatewayWorldPay();

		/**
		 * The meta object literal for the '<em><b>Payment Gateway Config Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_WORLD_PAY__PAYMENT_GATEWAY_CONFIG_ID = eINSTANCE.getPaymentGatewayWorldPay_PaymentGatewayConfigId();

		/**
		 * The meta object literal for the '<em><b>Auth Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_WORLD_PAY__AUTH_MODE = eINSTANCE.getPaymentGatewayWorldPay_AuthMode();

		/**
		 * The meta object literal for the '<em><b>Fix Contact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_WORLD_PAY__FIX_CONTACT = eINSTANCE.getPaymentGatewayWorldPay_FixContact();

		/**
		 * The meta object literal for the '<em><b>Hide Contact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_WORLD_PAY__HIDE_CONTACT = eINSTANCE.getPaymentGatewayWorldPay_HideContact();

		/**
		 * The meta object literal for the '<em><b>Hide Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_WORLD_PAY__HIDE_CURRENCY = eINSTANCE.getPaymentGatewayWorldPay_HideCurrency();

		/**
		 * The meta object literal for the '<em><b>Inst Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_WORLD_PAY__INST_ID = eINSTANCE.getPaymentGatewayWorldPay_InstId();

		/**
		 * The meta object literal for the '<em><b>Lang Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_WORLD_PAY__LANG_ID = eINSTANCE.getPaymentGatewayWorldPay_LangId();

		/**
		 * The meta object literal for the '<em><b>No Language Menu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_WORLD_PAY__NO_LANGUAGE_MENU = eINSTANCE.getPaymentGatewayWorldPay_NoLanguageMenu();

		/**
		 * The meta object literal for the '<em><b>Redirect Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_WORLD_PAY__REDIRECT_URL = eINSTANCE.getPaymentGatewayWorldPay_RedirectUrl();

		/**
		 * The meta object literal for the '<em><b>Test Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_WORLD_PAY__TEST_MODE = eINSTANCE.getPaymentGatewayWorldPay_TestMode();

		/**
		 * The meta object literal for the '<em><b>With Delivery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY_WORLD_PAY__WITH_DELIVERY = eINSTANCE.getPaymentGatewayWorldPay_WithDelivery();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGlAccountTypeMapImpl <em>Gl Account Type Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGlAccountTypeMapImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGlAccountTypeMap()
		 * @generated
		 */
		EClass PAYMENT_GL_ACCOUNT_TYPE_MAP = eINSTANCE.getPaymentGlAccountTypeMap();

		/**
		 * The meta object literal for the '<em><b>Payment Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_GL_ACCOUNT_TYPE_MAP__PAYMENT_TYPE_ID = eINSTANCE.getPaymentGlAccountTypeMap_PaymentTypeId();

		/**
		 * The meta object literal for the '<em><b>Organization Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_GL_ACCOUNT_TYPE_MAP__ORGANIZATION_PARTY_ID = eINSTANCE.getPaymentGlAccountTypeMap_OrganizationPartyId();

		/**
		 * The meta object literal for the '<em><b>Gl Account Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_GL_ACCOUNT_TYPE_MAP__GL_ACCOUNT_TYPE_ID = eINSTANCE.getPaymentGlAccountTypeMap_GlAccountTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGroupImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGroup()
		 * @generated
		 */
		EClass PAYMENT_GROUP = eINSTANCE.getPaymentGroup();

		/**
		 * The meta object literal for the '<em><b>Payment Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GROUP__PAYMENT_GROUP_ID = eINSTANCE.getPaymentGroup_PaymentGroupId();

		/**
		 * The meta object literal for the '<em><b>Payment Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GROUP__PAYMENT_GROUP_NAME = eINSTANCE.getPaymentGroup_PaymentGroupName();

		/**
		 * The meta object literal for the '<em><b>Payment Group Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_GROUP__PAYMENT_GROUP_TYPE_ID = eINSTANCE.getPaymentGroup_PaymentGroupTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGroupMemberImpl <em>Group Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGroupMemberImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGroupMember()
		 * @generated
		 */
		EClass PAYMENT_GROUP_MEMBER = eINSTANCE.getPaymentGroupMember();

		/**
		 * The meta object literal for the '<em><b>Payment Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_GROUP_MEMBER__PAYMENT_GROUP_ID = eINSTANCE.getPaymentGroupMember_PaymentGroupId();

		/**
		 * The meta object literal for the '<em><b>Payment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_GROUP_MEMBER__PAYMENT_ID = eINSTANCE.getPaymentGroupMember_PaymentId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GROUP_MEMBER__FROM_DATE = eINSTANCE.getPaymentGroupMember_FromDate();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GROUP_MEMBER__SEQUENCE_NUM = eINSTANCE.getPaymentGroupMember_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GROUP_MEMBER__THRU_DATE = eINSTANCE.getPaymentGroupMember_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGroupTypeImpl <em>Group Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentGroupTypeImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentGroupType()
		 * @generated
		 */
		EClass PAYMENT_GROUP_TYPE = eINSTANCE.getPaymentGroupType();

		/**
		 * The meta object literal for the '<em><b>Payment Group Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GROUP_TYPE__PAYMENT_GROUP_TYPE_ID = eINSTANCE.getPaymentGroupType_PaymentGroupTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GROUP_TYPE__DESCRIPTION = eINSTANCE.getPaymentGroupType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GROUP_TYPE__HAS_TABLE = eINSTANCE.getPaymentGroupType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_GROUP_TYPE__PARENT_TYPE_ID = eINSTANCE.getPaymentGroupType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentMethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentMethodImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentMethod()
		 * @generated
		 */
		EClass PAYMENT_METHOD = eINSTANCE.getPaymentMethod();

		/**
		 * The meta object literal for the '<em><b>Payment Method Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_METHOD__PAYMENT_METHOD_ID = eINSTANCE.getPaymentMethod_PaymentMethodId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_METHOD__DESCRIPTION = eINSTANCE.getPaymentMethod_Description();

		/**
		 * The meta object literal for the '<em><b>Fin Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_METHOD__FIN_ACCOUNT_ID = eINSTANCE.getPaymentMethod_FinAccountId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_METHOD__FROM_DATE = eINSTANCE.getPaymentMethod_FromDate();

		/**
		 * The meta object literal for the '<em><b>Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_METHOD__GL_ACCOUNT_ID = eINSTANCE.getPaymentMethod_GlAccountId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_METHOD__PARTY_ID = eINSTANCE.getPaymentMethod_PartyId();

		/**
		 * The meta object literal for the '<em><b>Payment Method Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_METHOD__PAYMENT_METHOD_TYPE_ID = eINSTANCE.getPaymentMethod_PaymentMethodTypeId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_METHOD__THRU_DATE = eINSTANCE.getPaymentMethod_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentMethodTypeImpl <em>Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentMethodTypeImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentMethodType()
		 * @generated
		 */
		EClass PAYMENT_METHOD_TYPE = eINSTANCE.getPaymentMethodType();

		/**
		 * The meta object literal for the '<em><b>Payment Method Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_METHOD_TYPE__PAYMENT_METHOD_TYPE_ID = eINSTANCE.getPaymentMethodType_PaymentMethodTypeId();

		/**
		 * The meta object literal for the '<em><b>Default Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_METHOD_TYPE__DEFAULT_GL_ACCOUNT_ID = eINSTANCE.getPaymentMethodType_DefaultGlAccountId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_METHOD_TYPE__DESCRIPTION = eINSTANCE.getPaymentMethodType_Description();

		/**
		 * The meta object literal for the '<em><b>Payment Method Type Gl Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_METHOD_TYPE__PAYMENT_METHOD_TYPE_GL_ACCOUNTS = eINSTANCE.getPaymentMethodType_PaymentMethodTypeGlAccounts();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentMethodTypeGlAccountImpl <em>Method Type Gl Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentMethodTypeGlAccountImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentMethodTypeGlAccount()
		 * @generated
		 */
		EClass PAYMENT_METHOD_TYPE_GL_ACCOUNT = eINSTANCE.getPaymentMethodTypeGlAccount();

		/**
		 * The meta object literal for the '<em><b>Payment Method Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_METHOD_TYPE_GL_ACCOUNT__PAYMENT_METHOD_TYPE_ID = eINSTANCE.getPaymentMethodTypeGlAccount_PaymentMethodTypeId();

		/**
		 * The meta object literal for the '<em><b>Organization Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_METHOD_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID = eINSTANCE.getPaymentMethodTypeGlAccount_OrganizationPartyId();

		/**
		 * The meta object literal for the '<em><b>Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_METHOD_TYPE_GL_ACCOUNT__GL_ACCOUNT_ID = eINSTANCE.getPaymentMethodTypeGlAccount_GlAccountId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentTypeImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentType()
		 * @generated
		 */
		EClass PAYMENT_TYPE = eINSTANCE.getPaymentType();

		/**
		 * The meta object literal for the '<em><b>Payment Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_TYPE__PAYMENT_TYPE_ID = eINSTANCE.getPaymentType_PaymentTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_TYPE__DESCRIPTION = eINSTANCE.getPaymentType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_TYPE__HAS_TABLE = eINSTANCE.getPaymentType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_TYPE__PARENT_TYPE_ID = eINSTANCE.getPaymentType_ParentTypeId();

		/**
		 * The meta object literal for the '<em><b>Payment Gl Account Type Maps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_TYPE__PAYMENT_GL_ACCOUNT_TYPE_MAPS = eINSTANCE.getPaymentType_PaymentGlAccountTypeMaps();

		/**
		 * The meta object literal for the '<em><b>Payment Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_TYPE__PAYMENT_TYPE_ATTRS = eINSTANCE.getPaymentType_PaymentTypeAttrs();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentTypeAttrImpl <em>Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentTypeAttrImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getPaymentTypeAttr()
		 * @generated
		 */
		EClass PAYMENT_TYPE_ATTR = eINSTANCE.getPaymentTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Payment Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_TYPE_ATTR__PAYMENT_TYPE_ID = eINSTANCE.getPaymentTypeAttr_PaymentTypeId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_TYPE_ATTR__ATTR_NAME = eINSTANCE.getPaymentTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_TYPE_ATTR__DESCRIPTION = eINSTANCE.getPaymentTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.payment.impl.ValueLinkKeyImpl <em>Value Link Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.payment.impl.ValueLinkKeyImpl
		 * @see org.abchip.mimo.biz.accounting.payment.impl.PaymentPackageImpl#getValueLinkKey()
		 * @generated
		 */
		EClass VALUE_LINK_KEY = eINSTANCE.getValueLinkKey();

		/**
		 * The meta object literal for the '<em><b>Merchant Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_LINK_KEY__MERCHANT_ID = eINSTANCE.getValueLinkKey_MerchantId();

		/**
		 * The meta object literal for the '<em><b>Created By Terminal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_LINK_KEY__CREATED_BY_TERMINAL = eINSTANCE.getValueLinkKey_CreatedByTerminal();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_LINK_KEY__CREATED_BY_USER_LOGIN = eINSTANCE.getValueLinkKey_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_LINK_KEY__CREATED_DATE = eINSTANCE.getValueLinkKey_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Exchange Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_LINK_KEY__EXCHANGE_KEY = eINSTANCE.getValueLinkKey_ExchangeKey();

		/**
		 * The meta object literal for the '<em><b>Last Modified By Terminal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_LINK_KEY__LAST_MODIFIED_BY_TERMINAL = eINSTANCE.getValueLinkKey_LastModifiedByTerminal();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_LINK_KEY__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getValueLinkKey_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_LINK_KEY__LAST_MODIFIED_DATE = eINSTANCE.getValueLinkKey_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Last Working Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_LINK_KEY__LAST_WORKING_KEY = eINSTANCE.getValueLinkKey_LastWorkingKey();

		/**
		 * The meta object literal for the '<em><b>Private Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_LINK_KEY__PRIVATE_KEY = eINSTANCE.getValueLinkKey_PrivateKey();

		/**
		 * The meta object literal for the '<em><b>Public Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_LINK_KEY__PUBLIC_KEY = eINSTANCE.getValueLinkKey_PublicKey();

		/**
		 * The meta object literal for the '<em><b>Working Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_LINK_KEY__WORKING_KEY = eINSTANCE.getValueLinkKey_WorkingKey();

		/**
		 * The meta object literal for the '<em><b>Working Key Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_LINK_KEY__WORKING_KEY_INDEX = eINSTANCE.getValueLinkKey_WorkingKeyIndex();

	}

} //PaymentPackage
