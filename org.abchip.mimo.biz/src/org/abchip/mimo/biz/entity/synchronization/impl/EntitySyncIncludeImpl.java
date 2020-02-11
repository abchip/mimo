/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.synchronization.impl;

import org.abchip.mimo.biz.entity.synchronization.EntitySync;
import org.abchip.mimo.biz.entity.synchronization.EntitySyncInclude;
import org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Sync Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncIncludeImpl#getEntitySyncId <em>Entity Sync Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncIncludeImpl#getEntityOrPackage <em>Entity Or Package</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.impl.EntitySyncIncludeImpl#getApplEnumId <em>Appl Enum Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntitySyncIncludeImpl extends BizEntityImpl implements EntitySyncInclude {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntitySyncIncludeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SynchronizationPackage.Literals.ENTITY_SYNC_INCLUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApplEnumId() {
		return (String)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_INCLUDE__APPL_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplEnumId(String newApplEnumId) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_INCLUDE__APPL_ENUM_ID, newApplEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntityOrPackage() {
		return (String)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_INCLUDE__ENTITY_OR_PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityOrPackage(String newEntityOrPackage) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_INCLUDE__ENTITY_OR_PACKAGE, newEntityOrPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntitySync getEntitySyncId() {
		return (EntitySync)eGet(SynchronizationPackage.Literals.ENTITY_SYNC_INCLUDE__ENTITY_SYNC_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntitySyncId(EntitySync newEntitySyncId) {
		eSet(SynchronizationPackage.Literals.ENTITY_SYNC_INCLUDE__ENTITY_SYNC_ID, newEntitySyncId);
	}

} //EntitySyncIncludeImpl
