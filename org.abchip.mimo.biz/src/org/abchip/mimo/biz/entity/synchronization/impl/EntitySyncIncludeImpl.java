/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.synchronization.impl;

import org.abchip.mimo.biz.entity.synchronization.EntitySyncInclude;
import org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The default value of the '{@link #getEntitySyncId() <em>Entity Sync Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitySyncId()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_SYNC_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntitySyncId() <em>Entity Sync Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitySyncId()
	 * @generated
	 * @ordered
	 */
	protected String entitySyncId = ENTITY_SYNC_ID_EDEFAULT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_INCLUDE__APPL_ENUM_ID, oldApplEnumId, applEnumId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_INCLUDE__ENTITY_OR_PACKAGE, oldEntityOrPackage, entityOrPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntitySyncId() {
		return entitySyncId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntitySyncId(String newEntitySyncId) {
		String oldEntitySyncId = entitySyncId;
		entitySyncId = newEntitySyncId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SynchronizationPackage.ENTITY_SYNC_INCLUDE__ENTITY_SYNC_ID, oldEntitySyncId, entitySyncId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE__ENTITY_SYNC_ID:
				return getEntitySyncId();
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE__ENTITY_OR_PACKAGE:
				return getEntityOrPackage();
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE__APPL_ENUM_ID:
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
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE__ENTITY_SYNC_ID:
				setEntitySyncId((String)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE__ENTITY_OR_PACKAGE:
				setEntityOrPackage((String)newValue);
				return;
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE__APPL_ENUM_ID:
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
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE__ENTITY_SYNC_ID:
				setEntitySyncId(ENTITY_SYNC_ID_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE__ENTITY_OR_PACKAGE:
				setEntityOrPackage(ENTITY_OR_PACKAGE_EDEFAULT);
				return;
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE__APPL_ENUM_ID:
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
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE__ENTITY_SYNC_ID:
				return ENTITY_SYNC_ID_EDEFAULT == null ? entitySyncId != null : !ENTITY_SYNC_ID_EDEFAULT.equals(entitySyncId);
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE__ENTITY_OR_PACKAGE:
				return ENTITY_OR_PACKAGE_EDEFAULT == null ? entityOrPackage != null : !ENTITY_OR_PACKAGE_EDEFAULT.equals(entityOrPackage);
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE__APPL_ENUM_ID:
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
		result.append(" (entitySyncId: ");
		result.append(entitySyncId);
		result.append(", entityOrPackage: ");
		result.append(entityOrPackage);
		result.append(", applEnumId: ");
		result.append(applEnumId);
		result.append(')');
		return result.toString();
	}

} //EntitySyncIncludeImpl
