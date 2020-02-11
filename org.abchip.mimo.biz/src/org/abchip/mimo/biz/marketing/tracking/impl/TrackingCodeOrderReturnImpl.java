/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.tracking.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.marketing.tracking.TrackingCode;
import org.abchip.mimo.biz.marketing.tracking.TrackingCodeOrderReturn;
import org.abchip.mimo.biz.marketing.tracking.TrackingCodeType;
import org.abchip.mimo.biz.marketing.tracking.TrackingPackage;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.order.return_.ReturnHeader;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tracking Code Order Return</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeOrderReturnImpl#getReturnId <em>Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeOrderReturnImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeOrderReturnImpl#getTrackingCodeTypeId <em>Tracking Code Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeOrderReturnImpl#getAffiliateReferredTimeStamp <em>Affiliate Referred Time Stamp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeOrderReturnImpl#isHasExported <em>Has Exported</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeOrderReturnImpl#isIsBillable <em>Is Billable</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeOrderReturnImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeOrderReturnImpl#getSiteId <em>Site Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeOrderReturnImpl#getTrackingCodeId <em>Tracking Code Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrackingCodeOrderReturnImpl extends BizEntityImpl implements TrackingCodeOrderReturn {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackingCodeOrderReturnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getAffiliateReferredTimeStamp() {
		return (Date)eGet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__AFFILIATE_REFERRED_TIME_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAffiliateReferredTimeStamp(Date newAffiliateReferredTimeStamp) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__AFFILIATE_REFERRED_TIME_STAMP, newAffiliateReferredTimeStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasExported() {
		return (Boolean)eGet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__HAS_EXPORTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasExported(boolean newHasExported) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__HAS_EXPORTED, newHasExported);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsBillable() {
		return (Boolean)eGet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__IS_BILLABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsBillable(boolean newIsBillable) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__IS_BILLABLE, newIsBillable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeader getOrderId() {
		return (OrderHeader)eGet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__ORDER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(OrderHeader newOrderId) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__ORDER_ID, newOrderId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return (String)eGet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__ORDER_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__ORDER_ITEM_SEQ_ID, newOrderItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnHeader getReturnId() {
		return (ReturnHeader)eGet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__RETURN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnId(ReturnHeader newReturnId) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__RETURN_ID, newReturnId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSiteId() {
		return (String)eGet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__SITE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSiteId(String newSiteId) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__SITE_ID, newSiteId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackingCode getTrackingCodeId() {
		return (TrackingCode)eGet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__TRACKING_CODE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackingCodeId(TrackingCode newTrackingCodeId) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__TRACKING_CODE_ID, newTrackingCodeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackingCodeType getTrackingCodeTypeId() {
		return (TrackingCodeType)eGet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__TRACKING_CODE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackingCodeTypeId(TrackingCodeType newTrackingCodeTypeId) {
		eSet(TrackingPackage.Literals.TRACKING_CODE_ORDER_RETURN__TRACKING_CODE_TYPE_ID, newTrackingCodeTypeId);
	}

} //TrackingCodeOrderReturnImpl
