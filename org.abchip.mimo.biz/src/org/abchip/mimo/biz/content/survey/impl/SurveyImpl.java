/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.survey.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.content.survey.Survey;
import org.abchip.mimo.biz.content.survey.SurveyPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyImpl#getSurveyId <em>Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyImpl#getAcroFormContentId <em>Acro Form Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyImpl#isAllowMultiple <em>Allow Multiple</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyImpl#isAllowUpdate <em>Allow Update</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyImpl#isIsAnonymous <em>Is Anonymous</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyImpl#getResponseService <em>Response Service</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyImpl#getSubmitCaption <em>Submit Caption</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyImpl#getSurveyName <em>Survey Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyImpl#getSurveyMultiResps <em>Survey Multi Resps</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyImpl#getSurveyPages <em>Survey Pages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurveyImpl extends BizEntityImpl implements Survey {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
	 * The default value of the '{@link #getAcroFormContentId() <em>Acro Form Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcroFormContentId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACRO_FORM_CONTENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcroFormContentId() <em>Acro Form Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcroFormContentId()
	 * @generated
	 * @ordered
	 */
	protected String acroFormContentId = ACRO_FORM_CONTENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowMultiple() <em>Allow Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_MULTIPLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowMultiple() <em>Allow Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowMultiple()
	 * @generated
	 * @ordered
	 */
	protected boolean allowMultiple = ALLOW_MULTIPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowUpdate() <em>Allow Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_UPDATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowUpdate() <em>Allow Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowUpdate()
	 * @generated
	 * @ordered
	 */
	protected boolean allowUpdate = ALLOW_UPDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

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
	 * The default value of the '{@link #isIsAnonymous() <em>Is Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAnonymous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ANONYMOUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAnonymous() <em>Is Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAnonymous()
	 * @generated
	 * @ordered
	 */
	protected boolean isAnonymous = IS_ANONYMOUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseService() <em>Response Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseService()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseService() <em>Response Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseService()
	 * @generated
	 * @ordered
	 */
	protected String responseService = RESPONSE_SERVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubmitCaption() <em>Submit Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmitCaption()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBMIT_CAPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubmitCaption() <em>Submit Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmitCaption()
	 * @generated
	 * @ordered
	 */
	protected String submitCaption = SUBMIT_CAPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSurveyName() <em>Survey Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyName()
	 * @generated
	 * @ordered
	 */
	protected static final String SURVEY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurveyName() <em>Survey Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyName()
	 * @generated
	 * @ordered
	 */
	protected String surveyName = SURVEY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSurveyMultiResps() <em>Survey Multi Resps</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyMultiResps()
	 * @generated
	 * @ordered
	 */
	protected EList<String> surveyMultiResps;

	/**
	 * The cached value of the '{@link #getSurveyPages() <em>Survey Pages</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyPages()
	 * @generated
	 * @ordered
	 */
	protected EList<String> surveyPages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurveyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyPackage.Literals.SURVEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAcroFormContentId() {
		return acroFormContentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcroFormContentId(String newAcroFormContentId) {
		String oldAcroFormContentId = acroFormContentId;
		acroFormContentId = newAcroFormContentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY__ACRO_FORM_CONTENT_ID, oldAcroFormContentId, acroFormContentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowMultiple() {
		return allowMultiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowMultiple(boolean newAllowMultiple) {
		boolean oldAllowMultiple = allowMultiple;
		allowMultiple = newAllowMultiple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY__ALLOW_MULTIPLE, oldAllowMultiple, allowMultiple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowUpdate() {
		return allowUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowUpdate(boolean newAllowUpdate) {
		boolean oldAllowUpdate = allowUpdate;
		allowUpdate = newAllowUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY__ALLOW_UPDATE, oldAllowUpdate, allowUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY__COMMENTS, oldComments, comments));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAnonymous() {
		return isAnonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAnonymous(boolean newIsAnonymous) {
		boolean oldIsAnonymous = isAnonymous;
		isAnonymous = newIsAnonymous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY__IS_ANONYMOUS, oldIsAnonymous, isAnonymous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResponseService() {
		return responseService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseService(String newResponseService) {
		String oldResponseService = responseService;
		responseService = newResponseService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY__RESPONSE_SERVICE, oldResponseService, responseService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubmitCaption() {
		return submitCaption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubmitCaption(String newSubmitCaption) {
		String oldSubmitCaption = submitCaption;
		submitCaption = newSubmitCaption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY__SUBMIT_CAPTION, oldSubmitCaption, submitCaption));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY__SURVEY_ID, oldSurveyId, surveyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurveyName() {
		return surveyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyName(String newSurveyName) {
		String oldSurveyName = surveyName;
		surveyName = newSurveyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyPackage.SURVEY__SURVEY_NAME, oldSurveyName, surveyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getSurveyMultiResps() {
		if (surveyMultiResps == null) {
			surveyMultiResps = new EDataTypeUniqueEList<String>(String.class, this, SurveyPackage.SURVEY__SURVEY_MULTI_RESPS);
		}
		return surveyMultiResps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getSurveyPages() {
		if (surveyPages == null) {
			surveyPages = new EDataTypeUniqueEList<String>(String.class, this, SurveyPackage.SURVEY__SURVEY_PAGES);
		}
		return surveyPages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> dataResources() {
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
	public List<String> productStoreFinActSettings() {
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
	public List<String> productStoreSurveyAppls() {
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
	public List<String> surveyResponses() {
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
			case SurveyPackage.SURVEY__SURVEY_ID:
				return getSurveyId();
			case SurveyPackage.SURVEY__ACRO_FORM_CONTENT_ID:
				return getAcroFormContentId();
			case SurveyPackage.SURVEY__ALLOW_MULTIPLE:
				return isAllowMultiple();
			case SurveyPackage.SURVEY__ALLOW_UPDATE:
				return isAllowUpdate();
			case SurveyPackage.SURVEY__COMMENTS:
				return getComments();
			case SurveyPackage.SURVEY__DESCRIPTION:
				return getDescription();
			case SurveyPackage.SURVEY__IS_ANONYMOUS:
				return isIsAnonymous();
			case SurveyPackage.SURVEY__RESPONSE_SERVICE:
				return getResponseService();
			case SurveyPackage.SURVEY__SUBMIT_CAPTION:
				return getSubmitCaption();
			case SurveyPackage.SURVEY__SURVEY_NAME:
				return getSurveyName();
			case SurveyPackage.SURVEY__SURVEY_MULTI_RESPS:
				return getSurveyMultiResps();
			case SurveyPackage.SURVEY__SURVEY_PAGES:
				return getSurveyPages();
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
			case SurveyPackage.SURVEY__SURVEY_ID:
				setSurveyId((String)newValue);
				return;
			case SurveyPackage.SURVEY__ACRO_FORM_CONTENT_ID:
				setAcroFormContentId((String)newValue);
				return;
			case SurveyPackage.SURVEY__ALLOW_MULTIPLE:
				setAllowMultiple((Boolean)newValue);
				return;
			case SurveyPackage.SURVEY__ALLOW_UPDATE:
				setAllowUpdate((Boolean)newValue);
				return;
			case SurveyPackage.SURVEY__COMMENTS:
				setComments((String)newValue);
				return;
			case SurveyPackage.SURVEY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SurveyPackage.SURVEY__IS_ANONYMOUS:
				setIsAnonymous((Boolean)newValue);
				return;
			case SurveyPackage.SURVEY__RESPONSE_SERVICE:
				setResponseService((String)newValue);
				return;
			case SurveyPackage.SURVEY__SUBMIT_CAPTION:
				setSubmitCaption((String)newValue);
				return;
			case SurveyPackage.SURVEY__SURVEY_NAME:
				setSurveyName((String)newValue);
				return;
			case SurveyPackage.SURVEY__SURVEY_MULTI_RESPS:
				getSurveyMultiResps().clear();
				getSurveyMultiResps().addAll((Collection<? extends String>)newValue);
				return;
			case SurveyPackage.SURVEY__SURVEY_PAGES:
				getSurveyPages().clear();
				getSurveyPages().addAll((Collection<? extends String>)newValue);
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
			case SurveyPackage.SURVEY__SURVEY_ID:
				setSurveyId(SURVEY_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY__ACRO_FORM_CONTENT_ID:
				setAcroFormContentId(ACRO_FORM_CONTENT_ID_EDEFAULT);
				return;
			case SurveyPackage.SURVEY__ALLOW_MULTIPLE:
				setAllowMultiple(ALLOW_MULTIPLE_EDEFAULT);
				return;
			case SurveyPackage.SURVEY__ALLOW_UPDATE:
				setAllowUpdate(ALLOW_UPDATE_EDEFAULT);
				return;
			case SurveyPackage.SURVEY__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case SurveyPackage.SURVEY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SurveyPackage.SURVEY__IS_ANONYMOUS:
				setIsAnonymous(IS_ANONYMOUS_EDEFAULT);
				return;
			case SurveyPackage.SURVEY__RESPONSE_SERVICE:
				setResponseService(RESPONSE_SERVICE_EDEFAULT);
				return;
			case SurveyPackage.SURVEY__SUBMIT_CAPTION:
				setSubmitCaption(SUBMIT_CAPTION_EDEFAULT);
				return;
			case SurveyPackage.SURVEY__SURVEY_NAME:
				setSurveyName(SURVEY_NAME_EDEFAULT);
				return;
			case SurveyPackage.SURVEY__SURVEY_MULTI_RESPS:
				getSurveyMultiResps().clear();
				return;
			case SurveyPackage.SURVEY__SURVEY_PAGES:
				getSurveyPages().clear();
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
			case SurveyPackage.SURVEY__SURVEY_ID:
				return SURVEY_ID_EDEFAULT == null ? surveyId != null : !SURVEY_ID_EDEFAULT.equals(surveyId);
			case SurveyPackage.SURVEY__ACRO_FORM_CONTENT_ID:
				return ACRO_FORM_CONTENT_ID_EDEFAULT == null ? acroFormContentId != null : !ACRO_FORM_CONTENT_ID_EDEFAULT.equals(acroFormContentId);
			case SurveyPackage.SURVEY__ALLOW_MULTIPLE:
				return allowMultiple != ALLOW_MULTIPLE_EDEFAULT;
			case SurveyPackage.SURVEY__ALLOW_UPDATE:
				return allowUpdate != ALLOW_UPDATE_EDEFAULT;
			case SurveyPackage.SURVEY__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case SurveyPackage.SURVEY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SurveyPackage.SURVEY__IS_ANONYMOUS:
				return isAnonymous != IS_ANONYMOUS_EDEFAULT;
			case SurveyPackage.SURVEY__RESPONSE_SERVICE:
				return RESPONSE_SERVICE_EDEFAULT == null ? responseService != null : !RESPONSE_SERVICE_EDEFAULT.equals(responseService);
			case SurveyPackage.SURVEY__SUBMIT_CAPTION:
				return SUBMIT_CAPTION_EDEFAULT == null ? submitCaption != null : !SUBMIT_CAPTION_EDEFAULT.equals(submitCaption);
			case SurveyPackage.SURVEY__SURVEY_NAME:
				return SURVEY_NAME_EDEFAULT == null ? surveyName != null : !SURVEY_NAME_EDEFAULT.equals(surveyName);
			case SurveyPackage.SURVEY__SURVEY_MULTI_RESPS:
				return surveyMultiResps != null && !surveyMultiResps.isEmpty();
			case SurveyPackage.SURVEY__SURVEY_PAGES:
				return surveyPages != null && !surveyPages.isEmpty();
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
		result.append(" (surveyId: ");
		result.append(surveyId);
		result.append(", acroFormContentId: ");
		result.append(acroFormContentId);
		result.append(", allowMultiple: ");
		result.append(allowMultiple);
		result.append(", allowUpdate: ");
		result.append(allowUpdate);
		result.append(", comments: ");
		result.append(comments);
		result.append(", description: ");
		result.append(description);
		result.append(", isAnonymous: ");
		result.append(isAnonymous);
		result.append(", responseService: ");
		result.append(responseService);
		result.append(", submitCaption: ");
		result.append(submitCaption);
		result.append(", surveyName: ");
		result.append(surveyName);
		result.append(", surveyMultiResps: ");
		result.append(surveyMultiResps);
		result.append(", surveyPages: ");
		result.append(surveyPages);
		result.append(')');
		return result.toString();
	}

} //SurveyImpl
