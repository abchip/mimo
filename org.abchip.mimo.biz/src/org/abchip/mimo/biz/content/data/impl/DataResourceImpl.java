/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.common.datasource.DataSource;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.content.data.CharacterSet;
import org.abchip.mimo.biz.content.data.DataCategory;
import org.abchip.mimo.biz.content.data.DataPackage;
import org.abchip.mimo.biz.content.data.DataResource;
import org.abchip.mimo.biz.content.data.DataResourceAttribute;
import org.abchip.mimo.biz.content.data.DataResourceMetaData;
import org.abchip.mimo.biz.content.data.DataResourcePurpose;
import org.abchip.mimo.biz.content.data.DataResourceType;
import org.abchip.mimo.biz.content.data.DataTemplateType;
import org.abchip.mimo.biz.content.data.MimeType;
import org.abchip.mimo.biz.content.survey.Survey;
import org.abchip.mimo.biz.content.survey.SurveyResponse;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.feature.ProductFeatureDataResource;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getDataResourceId <em>Data Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getCharacterSetId <em>Character Set Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getDataCategoryId <em>Data Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getDataResourceAttributes <em>Data Resource Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getDataResourceMetaDatas <em>Data Resource Meta Datas</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getDataResourceName <em>Data Resource Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getDataResourcePurposes <em>Data Resource Purposes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getDataResourceTypeId <em>Data Resource Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getDataSourceId <em>Data Source Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getDataTemplateTypeId <em>Data Template Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#isIsPublic <em>Is Public</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getLocaleString <em>Locale String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getMimeTypeId <em>Mime Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getObjectInfo <em>Object Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getProductFeatureDataResources <em>Product Feature Data Resources</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getRelatedDetailId <em>Related Detail Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getSurveyId <em>Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getSurveyResponseId <em>Survey Response Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataResourceImpl extends BizEntityTypedImpl<DataResourceType> implements DataResource {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.DATA_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterSet getCharacterSetId() {
		return (CharacterSet)eGet(DataPackage.Literals.DATA_RESOURCE__CHARACTER_SET_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharacterSetId(CharacterSet newCharacterSetId) {
		eSet(DataPackage.Literals.DATA_RESOURCE__CHARACTER_SET_ID, newCharacterSetId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getCreatedByUserLogin() {
		return (UserLogin)eGet(DataPackage.Literals.DATA_RESOURCE__CREATED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(UserLogin newCreatedByUserLogin) {
		eSet(DataPackage.Literals.DATA_RESOURCE__CREATED_BY_USER_LOGIN, newCreatedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return (Date)eGet(DataPackage.Literals.DATA_RESOURCE__CREATED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		eSet(DataPackage.Literals.DATA_RESOURCE__CREATED_DATE, newCreatedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCategory getDataCategoryId() {
		return (DataCategory)eGet(DataPackage.Literals.DATA_RESOURCE__DATA_CATEGORY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataCategoryId(DataCategory newDataCategoryId) {
		eSet(DataPackage.Literals.DATA_RESOURCE__DATA_CATEGORY_ID, newDataCategoryId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<DataResourceAttribute> getDataResourceAttributes() {
		return (List<DataResourceAttribute>)eGet(DataPackage.Literals.DATA_RESOURCE__DATA_RESOURCE_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<DataResourceMetaData> getDataResourceMetaDatas() {
		return (List<DataResourceMetaData>)eGet(DataPackage.Literals.DATA_RESOURCE__DATA_RESOURCE_META_DATAS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataResourceId() {
		return (String)eGet(DataPackage.Literals.DATA_RESOURCE__DATA_RESOURCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataResourceId(String newDataResourceId) {
		eSet(DataPackage.Literals.DATA_RESOURCE__DATA_RESOURCE_ID, newDataResourceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataResourceName() {
		return (String)eGet(DataPackage.Literals.DATA_RESOURCE__DATA_RESOURCE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataResourceName(String newDataResourceName) {
		eSet(DataPackage.Literals.DATA_RESOURCE__DATA_RESOURCE_NAME, newDataResourceName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<DataResourcePurpose> getDataResourcePurposes() {
		return (List<DataResourcePurpose>)eGet(DataPackage.Literals.DATA_RESOURCE__DATA_RESOURCE_PURPOSES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsPublic() {
		return (Boolean)eGet(DataPackage.Literals.DATA_RESOURCE__IS_PUBLIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPublic(boolean newIsPublic) {
		eSet(DataPackage.Literals.DATA_RESOURCE__IS_PUBLIC, newIsPublic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataResourceType getDataResourceTypeId() {
		return (DataResourceType)eGet(DataPackage.Literals.DATA_RESOURCE__DATA_RESOURCE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataResourceTypeId(DataResourceType newDataResourceTypeId) {
		eSet(DataPackage.Literals.DATA_RESOURCE__DATA_RESOURCE_TYPE_ID, newDataResourceTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSource getDataSourceId() {
		return (DataSource)eGet(DataPackage.Literals.DATA_RESOURCE__DATA_SOURCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataSourceId(DataSource newDataSourceId) {
		eSet(DataPackage.Literals.DATA_RESOURCE__DATA_SOURCE_ID, newDataSourceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataTemplateType getDataTemplateTypeId() {
		return (DataTemplateType)eGet(DataPackage.Literals.DATA_RESOURCE__DATA_TEMPLATE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataTemplateTypeId(DataTemplateType newDataTemplateTypeId) {
		eSet(DataPackage.Literals.DATA_RESOURCE__DATA_TEMPLATE_TYPE_ID, newDataTemplateTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getLastModifiedByUserLogin() {
		return (UserLogin)eGet(DataPackage.Literals.DATA_RESOURCE__LAST_MODIFIED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(UserLogin newLastModifiedByUserLogin) {
		eSet(DataPackage.Literals.DATA_RESOURCE__LAST_MODIFIED_BY_USER_LOGIN, newLastModifiedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return (Date)eGet(DataPackage.Literals.DATA_RESOURCE__LAST_MODIFIED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		eSet(DataPackage.Literals.DATA_RESOURCE__LAST_MODIFIED_DATE, newLastModifiedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocaleString() {
		return (String)eGet(DataPackage.Literals.DATA_RESOURCE__LOCALE_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocaleString(String newLocaleString) {
		eSet(DataPackage.Literals.DATA_RESOURCE__LOCALE_STRING, newLocaleString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MimeType getMimeTypeId() {
		return (MimeType)eGet(DataPackage.Literals.DATA_RESOURCE__MIME_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMimeTypeId(MimeType newMimeTypeId) {
		eSet(DataPackage.Literals.DATA_RESOURCE__MIME_TYPE_ID, newMimeTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObjectInfo() {
		return (String)eGet(DataPackage.Literals.DATA_RESOURCE__OBJECT_INFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjectInfo(String newObjectInfo) {
		eSet(DataPackage.Literals.DATA_RESOURCE__OBJECT_INFO, newObjectInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductFeatureDataResource> getProductFeatureDataResources() {
		return (List<ProductFeatureDataResource>)eGet(DataPackage.Literals.DATA_RESOURCE__PRODUCT_FEATURE_DATA_RESOURCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRelatedDetailId() {
		return (String)eGet(DataPackage.Literals.DATA_RESOURCE__RELATED_DETAIL_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelatedDetailId(String newRelatedDetailId) {
		eSet(DataPackage.Literals.DATA_RESOURCE__RELATED_DETAIL_ID, newRelatedDetailId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		return (StatusItem)eGet(DataPackage.Literals.DATA_RESOURCE__STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		eSet(DataPackage.Literals.DATA_RESOURCE__STATUS_ID, newStatusId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Survey getSurveyId() {
		return (Survey)eGet(DataPackage.Literals.DATA_RESOURCE__SURVEY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyId(Survey newSurveyId) {
		eSet(DataPackage.Literals.DATA_RESOURCE__SURVEY_ID, newSurveyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyResponse getSurveyResponseId() {
		return (SurveyResponse)eGet(DataPackage.Literals.DATA_RESOURCE__SURVEY_RESPONSE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyResponseId(SurveyResponse newSurveyResponseId) {
		eSet(DataPackage.Literals.DATA_RESOURCE__SURVEY_RESPONSE_ID, newSurveyResponseId);
	}

} //DataResourceImpl
