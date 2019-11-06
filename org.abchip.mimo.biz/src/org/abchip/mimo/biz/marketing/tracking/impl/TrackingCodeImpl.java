/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.tracking.impl;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.marketing.campaign.MarketingCampaign;
import org.abchip.mimo.biz.marketing.tracking.TrackingCode;
import org.abchip.mimo.biz.marketing.tracking.TrackingCodeType;
import org.abchip.mimo.biz.marketing.tracking.TrackingPackage;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tracking Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeImpl#getTrackingCodeId <em>Tracking Code Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeImpl#getBillableLifetime <em>Billable Lifetime</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeImpl#getOverrideCss <em>Override Css</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeImpl#getOverrideLogo <em>Override Logo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeImpl#getProdCatalogId <em>Prod Catalog Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeImpl#getRedirectUrl <em>Redirect Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeImpl#getSubgroupId <em>Subgroup Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeImpl#getTrackableLifetime <em>Trackable Lifetime</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeImpl#getMarketingCampaignId <em>Marketing Campaign Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.tracking.impl.TrackingCodeImpl#getTrackingCodeTypeId <em>Tracking Code Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrackingCodeImpl extends BizEntityTypedImpl<TrackingCodeType> implements TrackingCode {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getTrackingCodeId() <em>Tracking Code Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackingCodeId()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACKING_CODE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrackingCodeId() <em>Tracking Code Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackingCodeId()
	 * @generated
	 * @ordered
	 */
	protected String trackingCodeId = TRACKING_CODE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBillableLifetime() <em>Billable Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillableLifetime()
	 * @generated
	 * @ordered
	 */
	protected static final long BILLABLE_LIFETIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getBillableLifetime() <em>Billable Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillableLifetime()
	 * @generated
	 * @ordered
	 */
	protected long billableLifetime = BILLABLE_LIFETIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_BY_USER_LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String createdByUserLogin = CREATED_BY_USER_LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected Date createdDate = CREATED_DATE_EDEFAULT;

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
	 * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected String groupId = GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String lastModifiedByUserLogin = LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MODIFIED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastModifiedDate = LAST_MODIFIED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverrideCss() <em>Override Css</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideCss()
	 * @generated
	 * @ordered
	 */
	protected static final String OVERRIDE_CSS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverrideCss() <em>Override Css</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideCss()
	 * @generated
	 * @ordered
	 */
	protected String overrideCss = OVERRIDE_CSS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverrideLogo() <em>Override Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideLogo()
	 * @generated
	 * @ordered
	 */
	protected static final String OVERRIDE_LOGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverrideLogo() <em>Override Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideLogo()
	 * @generated
	 * @ordered
	 */
	protected String overrideLogo = OVERRIDE_LOGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getProdCatalogId() <em>Prod Catalog Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdCatalogId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROD_CATALOG_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProdCatalogId() <em>Prod Catalog Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdCatalogId()
	 * @generated
	 * @ordered
	 */
	protected String prodCatalogId = PROD_CATALOG_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedirectUrl() <em>Redirect Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedirectUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String REDIRECT_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedirectUrl() <em>Redirect Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedirectUrl()
	 * @generated
	 * @ordered
	 */
	protected String redirectUrl = REDIRECT_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubgroupId() <em>Subgroup Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubgroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBGROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubgroupId() <em>Subgroup Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubgroupId()
	 * @generated
	 * @ordered
	 */
	protected String subgroupId = SUBGROUP_ID_EDEFAULT;

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
	 * The default value of the '{@link #getTrackableLifetime() <em>Trackable Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackableLifetime()
	 * @generated
	 * @ordered
	 */
	protected static final long TRACKABLE_LIFETIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTrackableLifetime() <em>Trackable Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackableLifetime()
	 * @generated
	 * @ordered
	 */
	protected long trackableLifetime = TRACKABLE_LIFETIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMarketingCampaignId() <em>Marketing Campaign Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketingCampaignId()
	 * @generated
	 * @ordered
	 */
	protected MarketingCampaign marketingCampaignId;

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
	protected TrackingCodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackingPackage.Literals.TRACKING_CODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getBillableLifetime() {
		return billableLifetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillableLifetime(long newBillableLifetime) {
		billableLifetime = newBillableLifetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		comments = newComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreatedByUserLogin() {
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(String newCreatedByUserLogin) {
		createdByUserLogin = newCreatedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		createdDate = newCreatedDate;
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
		description = newDescription;
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
		fromDate = newFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupId() {
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupId(String newGroupId) {
		groupId = newGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedByUserLogin() {
		return lastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(String newLastModifiedByUserLogin) {
		lastModifiedByUserLogin = newLastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		lastModifiedDate = newLastModifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarketingCampaign getMarketingCampaignId() {
		if (marketingCampaignId != null && ((EObject)marketingCampaignId).eIsProxy()) {
			InternalEObject oldMarketingCampaignId = (InternalEObject)marketingCampaignId;
			marketingCampaignId = (MarketingCampaign)eResolveProxy(oldMarketingCampaignId);
			if (marketingCampaignId != oldMarketingCampaignId) {
			}
		}
		return marketingCampaignId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketingCampaign basicGetMarketingCampaignId() {
		return marketingCampaignId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarketingCampaignId(MarketingCampaign newMarketingCampaignId) {
		marketingCampaignId = newMarketingCampaignId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOverrideCss() {
		return overrideCss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverrideCss(String newOverrideCss) {
		overrideCss = newOverrideCss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOverrideLogo() {
		return overrideLogo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverrideLogo(String newOverrideLogo) {
		overrideLogo = newOverrideLogo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProdCatalogId() {
		return prodCatalogId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProdCatalogId(String newProdCatalogId) {
		prodCatalogId = newProdCatalogId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRedirectUrl() {
		return redirectUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRedirectUrl(String newRedirectUrl) {
		redirectUrl = newRedirectUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubgroupId() {
		return subgroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubgroupId(String newSubgroupId) {
		subgroupId = newSubgroupId;
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
		thruDate = newThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTrackableLifetime() {
		return trackableLifetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackableLifetime(long newTrackableLifetime) {
		trackableLifetime = newTrackableLifetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrackingCodeId() {
		return trackingCodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrackingCodeId(String newTrackingCodeId) {
		trackingCodeId = newTrackingCodeId;
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
		trackingCodeTypeId = newTrackingCodeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> trackingCodeOrders() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrackingPackage.TRACKING_CODE__TRACKING_CODE_ID:
				return getTrackingCodeId();
			case TrackingPackage.TRACKING_CODE__BILLABLE_LIFETIME:
				return getBillableLifetime();
			case TrackingPackage.TRACKING_CODE__COMMENTS:
				return getComments();
			case TrackingPackage.TRACKING_CODE__CREATED_BY_USER_LOGIN:
				return getCreatedByUserLogin();
			case TrackingPackage.TRACKING_CODE__CREATED_DATE:
				return getCreatedDate();
			case TrackingPackage.TRACKING_CODE__DESCRIPTION:
				return getDescription();
			case TrackingPackage.TRACKING_CODE__FROM_DATE:
				return getFromDate();
			case TrackingPackage.TRACKING_CODE__GROUP_ID:
				return getGroupId();
			case TrackingPackage.TRACKING_CODE__LAST_MODIFIED_BY_USER_LOGIN:
				return getLastModifiedByUserLogin();
			case TrackingPackage.TRACKING_CODE__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case TrackingPackage.TRACKING_CODE__OVERRIDE_CSS:
				return getOverrideCss();
			case TrackingPackage.TRACKING_CODE__OVERRIDE_LOGO:
				return getOverrideLogo();
			case TrackingPackage.TRACKING_CODE__PROD_CATALOG_ID:
				return getProdCatalogId();
			case TrackingPackage.TRACKING_CODE__REDIRECT_URL:
				return getRedirectUrl();
			case TrackingPackage.TRACKING_CODE__SUBGROUP_ID:
				return getSubgroupId();
			case TrackingPackage.TRACKING_CODE__THRU_DATE:
				return getThruDate();
			case TrackingPackage.TRACKING_CODE__TRACKABLE_LIFETIME:
				return getTrackableLifetime();
			case TrackingPackage.TRACKING_CODE__MARKETING_CAMPAIGN_ID:
				if (resolve) return getMarketingCampaignId();
				return basicGetMarketingCampaignId();
			case TrackingPackage.TRACKING_CODE__TRACKING_CODE_TYPE_ID:
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
			case TrackingPackage.TRACKING_CODE__TRACKING_CODE_ID:
				setTrackingCodeId((String)newValue);
				return;
			case TrackingPackage.TRACKING_CODE__BILLABLE_LIFETIME:
				setBillableLifetime((Long)newValue);
				return;
			case TrackingPackage.TRACKING_CODE__COMMENTS:
				setComments((String)newValue);
				return;
			case TrackingPackage.TRACKING_CODE__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((String)newValue);
				return;
			case TrackingPackage.TRACKING_CODE__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case TrackingPackage.TRACKING_CODE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TrackingPackage.TRACKING_CODE__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case TrackingPackage.TRACKING_CODE__GROUP_ID:
				setGroupId((String)newValue);
				return;
			case TrackingPackage.TRACKING_CODE__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((String)newValue);
				return;
			case TrackingPackage.TRACKING_CODE__LAST_MODIFIED_DATE:
				setLastModifiedDate((Date)newValue);
				return;
			case TrackingPackage.TRACKING_CODE__OVERRIDE_CSS:
				setOverrideCss((String)newValue);
				return;
			case TrackingPackage.TRACKING_CODE__OVERRIDE_LOGO:
				setOverrideLogo((String)newValue);
				return;
			case TrackingPackage.TRACKING_CODE__PROD_CATALOG_ID:
				setProdCatalogId((String)newValue);
				return;
			case TrackingPackage.TRACKING_CODE__REDIRECT_URL:
				setRedirectUrl((String)newValue);
				return;
			case TrackingPackage.TRACKING_CODE__SUBGROUP_ID:
				setSubgroupId((String)newValue);
				return;
			case TrackingPackage.TRACKING_CODE__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case TrackingPackage.TRACKING_CODE__TRACKABLE_LIFETIME:
				setTrackableLifetime((Long)newValue);
				return;
			case TrackingPackage.TRACKING_CODE__MARKETING_CAMPAIGN_ID:
				setMarketingCampaignId((MarketingCampaign)newValue);
				return;
			case TrackingPackage.TRACKING_CODE__TRACKING_CODE_TYPE_ID:
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
			case TrackingPackage.TRACKING_CODE__TRACKING_CODE_ID:
				setTrackingCodeId(TRACKING_CODE_ID_EDEFAULT);
				return;
			case TrackingPackage.TRACKING_CODE__BILLABLE_LIFETIME:
				setBillableLifetime(BILLABLE_LIFETIME_EDEFAULT);
				return;
			case TrackingPackage.TRACKING_CODE__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case TrackingPackage.TRACKING_CODE__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin(CREATED_BY_USER_LOGIN_EDEFAULT);
				return;
			case TrackingPackage.TRACKING_CODE__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case TrackingPackage.TRACKING_CODE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TrackingPackage.TRACKING_CODE__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case TrackingPackage.TRACKING_CODE__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case TrackingPackage.TRACKING_CODE__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin(LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT);
				return;
			case TrackingPackage.TRACKING_CODE__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
				return;
			case TrackingPackage.TRACKING_CODE__OVERRIDE_CSS:
				setOverrideCss(OVERRIDE_CSS_EDEFAULT);
				return;
			case TrackingPackage.TRACKING_CODE__OVERRIDE_LOGO:
				setOverrideLogo(OVERRIDE_LOGO_EDEFAULT);
				return;
			case TrackingPackage.TRACKING_CODE__PROD_CATALOG_ID:
				setProdCatalogId(PROD_CATALOG_ID_EDEFAULT);
				return;
			case TrackingPackage.TRACKING_CODE__REDIRECT_URL:
				setRedirectUrl(REDIRECT_URL_EDEFAULT);
				return;
			case TrackingPackage.TRACKING_CODE__SUBGROUP_ID:
				setSubgroupId(SUBGROUP_ID_EDEFAULT);
				return;
			case TrackingPackage.TRACKING_CODE__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case TrackingPackage.TRACKING_CODE__TRACKABLE_LIFETIME:
				setTrackableLifetime(TRACKABLE_LIFETIME_EDEFAULT);
				return;
			case TrackingPackage.TRACKING_CODE__MARKETING_CAMPAIGN_ID:
				setMarketingCampaignId((MarketingCampaign)null);
				return;
			case TrackingPackage.TRACKING_CODE__TRACKING_CODE_TYPE_ID:
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
			case TrackingPackage.TRACKING_CODE__TRACKING_CODE_ID:
				return TRACKING_CODE_ID_EDEFAULT == null ? trackingCodeId != null : !TRACKING_CODE_ID_EDEFAULT.equals(trackingCodeId);
			case TrackingPackage.TRACKING_CODE__BILLABLE_LIFETIME:
				return billableLifetime != BILLABLE_LIFETIME_EDEFAULT;
			case TrackingPackage.TRACKING_CODE__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case TrackingPackage.TRACKING_CODE__CREATED_BY_USER_LOGIN:
				return CREATED_BY_USER_LOGIN_EDEFAULT == null ? createdByUserLogin != null : !CREATED_BY_USER_LOGIN_EDEFAULT.equals(createdByUserLogin);
			case TrackingPackage.TRACKING_CODE__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case TrackingPackage.TRACKING_CODE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TrackingPackage.TRACKING_CODE__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case TrackingPackage.TRACKING_CODE__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
			case TrackingPackage.TRACKING_CODE__LAST_MODIFIED_BY_USER_LOGIN:
				return LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT == null ? lastModifiedByUserLogin != null : !LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT.equals(lastModifiedByUserLogin);
			case TrackingPackage.TRACKING_CODE__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case TrackingPackage.TRACKING_CODE__OVERRIDE_CSS:
				return OVERRIDE_CSS_EDEFAULT == null ? overrideCss != null : !OVERRIDE_CSS_EDEFAULT.equals(overrideCss);
			case TrackingPackage.TRACKING_CODE__OVERRIDE_LOGO:
				return OVERRIDE_LOGO_EDEFAULT == null ? overrideLogo != null : !OVERRIDE_LOGO_EDEFAULT.equals(overrideLogo);
			case TrackingPackage.TRACKING_CODE__PROD_CATALOG_ID:
				return PROD_CATALOG_ID_EDEFAULT == null ? prodCatalogId != null : !PROD_CATALOG_ID_EDEFAULT.equals(prodCatalogId);
			case TrackingPackage.TRACKING_CODE__REDIRECT_URL:
				return REDIRECT_URL_EDEFAULT == null ? redirectUrl != null : !REDIRECT_URL_EDEFAULT.equals(redirectUrl);
			case TrackingPackage.TRACKING_CODE__SUBGROUP_ID:
				return SUBGROUP_ID_EDEFAULT == null ? subgroupId != null : !SUBGROUP_ID_EDEFAULT.equals(subgroupId);
			case TrackingPackage.TRACKING_CODE__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case TrackingPackage.TRACKING_CODE__TRACKABLE_LIFETIME:
				return trackableLifetime != TRACKABLE_LIFETIME_EDEFAULT;
			case TrackingPackage.TRACKING_CODE__MARKETING_CAMPAIGN_ID:
				return marketingCampaignId != null;
			case TrackingPackage.TRACKING_CODE__TRACKING_CODE_TYPE_ID:
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
		result.append(" (trackingCodeId: ");
		result.append(trackingCodeId);
		result.append(", billableLifetime: ");
		result.append(billableLifetime);
		result.append(", comments: ");
		result.append(comments);
		result.append(", createdByUserLogin: ");
		result.append(createdByUserLogin);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(", description: ");
		result.append(description);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", groupId: ");
		result.append(groupId);
		result.append(", lastModifiedByUserLogin: ");
		result.append(lastModifiedByUserLogin);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", overrideCss: ");
		result.append(overrideCss);
		result.append(", overrideLogo: ");
		result.append(overrideLogo);
		result.append(", prodCatalogId: ");
		result.append(prodCatalogId);
		result.append(", redirectUrl: ");
		result.append(redirectUrl);
		result.append(", subgroupId: ");
		result.append(subgroupId);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(", trackableLifetime: ");
		result.append(trackableLifetime);
		result.append(')');
		return result.toString();
	}

} //TrackingCodeImpl
