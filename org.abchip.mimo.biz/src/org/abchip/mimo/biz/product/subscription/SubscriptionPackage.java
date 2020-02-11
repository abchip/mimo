/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.subscription;

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
 * @see org.abchip.mimo.biz.product.subscription.SubscriptionFactory
 * @model kind="package"
 * @generated
 */
public interface SubscriptionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "subscription";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/product/subscription";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-subscription";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubscriptionPackage eINSTANCE = org.abchip.mimo.biz.product.subscription.impl.SubscriptionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.subscription.impl.ProductSubscriptionResourceImpl <em>Product Subscription Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.subscription.impl.ProductSubscriptionResourceImpl
	 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionPackageImpl#getProductSubscriptionResource()
	 * @generated
	 */
	int PRODUCT_SUBSCRIPTION_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUBSCRIPTION_RESOURCE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUBSCRIPTION_RESOURCE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUBSCRIPTION_RESOURCE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUBSCRIPTION_RESOURCE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUBSCRIPTION_RESOURCE__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subscription Resource Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUBSCRIPTION_RESOURCE__SUBSCRIPTION_RESOURCE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUBSCRIPTION_RESOURCE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Automatic Extend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUBSCRIPTION_RESOURCE__AUTOMATIC_EXTEND = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Available Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUBSCRIPTION_RESOURCE__AVAILABLE_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Available Time Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUBSCRIPTION_RESOURCE__AVAILABLE_TIME_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cancl Autm Ext Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUBSCRIPTION_RESOURCE__CANCL_AUTM_EXT_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cancl Autm Ext Time Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUBSCRIPTION_RESOURCE__CANCL_AUTM_EXT_TIME_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Grace Period On Expiry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUBSCRIPTION_RESOURCE__GRACE_PERIOD_ON_EXPIRY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Grace Period On Expiry Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUBSCRIPTION_RESOURCE__GRACE_PERIOD_ON_EXPIRY_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Max Life Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUBSCRIPTION_RESOURCE__MAX_LIFE_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Max Life Time Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUBSCRIPTION_RESOURCE__MAX_LIFE_TIME_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Purchase From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUBSCRIPTION_RESOURCE__PURCHASE_FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Purchase Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUBSCRIPTION_RESOURCE__PURCHASE_THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUBSCRIPTION_RESOURCE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Use Count Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUBSCRIPTION_RESOURCE__USE_COUNT_LIMIT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Use Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUBSCRIPTION_RESOURCE__USE_ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Use Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUBSCRIPTION_RESOURCE__USE_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Use Time Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUBSCRIPTION_RESOURCE__USE_TIME_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Product Subscription Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SUBSCRIPTION_RESOURCE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl <em>Subscription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl
	 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionPackageImpl#getSubscription()
	 * @generated
	 */
	int SUBSCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Subscription Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__SUBSCRIPTION_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Automatic Extend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__AUTOMATIC_EXTEND = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Available Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__AVAILABLE_TIME = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Available Time Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__AVAILABLE_TIME_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cancl Autm Ext Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__CANCL_AUTM_EXT_TIME = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cancl Autm Ext Time Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__CANCL_AUTM_EXT_TIME_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Communication Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__COMMUNICATION_EVENT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Expiration Completed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__EXPIRATION_COMPLETED_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>External Subscription Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__EXTERNAL_SUBSCRIPTION_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__FROM_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Grace Period On Expiry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Grace Period On Expiry Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Inventory Item Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__INVENTORY_ITEM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Max Life Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__MAX_LIFE_TIME = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Max Life Time Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__MAX_LIFE_TIME_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Need Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__NEED_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__ORDER_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__ORDER_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Originated From Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__ORIGINATED_FROM_PARTY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Originated From Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__ORIGINATED_FROM_ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__PARTY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Party Need Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__PARTY_NEED_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Product Category Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__PRODUCT_CATEGORY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__PRODUCT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Purchase From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__PURCHASE_FROM_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Purchase Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__PURCHASE_THRU_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Subscription Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__SUBSCRIPTION_ATTRIBUTES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Subscription Comm Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__SUBSCRIPTION_COMM_EVENTS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Subscription Resource Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__SUBSCRIPTION_RESOURCE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Subscription Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__SUBSCRIPTION_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__THRU_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Use Count Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__USE_COUNT_LIMIT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Use Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__USE_TIME = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Use Time Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION__USE_TIME_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 36;

	/**
	 * The number of structural features of the '<em>Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 37;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionActivityImpl
	 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionPackageImpl#getSubscriptionActivity()
	 * @generated
	 */
	int SUBSCRIPTION_ACTIVITY = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_ACTIVITY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_ACTIVITY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_ACTIVITY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_ACTIVITY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Subscription Activity Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_ACTIVITY__SUBSCRIPTION_ACTIVITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_ACTIVITY__COMMENTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_ACTIVITY__DATE_SENT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subscription Fulfillment Pieces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_ACTIVITY__SUBSCRIPTION_FULFILLMENT_PIECES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_ACTIVITY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionAttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionAttributeImpl
	 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionPackageImpl#getSubscriptionAttribute()
	 * @generated
	 */
	int SUBSCRIPTION_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_ATTRIBUTE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_ATTRIBUTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_ATTRIBUTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_ATTRIBUTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Subscription Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_ATTRIBUTE__SUBSCRIPTION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_ATTRIBUTE__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_ATTRIBUTE__ATTR_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_ATTRIBUTE__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_ATTRIBUTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionCommEventImpl <em>Comm Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionCommEventImpl
	 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionPackageImpl#getSubscriptionCommEvent()
	 * @generated
	 */
	int SUBSCRIPTION_COMM_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_COMM_EVENT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_COMM_EVENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_COMM_EVENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_COMM_EVENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Communication Event Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_COMM_EVENT__COMMUNICATION_EVENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subscription Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_COMM_EVENT__SUBSCRIPTION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comm Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_COMM_EVENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionFulfillmentPieceImpl <em>Fulfillment Piece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionFulfillmentPieceImpl
	 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionPackageImpl#getSubscriptionFulfillmentPiece()
	 * @generated
	 */
	int SUBSCRIPTION_FULFILLMENT_PIECE = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_FULFILLMENT_PIECE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_FULFILLMENT_PIECE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_FULFILLMENT_PIECE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_FULFILLMENT_PIECE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Subscription Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_FULFILLMENT_PIECE__SUBSCRIPTION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subscription Activity Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_FULFILLMENT_PIECE__SUBSCRIPTION_ACTIVITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fulfillment Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_FULFILLMENT_PIECE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionResourceImpl
	 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionPackageImpl#getSubscriptionResource()
	 * @generated
	 */
	int SUBSCRIPTION_RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_RESOURCE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_RESOURCE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_RESOURCE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_RESOURCE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Subscription Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_RESOURCE__SUBSCRIPTION_RESOURCE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_RESOURCE__CONTENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_RESOURCE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Resource Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_RESOURCE__PARENT_RESOURCE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Service Name On Expiry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_RESOURCE__SERVICE_NAME_ON_EXPIRY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Web Site Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_RESOURCE__WEB_SITE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_RESOURCE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionTypeImpl
	 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionPackageImpl#getSubscriptionType()
	 * @generated
	 */
	int SUBSCRIPTION_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Subscription Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__SUBSCRIPTION_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Subscription Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE__SUBSCRIPTION_TYPE_ATTRS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionTypeAttrImpl <em>Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionTypeAttrImpl
	 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionPackageImpl#getSubscriptionTypeAttr()
	 * @generated
	 */
	int SUBSCRIPTION_TYPE_ATTR = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE_ATTR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE_ATTR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE_ATTR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE_ATTR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Subscription Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE_ATTR__SUBSCRIPTION_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE_ATTR__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE_ATTR__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTION_TYPE_ATTR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource <em>Product Subscription Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Subscription Resource</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource
	 * @generated
	 */
	EClass getProductSubscriptionResource();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getProductId()
	 * @see #getProductSubscriptionResource()
	 * @generated
	 */
	EReference getProductSubscriptionResource_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getSubscriptionResourceId <em>Subscription Resource Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subscription Resource Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getSubscriptionResourceId()
	 * @see #getProductSubscriptionResource()
	 * @generated
	 */
	EReference getProductSubscriptionResource_SubscriptionResourceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getFromDate()
	 * @see #getProductSubscriptionResource()
	 * @generated
	 */
	EAttribute getProductSubscriptionResource_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#isAutomaticExtend <em>Automatic Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Automatic Extend</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#isAutomaticExtend()
	 * @see #getProductSubscriptionResource()
	 * @generated
	 */
	EAttribute getProductSubscriptionResource_AutomaticExtend();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getAvailableTime <em>Available Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Time</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getAvailableTime()
	 * @see #getProductSubscriptionResource()
	 * @generated
	 */
	EAttribute getProductSubscriptionResource_AvailableTime();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getAvailableTimeUomId <em>Available Time Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Available Time Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getAvailableTimeUomId()
	 * @see #getProductSubscriptionResource()
	 * @generated
	 */
	EReference getProductSubscriptionResource_AvailableTimeUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getCanclAutmExtTime <em>Cancl Autm Ext Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancl Autm Ext Time</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getCanclAutmExtTime()
	 * @see #getProductSubscriptionResource()
	 * @generated
	 */
	EAttribute getProductSubscriptionResource_CanclAutmExtTime();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getCanclAutmExtTimeUomId <em>Cancl Autm Ext Time Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cancl Autm Ext Time Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getCanclAutmExtTimeUomId()
	 * @see #getProductSubscriptionResource()
	 * @generated
	 */
	EReference getProductSubscriptionResource_CanclAutmExtTimeUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getGracePeriodOnExpiry <em>Grace Period On Expiry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grace Period On Expiry</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getGracePeriodOnExpiry()
	 * @see #getProductSubscriptionResource()
	 * @generated
	 */
	EAttribute getProductSubscriptionResource_GracePeriodOnExpiry();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getGracePeriodOnExpiryUomId <em>Grace Period On Expiry Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Grace Period On Expiry Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getGracePeriodOnExpiryUomId()
	 * @see #getProductSubscriptionResource()
	 * @generated
	 */
	EReference getProductSubscriptionResource_GracePeriodOnExpiryUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getMaxLifeTime <em>Max Life Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Life Time</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getMaxLifeTime()
	 * @see #getProductSubscriptionResource()
	 * @generated
	 */
	EAttribute getProductSubscriptionResource_MaxLifeTime();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getMaxLifeTimeUomId <em>Max Life Time Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Life Time Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getMaxLifeTimeUomId()
	 * @see #getProductSubscriptionResource()
	 * @generated
	 */
	EReference getProductSubscriptionResource_MaxLifeTimeUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getPurchaseFromDate <em>Purchase From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purchase From Date</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getPurchaseFromDate()
	 * @see #getProductSubscriptionResource()
	 * @generated
	 */
	EAttribute getProductSubscriptionResource_PurchaseFromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getPurchaseThruDate <em>Purchase Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purchase Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getPurchaseThruDate()
	 * @see #getProductSubscriptionResource()
	 * @generated
	 */
	EAttribute getProductSubscriptionResource_PurchaseThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getThruDate()
	 * @see #getProductSubscriptionResource()
	 * @generated
	 */
	EAttribute getProductSubscriptionResource_ThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getUseCountLimit <em>Use Count Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Count Limit</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getUseCountLimit()
	 * @see #getProductSubscriptionResource()
	 * @generated
	 */
	EAttribute getProductSubscriptionResource_UseCountLimit();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getUseRoleTypeId <em>Use Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Use Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getUseRoleTypeId()
	 * @see #getProductSubscriptionResource()
	 * @generated
	 */
	EReference getProductSubscriptionResource_UseRoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getUseTime <em>Use Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Time</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getUseTime()
	 * @see #getProductSubscriptionResource()
	 * @generated
	 */
	EAttribute getProductSubscriptionResource_UseTime();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getUseTimeUomId <em>Use Time Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Use Time Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getUseTimeUomId()
	 * @see #getProductSubscriptionResource()
	 * @generated
	 */
	EReference getProductSubscriptionResource_UseTimeUomId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.subscription.Subscription <em>Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subscription</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription
	 * @generated
	 */
	EClass getSubscription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.Subscription#getSubscriptionId <em>Subscription Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscription Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getSubscriptionId()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_SubscriptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.Subscription#isAutomaticExtend <em>Automatic Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Automatic Extend</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#isAutomaticExtend()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_AutomaticExtend();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.Subscription#getAvailableTime <em>Available Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Time</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getAvailableTime()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_AvailableTime();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.Subscription#getAvailableTimeUomId <em>Available Time Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Available Time Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getAvailableTimeUomId()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_AvailableTimeUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.Subscription#getCanclAutmExtTime <em>Cancl Autm Ext Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancl Autm Ext Time</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getCanclAutmExtTime()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_CanclAutmExtTime();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.Subscription#getCanclAutmExtTimeUomId <em>Cancl Autm Ext Time Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cancl Autm Ext Time Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getCanclAutmExtTimeUomId()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_CanclAutmExtTimeUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.Subscription#getCommunicationEventId <em>Communication Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Event Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getCommunicationEventId()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_CommunicationEventId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.Subscription#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getContactMechId()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_ContactMechId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.Subscription#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getDescription()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.Subscription#getExpirationCompletedDate <em>Expiration Completed Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Completed Date</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getExpirationCompletedDate()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_ExpirationCompletedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.Subscription#getExternalSubscriptionId <em>External Subscription Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Subscription Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getExternalSubscriptionId()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_ExternalSubscriptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.Subscription#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getFromDate()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.Subscription#getGracePeriodOnExpiry <em>Grace Period On Expiry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grace Period On Expiry</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getGracePeriodOnExpiry()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_GracePeriodOnExpiry();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.Subscription#getGracePeriodOnExpiryUomId <em>Grace Period On Expiry Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Grace Period On Expiry Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getGracePeriodOnExpiryUomId()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_GracePeriodOnExpiryUomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.Subscription#getInventoryItemId <em>Inventory Item Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Item Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getInventoryItemId()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_InventoryItemId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.Subscription#getMaxLifeTime <em>Max Life Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Life Time</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getMaxLifeTime()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_MaxLifeTime();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.Subscription#getMaxLifeTimeUomId <em>Max Life Time Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max Life Time Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getMaxLifeTimeUomId()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_MaxLifeTimeUomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.Subscription#getNeedTypeId <em>Need Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Need Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getNeedTypeId()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_NeedTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.Subscription#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getOrderId()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.Subscription#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getOrderItemSeqId()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_OrderItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.Subscription#getOriginatedFromPartyId <em>Originated From Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Originated From Party Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getOriginatedFromPartyId()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_OriginatedFromPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.Subscription#getOriginatedFromRoleTypeId <em>Originated From Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Originated From Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getOriginatedFromRoleTypeId()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_OriginatedFromRoleTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.Subscription#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getPartyId()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.Subscription#getPartyNeedId <em>Party Need Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Need Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getPartyNeedId()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_PartyNeedId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.Subscription#getProductCategoryId <em>Product Category Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Category Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getProductCategoryId()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_ProductCategoryId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.Subscription#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getProductId()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.Subscription#getPurchaseFromDate <em>Purchase From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purchase From Date</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getPurchaseFromDate()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_PurchaseFromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.Subscription#getPurchaseThruDate <em>Purchase Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purchase Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getPurchaseThruDate()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_PurchaseThruDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.Subscription#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getRoleTypeId()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_RoleTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.subscription.Subscription#getSubscriptionAttributes <em>Subscription Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subscription Attributes</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getSubscriptionAttributes()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_SubscriptionAttributes();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.subscription.Subscription#getSubscriptionCommEvents <em>Subscription Comm Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subscription Comm Events</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getSubscriptionCommEvents()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_SubscriptionCommEvents();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.Subscription#getSubscriptionResourceId <em>Subscription Resource Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subscription Resource Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getSubscriptionResourceId()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_SubscriptionResourceId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.Subscription#getSubscriptionTypeId <em>Subscription Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subscription Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getSubscriptionTypeId()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_SubscriptionTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.Subscription#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getThruDate()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_ThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.Subscription#getUseCountLimit <em>Use Count Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Count Limit</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getUseCountLimit()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_UseCountLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.Subscription#getUseTime <em>Use Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Time</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getUseTime()
	 * @see #getSubscription()
	 * @generated
	 */
	EAttribute getSubscription_UseTime();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.Subscription#getUseTimeUomId <em>Use Time Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Use Time Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.Subscription#getUseTimeUomId()
	 * @see #getSubscription()
	 * @generated
	 */
	EReference getSubscription_UseTimeUomId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.subscription.SubscriptionActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionActivity
	 * @generated
	 */
	EClass getSubscriptionActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.SubscriptionActivity#getSubscriptionActivityId <em>Subscription Activity Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscription Activity Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionActivity#getSubscriptionActivityId()
	 * @see #getSubscriptionActivity()
	 * @generated
	 */
	EAttribute getSubscriptionActivity_SubscriptionActivityId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.SubscriptionActivity#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionActivity#getComments()
	 * @see #getSubscriptionActivity()
	 * @generated
	 */
	EAttribute getSubscriptionActivity_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.SubscriptionActivity#getDateSent <em>Date Sent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Sent</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionActivity#getDateSent()
	 * @see #getSubscriptionActivity()
	 * @generated
	 */
	EAttribute getSubscriptionActivity_DateSent();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.subscription.SubscriptionActivity#getSubscriptionFulfillmentPieces <em>Subscription Fulfillment Pieces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subscription Fulfillment Pieces</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionActivity#getSubscriptionFulfillmentPieces()
	 * @see #getSubscriptionActivity()
	 * @generated
	 */
	EReference getSubscriptionActivity_SubscriptionFulfillmentPieces();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.subscription.SubscriptionAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionAttribute
	 * @generated
	 */
	EClass getSubscriptionAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.SubscriptionAttribute#getSubscriptionId <em>Subscription Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subscription Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionAttribute#getSubscriptionId()
	 * @see #getSubscriptionAttribute()
	 * @generated
	 */
	EReference getSubscriptionAttribute_SubscriptionId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.SubscriptionAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionAttribute#getAttrName()
	 * @see #getSubscriptionAttribute()
	 * @generated
	 */
	EAttribute getSubscriptionAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.SubscriptionAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionAttribute#getAttrDescription()
	 * @see #getSubscriptionAttribute()
	 * @generated
	 */
	EAttribute getSubscriptionAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.SubscriptionAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionAttribute#getAttrValue()
	 * @see #getSubscriptionAttribute()
	 * @generated
	 */
	EAttribute getSubscriptionAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.subscription.SubscriptionCommEvent <em>Comm Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comm Event</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionCommEvent
	 * @generated
	 */
	EClass getSubscriptionCommEvent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.SubscriptionCommEvent#getSubscriptionId <em>Subscription Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subscription Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionCommEvent#getSubscriptionId()
	 * @see #getSubscriptionCommEvent()
	 * @generated
	 */
	EReference getSubscriptionCommEvent_SubscriptionId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.SubscriptionCommEvent#getCommunicationEventId <em>Communication Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Event Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionCommEvent#getCommunicationEventId()
	 * @see #getSubscriptionCommEvent()
	 * @generated
	 */
	EReference getSubscriptionCommEvent_CommunicationEventId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.subscription.SubscriptionFulfillmentPiece <em>Fulfillment Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fulfillment Piece</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionFulfillmentPiece
	 * @generated
	 */
	EClass getSubscriptionFulfillmentPiece();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.SubscriptionFulfillmentPiece#getSubscriptionActivityId <em>Subscription Activity Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subscription Activity Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionFulfillmentPiece#getSubscriptionActivityId()
	 * @see #getSubscriptionFulfillmentPiece()
	 * @generated
	 */
	EReference getSubscriptionFulfillmentPiece_SubscriptionActivityId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.SubscriptionFulfillmentPiece#getSubscriptionId <em>Subscription Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subscription Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionFulfillmentPiece#getSubscriptionId()
	 * @see #getSubscriptionFulfillmentPiece()
	 * @generated
	 */
	EReference getSubscriptionFulfillmentPiece_SubscriptionId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.subscription.SubscriptionResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionResource
	 * @generated
	 */
	EClass getSubscriptionResource();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.SubscriptionResource#getSubscriptionResourceId <em>Subscription Resource Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscription Resource Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionResource#getSubscriptionResourceId()
	 * @see #getSubscriptionResource()
	 * @generated
	 */
	EAttribute getSubscriptionResource_SubscriptionResourceId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.SubscriptionResource#getContentId <em>Content Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionResource#getContentId()
	 * @see #getSubscriptionResource()
	 * @generated
	 */
	EReference getSubscriptionResource_ContentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.SubscriptionResource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionResource#getDescription()
	 * @see #getSubscriptionResource()
	 * @generated
	 */
	EAttribute getSubscriptionResource_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.SubscriptionResource#getParentResourceId <em>Parent Resource Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Resource Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionResource#getParentResourceId()
	 * @see #getSubscriptionResource()
	 * @generated
	 */
	EReference getSubscriptionResource_ParentResourceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.SubscriptionResource#getServiceNameOnExpiry <em>Service Name On Expiry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name On Expiry</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionResource#getServiceNameOnExpiry()
	 * @see #getSubscriptionResource()
	 * @generated
	 */
	EAttribute getSubscriptionResource_ServiceNameOnExpiry();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.SubscriptionResource#getWebSiteId <em>Web Site Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Web Site Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionResource#getWebSiteId()
	 * @see #getSubscriptionResource()
	 * @generated
	 */
	EReference getSubscriptionResource_WebSiteId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.subscription.SubscriptionType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionType
	 * @generated
	 */
	EClass getSubscriptionType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.SubscriptionType#getSubscriptionTypeId <em>Subscription Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscription Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionType#getSubscriptionTypeId()
	 * @see #getSubscriptionType()
	 * @generated
	 */
	EAttribute getSubscriptionType_SubscriptionTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.SubscriptionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionType#getDescription()
	 * @see #getSubscriptionType()
	 * @generated
	 */
	EAttribute getSubscriptionType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.SubscriptionType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionType#isHasTable()
	 * @see #getSubscriptionType()
	 * @generated
	 */
	EAttribute getSubscriptionType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.SubscriptionType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionType#getParentTypeId()
	 * @see #getSubscriptionType()
	 * @generated
	 */
	EReference getSubscriptionType_ParentTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.subscription.SubscriptionType#getSubscriptionTypeAttrs <em>Subscription Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subscription Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionType#getSubscriptionTypeAttrs()
	 * @see #getSubscriptionType()
	 * @generated
	 */
	EReference getSubscriptionType_SubscriptionTypeAttrs();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.subscription.SubscriptionTypeAttr <em>Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Attr</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionTypeAttr
	 * @generated
	 */
	EClass getSubscriptionTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.subscription.SubscriptionTypeAttr#getSubscriptionTypeId <em>Subscription Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subscription Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionTypeAttr#getSubscriptionTypeId()
	 * @see #getSubscriptionTypeAttr()
	 * @generated
	 */
	EReference getSubscriptionTypeAttr_SubscriptionTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.SubscriptionTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionTypeAttr#getAttrName()
	 * @see #getSubscriptionTypeAttr()
	 * @generated
	 */
	EAttribute getSubscriptionTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.subscription.SubscriptionTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionTypeAttr#getDescription()
	 * @see #getSubscriptionTypeAttr()
	 * @generated
	 */
	EAttribute getSubscriptionTypeAttr_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubscriptionFactory getSubscriptionFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.subscription.impl.ProductSubscriptionResourceImpl <em>Product Subscription Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.subscription.impl.ProductSubscriptionResourceImpl
		 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionPackageImpl#getProductSubscriptionResource()
		 * @generated
		 */
		EClass PRODUCT_SUBSCRIPTION_RESOURCE = eINSTANCE.getProductSubscriptionResource();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SUBSCRIPTION_RESOURCE__PRODUCT_ID = eINSTANCE.getProductSubscriptionResource_ProductId();

		/**
		 * The meta object literal for the '<em><b>Subscription Resource Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SUBSCRIPTION_RESOURCE__SUBSCRIPTION_RESOURCE_ID = eINSTANCE.getProductSubscriptionResource_SubscriptionResourceId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SUBSCRIPTION_RESOURCE__FROM_DATE = eINSTANCE.getProductSubscriptionResource_FromDate();

		/**
		 * The meta object literal for the '<em><b>Automatic Extend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SUBSCRIPTION_RESOURCE__AUTOMATIC_EXTEND = eINSTANCE.getProductSubscriptionResource_AutomaticExtend();

		/**
		 * The meta object literal for the '<em><b>Available Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SUBSCRIPTION_RESOURCE__AVAILABLE_TIME = eINSTANCE.getProductSubscriptionResource_AvailableTime();

		/**
		 * The meta object literal for the '<em><b>Available Time Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SUBSCRIPTION_RESOURCE__AVAILABLE_TIME_UOM_ID = eINSTANCE.getProductSubscriptionResource_AvailableTimeUomId();

		/**
		 * The meta object literal for the '<em><b>Cancl Autm Ext Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SUBSCRIPTION_RESOURCE__CANCL_AUTM_EXT_TIME = eINSTANCE.getProductSubscriptionResource_CanclAutmExtTime();

		/**
		 * The meta object literal for the '<em><b>Cancl Autm Ext Time Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SUBSCRIPTION_RESOURCE__CANCL_AUTM_EXT_TIME_UOM_ID = eINSTANCE.getProductSubscriptionResource_CanclAutmExtTimeUomId();

		/**
		 * The meta object literal for the '<em><b>Grace Period On Expiry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SUBSCRIPTION_RESOURCE__GRACE_PERIOD_ON_EXPIRY = eINSTANCE.getProductSubscriptionResource_GracePeriodOnExpiry();

		/**
		 * The meta object literal for the '<em><b>Grace Period On Expiry Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SUBSCRIPTION_RESOURCE__GRACE_PERIOD_ON_EXPIRY_UOM_ID = eINSTANCE.getProductSubscriptionResource_GracePeriodOnExpiryUomId();

		/**
		 * The meta object literal for the '<em><b>Max Life Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SUBSCRIPTION_RESOURCE__MAX_LIFE_TIME = eINSTANCE.getProductSubscriptionResource_MaxLifeTime();

		/**
		 * The meta object literal for the '<em><b>Max Life Time Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SUBSCRIPTION_RESOURCE__MAX_LIFE_TIME_UOM_ID = eINSTANCE.getProductSubscriptionResource_MaxLifeTimeUomId();

		/**
		 * The meta object literal for the '<em><b>Purchase From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SUBSCRIPTION_RESOURCE__PURCHASE_FROM_DATE = eINSTANCE.getProductSubscriptionResource_PurchaseFromDate();

		/**
		 * The meta object literal for the '<em><b>Purchase Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SUBSCRIPTION_RESOURCE__PURCHASE_THRU_DATE = eINSTANCE.getProductSubscriptionResource_PurchaseThruDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SUBSCRIPTION_RESOURCE__THRU_DATE = eINSTANCE.getProductSubscriptionResource_ThruDate();

		/**
		 * The meta object literal for the '<em><b>Use Count Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SUBSCRIPTION_RESOURCE__USE_COUNT_LIMIT = eINSTANCE.getProductSubscriptionResource_UseCountLimit();

		/**
		 * The meta object literal for the '<em><b>Use Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SUBSCRIPTION_RESOURCE__USE_ROLE_TYPE_ID = eINSTANCE.getProductSubscriptionResource_UseRoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Use Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SUBSCRIPTION_RESOURCE__USE_TIME = eINSTANCE.getProductSubscriptionResource_UseTime();

		/**
		 * The meta object literal for the '<em><b>Use Time Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SUBSCRIPTION_RESOURCE__USE_TIME_UOM_ID = eINSTANCE.getProductSubscriptionResource_UseTimeUomId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl <em>Subscription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl
		 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionPackageImpl#getSubscription()
		 * @generated
		 */
		EClass SUBSCRIPTION = eINSTANCE.getSubscription();

		/**
		 * The meta object literal for the '<em><b>Subscription Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__SUBSCRIPTION_ID = eINSTANCE.getSubscription_SubscriptionId();

		/**
		 * The meta object literal for the '<em><b>Automatic Extend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__AUTOMATIC_EXTEND = eINSTANCE.getSubscription_AutomaticExtend();

		/**
		 * The meta object literal for the '<em><b>Available Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__AVAILABLE_TIME = eINSTANCE.getSubscription_AvailableTime();

		/**
		 * The meta object literal for the '<em><b>Available Time Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__AVAILABLE_TIME_UOM_ID = eINSTANCE.getSubscription_AvailableTimeUomId();

		/**
		 * The meta object literal for the '<em><b>Cancl Autm Ext Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__CANCL_AUTM_EXT_TIME = eINSTANCE.getSubscription_CanclAutmExtTime();

		/**
		 * The meta object literal for the '<em><b>Cancl Autm Ext Time Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__CANCL_AUTM_EXT_TIME_UOM_ID = eINSTANCE.getSubscription_CanclAutmExtTimeUomId();

		/**
		 * The meta object literal for the '<em><b>Communication Event Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__COMMUNICATION_EVENT_ID = eINSTANCE.getSubscription_CommunicationEventId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__CONTACT_MECH_ID = eINSTANCE.getSubscription_ContactMechId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__DESCRIPTION = eINSTANCE.getSubscription_Description();

		/**
		 * The meta object literal for the '<em><b>Expiration Completed Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__EXPIRATION_COMPLETED_DATE = eINSTANCE.getSubscription_ExpirationCompletedDate();

		/**
		 * The meta object literal for the '<em><b>External Subscription Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__EXTERNAL_SUBSCRIPTION_ID = eINSTANCE.getSubscription_ExternalSubscriptionId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__FROM_DATE = eINSTANCE.getSubscription_FromDate();

		/**
		 * The meta object literal for the '<em><b>Grace Period On Expiry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY = eINSTANCE.getSubscription_GracePeriodOnExpiry();

		/**
		 * The meta object literal for the '<em><b>Grace Period On Expiry Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY_UOM_ID = eINSTANCE.getSubscription_GracePeriodOnExpiryUomId();

		/**
		 * The meta object literal for the '<em><b>Inventory Item Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__INVENTORY_ITEM_ID = eINSTANCE.getSubscription_InventoryItemId();

		/**
		 * The meta object literal for the '<em><b>Max Life Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__MAX_LIFE_TIME = eINSTANCE.getSubscription_MaxLifeTime();

		/**
		 * The meta object literal for the '<em><b>Max Life Time Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__MAX_LIFE_TIME_UOM_ID = eINSTANCE.getSubscription_MaxLifeTimeUomId();

		/**
		 * The meta object literal for the '<em><b>Need Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__NEED_TYPE_ID = eINSTANCE.getSubscription_NeedTypeId();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__ORDER_ID = eINSTANCE.getSubscription_OrderId();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__ORDER_ITEM_SEQ_ID = eINSTANCE.getSubscription_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Originated From Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__ORIGINATED_FROM_PARTY_ID = eINSTANCE.getSubscription_OriginatedFromPartyId();

		/**
		 * The meta object literal for the '<em><b>Originated From Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__ORIGINATED_FROM_ROLE_TYPE_ID = eINSTANCE.getSubscription_OriginatedFromRoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__PARTY_ID = eINSTANCE.getSubscription_PartyId();

		/**
		 * The meta object literal for the '<em><b>Party Need Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__PARTY_NEED_ID = eINSTANCE.getSubscription_PartyNeedId();

		/**
		 * The meta object literal for the '<em><b>Product Category Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__PRODUCT_CATEGORY_ID = eINSTANCE.getSubscription_ProductCategoryId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__PRODUCT_ID = eINSTANCE.getSubscription_ProductId();

		/**
		 * The meta object literal for the '<em><b>Purchase From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__PURCHASE_FROM_DATE = eINSTANCE.getSubscription_PurchaseFromDate();

		/**
		 * The meta object literal for the '<em><b>Purchase Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__PURCHASE_THRU_DATE = eINSTANCE.getSubscription_PurchaseThruDate();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__ROLE_TYPE_ID = eINSTANCE.getSubscription_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Subscription Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__SUBSCRIPTION_ATTRIBUTES = eINSTANCE.getSubscription_SubscriptionAttributes();

		/**
		 * The meta object literal for the '<em><b>Subscription Comm Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__SUBSCRIPTION_COMM_EVENTS = eINSTANCE.getSubscription_SubscriptionCommEvents();

		/**
		 * The meta object literal for the '<em><b>Subscription Resource Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__SUBSCRIPTION_RESOURCE_ID = eINSTANCE.getSubscription_SubscriptionResourceId();

		/**
		 * The meta object literal for the '<em><b>Subscription Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__SUBSCRIPTION_TYPE_ID = eINSTANCE.getSubscription_SubscriptionTypeId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__THRU_DATE = eINSTANCE.getSubscription_ThruDate();

		/**
		 * The meta object literal for the '<em><b>Use Count Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__USE_COUNT_LIMIT = eINSTANCE.getSubscription_UseCountLimit();

		/**
		 * The meta object literal for the '<em><b>Use Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION__USE_TIME = eINSTANCE.getSubscription_UseTime();

		/**
		 * The meta object literal for the '<em><b>Use Time Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION__USE_TIME_UOM_ID = eINSTANCE.getSubscription_UseTimeUomId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionActivityImpl
		 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionPackageImpl#getSubscriptionActivity()
		 * @generated
		 */
		EClass SUBSCRIPTION_ACTIVITY = eINSTANCE.getSubscriptionActivity();

		/**
		 * The meta object literal for the '<em><b>Subscription Activity Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_ACTIVITY__SUBSCRIPTION_ACTIVITY_ID = eINSTANCE.getSubscriptionActivity_SubscriptionActivityId();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_ACTIVITY__COMMENTS = eINSTANCE.getSubscriptionActivity_Comments();

		/**
		 * The meta object literal for the '<em><b>Date Sent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_ACTIVITY__DATE_SENT = eINSTANCE.getSubscriptionActivity_DateSent();

		/**
		 * The meta object literal for the '<em><b>Subscription Fulfillment Pieces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION_ACTIVITY__SUBSCRIPTION_FULFILLMENT_PIECES = eINSTANCE.getSubscriptionActivity_SubscriptionFulfillmentPieces();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionAttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionAttributeImpl
		 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionPackageImpl#getSubscriptionAttribute()
		 * @generated
		 */
		EClass SUBSCRIPTION_ATTRIBUTE = eINSTANCE.getSubscriptionAttribute();

		/**
		 * The meta object literal for the '<em><b>Subscription Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION_ATTRIBUTE__SUBSCRIPTION_ID = eINSTANCE.getSubscriptionAttribute_SubscriptionId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_ATTRIBUTE__ATTR_NAME = eINSTANCE.getSubscriptionAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getSubscriptionAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getSubscriptionAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionCommEventImpl <em>Comm Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionCommEventImpl
		 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionPackageImpl#getSubscriptionCommEvent()
		 * @generated
		 */
		EClass SUBSCRIPTION_COMM_EVENT = eINSTANCE.getSubscriptionCommEvent();

		/**
		 * The meta object literal for the '<em><b>Subscription Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION_COMM_EVENT__SUBSCRIPTION_ID = eINSTANCE.getSubscriptionCommEvent_SubscriptionId();

		/**
		 * The meta object literal for the '<em><b>Communication Event Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION_COMM_EVENT__COMMUNICATION_EVENT_ID = eINSTANCE.getSubscriptionCommEvent_CommunicationEventId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionFulfillmentPieceImpl <em>Fulfillment Piece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionFulfillmentPieceImpl
		 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionPackageImpl#getSubscriptionFulfillmentPiece()
		 * @generated
		 */
		EClass SUBSCRIPTION_FULFILLMENT_PIECE = eINSTANCE.getSubscriptionFulfillmentPiece();

		/**
		 * The meta object literal for the '<em><b>Subscription Activity Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION_FULFILLMENT_PIECE__SUBSCRIPTION_ACTIVITY_ID = eINSTANCE.getSubscriptionFulfillmentPiece_SubscriptionActivityId();

		/**
		 * The meta object literal for the '<em><b>Subscription Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION_FULFILLMENT_PIECE__SUBSCRIPTION_ID = eINSTANCE.getSubscriptionFulfillmentPiece_SubscriptionId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionResourceImpl
		 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionPackageImpl#getSubscriptionResource()
		 * @generated
		 */
		EClass SUBSCRIPTION_RESOURCE = eINSTANCE.getSubscriptionResource();

		/**
		 * The meta object literal for the '<em><b>Subscription Resource Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_RESOURCE__SUBSCRIPTION_RESOURCE_ID = eINSTANCE.getSubscriptionResource_SubscriptionResourceId();

		/**
		 * The meta object literal for the '<em><b>Content Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION_RESOURCE__CONTENT_ID = eINSTANCE.getSubscriptionResource_ContentId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_RESOURCE__DESCRIPTION = eINSTANCE.getSubscriptionResource_Description();

		/**
		 * The meta object literal for the '<em><b>Parent Resource Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION_RESOURCE__PARENT_RESOURCE_ID = eINSTANCE.getSubscriptionResource_ParentResourceId();

		/**
		 * The meta object literal for the '<em><b>Service Name On Expiry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_RESOURCE__SERVICE_NAME_ON_EXPIRY = eINSTANCE.getSubscriptionResource_ServiceNameOnExpiry();

		/**
		 * The meta object literal for the '<em><b>Web Site Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION_RESOURCE__WEB_SITE_ID = eINSTANCE.getSubscriptionResource_WebSiteId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionTypeImpl
		 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionPackageImpl#getSubscriptionType()
		 * @generated
		 */
		EClass SUBSCRIPTION_TYPE = eINSTANCE.getSubscriptionType();

		/**
		 * The meta object literal for the '<em><b>Subscription Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_TYPE__SUBSCRIPTION_TYPE_ID = eINSTANCE.getSubscriptionType_SubscriptionTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_TYPE__DESCRIPTION = eINSTANCE.getSubscriptionType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_TYPE__HAS_TABLE = eINSTANCE.getSubscriptionType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION_TYPE__PARENT_TYPE_ID = eINSTANCE.getSubscriptionType_ParentTypeId();

		/**
		 * The meta object literal for the '<em><b>Subscription Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION_TYPE__SUBSCRIPTION_TYPE_ATTRS = eINSTANCE.getSubscriptionType_SubscriptionTypeAttrs();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionTypeAttrImpl <em>Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionTypeAttrImpl
		 * @see org.abchip.mimo.biz.product.subscription.impl.SubscriptionPackageImpl#getSubscriptionTypeAttr()
		 * @generated
		 */
		EClass SUBSCRIPTION_TYPE_ATTR = eINSTANCE.getSubscriptionTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Subscription Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTION_TYPE_ATTR__SUBSCRIPTION_TYPE_ID = eINSTANCE.getSubscriptionTypeAttr_SubscriptionTypeId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_TYPE_ATTR__ATTR_NAME = eINSTANCE.getSubscriptionTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTION_TYPE_ATTR__DESCRIPTION = eINSTANCE.getSubscriptionTypeAttr_Description();

	}

} //SubscriptionPackage
