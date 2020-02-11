/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.contact.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.marketing.campaign.MarketingCampaign;
import org.abchip.mimo.biz.marketing.contact.ContactList;
import org.abchip.mimo.biz.marketing.contact.ContactListType;
import org.abchip.mimo.biz.marketing.contact.ContactPackage;
import org.abchip.mimo.biz.party.contact.ContactMechType;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getContactListId <em>Contact List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getContactListName <em>Contact List Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getContactListTypeId <em>Contact List Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getContactMechTypeId <em>Contact Mech Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#isIsPublic <em>Is Public</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getMarketingCampaignId <em>Marketing Campaign Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getOptOutScreen <em>Opt Out Screen</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getOwnerPartyId <em>Owner Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#isSingleUse <em>Single Use</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getVerifyEmailFrom <em>Verify Email From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getVerifyEmailScreen <em>Verify Email Screen</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getVerifyEmailSubject <em>Verify Email Subject</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getVerifyEmailWebSiteId <em>Verify Email Web Site Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactListImpl extends BizEntityImpl implements ContactList {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContactPackage.Literals.CONTACT_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return (String)eGet(ContactPackage.Literals.CONTACT_LIST__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(ContactPackage.Literals.CONTACT_LIST__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactListId() {
		return (String)eGet(ContactPackage.Literals.CONTACT_LIST__CONTACT_LIST_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactListId(String newContactListId) {
		eSet(ContactPackage.Literals.CONTACT_LIST__CONTACT_LIST_ID, newContactListId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactListName() {
		return (String)eGet(ContactPackage.Literals.CONTACT_LIST__CONTACT_LIST_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactListName(String newContactListName) {
		eSet(ContactPackage.Literals.CONTACT_LIST__CONTACT_LIST_NAME, newContactListName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactListType getContactListTypeId() {
		return (ContactListType)eGet(ContactPackage.Literals.CONTACT_LIST__CONTACT_LIST_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactListTypeId(ContactListType newContactListTypeId) {
		eSet(ContactPackage.Literals.CONTACT_LIST__CONTACT_LIST_TYPE_ID, newContactListTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMechType getContactMechTypeId() {
		return (ContactMechType)eGet(ContactPackage.Literals.CONTACT_LIST__CONTACT_MECH_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechTypeId(ContactMechType newContactMechTypeId) {
		eSet(ContactPackage.Literals.CONTACT_LIST__CONTACT_MECH_TYPE_ID, newContactMechTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getCreatedByUserLogin() {
		return (UserLogin)eGet(ContactPackage.Literals.CONTACT_LIST__CREATED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(UserLogin newCreatedByUserLogin) {
		eSet(ContactPackage.Literals.CONTACT_LIST__CREATED_BY_USER_LOGIN, newCreatedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(ContactPackage.Literals.CONTACT_LIST__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(ContactPackage.Literals.CONTACT_LIST__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsPublic() {
		return (Boolean)eGet(ContactPackage.Literals.CONTACT_LIST__IS_PUBLIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPublic(boolean newIsPublic) {
		eSet(ContactPackage.Literals.CONTACT_LIST__IS_PUBLIC, newIsPublic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getLastModifiedByUserLogin() {
		return (UserLogin)eGet(ContactPackage.Literals.CONTACT_LIST__LAST_MODIFIED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(UserLogin newLastModifiedByUserLogin) {
		eSet(ContactPackage.Literals.CONTACT_LIST__LAST_MODIFIED_BY_USER_LOGIN, newLastModifiedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarketingCampaign getMarketingCampaignId() {
		return (MarketingCampaign)eGet(ContactPackage.Literals.CONTACT_LIST__MARKETING_CAMPAIGN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarketingCampaignId(MarketingCampaign newMarketingCampaignId) {
		eSet(ContactPackage.Literals.CONTACT_LIST__MARKETING_CAMPAIGN_ID, newMarketingCampaignId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOptOutScreen() {
		return (String)eGet(ContactPackage.Literals.CONTACT_LIST__OPT_OUT_SCREEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptOutScreen(String newOptOutScreen) {
		eSet(ContactPackage.Literals.CONTACT_LIST__OPT_OUT_SCREEN, newOptOutScreen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSingleUse() {
		return (Boolean)eGet(ContactPackage.Literals.CONTACT_LIST__SINGLE_USE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSingleUse(boolean newSingleUse) {
		eSet(ContactPackage.Literals.CONTACT_LIST__SINGLE_USE, newSingleUse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getOwnerPartyId() {
		return (Party)eGet(ContactPackage.Literals.CONTACT_LIST__OWNER_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerPartyId(Party newOwnerPartyId) {
		eSet(ContactPackage.Literals.CONTACT_LIST__OWNER_PARTY_ID, newOwnerPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVerifyEmailFrom() {
		return (String)eGet(ContactPackage.Literals.CONTACT_LIST__VERIFY_EMAIL_FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerifyEmailFrom(String newVerifyEmailFrom) {
		eSet(ContactPackage.Literals.CONTACT_LIST__VERIFY_EMAIL_FROM, newVerifyEmailFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVerifyEmailScreen() {
		return (String)eGet(ContactPackage.Literals.CONTACT_LIST__VERIFY_EMAIL_SCREEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerifyEmailScreen(String newVerifyEmailScreen) {
		eSet(ContactPackage.Literals.CONTACT_LIST__VERIFY_EMAIL_SCREEN, newVerifyEmailScreen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVerifyEmailSubject() {
		return (String)eGet(ContactPackage.Literals.CONTACT_LIST__VERIFY_EMAIL_SUBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerifyEmailSubject(String newVerifyEmailSubject) {
		eSet(ContactPackage.Literals.CONTACT_LIST__VERIFY_EMAIL_SUBJECT, newVerifyEmailSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVerifyEmailWebSiteId() {
		return (String)eGet(ContactPackage.Literals.CONTACT_LIST__VERIFY_EMAIL_WEB_SITE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerifyEmailWebSiteId(String newVerifyEmailWebSiteId) {
		eSet(ContactPackage.Literals.CONTACT_LIST__VERIFY_EMAIL_WEB_SITE_ID, newVerifyEmailWebSiteId);
	}

} //ContactListImpl
