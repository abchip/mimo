/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.request;

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
 * @see org.abchip.mimo.biz.order.request.RequestFactory
 * @model kind="package"
 * @generated
 */
public interface RequestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "request";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/order/request";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-request";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequestPackage eINSTANCE = org.abchip.mimo.biz.order.request.impl.RequestPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl <em>Cust Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.request.impl.CustRequestImpl
	 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequest()
	 * @generated
	 */
	int CUST_REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Cust Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__CUST_REQUEST_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Closed Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__CLOSED_DATE_TIME = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__CREATED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__CREATED_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cust Request Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__CUST_REQUEST_ATTRIBUTES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cust Request Category Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__CUST_REQUEST_CATEGORY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cust Request Comm Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__CUST_REQUEST_COMM_EVENTS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Cust Request Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__CUST_REQUEST_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Cust Request Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__CUST_REQUEST_ITEMS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Cust Request Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__CUST_REQUEST_NAME = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Cust Request Notes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__CUST_REQUEST_NOTES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Cust Request Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__CUST_REQUEST_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Cust Request Work Efforts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__CUST_REQUEST_WORK_EFFORTS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>From Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__FROM_PARTY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Fulfill Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__FULFILL_CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Internal Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__INTERNAL_COMMENT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__LAST_MODIFIED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__LAST_MODIFIED_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Maximum Amount Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__MAXIMUM_AMOUNT_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Open Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__OPEN_DATE_TIME = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__PRIORITY = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__REASON = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Response Required Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__RESPONSE_REQUIRED_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Sales Channel Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__SALES_CHANNEL_ENUM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST__STATUS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 27;

	/**
	 * The number of structural features of the '<em>Cust Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 28;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestAttributeImpl <em>Cust Request Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.request.impl.CustRequestAttributeImpl
	 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestAttribute()
	 * @generated
	 */
	int CUST_REQUEST_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ATTRIBUTE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ATTRIBUTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ATTRIBUTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ATTRIBUTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Cust Request Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ATTRIBUTE__CUST_REQUEST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ATTRIBUTE__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ATTRIBUTE__ATTR_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ATTRIBUTE__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cust Request Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ATTRIBUTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestCategoryImpl <em>Cust Request Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.request.impl.CustRequestCategoryImpl
	 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestCategory()
	 * @generated
	 */
	int CUST_REQUEST_CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_CATEGORY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_CATEGORY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_CATEGORY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_CATEGORY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Cust Request Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_CATEGORY__CUST_REQUEST_CATEGORY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cust Request Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_CATEGORY__CUST_REQUEST_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_CATEGORY__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cust Request Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_CATEGORY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestCommEventImpl <em>Cust Request Comm Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.request.impl.CustRequestCommEventImpl
	 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestCommEvent()
	 * @generated
	 */
	int CUST_REQUEST_COMM_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_COMM_EVENT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_COMM_EVENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_COMM_EVENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_COMM_EVENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Cust Request Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_COMM_EVENT__CUST_REQUEST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Communication Event Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_COMM_EVENT__COMMUNICATION_EVENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cust Request Comm Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_COMM_EVENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestContentImpl <em>Cust Request Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.request.impl.CustRequestContentImpl
	 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestContent()
	 * @generated
	 */
	int CUST_REQUEST_CONTENT = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_CONTENT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_CONTENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_CONTENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_CONTENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Cust Request Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_CONTENT__CUST_REQUEST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_CONTENT__CONTENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_CONTENT__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_CONTENT__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cust Request Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_CONTENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestItemImpl <em>Cust Request Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.request.impl.CustRequestItemImpl
	 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestItem()
	 * @generated
	 */
	int CUST_REQUEST_ITEM = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Cust Request Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM__CUST_REQUEST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cust Request Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM__CUST_REQUEST_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM__CONFIG_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cust Request Resolution Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM__CUST_REQUEST_RESOLUTION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Maximum Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM__MAXIMUM_AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM__PRIORITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM__QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Required By Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM__REQUIRED_BY_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Reserv Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM__RESERV_LENGTH = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Reserv Persons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM__RESERV_PERSONS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Reserv Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM__RESERV_START = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Selected Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM__SELECTED_AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Story</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM__STORY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Cust Request Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestItemNoteImpl <em>Cust Request Item Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.request.impl.CustRequestItemNoteImpl
	 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestItemNote()
	 * @generated
	 */
	int CUST_REQUEST_ITEM_NOTE = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM_NOTE__CREATED_STAMP = BizPackage.BIZ_ENTITY_NOTE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM_NOTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_NOTE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM_NOTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_NOTE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM_NOTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_NOTE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Note Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM_NOTE__NOTE_ID = BizPackage.BIZ_ENTITY_NOTE__NOTE_ID;

	/**
	 * The feature id for the '<em><b>Cust Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM_NOTE__CUST_REQUEST_ID = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cust Request Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM_NOTE__CUST_REQUEST_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cust Request Item Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM_NOTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestItemWorkEffortImpl <em>Cust Request Item Work Effort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.request.impl.CustRequestItemWorkEffortImpl
	 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestItemWorkEffort()
	 * @generated
	 */
	int CUST_REQUEST_ITEM_WORK_EFFORT = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM_WORK_EFFORT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM_WORK_EFFORT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM_WORK_EFFORT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM_WORK_EFFORT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Cust Request Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM_WORK_EFFORT__CUST_REQUEST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM_WORK_EFFORT__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cust Request Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM_WORK_EFFORT__CUST_REQUEST_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cust Request Item Work Effort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_ITEM_WORK_EFFORT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestNoteImpl <em>Cust Request Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.request.impl.CustRequestNoteImpl
	 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestNote()
	 * @generated
	 */
	int CUST_REQUEST_NOTE = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_NOTE__CREATED_STAMP = BizPackage.BIZ_ENTITY_NOTE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_NOTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_NOTE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_NOTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_NOTE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_NOTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_NOTE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Note Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_NOTE__NOTE_ID = BizPackage.BIZ_ENTITY_NOTE__NOTE_ID;

	/**
	 * The feature id for the '<em><b>Cust Request Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_NOTE__CUST_REQUEST_ID = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cust Request Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_NOTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestPartyImpl <em>Cust Request Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.request.impl.CustRequestPartyImpl
	 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestParty()
	 * @generated
	 */
	int CUST_REQUEST_PARTY = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_PARTY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_PARTY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_PARTY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_PARTY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Cust Request Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_PARTY__CUST_REQUEST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_PARTY__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_PARTY__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_PARTY__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_PARTY__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Cust Request Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_PARTY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestResolutionImpl <em>Cust Request Resolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.request.impl.CustRequestResolutionImpl
	 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestResolution()
	 * @generated
	 */
	int CUST_REQUEST_RESOLUTION = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_RESOLUTION__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_RESOLUTION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_RESOLUTION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_RESOLUTION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Cust Request Resolution Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_RESOLUTION__CUST_REQUEST_RESOLUTION_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cust Request Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_RESOLUTION__CUST_REQUEST_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_RESOLUTION__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cust Request Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_RESOLUTION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestStatusImpl <em>Cust Request Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.request.impl.CustRequestStatusImpl
	 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestStatus()
	 * @generated
	 */
	int CUST_REQUEST_STATUS = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_STATUS__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_STATUS__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_STATUS__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_STATUS__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Cust Request Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_STATUS__CUST_REQUEST_STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Change By User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_STATUS__CHANGE_BY_USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cust Request Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_STATUS__CUST_REQUEST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cust Request Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_STATUS__CUST_REQUEST_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_STATUS__STATUS_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_STATUS__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Cust Request Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_STATUS_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestTypeImpl <em>Cust Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.request.impl.CustRequestTypeImpl
	 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestType()
	 * @generated
	 */
	int CUST_REQUEST_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Cust Request Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_TYPE__CUST_REQUEST_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cust Request Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_TYPE__CUST_REQUEST_TYPE_ATTRS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_TYPE__PARTY_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Cust Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestTypeAttrImpl <em>Cust Request Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.request.impl.CustRequestTypeAttrImpl
	 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestTypeAttr()
	 * @generated
	 */
	int CUST_REQUEST_TYPE_ATTR = 13;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_TYPE_ATTR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_TYPE_ATTR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_TYPE_ATTR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_TYPE_ATTR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Cust Request Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_TYPE_ATTR__CUST_REQUEST_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_TYPE_ATTR__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_TYPE_ATTR__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cust Request Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_TYPE_ATTR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestWorkEffortImpl <em>Cust Request Work Effort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.request.impl.CustRequestWorkEffortImpl
	 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestWorkEffort()
	 * @generated
	 */
	int CUST_REQUEST_WORK_EFFORT = 14;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_WORK_EFFORT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_WORK_EFFORT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_WORK_EFFORT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_WORK_EFFORT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Cust Request Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_WORK_EFFORT__CUST_REQUEST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_WORK_EFFORT__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cust Request Work Effort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUST_REQUEST_WORK_EFFORT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.request.impl.RespondingPartyImpl <em>Responding Party</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.request.impl.RespondingPartyImpl
	 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getRespondingParty()
	 * @generated
	 */
	int RESPONDING_PARTY = 15;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_PARTY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_PARTY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_PARTY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_PARTY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Cust Request Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_PARTY__CUST_REQUEST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_PARTY__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Responding Party Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_PARTY__RESPONDING_PARTY_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_PARTY__CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Date Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_PARTY__DATE_SENT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Responding Party</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONDING_PARTY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.request.CustRequest <em>Cust Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cust Request</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest
	 * @generated
	 */
	EClass getCustRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestId <em>Cust Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cust Request Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getCustRequestId()
	 * @see #getCustRequest()
	 * @generated
	 */
	EAttribute getCustRequest_CustRequestId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequest#getClosedDateTime <em>Closed Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closed Date Time</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getClosedDateTime()
	 * @see #getCustRequest()
	 * @generated
	 */
	EAttribute getCustRequest_ClosedDateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequest#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getCreatedByUserLogin()
	 * @see #getCustRequest()
	 * @generated
	 */
	EAttribute getCustRequest_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequest#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getCreatedDate()
	 * @see #getCustRequest()
	 * @generated
	 */
	EAttribute getCustRequest_CreatedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequest#getCurrencyUomId <em>Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getCurrencyUomId()
	 * @see #getCustRequest()
	 * @generated
	 */
	EReference getCustRequest_CurrencyUomId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestAttributes <em>Cust Request Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cust Request Attributes</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getCustRequestAttributes()
	 * @see #getCustRequest()
	 * @generated
	 */
	EReference getCustRequest_CustRequestAttributes();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestCategoryId <em>Cust Request Category Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cust Request Category Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getCustRequestCategoryId()
	 * @see #getCustRequest()
	 * @generated
	 */
	EReference getCustRequest_CustRequestCategoryId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestCommEvents <em>Cust Request Comm Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cust Request Comm Events</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getCustRequestCommEvents()
	 * @see #getCustRequest()
	 * @generated
	 */
	EReference getCustRequest_CustRequestCommEvents();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestDate <em>Cust Request Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cust Request Date</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getCustRequestDate()
	 * @see #getCustRequest()
	 * @generated
	 */
	EAttribute getCustRequest_CustRequestDate();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestItems <em>Cust Request Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cust Request Items</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getCustRequestItems()
	 * @see #getCustRequest()
	 * @generated
	 */
	EReference getCustRequest_CustRequestItems();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestName <em>Cust Request Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cust Request Name</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getCustRequestName()
	 * @see #getCustRequest()
	 * @generated
	 */
	EAttribute getCustRequest_CustRequestName();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestNotes <em>Cust Request Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cust Request Notes</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getCustRequestNotes()
	 * @see #getCustRequest()
	 * @generated
	 */
	EReference getCustRequest_CustRequestNotes();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestTypeId <em>Cust Request Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cust Request Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getCustRequestTypeId()
	 * @see #getCustRequest()
	 * @generated
	 */
	EReference getCustRequest_CustRequestTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestWorkEfforts <em>Cust Request Work Efforts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cust Request Work Efforts</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getCustRequestWorkEfforts()
	 * @see #getCustRequest()
	 * @generated
	 */
	EReference getCustRequest_CustRequestWorkEfforts();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequest#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getDescription()
	 * @see #getCustRequest()
	 * @generated
	 */
	EAttribute getCustRequest_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequest#getFromPartyId <em>From Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Party Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getFromPartyId()
	 * @see #getCustRequest()
	 * @generated
	 */
	EReference getCustRequest_FromPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequest#getFulfillContactMechId <em>Fulfill Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fulfill Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getFulfillContactMechId()
	 * @see #getCustRequest()
	 * @generated
	 */
	EReference getCustRequest_FulfillContactMechId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequest#getInternalComment <em>Internal Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Comment</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getInternalComment()
	 * @see #getCustRequest()
	 * @generated
	 */
	EAttribute getCustRequest_InternalComment();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequest#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getLastModifiedByUserLogin()
	 * @see #getCustRequest()
	 * @generated
	 */
	EAttribute getCustRequest_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequest#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getLastModifiedDate()
	 * @see #getCustRequest()
	 * @generated
	 */
	EAttribute getCustRequest_LastModifiedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequest#getMaximumAmountUomId <em>Maximum Amount Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maximum Amount Uom Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getMaximumAmountUomId()
	 * @see #getCustRequest()
	 * @generated
	 */
	EReference getCustRequest_MaximumAmountUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequest#getOpenDateTime <em>Open Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open Date Time</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getOpenDateTime()
	 * @see #getCustRequest()
	 * @generated
	 */
	EAttribute getCustRequest_OpenDateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequest#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getPriority()
	 * @see #getCustRequest()
	 * @generated
	 */
	EAttribute getCustRequest_Priority();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequest#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getProductStoreId()
	 * @see #getCustRequest()
	 * @generated
	 */
	EReference getCustRequest_ProductStoreId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequest#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getReason()
	 * @see #getCustRequest()
	 * @generated
	 */
	EAttribute getCustRequest_Reason();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequest#getResponseRequiredDate <em>Response Required Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Required Date</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getResponseRequiredDate()
	 * @see #getCustRequest()
	 * @generated
	 */
	EAttribute getCustRequest_ResponseRequiredDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequest#getSalesChannelEnumId <em>Sales Channel Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Channel Enum Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getSalesChannelEnumId()
	 * @see #getCustRequest()
	 * @generated
	 */
	EReference getCustRequest_SalesChannelEnumId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequest#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequest#getStatusId()
	 * @see #getCustRequest()
	 * @generated
	 */
	EReference getCustRequest_StatusId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.request.CustRequestAttribute <em>Cust Request Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cust Request Attribute</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestAttribute
	 * @generated
	 */
	EClass getCustRequestAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequestAttribute#getCustRequestId <em>Cust Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cust Request Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestAttribute#getCustRequestId()
	 * @see #getCustRequestAttribute()
	 * @generated
	 */
	EReference getCustRequestAttribute_CustRequestId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestAttribute#getAttrName()
	 * @see #getCustRequestAttribute()
	 * @generated
	 */
	EAttribute getCustRequestAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestAttribute#getAttrDescription()
	 * @see #getCustRequestAttribute()
	 * @generated
	 */
	EAttribute getCustRequestAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestAttribute#getAttrValue()
	 * @see #getCustRequestAttribute()
	 * @generated
	 */
	EAttribute getCustRequestAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.request.CustRequestCategory <em>Cust Request Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cust Request Category</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestCategory
	 * @generated
	 */
	EClass getCustRequestCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestCategory#getCustRequestCategoryId <em>Cust Request Category Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cust Request Category Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestCategory#getCustRequestCategoryId()
	 * @see #getCustRequestCategory()
	 * @generated
	 */
	EAttribute getCustRequestCategory_CustRequestCategoryId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequestCategory#getCustRequestTypeId <em>Cust Request Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cust Request Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestCategory#getCustRequestTypeId()
	 * @see #getCustRequestCategory()
	 * @generated
	 */
	EReference getCustRequestCategory_CustRequestTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestCategory#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestCategory#getDescription()
	 * @see #getCustRequestCategory()
	 * @generated
	 */
	EAttribute getCustRequestCategory_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.request.CustRequestCommEvent <em>Cust Request Comm Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cust Request Comm Event</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestCommEvent
	 * @generated
	 */
	EClass getCustRequestCommEvent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequestCommEvent#getCustRequestId <em>Cust Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cust Request Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestCommEvent#getCustRequestId()
	 * @see #getCustRequestCommEvent()
	 * @generated
	 */
	EReference getCustRequestCommEvent_CustRequestId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequestCommEvent#getCommunicationEventId <em>Communication Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Event Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestCommEvent#getCommunicationEventId()
	 * @see #getCustRequestCommEvent()
	 * @generated
	 */
	EReference getCustRequestCommEvent_CommunicationEventId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.request.CustRequestContent <em>Cust Request Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cust Request Content</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestContent
	 * @generated
	 */
	EClass getCustRequestContent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequestContent#getCustRequestId <em>Cust Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cust Request Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestContent#getCustRequestId()
	 * @see #getCustRequestContent()
	 * @generated
	 */
	EReference getCustRequestContent_CustRequestId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequestContent#getContentId <em>Content Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestContent#getContentId()
	 * @see #getCustRequestContent()
	 * @generated
	 */
	EReference getCustRequestContent_ContentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestContent#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestContent#getFromDate()
	 * @see #getCustRequestContent()
	 * @generated
	 */
	EAttribute getCustRequestContent_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestContent#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestContent#getThruDate()
	 * @see #getCustRequestContent()
	 * @generated
	 */
	EAttribute getCustRequestContent_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.request.CustRequestItem <em>Cust Request Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cust Request Item</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestItem
	 * @generated
	 */
	EClass getCustRequestItem();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequestItem#getCustRequestId <em>Cust Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cust Request Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestItem#getCustRequestId()
	 * @see #getCustRequestItem()
	 * @generated
	 */
	EReference getCustRequestItem_CustRequestId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestItem#getCustRequestItemSeqId <em>Cust Request Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cust Request Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestItem#getCustRequestItemSeqId()
	 * @see #getCustRequestItem()
	 * @generated
	 */
	EAttribute getCustRequestItem_CustRequestItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestItem#getConfigId <em>Config Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestItem#getConfigId()
	 * @see #getCustRequestItem()
	 * @generated
	 */
	EAttribute getCustRequestItem_ConfigId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequestItem#getCustRequestResolutionId <em>Cust Request Resolution Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cust Request Resolution Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestItem#getCustRequestResolutionId()
	 * @see #getCustRequestItem()
	 * @generated
	 */
	EReference getCustRequestItem_CustRequestResolutionId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestItem#getDescription()
	 * @see #getCustRequestItem()
	 * @generated
	 */
	EAttribute getCustRequestItem_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestItem#getMaximumAmount <em>Maximum Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Amount</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestItem#getMaximumAmount()
	 * @see #getCustRequestItem()
	 * @generated
	 */
	EAttribute getCustRequestItem_MaximumAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestItem#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestItem#getPriority()
	 * @see #getCustRequestItem()
	 * @generated
	 */
	EAttribute getCustRequestItem_Priority();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequestItem#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestItem#getProductId()
	 * @see #getCustRequestItem()
	 * @generated
	 */
	EReference getCustRequestItem_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestItem#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestItem#getQuantity()
	 * @see #getCustRequestItem()
	 * @generated
	 */
	EAttribute getCustRequestItem_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestItem#getRequiredByDate <em>Required By Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required By Date</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestItem#getRequiredByDate()
	 * @see #getCustRequestItem()
	 * @generated
	 */
	EAttribute getCustRequestItem_RequiredByDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestItem#getReservLength <em>Reserv Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv Length</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestItem#getReservLength()
	 * @see #getCustRequestItem()
	 * @generated
	 */
	EAttribute getCustRequestItem_ReservLength();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestItem#getReservPersons <em>Reserv Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv Persons</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestItem#getReservPersons()
	 * @see #getCustRequestItem()
	 * @generated
	 */
	EAttribute getCustRequestItem_ReservPersons();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestItem#getReservStart <em>Reserv Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv Start</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestItem#getReservStart()
	 * @see #getCustRequestItem()
	 * @generated
	 */
	EAttribute getCustRequestItem_ReservStart();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestItem#getSelectedAmount <em>Selected Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected Amount</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestItem#getSelectedAmount()
	 * @see #getCustRequestItem()
	 * @generated
	 */
	EAttribute getCustRequestItem_SelectedAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestItem#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestItem#getSequenceNum()
	 * @see #getCustRequestItem()
	 * @generated
	 */
	EAttribute getCustRequestItem_SequenceNum();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequestItem#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestItem#getStatusId()
	 * @see #getCustRequestItem()
	 * @generated
	 */
	EReference getCustRequestItem_StatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestItem#getStory <em>Story</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Story</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestItem#getStory()
	 * @see #getCustRequestItem()
	 * @generated
	 */
	EAttribute getCustRequestItem_Story();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.request.CustRequestItemNote <em>Cust Request Item Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cust Request Item Note</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestItemNote
	 * @generated
	 */
	EClass getCustRequestItemNote();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestItemNote#getCustRequestId <em>Cust Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cust Request Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestItemNote#getCustRequestId()
	 * @see #getCustRequestItemNote()
	 * @generated
	 */
	EAttribute getCustRequestItemNote_CustRequestId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestItemNote#getCustRequestItemSeqId <em>Cust Request Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cust Request Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestItemNote#getCustRequestItemSeqId()
	 * @see #getCustRequestItemNote()
	 * @generated
	 */
	EAttribute getCustRequestItemNote_CustRequestItemSeqId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.request.CustRequestItemWorkEffort <em>Cust Request Item Work Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cust Request Item Work Effort</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestItemWorkEffort
	 * @generated
	 */
	EClass getCustRequestItemWorkEffort();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequestItemWorkEffort#getCustRequestId <em>Cust Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cust Request Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestItemWorkEffort#getCustRequestId()
	 * @see #getCustRequestItemWorkEffort()
	 * @generated
	 */
	EReference getCustRequestItemWorkEffort_CustRequestId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestItemWorkEffort#getCustRequestItemSeqId <em>Cust Request Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cust Request Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestItemWorkEffort#getCustRequestItemSeqId()
	 * @see #getCustRequestItemWorkEffort()
	 * @generated
	 */
	EAttribute getCustRequestItemWorkEffort_CustRequestItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequestItemWorkEffort#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestItemWorkEffort#getWorkEffortId()
	 * @see #getCustRequestItemWorkEffort()
	 * @generated
	 */
	EReference getCustRequestItemWorkEffort_WorkEffortId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.request.CustRequestNote <em>Cust Request Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cust Request Note</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestNote
	 * @generated
	 */
	EClass getCustRequestNote();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequestNote#getCustRequestId <em>Cust Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cust Request Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestNote#getCustRequestId()
	 * @see #getCustRequestNote()
	 * @generated
	 */
	EReference getCustRequestNote_CustRequestId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.request.CustRequestParty <em>Cust Request Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cust Request Party</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestParty
	 * @generated
	 */
	EClass getCustRequestParty();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequestParty#getCustRequestId <em>Cust Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cust Request Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestParty#getCustRequestId()
	 * @see #getCustRequestParty()
	 * @generated
	 */
	EReference getCustRequestParty_CustRequestId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequestParty#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestParty#getPartyId()
	 * @see #getCustRequestParty()
	 * @generated
	 */
	EReference getCustRequestParty_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequestParty#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestParty#getRoleTypeId()
	 * @see #getCustRequestParty()
	 * @generated
	 */
	EReference getCustRequestParty_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestParty#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestParty#getFromDate()
	 * @see #getCustRequestParty()
	 * @generated
	 */
	EAttribute getCustRequestParty_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestParty#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestParty#getThruDate()
	 * @see #getCustRequestParty()
	 * @generated
	 */
	EAttribute getCustRequestParty_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.request.CustRequestResolution <em>Cust Request Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cust Request Resolution</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestResolution
	 * @generated
	 */
	EClass getCustRequestResolution();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestResolution#getCustRequestResolutionId <em>Cust Request Resolution Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cust Request Resolution Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestResolution#getCustRequestResolutionId()
	 * @see #getCustRequestResolution()
	 * @generated
	 */
	EAttribute getCustRequestResolution_CustRequestResolutionId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequestResolution#getCustRequestTypeId <em>Cust Request Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cust Request Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestResolution#getCustRequestTypeId()
	 * @see #getCustRequestResolution()
	 * @generated
	 */
	EReference getCustRequestResolution_CustRequestTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestResolution#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestResolution#getDescription()
	 * @see #getCustRequestResolution()
	 * @generated
	 */
	EAttribute getCustRequestResolution_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.request.CustRequestStatus <em>Cust Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cust Request Status</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestStatus
	 * @generated
	 */
	EClass getCustRequestStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestStatus#getCustRequestStatusId <em>Cust Request Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cust Request Status Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestStatus#getCustRequestStatusId()
	 * @see #getCustRequestStatus()
	 * @generated
	 */
	EAttribute getCustRequestStatus_CustRequestStatusId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequestStatus#getChangeByUserLoginId <em>Change By User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change By User Login Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestStatus#getChangeByUserLoginId()
	 * @see #getCustRequestStatus()
	 * @generated
	 */
	EReference getCustRequestStatus_ChangeByUserLoginId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequestStatus#getCustRequestId <em>Cust Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cust Request Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestStatus#getCustRequestId()
	 * @see #getCustRequestStatus()
	 * @generated
	 */
	EReference getCustRequestStatus_CustRequestId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestStatus#getCustRequestItemSeqId <em>Cust Request Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cust Request Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestStatus#getCustRequestItemSeqId()
	 * @see #getCustRequestStatus()
	 * @generated
	 */
	EAttribute getCustRequestStatus_CustRequestItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestStatus#getStatusDate <em>Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Date</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestStatus#getStatusDate()
	 * @see #getCustRequestStatus()
	 * @generated
	 */
	EAttribute getCustRequestStatus_StatusDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequestStatus#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestStatus#getStatusId()
	 * @see #getCustRequestStatus()
	 * @generated
	 */
	EReference getCustRequestStatus_StatusId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.request.CustRequestType <em>Cust Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cust Request Type</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestType
	 * @generated
	 */
	EClass getCustRequestType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestType#getCustRequestTypeId <em>Cust Request Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cust Request Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestType#getCustRequestTypeId()
	 * @see #getCustRequestType()
	 * @generated
	 */
	EAttribute getCustRequestType_CustRequestTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.order.request.CustRequestType#getCustRequestTypeAttrs <em>Cust Request Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cust Request Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestType#getCustRequestTypeAttrs()
	 * @see #getCustRequestType()
	 * @generated
	 */
	EReference getCustRequestType_CustRequestTypeAttrs();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestType#getDescription()
	 * @see #getCustRequestType()
	 * @generated
	 */
	EAttribute getCustRequestType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestType#isHasTable()
	 * @see #getCustRequestType()
	 * @generated
	 */
	EAttribute getCustRequestType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequestType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestType#getParentTypeId()
	 * @see #getCustRequestType()
	 * @generated
	 */
	EReference getCustRequestType_ParentTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequestType#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestType#getPartyId()
	 * @see #getCustRequestType()
	 * @generated
	 */
	EReference getCustRequestType_PartyId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.request.CustRequestTypeAttr <em>Cust Request Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cust Request Type Attr</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestTypeAttr
	 * @generated
	 */
	EClass getCustRequestTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequestTypeAttr#getCustRequestTypeId <em>Cust Request Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cust Request Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestTypeAttr#getCustRequestTypeId()
	 * @see #getCustRequestTypeAttr()
	 * @generated
	 */
	EReference getCustRequestTypeAttr_CustRequestTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestTypeAttr#getAttrName()
	 * @see #getCustRequestTypeAttr()
	 * @generated
	 */
	EAttribute getCustRequestTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.CustRequestTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestTypeAttr#getDescription()
	 * @see #getCustRequestTypeAttr()
	 * @generated
	 */
	EAttribute getCustRequestTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.request.CustRequestWorkEffort <em>Cust Request Work Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cust Request Work Effort</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestWorkEffort
	 * @generated
	 */
	EClass getCustRequestWorkEffort();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequestWorkEffort#getCustRequestId <em>Cust Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cust Request Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestWorkEffort#getCustRequestId()
	 * @see #getCustRequestWorkEffort()
	 * @generated
	 */
	EReference getCustRequestWorkEffort_CustRequestId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.CustRequestWorkEffort#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.CustRequestWorkEffort#getWorkEffortId()
	 * @see #getCustRequestWorkEffort()
	 * @generated
	 */
	EReference getCustRequestWorkEffort_WorkEffortId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.request.RespondingParty <em>Responding Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responding Party</em>'.
	 * @see org.abchip.mimo.biz.order.request.RespondingParty
	 * @generated
	 */
	EClass getRespondingParty();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.RespondingParty#getRespondingPartySeqId <em>Responding Party Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Responding Party Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.RespondingParty#getRespondingPartySeqId()
	 * @see #getRespondingParty()
	 * @generated
	 */
	EAttribute getRespondingParty_RespondingPartySeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.RespondingParty#getCustRequestId <em>Cust Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cust Request Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.RespondingParty#getCustRequestId()
	 * @see #getRespondingParty()
	 * @generated
	 */
	EReference getRespondingParty_CustRequestId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.RespondingParty#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.RespondingParty#getPartyId()
	 * @see #getRespondingParty()
	 * @generated
	 */
	EReference getRespondingParty_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.request.RespondingParty#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.order.request.RespondingParty#getContactMechId()
	 * @see #getRespondingParty()
	 * @generated
	 */
	EReference getRespondingParty_ContactMechId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.request.RespondingParty#getDateSent <em>Date Sent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Sent</em>'.
	 * @see org.abchip.mimo.biz.order.request.RespondingParty#getDateSent()
	 * @see #getRespondingParty()
	 * @generated
	 */
	EAttribute getRespondingParty_DateSent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequestFactory getRequestFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl <em>Cust Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.request.impl.CustRequestImpl
		 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequest()
		 * @generated
		 */
		EClass CUST_REQUEST = eINSTANCE.getCustRequest();

		/**
		 * The meta object literal for the '<em><b>Cust Request Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST__CUST_REQUEST_ID = eINSTANCE.getCustRequest_CustRequestId();

		/**
		 * The meta object literal for the '<em><b>Closed Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST__CLOSED_DATE_TIME = eINSTANCE.getCustRequest_ClosedDateTime();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST__CREATED_BY_USER_LOGIN = eINSTANCE.getCustRequest_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST__CREATED_DATE = eINSTANCE.getCustRequest_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST__CURRENCY_UOM_ID = eINSTANCE.getCustRequest_CurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Cust Request Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST__CUST_REQUEST_ATTRIBUTES = eINSTANCE.getCustRequest_CustRequestAttributes();

		/**
		 * The meta object literal for the '<em><b>Cust Request Category Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST__CUST_REQUEST_CATEGORY_ID = eINSTANCE.getCustRequest_CustRequestCategoryId();

		/**
		 * The meta object literal for the '<em><b>Cust Request Comm Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST__CUST_REQUEST_COMM_EVENTS = eINSTANCE.getCustRequest_CustRequestCommEvents();

		/**
		 * The meta object literal for the '<em><b>Cust Request Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST__CUST_REQUEST_DATE = eINSTANCE.getCustRequest_CustRequestDate();

		/**
		 * The meta object literal for the '<em><b>Cust Request Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST__CUST_REQUEST_ITEMS = eINSTANCE.getCustRequest_CustRequestItems();

		/**
		 * The meta object literal for the '<em><b>Cust Request Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST__CUST_REQUEST_NAME = eINSTANCE.getCustRequest_CustRequestName();

		/**
		 * The meta object literal for the '<em><b>Cust Request Notes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST__CUST_REQUEST_NOTES = eINSTANCE.getCustRequest_CustRequestNotes();

		/**
		 * The meta object literal for the '<em><b>Cust Request Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST__CUST_REQUEST_TYPE_ID = eINSTANCE.getCustRequest_CustRequestTypeId();

		/**
		 * The meta object literal for the '<em><b>Cust Request Work Efforts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST__CUST_REQUEST_WORK_EFFORTS = eINSTANCE.getCustRequest_CustRequestWorkEfforts();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST__DESCRIPTION = eINSTANCE.getCustRequest_Description();

		/**
		 * The meta object literal for the '<em><b>From Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST__FROM_PARTY_ID = eINSTANCE.getCustRequest_FromPartyId();

		/**
		 * The meta object literal for the '<em><b>Fulfill Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST__FULFILL_CONTACT_MECH_ID = eINSTANCE.getCustRequest_FulfillContactMechId();

		/**
		 * The meta object literal for the '<em><b>Internal Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST__INTERNAL_COMMENT = eINSTANCE.getCustRequest_InternalComment();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getCustRequest_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST__LAST_MODIFIED_DATE = eINSTANCE.getCustRequest_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Maximum Amount Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST__MAXIMUM_AMOUNT_UOM_ID = eINSTANCE.getCustRequest_MaximumAmountUomId();

		/**
		 * The meta object literal for the '<em><b>Open Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST__OPEN_DATE_TIME = eINSTANCE.getCustRequest_OpenDateTime();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST__PRIORITY = eINSTANCE.getCustRequest_Priority();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST__PRODUCT_STORE_ID = eINSTANCE.getCustRequest_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST__REASON = eINSTANCE.getCustRequest_Reason();

		/**
		 * The meta object literal for the '<em><b>Response Required Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST__RESPONSE_REQUIRED_DATE = eINSTANCE.getCustRequest_ResponseRequiredDate();

		/**
		 * The meta object literal for the '<em><b>Sales Channel Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST__SALES_CHANNEL_ENUM_ID = eINSTANCE.getCustRequest_SalesChannelEnumId();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST__STATUS_ID = eINSTANCE.getCustRequest_StatusId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestAttributeImpl <em>Cust Request Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.request.impl.CustRequestAttributeImpl
		 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestAttribute()
		 * @generated
		 */
		EClass CUST_REQUEST_ATTRIBUTE = eINSTANCE.getCustRequestAttribute();

		/**
		 * The meta object literal for the '<em><b>Cust Request Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_ATTRIBUTE__CUST_REQUEST_ID = eINSTANCE.getCustRequestAttribute_CustRequestId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_ATTRIBUTE__ATTR_NAME = eINSTANCE.getCustRequestAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getCustRequestAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getCustRequestAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestCategoryImpl <em>Cust Request Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.request.impl.CustRequestCategoryImpl
		 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestCategory()
		 * @generated
		 */
		EClass CUST_REQUEST_CATEGORY = eINSTANCE.getCustRequestCategory();

		/**
		 * The meta object literal for the '<em><b>Cust Request Category Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_CATEGORY__CUST_REQUEST_CATEGORY_ID = eINSTANCE.getCustRequestCategory_CustRequestCategoryId();

		/**
		 * The meta object literal for the '<em><b>Cust Request Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_CATEGORY__CUST_REQUEST_TYPE_ID = eINSTANCE.getCustRequestCategory_CustRequestTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_CATEGORY__DESCRIPTION = eINSTANCE.getCustRequestCategory_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestCommEventImpl <em>Cust Request Comm Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.request.impl.CustRequestCommEventImpl
		 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestCommEvent()
		 * @generated
		 */
		EClass CUST_REQUEST_COMM_EVENT = eINSTANCE.getCustRequestCommEvent();

		/**
		 * The meta object literal for the '<em><b>Cust Request Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_COMM_EVENT__CUST_REQUEST_ID = eINSTANCE.getCustRequestCommEvent_CustRequestId();

		/**
		 * The meta object literal for the '<em><b>Communication Event Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_COMM_EVENT__COMMUNICATION_EVENT_ID = eINSTANCE.getCustRequestCommEvent_CommunicationEventId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestContentImpl <em>Cust Request Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.request.impl.CustRequestContentImpl
		 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestContent()
		 * @generated
		 */
		EClass CUST_REQUEST_CONTENT = eINSTANCE.getCustRequestContent();

		/**
		 * The meta object literal for the '<em><b>Cust Request Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_CONTENT__CUST_REQUEST_ID = eINSTANCE.getCustRequestContent_CustRequestId();

		/**
		 * The meta object literal for the '<em><b>Content Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_CONTENT__CONTENT_ID = eINSTANCE.getCustRequestContent_ContentId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_CONTENT__FROM_DATE = eINSTANCE.getCustRequestContent_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_CONTENT__THRU_DATE = eINSTANCE.getCustRequestContent_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestItemImpl <em>Cust Request Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.request.impl.CustRequestItemImpl
		 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestItem()
		 * @generated
		 */
		EClass CUST_REQUEST_ITEM = eINSTANCE.getCustRequestItem();

		/**
		 * The meta object literal for the '<em><b>Cust Request Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_ITEM__CUST_REQUEST_ID = eINSTANCE.getCustRequestItem_CustRequestId();

		/**
		 * The meta object literal for the '<em><b>Cust Request Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_ITEM__CUST_REQUEST_ITEM_SEQ_ID = eINSTANCE.getCustRequestItem_CustRequestItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Config Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_ITEM__CONFIG_ID = eINSTANCE.getCustRequestItem_ConfigId();

		/**
		 * The meta object literal for the '<em><b>Cust Request Resolution Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_ITEM__CUST_REQUEST_RESOLUTION_ID = eINSTANCE.getCustRequestItem_CustRequestResolutionId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_ITEM__DESCRIPTION = eINSTANCE.getCustRequestItem_Description();

		/**
		 * The meta object literal for the '<em><b>Maximum Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_ITEM__MAXIMUM_AMOUNT = eINSTANCE.getCustRequestItem_MaximumAmount();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_ITEM__PRIORITY = eINSTANCE.getCustRequestItem_Priority();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_ITEM__PRODUCT_ID = eINSTANCE.getCustRequestItem_ProductId();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_ITEM__QUANTITY = eINSTANCE.getCustRequestItem_Quantity();

		/**
		 * The meta object literal for the '<em><b>Required By Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_ITEM__REQUIRED_BY_DATE = eINSTANCE.getCustRequestItem_RequiredByDate();

		/**
		 * The meta object literal for the '<em><b>Reserv Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_ITEM__RESERV_LENGTH = eINSTANCE.getCustRequestItem_ReservLength();

		/**
		 * The meta object literal for the '<em><b>Reserv Persons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_ITEM__RESERV_PERSONS = eINSTANCE.getCustRequestItem_ReservPersons();

		/**
		 * The meta object literal for the '<em><b>Reserv Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_ITEM__RESERV_START = eINSTANCE.getCustRequestItem_ReservStart();

		/**
		 * The meta object literal for the '<em><b>Selected Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_ITEM__SELECTED_AMOUNT = eINSTANCE.getCustRequestItem_SelectedAmount();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_ITEM__SEQUENCE_NUM = eINSTANCE.getCustRequestItem_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_ITEM__STATUS_ID = eINSTANCE.getCustRequestItem_StatusId();

		/**
		 * The meta object literal for the '<em><b>Story</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_ITEM__STORY = eINSTANCE.getCustRequestItem_Story();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestItemNoteImpl <em>Cust Request Item Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.request.impl.CustRequestItemNoteImpl
		 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestItemNote()
		 * @generated
		 */
		EClass CUST_REQUEST_ITEM_NOTE = eINSTANCE.getCustRequestItemNote();

		/**
		 * The meta object literal for the '<em><b>Cust Request Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_ITEM_NOTE__CUST_REQUEST_ID = eINSTANCE.getCustRequestItemNote_CustRequestId();

		/**
		 * The meta object literal for the '<em><b>Cust Request Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_ITEM_NOTE__CUST_REQUEST_ITEM_SEQ_ID = eINSTANCE.getCustRequestItemNote_CustRequestItemSeqId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestItemWorkEffortImpl <em>Cust Request Item Work Effort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.request.impl.CustRequestItemWorkEffortImpl
		 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestItemWorkEffort()
		 * @generated
		 */
		EClass CUST_REQUEST_ITEM_WORK_EFFORT = eINSTANCE.getCustRequestItemWorkEffort();

		/**
		 * The meta object literal for the '<em><b>Cust Request Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_ITEM_WORK_EFFORT__CUST_REQUEST_ID = eINSTANCE.getCustRequestItemWorkEffort_CustRequestId();

		/**
		 * The meta object literal for the '<em><b>Cust Request Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_ITEM_WORK_EFFORT__CUST_REQUEST_ITEM_SEQ_ID = eINSTANCE.getCustRequestItemWorkEffort_CustRequestItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_ITEM_WORK_EFFORT__WORK_EFFORT_ID = eINSTANCE.getCustRequestItemWorkEffort_WorkEffortId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestNoteImpl <em>Cust Request Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.request.impl.CustRequestNoteImpl
		 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestNote()
		 * @generated
		 */
		EClass CUST_REQUEST_NOTE = eINSTANCE.getCustRequestNote();

		/**
		 * The meta object literal for the '<em><b>Cust Request Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_NOTE__CUST_REQUEST_ID = eINSTANCE.getCustRequestNote_CustRequestId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestPartyImpl <em>Cust Request Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.request.impl.CustRequestPartyImpl
		 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestParty()
		 * @generated
		 */
		EClass CUST_REQUEST_PARTY = eINSTANCE.getCustRequestParty();

		/**
		 * The meta object literal for the '<em><b>Cust Request Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_PARTY__CUST_REQUEST_ID = eINSTANCE.getCustRequestParty_CustRequestId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_PARTY__PARTY_ID = eINSTANCE.getCustRequestParty_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_PARTY__ROLE_TYPE_ID = eINSTANCE.getCustRequestParty_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_PARTY__FROM_DATE = eINSTANCE.getCustRequestParty_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_PARTY__THRU_DATE = eINSTANCE.getCustRequestParty_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestResolutionImpl <em>Cust Request Resolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.request.impl.CustRequestResolutionImpl
		 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestResolution()
		 * @generated
		 */
		EClass CUST_REQUEST_RESOLUTION = eINSTANCE.getCustRequestResolution();

		/**
		 * The meta object literal for the '<em><b>Cust Request Resolution Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_RESOLUTION__CUST_REQUEST_RESOLUTION_ID = eINSTANCE.getCustRequestResolution_CustRequestResolutionId();

		/**
		 * The meta object literal for the '<em><b>Cust Request Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_RESOLUTION__CUST_REQUEST_TYPE_ID = eINSTANCE.getCustRequestResolution_CustRequestTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_RESOLUTION__DESCRIPTION = eINSTANCE.getCustRequestResolution_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestStatusImpl <em>Cust Request Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.request.impl.CustRequestStatusImpl
		 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestStatus()
		 * @generated
		 */
		EClass CUST_REQUEST_STATUS = eINSTANCE.getCustRequestStatus();

		/**
		 * The meta object literal for the '<em><b>Cust Request Status Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_STATUS__CUST_REQUEST_STATUS_ID = eINSTANCE.getCustRequestStatus_CustRequestStatusId();

		/**
		 * The meta object literal for the '<em><b>Change By User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_STATUS__CHANGE_BY_USER_LOGIN_ID = eINSTANCE.getCustRequestStatus_ChangeByUserLoginId();

		/**
		 * The meta object literal for the '<em><b>Cust Request Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_STATUS__CUST_REQUEST_ID = eINSTANCE.getCustRequestStatus_CustRequestId();

		/**
		 * The meta object literal for the '<em><b>Cust Request Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_STATUS__CUST_REQUEST_ITEM_SEQ_ID = eINSTANCE.getCustRequestStatus_CustRequestItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Status Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_STATUS__STATUS_DATE = eINSTANCE.getCustRequestStatus_StatusDate();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_STATUS__STATUS_ID = eINSTANCE.getCustRequestStatus_StatusId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestTypeImpl <em>Cust Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.request.impl.CustRequestTypeImpl
		 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestType()
		 * @generated
		 */
		EClass CUST_REQUEST_TYPE = eINSTANCE.getCustRequestType();

		/**
		 * The meta object literal for the '<em><b>Cust Request Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_TYPE__CUST_REQUEST_TYPE_ID = eINSTANCE.getCustRequestType_CustRequestTypeId();

		/**
		 * The meta object literal for the '<em><b>Cust Request Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_TYPE__CUST_REQUEST_TYPE_ATTRS = eINSTANCE.getCustRequestType_CustRequestTypeAttrs();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_TYPE__DESCRIPTION = eINSTANCE.getCustRequestType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_TYPE__HAS_TABLE = eINSTANCE.getCustRequestType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_TYPE__PARENT_TYPE_ID = eINSTANCE.getCustRequestType_ParentTypeId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_TYPE__PARTY_ID = eINSTANCE.getCustRequestType_PartyId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestTypeAttrImpl <em>Cust Request Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.request.impl.CustRequestTypeAttrImpl
		 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestTypeAttr()
		 * @generated
		 */
		EClass CUST_REQUEST_TYPE_ATTR = eINSTANCE.getCustRequestTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Cust Request Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_TYPE_ATTR__CUST_REQUEST_TYPE_ID = eINSTANCE.getCustRequestTypeAttr_CustRequestTypeId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_TYPE_ATTR__ATTR_NAME = eINSTANCE.getCustRequestTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUST_REQUEST_TYPE_ATTR__DESCRIPTION = eINSTANCE.getCustRequestTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.request.impl.CustRequestWorkEffortImpl <em>Cust Request Work Effort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.request.impl.CustRequestWorkEffortImpl
		 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getCustRequestWorkEffort()
		 * @generated
		 */
		EClass CUST_REQUEST_WORK_EFFORT = eINSTANCE.getCustRequestWorkEffort();

		/**
		 * The meta object literal for the '<em><b>Cust Request Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_WORK_EFFORT__CUST_REQUEST_ID = eINSTANCE.getCustRequestWorkEffort_CustRequestId();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUST_REQUEST_WORK_EFFORT__WORK_EFFORT_ID = eINSTANCE.getCustRequestWorkEffort_WorkEffortId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.request.impl.RespondingPartyImpl <em>Responding Party</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.request.impl.RespondingPartyImpl
		 * @see org.abchip.mimo.biz.order.request.impl.RequestPackageImpl#getRespondingParty()
		 * @generated
		 */
		EClass RESPONDING_PARTY = eINSTANCE.getRespondingParty();

		/**
		 * The meta object literal for the '<em><b>Responding Party Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONDING_PARTY__RESPONDING_PARTY_SEQ_ID = eINSTANCE.getRespondingParty_RespondingPartySeqId();

		/**
		 * The meta object literal for the '<em><b>Cust Request Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONDING_PARTY__CUST_REQUEST_ID = eINSTANCE.getRespondingParty_CustRequestId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONDING_PARTY__PARTY_ID = eINSTANCE.getRespondingParty_PartyId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONDING_PARTY__CONTACT_MECH_ID = eINSTANCE.getRespondingParty_ContactMechId();

		/**
		 * The meta object literal for the '<em><b>Date Sent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONDING_PARTY__DATE_SENT = eINSTANCE.getRespondingParty_DateSent();

	}

} //RequestPackage
