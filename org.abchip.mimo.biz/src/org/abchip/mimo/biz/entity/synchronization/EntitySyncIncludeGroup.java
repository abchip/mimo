/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.synchronization;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Sync Include Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncIncludeGroup#getEntitySyncId <em>Entity Sync Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncIncludeGroup#getEntityGroupId <em>Entity Group Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncIncludeGroup()
 * @model
 * @generated
 */
public interface EntitySyncIncludeGroup extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Entity Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Group Id</em>' attribute.
	 * @see #setEntityGroupId(String)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncIncludeGroup_EntityGroupId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='EntityGroup'"
	 * @generated
	 */
	String getEntityGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncIncludeGroup#getEntityGroupId <em>Entity Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Group Id</em>' attribute.
	 * @see #getEntityGroupId()
	 * @generated
	 */
	void setEntityGroupId(String value);

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
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncIncludeGroup_EntitySyncId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='EntitySync'"
	 * @generated
	 */
	String getEntitySyncId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncIncludeGroup#getEntitySyncId <em>Entity Sync Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Sync Id</em>' attribute.
	 * @see #getEntitySyncId()
	 * @generated
	 */
	void setEntitySyncId(String value);

} // EntitySyncIncludeGroup
