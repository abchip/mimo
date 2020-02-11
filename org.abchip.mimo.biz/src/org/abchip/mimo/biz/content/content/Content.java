/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.content;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.common.datasource.DataSource;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.method.CustomMethod;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.content.data.CharacterSet;
import org.abchip.mimo.biz.content.data.DataResource;
import org.abchip.mimo.biz.content.data.MimeType;
import org.abchip.mimo.biz.security.login.UserLogin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getCharacterSetId <em>Character Set Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getChildBranchCount <em>Child Branch Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getChildLeafCount <em>Child Leaf Count</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getContentAttributes <em>Content Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getContentKeywords <em>Content Keywords</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getContentMetaDatas <em>Content Meta Datas</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getContentName <em>Content Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getContentPurposes <em>Content Purposes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getContentRevisions <em>Content Revisions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getContentTypeId <em>Content Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getCustomMethodId <em>Custom Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getDataResourceId <em>Data Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getDataSourceId <em>Data Source Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getDecoratorContentId <em>Decorator Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getInstanceOfContentId <em>Instance Of Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getLocaleString <em>Locale String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getMimeTypeId <em>Mime Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getOwnerContentId <em>Owner Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getPrivilegeEnumId <em>Privilege Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.content.Content#getTemplateDataResourceId <em>Template Data Resource Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent()
 * @model annotation="mimo-ent-frame dictionary='ContentEntityLabels' formula='description'"
 * @generated
 */
public interface Content extends BizEntityTyped<ContentType> {
	/**
	 * Returns the value of the '<em><b>Character Set Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Character Set Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Set Id</em>' reference.
	 * @see #setCharacterSetId(CharacterSet)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_CharacterSetId()
	 * @model keys="characterSetId"
	 * @generated
	 */
	CharacterSet getCharacterSetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.Content#getCharacterSetId <em>Character Set Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Set Id</em>' reference.
	 * @see #getCharacterSetId()
	 * @generated
	 */
	void setCharacterSetId(CharacterSet value);

	/**
	 * Returns the value of the '<em><b>Child Branch Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Branch Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Branch Count</em>' attribute.
	 * @see #setChildBranchCount(long)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_ChildBranchCount()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getChildBranchCount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.Content#getChildBranchCount <em>Child Branch Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Branch Count</em>' attribute.
	 * @see #getChildBranchCount()
	 * @generated
	 */
	void setChildBranchCount(long value);

	/**
	 * Returns the value of the '<em><b>Child Leaf Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Leaf Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Leaf Count</em>' attribute.
	 * @see #setChildLeafCount(long)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_ChildLeafCount()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getChildLeafCount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.Content#getChildLeafCount <em>Child Leaf Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Leaf Count</em>' attribute.
	 * @see #getChildLeafCount()
	 * @generated
	 */
	void setChildLeafCount(long value);

	/**
	 * Returns the value of the '<em><b>Content Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.content.content.ContentAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_ContentAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<ContentAttribute> getContentAttributes();

	/**
	 * Returns the value of the '<em><b>Content Keywords</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.content.content.ContentKeyword}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Keywords</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Keywords</em>' reference list.
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_ContentKeywords()
	 * @model derived="true"
	 * @generated
	 */
	List<ContentKeyword> getContentKeywords();

	/**
	 * Returns the value of the '<em><b>Content Meta Datas</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.content.content.ContentMetaData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Meta Datas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Meta Datas</em>' reference list.
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_ContentMetaDatas()
	 * @model derived="true"
	 * @generated
	 */
	List<ContentMetaData> getContentMetaDatas();

	/**
	 * Returns the value of the '<em><b>Content Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Id</em>' attribute.
	 * @see #setContentId(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_ContentId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.Content#getContentId <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Id</em>' attribute.
	 * @see #getContentId()
	 * @generated
	 */
	void setContentId(String value);

	/**
	 * Returns the value of the '<em><b>Content Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Name</em>' attribute.
	 * @see #setContentName(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_ContentName()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getContentName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.Content#getContentName <em>Content Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Name</em>' attribute.
	 * @see #getContentName()
	 * @generated
	 */
	void setContentName(String value);

	/**
	 * Returns the value of the '<em><b>Content Purposes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.content.content.ContentPurpose}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Purposes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Purposes</em>' reference list.
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_ContentPurposes()
	 * @model derived="true"
	 * @generated
	 */
	List<ContentPurpose> getContentPurposes();

	/**
	 * Returns the value of the '<em><b>Content Revisions</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.content.content.ContentRevision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Revisions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Revisions</em>' reference list.
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_ContentRevisions()
	 * @model derived="true"
	 * @generated
	 */
	List<ContentRevision> getContentRevisions();

	/**
	 * Returns the value of the '<em><b>Content Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type Id</em>' reference.
	 * @see #setContentTypeId(ContentType)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_ContentTypeId()
	 * @model keys="contentTypeId"
	 * @generated
	 */
	ContentType getContentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.Content#getContentTypeId <em>Content Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type Id</em>' reference.
	 * @see #getContentTypeId()
	 * @generated
	 */
	void setContentTypeId(ContentType value);

	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' reference.
	 * @see #setCreatedByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_CreatedByUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.Content#getCreatedByUserLogin <em>Created By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' reference.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.Content#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Custom Method Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Method Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Method Id</em>' reference.
	 * @see #setCustomMethodId(CustomMethod)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_CustomMethodId()
	 * @model keys="customMethodId"
	 * @generated
	 */
	CustomMethod getCustomMethodId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.Content#getCustomMethodId <em>Custom Method Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Method Id</em>' reference.
	 * @see #getCustomMethodId()
	 * @generated
	 */
	void setCustomMethodId(CustomMethod value);

