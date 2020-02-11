/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.survey;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.content.survey.SurveyPackage
 * @generated
 */
public interface SurveyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SurveyFactory eINSTANCE = org.abchip.mimo.biz.content.survey.impl.SurveyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Survey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Survey</em>'.
	 * @generated
	 */
	Survey createSurvey();

	/**
	 * Returns a new object of class '<em>Appl Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appl Type</em>'.
	 * @generated
	 */
	SurveyApplType createSurveyApplType();

	/**
	 * Returns a new object of class '<em>Multi Resp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Resp</em>'.
	 * @generated
	 */
	SurveyMultiResp createSurveyMultiResp();

	/**
	 * Returns a new object of class '<em>Multi Resp Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Resp Column</em>'.
	 * @generated
	 */
	SurveyMultiRespColumn createSurveyMultiRespColumn();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	SurveyPage createSurveyPage();

	/**
	 * Returns a new object of class '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question</em>'.
	 * @generated
	 */
	SurveyQuestion createSurveyQuestion();

	/**
	 * Returns a new object of class '<em>Question Appl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Appl</em>'.
	 * @generated
	 */
	SurveyQuestionAppl createSurveyQuestionAppl();

	/**
	 * Returns a new object of class '<em>Question Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Category</em>'.
	 * @generated
	 */
	SurveyQuestionCategory createSurveyQuestionCategory();

	/**
	 * Returns a new object of class '<em>Question Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Option</em>'.
	 * @generated
	 */
	SurveyQuestionOption createSurveyQuestionOption();

	/**
	 * Returns a new object of class '<em>Question Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Type</em>'.
	 * @generated
	 */
	SurveyQuestionType createSurveyQuestionType();

	/**
	 * Returns a new object of class '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response</em>'.
	 * @generated
	 */
	SurveyResponse createSurveyResponse();

	/**
	 * Returns a new object of class '<em>Response Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Answer</em>'.
	 * @generated
	 */
	SurveyResponseAnswer createSurveyResponseAnswer();

	/**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
	SurveyTrigger createSurveyTrigger();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SurveyPackage getSurveyPackage();

} //SurveyFactory
