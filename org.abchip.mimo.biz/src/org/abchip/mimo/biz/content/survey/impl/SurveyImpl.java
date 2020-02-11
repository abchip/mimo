/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.survey.impl;

import java.util.List;
import org.abchip.mimo.biz.content.survey.Survey;
import org.abchip.mimo.biz.content.survey.SurveyMultiResp;
import org.abchip.mimo.biz.content.survey.SurveyPackage;
import org.abchip.mimo.biz.content.survey.SurveyPage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyImpl#getSurveyMultiResps <em>Survey Multi Resps</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.impl.SurveyImpl#getSurveyName <em>Survey Name</em>}</li>
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
		return (String)eGet(SurveyPackage.Literals.SURVEY__ACRO_FORM_CONTENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcroFormContentId(String newAcroFormContentId) {
		eSet(SurveyPackage.Literals.SURVEY__ACRO_FORM_CONTENT_ID, newAcroFormContentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowMultiple() {
		return (Boolean)eGet(SurveyPackage.Literals.SURVEY__ALLOW_MULTIPLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowMultiple(boolean newAllowMultiple) {
		eSet(SurveyPackage.Literals.SURVEY__ALLOW_MULTIPLE, newAllowMultiple);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowUpdate() {
		return (Boolean)eGet(SurveyPackage.Literals.SURVEY__ALLOW_UPDATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowUpdate(boolean newAllowUpdate) {
		eSet(SurveyPackage.Literals.SURVEY__ALLOW_UPDATE, newAllowUpdate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return (String)eGet(SurveyPackage.Literals.SURVEY__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(SurveyPackage.Literals.SURVEY__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(SurveyPackage.Literals.SURVEY__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(SurveyPackage.Literals.SURVEY__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAnonymous() {
		return (Boolean)eGet(SurveyPackage.Literals.SURVEY__IS_ANONYMOUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAnonymous(boolean newIsAnonymous) {
		eSet(SurveyPackage.Literals.SURVEY__IS_ANONYMOUS, newIsAnonymous);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResponseService() {
		return (String)eGet(SurveyPackage.Literals.SURVEY__RESPONSE_SERVICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseService(String newResponseService) {
		eSet(SurveyPackage.Literals.SURVEY__RESPONSE_SERVICE, newResponseService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubmitCaption() {
		return (String)eGet(SurveyPackage.Literals.SURVEY__SUBMIT_CAPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubmitCaption(String newSubmitCaption) {
		eSet(SurveyPackage.Literals.SURVEY__SUBMIT_CAPTION, newSubmitCaption);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<SurveyMultiResp> getSurveyMultiResps() {
		return (List<SurveyMultiResp>)eGet(SurveyPackage.Literals.SURVEY__SURVEY_MULTI_RESPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurveyId() {
		return (String)eGet(SurveyPackage.Literals.SURVEY__SURVEY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyId(String newSurveyId) {
		eSet(SurveyPackage.Literals.SURVEY__SURVEY_ID, newSurveyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurveyName() {
		return (String)eGet(SurveyPackage.Literals.SURVEY__SURVEY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyName(String newSurveyName) {
		eSet(SurveyPackage.Literals.SURVEY__SURVEY_NAME, newSurveyName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<SurveyPage> getSurveyPages() {
		return (List<SurveyPage>)eGet(SurveyPackage.Literals.SURVEY__SURVEY_PAGES, true);
	}

} //SurveyImpl