	/**
	 * Returns the value of the '<em><b>Data Resource Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Resource Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource Id</em>' reference.
	 * @see #setDataResourceId(DataResource)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_DataResourceId()
	 * @model keys="dataResourceId"
	 * @generated
	 */
	DataResource getDataResourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.Content#getDataResourceId <em>Data Resource Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Resource Id</em>' reference.
	 * @see #getDataResourceId()
	 * @generated
	 */
	void setDataResourceId(DataResource value);

	/**
	 * Returns the value of the '<em><b>Data Source Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source Id</em>' reference.
	 * @see #setDataSourceId(DataSource)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_DataSourceId()
	 * @model keys="dataSourceId"
	 * @generated
	 */
	DataSource getDataSourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.Content#getDataSourceId <em>Data Source Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source Id</em>' reference.
	 * @see #getDataSourceId()
	 * @generated
	 */
	void setDataSourceId(DataSource value);

	/**
	 * Returns the value of the '<em><b>Decorator Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decorator Content Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decorator Content Id</em>' reference.
	 * @see #setDecoratorContentId(Content)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_DecoratorContentId()
	 * @model keys="contentId"
	 * @generated
	 */
	Content getDecoratorContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.Content#getDecoratorContentId <em>Decorator Content Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decorator Content Id</em>' reference.
	 * @see #getDecoratorContentId()
	 * @generated
	 */
	void setDecoratorContentId(Content value);

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
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.Content#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Instance Of Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Of Content Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Of Content Id</em>' reference.
	 * @see #setInstanceOfContentId(Content)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_InstanceOfContentId()
	 * @model keys="contentId"
	 * @generated
	 */
	Content getInstanceOfContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.Content#getInstanceOfContentId <em>Instance Of Content Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Of Content Id</em>' reference.
	 * @see #getInstanceOfContentId()
	 * @generated
	 */
	void setInstanceOfContentId(Content value);

	/**
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' reference.
	 * @see #setLastModifiedByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_LastModifiedByUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.Content#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' reference.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #setLastModifiedDate(Date)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.Content#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Locale String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locale String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locale String</em>' attribute.
	 * @see #setLocaleString(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_LocaleString()
	 * @model annotation="mimo-ent-format length='10'"
	 * @generated
	 */
	String getLocaleString();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.Content#getLocaleString <em>Locale String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locale String</em>' attribute.
	 * @see #getLocaleString()
	 * @generated
	 */
	void setLocaleString(String value);

	/**
	 * Returns the value of the '<em><b>Mime Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type Id</em>' reference.
	 * @see #setMimeTypeId(MimeType)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_MimeTypeId()
	 * @model keys="mimeTypeId"
	 * @generated
	 */
	MimeType getMimeTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.Content#getMimeTypeId <em>Mime Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type Id</em>' reference.
	 * @see #getMimeTypeId()
	 * @generated
	 */
	void setMimeTypeId(MimeType value);

	/**
	 * Returns the value of the '<em><b>Owner Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Content Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Content Id</em>' reference.
	 * @see #setOwnerContentId(Content)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_OwnerContentId()
	 * @model keys="contentId"
	 *        annotation="mimo-ent-slot help='Used for permissions checking'"
	 * @generated
	 */
	Content getOwnerContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.Content#getOwnerContentId <em>Owner Content Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Content Id</em>' reference.
	 * @see #getOwnerContentId()
	 * @generated
	 */
	void setOwnerContentId(Content value);

	/**
	 * Returns the value of the '<em><b>Privilege Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Privilege Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privilege Enum Id</em>' reference.
	 * @see #setPrivilegeEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_PrivilegeEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getPrivilegeEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.Content#getPrivilegeEnumId <em>Privilege Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Privilege Enum Id</em>' reference.
	 * @see #getPrivilegeEnumId()
	 * @generated
	 */
	void setPrivilegeEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_ServiceName()
	 * @model annotation="mimo-ent-slot help='Deprecated : use customMethod pattern instead. Kept for backward compatibility'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.Content#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' reference.
	 * @see #setStatusId(StatusItem)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_StatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.Content#getStatusId <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' reference.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Template Data Resource Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Data Resource Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Data Resource Id</em>' reference.
	 * @see #setTemplateDataResourceId(DataResource)
	 * @see org.abchip.mimo.biz.content.content.ContentPackage#getContent_TemplateDataResourceId()
	 * @model keys="dataResourceId"
	 * @generated
	 */
	DataResource getTemplateDataResourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.content.Content#getTemplateDataResourceId <em>Template Data Resource Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Data Resource Id</em>' reference.
	 * @see #getTemplateDataResourceId()
	 * @generated
	 */
	void setTemplateDataResourceId(DataResource value);

} // Content
