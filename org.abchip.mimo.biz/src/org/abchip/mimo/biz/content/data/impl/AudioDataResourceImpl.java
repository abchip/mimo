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
import org.abchip.mimo.biz.content.data.DataResource;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audio Data Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.AudioDataResourceImpl#getAudioData <em>Audio Data</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.AudioDataResourceImpl#getDataResourceId <em>Data Resource Id</em>}</li>
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
		audioData = newAudioData;
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
			case DataPackage.AUDIO_DATA_RESOURCE__AUDIO_DATA:
				return getAudioData();
			case DataPackage.AUDIO_DATA_RESOURCE__DATA_RESOURCE_ID:
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
			case DataPackage.AUDIO_DATA_RESOURCE__AUDIO_DATA:
				setAudioData((byte[])newValue);
				return;
			case DataPackage.AUDIO_DATA_RESOURCE__DATA_RESOURCE_ID:
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
			case DataPackage.AUDIO_DATA_RESOURCE__AUDIO_DATA:
				setAudioData(AUDIO_DATA_EDEFAULT);
				return;
			case DataPackage.AUDIO_DATA_RESOURCE__DATA_RESOURCE_ID:
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
			case DataPackage.AUDIO_DATA_RESOURCE__AUDIO_DATA:
				return AUDIO_DATA_EDEFAULT == null ? audioData != null : !AUDIO_DATA_EDEFAULT.equals(audioData);
			case DataPackage.AUDIO_DATA_RESOURCE__DATA_RESOURCE_ID:
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
		result.append(" (audioData: ");
		result.append(audioData);
		result.append(')');
		return result.toString();
	}

} //AudioDataResourceImpl
