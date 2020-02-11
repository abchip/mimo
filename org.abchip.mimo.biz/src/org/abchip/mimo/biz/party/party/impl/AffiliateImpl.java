/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.eclipse.emf.ecore.EClass;

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
		return (String)eGet(PartyPackage.Literals.AFFILIATE__AFFILIATE_DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAffiliateDescription(String newAffiliateDescription) {
		eSet(PartyPackage.Literals.AFFILIATE__AFFILIATE_DESCRIPTION, newAffiliateDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAffiliateName() {
		return (String)eGet(PartyPackage.Literals.AFFILIATE__AFFILIATE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAffiliateName(String newAffiliateName) {
		eSet(PartyPackage.Literals.AFFILIATE__AFFILIATE_NAME, newAffiliateName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateTimeApproved() {
		return (Date)eGet(PartyPackage.Literals.AFFILIATE__DATE_TIME_APPROVED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateTimeApproved(Date newDateTimeApproved) {
		eSet(PartyPackage.Literals.AFFILIATE__DATE_TIME_APPROVED, newDateTimeApproved);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateTimeCreated() {
		return (Date)eGet(PartyPackage.Literals.AFFILIATE__DATE_TIME_CREATED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateTimeCreated(Date newDateTimeCreated) {
		eSet(PartyPackage.Literals.AFFILIATE__DATE_TIME_CREATED, newDateTimeCreated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return (String)eGet(PartyPackage.Literals.AFFILIATE__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		eSet(PartyPackage.Literals.AFFILIATE__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSitePageViews() {
		return (String)eGet(PartyPackage.Literals.AFFILIATE__SITE_PAGE_VIEWS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSitePageViews(String newSitePageViews) {
		eSet(PartyPackage.Literals.AFFILIATE__SITE_PAGE_VIEWS, newSitePageViews);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSiteType() {
		return (String)eGet(PartyPackage.Literals.AFFILIATE__SITE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSiteType(String newSiteType) {
		eSet(PartyPackage.Literals.AFFILIATE__SITE_TYPE, newSiteType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSiteVisitors() {
		return (String)eGet(PartyPackage.Literals.AFFILIATE__SITE_VISITORS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSiteVisitors(String newSiteVisitors) {
		eSet(PartyPackage.Literals.AFFILIATE__SITE_VISITORS, newSiteVisitors);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getYearEstablished() {
		return (String)eGet(PartyPackage.Literals.AFFILIATE__YEAR_ESTABLISHED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYearEstablished(String newYearEstablished) {
		eSet(PartyPackage.Literals.AFFILIATE__YEAR_ESTABLISHED, newYearEstablished);
	}

} //AffiliateImpl
