/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.content;

import org.abchip.mimo.biz.BizEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Assoc Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentAssocType#getContentAssocTypeId <em>Content Assoc Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.ContentAssocType#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentAssocType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface ContentAssocType extends BizEntityType<ContentAssoc> {
	/**
	 * Returns the value of the '<em><b>Content Assoc Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Assoc Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Assoc Type Id</em>' attribute.
	 * @see #setContentAssocTypeId(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentAssocType_ContentAssocTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getContentAssocTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentAssocType#getContentAssocTypeId <em>Content Assoc Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Assoc Type Id</em>' attribute.
	 * @see #getContentAssocTypeId()
	 * @generated
	 */
	void setContentAssocTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContentAssocType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.ContentAssocType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // ContentAssocType