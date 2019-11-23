/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mime Type Html Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.data.MimeTypeHtmlTemplate#getMimeTypeId <em>Mime Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.MimeTypeHtmlTemplate#getTemplateLocation <em>Template Location</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.data.DataPackage#getMimeTypeHtmlTemplate()
 * @model annotation="mimo-ent-frame title='Mime Text Template' dictionary='ContentEntityLabels'"
 * @generated
 */
public interface MimeTypeHtmlTemplate extends BizEntity {
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
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getMimeTypeHtmlTemplate_MimeTypeId()
	 * @model keys="mimeTypeId" required="true"
	 *        annotation="mimo-ent-format type='id-vlong' length='255'"
	 * @generated
	 */
	MimeType getMimeTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.MimeTypeHtmlTemplate#getMimeTypeId <em>Mime Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type Id</em>' reference.
	 * @see #getMimeTypeId()
	 * @generated
	 */
	void setMimeTypeId(MimeType value);

	/**
	 * Returns the value of the '<em><b>Template Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Location</em>' attribute.
	 * @see #setTemplateLocation(String)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getMimeTypeHtmlTemplate_TemplateLocation()
	 * @model annotation="mimo-ent-format type='long-varchar' length='255'"
	 * @generated
	 */
	String getTemplateLocation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.MimeTypeHtmlTemplate#getTemplateLocation <em>Template Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Location</em>' attribute.
	 * @see #getTemplateLocation()
	 * @generated
	 */
	void setTemplateLocation(String value);

} // MimeTypeHtmlTemplate
