/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.picklist;

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
 * @see org.abchip.mimo.biz.shipment.picklist.PicklistFactory
 * @model kind="package"
 * @generated
 */
public interface PicklistPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "picklist";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/shipment/picklist";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-picklist";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PicklistPackage eINSTANCE = org.abchip.mimo.biz.shipment.picklist.impl.PicklistPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistImpl <em>Picklist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.picklist.impl.PicklistImpl
	 * @see org.abchip.mimo.biz.shipment.picklist.impl.PicklistPackageImpl#getPicklist()
	 * @generated
	 */
	int PICKLIST = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Picklist Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST__PICKLIST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST__CREATED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST__FACILITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST__LAST_MODIFIED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Picklist Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST__PICKLIST_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Picklist Status Histories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST__PICKLIST_STATUS_HISTORIES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Shipment Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST__SHIPMENT_METHOD_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Picklist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistBinImpl <em>Bin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.picklist.impl.PicklistBinImpl
	 * @see org.abchip.mimo.biz.shipment.picklist.impl.PicklistPackageImpl#getPicklistBin()
	 * @generated
	 */
	int PICKLIST_BIN = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_BIN__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_BIN__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_BIN__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_BIN__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Picklist Bin Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_BIN__PICKLIST_BIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bin Location Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_BIN__BIN_LOCATION_NUMBER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Picklist Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_BIN__PICKLIST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Primary Order Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_BIN__PRIMARY_ORDER_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Primary Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_BIN__PRIMARY_SHIP_GROUP_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Bin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_BIN_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.picklist.impl.PicklistItemImpl
	 * @see org.abchip.mimo.biz.shipment.picklist.impl.PicklistPackageImpl#getPicklistItem()
	 * @generated
	 */
	int PICKLIST_ITEM = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_ITEM__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_ITEM__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_ITEM__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_ITEM__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Picklist Bin Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_ITEM__PICKLIST_BIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_ITEM__ORDER_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inventory Item Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_ITEM__INVENTORY_ITEM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_ITEM__ORDER_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_ITEM__SHIP_GROUP_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Item Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_ITEM__ITEM_STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_ITEM__QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_ITEM_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistRoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.picklist.impl.PicklistRoleImpl
	 * @see org.abchip.mimo.biz.shipment.picklist.impl.PicklistPackageImpl#getPicklistRole()
	 * @generated
	 */
	int PICKLIST_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_ROLE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_ROLE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_ROLE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_ROLE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Picklist Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_ROLE__PICKLIST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_ROLE__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_ROLE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_ROLE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_ROLE__CREATED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_ROLE__LAST_MODIFIED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_ROLE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_ROLE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistStatusHistoryImpl <em>Status History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.picklist.impl.PicklistStatusHistoryImpl
	 * @see org.abchip.mimo.biz.shipment.picklist.impl.PicklistPackageImpl#getPicklistStatusHistory()
	 * @generated
	 */
	int PICKLIST_STATUS_HISTORY = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_STATUS_HISTORY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_STATUS_HISTORY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_STATUS_HISTORY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_STATUS_HISTORY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Picklist Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_STATUS_HISTORY__PICKLIST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Change Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_STATUS_HISTORY__CHANGE_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_STATUS_HISTORY__CHANGE_USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_STATUS_HISTORY__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_STATUS_HISTORY__STATUS_ID_TO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Status History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICKLIST_STATUS_HISTORY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.picklist.Picklist <em>Picklist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Picklist</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.Picklist
	 * @generated
	 */
	EClass getPicklist();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getPicklistId <em>Picklist Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Picklist Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.Picklist#getPicklistId()
	 * @see #getPicklist()
	 * @generated
	 */
	EAttribute getPicklist_PicklistId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.Picklist#getCreatedByUserLogin()
	 * @see #getPicklist()
	 * @generated
	 */
	EAttribute getPicklist_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.Picklist#getDescription()
	 * @see #getPicklist()
	 * @generated
	 */
	EAttribute getPicklist_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.Picklist#getFacilityId()
	 * @see #getPicklist()
	 * @generated
	 */
	EReference getPicklist_FacilityId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.Picklist#getLastModifiedByUserLogin()
	 * @see #getPicklist()
	 * @generated
	 */
	EAttribute getPicklist_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getPicklistDate <em>Picklist Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Picklist Date</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.Picklist#getPicklistDate()
	 * @see #getPicklist()
	 * @generated
	 */
	EAttribute getPicklist_PicklistDate();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getPicklistStatusHistories <em>Picklist Status Histories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Picklist Status Histories</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.Picklist#getPicklistStatusHistories()
	 * @see #getPicklist()
	 * @generated
	 */
	EReference getPicklist_PicklistStatusHistories();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Method Type Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.Picklist#getShipmentMethodTypeId()
	 * @see #getPicklist()
	 * @generated
	 */
	EReference getPicklist_ShipmentMethodTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.picklist.Picklist#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.Picklist#getStatusId()
	 * @see #getPicklist()
	 * @generated
	 */
	EReference getPicklist_StatusId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.picklist.PicklistBin <em>Bin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bin</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistBin
	 * @generated
	 */
	EClass getPicklistBin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.picklist.PicklistBin#getPicklistBinId <em>Picklist Bin Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Picklist Bin Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistBin#getPicklistBinId()
	 * @see #getPicklistBin()
	 * @generated
	 */
	EAttribute getPicklistBin_PicklistBinId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.picklist.PicklistBin#getBinLocationNumber <em>Bin Location Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bin Location Number</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistBin#getBinLocationNumber()
	 * @see #getPicklistBin()
	 * @generated
	 */
	EAttribute getPicklistBin_BinLocationNumber();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.picklist.PicklistBin#getPicklistId <em>Picklist Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Picklist Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistBin#getPicklistId()
	 * @see #getPicklistBin()
	 * @generated
	 */
	EReference getPicklistBin_PicklistId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.picklist.PicklistBin#getPrimaryOrderId <em>Primary Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Order Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistBin#getPrimaryOrderId()
	 * @see #getPicklistBin()
	 * @generated
	 */
	EReference getPicklistBin_PrimaryOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.picklist.PicklistBin#getPrimaryShipGroupSeqId <em>Primary Ship Group Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Ship Group Seq Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistBin#getPrimaryShipGroupSeqId()
	 * @see #getPicklistBin()
	 * @generated
	 */
	EAttribute getPicklistBin_PrimaryShipGroupSeqId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.picklist.PicklistItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistItem
	 * @generated
	 */
	EClass getPicklistItem();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.picklist.PicklistItem#getPicklistBinId <em>Picklist Bin Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Picklist Bin Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistItem#getPicklistBinId()
	 * @see #getPicklistItem()
	 * @generated
	 */
	EReference getPicklistItem_PicklistBinId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.picklist.PicklistItem#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistItem#getOrderId()
	 * @see #getPicklistItem()
	 * @generated
	 */
	EReference getPicklistItem_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.picklist.PicklistItem#getOrderItemSeqId <em>Order Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistItem#getOrderItemSeqId()
	 * @see #getPicklistItem()
	 * @generated
	 */
	EAttribute getPicklistItem_OrderItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.picklist.PicklistItem#getShipGroupSeqId <em>Ship Group Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ship Group Seq Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistItem#getShipGroupSeqId()
	 * @see #getPicklistItem()
	 * @generated
	 */
	EAttribute getPicklistItem_ShipGroupSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.picklist.PicklistItem#getInventoryItemId <em>Inventory Item Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Item Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistItem#getInventoryItemId()
	 * @see #getPicklistItem()
	 * @generated
	 */
	EReference getPicklistItem_InventoryItemId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.picklist.PicklistItem#getItemStatusId <em>Item Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Status Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistItem#getItemStatusId()
	 * @see #getPicklistItem()
	 * @generated
	 */
	EReference getPicklistItem_ItemStatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.picklist.PicklistItem#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistItem#getQuantity()
	 * @see #getPicklistItem()
	 * @generated
	 */
	EAttribute getPicklistItem_Quantity();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.picklist.PicklistRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistRole
	 * @generated
	 */
	EClass getPicklistRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.picklist.PicklistRole#getPicklistId <em>Picklist Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Picklist Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistRole#getPicklistId()
	 * @see #getPicklistRole()
	 * @generated
	 */
	EReference getPicklistRole_PicklistId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.picklist.PicklistRole#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistRole#getPartyId()
	 * @see #getPicklistRole()
	 * @generated
	 */
	EAttribute getPicklistRole_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.picklist.PicklistRole#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistRole#getRoleTypeId()
	 * @see #getPicklistRole()
	 * @generated
	 */
	EReference getPicklistRole_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.picklist.PicklistRole#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistRole#getFromDate()
	 * @see #getPicklistRole()
	 * @generated
	 */
	EAttribute getPicklistRole_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.picklist.PicklistRole#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistRole#getCreatedByUserLogin()
	 * @see #getPicklistRole()
	 * @generated
	 */
	EReference getPicklistRole_CreatedByUserLogin();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.picklist.PicklistRole#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistRole#getLastModifiedByUserLogin()
	 * @see #getPicklistRole()
	 * @generated
	 */
	EReference getPicklistRole_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.picklist.PicklistRole#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistRole#getThruDate()
	 * @see #getPicklistRole()
	 * @generated
	 */
	EAttribute getPicklistRole_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory <em>Status History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status History</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory
	 * @generated
	 */
	EClass getPicklistStatusHistory();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory#getPicklistId <em>Picklist Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Picklist Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory#getPicklistId()
	 * @see #getPicklistStatusHistory()
	 * @generated
	 */
	EReference getPicklistStatusHistory_PicklistId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory#getChangeDate <em>Change Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Date</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory#getChangeDate()
	 * @see #getPicklistStatusHistory()
	 * @generated
	 */
	EAttribute getPicklistStatusHistory_ChangeDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory#getChangeUserLoginId <em>Change User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change User Login Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory#getChangeUserLoginId()
	 * @see #getPicklistStatusHistory()
	 * @generated
	 */
	EReference getPicklistStatusHistory_ChangeUserLoginId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory#getStatusId()
	 * @see #getPicklistStatusHistory()
	 * @generated
	 */
	EReference getPicklistStatusHistory_StatusId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory#getStatusIdTo <em>Status Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id To</em>'.
	 * @see org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory#getStatusIdTo()
	 * @see #getPicklistStatusHistory()
	 * @generated
	 */
	EReference getPicklistStatusHistory_StatusIdTo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PicklistFactory getPicklistFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistImpl <em>Picklist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.picklist.impl.PicklistImpl
		 * @see org.abchip.mimo.biz.shipment.picklist.impl.PicklistPackageImpl#getPicklist()
		 * @generated
		 */
		EClass PICKLIST = eINSTANCE.getPicklist();

		/**
		 * The meta object literal for the '<em><b>Picklist Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICKLIST__PICKLIST_ID = eINSTANCE.getPicklist_PicklistId();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICKLIST__CREATED_BY_USER_LOGIN = eINSTANCE.getPicklist_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICKLIST__DESCRIPTION = eINSTANCE.getPicklist_Description();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICKLIST__FACILITY_ID = eINSTANCE.getPicklist_FacilityId();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICKLIST__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getPicklist_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Picklist Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICKLIST__PICKLIST_DATE = eINSTANCE.getPicklist_PicklistDate();

		/**
		 * The meta object literal for the '<em><b>Picklist Status Histories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICKLIST__PICKLIST_STATUS_HISTORIES = eINSTANCE.getPicklist_PicklistStatusHistories();

		/**
		 * The meta object literal for the '<em><b>Shipment Method Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICKLIST__SHIPMENT_METHOD_TYPE_ID = eINSTANCE.getPicklist_ShipmentMethodTypeId();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICKLIST__STATUS_ID = eINSTANCE.getPicklist_StatusId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistBinImpl <em>Bin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.picklist.impl.PicklistBinImpl
		 * @see org.abchip.mimo.biz.shipment.picklist.impl.PicklistPackageImpl#getPicklistBin()
		 * @generated
		 */
		EClass PICKLIST_BIN = eINSTANCE.getPicklistBin();

		/**
		 * The meta object literal for the '<em><b>Picklist Bin Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICKLIST_BIN__PICKLIST_BIN_ID = eINSTANCE.getPicklistBin_PicklistBinId();

		/**
		 * The meta object literal for the '<em><b>Bin Location Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICKLIST_BIN__BIN_LOCATION_NUMBER = eINSTANCE.getPicklistBin_BinLocationNumber();

		/**
		 * The meta object literal for the '<em><b>Picklist Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICKLIST_BIN__PICKLIST_ID = eINSTANCE.getPicklistBin_PicklistId();

		/**
		 * The meta object literal for the '<em><b>Primary Order Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICKLIST_BIN__PRIMARY_ORDER_ID = eINSTANCE.getPicklistBin_PrimaryOrderId();

		/**
		 * The meta object literal for the '<em><b>Primary Ship Group Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICKLIST_BIN__PRIMARY_SHIP_GROUP_SEQ_ID = eINSTANCE.getPicklistBin_PrimaryShipGroupSeqId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.picklist.impl.PicklistItemImpl
		 * @see org.abchip.mimo.biz.shipment.picklist.impl.PicklistPackageImpl#getPicklistItem()
		 * @generated
		 */
		EClass PICKLIST_ITEM = eINSTANCE.getPicklistItem();

		/**
		 * The meta object literal for the '<em><b>Picklist Bin Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICKLIST_ITEM__PICKLIST_BIN_ID = eINSTANCE.getPicklistItem_PicklistBinId();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICKLIST_ITEM__ORDER_ID = eINSTANCE.getPicklistItem_OrderId();

		/**
		 * The meta object literal for the '<em><b>Order Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICKLIST_ITEM__ORDER_ITEM_SEQ_ID = eINSTANCE.getPicklistItem_OrderItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Ship Group Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICKLIST_ITEM__SHIP_GROUP_SEQ_ID = eINSTANCE.getPicklistItem_ShipGroupSeqId();

		/**
		 * The meta object literal for the '<em><b>Inventory Item Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICKLIST_ITEM__INVENTORY_ITEM_ID = eINSTANCE.getPicklistItem_InventoryItemId();

		/**
		 * The meta object literal for the '<em><b>Item Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICKLIST_ITEM__ITEM_STATUS_ID = eINSTANCE.getPicklistItem_ItemStatusId();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICKLIST_ITEM__QUANTITY = eINSTANCE.getPicklistItem_Quantity();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistRoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.picklist.impl.PicklistRoleImpl
		 * @see org.abchip.mimo.biz.shipment.picklist.impl.PicklistPackageImpl#getPicklistRole()
		 * @generated
		 */
		EClass PICKLIST_ROLE = eINSTANCE.getPicklistRole();

		/**
		 * The meta object literal for the '<em><b>Picklist Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICKLIST_ROLE__PICKLIST_ID = eINSTANCE.getPicklistRole_PicklistId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICKLIST_ROLE__PARTY_ID = eINSTANCE.getPicklistRole_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICKLIST_ROLE__ROLE_TYPE_ID = eINSTANCE.getPicklistRole_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICKLIST_ROLE__FROM_DATE = eINSTANCE.getPicklistRole_FromDate();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICKLIST_ROLE__CREATED_BY_USER_LOGIN = eINSTANCE.getPicklistRole_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICKLIST_ROLE__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getPicklistRole_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICKLIST_ROLE__THRU_DATE = eINSTANCE.getPicklistRole_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistStatusHistoryImpl <em>Status History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.picklist.impl.PicklistStatusHistoryImpl
		 * @see org.abchip.mimo.biz.shipment.picklist.impl.PicklistPackageImpl#getPicklistStatusHistory()
		 * @generated
		 */
		EClass PICKLIST_STATUS_HISTORY = eINSTANCE.getPicklistStatusHistory();

		/**
		 * The meta object literal for the '<em><b>Picklist Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICKLIST_STATUS_HISTORY__PICKLIST_ID = eINSTANCE.getPicklistStatusHistory_PicklistId();

		/**
		 * The meta object literal for the '<em><b>Change Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PICKLIST_STATUS_HISTORY__CHANGE_DATE = eINSTANCE.getPicklistStatusHistory_ChangeDate();

		/**
		 * The meta object literal for the '<em><b>Change User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICKLIST_STATUS_HISTORY__CHANGE_USER_LOGIN_ID = eINSTANCE.getPicklistStatusHistory_ChangeUserLoginId();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICKLIST_STATUS_HISTORY__STATUS_ID = eINSTANCE.getPicklistStatusHistory_StatusId();

		/**
		 * The meta object literal for the '<em><b>Status Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PICKLIST_STATUS_HISTORY__STATUS_ID_TO = eINSTANCE.getPicklistStatusHistory_StatusIdTo();

	}

} //PicklistPackage
