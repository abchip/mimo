/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.document.impl;

import org.abchip.mimo.biz.content.document.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentFactoryImpl extends EFactoryImpl implements DocumentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DocumentFactory init() {
		try {
			DocumentFactory theDocumentFactory = (DocumentFactory)EPackage.Registry.INSTANCE.getEFactory(DocumentPackage.eNS_URI);
			if (theDocumentFactory != null) {
				return theDocumentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DocumentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DocumentPackage.DOCUMENT: return (EObject)createDocument();
			case DocumentPackage.DOCUMENT_ATTRIBUTE: return (EObject)createDocumentAttribute();
			case DocumentPackage.DOCUMENT_TYPE: return (EObject)createDocumentType();
			case DocumentPackage.DOCUMENT_TYPE_ATTR: return (EObject)createDocumentTypeAttr();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentAttribute createDocumentAttribute() {
		DocumentAttributeImpl documentAttribute = new DocumentAttributeImpl();
		return documentAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentType createDocumentType() {
		DocumentTypeImpl documentType = new DocumentTypeImpl();
		return documentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentTypeAttr createDocumentTypeAttr() {
		DocumentTypeAttrImpl documentTypeAttr = new DocumentTypeAttrImpl();
		return documentTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentPackage getDocumentPackage() {
		return (DocumentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DocumentPackage getPackage() {
		return DocumentPackage.eINSTANCE;
	}

} //DocumentFactoryImpl
