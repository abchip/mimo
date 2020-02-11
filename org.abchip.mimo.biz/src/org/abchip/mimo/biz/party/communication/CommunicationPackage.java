/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.communication;

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
 * @see org.abchip.mimo.biz.party.communication.CommunicationFactory
 * @model kind="package"
 * @generated
 */
public interface CommunicationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "communication";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/party/communication";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-communication";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommunicationPackage eINSTANCE = org.abchip.mimo.biz.party.communication.impl.CommunicationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.communication.impl.CommContentAssocTypeImpl <em>Comm Content Assoc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.communication.impl.CommContentAssocTypeImpl
	 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationPackageImpl#getCommContentAssocType()
	 * @generated
	 */
	int COMM_CONTENT_ASSOC_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_CONTENT_ASSOC_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_CONTENT_ASSOC_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_CONTENT_ASSOC_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_CONTENT_ASSOC_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Comm Content Assoc Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_CONTENT_ASSOC_TYPE__COMM_CONTENT_ASSOC_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_CONTENT_ASSOC_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comm Content Assoc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_CONTENT_ASSOC_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.communication.impl.CommEventContentAssocImpl <em>Comm Event Content Assoc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.communication.impl.CommEventContentAssocImpl
	 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationPackageImpl#getCommEventContentAssoc()
	 * @generated
	 */
	int COMM_EVENT_CONTENT_ASSOC = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_EVENT_CONTENT_ASSOC__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_EVENT_CONTENT_ASSOC__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_EVENT_CONTENT_ASSOC__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_EVENT_CONTENT_ASSOC__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_EVENT_CONTENT_ASSOC__CONTENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Communication Event Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_EVENT_CONTENT_ASSOC__COMMUNICATION_EVENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_EVENT_CONTENT_ASSOC__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comm Content Assoc Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_EVENT_CONTENT_ASSOC__COMM_CONTENT_ASSOC_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_EVENT_CONTENT_ASSOC__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_EVENT_CONTENT_ASSOC__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Comm Event Content Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_EVENT_CONTENT_ASSOC_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl
	 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationPackageImpl#getCommunicationEvent()
	 * @generated
	 */
	int COMMUNICATION_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Communication Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__COMMUNICATION_EVENT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bcc String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__BCC_STRING = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cc String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__CC_STRING = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Communication Event Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__COMMUNICATION_EVENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contact List Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__CONTACT_LIST_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Contact Mech Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__CONTACT_MECH_ID_FROM = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Contact Mech Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__CONTACT_MECH_ID_TO = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Contact Mech Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__CONTACT_MECH_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__CONTENT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Content Mime Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__CONTENT_MIME_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Datetime Ended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__DATETIME_ENDED = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Datetime Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__DATETIME_STARTED = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Entry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__ENTRY_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>From String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__FROM_STRING = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Header String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__HEADER_STRING = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Message Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__MESSAGE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__NOTE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Orig Comm Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__ORIG_COMM_EVENT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Parent Comm Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__PARENT_COMM_EVENT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Party Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__PARTY_ID_FROM = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Party Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__PARTY_ID_TO = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Reason Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__REASON_ENUM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Role Type Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__ROLE_TYPE_ID_FROM = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Role Type Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__ROLE_TYPE_ID_TO = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__STATUS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__SUBJECT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>To String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT__TO_STRING = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 26;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 27;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventProductImpl <em>Event Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationEventProductImpl
	 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationPackageImpl#getCommunicationEventProduct()
	 * @generated
	 */
	int COMMUNICATION_EVENT_PRODUCT = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRODUCT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRODUCT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRODUCT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRODUCT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRODUCT__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Communication Event Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRODUCT__COMMUNICATION_EVENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRODUCT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventPrpTypImpl <em>Event Prp Typ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationEventPrpTypImpl
	 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationPackageImpl#getCommunicationEventPrpTyp()
	 * @generated
	 */
	int COMMUNICATION_EVENT_PRP_TYP = 4;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRP_TYP__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRP_TYP__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRP_TYP__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRP_TYP__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRP_TYP__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Communication Event Prp Typ Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRP_TYP__COMMUNICATION_EVENT_PRP_TYP_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Communication Event Purposes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRP_TYP__COMMUNICATION_EVENT_PURPOSES = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRP_TYP__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRP_TYP__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRP_TYP__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Event Prp Typ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PRP_TYP_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventPurposeImpl <em>Event Purpose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationEventPurposeImpl
	 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationPackageImpl#getCommunicationEventPurpose()
	 * @generated
	 */
	int COMMUNICATION_EVENT_PURPOSE = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PURPOSE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PURPOSE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PURPOSE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PURPOSE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Communication Event Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PURPOSE__COMMUNICATION_EVENT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Communication Event Prp Typ Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PURPOSE__COMMUNICATION_EVENT_PRP_TYP_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PURPOSE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Event Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_PURPOSE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventRoleImpl <em>Event Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationEventRoleImpl
	 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationPackageImpl#getCommunicationEventRole()
	 * @generated
	 */
	int COMMUNICATION_EVENT_ROLE = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ROLE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ROLE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ROLE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ROLE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Communication Event Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ROLE__COMMUNICATION_EVENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ROLE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ROLE__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ROLE__CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ROLE__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Event Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_ROLE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventTypeImpl <em>Event Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationEventTypeImpl
	 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationPackageImpl#getCommunicationEventType()
	 * @generated
	 */
	int COMMUNICATION_EVENT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Communication Event Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_TYPE__COMMUNICATION_EVENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contact Mech Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_TYPE__CONTACT_MECH_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.communication.CommContentAssocType <em>Comm Content Assoc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comm Content Assoc Type</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommContentAssocType
	 * @generated
	 */
	EClass getCommContentAssocType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommContentAssocType#getCommContentAssocTypeId <em>Comm Content Assoc Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comm Content Assoc Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommContentAssocType#getCommContentAssocTypeId()
	 * @see #getCommContentAssocType()
	 * @generated
	 */
	EAttribute getCommContentAssocType_CommContentAssocTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommContentAssocType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommContentAssocType#getDescription()
	 * @see #getCommContentAssocType()
	 * @generated
	 */
	EAttribute getCommContentAssocType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.communication.CommEventContentAssoc <em>Comm Event Content Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comm Event Content Assoc</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommEventContentAssoc
	 * @generated
	 */
	EClass getCommEventContentAssoc();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommEventContentAssoc#getContentId <em>Content Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommEventContentAssoc#getContentId()
	 * @see #getCommEventContentAssoc()
	 * @generated
	 */
	EReference getCommEventContentAssoc_ContentId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommEventContentAssoc#getCommunicationEventId <em>Communication Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Event Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommEventContentAssoc#getCommunicationEventId()
	 * @see #getCommEventContentAssoc()
	 * @generated
	 */
	EReference getCommEventContentAssoc_CommunicationEventId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommEventContentAssoc#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommEventContentAssoc#getFromDate()
	 * @see #getCommEventContentAssoc()
	 * @generated
	 */
	EAttribute getCommEventContentAssoc_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommEventContentAssoc#getCommContentAssocTypeId <em>Comm Content Assoc Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comm Content Assoc Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommEventContentAssoc#getCommContentAssocTypeId()
	 * @see #getCommEventContentAssoc()
	 * @generated
	 */
	EReference getCommEventContentAssoc_CommContentAssocTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommEventContentAssoc#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommEventContentAssoc#getSequenceNum()
	 * @see #getCommEventContentAssoc()
	 * @generated
	 */
	EAttribute getCommEventContentAssoc_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommEventContentAssoc#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommEventContentAssoc#getThruDate()
	 * @see #getCommEventContentAssoc()
	 * @generated
	 */
	EAttribute getCommEventContentAssoc_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent
	 * @generated
	 */
	EClass getCommunicationEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getCommunicationEventId <em>Communication Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Event Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getCommunicationEventId()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_CommunicationEventId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getBccString <em>Bcc String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bcc String</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getBccString()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_BccString();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getCcString <em>Cc String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc String</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getCcString()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_CcString();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getCommunicationEventTypeId <em>Communication Event Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Event Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getCommunicationEventTypeId()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EReference getCommunicationEvent_CommunicationEventTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getContactListId <em>Contact List Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact List Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getContactListId()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EReference getCommunicationEvent_ContactListId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getContactMechIdFrom <em>Contact Mech Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id From</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getContactMechIdFrom()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EReference getCommunicationEvent_ContactMechIdFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getContactMechIdTo <em>Contact Mech Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id To</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getContactMechIdTo()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EReference getCommunicationEvent_ContactMechIdTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getContactMechTypeId <em>Contact Mech Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getContactMechTypeId()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EReference getCommunicationEvent_ContactMechTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getContent()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_Content();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getContentMimeTypeId <em>Content Mime Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Mime Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getContentMimeTypeId()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EReference getCommunicationEvent_ContentMimeTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getDatetimeEnded <em>Datetime Ended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datetime Ended</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getDatetimeEnded()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_DatetimeEnded();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getDatetimeStarted <em>Datetime Started</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datetime Started</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getDatetimeStarted()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_DatetimeStarted();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getEntryDate <em>Entry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Date</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getEntryDate()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_EntryDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getFromString <em>From String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From String</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getFromString()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_FromString();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getHeaderString <em>Header String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Header String</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getHeaderString()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_HeaderString();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getMessageId <em>Message Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getMessageId()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_MessageId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getNote()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_Note();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getOrigCommEventId <em>Orig Comm Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orig Comm Event Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getOrigCommEventId()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_OrigCommEventId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getParentCommEventId <em>Parent Comm Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Comm Event Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getParentCommEventId()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_ParentCommEventId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getPartyIdFrom <em>Party Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id From</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getPartyIdFrom()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EReference getCommunicationEvent_PartyIdFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getPartyIdTo <em>Party Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id To</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getPartyIdTo()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EReference getCommunicationEvent_PartyIdTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getReasonEnumId <em>Reason Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reason Enum Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getReasonEnumId()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EReference getCommunicationEvent_ReasonEnumId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getRoleTypeIdFrom <em>Role Type Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id From</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getRoleTypeIdFrom()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EReference getCommunicationEvent_RoleTypeIdFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getRoleTypeIdTo <em>Role Type Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id To</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getRoleTypeIdTo()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EReference getCommunicationEvent_RoleTypeIdTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getStatusId()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EReference getCommunicationEvent_StatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getSubject()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_Subject();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommunicationEvent#getToString <em>To String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To String</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEvent#getToString()
	 * @see #getCommunicationEvent()
	 * @generated
	 */
	EAttribute getCommunicationEvent_ToString();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.communication.CommunicationEventProduct <em>Event Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Product</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEventProduct
	 * @generated
	 */
	EClass getCommunicationEventProduct();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommunicationEventProduct#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEventProduct#getProductId()
	 * @see #getCommunicationEventProduct()
	 * @generated
	 */
	EReference getCommunicationEventProduct_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommunicationEventProduct#getCommunicationEventId <em>Communication Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Event Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEventProduct#getCommunicationEventId()
	 * @see #getCommunicationEventProduct()
	 * @generated
	 */
	EReference getCommunicationEventProduct_CommunicationEventId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.communication.CommunicationEventPrpTyp <em>Event Prp Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Prp Typ</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEventPrpTyp
	 * @generated
	 */
	EClass getCommunicationEventPrpTyp();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommunicationEventPrpTyp#getCommunicationEventPrpTypId <em>Communication Event Prp Typ Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Event Prp Typ Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEventPrpTyp#getCommunicationEventPrpTypId()
	 * @see #getCommunicationEventPrpTyp()
	 * @generated
	 */
	EAttribute getCommunicationEventPrpTyp_CommunicationEventPrpTypId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.party.communication.CommunicationEventPrpTyp#getCommunicationEventPurposes <em>Communication Event Purposes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communication Event Purposes</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEventPrpTyp#getCommunicationEventPurposes()
	 * @see #getCommunicationEventPrpTyp()
	 * @generated
	 */
	EReference getCommunicationEventPrpTyp_CommunicationEventPurposes();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommunicationEventPrpTyp#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEventPrpTyp#getDescription()
	 * @see #getCommunicationEventPrpTyp()
	 * @generated
	 */
	EAttribute getCommunicationEventPrpTyp_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommunicationEventPrpTyp#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEventPrpTyp#isHasTable()
	 * @see #getCommunicationEventPrpTyp()
	 * @generated
	 */
	EAttribute getCommunicationEventPrpTyp_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommunicationEventPrpTyp#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEventPrpTyp#getParentTypeId()
	 * @see #getCommunicationEventPrpTyp()
	 * @generated
	 */
	EReference getCommunicationEventPrpTyp_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.communication.CommunicationEventPurpose <em>Event Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Purpose</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEventPurpose
	 * @generated
	 */
	EClass getCommunicationEventPurpose();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommunicationEventPurpose#getCommunicationEventPrpTypId <em>Communication Event Prp Typ Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Event Prp Typ Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEventPurpose#getCommunicationEventPrpTypId()
	 * @see #getCommunicationEventPurpose()
	 * @generated
	 */
	EReference getCommunicationEventPurpose_CommunicationEventPrpTypId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommunicationEventPurpose#getCommunicationEventId <em>Communication Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Event Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEventPurpose#getCommunicationEventId()
	 * @see #getCommunicationEventPurpose()
	 * @generated
	 */
	EReference getCommunicationEventPurpose_CommunicationEventId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommunicationEventPurpose#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEventPurpose#getDescription()
	 * @see #getCommunicationEventPurpose()
	 * @generated
	 */
	EAttribute getCommunicationEventPurpose_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.communication.CommunicationEventRole <em>Event Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Role</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEventRole
	 * @generated
	 */
	EClass getCommunicationEventRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommunicationEventRole#getCommunicationEventId <em>Communication Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Event Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEventRole#getCommunicationEventId()
	 * @see #getCommunicationEventRole()
	 * @generated
	 */
	EReference getCommunicationEventRole_CommunicationEventId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommunicationEventRole#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEventRole#getPartyId()
	 * @see #getCommunicationEventRole()
	 * @generated
	 */
	EReference getCommunicationEventRole_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommunicationEventRole#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEventRole#getRoleTypeId()
	 * @see #getCommunicationEventRole()
	 * @generated
	 */
	EReference getCommunicationEventRole_RoleTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommunicationEventRole#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEventRole#getContactMechId()
	 * @see #getCommunicationEventRole()
	 * @generated
	 */
	EReference getCommunicationEventRole_ContactMechId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommunicationEventRole#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEventRole#getStatusId()
	 * @see #getCommunicationEventRole()
	 * @generated
	 */
	EReference getCommunicationEventRole_StatusId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.communication.CommunicationEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Type</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEventType
	 * @generated
	 */
	EClass getCommunicationEventType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommunicationEventType#getCommunicationEventTypeId <em>Communication Event Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication Event Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEventType#getCommunicationEventTypeId()
	 * @see #getCommunicationEventType()
	 * @generated
	 */
	EAttribute getCommunicationEventType_CommunicationEventTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommunicationEventType#getContactMechTypeId <em>Contact Mech Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEventType#getContactMechTypeId()
	 * @see #getCommunicationEventType()
	 * @generated
	 */
	EReference getCommunicationEventType_ContactMechTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommunicationEventType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEventType#getDescription()
	 * @see #getCommunicationEventType()
	 * @generated
	 */
	EAttribute getCommunicationEventType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.communication.CommunicationEventType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEventType#isHasTable()
	 * @see #getCommunicationEventType()
	 * @generated
	 */
	EAttribute getCommunicationEventType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.communication.CommunicationEventType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.communication.CommunicationEventType#getParentTypeId()
	 * @see #getCommunicationEventType()
	 * @generated
	 */
	EReference getCommunicationEventType_ParentTypeId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommunicationFactory getCommunicationFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.communication.impl.CommContentAssocTypeImpl <em>Comm Content Assoc Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.communication.impl.CommContentAssocTypeImpl
		 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationPackageImpl#getCommContentAssocType()
		 * @generated
		 */
		EClass COMM_CONTENT_ASSOC_TYPE = eINSTANCE.getCommContentAssocType();

		/**
		 * The meta object literal for the '<em><b>Comm Content Assoc Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_CONTENT_ASSOC_TYPE__COMM_CONTENT_ASSOC_TYPE_ID = eINSTANCE.getCommContentAssocType_CommContentAssocTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_CONTENT_ASSOC_TYPE__DESCRIPTION = eINSTANCE.getCommContentAssocType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.communication.impl.CommEventContentAssocImpl <em>Comm Event Content Assoc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.communication.impl.CommEventContentAssocImpl
		 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationPackageImpl#getCommEventContentAssoc()
		 * @generated
		 */
		EClass COMM_EVENT_CONTENT_ASSOC = eINSTANCE.getCommEventContentAssoc();

		/**
		 * The meta object literal for the '<em><b>Content Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_EVENT_CONTENT_ASSOC__CONTENT_ID = eINSTANCE.getCommEventContentAssoc_ContentId();

		/**
		 * The meta object literal for the '<em><b>Communication Event Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_EVENT_CONTENT_ASSOC__COMMUNICATION_EVENT_ID = eINSTANCE.getCommEventContentAssoc_CommunicationEventId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_EVENT_CONTENT_ASSOC__FROM_DATE = eINSTANCE.getCommEventContentAssoc_FromDate();

		/**
		 * The meta object literal for the '<em><b>Comm Content Assoc Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_EVENT_CONTENT_ASSOC__COMM_CONTENT_ASSOC_TYPE_ID = eINSTANCE.getCommEventContentAssoc_CommContentAssocTypeId();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_EVENT_CONTENT_ASSOC__SEQUENCE_NUM = eINSTANCE.getCommEventContentAssoc_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_EVENT_CONTENT_ASSOC__THRU_DATE = eINSTANCE.getCommEventContentAssoc_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationEventImpl
		 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationPackageImpl#getCommunicationEvent()
		 * @generated
		 */
		EClass COMMUNICATION_EVENT = eINSTANCE.getCommunicationEvent();

		/**
		 * The meta object literal for the '<em><b>Communication Event Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__COMMUNICATION_EVENT_ID = eINSTANCE.getCommunicationEvent_CommunicationEventId();

		/**
		 * The meta object literal for the '<em><b>Bcc String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__BCC_STRING = eINSTANCE.getCommunicationEvent_BccString();

		/**
		 * The meta object literal for the '<em><b>Cc String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__CC_STRING = eINSTANCE.getCommunicationEvent_CcString();

		/**
		 * The meta object literal for the '<em><b>Communication Event Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT__COMMUNICATION_EVENT_TYPE_ID = eINSTANCE.getCommunicationEvent_CommunicationEventTypeId();

		/**
		 * The meta object literal for the '<em><b>Contact List Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT__CONTACT_LIST_ID = eINSTANCE.getCommunicationEvent_ContactListId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT__CONTACT_MECH_ID_FROM = eINSTANCE.getCommunicationEvent_ContactMechIdFrom();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT__CONTACT_MECH_ID_TO = eINSTANCE.getCommunicationEvent_ContactMechIdTo();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT__CONTACT_MECH_TYPE_ID = eINSTANCE.getCommunicationEvent_ContactMechTypeId();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__CONTENT = eINSTANCE.getCommunicationEvent_Content();

		/**
		 * The meta object literal for the '<em><b>Content Mime Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT__CONTENT_MIME_TYPE_ID = eINSTANCE.getCommunicationEvent_ContentMimeTypeId();

		/**
		 * The meta object literal for the '<em><b>Datetime Ended</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__DATETIME_ENDED = eINSTANCE.getCommunicationEvent_DatetimeEnded();

		/**
		 * The meta object literal for the '<em><b>Datetime Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__DATETIME_STARTED = eINSTANCE.getCommunicationEvent_DatetimeStarted();

		/**
		 * The meta object literal for the '<em><b>Entry Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__ENTRY_DATE = eINSTANCE.getCommunicationEvent_EntryDate();

		/**
		 * The meta object literal for the '<em><b>From String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__FROM_STRING = eINSTANCE.getCommunicationEvent_FromString();

		/**
		 * The meta object literal for the '<em><b>Header String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__HEADER_STRING = eINSTANCE.getCommunicationEvent_HeaderString();

		/**
		 * The meta object literal for the '<em><b>Message Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__MESSAGE_ID = eINSTANCE.getCommunicationEvent_MessageId();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__NOTE = eINSTANCE.getCommunicationEvent_Note();

		/**
		 * The meta object literal for the '<em><b>Orig Comm Event Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__ORIG_COMM_EVENT_ID = eINSTANCE.getCommunicationEvent_OrigCommEventId();

		/**
		 * The meta object literal for the '<em><b>Parent Comm Event Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__PARENT_COMM_EVENT_ID = eINSTANCE.getCommunicationEvent_ParentCommEventId();

		/**
		 * The meta object literal for the '<em><b>Party Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT__PARTY_ID_FROM = eINSTANCE.getCommunicationEvent_PartyIdFrom();

		/**
		 * The meta object literal for the '<em><b>Party Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT__PARTY_ID_TO = eINSTANCE.getCommunicationEvent_PartyIdTo();

		/**
		 * The meta object literal for the '<em><b>Reason Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT__REASON_ENUM_ID = eINSTANCE.getCommunicationEvent_ReasonEnumId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT__ROLE_TYPE_ID_FROM = eINSTANCE.getCommunicationEvent_RoleTypeIdFrom();

		/**
		 * The meta object literal for the '<em><b>Role Type Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT__ROLE_TYPE_ID_TO = eINSTANCE.getCommunicationEvent_RoleTypeIdTo();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT__STATUS_ID = eINSTANCE.getCommunicationEvent_StatusId();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__SUBJECT = eINSTANCE.getCommunicationEvent_Subject();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT__TO_STRING = eINSTANCE.getCommunicationEvent_ToString();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventProductImpl <em>Event Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationEventProductImpl
		 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationPackageImpl#getCommunicationEventProduct()
		 * @generated
		 */
		EClass COMMUNICATION_EVENT_PRODUCT = eINSTANCE.getCommunicationEventProduct();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_PRODUCT__PRODUCT_ID = eINSTANCE.getCommunicationEventProduct_ProductId();

		/**
		 * The meta object literal for the '<em><b>Communication Event Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_PRODUCT__COMMUNICATION_EVENT_ID = eINSTANCE.getCommunicationEventProduct_CommunicationEventId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventPrpTypImpl <em>Event Prp Typ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationEventPrpTypImpl
		 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationPackageImpl#getCommunicationEventPrpTyp()
		 * @generated
		 */
		EClass COMMUNICATION_EVENT_PRP_TYP = eINSTANCE.getCommunicationEventPrpTyp();

		/**
		 * The meta object literal for the '<em><b>Communication Event Prp Typ Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT_PRP_TYP__COMMUNICATION_EVENT_PRP_TYP_ID = eINSTANCE.getCommunicationEventPrpTyp_CommunicationEventPrpTypId();

		/**
		 * The meta object literal for the '<em><b>Communication Event Purposes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_PRP_TYP__COMMUNICATION_EVENT_PURPOSES = eINSTANCE.getCommunicationEventPrpTyp_CommunicationEventPurposes();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT_PRP_TYP__DESCRIPTION = eINSTANCE.getCommunicationEventPrpTyp_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT_PRP_TYP__HAS_TABLE = eINSTANCE.getCommunicationEventPrpTyp_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_PRP_TYP__PARENT_TYPE_ID = eINSTANCE.getCommunicationEventPrpTyp_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventPurposeImpl <em>Event Purpose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationEventPurposeImpl
		 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationPackageImpl#getCommunicationEventPurpose()
		 * @generated
		 */
		EClass COMMUNICATION_EVENT_PURPOSE = eINSTANCE.getCommunicationEventPurpose();

		/**
		 * The meta object literal for the '<em><b>Communication Event Prp Typ Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_PURPOSE__COMMUNICATION_EVENT_PRP_TYP_ID = eINSTANCE.getCommunicationEventPurpose_CommunicationEventPrpTypId();

		/**
		 * The meta object literal for the '<em><b>Communication Event Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_PURPOSE__COMMUNICATION_EVENT_ID = eINSTANCE.getCommunicationEventPurpose_CommunicationEventId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT_PURPOSE__DESCRIPTION = eINSTANCE.getCommunicationEventPurpose_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventRoleImpl <em>Event Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationEventRoleImpl
		 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationPackageImpl#getCommunicationEventRole()
		 * @generated
		 */
		EClass COMMUNICATION_EVENT_ROLE = eINSTANCE.getCommunicationEventRole();

		/**
		 * The meta object literal for the '<em><b>Communication Event Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_ROLE__COMMUNICATION_EVENT_ID = eINSTANCE.getCommunicationEventRole_CommunicationEventId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_ROLE__PARTY_ID = eINSTANCE.getCommunicationEventRole_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_ROLE__ROLE_TYPE_ID = eINSTANCE.getCommunicationEventRole_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_ROLE__CONTACT_MECH_ID = eINSTANCE.getCommunicationEventRole_ContactMechId();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_ROLE__STATUS_ID = eINSTANCE.getCommunicationEventRole_StatusId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.communication.impl.CommunicationEventTypeImpl <em>Event Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationEventTypeImpl
		 * @see org.abchip.mimo.biz.party.communication.impl.CommunicationPackageImpl#getCommunicationEventType()
		 * @generated
		 */
		EClass COMMUNICATION_EVENT_TYPE = eINSTANCE.getCommunicationEventType();

		/**
		 * The meta object literal for the '<em><b>Communication Event Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT_TYPE__COMMUNICATION_EVENT_TYPE_ID = eINSTANCE.getCommunicationEventType_CommunicationEventTypeId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_TYPE__CONTACT_MECH_TYPE_ID = eINSTANCE.getCommunicationEventType_ContactMechTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT_TYPE__DESCRIPTION = eINSTANCE.getCommunicationEventType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_EVENT_TYPE__HAS_TABLE = eINSTANCE.getCommunicationEventType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_TYPE__PARENT_TYPE_ID = eINSTANCE.getCommunicationEventType_ParentTypeId();

	}

} //CommunicationPackage
