/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.group.impl;

import java.util.List;
import org.abchip.mimo.biz.entity.group.EntityGroup;
import org.abchip.mimo.biz.entity.group.EntityGroupEntry;
import org.abchip.mimo.biz.entity.group.GroupPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.group.impl.EntityGroupImpl#getEntityGroupId <em>Entity Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.group.impl.EntityGroupImpl#getEntityGroupEntries <em>Entity Group Entries</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.group.impl.EntityGroupImpl#getEntityGroupName <em>Entity Group Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityGroupImpl extends BizEntityImpl implements EntityGroup {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupPackage.Literals.ENTITY_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntityGroupId() {
		return (String)eGet(GroupPackage.Literals.ENTITY_GROUP__ENTITY_GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityGroupId(String newEntityGroupId) {
		eSet(GroupPackage.Literals.ENTITY_GROUP__ENTITY_GROUP_ID, newEntityGroupId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<EntityGroupEntry> getEntityGroupEntries() {
		return (List<EntityGroupEntry>)eGet(GroupPackage.Literals.ENTITY_GROUP__ENTITY_GROUP_ENTRIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntityGroupName() {
		return (String)eGet(GroupPackage.Literals.ENTITY_GROUP__ENTITY_GROUP_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityGroupName(String newEntityGroupName) {
		eSet(GroupPackage.Literals.ENTITY_GROUP__ENTITY_GROUP_NAME, newEntityGroupName);
	}

} //EntityGroupImpl
