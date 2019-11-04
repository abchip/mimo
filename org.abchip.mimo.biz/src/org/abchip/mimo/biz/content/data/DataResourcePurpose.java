/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.content.content.ContentPurposeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Resource Purpose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResourcePurpose#getDataResourceId <em>Data Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResourcePurpose#getContentPurposeTypeId <em>Content Purpose Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResourcePurpose()
 * @model
 * @generated
 */
public interface DataResourcePurpose extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Content Purpose Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Purpose Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Purpose Type Id</em>' reference.
	 * @see #setContentPurposeTypeId(ContentPurposeType)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResourcePurpose_ContentPurposeTypeId()
	 * @model keys="contentPurposeTypeId"
	 * @generated
	 */
	ContentPurposeType getContentPurposeTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResourcePurpose#getContentPurposeTypeId <em>Content Purpose Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Purpose Type Id</em>' reference.
	 * @see #getContentPurposeTypeId()
	 * @generated
	 */
	void setContentPurposeTypeId(ContentPurposeType value);

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
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResourcePurpose_DataResourceId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getDataResourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResourcePurpose#getDataResourceId <em>Data Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Resource Id</em>' attribute.
	 * @see #getDataResourceId()
	 * @generated
	 */
	void setDataResourceId(String value);

} // DataResourcePurpose