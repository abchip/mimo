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

import org.abchip.mimo.biz.common.datasource.DataSource;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.content.data.CharacterSet;
import org.abchip.mimo.biz.content.data.DataCategory;
import org.abchip.mimo.biz.content.data.DataPackage;
import org.abchip.mimo.biz.content.data.DataResource;
import org.abchip.mimo.biz.content.data.DataResourceType;
import org.abchip.mimo.biz.content.data.DataTemplateType;
import org.abchip.mimo.biz.content.data.MimeType;
import org.abchip.mimo.biz.content.survey.Survey;
import org.abchip.mimo.biz.content.survey.SurveyResponse;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data ResourceDriver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getDataResourceId <em>Data ResourceDriver Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getDataResourceName <em>Data ResourceDriver Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#isIsPublic <em>Is Public</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getLocaleString <em>Locale String</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getObjectInfo <em>Object Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getRelatedDetailId <em>Related Detail Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getDataResourceTypeId <em>Data ResourceDriver Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getDataTemplateTypeId <em>Data Template Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getDataCategoryId <em>Data Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getDataSourceId <em>Data Source Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getMimeTypeId <em>Mime Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getCharacterSetId <em>Character Set Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getSurveyId <em>Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getSurveyResponseId <em>Survey Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getDataResourceAttributes <em>Data ResourceDriver Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getDataResourceMetaDatas <em>Data ResourceDriver Meta Datas</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataResourceImpl#getDataResourcePurposes <em>Data ResourceDriver Purposes</em>}</li>
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
	 * The default value of the '{@link #getDataResourceId() <em>Data ResourceDriver Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceId()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_RESOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataResourceId() <em>Data ResourceDriver Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceId()
	 * @generated
	 * @ordered
	 */
	protected String dataResourceId = DATA_RESOURCE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getDataResourceName() <em>Data ResourceDriver Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_RESOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataResourceName() <em>Data ResourceDriver Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceName()
	 * @generated
	 * @ordered
	 */
	protected String dataResourceName = DATA_RESOURCE_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;

	/**
	 * The cached value of the '{@link #getDataResourceTypeId() <em>Data ResourceDriver Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceTypeId()
	 * @generated
	 * @ordered
	 */
	protected DataResourceType dataResourceTypeId;

	/**
	 * The cached value of the '{@link #getDataTemplateTypeId() <em>Data Template Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTemplateTypeId()
	 * @generated
	 * @ordered
	 */
	protected DataTemplateType dataTemplateTypeId;

	/**
	 * The cached value of the '{@link #getDataCategoryId() <em>Data Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCategoryId()
	 * @generated
	 * @ordered
	 */
	protected DataCategory dataCategoryId;

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
	 * The cached value of the '{@link #getSurveyId() <em>Survey Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyId()
	 * @generated
	 * @ordered
	 */
	protected Survey surveyId;

	/**
	 * The cached value of the '{@link #getSurveyResponseId() <em>Survey Response Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyResponseId()
	 * @generated
	 * @ordered
	 */
	protected SurveyResponse surveyResponseId;

	/**
	 * The cached value of the '{@link #getDataResourceAttributes() <em>Data ResourceDriver Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dataResourceAttributes;

	/**
	 * The cached value of the '{@link #getDataResourceMetaDatas() <em>Data ResourceDriver Meta Datas</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataResourceMetaDatas()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dataResourceMetaDatas;

	/**
	 * The cached value of the '{@link #getDataResourcePurposes() <em>Data ResourceDriver Purposes</em>}' attribute list.
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
	public CharacterSet getCharacterSetId() {
		if (characterSetId != null && ((EObject)characterSetId).eIsProxy()) {
			InternalEObject oldCharacterSetId = (InternalEObject)characterSetId;
			characterSetId = (CharacterSet)eResolveProxy(oldCharacterSetId);
			if (characterSetId != oldCharacterSetId) {
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
		characterSetId = newCharacterSetId;
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
		createdByUserLogin = newCreatedByUserLogin;
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
		createdDate = newCreatedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCategory getDataCategoryId() {
		if (dataCategoryId != null && ((EObject)dataCategoryId).eIsProxy()) {
			InternalEObject oldDataCategoryId = (InternalEObject)dataCategoryId;
			dataCategoryId = (DataCategory)eResolveProxy(oldDataCategoryId);
			if (dataCategoryId != oldDataCategoryId) {
			}
		}
		return dataCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCategory basicGetDataCategoryId() {
		return dataCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataCategoryId(DataCategory newDataCategoryId) {
		dataCategoryId = newDataCategoryId;
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
		dataResourceId = newDataResourceId;
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
		dataResourceName = newDataResourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataResourceType getDataResourceTypeId() {
		if (dataResourceTypeId != null && ((EObject)dataResourceTypeId).eIsProxy()) {
			InternalEObject oldDataResourceTypeId = (InternalEObject)dataResourceTypeId;
			dataResourceTypeId = (DataResourceType)eResolveProxy(oldDataResourceTypeId);
			if (dataResourceTypeId != oldDataResourceTypeId) {
			}
		}
		return dataResourceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataResourceType basicGetDataResourceTypeId() {
		return dataResourceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataResourceTypeId(DataResourceType newDataResourceTypeId) {
		dataResourceTypeId = newDataResourceTypeId;
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
		dataSourceId = newDataSourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataTemplateType getDataTemplateTypeId() {
		if (dataTemplateTypeId != null && ((EObject)dataTemplateTypeId).eIsProxy()) {
			InternalEObject oldDataTemplateTypeId = (InternalEObject)dataTemplateTypeId;
			dataTemplateTypeId = (DataTemplateType)eResolveProxy(oldDataTemplateTypeId);
			if (dataTemplateTypeId != oldDataTemplateTypeId) {
			}
		}
		return dataTemplateTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTemplateType basicGetDataTemplateTypeId() {
		return dataTemplateTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataTemplateTypeId(DataTemplateType newDataTemplateTypeId) {
		dataTemplateTypeId = newDataTemplateTypeId;
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
		isPublic = newIsPublic;
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
		lastModifiedByUserLogin = newLastModifiedByUserLogin;
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
		lastModifiedDate = newLastModifiedDate;
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
		localeString = newLocaleString;
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
		mimeTypeId = newMimeTypeId;
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
		objectInfo = newObjectInfo;
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
		relatedDetailId = newRelatedDetailId;
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
		statusId = newStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Survey getSurveyId() {
		if (surveyId != null && ((EObject)surveyId).eIsProxy()) {
			InternalEObject oldSurveyId = (InternalEObject)surveyId;
			surveyId = (Survey)eResolveProxy(oldSurveyId);
			if (surveyId != oldSurveyId) {
			}
		}
		return surveyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Survey basicGetSurveyId() {
		return surveyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyId(Survey newSurveyId) {
		surveyId = newSurveyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyResponse getSurveyResponseId() {
		if (surveyResponseId != null && ((EObject)surveyResponseId).eIsProxy()) {
			InternalEObject oldSurveyResponseId = (InternalEObject)surveyResponseId;
			surveyResponseId = (SurveyResponse)eResolveProxy(oldSurveyResponseId);
			if (surveyResponseId != oldSurveyResponseId) {
			}
		}
		return surveyResponseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyResponse basicGetSurveyResponseId() {
		return surveyResponseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyResponseId(SurveyResponse newSurveyResponseId) {
		surveyResponseId = newSurveyResponseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getDataResourceAttributes() {
		if (dataResourceAttributes == null) {
			dataResourceAttributes = new BasicInternalEList<String>(String.class);
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
			dataResourceMetaDatas = new BasicInternalEList<String>(String.class);
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
			dataResourcePurposes = new BasicInternalEList<String>(String.class);
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
			productFeatureDataResources = new BasicInternalEList<String>(String.class);
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
			case DataPackage.DATA_RESOURCE__CREATED_DATE:
				return getCreatedDate();
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_NAME:
				return getDataResourceName();
			case DataPackage.DATA_RESOURCE__IS_PUBLIC:
				return isIsPublic();
			case DataPackage.DATA_RESOURCE__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case DataPackage.DATA_RESOURCE__LOCALE_STRING:
				return getLocaleString();
			case DataPackage.DATA_RESOURCE__OBJECT_INFO:
				return getObjectInfo();
			case DataPackage.DATA_RESOURCE__RELATED_DETAIL_ID:
				return getRelatedDetailId();
			case DataPackage.DATA_RESOURCE__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_TYPE_ID:
				if (resolve) return getDataResourceTypeId();
				return basicGetDataResourceTypeId();
			case DataPackage.DATA_RESOURCE__DATA_TEMPLATE_TYPE_ID:
				if (resolve) return getDataTemplateTypeId();
				return basicGetDataTemplateTypeId();
			case DataPackage.DATA_RESOURCE__DATA_CATEGORY_ID:
				if (resolve) return getDataCategoryId();
				return basicGetDataCategoryId();
			case DataPackage.DATA_RESOURCE__DATA_SOURCE_ID:
				if (resolve) return getDataSourceId();
				return basicGetDataSourceId();
			case DataPackage.DATA_RESOURCE__MIME_TYPE_ID:
				if (resolve) return getMimeTypeId();
				return basicGetMimeTypeId();
			case DataPackage.DATA_RESOURCE__CHARACTER_SET_ID:
				if (resolve) return getCharacterSetId();
				return basicGetCharacterSetId();
			case DataPackage.DATA_RESOURCE__CREATED_BY_USER_LOGIN:
				if (resolve) return getCreatedByUserLogin();
				return basicGetCreatedByUserLogin();
			case DataPackage.DATA_RESOURCE__LAST_MODIFIED_BY_USER_LOGIN:
				if (resolve) return getLastModifiedByUserLogin();
				return basicGetLastModifiedByUserLogin();
			case DataPackage.DATA_RESOURCE__SURVEY_ID:
				if (resolve) return getSurveyId();
				return basicGetSurveyId();
			case DataPackage.DATA_RESOURCE__SURVEY_RESPONSE_ID:
				if (resolve) return getSurveyResponseId();
				return basicGetSurveyResponseId();
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
			case DataPackage.DATA_RESOURCE__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_NAME:
				setDataResourceName((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE__IS_PUBLIC:
				setIsPublic((Boolean)newValue);
				return;
			case DataPackage.DATA_RESOURCE__LAST_MODIFIED_DATE:
				setLastModifiedDate((Date)newValue);
				return;
			case DataPackage.DATA_RESOURCE__LOCALE_STRING:
				setLocaleString((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE__OBJECT_INFO:
				setObjectInfo((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE__RELATED_DETAIL_ID:
				setRelatedDetailId((String)newValue);
				return;
			case DataPackage.DATA_RESOURCE__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_TYPE_ID:
				setDataResourceTypeId((DataResourceType)newValue);
				return;
			case DataPackage.DATA_RESOURCE__DATA_TEMPLATE_TYPE_ID:
				setDataTemplateTypeId((DataTemplateType)newValue);
				return;
			case DataPackage.DATA_RESOURCE__DATA_CATEGORY_ID:
				setDataCategoryId((DataCategory)newValue);
				return;
			case DataPackage.DATA_RESOURCE__DATA_SOURCE_ID:
				setDataSourceId((DataSource)newValue);
				return;
			case DataPackage.DATA_RESOURCE__MIME_TYPE_ID:
				setMimeTypeId((MimeType)newValue);
				return;
			case DataPackage.DATA_RESOURCE__CHARACTER_SET_ID:
				setCharacterSetId((CharacterSet)newValue);
				return;
			case DataPackage.DATA_RESOURCE__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((UserLogin)newValue);
				return;
			case DataPackage.DATA_RESOURCE__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((UserLogin)newValue);
				return;
			case DataPackage.DATA_RESOURCE__SURVEY_ID:
				setSurveyId((Survey)newValue);
				return;
			case DataPackage.DATA_RESOURCE__SURVEY_RESPONSE_ID:
				setSurveyResponseId((SurveyResponse)newValue);
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
			case DataPackage.DATA_RESOURCE__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_NAME:
				setDataResourceName(DATA_RESOURCE_NAME_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__IS_PUBLIC:
				setIsPublic(IS_PUBLIC_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__LOCALE_STRING:
				setLocaleString(LOCALE_STRING_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__OBJECT_INFO:
				setObjectInfo(OBJECT_INFO_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__RELATED_DETAIL_ID:
				setRelatedDetailId(RELATED_DETAIL_ID_EDEFAULT);
				return;
			case DataPackage.DATA_RESOURCE__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_TYPE_ID:
				setDataResourceTypeId((DataResourceType)null);
				return;
			case DataPackage.DATA_RESOURCE__DATA_TEMPLATE_TYPE_ID:
				setDataTemplateTypeId((DataTemplateType)null);
				return;
			case DataPackage.DATA_RESOURCE__DATA_CATEGORY_ID:
				setDataCategoryId((DataCategory)null);
				return;
			case DataPackage.DATA_RESOURCE__DATA_SOURCE_ID:
				setDataSourceId((DataSource)null);
				return;
			case DataPackage.DATA_RESOURCE__MIME_TYPE_ID:
				setMimeTypeId((MimeType)null);
				return;
			case DataPackage.DATA_RESOURCE__CHARACTER_SET_ID:
				setCharacterSetId((CharacterSet)null);
				return;
			case DataPackage.DATA_RESOURCE__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((UserLogin)null);
				return;
			case DataPackage.DATA_RESOURCE__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((UserLogin)null);
				return;
			case DataPackage.DATA_RESOURCE__SURVEY_ID:
				setSurveyId((Survey)null);
				return;
			case DataPackage.DATA_RESOURCE__SURVEY_RESPONSE_ID:
				setSurveyResponseId((SurveyResponse)null);
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
			case DataPackage.DATA_RESOURCE__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_NAME:
				return DATA_RESOURCE_NAME_EDEFAULT == null ? dataResourceName != null : !DATA_RESOURCE_NAME_EDEFAULT.equals(dataResourceName);
			case DataPackage.DATA_RESOURCE__IS_PUBLIC:
				return isPublic != IS_PUBLIC_EDEFAULT;
			case DataPackage.DATA_RESOURCE__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case DataPackage.DATA_RESOURCE__LOCALE_STRING:
				return LOCALE_STRING_EDEFAULT == null ? localeString != null : !LOCALE_STRING_EDEFAULT.equals(localeString);
			case DataPackage.DATA_RESOURCE__OBJECT_INFO:
				return OBJECT_INFO_EDEFAULT == null ? objectInfo != null : !OBJECT_INFO_EDEFAULT.equals(objectInfo);
			case DataPackage.DATA_RESOURCE__RELATED_DETAIL_ID:
				return RELATED_DETAIL_ID_EDEFAULT == null ? relatedDetailId != null : !RELATED_DETAIL_ID_EDEFAULT.equals(relatedDetailId);
			case DataPackage.DATA_RESOURCE__STATUS_ID:
				return statusId != null;
			case DataPackage.DATA_RESOURCE__DATA_RESOURCE_TYPE_ID:
				return dataResourceTypeId != null;
			case DataPackage.DATA_RESOURCE__DATA_TEMPLATE_TYPE_ID:
				return dataTemplateTypeId != null;
			case DataPackage.DATA_RESOURCE__DATA_CATEGORY_ID:
				return dataCategoryId != null;
			case DataPackage.DATA_RESOURCE__DATA_SOURCE_ID:
				return dataSourceId != null;
			case DataPackage.DATA_RESOURCE__MIME_TYPE_ID:
				return mimeTypeId != null;
			case DataPackage.DATA_RESOURCE__CHARACTER_SET_ID:
				return characterSetId != null;
			case DataPackage.DATA_RESOURCE__CREATED_BY_USER_LOGIN:
				return createdByUserLogin != null;
			case DataPackage.DATA_RESOURCE__LAST_MODIFIED_BY_USER_LOGIN:
				return lastModifiedByUserLogin != null;
			case DataPackage.DATA_RESOURCE__SURVEY_ID:
				return surveyId != null;
			case DataPackage.DATA_RESOURCE__SURVEY_RESPONSE_ID:
				return surveyResponseId != null;
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
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(", dataResourceName: ");
		result.append(dataResourceName);
		result.append(", isPublic: ");
		result.append(isPublic);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", localeString: ");
		result.append(localeString);
		result.append(", objectInfo: ");
		result.append(objectInfo);
		result.append(", relatedDetailId: ");
		result.append(relatedDetailId);
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
