/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.contact;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.marketing.campaign.MarketingCampaign;
import org.abchip.mimo.biz.party.contact.ContactMechType;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.security.login.UserLogin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.ContactList#getContactListId <em>Contact List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.ContactList#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.ContactList#getContactListName <em>Contact List Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.ContactList#getContactListTypeId <em>Contact List Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.ContactList#getContactMechTypeId <em>Contact Mech Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.ContactList#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.ContactList#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.ContactList#isIsPublic <em>Is Public</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.ContactList#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.ContactList#getMarketingCampaignId <em>Marketing Campaign Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.ContactList#getOptOutScreen <em>Opt Out Screen</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.ContactList#getOwnerPartyId <em>Owner Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.ContactList#isSingleUse <em>Single Use</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.ContactList#getVerifyEmailFrom <em>Verify Email From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.ContactList#getVerifyEmailScreen <em>Verify Email Screen</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.ContactList#getVerifyEmailSubject <em>Verify Email Subject</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.marketing.contact.ContactList#getVerifyEmailWebSiteId <em>Verify Email Web Site Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactList()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface ContactList extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactList_Comments()
	 * @model annotation="mimo-ent-format type='comment' length='255'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Contact List Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact List Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact List Id</em>' attribute.
	 * @see #setContactListId(String)
	 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactList_ContactListId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getContactListId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getContactListId <em>Contact List Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact List Id</em>' attribute.
	 * @see #getContactListId()
	 * @generated
	 */
	void setContactListId(String value);

	/**
	 * Returns the value of the '<em><b>Contact List Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact List Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact List Name</em>' attribute.
	 * @see #setContactListName(String)
	 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactList_ContactListName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getContactListName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getContactListName <em>Contact List Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact List Name</em>' attribute.
	 * @see #getContactListName()
	 * @generated
	 */
	void setContactListName(String value);

	/**
	 * Returns the value of the '<em><b>Contact List Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact List Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact List Type Id</em>' reference.
	 * @see #setContactListTypeId(ContactListType)
	 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactList_ContactListTypeId()
	 * @model keys="contactListTypeId"
	 * @generated
	 */
	ContactListType getContactListTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getContactListTypeId <em>Contact List Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact List Type Id</em>' reference.
	 * @see #getContactListTypeId()
	 * @generated
	 */
	void setContactListTypeId(ContactListType value);

	/**
	 * Returns the value of the '<em><b>Contact Mech Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Type Id</em>' reference.
	 * @see #setContactMechTypeId(ContactMechType)
	 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactList_ContactMechTypeId()
	 * @model keys="contactMechTypeId"
	 * @generated
	 */
	ContactMechType getContactMechTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getContactMechTypeId <em>Contact Mech Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Type Id</em>' reference.
	 * @see #getContactMechTypeId()
	 * @generated
	 */
	void setContactMechTypeId(ContactMechType value);

	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' reference.
	 * @see #setCreatedByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactList_CreatedByUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getCreatedByUserLogin <em>Created By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' reference.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactList_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Public</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Public</em>' attribute.
	 * @see #setIsPublic(boolean)
	 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactList_IsPublic()
	 * @model
	 * @generated
	 */
	boolean isIsPublic();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.contact.ContactList#isIsPublic <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Public</em>' attribute.
	 * @see #isIsPublic()
	 * @generated
	 */
	void setIsPublic(boolean value);

	/**
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' reference.
	 * @see #setLastModifiedByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactList_LastModifiedByUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' reference.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Marketing Campaign Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marketing Campaign Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marketing Campaign Id</em>' reference.
	 * @see #setMarketingCampaignId(MarketingCampaign)
	 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactList_MarketingCampaignId()
	 * @model keys="marketingCampaignId"
	 * @generated
	 */
	MarketingCampaign getMarketingCampaignId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getMarketingCampaignId <em>Marketing Campaign Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marketing Campaign Id</em>' reference.
	 * @see #getMarketingCampaignId()
	 * @generated
	 */
	void setMarketingCampaignId(MarketingCampaign value);

	/**
	 * Returns the value of the '<em><b>Opt Out Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opt Out Screen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opt Out Screen</em>' attribute.
	 * @see #setOptOutScreen(String)
	 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactList_OptOutScreen()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getOptOutScreen();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getOptOutScreen <em>Opt Out Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opt Out Screen</em>' attribute.
	 * @see #getOptOutScreen()
	 * @generated
	 */
	void setOptOutScreen(String value);

	/**
	 * Returns the value of the '<em><b>Single Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Use</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Use</em>' attribute.
	 * @see #setSingleUse(boolean)
	 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactList_SingleUse()
	 * @model annotation="mimo-ent-slot help='Whether members of the list should be contacted only once.'"
	 * @generated
	 */
	boolean isSingleUse();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.contact.ContactList#isSingleUse <em>Single Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Use</em>' attribute.
	 * @see #isSingleUse()
	 * @generated
	 */
	void setSingleUse(boolean value);

	/**
	 * Returns the value of the '<em><b>Owner Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Party Id</em>' reference.
	 * @see #setOwnerPartyId(Party)
	 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactList_OwnerPartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getOwnerPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getOwnerPartyId <em>Owner Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Party Id</em>' reference.
	 * @see #getOwnerPartyId()
	 * @generated
	 */
	void setOwnerPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Verify Email From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verify Email From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verify Email From</em>' attribute.
	 * @see #setVerifyEmailFrom(String)
	 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactList_VerifyEmailFrom()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getVerifyEmailFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getVerifyEmailFrom <em>Verify Email From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verify Email From</em>' attribute.
	 * @see #getVerifyEmailFrom()
	 * @generated
	 */
	void setVerifyEmailFrom(String value);

	/**
	 * Returns the value of the '<em><b>Verify Email Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verify Email Screen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verify Email Screen</em>' attribute.
	 * @see #setVerifyEmailScreen(String)
	 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactList_VerifyEmailScreen()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getVerifyEmailScreen();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getVerifyEmailScreen <em>Verify Email Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verify Email Screen</em>' attribute.
	 * @see #getVerifyEmailScreen()
	 * @generated
	 */
	void setVerifyEmailScreen(String value);

	/**
	 * Returns the value of the '<em><b>Verify Email Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verify Email Subject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verify Email Subject</em>' attribute.
	 * @see #setVerifyEmailSubject(String)
	 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactList_VerifyEmailSubject()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getVerifyEmailSubject();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getVerifyEmailSubject <em>Verify Email Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verify Email Subject</em>' attribute.
	 * @see #getVerifyEmailSubject()
	 * @generated
	 */
	void setVerifyEmailSubject(String value);

	/**
	 * Returns the value of the '<em><b>Verify Email Web Site Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verify Email Web Site Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verify Email Web Site Id</em>' attribute.
	 * @see #setVerifyEmailWebSiteId(String)
	 * @see org.abchip.mimo.biz.marketing.contact.ContactPackage#getContactList_VerifyEmailWebSiteId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getVerifyEmailWebSiteId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getVerifyEmailWebSiteId <em>Verify Email Web Site Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verify Email Web Site Id</em>' attribute.
	 * @see #getVerifyEmailWebSiteId()
	 * @generated
	 */
	void setVerifyEmailWebSiteId(String value);

} // ContactList
