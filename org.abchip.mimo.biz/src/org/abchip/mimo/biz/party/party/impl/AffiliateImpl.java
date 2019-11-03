/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Affiliate;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Affiliate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.AffiliateImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.AffiliateImpl#getAffiliateDescription <em>Affiliate Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.AffiliateImpl#getAffiliateName <em>Affiliate Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.AffiliateImpl#getDateTimeApproved <em>Date Time Approved</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.AffiliateImpl#getDateTimeCreated <em>Date Time Created</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.AffiliateImpl#getSitePageViews <em>Site Page Views</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.AffiliateImpl#getSiteType <em>Site Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.AffiliateImpl#getSiteVisitors <em>Site Visitors</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.AffiliateImpl#getYearEstablished <em>Year Established</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AffiliateImpl extends BizEntityImpl implements Affiliate {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected String partyId = PARTY_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getAffiliateDescription() <em>Affiliate Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffiliateDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String AFFILIATE_DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAffiliateDescription() <em>Affiliate Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffiliateDescription()
	 * @generated
	 * @ordered
	 */
	protected String affiliateDescription = AFFILIATE_DESCRIPTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getAffiliateName() <em>Affiliate Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffiliateName()
	 * @generated
	 * @ordered
	 */
	protected static final String AFFILIATE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAffiliateName() <em>Affiliate Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffiliateName()
	 * @generated
	 * @ordered
	 */
	protected String affiliateName = AFFILIATE_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getDateTimeApproved() <em>Date Time Approved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeApproved()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_TIME_APPROVED_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDateTimeApproved() <em>Date Time Approved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeApproved()
	 * @generated
	 * @ordered
	 */
	protected Date dateTimeApproved = DATE_TIME_APPROVED_EDEFAULT;
	/**
	 * The default value of the '{@link #getDateTimeCreated() <em>Date Time Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_TIME_CREATED_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDateTimeCreated() <em>Date Time Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeCreated()
	 * @generated
	 * @ordered
	 */
	protected Date dateTimeCreated = DATE_TIME_CREATED_EDEFAULT;
	/**
	 * The default value of the '{@link #getSitePageViews() <em>Site Page Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSitePageViews()
	 * @generated
	 * @ordered
	 */
	protected static final String SITE_PAGE_VIEWS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSitePageViews() <em>Site Page Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSitePageViews()
	 * @generated
	 * @ordered
	 */
	protected String sitePageViews = SITE_PAGE_VIEWS_EDEFAULT;
	/**
	 * The default value of the '{@link #getSiteType() <em>Site Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteType()
	 * @generated
	 * @ordered
	 */
	protected static final String SITE_TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSiteType() <em>Site Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteType()
	 * @generated
	 * @ordered
	 */
	protected String siteType = SITE_TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getSiteVisitors() <em>Site Visitors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteVisitors()
	 * @generated
	 * @ordered
	 */
	protected static final String SITE_VISITORS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSiteVisitors() <em>Site Visitors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteVisitors()
	 * @generated
	 * @ordered
	 */
	protected String siteVisitors = SITE_VISITORS_EDEFAULT;
	/**
	 * The default value of the '{@link #getYearEstablished() <em>Year Established</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearEstablished()
	 * @generated
	 * @ordered
	 */
	protected static final String YEAR_ESTABLISHED_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getYearEstablished() <em>Year Established</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearEstablished()
	 * @generated
	 * @ordered
	 */
	protected String yearEstablished = YEAR_ESTABLISHED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AffiliateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.AFFILIATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAffiliateDescription() {
		return affiliateDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAffiliateDescription(String newAffiliateDescription) {
		String oldAffiliateDescription = affiliateDescription;
		affiliateDescription = newAffiliateDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.AFFILIATE__AFFILIATE_DESCRIPTION, oldAffiliateDescription, affiliateDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAffiliateName() {
		return affiliateName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAffiliateName(String newAffiliateName) {
		String oldAffiliateName = affiliateName;
		affiliateName = newAffiliateName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.AFFILIATE__AFFILIATE_NAME, oldAffiliateName, affiliateName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateTimeApproved() {
		return dateTimeApproved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateTimeApproved(Date newDateTimeApproved) {
		Date oldDateTimeApproved = dateTimeApproved;
		dateTimeApproved = newDateTimeApproved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.AFFILIATE__DATE_TIME_APPROVED, oldDateTimeApproved, dateTimeApproved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateTimeCreated() {
		return dateTimeCreated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateTimeCreated(Date newDateTimeCreated) {
		Date oldDateTimeCreated = dateTimeCreated;
		dateTimeCreated = newDateTimeCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.AFFILIATE__DATE_TIME_CREATED, oldDateTimeCreated, dateTimeCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		String oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.AFFILIATE__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSitePageViews() {
		return sitePageViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSitePageViews(String newSitePageViews) {
		String oldSitePageViews = sitePageViews;
		sitePageViews = newSitePageViews;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.AFFILIATE__SITE_PAGE_VIEWS, oldSitePageViews, sitePageViews));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSiteType() {
		return siteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSiteType(String newSiteType) {
		String oldSiteType = siteType;
		siteType = newSiteType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.AFFILIATE__SITE_TYPE, oldSiteType, siteType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSiteVisitors() {
		return siteVisitors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSiteVisitors(String newSiteVisitors) {
		String oldSiteVisitors = siteVisitors;
		siteVisitors = newSiteVisitors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.AFFILIATE__SITE_VISITORS, oldSiteVisitors, siteVisitors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getYearEstablished() {
		return yearEstablished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYearEstablished(String newYearEstablished) {
		String oldYearEstablished = yearEstablished;
		yearEstablished = newYearEstablished;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.AFFILIATE__YEAR_ESTABLISHED, oldYearEstablished, yearEstablished));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartyPackage.AFFILIATE__PARTY_ID:
				return getPartyId();
			case PartyPackage.AFFILIATE__AFFILIATE_DESCRIPTION:
				return getAffiliateDescription();
			case PartyPackage.AFFILIATE__AFFILIATE_NAME:
				return getAffiliateName();
			case PartyPackage.AFFILIATE__DATE_TIME_APPROVED:
				return getDateTimeApproved();
			case PartyPackage.AFFILIATE__DATE_TIME_CREATED:
				return getDateTimeCreated();
			case PartyPackage.AFFILIATE__SITE_PAGE_VIEWS:
				return getSitePageViews();
			case PartyPackage.AFFILIATE__SITE_TYPE:
				return getSiteType();
			case PartyPackage.AFFILIATE__SITE_VISITORS:
				return getSiteVisitors();
			case PartyPackage.AFFILIATE__YEAR_ESTABLISHED:
				return getYearEstablished();
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
			case PartyPackage.AFFILIATE__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case PartyPackage.AFFILIATE__AFFILIATE_DESCRIPTION:
				setAffiliateDescription((String)newValue);
				return;
			case PartyPackage.AFFILIATE__AFFILIATE_NAME:
				setAffiliateName((String)newValue);
				return;
			case PartyPackage.AFFILIATE__DATE_TIME_APPROVED:
				setDateTimeApproved((Date)newValue);
				return;
			case PartyPackage.AFFILIATE__DATE_TIME_CREATED:
				setDateTimeCreated((Date)newValue);
				return;
			case PartyPackage.AFFILIATE__SITE_PAGE_VIEWS:
				setSitePageViews((String)newValue);
				return;
			case PartyPackage.AFFILIATE__SITE_TYPE:
				setSiteType((String)newValue);
				return;
			case PartyPackage.AFFILIATE__SITE_VISITORS:
				setSiteVisitors((String)newValue);
				return;
			case PartyPackage.AFFILIATE__YEAR_ESTABLISHED:
				setYearEstablished((String)newValue);
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
			case PartyPackage.AFFILIATE__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case PartyPackage.AFFILIATE__AFFILIATE_DESCRIPTION:
				setAffiliateDescription(AFFILIATE_DESCRIPTION_EDEFAULT);
				return;
			case PartyPackage.AFFILIATE__AFFILIATE_NAME:
				setAffiliateName(AFFILIATE_NAME_EDEFAULT);
				return;
			case PartyPackage.AFFILIATE__DATE_TIME_APPROVED:
				setDateTimeApproved(DATE_TIME_APPROVED_EDEFAULT);
				return;
			case PartyPackage.AFFILIATE__DATE_TIME_CREATED:
				setDateTimeCreated(DATE_TIME_CREATED_EDEFAULT);
				return;
			case PartyPackage.AFFILIATE__SITE_PAGE_VIEWS:
				setSitePageViews(SITE_PAGE_VIEWS_EDEFAULT);
				return;
			case PartyPackage.AFFILIATE__SITE_TYPE:
				setSiteType(SITE_TYPE_EDEFAULT);
				return;
			case PartyPackage.AFFILIATE__SITE_VISITORS:
				setSiteVisitors(SITE_VISITORS_EDEFAULT);
				return;
			case PartyPackage.AFFILIATE__YEAR_ESTABLISHED:
				setYearEstablished(YEAR_ESTABLISHED_EDEFAULT);
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
			case PartyPackage.AFFILIATE__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case PartyPackage.AFFILIATE__AFFILIATE_DESCRIPTION:
				return AFFILIATE_DESCRIPTION_EDEFAULT == null ? affiliateDescription != null : !AFFILIATE_DESCRIPTION_EDEFAULT.equals(affiliateDescription);
			case PartyPackage.AFFILIATE__AFFILIATE_NAME:
				return AFFILIATE_NAME_EDEFAULT == null ? affiliateName != null : !AFFILIATE_NAME_EDEFAULT.equals(affiliateName);
			case PartyPackage.AFFILIATE__DATE_TIME_APPROVED:
				return DATE_TIME_APPROVED_EDEFAULT == null ? dateTimeApproved != null : !DATE_TIME_APPROVED_EDEFAULT.equals(dateTimeApproved);
			case PartyPackage.AFFILIATE__DATE_TIME_CREATED:
				return DATE_TIME_CREATED_EDEFAULT == null ? dateTimeCreated != null : !DATE_TIME_CREATED_EDEFAULT.equals(dateTimeCreated);
			case PartyPackage.AFFILIATE__SITE_PAGE_VIEWS:
				return SITE_PAGE_VIEWS_EDEFAULT == null ? sitePageViews != null : !SITE_PAGE_VIEWS_EDEFAULT.equals(sitePageViews);
			case PartyPackage.AFFILIATE__SITE_TYPE:
				return SITE_TYPE_EDEFAULT == null ? siteType != null : !SITE_TYPE_EDEFAULT.equals(siteType);
			case PartyPackage.AFFILIATE__SITE_VISITORS:
				return SITE_VISITORS_EDEFAULT == null ? siteVisitors != null : !SITE_VISITORS_EDEFAULT.equals(siteVisitors);
			case PartyPackage.AFFILIATE__YEAR_ESTABLISHED:
				return YEAR_ESTABLISHED_EDEFAULT == null ? yearEstablished != null : !YEAR_ESTABLISHED_EDEFAULT.equals(yearEstablished);
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
		result.append(" (partyId: ");
		result.append(partyId);
		result.append(", affiliateDescription: ");
		result.append(affiliateDescription);
		result.append(", affiliateName: ");
		result.append(affiliateName);
		result.append(", dateTimeApproved: ");
		result.append(dateTimeApproved);
		result.append(", dateTimeCreated: ");
		result.append(dateTimeCreated);
		result.append(", sitePageViews: ");
		result.append(sitePageViews);
		result.append(", siteType: ");
		result.append(siteType);
		result.append(", siteVisitors: ");
		result.append(siteVisitors);
		result.append(", yearEstablished: ");
		result.append(yearEstablished);
		result.append(')');
		return result.toString();
	}

} //AffiliateImpl
