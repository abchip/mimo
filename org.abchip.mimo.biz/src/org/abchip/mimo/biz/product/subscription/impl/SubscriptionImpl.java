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

import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.need.NeedType;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.RoleType;
import org.abchip.mimo.biz.product.category.ProductCategory;
import org.abchip.mimo.biz.product.inventory.InventoryItem;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.subscription.Subscription;
import org.abchip.mimo.biz.product.subscription.SubscriptionPackage;
import org.abchip.mimo.biz.product.subscription.SubscriptionResource;
import org.abchip.mimo.biz.product.subscription.SubscriptionType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getCanclAutmExtTime <em>Cancl Autm Ext Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getCommunicationEventId <em>Communication Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getExpirationCompletedDate <em>Expiration Completed Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getExternalSubscriptionId <em>External Subscription Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getGracePeriodOnExpiry <em>Grace Period On Expiry</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getMaxLifeTime <em>Max Life Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getPartyNeedId <em>Party Need Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getPurchaseFromDate <em>Purchase From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getPurchaseThruDate <em>Purchase Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getUseCountLimit <em>Use Count Limit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getUseTime <em>Use Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getSubscriptionResourceId <em>Subscription Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getUseTimeUomId <em>Use Time Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getCanclAutmExtTimeUomId <em>Cancl Autm Ext Time Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getAvailableTimeUomId <em>Available Time Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getMaxLifeTimeUomId <em>Max Life Time Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getOriginatedFromPartyId <em>Originated From Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getOriginatedFromRoleTypeId <em>Originated From Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getNeedTypeId <em>Need Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getSubscriptionTypeId <em>Subscription Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getGracePeriodOnExpiryUomId <em>Grace Period On Expiry Uom Id</em>}</li>
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
	 * The cached value of the '{@link #getSubscriptionResourceId() <em>Subscription Resource Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionResourceId()
	 * @generated
	 * @ordered
	 */
	protected SubscriptionResource subscriptionResourceId;

	/**
	 * The cached value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected ContactMech contactMechId;

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
	 * The cached value of the '{@link #getUseTimeUomId() <em>Use Time Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTimeUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom useTimeUomId;

	/**
	 * The cached value of the '{@link #getCanclAutmExtTimeUomId() <em>Cancl Autm Ext Time Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanclAutmExtTimeUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom canclAutmExtTimeUomId;

	/**
	 * The cached value of the '{@link #getAvailableTimeUomId() <em>Available Time Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableTimeUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom availableTimeUomId;

	/**
	 * The cached value of the '{@link #getMaxLifeTimeUomId() <em>Max Life Time Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLifeTimeUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom maxLifeTimeUomId;

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
	 * The cached value of the '{@link #getOriginatedFromPartyId() <em>Originated From Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatedFromPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party originatedFromPartyId;

	/**
	 * The cached value of the '{@link #getOriginatedFromRoleTypeId() <em>Originated From Role Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatedFromRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected RoleType originatedFromRoleTypeId;

	/**
	 * The cached value of the '{@link #getNeedTypeId() <em>Need Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedTypeId()
	 * @generated
	 * @ordered
	 */
	protected NeedType needTypeId;

	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected OrderHeader orderId;

	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected Product productId;

	/**
	 * The cached value of the '{@link #getProductCategoryId() <em>Product Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected ProductCategory productCategoryId;

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
	 * The cached value of the '{@link #getSubscriptionTypeId() <em>Subscription Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptionTypeId()
	 * @generated
	 * @ordered
	 */
	protected SubscriptionType subscriptionTypeId;

	/**
	 * The cached value of the '{@link #getGracePeriodOnExpiryUomId() <em>Grace Period On Expiry Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGracePeriodOnExpiryUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom gracePeriodOnExpiryUomId;

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
	public Uom getAvailableTimeUomId() {
		if (availableTimeUomId != null && ((EObject)availableTimeUomId).eIsProxy()) {
			InternalEObject oldAvailableTimeUomId = (InternalEObject)availableTimeUomId;
			availableTimeUomId = (Uom)eResolveProxy(oldAvailableTimeUomId);
			if (availableTimeUomId != oldAvailableTimeUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SubscriptionPackage.SUBSCRIPTION__AVAILABLE_TIME_UOM_ID, oldAvailableTimeUomId, availableTimeUomId));
			}
		}
		return availableTimeUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetAvailableTimeUomId() {
		return availableTimeUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableTimeUomId(Uom newAvailableTimeUomId) {
		Uom oldAvailableTimeUomId = availableTimeUomId;
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
	public Uom getCanclAutmExtTimeUomId() {
		if (canclAutmExtTimeUomId != null && ((EObject)canclAutmExtTimeUomId).eIsProxy()) {
			InternalEObject oldCanclAutmExtTimeUomId = (InternalEObject)canclAutmExtTimeUomId;
			canclAutmExtTimeUomId = (Uom)eResolveProxy(oldCanclAutmExtTimeUomId);
			if (canclAutmExtTimeUomId != oldCanclAutmExtTimeUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SubscriptionPackage.SUBSCRIPTION__CANCL_AUTM_EXT_TIME_UOM_ID, oldCanclAutmExtTimeUomId, canclAutmExtTimeUomId));
			}
		}
		return canclAutmExtTimeUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetCanclAutmExtTimeUomId() {
		return canclAutmExtTimeUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanclAutmExtTimeUomId(Uom newCanclAutmExtTimeUomId) {
		Uom oldCanclAutmExtTimeUomId = canclAutmExtTimeUomId;
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
	public ContactMech getContactMechId() {
		if (contactMechId != null && ((EObject)contactMechId).eIsProxy()) {
			InternalEObject oldContactMechId = (InternalEObject)contactMechId;
			contactMechId = (ContactMech)eResolveProxy(oldContactMechId);
			if (contactMechId != oldContactMechId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SubscriptionPackage.SUBSCRIPTION__CONTACT_MECH_ID, oldContactMechId, contactMechId));
			}
		}
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMech basicGetContactMechId() {
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(ContactMech newContactMechId) {
		ContactMech oldContactMechId = contactMechId;
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
	public Uom getGracePeriodOnExpiryUomId() {
		if (gracePeriodOnExpiryUomId != null && ((EObject)gracePeriodOnExpiryUomId).eIsProxy()) {
			InternalEObject oldGracePeriodOnExpiryUomId = (InternalEObject)gracePeriodOnExpiryUomId;
			gracePeriodOnExpiryUomId = (Uom)eResolveProxy(oldGracePeriodOnExpiryUomId);
			if (gracePeriodOnExpiryUomId != oldGracePeriodOnExpiryUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SubscriptionPackage.SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY_UOM_ID, oldGracePeriodOnExpiryUomId, gracePeriodOnExpiryUomId));
			}
		}
		return gracePeriodOnExpiryUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetGracePeriodOnExpiryUomId() {
		return gracePeriodOnExpiryUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGracePeriodOnExpiryUomId(Uom newGracePeriodOnExpiryUomId) {
		Uom oldGracePeriodOnExpiryUomId = gracePeriodOnExpiryUomId;
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
	public Uom getMaxLifeTimeUomId() {
		if (maxLifeTimeUomId != null && ((EObject)maxLifeTimeUomId).eIsProxy()) {
			InternalEObject oldMaxLifeTimeUomId = (InternalEObject)maxLifeTimeUomId;
			maxLifeTimeUomId = (Uom)eResolveProxy(oldMaxLifeTimeUomId);
			if (maxLifeTimeUomId != oldMaxLifeTimeUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SubscriptionPackage.SUBSCRIPTION__MAX_LIFE_TIME_UOM_ID, oldMaxLifeTimeUomId, maxLifeTimeUomId));
			}
		}
		return maxLifeTimeUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetMaxLifeTimeUomId() {
		return maxLifeTimeUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLifeTimeUomId(Uom newMaxLifeTimeUomId) {
		Uom oldMaxLifeTimeUomId = maxLifeTimeUomId;
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
	public NeedType getNeedTypeId() {
		if (needTypeId != null && ((EObject)needTypeId).eIsProxy()) {
			InternalEObject oldNeedTypeId = (InternalEObject)needTypeId;
			needTypeId = (NeedType)eResolveProxy(oldNeedTypeId);
			if (needTypeId != oldNeedTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SubscriptionPackage.SUBSCRIPTION__NEED_TYPE_ID, oldNeedTypeId, needTypeId));
			}
		}
		return needTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeedType basicGetNeedTypeId() {
		return needTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeedTypeId(NeedType newNeedTypeId) {
		NeedType oldNeedTypeId = needTypeId;
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
	public OrderHeader getOrderId() {
		if (orderId != null && ((EObject)orderId).eIsProxy()) {
			InternalEObject oldOrderId = (InternalEObject)orderId;
			orderId = (OrderHeader)eResolveProxy(oldOrderId);
			if (orderId != oldOrderId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SubscriptionPackage.SUBSCRIPTION__ORDER_ID, oldOrderId, orderId));
			}
		}
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderHeader basicGetOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(OrderHeader newOrderId) {
		OrderHeader oldOrderId = orderId;
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
	public Party getOriginatedFromPartyId() {
		if (originatedFromPartyId != null && ((EObject)originatedFromPartyId).eIsProxy()) {
			InternalEObject oldOriginatedFromPartyId = (InternalEObject)originatedFromPartyId;
			originatedFromPartyId = (Party)eResolveProxy(oldOriginatedFromPartyId);
			if (originatedFromPartyId != oldOriginatedFromPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SubscriptionPackage.SUBSCRIPTION__ORIGINATED_FROM_PARTY_ID, oldOriginatedFromPartyId, originatedFromPartyId));
			}
		}
		return originatedFromPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetOriginatedFromPartyId() {
		return originatedFromPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginatedFromPartyId(Party newOriginatedFromPartyId) {
		Party oldOriginatedFromPartyId = originatedFromPartyId;
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
	public RoleType getOriginatedFromRoleTypeId() {
		if (originatedFromRoleTypeId != null && ((EObject)originatedFromRoleTypeId).eIsProxy()) {
			InternalEObject oldOriginatedFromRoleTypeId = (InternalEObject)originatedFromRoleTypeId;
			originatedFromRoleTypeId = (RoleType)eResolveProxy(oldOriginatedFromRoleTypeId);
			if (originatedFromRoleTypeId != oldOriginatedFromRoleTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SubscriptionPackage.SUBSCRIPTION__ORIGINATED_FROM_ROLE_TYPE_ID, oldOriginatedFromRoleTypeId, originatedFromRoleTypeId));
			}
		}
		return originatedFromRoleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetOriginatedFromRoleTypeId() {
		return originatedFromRoleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginatedFromRoleTypeId(RoleType newOriginatedFromRoleTypeId) {
		RoleType oldOriginatedFromRoleTypeId = originatedFromRoleTypeId;
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
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SubscriptionPackage.SUBSCRIPTION__PARTY_ID, oldPartyId, partyId));
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
	public RoleType getRoleTypeId() {
		if (roleTypeId != null && ((EObject)roleTypeId).eIsProxy()) {
			InternalEObject oldRoleTypeId = (InternalEObject)roleTypeId;
			roleTypeId = (RoleType)eResolveProxy(oldRoleTypeId);
			if (roleTypeId != oldRoleTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SubscriptionPackage.SUBSCRIPTION__ROLE_TYPE_ID, oldRoleTypeId, roleTypeId));
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
	public Uom getUseTimeUomId() {
		if (useTimeUomId != null && ((EObject)useTimeUomId).eIsProxy()) {
			InternalEObject oldUseTimeUomId = (InternalEObject)useTimeUomId;
			useTimeUomId = (Uom)eResolveProxy(oldUseTimeUomId);
			if (useTimeUomId != oldUseTimeUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SubscriptionPackage.SUBSCRIPTION__USE_TIME_UOM_ID, oldUseTimeUomId, useTimeUomId));
			}
		}
		return useTimeUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetUseTimeUomId() {
		return useTimeUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseTimeUomId(Uom newUseTimeUomId) {
		Uom oldUseTimeUomId = useTimeUomId;
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
	public SubscriptionResource getSubscriptionResourceId() {
		if (subscriptionResourceId != null && ((EObject)subscriptionResourceId).eIsProxy()) {
			InternalEObject oldSubscriptionResourceId = (InternalEObject)subscriptionResourceId;
			subscriptionResourceId = (SubscriptionResource)eResolveProxy(oldSubscriptionResourceId);
			if (subscriptionResourceId != oldSubscriptionResourceId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_RESOURCE_ID, oldSubscriptionResourceId, subscriptionResourceId));
			}
		}
		return subscriptionResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionResource basicGetSubscriptionResourceId() {
		return subscriptionResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionResourceId(SubscriptionResource newSubscriptionResourceId) {
		SubscriptionResource oldSubscriptionResourceId = subscriptionResourceId;
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
	public Product getProductId() {
		if (productId != null && ((EObject)productId).eIsProxy()) {
			InternalEObject oldProductId = (InternalEObject)productId;
			productId = (Product)eResolveProxy(oldProductId);
			if (productId != oldProductId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SubscriptionPackage.SUBSCRIPTION__PRODUCT_ID, oldProductId, productId));
			}
		}
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		Product oldProductId = productId;
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
	public ProductCategory getProductCategoryId() {
		if (productCategoryId != null && ((EObject)productCategoryId).eIsProxy()) {
			InternalEObject oldProductCategoryId = (InternalEObject)productCategoryId;
			productCategoryId = (ProductCategory)eResolveProxy(oldProductCategoryId);
			if (productCategoryId != oldProductCategoryId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SubscriptionPackage.SUBSCRIPTION__PRODUCT_CATEGORY_ID, oldProductCategoryId, productCategoryId));
			}
		}
		return productCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductCategory basicGetProductCategoryId() {
		return productCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryId(ProductCategory newProductCategoryId) {
		ProductCategory oldProductCategoryId = productCategoryId;
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
	public InventoryItem getInventoryItemId() {
		if (inventoryItemId != null && ((EObject)inventoryItemId).eIsProxy()) {
			InternalEObject oldInventoryItemId = (InternalEObject)inventoryItemId;
			inventoryItemId = (InventoryItem)eResolveProxy(oldInventoryItemId);
			if (inventoryItemId != oldInventoryItemId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SubscriptionPackage.SUBSCRIPTION__INVENTORY_ITEM_ID, oldInventoryItemId, inventoryItemId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.SUBSCRIPTION__INVENTORY_ITEM_ID, oldInventoryItemId, inventoryItemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionType getSubscriptionTypeId() {
		if (subscriptionTypeId != null && ((EObject)subscriptionTypeId).eIsProxy()) {
			InternalEObject oldSubscriptionTypeId = (InternalEObject)subscriptionTypeId;
			subscriptionTypeId = (SubscriptionType)eResolveProxy(oldSubscriptionTypeId);
			if (subscriptionTypeId != oldSubscriptionTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_TYPE_ID, oldSubscriptionTypeId, subscriptionTypeId));
			}
		}
		return subscriptionTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscriptionType basicGetSubscriptionTypeId() {
		return subscriptionTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionTypeId(SubscriptionType newSubscriptionTypeId) {
		SubscriptionType oldSubscriptionTypeId = subscriptionTypeId;
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
			case SubscriptionPackage.SUBSCRIPTION__CANCL_AUTM_EXT_TIME:
				return getCanclAutmExtTime();
			case SubscriptionPackage.SUBSCRIPTION__COMMUNICATION_EVENT_ID:
				return getCommunicationEventId();
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
			case SubscriptionPackage.SUBSCRIPTION__MAX_LIFE_TIME:
				return getMaxLifeTime();
			case SubscriptionPackage.SUBSCRIPTION__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case SubscriptionPackage.SUBSCRIPTION__PARTY_NEED_ID:
				return getPartyNeedId();
			case SubscriptionPackage.SUBSCRIPTION__PURCHASE_FROM_DATE:
				return getPurchaseFromDate();
			case SubscriptionPackage.SUBSCRIPTION__PURCHASE_THRU_DATE:
				return getPurchaseThruDate();
			case SubscriptionPackage.SUBSCRIPTION__THRU_DATE:
				return getThruDate();
			case SubscriptionPackage.SUBSCRIPTION__USE_COUNT_LIMIT:
				return getUseCountLimit();
			case SubscriptionPackage.SUBSCRIPTION__USE_TIME:
				return getUseTime();
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_RESOURCE_ID:
				if (resolve) return getSubscriptionResourceId();
				return basicGetSubscriptionResourceId();
			case SubscriptionPackage.SUBSCRIPTION__CONTACT_MECH_ID:
				if (resolve) return getContactMechId();
				return basicGetContactMechId();
			case SubscriptionPackage.SUBSCRIPTION__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case SubscriptionPackage.SUBSCRIPTION__USE_TIME_UOM_ID:
				if (resolve) return getUseTimeUomId();
				return basicGetUseTimeUomId();
			case SubscriptionPackage.SUBSCRIPTION__CANCL_AUTM_EXT_TIME_UOM_ID:
				if (resolve) return getCanclAutmExtTimeUomId();
				return basicGetCanclAutmExtTimeUomId();
			case SubscriptionPackage.SUBSCRIPTION__AVAILABLE_TIME_UOM_ID:
				if (resolve) return getAvailableTimeUomId();
				return basicGetAvailableTimeUomId();
			case SubscriptionPackage.SUBSCRIPTION__MAX_LIFE_TIME_UOM_ID:
				if (resolve) return getMaxLifeTimeUomId();
				return basicGetMaxLifeTimeUomId();
			case SubscriptionPackage.SUBSCRIPTION__ROLE_TYPE_ID:
				if (resolve) return getRoleTypeId();
				return basicGetRoleTypeId();
			case SubscriptionPackage.SUBSCRIPTION__ORIGINATED_FROM_PARTY_ID:
				if (resolve) return getOriginatedFromPartyId();
				return basicGetOriginatedFromPartyId();
			case SubscriptionPackage.SUBSCRIPTION__ORIGINATED_FROM_ROLE_TYPE_ID:
				if (resolve) return getOriginatedFromRoleTypeId();
				return basicGetOriginatedFromRoleTypeId();
			case SubscriptionPackage.SUBSCRIPTION__NEED_TYPE_ID:
				if (resolve) return getNeedTypeId();
				return basicGetNeedTypeId();
			case SubscriptionPackage.SUBSCRIPTION__ORDER_ID:
				if (resolve) return getOrderId();
				return basicGetOrderId();
			case SubscriptionPackage.SUBSCRIPTION__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case SubscriptionPackage.SUBSCRIPTION__PRODUCT_CATEGORY_ID:
				if (resolve) return getProductCategoryId();
				return basicGetProductCategoryId();
			case SubscriptionPackage.SUBSCRIPTION__INVENTORY_ITEM_ID:
				if (resolve) return getInventoryItemId();
				return basicGetInventoryItemId();
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_TYPE_ID:
				if (resolve) return getSubscriptionTypeId();
				return basicGetSubscriptionTypeId();
			case SubscriptionPackage.SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY_UOM_ID:
				if (resolve) return getGracePeriodOnExpiryUomId();
				return basicGetGracePeriodOnExpiryUomId();
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
			case SubscriptionPackage.SUBSCRIPTION__CANCL_AUTM_EXT_TIME:
				setCanclAutmExtTime((Long)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__COMMUNICATION_EVENT_ID:
				setCommunicationEventId((String)newValue);
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
			case SubscriptionPackage.SUBSCRIPTION__MAX_LIFE_TIME:
				setMaxLifeTime((Long)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__PARTY_NEED_ID:
				setPartyNeedId((String)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__PURCHASE_FROM_DATE:
				setPurchaseFromDate((Date)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__PURCHASE_THRU_DATE:
				setPurchaseThruDate((Date)newValue);
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
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_RESOURCE_ID:
				setSubscriptionResourceId((SubscriptionResource)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__CONTACT_MECH_ID:
				setContactMechId((ContactMech)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__USE_TIME_UOM_ID:
				setUseTimeUomId((Uom)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__CANCL_AUTM_EXT_TIME_UOM_ID:
				setCanclAutmExtTimeUomId((Uom)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__AVAILABLE_TIME_UOM_ID:
				setAvailableTimeUomId((Uom)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__MAX_LIFE_TIME_UOM_ID:
				setMaxLifeTimeUomId((Uom)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__ORIGINATED_FROM_PARTY_ID:
				setOriginatedFromPartyId((Party)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__ORIGINATED_FROM_ROLE_TYPE_ID:
				setOriginatedFromRoleTypeId((RoleType)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__NEED_TYPE_ID:
				setNeedTypeId((NeedType)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__ORDER_ID:
				setOrderId((OrderHeader)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__PRODUCT_CATEGORY_ID:
				setProductCategoryId((ProductCategory)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__INVENTORY_ITEM_ID:
				setInventoryItemId((InventoryItem)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_TYPE_ID:
				setSubscriptionTypeId((SubscriptionType)newValue);
				return;
			case SubscriptionPackage.SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY_UOM_ID:
				setGracePeriodOnExpiryUomId((Uom)newValue);
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
			case SubscriptionPackage.SUBSCRIPTION__CANCL_AUTM_EXT_TIME:
				setCanclAutmExtTime(CANCL_AUTM_EXT_TIME_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__COMMUNICATION_EVENT_ID:
				setCommunicationEventId(COMMUNICATION_EVENT_ID_EDEFAULT);
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
			case SubscriptionPackage.SUBSCRIPTION__MAX_LIFE_TIME:
				setMaxLifeTime(MAX_LIFE_TIME_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__PARTY_NEED_ID:
				setPartyNeedId(PARTY_NEED_ID_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__PURCHASE_FROM_DATE:
				setPurchaseFromDate(PURCHASE_FROM_DATE_EDEFAULT);
				return;
			case SubscriptionPackage.SUBSCRIPTION__PURCHASE_THRU_DATE:
				setPurchaseThruDate(PURCHASE_THRU_DATE_EDEFAULT);
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
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_RESOURCE_ID:
				setSubscriptionResourceId((SubscriptionResource)null);
				return;
			case SubscriptionPackage.SUBSCRIPTION__CONTACT_MECH_ID:
				setContactMechId((ContactMech)null);
				return;
			case SubscriptionPackage.SUBSCRIPTION__PARTY_ID:
				setPartyId((Party)null);
				return;
			case SubscriptionPackage.SUBSCRIPTION__USE_TIME_UOM_ID:
				setUseTimeUomId((Uom)null);
				return;
			case SubscriptionPackage.SUBSCRIPTION__CANCL_AUTM_EXT_TIME_UOM_ID:
				setCanclAutmExtTimeUomId((Uom)null);
				return;
			case SubscriptionPackage.SUBSCRIPTION__AVAILABLE_TIME_UOM_ID:
				setAvailableTimeUomId((Uom)null);
				return;
			case SubscriptionPackage.SUBSCRIPTION__MAX_LIFE_TIME_UOM_ID:
				setMaxLifeTimeUomId((Uom)null);
				return;
			case SubscriptionPackage.SUBSCRIPTION__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)null);
				return;
			case SubscriptionPackage.SUBSCRIPTION__ORIGINATED_FROM_PARTY_ID:
				setOriginatedFromPartyId((Party)null);
				return;
			case SubscriptionPackage.SUBSCRIPTION__ORIGINATED_FROM_ROLE_TYPE_ID:
				setOriginatedFromRoleTypeId((RoleType)null);
				return;
			case SubscriptionPackage.SUBSCRIPTION__NEED_TYPE_ID:
				setNeedTypeId((NeedType)null);
				return;
			case SubscriptionPackage.SUBSCRIPTION__ORDER_ID:
				setOrderId((OrderHeader)null);
				return;
			case SubscriptionPackage.SUBSCRIPTION__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case SubscriptionPackage.SUBSCRIPTION__PRODUCT_CATEGORY_ID:
				setProductCategoryId((ProductCategory)null);
				return;
			case SubscriptionPackage.SUBSCRIPTION__INVENTORY_ITEM_ID:
				setInventoryItemId((InventoryItem)null);
				return;
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_TYPE_ID:
				setSubscriptionTypeId((SubscriptionType)null);
				return;
			case SubscriptionPackage.SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY_UOM_ID:
				setGracePeriodOnExpiryUomId((Uom)null);
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
			case SubscriptionPackage.SUBSCRIPTION__CANCL_AUTM_EXT_TIME:
				return canclAutmExtTime != CANCL_AUTM_EXT_TIME_EDEFAULT;
			case SubscriptionPackage.SUBSCRIPTION__COMMUNICATION_EVENT_ID:
				return COMMUNICATION_EVENT_ID_EDEFAULT == null ? communicationEventId != null : !COMMUNICATION_EVENT_ID_EDEFAULT.equals(communicationEventId);
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
			case SubscriptionPackage.SUBSCRIPTION__MAX_LIFE_TIME:
				return maxLifeTime != MAX_LIFE_TIME_EDEFAULT;
			case SubscriptionPackage.SUBSCRIPTION__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case SubscriptionPackage.SUBSCRIPTION__PARTY_NEED_ID:
				return PARTY_NEED_ID_EDEFAULT == null ? partyNeedId != null : !PARTY_NEED_ID_EDEFAULT.equals(partyNeedId);
			case SubscriptionPackage.SUBSCRIPTION__PURCHASE_FROM_DATE:
				return PURCHASE_FROM_DATE_EDEFAULT == null ? purchaseFromDate != null : !PURCHASE_FROM_DATE_EDEFAULT.equals(purchaseFromDate);
			case SubscriptionPackage.SUBSCRIPTION__PURCHASE_THRU_DATE:
				return PURCHASE_THRU_DATE_EDEFAULT == null ? purchaseThruDate != null : !PURCHASE_THRU_DATE_EDEFAULT.equals(purchaseThruDate);
			case SubscriptionPackage.SUBSCRIPTION__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case SubscriptionPackage.SUBSCRIPTION__USE_COUNT_LIMIT:
				return useCountLimit != USE_COUNT_LIMIT_EDEFAULT;
			case SubscriptionPackage.SUBSCRIPTION__USE_TIME:
				return useTime != USE_TIME_EDEFAULT;
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_RESOURCE_ID:
				return subscriptionResourceId != null;
			case SubscriptionPackage.SUBSCRIPTION__CONTACT_MECH_ID:
				return contactMechId != null;
			case SubscriptionPackage.SUBSCRIPTION__PARTY_ID:
				return partyId != null;
			case SubscriptionPackage.SUBSCRIPTION__USE_TIME_UOM_ID:
				return useTimeUomId != null;
			case SubscriptionPackage.SUBSCRIPTION__CANCL_AUTM_EXT_TIME_UOM_ID:
				return canclAutmExtTimeUomId != null;
			case SubscriptionPackage.SUBSCRIPTION__AVAILABLE_TIME_UOM_ID:
				return availableTimeUomId != null;
			case SubscriptionPackage.SUBSCRIPTION__MAX_LIFE_TIME_UOM_ID:
				return maxLifeTimeUomId != null;
			case SubscriptionPackage.SUBSCRIPTION__ROLE_TYPE_ID:
				return roleTypeId != null;
			case SubscriptionPackage.SUBSCRIPTION__ORIGINATED_FROM_PARTY_ID:
				return originatedFromPartyId != null;
			case SubscriptionPackage.SUBSCRIPTION__ORIGINATED_FROM_ROLE_TYPE_ID:
				return originatedFromRoleTypeId != null;
			case SubscriptionPackage.SUBSCRIPTION__NEED_TYPE_ID:
				return needTypeId != null;
			case SubscriptionPackage.SUBSCRIPTION__ORDER_ID:
				return orderId != null;
			case SubscriptionPackage.SUBSCRIPTION__PRODUCT_ID:
				return productId != null;
			case SubscriptionPackage.SUBSCRIPTION__PRODUCT_CATEGORY_ID:
				return productCategoryId != null;
			case SubscriptionPackage.SUBSCRIPTION__INVENTORY_ITEM_ID:
				return inventoryItemId != null;
			case SubscriptionPackage.SUBSCRIPTION__SUBSCRIPTION_TYPE_ID:
				return subscriptionTypeId != null;
			case SubscriptionPackage.SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY_UOM_ID:
				return gracePeriodOnExpiryUomId != null;
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
		result.append(", canclAutmExtTime: ");
		result.append(canclAutmExtTime);
		result.append(", communicationEventId: ");
		result.append(communicationEventId);
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
		result.append(", maxLifeTime: ");
		result.append(maxLifeTime);
		result.append(", orderItemSeqId: ");
		result.append(orderItemSeqId);
		result.append(", partyNeedId: ");
		result.append(partyNeedId);
		result.append(", purchaseFromDate: ");
		result.append(purchaseFromDate);
		result.append(", purchaseThruDate: ");
		result.append(purchaseThruDate);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(", useCountLimit: ");
		result.append(useCountLimit);
		result.append(", useTime: ");
		result.append(useTime);
		result.append(", subscriptionAttributes: ");
		result.append(subscriptionAttributes);
		result.append(", subscriptionCommEvents: ");
		result.append(subscriptionCommEvents);
		result.append(')');
		return result.toString();
	}

} //SubscriptionImpl
