/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.group;

import java.util.List;
import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.group.EntityGroup#getEntityGroupId <em>Entity Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.group.EntityGroup#getEntityGroupEntries <em>Entity Group Entries</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.group.EntityGroup#getEntityGroupName <em>Entity Group Name</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.entity.group.GroupPackage#getEntityGroup()
 * @model annotation="mimo-ent-frame title='Entity Grouping'"
 * @generated
 */
public interface EntityGroup extends BizEntity {
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
	 * @see org.abchip.mimo.biz.entity.group.GroupPackage#getEntityGroup_EntityGroupId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getEntityGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.group.EntityGroup#getEntityGroupId <em>Entity Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Group Id</em>' attribute.
	 * @see #getEntityGroupId()
	 * @generated
	 */
	void setEntityGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Entity Group Entries</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.entity.group.EntityGroupEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Group Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Group Entries</em>' reference list.
	 * @see org.abchip.mimo.biz.entity.group.GroupPackage#getEntityGroup_EntityGroupEntries()
	 * @model derived="true"
	 * @generated
	 */
	List<EntityGroupEntry> getEntityGroupEntries();

	/**
	 * Returns the value of the '<em><b>Entity Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Group Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Group Name</em>' attribute.
	 * @see #setEntityGroupName(String)
	 * @see org.abchip.mimo.biz.entity.group.GroupPackage#getEntityGroup_EntityGroupName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getEntityGroupName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.group.EntityGroup#getEntityGroupName <em>Entity Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Group Name</em>' attribute.
	 * @see #getEntityGroupName()
	 * @generated
	 */
	void setEntityGroupName(String value);

} // EntityGroup
