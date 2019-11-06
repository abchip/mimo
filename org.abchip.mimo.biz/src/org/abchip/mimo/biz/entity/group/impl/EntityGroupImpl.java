/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.group.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.entity.group.EntityGroup;
import org.abchip.mimo.biz.entity.group.GroupPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.group.impl.EntityGroupImpl#getEntityGroupId <em>Entity Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.group.impl.EntityGroupImpl#getEntityGroupName <em>Entity Group Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.group.impl.EntityGroupImpl#getEntityGroupEntries <em>Entity Group Entries</em>}</li>
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
	 * The default value of the '{@link #getEntityGroupId() <em>Entity Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntityGroupId() <em>Entity Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityGroupId()
	 * @generated
	 * @ordered
	 */
	protected String entityGroupId = ENTITY_GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntityGroupName() <em>Entity Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityGroupName()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_GROUP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntityGroupName() <em>Entity Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityGroupName()
	 * @generated
	 * @ordered
	 */
	protected String entityGroupName = ENTITY_GROUP_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntityGroupEntries() <em>Entity Group Entries</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityGroupEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<String> entityGroupEntries;

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
		return entityGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityGroupId(String newEntityGroupId) {
		entityGroupId = newEntityGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntityGroupName() {
		return entityGroupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityGroupName(String newEntityGroupName) {
		entityGroupName = newEntityGroupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getEntityGroupEntries() {
		if (entityGroupEntries == null) {
			entityGroupEntries = new BasicInternalEList<String>(String.class);
		}
		return entityGroupEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> entitySyncIncludeGroups() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GroupPackage.ENTITY_GROUP__ENTITY_GROUP_ID:
				return getEntityGroupId();
			case GroupPackage.ENTITY_GROUP__ENTITY_GROUP_NAME:
				return getEntityGroupName();
			case GroupPackage.ENTITY_GROUP__ENTITY_GROUP_ENTRIES:
				return getEntityGroupEntries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GroupPackage.ENTITY_GROUP__ENTITY_GROUP_ID:
				setEntityGroupId((String)newValue);
				return;
			case GroupPackage.ENTITY_GROUP__ENTITY_GROUP_NAME:
				setEntityGroupName((String)newValue);
				return;
			case GroupPackage.ENTITY_GROUP__ENTITY_GROUP_ENTRIES:
				getEntityGroupEntries().clear();
				getEntityGroupEntries().addAll((Collection<? extends String>)newValue);
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
			case GroupPackage.ENTITY_GROUP__ENTITY_GROUP_ID:
				setEntityGroupId(ENTITY_GROUP_ID_EDEFAULT);
				return;
			case GroupPackage.ENTITY_GROUP__ENTITY_GROUP_NAME:
				setEntityGroupName(ENTITY_GROUP_NAME_EDEFAULT);
				return;
			case GroupPackage.ENTITY_GROUP__ENTITY_GROUP_ENTRIES:
				getEntityGroupEntries().clear();
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
			case GroupPackage.ENTITY_GROUP__ENTITY_GROUP_ID:
				return ENTITY_GROUP_ID_EDEFAULT == null ? entityGroupId != null : !ENTITY_GROUP_ID_EDEFAULT.equals(entityGroupId);
			case GroupPackage.ENTITY_GROUP__ENTITY_GROUP_NAME:
				return ENTITY_GROUP_NAME_EDEFAULT == null ? entityGroupName != null : !ENTITY_GROUP_NAME_EDEFAULT.equals(entityGroupName);
			case GroupPackage.ENTITY_GROUP__ENTITY_GROUP_ENTRIES:
				return entityGroupEntries != null && !entityGroupEntries.isEmpty();
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
		result.append(" (entityGroupId: ");
		result.append(entityGroupId);
		result.append(", entityGroupName: ");
		result.append(entityGroupName);
		result.append(", entityGroupEntries: ");
		result.append(entityGroupEntries);
		result.append(')');
		return result.toString();
	}

} //EntityGroupImpl
