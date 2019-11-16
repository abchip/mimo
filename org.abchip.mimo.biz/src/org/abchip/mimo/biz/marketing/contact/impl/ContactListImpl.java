/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.contact.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.marketing.campaign.MarketingCampaign;
import org.abchip.mimo.biz.marketing.contact.ContactList;
import org.abchip.mimo.biz.marketing.contact.ContactListType;
import org.abchip.mimo.biz.marketing.contact.ContactPackage;
import org.abchip.mimo.biz.party.contact.ContactMechType;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#isIsPublic <em>Is Public</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getOptOutScreen <em>Opt Out Screen</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#isSingleUse <em>Single Use</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getVerifyEmailFrom <em>Verify Email From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getVerifyEmailScreen <em>Verify Email Screen</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getVerifyEmailSubject <em>Verify Email Subject</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getVerifyEmailWebSiteId <em>Verify Email Web Site Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getMarketingCampaignId <em>Marketing Campaign Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getContactListTypeId <em>Contact List Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getContactMechTypeId <em>Contact Mech Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl#getOwnerPartyId <em>Owner Party Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactListImpl extends BizEntityTypedImpl<ContactListType> implements ContactList {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getContactListId() <em>Contact List Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactListId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_LIST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactListId() <em>Contact List Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactListId()
	 * @generated
	 * @ordered
	 */
	protected String contactListId = CONTACT_LIST_ID_EDEFAULT;

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
	 * The default value of the '{@link #getContactListName() <em>Contact List Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactListName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_LIST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactListName() <em>Contact List Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactListName()
	 * @generated
	 * @ordered
	 */
	protected String contactListName = CONTACT_LIST_NAME_EDEFAULT;

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
	 * The default value of the '{@link #isIsPublic() <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPublic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PUBLIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPublic() <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPublic()
	 * @generated
	 * @ordered
	 */
	protected boolean isPublic = IS_PUBLIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptOutScreen() <em>Opt Out Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptOutScreen()
	 * @generated
	 * @ordered
	 */
	protected static final String OPT_OUT_SCREEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptOutScreen() <em>Opt Out Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptOutScreen()
	 * @generated
	 * @ordered
	 */
	protected String optOutScreen = OPT_OUT_SCREEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isSingleUse() <em>Single Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingleUse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SINGLE_USE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSingleUse() <em>Single Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingleUse()
	 * @generated
	 * @ordered
	 */
	protected boolean singleUse = SINGLE_USE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerifyEmailFrom() <em>Verify Email From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifyEmailFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String VERIFY_EMAIL_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerifyEmailFrom() <em>Verify Email From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifyEmailFrom()
	 * @generated
	 * @ordered
	 */
	protected String verifyEmailFrom = VERIFY_EMAIL_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerifyEmailScreen() <em>Verify Email Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifyEmailScreen()
	 * @generated
	 * @ordered
	 */
	protected static final String VERIFY_EMAIL_SCREEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerifyEmailScreen() <em>Verify Email Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifyEmailScreen()
	 * @generated
	 * @ordered
	 */
	protected String verifyEmailScreen = VERIFY_EMAIL_SCREEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerifyEmailSubject() <em>Verify Email Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifyEmailSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String VERIFY_EMAIL_SUBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerifyEmailSubject() <em>Verify Email Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifyEmailSubject()
	 * @generated
	 * @ordered
	 */
	protected String verifyEmailSubject = VERIFY_EMAIL_SUBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerifyEmailWebSiteId() <em>Verify Email Web Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifyEmailWebSiteId()
	 * @generated
	 * @ordered
	 */
	protected static final String VERIFY_EMAIL_WEB_SITE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerifyEmailWebSiteId() <em>Verify Email Web Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifyEmailWebSiteId()
	 * @generated
	 * @ordered
	 */
	protected String verifyEmailWebSiteId = VERIFY_EMAIL_WEB_SITE_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getContactListTypeId() <em>Contact List Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactListTypeId()
	 * @generated
	 * @ordered
	 */
	protected ContactListType contactListTypeId;

	/**
	 * The cached value of the '{@link #getContactMechTypeId() <em>Contact Mech Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechTypeId()
	 * @generated
	 * @ordered
	 */
	protected ContactMechType contactMechTypeId;

	/**
	 * The cached value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected UserLogin createdByUserLogin;

	/**
	 * The cached value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected UserLogin lastModifiedByUserLogin;

	/**
	 * The cached value of the '{@link #getOwnerPartyId() <em>Owner Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party ownerPartyId;

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
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactListId() {
		return contactListId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactListId(String newContactListId) {
		String oldContactListId = contactListId;
		contactListId = newContactListId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST__CONTACT_LIST_ID, oldContactListId, contactListId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactListName() {
		return contactListName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactListName(String newContactListName) {
		String oldContactListName = contactListName;
		contactListName = newContactListName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST__CONTACT_LIST_NAME, oldContactListName, contactListName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactListType getContactListTypeId() {
		if (contactListTypeId != null && ((EObject)contactListTypeId).eIsProxy()) {
			InternalEObject oldContactListTypeId = (InternalEObject)contactListTypeId;
			contactListTypeId = (ContactListType)eResolveProxy(oldContactListTypeId);
			if (contactListTypeId != oldContactListTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContactPackage.CONTACT_LIST__CONTACT_LIST_TYPE_ID, oldContactListTypeId, contactListTypeId));
			}
		}
		return contactListTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactListType basicGetContactListTypeId() {
		return contactListTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactListTypeId(ContactListType newContactListTypeId) {
		ContactListType oldContactListTypeId = contactListTypeId;
		contactListTypeId = newContactListTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST__CONTACT_LIST_TYPE_ID, oldContactListTypeId, contactListTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMechType getContactMechTypeId() {
		if (contactMechTypeId != null && ((EObject)contactMechTypeId).eIsProxy()) {
			InternalEObject oldContactMechTypeId = (InternalEObject)contactMechTypeId;
			contactMechTypeId = (ContactMechType)eResolveProxy(oldContactMechTypeId);
			if (contactMechTypeId != oldContactMechTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContactPackage.CONTACT_LIST__CONTACT_MECH_TYPE_ID, oldContactMechTypeId, contactMechTypeId));
			}
		}
		return contactMechTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMechType basicGetContactMechTypeId() {
		return contactMechTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechTypeId(ContactMechType newContactMechTypeId) {
		ContactMechType oldContactMechTypeId = contactMechTypeId;
		contactMechTypeId = newContactMechTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST__CONTACT_MECH_TYPE_ID, oldContactMechTypeId, contactMechTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getCreatedByUserLogin() {
		if (createdByUserLogin != null && ((EObject)createdByUserLogin).eIsProxy()) {
			InternalEObject oldCreatedByUserLogin = (InternalEObject)createdByUserLogin;
			createdByUserLogin = (UserLogin)eResolveProxy(oldCreatedByUserLogin);
			if (createdByUserLogin != oldCreatedByUserLogin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContactPackage.CONTACT_LIST__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
			}
		}
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetCreatedByUserLogin() {
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(UserLogin newCreatedByUserLogin) {
		UserLogin oldCreatedByUserLogin = createdByUserLogin;
		createdByUserLogin = newCreatedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
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
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsPublic() {
		return isPublic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPublic(boolean newIsPublic) {
		boolean oldIsPublic = isPublic;
		isPublic = newIsPublic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST__IS_PUBLIC, oldIsPublic, isPublic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getLastModifiedByUserLogin() {
		if (lastModifiedByUserLogin != null && ((EObject)lastModifiedByUserLogin).eIsProxy()) {
			InternalEObject oldLastModifiedByUserLogin = (InternalEObject)lastModifiedByUserLogin;
			lastModifiedByUserLogin = (UserLogin)eResolveProxy(oldLastModifiedByUserLogin);
			if (lastModifiedByUserLogin != oldLastModifiedByUserLogin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContactPackage.CONTACT_LIST__LAST_MODIFIED_BY_USER_LOGIN, oldLastModifiedByUserLogin, lastModifiedByUserLogin));
			}
		}
		return lastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetLastModifiedByUserLogin() {
		return lastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(UserLogin newLastModifiedByUserLogin) {
		UserLogin oldLastModifiedByUserLogin = lastModifiedByUserLogin;
		lastModifiedByUserLogin = newLastModifiedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST__LAST_MODIFIED_BY_USER_LOGIN, oldLastModifiedByUserLogin, lastModifiedByUserLogin));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContactPackage.CONTACT_LIST__MARKETING_CAMPAIGN_ID, oldMarketingCampaignId, marketingCampaignId));
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
		MarketingCampaign oldMarketingCampaignId = marketingCampaignId;
		marketingCampaignId = newMarketingCampaignId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST__MARKETING_CAMPAIGN_ID, oldMarketingCampaignId, marketingCampaignId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOptOutScreen() {
		return optOutScreen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptOutScreen(String newOptOutScreen) {
		String oldOptOutScreen = optOutScreen;
		optOutScreen = newOptOutScreen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST__OPT_OUT_SCREEN, oldOptOutScreen, optOutScreen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getOwnerPartyId() {
		if (ownerPartyId != null && ((EObject)ownerPartyId).eIsProxy()) {
			InternalEObject oldOwnerPartyId = (InternalEObject)ownerPartyId;
			ownerPartyId = (Party)eResolveProxy(oldOwnerPartyId);
			if (ownerPartyId != oldOwnerPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContactPackage.CONTACT_LIST__OWNER_PARTY_ID, oldOwnerPartyId, ownerPartyId));
			}
		}
		return ownerPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetOwnerPartyId() {
		return ownerPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerPartyId(Party newOwnerPartyId) {
		Party oldOwnerPartyId = ownerPartyId;
		ownerPartyId = newOwnerPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST__OWNER_PARTY_ID, oldOwnerPartyId, ownerPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSingleUse() {
		return singleUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSingleUse(boolean newSingleUse) {
		boolean oldSingleUse = singleUse;
		singleUse = newSingleUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST__SINGLE_USE, oldSingleUse, singleUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVerifyEmailFrom() {
		return verifyEmailFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerifyEmailFrom(String newVerifyEmailFrom) {
		String oldVerifyEmailFrom = verifyEmailFrom;
		verifyEmailFrom = newVerifyEmailFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST__VERIFY_EMAIL_FROM, oldVerifyEmailFrom, verifyEmailFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVerifyEmailScreen() {
		return verifyEmailScreen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerifyEmailScreen(String newVerifyEmailScreen) {
		String oldVerifyEmailScreen = verifyEmailScreen;
		verifyEmailScreen = newVerifyEmailScreen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST__VERIFY_EMAIL_SCREEN, oldVerifyEmailScreen, verifyEmailScreen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVerifyEmailSubject() {
		return verifyEmailSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerifyEmailSubject(String newVerifyEmailSubject) {
		String oldVerifyEmailSubject = verifyEmailSubject;
		verifyEmailSubject = newVerifyEmailSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST__VERIFY_EMAIL_SUBJECT, oldVerifyEmailSubject, verifyEmailSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVerifyEmailWebSiteId() {
		return verifyEmailWebSiteId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerifyEmailWebSiteId(String newVerifyEmailWebSiteId) {
		String oldVerifyEmailWebSiteId = verifyEmailWebSiteId;
		verifyEmailWebSiteId = newVerifyEmailWebSiteId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContactPackage.CONTACT_LIST__VERIFY_EMAIL_WEB_SITE_ID, oldVerifyEmailWebSiteId, verifyEmailWebSiteId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> communicationEvents() {
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
			case ContactPackage.CONTACT_LIST__CONTACT_LIST_ID:
				return getContactListId();
			case ContactPackage.CONTACT_LIST__COMMENTS:
				return getComments();
			case ContactPackage.CONTACT_LIST__CONTACT_LIST_NAME:
				return getContactListName();
			case ContactPackage.CONTACT_LIST__DESCRIPTION:
				return getDescription();
			case ContactPackage.CONTACT_LIST__IS_PUBLIC:
				return isIsPublic();
			case ContactPackage.CONTACT_LIST__OPT_OUT_SCREEN:
				return getOptOutScreen();
			case ContactPackage.CONTACT_LIST__SINGLE_USE:
				return isSingleUse();
			case ContactPackage.CONTACT_LIST__VERIFY_EMAIL_FROM:
				return getVerifyEmailFrom();
			case ContactPackage.CONTACT_LIST__VERIFY_EMAIL_SCREEN:
				return getVerifyEmailScreen();
			case ContactPackage.CONTACT_LIST__VERIFY_EMAIL_SUBJECT:
				return getVerifyEmailSubject();
			case ContactPackage.CONTACT_LIST__VERIFY_EMAIL_WEB_SITE_ID:
				return getVerifyEmailWebSiteId();
			case ContactPackage.CONTACT_LIST__MARKETING_CAMPAIGN_ID:
				if (resolve) return getMarketingCampaignId();
				return basicGetMarketingCampaignId();
			case ContactPackage.CONTACT_LIST__CONTACT_LIST_TYPE_ID:
				if (resolve) return getContactListTypeId();
				return basicGetContactListTypeId();
			case ContactPackage.CONTACT_LIST__CONTACT_MECH_TYPE_ID:
				if (resolve) return getContactMechTypeId();
				return basicGetContactMechTypeId();
			case ContactPackage.CONTACT_LIST__CREATED_BY_USER_LOGIN:
				if (resolve) return getCreatedByUserLogin();
				return basicGetCreatedByUserLogin();
			case ContactPackage.CONTACT_LIST__LAST_MODIFIED_BY_USER_LOGIN:
				if (resolve) return getLastModifiedByUserLogin();
				return basicGetLastModifiedByUserLogin();
			case ContactPackage.CONTACT_LIST__OWNER_PARTY_ID:
				if (resolve) return getOwnerPartyId();
				return basicGetOwnerPartyId();
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
			case ContactPackage.CONTACT_LIST__CONTACT_LIST_ID:
				setContactListId((String)newValue);
				return;
			case ContactPackage.CONTACT_LIST__COMMENTS:
				setComments((String)newValue);
				return;
			case ContactPackage.CONTACT_LIST__CONTACT_LIST_NAME:
				setContactListName((String)newValue);
				return;
			case ContactPackage.CONTACT_LIST__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ContactPackage.CONTACT_LIST__IS_PUBLIC:
				setIsPublic((Boolean)newValue);
				return;
			case ContactPackage.CONTACT_LIST__OPT_OUT_SCREEN:
				setOptOutScreen((String)newValue);
				return;
			case ContactPackage.CONTACT_LIST__SINGLE_USE:
				setSingleUse((Boolean)newValue);
				return;
			case ContactPackage.CONTACT_LIST__VERIFY_EMAIL_FROM:
				setVerifyEmailFrom((String)newValue);
				return;
			case ContactPackage.CONTACT_LIST__VERIFY_EMAIL_SCREEN:
				setVerifyEmailScreen((String)newValue);
				return;
			case ContactPackage.CONTACT_LIST__VERIFY_EMAIL_SUBJECT:
				setVerifyEmailSubject((String)newValue);
				return;
			case ContactPackage.CONTACT_LIST__VERIFY_EMAIL_WEB_SITE_ID:
				setVerifyEmailWebSiteId((String)newValue);
				return;
			case ContactPackage.CONTACT_LIST__MARKETING_CAMPAIGN_ID:
				setMarketingCampaignId((MarketingCampaign)newValue);
				return;
			case ContactPackage.CONTACT_LIST__CONTACT_LIST_TYPE_ID:
				setContactListTypeId((ContactListType)newValue);
				return;
			case ContactPackage.CONTACT_LIST__CONTACT_MECH_TYPE_ID:
				setContactMechTypeId((ContactMechType)newValue);
				return;
			case ContactPackage.CONTACT_LIST__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((UserLogin)newValue);
				return;
			case ContactPackage.CONTACT_LIST__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((UserLogin)newValue);
				return;
			case ContactPackage.CONTACT_LIST__OWNER_PARTY_ID:
				setOwnerPartyId((Party)newValue);
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
			case ContactPackage.CONTACT_LIST__CONTACT_LIST_ID:
				setContactListId(CONTACT_LIST_ID_EDEFAULT);
				return;
			case ContactPackage.CONTACT_LIST__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case ContactPackage.CONTACT_LIST__CONTACT_LIST_NAME:
				setContactListName(CONTACT_LIST_NAME_EDEFAULT);
				return;
			case ContactPackage.CONTACT_LIST__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ContactPackage.CONTACT_LIST__IS_PUBLIC:
				setIsPublic(IS_PUBLIC_EDEFAULT);
				return;
			case ContactPackage.CONTACT_LIST__OPT_OUT_SCREEN:
				setOptOutScreen(OPT_OUT_SCREEN_EDEFAULT);
				return;
			case ContactPackage.CONTACT_LIST__SINGLE_USE:
				setSingleUse(SINGLE_USE_EDEFAULT);
				return;
			case ContactPackage.CONTACT_LIST__VERIFY_EMAIL_FROM:
				setVerifyEmailFrom(VERIFY_EMAIL_FROM_EDEFAULT);
				return;
			case ContactPackage.CONTACT_LIST__VERIFY_EMAIL_SCREEN:
				setVerifyEmailScreen(VERIFY_EMAIL_SCREEN_EDEFAULT);
				return;
			case ContactPackage.CONTACT_LIST__VERIFY_EMAIL_SUBJECT:
				setVerifyEmailSubject(VERIFY_EMAIL_SUBJECT_EDEFAULT);
				return;
			case ContactPackage.CONTACT_LIST__VERIFY_EMAIL_WEB_SITE_ID:
				setVerifyEmailWebSiteId(VERIFY_EMAIL_WEB_SITE_ID_EDEFAULT);
				return;
			case ContactPackage.CONTACT_LIST__MARKETING_CAMPAIGN_ID:
				setMarketingCampaignId((MarketingCampaign)null);
				return;
			case ContactPackage.CONTACT_LIST__CONTACT_LIST_TYPE_ID:
				setContactListTypeId((ContactListType)null);
				return;
			case ContactPackage.CONTACT_LIST__CONTACT_MECH_TYPE_ID:
				setContactMechTypeId((ContactMechType)null);
				return;
			case ContactPackage.CONTACT_LIST__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((UserLogin)null);
				return;
			case ContactPackage.CONTACT_LIST__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((UserLogin)null);
				return;
			case ContactPackage.CONTACT_LIST__OWNER_PARTY_ID:
				setOwnerPartyId((Party)null);
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
			case ContactPackage.CONTACT_LIST__CONTACT_LIST_ID:
				return CONTACT_LIST_ID_EDEFAULT == null ? contactListId != null : !CONTACT_LIST_ID_EDEFAULT.equals(contactListId);
			case ContactPackage.CONTACT_LIST__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case ContactPackage.CONTACT_LIST__CONTACT_LIST_NAME:
				return CONTACT_LIST_NAME_EDEFAULT == null ? contactListName != null : !CONTACT_LIST_NAME_EDEFAULT.equals(contactListName);
			case ContactPackage.CONTACT_LIST__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ContactPackage.CONTACT_LIST__IS_PUBLIC:
				return isPublic != IS_PUBLIC_EDEFAULT;
			case ContactPackage.CONTACT_LIST__OPT_OUT_SCREEN:
				return OPT_OUT_SCREEN_EDEFAULT == null ? optOutScreen != null : !OPT_OUT_SCREEN_EDEFAULT.equals(optOutScreen);
			case ContactPackage.CONTACT_LIST__SINGLE_USE:
				return singleUse != SINGLE_USE_EDEFAULT;
			case ContactPackage.CONTACT_LIST__VERIFY_EMAIL_FROM:
				return VERIFY_EMAIL_FROM_EDEFAULT == null ? verifyEmailFrom != null : !VERIFY_EMAIL_FROM_EDEFAULT.equals(verifyEmailFrom);
			case ContactPackage.CONTACT_LIST__VERIFY_EMAIL_SCREEN:
				return VERIFY_EMAIL_SCREEN_EDEFAULT == null ? verifyEmailScreen != null : !VERIFY_EMAIL_SCREEN_EDEFAULT.equals(verifyEmailScreen);
			case ContactPackage.CONTACT_LIST__VERIFY_EMAIL_SUBJECT:
				return VERIFY_EMAIL_SUBJECT_EDEFAULT == null ? verifyEmailSubject != null : !VERIFY_EMAIL_SUBJECT_EDEFAULT.equals(verifyEmailSubject);
			case ContactPackage.CONTACT_LIST__VERIFY_EMAIL_WEB_SITE_ID:
				return VERIFY_EMAIL_WEB_SITE_ID_EDEFAULT == null ? verifyEmailWebSiteId != null : !VERIFY_EMAIL_WEB_SITE_ID_EDEFAULT.equals(verifyEmailWebSiteId);
			case ContactPackage.CONTACT_LIST__MARKETING_CAMPAIGN_ID:
				return marketingCampaignId != null;
			case ContactPackage.CONTACT_LIST__CONTACT_LIST_TYPE_ID:
				return contactListTypeId != null;
			case ContactPackage.CONTACT_LIST__CONTACT_MECH_TYPE_ID:
				return contactMechTypeId != null;
			case ContactPackage.CONTACT_LIST__CREATED_BY_USER_LOGIN:
				return createdByUserLogin != null;
			case ContactPackage.CONTACT_LIST__LAST_MODIFIED_BY_USER_LOGIN:
				return lastModifiedByUserLogin != null;
			case ContactPackage.CONTACT_LIST__OWNER_PARTY_ID:
				return ownerPartyId != null;
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
		result.append(" (contactListId: ");
		result.append(contactListId);
		result.append(", comments: ");
		result.append(comments);
		result.append(", contactListName: ");
		result.append(contactListName);
		result.append(", description: ");
		result.append(description);
		result.append(", isPublic: ");
		result.append(isPublic);
		result.append(", optOutScreen: ");
		result.append(optOutScreen);
		result.append(", singleUse: ");
		result.append(singleUse);
		result.append(", verifyEmailFrom: ");
		result.append(verifyEmailFrom);
		result.append(", verifyEmailScreen: ");
		result.append(verifyEmailScreen);
		result.append(", verifyEmailSubject: ");
		result.append(verifyEmailSubject);
		result.append(", verifyEmailWebSiteId: ");
		result.append(verifyEmailWebSiteId);
		result.append(')');
		return result.toString();
	}

} //ContactListImpl
