/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.survey;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.survey.Survey#getSurveyId <em>Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.Survey#getAcroFormContentId <em>Acro Form Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.Survey#isAllowMultiple <em>Allow Multiple</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.Survey#isAllowUpdate <em>Allow Update</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.Survey#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.Survey#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.Survey#isIsAnonymous <em>Is Anonymous</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.Survey#getResponseService <em>Response Service</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.Survey#getSubmitCaption <em>Submit Caption</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.Survey#getSurveyName <em>Survey Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.Survey#getSurveyMultiResps <em>Survey Multi Resps</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.Survey#getSurveyPages <em>Survey Pages</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurvey()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface Survey extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Acro Form Content Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acro Form Content Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acro Form Content Id</em>' attribute.
	 * @see #setAcroFormContentId(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurvey_AcroFormContentId()
	 * @model
	 * @generated
	 */
	String getAcroFormContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.Survey#getAcroFormContentId <em>Acro Form Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acro Form Content Id</em>' attribute.
	 * @see #getAcroFormContentId()
	 * @generated
	 */
	void setAcroFormContentId(String value);

	/**
	 * Returns the value of the '<em><b>Allow Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Multiple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Multiple</em>' attribute.
	 * @see #setAllowMultiple(boolean)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurvey_AllowMultiple()
	 * @model
	 * @generated
	 */
	boolean isAllowMultiple();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.Survey#isAllowMultiple <em>Allow Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Multiple</em>' attribute.
	 * @see #isAllowMultiple()
	 * @generated
	 */
	void setAllowMultiple(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Update</em>' attribute.
	 * @see #setAllowUpdate(boolean)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurvey_AllowUpdate()
	 * @model
	 * @generated
	 */
	boolean isAllowUpdate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.Survey#isAllowUpdate <em>Allow Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Update</em>' attribute.
	 * @see #isAllowUpdate()
	 * @generated
	 */
	void setAllowUpdate(boolean value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurvey_Comments()
	 * @model
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.Survey#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

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
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurvey_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.Survey#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Anonymous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Anonymous</em>' attribute.
	 * @see #setIsAnonymous(boolean)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurvey_IsAnonymous()
	 * @model
	 * @generated
	 */
	boolean isIsAnonymous();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.Survey#isIsAnonymous <em>Is Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Anonymous</em>' attribute.
	 * @see #isIsAnonymous()
	 * @generated
	 */
	void setIsAnonymous(boolean value);

	/**
	 * Returns the value of the '<em><b>Response Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Service</em>' attribute.
	 * @see #setResponseService(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurvey_ResponseService()
	 * @model
	 * @generated
	 */
	String getResponseService();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.Survey#getResponseService <em>Response Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Service</em>' attribute.
	 * @see #getResponseService()
	 * @generated
	 */
	void setResponseService(String value);

	/**
	 * Returns the value of the '<em><b>Submit Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submit Caption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submit Caption</em>' attribute.
	 * @see #setSubmitCaption(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurvey_SubmitCaption()
	 * @model
	 * @generated
	 */
	String getSubmitCaption();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.Survey#getSubmitCaption <em>Submit Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submit Caption</em>' attribute.
	 * @see #getSubmitCaption()
	 * @generated
	 */
	void setSubmitCaption(String value);

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
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurvey_SurveyId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getSurveyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.Survey#getSurveyId <em>Survey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Id</em>' attribute.
	 * @see #getSurveyId()
	 * @generated
	 */
	void setSurveyId(String value);

	/**
	 * Returns the value of the '<em><b>Survey Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Name</em>' attribute.
	 * @see #setSurveyName(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurvey_SurveyName()
	 * @model
	 * @generated
	 */
	String getSurveyName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.Survey#getSurveyName <em>Survey Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Name</em>' attribute.
	 * @see #getSurveyName()
	 * @generated
	 */
	void setSurveyName(String value);

	/**
	 * Returns the value of the '<em><b>Survey Multi Resps</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Multi Resps</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Multi Resps</em>' attribute list.
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurvey_SurveyMultiResps()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SurveyMultiResp'"
	 * @generated
	 */
	List<String> getSurveyMultiResps();

	/**
	 * Returns the value of the '<em><b>Survey Pages</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Pages</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Pages</em>' attribute list.
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurvey_SurveyPages()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SurveyPage'"
	 * @generated
	 */
	List<String> getSurveyPages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='DataResource' route='surveyId'"
	 * @generated
	 */
	List<String> dataResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductStoreFinActSetting' route='purchaseSurveyId'"
	 * @generated
	 */
	List<String> productStoreFinActSettings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductStoreSurveyAppl' route='surveyId'"
	 * @generated
	 */
	List<String> productStoreSurveyAppls();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SurveyResponse' route='surveyId'"
	 * @generated
	 */
	List<String> surveyResponses();

} // Survey