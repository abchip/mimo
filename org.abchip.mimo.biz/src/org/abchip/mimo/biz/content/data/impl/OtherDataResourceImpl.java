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
import org.abchip.mimo.biz.content.data.OtherDataResource;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Other Data ResourceDriver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.OtherDataResourceImpl#getDataResourceContent <em>Data ResourceDriver Content</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.OtherDataResourceImpl#getDataResourceId <em>Data ResourceDriver Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OtherDataResourceImpl extends BizEntityImpl implements OtherDataResource {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getDataResourceContent() <em>Data ResourceDriver Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceContent()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] DATA_RESOURCE_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataResourceContent() <em>Data ResourceDriver Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceContent()
	 * @generated
	 * @ordered
	 */
	protected byte[] dataResourceContent = DATA_RESOURCE_CONTENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataResourceId() <em>Data ResourceDriver Id</em>}' reference.
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
	protected OtherDataResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.OTHER_DATA_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getDataResourceContent() {
		return dataResourceContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataResourceContent(byte[] newDataResourceContent) {
		dataResourceContent = newDataResourceContent;
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
			case DataPackage.OTHER_DATA_RESOURCE__DATA_RESOURCE_CONTENT:
				return getDataResourceContent();
			case DataPackage.OTHER_DATA_RESOURCE__DATA_RESOURCE_ID:
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
			case DataPackage.OTHER_DATA_RESOURCE__DATA_RESOURCE_CONTENT:
				setDataResourceContent((byte[])newValue);
				return;
			case DataPackage.OTHER_DATA_RESOURCE__DATA_RESOURCE_ID:
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
			case DataPackage.OTHER_DATA_RESOURCE__DATA_RESOURCE_CONTENT:
				setDataResourceContent(DATA_RESOURCE_CONTENT_EDEFAULT);
				return;
			case DataPackage.OTHER_DATA_RESOURCE__DATA_RESOURCE_ID:
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
			case DataPackage.OTHER_DATA_RESOURCE__DATA_RESOURCE_CONTENT:
				return DATA_RESOURCE_CONTENT_EDEFAULT == null ? dataResourceContent != null : !DATA_RESOURCE_CONTENT_EDEFAULT.equals(dataResourceContent);
			case DataPackage.OTHER_DATA_RESOURCE__DATA_RESOURCE_ID:
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
		result.append(" (dataResourceContent: ");
		result.append(dataResourceContent);
		result.append(')');
		return result.toString();
	}

} //OtherDataResourceImpl
