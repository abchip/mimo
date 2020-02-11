/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affiliate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.Affiliate#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Affiliate#getAffiliateDescription <em>Affiliate Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Affiliate#getAffiliateName <em>Affiliate Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Affiliate#getDateTimeApproved <em>Date Time Approved</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Affiliate#getDateTimeCreated <em>Date Time Created</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Affiliate#getSitePageViews <em>Site Page Views</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Affiliate#getSiteType <em>Site Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Affiliate#getSiteVisitors <em>Site Visitors</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.Affiliate#getYearEstablished <em>Year Established</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.party.party.PartyPackage#getAffiliate()
 * @model annotation="mimo-ent-frame title='Affiliate Party'"
 * @generated
 */
public interface Affiliate extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Affiliate Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affiliate Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affiliate Description</em>' attribute.
	 * @see #setAffiliateDescription(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getAffiliate_AffiliateDescription()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getAffiliateDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Affiliate#getAffiliateDescription <em>Affiliate Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affiliate Description</em>' attribute.
	 * @see #getAffiliateDescription()
	 * @generated
	 */
	void setAffiliateDescription(String value);

	/**
	 * Returns the value of the '<em><b>Affiliate Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affiliate Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affiliate Name</em>' attribute.
	 * @see #setAffiliateName(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getAffiliate_AffiliateName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getAffiliateName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Affiliate#getAffiliateName <em>Affiliate Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affiliate Name</em>' attribute.
	 * @see #getAffiliateName()
	 * @generated
	 */
	void setAffiliateName(String value);

	/**
	 * Returns the value of the '<em><b>Date Time Approved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time Approved</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time Approved</em>' attribute.
	 * @see #setDateTimeApproved(Date)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getAffiliate_DateTimeApproved()
	 * @model
	 * @generated
	 */
	Date getDateTimeApproved();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Affiliate#getDateTimeApproved <em>Date Time Approved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time Approved</em>' attribute.
	 * @see #getDateTimeApproved()
	 * @generated
	 */
	void setDateTimeApproved(Date value);

	/**
	 * Returns the value of the '<em><b>Date Time Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time Created</em>' attribute.
	 * @see #setDateTimeCreated(Date)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getAffiliate_DateTimeCreated()
	 * @model
	 * @generated
	 */
	Date getDateTimeCreated();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Affiliate#getDateTimeCreated <em>Date Time Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time Created</em>' attribute.
	 * @see #getDateTimeCreated()
	 * @generated
	 */
	void setDateTimeCreated(Date value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getAffiliate_PartyId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Affiliate#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Site Page Views</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Page Views</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Page Views</em>' attribute.
	 * @see #setSitePageViews(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getAffiliate_SitePageViews()
	 * @model annotation="mimo-ent-format type='comment' length='255'"
	 * @generated
	 */
	String getSitePageViews();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Affiliate#getSitePageViews <em>Site Page Views</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Page Views</em>' attribute.
	 * @see #getSitePageViews()
	 * @generated
	 */
	void setSitePageViews(String value);

	/**
	 * Returns the value of the '<em><b>Site Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Type</em>' attribute.
	 * @see #setSiteType(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getAffiliate_SiteType()
	 * @model annotation="mimo-ent-format type='comment' length='255'"
	 * @generated
	 */
	String getSiteType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Affiliate#getSiteType <em>Site Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Type</em>' attribute.
	 * @see #getSiteType()
	 * @generated
	 */
	void setSiteType(String value);

	/**
	 * Returns the value of the '<em><b>Site Visitors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site Visitors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site Visitors</em>' attribute.
	 * @see #setSiteVisitors(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getAffiliate_SiteVisitors()
	 * @model annotation="mimo-ent-format type='comment' length='255'"
	 * @generated
	 */
	String getSiteVisitors();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Affiliate#getSiteVisitors <em>Site Visitors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site Visitors</em>' attribute.
	 * @see #getSiteVisitors()
	 * @generated
	 */
	void setSiteVisitors(String value);

	/**
	 * Returns the value of the '<em><b>Year Established</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year Established</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Established</em>' attribute.
	 * @see #setYearEstablished(String)
	 * @see org.abchip.mimo.biz.party.party.PartyPackage#getAffiliate_YearEstablished()
	 * @model annotation="mimo-ent-format length='10'"
	 * @generated
	 */
	String getYearEstablished();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.party.party.Affiliate#getYearEstablished <em>Year Established</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Established</em>' attribute.
	 * @see #getYearEstablished()
	 * @generated
	 */
	void setYearEstablished(String value);

} // Affiliate
