/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data.impl;

import org.abchip.mimo.biz.content.data.AudioDataResource;
import org.abchip.mimo.biz.content.data.DataPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audio Data Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.AudioDataResourceImpl#getDataResourceId <em>Data Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.AudioDataResourceImpl#getAudioData <em>Audio Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AudioDataResourceImpl extends BizEntityImpl implements AudioDataResource {
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
	 * The default value of the '{@link #getAudioData() <em>Audio Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] AUDIO_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAudioData() <em>Audio Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioData()
	 * @generated
	 * @ordered
	 */
	protected byte[] audioData = AUDIO_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AudioDataResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.AUDIO_DATA_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getAudioData() {
		return audioData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAudioData(byte[] newAudioData) {
		byte[] oldAudioData = audioData;
		audioData = newAudioData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.AUDIO_DATA_RESOURCE__AUDIO_DATA, oldAudioData, audioData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.AUDIO_DATA_RESOURCE__DATA_RESOURCE_ID, oldDataResourceId, dataResourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.AUDIO_DATA_RESOURCE__DATA_RESOURCE_ID:
				return getDataResourceId();
			case DataPackage.AUDIO_DATA_RESOURCE__AUDIO_DATA:
				return getAudioData();
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
			case DataPackage.AUDIO_DATA_RESOURCE__DATA_RESOURCE_ID:
				setDataResourceId((String)newValue);
				return;
			case DataPackage.AUDIO_DATA_RESOURCE__AUDIO_DATA:
				setAudioData((byte[])newValue);
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
			case DataPackage.AUDIO_DATA_RESOURCE__DATA_RESOURCE_ID:
				setDataResourceId(DATA_RESOURCE_ID_EDEFAULT);
				return;
			case DataPackage.AUDIO_DATA_RESOURCE__AUDIO_DATA:
				setAudioData(AUDIO_DATA_EDEFAULT);
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
			case DataPackage.AUDIO_DATA_RESOURCE__DATA_RESOURCE_ID:
				return DATA_RESOURCE_ID_EDEFAULT == null ? dataResourceId != null : !DATA_RESOURCE_ID_EDEFAULT.equals(dataResourceId);
			case DataPackage.AUDIO_DATA_RESOURCE__AUDIO_DATA:
				return AUDIO_DATA_EDEFAULT == null ? audioData != null : !AUDIO_DATA_EDEFAULT.equals(audioData);
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
		result.append(", audioData: ");
		result.append(audioData);
		result.append(')');
		return result.toString();
	}

} //AudioDataResourceImpl
