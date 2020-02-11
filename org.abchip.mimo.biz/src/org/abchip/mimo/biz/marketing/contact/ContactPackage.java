/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.marketing.contact;

import org.abchip.mimo.biz.BizPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.marketing.contact.ContactFactory
 * @model kind="package"
 * @generated
 */
public interface ContactPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contact";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/marketing/contact";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-contact";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContactPackage eINSTANCE = org.abchip.mimo.biz.marketing.contact.impl.ContactPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl
	 * @see org.abchip.mimo.biz.marketing.contact.impl.ContactPackageImpl#getContactList()
	 * @generated
	 */
	int CONTACT_LIST = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Contact List Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST__CONTACT_LIST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST__COMMENTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contact List Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST__CONTACT_LIST_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contact List Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST__CONTACT_LIST_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contact Mech Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST__CONTACT_MECH_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST__CREATED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST__IS_PUBLIC = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST__LAST_MODIFIED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Marketing Campaign Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST__MARKETING_CAMPAIGN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Opt Out Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST__OPT_OUT_SCREEN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Owner Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST__OWNER_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Single Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST__SINGLE_USE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Verify Email From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST__VERIFY_EMAIL_FROM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Verify Email Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST__VERIFY_EMAIL_SCREEN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Verify Email Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST__VERIFY_EMAIL_SUBJECT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Verify Email Web Site Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST__VERIFY_EMAIL_WEB_SITE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListCommStatusImpl <em>List Comm Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.marketing.contact.impl.ContactListCommStatusImpl
	 * @see org.abchip.mimo.biz.marketing.contact.impl.ContactPackageImpl#getContactListCommStatus()
	 * @generated
	 */
	int CONTACT_LIST_COMM_STATUS = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_COMM_STATUS__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_COMM_STATUS__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_COMM_STATUS__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_COMM_STATUS__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Contact List Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_COMM_STATUS__CONTACT_LIST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Communication Event Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_COMM_STATUS__COMMUNICATION_EVENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_COMM_STATUS__CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Change By User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_COMM_STATUS__CHANGE_BY_USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Message Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_COMM_STATUS__MESSAGE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_COMM_STATUS__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_COMM_STATUS__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>List Comm Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_COMM_STATUS_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListPartyImpl <em>List Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.marketing.contact.impl.ContactListPartyImpl
	 * @see org.abchip.mimo.biz.marketing.contact.impl.ContactPackageImpl#getContactListParty()
	 * @generated
	 */
	int CONTACT_LIST_PARTY = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_PARTY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_PARTY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_PARTY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_PARTY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Contact List Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_PARTY__CONTACT_LIST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_PARTY__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_PARTY__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Preferred Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_PARTY__PREFERRED_CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_PARTY__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_PARTY__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>List Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_PARTY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListPartyStatusImpl <em>List Party Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.marketing.contact.impl.ContactListPartyStatusImpl
	 * @see org.abchip.mimo.biz.marketing.contact.impl.ContactPackageImpl#getContactListPartyStatus()
	 * @generated
	 */
	int CONTACT_LIST_PARTY_STATUS = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_PARTY_STATUS__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_PARTY_STATUS__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_PARTY_STATUS__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_PARTY_STATUS__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Contact List Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_PARTY_STATUS__CONTACT_LIST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_PARTY_STATUS__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_PARTY_STATUS__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_PARTY_STATUS__STATUS_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Opt In Verify Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_PARTY_STATUS__OPT_IN_VERIFY_CODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Set By User Login Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_PARTY_STATUS__SET_BY_USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_PARTY_STATUS__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>List Party Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_PARTY_STATUS_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListTypeImpl <em>List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.marketing.contact.impl.ContactListTypeImpl
	 * @see org.abchip.mimo.biz.marketing.contact.impl.ContactPackageImpl#getContactListType()
	 * @generated
	 */
	int CONTACT_LIST_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Contact List Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_TYPE__CONTACT_LIST_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_LIST_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.marketing.contact.impl.WebSiteContactListImpl <em>Web Site Contact List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.marketing.contact.impl.WebSiteContactListImpl
	 * @see org.abchip.mimo.biz.marketing.contact.impl.ContactPackageImpl#getWebSiteContactList()
	 * @generated
	 */
	int WEB_SITE_CONTACT_LIST = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTACT_LIST__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTACT_LIST__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTACT_LIST__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTACT_LIST__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Web Site Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTACT_LIST__WEB_SITE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contact List Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTACT_LIST__CONTACT_LIST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTACT_LIST__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTACT_LIST__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Web Site Contact List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_CONTACT_LIST_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.marketing.contact.ContactList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactList
	 * @generated
	 */
	EClass getContactList();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getContactListId <em>Contact List Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact List Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactList#getContactListId()
	 * @see #getContactList()
	 * @generated
	 */
	EAttribute getContactList_ContactListId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactList#getComments()
	 * @see #getContactList()
	 * @generated
	 */
	EAttribute getContactList_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getContactListName <em>Contact List Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact List Name</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactList#getContactListName()
	 * @see #getContactList()
	 * @generated
	 */
	EAttribute getContactList_ContactListName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getContactListTypeId <em>Contact List Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact List Type Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactList#getContactListTypeId()
	 * @see #getContactList()
	 * @generated
	 */
	EReference getContactList_ContactListTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getContactMechTypeId <em>Contact Mech Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Type Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactList#getContactMechTypeId()
	 * @see #getContactList()
	 * @generated
	 */
	EReference getContactList_ContactMechTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactList#getCreatedByUserLogin()
	 * @see #getContactList()
	 * @generated
	 */
	EReference getContactList_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactList#getDescription()
	 * @see #getContactList()
	 * @generated
	 */
	EAttribute getContactList_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.contact.ContactList#isIsPublic <em>Is Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Public</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactList#isIsPublic()
	 * @see #getContactList()
	 * @generated
	 */
	EAttribute getContactList_IsPublic();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactList#getLastModifiedByUserLogin()
	 * @see #getContactList()
	 * @generated
	 */
	EReference getContactList_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getMarketingCampaignId <em>Marketing Campaign Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Marketing Campaign Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactList#getMarketingCampaignId()
	 * @see #getContactList()
	 * @generated
	 */
	EReference getContactList_MarketingCampaignId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getOptOutScreen <em>Opt Out Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opt Out Screen</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactList#getOptOutScreen()
	 * @see #getContactList()
	 * @generated
	 */
	EAttribute getContactList_OptOutScreen();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getOwnerPartyId <em>Owner Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner Party Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactList#getOwnerPartyId()
	 * @see #getContactList()
	 * @generated
	 */
	EReference getContactList_OwnerPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.contact.ContactList#isSingleUse <em>Single Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single Use</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactList#isSingleUse()
	 * @see #getContactList()
	 * @generated
	 */
	EAttribute getContactList_SingleUse();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getVerifyEmailFrom <em>Verify Email From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verify Email From</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactList#getVerifyEmailFrom()
	 * @see #getContactList()
	 * @generated
	 */
	EAttribute getContactList_VerifyEmailFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getVerifyEmailScreen <em>Verify Email Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verify Email Screen</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactList#getVerifyEmailScreen()
	 * @see #getContactList()
	 * @generated
	 */
	EAttribute getContactList_VerifyEmailScreen();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getVerifyEmailSubject <em>Verify Email Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verify Email Subject</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactList#getVerifyEmailSubject()
	 * @see #getContactList()
	 * @generated
	 */
	EAttribute getContactList_VerifyEmailSubject();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.contact.ContactList#getVerifyEmailWebSiteId <em>Verify Email Web Site Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verify Email Web Site Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactList#getVerifyEmailWebSiteId()
	 * @see #getContactList()
	 * @generated
	 */
	EAttribute getContactList_VerifyEmailWebSiteId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.marketing.contact.ContactListCommStatus <em>List Comm Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Comm Status</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListCommStatus
	 * @generated
	 */
	EClass getContactListCommStatus();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.contact.ContactListCommStatus#getContactListId <em>Contact List Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact List Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListCommStatus#getContactListId()
	 * @see #getContactListCommStatus()
	 * @generated
	 */
	EReference getContactListCommStatus_ContactListId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.contact.ContactListCommStatus#getCommunicationEventId <em>Communication Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Event Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListCommStatus#getCommunicationEventId()
	 * @see #getContactListCommStatus()
	 * @generated
	 */
	EReference getContactListCommStatus_CommunicationEventId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.contact.ContactListCommStatus#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListCommStatus#getContactMechId()
	 * @see #getContactListCommStatus()
	 * @generated
	 */
	EReference getContactListCommStatus_ContactMechId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.contact.ContactListCommStatus#getChangeByUserLoginId <em>Change By User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change By User Login Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListCommStatus#getChangeByUserLoginId()
	 * @see #getContactListCommStatus()
	 * @generated
	 */
	EReference getContactListCommStatus_ChangeByUserLoginId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.contact.ContactListCommStatus#getMessageId <em>Message Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListCommStatus#getMessageId()
	 * @see #getContactListCommStatus()
	 * @generated
	 */
	EAttribute getContactListCommStatus_MessageId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.contact.ContactListCommStatus#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListCommStatus#getPartyId()
	 * @see #getContactListCommStatus()
	 * @generated
	 */
	EReference getContactListCommStatus_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.contact.ContactListCommStatus#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListCommStatus#getStatusId()
	 * @see #getContactListCommStatus()
	 * @generated
	 */
	EReference getContactListCommStatus_StatusId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.marketing.contact.ContactListParty <em>List Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Party</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListParty
	 * @generated
	 */
	EClass getContactListParty();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.contact.ContactListParty#getContactListId <em>Contact List Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact List Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListParty#getContactListId()
	 * @see #getContactListParty()
	 * @generated
	 */
	EReference getContactListParty_ContactListId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.contact.ContactListParty#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListParty#getPartyId()
	 * @see #getContactListParty()
	 * @generated
	 */
	EReference getContactListParty_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.contact.ContactListParty#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListParty#getFromDate()
	 * @see #getContactListParty()
	 * @generated
	 */
	EAttribute getContactListParty_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.contact.ContactListParty#getPreferredContactMechId <em>Preferred Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Preferred Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListParty#getPreferredContactMechId()
	 * @see #getContactListParty()
	 * @generated
	 */
	EReference getContactListParty_PreferredContactMechId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.contact.ContactListParty#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListParty#getStatusId()
	 * @see #getContactListParty()
	 * @generated
	 */
	EReference getContactListParty_StatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.contact.ContactListParty#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListParty#getThruDate()
	 * @see #getContactListParty()
	 * @generated
	 */
	EAttribute getContactListParty_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus <em>List Party Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Party Status</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus
	 * @generated
	 */
	EClass getContactListPartyStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getContactListId <em>Contact List Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact List Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getContactListId()
	 * @see #getContactListPartyStatus()
	 * @generated
	 */
	EAttribute getContactListPartyStatus_ContactListId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getPartyId()
	 * @see #getContactListPartyStatus()
	 * @generated
	 */
	EAttribute getContactListPartyStatus_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getFromDate()
	 * @see #getContactListPartyStatus()
	 * @generated
	 */
	EAttribute getContactListPartyStatus_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getStatusDate <em>Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Date</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getStatusDate()
	 * @see #getContactListPartyStatus()
	 * @generated
	 */
	EAttribute getContactListPartyStatus_StatusDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getOptInVerifyCode <em>Opt In Verify Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opt In Verify Code</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getOptInVerifyCode()
	 * @see #getContactListPartyStatus()
	 * @generated
	 */
	EAttribute getContactListPartyStatus_OptInVerifyCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getSetByUserLoginId <em>Set By User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set By User Login Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getSetByUserLoginId()
	 * @see #getContactListPartyStatus()
	 * @generated
	 */
	EAttribute getContactListPartyStatus_SetByUserLoginId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListPartyStatus#getStatusId()
	 * @see #getContactListPartyStatus()
	 * @generated
	 */
	EAttribute getContactListPartyStatus_StatusId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.marketing.contact.ContactListType <em>List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Type</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListType
	 * @generated
	 */
	EClass getContactListType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.contact.ContactListType#getContactListTypeId <em>Contact List Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact List Type Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListType#getContactListTypeId()
	 * @see #getContactListType()
	 * @generated
	 */
	EAttribute getContactListType_ContactListTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.contact.ContactListType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.ContactListType#getDescription()
	 * @see #getContactListType()
	 * @generated
	 */
	EAttribute getContactListType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.marketing.contact.WebSiteContactList <em>Web Site Contact List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Site Contact List</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.WebSiteContactList
	 * @generated
	 */
	EClass getWebSiteContactList();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.contact.WebSiteContactList#getWebSiteId <em>Web Site Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Web Site Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.WebSiteContactList#getWebSiteId()
	 * @see #getWebSiteContactList()
	 * @generated
	 */
	EReference getWebSiteContactList_WebSiteId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.marketing.contact.WebSiteContactList#getContactListId <em>Contact List Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact List Id</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.WebSiteContactList#getContactListId()
	 * @see #getWebSiteContactList()
	 * @generated
	 */
	EReference getWebSiteContactList_ContactListId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.contact.WebSiteContactList#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.WebSiteContactList#getFromDate()
	 * @see #getWebSiteContactList()
	 * @generated
	 */
	EAttribute getWebSiteContactList_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.marketing.contact.WebSiteContactList#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.marketing.contact.WebSiteContactList#getThruDate()
	 * @see #getWebSiteContactList()
	 * @generated
	 */
	EAttribute getWebSiteContactList_ThruDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContactFactory getContactFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.marketing.contact.impl.ContactListImpl
		 * @see org.abchip.mimo.biz.marketing.contact.impl.ContactPackageImpl#getContactList()
		 * @generated
		 */
		EClass CONTACT_LIST = eINSTANCE.getContactList();

		/**
		 * The meta object literal for the '<em><b>Contact List Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_LIST__CONTACT_LIST_ID = eINSTANCE.getContactList_ContactListId();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_LIST__COMMENTS = eINSTANCE.getContactList_Comments();

		/**
		 * The meta object literal for the '<em><b>Contact List Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_LIST__CONTACT_LIST_NAME = eINSTANCE.getContactList_ContactListName();

		/**
		 * The meta object literal for the '<em><b>Contact List Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_LIST__CONTACT_LIST_TYPE_ID = eINSTANCE.getContactList_ContactListTypeId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_LIST__CONTACT_MECH_TYPE_ID = eINSTANCE.getContactList_ContactMechTypeId();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_LIST__CREATED_BY_USER_LOGIN = eINSTANCE.getContactList_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_LIST__DESCRIPTION = eINSTANCE.getContactList_Description();

		/**
		 * The meta object literal for the '<em><b>Is Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_LIST__IS_PUBLIC = eINSTANCE.getContactList_IsPublic();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_LIST__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getContactList_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Marketing Campaign Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_LIST__MARKETING_CAMPAIGN_ID = eINSTANCE.getContactList_MarketingCampaignId();

		/**
		 * The meta object literal for the '<em><b>Opt Out Screen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_LIST__OPT_OUT_SCREEN = eINSTANCE.getContactList_OptOutScreen();

		/**
		 * The meta object literal for the '<em><b>Owner Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_LIST__OWNER_PARTY_ID = eINSTANCE.getContactList_OwnerPartyId();

		/**
		 * The meta object literal for the '<em><b>Single Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_LIST__SINGLE_USE = eINSTANCE.getContactList_SingleUse();

		/**
		 * The meta object literal for the '<em><b>Verify Email From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_LIST__VERIFY_EMAIL_FROM = eINSTANCE.getContactList_VerifyEmailFrom();

		/**
		 * The meta object literal for the '<em><b>Verify Email Screen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_LIST__VERIFY_EMAIL_SCREEN = eINSTANCE.getContactList_VerifyEmailScreen();

		/**
		 * The meta object literal for the '<em><b>Verify Email Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_LIST__VERIFY_EMAIL_SUBJECT = eINSTANCE.getContactList_VerifyEmailSubject();

		/**
		 * The meta object literal for the '<em><b>Verify Email Web Site Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_LIST__VERIFY_EMAIL_WEB_SITE_ID = eINSTANCE.getContactList_VerifyEmailWebSiteId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListCommStatusImpl <em>List Comm Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.marketing.contact.impl.ContactListCommStatusImpl
		 * @see org.abchip.mimo.biz.marketing.contact.impl.ContactPackageImpl#getContactListCommStatus()
		 * @generated
		 */
		EClass CONTACT_LIST_COMM_STATUS = eINSTANCE.getContactListCommStatus();

		/**
		 * The meta object literal for the '<em><b>Contact List Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_LIST_COMM_STATUS__CONTACT_LIST_ID = eINSTANCE.getContactListCommStatus_ContactListId();

		/**
		 * The meta object literal for the '<em><b>Communication Event Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_LIST_COMM_STATUS__COMMUNICATION_EVENT_ID = eINSTANCE.getContactListCommStatus_CommunicationEventId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_LIST_COMM_STATUS__CONTACT_MECH_ID = eINSTANCE.getContactListCommStatus_ContactMechId();

		/**
		 * The meta object literal for the '<em><b>Change By User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_LIST_COMM_STATUS__CHANGE_BY_USER_LOGIN_ID = eINSTANCE.getContactListCommStatus_ChangeByUserLoginId();

		/**
		 * The meta object literal for the '<em><b>Message Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_LIST_COMM_STATUS__MESSAGE_ID = eINSTANCE.getContactListCommStatus_MessageId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_LIST_COMM_STATUS__PARTY_ID = eINSTANCE.getContactListCommStatus_PartyId();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_LIST_COMM_STATUS__STATUS_ID = eINSTANCE.getContactListCommStatus_StatusId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListPartyImpl <em>List Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.marketing.contact.impl.ContactListPartyImpl
		 * @see org.abchip.mimo.biz.marketing.contact.impl.ContactPackageImpl#getContactListParty()
		 * @generated
		 */
		EClass CONTACT_LIST_PARTY = eINSTANCE.getContactListParty();

		/**
		 * The meta object literal for the '<em><b>Contact List Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_LIST_PARTY__CONTACT_LIST_ID = eINSTANCE.getContactListParty_ContactListId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_LIST_PARTY__PARTY_ID = eINSTANCE.getContactListParty_PartyId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_LIST_PARTY__FROM_DATE = eINSTANCE.getContactListParty_FromDate();

		/**
		 * The meta object literal for the '<em><b>Preferred Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_LIST_PARTY__PREFERRED_CONTACT_MECH_ID = eINSTANCE.getContactListParty_PreferredContactMechId();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_LIST_PARTY__STATUS_ID = eINSTANCE.getContactListParty_StatusId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_LIST_PARTY__THRU_DATE = eINSTANCE.getContactListParty_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListPartyStatusImpl <em>List Party Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.marketing.contact.impl.ContactListPartyStatusImpl
		 * @see org.abchip.mimo.biz.marketing.contact.impl.ContactPackageImpl#getContactListPartyStatus()
		 * @generated
		 */
		EClass CONTACT_LIST_PARTY_STATUS = eINSTANCE.getContactListPartyStatus();

		/**
		 * The meta object literal for the '<em><b>Contact List Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_LIST_PARTY_STATUS__CONTACT_LIST_ID = eINSTANCE.getContactListPartyStatus_ContactListId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_LIST_PARTY_STATUS__PARTY_ID = eINSTANCE.getContactListPartyStatus_PartyId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_LIST_PARTY_STATUS__FROM_DATE = eINSTANCE.getContactListPartyStatus_FromDate();

		/**
		 * The meta object literal for the '<em><b>Status Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_LIST_PARTY_STATUS__STATUS_DATE = eINSTANCE.getContactListPartyStatus_StatusDate();

		/**
		 * The meta object literal for the '<em><b>Opt In Verify Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_LIST_PARTY_STATUS__OPT_IN_VERIFY_CODE = eINSTANCE.getContactListPartyStatus_OptInVerifyCode();

		/**
		 * The meta object literal for the '<em><b>Set By User Login Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_LIST_PARTY_STATUS__SET_BY_USER_LOGIN_ID = eINSTANCE.getContactListPartyStatus_SetByUserLoginId();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_LIST_PARTY_STATUS__STATUS_ID = eINSTANCE.getContactListPartyStatus_StatusId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.marketing.contact.impl.ContactListTypeImpl <em>List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.marketing.contact.impl.ContactListTypeImpl
		 * @see org.abchip.mimo.biz.marketing.contact.impl.ContactPackageImpl#getContactListType()
		 * @generated
		 */
		EClass CONTACT_LIST_TYPE = eINSTANCE.getContactListType();

		/**
		 * The meta object literal for the '<em><b>Contact List Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_LIST_TYPE__CONTACT_LIST_TYPE_ID = eINSTANCE.getContactListType_ContactListTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_LIST_TYPE__DESCRIPTION = eINSTANCE.getContactListType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.marketing.contact.impl.WebSiteContactListImpl <em>Web Site Contact List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.marketing.contact.impl.WebSiteContactListImpl
		 * @see org.abchip.mimo.biz.marketing.contact.impl.ContactPackageImpl#getWebSiteContactList()
		 * @generated
		 */
		EClass WEB_SITE_CONTACT_LIST = eINSTANCE.getWebSiteContactList();

		/**
		 * The meta object literal for the '<em><b>Web Site Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE_CONTACT_LIST__WEB_SITE_ID = eINSTANCE.getWebSiteContactList_WebSiteId();

		/**
		 * The meta object literal for the '<em><b>Contact List Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_SITE_CONTACT_LIST__CONTACT_LIST_ID = eINSTANCE.getWebSiteContactList_ContactListId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_CONTACT_LIST__FROM_DATE = eINSTANCE.getWebSiteContactList_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE_CONTACT_LIST__THRU_DATE = eINSTANCE.getWebSiteContactList_ThruDate();

	}

} //ContactPackage
