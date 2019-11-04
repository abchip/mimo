/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.synchronization.impl;

import org.abchip.mimo.biz.entity.group.EntityGroup;
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
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncIncludeGroupImpl#getEntitySyncId <em>Entity Sync Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncIncludeGroupImpl#getEntityGroupId <em>Entity Group Id</em>}</li>
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
	 * The cached value of the '{@link #getEntityGroupId() <em>Entity Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityGroupId()
	 * @generated
	 * @ordered
	 */
	protected EntityGroup entityGroupId;

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
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__ENTITY_SYNC_ID:
				return getEntitySyncId();
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__ENTITY_GROUP_ID:
				if (resolve) return getEntityGroupId();
				return basicGetEntityGroupId();
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
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__ENTITY_SYNC_ID:
				setEntitySyncId((String)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__ENTITY_GROUP_ID:
				setEntityGroupId((EntityGroup)newValue);
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
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__ENTITY_SYNC_ID:
				setEntitySyncId(ENTITY_SYNC_ID_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__ENTITY_GROUP_ID:
				setEntityGroupId((EntityGroup)null);
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
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__ENTITY_SYNC_ID:
				return ENTITY_SYNC_ID_EDEFAULT == null ? entitySyncId != null : !ENTITY_SYNC_ID_EDEFAULT.equals(entitySyncId);
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP__ENTITY_GROUP_ID:
				return entityGroupId != null;
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
		result.append(')');
		return result.toString();
	}

} //EntitySyncIncludeGroupImpl
