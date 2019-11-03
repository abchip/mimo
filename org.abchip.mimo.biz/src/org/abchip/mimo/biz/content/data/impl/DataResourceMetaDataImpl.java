/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data.impl;

import org.abchip.mimo.biz.content.data.DataPackage;
import org.abchip.mimo.biz.content.data.DataResourceMetaData;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Resource Meta Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceMetaDataImpl#getDataResourceId <em>Data Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceMetaDataImpl#getMetaDataPredicateId <em>Meta Data Predicate Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceMetaDataImpl#getDataSourceId <em>Data Source Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceMetaDataImpl#getMetaDataValue <em>Meta Data Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataResourceMetaDataImpl extends BizEntityImpl implements DataResourceMetaData {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getDataResourceId() <em>Data Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceId()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_RESOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataResourceId() <em>Data Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceId()
	 * @generated
	 * @ordered
	 */
	protected String dataResourceId = DATA_RESOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetaDataPredicateId() <em>Meta Data Predicate Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaDataPredicateId()
	 * @generated
	 * @ordered
	 */
	protected static final String META_DATA_PREDICATE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaDataPredicateId() <em>Meta Data Predicate Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaDataPredicateId()
	 * @generated
	 * @ordered
	 */
	protected String metaDataPredicateId = META_DATA_PREDICATE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataSourceId() <em>Data Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceId()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSourceId() <em>Data Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceId()
	 * @generated
	 * @ordered
	 */
	protected String dataSourceId = DATA_SOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetaDataValue() <em>Meta Data Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaDataValue()
	 * @generated
	 * @ordered
	 */
	protected static final String META_DATA_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaDataValue() <em>Meta Data Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaDataValue()
	 * @generated
	 * @ordered
	 */
	protected String metaDataValue = META_DATA_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataResourceMetaDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.DATA_RESOURCE_META_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataResourceId() {
		return dataResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataResourceId(String newDataResourceId) {
		String oldDataResourceId = dataResourceId;
		dataResourceId = newDataResourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE_META_DATA__DATA_RESOURCE_ID, oldDataResourceId, dataResourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataSourceId() {
		return dataSourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataSourceId(String newDataSourceId) {
		String oldDataSourceId = dataSourceId;
		dataSourceId = newDataSourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE_META_DATA__DATA_SOURCE_ID, oldDataSourceId, dataSourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMetaDataPredicateId() {
		return metaDataPredicateId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetaDataPredicateId(String newMetaDataPredicateId) {
		String oldMetaDataPredicateId = metaDataPredicateId;
		metaDataPredicateId = newMetaDataPredicateId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE_META_DATA__META_DATA_PREDICATE_ID, oldMetaDataPredicateId, metaDataPredicateId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMetaDataValue() {
		return metaDataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetaDataValue(String newMetaDataValue) {
		String oldMetaDataValue = metaDataValue;
		metaDataValue = newMetaDataValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE_META_DATA__META_DATA_VALUE, oldMetaDataValue, metaDataValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.DATA_RESOURCE_META_DATA__DATA_RESOURCE_ID:
				return getDataResourceId();
			case DataPackage.DATA_RESOURCE_META_DATA__META_DATA_PREDICATE_ID:
				return getMetaDataPredicateId();
			case DataPackage.DATA_RESOURCE_META_DATA__DATA_SOURCE_ID:
				return getDataSourceId();
			case DataPackage.DATA_RESOURCE_META_DATA__META_DATA_VALUE:
				return getMetaDataValue();
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
			case DataPackage.DATA_RESOURCE_META_DATA__DATA_RESOURCE_ID:
				setDataResourceId((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE_META_DATA__META_DATA_PREDICATE_ID:
				setMetaDataPredicateId((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE_META_DATA__DATA_SOURCE_ID:
				setDataSourceId((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE_META_DATA__META_DATA_VALUE:
				setMetaDataValue((String)newValue);
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
			case DataPackage.DATA_RESOURCE_META_DATA__DATA_RESOURCE_ID:
				setDataResourceId(DATA_RESOURCE_ID_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE_META_DATA__META_DATA_PREDICATE_ID:
				setMetaDataPredicateId(META_DATA_PREDICATE_ID_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE_META_DATA__DATA_SOURCE_ID:
				setDataSourceId(DATA_SOURCE_ID_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE_META_DATA__META_DATA_VALUE:
				setMetaDataValue(META_DATA_VALUE_EDEFAULT);
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
			case DataPackage.DATA_RESOURCE_META_DATA__DATA_RESOURCE_ID:
				return DATA_RESOURCE_ID_EDEFAULT == null ? dataResourceId != null : !DATA_RESOURCE_ID_EDEFAULT.equals(dataResourceId);
			case DataPackage.DATA_RESOURCE_META_DATA__META_DATA_PREDICATE_ID:
				return META_DATA_PREDICATE_ID_EDEFAULT == null ? metaDataPredicateId != null : !META_DATA_PREDICATE_ID_EDEFAULT.equals(metaDataPredicateId);
			case DataPackage.DATA_RESOURCE_META_DATA__DATA_SOURCE_ID:
				return DATA_SOURCE_ID_EDEFAULT == null ? dataSourceId != null : !DATA_SOURCE_ID_EDEFAULT.equals(dataSourceId);
			case DataPackage.DATA_RESOURCE_META_DATA__META_DATA_VALUE:
				return META_DATA_VALUE_EDEFAULT == null ? metaDataValue != null : !META_DATA_VALUE_EDEFAULT.equals(metaDataValue);
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
		result.append(" (dataResourceId: ");
		result.append(dataResourceId);
		result.append(", metaDataPredicateId: ");
		result.append(metaDataPredicateId);
		result.append(", dataSourceId: ");
		result.append(dataSourceId);
		result.append(", metaDataValue: ");
		result.append(metaDataValue);
		result.append(')');
		return result.toString();
	}

} //DataResourceMetaDataImpl
