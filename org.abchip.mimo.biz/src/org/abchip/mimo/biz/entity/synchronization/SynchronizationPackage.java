/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.synchronization;

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
 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationFactory
 * @model kind="package"
 * @generated
 */
public interface SynchronizationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "synchronization";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/entity/synchronization";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-synchronization";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SynchronizationPackage eINSTANCE = org.abchip.mimo.biz.entity.synchronization.impl.SynchronizationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncImpl <em>Entity Sync</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncImpl
	 * @see org.abchip.mimo.biz.entity.synchronization.impl.SynchronizationPackageImpl#getEntitySync()
	 * @generated
	 */
	int ENTITY_SYNC = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Entity Sync Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC__ENTITY_SYNC_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity Sync Histories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC__ENTITY_SYNC_HISTORIES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entity Sync Include Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC__ENTITY_SYNC_INCLUDE_GROUPS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entity Sync Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC__ENTITY_SYNC_INCLUDES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>For Pull Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC__FOR_PULL_ONLY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>For Push Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC__FOR_PUSH_ONLY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Keep Remove Info Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC__KEEP_REMOVE_INFO_HOURS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Last History Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC__LAST_HISTORY_START_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Last Successful Synch Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC__LAST_SUCCESSFUL_SYNCH_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Max Running No Update Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC__MAX_RUNNING_NO_UPDATE_MILLIS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Offline Sync Split Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC__OFFLINE_SYNC_SPLIT_MILLIS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Pre Offline Synch Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC__PRE_OFFLINE_SYNCH_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Run Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC__RUN_STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Sync End Buffer Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC__SYNC_END_BUFFER_MILLIS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Sync Split Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC__SYNC_SPLIT_MILLIS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Target Delegator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC__TARGET_DELEGATOR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Target Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC__TARGET_SERVICE_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Entity Sync</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl <em>Entity Sync History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl
	 * @see org.abchip.mimo.biz.entity.synchronization.impl.SynchronizationPackageImpl#getEntitySyncHistory()
	 * @generated
	 */
	int ENTITY_SYNC_HISTORY = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Entity Sync Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__ENTITY_SYNC_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__START_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Beginning Synch Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__BEGINNING_SYNCH_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Candidate End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__LAST_CANDIDATE_END_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Last Split Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__LAST_SPLIT_START_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Last Successful Synch Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__LAST_SUCCESSFUL_SYNCH_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Per Split Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__PER_SPLIT_MAX_ITEMS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Per Split Max Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__PER_SPLIT_MAX_MILLIS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Per Split Min Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__PER_SPLIT_MIN_ITEMS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Per Split Min Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__PER_SPLIT_MIN_MILLIS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Run Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__RUN_STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Running Time Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__RUNNING_TIME_MILLIS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>To Create Inserted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__TO_CREATE_INSERTED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>To Create Not Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__TO_CREATE_NOT_UPDATED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>To Create Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__TO_CREATE_UPDATED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>To Remove Already Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__TO_REMOVE_ALREADY_DELETED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>To Remove Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__TO_REMOVE_DELETED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>To Store Inserted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__TO_STORE_INSERTED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>To Store Not Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__TO_STORE_NOT_UPDATED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>To Store Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__TO_STORE_UPDATED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Total Rows Exported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__TOTAL_ROWS_EXPORTED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Total Rows To Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_CREATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Total Rows To Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_REMOVE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Total Rows To Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_STORE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Total Splits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__TOTAL_SPLITS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Total Store Calls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY__TOTAL_STORE_CALLS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>Entity Sync History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_HISTORY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 26;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncIncludeImpl <em>Entity Sync Include</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncIncludeImpl
	 * @see org.abchip.mimo.biz.entity.synchronization.impl.SynchronizationPackageImpl#getEntitySyncInclude()
	 * @generated
	 */
	int ENTITY_SYNC_INCLUDE = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_INCLUDE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_INCLUDE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_INCLUDE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_INCLUDE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Entity Sync Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_INCLUDE__ENTITY_SYNC_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity Or Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_INCLUDE__ENTITY_OR_PACKAGE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Appl Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_INCLUDE__APPL_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity Sync Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_INCLUDE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncIncludeGroupImpl <em>Entity Sync Include Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncIncludeGroupImpl
	 * @see org.abchip.mimo.biz.entity.synchronization.impl.SynchronizationPackageImpl#getEntitySyncIncludeGroup()
	 * @generated
	 */
	int ENTITY_SYNC_INCLUDE_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_INCLUDE_GROUP__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_INCLUDE_GROUP__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_INCLUDE_GROUP__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_INCLUDE_GROUP__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Entity Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_INCLUDE_GROUP__ENTITY_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity Sync Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_INCLUDE_GROUP__ENTITY_SYNC_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entity Sync Include Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_INCLUDE_GROUP_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncRemoveImpl <em>Entity Sync Remove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncRemoveImpl
	 * @see org.abchip.mimo.biz.entity.synchronization.impl.SynchronizationPackageImpl#getEntitySyncRemove()
	 * @generated
	 */
	int ENTITY_SYNC_REMOVE = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_REMOVE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_REMOVE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_REMOVE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_REMOVE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Entity Sync Remove Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_REMOVE__ENTITY_SYNC_REMOVE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Primary Key Removed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_REMOVE__PRIMARY_KEY_REMOVED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entity Sync Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SYNC_REMOVE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync <em>Entity Sync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Sync</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySync
	 * @generated
	 */
	EClass getEntitySync();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getEntitySyncId <em>Entity Sync Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Sync Id</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySync#getEntitySyncId()
	 * @see #getEntitySync()
	 * @generated
	 */
	EAttribute getEntitySync_EntitySyncId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getEntitySyncHistories <em>Entity Sync Histories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entity Sync Histories</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySync#getEntitySyncHistories()
	 * @see #getEntitySync()
	 * @generated
	 */
	EReference getEntitySync_EntitySyncHistories();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getEntitySyncIncludeGroups <em>Entity Sync Include Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entity Sync Include Groups</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySync#getEntitySyncIncludeGroups()
	 * @see #getEntitySync()
	 * @generated
	 */
	EReference getEntitySync_EntitySyncIncludeGroups();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getEntitySyncIncludes <em>Entity Sync Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entity Sync Includes</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySync#getEntitySyncIncludes()
	 * @see #getEntitySync()
	 * @generated
	 */
	EReference getEntitySync_EntitySyncIncludes();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#isForPullOnly <em>For Pull Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Pull Only</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySync#isForPullOnly()
	 * @see #getEntitySync()
	 * @generated
	 */
	EAttribute getEntitySync_ForPullOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#isForPushOnly <em>For Push Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Push Only</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySync#isForPushOnly()
	 * @see #getEntitySync()
	 * @generated
	 */
	EAttribute getEntitySync_ForPushOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getKeepRemoveInfoHours <em>Keep Remove Info Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keep Remove Info Hours</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySync#getKeepRemoveInfoHours()
	 * @see #getEntitySync()
	 * @generated
	 */
	EAttribute getEntitySync_KeepRemoveInfoHours();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getLastHistoryStartDate <em>Last History Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last History Start Date</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySync#getLastHistoryStartDate()
	 * @see #getEntitySync()
	 * @generated
	 */
	EAttribute getEntitySync_LastHistoryStartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getLastSuccessfulSynchTime <em>Last Successful Synch Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Successful Synch Time</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySync#getLastSuccessfulSynchTime()
	 * @see #getEntitySync()
	 * @generated
	 */
	EAttribute getEntitySync_LastSuccessfulSynchTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getMaxRunningNoUpdateMillis <em>Max Running No Update Millis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Running No Update Millis</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySync#getMaxRunningNoUpdateMillis()
	 * @see #getEntitySync()
	 * @generated
	 */
	EAttribute getEntitySync_MaxRunningNoUpdateMillis();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getOfflineSyncSplitMillis <em>Offline Sync Split Millis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offline Sync Split Millis</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySync#getOfflineSyncSplitMillis()
	 * @see #getEntitySync()
	 * @generated
	 */
	EAttribute getEntitySync_OfflineSyncSplitMillis();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getPreOfflineSynchTime <em>Pre Offline Synch Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre Offline Synch Time</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySync#getPreOfflineSynchTime()
	 * @see #getEntitySync()
	 * @generated
	 */
	EAttribute getEntitySync_PreOfflineSynchTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getRunStatusId <em>Run Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run Status Id</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySync#getRunStatusId()
	 * @see #getEntitySync()
	 * @generated
	 */
	EAttribute getEntitySync_RunStatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getSyncEndBufferMillis <em>Sync End Buffer Millis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync End Buffer Millis</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySync#getSyncEndBufferMillis()
	 * @see #getEntitySync()
	 * @generated
	 */
	EAttribute getEntitySync_SyncEndBufferMillis();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getSyncSplitMillis <em>Sync Split Millis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync Split Millis</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySync#getSyncSplitMillis()
	 * @see #getEntitySync()
	 * @generated
	 */
	EAttribute getEntitySync_SyncSplitMillis();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getTargetDelegatorName <em>Target Delegator Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Delegator Name</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySync#getTargetDelegatorName()
	 * @see #getEntitySync()
	 * @generated
	 */
	EAttribute getEntitySync_TargetDelegatorName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getTargetServiceName <em>Target Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Service Name</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySync#getTargetServiceName()
	 * @see #getEntitySync()
	 * @generated
	 */
	EAttribute getEntitySync_TargetServiceName();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory <em>Entity Sync History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Sync History</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory
	 * @generated
	 */
	EClass getEntitySyncHistory();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getEntitySyncId <em>Entity Sync Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity Sync Id</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getEntitySyncId()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EReference getEntitySyncHistory_EntitySyncId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getStartDate()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EAttribute getEntitySyncHistory_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getBeginningSynchTime <em>Beginning Synch Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginning Synch Time</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getBeginningSynchTime()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EAttribute getEntitySyncHistory_BeginningSynchTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getLastCandidateEndTime <em>Last Candidate End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Candidate End Time</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getLastCandidateEndTime()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EAttribute getEntitySyncHistory_LastCandidateEndTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getLastSplitStartTime <em>Last Split Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Split Start Time</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getLastSplitStartTime()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EAttribute getEntitySyncHistory_LastSplitStartTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getLastSuccessfulSynchTime <em>Last Successful Synch Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Successful Synch Time</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getLastSuccessfulSynchTime()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EAttribute getEntitySyncHistory_LastSuccessfulSynchTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getPerSplitMaxItems <em>Per Split Max Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Per Split Max Items</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getPerSplitMaxItems()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EAttribute getEntitySyncHistory_PerSplitMaxItems();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getPerSplitMaxMillis <em>Per Split Max Millis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Per Split Max Millis</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getPerSplitMaxMillis()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EAttribute getEntitySyncHistory_PerSplitMaxMillis();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getPerSplitMinItems <em>Per Split Min Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Per Split Min Items</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getPerSplitMinItems()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EAttribute getEntitySyncHistory_PerSplitMinItems();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getPerSplitMinMillis <em>Per Split Min Millis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Per Split Min Millis</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getPerSplitMinMillis()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EAttribute getEntitySyncHistory_PerSplitMinMillis();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getRunStatusId <em>Run Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run Status Id</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getRunStatusId()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EAttribute getEntitySyncHistory_RunStatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getRunningTimeMillis <em>Running Time Millis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running Time Millis</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getRunningTimeMillis()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EAttribute getEntitySyncHistory_RunningTimeMillis();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToCreateInserted <em>To Create Inserted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Create Inserted</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToCreateInserted()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EAttribute getEntitySyncHistory_ToCreateInserted();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToCreateNotUpdated <em>To Create Not Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Create Not Updated</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToCreateNotUpdated()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EAttribute getEntitySyncHistory_ToCreateNotUpdated();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToCreateUpdated <em>To Create Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Create Updated</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToCreateUpdated()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EAttribute getEntitySyncHistory_ToCreateUpdated();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToRemoveAlreadyDeleted <em>To Remove Already Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Remove Already Deleted</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToRemoveAlreadyDeleted()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EAttribute getEntitySyncHistory_ToRemoveAlreadyDeleted();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToRemoveDeleted <em>To Remove Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Remove Deleted</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToRemoveDeleted()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EAttribute getEntitySyncHistory_ToRemoveDeleted();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToStoreInserted <em>To Store Inserted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Store Inserted</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToStoreInserted()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EAttribute getEntitySyncHistory_ToStoreInserted();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToStoreNotUpdated <em>To Store Not Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Store Not Updated</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToStoreNotUpdated()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EAttribute getEntitySyncHistory_ToStoreNotUpdated();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToStoreUpdated <em>To Store Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Store Updated</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToStoreUpdated()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EAttribute getEntitySyncHistory_ToStoreUpdated();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getTotalRowsExported <em>Total Rows Exported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Rows Exported</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getTotalRowsExported()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EAttribute getEntitySyncHistory_TotalRowsExported();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getTotalRowsToCreate <em>Total Rows To Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Rows To Create</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getTotalRowsToCreate()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EAttribute getEntitySyncHistory_TotalRowsToCreate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getTotalRowsToRemove <em>Total Rows To Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Rows To Remove</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getTotalRowsToRemove()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EAttribute getEntitySyncHistory_TotalRowsToRemove();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getTotalRowsToStore <em>Total Rows To Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Rows To Store</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getTotalRowsToStore()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EAttribute getEntitySyncHistory_TotalRowsToStore();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getTotalSplits <em>Total Splits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Splits</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getTotalSplits()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EAttribute getEntitySyncHistory_TotalSplits();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getTotalStoreCalls <em>Total Store Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Store Calls</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getTotalStoreCalls()
	 * @see #getEntitySyncHistory()
	 * @generated
	 */
	EAttribute getEntitySyncHistory_TotalStoreCalls();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncInclude <em>Entity Sync Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Sync Include</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncInclude
	 * @generated
	 */
	EClass getEntitySyncInclude();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncInclude#getEntitySyncId <em>Entity Sync Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity Sync Id</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncInclude#getEntitySyncId()
	 * @see #getEntitySyncInclude()
	 * @generated
	 */
	EReference getEntitySyncInclude_EntitySyncId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncInclude#getEntityOrPackage <em>Entity Or Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Or Package</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncInclude#getEntityOrPackage()
	 * @see #getEntitySyncInclude()
	 * @generated
	 */
	EAttribute getEntitySyncInclude_EntityOrPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncInclude#getApplEnumId <em>Appl Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Appl Enum Id</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncInclude#getApplEnumId()
	 * @see #getEntitySyncInclude()
	 * @generated
	 */
	EAttribute getEntitySyncInclude_ApplEnumId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncIncludeGroup <em>Entity Sync Include Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Sync Include Group</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncIncludeGroup
	 * @generated
	 */
	EClass getEntitySyncIncludeGroup();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncIncludeGroup#getEntitySyncId <em>Entity Sync Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity Sync Id</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncIncludeGroup#getEntitySyncId()
	 * @see #getEntitySyncIncludeGroup()
	 * @generated
	 */
	EReference getEntitySyncIncludeGroup_EntitySyncId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncIncludeGroup#getEntityGroupId <em>Entity Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity Group Id</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncIncludeGroup#getEntityGroupId()
	 * @see #getEntitySyncIncludeGroup()
	 * @generated
	 */
	EReference getEntitySyncIncludeGroup_EntityGroupId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncRemove <em>Entity Sync Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Sync Remove</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncRemove
	 * @generated
	 */
	EClass getEntitySyncRemove();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncRemove#getEntitySyncRemoveId <em>Entity Sync Remove Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Sync Remove Id</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncRemove#getEntitySyncRemoveId()
	 * @see #getEntitySyncRemove()
	 * @generated
	 */
	EAttribute getEntitySyncRemove_EntitySyncRemoveId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncRemove#getPrimaryKeyRemoved <em>Primary Key Removed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Key Removed</em>'.
	 * @see org.abchip.mimo.biz.entity.synchronization.EntitySyncRemove#getPrimaryKeyRemoved()
	 * @see #getEntitySyncRemove()
	 * @generated
	 */
	EAttribute getEntitySyncRemove_PrimaryKeyRemoved();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SynchronizationFactory getSynchronizationFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncImpl <em>Entity Sync</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncImpl
		 * @see org.abchip.mimo.biz.entity.synchronization.impl.SynchronizationPackageImpl#getEntitySync()
		 * @generated
		 */
		EClass ENTITY_SYNC = eINSTANCE.getEntitySync();

		/**
		 * The meta object literal for the '<em><b>Entity Sync Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC__ENTITY_SYNC_ID = eINSTANCE.getEntitySync_EntitySyncId();

		/**
		 * The meta object literal for the '<em><b>Entity Sync Histories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_SYNC__ENTITY_SYNC_HISTORIES = eINSTANCE.getEntitySync_EntitySyncHistories();

		/**
		 * The meta object literal for the '<em><b>Entity Sync Include Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_SYNC__ENTITY_SYNC_INCLUDE_GROUPS = eINSTANCE.getEntitySync_EntitySyncIncludeGroups();

		/**
		 * The meta object literal for the '<em><b>Entity Sync Includes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_SYNC__ENTITY_SYNC_INCLUDES = eINSTANCE.getEntitySync_EntitySyncIncludes();

		/**
		 * The meta object literal for the '<em><b>For Pull Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC__FOR_PULL_ONLY = eINSTANCE.getEntitySync_ForPullOnly();

		/**
		 * The meta object literal for the '<em><b>For Push Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC__FOR_PUSH_ONLY = eINSTANCE.getEntitySync_ForPushOnly();

		/**
		 * The meta object literal for the '<em><b>Keep Remove Info Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC__KEEP_REMOVE_INFO_HOURS = eINSTANCE.getEntitySync_KeepRemoveInfoHours();

		/**
		 * The meta object literal for the '<em><b>Last History Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC__LAST_HISTORY_START_DATE = eINSTANCE.getEntitySync_LastHistoryStartDate();

		/**
		 * The meta object literal for the '<em><b>Last Successful Synch Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC__LAST_SUCCESSFUL_SYNCH_TIME = eINSTANCE.getEntitySync_LastSuccessfulSynchTime();

		/**
		 * The meta object literal for the '<em><b>Max Running No Update Millis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC__MAX_RUNNING_NO_UPDATE_MILLIS = eINSTANCE.getEntitySync_MaxRunningNoUpdateMillis();

		/**
		 * The meta object literal for the '<em><b>Offline Sync Split Millis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC__OFFLINE_SYNC_SPLIT_MILLIS = eINSTANCE.getEntitySync_OfflineSyncSplitMillis();

		/**
		 * The meta object literal for the '<em><b>Pre Offline Synch Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC__PRE_OFFLINE_SYNCH_TIME = eINSTANCE.getEntitySync_PreOfflineSynchTime();

		/**
		 * The meta object literal for the '<em><b>Run Status Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC__RUN_STATUS_ID = eINSTANCE.getEntitySync_RunStatusId();

		/**
		 * The meta object literal for the '<em><b>Sync End Buffer Millis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC__SYNC_END_BUFFER_MILLIS = eINSTANCE.getEntitySync_SyncEndBufferMillis();

		/**
		 * The meta object literal for the '<em><b>Sync Split Millis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC__SYNC_SPLIT_MILLIS = eINSTANCE.getEntitySync_SyncSplitMillis();

		/**
		 * The meta object literal for the '<em><b>Target Delegator Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC__TARGET_DELEGATOR_NAME = eINSTANCE.getEntitySync_TargetDelegatorName();

		/**
		 * The meta object literal for the '<em><b>Target Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC__TARGET_SERVICE_NAME = eINSTANCE.getEntitySync_TargetServiceName();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl <em>Entity Sync History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl
		 * @see org.abchip.mimo.biz.entity.synchronization.impl.SynchronizationPackageImpl#getEntitySyncHistory()
		 * @generated
		 */
		EClass ENTITY_SYNC_HISTORY = eINSTANCE.getEntitySyncHistory();

		/**
		 * The meta object literal for the '<em><b>Entity Sync Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_SYNC_HISTORY__ENTITY_SYNC_ID = eINSTANCE.getEntitySyncHistory_EntitySyncId();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_HISTORY__START_DATE = eINSTANCE.getEntitySyncHistory_StartDate();

		/**
		 * The meta object literal for the '<em><b>Beginning Synch Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_HISTORY__BEGINNING_SYNCH_TIME = eINSTANCE.getEntitySyncHistory_BeginningSynchTime();

		/**
		 * The meta object literal for the '<em><b>Last Candidate End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_HISTORY__LAST_CANDIDATE_END_TIME = eINSTANCE.getEntitySyncHistory_LastCandidateEndTime();

		/**
		 * The meta object literal for the '<em><b>Last Split Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_HISTORY__LAST_SPLIT_START_TIME = eINSTANCE.getEntitySyncHistory_LastSplitStartTime();

		/**
		 * The meta object literal for the '<em><b>Last Successful Synch Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_HISTORY__LAST_SUCCESSFUL_SYNCH_TIME = eINSTANCE.getEntitySyncHistory_LastSuccessfulSynchTime();

		/**
		 * The meta object literal for the '<em><b>Per Split Max Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_HISTORY__PER_SPLIT_MAX_ITEMS = eINSTANCE.getEntitySyncHistory_PerSplitMaxItems();

		/**
		 * The meta object literal for the '<em><b>Per Split Max Millis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_HISTORY__PER_SPLIT_MAX_MILLIS = eINSTANCE.getEntitySyncHistory_PerSplitMaxMillis();

		/**
		 * The meta object literal for the '<em><b>Per Split Min Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_HISTORY__PER_SPLIT_MIN_ITEMS = eINSTANCE.getEntitySyncHistory_PerSplitMinItems();

		/**
		 * The meta object literal for the '<em><b>Per Split Min Millis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_HISTORY__PER_SPLIT_MIN_MILLIS = eINSTANCE.getEntitySyncHistory_PerSplitMinMillis();

		/**
		 * The meta object literal for the '<em><b>Run Status Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_HISTORY__RUN_STATUS_ID = eINSTANCE.getEntitySyncHistory_RunStatusId();

		/**
		 * The meta object literal for the '<em><b>Running Time Millis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_HISTORY__RUNNING_TIME_MILLIS = eINSTANCE.getEntitySyncHistory_RunningTimeMillis();

		/**
		 * The meta object literal for the '<em><b>To Create Inserted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_HISTORY__TO_CREATE_INSERTED = eINSTANCE.getEntitySyncHistory_ToCreateInserted();

		/**
		 * The meta object literal for the '<em><b>To Create Not Updated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_HISTORY__TO_CREATE_NOT_UPDATED = eINSTANCE.getEntitySyncHistory_ToCreateNotUpdated();

		/**
		 * The meta object literal for the '<em><b>To Create Updated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_HISTORY__TO_CREATE_UPDATED = eINSTANCE.getEntitySyncHistory_ToCreateUpdated();

		/**
		 * The meta object literal for the '<em><b>To Remove Already Deleted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_HISTORY__TO_REMOVE_ALREADY_DELETED = eINSTANCE.getEntitySyncHistory_ToRemoveAlreadyDeleted();

		/**
		 * The meta object literal for the '<em><b>To Remove Deleted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_HISTORY__TO_REMOVE_DELETED = eINSTANCE.getEntitySyncHistory_ToRemoveDeleted();

		/**
		 * The meta object literal for the '<em><b>To Store Inserted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_HISTORY__TO_STORE_INSERTED = eINSTANCE.getEntitySyncHistory_ToStoreInserted();

		/**
		 * The meta object literal for the '<em><b>To Store Not Updated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_HISTORY__TO_STORE_NOT_UPDATED = eINSTANCE.getEntitySyncHistory_ToStoreNotUpdated();

		/**
		 * The meta object literal for the '<em><b>To Store Updated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_HISTORY__TO_STORE_UPDATED = eINSTANCE.getEntitySyncHistory_ToStoreUpdated();

		/**
		 * The meta object literal for the '<em><b>Total Rows Exported</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_HISTORY__TOTAL_ROWS_EXPORTED = eINSTANCE.getEntitySyncHistory_TotalRowsExported();

		/**
		 * The meta object literal for the '<em><b>Total Rows To Create</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_CREATE = eINSTANCE.getEntitySyncHistory_TotalRowsToCreate();

		/**
		 * The meta object literal for the '<em><b>Total Rows To Remove</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_REMOVE = eINSTANCE.getEntitySyncHistory_TotalRowsToRemove();

		/**
		 * The meta object literal for the '<em><b>Total Rows To Store</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_STORE = eINSTANCE.getEntitySyncHistory_TotalRowsToStore();

		/**
		 * The meta object literal for the '<em><b>Total Splits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_HISTORY__TOTAL_SPLITS = eINSTANCE.getEntitySyncHistory_TotalSplits();

		/**
		 * The meta object literal for the '<em><b>Total Store Calls</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_HISTORY__TOTAL_STORE_CALLS = eINSTANCE.getEntitySyncHistory_TotalStoreCalls();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncIncludeImpl <em>Entity Sync Include</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncIncludeImpl
		 * @see org.abchip.mimo.biz.entity.synchronization.impl.SynchronizationPackageImpl#getEntitySyncInclude()
		 * @generated
		 */
		EClass ENTITY_SYNC_INCLUDE = eINSTANCE.getEntitySyncInclude();

		/**
		 * The meta object literal for the '<em><b>Entity Sync Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_SYNC_INCLUDE__ENTITY_SYNC_ID = eINSTANCE.getEntitySyncInclude_EntitySyncId();

		/**
		 * The meta object literal for the '<em><b>Entity Or Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_INCLUDE__ENTITY_OR_PACKAGE = eINSTANCE.getEntitySyncInclude_EntityOrPackage();

		/**
		 * The meta object literal for the '<em><b>Appl Enum Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_INCLUDE__APPL_ENUM_ID = eINSTANCE.getEntitySyncInclude_ApplEnumId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncIncludeGroupImpl <em>Entity Sync Include Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncIncludeGroupImpl
		 * @see org.abchip.mimo.biz.entity.synchronization.impl.SynchronizationPackageImpl#getEntitySyncIncludeGroup()
		 * @generated
		 */
		EClass ENTITY_SYNC_INCLUDE_GROUP = eINSTANCE.getEntitySyncIncludeGroup();

		/**
		 * The meta object literal for the '<em><b>Entity Sync Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_SYNC_INCLUDE_GROUP__ENTITY_SYNC_ID = eINSTANCE.getEntitySyncIncludeGroup_EntitySyncId();

		/**
		 * The meta object literal for the '<em><b>Entity Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_SYNC_INCLUDE_GROUP__ENTITY_GROUP_ID = eINSTANCE.getEntitySyncIncludeGroup_EntityGroupId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncRemoveImpl <em>Entity Sync Remove</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncRemoveImpl
		 * @see org.abchip.mimo.biz.entity.synchronization.impl.SynchronizationPackageImpl#getEntitySyncRemove()
		 * @generated
		 */
		EClass ENTITY_SYNC_REMOVE = eINSTANCE.getEntitySyncRemove();

		/**
		 * The meta object literal for the '<em><b>Entity Sync Remove Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_REMOVE__ENTITY_SYNC_REMOVE_ID = eINSTANCE.getEntitySyncRemove_EntitySyncRemoveId();

		/**
		 * The meta object literal for the '<em><b>Primary Key Removed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_SYNC_REMOVE__PRIMARY_KEY_REMOVED = eINSTANCE.getEntitySyncRemove_PrimaryKeyRemoved();

	}

} //SynchronizationPackage
