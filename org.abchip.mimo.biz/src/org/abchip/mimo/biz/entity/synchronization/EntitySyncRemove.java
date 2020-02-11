/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.synchronization;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Sync Remove</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncRemove#getEntitySyncRemoveId <em>Entity Sync Remove Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncRemove#getPrimaryKeyRemoved <em>Primary Key Removed</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncRemove()
 * @model annotation="mimo-ent-frame title='Entity Synchronization Remove'"
 * @generated
 */
public interface EntitySyncRemove extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Entity Sync Remove Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Sync Remove Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Sync Remove Id</em>' attribute.
	 * @see #setEntitySyncRemoveId(String)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncRemove_EntitySyncRemoveId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getEntitySyncRemoveId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncRemove#getEntitySyncRemoveId <em>Entity Sync Remove Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Sync Remove Id</em>' attribute.
	 * @see #getEntitySyncRemoveId()
	 * @generated
	 */
	void setEntitySyncRemoveId(String value);

	/**
	 * Returns the value of the '<em><b>Primary Key Removed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key Removed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key Removed</em>' attribute.
	 * @see #setPrimaryKeyRemoved(String)
	 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage#getEntitySyncRemove_PrimaryKeyRemoved()
	 * @model
	 * @generated
	 */
	String getPrimaryKeyRemoved();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.synchronization.EntitySyncRemove#getPrimaryKeyRemoved <em>Primary Key Removed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key Removed</em>' attribute.
	 * @see #getPrimaryKeyRemoved()
	 * @generated
	 */
	void setPrimaryKeyRemoved(String value);

} // EntitySyncRemove
