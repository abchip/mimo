/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.content.impl;

import org.abchip.mimo.biz.content.content.*;
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
public class ContentFactoryImpl extends EFactoryImpl implements ContentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContentFactory init() {
		try {
			ContentFactory theContentFactory = (ContentFactory)EPackage.Registry.INSTANCE.getEFactory(ContentPackage.eNS_URI);
			if (theContentFactory != null) {
				return theContentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFactoryImpl() {
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
			case ContentPackage.CONTENT: return (EObject)createContent();
			case ContentPackage.CONTENT_APPROVAL: return (EObject)createContentApproval();
			case ContentPackage.CONTENT_ASSOC: return (EObject)createContentAssoc();
			case ContentPackage.CONTENT_ASSOC_PREDICATE: return (EObject)createContentAssocPredicate();
			case ContentPackage.CONTENT_ASSOC_TYPE: return (EObject)createContentAssocType();
			case ContentPackage.CONTENT_ATTRIBUTE: return (EObject)createContentAttribute();
			case ContentPackage.CONTENT_KEYWORD: return (EObject)createContentKeyword();
			case ContentPackage.CONTENT_META_DATA: return (EObject)createContentMetaData();
			case ContentPackage.CONTENT_OPERATION: return (EObject)createContentOperation();
			case ContentPackage.CONTENT_PURPOSE: return (EObject)createContentPurpose();
			case ContentPackage.CONTENT_PURPOSE_OPERATION: return (EObject)createContentPurposeOperation();
			case ContentPackage.CONTENT_PURPOSE_TYPE: return (EObject)createContentPurposeType();
			case ContentPackage.CONTENT_REVISION: return (EObject)createContentRevision();
			case ContentPackage.CONTENT_REVISION_ITEM: return (EObject)createContentRevisionItem();
			case ContentPackage.CONTENT_ROLE: return (EObject)createContentRole();
			case ContentPackage.CONTENT_SEARCH_CONSTRAINT: return (EObject)createContentSearchConstraint();
			case ContentPackage.CONTENT_SEARCH_RESULT: return (EObject)createContentSearchResult();
			case ContentPackage.CONTENT_TYPE: return (EObject)createContentType();
			case ContentPackage.CONTENT_TYPE_ATTR: return (EObject)createContentTypeAttr();
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
	public Content createContent() {
		ContentImpl content = new ContentImpl();
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentApproval createContentApproval() {
		ContentApprovalImpl contentApproval = new ContentApprovalImpl();
		return contentApproval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentAssoc createContentAssoc() {
		ContentAssocImpl contentAssoc = new ContentAssocImpl();
		return contentAssoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentAssocPredicate createContentAssocPredicate() {
		ContentAssocPredicateImpl contentAssocPredicate = new ContentAssocPredicateImpl();
		return contentAssocPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentAssocType createContentAssocType() {
		ContentAssocTypeImpl contentAssocType = new ContentAssocTypeImpl();
		return contentAssocType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentAttribute createContentAttribute() {
		ContentAttributeImpl contentAttribute = new ContentAttributeImpl();
		return contentAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentKeyword createContentKeyword() {
		ContentKeywordImpl contentKeyword = new ContentKeywordImpl();
		return contentKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentMetaData createContentMetaData() {
		ContentMetaDataImpl contentMetaData = new ContentMetaDataImpl();
		return contentMetaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentOperation createContentOperation() {
		ContentOperationImpl contentOperation = new ContentOperationImpl();
		return contentOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentPurpose createContentPurpose() {
		ContentPurposeImpl contentPurpose = new ContentPurposeImpl();
		return contentPurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentPurposeOperation createContentPurposeOperation() {
		ContentPurposeOperationImpl contentPurposeOperation = new ContentPurposeOperationImpl();
		return contentPurposeOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentPurposeType createContentPurposeType() {
		ContentPurposeTypeImpl contentPurposeType = new ContentPurposeTypeImpl();
		return contentPurposeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentRevision createContentRevision() {
		ContentRevisionImpl contentRevision = new ContentRevisionImpl();
		return contentRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentRevisionItem createContentRevisionItem() {
		ContentRevisionItemImpl contentRevisionItem = new ContentRevisionItemImpl();
		return contentRevisionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentRole createContentRole() {
		ContentRoleImpl contentRole = new ContentRoleImpl();
		return contentRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentSearchConstraint createContentSearchConstraint() {
		ContentSearchConstraintImpl contentSearchConstraint = new ContentSearchConstraintImpl();
		return contentSearchConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentSearchResult createContentSearchResult() {
		ContentSearchResultImpl contentSearchResult = new ContentSearchResultImpl();
		return contentSearchResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentType createContentType() {
		ContentTypeImpl contentType = new ContentTypeImpl();
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentTypeAttr createContentTypeAttr() {
		ContentTypeAttrImpl contentTypeAttr = new ContentTypeAttrImpl();
		return contentTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentPackage getContentPackage() {
		return (ContentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContentPackage getPackage() {
		return ContentPackage.eINSTANCE;
	}

} //ContentFactoryImpl
