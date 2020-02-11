/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.synchronization;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Sync</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getEntitySyncId <em>Entity Sync Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getEntitySyncHistories <em>Entity Sync Histories</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getEntitySyncIncludeGroups <em>Entity Sync Include Groups</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getEntitySyncIncludes <em>Entity Sync Includes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#isForPullOnly <em>For Pull Only</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#isForPushOnly <em>For Push Only</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getKeepRemoveInfoHours <em>Keep Remove Info Hours</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getLastHistoryStartDate <em>Last History Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getLastSuccessfulSynchTime <em>Last Successful Synch Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getMaxRunningNoUpdateMillis <em>Max Running No Update Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getOfflineSyncSplitMillis <em>Offline Sync Split Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getPreOfflineSynchTime <em>Pre Offline Synch Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getRunStatusId <em>Run Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getSyncEndBufferMillis <em>Sync End Buffer Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getSyncSplitMillis <em>Sync Split Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getTargetDelegatorName <em>Target Delegator Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getTargetServiceName <em>Target Service Name</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySync()
 * @model annotation="mimo-ent-frame title='Entity Synchronization'"
 * @generated
 */
public interface EntitySync extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Entity Sync Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Sync Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Sync Id</em>' attribute.
	 * @see #setEntitySyncId(String)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySync_EntitySyncId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getEntitySyncId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getEntitySyncId <em>Entity Sync Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Sync Id</em>' attribute.
	 * @see #getEntitySyncId()
	 * @generated
	 */
	void setEntitySyncId(String value);

	/**
	 * Returns the value of the '<em><b>Entity Sync Histories</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Sync Histories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Sync Histories</em>' reference list.
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySync_EntitySyncHistories()
	 * @model derived="true"
	 * @generated
	 */
	List<EntitySyncHistory> getEntitySyncHistories();

	/**
	 * Returns the value of the '<em><b>Entity Sync Include Groups</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.entity.synchronization.EntitySyncIncludeGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Sync Include Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Sync Include Groups</em>' reference list.
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySync_EntitySyncIncludeGroups()
	 * @model derived="true"
	 * @generated
	 */
	List<EntitySyncIncludeGroup> getEntitySyncIncludeGroups();

	/**
	 * Returns the value of the '<em><b>Entity Sync Includes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.entity.synchronization.EntitySyncInclude}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Sync Includes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Sync Includes</em>' reference list.
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySync_EntitySyncIncludes()
	 * @model derived="true"
	 * @generated
	 */
	List<EntitySyncInclude> getEntitySyncIncludes();

	/**
	 * Returns the value of the '<em><b>For Pull Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Pull Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Pull Only</em>' attribute.
	 * @see #setForPullOnly(boolean)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySync_ForPullOnly()
	 * @model
	 * @generated
	 */
	boolean isForPullOnly();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#isForPullOnly <em>For Pull Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Pull Only</em>' attribute.
	 * @see #isForPullOnly()
	 * @generated
	 */
	void setForPullOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>For Push Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Push Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Push Only</em>' attribute.
	 * @see #setForPushOnly(boolean)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySync_ForPushOnly()
	 * @model
	 * @generated
	 */
	boolean isForPushOnly();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#isForPushOnly <em>For Push Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Push Only</em>' attribute.
	 * @see #isForPushOnly()
	 * @generated
	 */
	void setForPushOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Keep Remove Info Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keep Remove Info Hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keep Remove Info Hours</em>' attribute.
	 * @see #setKeepRemoveInfoHours(double)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySync_KeepRemoveInfoHours()
	 * @model
	 * @generated
	 */
	double getKeepRemoveInfoHours();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getKeepRemoveInfoHours <em>Keep Remove Info Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep Remove Info Hours</em>' attribute.
	 * @see #getKeepRemoveInfoHours()
	 * @generated
	 */
	void setKeepRemoveInfoHours(double value);

	/**
	 * Returns the value of the '<em><b>Last History Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last History Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last History Start Date</em>' attribute.
	 * @see #setLastHistoryStartDate(Date)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySync_LastHistoryStartDate()
	 * @model
	 * @generated
	 */
	Date getLastHistoryStartDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getLastHistoryStartDate <em>Last History Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last History Start Date</em>' attribute.
	 * @see #getLastHistoryStartDate()
	 * @generated
	 */
	void setLastHistoryStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Successful Synch Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Successful Synch Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Successful Synch Time</em>' attribute.
	 * @see #setLastSuccessfulSynchTime(Date)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySync_LastSuccessfulSynchTime()
	 * @model
	 * @generated
	 */
	Date getLastSuccessfulSynchTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getLastSuccessfulSynchTime <em>Last Successful Synch Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Successful Synch Time</em>' attribute.
	 * @see #getLastSuccessfulSynchTime()
	 * @generated
	 */
	void setLastSuccessfulSynchTime(Date value);

	/**
	 * Returns the value of the '<em><b>Max Running No Update Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Running No Update Millis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Running No Update Millis</em>' attribute.
	 * @see #setMaxRunningNoUpdateMillis(long)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySync_MaxRunningNoUpdateMillis()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getMaxRunningNoUpdateMillis();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getMaxRunningNoUpdateMillis <em>Max Running No Update Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Running No Update Millis</em>' attribute.
	 * @see #getMaxRunningNoUpdateMillis()
	 * @generated
	 */
	void setMaxRunningNoUpdateMillis(long value);

	/**
	 * Returns the value of the '<em><b>Offline Sync Split Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offline Sync Split Millis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offline Sync Split Millis</em>' attribute.
	 * @see #setOfflineSyncSplitMillis(long)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySync_OfflineSyncSplitMillis()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getOfflineSyncSplitMillis();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getOfflineSyncSplitMillis <em>Offline Sync Split Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offline Sync Split Millis</em>' attribute.
	 * @see #getOfflineSyncSplitMillis()
	 * @generated
	 */
	void setOfflineSyncSplitMillis(long value);

	/**
	 * Returns the value of the '<em><b>Pre Offline Synch Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Offline Synch Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Offline Synch Time</em>' attribute.
	 * @see #setPreOfflineSynchTime(Date)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySync_PreOfflineSynchTime()
	 * @model
	 * @generated
	 */
	Date getPreOfflineSynchTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getPreOfflineSynchTime <em>Pre Offline Synch Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Offline Synch Time</em>' attribute.
	 * @see #getPreOfflineSynchTime()
	 * @generated
	 */
	void setPreOfflineSynchTime(Date value);

	/**
	 * Returns the value of the '<em><b>Run Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Status Id</em>' attribute.
	 * @see #setRunStatusId(String)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySync_RunStatusId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getRunStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getRunStatusId <em>Run Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Status Id</em>' attribute.
	 * @see #getRunStatusId()
	 * @generated
	 */
	void setRunStatusId(String value);

	/**
	 * Returns the value of the '<em><b>Sync End Buffer Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sync End Buffer Millis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync End Buffer Millis</em>' attribute.
	 * @see #setSyncEndBufferMillis(long)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySync_SyncEndBufferMillis()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSyncEndBufferMillis();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getSyncEndBufferMillis <em>Sync End Buffer Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync End Buffer Millis</em>' attribute.
	 * @see #getSyncEndBufferMillis()
	 * @generated
	 */
	void setSyncEndBufferMillis(long value);

	/**
	 * Returns the value of the '<em><b>Sync Split Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sync Split Millis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync Split Millis</em>' attribute.
	 * @see #setSyncSplitMillis(long)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySync_SyncSplitMillis()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSyncSplitMillis();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getSyncSplitMillis <em>Sync Split Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Split Millis</em>' attribute.
	 * @see #getSyncSplitMillis()
	 * @generated
	 */
	void setSyncSplitMillis(long value);

	/**
	 * Returns the value of the '<em><b>Target Delegator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Delegator Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Delegator Name</em>' attribute.
	 * @see #setTargetDelegatorName(String)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySync_TargetDelegatorName()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getTargetDelegatorName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getTargetDelegatorName <em>Target Delegator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Delegator Name</em>' attribute.
	 * @see #getTargetDelegatorName()
	 * @generated
	 */
	void setTargetDelegatorName(String value);

	/**
	 * Returns the value of the '<em><b>Target Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Service Name</em>' attribute.
	 * @see #setTargetServiceName(String)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySync_TargetServiceName()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getTargetServiceName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySync#getTargetServiceName <em>Target Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Service Name</em>' attribute.
	 * @see #getTargetServiceName()
	 * @generated
	 */
	void setTargetServiceName(String value);

} // EntitySync
