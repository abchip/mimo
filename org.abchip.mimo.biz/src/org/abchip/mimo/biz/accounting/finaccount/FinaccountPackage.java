/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.finaccount;

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
 * @see org.abchip.mimo.biz.accounting.finaccount.FinaccountFactory
 * @model kind="package"
 * @generated
 */
public interface FinaccountPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "finaccount";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/accounting/finaccount";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-finaccount";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FinaccountPackage eINSTANCE = org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl <em>Fin Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl
	 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccount()
	 * @generated
	 */
	int FIN_ACCOUNT = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fin Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__FIN_ACCOUNT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__ACTUAL_BALANCE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Available Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__AVAILABLE_BALANCE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fin Account Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__FIN_ACCOUNT_ATTRIBUTES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fin Account Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__FIN_ACCOUNT_CODE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fin Account Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__FIN_ACCOUNT_NAME = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fin Account Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__FIN_ACCOUNT_PIN = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fin Account Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__FIN_ACCOUNT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__FROM_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is Refundable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__IS_REFUNDABLE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Organization Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__ORGANIZATION_PARTY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Owner Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__OWNER_PARTY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Post To Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__POST_TO_GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Replenish Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__REPLENISH_LEVEL = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Replenish Payment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__REPLENISH_PAYMENT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__STATUS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT__THRU_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Fin Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountAttributeImpl <em>Fin Account Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountAttributeImpl
	 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountAttribute()
	 * @generated
	 */
	int FIN_ACCOUNT_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ATTRIBUTE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ATTRIBUTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ATTRIBUTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ATTRIBUTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fin Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ATTRIBUTE__FIN_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ATTRIBUTE__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ATTRIBUTE__ATTR_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ATTRIBUTE__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Fin Account Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ATTRIBUTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountAuthImpl <em>Fin Account Auth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountAuthImpl
	 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountAuth()
	 * @generated
	 */
	int FIN_ACCOUNT_AUTH = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_AUTH__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_AUTH__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_AUTH__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_AUTH__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fin Account Auth Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_AUTH__FIN_ACCOUNT_AUTH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_AUTH__AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Authorization Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_AUTH__AUTHORIZATION_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_AUTH__CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fin Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_AUTH__FIN_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_AUTH__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_AUTH__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Fin Account Auth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_AUTH_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountRoleImpl <em>Fin Account Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountRoleImpl
	 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountRole()
	 * @generated
	 */
	int FIN_ACCOUNT_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ROLE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ROLE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ROLE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ROLE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fin Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ROLE__FIN_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ROLE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ROLE__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ROLE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ROLE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Fin Account Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_ROLE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountStatusImpl <em>Fin Account Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountStatusImpl
	 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountStatus()
	 * @generated
	 */
	int FIN_ACCOUNT_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_STATUS__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_STATUS__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_STATUS__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_STATUS__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fin Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_STATUS__FIN_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_STATUS__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_STATUS__STATUS_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Change By User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_STATUS__CHANGE_BY_USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_STATUS__STATUS_END_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Fin Account Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_STATUS_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl <em>Fin Account Trans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl
	 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountTrans()
	 * @generated
	 */
	int FIN_ACCOUNT_TRANS = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fin Account Trans Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__AMOUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__COMMENTS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__ENTRY_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fin Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__FIN_ACCOUNT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fin Account Trans Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_ATTRIBUTES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fin Account Trans Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Gl Reconciliation Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__GL_RECONCILIATION_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__ORDER_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__ORDER_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__PARTY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Payment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__PAYMENT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Performed By Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__PERFORMED_BY_PARTY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Reason Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__REASON_ENUM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__STATUS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Transaction Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS__TRANSACTION_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Fin Account Trans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransAttributeImpl <em>Fin Account Trans Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransAttributeImpl
	 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountTransAttribute()
	 * @generated
	 */
	int FIN_ACCOUNT_TRANS_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_ATTRIBUTE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_ATTRIBUTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_ATTRIBUTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_ATTRIBUTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fin Account Trans Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_ATTRIBUTE__FIN_ACCOUNT_TRANS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_ATTRIBUTE__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_ATTRIBUTE__ATTR_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_ATTRIBUTE__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Fin Account Trans Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_ATTRIBUTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransTypeImpl <em>Fin Account Trans Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransTypeImpl
	 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountTransType()
	 * @generated
	 */
	int FIN_ACCOUNT_TRANS_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fin Account Trans Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE__FIN_ACCOUNT_TRANS_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fin Account Trans Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE__FIN_ACCOUNT_TRANS_TYPE_ATTRS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Fin Account Trans Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransTypeAttrImpl <em>Fin Account Trans Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransTypeAttrImpl
	 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountTransTypeAttr()
	 * @generated
	 */
	int FIN_ACCOUNT_TRANS_TYPE_ATTR = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE_ATTR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE_ATTR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE_ATTR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE_ATTR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fin Account Trans Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE_ATTR__FIN_ACCOUNT_TRANS_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE_ATTR__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE_ATTR__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fin Account Trans Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TRANS_TYPE_ATTR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeImpl <em>Fin Account Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeImpl
	 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountType()
	 * @generated
	 */
	int FIN_ACCOUNT_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fin Account Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fin Account Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_ATTRS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fin Account Type Gl Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_GL_ACCOUNTS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Refundable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__IS_REFUNDABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Replenish Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE__REPLENISH_ENUM_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Fin Account Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeAttrImpl <em>Fin Account Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeAttrImpl
	 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountTypeAttr()
	 * @generated
	 */
	int FIN_ACCOUNT_TYPE_ATTR = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_ATTR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_ATTR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_ATTR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_ATTR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fin Account Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_ATTR__FIN_ACCOUNT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_ATTR__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_ATTR__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_ATTR__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Fin Account Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_ATTR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeGlAccountImpl <em>Fin Account Type Gl Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeGlAccountImpl
	 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountTypeGlAccount()
	 * @generated
	 */
	int FIN_ACCOUNT_TYPE_GL_ACCOUNT = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_GL_ACCOUNT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_GL_ACCOUNT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_GL_ACCOUNT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_GL_ACCOUNT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Fin Account Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_GL_ACCOUNT__FIN_ACCOUNT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organization Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_GL_ACCOUNT__GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Fin Account Type Gl Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_ACCOUNT_TYPE_GL_ACCOUNT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount <em>Fin Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin Account</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccount
	 * @generated
	 */
	EClass getFinAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFinAccountId <em>Fin Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fin Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFinAccountId()
	 * @see #getFinAccount()
	 * @generated
	 */
	EAttribute getFinAccount_FinAccountId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getActualBalance <em>Actual Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Balance</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccount#getActualBalance()
	 * @see #getFinAccount()
	 * @generated
	 */
	EAttribute getFinAccount_ActualBalance();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getAvailableBalance <em>Available Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Balance</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccount#getAvailableBalance()
	 * @see #getFinAccount()
	 * @generated
	 */
	EAttribute getFinAccount_AvailableBalance();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getCurrencyUomId <em>Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccount#getCurrencyUomId()
	 * @see #getFinAccount()
	 * @generated
	 */
	EReference getFinAccount_CurrencyUomId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFinAccountAttributes <em>Fin Account Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fin Account Attributes</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFinAccountAttributes()
	 * @see #getFinAccount()
	 * @generated
	 */
	EReference getFinAccount_FinAccountAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFinAccountCode <em>Fin Account Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fin Account Code</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFinAccountCode()
	 * @see #getFinAccount()
	 * @generated
	 */
	EAttribute getFinAccount_FinAccountCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFinAccountName <em>Fin Account Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fin Account Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFinAccountName()
	 * @see #getFinAccount()
	 * @generated
	 */
	EAttribute getFinAccount_FinAccountName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFinAccountPin <em>Fin Account Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fin Account Pin</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFinAccountPin()
	 * @see #getFinAccount()
	 * @generated
	 */
	EAttribute getFinAccount_FinAccountPin();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFinAccountTypeId <em>Fin Account Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFinAccountTypeId()
	 * @see #getFinAccount()
	 * @generated
	 */
	EReference getFinAccount_FinAccountTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccount#getFromDate()
	 * @see #getFinAccount()
	 * @generated
	 */
	EAttribute getFinAccount_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#isIsRefundable <em>Is Refundable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Refundable</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccount#isIsRefundable()
	 * @see #getFinAccount()
	 * @generated
	 */
	EAttribute getFinAccount_IsRefundable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getOrganizationPartyId <em>Organization Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccount#getOrganizationPartyId()
	 * @see #getFinAccount()
	 * @generated
	 */
	EReference getFinAccount_OrganizationPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getOwnerPartyId <em>Owner Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccount#getOwnerPartyId()
	 * @see #getFinAccount()
	 * @generated
	 */
	EReference getFinAccount_OwnerPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getPostToGlAccountId <em>Post To Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Post To Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccount#getPostToGlAccountId()
	 * @see #getFinAccount()
	 * @generated
	 */
	EReference getFinAccount_PostToGlAccountId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getReplenishLevel <em>Replenish Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replenish Level</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccount#getReplenishLevel()
	 * @see #getFinAccount()
	 * @generated
	 */
	EAttribute getFinAccount_ReplenishLevel();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getReplenishPaymentId <em>Replenish Payment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Replenish Payment Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccount#getReplenishPaymentId()
	 * @see #getFinAccount()
	 * @generated
	 */
	EReference getFinAccount_ReplenishPaymentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccount#getStatusId()
	 * @see #getFinAccount()
	 * @generated
	 */
	EAttribute getFinAccount_StatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccount#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccount#getThruDate()
	 * @see #getFinAccount()
	 * @generated
	 */
	EAttribute getFinAccount_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountAttribute <em>Fin Account Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin Account Attribute</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountAttribute
	 * @generated
	 */
	EClass getFinAccountAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountAttribute#getFinAccountId <em>Fin Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountAttribute#getFinAccountId()
	 * @see #getFinAccountAttribute()
	 * @generated
	 */
	EReference getFinAccountAttribute_FinAccountId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountAttribute#getAttrName()
	 * @see #getFinAccountAttribute()
	 * @generated
	 */
	EAttribute getFinAccountAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountAttribute#getAttrDescription()
	 * @see #getFinAccountAttribute()
	 * @generated
	 */
	EAttribute getFinAccountAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountAttribute#getAttrValue()
	 * @see #getFinAccountAttribute()
	 * @generated
	 */
	EAttribute getFinAccountAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountAuth <em>Fin Account Auth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin Account Auth</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountAuth
	 * @generated
	 */
	EClass getFinAccountAuth();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountAuth#getFinAccountAuthId <em>Fin Account Auth Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fin Account Auth Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountAuth#getFinAccountAuthId()
	 * @see #getFinAccountAuth()
	 * @generated
	 */
	EAttribute getFinAccountAuth_FinAccountAuthId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountAuth#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountAuth#getAmount()
	 * @see #getFinAccountAuth()
	 * @generated
	 */
	EAttribute getFinAccountAuth_Amount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountAuth#getAuthorizationDate <em>Authorization Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountAuth#getAuthorizationDate()
	 * @see #getFinAccountAuth()
	 * @generated
	 */
	EAttribute getFinAccountAuth_AuthorizationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountAuth#getCurrencyUomId <em>Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountAuth#getCurrencyUomId()
	 * @see #getFinAccountAuth()
	 * @generated
	 */
	EAttribute getFinAccountAuth_CurrencyUomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountAuth#getFinAccountId <em>Fin Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountAuth#getFinAccountId()
	 * @see #getFinAccountAuth()
	 * @generated
	 */
	EReference getFinAccountAuth_FinAccountId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountAuth#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountAuth#getFromDate()
	 * @see #getFinAccountAuth()
	 * @generated
	 */
	EAttribute getFinAccountAuth_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountAuth#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountAuth#getThruDate()
	 * @see #getFinAccountAuth()
	 * @generated
	 */
	EAttribute getFinAccountAuth_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountRole <em>Fin Account Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin Account Role</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountRole
	 * @generated
	 */
	EClass getFinAccountRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountRole#getFinAccountId <em>Fin Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountRole#getFinAccountId()
	 * @see #getFinAccountRole()
	 * @generated
	 */
	EReference getFinAccountRole_FinAccountId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountRole#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountRole#getPartyId()
	 * @see #getFinAccountRole()
	 * @generated
	 */
	EReference getFinAccountRole_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountRole#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountRole#getRoleTypeId()
	 * @see #getFinAccountRole()
	 * @generated
	 */
	EReference getFinAccountRole_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountRole#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountRole#getFromDate()
	 * @see #getFinAccountRole()
	 * @generated
	 */
	EAttribute getFinAccountRole_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountRole#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountRole#getThruDate()
	 * @see #getFinAccountRole()
	 * @generated
	 */
	EAttribute getFinAccountRole_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountStatus <em>Fin Account Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin Account Status</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountStatus
	 * @generated
	 */
	EClass getFinAccountStatus();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountStatus#getFinAccountId <em>Fin Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountStatus#getFinAccountId()
	 * @see #getFinAccountStatus()
	 * @generated
	 */
	EReference getFinAccountStatus_FinAccountId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountStatus#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountStatus#getStatusId()
	 * @see #getFinAccountStatus()
	 * @generated
	 */
	EReference getFinAccountStatus_StatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountStatus#getStatusDate <em>Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountStatus#getStatusDate()
	 * @see #getFinAccountStatus()
	 * @generated
	 */
	EAttribute getFinAccountStatus_StatusDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountStatus#getChangeByUserLoginId <em>Change By User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change By User Login Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountStatus#getChangeByUserLoginId()
	 * @see #getFinAccountStatus()
	 * @generated
	 */
	EReference getFinAccountStatus_ChangeByUserLoginId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountStatus#getStatusEndDate <em>Status End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status End Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountStatus#getStatusEndDate()
	 * @see #getFinAccountStatus()
	 * @generated
	 */
	EAttribute getFinAccountStatus_StatusEndDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans <em>Fin Account Trans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin Account Trans</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans
	 * @generated
	 */
	EClass getFinAccountTrans();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getFinAccountTransId <em>Fin Account Trans Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fin Account Trans Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getFinAccountTransId()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EAttribute getFinAccountTrans_FinAccountTransId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getAmount()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EAttribute getFinAccountTrans_Amount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getComments()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EAttribute getFinAccountTrans_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getEntryDate <em>Entry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getEntryDate()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EAttribute getFinAccountTrans_EntryDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getFinAccountId <em>Fin Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getFinAccountId()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EReference getFinAccountTrans_FinAccountId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getFinAccountTransAttributes <em>Fin Account Trans Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fin Account Trans Attributes</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getFinAccountTransAttributes()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EReference getFinAccountTrans_FinAccountTransAttributes();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getFinAccountTransTypeId <em>Fin Account Trans Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account Trans Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getFinAccountTransTypeId()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EReference getFinAccountTrans_FinAccountTransTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getGlReconciliationId <em>Gl Reconciliation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Reconciliation Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getGlReconciliationId()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EReference getFinAccountTrans_GlReconciliationId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getOrderId()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EAttribute getFinAccountTrans_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getOrderItemSeqId()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EAttribute getFinAccountTrans_OrderItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getPartyId()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EReference getFinAccountTrans_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getPaymentId <em>Payment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getPaymentId()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EReference getFinAccountTrans_PaymentId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getPerformedByPartyId <em>Performed By Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Performed By Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getPerformedByPartyId()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EReference getFinAccountTrans_PerformedByPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getReasonEnumId <em>Reason Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reason Enum Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getReasonEnumId()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EReference getFinAccountTrans_ReasonEnumId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getStatusId()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EReference getFinAccountTrans_StatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getTransactionDate <em>Transaction Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Date</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans#getTransactionDate()
	 * @see #getFinAccountTrans()
	 * @generated
	 */
	EAttribute getFinAccountTrans_TransactionDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTransAttribute <em>Fin Account Trans Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin Account Trans Attribute</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTransAttribute
	 * @generated
	 */
	EClass getFinAccountTransAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTransAttribute#getFinAccountTransId <em>Fin Account Trans Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account Trans Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTransAttribute#getFinAccountTransId()
	 * @see #getFinAccountTransAttribute()
	 * @generated
	 */
	EReference getFinAccountTransAttribute_FinAccountTransId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTransAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTransAttribute#getAttrName()
	 * @see #getFinAccountTransAttribute()
	 * @generated
	 */
	EAttribute getFinAccountTransAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTransAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTransAttribute#getAttrDescription()
	 * @see #getFinAccountTransAttribute()
	 * @generated
	 */
	EAttribute getFinAccountTransAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTransAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTransAttribute#getAttrValue()
	 * @see #getFinAccountTransAttribute()
	 * @generated
	 */
	EAttribute getFinAccountTransAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTransType <em>Fin Account Trans Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin Account Trans Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTransType
	 * @generated
	 */
	EClass getFinAccountTransType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTransType#getFinAccountTransTypeId <em>Fin Account Trans Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fin Account Trans Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTransType#getFinAccountTransTypeId()
	 * @see #getFinAccountTransType()
	 * @generated
	 */
	EAttribute getFinAccountTransType_FinAccountTransTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTransType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTransType#getDescription()
	 * @see #getFinAccountTransType()
	 * @generated
	 */
	EAttribute getFinAccountTransType_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTransType#getFinAccountTransTypeAttrs <em>Fin Account Trans Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fin Account Trans Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTransType#getFinAccountTransTypeAttrs()
	 * @see #getFinAccountTransType()
	 * @generated
	 */
	EReference getFinAccountTransType_FinAccountTransTypeAttrs();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTransType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTransType#isHasTable()
	 * @see #getFinAccountTransType()
	 * @generated
	 */
	EAttribute getFinAccountTransType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTransType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTransType#getParentTypeId()
	 * @see #getFinAccountTransType()
	 * @generated
	 */
	EReference getFinAccountTransType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTransTypeAttr <em>Fin Account Trans Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin Account Trans Type Attr</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTransTypeAttr
	 * @generated
	 */
	EClass getFinAccountTransTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTransTypeAttr#getFinAccountTransTypeId <em>Fin Account Trans Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account Trans Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTransTypeAttr#getFinAccountTransTypeId()
	 * @see #getFinAccountTransTypeAttr()
	 * @generated
	 */
	EReference getFinAccountTransTypeAttr_FinAccountTransTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTransTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTransTypeAttr#getAttrName()
	 * @see #getFinAccountTransTypeAttr()
	 * @generated
	 */
	EAttribute getFinAccountTransTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTransTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTransTypeAttr#getDescription()
	 * @see #getFinAccountTransTypeAttr()
	 * @generated
	 */
	EAttribute getFinAccountTransTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountType <em>Fin Account Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin Account Type</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountType
	 * @generated
	 */
	EClass getFinAccountType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountType#getFinAccountTypeId <em>Fin Account Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fin Account Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountType#getFinAccountTypeId()
	 * @see #getFinAccountType()
	 * @generated
	 */
	EAttribute getFinAccountType_FinAccountTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountType#getDescription()
	 * @see #getFinAccountType()
	 * @generated
	 */
	EAttribute getFinAccountType_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountType#getFinAccountTypeAttrs <em>Fin Account Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fin Account Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountType#getFinAccountTypeAttrs()
	 * @see #getFinAccountType()
	 * @generated
	 */
	EReference getFinAccountType_FinAccountTypeAttrs();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountType#getFinAccountTypeGlAccounts <em>Fin Account Type Gl Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fin Account Type Gl Accounts</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountType#getFinAccountTypeGlAccounts()
	 * @see #getFinAccountType()
	 * @generated
	 */
	EReference getFinAccountType_FinAccountTypeGlAccounts();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountType#isHasTable()
	 * @see #getFinAccountType()
	 * @generated
	 */
	EAttribute getFinAccountType_HasTable();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountType#isIsRefundable <em>Is Refundable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Refundable</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountType#isIsRefundable()
	 * @see #getFinAccountType()
	 * @generated
	 */
	EAttribute getFinAccountType_IsRefundable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountType#getParentTypeId()
	 * @see #getFinAccountType()
	 * @generated
	 */
	EReference getFinAccountType_ParentTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountType#getReplenishEnumId <em>Replenish Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Replenish Enum Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountType#getReplenishEnumId()
	 * @see #getFinAccountType()
	 * @generated
	 */
	EReference getFinAccountType_ReplenishEnumId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTypeAttr <em>Fin Account Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin Account Type Attr</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTypeAttr
	 * @generated
	 */
	EClass getFinAccountTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTypeAttr#getFinAccountTypeId <em>Fin Account Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTypeAttr#getFinAccountTypeId()
	 * @see #getFinAccountTypeAttr()
	 * @generated
	 */
	EReference getFinAccountTypeAttr_FinAccountTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTypeAttr#getAttrName()
	 * @see #getFinAccountTypeAttr()
	 * @generated
	 */
	EAttribute getFinAccountTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTypeAttr#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTypeAttr#getAttrValue()
	 * @see #getFinAccountTypeAttr()
	 * @generated
	 */
	EAttribute getFinAccountTypeAttr_AttrValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTypeAttr#getDescription()
	 * @see #getFinAccountTypeAttr()
	 * @generated
	 */
	EAttribute getFinAccountTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTypeGlAccount <em>Fin Account Type Gl Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin Account Type Gl Account</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTypeGlAccount
	 * @generated
	 */
	EClass getFinAccountTypeGlAccount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTypeGlAccount#getFinAccountTypeId <em>Fin Account Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account Type Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTypeGlAccount#getFinAccountTypeId()
	 * @see #getFinAccountTypeGlAccount()
	 * @generated
	 */
	EReference getFinAccountTypeGlAccount_FinAccountTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTypeGlAccount#getOrganizationPartyId <em>Organization Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Party Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTypeGlAccount#getOrganizationPartyId()
	 * @see #getFinAccountTypeGlAccount()
	 * @generated
	 */
	EReference getFinAccountTypeGlAccount_OrganizationPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.accounting.finaccount.FinAccountTypeGlAccount#getGlAccountId <em>Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.accounting.finaccount.FinAccountTypeGlAccount#getGlAccountId()
	 * @see #getFinAccountTypeGlAccount()
	 * @generated
	 */
	EReference getFinAccountTypeGlAccount_GlAccountId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FinaccountFactory getFinaccountFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl <em>Fin Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountImpl
		 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccount()
		 * @generated
		 */
		EClass FIN_ACCOUNT = eINSTANCE.getFinAccount();

		/**
		 * The meta object literal for the '<em><b>Fin Account Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT__FIN_ACCOUNT_ID = eINSTANCE.getFinAccount_FinAccountId();

		/**
		 * The meta object literal for the '<em><b>Actual Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT__ACTUAL_BALANCE = eINSTANCE.getFinAccount_ActualBalance();

		/**
		 * The meta object literal for the '<em><b>Available Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT__AVAILABLE_BALANCE = eINSTANCE.getFinAccount_AvailableBalance();

		/**
		 * The meta object literal for the '<em><b>Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT__CURRENCY_UOM_ID = eINSTANCE.getFinAccount_CurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Fin Account Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT__FIN_ACCOUNT_ATTRIBUTES = eINSTANCE.getFinAccount_FinAccountAttributes();

		/**
		 * The meta object literal for the '<em><b>Fin Account Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT__FIN_ACCOUNT_CODE = eINSTANCE.getFinAccount_FinAccountCode();

		/**
		 * The meta object literal for the '<em><b>Fin Account Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT__FIN_ACCOUNT_NAME = eINSTANCE.getFinAccount_FinAccountName();

		/**
		 * The meta object literal for the '<em><b>Fin Account Pin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT__FIN_ACCOUNT_PIN = eINSTANCE.getFinAccount_FinAccountPin();

		/**
		 * The meta object literal for the '<em><b>Fin Account Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT__FIN_ACCOUNT_TYPE_ID = eINSTANCE.getFinAccount_FinAccountTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT__FROM_DATE = eINSTANCE.getFinAccount_FromDate();

		/**
		 * The meta object literal for the '<em><b>Is Refundable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT__IS_REFUNDABLE = eINSTANCE.getFinAccount_IsRefundable();

		/**
		 * The meta object literal for the '<em><b>Organization Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT__ORGANIZATION_PARTY_ID = eINSTANCE.getFinAccount_OrganizationPartyId();

		/**
		 * The meta object literal for the '<em><b>Owner Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT__OWNER_PARTY_ID = eINSTANCE.getFinAccount_OwnerPartyId();

		/**
		 * The meta object literal for the '<em><b>Post To Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT__POST_TO_GL_ACCOUNT_ID = eINSTANCE.getFinAccount_PostToGlAccountId();

		/**
		 * The meta object literal for the '<em><b>Replenish Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT__REPLENISH_LEVEL = eINSTANCE.getFinAccount_ReplenishLevel();

		/**
		 * The meta object literal for the '<em><b>Replenish Payment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT__REPLENISH_PAYMENT_ID = eINSTANCE.getFinAccount_ReplenishPaymentId();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT__STATUS_ID = eINSTANCE.getFinAccount_StatusId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT__THRU_DATE = eINSTANCE.getFinAccount_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountAttributeImpl <em>Fin Account Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountAttributeImpl
		 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountAttribute()
		 * @generated
		 */
		EClass FIN_ACCOUNT_ATTRIBUTE = eINSTANCE.getFinAccountAttribute();

		/**
		 * The meta object literal for the '<em><b>Fin Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_ATTRIBUTE__FIN_ACCOUNT_ID = eINSTANCE.getFinAccountAttribute_FinAccountId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_ATTRIBUTE__ATTR_NAME = eINSTANCE.getFinAccountAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getFinAccountAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getFinAccountAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountAuthImpl <em>Fin Account Auth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountAuthImpl
		 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountAuth()
		 * @generated
		 */
		EClass FIN_ACCOUNT_AUTH = eINSTANCE.getFinAccountAuth();

		/**
		 * The meta object literal for the '<em><b>Fin Account Auth Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_AUTH__FIN_ACCOUNT_AUTH_ID = eINSTANCE.getFinAccountAuth_FinAccountAuthId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_AUTH__AMOUNT = eINSTANCE.getFinAccountAuth_Amount();

		/**
		 * The meta object literal for the '<em><b>Authorization Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_AUTH__AUTHORIZATION_DATE = eINSTANCE.getFinAccountAuth_AuthorizationDate();

		/**
		 * The meta object literal for the '<em><b>Currency Uom Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_AUTH__CURRENCY_UOM_ID = eINSTANCE.getFinAccountAuth_CurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Fin Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_AUTH__FIN_ACCOUNT_ID = eINSTANCE.getFinAccountAuth_FinAccountId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_AUTH__FROM_DATE = eINSTANCE.getFinAccountAuth_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_AUTH__THRU_DATE = eINSTANCE.getFinAccountAuth_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountRoleImpl <em>Fin Account Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountRoleImpl
		 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountRole()
		 * @generated
		 */
		EClass FIN_ACCOUNT_ROLE = eINSTANCE.getFinAccountRole();

		/**
		 * The meta object literal for the '<em><b>Fin Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_ROLE__FIN_ACCOUNT_ID = eINSTANCE.getFinAccountRole_FinAccountId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_ROLE__PARTY_ID = eINSTANCE.getFinAccountRole_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_ROLE__ROLE_TYPE_ID = eINSTANCE.getFinAccountRole_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_ROLE__FROM_DATE = eINSTANCE.getFinAccountRole_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_ROLE__THRU_DATE = eINSTANCE.getFinAccountRole_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountStatusImpl <em>Fin Account Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountStatusImpl
		 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountStatus()
		 * @generated
		 */
		EClass FIN_ACCOUNT_STATUS = eINSTANCE.getFinAccountStatus();

		/**
		 * The meta object literal for the '<em><b>Fin Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_STATUS__FIN_ACCOUNT_ID = eINSTANCE.getFinAccountStatus_FinAccountId();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_STATUS__STATUS_ID = eINSTANCE.getFinAccountStatus_StatusId();

		/**
		 * The meta object literal for the '<em><b>Status Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_STATUS__STATUS_DATE = eINSTANCE.getFinAccountStatus_StatusDate();

		/**
		 * The meta object literal for the '<em><b>Change By User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_STATUS__CHANGE_BY_USER_LOGIN_ID = eINSTANCE.getFinAccountStatus_ChangeByUserLoginId();

		/**
		 * The meta object literal for the '<em><b>Status End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_STATUS__STATUS_END_DATE = eINSTANCE.getFinAccountStatus_StatusEndDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl <em>Fin Account Trans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransImpl
		 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountTrans()
		 * @generated
		 */
		EClass FIN_ACCOUNT_TRANS = eINSTANCE.getFinAccountTrans();

		/**
		 * The meta object literal for the '<em><b>Fin Account Trans Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_ID = eINSTANCE.getFinAccountTrans_FinAccountTransId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS__AMOUNT = eINSTANCE.getFinAccountTrans_Amount();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS__COMMENTS = eINSTANCE.getFinAccountTrans_Comments();

		/**
		 * The meta object literal for the '<em><b>Entry Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS__ENTRY_DATE = eINSTANCE.getFinAccountTrans_EntryDate();

		/**
		 * The meta object literal for the '<em><b>Fin Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS__FIN_ACCOUNT_ID = eINSTANCE.getFinAccountTrans_FinAccountId();

		/**
		 * The meta object literal for the '<em><b>Fin Account Trans Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_ATTRIBUTES = eINSTANCE.getFinAccountTrans_FinAccountTransAttributes();

		/**
		 * The meta object literal for the '<em><b>Fin Account Trans Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS__FIN_ACCOUNT_TRANS_TYPE_ID = eINSTANCE.getFinAccountTrans_FinAccountTransTypeId();

		/**
		 * The meta object literal for the '<em><b>Gl Reconciliation Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS__GL_RECONCILIATION_ID = eINSTANCE.getFinAccountTrans_GlReconciliationId();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS__ORDER_ID = eINSTANCE.getFinAccountTrans_OrderId();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS__ORDER_ITEM_SEQ_ID = eINSTANCE.getFinAccountTrans_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS__PARTY_ID = eINSTANCE.getFinAccountTrans_PartyId();

		/**
		 * The meta object literal for the '<em><b>Payment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS__PAYMENT_ID = eINSTANCE.getFinAccountTrans_PaymentId();

		/**
		 * The meta object literal for the '<em><b>Performed By Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS__PERFORMED_BY_PARTY_ID = eINSTANCE.getFinAccountTrans_PerformedByPartyId();

		/**
		 * The meta object literal for the '<em><b>Reason Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS__REASON_ENUM_ID = eINSTANCE.getFinAccountTrans_ReasonEnumId();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS__STATUS_ID = eINSTANCE.getFinAccountTrans_StatusId();

		/**
		 * The meta object literal for the '<em><b>Transaction Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS__TRANSACTION_DATE = eINSTANCE.getFinAccountTrans_TransactionDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransAttributeImpl <em>Fin Account Trans Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransAttributeImpl
		 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountTransAttribute()
		 * @generated
		 */
		EClass FIN_ACCOUNT_TRANS_ATTRIBUTE = eINSTANCE.getFinAccountTransAttribute();

		/**
		 * The meta object literal for the '<em><b>Fin Account Trans Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS_ATTRIBUTE__FIN_ACCOUNT_TRANS_ID = eINSTANCE.getFinAccountTransAttribute_FinAccountTransId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS_ATTRIBUTE__ATTR_NAME = eINSTANCE.getFinAccountTransAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getFinAccountTransAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getFinAccountTransAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransTypeImpl <em>Fin Account Trans Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransTypeImpl
		 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountTransType()
		 * @generated
		 */
		EClass FIN_ACCOUNT_TRANS_TYPE = eINSTANCE.getFinAccountTransType();

		/**
		 * The meta object literal for the '<em><b>Fin Account Trans Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS_TYPE__FIN_ACCOUNT_TRANS_TYPE_ID = eINSTANCE.getFinAccountTransType_FinAccountTransTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS_TYPE__DESCRIPTION = eINSTANCE.getFinAccountTransType_Description();

		/**
		 * The meta object literal for the '<em><b>Fin Account Trans Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS_TYPE__FIN_ACCOUNT_TRANS_TYPE_ATTRS = eINSTANCE.getFinAccountTransType_FinAccountTransTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS_TYPE__HAS_TABLE = eINSTANCE.getFinAccountTransType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS_TYPE__PARENT_TYPE_ID = eINSTANCE.getFinAccountTransType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransTypeAttrImpl <em>Fin Account Trans Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTransTypeAttrImpl
		 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountTransTypeAttr()
		 * @generated
		 */
		EClass FIN_ACCOUNT_TRANS_TYPE_ATTR = eINSTANCE.getFinAccountTransTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Fin Account Trans Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TRANS_TYPE_ATTR__FIN_ACCOUNT_TRANS_TYPE_ID = eINSTANCE.getFinAccountTransTypeAttr_FinAccountTransTypeId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS_TYPE_ATTR__ATTR_NAME = eINSTANCE.getFinAccountTransTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TRANS_TYPE_ATTR__DESCRIPTION = eINSTANCE.getFinAccountTransTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeImpl <em>Fin Account Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeImpl
		 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountType()
		 * @generated
		 */
		EClass FIN_ACCOUNT_TYPE = eINSTANCE.getFinAccountType();

		/**
		 * The meta object literal for the '<em><b>Fin Account Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_ID = eINSTANCE.getFinAccountType_FinAccountTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TYPE__DESCRIPTION = eINSTANCE.getFinAccountType_Description();

		/**
		 * The meta object literal for the '<em><b>Fin Account Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_ATTRS = eINSTANCE.getFinAccountType_FinAccountTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Fin Account Type Gl Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TYPE__FIN_ACCOUNT_TYPE_GL_ACCOUNTS = eINSTANCE.getFinAccountType_FinAccountTypeGlAccounts();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TYPE__HAS_TABLE = eINSTANCE.getFinAccountType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Is Refundable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TYPE__IS_REFUNDABLE = eINSTANCE.getFinAccountType_IsRefundable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TYPE__PARENT_TYPE_ID = eINSTANCE.getFinAccountType_ParentTypeId();

		/**
		 * The meta object literal for the '<em><b>Replenish Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TYPE__REPLENISH_ENUM_ID = eINSTANCE.getFinAccountType_ReplenishEnumId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeAttrImpl <em>Fin Account Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeAttrImpl
		 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountTypeAttr()
		 * @generated
		 */
		EClass FIN_ACCOUNT_TYPE_ATTR = eINSTANCE.getFinAccountTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Fin Account Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TYPE_ATTR__FIN_ACCOUNT_TYPE_ID = eINSTANCE.getFinAccountTypeAttr_FinAccountTypeId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TYPE_ATTR__ATTR_NAME = eINSTANCE.getFinAccountTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TYPE_ATTR__ATTR_VALUE = eINSTANCE.getFinAccountTypeAttr_AttrValue();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN_ACCOUNT_TYPE_ATTR__DESCRIPTION = eINSTANCE.getFinAccountTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeGlAccountImpl <em>Fin Account Type Gl Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeGlAccountImpl
		 * @see org.abchip.mimo.biz.accounting.finaccount.impl.FinaccountPackageImpl#getFinAccountTypeGlAccount()
		 * @generated
		 */
		EClass FIN_ACCOUNT_TYPE_GL_ACCOUNT = eINSTANCE.getFinAccountTypeGlAccount();

		/**
		 * The meta object literal for the '<em><b>Fin Account Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TYPE_GL_ACCOUNT__FIN_ACCOUNT_TYPE_ID = eINSTANCE.getFinAccountTypeGlAccount_FinAccountTypeId();

		/**
		 * The meta object literal for the '<em><b>Organization Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID = eINSTANCE.getFinAccountTypeGlAccount_OrganizationPartyId();

		/**
		 * The meta object literal for the '<em><b>Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIN_ACCOUNT_TYPE_GL_ACCOUNT__GL_ACCOUNT_ID = eINSTANCE.getFinAccountTypeGlAccount_GlAccountId();

	}

} //FinaccountPackage
