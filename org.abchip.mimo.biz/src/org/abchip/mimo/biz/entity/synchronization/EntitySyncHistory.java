/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.synchronization;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Sync History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getEntitySyncId <em>Entity Sync Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getBeginningSynchTime <em>Beginning Synch Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getLastCandidateEndTime <em>Last Candidate End Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getLastSplitStartTime <em>Last Split Start Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getLastSuccessfulSynchTime <em>Last Successful Synch Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getPerSplitMaxItems <em>Per Split Max Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getPerSplitMaxMillis <em>Per Split Max Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getPerSplitMinItems <em>Per Split Min Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getPerSplitMinMillis <em>Per Split Min Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getRunStatusId <em>Run Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getRunningTimeMillis <em>Running Time Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToCreateInserted <em>To Create Inserted</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToCreateNotUpdated <em>To Create Not Updated</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToCreateUpdated <em>To Create Updated</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToRemoveAlreadyDeleted <em>To Remove Already Deleted</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToRemoveDeleted <em>To Remove Deleted</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToStoreInserted <em>To Store Inserted</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToStoreNotUpdated <em>To Store Not Updated</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToStoreUpdated <em>To Store Updated</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getTotalRowsExported <em>Total Rows Exported</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getTotalRowsToCreate <em>Total Rows To Create</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getTotalRowsToRemove <em>Total Rows To Remove</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getTotalRowsToStore <em>Total Rows To Store</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getTotalSplits <em>Total Splits</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getTotalStoreCalls <em>Total Store Calls</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory()
 * @model annotation="mimo-ent-frame title='Entity Synchronization History'"
 * @generated
 */
