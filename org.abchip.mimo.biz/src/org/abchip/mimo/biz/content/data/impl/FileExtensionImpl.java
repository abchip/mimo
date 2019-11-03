/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data.impl;

import org.abchip.mimo.biz.content.data.DataPackage;
import org.abchip.mimo.biz.content.data.FileExtension;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.FileExtensionImpl#getFileExtensionId <em>File Extension Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.FileExtensionImpl#getMimeTypeId <em>Mime Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileExtensionImpl extends BizEntityImpl implements FileExtension {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getFileExtensionId() <em>File Extension Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileExtensionId()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EXTENSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileExtensionId() <em>File Extension Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileExtensionId()
	 * @generated
	 * @ordered
	 */
	protected String fileExtensionId = FILE_EXTENSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMimeTypeId() <em>Mime Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimeTypeId() <em>Mime Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeTypeId()
	 * @generated
	 * @ordered
	 */
	protected String mimeTypeId = MIME_TYPE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.FILE_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileExtensionId() {
		return fileExtensionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileExtensionId(String newFileExtensionId) {
		String oldFileExtensionId = fileExtensionId;
		fileExtensionId = newFileExtensionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.FILE_EXTENSION__FILE_EXTENSION_ID, oldFileExtensionId, fileExtensionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMimeTypeId() {
		return mimeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMimeTypeId(String newMimeTypeId) {
		String oldMimeTypeId = mimeTypeId;
		mimeTypeId = newMimeTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.FILE_EXTENSION__MIME_TYPE_ID, oldMimeTypeId, mimeTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.FILE_EXTENSION__FILE_EXTENSION_ID:
				return getFileExtensionId();
			case DataPackage.FILE_EXTENSION__MIME_TYPE_ID:
				return getMimeTypeId();
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
			case DataPackage.FILE_EXTENSION__FILE_EXTENSION_ID:
				setFileExtensionId((String)newValue);
				return;
			case DataPackage.FILE_EXTENSION__MIME_TYPE_ID:
				setMimeTypeId((String)newValue);
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
			case DataPackage.FILE_EXTENSION__FILE_EXTENSION_ID:
				setFileExtensionId(FILE_EXTENSION_ID_EDEFAULT);
				return;
			case DataPackage.FILE_EXTENSION__MIME_TYPE_ID:
				setMimeTypeId(MIME_TYPE_ID_EDEFAULT);
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
			case DataPackage.FILE_EXTENSION__FILE_EXTENSION_ID:
				return FILE_EXTENSION_ID_EDEFAULT == null ? fileExtensionId != null : !FILE_EXTENSION_ID_EDEFAULT.equals(fileExtensionId);
			case DataPackage.FILE_EXTENSION__MIME_TYPE_ID:
				return MIME_TYPE_ID_EDEFAULT == null ? mimeTypeId != null : !MIME_TYPE_ID_EDEFAULT.equals(mimeTypeId);
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
		result.append(" (fileExtensionId: ");
		result.append(fileExtensionId);
		result.append(", mimeTypeId: ");
		result.append(mimeTypeId);
		result.append(')');
		return result.toString();
	}

} //FileExtensionImpl
