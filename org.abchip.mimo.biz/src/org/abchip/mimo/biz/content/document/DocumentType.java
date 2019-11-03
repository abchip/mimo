/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.document;

import java.util.List;

import org.abchip.mimo.biz.BizEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.document.DocumentType#getDocumentTypeId <em>Document Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.DocumentType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.DocumentType#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.DocumentType#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.DocumentType#getDocumentTypeAttrs <em>Document Type Attrs</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.document.DocumentPackage#getDocumentType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface DocumentType extends BizEntityType<Document> {
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
	 * @see org.abchip.mimo.biz.content.document.DocumentPackage#getDocumentType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.document.DocumentType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(boolean)
	 * @see org.abchip.mimo.biz.content.document.DocumentPackage#getDocumentType_HasTable()
	 * @model
	 * @generated
	 */
	boolean isHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.document.DocumentType#isHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #isHasTable()
	 * @generated
	 */
	void setHasTable(boolean value);

	/**
	 * Returns the value of the '<em><b>Document Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Type Id</em>' attribute.
	 * @see #setDocumentTypeId(String)
	 * @see org.abchip.mimo.biz.content.document.DocumentPackage#getDocumentType_DocumentTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getDocumentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.document.DocumentType#getDocumentTypeId <em>Document Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Type Id</em>' attribute.
	 * @see #getDocumentTypeId()
	 * @generated
	 */
	void setDocumentTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Parent Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type Id</em>' attribute.
	 * @see #setParentTypeId(String)
	 * @see org.abchip.mimo.biz.content.document.DocumentPackage#getDocumentType_ParentTypeId()
	 * @model annotation="mimo-ent-domain frame='DocumentType'"
	 * @generated
	 */
	String getParentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.document.DocumentType#getParentTypeId <em>Parent Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Id</em>' attribute.
	 * @see #getParentTypeId()
	 * @generated
	 */
	void setParentTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Document Type Attrs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Type Attrs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Type Attrs</em>' attribute list.
	 * @see org.abchip.mimo.biz.content.document.DocumentPackage#getDocumentType_DocumentTypeAttrs()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='DocumentTypeAttr'"
	 * @generated
	 */
	List<String> getDocumentTypeAttrs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='DocumentType' route='parentTypeId'"
	 * @generated
	 */
	List<String> childDocumentTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Document' route='documentTypeId'"
	 * @generated
	 */
	List<String> documents();

} // DocumentType
