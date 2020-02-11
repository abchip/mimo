/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.common.datasource.DataSource;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.content.survey.Survey;
import org.abchip.mimo.biz.content.survey.SurveyResponse;
import org.abchip.mimo.biz.product.feature.ProductFeatureDataResource;
import org.abchip.mimo.biz.security.login.UserLogin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getDataResourceId <em>Data Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getCharacterSetId <em>Character Set Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getDataCategoryId <em>Data Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getDataResourceAttributes <em>Data Resource Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getDataResourceMetaDatas <em>Data Resource Meta Datas</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getDataResourceName <em>Data Resource Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getDataResourcePurposes <em>Data Resource Purposes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getDataResourceTypeId <em>Data Resource Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getDataSourceId <em>Data Source Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getDataTemplateTypeId <em>Data Template Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#isIsPublic <em>Is Public</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getLocaleString <em>Locale String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getMimeTypeId <em>Mime Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getObjectInfo <em>Object Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getProductFeatureDataResources <em>Product Feature Data Resources</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getRelatedDetailId <em>Related Detail Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getSurveyId <em>Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getSurveyResponseId <em>Survey Response Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource()
 * @model annotation="mimo-ent-frame title='Data Object'"
 * @generated
 */
public interface DataResource extends BizEntityTyped<DataResourceType> {
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
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_CharacterSetId()
	 * @model keys="characterSetId"
	 * @generated
	 */
	CharacterSet getCharacterSetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getCharacterSetId <em>Character Set Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Set Id</em>' reference.
	 * @see #getCharacterSetId()
	 * @generated
	 */
	void setCharacterSetId(CharacterSet value);

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
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_CreatedByUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getCreatedByUserLogin <em>Created By User Login</em>}' reference.
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
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Data Category Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Category Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Category Id</em>' reference.
	 * @see #setDataCategoryId(DataCategory)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_DataCategoryId()
	 * @model keys="dataCategoryId"
	 * @generated
	 */
	DataCategory getDataCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getDataCategoryId <em>Data Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Category Id</em>' reference.
	 * @see #getDataCategoryId()
	 * @generated
	 */
	void setDataCategoryId(DataCategory value);

	/**
	 * Returns the value of the '<em><b>Data Resource Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.content.data.DataResourceAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Resource Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_DataResourceAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<DataResourceAttribute> getDataResourceAttributes();

	/**
	 * Returns the value of the '<em><b>Data Resource Meta Datas</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.content.data.DataResourceMetaData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Resource Meta Datas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource Meta Datas</em>' reference list.
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_DataResourceMetaDatas()
	 * @model derived="true"
	 * @generated
	 */
	List<DataResourceMetaData> getDataResourceMetaDatas();

	/**
	 * Returns the value of the '<em><b>Data Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Resource Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource Id</em>' attribute.
	 * @see #setDataResourceId(String)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_DataResourceId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getDataResourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getDataResourceId <em>Data Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Resource Id</em>' attribute.
	 * @see #getDataResourceId()
	 * @generated
	 */
	void setDataResourceId(String value);

	/**
	 * Returns the value of the '<em><b>Data Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Resource Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource Name</em>' attribute.
	 * @see #setDataResourceName(String)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_DataResourceName()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getDataResourceName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getDataResourceName <em>Data Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Resource Name</em>' attribute.
	 * @see #getDataResourceName()
	 * @generated
	 */
	void setDataResourceName(String value);

	/**
	 * Returns the value of the '<em><b>Data Resource Purposes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.content.data.DataResourcePurpose}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Resource Purposes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource Purposes</em>' reference list.
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_DataResourcePurposes()
	 * @model derived="true"
	 * @generated
	 */
	List<DataResourcePurpose> getDataResourcePurposes();

	/**
	 * Returns the value of the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Public</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Public</em>' attribute.
	 * @see #setIsPublic(boolean)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_IsPublic()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='If this is set to Y then anyone can download it, otherwise the download is restricted.'"
	 * @generated
	 */
	boolean isIsPublic();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#isIsPublic <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Public</em>' attribute.
	 * @see #isIsPublic()
	 * @generated
	 */
	void setIsPublic(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Resource Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Resource Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource Type Id</em>' reference.
	 * @see #setDataResourceTypeId(DataResourceType)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_DataResourceTypeId()
	 * @model keys="dataResourceTypeId"
	 * @generated
	 */
	DataResourceType getDataResourceTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getDataResourceTypeId <em>Data Resource Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Resource Type Id</em>' reference.
	 * @see #getDataResourceTypeId()
	 * @generated
	 */
	void setDataResourceTypeId(DataResourceType value);

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
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_DataSourceId()
	 * @model keys="dataSourceId"
	 * @generated
	 */
	DataSource getDataSourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getDataSourceId <em>Data Source Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source Id</em>' reference.
	 * @see #getDataSourceId()
	 * @generated
	 */
	void setDataSourceId(DataSource value);

	/**
	 * Returns the value of the '<em><b>Data Template Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Template Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Template Type Id</em>' reference.
	 * @see #setDataTemplateTypeId(DataTemplateType)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_DataTemplateTypeId()
	 * @model keys="dataTemplateTypeId"
	 * @generated
	 */
	DataTemplateType getDataTemplateTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getDataTemplateTypeId <em>Data Template Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Template Type Id</em>' reference.
	 * @see #getDataTemplateTypeId()
	 * @generated
	 */
	void setDataTemplateTypeId(DataTemplateType value);

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
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_LastModifiedByUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' reference.
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
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_LocaleString()
	 * @model annotation="mimo-ent-format length='10'"
	 * @generated
	 */
	String getLocaleString();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getLocaleString <em>Locale String</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_MimeTypeId()
	 * @model keys="mimeTypeId"
	 * @generated
	 */
	MimeType getMimeTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getMimeTypeId <em>Mime Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type Id</em>' reference.
	 * @see #getMimeTypeId()
	 * @generated
	 */
	void setMimeTypeId(MimeType value);

	/**
	 * Returns the value of the '<em><b>Object Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Info</em>' attribute.
	 * @see #setObjectInfo(String)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_ObjectInfo()
	 * @model annotation="mimo-ent-slot help='For Short Text the text goes here.'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getObjectInfo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getObjectInfo <em>Object Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Info</em>' attribute.
	 * @see #getObjectInfo()
	 * @generated
	 */
	void setObjectInfo(String value);

	/**
	 * Returns the value of the '<em><b>Product Feature Data Resources</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.product.feature.ProductFeatureDataResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Feature Data Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Data Resources</em>' reference list.
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_ProductFeatureDataResources()
	 * @model derived="true"
	 * @generated
	 */
	List<ProductFeatureDataResource> getProductFeatureDataResources();

	/**
	 * Returns the value of the '<em><b>Related Detail Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Detail Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Detail Id</em>' attribute.
	 * @see #setRelatedDetailId(String)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_RelatedDetailId()
	 * @model annotation="mimo-ent-slot help='Depending on the dataResourceTypeId this can point to other entities, like: Survey, SurveyResponse, etc.'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getRelatedDetailId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getRelatedDetailId <em>Related Detail Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Detail Id</em>' attribute.
	 * @see #getRelatedDetailId()
	 * @generated
	 */
	void setRelatedDetailId(String value);

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
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_StatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getStatusId <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' reference.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(StatusItem value);

	/**
	 * Returns the value of the '<em><b>Survey Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Id</em>' reference.
	 * @see #setSurveyId(Survey)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_SurveyId()
	 * @model keys="surveyId"
	 * @generated
	 */
	Survey getSurveyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getSurveyId <em>Survey Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Id</em>' reference.
	 * @see #getSurveyId()
	 * @generated
	 */
	void setSurveyId(Survey value);

	/**
	 * Returns the value of the '<em><b>Survey Response Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Response Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Response Id</em>' reference.
	 * @see #setSurveyResponseId(SurveyResponse)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_SurveyResponseId()
	 * @model keys="surveyResponseId"
	 * @generated
	 */
	SurveyResponse getSurveyResponseId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getSurveyResponseId <em>Survey Response Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Response Id</em>' reference.
	 * @see #getSurveyResponseId()
	 * @generated
	 */
	void setSurveyResponseId(SurveyResponse value);

} // DataResource
