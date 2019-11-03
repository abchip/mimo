/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data.impl;

import org.abchip.mimo.biz.content.data.DataPackage;
import org.abchip.mimo.biz.content.data.DataResourcePurpose;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Resource Purpose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourcePurposeImpl#getDataResourceId <em>Data Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourcePurposeImpl#getContentPurposeTypeId <em>Content Purpose Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataResourcePurposeImpl extends BizEntityImpl implements DataResourcePurpose {
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
	 * The default value of the '{@link #getContentPurposeTypeId() <em>Content Purpose Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentPurposeTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_PURPOSE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentPurposeTypeId() <em>Content Purpose Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentPurposeTypeId()
	 * @generated
	 * @ordered
	 */
	protected String contentPurposeTypeId = CONTENT_PURPOSE_TYPE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataResourcePurposeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.DATA_RESOURCE_PURPOSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentPurposeTypeId() {
		return contentPurposeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentPurposeTypeId(String newContentPurposeTypeId) {
		String oldContentPurposeTypeId = contentPurposeTypeId;
		contentPurposeTypeId = newContentPurposeTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE_PURPOSE__CONTENT_PURPOSE_TYPE_ID, oldContentPurposeTypeId, contentPurposeTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE_PURPOSE__DATA_RESOURCE_ID, oldDataResourceId, dataResourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.DATA_RESOURCE_PURPOSE__DATA_RESOURCE_ID:
				return getDataResourceId();
			case DataPackage.DATA_RESOURCE_PURPOSE__CONTENT_PURPOSE_TYPE_ID:
				return getContentPurposeTypeId();
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
			case DataPackage.DATA_RESOURCE_PURPOSE__DATA_RESOURCE_ID:
				setDataResourceId((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE_PURPOSE__CONTENT_PURPOSE_TYPE_ID:
				setContentPurposeTypeId((String)newValue);
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
			case DataPackage.DATA_RESOURCE_PURPOSE__DATA_RESOURCE_ID:
				setDataResourceId(DATA_RESOURCE_ID_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE_PURPOSE__CONTENT_PURPOSE_TYPE_ID:
				setContentPurposeTypeId(CONTENT_PURPOSE_TYPE_ID_EDEFAULT);
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
			case DataPackage.DATA_RESOURCE_PURPOSE__DATA_RESOURCE_ID:
				return DATA_RESOURCE_ID_EDEFAULT == null ? dataResourceId != null : !DATA_RESOURCE_ID_EDEFAULT.equals(dataResourceId);
			case DataPackage.DATA_RESOURCE_PURPOSE__CONTENT_PURPOSE_TYPE_ID:
				return CONTENT_PURPOSE_TYPE_ID_EDEFAULT == null ? contentPurposeTypeId != null : !CONTENT_PURPOSE_TYPE_ID_EDEFAULT.equals(contentPurposeTypeId);
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
		result.append(", contentPurposeTypeId: ");
		result.append(contentPurposeTypeId);
		result.append(')');
		return result.toString();
	}

} //DataResourcePurposeImpl
