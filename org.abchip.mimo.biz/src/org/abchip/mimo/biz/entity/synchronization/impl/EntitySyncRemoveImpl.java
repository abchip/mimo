/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
		return (String)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_REMOVE__ENTITY_SYNC_REMOVE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntitySyncRemoveId(String newEntitySyncRemoveId) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_REMOVE__ENTITY_SYNC_REMOVE_ID, newEntitySyncRemoveId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrimaryKeyRemoved() {
		return (String)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_REMOVE__PRIMARY_KEY_REMOVED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryKeyRemoved(String newPrimaryKeyRemoved) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_REMOVE__PRIMARY_KEY_REMOVED, newPrimaryKeyRemoved);
	}

} //EntitySyncRemoveImpl
