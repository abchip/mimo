/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.group.impl;

import org.abchip.mimo.biz.entity.group.EntityGroup;
import org.abchip.mimo.biz.entity.group.EntityGroupEntry;
import org.abchip.mimo.biz.entity.group.GroupPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Group Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.group.impl.EntityGroupEntryImpl#getEntityGroupId <em>Entity Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.group.impl.EntityGroupEntryImpl#getEntityOrPackage <em>Entity Or Package</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.group.impl.EntityGroupEntryImpl#getApplEnumId <em>Appl Enum Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityGroupEntryImpl extends BizEntityImpl implements EntityGroupEntry {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityGroupEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GroupPackage.Literals.ENTITY_GROUP_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApplEnumId() {
		return (String)eGet(GroupPackage.Literals.ENTITY_GROUP_ENTRY__APPL_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplEnumId(String newApplEnumId) {
		eSet(GroupPackage.Literals.ENTITY_GROUP_ENTRY__APPL_ENUM_ID, newApplEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityGroup getEntityGroupId() {
		return (EntityGroup)eGet(GroupPackage.Literals.ENTITY_GROUP_ENTRY__ENTITY_GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityGroupId(EntityGroup newEntityGroupId) {
		eSet(GroupPackage.Literals.ENTITY_GROUP_ENTRY__ENTITY_GROUP_ID, newEntityGroupId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntityOrPackage() {
		return (String)eGet(GroupPackage.Literals.ENTITY_GROUP_ENTRY__ENTITY_OR_PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityOrPackage(String newEntityOrPackage) {
		eSet(GroupPackage.Literals.ENTITY_GROUP_ENTRY__ENTITY_OR_PACKAGE, newEntityOrPackage);
	}

} //EntityGroupEntryImpl
