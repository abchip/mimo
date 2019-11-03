/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.document.impl;

import java.util.Collection;
import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.content.document.Document;
import org.abchip.mimo.biz.content.document.DocumentPackage;
import org.abchip.mimo.biz.content.document.DocumentType;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

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
 *   <li>{@link org.abchip.mimo.biz.content.document.impl.DocumentImpl#getDocumentLocation <em>Document Location</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.impl.DocumentImpl#getDocumentText <em>Document Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.impl.DocumentImpl#getDocumentTypeId <em>Document Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.impl.DocumentImpl#getImageData <em>Image Data</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.document.impl.DocumentImpl#getDocumentAttributes <em>Document Attributes</em>}</li>
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
	 * The default value of the '{@link #getDocumentId() <em>Document Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentId()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentId() <em>Document Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentId()
	 * @generated
	 * @ordered
	 */
	protected String documentId = DOCUMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateCreated() <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateCreated() <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCreated()
	 * @generated
	 * @ordered
	 */
	protected Date dateCreated = DATE_CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentLocation() <em>Document Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentLocation() <em>Document Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentLocation()
	 * @generated
	 * @ordered
	 */
	protected String documentLocation = DOCUMENT_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentText() <em>Document Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentText()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentText() <em>Document Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentText()
	 * @generated
	 * @ordered
	 */
	protected String documentText = DOCUMENT_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentTypeId() <em>Document Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentTypeId() <em>Document Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentTypeId()
	 * @generated
	 * @ordered
	 */
	protected String documentTypeId = DOCUMENT_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageData() <em>Image Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageData()
	 * @generated
	 * @ordered
	 */
	protected static final Object IMAGE_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageData() <em>Image Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageData()
	 * @generated
	 * @ordered
	 */
	protected Object imageData = IMAGE_DATA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocumentAttributes() <em>Document Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> documentAttributes;

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
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentPackage.DOCUMENT__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateCreated(Date newDateCreated) {
		Date oldDateCreated = dateCreated;
		dateCreated = newDateCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentPackage.DOCUMENT__DATE_CREATED, oldDateCreated, dateCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentId() {
		return documentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentId(String newDocumentId) {
		String oldDocumentId = documentId;
		documentId = newDocumentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentPackage.DOCUMENT__DOCUMENT_ID, oldDocumentId, documentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentLocation() {
		return documentLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentLocation(String newDocumentLocation) {
		String oldDocumentLocation = documentLocation;
		documentLocation = newDocumentLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentPackage.DOCUMENT__DOCUMENT_LOCATION, oldDocumentLocation, documentLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentText() {
		return documentText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentText(String newDocumentText) {
		String oldDocumentText = documentText;
		documentText = newDocumentText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentPackage.DOCUMENT__DOCUMENT_TEXT, oldDocumentText, documentText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentTypeId() {
		return documentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentTypeId(String newDocumentTypeId) {
		String oldDocumentTypeId = documentTypeId;
		documentTypeId = newDocumentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentPackage.DOCUMENT__DOCUMENT_TYPE_ID, oldDocumentTypeId, documentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImageData() {
		return imageData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageData(Object newImageData) {
		Object oldImageData = imageData;
		imageData = newImageData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentPackage.DOCUMENT__IMAGE_DATA, oldImageData, imageData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getDocumentAttributes() {
		if (documentAttributes == null) {
			documentAttributes = new EDataTypeUniqueEList<String>(String.class, this, DocumentPackage.DOCUMENT__DOCUMENT_ATTRIBUTES);
		}
		return documentAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocumentPackage.DOCUMENT__DOCUMENT_ID:
				return getDocumentId();
			case DocumentPackage.DOCUMENT__COMMENTS:
				return getComments();
			case DocumentPackage.DOCUMENT__DATE_CREATED:
				return getDateCreated();
			case DocumentPackage.DOCUMENT__DOCUMENT_LOCATION:
				return getDocumentLocation();
			case DocumentPackage.DOCUMENT__DOCUMENT_TEXT:
				return getDocumentText();
			case DocumentPackage.DOCUMENT__DOCUMENT_TYPE_ID:
				return getDocumentTypeId();
			case DocumentPackage.DOCUMENT__IMAGE_DATA:
				return getImageData();
			case DocumentPackage.DOCUMENT__DOCUMENT_ATTRIBUTES:
				return getDocumentAttributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DocumentPackage.DOCUMENT__DOCUMENT_ID:
				setDocumentId((String)newValue);
				return;
			case DocumentPackage.DOCUMENT__COMMENTS:
				setComments((String)newValue);
				return;
			case DocumentPackage.DOCUMENT__DATE_CREATED:
				setDateCreated((Date)newValue);
				return;
			case DocumentPackage.DOCUMENT__DOCUMENT_LOCATION:
				setDocumentLocation((String)newValue);
				return;
			case DocumentPackage.DOCUMENT__DOCUMENT_TEXT:
				setDocumentText((String)newValue);
				return;
			case DocumentPackage.DOCUMENT__DOCUMENT_TYPE_ID:
				setDocumentTypeId((String)newValue);
				return;
			case DocumentPackage.DOCUMENT__IMAGE_DATA:
				setImageData(newValue);
				return;
			case DocumentPackage.DOCUMENT__DOCUMENT_ATTRIBUTES:
				getDocumentAttributes().clear();
				getDocumentAttributes().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DocumentPackage.DOCUMENT__DOCUMENT_ID:
				setDocumentId(DOCUMENT_ID_EDEFAULT);
				return;
			case DocumentPackage.DOCUMENT__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case DocumentPackage.DOCUMENT__DATE_CREATED:
				setDateCreated(DATE_CREATED_EDEFAULT);
				return;
			case DocumentPackage.DOCUMENT__DOCUMENT_LOCATION:
				setDocumentLocation(DOCUMENT_LOCATION_EDEFAULT);
				return;
			case DocumentPackage.DOCUMENT__DOCUMENT_TEXT:
				setDocumentText(DOCUMENT_TEXT_EDEFAULT);
				return;
			case DocumentPackage.DOCUMENT__DOCUMENT_TYPE_ID:
				setDocumentTypeId(DOCUMENT_TYPE_ID_EDEFAULT);
				return;
			case DocumentPackage.DOCUMENT__IMAGE_DATA:
				setImageData(IMAGE_DATA_EDEFAULT);
				return;
			case DocumentPackage.DOCUMENT__DOCUMENT_ATTRIBUTES:
				getDocumentAttributes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DocumentPackage.DOCUMENT__DOCUMENT_ID:
				return DOCUMENT_ID_EDEFAULT == null ? documentId != null : !DOCUMENT_ID_EDEFAULT.equals(documentId);
			case DocumentPackage.DOCUMENT__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case DocumentPackage.DOCUMENT__DATE_CREATED:
				return DATE_CREATED_EDEFAULT == null ? dateCreated != null : !DATE_CREATED_EDEFAULT.equals(dateCreated);
			case DocumentPackage.DOCUMENT__DOCUMENT_LOCATION:
				return DOCUMENT_LOCATION_EDEFAULT == null ? documentLocation != null : !DOCUMENT_LOCATION_EDEFAULT.equals(documentLocation);
			case DocumentPackage.DOCUMENT__DOCUMENT_TEXT:
				return DOCUMENT_TEXT_EDEFAULT == null ? documentText != null : !DOCUMENT_TEXT_EDEFAULT.equals(documentText);
			case DocumentPackage.DOCUMENT__DOCUMENT_TYPE_ID:
				return DOCUMENT_TYPE_ID_EDEFAULT == null ? documentTypeId != null : !DOCUMENT_TYPE_ID_EDEFAULT.equals(documentTypeId);
			case DocumentPackage.DOCUMENT__IMAGE_DATA:
				return IMAGE_DATA_EDEFAULT == null ? imageData != null : !IMAGE_DATA_EDEFAULT.equals(imageData);
			case DocumentPackage.DOCUMENT__DOCUMENT_ATTRIBUTES:
				return documentAttributes != null && !documentAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (documentId: ");
		result.append(documentId);
		result.append(", comments: ");
		result.append(comments);
		result.append(", dateCreated: ");
		result.append(dateCreated);
		result.append(", documentLocation: ");
		result.append(documentLocation);
		result.append(", documentText: ");
		result.append(documentText);
		result.append(", documentTypeId: ");
		result.append(documentTypeId);
		result.append(", imageData: ");
		result.append(imageData);
		result.append(", documentAttributes: ");
		result.append(documentAttributes);
		result.append(')');
		return result.toString();
	}

} //DocumentImpl
