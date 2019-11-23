/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.document;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.document.Document#getDocumentId <em>Document Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.Document#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.Document#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.Document#getDocumentAttributes <em>Document Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.Document#getDocumentLocation <em>Document Location</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.Document#getDocumentText <em>Document Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.Document#getDocumentTypeId <em>Document Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.Document#getImageData <em>Image Data</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.document.DocumentPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends BizEntityTyped<DocumentType> {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.content.document.DocumentPackage#getDocument_Comments()
	 * @model annotation="mimo-ent-format type='comment' length='255'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.document.Document#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Created</em>' attribute.
	 * @see #setDateCreated(Date)
	 * @see org.abchip.mimo.biz.content.document.DocumentPackage#getDocument_DateCreated()
	 * @model annotation="mimo-ent-format type='date-time'"
	 * @generated
	 */
	Date getDateCreated();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.document.Document#getDateCreated <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Created</em>' attribute.
	 * @see #getDateCreated()
	 * @generated
	 */
	void setDateCreated(Date value);

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
	 * @see org.abchip.mimo.biz.content.document.DocumentPackage#getDocument_DocumentId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 * @generated
	 */
	String getDocumentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.document.Document#getDocumentId <em>Document Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Id</em>' attribute.
	 * @see #getDocumentId()
	 * @generated
	 */
	void setDocumentId(String value);

	/**
	 * Returns the value of the '<em><b>Document Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Location</em>' attribute.
	 * @see #setDocumentLocation(String)
	 * @see org.abchip.mimo.biz.content.document.DocumentPackage#getDocument_DocumentLocation()
	 * @model annotation="mimo-ent-format type='long-varchar' length='255'"
	 * @generated
	 */
	String getDocumentLocation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.document.Document#getDocumentLocation <em>Document Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Location</em>' attribute.
	 * @see #getDocumentLocation()
	 * @generated
	 */
	void setDocumentLocation(String value);

	/**
	 * Returns the value of the '<em><b>Document Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Text</em>' attribute.
	 * @see #setDocumentText(String)
	 * @see org.abchip.mimo.biz.content.document.DocumentPackage#getDocument_DocumentText()
	 * @model annotation="mimo-ent-format type='long-varchar' length='255'"
	 * @generated
	 */
	String getDocumentText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.document.Document#getDocumentText <em>Document Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Text</em>' attribute.
	 * @see #getDocumentText()
	 * @generated
	 */
	void setDocumentText(String value);

	/**
	 * Returns the value of the '<em><b>Document Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Type Id</em>' reference.
	 * @see #setDocumentTypeId(DocumentType)
	 * @see org.abchip.mimo.biz.content.document.DocumentPackage#getDocument_DocumentTypeId()
	 * @model keys="documentTypeId"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 * @generated
	 */
	DocumentType getDocumentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.document.Document#getDocumentTypeId <em>Document Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Type Id</em>' reference.
	 * @see #getDocumentTypeId()
	 * @generated
	 */
	void setDocumentTypeId(DocumentType value);

	/**
	 * Returns the value of the '<em><b>Image Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Data</em>' attribute.
	 * @see #setImageData(Object)
	 * @see org.abchip.mimo.biz.content.document.DocumentPackage#getDocument_ImageData()
	 * @model annotation="mimo-ent-format type='object'"
	 * @generated
	 */
	Object getImageData();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.document.Document#getImageData <em>Image Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Data</em>' attribute.
	 * @see #getImageData()
	 * @generated
	 */
	void setImageData(Object value);

	/**
	 * Returns the value of the '<em><b>Document Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Attributes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Attributes</em>' attribute list.
	 * @see org.abchip.mimo.biz.content.document.DocumentPackage#getDocument_DocumentAttributes()
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='DocumentAttribute'"
	 * @generated
	 */
	List<String> getDocumentAttributes();

} // Document
