/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.synchronization.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.entity.synchronization.EntitySync;
import org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory;
import org.abchip.mimo.biz.entity.synchronization.EntitySyncInclude;
import org.abchip.mimo.biz.entity.synchronization.EntitySyncIncludeGroup;
import org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Sync</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncImpl#getEntitySyncId <em>Entity Sync Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncImpl#getEntitySyncHistories <em>Entity Sync Histories</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncImpl#getEntitySyncIncludeGroups <em>Entity Sync Include Groups</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncImpl#getEntitySyncIncludes <em>Entity Sync Includes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncImpl#isForPullOnly <em>For Pull Only</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncImpl#isForPushOnly <em>For Push Only</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncImpl#getKeepRemoveInfoHours <em>Keep Remove Info Hours</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncImpl#getLastHistoryStartDate <em>Last History Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncImpl#getLastSuccessfulSynchTime <em>Last Successful Synch Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncImpl#getMaxRunningNoUpdateMillis <em>Max Running No Update Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncImpl#getOfflineSyncSplitMillis <em>Offline Sync Split Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncImpl#getPreOfflineSynchTime <em>Pre Offline Synch Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncImpl#getRunStatusId <em>Run Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncImpl#getSyncEndBufferMillis <em>Sync End Buffer Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncImpl#getSyncSplitMillis <em>Sync Split Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncImpl#getTargetDelegatorName <em>Target Delegator Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncImpl#getTargetServiceName <em>Target Service Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntitySyncImpl extends BizEntityImpl implements EntitySync {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntitySyncImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SynchronizationPackage.Literals.ENTITY_SYNC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntitySyncId() {
		return (String)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__ENTITY_SYNC_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntitySyncId(String newEntitySyncId) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__ENTITY_SYNC_ID, newEntitySyncId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<EntitySyncHistory> getEntitySyncHistories() {
		return (List<EntitySyncHistory>)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__ENTITY_SYNC_HISTORIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<EntitySyncIncludeGroup> getEntitySyncIncludeGroups() {
		return (List<EntitySyncIncludeGroup>)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__ENTITY_SYNC_INCLUDE_GROUPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<EntitySyncInclude> getEntitySyncIncludes() {
		return (List<EntitySyncInclude>)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__ENTITY_SYNC_INCLUDES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isForPullOnly() {
		return (Boolean)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__FOR_PULL_ONLY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForPullOnly(boolean newForPullOnly) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__FOR_PULL_ONLY, newForPullOnly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isForPushOnly() {
		return (Boolean)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__FOR_PUSH_ONLY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForPushOnly(boolean newForPushOnly) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__FOR_PUSH_ONLY, newForPushOnly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getKeepRemoveInfoHours() {
		return (Double)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__KEEP_REMOVE_INFO_HOURS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeepRemoveInfoHours(double newKeepRemoveInfoHours) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__KEEP_REMOVE_INFO_HOURS, newKeepRemoveInfoHours);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastHistoryStartDate() {
		return (Date)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__LAST_HISTORY_START_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastHistoryStartDate(Date newLastHistoryStartDate) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__LAST_HISTORY_START_DATE, newLastHistoryStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastSuccessfulSynchTime() {
		return (Date)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__LAST_SUCCESSFUL_SYNCH_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastSuccessfulSynchTime(Date newLastSuccessfulSynchTime) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__LAST_SUCCESSFUL_SYNCH_TIME, newLastSuccessfulSynchTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxRunningNoUpdateMillis() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__MAX_RUNNING_NO_UPDATE_MILLIS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxRunningNoUpdateMillis(long newMaxRunningNoUpdateMillis) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__MAX_RUNNING_NO_UPDATE_MILLIS, newMaxRunningNoUpdateMillis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getOfflineSyncSplitMillis() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__OFFLINE_SYNC_SPLIT_MILLIS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOfflineSyncSplitMillis(long newOfflineSyncSplitMillis) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__OFFLINE_SYNC_SPLIT_MILLIS, newOfflineSyncSplitMillis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPreOfflineSynchTime() {
		return (Date)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__PRE_OFFLINE_SYNCH_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreOfflineSynchTime(Date newPreOfflineSynchTime) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__PRE_OFFLINE_SYNCH_TIME, newPreOfflineSynchTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRunStatusId() {
		return (String)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__RUN_STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunStatusId(String newRunStatusId) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__RUN_STATUS_ID, newRunStatusId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSyncEndBufferMillis() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__SYNC_END_BUFFER_MILLIS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSyncEndBufferMillis(long newSyncEndBufferMillis) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__SYNC_END_BUFFER_MILLIS, newSyncEndBufferMillis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSyncSplitMillis() {
		return (Long)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__SYNC_SPLIT_MILLIS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSyncSplitMillis(long newSyncSplitMillis) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__SYNC_SPLIT_MILLIS, newSyncSplitMillis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetDelegatorName() {
		return (String)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__TARGET_DELEGATOR_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetDelegatorName(String newTargetDelegatorName) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__TARGET_DELEGATOR_NAME, newTargetDelegatorName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetServiceName() {
		return (String)eGet(SynchronizationPackage.Literals.ENTITY_SYNC__TARGET_SERVICE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetServiceName(String newTargetServiceName) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC__TARGET_SERVICE_NAME, newTargetServiceName);
	}

} //EntitySyncImpl
