/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.subscription.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.subscription.Subscription;
import org.abchip.mimo.biz.product.subscription.SubscriptionPackage;
import org.abchip.mimo.biz.product.subscription.SubscriptionType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getSubscriptionId <em>Subscription Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#isAutomaticExtend <em>Automatic Extend</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getAvailableTime <em>Available Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getAvailableTimeUomId <em>Available Time Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getCanclAutmExtTime <em>Cancl Autm Ext Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getCanclAutmExtTimeUomId <em>Cancl Autm Ext Time Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getCommunicationEventId <em>Communication Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getExpirationCompletedDate <em>Expiration Completed Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getExternalSubscriptionId <em>External Subscription Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getGracePeriodOnExpiry <em>Grace Period On Expiry</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getGracePeriodOnExpiryUomId <em>Grace Period On Expiry Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getMaxLifeTime <em>Max Life Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getMaxLifeTimeUomId <em>Max Life Time Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getNeedTypeId <em>Need Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getOriginatedFromPartyId <em>Originated From Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getOriginatedFromRoleTypeId <em>Originated From Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getPartyNeedId <em>Party Need Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getPurchaseFromDate <em>Purchase From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getPurchaseThruDate <em>Purchase Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getSubscriptionResourceId <em>Subscription Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getSubscriptionTypeId <em>Subscription Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getUseCountLimit <em>Use Count Limit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getUseTime <em>Use Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getUseTimeUomId <em>Use Time Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getSubscriptionAttributes <em>Subscription Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getSubscriptionCommEvents <em>Subscription Comm Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubscriptionImpl extends BizEntityTypedImpl<SubscriptionType> implements Subscription {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getSubscriptionId() <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIPTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriptionId() <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionId()
	 * @generated
	 * @ordered
	 */
	protected String subscriptionId = SUBSCRIPTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutomaticExtend() <em>Automatic Extend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutomaticExtend()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOMATIC_EXTEND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutomaticExtend() <em>Automatic Extend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutomaticExtend()
	 * @generated
	 * @ordered
	 */
	protected boolean automaticExtend = AUTOMATIC_EXTEND_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableTime() <em>Available Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableTime()
	 * @generated
	 * @ordered
	 */
	protected static final long AVAILABLE_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAvailableTime() <em>Available Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableTime()
	 * @generated
	 * @ordered
	 */
	protected long availableTime = AVAILABLE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableTimeUomId() <em>Available Time Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableTimeUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String AVAILABLE_TIME_UOM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailableTimeUomId() <em>Available Time Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableTimeUomId()
	 * @generated
	 * @ordered
	 */
	protected String availableTimeUomId = AVAILABLE_TIME_UOM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCanclAutmExtTime() <em>Cancl Autm Ext Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanclAutmExtTime()
	 * @generated
	 * @ordered
	 */
	protected static final long CANCL_AUTM_EXT_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCanclAutmExtTime() <em>Cancl Autm Ext Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanclAutmExtTime()
	 * @generated
	 * @ordered
	 */
	protected long canclAutmExtTime = CANCL_AUTM_EXT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCanclAutmExtTimeUomId() <em>Cancl Autm Ext Time Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanclAutmExtTimeUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String CANCL_AUTM_EXT_TIME_UOM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCanclAutmExtTimeUomId() <em>Cancl Autm Ext Time Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanclAutmExtTimeUomId()
	 * @generated
	 * @ordered
	 */
	protected String canclAutmExtTimeUomId = CANCL_AUTM_EXT_TIME_UOM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommunicationEventId() <em>Communication Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationEventId()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMUNICATION_EVENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommunicationEventId() <em>Communication Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationEventId()
	 * @generated
	 * @ordered
	 */
	protected String communicationEventId = COMMUNICATION_EVENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_MECH_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected String contactMechId = CONTACT_MECH_ID_EDEFAULT;

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
	 * The default value of the '{@link #getExpirationCompletedDate() <em>Expiration Completed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationCompletedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPIRATION_COMPLETED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpirationCompletedDate() <em>Expiration Completed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationCompletedDate()
	 * @generated
	 * @ordered
	 */
	protected Date expirationCompletedDate = EXPIRATION_COMPLETED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalSubscriptionId() <em>External Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalSubscriptionId()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_SUBSCRIPTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalSubscriptionId() <em>External Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalSubscriptionId()
	 * @generated
	 * @ordered
	 */
	protected String externalSubscriptionId = EXTERNAL_SUBSCRIPTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGracePeriodOnExpiry() <em>Grace Period On Expiry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGracePeriodOnExpiry()
	 * @generated
	 * @ordered
	 */
	protected static final long GRACE_PERIOD_ON_EXPIRY_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getGracePeriodOnExpiry() <em>Grace Period On Expiry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGracePeriodOnExpiry()
	 * @generated
	 * @ordered
	 */
	protected long gracePeriodOnExpiry = GRACE_PERIOD_ON_EXPIRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getGracePeriodOnExpiryUomId() <em>Grace Period On Expiry Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGracePeriodOnExpiryUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String GRACE_PERIOD_ON_EXPIRY_UOM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGracePeriodOnExpiryUomId() <em>Grace Period On Expiry Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGracePeriodOnExpiryUomId()
	 * @generated
	 * @ordered
	 */
	protected String gracePeriodOnExpiryUomId = GRACE_PERIOD_ON_EXPIRY_UOM_ID_EDEFAULT;

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
	 * The default value of the '{@link #getMaxLifeTime() <em>Max Life Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLifeTime()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_LIFE_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxLifeTime() <em>Max Life Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLifeTime()
	 * @generated
	 * @ordered
	 */
	protected long maxLifeTime = MAX_LIFE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLifeTimeUomId() <em>Max Life Time Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLifeTimeUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_LIFE_TIME_UOM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxLifeTimeUomId() <em>Max Life Time Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLifeTimeUomId()
	 * @generated
	 * @ordered
	 */
	protected String maxLifeTimeUomId = MAX_LIFE_TIME_UOM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeedTypeId() <em>Need Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String NEED_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNeedTypeId() <em>Need Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedTypeId()
	 * @generated
	 * @ordered
	 */
	protected String needTypeId = NEED_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected String orderId = ORDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderItemSeqId() <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderItemSeqId() <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String orderItemSeqId = ORDER_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginatedFromPartyId() <em>Originated From Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatedFromPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINATED_FROM_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginatedFromPartyId() <em>Originated From Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatedFromPartyId()
	 * @generated
	 * @ordered
	 */
	protected String originatedFromPartyId = ORIGINATED_FROM_PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginatedFromRoleTypeId() <em>Originated From Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatedFromRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINATED_FROM_ROLE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginatedFromRoleTypeId() <em>Originated From Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatedFromRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected String originatedFromRoleTypeId = ORIGINATED_FROM_ROLE_TYPE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getPartyNeedId() <em>Party Need Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyNeedId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_NEED_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartyNeedId() <em>Party Need Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyNeedId()
	 * @generated
	 * @ordered
	 */
	protected String partyNeedId = PARTY_NEED_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductCategoryId() <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_CATEGORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductCategoryId() <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected String productCategoryId = PRODUCT_CATEGORY_ID_EDEFAULT;

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
	 * The default value of the '{@link #getPurchaseFromDate() <em>Purchase From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PURCHASE_FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurchaseFromDate() <em>Purchase From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date purchaseFromDate = PURCHASE_FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurchaseThruDate() <em>Purchase Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PURCHASE_THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurchaseThruDate() <em>Purchase Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date purchaseThruDate = PURCHASE_THRU_DATE_EDEFAULT;

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
	 * The default value of the '{@link #getSubscriptionResourceId() <em>Subscription Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionResourceId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIPTION_RESOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriptionResourceId() <em>Subscription Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionResourceId()
	 * @generated
	 * @ordered
	 */
	protected String subscriptionResourceId = SUBSCRIPTION_RESOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriptionTypeId() <em>Subscription Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIPTION_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriptionTypeId() <em>Subscription Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionTypeId()
	 * @generated
	 * @ordered
	 */
	protected String subscriptionTypeId = SUBSCRIPTION_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseCountLimit() <em>Use Count Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCountLimit()
	 * @generated
	 * @ordered
	 */
	protected static final long USE_COUNT_LIMIT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getUseCountLimit() <em>Use Count Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCountLimit()
	 * @generated
	 * @ordered
	 */
	protected long useCountLimit = USE_COUNT_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseTime() <em>Use Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTime()
	 * @generated
	 * @ordered
	 */
	protected static final long USE_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getUseTime() <em>Use Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTime()
	 * @generated
	 * @ordered
	 */
	protected long useTime = USE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseTimeUomId() <em>Use Time Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTimeUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_TIME_UOM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseTimeUomId() <em>Use Time Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTimeUomId()
	 * @generated
	 * @ordered
	 */
	protected String useTimeUomId = USE_TIME_UOM_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubscriptionAttributes() <em>Subscription Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> subscriptionAttributes;

	/**
	 * The cached value of the '{@link #getSubscriptionCommEvents() <em>Subscription Comm Events</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionCommEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<String> subscriptionCommEvents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubscriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SubscriptionPackage.Literals.SUBSCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getAvailableTime() {
		return availableTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableTime(long newAvailableTime) {
		long oldAvailableTime = availableTime;
		availableTime = newAvailableTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__AVAILABLE_TIME, oldAvailableTime, availableTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAvailableTimeUomId() {
		return availableTimeUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableTimeUomId(String newAvailableTimeUomId) {
		String oldAvailableTimeUomId = availableTimeUomId;
		availableTimeUomId = newAvailableTimeUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__AVAILABLE_TIME_UOM_ID, oldAvailableTimeUomId, availableTimeUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getCanclAutmExtTime() {
		return canclAutmExtTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanclAutmExtTime(long newCanclAutmExtTime) {
		long oldCanclAutmExtTime = canclAutmExtTime;
		canclAutmExtTime = newCanclAutmExtTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__CANCL_AUTM_EXT_TIME, oldCanclAutmExtTime, canclAutmExtTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCanclAutmExtTimeUomId() {
		return canclAutmExtTimeUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanclAutmExtTimeUomId(String newCanclAutmExtTimeUomId) {
		String oldCanclAutmExtTimeUomId = canclAutmExtTimeUomId;
		canclAutmExtTimeUomId = newCanclAutmExtTimeUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__CANCL_AUTM_EXT_TIME_UOM_ID, oldCanclAutmExtTimeUomId, canclAutmExtTimeUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommunicationEventId() {
		return communicationEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationEventId(String newCommunicationEventId) {
		String oldCommunicationEventId = communicationEventId;
		communicationEventId = newCommunicationEventId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__COMMUNICATION_EVENT_ID, oldCommunicationEventId, communicationEventId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactMechId() {
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(String newContactMechId) {
		String oldContactMechId = contactMechId;
		contactMechId = newContactMechId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__CONTACT_MECH_ID, oldContactMechId, contactMechId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExpirationCompletedDate() {
		return expirationCompletedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpirationCompletedDate(Date newExpirationCompletedDate) {
		Date oldExpirationCompletedDate = expirationCompletedDate;
		expirationCompletedDate = newExpirationCompletedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__EXPIRATION_COMPLETED_DATE, oldExpirationCompletedDate, expirationCompletedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalSubscriptionId() {
		return externalSubscriptionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalSubscriptionId(String newExternalSubscriptionId) {
		String oldExternalSubscriptionId = externalSubscriptionId;
		externalSubscriptionId = newExternalSubscriptionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__EXTERNAL_SUBSCRIPTION_ID, oldExternalSubscriptionId, externalSubscriptionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getGracePeriodOnExpiry() {
		return gracePeriodOnExpiry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGracePeriodOnExpiry(long newGracePeriodOnExpiry) {
		long oldGracePeriodOnExpiry = gracePeriodOnExpiry;
		gracePeriodOnExpiry = newGracePeriodOnExpiry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY, oldGracePeriodOnExpiry, gracePeriodOnExpiry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGracePeriodOnExpiryUomId() {
		return gracePeriodOnExpiryUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGracePeriodOnExpiryUomId(String newGracePeriodOnExpiryUomId) {
		String oldGracePeriodOnExpiryUomId = gracePeriodOnExpiryUomId;
		gracePeriodOnExpiryUomId = newGracePeriodOnExpiryUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY_UOM_ID, oldGracePeriodOnExpiryUomId, gracePeriodOnExpiryUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxLifeTime() {
		return maxLifeTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLifeTime(long newMaxLifeTime) {
		long oldMaxLifeTime = maxLifeTime;
		maxLifeTime = newMaxLifeTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__MAX_LIFE_TIME, oldMaxLifeTime, maxLifeTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaxLifeTimeUomId() {
		return maxLifeTimeUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLifeTimeUomId(String newMaxLifeTimeUomId) {
		String oldMaxLifeTimeUomId = maxLifeTimeUomId;
		maxLifeTimeUomId = newMaxLifeTimeUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__MAX_LIFE_TIME_UOM_ID, oldMaxLifeTimeUomId, maxLifeTimeUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNeedTypeId() {
		return needTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeedTypeId(String newNeedTypeId) {
		String oldNeedTypeId = needTypeId;
		needTypeId = newNeedTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__NEED_TYPE_ID, oldNeedTypeId, needTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(String newOrderId) {
		String oldOrderId = orderId;
		orderId = newOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__ORDER_ID, oldOrderId, orderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return orderItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		String oldOrderItemSeqId = orderItemSeqId;
		orderItemSeqId = newOrderItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__ORDER_ITEM_SEQ_ID, oldOrderItemSeqId, orderItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOriginatedFromPartyId() {
		return originatedFromPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginatedFromPartyId(String newOriginatedFromPartyId) {
		String oldOriginatedFromPartyId = originatedFromPartyId;
		originatedFromPartyId = newOriginatedFromPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__ORIGINATED_FROM_PARTY_ID, oldOriginatedFromPartyId, originatedFromPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOriginatedFromRoleTypeId() {
		return originatedFromRoleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginatedFromRoleTypeId(String newOriginatedFromRoleTypeId) {
		String oldOriginatedFromRoleTypeId = originatedFromRoleTypeId;
		originatedFromRoleTypeId = newOriginatedFromRoleTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__ORIGINATED_FROM_ROLE_TYPE_ID, oldOriginatedFromRoleTypeId, originatedFromRoleTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyNeedId() {
		return partyNeedId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyNeedId(String newPartyNeedId) {
		String oldPartyNeedId = partyNeedId;
		partyNeedId = newPartyNeedId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__PARTY_NEED_ID, oldPartyNeedId, partyNeedId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPurchaseFromDate() {
		return purchaseFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaseFromDate(Date newPurchaseFromDate) {
		Date oldPurchaseFromDate = purchaseFromDate;
		purchaseFromDate = newPurchaseFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__PURCHASE_FROM_DATE, oldPurchaseFromDate, purchaseFromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPurchaseThruDate() {
		return purchaseThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaseThruDate(Date newPurchaseThruDate) {
		Date oldPurchaseThruDate = purchaseThruDate;
		purchaseThruDate = newPurchaseThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__PURCHASE_THRU_DATE, oldPurchaseThruDate, purchaseThruDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__ROLE_TYPE_ID, oldRoleTypeId, roleTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getUseCountLimit() {
		return useCountLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseCountLimit(long newUseCountLimit) {
		long oldUseCountLimit = useCountLimit;
		useCountLimit = newUseCountLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__USE_COUNT_LIMIT, oldUseCountLimit, useCountLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getUseTime() {
		return useTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseTime(long newUseTime) {
		long oldUseTime = useTime;
		useTime = newUseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__USE_TIME, oldUseTime, useTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUseTimeUomId() {
		return useTimeUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseTimeUomId(String newUseTimeUomId) {
		String oldUseTimeUomId = useTimeUomId;
		useTimeUomId = newUseTimeUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__USE_TIME_UOM_ID, oldUseTimeUomId, useTimeUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getSubscriptionAttributes() {
		if (subscriptionAttributes == null) {
			subscriptionAttributes = new EDataTypeUniqueEList<String>(String.class, this, SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_ATTRIBUTES);
		}
		return subscriptionAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getSubscriptionCommEvents() {
		if (subscriptionCommEvents == null) {
			subscriptionCommEvents = new EDataTypeUniqueEList<String>(String.class, this, SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_COMM_EVENTS);
		}
		return subscriptionCommEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> subscriptionFulfillmentPieces() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubscriptionResourceId() {
		return subscriptionResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionResourceId(String newSubscriptionResourceId) {
		String oldSubscriptionResourceId = subscriptionResourceId;
		subscriptionResourceId = newSubscriptionResourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_RESOURCE_ID, oldSubscriptionResourceId, subscriptionResourceId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductCategoryId() {
		return productCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryId(String newProductCategoryId) {
		String oldProductCategoryId = productCategoryId;
		productCategoryId = newProductCategoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__PRODUCT_CATEGORY_ID, oldProductCategoryId, productCategoryId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__INVENTORY_ITEM_ID, oldInventoryItemId, inventoryItemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubscriptionTypeId() {
		return subscriptionTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionTypeId(String newSubscriptionTypeId) {
		String oldSubscriptionTypeId = subscriptionTypeId;
		subscriptionTypeId = newSubscriptionTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_TYPE_ID, oldSubscriptionTypeId, subscriptionTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubscriptionId() {
		return subscriptionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionId(String newSubscriptionId) {
		String oldSubscriptionId = subscriptionId;
		subscriptionId = newSubscriptionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_ID, oldSubscriptionId, subscriptionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutomaticExtend() {
		return automaticExtend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutomaticExtend(boolean newAutomaticExtend) {
		boolean oldAutomaticExtend = automaticExtend;
		automaticExtend = newAutomaticExtend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__AUTOMATIC_EXTEND, oldAutomaticExtend, automaticExtend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_ID:
				return getSubscriptionId();
			case SubscriptionPackage.SUBSCRIPTION__AUTOMATIC_EXTEND:
				return isAutomaticExtend();
			case SubscriptionPackage.SUBSCRIPTION__AVAILABLE_TIME:
				return getAvailableTime();
			case SubscriptionPackage.SUBSCRIPTION__AVAILABLE_TIME_UOM_ID:
				return getAvailableTimeUomId();
			case SubscriptionPackage.SUBSCRIPTION__CANCL_AUTM_EXT_TIME:
				return getCanclAutmExtTime();
			case SubscriptionPackage.SUBSCRIPTION__CANCL_AUTM_EXT_TIME_UOM_ID:
				return getCanclAutmExtTimeUomId();
			case SubscriptionPackage.SUBSCRIPTION__COMMUNICATION_EVENT_ID:
				return getCommunicationEventId();
			case SubscriptionPackage.SUBSCRIPTION__CONTACT_MECH_ID:
				return getContactMechId();
			case SubscriptionPackage.SUBSCRIPTION__DESCRIPTION:
				return getDescription();
			case SubscriptionPackage.SUBSCRIPTION__EXPIRATION_COMPLETED_DATE:
				return getExpirationCompletedDate();
			case SubscriptionPackage.SUBSCRIPTION__EXTERNAL_SUBSCRIPTION_ID:
				return getExternalSubscriptionId();
			case SubscriptionPackage.SUBSCRIPTION__FROM_DATE:
				return getFromDate();
			case SubscriptionPackage.SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY:
				return getGracePeriodOnExpiry();
			case SubscriptionPackage.SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY_UOM_ID:
				return getGracePeriodOnExpiryUomId();
			case SubscriptionPackage.SUBSCRIPTION__INVENTORY_ITEM_ID:
				return getInventoryItemId();
			case SubscriptionPackage.SUBSCRIPTION__MAX_LIFE_TIME:
				return getMaxLifeTime();
			case SubscriptionPackage.SUBSCRIPTION__MAX_LIFE_TIME_UOM_ID:
				return getMaxLifeTimeUomId();
			case SubscriptionPackage.SUBSCRIPTION__NEED_TYPE_ID:
				return getNeedTypeId();
			case SubscriptionPackage.SUBSCRIPTION__ORDER_ID:
				return getOrderId();
			case SubscriptionPackage.SUBSCRIPTION__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case SubscriptionPackage.SUBSCRIPTION__ORIGINATED_FROM_PARTY_ID:
				return getOriginatedFromPartyId();
			case SubscriptionPackage.SUBSCRIPTION__ORIGINATED_FROM_ROLE_TYPE_ID:
				return getOriginatedFromRoleTypeId();
			case SubscriptionPackage.SUBSCRIPTION__PARTY_ID:
				return getPartyId();
			case SubscriptionPackage.SUBSCRIPTION__PARTY_NEED_ID:
				return getPartyNeedId();
			case SubscriptionPackage.SUBSCRIPTION__PRODUCT_CATEGORY_ID:
				return getProductCategoryId();
			case SubscriptionPackage.SUBSCRIPTION__PRODUCT_ID:
				return getProductId();
			case SubscriptionPackage.SUBSCRIPTION__PURCHASE_FROM_DATE:
				return getPurchaseFromDate();
			case SubscriptionPackage.SUBSCRIPTION__PURCHASE_THRU_DATE:
				return getPurchaseThruDate();
			case SubscriptionPackage.SUBSCRIPTION__ROLE_TYPE_ID:
				return getRoleTypeId();
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_RESOURCE_ID:
				return getSubscriptionResourceId();
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_TYPE_ID:
				return getSubscriptionTypeId();
			case SubscriptionPackage.SUBSCRIPTION__THRU_DATE:
				return getThruDate();
			case SubscriptionPackage.SUBSCRIPTION__USE_COUNT_LIMIT:
				return getUseCountLimit();
			case SubscriptionPackage.SUBSCRIPTION__USE_TIME:
				return getUseTime();
			case SubscriptionPackage.SUBSCRIPTION__USE_TIME_UOM_ID:
				return getUseTimeUomId();
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_ATTRIBUTES:
				return getSubscriptionAttributes();
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_COMM_EVENTS:
				return getSubscriptionCommEvents();
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
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_ID:
				setSubscriptionId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__AUTOMATIC_EXTEND:
				setAutomaticExtend((Boolean)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__AVAILABLE_TIME:
				setAvailableTime((Long)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__AVAILABLE_TIME_UOM_ID:
				setAvailableTimeUomId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__CANCL_AUTM_EXT_TIME:
				setCanclAutmExtTime((Long)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__CANCL_AUTM_EXT_TIME_UOM_ID:
				setCanclAutmExtTimeUomId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__COMMUNICATION_EVENT_ID:
				setCommunicationEventId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__CONTACT_MECH_ID:
				setContactMechId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__EXPIRATION_COMPLETED_DATE:
				setExpirationCompletedDate((Date)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__EXTERNAL_SUBSCRIPTION_ID:
				setExternalSubscriptionId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY:
				setGracePeriodOnExpiry((Long)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY_UOM_ID:
				setGracePeriodOnExpiryUomId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__INVENTORY_ITEM_ID:
				setInventoryItemId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__MAX_LIFE_TIME:
				setMaxLifeTime((Long)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__MAX_LIFE_TIME_UOM_ID:
				setMaxLifeTimeUomId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__NEED_TYPE_ID:
				setNeedTypeId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__ORDER_ID:
				setOrderId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__ORIGINATED_FROM_PARTY_ID:
				setOriginatedFromPartyId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__ORIGINATED_FROM_ROLE_TYPE_ID:
				setOriginatedFromRoleTypeId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__PARTY_NEED_ID:
				setPartyNeedId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__PRODUCT_CATEGORY_ID:
				setProductCategoryId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__PURCHASE_FROM_DATE:
				setPurchaseFromDate((Date)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__PURCHASE_THRU_DATE:
				setPurchaseThruDate((Date)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__ROLE_TYPE_ID:
				setRoleTypeId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_RESOURCE_ID:
				setSubscriptionResourceId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_TYPE_ID:
				setSubscriptionTypeId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__USE_COUNT_LIMIT:
				setUseCountLimit((Long)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__USE_TIME:
				setUseTime((Long)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__USE_TIME_UOM_ID:
				setUseTimeUomId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_ATTRIBUTES:
				getSubscriptionAttributes().clear();
				getSubscriptionAttributes().addAll((Collection<? extends String>)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_COMM_EVENTS:
				getSubscriptionCommEvents().clear();
				getSubscriptionCommEvents().addAll((Collection<? extends String>)newValue);
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
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_ID:
				setSubscriptionId(SUBSCRIPTION_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__AUTOMATIC_EXTEND:
				setAutomaticExtend(AUTOMATIC_EXTEND_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__AVAILABLE_TIME:
				setAvailableTime(AVAILABLE_TIME_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__AVAILABLE_TIME_UOM_ID:
				setAvailableTimeUomId(AVAILABLE_TIME_UOM_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__CANCL_AUTM_EXT_TIME:
				setCanclAutmExtTime(CANCL_AUTM_EXT_TIME_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__CANCL_AUTM_EXT_TIME_UOM_ID:
				setCanclAutmExtTimeUomId(CANCL_AUTM_EXT_TIME_UOM_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__COMMUNICATION_EVENT_ID:
				setCommunicationEventId(COMMUNICATION_EVENT_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__CONTACT_MECH_ID:
				setContactMechId(CONTACT_MECH_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__EXPIRATION_COMPLETED_DATE:
				setExpirationCompletedDate(EXPIRATION_COMPLETED_DATE_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__EXTERNAL_SUBSCRIPTION_ID:
				setExternalSubscriptionId(EXTERNAL_SUBSCRIPTION_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY:
				setGracePeriodOnExpiry(GRACE_PERIOD_ON_EXPIRY_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY_UOM_ID:
				setGracePeriodOnExpiryUomId(GRACE_PERIOD_ON_EXPIRY_UOM_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__INVENTORY_ITEM_ID:
				setInventoryItemId(INVENTORY_ITEM_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__MAX_LIFE_TIME:
				setMaxLifeTime(MAX_LIFE_TIME_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__MAX_LIFE_TIME_UOM_ID:
				setMaxLifeTimeUomId(MAX_LIFE_TIME_UOM_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__NEED_TYPE_ID:
				setNeedTypeId(NEED_TYPE_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__ORIGINATED_FROM_PARTY_ID:
				setOriginatedFromPartyId(ORIGINATED_FROM_PARTY_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__ORIGINATED_FROM_ROLE_TYPE_ID:
				setOriginatedFromRoleTypeId(ORIGINATED_FROM_ROLE_TYPE_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__PARTY_NEED_ID:
				setPartyNeedId(PARTY_NEED_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__PRODUCT_CATEGORY_ID:
				setProductCategoryId(PRODUCT_CATEGORY_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__PURCHASE_FROM_DATE:
				setPurchaseFromDate(PURCHASE_FROM_DATE_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__PURCHASE_THRU_DATE:
				setPurchaseThruDate(PURCHASE_THRU_DATE_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__ROLE_TYPE_ID:
				setRoleTypeId(ROLE_TYPE_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_RESOURCE_ID:
				setSubscriptionResourceId(SUBSCRIPTION_RESOURCE_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_TYPE_ID:
				setSubscriptionTypeId(SUBSCRIPTION_TYPE_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__USE_COUNT_LIMIT:
				setUseCountLimit(USE_COUNT_LIMIT_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__USE_TIME:
				setUseTime(USE_TIME_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__USE_TIME_UOM_ID:
				setUseTimeUomId(USE_TIME_UOM_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_ATTRIBUTES:
				getSubscriptionAttributes().clear();
				return;
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_COMM_EVENTS:
				getSubscriptionCommEvents().clear();
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
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_ID:
				return SUBSCRIPTION_ID_EDEFAULT == null ? subscriptionId != null : !SUBSCRIPTION_ID_EDEFAULT.equals(subscriptionId);
			case SubscriptionPackage.SUBSCRIPTION__AUTOMATIC_EXTEND:
				return automaticExtend != AUTOMATIC_EXTEND_EDEFAULT;
			case SubscriptionPackage.SUBSCRIPTION__AVAILABLE_TIME:
				return availableTime != AVAILABLE_TIME_EDEFAULT;
			case SubscriptionPackage.SUBSCRIPTION__AVAILABLE_TIME_UOM_ID:
				return AVAILABLE_TIME_UOM_ID_EDEFAULT == null ? availableTimeUomId != null : !AVAILABLE_TIME_UOM_ID_EDEFAULT.equals(availableTimeUomId);
			case SubscriptionPackage.SUBSCRIPTION__CANCL_AUTM_EXT_TIME:
				return canclAutmExtTime != CANCL_AUTM_EXT_TIME_EDEFAULT;
			case SubscriptionPackage.SUBSCRIPTION__CANCL_AUTM_EXT_TIME_UOM_ID:
				return CANCL_AUTM_EXT_TIME_UOM_ID_EDEFAULT == null ? canclAutmExtTimeUomId != null : !CANCL_AUTM_EXT_TIME_UOM_ID_EDEFAULT.equals(canclAutmExtTimeUomId);
			case SubscriptionPackage.SUBSCRIPTION__COMMUNICATION_EVENT_ID:
				return COMMUNICATION_EVENT_ID_EDEFAULT == null ? communicationEventId != null : !COMMUNICATION_EVENT_ID_EDEFAULT.equals(communicationEventId);
			case SubscriptionPackage.SUBSCRIPTION__CONTACT_MECH_ID:
				return CONTACT_MECH_ID_EDEFAULT == null ? contactMechId != null : !CONTACT_MECH_ID_EDEFAULT.equals(contactMechId);
			case SubscriptionPackage.SUBSCRIPTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SubscriptionPackage.SUBSCRIPTION__EXPIRATION_COMPLETED_DATE:
				return EXPIRATION_COMPLETED_DATE_EDEFAULT == null ? expirationCompletedDate != null : !EXPIRATION_COMPLETED_DATE_EDEFAULT.equals(expirationCompletedDate);
			case SubscriptionPackage.SUBSCRIPTION__EXTERNAL_SUBSCRIPTION_ID:
				return EXTERNAL_SUBSCRIPTION_ID_EDEFAULT == null ? externalSubscriptionId != null : !EXTERNAL_SUBSCRIPTION_ID_EDEFAULT.equals(externalSubscriptionId);
			case SubscriptionPackage.SUBSCRIPTION__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case SubscriptionPackage.SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY:
				return gracePeriodOnExpiry != GRACE_PERIOD_ON_EXPIRY_EDEFAULT;
			case SubscriptionPackage.SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY_UOM_ID:
				return GRACE_PERIOD_ON_EXPIRY_UOM_ID_EDEFAULT == null ? gracePeriodOnExpiryUomId != null : !GRACE_PERIOD_ON_EXPIRY_UOM_ID_EDEFAULT.equals(gracePeriodOnExpiryUomId);
			case SubscriptionPackage.SUBSCRIPTION__INVENTORY_ITEM_ID:
				return INVENTORY_ITEM_ID_EDEFAULT == null ? inventoryItemId != null : !INVENTORY_ITEM_ID_EDEFAULT.equals(inventoryItemId);
			case SubscriptionPackage.SUBSCRIPTION__MAX_LIFE_TIME:
				return maxLifeTime != MAX_LIFE_TIME_EDEFAULT;
			case SubscriptionPackage.SUBSCRIPTION__MAX_LIFE_TIME_UOM_ID:
				return MAX_LIFE_TIME_UOM_ID_EDEFAULT == null ? maxLifeTimeUomId != null : !MAX_LIFE_TIME_UOM_ID_EDEFAULT.equals(maxLifeTimeUomId);
			case SubscriptionPackage.SUBSCRIPTION__NEED_TYPE_ID:
				return NEED_TYPE_ID_EDEFAULT == null ? needTypeId != null : !NEED_TYPE_ID_EDEFAULT.equals(needTypeId);
			case SubscriptionPackage.SUBSCRIPTION__ORDER_ID:
				return ORDER_ID_EDEFAULT == null ? orderId != null : !ORDER_ID_EDEFAULT.equals(orderId);
			case SubscriptionPackage.SUBSCRIPTION__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case SubscriptionPackage.SUBSCRIPTION__ORIGINATED_FROM_PARTY_ID:
				return ORIGINATED_FROM_PARTY_ID_EDEFAULT == null ? originatedFromPartyId != null : !ORIGINATED_FROM_PARTY_ID_EDEFAULT.equals(originatedFromPartyId);
			case SubscriptionPackage.SUBSCRIPTION__ORIGINATED_FROM_ROLE_TYPE_ID:
				return ORIGINATED_FROM_ROLE_TYPE_ID_EDEFAULT == null ? originatedFromRoleTypeId != null : !ORIGINATED_FROM_ROLE_TYPE_ID_EDEFAULT.equals(originatedFromRoleTypeId);
			case SubscriptionPackage.SUBSCRIPTION__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case SubscriptionPackage.SUBSCRIPTION__PARTY_NEED_ID:
				return PARTY_NEED_ID_EDEFAULT == null ? partyNeedId != null : !PARTY_NEED_ID_EDEFAULT.equals(partyNeedId);
			case SubscriptionPackage.SUBSCRIPTION__PRODUCT_CATEGORY_ID:
				return PRODUCT_CATEGORY_ID_EDEFAULT == null ? productCategoryId != null : !PRODUCT_CATEGORY_ID_EDEFAULT.equals(productCategoryId);
			case SubscriptionPackage.SUBSCRIPTION__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case SubscriptionPackage.SUBSCRIPTION__PURCHASE_FROM_DATE:
				return PURCHASE_FROM_DATE_EDEFAULT == null ? purchaseFromDate != null : !PURCHASE_FROM_DATE_EDEFAULT.equals(purchaseFromDate);
			case SubscriptionPackage.SUBSCRIPTION__PURCHASE_THRU_DATE:
				return PURCHASE_THRU_DATE_EDEFAULT == null ? purchaseThruDate != null : !PURCHASE_THRU_DATE_EDEFAULT.equals(purchaseThruDate);
			case SubscriptionPackage.SUBSCRIPTION__ROLE_TYPE_ID:
				return ROLE_TYPE_ID_EDEFAULT == null ? roleTypeId != null : !ROLE_TYPE_ID_EDEFAULT.equals(roleTypeId);
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_RESOURCE_ID:
				return SUBSCRIPTION_RESOURCE_ID_EDEFAULT == null ? subscriptionResourceId != null : !SUBSCRIPTION_RESOURCE_ID_EDEFAULT.equals(subscriptionResourceId);
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_TYPE_ID:
				return SUBSCRIPTION_TYPE_ID_EDEFAULT == null ? subscriptionTypeId != null : !SUBSCRIPTION_TYPE_ID_EDEFAULT.equals(subscriptionTypeId);
			case SubscriptionPackage.SUBSCRIPTION__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case SubscriptionPackage.SUBSCRIPTION__USE_COUNT_LIMIT:
				return useCountLimit != USE_COUNT_LIMIT_EDEFAULT;
			case SubscriptionPackage.SUBSCRIPTION__USE_TIME:
				return useTime != USE_TIME_EDEFAULT;
			case SubscriptionPackage.SUBSCRIPTION__USE_TIME_UOM_ID:
				return USE_TIME_UOM_ID_EDEFAULT == null ? useTimeUomId != null : !USE_TIME_UOM_ID_EDEFAULT.equals(useTimeUomId);
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_ATTRIBUTES:
				return subscriptionAttributes != null && !subscriptionAttributes.isEmpty();
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_COMM_EVENTS:
				return subscriptionCommEvents != null && !subscriptionCommEvents.isEmpty();
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
		result.append(" (subscriptionId: ");
		result.append(subscriptionId);
		result.append(", automaticExtend: ");
		result.append(automaticExtend);
		result.append(", availableTime: ");
		result.append(availableTime);
		result.append(", availableTimeUomId: ");
		result.append(availableTimeUomId);
		result.append(", canclAutmExtTime: ");
		result.append(canclAutmExtTime);
		result.append(", canclAutmExtTimeUomId: ");
		result.append(canclAutmExtTimeUomId);
		result.append(", communicationEventId: ");
		result.append(communicationEventId);
		result.append(", contactMechId: ");
		result.append(contactMechId);
		result.append(", description: ");
		result.append(description);
		result.append(", expirationCompletedDate: ");
		result.append(expirationCompletedDate);
		result.append(", externalSubscriptionId: ");
		result.append(externalSubscriptionId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", gracePeriodOnExpiry: ");
		result.append(gracePeriodOnExpiry);
		result.append(", gracePeriodOnExpiryUomId: ");
		result.append(gracePeriodOnExpiryUomId);
		result.append(", inventoryItemId: ");
		result.append(inventoryItemId);
		result.append(", maxLifeTime: ");
		result.append(maxLifeTime);
		result.append(", maxLifeTimeUomId: ");
		result.append(maxLifeTimeUomId);
		result.append(", needTypeId: ");
		result.append(needTypeId);
		result.append(", orderId: ");
		result.append(orderId);
		result.append(", orderItemSeqId: ");
		result.append(orderItemSeqId);
		result.append(", originatedFromPartyId: ");
		result.append(originatedFromPartyId);
		result.append(", originatedFromRoleTypeId: ");
		result.append(originatedFromRoleTypeId);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", partyNeedId: ");
		result.append(partyNeedId);
		result.append(", productCategoryId: ");
		result.append(productCategoryId);
		result.append(", productId: ");
		result.append(productId);
		result.append(", purchaseFromDate: ");
		result.append(purchaseFromDate);
		result.append(", purchaseThruDate: ");
		result.append(purchaseThruDate);
		result.append(", roleTypeId: ");
		result.append(roleTypeId);
		result.append(", subscriptionResourceId: ");
		result.append(subscriptionResourceId);
		result.append(", subscriptionTypeId: ");
		result.append(subscriptionTypeId);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(", useCountLimit: ");
		result.append(useCountLimit);
		result.append(", useTime: ");
		result.append(useTime);
		result.append(", useTimeUomId: ");
		result.append(useTimeUomId);
		result.append(", subscriptionAttributes: ");
		result.append(subscriptionAttributes);
		result.append(", subscriptionCommEvents: ");
		result.append(subscriptionCommEvents);
		result.append(')');
		return result.toString();
	}

} //SubscriptionImpl
