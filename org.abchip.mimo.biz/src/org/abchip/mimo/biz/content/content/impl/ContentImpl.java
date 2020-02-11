/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.content.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.common.datasource.DataSource;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.method.CustomMethod;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.content.content.Content;
import org.abchip.mimo.biz.content.content.ContentAttribute;
import org.abchip.mimo.biz.content.content.ContentKeyword;
import org.abchip.mimo.biz.content.content.ContentMetaData;
import org.abchip.mimo.biz.content.content.ContentPackage;
import org.abchip.mimo.biz.content.content.ContentPurpose;
import org.abchip.mimo.biz.content.content.ContentRevision;
import org.abchip.mimo.biz.content.content.ContentType;
import org.abchip.mimo.biz.content.data.CharacterSet;
import org.abchip.mimo.biz.content.data.DataResource;
import org.abchip.mimo.biz.content.data.MimeType;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getCharacterSetId <em>Character Set Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getChildBranchCount <em>Child Branch Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getChildLeafCount <em>Child Leaf Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getContentAttributes <em>Content Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getContentKeywords <em>Content Keywords</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getContentMetaDatas <em>Content Meta Datas</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getContentName <em>Content Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getContentPurposes <em>Content Purposes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getContentRevisions <em>Content Revisions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getContentTypeId <em>Content Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getCustomMethodId <em>Custom Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getDataResourceId <em>Data Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getDataSourceId <em>Data Source Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getDecoratorContentId <em>Decorator Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getInstanceOfContentId <em>Instance Of Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getLocaleString <em>Locale String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getMimeTypeId <em>Mime Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getOwnerContentId <em>Owner Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getPrivilegeEnumId <em>Privilege Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getTemplateDataResourceId <em>Template Data Resource Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentImpl extends BizEntityTypedImpl<ContentType> implements Content {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterSet getCharacterSetId() {
		return (CharacterSet)eGet(ContentPackage.Literals.CONTENT__CHARACTER_SET_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharacterSetId(CharacterSet newCharacterSetId) {
		eSet(ContentPackage.Literals.CONTENT__CHARACTER_SET_ID, newCharacterSetId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getChildBranchCount() {
		return (Long)eGet(ContentPackage.Literals.CONTENT__CHILD_BRANCH_COUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChildBranchCount(long newChildBranchCount) {
		eSet(ContentPackage.Literals.CONTENT__CHILD_BRANCH_COUNT, newChildBranchCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getChildLeafCount() {
		return (Long)eGet(ContentPackage.Literals.CONTENT__CHILD_LEAF_COUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChildLeafCount(long newChildLeafCount) {
		eSet(ContentPackage.Literals.CONTENT__CHILD_LEAF_COUNT, newChildLeafCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ContentAttribute> getContentAttributes() {
		return (List<ContentAttribute>)eGet(ContentPackage.Literals.CONTENT__CONTENT_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ContentKeyword> getContentKeywords() {
		return (List<ContentKeyword>)eGet(ContentPackage.Literals.CONTENT__CONTENT_KEYWORDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ContentMetaData> getContentMetaDatas() {
		return (List<ContentMetaData>)eGet(ContentPackage.Literals.CONTENT__CONTENT_META_DATAS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentId() {
		return (String)eGet(ContentPackage.Literals.CONTENT__CONTENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentId(String newContentId) {
		eSet(ContentPackage.Literals.CONTENT__CONTENT_ID, newContentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentName() {
		return (String)eGet(ContentPackage.Literals.CONTENT__CONTENT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentName(String newContentName) {
		eSet(ContentPackage.Literals.CONTENT__CONTENT_NAME, newContentName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ContentPurpose> getContentPurposes() {
		return (List<ContentPurpose>)eGet(ContentPackage.Literals.CONTENT__CONTENT_PURPOSES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ContentRevision> getContentRevisions() {
		return (List<ContentRevision>)eGet(ContentPackage.Literals.CONTENT__CONTENT_REVISIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentType getContentTypeId() {
		return (ContentType)eGet(ContentPackage.Literals.CONTENT__CONTENT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentTypeId(ContentType newContentTypeId) {
		eSet(ContentPackage.Literals.CONTENT__CONTENT_TYPE_ID, newContentTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getCreatedByUserLogin() {
		return (UserLogin)eGet(ContentPackage.Literals.CONTENT__CREATED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(UserLogin newCreatedByUserLogin) {
		eSet(ContentPackage.Literals.CONTENT__CREATED_BY_USER_LOGIN, newCreatedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return (Date)eGet(ContentPackage.Literals.CONTENT__CREATED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		eSet(ContentPackage.Literals.CONTENT__CREATED_DATE, newCreatedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMethod getCustomMethodId() {
		return (CustomMethod)eGet(ContentPackage.Literals.CONTENT__CUSTOM_METHOD_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomMethodId(CustomMethod newCustomMethodId) {
		eSet(ContentPackage.Literals.CONTENT__CUSTOM_METHOD_ID, newCustomMethodId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataResource getDataResourceId() {
		return (DataResource)eGet(ContentPackage.Literals.CONTENT__DATA_RESOURCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataResourceId(DataResource newDataResourceId) {
		eSet(ContentPackage.Literals.CONTENT__DATA_RESOURCE_ID, newDataResourceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSource getDataSourceId() {
		return (DataSource)eGet(ContentPackage.Literals.CONTENT__DATA_SOURCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataSourceId(DataSource newDataSourceId) {
		eSet(ContentPackage.Literals.CONTENT__DATA_SOURCE_ID, newDataSourceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Content getDecoratorContentId() {
		return (Content)eGet(ContentPackage.Literals.CONTENT__DECORATOR_CONTENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecoratorContentId(Content newDecoratorContentId) {
		eSet(ContentPackage.Literals.CONTENT__DECORATOR_CONTENT_ID, newDecoratorContentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(ContentPackage.Literals.CONTENT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(ContentPackage.Literals.CONTENT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Content getInstanceOfContentId() {
		return (Content)eGet(ContentPackage.Literals.CONTENT__INSTANCE_OF_CONTENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceOfContentId(Content newInstanceOfContentId) {
		eSet(ContentPackage.Literals.CONTENT__INSTANCE_OF_CONTENT_ID, newInstanceOfContentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getLastModifiedByUserLogin() {
		return (UserLogin)eGet(ContentPackage.Literals.CONTENT__LAST_MODIFIED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(UserLogin newLastModifiedByUserLogin) {
		eSet(ContentPackage.Literals.CONTENT__LAST_MODIFIED_BY_USER_LOGIN, newLastModifiedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return (Date)eGet(ContentPackage.Literals.CONTENT__LAST_MODIFIED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		eSet(ContentPackage.Literals.CONTENT__LAST_MODIFIED_DATE, newLastModifiedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocaleString() {
		return (String)eGet(ContentPackage.Literals.CONTENT__LOCALE_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocaleString(String newLocaleString) {
		eSet(ContentPackage.Literals.CONTENT__LOCALE_STRING, newLocaleString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MimeType getMimeTypeId() {
		return (MimeType)eGet(ContentPackage.Literals.CONTENT__MIME_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMimeTypeId(MimeType newMimeTypeId) {
		eSet(ContentPackage.Literals.CONTENT__MIME_TYPE_ID, newMimeTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Content getOwnerContentId() {
		return (Content)eGet(ContentPackage.Literals.CONTENT__OWNER_CONTENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerContentId(Content newOwnerContentId) {
		eSet(ContentPackage.Literals.CONTENT__OWNER_CONTENT_ID, newOwnerContentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getPrivilegeEnumId() {
		return (Enumeration)eGet(ContentPackage.Literals.CONTENT__PRIVILEGE_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivilegeEnumId(Enumeration newPrivilegeEnumId) {
		eSet(ContentPackage.Literals.CONTENT__PRIVILEGE_ENUM_ID, newPrivilegeEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceName() {
		return (String)eGet(ContentPackage.Literals.CONTENT__SERVICE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceName(String newServiceName) {
		eSet(ContentPackage.Literals.CONTENT__SERVICE_NAME, newServiceName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		return (StatusItem)eGet(ContentPackage.Literals.CONTENT__STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		eSet(ContentPackage.Literals.CONTENT__STATUS_ID, newStatusId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataResource getTemplateDataResourceId() {
		return (DataResource)eGet(ContentPackage.Literals.CONTENT__TEMPLATE_DATA_RESOURCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplateDataResourceId(DataResource newTemplateDataResourceId) {
		eSet(ContentPackage.Literals.CONTENT__TEMPLATE_DATA_RESOURCE_ID, newTemplateDataResourceId);
	}

} //ContentImpl
