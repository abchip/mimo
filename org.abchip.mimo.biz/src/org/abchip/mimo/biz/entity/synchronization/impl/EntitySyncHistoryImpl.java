/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.synchronization.impl;

import java.util.Date;

import org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory;
import org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Sync History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getEntitySyncId <em>Entity Sync Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getBeginningSynchTime <em>Beginning Synch Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getLastCandidateEndTime <em>Last Candidate End Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getLastSplitStartTime <em>Last Split Start Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getLastSuccessfulSynchTime <em>Last Successful Synch Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getPerSplitMaxItems <em>Per Split Max Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getPerSplitMaxMillis <em>Per Split Max Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getPerSplitMinItems <em>Per Split Min Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getPerSplitMinMillis <em>Per Split Min Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getRunStatusId <em>Run Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getRunningTimeMillis <em>Running Time Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getToCreateInserted <em>To Create Inserted</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getToCreateNotUpdated <em>To Create Not Updated</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getToCreateUpdated <em>To Create Updated</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getToRemoveAlreadyDeleted <em>To Remove Already Deleted</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getToRemoveDeleted <em>To Remove Deleted</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getToStoreInserted <em>To Store Inserted</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getToStoreNotUpdated <em>To Store Not Updated</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getToStoreUpdated <em>To Store Updated</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getTotalRowsExported <em>Total Rows Exported</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getTotalRowsToCreate <em>Total Rows To Create</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getTotalRowsToRemove <em>Total Rows To Remove</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getTotalRowsToStore <em>Total Rows To Store</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getTotalSplits <em>Total Splits</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncHistoryImpl#getTotalStoreCalls <em>Total Store Calls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntitySyncHistoryImpl extends BizEntityImpl implements EntitySyncHistory {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getEntitySyncId() <em>Entity Sync Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitySyncId()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_SYNC_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntitySyncId() <em>Entity Sync Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitySyncId()
	 * @generated
	 * @ordered
	 */
	protected String entitySyncId = ENTITY_SYNC_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getBeginningSynchTime() <em>Beginning Synch Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginningSynchTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date BEGINNING_SYNCH_TIME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBeginningSynchTime() <em>Beginning Synch Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginningSynchTime()
	 * @generated
	 * @ordered
	 */
	protected Date beginningSynchTime = BEGINNING_SYNCH_TIME_EDEFAULT;
	/**
	 * The default value of the '{@link #getLastCandidateEndTime() <em>Last Candidate End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCandidateEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_CANDIDATE_END_TIME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLastCandidateEndTime() <em>Last Candidate End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCandidateEndTime()
	 * @generated
	 * @ordered
	 */
	protected Date lastCandidateEndTime = LAST_CANDIDATE_END_TIME_EDEFAULT;
	/**
	 * The default value of the '{@link #getLastSplitStartTime() <em>Last Split Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSplitStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final long LAST_SPLIT_START_TIME_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getLastSplitStartTime() <em>Last Split Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSplitStartTime()
	 * @generated
	 * @ordered
	 */
	protected long lastSplitStartTime = LAST_SPLIT_START_TIME_EDEFAULT;
	/**
	 * The default value of the '{@link #getLastSuccessfulSynchTime() <em>Last Successful Synch Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSuccessfulSynchTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_SUCCESSFUL_SYNCH_TIME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLastSuccessfulSynchTime() <em>Last Successful Synch Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSuccessfulSynchTime()
	 * @generated
	 * @ordered
	 */
	protected Date lastSuccessfulSynchTime = LAST_SUCCESSFUL_SYNCH_TIME_EDEFAULT;
	/**
	 * The default value of the '{@link #getPerSplitMaxItems() <em>Per Split Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerSplitMaxItems()
	 * @generated
	 * @ordered
	 */
	protected static final long PER_SPLIT_MAX_ITEMS_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getPerSplitMaxItems() <em>Per Split Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerSplitMaxItems()
	 * @generated
	 * @ordered
	 */
	protected long perSplitMaxItems = PER_SPLIT_MAX_ITEMS_EDEFAULT;
	/**
	 * The default value of the '{@link #getPerSplitMaxMillis() <em>Per Split Max Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerSplitMaxMillis()
	 * @generated
	 * @ordered
	 */
	protected static final long PER_SPLIT_MAX_MILLIS_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getPerSplitMaxMillis() <em>Per Split Max Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerSplitMaxMillis()
	 * @generated
	 * @ordered
	 */
	protected long perSplitMaxMillis = PER_SPLIT_MAX_MILLIS_EDEFAULT;
	/**
	 * The default value of the '{@link #getPerSplitMinItems() <em>Per Split Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerSplitMinItems()
	 * @generated
	 * @ordered
	 */
	protected static final long PER_SPLIT_MIN_ITEMS_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getPerSplitMinItems() <em>Per Split Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerSplitMinItems()
	 * @generated
	 * @ordered
	 */
	protected long perSplitMinItems = PER_SPLIT_MIN_ITEMS_EDEFAULT;
	/**
	 * The default value of the '{@link #getPerSplitMinMillis() <em>Per Split Min Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerSplitMinMillis()
	 * @generated
	 * @ordered
	 */
	protected static final long PER_SPLIT_MIN_MILLIS_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getPerSplitMinMillis() <em>Per Split Min Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerSplitMinMillis()
	 * @generated
	 * @ordered
	 */
	protected long perSplitMinMillis = PER_SPLIT_MIN_MILLIS_EDEFAULT;
	/**
	 * The default value of the '{@link #getRunStatusId() <em>Run Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String RUN_STATUS_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRunStatusId() <em>Run Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunStatusId()
	 * @generated
	 * @ordered
	 */
	protected String runStatusId = RUN_STATUS_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getRunningTimeMillis() <em>Running Time Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunningTimeMillis()
	 * @generated
	 * @ordered
	 */
	protected static final long RUNNING_TIME_MILLIS_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getRunningTimeMillis() <em>Running Time Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunningTimeMillis()
	 * @generated
	 * @ordered
	 */
	protected long runningTimeMillis = RUNNING_TIME_MILLIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getToCreateInserted() <em>To Create Inserted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToCreateInserted()
	 * @generated
	 * @ordered
	 */
	protected static final long TO_CREATE_INSERTED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getToCreateInserted() <em>To Create Inserted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToCreateInserted()
	 * @generated
	 * @ordered
	 */
	protected long toCreateInserted = TO_CREATE_INSERTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getToCreateNotUpdated() <em>To Create Not Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToCreateNotUpdated()
	 * @generated
	 * @ordered
	 */
	protected static final long TO_CREATE_NOT_UPDATED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getToCreateNotUpdated() <em>To Create Not Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToCreateNotUpdated()
	 * @generated
	 * @ordered
	 */
	protected long toCreateNotUpdated = TO_CREATE_NOT_UPDATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getToCreateUpdated() <em>To Create Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToCreateUpdated()
	 * @generated
	 * @ordered
	 */
	protected static final long TO_CREATE_UPDATED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getToCreateUpdated() <em>To Create Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToCreateUpdated()
	 * @generated
	 * @ordered
	 */
	protected long toCreateUpdated = TO_CREATE_UPDATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getToRemoveAlreadyDeleted() <em>To Remove Already Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToRemoveAlreadyDeleted()
	 * @generated
	 * @ordered
	 */
	protected static final long TO_REMOVE_ALREADY_DELETED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getToRemoveAlreadyDeleted() <em>To Remove Already Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToRemoveAlreadyDeleted()
	 * @generated
	 * @ordered
	 */
	protected long toRemoveAlreadyDeleted = TO_REMOVE_ALREADY_DELETED_EDEFAULT;

	/**
	 * The default value of the '{@link #getToRemoveDeleted() <em>To Remove Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToRemoveDeleted()
	 * @generated
	 * @ordered
	 */
	protected static final long TO_REMOVE_DELETED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getToRemoveDeleted() <em>To Remove Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToRemoveDeleted()
	 * @generated
	 * @ordered
	 */
	protected long toRemoveDeleted = TO_REMOVE_DELETED_EDEFAULT;

	/**
	 * The default value of the '{@link #getToStoreInserted() <em>To Store Inserted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToStoreInserted()
	 * @generated
	 * @ordered
	 */
	protected static final long TO_STORE_INSERTED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getToStoreInserted() <em>To Store Inserted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToStoreInserted()
	 * @generated
	 * @ordered
	 */
	protected long toStoreInserted = TO_STORE_INSERTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getToStoreNotUpdated() <em>To Store Not Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToStoreNotUpdated()
	 * @generated
	 * @ordered
	 */
	protected static final long TO_STORE_NOT_UPDATED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getToStoreNotUpdated() <em>To Store Not Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToStoreNotUpdated()
	 * @generated
	 * @ordered
	 */
	protected long toStoreNotUpdated = TO_STORE_NOT_UPDATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getToStoreUpdated() <em>To Store Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToStoreUpdated()
	 * @generated
	 * @ordered
	 */
	protected static final long TO_STORE_UPDATED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getToStoreUpdated() <em>To Store Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToStoreUpdated()
	 * @generated
	 * @ordered
	 */
	protected long toStoreUpdated = TO_STORE_UPDATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalRowsExported() <em>Total Rows Exported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalRowsExported()
	 * @generated
	 * @ordered
	 */
	protected static final long TOTAL_ROWS_EXPORTED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTotalRowsExported() <em>Total Rows Exported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalRowsExported()
	 * @generated
	 * @ordered
	 */
	protected long totalRowsExported = TOTAL_ROWS_EXPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalRowsToCreate() <em>Total Rows To Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalRowsToCreate()
	 * @generated
	 * @ordered
	 */
	protected static final long TOTAL_ROWS_TO_CREATE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTotalRowsToCreate() <em>Total Rows To Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalRowsToCreate()
	 * @generated
	 * @ordered
	 */
	protected long totalRowsToCreate = TOTAL_ROWS_TO_CREATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalRowsToRemove() <em>Total Rows To Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalRowsToRemove()
	 * @generated
	 * @ordered
	 */
	protected static final long TOTAL_ROWS_TO_REMOVE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTotalRowsToRemove() <em>Total Rows To Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalRowsToRemove()
	 * @generated
	 * @ordered
	 */
	protected long totalRowsToRemove = TOTAL_ROWS_TO_REMOVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalRowsToStore() <em>Total Rows To Store</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalRowsToStore()
	 * @generated
	 * @ordered
	 */
	protected static final long TOTAL_ROWS_TO_STORE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTotalRowsToStore() <em>Total Rows To Store</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalRowsToStore()
	 * @generated
	 * @ordered
	 */
	protected long totalRowsToStore = TOTAL_ROWS_TO_STORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalSplits() <em>Total Splits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalSplits()
	 * @generated
	 * @ordered
	 */
	protected static final long TOTAL_SPLITS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTotalSplits() <em>Total Splits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalSplits()
	 * @generated
	 * @ordered
	 */
	protected long totalSplits = TOTAL_SPLITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalStoreCalls() <em>Total Store Calls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalStoreCalls()
	 * @generated
	 * @ordered
	 */
	protected static final long TOTAL_STORE_CALLS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTotalStoreCalls() <em>Total Store Calls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalStoreCalls()
	 * @generated
	 * @ordered
	 */
	protected long totalStoreCalls = TOTAL_STORE_CALLS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntitySyncHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SynchronizationPackage.Literals.ENTITY_SYNC_HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getBeginningSynchTime() {
		return beginningSynchTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeginningSynchTime(Date newBeginningSynchTime) {
		Date oldBeginningSynchTime = beginningSynchTime;
		beginningSynchTime = newBeginningSynchTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__BEGINNING_SYNCH_TIME, oldBeginningSynchTime, beginningSynchTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntitySyncId() {
		return entitySyncId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntitySyncId(String newEntitySyncId) {
		String oldEntitySyncId = entitySyncId;
		entitySyncId = newEntitySyncId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__ENTITY_SYNC_ID, oldEntitySyncId, entitySyncId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastCandidateEndTime() {
		return lastCandidateEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastCandidateEndTime(Date newLastCandidateEndTime) {
		Date oldLastCandidateEndTime = lastCandidateEndTime;
		lastCandidateEndTime = newLastCandidateEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__LAST_CANDIDATE_END_TIME, oldLastCandidateEndTime, lastCandidateEndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getLastSplitStartTime() {
		return lastSplitStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastSplitStartTime(long newLastSplitStartTime) {
		long oldLastSplitStartTime = lastSplitStartTime;
		lastSplitStartTime = newLastSplitStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__LAST_SPLIT_START_TIME, oldLastSplitStartTime, lastSplitStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastSuccessfulSynchTime() {
		return lastSuccessfulSynchTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastSuccessfulSynchTime(Date newLastSuccessfulSynchTime) {
		Date oldLastSuccessfulSynchTime = lastSuccessfulSynchTime;
		lastSuccessfulSynchTime = newLastSuccessfulSynchTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__LAST_SUCCESSFUL_SYNCH_TIME, oldLastSuccessfulSynchTime, lastSuccessfulSynchTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPerSplitMaxItems() {
		return perSplitMaxItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerSplitMaxItems(long newPerSplitMaxItems) {
		long oldPerSplitMaxItems = perSplitMaxItems;
		perSplitMaxItems = newPerSplitMaxItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__PER_SPLIT_MAX_ITEMS, oldPerSplitMaxItems, perSplitMaxItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPerSplitMaxMillis() {
		return perSplitMaxMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerSplitMaxMillis(long newPerSplitMaxMillis) {
		long oldPerSplitMaxMillis = perSplitMaxMillis;
		perSplitMaxMillis = newPerSplitMaxMillis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__PER_SPLIT_MAX_MILLIS, oldPerSplitMaxMillis, perSplitMaxMillis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPerSplitMinItems() {
		return perSplitMinItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerSplitMinItems(long newPerSplitMinItems) {
		long oldPerSplitMinItems = perSplitMinItems;
		perSplitMinItems = newPerSplitMinItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__PER_SPLIT_MIN_ITEMS, oldPerSplitMinItems, perSplitMinItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPerSplitMinMillis() {
		return perSplitMinMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerSplitMinMillis(long newPerSplitMinMillis) {
		long oldPerSplitMinMillis = perSplitMinMillis;
		perSplitMinMillis = newPerSplitMinMillis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__PER_SPLIT_MIN_MILLIS, oldPerSplitMinMillis, perSplitMinMillis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRunStatusId() {
		return runStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunStatusId(String newRunStatusId) {
		String oldRunStatusId = runStatusId;
		runStatusId = newRunStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__RUN_STATUS_ID, oldRunStatusId, runStatusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRunningTimeMillis() {
		return runningTimeMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunningTimeMillis(long newRunningTimeMillis) {
		long oldRunningTimeMillis = runningTimeMillis;
		runningTimeMillis = newRunningTimeMillis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__RUNNING_TIME_MILLIS, oldRunningTimeMillis, runningTimeMillis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getToCreateInserted() {
		return toCreateInserted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToCreateInserted(long newToCreateInserted) {
		long oldToCreateInserted = toCreateInserted;
		toCreateInserted = newToCreateInserted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_CREATE_INSERTED, oldToCreateInserted, toCreateInserted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getToCreateNotUpdated() {
		return toCreateNotUpdated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToCreateNotUpdated(long newToCreateNotUpdated) {
		long oldToCreateNotUpdated = toCreateNotUpdated;
		toCreateNotUpdated = newToCreateNotUpdated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_CREATE_NOT_UPDATED, oldToCreateNotUpdated, toCreateNotUpdated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getToCreateUpdated() {
		return toCreateUpdated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToCreateUpdated(long newToCreateUpdated) {
		long oldToCreateUpdated = toCreateUpdated;
		toCreateUpdated = newToCreateUpdated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_CREATE_UPDATED, oldToCreateUpdated, toCreateUpdated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getToRemoveAlreadyDeleted() {
		return toRemoveAlreadyDeleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToRemoveAlreadyDeleted(long newToRemoveAlreadyDeleted) {
		long oldToRemoveAlreadyDeleted = toRemoveAlreadyDeleted;
		toRemoveAlreadyDeleted = newToRemoveAlreadyDeleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_REMOVE_ALREADY_DELETED, oldToRemoveAlreadyDeleted, toRemoveAlreadyDeleted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getToRemoveDeleted() {
		return toRemoveDeleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToRemoveDeleted(long newToRemoveDeleted) {
		long oldToRemoveDeleted = toRemoveDeleted;
		toRemoveDeleted = newToRemoveDeleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_REMOVE_DELETED, oldToRemoveDeleted, toRemoveDeleted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getToStoreInserted() {
		return toStoreInserted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToStoreInserted(long newToStoreInserted) {
		long oldToStoreInserted = toStoreInserted;
		toStoreInserted = newToStoreInserted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_STORE_INSERTED, oldToStoreInserted, toStoreInserted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getToStoreNotUpdated() {
		return toStoreNotUpdated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToStoreNotUpdated(long newToStoreNotUpdated) {
		long oldToStoreNotUpdated = toStoreNotUpdated;
		toStoreNotUpdated = newToStoreNotUpdated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_STORE_NOT_UPDATED, oldToStoreNotUpdated, toStoreNotUpdated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getToStoreUpdated() {
		return toStoreUpdated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToStoreUpdated(long newToStoreUpdated) {
		long oldToStoreUpdated = toStoreUpdated;
		toStoreUpdated = newToStoreUpdated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_STORE_UPDATED, oldToStoreUpdated, toStoreUpdated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTotalRowsExported() {
		return totalRowsExported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalRowsExported(long newTotalRowsExported) {
		long oldTotalRowsExported = totalRowsExported;
		totalRowsExported = newTotalRowsExported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_ROWS_EXPORTED, oldTotalRowsExported, totalRowsExported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTotalRowsToCreate() {
		return totalRowsToCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalRowsToCreate(long newTotalRowsToCreate) {
		long oldTotalRowsToCreate = totalRowsToCreate;
		totalRowsToCreate = newTotalRowsToCreate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_CREATE, oldTotalRowsToCreate, totalRowsToCreate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTotalRowsToRemove() {
		return totalRowsToRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalRowsToRemove(long newTotalRowsToRemove) {
		long oldTotalRowsToRemove = totalRowsToRemove;
		totalRowsToRemove = newTotalRowsToRemove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_REMOVE, oldTotalRowsToRemove, totalRowsToRemove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTotalRowsToStore() {
		return totalRowsToStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalRowsToStore(long newTotalRowsToStore) {
		long oldTotalRowsToStore = totalRowsToStore;
		totalRowsToStore = newTotalRowsToStore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_STORE, oldTotalRowsToStore, totalRowsToStore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTotalSplits() {
		return totalSplits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalSplits(long newTotalSplits) {
		long oldTotalSplits = totalSplits;
		totalSplits = newTotalSplits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_SPLITS, oldTotalSplits, totalSplits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTotalStoreCalls() {
		return totalStoreCalls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalStoreCalls(long newTotalStoreCalls) {
		long oldTotalStoreCalls = totalStoreCalls;
		totalStoreCalls = newTotalStoreCalls;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_STORE_CALLS, oldTotalStoreCalls, totalStoreCalls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__ENTITY_SYNC_ID:
				return getEntitySyncId();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__START_DATE:
				return getStartDate();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__BEGINNING_SYNCH_TIME:
				return getBeginningSynchTime();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__LAST_CANDIDATE_END_TIME:
				return getLastCandidateEndTime();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__LAST_SPLIT_START_TIME:
				return getLastSplitStartTime();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__LAST_SUCCESSFUL_SYNCH_TIME:
				return getLastSuccessfulSynchTime();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__PER_SPLIT_MAX_ITEMS:
				return getPerSplitMaxItems();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__PER_SPLIT_MAX_MILLIS:
				return getPerSplitMaxMillis();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__PER_SPLIT_MIN_ITEMS:
				return getPerSplitMinItems();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__PER_SPLIT_MIN_MILLIS:
				return getPerSplitMinMillis();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__RUN_STATUS_ID:
				return getRunStatusId();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__RUNNING_TIME_MILLIS:
				return getRunningTimeMillis();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_CREATE_INSERTED:
				return getToCreateInserted();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_CREATE_NOT_UPDATED:
				return getToCreateNotUpdated();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_CREATE_UPDATED:
				return getToCreateUpdated();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_REMOVE_ALREADY_DELETED:
				return getToRemoveAlreadyDeleted();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_REMOVE_DELETED:
				return getToRemoveDeleted();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_STORE_INSERTED:
				return getToStoreInserted();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_STORE_NOT_UPDATED:
				return getToStoreNotUpdated();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_STORE_UPDATED:
				return getToStoreUpdated();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_ROWS_EXPORTED:
				return getTotalRowsExported();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_CREATE:
				return getTotalRowsToCreate();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_REMOVE:
				return getTotalRowsToRemove();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_STORE:
				return getTotalRowsToStore();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_SPLITS:
				return getTotalSplits();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_STORE_CALLS:
				return getTotalStoreCalls();
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
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__ENTITY_SYNC_ID:
				setEntitySyncId((String)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__START_DATE:
				setStartDate((Date)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__BEGINNING_SYNCH_TIME:
				setBeginningSynchTime((Date)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__LAST_CANDIDATE_END_TIME:
				setLastCandidateEndTime((Date)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__LAST_SPLIT_START_TIME:
				setLastSplitStartTime((Long)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__LAST_SUCCESSFUL_SYNCH_TIME:
				setLastSuccessfulSynchTime((Date)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__PER_SPLIT_MAX_ITEMS:
				setPerSplitMaxItems((Long)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__PER_SPLIT_MAX_MILLIS:
				setPerSplitMaxMillis((Long)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__PER_SPLIT_MIN_ITEMS:
				setPerSplitMinItems((Long)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__PER_SPLIT_MIN_MILLIS:
				setPerSplitMinMillis((Long)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__RUN_STATUS_ID:
				setRunStatusId((String)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__RUNNING_TIME_MILLIS:
				setRunningTimeMillis((Long)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_CREATE_INSERTED:
				setToCreateInserted((Long)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_CREATE_NOT_UPDATED:
				setToCreateNotUpdated((Long)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_CREATE_UPDATED:
				setToCreateUpdated((Long)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_REMOVE_ALREADY_DELETED:
				setToRemoveAlreadyDeleted((Long)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_REMOVE_DELETED:
				setToRemoveDeleted((Long)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_STORE_INSERTED:
				setToStoreInserted((Long)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_STORE_NOT_UPDATED:
				setToStoreNotUpdated((Long)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_STORE_UPDATED:
				setToStoreUpdated((Long)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_ROWS_EXPORTED:
				setTotalRowsExported((Long)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_CREATE:
				setTotalRowsToCreate((Long)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_REMOVE:
				setTotalRowsToRemove((Long)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_STORE:
				setTotalRowsToStore((Long)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_SPLITS:
				setTotalSplits((Long)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_STORE_CALLS:
				setTotalStoreCalls((Long)newValue);
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
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__ENTITY_SYNC_ID:
				setEntitySyncId(ENTITY_SYNC_ID_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__BEGINNING_SYNCH_TIME:
				setBeginningSynchTime(BEGINNING_SYNCH_TIME_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__LAST_CANDIDATE_END_TIME:
				setLastCandidateEndTime(LAST_CANDIDATE_END_TIME_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__LAST_SPLIT_START_TIME:
				setLastSplitStartTime(LAST_SPLIT_START_TIME_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__LAST_SUCCESSFUL_SYNCH_TIME:
				setLastSuccessfulSynchTime(LAST_SUCCESSFUL_SYNCH_TIME_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__PER_SPLIT_MAX_ITEMS:
				setPerSplitMaxItems(PER_SPLIT_MAX_ITEMS_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__PER_SPLIT_MAX_MILLIS:
				setPerSplitMaxMillis(PER_SPLIT_MAX_MILLIS_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__PER_SPLIT_MIN_ITEMS:
				setPerSplitMinItems(PER_SPLIT_MIN_ITEMS_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__PER_SPLIT_MIN_MILLIS:
				setPerSplitMinMillis(PER_SPLIT_MIN_MILLIS_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__RUN_STATUS_ID:
				setRunStatusId(RUN_STATUS_ID_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__RUNNING_TIME_MILLIS:
				setRunningTimeMillis(RUNNING_TIME_MILLIS_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_CREATE_INSERTED:
				setToCreateInserted(TO_CREATE_INSERTED_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_CREATE_NOT_UPDATED:
				setToCreateNotUpdated(TO_CREATE_NOT_UPDATED_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_CREATE_UPDATED:
				setToCreateUpdated(TO_CREATE_UPDATED_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_REMOVE_ALREADY_DELETED:
				setToRemoveAlreadyDeleted(TO_REMOVE_ALREADY_DELETED_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_REMOVE_DELETED:
				setToRemoveDeleted(TO_REMOVE_DELETED_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_STORE_INSERTED:
				setToStoreInserted(TO_STORE_INSERTED_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_STORE_NOT_UPDATED:
				setToStoreNotUpdated(TO_STORE_NOT_UPDATED_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_STORE_UPDATED:
				setToStoreUpdated(TO_STORE_UPDATED_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_ROWS_EXPORTED:
				setTotalRowsExported(TOTAL_ROWS_EXPORTED_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_CREATE:
				setTotalRowsToCreate(TOTAL_ROWS_TO_CREATE_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_REMOVE:
				setTotalRowsToRemove(TOTAL_ROWS_TO_REMOVE_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_STORE:
				setTotalRowsToStore(TOTAL_ROWS_TO_STORE_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_SPLITS:
				setTotalSplits(TOTAL_SPLITS_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_STORE_CALLS:
				setTotalStoreCalls(TOTAL_STORE_CALLS_EDEFAULT);
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
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__ENTITY_SYNC_ID:
				return ENTITY_SYNC_ID_EDEFAULT == null ? entitySyncId != null : !ENTITY_SYNC_ID_EDEFAULT.equals(entitySyncId);
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__BEGINNING_SYNCH_TIME:
				return BEGINNING_SYNCH_TIME_EDEFAULT == null ? beginningSynchTime != null : !BEGINNING_SYNCH_TIME_EDEFAULT.equals(beginningSynchTime);
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__LAST_CANDIDATE_END_TIME:
				return LAST_CANDIDATE_END_TIME_EDEFAULT == null ? lastCandidateEndTime != null : !LAST_CANDIDATE_END_TIME_EDEFAULT.equals(lastCandidateEndTime);
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__LAST_SPLIT_START_TIME:
				return lastSplitStartTime != LAST_SPLIT_START_TIME_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__LAST_SUCCESSFUL_SYNCH_TIME:
				return LAST_SUCCESSFUL_SYNCH_TIME_EDEFAULT == null ? lastSuccessfulSynchTime != null : !LAST_SUCCESSFUL_SYNCH_TIME_EDEFAULT.equals(lastSuccessfulSynchTime);
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__PER_SPLIT_MAX_ITEMS:
				return perSplitMaxItems != PER_SPLIT_MAX_ITEMS_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__PER_SPLIT_MAX_MILLIS:
				return perSplitMaxMillis != PER_SPLIT_MAX_MILLIS_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__PER_SPLIT_MIN_ITEMS:
				return perSplitMinItems != PER_SPLIT_MIN_ITEMS_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__PER_SPLIT_MIN_MILLIS:
				return perSplitMinMillis != PER_SPLIT_MIN_MILLIS_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__RUN_STATUS_ID:
				return RUN_STATUS_ID_EDEFAULT == null ? runStatusId != null : !RUN_STATUS_ID_EDEFAULT.equals(runStatusId);
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__RUNNING_TIME_MILLIS:
				return runningTimeMillis != RUNNING_TIME_MILLIS_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_CREATE_INSERTED:
				return toCreateInserted != TO_CREATE_INSERTED_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_CREATE_NOT_UPDATED:
				return toCreateNotUpdated != TO_CREATE_NOT_UPDATED_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_CREATE_UPDATED:
				return toCreateUpdated != TO_CREATE_UPDATED_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_REMOVE_ALREADY_DELETED:
				return toRemoveAlreadyDeleted != TO_REMOVE_ALREADY_DELETED_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_REMOVE_DELETED:
				return toRemoveDeleted != TO_REMOVE_DELETED_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_STORE_INSERTED:
				return toStoreInserted != TO_STORE_INSERTED_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_STORE_NOT_UPDATED:
				return toStoreNotUpdated != TO_STORE_NOT_UPDATED_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TO_STORE_UPDATED:
				return toStoreUpdated != TO_STORE_UPDATED_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_ROWS_EXPORTED:
				return totalRowsExported != TOTAL_ROWS_EXPORTED_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_CREATE:
				return totalRowsToCreate != TOTAL_ROWS_TO_CREATE_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_REMOVE:
				return totalRowsToRemove != TOTAL_ROWS_TO_REMOVE_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_ROWS_TO_STORE:
				return totalRowsToStore != TOTAL_ROWS_TO_STORE_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_SPLITS:
				return totalSplits != TOTAL_SPLITS_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC_HISTORY__TOTAL_STORE_CALLS:
				return totalStoreCalls != TOTAL_STORE_CALLS_EDEFAULT;
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
		result.append(" (entitySyncId: ");
		result.append(entitySyncId);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", beginningSynchTime: ");
		result.append(beginningSynchTime);
		result.append(", lastCandidateEndTime: ");
		result.append(lastCandidateEndTime);
		result.append(", lastSplitStartTime: ");
		result.append(lastSplitStartTime);
		result.append(", lastSuccessfulSynchTime: ");
		result.append(lastSuccessfulSynchTime);
		result.append(", perSplitMaxItems: ");
		result.append(perSplitMaxItems);
		result.append(", perSplitMaxMillis: ");
		result.append(perSplitMaxMillis);
		result.append(", perSplitMinItems: ");
		result.append(perSplitMinItems);
		result.append(", perSplitMinMillis: ");
		result.append(perSplitMinMillis);
		result.append(", runStatusId: ");
		result.append(runStatusId);
		result.append(", runningTimeMillis: ");
		result.append(runningTimeMillis);
		result.append(", toCreateInserted: ");
		result.append(toCreateInserted);
		result.append(", toCreateNotUpdated: ");
		result.append(toCreateNotUpdated);
		result.append(", toCreateUpdated: ");
		result.append(toCreateUpdated);
		result.append(", toRemoveAlreadyDeleted: ");
		result.append(toRemoveAlreadyDeleted);
		result.append(", toRemoveDeleted: ");
		result.append(toRemoveDeleted);
		result.append(", toStoreInserted: ");
		result.append(toStoreInserted);
		result.append(", toStoreNotUpdated: ");
		result.append(toStoreNotUpdated);
		result.append(", toStoreUpdated: ");
		result.append(toStoreUpdated);
		result.append(", totalRowsExported: ");
		result.append(totalRowsExported);
		result.append(", totalRowsToCreate: ");
		result.append(totalRowsToCreate);
		result.append(", totalRowsToRemove: ");
		result.append(totalRowsToRemove);
		result.append(", totalRowsToStore: ");
		result.append(totalRowsToStore);
		result.append(", totalSplits: ");
		result.append(totalSplits);
		result.append(", totalStoreCalls: ");
		result.append(totalStoreCalls);
		result.append(')');
		return result.toString();
	}

} //EntitySyncHistoryImpl
