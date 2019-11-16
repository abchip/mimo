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

import org.abchip.mimo.biz.common.datasource.DataSource;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.method.CustomMethod;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.content.content.Content;
import org.abchip.mimo.biz.content.content.ContentPackage;
import org.abchip.mimo.biz.content.content.ContentType;
import org.abchip.mimo.biz.content.data.CharacterSet;
import org.abchip.mimo.biz.content.data.DataResource;
import org.abchip.mimo.biz.content.data.MimeType;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getChildBranchCount <em>Child Branch Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getChildLeafCount <em>Child Leaf Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getContentName <em>Content Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getLocaleString <em>Locale String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getContentTypeId <em>Content Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getDataResourceId <em>Data Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getTemplateDataResourceId <em>Template Data Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getPrivilegeEnumId <em>Privilege Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getCustomMethodId <em>Custom Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getMimeTypeId <em>Mime Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getCharacterSetId <em>Character Set Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getDataSourceId <em>Data Source Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getDecoratorContentId <em>Decorator Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getOwnerContentId <em>Owner Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.impl.ContentImpl#getInstanceOfContentId <em>Instance Of Content Id</em>}</li>
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
	 * The cached value of the '{@link #getContentTypeId() <em>Content Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentTypeId()
	 * @generated
	 * @ordered
	 */
	protected ContentType contentTypeId;

	/**
	 * The cached value of the '{@link #getDataResourceId() <em>Data Resource Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceId()
	 * @generated
	 * @ordered
	 */
	protected DataResource dataResourceId;

	/**
	 * The cached value of the '{@link #getTemplateDataResourceId() <em>Template Data Resource Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateDataResourceId()
	 * @generated
	 * @ordered
	 */
	protected DataResource templateDataResourceId;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;

	/**
	 * The cached value of the '{@link #getPrivilegeEnumId() <em>Privilege Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivilegeEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration privilegeEnumId;

	/**
	 * The cached value of the '{@link #getCustomMethodId() <em>Custom Method Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomMethodId()
	 * @generated
	 * @ordered
	 */
	protected CustomMethod customMethodId;

	/**
	 * The cached value of the '{@link #getMimeTypeId() <em>Mime Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeTypeId()
	 * @generated
	 * @ordered
	 */
	protected MimeType mimeTypeId;

	/**
	 * The cached value of the '{@link #getCharacterSetId() <em>Character Set Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacterSetId()
	 * @generated
	 * @ordered
	 */
	protected CharacterSet characterSetId;

	/**
	 * The cached value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected UserLogin createdByUserLogin;

	/**
	 * The cached value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected UserLogin lastModifiedByUserLogin;

	/**
	 * The cached value of the '{@link #getDataSourceId() <em>Data Source Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceId()
	 * @generated
	 * @ordered
	 */
	protected DataSource dataSourceId;

	/**
	 * The cached value of the '{@link #getDecoratorContentId() <em>Decorator Content Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoratorContentId()
	 * @generated
	 * @ordered
	 */
	protected Content decoratorContentId;

	/**
	 * The cached value of the '{@link #getOwnerContentId() <em>Owner Content Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerContentId()
	 * @generated
	 * @ordered
	 */
	protected Content ownerContentId;

	/**
	 * The cached value of the '{@link #getInstanceOfContentId() <em>Instance Of Content Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceOfContentId()
	 * @generated
	 * @ordered
	 */
	protected Content instanceOfContentId;

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
	public CharacterSet getCharacterSetId() {
		if (characterSetId != null && ((EObject)characterSetId).eIsProxy()) {
			InternalEObject oldCharacterSetId = (InternalEObject)characterSetId;
			characterSetId = (CharacterSet)eResolveProxy(oldCharacterSetId);
			if (characterSetId != oldCharacterSetId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT__CHARACTER_SET_ID, oldCharacterSetId, characterSetId));
			}
		}
		return characterSetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterSet basicGetCharacterSetId() {
		return characterSetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharacterSetId(CharacterSet newCharacterSetId) {
		CharacterSet oldCharacterSetId = characterSetId;
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
	public ContentType getContentTypeId() {
		if (contentTypeId != null && ((EObject)contentTypeId).eIsProxy()) {
			InternalEObject oldContentTypeId = (InternalEObject)contentTypeId;
			contentTypeId = (ContentType)eResolveProxy(oldContentTypeId);
			if (contentTypeId != oldContentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT__CONTENT_TYPE_ID, oldContentTypeId, contentTypeId));
			}
		}
		return contentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentType basicGetContentTypeId() {
		return contentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentTypeId(ContentType newContentTypeId) {
		ContentType oldContentTypeId = contentTypeId;
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
	public UserLogin getCreatedByUserLogin() {
		if (createdByUserLogin != null && ((EObject)createdByUserLogin).eIsProxy()) {
			InternalEObject oldCreatedByUserLogin = (InternalEObject)createdByUserLogin;
			createdByUserLogin = (UserLogin)eResolveProxy(oldCreatedByUserLogin);
			if (createdByUserLogin != oldCreatedByUserLogin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
			}
		}
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetCreatedByUserLogin() {
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(UserLogin newCreatedByUserLogin) {
		UserLogin oldCreatedByUserLogin = createdByUserLogin;
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
	public CustomMethod getCustomMethodId() {
		if (customMethodId != null && ((EObject)customMethodId).eIsProxy()) {
			InternalEObject oldCustomMethodId = (InternalEObject)customMethodId;
			customMethodId = (CustomMethod)eResolveProxy(oldCustomMethodId);
			if (customMethodId != oldCustomMethodId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT__CUSTOM_METHOD_ID, oldCustomMethodId, customMethodId));
			}
		}
		return customMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomMethod basicGetCustomMethodId() {
		return customMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomMethodId(CustomMethod newCustomMethodId) {
		CustomMethod oldCustomMethodId = customMethodId;
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
	public DataResource getDataResourceId() {
		if (dataResourceId != null && ((EObject)dataResourceId).eIsProxy()) {
			InternalEObject oldDataResourceId = (InternalEObject)dataResourceId;
			dataResourceId = (DataResource)eResolveProxy(oldDataResourceId);
			if (dataResourceId != oldDataResourceId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT__DATA_RESOURCE_ID, oldDataResourceId, dataResourceId));
			}
		}
		return dataResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataResource basicGetDataResourceId() {
		return dataResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataResourceId(DataResource newDataResourceId) {
		DataResource oldDataResourceId = dataResourceId;
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
	public DataSource getDataSourceId() {
		if (dataSourceId != null && ((EObject)dataSourceId).eIsProxy()) {
			InternalEObject oldDataSourceId = (InternalEObject)dataSourceId;
			dataSourceId = (DataSource)eResolveProxy(oldDataSourceId);
			if (dataSourceId != oldDataSourceId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT__DATA_SOURCE_ID, oldDataSourceId, dataSourceId));
			}
		}
		return dataSourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource basicGetDataSourceId() {
		return dataSourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataSourceId(DataSource newDataSourceId) {
		DataSource oldDataSourceId = dataSourceId;
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
	public Content getDecoratorContentId() {
		if (decoratorContentId != null && ((EObject)decoratorContentId).eIsProxy()) {
			InternalEObject oldDecoratorContentId = (InternalEObject)decoratorContentId;
			decoratorContentId = (Content)eResolveProxy(oldDecoratorContentId);
			if (decoratorContentId != oldDecoratorContentId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT__DECORATOR_CONTENT_ID, oldDecoratorContentId, decoratorContentId));
			}
		}
		return decoratorContentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content basicGetDecoratorContentId() {
		return decoratorContentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecoratorContentId(Content newDecoratorContentId) {
		Content oldDecoratorContentId = decoratorContentId;
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
	public Content getInstanceOfContentId() {
		if (instanceOfContentId != null && ((EObject)instanceOfContentId).eIsProxy()) {
			InternalEObject oldInstanceOfContentId = (InternalEObject)instanceOfContentId;
			instanceOfContentId = (Content)eResolveProxy(oldInstanceOfContentId);
			if (instanceOfContentId != oldInstanceOfContentId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT__INSTANCE_OF_CONTENT_ID, oldInstanceOfContentId, instanceOfContentId));
			}
		}
		return instanceOfContentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content basicGetInstanceOfContentId() {
		return instanceOfContentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceOfContentId(Content newInstanceOfContentId) {
		Content oldInstanceOfContentId = instanceOfContentId;
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
	public UserLogin getLastModifiedByUserLogin() {
		if (lastModifiedByUserLogin != null && ((EObject)lastModifiedByUserLogin).eIsProxy()) {
			InternalEObject oldLastModifiedByUserLogin = (InternalEObject)lastModifiedByUserLogin;
			lastModifiedByUserLogin = (UserLogin)eResolveProxy(oldLastModifiedByUserLogin);
			if (lastModifiedByUserLogin != oldLastModifiedByUserLogin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT__LAST_MODIFIED_BY_USER_LOGIN, oldLastModifiedByUserLogin, lastModifiedByUserLogin));
			}
		}
		return lastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetLastModifiedByUserLogin() {
		return lastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(UserLogin newLastModifiedByUserLogin) {
		UserLogin oldLastModifiedByUserLogin = lastModifiedByUserLogin;
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
	public MimeType getMimeTypeId() {
		if (mimeTypeId != null && ((EObject)mimeTypeId).eIsProxy()) {
			InternalEObject oldMimeTypeId = (InternalEObject)mimeTypeId;
			mimeTypeId = (MimeType)eResolveProxy(oldMimeTypeId);
			if (mimeTypeId != oldMimeTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT__MIME_TYPE_ID, oldMimeTypeId, mimeTypeId));
			}
		}
		return mimeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MimeType basicGetMimeTypeId() {
		return mimeTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMimeTypeId(MimeType newMimeTypeId) {
		MimeType oldMimeTypeId = mimeTypeId;
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
	public Content getOwnerContentId() {
		if (ownerContentId != null && ((EObject)ownerContentId).eIsProxy()) {
			InternalEObject oldOwnerContentId = (InternalEObject)ownerContentId;
			ownerContentId = (Content)eResolveProxy(oldOwnerContentId);
			if (ownerContentId != oldOwnerContentId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT__OWNER_CONTENT_ID, oldOwnerContentId, ownerContentId));
			}
		}
		return ownerContentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content basicGetOwnerContentId() {
		return ownerContentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerContentId(Content newOwnerContentId) {
		Content oldOwnerContentId = ownerContentId;
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
	public Enumeration getPrivilegeEnumId() {
		if (privilegeEnumId != null && ((EObject)privilegeEnumId).eIsProxy()) {
			InternalEObject oldPrivilegeEnumId = (InternalEObject)privilegeEnumId;
			privilegeEnumId = (Enumeration)eResolveProxy(oldPrivilegeEnumId);
			if (privilegeEnumId != oldPrivilegeEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT__PRIVILEGE_ENUM_ID, oldPrivilegeEnumId, privilegeEnumId));
			}
		}
		return privilegeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetPrivilegeEnumId() {
		return privilegeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivilegeEnumId(Enumeration newPrivilegeEnumId) {
		Enumeration oldPrivilegeEnumId = privilegeEnumId;
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
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT__STATUS_ID, oldStatusId, statusId));
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		StatusItem oldStatusId = statusId;
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
	public DataResource getTemplateDataResourceId() {
		if (templateDataResourceId != null && ((EObject)templateDataResourceId).eIsProxy()) {
			InternalEObject oldTemplateDataResourceId = (InternalEObject)templateDataResourceId;
			templateDataResourceId = (DataResource)eResolveProxy(oldTemplateDataResourceId);
			if (templateDataResourceId != oldTemplateDataResourceId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT__TEMPLATE_DATA_RESOURCE_ID, oldTemplateDataResourceId, templateDataResourceId));
			}
		}
		return templateDataResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataResource basicGetTemplateDataResourceId() {
		return templateDataResourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplateDataResourceId(DataResource newTemplateDataResourceId) {
		DataResource oldTemplateDataResourceId = templateDataResourceId;
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
			case ContentPackage.CONTENT__CHILD_BRANCH_COUNT:
				return getChildBranchCount();
			case ContentPackage.CONTENT__CHILD_LEAF_COUNT:
				return getChildLeafCount();
			case ContentPackage.CONTENT__CONTENT_NAME:
				return getContentName();
			case ContentPackage.CONTENT__CREATED_DATE:
				return getCreatedDate();
			case ContentPackage.CONTENT__DESCRIPTION:
				return getDescription();
			case ContentPackage.CONTENT__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case ContentPackage.CONTENT__LOCALE_STRING:
				return getLocaleString();
			case ContentPackage.CONTENT__SERVICE_NAME:
				return getServiceName();
			case ContentPackage.CONTENT__CONTENT_TYPE_ID:
				if (resolve) return getContentTypeId();
				return basicGetContentTypeId();
			case ContentPackage.CONTENT__DATA_RESOURCE_ID:
				if (resolve) return getDataResourceId();
				return basicGetDataResourceId();
			case ContentPackage.CONTENT__TEMPLATE_DATA_RESOURCE_ID:
				if (resolve) return getTemplateDataResourceId();
				return basicGetTemplateDataResourceId();
			case ContentPackage.CONTENT__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case ContentPackage.CONTENT__PRIVILEGE_ENUM_ID:
				if (resolve) return getPrivilegeEnumId();
				return basicGetPrivilegeEnumId();
			case ContentPackage.CONTENT__CUSTOM_METHOD_ID:
				if (resolve) return getCustomMethodId();
				return basicGetCustomMethodId();
			case ContentPackage.CONTENT__MIME_TYPE_ID:
				if (resolve) return getMimeTypeId();
				return basicGetMimeTypeId();
			case ContentPackage.CONTENT__CHARACTER_SET_ID:
				if (resolve) return getCharacterSetId();
				return basicGetCharacterSetId();
			case ContentPackage.CONTENT__CREATED_BY_USER_LOGIN:
				if (resolve) return getCreatedByUserLogin();
				return basicGetCreatedByUserLogin();
			case ContentPackage.CONTENT__LAST_MODIFIED_BY_USER_LOGIN:
				if (resolve) return getLastModifiedByUserLogin();
				return basicGetLastModifiedByUserLogin();
			case ContentPackage.CONTENT__DATA_SOURCE_ID:
				if (resolve) return getDataSourceId();
				return basicGetDataSourceId();
			case ContentPackage.CONTENT__DECORATOR_CONTENT_ID:
				if (resolve) return getDecoratorContentId();
				return basicGetDecoratorContentId();
			case ContentPackage.CONTENT__OWNER_CONTENT_ID:
				if (resolve) return getOwnerContentId();
				return basicGetOwnerContentId();
			case ContentPackage.CONTENT__INSTANCE_OF_CONTENT_ID:
				if (resolve) return getInstanceOfContentId();
				return basicGetInstanceOfContentId();
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
			case ContentPackage.CONTENT__CHILD_BRANCH_COUNT:
				setChildBranchCount((Long)newValue);
				return;
			case ContentPackage.CONTENT__CHILD_LEAF_COUNT:
				setChildLeafCount((Long)newValue);
				return;
			case ContentPackage.CONTENT__CONTENT_NAME:
				setContentName((String)newValue);
				return;
			case ContentPackage.CONTENT__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case ContentPackage.CONTENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ContentPackage.CONTENT__LAST_MODIFIED_DATE:
				setLastModifiedDate((Date)newValue);
				return;
			case ContentPackage.CONTENT__LOCALE_STRING:
				setLocaleString((String)newValue);
				return;
			case ContentPackage.CONTENT__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case ContentPackage.CONTENT__CONTENT_TYPE_ID:
				setContentTypeId((ContentType)newValue);
				return;
			case ContentPackage.CONTENT__DATA_RESOURCE_ID:
				setDataResourceId((DataResource)newValue);
				return;
			case ContentPackage.CONTENT__TEMPLATE_DATA_RESOURCE_ID:
				setTemplateDataResourceId((DataResource)newValue);
				return;
			case ContentPackage.CONTENT__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case ContentPackage.CONTENT__PRIVILEGE_ENUM_ID:
				setPrivilegeEnumId((Enumeration)newValue);
				return;
			case ContentPackage.CONTENT__CUSTOM_METHOD_ID:
				setCustomMethodId((CustomMethod)newValue);
				return;
			case ContentPackage.CONTENT__MIME_TYPE_ID:
				setMimeTypeId((MimeType)newValue);
				return;
			case ContentPackage.CONTENT__CHARACTER_SET_ID:
				setCharacterSetId((CharacterSet)newValue);
				return;
			case ContentPackage.CONTENT__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((UserLogin)newValue);
				return;
			case ContentPackage.CONTENT__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((UserLogin)newValue);
				return;
			case ContentPackage.CONTENT__DATA_SOURCE_ID:
				setDataSourceId((DataSource)newValue);
				return;
			case ContentPackage.CONTENT__DECORATOR_CONTENT_ID:
				setDecoratorContentId((Content)newValue);
				return;
			case ContentPackage.CONTENT__OWNER_CONTENT_ID:
				setOwnerContentId((Content)newValue);
				return;
			case ContentPackage.CONTENT__INSTANCE_OF_CONTENT_ID:
				setInstanceOfContentId((Content)newValue);
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
			case ContentPackage.CONTENT__CHILD_BRANCH_COUNT:
				setChildBranchCount(CHILD_BRANCH_COUNT_EDEFAULT);
				return;
			case ContentPackage.CONTENT__CHILD_LEAF_COUNT:
				setChildLeafCount(CHILD_LEAF_COUNT_EDEFAULT);
				return;
			case ContentPackage.CONTENT__CONTENT_NAME:
				setContentName(CONTENT_NAME_EDEFAULT);
				return;
			case ContentPackage.CONTENT__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case ContentPackage.CONTENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ContentPackage.CONTENT__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
				return;
			case ContentPackage.CONTENT__LOCALE_STRING:
				setLocaleString(LOCALE_STRING_EDEFAULT);
				return;
			case ContentPackage.CONTENT__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case ContentPackage.CONTENT__CONTENT_TYPE_ID:
				setContentTypeId((ContentType)null);
				return;
			case ContentPackage.CONTENT__DATA_RESOURCE_ID:
				setDataResourceId((DataResource)null);
				return;
			case ContentPackage.CONTENT__TEMPLATE_DATA_RESOURCE_ID:
				setTemplateDataResourceId((DataResource)null);
				return;
			case ContentPackage.CONTENT__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case ContentPackage.CONTENT__PRIVILEGE_ENUM_ID:
				setPrivilegeEnumId((Enumeration)null);
				return;
			case ContentPackage.CONTENT__CUSTOM_METHOD_ID:
				setCustomMethodId((CustomMethod)null);
				return;
			case ContentPackage.CONTENT__MIME_TYPE_ID:
				setMimeTypeId((MimeType)null);
				return;
			case ContentPackage.CONTENT__CHARACTER_SET_ID:
				setCharacterSetId((CharacterSet)null);
				return;
			case ContentPackage.CONTENT__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((UserLogin)null);
				return;
			case ContentPackage.CONTENT__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((UserLogin)null);
				return;
			case ContentPackage.CONTENT__DATA_SOURCE_ID:
				setDataSourceId((DataSource)null);
				return;
			case ContentPackage.CONTENT__DECORATOR_CONTENT_ID:
				setDecoratorContentId((Content)null);
				return;
			case ContentPackage.CONTENT__OWNER_CONTENT_ID:
				setOwnerContentId((Content)null);
				return;
			case ContentPackage.CONTENT__INSTANCE_OF_CONTENT_ID:
				setInstanceOfContentId((Content)null);
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
			case ContentPackage.CONTENT__CHILD_BRANCH_COUNT:
				return childBranchCount != CHILD_BRANCH_COUNT_EDEFAULT;
			case ContentPackage.CONTENT__CHILD_LEAF_COUNT:
				return childLeafCount != CHILD_LEAF_COUNT_EDEFAULT;
			case ContentPackage.CONTENT__CONTENT_NAME:
				return CONTENT_NAME_EDEFAULT == null ? contentName != null : !CONTENT_NAME_EDEFAULT.equals(contentName);
			case ContentPackage.CONTENT__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case ContentPackage.CONTENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ContentPackage.CONTENT__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case ContentPackage.CONTENT__LOCALE_STRING:
				return LOCALE_STRING_EDEFAULT == null ? localeString != null : !LOCALE_STRING_EDEFAULT.equals(localeString);
			case ContentPackage.CONTENT__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case ContentPackage.CONTENT__CONTENT_TYPE_ID:
				return contentTypeId != null;
			case ContentPackage.CONTENT__DATA_RESOURCE_ID:
				return dataResourceId != null;
			case ContentPackage.CONTENT__TEMPLATE_DATA_RESOURCE_ID:
				return templateDataResourceId != null;
			case ContentPackage.CONTENT__STATUS_ID:
				return statusId != null;
			case ContentPackage.CONTENT__PRIVILEGE_ENUM_ID:
				return privilegeEnumId != null;
			case ContentPackage.CONTENT__CUSTOM_METHOD_ID:
				return customMethodId != null;
			case ContentPackage.CONTENT__MIME_TYPE_ID:
				return mimeTypeId != null;
			case ContentPackage.CONTENT__CHARACTER_SET_ID:
				return characterSetId != null;
			case ContentPackage.CONTENT__CREATED_BY_USER_LOGIN:
				return createdByUserLogin != null;
			case ContentPackage.CONTENT__LAST_MODIFIED_BY_USER_LOGIN:
				return lastModifiedByUserLogin != null;
			case ContentPackage.CONTENT__DATA_SOURCE_ID:
				return dataSourceId != null;
			case ContentPackage.CONTENT__DECORATOR_CONTENT_ID:
				return decoratorContentId != null;
			case ContentPackage.CONTENT__OWNER_CONTENT_ID:
				return ownerContentId != null;
			case ContentPackage.CONTENT__INSTANCE_OF_CONTENT_ID:
				return instanceOfContentId != null;
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
		result.append(", childBranchCount: ");
		result.append(childBranchCount);
		result.append(", childLeafCount: ");
		result.append(childLeafCount);
		result.append(", contentName: ");
		result.append(contentName);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(", description: ");
		result.append(description);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", localeString: ");
		result.append(localeString);
		result.append(", serviceName: ");
		result.append(serviceName);
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
