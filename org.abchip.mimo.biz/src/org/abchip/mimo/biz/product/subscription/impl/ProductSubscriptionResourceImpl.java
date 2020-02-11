/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.subscription.impl;

import java.util.Date;

import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.RoleType;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource;
import org.abchip.mimo.biz.product.subscription.SubscriptionPackage;
import org.abchip.mimo.biz.product.subscription.SubscriptionResource;
import org.eclipse.emf.ecore.EClass;

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
		return (Long)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__AVAILABLE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableTime(long newAvailableTime) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__AVAILABLE_TIME, newAvailableTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getAvailableTimeUomId() {
		return (Uom)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__AVAILABLE_TIME_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableTimeUomId(Uom newAvailableTimeUomId) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__AVAILABLE_TIME_UOM_ID, newAvailableTimeUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getCanclAutmExtTime() {
		return (Long)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__CANCL_AUTM_EXT_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanclAutmExtTime(long newCanclAutmExtTime) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__CANCL_AUTM_EXT_TIME, newCanclAutmExtTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCanclAutmExtTimeUomId() {
		return (Uom)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__CANCL_AUTM_EXT_TIME_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanclAutmExtTimeUomId(Uom newCanclAutmExtTimeUomId) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__CANCL_AUTM_EXT_TIME_UOM_ID, newCanclAutmExtTimeUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutomaticExtend() {
		return (Boolean)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__AUTOMATIC_EXTEND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutomaticExtend(boolean newAutomaticExtend) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__AUTOMATIC_EXTEND, newAutomaticExtend);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getGracePeriodOnExpiry() {
		return (Long)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__GRACE_PERIOD_ON_EXPIRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGracePeriodOnExpiry(long newGracePeriodOnExpiry) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__GRACE_PERIOD_ON_EXPIRY, newGracePeriodOnExpiry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getGracePeriodOnExpiryUomId() {
		return (Uom)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__GRACE_PERIOD_ON_EXPIRY_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGracePeriodOnExpiryUomId(Uom newGracePeriodOnExpiryUomId) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__GRACE_PERIOD_ON_EXPIRY_UOM_ID, newGracePeriodOnExpiryUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxLifeTime() {
		return (Long)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__MAX_LIFE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLifeTime(long newMaxLifeTime) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__MAX_LIFE_TIME, newMaxLifeTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getMaxLifeTimeUomId() {
		return (Uom)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__MAX_LIFE_TIME_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLifeTimeUomId(Uom newMaxLifeTimeUomId) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__MAX_LIFE_TIME_UOM_ID, newMaxLifeTimeUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPurchaseFromDate() {
		return (Date)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__PURCHASE_FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaseFromDate(Date newPurchaseFromDate) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__PURCHASE_FROM_DATE, newPurchaseFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPurchaseThruDate() {
		return (Date)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__PURCHASE_THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaseThruDate(Date newPurchaseThruDate) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__PURCHASE_THRU_DATE, newPurchaseThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__THRU_DATE, newThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getUseCountLimit() {
		return (Long)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__USE_COUNT_LIMIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseCountLimit(long newUseCountLimit) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__USE_COUNT_LIMIT, newUseCountLimit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getUseRoleTypeId() {
		return (RoleType)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__USE_ROLE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseRoleTypeId(RoleType newUseRoleTypeId) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__USE_ROLE_TYPE_ID, newUseRoleTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getUseTime() {
		return (Long)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__USE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseTime(long newUseTime) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__USE_TIME, newUseTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getUseTimeUomId() {
		return (Uom)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__USE_TIME_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseTimeUomId(Uom newUseTimeUomId) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__USE_TIME_UOM_ID, newUseTimeUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductId() {
		return (Product)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__PRODUCT_ID, newProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionResource getSubscriptionResourceId() {
		return (SubscriptionResource)eGet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__SUBSCRIPTION_RESOURCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionResourceId(SubscriptionResource newSubscriptionResourceId) {
		eSet(SubscriptionPackage.Literals.PRODUCT_SUBSCRIPTION_RESOURCE__SUBSCRIPTION_RESOURCE_ID, newSubscriptionResourceId);
	}

} //ProductSubscriptionResourceImpl
