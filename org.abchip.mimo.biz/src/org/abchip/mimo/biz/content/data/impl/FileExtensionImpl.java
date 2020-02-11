/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data.impl;

import org.abchip.mimo.biz.content.data.DataPackage;
import org.abchip.mimo.biz.content.data.FileExtension;
import org.abchip.mimo.biz.content.data.MimeType;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

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
		return (String)eGet(DataPackage.Literals.FILE_EXTENSION__FILE_EXTENSION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileExtensionId(String newFileExtensionId) {
		eSet(DataPackage.Literals.FILE_EXTENSION__FILE_EXTENSION_ID, newFileExtensionId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MimeType getMimeTypeId() {
		return (MimeType)eGet(DataPackage.Literals.FILE_EXTENSION__MIME_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMimeTypeId(MimeType newMimeTypeId) {
		eSet(DataPackage.Literals.FILE_EXTENSION__MIME_TYPE_ID, newMimeTypeId);
	}

} //FileExtensionImpl
