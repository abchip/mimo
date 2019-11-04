/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.tracking.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.marketing.tracking.TrackingCode;
import org.abchip.mimo.biz.marketing.tracking.TrackingCodeOrder;
import org.abchip.mimo.biz.marketing.tracking.TrackingCodeType;
import org.abchip.mimo.biz.marketing.tracking.TrackingPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tracking Code Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeOrderImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeOrderImpl#getAffiliateReferredTimeStamp <em>Affiliate Referred Time Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeOrderImpl#isHasExported <em>Has Exported</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeOrderImpl#isIsBillable <em>Is Billable</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeOrderImpl#getSiteId <em>Site Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeOrderImpl#getTrackingCodeId <em>Tracking Code Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeOrderImpl#getTrackingCodeTypeId <em>Tracking Code Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrackingCodeOrderImpl extends BizEntityImpl implements TrackingCodeOrder {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The default value of the '{@link #getAffiliateReferredTimeStamp() <em>Affiliate Referred Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffiliateReferredTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date AFFILIATE_REFERRED_TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAffiliateReferredTimeStamp() <em>Affiliate Referred Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffiliateReferredTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected Date affiliateReferredTimeStamp = AFFILIATE_REFERRED_TIME_STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasExported() <em>Has Exported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasExported()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_EXPORTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasExported() <em>Has Exported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasExported()
	 * @generated
	 * @ordered
	 */
	protected boolean hasExported = HAS_EXPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsBillable() <em>Is Billable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBillable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BILLABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBillable() <em>Is Billable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBillable()
	 * @generated
	 * @ordered
	 */
	protected boolean isBillable = IS_BILLABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSiteId() <em>Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteId()
	 * @generated
	 * @ordered
	 */
	protected static final String SITE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSiteId() <em>Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteId()
	 * @generated
	 * @ordered
	 */
	protected String siteId = SITE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTrackingCodeId() <em>Tracking Code Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackingCodeId()
	 * @generated
	 * @ordered
	 */
	protected TrackingCode trackingCodeId;

	/**
	 * The cached value of the '{@link #getTrackingCodeTypeId() <em>Tracking Code Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackingCodeTypeId()
	 * @generated
	 * @ordered
	 */
	protected TrackingCodeType trackingCodeTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackingCodeOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackingPackage.Literals.TRACKING_CODE_ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getAffiliateReferredTimeStamp() {
		return affiliateReferredTimeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAffiliateReferredTimeStamp(Date newAffiliateReferredTimeStamp) {
		Date oldAffiliateReferredTimeStamp = affiliateReferredTimeStamp;
		affiliateReferredTimeStamp = newAffiliateReferredTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrackingPackage.TRACKING_CODE_ORDER__AFFILIATE_REFERRED_TIME_STAMP, oldAffiliateReferredTimeStamp, affiliateReferredTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasExported() {
		return hasExported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasExported(boolean newHasExported) {
		boolean oldHasExported = hasExported;
		hasExported = newHasExported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrackingPackage.TRACKING_CODE_ORDER__HAS_EXPORTED, oldHasExported, hasExported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsBillable() {
		return isBillable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsBillable(boolean newIsBillable) {
		boolean oldIsBillable = isBillable;
		isBillable = newIsBillable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrackingPackage.TRACKING_CODE_ORDER__IS_BILLABLE, oldIsBillable, isBillable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrackingPackage.TRACKING_CODE_ORDER__ORDER_ID, oldOrderId, orderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSiteId() {
		return siteId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSiteId(String newSiteId) {
		String oldSiteId = siteId;
		siteId = newSiteId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrackingPackage.TRACKING_CODE_ORDER__SITE_ID, oldSiteId, siteId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackingCode getTrackingCodeId() {
		if (trackingCodeId != null && ((EObject)trackingCodeId).eIsProxy()) {
			InternalEObject oldTrackingCodeId = (InternalEObject)trackingCodeId;
			trackingCodeId = (TrackingCode)eResolveProxy(oldTrackingCodeId);
			if (trackingCodeId != oldTrackingCodeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TrackingPackage.TRACKING_CODE_ORDER__TRACKING_CODE_ID, oldTrackingCodeId, trackingCodeId));
			}
		}
		return trackingCodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackingCode basicGetTrackingCodeId() {
		return trackingCodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackingCodeId(TrackingCode newTrackingCodeId) {
		TrackingCode oldTrackingCodeId = trackingCodeId;
		trackingCodeId = newTrackingCodeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrackingPackage.TRACKING_CODE_ORDER__TRACKING_CODE_ID, oldTrackingCodeId, trackingCodeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackingCodeType getTrackingCodeTypeId() {
		if (trackingCodeTypeId != null && ((EObject)trackingCodeTypeId).eIsProxy()) {
			InternalEObject oldTrackingCodeTypeId = (InternalEObject)trackingCodeTypeId;
			trackingCodeTypeId = (TrackingCodeType)eResolveProxy(oldTrackingCodeTypeId);
			if (trackingCodeTypeId != oldTrackingCodeTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TrackingPackage.TRACKING_CODE_ORDER__TRACKING_CODE_TYPE_ID, oldTrackingCodeTypeId, trackingCodeTypeId));
			}
		}
		return trackingCodeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackingCodeType basicGetTrackingCodeTypeId() {
		return trackingCodeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackingCodeTypeId(TrackingCodeType newTrackingCodeTypeId) {
		TrackingCodeType oldTrackingCodeTypeId = trackingCodeTypeId;
		trackingCodeTypeId = newTrackingCodeTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrackingPackage.TRACKING_CODE_ORDER__TRACKING_CODE_TYPE_ID, oldTrackingCodeTypeId, trackingCodeTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrackingPackage.TRACKING_CODE_ORDER__ORDER_ID:
				return getOrderId();
			case TrackingPackage.TRACKING_CODE_ORDER__AFFILIATE_REFERRED_TIME_STAMP:
				return getAffiliateReferredTimeStamp();
			case TrackingPackage.TRACKING_CODE_ORDER__HAS_EXPORTED:
				return isHasExported();
			case TrackingPackage.TRACKING_CODE_ORDER__IS_BILLABLE:
				return isIsBillable();
			case TrackingPackage.TRACKING_CODE_ORDER__SITE_ID:
				return getSiteId();
			case TrackingPackage.TRACKING_CODE_ORDER__TRACKING_CODE_ID:
				if (resolve) return getTrackingCodeId();
				return basicGetTrackingCodeId();
			case TrackingPackage.TRACKING_CODE_ORDER__TRACKING_CODE_TYPE_ID:
				if (resolve) return getTrackingCodeTypeId();
				return basicGetTrackingCodeTypeId();
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
			case TrackingPackage.TRACKING_CODE_ORDER__ORDER_ID:
				setOrderId((String)newValue);
				return;
			case TrackingPackage.TRACKING_CODE_ORDER__AFFILIATE_REFERRED_TIME_STAMP:
				setAffiliateReferredTimeStamp((Date)newValue);
				return;
			case TrackingPackage.TRACKING_CODE_ORDER__HAS_EXPORTED:
				setHasExported((Boolean)newValue);
				return;
			case TrackingPackage.TRACKING_CODE_ORDER__IS_BILLABLE:
				setIsBillable((Boolean)newValue);
				return;
			case TrackingPackage.TRACKING_CODE_ORDER__SITE_ID:
				setSiteId((String)newValue);
				return;
			case TrackingPackage.TRACKING_CODE_ORDER__TRACKING_CODE_ID:
				setTrackingCodeId((TrackingCode)newValue);
				return;
			case TrackingPackage.TRACKING_CODE_ORDER__TRACKING_CODE_TYPE_ID:
				setTrackingCodeTypeId((TrackingCodeType)newValue);
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
			case TrackingPackage.TRACKING_CODE_ORDER__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case TrackingPackage.TRACKING_CODE_ORDER__AFFILIATE_REFERRED_TIME_STAMP:
				setAffiliateReferredTimeStamp(AFFILIATE_REFERRED_TIME_STAMP_EDEFAULT);
				return;
			case TrackingPackage.TRACKING_CODE_ORDER__HAS_EXPORTED:
				setHasExported(HAS_EXPORTED_EDEFAULT);
				return;
			case TrackingPackage.TRACKING_CODE_ORDER__IS_BILLABLE:
				setIsBillable(IS_BILLABLE_EDEFAULT);
				return;
			case TrackingPackage.TRACKING_CODE_ORDER__SITE_ID:
				setSiteId(SITE_ID_EDEFAULT);
				return;
			case TrackingPackage.TRACKING_CODE_ORDER__TRACKING_CODE_ID:
				setTrackingCodeId((TrackingCode)null);
				return;
			case TrackingPackage.TRACKING_CODE_ORDER__TRACKING_CODE_TYPE_ID:
				setTrackingCodeTypeId((TrackingCodeType)null);
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
			case TrackingPackage.TRACKING_CODE_ORDER__ORDER_ID:
				return ORDER_ID_EDEFAULT == null ? orderId != null : !ORDER_ID_EDEFAULT.equals(orderId);
			case TrackingPackage.TRACKING_CODE_ORDER__AFFILIATE_REFERRED_TIME_STAMP:
				return AFFILIATE_REFERRED_TIME_STAMP_EDEFAULT == null ? affiliateReferredTimeStamp != null : !AFFILIATE_REFERRED_TIME_STAMP_EDEFAULT.equals(affiliateReferredTimeStamp);
			case TrackingPackage.TRACKING_CODE_ORDER__HAS_EXPORTED:
				return hasExported != HAS_EXPORTED_EDEFAULT;
			case TrackingPackage.TRACKING_CODE_ORDER__IS_BILLABLE:
				return isBillable != IS_BILLABLE_EDEFAULT;
			case TrackingPackage.TRACKING_CODE_ORDER__SITE_ID:
				return SITE_ID_EDEFAULT == null ? siteId != null : !SITE_ID_EDEFAULT.equals(siteId);
			case TrackingPackage.TRACKING_CODE_ORDER__TRACKING_CODE_ID:
				return trackingCodeId != null;
			case TrackingPackage.TRACKING_CODE_ORDER__TRACKING_CODE_TYPE_ID:
				return trackingCodeTypeId != null;
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
		result.append(" (orderId: ");
		result.append(orderId);
		result.append(", affiliateReferredTimeStamp: ");
		result.append(affiliateReferredTimeStamp);
		result.append(", hasExported: ");
		result.append(hasExported);
		result.append(", isBillable: ");
		result.append(isBillable);
		result.append(", siteId: ");
		result.append(siteId);
		result.append(')');
		return result.toString();
	}

} //TrackingCodeOrderImpl
