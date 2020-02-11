/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_;

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
 * @see org.abchip.mimo.biz.order.return_.ReturnFactory
 * @model kind="package"
 * @generated
 */
public interface ReturnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "return";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/order/return";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-return";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReturnPackage eINSTANCE = org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.return_.impl.CommunicationEventReturnImpl <em>Communication Event Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.return_.impl.CommunicationEventReturnImpl
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getCommunicationEventReturn()
	 * @generated
	 */
	int COMMUNICATION_EVENT_RETURN = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_RETURN__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_RETURN__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_RETURN__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_RETURN__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Return Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_RETURN__RETURN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Communication Event Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_RETURN__COMMUNICATION_EVENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Communication Event Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_EVENT_RETURN_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl <em>Adjustment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnAdjustment()
	 * @generated
	 */
	int RETURN_ADJUSTMENT = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Return Adjustment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__AMOUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__COMMENTS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Corresponding Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__CORRESPONDING_PRODUCT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__CREATED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__CREATED_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Customer Reference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__CUSTOMER_REFERENCE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Exempt Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__EXEMPT_AMOUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Include In Shipping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__INCLUDE_IN_SHIPPING = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Include In Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__INCLUDE_IN_TAX = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__LAST_MODIFIED_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Order Adjustment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__ORDER_ADJUSTMENT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Override Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__OVERRIDE_GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Primary Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__PRIMARY_GEO_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Product Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__PRODUCT_FEATURE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Product Promo Action Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Product Promo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__PRODUCT_PROMO_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Product Promo Rule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__PRODUCT_PROMO_RULE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Return Adjustment Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Return Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__RETURN_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Return Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__RETURN_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Return Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__RETURN_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Secondary Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__SECONDARY_GEO_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__SHIP_GROUP_SEQ_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Source Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__SOURCE_PERCENTAGE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Source Reference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__SOURCE_REFERENCE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Tax Auth Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__TAX_AUTH_GEO_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Tax Auth Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__TAX_AUTH_PARTY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Tax Authority Rate Seq Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 30;

	/**
	 * The number of structural features of the '<em>Adjustment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 31;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentTypeImpl <em>Adjustment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentTypeImpl
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnAdjustmentType()
	 * @generated
	 */
	int RETURN_ADJUSTMENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Return Adjustment Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT_TYPE__RETURN_ADJUSTMENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Adjustment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ADJUSTMENT_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnContactMechImpl <em>Contact Mech</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnContactMechImpl
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnContactMech()
	 * @generated
	 */
	int RETURN_CONTACT_MECH = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CONTACT_MECH__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CONTACT_MECH__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CONTACT_MECH__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CONTACT_MECH__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Return Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CONTACT_MECH__RETURN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CONTACT_MECH__CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contact Mech Purpose Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Contact Mech</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_CONTACT_MECH_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnHeader()
	 * @generated
	 */
	int RETURN_HEADER = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Return Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__RETURN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Billing Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__BILLING_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Communication Event Returns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__COMMUNICATION_EVENT_RETURNS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__CREATED_BY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Destination Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__DESTINATION_FACILITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Entry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__ENTRY_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fin Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__FIN_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>From Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__FROM_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Needs Inventory Receive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__NEEDS_INVENTORY_RECEIVE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Origin Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__ORIGIN_CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Payment Method Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__PAYMENT_METHOD_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Return Header Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__RETURN_HEADER_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Return Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__RETURN_ITEMS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Supplier Rma Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__SUPPLIER_RMA_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>To Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER__TO_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderTypeImpl <em>Header Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnHeaderTypeImpl
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnHeaderType()
	 * @generated
	 */
	int RETURN_HEADER_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Return Header Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER_TYPE__RETURN_HEADER_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Header Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_HEADER_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnItem()
	 * @generated
	 */
	int RETURN_ITEM = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Return Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__RETURN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__RETURN_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expected Item Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__EXPECTED_ITEM_STATUS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__ORDER_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__ORDER_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Received Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__RECEIVED_QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Return Item Response Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__RETURN_ITEM_RESPONSE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Return Item Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__RETURN_ITEM_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Return Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__RETURN_PRICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Return Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__RETURN_QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Return Reason Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__RETURN_REASON_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Return Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__RETURN_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemBillingImpl <em>Item Billing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnItemBillingImpl
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnItemBilling()
	 * @generated
	 */
	int RETURN_ITEM_BILLING = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_BILLING__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_BILLING__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_BILLING__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_BILLING__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Return Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_BILLING__RETURN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invoice Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_BILLING__INVOICE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Invoice Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_BILLING__INVOICE_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Return Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_BILLING__RETURN_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_BILLING__AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_BILLING__QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Shipment Receipt Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_BILLING__SHIPMENT_RECEIPT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Item Billing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_BILLING_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemResponseImpl <em>Item Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnItemResponseImpl
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnItemResponse()
	 * @generated
	 */
	int RETURN_ITEM_RESPONSE = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Return Item Response Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE__RETURN_ITEM_RESPONSE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Billing Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE__BILLING_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fin Account Trans Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE__FIN_ACCOUNT_TRANS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Order Payment Preference Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE__ORDER_PAYMENT_PREFERENCE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Payment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE__PAYMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Replacement Order Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE__REPLACEMENT_ORDER_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Response Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE__RESPONSE_AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Response Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE__RESPONSE_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Item Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_RESPONSE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemShipmentImpl <em>Item Shipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnItemShipmentImpl
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnItemShipment()
	 * @generated
	 */
	int RETURN_ITEM_SHIPMENT = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_SHIPMENT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_SHIPMENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_SHIPMENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_SHIPMENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Return Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_SHIPMENT__RETURN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shipment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_SHIPMENT__SHIPMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_SHIPMENT__RETURN_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Shipment Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_SHIPMENT__SHIPMENT_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_SHIPMENT__QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Item Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_SHIPMENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemTypeImpl <em>Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnItemTypeImpl
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnItemType()
	 * @generated
	 */
	int RETURN_ITEM_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Return Item Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE__RETURN_ITEM_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemTypeMapImpl <em>Item Type Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnItemTypeMapImpl
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnItemTypeMap()
	 * @generated
	 */
	int RETURN_ITEM_TYPE_MAP = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE_MAP__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE_MAP__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE_MAP__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE_MAP__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Return Header Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE_MAP__RETURN_HEADER_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Item Map Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE_MAP__RETURN_ITEM_MAP_KEY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Item Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE_MAP__RETURN_ITEM_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Item Type Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_ITEM_TYPE_MAP_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnReasonImpl <em>Reason</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnReasonImpl
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnReason()
	 * @generated
	 */
	int RETURN_REASON = 12;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_REASON__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_REASON__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_REASON__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_REASON__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Return Reason Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_REASON__RETURN_REASON_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_REASON__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_REASON__SEQUENCE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reason</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_REASON_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnStatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnStatusImpl
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnStatus()
	 * @generated
	 */
	int RETURN_STATUS = 13;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATUS__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATUS__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATUS__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATUS__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Return Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATUS__RETURN_STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Change By User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATUS__CHANGE_BY_USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATUS__RETURN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Return Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATUS__RETURN_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATUS__STATUS_DATETIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATUS__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATUS_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnTypeImpl
	 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnType()
	 * @generated
	 */
	int RETURN_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Return Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__RETURN_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__SEQUENCE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.return_.CommunicationEventReturn <em>Communication Event Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Event Return</em>'.
	 * @see org.abchip.mimo.biz.order.return_.CommunicationEventReturn
	 * @generated
	 */
	EClass getCommunicationEventReturn();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.CommunicationEventReturn#getReturnId <em>Return Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.CommunicationEventReturn#getReturnId()
	 * @see #getCommunicationEventReturn()
	 * @generated
	 */
	EReference getCommunicationEventReturn_ReturnId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.CommunicationEventReturn#getCommunicationEventId <em>Communication Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Event Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.CommunicationEventReturn#getCommunicationEventId()
	 * @see #getCommunicationEventReturn()
	 * @generated
	 */
	EReference getCommunicationEventReturn_CommunicationEventId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment <em>Adjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adjustment</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment
	 * @generated
	 */
	EClass getReturnAdjustment();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getReturnAdjustmentId <em>Return Adjustment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Adjustment Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getReturnAdjustmentId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_ReturnAdjustmentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getAmount()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_Amount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getComments()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getCorrespondingProductId <em>Corresponding Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corresponding Product Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getCorrespondingProductId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_CorrespondingProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getCreatedByUserLogin()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EReference getReturnAdjustment_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getCreatedDate()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_CreatedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getCustomerReferenceId <em>Customer Reference Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Reference Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getCustomerReferenceId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_CustomerReferenceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getDescription()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getExemptAmount <em>Exempt Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exempt Amount</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getExemptAmount()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_ExemptAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#isIncludeInShipping <em>Include In Shipping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include In Shipping</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#isIncludeInShipping()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_IncludeInShipping();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#isIncludeInTax <em>Include In Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include In Tax</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#isIncludeInTax()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_IncludeInTax();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getLastModifiedByUserLogin()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getLastModifiedDate()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_LastModifiedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getOrderAdjustmentId <em>Order Adjustment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Adjustment Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getOrderAdjustmentId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EReference getReturnAdjustment_OrderAdjustmentId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getOverrideGlAccountId <em>Override Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Override Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getOverrideGlAccountId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EReference getReturnAdjustment_OverrideGlAccountId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getPrimaryGeoId <em>Primary Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Geo Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getPrimaryGeoId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EReference getReturnAdjustment_PrimaryGeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getProductFeatureId <em>Product Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Feature Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getProductFeatureId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_ProductFeatureId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Promo Action Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getProductPromoActionSeqId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_ProductPromoActionSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getProductPromoId <em>Product Promo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getProductPromoId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EReference getReturnAdjustment_ProductPromoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getProductPromoRuleId <em>Product Promo Rule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Promo Rule Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getProductPromoRuleId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_ProductPromoRuleId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getReturnAdjustmentTypeId <em>Return Adjustment Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Adjustment Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getReturnAdjustmentTypeId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EReference getReturnAdjustment_ReturnAdjustmentTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getReturnId <em>Return Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getReturnId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EReference getReturnAdjustment_ReturnId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getReturnItemSeqId <em>Return Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getReturnItemSeqId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_ReturnItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getReturnTypeId <em>Return Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getReturnTypeId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EReference getReturnAdjustment_ReturnTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getSecondaryGeoId <em>Secondary Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Secondary Geo Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getSecondaryGeoId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EReference getReturnAdjustment_SecondaryGeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getShipGroupSeqId <em>Ship Group Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ship Group Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getShipGroupSeqId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_ShipGroupSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getSourcePercentage <em>Source Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Percentage</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getSourcePercentage()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_SourcePercentage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getSourceReferenceId <em>Source Reference Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Reference Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getSourceReferenceId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_SourceReferenceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Auth Geo Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getTaxAuthGeoId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_TaxAuthGeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getTaxAuthPartyId <em>Tax Auth Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Auth Party Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getTaxAuthPartyId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EAttribute getReturnAdjustment_TaxAuthPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getTaxAuthorityRateSeqId <em>Tax Authority Rate Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tax Authority Rate Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustment#getTaxAuthorityRateSeqId()
	 * @see #getReturnAdjustment()
	 * @generated
	 */
	EReference getReturnAdjustment_TaxAuthorityRateSeqId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustmentType <em>Adjustment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adjustment Type</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustmentType
	 * @generated
	 */
	EClass getReturnAdjustmentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustmentType#getReturnAdjustmentTypeId <em>Return Adjustment Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Adjustment Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustmentType#getReturnAdjustmentTypeId()
	 * @see #getReturnAdjustmentType()
	 * @generated
	 */
	EAttribute getReturnAdjustmentType_ReturnAdjustmentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustmentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustmentType#getDescription()
	 * @see #getReturnAdjustmentType()
	 * @generated
	 */
	EAttribute getReturnAdjustmentType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustmentType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustmentType#isHasTable()
	 * @see #getReturnAdjustmentType()
	 * @generated
	 */
	EAttribute getReturnAdjustmentType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustmentType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnAdjustmentType#getParentTypeId()
	 * @see #getReturnAdjustmentType()
	 * @generated
	 */
	EReference getReturnAdjustmentType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.return_.ReturnContactMech <em>Contact Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Mech</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnContactMech
	 * @generated
	 */
	EClass getReturnContactMech();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnContactMech#getReturnId <em>Return Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnContactMech#getReturnId()
	 * @see #getReturnContactMech()
	 * @generated
	 */
	EReference getReturnContactMech_ReturnId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnContactMech#getContactMechPurposeTypeId <em>Contact Mech Purpose Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Purpose Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnContactMech#getContactMechPurposeTypeId()
	 * @see #getReturnContactMech()
	 * @generated
	 */
	EReference getReturnContactMech_ContactMechPurposeTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnContactMech#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnContactMech#getContactMechId()
	 * @see #getReturnContactMech()
	 * @generated
	 */
	EReference getReturnContactMech_ContactMechId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.return_.ReturnHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnHeader
	 * @generated
	 */
	EClass getReturnHeader();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getReturnId <em>Return Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnHeader#getReturnId()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EAttribute getReturnHeader_ReturnId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getBillingAccountId <em>Billing Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Billing Account Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnHeader#getBillingAccountId()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_BillingAccountId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getCommunicationEventReturns <em>Communication Event Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communication Event Returns</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnHeader#getCommunicationEventReturns()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_CommunicationEventReturns();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnHeader#getCreatedBy()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_CreatedBy();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getCurrencyUomId <em>Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnHeader#getCurrencyUomId()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_CurrencyUomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getDestinationFacilityId <em>Destination Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination Facility Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnHeader#getDestinationFacilityId()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_DestinationFacilityId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getEntryDate <em>Entry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Date</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnHeader#getEntryDate()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EAttribute getReturnHeader_EntryDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getFinAccountId <em>Fin Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnHeader#getFinAccountId()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_FinAccountId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getFromPartyId <em>From Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Party Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnHeader#getFromPartyId()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_FromPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#isNeedsInventoryReceive <em>Needs Inventory Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Inventory Receive</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnHeader#isNeedsInventoryReceive()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EAttribute getReturnHeader_NeedsInventoryReceive();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getOriginContactMechId <em>Origin Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnHeader#getOriginContactMechId()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_OriginContactMechId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getPaymentMethodId <em>Payment Method Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Method Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnHeader#getPaymentMethodId()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_PaymentMethodId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getReturnHeaderTypeId <em>Return Header Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Header Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnHeader#getReturnHeaderTypeId()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_ReturnHeaderTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getReturnItems <em>Return Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Return Items</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnHeader#getReturnItems()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_ReturnItems();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnHeader#getStatusId()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_StatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getSupplierRmaId <em>Supplier Rma Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier Rma Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnHeader#getSupplierRmaId()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EAttribute getReturnHeader_SupplierRmaId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnHeader#getToPartyId <em>To Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Party Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnHeader#getToPartyId()
	 * @see #getReturnHeader()
	 * @generated
	 */
	EReference getReturnHeader_ToPartyId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.return_.ReturnHeaderType <em>Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header Type</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnHeaderType
	 * @generated
	 */
	EClass getReturnHeaderType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnHeaderType#getReturnHeaderTypeId <em>Return Header Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Header Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnHeaderType#getReturnHeaderTypeId()
	 * @see #getReturnHeaderType()
	 * @generated
	 */
	EAttribute getReturnHeaderType_ReturnHeaderTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnHeaderType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnHeaderType#getDescription()
	 * @see #getReturnHeaderType()
	 * @generated
	 */
	EAttribute getReturnHeaderType_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnHeaderType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnHeaderType#getParentTypeId()
	 * @see #getReturnHeaderType()
	 * @generated
	 */
	EReference getReturnHeaderType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.return_.ReturnItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItem
	 * @generated
	 */
	EClass getReturnItem();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnId <em>Return Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItem#getReturnId()
	 * @see #getReturnItem()
	 * @generated
	 */
	EReference getReturnItem_ReturnId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnItemSeqId <em>Return Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItem#getReturnItemSeqId()
	 * @see #getReturnItem()
	 * @generated
	 */
	EAttribute getReturnItem_ReturnItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItem#getDescription()
	 * @see #getReturnItem()
	 * @generated
	 */
	EAttribute getReturnItem_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getExpectedItemStatus <em>Expected Item Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expected Item Status</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItem#getExpectedItemStatus()
	 * @see #getReturnItem()
	 * @generated
	 */
	EReference getReturnItem_ExpectedItemStatus();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItem#getOrderId()
	 * @see #getReturnItem()
	 * @generated
	 */
	EReference getReturnItem_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItem#getOrderItemSeqId()
	 * @see #getReturnItem()
	 * @generated
	 */
	EAttribute getReturnItem_OrderItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItem#getProductId()
	 * @see #getReturnItem()
	 * @generated
	 */
	EReference getReturnItem_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReceivedQuantity <em>Received Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Received Quantity</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItem#getReceivedQuantity()
	 * @see #getReturnItem()
	 * @generated
	 */
	EAttribute getReturnItem_ReceivedQuantity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnItemResponseId <em>Return Item Response Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Item Response Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItem#getReturnItemResponseId()
	 * @see #getReturnItem()
	 * @generated
	 */
	EReference getReturnItem_ReturnItemResponseId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnItemTypeId <em>Return Item Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Item Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItem#getReturnItemTypeId()
	 * @see #getReturnItem()
	 * @generated
	 */
	EReference getReturnItem_ReturnItemTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnPrice <em>Return Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Price</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItem#getReturnPrice()
	 * @see #getReturnItem()
	 * @generated
	 */
	EAttribute getReturnItem_ReturnPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnQuantity <em>Return Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Quantity</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItem#getReturnQuantity()
	 * @see #getReturnItem()
	 * @generated
	 */
	EAttribute getReturnItem_ReturnQuantity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnReasonId <em>Return Reason Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Reason Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItem#getReturnReasonId()
	 * @see #getReturnItem()
	 * @generated
	 */
	EReference getReturnItem_ReturnReasonId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getReturnTypeId <em>Return Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItem#getReturnTypeId()
	 * @see #getReturnItem()
	 * @generated
	 */
	EReference getReturnItem_ReturnTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnItem#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItem#getStatusId()
	 * @see #getReturnItem()
	 * @generated
	 */
	EReference getReturnItem_StatusId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.return_.ReturnItemBilling <em>Item Billing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Billing</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemBilling
	 * @generated
	 */
	EClass getReturnItemBilling();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnItemBilling#getReturnId <em>Return Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemBilling#getReturnId()
	 * @see #getReturnItemBilling()
	 * @generated
	 */
	EReference getReturnItemBilling_ReturnId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnItemBilling#getReturnItemSeqId <em>Return Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemBilling#getReturnItemSeqId()
	 * @see #getReturnItemBilling()
	 * @generated
	 */
	EAttribute getReturnItemBilling_ReturnItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnItemBilling#getInvoiceId <em>Invoice Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemBilling#getInvoiceId()
	 * @see #getReturnItemBilling()
	 * @generated
	 */
	EReference getReturnItemBilling_InvoiceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnItemBilling#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemBilling#getInvoiceItemSeqId()
	 * @see #getReturnItemBilling()
	 * @generated
	 */
	EAttribute getReturnItemBilling_InvoiceItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnItemBilling#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemBilling#getAmount()
	 * @see #getReturnItemBilling()
	 * @generated
	 */
	EAttribute getReturnItemBilling_Amount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnItemBilling#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemBilling#getQuantity()
	 * @see #getReturnItemBilling()
	 * @generated
	 */
	EAttribute getReturnItemBilling_Quantity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnItemBilling#getShipmentReceiptId <em>Shipment Receipt Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Receipt Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemBilling#getShipmentReceiptId()
	 * @see #getReturnItemBilling()
	 * @generated
	 */
	EReference getReturnItemBilling_ShipmentReceiptId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse <em>Item Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Response</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemResponse
	 * @generated
	 */
	EClass getReturnItemResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getReturnItemResponseId <em>Return Item Response Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Item Response Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemResponse#getReturnItemResponseId()
	 * @see #getReturnItemResponse()
	 * @generated
	 */
	EAttribute getReturnItemResponse_ReturnItemResponseId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getBillingAccountId <em>Billing Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Billing Account Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemResponse#getBillingAccountId()
	 * @see #getReturnItemResponse()
	 * @generated
	 */
	EReference getReturnItemResponse_BillingAccountId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getFinAccountTransId <em>Fin Account Trans Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account Trans Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemResponse#getFinAccountTransId()
	 * @see #getReturnItemResponse()
	 * @generated
	 */
	EReference getReturnItemResponse_FinAccountTransId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getOrderPaymentPreferenceId <em>Order Payment Preference Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Payment Preference Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemResponse#getOrderPaymentPreferenceId()
	 * @see #getReturnItemResponse()
	 * @generated
	 */
	EReference getReturnItemResponse_OrderPaymentPreferenceId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getPaymentId <em>Payment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemResponse#getPaymentId()
	 * @see #getReturnItemResponse()
	 * @generated
	 */
	EReference getReturnItemResponse_PaymentId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getReplacementOrderId <em>Replacement Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Replacement Order Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemResponse#getReplacementOrderId()
	 * @see #getReturnItemResponse()
	 * @generated
	 */
	EReference getReturnItemResponse_ReplacementOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getResponseAmount <em>Response Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Amount</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemResponse#getResponseAmount()
	 * @see #getReturnItemResponse()
	 * @generated
	 */
	EAttribute getReturnItemResponse_ResponseAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getResponseDate <em>Response Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response Date</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemResponse#getResponseDate()
	 * @see #getReturnItemResponse()
	 * @generated
	 */
	EAttribute getReturnItemResponse_ResponseDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.return_.ReturnItemShipment <em>Item Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Shipment</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemShipment
	 * @generated
	 */
	EClass getReturnItemShipment();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnItemShipment#getReturnId <em>Return Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemShipment#getReturnId()
	 * @see #getReturnItemShipment()
	 * @generated
	 */
	EReference getReturnItemShipment_ReturnId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnItemShipment#getReturnItemSeqId <em>Return Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemShipment#getReturnItemSeqId()
	 * @see #getReturnItemShipment()
	 * @generated
	 */
	EAttribute getReturnItemShipment_ReturnItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnItemShipment#getShipmentId <em>Shipment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemShipment#getShipmentId()
	 * @see #getReturnItemShipment()
	 * @generated
	 */
	EReference getReturnItemShipment_ShipmentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnItemShipment#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemShipment#getShipmentItemSeqId()
	 * @see #getReturnItemShipment()
	 * @generated
	 */
	EAttribute getReturnItemShipment_ShipmentItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnItemShipment#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemShipment#getQuantity()
	 * @see #getReturnItemShipment()
	 * @generated
	 */
	EAttribute getReturnItemShipment_Quantity();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.return_.ReturnItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemType
	 * @generated
	 */
	EClass getReturnItemType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnItemType#getReturnItemTypeId <em>Return Item Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Item Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemType#getReturnItemTypeId()
	 * @see #getReturnItemType()
	 * @generated
	 */
	EAttribute getReturnItemType_ReturnItemTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnItemType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemType#getDescription()
	 * @see #getReturnItemType()
	 * @generated
	 */
	EAttribute getReturnItemType_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnItemType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemType#getParentTypeId()
	 * @see #getReturnItemType()
	 * @generated
	 */
	EReference getReturnItemType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.return_.ReturnItemTypeMap <em>Item Type Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type Map</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemTypeMap
	 * @generated
	 */
	EClass getReturnItemTypeMap();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnItemTypeMap#getReturnItemMapKey <em>Return Item Map Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Item Map Key</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemTypeMap#getReturnItemMapKey()
	 * @see #getReturnItemTypeMap()
	 * @generated
	 */
	EAttribute getReturnItemTypeMap_ReturnItemMapKey();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnItemTypeMap#getReturnHeaderTypeId <em>Return Header Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Header Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemTypeMap#getReturnHeaderTypeId()
	 * @see #getReturnItemTypeMap()
	 * @generated
	 */
	EReference getReturnItemTypeMap_ReturnHeaderTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnItemTypeMap#getReturnItemTypeId <em>Return Item Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Item Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnItemTypeMap#getReturnItemTypeId()
	 * @see #getReturnItemTypeMap()
	 * @generated
	 */
	EReference getReturnItemTypeMap_ReturnItemTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.return_.ReturnReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reason</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnReason
	 * @generated
	 */
	EClass getReturnReason();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnReason#getReturnReasonId <em>Return Reason Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Reason Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnReason#getReturnReasonId()
	 * @see #getReturnReason()
	 * @generated
	 */
	EAttribute getReturnReason_ReturnReasonId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnReason#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnReason#getDescription()
	 * @see #getReturnReason()
	 * @generated
	 */
	EAttribute getReturnReason_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnReason#getSequenceId <em>Sequence Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnReason#getSequenceId()
	 * @see #getReturnReason()
	 * @generated
	 */
	EAttribute getReturnReason_SequenceId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.return_.ReturnStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnStatus
	 * @generated
	 */
	EClass getReturnStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnStatus#getReturnStatusId <em>Return Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Status Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnStatus#getReturnStatusId()
	 * @see #getReturnStatus()
	 * @generated
	 */
	EAttribute getReturnStatus_ReturnStatusId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnStatus#getChangeByUserLoginId <em>Change By User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change By User Login Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnStatus#getChangeByUserLoginId()
	 * @see #getReturnStatus()
	 * @generated
	 */
	EReference getReturnStatus_ChangeByUserLoginId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnStatus#getReturnId <em>Return Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnStatus#getReturnId()
	 * @see #getReturnStatus()
	 * @generated
	 */
	EReference getReturnStatus_ReturnId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnStatus#getReturnItemSeqId <em>Return Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnStatus#getReturnItemSeqId()
	 * @see #getReturnStatus()
	 * @generated
	 */
	EAttribute getReturnStatus_ReturnItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnStatus#getStatusDatetime <em>Status Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Datetime</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnStatus#getStatusDatetime()
	 * @see #getReturnStatus()
	 * @generated
	 */
	EAttribute getReturnStatus_StatusDatetime();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.return_.ReturnStatus#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnStatus#getStatusId()
	 * @see #getReturnStatus()
	 * @generated
	 */
	EReference getReturnStatus_StatusId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.return_.ReturnType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnType
	 * @generated
	 */
	EClass getReturnType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnType#getReturnTypeId <em>Return Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnType#getReturnTypeId()
	 * @see #getReturnType()
	 * @generated
	 */
	EAttribute getReturnType_ReturnTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnType#getDescription()
	 * @see #getReturnType()
	 * @generated
	 */
	EAttribute getReturnType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.return_.ReturnType#getSequenceId <em>Sequence Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Id</em>'.
	 * @see org.abchip.mimo.biz.order.return_.ReturnType#getSequenceId()
	 * @see #getReturnType()
	 * @generated
	 */
	EAttribute getReturnType_SequenceId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReturnFactory getReturnFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.return_.impl.CommunicationEventReturnImpl <em>Communication Event Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.return_.impl.CommunicationEventReturnImpl
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getCommunicationEventReturn()
		 * @generated
		 */
		EClass COMMUNICATION_EVENT_RETURN = eINSTANCE.getCommunicationEventReturn();

		/**
		 * The meta object literal for the '<em><b>Return Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_RETURN__RETURN_ID = eINSTANCE.getCommunicationEventReturn_ReturnId();

		/**
		 * The meta object literal for the '<em><b>Communication Event Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_EVENT_RETURN__COMMUNICATION_EVENT_ID = eINSTANCE.getCommunicationEventReturn_CommunicationEventId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl <em>Adjustment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnAdjustment()
		 * @generated
		 */
		EClass RETURN_ADJUSTMENT = eINSTANCE.getReturnAdjustment();

		/**
		 * The meta object literal for the '<em><b>Return Adjustment Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_ID = eINSTANCE.getReturnAdjustment_ReturnAdjustmentId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__AMOUNT = eINSTANCE.getReturnAdjustment_Amount();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__COMMENTS = eINSTANCE.getReturnAdjustment_Comments();

		/**
		 * The meta object literal for the '<em><b>Corresponding Product Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__CORRESPONDING_PRODUCT_ID = eINSTANCE.getReturnAdjustment_CorrespondingProductId();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ADJUSTMENT__CREATED_BY_USER_LOGIN = eINSTANCE.getReturnAdjustment_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__CREATED_DATE = eINSTANCE.getReturnAdjustment_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Customer Reference Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__CUSTOMER_REFERENCE_ID = eINSTANCE.getReturnAdjustment_CustomerReferenceId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__DESCRIPTION = eINSTANCE.getReturnAdjustment_Description();

		/**
		 * The meta object literal for the '<em><b>Exempt Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__EXEMPT_AMOUNT = eINSTANCE.getReturnAdjustment_ExemptAmount();

		/**
		 * The meta object literal for the '<em><b>Include In Shipping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__INCLUDE_IN_SHIPPING = eINSTANCE.getReturnAdjustment_IncludeInShipping();

		/**
		 * The meta object literal for the '<em><b>Include In Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__INCLUDE_IN_TAX = eINSTANCE.getReturnAdjustment_IncludeInTax();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getReturnAdjustment_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__LAST_MODIFIED_DATE = eINSTANCE.getReturnAdjustment_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Order Adjustment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ADJUSTMENT__ORDER_ADJUSTMENT_ID = eINSTANCE.getReturnAdjustment_OrderAdjustmentId();

		/**
		 * The meta object literal for the '<em><b>Override Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ADJUSTMENT__OVERRIDE_GL_ACCOUNT_ID = eINSTANCE.getReturnAdjustment_OverrideGlAccountId();

		/**
		 * The meta object literal for the '<em><b>Primary Geo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ADJUSTMENT__PRIMARY_GEO_ID = eINSTANCE.getReturnAdjustment_PrimaryGeoId();

		/**
		 * The meta object literal for the '<em><b>Product Feature Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__PRODUCT_FEATURE_ID = eINSTANCE.getReturnAdjustment_ProductFeatureId();

		/**
		 * The meta object literal for the '<em><b>Product Promo Action Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID = eINSTANCE.getReturnAdjustment_ProductPromoActionSeqId();

		/**
		 * The meta object literal for the '<em><b>Product Promo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ADJUSTMENT__PRODUCT_PROMO_ID = eINSTANCE.getReturnAdjustment_ProductPromoId();

		/**
		 * The meta object literal for the '<em><b>Product Promo Rule Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__PRODUCT_PROMO_RULE_ID = eINSTANCE.getReturnAdjustment_ProductPromoRuleId();

		/**
		 * The meta object literal for the '<em><b>Return Adjustment Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_TYPE_ID = eINSTANCE.getReturnAdjustment_ReturnAdjustmentTypeId();

		/**
		 * The meta object literal for the '<em><b>Return Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ADJUSTMENT__RETURN_ID = eINSTANCE.getReturnAdjustment_ReturnId();

		/**
		 * The meta object literal for the '<em><b>Return Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__RETURN_ITEM_SEQ_ID = eINSTANCE.getReturnAdjustment_ReturnItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Return Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ADJUSTMENT__RETURN_TYPE_ID = eINSTANCE.getReturnAdjustment_ReturnTypeId();

		/**
		 * The meta object literal for the '<em><b>Secondary Geo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ADJUSTMENT__SECONDARY_GEO_ID = eINSTANCE.getReturnAdjustment_SecondaryGeoId();

		/**
		 * The meta object literal for the '<em><b>Ship Group Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__SHIP_GROUP_SEQ_ID = eINSTANCE.getReturnAdjustment_ShipGroupSeqId();

		/**
		 * The meta object literal for the '<em><b>Source Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__SOURCE_PERCENTAGE = eINSTANCE.getReturnAdjustment_SourcePercentage();

		/**
		 * The meta object literal for the '<em><b>Source Reference Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__SOURCE_REFERENCE_ID = eINSTANCE.getReturnAdjustment_SourceReferenceId();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Geo Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__TAX_AUTH_GEO_ID = eINSTANCE.getReturnAdjustment_TaxAuthGeoId();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT__TAX_AUTH_PARTY_ID = eINSTANCE.getReturnAdjustment_TaxAuthPartyId();

		/**
		 * The meta object literal for the '<em><b>Tax Authority Rate Seq Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ_ID = eINSTANCE.getReturnAdjustment_TaxAuthorityRateSeqId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentTypeImpl <em>Adjustment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentTypeImpl
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnAdjustmentType()
		 * @generated
		 */
		EClass RETURN_ADJUSTMENT_TYPE = eINSTANCE.getReturnAdjustmentType();

		/**
		 * The meta object literal for the '<em><b>Return Adjustment Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT_TYPE__RETURN_ADJUSTMENT_TYPE_ID = eINSTANCE.getReturnAdjustmentType_ReturnAdjustmentTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT_TYPE__DESCRIPTION = eINSTANCE.getReturnAdjustmentType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ADJUSTMENT_TYPE__HAS_TABLE = eINSTANCE.getReturnAdjustmentType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ADJUSTMENT_TYPE__PARENT_TYPE_ID = eINSTANCE.getReturnAdjustmentType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnContactMechImpl <em>Contact Mech</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnContactMechImpl
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnContactMech()
		 * @generated
		 */
		EClass RETURN_CONTACT_MECH = eINSTANCE.getReturnContactMech();

		/**
		 * The meta object literal for the '<em><b>Return Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_CONTACT_MECH__RETURN_ID = eINSTANCE.getReturnContactMech_ReturnId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Purpose Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_CONTACT_MECH__CONTACT_MECH_PURPOSE_TYPE_ID = eINSTANCE.getReturnContactMech_ContactMechPurposeTypeId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_CONTACT_MECH__CONTACT_MECH_ID = eINSTANCE.getReturnContactMech_ContactMechId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnHeaderImpl
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnHeader()
		 * @generated
		 */
		EClass RETURN_HEADER = eINSTANCE.getReturnHeader();

		/**
		 * The meta object literal for the '<em><b>Return Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_HEADER__RETURN_ID = eINSTANCE.getReturnHeader_ReturnId();

		/**
		 * The meta object literal for the '<em><b>Billing Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__BILLING_ACCOUNT_ID = eINSTANCE.getReturnHeader_BillingAccountId();

		/**
		 * The meta object literal for the '<em><b>Communication Event Returns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__COMMUNICATION_EVENT_RETURNS = eINSTANCE.getReturnHeader_CommunicationEventReturns();

		/**
		 * The meta object literal for the '<em><b>Created By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__CREATED_BY = eINSTANCE.getReturnHeader_CreatedBy();

		/**
		 * The meta object literal for the '<em><b>Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__CURRENCY_UOM_ID = eINSTANCE.getReturnHeader_CurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Destination Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__DESTINATION_FACILITY_ID = eINSTANCE.getReturnHeader_DestinationFacilityId();

		/**
		 * The meta object literal for the '<em><b>Entry Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_HEADER__ENTRY_DATE = eINSTANCE.getReturnHeader_EntryDate();

		/**
		 * The meta object literal for the '<em><b>Fin Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__FIN_ACCOUNT_ID = eINSTANCE.getReturnHeader_FinAccountId();

		/**
		 * The meta object literal for the '<em><b>From Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__FROM_PARTY_ID = eINSTANCE.getReturnHeader_FromPartyId();

		/**
		 * The meta object literal for the '<em><b>Needs Inventory Receive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_HEADER__NEEDS_INVENTORY_RECEIVE = eINSTANCE.getReturnHeader_NeedsInventoryReceive();

		/**
		 * The meta object literal for the '<em><b>Origin Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__ORIGIN_CONTACT_MECH_ID = eINSTANCE.getReturnHeader_OriginContactMechId();

		/**
		 * The meta object literal for the '<em><b>Payment Method Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__PAYMENT_METHOD_ID = eINSTANCE.getReturnHeader_PaymentMethodId();

		/**
		 * The meta object literal for the '<em><b>Return Header Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__RETURN_HEADER_TYPE_ID = eINSTANCE.getReturnHeader_ReturnHeaderTypeId();

		/**
		 * The meta object literal for the '<em><b>Return Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__RETURN_ITEMS = eINSTANCE.getReturnHeader_ReturnItems();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__STATUS_ID = eINSTANCE.getReturnHeader_StatusId();

		/**
		 * The meta object literal for the '<em><b>Supplier Rma Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_HEADER__SUPPLIER_RMA_ID = eINSTANCE.getReturnHeader_SupplierRmaId();

		/**
		 * The meta object literal for the '<em><b>To Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER__TO_PARTY_ID = eINSTANCE.getReturnHeader_ToPartyId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnHeaderTypeImpl <em>Header Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnHeaderTypeImpl
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnHeaderType()
		 * @generated
		 */
		EClass RETURN_HEADER_TYPE = eINSTANCE.getReturnHeaderType();

		/**
		 * The meta object literal for the '<em><b>Return Header Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_HEADER_TYPE__RETURN_HEADER_TYPE_ID = eINSTANCE.getReturnHeaderType_ReturnHeaderTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_HEADER_TYPE__DESCRIPTION = eINSTANCE.getReturnHeaderType_Description();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_HEADER_TYPE__PARENT_TYPE_ID = eINSTANCE.getReturnHeaderType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnItemImpl
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnItem()
		 * @generated
		 */
		EClass RETURN_ITEM = eINSTANCE.getReturnItem();

		/**
		 * The meta object literal for the '<em><b>Return Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM__RETURN_ID = eINSTANCE.getReturnItem_ReturnId();

		/**
		 * The meta object literal for the '<em><b>Return Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM__RETURN_ITEM_SEQ_ID = eINSTANCE.getReturnItem_ReturnItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM__DESCRIPTION = eINSTANCE.getReturnItem_Description();

		/**
		 * The meta object literal for the '<em><b>Expected Item Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM__EXPECTED_ITEM_STATUS = eINSTANCE.getReturnItem_ExpectedItemStatus();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM__ORDER_ID = eINSTANCE.getReturnItem_OrderId();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM__ORDER_ITEM_SEQ_ID = eINSTANCE.getReturnItem_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM__PRODUCT_ID = eINSTANCE.getReturnItem_ProductId();

		/**
		 * The meta object literal for the '<em><b>Received Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM__RECEIVED_QUANTITY = eINSTANCE.getReturnItem_ReceivedQuantity();

		/**
		 * The meta object literal for the '<em><b>Return Item Response Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM__RETURN_ITEM_RESPONSE_ID = eINSTANCE.getReturnItem_ReturnItemResponseId();

		/**
		 * The meta object literal for the '<em><b>Return Item Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM__RETURN_ITEM_TYPE_ID = eINSTANCE.getReturnItem_ReturnItemTypeId();

		/**
		 * The meta object literal for the '<em><b>Return Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM__RETURN_PRICE = eINSTANCE.getReturnItem_ReturnPrice();

		/**
		 * The meta object literal for the '<em><b>Return Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM__RETURN_QUANTITY = eINSTANCE.getReturnItem_ReturnQuantity();

		/**
		 * The meta object literal for the '<em><b>Return Reason Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM__RETURN_REASON_ID = eINSTANCE.getReturnItem_ReturnReasonId();

		/**
		 * The meta object literal for the '<em><b>Return Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM__RETURN_TYPE_ID = eINSTANCE.getReturnItem_ReturnTypeId();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM__STATUS_ID = eINSTANCE.getReturnItem_StatusId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemBillingImpl <em>Item Billing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnItemBillingImpl
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnItemBilling()
		 * @generated
		 */
		EClass RETURN_ITEM_BILLING = eINSTANCE.getReturnItemBilling();

		/**
		 * The meta object literal for the '<em><b>Return Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_BILLING__RETURN_ID = eINSTANCE.getReturnItemBilling_ReturnId();

		/**
		 * The meta object literal for the '<em><b>Return Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_BILLING__RETURN_ITEM_SEQ_ID = eINSTANCE.getReturnItemBilling_ReturnItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Invoice Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_BILLING__INVOICE_ID = eINSTANCE.getReturnItemBilling_InvoiceId();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_BILLING__INVOICE_ITEM_SEQ_ID = eINSTANCE.getReturnItemBilling_InvoiceItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_BILLING__AMOUNT = eINSTANCE.getReturnItemBilling_Amount();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_BILLING__QUANTITY = eINSTANCE.getReturnItemBilling_Quantity();

		/**
		 * The meta object literal for the '<em><b>Shipment Receipt Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_BILLING__SHIPMENT_RECEIPT_ID = eINSTANCE.getReturnItemBilling_ShipmentReceiptId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemResponseImpl <em>Item Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnItemResponseImpl
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnItemResponse()
		 * @generated
		 */
		EClass RETURN_ITEM_RESPONSE = eINSTANCE.getReturnItemResponse();

		/**
		 * The meta object literal for the '<em><b>Return Item Response Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_RESPONSE__RETURN_ITEM_RESPONSE_ID = eINSTANCE.getReturnItemResponse_ReturnItemResponseId();

		/**
		 * The meta object literal for the '<em><b>Billing Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_RESPONSE__BILLING_ACCOUNT_ID = eINSTANCE.getReturnItemResponse_BillingAccountId();

		/**
		 * The meta object literal for the '<em><b>Fin Account Trans Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_RESPONSE__FIN_ACCOUNT_TRANS_ID = eINSTANCE.getReturnItemResponse_FinAccountTransId();

		/**
		 * The meta object literal for the '<em><b>Order Payment Preference Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_RESPONSE__ORDER_PAYMENT_PREFERENCE_ID = eINSTANCE.getReturnItemResponse_OrderPaymentPreferenceId();

		/**
		 * The meta object literal for the '<em><b>Payment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_RESPONSE__PAYMENT_ID = eINSTANCE.getReturnItemResponse_PaymentId();

		/**
		 * The meta object literal for the '<em><b>Replacement Order Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_RESPONSE__REPLACEMENT_ORDER_ID = eINSTANCE.getReturnItemResponse_ReplacementOrderId();

		/**
		 * The meta object literal for the '<em><b>Response Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_RESPONSE__RESPONSE_AMOUNT = eINSTANCE.getReturnItemResponse_ResponseAmount();

		/**
		 * The meta object literal for the '<em><b>Response Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_RESPONSE__RESPONSE_DATE = eINSTANCE.getReturnItemResponse_ResponseDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemShipmentImpl <em>Item Shipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnItemShipmentImpl
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnItemShipment()
		 * @generated
		 */
		EClass RETURN_ITEM_SHIPMENT = eINSTANCE.getReturnItemShipment();

		/**
		 * The meta object literal for the '<em><b>Return Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_SHIPMENT__RETURN_ID = eINSTANCE.getReturnItemShipment_ReturnId();

		/**
		 * The meta object literal for the '<em><b>Return Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_SHIPMENT__RETURN_ITEM_SEQ_ID = eINSTANCE.getReturnItemShipment_ReturnItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Shipment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_SHIPMENT__SHIPMENT_ID = eINSTANCE.getReturnItemShipment_ShipmentId();

		/**
		 * The meta object literal for the '<em><b>Shipment Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_SHIPMENT__SHIPMENT_ITEM_SEQ_ID = eINSTANCE.getReturnItemShipment_ShipmentItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_SHIPMENT__QUANTITY = eINSTANCE.getReturnItemShipment_Quantity();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemTypeImpl <em>Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnItemTypeImpl
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnItemType()
		 * @generated
		 */
		EClass RETURN_ITEM_TYPE = eINSTANCE.getReturnItemType();

		/**
		 * The meta object literal for the '<em><b>Return Item Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_TYPE__RETURN_ITEM_TYPE_ID = eINSTANCE.getReturnItemType_ReturnItemTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_TYPE__DESCRIPTION = eINSTANCE.getReturnItemType_Description();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_TYPE__PARENT_TYPE_ID = eINSTANCE.getReturnItemType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemTypeMapImpl <em>Item Type Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnItemTypeMapImpl
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnItemTypeMap()
		 * @generated
		 */
		EClass RETURN_ITEM_TYPE_MAP = eINSTANCE.getReturnItemTypeMap();

		/**
		 * The meta object literal for the '<em><b>Return Item Map Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_ITEM_TYPE_MAP__RETURN_ITEM_MAP_KEY = eINSTANCE.getReturnItemTypeMap_ReturnItemMapKey();

		/**
		 * The meta object literal for the '<em><b>Return Header Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_TYPE_MAP__RETURN_HEADER_TYPE_ID = eINSTANCE.getReturnItemTypeMap_ReturnHeaderTypeId();

		/**
		 * The meta object literal for the '<em><b>Return Item Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_ITEM_TYPE_MAP__RETURN_ITEM_TYPE_ID = eINSTANCE.getReturnItemTypeMap_ReturnItemTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnReasonImpl <em>Reason</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnReasonImpl
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnReason()
		 * @generated
		 */
		EClass RETURN_REASON = eINSTANCE.getReturnReason();

		/**
		 * The meta object literal for the '<em><b>Return Reason Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_REASON__RETURN_REASON_ID = eINSTANCE.getReturnReason_ReturnReasonId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_REASON__DESCRIPTION = eINSTANCE.getReturnReason_Description();

		/**
		 * The meta object literal for the '<em><b>Sequence Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_REASON__SEQUENCE_ID = eINSTANCE.getReturnReason_SequenceId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnStatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnStatusImpl
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnStatus()
		 * @generated
		 */
		EClass RETURN_STATUS = eINSTANCE.getReturnStatus();

		/**
		 * The meta object literal for the '<em><b>Return Status Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_STATUS__RETURN_STATUS_ID = eINSTANCE.getReturnStatus_ReturnStatusId();

		/**
		 * The meta object literal for the '<em><b>Change By User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_STATUS__CHANGE_BY_USER_LOGIN_ID = eINSTANCE.getReturnStatus_ChangeByUserLoginId();

		/**
		 * The meta object literal for the '<em><b>Return Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_STATUS__RETURN_ID = eINSTANCE.getReturnStatus_ReturnId();

		/**
		 * The meta object literal for the '<em><b>Return Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_STATUS__RETURN_ITEM_SEQ_ID = eINSTANCE.getReturnStatus_ReturnItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Status Datetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_STATUS__STATUS_DATETIME = eINSTANCE.getReturnStatus_StatusDatetime();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_STATUS__STATUS_ID = eINSTANCE.getReturnStatus_StatusId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.return_.impl.ReturnTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnTypeImpl
		 * @see org.abchip.mimo.biz.order.return_.impl.ReturnPackageImpl#getReturnType()
		 * @generated
		 */
		EClass RETURN_TYPE = eINSTANCE.getReturnType();

		/**
		 * The meta object literal for the '<em><b>Return Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_TYPE__RETURN_TYPE_ID = eINSTANCE.getReturnType_ReturnTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_TYPE__DESCRIPTION = eINSTANCE.getReturnType_Description();

		/**
		 * The meta object literal for the '<em><b>Sequence Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_TYPE__SEQUENCE_ID = eINSTANCE.getReturnType_SequenceId();

	}

} //ReturnPackage
