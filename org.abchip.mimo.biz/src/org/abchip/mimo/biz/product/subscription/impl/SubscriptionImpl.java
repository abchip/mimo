/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.subscription.impl;

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
import org.abchip.mimo.biz.product.subscription.SubscriptionAttribute;
import org.abchip.mimo.biz.product.subscription.SubscriptionCommEvent;
import org.abchip.mimo.biz.product.subscription.SubscriptionPackage;
import org.abchip.mimo.biz.product.subscription.SubscriptionResource;
import org.abchip.mimo.biz.product.subscription.SubscriptionType;
import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getSubscriptionAttributes <em>Subscription Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getSubscriptionCommEvents <em>Subscription Comm Events</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getSubscriptionResourceId <em>Subscription Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getSubscriptionTypeId <em>Subscription Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getUseCountLimit <em>Use Count Limit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getUseTime <em>Use Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.impl.SubscriptionImpl#getUseTimeUomId <em>Use Time Uom Id</em>}</li>
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
		return (Long)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__AVAILABLE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableTime(long newAvailableTime) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__AVAILABLE_TIME, newAvailableTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getAvailableTimeUomId() {
		return (Uom)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__AVAILABLE_TIME_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableTimeUomId(Uom newAvailableTimeUomId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__AVAILABLE_TIME_UOM_ID, newAvailableTimeUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getCanclAutmExtTime() {
		return (Long)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__CANCL_AUTM_EXT_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanclAutmExtTime(long newCanclAutmExtTime) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__CANCL_AUTM_EXT_TIME, newCanclAutmExtTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCanclAutmExtTimeUomId() {
		return (Uom)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__CANCL_AUTM_EXT_TIME_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanclAutmExtTimeUomId(Uom newCanclAutmExtTimeUomId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__CANCL_AUTM_EXT_TIME_UOM_ID, newCanclAutmExtTimeUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommunicationEventId() {
		return (String)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__COMMUNICATION_EVENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationEventId(String newCommunicationEventId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__COMMUNICATION_EVENT_ID, newCommunicationEventId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getContactMechId() {
		return (ContactMech)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__CONTACT_MECH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(ContactMech newContactMechId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__CONTACT_MECH_ID, newContactMechId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExpirationCompletedDate() {
		return (Date)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__EXPIRATION_COMPLETED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpirationCompletedDate(Date newExpirationCompletedDate) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__EXPIRATION_COMPLETED_DATE, newExpirationCompletedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalSubscriptionId() {
		return (String)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__EXTERNAL_SUBSCRIPTION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalSubscriptionId(String newExternalSubscriptionId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__EXTERNAL_SUBSCRIPTION_ID, newExternalSubscriptionId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getGracePeriodOnExpiry() {
		return (Long)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGracePeriodOnExpiry(long newGracePeriodOnExpiry) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY, newGracePeriodOnExpiry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getGracePeriodOnExpiryUomId() {
		return (Uom)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGracePeriodOnExpiryUomId(Uom newGracePeriodOnExpiryUomId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__GRACE_PERIOD_ON_EXPIRY_UOM_ID, newGracePeriodOnExpiryUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxLifeTime() {
		return (Long)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__MAX_LIFE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLifeTime(long newMaxLifeTime) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__MAX_LIFE_TIME, newMaxLifeTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getMaxLifeTimeUomId() {
		return (Uom)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__MAX_LIFE_TIME_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLifeTimeUomId(Uom newMaxLifeTimeUomId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__MAX_LIFE_TIME_UOM_ID, newMaxLifeTimeUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeedType getNeedTypeId() {
		return (NeedType)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__NEED_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeedTypeId(NeedType newNeedTypeId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__NEED_TYPE_ID, newNeedTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeader getOrderId() {
		return (OrderHeader)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__ORDER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(OrderHeader newOrderId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__ORDER_ID, newOrderId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return (String)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__ORDER_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__ORDER_ITEM_SEQ_ID, newOrderItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getOriginatedFromPartyId() {
		return (Party)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__ORIGINATED_FROM_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginatedFromPartyId(Party newOriginatedFromPartyId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__ORIGINATED_FROM_PARTY_ID, newOriginatedFromPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getOriginatedFromRoleTypeId() {
		return (RoleType)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__ORIGINATED_FROM_ROLE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginatedFromRoleTypeId(RoleType newOriginatedFromRoleTypeId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__ORIGINATED_FROM_ROLE_TYPE_ID, newOriginatedFromRoleTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		return (Party)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyNeedId() {
		return (String)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__PARTY_NEED_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyNeedId(String newPartyNeedId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__PARTY_NEED_ID, newPartyNeedId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPurchaseFromDate() {
		return (Date)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__PURCHASE_FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaseFromDate(Date newPurchaseFromDate) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__PURCHASE_FROM_DATE, newPurchaseFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPurchaseThruDate() {
		return (Date)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__PURCHASE_THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaseThruDate(Date newPurchaseThruDate) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__PURCHASE_THRU_DATE, newPurchaseThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleTypeId() {
		return (RoleType)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__ROLE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(RoleType newRoleTypeId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__ROLE_TYPE_ID, newRoleTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<SubscriptionAttribute> getSubscriptionAttributes() {
		return (List<SubscriptionAttribute>)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__SUBSCRIPTION_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<SubscriptionCommEvent> getSubscriptionCommEvents() {
		return (List<SubscriptionCommEvent>)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__SUBSCRIPTION_COMM_EVENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__THRU_DATE, newThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getUseCountLimit() {
		return (Long)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__USE_COUNT_LIMIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseCountLimit(long newUseCountLimit) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__USE_COUNT_LIMIT, newUseCountLimit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getUseTime() {
		return (Long)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__USE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseTime(long newUseTime) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__USE_TIME, newUseTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getUseTimeUomId() {
		return (Uom)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__USE_TIME_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseTimeUomId(Uom newUseTimeUomId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__USE_TIME_UOM_ID, newUseTimeUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionResource getSubscriptionResourceId() {
		return (SubscriptionResource)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__SUBSCRIPTION_RESOURCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionResourceId(SubscriptionResource newSubscriptionResourceId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__SUBSCRIPTION_RESOURCE_ID, newSubscriptionResourceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductId() {
		return (Product)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__PRODUCT_ID, newProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategory getProductCategoryId() {
		return (ProductCategory)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__PRODUCT_CATEGORY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryId(ProductCategory newProductCategoryId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__PRODUCT_CATEGORY_ID, newProductCategoryId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItem getInventoryItemId() {
		return (InventoryItem)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__INVENTORY_ITEM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemId(InventoryItem newInventoryItemId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__INVENTORY_ITEM_ID, newInventoryItemId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscriptionType getSubscriptionTypeId() {
		return (SubscriptionType)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__SUBSCRIPTION_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionTypeId(SubscriptionType newSubscriptionTypeId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__SUBSCRIPTION_TYPE_ID, newSubscriptionTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubscriptionId() {
		return (String)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__SUBSCRIPTION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptionId(String newSubscriptionId) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__SUBSCRIPTION_ID, newSubscriptionId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutomaticExtend() {
		return (Boolean)eGet(SubscriptionPackage.Literals.SUBSCRIPTION__AUTOMATIC_EXTEND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutomaticExtend(boolean newAutomaticExtend) {
		eSet(SubscriptionPackage.Literals.SUBSCRIPTION__AUTOMATIC_EXTEND, newAutomaticExtend);
	}

} //SubscriptionImpl
