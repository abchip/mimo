/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.subscription;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Subscription Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getSubscriptionResourceId <em>Subscription Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#isAutomaticExtend <em>Automatic Extend</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getAvailableTime <em>Available Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getAvailableTimeUomId <em>Available Time Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getCanclAutmExtTime <em>Cancl Autm Ext Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getCanclAutmExtTimeUomId <em>Cancl Autm Ext Time Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getGracePeriodOnExpiry <em>Grace Period On Expiry</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getGracePeriodOnExpiryUomId <em>Grace Period On Expiry Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getMaxLifeTime <em>Max Life Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getMaxLifeTimeUomId <em>Max Life Time Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getPurchaseFromDate <em>Purchase From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getPurchaseThruDate <em>Purchase Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getUseCountLimit <em>Use Count Limit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getUseRoleTypeId <em>Use Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getUseTime <em>Use Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getUseTimeUomId <em>Use Time Uom Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getProductSubscriptionResource()
 * @model
 * @generated
 */
public interface ProductSubscriptionResource extends BizEntity {
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
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getProductSubscriptionResource_AvailableTime()
	 * @model
	 * @generated
	 */
	long getAvailableTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getAvailableTime <em>Available Time</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getProductSubscriptionResource_AvailableTimeUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getAvailableTimeUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getAvailableTimeUomId <em>Available Time Uom Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getProductSubscriptionResource_CanclAutmExtTime()
	 * @model
	 * @generated
	 */
	long getCanclAutmExtTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getCanclAutmExtTime <em>Cancl Autm Ext Time</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getProductSubscriptionResource_CanclAutmExtTimeUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getCanclAutmExtTimeUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getCanclAutmExtTimeUomId <em>Cancl Autm Ext Time Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancl Autm Ext Time Uom Id</em>' attribute.
	 * @see #getCanclAutmExtTimeUomId()
	 * @generated
	 */
	void setCanclAutmExtTimeUomId(String value);

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
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getProductSubscriptionResource_FromDate()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

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
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getProductSubscriptionResource_AutomaticExtend()
	 * @model
	 * @generated
	 */
	boolean isAutomaticExtend();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#isAutomaticExtend <em>Automatic Extend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Extend</em>' attribute.
	 * @see #isAutomaticExtend()
	 * @generated
	 */
	void setAutomaticExtend(boolean value);

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
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getProductSubscriptionResource_GracePeriodOnExpiry()
	 * @model
	 * @generated
	 */
	long getGracePeriodOnExpiry();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getGracePeriodOnExpiry <em>Grace Period On Expiry</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getProductSubscriptionResource_GracePeriodOnExpiryUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getGracePeriodOnExpiryUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getGracePeriodOnExpiryUomId <em>Grace Period On Expiry Uom Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getProductSubscriptionResource_MaxLifeTime()
	 * @model
	 * @generated
	 */
	long getMaxLifeTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getMaxLifeTime <em>Max Life Time</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getProductSubscriptionResource_MaxLifeTimeUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getMaxLifeTimeUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getMaxLifeTimeUomId <em>Max Life Time Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Life Time Uom Id</em>' attribute.
	 * @see #getMaxLifeTimeUomId()
	 * @generated
	 */
	void setMaxLifeTimeUomId(String value);

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
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getProductSubscriptionResource_PurchaseFromDate()
	 * @model
	 * @generated
	 */
	Date getPurchaseFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getPurchaseFromDate <em>Purchase From Date</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getProductSubscriptionResource_PurchaseThruDate()
	 * @model
	 * @generated
	 */
	Date getPurchaseThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getPurchaseThruDate <em>Purchase Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Thru Date</em>' attribute.
	 * @see #getPurchaseThruDate()
	 * @generated
	 */
	void setPurchaseThruDate(Date value);

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
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getProductSubscriptionResource_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getThruDate <em>Thru Date</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getProductSubscriptionResource_UseCountLimit()
	 * @model
	 * @generated
	 */
	long getUseCountLimit();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getUseCountLimit <em>Use Count Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Count Limit</em>' attribute.
	 * @see #getUseCountLimit()
	 * @generated
	 */
	void setUseCountLimit(long value);

	/**
	 * Returns the value of the '<em><b>Use Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Role Type Id</em>' attribute.
	 * @see #setUseRoleTypeId(String)
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getProductSubscriptionResource_UseRoleTypeId()
	 * @model annotation="mimo-ent-domain frame='RoleType'"
	 * @generated
	 */
	String getUseRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getUseRoleTypeId <em>Use Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Role Type Id</em>' attribute.
	 * @see #getUseRoleTypeId()
	 * @generated
	 */
	void setUseRoleTypeId(String value);

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
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getProductSubscriptionResource_UseTime()
	 * @model
	 * @generated
	 */
	long getUseTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getUseTime <em>Use Time</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getProductSubscriptionResource_UseTimeUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getUseTimeUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getUseTimeUomId <em>Use Time Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Time Uom Id</em>' attribute.
	 * @see #getUseTimeUomId()
	 * @generated
	 */
	void setUseTimeUomId(String value);

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
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getProductSubscriptionResource_ProductId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Product'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

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
	 * @see org.abchip.mimo.biz.product.subscription.SubscriptionPackage#getProductSubscriptionResource_SubscriptionResourceId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='SubscriptionResource'"
	 * @generated
	 */
	String getSubscriptionResourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.subscription.ProductSubscriptionResource#getSubscriptionResourceId <em>Subscription Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription Resource Id</em>' attribute.
	 * @see #getSubscriptionResourceId()
	 * @generated
	 */
	void setSubscriptionResourceId(String value);

} // ProductSubscriptionResource
