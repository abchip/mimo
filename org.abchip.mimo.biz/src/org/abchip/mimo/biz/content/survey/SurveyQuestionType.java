/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.survey;

import java.util.List;

import org.abchip.mimo.biz.BizEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey Question Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyQuestionType#getSurveyQuestionTypeId <em>Survey Question Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.survey.SurveyQuestionType#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestionType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface SurveyQuestionType extends BizEntityType<SurveyQuestion> {
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
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestionType_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyQuestionType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SurveyQuestion' route='surveyQuestionTypeId'"
	 * @generated
	 */
	List<String> surveyQuestions();

	/**
	 * Returns the value of the '<em><b>Survey Question Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Question Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Question Type Id</em>' attribute.
	 * @see #setSurveyQuestionTypeId(String)
	 * @see org.abchip.mimo.biz.content.survey.SurveyPackage#getSurveyQuestionType_SurveyQuestionTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getSurveyQuestionTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.content.survey.SurveyQuestionType#getSurveyQuestionTypeId <em>Survey Question Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Question Type Id</em>' attribute.
	 * @see #getSurveyQuestionTypeId()
	 * @generated
	 */
	void setSurveyQuestionTypeId(String value);

} // SurveyQuestionType
