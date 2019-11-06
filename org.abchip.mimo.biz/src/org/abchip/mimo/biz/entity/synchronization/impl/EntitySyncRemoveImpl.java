/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.synchronization.impl;

import org.abchip.mimo.biz.entity.synchronization.EntitySyncRemove;
import org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Sync Remove</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncRemoveImpl#getEntitySyncRemoveId <em>Entity Sync Remove Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncRemoveImpl#getPrimaryKeyRemoved <em>Primary Key Removed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntitySyncRemoveImpl extends BizEntityImpl implements EntitySyncRemove {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getEntitySyncRemoveId() <em>Entity Sync Remove Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitySyncRemoveId()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_SYNC_REMOVE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntitySyncRemoveId() <em>Entity Sync Remove Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitySyncRemoveId()
	 * @generated
	 * @ordered
	 */
	protected String entitySyncRemoveId = ENTITY_SYNC_REMOVE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryKeyRemoved() <em>Primary Key Removed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKeyRemoved()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_KEY_REMOVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryKeyRemoved() <em>Primary Key Removed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryKeyRemoved()
	 * @generated
	 * @ordered
	 */
	protected String primaryKeyRemoved = PRIMARY_KEY_REMOVED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntitySyncRemoveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SynchronizationPackage.Literals.ENTITY_SYNC_REMOVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntitySyncRemoveId() {
		return entitySyncRemoveId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntitySyncRemoveId(String newEntitySyncRemoveId) {
		entitySyncRemoveId = newEntitySyncRemoveId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrimaryKeyRemoved() {
		return primaryKeyRemoved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryKeyRemoved(String newPrimaryKeyRemoved) {
		primaryKeyRemoved = newPrimaryKeyRemoved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SynchronizationPackage.ENTITY_SYNC_REMOVE__ENTITY_SYNC_REMOVE_ID:
				return getEntitySyncRemoveId();
			case SynchronizationPackage.ENTITY_SYNC_REMOVE__PRIMARY_KEY_REMOVED:
				return getPrimaryKeyRemoved();
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
			case SynchronizationPackage.ENTITY_SYNC_REMOVE__ENTITY_SYNC_REMOVE_ID:
				setEntitySyncRemoveId((String)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_REMOVE__PRIMARY_KEY_REMOVED:
				setPrimaryKeyRemoved((String)newValue);
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
			case SynchronizationPackage.ENTITY_SYNC_REMOVE__ENTITY_SYNC_REMOVE_ID:
				setEntitySyncRemoveId(ENTITY_SYNC_REMOVE_ID_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_REMOVE__PRIMARY_KEY_REMOVED:
				setPrimaryKeyRemoved(PRIMARY_KEY_REMOVED_EDEFAULT);
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
			case SynchronizationPackage.ENTITY_SYNC_REMOVE__ENTITY_SYNC_REMOVE_ID:
				return ENTITY_SYNC_REMOVE_ID_EDEFAULT == null ? entitySyncRemoveId != null : !ENTITY_SYNC_REMOVE_ID_EDEFAULT.equals(entitySyncRemoveId);
			case SynchronizationPackage.ENTITY_SYNC_REMOVE__PRIMARY_KEY_REMOVED:
				return PRIMARY_KEY_REMOVED_EDEFAULT == null ? primaryKeyRemoved != null : !PRIMARY_KEY_REMOVED_EDEFAULT.equals(primaryKeyRemoved);
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
		result.append(" (entitySyncRemoveId: ");
		result.append(entitySyncRemoveId);
		result.append(", primaryKeyRemoved: ");
		result.append(primaryKeyRemoved);
		result.append(')');
		return result.toString();
	}

} //EntitySyncRemoveImpl
