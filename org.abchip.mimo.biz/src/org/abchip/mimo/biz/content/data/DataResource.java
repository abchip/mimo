/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

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
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getDataResourceName <em>Data Resource Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getDataResourceTypeId <em>Data Resource Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getDataSourceId <em>Data Source Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getDataTemplateTypeId <em>Data Template Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#isIsPublic <em>Is Public</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getLocaleString <em>Locale String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getMimeTypeId <em>Mime Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getObjectInfo <em>Object Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getRelatedDetailId <em>Related Detail Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getSurveyId <em>Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getSurveyResponseId <em>Survey Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getDataResourceAttributes <em>Data Resource Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getDataResourceMetaDatas <em>Data Resource Meta Datas</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getDataResourcePurposes <em>Data Resource Purposes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.DataResource#getProductFeatureDataResources <em>Product Feature Data Resources</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource()
 * @model
 * @generated
 */
public interface DataResource extends BizEntityTyped<DataResourceType> {
	/**
	 * Returns the value of the '<em><b>Character Set Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Character Set Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Set Id</em>' attribute.
	 * @see #setCharacterSetId(String)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_CharacterSetId()
	 * @model annotation="mimo-ent-domain frame='CharacterSet'"
	 * @generated
	 */
	String getCharacterSetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getCharacterSetId <em>Character Set Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Set Id</em>' attribute.
	 * @see #getCharacterSetId()
	 * @generated
	 */
	void setCharacterSetId(String value);

	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' attribute.
	 * @see #setCreatedByUserLogin(String)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_CreatedByUserLogin()
	 * @model annotation="mimo-ent-domain frame='UserLogin'"
	 * @generated
	 */
	String getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getCreatedByUserLogin <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' attribute.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(String value);

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
	 * Returns the value of the '<em><b>Data Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Category Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Category Id</em>' attribute.
	 * @see #setDataCategoryId(String)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_DataCategoryId()
	 * @model annotation="mimo-ent-domain frame='DataCategory'"
	 * @generated
	 */
	String getDataCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getDataCategoryId <em>Data Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Category Id</em>' attribute.
	 * @see #getDataCategoryId()
	 * @generated
	 */
	void setDataCategoryId(String value);

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
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='DataResource'"
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
	 * @model
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
	 * Returns the value of the '<em><b>Data Resource Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Resource Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource Type Id</em>' attribute.
	 * @see #setDataResourceTypeId(String)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_DataResourceTypeId()
	 * @model annotation="mimo-ent-domain frame='DataResourceType'"
	 * @generated
	 */
	String getDataResourceTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getDataResourceTypeId <em>Data Resource Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Resource Type Id</em>' attribute.
	 * @see #getDataResourceTypeId()
	 * @generated
	 */
	void setDataResourceTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Data Source Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source Id</em>' attribute.
	 * @see #setDataSourceId(String)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_DataSourceId()
	 * @model annotation="mimo-ent-domain frame='DataSource'"
	 * @generated
	 */
	String getDataSourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getDataSourceId <em>Data Source Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source Id</em>' attribute.
	 * @see #getDataSourceId()
	 * @generated
	 */
	void setDataSourceId(String value);

	/**
	 * Returns the value of the '<em><b>Data Template Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Template Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Template Type Id</em>' attribute.
	 * @see #setDataTemplateTypeId(String)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_DataTemplateTypeId()
	 * @model annotation="mimo-ent-domain frame='DataTemplateType'"
	 * @generated
	 */
	String getDataTemplateTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getDataTemplateTypeId <em>Data Template Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Template Type Id</em>' attribute.
	 * @see #getDataTemplateTypeId()
	 * @generated
	 */
	void setDataTemplateTypeId(String value);

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
	 * @model
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
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #setLastModifiedByUserLogin(String)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_LastModifiedByUserLogin()
	 * @model annotation="mimo-ent-domain frame='UserLogin'"
	 * @generated
	 */
	String getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(String value);

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
	 * @model
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
	 * Returns the value of the '<em><b>Mime Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type Id</em>' attribute.
	 * @see #setMimeTypeId(String)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_MimeTypeId()
	 * @model annotation="mimo-ent-domain frame='MimeType'"
	 * @generated
	 */
	String getMimeTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getMimeTypeId <em>Mime Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type Id</em>' attribute.
	 * @see #getMimeTypeId()
	 * @generated
	 */
	void setMimeTypeId(String value);

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
	 * @model
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
	 * @model
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
	 * Returns the value of the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' attribute.
	 * @see #setStatusId(String)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_StatusId()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

	/**
	 * Returns the value of the '<em><b>Survey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Id</em>' attribute.
	 * @see #setSurveyId(String)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_SurveyId()
	 * @model annotation="mimo-ent-domain frame='Survey'"
	 * @generated
	 */
	String getSurveyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getSurveyId <em>Survey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Id</em>' attribute.
	 * @see #getSurveyId()
	 * @generated
	 */
	void setSurveyId(String value);

	/**
	 * Returns the value of the '<em><b>Survey Response Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Response Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Response Id</em>' attribute.
	 * @see #setSurveyResponseId(String)
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_SurveyResponseId()
	 * @model annotation="mimo-ent-domain frame='SurveyResponse'"
	 * @generated
	 */
	String getSurveyResponseId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.data.DataResource#getSurveyResponseId <em>Survey Response Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Response Id</em>' attribute.
	 * @see #getSurveyResponseId()
	 * @generated
	 */
	void setSurveyResponseId(String value);

	/**
	 * Returns the value of the '<em><b>Data Resource Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Resource Attributes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource Attributes</em>' attribute list.
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_DataResourceAttributes()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='DataResourceAttribute'"
	 * @generated
	 */
	List<String> getDataResourceAttributes();

	/**
	 * Returns the value of the '<em><b>Data Resource Meta Datas</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Resource Meta Datas</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource Meta Datas</em>' attribute list.
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_DataResourceMetaDatas()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='DataResourceMetaData'"
	 * @generated
	 */
	List<String> getDataResourceMetaDatas();

	/**
	 * Returns the value of the '<em><b>Data Resource Purposes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Resource Purposes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource Purposes</em>' attribute list.
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_DataResourcePurposes()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='DataResourcePurpose'"
	 * @generated
	 */
	List<String> getDataResourcePurposes();

	/**
	 * Returns the value of the '<em><b>Product Feature Data Resources</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Feature Data Resources</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Data Resources</em>' attribute list.
	 * @see org.abchip.mimo.biz.content.data.DataPackage#getDataResource_ProductFeatureDataResources()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductFeatureDataResource'"
	 * @generated
	 */
	List<String> getProductFeatureDataResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Content' route='dataResourceId'"
	 * @generated
	 */
	List<String> contents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Content' route='templateDataResourceId'"
	 * @generated
	 */
	List<String> templateContents();

} // DataResource
