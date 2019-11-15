/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data.impl;

import org.abchip.mimo.biz.content.content.ContentPurposeType;
import org.abchip.mimo.biz.content.data.DataPackage;
import org.abchip.mimo.biz.content.data.DataResource;
import org.abchip.mimo.biz.content.data.DataResourcePurpose;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

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
	 * The cached value of the '{@link #getDataResourceId() <em>Data Resource Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceId()
	 * @generated
	 * @ordered
	 */
	protected DataResource dataResourceId;

	/**
	 * The cached value of the '{@link #getContentPurposeTypeId() <em>Content Purpose Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentPurposeTypeId()
	 * @generated
	 * @ordered
	 */
	protected ContentPurposeType contentPurposeTypeId;

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
	public ContentPurposeType getContentPurposeTypeId() {
		if (contentPurposeTypeId != null && ((EObject)contentPurposeTypeId).eIsProxy()) {
			InternalEObject oldContentPurposeTypeId = (InternalEObject)contentPurposeTypeId;
			contentPurposeTypeId = (ContentPurposeType)eResolveProxy(oldContentPurposeTypeId);
			if (contentPurposeTypeId != oldContentPurposeTypeId) {
			}
		}
		return contentPurposeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentPurposeType basicGetContentPurposeTypeId() {
		return contentPurposeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentPurposeTypeId(ContentPurposeType newContentPurposeTypeId) {
		contentPurposeTypeId = newContentPurposeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataResource getDataResourceId() {
		if (dataResourceId != null && ((EObject)dataResourceId).eIsProxy()) {
			InternalEObject oldDataResourceId = (InternalEObject)dataResourceId;
			dataResourceId = (DataResource)eResolveProxy(oldDataResourceId);
			if (dataResourceId != oldDataResourceId) {
			}
		}
		return dataResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataResource basicGetDataResourceId() {
		return dataResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataResourceId(DataResource newDataResourceId) {
		dataResourceId = newDataResourceId;
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
				if (resolve) return getDataResourceId();
				return basicGetDataResourceId();
			case DataPackage.DATA_RESOURCE_PURPOSE__CONTENT_PURPOSE_TYPE_ID:
				if (resolve) return getContentPurposeTypeId();
				return basicGetContentPurposeTypeId();
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
				setDataResourceId((DataResource)newValue);
				return;
			case DataPackage.DATA_RESOURCE_PURPOSE__CONTENT_PURPOSE_TYPE_ID:
				setContentPurposeTypeId((ContentPurposeType)newValue);
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
				setDataResourceId((DataResource)null);
				return;
			case DataPackage.DATA_RESOURCE_PURPOSE__CONTENT_PURPOSE_TYPE_ID:
				setContentPurposeTypeId((ContentPurposeType)null);
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
				return dataResourceId != null;
			case DataPackage.DATA_RESOURCE_PURPOSE__CONTENT_PURPOSE_TYPE_ID:
				return contentPurposeTypeId != null;
		}
		return super.eIsSet(featureID);
	}

} //DataResourcePurposeImpl
