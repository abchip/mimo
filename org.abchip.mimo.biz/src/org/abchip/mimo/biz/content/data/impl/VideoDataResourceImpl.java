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
import org.abchip.mimo.biz.content.data.VideoDataResource;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video Data Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.VideoDataResourceImpl#getVideoData <em>Video Data</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.VideoDataResourceImpl#getDataResourceId <em>Data Resource Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VideoDataResourceImpl extends BizEntityImpl implements VideoDataResource {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getVideoData() <em>Video Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] VIDEO_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVideoData() <em>Video Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoData()
	 * @generated
	 * @ordered
	 */
	protected byte[] videoData = VIDEO_DATA_EDEFAULT;

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
	protected VideoDataResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.VIDEO_DATA_RESOURCE;
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.VIDEO_DATA_RESOURCE__DATA_RESOURCE_ID, oldDataResourceId, dataResourceId));
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
		DataResource oldDataResourceId = dataResourceId;
		dataResourceId = newDataResourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.VIDEO_DATA_RESOURCE__DATA_RESOURCE_ID, oldDataResourceId, dataResourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getVideoData() {
		return videoData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVideoData(byte[] newVideoData) {
		byte[] oldVideoData = videoData;
		videoData = newVideoData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.VIDEO_DATA_RESOURCE__VIDEO_DATA, oldVideoData, videoData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.VIDEO_DATA_RESOURCE__VIDEO_DATA:
				return getVideoData();
			case DataPackage.VIDEO_DATA_RESOURCE__DATA_RESOURCE_ID:
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
			case DataPackage.VIDEO_DATA_RESOURCE__VIDEO_DATA:
				setVideoData((byte[])newValue);
				return;
			case DataPackage.VIDEO_DATA_RESOURCE__DATA_RESOURCE_ID:
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
			case DataPackage.VIDEO_DATA_RESOURCE__VIDEO_DATA:
				setVideoData(VIDEO_DATA_EDEFAULT);
				return;
			case DataPackage.VIDEO_DATA_RESOURCE__DATA_RESOURCE_ID:
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
			case DataPackage.VIDEO_DATA_RESOURCE__VIDEO_DATA:
				return VIDEO_DATA_EDEFAULT == null ? videoData != null : !VIDEO_DATA_EDEFAULT.equals(videoData);
			case DataPackage.VIDEO_DATA_RESOURCE__DATA_RESOURCE_ID:
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
		result.append(" (videoData: ");
		result.append(videoData);
		result.append(')');
		return result.toString();
	}

} //VideoDataResourceImpl
