/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.document;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.document.DocumentAttribute#getDocumentId <em>Document Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.DocumentAttribute#getAttrName <em>Attr Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.DocumentAttribute#getAttrDescription <em>Attr Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.DocumentAttribute#getAttrValue <em>Attr Value</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.document.DocumentPackage#getDocumentAttribute()
 * @model
 * @generated
 */
public interface DocumentAttribute extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Description</em>' attribute.
	 * @see #setAttrDescription(String)
	 * @see org.abchip.mimo.biz.content.document.DocumentPackage#getDocumentAttribute_AttrDescription()
	 * @model
	 * @generated
	 */
	String getAttrDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.document.DocumentAttribute#getAttrDescription <em>Attr Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr Description</em>' attribute.
	 * @see #getAttrDescription()
	 * @generated
	 */
	void setAttrDescription(String value);

	/**
	 * Returns the value of the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Name</em>' attribute.
	 * @see #setAttrName(String)
	 * @see org.abchip.mimo.biz.content.document.DocumentPackage#getDocumentAttribute_AttrName()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getAttrName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.document.DocumentAttribute#getAttrName <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr Name</em>' attribute.
	 * @see #getAttrName()
	 * @generated
	 */
	void setAttrName(String value);

	/**
	 * Returns the value of the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Value</em>' attribute.
	 * @see #setAttrValue(String)
	 * @see org.abchip.mimo.biz.content.document.DocumentPackage#getDocumentAttribute_AttrValue()
	 * @model
	 * @generated
	 */
	String getAttrValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.document.DocumentAttribute#getAttrValue <em>Attr Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr Value</em>' attribute.
	 * @see #getAttrValue()
	 * @generated
	 */
	void setAttrValue(String value);

	/**
	 * Returns the value of the '<em><b>Document Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Id</em>' attribute.
	 * @see #setDocumentId(String)
	 * @see org.abchip.mimo.biz.content.document.DocumentPackage#getDocumentAttribute_DocumentId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getDocumentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.document.DocumentAttribute#getDocumentId <em>Document Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Id</em>' attribute.
	 * @see #getDocumentId()
	 * @generated
	 */
	void setDocumentId(String value);

} // DocumentAttribute
