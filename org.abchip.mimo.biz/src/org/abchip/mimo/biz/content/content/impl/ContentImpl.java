/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.content.impl;

import java.util.Collection;
import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.content.content.Content;
import org.abchip.mimo.biz.content.content.ContentPackage;
import org.abchip.mimo.biz.content.content.ContentType;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

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
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getContentName <em>Content Name</em>}</li>
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
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getContentAttributes <em>Content Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getContentKeywords <em>Content Keywords</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getContentMetaDatas <em>Content Meta Datas</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getContentPurposes <em>Content Purposes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getContentRevisions <em>Content Revisions</em>}</li>
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
	 * The default value of the '{@link #getContentId() <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentId() <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected String contentId = CONTENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharacterSetId() <em>Character Set Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterSetId()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARACTER_SET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharacterSetId() <em>Character Set Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterSetId()
	 * @generated
	 * @ordered
	 */
	protected String characterSetId = CHARACTER_SET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getChildBranchCount() <em>Child Branch Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildBranchCount()
	 * @generated
	 * @ordered
	 */
	protected static final long CHILD_BRANCH_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getChildBranchCount() <em>Child Branch Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildBranchCount()
	 * @generated
	 * @ordered
	 */
	protected long childBranchCount = CHILD_BRANCH_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getChildLeafCount() <em>Child Leaf Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildLeafCount()
	 * @generated
	 * @ordered
	 */
	protected static final long CHILD_LEAF_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getChildLeafCount() <em>Child Leaf Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildLeafCount()
	 * @generated
	 * @ordered
	 */
	protected long childLeafCount = CHILD_LEAF_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentName() <em>Content Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentName() <em>Content Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentName()
	 * @generated
	 * @ordered
	 */
	protected String contentName = CONTENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentTypeId() <em>Content Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentTypeId() <em>Content Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentTypeId()
	 * @generated
	 * @ordered
	 */
	protected String contentTypeId = CONTENT_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_BY_USER_LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String createdByUserLogin = CREATED_BY_USER_LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected Date createdDate = CREATED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomMethodId() <em>Custom Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomMethodId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_METHOD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomMethodId() <em>Custom Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomMethodId()
	 * @generated
	 * @ordered
	 */
	protected String customMethodId = CUSTOM_METHOD_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataResourceId() <em>Data Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceId()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_RESOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataResourceId() <em>Data Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceId()
	 * @generated
	 * @ordered
	 */
	protected String dataResourceId = DATA_RESOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataSourceId() <em>Data Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceId()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSourceId() <em>Data Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceId()
	 * @generated
	 * @ordered
	 */
	protected String dataSourceId = DATA_SOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecoratorContentId() <em>Decorator Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoratorContentId()
	 * @generated
	 * @ordered
	 */
	protected static final String DECORATOR_CONTENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecoratorContentId() <em>Decorator Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoratorContentId()
	 * @generated
	 * @ordered
	 */
	protected String decoratorContentId = DECORATOR_CONTENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceOfContentId() <em>Instance Of Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceOfContentId()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_OF_CONTENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceOfContentId() <em>Instance Of Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceOfContentId()
	 * @generated
	 * @ordered
	 */
	protected String instanceOfContentId = INSTANCE_OF_CONTENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String lastModifiedByUserLogin = LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MODIFIED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastModifiedDate = LAST_MODIFIED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocaleString() <em>Locale String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleString()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALE_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocaleString() <em>Locale String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocaleString()
	 * @generated
	 * @ordered
	 */
	protected String localeString = LOCALE_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getMimeTypeId() <em>Mime Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimeTypeId() <em>Mime Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeTypeId()
	 * @generated
	 * @ordered
	 */
	protected String mimeTypeId = MIME_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwnerContentId() <em>Owner Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerContentId()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_CONTENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwnerContentId() <em>Owner Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerContentId()
	 * @generated
	 * @ordered
	 */
	protected String ownerContentId = OWNER_CONTENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivilegeEnumId() <em>Privilege Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivilegeEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVILEGE_ENUM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivilegeEnumId() <em>Privilege Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivilegeEnumId()
	 * @generated
	 * @ordered
	 */
	protected String privilegeEnumId = PRIVILEGE_ENUM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected String statusId = STATUS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateDataResourceId() <em>Template Data Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateDataResourceId()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_DATA_RESOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateDataResourceId() <em>Template Data Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateDataResourceId()
	 * @generated
	 * @ordered
	 */
	protected String templateDataResourceId = TEMPLATE_DATA_RESOURCE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContentAttributes() <em>Content Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> contentAttributes;

	/**
	 * The cached value of the '{@link #getContentKeywords() <em>Content Keywords</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentKeywords()
	 * @generated
	 * @ordered
	 */
	protected EList<String> contentKeywords;

	/**
	 * The cached value of the '{@link #getContentMetaDatas() <em>Content Meta Datas</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentMetaDatas()
	 * @generated
	 * @ordered
	 */
	protected EList<String> contentMetaDatas;

	/**
	 * The cached value of the '{@link #getContentPurposes() <em>Content Purposes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentPurposes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> contentPurposes;

	/**
	 * The cached value of the '{@link #getContentRevisions() <em>Content Revisions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentRevisions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> contentRevisions;

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
	public String getCharacterSetId() {
		return characterSetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharacterSetId(String newCharacterSetId) {
		String oldCharacterSetId = characterSetId;
		characterSetId = newCharacterSetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT__CHARACTER_SET_ID, oldCharacterSetId, characterSetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getChildBranchCount() {
		return childBranchCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChildBranchCount(long newChildBranchCount) {
		long oldChildBranchCount = childBranchCount;
		childBranchCount = newChildBranchCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT__CHILD_BRANCH_COUNT, oldChildBranchCount, childBranchCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getChildLeafCount() {
		return childLeafCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChildLeafCount(long newChildLeafCount) {
		long oldChildLeafCount = childLeafCount;
		childLeafCount = newChildLeafCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT__CHILD_LEAF_COUNT, oldChildLeafCount, childLeafCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentId() {
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentId(String newContentId) {
		String oldContentId = contentId;
		contentId = newContentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT__CONTENT_ID, oldContentId, contentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentName() {
		return contentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentName(String newContentName) {
		String oldContentName = contentName;
		contentName = newContentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT__CONTENT_NAME, oldContentName, contentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentTypeId() {
		return contentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentTypeId(String newContentTypeId) {
		String oldContentTypeId = contentTypeId;
		contentTypeId = newContentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT__CONTENT_TYPE_ID, oldContentTypeId, contentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreatedByUserLogin() {
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(String newCreatedByUserLogin) {
		String oldCreatedByUserLogin = createdByUserLogin;
		createdByUserLogin = newCreatedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		Date oldCreatedDate = createdDate;
		createdDate = newCreatedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT__CREATED_DATE, oldCreatedDate, createdDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomMethodId() {
		return customMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomMethodId(String newCustomMethodId) {
		String oldCustomMethodId = customMethodId;
		customMethodId = newCustomMethodId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT__CUSTOM_METHOD_ID, oldCustomMethodId, customMethodId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataResourceId() {
		return dataResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataResourceId(String newDataResourceId) {
		String oldDataResourceId = dataResourceId;
		dataResourceId = newDataResourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT__DATA_RESOURCE_ID, oldDataResourceId, dataResourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataSourceId() {
		return dataSourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataSourceId(String newDataSourceId) {
		String oldDataSourceId = dataSourceId;
		dataSourceId = newDataSourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT__DATA_SOURCE_ID, oldDataSourceId, dataSourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDecoratorContentId() {
		return decoratorContentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecoratorContentId(String newDecoratorContentId) {
		String oldDecoratorContentId = decoratorContentId;
		decoratorContentId = newDecoratorContentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT__DECORATOR_CONTENT_ID, oldDecoratorContentId, decoratorContentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstanceOfContentId() {
		return instanceOfContentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceOfContentId(String newInstanceOfContentId) {
		String oldInstanceOfContentId = instanceOfContentId;
		instanceOfContentId = newInstanceOfContentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT__INSTANCE_OF_CONTENT_ID, oldInstanceOfContentId, instanceOfContentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedByUserLogin() {
		return lastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(String newLastModifiedByUserLogin) {
		String oldLastModifiedByUserLogin = lastModifiedByUserLogin;
		lastModifiedByUserLogin = newLastModifiedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT__LAST_MODIFIED_BY_USER_LOGIN, oldLastModifiedByUserLogin, lastModifiedByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		Date oldLastModifiedDate = lastModifiedDate;
		lastModifiedDate = newLastModifiedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT__LAST_MODIFIED_DATE, oldLastModifiedDate, lastModifiedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocaleString() {
		return localeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocaleString(String newLocaleString) {
		String oldLocaleString = localeString;
		localeString = newLocaleString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT__LOCALE_STRING, oldLocaleString, localeString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMimeTypeId() {
		return mimeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMimeTypeId(String newMimeTypeId) {
		String oldMimeTypeId = mimeTypeId;
		mimeTypeId = newMimeTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT__MIME_TYPE_ID, oldMimeTypeId, mimeTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOwnerContentId() {
		return ownerContentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerContentId(String newOwnerContentId) {
		String oldOwnerContentId = ownerContentId;
		ownerContentId = newOwnerContentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT__OWNER_CONTENT_ID, oldOwnerContentId, ownerContentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrivilegeEnumId() {
		return privilegeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivilegeEnumId(String newPrivilegeEnumId) {
		String oldPrivilegeEnumId = privilegeEnumId;
		privilegeEnumId = newPrivilegeEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT__PRIVILEGE_ENUM_ID, oldPrivilegeEnumId, privilegeEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(String newStatusId) {
		String oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTemplateDataResourceId() {
		return templateDataResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplateDataResourceId(String newTemplateDataResourceId) {
		String oldTemplateDataResourceId = templateDataResourceId;
		templateDataResourceId = newTemplateDataResourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT__TEMPLATE_DATA_RESOURCE_ID, oldTemplateDataResourceId, templateDataResourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getContentAttributes() {
		if (contentAttributes == null) {
			contentAttributes = new EDataTypeUniqueEList<String>(String.class, this, ContentPackage.CONTENT__CONTENT_ATTRIBUTES);
		}
		return contentAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getContentKeywords() {
		if (contentKeywords == null) {
			contentKeywords = new EDataTypeUniqueEList<String>(String.class, this, ContentPackage.CONTENT__CONTENT_KEYWORDS);
		}
		return contentKeywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getContentMetaDatas() {
		if (contentMetaDatas == null) {
			contentMetaDatas = new EDataTypeUniqueEList<String>(String.class, this, ContentPackage.CONTENT__CONTENT_META_DATAS);
		}
		return contentMetaDatas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getContentPurposes() {
		if (contentPurposes == null) {
			contentPurposes = new EDataTypeUniqueEList<String>(String.class, this, ContentPackage.CONTENT__CONTENT_PURPOSES);
		}
		return contentPurposes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getContentRevisions() {
		if (contentRevisions == null) {
			contentRevisions = new EDataTypeUniqueEList<String>(String.class, this, ContentPackage.CONTENT__CONTENT_REVISIONS);
		}
		return contentRevisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> contentApprovals() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> partyResumes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> portalPages() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> serverHitBins() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> subscriptionResources() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> webPages() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentPackage.CONTENT__CONTENT_ID:
				return getContentId();
			case ContentPackage.CONTENT__CHARACTER_SET_ID:
				return getCharacterSetId();
			case ContentPackage.CONTENT__CHILD_BRANCH_COUNT:
				return getChildBranchCount();
			case ContentPackage.CONTENT__CHILD_LEAF_COUNT:
				return getChildLeafCount();
			case ContentPackage.CONTENT__CONTENT_NAME:
				return getContentName();
			case ContentPackage.CONTENT__CONTENT_TYPE_ID:
				return getContentTypeId();
			case ContentPackage.CONTENT__CREATED_BY_USER_LOGIN:
				return getCreatedByUserLogin();
			case ContentPackage.CONTENT__CREATED_DATE:
				return getCreatedDate();
			case ContentPackage.CONTENT__CUSTOM_METHOD_ID:
				return getCustomMethodId();
			case ContentPackage.CONTENT__DATA_RESOURCE_ID:
				return getDataResourceId();
			case ContentPackage.CONTENT__DATA_SOURCE_ID:
				return getDataSourceId();
			case ContentPackage.CONTENT__DECORATOR_CONTENT_ID:
				return getDecoratorContentId();
			case ContentPackage.CONTENT__DESCRIPTION:
				return getDescription();
			case ContentPackage.CONTENT__INSTANCE_OF_CONTENT_ID:
				return getInstanceOfContentId();
			case ContentPackage.CONTENT__LAST_MODIFIED_BY_USER_LOGIN:
				return getLastModifiedByUserLogin();
			case ContentPackage.CONTENT__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case ContentPackage.CONTENT__LOCALE_STRING:
				return getLocaleString();
			case ContentPackage.CONTENT__MIME_TYPE_ID:
				return getMimeTypeId();
			case ContentPackage.CONTENT__OWNER_CONTENT_ID:
				return getOwnerContentId();
			case ContentPackage.CONTENT__PRIVILEGE_ENUM_ID:
				return getPrivilegeEnumId();
			case ContentPackage.CONTENT__SERVICE_NAME:
				return getServiceName();
			case ContentPackage.CONTENT__STATUS_ID:
				return getStatusId();
			case ContentPackage.CONTENT__TEMPLATE_DATA_RESOURCE_ID:
				return getTemplateDataResourceId();
			case ContentPackage.CONTENT__CONTENT_ATTRIBUTES:
				return getContentAttributes();
			case ContentPackage.CONTENT__CONTENT_KEYWORDS:
				return getContentKeywords();
			case ContentPackage.CONTENT__CONTENT_META_DATAS:
				return getContentMetaDatas();
			case ContentPackage.CONTENT__CONTENT_PURPOSES:
				return getContentPurposes();
			case ContentPackage.CONTENT__CONTENT_REVISIONS:
				return getContentRevisions();
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
			case ContentPackage.CONTENT__CONTENT_ID:
				setContentId((String)newValue);
				return;
			case ContentPackage.CONTENT__CHARACTER_SET_ID:
				setCharacterSetId((String)newValue);
				return;
			case ContentPackage.CONTENT__CHILD_BRANCH_COUNT:
				setChildBranchCount((Long)newValue);
				return;
			case ContentPackage.CONTENT__CHILD_LEAF_COUNT:
				setChildLeafCount((Long)newValue);
				return;
			case ContentPackage.CONTENT__CONTENT_NAME:
				setContentName((String)newValue);
				return;
			case ContentPackage.CONTENT__CONTENT_TYPE_ID:
				setContentTypeId((String)newValue);
				return;
			case ContentPackage.CONTENT__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((String)newValue);
				return;
			case ContentPackage.CONTENT__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case ContentPackage.CONTENT__CUSTOM_METHOD_ID:
				setCustomMethodId((String)newValue);
				return;
			case ContentPackage.CONTENT__DATA_RESOURCE_ID:
				setDataResourceId((String)newValue);
				return;
			case ContentPackage.CONTENT__DATA_SOURCE_ID:
				setDataSourceId((String)newValue);
				return;
			case ContentPackage.CONTENT__DECORATOR_CONTENT_ID:
				setDecoratorContentId((String)newValue);
				return;
			case ContentPackage.CONTENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ContentPackage.CONTENT__INSTANCE_OF_CONTENT_ID:
				setInstanceOfContentId((String)newValue);
				return;
			case ContentPackage.CONTENT__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((String)newValue);
				return;
			case ContentPackage.CONTENT__LAST_MODIFIED_DATE:
				setLastModifiedDate((Date)newValue);
				return;
			case ContentPackage.CONTENT__LOCALE_STRING:
				setLocaleString((String)newValue);
				return;
			case ContentPackage.CONTENT__MIME_TYPE_ID:
				setMimeTypeId((String)newValue);
				return;
			case ContentPackage.CONTENT__OWNER_CONTENT_ID:
				setOwnerContentId((String)newValue);
				return;
			case ContentPackage.CONTENT__PRIVILEGE_ENUM_ID:
				setPrivilegeEnumId((String)newValue);
				return;
			case ContentPackage.CONTENT__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case ContentPackage.CONTENT__STATUS_ID:
				setStatusId((String)newValue);
				return;
			case ContentPackage.CONTENT__TEMPLATE_DATA_RESOURCE_ID:
				setTemplateDataResourceId((String)newValue);
				return;
			case ContentPackage.CONTENT__CONTENT_ATTRIBUTES:
				getContentAttributes().clear();
				getContentAttributes().addAll((Collection<? extends String>)newValue);
				return;
			case ContentPackage.CONTENT__CONTENT_KEYWORDS:
				getContentKeywords().clear();
				getContentKeywords().addAll((Collection<? extends String>)newValue);
				return;
			case ContentPackage.CONTENT__CONTENT_META_DATAS:
				getContentMetaDatas().clear();
				getContentMetaDatas().addAll((Collection<? extends String>)newValue);
				return;
			case ContentPackage.CONTENT__CONTENT_PURPOSES:
				getContentPurposes().clear();
				getContentPurposes().addAll((Collection<? extends String>)newValue);
				return;
			case ContentPackage.CONTENT__CONTENT_REVISIONS:
				getContentRevisions().clear();
				getContentRevisions().addAll((Collection<? extends String>)newValue);
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
			case ContentPackage.CONTENT__CONTENT_ID:
				setContentId(CONTENT_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT__CHARACTER_SET_ID:
				setCharacterSetId(CHARACTER_SET_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT__CHILD_BRANCH_COUNT:
				setChildBranchCount(CHILD_BRANCH_COUNT_EDEFAULT);
				return;
			case ContentPackage.CONTENT__CHILD_LEAF_COUNT:
				setChildLeafCount(CHILD_LEAF_COUNT_EDEFAULT);
				return;
			case ContentPackage.CONTENT__CONTENT_NAME:
				setContentName(CONTENT_NAME_EDEFAULT);
				return;
			case ContentPackage.CONTENT__CONTENT_TYPE_ID:
				setContentTypeId(CONTENT_TYPE_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin(CREATED_BY_USER_LOGIN_EDEFAULT);
				return;
			case ContentPackage.CONTENT__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case ContentPackage.CONTENT__CUSTOM_METHOD_ID:
				setCustomMethodId(CUSTOM_METHOD_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT__DATA_RESOURCE_ID:
				setDataResourceId(DATA_RESOURCE_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT__DATA_SOURCE_ID:
				setDataSourceId(DATA_SOURCE_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT__DECORATOR_CONTENT_ID:
				setDecoratorContentId(DECORATOR_CONTENT_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ContentPackage.CONTENT__INSTANCE_OF_CONTENT_ID:
				setInstanceOfContentId(INSTANCE_OF_CONTENT_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin(LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT);
				return;
			case ContentPackage.CONTENT__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
				return;
			case ContentPackage.CONTENT__LOCALE_STRING:
				setLocaleString(LOCALE_STRING_EDEFAULT);
				return;
			case ContentPackage.CONTENT__MIME_TYPE_ID:
				setMimeTypeId(MIME_TYPE_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT__OWNER_CONTENT_ID:
				setOwnerContentId(OWNER_CONTENT_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT__PRIVILEGE_ENUM_ID:
				setPrivilegeEnumId(PRIVILEGE_ENUM_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case ContentPackage.CONTENT__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT__TEMPLATE_DATA_RESOURCE_ID:
				setTemplateDataResourceId(TEMPLATE_DATA_RESOURCE_ID_EDEFAULT);
				return;
			case ContentPackage.CONTENT__CONTENT_ATTRIBUTES:
				getContentAttributes().clear();
				return;
			case ContentPackage.CONTENT__CONTENT_KEYWORDS:
				getContentKeywords().clear();
				return;
			case ContentPackage.CONTENT__CONTENT_META_DATAS:
				getContentMetaDatas().clear();
				return;
			case ContentPackage.CONTENT__CONTENT_PURPOSES:
				getContentPurposes().clear();
				return;
			case ContentPackage.CONTENT__CONTENT_REVISIONS:
				getContentRevisions().clear();
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
			case ContentPackage.CONTENT__CONTENT_ID:
				return CONTENT_ID_EDEFAULT == null ? contentId != null : !CONTENT_ID_EDEFAULT.equals(contentId);
			case ContentPackage.CONTENT__CHARACTER_SET_ID:
				return CHARACTER_SET_ID_EDEFAULT == null ? characterSetId != null : !CHARACTER_SET_ID_EDEFAULT.equals(characterSetId);
			case ContentPackage.CONTENT__CHILD_BRANCH_COUNT:
				return childBranchCount != CHILD_BRANCH_COUNT_EDEFAULT;
			case ContentPackage.CONTENT__CHILD_LEAF_COUNT:
				return childLeafCount != CHILD_LEAF_COUNT_EDEFAULT;
			case ContentPackage.CONTENT__CONTENT_NAME:
				return CONTENT_NAME_EDEFAULT == null ? contentName != null : !CONTENT_NAME_EDEFAULT.equals(contentName);
			case ContentPackage.CONTENT__CONTENT_TYPE_ID:
				return CONTENT_TYPE_ID_EDEFAULT == null ? contentTypeId != null : !CONTENT_TYPE_ID_EDEFAULT.equals(contentTypeId);
			case ContentPackage.CONTENT__CREATED_BY_USER_LOGIN:
				return CREATED_BY_USER_LOGIN_EDEFAULT == null ? createdByUserLogin != null : !CREATED_BY_USER_LOGIN_EDEFAULT.equals(createdByUserLogin);
			case ContentPackage.CONTENT__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case ContentPackage.CONTENT__CUSTOM_METHOD_ID:
				return CUSTOM_METHOD_ID_EDEFAULT == null ? customMethodId != null : !CUSTOM_METHOD_ID_EDEFAULT.equals(customMethodId);
			case ContentPackage.CONTENT__DATA_RESOURCE_ID:
				return DATA_RESOURCE_ID_EDEFAULT == null ? dataResourceId != null : !DATA_RESOURCE_ID_EDEFAULT.equals(dataResourceId);
			case ContentPackage.CONTENT__DATA_SOURCE_ID:
				return DATA_SOURCE_ID_EDEFAULT == null ? dataSourceId != null : !DATA_SOURCE_ID_EDEFAULT.equals(dataSourceId);
			case ContentPackage.CONTENT__DECORATOR_CONTENT_ID:
				return DECORATOR_CONTENT_ID_EDEFAULT == null ? decoratorContentId != null : !DECORATOR_CONTENT_ID_EDEFAULT.equals(decoratorContentId);
			case ContentPackage.CONTENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ContentPackage.CONTENT__INSTANCE_OF_CONTENT_ID:
				return INSTANCE_OF_CONTENT_ID_EDEFAULT == null ? instanceOfContentId != null : !INSTANCE_OF_CONTENT_ID_EDEFAULT.equals(instanceOfContentId);
			case ContentPackage.CONTENT__LAST_MODIFIED_BY_USER_LOGIN:
				return LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT == null ? lastModifiedByUserLogin != null : !LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT.equals(lastModifiedByUserLogin);
			case ContentPackage.CONTENT__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case ContentPackage.CONTENT__LOCALE_STRING:
				return LOCALE_STRING_EDEFAULT == null ? localeString != null : !LOCALE_STRING_EDEFAULT.equals(localeString);
			case ContentPackage.CONTENT__MIME_TYPE_ID:
				return MIME_TYPE_ID_EDEFAULT == null ? mimeTypeId != null : !MIME_TYPE_ID_EDEFAULT.equals(mimeTypeId);
			case ContentPackage.CONTENT__OWNER_CONTENT_ID:
				return OWNER_CONTENT_ID_EDEFAULT == null ? ownerContentId != null : !OWNER_CONTENT_ID_EDEFAULT.equals(ownerContentId);
			case ContentPackage.CONTENT__PRIVILEGE_ENUM_ID:
				return PRIVILEGE_ENUM_ID_EDEFAULT == null ? privilegeEnumId != null : !PRIVILEGE_ENUM_ID_EDEFAULT.equals(privilegeEnumId);
			case ContentPackage.CONTENT__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case ContentPackage.CONTENT__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
			case ContentPackage.CONTENT__TEMPLATE_DATA_RESOURCE_ID:
				return TEMPLATE_DATA_RESOURCE_ID_EDEFAULT == null ? templateDataResourceId != null : !TEMPLATE_DATA_RESOURCE_ID_EDEFAULT.equals(templateDataResourceId);
			case ContentPackage.CONTENT__CONTENT_ATTRIBUTES:
				return contentAttributes != null && !contentAttributes.isEmpty();
			case ContentPackage.CONTENT__CONTENT_KEYWORDS:
				return contentKeywords != null && !contentKeywords.isEmpty();
			case ContentPackage.CONTENT__CONTENT_META_DATAS:
				return contentMetaDatas != null && !contentMetaDatas.isEmpty();
			case ContentPackage.CONTENT__CONTENT_PURPOSES:
				return contentPurposes != null && !contentPurposes.isEmpty();
			case ContentPackage.CONTENT__CONTENT_REVISIONS:
				return contentRevisions != null && !contentRevisions.isEmpty();
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
		result.append(" (contentId: ");
		result.append(contentId);
		result.append(", characterSetId: ");
		result.append(characterSetId);
		result.append(", childBranchCount: ");
		result.append(childBranchCount);
		result.append(", childLeafCount: ");
		result.append(childLeafCount);
		result.append(", contentName: ");
		result.append(contentName);
		result.append(", contentTypeId: ");
		result.append(contentTypeId);
		result.append(", createdByUserLogin: ");
		result.append(createdByUserLogin);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(", customMethodId: ");
		result.append(customMethodId);
		result.append(", dataResourceId: ");
		result.append(dataResourceId);
		result.append(", dataSourceId: ");
		result.append(dataSourceId);
		result.append(", decoratorContentId: ");
		result.append(decoratorContentId);
		result.append(", description: ");
		result.append(description);
		result.append(", instanceOfContentId: ");
		result.append(instanceOfContentId);
		result.append(", lastModifiedByUserLogin: ");
		result.append(lastModifiedByUserLogin);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", localeString: ");
		result.append(localeString);
		result.append(", mimeTypeId: ");
		result.append(mimeTypeId);
		result.append(", ownerContentId: ");
		result.append(ownerContentId);
		result.append(", privilegeEnumId: ");
		result.append(privilegeEnumId);
		result.append(", serviceName: ");
		result.append(serviceName);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(", templateDataResourceId: ");
		result.append(templateDataResourceId);
		result.append(", contentAttributes: ");
		result.append(contentAttributes);
		result.append(", contentKeywords: ");
		result.append(contentKeywords);
		result.append(", contentMetaDatas: ");
		result.append(contentMetaDatas);
		result.append(", contentPurposes: ");
		result.append(contentPurposes);
		result.append(", contentRevisions: ");
		result.append(contentRevisions);
		result.append(')');
		return result.toString();
	}

} //ContentImpl
