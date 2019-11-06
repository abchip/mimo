/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.synchronization.impl;

import java.util.Collection;
import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.entity.synchronization.EntitySync;
import org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Sync</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncImpl#getEntitySyncId <em>Entity Sync Id</em>}</li>
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
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncImpl#getEntitySyncHistories <em>Entity Sync Histories</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncImpl#getEntitySyncIncludes <em>Entity Sync Includes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncImpl#getEntitySyncIncludeGroups <em>Entity Sync Include Groups</em>}</li>
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
	 * The default value of the '{@link #isForPullOnly() <em>For Pull Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForPullOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FOR_PULL_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isForPullOnly() <em>For Pull Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForPullOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean forPullOnly = FOR_PULL_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isForPushOnly() <em>For Push Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForPushOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FOR_PUSH_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isForPushOnly() <em>For Push Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForPushOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean forPushOnly = FOR_PUSH_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeepRemoveInfoHours() <em>Keep Remove Info Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepRemoveInfoHours()
	 * @generated
	 * @ordered
	 */
	protected static final double KEEP_REMOVE_INFO_HOURS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getKeepRemoveInfoHours() <em>Keep Remove Info Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepRemoveInfoHours()
	 * @generated
	 * @ordered
	 */
	protected double keepRemoveInfoHours = KEEP_REMOVE_INFO_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastHistoryStartDate() <em>Last History Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastHistoryStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_HISTORY_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastHistoryStartDate() <em>Last History Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastHistoryStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastHistoryStartDate = LAST_HISTORY_START_DATE_EDEFAULT;

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
	 * The default value of the '{@link #getMaxRunningNoUpdateMillis() <em>Max Running No Update Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRunningNoUpdateMillis()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_RUNNING_NO_UPDATE_MILLIS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxRunningNoUpdateMillis() <em>Max Running No Update Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRunningNoUpdateMillis()
	 * @generated
	 * @ordered
	 */
	protected long maxRunningNoUpdateMillis = MAX_RUNNING_NO_UPDATE_MILLIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOfflineSyncSplitMillis() <em>Offline Sync Split Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfflineSyncSplitMillis()
	 * @generated
	 * @ordered
	 */
	protected static final long OFFLINE_SYNC_SPLIT_MILLIS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getOfflineSyncSplitMillis() <em>Offline Sync Split Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfflineSyncSplitMillis()
	 * @generated
	 * @ordered
	 */
	protected long offlineSyncSplitMillis = OFFLINE_SYNC_SPLIT_MILLIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreOfflineSynchTime() <em>Pre Offline Synch Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreOfflineSynchTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date PRE_OFFLINE_SYNCH_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreOfflineSynchTime() <em>Pre Offline Synch Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreOfflineSynchTime()
	 * @generated
	 * @ordered
	 */
	protected Date preOfflineSynchTime = PRE_OFFLINE_SYNCH_TIME_EDEFAULT;

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
	 * The default value of the '{@link #getSyncEndBufferMillis() <em>Sync End Buffer Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncEndBufferMillis()
	 * @generated
	 * @ordered
	 */
	protected static final long SYNC_END_BUFFER_MILLIS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSyncEndBufferMillis() <em>Sync End Buffer Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncEndBufferMillis()
	 * @generated
	 * @ordered
	 */
	protected long syncEndBufferMillis = SYNC_END_BUFFER_MILLIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSyncSplitMillis() <em>Sync Split Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncSplitMillis()
	 * @generated
	 * @ordered
	 */
	protected static final long SYNC_SPLIT_MILLIS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSyncSplitMillis() <em>Sync Split Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncSplitMillis()
	 * @generated
	 * @ordered
	 */
	protected long syncSplitMillis = SYNC_SPLIT_MILLIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetDelegatorName() <em>Target Delegator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDelegatorName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_DELEGATOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetDelegatorName() <em>Target Delegator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDelegatorName()
	 * @generated
	 * @ordered
	 */
	protected String targetDelegatorName = TARGET_DELEGATOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetServiceName() <em>Target Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetServiceName() <em>Target Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetServiceName()
	 * @generated
	 * @ordered
	 */
	protected String targetServiceName = TARGET_SERVICE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntitySyncHistories() <em>Entity Sync Histories</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitySyncHistories()
	 * @generated
	 * @ordered
	 */
	protected EList<String> entitySyncHistories;
	/**
	 * The cached value of the '{@link #getEntitySyncIncludes() <em>Entity Sync Includes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitySyncIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> entitySyncIncludes;
	/**
	 * The cached value of the '{@link #getEntitySyncIncludeGroups() <em>Entity Sync Include Groups</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitySyncIncludeGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<String> entitySyncIncludeGroups;

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
		return entitySyncId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntitySyncId(String newEntitySyncId) {
		entitySyncId = newEntitySyncId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isForPullOnly() {
		return forPullOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForPullOnly(boolean newForPullOnly) {
		forPullOnly = newForPullOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isForPushOnly() {
		return forPushOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForPushOnly(boolean newForPushOnly) {
		forPushOnly = newForPushOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getKeepRemoveInfoHours() {
		return keepRemoveInfoHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeepRemoveInfoHours(double newKeepRemoveInfoHours) {
		keepRemoveInfoHours = newKeepRemoveInfoHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastHistoryStartDate() {
		return lastHistoryStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastHistoryStartDate(Date newLastHistoryStartDate) {
		lastHistoryStartDate = newLastHistoryStartDate;
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
		lastSuccessfulSynchTime = newLastSuccessfulSynchTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxRunningNoUpdateMillis() {
		return maxRunningNoUpdateMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxRunningNoUpdateMillis(long newMaxRunningNoUpdateMillis) {
		maxRunningNoUpdateMillis = newMaxRunningNoUpdateMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getOfflineSyncSplitMillis() {
		return offlineSyncSplitMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOfflineSyncSplitMillis(long newOfflineSyncSplitMillis) {
		offlineSyncSplitMillis = newOfflineSyncSplitMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPreOfflineSynchTime() {
		return preOfflineSynchTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreOfflineSynchTime(Date newPreOfflineSynchTime) {
		preOfflineSynchTime = newPreOfflineSynchTime;
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
		runStatusId = newRunStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSyncEndBufferMillis() {
		return syncEndBufferMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSyncEndBufferMillis(long newSyncEndBufferMillis) {
		syncEndBufferMillis = newSyncEndBufferMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSyncSplitMillis() {
		return syncSplitMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSyncSplitMillis(long newSyncSplitMillis) {
		syncSplitMillis = newSyncSplitMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetDelegatorName() {
		return targetDelegatorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetDelegatorName(String newTargetDelegatorName) {
		targetDelegatorName = newTargetDelegatorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetServiceName() {
		return targetServiceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetServiceName(String newTargetServiceName) {
		targetServiceName = newTargetServiceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getEntitySyncHistories() {
		if (entitySyncHistories == null) {
			entitySyncHistories = new BasicInternalEList<String>(String.class);
		}
		return entitySyncHistories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getEntitySyncIncludes() {
		if (entitySyncIncludes == null) {
			entitySyncIncludes = new BasicInternalEList<String>(String.class);
		}
		return entitySyncIncludes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getEntitySyncIncludeGroups() {
		if (entitySyncIncludeGroups == null) {
			entitySyncIncludeGroups = new BasicInternalEList<String>(String.class);
		}
		return entitySyncIncludeGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SynchronizationPackage.ENTITY_SYNC__ENTITY_SYNC_ID:
				return getEntitySyncId();
			case SynchronizationPackage.ENTITY_SYNC__FOR_PULL_ONLY:
				return isForPullOnly();
			case SynchronizationPackage.ENTITY_SYNC__FOR_PUSH_ONLY:
				return isForPushOnly();
			case SynchronizationPackage.ENTITY_SYNC__KEEP_REMOVE_INFO_HOURS:
				return getKeepRemoveInfoHours();
			case SynchronizationPackage.ENTITY_SYNC__LAST_HISTORY_START_DATE:
				return getLastHistoryStartDate();
			case SynchronizationPackage.ENTITY_SYNC__LAST_SUCCESSFUL_SYNCH_TIME:
				return getLastSuccessfulSynchTime();
			case SynchronizationPackage.ENTITY_SYNC__MAX_RUNNING_NO_UPDATE_MILLIS:
				return getMaxRunningNoUpdateMillis();
			case SynchronizationPackage.ENTITY_SYNC__OFFLINE_SYNC_SPLIT_MILLIS:
				return getOfflineSyncSplitMillis();
			case SynchronizationPackage.ENTITY_SYNC__PRE_OFFLINE_SYNCH_TIME:
				return getPreOfflineSynchTime();
			case SynchronizationPackage.ENTITY_SYNC__RUN_STATUS_ID:
				return getRunStatusId();
			case SynchronizationPackage.ENTITY_SYNC__SYNC_END_BUFFER_MILLIS:
				return getSyncEndBufferMillis();
			case SynchronizationPackage.ENTITY_SYNC__SYNC_SPLIT_MILLIS:
				return getSyncSplitMillis();
			case SynchronizationPackage.ENTITY_SYNC__TARGET_DELEGATOR_NAME:
				return getTargetDelegatorName();
			case SynchronizationPackage.ENTITY_SYNC__TARGET_SERVICE_NAME:
				return getTargetServiceName();
			case SynchronizationPackage.ENTITY_SYNC__ENTITY_SYNC_HISTORIES:
				return getEntitySyncHistories();
			case SynchronizationPackage.ENTITY_SYNC__ENTITY_SYNC_INCLUDES:
				return getEntitySyncIncludes();
			case SynchronizationPackage.ENTITY_SYNC__ENTITY_SYNC_INCLUDE_GROUPS:
				return getEntitySyncIncludeGroups();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SynchronizationPackage.ENTITY_SYNC__ENTITY_SYNC_ID:
				setEntitySyncId((String)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC__FOR_PULL_ONLY:
				setForPullOnly((Boolean)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC__FOR_PUSH_ONLY:
				setForPushOnly((Boolean)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC__KEEP_REMOVE_INFO_HOURS:
				setKeepRemoveInfoHours((Double)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC__LAST_HISTORY_START_DATE:
				setLastHistoryStartDate((Date)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC__LAST_SUCCESSFUL_SYNCH_TIME:
				setLastSuccessfulSynchTime((Date)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC__MAX_RUNNING_NO_UPDATE_MILLIS:
				setMaxRunningNoUpdateMillis((Long)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC__OFFLINE_SYNC_SPLIT_MILLIS:
				setOfflineSyncSplitMillis((Long)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC__PRE_OFFLINE_SYNCH_TIME:
				setPreOfflineSynchTime((Date)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC__RUN_STATUS_ID:
				setRunStatusId((String)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC__SYNC_END_BUFFER_MILLIS:
				setSyncEndBufferMillis((Long)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC__SYNC_SPLIT_MILLIS:
				setSyncSplitMillis((Long)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC__TARGET_DELEGATOR_NAME:
				setTargetDelegatorName((String)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC__TARGET_SERVICE_NAME:
				setTargetServiceName((String)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC__ENTITY_SYNC_HISTORIES:
				getEntitySyncHistories().clear();
				getEntitySyncHistories().addAll((Collection<? extends String>)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC__ENTITY_SYNC_INCLUDES:
				getEntitySyncIncludes().clear();
				getEntitySyncIncludes().addAll((Collection<? extends String>)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC__ENTITY_SYNC_INCLUDE_GROUPS:
				getEntitySyncIncludeGroups().clear();
				getEntitySyncIncludeGroups().addAll((Collection<? extends String>)newValue);
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
			case SynchronizationPackage.ENTITY_SYNC__ENTITY_SYNC_ID:
				setEntitySyncId(ENTITY_SYNC_ID_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC__FOR_PULL_ONLY:
				setForPullOnly(FOR_PULL_ONLY_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC__FOR_PUSH_ONLY:
				setForPushOnly(FOR_PUSH_ONLY_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC__KEEP_REMOVE_INFO_HOURS:
				setKeepRemoveInfoHours(KEEP_REMOVE_INFO_HOURS_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC__LAST_HISTORY_START_DATE:
				setLastHistoryStartDate(LAST_HISTORY_START_DATE_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC__LAST_SUCCESSFUL_SYNCH_TIME:
				setLastSuccessfulSynchTime(LAST_SUCCESSFUL_SYNCH_TIME_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC__MAX_RUNNING_NO_UPDATE_MILLIS:
				setMaxRunningNoUpdateMillis(MAX_RUNNING_NO_UPDATE_MILLIS_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC__OFFLINE_SYNC_SPLIT_MILLIS:
				setOfflineSyncSplitMillis(OFFLINE_SYNC_SPLIT_MILLIS_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC__PRE_OFFLINE_SYNCH_TIME:
				setPreOfflineSynchTime(PRE_OFFLINE_SYNCH_TIME_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC__RUN_STATUS_ID:
				setRunStatusId(RUN_STATUS_ID_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC__SYNC_END_BUFFER_MILLIS:
				setSyncEndBufferMillis(SYNC_END_BUFFER_MILLIS_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC__SYNC_SPLIT_MILLIS:
				setSyncSplitMillis(SYNC_SPLIT_MILLIS_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC__TARGET_DELEGATOR_NAME:
				setTargetDelegatorName(TARGET_DELEGATOR_NAME_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC__TARGET_SERVICE_NAME:
				setTargetServiceName(TARGET_SERVICE_NAME_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC__ENTITY_SYNC_HISTORIES:
				getEntitySyncHistories().clear();
				return;
			case SynchronizationPackage.ENTITY_SYNC__ENTITY_SYNC_INCLUDES:
				getEntitySyncIncludes().clear();
				return;
			case SynchronizationPackage.ENTITY_SYNC__ENTITY_SYNC_INCLUDE_GROUPS:
				getEntitySyncIncludeGroups().clear();
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
			case SynchronizationPackage.ENTITY_SYNC__ENTITY_SYNC_ID:
				return ENTITY_SYNC_ID_EDEFAULT == null ? entitySyncId != null : !ENTITY_SYNC_ID_EDEFAULT.equals(entitySyncId);
			case SynchronizationPackage.ENTITY_SYNC__FOR_PULL_ONLY:
				return forPullOnly != FOR_PULL_ONLY_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC__FOR_PUSH_ONLY:
				return forPushOnly != FOR_PUSH_ONLY_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC__KEEP_REMOVE_INFO_HOURS:
				return keepRemoveInfoHours != KEEP_REMOVE_INFO_HOURS_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC__LAST_HISTORY_START_DATE:
				return LAST_HISTORY_START_DATE_EDEFAULT == null ? lastHistoryStartDate != null : !LAST_HISTORY_START_DATE_EDEFAULT.equals(lastHistoryStartDate);
			case SynchronizationPackage.ENTITY_SYNC__LAST_SUCCESSFUL_SYNCH_TIME:
				return LAST_SUCCESSFUL_SYNCH_TIME_EDEFAULT == null ? lastSuccessfulSynchTime != null : !LAST_SUCCESSFUL_SYNCH_TIME_EDEFAULT.equals(lastSuccessfulSynchTime);
			case SynchronizationPackage.ENTITY_SYNC__MAX_RUNNING_NO_UPDATE_MILLIS:
				return maxRunningNoUpdateMillis != MAX_RUNNING_NO_UPDATE_MILLIS_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC__OFFLINE_SYNC_SPLIT_MILLIS:
				return offlineSyncSplitMillis != OFFLINE_SYNC_SPLIT_MILLIS_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC__PRE_OFFLINE_SYNCH_TIME:
				return PRE_OFFLINE_SYNCH_TIME_EDEFAULT == null ? preOfflineSynchTime != null : !PRE_OFFLINE_SYNCH_TIME_EDEFAULT.equals(preOfflineSynchTime);
			case SynchronizationPackage.ENTITY_SYNC__RUN_STATUS_ID:
				return RUN_STATUS_ID_EDEFAULT == null ? runStatusId != null : !RUN_STATUS_ID_EDEFAULT.equals(runStatusId);
			case SynchronizationPackage.ENTITY_SYNC__SYNC_END_BUFFER_MILLIS:
				return syncEndBufferMillis != SYNC_END_BUFFER_MILLIS_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC__SYNC_SPLIT_MILLIS:
				return syncSplitMillis != SYNC_SPLIT_MILLIS_EDEFAULT;
			case SynchronizationPackage.ENTITY_SYNC__TARGET_DELEGATOR_NAME:
				return TARGET_DELEGATOR_NAME_EDEFAULT == null ? targetDelegatorName != null : !TARGET_DELEGATOR_NAME_EDEFAULT.equals(targetDelegatorName);
			case SynchronizationPackage.ENTITY_SYNC__TARGET_SERVICE_NAME:
				return TARGET_SERVICE_NAME_EDEFAULT == null ? targetServiceName != null : !TARGET_SERVICE_NAME_EDEFAULT.equals(targetServiceName);
			case SynchronizationPackage.ENTITY_SYNC__ENTITY_SYNC_HISTORIES:
				return entitySyncHistories != null && !entitySyncHistories.isEmpty();
			case SynchronizationPackage.ENTITY_SYNC__ENTITY_SYNC_INCLUDES:
				return entitySyncIncludes != null && !entitySyncIncludes.isEmpty();
			case SynchronizationPackage.ENTITY_SYNC__ENTITY_SYNC_INCLUDE_GROUPS:
				return entitySyncIncludeGroups != null && !entitySyncIncludeGroups.isEmpty();
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
		result.append(", forPullOnly: ");
		result.append(forPullOnly);
		result.append(", forPushOnly: ");
		result.append(forPushOnly);
		result.append(", keepRemoveInfoHours: ");
		result.append(keepRemoveInfoHours);
		result.append(", lastHistoryStartDate: ");
		result.append(lastHistoryStartDate);
		result.append(", lastSuccessfulSynchTime: ");
		result.append(lastSuccessfulSynchTime);
		result.append(", maxRunningNoUpdateMillis: ");
		result.append(maxRunningNoUpdateMillis);
		result.append(", offlineSyncSplitMillis: ");
		result.append(offlineSyncSplitMillis);
		result.append(", preOfflineSynchTime: ");
		result.append(preOfflineSynchTime);
		result.append(", runStatusId: ");
		result.append(runStatusId);
		result.append(", syncEndBufferMillis: ");
		result.append(syncEndBufferMillis);
		result.append(", syncSplitMillis: ");
		result.append(syncSplitMillis);
		result.append(", targetDelegatorName: ");
		result.append(targetDelegatorName);
		result.append(", targetServiceName: ");
		result.append(targetServiceName);
		result.append(", entitySyncHistories: ");
		result.append(entitySyncHistories);
		result.append(", entitySyncIncludes: ");
		result.append(entitySyncIncludes);
		result.append(", entitySyncIncludeGroups: ");
		result.append(entitySyncIncludeGroups);
		result.append(')');
		return result.toString();
	}

} //EntitySyncImpl
