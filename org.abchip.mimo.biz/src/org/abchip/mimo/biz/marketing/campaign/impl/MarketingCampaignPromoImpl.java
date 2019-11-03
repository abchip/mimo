/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.campaign.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.marketing.campaign.CampaignPackage;
import org.abchip.mimo.biz.marketing.campaign.MarketingCampaignPromo;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Marketing Campaign Promo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignPromoImpl#getMarketingCampaignId <em>Marketing Campaign Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignPromoImpl#getProductPromoId <em>Product Promo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignPromoImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.campaign.impl.MarketingCampaignPromoImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarketingCampaignPromoImpl extends BizEntityImpl implements MarketingCampaignPromo {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getMarketingCampaignId() <em>Marketing Campaign Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketingCampaignId()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKETING_CAMPAIGN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarketingCampaignId() <em>Marketing Campaign Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketingCampaignId()
	 * @generated
	 * @ordered
	 */
	protected String marketingCampaignId = MARKETING_CAMPAIGN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductPromoId() <em>Product Promo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PROMO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPromoId() <em>Product Promo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoId()
	 * @generated
	 * @ordered
	 */
	protected String productPromoId = PRODUCT_PROMO_ID_EDEFAULT;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarketingCampaignPromoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CampaignPackage.Literals.MARKETING_CAMPAIGN_PROMO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CampaignPackage.MARKETING_CAMPAIGN_PROMO__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMarketingCampaignId() {
		return marketingCampaignId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarketingCampaignId(String newMarketingCampaignId) {
		String oldMarketingCampaignId = marketingCampaignId;
		marketingCampaignId = newMarketingCampaignId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CampaignPackage.MARKETING_CAMPAIGN_PROMO__MARKETING_CAMPAIGN_ID, oldMarketingCampaignId, marketingCampaignId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPromoId() {
		return productPromoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoId(String newProductPromoId) {
		String oldProductPromoId = productPromoId;
		productPromoId = newProductPromoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CampaignPackage.MARKETING_CAMPAIGN_PROMO__PRODUCT_PROMO_ID, oldProductPromoId, productPromoId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CampaignPackage.MARKETING_CAMPAIGN_PROMO__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CampaignPackage.MARKETING_CAMPAIGN_PROMO__MARKETING_CAMPAIGN_ID:
				return getMarketingCampaignId();
			case CampaignPackage.MARKETING_CAMPAIGN_PROMO__PRODUCT_PROMO_ID:
				return getProductPromoId();
			case CampaignPackage.MARKETING_CAMPAIGN_PROMO__FROM_DATE:
				return getFromDate();
			case CampaignPackage.MARKETING_CAMPAIGN_PROMO__THRU_DATE:
				return getThruDate();
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
			case CampaignPackage.MARKETING_CAMPAIGN_PROMO__MARKETING_CAMPAIGN_ID:
				setMarketingCampaignId((String)newValue);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN_PROMO__PRODUCT_PROMO_ID:
				setProductPromoId((String)newValue);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN_PROMO__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN_PROMO__THRU_DATE:
				setThruDate((Date)newValue);
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
			case CampaignPackage.MARKETING_CAMPAIGN_PROMO__MARKETING_CAMPAIGN_ID:
				setMarketingCampaignId(MARKETING_CAMPAIGN_ID_EDEFAULT);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN_PROMO__PRODUCT_PROMO_ID:
				setProductPromoId(PRODUCT_PROMO_ID_EDEFAULT);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN_PROMO__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case CampaignPackage.MARKETING_CAMPAIGN_PROMO__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
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
			case CampaignPackage.MARKETING_CAMPAIGN_PROMO__MARKETING_CAMPAIGN_ID:
				return MARKETING_CAMPAIGN_ID_EDEFAULT == null ? marketingCampaignId != null : !MARKETING_CAMPAIGN_ID_EDEFAULT.equals(marketingCampaignId);
			case CampaignPackage.MARKETING_CAMPAIGN_PROMO__PRODUCT_PROMO_ID:
				return PRODUCT_PROMO_ID_EDEFAULT == null ? productPromoId != null : !PRODUCT_PROMO_ID_EDEFAULT.equals(productPromoId);
			case CampaignPackage.MARKETING_CAMPAIGN_PROMO__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case CampaignPackage.MARKETING_CAMPAIGN_PROMO__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
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
		result.append(" (marketingCampaignId: ");
		result.append(marketingCampaignId);
		result.append(", productPromoId: ");
		result.append(productPromoId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //MarketingCampaignPromoImpl
