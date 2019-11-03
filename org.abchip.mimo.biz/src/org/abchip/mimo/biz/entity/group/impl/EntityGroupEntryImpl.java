/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.group.impl;

import org.abchip.mimo.biz.entity.group.EntityGroupEntry;
import org.abchip.mimo.biz.entity.group.GroupPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The default value of the '{@link #getEntityOrPackage() <em>Entity Or Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityOrPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_OR_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntityOrPackage() <em>Entity Or Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityOrPackage()
	 * @generated
	 * @ordered
	 */
	protected String entityOrPackage = ENTITY_OR_PACKAGE_EDEFAULT;
	/**
	 * The default value of the '{@link #getApplEnumId() <em>Appl Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String APPL_ENUM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getApplEnumId() <em>Appl Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplEnumId()
	 * @generated
	 * @ordered
	 */
	protected String applEnumId = APPL_ENUM_ID_EDEFAULT;

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
		return applEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplEnumId(String newApplEnumId) {
		String oldApplEnumId = applEnumId;
		applEnumId = newApplEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupPackage.ENTITY_GROUP_ENTRY__APPL_ENUM_ID, oldApplEnumId, applEnumId));
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
		String oldEntityGroupId = entityGroupId;
		entityGroupId = newEntityGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupPackage.ENTITY_GROUP_ENTRY__ENTITY_GROUP_ID, oldEntityGroupId, entityGroupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntityOrPackage() {
		return entityOrPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityOrPackage(String newEntityOrPackage) {
		String oldEntityOrPackage = entityOrPackage;
		entityOrPackage = newEntityOrPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GroupPackage.ENTITY_GROUP_ENTRY__ENTITY_OR_PACKAGE, oldEntityOrPackage, entityOrPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GroupPackage.ENTITY_GROUP_ENTRY__ENTITY_GROUP_ID:
				return getEntityGroupId();
			case GroupPackage.ENTITY_GROUP_ENTRY__ENTITY_OR_PACKAGE:
				return getEntityOrPackage();
			case GroupPackage.ENTITY_GROUP_ENTRY__APPL_ENUM_ID:
				return getApplEnumId();
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
			case GroupPackage.ENTITY_GROUP_ENTRY__ENTITY_GROUP_ID:
				setEntityGroupId((String)newValue);
				return;
			case GroupPackage.ENTITY_GROUP_ENTRY__ENTITY_OR_PACKAGE:
				setEntityOrPackage((String)newValue);
				return;
			case GroupPackage.ENTITY_GROUP_ENTRY__APPL_ENUM_ID:
				setApplEnumId((String)newValue);
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
			case GroupPackage.ENTITY_GROUP_ENTRY__ENTITY_GROUP_ID:
				setEntityGroupId(ENTITY_GROUP_ID_EDEFAULT);
				return;
			case GroupPackage.ENTITY_GROUP_ENTRY__ENTITY_OR_PACKAGE:
				setEntityOrPackage(ENTITY_OR_PACKAGE_EDEFAULT);
				return;
			case GroupPackage.ENTITY_GROUP_ENTRY__APPL_ENUM_ID:
				setApplEnumId(APPL_ENUM_ID_EDEFAULT);
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
			case GroupPackage.ENTITY_GROUP_ENTRY__ENTITY_GROUP_ID:
				return ENTITY_GROUP_ID_EDEFAULT == null ? entityGroupId != null : !ENTITY_GROUP_ID_EDEFAULT.equals(entityGroupId);
			case GroupPackage.ENTITY_GROUP_ENTRY__ENTITY_OR_PACKAGE:
				return ENTITY_OR_PACKAGE_EDEFAULT == null ? entityOrPackage != null : !ENTITY_OR_PACKAGE_EDEFAULT.equals(entityOrPackage);
			case GroupPackage.ENTITY_GROUP_ENTRY__APPL_ENUM_ID:
				return APPL_ENUM_ID_EDEFAULT == null ? applEnumId != null : !APPL_ENUM_ID_EDEFAULT.equals(applEnumId);
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
		result.append(", entityOrPackage: ");
		result.append(entityOrPackage);
		result.append(", applEnumId: ");
		result.append(applEnumId);
		result.append(')');
		return result.toString();
	}

} //EntityGroupEntryImpl
