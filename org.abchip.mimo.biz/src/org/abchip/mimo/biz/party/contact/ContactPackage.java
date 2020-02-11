/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.contact;

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
 * @see org.abchip.mimo.biz.party.contact.ContactFactory
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
	String eNS_URI = "http://www.abchip.org/mimo/biz/party/contact";

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
	ContactPackage eINSTANCE = org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.contact.impl.ContactMechImpl <em>Mech</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.contact.impl.ContactMechImpl
	 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getContactMech()
	 * @generated
	 */
	int CONTACT_MECH = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH__CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contact Mech Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH__CONTACT_MECH_ATTRIBUTES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contact Mech Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH__CONTACT_MECH_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Contact Mech Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH__FROM_CONTACT_MECH_LINKS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Info String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH__INFO_STRING = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Mech</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.contact.impl.ContactMechAttributeImpl <em>Mech Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.contact.impl.ContactMechAttributeImpl
	 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getContactMechAttribute()
	 * @generated
	 */
	int CONTACT_MECH_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_ATTRIBUTE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_ATTRIBUTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_ATTRIBUTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_ATTRIBUTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_ATTRIBUTE__CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_ATTRIBUTE__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_ATTRIBUTE__ATTR_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_ATTRIBUTE__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Mech Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_ATTRIBUTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.contact.impl.ContactMechLinkImpl <em>Mech Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.contact.impl.ContactMechLinkImpl
	 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getContactMechLink()
	 * @generated
	 */
	int CONTACT_MECH_LINK = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_LINK__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_LINK__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_LINK__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_LINK__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Contact Mech Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_LINK__CONTACT_MECH_ID_FROM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contact Mech Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_LINK__CONTACT_MECH_ID_TO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mech Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_LINK_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.contact.impl.ContactMechPurposeTypeImpl <em>Mech Purpose Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.contact.impl.ContactMechPurposeTypeImpl
	 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getContactMechPurposeType()
	 * @generated
	 */
	int CONTACT_MECH_PURPOSE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_PURPOSE_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_PURPOSE_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_PURPOSE_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_PURPOSE_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Contact Mech Purpose Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_PURPOSE_TYPE__CONTACT_MECH_PURPOSE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_PURPOSE_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mech Purpose Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_PURPOSE_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.contact.impl.ContactMechTypeImpl <em>Mech Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.contact.impl.ContactMechTypeImpl
	 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getContactMechType()
	 * @generated
	 */
	int CONTACT_MECH_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Contact Mech Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE__CONTACT_MECH_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contact Mech Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE__CONTACT_MECH_TYPE_ATTRS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contact Mech Type Purposes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE__CONTACT_MECH_TYPE_PURPOSES = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Mech Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.contact.impl.ContactMechTypeAttrImpl <em>Mech Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.contact.impl.ContactMechTypeAttrImpl
	 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getContactMechTypeAttr()
	 * @generated
	 */
	int CONTACT_MECH_TYPE_ATTR = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE_ATTR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE_ATTR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE_ATTR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE_ATTR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Contact Mech Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE_ATTR__CONTACT_MECH_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE_ATTR__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE_ATTR__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mech Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE_ATTR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.contact.impl.ContactMechTypePurposeImpl <em>Mech Type Purpose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.contact.impl.ContactMechTypePurposeImpl
	 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getContactMechTypePurpose()
	 * @generated
	 */
	int CONTACT_MECH_TYPE_PURPOSE = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE_PURPOSE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE_PURPOSE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE_PURPOSE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE_PURPOSE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Contact Mech Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE_PURPOSE__CONTACT_MECH_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contact Mech Purpose Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE_PURPOSE__CONTACT_MECH_PURPOSE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mech Type Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_MECH_TYPE_PURPOSE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.contact.impl.EmailAddressVerificationImpl <em>Email Address Verification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.contact.impl.EmailAddressVerificationImpl
	 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getEmailAddressVerification()
	 * @generated
	 */
	int EMAIL_ADDRESS_VERIFICATION = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_VERIFICATION__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_VERIFICATION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_VERIFICATION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_VERIFICATION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_VERIFICATION__EMAIL_ADDRESS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_VERIFICATION__EXPIRE_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Verify Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_VERIFICATION__VERIFY_HASH = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Email Address Verification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_ADDRESS_VERIFICATION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.contact.impl.FtpAddressImpl <em>Ftp Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.contact.impl.FtpAddressImpl
	 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getFtpAddress()
	 * @generated
	 */
	int FTP_ADDRESS = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP_ADDRESS__CREATED_STAMP = CONTACT_MECH__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP_ADDRESS__CREATED_TX_STAMP = CONTACT_MECH__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP_ADDRESS__LAST_UPDATED_STAMP = CONTACT_MECH__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP_ADDRESS__LAST_UPDATED_TX_STAMP = CONTACT_MECH__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP_ADDRESS__CONTACT_MECH_ID = CONTACT_MECH__CONTACT_MECH_ID;

	/**
	 * The feature id for the '<em><b>Contact Mech Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP_ADDRESS__CONTACT_MECH_ATTRIBUTES = CONTACT_MECH__CONTACT_MECH_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contact Mech Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP_ADDRESS__CONTACT_MECH_TYPE_ID = CONTACT_MECH__CONTACT_MECH_TYPE_ID;

	/**
	 * The feature id for the '<em><b>From Contact Mech Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP_ADDRESS__FROM_CONTACT_MECH_LINKS = CONTACT_MECH__FROM_CONTACT_MECH_LINKS;

	/**
	 * The feature id for the '<em><b>Info String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP_ADDRESS__INFO_STRING = CONTACT_MECH__INFO_STRING;

	/**
	 * The feature id for the '<em><b>Binary Transfer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP_ADDRESS__BINARY_TRANSFER = CONTACT_MECH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP_ADDRESS__DEFAULT_TIMEOUT = CONTACT_MECH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP_ADDRESS__FILE_PATH = CONTACT_MECH_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ftp Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP_ADDRESS__FTP_PASSWORD = CONTACT_MECH_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP_ADDRESS__HOSTNAME = CONTACT_MECH_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Passive Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP_ADDRESS__PASSIVE_MODE = CONTACT_MECH_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP_ADDRESS__PORT = CONTACT_MECH_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP_ADDRESS__USERNAME = CONTACT_MECH_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Zip File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP_ADDRESS__ZIP_FILE = CONTACT_MECH_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Ftp Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FTP_ADDRESS_FEATURE_COUNT = CONTACT_MECH_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.contact.impl.PartyContactMechImpl <em>Party Contact Mech</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.contact.impl.PartyContactMechImpl
	 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getPartyContactMech()
	 * @generated
	 */
	int PARTY_CONTACT_MECH = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH__CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allow Solicitation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH__ALLOW_SOLICITATION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH__COMMENTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH__EXTENSION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Months With Contact Mech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH__MONTHS_WITH_CONTACT_MECH = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH__VERIFIED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Years With Contact Mech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH__YEARS_WITH_CONTACT_MECH = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Party Contact Mech</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.contact.impl.PartyContactMechPurposeImpl <em>Party Contact Mech Purpose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.contact.impl.PartyContactMechPurposeImpl
	 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getPartyContactMechPurpose()
	 * @generated
	 */
	int PARTY_CONTACT_MECH_PURPOSE = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH_PURPOSE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH_PURPOSE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH_PURPOSE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH_PURPOSE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Contact Mech Purpose Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH_PURPOSE__CONTACT_MECH_PURPOSE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH_PURPOSE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH_PURPOSE__CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH_PURPOSE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH_PURPOSE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Party Contact Mech Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTY_CONTACT_MECH_PURPOSE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl <em>Postal Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl
	 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getPostalAddress()
	 * @generated
	 */
	int POSTAL_ADDRESS = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__CREATED_STAMP = CONTACT_MECH__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__CREATED_TX_STAMP = CONTACT_MECH__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__LAST_UPDATED_STAMP = CONTACT_MECH__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__LAST_UPDATED_TX_STAMP = CONTACT_MECH__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__CONTACT_MECH_ID = CONTACT_MECH__CONTACT_MECH_ID;

	/**
	 * The feature id for the '<em><b>Contact Mech Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__CONTACT_MECH_ATTRIBUTES = CONTACT_MECH__CONTACT_MECH_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contact Mech Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__CONTACT_MECH_TYPE_ID = CONTACT_MECH__CONTACT_MECH_TYPE_ID;

	/**
	 * The feature id for the '<em><b>From Contact Mech Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__FROM_CONTACT_MECH_LINKS = CONTACT_MECH__FROM_CONTACT_MECH_LINKS;

	/**
	 * The feature id for the '<em><b>Info String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__INFO_STRING = CONTACT_MECH__INFO_STRING;

	/**
	 * The feature id for the '<em><b>Address1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__ADDRESS1 = CONTACT_MECH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Address2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__ADDRESS2 = CONTACT_MECH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attn Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__ATTN_NAME = CONTACT_MECH_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__CITY = CONTACT_MECH_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>City Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__CITY_GEO_ID = CONTACT_MECH_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Country Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__COUNTRY_GEO_ID = CONTACT_MECH_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>County Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__COUNTY_GEO_ID = CONTACT_MECH_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Directions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__DIRECTIONS = CONTACT_MECH_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Geo Point Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__GEO_POINT_ID = CONTACT_MECH_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>House Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__HOUSE_NUMBER = CONTACT_MECH_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>House Number Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__HOUSE_NUMBER_EXT = CONTACT_MECH_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Municipality Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__MUNICIPALITY_GEO_ID = CONTACT_MECH_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Postal Address Boundaries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__POSTAL_ADDRESS_BOUNDARIES = CONTACT_MECH_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__POSTAL_CODE = CONTACT_MECH_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Postal Code Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__POSTAL_CODE_EXT = CONTACT_MECH_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Postal Code Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__POSTAL_CODE_GEO_ID = CONTACT_MECH_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>State Province Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__STATE_PROVINCE_GEO_ID = CONTACT_MECH_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>To Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS__TO_NAME = CONTACT_MECH_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Postal Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_FEATURE_COUNT = CONTACT_MECH_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressBoundaryImpl <em>Postal Address Boundary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.contact.impl.PostalAddressBoundaryImpl
	 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getPostalAddressBoundary()
	 * @generated
	 */
	int POSTAL_ADDRESS_BOUNDARY = 12;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_BOUNDARY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_BOUNDARY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_BOUNDARY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_BOUNDARY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_BOUNDARY__CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_BOUNDARY__GEO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Postal Address Boundary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTAL_ADDRESS_BOUNDARY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.contact.impl.TelecomNumberImpl <em>Telecom Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.contact.impl.TelecomNumberImpl
	 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getTelecomNumber()
	 * @generated
	 */
	int TELECOM_NUMBER = 13;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NUMBER__CREATED_STAMP = CONTACT_MECH__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NUMBER__CREATED_TX_STAMP = CONTACT_MECH__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NUMBER__LAST_UPDATED_STAMP = CONTACT_MECH__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NUMBER__LAST_UPDATED_TX_STAMP = CONTACT_MECH__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NUMBER__CONTACT_MECH_ID = CONTACT_MECH__CONTACT_MECH_ID;

	/**
	 * The feature id for the '<em><b>Contact Mech Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NUMBER__CONTACT_MECH_ATTRIBUTES = CONTACT_MECH__CONTACT_MECH_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Contact Mech Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NUMBER__CONTACT_MECH_TYPE_ID = CONTACT_MECH__CONTACT_MECH_TYPE_ID;

	/**
	 * The feature id for the '<em><b>From Contact Mech Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NUMBER__FROM_CONTACT_MECH_LINKS = CONTACT_MECH__FROM_CONTACT_MECH_LINKS;

	/**
	 * The feature id for the '<em><b>Info String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NUMBER__INFO_STRING = CONTACT_MECH__INFO_STRING;

	/**
	 * The feature id for the '<em><b>Area Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NUMBER__AREA_CODE = CONTACT_MECH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ask For Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NUMBER__ASK_FOR_NAME = CONTACT_MECH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contact Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NUMBER__CONTACT_NUMBER = CONTACT_MECH_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NUMBER__COUNTRY_CODE = CONTACT_MECH_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Telecom Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NUMBER_FEATURE_COUNT = CONTACT_MECH_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.party.contact.impl.ValidContactMechRoleImpl <em>Valid Contact Mech Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.party.contact.impl.ValidContactMechRoleImpl
	 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getValidContactMechRole()
	 * @generated
	 */
	int VALID_CONTACT_MECH_ROLE = 14;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_CONTACT_MECH_ROLE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_CONTACT_MECH_ROLE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_CONTACT_MECH_ROLE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_CONTACT_MECH_ROLE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_CONTACT_MECH_ROLE__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contact Mech Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_CONTACT_MECH_ROLE__CONTACT_MECH_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Valid Contact Mech Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_CONTACT_MECH_ROLE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.contact.ContactMech <em>Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mech</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMech
	 * @generated
	 */
	EClass getContactMech();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.ContactMech#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMech#getContactMechId()
	 * @see #getContactMech()
	 * @generated
	 */
	EAttribute getContactMech_ContactMechId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.party.contact.ContactMech#getContactMechAttributes <em>Contact Mech Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contact Mech Attributes</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMech#getContactMechAttributes()
	 * @see #getContactMech()
	 * @generated
	 */
	EReference getContactMech_ContactMechAttributes();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.contact.ContactMech#getContactMechTypeId <em>Contact Mech Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMech#getContactMechTypeId()
	 * @see #getContactMech()
	 * @generated
	 */
	EReference getContactMech_ContactMechTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.party.contact.ContactMech#getFromContactMechLinks <em>From Contact Mech Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Contact Mech Links</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMech#getFromContactMechLinks()
	 * @see #getContactMech()
	 * @generated
	 */
	EReference getContactMech_FromContactMechLinks();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.ContactMech#getInfoString <em>Info String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info String</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMech#getInfoString()
	 * @see #getContactMech()
	 * @generated
	 */
	EAttribute getContactMech_InfoString();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.contact.ContactMechAttribute <em>Mech Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mech Attribute</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMechAttribute
	 * @generated
	 */
	EClass getContactMechAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.contact.ContactMechAttribute#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMechAttribute#getContactMechId()
	 * @see #getContactMechAttribute()
	 * @generated
	 */
	EReference getContactMechAttribute_ContactMechId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.ContactMechAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMechAttribute#getAttrName()
	 * @see #getContactMechAttribute()
	 * @generated
	 */
	EAttribute getContactMechAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.ContactMechAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMechAttribute#getAttrDescription()
	 * @see #getContactMechAttribute()
	 * @generated
	 */
	EAttribute getContactMechAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.ContactMechAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMechAttribute#getAttrValue()
	 * @see #getContactMechAttribute()
	 * @generated
	 */
	EAttribute getContactMechAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.contact.ContactMechLink <em>Mech Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mech Link</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMechLink
	 * @generated
	 */
	EClass getContactMechLink();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.contact.ContactMechLink#getContactMechIdFrom <em>Contact Mech Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id From</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMechLink#getContactMechIdFrom()
	 * @see #getContactMechLink()
	 * @generated
	 */
	EReference getContactMechLink_ContactMechIdFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.contact.ContactMechLink#getContactMechIdTo <em>Contact Mech Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id To</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMechLink#getContactMechIdTo()
	 * @see #getContactMechLink()
	 * @generated
	 */
	EReference getContactMechLink_ContactMechIdTo();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.contact.ContactMechPurposeType <em>Mech Purpose Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mech Purpose Type</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMechPurposeType
	 * @generated
	 */
	EClass getContactMechPurposeType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.ContactMechPurposeType#getContactMechPurposeTypeId <em>Contact Mech Purpose Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Mech Purpose Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMechPurposeType#getContactMechPurposeTypeId()
	 * @see #getContactMechPurposeType()
	 * @generated
	 */
	EAttribute getContactMechPurposeType_ContactMechPurposeTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.ContactMechPurposeType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMechPurposeType#getDescription()
	 * @see #getContactMechPurposeType()
	 * @generated
	 */
	EAttribute getContactMechPurposeType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.contact.ContactMechType <em>Mech Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mech Type</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMechType
	 * @generated
	 */
	EClass getContactMechType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.ContactMechType#getContactMechTypeId <em>Contact Mech Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Mech Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMechType#getContactMechTypeId()
	 * @see #getContactMechType()
	 * @generated
	 */
	EAttribute getContactMechType_ContactMechTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.party.contact.ContactMechType#getContactMechTypeAttrs <em>Contact Mech Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contact Mech Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMechType#getContactMechTypeAttrs()
	 * @see #getContactMechType()
	 * @generated
	 */
	EReference getContactMechType_ContactMechTypeAttrs();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.party.contact.ContactMechType#getContactMechTypePurposes <em>Contact Mech Type Purposes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contact Mech Type Purposes</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMechType#getContactMechTypePurposes()
	 * @see #getContactMechType()
	 * @generated
	 */
	EReference getContactMechType_ContactMechTypePurposes();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.ContactMechType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMechType#getDescription()
	 * @see #getContactMechType()
	 * @generated
	 */
	EAttribute getContactMechType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.ContactMechType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMechType#isHasTable()
	 * @see #getContactMechType()
	 * @generated
	 */
	EAttribute getContactMechType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.contact.ContactMechType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMechType#getParentTypeId()
	 * @see #getContactMechType()
	 * @generated
	 */
	EReference getContactMechType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.contact.ContactMechTypeAttr <em>Mech Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mech Type Attr</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMechTypeAttr
	 * @generated
	 */
	EClass getContactMechTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.contact.ContactMechTypeAttr#getContactMechTypeId <em>Contact Mech Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMechTypeAttr#getContactMechTypeId()
	 * @see #getContactMechTypeAttr()
	 * @generated
	 */
	EReference getContactMechTypeAttr_ContactMechTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.ContactMechTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMechTypeAttr#getAttrName()
	 * @see #getContactMechTypeAttr()
	 * @generated
	 */
	EAttribute getContactMechTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.ContactMechTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMechTypeAttr#getDescription()
	 * @see #getContactMechTypeAttr()
	 * @generated
	 */
	EAttribute getContactMechTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.contact.ContactMechTypePurpose <em>Mech Type Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mech Type Purpose</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMechTypePurpose
	 * @generated
	 */
	EClass getContactMechTypePurpose();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.contact.ContactMechTypePurpose#getContactMechTypeId <em>Contact Mech Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMechTypePurpose#getContactMechTypeId()
	 * @see #getContactMechTypePurpose()
	 * @generated
	 */
	EReference getContactMechTypePurpose_ContactMechTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.contact.ContactMechTypePurpose#getContactMechPurposeTypeId <em>Contact Mech Purpose Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Purpose Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ContactMechTypePurpose#getContactMechPurposeTypeId()
	 * @see #getContactMechTypePurpose()
	 * @generated
	 */
	EReference getContactMechTypePurpose_ContactMechPurposeTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.contact.EmailAddressVerification <em>Email Address Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email Address Verification</em>'.
	 * @see org.abchip.mimo.biz.party.contact.EmailAddressVerification
	 * @generated
	 */
	EClass getEmailAddressVerification();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.EmailAddressVerification#getEmailAddress <em>Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email Address</em>'.
	 * @see org.abchip.mimo.biz.party.contact.EmailAddressVerification#getEmailAddress()
	 * @see #getEmailAddressVerification()
	 * @generated
	 */
	EAttribute getEmailAddressVerification_EmailAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.EmailAddressVerification#getExpireDate <em>Expire Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expire Date</em>'.
	 * @see org.abchip.mimo.biz.party.contact.EmailAddressVerification#getExpireDate()
	 * @see #getEmailAddressVerification()
	 * @generated
	 */
	EAttribute getEmailAddressVerification_ExpireDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.EmailAddressVerification#getVerifyHash <em>Verify Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verify Hash</em>'.
	 * @see org.abchip.mimo.biz.party.contact.EmailAddressVerification#getVerifyHash()
	 * @see #getEmailAddressVerification()
	 * @generated
	 */
	EAttribute getEmailAddressVerification_VerifyHash();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.contact.FtpAddress <em>Ftp Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ftp Address</em>'.
	 * @see org.abchip.mimo.biz.party.contact.FtpAddress
	 * @generated
	 */
	EClass getFtpAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.FtpAddress#isBinaryTransfer <em>Binary Transfer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binary Transfer</em>'.
	 * @see org.abchip.mimo.biz.party.contact.FtpAddress#isBinaryTransfer()
	 * @see #getFtpAddress()
	 * @generated
	 */
	EAttribute getFtpAddress_BinaryTransfer();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.FtpAddress#getDefaultTimeout <em>Default Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Timeout</em>'.
	 * @see org.abchip.mimo.biz.party.contact.FtpAddress#getDefaultTimeout()
	 * @see #getFtpAddress()
	 * @generated
	 */
	EAttribute getFtpAddress_DefaultTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.FtpAddress#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Path</em>'.
	 * @see org.abchip.mimo.biz.party.contact.FtpAddress#getFilePath()
	 * @see #getFtpAddress()
	 * @generated
	 */
	EAttribute getFtpAddress_FilePath();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.FtpAddress#getFtpPassword <em>Ftp Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ftp Password</em>'.
	 * @see org.abchip.mimo.biz.party.contact.FtpAddress#getFtpPassword()
	 * @see #getFtpAddress()
	 * @generated
	 */
	EAttribute getFtpAddress_FtpPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.FtpAddress#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see org.abchip.mimo.biz.party.contact.FtpAddress#getHostname()
	 * @see #getFtpAddress()
	 * @generated
	 */
	EAttribute getFtpAddress_Hostname();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.FtpAddress#isPassiveMode <em>Passive Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passive Mode</em>'.
	 * @see org.abchip.mimo.biz.party.contact.FtpAddress#isPassiveMode()
	 * @see #getFtpAddress()
	 * @generated
	 */
	EAttribute getFtpAddress_PassiveMode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.FtpAddress#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.abchip.mimo.biz.party.contact.FtpAddress#getPort()
	 * @see #getFtpAddress()
	 * @generated
	 */
	EAttribute getFtpAddress_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.FtpAddress#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.abchip.mimo.biz.party.contact.FtpAddress#getUsername()
	 * @see #getFtpAddress()
	 * @generated
	 */
	EAttribute getFtpAddress_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.FtpAddress#isZipFile <em>Zip File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip File</em>'.
	 * @see org.abchip.mimo.biz.party.contact.FtpAddress#isZipFile()
	 * @see #getFtpAddress()
	 * @generated
	 */
	EAttribute getFtpAddress_ZipFile();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.contact.PartyContactMech <em>Party Contact Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party Contact Mech</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PartyContactMech
	 * @generated
	 */
	EClass getPartyContactMech();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PartyContactMech#getPartyId()
	 * @see #getPartyContactMech()
	 * @generated
	 */
	EReference getPartyContactMech_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PartyContactMech#getContactMechId()
	 * @see #getPartyContactMech()
	 * @generated
	 */
	EReference getPartyContactMech_ContactMechId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PartyContactMech#getFromDate()
	 * @see #getPartyContactMech()
	 * @generated
	 */
	EAttribute getPartyContactMech_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.PartyContactMech#isAllowSolicitation <em>Allow Solicitation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Solicitation</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PartyContactMech#isAllowSolicitation()
	 * @see #getPartyContactMech()
	 * @generated
	 */
	EAttribute getPartyContactMech_AllowSolicitation();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PartyContactMech#getComments()
	 * @see #getPartyContactMech()
	 * @generated
	 */
	EAttribute getPartyContactMech_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PartyContactMech#getExtension()
	 * @see #getPartyContactMech()
	 * @generated
	 */
	EAttribute getPartyContactMech_Extension();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getMonthsWithContactMech <em>Months With Contact Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Months With Contact Mech</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PartyContactMech#getMonthsWithContactMech()
	 * @see #getPartyContactMech()
	 * @generated
	 */
	EAttribute getPartyContactMech_MonthsWithContactMech();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PartyContactMech#getRoleTypeId()
	 * @see #getPartyContactMech()
	 * @generated
	 */
	EReference getPartyContactMech_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PartyContactMech#getThruDate()
	 * @see #getPartyContactMech()
	 * @generated
	 */
	EAttribute getPartyContactMech_ThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.PartyContactMech#isVerified <em>Verified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verified</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PartyContactMech#isVerified()
	 * @see #getPartyContactMech()
	 * @generated
	 */
	EAttribute getPartyContactMech_Verified();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.PartyContactMech#getYearsWithContactMech <em>Years With Contact Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Years With Contact Mech</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PartyContactMech#getYearsWithContactMech()
	 * @see #getPartyContactMech()
	 * @generated
	 */
	EAttribute getPartyContactMech_YearsWithContactMech();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.contact.PartyContactMechPurpose <em>Party Contact Mech Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Party Contact Mech Purpose</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PartyContactMechPurpose
	 * @generated
	 */
	EClass getPartyContactMechPurpose();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.contact.PartyContactMechPurpose#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PartyContactMechPurpose#getPartyId()
	 * @see #getPartyContactMechPurpose()
	 * @generated
	 */
	EReference getPartyContactMechPurpose_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.contact.PartyContactMechPurpose#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PartyContactMechPurpose#getContactMechId()
	 * @see #getPartyContactMechPurpose()
	 * @generated
	 */
	EReference getPartyContactMechPurpose_ContactMechId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.contact.PartyContactMechPurpose#getContactMechPurposeTypeId <em>Contact Mech Purpose Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Purpose Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PartyContactMechPurpose#getContactMechPurposeTypeId()
	 * @see #getPartyContactMechPurpose()
	 * @generated
	 */
	EReference getPartyContactMechPurpose_ContactMechPurposeTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.PartyContactMechPurpose#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PartyContactMechPurpose#getFromDate()
	 * @see #getPartyContactMechPurpose()
	 * @generated
	 */
	EAttribute getPartyContactMechPurpose_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.PartyContactMechPurpose#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PartyContactMechPurpose#getThruDate()
	 * @see #getPartyContactMechPurpose()
	 * @generated
	 */
	EAttribute getPartyContactMechPurpose_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.contact.PostalAddress <em>Postal Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Address</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PostalAddress
	 * @generated
	 */
	EClass getPostalAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getAddress1 <em>Address1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address1</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PostalAddress#getAddress1()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_Address1();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getAddress2 <em>Address2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address2</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PostalAddress#getAddress2()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_Address2();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getAttnName <em>Attn Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attn Name</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PostalAddress#getAttnName()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_AttnName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PostalAddress#getCity()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_City();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getCityGeoId <em>City Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>City Geo Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PostalAddress#getCityGeoId()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EReference getPostalAddress_CityGeoId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getCountryGeoId <em>Country Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country Geo Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PostalAddress#getCountryGeoId()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EReference getPostalAddress_CountryGeoId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getCountyGeoId <em>County Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>County Geo Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PostalAddress#getCountyGeoId()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EReference getPostalAddress_CountyGeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getDirections <em>Directions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directions</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PostalAddress#getDirections()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_Directions();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getGeoPointId <em>Geo Point Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo Point Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PostalAddress#getGeoPointId()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EReference getPostalAddress_GeoPointId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getHouseNumber <em>House Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>House Number</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PostalAddress#getHouseNumber()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_HouseNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getHouseNumberExt <em>House Number Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>House Number Ext</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PostalAddress#getHouseNumberExt()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_HouseNumberExt();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getMunicipalityGeoId <em>Municipality Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Municipality Geo Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PostalAddress#getMunicipalityGeoId()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EReference getPostalAddress_MunicipalityGeoId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getPostalAddressBoundaries <em>Postal Address Boundaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Postal Address Boundaries</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PostalAddress#getPostalAddressBoundaries()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EReference getPostalAddress_PostalAddressBoundaries();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PostalAddress#getPostalCode()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getPostalCodeExt <em>Postal Code Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code Ext</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PostalAddress#getPostalCodeExt()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_PostalCodeExt();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getPostalCodeGeoId <em>Postal Code Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Postal Code Geo Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PostalAddress#getPostalCodeGeoId()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EReference getPostalAddress_PostalCodeGeoId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getStateProvinceGeoId <em>State Province Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State Province Geo Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PostalAddress#getStateProvinceGeoId()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EReference getPostalAddress_StateProvinceGeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.PostalAddress#getToName <em>To Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Name</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PostalAddress#getToName()
	 * @see #getPostalAddress()
	 * @generated
	 */
	EAttribute getPostalAddress_ToName();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.contact.PostalAddressBoundary <em>Postal Address Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postal Address Boundary</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PostalAddressBoundary
	 * @generated
	 */
	EClass getPostalAddressBoundary();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.contact.PostalAddressBoundary#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PostalAddressBoundary#getContactMechId()
	 * @see #getPostalAddressBoundary()
	 * @generated
	 */
	EReference getPostalAddressBoundary_ContactMechId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.contact.PostalAddressBoundary#getGeoId <em>Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.PostalAddressBoundary#getGeoId()
	 * @see #getPostalAddressBoundary()
	 * @generated
	 */
	EReference getPostalAddressBoundary_GeoId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.contact.TelecomNumber <em>Telecom Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Telecom Number</em>'.
	 * @see org.abchip.mimo.biz.party.contact.TelecomNumber
	 * @generated
	 */
	EClass getTelecomNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.TelecomNumber#getAreaCode <em>Area Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area Code</em>'.
	 * @see org.abchip.mimo.biz.party.contact.TelecomNumber#getAreaCode()
	 * @see #getTelecomNumber()
	 * @generated
	 */
	EAttribute getTelecomNumber_AreaCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.TelecomNumber#getAskForName <em>Ask For Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ask For Name</em>'.
	 * @see org.abchip.mimo.biz.party.contact.TelecomNumber#getAskForName()
	 * @see #getTelecomNumber()
	 * @generated
	 */
	EAttribute getTelecomNumber_AskForName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.TelecomNumber#getContactNumber <em>Contact Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Number</em>'.
	 * @see org.abchip.mimo.biz.party.contact.TelecomNumber#getContactNumber()
	 * @see #getTelecomNumber()
	 * @generated
	 */
	EAttribute getTelecomNumber_ContactNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.party.contact.TelecomNumber#getCountryCode <em>Country Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Code</em>'.
	 * @see org.abchip.mimo.biz.party.contact.TelecomNumber#getCountryCode()
	 * @see #getTelecomNumber()
	 * @generated
	 */
	EAttribute getTelecomNumber_CountryCode();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.party.contact.ValidContactMechRole <em>Valid Contact Mech Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Contact Mech Role</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ValidContactMechRole
	 * @generated
	 */
	EClass getValidContactMechRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.contact.ValidContactMechRole#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ValidContactMechRole#getRoleTypeId()
	 * @see #getValidContactMechRole()
	 * @generated
	 */
	EReference getValidContactMechRole_RoleTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.party.contact.ValidContactMechRole#getContactMechTypeId <em>Contact Mech Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Type Id</em>'.
	 * @see org.abchip.mimo.biz.party.contact.ValidContactMechRole#getContactMechTypeId()
	 * @see #getValidContactMechRole()
	 * @generated
	 */
	EReference getValidContactMechRole_ContactMechTypeId();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.contact.impl.ContactMechImpl <em>Mech</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.contact.impl.ContactMechImpl
		 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getContactMech()
		 * @generated
		 */
		EClass CONTACT_MECH = eINSTANCE.getContactMech();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_MECH__CONTACT_MECH_ID = eINSTANCE.getContactMech_ContactMechId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_MECH__CONTACT_MECH_ATTRIBUTES = eINSTANCE.getContactMech_ContactMechAttributes();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_MECH__CONTACT_MECH_TYPE_ID = eINSTANCE.getContactMech_ContactMechTypeId();

		/**
		 * The meta object literal for the '<em><b>From Contact Mech Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_MECH__FROM_CONTACT_MECH_LINKS = eINSTANCE.getContactMech_FromContactMechLinks();

		/**
		 * The meta object literal for the '<em><b>Info String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_MECH__INFO_STRING = eINSTANCE.getContactMech_InfoString();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.contact.impl.ContactMechAttributeImpl <em>Mech Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.contact.impl.ContactMechAttributeImpl
		 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getContactMechAttribute()
		 * @generated
		 */
		EClass CONTACT_MECH_ATTRIBUTE = eINSTANCE.getContactMechAttribute();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_MECH_ATTRIBUTE__CONTACT_MECH_ID = eINSTANCE.getContactMechAttribute_ContactMechId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_MECH_ATTRIBUTE__ATTR_NAME = eINSTANCE.getContactMechAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_MECH_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getContactMechAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_MECH_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getContactMechAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.contact.impl.ContactMechLinkImpl <em>Mech Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.contact.impl.ContactMechLinkImpl
		 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getContactMechLink()
		 * @generated
		 */
		EClass CONTACT_MECH_LINK = eINSTANCE.getContactMechLink();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_MECH_LINK__CONTACT_MECH_ID_FROM = eINSTANCE.getContactMechLink_ContactMechIdFrom();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_MECH_LINK__CONTACT_MECH_ID_TO = eINSTANCE.getContactMechLink_ContactMechIdTo();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.contact.impl.ContactMechPurposeTypeImpl <em>Mech Purpose Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.contact.impl.ContactMechPurposeTypeImpl
		 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getContactMechPurposeType()
		 * @generated
		 */
		EClass CONTACT_MECH_PURPOSE_TYPE = eINSTANCE.getContactMechPurposeType();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Purpose Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_MECH_PURPOSE_TYPE__CONTACT_MECH_PURPOSE_TYPE_ID = eINSTANCE.getContactMechPurposeType_ContactMechPurposeTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_MECH_PURPOSE_TYPE__DESCRIPTION = eINSTANCE.getContactMechPurposeType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.contact.impl.ContactMechTypeImpl <em>Mech Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.contact.impl.ContactMechTypeImpl
		 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getContactMechType()
		 * @generated
		 */
		EClass CONTACT_MECH_TYPE = eINSTANCE.getContactMechType();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_MECH_TYPE__CONTACT_MECH_TYPE_ID = eINSTANCE.getContactMechType_ContactMechTypeId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_MECH_TYPE__CONTACT_MECH_TYPE_ATTRS = eINSTANCE.getContactMechType_ContactMechTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Type Purposes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_MECH_TYPE__CONTACT_MECH_TYPE_PURPOSES = eINSTANCE.getContactMechType_ContactMechTypePurposes();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_MECH_TYPE__DESCRIPTION = eINSTANCE.getContactMechType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_MECH_TYPE__HAS_TABLE = eINSTANCE.getContactMechType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_MECH_TYPE__PARENT_TYPE_ID = eINSTANCE.getContactMechType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.contact.impl.ContactMechTypeAttrImpl <em>Mech Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.contact.impl.ContactMechTypeAttrImpl
		 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getContactMechTypeAttr()
		 * @generated
		 */
		EClass CONTACT_MECH_TYPE_ATTR = eINSTANCE.getContactMechTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_MECH_TYPE_ATTR__CONTACT_MECH_TYPE_ID = eINSTANCE.getContactMechTypeAttr_ContactMechTypeId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_MECH_TYPE_ATTR__ATTR_NAME = eINSTANCE.getContactMechTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_MECH_TYPE_ATTR__DESCRIPTION = eINSTANCE.getContactMechTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.contact.impl.ContactMechTypePurposeImpl <em>Mech Type Purpose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.contact.impl.ContactMechTypePurposeImpl
		 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getContactMechTypePurpose()
		 * @generated
		 */
		EClass CONTACT_MECH_TYPE_PURPOSE = eINSTANCE.getContactMechTypePurpose();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_MECH_TYPE_PURPOSE__CONTACT_MECH_TYPE_ID = eINSTANCE.getContactMechTypePurpose_ContactMechTypeId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Purpose Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_MECH_TYPE_PURPOSE__CONTACT_MECH_PURPOSE_TYPE_ID = eINSTANCE.getContactMechTypePurpose_ContactMechPurposeTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.contact.impl.EmailAddressVerificationImpl <em>Email Address Verification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.contact.impl.EmailAddressVerificationImpl
		 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getEmailAddressVerification()
		 * @generated
		 */
		EClass EMAIL_ADDRESS_VERIFICATION = eINSTANCE.getEmailAddressVerification();

		/**
		 * The meta object literal for the '<em><b>Email Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_ADDRESS_VERIFICATION__EMAIL_ADDRESS = eINSTANCE.getEmailAddressVerification_EmailAddress();

		/**
		 * The meta object literal for the '<em><b>Expire Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_ADDRESS_VERIFICATION__EXPIRE_DATE = eINSTANCE.getEmailAddressVerification_ExpireDate();

		/**
		 * The meta object literal for the '<em><b>Verify Hash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_ADDRESS_VERIFICATION__VERIFY_HASH = eINSTANCE.getEmailAddressVerification_VerifyHash();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.contact.impl.FtpAddressImpl <em>Ftp Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.contact.impl.FtpAddressImpl
		 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getFtpAddress()
		 * @generated
		 */
		EClass FTP_ADDRESS = eINSTANCE.getFtpAddress();

		/**
		 * The meta object literal for the '<em><b>Binary Transfer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FTP_ADDRESS__BINARY_TRANSFER = eINSTANCE.getFtpAddress_BinaryTransfer();

		/**
		 * The meta object literal for the '<em><b>Default Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FTP_ADDRESS__DEFAULT_TIMEOUT = eINSTANCE.getFtpAddress_DefaultTimeout();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FTP_ADDRESS__FILE_PATH = eINSTANCE.getFtpAddress_FilePath();

		/**
		 * The meta object literal for the '<em><b>Ftp Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FTP_ADDRESS__FTP_PASSWORD = eINSTANCE.getFtpAddress_FtpPassword();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FTP_ADDRESS__HOSTNAME = eINSTANCE.getFtpAddress_Hostname();

		/**
		 * The meta object literal for the '<em><b>Passive Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FTP_ADDRESS__PASSIVE_MODE = eINSTANCE.getFtpAddress_PassiveMode();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FTP_ADDRESS__PORT = eINSTANCE.getFtpAddress_Port();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FTP_ADDRESS__USERNAME = eINSTANCE.getFtpAddress_Username();

		/**
		 * The meta object literal for the '<em><b>Zip File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FTP_ADDRESS__ZIP_FILE = eINSTANCE.getFtpAddress_ZipFile();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.contact.impl.PartyContactMechImpl <em>Party Contact Mech</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.contact.impl.PartyContactMechImpl
		 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getPartyContactMech()
		 * @generated
		 */
		EClass PARTY_CONTACT_MECH = eINSTANCE.getPartyContactMech();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CONTACT_MECH__PARTY_ID = eINSTANCE.getPartyContactMech_PartyId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CONTACT_MECH__CONTACT_MECH_ID = eINSTANCE.getPartyContactMech_ContactMechId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CONTACT_MECH__FROM_DATE = eINSTANCE.getPartyContactMech_FromDate();

		/**
		 * The meta object literal for the '<em><b>Allow Solicitation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CONTACT_MECH__ALLOW_SOLICITATION = eINSTANCE.getPartyContactMech_AllowSolicitation();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CONTACT_MECH__COMMENTS = eINSTANCE.getPartyContactMech_Comments();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CONTACT_MECH__EXTENSION = eINSTANCE.getPartyContactMech_Extension();

		/**
		 * The meta object literal for the '<em><b>Months With Contact Mech</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CONTACT_MECH__MONTHS_WITH_CONTACT_MECH = eINSTANCE.getPartyContactMech_MonthsWithContactMech();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CONTACT_MECH__ROLE_TYPE_ID = eINSTANCE.getPartyContactMech_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CONTACT_MECH__THRU_DATE = eINSTANCE.getPartyContactMech_ThruDate();

		/**
		 * The meta object literal for the '<em><b>Verified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CONTACT_MECH__VERIFIED = eINSTANCE.getPartyContactMech_Verified();

		/**
		 * The meta object literal for the '<em><b>Years With Contact Mech</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CONTACT_MECH__YEARS_WITH_CONTACT_MECH = eINSTANCE.getPartyContactMech_YearsWithContactMech();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.contact.impl.PartyContactMechPurposeImpl <em>Party Contact Mech Purpose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.contact.impl.PartyContactMechPurposeImpl
		 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getPartyContactMechPurpose()
		 * @generated
		 */
		EClass PARTY_CONTACT_MECH_PURPOSE = eINSTANCE.getPartyContactMechPurpose();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CONTACT_MECH_PURPOSE__PARTY_ID = eINSTANCE.getPartyContactMechPurpose_PartyId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CONTACT_MECH_PURPOSE__CONTACT_MECH_ID = eINSTANCE.getPartyContactMechPurpose_ContactMechId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Purpose Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTY_CONTACT_MECH_PURPOSE__CONTACT_MECH_PURPOSE_TYPE_ID = eINSTANCE.getPartyContactMechPurpose_ContactMechPurposeTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CONTACT_MECH_PURPOSE__FROM_DATE = eINSTANCE.getPartyContactMechPurpose_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTY_CONTACT_MECH_PURPOSE__THRU_DATE = eINSTANCE.getPartyContactMechPurpose_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl <em>Postal Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.contact.impl.PostalAddressImpl
		 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getPostalAddress()
		 * @generated
		 */
		EClass POSTAL_ADDRESS = eINSTANCE.getPostalAddress();

		/**
		 * The meta object literal for the '<em><b>Address1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__ADDRESS1 = eINSTANCE.getPostalAddress_Address1();

		/**
		 * The meta object literal for the '<em><b>Address2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__ADDRESS2 = eINSTANCE.getPostalAddress_Address2();

		/**
		 * The meta object literal for the '<em><b>Attn Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__ATTN_NAME = eINSTANCE.getPostalAddress_AttnName();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__CITY = eINSTANCE.getPostalAddress_City();

		/**
		 * The meta object literal for the '<em><b>City Geo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTAL_ADDRESS__CITY_GEO_ID = eINSTANCE.getPostalAddress_CityGeoId();

		/**
		 * The meta object literal for the '<em><b>Country Geo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTAL_ADDRESS__COUNTRY_GEO_ID = eINSTANCE.getPostalAddress_CountryGeoId();

		/**
		 * The meta object literal for the '<em><b>County Geo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTAL_ADDRESS__COUNTY_GEO_ID = eINSTANCE.getPostalAddress_CountyGeoId();

		/**
		 * The meta object literal for the '<em><b>Directions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__DIRECTIONS = eINSTANCE.getPostalAddress_Directions();

		/**
		 * The meta object literal for the '<em><b>Geo Point Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTAL_ADDRESS__GEO_POINT_ID = eINSTANCE.getPostalAddress_GeoPointId();

		/**
		 * The meta object literal for the '<em><b>House Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__HOUSE_NUMBER = eINSTANCE.getPostalAddress_HouseNumber();

		/**
		 * The meta object literal for the '<em><b>House Number Ext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__HOUSE_NUMBER_EXT = eINSTANCE.getPostalAddress_HouseNumberExt();

		/**
		 * The meta object literal for the '<em><b>Municipality Geo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTAL_ADDRESS__MUNICIPALITY_GEO_ID = eINSTANCE.getPostalAddress_MunicipalityGeoId();

		/**
		 * The meta object literal for the '<em><b>Postal Address Boundaries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTAL_ADDRESS__POSTAL_ADDRESS_BOUNDARIES = eINSTANCE.getPostalAddress_PostalAddressBoundaries();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__POSTAL_CODE = eINSTANCE.getPostalAddress_PostalCode();

		/**
		 * The meta object literal for the '<em><b>Postal Code Ext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__POSTAL_CODE_EXT = eINSTANCE.getPostalAddress_PostalCodeExt();

		/**
		 * The meta object literal for the '<em><b>Postal Code Geo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTAL_ADDRESS__POSTAL_CODE_GEO_ID = eINSTANCE.getPostalAddress_PostalCodeGeoId();

		/**
		 * The meta object literal for the '<em><b>State Province Geo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTAL_ADDRESS__STATE_PROVINCE_GEO_ID = eINSTANCE.getPostalAddress_StateProvinceGeoId();

		/**
		 * The meta object literal for the '<em><b>To Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTAL_ADDRESS__TO_NAME = eINSTANCE.getPostalAddress_ToName();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.contact.impl.PostalAddressBoundaryImpl <em>Postal Address Boundary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.contact.impl.PostalAddressBoundaryImpl
		 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getPostalAddressBoundary()
		 * @generated
		 */
		EClass POSTAL_ADDRESS_BOUNDARY = eINSTANCE.getPostalAddressBoundary();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTAL_ADDRESS_BOUNDARY__CONTACT_MECH_ID = eINSTANCE.getPostalAddressBoundary_ContactMechId();

		/**
		 * The meta object literal for the '<em><b>Geo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTAL_ADDRESS_BOUNDARY__GEO_ID = eINSTANCE.getPostalAddressBoundary_GeoId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.contact.impl.TelecomNumberImpl <em>Telecom Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.contact.impl.TelecomNumberImpl
		 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getTelecomNumber()
		 * @generated
		 */
		EClass TELECOM_NUMBER = eINSTANCE.getTelecomNumber();

		/**
		 * The meta object literal for the '<em><b>Area Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELECOM_NUMBER__AREA_CODE = eINSTANCE.getTelecomNumber_AreaCode();

		/**
		 * The meta object literal for the '<em><b>Ask For Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELECOM_NUMBER__ASK_FOR_NAME = eINSTANCE.getTelecomNumber_AskForName();

		/**
		 * The meta object literal for the '<em><b>Contact Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELECOM_NUMBER__CONTACT_NUMBER = eINSTANCE.getTelecomNumber_ContactNumber();

		/**
		 * The meta object literal for the '<em><b>Country Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELECOM_NUMBER__COUNTRY_CODE = eINSTANCE.getTelecomNumber_CountryCode();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.party.contact.impl.ValidContactMechRoleImpl <em>Valid Contact Mech Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.party.contact.impl.ValidContactMechRoleImpl
		 * @see org.abchip.mimo.biz.party.contact.impl.ContactPackageImpl#getValidContactMechRole()
		 * @generated
		 */
		EClass VALID_CONTACT_MECH_ROLE = eINSTANCE.getValidContactMechRole();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALID_CONTACT_MECH_ROLE__ROLE_TYPE_ID = eINSTANCE.getValidContactMechRole_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALID_CONTACT_MECH_ROLE__CONTACT_MECH_TYPE_ID = eINSTANCE.getValidContactMechRole_ContactMechTypeId();

	}

} //ContactPackage