public interface EntitySyncHistory extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Beginning Synch Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beginning Synch Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beginning Synch Time</em>' attribute.
	 * @see #setBeginningSynchTime(Date)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_BeginningSynchTime()
	 * @model
	 * @generated
	 */
	Date getBeginningSynchTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getBeginningSynchTime <em>Beginning Synch Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beginning Synch Time</em>' attribute.
	 * @see #getBeginningSynchTime()
	 * @generated
	 */
	void setBeginningSynchTime(Date value);

	/**
	 * Returns the value of the '<em><b>Entity Sync Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Sync Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Sync Id</em>' reference.
	 * @see #setEntitySyncId(EntitySync)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_EntitySyncId()
	 * @model keys="entitySyncId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	EntitySync getEntitySyncId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getEntitySyncId <em>Entity Sync Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Sync Id</em>' reference.
	 * @see #getEntitySyncId()
	 * @generated
	 */
	void setEntitySyncId(EntitySync value);

	/**
	 * Returns the value of the '<em><b>Last Candidate End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Candidate End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Candidate End Time</em>' attribute.
	 * @see #setLastCandidateEndTime(Date)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_LastCandidateEndTime()
	 * @model
	 * @generated
	 */
	Date getLastCandidateEndTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getLastCandidateEndTime <em>Last Candidate End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Candidate End Time</em>' attribute.
	 * @see #getLastCandidateEndTime()
	 * @generated
	 */
	void setLastCandidateEndTime(Date value);

	/**
	 * Returns the value of the '<em><b>Last Split Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Split Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Split Start Time</em>' attribute.
	 * @see #setLastSplitStartTime(long)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_LastSplitStartTime()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getLastSplitStartTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getLastSplitStartTime <em>Last Split Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Split Start Time</em>' attribute.
	 * @see #getLastSplitStartTime()
	 * @generated
	 */
	void setLastSplitStartTime(long value);

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
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_LastSuccessfulSynchTime()
	 * @model
	 * @generated
	 */
	Date getLastSuccessfulSynchTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getLastSuccessfulSynchTime <em>Last Successful Synch Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Successful Synch Time</em>' attribute.
	 * @see #getLastSuccessfulSynchTime()
	 * @generated
	 */
	void setLastSuccessfulSynchTime(Date value);

	/**
	 * Returns the value of the '<em><b>Per Split Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Per Split Max Items</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Per Split Max Items</em>' attribute.
	 * @see #setPerSplitMaxItems(long)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_PerSplitMaxItems()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getPerSplitMaxItems();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getPerSplitMaxItems <em>Per Split Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Per Split Max Items</em>' attribute.
	 * @see #getPerSplitMaxItems()
	 * @generated
	 */
	void setPerSplitMaxItems(long value);

	/**
	 * Returns the value of the '<em><b>Per Split Max Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Per Split Max Millis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Per Split Max Millis</em>' attribute.
	 * @see #setPerSplitMaxMillis(long)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_PerSplitMaxMillis()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getPerSplitMaxMillis();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getPerSplitMaxMillis <em>Per Split Max Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Per Split Max Millis</em>' attribute.
	 * @see #getPerSplitMaxMillis()
	 * @generated
	 */
	void setPerSplitMaxMillis(long value);

	/**
	 * Returns the value of the '<em><b>Per Split Min Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Per Split Min Items</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Per Split Min Items</em>' attribute.
	 * @see #setPerSplitMinItems(long)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_PerSplitMinItems()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getPerSplitMinItems();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getPerSplitMinItems <em>Per Split Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Per Split Min Items</em>' attribute.
	 * @see #getPerSplitMinItems()
	 * @generated
	 */
	void setPerSplitMinItems(long value);

	/**
	 * Returns the value of the '<em><b>Per Split Min Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Per Split Min Millis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Per Split Min Millis</em>' attribute.
	 * @see #setPerSplitMinMillis(long)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_PerSplitMinMillis()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getPerSplitMinMillis();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getPerSplitMinMillis <em>Per Split Min Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Per Split Min Millis</em>' attribute.
	 * @see #getPerSplitMinMillis()
	 * @generated
	 */
	void setPerSplitMinMillis(long value);

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
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_RunStatusId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getRunStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getRunStatusId <em>Run Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Status Id</em>' attribute.
	 * @see #getRunStatusId()
	 * @generated
	 */
	void setRunStatusId(String value);

	/**
	 * Returns the value of the '<em><b>Running Time Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running Time Millis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running Time Millis</em>' attribute.
	 * @see #setRunningTimeMillis(long)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_RunningTimeMillis()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getRunningTimeMillis();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getRunningTimeMillis <em>Running Time Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running Time Millis</em>' attribute.
	 * @see #getRunningTimeMillis()
	 * @generated
	 */
	void setRunningTimeMillis(long value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_StartDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>To Create Inserted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Create Inserted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Create Inserted</em>' attribute.
	 * @see #setToCreateInserted(long)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_ToCreateInserted()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getToCreateInserted();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToCreateInserted <em>To Create Inserted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Create Inserted</em>' attribute.
	 * @see #getToCreateInserted()
	 * @generated
	 */
	void setToCreateInserted(long value);

	/**
	 * Returns the value of the '<em><b>To Create Not Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Create Not Updated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Create Not Updated</em>' attribute.
	 * @see #setToCreateNotUpdated(long)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_ToCreateNotUpdated()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getToCreateNotUpdated();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToCreateNotUpdated <em>To Create Not Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Create Not Updated</em>' attribute.
	 * @see #getToCreateNotUpdated()
	 * @generated
	 */
	void setToCreateNotUpdated(long value);

	/**
	 * Returns the value of the '<em><b>To Create Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Create Updated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Create Updated</em>' attribute.
	 * @see #setToCreateUpdated(long)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_ToCreateUpdated()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getToCreateUpdated();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToCreateUpdated <em>To Create Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Create Updated</em>' attribute.
	 * @see #getToCreateUpdated()
	 * @generated
	 */
	void setToCreateUpdated(long value);

	/**
	 * Returns the value of the '<em><b>To Remove Already Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Remove Already Deleted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Remove Already Deleted</em>' attribute.
	 * @see #setToRemoveAlreadyDeleted(long)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_ToRemoveAlreadyDeleted()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getToRemoveAlreadyDeleted();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToRemoveAlreadyDeleted <em>To Remove Already Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Remove Already Deleted</em>' attribute.
	 * @see #getToRemoveAlreadyDeleted()
	 * @generated
	 */
	void setToRemoveAlreadyDeleted(long value);

	/**
	 * Returns the value of the '<em><b>To Remove Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Remove Deleted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Remove Deleted</em>' attribute.
	 * @see #setToRemoveDeleted(long)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_ToRemoveDeleted()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getToRemoveDeleted();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToRemoveDeleted <em>To Remove Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Remove Deleted</em>' attribute.
	 * @see #getToRemoveDeleted()
	 * @generated
	 */
	void setToRemoveDeleted(long value);

	/**
	 * Returns the value of the '<em><b>To Store Inserted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Store Inserted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Store Inserted</em>' attribute.
	 * @see #setToStoreInserted(long)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_ToStoreInserted()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getToStoreInserted();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToStoreInserted <em>To Store Inserted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Store Inserted</em>' attribute.
	 * @see #getToStoreInserted()
	 * @generated
	 */
	void setToStoreInserted(long value);

	/**
	 * Returns the value of the '<em><b>To Store Not Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Store Not Updated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Store Not Updated</em>' attribute.
	 * @see #setToStoreNotUpdated(long)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_ToStoreNotUpdated()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getToStoreNotUpdated();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToStoreNotUpdated <em>To Store Not Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Store Not Updated</em>' attribute.
	 * @see #getToStoreNotUpdated()
	 * @generated
	 */
	void setToStoreNotUpdated(long value);

	/**
	 * Returns the value of the '<em><b>To Store Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Store Updated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Store Updated</em>' attribute.
	 * @see #setToStoreUpdated(long)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_ToStoreUpdated()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getToStoreUpdated();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getToStoreUpdated <em>To Store Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Store Updated</em>' attribute.
	 * @see #getToStoreUpdated()
	 * @generated
	 */
	void setToStoreUpdated(long value);

	/**
	 * Returns the value of the '<em><b>Total Rows Exported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Rows Exported</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Rows Exported</em>' attribute.
	 * @see #setTotalRowsExported(long)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_TotalRowsExported()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getTotalRowsExported();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getTotalRowsExported <em>Total Rows Exported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Rows Exported</em>' attribute.
	 * @see #getTotalRowsExported()
	 * @generated
	 */
	void setTotalRowsExported(long value);

	/**
	 * Returns the value of the '<em><b>Total Rows To Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Rows To Create</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Rows To Create</em>' attribute.
	 * @see #setTotalRowsToCreate(long)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_TotalRowsToCreate()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getTotalRowsToCreate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getTotalRowsToCreate <em>Total Rows To Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Rows To Create</em>' attribute.
	 * @see #getTotalRowsToCreate()
	 * @generated
	 */
	void setTotalRowsToCreate(long value);

	/**
	 * Returns the value of the '<em><b>Total Rows To Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Rows To Remove</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Rows To Remove</em>' attribute.
	 * @see #setTotalRowsToRemove(long)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_TotalRowsToRemove()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getTotalRowsToRemove();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getTotalRowsToRemove <em>Total Rows To Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Rows To Remove</em>' attribute.
	 * @see #getTotalRowsToRemove()
	 * @generated
	 */
	void setTotalRowsToRemove(long value);

	/**
	 * Returns the value of the '<em><b>Total Rows To Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Rows To Store</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Rows To Store</em>' attribute.
	 * @see #setTotalRowsToStore(long)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_TotalRowsToStore()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getTotalRowsToStore();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getTotalRowsToStore <em>Total Rows To Store</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Rows To Store</em>' attribute.
	 * @see #getTotalRowsToStore()
	 * @generated
	 */
	void setTotalRowsToStore(long value);

	/**
	 * Returns the value of the '<em><b>Total Splits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Splits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Splits</em>' attribute.
	 * @see #setTotalSplits(long)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_TotalSplits()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getTotalSplits();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getTotalSplits <em>Total Splits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Splits</em>' attribute.
	 * @see #getTotalSplits()
	 * @generated
	 */
	void setTotalSplits(long value);

	/**
	 * Returns the value of the '<em><b>Total Store Calls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Store Calls</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Store Calls</em>' attribute.
	 * @see #setTotalStoreCalls(long)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncHistory_TotalStoreCalls()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getTotalStoreCalls();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncHistory#getTotalStoreCalls <em>Total Store Calls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Store Calls</em>' attribute.
	 * @see #getTotalStoreCalls()
	 * @generated
	 */
	void setTotalStoreCalls(long value);

} // EntitySyncHistory
