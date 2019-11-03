/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.tracking;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tracking Code Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.TrackingCodeOrder#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.TrackingCodeOrder#getTrackingCodeTypeId <em>Tracking Code Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.TrackingCodeOrder#getAffiliateReferredTimeStamp <em>Affiliate Referred Time Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.TrackingCodeOrder#isHasExported <em>Has Exported</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.TrackingCodeOrder#isIsBillable <em>Is Billable</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.TrackingCodeOrder#getSiteId <em>Site Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.TrackingCodeOrder#getTrackingCodeId <em>Tracking Code Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.marketing.tracking.TrackingPackage#getTrackingCodeOrder()
 * @model
 * @generated
 */
public interface TrackingCodeOrder extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Affiliate Referred Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affiliate Referred Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affiliate Referred Time Stamp</em>' attribute.
	 * @see #setAffiliateReferredTimeStamp(Date)
	 * @see org.abchip.mimo.biz.marketing.tracking.TrackingPackage#getTrackingCodeOrder_AffiliateReferredTimeStamp()
	 * @model
	 * @generated
	 */
	Date getAffiliateReferredTimeStamp();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.tracking.TrackingCodeOrder#getAffiliateReferredTimeStamp <em>Affiliate Referred Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affiliate Referred Time Stamp</em>' attribute.
	 * @see #getAffiliateReferredTimeStamp()
	 * @generated
	 */
	void setAffiliateReferredTimeStamp(Date value);

	/**
	 * Returns the value of the '<em><b>Has Exported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Exported</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Exported</em>' attribute.
	 * @see #setHasExported(boolean)
	 * @see org.abchip.mimo.biz.marketing.tracking.TrackingPackage#getTrackingCodeOrder_HasExported()
	 * @model
	 * @generated
	 */
	boolean isHasExported();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.tracking.TrackingCodeOrder#isHasExported <em>Has Exported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Exported</em>' attribute.
	 * @see #isHasExported()
	 * @generated
	 */
	void setHasExported(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Billable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Billable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Billable</em>' attribute.
	 * @see #setIsBillable(boolean)
	 * @see org.abchip.mimo.biz.marketing.tracking.TrackingPackage#getTrackingCodeOrder_IsBillable()
	 * @model
	 * @generated
	 */
	boolean isIsBillable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.tracking.TrackingCodeOrder#isIsBillable <em>Is Billable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Billable</em>' attribute.
	 * @see #isIsBillable()
	 * @generated
	 */
	void setIsBillable(boolean value);

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
	 * @see org.abchip.mimo.biz.marketing.tracking.TrackingPackage#getTrackingCodeOrder_OrderId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='OrderHeader'"
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.tracking.TrackingCodeOrder#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Site Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Id</em>' attribute.
	 * @see #setSiteId(String)
	 * @see org.abchip.mimo.biz.marketing.tracking.TrackingPackage#getTrackingCodeOrder_SiteId()
	 * @model
	 * @generated
	 */
	String getSiteId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.tracking.TrackingCodeOrder#getSiteId <em>Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Id</em>' attribute.
	 * @see #getSiteId()
	 * @generated
	 */
	void setSiteId(String value);

	/**
	 * Returns the value of the '<em><b>Tracking Code Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracking Code Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracking Code Id</em>' attribute.
	 * @see #setTrackingCodeId(String)
	 * @see org.abchip.mimo.biz.marketing.tracking.TrackingPackage#getTrackingCodeOrder_TrackingCodeId()
	 * @model annotation="mimo-ent-domain frame='TrackingCode'"
	 * @generated
	 */
	String getTrackingCodeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.tracking.TrackingCodeOrder#getTrackingCodeId <em>Tracking Code Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracking Code Id</em>' attribute.
	 * @see #getTrackingCodeId()
	 * @generated
	 */
	void setTrackingCodeId(String value);

	/**
	 * Returns the value of the '<em><b>Tracking Code Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracking Code Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracking Code Type Id</em>' attribute.
	 * @see #setTrackingCodeTypeId(String)
	 * @see org.abchip.mimo.biz.marketing.tracking.TrackingPackage#getTrackingCodeOrder_TrackingCodeTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='TrackingCodeType'"
	 * @generated
	 */
	String getTrackingCodeTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.tracking.TrackingCodeOrder#getTrackingCodeTypeId <em>Tracking Code Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracking Code Type Id</em>' attribute.
	 * @see #getTrackingCodeTypeId()
	 * @generated
	 */
	void setTrackingCodeTypeId(String value);

} // TrackingCodeOrder
