/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.subscription.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource;
import org.abchip.mimo.biz.product.subscription.SubscriptionPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Subscription Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.ProductSubscriptionResourceImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.ProductSubscriptionResourceImpl#getSubscriptionResourceId <em>Subscription Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.ProductSubscriptionResourceImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.ProductSubscriptionResourceImpl#isAutomaticExtend <em>Automatic Extend</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.ProductSubscriptionResourceImpl#getAvailableTime <em>Available Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.ProductSubscriptionResourceImpl#getAvailableTimeUomId <em>Available Time Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.ProductSubscriptionResourceImpl#getCanclAutmExtTime <em>Cancl Autm Ext Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.ProductSubscriptionResourceImpl#getCanclAutmExtTimeUomId <em>Cancl Autm Ext Time Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.ProductSubscriptionResourceImpl#getGracePeriodOnExpiry <em>Grace Period On Expiry</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.ProductSubscriptionResourceImpl#getGracePeriodOnExpiryUomId <em>Grace Period On Expiry Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.ProductSubscriptionResourceImpl#getMaxLifeTime <em>Max Life Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.ProductSubscriptionResourceImpl#getMaxLifeTimeUomId <em>Max Life Time Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.ProductSubscriptionResourceImpl#getPurchaseFromDate <em>Purchase From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.ProductSubscriptionResourceImpl#getPurchaseThruDate <em>Purchase Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.ProductSubscriptionResourceImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.ProductSubscriptionResourceImpl#getUseCountLimit <em>Use Count Limit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.ProductSubscriptionResourceImpl#getUseRoleTypeId <em>Use Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.ProductSubscriptionResourceImpl#getUseTime <em>Use Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.ProductSubscriptionResourceImpl#getUseTimeUomId <em>Use Time Uom Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductSubscriptionResourceImpl extends BizEntityImpl implements ProductSubscriptionResource {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The default value of the '{@link #getUseRoleTypeId() <em>Use Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_ROLE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseRoleTypeId() <em>Use Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected String useRoleTypeId = USE_ROLE_TYPE_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductSubscriptionResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__AVAILABLE_TIME, oldAvailableTime, availableTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__AVAILABLE_TIME_UOM_ID, oldAvailableTimeUomId, availableTimeUomId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__CANCL_AUTM_EXT_TIME, oldCanclAutmExtTime, canclAutmExtTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__CANCL_AUTM_EXT_TIME_UOM_ID, oldCanclAutmExtTimeUomId, canclAutmExtTimeUomId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__FROM_DATE, oldFromDate, fromDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__AUTOMATIC_EXTEND, oldAutomaticExtend, automaticExtend));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__GRACE_PERIOD_ON_EXPIRY, oldGracePeriodOnExpiry, gracePeriodOnExpiry));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__GRACE_PERIOD_ON_EXPIRY_UOM_ID, oldGracePeriodOnExpiryUomId, gracePeriodOnExpiryUomId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__MAX_LIFE_TIME, oldMaxLifeTime, maxLifeTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__MAX_LIFE_TIME_UOM_ID, oldMaxLifeTimeUomId, maxLifeTimeUomId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__PURCHASE_FROM_DATE, oldPurchaseFromDate, purchaseFromDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__PURCHASE_THRU_DATE, oldPurchaseThruDate, purchaseThruDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__THRU_DATE, oldThruDate, thruDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__USE_COUNT_LIMIT, oldUseCountLimit, useCountLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUseRoleTypeId() {
		return useRoleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseRoleTypeId(String newUseRoleTypeId) {
		String oldUseRoleTypeId = useRoleTypeId;
		useRoleTypeId = newUseRoleTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__USE_ROLE_TYPE_ID, oldUseRoleTypeId, useRoleTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__USE_TIME, oldUseTime, useTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__USE_TIME_UOM_ID, oldUseTimeUomId, useTimeUomId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__PRODUCT_ID, oldProductId, productId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__SUBSCRIPTION_RESOURCE_ID, oldSubscriptionResourceId, subscriptionResourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__PRODUCT_ID:
				return getProductId();
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__SUBSCRIPTION_RESOURCE_ID:
				return getSubscriptionResourceId();
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__FROM_DATE:
				return getFromDate();
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__AUTOMATIC_EXTEND:
				return isAutomaticExtend();
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__AVAILABLE_TIME:
				return getAvailableTime();
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__AVAILABLE_TIME_UOM_ID:
				return getAvailableTimeUomId();
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__CANCL_AUTM_EXT_TIME:
				return getCanclAutmExtTime();
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__CANCL_AUTM_EXT_TIME_UOM_ID:
				return getCanclAutmExtTimeUomId();
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__GRACE_PERIOD_ON_EXPIRY:
				return getGracePeriodOnExpiry();
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__GRACE_PERIOD_ON_EXPIRY_UOM_ID:
				return getGracePeriodOnExpiryUomId();
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__MAX_LIFE_TIME:
				return getMaxLifeTime();
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__MAX_LIFE_TIME_UOM_ID:
				return getMaxLifeTimeUomId();
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__PURCHASE_FROM_DATE:
				return getPurchaseFromDate();
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__PURCHASE_THRU_DATE:
				return getPurchaseThruDate();
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__THRU_DATE:
				return getThruDate();
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__USE_COUNT_LIMIT:
				return getUseCountLimit();
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__USE_ROLE_TYPE_ID:
				return getUseRoleTypeId();
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__USE_TIME:
				return getUseTime();
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__USE_TIME_UOM_ID:
				return getUseTimeUomId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__SUBSCRIPTION_RESOURCE_ID:
				setSubscriptionResourceId((String)newValue);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__AUTOMATIC_EXTEND:
				setAutomaticExtend((Boolean)newValue);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__AVAILABLE_TIME:
				setAvailableTime((Long)newValue);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__AVAILABLE_TIME_UOM_ID:
				setAvailableTimeUomId((String)newValue);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__CANCL_AUTM_EXT_TIME:
				setCanclAutmExtTime((Long)newValue);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__CANCL_AUTM_EXT_TIME_UOM_ID:
				setCanclAutmExtTimeUomId((String)newValue);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__GRACE_PERIOD_ON_EXPIRY:
				setGracePeriodOnExpiry((Long)newValue);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__GRACE_PERIOD_ON_EXPIRY_UOM_ID:
				setGracePeriodOnExpiryUomId((String)newValue);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__MAX_LIFE_TIME:
				setMaxLifeTime((Long)newValue);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__MAX_LIFE_TIME_UOM_ID:
				setMaxLifeTimeUomId((String)newValue);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__PURCHASE_FROM_DATE:
				setPurchaseFromDate((Date)newValue);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__PURCHASE_THRU_DATE:
				setPurchaseThruDate((Date)newValue);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__USE_COUNT_LIMIT:
				setUseCountLimit((Long)newValue);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__USE_ROLE_TYPE_ID:
				setUseRoleTypeId((String)newValue);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__USE_TIME:
				setUseTime((Long)newValue);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__USE_TIME_UOM_ID:
				setUseTimeUomId((String)newValue);
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
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__SUBSCRIPTION_RESOURCE_ID:
				setSubscriptionResourceId(SUBSCRIPTION_RESOURCE_ID_EDEFAULT);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__AUTOMATIC_EXTEND:
				setAutomaticExtend(AUTOMATIC_EXTEND_EDEFAULT);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__AVAILABLE_TIME:
				setAvailableTime(AVAILABLE_TIME_EDEFAULT);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__AVAILABLE_TIME_UOM_ID:
				setAvailableTimeUomId(AVAILABLE_TIME_UOM_ID_EDEFAULT);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__CANCL_AUTM_EXT_TIME:
				setCanclAutmExtTime(CANCL_AUTM_EXT_TIME_EDEFAULT);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__CANCL_AUTM_EXT_TIME_UOM_ID:
				setCanclAutmExtTimeUomId(CANCL_AUTM_EXT_TIME_UOM_ID_EDEFAULT);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__GRACE_PERIOD_ON_EXPIRY:
				setGracePeriodOnExpiry(GRACE_PERIOD_ON_EXPIRY_EDEFAULT);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__GRACE_PERIOD_ON_EXPIRY_UOM_ID:
				setGracePeriodOnExpiryUomId(GRACE_PERIOD_ON_EXPIRY_UOM_ID_EDEFAULT);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__MAX_LIFE_TIME:
				setMaxLifeTime(MAX_LIFE_TIME_EDEFAULT);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__MAX_LIFE_TIME_UOM_ID:
				setMaxLifeTimeUomId(MAX_LIFE_TIME_UOM_ID_EDEFAULT);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__PURCHASE_FROM_DATE:
				setPurchaseFromDate(PURCHASE_FROM_DATE_EDEFAULT);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__PURCHASE_THRU_DATE:
				setPurchaseThruDate(PURCHASE_THRU_DATE_EDEFAULT);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__USE_COUNT_LIMIT:
				setUseCountLimit(USE_COUNT_LIMIT_EDEFAULT);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__USE_ROLE_TYPE_ID:
				setUseRoleTypeId(USE_ROLE_TYPE_ID_EDEFAULT);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__USE_TIME:
				setUseTime(USE_TIME_EDEFAULT);
				return;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__USE_TIME_UOM_ID:
				setUseTimeUomId(USE_TIME_UOM_ID_EDEFAULT);
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
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__SUBSCRIPTION_RESOURCE_ID:
				return SUBSCRIPTION_RESOURCE_ID_EDEFAULT == null ? subscriptionResourceId != null : !SUBSCRIPTION_RESOURCE_ID_EDEFAULT.equals(subscriptionResourceId);
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__AUTOMATIC_EXTEND:
				return automaticExtend != AUTOMATIC_EXTEND_EDEFAULT;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__AVAILABLE_TIME:
				return availableTime != AVAILABLE_TIME_EDEFAULT;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__AVAILABLE_TIME_UOM_ID:
				return AVAILABLE_TIME_UOM_ID_EDEFAULT == null ? availableTimeUomId != null : !AVAILABLE_TIME_UOM_ID_EDEFAULT.equals(availableTimeUomId);
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__CANCL_AUTM_EXT_TIME:
				return canclAutmExtTime != CANCL_AUTM_EXT_TIME_EDEFAULT;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__CANCL_AUTM_EXT_TIME_UOM_ID:
				return CANCL_AUTM_EXT_TIME_UOM_ID_EDEFAULT == null ? canclAutmExtTimeUomId != null : !CANCL_AUTM_EXT_TIME_UOM_ID_EDEFAULT.equals(canclAutmExtTimeUomId);
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__GRACE_PERIOD_ON_EXPIRY:
				return gracePeriodOnExpiry != GRACE_PERIOD_ON_EXPIRY_EDEFAULT;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__GRACE_PERIOD_ON_EXPIRY_UOM_ID:
				return GRACE_PERIOD_ON_EXPIRY_UOM_ID_EDEFAULT == null ? gracePeriodOnExpiryUomId != null : !GRACE_PERIOD_ON_EXPIRY_UOM_ID_EDEFAULT.equals(gracePeriodOnExpiryUomId);
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__MAX_LIFE_TIME:
				return maxLifeTime != MAX_LIFE_TIME_EDEFAULT;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__MAX_LIFE_TIME_UOM_ID:
				return MAX_LIFE_TIME_UOM_ID_EDEFAULT == null ? maxLifeTimeUomId != null : !MAX_LIFE_TIME_UOM_ID_EDEFAULT.equals(maxLifeTimeUomId);
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__PURCHASE_FROM_DATE:
				return PURCHASE_FROM_DATE_EDEFAULT == null ? purchaseFromDate != null : !PURCHASE_FROM_DATE_EDEFAULT.equals(purchaseFromDate);
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__PURCHASE_THRU_DATE:
				return PURCHASE_THRU_DATE_EDEFAULT == null ? purchaseThruDate != null : !PURCHASE_THRU_DATE_EDEFAULT.equals(purchaseThruDate);
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__USE_COUNT_LIMIT:
				return useCountLimit != USE_COUNT_LIMIT_EDEFAULT;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__USE_ROLE_TYPE_ID:
				return USE_ROLE_TYPE_ID_EDEFAULT == null ? useRoleTypeId != null : !USE_ROLE_TYPE_ID_EDEFAULT.equals(useRoleTypeId);
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__USE_TIME:
				return useTime != USE_TIME_EDEFAULT;
			case SubscriptionPackage.PRODUCT_SUBSCRIPTION_RESOURCE__USE_TIME_UOM_ID:
				return USE_TIME_UOM_ID_EDEFAULT == null ? useTimeUomId != null : !USE_TIME_UOM_ID_EDEFAULT.equals(useTimeUomId);
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
		result.append(" (productId: ");
		result.append(productId);
		result.append(", subscriptionResourceId: ");
		result.append(subscriptionResourceId);
		result.append(", fromDate: ");
		result.append(fromDate);
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
		result.append(", gracePeriodOnExpiry: ");
		result.append(gracePeriodOnExpiry);
		result.append(", gracePeriodOnExpiryUomId: ");
		result.append(gracePeriodOnExpiryUomId);
		result.append(", maxLifeTime: ");
		result.append(maxLifeTime);
		result.append(", maxLifeTimeUomId: ");
		result.append(maxLifeTimeUomId);
		result.append(", purchaseFromDate: ");
		result.append(purchaseFromDate);
		result.append(", purchaseThruDate: ");
		result.append(purchaseThruDate);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(", useCountLimit: ");
		result.append(useCountLimit);
		result.append(", useRoleTypeId: ");
		result.append(useRoleTypeId);
		result.append(", useTime: ");
		result.append(useTime);
		result.append(", useTimeUomId: ");
		result.append(useTimeUomId);
		result.append(')');
		return result.toString();
	}

} //ProductSubscriptionResourceImpl
