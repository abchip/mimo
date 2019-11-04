/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.synchronization.impl;

import org.abchip.mimo.biz.entity.group.EntityGroup;
import org.abchip.mimo.biz.entity.synchronization.EntitySync;
import org.abchip.mimo.biz.entity.synchronization.EntitySyncIncludeGroup;
import org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Sync Include Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncIncludeGroupImpl#getEntityGroupId <em>Entity Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncIncludeGroupImpl#getEntitySyncId <em>Entity Sync Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntitySyncIncludeGroupImpl extends BizEntityImpl implements EntitySyncIncludeGroup {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getEntityGroupId() <em>Entity Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityGroupId()
	 * @generated
	 * @ordered
	 */
	protected EntityGroup entityGroupId;
	/**
	 * The cached value of the '{@link #getEntitySyncId() <em>Entity Sync Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitySyncId()
	 * @generated
	 * @ordered
	 */
	protected EntitySync entitySyncId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntitySyncIncludeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SynchronizationPackage.Literals.ENTITY_SYNC_INCLUDE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityGroup getEntityGroupId() {
		if (entityGroupId != null && ((EObject)entityGroupId).eIsProxy()) {
			InternalEObject oldEntityGroupId = (InternalEObject)entityGroupId;
			entityGroupId = (EntityGroup)eResolveProxy(oldEntityGroupId);
			if (entityGroupId != oldEntityGroupId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__ENTITY_GROUP_ID, oldEntityGroupId, entityGroupId));
			}
		}
		return entityGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityGroup basicGetEntityGroupId() {
		return entityGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityGroupId(EntityGroup newEntityGroupId) {
		EntityGroup oldEntityGroupId = entityGroupId;
		entityGroupId = newEntityGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__ENTITY_GROUP_ID, oldEntityGroupId, entityGroupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntitySync getEntitySyncId() {
		if (entitySyncId != null && ((EObject)entitySyncId).eIsProxy()) {
			InternalEObject oldEntitySyncId = (InternalEObject)entitySyncId;
			entitySyncId = (EntitySync)eResolveProxy(oldEntitySyncId);
			if (entitySyncId != oldEntitySyncId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__ENTITY_SYNC_ID, oldEntitySyncId, entitySyncId));
			}
		}
		return entitySyncId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntitySync basicGetEntitySyncId() {
		return entitySyncId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntitySyncId(EntitySync newEntitySyncId) {
		EntitySync oldEntitySyncId = entitySyncId;
		entitySyncId = newEntitySyncId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__ENTITY_SYNC_ID, oldEntitySyncId, entitySyncId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__ENTITY_GROUP_ID:
				if (resolve) return getEntityGroupId();
				return basicGetEntityGroupId();
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__ENTITY_SYNC_ID:
				if (resolve) return getEntitySyncId();
				return basicGetEntitySyncId();
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
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__ENTITY_GROUP_ID:
				setEntityGroupId((EntityGroup)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__ENTITY_SYNC_ID:
				setEntitySyncId((EntitySync)newValue);
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
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__ENTITY_GROUP_ID:
				setEntityGroupId((EntityGroup)null);
				return;
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__ENTITY_SYNC_ID:
				setEntitySyncId((EntitySync)null);
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
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__ENTITY_GROUP_ID:
				return entityGroupId != null;
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__ENTITY_SYNC_ID:
				return entitySyncId != null;
		}
		return super.eIsSet(featureID);
	}

} //EntitySyncIncludeGroupImpl
