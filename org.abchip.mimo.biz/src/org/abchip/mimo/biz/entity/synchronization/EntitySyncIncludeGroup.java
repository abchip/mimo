/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.synchronization;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.entity.group.EntityGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Sync Include Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncIncludeGroup#getEntityGroupId <em>Entity Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncIncludeGroup#getEntitySyncId <em>Entity Sync Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncIncludeGroup()
 * @model annotation="mimo-ent-frame title='Entity Synchronization Include Entity Group'"
 * @generated
 */
public interface EntitySyncIncludeGroup extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Entity Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Group Id</em>' reference.
	 * @see #setEntityGroupId(EntityGroup)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncIncludeGroup_EntityGroupId()
	 * @model keys="entityGroupId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	EntityGroup getEntityGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncIncludeGroup#getEntityGroupId <em>Entity Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Group Id</em>' reference.
	 * @see #getEntityGroupId()
	 * @generated
	 */
	void setEntityGroupId(EntityGroup value);

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
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncIncludeGroup_EntitySyncId()
	 * @model keys="entitySyncId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	EntitySync getEntitySyncId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncIncludeGroup#getEntitySyncId <em>Entity Sync Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Sync Id</em>' reference.
	 * @see #getEntitySyncId()
	 * @generated
	 */
	void setEntitySyncId(EntitySync value);

} // EntitySyncIncludeGroup
