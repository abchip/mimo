/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.content.data.DataPackage;
import org.abchip.mimo.biz.content.data.DataResource;
import org.abchip.mimo.biz.content.data.DataResourceType;
import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceTypeImpl#getDataResourceTypeId <em>Data Resource Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceTypeImpl#getDataResourceTypeAttrs <em>Data Resource Type Attrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataResourceTypeImpl extends BizEntityTypeImpl<DataResource> implements DataResourceType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getDataResourceTypeId() <em>Data Resource Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_RESOURCE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataResourceTypeId() <em>Data Resource Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceTypeId()
	 * @generated
	 * @ordered
	 */
	protected String dataResourceTypeId = DATA_RESOURCE_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_TABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected boolean hasTable = HAS_TABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected DataResourceType parentTypeId;

	/**
	 * The cached value of the '{@link #getDataResourceTypeAttrs() <em>Data Resource Type Attrs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceTypeAttrs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dataResourceTypeAttrs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.DATA_RESOURCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataResourceTypeId() {
		return dataResourceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataResourceTypeId(String newDataResourceTypeId) {
		String oldDataResourceTypeId = dataResourceTypeId;
		dataResourceTypeId = newDataResourceTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE_TYPE__DATA_RESOURCE_TYPE_ID, oldDataResourceTypeId, dataResourceTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return hasTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		boolean oldHasTable = hasTable;
		hasTable = newHasTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE_TYPE__HAS_TABLE, oldHasTable, hasTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataResourceType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (DataResourceType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.DATA_RESOURCE_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataResourceType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(DataResourceType newParentTypeId) {
		DataResourceType oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getDataResourceTypeAttrs() {
		if (dataResourceTypeAttrs == null) {
			dataResourceTypeAttrs = new EDataTypeUniqueEList<String>(String.class, this, DataPackage.DATA_RESOURCE_TYPE__DATA_RESOURCE_TYPE_ATTRS);
		}
		return dataResourceTypeAttrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childDataResourceTypes() {
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
	public List<String> dataResources() {
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
			case DataPackage.DATA_RESOURCE_TYPE__DATA_RESOURCE_TYPE_ID:
				return getDataResourceTypeId();
			case DataPackage.DATA_RESOURCE_TYPE__DESCRIPTION:
				return getDescription();
			case DataPackage.DATA_RESOURCE_TYPE__HAS_TABLE:
				return isHasTable();
			case DataPackage.DATA_RESOURCE_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
			case DataPackage.DATA_RESOURCE_TYPE__DATA_RESOURCE_TYPE_ATTRS:
				return getDataResourceTypeAttrs();
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
			case DataPackage.DATA_RESOURCE_TYPE__DATA_RESOURCE_TYPE_ID:
				setDataResourceTypeId((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case DataPackage.DATA_RESOURCE_TYPE__PARENT_TYPE_ID:
				setParentTypeId((DataResourceType)newValue);
				return;
			case DataPackage.DATA_RESOURCE_TYPE__DATA_RESOURCE_TYPE_ATTRS:
				getDataResourceTypeAttrs().clear();
				getDataResourceTypeAttrs().addAll((Collection<? extends String>)newValue);
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
			case DataPackage.DATA_RESOURCE_TYPE__DATA_RESOURCE_TYPE_ID:
				setDataResourceTypeId(DATA_RESOURCE_TYPE_ID_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE_TYPE__PARENT_TYPE_ID:
				setParentTypeId((DataResourceType)null);
				return;
			case DataPackage.DATA_RESOURCE_TYPE__DATA_RESOURCE_TYPE_ATTRS:
				getDataResourceTypeAttrs().clear();
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
			case DataPackage.DATA_RESOURCE_TYPE__DATA_RESOURCE_TYPE_ID:
				return DATA_RESOURCE_TYPE_ID_EDEFAULT == null ? dataResourceTypeId != null : !DATA_RESOURCE_TYPE_ID_EDEFAULT.equals(dataResourceTypeId);
			case DataPackage.DATA_RESOURCE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DataPackage.DATA_RESOURCE_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case DataPackage.DATA_RESOURCE_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
			case DataPackage.DATA_RESOURCE_TYPE__DATA_RESOURCE_TYPE_ATTRS:
				return dataResourceTypeAttrs != null && !dataResourceTypeAttrs.isEmpty();
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
		result.append(" (dataResourceTypeId: ");
		result.append(dataResourceTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(", dataResourceTypeAttrs: ");
		result.append(dataResourceTypeAttrs);
		result.append(')');
		return result.toString();
	}

} //DataResourceTypeImpl
