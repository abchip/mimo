/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data.impl;

import org.abchip.mimo.biz.content.data.DataPackage;
import org.abchip.mimo.biz.content.data.DataResource;
import org.abchip.mimo.biz.content.data.ImageDataResource;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Data Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.ImageDataResourceImpl#getImageData <em>Image Data</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.ImageDataResourceImpl#getDataResourceId <em>Data Resource Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageDataResourceImpl extends BizEntityImpl implements ImageDataResource {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getImageData() <em>Image Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] IMAGE_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageData() <em>Image Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageData()
	 * @generated
	 * @ordered
	 */
	protected byte[] imageData = IMAGE_DATA_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageDataResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.IMAGE_DATA_RESOURCE;
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
	public byte[] getImageData() {
		return imageData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageData(byte[] newImageData) {
		imageData = newImageData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.IMAGE_DATA_RESOURCE__IMAGE_DATA:
				return getImageData();
			case DataPackage.IMAGE_DATA_RESOURCE__DATA_RESOURCE_ID:
				if (resolve) return getDataResourceId();
				return basicGetDataResourceId();
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
			case DataPackage.IMAGE_DATA_RESOURCE__IMAGE_DATA:
				setImageData((byte[])newValue);
				return;
			case DataPackage.IMAGE_DATA_RESOURCE__DATA_RESOURCE_ID:
				setDataResourceId((DataResource)newValue);
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
			case DataPackage.IMAGE_DATA_RESOURCE__IMAGE_DATA:
				setImageData(IMAGE_DATA_EDEFAULT);
				return;
			case DataPackage.IMAGE_DATA_RESOURCE__DATA_RESOURCE_ID:
				setDataResourceId((DataResource)null);
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
			case DataPackage.IMAGE_DATA_RESOURCE__IMAGE_DATA:
				return IMAGE_DATA_EDEFAULT == null ? imageData != null : !IMAGE_DATA_EDEFAULT.equals(imageData);
			case DataPackage.IMAGE_DATA_RESOURCE__DATA_RESOURCE_ID:
				return dataResourceId != null;
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
		result.append(" (imageData: ");
		result.append(imageData);
		result.append(')');
		return result.toString();
	}

} //ImageDataResourceImpl
