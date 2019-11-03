/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.subscription;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getSubscriptionId <em>Subscription Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#isAutomaticExtend <em>Automatic Extend</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getAvailableTime <em>Available Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getAvailableTimeUomId <em>Available Time Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getCanclAutmExtTime <em>Cancl Autm Ext Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getCanclAutmExtTimeUomId <em>Cancl Autm Ext Time Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getCommunicationEventId <em>Communication Event Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getExpirationCompletedDate <em>Expiration Completed Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getExternalSubscriptionId <em>External Subscription Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getGracePeriodOnExpiry <em>Grace Period On Expiry</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getGracePeriodOnExpiryUomId <em>Grace Period On Expiry Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getMaxLifeTime <em>Max Life Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getMaxLifeTimeUomId <em>Max Life Time Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getNeedTypeId <em>Need Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getOriginatedFromPartyId <em>Originated From Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getOriginatedFromRoleTypeId <em>Originated From Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getPartyNeedId <em>Party Need Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getPurchaseFromDate <em>Purchase From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getPurchaseThruDate <em>Purchase Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getSubscriptionResourceId <em>Subscription Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getSubscriptionTypeId <em>Subscription Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getUseCountLimit <em>Use Count Limit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getUseTime <em>Use Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getUseTimeUomId <em>Use Time Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getSubscriptionAttributes <em>Subscription Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.Subscription#getSubscriptionCommEvents <em>Subscription Comm Events</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface Subscription extends BizEntityTyped<SubscriptionType> {
	/**
	 * Returns the value of the '<em><b>Available Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Time</em>' attribute.
	 * @see #setAvailableTime(long)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_AvailableTime()
	 * @model
	 * @generated
	 */
	long getAvailableTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getAvailableTime <em>Available Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Time</em>' attribute.
	 * @see #getAvailableTime()
	 * @generated
	 */
	void setAvailableTime(long value);

	/**
	 * Returns the value of the '<em><b>Available Time Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Time Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Time Uom Id</em>' attribute.
	 * @see #setAvailableTimeUomId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_AvailableTimeUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getAvailableTimeUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getAvailableTimeUomId <em>Available Time Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Time Uom Id</em>' attribute.
	 * @see #getAvailableTimeUomId()
	 * @generated
	 */
	void setAvailableTimeUomId(String value);

	/**
	 * Returns the value of the '<em><b>Cancl Autm Ext Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancl Autm Ext Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancl Autm Ext Time</em>' attribute.
	 * @see #setCanclAutmExtTime(long)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_CanclAutmExtTime()
	 * @model
	 * @generated
	 */
	long getCanclAutmExtTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getCanclAutmExtTime <em>Cancl Autm Ext Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancl Autm Ext Time</em>' attribute.
	 * @see #getCanclAutmExtTime()
	 * @generated
	 */
	void setCanclAutmExtTime(long value);

	/**
	 * Returns the value of the '<em><b>Cancl Autm Ext Time Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancl Autm Ext Time Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancl Autm Ext Time Uom Id</em>' attribute.
	 * @see #setCanclAutmExtTimeUomId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_CanclAutmExtTimeUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getCanclAutmExtTimeUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getCanclAutmExtTimeUomId <em>Cancl Autm Ext Time Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancl Autm Ext Time Uom Id</em>' attribute.
	 * @see #getCanclAutmExtTimeUomId()
	 * @generated
	 */
	void setCanclAutmExtTimeUomId(String value);

	/**
	 * Returns the value of the '<em><b>Communication Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Event Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event Id</em>' attribute.
	 * @see #setCommunicationEventId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_CommunicationEventId()
	 * @model
	 * @generated
	 */
	String getCommunicationEventId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getCommunicationEventId <em>Communication Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Event Id</em>' attribute.
	 * @see #getCommunicationEventId()
	 * @generated
	 */
	void setCommunicationEventId(String value);

	/**
	 * Returns the value of the '<em><b>Contact Mech Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Id</em>' attribute.
	 * @see #setContactMechId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_ContactMechId()
	 * @model annotation="mimo-ent-domain frame='ContactMech'"
	 * @generated
	 */
	String getContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getContactMechId <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Id</em>' attribute.
	 * @see #getContactMechId()
	 * @generated
	 */
	void setContactMechId(String value);

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
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Expiration Completed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiration Completed Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Completed Date</em>' attribute.
	 * @see #setExpirationCompletedDate(Date)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_ExpirationCompletedDate()
	 * @model
	 * @generated
	 */
	Date getExpirationCompletedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getExpirationCompletedDate <em>Expiration Completed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Completed Date</em>' attribute.
	 * @see #getExpirationCompletedDate()
	 * @generated
	 */
	void setExpirationCompletedDate(Date value);

	/**
	 * Returns the value of the '<em><b>External Subscription Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Subscription Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Subscription Id</em>' attribute.
	 * @see #setExternalSubscriptionId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_ExternalSubscriptionId()
	 * @model
	 * @generated
	 */
	String getExternalSubscriptionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getExternalSubscriptionId <em>External Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Subscription Id</em>' attribute.
	 * @see #getExternalSubscriptionId()
	 * @generated
	 */
	void setExternalSubscriptionId(String value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Grace Period On Expiry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grace Period On Expiry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grace Period On Expiry</em>' attribute.
	 * @see #setGracePeriodOnExpiry(long)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_GracePeriodOnExpiry()
	 * @model
	 * @generated
	 */
	long getGracePeriodOnExpiry();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getGracePeriodOnExpiry <em>Grace Period On Expiry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grace Period On Expiry</em>' attribute.
	 * @see #getGracePeriodOnExpiry()
	 * @generated
	 */
	void setGracePeriodOnExpiry(long value);

	/**
	 * Returns the value of the '<em><b>Grace Period On Expiry Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grace Period On Expiry Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grace Period On Expiry Uom Id</em>' attribute.
	 * @see #setGracePeriodOnExpiryUomId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_GracePeriodOnExpiryUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getGracePeriodOnExpiryUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getGracePeriodOnExpiryUomId <em>Grace Period On Expiry Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grace Period On Expiry Uom Id</em>' attribute.
	 * @see #getGracePeriodOnExpiryUomId()
	 * @generated
	 */
	void setGracePeriodOnExpiryUomId(String value);

	/**
	 * Returns the value of the '<em><b>Max Life Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Life Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Life Time</em>' attribute.
	 * @see #setMaxLifeTime(long)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_MaxLifeTime()
	 * @model
	 * @generated
	 */
	long getMaxLifeTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getMaxLifeTime <em>Max Life Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Life Time</em>' attribute.
	 * @see #getMaxLifeTime()
	 * @generated
	 */
	void setMaxLifeTime(long value);

	/**
	 * Returns the value of the '<em><b>Max Life Time Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Life Time Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Life Time Uom Id</em>' attribute.
	 * @see #setMaxLifeTimeUomId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_MaxLifeTimeUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getMaxLifeTimeUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getMaxLifeTimeUomId <em>Max Life Time Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Life Time Uom Id</em>' attribute.
	 * @see #getMaxLifeTimeUomId()
	 * @generated
	 */
	void setMaxLifeTimeUomId(String value);

	/**
	 * Returns the value of the '<em><b>Need Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Need Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Need Type Id</em>' attribute.
	 * @see #setNeedTypeId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_NeedTypeId()
	 * @model annotation="mimo-ent-domain frame='NeedType'"
	 * @generated
	 */
	String getNeedTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getNeedTypeId <em>Need Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Need Type Id</em>' attribute.
	 * @see #getNeedTypeId()
	 * @generated
	 */
	void setNeedTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #setOrderId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_OrderId()
	 * @model annotation="mimo-ent-domain frame='OrderHeader'"
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #setOrderItemSeqId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_OrderItemSeqId()
	 * @model
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #getOrderItemSeqId()
	 * @generated
	 */
	void setOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Originated From Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Originated From Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Originated From Party Id</em>' attribute.
	 * @see #setOriginatedFromPartyId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_OriginatedFromPartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getOriginatedFromPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getOriginatedFromPartyId <em>Originated From Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originated From Party Id</em>' attribute.
	 * @see #getOriginatedFromPartyId()
	 * @generated
	 */
	void setOriginatedFromPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Originated From Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Originated From Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Originated From Role Type Id</em>' attribute.
	 * @see #setOriginatedFromRoleTypeId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_OriginatedFromRoleTypeId()
	 * @model annotation="mimo-ent-domain frame='RoleType'"
	 * @generated
	 */
	String getOriginatedFromRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getOriginatedFromRoleTypeId <em>Originated From Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originated From Role Type Id</em>' attribute.
	 * @see #getOriginatedFromRoleTypeId()
	 * @generated
	 */
	void setOriginatedFromRoleTypeId(String value);

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
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_PartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Party Need Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Need Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Need Id</em>' attribute.
	 * @see #setPartyNeedId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_PartyNeedId()
	 * @model
	 * @generated
	 */
	String getPartyNeedId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getPartyNeedId <em>Party Need Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Need Id</em>' attribute.
	 * @see #getPartyNeedId()
	 * @generated
	 */
	void setPartyNeedId(String value);

	/**
	 * Returns the value of the '<em><b>Purchase From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase From Date</em>' attribute.
	 * @see #setPurchaseFromDate(Date)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_PurchaseFromDate()
	 * @model
	 * @generated
	 */
	Date getPurchaseFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getPurchaseFromDate <em>Purchase From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase From Date</em>' attribute.
	 * @see #getPurchaseFromDate()
	 * @generated
	 */
	void setPurchaseFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Purchase Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purchase Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purchase Thru Date</em>' attribute.
	 * @see #setPurchaseThruDate(Date)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_PurchaseThruDate()
	 * @model
	 * @generated
	 */
	Date getPurchaseThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getPurchaseThruDate <em>Purchase Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Thru Date</em>' attribute.
	 * @see #getPurchaseThruDate()
	 * @generated
	 */
	void setPurchaseThruDate(Date value);

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
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_RoleTypeId()
	 * @model annotation="mimo-ent-domain frame='RoleType'"
	 * @generated
	 */
	String getRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getRoleTypeId <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id</em>' attribute.
	 * @see #getRoleTypeId()
	 * @generated
	 */
	void setRoleTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Use Count Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Count Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Count Limit</em>' attribute.
	 * @see #setUseCountLimit(long)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_UseCountLimit()
	 * @model
	 * @generated
	 */
	long getUseCountLimit();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getUseCountLimit <em>Use Count Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Count Limit</em>' attribute.
	 * @see #getUseCountLimit()
	 * @generated
	 */
	void setUseCountLimit(long value);

	/**
	 * Returns the value of the '<em><b>Use Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Time</em>' attribute.
	 * @see #setUseTime(long)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_UseTime()
	 * @model
	 * @generated
	 */
	long getUseTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getUseTime <em>Use Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Time</em>' attribute.
	 * @see #getUseTime()
	 * @generated
	 */
	void setUseTime(long value);

	/**
	 * Returns the value of the '<em><b>Use Time Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Time Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Time Uom Id</em>' attribute.
	 * @see #setUseTimeUomId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_UseTimeUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getUseTimeUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getUseTimeUomId <em>Use Time Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Time Uom Id</em>' attribute.
	 * @see #getUseTimeUomId()
	 * @generated
	 */
	void setUseTimeUomId(String value);

	/**
	 * Returns the value of the '<em><b>Subscription Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription Attributes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Attributes</em>' attribute list.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_SubscriptionAttributes()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SubscriptionAttribute'"
	 * @generated
	 */
	List<String> getSubscriptionAttributes();

	/**
	 * Returns the value of the '<em><b>Subscription Comm Events</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription Comm Events</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Comm Events</em>' attribute list.
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_SubscriptionCommEvents()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SubscriptionCommEvent'"
	 * @generated
	 */
	List<String> getSubscriptionCommEvents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SubscriptionFulfillmentPiece' route='subscriptionId'"
	 * @generated
	 */
	List<String> subscriptionFulfillmentPieces();

	/**
	 * Returns the value of the '<em><b>Subscription Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription Resource Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Resource Id</em>' attribute.
	 * @see #setSubscriptionResourceId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_SubscriptionResourceId()
	 * @model annotation="mimo-ent-domain frame='SubscriptionResource'"
	 * @generated
	 */
	String getSubscriptionResourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getSubscriptionResourceId <em>Subscription Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Resource Id</em>' attribute.
	 * @see #getSubscriptionResourceId()
	 * @generated
	 */
	void setSubscriptionResourceId(String value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_ProductId()
	 * @model annotation="mimo-ent-domain frame='Product'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

	/**
	 * Returns the value of the '<em><b>Product Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Category Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category Id</em>' attribute.
	 * @see #setProductCategoryId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_ProductCategoryId()
	 * @model annotation="mimo-ent-domain frame='ProductCategory'"
	 * @generated
	 */
	String getProductCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getProductCategoryId <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category Id</em>' attribute.
	 * @see #getProductCategoryId()
	 * @generated
	 */
	void setProductCategoryId(String value);

	/**
	 * Returns the value of the '<em><b>Inventory Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Item Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Id</em>' attribute.
	 * @see #setInventoryItemId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_InventoryItemId()
	 * @model annotation="mimo-ent-domain frame='InventoryItem'"
	 * @generated
	 */
	String getInventoryItemId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getInventoryItemId <em>Inventory Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item Id</em>' attribute.
	 * @see #getInventoryItemId()
	 * @generated
	 */
	void setInventoryItemId(String value);

	/**
	 * Returns the value of the '<em><b>Subscription Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Type Id</em>' attribute.
	 * @see #setSubscriptionTypeId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_SubscriptionTypeId()
	 * @model annotation="mimo-ent-domain frame='SubscriptionType'"
	 * @generated
	 */
	String getSubscriptionTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getSubscriptionTypeId <em>Subscription Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Type Id</em>' attribute.
	 * @see #getSubscriptionTypeId()
	 * @generated
	 */
	void setSubscriptionTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Subscription Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscription Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription Id</em>' attribute.
	 * @see #setSubscriptionId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_SubscriptionId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getSubscriptionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#getSubscriptionId <em>Subscription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Id</em>' attribute.
	 * @see #getSubscriptionId()
	 * @generated
	 */
	void setSubscriptionId(String value);

	/**
	 * Returns the value of the '<em><b>Automatic Extend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Automatic Extend</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automatic Extend</em>' attribute.
	 * @see #setAutomaticExtend(boolean)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getSubscription_AutomaticExtend()
	 * @model
	 * @generated
	 */
	boolean isAutomaticExtend();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.Subscription#isAutomaticExtend <em>Automatic Extend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Extend</em>' attribute.
	 * @see #isAutomaticExtend()
	 * @generated
	 */
	void setAutomaticExtend(boolean value);

} // Subscription
