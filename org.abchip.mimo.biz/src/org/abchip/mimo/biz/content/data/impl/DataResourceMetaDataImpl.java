/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data.impl;

import org.abchip.mimo.biz.common.datasource.DataSource;
import org.abchip.mimo.biz.content.data.DataPackage;
import org.abchip.mimo.biz.content.data.DataResourceMetaData;
import org.abchip.mimo.biz.content.data.MetaDataPredicate;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceMetaDataImpl#getMetaDataValue <em>Meta Data Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceMetaDataImpl#getMetaDataPredicateId <em>Meta Data Predicate Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceMetaDataImpl#getDataSourceId <em>Data Source Id</em>}</li>
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
	 * The cached value of the '{@link #getMetaDataPredicateId() <em>Meta Data Predicate Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaDataPredicateId()
	 * @generated
	 * @ordered
	 */
	protected MetaDataPredicate metaDataPredicateId;

	/**
	 * The cached value of the '{@link #getDataSourceId() <em>Data Source Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceId()
	 * @generated
	 * @ordered
	 */
	protected DataSource dataSourceId;

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
	public DataSource getDataSourceId() {
		if (dataSourceId != null && ((EObject)dataSourceId).eIsProxy()) {
			InternalEObject oldDataSourceId = (InternalEObject)dataSourceId;
			dataSourceId = (DataSource)eResolveProxy(oldDataSourceId);
			if (dataSourceId != oldDataSourceId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.DATA_RESOURCE_META_DATA__DATA_SOURCE_ID, oldDataSourceId, dataSourceId));
			}
		}
		return dataSourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource basicGetDataSourceId() {
		return dataSourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataSourceId(DataSource newDataSourceId) {
		DataSource oldDataSourceId = dataSourceId;
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
	public MetaDataPredicate getMetaDataPredicateId() {
		if (metaDataPredicateId != null && ((EObject)metaDataPredicateId).eIsProxy()) {
			InternalEObject oldMetaDataPredicateId = (InternalEObject)metaDataPredicateId;
			metaDataPredicateId = (MetaDataPredicate)eResolveProxy(oldMetaDataPredicateId);
			if (metaDataPredicateId != oldMetaDataPredicateId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.DATA_RESOURCE_META_DATA__META_DATA_PREDICATE_ID, oldMetaDataPredicateId, metaDataPredicateId));
			}
		}
		return metaDataPredicateId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaDataPredicate basicGetMetaDataPredicateId() {
		return metaDataPredicateId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetaDataPredicateId(MetaDataPredicate newMetaDataPredicateId) {
		MetaDataPredicate oldMetaDataPredicateId = metaDataPredicateId;
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
			case DataPackage.DATA_RESOURCE_META_DATA__META_DATA_VALUE:
				return getMetaDataValue();
			case DataPackage.DATA_RESOURCE_META_DATA__META_DATA_PREDICATE_ID:
				if (resolve) return getMetaDataPredicateId();
				return basicGetMetaDataPredicateId();
			case DataPackage.DATA_RESOURCE_META_DATA__DATA_SOURCE_ID:
				if (resolve) return getDataSourceId();
				return basicGetDataSourceId();
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
			case DataPackage.DATA_RESOURCE_META_DATA__META_DATA_VALUE:
				setMetaDataValue((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE_META_DATA__META_DATA_PREDICATE_ID:
				setMetaDataPredicateId((MetaDataPredicate)newValue);
				return;
			case DataPackage.DATA_RESOURCE_META_DATA__DATA_SOURCE_ID:
				setDataSourceId((DataSource)newValue);
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
			case DataPackage.DATA_RESOURCE_META_DATA__META_DATA_VALUE:
				setMetaDataValue(META_DATA_VALUE_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE_META_DATA__META_DATA_PREDICATE_ID:
				setMetaDataPredicateId((MetaDataPredicate)null);
				return;
			case DataPackage.DATA_RESOURCE_META_DATA__DATA_SOURCE_ID:
				setDataSourceId((DataSource)null);
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
			case DataPackage.DATA_RESOURCE_META_DATA__META_DATA_VALUE:
				return META_DATA_VALUE_EDEFAULT == null ? metaDataValue != null : !META_DATA_VALUE_EDEFAULT.equals(metaDataValue);
			case DataPackage.DATA_RESOURCE_META_DATA__META_DATA_PREDICATE_ID:
				return metaDataPredicateId != null;
			case DataPackage.DATA_RESOURCE_META_DATA__DATA_SOURCE_ID:
				return dataSourceId != null;
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
		result.append(", metaDataValue: ");
		result.append(metaDataValue);
		result.append(')');
		return result.toString();
	}

} //DataResourceMetaDataImpl