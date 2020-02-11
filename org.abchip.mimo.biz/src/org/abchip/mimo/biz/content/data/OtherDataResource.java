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
 * A representation of the model object '<em><b>Other Data Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.data.OtherDataResource#getDataResourceId <em>Data Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.OtherDataResource#getDataResourceContent <em>Data Resource Content</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.data.DataPackage#getOtherDataResource()
 * @model annotation="mimo-ent-frame title='Other Data Object'"
 * @generated
 */
public interface OtherDataResource extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Data Resource Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Resource Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource Content</em>' attribute.
	 * @see #setDataResourceContent(byte[])
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getOtherDataResource_DataResourceContent()
	 * @model
	 * @generated
	 */
	byte[] getDataResourceContent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.OtherDataResource#getDataResourceContent <em>Data Resource Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Resource Content</em>' attribute.
	 * @see #getDataResourceContent()
	 * @generated
	 */
	void setDataResourceContent(byte[] value);

	/**
	 * Returns the value of the '<em><b>Data Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Resource Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource Id</em>' attribute.
	 * @see #setDataResourceId(String)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getOtherDataResource_DataResourceId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getDataResourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.OtherDataResource#getDataResourceId <em>Data Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Resource Id</em>' attribute.
	 * @see #getDataResourceId()
	 * @generated
	 */
	void setDataResourceId(String value);

} // OtherDataResource
