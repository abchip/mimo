/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.survey.impl;

import org.abchip.mimo.biz.content.survey.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SurveyFactoryImpl extends EFactoryImpl implements SurveyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SurveyFactory init() {
		try {
			SurveyFactory theSurveyFactory = (SurveyFactory)EPackage.Registry.INSTANCE.getEFactory(SurveyPackage.eNS_URI);
			if (theSurveyFactory != null) {
				return theSurveyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SurveyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SurveyPackage.SURVEY: return (EObject)createSurvey();
			case SurveyPackage.SURVEY_APPL_TYPE: return (EObject)createSurveyApplType();
			case SurveyPackage.SURVEY_MULTI_RESP: return (EObject)createSurveyMultiResp();
			case SurveyPackage.SURVEY_MULTI_RESP_COLUMN: return (EObject)createSurveyMultiRespColumn();
			case SurveyPackage.SURVEY_PAGE: return (EObject)createSurveyPage();
			case SurveyPackage.SURVEY_QUESTION: return (EObject)createSurveyQuestion();
			case SurveyPackage.SURVEY_QUESTION_APPL: return (EObject)createSurveyQuestionAppl();
			case SurveyPackage.SURVEY_QUESTION_CATEGORY: return (EObject)createSurveyQuestionCategory();
			case SurveyPackage.SURVEY_QUESTION_OPTION: return (EObject)createSurveyQuestionOption();
			case SurveyPackage.SURVEY_QUESTION_TYPE: return (EObject)createSurveyQuestionType();
			case SurveyPackage.SURVEY_RESPONSE: return (EObject)createSurveyResponse();
			case SurveyPackage.SURVEY_RESPONSE_ANSWER: return (EObject)createSurveyResponseAnswer();
			case SurveyPackage.SURVEY_TRIGGER: return (EObject)createSurveyTrigger();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Survey createSurvey() {
		SurveyImpl survey = new SurveyImpl();
		return survey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyApplType createSurveyApplType() {
		SurveyApplTypeImpl surveyApplType = new SurveyApplTypeImpl();
		return surveyApplType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyMultiResp createSurveyMultiResp() {
		SurveyMultiRespImpl surveyMultiResp = new SurveyMultiRespImpl();
		return surveyMultiResp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyMultiRespColumn createSurveyMultiRespColumn() {
		SurveyMultiRespColumnImpl surveyMultiRespColumn = new SurveyMultiRespColumnImpl();
		return surveyMultiRespColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyPage createSurveyPage() {
		SurveyPageImpl surveyPage = new SurveyPageImpl();
		return surveyPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyQuestion createSurveyQuestion() {
		SurveyQuestionImpl surveyQuestion = new SurveyQuestionImpl();
		return surveyQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyQuestionAppl createSurveyQuestionAppl() {
		SurveyQuestionApplImpl surveyQuestionAppl = new SurveyQuestionApplImpl();
		return surveyQuestionAppl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyQuestionCategory createSurveyQuestionCategory() {
		SurveyQuestionCategoryImpl surveyQuestionCategory = new SurveyQuestionCategoryImpl();
		return surveyQuestionCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyQuestionOption createSurveyQuestionOption() {
		SurveyQuestionOptionImpl surveyQuestionOption = new SurveyQuestionOptionImpl();
		return surveyQuestionOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyQuestionType createSurveyQuestionType() {
		SurveyQuestionTypeImpl surveyQuestionType = new SurveyQuestionTypeImpl();
		return surveyQuestionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyResponse createSurveyResponse() {
		SurveyResponseImpl surveyResponse = new SurveyResponseImpl();
		return surveyResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyResponseAnswer createSurveyResponseAnswer() {
		SurveyResponseAnswerImpl surveyResponseAnswer = new SurveyResponseAnswerImpl();
		return surveyResponseAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyTrigger createSurveyTrigger() {
		SurveyTriggerImpl surveyTrigger = new SurveyTriggerImpl();
		return surveyTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyPackage getSurveyPackage() {
		return (SurveyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SurveyPackage getPackage() {
		return SurveyPackage.eINSTANCE;
	}

} //SurveyFactoryImpl
