/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.data.FileExtension#getFileExtensionId <em>File Extension Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.FileExtension#getMimeTypeId <em>Mime Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.data.DataPackage#getFileExtension()
 * @model
 * @generated
 */
public interface FileExtension extends BizEntity {
	/**
	 * Returns the value of the '<em><b>File Extension Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Extension Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Extension Id</em>' attribute.
	 * @see #setFileExtensionId(String)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getFileExtension_FileExtensionId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getFileExtensionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.FileExtension#getFileExtensionId <em>File Extension Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Extension Id</em>' attribute.
	 * @see #getFileExtensionId()
	 * @generated
	 */
	void setFileExtensionId(String value);

	/**
	 * Returns the value of the '<em><b>Mime Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type Id</em>' reference.
	 * @see #setMimeTypeId(MimeType)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getFileExtension_MimeTypeId()
	 * @model keys="mimeTypeId"
	 * @generated
	 */
	MimeType getMimeTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.FileExtension#getMimeTypeId <em>Mime Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type Id</em>' reference.
	 * @see #getMimeTypeId()
	 * @generated
	 */
	void setMimeTypeId(MimeType value);

} // FileExtension
