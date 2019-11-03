/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data.impl;

import java.util.Collection;
import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.content.data.DataPackage;
import org.abchip.mimo.biz.content.data.DataResource;
import org.abchip.mimo.biz.content.data.DataResourceType;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

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
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getDataResourceName <em>Data Resource Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getDataResourceTypeId <em>Data Resource Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getDataSourceId <em>Data Source Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getDataTemplateTypeId <em>Data Template Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#isIsPublic <em>Is Public</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getLocaleString <em>Locale String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getMimeTypeId <em>Mime Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getObjectInfo <em>Object Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getRelatedDetailId <em>Related Detail Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getSurveyId <em>Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getSurveyResponseId <em>Survey Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getDataResourceAttributes <em>Data Resource Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getDataResourceMetaDatas <em>Data Resource Meta Datas</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getDataResourcePurposes <em>Data Resource Purposes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getProductFeatureDataResources <em>Product Feature Data Resources</em>}</li>
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
	 * The default value of the '{@link #getDataCategoryId() <em>Data Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCategoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_CATEGORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataCategoryId() <em>Data Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCategoryId()
	 * @generated
	 * @ordered
	 */
	protected String dataCategoryId = DATA_CATEGORY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataResourceName() <em>Data Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_RESOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataResourceName() <em>Data Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceName()
	 * @generated
	 * @ordered
	 */
	protected String dataResourceName = DATA_RESOURCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataResourceTypeId() <em>Data Resource Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_RESOURCE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataResourceTypeId() <em>Data Resource Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceTypeId()
	 * @generated
	 * @ordered
	 */
	protected String dataResourceTypeId = DATA_RESOURCE_TYPE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getDataTemplateTypeId() <em>Data Template Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTemplateTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_TEMPLATE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataTemplateTypeId() <em>Data Template Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTemplateTypeId()
	 * @generated
	 * @ordered
	 */
	protected String dataTemplateTypeId = DATA_TEMPLATE_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPublic() <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPublic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PUBLIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPublic() <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPublic()
	 * @generated
	 * @ordered
	 */
	protected boolean isPublic = IS_PUBLIC_EDEFAULT;

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
	 * The default value of the '{@link #getObjectInfo() <em>Object Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectInfo() <em>Object Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectInfo()
	 * @generated
	 * @ordered
	 */
	protected String objectInfo = OBJECT_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelatedDetailId() <em>Related Detail Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedDetailId()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATED_DETAIL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelatedDetailId() <em>Related Detail Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedDetailId()
	 * @generated
	 * @ordered
	 */
	protected String relatedDetailId = RELATED_DETAIL_ID_EDEFAULT;

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
	 * The default value of the '{@link #getSurveyId() <em>Survey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyId()
	 * @generated
	 * @ordered
	 */
	protected static final String SURVEY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurveyId() <em>Survey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyId()
	 * @generated
	 * @ordered
	 */
	protected String surveyId = SURVEY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSurveyResponseId() <em>Survey Response Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyResponseId()
	 * @generated
	 * @ordered
	 */
	protected static final String SURVEY_RESPONSE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurveyResponseId() <em>Survey Response Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyResponseId()
	 * @generated
	 * @ordered
	 */
	protected String surveyResponseId = SURVEY_RESPONSE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataResourceAttributes() <em>Data Resource Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dataResourceAttributes;

	/**
	 * The cached value of the '{@link #getDataResourceMetaDatas() <em>Data Resource Meta Datas</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceMetaDatas()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dataResourceMetaDatas;

	/**
	 * The cached value of the '{@link #getDataResourcePurposes() <em>Data Resource Purposes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourcePurposes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dataResourcePurposes;

	/**
	 * The cached value of the '{@link #getProductFeatureDataResources() <em>Product Feature Data Resources</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureDataResources()
	 * @generated
	 * @ordered
	 */
	protected EList<String> productFeatureDataResources;

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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE__CHARACTER_SET_ID, oldCharacterSetId, characterSetId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE__CREATED_DATE, oldCreatedDate, createdDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataCategoryId() {
		return dataCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataCategoryId(String newDataCategoryId) {
		String oldDataCategoryId = dataCategoryId;
		dataCategoryId = newDataCategoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE__DATA_CATEGORY_ID, oldDataCategoryId, dataCategoryId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE__DATA_RESOURCE_ID, oldDataResourceId, dataResourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataResourceName() {
		return dataResourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataResourceName(String newDataResourceName) {
		String oldDataResourceName = dataResourceName;
		dataResourceName = newDataResourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE__DATA_RESOURCE_NAME, oldDataResourceName, dataResourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataResourceTypeId() {
		return dataResourceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataResourceTypeId(String newDataResourceTypeId) {
		String oldDataResourceTypeId = dataResourceTypeId;
		dataResourceTypeId = newDataResourceTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE__DATA_RESOURCE_TYPE_ID, oldDataResourceTypeId, dataResourceTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE__DATA_SOURCE_ID, oldDataSourceId, dataSourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataTemplateTypeId() {
		return dataTemplateTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataTemplateTypeId(String newDataTemplateTypeId) {
		String oldDataTemplateTypeId = dataTemplateTypeId;
		dataTemplateTypeId = newDataTemplateTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE__DATA_TEMPLATE_TYPE_ID, oldDataTemplateTypeId, dataTemplateTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsPublic() {
		return isPublic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPublic(boolean newIsPublic) {
		boolean oldIsPublic = isPublic;
		isPublic = newIsPublic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE__IS_PUBLIC, oldIsPublic, isPublic));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE__LAST_MODIFIED_BY_USER_LOGIN, oldLastModifiedByUserLogin, lastModifiedByUserLogin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE__LAST_MODIFIED_DATE, oldLastModifiedDate, lastModifiedDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE__LOCALE_STRING, oldLocaleString, localeString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE__MIME_TYPE_ID, oldMimeTypeId, mimeTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObjectInfo() {
		return objectInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjectInfo(String newObjectInfo) {
		String oldObjectInfo = objectInfo;
		objectInfo = newObjectInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE__OBJECT_INFO, oldObjectInfo, objectInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRelatedDetailId() {
		return relatedDetailId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelatedDetailId(String newRelatedDetailId) {
		String oldRelatedDetailId = relatedDetailId;
		relatedDetailId = newRelatedDetailId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE__RELATED_DETAIL_ID, oldRelatedDetailId, relatedDetailId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurveyId() {
		return surveyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyId(String newSurveyId) {
		String oldSurveyId = surveyId;
		surveyId = newSurveyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE__SURVEY_ID, oldSurveyId, surveyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurveyResponseId() {
		return surveyResponseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyResponseId(String newSurveyResponseId) {
		String oldSurveyResponseId = surveyResponseId;
		surveyResponseId = newSurveyResponseId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_RESOURCE__SURVEY_RESPONSE_ID, oldSurveyResponseId, surveyResponseId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getDataResourceAttributes() {
		if (dataResourceAttributes == null) {
			dataResourceAttributes = new EDataTypeUniqueEList<String>(String.class, this, DataPackage.DATA_RESOURCE__DATA_RESOURCE_ATTRIBUTES);
		}
		return dataResourceAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getDataResourceMetaDatas() {
		if (dataResourceMetaDatas == null) {
			dataResourceMetaDatas = new EDataTypeUniqueEList<String>(String.class, this, DataPackage.DATA_RESOURCE__DATA_RESOURCE_META_DATAS);
		}
		return dataResourceMetaDatas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getDataResourcePurposes() {
		if (dataResourcePurposes == null) {
			dataResourcePurposes = new EDataTypeUniqueEList<String>(String.class, this, DataPackage.DATA_RESOURCE__DATA_RESOURCE_PURPOSES);
		}
		return dataResourcePurposes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getProductFeatureDataResources() {
		if (productFeatureDataResources == null) {
			productFeatureDataResources = new EDataTypeUniqueEList<String>(String.class, this, DataPackage.DATA_RESOURCE__PRODUCT_FEATURE_DATA_RESOURCES);
		}
		return productFeatureDataResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> contents() {
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
	public List<String> templateContents() {
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
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_ID:
				return getDataResourceId();
			case DataPackage.DATA_RESOURCE__CHARACTER_SET_ID:
				return getCharacterSetId();
			case DataPackage.DATA_RESOURCE__CREATED_BY_USER_LOGIN:
				return getCreatedByUserLogin();
			case DataPackage.DATA_RESOURCE__CREATED_DATE:
				return getCreatedDate();
			case DataPackage.DATA_RESOURCE__DATA_CATEGORY_ID:
				return getDataCategoryId();
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_NAME:
				return getDataResourceName();
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_TYPE_ID:
				return getDataResourceTypeId();
			case DataPackage.DATA_RESOURCE__DATA_SOURCE_ID:
				return getDataSourceId();
			case DataPackage.DATA_RESOURCE__DATA_TEMPLATE_TYPE_ID:
				return getDataTemplateTypeId();
			case DataPackage.DATA_RESOURCE__IS_PUBLIC:
				return isIsPublic();
			case DataPackage.DATA_RESOURCE__LAST_MODIFIED_BY_USER_LOGIN:
				return getLastModifiedByUserLogin();
			case DataPackage.DATA_RESOURCE__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case DataPackage.DATA_RESOURCE__LOCALE_STRING:
				return getLocaleString();
			case DataPackage.DATA_RESOURCE__MIME_TYPE_ID:
				return getMimeTypeId();
			case DataPackage.DATA_RESOURCE__OBJECT_INFO:
				return getObjectInfo();
			case DataPackage.DATA_RESOURCE__RELATED_DETAIL_ID:
				return getRelatedDetailId();
			case DataPackage.DATA_RESOURCE__STATUS_ID:
				return getStatusId();
			case DataPackage.DATA_RESOURCE__SURVEY_ID:
				return getSurveyId();
			case DataPackage.DATA_RESOURCE__SURVEY_RESPONSE_ID:
				return getSurveyResponseId();
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_ATTRIBUTES:
				return getDataResourceAttributes();
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_META_DATAS:
				return getDataResourceMetaDatas();
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_PURPOSES:
				return getDataResourcePurposes();
			case DataPackage.DATA_RESOURCE__PRODUCT_FEATURE_DATA_RESOURCES:
				return getProductFeatureDataResources();
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
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_ID:
				setDataResourceId((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE__CHARACTER_SET_ID:
				setCharacterSetId((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case DataPackage.DATA_RESOURCE__DATA_CATEGORY_ID:
				setDataCategoryId((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_NAME:
				setDataResourceName((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_TYPE_ID:
				setDataResourceTypeId((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE__DATA_SOURCE_ID:
				setDataSourceId((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE__DATA_TEMPLATE_TYPE_ID:
				setDataTemplateTypeId((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE__IS_PUBLIC:
				setIsPublic((Boolean)newValue);
				return;
			case DataPackage.DATA_RESOURCE__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE__LAST_MODIFIED_DATE:
				setLastModifiedDate((Date)newValue);
				return;
			case DataPackage.DATA_RESOURCE__LOCALE_STRING:
				setLocaleString((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE__MIME_TYPE_ID:
				setMimeTypeId((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE__OBJECT_INFO:
				setObjectInfo((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE__RELATED_DETAIL_ID:
				setRelatedDetailId((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE__STATUS_ID:
				setStatusId((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE__SURVEY_ID:
				setSurveyId((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE__SURVEY_RESPONSE_ID:
				setSurveyResponseId((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_ATTRIBUTES:
				getDataResourceAttributes().clear();
				getDataResourceAttributes().addAll((Collection<? extends String>)newValue);
				return;
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_META_DATAS:
				getDataResourceMetaDatas().clear();
				getDataResourceMetaDatas().addAll((Collection<? extends String>)newValue);
				return;
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_PURPOSES:
				getDataResourcePurposes().clear();
				getDataResourcePurposes().addAll((Collection<? extends String>)newValue);
				return;
			case DataPackage.DATA_RESOURCE__PRODUCT_FEATURE_DATA_RESOURCES:
				getProductFeatureDataResources().clear();
				getProductFeatureDataResources().addAll((Collection<? extends String>)newValue);
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
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_ID:
				setDataResourceId(DATA_RESOURCE_ID_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__CHARACTER_SET_ID:
				setCharacterSetId(CHARACTER_SET_ID_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin(CREATED_BY_USER_LOGIN_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__DATA_CATEGORY_ID:
				setDataCategoryId(DATA_CATEGORY_ID_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_NAME:
				setDataResourceName(DATA_RESOURCE_NAME_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_TYPE_ID:
				setDataResourceTypeId(DATA_RESOURCE_TYPE_ID_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__DATA_SOURCE_ID:
				setDataSourceId(DATA_SOURCE_ID_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__DATA_TEMPLATE_TYPE_ID:
				setDataTemplateTypeId(DATA_TEMPLATE_TYPE_ID_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__IS_PUBLIC:
				setIsPublic(IS_PUBLIC_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin(LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__LOCALE_STRING:
				setLocaleString(LOCALE_STRING_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__MIME_TYPE_ID:
				setMimeTypeId(MIME_TYPE_ID_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__OBJECT_INFO:
				setObjectInfo(OBJECT_INFO_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__RELATED_DETAIL_ID:
				setRelatedDetailId(RELATED_DETAIL_ID_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__SURVEY_ID:
				setSurveyId(SURVEY_ID_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__SURVEY_RESPONSE_ID:
				setSurveyResponseId(SURVEY_RESPONSE_ID_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_ATTRIBUTES:
				getDataResourceAttributes().clear();
				return;
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_META_DATAS:
				getDataResourceMetaDatas().clear();
				return;
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_PURPOSES:
				getDataResourcePurposes().clear();
				return;
			case DataPackage.DATA_RESOURCE__PRODUCT_FEATURE_DATA_RESOURCES:
				getProductFeatureDataResources().clear();
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
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_ID:
				return DATA_RESOURCE_ID_EDEFAULT == null ? dataResourceId != null : !DATA_RESOURCE_ID_EDEFAULT.equals(dataResourceId);
			case DataPackage.DATA_RESOURCE__CHARACTER_SET_ID:
				return CHARACTER_SET_ID_EDEFAULT == null ? characterSetId != null : !CHARACTER_SET_ID_EDEFAULT.equals(characterSetId);
			case DataPackage.DATA_RESOURCE__CREATED_BY_USER_LOGIN:
				return CREATED_BY_USER_LOGIN_EDEFAULT == null ? createdByUserLogin != null : !CREATED_BY_USER_LOGIN_EDEFAULT.equals(createdByUserLogin);
			case DataPackage.DATA_RESOURCE__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case DataPackage.DATA_RESOURCE__DATA_CATEGORY_ID:
				return DATA_CATEGORY_ID_EDEFAULT == null ? dataCategoryId != null : !DATA_CATEGORY_ID_EDEFAULT.equals(dataCategoryId);
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_NAME:
				return DATA_RESOURCE_NAME_EDEFAULT == null ? dataResourceName != null : !DATA_RESOURCE_NAME_EDEFAULT.equals(dataResourceName);
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_TYPE_ID:
				return DATA_RESOURCE_TYPE_ID_EDEFAULT == null ? dataResourceTypeId != null : !DATA_RESOURCE_TYPE_ID_EDEFAULT.equals(dataResourceTypeId);
			case DataPackage.DATA_RESOURCE__DATA_SOURCE_ID:
				return DATA_SOURCE_ID_EDEFAULT == null ? dataSourceId != null : !DATA_SOURCE_ID_EDEFAULT.equals(dataSourceId);
			case DataPackage.DATA_RESOURCE__DATA_TEMPLATE_TYPE_ID:
				return DATA_TEMPLATE_TYPE_ID_EDEFAULT == null ? dataTemplateTypeId != null : !DATA_TEMPLATE_TYPE_ID_EDEFAULT.equals(dataTemplateTypeId);
			case DataPackage.DATA_RESOURCE__IS_PUBLIC:
				return isPublic != IS_PUBLIC_EDEFAULT;
			case DataPackage.DATA_RESOURCE__LAST_MODIFIED_BY_USER_LOGIN:
				return LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT == null ? lastModifiedByUserLogin != null : !LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT.equals(lastModifiedByUserLogin);
			case DataPackage.DATA_RESOURCE__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case DataPackage.DATA_RESOURCE__LOCALE_STRING:
				return LOCALE_STRING_EDEFAULT == null ? localeString != null : !LOCALE_STRING_EDEFAULT.equals(localeString);
			case DataPackage.DATA_RESOURCE__MIME_TYPE_ID:
				return MIME_TYPE_ID_EDEFAULT == null ? mimeTypeId != null : !MIME_TYPE_ID_EDEFAULT.equals(mimeTypeId);
			case DataPackage.DATA_RESOURCE__OBJECT_INFO:
				return OBJECT_INFO_EDEFAULT == null ? objectInfo != null : !OBJECT_INFO_EDEFAULT.equals(objectInfo);
			case DataPackage.DATA_RESOURCE__RELATED_DETAIL_ID:
				return RELATED_DETAIL_ID_EDEFAULT == null ? relatedDetailId != null : !RELATED_DETAIL_ID_EDEFAULT.equals(relatedDetailId);
			case DataPackage.DATA_RESOURCE__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
			case DataPackage.DATA_RESOURCE__SURVEY_ID:
				return SURVEY_ID_EDEFAULT == null ? surveyId != null : !SURVEY_ID_EDEFAULT.equals(surveyId);
			case DataPackage.DATA_RESOURCE__SURVEY_RESPONSE_ID:
				return SURVEY_RESPONSE_ID_EDEFAULT == null ? surveyResponseId != null : !SURVEY_RESPONSE_ID_EDEFAULT.equals(surveyResponseId);
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_ATTRIBUTES:
				return dataResourceAttributes != null && !dataResourceAttributes.isEmpty();
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_META_DATAS:
				return dataResourceMetaDatas != null && !dataResourceMetaDatas.isEmpty();
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_PURPOSES:
				return dataResourcePurposes != null && !dataResourcePurposes.isEmpty();
			case DataPackage.DATA_RESOURCE__PRODUCT_FEATURE_DATA_RESOURCES:
				return productFeatureDataResources != null && !productFeatureDataResources.isEmpty();
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
		result.append(" (dataResourceId: ");
		result.append(dataResourceId);
		result.append(", characterSetId: ");
		result.append(characterSetId);
		result.append(", createdByUserLogin: ");
		result.append(createdByUserLogin);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(", dataCategoryId: ");
		result.append(dataCategoryId);
		result.append(", dataResourceName: ");
		result.append(dataResourceName);
		result.append(", dataResourceTypeId: ");
		result.append(dataResourceTypeId);
		result.append(", dataSourceId: ");
		result.append(dataSourceId);
		result.append(", dataTemplateTypeId: ");
		result.append(dataTemplateTypeId);
		result.append(", isPublic: ");
		result.append(isPublic);
		result.append(", lastModifiedByUserLogin: ");
		result.append(lastModifiedByUserLogin);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", localeString: ");
		result.append(localeString);
		result.append(", mimeTypeId: ");
		result.append(mimeTypeId);
		result.append(", objectInfo: ");
		result.append(objectInfo);
		result.append(", relatedDetailId: ");
		result.append(relatedDetailId);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(", surveyId: ");
		result.append(surveyId);
		result.append(", surveyResponseId: ");
		result.append(surveyResponseId);
		result.append(", dataResourceAttributes: ");
		result.append(dataResourceAttributes);
		result.append(", dataResourceMetaDatas: ");
		result.append(dataResourceMetaDatas);
		result.append(", dataResourcePurposes: ");
		result.append(dataResourcePurposes);
		result.append(", productFeatureDataResources: ");
		result.append(productFeatureDataResources);
		result.append(')');
		return result.toString();
	}

} //DataResourceImpl
