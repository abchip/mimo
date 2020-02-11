/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.document.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.content.document.Document;
import org.abchip.mimo.biz.content.document.DocumentAttribute;
import org.abchip.mimo.biz.content.document.DocumentPackage;
import org.abchip.mimo.biz.content.document.DocumentType;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.document.impl.DocumentImpl#getDocumentId <em>Document Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.impl.DocumentImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.impl.DocumentImpl#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.impl.DocumentImpl#getDocumentAttributes <em>Document Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.impl.DocumentImpl#getDocumentLocation <em>Document Location</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.impl.DocumentImpl#getDocumentText <em>Document Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.impl.DocumentImpl#getDocumentTypeId <em>Document Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.impl.DocumentImpl#getImageData <em>Image Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentImpl extends BizEntityTypedImpl<DocumentType> implements Document {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocumentPackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return (String)eGet(DocumentPackage.Literals.DOCUMENT__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(DocumentPackage.Literals.DOCUMENT__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateCreated() {
		return (Date)eGet(DocumentPackage.Literals.DOCUMENT__DATE_CREATED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateCreated(Date newDateCreated) {
		eSet(DocumentPackage.Literals.DOCUMENT__DATE_CREATED, newDateCreated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<DocumentAttribute> getDocumentAttributes() {
		return (List<DocumentAttribute>)eGet(DocumentPackage.Literals.DOCUMENT__DOCUMENT_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentId() {
		return (String)eGet(DocumentPackage.Literals.DOCUMENT__DOCUMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentId(String newDocumentId) {
		eSet(DocumentPackage.Literals.DOCUMENT__DOCUMENT_ID, newDocumentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentLocation() {
		return (String)eGet(DocumentPackage.Literals.DOCUMENT__DOCUMENT_LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentLocation(String newDocumentLocation) {
		eSet(DocumentPackage.Literals.DOCUMENT__DOCUMENT_LOCATION, newDocumentLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentText() {
		return (String)eGet(DocumentPackage.Literals.DOCUMENT__DOCUMENT_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentText(String newDocumentText) {
		eSet(DocumentPackage.Literals.DOCUMENT__DOCUMENT_TEXT, newDocumentText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentType getDocumentTypeId() {
		return (DocumentType)eGet(DocumentPackage.Literals.DOCUMENT__DOCUMENT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentTypeId(DocumentType newDocumentTypeId) {
		eSet(DocumentPackage.Literals.DOCUMENT__DOCUMENT_TYPE_ID, newDocumentTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImageData() {
		return (Object)eGet(DocumentPackage.Literals.DOCUMENT__IMAGE_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageData(Object newImageData) {
		eSet(DocumentPackage.Literals.DOCUMENT__IMAGE_DATA, newImageData);
	}

} //DocumentImpl
